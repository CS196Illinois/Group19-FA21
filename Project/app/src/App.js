import React from "react";
// import { Route, Routes } from 'react-router-dom';

// const history = useHistory();

//   const routeChange = () =>{ 
//     let path = `\App2.js`; 
//     gonk.history.push(path);
//   }


function clickMe() {
  alert('You clicked me');
}
export default function App() {
    return (
        <div style={{ position: 'absolute', left: '50%', top: '50%',
        transform: 'translate(-50%, -50%)'}}>
          <h1>
            Choose Style
          </h1>
          <button onClick = {clickMe}>
            Fancy
          </button>
          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
          <button onClick = {clickMe}>
            Cheap
          </button>
        </div>
    )
}