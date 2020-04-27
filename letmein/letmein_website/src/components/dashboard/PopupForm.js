import React from 'react';
import Button from '@material-ui/core/Button';
import TextField from '@material-ui/core/TextField';
import Dialog from '@material-ui/core/Dialog';
import DialogActions from '@material-ui/core/DialogActions';
import DialogContent from '@material-ui/core/DialogContent';
import DialogContentText from '@material-ui/core/DialogContentText';
import DialogTitle from '@material-ui/core/DialogTitle';

import axios from 'axios';

export default class FormDialog extends React.Component {
  constructor(props) {
    super(props)
      this.state = {
        status: '',
        date: '',
        company: '',
        position: '',
        type: '', 
        isOpen: false,
      }

      this.handleStatusChange = this.handleStatusChange.bind(this);
      this.handleDateChange = this.handleDateChange.bind(this);
      this.handleCompanyChange = this.handleCompanyChange.bind(this);
      this.handlePositionChange = this.handlePositionChange.bind(this);
      this.handleTypeChange = this.handleTypeChange.bind(this);
      this.handleClickOpen = this.handleClickOpen.bind(this);
      this.handleClose = this.handleClose.bind(this);
      this.onSubmit = this.onSubmit.bind(this);
  }

  handleStatusChange(e) {
    this.setState({ status: e.target.value })
  }

  handleDateChange(e) {
    this.setState({ date: e.target.value })
  }

  handleCompanyChange(e) {
    this.setState({ company: e.target.value })
  }

  handlePositionChange(e) {
    this.setState({ position: e.target.value })
  }

  handleTypeChange(e) {
    this.setState({ type: e.target.value })
  }

  handleClickOpen(e) {
    this.setState({ isOpen: true })
  }

  handleClose(e) {
    this.setState({ isOpen: false })
  }

  onSubmit(e) {
    e.preventDefault(); // Cancels the default action. Performing only this action. (i.e. preventing from button spamming)

    const entry = {
      "status": this.state.status,
      "date": this.state.date,
      "company": this.state.company,
      "position": this.state.position,
      "type": this.state.type,
    }

    axios.post('http://localhost:8080/add-job', entry)

    this.handleClose()
    console.log("onSubmit clicked")
  }

  render () {
    return (
      <div>
        <Button variant="contained" color="primary" onClick={this.handleClickOpen}>
          Add New Entry
        </Button>
        <Dialog open={this.state.isOpen} onClose={this.handleClose} aria-labelledby="form-dialog-title">
          <DialogTitle id="form-dialog-title">Add New Entry</DialogTitle>
          <DialogContent>
              <TextField
                  margin="normal"
                  id="status"
                  label="Status"
                  inputMode="text"
                  onChange={this.handleStatusChange}
                  fullWidth
              />
              <TextField 
                  margin="normal"
                  id="date"
                  label="Date"
                  type="date"
                  inputMode="text"
                  onChange={this.handleDateChange}
                  InputLabelProps={{ shrink: true }}
                  fullWidth
              />
              <TextField 
                  margin="normal"
                  id="company"
                  label="Company"
                  inputMode="text"
                  onChange={this.handleCompanyChange}
              fullWidth
              />
              <TextField 
                  margin="normal"
                  id="position"
                  label="Position"
                  inputMode="text"
                  onChange={this.handlePositionChange}
              fullWidth
              />
              <TextField 
                  margin="normal"
                  id="type"
                  label="Type"
                  inputMode="text"
                  onChange={this.handleTypeChange}
              fullWidth
              />
          </DialogContent>
          <DialogActions>
            <Button onClick={this.handleClose} color="primary">
              Cancel
            </Button>
            <Button onClick={this.onSubmit} color="primary">
              Submit
            </Button>
          </DialogActions>
        </Dialog>
      </div>
    );
  }
}
