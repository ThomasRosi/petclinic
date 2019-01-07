import React, { Component } from 'react';
import axios from 'axios'
import { Grid, Row } from 'react-bootstrap';
import Vet from './Vet'

export default class Vets extends Component {

  state = { vets: [] }

  getVets = async () => {
    const response = await axios.get('http://localhost:8080/api/v1/vets')
    return await response
  }

  setVets = () => {
    this.getVets().then((response) => {
      let vets = []
      response.data.forEach(vet => {
        vets.push(<Vet key={vet.lastName} {...vet}/>)
      })
      this.setState({vets})
    })
  }

  componentWillMount(){
    this.setVets()
  }

  render() {
    return (
      <Grid>
        <Row className="show-grid text-center">
          {this.state.vets}
        </Row>
      </Grid>
    )
  }
  
}
