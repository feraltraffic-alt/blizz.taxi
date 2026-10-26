# Blizz Taxi

A ride-hailing software platform in the class of Bolt and Uklon, built for Poland and Ukraine and sold to taxi services as a **franchise** (under the blizz.taxi brand) or as a **white-label** product under the client's own brand.

## Business model

- **Franchise** — services operate under the Blizz Taxi brand. Royalties are calculated automatically by the platform.
- **White-label** — clients run the platform under their own name, logo and colours. There are no Blizz brand standards to follow.
- **Each service is independent.** Every franchisee or white-label client has its own apps, its own cities and its own client base. There is no shared Blizz app: a rider registers separately with each service, and the same person can be a client of two services.
- **The franchisor stores no client data.** Client bases live on each service's side.
- **Several services can operate in one city.** The order exchange connects them and passes orders between partner servers.
- **Cities are polygons.** A service can operate in many cities; the app detects which city the rider is in.

## Applications

| Application | Path | Stack | Users |
|---|---|---|---|
| Backend | `backend/` | Java, Spring Boot, Maven | — |
| Admin panel | `web/admin/` | React | Service owners and staff |
| Operator CRM | `web/operator/` | React | Call-centre operators taking phone orders |
| Rider app | `mobile/rider/` | React Native | Passengers |
| Driver app | `mobile/driver/` | React Native | Drivers |

The backend, admin panel and operator CRM are packaged together as **one deployable jar**.

## Key features

- Orders from the rider app and by phone through the call-centre operator.
- Orders no driver has accepted go to every driver's **"ALL"** tab; the first driver to accept gets the order.
- Order exchange between partner servers.
- Royalty calculation for franchisees.
- Interface languages: English, Ukrainian, Russian.

## Integrations

Each integration sits behind an interface so more providers can be added later.

| Area | Initial provider |
|---|---|
| Payments | WayForPay (multiple merchants) |
| Routing | GraphHopper |
| Geocoding | Google, Visicom (results cached in the database to avoid repeat paid calls) |
| SMS / OTP | TurboSMS; one-time codes by voice call |
| Fiscal receipts | Вчасно.Каса — the seller on the receipt is the driver (sole proprietor), not the taxi service |
| Telephony | Self-hosted Asterisk |

## Deployment

- Every client runs its own instance, hosted in a datacentre in its own region.
- **Standard** — fault-tolerant setup.
- **Budget** — everything on a single VPS, no S3, no fault tolerance.
- Our DevOps team maintains the instance fleet.

## Repository layout

```
backend/          Spring Boot backend (Maven); builds the single deployable jar
web/admin/        React admin panel
web/operator/     React operator CRM (call centre)
mobile/rider/     React Native rider app
mobile/driver/    React Native driver app
docs/             Specification, UI references, architecture notes
infra/            Deployment and server configuration
scripts/          Build and utility scripts (CI only calls these)
```

## Building

Build logic lives in Maven, npm and `scripts/`, so everything can be run locally with the same commands CI uses. Instructions will be added as each application is set up.
