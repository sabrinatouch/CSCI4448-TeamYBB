/**
 * Credit to: https://pusher.com/tutorials/consume-restful-api-react
 */

import React, { Component } from 'react';
import Link from '@material-ui/core/Link';
import { makeStyles } from '@material-ui/core/styles';
import Table from '@material-ui/core/Table';
import TableBody from '@material-ui/core/TableBody';
import TableCell from '@material-ui/core/TableCell';
import TableHead from '@material-ui/core/TableHead';
import TableRow from '@material-ui/core/TableRow';
import Title from './Title';
import PopupForm from './PopupForm';
import DeleteJobButton from './DeleteJobButton';
import EditJobButton from './EditJobButton';
import Button from '@material-ui/core/Button';

import axios from 'axios';

// Generate Data
function createData(id, status, date, company, position, type) {
  return { id, status, date, company, position, type };
}

function preventDefault(event) {
  event.preventDefault();
}

const useStyles = makeStyles((theme) => ({
  root: {
    '& > span': {
      margin: theme.spacing(2),
    },
  },
}));

export default class JobTable extends Component{
  constructor(props) {
    super(props)
      this.state = {
        id: '',
        status: '',
        date: '',
        company: '',
        position: '',
        type: '',
        displayQuery: []
      }

      this.onDelete = this.onDelete.bind(this);
      this.onEdit = this.onEdit.bind(this);
  }

  componentDidMount() {
    fetch('http://localhost:8080/get-jobs')

      .then(res => res.json())
      .then((data) => {
        var objs = data.map(x => 
            createData(x[0], x[1], x[2], x[3], x[4], x[5])
        )
        this.setState({ displayQuery: objs })
      })

      .catch(console.log)
  }

  onDelete(e, id) {
    e.preventDefault();
    
    axios.delete('http://localhost:8080/delete-job/' + id)

    console.log("onDelete clicked")
    console.log(id)
  }

  onEdit(e) {
    e.preventDefault();

    //axios.put('http://localhost:8080/edit-job', entry)

    console.log("onEdit clicked")
  }

  render() {
  return (
    <React.Fragment>
      <Title>My List</Title>
      <Table size="small">
        <TableHead>
          <TableRow>
            <TableCell>ID</TableCell>
            <TableCell>Status</TableCell>
            <TableCell>Date</TableCell>
            <TableCell>Company</TableCell>
            <TableCell>Position</TableCell>
            <TableCell>Type</TableCell>
          </TableRow>
        </TableHead>
        <TableBody>
          {this.state.displayQuery.map((row) => (
            <TableRow>
              <TableCell>{row.id}</TableCell>
              <TableCell>{row.status}</TableCell>
              <TableCell>{row.date}</TableCell>
              <TableCell>{row.company}</TableCell>
              <TableCell>{row.position}</TableCell>
              <TableCell>{row.type}</TableCell>
              <Button onClick={this.onEdit} color="default" variant="contained">
                Edit
              </Button>
              <Button onClick={((e) => this.onDelete(e, row.id))} color="secondary" variant="contained">
                Delete
              </Button>
            </TableRow>
          ))}
        </TableBody>
      </Table>
      <div align="right">
        <PopupForm />
      </div>
    </React.Fragment>
  );
  }
}