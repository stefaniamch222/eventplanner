📅 Event Planner REST API

RESTful backend developed in Java and Spring Boot for managing events, proposing dates/times, and collecting participant availability.

🛠️ Tech Stack
Java: JDK 25
Framework: Spring Boot 3 (Spring Web, Spring Data JPA, Validation)
Database: H2 (In-Memory Database for development)
Build Tool: Maven
Testing: JUnit 5, Mockito, MockMvc
Documentation: OpenAPI / Swagger UI
🏗️ Project Architecture

The project follows a decoupled and maintainable three-layer architecture:

Controller Layer (REST Endpoints & Validation)
└── Service Layer (Business Logic)
└── Repository Layer (Spring Data JPA)
└── Database (H2 In-Memory)

DTOs (Data Transfer Objects): Implemented to decouple the database layer from the network layer.
Global Exception Handling: Centralized error handling using @RestControllerAdvice.
🚀 How to Run the Project
Requirements
JDK 25
Maven
Build and Run
Run the build and tests:
.\mvnw clean test
