let express = require('express');
let logger = require('morgan');
let cookieParser = require('cookie-parser');
let bodyParser = require('body-parser');

// Routes
let routes = require('./routes');

let app = express();

app.use(logger('dev'));

// Enable parsing of posted forms
app.use(bodyParser.json());
app.use(bodyParser.urlencoded({
    extended: false
}));
app.use(cookieParser());

app.use('/', routes);

module.exports = app;
