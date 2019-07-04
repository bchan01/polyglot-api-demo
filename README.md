# Polyglot API Demo #

![alt text](polyglot-image.png)

Demonstrate how to implement a simple API in multiple languages

* Node.js (Express)
* Python (Flask)
* Java (Spring Boot)


# API Endpoints #

* http://localhost:PORT

```
{
    "message": "Hello Node.js"
}
```

* http://localhost:PORT/users
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

* http://localhost:PORT/users/bchan

```
{
    "username": "bchan",
    "firstName": "Brian",
    "lastName": "Chan"
}
```
