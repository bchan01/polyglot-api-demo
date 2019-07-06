# Polyglot API Demo #

![alt text](polyglot-image.png)

The puspose of this project is to demonstrate how to implement a RESTful API in multiple languages. Currently, this API supports a few simple GET endpoints.   Features to be Implemented in the future are:

* logging
* Middleware (handle request, response and error)
* Security (ie JWT)

## RESTful API Implemented in Multiple Languages ##

* Go 
* Node.js (Express)
* Python (Flask)
* Java (Spring Boot)


# API Endpoints #

* curl http://localhost:PORT

```
{
    "message": "Hello Node.js"
}
```

* curl http://localhost:PORT/users
```
[
    {
        "username": "bchan",
        "firstName": "Brian",
        "lastName": "Chan"
    },
    {
        "username": "rfederer",
        "firstName": "Roger",
        "lastName": "Federer"
    }
]
```

* curl http://localhost:PORT/users/bchan

```
{
    "username": "bchan",
    "firstName": "Brian",
    "lastName": "Chan"
}
```
