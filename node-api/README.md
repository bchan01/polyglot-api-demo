# Simple Node API #

![alt text](logo.png)

## Local Setup ##

* Install Node
* npm install
* npm start

## API Endpoints ##

* http://localhost:7001
* http://localhost:7001/users
* http://localhost:7001/users/bchan

## Docker Setup ##

* docker build -t simple-polyglot-node-api:latest --no-cache .
* docker run -d -p 7001:7001 simple-polyglot-node-api
* docker ps -a
