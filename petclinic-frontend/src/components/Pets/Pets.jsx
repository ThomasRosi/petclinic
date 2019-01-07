import React, { Component } from 'react';
import axios from 'axios'
import { Grid, Row } from 'react-bootstrap';
import Pet from './Pet'

export default class Pets extends Component {

  state = { pets: [] }

  getPets = async () => {
    const response = await axios.get('http://localhost:8080/api/v1/pets')
    return await response
  }

  setPets = () => {
    this.getPets().then((response) => {
      let pets = []
      response.data.forEach(pet => {
        pets.push(<Pet key={pet.name + pet.species} {...pet}/>)
      })
      this.setState({pets})
    })
  }

  componentWillMount(){
    this.setPets()
  }

  render() {
    return (
      <Grid>
        <Row className="show-grid text-center">
          {this.state.pets}
        </Row>
      </Grid>
    )
  }

}
