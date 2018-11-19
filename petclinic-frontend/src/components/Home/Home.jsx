import React, { Component } from 'react';
import { Jumbotron, Grid } from 'react-bootstrap';
import './Home.css';

export default class Home extends Component {
  render() {
    return (
      <Grid>
        <Jumbotron>
          <h2>Welcome in PetClinic</h2>
          <h3>Description :</h3>
          <p>School project created to learn good architecture and some technologies (Java, Spring, Gradle, React).</p>
          <h3>Contributors :</h3>
          <ul>
            <li><a href="https://github.com/Loukourou">Guillaume Isembaert</a></li>
            <li><a href="https://github.com/thib050697">Thibault Stevanoni</a></li>
            <li><a href="https://github.com/ThomasRosi">Thomas Rosi</a></li>
            <li><a href="https://github.com/Dexnaw">Arnaud Urbain</a></li>
          </ul>
        </Jumbotron>
      </Grid>
    )
  }
}
