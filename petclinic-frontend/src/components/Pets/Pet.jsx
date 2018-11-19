import React from 'react'
import { Jumbotron, Col } from 'react-bootstrap';

const Pet = ({name, birthDay, species, client}) => {
  return (
      <Col xs={12} sm={4} className="person-wrapper">
        <Jumbotron>
          {(function() {
            switch(species) {
              case "Chien" :
                return <img src="assets/dog.png" alt="Dog"/>;
              case "Chat" :
                return <img src="assets/cat.png" alt="Cat"/>;
              case "Cheval" :
                return <img src="assets/horse.png" alt="Horse"/>;
              default:
                return <img src="assets/pawprint.png" alt="Animal"/>;
            }
          })()}
          <div>
            <h3>{name}</h3>
            <h4>{species}</h4>
            <div>{birthDay}</div>
            <div>{client.firstName + ' ' + client.lastName}</div>
          </div>
        </Jumbotron>
      </Col>
  )
}

export default Pet
