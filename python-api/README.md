# Simple Python API #

## Local Setup ##

* Install Anaconda
* conda env create -n py37 python=3.7
* condo activate py37
* pip3 install --file requirements.txt
* python app.py


## API Endpoints ##

* http://127.0.0.1:7002
* http://127.0.0.1:7002/users
* http://127.0.0.1:7002/users/bchan


## Docker Setup ##

* docker build -t simple-polyglot-python-api:latest .
* docker run -d -p 7002:7002 simple-polyglot-python-api
* docker ps -a
