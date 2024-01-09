# Spring Boot JPA + H2 Example

A simple Spring Boot application demonstrating CRUD Rest APIs using JPA and an H2 in-memory database.

## Table of Contents
- [Overview](#overview)
- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
- [API Endpoints](#api-endpoints)
- [Testing](#testing)
- [License](#license)

## Overview

This project showcases the implementation of CRUD operations for tutorials using Spring Boot, JPA, and an H2 in-memory database. It includes RESTful APIs for managing tutorials and corresponding integration tests.

## Prerequisites

- Java 17
- Maven
- Your favorite IDE (optional)

## Getting Started

1. Clone the repository:
   ```bash
   git clone https://github.com/bezkoder/spring-boot-jpa-h2.git

2. Build and run the application:
   ```bash
   mvn spring-boot:run

## API Endpoints

- GET /api/tutorials: Get all tutorials.
- GET /api/tutorials/{id}: Get tutorial by ID.
- POST /api/tutorials: Create a new tutorial.
- PUT /api/tutorials/{id}: Update tutorial by ID.
- DELETE /api/tutorials/{id}: Delete tutorial by ID.
- DELETE /api/tutorials: Delete all tutorials.
- GET /api/tutorials/published: Get all published tutorials.

## Testing

The project includes unit tests and integration tests. You can run the tests using:
    ```bash
    mvn test 

## License

This project is licensed under the MIT License.
