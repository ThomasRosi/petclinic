import React, { Component } from 'react';
import './App.css';
import { BrowserRouter as Router, Route } from 'react-router-dom';
import Home from './components/Home/Home';
import Vets from './components/Vets/Vets';
import Pets from './components/Pets/Pets';
import Clients from './components/Clients/Clients';
import Navbar from './components/Navbar/Navbar';

class App extends Component {
  render() {
    return (
      <Router>
        <div>
          <Navbar />
          <Route exact path="/" component={Home} />
          <Route path="/Vets" component={Vets} />
          <Route path="/Pets" component={Pets} />
          <Route path="/Clients" component={Clients} />
        </div>
      </Router>
    )
  }
}

export default App;
