from flask import Flask
from flask_cors import CORS

app = Flask(__name__)
cors = CORS(app)

@app.route('/fibonacci')


def fibonacci_of():
    return 1