# Polyglot API Demo #

![alt text](polyglot-image.png)

The puspose of this project is to demonstrate how to implement a RESTful API in multiple languages. Currently, this API supports a few simple GET endpoints. 

## Language Specific Projects ##

Each of the following projects can be run in a docker container

* [Go](go-api/)
* [Node (Express)](node-api/)
* [Python (Flask)](python-api/)
* [Java (SpringBoot)](java-api/)

## Future Considerations ##

* Logging
* Middleware (handle request, response and error)
* Security (ie JWT)
* Unit Tests
* Integration Tests

## API Endpoints ##

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
