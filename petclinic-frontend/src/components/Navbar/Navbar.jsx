import React, { Component } from 'react';
import { Navbar, Nav, NavItem } from 'react-bootstrap';
import { Link } from 'react-router-dom';
import './Navbar.css';

export default class Menu extends Component {
  render() {
    return (
      <Navbar default collapseOnSelect>
        <Navbar.Header>
          <Navbar.Brand>
            <Link to="/">
              PetClinic
            </Link>
          </Navbar.Brand>
          <Navbar.Toggle />
        </Navbar.Header>
        <Navbar.Collapse>
          <Nav pullRight>
            <NavItem eventKey={1} componentClass={Link} href="/" to="/">
              Home
            </NavItem>
            <NavItem eventKey={2} componentClass={Link} href="/vets" to="/vets">
              Vets
            </NavItem>
            <NavItem eventKey={3} componentClass={Link} href="/pets" to="/pets">
              Pets
            </NavItem>
            <NavItem eventKey={4} componentClass={Link} href="/clients" to="/clients">
              Clients
            </NavItem>
            <NavItem eventKey={5} componentClass={Link} href="/appointments" to="/appointments">
              Appointments
            </NavItem>
          </Nav>
        </Navbar.Collapse>
      </Navbar>
    )
  }
}
