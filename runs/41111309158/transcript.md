# Sandbox transcript (2026-10-30T18:58:59Z, d385a90)

# Scenario: admission-cities

## Only Andrii is online in Kyiv for this scenario

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-20140"
}
```

```json
{
  "challenge_id": "4da426b1-a233-4696-ab83-6f0c147252d9",
  "expires_at": "2026-10-30T19:03:59.364645952Z",
  "resend_available_at": "2026-10-30T18:59:00.364645952Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "395038",
  "sent_at": "2026-10-30T18:58:59.378217894Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4da426b1-a233-4696-ab83-6f0c147252d9",
  "code": "395038",
  "device_ref": "sandbox-20140"
}
```

```json
{
  "session_id": "be6c74b6-dd16-4e4d-aa34-f4d83ec48057",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4NzY0NiwiaWF0IjoxNzkzMzg2NzQ2LCJqdGkiOiI5YzUzOGYxZS03Nzg4LTRkN2YtYjAyZi01MzU5NGJjZjIwZGEiLCJzaWQiOiJiZTZjNzRiNi1kZDE2LTRlNGQtYWEzNC1mNGQ4M2VjNDgwNTcifQ.6ToqxA3ErooymrvKxQh7WhGWglcvxPHuGapynXajDSk",
  "access_expires_at": "2026-10-30T19:14:06.959883018Z",
  "refresh_token": "GKKxIGbD6BiLqmNx0eA-FS3-WCATtV5PKrqHU5v0Ed0",
  "refresh_expires_at": "2026-11-29T18:59:06.956096175Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": null,
  "session_version": 0,
  "session_state": "CLOSED",
  "intent": null,
  "connection": "DISCONNECTED",
  "geolocation": "UNAVAILABLE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": null,
  "vehicle_id": null,
  "last_heartbeat_at": null,
  "last_location_at": null,
  "eligible": false,
  "ineligible_reasons": [
    "NO_OPEN_SESSION"
  ]
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-16035"
}
```

```json
{
  "challenge_id": "3fe36f5b-d06c-4f26-a7f0-9073301ad87f",
  "expires_at": "2026-10-30T19:04:07.494450191Z",
  "resend_available_at": "2026-10-30T18:59:08.494450191Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "208600",
  "sent_at": "2026-10-30T18:59:07.498748383Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3fe36f5b-d06c-4f26-a7f0-9073301ad87f",
  "code": "208600",
  "device_ref": "sandbox-16035"
}
```

```json
{
  "session_id": "c6eb3949-eed2-4f23-9c8d-26d138f7a105",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4NzY0OCwiaWF0IjoxNzkzMzg2NzQ4LCJqdGkiOiJjMzFkZDY3MS03MjAyLTQwOGEtODY4My0wMWQyYmQxZWUyOWMiLCJzaWQiOiJjNmViMzk0OS1lZWQyLTRmMjMtOWM4ZC0yNmQxMzhmN2ExMDUifQ.Y6y6J2HmsQAEhrfae8jEbTEPixU2fnDcqq5RHBBUSE4",
  "access_expires_at": "2026-10-30T19:14:08.030187913Z",
  "refresh_token": "ZR_v8op6xpoH5VZ1YNzuGKFtd2PGrQ4SYGxge3xCXLc",
  "refresh_expires_at": "2026-11-29T18:59:08.029170153Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": null,
  "session_version": 0,
  "session_state": "CLOSED",
  "intent": null,
  "connection": "DISCONNECTED",
  "geolocation": "UNAVAILABLE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": null,
  "vehicle_id": null,
  "last_heartbeat_at": null,
  "last_location_at": null,
  "eligible": false,
  "ineligible_reasons": [
    "NO_OPEN_SESSION"
  ]
}
```

`POST /auth/v1/staff/sign-in` → **401**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "instance": "/auth/v1/staff/sign-in",
  "status": 401,
  "title": "Unauthenticated",
  "type": "https://errors.blizz.taxi/unauthenticated",
  "code": "UNAUTHENTICATED",
  "correlation_id": "2dd031f7-b89c-4f44-866c-7a02f52329e8"
}
```

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "cdce198b-b3b5-484b-b4a2-83d37f00b9a0",
  "subject": {
    "type": "STAFF",
    "id": "50e6407f-123d-42ca-9890-64ec61c07dce"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MGU2NDA3Zi0xMjNkLTQyY2EtOTg5MC02NGVjNjFjMDdkY2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODc2NDksImlhdCI6MTc5MzM4Njc0OSwianRpIjoiODczOGJiZGEtMTJmMC00ZWI0LThhMmEtMWI4NTMyMWViYzYxIiwic2lkIjoiY2RjZTE5OGItYjNiNS00ODRiLWI0YTItODNkMzdmMDBiOWEwIn0.9ZS_6SzFezR-BySe6sW6KwXS9SWHX6e8SDdKpBqFrFE",
  "access_expires_at": "2026-10-30T19:14:09.305660952Z",
  "refresh_token": "I955HeVsuyrr93utwfmNHlTOsv62mk3tP0Z4W8GNnlU",
  "refresh_expires_at": "2026-10-31T06:59:09.304796983Z",
  "password_change_required": true
}
```

`POST /api/admin/v1/me/password` → **204**

```json
{
  "current_password": "Sandbox-Admin-2026",
  "new_password": "Sandbox-Admin-2026-ok"
}
```

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "63d3118f-40f3-4858-8567-2b01aa04dcbf",
  "subject": {
    "type": "STAFF",
    "id": "50e6407f-123d-42ca-9890-64ec61c07dce"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MGU2NDA3Zi0xMjNkLTQyY2EtOTg5MC02NGVjNjFjMDdkY2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODc2NTAsImlhdCI6MTc5MzM4Njc1MCwianRpIjoiNDcwOWFlYjktODg1My00NWFhLTg2YjMtNzdiMTFjYmNhY2Y5Iiwic2lkIjoiNjNkMzExOGYtNDBmMy00ODU4LTg1NjctMmIwMWFhMDRkY2JmIn0.-7bSRzBHlsaldPzWtCiq_S5IY7BhJBLOjNTqSpG8GT8",
  "access_expires_at": "2026-10-30T19:14:10.879313969Z",
  "refresh_token": "JhMjCEnQJmtePTTK5c7r89nnNYMn2xGaIWpmanp9U1M",
  "refresh_expires_at": "2026-10-31T06:59:10.878432253Z",
  "password_change_required": false
}
```

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "OPERATOR",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "3c681315-de80-42a9-b7ba-3a4844dab6be",
  "subject": {
    "type": "STAFF",
    "id": "50e6407f-123d-42ca-9890-64ec61c07dce"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MGU2NDA3Zi0xMjNkLTQyY2EtOTg5MC02NGVjNjFjMDdkY2UiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODc2NTEsImlhdCI6MTc5MzM4Njc1MSwianRpIjoiZTc4MjUwZGMtNDZhOC00YWFiLThmZjAtYjQyYmM2NTVhNmI3Iiwic2lkIjoiM2M2ODEzMTUtZGU4MC00MmE5LWI3YmEtM2E0ODQ0ZGFiNmJlIn0.wD1OErkCQySFl4-8OoOitrMHy4ufJAW9T40uJtpUAmE",
  "access_expires_at": "2026-10-30T19:14:11.380750535Z",
  "refresh_token": "Pg9KdK9pVm4ar-_3MowGid9wC7UiAXHarClO-veIiGY",
  "refresh_expires_at": "2026-10-31T06:59:11.380006707Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-4272"
}
```

```json
{
  "challenge_id": "45194034-865d-4731-9ac9-90ef62f49a7d",
  "expires_at": "2026-10-30T19:04:11.613622394Z",
  "resend_available_at": "2026-10-30T18:59:12.613622394Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "592582",
  "sent_at": "2026-10-30T18:59:11.627987324Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "45194034-865d-4731-9ac9-90ef62f49a7d",
  "code": "592582",
  "device_ref": "sandbox-4272"
}
```

```json
{
  "session_id": "13410e09-8d5c-4086-a3fa-36661aed2c10",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4NzY1MSwiaWF0IjoxNzkzMzg2NzUxLCJqdGkiOiI3MzAwNmE2MC1mNjEzLTQxMjYtYjBkOC05ODJkZjkzM2YwZTEiLCJzaWQiOiIxMzQxMGUwOS04ZDVjLTQwODYtYTNmYS0zNjY2MWFlZDJjMTAifQ.UCp42j5YYIg-puyFJkjc2APeC0_7GD6nmScjKE11qgw",
  "access_expires_at": "2026-10-30T19:14:11.89133073Z",
  "refresh_token": "CRHCp3nABC3SnnAYXFKYqHbHoFnkXeGpq_AgOJ_WRZI",
  "refresh_expires_at": "2026-11-29T18:59:11.89063219Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": null,
  "session_version": 0,
  "session_state": "CLOSED",
  "intent": null,
  "connection": "DISCONNECTED",
  "geolocation": "UNAVAILABLE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": null,
  "vehicle_id": null,
  "last_heartbeat_at": null,
  "last_location_at": null,
  "eligible": false,
  "ineligible_reasons": [
    "NO_OPEN_SESSION"
  ]
}
```

## E1: admitted only in Warsaw, Andrii cannot go online in Kyiv

`GET /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403` → **200**

```json
{
  "profile": {
    "id": "5a000000-0000-4000-8000-000000000403",
    "account_state": "ACTIVE",
    "name": "Андрій Шевчук",
    "language": "ru",
    "review_status": "APPROVED",
    "version": 1,
    "has_payment_terminal": false,
    "admission_city_ids": [
      "5a000000-0000-4000-8000-000000000001"
    ],
    "vehicles": [
      {
        "id": "5a000000-0000-4000-8000-000000000503",
        "registration_number": "AA0003TX",
        "make": "Hyundai",
        "model": "Sonata",
        "color": "black",
        "production_year": 2022,
        "state": "APPROVED",
        "class_approvals": [
          "STANDARD",
          "COMFORT"
        ]
      }
    ],
    "documents": []
  },
  "phone": "+380500000003",
  "history": [],
  "duplicates": []
}
```

`PUT /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/admission-cities` → **200**

```json
{
  "command_id": "5193e63c-7104-4c64-ab2a-42b2aaf30b3b",
  "expected_version": 1,
  "city_ids": [
    "5a000000-0000-4000-8000-000000000002"
  ],
  "reason": "Moved to the Warsaw office"
}
```

```json
{
  "id": "5a000000-0000-4000-8000-000000000403",
  "account_state": "ACTIVE",
  "name": "Андрій Шевчук",
  "language": "ru",
  "review_status": "APPROVED",
  "version": 2,
  "has_payment_terminal": false,
  "admission_city_ids": [
    "5a000000-0000-4000-8000-000000000002"
  ],
  "vehicles": [
    {
      "id": "5a000000-0000-4000-8000-000000000503",
      "registration_number": "AA0003TX",
      "make": "Hyundai",
      "model": "Sonata",
      "color": "black",
      "production_year": 2022,
      "state": "APPROVED",
      "class_approvals": [
        "STANDARD",
        "COMFORT"
      ]
    }
  ],
  "documents": []
}
```

`POST /api/driver/v1/work-sessions` → **409**

```json
{
  "command_id": "cf2421d3-90b0-498d-96a6-bbc3e0a7b7c3",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4528,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T18:59:13Z",
    "sequence": 1793386753329
  }
}
```

```json
{
  "instance": "/api/driver/v1/work-sessions",
  "status": 409,
  "title": "Driver not eligible",
  "type": "https://errors.blizz.taxi/driver-not-eligible",
  "code": "DRIVER_NOT_ELIGIBLE",
  "correlation_id": "b148c2b8-432d-47db-bfef-b9c40b1b2294"
}
```

## Back in Kyiv he goes online; then he is taken off Kyiv while online

`GET /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403` → **200**

```json
{
  "profile": {
    "id": "5a000000-0000-4000-8000-000000000403",
    "account_state": "ACTIVE",
    "name": "Андрій Шевчук",
    "language": "ru",
    "review_status": "APPROVED",
    "version": 2,
    "has_payment_terminal": false,
    "admission_city_ids": [
      "5a000000-0000-4000-8000-000000000002"
    ],
    "vehicles": [
      {
        "id": "5a000000-0000-4000-8000-000000000503",
        "registration_number": "AA0003TX",
        "make": "Hyundai",
        "model": "Sonata",
        "color": "black",
        "production_year": 2022,
        "state": "APPROVED",
        "class_approvals": [
          "STANDARD",
          "COMFORT"
        ]
      }
    ],
    "documents": []
  },
  "phone": "+380500000003",
  "history": [],
  "duplicates": []
}
```

`PUT /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/admission-cities` → **200**

```json
{
  "command_id": "24d3cc5f-16b4-49ab-b124-ee516010f845",
  "expected_version": 2,
  "city_ids": [
    "5a000000-0000-4000-8000-000000000001"
  ],
  "reason": "Back in Kyiv"
}
```

```json
{
  "id": "5a000000-0000-4000-8000-000000000403",
  "account_state": "ACTIVE",
  "name": "Андрій Шевчук",
  "language": "ru",
  "review_status": "APPROVED",
  "version": 3,
  "has_payment_terminal": false,
  "admission_city_ids": [
    "5a000000-0000-4000-8000-000000000001"
  ],
  "vehicles": [
    {
      "id": "5a000000-0000-4000-8000-000000000503",
      "registration_number": "AA0003TX",
      "make": "Hyundai",
      "model": "Sonata",
      "color": "black",
      "production_year": 2022,
      "state": "APPROVED",
      "class_approvals": [
        "STANDARD",
        "COMFORT"
      ]
    }
  ],
  "documents": []
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": null,
  "session_version": 0,
  "session_state": "CLOSED",
  "intent": null,
  "connection": "DISCONNECTED",
  "geolocation": "UNAVAILABLE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": null,
  "vehicle_id": null,
  "last_heartbeat_at": null,
  "last_location_at": null,
  "eligible": false,
  "ineligible_reasons": [
    "NO_OPEN_SESSION"
  ]
}
```

`POST /api/driver/v1/work-sessions` → **201**

```json
{
  "command_id": "78533793-6c8d-4c9e-ae66-117c993b8153",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4528,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T18:59:14Z",
    "sequence": 1793386754144
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "70f77a7b-6e5e-4eca-ac37-fa38f22a0e2e",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "last_heartbeat_at": "2026-10-30T18:59:14.164966Z",
  "last_location_at": "2026-10-30T18:59:14.164966Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403` → **200**

```json
{
  "profile": {
    "id": "5a000000-0000-4000-8000-000000000403",
    "account_state": "ACTIVE",
    "name": "Андрій Шевчук",
    "language": "ru",
    "review_status": "APPROVED",
    "version": 3,
    "has_payment_terminal": false,
    "admission_city_ids": [
      "5a000000-0000-4000-8000-000000000001"
    ],
    "vehicles": [
      {
        "id": "5a000000-0000-4000-8000-000000000503",
        "registration_number": "AA0003TX",
        "make": "Hyundai",
        "model": "Sonata",
        "color": "black",
        "production_year": 2022,
        "state": "APPROVED",
        "class_approvals": [
          "STANDARD",
          "COMFORT"
        ]
      }
    ],
    "documents": []
  },
  "phone": "+380500000003",
  "history": [],
  "duplicates": []
}
```

`PUT /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/admission-cities` → **200**

```json
{
  "command_id": "26e59f6a-be85-4b01-bd54-90da454ba864",
  "expected_version": 3,
  "city_ids": [
    "5a000000-0000-4000-8000-000000000002"
  ],
  "reason": "Kyiv licence suspended for a check"
}
```

```json
{
  "id": "5a000000-0000-4000-8000-000000000403",
  "account_state": "ACTIVE",
  "name": "Андрій Шевчук",
  "language": "ru",
  "review_status": "APPROVED",
  "version": 4,
  "has_payment_terminal": false,
  "admission_city_ids": [
    "5a000000-0000-4000-8000-000000000002"
  ],
  "vehicles": [
    {
      "id": "5a000000-0000-4000-8000-000000000503",
      "registration_number": "AA0003TX",
      "make": "Hyundai",
      "model": "Sonata",
      "color": "black",
      "production_year": 2022,
      "state": "APPROVED",
      "class_approvals": [
        "STANDARD",
        "COMFORT"
      ]
    }
  ],
  "documents": []
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "70f77a7b-6e5e-4eca-ac37-fa38f22a0e2e",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "last_heartbeat_at": "2026-10-30T18:59:14.164966Z",
  "last_location_at": "2026-10-30T18:59:14.164966Z",
  "eligible": false,
  "ineligible_reasons": [
    "ADMISSION_CITY"
  ]
}
```

## A rider orders 300 m from him: no offer, not in his ALL tab, a claim is refused

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380688767317",
  "device_ref": "sandbox-31559"
}
```

```json
{
  "challenge_id": "1d6d38a4-9ce3-404e-b50d-fc7663d7e2db",
  "expires_at": "2026-10-30T19:04:15.156607129Z",
  "resend_available_at": "2026-10-30T18:59:16.156607129Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380688767317` → **200**

```json
{
  "phone": "+380688767317",
  "audience": "CLIENT",
  "code": "160786",
  "sent_at": "2026-10-30T18:59:15.160192993Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1d6d38a4-9ce3-404e-b50d-fc7663d7e2db",
  "code": "160786",
  "device_ref": "sandbox-31559"
}
```

```json
{
  "session_id": "2e6089e9-43f2-463c-bb65-d07b315a4cf5",
  "subject": {
    "type": "CLIENT",
    "id": "fd3de0c2-c44a-4812-b41c-039f2e7c9724"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZDNkZTBjMi1jNDRhLTQ4MTItYjQxYy0wMzlmMmU3Yzk3MjQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzg3NjU1LCJpYXQiOjE3OTMzODY3NTUsImp0aSI6ImJmZmFmNTc5LTRlNjUtNDIxNS1hMTU1LWNiZmUwMDdlZWM3ZiIsInNpZCI6IjJlNjA4OWU5LTQzZjItNDYzYy1iYjY1LWQwN2IzMTVhNGNmNSJ9.2h0sEGLjf1DF44fM88l3gJcRGINdsjoy-aSKdpA-A-o",
  "access_expires_at": "2026-10-30T19:14:15.476202973Z",
  "refresh_token": "RqEmrM0XLRlvzpvPI-AdtkXGUKi0jlJORiS_BNz67vM",
  "refresh_expires_at": "2026-11-29T18:59:15.475478232Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "543814a5-a809-4cfd-8af9-5f71ca74e5da",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  }
}
```

```json
{
  "id": "64d95283-0eec-4f09-ab2d-e7f094930edc",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T19:04:15.737743Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false,
  "discount_minor": 0,
  "to_pay_minor": 10517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "fcb26381-b6bf-424b-bcd4-3da1fb18c708",
  "quote_id": "64d95283-0eec-4f09-ab2d-e7f094930edc",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH"
}
```

```json
{
  "id": "255edbeb-8181-4593-82cb-05e41ab5594a",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "fd3de0c2-c44a-4812-b41c-039f2e7c9724",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T18:59:16.061904Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/driver/v1/offers` → **200**

```json
[]
```

`GET /api/driver/v1/broadcast-orders` → **200**

```json
[]
```

`POST /api/driver/v1/orders/255edbeb-8181-4593-82cb-05e41ab5594a/claim` → **409**

```json
{
  "command_id": "fc6bdd08-dbf6-4b28-8df3-11247e41929c"
}
```

```json
{
  "instance": "/api/driver/v1/orders/255edbeb-8181-4593-82cb-05e41ab5594a/claim",
  "status": 409,
  "title": "Driver not eligible",
  "type": "https://errors.blizz.taxi/driver-not-eligible",
  "code": "DRIVER_NOT_ELIGIBLE",
  "correlation_id": "1c68e6f5-208a-4502-a852-43506e30d474"
}
```

`GET /api/operator/v1/orders/255edbeb-8181-4593-82cb-05e41ab5594a/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T18:59:16.064584Z",
      "actor": {
        "type": "CLIENT",
        "id": "fd3de0c2-c44a-4812-b41c-039f2e7c9724",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "255edbeb-8181-4593-82cb-05e41ab5594a",
        "quote_id": "64d95283-0eec-4f09-ab2d-e7f094930edc",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "6ab68c4e-faa2-47c9-96f3-0b9894a452c1"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T18:59:16.068869Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "255edbeb-8181-4593-82cb-05e41ab5594a",
        "attempt_id": "a7cc542f-b0fb-40da-84c5-8ed5892aae4d",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "6ab68c4e-faa2-47c9-96f3-0b9894a452c1"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-30T18:59:16.116012Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "255edbeb-8181-4593-82cb-05e41ab5594a",
        "attempt_id": "a7cc542f-b0fb-40da-84c5-8ed5892aae4d"
      },
      "correlation_id": "6ab68c4e-faa2-47c9-96f3-0b9894a452c1"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "a7cc542f-b0fb-40da-84c5-8ed5892aae4d",
        "generation": 1,
        "started_at": "2026-10-30T18:59:16.067202Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-30T18:59:16.116012Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-30T18:59:16.070196Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000403",
```

## Zones: Kyiv again; the ALL tab narrowed to a zone around the pickup has the order, another zone does not

`GET /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403` → **200**

```json
{
  "profile": {
    "id": "5a000000-0000-4000-8000-000000000403",
    "account_state": "ACTIVE",
    "name": "Андрій Шевчук",
    "language": "ru",
    "review_status": "APPROVED",
    "version": 4,
    "has_payment_terminal": false,
    "admission_city_ids": [
      "5a000000-0000-4000-8000-000000000002"
    ],
    "vehicles": [
      {
        "id": "5a000000-0000-4000-8000-000000000503",
        "registration_number": "AA0003TX",
        "make": "Hyundai",
        "model": "Sonata",
        "color": "black",
        "production_year": 2022,
        "state": "APPROVED",
        "class_approvals": [
          "STANDARD",
          "COMFORT"
        ]
      }
    ],
    "documents": []
  },
  "phone": "+380500000003",
  "history": [],
  "duplicates": []
}
```

`PUT /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/admission-cities` → **200**

```json
{
  "command_id": "0d460a1a-f203-4919-a5bc-b9708306323d",
  "expected_version": 4,
  "city_ids": [
    "5a000000-0000-4000-8000-000000000001"
  ],
  "reason": "Check done"
}
```

```json
{
  "id": "5a000000-0000-4000-8000-000000000403",
  "account_state": "ACTIVE",
  "name": "Андрій Шевчук",
  "language": "ru",
  "review_status": "APPROVED",
  "version": 5,
  "has_payment_terminal": false,
  "admission_city_ids": [
    "5a000000-0000-4000-8000-000000000001"
  ],
  "vehicles": [
    {
      "id": "5a000000-0000-4000-8000-000000000503",
      "registration_number": "AA0003TX",
      "make": "Hyundai",
      "model": "Sonata",
      "color": "black",
      "production_year": 2022,
      "state": "APPROVED",
      "class_approvals": [
        "STANDARD",
        "COMFORT"
      ]
    }
  ],
  "documents": []
}
```

`POST /api/driver/v1/work-sessions/70f77a7b-6e5e-4eca-ac37-fa38f22a0e2e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4528,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T18:59:17Z",
    "sequence": 1793386757993
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "70f77a7b-6e5e-4eca-ac37-fa38f22a0e2e",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "last_heartbeat_at": "2026-10-30T18:59:18.016289Z",
  "last_location_at": "2026-10-30T18:59:18.016289Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000001/zones` → **201**

```json
{
  "command_id": "84855953-4500-4d9e-8b4e-a1a9396c2f79",
  "type": "DISTRICT",
  "polygon": {
    "type": "Polygon",
    "coordinates": [
      [
        [
          30.510,
          50.440
        ],
        [
          30.540,
          50.440
        ],
        [
          30.540,
          50.460
        ],
        [
          30.510,
          50.460
        ],
        [
          30.510,
          50.440
        ]
      ]
    ]
  },
  "priority": 1,
  "reason": "Sandbox: ALL tab filter"
}
```

```json
{
  "id": "20082b27-214f-47ef-847b-3f451f846ffc",
  "state": "DRAFT",
  "version": 0
}
```

`POST /api/admin/v1/zones/20082b27-214f-47ef-847b-3f451f846ffc/publish` → **200**

```json
{
  "command_id": "93019c72-1489-4f83-9ff5-25fe611e8e3b",
  "expected_version": 0,
  "reason": "Sandbox"
}
```

```json
{
  "id": "20082b27-214f-47ef-847b-3f451f846ffc",
  "state": "PUBLISHED",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000001/zones` → **201**

```json
{
  "command_id": "96f02573-cde2-4f9b-a339-a22cd7646a2e",
  "type": "DISTRICT",
  "polygon": {
    "type": "Polygon",
    "coordinates": [
      [
        [
          30.600,
          50.400
        ],
        [
          30.640,
          50.400
        ],
        [
          30.640,
          50.420
        ],
        [
          30.600,
          50.420
        ],
        [
          30.600,
          50.400
        ]
      ]
    ]
  },
  "priority": 1,
  "reason": "Sandbox: ALL tab filter"
}
```

```json
{
  "id": "85e982fd-670f-4cc2-ba9f-f6c521cb593d",
  "state": "DRAFT",
  "version": 0
}
```

`POST /api/admin/v1/zones/85e982fd-670f-4cc2-ba9f-f6c521cb593d/publish` → **200**

```json
{
  "command_id": "f47f3b42-d1a0-4c3c-a605-959f8f0ca6e6",
  "expected_version": 0,
  "reason": "Sandbox"
}
```

```json
{
  "id": "85e982fd-670f-4cc2-ba9f-f6c521cb593d",
  "state": "PUBLISHED",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/zones` → **201**

```json
{
  "command_id": "869f8c05-7693-4324-9927-9bd66aa6064d",
  "type": "DISTRICT",
  "polygon": {
    "type": "Polygon",
    "coordinates": [
      [
        [
          21.000,
          52.220
        ],
        [
          21.030,
          52.220
        ],
        [
          21.030,
          52.240
        ],
        [
          21.000,
          52.240
        ],
        [
          21.000,
          52.220
        ]
      ]
    ]
  },
  "priority": 1,
  "reason": "Sandbox: ALL tab filter"
}
```

```json
{
  "id": "f32461f3-8b7b-4bc3-a7d5-f6fd08e87a37",
  "state": "DRAFT",
  "version": 0
}
```

`POST /api/admin/v1/zones/f32461f3-8b7b-4bc3-a7d5-f6fd08e87a37/publish` → **200**

```json
{
  "command_id": "ed7d475d-70f0-4573-98f2-1fa036131ed7",
  "expected_version": 0,
  "reason": "Sandbox"
}
```

```json
{
  "id": "f32461f3-8b7b-4bc3-a7d5-f6fd08e87a37",
  "state": "PUBLISHED",
  "version": 1
}
```

`GET /api/driver/v1/broadcast-orders?zone_id=20082b27-214f-47ef-847b-3f451f846ffc` → **200**

```json
[
  {
    "order_id": "255edbeb-8181-4593-82cb-05e41ab5594a",
    "vehicle_class": "STANDARD",
    "pickup": {
      "lat": 50.4501,
      "lon": 30.5234
    },
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "payment_method": "CASH",
    "price_minor": 10517,
    "currency": "UAH",
    "distance_m": 300
  }
]
```

`GET /api/driver/v1/broadcast-orders?zone_id=85e982fd-670f-4cc2-ba9f-f6c521cb593d` → **200**

```json
[]
```

`GET /api/driver/v1/broadcast-orders?zone_id=f32461f3-8b7b-4bc3-a7d5-f6fd08e87a37` → **400**

```json
{
  "instance": "/api/driver/v1/broadcast-orders",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "718156ff-525d-4b2c-8f69-4bdc9fca4cf2"
}
```

Done: E1 for 5a000000-0000-4000-8000-000000000403 (open 409, no offer, empty ALL tab, claim 409, journal CITY_NOT_ADMITTED); zone filter.

`GET /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403` → **200**

```json
{
  "profile": {
    "id": "5a000000-0000-4000-8000-000000000403",
    "account_state": "ACTIVE",
    "name": "Андрій Шевчук",
    "language": "ru",
    "review_status": "APPROVED",
    "version": 5,
    "has_payment_terminal": false,
    "admission_city_ids": [
      "5a000000-0000-4000-8000-000000000001"
    ],
    "vehicles": [
      {
        "id": "5a000000-0000-4000-8000-000000000503",
        "registration_number": "AA0003TX",
        "make": "Hyundai",
        "model": "Sonata",
        "color": "black",
        "production_year": 2022,
        "state": "APPROVED",
        "class_approvals": [
          "STANDARD",
          "COMFORT"
        ]
      }
    ],
    "documents": []
  },
  "phone": "+380500000003",
  "history": [],
  "duplicates": []
}
```

`PUT /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/admission-cities` → **200**

```json
{
  "command_id": "f0d9d86d-bee1-4cdb-9ad8-aee3653f1867",
  "expected_version": 5,
  "city_ids": [
    "5a000000-0000-4000-8000-000000000001"
  ],
  "reason": "Restore after the scenario"
}
```

```json
{
  "id": "5a000000-0000-4000-8000-000000000403",
  "account_state": "ACTIVE",
  "name": "Андрій Шевчук",
  "language": "ru",
  "review_status": "APPROVED",
  "version": 6,
  "has_payment_terminal": false,
  "admission_city_ids": [
    "5a000000-0000-4000-8000-000000000001"
  ],
  "vehicles": [
    {
      "id": "5a000000-0000-4000-8000-000000000503",
      "registration_number": "AA0003TX",
      "make": "Hyundai",
      "model": "Sonata",
      "color": "black",
      "production_year": 2022,
      "state": "APPROVED",
      "class_approvals": [
        "STANDARD",
        "COMFORT"
      ]
    }
  ],
  "documents": []
}
```

`GET /api/operator/v1/orders/255edbeb-8181-4593-82cb-05e41ab5594a` → **200**

```json
{
  "id": "255edbeb-8181-4593-82cb-05e41ab5594a",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "fd3de0c2-c44a-4812-b41c-039f2e7c9724",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T18:59:16.061904Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/255edbeb-8181-4593-82cb-05e41ab5594a/cancel` → **200**

```json
{
  "command_id": "fb2fcc54-f41b-4b67-a409-7b5fa76d85b7",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "255edbeb-8181-4593-82cb-05e41ab5594a",
  "short_number": 1,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "fd3de0c2-c44a-4812-b41c-039f2e7c9724",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "STOPPED",
  "assignment": null,
  "created_at": "2026-10-30T18:59:16.061904Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "pl": "Brak wolnych aut",
      "uk": "Немає вільних авто",
      "en": "No cars available",
      "ru": "Нет свободных машин"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "70f77a7b-6e5e-4eca-ac37-fa38f22a0e2e",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "last_heartbeat_at": "2026-10-30T18:59:18.016289Z",
  "last_location_at": "2026-10-30T18:59:18.016289Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/70f77a7b-6e5e-4eca-ac37-fa38f22a0e2e/close` → **200**

```json
{
  "command_id": "d5d6ff92-2f13-410c-80ad-84eaa8ca5080",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": null,
  "session_version": 0,
  "session_state": "CLOSED",
  "intent": null,
  "connection": "DISCONNECTED",
  "geolocation": "UNAVAILABLE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": null,
  "vehicle_id": null,
  "last_heartbeat_at": null,
  "last_location_at": null,
  "eligible": false,
  "ineligible_reasons": [
    "NO_OPEN_SESSION"
  ]
}
```

# Scenario: app-version

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "6323eaf8-2748-4bdd-9b3a-1de871e13830",
  "subject": {
    "type": "STAFF",
    "id": "50e6407f-123d-42ca-9890-64ec61c07dce"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MGU2NDA3Zi0xMjNkLTQyY2EtOTg5MC02NGVjNjFjMDdkY2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODc2NjIsImlhdCI6MTc5MzM4Njc2MiwianRpIjoiMzM0Mjg0ZjUtZTgzMy00MDM3LThmNjItOThlMjliNjgwY2FkIiwic2lkIjoiNjMyM2VhZjgtMjc0OC00YmRkLTliM2EtMWRlODcxZTEzODMwIn0.rmryL_iC21iOxGIsy81L0baA5L47Nr81dv-dxvjFK50",
  "access_expires_at": "2026-10-30T19:14:22.528317708Z",
  "refresh_token": "bRC7ROJW8xHfMnc9r-fE9qyB0g28oShZSqUB193xFow",
  "refresh_expires_at": "2026-10-31T06:59:22.527750174Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/settings` → **200**

```json
{
  "version": 0,
  "settings": {
    "brand": {
      "service_name": "Blizz Taxi",
      "primary_color": "#111111",
      "on_primary_color": "#FFFFFF",
      "accent_color": null,
      "logo_url": null,
      "support_phone": null,
      "support_email": null,
      "support_telegram": null,
      "privacy_policy_url": null,
      "terms_url": null
    },
    "languages": {
      "default_language": "ru",
      "enabled": [
        "uk",
        "pl",
        "ru",
        "en"
      ]
    },
    "calls": {
      "mode": "DIRECT",
      "service_phone": null
    },
    "preorders": {
      "threshold_minutes": 60,
      "max_days_ahead": 7,
      "dispatch": "BROADCAST_BEFORE",
      "release_minutes_before": 30,
      "confirm_minutes_before": 30,
      "confirm_window_minutes": 10,
      "driver_cancel_until_minutes_before": 60
    },
    "ratings": {
      "edit_window_hours": 24
    },
    "tips": {
      "window_hours": 24
    },
    "orders": {
      "active_per_payer": 3
    },
    "cash_not_received": {
      "credit_driver": true,
      "driver_share_percent": 100
    },
    "app_versions": {
      "rider_android": {
        "minimum_version": "0.0.0",
        "latest_version": "0.0.0"
      },
      "rider_ios": {
        "minimum_version": "0.0.0",
        "latest_version": "0.0.0"
      },
      "driver_android": {
        "minimum_version": "0.0.0",
        "latest_version": "0.0.0"
      },
      "driver_ios": {
        "minimum_version": "0.0.0",
        "latest_version": "0.0.0"
      },
      "require_version_header": false
    },
    "staff_top_ups": {
      "daily_max_per_staff_minor": {}
    }
  },
  "changed_by": null,
  "reason": null,
  "changed_at": null
}
```

## Ivan is online with his app and takes an order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-24028"
}
```

```json
{
  "challenge_id": "70a4f493-2a25-41c8-a682-4860c9cffc19",
  "expires_at": "2026-10-30T19:04:23.020608716Z",
  "resend_available_at": "2026-10-30T18:59:24.020608716Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "436479",
  "sent_at": "2026-10-30T18:59:23.02448772Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "70a4f493-2a25-41c8-a682-4860c9cffc19",
  "code": "436479",
  "device_ref": "sandbox-24028"
}
```

```json
{
  "session_id": "388123d1-348c-462a-b07e-10c86f2be119",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4NzY2MywiaWF0IjoxNzkzMzg2NzYzLCJqdGkiOiI3NWIyNDhiMS02NjA2LTQzNmUtYjhkNy0yNmU5YWE3MWQzNTciLCJzaWQiOiIzODgxMjNkMS0zNDhjLTQ2MmEtYjA3ZS0xMGM4NmYyYmUxMTkifQ.hUTwOdkPDMJ16W9W7j_x8ADav6BEnJfh56mDqspOn0A",
  "access_expires_at": "2026-10-30T19:14:23.308922885Z",
  "refresh_token": "8Rdxgfv8xbuZFN00imHAesRiJPTDYngcWV3xaHiKCW4",
  "refresh_expires_at": "2026-11-29T18:59:23.308205957Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": null,
  "session_version": 0,
  "session_state": "CLOSED",
  "intent": null,
  "connection": "DISCONNECTED",
  "geolocation": "UNAVAILABLE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": null,
  "vehicle_id": null,
  "last_heartbeat_at": null,
  "last_location_at": null,
  "eligible": false,
  "ineligible_reasons": [
    "NO_OPEN_SESSION"
  ]
}
```

`POST /api/driver/v1/work-sessions` → **201**

```json
{
  "command_id": "39df5a96-14c4-4acd-aa5d-dfce7dfc6fa2",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T18:59:23Z",
    "sequence": 1793386763794
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f184dc83-b38e-4ad1-a2b0-376d22f6f15a",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T18:59:23.81299Z",
  "last_location_at": "2026-10-30T18:59:23.81299Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633769798",
  "device_ref": "sandbox-17888"
}
```

```json
{
  "challenge_id": "03eeb1b6-249a-4703-b4e6-a353614c6224",
  "expires_at": "2026-10-30T19:04:24.066184238Z",
  "resend_available_at": "2026-10-30T18:59:25.066184238Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380633769798` → **200**

```json
{
  "phone": "+380633769798",
  "audience": "CLIENT",
  "code": "231749",
  "sent_at": "2026-10-30T18:59:24.069766205Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "03eeb1b6-249a-4703-b4e6-a353614c6224",
  "code": "231749",
  "device_ref": "sandbox-17888"
}
```

```json
{
  "session_id": "1d8d141a-bfcb-401f-9f18-87cefc1496ba",
  "subject": {
    "type": "CLIENT",
    "id": "7ac20423-884e-4301-9668-c3f75e23db0e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YWMyMDQyMy04ODRlLTQzMDEtOTY2OC1jM2Y3NWUyM2RiMGUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzg3NjY0LCJpYXQiOjE3OTMzODY3NjQsImp0aSI6ImViY2I4OTk0LWJmMDEtNGVmNi1hM2M4LTU5ZmI0NmZmNTYwMCIsInNpZCI6IjFkOGQxNDFhLWJmY2ItNDAxZi05ZjE4LTg3Y2VmYzE0OTZiYSJ9.Uy0WpujuH7dINzQgYXUhe8wnWgKe_JtfxI6yGPNIdOs",
  "access_expires_at": "2026-10-30T19:14:24.328069001Z",
  "refresh_token": "_YnvqDsS9c0sBEof0RoD7x2ybwg0cwWzve2cTrvf-l4",
  "refresh_expires_at": "2026-11-29T18:59:24.327527196Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "fc22d2af-4e37-4926-afa1-59bb3c6d68c5",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  }
}
```

```json
{
  "id": "9a2bbcae-779d-493c-8739-5968d442933f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T19:04:24.579007Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false,
  "discount_minor": 0,
  "to_pay_minor": 10517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "a12a9e39-f65d-4e1b-b79c-a24573f6b123",
  "quote_id": "9a2bbcae-779d-493c-8739-5968d442933f",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH"
}
```

```json
{
  "id": "e71b7c06-0d5f-4b01-a069-947facec0073",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7ac20423-884e-4301-9668-c3f75e23db0e",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "PERSONAL",
  "assignment": null,
  "created_at": "2026-10-30T18:59:24.829503Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "ae0496a2-2377-4208-a224-bb7f9c3264f8",
    "order_id": "e71b7c06-0d5f-4b01-a069-947facec0073",
    "expires_at": "2026-10-30T18:59:39.833336Z",
    "vehicle_class": "STANDARD",
    "pickup": {
      "lat": 50.4501,
      "lon": 30.5234
    },
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "payment_method": "CASH",
    "price_minor": 10517,
    "currency": "UAH",
    "distance_m": 100
  }
]
```

`POST /api/driver/v1/offers/ae0496a2-2377-4208-a224-bb7f9c3264f8/accept` → **200**

```json
{
  "command_id": "55a926a9-fa6d-44d8-9f26-419f90c36978"
}
```

```json
{
  "id": "7a9953f6-7828-4d37-90b0-cd827aeecd57",
  "order_id": "e71b7c06-0d5f-4b01-a069-947facec0073",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "da2e213d-38b3-46cb-b7bf-1a2223ce5eec",
  "trip_phase": "TO_PICKUP"
}
```

## While Ivan drives, staff require driver apps 9.0.0 or newer

`GET /api/admin/v1/settings` → **200**

```json
{
  "version": 0,
  "settings": {
    "brand": {
      "service_name": "Blizz Taxi",
      "primary_color": "#111111",
      "on_primary_color": "#FFFFFF",
      "accent_color": null,
      "logo_url": null,
      "support_phone": null,
      "support_email": null,
      "support_telegram": null,
      "privacy_policy_url": null,
      "terms_url": null
    },
    "languages": {
      "default_language": "ru",
      "enabled": [
        "uk",
        "pl",
        "ru",
        "en"
      ]
    },
    "calls": {
      "mode": "DIRECT",
      "service_phone": null
    },
    "preorders": {
      "threshold_minutes": 60,
      "max_days_ahead": 7,
      "dispatch": "BROADCAST_BEFORE",
      "release_minutes_before": 30,
      "confirm_minutes_before": 30,
      "confirm_window_minutes": 10,
      "driver_cancel_until_minutes_before": 60
    },
    "ratings": {
      "edit_window_hours": 24
    },
    "tips": {
      "window_hours": 24
    },
    "orders": {
      "active_per_payer": 3
    },
    "cash_not_received": {
      "credit_driver": true,
      "driver_share_percent": 100
    },
    "app_versions": {
      "rider_android": {
        "minimum_version": "0.0.0",
        "latest_version": "0.0.0"
      },
      "rider_ios": {
        "minimum_version": "0.0.0",
        "latest_version": "0.0.0"
      },
      "driver_android": {
        "minimum_version": "0.0.0",
        "latest_version": "0.0.0"
      },
      "driver_ios": {
        "minimum_version": "0.0.0",
        "latest_version": "0.0.0"
      },
      "require_version_header": false
    },
    "staff_top_ups": {
      "daily_max_per_staff_minor": {}
    }
  },
  "changed_by": null,
  "reason": null,
  "changed_at": null
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "b96ddf30-0f43-4260-97c8-0684888e8f74",
  "expected_version": 0,
  "settings": {
    "brand": {
      "service_name": "Blizz Taxi",
      "primary_color": "#111111",
      "on_primary_color": "#FFFFFF",
      "accent_color": null,
      "logo_url": null,
      "support_phone": null,
      "support_email": null,
      "support_telegram": null,
      "privacy_policy_url": null,
      "terms_url": null
    },
    "languages": {
      "default_language": "ru",
      "enabled": [
        "uk",
        "pl",
        "ru",
        "en"
      ]
    },
    "calls": {
      "mode": "DIRECT",
      "service_phone": null
    },
    "preorders": {
      "threshold_minutes": 60,
      "max_days_ahead": 7,
      "dispatch": "BROADCAST_BEFORE",
      "release_minutes_before": 30,
      "confirm_minutes_before": 30,
      "confirm_window_minutes": 10,
      "driver_cancel_until_minutes_before": 60
    },
    "ratings": {
      "edit_window_hours": 24
    },
    "tips": {
      "window_hours": 24
    },
    "orders": {
      "active_per_payer": 3
    },
    "cash_not_received": {
      "credit_driver": true,
      "driver_share_percent": 100
    },
    "app_versions": {
      "rider_android": {
        "minimum_version": "0.0.0",
        "latest_version": "0.0.0"
      },
      "rider_ios": {
        "minimum_version": "0.0.0",
        "latest_version": "0.0.0"
      },
      "driver_android": {
        "minimum_version": "9.0.0",
        "latest_version": "9.0.0"
      },
      "driver_ios": {
        "minimum_version": "9.0.0",
        "latest_version": "9.0.0"
      },
      "require_version_header": false
    },
    "staff_top_ups": {
      "daily_max_per_staff_minor": {}
    }
  },
  "reason": "Sandbox: force an update"
}
```

```json
{
  "version": 1,
  "settings": {
    "brand": {
      "service_name": "Blizz Taxi",
      "primary_color": "#111111",
      "on_primary_color": "#FFFFFF",
      "accent_color": null,
      "logo_url": null,
      "support_phone": null,
      "support_email": null,
      "support_telegram": null,
      "privacy_policy_url": null,
      "terms_url": null
    },
    "languages": {
      "default_language": "ru",
      "enabled": [
        "uk",
        "pl",
        "ru",
        "en"
      ]
    },
    "calls": {
      "mode": "DIRECT",
      "service_phone": null
    },
    "preorders": {
      "threshold_minutes": 60,
      "max_days_ahead": 7,
      "dispatch": "BROADCAST_BEFORE",
      "release_minutes_before": 30,
      "confirm_minutes_before": 30,
      "confirm_window_minutes": 10,
      "driver_cancel_until_minutes_before": 60
    },
    "ratings": {
      "edit_window_hours": 24
    },
    "tips": {
      "window_hours": 24
    },
    "orders": {
      "active_per_payer": 3
    },
    "cash_not_received": {
      "credit_driver": true,
      "driver_share_percent": 100
    },
    "app_versions": {
      "rider_android": {
        "minimum_version": "0.0.0",
        "latest_version": "0.0.0"
      },
      "rider_ios": {
        "minimum_version": "0.0.0",
        "latest_version": "0.0.0"
      },
      "driver_android": {
        "minimum_version": "9.0.0",
        "latest_version": "9.0.0"
      },
      "driver_ios": {
        "minimum_version": "9.0.0",
        "latest_version": "9.0.0"
      },
      "require_version_header": false
    },
    "staff_top_ups": {
      "daily_max_per_staff_minor": {}
    }
  },
  "changed_by": "50e6407f-123d-42ca-9890-64ec61c07dce",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T18:59:25.865749461Z"
}
```

`GET /api/config/v1/bootstrap` → **200**

```json
{
  "settings_version": 1,
  "brand": {
    "service_name": "Blizz Taxi",
    "primary_color": "#111111",
    "on_primary_color": "#FFFFFF",
    "accent_color": null,
    "logo_url": null,
    "support_phone": null,
    "support_email": null,
    "support_telegram": null,
    "privacy_policy_url": null,
    "terms_url": null
  },
  "languages": {
    "default_language": "ru",
    "enabled": [
      "uk",
      "pl",
      "ru",
      "en"
    ]
  },
  "calls": {
    "mode": "DIRECT",
    "service_phone": null
  },
  "preorders": {
    "threshold_minutes": 60,
    "max_days_ahead": 7
  },
  "maps": {
    "provider": null,
    "android_key": null,
    "ios_key": null,
    "web_key": null
  },
  "cities": [
    {
      "id": "5a000000-0000-4000-8000-000000000002",
      "code": "warszawa",
      "name": "Warszawa",
      "currency": "PLN",
      "timezone": "Europe/Warsaw",
      "working_hours": [],
      "payment_methods": [
        "CARD",
        "CASH",
        "TERMINAL"
      ],
      "orders_paused": false
    },
    {
      "id": "5a000000-0000-4000-8000-000000000001",
      "code": "kyiv",
      "name": "Київ",
      "currency": "UAH",
      "timezone": "Europe/Kyiv",
      "working_hours": [],
      "payment_methods": [
        "CARD",
        "CASH",
        "TERMINAL"
      ],
      "orders_paused": false
    }
  ],
  "app_versions": {
    "rider_android": {
      "minimum_version": "0.0.0",
      "latest_version": "0.0.0"
    },
    "rider_ios": {
      "minimum_version": "0.0.0",
      "latest_version": "0.0.0"
    },
    "driver_android": {
      "minimum_version": "9.0.0",
      "latest_version": "9.0.0"
    },
```

## With the old app Ivan still finishes the trip

`GET /api/driver/v1/trips/current` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "id": "da2e213d-38b3-46cb-b7bf-1a2223ce5eec",
  "order_id": "e71b7c06-0d5f-4b01-a069-947facec0073",
  "assignment_id": "7a9953f6-7828-4d37-90b0-cd827aeecd57",
  "phase": "TO_PICKUP",
  "version": 0,
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "price_minor": 10517,
  "currency": "UAH",
  "arrived_at": null,
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/f184dc83-b38e-4ad1-a2b0-376d22f6f15a/heartbeat` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T18:59:26Z",
    "sequence": 1793386766626
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f184dc83-b38e-4ad1-a2b0-376d22f6f15a",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T18:59:26.644896Z",
  "last_location_at": "2026-10-30T18:59:26.644896Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/da2e213d-38b3-46cb-b7bf-1a2223ce5eec/arrive` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "6288c915-569e-48b4-aca7-c7cb6b8c528f",
  "expected_version": 0
}
```

```json
{
  "id": "da2e213d-38b3-46cb-b7bf-1a2223ce5eec",
  "order_id": "e71b7c06-0d5f-4b01-a069-947facec0073",
  "assignment_id": "7a9953f6-7828-4d37-90b0-cd827aeecd57",
  "phase": "WAITING",
  "version": 1,
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "price_minor": 10517,
  "currency": "UAH",
  "arrived_at": "2026-10-30T18:59:26.900933Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/da2e213d-38b3-46cb-b7bf-1a2223ce5eec/start` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "3a16a196-e9bc-4284-98f3-c13aefe4c045",
  "expected_version": 1
}
```

```json
{
  "id": "da2e213d-38b3-46cb-b7bf-1a2223ce5eec",
  "order_id": "e71b7c06-0d5f-4b01-a069-947facec0073",
  "assignment_id": "7a9953f6-7828-4d37-90b0-cd827aeecd57",
  "phase": "IN_PROGRESS",
  "version": 2,
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "price_minor": 10517,
  "currency": "UAH",
  "arrived_at": "2026-10-30T18:59:26.900933Z",
  "started_at": "2026-10-30T18:59:27.159264Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/da2e213d-38b3-46cb-b7bf-1a2223ce5eec/complete` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "c16ef5d9-f1f1-427a-b10a-e1702badf369",
  "expected_version": 2,
  "reported_at": "2026-10-30T18:59:27Z",
  "cash_received": true
}
```

```json
{
  "id": "da2e213d-38b3-46cb-b7bf-1a2223ce5eec",
  "order_id": "e71b7c06-0d5f-4b01-a069-947facec0073",
  "assignment_id": "7a9953f6-7828-4d37-90b0-cd827aeecd57",
  "phase": "COMPLETED",
  "version": 3,
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "price_minor": 10517,
  "currency": "UAH",
  "arrived_at": "2026-10-30T18:59:26.900933Z",
  "started_at": "2026-10-30T18:59:27.159264Z",
  "completed_at": "2026-10-30T18:59:27.425212Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## He closes his shift, and cannot go online again with the old app

`GET /api/driver/v1/work-sessions/current` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f184dc83-b38e-4ad1-a2b0-376d22f6f15a",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T18:59:26.644896Z",
  "last_location_at": "2026-10-30T18:59:26.644896Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f184dc83-b38e-4ad1-a2b0-376d22f6f15a/close` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "6faa3d00-f367-4848-95bf-dbb2bbe60256",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": null,
  "session_version": 0,
  "session_state": "CLOSED",
  "intent": null,
  "connection": "DISCONNECTED",
  "geolocation": "UNAVAILABLE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": null,
  "vehicle_id": null,
  "last_heartbeat_at": null,
  "last_location_at": null,
  "eligible": false,
  "ineligible_reasons": [
    "NO_OPEN_SESSION"
  ]
}
```

`POST /api/driver/v1/work-sessions` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **426**

```json
{
  "command_id": "2bf496b6-df67-4b00-9257-799c94564806",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T18:59:28Z",
    "sequence": 1793386768175
  }
}
```

```json
{
  "instance": "/api/driver/v1/work-sessions",
  "status": 426,
  "title": "Upgrade required",
  "type": "https://errors.blizz.taxi/upgrade-required",
  "code": "UPGRADE_REQUIRED",
  "correlation_id": "5c76befb-6696-4e98-9a6d-b5ac3174196b",
  "minimum_version": "9.0.0"
}
```

## After the update he can

`POST /api/driver/v1/work-sessions` (X-App-Platform: DRIVER_ANDROID X-App-Version: 9.0.0) → **201**

```json
{
  "command_id": "131b80ad-35a1-4736-ba16-bb603c92a4ab",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T18:59:28Z",
    "sequence": 1793386768429
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e6659b2d-446b-4b86-b2b0-a7879f4e1f9e",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T18:59:28.449077Z",
  "last_location_at": "2026-10-30T18:59:28.449077Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

Done: an outdated driver app finished its trip, then was asked to update before going online.

`GET /api/admin/v1/settings` → **200**

```json
{
  "version": 1,
  "settings": {
    "brand": {
      "service_name": "Blizz Taxi",
      "primary_color": "#111111",
      "on_primary_color": "#FFFFFF",
      "accent_color": null,
      "logo_url": null,
      "support_phone": null,
      "support_email": null,
      "support_telegram": null,
      "privacy_policy_url": null,
      "terms_url": null
    },
    "languages": {
      "default_language": "ru",
      "enabled": [
        "uk",
        "pl",
        "ru",
        "en"
      ]
    },
    "calls": {
      "mode": "DIRECT",
      "service_phone": null
    },
    "preorders": {
      "threshold_minutes": 60,
      "max_days_ahead": 7,
      "dispatch": "BROADCAST_BEFORE",
      "release_minutes_before": 30,
      "confirm_minutes_before": 30,
      "confirm_window_minutes": 10,
      "driver_cancel_until_minutes_before": 60
    },
    "ratings": {
      "edit_window_hours": 24
    },
    "tips": {
      "window_hours": 24
    },
    "orders": {
      "active_per_payer": 3
    },
    "cash_not_received": {
      "credit_driver": true,
      "driver_share_percent": 100
    },
    "app_versions": {
      "rider_android": {
        "minimum_version": "0.0.0",
        "latest_version": "0.0.0"
      },
      "rider_ios": {
        "minimum_version": "0.0.0",
        "latest_version": "0.0.0"
      },
      "driver_android": {
        "minimum_version": "9.0.0",
        "latest_version": "9.0.0"
      },
      "driver_ios": {
        "minimum_version": "9.0.0",
        "latest_version": "9.0.0"
      },
      "require_version_header": false
    },
    "staff_top_ups": {
      "daily_max_per_staff_minor": {}
    }
  },
  "changed_by": "50e6407f-123d-42ca-9890-64ec61c07dce",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T18:59:25.865749Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "90a98a3e-2d9f-4bd1-83eb-2857ee034e65",
  "expected_version": 1,
  "settings": {
    "brand": {
      "service_name": "Blizz Taxi",
      "primary_color": "#111111",
      "on_primary_color": "#FFFFFF",
      "accent_color": null,
      "logo_url": null,
      "support_phone": null,
      "support_email": null,
      "support_telegram": null,
      "privacy_policy_url": null,
      "terms_url": null
    },
    "languages": {
      "default_language": "ru",
      "enabled": [
        "uk",
        "pl",
        "ru",
        "en"
      ]
    },
    "calls": {
      "mode": "DIRECT",
      "service_phone": null
    },
    "preorders": {
      "threshold_minutes": 60,
      "max_days_ahead": 7,
      "dispatch": "BROADCAST_BEFORE",
      "release_minutes_before": 30,
      "confirm_minutes_before": 30,
      "confirm_window_minutes": 10,
      "driver_cancel_until_minutes_before": 60
    },
    "ratings": {
      "edit_window_hours": 24
    },
    "tips": {
      "window_hours": 24
    },
    "orders": {
      "active_per_payer": 3
    },
    "cash_not_received": {
      "credit_driver": true,
      "driver_share_percent": 100
    },
    "app_versions": {
      "rider_android": {
        "minimum_version": "0.0.0",
        "latest_version": "0.0.0"
      },
      "rider_ios": {
        "minimum_version": "0.0.0",
        "latest_version": "0.0.0"
      },
      "driver_android": {
        "minimum_version": "0.0.0",
        "latest_version": "0.0.0"
      },
      "driver_ios": {
        "minimum_version": "0.0.0",
        "latest_version": "0.0.0"
      },
      "require_version_header": false
    },
    "staff_top_ups": {
      "daily_max_per_staff_minor": {}
    }
  },
  "reason": "Sandbox: app version scenario over"
}
```

```json
{
  "version": 2,
  "settings": {
    "brand": {
      "service_name": "Blizz Taxi",
      "primary_color": "#111111",
      "on_primary_color": "#FFFFFF",
      "accent_color": null,
      "logo_url": null,
      "support_phone": null,
      "support_email": null,
      "support_telegram": null,
      "privacy_policy_url": null,
      "terms_url": null
    },
    "languages": {
      "default_language": "ru",
      "enabled": [
        "uk",
        "pl",
        "ru",
        "en"
      ]
    },
    "calls": {
      "mode": "DIRECT",
      "service_phone": null
    },
    "preorders": {
      "threshold_minutes": 60,
      "max_days_ahead": 7,
      "dispatch": "BROADCAST_BEFORE",
      "release_minutes_before": 30,
      "confirm_minutes_before": 30,
      "confirm_window_minutes": 10,
      "driver_cancel_until_minutes_before": 60
    },
    "ratings": {
      "edit_window_hours": 24
    },
    "tips": {
      "window_hours": 24
    },
    "orders": {
      "active_per_payer": 3
    },
    "cash_not_received": {
      "credit_driver": true,
      "driver_share_percent": 100
    },
    "app_versions": {
      "rider_android": {
        "minimum_version": "0.0.0",
        "latest_version": "0.0.0"
      },
      "rider_ios": {
        "minimum_version": "0.0.0",
        "latest_version": "0.0.0"
      },
      "driver_android": {
        "minimum_version": "0.0.0",
        "latest_version": "0.0.0"
      },
      "driver_ios": {
        "minimum_version": "0.0.0",
        "latest_version": "0.0.0"
      },
      "require_version_header": false
    },
    "staff_top_ups": {
      "daily_max_per_staff_minor": {}
    }
  },
  "changed_by": "50e6407f-123d-42ca-9890-64ec61c07dce",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T18:59:28.952174201Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e6659b2d-446b-4b86-b2b0-a7879f4e1f9e",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T18:59:28.449077Z",
  "last_location_at": "2026-10-30T18:59:28.449077Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e6659b2d-446b-4b86-b2b0-a7879f4e1f9e/close` → **200**

```json
{
  "command_id": "2ba2fd97-1e72-471f-84dc-5eb20d36f3b7",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": null,
  "session_version": 0,
  "session_state": "CLOSED",
  "intent": null,
  "connection": "DISCONNECTED",
  "geolocation": "UNAVAILABLE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": null,
  "vehicle_id": null,
  "last_heartbeat_at": null,
  "last_location_at": null,
  "eligible": false,
  "ineligible_reasons": [
    "NO_OPEN_SESSION"
  ]
}
```

# Scenario: bonuses

## The admin starts «Осінь −10 %» in Kyiv

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "890264c6-80e2-457c-8ba6-63e44d4d2499",
  "subject": {
    "type": "STAFF",
    "id": "50e6407f-123d-42ca-9890-64ec61c07dce"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MGU2NDA3Zi0xMjNkLTQyY2EtOTg5MC02NGVjNjFjMDdkY2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODc2NjksImlhdCI6MTc5MzM4Njc2OSwianRpIjoiNTZhZWUwOWItNDg0Ny00Y2U0LTgwYTctNTk4N2Q0YWYxMzg4Iiwic2lkIjoiODkwMjY0YzYtODBlMi00NTdjLThiYTYtNjNlNDRkNGQyNDk5In0.T9DjIFqqo_7Bz2Lve_2754EX-_D2FLPfp3PGlEQ7jmA",
  "access_expires_at": "2026-10-30T19:14:29.985910712Z",
  "refresh_token": "dVtduPXA4DXJ8HE_tjkTpd6UIXSUQ8BDbvqWEsun4KI",
  "refresh_expires_at": "2026-10-31T06:59:29.98536381Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "0311877c-f4f4-4d5a-8ef1-3f71ca89d00f",
  "reason": "Осіння акція",
  "promotion": {
    "name": "Осінь −10 %",
    "kind": "DISCOUNT",
    "value_type": "PERCENT",
    "value": 1000,
    "conditions": {
      "city_id": "5a000000-0000-4000-8000-000000000001"
    }
  }
}
```

```json
{
  "id": "c1e9515a-caf1-497a-bef1-fae28d9a96ac",
  "name": "Осінь −10 %",
  "kind": "DISCOUNT",
  "value_type": "PERCENT",
  "value": 1000,
  "currency": null,
  "conditions": {
    "city_id": "5a000000-0000-4000-8000-000000000001",
    "vehicle_class": null,
    "every_nth_trip": null,
    "days_of_week": null,
    "time_from": null,
    "time_to": null,
    "pickup_zone_id": null,
    "dropoff_zone_id": null,
    "starts_at": null,
    "ends_at": null
  },
  "state": "ACTIVE",
  "version": 1,
  "created_by": "50e6407f-123d-42ca-9890-64ec61c07dce",
  "created_at": "2026-10-30T18:59:30.235444Z",
  "updated_at": "2026-10-30T18:59:30.235444Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639940195",
  "device_ref": "sandbox-16750"
}
```

```json
{
  "challenge_id": "2651f5f1-42e3-4e5c-86c9-0eaa7e71489d",
  "expires_at": "2026-10-30T19:04:30.483423923Z",
  "resend_available_at": "2026-10-30T18:59:31.483423923Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639940195` → **200**

```json
{
  "phone": "+380639940195",
  "audience": "CLIENT",
  "code": "067287",
  "sent_at": "2026-10-30T18:59:30.487771538Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2651f5f1-42e3-4e5c-86c9-0eaa7e71489d",
  "code": "067287",
  "device_ref": "sandbox-16750"
}
```

```json
{
  "session_id": "dfdaed38-92f5-4a50-b917-f6831805506b",
  "subject": {
    "type": "CLIENT",
    "id": "b5265a77-933a-4cb3-a849-5946512427b2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNTI2NWE3Ny05MzNhLTRjYjMtYTg0OS01OTQ2NTEyNDI3YjIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzg3NjcwLCJpYXQiOjE3OTMzODY3NzAsImp0aSI6ImRkNGRiODU2LTI0NWItNGE3Ny05YWM0LWI5NDY1OWI4ZjVhZCIsInNpZCI6ImRmZGFlZDM4LTkyZjUtNGE1MC1iOTE3LWY2ODMxODA1NTA2YiJ9.QgQSE9nTzclvl8ErduzsIxq7Bg0ueaSNaaK75ipmbIY",
  "access_expires_at": "2026-10-30T19:14:30.748260668Z",
  "refresh_token": "WzMKOrGKWMCFS1TZqgSHEHWTihbWk1O7ZFnK5I79duc",
  "refresh_expires_at": "2026-11-29T18:59:30.74774283Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380639940195` → **200**

```json
{
  "client_id": "b5265a77-933a-4cb3-a849-5946512427b2"
}
```

`POST /api/admin/v1/rider-wallets/b5265a77-933a-4cb3-a849-5946512427b2/top-ups` → **201**

```json
{
  "command_id": "a024739d-77ec-4018-8827-e14a8a0e8cdb",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "b5265a77-933a-4cb3-a849-5946512427b2",
  "balances": [
    {
      "currency": "UAH",
      "balance_minor": 5000,
      "reserved_minor": 0,
      "available_minor": 5000
    }
  ],
  "entries": [
    {
      "id": "c21393cd-b972-45af-affd-b6607e5378c6",
      "at": "2026-10-30T18:59:31.221076Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "50e6407f-123d-42ca-9890-64ec61c07dce",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "cd971784-5d99-49c8-a42a-5779d3419eac",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  }
}
```

```json
{
  "id": "36c9adf9-d077-4079-8033-86fa75a36c7b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T19:04:31.484988Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false,
  "discount_minor": 1052,
  "to_pay_minor": 9465,
  "promotions": [
    {
      "id": "c1e9515a-caf1-497a-bef1-fae28d9a96ac",
      "name": "Осінь −10 %",
      "kind": "DISCOUNT",
      "value_type": "PERCENT",
      "value": 1000,
      "discount_minor": 1052
    }
  ]
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-26313"
}
```

```json
{
  "challenge_id": "92e42d5f-6439-4095-b080-ae1f44d77a40",
  "expires_at": "2026-10-30T19:04:31.737915989Z",
  "resend_available_at": "2026-10-30T18:59:32.737915989Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "354141",
  "sent_at": "2026-10-30T18:59:31.741361718Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "92e42d5f-6439-4095-b080-ae1f44d77a40",
  "code": "354141",
  "device_ref": "sandbox-26313"
}
```

```json
{
  "session_id": "66e27c63-6d62-41ed-abd2-def71f70d722",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4NzY3MiwiaWF0IjoxNzkzMzg2NzcyLCJqdGkiOiIyNDg4YzRmNS00MWY0LTQ5ZDItOTBhNi1hYTdmNjIzYzUwYTIiLCJzaWQiOiI2NmUyN2M2My02ZDYyLTQxZWQtYWJkMi1kZWY3MWY3MGQ3MjIifQ.BkTT77wLMY6kpGtMkcel8E_XWn4aIg5D9ZK5VVwLo2M",
  "access_expires_at": "2026-10-30T19:14:32.017663517Z",
  "refresh_token": "499ECE4rBOawSjsC4Q4SPNr7fhUm5hg-BmNzQWugC_k",
  "refresh_expires_at": "2026-11-29T18:59:32.016871096Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": null,
  "session_version": 0,
  "session_state": "CLOSED",
  "intent": null,
  "connection": "DISCONNECTED",
  "geolocation": "UNAVAILABLE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": null,
  "vehicle_id": null,
  "last_heartbeat_at": null,
  "last_location_at": null,
  "eligible": false,
  "ineligible_reasons": [
    "NO_OPEN_SESSION"
  ]
}
```

`POST /api/driver/v1/work-sessions` → **201**

```json
{
  "command_id": "2ef31ebc-4f30-4604-a094-c95095950b8a",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T18:59:32Z",
    "sequence": 1793386772513
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1ae71f57-e430-4d1b-9895-d6b803d34575",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T18:59:32.531932Z",
  "last_location_at": "2026-10-30T18:59:32.531932Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "3c228e6f-8995-4eb8-a757-3c56030b6895",
  "quote_id": "36c9adf9-d077-4079-8033-86fa75a36c7b",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "wallet_minor": 2000
}
```

```json
{
  "id": "f46583bb-cd87-48ca-8ac4-1b37c1b0d164",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b5265a77-933a-4cb3-a849-5946512427b2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "PERSONAL",
  "assignment": null,
  "created_at": "2026-10-30T18:59:32.78973Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "pickup_eta": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "b5265a77-933a-4cb3-a849-5946512427b2",
  "balances": [
    {
      "currency": "UAH",
      "balance_minor": 5000,
      "reserved_minor": 2000,
      "available_minor": 3000
    }
  ],
  "entries": [
    {
      "id": "c21393cd-b972-45af-affd-b6607e5378c6",
      "at": "2026-10-30T18:59:31.221076Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "50e6407f-123d-42ca-9890-64ec61c07dce",
      "order_id": null
    }
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
```

## Ivan drives; he collects the price minus the discount and the bonuses

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "e3ab411d-93d5-460f-8c1b-f2be3cbcb69e",
    "order_id": "f46583bb-cd87-48ca-8ac4-1b37c1b0d164",
    "expires_at": "2026-10-30T18:59:47.795887Z",
    "vehicle_class": "STANDARD",
    "pickup": {
      "lat": 50.4501,
      "lon": 30.5234
    },
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "payment_method": "CASH",
    "price_minor": 10517,
    "currency": "UAH",
    "distance_m": 211
  }
]
```

`POST /api/driver/v1/offers/e3ab411d-93d5-460f-8c1b-f2be3cbcb69e/accept` → **200**

```json
{
  "command_id": "ee0f0649-6049-494c-a6ef-0fabcb6583c0"
}
```

```json
{
  "id": "339e0f26-072a-4588-9fbf-d572c3e0f193",
  "order_id": "f46583bb-cd87-48ca-8ac4-1b37c1b0d164",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e75035e4-5aa5-4384-ae7a-6c5495d26a7f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e75035e4-5aa5-4384-ae7a-6c5495d26a7f",
  "order_id": "f46583bb-cd87-48ca-8ac4-1b37c1b0d164",
  "assignment_id": "339e0f26-072a-4588-9fbf-d572c3e0f193",
  "phase": "TO_PICKUP",
  "version": 0,
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "price_minor": 10517,
  "currency": "UAH",
  "arrived_at": null,
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

(the car drives 2 s to the next point)

`POST /api/driver/v1/work-sessions/1ae71f57-e430-4d1b-9895-d6b803d34575/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T18:59:36Z",
    "sequence": 1793386776472
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1ae71f57-e430-4d1b-9895-d6b803d34575",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T18:59:36.065941Z",
  "last_location_at": "2026-10-30T18:59:36.065941Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/e75035e4-5aa5-4384-ae7a-6c5495d26a7f/arrive` → **200**

```json
{
  "command_id": "2de58376-f9d6-4843-85a8-07ab63e6be7e",
  "expected_version": 0
}
```

```json
{
  "id": "e75035e4-5aa5-4384-ae7a-6c5495d26a7f",
  "order_id": "f46583bb-cd87-48ca-8ac4-1b37c1b0d164",
  "assignment_id": "339e0f26-072a-4588-9fbf-d572c3e0f193",
  "phase": "WAITING",
  "version": 1,
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "price_minor": 10517,
  "currency": "UAH",
  "arrived_at": "2026-10-30T18:59:36.314848Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/e75035e4-5aa5-4384-ae7a-6c5495d26a7f/start` → **200**

```json
{
  "command_id": "1161a699-20ee-4d2b-9ba7-e2ac29658d7b",
  "expected_version": 1
}
```

```json
{
  "id": "e75035e4-5aa5-4384-ae7a-6c5495d26a7f",
  "order_id": "f46583bb-cd87-48ca-8ac4-1b37c1b0d164",
  "assignment_id": "339e0f26-072a-4588-9fbf-d572c3e0f193",
  "phase": "IN_PROGRESS",
  "version": 2,
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "price_minor": 10517,
  "currency": "UAH",
  "arrived_at": "2026-10-30T18:59:36.314848Z",
  "started_at": "2026-10-30T18:59:36.563577Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/e75035e4-5aa5-4384-ae7a-6c5495d26a7f/complete` → **200**

```json
{
  "command_id": "6b239434-f829-45a5-81ca-54cde0bdf92a",
  "expected_version": 2,
  "reported_at": "2026-10-30T18:59:36Z",
  "cash_received": true
}
```

```json
{
  "id": "e75035e4-5aa5-4384-ae7a-6c5495d26a7f",
  "order_id": "f46583bb-cd87-48ca-8ac4-1b37c1b0d164",
  "assignment_id": "339e0f26-072a-4588-9fbf-d572c3e0f193",
  "phase": "COMPLETED",
  "version": 3,
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "price_minor": 10517,
  "currency": "UAH",
  "arrived_at": "2026-10-30T18:59:36.314848Z",
  "started_at": "2026-10-30T18:59:36.563577Z",
  "completed_at": "2026-10-30T18:59:36.829729Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "b5265a77-933a-4cb3-a849-5946512427b2",
  "balances": [
    {
      "currency": "UAH",
      "balance_minor": 3000,
      "reserved_minor": 0,
      "available_minor": 3000
    }
  ],
  "entries": [
    {
      "id": "8a9cf359-5e55-4d98-8cfd-9df1bbc672c2",
      "at": "2026-10-30T18:59:37.801535Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "f46583bb-cd87-48ca-8ac4-1b37c1b0d164"
    },
    {
      "id": "c21393cd-b972-45af-affd-b6607e5378c6",
      "at": "2026-10-30T18:59:31.221076Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "50e6407f-123d-42ca-9890-64ec61c07dce",
      "order_id": null
    }
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/c1e9515a-caf1-497a-bef1-fae28d9a96ac/archive` → **200**

```json
{
  "command_id": "5d13ddc9-522c-44fd-bd66-0189ac04a572",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "c1e9515a-caf1-497a-bef1-fae28d9a96ac",
  "name": "Осінь −10 %",
  "kind": "DISCOUNT",
  "value_type": "PERCENT",
  "value": 1000,
  "currency": null,
  "conditions": {
    "city_id": "5a000000-0000-4000-8000-000000000001",
    "vehicle_class": null,
    "every_nth_trip": null,
    "days_of_week": null,
    "time_from": null,
    "time_to": null,
    "pickup_zone_id": null,
    "dropoff_zone_id": null,
    "starts_at": null,
    "ends_at": null
  },
  "state": "ARCHIVED",
  "version": 2,
  "created_by": "50e6407f-123d-42ca-9890-64ec61c07dce",
  "created_at": "2026-10-30T18:59:30.235444Z",
  "updated_at": "2026-10-30T18:59:40.342578Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1ae71f57-e430-4d1b-9895-d6b803d34575",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T18:59:36.065941Z",
  "last_location_at": "2026-10-30T18:59:36.065941Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/1ae71f57-e430-4d1b-9895-d6b803d34575/close` → **200**

```json
{
  "command_id": "11a4d0a0-b2be-4bee-9090-ff4709c4ca9f",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": null,
  "session_version": 0,
  "session_state": "CLOSED",
  "intent": null,
  "connection": "DISCONNECTED",
  "geolocation": "UNAVAILABLE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": null,
  "vehicle_id": null,
  "last_heartbeat_at": null,
  "last_location_at": null,
  "eligible": false,
  "ineligible_reasons": [
    "NO_OPEN_SESSION"
  ]
}
```

Done: order f46583bb-cd87-48ca-8ac4-1b37c1b0d164.

# Scenario: broadcast-abuse

## Anna goes online in Warsaw

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000002",
  "device_ref": "sandbox-2416"
}
```

```json
{
  "challenge_id": "632619e6-2181-4abd-a5ca-b95a8af8367d",
  "expires_at": "2026-10-30T19:04:41.084639709Z",
  "resend_available_at": "2026-10-30T18:59:42.084639709Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000002` → **200**

```json
{
  "phone": "+48500000002",
  "audience": "DRIVER",
  "code": "166625",
  "sent_at": "2026-10-30T18:59:41.087591255Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "632619e6-2181-4abd-a5ca-b95a8af8367d",
  "code": "166625",
  "device_ref": "sandbox-2416"
}
```

```json
{
  "session_id": "4a7abfa9-37c9-4261-8897-76c8502000ee",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000405"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDUiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4NzY4MSwiaWF0IjoxNzkzMzg2NzgxLCJqdGkiOiI0NWYzZDVjNC02MGE3LTQyNmItOGRhZi1mNjQ5ZTE0Y2ExYWQiLCJzaWQiOiI0YTdhYmZhOS0zN2M5LTQyNjEtODg5Ny03NmM4NTAyMDAwZWUifQ.dORL-EI2H1TmlwR9Gy-DzcPuopDD9nHDj4Mn3T35i_U",
  "access_expires_at": "2026-10-30T19:14:41.487088903Z",
  "refresh_token": "vwKP1tiNtEUg-tz5sqWzFAuwkSFpHRSHaByi1012Y0k",
  "refresh_expires_at": "2026-11-29T18:59:41.48658191Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": null,
  "session_version": 0,
  "session_state": "CLOSED",
  "intent": null,
  "connection": "DISCONNECTED",
  "geolocation": "UNAVAILABLE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": null,
  "vehicle_id": null,
  "last_heartbeat_at": null,
  "last_location_at": null,
  "eligible": false,
  "ineligible_reasons": [
    "NO_OPEN_SESSION"
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": null,
  "session_version": 0,
  "session_state": "CLOSED",
  "intent": null,
  "connection": "DISCONNECTED",
  "geolocation": "UNAVAILABLE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": null,
  "vehicle_id": null,
  "last_heartbeat_at": null,
  "last_location_at": null,
  "eligible": false,
  "ineligible_reasons": [
    "NO_OPEN_SESSION"
  ]
}
```

`POST /api/driver/v1/work-sessions` → **201**

```json
{
  "command_id": "0b3da5b5-1f36-45a8-ab34-e6ba63ea932c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000505",
  "location": {
    "lat": 52.2297,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T18:59:42Z",
    "sequence": 1793386782273
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "a99967b8-fc02-4743-b7d8-bacd2c456741",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "vehicle_id": "5a000000-0000-4000-8000-000000000505",
  "last_heartbeat_at": "2026-10-30T18:59:42.29176Z",
  "last_location_at": "2026-10-30T18:59:42.29176Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## 5 seconds later her phone reports Lviv: not taken as her position

`POST /api/driver/v1/work-sessions/a99967b8-fc02-4743-b7d8-bacd2c456741/heartbeat` → **200**

```json
{
  "location": {
    "lat": 49.8397,
    "lon": 24.0297,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T18:59:47Z",
    "sequence": 1793386787528
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "a99967b8-fc02-4743-b7d8-bacd2c456741",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "vehicle_id": "5a000000-0000-4000-8000-000000000505",
  "last_heartbeat_at": "2026-10-30T18:59:47.546233Z",
  "last_location_at": "2026-10-30T18:59:42.29176Z",
  "eligible": false,
  "ineligible_reasons": [
    "LOCATION_STALE"
  ],
  "accepted": false
}
```

## The operator's map still shows her in Warsaw

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "OPERATOR",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "ba42f4f5-f11c-4f01-9d30-28f8765a1520",
  "subject": {
    "type": "STAFF",
    "id": "50e6407f-123d-42ca-9890-64ec61c07dce"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MGU2NDA3Zi0xMjNkLTQyY2EtOTg5MC02NGVjNjFjMDdkY2UiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODc2ODgsImlhdCI6MTc5MzM4Njc4OCwianRpIjoiNzA4MjVmZTItODgwYS00NGU0LWE0YjAtY2I1MWZlOGU0ZTAyIiwic2lkIjoiYmE0MmY0ZjUtZjExYy00ZjAxLTlkMzAtMjhmODc2NWExNTIwIn0.AJUxPSw9dkjO1iM7wupQt-ZYOpI0r7m4Ph2Zyjys93U",
  "access_expires_at": "2026-10-30T19:14:48.057517563Z",
  "refresh_token": "nsCdzO7u9sMAUK9ifMJABroPalR6RzycdbcYuWrHABc",
  "refresh_expires_at": "2026-10-31T06:59:48.056904685Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "at": "2026-10-30T18:59:48.298471056Z",
  "drivers": [
    {
      "driver_id": "5a000000-0000-4000-8000-000000000405",
      "name": "Anna Wiśniewska",
      "car": {
        "registration_number": "WA0002T",
        "make": "Kia",
        "model": "Ceed",
        "color": "blue",
        "classes": [
          "STANDARD"
        ]
      },
      "has_payment_terminal": false,
      "status": "NO_SIGNAL",
      "occupancy": "FREE",
      "connection": "CONNECTED",
      "geolocation": "STALE",
      "location": {
        "lat": 52.2297,
        "lon": 21.0122
      },
      "last_location_at": "2026-10-30T18:59:42.29176Z",
      "last_heartbeat_at": "2026-10-30T18:59:47.546233Z",
      "order_id": null
    }
  ]
}
```

## A fix next to the last accepted one is taken again

`POST /api/driver/v1/work-sessions/a99967b8-fc02-4743-b7d8-bacd2c456741/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2299,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T18:59:48Z",
    "sequence": 1793386788549
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "a99967b8-fc02-4743-b7d8-bacd2c456741",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "vehicle_id": "5a000000-0000-4000-8000-000000000505",
  "last_heartbeat_at": "2026-10-30T18:59:48.568616Z",
  "last_location_at": "2026-10-30T18:59:48.568616Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

Done: the jump to Lviv was refused, the map kept Warsaw, the next plausible fix was accepted.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "a99967b8-fc02-4743-b7d8-bacd2c456741",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "vehicle_id": "5a000000-0000-4000-8000-000000000505",
  "last_heartbeat_at": "2026-10-30T18:59:48.568616Z",
  "last_location_at": "2026-10-30T18:59:48.568616Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a99967b8-fc02-4743-b7d8-bacd2c456741/close` → **200**

```json
{
  "command_id": "2e2557f2-e643-4935-8294-d5a9ed7bb0ab",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": null,
  "session_version": 0,
  "session_state": "CLOSED",
  "intent": null,
  "connection": "DISCONNECTED",
  "geolocation": "UNAVAILABLE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": null,
  "vehicle_id": null,
  "last_heartbeat_at": null,
  "last_location_at": null,
  "eligible": false,
  "ineligible_reasons": [
    "NO_OPEN_SESSION"
  ]
}
```

# Scenario: broadcast-claims

## Nobody is online in Warsaw; Piotr signs in on two phones, Anna goes online 10 km from the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000001",
  "device_ref": "sandbox-21450"
}
```

```json
{
  "challenge_id": "6d142898-a2d2-4235-b2cb-068089499d30",
  "expires_at": "2026-10-30T19:04:49.321179628Z",
  "resend_available_at": "2026-10-30T18:59:50.321179628Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "872332",
  "sent_at": "2026-10-30T18:59:49.324252408Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6d142898-a2d2-4235-b2cb-068089499d30",
  "code": "872332",
  "device_ref": "sandbox-21450"
}
```

```json
{
  "session_id": "ba90b11f-d428-45d1-8d60-c768befa758d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4NzY4OSwiaWF0IjoxNzkzMzg2Nzg5LCJqdGkiOiIyNjEwOTZiZi1iMGQyLTQ5NDAtOWFjOS00OGM0MDE4YmFhNWEiLCJzaWQiOiJiYTkwYjExZi1kNDI4LTQ1ZDEtOGQ2MC1jNzY4YmVmYTc1OGQifQ.3Tf_Wg3GTC6kFWHxppRfCx5dLW05Eq4RhTk7WK1Q3Yc",
  "access_expires_at": "2026-10-30T19:14:49.594256855Z",
  "refresh_token": "ckx4MQ7ZjaKGJWchqH9v7vOnsPvlayFMcN-Awyt5j4o",
  "refresh_expires_at": "2026-11-29T18:59:49.593737895Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": null,
  "session_version": 0,
  "session_state": "CLOSED",
  "intent": null,
  "connection": "DISCONNECTED",
  "geolocation": "UNAVAILABLE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": null,
  "vehicle_id": null,
  "last_heartbeat_at": null,
  "last_location_at": null,
  "eligible": false,
  "ineligible_reasons": [
    "NO_OPEN_SESSION"
  ]
}
```

`POST /auth/v1/otp/challenges` → **429**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000001",
  "device_ref": "sandbox-26549"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "6a912767-9233-44c9-b227-8c85076434dc",
  "retryable": true,
  "retry_after_seconds": 1
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000001",
  "device_ref": "sandbox-26549"
}
```

```json
{
  "challenge_id": "7eca9a3a-bf0f-48b3-987d-090c8f9941c8",
  "expires_at": "2026-10-30T19:04:51.333426539Z",
  "resend_available_at": "2026-10-30T18:59:52.333426539Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "698329",
  "sent_at": "2026-10-30T18:59:51.337750511Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7eca9a3a-bf0f-48b3-987d-090c8f9941c8",
  "code": "698329",
  "device_ref": "sandbox-26549"
}
```

```json
{
  "session_id": "f1f59372-858f-459a-be62-1930e49c179c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4NzY5MSwiaWF0IjoxNzkzMzg2NzkxLCJqdGkiOiJlMmIxYzNhYi0zYTUxLTRiYmMtOGQ1YS02YmQ2ZTdmMDExMTkiLCJzaWQiOiJmMWY1OTM3Mi04NThmLTQ1OWEtYmU2Mi0xOTMwZTQ5YzE3OWMifQ.i3HFdIFa-8gK-UV-TA74HsTErm5RoEqsXqGyvnQJJ3E",
  "access_expires_at": "2026-10-30T19:14:51.605410122Z",
  "refresh_token": "k2m8toPqEy_MQ2gNEE9n7mWuknU9oUzGV-B7HTt2n_U",
  "refresh_expires_at": "2026-11-29T18:59:51.60487745Z",
  "account_created": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000002",
  "device_ref": "sandbox-25614"
}
```

```json
{
  "challenge_id": "635e0872-e9ce-4e3d-93f0-a0ea1d834ed5",
  "expires_at": "2026-10-30T19:04:51.839536282Z",
  "resend_available_at": "2026-10-30T18:59:52.839536282Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000002` → **200**

```json
{
  "phone": "+48500000002",
  "audience": "DRIVER",
  "code": "219216",
  "sent_at": "2026-10-30T18:59:51.841998184Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "635e0872-e9ce-4e3d-93f0-a0ea1d834ed5",
  "code": "219216",
  "device_ref": "sandbox-25614"
}
```

```json
{
  "session_id": "7127b59f-7273-427e-b86f-4a96002dc207",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000405"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDUiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4NzY5MiwiaWF0IjoxNzkzMzg2NzkyLCJqdGkiOiJkZWFlNTM2Zi0yM2FiLTQ0NDctYWYyZS0yNDJjMDA1OThkNjMiLCJzaWQiOiI3MTI3YjU5Zi03MjczLTQyN2UtYjg2Zi00YTk2MDAyZGMyMDcifQ.WbSohS1Hpqps_BNC-yij_yOybeHMZ1yOT5sKrpQHWvc",
  "access_expires_at": "2026-10-30T19:14:52.1042938Z",
  "refresh_token": "tMM42a5ZDFe_3aDgee3WAa64xYMvhUQcQEPiJRXfX6o",
  "refresh_expires_at": "2026-11-29T18:59:52.103725655Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": null,
  "session_version": 0,
  "session_state": "CLOSED",
  "intent": null,
  "connection": "DISCONNECTED",
  "geolocation": "UNAVAILABLE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": null,
  "vehicle_id": null,
  "last_heartbeat_at": null,
  "last_location_at": null,
  "eligible": false,
  "ineligible_reasons": [
    "NO_OPEN_SESSION"
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": null,
  "session_version": 0,
  "session_state": "CLOSED",
  "intent": null,
  "connection": "DISCONNECTED",
  "geolocation": "UNAVAILABLE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": null,
  "vehicle_id": null,
  "last_heartbeat_at": null,
  "last_location_at": null,
  "eligible": false,
  "ineligible_reasons": [
    "NO_OPEN_SESSION"
  ]
}
```

(the car drives 184 s to the next point)

`POST /api/driver/v1/work-sessions` → **201**

```json
{
  "command_id": "69362f51-dd38-482d-ba5c-c396b4ca91bd",
  "vehicle_id": "5a000000-0000-4000-8000-000000000505",
  "location": {
    "lat": 52.2297,
    "lon": 21.1700,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:02:56Z",
    "sequence": 1793386976841
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "a21497d5-4f8c-4fe6-85fb-be4913f0ff29",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "vehicle_id": "5a000000-0000-4000-8000-000000000505",
  "last_heartbeat_at": "2026-10-30T19:02:56.859208Z",
  "last_location_at": "2026-10-30T19:02:56.859208Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders: nobody is near, the order goes to the ALL tab

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600155109",
  "device_ref": "sandbox-411"
}
```

```json
{
  "challenge_id": "88979c56-891c-4dc6-a30a-4783680d14cc",
  "expires_at": "2026-10-30T19:07:57.140035609Z",
  "resend_available_at": "2026-10-30T19:02:58.140035609Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600155109` → **200**

```json
{
  "phone": "+48600155109",
  "audience": "CLIENT",
  "code": "000505",
  "sent_at": "2026-10-30T19:02:57.142443373Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "88979c56-891c-4dc6-a30a-4783680d14cc",
  "code": "000505",
  "device_ref": "sandbox-411"
}
```

```json
{
  "session_id": "8816bd04-8e0a-40a2-978a-39c9204628f1",
  "subject": {
    "type": "CLIENT",
    "id": "3540cd7f-3272-44bd-b117-6f9327c9fb6c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzNTQwY2Q3Zi0zMjcyLTQ0YmQtYjExNy02ZjkzMjdjOWZiNmMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzg3ODc3LCJpYXQiOjE3OTMzODY5NzcsImp0aSI6IjhiZDM1MDZiLTVjODQtNDc2Mi05Yjk1LTQ4NDIyMDM3MTI4NyIsInNpZCI6Ijg4MTZiZDA0LThlMGEtNDBhMi05NzhhLTM5YzkyMDQ2MjhmMSJ9.JcM_ABJZuULR8yyZfYI8BDvtroW6sAjn7Xdvc8aSmFU",
  "access_expires_at": "2026-10-30T19:17:57.465207964Z",
  "refresh_token": "S5iVEqdT7B6W375s3wgrKQiHO9ZLSJoQWE4YMqp3ukA",
  "refresh_expires_at": "2026-11-29T19:02:57.464730947Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a78213c3-d1cf-4105-b549-e0c8b8c71324",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  }
}
```

```json
{
  "id": "5184dd14-a1a9-4b6c-93da-15455b0be924",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 4942,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T19:07:57.714860Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false,
  "discount_minor": 0,
  "to_pay_minor": 4942,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "802beebe-0d7d-4c8c-bca1-a22c28a764ae",
  "quote_id": "5184dd14-a1a9-4b6c-93da-15455b0be924",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "pickup_label": "PKiN",
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "dropoff_label": "Lotnisko",
  "payment_method": "CASH"
}
```

```json
{
  "id": "d7bbecf8-edcd-44bd-9eb2-3b0d06e7ba37",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3540cd7f-3272-44bd-b117-6f9327c9fb6c",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "pickup_label": "PKiN",
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "dropoff_label": "Lotnisko",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 4942,
  "final_price_minor": null,
  "currency": "PLN",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T19:02:57.988195Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/d7bbecf8-edcd-44bd-9eb2-3b0d06e7ba37` → **200**

```json
{
  "id": "d7bbecf8-edcd-44bd-9eb2-3b0d06e7ba37",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3540cd7f-3272-44bd-b117-6f9327c9fb6c",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "pickup_label": "PKiN",
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "dropoff_label": "Lotnisko",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 4942,
  "final_price_minor": null,
  "currency": "PLN",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T19:02:57.988195Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

## Anna, 10 km away, does not see it, and her claim is refused: the order stays in the ALL tab

`GET /api/driver/v1/broadcast-orders` → **200**

```json
[]
```

`POST /api/driver/v1/orders/d7bbecf8-edcd-44bd-9eb2-3b0d06e7ba37/claim` → **422**

```json
{
  "command_id": "ba86686a-b260-41e6-8293-24cd4f1dc2b6"
}
```

```json
{
  "instance": "/api/driver/v1/orders/d7bbecf8-edcd-44bd-9eb2-3b0d06e7ba37/claim",
  "status": 422,
  "title": "Pickup too far",
  "type": "https://errors.blizz.taxi/pickup-too-far",
  "code": "PICKUP_TOO_FAR",
  "correlation_id": "fb1f0af7-1aa1-4225-9d5d-1c73e1ac468f"
}
```

`GET /api/rider/v1/orders/d7bbecf8-edcd-44bd-9eb2-3b0d06e7ba37` → **200**

```json
{
  "id": "d7bbecf8-edcd-44bd-9eb2-3b0d06e7ba37",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3540cd7f-3272-44bd-b117-6f9327c9fb6c",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "pickup_label": "PKiN",
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "dropoff_label": "Lotnisko",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 4942,
  "final_price_minor": null,
  "currency": "PLN",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T19:02:57.988195Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

## A script on Anna's phone keeps claiming: from the 31st claim in 10 minutes, 429

`POST /api/driver/v1/orders/865ec6a5-5d69-4303-8cd0-e19f74038f3f/claim` → **404**

```json
{
  "command_id": "08355b9e-9c98-476d-8afc-8c0707f501df"
}
```

```json
{
  "instance": "/api/driver/v1/orders/865ec6a5-5d69-4303-8cd0-e19f74038f3f/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "2af9e0ce-86bf-40bf-ab2f-b888fe783ff5"
}
```

`POST /api/driver/v1/orders/78309ba6-fce4-498b-9593-73deb564fd58/claim` → **404**

```json
{
  "command_id": "879ef395-ed1f-4ec0-8eb6-b82b14fc3ec8"
}
```

```json
{
  "instance": "/api/driver/v1/orders/78309ba6-fce4-498b-9593-73deb564fd58/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "79cf3a96-5fac-4456-bccf-e0d6acda9a8a"
}
```

`POST /api/driver/v1/orders/6b367b4c-b6bc-4116-8dd4-05635241b72a/claim` → **404**

```json
{
  "command_id": "26bef5d4-bcd2-49aa-b0d0-3997079e8051"
}
```

```json
{
  "instance": "/api/driver/v1/orders/6b367b4c-b6bc-4116-8dd4-05635241b72a/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "a8c59780-de43-42f8-bbf8-d50e851b8d59"
}
```

`POST /api/driver/v1/orders/de0a95e5-ff24-4653-8df4-24bafb2fd218/claim` → **404**

```json
{
  "command_id": "36588a12-f72a-4f6f-a172-205b46179fd4"
}
```

```json
{
  "instance": "/api/driver/v1/orders/de0a95e5-ff24-4653-8df4-24bafb2fd218/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "760e4a99-7f37-45b6-bd1e-b3ee210a2b6c"
}
```

`POST /api/driver/v1/orders/bd6fd4e9-3d25-4946-a646-7427a3a300b4/claim` → **404**

```json
{
  "command_id": "c961b15d-d141-499b-b70a-92bfd167afe9"
}
```

```json
{
  "instance": "/api/driver/v1/orders/bd6fd4e9-3d25-4946-a646-7427a3a300b4/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "5cf7f83c-4e82-44e1-940d-31b33348bd3f"
}
```

`POST /api/driver/v1/orders/496b550b-e810-4fc7-b912-fc9b5ab6fad6/claim` → **404**

```json
{
  "command_id": "da277b88-3efd-40b8-8a8a-6b7c14f95a57"
}
```

```json
{
  "instance": "/api/driver/v1/orders/496b550b-e810-4fc7-b912-fc9b5ab6fad6/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "78779f11-5dc9-4c56-b9bf-0d5b39348a04"
}
```

`POST /api/driver/v1/orders/02755ff7-ac6a-4942-b432-fc567682c00c/claim` → **404**

```json
{
  "command_id": "ba28ee42-1931-496c-bfa6-28bfff4f5726"
}
```

```json
{
  "instance": "/api/driver/v1/orders/02755ff7-ac6a-4942-b432-fc567682c00c/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "f90fbac8-9579-4a45-915a-63865c75a7f6"
}
```

`POST /api/driver/v1/orders/7642eb96-2e7a-45d8-ae8e-f0eb9fb8b3ce/claim` → **404**

```json
{
  "command_id": "307eb166-f218-425c-bc81-281af837c4c4"
}
```

```json
{
  "instance": "/api/driver/v1/orders/7642eb96-2e7a-45d8-ae8e-f0eb9fb8b3ce/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "a0445883-7725-46d5-8ac4-1140d06b7978"
}
```

`POST /api/driver/v1/orders/75ecedad-94d9-48e8-a78a-b81c361c5f13/claim` → **404**

```json
{
  "command_id": "f56871ad-c38e-4f6c-99d9-7e5b6391dd6a"
}
```

```json
{
  "instance": "/api/driver/v1/orders/75ecedad-94d9-48e8-a78a-b81c361c5f13/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "f690ba3b-66ff-4ac0-8669-1ce9cd3385c5"
}
```

`POST /api/driver/v1/orders/3436087b-ec0c-4700-b2b4-c56b94a3be5a/claim` → **404**

```json
{
  "command_id": "abea716a-b248-48fa-9467-8f981c73f52f"
}
```

```json
{
  "instance": "/api/driver/v1/orders/3436087b-ec0c-4700-b2b4-c56b94a3be5a/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "4f598bb0-921c-43c1-be35-94b31c37d44e"
}
```

`POST /api/driver/v1/orders/39473669-05b7-49fb-a2dd-3bf9da820ae4/claim` → **404**

```json
{
  "command_id": "52a327ea-68fb-46c6-88a6-aeac38d5f255"
}
```

```json
{
  "instance": "/api/driver/v1/orders/39473669-05b7-49fb-a2dd-3bf9da820ae4/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "18467d81-e1b8-4202-b0b5-22ac431ba035"
}
```

`POST /api/driver/v1/orders/806187c1-24b4-4380-a8a1-4a67d2e42140/claim` → **404**

```json
{
  "command_id": "bb45ac05-1bd9-4adc-8631-0b7691fe69ae"
}
```

```json
{
  "instance": "/api/driver/v1/orders/806187c1-24b4-4380-a8a1-4a67d2e42140/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "fc231e09-19eb-4820-b16d-c116a582fa8e"
}
```

`POST /api/driver/v1/orders/2ecd2490-b71a-47c7-ba59-58eca45bc46b/claim` → **404**

```json
{
  "command_id": "5086265e-9c84-46de-baa6-270fb703bb70"
}
```

```json
{
  "instance": "/api/driver/v1/orders/2ecd2490-b71a-47c7-ba59-58eca45bc46b/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "ef4ebb63-2d9e-45a3-a444-ad4aa35a90d1"
}
```

`POST /api/driver/v1/orders/413281b4-8035-4b48-8691-e59a98ffb663/claim` → **404**

```json
{
  "command_id": "4343376f-61e5-4989-a0dd-2ed2f4c0b881"
}
```

```json
{
  "instance": "/api/driver/v1/orders/413281b4-8035-4b48-8691-e59a98ffb663/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "f2d38e12-7571-4cfc-bf5c-3126cbf8329b"
}
```

`POST /api/driver/v1/orders/d75252c6-0a3a-407f-b637-6a973647d3c3/claim` → **404**

```json
{
  "command_id": "3b2d4954-047e-4a17-bf4e-ea8dee883306"
}
```

```json
{
  "instance": "/api/driver/v1/orders/d75252c6-0a3a-407f-b637-6a973647d3c3/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "1ec27cb4-4116-4f87-98c3-233c92a9c15a"
}
```

`POST /api/driver/v1/orders/60b59cb7-382d-4982-9511-b3d164d22756/claim` → **404**

```json
{
  "command_id": "92e4c2c6-bd67-4986-8b8d-24d5f5bcc853"
}
```

```json
{
  "instance": "/api/driver/v1/orders/60b59cb7-382d-4982-9511-b3d164d22756/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "eb96b54e-2e40-454c-b5f9-e4371ee99a5c"
}
```

`POST /api/driver/v1/orders/70d370e4-2bd7-407c-81f5-3641c66aaabb/claim` → **404**

```json
{
  "command_id": "f1a8d868-b35b-43f3-9953-88e2ed7ac409"
}
```

```json
{
  "instance": "/api/driver/v1/orders/70d370e4-2bd7-407c-81f5-3641c66aaabb/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "cdc8012b-2570-4b26-945e-f78c89faed02"
}
```

`POST /api/driver/v1/orders/d5794a60-f4fc-4026-9ef1-b55b60a11f89/claim` → **404**

```json
{
  "command_id": "b29c6ddc-320b-412e-bb52-11b072b9829b"
}
```

```json
{
  "instance": "/api/driver/v1/orders/d5794a60-f4fc-4026-9ef1-b55b60a11f89/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "9c930df3-4e59-4a5a-af95-9dfda889370c"
}
```

`POST /api/driver/v1/orders/d140a914-d0db-4a69-8922-bc093ce7d697/claim` → **404**

```json
{
  "command_id": "49f28ec6-5e83-47c0-bcda-0beaf48e3665"
}
```

```json
{
  "instance": "/api/driver/v1/orders/d140a914-d0db-4a69-8922-bc093ce7d697/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "2aac31e1-8afa-4be5-b4c3-b681a91e9a74"
}
```

`POST /api/driver/v1/orders/8cbec09b-7a01-40ff-8c5d-e7a797c0acf0/claim` → **404**

```json
{
  "command_id": "2b8c7720-4e85-4af5-83be-6058627b1722"
}
```

```json
{
  "instance": "/api/driver/v1/orders/8cbec09b-7a01-40ff-8c5d-e7a797c0acf0/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "23f04b26-4744-46b8-a9c2-19070d15059f"
}
```

`POST /api/driver/v1/orders/e808a3d3-7d96-41d0-a485-d6c76f97d2fc/claim` → **404**

```json
{
  "command_id": "a4607842-c549-418c-9857-131297c9d48f"
}
```

```json
{
  "instance": "/api/driver/v1/orders/e808a3d3-7d96-41d0-a485-d6c76f97d2fc/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "6cb66294-c023-4236-88ba-92a0de9221ba"
}
```

`POST /api/driver/v1/orders/41a808a2-57ab-4827-b57e-95f536154591/claim` → **404**

```json
{
  "command_id": "d12ae112-d09d-481d-9da5-a436e17ddfd6"
}
```

```json
{
  "instance": "/api/driver/v1/orders/41a808a2-57ab-4827-b57e-95f536154591/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "6be631dd-7e95-43bf-90b1-8e72e8b36bd9"
}
```

`POST /api/driver/v1/orders/5547225e-5a53-4f64-92eb-e3cc8a68ac04/claim` → **404**

```json
{
  "command_id": "1c534760-6fb0-45c3-8dec-44c94e13f687"
}
```

```json
{
  "instance": "/api/driver/v1/orders/5547225e-5a53-4f64-92eb-e3cc8a68ac04/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "3ef03f51-128e-4334-bb26-835a1ffb8eba"
}
```

`POST /api/driver/v1/orders/daae110c-6de2-455c-b3a3-c4cd12d9d1f4/claim` → **404**

```json
{
  "command_id": "45fda0a4-c134-4872-8436-40d2a1fd015e"
}
```

```json
{
  "instance": "/api/driver/v1/orders/daae110c-6de2-455c-b3a3-c4cd12d9d1f4/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "54891ae7-1eb7-4ca9-905a-6fc7b46b3a9e"
}
```

`POST /api/driver/v1/orders/1997da9b-f294-418c-a7d1-594e97d43936/claim` → **404**

```json
{
  "command_id": "99a4919c-cdcb-4719-8ad3-a879b64fd5a0"
}
```

```json
{
  "instance": "/api/driver/v1/orders/1997da9b-f294-418c-a7d1-594e97d43936/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "bc65c269-4985-4013-bdbb-926741b451d3"
}
```

`POST /api/driver/v1/orders/5204e372-c118-437b-bd77-8e13036c0d31/claim` → **404**

```json
{
  "command_id": "7672a256-3fc9-4d51-b684-5c6c4398528b"
}
```

```json
{
  "instance": "/api/driver/v1/orders/5204e372-c118-437b-bd77-8e13036c0d31/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "144b0ebe-3027-4004-8766-f28a6df263f3"
}
```

`POST /api/driver/v1/orders/8e86b54f-6452-4f60-b59e-af48f5feaed7/claim` → **404**

```json
{
  "command_id": "d3ca5bf3-0d8c-4597-aa23-e8550721b14a"
}
```

```json
{
  "instance": "/api/driver/v1/orders/8e86b54f-6452-4f60-b59e-af48f5feaed7/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "358d1b72-1215-4d2c-9085-93dd5e8a554f"
}
```

`POST /api/driver/v1/orders/e3eb9ce3-65c2-447a-9b24-9e83c8817937/claim` → **404**

```json
{
  "command_id": "70b13232-c769-463b-87f9-e8a73e7ff448"
}
```

```json
{
  "instance": "/api/driver/v1/orders/e3eb9ce3-65c2-447a-9b24-9e83c8817937/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "cd42bfc5-054b-42ba-afe3-f9120519d472"
}
```

`POST /api/driver/v1/orders/67fc1f60-9025-4619-9269-86aded55baab/claim` → **404**

```json
{
  "command_id": "1150fb5d-e69e-4991-bce5-6680287621b2"
}
```

```json
{
  "instance": "/api/driver/v1/orders/67fc1f60-9025-4619-9269-86aded55baab/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "a7f52703-4f7e-4938-8bb3-1ef0e38867da"
}
```

`POST /api/driver/v1/orders/0ecd6733-f91d-4ac7-a2cc-d1a2f8522acd/claim` → **429**

```json
{
  "command_id": "eeb3071d-25b2-47cd-81b3-543e4edd86d0"
}
```

```json
{
  "instance": "/api/driver/v1/orders/0ecd6733-f91d-4ac7-a2cc-d1a2f8522acd/claim",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "f49d8ab3-1c20-44f8-be8d-f24fea2015eb",
  "retryable": true,
  "retry_after_seconds": 593
}
```

## Piotr goes online next to the pickup on his phone; his other phone cannot claim, the phone with the shift can

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": null,
  "session_version": 0,
  "session_state": "CLOSED",
  "intent": null,
  "connection": "DISCONNECTED",
  "geolocation": "UNAVAILABLE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": null,
  "vehicle_id": null,
  "last_heartbeat_at": null,
  "last_location_at": null,
  "eligible": false,
  "ineligible_reasons": [
    "NO_OPEN_SESSION"
  ]
}
```

`POST /api/driver/v1/work-sessions` → **201**

```json
{
  "command_id": "061a1885-e7f7-43f8-b12e-88fa1260d860",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:03:07Z",
    "sequence": 1793386987183
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "eb9f38a9-6e17-4cd5-950e-9a34eca70df0",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "last_heartbeat_at": "2026-10-30T19:03:07.202004Z",
  "last_location_at": "2026-10-30T19:03:07.202004Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/broadcast-orders` → **200**

```json
[
  {
    "order_id": "d7bbecf8-edcd-44bd-9eb2-3b0d06e7ba37",
    "vehicle_class": "STANDARD",
    "pickup": {
      "lat": 52.2297,
      "lon": 21.0122
    },
    "pickup_label": "PKiN",
    "dropoff_label": "Lotnisko",
    "payment_method": "CASH",
    "price_minor": 4942,
    "currency": "PLN",
    "distance_m": 590
  }
]
```

`POST /api/driver/v1/orders/d7bbecf8-edcd-44bd-9eb2-3b0d06e7ba37/claim` → **409**

```json
{
  "command_id": "e38a281c-493e-4fdd-8c17-0c57c11b33e9"
}
```

```json
{
  "instance": "/api/driver/v1/orders/d7bbecf8-edcd-44bd-9eb2-3b0d06e7ba37/claim",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "9f0e9092-c440-4e42-809b-6c21e1ef9c0f"
}
```

`POST /api/driver/v1/orders/d7bbecf8-edcd-44bd-9eb2-3b0d06e7ba37/claim` → **200**

```json
{
  "command_id": "341fee08-c344-46f7-bdc3-98e91694f928"
}
```

```json
{
  "id": "183c3494-0b0f-4001-a2a0-3151f95bca6f",
  "order_id": "d7bbecf8-edcd-44bd-9eb2-3b0d06e7ba37",
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "source": "BROADCAST",
  "state": "COMMITTED",
  "trip_id": "6e26486b-9986-4b3d-8749-9f7d86d5a256",
  "trip_phase": "TO_PICKUP"
}
```

## Piotr cancels at the rider's request (sandbox clean-up)

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "6e26486b-9986-4b3d-8749-9f7d86d5a256",
  "order_id": "d7bbecf8-edcd-44bd-9eb2-3b0d06e7ba37",
  "assignment_id": "183c3494-0b0f-4001-a2a0-3151f95bca6f",
  "phase": "TO_PICKUP",
  "version": 0,
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "pickup_label": "PKiN",
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "dropoff_label": "Lotnisko",
  "payment_method": "CASH",
  "price_minor": 4942,
  "currency": "PLN",
  "arrived_at": null,
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/6e26486b-9986-4b3d-8749-9f7d86d5a256/cancel` → **200**

```json
{
  "command_id": "05a49a79-981d-4432-b3ff-a5a6e7d590df",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "6e26486b-9986-4b3d-8749-9f7d86d5a256",
  "order_id": "d7bbecf8-edcd-44bd-9eb2-3b0d06e7ba37",
  "assignment_id": "183c3494-0b0f-4001-a2a0-3151f95bca6f",
  "phase": "ABORTED",
  "version": 1,
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "pickup_label": "PKiN",
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "dropoff_label": "Lotnisko",
  "payment_method": "CASH",
  "price_minor": 4942,
  "currency": "PLN",
  "arrived_at": null,
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

Done: far claim 422, the 31st claim 429, the phone without the shift 409, the phone with it took the order.

`GET /api/rider/v1/orders/d7bbecf8-edcd-44bd-9eb2-3b0d06e7ba37` → **200**

```json
{
  "id": "d7bbecf8-edcd-44bd-9eb2-3b0d06e7ba37",
  "short_number": 4,
  "status": "CANCELLED",
  "status_reason": "PASSENGER_ASKED",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "3540cd7f-3272-44bd-b117-6f9327c9fb6c",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "pickup_label": "PKiN",
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "dropoff_label": "Lotnisko",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 4942,
  "final_price_minor": null,
  "currency": "PLN",
  "search_phase": "STOPPED",
  "assignment": {
    "id": "183c3494-0b0f-4001-a2a0-3151f95bca6f",
    "order_id": "d7bbecf8-edcd-44bd-9eb2-3b0d06e7ba37",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "vehicle_id": "5a000000-0000-4000-8000-000000000504",
    "source": "BROADCAST",
    "state": "RELEASED",
    "trip_id": "6e26486b-9986-4b3d-8749-9f7d86d5a256",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T19:02:57.988195Z",
  "cancellation": {
    "by": "DRIVER",
    "reason_code": "PASSENGER_ASKED",
    "reason_labels": {
      "pl": "Pasażer poprosił o anulowanie",
      "uk": "Пасажир попросив скасувати",
      "en": "Passenger asked to cancel",
      "ru": "Пассажир попросил отменить"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "a21497d5-4f8c-4fe6-85fb-be4913f0ff29",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "vehicle_id": "5a000000-0000-4000-8000-000000000505",
  "last_heartbeat_at": "2026-10-30T19:02:56.859208Z",
  "last_location_at": "2026-10-30T19:02:56.859208Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a21497d5-4f8c-4fe6-85fb-be4913f0ff29/close` → **200**

```json
{
  "command_id": "6b7c8074-029e-415f-a9a7-188863c4b01c",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": null,
  "session_version": 0,
  "session_state": "CLOSED",
  "intent": null,
  "connection": "DISCONNECTED",
  "geolocation": "UNAVAILABLE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": null,
  "vehicle_id": null,
  "last_heartbeat_at": null,
  "last_location_at": null,
  "eligible": false,
  "ineligible_reasons": [
    "NO_OPEN_SESSION"
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "eb9f38a9-6e17-4cd5-950e-9a34eca70df0",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "last_heartbeat_at": "2026-10-30T19:03:07.202004Z",
  "last_location_at": "2026-10-30T19:03:07.202004Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/eb9f38a9-6e17-4cd5-950e-9a34eca70df0/close` → **200**

```json
{
  "command_id": "6c8b4382-68b5-43cd-a483-6d4dc716bea4",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": null,
  "session_version": 0,
  "session_state": "CLOSED",
  "intent": null,
  "connection": "DISCONNECTED",
  "geolocation": "UNAVAILABLE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": null,
  "vehicle_id": null,
  "last_heartbeat_at": null,
  "last_location_at": null,
  "eligible": false,
  "ineligible_reasons": [
    "NO_OPEN_SESSION"
  ]
}
```

# Scenario: call-recording

## The admin says which city the service number belongs to

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "49eff405-fea6-4d7c-b2ec-8c07bd68c7f6",
  "subject": {
    "type": "STAFF",
    "id": "50e6407f-123d-42ca-9890-64ec61c07dce"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MGU2NDA3Zi0xMjNkLTQyY2EtOTg5MC02NGVjNjFjMDdkY2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODc4OTAsImlhdCI6MTc5MzM4Njk5MCwianRpIjoiZmZiMGRmM2ItOGViMy00ZGQ2LTk2MjQtYWNmMGJmMjE4ODkxIiwic2lkIjoiNDllZmY0MDUtZmVhNi00ZDdjLWIyZWMtOGMwN2JkNjhjN2Y2In0.YpthLdo0nAQvjZt8wEnm1qdOxldLhgHcX-qmc-MUIIE",
  "access_expires_at": "2026-10-30T19:18:10.163357823Z",
  "refresh_token": "kWt3dIvsBVYLKmrw_AGFat4gqWhG7ecC2lXbg95NnRY",
  "refresh_expires_at": "2026-10-31T07:03:10.162839412Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/call-lines` → **200**

```json
{
  "lines": []
}
```

`POST /api/admin/v1/call-lines/%2B380441110060` → **200**

```json
{
  "command_id": "3975625e-9f7e-4e47-acda-8e0a67503395",
  "expected_version": 0,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "label": "Kyiv call centre",
  "reason": "Sandbox call-recording scenario"
}
```

```json
{
  "number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "label": "Kyiv call centre",
  "version": 1
}
```

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "OPERATOR",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "150cdbab-6b45-467a-956a-ee3b406e677a",
  "subject": {
    "type": "STAFF",
    "id": "50e6407f-123d-42ca-9890-64ec61c07dce"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MGU2NDA3Zi0xMjNkLTQyY2EtOTg5MC02NGVjNjFjMDdkY2UiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODc4OTEsImlhdCI6MTc5MzM4Njk5MSwianRpIjoiODg0ZTZlZDktNzdhMC00NDQyLWExYWEtODI0YTgwOTMyZDcwIiwic2lkIjoiMTUwY2RiYWItNmI0NS00NjdhLTk1NmEtZWUzYjQwNmU2NzdhIn0.VOzxuLAGPVf5GC0X4kb-vIVZPeNLxmaC7NB5eh_gcFE",
  "access_expires_at": "2026-10-30T19:18:11.154365891Z",
  "refresh_token": "27LcEd1113VpQpG_v5xLitQ5bqdfs25lEFq2BEjKecE",
  "refresh_expires_at": "2026-10-31T07:03:11.153891307Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.3085910275",
    "linkedid": "1730052700.3085910275",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380672580464"
    },
    "dialplan": {
      "context": "from-trunk",
      "exten": "380441110060"
    }
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "1730052700.3085910275",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "32bb6d13-3a10-482b-92ea-76c38f403721",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380672580464",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T19:03:11.388912Z",
      "answered_at": null,
      "ended_at": "2026-10-30T19:03:11.411705Z",
      "recording": null
    }
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
```

## A call is taken and ends: its recording is fetched from Asterisk

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052600.161057700",
    "linkedid": "1730052600.161057700",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380672580464"
    },
    "dialplan": {
      "context": "from-trunk",
      "exten": "380441110060"
    }
  }
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "cf5faf0c-6553-42ab-bbf0-dc41632470a7",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380672580464",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T19:03:11.68747Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
```

`POST /api/operator/v1/calls/cf5faf0c-6553-42ab-bbf0-dc41632470a7/answer` → **200**

```json
{
  "command_id": "ebdf9e13-c425-45c7-8458-43d56d58a12d"
}
```

```json
{
  "id": "cf5faf0c-6553-42ab-bbf0-dc41632470a7",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380672580464",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "50e6407f-123d-42ca-9890-64ec61c07dce",
  "order_ids": [],
  "started_at": "2026-10-30T19:03:11.68747Z",
  "answered_at": "2026-10-30T19:03:11.960505Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.161057700",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "1730052600.161057700",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "cf5faf0c-6553-42ab-bbf0-dc41632470a7",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672580464",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "50e6407f-123d-42ca-9890-64ec61c07dce",
      "order_ids": [],
      "started_at": "2026-10-30T19:03:11.68747Z",
      "answered_at": "2026-10-30T19:03:11.960505Z",
      "ended_at": "2026-10-30T19:03:12.241342Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "cf5faf0c-6553-42ab-bbf0-dc41632470a7",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672580464",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "50e6407f-123d-42ca-9890-64ec61c07dce",
      "order_ids": [],
      "started_at": "2026-10-30T19:03:11.68747Z",
      "answered_at": "2026-10-30T19:03:11.960505Z",
      "ended_at": "2026-10-30T19:03:12.241342Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "cf5faf0c-6553-42ab-bbf0-dc41632470a7",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672580464",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "50e6407f-123d-42ca-9890-64ec61c07dce",
      "order_ids": [],
      "started_at": "2026-10-30T19:03:11.68747Z",
      "answered_at": "2026-10-30T19:03:11.960505Z",
      "ended_at": "2026-10-30T19:03:12.241342Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "cf5faf0c-6553-42ab-bbf0-dc41632470a7",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672580464",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "50e6407f-123d-42ca-9890-64ec61c07dce",
      "order_ids": [],
      "started_at": "2026-10-30T19:03:11.68747Z",
      "answered_at": "2026-10-30T19:03:11.960505Z",
      "ended_at": "2026-10-30T19:03:12.241342Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T19:03:18.130659Z"
      }
    }
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
```

Recording: STORED

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "cf5faf0c-6553-42ab-bbf0-dc41632470a7",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672580464",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "50e6407f-123d-42ca-9890-64ec61c07dce",
      "order_ids": [],
      "started_at": "2026-10-30T19:03:11.68747Z",
      "answered_at": "2026-10-30T19:03:11.960505Z",
      "ended_at": "2026-10-30T19:03:12.241342Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T19:03:18.130659Z"
      }
    }
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/cf5faf0c-6553-42ab-bbf0-dc41632470a7/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/cf5faf0c-6553-42ab-bbf0-dc41632470a7/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=cf5faf0c-6553-42ab-bbf0-dc41632470a7` → **200**

```json
{
  "changes": [
    {
      "id": "54e19ea9-03c0-4292-9efd-1d2b1adae0d8",
      "occurred_at": "2026-10-30T19:03:19.547363Z",
      "actor_type": "STAFF",
      "actor_id": "50e6407f-123d-42ca-9890-64ec61c07dce",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "cf5faf0c-6553-42ab-bbf0-dc41632470a7",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"296c1f52-2356-4125-871d-b9eda3269802\", \"order_ids\": []}",
      "correlation_id": "9b9ef6b9-79b6-4fdf-8533-f1a5aba63671"
    },
    {
      "id": "66c68d95-e158-4dc0-9649-663b40c0fe17",
      "occurred_at": "2026-10-30T19:03:19.518423Z",
      "actor_type": "STAFF",
      "actor_id": "50e6407f-123d-42ca-9890-64ec61c07dce",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "cf5faf0c-6553-42ab-bbf0-dc41632470a7",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"296c1f52-2356-4125-871d-b9eda3269802\", \"order_ids\": []}",
      "correlation_id": "ab962376-2107-4538-bb17-59f3f9cbfc4b"
    }
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
```

Done: call cf5faf0c-6553-42ab-bbf0-dc41632470a7 recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-29472"
}
```

```json
{
  "challenge_id": "f464b0e1-9022-4934-9079-ee23478db8f6",
  "expires_at": "2026-10-30T19:08:19.826521462Z",
  "resend_available_at": "2026-10-30T19:03:20.826521462Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "246155",
  "sent_at": "2026-10-30T19:03:19.829157255Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f464b0e1-9022-4934-9079-ee23478db8f6",
  "code": "246155",
  "device_ref": "sandbox-29472"
}
```

```json
{
  "session_id": "3631ce1f-49b5-4deb-a14f-2f9224a32370",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4NzkwMCwiaWF0IjoxNzkzMzg3MDAwLCJqdGkiOiJlYWQwZWUyNC03YjQyLTQ3NWQtYjllMy04NGQ5NGQ3ZDFmODkiLCJzaWQiOiIzNjMxY2UxZi00OWI1LTRkZWItYTE0Zi0yZjkyMjRhMzIzNzAifQ.M5YMwRQgREET6Owwnbbe6kM7bM_HM2JizRyezDMBTxU",
  "access_expires_at": "2026-10-30T19:18:20.087415544Z",
  "refresh_token": "uNFuveJJZhKTMAIpV3vWx955Mt-7pQT3XhQcHE-6uiQ",
  "refresh_expires_at": "2026-11-29T19:03:20.086871774Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": null,
  "session_version": 0,
  "session_state": "CLOSED",
  "intent": null,
  "connection": "DISCONNECTED",
  "geolocation": "UNAVAILABLE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": null,
  "vehicle_id": null,
  "last_heartbeat_at": null,
  "last_location_at": null,
  "eligible": false,
  "ineligible_reasons": [
    "NO_OPEN_SESSION"
  ]
}
```

`POST /api/driver/v1/work-sessions` → **201**

```json
{
  "command_id": "90a71e64-3567-4613-9e34-49c386e8b352",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:03:20Z",
    "sequence": 1793387000566
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fac974fe-e2f4-436d-a6fa-eb768fb60d01",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T19:03:20.58338Z",
  "last_location_at": "2026-10-30T19:03:20.58338Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The operator takes a phone order for a caller without the app

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "OPERATOR",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "7635cadf-96b2-46a7-81e1-77624e7f1d41",
  "subject": {
    "type": "STAFF",
    "id": "50e6407f-123d-42ca-9890-64ec61c07dce"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MGU2NDA3Zi0xMjNkLTQyY2EtOTg5MC02NGVjNjFjMDdkY2UiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODc5MDEsImlhdCI6MTc5MzM4NzAwMSwianRpIjoiZTE3OTFhN2QtOWQ3Zi00M2MzLWE1ZTgtNTA1MGYyMmJmMDU1Iiwic2lkIjoiNzYzNWNhZGYtOTZiMi00NmE3LTgxZTEtNzc2MjRlN2YxZDQxIn0.fAp8owJZkwLYqEM3Vml1tvauE1KkN4Svd4JoynMwrzU",
  "access_expires_at": "2026-10-30T19:18:21.086166314Z",
  "refresh_token": "bhtEiyijZzR4TnKqxVUd2kmyyr1h5OFoBPRi-I20rz8",
  "refresh_expires_at": "2026-10-31T07:03:21.08557378Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "e3c80bd8-9795-485d-90d0-045ee4e35986",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  }
}
```

```json
{
  "id": "d0e04f37-02af-4c18-9cf9-8f533dfe10af",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T19:08:21.342252Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false,
  "discount_minor": 0,
  "to_pay_minor": 10517,
  "promotions": []
}
```

`POST /api/operator/v1/orders` → **201**

```json
{
  "command_id": "d2f70e2d-ad7c-4219-8726-8c8c6d87044d",
  "quote_id": "d0e04f37-02af-4c18-9cf9-8f533dfe10af",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "caller": {
    "name": "Олена",
    "phone": "+380675759060"
  }
}
```

```json
{
  "id": "fa407296-6cd8-4f6c-a4af-e385ca6ca948",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "PHONE",
  "payer_client_id": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "PERSONAL",
  "assignment": null,
  "created_at": "2026-10-30T19:03:21.611366Z",
  "caller": {
    "name": "Олена",
    "phone": "+380675759060"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Ivan accepts: the caller gets the car and the plate by SMS

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "b1e826ac-3b77-4881-ae43-06e04c90dfe6",
    "order_id": "fa407296-6cd8-4f6c-a4af-e385ca6ca948",
    "expires_at": "2026-10-30T19:03:36.615698Z",
    "vehicle_class": "STANDARD",
    "pickup": {
      "lat": 50.4501,
      "lon": 30.5234
    },
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "payment_method": "CASH",
    "price_minor": 10517,
    "currency": "UAH",
    "distance_m": 100
  }
]
```

`POST /api/driver/v1/offers/b1e826ac-3b77-4881-ae43-06e04c90dfe6/accept` → **200**

```json
{
  "command_id": "d9ee18f3-04dd-4700-8266-d0c24a1a3c49"
}
```

```json
{
  "id": "41bd1314-a4cf-4656-b91e-ce63338f7727",
  "order_id": "fa407296-6cd8-4f6c-a4af-e385ca6ca948",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "15e42d06-2a03-44dd-9976-7b2cdbc508cc",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380675759060` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380675759060` → **200**

```json
[
  {
    "phone": "+380675759060",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T19:03:22.62788454Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380675759060` → **200**

```json
[
  {
    "phone": "+380675759060",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T19:03:22.62788454Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380675759060` → **200**

```json
[
  {
    "phone": "+380675759060",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T19:03:22.62788454Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "15e42d06-2a03-44dd-9976-7b2cdbc508cc",
  "order_id": "fa407296-6cd8-4f6c-a4af-e385ca6ca948",
  "assignment_id": "41bd1314-a4cf-4656-b91e-ce63338f7727",
  "phase": "TO_PICKUP",
  "version": 0,
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "price_minor": 10517,
  "currency": "UAH",
  "arrived_at": null,
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380675759060"
  }
}
```

`POST /api/driver/v1/work-sessions/fac974fe-e2f4-436d-a6fa-eb768fb60d01/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:03:23Z",
    "sequence": 1793387003758
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fac974fe-e2f4-436d-a6fa-eb768fb60d01",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T19:03:23.776387Z",
  "last_location_at": "2026-10-30T19:03:23.776387Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/15e42d06-2a03-44dd-9976-7b2cdbc508cc/arrive` → **200**

```json
{
  "command_id": "6de7aa71-eccb-4370-9967-c31e359e3399",
  "expected_version": 0
}
```

```json
{
  "id": "15e42d06-2a03-44dd-9976-7b2cdbc508cc",
  "order_id": "fa407296-6cd8-4f6c-a4af-e385ca6ca948",
  "assignment_id": "41bd1314-a4cf-4656-b91e-ce63338f7727",
  "phase": "WAITING",
  "version": 1,
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "price_minor": 10517,
  "currency": "UAH",
  "arrived_at": "2026-10-30T19:03:24.026013Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380675759060"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380675759060` → **200**

```json
[
  {
    "phone": "+380675759060",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T19:03:22.62788454Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380675759060` → **200**

```json
[
  {
    "phone": "+380675759060",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T19:03:22.62788454Z"
  },
  {
    "phone": "+380675759060",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T19:03:24.635564927Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380675759060` → **200**

```json
[
  {
    "phone": "+380675759060",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T19:03:22.62788454Z"
  },
  {
    "phone": "+380675759060",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T19:03:24.635564927Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380675759060` → **200**

```json
[
  {
    "phone": "+380675759060",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T19:03:22.62788454Z"
  },
  {
    "phone": "+380675759060",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T19:03:24.635564927Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/15e42d06-2a03-44dd-9976-7b2cdbc508cc/start` → **200**

```json
{
  "command_id": "b81c778a-353c-4c0e-9d68-3035a4d4b27c",
  "expected_version": 1
}
```

```json
{
  "id": "15e42d06-2a03-44dd-9976-7b2cdbc508cc",
  "order_id": "fa407296-6cd8-4f6c-a4af-e385ca6ca948",
  "assignment_id": "41bd1314-a4cf-4656-b91e-ce63338f7727",
  "phase": "IN_PROGRESS",
  "version": 2,
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "price_minor": 10517,
  "currency": "UAH",
  "arrived_at": "2026-10-30T19:03:24.026013Z",
  "started_at": "2026-10-30T19:03:25.384493Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380675759060"
  }
}
```

`POST /api/driver/v1/trips/15e42d06-2a03-44dd-9976-7b2cdbc508cc/complete` → **200**

```json
{
  "command_id": "1cfb0159-d1e4-4748-9101-5cb284c5e2c9",
  "expected_version": 2,
  "reported_at": "2026-10-30T19:03:25Z",
  "cash_received": true
}
```

```json
{
  "id": "15e42d06-2a03-44dd-9976-7b2cdbc508cc",
  "order_id": "fa407296-6cd8-4f6c-a4af-e385ca6ca948",
  "assignment_id": "41bd1314-a4cf-4656-b91e-ce63338f7727",
  "phase": "COMPLETED",
  "version": 3,
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "price_minor": 10517,
  "currency": "UAH",
  "arrived_at": "2026-10-30T19:03:24.026013Z",
  "started_at": "2026-10-30T19:03:25.384493Z",
  "completed_at": "2026-10-30T19:03:25.64762Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

Done: two SMS to the caller of a phone order.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fac974fe-e2f4-436d-a6fa-eb768fb60d01",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T19:03:23.776387Z",
  "last_location_at": "2026-10-30T19:03:23.776387Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/fac974fe-e2f4-436d-a6fa-eb768fb60d01/close` → **200**

```json
{
  "command_id": "543ee2aa-ef10-4dab-a52d-040aa49232b6",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": null,
  "session_version": 0,
  "session_state": "CLOSED",
  "intent": null,
  "connection": "DISCONNECTED",
  "geolocation": "UNAVAILABLE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": null,
  "vehicle_id": null,
  "last_heartbeat_at": null,
  "last_location_at": null,
  "eligible": false,
  "ineligible_reasons": [
    "NO_OPEN_SESSION"
  ]
}
```

# Scenario: cancellations

## Reasons each side can choose from

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637171814",
  "device_ref": "sandbox-31724"
}
```

```json
{
  "challenge_id": "e04833ba-1e72-451d-b6a3-29b268685ab1",
  "expires_at": "2026-10-30T19:08:26.410010314Z",
  "resend_available_at": "2026-10-30T19:03:27.410010314Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637171814` → **200**

```json
{
  "phone": "+380637171814",
  "audience": "CLIENT",
  "code": "120059",
  "sent_at": "2026-10-30T19:03:26.412519225Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e04833ba-1e72-451d-b6a3-29b268685ab1",
  "code": "120059",
  "device_ref": "sandbox-31724"
}
```

```json
{
  "session_id": "94cfc2b2-d60a-4bed-a732-91771729329a",
  "subject": {
    "type": "CLIENT",
    "id": "829982e1-f2c7-4311-82a5-97201486d512"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Mjk5ODJlMS1mMmM3LTQzMTEtODJhNS05NzIwMTQ4NmQ1MTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzg3OTA2LCJpYXQiOjE3OTMzODcwMDYsImp0aSI6ImU3ZmUzOWU5LTQzZGQtNDM2YS1iYWJmLWRmYzc0NGJhZTNjMyIsInNpZCI6Ijk0Y2ZjMmIyLWQ2MGEtNGJlZC1hNzMyLTkxNzcxNzI5MzI5YSJ9.94xAL-zZRE8j4P41vsPGXU5oHq93SaGGuLv8VsQG_Xk",
  "access_expires_at": "2026-10-30T19:18:26.677497777Z",
  "refresh_token": "MLoqAsxpP_hPy8zWfqM2QGd8IFfIpgDl4Yc-YSLpN1E",
  "refresh_expires_at": "2026-11-29T19:03:26.677040149Z",
  "account_created": true
}
```

`GET /api/rider/v1/cancel-reasons` → **200**

```json
{
  "reasons": [
    {
      "code": "CHANGED_MIND",
      "labels": {
        "pl": "Zmiana planów",
        "uk": "Передумав їхати",
        "en": "Changed my mind",
        "ru": "Передумал ехать"
      },
      "driver_outcome": null
    },
    {
      "code": "WAIT_TOO_LONG",
      "labels": {
        "pl": "Zbyt długie oczekiwanie",
        "uk": "Довго чекати авто",
        "en": "The wait is too long",
        "ru": "Долго ждать машину"
      },
      "driver_outcome": null
    },
    {
      "code": "WRONG_ADDRESS",
      "labels": {
        "pl": "Błędny adres",
        "uk": "Помилився адресою",
        "en": "Wrong address",
        "ru": "Ошибся адресом"
      },
      "driver_outcome": null
    },
    {
      "code": "OTHER_TRANSPORT",
      "labels": {
        "pl": "Inny transport",
        "uk": "Поїду іншим транспортом",
        "en": "Found other transport",
        "ru": "Уеду на другом транспорте"
      },
      "driver_outcome": null
    }
  ]
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-3393"
}
```

```json
{
  "challenge_id": "2fc814ef-9bd0-488e-93e7-a3fb976f811b",
  "expires_at": "2026-10-30T19:08:27.143652834Z",
  "resend_available_at": "2026-10-30T19:03:28.143652834Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "117542",
  "sent_at": "2026-10-30T19:03:27.145890241Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2fc814ef-9bd0-488e-93e7-a3fb976f811b",
  "code": "117542",
  "device_ref": "sandbox-3393"
}
```

```json
{
  "session_id": "54e1ef91-3284-42f9-b306-c4f5adbcdc01",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4NzkwNywiaWF0IjoxNzkzMzg3MDA3LCJqdGkiOiJiMTQxNDg4My02ZjU4LTRmMjMtODdiMi1mYmQ0NzMwY2EyNzAiLCJzaWQiOiI1NGUxZWY5MS0zMjg0LTQyZjktYjMwNi1jNGY1YWRiY2RjMDEifQ.VkGX54UOy2dp7nYWivAfiiOjo4utfInXatS23s5UkXQ",
  "access_expires_at": "2026-10-30T19:18:27.415478765Z",
  "refresh_token": "598daFBtRopTD9w51YNjaaiZZal36E665PE4x26k2Ss",
  "refresh_expires_at": "2026-11-29T19:03:27.414911995Z",
  "account_created": false
}
```

`GET /api/driver/v1/cancel-reasons` → **200**

```json
{
  "reasons": [
    {
      "code": "NO_SHOW",
      "labels": {
        "pl": "Pasażer nie przyszedł",
        "uk": "Пасажир не вийшов",
        "en": "Passenger did not show up",
        "ru": "Пассажир не вышел"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "PASSENGER_ASKED",
      "labels": {
        "pl": "Pasażer poprosił o anulowanie",
        "uk": "Пасажир попросив скасувати",
        "en": "Passenger asked to cancel",
        "ru": "Пассажир попросил отменить"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "VEHICLE_PROBLEM",
      "labels": {
        "pl": "Awaria samochodu",
        "uk": "Несправність автомобіля",
        "en": "Vehicle problem",
        "ru": "Неисправность автомобиля"
      },
      "driver_outcome": "RETURN_TO_SEARCH"
    },
    {
      "code": "CANNOT_REACH",
      "labels": {
        "pl": "Nie mogę dojechać",
        "uk": "Не можу під'їхати",
        "en": "Cannot reach the pickup",
        "ru": "Не могу подъехать"
      },
      "driver_outcome": "RETURN_TO_SEARCH"
    }
  ]
}
```

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "2d3682fb-bddd-4602-a6af-4c3db246f8e4",
  "subject": {
    "type": "STAFF",
    "id": "50e6407f-123d-42ca-9890-64ec61c07dce"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MGU2NDA3Zi0xMjNkLTQyY2EtOTg5MC02NGVjNjFjMDdkY2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODc5MDgsImlhdCI6MTc5MzM4NzAwOCwianRpIjoiY2E4YjU4MDAtYjhhNy00MTZiLWJlY2UtZTVhZDRlOTJjNmNhIiwic2lkIjoiMmQzNjgyZmItYmRkZC00NjAyLWE2YWYtNGMzZGIyNDZmOGU0In0.NOUYov9I8ByDhCgiPOgSf1Z83lvIA_GSamESMdMrjdU",
  "access_expires_at": "2026-10-30T19:18:28.147452072Z",
  "refresh_token": "cug7ganmApyURJdAbjCI16lzDJrrbXaOJtaqxjst7h0",
  "refresh_expires_at": "2026-10-31T07:03:28.146945992Z",
  "password_change_required": false
}
```

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "OPERATOR",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "fb11e499-71dd-4833-b696-386f609b489f",
  "subject": {
    "type": "STAFF",
    "id": "50e6407f-123d-42ca-9890-64ec61c07dce"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MGU2NDA3Zi0xMjNkLTQyY2EtOTg5MC02NGVjNjFjMDdkY2UiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODc5MDgsImlhdCI6MTc5MzM4NzAwOCwianRpIjoiOTEyNzdhYzMtMjhjYi00NTQ2LTgxYTEtOTIyNWNmNDA4NGFmIiwic2lkIjoiZmIxMWU0OTktNzFkZC00ODMzLWI2OTYtMzg2ZjYwOWI0ODlmIn0.U__k0-Dsvw9H9Tcv2aciuhHYqrwxWpxqdJljXCRd34s",
  "access_expires_at": "2026-10-30T19:18:28.743421907Z",
  "refresh_token": "bGa-p3T9hL9eSUIA97QPjGMZ_3U2_34wmoQqrZ-5qe0",
  "refresh_expires_at": "2026-10-31T07:03:28.742979433Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/cancel-reasons` → **200**

```json
{
  "reasons": [
    {
      "code": "PASSENGER_ASKED",
      "labels": {
        "pl": "Na prośbę pasażera",
        "uk": "Пасажир попросив",
        "en": "Passenger asked",
        "ru": "Пассажир попросил"
      },
      "driver_outcome": null
    },
    {
      "code": "DUPLICATE",
      "labels": {
        "pl": "Duplikat zamówienia",
        "uk": "Дубль замовлення",
        "en": "Duplicate order",
        "ru": "Дубль заказа"
      },
      "driver_outcome": null
    },
    {
      "code": "NO_CARS",
      "labels": {
        "pl": "Brak wolnych aut",
        "uk": "Немає вільних авто",
        "en": "No cars available",
        "ru": "Нет свободных машин"
      },
      "driver_outcome": null
    },
    {
      "code": "TEST_ORDER",
      "labels": {
        "pl": "Zamówienie testowe",
        "uk": "Тестове замовлення",
        "en": "Test order",
        "ru": "Тестовый заказ"
      },
      "driver_outcome": null
    },
    {
      "code": "OPERATOR_ERROR",
      "labels": {
        "pl": "Błąd operatora",
        "uk": "Помилка оператора",
        "en": "Operator error",
        "ru": "Ошибка оператора"
      },
      "driver_outcome": null
    },
    {
      "code": "VEHICLE_BREAKDOWN",
      "labels": {
        "pl": "Awaria auta w trasie",
        "uk": "Поломка автомобіля в дорозі",
        "en": "Vehicle broke down on the way",
        "ru": "Поломка автомобиля в пути"
      },
      "driver_outcome": null
    },
    {
      "code": "ACCIDENT",
      "labels": {
        "pl": "Wypadek",
        "uk": "ДТП",
        "en": "Accident",
        "ru": "ДТП"
      },
      "driver_outcome": null
    }
  ]
}
```

## The rider orders and cancels: «Долго ждать машину»

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "27a32c68-e7c5-429f-8de6-c802f2290902",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4547,
    "lon": 30.5238
  },
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.6520
  }
}
```

```json
{
  "id": "55439464-a833-4eac-b83c-465f8286d051",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T19:08:29.232498Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false,
  "discount_minor": 0,
  "to_pay_minor": 30533,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "a37449d6-73ce-4bfd-821f-fe4913e11613",
  "quote_id": "55439464-a833-4eac-b83c-465f8286d051",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4547,
    "lon": 30.5238
  },
  "pickup_label": "Хрещатик, 22",
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.6520
  },
  "dropoff_label": "Позняки",
  "payment_method": "CASH"
}
```

```json
{
  "id": "2328e56e-adc1-46fb-8f4f-bff0cb1b1b21",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "829982e1-f2c7-4311-82a5-97201486d512",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4547,
    "lon": 30.5238
  },
  "pickup_label": "Хрещатик, 22",
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.652
  },
  "dropoff_label": "Позняки",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 30533,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T19:03:29.483092Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2328e56e-adc1-46fb-8f4f-bff0cb1b1b21` → **200**

```json
{
  "id": "2328e56e-adc1-46fb-8f4f-bff0cb1b1b21",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "829982e1-f2c7-4311-82a5-97201486d512",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4547,
    "lon": 30.5238
  },
  "pickup_label": "Хрещатик, 22",
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.652
  },
  "dropoff_label": "Позняки",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 30533,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T19:03:29.483092Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/2328e56e-adc1-46fb-8f4f-bff0cb1b1b21/cancel` → **200**

```json
{
  "command_id": "fdc6ebaa-c565-4b77-b177-cce1d509cfb2",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "2328e56e-adc1-46fb-8f4f-bff0cb1b1b21",
  "short_number": 6,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "829982e1-f2c7-4311-82a5-97201486d512",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4547,
    "lon": 30.5238
  },
  "pickup_label": "Хрещатик, 22",
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.652
  },
  "dropoff_label": "Позняки",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 30533,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "STOPPED",
  "assignment": null,
  "created_at": "2026-10-30T19:03:29.483092Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "WAIT_TOO_LONG",
    "reason_labels": {
      "pl": "Zbyt długie oczekiwanie",
      "uk": "Довго чекати авто",
      "en": "The wait is too long",
      "ru": "Долго ждать машину"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

## Two drivers online; the order goes to the nearest one

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": null,
  "session_version": 0,
  "session_state": "CLOSED",
  "intent": null,
  "connection": "DISCONNECTED",
  "geolocation": "UNAVAILABLE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": null,
  "vehicle_id": null,
  "last_heartbeat_at": null,
  "last_location_at": null,
  "eligible": false,
  "ineligible_reasons": [
    "NO_OPEN_SESSION"
  ]
}
```

`POST /api/driver/v1/work-sessions` → **201**

```json
{
  "command_id": "3ef07505-7d68-4464-b9c2-e6c129a68d32",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:03:30Z",
    "sequence": 1793387010547
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "6ca2ffad-e23d-4277-8401-d902e2c803a7",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "last_heartbeat_at": "2026-10-30T19:03:30.565238Z",
  "last_location_at": "2026-10-30T19:03:30.565238Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-23172"
}
```

```json
{
  "challenge_id": "e0d50513-d3a6-4582-84e5-0377cfd4515f",
  "expires_at": "2026-10-30T19:08:30.803436485Z",
  "resend_available_at": "2026-10-30T19:03:31.803436485Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "844956",
  "sent_at": "2026-10-30T19:03:30.805593457Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e0d50513-d3a6-4582-84e5-0377cfd4515f",
  "code": "844956",
  "device_ref": "sandbox-23172"
}
```

```json
{
  "session_id": "aac07ade-746a-4b9a-9505-c22c34786312",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4NzkxMSwiaWF0IjoxNzkzMzg3MDExLCJqdGkiOiJhZDQ5NmY2MS04MDZmLTQ5YzktOTFmMi01NmRkZjdkOWM5NmQiLCJzaWQiOiJhYWMwN2FkZS03NDZhLTRiOWEtOTUwNS1jMjJjMzQ3ODYzMTIifQ.rRNJBSPEBnEVNu0pNn5rKi7959rJgs7XFo4GZoftdZc",
  "access_expires_at": "2026-10-30T19:18:31.070487245Z",
  "refresh_token": "WEDD3vxN3tenXsY1TNYzcFjjK1Q8MI9JNWaB5-2fTEI",
  "refresh_expires_at": "2026-11-29T19:03:31.070045991Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": null,
  "session_version": 0,
  "session_state": "CLOSED",
  "intent": null,
  "connection": "DISCONNECTED",
  "geolocation": "UNAVAILABLE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": null,
  "vehicle_id": null,
  "last_heartbeat_at": null,
  "last_location_at": null,
  "eligible": false,
  "ineligible_reasons": [
    "NO_OPEN_SESSION"
  ]
}
```

`POST /api/driver/v1/work-sessions` → **201**

```json
{
  "command_id": "cb2c0eb5-fc51-4af3-a3ad-22672293fb39",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:03:31Z",
    "sequence": 1793387011553
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "54c13629-ffb3-467f-8ea5-76796fe50026",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "last_heartbeat_at": "2026-10-30T19:03:31.57136Z",
  "last_location_at": "2026-10-30T19:03:31.57136Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "efdafa30-add2-4896-bbf5-08732763d75a",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4547,
    "lon": 30.5238
  },
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.6520
  }
}
```

```json
{
  "id": "e91d6975-6c44-43cc-802f-3cb93145b458",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T19:08:31.821348Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false,
  "discount_minor": 0,
  "to_pay_minor": 30533,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "f10c8dbf-3ec4-4be1-ad9e-1b645868cbea",
  "quote_id": "e91d6975-6c44-43cc-802f-3cb93145b458",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4547,
    "lon": 30.5238
  },
  "pickup_label": "Хрещатик, 22",
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.6520
  },
  "dropoff_label": "Позняки",
  "payment_method": "CASH"
}
```

```json
{
  "id": "d7778d6f-4095-4868-8f2b-5c218c2c5454",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "829982e1-f2c7-4311-82a5-97201486d512",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4547,
    "lon": 30.5238
  },
  "pickup_label": "Хрещатик, 22",
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.652
  },
  "dropoff_label": "Позняки",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 30533,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "PERSONAL",
  "assignment": null,
  "created_at": "2026-10-30T19:03:32.074051Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "6a250c32-0174-4b49-9443-9977539e3fbd",
    "order_id": "d7778d6f-4095-4868-8f2b-5c218c2c5454",
    "expires_at": "2026-10-30T19:03:47.076716Z",
    "vehicle_class": "STANDARD",
    "pickup": {
      "lat": 50.4547,
      "lon": 30.5238
    },
    "pickup_label": "Хрещатик, 22",
    "dropoff_label": "Позняки",
    "payment_method": "CASH",
    "price_minor": 30533,
    "currency": "UAH",
    "distance_m": 478
  }
]
```

`POST /api/driver/v1/offers/6a250c32-0174-4b49-9443-9977539e3fbd/accept` → **200**

```json
{
  "command_id": "205200c8-fa3f-47f4-90ec-5d019befffe7"
}
```

```json
{
  "id": "38225ca3-114d-4ee4-9198-e98b935f6034",
  "order_id": "d7778d6f-4095-4868-8f2b-5c218c2c5454",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "145195ec-0b6a-4149-a903-3c98e34929a7",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "145195ec-0b6a-4149-a903-3c98e34929a7",
  "order_id": "d7778d6f-4095-4868-8f2b-5c218c2c5454",
  "assignment_id": "38225ca3-114d-4ee4-9198-e98b935f6034",
  "phase": "TO_PICKUP",
  "version": 0,
  "pickup": {
    "lat": 50.4547,
    "lon": 30.5238
  },
  "pickup_label": "Хрещатик, 22",
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.652
  },
  "dropoff_label": "Позняки",
  "payment_method": "CASH",
  "price_minor": 30533,
  "currency": "UAH",
  "arrived_at": null,
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/145195ec-0b6a-4149-a903-3c98e34929a7/cancel` → **200**

```json
{
  "command_id": "974acea2-ac3d-4477-97da-2dfb3c591cc5",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "145195ec-0b6a-4149-a903-3c98e34929a7",
  "order_id": "d7778d6f-4095-4868-8f2b-5c218c2c5454",
  "assignment_id": "38225ca3-114d-4ee4-9198-e98b935f6034",
  "phase": "ABORTED",
  "version": 1,
  "pickup": {
    "lat": 50.4547,
    "lon": 30.5238
  },
  "pickup_label": "Хрещатик, 22",
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.652
  },
  "dropoff_label": "Позняки",
  "payment_method": "CASH",
  "price_minor": 30533,
  "currency": "UAH",
  "arrived_at": null,
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/rider/v1/orders/d7778d6f-4095-4868-8f2b-5c218c2c5454` → **200**

```json
{
  "id": "d7778d6f-4095-4868-8f2b-5c218c2c5454",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "829982e1-f2c7-4311-82a5-97201486d512",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4547,
    "lon": 30.5238
  },
  "pickup_label": "Хрещатик, 22",
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.652
  },
  "dropoff_label": "Позняки",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 30533,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "PERSONAL",
  "assignment": {
    "id": "38225ca3-114d-4ee4-9198-e98b935f6034",
    "order_id": "d7778d6f-4095-4868-8f2b-5c218c2c5454",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "145195ec-0b6a-4149-a903-3c98e34929a7",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T19:03:32.074051Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

## Andrii gets it and cancels: «Пассажир попросил отменить»

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "a8031198-29ba-4598-8598-d83cb25e42b1",
    "order_id": "d7778d6f-4095-4868-8f2b-5c218c2c5454",
    "expires_at": "2026-10-30T19:03:48.087476Z",
    "vehicle_class": "STANDARD",
    "pickup": {
      "lat": 50.4547,
      "lon": 30.5238
    },
    "pickup_label": "Хрещатик, 22",
    "dropoff_label": "Позняки",
    "payment_method": "CASH",
    "price_minor": 30533,
    "currency": "UAH",
    "distance_m": 1146
  }
]
```

`POST /api/driver/v1/offers/a8031198-29ba-4598-8598-d83cb25e42b1/accept` → **200**

```json
{
  "command_id": "d58a3e01-4fe5-4ff9-905c-ddf18601568a"
}
```

```json
{
  "id": "d103c8c0-e2cc-4b61-bfa5-2c30c9a3f4d5",
  "order_id": "d7778d6f-4095-4868-8f2b-5c218c2c5454",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "1f8a7750-3b7e-4e94-98ae-91726ea8106f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "1f8a7750-3b7e-4e94-98ae-91726ea8106f",
  "order_id": "d7778d6f-4095-4868-8f2b-5c218c2c5454",
  "assignment_id": "d103c8c0-e2cc-4b61-bfa5-2c30c9a3f4d5",
  "phase": "TO_PICKUP",
  "version": 0,
  "pickup": {
    "lat": 50.4547,
    "lon": 30.5238
  },
  "pickup_label": "Хрещатик, 22",
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.652
  },
  "dropoff_label": "Позняки",
  "payment_method": "CASH",
  "price_minor": 30533,
  "currency": "UAH",
  "arrived_at": null,
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/1f8a7750-3b7e-4e94-98ae-91726ea8106f/cancel` → **200**

```json
{
  "command_id": "44921938-c750-4b4b-a19c-da89c63acb2b",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "1f8a7750-3b7e-4e94-98ae-91726ea8106f",
  "order_id": "d7778d6f-4095-4868-8f2b-5c218c2c5454",
  "assignment_id": "d103c8c0-e2cc-4b61-bfa5-2c30c9a3f4d5",
  "phase": "ABORTED",
  "version": 1,
  "pickup": {
    "lat": 50.4547,
    "lon": 30.5238
  },
  "pickup_label": "Хрещатик, 22",
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.652
  },
  "dropoff_label": "Позняки",
  "payment_method": "CASH",
  "price_minor": 30533,
  "currency": "UAH",
  "arrived_at": null,
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The rider sees who cancelled; the operator sees the whole history

`GET /api/rider/v1/orders` → **200**

```json
{
  "items": [
    {
      "id": "d7778d6f-4095-4868-8f2b-5c218c2c5454",
      "short_number": 7,
      "status": "CANCELLED",
      "created_at": "2026-10-30T19:03:32.074051Z",
      "pickup_label": "Хрещатик, 22",
      "dropoff_label": "Позняки",
      "vehicle_class": "STANDARD",
      "price_minor": 30533,
      "final_price_minor": null,
      "currency": "UAH",
      "payment_method": "CASH",
      "driver": {
        "name": "Андрій Шевчук",
        "vehicle": {
          "make": "Hyundai",
          "model": "Sonata",
          "color": "black",
          "registration_number": "AA0003TX"
        }
      },
      "chat_available": true,
      "cancellation": {
        "by": "DRIVER",
        "reason_code": "PASSENGER_ASKED",
        "reason_labels": {
          "pl": "Pasażer poprosił o anulowanie",
          "uk": "Пасажир попросив скасувати",
          "en": "Passenger asked to cancel",
          "ru": "Пассажир попросил отменить"
        }
      },
      "pickup_at": null
    },
    {
      "id": "2328e56e-adc1-46fb-8f4f-bff0cb1b1b21",
      "short_number": 6,
      "status": "CANCELLED",
      "created_at": "2026-10-30T19:03:29.483092Z",
      "pickup_label": "Хрещатик, 22",
      "dropoff_label": "Позняки",
      "vehicle_class": "STANDARD",
      "price_minor": 30533,
      "final_price_minor": null,
      "currency": "UAH",
      "payment_method": "CASH",
      "driver": null,
      "chat_available": false,
      "cancellation": {
        "by": "RIDER",
        "reason_code": "WAIT_TOO_LONG",
        "reason_labels": {
          "pl": "Zbyt długie oczekiwanie",
          "uk": "Довго чекати авто",
          "en": "The wait is too long",
          "ru": "Долго ждать машину"
        }
      },
      "pickup_at": null
    }
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
```

`GET /api/operator/v1/orders/d7778d6f-4095-4868-8f2b-5c218c2c5454/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T19:03:32.074508Z",
      "actor": {
        "type": "CLIENT",
        "id": "829982e1-f2c7-4311-82a5-97201486d512",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "d7778d6f-4095-4868-8f2b-5c218c2c5454",
        "quote_id": "e91d6975-6c44-43cc-802f-3cb93145b458",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "23dc11c9-ef46-4609-a202-53de97f70685"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T19:03:32.076115Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "d7778d6f-4095-4868-8f2b-5c218c2c5454",
        "attempt_id": "c60d9018-8811-4140-b5d6-421b2f190d0b",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "23dc11c9-ef46-4609-a202-53de97f70685"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T19:03:32.096791Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "6a250c32-0174-4b49-9443-9977539e3fbd",
        "order_id": "d7778d6f-4095-4868-8f2b-5c218c2c5454",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "23dc11c9-ef46-4609-a202-53de97f70685"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T19:03:32.599222Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "6a250c32-0174-4b49-9443-9977539e3fbd",
        "order_id": "d7778d6f-4095-4868-8f2b-5c218c2c5454",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "38225ca3-114d-4ee4-9198-e98b935f6034"
      },
      "correlation_id": "ddcda6a1-7ff1-4c71-a25f-5748102e76ea"
```

Done: orders 2328e56e-adc1-46fb-8f4f-bff0cb1b1b21, d7778d6f-4095-4868-8f2b-5c218c2c5454.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380734813511",
  "device_ref": "sandbox-14417"
}
```

```json
{
  "challenge_id": "c86e1ebb-a0cc-47fb-a997-0a418c6a41e6",
  "expires_at": "2026-10-30T19:08:35.111476789Z",
  "resend_available_at": "2026-10-30T19:03:36.111476789Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380734813511` → **200**

```json
{
  "phone": "+380734813511",
  "audience": "CLIENT",
  "code": "306000",
  "sent_at": "2026-10-30T19:03:35.113865064Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c86e1ebb-a0cc-47fb-a997-0a418c6a41e6",
  "code": "306000",
  "device_ref": "sandbox-14417"
}
```

```json
{
  "session_id": "56e04e2e-e371-4a19-8cdc-d70be74ed064",
  "subject": {
    "type": "CLIENT",
    "id": "c01fba52-1ff4-48df-a578-1df1a3ab9f1c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMDFmYmE1Mi0xZmY0LTQ4ZGYtYTU3OC0xZGYxYTNhYjlmMWMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzg3OTE1LCJpYXQiOjE3OTMzODcwMTUsImp0aSI6IjA4NjNkZDQ2LTk3OWUtNGU3ZC04ZjNlLTc5YzdiZTc0MjNkZSIsInNpZCI6IjU2ZTA0ZTJlLWUzNzEtNGExOS04Y2RjLWQ3MGJlNzRlZDA2NCJ9.YHHDx_bTJe7ty6-FIqDtk0B0xz7IK8gDGgmlyxtTilw",
  "access_expires_at": "2026-10-30T19:18:35.438416944Z",
  "refresh_token": "46ObNeZxqZPbKe4D5pxrxRqqvDlphbSlb4SOsshTIC0",
  "refresh_expires_at": "2026-11-29T19:03:35.437977113Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "905b96cd-284b-40bb-9fdd-0e42ceab133b",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "ea65c815-b988-478e-a462-ad8699124cb7",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-ea65c815-b988-478e-a462-ad8699124cb7",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "5921f8fa4ee918541e24da2a60225d2a",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=ea65c815-b988-478e-a462-ad8699124cb7",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380734813511"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=ea65c815-b988-478e-a462-ad8699124cb7",
  "expires_at": "2026-10-30T19:33:35.680763Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/ea65c815-b988-478e-a462-ad8699124cb7` → **200**

```json
{
  "id": "ea65c815-b988-478e-a462-ad8699124cb7",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T19:33:35.680763Z",
  "card": {
    "id": "d0f17efa-25ce-4e51-85ee-fb756a00acf7",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****7265",
    "card_type": "Visa",
    "created_at": "2026-10-30T19:03:35.953139Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "d0f17efa-25ce-4e51-85ee-fb756a00acf7",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****7265",
      "card_type": "Visa",
      "created_at": "2026-10-30T19:03:35.953139Z"
    }
  ]
}
```

## Andrii is online nearby

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-30073"
}
```

```json
{
  "challenge_id": "ae9ff743-0f0a-48c6-b3f9-904c0df74ea0",
  "expires_at": "2026-10-30T19:08:36.448747204Z",
  "resend_available_at": "2026-10-30T19:03:37.448747204Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "190364",
  "sent_at": "2026-10-30T19:03:36.450861646Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ae9ff743-0f0a-48c6-b3f9-904c0df74ea0",
  "code": "190364",
  "device_ref": "sandbox-30073"
}
```

```json
{
  "session_id": "76402f4b-da04-44a4-ac92-cdf9dadcf327",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4NzkxNiwiaWF0IjoxNzkzMzg3MDE2LCJqdGkiOiJmNzY4Yzk4Mi1hM2UyLTQyMGQtOTEzYS03YTlhMzRlZTFjN2IiLCJzaWQiOiI3NjQwMmY0Yi1kYTA0LTQ0YTQtYWM5Mi1jZGY5ZGFkY2YzMjcifQ.G-ZRp66hcwxwWr9Jnk821zCKSGlbJy4nO-y8YXH1ORY",
  "access_expires_at": "2026-10-30T19:18:36.718580009Z",
  "refresh_token": "q5ObMZb6MthMem05VLbQ4-NGP5lYvsjsWQIc0fppaMA",
  "refresh_expires_at": "2026-11-29T19:03:36.718011433Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "54c13629-ffb3-467f-8ea5-76796fe50026",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "last_heartbeat_at": "2026-10-30T19:03:31.57136Z",
  "last_location_at": "2026-10-30T19:03:31.57136Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/54c13629-ffb3-467f-8ea5-76796fe50026/handover` → **200**

```json
{
  "command_id": "d388ba38-ec4d-4374-80fd-ea11fd56b6ff",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "54c13629-ffb3-467f-8ea5-76796fe50026",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "last_heartbeat_at": "2026-10-30T19:03:31.57136Z",
  "last_location_at": "2026-10-30T19:03:31.57136Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

(the car drives 43 s to the next point)

`POST /api/driver/v1/work-sessions/54c13629-ffb3-467f-8ea5-76796fe50026/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:04:20Z",
    "sequence": 1793387060469
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "54c13629-ffb3-467f-8ea5-76796fe50026",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "last_heartbeat_at": "2026-10-30T19:04:20.487518Z",
  "last_location_at": "2026-10-30T19:04:20.487518Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "4ab717b9-3d14-421b-a4fc-e4261c9e460f",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4437,
    "lon": 30.4970
  },
  "dropoff": {
    "lat": 50.4584,
    "lon": 30.4300
  }
}
```

```json
{
  "id": "8eec838b-a60d-4336-a487-17090410a345",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T19:09:20.736872Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false,
  "discount_minor": 0,
  "to_pay_minor": 16297,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **202**

```json
{
  "command_id": "0bf91647-593c-4cde-bb63-2380d62137c5",
  "quote_id": "8eec838b-a60d-4336-a487-17090410a345",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4437,
    "lon": 30.4970
  },
  "pickup_label": "вул. Дмитрівська",
  "dropoff": {
    "lat": 50.4584,
    "lon": 30.4300
  },
  "dropoff_label": "Нивки",
  "payment_method": "CARD",
  "wallet_minor": 0
}
```

```json
{
  "id": "3987533e-937e-434f-8f37-58e72eb1ff86",
  "short_number": 8,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "c01fba52-1ff4-48df-a578-1df1a3ab9f1c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4437,
    "lon": 30.497
  },
  "pickup_label": "вул. Дмитрівська",
  "dropoff": {
    "lat": 50.4584,
    "lon": 30.43
  },
  "dropoff_label": "Нивки",
  "payment_method": "CARD",
  "payment_state": "AUTH_PENDING",
  "price_minor": 16297,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": null,
  "assignment": null,
  "created_at": "2026-10-30T19:04:20.992152Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3987533e-937e-434f-8f37-58e72eb1ff86` → **200**

```json
{
  "id": "3987533e-937e-434f-8f37-58e72eb1ff86",
  "short_number": 8,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "c01fba52-1ff4-48df-a578-1df1a3ab9f1c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4437,
    "lon": 30.497
  },
  "pickup_label": "вул. Дмитрівська",
  "dropoff": {
    "lat": 50.4584,
    "lon": 30.43
  },
  "dropoff_label": "Нивки",
  "payment_method": "CARD",
  "payment_state": "AUTH_PENDING",
  "price_minor": 16297,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": null,
  "assignment": null,
  "created_at": "2026-10-30T19:04:20.992152Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3987533e-937e-434f-8f37-58e72eb1ff86` → **200**

```json
{
  "id": "3987533e-937e-434f-8f37-58e72eb1ff86",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "c01fba52-1ff4-48df-a578-1df1a3ab9f1c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4437,
    "lon": 30.497
  },
  "pickup_label": "вул. Дмитрівська",
  "dropoff": {
    "lat": 50.4584,
    "lon": 30.43
  },
  "dropoff_label": "Нивки",
  "payment_method": "CARD",
  "payment_state": "AUTHORIZED",
  "price_minor": 16297,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "PERSONAL",
  "assignment": null,
  "created_at": "2026-10-30T19:04:20.992152Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

## Andrii takes it and drives

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "16d21041-b521-46a5-88b0-1d182eaf4261",
    "order_id": "3987533e-937e-434f-8f37-58e72eb1ff86",
    "expires_at": "2026-10-30T19:04:36.369751Z",
    "vehicle_class": "STANDARD",
    "pickup": {
      "lat": 50.4437,
      "lon": 30.497
    },
    "pickup_label": "вул. Дмитрівська",
    "dropoff_label": "Нивки",
    "payment_method": "CARD",
    "price_minor": 16297,
    "currency": "UAH",
    "distance_m": 478
  }
]
```

`POST /api/driver/v1/offers/16d21041-b521-46a5-88b0-1d182eaf4261/accept` → **200**

```json
{
  "command_id": "f380992c-c0ad-4a50-822c-03e66c56a6c7"
}
```

```json
{
  "id": "d51fee0a-01f2-4aa9-8daa-9d24f501c1d4",
  "order_id": "3987533e-937e-434f-8f37-58e72eb1ff86",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "0c5e1fd6-f9a6-4b85-a737-16a2af2bea27",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "0c5e1fd6-f9a6-4b85-a737-16a2af2bea27",
  "order_id": "3987533e-937e-434f-8f37-58e72eb1ff86",
  "assignment_id": "d51fee0a-01f2-4aa9-8daa-9d24f501c1d4",
  "phase": "TO_PICKUP",
  "version": 0,
  "pickup": {
    "lat": 50.4437,
    "lon": 30.497
  },
  "pickup_label": "вул. Дмитрівська",
  "dropoff": {
    "lat": 50.4584,
    "lon": 30.43
  },
  "dropoff_label": "Нивки",
  "payment_method": "CARD",
  "price_minor": 16297,
  "currency": "UAH",
  "arrived_at": null,
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

(the car drives 6 s to the next point)

`POST /api/driver/v1/work-sessions/54c13629-ffb3-467f-8ea5-76796fe50026/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:04:29Z",
    "sequence": 1793387069542
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "54c13629-ffb3-467f-8ea5-76796fe50026",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "last_heartbeat_at": "2026-10-30T19:04:29.560457Z",
  "last_location_at": "2026-10-30T19:04:29.560457Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/0c5e1fd6-f9a6-4b85-a737-16a2af2bea27/arrive` → **200**

```json
{
  "command_id": "d35ec748-c915-4462-a907-b3a382a38308",
  "expected_version": 0
}
```

```json
{
  "id": "0c5e1fd6-f9a6-4b85-a737-16a2af2bea27",
  "order_id": "3987533e-937e-434f-8f37-58e72eb1ff86",
  "assignment_id": "d51fee0a-01f2-4aa9-8daa-9d24f501c1d4",
  "phase": "WAITING",
  "version": 1,
  "pickup": {
    "lat": 50.4437,
    "lon": 30.497
  },
  "pickup_label": "вул. Дмитрівська",
  "dropoff": {
    "lat": 50.4584,
    "lon": 30.43
  },
  "dropoff_label": "Нивки",
  "payment_method": "CARD",
  "price_minor": 16297,
  "currency": "UAH",
  "arrived_at": "2026-10-30T19:04:29.814058Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/0c5e1fd6-f9a6-4b85-a737-16a2af2bea27/start` → **200**

```json
{
  "command_id": "217fd8a7-12db-4057-8e42-90fc3eb54b86",
  "expected_version": 1
}
```

```json
{
  "id": "0c5e1fd6-f9a6-4b85-a737-16a2af2bea27",
  "order_id": "3987533e-937e-434f-8f37-58e72eb1ff86",
  "assignment_id": "d51fee0a-01f2-4aa9-8daa-9d24f501c1d4",
  "phase": "IN_PROGRESS",
  "version": 2,
  "pickup": {
    "lat": 50.4437,
    "lon": 30.497
  },
  "pickup_label": "вул. Дмитрівська",
  "dropoff": {
    "lat": 50.4584,
    "lon": 30.43
  },
  "dropoff_label": "Нивки",
  "payment_method": "CARD",
  "price_minor": 16297,
  "currency": "UAH",
  "arrived_at": "2026-10-30T19:04:29.814058Z",
  "started_at": "2026-10-30T19:04:30.072569Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/0c5e1fd6-f9a6-4b85-a737-16a2af2bea27/complete` → **200**

```json
{
  "command_id": "f24c46cb-b3d8-4d9a-b308-2db6eb88bd26",
  "expected_version": 2,
  "reported_at": "2026-10-30T19:04:30Z",
  "cash_received": true
}
```

```json
{
  "id": "0c5e1fd6-f9a6-4b85-a737-16a2af2bea27",
  "order_id": "3987533e-937e-434f-8f37-58e72eb1ff86",
  "assignment_id": "d51fee0a-01f2-4aa9-8daa-9d24f501c1d4",
  "phase": "COMPLETED",
  "version": 3,
  "pickup": {
    "lat": 50.4437,
    "lon": 30.497
  },
  "pickup_label": "вул. Дмитрівська",
  "dropoff": {
    "lat": 50.4584,
    "lon": 30.43
  },
  "dropoff_label": "Нивки",
  "payment_method": "CARD",
  "price_minor": 16297,
  "currency": "UAH",
  "arrived_at": "2026-10-30T19:04:29.814058Z",
  "started_at": "2026-10-30T19:04:30.072569Z",
  "completed_at": "2026-10-30T19:04:30.331863Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/3987533e-937e-434f-8f37-58e72eb1ff86` → **200**

```json
{
  "id": "3987533e-937e-434f-8f37-58e72eb1ff86",
  "short_number": 8,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "c01fba52-1ff4-48df-a578-1df1a3ab9f1c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4437,
    "lon": 30.497
  },
  "pickup_label": "вул. Дмитрівська",
  "dropoff": {
    "lat": 50.4584,
    "lon": 30.43
  },
  "dropoff_label": "Нивки",
  "payment_method": "CARD",
  "payment_state": "CAPTURE_PENDING",
  "price_minor": 16297,
  "final_price_minor": 16297,
  "currency": "UAH",
  "search_phase": "STOPPED",
  "assignment": {
    "id": "d51fee0a-01f2-4aa9-8daa-9d24f501c1d4",
    "order_id": "3987533e-937e-434f-8f37-58e72eb1ff86",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "0c5e1fd6-f9a6-4b85-a737-16a2af2bea27",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T19:04:20.992152Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3987533e-937e-434f-8f37-58e72eb1ff86` → **200**

```json
{
  "id": "3987533e-937e-434f-8f37-58e72eb1ff86",
  "short_number": 8,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "c01fba52-1ff4-48df-a578-1df1a3ab9f1c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4437,
    "lon": 30.497
  },
  "pickup_label": "вул. Дмитрівська",
  "dropoff": {
    "lat": 50.4584,
    "lon": 30.43
  },
  "dropoff_label": "Нивки",
  "payment_method": "CARD",
  "payment_state": "CAPTURE_PENDING",
  "price_minor": 16297,
  "final_price_minor": 16297,
  "currency": "UAH",
  "search_phase": "STOPPED",
  "assignment": {
    "id": "d51fee0a-01f2-4aa9-8daa-9d24f501c1d4",
    "order_id": "3987533e-937e-434f-8f37-58e72eb1ff86",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "0c5e1fd6-f9a6-4b85-a737-16a2af2bea27",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T19:04:20.992152Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3987533e-937e-434f-8f37-58e72eb1ff86` → **200**

```json
{
  "id": "3987533e-937e-434f-8f37-58e72eb1ff86",
  "short_number": 8,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "c01fba52-1ff4-48df-a578-1df1a3ab9f1c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4437,
    "lon": 30.497
  },
  "pickup_label": "вул. Дмитрівська",
  "dropoff": {
    "lat": 50.4584,
    "lon": 30.43
  },
  "dropoff_label": "Нивки",
  "payment_method": "CARD",
  "payment_state": "PAID",
  "price_minor": 16297,
  "final_price_minor": 16297,
  "currency": "UAH",
  "search_phase": "STOPPED",
  "assignment": {
    "id": "d51fee0a-01f2-4aa9-8daa-9d24f501c1d4",
    "order_id": "3987533e-937e-434f-8f37-58e72eb1ff86",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "0c5e1fd6-f9a6-4b85-a737-16a2af2bea27",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T19:04:20.992152Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/driver/v1/balance` → **200**

```json
{
  "balances": [
    {
      "currency": "UAH",
      "balance_minor": 13852,
      "debt_limit_minor": null,
      "blocked": false
    }
  ]
}
```

## The rider tips 15 % on the same card; all of it goes to Andrii

`GET /api/rider/v1/orders/3987533e-937e-434f-8f37-58e72eb1ff86/tip` → **200**

```json
{
  "order_id": "3987533e-937e-434f-8f37-58e72eb1ff86",
  "currency": "UAH",
  "trip_cost_minor": 16297,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1700
    },
    {
      "percent": 15,
      "amount_minor": 2500
    },
    {
      "percent": 20,
      "amount_minor": 3300
    },
    {
      "percent": 25,
      "amount_minor": 4100
    }
  ],
  "min_minor": 100,
  "max_minor": 16300,
  "method": "CARD",
  "available_until": "2026-10-31T19:04:30.331863Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/3987533e-937e-434f-8f37-58e72eb1ff86/tip` → **201**

```json
{
  "command_id": "cd2091f9-c32d-434a-bf1d-5ee739cc17d1",
  "amount_minor": 2500
}
```

```json
{
  "id": "a687d596-8e4b-49e4-b3ff-c3cc998a7891",
  "order_id": "3987533e-937e-434f-8f37-58e72eb1ff86",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T19:04:33.866007Z"
}
```

`GET /api/rider/v1/orders/3987533e-937e-434f-8f37-58e72eb1ff86/tip` → **200**

```json
{
  "order_id": "3987533e-937e-434f-8f37-58e72eb1ff86",
  "currency": "UAH",
  "trip_cost_minor": 16297,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1700
    },
    {
      "percent": 15,
      "amount_minor": 2500
    },
    {
      "percent": 20,
      "amount_minor": 3300
    },
    {
      "percent": 25,
      "amount_minor": 4100
    }
  ],
  "min_minor": 100,
  "max_minor": 16300,
  "method": "CARD",
  "available_until": "2026-10-31T19:04:30.331863Z",
  "open": false,
  "tip": {
    "id": "a687d596-8e4b-49e4-b3ff-c3cc998a7891",
    "order_id": "3987533e-937e-434f-8f37-58e72eb1ff86",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-30T19:04:33.866007Z"
  }
}
```

`GET /api/rider/v1/orders/3987533e-937e-434f-8f37-58e72eb1ff86/tip` → **200**

```json
{
  "order_id": "3987533e-937e-434f-8f37-58e72eb1ff86",
  "currency": "UAH",
  "trip_cost_minor": 16297,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1700
    },
    {
      "percent": 15,
      "amount_minor": 2500
    },
    {
      "percent": 20,
      "amount_minor": 3300
    },
    {
      "percent": 25,
      "amount_minor": 4100
    }
  ],
  "min_minor": 100,
  "max_minor": 16300,
  "method": "CARD",
  "available_until": "2026-10-31T19:04:30.331863Z",
  "open": false,
  "tip": {
    "id": "a687d596-8e4b-49e4-b3ff-c3cc998a7891",
    "order_id": "3987533e-937e-434f-8f37-58e72eb1ff86",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T19:04:33.866007Z"
  }
}
```

`GET /api/driver/v1/balance/history` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "balances": [
    {
      "currency": "UAH",
      "balance_minor": 13852
    }
  ],
  "entries": [
    {
      "id": "d1322c7e-10cf-4b8d-a7d3-69193987acc2",
      "at": "2026-10-30T19:04:30.770717Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "3987533e-937e-434f-8f37-58e72eb1ff86",
      "counterpart_id": null
    }
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
```

`GET /api/driver/v1/balance/history` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "balances": [
    {
      "currency": "UAH",
      "balance_minor": 16352
    }
  ],
  "entries": [
    {
      "id": "f3ae281a-e6d8-4d09-b106-76e9395137ee",
      "at": "2026-10-30T19:04:35.822289Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "3987533e-937e-434f-8f37-58e72eb1ff86",
      "counterpart_id": null
    },
    {
      "id": "d1322c7e-10cf-4b8d-a7d3-69193987acc2",
      "at": "2026-10-30T19:04:30.770717Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "3987533e-937e-434f-8f37-58e72eb1ff86",
      "counterpart_id": null
    }
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "64056e76-53a2-4196-abde-a94e79df949a",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4437,
    "lon": 30.4970
  },
  "dropoff": {
    "lat": 50.4584,
    "lon": 30.4300
  }
}
```

```json
{
  "id": "d05531f2-6769-4dd6-a266-69dc76b24476",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T19:09:37.114235Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false,
  "discount_minor": 0,
  "to_pay_minor": 16297,
  "promotions": []
}
```

## Bonuses cover the fare; 300 minor units remain for a larger card tip

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "3ae660f3-becf-4a44-9f0c-cb8a02fa431d",
  "subject": {
    "type": "STAFF",
    "id": "50e6407f-123d-42ca-9890-64ec61c07dce"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MGU2NDA3Zi0xMjNkLTQyY2EtOTg5MC02NGVjNjFjMDdkY2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODc5NzcsImlhdCI6MTc5MzM4NzA3NywianRpIjoiY2NhMGE2NDQtZTM3OC00MGI5LTllN2EtZmYxNDk1OWE3OGIzIiwic2lkIjoiM2FlNjYwZjMtYmVjZi00YTQ0LTlmMGMtY2I4YTAyZmE0MzFkIn0.P5ptKMfWc5fFioSTxCCYKxSw31RiAY0By2mLA62H3uA",
  "access_expires_at": "2026-10-30T19:19:37.638168881Z",
  "refresh_token": "vH6Htvin350EjOY73oSDO6EkKGm_0UGZ--0_ol3_HSo",
  "refresh_expires_at": "2026-10-31T07:04:37.637694925Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380734813511` → **200**

```json
{
  "client_id": "c01fba52-1ff4-48df-a578-1df1a3ab9f1c"
}
```

`POST /api/admin/v1/rider-wallets/c01fba52-1ff4-48df-a578-1df1a3ab9f1c/top-ups` → **201**

```json
{
  "command_id": "2f327e7c-51b3-4c53-b4f6-facaf9f4e67f",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "c01fba52-1ff4-48df-a578-1df1a3ab9f1c",
  "balances": [
    {
      "currency": "UAH",
      "balance_minor": 16597,
      "reserved_minor": 0,
      "available_minor": 16597
    }
  ],
  "entries": [
    {
      "id": "3324383d-2142-4162-bf1b-da76c4fec058",
      "at": "2026-10-30T19:04:38.114395Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "50e6407f-123d-42ca-9890-64ec61c07dce",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "4b246aab-d8de-48cb-811f-6a69867d6b4d",
  "quote_id": "d05531f2-6769-4dd6-a266-69dc76b24476",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4437,
    "lon": 30.4970
  },
  "pickup_label": "вул. Дмитрівська",
  "dropoff": {
    "lat": 50.4584,
    "lon": 30.4300
  },
  "dropoff_label": "Нивки",
  "payment_method": "CARD",
  "wallet_minor": 16297
}
```

```json
{
  "id": "681f7850-5b58-4b51-ac69-61c4fa660cef",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c01fba52-1ff4-48df-a578-1df1a3ab9f1c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4437,
    "lon": 30.497
  },
  "pickup_label": "вул. Дмитрівська",
  "dropoff": {
    "lat": 50.4584,
    "lon": 30.43
  },
  "dropoff_label": "Нивки",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 16297,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "PERSONAL",
  "assignment": null,
  "created_at": "2026-10-30T19:04:38.383023Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/681f7850-5b58-4b51-ac69-61c4fa660cef` → **200**

```json
{
  "id": "681f7850-5b58-4b51-ac69-61c4fa660cef",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c01fba52-1ff4-48df-a578-1df1a3ab9f1c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4437,
    "lon": 30.497
  },
  "pickup_label": "вул. Дмитрівська",
  "dropoff": {
    "lat": 50.4584,
    "lon": 30.43
  },
  "dropoff_label": "Нивки",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 16297,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "PERSONAL",
  "assignment": null,
  "created_at": "2026-10-30T19:04:38.383023Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

## Andrii takes it and drives

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "42777a47-ac32-40c2-92af-8955ebce77b9",
    "order_id": "681f7850-5b58-4b51-ac69-61c4fa660cef",
    "expires_at": "2026-10-30T19:04:53.387004Z",
    "vehicle_class": "STANDARD",
    "pickup": {
      "lat": 50.4437,
      "lon": 30.497
    },
    "pickup_label": "вул. Дмитрівська",
    "dropoff_label": "Нивки",
    "payment_method": "CASH",
    "price_minor": 16297,
    "currency": "UAH",
    "distance_m": 11
  }
]
```

`POST /api/driver/v1/offers/42777a47-ac32-40c2-92af-8955ebce77b9/accept` → **200**

```json
{
  "command_id": "24e3fc90-c19d-49e0-82fc-e49367e2a5a9"
}
```

```json
{
  "id": "28c95a9f-eb0d-4996-83f3-1d7df51ccf86",
  "order_id": "681f7850-5b58-4b51-ac69-61c4fa660cef",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "ed2c6a60-8bf1-461f-aff7-5efa890526eb",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "ed2c6a60-8bf1-461f-aff7-5efa890526eb",
  "order_id": "681f7850-5b58-4b51-ac69-61c4fa660cef",
  "assignment_id": "28c95a9f-eb0d-4996-83f3-1d7df51ccf86",
  "phase": "TO_PICKUP",
  "version": 0,
  "pickup": {
    "lat": 50.4437,
    "lon": 30.497
  },
  "pickup_label": "вул. Дмитрівська",
  "dropoff": {
    "lat": 50.4584,
    "lon": 30.43
  },
  "dropoff_label": "Нивки",
  "payment_method": "CASH",
  "price_minor": 16297,
  "currency": "UAH",
  "arrived_at": null,
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/54c13629-ffb3-467f-8ea5-76796fe50026/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:04:39Z",
    "sequence": 1793387079674
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "54c13629-ffb3-467f-8ea5-76796fe50026",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "last_heartbeat_at": "2026-10-30T19:04:39.693538Z",
  "last_location_at": "2026-10-30T19:04:39.693538Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/ed2c6a60-8bf1-461f-aff7-5efa890526eb/arrive` → **200**

```json
{
  "command_id": "6ca8e02e-c757-4707-8a7d-5ba7d474ab34",
  "expected_version": 0
}
```

```json
{
  "id": "ed2c6a60-8bf1-461f-aff7-5efa890526eb",
  "order_id": "681f7850-5b58-4b51-ac69-61c4fa660cef",
  "assignment_id": "28c95a9f-eb0d-4996-83f3-1d7df51ccf86",
  "phase": "WAITING",
  "version": 1,
  "pickup": {
    "lat": 50.4437,
    "lon": 30.497
  },
  "pickup_label": "вул. Дмитрівська",
  "dropoff": {
    "lat": 50.4584,
    "lon": 30.43
  },
  "dropoff_label": "Нивки",
  "payment_method": "CASH",
  "price_minor": 16297,
  "currency": "UAH",
  "arrived_at": "2026-10-30T19:04:39.945311Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/ed2c6a60-8bf1-461f-aff7-5efa890526eb/start` → **200**

```json
{
  "command_id": "460a885b-6c67-4236-b23e-075367811546",
  "expected_version": 1
}
```

```json
{
  "id": "ed2c6a60-8bf1-461f-aff7-5efa890526eb",
  "order_id": "681f7850-5b58-4b51-ac69-61c4fa660cef",
  "assignment_id": "28c95a9f-eb0d-4996-83f3-1d7df51ccf86",
  "phase": "IN_PROGRESS",
  "version": 2,
  "pickup": {
    "lat": 50.4437,
    "lon": 30.497
  },
  "pickup_label": "вул. Дмитрівська",
  "dropoff": {
    "lat": 50.4584,
    "lon": 30.43
  },
  "dropoff_label": "Нивки",
  "payment_method": "CASH",
  "price_minor": 16297,
  "currency": "UAH",
  "arrived_at": "2026-10-30T19:04:39.945311Z",
  "started_at": "2026-10-30T19:04:40.200723Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/ed2c6a60-8bf1-461f-aff7-5efa890526eb/complete` → **200**

```json
{
  "command_id": "367fa585-2089-4fa8-bc21-7380c48958e9",
  "expected_version": 2,
  "reported_at": "2026-10-30T19:04:40Z",
  "cash_received": true
}
```

```json
{
  "id": "ed2c6a60-8bf1-461f-aff7-5efa890526eb",
  "order_id": "681f7850-5b58-4b51-ac69-61c4fa660cef",
  "assignment_id": "28c95a9f-eb0d-4996-83f3-1d7df51ccf86",
  "phase": "COMPLETED",
  "version": 3,
  "pickup": {
    "lat": 50.4437,
    "lon": 30.497
  },
  "pickup_label": "вул. Дмитрівська",
  "dropoff": {
    "lat": 50.4584,
    "lon": 30.43
  },
  "dropoff_label": "Нивки",
  "payment_method": "CASH",
  "price_minor": 16297,
  "currency": "UAH",
  "arrived_at": "2026-10-30T19:04:39.945311Z",
  "started_at": "2026-10-30T19:04:40.200723Z",
  "completed_at": "2026-10-30T19:04:40.455757Z",
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "c01fba52-1ff4-48df-a578-1df1a3ab9f1c",
  "balances": [
    {
      "currency": "UAH",
      "balance_minor": 16597,
      "reserved_minor": 16297,
      "available_minor": 300
    }
  ],
  "entries": [
    {
      "id": "3324383d-2142-4162-bf1b-da76c4fec058",
      "at": "2026-10-30T19:04:38.114395Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "50e6407f-123d-42ca-9890-64ec61c07dce",
      "order_id": null
    }
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
```

`GET /api/driver/v1/balance` → **200**

```json
{
  "balances": [
    {
      "currency": "UAH",
      "balance_minor": 30204,
      "debt_limit_minor": null,
      "blocked": false
    }
  ]
}
```

## The rider tips 15 % on the same card; all of it goes to Andrii

`GET /api/rider/v1/orders/681f7850-5b58-4b51-ac69-61c4fa660cef/tip` → **200**

```json
{
  "order_id": "681f7850-5b58-4b51-ac69-61c4fa660cef",
  "currency": "UAH",
  "trip_cost_minor": 16297,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1700
    },
    {
      "percent": 15,
      "amount_minor": 2500
    },
    {
      "percent": 20,
      "amount_minor": 3300
    },
    {
      "percent": 25,
      "amount_minor": 4100
    }
  ],
  "min_minor": 100,
  "max_minor": 16300,
  "method": "WALLET",
  "available_until": "2026-10-31T19:04:40.455757Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/681f7850-5b58-4b51-ac69-61c4fa660cef/tip` → **201**

```json
{
  "command_id": "3c3c48d2-0724-4ce0-9ff6-22d074e1d4f4",
  "amount_minor": 2500
}
```

```json
{
  "id": "5df82a84-5072-45a7-b67c-be17a16741fe",
  "order_id": "681f7850-5b58-4b51-ac69-61c4fa660cef",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T19:04:41.454089Z"
}
```

`GET /api/rider/v1/orders/681f7850-5b58-4b51-ac69-61c4fa660cef/tip` → **200**

```json
{
  "order_id": "681f7850-5b58-4b51-ac69-61c4fa660cef",
  "currency": "UAH",
  "trip_cost_minor": 16297,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1700
    },
    {
      "percent": 15,
      "amount_minor": 2500
    },
    {
      "percent": 20,
      "amount_minor": 3300
    },
    {
      "percent": 25,
      "amount_minor": 4100
    }
  ],
  "min_minor": 100,
  "max_minor": 16300,
  "method": "WALLET",
  "available_until": "2026-10-31T19:04:40.455757Z",
  "open": false,
  "tip": {
    "id": "5df82a84-5072-45a7-b67c-be17a16741fe",
    "order_id": "681f7850-5b58-4b51-ac69-61c4fa660cef",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-30T19:04:41.454089Z"
  }
}
```

`GET /api/rider/v1/orders/681f7850-5b58-4b51-ac69-61c4fa660cef/tip` → **200**

```json
{
  "order_id": "681f7850-5b58-4b51-ac69-61c4fa660cef",
  "currency": "UAH",
  "trip_cost_minor": 16297,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1700
    },
    {
      "percent": 15,
      "amount_minor": 2500
    },
    {
      "percent": 20,
      "amount_minor": 3300
    },
    {
      "percent": 25,
      "amount_minor": 4100
    }
  ],
  "min_minor": 100,
  "max_minor": 16300,
  "method": "WALLET",
  "available_until": "2026-10-31T19:04:40.455757Z",
  "open": false,
  "tip": {
    "id": "5df82a84-5072-45a7-b67c-be17a16741fe",
    "order_id": "681f7850-5b58-4b51-ac69-61c4fa660cef",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T19:04:41.454089Z"
  }
}
```

`GET /api/driver/v1/balance/history` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "balances": [
    {
      "currency": "UAH",
      "balance_minor": 32704
    }
  ],
  "entries": [
    {
      "id": "139b57bd-190e-4909-a7cd-27abad1d202f",
      "at": "2026-10-30T19:04:42.902983Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "681f7850-5b58-4b51-ac69-61c4fa660cef",
      "counterpart_id": null
    },
    {
      "id": "ccad6a94-aea1-4237-92c3-6e672b1ad065",
      "at": "2026-10-30T19:04:40.860302Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "681f7850-5b58-4b51-ac69-61c4fa660cef",
      "counterpart_id": null
    },
    {
      "id": "f3ae281a-e6d8-4d09-b106-76e9395137ee",
      "at": "2026-10-30T19:04:35.822289Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "3987533e-937e-434f-8f37-58e72eb1ff86",
      "counterpart_id": null
    },
    {
      "id": "d1322c7e-10cf-4b8d-a7d3-69193987acc2",
      "at": "2026-10-30T19:04:30.770717Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "3987533e-937e-434f-8f37-58e72eb1ff86",
      "counterpart_id": null
    }
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "54c13629-ffb3-467f-8ea5-76796fe50026",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "last_heartbeat_at": "2026-10-30T19:04:39.693538Z",
  "last_location_at": "2026-10-30T19:04:39.693538Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/54c13629-ffb3-467f-8ea5-76796fe50026/close` → **200**

```json
{
  "command_id": "2fb77e0f-044a-4b6e-98e0-df3973eee063",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": null,
  "session_version": 0,
  "session_state": "CLOSED",
  "intent": null,
  "connection": "DISCONNECTED",
  "geolocation": "UNAVAILABLE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": null,
  "vehicle_id": null,
  "last_heartbeat_at": null,
  "last_location_at": null,
  "eligible": false,
  "ineligible_reasons": [
    "NO_OPEN_SESSION"
  ]
}
```

Done: card order 681f7850-5b58-4b51-ac69-61c4fa660cef.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": null,
  "session_version": 0,
  "session_state": "CLOSED",
  "intent": null,
  "connection": "DISCONNECTED",
  "geolocation": "UNAVAILABLE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": null,
  "vehicle_id": null,
  "last_heartbeat_at": null,
  "last_location_at": null,
  "eligible": false,
  "ineligible_reasons": [
    "NO_OPEN_SESSION"
  ]
}
```

# Scenario: card-top-up

## The rider tops up the bonus account by 150.00

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380732786782",
  "device_ref": "sandbox-3133"
}
```

```json
{
  "challenge_id": "576120ff-99b5-4ff0-b866-3e6748383c35",
  "expires_at": "2026-10-30T19:09:44.18305141Z",
  "resend_available_at": "2026-10-30T19:04:45.18305141Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380732786782` → **200**

```json
{
  "phone": "+380732786782",
  "audience": "CLIENT",
  "code": "840111",
  "sent_at": "2026-10-30T19:04:44.185311144Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "576120ff-99b5-4ff0-b866-3e6748383c35",
  "code": "840111",
  "device_ref": "sandbox-3133"
}
```

```json
{
  "session_id": "38badfee-110f-4dc3-b41c-0d51d26ab28d",
  "subject": {
    "type": "CLIENT",
    "id": "37e82a2e-9ae5-426b-8204-2f3fc3a5085c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzN2U4MmEyZS05YWU1LTQyNmItODIwNC0yZjNmYzNhNTA4NWMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzg3OTg0LCJpYXQiOjE3OTMzODcwODQsImp0aSI6IjY4ODU3NWZhLTIzNjgtNDdkMy1iMDA4LTZkNjM5ZGJmMDExZCIsInNpZCI6IjM4YmFkZmVlLTExMGYtNGRjMy1iNDFjLTBkNTFkMjZhYjI4ZCJ9.3z0ET7hIGjYSYKj3lwcfpQPLL1SpHcrK3e2-nf8H4Xg",
  "access_expires_at": "2026-10-30T19:19:44.450191561Z",
  "refresh_token": "l0jgosn1LGprEs5iyF7M0XqdeSjIu3eBNIXgTRDKlHA",
  "refresh_expires_at": "2026-11-29T19:04:44.449262056Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "b2b5baac-b339-4639-a9ba-4d9adf7bfe3c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "72b49c9f-7d6c-43ff-9e88-58b910f38b0d",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-72b49c9f-7d6c-43ff-9e88-58b910f38b0d",
    "orderDate": "1793387084",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "fb205d78e76c5bc4d9116808f1ec0a63",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=72b49c9f-7d6c-43ff-9e88-58b910f38b0d",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380732786782"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=72b49c9f-7d6c-43ff-9e88-58b910f38b0d",
  "created_at": "2026-10-30T19:04:44.696472Z",
  "expires_at": "2026-10-30T19:34:44.696472Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/72b49c9f-7d6c-43ff-9e88-58b910f38b0d` → **200**

```json
{
  "id": "72b49c9f-7d6c-43ff-9e88-58b910f38b0d",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T19:04:44.696472Z",
  "expires_at": "2026-10-30T19:34:44.696472Z",
  "completed_at": "2026-10-30T19:04:44.942872Z",
  "masked_pan": "41****7310",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "37e82a2e-9ae5-426b-8204-2f3fc3a5085c",
  "balances": [],
  "entries": [],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "37e82a2e-9ae5-426b-8204-2f3fc3a5085c",
  "balances": [
    {
      "currency": "UAH",
      "balance_minor": 15000,
      "reserved_minor": 0,
      "available_minor": 15000
    }
  ],
  "entries": [
    {
      "id": "507fbc04-40f8-4ead-8417-8057b3aad6a2",
      "at": "2026-10-30T19:04:45.917186Z",
      "kind": "CARD_TOP_UP",
      "currency": "UAH",
      "amount_minor": 15000,
      "reason": "Top-up by card",
      "staff_id": null,
      "order_id": null
    }
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "37e82a2e-9ae5-426b-8204-2f3fc3a5085c",
  "balances": [
    {
      "currency": "UAH",
      "balance_minor": 15000,
      "reserved_minor": 0,
      "available_minor": 15000
    }
  ],
  "entries": [
    {
      "id": "507fbc04-40f8-4ead-8417-8057b3aad6a2",
      "at": "2026-10-30T19:04:45.917186Z",
      "kind": "CARD_TOP_UP",
      "currency": "UAH",
      "amount_minor": 15000,
      "reason": "Top-up by card",
      "staff_id": null,
      "order_id": null
    }
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
```

## The driver tops up the balance by 500.00

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-15754"
}
```

```json
{
  "challenge_id": "8cd9edb7-b901-40e1-8942-0864c67a72ee",
  "expires_at": "2026-10-30T19:09:46.930231563Z",
  "resend_available_at": "2026-10-30T19:04:47.930231563Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "099454",
  "sent_at": "2026-10-30T19:04:46.932399809Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8cd9edb7-b901-40e1-8942-0864c67a72ee",
  "code": "099454",
  "device_ref": "sandbox-15754"
}
```

```json
{
  "session_id": "2f4f5f06-c01f-4414-affe-84a8e06e49d3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4Nzk4NywiaWF0IjoxNzkzMzg3MDg3LCJqdGkiOiJiMWYwZmEzOC03NTc1LTQ4MzEtYjZjNS1hZWUxMjhmNjUzYTkiLCJzaWQiOiIyZjRmNWYwNi1jMDFmLTQ0MTQtYWZmZS04NGE4ZTA2ZTQ5ZDMifQ.By4giHY0p-V3gkFqM1yTRAsqjgfWwMofP7lmoT9tYl0",
  "access_expires_at": "2026-10-30T19:19:47.194250278Z",
  "refresh_token": "Ei0FRiX4gNllFPX_OV088eEZYDpvvc9xbOpxCJp8tFI",
  "refresh_expires_at": "2026-11-29T19:04:47.193796502Z",
  "account_created": false
}
```

`GET /api/driver/v1/balance/history` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "balances": [],
  "entries": [],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
```

`POST /api/driver/v1/balance/card-top-ups` → **201**

```json
{
  "command_id": "b5abd919-6dc2-4404-a0b9-d8d43a0c8f5e",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "5e449c99-fce0-4df6-8547-cfb99436b105",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-5e449c99-fce0-4df6-8547-cfb99436b105",
    "orderDate": "1793387087",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "c15062d5f0eac18763471423c536a01a",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=5e449c99-fce0-4df6-8547-cfb99436b105",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=5e449c99-fce0-4df6-8547-cfb99436b105",
  "created_at": "2026-10-30T19:04:47.664467Z",
  "expires_at": "2026-10-30T19:34:47.664467Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/5e449c99-fce0-4df6-8547-cfb99436b105` → **200**

```json
{
  "id": "5e449c99-fce0-4df6-8547-cfb99436b105",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T19:04:47.664467Z",
  "expires_at": "2026-10-30T19:34:47.664467Z",
  "completed_at": "2026-10-30T19:04:47.908322Z",
  "masked_pan": "41****1515",
  "failure_reason": null
}
```

`GET /api/driver/v1/balance/history` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "balances": [
    {
      "currency": "UAH",
      "balance_minor": 50000
    }
  ],
  "entries": [
    {
      "id": "e52a993c-dc7e-4184-ad75-9086c8e72f5e",
      "at": "2026-10-30T19:04:47.924599Z",
      "kind": "CARD_TOP_UP",
      "currency": "UAH",
      "amount_minor": 50000,
      "reason": "Top-up by card",
      "order_id": null,
      "counterpart_id": null
    }
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
```

## A rider's token does not open the driver's path

`POST /api/driver/v1/balance/card-top-ups` → **401**

```json
{
  "command_id": "282af63d-e3b9-4c5f-a4c8-03df49e1e1b8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "instance": "/api/driver/v1/balance/card-top-ups",
  "status": 401,
  "title": "Unauthenticated",
  "type": "https://errors.blizz.taxi/unauthenticated",
  "code": "UNAUTHENTICATED",
  "correlation_id": "061099bf-e550-4c03-833d-fa0b0bff8e02"
}
```

Done: the rider's account and the driver's balance were topped up by card.

# Scenario: cash-dispute

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-12530"
}
```

```json
{
  "challenge_id": "138dc792-78a2-4506-9fab-6bf4d2082859",
  "expires_at": "2026-10-30T19:09:48.689667413Z",
  "resend_available_at": "2026-10-30T19:04:49.689667413Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "982549",
  "sent_at": "2026-10-30T19:04:48.691794957Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "138dc792-78a2-4506-9fab-6bf4d2082859",
  "code": "982549",
  "device_ref": "sandbox-12530"
}
```

```json
{
  "session_id": "ff2651d7-88e0-4484-a619-1cd03f0a1756",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4Nzk4OCwiaWF0IjoxNzkzMzg3MDg4LCJqdGkiOiI3NjY3OGM4Ni02YWMyLTQzZDEtYjA3Ni02Mjg5YWQwYzAyNTgiLCJzaWQiOiJmZjI2NTFkNy04OGUwLTQ0ODQtYTYxOS0xY2QwM2YwYTE3NTYifQ.ll5tbg5kjj7qJtnFbsJ1RZ9463paeTHTsp_SV-JH5vA",
  "access_expires_at": "2026-10-30T19:19:48.958191274Z",
  "refresh_token": "71wCD5ZOK41cUJARNlkD0elFQ4iBJT4HcXRFf3lf1E4",
  "refresh_expires_at": "2026-11-29T19:04:48.957706151Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": null,
  "session_version": 0,
  "session_state": "CLOSED",
  "intent": null,
  "connection": "DISCONNECTED",
  "geolocation": "UNAVAILABLE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": null,
  "vehicle_id": null,
  "last_heartbeat_at": null,
  "last_location_at": null,
  "eligible": false,
  "ineligible_reasons": [
    "NO_OPEN_SESSION"
  ]
}
```

`POST /api/driver/v1/work-sessions` → **201**

```json
{
  "command_id": "eda0564e-9be2-436b-9d31-56385b513497",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:04:49Z",
    "sequence": 1793387089450
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f56ce656-aacf-4dc6-94fa-f59e3e13c22f",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T19:04:49.468841Z",
  "last_location_at": "2026-10-30T19:04:49.468841Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A rider orders for cash

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634114357",
  "device_ref": "sandbox-6534"
}
```

```json
{
  "challenge_id": "1ce93089-6766-4d82-aa0e-ca0e4f165c0d",
  "expires_at": "2026-10-30T19:09:49.714668825Z",
  "resend_available_at": "2026-10-30T19:04:50.714668825Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380634114357` → **200**

```json
{
  "phone": "+380634114357",
  "audience": "CLIENT",
  "code": "640035",
  "sent_at": "2026-10-30T19:04:49.716888519Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1ce93089-6766-4d82-aa0e-ca0e4f165c0d",
  "code": "640035",
  "device_ref": "sandbox-6534"
}
```

```json
{
  "session_id": "2f678778-4ef3-4cb7-8c12-1a5fb2678f7e",
  "subject": {
    "type": "CLIENT",
    "id": "e21dc6c6-ecab-4d16-9a55-ac6219c3c281"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMjFkYzZjNi1lY2FiLTRkMTYtOWE1NS1hYzYyMTljM2MyODEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzg3OTg5LCJpYXQiOjE3OTMzODcwODksImp0aSI6Ijc2ZWJlYWRmLTNkMGEtNDMyNi05OWFjLTcwZDE4MmQ4M2I1YiIsInNpZCI6IjJmNjc4Nzc4LTRlZjMtNGNiNy04YzEyLTFhNWZiMjY3OGY3ZSJ9.Jl7RuBXAuiObwIXWTAGJqKo81LsD_FkLGe_SSS_ShiY",
  "access_expires_at": "2026-10-30T19:19:49.982850732Z",
  "refresh_token": "sm59vftqWqElxGdl1hJ3M5joMg1ye1essyPdaVOsFow",
  "refresh_expires_at": "2026-11-29T19:04:49.982424432Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6f29ff5f-f203-4a7b-a43d-b5df4b43e2b3",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  }
}
```

```json
{
  "id": "e90583db-d2cc-44d7-aa36-8d027cf7a12f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T19:09:50.224170Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false,
  "discount_minor": 0,
  "to_pay_minor": 10517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "437b2b8e-5c4f-4bda-936d-a0f70b8eae1c",
  "quote_id": "e90583db-d2cc-44d7-aa36-8d027cf7a12f",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH"
}
```

```json
{
  "id": "e31bdfd1-a3f3-4f6d-8372-268dd0a18f83",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e21dc6c6-ecab-4d16-9a55-ac6219c3c281",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "PERSONAL",
  "assignment": null,
  "created_at": "2026-10-30T19:04:50.480825Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

## Ivan drives; at the end the rider has no money and leaves

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "ff0ef318-6c53-4790-bd50-473ccda8fdc3",
    "order_id": "e31bdfd1-a3f3-4f6d-8372-268dd0a18f83",
    "expires_at": "2026-10-30T19:05:05.483698Z",
    "vehicle_class": "STANDARD",
    "pickup": {
      "lat": 50.4501,
      "lon": 30.5234
    },
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "payment_method": "CASH",
    "price_minor": 10517,
    "currency": "UAH",
    "distance_m": 100
  }
]
```

`POST /api/driver/v1/offers/ff0ef318-6c53-4790-bd50-473ccda8fdc3/accept` → **200**

```json
{
  "command_id": "07a4892f-4e43-4ae6-9eb3-d4e546af26d3"
}
```

```json
{
  "id": "7b963c0b-0e57-424b-899d-3fdaf4bc1e52",
  "order_id": "e31bdfd1-a3f3-4f6d-8372-268dd0a18f83",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "aa92c5c3-4eb5-4b01-b8f0-af78857d69dc",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "aa92c5c3-4eb5-4b01-b8f0-af78857d69dc",
  "order_id": "e31bdfd1-a3f3-4f6d-8372-268dd0a18f83",
  "assignment_id": "7b963c0b-0e57-424b-899d-3fdaf4bc1e52",
  "phase": "TO_PICKUP",
  "version": 0,
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "price_minor": 10517,
  "currency": "UAH",
  "arrived_at": null,
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/f56ce656-aacf-4dc6-94fa-f59e3e13c22f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:04:51Z",
    "sequence": 1793387091490
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f56ce656-aacf-4dc6-94fa-f59e3e13c22f",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T19:04:51.506625Z",
  "last_location_at": "2026-10-30T19:04:51.506625Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/aa92c5c3-4eb5-4b01-b8f0-af78857d69dc/arrive` → **200**

```json
{
  "command_id": "966b6e3d-5610-4799-a421-12be223fd3b0",
  "expected_version": 0
}
```

```json
{
  "id": "aa92c5c3-4eb5-4b01-b8f0-af78857d69dc",
  "order_id": "e31bdfd1-a3f3-4f6d-8372-268dd0a18f83",
  "assignment_id": "7b963c0b-0e57-424b-899d-3fdaf4bc1e52",
  "phase": "WAITING",
  "version": 1,
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "price_minor": 10517,
  "currency": "UAH",
  "arrived_at": "2026-10-30T19:04:51.748253Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/aa92c5c3-4eb5-4b01-b8f0-af78857d69dc/start` → **200**

```json
{
  "command_id": "1460492c-2ccb-424d-bc12-ecccd0e7bfc0",
  "expected_version": 1
}
```

```json
{
  "id": "aa92c5c3-4eb5-4b01-b8f0-af78857d69dc",
  "order_id": "e31bdfd1-a3f3-4f6d-8372-268dd0a18f83",
  "assignment_id": "7b963c0b-0e57-424b-899d-3fdaf4bc1e52",
  "phase": "IN_PROGRESS",
  "version": 2,
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "price_minor": 10517,
  "currency": "UAH",
  "arrived_at": "2026-10-30T19:04:51.748253Z",
  "started_at": "2026-10-30T19:04:52.011097Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/aa92c5c3-4eb5-4b01-b8f0-af78857d69dc/complete` → **200**

```json
{
  "command_id": "e5bd314c-d817-4281-bc30-f947fd44250a",
  "expected_version": 2,
  "reported_at": "2026-10-30T19:04:52Z",
  "cash_received": false
}
```

```json
{
  "id": "aa92c5c3-4eb5-4b01-b8f0-af78857d69dc",
  "order_id": "e31bdfd1-a3f3-4f6d-8372-268dd0a18f83",
  "assignment_id": "7b963c0b-0e57-424b-899d-3fdaf4bc1e52",
  "phase": "COMPLETED",
  "version": 3,
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "price_minor": 10517,
  "currency": "UAH",
  "arrived_at": "2026-10-30T19:04:51.748253Z",
  "started_at": "2026-10-30T19:04:52.011097Z",
  "completed_at": "2026-10-30T19:04:52.267167Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Finance sees the dispute, with its deadline

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "b33de1c4-2239-4fee-9319-5e76e139a20b",
  "subject": {
    "type": "STAFF",
    "id": "50e6407f-123d-42ca-9890-64ec61c07dce"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MGU2NDA3Zi0xMjNkLTQyY2EtOTg5MC02NGVjNjFjMDdkY2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODc5OTIsImlhdCI6MTc5MzM4NzA5MiwianRpIjoiMzUxNzA4NzQtODEyMy00YmE3LTgwNDQtMjVlMGI1ODUzYTVjIiwic2lkIjoiYjMzZGUxYzQtMjIzOS00ZmVlLTkzMTktNWU3NmUxMzlhMjBiIn0.WHgP_XtA7l-7b-oBkWUcNIUkAu__P0dFt7EZ_5RENls",
  "access_expires_at": "2026-10-30T19:19:52.780077582Z",
  "refresh_token": "4BqPYjxzJF-MtYfObjS14eVDbG02n8clnTNxpB4KSEQ",
  "refresh_expires_at": "2026-10-31T07:04:52.779614251Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/e31bdfd1-a3f3-4f6d-8372-268dd0a18f83/cash-dispute` → **200**

```json
{
  "order_id": "e31bdfd1-a3f3-4f6d-8372-268dd0a18f83",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "e21dc6c6-ecab-4d16-9a55-ac6219c3c281",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T19:04:52.971429Z",
  "decide_by": "2026-11-13T19:04:52.971429Z",
  "decision": null,
  "decided_by": null,
  "reason": null,
  "decided_at": null,
  "version": 1
}
```

Dispute: {"held_minor":0,"rider_debt_minor":10517,"decide_by":"2026-11-13T19:04:52.971429Z","decision":null}

`GET /api/admin/v1/cash-disputes` → **200**

```json
{
  "disputes": [
    {
      "order_id": "e31bdfd1-a3f3-4f6d-8372-268dd0a18f83",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "payer_client_id": "e21dc6c6-ecab-4d16-9a55-ac6219c3c281",
      "currency": "UAH",
      "held_minor": 0,
      "rider_debt_minor": 10517,
      "opened_at": "2026-10-30T19:04:52.971429Z",
      "decide_by": "2026-11-13T19:04:52.971429Z",
      "decision": null,
      "decided_by": null,
      "reason": null,
      "decided_at": null,
      "version": 1
    }
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
```

## Finance decides: the rider did not pay, the service pays the driver

`POST /api/admin/v1/orders/e31bdfd1-a3f3-4f6d-8372-268dd0a18f83/cash-dispute/decide` → **400**

```json
{
  "command_id": "b8492b44-a26e-43c2-9932-4bd78804ac92",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/orders/e31bdfd1-a3f3-4f6d-8372-268dd0a18f83/cash-dispute/decide",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "5f7bbaef-64d5-4590-8cb3-d945c55a1718",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

`POST /api/admin/v1/orders/e31bdfd1-a3f3-4f6d-8372-268dd0a18f83/cash-dispute/decide` → **200**

```json
{
  "command_id": "9a9caf37-697d-4868-b1c2-cc5f320b401f",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": "The rider does not answer calls"
}
```

```json
{
  "order_id": "e31bdfd1-a3f3-4f6d-8372-268dd0a18f83",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "e21dc6c6-ecab-4d16-9a55-ac6219c3c281",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T19:04:52.971429Z",
  "decide_by": "2026-11-13T19:04:52.971429Z",
  "decision": "PAY_DRIVER",
  "decided_by": "50e6407f-123d-42ca-9890-64ec61c07dce",
  "reason": "The rider does not answer calls",
  "decided_at": "2026-10-30T19:04:53.798671Z",
  "version": 2
}
```

`POST /api/admin/v1/orders/e31bdfd1-a3f3-4f6d-8372-268dd0a18f83/cash-dispute/decide` → **409**

```json
{
  "command_id": "4b6004d4-a500-4cab-9be6-9797986e45c4",
  "expected_version": 2,
  "decision": "RIDER_PAID",
  "reason": "Again"
}
```

```json
{
  "instance": "/api/admin/v1/orders/e31bdfd1-a3f3-4f6d-8372-268dd0a18f83/cash-dispute/decide",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "2aba4f77-24ae-4283-a243-512eff5534c0"
}
```

Done: an unpaid cash trip became a dispute and was decided once.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f56ce656-aacf-4dc6-94fa-f59e3e13c22f",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T19:04:51.506625Z",
  "last_location_at": "2026-10-30T19:04:51.506625Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f56ce656-aacf-4dc6-94fa-f59e3e13c22f/close` → **200**

```json
{
  "command_id": "15e245c5-00c2-484c-a1ab-aeb4fcd017bf",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": null,
  "session_version": 0,
  "session_state": "CLOSED",
  "intent": null,
  "connection": "DISCONNECTED",
  "geolocation": "UNAVAILABLE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": null,
  "vehicle_id": null,
  "last_heartbeat_at": null,
  "last_location_at": null,
  "eligible": false,
  "ineligible_reasons": [
    "NO_OPEN_SESSION"
  ]
}
```

# Scenario: chargeback

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380739105335",
  "device_ref": "sandbox-4219"
}
```

```json
{
  "challenge_id": "0399e5f4-0ce0-4473-8f86-92f08b6e2800",
  "expires_at": "2026-10-30T19:09:54.803857553Z",
  "resend_available_at": "2026-10-30T19:04:55.803857553Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380739105335` → **200**

```json
{
  "phone": "+380739105335",
  "audience": "CLIENT",
  "code": "014951",
  "sent_at": "2026-10-30T19:04:54.806132863Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0399e5f4-0ce0-4473-8f86-92f08b6e2800",
  "code": "014951",
  "device_ref": "sandbox-4219"
}
```

```json
{
  "session_id": "86a323a7-4531-49ca-a25f-3742edd4172b",
  "subject": {
    "type": "CLIENT",
    "id": "3e0c41d7-eb6c-4d8c-a953-9ed8521683b7"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzZTBjNDFkNy1lYjZjLTRkOGMtYTk1My05ZWQ4NTIxNjgzYjciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzg3OTk1LCJpYXQiOjE3OTMzODcwOTUsImp0aSI6ImM3YzY4ODc3LWM2M2EtNDU2My04Mzc5LTI4NWUyMDZiZDA1ZSIsInNpZCI6Ijg2YTMyM2E3LTQ1MzEtNDljYS1hMjVmLTM3NDJlZGQ0MTcyYiJ9.Ra64KK-4ZQK6AFc5rJ2aLy7t1hLBNVQWj2uIeguoSS8",
  "access_expires_at": "2026-10-30T19:19:55.069866053Z",
  "refresh_token": "KzFi2okXb78sBqxa-SCGLU_j40CsOhXrfsYQ0Z27FrM",
  "refresh_expires_at": "2026-11-29T19:04:55.069408331Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "7afaad1e-7d02-441c-afad-af4d623262d6",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "af251ee5-fc04-4d12-ac4b-725342f07f34",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-af251ee5-fc04-4d12-ac4b-725342f07f34",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "293dbbbd6ff549d18562974c58242057",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=af251ee5-fc04-4d12-ac4b-725342f07f34",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380739105335"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=af251ee5-fc04-4d12-ac4b-725342f07f34",
  "expires_at": "2026-10-30T19:34:55.309663Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/af251ee5-fc04-4d12-ac4b-725342f07f34` → **200**

```json
{
  "id": "af251ee5-fc04-4d12-ac4b-725342f07f34",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T19:34:55.309663Z",
  "card": {
    "id": "d162e8e0-2ee3-4328-b01e-221836da944f",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****6586",
    "card_type": "Visa",
    "created_at": "2026-10-30T19:04:55.5553Z"
  },
  "failure_reason": null
}
```

## Andrii is online nearby

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-5156"
}
```

```json
{
  "challenge_id": "d23dec66-1d39-4e61-907c-af3d2c94814b",
  "expires_at": "2026-10-30T19:09:55.812804327Z",
  "resend_available_at": "2026-10-30T19:04:56.812804327Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "308159",
  "sent_at": "2026-10-30T19:04:55.814876651Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d23dec66-1d39-4e61-907c-af3d2c94814b",
  "code": "308159",
  "device_ref": "sandbox-5156"
}
```

```json
{
  "session_id": "26fb6dad-9a77-45e2-99d2-2b8990a58481",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4Nzk5NiwiaWF0IjoxNzkzMzg3MDk2LCJqdGkiOiI3ODgxYzhhNy1jZjJmLTRlOWEtOGFlMS03ZDIwYWY4MmI0MjIiLCJzaWQiOiIyNmZiNmRhZC05YTc3LTQ1ZTItOTlkMi0yYjg5OTBhNTg0ODEifQ.Jy5j2p94QmSIfyDxI2RdhOGMKlGGYtaSxVyZNHVamC8",
  "access_expires_at": "2026-10-30T19:19:56.081474953Z",
  "refresh_token": "Zr0bRS9nZw4655BlkLgGQIYmMHqxztAhGjkPYH99azs",
  "refresh_expires_at": "2026-11-29T19:04:56.081059335Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": null,
  "session_version": 0,
  "session_state": "CLOSED",
  "intent": null,
  "connection": "DISCONNECTED",
  "geolocation": "UNAVAILABLE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": null,
  "vehicle_id": null,
  "last_heartbeat_at": null,
  "last_location_at": null,
  "eligible": false,
  "ineligible_reasons": [
    "NO_OPEN_SESSION"
  ]
}
```

`POST /api/driver/v1/work-sessions` → **201**

```json
{
  "command_id": "1cdb75e7-ddb0-49f9-b069-f5cb953369d3",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:04:56Z",
    "sequence": 1793387096575
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "dff2bc4d-59e3-4f35-b181-2a83d4382e93",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "last_heartbeat_at": "2026-10-30T19:04:56.594101Z",
  "last_location_at": "2026-10-30T19:04:56.594101Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A card ride; on the way both write numbers into the chat

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e05a9b47-0a34-47db-8784-68e15181fb69",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4437,
    "lon": 30.4970
  },
  "dropoff": {
    "lat": 50.4584,
    "lon": 30.4300
  }
}
```

```json
{
  "id": "8d4d3698-abd3-479a-a963-3d8827722a1f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T19:09:56.848772Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false,
  "discount_minor": 0,
  "to_pay_minor": 16297,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **202**

```json
{
  "command_id": "5ffa20eb-7e04-42ed-a505-4ffd9a000521",
  "quote_id": "8d4d3698-abd3-479a-a963-3d8827722a1f",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4437,
    "lon": 30.4970
  },
  "pickup_label": "вул. Дмитрівська",
  "dropoff": {
    "lat": 50.4584,
    "lon": 30.4300
  },
  "dropoff_label": "Нивки",
  "payment_method": "CARD"
}
```

```json
{
  "id": "6a70b71f-fa91-4242-a568-4e7632512a28",
  "short_number": 11,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "3e0c41d7-eb6c-4d8c-a953-9ed8521683b7",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4437,
    "lon": 30.497
  },
  "pickup_label": "вул. Дмитрівська",
  "dropoff": {
    "lat": 50.4584,
    "lon": 30.43
  },
  "dropoff_label": "Нивки",
  "payment_method": "CARD",
  "payment_state": "AUTH_PENDING",
  "price_minor": 16297,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": null,
  "assignment": null,
  "created_at": "2026-10-30T19:04:57.103474Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6a70b71f-fa91-4242-a568-4e7632512a28` → **200**

```json
{
  "id": "6a70b71f-fa91-4242-a568-4e7632512a28",
  "short_number": 11,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "3e0c41d7-eb6c-4d8c-a953-9ed8521683b7",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4437,
    "lon": 30.497
  },
  "pickup_label": "вул. Дмитрівська",
  "dropoff": {
    "lat": 50.4584,
    "lon": 30.43
  },
  "dropoff_label": "Нивки",
  "payment_method": "CARD",
  "payment_state": "AUTH_PENDING",
  "price_minor": 16297,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": null,
  "assignment": null,
  "created_at": "2026-10-30T19:04:57.103474Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6a70b71f-fa91-4242-a568-4e7632512a28` → **200**

```json
{
  "id": "6a70b71f-fa91-4242-a568-4e7632512a28",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "3e0c41d7-eb6c-4d8c-a953-9ed8521683b7",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4437,
    "lon": 30.497
  },
  "pickup_label": "вул. Дмитрівська",
  "dropoff": {
    "lat": 50.4584,
    "lon": 30.43
  },
  "dropoff_label": "Нивки",
  "payment_method": "CARD",
  "payment_state": "AUTHORIZED",
  "price_minor": 16297,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "PERSONAL",
  "assignment": null,
  "created_at": "2026-10-30T19:04:57.103474Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "4b9f44f4-9838-4954-b02f-b04f14922eb4",
    "order_id": "6a70b71f-fa91-4242-a568-4e7632512a28",
    "expires_at": "2026-10-30T19:05:13.005842Z",
    "vehicle_class": "STANDARD",
    "pickup": {
      "lat": 50.4437,
      "lon": 30.497
    },
    "pickup_label": "вул. Дмитрівська",
    "dropoff_label": "Нивки",
    "payment_method": "CARD",
    "price_minor": 16297,
    "currency": "UAH",
    "distance_m": 478
  }
]
```

`POST /api/driver/v1/offers/4b9f44f4-9838-4954-b02f-b04f14922eb4/accept` → **200**

```json
{
  "command_id": "160d7d5d-7c26-43c8-b031-4773fe8531f3"
}
```

```json
{
  "id": "b1d86eb2-57ca-47e9-96a7-78fff5223464",
  "order_id": "6a70b71f-fa91-4242-a568-4e7632512a28",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "9c43ea9c-e3b6-44fc-99fb-10b0c4b80ac9",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9c43ea9c-e3b6-44fc-99fb-10b0c4b80ac9",
  "order_id": "6a70b71f-fa91-4242-a568-4e7632512a28",
  "assignment_id": "b1d86eb2-57ca-47e9-96a7-78fff5223464",
  "phase": "TO_PICKUP",
  "version": 0,
  "pickup": {
    "lat": 50.4437,
    "lon": 30.497
  },
  "pickup_label": "вул. Дмитрівська",
  "dropoff": {
    "lat": 50.4584,
    "lon": 30.43
  },
  "dropoff_label": "Нивки",
  "payment_method": "CARD",
  "price_minor": 16297,
  "currency": "UAH",
  "arrived_at": null,
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/rider/v1/orders/6a70b71f-fa91-4242-a568-4e7632512a28/messages` → **201**

```json
{
  "command_id": "6391da1b-c54d-4a01-b68d-b414d3d33bda",
  "body": "Я біля входу, мій номер +380739105335, картка 4111 1111 1111 1111"
}
```

```json
{
  "id": "e90ead78-4ed0-4564-856a-0873a36daa98",
  "order_id": "6a70b71f-fa91-4242-a568-4e7632512a28",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу, мій номер +380739105335, картка 4111 1111 1111 1111",
  "sent_at": "2026-10-30T19:04:59.58862169Z"
}
```

`POST /api/driver/v1/trips/9c43ea9c-e3b6-44fc-99fb-10b0c4b80ac9/messages` → **201**

```json
{
  "command_id": "6c11d0e5-83e7-402c-84fd-4ff6963d0212",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03"
}
```

```json
{
  "id": "d2aab896-c4dd-42c3-b047-e1c02bcfe6f6",
  "order_id": "6a70b71f-fa91-4242-a568-4e7632512a28",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03",
  "sent_at": "2026-10-30T19:04:59.842125499Z"
}
```

(the car drives 5 s to the next point)

`POST /api/driver/v1/work-sessions/dff2bc4d-59e3-4f35-b181-2a83d4382e93/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:05:05Z",
    "sequence": 1793387105108
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "dff2bc4d-59e3-4f35-b181-2a83d4382e93",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "last_heartbeat_at": "2026-10-30T19:05:05.126777Z",
  "last_location_at": "2026-10-30T19:05:05.126777Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/9c43ea9c-e3b6-44fc-99fb-10b0c4b80ac9/arrive` → **200**

```json
{
  "command_id": "6fe6213e-c8ab-46c4-afa3-afea03340c37",
  "expected_version": 0
}
```

```json
{
  "id": "9c43ea9c-e3b6-44fc-99fb-10b0c4b80ac9",
  "order_id": "6a70b71f-fa91-4242-a568-4e7632512a28",
  "assignment_id": "b1d86eb2-57ca-47e9-96a7-78fff5223464",
  "phase": "WAITING",
  "version": 1,
  "pickup": {
    "lat": 50.4437,
    "lon": 30.497
  },
  "pickup_label": "вул. Дмитрівська",
  "dropoff": {
    "lat": 50.4584,
    "lon": 30.43
  },
  "dropoff_label": "Нивки",
  "payment_method": "CARD",
  "price_minor": 16297,
  "currency": "UAH",
  "arrived_at": "2026-10-30T19:05:05.373602Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/9c43ea9c-e3b6-44fc-99fb-10b0c4b80ac9/start` → **200**

```json
{
  "command_id": "43047b5b-5143-42a4-a7c1-5ca845404beb",
  "expected_version": 1
}
```

```json
{
  "id": "9c43ea9c-e3b6-44fc-99fb-10b0c4b80ac9",
  "order_id": "6a70b71f-fa91-4242-a568-4e7632512a28",
  "assignment_id": "b1d86eb2-57ca-47e9-96a7-78fff5223464",
  "phase": "IN_PROGRESS",
  "version": 2,
  "pickup": {
    "lat": 50.4437,
    "lon": 30.497
  },
  "pickup_label": "вул. Дмитрівська",
  "dropoff": {
    "lat": 50.4584,
    "lon": 30.43
  },
  "dropoff_label": "Нивки",
  "payment_method": "CARD",
  "price_minor": 16297,
  "currency": "UAH",
  "arrived_at": "2026-10-30T19:05:05.373602Z",
  "started_at": "2026-10-30T19:05:05.631108Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

(the car drives 91 s to the next point)

`POST /api/driver/v1/work-sessions/dff2bc4d-59e3-4f35-b181-2a83d4382e93/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4584,
    "lon": 30.4300,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:06:36Z",
    "sequence": 1793387196898
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "dff2bc4d-59e3-4f35-b181-2a83d4382e93",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "ON_TRIP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "last_heartbeat_at": "2026-10-30T19:06:36.91578Z",
  "last_location_at": "2026-10-30T19:06:36.91578Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/9c43ea9c-e3b6-44fc-99fb-10b0c4b80ac9/complete` → **200**

```json
{
  "command_id": "48b60ca2-bfc0-4e8b-8a09-70517b0abc2b",
  "expected_version": 2,
  "reported_at": "2026-10-30T19:06:37Z",
  "cash_received": false
}
```

```json
{
  "id": "9c43ea9c-e3b6-44fc-99fb-10b0c4b80ac9",
  "order_id": "6a70b71f-fa91-4242-a568-4e7632512a28",
  "assignment_id": "b1d86eb2-57ca-47e9-96a7-78fff5223464",
  "phase": "COMPLETED",
  "version": 3,
  "pickup": {
    "lat": 50.4437,
    "lon": 30.497
  },
  "pickup_label": "вул. Дмитрівська",
  "dropoff": {
    "lat": 50.4584,
    "lon": 30.43
  },
  "dropoff_label": "Нивки",
  "payment_method": "CARD",
  "price_minor": 16297,
  "currency": "UAH",
  "arrived_at": "2026-10-30T19:05:05.373602Z",
  "started_at": "2026-10-30T19:05:05.631108Z",
  "completed_at": "2026-10-30T19:06:37.16114Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/rider/v1/orders/6a70b71f-fa91-4242-a568-4e7632512a28` → **200**

```json
{
  "id": "6a70b71f-fa91-4242-a568-4e7632512a28",
  "short_number": 11,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "3e0c41d7-eb6c-4d8c-a953-9ed8521683b7",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4437,
    "lon": 30.497
  },
  "pickup_label": "вул. Дмитрівська",
  "dropoff": {
    "lat": 50.4584,
    "lon": 30.43
  },
  "dropoff_label": "Нивки",
  "payment_method": "CARD",
  "payment_state": "CAPTURE_PENDING",
  "price_minor": 16297,
  "final_price_minor": 16297,
  "currency": "UAH",
  "search_phase": "STOPPED",
  "assignment": {
    "id": "b1d86eb2-57ca-47e9-96a7-78fff5223464",
    "order_id": "6a70b71f-fa91-4242-a568-4e7632512a28",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "9c43ea9c-e3b6-44fc-99fb-10b0c4b80ac9",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T19:04:57.103474Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6a70b71f-fa91-4242-a568-4e7632512a28` → **200**

```json
{
  "id": "6a70b71f-fa91-4242-a568-4e7632512a28",
  "short_number": 11,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "3e0c41d7-eb6c-4d8c-a953-9ed8521683b7",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4437,
    "lon": 30.497
  },
  "pickup_label": "вул. Дмитрівська",
  "dropoff": {
    "lat": 50.4584,
    "lon": 30.43
  },
  "dropoff_label": "Нивки",
  "payment_method": "CARD",
  "payment_state": "CAPTURE_PENDING",
  "price_minor": 16297,
  "final_price_minor": 16297,
  "currency": "UAH",
  "search_phase": "STOPPED",
  "assignment": {
    "id": "b1d86eb2-57ca-47e9-96a7-78fff5223464",
    "order_id": "6a70b71f-fa91-4242-a568-4e7632512a28",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "9c43ea9c-e3b6-44fc-99fb-10b0c4b80ac9",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T19:04:57.103474Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6a70b71f-fa91-4242-a568-4e7632512a28` → **200**

```json
{
  "id": "6a70b71f-fa91-4242-a568-4e7632512a28",
  "short_number": 11,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "3e0c41d7-eb6c-4d8c-a953-9ed8521683b7",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4437,
    "lon": 30.497
  },
  "pickup_label": "вул. Дмитрівська",
  "dropoff": {
    "lat": 50.4584,
    "lon": 30.43
  },
  "dropoff_label": "Нивки",
  "payment_method": "CARD",
  "payment_state": "PAID",
  "price_minor": 16297,
  "final_price_minor": 16297,
  "currency": "UAH",
  "search_phase": "STOPPED",
  "assignment": {
    "id": "b1d86eb2-57ca-47e9-96a7-78fff5223464",
    "order_id": "6a70b71f-fa91-4242-a568-4e7632512a28",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "9c43ea9c-e3b6-44fc-99fb-10b0c4b80ac9",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T19:04:57.103474Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "dff2bc4d-59e3-4f35-b181-2a83d4382e93",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "last_heartbeat_at": "2026-10-30T19:06:36.91578Z",
  "last_location_at": "2026-10-30T19:06:36.91578Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/dff2bc4d-59e3-4f35-b181-2a83d4382e93/close` → **200**

```json
{
  "command_id": "73b33a48-526c-4fec-91db-ad486246cefc",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": null,
  "session_version": 0,
  "session_state": "CLOSED",
  "intent": null,
  "connection": "DISCONNECTED",
  "geolocation": "UNAVAILABLE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": null,
  "vehicle_id": null,
  "last_heartbeat_at": null,
  "last_location_at": null,
  "eligible": false,
  "ineligible_reasons": [
    "NO_OPEN_SESSION"
  ]
}
```

## The bank disputes the payment: finance exports the evidence

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "2b93864d-055d-4a76-9414-f84daa4e8e26",
  "subject": {
    "type": "STAFF",
    "id": "50e6407f-123d-42ca-9890-64ec61c07dce"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MGU2NDA3Zi0xMjNkLTQyY2EtOTg5MC02NGVjNjFjMDdkY2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODgxMDAsImlhdCI6MTc5MzM4NzIwMCwianRpIjoiZGU5OTUyM2MtMjE4MS00Y2IxLWIzYTAtNTlhYjQ1MTMxYzFjIiwic2lkIjoiMmI5Mzg2NGQtMDU1ZC00YTc2LTk0MTQtZjg0ZGFhNGU4ZTI2In0.3AkqJVOCOV3eISyRVTsryDwDW1jAuk8N5OehhzgKews",
  "access_expires_at": "2026-10-30T19:21:40.882227515Z",
  "refresh_token": "QPCpltfjhxgnvF7F7x3uVR1_hnwPg_kPfG_zH-7loFs",
  "refresh_expires_at": "2026-10-31T07:06:40.881766831Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/6a70b71f-fa91-4242-a568-4e7632512a28/evidence` → **400**

```json
{
  "instance": "/api/admin/v1/orders/6a70b71f-fa91-4242-a568-4e7632512a28/evidence",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "785d9956-91b8-4111-881e-c71cb9f44ea7"
}
```

`GET /api/admin/v1/orders/6a70b71f-fa91-4242-a568-4e7632512a28/evidence?reason=Bank%20request%20sandbox` → **200**

```json
{
  "generated_at": "2026-10-30T19:06:41.507450836Z",
  "order": {
    "id": "6a70b71f-fa91-4242-a568-4e7632512a28",
    "short_number": 11,
    "status": "FULFILLED",
    "payment_method": "CARD",
    "payment_state": "PAID",
    "pickup_label": "вул. Дмитрівська",
    "dropoff_label": "Нивки",
    "quoted_price_minor": 16297,
    "final_price_minor": 16297,
    "currency": "UAH",
    "wallet_minor": 0,
    "discount_minor": 0,
    "fare": {
      "amount_minor": 16297,
      "currency": "UAH",
      "policy": "M1_AGREED_PLUS_WAITING",
      "agreed_minor": 16297,
      "waiting_seconds": 0,
      "free_waiting_seconds": 180,
      "charged_waiting_seconds": 0,
      "waiting_minor": 0
    },
    "created_at": "2026-10-30T19:04:57.103474Z",
    "assigned_at": "2026-10-30T19:04:59.10453Z",
    "arrived_at": "2026-10-30T19:05:05.373602Z",
    "started_at": "2026-10-30T19:05:05.631108Z",
    "completed_at": "2026-10-30T19:06:37.16114Z"
  },
  "driver": {
    "id": "5a000000-0000-4000-8000-000000000403",
    "name": "Андрій Шевчук",
    "vehicle": {
      "make": "Hyundai",
      "model": "Sonata",
      "color": "black",
      "registration_number": "AA0003TX"
    }
  },
  "track": {
    "points": 0,
    "flagged_points": 0,
    "first_point_at": null,
    "last_point_at": null,
    "duration_seconds": 0,
    "length_meters": 0
  },
  "rider": {
    "id": "3e0c41d7-eb6c-4d8c-a953-9ed8521683b7",
    "registered_at": "2026-10-30T19:04:55.067968Z",
    "trips_last_year": [
      {
        "currency": "UAH",
        "trips": 1,
        "total_minor": 16297
      }
    ]
  },
  "card_operations": [
    {
      "type": "AUTH",
      "state": "SUCCEEDED",
      "amount_minor": 16297,
      "currency": "UAH",
      "provider_status": "WaitingAuthComplete",
      "created_at": "2026-10-30T19:04:57.105653Z"
    },
    {
      "type": "SETTLE",
      "state": "SUCCEEDED",
      "amount_minor": 16297,
      "currency": "UAH",
      "provider_status": "Approved",
      "created_at": "2026-10-30T19:06:37.197484Z"
    }
  ],
  "chat": [
    {
```

## Finance records the chargeback: the rider owes the fare again, a case opens

`POST /api/admin/v1/orders/6a70b71f-fa91-4242-a568-4e7632512a28/chargebacks` → **422**

```json
{
  "command_id": "c8098b5d-a8b8-4112-bb76-b2b87ce8753c",
  "amount_minor": 16298,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "instance": "/api/admin/v1/orders/6a70b71f-fa91-4242-a568-4e7632512a28/chargebacks",
  "status": 422,
  "title": "Chargeback not allowed",
  "type": "https://errors.blizz.taxi/chargeback-not-allowed",
  "code": "CHARGEBACK_NOT_ALLOWED",
  "correlation_id": "1fc9c079-7067-4476-afd3-ceb13802253d"
}
```

`POST /api/admin/v1/orders/6a70b71f-fa91-4242-a568-4e7632512a28/chargebacks` → **201**

```json
{
  "command_id": "8714c5cc-829a-4ecb-a619-22f9aa3206f6",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "id": "e1237921-512d-476c-906a-72d27484ee08",
  "order_id": "6a70b71f-fa91-4242-a568-4e7632512a28",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-30T19:06:42.067443Z",
  "resolved_at": null,
  "version": 0
}
```

`POST /api/admin/v1/orders/6a70b71f-fa91-4242-a568-4e7632512a28/chargebacks` → **201**

```json
{
  "command_id": "8714c5cc-829a-4ecb-a619-22f9aa3206f6",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "id": "e1237921-512d-476c-906a-72d27484ee08",
  "order_id": "6a70b71f-fa91-4242-a568-4e7632512a28",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-30T19:06:42.067443Z",
  "resolved_at": null,
  "version": 0
}
```

`GET /api/admin/v1/clients/3e0c41d7-eb6c-4d8c-a953-9ed8521683b7` → **200**

```json
{
  "client": {
    "id": "3e0c41d7-eb6c-4d8c-a953-9ed8521683b7",
    "phone": "+380739105335",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T19:04:55.067968Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "6a70b71f-fa91-4242-a568-4e7632512a28",
      "short_number": 11,
      "status": "FULFILLED",
      "created_at": "2026-10-30T19:04:57.103474Z",
      "pickup_label": "вул. Дмитрівська",
      "dropoff_label": "Нивки",
      "vehicle_class": "STANDARD",
      "price_minor": 16297,
      "final_price_minor": 16297,
      "currency": "UAH",
      "payment_method": "CARD",
      "driver": {
        "name": "Андрій Шевчук",
        "vehicle": {
          "make": "Hyundai",
          "model": "Sonata",
          "color": "black",
          "registration_number": "AA0003TX"
        }
      },
      "chat_available": true,
      "cancellation": null,
      "pickup_at": null
    }
  ],
  "bonuses": [],
  "debt": [
    {
      "currency": "UAH",
      "amount_minor": 16297
    }
  ],
  "cases": []
}
```

## The provider's risk managers win it back: the debt is gone; a second answer is refused

`POST /api/admin/v1/orders/6a70b71f-fa91-4242-a568-4e7632512a28/chargebacks/e1237921-512d-476c-906a-72d27484ee08/resolve` → **200**

```json
{
  "command_id": "e43387b6-e97f-445a-87d5-6dafe24c6f6d",
  "expected_version": 0,
  "outcome": "WON",
  "reason": "Evidence accepted"
}
```

```json
{
  "id": "e1237921-512d-476c-906a-72d27484ee08",
  "order_id": "6a70b71f-fa91-4242-a568-4e7632512a28",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "WON",
  "resolution_reason": "Evidence accepted",
  "created_at": "2026-10-30T19:06:42.067443Z",
  "resolved_at": "2026-10-30T19:06:42.851175Z",
  "version": 1
}
```

`GET /api/admin/v1/clients/3e0c41d7-eb6c-4d8c-a953-9ed8521683b7` → **200**

```json
{
  "client": {
    "id": "3e0c41d7-eb6c-4d8c-a953-9ed8521683b7",
    "phone": "+380739105335",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T19:04:55.067968Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "6a70b71f-fa91-4242-a568-4e7632512a28",
      "short_number": 11,
      "status": "FULFILLED",
      "created_at": "2026-10-30T19:04:57.103474Z",
      "pickup_label": "вул. Дмитрівська",
      "dropoff_label": "Нивки",
      "vehicle_class": "STANDARD",
      "price_minor": 16297,
      "final_price_minor": 16297,
      "currency": "UAH",
      "payment_method": "CARD",
      "driver": {
        "name": "Андрій Шевчук",
        "vehicle": {
          "make": "Hyundai",
          "model": "Sonata",
          "color": "black",
          "registration_number": "AA0003TX"
        }
      },
      "chat_available": true,
      "cancellation": null,
      "pickup_at": null
    }
  ],
  "bonuses": [],
  "debt": [
    {
      "currency": "UAH",
      "amount_minor": 16297
    }
  ],
  "cases": []
}
```

`GET /api/admin/v1/clients/3e0c41d7-eb6c-4d8c-a953-9ed8521683b7` → **200**

```json
{
  "client": {
    "id": "3e0c41d7-eb6c-4d8c-a953-9ed8521683b7",
    "phone": "+380739105335",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T19:04:55.067968Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "6a70b71f-fa91-4242-a568-4e7632512a28",
      "short_number": 11,
      "status": "FULFILLED",
      "created_at": "2026-10-30T19:04:57.103474Z",
      "pickup_label": "вул. Дмитрівська",
      "dropoff_label": "Нивки",
      "vehicle_class": "STANDARD",
      "price_minor": 16297,
      "final_price_minor": 16297,
      "currency": "UAH",
      "payment_method": "CARD",
      "driver": {
        "name": "Андрій Шевчук",
        "vehicle": {
          "make": "Hyundai",
          "model": "Sonata",
          "color": "black",
          "registration_number": "AA0003TX"
        }
      },
      "chat_available": true,
      "cancellation": null,
      "pickup_at": null
    }
  ],
  "bonuses": [],
  "debt": [],
  "cases": []
}
```

`POST /api/admin/v1/orders/6a70b71f-fa91-4242-a568-4e7632512a28/chargebacks/e1237921-512d-476c-906a-72d27484ee08/resolve` → **409**

```json
{
  "command_id": "5c5e3b6f-5e84-4885-a184-23358bfb9d92",
  "expected_version": 1,
  "outcome": "LOST",
  "reason": "Twice"
}
```

```json
{
  "instance": "/api/admin/v1/orders/6a70b71f-fa91-4242-a568-4e7632512a28/chargebacks/e1237921-512d-476c-906a-72d27484ee08/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "40c4eeda-3420-4089-825e-ff83aba81f5b"
}
```

`GET /api/admin/v1/orders/6a70b71f-fa91-4242-a568-4e7632512a28/chargebacks` → **200**

```json
{
  "chargebacks": [
    {
      "id": "e1237921-512d-476c-906a-72d27484ee08",
      "order_id": "6a70b71f-fa91-4242-a568-4e7632512a28",
      "amount_minor": 16297,
      "currency": "UAH",
      "bank_reason": "4837 No cardholder authorization",
      "received_on": "2026-10-29",
      "state": "WON",
      "resolution_reason": "Evidence accepted",
      "created_at": "2026-10-30T19:06:42.067443Z",
      "resolved_at": "2026-10-30T19:06:42.851175Z",
      "version": 1
    }
  ]
}
```

Done: the evidence of card order 6a70b71f-fa91-4242-a568-4e7632512a28 without phone or card digits; chargeback e1237921-512d-476c-906a-72d27484ee08 recorded and won.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": null,
  "session_version": 0,
  "session_state": "CLOSED",
  "intent": null,
  "connection": "DISCONNECTED",
  "geolocation": "UNAVAILABLE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": null,
  "vehicle_id": null,
  "last_heartbeat_at": null,
  "last_location_at": null,
  "eligible": false,
  "ineligible_reasons": [
    "NO_OPEN_SESSION"
  ]
}
```

# Scenario: city-operations

## Staff open Warsaw's operations (version 0 until the first change: around the clock, every method)

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "8bd28b9a-3db2-428c-9e83-dcaab73807a2",
  "subject": {
    "type": "STAFF",
    "id": "50e6407f-123d-42ca-9890-64ec61c07dce"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MGU2NDA3Zi0xMjNkLTQyY2EtOTg5MC02NGVjNjFjMDdkY2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODgxMDUsImlhdCI6MTc5MzM4NzIwNSwianRpIjoiMjExOTI3ZGUtMWQ0Yy00MzBhLTlmOWMtNGIyNDRiOGY5YzAzIiwic2lkIjoiOGJkMjhiOWEtM2RiMi00MjhjLTllODMtZGNhYWI3MzgwN2EyIn0.NuweULKiegWm5SuTJ063k-v5wtW-6N0OmdPKRTmESs8",
  "access_expires_at": "2026-10-30T19:21:45.611019313Z",
  "refresh_token": "CR1LWC2pyhQibwxYYnm9XZc2RRysNmkzbnoKiDv-JzI",
  "refresh_expires_at": "2026-10-31T07:06:45.610560153Z",
  "password_change_required": false
}
```

`GET /api/config/v1/bootstrap` → **200**

```json
{
  "settings_version": 2,
  "brand": {
    "service_name": "Blizz Taxi",
    "primary_color": "#111111",
    "on_primary_color": "#FFFFFF",
    "accent_color": null,
    "logo_url": null,
    "support_phone": null,
    "support_email": null,
    "support_telegram": null,
    "privacy_policy_url": null,
    "terms_url": null
  },
  "languages": {
    "default_language": "ru",
    "enabled": [
      "uk",
      "pl",
      "ru",
      "en"
    ]
  },
  "calls": {
    "mode": "DIRECT",
    "service_phone": null
  },
  "preorders": {
    "threshold_minutes": 60,
    "max_days_ahead": 7
  },
  "maps": {
    "provider": null,
    "android_key": null,
    "ios_key": null,
    "web_key": null
  },
  "cities": [
    {
      "id": "5a000000-0000-4000-8000-000000000002",
      "code": "warszawa",
      "name": "Warszawa",
      "currency": "PLN",
      "timezone": "Europe/Warsaw",
      "working_hours": [],
      "payment_methods": [
        "CARD",
        "CASH",
        "TERMINAL"
      ],
      "orders_paused": false
    },
    {
      "id": "5a000000-0000-4000-8000-000000000001",
      "code": "kyiv",
      "name": "Київ",
      "currency": "UAH",
      "timezone": "Europe/Kyiv",
      "working_hours": [],
      "payment_methods": [
        "CARD",
        "CASH",
        "TERMINAL"
      ],
      "orders_paused": false
    }
  ],
  "app_versions": {
    "rider_android": {
      "minimum_version": "0.0.0",
      "latest_version": "0.0.0"
    },
    "rider_ios": {
      "minimum_version": "0.0.0",
      "latest_version": "0.0.0"
    },
    "driver_android": {
      "minimum_version": "0.0.0",
      "latest_version": "0.0.0"
    },
```

`GET /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "working_hours": [],
  "payment_methods": [
    "CARD",
    "CASH",
    "TERMINAL"
  ],
  "return_zone_meters": 0,
  "orders_paused": false,
  "pause_reason": null,
  "paused_at": null,
  "version": 0
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600599332",
  "device_ref": "sandbox-23703"
}
```

```json
{
  "challenge_id": "1bb4b25c-3a29-4f91-884b-5af05d19e10f",
  "expires_at": "2026-10-30T19:11:46.326695441Z",
  "resend_available_at": "2026-10-30T19:06:47.326695441Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600599332` → **200**

```json
{
  "phone": "+48600599332",
  "audience": "CLIENT",
  "code": "542228",
  "sent_at": "2026-10-30T19:06:46.328886053Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1bb4b25c-3a29-4f91-884b-5af05d19e10f",
  "code": "542228",
  "device_ref": "sandbox-23703"
}
```

```json
{
  "session_id": "955c7485-a821-4d38-8fa2-7a78f1c6b2f7",
  "subject": {
    "type": "CLIENT",
    "id": "70c9f328-e631-4ae0-89b3-794b6eb84e3f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MGM5ZjMyOC1lNjMxLTRhZTAtODliMy03OTRiNmViODRlM2YiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzg4MTA2LCJpYXQiOjE3OTMzODcyMDYsImp0aSI6ImQ3ZDQ1M2QwLTQzYTQtNDI5Zi1iNjRkLTdkMGY1NGY5MzI4NyIsInNpZCI6Ijk1NWM3NDg1LWE4MjEtNGQzOC04ZmEyLTdhNzhmMWM2YjJmNyJ9.MDk6Keo7Ai89EjT8vAWK_iEimzsajv20IqHMNE-Avfs",
  "access_expires_at": "2026-10-30T19:21:46.587657422Z",
  "refresh_token": "267NsMPBPZY13qU3CHns_RQUuxJYxzbiNDl5-FyKeHI",
  "refresh_expires_at": "2026-11-29T19:06:46.587212632Z",
  "account_created": true
}
```

## Staff pause new orders: a reason is required

`GET /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "working_hours": [],
  "payment_methods": [
    "CARD",
    "CASH",
    "TERMINAL"
  ],
  "return_zone_meters": 0,
  "orders_paused": false,
  "pause_reason": null,
  "paused_at": null,
  "version": 0
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **400**

```json
{
  "command_id": "80862b54-cfe3-43ac-9983-b28fb03e3189",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "7f2a2b29-ee69-4c57-a494-b20dd2a8504c",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

`GET /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "working_hours": [],
  "payment_methods": [
    "CARD",
    "CASH",
    "TERMINAL"
  ],
  "return_zone_meters": 0,
  "orders_paused": false,
  "pause_reason": null,
  "paused_at": null,
  "version": 0
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **200**

```json
{
  "command_id": "64e1be4c-4c6a-4081-beee-4147f64a83ca",
  "expected_version": 0,
  "reason": "Storm warning"
}
```

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "working_hours": [],
  "payment_methods": [
    "CARD",
    "CASH",
    "TERMINAL"
  ],
  "return_zone_meters": 0,
  "orders_paused": true,
  "pause_reason": "Storm warning",
  "paused_at": "2026-10-30T19:06:47.530371066Z",
  "version": 1
}
```

## The apps see the pause, and the rider's order is refused

`GET /api/config/v1/bootstrap` → **200**

```json
{
  "settings_version": 2,
  "brand": {
    "service_name": "Blizz Taxi",
    "primary_color": "#111111",
    "on_primary_color": "#FFFFFF",
    "accent_color": null,
    "logo_url": null,
    "support_phone": null,
    "support_email": null,
    "support_telegram": null,
    "privacy_policy_url": null,
    "terms_url": null
  },
  "languages": {
    "default_language": "ru",
    "enabled": [
      "uk",
      "pl",
      "ru",
      "en"
    ]
  },
  "calls": {
    "mode": "DIRECT",
    "service_phone": null
  },
  "preorders": {
    "threshold_minutes": 60,
    "max_days_ahead": 7
  },
  "maps": {
    "provider": null,
    "android_key": null,
    "ios_key": null,
    "web_key": null
  },
  "cities": [
    {
      "id": "5a000000-0000-4000-8000-000000000002",
      "code": "warszawa",
      "name": "Warszawa",
      "currency": "PLN",
      "timezone": "Europe/Warsaw",
      "working_hours": [],
      "payment_methods": [
        "CARD",
        "CASH",
        "TERMINAL"
      ],
      "orders_paused": true
    },
    {
      "id": "5a000000-0000-4000-8000-000000000001",
      "code": "kyiv",
      "name": "Київ",
      "currency": "UAH",
      "timezone": "Europe/Kyiv",
      "working_hours": [],
      "payment_methods": [
        "CARD",
        "CASH",
        "TERMINAL"
      ],
      "orders_paused": false
    }
  ],
  "app_versions": {
    "rider_android": {
      "minimum_version": "0.0.0",
      "latest_version": "0.0.0"
    },
    "rider_ios": {
      "minimum_version": "0.0.0",
      "latest_version": "0.0.0"
    },
    "driver_android": {
      "minimum_version": "0.0.0",
      "latest_version": "0.0.0"
    },
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e8a65855-821e-4e26-a27d-8e264852c4ce",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.2319,
    "lon": 21.0067
  }
}
```

```json
{
  "id": "7d15db16-a7a4-4256-9ab5-d37b2789ac13",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T19:11:48.031618Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false,
  "discount_minor": 0,
  "to_pay_minor": 1500,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **422**

```json
{
  "command_id": "6b8d08b1-aada-4785-a22c-bf07ec862386",
  "quote_id": "7d15db16-a7a4-4256-9ab5-d37b2789ac13",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "pickup_label": "Pałac Kultury",
  "dropoff": {
    "lat": 52.2319,
    "lon": 21.0067
  },
  "dropoff_label": "Warszawa Centralna",
  "payment_method": "CASH"
}
```

```json
{
  "instance": "/api/rider/v1/orders",
  "status": 422,
  "title": "City paused",
  "type": "https://errors.blizz.taxi/city-paused",
  "code": "CITY_PAUSED",
  "correlation_id": "4acbb65c-adbf-4266-9ad5-ee32b5f61f2a"
}
```

## Staff lift the pause

`GET /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "working_hours": [],
  "payment_methods": [
    "CARD",
    "CASH",
    "TERMINAL"
  ],
  "return_zone_meters": 0,
  "orders_paused": true,
  "pause_reason": "Storm warning",
  "paused_at": "2026-10-30T19:06:47.530371Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "083b513b-6fd2-4ab6-907a-b4b94eaac74d",
  "expected_version": 1,
  "reason": "Storm over"
}
```

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "working_hours": [],
  "payment_methods": [
    "CARD",
    "CASH",
    "TERMINAL"
  ],
  "return_zone_meters": 0,
  "orders_paused": false,
  "pause_reason": null,
  "paused_at": null,
  "version": 2
}
```

## Warsaw offers only cards for now: a cash order is refused

`GET /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "working_hours": [],
  "payment_methods": [
    "CARD",
    "CASH",
    "TERMINAL"
  ],
  "return_zone_meters": 0,
  "orders_paused": false,
  "pause_reason": null,
  "paused_at": null,
  "version": 2
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations` → **200**

```json
{
  "command_id": "66a49a48-4a2e-441c-bd3f-70cd4d746be1",
  "expected_version": 2,
  "working_hours": [],
  "payment_methods": [
    "CARD"
  ],
  "reason": "Cash collection paused"
}
```

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "working_hours": [],
  "payment_methods": [
    "CARD"
  ],
  "return_zone_meters": 0,
  "orders_paused": false,
  "pause_reason": null,
  "paused_at": null,
  "version": 3
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a2a88d71-864d-45dd-9555-e79b49a12fa4",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.2319,
    "lon": 21.0067
  }
}
```

```json
{
  "id": "0ef93d89-d18a-4383-93a0-b508a2169ccb",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T19:11:49.489101Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false,
  "discount_minor": 0,
  "to_pay_minor": 1500,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **422**

```json
{
  "command_id": "6bb441c8-7b1d-4ff5-a915-59b1260cfb70",
  "quote_id": "0ef93d89-d18a-4383-93a0-b508a2169ccb",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "pickup_label": "Pałac Kultury",
  "dropoff": {
    "lat": 52.2319,
    "lon": 21.0067
  },
  "dropoff_label": "Warszawa Centralna",
  "payment_method": "CASH"
}
```

```json
{
  "instance": "/api/rider/v1/orders",
  "status": 422,
  "title": "Payment method not offered",
  "type": "https://errors.blizz.taxi/payment-method-not-offered",
  "code": "PAYMENT_METHOD_NOT_OFFERED",
  "correlation_id": "a21e921f-ec84-4ff1-a335-e4a9663a86d7"
}
```

## Working hours that do not include now: an order for now is refused

`GET /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "working_hours": [],
  "payment_methods": [
    "CARD"
  ],
  "return_zone_meters": 0,
  "orders_paused": false,
  "pause_reason": null,
  "paused_at": null,
  "version": 3
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations` → **200**

```json
{
  "command_id": "658f307b-3725-4e9f-94ba-626ed1fcddb9",
  "expected_version": 3,
  "working_hours": [
    {
      "days_of_week": [
        1,
        2,
        3,
        4,
        5,
        6,
        7
      ],
      "from": "22:00",
      "to": "23:00"
    }
  ],
  "payment_methods": [
    "CASH",
    "CARD",
    "TERMINAL"
  ],
  "reason": "One hour a day"
}
```

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "working_hours": [
    {
      "days_of_week": [
        1,
        2,
        3,
        4,
        5,
        6,
        7
      ],
      "from": "22:00",
      "to": "23:00"
    }
  ],
  "payment_methods": [
    "CARD",
    "CASH",
    "TERMINAL"
  ],
  "return_zone_meters": 0,
  "orders_paused": false,
  "pause_reason": null,
  "paused_at": null,
  "version": 4
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "42e71e99-6e8b-4008-b64c-e482e715ee29",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.2319,
    "lon": 21.0067
  }
}
```

```json
{
  "id": "2066d3e0-9afc-47f1-a791-b55974875632",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T19:11:50.498424Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false,
  "discount_minor": 0,
  "to_pay_minor": 1500,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **422**

```json
{
  "command_id": "c90b228b-9157-4d18-b9c5-5656f49d3ce3",
  "quote_id": "2066d3e0-9afc-47f1-a791-b55974875632",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "pickup_label": "Pałac Kultury",
  "dropoff": {
    "lat": 52.2319,
    "lon": 21.0067
  },
  "dropoff_label": "Warszawa Centralna",
  "payment_method": "CASH"
}
```

```json
{
  "instance": "/api/rider/v1/orders",
  "status": 422,
  "title": "City closed",
  "type": "https://errors.blizz.taxi/city-closed",
  "code": "CITY_CLOSED",
  "correlation_id": "cc912150-d033-4814-bcb5-27e011e76868"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "6a76e47e-eebd-456c-9a4f-a3cc12b76b92",
  "expected_version": 0,
  "reason": "stale"
}
```

```json
{
  "instance": "/api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause",
  "status": 409,
  "title": "Version conflict",
  "type": "https://errors.blizz.taxi/version-conflict",
  "code": "VERSION_CONFLICT",
  "correlation_id": "8ae057df-a402-4f8d-a35e-c567245bae86",
  "current_version": 4
}
```

Done: paused and resumed, a method not offered and closed hours refused orders; Warsaw is restored on exit.

`GET /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "working_hours": [
    {
      "days_of_week": [
        1,
        2,
        3,
        4,
        5,
        6,
        7
      ],
      "from": "22:00",
      "to": "23:00"
    }
  ],
  "payment_methods": [
    "CARD",
    "CASH",
    "TERMINAL"
  ],
  "return_zone_meters": 0,
  "orders_paused": false,
  "pause_reason": null,
  "paused_at": null,
  "version": 4
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations` → **200**

```json
{
  "command_id": "d6b4285e-465a-4e1a-a5a7-cdcf4151a9aa",
  "expected_version": 4,
  "working_hours": [],
  "payment_methods": [
    "CASH",
    "CARD",
    "TERMINAL"
  ],
  "reason": "Sandbox clean-up"
}
```

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "working_hours": [],
  "payment_methods": [
    "CARD",
    "CASH",
    "TERMINAL"
  ],
  "return_zone_meters": 0,
  "orders_paused": false,
  "pause_reason": null,
  "paused_at": null,
  "version": 5
}
```

# Scenario: client-deletion

## A rider signs in and takes a quote

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672856090",
  "device_ref": "sandbox-25986"
}
```

```json
{
  "challenge_id": "d72ea496-9514-474e-830a-3e48233af6ee",
  "expires_at": "2026-10-30T19:11:51.734659827Z",
  "resend_available_at": "2026-10-30T19:06:52.734659827Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380672856090` → **200**

```json
{
  "phone": "+380672856090",
  "audience": "CLIENT",
  "code": "549948",
  "sent_at": "2026-10-30T19:06:51.736972453Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d72ea496-9514-474e-830a-3e48233af6ee",
  "code": "549948",
  "device_ref": "sandbox-25986"
}
```

```json
{
  "session_id": "3b2f2931-792c-4e54-bff5-6856c8227a4b",
  "subject": {
    "type": "CLIENT",
    "id": "07a60271-8fe1-44c7-a773-598084a5ffd2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwN2E2MDI3MS04ZmUxLTQ0YzctYTc3My01OTgwODRhNWZmZDIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzg4MTExLCJpYXQiOjE3OTMzODcyMTEsImp0aSI6Ijg5MDRlMzBiLWFlMzYtNGZmNS04ZDRiLTI0MWVhMDllMTM3NSIsInNpZCI6IjNiMmYyOTMxLTc5MmMtNGU1NC1iZmY1LTY4NTZjODIyN2E0YiJ9.LmPTWlHVdX6WoHFJG47gcVFZBBNHl4L0IJSpZqhdKuI",
  "access_expires_at": "2026-10-30T19:21:51.996150302Z",
  "refresh_token": "M9DE3ul8PXwJYLeBzLCOmK7AnItcRl5SWkPrBbU6eO0",
  "refresh_expires_at": "2026-11-29T19:06:51.995703228Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "07a60271-8fe1-44c7-a773-598084a5ffd2",
  "session_id": "3b2f2931-792c-4e54-bff5-6856c8227a4b",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "93844fae-0746-45ce-9c4d-ad13fe725b54",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  }
}
```

```json
{
  "id": "e666c568-c925-4b27-84af-0e9782b823ff",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T19:11:52.458525Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false,
  "discount_minor": 0,
  "to_pay_minor": 10517,
  "promotions": []
}
```

## Step one: a code to confirm the deletion (a sign-in code would not do)

`POST /api/rider/v1/me/deletion-request/challenge` → **201**

```json
{
  "challenge_id": "d355f038-dae6-4e2f-87c2-e4c1965e2471",
  "expires_at": "2026-10-30T19:11:54.704539658Z",
  "resend_available_at": "2026-10-30T19:06:55.704539658Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380672856090` → **200**

```json
{
  "phone": "+380672856090",
  "audience": "CLIENT",
  "code": "826447",
  "sent_at": "2026-10-30T19:06:54.707113027Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "0b5aa47f-f86b-4540-b2fe-d34be5ebdadf",
  "challenge_id": "d355f038-dae6-4e2f-87c2-e4c1965e2471",
  "otp_code": "826447"
}
```

```json
{
  "client_id": "07a60271-8fe1-44c7-a773-598084a5ffd2",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-30T19:06:54.974138137Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "3505713d-c1bb-4bc7-989a-0064b027f70e",
  "quote_id": "e666c568-c925-4b27-84af-0e9782b823ff",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "payment_method": "CASH"
}
```

```json
{
  "instance": "/api/rider/v1/orders",
  "status": 403,
  "title": "Account not active",
  "type": "https://errors.blizz.taxi/account-not-active",
  "code": "ACCOUNT_NOT_ACTIVE",
  "correlation_id": "43aca4f2-cce4-4a66-b7c2-035b26ce176d"
}
```

## Staff see the request with nothing blocking it and complete it

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "dd1e0d6f-aa5e-4a80-8b87-945b8cc3e3bb",
  "subject": {
    "type": "STAFF",
    "id": "50e6407f-123d-42ca-9890-64ec61c07dce"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MGU2NDA3Zi0xMjNkLTQyY2EtOTg5MC02NGVjNjFjMDdkY2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODgxMTUsImlhdCI6MTc5MzM4NzIxNSwianRpIjoiMWZlYTc4NGMtYWZlZS00ZDkzLWE3ZjAtMDEzOGQ3NzQ0YjRhIiwic2lkIjoiZGQxZTBkNmYtYWE1ZS00YTgwLThiODctOTQ1YjhjYzNlM2JiIn0.8q_mbn7J6YjLSzFHEg7aqG2mqvHJgcbDVG4LLcumUk8",
  "access_expires_at": "2026-10-30T19:21:55.716760505Z",
  "refresh_token": "aEdk44ALStou6K-7JtNiT1HgPOZEepvfrbH6_IyDTuA",
  "refresh_expires_at": "2026-10-31T07:06:55.71624604Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "07a60271-8fe1-44c7-a773-598084a5ffd2",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-30T19:06:54.974138Z",
      "blockers": {
        "active_order_id": null,
        "debt": [],
        "open_support_cases": 0,
        "bonuses_to_burn": [],
        "blocked": false
      }
    }
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
```

`POST /api/admin/v1/client-deletions/07a60271-8fe1-44c7-a773-598084a5ffd2/complete` → **200**

```json
{
  "command_id": "b247c9c1-a0f0-4cab-a3b0-f7674fef3d3d",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "07a60271-8fe1-44c7-a773-598084a5ffd2",
  "account_state": "ANONYMIZED"
}
```

## The old token no longer works

`GET /api/rider/v1/me` → **401**

```json
{
  "instance": "/api/rider/v1/me",
  "status": 401,
  "title": "Unauthenticated",
  "type": "https://errors.blizz.taxi/unauthenticated",
  "code": "UNAUTHENTICATED",
  "correlation_id": "581d5bbc-579b-44dc-ab3c-a29c8d70f9ab"
}
```

Done: client 07a60271-8fe1-44c7-a773-598084a5ffd2 anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380662943657",
  "device_ref": "sandbox-7305"
}
```

```json
{
  "challenge_id": "eabd075b-147f-4fec-a035-68326853bff2",
  "expires_at": "2026-10-30T19:11:56.700678604Z",
  "resend_available_at": "2026-10-30T19:06:57.700678604Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380662943657` → **200**

```json
{
  "phone": "+380662943657",
  "audience": "CLIENT",
  "code": "785004",
  "sent_at": "2026-10-30T19:06:56.703034135Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "eabd075b-147f-4fec-a035-68326853bff2",
  "code": "785004",
  "device_ref": "sandbox-7305"
}
```

```json
{
  "session_id": "3372a2c0-9906-47bc-856e-9b780a29b9d0",
  "subject": {
    "type": "CLIENT",
    "id": "267ab770-0b8f-4898-a9d4-159bdb86b0d5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNjdhYjc3MC0wYjhmLTQ4OTgtYTlkNC0xNTliZGI4NmIwZDUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzg4MTE2LCJpYXQiOjE3OTMzODcyMTYsImp0aSI6IjZlYmUwZTVlLTJjODAtNGFjOS1iMzIwLWNlMWNhNGI3MGU1ZSIsInNpZCI6IjMzNzJhMmMwLTk5MDYtNDdiYy04NTZlLTliNzgwYTI5YjlkMCJ9.iCzkzaQnRHMjgK2-ivaqsKrjNGTE19PKHjDTufSQqBM",
  "access_expires_at": "2026-10-30T19:21:56.964125749Z",
  "refresh_token": "fH6rZbs3CGI7ZwjnkSsVP8QCMZ3Dh-ENTr3py5FzoR0",
  "refresh_expires_at": "2026-11-29T19:06:56.963706527Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "267ab770-0b8f-4898-a9d4-159bdb86b0d5",
  "session_id": "3372a2c0-9906-47bc-856e-9b780a29b9d0",
  "account_state": "ACTIVE"
}
```

## Staff find the rider by the last 7 digits of the phone and open the card

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "2e77accc-9889-47c6-9f6b-ca4aae68a38e",
  "subject": {
    "type": "STAFF",
    "id": "50e6407f-123d-42ca-9890-64ec61c07dce"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MGU2NDA3Zi0xMjNkLTQyY2EtOTg5MC02NGVjNjFjMDdkY2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODgxMTcsImlhdCI6MTc5MzM4NzIxNywianRpIjoiNDEzYTA3OTUtMGM3ZC00YjA5LWIyZGUtYTZmMjc4MTM0NWY2Iiwic2lkIjoiMmU3N2FjY2MtOTg4OS00N2M2LTlmNmItY2E0YWFlNjhhMzhlIn0.d7CGk9EcEUZL7tPwzZK3T8ftz5y9CEOp0J_3H5Ggu7w",
  "access_expires_at": "2026-10-30T19:21:57.683927514Z",
  "refresh_token": "KvsYj0eHwxNH0C5u25XaBqHIn_95H1-DL_aN0Z_uZJI",
  "refresh_expires_at": "2026-10-31T07:06:57.683461652Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=2943657&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "267ab770-0b8f-4898-a9d4-159bdb86b0d5",
      "phone": "+380662943657",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-30T19:06:56.962401Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/267ab770-0b8f-4898-a9d4-159bdb86b0d5` → **200**

```json
{
  "client": {
    "id": "267ab770-0b8f-4898-a9d4-159bdb86b0d5",
    "phone": "+380662943657",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T19:06:56.962401Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [],
  "bonuses": [],
  "debt": [],
  "cases": []
}
```

## A block needs a reason

`POST /api/admin/v1/clients/267ab770-0b8f-4898-a9d4-159bdb86b0d5/block` → **400**

```json
{
  "command_id": "afcebf79-7876-48ad-aef3-6bc343b2c9ca",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/267ab770-0b8f-4898-a9d4-159bdb86b0d5/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "d7acd6b7-4f2e-492e-8e74-25c67f4b864e",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/267ab770-0b8f-4898-a9d4-159bdb86b0d5/block` → **200**

```json
{
  "command_id": "2ef308dd-65c2-4c53-be3b-a63245ef6b34",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "267ab770-0b8f-4898-a9d4-159bdb86b0d5",
  "phone": "+380662943657",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-30T19:06:56.962401Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-30T19:06:58.675172Z",
    "by": "50e6407f-123d-42ca-9890-64ec61c07dce"
  },
  "deletion_requested_at": null
}
```

`GET /api/rider/v1/me` → **401**

```json
{
  "instance": "/api/rider/v1/me",
  "status": 401,
  "title": "Unauthenticated",
  "type": "https://errors.blizz.taxi/unauthenticated",
  "code": "UNAUTHENTICATED",
  "correlation_id": "32e11cef-2be0-41db-9d72-2c4dc26e3a5a"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380662943657",
  "device_ref": "sandbox-32006"
}
```

```json
{
  "challenge_id": "4a763577-5eed-43ec-a835-e141ccf854c2",
  "expires_at": "2026-10-30T19:12:01.153913864Z",
  "resend_available_at": "2026-10-30T19:07:02.153913864Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380662943657` → **200**

```json
{
  "phone": "+380662943657",
  "audience": "CLIENT",
  "code": "297505",
  "sent_at": "2026-10-30T19:07:01.156077081Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "4a763577-5eed-43ec-a835-e141ccf854c2",
  "code": "297505",
  "device_ref": "sandbox-32006"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "fdd016c2-19bf-4286-8b9f-09ababc3f334"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/267ab770-0b8f-4898-a9d4-159bdb86b0d5` → **200**

```json
{
  "client": {
    "id": "267ab770-0b8f-4898-a9d4-159bdb86b0d5",
    "phone": "+380662943657",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-30T19:06:56.962401Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-30T19:06:58.675172Z",
      "by": "50e6407f-123d-42ca-9890-64ec61c07dce"
    },
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [],
  "bonuses": [],
  "debt": [],
  "cases": []
}
```

`POST /api/admin/v1/clients/267ab770-0b8f-4898-a9d4-159bdb86b0d5/unblock` → **200**

```json
{
  "command_id": "b702b8c3-bdb9-4997-a116-46f413b24143",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "267ab770-0b8f-4898-a9d4-159bdb86b0d5",
  "phone": "+380662943657",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-30T19:06:56.962401Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380662943657",
  "device_ref": "sandbox-29201"
}
```

```json
{
  "challenge_id": "c63e7a6c-419a-453d-a05e-497a00c1d712",
  "expires_at": "2026-10-30T19:12:04.169529167Z",
  "resend_available_at": "2026-10-30T19:07:05.169529167Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380662943657` → **200**

```json
{
  "phone": "+380662943657",
  "audience": "CLIENT",
  "code": "124352",
  "sent_at": "2026-10-30T19:07:04.171502718Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c63e7a6c-419a-453d-a05e-497a00c1d712",
  "code": "124352",
  "device_ref": "sandbox-29201"
}
```

```json
{
  "session_id": "a6855715-4c80-4c5e-9c64-cfecad8feb2a",
  "subject": {
    "type": "CLIENT",
    "id": "267ab770-0b8f-4898-a9d4-159bdb86b0d5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNjdhYjc3MC0wYjhmLTQ4OTgtYTlkNC0xNTliZGI4NmIwZDUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzg4MTI0LCJpYXQiOjE3OTMzODcyMjQsImp0aSI6ImQ3ZGI5NWE2LWE5MTEtNDA0MS1hM2ZkLWE5ZDU3ZDEwOTMwMCIsInNpZCI6ImE2ODU1NzE1LTRjODAtNGM1ZS05YzY0LWNmZWNhZDhmZWIyYSJ9.aIEBkLibmY17lFCFDKmMH6SOZj8URjgq3DFQ7OyZ8u0",
  "access_expires_at": "2026-10-30T19:22:04.425891732Z",
  "refresh_token": "XBJt0bEpd3apkfH5Mc6NK3uz9FZrfWLbek4DK_zfkk8",
  "refresh_expires_at": "2026-11-29T19:07:04.42535888Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "267ab770-0b8f-4898-a9d4-159bdb86b0d5",
  "session_id": "a6855715-4c80-4c5e-9c64-cfecad8feb2a",
  "account_state": "ACTIVE"
}
```

Done: found, blocked (signed out, sign-in refused) and unblocked.

# Scenario: correlation-search

## A rider orders; the app sends its own correlation id with the request

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380663970568",
  "device_ref": "sandbox-30073"
}
```

```json
{
  "challenge_id": "6d1db2b4-2e1e-4dd9-baf5-d00f28c1bcd6",
  "expires_at": "2026-10-30T19:12:04.913597195Z",
  "resend_available_at": "2026-10-30T19:07:05.913597195Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380663970568` → **200**

```json
{
  "phone": "+380663970568",
  "audience": "CLIENT",
  "code": "613306",
  "sent_at": "2026-10-30T19:07:04.916706667Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6d1db2b4-2e1e-4dd9-baf5-d00f28c1bcd6",
  "code": "613306",
  "device_ref": "sandbox-30073"
}
```

```json
{
  "session_id": "db26e636-fc68-47ab-9647-f545bbf572f4",
  "subject": {
    "type": "CLIENT",
    "id": "036ecd39-93e3-49f9-858e-05b353f02209"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMzZlY2QzOS05M2UzLTQ5ZjktODU4ZS0wNWIzNTNmMDIyMDkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzg4MTI1LCJpYXQiOjE3OTMzODcyMjUsImp0aSI6Ijk4M2NmNjRhLTgxNzgtNGE4YS1hNzNiLWYzNDQ2N2U2OWIwOSIsInNpZCI6ImRiMjZlNjM2LWZjNjgtNDdhYi05NjQ3LWY1NDViYmY1NzJmNCJ9.J4E6yYyDml-RQ2fFqEinpUCwR8E3cHz_LRD6JcFjbCk",
  "access_expires_at": "2026-10-30T19:22:05.174671444Z",
  "refresh_token": "xaSuLxrcdNipeQzNdazlgAPndzLGsMOo_CYUItSK7zg",
  "refresh_expires_at": "2026-11-29T19:07:05.174222718Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "248062e6-5ca8-476a-8d17-742e90e8cdb3",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  }
}
```

```json
{
  "id": "6f231c97-bd9b-4643-ab9a-cc63c61cd9cd",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T19:12:05.418156Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false,
  "discount_minor": 0,
  "to_pay_minor": 10517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` (X-Correlation-Id: 7e86a696-3105-4505-b96a-d2a04b91bd91) → **201**

## The operator sees the id on the order's history

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "c55065d8-85dd-4f11-ab87-8350b45847e4",
  "subject": {
    "type": "STAFF",
    "id": "50e6407f-123d-42ca-9890-64ec61c07dce"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MGU2NDA3Zi0xMjNkLTQyY2EtOTg5MC02NGVjNjFjMDdkY2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODgxMjUsImlhdCI6MTc5MzM4NzIyNSwianRpIjoiMGRjNjg0YzQtZTg0ZC00ODQyLTgyYzctNjcyYjg4NzcwZDM3Iiwic2lkIjoiYzU1MDY1ZDgtODVkZC00ZjExLWFiODctODM1MGI0NTg0N2U0In0.VlyGT_TeEal_Khdw4hgSOvTR04FlhZdbmqq2CG1ZadU",
  "access_expires_at": "2026-10-30T19:22:05.983861282Z",
  "refresh_token": "rUddHP4blUHAmVIb4zJX-x_SsYP9idzdIYrFUzspNpw",
  "refresh_expires_at": "2026-10-31T07:07:05.983287859Z",
  "password_change_required": false
}
```

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "OPERATOR",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "a3a913f7-62fa-4b13-96d7-8b17677a5126",
  "subject": {
    "type": "STAFF",
    "id": "50e6407f-123d-42ca-9890-64ec61c07dce"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MGU2NDA3Zi0xMjNkLTQyY2EtOTg5MC02NGVjNjFjMDdkY2UiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODgxMjYsImlhdCI6MTc5MzM4NzIyNiwianRpIjoiM2M1NzE4NDMtYzA4NS00Y2UxLWFmYzgtNDZlNmFjNDc2MDRmIiwic2lkIjoiYTNhOTEzZjctNjJmYS00YjEzLTk2ZDctOGIxNzY3N2E1MTI2In0.t9v35iUiQWR0A66JaZByw4NrTwYdAWp5Th47AbUeM2k",
  "access_expires_at": "2026-10-30T19:22:06.477630156Z",
  "refresh_token": "cFDicb6aq-iXc0tiqiwVe-yX09k6LB-D9ErGpM-r74w",
  "refresh_expires_at": "2026-10-31T07:07:06.477202281Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/b79930ad-a260-4956-b88f-31116b502386/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T19:07:05.658971Z",
      "actor": {
        "type": "CLIENT",
        "id": "036ecd39-93e3-49f9-858e-05b353f02209",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "b79930ad-a260-4956-b88f-31116b502386",
        "quote_id": "6f231c97-bd9b-4643-ab9a-cc63c61cd9cd",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "7e86a696-3105-4505-b96a-d2a04b91bd91"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T19:07:05.660349Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "b79930ad-a260-4956-b88f-31116b502386",
        "attempt_id": "5876ff62-4452-4a55-881b-7c76845f1791",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "7e86a696-3105-4505-b96a-d2a04b91bd91"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-30T19:07:05.702834Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "b79930ad-a260-4956-b88f-31116b502386",
        "attempt_id": "5876ff62-4452-4a55-881b-7c76845f1791"
      },
      "correlation_id": "7e86a696-3105-4505-b96a-d2a04b91bd91"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "5876ff62-4452-4a55-881b-7c76845f1791",
        "generation": 1,
        "started_at": "2026-10-30T19:07:05.659542Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-30T19:07:05.702834Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-30T19:07:05.660894Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/7e86a696-3105-4505-b96a-d2a04b91bd91` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "b79930ad-a260-4956-b88f-31116b502386:0",
      "order_id": "b79930ad-a260-4956-b88f-31116b502386",
      "at": "2026-10-30T19:07:05.658971Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "b79930ad-a260-4956-b88f-31116b502386:1",
      "order_id": "b79930ad-a260-4956-b88f-31116b502386",
      "at": "2026-10-30T19:07:05.660349Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "b79930ad-a260-4956-b88f-31116b502386:2",
      "order_id": "b79930ad-a260-4956-b88f-31116b502386",
      "at": "2026-10-30T19:07:05.702834Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/2c8b9493-305a-41ec-9c42-2d3fa257920e` → **200**

```json
{
  "found": []
}
```

Done: request 7e86a696-3105-4505-b96a-d2a04b91bd91 — order b79930ad-a260-4956-b88f-31116b502386 found by its id.

`GET /api/rider/v1/orders/b79930ad-a260-4956-b88f-31116b502386` → **200**

```json
{
  "id": "b79930ad-a260-4956-b88f-31116b502386",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "036ecd39-93e3-49f9-858e-05b353f02209",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T19:07:05.658616Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/b79930ad-a260-4956-b88f-31116b502386/cancel` → **200**

```json
{
  "command_id": "ece7c737-9bdc-44cd-9263-f3856b48e265",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "b79930ad-a260-4956-b88f-31116b502386",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "036ecd39-93e3-49f9-858e-05b353f02209",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "STOPPED",
  "assignment": null,
  "created_at": "2026-10-30T19:07:05.658616Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
      "en": "Changed my mind",
      "ru": "Передумал ехать"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

# Scenario: data-export

## A rider signs in and asks for a code to confirm the copy

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635441654",
  "device_ref": "sandbox-24187"
}
```

```json
{
  "challenge_id": "1320e92f-8f9b-4a11-8a14-266ef9c8affc",
  "expires_at": "2026-10-30T19:12:07.946572005Z",
  "resend_available_at": "2026-10-30T19:07:08.946572005Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380635441654` → **200**

```json
{
  "phone": "+380635441654",
  "audience": "CLIENT",
  "code": "904882",
  "sent_at": "2026-10-30T19:07:07.948889753Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1320e92f-8f9b-4a11-8a14-266ef9c8affc",
  "code": "904882",
  "device_ref": "sandbox-24187"
}
```

```json
{
  "session_id": "90b6de4f-aa8f-4f42-93a9-89ea11e2458d",
  "subject": {
    "type": "CLIENT",
    "id": "5139477d-c5e4-422a-915b-834d1ad3075b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MTM5NDc3ZC1jNWU0LTQyMmEtOTE1Yi04MzRkMWFkMzA3NWIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzg4MTI4LCJpYXQiOjE3OTMzODcyMjgsImp0aSI6IjcyODAzOTBiLWU5ZTMtNGQ5OC1hM2NlLTlhZmE5YzhkMDllYSIsInNpZCI6IjkwYjZkZTRmLWFhOGYtNGY0Mi05M2E5LTg5ZWExMWUyNDU4ZCJ9.Hg69N_CNyf2hcdBGbjDilOaTnNt8XY54v3elCNGZXqw",
  "access_expires_at": "2026-10-30T19:22:08.206253495Z",
  "refresh_token": "p_EW8l6WumAQW7yE19nbRQNvZe_Utq9qhlsUE1QrMHg",
  "refresh_expires_at": "2026-11-29T19:07:08.205854284Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "3bf90444-a91d-47ad-834c-da899551bded",
  "expires_at": "2026-10-30T19:12:10.45031028Z",
  "resend_available_at": "2026-10-30T19:07:11.45031028Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635441654` → **200**

```json
{
  "phone": "+380635441654",
  "audience": "CLIENT",
  "code": "881193",
  "sent_at": "2026-10-30T19:07:10.453065789Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "626993fc-f182-43f0-8c82-c394a838d62f",
  "challenge_id": "3bf90444-a91d-47ad-834c-da899551bded",
  "otp_code": "881193"
}
```

```json
{
  "id": "dc970ccc-de6c-41a6-98b6-84290e588070",
  "state": "PENDING",
  "created_at": "2026-10-30T19:07:10.72056Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/dc970ccc-de6c-41a6-98b6-84290e588070` → **200**

```json
{
  "id": "dc970ccc-de6c-41a6-98b6-84290e588070",
  "state": "PENDING",
  "created_at": "2026-10-30T19:07:10.72056Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/dc970ccc-de6c-41a6-98b6-84290e588070` → **200**

```json
{
  "id": "dc970ccc-de6c-41a6-98b6-84290e588070",
  "state": "PENDING",
  "created_at": "2026-10-30T19:07:10.72056Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/dc970ccc-de6c-41a6-98b6-84290e588070` → **200**

```json
{
  "id": "dc970ccc-de6c-41a6-98b6-84290e588070",
  "state": "PENDING",
  "created_at": "2026-10-30T19:07:10.72056Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/dc970ccc-de6c-41a6-98b6-84290e588070` → **200**

```json
{
  "id": "dc970ccc-de6c-41a6-98b6-84290e588070",
  "state": "PENDING",
  "created_at": "2026-10-30T19:07:10.72056Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/dc970ccc-de6c-41a6-98b6-84290e588070` → **200**

```json
{
  "id": "dc970ccc-de6c-41a6-98b6-84290e588070",
  "state": "PENDING",
  "created_at": "2026-10-30T19:07:10.72056Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/dc970ccc-de6c-41a6-98b6-84290e588070` → **200**

```json
{
  "id": "dc970ccc-de6c-41a6-98b6-84290e588070",
  "state": "PENDING",
  "created_at": "2026-10-30T19:07:10.72056Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/dc970ccc-de6c-41a6-98b6-84290e588070` → **200**

```json
{
  "id": "dc970ccc-de6c-41a6-98b6-84290e588070",
  "state": "READY",
  "created_at": "2026-10-30T19:07:10.72056Z",
  "ready_at": "2026-10-30T19:07:18.138124Z",
  "expires_at": "2026-11-06T19:07:18.138124Z",
  "size_bytes": 1030
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/dc970ccc-de6c-41a6-98b6-84290e588070/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637320114",
  "device_ref": "sandbox-15978"
}
```

```json
{
  "challenge_id": "e87cc5b6-b7b6-403e-bb7f-266b9c551fe2",
  "expires_at": "2026-10-30T19:12:18.599973618Z",
  "resend_available_at": "2026-10-30T19:07:19.599973618Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637320114` → **200**

```json
{
  "phone": "+380637320114",
  "audience": "CLIENT",
  "code": "610363",
  "sent_at": "2026-10-30T19:07:18.60284945Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e87cc5b6-b7b6-403e-bb7f-266b9c551fe2",
  "code": "610363",
  "device_ref": "sandbox-15978"
}
```

```json
{
  "session_id": "edeb9998-d0a8-48dd-8d9d-0958d3b7241e",
  "subject": {
    "type": "CLIENT",
    "id": "8cc48bba-6e12-4697-8b7d-48e2319956f0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Y2M0OGJiYS02ZTEyLTQ2OTctOGI3ZC00OGUyMzE5OTU2ZjAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzg4MTM4LCJpYXQiOjE3OTMzODcyMzgsImp0aSI6Ijg1ZGJkZWZmLThhNmUtNGFkMS04ZmEwLTNlNjZmYTk1ZjZlYiIsInNpZCI6ImVkZWI5OTk4LWQwYTgtNDhkZC04ZDlkLTA5NThkM2I3MjQxZSJ9.gq5ja7S4hn_FEcEciUMDnAE3rLpXu_ZOsDbCzIThhI0",
  "access_expires_at": "2026-10-30T19:22:18.861273832Z",
  "refresh_token": "uAobw0pcr6i9-LxsyC68KxFXGoBWSgo-Wl9tRRgbx2c",
  "refresh_expires_at": "2026-11-29T19:07:18.860592565Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/dc970ccc-de6c-41a6-98b6-84290e588070/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/dc970ccc-de6c-41a6-98b6-84290e588070/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "b06c1893-b84d-4ba9-bc53-8f7453a3e79a"
}
```

## Support sees that it was asked for, not what is in it

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "981c929b-ec82-45ce-96c2-07d3abca0504",
  "subject": {
    "type": "STAFF",
    "id": "50e6407f-123d-42ca-9890-64ec61c07dce"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MGU2NDA3Zi0xMjNkLTQyY2EtOTg5MC02NGVjNjFjMDdkY2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODgxMzksImlhdCI6MTc5MzM4NzIzOSwianRpIjoiY2UwODBjOGYtZTMxMC00YzA4LThkMGItODU4ODAzODExMThlIiwic2lkIjoiOTgxYzkyOWItZWM4Mi00NWNlLTk2YzItMDdkM2FiY2EwNTA0In0.GLmIllcpVBVYhKB7IrXRYTFJ79mcDF87LCYp0p30o14",
  "access_expires_at": "2026-10-30T19:22:19.594361007Z",
  "refresh_token": "xFICNUxMYvWYwGxCRsVHEZmxTVCSelzfAp-vHpmtYVM",
  "refresh_expires_at": "2026-10-31T07:07:19.593791048Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "5139477d-c5e4-422a-915b-834d1ad3075b",
  "session_id": "90b6de4f-aa8f-4f42-93a9-89ea11e2458d",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/5139477d-c5e4-422a-915b-834d1ad3075b/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "dc970ccc-de6c-41a6-98b6-84290e588070",
      "state": "READY",
      "created_at": "2026-10-30T19:07:10.72056Z",
      "ready_at": "2026-10-30T19:07:18.138124Z",
      "expires_at": "2026-11-06T19:07:18.138124Z",
      "size_bytes": 1030
    }
  ]
}
```

Done: the copy was asked for with a code, built in the background and downloaded by the rider only.

# Scenario: dispatch-journal

## Only the two drivers of this scenario are online

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-13524"
}
```

```json
{
  "challenge_id": "937d182d-dc43-4d50-90ab-b7d069bc97fd",
  "expires_at": "2026-10-30T19:12:20.307337569Z",
  "resend_available_at": "2026-10-30T19:07:21.307337569Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "779109",
  "sent_at": "2026-10-30T19:07:20.309387987Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "937d182d-dc43-4d50-90ab-b7d069bc97fd",
  "code": "779109",
  "device_ref": "sandbox-13524"
}
```

```json
{
  "session_id": "a338d122-6dd8-4158-8277-29c82366e88d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4ODE0MCwiaWF0IjoxNzkzMzg3MjQwLCJqdGkiOiI2ZDBjZGZjYy0xM2Y2LTQyMjAtOWRiOC1mZTgzZTBiNzFiOWEiLCJzaWQiOiJhMzM4ZDEyMi02ZGQ4LTQxNTgtODI3Ny0yOWM4MjM2NmU4OGQifQ.14QDxzwva6osq4QyYuG-CtXN8uuH3pblCtCIdsBVYnI",
  "access_expires_at": "2026-10-30T19:22:20.564427189Z",
  "refresh_token": "v5BxAaBrzZyOYDU2UjDoqQyX_l15l2up_Jr5sM6c87g",
  "refresh_expires_at": "2026-11-29T19:07:20.563921457Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": null,
  "session_version": 0,
  "session_state": "CLOSED",
  "intent": null,
  "connection": "DISCONNECTED",
  "geolocation": "UNAVAILABLE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": null,
  "vehicle_id": null,
  "last_heartbeat_at": null,
  "last_location_at": null,
  "eligible": false,
  "ineligible_reasons": [
    "NO_OPEN_SESSION"
  ]
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-28574"
}
```

```json
{
  "challenge_id": "d03077d8-6488-426f-8cce-caa0fdf75e4a",
  "expires_at": "2026-10-30T19:12:21.0334709Z",
  "resend_available_at": "2026-10-30T19:07:22.0334709Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "914942",
  "sent_at": "2026-10-30T19:07:21.035795812Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d03077d8-6488-426f-8cce-caa0fdf75e4a",
  "code": "914942",
  "device_ref": "sandbox-28574"
}
```

```json
{
  "session_id": "9833d5e4-6386-4860-af81-6b56b11865e1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4ODE0MSwiaWF0IjoxNzkzMzg3MjQxLCJqdGkiOiJiYmVlNzc1NC1mYjYwLTQ1MTgtODcyNC0xZmU0N2VjMWRmMGIiLCJzaWQiOiI5ODMzZDVlNC02Mzg2LTQ4NjAtYWY4MS02YjU2YjExODY1ZTEifQ.Uq_nFZQmxATVDAMMqe_58KSFhd8woXAn3Hhm_uMpHmM",
  "access_expires_at": "2026-10-30T19:22:21.291569078Z",
  "refresh_token": "XFhiCKUaTFVbszF-PwQfP4zCafYpQtnnVLR05dprsLA",
  "refresh_expires_at": "2026-11-29T19:07:21.290953522Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": null,
  "session_version": 0,
  "session_state": "CLOSED",
  "intent": null,
  "connection": "DISCONNECTED",
  "geolocation": "UNAVAILABLE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": null,
  "vehicle_id": null,
  "last_heartbeat_at": null,
  "last_location_at": null,
  "eligible": false,
  "ineligible_reasons": [
    "NO_OPEN_SESSION"
  ]
}
```

`POST /api/driver/v1/work-sessions` → **201**

```json
{
  "command_id": "7d409a2d-39c9-4e86-8d5a-3f329721f271",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:07:21Z",
    "sequence": 1793387241781
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "759b3695-019a-455b-ac67-7485da9be28b",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T19:07:21.798075Z",
  "last_location_at": "2026-10-30T19:07:21.798075Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-29504"
}
```

```json
{
  "challenge_id": "6b2565a8-8a15-4c4c-8868-4f8dfbc2a056",
  "expires_at": "2026-10-30T19:12:22.041611601Z",
  "resend_available_at": "2026-10-30T19:07:23.041611601Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "849302",
  "sent_at": "2026-10-30T19:07:22.043735726Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6b2565a8-8a15-4c4c-8868-4f8dfbc2a056",
  "code": "849302",
  "device_ref": "sandbox-29504"
}
```

```json
{
  "session_id": "f36f84a8-91ef-4385-8d72-227b4c274089",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4ODE0MiwiaWF0IjoxNzkzMzg3MjQyLCJqdGkiOiIyMWVlYTM2Mi1mNjNiLTQ0MDYtYWZmZS0zMTZmZTExOTliMjgiLCJzaWQiOiJmMzZmODRhOC05MWVmLTQzODUtOGQ3Mi0yMjdiNGMyNzQwODkifQ.XW8JIY9JwhAWBnmYpH9ozkT4JsPxMt-MAesIVYWE6NI",
  "access_expires_at": "2026-10-30T19:22:22.300532953Z",
  "refresh_token": "esZM0_f9GXHE508YVu4BMM_w2QlRkWn4b2Xwe64tKLE",
  "refresh_expires_at": "2026-11-29T19:07:22.300059Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "6ca2ffad-e23d-4277-8401-d902e2c803a7",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "DISCONNECTED",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "last_heartbeat_at": "2026-10-30T19:03:30.565238Z",
  "last_location_at": "2026-10-30T19:03:30.565238Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/6ca2ffad-e23d-4277-8401-d902e2c803a7/handover` → **200**

```json
{
  "command_id": "6cd50a14-731b-4356-9d52-504bff261d1f",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "6ca2ffad-e23d-4277-8401-d902e2c803a7",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "DISCONNECTED",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "last_heartbeat_at": "2026-10-30T19:03:30.565238Z",
  "last_location_at": "2026-10-30T19:03:30.565238Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/6ca2ffad-e23d-4277-8401-d902e2c803a7/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:07:23Z",
    "sequence": 1793387243231
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "6ca2ffad-e23d-4277-8401-d902e2c803a7",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "last_heartbeat_at": "2026-10-30T19:07:23.040042Z",
  "last_location_at": "2026-10-30T19:07:23.040042Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "93593cc5-38bf-4435-8d88-aeb76980be0e",
  "subject": {
    "type": "STAFF",
    "id": "50e6407f-123d-42ca-9890-64ec61c07dce"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MGU2NDA3Zi0xMjNkLTQyY2EtOTg5MC02NGVjNjFjMDdkY2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODgxNDMsImlhdCI6MTc5MzM4NzI0MywianRpIjoiMWYyNWNiMGUtMTBjZC00ZDA5LWFmNWEtZTgzOTFkYzQ5OWU4Iiwic2lkIjoiOTM1OTNjYzUtMzhiZi00NDM1LThkODgtYWViNzY5ODBiZTBlIn0.hweIpytRRNslWsMIiyWtlXHBSQYGCAxRp2cYSTh1G8o",
  "access_expires_at": "2026-10-30T19:22:23.531031176Z",
  "refresh_token": "rSQ47EK8fImGafdlVEwdcLKdIp98Aqy8J8Yx6aJYDYI",
  "refresh_expires_at": "2026-10-31T07:07:23.530533888Z",
  "password_change_required": false
}
```

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "OPERATOR",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "fca1ad5c-27ef-4f79-af08-b27c07546eba",
  "subject": {
    "type": "STAFF",
    "id": "50e6407f-123d-42ca-9890-64ec61c07dce"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MGU2NDA3Zi0xMjNkLTQyY2EtOTg5MC02NGVjNjFjMDdkY2UiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODgxNDQsImlhdCI6MTc5MzM4NzI0NCwianRpIjoiYjA2MzUxMGUtMTQ1YS00NjE0LWE2ZTAtZTMwZjZiMDhkMDJlIiwic2lkIjoiZmNhMWFkNWMtMjdlZi00Zjc5LWFmMDgtYjI3YzA3NTQ2ZWJhIn0.Yb1GWAEIXIadQ6VTP27sX05YBaSJ1GRLF9tS7VUKgzI",
  "access_expires_at": "2026-10-30T19:22:24.023785931Z",
  "refresh_token": "bX2nLUuw8erezE98rfpvlHZBF2Ypq1tr-xv5eFskCTQ",
  "refresh_expires_at": "2026-10-31T07:07:24.023357797Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380688808473",
  "device_ref": "sandbox-13540"
}
```

```json
{
  "challenge_id": "9fa1697b-06a0-4663-a850-6657edcd9d59",
  "expires_at": "2026-10-30T19:12:24.259623818Z",
  "resend_available_at": "2026-10-30T19:07:25.259623818Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380688808473` → **200**

```json
{
  "phone": "+380688808473",
  "audience": "CLIENT",
  "code": "725337",
  "sent_at": "2026-10-30T19:07:24.377395245Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9fa1697b-06a0-4663-a850-6657edcd9d59",
  "code": "725337",
  "device_ref": "sandbox-13540"
}
```

```json
{
  "session_id": "3f34dde4-577b-4534-8fb8-002beaf569fd",
  "subject": {
    "type": "CLIENT",
    "id": "9a61b0a0-6b13-4d60-9554-bf0c43fe60db"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YTYxYjBhMC02YjEzLTRkNjAtOTU1NC1iZjBjNDNmZTYwZGIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzg4MTQ0LCJpYXQiOjE3OTMzODcyNDQsImp0aSI6ImE3M2RhMDg1LTg2ZTktNGIyMC1hMjBiLWY4ZTJjNjdhMTZlZiIsInNpZCI6IjNmMzRkZGU0LTU3N2ItNDUzNC04ZmI4LTAwMmJlYWY1NjlmZCJ9.4PHayvl6x-s3n4UzRLhEJazcXRg7OoZZLU1FmNQn-pU",
  "access_expires_at": "2026-10-30T19:22:24.639934961Z",
  "refresh_token": "3Np5BoLqHkr0v9OohzMdOHz5YR3uwymjXFOwNfNwWCg",
  "refresh_expires_at": "2026-11-29T19:07:24.639481108Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6b585b9c-803d-4916-9416-2b633027ba81",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  }
}
```

```json
{
  "id": "cb3cd639-b108-4f71-a123-f685e04a7655",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T19:12:24.886861Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false,
  "discount_minor": 0,
  "to_pay_minor": 10517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "3c6b0927-c746-46fc-a75d-761a80e58169",
  "quote_id": "cb3cd639-b108-4f71-a123-f685e04a7655",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH"
}
```

```json
{
  "id": "bc55fd8a-6912-4e05-8d33-b21a26d61620",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9a61b0a0-6b13-4d60-9554-bf0c43fe60db",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "PERSONAL",
  "assignment": null,
  "created_at": "2026-10-30T19:07:25.1392Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

## The nearest driver declines, the next one accepts

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "09ff5b7f-14b9-4a66-aea9-f5029c627897",
    "order_id": "bc55fd8a-6912-4e05-8d33-b21a26d61620",
    "expires_at": "2026-10-30T19:07:40.141652Z",
    "vehicle_class": "STANDARD",
    "pickup": {
      "lat": 50.4501,
      "lon": 30.5234
    },
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "payment_method": "CASH",
    "price_minor": 10517,
    "currency": "UAH",
    "distance_m": 200
  }
]
```

`POST /api/driver/v1/offers/09ff5b7f-14b9-4a66-aea9-f5029c627897/reject` → **204**

```json
{
  "command_id": "913814c2-e474-43ff-89a8-4969c7c59458"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "7f9163e7-e72a-4b12-85f7-af5e29c9d9ee",
    "order_id": "bc55fd8a-6912-4e05-8d33-b21a26d61620",
    "expires_at": "2026-10-30T19:07:40.655602Z",
    "vehicle_class": "STANDARD",
    "pickup": {
      "lat": 50.4501,
      "lon": 30.5234
    },
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "payment_method": "CASH",
    "price_minor": 10517,
    "currency": "UAH",
    "distance_m": 601
  }
]
```

`POST /api/driver/v1/offers/7f9163e7-e72a-4b12-85f7-af5e29c9d9ee/accept` → **200**

```json
{
  "command_id": "16f17502-dbc2-49f1-864a-2d30eff662d1"
}
```

```json
{
  "id": "89ddee08-eeb8-4f32-9114-b276d0b38a7a",
  "order_id": "bc55fd8a-6912-4e05-8d33-b21a26d61620",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f947ada8-1768-4448-ad07-789c7b3bd9dc",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/bc55fd8a-6912-4e05-8d33-b21a26d61620/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T19:07:25.139538Z",
      "actor": {
        "type": "CLIENT",
        "id": "9a61b0a0-6b13-4d60-9554-bf0c43fe60db",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "bc55fd8a-6912-4e05-8d33-b21a26d61620",
        "quote_id": "cb3cd639-b108-4f71-a123-f685e04a7655",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "10365324-8ed0-4322-aff0-ed3a709a5fbb"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T19:07:25.141086Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "bc55fd8a-6912-4e05-8d33-b21a26d61620",
        "attempt_id": "7c6abc87-7366-4048-ad6d-cc879d8a31a8",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "10365324-8ed0-4322-aff0-ed3a709a5fbb"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T19:07:25.1637Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "09ff5b7f-14b9-4a66-aea9-f5029c627897",
        "order_id": "bc55fd8a-6912-4e05-8d33-b21a26d61620",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "10365324-8ed0-4322-aff0-ed3a709a5fbb"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-30T19:07:25.654709Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "09ff5b7f-14b9-4a66-aea9-f5029c627897",
        "order_id": "bc55fd8a-6912-4e05-8d33-b21a26d61620"
      },
      "correlation_id": "786e05e8-fab4-485d-a46a-7ee04d57e499"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order bc55fd8a-6912-4e05-8d33-b21a26d61620 — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/bc55fd8a-6912-4e05-8d33-b21a26d61620` → **200**

```json
{
  "id": "bc55fd8a-6912-4e05-8d33-b21a26d61620",
  "short_number": 13,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "9a61b0a0-6b13-4d60-9554-bf0c43fe60db",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "STOPPED",
  "assignment": {
    "id": "89ddee08-eeb8-4f32-9114-b276d0b38a7a",
    "order_id": "bc55fd8a-6912-4e05-8d33-b21a26d61620",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "f947ada8-1768-4448-ad07-789c7b3bd9dc",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T19:07:25.1392Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/bc55fd8a-6912-4e05-8d33-b21a26d61620/cancel` → **200**

```json
{
  "command_id": "c9c796fd-3f11-4187-b150-6258d4f2ad30",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "bc55fd8a-6912-4e05-8d33-b21a26d61620",
  "short_number": 13,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "9a61b0a0-6b13-4d60-9554-bf0c43fe60db",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "STOPPED",
  "assignment": {
    "id": "89ddee08-eeb8-4f32-9114-b276d0b38a7a",
    "order_id": "bc55fd8a-6912-4e05-8d33-b21a26d61620",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "f947ada8-1768-4448-ad07-789c7b3bd9dc",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T19:07:25.1392Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "pl": "Brak wolnych aut",
      "uk": "Немає вільних авто",
      "en": "No cars available",
      "ru": "Нет свободных машин"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "759b3695-019a-455b-ac67-7485da9be28b",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T19:07:21.798075Z",
  "last_location_at": "2026-10-30T19:07:21.798075Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/759b3695-019a-455b-ac67-7485da9be28b/close` → **200**

```json
{
  "command_id": "e420f5cf-f47f-4081-8b6f-f75610951d2f",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": null,
  "session_version": 0,
  "session_state": "CLOSED",
  "intent": null,
  "connection": "DISCONNECTED",
  "geolocation": "UNAVAILABLE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": null,
  "vehicle_id": null,
  "last_heartbeat_at": null,
  "last_location_at": null,
  "eligible": false,
  "ineligible_reasons": [
    "NO_OPEN_SESSION"
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "6ca2ffad-e23d-4277-8401-d902e2c803a7",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "last_heartbeat_at": "2026-10-30T19:07:23.040042Z",
  "last_location_at": "2026-10-30T19:07:23.040042Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6ca2ffad-e23d-4277-8401-d902e2c803a7/close` → **200**

```json
{
  "command_id": "68002d4d-5dc0-44ff-9e70-be4e49d2ff70",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": null,
  "session_version": 0,
  "session_state": "CLOSED",
  "intent": null,
  "connection": "DISCONNECTED",
  "geolocation": "UNAVAILABLE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": null,
  "vehicle_id": null,
  "last_heartbeat_at": null,
  "last_location_at": null,
  "eligible": false,
  "ineligible_reasons": [
    "NO_OPEN_SESSION"
  ]
}
```

# Scenario: document-at-rest

## Oleh uploads a scan of his licence

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-6778"
}
```

```json
{
  "challenge_id": "f9ddda8a-4448-4e94-82fc-0d7528c44bb4",
  "expires_at": "2026-10-30T19:12:27.981557317Z",
  "resend_available_at": "2026-10-30T19:07:28.981557317Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "852055",
  "sent_at": "2026-10-30T19:07:27.983676124Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f9ddda8a-4448-4e94-82fc-0d7528c44bb4",
  "code": "852055",
  "device_ref": "sandbox-6778"
}
```

```json
{
  "session_id": "f33ff2b8-a83b-45a6-a66b-3b63792f4082",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4ODE0OCwiaWF0IjoxNzkzMzg3MjQ4LCJqdGkiOiI1N2FiODEyMy1lYjE5LTQ0ZDUtOGU2Ny1mZDNmY2I3ZWZjZTciLCJzaWQiOiJmMzNmZjJiOC1hODNiLTQ1YTYtYTY2Yi0zYjYzNzkyZjQwODIifQ.C4UX69KNUTKfJmTyh6OUTUNKlBJe5ag5mcaOZtAVSOE",
  "access_expires_at": "2026-10-30T19:22:28.245120392Z",
  "refresh_token": "CLWcynrSXOeN8BtmmwvlOGGfIqnwnQQaXHoomrY3qF0",
  "refresh_expires_at": "2026-11-29T19:07:28.244685999Z",
  "account_created": false
}
```

`POST /api/driver/v1/documents/upload-sessions` → **201**

```json
{
  "command_id": "d7be766f-3551-4866-a7b5-286a75cae38f",
  "content_type": "application/pdf",
  "size_bytes": 84
}
```

```json
{
  "file_id": "fd8e985a-640f-4e33-9e96-25330db20b16",
  "upload_path": "/api/driver/v1/uploads/fd8e985a-640f-4e33-9e96-25330db20b16",
  "expires_at": "2026-10-30T19:22:28.491839221Z",
  "max_bytes": 84
}
```

`PUT /api/driver/v1/uploads/fd8e985a-640f-4e33-9e96-25330db20b16` → **200**

```json
{
  "file_id": "fd8e985a-640f-4e33-9e96-25330db20b16",
  "state": "SAFE",
  "content_type": "application/pdf",
  "size_bytes": 84,
  "reject_reason": null
}
```

## On the server's disk the file is not the PDF

Stored at `driver_document/2026-10/fd8e985a-640f-4e33-9e96-25330db20b16`, first bytes `425a46317f39f284` (plain: `255044462d312e37` = %PDF-1.7).

## His download is exactly what he uploaded

`GET /api/driver/v1/files/fd8e985a-640f-4e33-9e96-25330db20b16` → **200**

SHA-256 uploaded `48028e4854006bdc9180417417351d467012b6c3ccb41170ce62a0dd0a544b45`, downloaded `48028e4854006bdc9180417417351d467012b6c3ccb41170ce62a0dd0a544b45`.

Done: document fd8e985a-640f-4e33-9e96-25330db20b16 is encrypted on disk and downloads unchanged.

# Scenario: driver-block

## Only Andrii is online; he takes an order and starts the trip

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-6898"
}
```

```json
{
  "challenge_id": "ccd8fcaf-2805-47a1-8443-34535efaeb51",
  "expires_at": "2026-10-30T19:12:28.811592157Z",
  "resend_available_at": "2026-10-30T19:07:29.811592157Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "629673",
  "sent_at": "2026-10-30T19:07:28.81375849Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ccd8fcaf-2805-47a1-8443-34535efaeb51",
  "code": "629673",
  "device_ref": "sandbox-6898"
}
```

```json
{
  "session_id": "bced3da4-4486-46c2-a8bf-b6254025fdda",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4ODE0OSwiaWF0IjoxNzkzMzg3MjQ5LCJqdGkiOiI3ZjA4N2Q0ZC1iOTZhLTQzNDMtOTZkYy01MTA5NmM0MjY5YzgiLCJzaWQiOiJiY2VkM2RhNC00NDg2LTQ2YzItYThiZi1iNjI1NDAyNWZkZGEifQ.36M7LsSQZABN1ArEWp3_d3tSi-9lH74xE2N12nL4Ewo",
  "access_expires_at": "2026-10-30T19:22:29.070367286Z",
  "refresh_token": "Vb1XYY0w9fRHCu-fZ9CY-d4bR4FU-HCkc9vrRKg1ZKg",
  "refresh_expires_at": "2026-11-29T19:07:29.069902456Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": null,
  "session_version": 0,
  "session_state": "CLOSED",
  "intent": null,
  "connection": "DISCONNECTED",
  "geolocation": "UNAVAILABLE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": null,
  "vehicle_id": null,
  "last_heartbeat_at": null,
  "last_location_at": null,
  "eligible": false,
  "ineligible_reasons": [
    "NO_OPEN_SESSION"
  ]
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-18651"
}
```

```json
{
  "challenge_id": "e9677ef7-7240-4058-b5a3-974b75e50e12",
  "expires_at": "2026-10-30T19:12:29.535504246Z",
  "resend_available_at": "2026-10-30T19:07:30.535504246Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "771336",
  "sent_at": "2026-10-30T19:07:29.667649891Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e9677ef7-7240-4058-b5a3-974b75e50e12",
  "code": "771336",
  "device_ref": "sandbox-18651"
}
```

```json
{
  "session_id": "d5814c4f-2426-4ec9-950d-a364e01c6de5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4ODE0OSwiaWF0IjoxNzkzMzg3MjQ5LCJqdGkiOiIxZTk0OTRmMy1hM2E2LTQ5YTYtODEyNC1jMWRmMjIyY2JhYzAiLCJzaWQiOiJkNTgxNGM0Zi0yNDI2LTRlYzktOTUwZC1hMzY0ZTAxYzZkZTUifQ.8T8CPr76rJLuSerDBklG7WSvTsYps-znbc9uFRsTXFQ",
  "access_expires_at": "2026-10-30T19:22:29.922464834Z",
  "refresh_token": "s1KUtTvKifRwukKcp3p4kvbwxby6aesGRxcx_khSB3U",
  "refresh_expires_at": "2026-11-29T19:07:29.922020535Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": null,
  "session_version": 0,
  "session_state": "CLOSED",
  "intent": null,
  "connection": "DISCONNECTED",
  "geolocation": "UNAVAILABLE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": null,
  "vehicle_id": null,
  "last_heartbeat_at": null,
  "last_location_at": null,
  "eligible": false,
  "ineligible_reasons": [
    "NO_OPEN_SESSION"
  ]
}
```

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "793999c4-c470-4f34-b26e-93d54c5d67b2",
  "subject": {
    "type": "STAFF",
    "id": "50e6407f-123d-42ca-9890-64ec61c07dce"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MGU2NDA3Zi0xMjNkLTQyY2EtOTg5MC02NGVjNjFjMDdkY2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODgxNTAsImlhdCI6MTc5MzM4NzI1MCwianRpIjoiYTg1M2I5ZjAtMDI1NC00ZjJhLWI0MWUtYjU4MzUyYTdiZTNmIiwic2lkIjoiNzkzOTk5YzQtYzQ3MC00ZjM0LWIyNmUtOTNkNTRjNWQ2N2IyIn0.yKUogr1My26qbBO-R6yTBg8eVzd3CBFsNxKCLLoAy60",
  "access_expires_at": "2026-10-30T19:22:30.655906434Z",
  "refresh_token": "HcOnVmFclDkoVpZ3VSDxjfxMbehlU1z8enf5pKpgDvk",
  "refresh_expires_at": "2026-10-31T07:07:30.655440836Z",
  "password_change_required": false
}
```

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "OPERATOR",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "41a6ab50-34dd-4bd2-aa1b-3aaca648d2fa",
  "subject": {
    "type": "STAFF",
    "id": "50e6407f-123d-42ca-9890-64ec61c07dce"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MGU2NDA3Zi0xMjNkLTQyY2EtOTg5MC02NGVjNjFjMDdkY2UiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODgxNTEsImlhdCI6MTc5MzM4NzI1MSwianRpIjoiMGE4NzBmMGItNTI4NC00OTAxLThhM2QtZDYyNTVjZDkzM2NlIiwic2lkIjoiNDFhNmFiNTAtMzRkZC00YmQyLWFhMWItM2FhY2E2NDhkMmZhIn0.LbLT2A2suD43KWPwQb4XY93B4Io6Ft9k9GkezekH_Kk",
  "access_expires_at": "2026-10-30T19:22:31.148547024Z",
  "refresh_token": "4wEbCC0BDXSlD2f06b93NktXU_LH-fc6S7yodcUac4s",
  "refresh_expires_at": "2026-10-31T07:07:31.147761458Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-8814"
}
```

```json
{
  "challenge_id": "493a867f-3565-4675-b54d-d9b5131725f3",
  "expires_at": "2026-10-30T19:12:31.378518985Z",
  "resend_available_at": "2026-10-30T19:07:32.378518985Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "475860",
  "sent_at": "2026-10-30T19:07:31.380438731Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "493a867f-3565-4675-b54d-d9b5131725f3",
  "code": "475860",
  "device_ref": "sandbox-8814"
}
```

```json
{
  "session_id": "be0d3062-84ec-49ae-ba4a-774e6b243324",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4ODE1MSwiaWF0IjoxNzkzMzg3MjUxLCJqdGkiOiJmNGVmYmYxNi1lMDY3LTRhOTUtOGRhMC1mNzkxZjY1NGFmNzgiLCJzaWQiOiJiZTBkMzA2Mi04NGVjLTQ5YWUtYmE0YS03NzRlNmIyNDMzMjQifQ.x2zawPTKUO_tBgZ-Ug6S_4YY55LdlNkXb-lJUj1s9wc",
  "access_expires_at": "2026-10-30T19:22:31.640551102Z",
  "refresh_token": "7ov5hb4GT4GxWWJNJQr_OU59dbKDYCEhlXhEi7i5pPg",
  "refresh_expires_at": "2026-11-29T19:07:31.640143722Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": null,
  "session_version": 0,
  "session_state": "CLOSED",
  "intent": null,
  "connection": "DISCONNECTED",
  "geolocation": "UNAVAILABLE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": null,
  "vehicle_id": null,
  "last_heartbeat_at": null,
  "last_location_at": null,
  "eligible": false,
  "ineligible_reasons": [
    "NO_OPEN_SESSION"
  ]
}
```

(the car drives 64 s to the next point)

`POST /api/driver/v1/work-sessions` → **201**

```json
{
  "command_id": "b41213ce-9fcb-4f7d-8a3f-d96c34197dcc",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4528,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:08:36Z",
    "sequence": 1793387316125
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "3af27f8b-3fa4-45ab-a89c-939df6f6f265",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "last_heartbeat_at": "2026-10-30T19:08:36.14367Z",
  "last_location_at": "2026-10-30T19:08:36.14367Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380686349725",
  "device_ref": "sandbox-2824"
}
```

```json
{
  "challenge_id": "d726bd4d-9251-451d-b977-74f17496d764",
  "expires_at": "2026-10-30T19:13:36.390638752Z",
  "resend_available_at": "2026-10-30T19:08:37.390638752Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380686349725` → **200**

```json
{
  "phone": "+380686349725",
  "audience": "CLIENT",
  "code": "620580",
  "sent_at": "2026-10-30T19:08:36.392801545Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d726bd4d-9251-451d-b977-74f17496d764",
  "code": "620580",
  "device_ref": "sandbox-2824"
}
```

```json
{
  "session_id": "3b2ecf4b-01fc-49b5-85e8-f02a71e895e0",
  "subject": {
    "type": "CLIENT",
    "id": "762b578d-97e8-40e4-b89a-3aa20ac2d23e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3NjJiNTc4ZC05N2U4LTQwZTQtYjg5YS0zYWEyMGFjMmQyM2UiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzg4MjE2LCJpYXQiOjE3OTMzODczMTYsImp0aSI6IjAzMjlkOTNkLWRkYzQtNGVjNS04OGRlLTdhODdiYTI4NGQwNyIsInNpZCI6IjNiMmVjZjRiLTAxZmMtNDliNS04NWU4LWYwMmE3MWU4OTVlMCJ9.b6Ri1VSarEREMuXYI1D4g8wx0hJ2atSlz1gop1XCE4E",
  "access_expires_at": "2026-10-30T19:23:36.661426472Z",
  "refresh_token": "eVrYYmTA0dJET0DoYSzpwOML-_jvEk25BK4VM-YY3oc",
  "refresh_expires_at": "2026-11-29T19:08:36.660991318Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f1cf078e-ac91-4a60-bf36-481b1290384f",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  }
}
```

```json
{
  "id": "2645fbbe-5bef-461a-94d2-82b107092682",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T19:13:36.912205Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false,
  "discount_minor": 0,
  "to_pay_minor": 10517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "09126200-20d8-4282-98f9-cf3e65f05e0f",
  "quote_id": "2645fbbe-5bef-461a-94d2-82b107092682",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH"
}
```

```json
{
  "id": "47ec944b-04ac-4604-9e71-2819147e24f0",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "762b578d-97e8-40e4-b89a-3aa20ac2d23e",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "PERSONAL",
  "assignment": null,
  "created_at": "2026-10-30T19:08:37.166519Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "faab7cd6-5fa7-4832-b63f-b8ea1cefa89e",
    "order_id": "47ec944b-04ac-4604-9e71-2819147e24f0",
    "expires_at": "2026-10-30T19:08:52.16975Z",
    "vehicle_class": "STANDARD",
    "pickup": {
      "lat": 50.4501,
      "lon": 30.5234
    },
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "payment_method": "CASH",
    "price_minor": 10517,
    "currency": "UAH",
    "distance_m": 300
  }
]
```

`POST /api/driver/v1/offers/faab7cd6-5fa7-4832-b63f-b8ea1cefa89e/accept` → **200**

```json
{
  "command_id": "33f29b85-5371-4687-ab45-d26a5f91d7a2"
}
```

```json
{
  "id": "a9b58fbd-9b19-4906-8fb7-a92cd9d40b47",
  "order_id": "47ec944b-04ac-4604-9e71-2819147e24f0",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "111d1f09-9ef6-4e3d-91d3-458f2ff21109",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "111d1f09-9ef6-4e3d-91d3-458f2ff21109",
  "order_id": "47ec944b-04ac-4604-9e71-2819147e24f0",
  "assignment_id": "a9b58fbd-9b19-4906-8fb7-a92cd9d40b47",
  "phase": "TO_PICKUP",
  "version": 0,
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "price_minor": 10517,
  "currency": "UAH",
  "arrived_at": null,
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

(the car drives 4 s to the next point)

`POST /api/driver/v1/work-sessions/3af27f8b-3fa4-45ab-a89c-939df6f6f265/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:08:42Z",
    "sequence": 1793387322192
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "3af27f8b-3fa4-45ab-a89c-939df6f6f265",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "last_heartbeat_at": "2026-10-30T19:08:42.209307Z",
  "last_location_at": "2026-10-30T19:08:42.209307Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "111d1f09-9ef6-4e3d-91d3-458f2ff21109",
  "order_id": "47ec944b-04ac-4604-9e71-2819147e24f0",
  "assignment_id": "a9b58fbd-9b19-4906-8fb7-a92cd9d40b47",
  "phase": "TO_PICKUP",
  "version": 0,
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "price_minor": 10517,
  "currency": "UAH",
  "arrived_at": null,
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/111d1f09-9ef6-4e3d-91d3-458f2ff21109/arrive` → **200**

```json
{
  "command_id": "ae255b13-6125-46cc-be7c-097d4ea83f1e",
  "expected_version": 0
}
```

```json
{
  "id": "111d1f09-9ef6-4e3d-91d3-458f2ff21109",
  "order_id": "47ec944b-04ac-4604-9e71-2819147e24f0",
  "assignment_id": "a9b58fbd-9b19-4906-8fb7-a92cd9d40b47",
  "phase": "WAITING",
  "version": 1,
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "price_minor": 10517,
  "currency": "UAH",
  "arrived_at": "2026-10-30T19:08:42.697134Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/111d1f09-9ef6-4e3d-91d3-458f2ff21109/start` → **200**

```json
{
  "command_id": "432a1108-d779-432d-84b7-d3823f6538fe",
  "expected_version": 1
}
```

```json
{
  "id": "111d1f09-9ef6-4e3d-91d3-458f2ff21109",
  "order_id": "47ec944b-04ac-4604-9e71-2819147e24f0",
  "assignment_id": "a9b58fbd-9b19-4906-8fb7-a92cd9d40b47",
  "phase": "IN_PROGRESS",
  "version": 2,
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "price_minor": 10517,
  "currency": "UAH",
  "arrived_at": "2026-10-30T19:08:42.697134Z",
  "started_at": "2026-10-30T19:08:42.948235Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Staff block his account during the trip

`GET /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403` → **200**

```json
{
  "profile": {
    "id": "5a000000-0000-4000-8000-000000000403",
    "account_state": "ACTIVE",
    "name": "Андрій Шевчук",
    "language": "ru",
    "review_status": "APPROVED",
    "version": 11,
    "has_payment_terminal": false,
    "admission_city_ids": [
      "5a000000-0000-4000-8000-000000000001"
    ],
    "vehicles": [
      {
        "id": "5a000000-0000-4000-8000-000000000503",
        "registration_number": "AA0003TX",
        "make": "Hyundai",
        "model": "Sonata",
        "color": "black",
        "production_year": 2022,
        "state": "APPROVED",
        "class_approvals": [
          "STANDARD",
          "COMFORT"
        ]
      }
    ],
    "documents": []
  },
  "phone": "+380500000003",
  "history": [],
  "duplicates": []
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/block` → **200**

```json
{
  "command_id": "92c43ee2-f9a8-4727-8331-c7aa1037b05a",
  "expected_version": 11,
  "reason": "Complaint under review"
}
```

```json
{
  "id": "5a000000-0000-4000-8000-000000000403",
  "account_state": "BLOCKED",
  "name": "Андрій Шевчук",
  "language": "ru",
  "review_status": "APPROVED",
  "version": 12,
  "has_payment_terminal": false,
  "admission_city_ids": [
    "5a000000-0000-4000-8000-000000000001"
  ],
  "vehicles": [
    {
      "id": "5a000000-0000-4000-8000-000000000503",
      "registration_number": "AA0003TX",
      "make": "Hyundai",
      "model": "Sonata",
      "color": "black",
      "production_year": 2022,
      "state": "APPROVED",
      "class_approvals": [
        "STANDARD",
        "COMFORT"
      ]
    }
  ],
  "documents": []
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "3af27f8b-3fa4-45ab-a89c-939df6f6f265",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "PAUSE_AFTER_CURRENT",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "ON_TRIP",
  "account_state": "BLOCKED",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "last_heartbeat_at": "2026-10-30T19:08:42.209307Z",
  "last_location_at": "2026-10-30T19:08:42.209307Z",
  "eligible": false,
  "ineligible_reasons": [
    "ACCOUNT_BLOCKED",
    "INTENT_PAUSE_AFTER_CURRENT",
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## He still reads his trip and balance; new work is refused with 403 ACCOUNT_BLOCKED

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "111d1f09-9ef6-4e3d-91d3-458f2ff21109",
  "order_id": "47ec944b-04ac-4604-9e71-2819147e24f0",
  "assignment_id": "a9b58fbd-9b19-4906-8fb7-a92cd9d40b47",
  "phase": "IN_PROGRESS",
  "version": 2,
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "price_minor": 10517,
  "currency": "UAH",
  "arrived_at": "2026-10-30T19:08:42.697134Z",
  "started_at": "2026-10-30T19:08:42.948235Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/driver/v1/balance` → **200**

```json
{
  "balances": [
    {
      "currency": "UAH",
      "balance_minor": 46556,
      "debt_limit_minor": null,
      "blocked": false
    }
  ]
}
```

`PATCH /api/driver/v1/profile` → **403**

```json
{
  "command_id": "6ac30de7-4df2-4079-930a-c020f7c59b72",
  "name": "Андрій"
}
```

```json
{
  "instance": "/api/driver/v1/profile",
  "status": 403,
  "title": "Account blocked",
  "type": "https://errors.blizz.taxi/account-blocked",
  "code": "ACCOUNT_BLOCKED",
  "correlation_id": "ea3a2403-fab7-4f3d-9ad9-7701f86c96a6"
}
```

**Contract validation failed — scenario stopped.**

`GET /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403` → **200**

```json
{
  "profile": {
    "id": "5a000000-0000-4000-8000-000000000403",
    "account_state": "BLOCKED",
    "name": "Андрій Шевчук",
    "language": "ru",
    "review_status": "APPROVED",
    "version": 12,
    "has_payment_terminal": false,
    "admission_city_ids": [
      "5a000000-0000-4000-8000-000000000001"
    ],
    "vehicles": [
      {
        "id": "5a000000-0000-4000-8000-000000000503",
        "registration_number": "AA0003TX",
        "make": "Hyundai",
        "model": "Sonata",
        "color": "black",
        "production_year": 2022,
        "state": "APPROVED",
        "class_approvals": [
          "STANDARD",
          "COMFORT"
        ]
      }
    ],
    "documents": []
  },
  "phone": "+380500000003",
  "history": [],
  "duplicates": []
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/unblock` → **200**

```json
{
  "command_id": "0ca76fdf-e420-462f-96ac-85335741bbd8",
  "expected_version": 12,
  "reason": "Sandbox scenario over"
}
```

```json
{
  "id": "5a000000-0000-4000-8000-000000000403",
  "account_state": "ACTIVE",
  "name": "Андрій Шевчук",
  "language": "ru",
  "review_status": "APPROVED",
  "version": 13,
  "has_payment_terminal": false,
  "admission_city_ids": [
    "5a000000-0000-4000-8000-000000000001"
  ],
  "vehicles": [
    {
      "id": "5a000000-0000-4000-8000-000000000503",
      "registration_number": "AA0003TX",
      "make": "Hyundai",
      "model": "Sonata",
      "color": "black",
      "production_year": 2022,
      "state": "APPROVED",
      "class_approvals": [
        "STANDARD",
        "COMFORT"
      ]
    }
  ],
  "documents": []
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "3af27f8b-3fa4-45ab-a89c-939df6f6f265",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "PAUSE_AFTER_CURRENT",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "ON_TRIP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "last_heartbeat_at": "2026-10-30T19:08:42.209307Z",
  "last_location_at": "2026-10-30T19:08:42.209307Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_PAUSE_AFTER_CURRENT",
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/work-sessions/3af27f8b-3fa4-45ab-a89c-939df6f6f265/close` → **200**

```json
{
  "command_id": "c4a96838-5950-462c-a3e0-0a52e25847ad",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "3af27f8b-3fa4-45ab-a89c-939df6f6f265",
  "session_version": 2,
  "session_state": "CLOSING",
  "intent": "PAUSE_AFTER_CURRENT",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "ON_TRIP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "last_heartbeat_at": "2026-10-30T19:08:42.209307Z",
  "last_location_at": "2026-10-30T19:08:42.209307Z",
  "eligible": false,
  "ineligible_reasons": [
    "SESSION_CLOSING",
    "INTENT_PAUSE_AFTER_CURRENT",
    "OCCUPANCY_ON_TRIP"
  ]
}
```

# Scenario: driver-states

## Only the two drivers of this scenario are online: Near about 200 m from the pickup, Far about 600 m

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-25988"
}
```

```json
{
  "challenge_id": "f902e625-7525-4b47-9902-638d8fb262b6",
  "expires_at": "2026-10-30T19:13:45.702737709Z",
  "resend_available_at": "2026-10-30T19:08:46.702737709Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "897151",
  "sent_at": "2026-10-30T19:08:45.716489623Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f902e625-7525-4b47-9902-638d8fb262b6",
  "code": "897151",
  "device_ref": "sandbox-25988"
}
```

```json
{
  "session_id": "b7708fcb-6ce1-4000-a355-ea0b3555b787",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4ODIyNSwiaWF0IjoxNzkzMzg3MzI1LCJqdGkiOiI0OGU5MjRiNi1mNDMzLTQ2NzQtOGIyYi03NGExZmQxZjdmYjQiLCJzaWQiOiJiNzcwOGZjYi02Y2UxLTQwMDAtYTM1NS1lYTBiMzU1NWI3ODcifQ.PrJZqWLeHJWyU454DMnwbkF2tvFDr4VXFhQhzgO4EmQ",
  "access_expires_at": "2026-10-30T19:23:45.992217429Z",
  "refresh_token": "IerWWyz77etvlVpkJjs3zHHN5qo1cUpH_-cMVmA1X6o",
  "refresh_expires_at": "2026-11-29T19:08:45.991585037Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "3af27f8b-3fa4-45ab-a89c-939df6f6f265",
  "session_version": 2,
  "session_state": "CLOSING",
  "intent": "PAUSE_AFTER_CURRENT",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "ON_TRIP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "last_heartbeat_at": "2026-10-30T19:08:42.209307Z",
  "last_location_at": "2026-10-30T19:08:42.209307Z",
  "eligible": false,
  "ineligible_reasons": [
    "SESSION_CLOSING",
    "INTENT_PAUSE_AFTER_CURRENT",
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/work-sessions/3af27f8b-3fa4-45ab-a89c-939df6f6f265/close` → **409**

```json
{
  "command_id": "b91c37ec-481a-42f2-bb83-a8959e8d9884",
  "expected_version": 2
}
```

```json
{
  "instance": "/api/driver/v1/work-sessions/3af27f8b-3fa4-45ab-a89c-939df6f6f265/close",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "991fc883-4aad-4cd8-bad4-93f10a61b715"
}
```

**Expected 200, got 409 — scenario stopped.**

# Scenario: feature-flags

## The admin looks at the feature flags

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "42acf2df-1d45-4208-839d-33f35a1278f9",
  "subject": {
    "type": "STAFF",
    "id": "50e6407f-123d-42ca-9890-64ec61c07dce"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MGU2NDA3Zi0xMjNkLTQyY2EtOTg5MC02NGVjNjFjMDdkY2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODgyMjcsImlhdCI6MTc5MzM4NzMyNywianRpIjoiY2M0NGY3YzktZWZkZC00NzQ3LTg0YjQtYTdmMTYyNmFiMDRjIiwic2lkIjoiNDJhY2YyZGYtMWQ0NS00MjA4LTgzOWQtMzNmMzVhMTI3OGY5In0.WOxVSNLn1f2KFeHwuoB9bBx9JjQbEK5RBMgoIl2WpvM",
  "access_expires_at": "2026-10-30T19:23:47.036631774Z",
  "refresh_token": "gIyjN8jUxNusKU8W2ViFTp_Do_27tTvfGto1gAssLfU",
  "refresh_expires_at": "2026-10-31T07:08:47.036042327Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/feature-flags` → **200**

```json
{
  "flags": [
    {
      "key": "card-payments",
      "description": "New orders paid by a saved card. Off: new card orders are refused; orders already made are still paid as begun.",
      "owner": "payments",
      "review_by": "2027-06-30",
      "default_enabled": true,
      "enabled": true,
      "version": 0,
      "changed_by": null,
      "reason": null,
      "changed_at": null
    }
  ]
}
```

card-payments: {"enabled":true,"owner":"payments","review_by":"2027-06-30","version":0}

## Card payments are switched off for a provider incident

`POST /api/admin/v1/feature-flags/card-payments/change` → **200**

```json
{
  "command_id": "ae51bfe5-21a4-4288-b492-a2ace9c302e8",
  "expected_version": 0,
  "enabled": false,
  "reason": "Sandbox: provider incident"
}
```

```json
{
  "key": "card-payments",
  "description": "New orders paid by a saved card. Off: new card orders are refused; orders already made are still paid as begun.",
  "owner": "payments",
  "review_by": "2027-06-30",
  "default_enabled": true,
  "enabled": false,
  "version": 1,
  "changed_by": "50e6407f-123d-42ca-9890-64ec61c07dce",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-30T19:08:47.565645Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "4783d8db-da81-452b-8ac3-f857657e91a0",
  "expected_version": 0,
  "enabled": false,
  "reason": "An old version"
}
```

```json
{
  "instance": "/api/admin/v1/feature-flags/card-payments/change",
  "status": 409,
  "title": "Version conflict",
  "type": "https://errors.blizz.taxi/version-conflict",
  "code": "VERSION_CONFLICT",
  "correlation_id": "6e839795-0892-4592-bd6c-fb4c58c54c0e",
  "current_version": 1
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "cb293ea1-f11f-4828-96f0-b43a51c21c3d",
  "expected_version": 0,
  "enabled": false,
  "reason": "x"
}
```

```json
{
  "instance": "/api/admin/v1/feature-flags/no-such-flag/change",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "cb1b88d8-1278-4be6-bb02-800ff5e3cfae"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638314563",
  "device_ref": "sandbox-5099"
}
```

```json
{
  "challenge_id": "534651dc-1407-4f3a-bb8f-7aa0385a22b1",
  "expires_at": "2026-10-30T19:13:48.323845444Z",
  "resend_available_at": "2026-10-30T19:08:49.323845444Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638314563` → **200**

```json
{
  "phone": "+380638314563",
  "audience": "CLIENT",
  "code": "042067",
  "sent_at": "2026-10-30T19:08:48.464188051Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "534651dc-1407-4f3a-bb8f-7aa0385a22b1",
  "code": "042067",
  "device_ref": "sandbox-5099"
}
```

```json
{
  "session_id": "2a31ab4f-6636-4137-973c-c1d1e94f1e8d",
  "subject": {
    "type": "CLIENT",
    "id": "538895bc-a414-4ec5-9d40-9ec2af4592e1"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1Mzg4OTViYy1hNDE0LTRlYzUtOWQ0MC05ZWMyYWY0NTkyZTEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzg4MjI4LCJpYXQiOjE3OTMzODczMjgsImp0aSI6ImQxN2VjNDc0LTk4ZTAtNDkwYy1iNDgyLTc5NWY5MWRmY2VlNSIsInNpZCI6IjJhMzFhYjRmLTY2MzYtNDEzNy05NzNjLWMxZDFlOTRmMWU4ZCJ9.yL2xycGTmU9SnX_u1CdbGlqGKYLZe3fg0S0JbQvWvaY",
  "access_expires_at": "2026-10-30T19:23:48.731461911Z",
  "refresh_token": "2UJNObLElHyXcqPbQOPVGEBO_gO6xHNBX6TgN_x5TIA",
  "refresh_expires_at": "2026-11-29T19:08:48.730754897Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "df7d09fa-2254-4b09-9991-07ecac3894e9",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  }
}
```

```json
{
  "id": "b02e3b1f-31cd-4fa9-a362-0dfa10fe9d94",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T19:13:48.974984Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false,
  "discount_minor": 0,
  "to_pay_minor": 10517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **422**

```json
{
  "command_id": "086022fb-5413-4153-8753-f85c289a28ee",
  "quote_id": "b02e3b1f-31cd-4fa9-a362-0dfa10fe9d94",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CARD"
}
```

```json
{
  "instance": "/api/rider/v1/orders",
  "status": 422,
  "title": "Payment method not offered",
  "type": "https://errors.blizz.taxi/payment-method-not-offered",
  "code": "PAYMENT_METHOD_NOT_OFFERED",
  "correlation_id": "abd59384-220f-4372-9905-0f22169eac2f"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "cd168ef8-58cc-46de-8494-7baf4dd6470c",
  "quote_id": "b02e3b1f-31cd-4fa9-a362-0dfa10fe9d94",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH"
}
```

```json
{
  "id": "e1047548-f7e5-426f-8cc6-70bf4f967f37",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "538895bc-a414-4ec5-9d40-9ec2af4592e1",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T19:08:49.514388Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/e1047548-f7e5-426f-8cc6-70bf4f967f37/cancel` → **200**

```json
{
  "command_id": "016ea323-fd00-4b7a-951d-52c2f6af92d3",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "e1047548-f7e5-426f-8cc6-70bf4f967f37",
  "short_number": 15,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "538895bc-a414-4ec5-9d40-9ec2af4592e1",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "STOPPED",
  "assignment": null,
  "created_at": "2026-10-30T19:08:49.514388Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
      "en": "Changed my mind",
      "ru": "Передумал ехать"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

## The incident is over: card payments are back on

`POST /api/admin/v1/feature-flags/card-payments/change` → **200**

```json
{
  "command_id": "b0b31b61-afa5-43c6-8039-8c79a9987ed4",
  "expected_version": 1,
  "enabled": true,
  "reason": "Sandbox: incident over"
}
```

```json
{
  "key": "card-payments",
  "description": "New orders paid by a saved card. Off: new card orders are refused; orders already made are still paid as begun.",
  "owner": "payments",
  "review_by": "2027-06-30",
  "default_enabled": true,
  "enabled": true,
  "version": 2,
  "changed_by": "50e6407f-123d-42ca-9890-64ec61c07dce",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-30T19:08:50.084693Z"
}
```

Done: a new card order refused while the flag was off; a cash order went through; the flag is on again.

`GET /api/admin/v1/feature-flags` → **200**

```json
{
  "flags": [
    {
      "key": "card-payments",
      "description": "New orders paid by a saved card. Off: new card orders are refused; orders already made are still paid as begun.",
      "owner": "payments",
      "review_by": "2027-06-30",
      "default_enabled": true,
      "enabled": true,
      "version": 2,
      "changed_by": "50e6407f-123d-42ca-9890-64ec61c07dce",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-30T19:08:50.084693Z"
    }
  ]
}
```

# Scenario: full-ride

## Start-up data for the apps

`GET /api/config/v1/bootstrap` → **200**

```json
{
  "settings_version": 2,
  "brand": {
    "service_name": "Blizz Taxi",
    "primary_color": "#111111",
    "on_primary_color": "#FFFFFF",
    "accent_color": null,
    "logo_url": null,
    "support_phone": null,
    "support_email": null,
    "support_telegram": null,
    "privacy_policy_url": null,
    "terms_url": null
  },
  "languages": {
    "default_language": "ru",
    "enabled": [
      "uk",
      "pl",
      "ru",
      "en"
    ]
  },
  "calls": {
    "mode": "DIRECT",
    "service_phone": null
  },
  "preorders": {
    "threshold_minutes": 60,
    "max_days_ahead": 7
  },
  "maps": {
    "provider": null,
    "android_key": null,
    "ios_key": null,
    "web_key": null
  },
  "cities": [
    {
      "id": "5a000000-0000-4000-8000-000000000002",
      "code": "warszawa",
      "name": "Warszawa",
      "currency": "PLN",
      "timezone": "Europe/Warsaw",
      "working_hours": [],
      "payment_methods": [
        "CARD",
        "CASH",
        "TERMINAL"
      ],
      "orders_paused": false
    },
    {
      "id": "5a000000-0000-4000-8000-000000000001",
      "code": "kyiv",
      "name": "Київ",
      "currency": "UAH",
      "timezone": "Europe/Kyiv",
      "working_hours": [],
      "payment_methods": [
        "CARD",
        "CASH",
        "TERMINAL"
      ],
      "orders_paused": false
    }
  ],
  "app_versions": {
    "rider_android": {
      "minimum_version": "0.0.0",
      "latest_version": "0.0.0"
    },
    "rider_ios": {
      "minimum_version": "0.0.0",
      "latest_version": "0.0.0"
    },
    "driver_android": {
      "minimum_version": "0.0.0",
      "latest_version": "0.0.0"
    },
```

## Driver signs in and goes online 200 m from the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-30199"
}
```

```json
{
  "challenge_id": "6a4cc6ea-62bf-45b5-aeda-1e0bab04530b",
  "expires_at": "2026-10-30T19:13:50.833512994Z",
  "resend_available_at": "2026-10-30T19:08:51.833512994Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "492444",
  "sent_at": "2026-10-30T19:08:50.927662436Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6a4cc6ea-62bf-45b5-aeda-1e0bab04530b",
  "code": "492444",
  "device_ref": "sandbox-30199"
}
```

```json
{
  "session_id": "d68ed630-0f61-40c8-9ca8-37303bb33039",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4ODIzMSwiaWF0IjoxNzkzMzg3MzMxLCJqdGkiOiJmYTFkOWVjMy1kOTY4LTQyMjEtOWM5NC1iMmY4MGVmZTNiZGYiLCJzaWQiOiJkNjhlZDYzMC0wZjYxLTQwYzgtOWNhOC0zNzMwM2JiMzMwMzkifQ.w3Dibanrlt9k5CYw6SDKJ8BSNUDIIjq0qgl4p2DX560",
  "access_expires_at": "2026-10-30T19:23:51.206428014Z",
  "refresh_token": "BGB2ga_pCMmPdGdG-NO5-2K5wlvDaQ6i_V2QgTyT4NE",
  "refresh_expires_at": "2026-11-29T19:08:51.205942524Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": null,
  "session_version": 0,
  "session_state": "CLOSED",
  "intent": null,
  "connection": "DISCONNECTED",
  "geolocation": "UNAVAILABLE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": null,
  "vehicle_id": null,
  "last_heartbeat_at": null,
  "last_location_at": null,
  "eligible": false,
  "ineligible_reasons": [
    "NO_OPEN_SESSION"
  ]
}
```

`POST /api/driver/v1/work-sessions` → **201**

```json
{
  "command_id": "767e13d6-3287-41c6-ab00-accb8f4859c6",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:08:51Z",
    "sequence": 1793387331704
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3b496cf5-f813-48eb-829e-b7261aa76999",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T19:08:51.722203Z",
  "last_location_at": "2026-10-30T19:08:51.722203Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678635649",
  "device_ref": "sandbox-26336"
}
```

```json
{
  "challenge_id": "217ae7ca-e9b7-4925-b3eb-833be91aef8e",
  "expires_at": "2026-10-30T19:13:51.982919672Z",
  "resend_available_at": "2026-10-30T19:08:52.982919672Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380678635649` → **200**

```json
{
  "phone": "+380678635649",
  "audience": "CLIENT",
  "code": "303771",
  "sent_at": "2026-10-30T19:08:52.08219304Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "217ae7ca-e9b7-4925-b3eb-833be91aef8e",
  "code": "303771",
  "device_ref": "sandbox-26336"
}
```

```json
{
  "session_id": "165c7c46-559d-4333-87f2-b8a81f36135a",
  "subject": {
    "type": "CLIENT",
    "id": "682ae454-5379-4a11-8fd9-fde0037f04db"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ODJhZTQ1NC01Mzc5LTRhMTEtOGZkOS1mZGUwMDM3ZjA0ZGIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzg4MjMyLCJpYXQiOjE3OTMzODczMzIsImp0aSI6IjA2MjE1YmMyLTkwZGEtNGI4YS04MzU0LTViODAwNzU2ZTQxOSIsInNpZCI6IjE2NWM3YzQ2LTU1OWQtNDMzMy04N2YyLWI4YTgxZjM2MTM1YSJ9.Mm5OrcJ54CJuad8iDPo4ub9NKGkCTi5iK-_41yCVUUQ",
  "access_expires_at": "2026-10-30T19:23:52.42812884Z",
  "refresh_token": "Vqcgx4I9b0_mxkAudUtO_KEy-cMRFvImT4pntXEkUCo",
  "refresh_expires_at": "2026-11-29T19:08:52.427349809Z",
  "account_created": true
}
```

`GET /api/rider/v1/vehicle-classes?lat=50.4501&lon=30.5234` → **200**

```json
[
  {
    "code": "COMFORT",
    "name": "Комфорт"
  },
  {
    "code": "STANDARD",
    "name": "Стандарт"
  }
]
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "91c368b9-20c9-4006-abf7-b033c4a3d15e",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  }
}
```

```json
{
  "id": "8cbd5ce6-a8b8-46d2-9206-19a4a2b1feab",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T19:13:52.942369Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false,
  "discount_minor": 0,
  "to_pay_minor": 10517,
  "promotions": []
}
```

## Both phones register for pushes (the sandbox only records them: /sandbox/v1/pushes)

`POST /api/driver/v1/push-devices` → **201**

```json
{
  "command_id": "9f54b853-e0ce-47eb-85c8-508174808548",
  "platform": "ANDROID",
  "token": "sandbox-driver-e5452b5f-d21e-411e-96fc-b99dc6d65229"
}
```

```json
{
  "id": "5bc87f90-9c9e-43ba-bb67-85edb7f1d710",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T19:08:53.200425Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "5d21f7a4-0cfa-4ba2-a58f-5e6d8cf07449",
  "platform": "ANDROID",
  "token": "sandbox-rider-073e2cf8-709a-4092-846a-a6adaed28706"
}
```

```json
{
  "id": "59dfdb57-5bee-446f-bcf9-ec1fb80628c1",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T19:08:53.44886Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "d393ba56-2a12-4415-8cac-c54639b2eac3",
  "quote_id": "8cbd5ce6-a8b8-46d2-9206-19a4a2b1feab",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан Незалежності",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "dropoff_label": "Залізничний вокзал",
  "payment_method": "CASH"
}
```

```json
{
  "id": "fcef5b7e-4624-4a78-a95f-d10d7fdd6dae",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "682ae454-5379-4a11-8fd9-fde0037f04db",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан Незалежності",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Залізничний вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "PERSONAL",
  "assignment": null,
  "created_at": "2026-10-30T19:08:53.705294Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

## The driver gets the offer and accepts it

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "b69b2764-7ec9-484c-a487-cdf36a8d5ef7",
    "order_id": "fcef5b7e-4624-4a78-a95f-d10d7fdd6dae",
    "expires_at": "2026-10-30T19:09:08.708013Z",
    "vehicle_class": "STANDARD",
    "pickup": {
      "lat": 50.4501,
      "lon": 30.5234
    },
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "payment_method": "CASH",
    "price_minor": 10517,
    "currency": "UAH",
    "distance_m": 44
  }
]
```

`POST /api/driver/v1/offers/b69b2764-7ec9-484c-a487-cdf36a8d5ef7/accept` → **200**

```json
{
  "command_id": "5643b9de-f5a2-42c0-a8fb-d74e407b65c0"
}
```

```json
{
  "id": "9cfa1251-11e9-4eb8-9cd3-e67e3c2091de",
  "order_id": "fcef5b7e-4624-4a78-a95f-d10d7fdd6dae",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "00c3ea5c-f0b2-49b1-8109-299f8ece4100",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-30T19:08:53.682Z` → **200**

```json
[
  {
    "at": "2026-10-30T19:08:54.396357429Z",
    "token_suffix": "d65229",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "event_id": "4f4e40d5-b7a9-4242-85de-32b4a659685c",
      "event_type": "OfferMade",
      "type": "driver.offer",
      "order_id": "fcef5b7e-4624-4a78-a95f-d10d7fdd6dae",
      "order_version": "2"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380678635649&after=2026-10-30T19:08:53.682Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380678635649&after=2026-10-30T19:08:53.682Z` → **200**

```json
[
  {
    "at": "2026-10-30T19:08:55.400628977Z",
    "token_suffix": "d28706",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "event_id": "b3ba04a0-193c-42e8-89c6-8933f760f9e4",
      "event_type": "AssignmentCommitted",
      "type": "rider.driver-assigned",
      "order_id": "fcef5b7e-4624-4a78-a95f-d10d7fdd6dae",
      "order_version": "3"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/fcef5b7e-4624-4a78-a95f-d10d7fdd6dae/messages` → **201**

```json
{
  "command_id": "74f29ca2-d774-465a-8fb5-fbbf40eec7b9",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "235a7feb-24ba-4879-829b-ba1cef983e3d",
  "order_id": "fcef5b7e-4624-4a78-a95f-d10d7fdd6dae",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-30T19:08:55.652394053Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "00c3ea5c-f0b2-49b1-8109-299f8ece4100",
  "order_id": "fcef5b7e-4624-4a78-a95f-d10d7fdd6dae",
  "assignment_id": "9cfa1251-11e9-4eb8-9cd3-e67e3c2091de",
  "phase": "TO_PICKUP",
  "version": 0,
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан Незалежності",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Залізничний вокзал",
  "payment_method": "CASH",
  "price_minor": 10517,
  "currency": "UAH",
  "arrived_at": null,
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/00c3ea5c-f0b2-49b1-8109-299f8ece4100/messages` → **201**

```json
{
  "command_id": "1a0dca7a-ae2d-4f9a-95ec-d3a89e1db805",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "a1cd9cd3-e35d-4e73-80ce-e816898981eb",
  "order_id": "fcef5b7e-4624-4a78-a95f-d10d7fdd6dae",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-30T19:08:56.140123598Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/fcef5b7e-4624-4a78-a95f-d10d7fdd6dae/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/00c3ea5c-f0b2-49b1-8109-299f8ece4100/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380678635649"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/3b496cf5-f813-48eb-829e-b7261aa76999/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:08:56Z",
    "sequence": 1793387336902
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3b496cf5-f813-48eb-829e-b7261aa76999",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T19:08:56.92004Z",
  "last_location_at": "2026-10-30T19:08:56.92004Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "00c3ea5c-f0b2-49b1-8109-299f8ece4100",
  "order_id": "fcef5b7e-4624-4a78-a95f-d10d7fdd6dae",
  "assignment_id": "9cfa1251-11e9-4eb8-9cd3-e67e3c2091de",
  "phase": "TO_PICKUP",
  "version": 0,
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан Незалежності",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Залізничний вокзал",
  "payment_method": "CASH",
  "price_minor": 10517,
  "currency": "UAH",
  "arrived_at": null,
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/00c3ea5c-f0b2-49b1-8109-299f8ece4100/arrive` → **200**

```json
{
  "command_id": "149f7b55-bfa2-4c60-a884-06f869e96bde",
  "expected_version": 0
}
```

```json
{
  "id": "00c3ea5c-f0b2-49b1-8109-299f8ece4100",
  "order_id": "fcef5b7e-4624-4a78-a95f-d10d7fdd6dae",
  "assignment_id": "9cfa1251-11e9-4eb8-9cd3-e67e3c2091de",
  "phase": "WAITING",
  "version": 1,
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан Незалежності",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Залізничний вокзал",
  "payment_method": "CASH",
  "price_minor": 10517,
  "currency": "UAH",
  "arrived_at": "2026-10-30T19:08:57.428182Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/00c3ea5c-f0b2-49b1-8109-299f8ece4100/start` → **200**

```json
{
  "command_id": "bfd796a3-b4cc-402c-b31b-610df20463d9",
  "expected_version": 1
}
```

```json
{
  "id": "00c3ea5c-f0b2-49b1-8109-299f8ece4100",
  "order_id": "fcef5b7e-4624-4a78-a95f-d10d7fdd6dae",
  "assignment_id": "9cfa1251-11e9-4eb8-9cd3-e67e3c2091de",
  "phase": "IN_PROGRESS",
  "version": 2,
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан Незалежності",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Залізничний вокзал",
  "payment_method": "CASH",
  "price_minor": 10517,
  "currency": "UAH",
  "arrived_at": "2026-10-30T19:08:57.428182Z",
  "started_at": "2026-10-30T19:08:57.679478Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

(the car drives 48 s to the next point)

`POST /api/driver/v1/work-sessions/3b496cf5-f813-48eb-829e-b7261aa76999/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:09:45Z",
    "sequence": 1793387385945
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3b496cf5-f813-48eb-829e-b7261aa76999",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "ON_TRIP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T19:09:45.964187Z",
  "last_location_at": "2026-10-30T19:09:45.964187Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/00c3ea5c-f0b2-49b1-8109-299f8ece4100/complete` → **200**

```json
{
  "command_id": "e5e40d33-2f0e-48c2-91d9-0d109dad9730",
  "expected_version": 2,
  "reported_at": "2026-10-30T19:09:46Z",
  "cash_received": true
}
```

```json
{
  "id": "00c3ea5c-f0b2-49b1-8109-299f8ece4100",
  "order_id": "fcef5b7e-4624-4a78-a95f-d10d7fdd6dae",
  "assignment_id": "9cfa1251-11e9-4eb8-9cd3-e67e3c2091de",
  "phase": "COMPLETED",
  "version": 3,
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан Незалежності",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Залізничний вокзал",
  "payment_method": "CASH",
  "price_minor": 10517,
  "currency": "UAH",
  "arrived_at": "2026-10-30T19:08:57.428182Z",
  "started_at": "2026-10-30T19:08:57.679478Z",
  "completed_at": "2026-10-30T19:09:46.24221Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/fcef5b7e-4624-4a78-a95f-d10d7fdd6dae` → **200**

```json
{
  "id": "fcef5b7e-4624-4a78-a95f-d10d7fdd6dae",
  "short_number": 16,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "682ae454-5379-4a11-8fd9-fde0037f04db",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан Незалежності",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Залізничний вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_REPORTED",
  "price_minor": 10517,
  "final_price_minor": 10517,
  "currency": "UAH",
  "search_phase": "STOPPED",
  "assignment": {
    "id": "9cfa1251-11e9-4eb8-9cd3-e67e3c2091de",
    "order_id": "fcef5b7e-4624-4a78-a95f-d10d7fdd6dae",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "00c3ea5c-f0b2-49b1-8109-299f8ece4100",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T19:08:53.705294Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders` → **200**

```json
{
  "items": [
    {
      "id": "fcef5b7e-4624-4a78-a95f-d10d7fdd6dae",
      "short_number": 16,
      "status": "FULFILLED",
      "created_at": "2026-10-30T19:08:53.705294Z",
      "pickup_label": "Майдан Незалежності",
      "dropoff_label": "Залізничний вокзал",
      "vehicle_class": "STANDARD",
      "price_minor": 10517,
      "final_price_minor": 10517,
      "currency": "UAH",
      "payment_method": "CASH",
      "driver": {
        "name": "Іван Петренко",
        "vehicle": {
          "make": "Skoda",
          "model": "Octavia",
          "color": "white",
          "registration_number": "AA0001TX"
        }
      },
      "chat_available": true,
      "cancellation": null,
      "pickup_at": null
    }
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
```

`GET /api/driver/v1/trips` → **200**

```json
{
  "items": [
    {
      "id": "00c3ea5c-f0b2-49b1-8109-299f8ece4100",
      "order_id": "fcef5b7e-4624-4a78-a95f-d10d7fdd6dae",
      "order_short_number": 16,
      "created_at": "2026-10-30T19:08:54.32783Z",
      "pickup_label": "Майдан Незалежності",
      "dropoff_label": "Залізничний вокзал",
      "final_price_minor": 10517,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "COMPLETED"
    },
    {
      "id": "aa92c5c3-4eb5-4b01-b8f0-af78857d69dc",
      "order_id": "e31bdfd1-a3f3-4f6d-8372-268dd0a18f83",
      "order_short_number": 10,
      "created_at": "2026-10-30T19:04:51.014032Z",
      "pickup_label": "Майдан",
      "dropoff_label": "Вокзал",
      "final_price_minor": 10517,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "COMPLETED"
    },
    {
      "id": "15e42d06-2a03-44dd-9976-7b2cdbc508cc",
      "order_id": "fa407296-6cd8-4f6c-a4af-e385ca6ca948",
      "order_short_number": 5,
      "created_at": "2026-10-30T19:03:22.131445Z",
      "pickup_label": "Майдан",
      "dropoff_label": "Вокзал",
      "final_price_minor": 10517,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "COMPLETED"
    },
    {
      "id": "e75035e4-5aa5-4384-ae7a-6c5495d26a7f",
      "order_id": "f46583bb-cd87-48ca-8ac4-1b37c1b0d164",
      "order_short_number": 3,
      "created_at": "2026-10-30T18:59:33.551188Z",
      "pickup_label": "Майдан",
      "dropoff_label": "Вокзал",
      "final_price_minor": 10517,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "COMPLETED"
    },
    {
      "id": "da2e213d-38b3-46cb-b7bf-1a2223ce5eec",
      "order_id": "e71b7c06-0d5f-4b01-a069-947facec0073",
      "order_short_number": 2,
      "created_at": "2026-10-30T18:59:25.355708Z",
      "pickup_label": "Майдан",
      "dropoff_label": "Вокзал",
      "final_price_minor": 10517,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "COMPLETED"
    }
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
```

`GET /api/driver/v1/balance` → **200**

```json
{
  "balances": [
    {
      "currency": "UAH",
      "balance_minor": 5679,
      "debt_limit_minor": null,
      "blocked": false
    }
  ]
}
```

`GET /api/driver/v1/earnings?city_id=5a000000-0000-4000-8000-000000000001&from=2026-10-30&to=2026-10-30` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "currency": "UAH",
  "timezone": "Europe/Kyiv",
  "from": "2026-10-30",
  "to": "2026-10-30",
  "days": [
    {
      "date": "2026-10-30",
      "figures": {
        "trips": 5,
        "fare_minor": 52585,
        "commission_minor": 7890,
        "driver_share_minor": 44695,
        "held_minor": 0,
        "cash_minor": 39016,
        "cashless_minor": 13569,
        "tips_minor": 0,
        "bonuses_minor": 0,
        "top_ups_minor": 0,
        "transfers_in_minor": 0,
        "transfers_out_minor": 0,
        "adjustments_minor": 0,
        "net_minor": 5679
      }
    }
  ],
  "total": {
    "trips": 5,
    "fare_minor": 52585,
    "commission_minor": 7890,
    "driver_share_minor": 44695,
    "held_minor": 0,
    "cash_minor": 39016,
    "cashless_minor": 13569,
    "tips_minor": 0,
    "bonuses_minor": 0,
    "top_ups_minor": 0,
    "transfers_in_minor": 0,
    "transfers_out_minor": 0,
    "adjustments_minor": 0,
    "net_minor": 5679
  },
  "balance_minor": 5679
}
```

## The rider leaves a 10 % tip in cash: it is only recorded

`GET /api/rider/v1/orders/fcef5b7e-4624-4a78-a95f-d10d7fdd6dae/tip` → **200**

```json
{
  "order_id": "fcef5b7e-4624-4a78-a95f-d10d7fdd6dae",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CASH",
  "available_until": "2026-10-31T19:09:46.24221Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/fcef5b7e-4624-4a78-a95f-d10d7fdd6dae/tip` → **201**

```json
{
  "command_id": "2ebac3ce-0fcc-4247-ae4a-8654f4290072",
  "amount_minor": 1100
}
```

```json
{
  "id": "599d4e86-2b7e-4a4b-9105-d3ddbae56e27",
  "order_id": "fcef5b7e-4624-4a78-a95f-d10d7fdd6dae",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-30T19:09:51.002346Z"
}
```

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "522d8885-a4a0-47aa-bce0-4b8eb7b0430b",
  "subject": {
    "type": "STAFF",
    "id": "50e6407f-123d-42ca-9890-64ec61c07dce"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MGU2NDA3Zi0xMjNkLTQyY2EtOTg5MC02NGVjNjFjMDdkY2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODgyOTEsImlhdCI6MTc5MzM4NzM5MSwianRpIjoiODE1ODE5NDAtYjZmMi00NjgzLWI0OGItMjkwYThjNTAyM2IyIiwic2lkIjoiNTIyZDg4ODUtYTRhMC00N2FhLWJjZTAtNGI4ZWI3YjA0MzBiIn0.87vInGhVFDGxVCGOW5hKZr-qnjWFFlYx3vehrgo9His",
  "access_expires_at": "2026-10-30T19:24:51.520009776Z",
  "refresh_token": "CaSulGUMZk5GRfU83dIGgnoQFpWOhn02euCVLsPACTg",
  "refresh_expires_at": "2026-10-31T07:09:51.519343279Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/reports/orders?city_id=5a000000-0000-4000-8000-000000000001&from=2026-10-30&to=2026-10-30` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "timezone": "Europe/Kyiv",
  "from": "2026-10-30",
  "to": "2026-10-30",
  "days": [
    {
      "date": "2026-10-30",
      "counts": {
        "created": 15,
        "fulfilled": 8,
        "cancelled": 6,
        "unfulfilled": 0,
        "open": 1,
        "by_channel": {
          "PHONE": 1,
          "APP": 14
        },
        "by_payment": {
          "CASH": 13,
          "CARD": 2
        },
        "cancelled_by": {
          "DRIVER": 1,
          "STAFF": 2,
          "RIDER": 3
        }
      }
    }
  ],
  "total": {
    "created": 15,
    "fulfilled": 8,
    "cancelled": 6,
    "unfulfilled": 0,
    "open": 1,
    "by_channel": {
      "PHONE": 1,
      "APP": 14
    },
    "by_payment": {
      "CASH": 13,
      "CARD": 2
    },
    "cancelled_by": {
      "DRIVER": 1,
      "STAFF": 2,
      "RIDER": 3
    }
  },
  "cancellation_reasons": [
    {
      "cancelled_by": "RIDER",
      "code": "CHANGED_MIND",
      "count": 2
    },
    {
      "cancelled_by": "STAFF",
      "code": "NO_CARS",
      "count": 2
    },
    {
      "cancelled_by": "DRIVER",
      "code": "PASSENGER_ASKED",
      "count": 1
    },
    {
      "cancelled_by": "RIDER",
      "code": "WAIT_TOO_LONG",
      "count": 1
    }
  ],
  "generated_at": "2026-10-30T19:09:51.768973797Z"
}
```

`GET /api/admin/v1/reports/finance?city_id=5a000000-0000-4000-8000-000000000001&from=2026-10-30&to=2026-10-30` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "currency": "UAH",
  "timezone": "Europe/Kyiv",
  "from": "2026-10-30",
  "to": "2026-10-30",
  "days": [
    {
      "date": "2026-10-30",
      "figures": {
        "trips": 8,
        "fares_minor": 101476,
        "service_rides_minor": 0,
        "commission_minor": 15225,
        "driver_share_minor": 86251,
        "discounts_minor": 1052,
        "bonuses_granted_minor": 0,
        "paid_by_card_minor": 32594,
        "paid_with_bonuses_minor": 18297,
        "collected_by_drivers_minor": 39016,
        "tips_minor": 5000,
        "rider_debt_change_minor": 10517
      }
    }
  ],
  "total": {
    "trips": 8,
    "fares_minor": 101476,
    "service_rides_minor": 0,
    "commission_minor": 15225,
    "driver_share_minor": 86251,
    "discounts_minor": 1052,
    "bonuses_granted_minor": 0,
    "paid_by_card_minor": 32594,
    "paid_with_bonuses_minor": 18297,
    "collected_by_drivers_minor": 39016,
    "tips_minor": 5000,
    "rider_debt_change_minor": 10517
  },
  "generated_at": "2026-10-30T19:09:52.016469529Z"
}
```

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "OPERATOR",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "dd8413a1-e2d8-45f4-a0a9-a9fb78e1f6be",
  "subject": {
    "type": "STAFF",
    "id": "50e6407f-123d-42ca-9890-64ec61c07dce"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MGU2NDA3Zi0xMjNkLTQyY2EtOTg5MC02NGVjNjFjMDdkY2UiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODgyOTIsImlhdCI6MTc5MzM4NzM5MiwianRpIjoiYmY0MDc5YzItOGY5ZC00NGVjLTg5ZjktN2NiMzc0MGM4MjhlIiwic2lkIjoiZGQ4NDEzYTEtZTJkOC00NWY0LWEwYTktYTlmYjc4ZTFmNmJlIn0.9I_tNUKwYNB8z1rDFtvM0ruCXRuByg3hue3ogPqGw4I",
  "access_expires_at": "2026-10-30T19:24:52.5180761Z",
  "refresh_token": "Fly-er4frSVwzoLCdqpum9BG1QtVQjYDAITU45OZQEI",
  "refresh_expires_at": "2026-10-31T07:09:52.517582514Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/fcef5b7e-4624-4a78-a95f-d10d7fdd6dae/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T19:08:53.705774Z",
      "actor": {
        "type": "CLIENT",
        "id": "682ae454-5379-4a11-8fd9-fde0037f04db",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "fcef5b7e-4624-4a78-a95f-d10d7fdd6dae",
        "quote_id": "8cbd5ce6-a8b8-46d2-9206-19a4a2b1feab",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "c184337a-50dd-400d-8184-c8387edaf195"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T19:08:53.70739Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "fcef5b7e-4624-4a78-a95f-d10d7fdd6dae",
        "attempt_id": "22edaf5d-01a1-4888-a8bd-fedc3168396a",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "c184337a-50dd-400d-8184-c8387edaf195"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T19:08:53.728735Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "b69b2764-7ec9-484c-a487-cdf36a8d5ef7",
        "order_id": "fcef5b7e-4624-4a78-a95f-d10d7fdd6dae",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "c184337a-50dd-400d-8184-c8387edaf195"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T19:08:54.32907Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "b69b2764-7ec9-484c-a487-cdf36a8d5ef7",
        "order_id": "fcef5b7e-4624-4a78-a95f-d10d7fdd6dae",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "9cfa1251-11e9-4eb8-9cd3-e67e3c2091de"
      },
      "correlation_id": "b9781344-5d7d-4c29-bb9e-9faee4056418"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-30T19:09:53.013034274Z",
  "drivers": [
    {
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "name": "Андрій Шевчук",
      "car": {
        "registration_number": "AA0003TX",
        "make": "Hyundai",
        "model": "Sonata",
        "color": "black",
        "classes": [
          "STANDARD",
          "COMFORT"
        ]
      },
      "has_payment_terminal": false,
      "status": "ON_ORDER",
      "occupancy": "ON_TRIP",
      "connection": "DISCONNECTED",
      "geolocation": "STALE",
      "location": {
        "lat": 50.4503,
        "lon": 30.5234
      },
      "last_location_at": "2026-10-30T19:08:42.209307Z",
      "last_heartbeat_at": "2026-10-30T19:08:42.209307Z",
      "order_id": "47ec944b-04ac-4604-9e71-2819147e24f0"
    },
    {
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "name": "Іван Петренко",
      "car": {
        "registration_number": "AA0001TX",
        "make": "Skoda",
        "model": "Octavia",
        "color": "white",
        "classes": [
          "STANDARD",
          "COMFORT"
        ]
      },
      "has_payment_terminal": false,
      "status": "FREE",
      "occupancy": "FREE",
      "connection": "CONNECTED",
      "geolocation": "FRESH",
      "location": {
        "lat": 50.4405,
        "lon": 30.489
      },
      "last_location_at": "2026-10-30T19:09:45.964187Z",
      "last_heartbeat_at": "2026-10-30T19:09:45.964187Z",
      "order_id": null
    }
  ]
}
```

Done: order fcef5b7e-4624-4a78-a95f-d10d7fdd6dae.

# Scenario: incoming-call

## The admin says which city the service number belongs to

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "623e3d1e-8f5a-4147-aef4-1667dd0e779d",
  "subject": {
    "type": "STAFF",
    "id": "50e6407f-123d-42ca-9890-64ec61c07dce"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MGU2NDA3Zi0xMjNkLTQyY2EtOTg5MC02NGVjNjFjMDdkY2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODgyOTMsImlhdCI6MTc5MzM4NzM5MywianRpIjoiMDRlNTMyNzEtNzNmZS00NThjLWJmNTYtMjY1N2MxNjFiZWIwIiwic2lkIjoiNjIzZTNkMWUtOGY1YS00MTQ3LWFlZjQtMTY2N2RkMGU3NzlkIn0.RRbBCNsAqRDIUDqm9mWzEPD-o08ZIfRm9dX1ULcv7Lo",
  "access_expires_at": "2026-10-30T19:24:53.534594939Z",
  "refresh_token": "1_AHrlJJjJjv74Lo4di0U20j8ldUlGK4uDKMikd5naI",
  "refresh_expires_at": "2026-10-31T07:09:53.534062584Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/call-lines` → **200**

```json
{
  "lines": [
    {
      "number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "label": "Kyiv call centre",
      "version": 1
    }
  ]
}
```

`POST /api/admin/v1/call-lines/%2B380441110064` → **200**

```json
{
  "command_id": "1cca1baf-ebd2-4bbe-88fe-5cae0842bf97",
  "expected_version": 0,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "label": "Kyiv call centre",
  "reason": "Sandbox incoming-call scenario"
}
```

```json
{
  "number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "label": "Kyiv call centre",
  "version": 1
}
```

## A call comes in; Asterisk reports it twice — one call in the log

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "timestamp": "2026-10-30T19:09:54.000+0000",
  "channel": {
    "id": "1730052000.114601278",
    "linkedid": "1730052000.114601278",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380676476152"
    },
    "dialplan": {
      "context": "from-trunk",
      "exten": "380441110064"
    }
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "timestamp": "2026-10-30T19:09:54.000+0000",
  "channel": {
    "id": "1730052000.114601278",
    "linkedid": "1730052000.114601278",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380676476152"
    },
    "dialplan": {
      "context": "from-trunk",
      "exten": "380441110064"
    }
  }
}
```

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "OPERATOR",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "d80b6188-3cdf-47a8-a4cd-62a6f1176faf",
  "subject": {
    "type": "STAFF",
    "id": "50e6407f-123d-42ca-9890-64ec61c07dce"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MGU2NDA3Zi0xMjNkLTQyY2EtOTg5MC02NGVjNjFjMDdkY2UiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODgyOTQsImlhdCI6MTc5MzM4NzM5NCwianRpIjoiNWE4ODg3ZGEtZTcxZS00NGYyLWI0ZDMtZTg3MGNlNjY4NzViIiwic2lkIjoiZDgwYjYxODgtM2NkZi00N2E4LWE0Y2QtNjJhNmYxMTc2ZmFmIn0.zpc2JztHBPPpznU-FXv7gERyCIIhDV1gWrV8LSwe5XQ",
  "access_expires_at": "2026-10-30T19:24:54.569054619Z",
  "refresh_token": "VasZc7z5ejj-9gEJTkjWk3J0nqkEeZVkfKldld42ct8",
  "refresh_expires_at": "2026-10-31T07:09:54.568369604Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "20c2c7d1-c03c-4e1e-93ef-d8daeb7fa06c",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380676476152",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T19:09:54Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
```

## The operator takes the call

`POST /api/operator/v1/calls/20c2c7d1-c03c-4e1e-93ef-d8daeb7fa06c/answer` → **200**

```json
{
  "command_id": "5311d412-bd74-4991-87a5-d23081f34e9a"
}
```

```json
{
  "id": "20c2c7d1-c03c-4e1e-93ef-d8daeb7fa06c",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380676476152",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "50e6407f-123d-42ca-9890-64ec61c07dce",
  "order_ids": [],
  "started_at": "2026-10-30T19:09:54Z",
  "answered_at": "2026-10-30T19:09:55.060787Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.114601278",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "478a78c9-c7ba-4fcc-81ab-7ad095a69db3",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  }
}
```

```json
{
  "id": "35f78e9a-2d94-4b5e-a5a1-25d1ace7d395",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T19:14:55.333435Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false,
  "discount_minor": 0,
  "to_pay_minor": 10517,
  "promotions": []
}
```

`POST /api/operator/v1/orders` → **201**

```json
{
  "command_id": "4d171977-b3cc-4527-afb2-dcf18c4e7c84",
  "quote_id": "35f78e9a-2d94-4b5e-a5a1-25d1ace7d395",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "caller": {
    "name": "Caller",
    "phone": "+380676476152"
  },
  "call_id": "20c2c7d1-c03c-4e1e-93ef-d8daeb7fa06c"
}
```

```json
{
  "id": "16ed0257-6e2b-48a2-8be4-1656f8041568",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "PHONE",
  "payer_client_id": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "PERSONAL",
  "assignment": null,
  "created_at": "2026-10-30T19:09:55.584029Z",
  "caller": {
    "name": "Caller",
    "phone": "+380676476152"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The caller hangs up: the call is over, the order is not

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "1730052000.114601278",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "20c2c7d1-c03c-4e1e-93ef-d8daeb7fa06c",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380676476152",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "50e6407f-123d-42ca-9890-64ec61c07dce",
      "order_ids": [
        "16ed0257-6e2b-48a2-8be4-1656f8041568"
      ],
      "started_at": "2026-10-30T19:09:54Z",
      "answered_at": "2026-10-30T19:09:55.060787Z",
      "ended_at": "2026-10-30T19:09:55.892964Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "cf5faf0c-6553-42ab-bbf0-dc41632470a7",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672580464",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "50e6407f-123d-42ca-9890-64ec61c07dce",
      "order_ids": [],
      "started_at": "2026-10-30T19:03:11.68747Z",
      "answered_at": "2026-10-30T19:03:11.960505Z",
      "ended_at": "2026-10-30T19:03:12.241342Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T19:03:18.130659Z"
      }
    }
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
```

`GET /api/operator/v1/orders/16ed0257-6e2b-48a2-8be4-1656f8041568` → **200**

```json
{
  "id": "16ed0257-6e2b-48a2-8be4-1656f8041568",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "PHONE",
  "payer_client_id": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "PERSONAL",
  "assignment": null,
  "created_at": "2026-10-30T19:09:55.584029Z",
  "caller": {
    "name": "Caller",
    "phone": "+380676476152"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/16ed0257-6e2b-48a2-8be4-1656f8041568` → **200**

```json
{
  "id": "16ed0257-6e2b-48a2-8be4-1656f8041568",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "PHONE",
  "payer_client_id": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "PERSONAL",
  "assignment": null,
  "created_at": "2026-10-30T19:09:55.584029Z",
  "caller": {
    "name": "Caller",
    "phone": "+380676476152"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/16ed0257-6e2b-48a2-8be4-1656f8041568/cancel` → **200**

```json
{
  "command_id": "1ed1351a-cbe7-4419-891f-778784726e32",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "16ed0257-6e2b-48a2-8be4-1656f8041568",
  "short_number": 17,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 3,
  "channel": "PHONE",
  "payer_client_id": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "STOPPED",
  "assignment": null,
  "created_at": "2026-10-30T19:09:55.584029Z",
  "caller": {
    "name": "Caller",
    "phone": "+380676476152"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "pl": "Brak wolnych aut",
      "uk": "Немає вільних авто",
      "en": "No cars available",
      "ru": "Нет свободных машин"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

Done: call 20c2c7d1-c03c-4e1e-93ef-d8daeb7fa06c with order 16ed0257-6e2b-48a2-8be4-1656f8041568.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-8192"
}
```

```json
{
  "challenge_id": "80875410-dd82-4fd7-a267-13d848ca5803",
  "expires_at": "2026-10-30T19:14:56.988270577Z",
  "resend_available_at": "2026-10-30T19:09:57.988270577Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "924660",
  "sent_at": "2026-10-30T19:09:57.306031036Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "80875410-dd82-4fd7-a267-13d848ca5803",
  "code": "924660",
  "device_ref": "sandbox-8192"
}
```

```json
{
  "session_id": "10fda77a-41bf-4553-9b49-cc9cf4ad1596",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4ODI5NywiaWF0IjoxNzkzMzg3Mzk3LCJqdGkiOiJlYmQ2Y2NlMi1kNjc0LTQ3ZGEtYjE5OC1hMWJhZmI0NTczYmEiLCJzaWQiOiIxMGZkYTc3YS00MWJmLTQ1NTMtOWI0OS1jYzljZjRhZDE1OTYifQ.UuJcH8iQVvhbbR_yru1ndIm9GQRGseXQoJjoQAUnRtY",
  "access_expires_at": "2026-10-30T19:24:57.643141078Z",
  "refresh_token": "_0WqI-UiXGiAgryVtOpT7vLlcySntSv-qcKpT5Tbxl0",
  "refresh_expires_at": "2026-11-29T19:09:57.641876096Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3b496cf5-f813-48eb-829e-b7261aa76999",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T19:09:45.964187Z",
  "last_location_at": "2026-10-30T19:09:45.964187Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3b496cf5-f813-48eb-829e-b7261aa76999/handover` → **200**

```json
{
  "command_id": "a9604f9b-f381-4032-8339-721f6cf11464",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3b496cf5-f813-48eb-829e-b7261aa76999",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T19:09:45.964187Z",
  "last_location_at": "2026-10-30T19:09:45.964187Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

(the car drives 86 s to the next point)

`POST /api/driver/v1/work-sessions/3b496cf5-f813-48eb-829e-b7261aa76999/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:11:24Z",
    "sequence": 1793387484398
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3b496cf5-f813-48eb-829e-b7261aa76999",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T19:11:24.417496Z",
  "last_location_at": "2026-10-30T19:11:24.417496Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380665547198",
  "device_ref": "sandbox-12698"
}
```

```json
{
  "challenge_id": "54ce2e5f-9a90-4d32-bd53-dbf5e24150c4",
  "expires_at": "2026-10-30T19:16:24.683190923Z",
  "resend_available_at": "2026-10-30T19:11:25.683190923Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380665547198` → **200**

```json
{
  "phone": "+380665547198",
  "audience": "CLIENT",
  "code": "083496",
  "sent_at": "2026-10-30T19:11:24.685329589Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "54ce2e5f-9a90-4d32-bd53-dbf5e24150c4",
  "code": "083496",
  "device_ref": "sandbox-12698"
}
```

```json
{
  "session_id": "39254eaf-be2b-42f3-8003-92e5c6503967",
  "subject": {
    "type": "CLIENT",
    "id": "c272b027-d822-4388-b3c7-4ccf7d68ea59"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMjcyYjAyNy1kODIyLTQzODgtYjNjNy00Y2NmN2Q2OGVhNTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzg4Mzg0LCJpYXQiOjE3OTMzODc0ODQsImp0aSI6IjYzNjI0YmQyLWRlNTItNDUxZC1hODg4LTQ0NzlmYzU2N2NmNiIsInNpZCI6IjM5MjU0ZWFmLWJlMmItNDJmMy04MDAzLTkyZTVjNjUwMzk2NyJ9.LhH5kGRLsVi67GYQNa2gx1gscLnjI45CBnZh0yiV4bk",
  "access_expires_at": "2026-10-30T19:26:24.953799091Z",
  "refresh_token": "2e78AyH9clYgTdhtPQkb1cc_i36rvEaknNeS-TCaC_Q",
  "refresh_expires_at": "2026-11-29T19:11:24.953216734Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d2436f27-83d5-46d9-98c5-4b129a1b9d0f",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4268,
    "lon": 30.5636
  },
  "dropoff": {
    "lat": 50.3906,
    "lon": 30.4825
  }
}
```

```json
{
  "id": "90a16af7-a2f9-4012-85b1-65f5aefcaf5d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T19:16:25.203019Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false,
  "discount_minor": 0,
  "to_pay_minor": 21185,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "615cb3ef-4737-4364-bde4-cee4399436b1",
  "quote_id": "90a16af7-a2f9-4012-85b1-65f5aefcaf5d",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4268,
    "lon": 30.5636
  },
  "pickup_label": "Палац спорту",
  "dropoff": {
    "lat": 50.3906,
    "lon": 30.4825
  },
  "dropoff_label": "Голосіїв",
  "payment_method": "CASH"
}
```

```json
{
  "id": "3dfc3b36-c4c8-4e96-9358-0eec7f11ef32",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c272b027-d822-4388-b3c7-4ccf7d68ea59",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4268,
    "lon": 30.5636
  },
  "pickup_label": "Палац спорту",
  "dropoff": {
    "lat": 50.3906,
    "lon": 30.4825
  },
  "dropoff_label": "Голосіїв",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 21185,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "PERSONAL",
  "assignment": null,
  "created_at": "2026-10-30T19:11:25.461875Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "df581d7a-f609-4e79-929f-1e2aabb18511",
    "order_id": "3dfc3b36-c4c8-4e96-9358-0eec7f11ef32",
    "expires_at": "2026-10-30T19:11:40.464522Z",
    "vehicle_class": "STANDARD",
    "pickup": {
      "lat": 50.4268,
      "lon": 30.5636
    },
    "pickup_label": "Палац спорту",
    "dropoff_label": "Голосіїв",
    "payment_method": "CASH",
    "price_minor": 21185,
    "currency": "UAH",
    "distance_m": 78
  }
]
```

`POST /api/driver/v1/offers/df581d7a-f609-4e79-929f-1e2aabb18511/accept` → **200**

```json
{
  "command_id": "ec157554-bbd1-476e-a1a1-a0ef2d1e7829"
}
```

```json
{
  "id": "dd37fa78-7d7b-4e9f-96c1-4e849b825ca2",
  "order_id": "3dfc3b36-c4c8-4e96-9358-0eec7f11ef32",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "9bfd4986-8cc7-4d0c-b9ec-a9ec59743dd0",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9bfd4986-8cc7-4d0c-b9ec-a9ec59743dd0",
  "order_id": "3dfc3b36-c4c8-4e96-9358-0eec7f11ef32",
  "assignment_id": "dd37fa78-7d7b-4e9f-96c1-4e849b825ca2",
  "phase": "TO_PICKUP",
  "version": 0,
  "pickup": {
    "lat": 50.4268,
    "lon": 30.5636
  },
  "pickup_label": "Палац спорту",
  "dropoff": {
    "lat": 50.3906,
    "lon": 30.4825
  },
  "dropoff_label": "Голосіїв",
  "payment_method": "CASH",
  "price_minor": 21185,
  "currency": "UAH",
  "arrived_at": null,
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/3b496cf5-f813-48eb-829e-b7261aa76999/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:11:26Z",
    "sequence": 1793387486493
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3b496cf5-f813-48eb-829e-b7261aa76999",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T19:11:26.510588Z",
  "last_location_at": "2026-10-30T19:11:26.510588Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/9bfd4986-8cc7-4d0c-b9ec-a9ec59743dd0/arrive` → **200**

```json
{
  "command_id": "325120e4-bbce-4568-8a54-e6b18a5f7863",
  "expected_version": 0
}
```

```json
{
  "id": "9bfd4986-8cc7-4d0c-b9ec-a9ec59743dd0",
  "order_id": "3dfc3b36-c4c8-4e96-9358-0eec7f11ef32",
  "assignment_id": "dd37fa78-7d7b-4e9f-96c1-4e849b825ca2",
  "phase": "WAITING",
  "version": 1,
  "pickup": {
    "lat": 50.4268,
    "lon": 30.5636
  },
  "pickup_label": "Палац спорту",
  "dropoff": {
    "lat": 50.3906,
    "lon": 30.4825
  },
  "dropoff_label": "Голосіїв",
  "payment_method": "CASH",
  "price_minor": 21185,
  "currency": "UAH",
  "arrived_at": "2026-10-30T19:11:26.755332Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/9bfd4986-8cc7-4d0c-b9ec-a9ec59743dd0/start` → **200**

```json
{
  "command_id": "2c378106-4c77-45d9-88e5-3e0427023e1f",
  "expected_version": 1
}
```

```json
{
  "id": "9bfd4986-8cc7-4d0c-b9ec-a9ec59743dd0",
  "order_id": "3dfc3b36-c4c8-4e96-9358-0eec7f11ef32",
  "assignment_id": "dd37fa78-7d7b-4e9f-96c1-4e849b825ca2",
  "phase": "IN_PROGRESS",
  "version": 2,
  "pickup": {
    "lat": 50.4268,
    "lon": 30.5636
  },
  "pickup_label": "Палац спорту",
  "dropoff": {
    "lat": 50.3906,
    "lon": 30.4825
  },
  "dropoff_label": "Голосіїв",
  "payment_method": "CASH",
  "price_minor": 21185,
  "currency": "UAH",
  "arrived_at": "2026-10-30T19:11:26.755332Z",
  "started_at": "2026-10-30T19:11:27.007225Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

(the car drives 59 s to the next point)

`POST /api/driver/v1/work-sessions/3b496cf5-f813-48eb-829e-b7261aa76999/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:12:26Z",
    "sequence": 1793387546281
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3b496cf5-f813-48eb-829e-b7261aa76999",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "ON_TRIP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T19:12:26.300066Z",
  "last_location_at": "2026-10-30T19:12:26.300066Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-21494"
}
```

```json
{
  "challenge_id": "1bf1ffaa-ebb1-43da-822a-86c24e3ace8c",
  "expires_at": "2026-10-30T19:17:26.546540085Z",
  "resend_available_at": "2026-10-30T19:12:27.546540085Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "526062",
  "sent_at": "2026-10-30T19:12:26.60646531Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1bf1ffaa-ebb1-43da-822a-86c24e3ace8c",
  "code": "526062",
  "device_ref": "sandbox-21494"
}
```

```json
{
  "session_id": "bbe84e72-a877-4be4-b495-db760248f3db",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4ODQ0NiwiaWF0IjoxNzkzMzg3NTQ2LCJqdGkiOiJmN2FkYzBlNS1iYzVmLTQzMWQtYjY3NS1kZmZiMTZkNDBkMDEiLCJzaWQiOiJiYmU4NGU3Mi1hODc3LTRiZTQtYjQ5NS1kYjc2MDI0OGYzZGIifQ.CIXBeILG8zhTxSqZjgPxMrGlrvZj7WYgG0fBNQyljkc",
  "access_expires_at": "2026-10-30T19:27:26.879520334Z",
  "refresh_token": "zdhv6cxGfnbERQRcjCpByxD_9nHW2YyTpVXCuTC0xx0",
  "refresh_expires_at": "2026-11-29T19:12:26.879039884Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": null,
  "session_version": 0,
  "session_state": "CLOSED",
  "intent": null,
  "connection": "DISCONNECTED",
  "geolocation": "UNAVAILABLE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": null,
  "vehicle_id": null,
  "last_heartbeat_at": null,
  "last_location_at": null,
  "eligible": false,
  "ineligible_reasons": [
    "NO_OPEN_SESSION"
  ]
}
```

`POST /api/driver/v1/work-sessions` → **201**

```json
{
  "command_id": "25d20438-8717-44ea-8c7f-426ae275835d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:12:27Z",
    "sequence": 1793387547396
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "fe47cdab-e35e-4c3d-a847-09648c302b5c",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "last_heartbeat_at": "2026-10-30T19:12:27.416719Z",
  "last_location_at": "2026-10-30T19:12:27.416719Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The operator interrupts: «Поломка автомобиля в пути», follow-up on the service

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "0065f78f-4743-4196-b986-f0704bf2cc33",
  "subject": {
    "type": "STAFF",
    "id": "50e6407f-123d-42ca-9890-64ec61c07dce"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MGU2NDA3Zi0xMjNkLTQyY2EtOTg5MC02NGVjNjFjMDdkY2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODg0NDcsImlhdCI6MTc5MzM4NzU0NywianRpIjoiMGQ3MjkxMTQtNzYyNS00Y2YwLThmMWYtYTUwNjY3MzBiZWQ1Iiwic2lkIjoiMDA2NWY3OGYtNDc0My00MTk2LWI5ODYtZjA3MDRiZjJjYzMzIn0.Jxh6P37P3qgfD_tufhvZeoaU4KQX9-HzXSTLRAo_ecs",
  "access_expires_at": "2026-10-30T19:27:27.931403638Z",
  "refresh_token": "3dTXtvz_w2_jWHCv-1QV3MZJGHV6e2PmRRAnB58cDQ8",
  "refresh_expires_at": "2026-10-31T07:12:27.930953934Z",
  "password_change_required": false
}
```

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "OPERATOR",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "127e7daa-6303-4998-90b7-e931137180fa",
  "subject": {
    "type": "STAFF",
    "id": "50e6407f-123d-42ca-9890-64ec61c07dce"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MGU2NDA3Zi0xMjNkLTQyY2EtOTg5MC02NGVjNjFjMDdkY2UiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODg0NDgsImlhdCI6MTc5MzM4NzU0OCwianRpIjoiZWU1Mzc1OGUtZDAwZi00MzA4LWIyMDQtZDQyYjgyN2E5ZmEzIiwic2lkIjoiMTI3ZTdkYWEtNjMwMy00OTk4LTkwYjctZTkzMTEzNzE4MGZhIn0.XiAn_F_lBpZBy3S_zyCMUoqs5ozOJqqtb_pNrpjpX8E",
  "access_expires_at": "2026-10-30T19:27:28.440935365Z",
  "refresh_token": "9fog0ozybihOipGwH7v0GjS_XlQbTB2AgR0M-BCQ51w",
  "refresh_expires_at": "2026-10-31T07:12:28.440453653Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/3dfc3b36-c4c8-4e96-9358-0eec7f11ef32` → **200**

```json
{
  "id": "3dfc3b36-c4c8-4e96-9358-0eec7f11ef32",
  "short_number": 18,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "c272b027-d822-4388-b3c7-4ccf7d68ea59",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4268,
    "lon": 30.5636
  },
  "pickup_label": "Палац спорту",
  "dropoff": {
    "lat": 50.3906,
    "lon": 30.4825
  },
  "dropoff_label": "Голосіїв",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 21185,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "STOPPED",
  "assignment": {
    "id": "dd37fa78-7d7b-4e9f-96c1-4e849b825ca2",
    "order_id": "3dfc3b36-c4c8-4e96-9358-0eec7f11ef32",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "9bfd4986-8cc7-4d0c-b9ec-a9ec59743dd0",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-30T19:11:25.461875Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/3dfc3b36-c4c8-4e96-9358-0eec7f11ef32/interrupt` → **200**

```json
{
  "command_id": "b4e31ed9-cfc5-45ff-aa2c-28a094a032a1",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "3dfc3b36-c4c8-4e96-9358-0eec7f11ef32",
    "short_number": 18,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "c272b027-d822-4388-b3c7-4ccf7d68ea59",
    "city_id": "5a000000-0000-4000-8000-000000000001",
    "vehicle_class": "STANDARD",
    "pickup": {
      "lat": 50.4268,
      "lon": 30.5636
    },
    "pickup_label": "Палац спорту",
    "dropoff": {
      "lat": 50.3906,
      "lon": 30.4825
    },
    "dropoff_label": "Голосіїв",
    "payment_method": "CASH",
    "payment_state": "CASH_EXPECTED",
    "price_minor": 21185,
    "final_price_minor": null,
    "currency": "UAH",
    "search_phase": "STOPPED",
    "assignment": {
      "id": "dd37fa78-7d7b-4e9f-96c1-4e849b825ca2",
      "order_id": "3dfc3b36-c4c8-4e96-9358-0eec7f11ef32",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "9bfd4986-8cc7-4d0c-b9ec-a9ec59743dd0",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-30T19:11:25.461875Z",
    "caller": null,
    "cancellation": {
      "by": "STAFF",
      "reason_code": "VEHICLE_BREAKDOWN",
      "reason_labels": {
        "pl": "Awaria auta w trasie",
        "uk": "Поломка автомобіля в дорозі",
        "en": "Vehicle broke down on the way",
        "ru": "Поломка автомобиля в пути"
      }
    },
    "pickup_at": null,
    "preorder": false,
    "reservation": null,
    "related_order_id": null
  },
  "follow_up": {
    "id": "bbaaf268-7dd7-4bd9-b9f4-6c79afa9204c",
    "short_number": 19,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "c272b027-d822-4388-b3c7-4ccf7d68ea59",
    "city_id": "5a000000-0000-4000-8000-000000000001",
    "vehicle_class": "STANDARD",
    "pickup": {
      "lat": 50.41,
      "lon": 30.525
    },
    "pickup_label": "Where the previous car stopped",
    "dropoff": {
      "lat": 50.3906,
      "lon": 30.4825
    },
    "dropoff_label": "Голосіїв",
    "payment_method": "SERVICE",
    "payment_state": null,
    "price_minor": 13074,
    "final_price_minor": null,
    "currency": "UAH",
    "search_phase": "PERSONAL",
```

## Oleh takes the follow-up and finishes; the rider sees both orders

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "c02a33e1-d036-4e6a-bfd5-1298bb0e791c",
    "order_id": "bbaaf268-7dd7-4bd9-b9f4-6c79afa9204c",
    "expires_at": "2026-10-30T19:12:43.964828Z",
    "vehicle_class": "STANDARD",
    "pickup": {
      "lat": 50.41,
      "lon": 30.525
    },
    "pickup_label": "Where the previous car stopped",
    "dropoff_label": "Голосіїв",
    "payment_method": "SERVICE",
    "price_minor": 13074,
    "currency": "UAH",
    "distance_m": 56
  }
]
```

`POST /api/driver/v1/offers/c02a33e1-d036-4e6a-bfd5-1298bb0e791c/accept` → **200**

```json
{
  "command_id": "88009ffa-c7a8-4c4b-ace3-62e85acbfc7d"
}
```

```json
{
  "id": "9eaa7366-8a2a-47e9-80b5-b84dee3f383a",
  "order_id": "bbaaf268-7dd7-4bd9-b9f4-6c79afa9204c",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c9800ddc-73a7-4c87-b74a-e1058b1bc16a",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c9800ddc-73a7-4c87-b74a-e1058b1bc16a",
  "order_id": "bbaaf268-7dd7-4bd9-b9f4-6c79afa9204c",
  "assignment_id": "9eaa7366-8a2a-47e9-80b5-b84dee3f383a",
  "phase": "TO_PICKUP",
  "version": 0,
  "pickup": {
    "lat": 50.41,
    "lon": 30.525
  },
  "pickup_label": "Where the previous car stopped",
  "dropoff": {
    "lat": 50.3906,
    "lon": 30.4825
  },
  "dropoff_label": "Голосіїв",
  "payment_method": "SERVICE",
  "price_minor": 13074,
  "currency": "UAH",
  "arrived_at": null,
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "fe47cdab-e35e-4c3d-a847-09648c302b5c",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "last_heartbeat_at": "2026-10-30T19:12:27.416719Z",
  "last_location_at": "2026-10-30T19:12:27.416719Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/fe47cdab-e35e-4c3d-a847-09648c302b5c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:12:30Z",
    "sequence": 1793387550269
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "fe47cdab-e35e-4c3d-a847-09648c302b5c",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "last_heartbeat_at": "2026-10-30T19:12:30.287339Z",
  "last_location_at": "2026-10-30T19:12:30.287339Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/c9800ddc-73a7-4c87-b74a-e1058b1bc16a/arrive` → **200**

```json
{
  "command_id": "7de83b58-8fc1-424d-aed2-fffbd412e53b",
  "expected_version": 0
}
```

```json
{
  "id": "c9800ddc-73a7-4c87-b74a-e1058b1bc16a",
  "order_id": "bbaaf268-7dd7-4bd9-b9f4-6c79afa9204c",
  "assignment_id": "9eaa7366-8a2a-47e9-80b5-b84dee3f383a",
  "phase": "WAITING",
  "version": 1,
  "pickup": {
    "lat": 50.41,
    "lon": 30.525
  },
  "pickup_label": "Where the previous car stopped",
  "dropoff": {
    "lat": 50.3906,
    "lon": 30.4825
  },
  "dropoff_label": "Голосіїв",
  "payment_method": "SERVICE",
  "price_minor": 13074,
  "currency": "UAH",
  "arrived_at": "2026-10-30T19:12:30.539003Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/c9800ddc-73a7-4c87-b74a-e1058b1bc16a/start` → **200**

```json
{
  "command_id": "0d715e52-59f9-4d9d-90c2-216154a1f952",
  "expected_version": 1
}
```

```json
{
  "id": "c9800ddc-73a7-4c87-b74a-e1058b1bc16a",
  "order_id": "bbaaf268-7dd7-4bd9-b9f4-6c79afa9204c",
  "assignment_id": "9eaa7366-8a2a-47e9-80b5-b84dee3f383a",
  "phase": "IN_PROGRESS",
  "version": 2,
  "pickup": {
    "lat": 50.41,
    "lon": 30.525
  },
  "pickup_label": "Where the previous car stopped",
  "dropoff": {
    "lat": 50.3906,
    "lon": 30.4825
  },
  "dropoff_label": "Голосіїв",
  "payment_method": "SERVICE",
  "price_minor": 13074,
  "currency": "UAH",
  "arrived_at": "2026-10-30T19:12:30.539003Z",
  "started_at": "2026-10-30T19:12:30.797526Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/c9800ddc-73a7-4c87-b74a-e1058b1bc16a/complete` → **200**

```json
{
  "command_id": "0b34ec2d-6eb1-49b1-9d72-281a1ed997a3",
  "expected_version": 2,
  "reported_at": "2026-10-30T19:12:31Z"
}
```

```json
{
  "id": "c9800ddc-73a7-4c87-b74a-e1058b1bc16a",
  "order_id": "bbaaf268-7dd7-4bd9-b9f4-6c79afa9204c",
  "assignment_id": "9eaa7366-8a2a-47e9-80b5-b84dee3f383a",
  "phase": "COMPLETED",
  "version": 3,
  "pickup": {
    "lat": 50.41,
    "lon": 30.525
  },
  "pickup_label": "Where the previous car stopped",
  "dropoff": {
    "lat": 50.3906,
    "lon": 30.4825
  },
  "dropoff_label": "Голосіїв",
  "payment_method": "SERVICE",
  "price_minor": 13074,
  "currency": "UAH",
  "arrived_at": "2026-10-30T19:12:30.539003Z",
  "started_at": "2026-10-30T19:12:30.797526Z",
  "completed_at": "2026-10-30T19:12:31.070316Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/rider/v1/orders` → **200**

```json
{
  "items": [
    {
      "id": "bbaaf268-7dd7-4bd9-b9f4-6c79afa9204c",
      "short_number": 19,
      "status": "FULFILLED",
      "created_at": "2026-10-30T19:12:28.955957Z",
      "pickup_label": "Where the previous car stopped",
      "dropoff_label": "Голосіїв",
      "vehicle_class": "STANDARD",
      "price_minor": 13074,
      "final_price_minor": 13074,
      "currency": "UAH",
      "payment_method": "SERVICE",
      "driver": {
        "name": "Олег Коваль",
        "vehicle": {
          "make": "Toyota",
          "model": "Corolla",
          "color": "grey",
          "registration_number": "AA0002TX"
        }
      },
      "chat_available": true,
      "cancellation": null,
      "pickup_at": null
    },
    {
      "id": "3dfc3b36-c4c8-4e96-9358-0eec7f11ef32",
      "short_number": 18,
      "status": "CANCELLED",
      "created_at": "2026-10-30T19:11:25.461875Z",
      "pickup_label": "Палац спорту",
      "dropoff_label": "Голосіїв",
      "vehicle_class": "STANDARD",
      "price_minor": 21185,
      "final_price_minor": null,
      "currency": "UAH",
      "payment_method": "CASH",
      "driver": {
        "name": "Іван Петренко",
        "vehicle": {
          "make": "Skoda",
          "model": "Octavia",
          "color": "white",
          "registration_number": "AA0001TX"
        }
      },
      "chat_available": true,
      "cancellation": {
        "by": "STAFF",
        "reason_code": "VEHICLE_BREAKDOWN",
        "reason_labels": {
          "pl": "Awaria auta w trasie",
          "uk": "Поломка автомобіля в дорозі",
          "en": "Vehicle broke down on the way",
          "ru": "Поломка автомобиля в пути"
        }
      },
      "pickup_at": null
    }
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
```

`GET /api/driver/v1/balance` → **200**

```json
{
  "balances": [
    {
      "currency": "UAH",
      "balance_minor": 61113,
      "debt_limit_minor": null,
      "blocked": false
    }
  ]
}
```

`GET /api/operator/v1/orders/3dfc3b36-c4c8-4e96-9358-0eec7f11ef32/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T19:11:25.462309Z",
      "actor": {
        "type": "CLIENT",
        "id": "c272b027-d822-4388-b3c7-4ccf7d68ea59",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "3dfc3b36-c4c8-4e96-9358-0eec7f11ef32",
        "quote_id": "90a16af7-a2f9-4012-85b1-65f5aefcaf5d",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "51a363c8-c91d-45b7-9ea0-e42308f210f5"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T19:11:25.463846Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "3dfc3b36-c4c8-4e96-9358-0eec7f11ef32",
        "attempt_id": "ae68cfb0-d6b0-42ad-a2d5-774a726f880f",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "51a363c8-c91d-45b7-9ea0-e42308f210f5"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T19:11:25.486147Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "df581d7a-f609-4e79-929f-1e2aabb18511",
        "order_id": "3dfc3b36-c4c8-4e96-9358-0eec7f11ef32",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "51a363c8-c91d-45b7-9ea0-e42308f210f5"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T19:11:26.005275Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "df581d7a-f609-4e79-929f-1e2aabb18511",
        "order_id": "3dfc3b36-c4c8-4e96-9358-0eec7f11ef32",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "dd37fa78-7d7b-4e9f-96c1-4e849b825ca2"
      },
      "correlation_id": "6dd046b8-2a05-48f2-8472-fc21f2ac1d98"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/bbaaf268-7dd7-4bd9-b9f4-6c79afa9204c/tip` → **200**

```json
{
  "order_id": "bbaaf268-7dd7-4bd9-b9f4-6c79afa9204c",
  "currency": "UAH",
  "trip_cost_minor": 13074,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1400
    },
    {
      "percent": 15,
      "amount_minor": 2000
    },
    {
      "percent": 20,
      "amount_minor": 2700
    },
    {
      "percent": 25,
      "amount_minor": 3300
    }
  ],
  "min_minor": 100,
  "max_minor": 13100,
  "method": null,
  "available_until": "2026-10-31T19:12:31.070316Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/bbaaf268-7dd7-4bd9-b9f4-6c79afa9204c/tip` → **409**

```json
{
  "command_id": "e41fa64e-5d72-4798-80cf-7e943cdac74a",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/bbaaf268-7dd7-4bd9-b9f4-6c79afa9204c/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "792d7f20-816a-45bc-ac78-5eb0c82b82b8"
}
```

Done: interrupted 3dfc3b36-c4c8-4e96-9358-0eec7f11ef32, follow-up bbaaf268-7dd7-4bd9-b9f4-6c79afa9204c.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3b496cf5-f813-48eb-829e-b7261aa76999",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T19:12:26.300066Z",
  "last_location_at": "2026-10-30T19:12:26.300066Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3b496cf5-f813-48eb-829e-b7261aa76999/close` → **200**

```json
{
  "command_id": "3bcc03b9-4b4e-4755-bfaa-7ce114ce04e8",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": null,
  "session_version": 0,
  "session_state": "CLOSED",
  "intent": null,
  "connection": "DISCONNECTED",
  "geolocation": "UNAVAILABLE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": null,
  "vehicle_id": null,
  "last_heartbeat_at": null,
  "last_location_at": null,
  "eligible": false,
  "ineligible_reasons": [
    "NO_OPEN_SESSION"
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "fe47cdab-e35e-4c3d-a847-09648c302b5c",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "last_heartbeat_at": "2026-10-30T19:12:30.287339Z",
  "last_location_at": "2026-10-30T19:12:30.287339Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/fe47cdab-e35e-4c3d-a847-09648c302b5c/close` → **200**

```json
{
  "command_id": "a228ce3f-aced-4f11-a195-b380bb6ffb99",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": null,
  "session_version": 0,
  "session_state": "CLOSED",
  "intent": null,
  "connection": "DISCONNECTED",
  "geolocation": "UNAVAILABLE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": null,
  "vehicle_id": null,
  "last_heartbeat_at": null,
  "last_location_at": null,
  "eligible": false,
  "ineligible_reasons": [
    "NO_OPEN_SESSION"
  ]
}
```

# Scenario: legal-acceptance

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "038d2230-5ba9-4688-bb92-a42a83d8b945",
  "subject": {
    "type": "STAFF",
    "id": "50e6407f-123d-42ca-9890-64ec61c07dce"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MGU2NDA3Zi0xMjNkLTQyY2EtOTg5MC02NGVjNjFjMDdkY2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODg0NTYsImlhdCI6MTc5MzM4NzU1NiwianRpIjoiZDM1ZTZhMmItNmY4MC00OGZhLThjYmMtNGQwMWJjZjA0ZmQ4Iiwic2lkIjoiMDM4ZDIyMzAtNWJhOS00Njg4LWJiOTItYTQyYTgzZDhiOTQ1In0.VCRc5EBQe5Uan4T6a6BKzrXb1elQsjk45xOpogWwSRg",
  "access_expires_at": "2026-10-30T19:27:36.928591251Z",
  "refresh_token": "U139r5hoIVGmyw7GHD0v3oJRZ2DC1KMqLJUYGe6gBsc",
  "refresh_expires_at": "2026-10-31T07:12:36.92813995Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "8ee3b255-1f95-46aa-8659-826cf22f0210",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T19:12:37Z"
}
```

```json
{
  "id": "8d29177e-d27b-4af0-a047-057e7170584b",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T19:12:37Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/8d29177e-d27b-4af0-a047-057e7170584b/publish` → **200**

```json
{
  "command_id": "f1d8e4be-c884-4707-b20e-61f73b04adcd",
  "expected_version": 0
}
```

```json
{
  "id": "8d29177e-d27b-4af0-a047-057e7170584b",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T19:12:37.464498Z",
  "published_at": "2026-10-30T19:12:37.464498Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "8d29177e-d27b-4af0-a047-057e7170584b",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-30T19:12:37.464498Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634823793",
  "device_ref": "sandbox-16716"
}
```

```json
{
  "challenge_id": "4703f238-f171-4757-ad6f-9c5ad434c933",
  "expires_at": "2026-10-30T19:17:37.975235411Z",
  "resend_available_at": "2026-10-30T19:12:38.975235411Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380634823793` → **200**

```json
{
  "phone": "+380634823793",
  "audience": "CLIENT",
  "code": "482365",
  "sent_at": "2026-10-30T19:12:37.977432639Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4703f238-f171-4757-ad6f-9c5ad434c933",
  "code": "482365",
  "device_ref": "sandbox-16716"
}
```

```json
{
  "session_id": "06d93f1a-dbec-4136-adad-5646a5dab90e",
  "subject": {
    "type": "CLIENT",
    "id": "b3125492-4179-4326-8cdd-d6095119e054"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMzEyNTQ5Mi00MTc5LTQzMjYtOGNkZC1kNjA5NTExOWUwNTQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzg4NDU4LCJpYXQiOjE3OTMzODc1NTgsImp0aSI6IjJkMTJhMmM3LWZhODktNGYxMy05YWU1LTczOWUyNWM3NDA3YyIsInNpZCI6IjA2ZDkzZjFhLWRiZWMtNDEzNi1hZGFkLTU2NDZhNWRhYjkwZSJ9.BrSlDqmnpZNe1-E8-MaBDRT08wvQ90we1s2w0Plh3xs",
  "access_expires_at": "2026-10-30T19:27:38.25310395Z",
  "refresh_token": "XckoPtvhp-pdPPnFUNn2HqwWBQKrcU5B-v06MSyBbFo",
  "refresh_expires_at": "2026-11-29T19:12:38.25261355Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "8d29177e-d27b-4af0-a047-057e7170584b",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-30T19:12:37.464498Z",
      "languages": [
        "pl",
        "uk"
      ]
    }
  ]
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a6d13367-c61d-47ad-80bc-8e152cf01196",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4547,
    "lon": 30.5238
  },
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.6520
  }
}
```

```json
{
  "id": "d8d04075-c00c-468a-be81-ecb8f42339e3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T19:17:38.769110Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false,
  "discount_minor": 0,
  "to_pay_minor": 30533,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "cb2f19cc-2806-4f08-a3ac-d112027efe68",
  "quote_id": "d8d04075-c00c-468a-be81-ecb8f42339e3",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4547,
    "lon": 30.5238
  },
  "pickup_label": "Хрещатик, 22",
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.6520
  },
  "dropoff_label": "Позняки",
  "payment_method": "CASH"
}
```

```json
{
  "instance": "/api/rider/v1/orders",
  "status": 403,
  "title": "Acceptance required",
  "type": "https://errors.blizz.taxi/acceptance-required",
  "code": "ACCEPTANCE_REQUIRED",
  "correlation_id": "0e6d41ba-1f12-404d-8e08-7171619d3abc"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "d77084c9-8b8e-49ef-a86e-5a67646dd367",
  "version_id": "8d29177e-d27b-4af0-a047-057e7170584b",
  "language": "uk"
}
```

```json
{
  "version_id": "8d29177e-d27b-4af0-a047-057e7170584b",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-30T19:12:39.285244Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "54a7e624-043b-4cd6-b39a-0dadb8e8d931",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4547,
    "lon": 30.5238
  },
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.6520
  }
}
```

```json
{
  "id": "4b278362-511c-48c6-8a3a-507b92b51213",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T19:17:39.638177Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false,
  "discount_minor": 0,
  "to_pay_minor": 30533,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "929dfa68-bb40-4812-add6-11c1cb456f5b",
  "quote_id": "4b278362-511c-48c6-8a3a-507b92b51213",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4547,
    "lon": 30.5238
  },
  "pickup_label": "Хрещатик, 22",
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.6520
  },
  "dropoff_label": "Позняки",
  "payment_method": "CASH"
}
```

```json
{
  "id": "d01e6a56-7789-4752-add1-a2a16081fe6e",
  "short_number": 20,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b3125492-4179-4326-8cdd-d6095119e054",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4547,
    "lon": 30.5238
  },
  "pickup_label": "Хрещатик, 22",
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.652
  },
  "dropoff_label": "Позняки",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 30533,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T19:12:39.943456Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/d01e6a56-7789-4752-add1-a2a16081fe6e` → **200**

```json
{
  "id": "d01e6a56-7789-4752-add1-a2a16081fe6e",
  "short_number": 20,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b3125492-4179-4326-8cdd-d6095119e054",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4547,
    "lon": 30.5238
  },
  "pickup_label": "Хрещатик, 22",
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.652
  },
  "dropoff_label": "Позняки",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 30533,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T19:12:39.943456Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/d01e6a56-7789-4752-add1-a2a16081fe6e/cancel` → **200**

```json
{
  "command_id": "a4bd262a-96f8-4e62-ab5e-8632535dd37b",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "d01e6a56-7789-4752-add1-a2a16081fe6e",
  "short_number": 20,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "b3125492-4179-4326-8cdd-d6095119e054",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4547,
    "lon": 30.5238
  },
  "pickup_label": "Хрещатик, 22",
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.652
  },
  "dropoff_label": "Позняки",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 30533,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "STOPPED",
  "assignment": null,
  "created_at": "2026-10-30T19:12:39.943456Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
      "en": "Changed my mind",
      "ru": "Передумал ехать"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

## A published version never changes

`POST /api/admin/v1/legal-documents/8d29177e-d27b-4af0-a047-057e7170584b` → **409**

```json
{
  "command_id": "8d578305-c43e-4470-93d4-d0f641123225",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T19:12:40Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/8d29177e-d27b-4af0-a047-057e7170584b",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "f3edc892-2180-4928-a6e3-0fd95c2e654f"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "fbcd5fa5-ef55-461e-b26c-ae8ac77bf4eb",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T19:12:41Z"
}
```

```json
{
  "id": "3c1b7536-8e43-4fda-a795-14ab03412595",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T19:12:41Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/3c1b7536-8e43-4fda-a795-14ab03412595/publish` → **200**

```json
{
  "command_id": "79045729-03a3-4cbc-b932-74fcce74f8be",
  "expected_version": 0
}
```

```json
{
  "id": "3c1b7536-8e43-4fda-a795-14ab03412595",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T19:12:41.324623Z",
  "published_at": "2026-10-30T19:12:41.324623Z",
  "version": 1
}
```

# Scenario: multiple-orders

## A driver goes online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-27404"
}
```

```json
{
  "challenge_id": "1c3c3a76-0c9b-49a2-8c3b-d0d4c5d3800f",
  "expires_at": "2026-10-30T19:17:41.583084884Z",
  "resend_available_at": "2026-10-30T19:12:42.583084884Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "242303",
  "sent_at": "2026-10-30T19:12:41.586340711Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1c3c3a76-0c9b-49a2-8c3b-d0d4c5d3800f",
  "code": "242303",
  "device_ref": "sandbox-27404"
}
```

```json
{
  "session_id": "22406432-f5cd-4860-b623-bb5581d86e48",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4ODQ2MSwiaWF0IjoxNzkzMzg3NTYxLCJqdGkiOiIzMmIwMTVkOC03YTNlLTRkNTctYmJlNC1lZjZhMTY0Njg2YmUiLCJzaWQiOiIyMjQwNjQzMi1mNWNkLTQ4NjAtYjYyMy1iYjU1ODFkODZlNDgifQ.1vLqGW6F0FeNTyGhAF19rZF7cyhLVios_ixpXkBkRYk",
  "access_expires_at": "2026-10-30T19:27:41.862733071Z",
  "refresh_token": "Q9RNIlENDN5tPM8AeDmbSTP6WHLKHK6PBCNovx85TZQ",
  "refresh_expires_at": "2026-11-29T19:12:41.8622957Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": null,
  "session_version": 0,
  "session_state": "CLOSED",
  "intent": null,
  "connection": "DISCONNECTED",
  "geolocation": "UNAVAILABLE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": null,
  "vehicle_id": null,
  "last_heartbeat_at": null,
  "last_location_at": null,
  "eligible": false,
  "ineligible_reasons": [
    "NO_OPEN_SESSION"
  ]
}
```

(the car drives 72 s to the next point)

`POST /api/driver/v1/work-sessions` → **201**

```json
{
  "command_id": "3bcc76f6-ac32-4dd7-bd7b-147de4b7da1a",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:13:54Z",
    "sequence": 1793387634385
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "5980b850-6563-49b7-84aa-458ee6eb95b5",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "last_heartbeat_at": "2026-10-30T19:13:54.402984Z",
  "last_location_at": "2026-10-30T19:13:54.402984Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676878395",
  "device_ref": "sandbox-9547"
}
```

```json
{
  "challenge_id": "51738f67-7a53-4897-a737-ea6a8c27866c",
  "expires_at": "2026-10-30T19:18:54.659456706Z",
  "resend_available_at": "2026-10-30T19:13:55.659456706Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380676878395` → **200**

```json
{
  "phone": "+380676878395",
  "audience": "CLIENT",
  "code": "421807",
  "sent_at": "2026-10-30T19:13:54.662630377Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "51738f67-7a53-4897-a737-ea6a8c27866c",
  "code": "421807",
  "device_ref": "sandbox-9547"
}
```

```json
{
  "session_id": "34324e5e-ed21-4790-a444-354c245f3f75",
  "subject": {
    "type": "CLIENT",
    "id": "20280a97-5825-4f9b-a7cd-db96bfd020f1"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMDI4MGE5Ny01ODI1LTRmOWItYTdjZC1kYjk2YmZkMDIwZjEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzg4NTM0LCJpYXQiOjE3OTMzODc2MzQsImp0aSI6ImNmNzhmOWMzLWRlNGUtNDU2My05ODQ5LTQxZTJjYjA4MmRlNiIsInNpZCI6IjM0MzI0ZTVlLWVkMjEtNDc5MC1hNDQ0LTM1NGMyNDVmM2Y3NSJ9.dpBF8EsHVHwWWPx7LRn1JXYP_V6mmaPrWemF9elJmZ8",
  "access_expires_at": "2026-10-30T19:28:54.991324598Z",
  "refresh_token": "M12etvPaUY56mLWILyasY3GbsNzYkXJfSpes5-t-qKc",
  "refresh_expires_at": "2026-11-29T19:13:54.990913538Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e5007463-8071-48fa-a647-d5f6661d7f1a",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  }
}
```

```json
{
  "id": "41b381cc-623d-42b0-b9b1-c23fd2d281d1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T19:18:55.296593Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false,
  "discount_minor": 0,
  "to_pay_minor": 10517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "13ff9ebb-9555-4e26-89be-0d1ea9c07e7b",
  "quote_id": "41b381cc-623d-42b0-b9b1-c23fd2d281d1",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "recipient": {
    "name": "Бабуся Ольга",
    "phone": "+380678010080"
  }
}
```

```json
{
  "id": "f248d0c1-2fe3-4fc8-8366-d95fa9ed3fe6",
  "short_number": 21,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "20280a97-5825-4f9b-a7cd-db96bfd020f1",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "PERSONAL",
  "assignment": null,
  "created_at": "2026-10-30T19:13:55.731435Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

## The offer says nothing about granny; once accepted, the trip does

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "79b137ae-d818-48af-a6d3-15b0ea14d4ff",
    "order_id": "f248d0c1-2fe3-4fc8-8366-d95fa9ed3fe6",
    "expires_at": "2026-10-30T19:14:10.734388Z",
    "vehicle_class": "STANDARD",
    "pickup": {
      "lat": 50.4501,
      "lon": 30.5234
    },
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "payment_method": "CASH",
    "price_minor": 10517,
    "currency": "UAH",
    "distance_m": 211
  }
]
```

`POST /api/driver/v1/offers/79b137ae-d818-48af-a6d3-15b0ea14d4ff/accept` → **200**

```json
{
  "command_id": "7069d2f5-7433-46fd-ba69-50e63cd28fae"
}
```

```json
{
  "id": "b0d9f628-6145-4073-b8e4-f63925201099",
  "order_id": "f248d0c1-2fe3-4fc8-8366-d95fa9ed3fe6",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c9fa307c-aac6-4327-a734-c7f22ca8a43b",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c9fa307c-aac6-4327-a734-c7f22ca8a43b",
  "order_id": "f248d0c1-2fe3-4fc8-8366-d95fa9ed3fe6",
  "assignment_id": "b0d9f628-6145-4073-b8e4-f63925201099",
  "phase": "TO_PICKUP",
  "version": 0,
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "price_minor": 10517,
  "currency": "UAH",
  "arrived_at": null,
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Бабуся Ольга",
    "phone": "+380678010080"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "0babbc2b-b427-43a4-bd3d-c6a2f40ebf0e",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  }
}
```

```json
{
  "id": "c8bf63f5-4db3-4fdc-bab5-28f1adcc3142",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T19:18:56.838557Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false,
  "discount_minor": 0,
  "to_pay_minor": 10517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "fe66f097-4664-4a55-aa26-540da06d4275",
  "quote_id": "c8bf63f5-4db3-4fdc-bab5-28f1adcc3142",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "recipient": null
}
```

```json
{
  "id": "1cab5fc0-74cc-44b6-86fd-b1173d229843",
  "short_number": 22,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "20280a97-5825-4f9b-a7cd-db96bfd020f1",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T19:13:57.100211Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "9b58e05d-57ee-4a31-8209-2c0b3871ff2d",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-30T22:13:57Z"
}
```

```json
{
  "id": "6fb9a102-17c5-4ff2-9063-427bff4a6a4e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T19:18:57.376557Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-30T22:13:57Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "9089f5de-4512-4ea1-b4b1-4912f402edd9",
  "quote_id": "6fb9a102-17c5-4ff2-9063-427bff4a6a4e",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "recipient": null,
  "pickup_at": "2026-10-30T22:13:57Z"
}
```

```json
{
  "id": "6df118ca-e4e6-4db6-a1fa-1d0274c9edac",
  "short_number": 23,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "20280a97-5825-4f9b-a7cd-db96bfd020f1",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 13517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": null,
  "assignment": null,
  "created_at": "2026-10-30T19:13:57.643607Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T22:13:57Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

## The fourth is refused: at most three active orders, orders for later included

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "bd9752fb-2422-4ebd-a836-30de23bd178a",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  }
}
```

```json
{
  "id": "3e4a6ed5-9fd0-4ab6-a20d-5548c0430a85",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T19:18:57.923319Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false,
  "discount_minor": 0,
  "to_pay_minor": 10517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **409**

```json
{
  "command_id": "ea07f9c8-016e-4524-8b8d-0f8e5b05282b",
  "quote_id": "3e4a6ed5-9fd0-4ab6-a20d-5548c0430a85",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "recipient": null
}
```

```json
{
  "instance": "/api/rider/v1/orders",
  "status": 409,
  "title": "Active order limit",
  "type": "https://errors.blizz.taxi/active-order-limit",
  "code": "ACTIVE_ORDER_LIMIT",
  "correlation_id": "4d98d225-d4e5-43e3-9b25-1b695f537c69"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "6df118ca-e4e6-4db6-a1fa-1d0274c9edac",
      "short_number": 23,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "20280a97-5825-4f9b-a7cd-db96bfd020f1",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
        "lat": 50.4405,
        "lon": 30.489
      },
      "dropoff_label": "Вокзал",
      "payment_method": "CASH",
      "payment_state": "CASH_EXPECTED",
      "price_minor": 13517,
      "final_price_minor": null,
      "currency": "UAH",
      "search_phase": null,
      "assignment": null,
      "created_at": "2026-10-30T19:13:57.643607Z",
      "cancellation": null,
      "pickup_at": "2026-10-30T22:13:57Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "1cab5fc0-74cc-44b6-86fd-b1173d229843",
      "short_number": 22,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "20280a97-5825-4f9b-a7cd-db96bfd020f1",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
        "lat": 50.4405,
        "lon": 30.489
      },
      "dropoff_label": "Вокзал",
      "payment_method": "CASH",
      "payment_state": "CASH_EXPECTED",
      "price_minor": 10517,
      "final_price_minor": null,
      "currency": "UAH",
      "search_phase": "BROADCAST",
      "assignment": null,
      "created_at": "2026-10-30T19:13:57.100211Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "f248d0c1-2fe3-4fc8-8366-d95fa9ed3fe6",
      "short_number": 21,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "1cab5fc0-74cc-44b6-86fd-b1173d229843",
  "short_number": 22,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "20280a97-5825-4f9b-a7cd-db96bfd020f1",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T19:13:57.100211Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

## The rider cancels all three; the driver goes off line

`GET /api/rider/v1/orders/f248d0c1-2fe3-4fc8-8366-d95fa9ed3fe6` → **200**

```json
{
  "id": "f248d0c1-2fe3-4fc8-8366-d95fa9ed3fe6",
  "short_number": 21,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "20280a97-5825-4f9b-a7cd-db96bfd020f1",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "STOPPED",
  "assignment": {
    "id": "b0d9f628-6145-4073-b8e4-f63925201099",
    "order_id": "f248d0c1-2fe3-4fc8-8366-d95fa9ed3fe6",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "c9fa307c-aac6-4327-a734-c7f22ca8a43b",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T19:13:55.731435Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": {
    "seconds": 40,
    "distance_metres": 275,
    "source": "STRAIGHT_LINE",
    "location_at": "2026-10-30T19:13:54.402984Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/f248d0c1-2fe3-4fc8-8366-d95fa9ed3fe6/cancel` → **200**

```json
{
  "command_id": "98fc0088-9961-46b3-8fac-995968015da9",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "f248d0c1-2fe3-4fc8-8366-d95fa9ed3fe6",
  "short_number": 21,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "20280a97-5825-4f9b-a7cd-db96bfd020f1",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "STOPPED",
  "assignment": {
    "id": "b0d9f628-6145-4073-b8e4-f63925201099",
    "order_id": "f248d0c1-2fe3-4fc8-8366-d95fa9ed3fe6",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "c9fa307c-aac6-4327-a734-c7f22ca8a43b",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T19:13:55.731435Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
      "en": "Changed my mind",
      "ru": "Передумал ехать"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/1cab5fc0-74cc-44b6-86fd-b1173d229843` → **200**

```json
{
  "id": "1cab5fc0-74cc-44b6-86fd-b1173d229843",
  "short_number": 22,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "20280a97-5825-4f9b-a7cd-db96bfd020f1",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T19:13:57.100211Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/1cab5fc0-74cc-44b6-86fd-b1173d229843/cancel` → **200**

```json
{
  "command_id": "6d442420-7a8f-47cf-b60b-efc546e84f7d",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "1cab5fc0-74cc-44b6-86fd-b1173d229843",
  "short_number": 22,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "20280a97-5825-4f9b-a7cd-db96bfd020f1",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "STOPPED",
  "assignment": null,
  "created_at": "2026-10-30T19:13:57.100211Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
      "en": "Changed my mind",
      "ru": "Передумал ехать"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6df118ca-e4e6-4db6-a1fa-1d0274c9edac` → **200**

```json
{
  "id": "6df118ca-e4e6-4db6-a1fa-1d0274c9edac",
  "short_number": 23,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "20280a97-5825-4f9b-a7cd-db96bfd020f1",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 13517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": null,
  "assignment": null,
  "created_at": "2026-10-30T19:13:57.643607Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T22:13:57Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/6df118ca-e4e6-4db6-a1fa-1d0274c9edac/cancel` → **200**

```json
{
  "command_id": "da7a6bd1-9c16-4731-a4d5-10bff90f8e59",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "6df118ca-e4e6-4db6-a1fa-1d0274c9edac",
  "short_number": 23,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "20280a97-5825-4f9b-a7cd-db96bfd020f1",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 13517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": null,
  "assignment": null,
  "created_at": "2026-10-30T19:13:57.643607Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
      "en": "Changed my mind",
      "ru": "Передумал ехать"
    }
  },
  "pickup_at": "2026-10-30T22:13:57Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "5980b850-6563-49b7-84aa-458ee6eb95b5",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "last_heartbeat_at": "2026-10-30T19:13:54.402984Z",
  "last_location_at": "2026-10-30T19:13:54.402984Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5980b850-6563-49b7-84aa-458ee6eb95b5/close` → **200**

```json
{
  "command_id": "15a9e762-5b5a-4244-bb58-7d0f2c0aa5a3",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": null,
  "session_version": 0,
  "session_state": "CLOSED",
  "intent": null,
  "connection": "DISCONNECTED",
  "geolocation": "UNAVAILABLE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": null,
  "vehicle_id": null,
  "last_heartbeat_at": null,
  "last_location_at": null,
  "eligible": false,
  "ineligible_reasons": [
    "NO_OPEN_SESSION"
  ]
}
```

Done: orders f248d0c1-2fe3-4fc8-8366-d95fa9ed3fe6, 1cab5fc0-74cc-44b6-86fd-b1173d229843, 6df118ca-e4e6-4db6-a1fa-1d0274c9edac.

# Scenario: operator-bonus

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "ed8e3915-e505-43d3-97d5-8bb93e6092d0",
  "subject": {
    "type": "STAFF",
    "id": "50e6407f-123d-42ca-9890-64ec61c07dce"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MGU2NDA3Zi0xMjNkLTQyY2EtOTg5MC02NGVjNjFjMDdkY2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODg1NDEsImlhdCI6MTc5MzM4NzY0MSwianRpIjoiYzM0ZjUwM2EtMjAwYS00MGE3LThmZTItY2I2YzY5NzhmNDY3Iiwic2lkIjoiZWQ4ZTM5MTUtZTUwNS00M2QzLTk3ZDUtOGJiOTNlNjA5MmQwIn0.AvlZBRc1gOcd2sGloehHQLEfCIRdM9jpmuWei8s5Zsg",
  "access_expires_at": "2026-10-30T19:29:01.325002025Z",
  "refresh_token": "LxP1gSWRHy4BnDCObhnNlk2DDzyEWRm-g8PsFDy9Plc",
  "refresh_expires_at": "2026-10-31T07:14:01.324505988Z",
  "password_change_required": false
}
```

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "OPERATOR",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "164901da-cd06-4ebf-a98e-77017cbf0adf",
  "subject": {
    "type": "STAFF",
    "id": "50e6407f-123d-42ca-9890-64ec61c07dce"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MGU2NDA3Zi0xMjNkLTQyY2EtOTg5MC02NGVjNjFjMDdkY2UiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODg1NDEsImlhdCI6MTc5MzM4NzY0MSwianRpIjoiYTAwMDcxZGMtZjc3OS00NmNiLWEwODAtMmU4MTM0ZjJkMzhhIiwic2lkIjoiMTY0OTAxZGEtY2QwNi00ZWJmLWE5OGUtNzcwMTdjYmYwYWRmIn0.zyOq18poDvBh3mHw_CLZNEVVcAD9zq2Iv4l91tkMEqY",
  "access_expires_at": "2026-10-30T19:29:01.821542356Z",
  "refresh_token": "hIrmnfYmPPitO9S2iPJlTfAA4U6mRHUOna2mODbDbRY",
  "refresh_expires_at": "2026-10-31T07:14:01.821010034Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-21341"
}
```

```json
{
  "challenge_id": "774663ca-f818-4ab1-9ec1-db5f5343d34c",
  "expires_at": "2026-10-30T19:19:02.060663386Z",
  "resend_available_at": "2026-10-30T19:14:03.060663386Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "418931",
  "sent_at": "2026-10-30T19:14:02.063183264Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "774663ca-f818-4ab1-9ec1-db5f5343d34c",
  "code": "418931",
  "device_ref": "sandbox-21341"
}
```

```json
{
  "session_id": "2449ee54-bc08-47f6-aac6-f544f9b1b382",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4ODU0MiwiaWF0IjoxNzkzMzg3NjQyLCJqdGkiOiJhMGZhZDFiYy04YjhiLTRiOTUtOGFlNS05YjVhMzQyOTM2ZTciLCJzaWQiOiIyNDQ5ZWU1NC1iYzA4LTQ3ZjYtYWFjNi1mNTQ0ZjliMWIzODIifQ.ROU6yzlHG7pwEs3lXBzk1GHPFoLSYogZEPwdaq70Tkw",
  "access_expires_at": "2026-10-30T19:29:02.387415411Z",
  "refresh_token": "3dZPbZ_wvzTj1z4TSAIe0KGhBEsU8GvYRR8GZh7_5A8",
  "refresh_expires_at": "2026-11-29T19:14:02.3869703Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": null,
  "session_version": 0,
  "session_state": "CLOSED",
  "intent": null,
  "connection": "DISCONNECTED",
  "geolocation": "UNAVAILABLE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": null,
  "vehicle_id": null,
  "last_heartbeat_at": null,
  "last_location_at": null,
  "eligible": false,
  "ineligible_reasons": [
    "NO_OPEN_SESSION"
  ]
}
```

`POST /api/driver/v1/work-sessions` → **201**

```json
{
  "command_id": "6e0e3e5a-33fd-49fd-a006-814907cc1731",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:14:02Z",
    "sequence": 1793387642888
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d6ddf3f8-ab5b-4650-83ca-edea60766eab",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T19:14:02.906736Z",
  "last_location_at": "2026-10-30T19:14:02.906736Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Admin sets operator bonus m=2, g=3

`GET /api/admin/v1/settings/operator-bonuses` → **200**

```json
{
  "version": 0,
  "settings": {
    "m": 1,
    "g": 10,
    "count_cancellations": true,
    "reset_day": 1,
    "time_rules": []
  },
  "effective_at": "2000-01-01T00:00:00Z",
  "changed_by": null,
  "reason": "Initial operator bonus settings"
}
```

`POST /api/admin/v1/settings/operator-bonuses` → **200**

```json
{
  "command_id": "393103f2-7de3-4be7-ad51-947b8bc0c542",
  "expected_version": 0,
  "settings": {
    "m": 2,
    "g": 3,
    "count_cancellations": true,
    "reset_day": 28,
    "time_rules": []
  },
  "reason": "Sandbox operator bonus scenario"
}
```

```json
{
  "version": 1,
  "settings": {
    "m": 2,
    "g": 3,
    "count_cancellations": true,
    "reset_day": 28,
    "time_rules": []
  },
  "effective_at": "2026-10-30T19:14:03.428052Z",
  "changed_by": "50e6407f-123d-42ca-9890-64ec61c07dce",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "50e6407f-123d-42ca-9890-64ec61c07dce",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-30T19:03:25.651898Z",
  "last_entries": [
    {
      "order_id": "fa407296-6cd8-4f6c-a4af-e385ca6ca948",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T19:03:25.651898Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "db4f4e4f-63a8-4082-a0e8-73b497b4ef92",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.6522
  }
}
```

```json
{
  "id": "92398ad1-2154-4028-a617-6cf2593b3567",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T19:19:03.934102Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false,
  "discount_minor": 0,
  "to_pay_minor": 29967,
  "promotions": []
}
```

`POST /api/operator/v1/orders` → **201**

```json
{
  "command_id": "dfd9d08d-dfb7-4322-a607-1a0a3df7cd0c",
  "quote_id": "92398ad1-2154-4028-a617-6cf2593b3567",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Bonus pickup",
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.6522
  },
  "dropoff_label": "Bonus dropoff",
  "payment_method": "CASH",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711111412"
  }
}
```

```json
{
  "id": "1fc4491c-c693-4f11-9bba-d26eeb1a2cc5",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "PHONE",
  "payer_client_id": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Bonus pickup",
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.6522
  },
  "dropoff_label": "Bonus dropoff",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 29967,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "PERSONAL",
  "assignment": null,
  "created_at": "2026-10-30T19:14:04.196154Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711111412"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "bd4969a3-48ba-44cf-bae6-3250049dc7d4",
    "order_id": "1fc4491c-c693-4f11-9bba-d26eeb1a2cc5",
    "expires_at": "2026-10-30T19:14:19.200174Z",
    "vehicle_class": "STANDARD",
    "pickup": {
      "lat": 50.4501,
      "lon": 30.5234
    },
    "pickup_label": "Bonus pickup",
    "dropoff_label": "Bonus dropoff",
    "payment_method": "CASH",
    "price_minor": 29967,
    "currency": "UAH",
    "distance_m": 100
  }
]
```

`POST /api/driver/v1/offers/bd4969a3-48ba-44cf-bae6-3250049dc7d4/accept` → **200**

```json
{
  "command_id": "813531cd-748b-4ee4-a91f-23c91c208285"
}
```

```json
{
  "id": "48bb64c4-dc51-45ad-974f-3be59365e0f2",
  "order_id": "1fc4491c-c693-4f11-9bba-d26eeb1a2cc5",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "99d160b4-dbf1-41c2-ab07-d9362635055b",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "99d160b4-dbf1-41c2-ab07-d9362635055b",
  "order_id": "1fc4491c-c693-4f11-9bba-d26eeb1a2cc5",
  "assignment_id": "48bb64c4-dc51-45ad-974f-3be59365e0f2",
  "phase": "TO_PICKUP",
  "version": 0,
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Bonus pickup",
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.6522
  },
  "dropoff_label": "Bonus dropoff",
  "payment_method": "CASH",
  "price_minor": 29967,
  "currency": "UAH",
  "arrived_at": null,
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711111412"
  }
}
```

`POST /api/driver/v1/work-sessions/d6ddf3f8-ab5b-4650-83ca-edea60766eab/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:14:05Z",
    "sequence": 1793387645263
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d6ddf3f8-ab5b-4650-83ca-edea60766eab",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T19:14:05.281848Z",
  "last_location_at": "2026-10-30T19:14:05.281848Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/99d160b4-dbf1-41c2-ab07-d9362635055b/arrive` → **200**

```json
{
  "command_id": "e53b836f-a864-45be-8d95-a52fe8bb29c5",
  "expected_version": 0
}
```

```json
{
  "id": "99d160b4-dbf1-41c2-ab07-d9362635055b",
  "order_id": "1fc4491c-c693-4f11-9bba-d26eeb1a2cc5",
  "assignment_id": "48bb64c4-dc51-45ad-974f-3be59365e0f2",
  "phase": "WAITING",
  "version": 1,
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Bonus pickup",
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.6522
  },
  "dropoff_label": "Bonus dropoff",
  "payment_method": "CASH",
  "price_minor": 29967,
  "currency": "UAH",
  "arrived_at": "2026-10-30T19:14:05.538446Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711111412"
  }
}
```

`POST /api/driver/v1/trips/99d160b4-dbf1-41c2-ab07-d9362635055b/start` → **200**

```json
{
  "command_id": "b30bc382-5c18-49f5-9ed3-4f0f19c5aced",
  "expected_version": 1
}
```

```json
{
  "id": "99d160b4-dbf1-41c2-ab07-d9362635055b",
  "order_id": "1fc4491c-c693-4f11-9bba-d26eeb1a2cc5",
  "assignment_id": "48bb64c4-dc51-45ad-974f-3be59365e0f2",
  "phase": "IN_PROGRESS",
  "version": 2,
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Bonus pickup",
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.6522
  },
  "dropoff_label": "Bonus dropoff",
  "payment_method": "CASH",
  "price_minor": 29967,
  "currency": "UAH",
  "arrived_at": "2026-10-30T19:14:05.538446Z",
  "started_at": "2026-10-30T19:14:05.803264Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711111412"
  }
}
```

`POST /api/driver/v1/trips/99d160b4-dbf1-41c2-ab07-d9362635055b/complete` → **200**

```json
{
  "command_id": "7790caf5-a049-43de-8b5b-1ac7e6826970",
  "expected_version": 2,
  "reported_at": "2026-10-30T19:14:06Z",
  "cash_received": true
}
```

```json
{
  "id": "99d160b4-dbf1-41c2-ab07-d9362635055b",
  "order_id": "1fc4491c-c693-4f11-9bba-d26eeb1a2cc5",
  "assignment_id": "48bb64c4-dc51-45ad-974f-3be59365e0f2",
  "phase": "COMPLETED",
  "version": 3,
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Bonus pickup",
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.6522
  },
  "dropoff_label": "Bonus dropoff",
  "payment_method": "CASH",
  "price_minor": 29967,
  "currency": "UAH",
  "arrived_at": "2026-10-30T19:14:05.538446Z",
  "started_at": "2026-10-30T19:14:05.803264Z",
  "completed_at": "2026-10-30T19:14:06.072103Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Second phone order is cancelled for operator error

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "e0dd51a6-ccdb-40eb-97c5-41905f692b70",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.6522
  }
}
```

```json
{
  "id": "81ce3c39-d786-4bd7-87b5-20803b8f24e9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T19:19:06.334623Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false,
  "discount_minor": 0,
  "to_pay_minor": 29967,
  "promotions": []
}
```

`POST /api/operator/v1/orders` → **201**

```json
{
  "command_id": "f549e50d-5fcd-4ea4-87bc-312ac15eb4ff",
  "quote_id": "81ce3c39-d786-4bd7-87b5-20803b8f24e9",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Bonus pickup",
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.6522
  },
  "dropoff_label": "Bonus dropoff",
  "payment_method": "CASH",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671119280"
  }
}
```

```json
{
  "id": "a8b33c00-b629-4668-bb0e-ec0396eed8ad",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "PHONE",
  "payer_client_id": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Bonus pickup",
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.6522
  },
  "dropoff_label": "Bonus dropoff",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 29967,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "PERSONAL",
  "assignment": null,
  "created_at": "2026-10-30T19:14:06.588628Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671119280"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/a8b33c00-b629-4668-bb0e-ec0396eed8ad` → **200**

```json
{
  "id": "a8b33c00-b629-4668-bb0e-ec0396eed8ad",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "PHONE",
  "payer_client_id": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Bonus pickup",
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.6522
  },
  "dropoff_label": "Bonus dropoff",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 29967,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "PERSONAL",
  "assignment": null,
  "created_at": "2026-10-30T19:14:06.588628Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671119280"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/a8b33c00-b629-4668-bb0e-ec0396eed8ad/cancel` → **200**

```json
{
  "command_id": "bd87e530-9e30-4db7-9ef6-effa56ee0da5",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "a8b33c00-b629-4668-bb0e-ec0396eed8ad",
  "short_number": 25,
  "status": "CANCELLED",
  "status_reason": "OPERATOR_ERROR",
  "version": 3,
  "channel": "PHONE",
  "payer_client_id": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Bonus pickup",
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.6522
  },
  "dropoff_label": "Bonus dropoff",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 29967,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "STOPPED",
  "assignment": null,
  "created_at": "2026-10-30T19:14:06.588628Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671119280"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "OPERATOR_ERROR",
    "reason_labels": {
      "pl": "Błąd operatora",
      "uk": "Помилка оператора",
      "en": "Operator error",
      "ru": "Ошибка оператора"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Operator reads own bonus account

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "50e6407f-123d-42ca-9890-64ec61c07dce",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-30T19:03:25.651898Z",
  "last_entries": [
    {
      "order_id": "a8b33c00-b629-4668-bb0e-ec0396eed8ad",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-30T19:14:07.136279Z"
    },
    {
      "order_id": "1fc4491c-c693-4f11-9bba-d26eeb1a2cc5",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-30T19:14:06.076098Z"
    },
    {
      "order_id": "fa407296-6cd8-4f6c-a4af-e385ca6ca948",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T19:03:25.651898Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d6ddf3f8-ab5b-4650-83ca-edea60766eab",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T19:14:05.281848Z",
  "last_location_at": "2026-10-30T19:14:05.281848Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d6ddf3f8-ab5b-4650-83ca-edea60766eab/close` → **200**

```json
{
  "command_id": "27b18945-8026-4d78-9cda-4795613c2e35",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": null,
  "session_version": 0,
  "session_state": "CLOSED",
  "intent": null,
  "connection": "DISCONNECTED",
  "geolocation": "UNAVAILABLE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": null,
  "vehicle_id": null,
  "last_heartbeat_at": null,
  "last_location_at": null,
  "eligible": false,
  "ineligible_reasons": [
    "NO_OPEN_SESSION"
  ]
}
```

Done: operator bonus for fulfilled 1fc4491c-c693-4f11-9bba-d26eeb1a2cc5 and operator-fault cancellation a8b33c00-b629-4668-bb0e-ec0396eed8ad.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675306175",
  "device_ref": "sandbox-21437"
}
```

```json
{
  "challenge_id": "616fa0f4-e77f-407e-99ee-4fb22d5a0b62",
  "expires_at": "2026-10-30T19:19:11.374706735Z",
  "resend_available_at": "2026-10-30T19:14:12.374706735Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380675306175` → **200**

```json
{
  "phone": "+380675306175",
  "audience": "CLIENT",
  "code": "230448",
  "sent_at": "2026-10-30T19:14:11.37796012Z",
  "channel": "SMS"
}
```

## "Call me instead" on the first try still gets an SMS; the resend is a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677850291",
  "device_ref": "sandbox-29686",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "d2449e81-407b-4ff2-abd9-10df07ea111c",
  "expires_at": "2026-10-30T19:19:12.848453528Z",
  "resend_available_at": "2026-10-30T19:14:13.848453528Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380677850291` → **200**

```json
{
  "phone": "+380677850291",
  "audience": "CLIENT",
  "code": "143160",
  "sent_at": "2026-10-30T19:14:12.851297634Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677850291",
  "device_ref": "sandbox-2691",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "124c6ad7-222a-4f36-a32d-c130f98ebab2",
  "expires_at": "2026-10-30T19:19:14.317923544Z",
  "resend_available_at": "2026-10-30T19:14:15.317923544Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380677850291` → **200**

```json
{
  "phone": "+380677850291",
  "audience": "CLIENT",
  "code": "006401",
  "sent_at": "2026-10-30T19:14:14.320427529Z",
  "channel": "VOICE"
}
```

## The SMS does not get through: one request, one attempt; the resend comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672870000",
  "device_ref": "sandbox-26755"
}
```

```json
{
  "challenge_id": "76bd0734-05ce-4e2c-aaf1-b4e9b1089b11",
  "expires_at": "2026-10-30T19:19:15.793241646Z",
  "resend_available_at": "2026-10-30T19:14:16.793241646Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672870000",
  "device_ref": "sandbox-4170"
}
```

```json
{
  "challenge_id": "a3ae347c-24b7-4fd0-895e-7587d2df547f",
  "expires_at": "2026-10-30T19:19:17.248059386Z",
  "resend_available_at": "2026-10-30T19:14:18.248059386Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380672870000` → **200**

```json
{
  "phone": "+380672870000",
  "audience": "CLIENT",
  "code": "546221",
  "sent_at": "2026-10-30T19:14:17.251555376Z",
  "channel": "VOICE"
}
```

## A second call in the hour is made, the third is refused

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672870000",
  "device_ref": "sandbox-12827",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "b48a08ab-7fdb-4d66-83fb-263d77066db7",
  "expires_at": "2026-10-30T19:19:18.72844897Z",
  "resend_available_at": "2026-10-30T19:14:19.72844897Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380672870000` → **200**

```json
{
  "phone": "+380672870000",
  "audience": "CLIENT",
  "code": "282586",
  "sent_at": "2026-10-30T19:14:18.731060256Z",
  "channel": "VOICE"
}
```

`POST /auth/v1/otp/challenges` → **429**

```json
{
  "audience": "CLIENT",
  "phone": "+380672870000",
  "device_ref": "sandbox-25283",
  "channel": "VOICE"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "65227033-901a-4cb6-815c-05f9bac96b70",
  "retryable": true,
  "retry_after_seconds": 3600
}
```

## Numbers outside Poland and Ukraine get nothing

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+442000017827"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "59a01a5b-82ff-4d92-ac17-1c6156c1f057"
}
```

`GET /sandbox/v1/otp?phone=%2B442000017827` → **404**

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+37120025627"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "0747e267-d636-4f6e-a7ce-6eb3fa394fca"
}
```

`GET /sandbox/v1/otp?phone=%2B37120025627` → **404**

## What support sees: the attempts, never the code

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "dbd93263-97d3-4739-b758-88d41e088bb5",
  "subject": {
    "type": "STAFF",
    "id": "50e6407f-123d-42ca-9890-64ec61c07dce"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MGU2NDA3Zi0xMjNkLTQyY2EtOTg5MC02NGVjNjFjMDdkY2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODg1NjEsImlhdCI6MTc5MzM4NzY2MSwianRpIjoiMTM3Mzk5ZTgtMDQzMS00NDI4LTk3ZDMtZWM4NDNjMzhhNmJlIiwic2lkIjoiZGJkOTMyNjMtOTdkMy00NzM5LWI3NTgtODhkNDFlMDg4YmI1In0.HzYzob4XSiRtqOUFY2E-rQZ674tDciYAX7EApMU5vFY",
  "access_expires_at": "2026-10-30T19:29:21.255031792Z",
  "refresh_token": "qN1n1bQodLnA3OrsHpBE5RVB9Htv84ZOzOLJ9L5ybqo",
  "refresh_expires_at": "2026-10-31T07:14:21.254576506Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380672870000` → **200**

```json
{
  "deliveries": [
    {
      "id": "19ad8ebd-8f73-453b-acd5-089919e579c0",
      "challenge_id": "b48a08ab-7fdb-4d66-83fb-263d77066db7",
      "phone": "+380672870000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-1ddc1e77-b3d0-47f7-bb80-1b4d65223bbf",
      "error": null,
      "attempted_at": "2026-10-30T19:14:18.731299Z"
    },
    {
      "id": "a3500852-bb78-4602-8e01-926cdaadab23",
      "challenge_id": "a3ae347c-24b7-4fd0-895e-7587d2df547f",
      "phone": "+380672870000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-e348cef8-1294-4082-9957-44f2e3d939a3",
      "error": null,
      "attempted_at": "2026-10-30T19:14:17.251801Z"
    },
    {
      "id": "4821a4df-e3bf-4a3f-a84d-6362e4488edd",
      "challenge_id": "76bd0734-05ce-4e2c-aaf1-b4e9b1089b11",
      "phone": "+380672870000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-30T19:14:15.795329Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380672870000` → **200**

```json
{
  "phone": "+380672870000",
  "audience": "CLIENT",
  "code": "282586",
  "sent_at": "2026-10-30T19:14:18.731060256Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380677850291` → **200**

```json
{
  "deliveries": [
    {
      "id": "5f9eb9d1-6635-405d-9680-c2935a281128",
      "challenge_id": "124c6ad7-222a-4f36-a32d-c130f98ebab2",
      "phone": "+380677850291",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-aa5f9177-9567-473f-ba2b-da39299b58a2",
      "error": null,
      "attempted_at": "2026-10-30T19:14:14.320883Z"
    },
    {
      "id": "499d47c5-af71-463a-afc5-ca95677f9714",
      "challenge_id": "d2449e81-407b-4ff2-abd9-10df07ea111c",
      "phone": "+380677850291",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-e65e55a7-883b-4a32-ac00-5d97863bf519",
      "error": null,
      "attempted_at": "2026-10-30T19:14:12.851765Z"
    }
  ]
}
```

Done: SMS to +380675306175; SMS then a call to +380677850291; a failed SMS, two calls and a refused third to +380672870000; +44 and +371 refused.

# Scenario: outgoing-call

## The admin gives the operator an internal number

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "cbea1d70-11d1-49ff-958a-9c4648f146cf",
  "subject": {
    "type": "STAFF",
    "id": "50e6407f-123d-42ca-9890-64ec61c07dce"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MGU2NDA3Zi0xMjNkLTQyY2EtOTg5MC02NGVjNjFjMDdkY2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODg1NjIsImlhdCI6MTc5MzM4NzY2MiwianRpIjoiZjA4ZmZlNWEtMDRkZS00NWM4LWE2YWMtMmFkZTJhOTEyOGM5Iiwic2lkIjoiY2JlYTFkNzAtMTFkMS00OWZmLTk1OGEtOWM0NjQ4ZjE0NmNmIn0.Z6HG0TTFR2TjDXXGZSaS37cPjWHuv6cdluhyL3OH2Ac",
  "access_expires_at": "2026-10-30T19:29:22.325138449Z",
  "refresh_token": "S2XzQ_RP6SBWYRcyM7Jd_GAhjGF47D8dCXvqKGpfk-c",
  "refresh_expires_at": "2026-10-31T07:14:22.324500137Z",
  "password_change_required": false
}
```

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "OPERATOR",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "8796cc7d-4086-498a-9bbe-c39094aa58f1",
  "subject": {
    "type": "STAFF",
    "id": "50e6407f-123d-42ca-9890-64ec61c07dce"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MGU2NDA3Zi0xMjNkLTQyY2EtOTg5MC02NGVjNjFjMDdkY2UiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODg1NjIsImlhdCI6MTc5MzM4NzY2MiwianRpIjoiMWVlMDE1ZmEtMGQ0Mi00MzcwLTgyMzEtODYzNTZmMDJiNDMwIiwic2lkIjoiODc5NmNjN2QtNDA4Ni00OThhLTliYmUtYzM5MDk0YWE1OGYxIn0.kvv0KEoXh-2QxO0eCgqDsevYlbX1QKmv0OzDg2BDYLM",
  "access_expires_at": "2026-10-30T19:29:22.829390472Z",
  "refresh_token": "-lIizzfnbdE0eNFPiT0MWSKxjec6-a37Y3Os65wiOkU",
  "refresh_expires_at": "2026-10-31T07:14:22.828935676Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "50e6407f-123d-42ca-9890-64ec61c07dce",
    "login": "admin",
    "profile": {
      "first_name": "Super",
      "last_name": "Admin",
      "contacts": {
        "phone": null,
        "email": null,
        "telegram": null
      },
      "role": "SUPER_ADMIN",
      "permissions": [],
      "all_cities": true,
      "city_ids": []
    },
    "state": "ACTIVE",
    "password_change_required": false,
    "version": 0
  },
  "effective_permissions": [
    "orders.create",
    "orders.cancel",
    "orders.reassign",
    "orders.interrupt",
    "orders.view",
    "calls.answer",
    "calls.listen",
    "calls.supervise",
    "driver.review",
    "drivers.risk",
    "geo.manage",
    "pricing.manage",
    "finance.manage",
    "wallets.manage",
    "payments.retry",
    "promotions.manage",
    "support.manage",
    "clients.manage",
    "clients.delete",
    "operator-bonuses.manage",
    "retention.manage",
    "settings.manage",
    "flags.manage",
    "integrations.manage",
    "audit.view",
    "reports.view",
    "legal.manage"
  ]
}
```

`GET /api/admin/v1/staff-extensions` → **200**

```json
{
  "extensions": []
}
```

`POST /api/admin/v1/staff-extensions/50e6407f-123d-42ca-9890-64ec61c07dce` → **200**

```json
{
  "command_id": "fc954258-24e3-4400-a278-b6a28deccb28",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "50e6407f-123d-42ca-9890-64ec61c07dce",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "2a59667b-d3a7-468c-84ad-2a145a4b43fd",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T19:14:23.811153Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T19:14:23.811153Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "8fa10720-6718-4edd-bd3b-d36a1f7954a0",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  }
}
```

```json
{
  "id": "eae84593-0e01-4c99-8cb1-10da3f22c0a1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T19:19:24.299534Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false,
  "discount_minor": 0,
  "to_pay_minor": 10517,
  "promotions": []
}
```

`POST /api/operator/v1/orders` → **201**

```json
{
  "command_id": "2a659cf3-aac4-4845-a43a-de5fee15ff94",
  "quote_id": "eae84593-0e01-4c99-8cb1-10da3f22c0a1",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "caller": {
    "name": "Caller",
    "phone": "+380677123233"
  }
}
```

```json
{
  "id": "aee11ef0-0685-4c75-9cdd-e855585b65a2",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "PHONE",
  "payer_client_id": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T19:14:24.574834Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677123233"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/aee11ef0-0685-4c75-9cdd-e855585b65a2/calls` → **201**

```json
{
  "command_id": "2e963fe8-c53f-42fa-b4d8-8ebd193b97c7",
  "to": "CALLER"
}
```

```json
{
  "id": "33afd56d-134f-4036-95fc-34a91caf1748",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "50e6407f-123d-42ca-9890-64ec61c07dce",
  "order_ids": [
    "aee11ef0-0685-4c75-9cdd-e855585b65a2"
  ],
  "started_at": "2026-10-30T19:14:24.875801Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/aee11ef0-0685-4c75-9cdd-e855585b65a2/calls` → **201**

```json
{
  "command_id": "2e963fe8-c53f-42fa-b4d8-8ebd193b97c7",
  "to": "CALLER"
}
```

```json
{
  "id": "33afd56d-134f-4036-95fc-34a91caf1748",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "50e6407f-123d-42ca-9890-64ec61c07dce",
  "order_ids": [
    "aee11ef0-0685-4c75-9cdd-e855585b65a2"
  ],
  "started_at": "2026-10-30T19:14:24.875801Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "33afd56d-134f-4036-95fc-34a91caf1748",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380677123233",
    "at": "2026-10-30T19:14:24.878872218Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "33afd56d-134f-4036-95fc-34a91caf1748",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.6061",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "33afd56d-134f-4036-95fc-34a91caf1748"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "33afd56d-134f-4036-95fc-34a91caf1748",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=aee11ef0-0685-4c75-9cdd-e855585b65a2` → **200**

```json
{
  "calls": [
    {
      "id": "33afd56d-134f-4036-95fc-34a91caf1748",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "50e6407f-123d-42ca-9890-64ec61c07dce",
      "order_ids": [
        "aee11ef0-0685-4c75-9cdd-e855585b65a2"
      ],
      "started_at": "2026-10-30T19:14:24.875801Z",
      "answered_at": "2026-10-30T19:14:25.468416Z",
      "ended_at": "2026-10-30T19:14:25.489534Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
```

`GET /api/operator/v1/calls?order_id=aee11ef0-0685-4c75-9cdd-e855585b65a2` → **200**

```json
{
  "calls": [
    {
      "id": "33afd56d-134f-4036-95fc-34a91caf1748",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "50e6407f-123d-42ca-9890-64ec61c07dce",
      "order_ids": [
        "aee11ef0-0685-4c75-9cdd-e855585b65a2"
      ],
      "started_at": "2026-10-30T19:14:24.875801Z",
      "answered_at": "2026-10-30T19:14:25.468416Z",
      "ended_at": "2026-10-30T19:14:25.489534Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
```

`GET /api/operator/v1/calls?order_id=aee11ef0-0685-4c75-9cdd-e855585b65a2` → **200**

```json
{
  "calls": [
    {
      "id": "33afd56d-134f-4036-95fc-34a91caf1748",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "50e6407f-123d-42ca-9890-64ec61c07dce",
      "order_ids": [
        "aee11ef0-0685-4c75-9cdd-e855585b65a2"
      ],
      "started_at": "2026-10-30T19:14:24.875801Z",
      "answered_at": "2026-10-30T19:14:25.468416Z",
      "ended_at": "2026-10-30T19:14:25.489534Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T19:14:28.214644Z"
      }
    }
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/aee11ef0-0685-4c75-9cdd-e855585b65a2` → **200**

```json
{
  "id": "aee11ef0-0685-4c75-9cdd-e855585b65a2",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "PHONE",
  "payer_client_id": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T19:14:24.574834Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677123233"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/aee11ef0-0685-4c75-9cdd-e855585b65a2/cancel` → **200**

```json
{
  "command_id": "05462d66-619b-4afd-8e47-1b488b1e0b18",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "aee11ef0-0685-4c75-9cdd-e855585b65a2",
  "short_number": 26,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 3,
  "channel": "PHONE",
  "payer_client_id": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "STOPPED",
  "assignment": null,
  "created_at": "2026-10-30T19:14:24.574834Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677123233"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "pl": "Brak wolnych aut",
      "uk": "Немає вільних авто",
      "en": "No cars available",
      "ru": "Нет свободных машин"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "ad228f0b-44c9-4332-b406-3161cf96c7be",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-30T19:14:30.808621Z",
  "extension": "101"
}
```

Done: outgoing call 33afd56d-134f-4036-95fc-34a91caf1748 from order aee11ef0-0685-4c75-9cdd-e855585b65a2, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632436194",
  "device_ref": "sandbox-2634"
}
```

```json
{
  "challenge_id": "cb6fc3d6-9f12-4368-b50c-7d37cd05dfb4",
  "expires_at": "2026-10-30T19:19:31.079715085Z",
  "resend_available_at": "2026-10-30T19:14:32.079715085Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632436194` → **200**

```json
{
  "phone": "+380632436194",
  "audience": "CLIENT",
  "code": "035665",
  "sent_at": "2026-10-30T19:14:31.081984554Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cb6fc3d6-9f12-4368-b50c-7d37cd05dfb4",
  "code": "035665",
  "device_ref": "sandbox-2634"
}
```

```json
{
  "session_id": "91ab8577-08fc-47c6-9e3d-48f73e941464",
  "subject": {
    "type": "CLIENT",
    "id": "8edf939d-d0b1-469c-b234-5f3d7da2ebc9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZWRmOTM5ZC1kMGIxLTQ2OWMtYjIzNC01ZjNkN2RhMmViYzkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzg4NTcxLCJpYXQiOjE3OTMzODc2NzEsImp0aSI6Ijk1M2ZhYzdlLWRjZWEtNGZiNC04NjdkLWRlMjc5ZjFkNmU5MCIsInNpZCI6IjkxYWI4NTc3LTA4ZmMtNDdjNi05ZTNkLTQ4ZjczZTk0MTQ2NCJ9.bGfYdjGotuiRBYcAB0N1N1xHNM0bahS3IaF5SeUnCHo",
  "access_expires_at": "2026-10-30T19:29:31.349952742Z",
  "refresh_token": "KQitEv-puvxSHXtgTFNN9hiRu18qsjXbs6hVguxEhnc",
  "refresh_expires_at": "2026-11-29T19:14:31.349437826Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "8edf939d-d0b1-469c-b234-5f3d7da2ebc9",
  "session_id": "91ab8577-08fc-47c6-9e3d-48f73e941464",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632436194",
  "device_ref": "sandbox-28972"
}
```

```json
{
  "challenge_id": "ba565afd-c3d1-4706-ac93-1fecf0749034",
  "expires_at": "2026-10-30T19:19:33.853367555Z",
  "resend_available_at": "2026-10-30T19:14:34.853367555Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632436194` → **200**

```json
{
  "phone": "+380632436194",
  "audience": "CLIENT",
  "code": "519994",
  "sent_at": "2026-10-30T19:14:33.85534193Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ba565afd-c3d1-4706-ac93-1fecf0749034",
  "code": "519994",
  "device_ref": "sandbox-28972"
}
```

```json
{
  "session_id": "23c16dca-2d9a-48e8-a04e-7010a9fc49e0",
  "subject": {
    "type": "CLIENT",
    "id": "8edf939d-d0b1-469c-b234-5f3d7da2ebc9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZWRmOTM5ZC1kMGIxLTQ2OWMtYjIzNC01ZjNkN2RhMmViYzkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzg4NTc0LCJpYXQiOjE3OTMzODc2NzQsImp0aSI6Ijc2ZTBlNmU0LTU0NjUtNDEwYi04MjgzLWZmNWRmYzE1NDBlNiIsInNpZCI6IjIzYzE2ZGNhLTJkOWEtNDhlOC1hMDRlLTcwMTBhOWZjNDllMCJ9.17DKuLf_6PHWoSaTiZtEyp5yHKuOt7iKSQEtpiH_u_k",
  "access_expires_at": "2026-10-30T19:29:34.12814264Z",
  "refresh_token": "XP5NOmDc4K_6n1oThqW9dPNGkJdto7cKcURvGCTnpSw",
  "refresh_expires_at": "2026-11-29T19:14:34.127661244Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "aa87bac2-5aaf-434b-8256-301a025ab632",
  "expires_at": "2026-10-30T19:19:36.380408874Z",
  "resend_available_at": "2026-10-30T19:14:37.380408874Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632436194` → **200**

```json
{
  "phone": "+380632436194",
  "audience": "CLIENT",
  "code": "155345",
  "sent_at": "2026-10-30T19:14:36.433071536Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380638316363"
}
```

```json
{
  "challenge_id": "f5e74ec9-b62b-49a1-8bba-84ca15fbdc1a",
  "expires_at": "2026-10-30T19:19:36.69424978Z",
  "resend_available_at": "2026-10-30T19:14:37.69424978Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638316363` → **200**

```json
{
  "phone": "+380638316363",
  "audience": "CLIENT",
  "code": "853890",
  "sent_at": "2026-10-30T19:14:36.696520308Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "7380f083-b74a-4e6b-afdc-005f925a6990",
  "current_challenge_id": "aa87bac2-5aaf-434b-8256-301a025ab632",
  "current_code": "000000",
  "new_challenge_id": "f5e74ec9-b62b-49a1-8bba-84ca15fbdc1a",
  "new_code": "853890"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "e96cfb38-671d-44c1-a298-0dfc42f4a4ac"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "02704bb5-a874-4e34-a1cf-b62cfbf84030",
  "current_challenge_id": "aa87bac2-5aaf-434b-8256-301a025ab632",
  "current_code": "155345",
  "new_challenge_id": "f5e74ec9-b62b-49a1-8bba-84ca15fbdc1a",
  "new_code": "853890"
}
```

```json
{
  "subject_id": "8edf939d-d0b1-469c-b234-5f3d7da2ebc9",
  "phone": "+380638316363",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "8edf939d-d0b1-469c-b234-5f3d7da2ebc9",
  "session_id": "91ab8577-08fc-47c6-9e3d-48f73e941464",
  "account_state": "ACTIVE"
}
```

`GET /api/rider/v1/me` → **401**

```json
{
  "instance": "/api/rider/v1/me",
  "status": 401,
  "title": "Unauthenticated",
  "type": "https://errors.blizz.taxi/unauthenticated",
  "code": "UNAUTHENTICATED",
  "correlation_id": "1cb25c7b-d4bf-4e24-a560-9439f209f71a"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638316363",
  "device_ref": "sandbox-11834"
}
```

```json
{
  "challenge_id": "07874bf3-7602-4ee1-b888-200926883721",
  "expires_at": "2026-10-30T19:19:39.949998303Z",
  "resend_available_at": "2026-10-30T19:14:40.949998303Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638316363` → **200**

```json
{
  "phone": "+380638316363",
  "audience": "CLIENT",
  "code": "925513",
  "sent_at": "2026-10-30T19:14:39.951999629Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "07874bf3-7602-4ee1-b888-200926883721",
  "code": "925513",
  "device_ref": "sandbox-11834"
}
```

```json
{
  "session_id": "db6b4a42-047f-4064-96a6-c9dfa433a9fc",
  "subject": {
    "type": "CLIENT",
    "id": "8edf939d-d0b1-469c-b234-5f3d7da2ebc9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZWRmOTM5ZC1kMGIxLTQ2OWMtYjIzNC01ZjNkN2RhMmViYzkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzg4NTgwLCJpYXQiOjE3OTMzODc2ODAsImp0aSI6IjI3NzViYzkzLTI5NDQtNDI1Yy1hNzdmLWFlMjJiZmMwMDJhMCIsInNpZCI6ImRiNmI0YTQyLTA0N2YtNDA2NC05NmE2LWM5ZGZhNDMzYTlmYyJ9.xzrx_GzXOz5UgL85St730GlfDEa_wtte-LKKgzLyN3s",
  "access_expires_at": "2026-10-30T19:29:40.219732834Z",
  "refresh_token": "RT2n_GvP6nsHUe2bqMWy8hmdxh0tBZP7Koh8HLWjYL8",
  "refresh_expires_at": "2026-11-29T19:14:40.219331299Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "8edf939d-d0b1-469c-b234-5f3d7da2ebc9",
  "session_id": "db6b4a42-047f-4064-96a6-c9dfa433a9fc",
  "account_state": "ACTIVE"
}
```

## The rider loses the phone: support checks who it is and sends a code to the new phone

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "48c011b1-c424-4edf-b46e-0847456c092c",
  "subject": {
    "type": "STAFF",
    "id": "50e6407f-123d-42ca-9890-64ec61c07dce"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MGU2NDA3Zi0xMjNkLTQyY2EtOTg5MC02NGVjNjFjMDdkY2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODg1ODAsImlhdCI6MTc5MzM4NzY4MCwianRpIjoiOTdkNTNmNzItZThjMS00NGQ3LTljZjItZDkwZTNhMGY2NjExIiwic2lkIjoiNDhjMDExYjEtYzQyNC00ZWRmLWI0NmUtMDg0NzQ1NmMwOTJjIn0.CpkMGHBXSKfDv51vD3lAxgly-28Swlii3jHOuqdmxhQ",
  "access_expires_at": "2026-10-30T19:29:40.947501927Z",
  "refresh_token": "aO9ovabCYR7Z8Ucuqne2x5nXiLMbHOiY86K2H42pU0A",
  "refresh_expires_at": "2026-10-31T07:14:40.947033812Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/8edf939d-d0b1-469c-b234-5f3d7da2ebc9` → **200**

```json
{
  "client": {
    "id": "8edf939d-d0b1-469c-b234-5f3d7da2ebc9",
    "phone": "+380638316363",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T19:14:31.348089Z",
    "version": 3,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [],
  "bonuses": [],
  "debt": [],
  "cases": []
}
```

`POST /api/admin/v1/clients/8edf939d-d0b1-469c-b234-5f3d7da2ebc9/phone/new-code` → **201**

```json
{
  "phone": "+380639341455"
}
```

```json
{
  "challenge_id": "b39547af-a285-4e1b-b9fe-a78cf7138790",
  "expires_at": "2026-10-30T19:19:41.484650392Z",
  "resend_available_at": "2026-10-30T19:14:42.484650392Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639341455` → **200**

```json
{
  "phone": "+380639341455",
  "audience": "CLIENT",
  "code": "996440",
  "sent_at": "2026-10-30T19:14:41.487156869Z",
  "channel": "SMS"
}
```

## Without the right code nothing changes; with it, support sets the phone

`POST /api/admin/v1/clients/8edf939d-d0b1-469c-b234-5f3d7da2ebc9/phone` → **422**

```json
{
  "command_id": "ef1a6c89-6fbb-48a7-adb7-547754a2c6c5",
  "expected_version": 3,
  "new_challenge_id": "b39547af-a285-4e1b-b9fe-a78cf7138790",
  "new_code": "996441",
  "reason": "Passport checked at the office"
}
```

```json
{
  "instance": "/api/admin/v1/clients/8edf939d-d0b1-469c-b234-5f3d7da2ebc9/phone",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "d88a4109-9ce9-47fa-8c78-e3aaf951fa20"
}
```

`POST /api/admin/v1/clients/8edf939d-d0b1-469c-b234-5f3d7da2ebc9/phone` → **400**

```json
{
  "command_id": "344b4530-ccd7-42d7-9268-6d16f3ba0e19",
  "expected_version": 3,
  "new_challenge_id": "b39547af-a285-4e1b-b9fe-a78cf7138790",
  "new_code": "996440",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/8edf939d-d0b1-469c-b234-5f3d7da2ebc9/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "dfc3c983-abb1-4be3-9d64-52f74d9353b0",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

`POST /api/admin/v1/clients/8edf939d-d0b1-469c-b234-5f3d7da2ebc9/phone` → **200**

```json
{
  "command_id": "d0946dbe-b78e-4587-84a4-073c780eed0b",
  "expected_version": 3,
  "new_challenge_id": "b39547af-a285-4e1b-b9fe-a78cf7138790",
  "new_code": "996440",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "8edf939d-d0b1-469c-b234-5f3d7da2ebc9",
  "phone": "+380639341455",
  "version": 4
}
```

`GET /api/rider/v1/me` → **401**

```json
{
  "instance": "/api/rider/v1/me",
  "status": 401,
  "title": "Unauthenticated",
  "type": "https://errors.blizz.taxi/unauthenticated",
  "code": "UNAUTHENTICATED",
  "correlation_id": "5a26e4a9-3408-47f4-9319-e8efbb33c1d6"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639341455",
  "device_ref": "sandbox-10369"
}
```

```json
{
  "challenge_id": "f5dbcb48-591b-4cc7-ac3e-e3f00d8579df",
  "expires_at": "2026-10-30T19:19:42.70849651Z",
  "resend_available_at": "2026-10-30T19:14:43.70849651Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639341455` → **200**

```json
{
  "phone": "+380639341455",
  "audience": "CLIENT",
  "code": "249208",
  "sent_at": "2026-10-30T19:14:42.710594978Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f5dbcb48-591b-4cc7-ac3e-e3f00d8579df",
  "code": "249208",
  "device_ref": "sandbox-10369"
}
```

```json
{
  "session_id": "97a291bc-7fe1-4cf2-a8d8-ce56194f8002",
  "subject": {
    "type": "CLIENT",
    "id": "8edf939d-d0b1-469c-b234-5f3d7da2ebc9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZWRmOTM5ZC1kMGIxLTQ2OWMtYjIzNC01ZjNkN2RhMmViYzkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzg4NTgyLCJpYXQiOjE3OTMzODc2ODIsImp0aSI6IjdjNTcyZGNjLTJiMWEtNDYyNS1iNmRjLTczYjQ5MTdkNzk0MSIsInNpZCI6Ijk3YTI5MWJjLTdmZTEtNGNmMi1hOGQ4LWNlNTYxOTRmODAwMiJ9.X03kF8XcIeBVLL0n7yXdQrayTEUAT2E4FI2VFAj0ZGw",
  "access_expires_at": "2026-10-30T19:29:42.969510684Z",
  "refresh_token": "E9sbHbm0FE-dixGKKJtzAEdt0h_M3fXQM90biTvYczc",
  "refresh_expires_at": "2026-11-29T19:14:42.969061959Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "8edf939d-d0b1-469c-b234-5f3d7da2ebc9",
  "session_id": "97a291bc-7fe1-4cf2-a8d8-ce56194f8002",
  "account_state": "ACTIVE"
}
```

Done: changed with both codes (one was not enough), then by support with a code to the new phone and a reason; sessions ended each time.

# Scenario: places

## A new rider searches: no history yet, the provider answers

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639547234",
  "device_ref": "sandbox-10652"
}
```

```json
{
  "challenge_id": "d82d5332-e96c-4728-963e-e8df94981878",
  "expires_at": "2026-10-30T19:19:43.448635807Z",
  "resend_available_at": "2026-10-30T19:14:44.448635807Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639547234` → **200**

```json
{
  "phone": "+380639547234",
  "audience": "CLIENT",
  "code": "542858",
  "sent_at": "2026-10-30T19:14:43.450625011Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d82d5332-e96c-4728-963e-e8df94981878",
  "code": "542858",
  "device_ref": "sandbox-10652"
}
```

```json
{
  "session_id": "83a45384-71aa-4aa8-988a-6fd08c4296d3",
  "subject": {
    "type": "CLIENT",
    "id": "f18f2c67-c8b6-453e-8885-8cb2b1424a66"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmMThmMmM2Ny1jOGI2LTQ1M2UtODg4NS04Y2IyYjE0MjRhNjYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzg4NTgzLCJpYXQiOjE3OTMzODc2ODMsImp0aSI6IjI0YTkwNjYyLTA3ZGYtNDUzNS04OGMzLTNmNDZkNDA4NTYyZSIsInNpZCI6IjgzYTQ1Mzg0LTcxYWEtNGFhOC05ODhhLTZmZDA4YzQyOTZkMyJ9.EM0v7hxmr7DB7y3OXfxe-CeLtcEadIf9iW5t2diOgPo",
  "access_expires_at": "2026-10-30T19:29:43.707478855Z",
  "refresh_token": "zjW7jhOo1KfmtWDCCUbAs7iheHfBMyejTLEzrtm2f4E",
  "refresh_expires_at": "2026-11-29T19:14:43.707049108Z",
  "account_created": true
}
```

`GET /api/rider/v1/places?query=%D0%9C%D0%B0%D0%B9%D0%B4%D0%B0%D0%BD&lat=50.4501&lon=30.5234` → **200**

```json
{
  "provider": "FAKE",
  "places": [
    {
      "source": "FAKE",
      "address_id": null,
      "label": "Майдан, 1",
      "street": "Майдан",
      "house": "1",
      "point": {
        "lat": 50.4531,
        "lon": 30.5234
      },
      "instructions": null
    },
    {
      "source": "FAKE",
      "address_id": null,
      "label": "Майдан, 2",
      "street": "Майдан",
      "house": "2",
      "point": {
        "lat": 50.4561,
        "lon": 30.5234
      },
      "instructions": null
    },
    {
      "source": "FAKE",
      "address_id": null,
      "label": "Майдан, 3",
      "street": "Майдан",
      "house": "3",
      "point": {
        "lat": 50.4591,
        "lon": 30.5234
      },
      "instructions": null
    }
  ]
}
```

## A point on the map gives an address

`GET /api/rider/v1/places/reverse?lat=50.4501&lon=30.5234` → **200**

```json
{
  "source": "FAKE",
  "address_id": null,
  "label": "Fake street 1",
  "street": "Fake street",
  "house": "1",
  "point": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "instructions": null
}
```

## The operator searches for a caller

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "OPERATOR",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "98d65ea8-3c0f-403c-acf9-ef201ad14e71",
  "subject": {
    "type": "STAFF",
    "id": "50e6407f-123d-42ca-9890-64ec61c07dce"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MGU2NDA3Zi0xMjNkLTQyY2EtOTg5MC02NGVjNjFjMDdkY2UiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODg1ODQsImlhdCI6MTc5MzM4NzY4NCwianRpIjoiYmRjMThjMjItYzdhOC00Yzk0LThjZWEtYzI4MzVkZWUzODMzIiwic2lkIjoiOThkNjVlYTgtM2MwZi00MDNjLWFjZjktZWYyMDFhZDE0ZTcxIn0.4-eT-Kp3mvEZdu0YVXp-9_3AMY1RYwOOddO7LBP4gRc",
  "access_expires_at": "2026-10-30T19:29:44.685171572Z",
  "refresh_token": "5Chq1NixNgTTcjHZ1z41Y0ROWxPqigCety5IJ6ubGUY",
  "refresh_expires_at": "2026-10-31T07:14:44.684716797Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380639547234` → **200**

```json
{
  "provider": "FAKE",
  "places": [
    {
      "source": "FAKE",
      "address_id": null,
      "label": "Вокзал, 1",
      "street": "Вокзал",
      "house": "1",
      "point": {
        "lat": 50.4531,
        "lon": 30.5234
      },
      "instructions": null
    },
    {
      "source": "FAKE",
      "address_id": null,
      "label": "Вокзал, 2",
      "street": "Вокзал",
      "house": "2",
      "point": {
        "lat": 50.4561,
        "lon": 30.5234
      },
      "instructions": null
    },
    {
      "source": "FAKE",
      "address_id": null,
      "label": "Вокзал, 3",
      "street": "Вокзал",
      "house": "3",
      "point": {
        "lat": 50.4591,
        "lon": 30.5234
      },
      "instructions": null
    }
  ]
}
```

## Outside the service area

`GET /api/rider/v1/places?query=x&lat=10&lon=10` → **422**

```json
{
  "instance": "/api/rider/v1/places",
  "status": 422,
  "title": "Outside service area",
  "type": "https://errors.blizz.taxi/outside-service-area",
  "code": "OUTSIDE_SERVICE_AREA",
  "correlation_id": "b844ee28-8961-44be-bd32-654cc7cf99de"
}
```

Done: address search through FAKE.

# Scenario: preorders

## The admin switches pre-orders to reservations

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "c915820f-d90a-4b25-8b55-8377b1247b1e",
  "subject": {
    "type": "STAFF",
    "id": "50e6407f-123d-42ca-9890-64ec61c07dce"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MGU2NDA3Zi0xMjNkLTQyY2EtOTg5MC02NGVjNjFjMDdkY2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODg1ODUsImlhdCI6MTc5MzM4NzY4NSwianRpIjoiMWNiNWE5MjQtYTg3NS00NTMxLWIwZDktODIxMmJkNWYwMWYxIiwic2lkIjoiYzkxNTgyMGYtZDkwYS00YjI1LThiNTUtODM3N2IxMjQ3YjFlIn0.qxMrbTPglIg2xJy3sevgpVbd9I564eVb1E-fESGIUKg",
  "access_expires_at": "2026-10-30T19:29:45.674320499Z",
  "refresh_token": "f1R34Sw2JSB-EfqaKAl4uEhshEsddYc_Pfg2A5-_kRk",
  "refresh_expires_at": "2026-10-31T07:14:45.673856521Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/settings` → **200**

```json
{
  "version": 2,
  "settings": {
    "brand": {
      "service_name": "Blizz Taxi",
      "primary_color": "#111111",
      "on_primary_color": "#FFFFFF",
      "accent_color": null,
      "logo_url": null,
      "support_phone": null,
      "support_email": null,
      "support_telegram": null,
      "privacy_policy_url": null,
      "terms_url": null
    },
    "languages": {
      "default_language": "ru",
      "enabled": [
        "uk",
        "pl",
        "ru",
        "en"
      ]
    },
    "calls": {
      "mode": "DIRECT",
      "service_phone": null
    },
    "preorders": {
      "threshold_minutes": 60,
      "max_days_ahead": 7,
      "dispatch": "BROADCAST_BEFORE",
      "release_minutes_before": 30,
      "confirm_minutes_before": 30,
      "confirm_window_minutes": 10,
      "driver_cancel_until_minutes_before": 60
    },
    "ratings": {
      "edit_window_hours": 24
    },
    "tips": {
      "window_hours": 24
    },
    "orders": {
      "active_per_payer": 3
    },
    "cash_not_received": {
      "credit_driver": true,
      "driver_share_percent": 100
    },
    "app_versions": {
      "rider_android": {
        "minimum_version": "0.0.0",
        "latest_version": "0.0.0"
      },
      "rider_ios": {
        "minimum_version": "0.0.0",
        "latest_version": "0.0.0"
      },
      "driver_android": {
        "minimum_version": "0.0.0",
        "latest_version": "0.0.0"
      },
      "driver_ios": {
        "minimum_version": "0.0.0",
        "latest_version": "0.0.0"
      },
      "require_version_header": false
    },
    "staff_top_ups": {
      "daily_max_per_staff_minor": {}
    }
  },
  "changed_by": "50e6407f-123d-42ca-9890-64ec61c07dce",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T18:59:28.952174Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "085f3ed6-62b4-4f0f-afcb-2c3b6a6fc537",
  "expected_version": 2,
  "settings": {
    "brand": {
      "service_name": "Blizz Taxi",
      "primary_color": "#111111",
      "on_primary_color": "#FFFFFF",
      "accent_color": null,
      "logo_url": null,
      "support_phone": null,
      "support_email": null,
      "support_telegram": null,
      "privacy_policy_url": null,
      "terms_url": null
    },
    "languages": {
      "default_language": "ru",
      "enabled": [
        "uk",
        "pl",
        "ru",
        "en"
      ]
    },
    "calls": {
      "mode": "DIRECT",
      "service_phone": null
    },
    "preorders": {
      "threshold_minutes": 60,
      "max_days_ahead": 7,
      "dispatch": "RESERVATION",
      "release_minutes_before": 30,
      "confirm_minutes_before": 30,
      "confirm_window_minutes": 10,
      "driver_cancel_until_minutes_before": 60
    },
    "ratings": {
      "edit_window_hours": 24
    },
    "tips": {
      "window_hours": 24
    },
    "orders": {
      "active_per_payer": 3
    },
    "cash_not_received": {
      "credit_driver": true,
      "driver_share_percent": 100
    },
    "app_versions": {
      "rider_android": {
        "minimum_version": "0.0.0",
        "latest_version": "0.0.0"
      },
      "rider_ios": {
        "minimum_version": "0.0.0",
        "latest_version": "0.0.0"
      },
      "driver_android": {
        "minimum_version": "0.0.0",
        "latest_version": "0.0.0"
      },
      "driver_ios": {
        "minimum_version": "0.0.0",
        "latest_version": "0.0.0"
      },
      "require_version_header": false
    },
    "staff_top_ups": {
      "daily_max_per_staff_minor": {}
    }
  },
  "reason": "Sandbox: pre-orders by reservation"
}
```

```json
{
  "version": 3,
  "settings": {
    "brand": {
      "service_name": "Blizz Taxi",
      "primary_color": "#111111",
      "on_primary_color": "#FFFFFF",
      "accent_color": null,
      "logo_url": null,
      "support_phone": null,
      "support_email": null,
      "support_telegram": null,
      "privacy_policy_url": null,
      "terms_url": null
    },
    "languages": {
      "default_language": "ru",
      "enabled": [
        "uk",
        "pl",
        "ru",
        "en"
      ]
    },
    "calls": {
      "mode": "DIRECT",
      "service_phone": null
    },
    "preorders": {
      "threshold_minutes": 60,
      "max_days_ahead": 7,
      "dispatch": "RESERVATION",
      "release_minutes_before": 30,
      "confirm_minutes_before": 30,
      "confirm_window_minutes": 10,
      "driver_cancel_until_minutes_before": 60
    },
    "ratings": {
      "edit_window_hours": 24
    },
    "tips": {
      "window_hours": 24
    },
    "orders": {
      "active_per_payer": 3
    },
    "cash_not_received": {
      "credit_driver": true,
      "driver_share_percent": 100
    },
    "app_versions": {
      "rider_android": {
        "minimum_version": "0.0.0",
        "latest_version": "0.0.0"
      },
      "rider_ios": {
        "minimum_version": "0.0.0",
        "latest_version": "0.0.0"
      },
      "driver_android": {
        "minimum_version": "0.0.0",
        "latest_version": "0.0.0"
      },
      "driver_ios": {
        "minimum_version": "0.0.0",
        "latest_version": "0.0.0"
      },
      "require_version_header": false
    },
    "staff_top_ups": {
      "daily_max_per_staff_minor": {}
    }
  },
  "changed_by": "50e6407f-123d-42ca-9890-64ec61c07dce",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-30T19:14:46.16780963Z"
}
```

## The rider books the airport for 2026-10-30T22:14:45Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600960749",
  "device_ref": "sandbox-7653"
}
```

```json
{
  "challenge_id": "21b14574-66b6-4cae-945f-104159cb7845",
  "expires_at": "2026-10-30T19:19:46.428950996Z",
  "resend_available_at": "2026-10-30T19:14:47.428950996Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600960749` → **200**

```json
{
  "phone": "+48600960749",
  "audience": "CLIENT",
  "code": "021986",
  "sent_at": "2026-10-30T19:14:46.431110416Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "21b14574-66b6-4cae-945f-104159cb7845",
  "code": "021986",
  "device_ref": "sandbox-7653"
}
```

```json
{
  "session_id": "c8a934e7-c705-4ddd-a68e-78108ffb691a",
  "subject": {
    "type": "CLIENT",
    "id": "8e531a62-b058-4eae-b21f-ae9745f9c55d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZTUzMWE2Mi1iMDU4LTRlYWUtYjIxZi1hZTk3NDVmOWM1NWQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzg4NTg2LCJpYXQiOjE3OTMzODc2ODYsImp0aSI6ImVkY2JjYTI0LTI3ZTAtNDNhMC04NzY4LWQ3YzM5NGY0MDdlYiIsInNpZCI6ImM4YTkzNGU3LWM3MDUtNGRkZC1hNjhlLTc4MTA4ZmZiNjkxYSJ9.8oO-0TzfRLGlcBXEMG11eWZaJeaNpbNZ-XCQ8FmW3YQ",
  "access_expires_at": "2026-10-30T19:29:46.698195396Z",
  "refresh_token": "KhCbgO6_QSFs2N0YHuHbtJJhhm0Kv361_vT4iWa-ZIA",
  "refresh_expires_at": "2026-11-29T19:14:46.6976993Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "9f52a004-bc5b-47af-9d8d-79ffa9bb6bb5",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-30T22:14:45Z"
}
```

```json
{
  "id": "8a6544d5-6274-4899-a2fc-d00681420b31",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T19:19:46.951183Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-30T22:14:45Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "48403e9f-83c2-48f7-abb4-71ffeaf4baf4",
  "quote_id": "8a6544d5-6274-4899-a2fc-d00681420b31",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "pickup_label": "Pałac Kultury i Nauki",
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "dropoff_label": "Lotnisko Chopina",
  "payment_method": "CASH",
  "pickup_at": "2026-10-30T22:14:45Z"
}
```

```json
{
  "id": "6ed66ae8-1f8c-4bfe-9456-ed1bca1da4fd",
  "short_number": 27,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "8e531a62-b058-4eae-b21f-ae9745f9c55d",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "pickup_label": "Pałac Kultury i Nauki",
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "dropoff_label": "Lotnisko Chopina",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 5436,
  "final_price_minor": null,
  "currency": "PLN",
  "search_phase": null,
  "assignment": null,
  "created_at": "2026-10-30T19:14:47.233266Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T22:14:45Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

## A driver in Warsaw sees it and reserves it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000001",
  "device_ref": "sandbox-24617"
}
```

```json
{
  "challenge_id": "3c2f49d2-3571-4da3-a918-6bc69db8f7d3",
  "expires_at": "2026-10-30T19:19:47.510400398Z",
  "resend_available_at": "2026-10-30T19:14:48.510400398Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "595273",
  "sent_at": "2026-10-30T19:14:47.51256794Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3c2f49d2-3571-4da3-a918-6bc69db8f7d3",
  "code": "595273",
  "device_ref": "sandbox-24617"
}
```

```json
{
  "session_id": "4eb87f63-c7d0-43ea-bd9a-56be96b06270",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4ODU4NywiaWF0IjoxNzkzMzg3Njg3LCJqdGkiOiJlYWQ4OGM4OC0wMDAwLTQ2NGMtYWNhNy0wZGM5ODAyOTc5YzAiLCJzaWQiOiI0ZWI4N2Y2My1jN2QwLTQzZWEtYmQ5YS01NmJlOTZiMDYyNzAifQ.JVbaOGS9RAW0G6FwKqRip13gC1d27q-DQd0LcTO0xqE",
  "access_expires_at": "2026-10-30T19:29:47.849504341Z",
  "refresh_token": "r2afgJHX-EG0kAnvjut7_sEnNI-z6d1vAxg1a7TJiQo",
  "refresh_expires_at": "2026-11-29T19:14:47.8489053Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": null,
  "session_version": 0,
  "session_state": "CLOSED",
  "intent": null,
  "connection": "DISCONNECTED",
  "geolocation": "UNAVAILABLE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": null,
  "vehicle_id": null,
  "last_heartbeat_at": null,
  "last_location_at": null,
  "eligible": false,
  "ineligible_reasons": [
    "NO_OPEN_SESSION"
  ]
}
```

`POST /api/driver/v1/work-sessions` → **201**

```json
{
  "command_id": "e145fc79-cf75-41bc-ac3a-01fa25a1b3ea",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:14:48Z",
    "sequence": 1793387688508
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "162a0f82-0ae2-47b6-bf3b-de3e40a47c20",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "last_heartbeat_at": "2026-10-30T19:14:48.525763Z",
  "last_location_at": "2026-10-30T19:14:48.525763Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "6ed66ae8-1f8c-4bfe-9456-ed1bca1da4fd",
      "short_number": 27,
      "pickup_at": "2026-10-30T22:14:45Z",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 52.2297,
        "lon": 21.0122
      },
      "pickup_label": "Pałac Kultury i Nauki",
      "dropoff_label": "Lotnisko Chopina",
      "price_minor": 5436,
      "currency": "PLN",
      "payment_method": "CASH"
    }
  ]
}
```

`POST /api/driver/v1/preorders/6ed66ae8-1f8c-4bfe-9456-ed1bca1da4fd/reserve` → **200**

```json
{
  "command_id": "41d1fb10-de06-4cd4-aa23-3fc2811d314c"
}
```

```json
{
  "id": "67ebb31b-69d5-4ebb-a40e-aa80af10d7cd",
  "state": "RESERVED",
  "order": {
    "order_id": "6ed66ae8-1f8c-4bfe-9456-ed1bca1da4fd",
    "short_number": 27,
    "pickup_at": "2026-10-30T22:14:45Z",
    "vehicle_class": "STANDARD",
    "pickup": {
      "lat": 52.2297,
      "lon": 21.0122
    },
    "pickup_label": "Pałac Kultury i Nauki",
    "dropoff_label": "Lotnisko Chopina",
    "price_minor": 5436,
    "currency": "PLN",
    "payment_method": "CASH"
  },
  "reserved_at": "2026-10-30T19:14:49.009178Z",
  "confirm_from": "2026-10-30T21:44:45Z",
  "confirm_until": "2026-10-30T21:54:45Z",
  "drop_until": "2026-10-30T21:14:45Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "67ebb31b-69d5-4ebb-a40e-aa80af10d7cd",
      "state": "RESERVED",
      "order": {
        "order_id": "6ed66ae8-1f8c-4bfe-9456-ed1bca1da4fd",
        "short_number": 27,
        "pickup_at": "2026-10-30T22:14:45Z",
        "vehicle_class": "STANDARD",
        "pickup": {
          "lat": 52.2297,
          "lon": 21.0122
        },
        "pickup_label": "Pałac Kultury i Nauki",
        "dropoff_label": "Lotnisko Chopina",
        "price_minor": 5436,
        "currency": "PLN",
        "payment_method": "CASH"
      },
      "reserved_at": "2026-10-30T19:14:49.009178Z",
      "confirm_from": "2026-10-30T21:44:45Z",
      "confirm_until": "2026-10-30T21:54:45Z",
      "drop_until": "2026-10-30T21:14:45Z"
    }
  ]
}
```

## "On my way" is too early now; the operator sees who holds the order

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "67ebb31b-69d5-4ebb-a40e-aa80af10d7cd",
      "state": "RESERVED",
      "order": {
        "order_id": "6ed66ae8-1f8c-4bfe-9456-ed1bca1da4fd",
        "short_number": 27,
        "pickup_at": "2026-10-30T22:14:45Z",
        "vehicle_class": "STANDARD",
        "pickup": {
          "lat": 52.2297,
          "lon": 21.0122
        },
        "pickup_label": "Pałac Kultury i Nauki",
        "dropoff_label": "Lotnisko Chopina",
        "price_minor": 5436,
        "currency": "PLN",
        "payment_method": "CASH"
      },
      "reserved_at": "2026-10-30T19:14:49.009178Z",
      "confirm_from": "2026-10-30T21:44:45Z",
      "confirm_until": "2026-10-30T21:54:45Z",
      "drop_until": "2026-10-30T21:14:45Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/67ebb31b-69d5-4ebb-a40e-aa80af10d7cd/confirm` → **409**

```json
{
  "command_id": "ab492e2f-1659-4c8f-9d9b-a9e96df69551"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/67ebb31b-69d5-4ebb-a40e-aa80af10d7cd/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "ad53524f-a6c1-46c9-a74c-813ea2c0ec1b"
}
```

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "OPERATOR",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "e619ca5b-66dc-4d42-9ca9-b00269c82e18",
  "subject": {
    "type": "STAFF",
    "id": "50e6407f-123d-42ca-9890-64ec61c07dce"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MGU2NDA3Zi0xMjNkLTQyY2EtOTg5MC02NGVjNjFjMDdkY2UiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODg1OTAsImlhdCI6MTc5MzM4NzY5MCwianRpIjoiMDk2YzBjNzQtZDY0Yi00NzQ0LThlZTctZjRhMzA3YTlkODA2Iiwic2lkIjoiZTYxOWNhNWItNjZkYy00ZDQyLTljYTktYjAwMjY5YzgyZTE4In0.wyYUzE5JaCaEiTvKHXFPy86870XRQiEbwUWlYHpRUPM",
  "access_expires_at": "2026-10-30T19:29:50.235193097Z",
  "refresh_token": "tRXOAi20GI4UnSXvsS7US7KpHt1n2FJ93Guf8et971M",
  "refresh_expires_at": "2026-10-31T07:14:50.234702588Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/6ed66ae8-1f8c-4bfe-9456-ed1bca1da4fd` → **200**

```json
{
  "id": "6ed66ae8-1f8c-4bfe-9456-ed1bca1da4fd",
  "short_number": 27,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "8e531a62-b058-4eae-b21f-ae9745f9c55d",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "pickup_label": "Pałac Kultury i Nauki",
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "dropoff_label": "Lotnisko Chopina",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 5436,
  "final_price_minor": null,
  "currency": "PLN",
  "search_phase": null,
  "assignment": null,
  "created_at": "2026-10-30T19:14:47.233266Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-30T22:14:45Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "67ebb31b-69d5-4ebb-a40e-aa80af10d7cd",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-30T19:14:49.009178Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/6ed66ae8-1f8c-4bfe-9456-ed1bca1da4fd/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-30T19:14:47.234217Z",
      "actor": {
        "type": "CLIENT",
        "id": "8e531a62-b058-4eae-b21f-ae9745f9c55d",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "6ed66ae8-1f8c-4bfe-9456-ed1bca1da4fd",
        "preorder": true,
        "quote_id": "8a6544d5-6274-4899-a2fc-d00681420b31",
        "pickup_at": "2026-10-30T22:14:45Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "fe07d963-2cca-4630-8b51-ec0abe347ac3"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-30T19:14:49.01028Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "6ed66ae8-1f8c-4bfe-9456-ed1bca1da4fd",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "67ebb31b-69d5-4ebb-a40e-aa80af10d7cd"
      },
      "correlation_id": "abf2d306-14f1-4185-b44d-4c7b5ebcd622"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order 6ed66ae8-1f8c-4bfe-9456-ed1bca1da4fd, reservation 67ebb31b-69d5-4ebb-a40e-aa80af10d7cd.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-31241"
}
```

```json
{
  "challenge_id": "0dcc0322-496b-4acc-99a8-65d63ca1b3c7",
  "expires_at": "2026-10-30T19:19:50.978748386Z",
  "resend_available_at": "2026-10-30T19:14:51.978748386Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "162870",
  "sent_at": "2026-10-30T19:14:50.980863343Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0dcc0322-496b-4acc-99a8-65d63ca1b3c7",
  "code": "162870",
  "device_ref": "sandbox-31241"
}
```

```json
{
  "session_id": "04840ee2-5d7c-46fd-bf3e-3a7a743d73bd",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4ODU5MSwiaWF0IjoxNzkzMzg3NjkxLCJqdGkiOiI1YmU0YTM4Zi01ZDFlLTQ2ZWEtYmUxMC1kNjZkYzY0YzY1YTAiLCJzaWQiOiIwNDg0MGVlMi01ZDdjLTQ2ZmQtYmYzZS0zYTdhNzQzZDczYmQifQ.WpnDzLv3WDQJiB4SgInQCM6QIoKF4ADRgPQoXe3tHCE",
  "access_expires_at": "2026-10-30T19:29:51.243619236Z",
  "refresh_token": "1sVmJnltaT8eW1gYsV69umWdw2CeSv6eeC84JzQt9mw",
  "refresh_expires_at": "2026-11-29T19:14:51.243192109Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": null,
  "session_version": 0,
  "session_state": "CLOSED",
  "intent": null,
  "connection": "DISCONNECTED",
  "geolocation": "UNAVAILABLE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": null,
  "vehicle_id": null,
  "last_heartbeat_at": null,
  "last_location_at": null,
  "eligible": false,
  "ineligible_reasons": [
    "NO_OPEN_SESSION"
  ]
}
```

`POST /api/driver/v1/work-sessions` → **201**

```json
{
  "command_id": "271a4a72-74e5-418d-9ff3-acfb151649ab",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:14:51Z",
    "sequence": 1793387691734
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "992acc36-510d-462e-ba35-25c932eefedc",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T19:14:51.750592Z",
  "last_location_at": "2026-10-30T19:14:51.750592Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677328540",
  "device_ref": "sandbox-19149"
}
```

```json
{
  "challenge_id": "771a162e-359f-47c5-bdd4-3f23e518886a",
  "expires_at": "2026-10-30T19:19:51.988451697Z",
  "resend_available_at": "2026-10-30T19:14:52.988451697Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380677328540` → **200**

```json
{
  "phone": "+380677328540",
  "audience": "CLIENT",
  "code": "298634",
  "sent_at": "2026-10-30T19:14:51.990569579Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "771a162e-359f-47c5-bdd4-3f23e518886a",
  "code": "298634",
  "device_ref": "sandbox-19149"
}
```

```json
{
  "session_id": "ccf57122-395a-49d8-ae3c-887ff8783df7",
  "subject": {
    "type": "CLIENT",
    "id": "68466ec6-4817-498c-b4d7-a69c8785fabf"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ODQ2NmVjNi00ODE3LTQ5OGMtYjRkNy1hNjljODc4NWZhYmYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzg4NTkyLCJpYXQiOjE3OTMzODc2OTIsImp0aSI6IjA2YTU2YWNiLWU3YzctNDJhNS05NTY0LTc0YzcxM2Y1MzE3NiIsInNpZCI6ImNjZjU3MTIyLTM5NWEtNDlkOC1hZTNjLTg4N2ZmODc4M2RmNyJ9.pIqdr935p0TV-6eGnqMVMK_jrKDyfni7hF7AInEKzLI",
  "access_expires_at": "2026-10-30T19:29:52.248559406Z",
  "refresh_token": "c0ptAmDpcUlBmKVoFi1bciJ6puS3-SnZ1hIdguYX__M",
  "refresh_expires_at": "2026-11-29T19:14:52.248130471Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "7e09594a-f0cb-4c89-a15c-cd8af106ac63",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  }
}
```

```json
{
  "id": "e2707500-08e9-4c44-8d4e-58ae153ea0b8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T19:19:52.495649Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false,
  "discount_minor": 0,
  "to_pay_minor": 10517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "2b21c0b9-92d7-4924-a655-e830f37e4dbe",
  "quote_id": "e2707500-08e9-4c44-8d4e-58ae153ea0b8",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Ratings pickup",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "dropoff_label": "Ratings dropoff",
  "payment_method": "CASH"
}
```

```json
{
  "id": "553632c9-00d5-43da-a194-22123b8126c2",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "68466ec6-4817-498c-b4d7-a69c8785fabf",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Ratings pickup",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Ratings dropoff",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "PERSONAL",
  "assignment": null,
  "created_at": "2026-10-30T19:14:52.746859Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

## Driver accepts and completes the ride

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "9da65423-cfb6-429c-bb58-4b551ffbaabb",
    "order_id": "553632c9-00d5-43da-a194-22123b8126c2",
    "expires_at": "2026-10-30T19:15:07.749161Z",
    "vehicle_class": "STANDARD",
    "pickup": {
      "lat": 50.4501,
      "lon": 30.5234
    },
    "pickup_label": "Ratings pickup",
    "dropoff_label": "Ratings dropoff",
    "payment_method": "CASH",
    "price_minor": 10517,
    "currency": "UAH",
    "distance_m": 22
  }
]
```

`POST /api/driver/v1/offers/9da65423-cfb6-429c-bb58-4b551ffbaabb/accept` → **200**

```json
{
  "command_id": "7ff789b4-ca7d-4da3-8a7f-f6e4ca1b89dd"
}
```

```json
{
  "id": "02b12e81-8dbc-45cb-982e-62dfe2c6b4af",
  "order_id": "553632c9-00d5-43da-a194-22123b8126c2",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "77c89d53-107f-4f05-bd6e-44748922c38d",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "77c89d53-107f-4f05-bd6e-44748922c38d",
  "order_id": "553632c9-00d5-43da-a194-22123b8126c2",
  "assignment_id": "02b12e81-8dbc-45cb-982e-62dfe2c6b4af",
  "phase": "TO_PICKUP",
  "version": 0,
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Ratings pickup",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Ratings dropoff",
  "payment_method": "CASH",
  "price_minor": 10517,
  "currency": "UAH",
  "arrived_at": null,
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/992acc36-510d-462e-ba35-25c932eefedc/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:14:53Z",
    "sequence": 1793387693736
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "992acc36-510d-462e-ba35-25c932eefedc",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T19:14:53.753021Z",
  "last_location_at": "2026-10-30T19:14:53.753021Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "77c89d53-107f-4f05-bd6e-44748922c38d",
  "order_id": "553632c9-00d5-43da-a194-22123b8126c2",
  "assignment_id": "02b12e81-8dbc-45cb-982e-62dfe2c6b4af",
  "phase": "TO_PICKUP",
  "version": 0,
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Ratings pickup",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Ratings dropoff",
  "payment_method": "CASH",
  "price_minor": 10517,
  "currency": "UAH",
  "arrived_at": null,
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/77c89d53-107f-4f05-bd6e-44748922c38d/arrive` → **200**

```json
{
  "command_id": "d9697d47-195a-4a29-8de7-90cd4f1b923c",
  "expected_version": 0
}
```

```json
{
  "id": "77c89d53-107f-4f05-bd6e-44748922c38d",
  "order_id": "553632c9-00d5-43da-a194-22123b8126c2",
  "assignment_id": "02b12e81-8dbc-45cb-982e-62dfe2c6b4af",
  "phase": "WAITING",
  "version": 1,
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Ratings pickup",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Ratings dropoff",
  "payment_method": "CASH",
  "price_minor": 10517,
  "currency": "UAH",
  "arrived_at": "2026-10-30T19:14:54.221777Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/77c89d53-107f-4f05-bd6e-44748922c38d/start` → **200**

```json
{
  "command_id": "a976784c-618a-4008-b0d1-358b3b8fa5ca",
  "expected_version": 1
}
```

```json
{
  "id": "77c89d53-107f-4f05-bd6e-44748922c38d",
  "order_id": "553632c9-00d5-43da-a194-22123b8126c2",
  "assignment_id": "02b12e81-8dbc-45cb-982e-62dfe2c6b4af",
  "phase": "IN_PROGRESS",
  "version": 2,
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Ratings pickup",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Ratings dropoff",
  "payment_method": "CASH",
  "price_minor": 10517,
  "currency": "UAH",
  "arrived_at": "2026-10-30T19:14:54.221777Z",
  "started_at": "2026-10-30T19:14:54.467846Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

(the car drives 48 s to the next point)

`POST /api/driver/v1/work-sessions/992acc36-510d-462e-ba35-25c932eefedc/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:15:42Z",
    "sequence": 1793387742729
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "992acc36-510d-462e-ba35-25c932eefedc",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "ON_TRIP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T19:15:42.746589Z",
  "last_location_at": "2026-10-30T19:15:42.746589Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/77c89d53-107f-4f05-bd6e-44748922c38d/complete` → **200**

```json
{
  "command_id": "affa7e8e-a48e-4ecc-bce9-011df894faec",
  "expected_version": 2,
  "reported_at": "2026-10-30T19:15:42Z",
  "cash_received": true
}
```

```json
{
  "id": "77c89d53-107f-4f05-bd6e-44748922c38d",
  "order_id": "553632c9-00d5-43da-a194-22123b8126c2",
  "assignment_id": "02b12e81-8dbc-45cb-982e-62dfe2c6b4af",
  "phase": "COMPLETED",
  "version": 3,
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Ratings pickup",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Ratings dropoff",
  "payment_method": "CASH",
  "price_minor": 10517,
  "currency": "UAH",
  "arrived_at": "2026-10-30T19:14:54.221777Z",
  "started_at": "2026-10-30T19:14:54.467846Z",
  "completed_at": "2026-10-30T19:15:42.99924Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/553632c9-00d5-43da-a194-22123b8126c2/rating` → **200**

```json
{
  "command_id": "27da86e9-37ab-4d25-b241-522be8073c3f",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "553632c9-00d5-43da-a194-22123b8126c2",
  "score": 5,
  "created_at": "2026-10-30T19:15:43.261868616Z"
}
```

`POST /api/driver/v1/orders/553632c9-00d5-43da-a194-22123b8126c2/rating` → **200**

```json
{
  "command_id": "60596970-2306-4b16-b45c-c4734bf79867",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "553632c9-00d5-43da-a194-22123b8126c2",
  "score": 4,
  "created_at": "2026-10-30T19:15:43.513835722Z"
}
```

## Driver sees only aggregate score

`GET /api/driver/v1/me/rating` → **200**

```json
{
  "score_sum": 5,
  "count": 1,
  "average_hundredths": 500
}
```

## Operator sees both staff-only comments

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "ed757d10-e6ab-477a-a40f-1b09f82206f1",
  "subject": {
    "type": "STAFF",
    "id": "50e6407f-123d-42ca-9890-64ec61c07dce"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MGU2NDA3Zi0xMjNkLTQyY2EtOTg5MC02NGVjNjFjMDdkY2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODg2NDQsImlhdCI6MTc5MzM4Nzc0NCwianRpIjoiZjEwZDJlZjgtZWZhMC00ODYxLWFiNmUtMDEzNGIyNWUzNWVmIiwic2lkIjoiZWQ3NTdkMTAtZTZhYi00NzdhLWE0MGYtMWIwOWY4MjIwNmYxIn0.8PJEPBw9Z1JKJID4i8k1vf1HPBESjqfQvs-Jm3up1fc",
  "access_expires_at": "2026-10-30T19:30:44.260360023Z",
  "refresh_token": "Nb-02TPSkZ8d5QxVN62VEIGUy5uupqjUePwDG-SnCrY",
  "refresh_expires_at": "2026-10-31T07:15:44.259624226Z",
  "password_change_required": false
}
```

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "OPERATOR",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "6b9e57cb-927b-436f-9d1b-7ab245806119",
  "subject": {
    "type": "STAFF",
    "id": "50e6407f-123d-42ca-9890-64ec61c07dce"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MGU2NDA3Zi0xMjNkLTQyY2EtOTg5MC02NGVjNjFjMDdkY2UiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODg2NDQsImlhdCI6MTc5MzM4Nzc0NCwianRpIjoiMTQxOGE5OWMtNDE2OS00OTYzLWE5OTEtY2EyZGVlNmIxNGQwIiwic2lkIjoiNmI5ZTU3Y2ItOTI3Yi00MzZmLTlkMWItN2FiMjQ1ODA2MTE5In0.kwYbx1uxXwpyOEdJeyFan3DfsLyiuduTdNfD-l2RC7M",
  "access_expires_at": "2026-10-30T19:30:44.775588229Z",
  "refresh_token": "qyDGLjdntRSkoPjEKtxUVUacrgiKgT4m8GhB4j-3RcE",
  "refresh_expires_at": "2026-10-31T07:15:44.775129539Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/553632c9-00d5-43da-a194-22123b8126c2/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "553632c9-00d5-43da-a194-22123b8126c2",
      "author_type": "RIDER",
      "author_id": "68466ec6-4817-498c-b4d7-a69c8785fabf",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-30T19:15:43.261869Z"
    },
    {
      "order_id": "553632c9-00d5-43da-a194-22123b8126c2",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "68466ec6-4817-498c-b4d7-a69c8785fabf",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-30T19:15:43.513836Z"
    }
  ]
}
```

Done: ratings for order 553632c9-00d5-43da-a194-22123b8126c2.

# Scenario: report-export

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "d6a8999d-04d2-46bc-a6fd-5770f0c9c749",
  "subject": {
    "type": "STAFF",
    "id": "50e6407f-123d-42ca-9890-64ec61c07dce"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MGU2NDA3Zi0xMjNkLTQyY2EtOTg5MC02NGVjNjFjMDdkY2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODg2NDUsImlhdCI6MTc5MzM4Nzc0NSwianRpIjoiNGM1NWJmMjYtNWE5Ny00ZDIwLTg3MjYtMmE3NDEwMzI5NDkzIiwic2lkIjoiZDZhODk5OWQtMDRkMi00NmJjLWE2ZmQtNTc3MGYwYzljNzQ5In0.iGESs4fKH5u-sT3f1bXrDMjWC6E7egxYXgz_2LXdXSY",
  "access_expires_at": "2026-10-30T19:30:45.620570489Z",
  "refresh_token": "3jjaOacg3zHZkCCauSRcjHXwoDjNYmc3Pyt-PV6EFxY",
  "refresh_expires_at": "2026-10-31T07:15:45.620079621Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "f1b89352-240b-4b33-80db-ea2f4bab6c51",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "8e92165c-1bb4-43df-809b-3a0d43fd2263",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T19:15:45.867496Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/8e92165c-1bb4-43df-809b-3a0d43fd2263` → **200**

```json
{
  "id": "8e92165c-1bb4-43df-809b-3a0d43fd2263",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T19:15:45.867496Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/8e92165c-1bb4-43df-809b-3a0d43fd2263` → **200**

```json
{
  "id": "8e92165c-1bb4-43df-809b-3a0d43fd2263",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T19:15:45.867496Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/8e92165c-1bb4-43df-809b-3a0d43fd2263` → **200**

```json
{
  "id": "8e92165c-1bb4-43df-809b-3a0d43fd2263",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-30.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-30T19:15:45.867496Z",
  "ready_at": "2026-10-30T19:15:48.316561Z",
  "expires_at": "2026-10-31T19:15:48.316561Z"
}
```

`GET /api/admin/v1/reports/exports/8e92165c-1bb4-43df-809b-3a0d43fd2263/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-30,26,11,14,0,1,21,5,0,23,2,0,1,7,1,6
total,26,11,14,0,1,21,5,0,23,2,0,1,7,1,6
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "8c84d5ca-56b0-4279-b405-4915921d2867",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "88a59acf-8cfc-4208-b9b8-f15a4ca9834b",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T19:15:48.87806Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/88a59acf-8cfc-4208-b9b8-f15a4ca9834b` → **200**

```json
{
  "id": "88a59acf-8cfc-4208-b9b8-f15a4ca9834b",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T19:15:48.87806Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/88a59acf-8cfc-4208-b9b8-f15a4ca9834b` → **200**

```json
{
  "id": "88a59acf-8cfc-4208-b9b8-f15a4ca9834b",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T19:15:48.87806Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/88a59acf-8cfc-4208-b9b8-f15a4ca9834b` → **200**

```json
{
  "id": "88a59acf-8cfc-4208-b9b8-f15a4ca9834b",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T19:15:48.87806Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/88a59acf-8cfc-4208-b9b8-f15a4ca9834b` → **200**

```json
{
  "id": "88a59acf-8cfc-4208-b9b8-f15a4ca9834b",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T19:15:48.87806Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/88a59acf-8cfc-4208-b9b8-f15a4ca9834b` → **200**

```json
{
  "id": "88a59acf-8cfc-4208-b9b8-f15a4ca9834b",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-30.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-30T19:15:48.87806Z",
  "ready_at": "2026-10-30T19:15:53.322724Z",
  "expires_at": "2026-10-31T19:15:53.322724Z"
}
```

`GET /api/admin/v1/reports/exports/88a59acf-8cfc-4208-b9b8-f15a4ca9834b/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-30,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
total,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/351f3808-96de-4a54-be8d-91d8ca799149` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/351f3808-96de-4a54-be8d-91d8ca799149",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "dd10a371-852a-4153-a278-1bd43e40e214"
}
```

Done: both reports were built in the background and downloaded.

# Scenario: retention

## Technical data retention

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "906e1d5d-0a05-4931-8e11-547be396e629",
  "subject": {
    "type": "STAFF",
    "id": "50e6407f-123d-42ca-9890-64ec61c07dce"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MGU2NDA3Zi0xMjNkLTQyY2EtOTg5MC02NGVjNjFjMDdkY2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODg2NTQsImlhdCI6MTc5MzM4Nzc1NCwianRpIjoiOTVjNDYwY2QtMzM3YS00YjhlLTk3NDAtNjcyNWQwNjQ3MTBjIiwic2lkIjoiOTA2ZTFkNWQtMGEwNS00OTMxLThlMTEtNTQ3YmUzOTZlNjI5In0.btPUhF4KaAqC1QDWFjxX5_P7i5N1yPcDoc3gKvdophc",
  "access_expires_at": "2026-10-30T19:30:54.90493515Z",
  "refresh_token": "VhmH7uAPpc5ZdLvcfUmV7_923mN_gcQNbX20FrBWpoY",
  "refresh_expires_at": "2026-10-31T07:15:54.904377731Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/retention` → **200**

```json
{
  "version": 0,
  "days": {
    "call_recordings": 0,
    "code_deliveries": 90,
    "command_receipts": 30,
    "consumer_receipts": 30,
    "delivered_events": 30,
    "quarantined_files": 30,
    "sessions": 30,
    "sign_in_codes": 90,
    "upload_sessions": 7
  },
  "changed_by": null,
  "reason": null,
  "changed_at": null
}
```

`PUT /api/admin/v1/retention` → **200**

```json
{
  "command_id": "95a883b7-31c7-43d4-9f9d-a86c8815bc0a",
  "expected_version": 0,
  "days": {
    "call_recordings": 0,
    "code_deliveries": 90,
    "command_receipts": 30,
    "consumer_receipts": 30,
    "delivered_events": 1,
    "quarantined_files": 30,
    "sessions": 30,
    "sign_in_codes": 90,
    "upload_sessions": 7
  },
  "reason": "Sandbox retention boundary"
}
```

```json
{
  "version": 1,
  "days": {
    "call_recordings": 0,
    "code_deliveries": 90,
    "command_receipts": 30,
    "consumer_receipts": 30,
    "delivered_events": 1,
    "quarantined_files": 30,
    "sessions": 30,
    "sign_in_codes": 90,
    "upload_sessions": 7
  },
  "changed_by": "50e6407f-123d-42ca-9890-64ec61c07dce",
  "reason": "Sandbox retention boundary",
  "changed_at": "2026-10-30T19:15:55.389432725Z"
}
```

`POST /sandbox/v1/retention/fixtures/01879780-75ab-44ce-ad4b-ec6299e5b8ed` → **200**

```json
{
  "old_done": 1,
  "recent_done": 1,
  "failed": 1
}
```

`POST /sandbox/v1/retention/run` → **200**

```json
{
  "sessions": {
    "deleted": 0,
    "failures": 0,
    "examined": 0
  },
  "sign_in_codes": {
    "deleted": 0,
    "failures": 0,
    "examined": 0
  },
  "code_deliveries": {
    "deleted": 0,
    "failures": 0,
    "examined": 0
  },
  "delivered_events": {
    "deleted": 1,
    "failures": 0,
    "examined": 1
  },
  "consumer_receipts": {
    "deleted": 0,
    "failures": 0,
    "examined": 0
  },
  "command_receipts": {
    "deleted": 0,
    "failures": 0,
    "examined": 0
  },
  "upload_sessions": {
    "deleted": 0,
    "failures": 0,
    "examined": 0
  },
  "quarantined_files": {
    "deleted": 0,
    "failures": 0,
    "examined": 0
  },
  "call_recordings": {
    "deleted": 0,
    "failures": 0,
    "examined": 0
  }
}
```

`GET /sandbox/v1/retention/fixtures/01879780-75ab-44ce-ad4b-ec6299e5b8ed` → **200**

```json
{
  "old_done": 0,
  "recent_done": 1,
  "failed": 1
}
```

Old DONE event removed; recent DONE and old FAILED events retained. Policy and synthetic fixtures restored on exit.

`DELETE /sandbox/v1/retention/fixtures/01879780-75ab-44ce-ad4b-ec6299e5b8ed` → **204**

`GET /api/admin/v1/retention` → **200**

```json
{
  "version": 1,
  "days": {
    "call_recordings": 0,
    "code_deliveries": 90,
    "command_receipts": 30,
    "consumer_receipts": 30,
    "delivered_events": 1,
    "quarantined_files": 30,
    "sessions": 30,
    "sign_in_codes": 90,
    "upload_sessions": 7
  },
  "changed_by": "50e6407f-123d-42ca-9890-64ec61c07dce",
  "reason": "Sandbox retention boundary",
  "changed_at": "2026-10-30T19:15:55.389433Z"
}
```

`PUT /api/admin/v1/retention` → **200**

```json
{
  "command_id": "d57618fe-bd4a-449e-ad1a-6d5d78d1092a",
  "expected_version": 1,
  "days": {
    "call_recordings": 0,
    "code_deliveries": 90,
    "command_receipts": 30,
    "consumer_receipts": 30,
    "delivered_events": 30,
    "quarantined_files": 30,
    "sessions": 30,
    "sign_in_codes": 90,
    "upload_sessions": 7
  },
  "reason": "Restore policy after retention sandbox"
}
```

```json
{
  "version": 2,
  "days": {
    "call_recordings": 0,
    "code_deliveries": 90,
    "command_receipts": 30,
    "consumer_receipts": 30,
    "delivered_events": 30,
    "quarantined_files": 30,
    "sessions": 30,
    "sign_in_codes": 90,
    "upload_sessions": 7
  },
  "changed_by": "50e6407f-123d-42ca-9890-64ec61c07dce",
  "reason": "Restore policy after retention sandbox",
  "changed_at": "2026-10-30T19:15:56.005050772Z"
}
```

# Scenario: risk-flag

## The driver starts a new shift in Kyiv

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-10715"
}
```

```json
{
  "challenge_id": "28dfc1b8-0f1d-4842-b76d-f9a03a651a98",
  "expires_at": "2026-10-30T19:20:56.266326109Z",
  "resend_available_at": "2026-10-30T19:15:57.266326109Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "359355",
  "sent_at": "2026-10-30T19:15:56.269182536Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "28dfc1b8-0f1d-4842-b76d-f9a03a651a98",
  "code": "359355",
  "device_ref": "sandbox-10715"
}
```

```json
{
  "session_id": "22a76fbb-3213-4238-bd95-8ce4637e933e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4ODY1NiwiaWF0IjoxNzkzMzg3NzU2LCJqdGkiOiI1ZTBkODU0My0zNzQ4LTQzNjQtOTY0Yy0zZTk5Y2RhZjVlNjMiLCJzaWQiOiIyMmE3NmZiYi0zMjEzLTQyMzgtYmQ5NS04Y2U0NjM3ZTkzM2UifQ.zU8jEQUqn9D39pIhH1R75zpgklqEHC2js6BU-msK3Xk",
  "access_expires_at": "2026-10-30T19:30:56.53705622Z",
  "refresh_token": "QSolndFiQkWsyACgvL8FVUklFIzcBcBoaqDyQyD4mYg",
  "refresh_expires_at": "2026-11-29T19:15:56.536449728Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "3af27f8b-3fa4-45ab-a89c-939df6f6f265",
  "session_version": 2,
  "session_state": "CLOSING",
  "intent": "PAUSE_AFTER_CURRENT",
  "connection": "DISCONNECTED",
  "geolocation": "STALE",
  "occupancy": "ON_TRIP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "last_heartbeat_at": "2026-10-30T19:08:42.209307Z",
  "last_location_at": "2026-10-30T19:08:42.209307Z",
  "eligible": false,
  "ineligible_reasons": [
    "SESSION_CLOSING",
    "INTENT_PAUSE_AFTER_CURRENT",
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE",
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/work-sessions/3af27f8b-3fa4-45ab-a89c-939df6f6f265/close` → **409**

```json
{
  "command_id": "6c3974fb-2f90-4a23-8d87-509f782f0bb7",
  "expected_version": 2
}
```

```json
{
  "instance": "/api/driver/v1/work-sessions/3af27f8b-3fa4-45ab-a89c-939df6f6f265/close",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "ba4356d2-257a-4f07-b6a3-801313e91b36"
}
```

**Expected 200, got 409 — scenario stopped.**

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "35954517-a648-4d9c-a4d7-f65db09c4f32",
  "subject": {
    "type": "STAFF",
    "id": "50e6407f-123d-42ca-9890-64ec61c07dce"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MGU2NDA3Zi0xMjNkLTQyY2EtOTg5MC02NGVjNjFjMDdkY2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODg2NTcsImlhdCI6MTc5MzM4Nzc1NywianRpIjoiZTIyNjkzMjMtODI0My00MjMyLTk4ZjUtODE5MTU3ODBlOWY4Iiwic2lkIjoiMzU5NTQ1MTctYTY0OC00ZDljLWE0ZDctZjY1ZGIwOWM0ZjMyIn0.boAQzmAh1Yjhsqnj_eBIwK8t4SZAL_FbD9zHcAiIDC4",
  "access_expires_at": "2026-10-30T19:30:57.616762658Z",
  "refresh_token": "kGBs9z4W97RKWhsWi4q3ZnkLWmDYy-aZ9kUNYYyxVSA",
  "refresh_expires_at": "2026-10-31T07:15:57.615789404Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403` → **200**

```json
{
  "profile": {
    "id": "5a000000-0000-4000-8000-000000000403",
    "account_state": "ACTIVE",
    "name": "Андрій Шевчук",
    "language": "ru",
    "review_status": "APPROVED",
    "version": 15,
    "has_payment_terminal": false,
    "admission_city_ids": [
      "5a000000-0000-4000-8000-000000000001"
    ],
    "vehicles": [
      {
        "id": "5a000000-0000-4000-8000-000000000503",
        "registration_number": "AA0003TX",
        "make": "Hyundai",
        "model": "Sonata",
        "color": "black",
        "production_year": 2022,
        "state": "APPROVED",
        "class_approvals": [
          "STANDARD",
          "COMFORT"
        ]
      }
    ],
    "documents": []
  },
  "phone": "+380500000003",
  "history": [],
  "duplicates": []
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "3af27f8b-3fa4-45ab-a89c-939df6f6f265",
  "session_version": 2,
  "session_state": "CLOSING",
  "intent": "PAUSE_AFTER_CURRENT",
  "connection": "DISCONNECTED",
  "geolocation": "STALE",
  "occupancy": "ON_TRIP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "last_heartbeat_at": "2026-10-30T19:08:42.209307Z",
  "last_location_at": "2026-10-30T19:08:42.209307Z",
  "eligible": false,
  "ineligible_reasons": [
    "SESSION_CLOSING",
    "INTENT_PAUSE_AFTER_CURRENT",
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE",
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/work-sessions/3af27f8b-3fa4-45ab-a89c-939df6f6f265/close` → **409**

```json
{
  "command_id": "511a3131-3c2d-40d9-b697-c2d742b56c96",
  "expected_version": 2
}
```

```json
{
  "instance": "/api/driver/v1/work-sessions/3af27f8b-3fa4-45ab-a89c-939df6f6f265/close",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "c8373313-0613-4a08-88db-6f3b18d157a2"
}
```

**Expected 200, got 409 — scenario stopped.**

# Scenario: safety-contacts

## The admin reads the city's contacts and replaces them

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "d787fe91-13c3-4359-8c2e-97b88de85911",
  "subject": {
    "type": "STAFF",
    "id": "50e6407f-123d-42ca-9890-64ec61c07dce"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MGU2NDA3Zi0xMjNkLTQyY2EtOTg5MC02NGVjNjFjMDdkY2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODg2NTgsImlhdCI6MTc5MzM4Nzc1OCwianRpIjoiZjUxOWVjMDAtZTQ2Zi00MWNlLTg3NjYtZmUxNTkyZjQ2YjUzIiwic2lkIjoiZDc4N2ZlOTEtMTNjMy00MzU5LThjMmUtOTdiODhkZTg1OTExIn0.z0OPlLCEDTVd9pTYhwaoq0Q72aJRuXWi5w-CkaBSgqY",
  "access_expires_at": "2026-10-30T19:30:58.853437152Z",
  "refresh_token": "4tPSSY-_vWbqNg803BYCAXNnZ61Z4Iwg2bzxqckKzSE",
  "refresh_expires_at": "2026-10-31T07:15:58.852979683Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "version": 0,
  "emergency_number": "112",
  "support_phone": null,
  "extra": [],
  "changed_by": null,
  "reason": null,
  "changed_at": null
}
```

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "d1508ba4-16e1-4d19-b033-93809103a35f",
  "expected_version": 0,
  "emergency_number": "112",
  "support_phone": "+48220000101",
  "extra": [
    {
      "label": {
        "pl": "Infolinia",
        "uk": "Гаряча лінія",
        "ru": "Горячая линия",
        "en": "Hotline"
      },
      "phone": "+48220000997"
    }
  ],
  "reason": "Sandbox: contacts of Warszawa"
}
```

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "version": 1,
  "emergency_number": "112",
  "support_phone": "+48220000101",
  "extra": [
    {
      "label": {
        "en": "Hotline",
        "pl": "Infolinia",
        "ru": "Горячая линия",
        "uk": "Гаряча лінія"
      },
      "phone": "+48220000997"
    }
  ],
  "changed_by": "50e6407f-123d-42ca-9890-64ec61c07dce",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T19:15:59.350433Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "d1508ba4-16e1-4d19-b033-93809103a35f",
  "expected_version": 0,
  "emergency_number": "112",
  "support_phone": "+48220000101",
  "extra": [
    {
      "label": {
        "pl": "Infolinia",
        "uk": "Гаряча лінія",
        "ru": "Горячая линия",
        "en": "Hotline"
      },
      "phone": "+48220000997"
    }
  ],
  "reason": "Sandbox: contacts of Warszawa"
}
```

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "version": 1,
  "emergency_number": "112",
  "support_phone": "+48220000101",
  "extra": [
    {
      "label": {
        "en": "Hotline",
        "pl": "Infolinia",
        "ru": "Горячая линия",
        "uk": "Гаряча лінія"
      },
      "phone": "+48220000997"
    }
  ],
  "changed_by": "50e6407f-123d-42ca-9890-64ec61c07dce",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T19:15:59.350433Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48054078890",
  "device_ref": "sandbox-22401"
}
```

```json
{
  "challenge_id": "8b06685e-35d9-4641-889c-bc8c7ba74150",
  "expires_at": "2026-10-30T19:20:59.836644135Z",
  "resend_available_at": "2026-10-30T19:16:00.836644135Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48054078890` → **200**

```json
{
  "phone": "+48054078890",
  "audience": "CLIENT",
  "code": "217453",
  "sent_at": "2026-10-30T19:15:59.83898103Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8b06685e-35d9-4641-889c-bc8c7ba74150",
  "code": "217453",
  "device_ref": "sandbox-22401"
}
```

```json
{
  "session_id": "eb6db4b8-8a30-4a4c-be9f-19a3a8b8ad4f",
  "subject": {
    "type": "CLIENT",
    "id": "acb3b0fd-542d-4804-8f83-68bc8aa90431"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhY2IzYjBmZC01NDJkLTQ4MDQtOGY4My02OGJjOGFhOTA0MzEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzg4NjYwLCJpYXQiOjE3OTMzODc3NjAsImp0aSI6IjZkMmI3NzY0LTE1YTctNDM4MS1hZDJlLWJiMGRmMDQ4NWQ3ZCIsInNpZCI6ImViNmRiNGI4LThhMzAtNGE0Yy1iZTlmLTE5YTNhOGI4YWQ0ZiJ9.sGNF_maEmJhzBr6vjBnSRmpPhrKgm9Svop4OtjFttX0",
  "access_expires_at": "2026-10-30T19:31:00.085696043Z",
  "refresh_token": "0eV0T252VQ1e0HW3wb-IXDL9NdS7Ij5zLtXi4_NxwvA",
  "refresh_expires_at": "2026-11-29T19:16:00.085224093Z",
  "account_created": true
}
```

`GET /api/rider/v1/safety-contacts` → **400**

```json
{
  "instance": "/api/rider/v1/safety-contacts",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "a4185156-9a61-4e02-93a6-daca2fefc29c"
}
```

`GET /api/rider/v1/safety-contacts?city_id=5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "emergency_number": "112",
  "support_phone": "+48220000101",
  "extra": [
    {
      "label": "Горячая линия",
      "phone": "+48220000997"
    }
  ],
  "disclaimer_code": "NO_AUTO_DISPATCH"
}
```

## The driver on line in Warszawa opens it (the city of his session)

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000001",
  "device_ref": "sandbox-12074"
}
```

```json
{
  "challenge_id": "d865988b-be3e-4727-9a22-2822bdce631f",
  "expires_at": "2026-10-30T19:21:00.788700644Z",
  "resend_available_at": "2026-10-30T19:16:01.788700644Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "949811",
  "sent_at": "2026-10-30T19:16:00.790786121Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d865988b-be3e-4727-9a22-2822bdce631f",
  "code": "949811",
  "device_ref": "sandbox-12074"
}
```

```json
{
  "session_id": "aac1ff27-f528-4136-820d-59ea8d0a68d2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4ODY2MSwiaWF0IjoxNzkzMzg3NzYxLCJqdGkiOiI1YjkyNzc1MC1lYWNhLTRmMmItOTIwZS00NTUxNzAwNmJkZTIiLCJzaWQiOiJhYWMxZmYyNy1mNTI4LTQxMzYtODIwZC01OWVhOGQwYTY4ZDIifQ._NZKmvE4xKYupeNBCL7yXMTY79UhyKOt4QSvQYwb1Rg",
  "access_expires_at": "2026-10-30T19:31:01.046636717Z",
  "refresh_token": "Pvi8wO-T5ek5neoDRGzTODlyAqQq-mqIc69kur4sZYE",
  "refresh_expires_at": "2026-11-29T19:16:01.045998727Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "162a0f82-0ae2-47b6-bf3b-de3e40a47c20",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "DISCONNECTED",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "last_heartbeat_at": "2026-10-30T19:14:48.525763Z",
  "last_location_at": "2026-10-30T19:14:48.525763Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/162a0f82-0ae2-47b6-bf3b-de3e40a47c20/handover` → **200**

```json
{
  "command_id": "525d8c4a-7f0a-418d-aa54-d71a6040afe9",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "162a0f82-0ae2-47b6-bf3b-de3e40a47c20",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "DISCONNECTED",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "last_heartbeat_at": "2026-10-30T19:14:48.525763Z",
  "last_location_at": "2026-10-30T19:14:48.525763Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/162a0f82-0ae2-47b6-bf3b-de3e40a47c20/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:16:01Z",
    "sequence": 1793387761847
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "162a0f82-0ae2-47b6-bf3b-de3e40a47c20",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "last_heartbeat_at": "2026-10-30T19:16:01.972674Z",
  "last_location_at": "2026-10-30T19:16:01.972674Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`GET /api/driver/v1/safety-contacts` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "emergency_number": "112",
  "support_phone": "+48220000101",
  "extra": [
    {
      "label": "Infolinia",
      "phone": "+48220000997"
    }
  ],
  "disclaimer_code": "NO_AUTO_DISPATCH"
}
```

## The driver goes off line; without a session there is no city

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "162a0f82-0ae2-47b6-bf3b-de3e40a47c20",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "last_heartbeat_at": "2026-10-30T19:16:01.972674Z",
  "last_location_at": "2026-10-30T19:16:01.972674Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/162a0f82-0ae2-47b6-bf3b-de3e40a47c20/close` → **200**

```json
{
  "command_id": "954b6b29-f952-4420-aea0-ff696bd58caa",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": null,
  "session_version": 0,
  "session_state": "CLOSED",
  "intent": null,
  "connection": "DISCONNECTED",
  "geolocation": "UNAVAILABLE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": null,
  "vehicle_id": null,
  "last_heartbeat_at": null,
  "last_location_at": null,
  "eligible": false,
  "ineligible_reasons": [
    "NO_OPEN_SESSION"
  ]
}
```

`GET /api/driver/v1/safety-contacts` → **409**

```json
{
  "instance": "/api/driver/v1/safety-contacts",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "7a47de37-1025-4d32-b19f-ee3169bb2d03"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676437151",
  "device_ref": "sandbox-5456"
}
```

```json
{
  "challenge_id": "1f8c0663-d5fa-43d2-9d15-652faadb6604",
  "expires_at": "2026-10-30T19:21:03.289368084Z",
  "resend_available_at": "2026-10-30T19:16:04.289368084Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380676437151` → **200**

```json
{
  "phone": "+380676437151",
  "audience": "CLIENT",
  "code": "067200",
  "sent_at": "2026-10-30T19:16:03.291762536Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1f8c0663-d5fa-43d2-9d15-652faadb6604",
  "code": "067200",
  "device_ref": "sandbox-5456"
}
```

```json
{
  "session_id": "cc1ed2de-ceef-4a11-b74d-f3698131b808",
  "subject": {
    "type": "CLIENT",
    "id": "de9da798-27e3-44b7-9395-a68030bb4930"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkZTlkYTc5OC0yN2UzLTQ0YjctOTM5NS1hNjgwMzBiYjQ5MzAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzg4NjYzLCJpYXQiOjE3OTMzODc3NjMsImp0aSI6IjA3MDRjZjEyLTlhMzEtNDkxNC1iMTk4LTE5ODAxODM5Y2E4NCIsInNpZCI6ImNjMWVkMmRlLWNlZWYtNGExMS1iNzRkLWYzNjk4MTMxYjgwOCJ9.XrHDPKzTEuvZ9mQoZgQRXqpLQvNg0g1qFm57BFXl9_U",
  "access_expires_at": "2026-10-30T19:31:03.5720097Z",
  "refresh_token": "HiGm1dABc8Cwf5BQBCh0LSw_hjW_tkCceTVbVxvxfJM",
  "refresh_expires_at": "2026-11-29T19:16:03.571492872Z",
  "account_created": true
}
```

## The EICAR antivirus test file is refused by the antivirus

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "25fefa69-49b0-4520-948a-ffe6c3841c76",
  "content_type": "application/pdf",
  "size_bytes": 86
}
```

```json
{
  "file_id": "b4c9ec6a-f042-4d7e-ae86-194f07ee7d2f",
  "upload_path": "/api/rider/v1/uploads/b4c9ec6a-f042-4d7e-ae86-194f07ee7d2f",
  "expires_at": "2026-10-30T19:31:03.817726909Z",
  "max_bytes": 86
}
```

`PUT /api/rider/v1/uploads/b4c9ec6a-f042-4d7e-ae86-194f07ee7d2f` → **200**

```json
{
  "file_id": "b4c9ec6a-f042-4d7e-ae86-194f07ee7d2f",
  "state": "REJECTED",
  "content_type": null,
  "size_bytes": 0,
  "reject_reason": "The file did not pass the malware check"
}
```

## A PDF with a JavaScript action behind a name escape (/J#61vaScript) is refused

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "27480c4d-2186-4f61-a038-b1f0fe3d404b",
  "content_type": "application/pdf",
  "size_bytes": 92
}
```

```json
{
  "file_id": "aad86d38-ed71-40b2-8181-7b6a76bf5cca",
  "upload_path": "/api/rider/v1/uploads/aad86d38-ed71-40b2-8181-7b6a76bf5cca",
  "expires_at": "2026-10-30T19:31:04.089957145Z",
  "max_bytes": 92
}
```

`PUT /api/rider/v1/uploads/aad86d38-ed71-40b2-8181-7b6a76bf5cca` → **200**

```json
{
  "file_id": "aad86d38-ed71-40b2-8181-7b6a76bf5cca",
  "state": "REJECTED",
  "content_type": null,
  "size_bytes": 0,
  "reject_reason": "PDF with active content is not accepted"
}
```

## Rider uploads a photo and opens a support case

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "7776aaed-8fcc-489f-bf11-76c45c10919b",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "765d16aa-881c-46bd-849c-05e2c6a29e7f",
  "upload_path": "/api/rider/v1/uploads/765d16aa-881c-46bd-849c-05e2c6a29e7f",
  "expires_at": "2026-10-30T19:31:04.352674762Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/765d16aa-881c-46bd-849c-05e2c6a29e7f` → **200**

```json
{
  "file_id": "765d16aa-881c-46bd-849c-05e2c6a29e7f",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "0e86aefa-baa1-44f1-90ea-f70fa9bfc48c",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "765d16aa-881c-46bd-849c-05e2c6a29e7f"
  ]
}
```

```json
{
  "id": "350c2fe5-9c39-48b0-add4-b32ef6f5c1da",
  "number": 4,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "de9da798-27e3-44b7-9395-a68030bb4930",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T19:16:04.617339Z",
  "updated_at": "2026-10-30T19:16:04.617339Z",
  "respond_by": "2026-10-30T23:16:04.617339Z",
  "messages": [
    {
      "id": "3677ae1c-2b5b-493b-b1c9-c09fec54af86",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "de9da798-27e3-44b7-9395-a68030bb4930",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T19:16:04.618229Z",
      "attachments": [
        {
          "file_id": "765d16aa-881c-46bd-849c-05e2c6a29e7f",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

## Operator downloads the rider photo and replies with another file

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "e059386a-1765-44dc-9d6c-1dc174e576a9",
  "subject": {
    "type": "STAFF",
    "id": "50e6407f-123d-42ca-9890-64ec61c07dce"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MGU2NDA3Zi0xMjNkLTQyY2EtOTg5MC02NGVjNjFjMDdkY2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODg2NjUsImlhdCI6MTc5MzM4Nzc2NSwianRpIjoiY2ZmMjMzYzItODE1ZS00NTM3LWI4ZDgtNzkyZDlkZDRhOWM4Iiwic2lkIjoiZTA1OTM4NmEtMTc2NS00NGRjLTlkNmMtMWRjMTc0ZTU3NmE5In0.7FYYVvI9ruhAhZYLWN18ai3LRSrz9_B1nCB1v3t2_sA",
  "access_expires_at": "2026-10-30T19:31:05.1313164Z",
  "refresh_token": "In3MexovcpBNcJ5VWnxmxscxm61f3FGWN2DhetZes7c",
  "refresh_expires_at": "2026-10-31T07:16:05.130872272Z",
  "password_change_required": false
}
```

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "OPERATOR",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "5e6c6887-0468-4e02-92f4-0eaef7e85946",
  "subject": {
    "type": "STAFF",
    "id": "50e6407f-123d-42ca-9890-64ec61c07dce"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MGU2NDA3Zi0xMjNkLTQyY2EtOTg5MC02NGVjNjFjMDdkY2UiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODg2NjUsImlhdCI6MTc5MzM4Nzc2NSwianRpIjoiMDJkZTc4ZjctMWVmYi00YTMxLWFiZDgtMjkxMmIyZThjNTgwIiwic2lkIjoiNWU2YzY4ODctMDQ2OC00ZTAyLTkyZjQtMGVhZWY3ZTg1OTQ2In0.iNav5mWPTfZ87Boi_tsH-dk83xzbgT8Z4LsYpp_BTx8",
  "access_expires_at": "2026-10-30T19:31:05.620394072Z",
  "refresh_token": "2SUsRWAAagWxpEr0Uv4nhWuRq-AwpujifA_Sy8vyZWw",
  "refresh_expires_at": "2026-10-31T07:16:05.619955643Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/350c2fe5-9c39-48b0-add4-b32ef6f5c1da/attachments/765d16aa-881c-46bd-849c-05e2c6a29e7f` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "001f5c87-0d6e-426f-ad97-3637a83a70c0",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "ceb16a74-f937-43b4-ac30-eabba4e333c4",
  "upload_path": "/api/operator/v1/uploads/ceb16a74-f937-43b4-ac30-eabba4e333c4",
  "expires_at": "2026-10-30T19:31:05.872720631Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/ceb16a74-f937-43b4-ac30-eabba4e333c4` → **200**

```json
{
  "file_id": "ceb16a74-f937-43b4-ac30-eabba4e333c4",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/350c2fe5-9c39-48b0-add4-b32ef6f5c1da` → **200**

```json
{
  "id": "350c2fe5-9c39-48b0-add4-b32ef6f5c1da",
  "number": 4,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "de9da798-27e3-44b7-9395-a68030bb4930",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T19:16:04.617339Z",
  "updated_at": "2026-10-30T19:16:04.617339Z",
  "respond_by": "2026-10-30T23:16:04.617339Z",
  "messages": [
    {
      "id": "3677ae1c-2b5b-493b-b1c9-c09fec54af86",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "de9da798-27e3-44b7-9395-a68030bb4930",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T19:16:04.618229Z",
      "attachments": [
        {
          "file_id": "765d16aa-881c-46bd-849c-05e2c6a29e7f",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/350c2fe5-9c39-48b0-add4-b32ef6f5c1da/comments` → **200**

```json
{
  "command_id": "5e49ccfa-0e69-4cf6-aaef-fa1d0a6ff563",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "ceb16a74-f937-43b4-ac30-eabba4e333c4"
  ]
}
```

```json
{
  "id": "350c2fe5-9c39-48b0-add4-b32ef6f5c1da",
  "number": 4,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "de9da798-27e3-44b7-9395-a68030bb4930",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T19:16:04.617339Z",
  "updated_at": "2026-10-30T19:16:06.630178Z",
  "respond_by": "2026-10-30T23:16:04.617339Z",
  "messages": [
    {
      "id": "3677ae1c-2b5b-493b-b1c9-c09fec54af86",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "de9da798-27e3-44b7-9395-a68030bb4930",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T19:16:04.618229Z",
      "attachments": [
        {
          "file_id": "765d16aa-881c-46bd-849c-05e2c6a29e7f",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "bf05bd4f-7863-4a92-a755-b632f44a9c41",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "50e6407f-123d-42ca-9890-64ec61c07dce",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T19:16:06.62974Z",
      "attachments": [
        {
          "file_id": "ceb16a74-f937-43b4-ac30-eabba4e333c4",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

## Rider sees the public reply and downloads its attachment

`GET /api/rider/v1/support/cases/350c2fe5-9c39-48b0-add4-b32ef6f5c1da` → **200**

```json
{
  "id": "350c2fe5-9c39-48b0-add4-b32ef6f5c1da",
  "number": 4,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "de9da798-27e3-44b7-9395-a68030bb4930",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T19:16:04.617339Z",
  "updated_at": "2026-10-30T19:16:06.630178Z",
  "respond_by": "2026-10-30T23:16:04.617339Z",
  "messages": [
    {
      "id": "3677ae1c-2b5b-493b-b1c9-c09fec54af86",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "de9da798-27e3-44b7-9395-a68030bb4930",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T19:16:04.618229Z",
      "attachments": [
        {
          "file_id": "765d16aa-881c-46bd-849c-05e2c6a29e7f",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "bf05bd4f-7863-4a92-a755-b632f44a9c41",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T19:16:06.62974Z",
      "attachments": [
        {
          "file_id": "ceb16a74-f937-43b4-ac30-eabba4e333c4",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/350c2fe5-9c39-48b0-add4-b32ef6f5c1da/attachments/ceb16a74-f937-43b4-ac30-eabba4e333c4` → **200**

Done: support case 350c2fe5-9c39-48b0-add4-b32ef6f5c1da, rider attachment 765d16aa-881c-46bd-849c-05e2c6a29e7f, operator attachment ceb16a74-f937-43b4-ac30-eabba4e333c4.

# Scenario: switch-to-cash

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380731123107",
  "device_ref": "sandbox-6889"
}
```

```json
{
  "challenge_id": "98d1cb2d-6242-4f87-859b-6b2be391d154",
  "expires_at": "2026-10-30T19:21:07.160978924Z",
  "resend_available_at": "2026-10-30T19:16:08.160978924Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380731123107` → **200**

```json
{
  "phone": "+380731123107",
  "audience": "CLIENT",
  "code": "329730",
  "sent_at": "2026-10-30T19:16:07.162999974Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "98d1cb2d-6242-4f87-859b-6b2be391d154",
  "code": "329730",
  "device_ref": "sandbox-6889"
}
```

```json
{
  "session_id": "075c66dc-9217-49a1-8a0e-ff0e9b47d275",
  "subject": {
    "type": "CLIENT",
    "id": "c22f53aa-d934-4fb0-ac6b-141ba50d83c9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMjJmNTNhYS1kOTM0LTRmYjAtYWM2Yi0xNDFiYTUwZDgzYzkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzg4NjY3LCJpYXQiOjE3OTMzODc3NjcsImp0aSI6IjBlY2Y5ZDkxLTJlODgtNDViMC04MzhiLTBiMDNlZmIyMTY3NiIsInNpZCI6IjA3NWM2NmRjLTkyMTctNDlhMS04YTBlLWZmMGU5YjQ3ZDI3NSJ9.lp4nVJ4gEwCeVUqbZbynfgG0zw1JyUfWy2RY3ST0qLc",
  "access_expires_at": "2026-10-30T19:31:07.42190674Z",
  "refresh_token": "Rn5M0eakRhAFLC08rGbknYvBKh3o4Vu_uCJAm1y1cmg",
  "refresh_expires_at": "2026-11-29T19:16:07.42148129Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "72d23742-1c55-4493-9e7d-bf6eb3876a96",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "b04a6252-75a1-46ac-b012-3af1bcc43ee5",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-b04a6252-75a1-46ac-b012-3af1bcc43ee5",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "71615d76ccac7003456dd3e56975a2af",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=b04a6252-75a1-46ac-b012-3af1bcc43ee5",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380731123107"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=b04a6252-75a1-46ac-b012-3af1bcc43ee5",
  "expires_at": "2026-10-30T19:46:07.661797Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/b04a6252-75a1-46ac-b012-3af1bcc43ee5` → **200**

```json
{
  "id": "b04a6252-75a1-46ac-b012-3af1bcc43ee5",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T19:46:07.661797Z",
  "card": {
    "id": "3bef8de3-9a7b-46f9-8418-f712635ee081",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****1621",
    "card_type": "Visa",
    "created_at": "2026-10-30T19:16:07.900501Z"
  },
  "failure_reason": null
}
```

## The rider orders by card: the hold is taken

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "bd165541-392a-4c09-81a9-579ae7b20d14",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4437,
    "lon": 30.4970
  },
  "dropoff": {
    "lat": 50.4584,
    "lon": 30.4300
  }
}
```

```json
{
  "id": "2147ac72-1c07-4c7c-b9a5-183a41b4c760",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T19:21:08.155856Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false,
  "discount_minor": 0,
  "to_pay_minor": 16297,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **202**

```json
{
  "command_id": "65d30a01-33a0-4aa6-8b74-911fb11f1bbf",
  "quote_id": "2147ac72-1c07-4c7c-b9a5-183a41b4c760",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4437,
    "lon": 30.4970
  },
  "pickup_label": "вул. Дмитрівська",
  "dropoff": {
    "lat": 50.4584,
    "lon": 30.4300
  },
  "dropoff_label": "Нивки",
  "payment_method": "CARD"
}
```

```json
{
  "id": "38696089-c2bd-417c-921d-c9d74d14a876",
  "short_number": 29,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "c22f53aa-d934-4fb0-ac6b-141ba50d83c9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4437,
    "lon": 30.497
  },
  "pickup_label": "вул. Дмитрівська",
  "dropoff": {
    "lat": 50.4584,
    "lon": 30.43
  },
  "dropoff_label": "Нивки",
  "payment_method": "CARD",
  "payment_state": "AUTH_PENDING",
  "price_minor": 16297,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": null,
  "assignment": null,
  "created_at": "2026-10-30T19:16:08.413505Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/38696089-c2bd-417c-921d-c9d74d14a876` → **200**

```json
{
  "id": "38696089-c2bd-417c-921d-c9d74d14a876",
  "short_number": 29,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "c22f53aa-d934-4fb0-ac6b-141ba50d83c9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4437,
    "lon": 30.497
  },
  "pickup_label": "вул. Дмитрівська",
  "dropoff": {
    "lat": 50.4584,
    "lon": 30.43
  },
  "dropoff_label": "Нивки",
  "payment_method": "CARD",
  "payment_state": "AUTH_PENDING",
  "price_minor": 16297,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": null,
  "assignment": null,
  "created_at": "2026-10-30T19:16:08.413505Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/38696089-c2bd-417c-921d-c9d74d14a876` → **200**

```json
{
  "id": "38696089-c2bd-417c-921d-c9d74d14a876",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "c22f53aa-d934-4fb0-ac6b-141ba50d83c9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4437,
    "lon": 30.497
  },
  "pickup_label": "вул. Дмитрівська",
  "dropoff": {
    "lat": 50.4584,
    "lon": 30.43
  },
  "dropoff_label": "Нивки",
  "payment_method": "CARD",
  "payment_state": "AUTHORIZED",
  "price_minor": 16297,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T19:16:08.413505Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

## The rider decides to pay in cash

`GET /api/rider/v1/orders/38696089-c2bd-417c-921d-c9d74d14a876` → **200**

```json
{
  "id": "38696089-c2bd-417c-921d-c9d74d14a876",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "c22f53aa-d934-4fb0-ac6b-141ba50d83c9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4437,
    "lon": 30.497
  },
  "pickup_label": "вул. Дмитрівська",
  "dropoff": {
    "lat": 50.4584,
    "lon": 30.43
  },
  "dropoff_label": "Нивки",
  "payment_method": "CARD",
  "payment_state": "AUTHORIZED",
  "price_minor": 16297,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T19:16:08.413505Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/38696089-c2bd-417c-921d-c9d74d14a876/switch-to-cash` → **200**

```json
{
  "command_id": "4dbd09d6-8b1e-4c58-8f04-e3c2864f071c",
  "expected_version": 3
}
```

```json
{
  "id": "38696089-c2bd-417c-921d-c9d74d14a876",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "c22f53aa-d934-4fb0-ac6b-141ba50d83c9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4437,
    "lon": 30.497
  },
  "pickup_label": "вул. Дмитрівська",
  "dropoff": {
    "lat": 50.4584,
    "lon": 30.43
  },
  "dropoff_label": "Нивки",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 16297,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T19:16:08.413505Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/38696089-c2bd-417c-921d-c9d74d14a876/switch-to-cash` → **409**

```json
{
  "command_id": "65c63215-5cb7-4606-8755-62d7c8b72ee0",
  "expected_version": 4
}
```

```json
{
  "instance": "/api/rider/v1/orders/38696089-c2bd-417c-921d-c9d74d14a876/switch-to-cash",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "9889e78d-37b9-49b6-b5f0-c65b81e83cae"
}
```

Done: the card order became cash; a second switch is refused.

`GET /api/rider/v1/orders/38696089-c2bd-417c-921d-c9d74d14a876` → **200**

```json
{
  "id": "38696089-c2bd-417c-921d-c9d74d14a876",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "c22f53aa-d934-4fb0-ac6b-141ba50d83c9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4437,
    "lon": 30.497
  },
  "pickup_label": "вул. Дмитрівська",
  "dropoff": {
    "lat": 50.4584,
    "lon": 30.43
  },
  "dropoff_label": "Нивки",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 16297,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T19:16:08.413505Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/38696089-c2bd-417c-921d-c9d74d14a876/cancel` → **200**

```json
{
  "command_id": "299f9ff4-c9db-4e2a-b3e1-27ccb665908d",
  "expected_version": 4,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "38696089-c2bd-417c-921d-c9d74d14a876",
  "short_number": 29,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "c22f53aa-d934-4fb0-ac6b-141ba50d83c9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4437,
    "lon": 30.497
  },
  "pickup_label": "вул. Дмитрівська",
  "dropoff": {
    "lat": 50.4584,
    "lon": 30.43
  },
  "dropoff_label": "Нивки",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 16297,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "STOPPED",
  "assignment": null,
  "created_at": "2026-10-30T19:16:08.413505Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
      "en": "Changed my mind",
      "ru": "Передумал ехать"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

# Scenario: terminal-ride

## The admin marks that Andrii has an own card terminal

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "62977c79-203f-4b6a-b0e2-6fe227d9b29a",
  "subject": {
    "type": "STAFF",
    "id": "50e6407f-123d-42ca-9890-64ec61c07dce"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MGU2NDA3Zi0xMjNkLTQyY2EtOTg5MC02NGVjNjFjMDdkY2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODg2NzEsImlhdCI6MTc5MzM4Nzc3MSwianRpIjoiOTIyMjM4MjItNGE5NS00ZTJiLTg4ZDQtMDM0OWNjNzExNDJhIiwic2lkIjoiNjI5NzdjNzktMjAzZi00YjZhLWIwZTItNmZlMjI3ZDliMjlhIn0.YDnUnhi87ZI7ZXf3OnLgbiUEnfm4s1I35SAEfpt4oEk",
  "access_expires_at": "2026-10-30T19:31:11.722130094Z",
  "refresh_token": "sUkY6VT9Msn0eI1DjbZXUpH1rju7hYo2-7Sql_bSvII",
  "refresh_expires_at": "2026-10-31T07:16:11.72169498Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-13043"
}
```

```json
{
  "challenge_id": "814f18f7-41f9-4454-b507-051e1c1e7f23",
  "expires_at": "2026-10-30T19:21:11.95246073Z",
  "resend_available_at": "2026-10-30T19:16:12.95246073Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "032351",
  "sent_at": "2026-10-30T19:16:11.954763814Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "814f18f7-41f9-4454-b507-051e1c1e7f23",
  "code": "032351",
  "device_ref": "sandbox-13043"
}
```

```json
{
  "session_id": "8785782b-2b5c-4c90-b39f-eaa98996085c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4ODY3MiwiaWF0IjoxNzkzMzg3NzcyLCJqdGkiOiI4MGY5M2Q0Ny00NjYzLTRiZjYtYjBkZC00MzQ2MjYxNzUwYWYiLCJzaWQiOiI4Nzg1NzgyYi0yYjVjLTRjOTAtYjM5Zi1lYWE5ODk5NjA4NWMifQ.Xur3FApJ8vn0BMGV_dAYAgtOpqtnlmjpc0kW5v9OE-4",
  "access_expires_at": "2026-10-30T19:31:12.219986928Z",
  "refresh_token": "EDcRK2V6jJ7GtH8N55DkVio3dki1nns9-VeHJnqW1oY",
  "refresh_expires_at": "2026-11-29T19:16:12.219542039Z",
  "account_created": false
}
```

`GET /api/driver/v1/profile` → **200**

```json
{
  "id": "5a000000-0000-4000-8000-000000000403",
  "account_state": "ACTIVE",
  "name": "Андрій Шевчук",
  "language": "ru",
  "review_status": "APPROVED",
  "version": 16,
  "has_payment_terminal": false,
  "admission_city_ids": [
    "5a000000-0000-4000-8000-000000000001"
  ],
  "vehicles": [
    {
      "id": "5a000000-0000-4000-8000-000000000503",
      "registration_number": "AA0003TX",
      "make": "Hyundai",
      "model": "Sonata",
      "color": "black",
      "production_year": 2022,
      "state": "APPROVED",
      "class_approvals": [
        "STANDARD",
        "COMFORT"
      ]
    }
  ],
  "documents": []
}
```

`GET /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403` → **200**

```json
{
  "profile": {
    "id": "5a000000-0000-4000-8000-000000000403",
    "account_state": "ACTIVE",
    "name": "Андрій Шевчук",
    "language": "ru",
    "review_status": "APPROVED",
    "version": 16,
    "has_payment_terminal": false,
    "admission_city_ids": [
      "5a000000-0000-4000-8000-000000000001"
    ],
    "vehicles": [
      {
        "id": "5a000000-0000-4000-8000-000000000503",
        "registration_number": "AA0003TX",
        "make": "Hyundai",
        "model": "Sonata",
        "color": "black",
        "production_year": 2022,
        "state": "APPROVED",
        "class_approvals": [
          "STANDARD",
          "COMFORT"
        ]
      }
    ],
    "documents": []
  },
  "phone": "+380500000003",
  "history": [],
  "duplicates": []
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "b0a0c493-f575-4934-b161-1f4c4d42153b",
  "expected_version": 16,
  "has_terminal": true,
  "reason": "ФОП, власний POS-термінал"
}
```

```json
{
  "id": "5a000000-0000-4000-8000-000000000403",
  "account_state": "ACTIVE",
  "name": "Андрій Шевчук",
  "language": "ru",
  "review_status": "APPROVED",
  "version": 17,
  "has_payment_terminal": true,
  "admission_city_ids": [
    "5a000000-0000-4000-8000-000000000001"
  ],
  "vehicles": [
    {
      "id": "5a000000-0000-4000-8000-000000000503",
      "registration_number": "AA0003TX",
      "make": "Hyundai",
      "model": "Sonata",
      "color": "black",
      "production_year": 2022,
      "state": "APPROVED",
      "class_approvals": [
        "STANDARD",
        "COMFORT"
      ]
    }
  ],
  "documents": []
}
```

## Ivan (no terminal) is nearer than Andrii

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-17384"
}
```

```json
{
  "challenge_id": "8e142ee9-29ce-4159-86e4-a49db9006597",
  "expires_at": "2026-10-30T19:21:13.202804463Z",
  "resend_available_at": "2026-10-30T19:16:14.202804463Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "007601",
  "sent_at": "2026-10-30T19:16:13.204973767Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8e142ee9-29ce-4159-86e4-a49db9006597",
  "code": "007601",
  "device_ref": "sandbox-17384"
}
```

```json
{
  "session_id": "8f96a750-7c0d-43ef-830a-dc75a2a90165",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4ODY3MywiaWF0IjoxNzkzMzg3NzczLCJqdGkiOiI5NWFiNTM2MC03NzFjLTRlYzItOGFhYS05MjU1MWY0ZTJlNmUiLCJzaWQiOiI4Zjk2YTc1MC03YzBkLTQzZWYtODMwYS1kYzc1YTJhOTAxNjUifQ.7jsYIxGfsC36FE1HgmNxEMDIQ_zIMjBfT2tfUPuHZg8",
  "access_expires_at": "2026-10-30T19:31:13.466762394Z",
  "refresh_token": "PTMvjSq3FBgy8EpxY6XWrBbSqlumT6nx3adGZ3nbYR8",
  "refresh_expires_at": "2026-11-29T19:16:13.466362162Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "992acc36-510d-462e-ba35-25c932eefedc",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "DISCONNECTED",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T19:15:42.746589Z",
  "last_location_at": "2026-10-30T19:15:42.746589Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/992acc36-510d-462e-ba35-25c932eefedc/handover` → **200**

```json
{
  "command_id": "7eb4ccd3-2d63-4707-b7fe-065f93becc21",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "992acc36-510d-462e-ba35-25c932eefedc",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "DISCONNECTED",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T19:15:42.746589Z",
  "last_location_at": "2026-10-30T19:15:42.746589Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

(the car drives 17 s to the next point)

`POST /api/driver/v1/work-sessions/992acc36-510d-462e-ba35-25c932eefedc/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:16:31Z",
    "sequence": 1793387791289
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "992acc36-510d-462e-ba35-25c932eefedc",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T19:16:31.306022Z",
  "last_location_at": "2026-10-30T19:16:31.306022Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "3af27f8b-3fa4-45ab-a89c-939df6f6f265",
  "session_version": 2,
  "session_state": "CLOSING",
  "intent": "PAUSE_AFTER_CURRENT",
  "connection": "DISCONNECTED",
  "geolocation": "STALE",
  "occupancy": "ON_TRIP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "last_heartbeat_at": "2026-10-30T19:08:42.209307Z",
  "last_location_at": "2026-10-30T19:08:42.209307Z",
  "eligible": false,
  "ineligible_reasons": [
    "SESSION_CLOSING",
    "INTENT_PAUSE_AFTER_CURRENT",
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE",
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/work-sessions/3af27f8b-3fa4-45ab-a89c-939df6f6f265/handover` → **200**

```json
{
  "command_id": "62d37836-db0a-4c5c-9359-640bf059b9bc",
  "expected_version": 2
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "3af27f8b-3fa4-45ab-a89c-939df6f6f265",
  "session_version": 3,
  "session_state": "CLOSING",
  "intent": "PAUSE_AFTER_CURRENT",
  "connection": "DISCONNECTED",
  "geolocation": "STALE",
  "occupancy": "ON_TRIP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "last_heartbeat_at": "2026-10-30T19:08:42.209307Z",
  "last_location_at": "2026-10-30T19:08:42.209307Z",
  "eligible": false,
  "ineligible_reasons": [
    "SESSION_CLOSING",
    "INTENT_PAUSE_AFTER_CURRENT",
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE",
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/work-sessions/3af27f8b-3fa4-45ab-a89c-939df6f6f265/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:16:32Z",
    "sequence": 1793387792494
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "3af27f8b-3fa4-45ab-a89c-939df6f6f265",
  "session_version": 3,
  "session_state": "CLOSING",
  "intent": "PAUSE_AFTER_CURRENT",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "ON_TRIP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "last_heartbeat_at": "2026-10-30T19:16:32.066858Z",
  "last_location_at": "2026-10-30T19:16:32.066858Z",
  "eligible": false,
  "ineligible_reasons": [
    "SESSION_CLOSING",
    "INTENT_PAUSE_AFTER_CURRENT",
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

## The operator takes a phone order paid at the terminal

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "OPERATOR",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "61b23325-0e9e-4f07-9fe7-a0bf9d0355e7",
  "subject": {
    "type": "STAFF",
    "id": "50e6407f-123d-42ca-9890-64ec61c07dce"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MGU2NDA3Zi0xMjNkLTQyY2EtOTg5MC02NGVjNjFjMDdkY2UiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODg2OTIsImlhdCI6MTc5MzM4Nzc5MiwianRpIjoiNDVlY2VhYmQtZjhjMi00MmI2LThjZDUtZTkyY2I3ZjE4YWVhIiwic2lkIjoiNjFiMjMzMjUtMGU5ZS00ZjA3LTlmZTctYTBiZjlkMDM1NWU3In0.aCPOm2NuhrD5fyZa4U_kzhpmjYzDPzI9RI5N6wBCKyE",
  "access_expires_at": "2026-10-30T19:31:32.563527955Z",
  "refresh_token": "k_mDZ2XjSvYOq5dGgt-KKvpdBTmWWfh3qPEdUqTIWdk",
  "refresh_expires_at": "2026-10-31T07:16:32.562991839Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "fec02999-ddc2-43c8-b6c1-ccc7c621325b",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.6522
  }
}
```

```json
{
  "id": "eff3737e-8996-4009-950a-d825eb963a01",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T19:21:32.807234Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false,
  "discount_minor": 0,
  "to_pay_minor": 29967,
  "promotions": []
}
```

`POST /api/operator/v1/orders` → **201**

```json
{
  "command_id": "e40c540d-5f9d-4855-a63b-cd9bf1c27971",
  "quote_id": "eff3737e-8996-4009-950a-d825eb963a01",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.6522
  },
  "dropoff_label": "Позняки",
  "payment_method": "TERMINAL",
  "caller": {
    "name": "Олена",
    "phone": "+380671112233"
  }
}
```

```json
{
  "id": "6203fd88-d7a1-4db1-b5ee-fdfbbd06f238",
  "short_number": 30,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "PHONE",
  "payer_client_id": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.6522
  },
  "dropoff_label": "Позняки",
  "payment_method": "TERMINAL",
  "payment_state": "TERMINAL_EXPECTED",
  "price_minor": 29967,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T19:16:33.059686Z",
  "caller": {
    "name": "Олена",
    "phone": "+380671112233"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/driver/v1/offers` → **200**

```json
[]
```

## Andrii accepts, drives and reports the card payment went through

`GET /api/driver/v1/offers` → **200**

```json
[]
```

`POST /api/driver/v1/offers/null/accept` → **400**

```json
{
  "command_id": "99daaa15-8ff0-4006-9248-b140e57b3d7b"
}
```

```json
{
  "instance": "/api/driver/v1/offers/null/accept",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "7a96ed50-8b74-41f4-8d87-da659182f9c4"
}
```

**Expected 200, got 400 — scenario stopped.**

# Scenario: zz-metrics

## A search without drivers ends as UNFULFILLED

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-17062"
}
```

```json
{
  "challenge_id": "165d9ac1-7d05-4ecf-a537-9fd6224efaa7",
  "expires_at": "2026-10-30T19:21:34.099495396Z",
  "resend_available_at": "2026-10-30T19:16:35.099495396Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "418781",
  "sent_at": "2026-10-30T19:16:34.101619411Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "165d9ac1-7d05-4ecf-a537-9fd6224efaa7",
  "code": "418781",
  "device_ref": "sandbox-17062"
}
```

```json
{
  "session_id": "dcdfd07b-3fea-4681-ba19-46cb443cd008",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4ODY5NCwiaWF0IjoxNzkzMzg3Nzk0LCJqdGkiOiIwMTMzMThhMy04MjkwLTRmNTAtYjI3Yi1mOThmMTAwOTU4MmEiLCJzaWQiOiJkY2RmZDA3Yi0zZmVhLTQ2ODEtYmExOS00NmNiNDQzY2QwMDgifQ.-Y2vDj0lT7BBWOv3j6Wth69Byt4U4KewqQ3UvY_UxPw",
  "access_expires_at": "2026-10-30T19:31:34.36019275Z",
  "refresh_token": "_CbZHKy7oZnO_-YWdWDJNerQ7d1SoGlLES1bifLRkA4",
  "refresh_expires_at": "2026-11-29T19:16:34.359661791Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "992acc36-510d-462e-ba35-25c932eefedc",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T19:16:31.306022Z",
  "last_location_at": "2026-10-30T19:16:31.306022Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/992acc36-510d-462e-ba35-25c932eefedc/close` → **409**

```json
{
  "command_id": "b729a6d9-2be8-479e-8ced-258f387f4325",
  "expected_version": 1
}
```

```json
{
  "instance": "/api/driver/v1/work-sessions/992acc36-510d-462e-ba35-25c932eefedc/close",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "894e8ea2-0d28-46d7-8d01-03b40062f5a4"
}
```

**Expected 200, got 409 — scenario stopped.**

# Scenario: zz-reconciliation

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "484c1ea4-f9cc-49d1-b6e2-326e7b251bc8",
  "subject": {
    "type": "STAFF",
    "id": "50e6407f-123d-42ca-9890-64ec61c07dce"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MGU2NDA3Zi0xMjNkLTQyY2EtOTg5MC02NGVjNjFjMDdkY2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODg2OTUsImlhdCI6MTc5MzM4Nzc5NSwianRpIjoiNzQ5NGVkZmEtM2Q2Mi00ZWIwLTljNWYtMjM1YTkwOWEzOTE0Iiwic2lkIjoiNDg0YzFlYTQtZjljYy00OWQxLWI2ZTItMzI2ZTdiMjUxYmM4In0.MZIlLoLaslUqUut3eEk9KseMAMIND21184dTIKFE-Rg",
  "access_expires_at": "2026-10-30T19:31:35.378060971Z",
  "refresh_token": "tJOKWM53r2X_uGYu-HMQnxZ3DeBq5FIk5TeZnNGNzgw",
  "refresh_expires_at": "2026-10-31T07:16:35.377594059Z",
  "password_change_required": false
}
```

## The earlier card flows reconcile cleanly without moving money

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30"
}
```

```json
{
  "id": "b11580e5-0aa3-4a2d-b869-7850b3ec09b3",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T19:16:35.628279Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T19:16:35.62832Z",
  "updated_at": "2026-10-30T19:16:35.646613Z",
  "finished_at": "2026-10-30T19:16:35.646613Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/b11580e5-0aa3-4a2d-b869-7850b3ec09b3` → **200**

```json
{
  "run": {
    "id": "b11580e5-0aa3-4a2d-b869-7850b3ec09b3",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T19:16:35.628279Z",
    "partial": true,
    "state": "CLEAN",
    "local_count": 10,
    "provider_count": 10,
    "item_count": 0,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T19:16:35.62832Z",
    "updated_at": "2026-10-30T19:16:35.646613Z",
    "finished_at": "2026-10-30T19:16:35.646613Z",
    "version": 1
  },
  "items": [],
  "next": null
}
```

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30"
}
```

```json
{
  "id": "b11580e5-0aa3-4a2d-b869-7850b3ec09b3",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T19:16:35.628279Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T19:16:35.62832Z",
  "updated_at": "2026-10-30T19:16:35.646613Z",
  "finished_at": "2026-10-30T19:16:35.646613Z",
  "version": 1
}
```

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30"
}
```

```json
{
  "id": "b11580e5-0aa3-4a2d-b869-7850b3ec09b3",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T19:16:35.628279Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T19:16:35.62832Z",
  "updated_at": "2026-10-30T19:16:35.646613Z",
  "finished_at": "2026-10-30T19:16:35.646613Z",
  "version": 1
}
```

## One independent bank transaction produces one missing-local item on another merchant's first snapshot

`POST /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/ea99636a-0233-4010-b5fe-d419790c65a2` → **204**

```json
{
  "amount_minor": 100,
  "currency": "PLN"
}
```

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30"
}
```

```json
{
  "id": "1541ffe7-9ded-4477-9937-b48babf6d530",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T19:16:36.023221Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T19:16:36.023263Z",
  "updated_at": "2026-10-30T19:16:36.029354Z",
  "finished_at": "2026-10-30T19:16:36.029354Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/1541ffe7-9ded-4477-9937-b48babf6d530` → **200**

```json
{
  "run": {
    "id": "1541ffe7-9ded-4477-9937-b48babf6d530",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T19:16:36.023221Z",
    "partial": true,
    "state": "OPEN",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 1,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T19:16:36.023263Z",
    "updated_at": "2026-10-30T19:16:36.029354Z",
    "finished_at": "2026-10-30T19:16:36.029354Z",
    "version": 1
  },
  "items": [
    {
      "id": "1d51701e-b25d-41b1-862a-213f6fdf8b6b",
      "run_id": "1541ffe7-9ded-4477-9937-b48babf6d530",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "21e01cc86dc2978891a7d351e60def0a3e989b275135adef2108d31fca2ebedf",
      "reference_display": "sandbox-reconciliation-ea#####a-0233-4010-b5fe-d#####c65a2",
      "local_operation_id": null,
      "local_record_id": null,
      "local_type": null,
      "local_state": null,
      "local_amount_minor": null,
      "local_currency": null,
      "provider_type": "PURCHASE",
      "provider_state": "CAPTURED",
      "provider_status": "Approved",
      "provider_amount_minor": 100,
      "provider_currency": "PLN",
      "fee_minor": null,
      "provider_at": "2026-10-30T19:16:35Z",
      "state": "OPEN",
      "decision": null,
      "reason": null,
      "resolved_by": null,
      "resolved_at": null,
      "version": 0
    }
  ],
  "next": null
}
```

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30"
}
```

```json
{
  "id": "1541ffe7-9ded-4477-9937-b48babf6d530",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T19:16:36.023221Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T19:16:36.023263Z",
  "updated_at": "2026-10-30T19:16:36.029354Z",
  "finished_at": "2026-10-30T19:16:36.029354Z",
  "version": 1
}
```

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30"
}
```

```json
{
  "id": "1541ffe7-9ded-4477-9937-b48babf6d530",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T19:16:36.023221Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T19:16:36.023263Z",
  "updated_at": "2026-10-30T19:16:36.029354Z",
  "finished_at": "2026-10-30T19:16:36.029354Z",
  "version": 1
}
```

## The admin explains the item once; a replay is the same result and a different decision conflicts

`POST /api/admin/v1/payment-reconciliations/items/1d51701e-b25d-41b1-862a-213f6fdf8b6b/resolve` → **200**

```json
{
  "command_id": "4392e55c-acec-4a2c-b77b-8704ce9344d0",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "1d51701e-b25d-41b1-862a-213f6fdf8b6b",
  "run_id": "1541ffe7-9ded-4477-9937-b48babf6d530",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "21e01cc86dc2978891a7d351e60def0a3e989b275135adef2108d31fca2ebedf",
  "reference_display": "sandbox-reconciliation-ea#####a-0233-4010-b5fe-d#####c65a2",
  "local_operation_id": null,
  "local_record_id": null,
  "local_type": null,
  "local_state": null,
  "local_amount_minor": null,
  "local_currency": null,
  "provider_type": "PURCHASE",
  "provider_state": "CAPTURED",
  "provider_status": "Approved",
  "provider_amount_minor": 100,
  "provider_currency": "PLN",
  "fee_minor": null,
  "provider_at": "2026-10-30T19:16:35Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "50e6407f-123d-42ca-9890-64ec61c07dce",
  "resolved_at": "2026-10-30T19:16:36.40534Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/1d51701e-b25d-41b1-862a-213f6fdf8b6b/resolve` → **200**

```json
{
  "command_id": "4392e55c-acec-4a2c-b77b-8704ce9344d0",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "1d51701e-b25d-41b1-862a-213f6fdf8b6b",
  "run_id": "1541ffe7-9ded-4477-9937-b48babf6d530",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "21e01cc86dc2978891a7d351e60def0a3e989b275135adef2108d31fca2ebedf",
  "reference_display": "sandbox-reconciliation-ea#####a-0233-4010-b5fe-d#####c65a2",
  "local_operation_id": null,
  "local_record_id": null,
  "local_type": null,
  "local_state": null,
  "local_amount_minor": null,
  "local_currency": null,
  "provider_type": "PURCHASE",
  "provider_state": "CAPTURED",
  "provider_status": "Approved",
  "provider_amount_minor": 100,
  "provider_currency": "PLN",
  "fee_minor": null,
  "provider_at": "2026-10-30T19:16:35Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "50e6407f-123d-42ca-9890-64ec61c07dce",
  "resolved_at": "2026-10-30T19:16:36.40534Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/1d51701e-b25d-41b1-862a-213f6fdf8b6b/resolve` → **409**

```json
{
  "command_id": "f150f261-4891-4885-895f-2d5bff0b9b6f",
  "expected_version": 1,
  "decision": "ESCALATED",
  "reason": "A conflicting second decision"
}
```

```json
{
  "instance": "/api/admin/v1/payment-reconciliations/items/1d51701e-b25d-41b1-862a-213f6fdf8b6b/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "f1a46b39-ac55-4435-9f84-1ede357bc5b7"
}
```

`GET /api/admin/v1/payment-reconciliations/1541ffe7-9ded-4477-9937-b48babf6d530` → **200**

```json
{
  "run": {
    "id": "1541ffe7-9ded-4477-9937-b48babf6d530",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T19:16:36.023221Z",
    "partial": true,
    "state": "RESOLVED",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T19:16:36.023263Z",
    "updated_at": "2026-10-30T19:16:36.40534Z",
    "finished_at": "2026-10-30T19:16:36.029354Z",
    "version": 2
  },
  "items": [
    {
      "id": "1d51701e-b25d-41b1-862a-213f6fdf8b6b",
      "run_id": "1541ffe7-9ded-4477-9937-b48babf6d530",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "21e01cc86dc2978891a7d351e60def0a3e989b275135adef2108d31fca2ebedf",
      "reference_display": "sandbox-reconciliation-ea#####a-0233-4010-b5fe-d#####c65a2",
      "local_operation_id": null,
      "local_record_id": null,
      "local_type": null,
      "local_state": null,
      "local_amount_minor": null,
      "local_currency": null,
      "provider_type": "PURCHASE",
      "provider_state": "CAPTURED",
      "provider_status": "Approved",
      "provider_amount_minor": 100,
      "provider_currency": "PLN",
      "fee_minor": null,
      "provider_at": "2026-10-30T19:16:35Z",
      "state": "RESOLVED",
      "decision": "EXPLAINED",
      "reason": "Independent sandbox bank fixture; no real money moved",
      "resolved_by": "50e6407f-123d-42ca-9890-64ec61c07dce",
      "resolved_at": "2026-10-30T19:16:36.40534Z",
      "version": 1
    }
  ],
  "next": null
}
```

`GET /api/admin/v1/payment-reconciliations?merchant_id=5a000000-0000-4000-8000-000000000602&limit=100` → **200**

```json
{
  "runs": [
    {
      "id": "1541ffe7-9ded-4477-9937-b48babf6d530",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-30",
      "period_from": "2026-10-29T22:00:00Z",
      "period_to": "2026-10-31T02:00:00Z",
      "observed_until": "2026-10-30T19:16:36.023221Z",
      "partial": true,
      "state": "RESOLVED",
      "local_count": 0,
      "provider_count": 1,
      "item_count": 1,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-30T19:16:36.023263Z",
      "updated_at": "2026-10-30T19:16:36.40534Z",
      "finished_at": "2026-10-30T19:16:36.029354Z",
      "version": 2
    },
    {
      "id": "a3e5c64a-a1a0-4535-a765-5a0f32bd42d7",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-29",
      "period_from": "2026-10-28T22:00:00Z",
      "period_to": "2026-10-30T02:00:00Z",
      "observed_until": "2026-10-30T18:59:28.063313Z",
      "partial": false,
      "state": "CLEAN",
      "local_count": 0,
      "provider_count": 0,
      "item_count": 0,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-30T18:59:28.063395Z",
      "updated_at": "2026-10-30T18:59:28.076021Z",
      "finished_at": "2026-10-30T18:59:28.076021Z",
      "version": 1
    }
  ],
  "next_cursor": null
}
```

`DELETE /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/ea99636a-0233-4010-b5fe-d419790c65a2` → **204**

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30"
}
```

```json
{
  "id": "1541ffe7-9ded-4477-9937-b48babf6d530",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T19:16:36.023221Z",
  "partial": true,
  "state": "RESOLVED",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T19:16:36.023263Z",
  "updated_at": "2026-10-30T19:16:36.40534Z",
  "finished_at": "2026-10-30T19:16:36.029354Z",
  "version": 2
}
```

Done: clean card snapshot, one bank-only difference, three identical runs, audited decision/replay/conflict, bank fixture restored.

# Scenario: zzz-invariants

## Five invariant checks are clean after all scenario transactions settle

```prometheus
blizz_invariant_last_success{application="blizz-taxi-server",check="I1"} 1.793387918351E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I2"} 1.793387918652E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I3"} 1.793387918652E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I4"} 1.793387918351E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I5"} 1.793387918653E9
blizz_invariant_violations{application="blizz-taxi-server",check="I1"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I2"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I3"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I4"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I5"} 0.0
```

Done: five fresh zero invariant gauges after the settling margin.
