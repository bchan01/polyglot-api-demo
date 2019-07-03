from flask import Flask, jsonify, abort, make_response

app = Flask(__name__)

users = [
    {
        'username': "bchan",
        'firstName': 'Brian',
        'lastName': 'Chan'
    },
    {
        'username': "rfederer",
        'firstName': 'Roger',
        'lastName': 'Federer'
    }
]

# Error Response
@app.errorhandler(404)
def not_found(error):
    return make_response(jsonify({'error': 'Not found'}), 404)


@app.route('/')
def home():
    return jsonify({"message" : "Hello Python"})

@app.route('/users', methods=['GET'])
def get_users():
    return jsonify(users)

@app.route('/users/<string:username>', methods=['GET'])
def get_user(username):
    user = [user for user in users if user['username'] == username]
    if len(user) == 0:
        abort(404)
    return jsonify(user[0])

if __name__ == '__main__':
    app.run(port=7002, host='0.0.0.0')
