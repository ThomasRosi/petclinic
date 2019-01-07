import React, { Component } from 'react';
import axios from 'axios'
import { Grid, Row } from 'react-bootstrap';
import Client from './Client'

export default class Clients extends Component {

  state = { pets: [] }

  getClients = async () => {
    const response = await axios.get('http://localhost:8080/api/v1/clients')
    return await response
  }

  setClients = () => {
    this.getClients().then((response) => {
      let clients = []
      response.data.forEach(client => {
        clients.push(<Client key={client.lastName} {...client}/>)
      })
      this.setState({clients})
    })
  }

  componentWillMount(){
    this.setClients()
  }

  render() {
    return (
      <Grid>
        <Row className="show-grid text-center">
          {this.state.clients}
        </Row>
      </Grid>
    )
  }

}
