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

import axios from 'axios';

// Generate Data
function createData(status, date, company, position, type) {
  return { status, date, company, position, type };
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

export default class Table extends Component{
  //const classes = useStyles();

  state = {
    displayQuery: []
  }

  componentDidMount() {
    fetch('http://localhost:8080/get-jobs')

      .then(res => res.json())
      .then((data) => {
        var objs = data.map(x => 
            createData(x[0], x[1], x[2], x[3], x[4])
        )
        this.setState({ displayQuery: objs })
      })

      .catch(console.log)
  }

  render() {
  return (
    <React.Fragment>
      <Title>My List</Title>
      <Table size="small">
        <TableHead>
          <TableRow>
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
              <TableCell>{row.status}</TableCell>
              <TableCell>{row.date}</TableCell>
              <TableCell>{row.company}</TableCell>
              <TableCell>{row.position}</TableCell>
              <TableCell>{row.type}</TableCell>
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