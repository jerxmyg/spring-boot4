# Spring Boot 4 — Practice Project 💪🏽

A hands-on practice project built while working through the Spring Boot 4.x stack.
The goal is to get comfortable with the full development loop before applying these
patterns to a more complex project.

## What this covers

- Building REST APIs with Spring Boot 4 and Spring MVC
- Connecting to a PostgreSQL database running in Docker
- Mapping Java classes to database tables with Spring Data JPA
- Structuring a backend project with a Controller → Service → Repository pattern
- Local development environment setup with IntelliJ, Maven, and Docker Compose

## Tech stack

| Layer | Technology |
|---|---|
| Language | Java 21 |
| Framework | Spring Boot 4.1.0 |
| Database | PostgreSQL (Docker) |
| ORM | Spring Data JPA |
| Build tool | Maven |
| IDE | IntelliJ IDEA |

## Running locally

Start the database:
```bash
docker-compose up -d
```

Run the application:
```bash
./mvnw spring-boot:run
```

## Status

Work in progress — actively being built out.
