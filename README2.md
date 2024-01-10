# Spring Boot JPA + H2 Documentation

Welcome to the canonical documentation for the Spring Boot JPA + H2 example project. This documentation provides a comprehensive guide on how to use, configure, and contribute to this project.

## Overview

This project demonstrates a Spring Boot application that performs CRUD operations using JPA with an H2 in-memory database. It exposes a set of RESTful API endpoints for managing tutorials.

## Table of Contents

1. [Getting Started](#getting-started)
2. [API Endpoints](#api-endpoints)
3. [Testing](#testing)
4. [Configuration](#configuration)
5. [Contribution](#contribution)
6. [License](#license)

## Getting Started

To set up and run the project on your local machine, follow these steps:

1. Clone the repository:

   ```bash
   git clone https://github.com/bezkoder/spring-boot-jpa-h2.git
   ```

2. Navigate to the project directory:

   ```bash
   cd spring-boot-jpa-h2
   ```

3. Build and run the application:

   ```bash
   mvn spring-boot:run
   ```

   The application will be accessible at `http://localhost:8080`.

## API Endpoints

The project exposes the following API endpoints:

- **GET /api/tutorials**: Get all tutorials.
- **GET /api/tutorials/{id}**: Get tutorial by ID.
- **POST /api/tutorials**: Create a new tutorial.
- **PUT /api/tutorials/{id}**: Update tutorial by ID.
- **DELETE /api/tutorials/{id}**: Delete tutorial by ID.
- **DELETE /api/tutorials**: Delete all tutorials.
- **GET /api/tutorials/published**: Get all published tutorials.

For more details on each endpoint, refer to the [TutorialController](src/main/java/com/bezkoder/spring/jpa/h2/controller/TutorialController.java).

## Testing

The project includes unit tests and integration tests. Run the tests using:

```bash
mvn test
```

## Configuration

The application is configured with an H2 in-memory database. Configuration settings can be found in the `application.properties` file. Additional logging configurations are specified in the `log4j2.xml` file.


## License

This project is licensed under the [MIT License](LICENSE). Feel free to use, modify, and distribute the code.