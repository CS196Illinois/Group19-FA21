import './App.css';
import React from "react";
import axios from "axios";

// Test extends React.Component which gives Test access to React and its functions
export default class Test extends React.Component {
  // this constructor initializes values, it operates like in any language you've learned before.
  // I've initialized the state here but the state could also be empty.
  // the state stores properties related to Test
  // keep the 'props' statements: they are parameters from react
  constructor(props) {
    super(props);
    this.state = { val: 365 };
  }
  // this is a function that sets val in state
  fib = () => {
    // api to get the flask function that returns a string
    axios.get(`http://127.0.0.1:5000/fibonacci`).then((res) => {
      this.setState({ val: res.data });
    });
  };

  render() {
    return (
      <div>
        <h1>{this.state.val}</h1>
        <button className="button" onClick={this.fib}>
          Display Fibonacci
        </button>
      </div>
    );
  }
}
// this "exports" the component so it displays on your localhost
// ReactDOM.render(<Test />, document.getElementById("root"));


