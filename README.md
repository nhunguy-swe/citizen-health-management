# Citizen Health Management System

<p>
  <img src="https://img.shields.io/badge/Java-17%2B-orange" alt="Java">
  <img src="https://img.shields.io/badge/Spring%20Boot-Backend-6DB33F?logo=spring-boot&logoColor=white" alt="Spring Boot">
  <img src="https://img.shields.io/badge/Build-Maven-blue" alt="Maven">
</p>

A system for managing citizens' health records, built with **Spring Boot** and managed with **Maven** (Maven Wrapper). Includes ready-to-use SQL scripts in the `database/` folder.

---

## About

This project simulates the workflow of managing citizen health records within a community/local area: storing personal information, medical history, and past examination/treatment records. It is intended for learning and hands-on practice in building a backend with the Spring Boot architecture (Controller – Service – Repository – Entity) alongside a relational database.

> Note: the feature list below is a draft based on the project name and structure. Please adjust it to match what is actually implemented in `src/main`.

---

## Features (draft — adjust to match your code)

- Manage citizen profiles (personal info, national ID)
- Record health information and medical history
- Track examination/treatment history
- Search and look up records by criteria

---

## Tech Stack

| Component | Technology |
|---|---|
| Language | Java 17+ |
| Framework | Spring Boot |
| Database | SQL scripts in the `database/` folder |
| Build tool | Maven (Maven Wrapper `mvnw` / `mvnw.cmd`) |

---

## Project Structure

```
citizen-health-management/
├── .mvn/wrapper/         # Maven Wrapper configuration
├── database/               # SQL scripts to initialize the database
├── src/main/                 # Main source code (Controller, Service, Repository, Entity...)
├── mvnw / mvnw.cmd              # Maven Wrapper script (Linux/macOS & Windows)
├── pom.xml                        # Maven configuration and dependencies
├── .gitignore
└── README.md
```

---

## Getting Started

### Requirements

- JDK 17+
- MySQL/PostgreSQL (or the DB matching the scripts in `database/`)
- IDE: IntelliJ IDEA / VS Code / Eclipse

### Installation

```bash
git clone https://github.com/nhunguy-swe/citizen-health-management.git
cd citizen-health-management
```

### Database Setup

1. Run the SQL scripts in the `database/` folder to create tables and sample data.
2. Update the connection info in `src/main/resources/application.properties` (or `.yml`).

> ⚠️ **Security note:** don't hard-code the database password directly in a `.properties` file if you plan to push to a public GitHub repo. Use environment variables or a separate config file added to `.gitignore` instead.

### Running the Application

```bash
# macOS/Linux
./mvnw spring-boot:run

# Windows
mvnw.cmd spring-boot:run
```

By default, Spring Boot runs at `http://localhost:8080`.

---

## Author

- GitHub: [@nhunguy-swe](https://github.com/nhunguy-swe)

---

## License

Created for learning/practice purposes. Feel free to reference the code for study.
