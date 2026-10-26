# Contracts

Machine-readable contracts, written before the code that implements them (REQ-API-01).

| Path | What |
|---|---|
| `openapi/common.yaml` | Shared OpenAPI 3.1 components: Problem Details and error codes, commands and idempotency, cursor pagination, Money, GeoPoint, 202 operations, standard error responses, bearer scheme |
| `openapi/auth.v1.yaml` | Phone sign-in by one-time code, token refresh, logout |
| `openapi/rider.v1.yaml`, `openapi/driver.v1.yaml` | Rider and driver app APIs (`/api/{audience}/v1`) |
| `openapi/<audience>.v1.yaml` | One document per audience (`auth`, `rider`, `driver`, `operator`, `admin`, later `partner`), added slice by slice |
| `events/` | JSON Schemas of events; `envelope.schema.json` wraps every event (REQ-NTF-04) |

Audience documents reference shared parts as `common.yaml#/components/...`.

## Rules

- Paths `/api/{audience}/v1/...`; state changes are named commands with `command_id` and `expected_version`, never a PATCH of `status`.
- snake_case fields, UTC timestamps, money as `amount_minor` + `currency`.
- A breaking change gets a new major version; additions stay optional (REQ-EXC-15).

## Lint

```bash
scripts/contracts-lint.sh
```

Runs Redocly on the OpenAPI documents and validates every event schema against its examples.
