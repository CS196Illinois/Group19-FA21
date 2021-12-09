from flask import Flask
from flask import Flask, request
from flask_cors import CORS

app = Flask(__name__)
cors = CORS(app)

@app.route('/fibonacci')


def fibonacci_of():
    n = 1

    if not (isinstance(n, int) and n >= 0):
        raise ValueError(f'Positive integer number expected, got "{n}"')

    if n in {0, 1}:
        return n

    previous, fib_number = 0, 1
    for i in range(2, n + 1):
        previous, fib_number = fib_number, previous + fib_number

    return fib_number
