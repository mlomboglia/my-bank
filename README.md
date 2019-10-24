# Spring Boot, H2, JPA, Rest API Tutorial

Build Restful CRUD API for a simple bank application using Spring Boot, H2 and JPA.

## Requirements

1. Java - 1.8.x

2. Maven - 3.x.x

## Setup

**1. Clone the application**

```bash
git clone git@github.com:mlomboglia/my-bank.git
```

**2. Build and run the app using maven**

```bash
mvn spring-boot:run
```

The app will start running at <http://localhost:8080>.

## Explore Rest APIs

The app defines following CRUD APIs.

    GET /accounts/all
    
    GET /accounts/{id}
    
    POST /accounts/new
    
    PUT /accounts/{id}
      Param: double amount

You can test them using postman or any other rest client.

## Learn more

https://medium.com/@mlombog/lets-create-a-crud-rest-api-with-spring-boot-jpa-and-h2-fc070006e654

