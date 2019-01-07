import React, { Component } from 'react';
import axios from 'axios'
import { Grid, Row } from 'react-bootstrap';
import Appointment from './Appointment'

export default class Appointments extends Component{

    state = { appointments: [] }

    getAppointments = async () => {
        const response = await axios.get('http://localhost:8080/api/v1/appointments')
        return await response
    }

    setAppointments = () => {
        this.getAppointments().then((response) => {
            let appointments = []
            response.data.forEach( appointment => {
                appointments.push(<Appointment key={appointment.pet.name + appointment.pet.species} {...appointment} />)
            })
            this.setState({appointments})
        })
    }

    componentWillMount() {
            this.setAppointments()
    }

    render() {
        return (
            <Grid>
                <Row className="show-grid text-center">
                    {this.state.appointments}
                </Row>
            </Grid>
        )
    }

}