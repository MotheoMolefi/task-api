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

### Create Task
POST /tasks

```json
{
  "title": "Go gym",
  "description": "Leg day"
}
```

### Get All Tasks
GET /tasks

### Get Task by ID
GET /tasks/{id}

### Update Task
PUT /tasks/{id}

```json
{
  "title": "Go gym",
  "description": "Leg day",
  "status": "COMPLETED"
}
```

### Delete Task
DELETE /tasks/{id}

## Filtering Tasks by Status

You can filter tasks using a query parameter:

GET /tasks?status=COMPLETED

### Example Response:
```json
[
  {
    "id": 1,
    "title": "Go to gym",
    "description": "Chest day",
    "status": "COMPLETED",
    "createdDate": "2026-03-22T18:03:02.111719"
  }
]
```

### Supported statuses:
- NEW
- IN_PROGRESS
- COMPLETED

## Notes
- Uses an in-memory H2 database
- Data resets when the app restarts
