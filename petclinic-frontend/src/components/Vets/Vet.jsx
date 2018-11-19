import React from 'react'
import { Jumbotron, Col } from 'react-bootstrap';

const Vet = ({lastName, firstName, specialty}) => {
  return (
      <Col xs={12} sm={4} className="person-wrapper">
        <Jumbotron>
          <img src="assets/doctor.png" alt="List vets"/>
          <div>
            <h3>{lastName + ' ' + firstName}</h3>
            <h4>{specialty}</h4>
          </div>
        </Jumbotron>
      </Col>
  )
}

export default Vet
