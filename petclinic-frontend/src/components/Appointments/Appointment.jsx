import React from 'react'
import {Jumbotron, Col} from 'react-bootstrap';

const Appointment = ({appointment_id, pet, vet, visit_date, visit_duration, description}) => {

    return (
            <Col xs={12} sm={4} className="person-wrapper">
                <Jumbotron>
                    <div>
                        <h3>{visit_date + ' (' + visit_duration + ' min)'}</h3>
                        <br/>
                    </div>
                    {(function () {
                        switch (pet.species) {
                            case "Chien" :
                                return <img src="assets/dog.png" alt="Dog"/>;
                            case "Chat" :
                                return <img src="assets/cat.png" alt="Cat"/>;
                            default:
                                return <img src="assets/pawprint.png" alt="Animal"/>;
                        }
                    })()}
                    <div>
                        <h4>{pet.name}</h4>
                        <h4>{description}</h4>
                        <h5>{'Vétérinaire : ' + vet.firstName + ' ' + vet.lastName}</h5>
                        <h5>{'Client : ' + pet.client.firstName + ' ' + pet.client.lastName}</h5>
                        <h5>{'Race : ' + pet.species}</h5>
                        {/*<div>{appointment_id}</div>*/}
                    </div>
                </Jumbotron>

            </Col>
    )
}

export default Appointment