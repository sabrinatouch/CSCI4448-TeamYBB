import React, { Component } from 'react';
import Table from '@material-ui/core/Table';
import TableBody from '@material-ui/core/TableBody';
import TableCell from '@material-ui/core/TableCell';
import TableHead from '@material-ui/core/TableHead';
import TableRow from '@material-ui/core/TableRow';
import Title from './Title';
import PopupForm from './PopupForm';
import Button from '@material-ui/core/Button';
import EditForm from './EditForm';

import axios from 'axios';

// Generate and consolidate data
function createData(id, status, date, company, position, type) {
  return { id, status, date, company, position, type };
}

// Prevents spamming of a button
function preventDefault(event) {
  event.preventDefault();
}

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
  }

  /**
   * Credit to consume restful API in React: 
   * https://pusher.com/tutorials/consume-restful-api-react
   */
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

  // Make API call for Delete action
  onDelete(e, id) {
    e.preventDefault();
    
    axios.delete('http://localhost:8080/delete-job/' + id)

    console.log("onDelete clicked")
    console.log(id)
  }

  // Renders table of entries
  // Displays Edit, Delete, and Add Entry buttons
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
              <EditForm row={row}/>
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