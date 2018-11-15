import React from 'react'
import { Jumbotron, Grid, Row, Col, Image, Button } from 'react-bootstrap';

const Vet = ({last_name, first_name, specialty}) => {
  return (
      <Col xs={6} sm={3} className="person-wrapper">
        <Jumbotron>
          <img src="assets/doctor.png" alt="List vets"/>
          <div>
            <h3>{last_name + ' ' + first_name}</h3>
            <h4>{specialty}</h4>
          </div>
        </Jumbotron>
      </Col>
  )
}

export default Vet
