import React, { useState, useEffect } from 'react';
import axios from 'axios';
import logo from './logo.svg';
import './App.css';

function App() {

  useEffect(() => {
    axios.get('/api/member')
      .then(res => {
        console.log(res.data)
        setList(res.data)
      })
  }, [])

  const [list, setList] = useState({})

  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <ul>
          {
            Object.values(list).map(function(item) {
              return (
                <li>{item.name}</li>
              ) 
            })
          }
        </ul>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
      </header>
    </div>
  );
}

export default App;
