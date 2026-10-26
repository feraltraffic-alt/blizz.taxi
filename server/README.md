# Server

Java / Spring Boot backend, Maven, modular monolith (REQ-ENG-01, REQ-ENG-03). Versions: [`docs/decisions/0001-stack-versions.md`](../docs/decisions/0001-stack-versions.md).

## Requirements

- JDK 25
- Maven 3.9+
- Docker (local PostgreSQL / PostGIS and Redis)

## Run locally

```bash
scripts/dev-infra-up.sh   # PostgreSQL 18 + PostGIS 3.6, Redis
scripts/server-build.sh   # compile and run tests
cd server && mvn spring-boot:run
```

Health check: `http://localhost:8080/actuator/health`.

## Modules

Each direct sub-package of `taxi.blizz` is an application module; boundaries and cycles are checked by `ModularityTests` on every build (REQ-ENG-04).

| Module | Scope |
|---|---|
| `configuration` | Instance and service configuration, brand |
| `identity` | `staff_user`, `client`, `driver`, `partner` subjects; OTP, sessions, roles |
| `geo` | Cities, zones, addresses, routing, geocoding |
| `driver` | Driver profiles, vehicles, documents, verification |
| `operations` | Orders, dispatch, offers, assignments, trips, work sessions |
| `pricing` | Tariffs, quotes, final fares |
| `finance` | Payments, obligations, ledger, refunds, payouts |
| `location` | GPS ingestion and tracks |
| `notification` | Push, SMS, WebSocket |
| `telephony` | Asterisk, call records |
| `backoffice` | Support cases, problem queues |
| `audit` | Audit log |
| `files` | File storage and scanning |
| `partner` | Partner order exchange (M2) |

## Database

Schema changes go only through Flyway migrations in `src/main/resources/db/migration`; Hibernate runs with `ddl-auto=validate` (REQ-DATA-12).
