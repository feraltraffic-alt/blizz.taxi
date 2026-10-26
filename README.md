# Blizz Taxi

A ride-hailing platform in the Bolt / Uber model. One software core is supplied to independent taxi services, each running it under its own brand. "Blizz Taxi" is the working name of the network (final name: Q-13).

**Source of requirements:** [`docs/spec/Taxi_Platform_Detailed_Specification_v0.2.md`](docs/spec/Taxi_Platform_Detailed_Specification_v0.2.md) (in Russian). Requirements marked **B** are approved; **D** are proposed detail; **Q-xx** are open decisions. This README does not override the specification.

## Model

- **Service** — an independent operator with its own clients, drivers, apps, settings and finances.
- **Instance** — an isolated installation of the platform for one service. Databases, users, secrets, merchants and files never cross instances (REQ-TEN-01).
- **Partner** — another service with an order-exchange agreement (M2).
- **Franchisor** — owner of the network and the central directory / royalty module (M2). It does not collect passenger profiles (REQ-NET-03).

The launch market, city, currency and languages are confirmed in Q-01.

## Applications

| Path | What | Stack |
|---|---|---|
| `server/` | Backend, modular monolith | Java, Spring, Maven |
| `apps/rider/` | Passenger app | React Native |
| `apps/driver/` | Driver app | React Native |
| `apps/admin/` | Admin panel, support, finance | React |
| `apps/operator/` | Dispatcher / call-centre workstation | React |
| `packages/contracts/` | OpenAPI 3.1, JSON Schema / AsyncAPI | — |
| `packages/api-client/` | Client types and transport generated from contracts | TypeScript |
| `packages/localization/` | Shared UI strings and formats | — |
| `deploy/` | Deployment, backup and restore | — |
| `docs/` | Specification, decisions, runbooks | — |
| `scripts/` | Build and utility scripts; CI only calls these | — |

Web apps can be shipped separately or packaged into the server jar; this is a delivery choice, not a business requirement (REQ-ENG-10).

## Users

Four separate root tables, no shared `app_user` (section 36, approved):

| Table | Who |
|---|---|
| `staff_user` | SUPER_ADMIN, ADMIN, OPERATOR, plus support / finance permissions |
| `client` | Passengers |
| `driver` | Drivers |
| `partner` | Partner taxi services in the exchange |

## Integrations

Every external provider sits behind its own interface; the providers below are initial candidates, confirmed by contract and sandbox testing.

| Area | Candidate | Open question |
|---|---|---|
| Payments | WayForPay | Q-09 |
| Routing | GraphHopper | — |
| Geocoding / maps | Google, Visicom, MapLibre | Q-08 — caching only within provider terms |
| SMS / OTP | TurboSMS; voice code | Q-18 |
| Fiscal receipts | Вчасно.Каса, behind `FiscalProvider` | Q-05 — legal seller not yet fixed |
| Telephony | Self-hosted Asterisk | Q-18 |

## Milestones

- **M1** — one service in one city, end to end: rider, driver, dispatcher, admin, cash and card.
- **M2** — partner order exchange and the central network module.
- **M3** — further development.

Implementation slices S-01 … S-15 are listed in section 29 of the specification.

## Building

Build logic lives in Maven, npm and `scripts/`, so every step can be run locally with the same commands CI uses. Commands are added with each application (REQ-ENG-12).
