# Task API

## Overview
A simple REST API for managing tasks built with Spring Boot.

## Tech Stack
- Java 17
- Spring Boot
- Spring Data JPA
- H2 Database

## How to Run
1. Clone the repository
2. Run the application:  
   ./mvnw spring-boot:run

3. The app runs on:  
   http://localhost:8080

## API Endpoints
- POST /tasks
- GET /tasks
- GET /tasks/{id}
- PUT /tasks/{id}
- DELETE /tasks/{id}

## Example Request

POST /tasks

```json
{
  "title": "Go gym",
  "description": "Leg day"
}
```

## Notes
- Uses an in-memory H2 database
- Data resets when the app restarts  
