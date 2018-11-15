import React, { Component } from 'react';
import { Link } from 'react-router-dom';
import { Jumbotron, Grid, Row, Col, Image, Button } from 'react-bootstrap';
import './Home.css';

export default class Home extends Component {
  render() {
    return (
      <Grid>
        <Jumbotron>
          <h2>Welcome in petclinic</h2>
          <p>This is how to build a website with react, react-router & react-bootstrap</p>
        </Jumbotron>
      </Grid>
    )
  }
}
