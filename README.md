# cinemadb-api

A simple and scalable REST API for managing movies, built with Spring Boot. Inspired by OMDb, this project serves as a hands-on introduction to REST API development in Java.

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
git clone https://github.com/your-username/cinemadb-api.git

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
- [ ] GET all movies
- [ ] GET movie by ID
- [ ] POST create a new movie
- [ ] PUT update a movie
- [ ] DELETE a movie
- [ ] Connect to a persistent database (PostgreSQL)
