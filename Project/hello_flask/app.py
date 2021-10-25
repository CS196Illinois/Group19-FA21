from flask import Flask
app = Flask(__name__)

@app.route("/")
def home():
    return "Finally, Flask!"

def create_app():
    app = Flask(__name__)
    app.config['SECRET_KEY'] = 'CS196 Group 19'

    return app
    
