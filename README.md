# cinemadb-api

A simple and scalable REST API for managing movies, built with Spring Boot. Inspired by OMDb, this project serves as a hands-on introduction to backend development with Java.

---

## Tech Stack

- **Java 21** (Amazon Corretto)
- **Spring Boot 4.0.4**
- **Spring Web** — RESTful endpoints
- **Spring Data JPA** — ORM and database abstraction
- **PostgreSQL** — Persistent relational database
- **Hibernate** — JPA implementation
- **Swagger / OpenAPI** — Auto-generated API documentation
- **Docker & Docker Compose** — Containerization
- **Maven** — Dependency management

---

## Running Locally

### Option 1 — Docker Compose (Recommended)

#### Prerequisites
- Docker installed and running
- Docker Compose installed

#### Steps

```bash
# Clone the repository
git clone https://github.com/AnthonyRodriguez0506/cinemadb-api.git

# Navigate into the project
cd cinemadb-api

# Copy the example config and fill in your values
cp src/main/resources/application.yaml.example src/main/resources/application.yaml

# Create your .env file with your credentials
cp .env.example .env

# Build and start all services (API + PostgreSQL)
docker compose up
```

The API will be available at `http://localhost:8080`

---

### Option 2 — Manual Setup

#### Prerequisites
- Java 21 installed
- PostgreSQL installed and running
- Maven installed (or use the included `mvnw` wrapper)

#### Steps

```bash
# Clone the repository
git clone https://github.com/AnthonyRodriguez0506/cinemadb-api.git

# Navigate into the project
cd cinemadb-api

# Copy and configure the application.yaml
cp src/main/resources/application.yaml.example src/main/resources/application.yaml
# Edit application.yaml with your PostgreSQL credentials

# Run the application
./mvnw spring-boot:run
```

The API will be available at `http://localhost:8080`

---

## Environment Variables

Create a `.env` file in the root of the project with the following variables:

```env
DB_NAME=cinemadb
DB_USER=your_username
DB_PASSWORD=your_password
```

---

## API Endpoints

Base URL: `http://localhost:8080`

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/movies` | Get all movies |
| GET | `/movies/{id}` | Get a movie by ID |
| POST | `/movies` | Create a new movie |
| PUT | `/movies/{id}` | Update an existing movie |
| DELETE | `/movies/{id}` | Delete a movie by ID |

### Example Request Body (POST / PUT)

```json
{
  "title": "Inception",
  "year": 2010,
  "duration": 148,
  "rating": 8.8,
  "director": "Christopher Nolan"
}
```

---

## API Documentation (Swagger)

Once the application is running, access the interactive API documentation at:

```
http://localhost:8080/swagger-ui/index.html
```

---

## Roadmap

- [x] Project initialization with Spring Boot
- [x] Movie model (title, year, duration, rating, director)
- [x] GET all movies
- [x] GET movie by ID
- [x] POST create a new movie
- [x] PUT update a movie
- [x] DELETE a movie with error handling
- [x] Connect to a persistent database (PostgreSQL)
- [x] API documentation with Swagger
- [x] Dockerize the application

---

## Author

**Anthony Rodriguez** — [@AnthonyRodriguez0506](https://github.com/AnthonyRodriguez0506)
