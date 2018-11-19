import React from 'react'
import { Jumbotron, Col } from 'react-bootstrap';

const Client = ({lastName, firstName, address, city, telephone}) => {
  return (
      <Col xs={12} sm={4} className="person-wrapper">
        <Jumbotron>
          <img src="assets/client.png" alt="Client"/>
          <div>
            <h3>{lastName + ' ' + firstName}</h3>
            <h4>{telephone}</h4>
            <div>{address}</div>
            <div>{city}</div>
          </div>
        </Jumbotron>
      </Col>
  )
}

export default Client
