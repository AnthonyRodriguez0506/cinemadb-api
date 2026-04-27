# cinemadb-api

A simple and scalable REST API for managing movies, built with Spring Boot. Inspired by OMDb.

---

## Tech Stack

- **Java 21**
- **Spring Boot 4.0.4**
- **Spring Web** — RESTful endpoints
- **H2 Database** — In-memory database for development
- **Maven** — Dependency management

---

## Running Locally

### Prerequisites
- Java 21 installed
- Maven installed (or use the included `mvnw` wrapper)

### Steps

```bash
# Clone the repository
git clone https://github.com/AnthonyRodriguez0506/cinemadb-api.git

# Navigate into the project
cd cinemadb-api

# Run the application
./mvnw spring-boot:run
```

The API will be available at `http://localhost:8080`

---

## Roadmap

- [x] Project initialization with Spring Boot
- [X] Movie model (title, year, genre, director)
- [X] GET all movies
- [X] GET movie by ID
- [X] POST create a new movie
- [X] PUT update a movie
- [X] DELETE a movie
- [ ] Connect to PostgreSQL for production
- [ ] Dockerize the application
