# DBnomics Batch

[![CI](https://github.com/<ton-user>/dbnomics-batch/actions/workflows/ci.yml/badge.svg)](https://github.com/<ton-user>/dbnomics-batch/actions/workflows/ci.yml)

Spring Batch application that ingests a dataset from [DBnomics](https://db.nomics.world), applies transformations and loads the result into PostgreSQL, using two processing approaches:

- **Sequential**: items are read, transformed and written one by one (one transaction per item).
- **Chunk**: items are read and transformed one by one, then written in batches (one transaction per chunk).

The goal is to compare both approaches on the same dataset and the same business rules.

> Work in progress — see the [CHANGELOG](CHANGELOG.md) for delivered milestones.

## Tech stack

- Java 21
- Spring Boot 4.2 / Spring Batch 6
- PostgreSQL 17, Flyway
- Docker Compose, Testcontainers
- GitHub Actions

## Getting started

### Prerequisites

- JDK 21
- Docker

### Run locally

```bash
cp .env.example .env
docker compose up -d
./mvnw spring-boot:run
```

On Windows, use `mvnw.cmd` instead of `./mvnw`.

The application starts on `http://localhost:8080`. Health check: `http://localhost:8080/actuator/health`.

### Run the tests

```bash
./mvnw verify
```

Integration tests start a disposable PostgreSQL 17 container with Testcontainers: Docker must be running.

## Dataset

_To be documented._

## Architecture

_To be documented._

## Sequential vs Chunk — results

_To be documented._