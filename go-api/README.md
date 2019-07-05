# Simple Go API #

![alt text](logo.png)

## Local Setup ##

* Install Go
* Setup Go Path
* go get github.com/gorilla/mux
* go build main.go
* ./main

## API Endpoints ##

* http://localhost:7004
* http://localhost:7004/users
* http://localhost:7004/users/bchan

## Docker Setup ##

* docker build -t simple-polyglot-go-api:latest --no-cache .
* docker run -d -p 7004:7004 simple-polyglot-go-api
* docker ps -a
