# Sandbox transcript (2026-10-30T22:29:49Z, b33cc19)

# Scenario: admission-cities

## Only Andrii is online in Kyiv for this scenario

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-14637"
}
```

```json
{
  "challenge_id": "d6e2b928-b376-45a1-b15e-d4c4a76974c5",
  "expires_at": "2026-10-30T22:34:49.144193987Z",
  "resend_available_at": "2026-10-30T22:29:50.144193987Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "911104",
  "sent_at": "2026-10-30T22:29:49.160522584Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d6e2b928-b376-45a1-b15e-d4c4a76974c5",
  "code": "911104",
  "device_ref": "sandbox-14637"
}
```

```json
{
  "session_id": "4ac9edc0-d24b-4ef7-8a29-45c16b8af512",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwMDI5NywiaWF0IjoxNzkzMzk5Mzk3LCJqdGkiOiJhZDQ5MmU4Ni0xMDAwLTRhOWItOWYwOS01NDQzOTBhMWIzYjAiLCJzaWQiOiI0YWM5ZWRjMC1kMjRiLTRlZjctOGEyOS00NWMxNmI4YWY1MTIifQ.NvBz9ovIvJqPv7wgL-9W0SIQcooajnH_a6ZWoSJ1aXY",
  "access_expires_at": "2026-10-30T22:44:57.842479233Z",
  "refresh_token": "zy8VaKqNP0_qPYtAhBjlfexU1NLejJdJ-yJcnbzUqPc",
  "refresh_expires_at": "2026-11-29T22:29:57.840296902Z",
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
  "device_ref": "sandbox-16100"
}
```

```json
{
  "challenge_id": "7490e793-37e6-49a0-8cdb-a341eb91e380",
  "expires_at": "2026-10-30T22:34:58.544305243Z",
  "resend_available_at": "2026-10-30T22:29:59.544305243Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "952912",
  "sent_at": "2026-10-30T22:29:58.549755804Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7490e793-37e6-49a0-8cdb-a341eb91e380",
  "code": "952912",
  "device_ref": "sandbox-16100"
}
```

```json
{
  "session_id": "9e9829bf-b233-4e07-905f-bdbf7195ad5a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwMDI5OCwiaWF0IjoxNzkzMzk5Mzk4LCJqdGkiOiI0NGZjMTc1Zi1jMTBmLTRiODQtOWFlYy0zYWI4NDNmNTZiNmYiLCJzaWQiOiI5ZTk4MjliZi1iMjMzLTRlMDctOTA1Zi1iZGJmNzE5NWFkNWEifQ.6JKXEkU973lG8ml0CtMjw3K_-PkCasIcGEkHo20mx_Q",
  "access_expires_at": "2026-10-30T22:44:58.876481405Z",
  "refresh_token": "dYN2KAMH0nPISiSnnXazwLVBKnXa1kdBQ_Zi7imsTa4",
  "refresh_expires_at": "2026-11-29T22:29:58.875316039Z",
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
  "correlation_id": "ec846b2e-8e52-4cf1-8172-40c56a0e6a96"
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
  "session_id": "b94ec928-678c-441d-9e71-ea6f95fb2551",
  "subject": {
    "type": "STAFF",
    "id": "09fe1c69-c031-458c-a537-a40fa884b9ac"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwOWZlMWM2OS1jMDMxLTQ1OGMtYTUzNy1hNDBmYTg4NGI5YWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDAzMDAsImlhdCI6MTc5MzM5OTQwMCwianRpIjoiZmJmOTcxZGItM2VlMy00OWM2LThhNmUtMGM2YWMwNjA5YmY3Iiwic2lkIjoiYjk0ZWM5MjgtNjc4Yy00NDFkLTllNzEtZWE2Zjk1ZmIyNTUxIn0.N4fECJd-R6JgeEJuLJu68_BerCHzsiYI6qx9j9zOYn4",
  "access_expires_at": "2026-10-30T22:45:00.380202548Z",
  "refresh_token": "v4n6WlbP2GHKp1S7nZIFCfFwdJEuugEafuJUBsZT0Nc",
  "refresh_expires_at": "2026-10-31T10:30:00.379171943Z",
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
  "session_id": "fa2cf2f2-c95c-4eaa-96da-7af678328ee0",
  "subject": {
    "type": "STAFF",
    "id": "09fe1c69-c031-458c-a537-a40fa884b9ac"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwOWZlMWM2OS1jMDMxLTQ1OGMtYTUzNy1hNDBmYTg4NGI5YWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDAzMDIsImlhdCI6MTc5MzM5OTQwMiwianRpIjoiMDAwYjk5NDEtYjU3Ny00M2YxLTlmZjYtNTNlMjFmOThkMzExIiwic2lkIjoiZmEyY2YyZjItYzk1Yy00ZWFhLTk2ZGEtN2FmNjc4MzI4ZWUwIn0.OPP2XO6-2uAlmd3PksswaQtTXqWgwALMzgekasShHBY",
  "access_expires_at": "2026-10-30T22:45:02.182733165Z",
  "refresh_token": "RiWq7S0pFFe1C18Khw1mH9Ol0qavxu_EKjToE0HhtYg",
  "refresh_expires_at": "2026-10-31T10:30:02.181702915Z",
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
  "session_id": "6bc31161-1f7b-4c01-b31f-fdbba35b9332",
  "subject": {
    "type": "STAFF",
    "id": "09fe1c69-c031-458c-a537-a40fa884b9ac"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwOWZlMWM2OS1jMDMxLTQ1OGMtYTUzNy1hNDBmYTg4NGI5YWMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDAzMDIsImlhdCI6MTc5MzM5OTQwMiwianRpIjoiNDM2MzQzN2QtNWIwMS00NWFjLWJjNjMtMWU4MDJlMzY1YTRiIiwic2lkIjoiNmJjMzExNjEtMWY3Yi00YzAxLWIzMWYtZmRiYmEzNWI5MzMyIn0.9eHkMqxFgCPlLJqJ4iOx98u_8zVJioA1dIAlgI01tFA",
  "access_expires_at": "2026-10-30T22:45:02.767850466Z",
  "refresh_token": "eBnsuOB48Z6ObYK63t7J61T5zpAvDUkFLUGZfbYb9Og",
  "refresh_expires_at": "2026-10-31T10:30:02.766861613Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-2419"
}
```

```json
{
  "challenge_id": "d5a86ba2-a549-4e61-ac9b-2b1a1873e102",
  "expires_at": "2026-10-30T22:35:03.071963332Z",
  "resend_available_at": "2026-10-30T22:30:04.071963332Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "335913",
  "sent_at": "2026-10-30T22:30:03.077679826Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d5a86ba2-a549-4e61-ac9b-2b1a1873e102",
  "code": "335913",
  "device_ref": "sandbox-2419"
}
```

```json
{
  "session_id": "8bc34378-61bd-4e98-85a8-1f2d35e839cd",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwMDMwMywiaWF0IjoxNzkzMzk5NDAzLCJqdGkiOiI2ZThkZDQwMy02MzlhLTRhMzctOWFjMC1iNzE4ODU2YmFlZTciLCJzaWQiOiI4YmMzNDM3OC02MWJkLTRlOTgtODVhOC0xZjJkMzVlODM5Y2QifQ.oE62m0Pj9mTPJzr9gcMSxa_kANe0zfWWC99jAZMk7bc",
  "access_expires_at": "2026-10-30T22:45:03.427321576Z",
  "refresh_token": "CSyd1tWOJ_FJicX4PcZX6qNJDuKsY7YkBG80-pflt0Y",
  "refresh_expires_at": "2026-11-29T22:30:03.426449843Z",
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
  "command_id": "155d7138-9013-4ab8-8c80-18be9313c436",
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
  "command_id": "33948971-202a-48e6-9341-fc4cfea263fe",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4528,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:30:04Z",
    "sequence": 1793399404678
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
  "correlation_id": "a5578c6b-ee06-4470-a227-e3c37ef79ffc"
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
  "command_id": "df665af6-3316-41fa-8828-87846fc49140",
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
  "command_id": "353239d3-4948-4f23-93c4-5a70d03d2179",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4528,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:30:06Z",
    "sequence": 1793399406138
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "7b801252-9f31-464b-a685-08054fb9bddd",
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
  "last_heartbeat_at": "2026-10-30T22:30:06.161157Z",
  "last_location_at": "2026-10-30T22:30:06.161157Z",
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
  "command_id": "10813fad-890d-4430-96ba-643d9e1ed95d",
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
  "session_id": "7b801252-9f31-464b-a685-08054fb9bddd",
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
  "last_heartbeat_at": "2026-10-30T22:30:06.161157Z",
  "last_location_at": "2026-10-30T22:30:06.161157Z",
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
  "phone": "+380686405879",
  "device_ref": "sandbox-15731"
}
```

```json
{
  "challenge_id": "3a8c260d-ebb3-47d5-b714-f46b0e71a4eb",
  "expires_at": "2026-10-30T22:35:07.382573453Z",
  "resend_available_at": "2026-10-30T22:30:08.382573453Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380686405879` → **200**

```json
{
  "phone": "+380686405879",
  "audience": "CLIENT",
  "code": "460248",
  "sent_at": "2026-10-30T22:30:07.387166235Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3a8c260d-ebb3-47d5-b714-f46b0e71a4eb",
  "code": "460248",
  "device_ref": "sandbox-15731"
}
```

```json
{
  "session_id": "6463ca95-54c8-41fc-8526-4e73610bd30c",
  "subject": {
    "type": "CLIENT",
    "id": "42c7256b-08c8-4616-8324-f6d6051b7876"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MmM3MjU2Yi0wOGM4LTQ2MTYtODMyNC1mNmQ2MDUxYjc4NzYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDAwMzA3LCJpYXQiOjE3OTMzOTk0MDcsImp0aSI6ImU3YmU1YmJmLWE4YTAtNGVhOS04OTRjLWU1ZjYyODM2OTQxOSIsInNpZCI6IjY0NjNjYTk1LTU0YzgtNDFmYy04NTI2LTRlNzM2MTBiZDMwYyJ9.0ClKjuHjP3HrXPRZ3QMcKC8X8WlocnSMYS2zCHF_Np4",
  "access_expires_at": "2026-10-30T22:45:07.716616514Z",
  "refresh_token": "4vyzd9vrHwQz-Xmgo5Y5YezxHTuzdNrf2n4KmXpO0DA",
  "refresh_expires_at": "2026-11-29T22:30:07.715730345Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "060cf2cf-b120-4724-928f-576c568693f8",
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
  "id": "2b2b7113-3cb5-452a-b6a3-6e6cd18f1828",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T22:35:08.055451Z",
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
  "command_id": "82a6cb8b-8954-4530-baac-71bebc03fd89",
  "quote_id": "2b2b7113-3cb5-452a-b6a3-6e6cd18f1828",
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
  "id": "33b260d2-3be7-41f9-8347-e993804ce202",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "42c7256b-08c8-4616-8324-f6d6051b7876",
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
  "created_at": "2026-10-30T22:30:08.447085Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
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

`POST /api/driver/v1/orders/33b260d2-3be7-41f9-8347-e993804ce202/claim` → **409**

```json
{
  "command_id": "06b0ad27-693e-462c-b34d-4f486ad663f1"
}
```

```json
{
  "instance": "/api/driver/v1/orders/33b260d2-3be7-41f9-8347-e993804ce202/claim",
  "status": 409,
  "title": "Driver not eligible",
  "type": "https://errors.blizz.taxi/driver-not-eligible",
  "code": "DRIVER_NOT_ELIGIBLE",
  "correlation_id": "ca0be86c-7232-4f0c-90d2-44bc3845441c"
}
```

`GET /api/operator/v1/orders/33b260d2-3be7-41f9-8347-e993804ce202/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T22:30:08.449809Z",
      "actor": {
        "type": "CLIENT",
        "id": "42c7256b-08c8-4616-8324-f6d6051b7876",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "33b260d2-3be7-41f9-8347-e993804ce202",
        "quote_id": "2b2b7113-3cb5-452a-b6a3-6e6cd18f1828",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "2f66f337-8ee0-4c8b-bb3e-6ca54abed361"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T22:30:08.456258Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "33b260d2-3be7-41f9-8347-e993804ce202",
        "attempt_id": "35764c53-375f-48af-8cf2-cbc1043e4abe",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "2f66f337-8ee0-4c8b-bb3e-6ca54abed361"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-30T22:30:08.510231Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "33b260d2-3be7-41f9-8347-e993804ce202",
        "attempt_id": "35764c53-375f-48af-8cf2-cbc1043e4abe"
      },
      "correlation_id": "2f66f337-8ee0-4c8b-bb3e-6ca54abed361"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "35764c53-375f-48af-8cf2-cbc1043e4abe",
        "generation": 1,
        "started_at": "2026-10-30T22:30:08.45367Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-30T22:30:08.510231Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-30T22:30:08.458136Z",
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
  "command_id": "d3c3819a-96db-4bc1-b4a9-cc80055749ae",
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

`POST /api/driver/v1/work-sessions/7b801252-9f31-464b-a685-08054fb9bddd/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4528,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:30:10Z",
    "sequence": 1793399410673
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "7b801252-9f31-464b-a685-08054fb9bddd",
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
  "last_heartbeat_at": "2026-10-30T22:30:10.698787Z",
  "last_location_at": "2026-10-30T22:30:10.698787Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000001/zones` → **201**

```json
{
  "command_id": "3b9e49be-0bdf-4cb0-a89f-494e2ead8c95",
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
  "id": "7877ef4c-53c4-41d5-a69a-d3ea1a0004ce",
  "state": "DRAFT",
  "version": 0
}
```

`POST /api/admin/v1/zones/7877ef4c-53c4-41d5-a69a-d3ea1a0004ce/publish` → **200**

```json
{
  "command_id": "ede32b03-8a9d-4570-80f1-5cf46f92162e",
  "expected_version": 0,
  "reason": "Sandbox"
}
```

```json
{
  "id": "7877ef4c-53c4-41d5-a69a-d3ea1a0004ce",
  "state": "PUBLISHED",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000001/zones` → **201**

```json
{
  "command_id": "7d821f97-aafc-4bcb-a968-df42c847d662",
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
  "id": "ea103926-8aa8-43d8-a201-445d6b33e35e",
  "state": "DRAFT",
  "version": 0
}
```

`POST /api/admin/v1/zones/ea103926-8aa8-43d8-a201-445d6b33e35e/publish` → **200**

```json
{
  "command_id": "0975a1d0-311c-481b-9942-d226897db78b",
  "expected_version": 0,
  "reason": "Sandbox"
}
```

```json
{
  "id": "ea103926-8aa8-43d8-a201-445d6b33e35e",
  "state": "PUBLISHED",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/zones` → **201**

```json
{
  "command_id": "aec5f453-0c5f-4f49-a5bb-8442a1134747",
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
  "id": "7580436a-0d8d-4a20-b625-d458d8233290",
  "state": "DRAFT",
  "version": 0
}
```

`POST /api/admin/v1/zones/7580436a-0d8d-4a20-b625-d458d8233290/publish` → **200**

```json
{
  "command_id": "8352a523-7ba7-43d5-9f8b-9e56ec4dff7a",
  "expected_version": 0,
  "reason": "Sandbox"
}
```

```json
{
  "id": "7580436a-0d8d-4a20-b625-d458d8233290",
  "state": "PUBLISHED",
  "version": 1
}
```

`GET /api/driver/v1/broadcast-orders?zone_id=7877ef4c-53c4-41d5-a69a-d3ea1a0004ce` → **200**

```json
[
  {
    "order_id": "33b260d2-3be7-41f9-8347-e993804ce202",
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

`GET /api/driver/v1/broadcast-orders?zone_id=ea103926-8aa8-43d8-a201-445d6b33e35e` → **200**

```json
[]
```

`GET /api/driver/v1/broadcast-orders?zone_id=7580436a-0d8d-4a20-b625-d458d8233290` → **400**

```json
{
  "instance": "/api/driver/v1/broadcast-orders",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "57801117-f60f-42cc-bacb-da8933c46c71"
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
  "command_id": "5c5693aa-5b41-43d6-ae33-e1be941a5d7a",
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

`GET /api/operator/v1/orders/33b260d2-3be7-41f9-8347-e993804ce202` → **200**

```json
{
  "id": "33b260d2-3be7-41f9-8347-e993804ce202",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "42c7256b-08c8-4616-8324-f6d6051b7876",
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
  "created_at": "2026-10-30T22:30:08.447085Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/33b260d2-3be7-41f9-8347-e993804ce202/cancel` → **200**

```json
{
  "command_id": "e04e6dda-8815-46c5-baeb-eadc3949f774",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "33b260d2-3be7-41f9-8347-e993804ce202",
  "short_number": 1,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "42c7256b-08c8-4616-8324-f6d6051b7876",
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
  "created_at": "2026-10-30T22:30:08.447085Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "ru": "Нет свободных машин",
      "en": "No cars available",
      "uk": "Немає вільних авто",
      "pl": "Brak wolnych aut"
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
  "session_id": "7b801252-9f31-464b-a685-08054fb9bddd",
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
  "last_heartbeat_at": "2026-10-30T22:30:10.698787Z",
  "last_location_at": "2026-10-30T22:30:10.698787Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7b801252-9f31-464b-a685-08054fb9bddd/close` → **200**

```json
{
  "command_id": "10c4f675-39a7-4fe9-a0f0-af161039d5fc",
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
  "session_id": "c59e5de8-d16e-47fc-8085-f3dc092899df",
  "subject": {
    "type": "STAFF",
    "id": "09fe1c69-c031-458c-a537-a40fa884b9ac"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwOWZlMWM2OS1jMDMxLTQ1OGMtYTUzNy1hNDBmYTg4NGI5YWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDAzMTUsImlhdCI6MTc5MzM5OTQxNSwianRpIjoiMmY5ZWQyYTgtMjkwMC00ZmUwLWEwNWEtMDg1N2ZhZjU5N2EyIiwic2lkIjoiYzU5ZTVkZTgtZDE2ZS00N2ZjLTgwODUtZjNkYzA5Mjg5OWRmIn0.jzXbIuhRoPfcS3fbT8Iidc3CEGCbgXPDKimuGQABIeQ",
  "access_expires_at": "2026-10-30T22:45:15.948353046Z",
  "refresh_token": "r4igRseJzZ5Zbz4V2Kj8oC56hSFRLug0lnWMWFZtVJo",
  "refresh_expires_at": "2026-10-31T10:30:15.947588655Z",
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
  "device_ref": "sandbox-20715"
}
```

```json
{
  "challenge_id": "29ce2ff8-995e-4b40-aabf-87f3d9bdfd1b",
  "expires_at": "2026-10-30T22:35:16.565810514Z",
  "resend_available_at": "2026-10-30T22:30:17.565810514Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "954420",
  "sent_at": "2026-10-30T22:30:16.57088838Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "29ce2ff8-995e-4b40-aabf-87f3d9bdfd1b",
  "code": "954420",
  "device_ref": "sandbox-20715"
}
```

```json
{
  "session_id": "7724e53b-e0eb-4834-b259-3490108f6085",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwMDMxNiwiaWF0IjoxNzkzMzk5NDE2LCJqdGkiOiIwNmNjODY2ZC00ZmJjLTQ0MTEtYjYyMS0yZTFhZGIwMjJlNDUiLCJzaWQiOiI3NzI0ZTUzYi1lMGViLTQ4MzQtYjI1OS0zNDkwMTA4ZjYwODUifQ.xmmQcj9zHRrZtm18kQC_J8-0p8pV6YFKe1sWrxual9c",
  "access_expires_at": "2026-10-30T22:45:16.894236534Z",
  "refresh_token": "c_ISiE9JySW1NUakp2rWHMHuC9ZoUYB6PKKZ6dG_W6Q",
  "refresh_expires_at": "2026-11-29T22:30:16.893514773Z",
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
  "command_id": "319c3695-fa0a-4129-a34e-2ad11b13b31c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:30:17Z",
    "sequence": 1793399417489
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fdec0676-9b0e-49c2-a4ef-f90555abb611",
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
  "last_heartbeat_at": "2026-10-30T22:30:17.511242Z",
  "last_location_at": "2026-10-30T22:30:17.511242Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639427114",
  "device_ref": "sandbox-3907"
}
```

```json
{
  "challenge_id": "3d55db75-2bc4-4d37-9fe7-2a74be30edf6",
  "expires_at": "2026-10-30T22:35:17.805649663Z",
  "resend_available_at": "2026-10-30T22:30:18.805649663Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639427114` → **200**

```json
{
  "phone": "+380639427114",
  "audience": "CLIENT",
  "code": "963326",
  "sent_at": "2026-10-30T22:30:17.80963105Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3d55db75-2bc4-4d37-9fe7-2a74be30edf6",
  "code": "963326",
  "device_ref": "sandbox-3907"
}
```

```json
{
  "session_id": "7901a749-1b3e-4d22-87cd-5fd6d9df86ed",
  "subject": {
    "type": "CLIENT",
    "id": "db0afb84-ad30-4d20-be12-c2c9a147b77d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYjBhZmI4NC1hZDMwLTRkMjAtYmUxMi1jMmM5YTE0N2I3N2QiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDAwMzE4LCJpYXQiOjE3OTMzOTk0MTgsImp0aSI6IjIwZGI2NjVkLWQwYWYtNDk3YS1hNjRhLWE3MWRlNTA4MWMxOSIsInNpZCI6Ijc5MDFhNzQ5LTFiM2UtNGQyMi04N2NkLTVmZDZkOWRmODZlZCJ9.wj4DjR1tKixjkATIygYmxFjjY50TJiFmlfwzoL20bMQ",
  "access_expires_at": "2026-10-30T22:45:18.15973342Z",
  "refresh_token": "JmI761N_yS79eKSCyOIih_bugN0sdHUlOFhbbICGYKU",
  "refresh_expires_at": "2026-11-29T22:30:18.158899663Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "36d94465-a438-48ca-9d83-d3adfa82de1e",
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
  "id": "19611cb0-ba6f-4ce8-a4e1-1585a15bea71",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T22:35:18.467520Z",
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
  "command_id": "ab05def5-4e2b-48f0-b800-d6b211c42bbe",
  "quote_id": "19611cb0-ba6f-4ce8-a4e1-1585a15bea71",
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
  "id": "a77a8f6d-3fef-4aa6-b104-3bdc7b50fa12",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "db0afb84-ad30-4d20-be12-c2c9a147b77d",
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
  "created_at": "2026-10-30T22:30:18.787855Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "77a2e682-0f80-4d1d-8bfe-ef0ab185958a",
    "order_id": "a77a8f6d-3fef-4aa6-b104-3bdc7b50fa12",
    "expires_at": "2026-10-30T22:30:33.792387Z",
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

`POST /api/driver/v1/offers/77a2e682-0f80-4d1d-8bfe-ef0ab185958a/accept` → **200**

```json
{
  "command_id": "c095b5d3-fa43-48db-91da-df3ae45c18a2"
}
```

```json
{
  "id": "8fdd7303-b873-4286-81e7-8a188579cf40",
  "order_id": "a77a8f6d-3fef-4aa6-b104-3bdc7b50fa12",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "1572d02e-6d93-48ae-bc21-d38d925adaad",
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
  "command_id": "575298f3-6c9a-4e98-b259-448203bcaa45",
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
  "changed_by": "09fe1c69-c031-458c-a537-a40fa884b9ac",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T22:30:20.060966628Z"
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
  "id": "1572d02e-6d93-48ae-bc21-d38d925adaad",
  "order_id": "a77a8f6d-3fef-4aa6-b104-3bdc7b50fa12",
  "assignment_id": "8fdd7303-b873-4286-81e7-8a188579cf40",
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

`POST /api/driver/v1/work-sessions/fdec0676-9b0e-49c2-a4ef-f90555abb611/heartbeat` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:30:21Z",
    "sequence": 1793399421365
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fdec0676-9b0e-49c2-a4ef-f90555abb611",
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
  "last_heartbeat_at": "2026-10-30T22:30:21.024752Z",
  "last_location_at": "2026-10-30T22:30:21.024752Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/1572d02e-6d93-48ae-bc21-d38d925adaad/arrive` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "61048f06-1559-473a-8327-f38b176ecfce",
  "expected_version": 0
}
```

```json
{
  "id": "1572d02e-6d93-48ae-bc21-d38d925adaad",
  "order_id": "a77a8f6d-3fef-4aa6-b104-3bdc7b50fa12",
  "assignment_id": "8fdd7303-b873-4286-81e7-8a188579cf40",
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
  "arrived_at": "2026-10-30T22:30:21.371818Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/1572d02e-6d93-48ae-bc21-d38d925adaad/start` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "0c35607b-3be6-4df0-8790-17a47cf4d6f3",
  "expected_version": 1
}
```

```json
{
  "id": "1572d02e-6d93-48ae-bc21-d38d925adaad",
  "order_id": "a77a8f6d-3fef-4aa6-b104-3bdc7b50fa12",
  "assignment_id": "8fdd7303-b873-4286-81e7-8a188579cf40",
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
  "arrived_at": "2026-10-30T22:30:21.371818Z",
  "started_at": "2026-10-30T22:30:21.683161Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/1572d02e-6d93-48ae-bc21-d38d925adaad/complete` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "6f908dd9-07d1-4636-b552-3bbaf773b569",
  "expected_version": 2,
  "reported_at": "2026-10-30T22:30:21Z",
  "cash_received": true
}
```

```json
{
  "id": "1572d02e-6d93-48ae-bc21-d38d925adaad",
  "order_id": "a77a8f6d-3fef-4aa6-b104-3bdc7b50fa12",
  "assignment_id": "8fdd7303-b873-4286-81e7-8a188579cf40",
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
  "arrived_at": "2026-10-30T22:30:21.371818Z",
  "started_at": "2026-10-30T22:30:21.683161Z",
  "completed_at": "2026-10-30T22:30:21.998819Z",
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
  "session_id": "fdec0676-9b0e-49c2-a4ef-f90555abb611",
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
  "last_heartbeat_at": "2026-10-30T22:30:21.024752Z",
  "last_location_at": "2026-10-30T22:30:21.024752Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/fdec0676-9b0e-49c2-a4ef-f90555abb611/close` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "2fc83e93-82e7-4d84-8529-83e8087e1f04",
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
  "command_id": "e38ddad2-8b0b-4c49-b4a7-bb62ddef8148",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:30:22Z",
    "sequence": 1793399422958
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
  "correlation_id": "f15b677c-e6e4-44cc-ae4a-accc3f1fb218",
  "minimum_version": "9.0.0"
}
```

## After the update he can

`POST /api/driver/v1/work-sessions` (X-App-Platform: DRIVER_ANDROID X-App-Version: 9.0.0) → **201**

```json
{
  "command_id": "63e0d2cb-04cb-4316-a50c-ea4e223239cb",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:30:23Z",
    "sequence": 1793399423304
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "33c0be04-2c4e-4e10-ad60-9dabe9b1d424",
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
  "last_heartbeat_at": "2026-10-30T22:30:23.326342Z",
  "last_location_at": "2026-10-30T22:30:23.326342Z",
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
  "changed_by": "09fe1c69-c031-458c-a537-a40fa884b9ac",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T22:30:20.060967Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "6ae39c22-5b51-48fe-8b67-8fd0ea4c8810",
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
  "changed_by": "09fe1c69-c031-458c-a537-a40fa884b9ac",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T22:30:23.944219645Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "33c0be04-2c4e-4e10-ad60-9dabe9b1d424",
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
  "last_heartbeat_at": "2026-10-30T22:30:23.326342Z",
  "last_location_at": "2026-10-30T22:30:23.326342Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/33c0be04-2c4e-4e10-ad60-9dabe9b1d424/close` → **200**

```json
{
  "command_id": "43085642-3db7-4ec3-9898-6f533ac479e2",
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
  "session_id": "a849f5b9-ef18-4ed7-a1cc-cf9abd9bccd3",
  "subject": {
    "type": "STAFF",
    "id": "09fe1c69-c031-458c-a537-a40fa884b9ac"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwOWZlMWM2OS1jMDMxLTQ1OGMtYTUzNy1hNDBmYTg4NGI5YWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDAzMjUsImlhdCI6MTc5MzM5OTQyNSwianRpIjoiYmZiZmM1NDYtYTAwNy00NjJmLWI0YjYtNDkzMTMxYmQwZjc4Iiwic2lkIjoiYTg0OWY1YjktZWYxOC00ZWQ3LWExY2MtY2Y5YWJkOWJjY2QzIn0.R5_hxmpFrPVnEh7YdrKFAawVqLJhv3YHnjNgZ15bNfI",
  "access_expires_at": "2026-10-30T22:45:25.176192341Z",
  "refresh_token": "_KXP8xOFWZjOiLXWn_YftDW2ftjfYFa0-ohxb8bdDrY",
  "refresh_expires_at": "2026-10-31T10:30:25.175467864Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "4e776cb1-015b-406f-8cc1-9dc9d5543374",
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
  "id": "a9702cdf-ceeb-4291-917f-009945dfdb04",
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
  "created_by": "09fe1c69-c031-458c-a537-a40fa884b9ac",
  "created_at": "2026-10-30T22:30:25.478345Z",
  "updated_at": "2026-10-30T22:30:25.478345Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639131190",
  "device_ref": "sandbox-4336"
}
```

```json
{
  "challenge_id": "fa0a8ea3-47d7-437c-9819-a75c36377fa1",
  "expires_at": "2026-10-30T22:35:25.78406417Z",
  "resend_available_at": "2026-10-30T22:30:26.78406417Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639131190` → **200**

```json
{
  "phone": "+380639131190",
  "audience": "CLIENT",
  "code": "783631",
  "sent_at": "2026-10-30T22:30:25.788700551Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fa0a8ea3-47d7-437c-9819-a75c36377fa1",
  "code": "783631",
  "device_ref": "sandbox-4336"
}
```

```json
{
  "session_id": "4b648da0-bc58-469c-93e2-b2e8a8c9844b",
  "subject": {
    "type": "CLIENT",
    "id": "351be09b-9775-4d10-9186-e60015992524"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzNTFiZTA5Yi05Nzc1LTRkMTAtOTE4Ni1lNjAwMTU5OTI1MjQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDAwMzI2LCJpYXQiOjE3OTMzOTk0MjYsImp0aSI6ImUzYjllZjJiLWIxZDQtNDg3ZC04M2QzLWQ2ZGYzMWQwNGFhNyIsInNpZCI6IjRiNjQ4ZGEwLWJjNTgtNDY5Yy05M2UyLWIyZThhOGM5ODQ0YiJ9.BcN_tXe3i5wtS0YVp0zsLCrnAWsTr6rNZX-LPfITnuc",
  "access_expires_at": "2026-10-30T22:45:26.111239751Z",
  "refresh_token": "Z4BHuaGpsjLt1M8ydSZ83SXjvOXqjQBXU5HfKLswZJE",
  "refresh_expires_at": "2026-11-29T22:30:26.110555853Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380639131190` → **200**

```json
{
  "client_id": "351be09b-9775-4d10-9186-e60015992524"
}
```

`POST /api/admin/v1/rider-wallets/351be09b-9775-4d10-9186-e60015992524/top-ups` → **201**

```json
{
  "command_id": "6a195fea-5d18-4513-be2e-dfe16e43e20d",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "351be09b-9775-4d10-9186-e60015992524",
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
      "id": "9c5d1c2c-8cba-4539-9ac3-4b0cd92fe572",
      "at": "2026-10-30T22:30:26.724367Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "09fe1c69-c031-458c-a537-a40fa884b9ac",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ad10f054-e71d-450b-8999-7c66188fbef2",
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
  "id": "4dff0c1f-9ce5-4cbb-b7b3-96e088f9d87f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T22:35:27.046773Z",
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
      "id": "a9702cdf-ceeb-4291-917f-009945dfdb04",
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
  "device_ref": "sandbox-27048"
}
```

```json
{
  "challenge_id": "34834fb2-220a-4379-87b1-9ac12c16fa50",
  "expires_at": "2026-10-30T22:35:27.35085271Z",
  "resend_available_at": "2026-10-30T22:30:28.35085271Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "890287",
  "sent_at": "2026-10-30T22:30:27.35488337Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "34834fb2-220a-4379-87b1-9ac12c16fa50",
  "code": "890287",
  "device_ref": "sandbox-27048"
}
```

```json
{
  "session_id": "343d3afa-5416-4985-9209-026f9aefc074",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwMDMyNywiaWF0IjoxNzkzMzk5NDI3LCJqdGkiOiIxY2UyODA1ZS1jODA2LTQ2OGEtOGM5MS0yNGU0ZjE0NzY1MmEiLCJzaWQiOiIzNDNkM2FmYS01NDE2LTQ5ODUtOTIwOS0wMjZmOWFlZmMwNzQifQ.BsUk_OFXHtgTIjty3-X5g4GFFfTp5eDDM5VjgFwRjH0",
  "access_expires_at": "2026-10-30T22:45:27.675820164Z",
  "refresh_token": "XORuBxeaSF3CYKLp3-AbYw_f4SzdgJ3yqwPGk4CXkJ4",
  "refresh_expires_at": "2026-11-29T22:30:27.675160979Z",
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
  "command_id": "8be1788c-7f00-4e26-ac76-d0bfa7d26f97",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:30:28Z",
    "sequence": 1793399428285
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a540c576-fbd1-44c4-9d5b-49214d757592",
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
  "last_heartbeat_at": "2026-10-30T22:30:28.305633Z",
  "last_location_at": "2026-10-30T22:30:28.305633Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "338ee677-ac62-4e28-a1a0-bc91093ff5ef",
  "quote_id": "4dff0c1f-9ce5-4cbb-b7b3-96e088f9d87f",
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
  "id": "02b4b8df-228e-4bfe-99c2-50c3baed411e",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "351be09b-9775-4d10-9186-e60015992524",
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
  "created_at": "2026-10-30T22:30:28.618399Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "351be09b-9775-4d10-9186-e60015992524",
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
      "id": "9c5d1c2c-8cba-4539-9ac3-4b0cd92fe572",
      "at": "2026-10-30T22:30:26.724367Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "09fe1c69-c031-458c-a537-a40fa884b9ac",
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
    "id": "441c5615-0bd8-46f8-b5f1-ed5966ba9429",
    "order_id": "02b4b8df-228e-4bfe-99c2-50c3baed411e",
    "expires_at": "2026-10-30T22:30:43.627901Z",
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

`POST /api/driver/v1/offers/441c5615-0bd8-46f8-b5f1-ed5966ba9429/accept` → **200**

```json
{
  "command_id": "3383c7c2-fb9a-42c5-940c-701082379f89"
}
```

```json
{
  "id": "a9eb3cb2-d9bc-45b3-829d-743befab2fc8",
  "order_id": "02b4b8df-228e-4bfe-99c2-50c3baed411e",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "9a50575a-7c2e-47db-9843-9c3ab39be924",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9a50575a-7c2e-47db-9843-9c3ab39be924",
  "order_id": "02b4b8df-228e-4bfe-99c2-50c3baed411e",
  "assignment_id": "a9eb3cb2-d9bc-45b3-829d-743befab2fc8",
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

`POST /api/driver/v1/work-sessions/a540c576-fbd1-44c4-9d5b-49214d757592/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:30:32Z",
    "sequence": 1793399432184
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a540c576-fbd1-44c4-9d5b-49214d757592",
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
  "last_heartbeat_at": "2026-10-30T22:30:32.206329Z",
  "last_location_at": "2026-10-30T22:30:32.206329Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/9a50575a-7c2e-47db-9843-9c3ab39be924/arrive` → **200**

```json
{
  "command_id": "3665dfd2-8031-49bc-b27e-024512f7e37d",
  "expected_version": 0
}
```

```json
{
  "id": "9a50575a-7c2e-47db-9843-9c3ab39be924",
  "order_id": "02b4b8df-228e-4bfe-99c2-50c3baed411e",
  "assignment_id": "a9eb3cb2-d9bc-45b3-829d-743befab2fc8",
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
  "arrived_at": "2026-10-30T22:30:32.526398Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/9a50575a-7c2e-47db-9843-9c3ab39be924/start` → **200**

```json
{
  "command_id": "08e48e04-6040-460e-9edb-3ab612b8822b",
  "expected_version": 1
}
```

```json
{
  "id": "9a50575a-7c2e-47db-9843-9c3ab39be924",
  "order_id": "02b4b8df-228e-4bfe-99c2-50c3baed411e",
  "assignment_id": "a9eb3cb2-d9bc-45b3-829d-743befab2fc8",
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
  "arrived_at": "2026-10-30T22:30:32.526398Z",
  "started_at": "2026-10-30T22:30:32.829491Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/9a50575a-7c2e-47db-9843-9c3ab39be924/complete` → **200**

```json
{
  "command_id": "701e3402-a905-4b38-9e86-2921dcdde0bc",
  "expected_version": 2,
  "reported_at": "2026-10-30T22:30:33Z",
  "cash_received": true
}
```

```json
{
  "id": "9a50575a-7c2e-47db-9843-9c3ab39be924",
  "order_id": "02b4b8df-228e-4bfe-99c2-50c3baed411e",
  "assignment_id": "a9eb3cb2-d9bc-45b3-829d-743befab2fc8",
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
  "arrived_at": "2026-10-30T22:30:32.526398Z",
  "started_at": "2026-10-30T22:30:32.829491Z",
  "completed_at": "2026-10-30T22:30:33.16041Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "351be09b-9775-4d10-9186-e60015992524",
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
      "id": "7ffc19d7-947a-4a14-a232-a1644918c74c",
      "at": "2026-10-30T22:30:33.39219Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "02b4b8df-228e-4bfe-99c2-50c3baed411e"
    },
    {
      "id": "9c5d1c2c-8cba-4539-9ac3-4b0cd92fe572",
      "at": "2026-10-30T22:30:26.724367Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "09fe1c69-c031-458c-a537-a40fa884b9ac",
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

`POST /api/admin/v1/promotions/a9702cdf-ceeb-4291-917f-009945dfdb04/archive` → **200**

```json
{
  "command_id": "f4e4c9d8-aa33-4578-8a91-bd15a49a6a7c",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "a9702cdf-ceeb-4291-917f-009945dfdb04",
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
  "created_by": "09fe1c69-c031-458c-a537-a40fa884b9ac",
  "created_at": "2026-10-30T22:30:25.478345Z",
  "updated_at": "2026-10-30T22:30:36.805539Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a540c576-fbd1-44c4-9d5b-49214d757592",
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
  "last_heartbeat_at": "2026-10-30T22:30:32.206329Z",
  "last_location_at": "2026-10-30T22:30:32.206329Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a540c576-fbd1-44c4-9d5b-49214d757592/close` → **200**

```json
{
  "command_id": "8820a208-3891-4801-ac66-babfb8e3caa3",
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

Done: order 02b4b8df-228e-4bfe-99c2-50c3baed411e.

# Scenario: broadcast-abuse

## Anna goes online in Warsaw

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000002",
  "device_ref": "sandbox-26373"
}
```

```json
{
  "challenge_id": "c42cc8a7-9cd4-4a52-9659-7fa85f92b7d5",
  "expires_at": "2026-10-30T22:35:37.723478396Z",
  "resend_available_at": "2026-10-30T22:30:38.723478396Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000002` → **200**

```json
{
  "phone": "+48500000002",
  "audience": "DRIVER",
  "code": "252765",
  "sent_at": "2026-10-30T22:30:37.727209792Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c42cc8a7-9cd4-4a52-9659-7fa85f92b7d5",
  "code": "252765",
  "device_ref": "sandbox-26373"
}
```

```json
{
  "session_id": "2f1d7d86-2458-4076-b4b4-03411a3c3651",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000405"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDUiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwMDMzOCwiaWF0IjoxNzkzMzk5NDM4LCJqdGkiOiI0MDBhODE3Yy05NmEwLTRiMGEtYjdkMC1hMDVlMjI5Yzk1ZTciLCJzaWQiOiIyZjFkN2Q4Ni0yNDU4LTQwNzYtYjRiNC0wMzQxMWEzYzM2NTEifQ.kcEzTfQOFblEt_kk07n52CUZomyg5NZTWxLug3Kqp4c",
  "access_expires_at": "2026-10-30T22:45:38.054633108Z",
  "refresh_token": "PzvrBaOcZOwYEEw3QPHJxEH7STMSm3gWLXM_sUVsOA8",
  "refresh_expires_at": "2026-11-29T22:30:38.053962938Z",
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
  "command_id": "f9353970-ff9e-40a0-a1a3-c906508a69d1",
  "vehicle_id": "5a000000-0000-4000-8000-000000000505",
  "location": {
    "lat": 52.2297,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:30:38Z",
    "sequence": 1793399438941
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "4570c801-3c9c-4c4c-aac5-74c2db55e11e",
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
  "last_heartbeat_at": "2026-10-30T22:30:38.962144Z",
  "last_location_at": "2026-10-30T22:30:38.962144Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## 5 seconds later her phone reports Lviv: not taken as her position

`POST /api/driver/v1/work-sessions/4570c801-3c9c-4c4c-aac5-74c2db55e11e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 49.8397,
    "lon": 24.0297,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:30:44Z",
    "sequence": 1793399444271
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "4570c801-3c9c-4c4c-aac5-74c2db55e11e",
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
  "last_heartbeat_at": "2026-10-30T22:30:44.292445Z",
  "last_location_at": "2026-10-30T22:30:38.962144Z",
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
  "session_id": "ede5c1e1-5671-444f-9030-fc42a79c1314",
  "subject": {
    "type": "STAFF",
    "id": "09fe1c69-c031-458c-a537-a40fa884b9ac"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwOWZlMWM2OS1jMDMxLTQ1OGMtYTUzNy1hNDBmYTg4NGI5YWMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDAzNDQsImlhdCI6MTc5MzM5OTQ0NCwianRpIjoiYzIzOWI2ZTQtOWUyNi00MzA0LWI5MjMtOWJlOTAyMmRkNDk2Iiwic2lkIjoiZWRlNWMxZTEtNTY3MS00NDRmLTkwMzAtZmM0MmE3OWMxMzE0In0.ukizpRv-93HWosRt4dJBH4cG5rLxucBgbzN_cD_EKdE",
  "access_expires_at": "2026-10-30T22:45:44.907372002Z",
  "refresh_token": "5cDb9QvryGXQss7jlq12cYfrLHPTNBEuZgNp4wRx3sY",
  "refresh_expires_at": "2026-10-31T10:30:44.906668195Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "at": "2026-10-30T22:30:45.227562722Z",
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
      "last_location_at": "2026-10-30T22:30:38.962144Z",
      "last_heartbeat_at": "2026-10-30T22:30:44.292445Z",
      "order_id": null
    }
  ]
}
```

## A fix next to the last accepted one is taken again

`POST /api/driver/v1/work-sessions/4570c801-3c9c-4c4c-aac5-74c2db55e11e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2299,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:30:45Z",
    "sequence": 1793399445567
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "4570c801-3c9c-4c4c-aac5-74c2db55e11e",
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
  "last_heartbeat_at": "2026-10-30T22:30:45.588544Z",
  "last_location_at": "2026-10-30T22:30:45.588544Z",
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
  "session_id": "4570c801-3c9c-4c4c-aac5-74c2db55e11e",
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
  "last_heartbeat_at": "2026-10-30T22:30:45.588544Z",
  "last_location_at": "2026-10-30T22:30:45.588544Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/4570c801-3c9c-4c4c-aac5-74c2db55e11e/close` → **200**

```json
{
  "command_id": "7abcb906-366f-49da-b5a4-bf9c67327e80",
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
  "device_ref": "sandbox-22568"
}
```

```json
{
  "challenge_id": "e672c52b-6d5f-4de7-983d-f54db89f5799",
  "expires_at": "2026-10-30T22:35:46.541968796Z",
  "resend_available_at": "2026-10-30T22:30:47.541968796Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "174572",
  "sent_at": "2026-10-30T22:30:46.545822871Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e672c52b-6d5f-4de7-983d-f54db89f5799",
  "code": "174572",
  "device_ref": "sandbox-22568"
}
```

```json
{
  "session_id": "883c687d-2bb5-40b8-9db7-774a3c241e41",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwMDM0NiwiaWF0IjoxNzkzMzk5NDQ2LCJqdGkiOiI1YzJmN2U2OS05Y2VlLTQ0YjctODk3Yy0yNTAwMmQwZjVhOWUiLCJzaWQiOiI4ODNjNjg3ZC0yYmI1LTQwYjgtOWRiNy03NzRhM2MyNDFlNDEifQ.OHB0dmbF42FjJRXRxiCizz1Om3KgtZVdzI_FrOL-qmM",
  "access_expires_at": "2026-10-30T22:45:46.85835767Z",
  "refresh_token": "uy5WRwAh3M2Y-GRvKsGIgVMWZs7vin0_KO_i8ImbTlw",
  "refresh_expires_at": "2026-11-29T22:30:46.857719846Z",
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
  "device_ref": "sandbox-17250"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "c6d6aa74-f6dd-4ecf-ae82-e5f82fd26e37",
  "retryable": true,
  "retry_after_seconds": 1
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000001",
  "device_ref": "sandbox-17250"
}
```

```json
{
  "challenge_id": "b38b50df-01bf-4e33-9269-8fe0ed64e7e1",
  "expires_at": "2026-10-30T22:35:48.753868195Z",
  "resend_available_at": "2026-10-30T22:30:49.753868195Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "631716",
  "sent_at": "2026-10-30T22:30:48.756824298Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b38b50df-01bf-4e33-9269-8fe0ed64e7e1",
  "code": "631716",
  "device_ref": "sandbox-17250"
}
```

```json
{
  "session_id": "b5be310e-56e7-497d-a5cd-ed4b56c04a8c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwMDM0OSwiaWF0IjoxNzkzMzk5NDQ5LCJqdGkiOiIwOWU0YzczNy01YWU4LTQ5ZDMtYjMyYS1hYWY1OWYxYmQ4MjUiLCJzaWQiOiJiNWJlMzEwZS01NmU3LTQ5N2QtYTVjZC1lZDRiNTZjMDRhOGMifQ.j2yJB2juDLUEJneHOaYoITvyqMT5cELteT3vl7SfnXs",
  "access_expires_at": "2026-10-30T22:45:49.070992672Z",
  "refresh_token": "QFZx1XpUfL4Wn1jy_tLw3il7L0rcUNvCPjhomlBo3RI",
  "refresh_expires_at": "2026-11-29T22:30:49.070364665Z",
  "account_created": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000002",
  "device_ref": "sandbox-20558"
}
```

```json
{
  "challenge_id": "b22c6aab-f348-42fa-aac4-9dd1d3cf1839",
  "expires_at": "2026-10-30T22:35:49.358977098Z",
  "resend_available_at": "2026-10-30T22:30:50.358977098Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000002` → **200**

```json
{
  "phone": "+48500000002",
  "audience": "DRIVER",
  "code": "528095",
  "sent_at": "2026-10-30T22:30:49.362786099Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b22c6aab-f348-42fa-aac4-9dd1d3cf1839",
  "code": "528095",
  "device_ref": "sandbox-20558"
}
```

```json
{
  "session_id": "07bfa941-b09c-452b-80aa-a8b4397a8dc2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000405"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDUiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwMDM0OSwiaWF0IjoxNzkzMzk5NDQ5LCJqdGkiOiJmYmVjYTRlYy1lODU5LTQ1MDQtYjVlYy0xMTdjMGFhMWE4NzIiLCJzaWQiOiIwN2JmYTk0MS1iMDljLTQ1MmItODBhYS1hOGI0Mzk3YThkYzIifQ.O6FgWRRSqJ3T8LrBNp3Brg8Jm5vswxR2yIU9f8hN5ZU",
  "access_expires_at": "2026-10-30T22:45:49.68509149Z",
  "refresh_token": "ERk5To97n5mm2E_BoYBZBtIaErXSFD0MH6MJKlNo5VU",
  "refresh_expires_at": "2026-11-29T22:30:49.68443111Z",
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

(the car drives 182 s to the next point)

`POST /api/driver/v1/work-sessions` → **201**

```json
{
  "command_id": "57e3deca-c443-476e-958b-922fa09e2854",
  "vehicle_id": "5a000000-0000-4000-8000-000000000505",
  "location": {
    "lat": 52.2297,
    "lon": 21.1700,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:33:52Z",
    "sequence": 1793399632571
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "541af508-5b41-46b3-8e7a-865e8801e9a2",
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
  "last_heartbeat_at": "2026-10-30T22:33:52.591668Z",
  "last_location_at": "2026-10-30T22:33:52.591668Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders: nobody is near, the order goes to the ALL tab

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600602314",
  "device_ref": "sandbox-3524"
}
```

```json
{
  "challenge_id": "f4ca5382-85db-482c-a48d-54e85c8bc42e",
  "expires_at": "2026-10-30T22:38:52.898634117Z",
  "resend_available_at": "2026-10-30T22:33:53.898634117Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600602314` → **200**

```json
{
  "phone": "+48600602314",
  "audience": "CLIENT",
  "code": "522185",
  "sent_at": "2026-10-30T22:33:52.901609467Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f4ca5382-85db-482c-a48d-54e85c8bc42e",
  "code": "522185",
  "device_ref": "sandbox-3524"
}
```

```json
{
  "session_id": "574a1409-1d3c-48ee-abf9-5d6acb03dc13",
  "subject": {
    "type": "CLIENT",
    "id": "954ea035-755e-40bd-ab8b-6a78ffd87b36"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NTRlYTAzNS03NTVlLTQwYmQtYWI4Yi02YTc4ZmZkODdiMzYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDAwNTMzLCJpYXQiOjE3OTMzOTk2MzMsImp0aSI6IjU4NTJmYmIwLWQ2YTEtNDY3OS05NWMwLWIzMDZkNzBiZmIxMiIsInNpZCI6IjU3NGExNDA5LTFkM2MtNDhlZS1hYmY5LTVkNmFjYjAzZGMxMyJ9.Dc1KsjTjEZ_gKGzZvl2fNrA4LoXkeY5W4nFVjvQN0-U",
  "access_expires_at": "2026-10-30T22:48:53.231606749Z",
  "refresh_token": "k7pZJEk_a6Fh_-ALs8mQ-KulRnJP715IrVLgz4o9GHE",
  "refresh_expires_at": "2026-11-29T22:33:53.230869402Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8914c52c-2529-4911-85ef-850c6b97f51c",
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
  "id": "61323793-a2c2-4d43-95f4-b3017663468b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 4942,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T22:38:53.538800Z",
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
  "command_id": "dade333c-508d-46ae-b2f3-269b21b4f810",
  "quote_id": "61323793-a2c2-4d43-95f4-b3017663468b",
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
  "id": "0abb7363-bf3b-4d6f-ad36-f4a53b68029c",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "954ea035-755e-40bd-ab8b-6a78ffd87b36",
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
  "created_at": "2026-10-30T22:33:53.853562Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

`GET /api/rider/v1/orders/0abb7363-bf3b-4d6f-ad36-f4a53b68029c` → **200**

```json
{
  "id": "0abb7363-bf3b-4d6f-ad36-f4a53b68029c",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "954ea035-755e-40bd-ab8b-6a78ffd87b36",
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
  "created_at": "2026-10-30T22:33:53.853562Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

## Anna, 10 km away, does not see it, and her claim is refused: the order stays in the ALL tab

`GET /api/driver/v1/broadcast-orders` → **200**

```json
[]
```

`POST /api/driver/v1/orders/0abb7363-bf3b-4d6f-ad36-f4a53b68029c/claim` → **422**

```json
{
  "command_id": "6c261a4d-1016-44c7-be45-dffe4f431b69"
}
```

```json
{
  "instance": "/api/driver/v1/orders/0abb7363-bf3b-4d6f-ad36-f4a53b68029c/claim",
  "status": 422,
  "title": "Pickup too far",
  "type": "https://errors.blizz.taxi/pickup-too-far",
  "code": "PICKUP_TOO_FAR",
  "correlation_id": "5f1ab805-253f-4bf0-be6c-56c6c3c91d2b"
}
```

`GET /api/rider/v1/orders/0abb7363-bf3b-4d6f-ad36-f4a53b68029c` → **200**

```json
{
  "id": "0abb7363-bf3b-4d6f-ad36-f4a53b68029c",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "954ea035-755e-40bd-ab8b-6a78ffd87b36",
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
  "created_at": "2026-10-30T22:33:53.853562Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

## A script on Anna's phone keeps claiming: from the 31st claim in 10 minutes, 429

`POST /api/driver/v1/orders/b812e2a5-82ff-4147-9b2e-621593cb59ce/claim` → **404**

```json
{
  "command_id": "af9d4480-db94-432d-8a9d-44d88d7b19ef"
}
```

```json
{
  "instance": "/api/driver/v1/orders/b812e2a5-82ff-4147-9b2e-621593cb59ce/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "04b778e3-569c-47c0-978d-9ceaa8616cc0"
}
```

`POST /api/driver/v1/orders/b46140fa-89c6-4165-be46-ec942a23147d/claim` → **404**

```json
{
  "command_id": "3e45ad63-c1a8-47da-bb31-3eed3b932523"
}
```

```json
{
  "instance": "/api/driver/v1/orders/b46140fa-89c6-4165-be46-ec942a23147d/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "b1b7da98-c857-4dc4-a9c8-081813271140"
}
```

`POST /api/driver/v1/orders/e955fa47-39aa-466f-9d4b-0091d95b7e9a/claim` → **404**

```json
{
  "command_id": "e9062392-011a-49d8-bc2f-f1aa557ed5de"
}
```

```json
{
  "instance": "/api/driver/v1/orders/e955fa47-39aa-466f-9d4b-0091d95b7e9a/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "959fa699-e686-4753-9cd1-b36f3fde9cbf"
}
```

`POST /api/driver/v1/orders/f082105d-5f3d-41e5-8b36-207045602b87/claim` → **404**

```json
{
  "command_id": "ece9a4ea-5f14-4b29-aacc-c6203f276de0"
}
```

```json
{
  "instance": "/api/driver/v1/orders/f082105d-5f3d-41e5-8b36-207045602b87/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "bb453871-5b9a-4eb9-b3d7-26fb286b25ad"
}
```

`POST /api/driver/v1/orders/96bc0315-614b-415a-9d04-b2b6905c133c/claim` → **404**

```json
{
  "command_id": "2299fbb0-d641-471a-998d-fdabd0bffd3e"
}
```

```json
{
  "instance": "/api/driver/v1/orders/96bc0315-614b-415a-9d04-b2b6905c133c/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "9992965c-dbdb-42ff-bb99-44732183a7c8"
}
```

`POST /api/driver/v1/orders/0fe8dabc-1d05-4181-8717-9322a6faa624/claim` → **404**

```json
{
  "command_id": "e6ff817c-9e6e-4971-b697-fcb74a9e7981"
}
```

```json
{
  "instance": "/api/driver/v1/orders/0fe8dabc-1d05-4181-8717-9322a6faa624/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "b0ed887c-6e90-409a-b4e2-4a0cbdce34a6"
}
```

`POST /api/driver/v1/orders/b3d812e8-1523-4980-8968-26cfa2b9c64d/claim` → **404**

```json
{
  "command_id": "865a4974-7235-447e-b198-2e66d5831f50"
}
```

```json
{
  "instance": "/api/driver/v1/orders/b3d812e8-1523-4980-8968-26cfa2b9c64d/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "a14a4fc4-eccf-46fc-95b7-c989ad1aa01d"
}
```

`POST /api/driver/v1/orders/913ea594-24bf-4ef9-974c-aa5f79d38633/claim` → **404**

```json
{
  "command_id": "b89488d3-df2c-44f3-a7e0-b2c0dd27b246"
}
```

```json
{
  "instance": "/api/driver/v1/orders/913ea594-24bf-4ef9-974c-aa5f79d38633/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "92e0b021-2b37-41e7-8a67-f7938100382e"
}
```

`POST /api/driver/v1/orders/8241022d-cd09-47e0-818a-edcf1b856a90/claim` → **404**

```json
{
  "command_id": "9db9d20b-74fe-492a-9fb9-a1c593056a1a"
}
```

```json
{
  "instance": "/api/driver/v1/orders/8241022d-cd09-47e0-818a-edcf1b856a90/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "aa45248b-5944-4b6d-9173-59d385cad9dd"
}
```

`POST /api/driver/v1/orders/f1f26fee-6482-407d-b2ed-3107c6a56d9a/claim` → **404**

```json
{
  "command_id": "2ac7eb49-e95d-4890-baed-c648d3798fa0"
}
```

```json
{
  "instance": "/api/driver/v1/orders/f1f26fee-6482-407d-b2ed-3107c6a56d9a/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "4c3d297a-6a84-485e-88bb-bb52dbda60a1"
}
```

`POST /api/driver/v1/orders/028a1031-5894-4d28-b213-7009c40e088b/claim` → **404**

```json
{
  "command_id": "2e97590a-3de5-4456-ab26-fed89bc04c6e"
}
```

```json
{
  "instance": "/api/driver/v1/orders/028a1031-5894-4d28-b213-7009c40e088b/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "3a64c1a3-2532-48e8-bbe2-f0172095a6ba"
}
```

`POST /api/driver/v1/orders/62fdca07-9a30-4df1-b951-ac7cb12d140d/claim` → **404**

```json
{
  "command_id": "5217123c-a2cd-4c32-a1a5-142c4f99f152"
}
```

```json
{
  "instance": "/api/driver/v1/orders/62fdca07-9a30-4df1-b951-ac7cb12d140d/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "1938ef80-7ed8-4a84-a4a9-7879866f3fa1"
}
```

`POST /api/driver/v1/orders/38e13756-b939-4f14-b200-e93d25ba7d00/claim` → **404**

```json
{
  "command_id": "3fe3b2ff-3859-4640-bb78-d93af58c94f6"
}
```

```json
{
  "instance": "/api/driver/v1/orders/38e13756-b939-4f14-b200-e93d25ba7d00/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "1896713a-2292-4165-a079-728fdd8f5190"
}
```

`POST /api/driver/v1/orders/4e5b5d7a-b15a-431f-95a6-fc6562fc273f/claim` → **404**

```json
{
  "command_id": "0cdc06d5-c5f0-435e-87d5-6952808c4997"
}
```

```json
{
  "instance": "/api/driver/v1/orders/4e5b5d7a-b15a-431f-95a6-fc6562fc273f/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "75d4269b-5e98-4bc3-96c7-6cbfc4e0bbfa"
}
```

`POST /api/driver/v1/orders/089a2897-66cc-4b6e-a1bc-078dafa2ef3b/claim` → **404**

```json
{
  "command_id": "a7f9a9ce-139c-4ff8-b15b-7b3ea9d9f46e"
}
```

```json
{
  "instance": "/api/driver/v1/orders/089a2897-66cc-4b6e-a1bc-078dafa2ef3b/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "2eadfe21-6787-4be9-bd48-65230acde45e"
}
```

`POST /api/driver/v1/orders/897e320e-6204-467e-92ca-52ddaca1bf49/claim` → **404**

```json
{
  "command_id": "cdbe4c76-bf0a-410b-bc21-9783785e31c7"
}
```

```json
{
  "instance": "/api/driver/v1/orders/897e320e-6204-467e-92ca-52ddaca1bf49/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "be9fc7da-e3fe-4db9-8619-44c27a101d9d"
}
```

`POST /api/driver/v1/orders/7ba68c36-9eb0-4d3b-87be-7a45b607ef6c/claim` → **404**

```json
{
  "command_id": "204f74ac-d162-4110-b7ec-ff5562318ca2"
}
```

```json
{
  "instance": "/api/driver/v1/orders/7ba68c36-9eb0-4d3b-87be-7a45b607ef6c/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "150704f2-e58c-4842-8819-677f7998e552"
}
```

`POST /api/driver/v1/orders/b63c8f17-2f50-467d-8faa-ba27869902fa/claim` → **404**

```json
{
  "command_id": "b31d07bc-6c59-44fe-8c5d-a34349bcbe6b"
}
```

```json
{
  "instance": "/api/driver/v1/orders/b63c8f17-2f50-467d-8faa-ba27869902fa/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "96f44866-7dba-4c06-95b4-01d38e9b3c69"
}
```

`POST /api/driver/v1/orders/6fcb29a6-b7fa-47d9-9493-043219f28652/claim` → **404**

```json
{
  "command_id": "84c4c45b-974b-4f0b-bed5-902542332dd9"
}
```

```json
{
  "instance": "/api/driver/v1/orders/6fcb29a6-b7fa-47d9-9493-043219f28652/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "1008a9bf-105f-4d9d-9d66-65cd04531e4b"
}
```

`POST /api/driver/v1/orders/9cae42fe-a3a6-4208-a349-ea7a5c2dc97d/claim` → **404**

```json
{
  "command_id": "2995740e-0658-4634-a288-9c15665fa4c6"
}
```

```json
{
  "instance": "/api/driver/v1/orders/9cae42fe-a3a6-4208-a349-ea7a5c2dc97d/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "4a96b573-d712-44ca-9ae7-3c24de476913"
}
```

`POST /api/driver/v1/orders/d1d67346-1cf6-4d03-bced-a0653fb02801/claim` → **404**

```json
{
  "command_id": "e6898515-f144-40ba-a7b5-2e7a79f0299c"
}
```

```json
{
  "instance": "/api/driver/v1/orders/d1d67346-1cf6-4d03-bced-a0653fb02801/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "084bfa4f-9a19-4078-8bb0-2be50a3c97c5"
}
```

`POST /api/driver/v1/orders/cf0d455a-f200-48b1-9bce-30cd18896115/claim` → **404**

```json
{
  "command_id": "224abd47-2083-42e6-9691-39e68ac27a7a"
}
```

```json
{
  "instance": "/api/driver/v1/orders/cf0d455a-f200-48b1-9bce-30cd18896115/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "e3bd0b6a-6cff-4823-b1f1-9b820bd70b06"
}
```

`POST /api/driver/v1/orders/e79a17d1-6f61-43cd-b34e-5ea4b179b550/claim` → **404**

```json
{
  "command_id": "6bd6ed8c-df41-4d92-aa0e-bccefad03b63"
}
```

```json
{
  "instance": "/api/driver/v1/orders/e79a17d1-6f61-43cd-b34e-5ea4b179b550/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "2d9a3b2f-9e7a-464d-b6f8-dbcc33093201"
}
```

`POST /api/driver/v1/orders/226c0a29-37c2-4eef-985e-f43f1d812536/claim` → **404**

```json
{
  "command_id": "9b4f95d9-8e04-42aa-a299-112fd894b743"
}
```

```json
{
  "instance": "/api/driver/v1/orders/226c0a29-37c2-4eef-985e-f43f1d812536/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "f73bd2c8-3184-4a24-9d8e-3bebe4180eed"
}
```

`POST /api/driver/v1/orders/98b430f5-4564-4465-8042-4f5119166535/claim` → **404**

```json
{
  "command_id": "d099f8e3-f006-48da-b9a7-6777d793321a"
}
```

```json
{
  "instance": "/api/driver/v1/orders/98b430f5-4564-4465-8042-4f5119166535/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "7bc9d89b-dc72-4dd0-aceb-709ad59a26b4"
}
```

`POST /api/driver/v1/orders/3c88e491-bb6c-4de1-b604-4f4de9fbfb22/claim` → **404**

```json
{
  "command_id": "f4e4bdc3-8f4f-4d3b-9aba-308a84703c79"
}
```

```json
{
  "instance": "/api/driver/v1/orders/3c88e491-bb6c-4de1-b604-4f4de9fbfb22/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "61f9c55c-26ba-4571-9808-cb1b3b5c0595"
}
```

`POST /api/driver/v1/orders/fc5f6e73-b961-43a7-a162-6cfe3b98c96b/claim` → **404**

```json
{
  "command_id": "0d20a46a-aaf5-40c3-aa97-24d09e1bc3fe"
}
```

```json
{
  "instance": "/api/driver/v1/orders/fc5f6e73-b961-43a7-a162-6cfe3b98c96b/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "bfc367f5-e374-4cc5-9987-3f564ec28a57"
}
```

`POST /api/driver/v1/orders/cd89b99f-74d2-4287-9234-e0db8220c8eb/claim` → **404**

```json
{
  "command_id": "012312b9-95dd-4554-83b7-10f56a1edfa0"
}
```

```json
{
  "instance": "/api/driver/v1/orders/cd89b99f-74d2-4287-9234-e0db8220c8eb/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "ab5a9199-d83f-494f-81c8-8bcf896e0897"
}
```

`POST /api/driver/v1/orders/24e24762-49e3-47fd-8105-c864810a96f2/claim` → **404**

```json
{
  "command_id": "f340f0c6-d103-4557-9241-b34f7f16b484"
}
```

```json
{
  "instance": "/api/driver/v1/orders/24e24762-49e3-47fd-8105-c864810a96f2/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "b717a4c6-40f6-4b39-b709-7f9e1835b4ea"
}
```

`POST /api/driver/v1/orders/b8b8b689-c09b-4313-a4bb-f17dd846aa47/claim` → **429**

```json
{
  "command_id": "c8adacf9-d8a6-4701-a990-2cff51a1bd44"
}
```

```json
{
  "instance": "/api/driver/v1/orders/b8b8b689-c09b-4313-a4bb-f17dd846aa47/claim",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "affd6419-cd7c-4961-81b2-f5178c210725",
  "retryable": true,
  "retry_after_seconds": 591
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
  "command_id": "b99a9a58-c5a7-4be5-b3b8-42c97f918609",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:34:04Z",
    "sequence": 1793399644919
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "bc3d5063-0824-4a0b-ba08-88125545fab9",
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
  "last_heartbeat_at": "2026-10-30T22:34:04.939756Z",
  "last_location_at": "2026-10-30T22:34:04.939756Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/broadcast-orders` → **200**

```json
[
  {
    "order_id": "0abb7363-bf3b-4d6f-ad36-f4a53b68029c",
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

`POST /api/driver/v1/orders/0abb7363-bf3b-4d6f-ad36-f4a53b68029c/claim` → **409**

```json
{
  "command_id": "cddc665c-2e7d-4501-8a7e-7c6e623c3741"
}
```

```json
{
  "instance": "/api/driver/v1/orders/0abb7363-bf3b-4d6f-ad36-f4a53b68029c/claim",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "79af91ba-86ab-4da7-aaef-54640c8dfdac"
}
```

`POST /api/driver/v1/orders/0abb7363-bf3b-4d6f-ad36-f4a53b68029c/claim` → **200**

```json
{
  "command_id": "5f023337-7dc7-49e0-8ddb-838fc8717d92"
}
```

```json
{
  "id": "f1f4a50a-bddb-49d4-abf5-bc114bd0e20a",
  "order_id": "0abb7363-bf3b-4d6f-ad36-f4a53b68029c",
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "source": "BROADCAST",
  "state": "COMMITTED",
  "trip_id": "4573be64-e46e-4d09-8b76-094ca815c00a",
  "trip_phase": "TO_PICKUP"
}
```

## Piotr cancels at the rider's request (sandbox clean-up)

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "4573be64-e46e-4d09-8b76-094ca815c00a",
  "order_id": "0abb7363-bf3b-4d6f-ad36-f4a53b68029c",
  "assignment_id": "f1f4a50a-bddb-49d4-abf5-bc114bd0e20a",
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

`POST /api/driver/v1/trips/4573be64-e46e-4d09-8b76-094ca815c00a/cancel` → **200**

```json
{
  "command_id": "504a2881-a90a-4947-bcc7-102377b9a10d",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "4573be64-e46e-4d09-8b76-094ca815c00a",
  "order_id": "0abb7363-bf3b-4d6f-ad36-f4a53b68029c",
  "assignment_id": "f1f4a50a-bddb-49d4-abf5-bc114bd0e20a",
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

`GET /api/rider/v1/orders/0abb7363-bf3b-4d6f-ad36-f4a53b68029c` → **200**

```json
{
  "id": "0abb7363-bf3b-4d6f-ad36-f4a53b68029c",
  "short_number": 4,
  "status": "CANCELLED",
  "status_reason": "PASSENGER_ASKED",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "954ea035-755e-40bd-ab8b-6a78ffd87b36",
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
    "id": "f1f4a50a-bddb-49d4-abf5-bc114bd0e20a",
    "order_id": "0abb7363-bf3b-4d6f-ad36-f4a53b68029c",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "vehicle_id": "5a000000-0000-4000-8000-000000000504",
    "source": "BROADCAST",
    "state": "RELEASED",
    "trip_id": "4573be64-e46e-4d09-8b76-094ca815c00a",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T22:33:53.853562Z",
  "cancellation": {
    "by": "DRIVER",
    "reason_code": "PASSENGER_ASKED",
    "reason_labels": {
      "ru": "Пассажир попросил отменить",
      "en": "Passenger asked to cancel",
      "uk": "Пасажир попросив скасувати",
      "pl": "Pasażer poprosił o anulowanie"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "541af508-5b41-46b3-8e7a-865e8801e9a2",
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
  "last_heartbeat_at": "2026-10-30T22:33:52.591668Z",
  "last_location_at": "2026-10-30T22:33:52.591668Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/541af508-5b41-46b3-8e7a-865e8801e9a2/close` → **200**

```json
{
  "command_id": "d2bb7cbe-2cdd-4d0c-8c03-5ede548e68b0",
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
  "session_id": "bc3d5063-0824-4a0b-ba08-88125545fab9",
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
  "last_heartbeat_at": "2026-10-30T22:34:04.939756Z",
  "last_location_at": "2026-10-30T22:34:04.939756Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/bc3d5063-0824-4a0b-ba08-88125545fab9/close` → **200**

```json
{
  "command_id": "cf83380c-0940-48dd-8c26-4826ce151356",
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
  "session_id": "4a299246-55c9-4e4d-937d-e8f14f456e58",
  "subject": {
    "type": "STAFF",
    "id": "09fe1c69-c031-458c-a537-a40fa884b9ac"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwOWZlMWM2OS1jMDMxLTQ1OGMtYTUzNy1hNDBmYTg4NGI5YWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDA1NDgsImlhdCI6MTc5MzM5OTY0OCwianRpIjoiOTQ2ZWFlOGItNzdlMy00YTYxLWI4NzItYTk2ZmY4NmM5OGQ5Iiwic2lkIjoiNGEyOTkyNDYtNTVjOS00ZTRkLTkzN2QtZThmMTRmNDU2ZTU4In0.Vzx05j07JeiDtIh2qM8VbtUk5mNNMK_nLJtT-4Kqcu0",
  "access_expires_at": "2026-10-30T22:49:08.569031201Z",
  "refresh_token": "eNp0cdB4o8LF95itFbHG1ba_t5oQNCkRFDy8BF_p_W0",
  "refresh_expires_at": "2026-10-31T10:34:08.568242761Z",
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
  "command_id": "7cf240de-4fdf-4323-8559-d6df16fc5781",
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
  "session_id": "25d9f301-cff6-4da0-b01d-6dbc12a6849d",
  "subject": {
    "type": "STAFF",
    "id": "09fe1c69-c031-458c-a537-a40fa884b9ac"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwOWZlMWM2OS1jMDMxLTQ1OGMtYTUzNy1hNDBmYTg4NGI5YWMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDA1NDksImlhdCI6MTc5MzM5OTY0OSwianRpIjoiNDc4MzY5ZDYtYTY3OS00NzMwLWE4MzgtMTEyZjQwMGRjNDU5Iiwic2lkIjoiMjVkOWYzMDEtY2ZmNi00ZGEwLWIwMWQtNmRiYzEyYTY4NDlkIn0.yCa-ktLAlmxGovG3rjj6DhR5zHrM0sc6kifPaX7nXic",
  "access_expires_at": "2026-10-30T22:49:09.764678463Z",
  "refresh_token": "GHhGFP3g7n1sB6UTymdetT0MBUfoVBEjkO5QJhENIrA",
  "refresh_expires_at": "2026-10-31T10:34:09.764069372Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.201424726",
    "linkedid": "1730052700.201424726",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380671130875"
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
    "id": "1730052700.201424726",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "3d92a461-15dd-46a8-871c-c17d14167c1b",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380671130875",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T22:34:10.06157Z",
      "answered_at": null,
      "ended_at": "2026-10-30T22:34:10.0872Z",
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
    "id": "1730052600.229321320",
    "linkedid": "1730052600.229321320",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380671130875"
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
      "id": "b6f86ef8-45f2-4966-ac7b-cdfa39a5fe3f",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380671130875",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T22:34:10.425058Z",
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

`POST /api/operator/v1/calls/b6f86ef8-45f2-4966-ac7b-cdfa39a5fe3f/answer` → **200**

```json
{
  "command_id": "8b22221d-9ba3-4946-8324-ced6d01db2e6"
}
```

```json
{
  "id": "b6f86ef8-45f2-4966-ac7b-cdfa39a5fe3f",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380671130875",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "09fe1c69-c031-458c-a537-a40fa884b9ac",
  "order_ids": [],
  "started_at": "2026-10-30T22:34:10.425058Z",
  "answered_at": "2026-10-30T22:34:10.75596Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.229321320",
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
    "id": "1730052600.229321320",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "b6f86ef8-45f2-4966-ac7b-cdfa39a5fe3f",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380671130875",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "09fe1c69-c031-458c-a537-a40fa884b9ac",
      "order_ids": [],
      "started_at": "2026-10-30T22:34:10.425058Z",
      "answered_at": "2026-10-30T22:34:10.75596Z",
      "ended_at": "2026-10-30T22:34:11.079541Z",
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
      "id": "b6f86ef8-45f2-4966-ac7b-cdfa39a5fe3f",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380671130875",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "09fe1c69-c031-458c-a537-a40fa884b9ac",
      "order_ids": [],
      "started_at": "2026-10-30T22:34:10.425058Z",
      "answered_at": "2026-10-30T22:34:10.75596Z",
      "ended_at": "2026-10-30T22:34:11.079541Z",
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
      "id": "b6f86ef8-45f2-4966-ac7b-cdfa39a5fe3f",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380671130875",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "09fe1c69-c031-458c-a537-a40fa884b9ac",
      "order_ids": [],
      "started_at": "2026-10-30T22:34:10.425058Z",
      "answered_at": "2026-10-30T22:34:10.75596Z",
      "ended_at": "2026-10-30T22:34:11.079541Z",
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
      "id": "b6f86ef8-45f2-4966-ac7b-cdfa39a5fe3f",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380671130875",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "09fe1c69-c031-458c-a537-a40fa884b9ac",
      "order_ids": [],
      "started_at": "2026-10-30T22:34:10.425058Z",
      "answered_at": "2026-10-30T22:34:10.75596Z",
      "ended_at": "2026-10-30T22:34:11.079541Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T22:34:17.922238Z"
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
      "id": "b6f86ef8-45f2-4966-ac7b-cdfa39a5fe3f",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380671130875",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "09fe1c69-c031-458c-a537-a40fa884b9ac",
      "order_ids": [],
      "started_at": "2026-10-30T22:34:10.425058Z",
      "answered_at": "2026-10-30T22:34:10.75596Z",
      "ended_at": "2026-10-30T22:34:11.079541Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T22:34:17.922238Z"
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

`GET /api/operator/v1/calls/b6f86ef8-45f2-4966-ac7b-cdfa39a5fe3f/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/b6f86ef8-45f2-4966-ac7b-cdfa39a5fe3f/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=b6f86ef8-45f2-4966-ac7b-cdfa39a5fe3f` → **200**

```json
{
  "changes": [
    {
      "id": "dde2bc87-3681-41bc-bafa-ce535df712ff",
      "occurred_at": "2026-10-30T22:34:18.640257Z",
      "actor_type": "STAFF",
      "actor_id": "09fe1c69-c031-458c-a537-a40fa884b9ac",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "b6f86ef8-45f2-4966-ac7b-cdfa39a5fe3f",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"002ef8ad-9605-4933-9840-f054ff1b6102\", \"order_ids\": []}",
      "correlation_id": "1dcf9ceb-0ecf-45f1-afda-94cb417fede1"
    },
    {
      "id": "27a01109-36ff-487b-be88-4ebdfefc6e6f",
      "occurred_at": "2026-10-30T22:34:18.609132Z",
      "actor_type": "STAFF",
      "actor_id": "09fe1c69-c031-458c-a537-a40fa884b9ac",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "b6f86ef8-45f2-4966-ac7b-cdfa39a5fe3f",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"002ef8ad-9605-4933-9840-f054ff1b6102\", \"order_ids\": []}",
      "correlation_id": "e90ebfad-0bc9-4a07-98a9-0dec7d169e6a"
    }
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
```

Done: call b6f86ef8-45f2-4966-ac7b-cdfa39a5fe3f recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-29459"
}
```

```json
{
  "challenge_id": "10a615be-7fd3-4588-a679-12abd565a9c8",
  "expires_at": "2026-10-30T22:39:18.978363927Z",
  "resend_available_at": "2026-10-30T22:34:19.978363927Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "839090",
  "sent_at": "2026-10-30T22:34:18.981409399Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "10a615be-7fd3-4588-a679-12abd565a9c8",
  "code": "839090",
  "device_ref": "sandbox-29459"
}
```

```json
{
  "session_id": "1fe30c81-f5f0-4dc8-82e5-d116da21791b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwMDU1OSwiaWF0IjoxNzkzMzk5NjU5LCJqdGkiOiJiYzQwMzc1Ni1mNDQxLTQ5YjItOWE0Ni00MDI2MmNhOTIyMDciLCJzaWQiOiIxZmUzMGM4MS1mNWYwLTRkYzgtODJlNS1kMTE2ZGEyMTc5MWIifQ.-EKFt4MeNUnt5--zx0Ahm4ZZ0Nxi2rYER7zQsaFmMIw",
  "access_expires_at": "2026-10-30T22:49:19.307171046Z",
  "refresh_token": "XraHNSFBbuhtWHc1QyaIzS0nr9wA0Fu7AoThiL2pJUc",
  "refresh_expires_at": "2026-11-29T22:34:19.303815316Z",
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
  "command_id": "823ecba2-ac7d-4b15-8dee-b23ddb7a059f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:34:19Z",
    "sequence": 1793399659915
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6e715e8c-6486-4b1f-9b80-25fc4081ddba",
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
  "last_heartbeat_at": "2026-10-30T22:34:19.934949Z",
  "last_location_at": "2026-10-30T22:34:19.934949Z",
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
  "session_id": "a26667be-8a5e-4bf8-846a-f698ccb3681c",
  "subject": {
    "type": "STAFF",
    "id": "09fe1c69-c031-458c-a537-a40fa884b9ac"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwOWZlMWM2OS1jMDMxLTQ1OGMtYTUzNy1hNDBmYTg4NGI5YWMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDA1NjAsImlhdCI6MTc5MzM5OTY2MCwianRpIjoiMzRkZjQ1ZmYtOTk1OC00MDViLWJhMWQtODQ5YTMxNjQwMDBjIiwic2lkIjoiYTI2NjY3YmUtOGE1ZS00YmY4LTg0NmEtZjY5OGNjYjM2ODFjIn0.sIFpSV95ZqtcqYAbvcXXjHn56br2lB_E1V5kHG1Jk7U",
  "access_expires_at": "2026-10-30T22:49:20.526335141Z",
  "refresh_token": "jkovuL2RFGBmvMtRsblc9BbkbfgUArSMdIG1cqoWN4w",
  "refresh_expires_at": "2026-10-31T10:34:20.525699973Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "e635c85c-588c-427b-b564-be020316fd23",
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
  "id": "e200b5c0-21b8-4a67-9af4-375fbed09b66",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T22:39:20.827778Z",
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
  "command_id": "34e6de04-d4ff-4af1-a1d0-9dc4fa1e1047",
  "quote_id": "e200b5c0-21b8-4a67-9af4-375fbed09b66",
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
    "phone": "+380679041692"
  }
}
```

```json
{
  "id": "d9fe2d15-a07e-4ac9-9ad2-5b03b0469237",
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
  "created_at": "2026-10-30T22:34:21.145591Z",
  "caller": {
    "name": "Олена",
    "phone": "+380679041692"
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
    "id": "ce5f6879-0e06-486a-88c2-4680cd502d8d",
    "order_id": "d9fe2d15-a07e-4ac9-9ad2-5b03b0469237",
    "expires_at": "2026-10-30T22:34:36.150478Z",
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

`POST /api/driver/v1/offers/ce5f6879-0e06-486a-88c2-4680cd502d8d/accept` → **200**

```json
{
  "command_id": "02523c13-ba79-4c56-b039-4a22bf38d535"
}
```

```json
{
  "id": "1cd8d3d6-6b32-455a-8e1b-da1ee8c00a41",
  "order_id": "d9fe2d15-a07e-4ac9-9ad2-5b03b0469237",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b98ee94b-feab-4e53-a32c-245c0aef6869",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380679041692` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380679041692` → **200**

```json
[
  {
    "phone": "+380679041692",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T22:34:22.62566134Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380679041692` → **200**

```json
[
  {
    "phone": "+380679041692",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T22:34:22.62566134Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380679041692` → **200**

```json
[
  {
    "phone": "+380679041692",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T22:34:22.62566134Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b98ee94b-feab-4e53-a32c-245c0aef6869",
  "order_id": "d9fe2d15-a07e-4ac9-9ad2-5b03b0469237",
  "assignment_id": "1cd8d3d6-6b32-455a-8e1b-da1ee8c00a41",
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
    "phone": "+380679041692"
  }
}
```

`POST /api/driver/v1/work-sessions/6e715e8c-6486-4b1f-9b80-25fc4081ddba/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:34:23Z",
    "sequence": 1793399663500
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6e715e8c-6486-4b1f-9b80-25fc4081ddba",
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
  "last_heartbeat_at": "2026-10-30T22:34:23.520307Z",
  "last_location_at": "2026-10-30T22:34:23.520307Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/b98ee94b-feab-4e53-a32c-245c0aef6869/arrive` → **200**

```json
{
  "command_id": "6497b4d4-26e4-4fc1-929e-bebf34269ece",
  "expected_version": 0
}
```

```json
{
  "id": "b98ee94b-feab-4e53-a32c-245c0aef6869",
  "order_id": "d9fe2d15-a07e-4ac9-9ad2-5b03b0469237",
  "assignment_id": "1cd8d3d6-6b32-455a-8e1b-da1ee8c00a41",
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
  "arrived_at": "2026-10-30T22:34:23.835152Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380679041692"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380679041692` → **200**

```json
[
  {
    "phone": "+380679041692",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T22:34:22.62566134Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380679041692` → **200**

```json
[
  {
    "phone": "+380679041692",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T22:34:22.62566134Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380679041692` → **200**

```json
[
  {
    "phone": "+380679041692",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T22:34:22.62566134Z"
  },
  {
    "phone": "+380679041692",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T22:34:25.637333067Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380679041692` → **200**

```json
[
  {
    "phone": "+380679041692",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T22:34:22.62566134Z"
  },
  {
    "phone": "+380679041692",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T22:34:25.637333067Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380679041692` → **200**

```json
[
  {
    "phone": "+380679041692",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T22:34:22.62566134Z"
  },
  {
    "phone": "+380679041692",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T22:34:25.637333067Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/b98ee94b-feab-4e53-a32c-245c0aef6869/start` → **200**

```json
{
  "command_id": "101eb1c8-93cc-401e-ac10-815ad8dc3c43",
  "expected_version": 1
}
```

```json
{
  "id": "b98ee94b-feab-4e53-a32c-245c0aef6869",
  "order_id": "d9fe2d15-a07e-4ac9-9ad2-5b03b0469237",
  "assignment_id": "1cd8d3d6-6b32-455a-8e1b-da1ee8c00a41",
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
  "arrived_at": "2026-10-30T22:34:23.835152Z",
  "started_at": "2026-10-30T22:34:26.272355Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380679041692"
  }
}
```

`POST /api/driver/v1/trips/b98ee94b-feab-4e53-a32c-245c0aef6869/complete` → **200**

```json
{
  "command_id": "b40f6bc3-27c6-48ba-b77a-2cd588b55b6f",
  "expected_version": 2,
  "reported_at": "2026-10-30T22:34:26Z",
  "cash_received": true
}
```

```json
{
  "id": "b98ee94b-feab-4e53-a32c-245c0aef6869",
  "order_id": "d9fe2d15-a07e-4ac9-9ad2-5b03b0469237",
  "assignment_id": "1cd8d3d6-6b32-455a-8e1b-da1ee8c00a41",
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
  "arrived_at": "2026-10-30T22:34:23.835152Z",
  "started_at": "2026-10-30T22:34:26.272355Z",
  "completed_at": "2026-10-30T22:34:26.582779Z",
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
  "session_id": "6e715e8c-6486-4b1f-9b80-25fc4081ddba",
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
  "last_heartbeat_at": "2026-10-30T22:34:23.520307Z",
  "last_location_at": "2026-10-30T22:34:23.520307Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6e715e8c-6486-4b1f-9b80-25fc4081ddba/close` → **200**

```json
{
  "command_id": "e96d0342-cddc-4e6f-bbf2-bbed8f656ddc",
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
  "phone": "+380638062778",
  "device_ref": "sandbox-5294"
}
```

```json
{
  "challenge_id": "97d56bfa-82a4-4444-b992-e0d17a528322",
  "expires_at": "2026-10-30T22:39:27.502268365Z",
  "resend_available_at": "2026-10-30T22:34:28.502268365Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638062778` → **200**

```json
{
  "phone": "+380638062778",
  "audience": "CLIENT",
  "code": "424575",
  "sent_at": "2026-10-30T22:34:27.505308805Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "97d56bfa-82a4-4444-b992-e0d17a528322",
  "code": "424575",
  "device_ref": "sandbox-5294"
}
```

```json
{
  "session_id": "cc8ff4b9-a26e-4c43-85f0-39583831fef9",
  "subject": {
    "type": "CLIENT",
    "id": "bdb28a47-c936-4021-ad03-4a53b8a3275c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiZGIyOGE0Ny1jOTM2LTQwMjEtYWQwMy00YTUzYjhhMzI3NWMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDAwNTY3LCJpYXQiOjE3OTMzOTk2NjcsImp0aSI6ImU0YTI4ZmFiLTZjMjctNGFjZC04MWNhLWQwNmU0NjlhNGE2ZCIsInNpZCI6ImNjOGZmNGI5LWEyNmUtNGM0My04NWYwLTM5NTgzODMxZmVmOSJ9.Bt11CQ3XGqXsudcIt8B5cL7rSOFheWUDGLbhmOVlsX0",
  "access_expires_at": "2026-10-30T22:49:27.823017056Z",
  "refresh_token": "Y7bHiopk59q4dCWYjJ_ek-J1YDIb7LzvWjzeTxgO9WQ",
  "refresh_expires_at": "2026-11-29T22:34:27.822205908Z",
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
        "ru": "Передумал ехать",
        "en": "Changed my mind",
        "uk": "Передумав їхати",
        "pl": "Zmiana planów"
      },
      "driver_outcome": null
    },
    {
      "code": "WAIT_TOO_LONG",
      "labels": {
        "ru": "Долго ждать машину",
        "en": "The wait is too long",
        "uk": "Довго чекати авто",
        "pl": "Zbyt długie oczekiwanie"
      },
      "driver_outcome": null
    },
    {
      "code": "WRONG_ADDRESS",
      "labels": {
        "ru": "Ошибся адресом",
        "en": "Wrong address",
        "uk": "Помилився адресою",
        "pl": "Błędny adres"
      },
      "driver_outcome": null
    },
    {
      "code": "OTHER_TRANSPORT",
      "labels": {
        "ru": "Уеду на другом транспорте",
        "en": "Found other transport",
        "uk": "Поїду іншим транспортом",
        "pl": "Inny transport"
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
  "device_ref": "sandbox-7190"
}
```

```json
{
  "challenge_id": "82051a01-f08b-49b1-ba92-ba4f5b6da518",
  "expires_at": "2026-10-30T22:39:28.401239775Z",
  "resend_available_at": "2026-10-30T22:34:29.401239775Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "395359",
  "sent_at": "2026-10-30T22:34:28.404151785Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "82051a01-f08b-49b1-ba92-ba4f5b6da518",
  "code": "395359",
  "device_ref": "sandbox-7190"
}
```

```json
{
  "session_id": "f3757b49-db7d-4c17-bac5-5d0a7b4296ca",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwMDU2OCwiaWF0IjoxNzkzMzk5NjY4LCJqdGkiOiIyY2JjMTg4Yy05MjIyLTQ2N2MtODg4Ny0wNGZiYjJjNmM1MDQiLCJzaWQiOiJmMzc1N2I0OS1kYjdkLTRjMTctYmFjNS01ZDBhN2I0Mjk2Y2EifQ.5_bjTcIbHvQX2yub7BBH2jpRt9tibBFpmd-TK6mwa9g",
  "access_expires_at": "2026-10-30T22:49:28.723489027Z",
  "refresh_token": "JgmlrK_TAF7ykRUPUjoBfhixQSFtw6c8gGAJddnAUV0",
  "refresh_expires_at": "2026-11-29T22:34:28.722868844Z",
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
        "ru": "Пассажир не вышел",
        "en": "Passenger did not show up",
        "uk": "Пасажир не вийшов",
        "pl": "Pasażer nie przyszedł"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "PASSENGER_ASKED",
      "labels": {
        "ru": "Пассажир попросил отменить",
        "en": "Passenger asked to cancel",
        "uk": "Пасажир попросив скасувати",
        "pl": "Pasażer poprosił o anulowanie"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "VEHICLE_PROBLEM",
      "labels": {
        "ru": "Неисправность автомобиля",
        "en": "Vehicle problem",
        "uk": "Несправність автомобіля",
        "pl": "Awaria samochodu"
      },
      "driver_outcome": "RETURN_TO_SEARCH"
    },
    {
      "code": "CANNOT_REACH",
      "labels": {
        "ru": "Не могу подъехать",
        "en": "Cannot reach the pickup",
        "uk": "Не можу під'їхати",
        "pl": "Nie mogę dojechać"
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
  "session_id": "49cd044f-fe07-4aca-bea4-8fbac548e26b",
  "subject": {
    "type": "STAFF",
    "id": "09fe1c69-c031-458c-a537-a40fa884b9ac"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwOWZlMWM2OS1jMDMxLTQ1OGMtYTUzNy1hNDBmYTg4NGI5YWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDA1NjksImlhdCI6MTc5MzM5OTY2OSwianRpIjoiN2VlYjA1MjQtYWNhOS00NTYwLWFlOTItNjQzODNkODY5ZDk2Iiwic2lkIjoiNDljZDA0NGYtZmUwNy00YWNhLWJlYTQtOGZiYWM1NDhlMjZiIn0.TXGeDg65h1GjSQGjJUSoEP-2CfaWpIHyRXG4TRFRGBs",
  "access_expires_at": "2026-10-30T22:49:29.584751529Z",
  "refresh_token": "vHnjXbTkmq_GTorqGE43rqcaw0IEwUiPhmEHqrEN33w",
  "refresh_expires_at": "2026-10-31T10:34:29.584195306Z",
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
  "session_id": "8e098e32-dbca-4934-9719-a7761343a6a7",
  "subject": {
    "type": "STAFF",
    "id": "09fe1c69-c031-458c-a537-a40fa884b9ac"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwOWZlMWM2OS1jMDMxLTQ1OGMtYTUzNy1hNDBmYTg4NGI5YWMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDA1NzAsImlhdCI6MTc5MzM5OTY3MCwianRpIjoiYjRjMzE2MjQtOWUwZi00YjVkLTk2MTctMjVhNmQ2OTAyNzMxIiwic2lkIjoiOGUwOThlMzItZGJjYS00OTM0LTk3MTktYTc3NjEzNDNhNmE3In0.o_SeGBwq0MqNdv15EO9oH21GzIlN3lIXl9n0HxI0RN0",
  "access_expires_at": "2026-10-30T22:49:30.165732081Z",
  "refresh_token": "71i-ODwYXpaK73bWdHBROVO1a2C1AancR0QbtUFgNdg",
  "refresh_expires_at": "2026-10-31T10:34:30.165119841Z",
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
        "ru": "Пассажир попросил",
        "en": "Passenger asked",
        "uk": "Пасажир попросив",
        "pl": "Na prośbę pasażera"
      },
      "driver_outcome": null
    },
    {
      "code": "DUPLICATE",
      "labels": {
        "ru": "Дубль заказа",
        "en": "Duplicate order",
        "uk": "Дубль замовлення",
        "pl": "Duplikat zamówienia"
      },
      "driver_outcome": null
    },
    {
      "code": "NO_CARS",
      "labels": {
        "ru": "Нет свободных машин",
        "en": "No cars available",
        "uk": "Немає вільних авто",
        "pl": "Brak wolnych aut"
      },
      "driver_outcome": null
    },
    {
      "code": "TEST_ORDER",
      "labels": {
        "ru": "Тестовый заказ",
        "en": "Test order",
        "uk": "Тестове замовлення",
        "pl": "Zamówienie testowe"
      },
      "driver_outcome": null
    },
    {
      "code": "OPERATOR_ERROR",
      "labels": {
        "ru": "Ошибка оператора",
        "en": "Operator error",
        "uk": "Помилка оператора",
        "pl": "Błąd operatora"
      },
      "driver_outcome": null
    },
    {
      "code": "VEHICLE_BREAKDOWN",
      "labels": {
        "ru": "Поломка автомобиля в пути",
        "en": "Vehicle broke down on the way",
        "uk": "Поломка автомобіля в дорозі",
        "pl": "Awaria auta w trasie"
      },
      "driver_outcome": null
    },
    {
      "code": "ACCIDENT",
      "labels": {
        "ru": "ДТП",
        "en": "Accident",
        "uk": "ДТП",
        "pl": "Wypadek"
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
  "command_id": "1a74b3f7-0837-4d09-8f00-9eb0336d0e07",
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
  "id": "f69d0f98-055f-42e6-bd03-78737a7eed64",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T22:39:30.757267Z",
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
  "command_id": "c83855bd-d2c7-402a-83d0-c217113ebb7c",
  "quote_id": "f69d0f98-055f-42e6-bd03-78737a7eed64",
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
  "id": "64f8b929-7110-4844-8549-894ebbc15c7c",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bdb28a47-c936-4021-ad03-4a53b8a3275c",
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
  "created_at": "2026-10-30T22:34:31.073631Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

`GET /api/rider/v1/orders/64f8b929-7110-4844-8549-894ebbc15c7c` → **200**

```json
{
  "id": "64f8b929-7110-4844-8549-894ebbc15c7c",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bdb28a47-c936-4021-ad03-4a53b8a3275c",
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
  "created_at": "2026-10-30T22:34:31.073631Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

`POST /api/rider/v1/orders/64f8b929-7110-4844-8549-894ebbc15c7c/cancel` → **200**

```json
{
  "command_id": "82a9f718-1f69-4b30-bc8c-742b83f03eee",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "64f8b929-7110-4844-8549-894ebbc15c7c",
  "short_number": 6,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "bdb28a47-c936-4021-ad03-4a53b8a3275c",
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
  "created_at": "2026-10-30T22:34:31.073631Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "WAIT_TOO_LONG",
    "reason_labels": {
      "ru": "Долго ждать машину",
      "en": "The wait is too long",
      "uk": "Довго чекати авто",
      "pl": "Zbyt długie oczekiwanie"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
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
  "command_id": "19490de1-d041-4b09-8320-f23ecb02dd9b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:34:32Z",
    "sequence": 1793399672383
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "10eccd24-f45d-4382-ab0b-2a3ece6ab308",
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
  "last_heartbeat_at": "2026-10-30T22:34:32.402739Z",
  "last_location_at": "2026-10-30T22:34:32.402739Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-1687"
}
```

```json
{
  "challenge_id": "bbfc6ff1-7017-49a9-b49e-edeebcbf653a",
  "expires_at": "2026-10-30T22:39:32.705987342Z",
  "resend_available_at": "2026-10-30T22:34:33.705987342Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "412321",
  "sent_at": "2026-10-30T22:34:32.708836034Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bbfc6ff1-7017-49a9-b49e-edeebcbf653a",
  "code": "412321",
  "device_ref": "sandbox-1687"
}
```

```json
{
  "session_id": "ed6021e5-4858-44b5-ae6a-1528836ce464",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwMDU3MywiaWF0IjoxNzkzMzk5NjczLCJqdGkiOiI2M2EzOWQyZS1kNzRlLTRkYTktYWU0Mi1jOTNmN2Y1ZjM5NTAiLCJzaWQiOiJlZDYwMjFlNS00ODU4LTQ0YjUtYWU2YS0xNTI4ODM2Y2U0NjQifQ.-ag51tqPZN4h-uc3myxc12gENRr-QoMYOfCbcfWl65c",
  "access_expires_at": "2026-10-30T22:49:33.027311205Z",
  "refresh_token": "XuXW2o3BMELQQN_YlNPZYcKpwzhVsuJEyeaJKSvGrGs",
  "refresh_expires_at": "2026-11-29T22:34:33.026599962Z",
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
  "command_id": "6d6a9ccf-8f6d-45a1-a415-b143cf0e1132",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:34:33Z",
    "sequence": 1793399673633
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "2b6f31a2-c2ad-49df-8202-db8842c72b19",
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
  "last_heartbeat_at": "2026-10-30T22:34:33.653832Z",
  "last_location_at": "2026-10-30T22:34:33.653832Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d4198cc9-da77-4652-bd67-af82363029da",
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
  "id": "e4cd6fb1-169f-4e05-8669-96c189e68909",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T22:39:33.973437Z",
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
  "command_id": "03a5495f-557a-4e63-a28a-749241af98cc",
  "quote_id": "e4cd6fb1-169f-4e05-8669-96c189e68909",
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
  "id": "b5c1ccd5-58d8-4185-b26e-6163674974a6",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bdb28a47-c936-4021-ad03-4a53b8a3275c",
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
  "created_at": "2026-10-30T22:34:34.277233Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "338fb8f8-b29c-4ede-b7c8-648cb3ed4138",
    "order_id": "b5c1ccd5-58d8-4185-b26e-6163674974a6",
    "expires_at": "2026-10-30T22:34:49.280722Z",
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

`POST /api/driver/v1/offers/338fb8f8-b29c-4ede-b7c8-648cb3ed4138/accept` → **200**

```json
{
  "command_id": "8b1b4c7e-08ec-445c-804c-f45ba9e6e521"
}
```

```json
{
  "id": "3de7a32e-1735-4e7e-a302-eb8089933d95",
  "order_id": "b5c1ccd5-58d8-4185-b26e-6163674974a6",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d133e141-9adf-41ba-97c0-6911a54fb97c",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d133e141-9adf-41ba-97c0-6911a54fb97c",
  "order_id": "b5c1ccd5-58d8-4185-b26e-6163674974a6",
  "assignment_id": "3de7a32e-1735-4e7e-a302-eb8089933d95",
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

`POST /api/driver/v1/trips/d133e141-9adf-41ba-97c0-6911a54fb97c/cancel` → **200**

```json
{
  "command_id": "d14ddd13-f694-4013-8d70-fa36d8820bf8",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "d133e141-9adf-41ba-97c0-6911a54fb97c",
  "order_id": "b5c1ccd5-58d8-4185-b26e-6163674974a6",
  "assignment_id": "3de7a32e-1735-4e7e-a302-eb8089933d95",
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

`GET /api/rider/v1/orders/b5c1ccd5-58d8-4185-b26e-6163674974a6` → **200**

```json
{
  "id": "b5c1ccd5-58d8-4185-b26e-6163674974a6",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "bdb28a47-c936-4021-ad03-4a53b8a3275c",
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
  "created_at": "2026-10-30T22:34:34.277233Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": {
    "reason_code": "DRIVER_CANCELLED",
    "at": "2026-10-30T22:34:35.513488Z"
  }
}
```

## Andrii gets it and cancels: «Пассажир попросил отменить»

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "f1dd6e0d-32bc-47ad-b0a1-60ea0b081ddc",
    "order_id": "b5c1ccd5-58d8-4185-b26e-6163674974a6",
    "expires_at": "2026-10-30T22:34:50.517071Z",
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

`POST /api/driver/v1/offers/f1dd6e0d-32bc-47ad-b0a1-60ea0b081ddc/accept` → **200**

```json
{
  "command_id": "d4f92fcf-4ce1-4da4-ba78-8d867958ddbe"
}
```

```json
{
  "id": "f38c13cf-f5fc-4a71-9a00-262b96942e96",
  "order_id": "b5c1ccd5-58d8-4185-b26e-6163674974a6",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "1e9f12ce-7555-4df0-aa4b-ca8b9025519f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "1e9f12ce-7555-4df0-aa4b-ca8b9025519f",
  "order_id": "b5c1ccd5-58d8-4185-b26e-6163674974a6",
  "assignment_id": "f38c13cf-f5fc-4a71-9a00-262b96942e96",
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

`POST /api/driver/v1/trips/1e9f12ce-7555-4df0-aa4b-ca8b9025519f/cancel` → **200**

```json
{
  "command_id": "494dc39d-354f-4784-8b36-cfa914579080",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "1e9f12ce-7555-4df0-aa4b-ca8b9025519f",
  "order_id": "b5c1ccd5-58d8-4185-b26e-6163674974a6",
  "assignment_id": "f38c13cf-f5fc-4a71-9a00-262b96942e96",
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
      "id": "b5c1ccd5-58d8-4185-b26e-6163674974a6",
      "short_number": 7,
      "status": "CANCELLED",
      "created_at": "2026-10-30T22:34:34.277233Z",
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
          "ru": "Пассажир попросил отменить",
          "en": "Passenger asked to cancel",
          "uk": "Пасажир попросив скасувати",
          "pl": "Pasażer poprosił o anulowanie"
        }
      },
      "pickup_at": null
    },
    {
      "id": "64f8b929-7110-4844-8549-894ebbc15c7c",
      "short_number": 6,
      "status": "CANCELLED",
      "created_at": "2026-10-30T22:34:31.073631Z",
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
          "ru": "Долго ждать машину",
          "en": "The wait is too long",
          "uk": "Довго чекати авто",
          "pl": "Zbyt długie oczekiwanie"
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

`GET /api/operator/v1/orders/b5c1ccd5-58d8-4185-b26e-6163674974a6/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T22:34:34.277739Z",
      "actor": {
        "type": "CLIENT",
        "id": "bdb28a47-c936-4021-ad03-4a53b8a3275c",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "b5c1ccd5-58d8-4185-b26e-6163674974a6",
        "quote_id": "e4cd6fb1-169f-4e05-8669-96c189e68909",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "3ff2f7e1-ea6e-42db-9420-ce4447aea00b"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T22:34:34.279854Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "b5c1ccd5-58d8-4185-b26e-6163674974a6",
        "attempt_id": "f11810bc-0766-4330-9e7b-8f050d404d41",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "3ff2f7e1-ea6e-42db-9420-ce4447aea00b"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T22:34:34.304987Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "338fb8f8-b29c-4ede-b7c8-648cb3ed4138",
        "order_id": "b5c1ccd5-58d8-4185-b26e-6163674974a6",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478,
        "expires_at": "2026-10-30T22:34:49.280721987Z"
      },
      "correlation_id": "3ff2f7e1-ea6e-42db-9420-ce4447aea00b"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T22:34:34.927814Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "338fb8f8-b29c-4ede-b7c8-648cb3ed4138",
        "order_id": "b5c1ccd5-58d8-4185-b26e-6163674974a6",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "3de7a32e-1735-4e7e-a302-eb8089933d95"
      },
```

Done: orders 64f8b929-7110-4844-8549-894ebbc15c7c, b5c1ccd5-58d8-4185-b26e-6163674974a6.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380739198280",
  "device_ref": "sandbox-5626"
}
```

```json
{
  "challenge_id": "290f19f4-2bc5-4704-b543-76ff06f40b48",
  "expires_at": "2026-10-30T22:39:37.940650704Z",
  "resend_available_at": "2026-10-30T22:34:38.940650704Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380739198280` → **200**

```json
{
  "phone": "+380739198280",
  "audience": "CLIENT",
  "code": "640814",
  "sent_at": "2026-10-30T22:34:37.943653082Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "290f19f4-2bc5-4704-b543-76ff06f40b48",
  "code": "640814",
  "device_ref": "sandbox-5626"
}
```

```json
{
  "session_id": "7865ce58-3e0d-49c3-8c10-a84b351995eb",
  "subject": {
    "type": "CLIENT",
    "id": "f3cfd485-56b7-4a19-851c-a3bb4624fc3d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmM2NmZDQ4NS01NmI3LTRhMTktODUxYy1hM2JiNDYyNGZjM2QiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDAwNTc4LCJpYXQiOjE3OTMzOTk2NzgsImp0aSI6IjA3ZDRhOTYwLTYwM2UtNGU0YS1iOTUyLWNhNDRhNzA3M2ZkYyIsInNpZCI6Ijc4NjVjZTU4LTNlMGQtNDljMy04YzEwLWE4NGIzNTE5OTVlYiJ9.km-v75gVpLILQiXuJ2j1jqOjlFYTJgcf2bEED9BUE3g",
  "access_expires_at": "2026-10-30T22:49:38.273508753Z",
  "refresh_token": "ax54bLog_-5Itab0pujSjTObg8VzBVp2xLSFGPB0rJI",
  "refresh_expires_at": "2026-11-29T22:34:38.27280783Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "9ad4ce87-b84a-4ed7-8089-76232ebb377d",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "e9b76d40-805b-4d7b-a749-b203b491928f",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-e9b76d40-805b-4d7b-a749-b203b491928f",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "6e86506e331bd7a0630963f8859c0676",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=e9b76d40-805b-4d7b-a749-b203b491928f",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380739198280"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=e9b76d40-805b-4d7b-a749-b203b491928f",
  "expires_at": "2026-10-30T23:04:38.561325Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/e9b76d40-805b-4d7b-a749-b203b491928f` → **200**

```json
{
  "id": "e9b76d40-805b-4d7b-a749-b203b491928f",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T23:04:38.561325Z",
  "card": {
    "id": "b50d7f7b-63a2-4c5d-91b7-eb3fce7ed93e",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****4799",
    "card_type": "Visa",
    "created_at": "2026-10-30T22:34:38.867809Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "b50d7f7b-63a2-4c5d-91b7-eb3fce7ed93e",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****4799",
      "card_type": "Visa",
      "created_at": "2026-10-30T22:34:38.867809Z"
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
  "device_ref": "sandbox-1321"
}
```

```json
{
  "challenge_id": "191de136-7a7a-4a5a-bbcc-11c836db13e5",
  "expires_at": "2026-10-30T22:39:39.481037724Z",
  "resend_available_at": "2026-10-30T22:34:40.481037724Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "520908",
  "sent_at": "2026-10-30T22:34:39.483772125Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "191de136-7a7a-4a5a-bbcc-11c836db13e5",
  "code": "520908",
  "device_ref": "sandbox-1321"
}
```

```json
{
  "session_id": "33179a49-9ae4-4c77-a9e7-3a42ab0d2195",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwMDU3OSwiaWF0IjoxNzkzMzk5Njc5LCJqdGkiOiJkNTYwYjQ4Mi1jOTVmLTQ2ZWItYjlhYy1mN2U3NjE5YmI3YTEiLCJzaWQiOiIzMzE3OWE0OS05YWU0LTRjNzctYTllNy0zYTQyYWIwZDIxOTUifQ.vNE5uLhIcvy0fUT0dtSTpwKPTBOAJOtgpBuZuOrpkgM",
  "access_expires_at": "2026-10-30T22:49:39.812225496Z",
  "refresh_token": "N1X-Fns7AvhamAWuT9f_xtT63YVjq2FpwyZJHE_RvIU",
  "refresh_expires_at": "2026-11-29T22:34:39.811585853Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "2b6f31a2-c2ad-49df-8202-db8842c72b19",
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
  "last_heartbeat_at": "2026-10-30T22:34:33.653832Z",
  "last_location_at": "2026-10-30T22:34:33.653832Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2b6f31a2-c2ad-49df-8202-db8842c72b19/handover` → **200**

```json
{
  "command_id": "86ad245b-cdf5-4e9a-931a-6406ead82416",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "2b6f31a2-c2ad-49df-8202-db8842c72b19",
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
  "last_heartbeat_at": "2026-10-30T22:34:33.653832Z",
  "last_location_at": "2026-10-30T22:34:33.653832Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

(the car drives 42 s to the next point)

`POST /api/driver/v1/work-sessions/2b6f31a2-c2ad-49df-8202-db8842c72b19/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:35:22Z",
    "sequence": 1793399722718
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "2b6f31a2-c2ad-49df-8202-db8842c72b19",
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
  "last_heartbeat_at": "2026-10-30T22:35:22.738527Z",
  "last_location_at": "2026-10-30T22:35:22.738527Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "36e71866-4f24-4741-ac0e-8771213219d9",
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
  "id": "bc6dd3b3-4fca-4dc1-b06a-849d1da35be9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T22:40:23.050618Z",
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
  "command_id": "3e23c17a-bf0f-4ebc-a463-48b5fd5cd46a",
  "quote_id": "bc6dd3b3-4fca-4dc1-b06a-849d1da35be9",
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
  "id": "40266e4b-d8f6-4f38-8c76-b38f19347f0f",
  "short_number": 8,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "f3cfd485-56b7-4a19-851c-a3bb4624fc3d",
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
  "created_at": "2026-10-30T22:35:23.38903Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

`GET /api/rider/v1/orders/40266e4b-d8f6-4f38-8c76-b38f19347f0f` → **200**

```json
{
  "id": "40266e4b-d8f6-4f38-8c76-b38f19347f0f",
  "short_number": 8,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "f3cfd485-56b7-4a19-851c-a3bb4624fc3d",
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
  "created_at": "2026-10-30T22:35:23.38903Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

`GET /api/rider/v1/orders/40266e4b-d8f6-4f38-8c76-b38f19347f0f` → **200**

```json
{
  "id": "40266e4b-d8f6-4f38-8c76-b38f19347f0f",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "f3cfd485-56b7-4a19-851c-a3bb4624fc3d",
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
  "created_at": "2026-10-30T22:35:23.38903Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

## Andrii takes it and drives

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "5fc8ff21-b64d-4c17-a077-1c918ebf96c5",
    "order_id": "40266e4b-d8f6-4f38-8c76-b38f19347f0f",
    "expires_at": "2026-10-30T22:35:39.048833Z",
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

`POST /api/driver/v1/offers/5fc8ff21-b64d-4c17-a077-1c918ebf96c5/accept` → **200**

```json
{
  "command_id": "1127e46b-3806-4b0d-a5d0-939535467c66"
}
```

```json
{
  "id": "d0887705-7ce0-4f86-87f2-c2f130a4377c",
  "order_id": "40266e4b-d8f6-4f38-8c76-b38f19347f0f",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "cf7056b7-61c7-422d-adf8-17c549789d68",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "cf7056b7-61c7-422d-adf8-17c549789d68",
  "order_id": "40266e4b-d8f6-4f38-8c76-b38f19347f0f",
  "assignment_id": "d0887705-7ce0-4f86-87f2-c2f130a4377c",
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

(the car drives 5 s to the next point)

`POST /api/driver/v1/work-sessions/2b6f31a2-c2ad-49df-8202-db8842c72b19/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:35:31Z",
    "sequence": 1793399731292
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "2b6f31a2-c2ad-49df-8202-db8842c72b19",
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
  "last_heartbeat_at": "2026-10-30T22:35:31.313301Z",
  "last_location_at": "2026-10-30T22:35:31.313301Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/cf7056b7-61c7-422d-adf8-17c549789d68/arrive` → **200**

```json
{
  "command_id": "69575c68-18aa-4eba-917c-a1e4fdf11340",
  "expected_version": 0
}
```

```json
{
  "id": "cf7056b7-61c7-422d-adf8-17c549789d68",
  "order_id": "40266e4b-d8f6-4f38-8c76-b38f19347f0f",
  "assignment_id": "d0887705-7ce0-4f86-87f2-c2f130a4377c",
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
  "arrived_at": "2026-10-30T22:35:31.624685Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/cf7056b7-61c7-422d-adf8-17c549789d68/start` → **200**

```json
{
  "command_id": "2c34be85-1b6c-4abc-929a-e834974c84e0",
  "expected_version": 1
}
```

```json
{
  "id": "cf7056b7-61c7-422d-adf8-17c549789d68",
  "order_id": "40266e4b-d8f6-4f38-8c76-b38f19347f0f",
  "assignment_id": "d0887705-7ce0-4f86-87f2-c2f130a4377c",
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
  "arrived_at": "2026-10-30T22:35:31.624685Z",
  "started_at": "2026-10-30T22:35:31.939447Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/cf7056b7-61c7-422d-adf8-17c549789d68/complete` → **200**

```json
{
  "command_id": "00a5b98a-2108-4d81-bd10-ebe72350ee0d",
  "expected_version": 2,
  "reported_at": "2026-10-30T22:35:32Z",
  "cash_received": true
}
```

```json
{
  "id": "cf7056b7-61c7-422d-adf8-17c549789d68",
  "order_id": "40266e4b-d8f6-4f38-8c76-b38f19347f0f",
  "assignment_id": "d0887705-7ce0-4f86-87f2-c2f130a4377c",
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
  "arrived_at": "2026-10-30T22:35:31.624685Z",
  "started_at": "2026-10-30T22:35:31.939447Z",
  "completed_at": "2026-10-30T22:35:32.256658Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/40266e4b-d8f6-4f38-8c76-b38f19347f0f` → **200**

```json
{
  "id": "40266e4b-d8f6-4f38-8c76-b38f19347f0f",
  "short_number": 8,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "f3cfd485-56b7-4a19-851c-a3bb4624fc3d",
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
    "id": "d0887705-7ce0-4f86-87f2-c2f130a4377c",
    "order_id": "40266e4b-d8f6-4f38-8c76-b38f19347f0f",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "cf7056b7-61c7-422d-adf8-17c549789d68",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T22:35:23.38903Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": {
    "name": "Андрій Шевчук",
    "make": "Hyundai",
    "model": "Sonata",
    "color": "black",
    "registration_number": "AA0003TX",
    "photo_url": null
  },
  "driver_change": null
}
```

`GET /api/rider/v1/orders/40266e4b-d8f6-4f38-8c76-b38f19347f0f` → **200**

```json
{
  "id": "40266e4b-d8f6-4f38-8c76-b38f19347f0f",
  "short_number": 8,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "f3cfd485-56b7-4a19-851c-a3bb4624fc3d",
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
    "id": "d0887705-7ce0-4f86-87f2-c2f130a4377c",
    "order_id": "40266e4b-d8f6-4f38-8c76-b38f19347f0f",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "cf7056b7-61c7-422d-adf8-17c549789d68",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T22:35:23.38903Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": {
    "name": "Андрій Шевчук",
    "make": "Hyundai",
    "model": "Sonata",
    "color": "black",
    "registration_number": "AA0003TX",
    "photo_url": null
  },
  "driver_change": null
}
```

`GET /api/rider/v1/orders/40266e4b-d8f6-4f38-8c76-b38f19347f0f` → **200**

```json
{
  "id": "40266e4b-d8f6-4f38-8c76-b38f19347f0f",
  "short_number": 8,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "f3cfd485-56b7-4a19-851c-a3bb4624fc3d",
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
    "id": "d0887705-7ce0-4f86-87f2-c2f130a4377c",
    "order_id": "40266e4b-d8f6-4f38-8c76-b38f19347f0f",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "cf7056b7-61c7-422d-adf8-17c549789d68",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T22:35:23.38903Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": {
    "name": "Андрій Шевчук",
    "make": "Hyundai",
    "model": "Sonata",
    "color": "black",
    "registration_number": "AA0003TX",
    "photo_url": null
  },
  "driver_change": null
}
```

`GET /api/rider/v1/orders/40266e4b-d8f6-4f38-8c76-b38f19347f0f` → **200**

```json
{
  "id": "40266e4b-d8f6-4f38-8c76-b38f19347f0f",
  "short_number": 8,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "f3cfd485-56b7-4a19-851c-a3bb4624fc3d",
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
    "id": "d0887705-7ce0-4f86-87f2-c2f130a4377c",
    "order_id": "40266e4b-d8f6-4f38-8c76-b38f19347f0f",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "cf7056b7-61c7-422d-adf8-17c549789d68",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T22:35:23.38903Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": {
    "name": "Андрій Шевчук",
    "make": "Hyundai",
    "model": "Sonata",
    "color": "black",
    "registration_number": "AA0003TX",
    "photo_url": null
  },
  "driver_change": null
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

`GET /api/rider/v1/orders/40266e4b-d8f6-4f38-8c76-b38f19347f0f/tip` → **200**

```json
{
  "order_id": "40266e4b-d8f6-4f38-8c76-b38f19347f0f",
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
  "available_until": "2026-10-31T22:35:32.256658Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/40266e4b-d8f6-4f38-8c76-b38f19347f0f/tip` → **201**

```json
{
  "command_id": "819b62e9-e2a6-43ce-b158-832905cc4c92",
  "amount_minor": 2500
}
```

```json
{
  "id": "118f7a2f-8769-4d52-832c-4d33ff245836",
  "order_id": "40266e4b-d8f6-4f38-8c76-b38f19347f0f",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T22:35:37.42315Z"
}
```

`GET /api/rider/v1/orders/40266e4b-d8f6-4f38-8c76-b38f19347f0f/tip` → **200**

```json
{
  "order_id": "40266e4b-d8f6-4f38-8c76-b38f19347f0f",
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
  "available_until": "2026-10-31T22:35:32.256658Z",
  "open": false,
  "tip": {
    "id": "118f7a2f-8769-4d52-832c-4d33ff245836",
    "order_id": "40266e4b-d8f6-4f38-8c76-b38f19347f0f",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-30T22:35:37.42315Z"
  }
}
```

`GET /api/rider/v1/orders/40266e4b-d8f6-4f38-8c76-b38f19347f0f/tip` → **200**

```json
{
  "order_id": "40266e4b-d8f6-4f38-8c76-b38f19347f0f",
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
  "available_until": "2026-10-31T22:35:32.256658Z",
  "open": false,
  "tip": {
    "id": "118f7a2f-8769-4d52-832c-4d33ff245836",
    "order_id": "40266e4b-d8f6-4f38-8c76-b38f19347f0f",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T22:35:37.42315Z"
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
      "id": "61f1953e-9b00-4a3b-9bb1-5f7b767f3fa7",
      "at": "2026-10-30T22:35:39.217279Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "40266e4b-d8f6-4f38-8c76-b38f19347f0f",
      "counterpart_id": null
    },
    {
      "id": "c1a4731b-40eb-4425-a970-87e3937fb71c",
      "at": "2026-10-30T22:35:33.162838Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "40266e4b-d8f6-4f38-8c76-b38f19347f0f",
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
  "command_id": "d0c0d8e9-b83c-4ecc-9f65-e61e28241bb2",
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
  "id": "2ff3f907-106d-4ba5-b26a-0d82935b0368",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T22:40:39.643129Z",
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
  "session_id": "25a59e2f-7411-4973-97af-3259c57e4517",
  "subject": {
    "type": "STAFF",
    "id": "09fe1c69-c031-458c-a537-a40fa884b9ac"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwOWZlMWM2OS1jMDMxLTQ1OGMtYTUzNy1hNDBmYTg4NGI5YWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDA2NDAsImlhdCI6MTc5MzM5OTc0MCwianRpIjoiYjRhOTViMjctZGE1MC00NDZkLTg5ZWQtZmJlYTEwYjFiZDVjIiwic2lkIjoiMjVhNTllMmYtNzQxMS00OTczLTk3YWYtMzI1OWM1N2U0NTE3In0.ura0MlaNSPQfvfHKKbioKw3MPU3UPPVe35vzK7k9i1A",
  "access_expires_at": "2026-10-30T22:50:40.250059637Z",
  "refresh_token": "iOWK2EvsBWuxl_PT284rO1-vFSjJCOyKQmzGzAgRB3M",
  "refresh_expires_at": "2026-10-31T10:35:40.249485281Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380739198280` → **200**

```json
{
  "client_id": "f3cfd485-56b7-4a19-851c-a3bb4624fc3d"
}
```

`POST /api/admin/v1/rider-wallets/f3cfd485-56b7-4a19-851c-a3bb4624fc3d/top-ups` → **201**

```json
{
  "command_id": "1962cb9d-e3a7-4f0b-84df-9cf4b531a06c",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "f3cfd485-56b7-4a19-851c-a3bb4624fc3d",
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
      "id": "bcdcbd78-d60e-4ca7-b690-c59992163272",
      "at": "2026-10-30T22:35:40.853226Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "09fe1c69-c031-458c-a537-a40fa884b9ac",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "a3b958b0-ae53-4c12-84e3-b8fd4f7024a6",
  "quote_id": "2ff3f907-106d-4ba5-b26a-0d82935b0368",
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
  "id": "bbc3cd55-c166-4cd9-a59a-3e5e1e0310be",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f3cfd485-56b7-4a19-851c-a3bb4624fc3d",
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
  "created_at": "2026-10-30T22:35:41.168509Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

`GET /api/rider/v1/orders/bbc3cd55-c166-4cd9-a59a-3e5e1e0310be` → **200**

```json
{
  "id": "bbc3cd55-c166-4cd9-a59a-3e5e1e0310be",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f3cfd485-56b7-4a19-851c-a3bb4624fc3d",
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
  "created_at": "2026-10-30T22:35:41.168509Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

## Andrii takes it and drives

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "44b0da7c-3cdc-4487-a7c0-b89b9eeef09f",
    "order_id": "bbc3cd55-c166-4cd9-a59a-3e5e1e0310be",
    "expires_at": "2026-10-30T22:35:56.173135Z",
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

`POST /api/driver/v1/offers/44b0da7c-3cdc-4487-a7c0-b89b9eeef09f/accept` → **200**

```json
{
  "command_id": "bdbe9a8f-e902-4102-83f3-fd207c262d5e"
}
```

```json
{
  "id": "889af592-df71-497c-9ec5-e18a09fc8602",
  "order_id": "bbc3cd55-c166-4cd9-a59a-3e5e1e0310be",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "1e7116ab-d403-4d00-8dcc-e02fe8c87d99",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "1e7116ab-d403-4d00-8dcc-e02fe8c87d99",
  "order_id": "bbc3cd55-c166-4cd9-a59a-3e5e1e0310be",
  "assignment_id": "889af592-df71-497c-9ec5-e18a09fc8602",
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

`POST /api/driver/v1/work-sessions/2b6f31a2-c2ad-49df-8202-db8842c72b19/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:35:42Z",
    "sequence": 1793399742700
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "2b6f31a2-c2ad-49df-8202-db8842c72b19",
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
  "last_heartbeat_at": "2026-10-30T22:35:42.720413Z",
  "last_location_at": "2026-10-30T22:35:42.720413Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/1e7116ab-d403-4d00-8dcc-e02fe8c87d99/arrive` → **200**

```json
{
  "command_id": "b8be2ea4-aece-4f66-a3ce-0b0196530869",
  "expected_version": 0
}
```

```json
{
  "id": "1e7116ab-d403-4d00-8dcc-e02fe8c87d99",
  "order_id": "bbc3cd55-c166-4cd9-a59a-3e5e1e0310be",
  "assignment_id": "889af592-df71-497c-9ec5-e18a09fc8602",
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
  "arrived_at": "2026-10-30T22:35:43.019418Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/1e7116ab-d403-4d00-8dcc-e02fe8c87d99/start` → **200**

```json
{
  "command_id": "75f94f62-4869-4551-b797-c7d5fd34adb0",
  "expected_version": 1
}
```

```json
{
  "id": "1e7116ab-d403-4d00-8dcc-e02fe8c87d99",
  "order_id": "bbc3cd55-c166-4cd9-a59a-3e5e1e0310be",
  "assignment_id": "889af592-df71-497c-9ec5-e18a09fc8602",
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
  "arrived_at": "2026-10-30T22:35:43.019418Z",
  "started_at": "2026-10-30T22:35:43.328633Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/1e7116ab-d403-4d00-8dcc-e02fe8c87d99/complete` → **200**

```json
{
  "command_id": "6726dd31-3786-464b-947e-7ee0e538adce",
  "expected_version": 2,
  "reported_at": "2026-10-30T22:35:43Z",
  "cash_received": true
}
```

```json
{
  "id": "1e7116ab-d403-4d00-8dcc-e02fe8c87d99",
  "order_id": "bbc3cd55-c166-4cd9-a59a-3e5e1e0310be",
  "assignment_id": "889af592-df71-497c-9ec5-e18a09fc8602",
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
  "arrived_at": "2026-10-30T22:35:43.019418Z",
  "started_at": "2026-10-30T22:35:43.328633Z",
  "completed_at": "2026-10-30T22:35:43.642443Z",
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
  "client_id": "f3cfd485-56b7-4a19-851c-a3bb4624fc3d",
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
      "id": "bcdcbd78-d60e-4ca7-b690-c59992163272",
      "at": "2026-10-30T22:35:40.853226Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "09fe1c69-c031-458c-a537-a40fa884b9ac",
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
      "balance_minor": 16352,
      "debt_limit_minor": null,
      "blocked": false
    }
  ]
}
```

## The rider tips 15 % on the same card; all of it goes to Andrii

`GET /api/rider/v1/orders/bbc3cd55-c166-4cd9-a59a-3e5e1e0310be/tip` → **200**

```json
{
  "order_id": "bbc3cd55-c166-4cd9-a59a-3e5e1e0310be",
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
  "available_until": "2026-10-31T22:35:43.642443Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/bbc3cd55-c166-4cd9-a59a-3e5e1e0310be/tip` → **201**

```json
{
  "command_id": "8089e019-4946-4f78-9c80-b00848a1aa1c",
  "amount_minor": 2500
}
```

```json
{
  "id": "0bf73658-0373-4f6a-8cfb-a03ded72d316",
  "order_id": "bbc3cd55-c166-4cd9-a59a-3e5e1e0310be",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T22:35:44.860441Z"
}
```

`GET /api/rider/v1/orders/bbc3cd55-c166-4cd9-a59a-3e5e1e0310be/tip` → **200**

```json
{
  "order_id": "bbc3cd55-c166-4cd9-a59a-3e5e1e0310be",
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
  "available_until": "2026-10-31T22:35:43.642443Z",
  "open": false,
  "tip": {
    "id": "0bf73658-0373-4f6a-8cfb-a03ded72d316",
    "order_id": "bbc3cd55-c166-4cd9-a59a-3e5e1e0310be",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-30T22:35:44.860441Z"
  }
}
```

`GET /api/rider/v1/orders/bbc3cd55-c166-4cd9-a59a-3e5e1e0310be/tip` → **200**

```json
{
  "order_id": "bbc3cd55-c166-4cd9-a59a-3e5e1e0310be",
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
  "available_until": "2026-10-31T22:35:43.642443Z",
  "open": false,
  "tip": {
    "id": "0bf73658-0373-4f6a-8cfb-a03ded72d316",
    "order_id": "bbc3cd55-c166-4cd9-a59a-3e5e1e0310be",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T22:35:44.860441Z"
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
      "id": "8092c63e-d9e6-42c6-998c-ac95eae1bf0e",
      "at": "2026-10-30T22:35:46.314484Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "bbc3cd55-c166-4cd9-a59a-3e5e1e0310be",
      "counterpart_id": null
    },
    {
      "id": "fe2e08b9-8570-4a2d-9fc3-280441811db2",
      "at": "2026-10-30T22:35:44.2856Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "bbc3cd55-c166-4cd9-a59a-3e5e1e0310be",
      "counterpart_id": null
    },
    {
      "id": "61f1953e-9b00-4a3b-9bb1-5f7b767f3fa7",
      "at": "2026-10-30T22:35:39.217279Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "40266e4b-d8f6-4f38-8c76-b38f19347f0f",
      "counterpart_id": null
    },
    {
      "id": "c1a4731b-40eb-4425-a970-87e3937fb71c",
      "at": "2026-10-30T22:35:33.162838Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "40266e4b-d8f6-4f38-8c76-b38f19347f0f",
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
  "session_id": "2b6f31a2-c2ad-49df-8202-db8842c72b19",
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
  "last_heartbeat_at": "2026-10-30T22:35:42.720413Z",
  "last_location_at": "2026-10-30T22:35:42.720413Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2b6f31a2-c2ad-49df-8202-db8842c72b19/close` → **200**

```json
{
  "command_id": "a6e43ce6-9b7c-4e3b-8734-781d58931b1b",
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

Done: card order bbc3cd55-c166-4cd9-a59a-3e5e1e0310be.

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
  "phone": "+380738266618",
  "device_ref": "sandbox-6036"
}
```

```json
{
  "challenge_id": "3b741ac5-d272-4ad9-b0b7-3f5e18e2c897",
  "expires_at": "2026-10-30T22:40:48.032675273Z",
  "resend_available_at": "2026-10-30T22:35:49.032675273Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380738266618` → **200**

```json
{
  "phone": "+380738266618",
  "audience": "CLIENT",
  "code": "433187",
  "sent_at": "2026-10-30T22:35:48.035388607Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3b741ac5-d272-4ad9-b0b7-3f5e18e2c897",
  "code": "433187",
  "device_ref": "sandbox-6036"
}
```

```json
{
  "session_id": "8431cdf8-356c-4e8f-8a93-cf28b9c2d99e",
  "subject": {
    "type": "CLIENT",
    "id": "f55efb0b-cc3d-4952-9d6b-5bb43974be71"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNTVlZmIwYi1jYzNkLTQ5NTItOWQ2Yi01YmI0Mzk3NGJlNzEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDAwNjQ4LCJpYXQiOjE3OTMzOTk3NDgsImp0aSI6ImY5NDM4ZjY5LWRiYTgtNGRjOS1hYjJlLTQwYjAwMjFiYjAxOCIsInNpZCI6Ijg0MzFjZGY4LTM1NmMtNGU4Zi04YTkzLWNmMjhiOWMyZDk5ZSJ9.ipnc8b9pfKMnRhUv_bbCwAEVfqw7IuSHSHxZ4juPaqs",
  "access_expires_at": "2026-10-30T22:50:48.349213488Z",
  "refresh_token": "0HxScoDbi8Y-sSuk4tkdStTgFZYJBeEI5cES8YJr8jk",
  "refresh_expires_at": "2026-11-29T22:35:48.34859831Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "722b8f1d-f162-4268-af95-8b201fd8e7b8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "2002a63c-f5aa-4798-ae8e-70a8349363c1",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-2002a63c-f5aa-4798-ae8e-70a8349363c1",
    "orderDate": "1793399748",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "7d32a9b4dd7f57d2e38dd2b6933bf9f2",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=2002a63c-f5aa-4798-ae8e-70a8349363c1",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380738266618"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=2002a63c-f5aa-4798-ae8e-70a8349363c1",
  "created_at": "2026-10-30T22:35:48.643679Z",
  "expires_at": "2026-10-30T23:05:48.643679Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/2002a63c-f5aa-4798-ae8e-70a8349363c1` → **200**

```json
{
  "id": "2002a63c-f5aa-4798-ae8e-70a8349363c1",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T22:35:48.643679Z",
  "expires_at": "2026-10-30T23:05:48.643679Z",
  "completed_at": "2026-10-30T22:35:48.94748Z",
  "masked_pan": "41****9882",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "f55efb0b-cc3d-4952-9d6b-5bb43974be71",
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
  "client_id": "f55efb0b-cc3d-4952-9d6b-5bb43974be71",
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
      "id": "1c5cbdf2-fe30-4272-93c9-a7dd9f4fa2f6",
      "at": "2026-10-30T22:35:49.333285Z",
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
  "client_id": "f55efb0b-cc3d-4952-9d6b-5bb43974be71",
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
      "id": "1c5cbdf2-fe30-4272-93c9-a7dd9f4fa2f6",
      "at": "2026-10-30T22:35:49.333285Z",
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
  "device_ref": "sandbox-3662"
}
```

```json
{
  "challenge_id": "55b96ed7-7fa5-4ba4-a655-913bd41d81c2",
  "expires_at": "2026-10-30T22:40:51.155143715Z",
  "resend_available_at": "2026-10-30T22:35:52.155143715Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "215779",
  "sent_at": "2026-10-30T22:35:51.158095636Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "55b96ed7-7fa5-4ba4-a655-913bd41d81c2",
  "code": "215779",
  "device_ref": "sandbox-3662"
}
```

```json
{
  "session_id": "494e1407-eded-4e0d-ba76-2bd51995e443",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwMDY1MSwiaWF0IjoxNzkzMzk5NzUxLCJqdGkiOiJhY2JmZTBiZi04NTZjLTRiZmItODY2MC1hZTUxNzQyYjllYTQiLCJzaWQiOiI0OTRlMTQwNy1lZGVkLTRlMGQtYmE3Ni0yYmQ1MTk5NWU0NDMifQ.ni8zthDHMYm56Ilips9UkG66GM1pcfjvma5pN35Q8t8",
  "access_expires_at": "2026-10-30T22:50:51.473239978Z",
  "refresh_token": "QePgtvNfu42dp71qhgAKa9ayYn-hyYNhAbhey7PfMoI",
  "refresh_expires_at": "2026-11-29T22:35:51.472663828Z",
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
  "command_id": "4ac3a84e-cc73-4268-888b-d8ff54b16693",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "0871ed02-4c5a-4e4a-a95a-445d718d472e",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-0871ed02-4c5a-4e4a-a95a-445d718d472e",
    "orderDate": "1793399752",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "310c9ed8a810fc8cae558f5fac995e78",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=0871ed02-4c5a-4e4a-a95a-445d718d472e",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=0871ed02-4c5a-4e4a-a95a-445d718d472e",
  "created_at": "2026-10-30T22:35:52.05745Z",
  "expires_at": "2026-10-30T23:05:52.05745Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/0871ed02-4c5a-4e4a-a95a-445d718d472e` → **200**

```json
{
  "id": "0871ed02-4c5a-4e4a-a95a-445d718d472e",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T22:35:52.05745Z",
  "expires_at": "2026-10-30T23:05:52.05745Z",
  "completed_at": "2026-10-30T22:35:52.351848Z",
  "masked_pan": "41****4698",
  "failure_reason": null
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
      "id": "8fac46e5-8611-4cd4-9703-041b8ea614fb",
      "at": "2026-10-30T22:35:53.345021Z",
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
  "command_id": "045e061d-596c-48b2-a56c-fcf4554fa647",
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
  "correlation_id": "019bdd63-6e12-45d7-a370-b5c0ef599e47"
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
  "device_ref": "sandbox-25277"
}
```

```json
{
  "challenge_id": "79f98866-881d-4339-8262-695708b849a1",
  "expires_at": "2026-10-30T22:40:54.59082816Z",
  "resend_available_at": "2026-10-30T22:35:55.59082816Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "074965",
  "sent_at": "2026-10-30T22:35:54.593711988Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "79f98866-881d-4339-8262-695708b849a1",
  "code": "074965",
  "device_ref": "sandbox-25277"
}
```

```json
{
  "session_id": "8fba7c83-ab3b-4ea1-a2df-784d71c24db6",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwMDY1NCwiaWF0IjoxNzkzMzk5NzU0LCJqdGkiOiIxNDFjYTMyNS0yYTM0LTRhNTYtYjUyYS00ZjE2NjkyMmUxYTgiLCJzaWQiOiI4ZmJhN2M4My1hYjNiLTRlYTEtYTJkZi03ODRkNzFjMjRkYjYifQ.BnRZvJ25kmf4L_ZYDzhV0tEjKZI2_0VxUmq2FBLKf0Y",
  "access_expires_at": "2026-10-30T22:50:54.906416605Z",
  "refresh_token": "4ay30-astvuSc03wJftoqQvV84N4PM8rDHB1-1evHKc",
  "refresh_expires_at": "2026-11-29T22:35:54.905844583Z",
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
  "command_id": "102f4e67-9c4f-4d25-a4b9-a4c4dc94f070",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:35:55Z",
    "sequence": 1793399755501
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "30deb88f-465a-4632-bfc2-7174a4d9d6ea",
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
  "last_heartbeat_at": "2026-10-30T22:35:55.520034Z",
  "last_location_at": "2026-10-30T22:35:55.520034Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A rider orders for cash

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639284073",
  "device_ref": "sandbox-19725"
}
```

```json
{
  "challenge_id": "074dcb19-bc2a-4fe1-a040-378187cb7de3",
  "expires_at": "2026-10-30T22:40:55.82714737Z",
  "resend_available_at": "2026-10-30T22:35:56.82714737Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639284073` → **200**

```json
{
  "phone": "+380639284073",
  "audience": "CLIENT",
  "code": "110044",
  "sent_at": "2026-10-30T22:35:55.829739566Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "074dcb19-bc2a-4fe1-a040-378187cb7de3",
  "code": "110044",
  "device_ref": "sandbox-19725"
}
```

```json
{
  "session_id": "3d2a35d5-eb3e-44c3-9103-e20fca0f70da",
  "subject": {
    "type": "CLIENT",
    "id": "8286a150-97cb-459a-8b3b-e5c263bf72ab"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Mjg2YTE1MC05N2NiLTQ1OWEtOGIzYi1lNWMyNjNiZjcyYWIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDAwNjU2LCJpYXQiOjE3OTMzOTk3NTYsImp0aSI6IjFmZWY5NjVhLWJkZjktNGI3NC1hOGQ3LThhYTcxODhiNmJiNSIsInNpZCI6IjNkMmEzNWQ1LWViM2UtNDRjMy05MTAzLWUyMGZjYTBmNzBkYSJ9.4mxUjUFubmYZhy1G-mz8LTVycoXiLNEqW_Wabg4DFEM",
  "access_expires_at": "2026-10-30T22:50:56.153227727Z",
  "refresh_token": "RL7Mg4fOL4t0HgLFW0AS4MTVkm1nmA1ndiAg3DUXYWU",
  "refresh_expires_at": "2026-11-29T22:35:56.152652034Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "5289cb05-5499-4f52-bb1d-f47c36a1d0b5",
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
  "id": "deb44976-1190-4d29-93bf-e279aa622ce6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T22:40:56.447790Z",
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
  "command_id": "9191298e-a530-4c16-afc1-226f9bd2eb4a",
  "quote_id": "deb44976-1190-4d29-93bf-e279aa622ce6",
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
  "id": "10d1b81b-1c0a-4f72-8c0a-626e79b8c474",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8286a150-97cb-459a-8b3b-e5c263bf72ab",
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
  "created_at": "2026-10-30T22:35:56.751067Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

## Ivan drives; at the end the rider has no money and leaves

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "1fbd7d5c-e68a-4823-9bae-bea037ce444a",
    "order_id": "10d1b81b-1c0a-4f72-8c0a-626e79b8c474",
    "expires_at": "2026-10-30T22:36:11.754259Z",
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

`POST /api/driver/v1/offers/1fbd7d5c-e68a-4823-9bae-bea037ce444a/accept` → **200**

```json
{
  "command_id": "ac6ce85b-9579-42d4-978c-e5f387e8b57c"
}
```

```json
{
  "id": "dc41e2ea-f7eb-4b75-b79b-b86ffdbafa4f",
  "order_id": "10d1b81b-1c0a-4f72-8c0a-626e79b8c474",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e9f388d5-5dd1-4bbb-8672-6427dc963124",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e9f388d5-5dd1-4bbb-8672-6427dc963124",
  "order_id": "10d1b81b-1c0a-4f72-8c0a-626e79b8c474",
  "assignment_id": "dc41e2ea-f7eb-4b75-b79b-b86ffdbafa4f",
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

`POST /api/driver/v1/work-sessions/30deb88f-465a-4632-bfc2-7174a4d9d6ea/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:35:57Z",
    "sequence": 1793399757951
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "30deb88f-465a-4632-bfc2-7174a4d9d6ea",
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
  "last_heartbeat_at": "2026-10-30T22:35:57.970786Z",
  "last_location_at": "2026-10-30T22:35:57.970786Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/e9f388d5-5dd1-4bbb-8672-6427dc963124/arrive` → **200**

```json
{
  "command_id": "08a6333d-283f-484a-8088-50249b97c4ee",
  "expected_version": 0
}
```

```json
{
  "id": "e9f388d5-5dd1-4bbb-8672-6427dc963124",
  "order_id": "10d1b81b-1c0a-4f72-8c0a-626e79b8c474",
  "assignment_id": "dc41e2ea-f7eb-4b75-b79b-b86ffdbafa4f",
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
  "arrived_at": "2026-10-30T22:35:58.279472Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/e9f388d5-5dd1-4bbb-8672-6427dc963124/start` → **200**

```json
{
  "command_id": "b6f31c8f-c457-4781-8bce-b6843109f265",
  "expected_version": 1
}
```

```json
{
  "id": "e9f388d5-5dd1-4bbb-8672-6427dc963124",
  "order_id": "10d1b81b-1c0a-4f72-8c0a-626e79b8c474",
  "assignment_id": "dc41e2ea-f7eb-4b75-b79b-b86ffdbafa4f",
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
  "arrived_at": "2026-10-30T22:35:58.279472Z",
  "started_at": "2026-10-30T22:35:58.593994Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/e9f388d5-5dd1-4bbb-8672-6427dc963124/complete` → **200**

```json
{
  "command_id": "0ed7483f-8384-49d0-8c58-13b6d10e09f8",
  "expected_version": 2,
  "reported_at": "2026-10-30T22:35:58Z",
  "cash_received": false
}
```

```json
{
  "id": "e9f388d5-5dd1-4bbb-8672-6427dc963124",
  "order_id": "10d1b81b-1c0a-4f72-8c0a-626e79b8c474",
  "assignment_id": "dc41e2ea-f7eb-4b75-b79b-b86ffdbafa4f",
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
  "arrived_at": "2026-10-30T22:35:58.279472Z",
  "started_at": "2026-10-30T22:35:58.593994Z",
  "completed_at": "2026-10-30T22:35:58.902907Z",
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
  "session_id": "c3f92791-67ce-403a-b4eb-8f9f457516ba",
  "subject": {
    "type": "STAFF",
    "id": "09fe1c69-c031-458c-a537-a40fa884b9ac"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwOWZlMWM2OS1jMDMxLTQ1OGMtYTUzNy1hNDBmYTg4NGI5YWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDA2NTksImlhdCI6MTc5MzM5OTc1OSwianRpIjoiYzU1M2FiNzYtMzkxMS00ZDRjLWE4MjMtMGJhMTkzZGM1YTQ2Iiwic2lkIjoiYzNmOTI3OTEtNjdjZS00MDNhLWI0ZWItOGY5ZjQ1NzUxNmJhIn0.6er1S2QqfCWAGUxeQ00C6CDm1bmELxaYAfqi-uNX8SA",
  "access_expires_at": "2026-10-30T22:50:59.491358399Z",
  "refresh_token": "Q9GysQSeQyn0R7TDCr-I_ty_gxQ3xYz9OQcjmN2yMVk",
  "refresh_expires_at": "2026-10-31T10:35:59.490762593Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/10d1b81b-1c0a-4f72-8c0a-626e79b8c474/cash-dispute` → **200**

```json
{
  "order_id": "10d1b81b-1c0a-4f72-8c0a-626e79b8c474",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "8286a150-97cb-459a-8b3b-e5c263bf72ab",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T22:35:59.393303Z",
  "decide_by": "2026-11-13T22:35:59.393303Z",
  "decision": null,
  "decided_by": null,
  "reason": null,
  "decided_at": null,
  "version": 1
}
```

Dispute: {"held_minor":0,"rider_debt_minor":10517,"decide_by":"2026-11-13T22:35:59.393303Z","decision":null}

`GET /api/admin/v1/cash-disputes` → **200**

```json
{
  "disputes": [
    {
      "order_id": "10d1b81b-1c0a-4f72-8c0a-626e79b8c474",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "payer_client_id": "8286a150-97cb-459a-8b3b-e5c263bf72ab",
      "currency": "UAH",
      "held_minor": 0,
      "rider_debt_minor": 10517,
      "opened_at": "2026-10-30T22:35:59.393303Z",
      "decide_by": "2026-11-13T22:35:59.393303Z",
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

`POST /api/admin/v1/orders/10d1b81b-1c0a-4f72-8c0a-626e79b8c474/cash-dispute/decide` → **400**

```json
{
  "command_id": "9311f294-fd57-4a6f-bbe8-0167e3e83f0f",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/orders/10d1b81b-1c0a-4f72-8c0a-626e79b8c474/cash-dispute/decide",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "95310661-3314-4642-8c43-51be6d82499c",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/orders/10d1b81b-1c0a-4f72-8c0a-626e79b8c474/cash-dispute/decide` → **200**

```json
{
  "command_id": "db7fb5ff-e5ee-4c4c-870d-0a6c87cc3188",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": "The rider does not answer calls"
}
```

```json
{
  "order_id": "10d1b81b-1c0a-4f72-8c0a-626e79b8c474",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "8286a150-97cb-459a-8b3b-e5c263bf72ab",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T22:35:59.393303Z",
  "decide_by": "2026-11-13T22:35:59.393303Z",
  "decision": "PAY_DRIVER",
  "decided_by": "09fe1c69-c031-458c-a537-a40fa884b9ac",
  "reason": "The rider does not answer calls",
  "decided_at": "2026-10-30T22:36:00.719999Z",
  "version": 2
}
```

`POST /api/admin/v1/orders/10d1b81b-1c0a-4f72-8c0a-626e79b8c474/cash-dispute/decide` → **409**

```json
{
  "command_id": "289f7bd7-09aa-4ea7-9bf5-590c23774a81",
  "expected_version": 2,
  "decision": "RIDER_PAID",
  "reason": "Again"
}
```

```json
{
  "instance": "/api/admin/v1/orders/10d1b81b-1c0a-4f72-8c0a-626e79b8c474/cash-dispute/decide",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "3746306a-9eb7-4574-89e6-1dfc5457a512"
}
```

Done: an unpaid cash trip became a dispute and was decided once.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "30deb88f-465a-4632-bfc2-7174a4d9d6ea",
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
  "last_heartbeat_at": "2026-10-30T22:35:57.970786Z",
  "last_location_at": "2026-10-30T22:35:57.970786Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/30deb88f-465a-4632-bfc2-7174a4d9d6ea/close` → **200**

```json
{
  "command_id": "53d2b772-67b4-4942-884e-e4066d0607e1",
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
  "phone": "+380730342526",
  "device_ref": "sandbox-15086"
}
```

```json
{
  "challenge_id": "6377c44c-2a34-431a-b91f-832f0e1bec3b",
  "expires_at": "2026-10-30T22:41:01.931725813Z",
  "resend_available_at": "2026-10-30T22:36:02.931725813Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380730342526` → **200**

```json
{
  "phone": "+380730342526",
  "audience": "CLIENT",
  "code": "581008",
  "sent_at": "2026-10-30T22:36:01.934617109Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6377c44c-2a34-431a-b91f-832f0e1bec3b",
  "code": "581008",
  "device_ref": "sandbox-15086"
}
```

```json
{
  "session_id": "8062f824-6c39-489b-8305-836cd33f1972",
  "subject": {
    "type": "CLIENT",
    "id": "d05ae55f-cfe4-4ba8-bfd5-2ed49ed4aca1"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMDVhZTU1Zi1jZmU0LTRiYTgtYmZkNS0yZWQ0OWVkNGFjYTEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDAwNjYyLCJpYXQiOjE3OTMzOTk3NjIsImp0aSI6ImVkNDBmZmIyLWUxMGUtNDI3MC05MjQxLWY0ZWQ1YjY0NGMwZiIsInNpZCI6IjgwNjJmODI0LTZjMzktNDg5Yi04MzA1LTgzNmNkMzNmMTk3MiJ9.58welC-yoIzZ9kegdHNKHJji8kxcWdV7L0omxqF9xCA",
  "access_expires_at": "2026-10-30T22:51:02.254620679Z",
  "refresh_token": "4kFqiJd0-2fcW29CTlnXWKu1tzKm7uP5gS5Alwjt63M",
  "refresh_expires_at": "2026-11-29T22:36:02.254099733Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "1c462aa9-bae0-48fb-bc2d-c2615ffed0cd",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "f95dbe7e-f7b2-4c80-afd7-14917f1ff69f",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-f95dbe7e-f7b2-4c80-afd7-14917f1ff69f",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "0b17b6806b776d791a50a8ff2e4d3879",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=f95dbe7e-f7b2-4c80-afd7-14917f1ff69f",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380730342526"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=f95dbe7e-f7b2-4c80-afd7-14917f1ff69f",
  "expires_at": "2026-10-30T23:06:02.545374Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/f95dbe7e-f7b2-4c80-afd7-14917f1ff69f` → **200**

```json
{
  "id": "f95dbe7e-f7b2-4c80-afd7-14917f1ff69f",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T23:06:02.545374Z",
  "card": {
    "id": "997da6f4-e753-4120-964c-53cfd9004282",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****5930",
    "card_type": "Visa",
    "created_at": "2026-10-30T22:36:02.841593Z"
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
  "device_ref": "sandbox-23816"
}
```

```json
{
  "challenge_id": "85960d1e-f216-48f9-a163-3d7879b08c5c",
  "expires_at": "2026-10-30T22:41:03.149208508Z",
  "resend_available_at": "2026-10-30T22:36:04.149208508Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "596924",
  "sent_at": "2026-10-30T22:36:03.151836952Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "85960d1e-f216-48f9-a163-3d7879b08c5c",
  "code": "596924",
  "device_ref": "sandbox-23816"
}
```

```json
{
  "session_id": "d743a832-00cc-46f8-a916-52288a0dc18f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwMDY2MywiaWF0IjoxNzkzMzk5NzYzLCJqdGkiOiIyZWQ4MGJiYi03MzMzLTQ4ZmQtYjU1ZC1lNzc1MTE3NjMyYjQiLCJzaWQiOiJkNzQzYTgzMi0wMGNjLTQ2ZjgtYTkxNi01MjI4OGEwZGMxOGYifQ.KQeBLzzF1DI5Q_4jTCe4vwbbRlmx45zKo7tkUsclq2o",
  "access_expires_at": "2026-10-30T22:51:03.468339225Z",
  "refresh_token": "44EXAREOzIVOgDl8TTA13bpmvrMkfsn-RQC44R5t-as",
  "refresh_expires_at": "2026-11-29T22:36:03.46777063Z",
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
  "command_id": "67835afc-275f-4574-acfe-f8e5c6b2cbff",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:36:04Z",
    "sequence": 1793399764670
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "4e5000b7-caac-4574-ab25-873e07b3b8db",
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
  "last_heartbeat_at": "2026-10-30T22:36:04.086445Z",
  "last_location_at": "2026-10-30T22:36:04.086445Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A card ride; on the way both write numbers into the chat

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "9a94a93b-42e0-4e58-8d9b-eaefdb653e54",
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
  "id": "c35dbc10-8866-4b85-adac-a63aa7de851e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T22:41:04.399359Z",
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
  "command_id": "a08e8004-d98e-4f3f-b1fe-89a3ab0d42b5",
  "quote_id": "c35dbc10-8866-4b85-adac-a63aa7de851e",
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
  "id": "665ac4a5-b514-488e-825f-18feb84f664e",
  "short_number": 11,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "d05ae55f-cfe4-4ba8-bfd5-2ed49ed4aca1",
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
  "created_at": "2026-10-30T22:36:04.712676Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

`GET /api/rider/v1/orders/665ac4a5-b514-488e-825f-18feb84f664e` → **200**

```json
{
  "id": "665ac4a5-b514-488e-825f-18feb84f664e",
  "short_number": 11,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "d05ae55f-cfe4-4ba8-bfd5-2ed49ed4aca1",
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
  "created_at": "2026-10-30T22:36:04.712676Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

`GET /api/rider/v1/orders/665ac4a5-b514-488e-825f-18feb84f664e` → **200**

```json
{
  "id": "665ac4a5-b514-488e-825f-18feb84f664e",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "d05ae55f-cfe4-4ba8-bfd5-2ed49ed4aca1",
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
  "created_at": "2026-10-30T22:36:04.712676Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "0c13b5c2-d247-4cc0-be02-e905ccf19281",
    "order_id": "665ac4a5-b514-488e-825f-18feb84f664e",
    "expires_at": "2026-10-30T22:36:20.431221Z",
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

`POST /api/driver/v1/offers/0c13b5c2-d247-4cc0-be02-e905ccf19281/accept` → **200**

```json
{
  "command_id": "7633202d-3e9a-48ec-b13d-f4fc26068049"
}
```

```json
{
  "id": "0b4eab88-7d75-4c93-9c34-3f9df188bfba",
  "order_id": "665ac4a5-b514-488e-825f-18feb84f664e",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "9a770882-e1ff-4802-9075-3577adc28d52",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9a770882-e1ff-4802-9075-3577adc28d52",
  "order_id": "665ac4a5-b514-488e-825f-18feb84f664e",
  "assignment_id": "0b4eab88-7d75-4c93-9c34-3f9df188bfba",
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

`POST /api/rider/v1/orders/665ac4a5-b514-488e-825f-18feb84f664e/messages` → **201**

```json
{
  "command_id": "34485653-4cf9-4788-a371-1b05dc1fbf28",
  "body": "Я біля входу, мій номер +380730342526, картка 4111 1111 1111 1111"
}
```

```json
{
  "id": "fad110ba-4a34-4cd6-8dab-0160c5ec12f7",
  "order_id": "665ac4a5-b514-488e-825f-18feb84f664e",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу, мій номер +380730342526, картка 4111 1111 1111 1111",
  "sent_at": "2026-10-30T22:36:07.563376323Z"
}
```

`POST /api/driver/v1/trips/9a770882-e1ff-4802-9075-3577adc28d52/messages` → **201**

```json
{
  "command_id": "8e42dc26-5851-4558-9080-d2fffd8f93ff",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03"
}
```

```json
{
  "id": "8e182b92-f24a-4620-97b5-75e1cccd4dac",
  "order_id": "665ac4a5-b514-488e-825f-18feb84f664e",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03",
  "sent_at": "2026-10-30T22:36:07.868951657Z"
}
```

(the car drives 5 s to the next point)

`POST /api/driver/v1/work-sessions/4e5000b7-caac-4574-ab25-873e07b3b8db/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:36:13Z",
    "sequence": 1793399773188
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "4e5000b7-caac-4574-ab25-873e07b3b8db",
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
  "last_heartbeat_at": "2026-10-30T22:36:13.208717Z",
  "last_location_at": "2026-10-30T22:36:13.208717Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/9a770882-e1ff-4802-9075-3577adc28d52/arrive` → **200**

```json
{
  "command_id": "01c5eb0e-0f55-4921-b9cb-748f5be8a973",
  "expected_version": 0
}
```

```json
{
  "id": "9a770882-e1ff-4802-9075-3577adc28d52",
  "order_id": "665ac4a5-b514-488e-825f-18feb84f664e",
  "assignment_id": "0b4eab88-7d75-4c93-9c34-3f9df188bfba",
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
  "arrived_at": "2026-10-30T22:36:13.509544Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/9a770882-e1ff-4802-9075-3577adc28d52/start` → **200**

```json
{
  "command_id": "b0f2298b-1def-4671-8123-4e4939c22b4a",
  "expected_version": 1
}
```

```json
{
  "id": "9a770882-e1ff-4802-9075-3577adc28d52",
  "order_id": "665ac4a5-b514-488e-825f-18feb84f664e",
  "assignment_id": "0b4eab88-7d75-4c93-9c34-3f9df188bfba",
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
  "arrived_at": "2026-10-30T22:36:13.509544Z",
  "started_at": "2026-10-30T22:36:13.815888Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

(the car drives 90 s to the next point)

`POST /api/driver/v1/work-sessions/4e5000b7-caac-4574-ab25-873e07b3b8db/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4584,
    "lon": 30.4300,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:37:44Z",
    "sequence": 1793399864141
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "4e5000b7-caac-4574-ab25-873e07b3b8db",
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
  "last_heartbeat_at": "2026-10-30T22:37:44.160614Z",
  "last_location_at": "2026-10-30T22:37:44.160614Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/9a770882-e1ff-4802-9075-3577adc28d52/complete` → **200**

```json
{
  "command_id": "ef424ef6-2ba0-4219-9ef1-b22cfd63ce03",
  "expected_version": 2,
  "reported_at": "2026-10-30T22:37:44Z",
  "cash_received": false
}
```

```json
{
  "id": "9a770882-e1ff-4802-9075-3577adc28d52",
  "order_id": "665ac4a5-b514-488e-825f-18feb84f664e",
  "assignment_id": "0b4eab88-7d75-4c93-9c34-3f9df188bfba",
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
  "arrived_at": "2026-10-30T22:36:13.509544Z",
  "started_at": "2026-10-30T22:36:13.815888Z",
  "completed_at": "2026-10-30T22:37:44.462716Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/rider/v1/orders/665ac4a5-b514-488e-825f-18feb84f664e` → **200**

```json
{
  "id": "665ac4a5-b514-488e-825f-18feb84f664e",
  "short_number": 11,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "d05ae55f-cfe4-4ba8-bfd5-2ed49ed4aca1",
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
    "id": "0b4eab88-7d75-4c93-9c34-3f9df188bfba",
    "order_id": "665ac4a5-b514-488e-825f-18feb84f664e",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "9a770882-e1ff-4802-9075-3577adc28d52",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T22:36:04.712676Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": {
    "name": "Андрій Шевчук",
    "make": "Hyundai",
    "model": "Sonata",
    "color": "black",
    "registration_number": "AA0003TX",
    "photo_url": null
  },
  "driver_change": null
}
```

`GET /api/rider/v1/orders/665ac4a5-b514-488e-825f-18feb84f664e` → **200**

```json
{
  "id": "665ac4a5-b514-488e-825f-18feb84f664e",
  "short_number": 11,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "d05ae55f-cfe4-4ba8-bfd5-2ed49ed4aca1",
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
    "id": "0b4eab88-7d75-4c93-9c34-3f9df188bfba",
    "order_id": "665ac4a5-b514-488e-825f-18feb84f664e",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "9a770882-e1ff-4802-9075-3577adc28d52",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T22:36:04.712676Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": {
    "name": "Андрій Шевчук",
    "make": "Hyundai",
    "model": "Sonata",
    "color": "black",
    "registration_number": "AA0003TX",
    "photo_url": null
  },
  "driver_change": null
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "4e5000b7-caac-4574-ab25-873e07b3b8db",
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
  "last_heartbeat_at": "2026-10-30T22:37:44.160614Z",
  "last_location_at": "2026-10-30T22:37:44.160614Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/4e5000b7-caac-4574-ab25-873e07b3b8db/close` → **200**

```json
{
  "command_id": "aba46958-6428-4a52-9d9c-c92223b89fc9",
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
  "session_id": "9447406b-e365-475f-993a-8e79a56b6afa",
  "subject": {
    "type": "STAFF",
    "id": "09fe1c69-c031-458c-a537-a40fa884b9ac"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwOWZlMWM2OS1jMDMxLTQ1OGMtYTUzNy1hNDBmYTg4NGI5YWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDA3NjcsImlhdCI6MTc5MzM5OTg2NywianRpIjoiNDU0Mjc0NjktN2ZiYi00Y2Q5LTk0MDItYTBiZWZkOTRhMDRmIiwic2lkIjoiOTQ0NzQwNmItZTM2NS00NzVmLTk5M2EtOGU3OWE1NmI2YWZhIn0.GaUzlGw9TJGNaSaxjH0pPYpi2pEC_PqRe15WqTM1AVc",
  "access_expires_at": "2026-10-30T22:52:47.319803489Z",
  "refresh_token": "-uaCzvjh5bGlWLU92L12SukfCtX1bBtKfV2Fqirnxro",
  "refresh_expires_at": "2026-10-31T10:37:47.319260603Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/665ac4a5-b514-488e-825f-18feb84f664e/evidence` → **400**

```json
{
  "instance": "/api/admin/v1/orders/665ac4a5-b514-488e-825f-18feb84f664e/evidence",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "4f1d039f-245a-47a5-b8fb-5bd55826c1f9"
}
```

`GET /api/admin/v1/orders/665ac4a5-b514-488e-825f-18feb84f664e/evidence?reason=Bank%20request%20sandbox` → **200**

```json
{
  "generated_at": "2026-10-30T22:37:47.915091724Z",
  "order": {
    "id": "665ac4a5-b514-488e-825f-18feb84f664e",
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
    "created_at": "2026-10-30T22:36:04.712676Z",
    "assigned_at": "2026-10-30T22:36:06.97437Z",
    "arrived_at": "2026-10-30T22:36:13.509544Z",
    "started_at": "2026-10-30T22:36:13.815888Z",
    "completed_at": "2026-10-30T22:37:44.462716Z"
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
    "id": "d05ae55f-cfe4-4ba8-bfd5-2ed49ed4aca1",
    "registered_at": "2026-10-30T22:36:02.252376Z",
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
      "created_at": "2026-10-30T22:36:04.714766Z"
    },
    {
      "type": "SETTLE",
      "state": "SUCCEEDED",
      "amount_minor": 16297,
      "currency": "UAH",
      "provider_status": "Approved",
      "created_at": "2026-10-30T22:37:44.618621Z"
    }
  ],
  "chat": [
    {
```

## Finance records the chargeback: the rider owes the fare again, a case opens

`POST /api/admin/v1/orders/665ac4a5-b514-488e-825f-18feb84f664e/chargebacks` → **422**

```json
{
  "command_id": "300731de-62e5-428b-b505-8c09590b70ca",
  "amount_minor": 16298,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "instance": "/api/admin/v1/orders/665ac4a5-b514-488e-825f-18feb84f664e/chargebacks",
  "status": 422,
  "title": "Chargeback not allowed",
  "type": "https://errors.blizz.taxi/chargeback-not-allowed",
  "code": "CHARGEBACK_NOT_ALLOWED",
  "correlation_id": "ede6e3a1-d1a8-45b5-a405-906215e71f7f"
}
```

`POST /api/admin/v1/orders/665ac4a5-b514-488e-825f-18feb84f664e/chargebacks` → **201**

```json
{
  "command_id": "5fee8590-3913-4480-8813-56b8cc39d950",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "id": "687c0e8a-08da-4d89-898b-41c1bd149819",
  "order_id": "665ac4a5-b514-488e-825f-18feb84f664e",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-30T22:37:48.598776Z",
  "resolved_at": null,
  "version": 0
}
```

`POST /api/admin/v1/orders/665ac4a5-b514-488e-825f-18feb84f664e/chargebacks` → **201**

```json
{
  "command_id": "5fee8590-3913-4480-8813-56b8cc39d950",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "id": "687c0e8a-08da-4d89-898b-41c1bd149819",
  "order_id": "665ac4a5-b514-488e-825f-18feb84f664e",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-30T22:37:48.598776Z",
  "resolved_at": null,
  "version": 0
}
```

`GET /api/admin/v1/clients/d05ae55f-cfe4-4ba8-bfd5-2ed49ed4aca1` → **200**

```json
{
  "client": {
    "id": "d05ae55f-cfe4-4ba8-bfd5-2ed49ed4aca1",
    "phone": "+380730342526",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T22:36:02.252376Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "665ac4a5-b514-488e-825f-18feb84f664e",
      "short_number": 11,
      "status": "FULFILLED",
      "created_at": "2026-10-30T22:36:04.712676Z",
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

`POST /api/admin/v1/orders/665ac4a5-b514-488e-825f-18feb84f664e/chargebacks/687c0e8a-08da-4d89-898b-41c1bd149819/resolve` → **200**

```json
{
  "command_id": "6d55260f-d113-4578-a0f5-47385273df89",
  "expected_version": 0,
  "outcome": "WON",
  "reason": "Evidence accepted"
}
```

```json
{
  "id": "687c0e8a-08da-4d89-898b-41c1bd149819",
  "order_id": "665ac4a5-b514-488e-825f-18feb84f664e",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "WON",
  "resolution_reason": "Evidence accepted",
  "created_at": "2026-10-30T22:37:48.598776Z",
  "resolved_at": "2026-10-30T22:37:49.546592Z",
  "version": 1
}
```

`GET /api/admin/v1/clients/d05ae55f-cfe4-4ba8-bfd5-2ed49ed4aca1` → **200**

```json
{
  "client": {
    "id": "d05ae55f-cfe4-4ba8-bfd5-2ed49ed4aca1",
    "phone": "+380730342526",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T22:36:02.252376Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "665ac4a5-b514-488e-825f-18feb84f664e",
      "short_number": 11,
      "status": "FULFILLED",
      "created_at": "2026-10-30T22:36:04.712676Z",
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

`POST /api/admin/v1/orders/665ac4a5-b514-488e-825f-18feb84f664e/chargebacks/687c0e8a-08da-4d89-898b-41c1bd149819/resolve` → **409**

```json
{
  "command_id": "28da9b24-f6a7-4d0c-b3e0-8c68059ba7cb",
  "expected_version": 1,
  "outcome": "LOST",
  "reason": "Twice"
}
```

```json
{
  "instance": "/api/admin/v1/orders/665ac4a5-b514-488e-825f-18feb84f664e/chargebacks/687c0e8a-08da-4d89-898b-41c1bd149819/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "5429a2cf-dbf1-4a12-899b-06b5cf03cdb1"
}
```

`GET /api/admin/v1/orders/665ac4a5-b514-488e-825f-18feb84f664e/chargebacks` → **200**

```json
{
  "chargebacks": [
    {
      "id": "687c0e8a-08da-4d89-898b-41c1bd149819",
      "order_id": "665ac4a5-b514-488e-825f-18feb84f664e",
      "amount_minor": 16297,
      "currency": "UAH",
      "bank_reason": "4837 No cardholder authorization",
      "received_on": "2026-10-29",
      "state": "WON",
      "resolution_reason": "Evidence accepted",
      "created_at": "2026-10-30T22:37:48.598776Z",
      "resolved_at": "2026-10-30T22:37:49.546592Z",
      "version": 1
    }
  ]
}
```

Done: the evidence of card order 665ac4a5-b514-488e-825f-18feb84f664e without phone or card digits; chargeback 687c0e8a-08da-4d89-898b-41c1bd149819 recorded and won.

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
  "session_id": "3233c1fc-487b-4a61-85e1-9dc020bbc443",
  "subject": {
    "type": "STAFF",
    "id": "09fe1c69-c031-458c-a537-a40fa884b9ac"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwOWZlMWM2OS1jMDMxLTQ1OGMtYTUzNy1hNDBmYTg4NGI5YWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDA3NzEsImlhdCI6MTc5MzM5OTg3MSwianRpIjoiNTQzODcxMTktZjgyZS00ZGJjLTk1NmYtMzI0MjlmMWY5YmYwIiwic2lkIjoiMzIzM2MxZmMtNDg3Yi00YTYxLTg1ZTEtOWRjMDIwYmJjNDQzIn0.zL3gp4g8X5LveQps3T3bgpHPkqSq9-5xcDnxgZ-WCCo",
  "access_expires_at": "2026-10-30T22:52:51.371476898Z",
  "refresh_token": "ju3AL1VQgIqepmXEOQyTfhNZAtRK-9UDZ8wJaT_LkD0",
  "refresh_expires_at": "2026-10-31T10:37:51.370834505Z",
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
  "phone": "+48600762874",
  "device_ref": "sandbox-30951"
}
```

```json
{
  "challenge_id": "32504bf9-7f79-47ae-8178-df1980e4e33d",
  "expires_at": "2026-10-30T22:42:52.296081464Z",
  "resend_available_at": "2026-10-30T22:37:53.296081464Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600762874` → **200**

```json
{
  "phone": "+48600762874",
  "audience": "CLIENT",
  "code": "767839",
  "sent_at": "2026-10-30T22:37:52.298779019Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "32504bf9-7f79-47ae-8178-df1980e4e33d",
  "code": "767839",
  "device_ref": "sandbox-30951"
}
```

```json
{
  "session_id": "d1fd8e13-b73e-427c-838e-059b397db6fc",
  "subject": {
    "type": "CLIENT",
    "id": "1f49a5dd-8c2e-4745-88e7-2da058456152"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZjQ5YTVkZC04YzJlLTQ3NDUtODhlNy0yZGEwNTg0NTYxNTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDAwNzcyLCJpYXQiOjE3OTMzOTk4NzIsImp0aSI6IjM5N2E5OThkLTZkMGQtNDhjNC04NzQ0LTZlODYzMWQ5OGJkNiIsInNpZCI6ImQxZmQ4ZTEzLWI3M2UtNDI3Yy04MzhlLTA1OWIzOTdkYjZmYyJ9.UckZ65e1kMkdYly3icqjINyYvNlnZd-_m20I9YltHKI",
  "access_expires_at": "2026-10-30T22:52:52.611107905Z",
  "refresh_token": "5hQuANcmxpV5MVY-e5MGaWh6QJhKnk1O6qWnO5atVeo",
  "refresh_expires_at": "2026-11-29T22:37:52.610473337Z",
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
  "command_id": "9e1c8366-4429-4e9c-9116-17c9b3138a1d",
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
  "correlation_id": "2302f264-fb8d-436d-8ff7-81797d2794ce",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
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
  "command_id": "0eb73d69-d2cb-46ba-94e5-b19b5ab05e18",
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
  "paused_at": "2026-10-30T22:37:53.777992232Z",
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
  "command_id": "5a120687-4319-4b18-b7ca-d949da4e7ae4",
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
  "id": "ee8a79d0-b9d7-48ee-9496-14573ecdff97",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T22:42:54.384318Z",
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
  "command_id": "6cc25eeb-a330-4c71-a37a-31bb03575bfc",
  "quote_id": "ee8a79d0-b9d7-48ee-9496-14573ecdff97",
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
  "correlation_id": "9e0e7ef2-091c-4d3e-95ed-b10428899f2b"
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
  "paused_at": "2026-10-30T22:37:53.777992Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "ddebac54-8b7e-4516-8210-1d912be27d9b",
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
  "command_id": "cde3f6a5-ce38-4160-bdf9-75ebc13ff224",
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
  "command_id": "434b5995-1ab5-436c-97dd-e41c6a46b677",
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
  "id": "4c51ae03-717d-47a9-aa78-42ab7a7171ff",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T22:42:56.206379Z",
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
  "command_id": "76e25754-c3a5-49bc-9a72-aff7c38fcf87",
  "quote_id": "4c51ae03-717d-47a9-aa78-42ab7a7171ff",
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
  "correlation_id": "c9ecf3dc-82b9-4a0b-8e3b-c515d146e0f6"
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
  "command_id": "78c4b264-ea37-4b14-b320-5c6b6a2a6582",
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
      "from": "01:00",
      "to": "02:00"
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
      "from": "01:00",
      "to": "02:00"
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
  "command_id": "7336aa05-4689-4837-b8b9-f6f0224d356b",
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
  "id": "a2588156-041a-4980-92f3-e7788d486a9a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T22:42:57.438995Z",
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
  "command_id": "e8ab685c-9ea1-4cef-a71b-5a336908c362",
  "quote_id": "a2588156-041a-4980-92f3-e7788d486a9a",
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
  "correlation_id": "6a9ee71d-3fcf-4299-8e39-22456156a7ff"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "05477691-e42f-44d8-9fe5-072fa1b77e25",
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
  "correlation_id": "9c826272-7ed1-4bb3-bed0-6b1dfa92fa24",
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
      "from": "01:00",
      "to": "02:00"
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
  "command_id": "2dc34d83-5c74-4cc4-941f-e4718b995b83",
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
  "phone": "+380676849334",
  "device_ref": "sandbox-9624"
}
```

```json
{
  "challenge_id": "f07ff0a8-e71c-4014-8e31-c92caa2cbd1c",
  "expires_at": "2026-10-30T22:42:58.997556912Z",
  "resend_available_at": "2026-10-30T22:37:59.997556912Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380676849334` → **200**

```json
{
  "phone": "+380676849334",
  "audience": "CLIENT",
  "code": "338140",
  "sent_at": "2026-10-30T22:37:59.00032748Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f07ff0a8-e71c-4014-8e31-c92caa2cbd1c",
  "code": "338140",
  "device_ref": "sandbox-9624"
}
```

```json
{
  "session_id": "c6be6046-120b-4332-b0f5-7bfbea722bbd",
  "subject": {
    "type": "CLIENT",
    "id": "c8870ea5-7882-42cb-b72c-262e09241858"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjODg3MGVhNS03ODgyLTQyY2ItYjcyYy0yNjJlMDkyNDE4NTgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDAwNzc5LCJpYXQiOjE3OTMzOTk4NzksImp0aSI6IjMxMzk2ODdlLWFlMWQtNDQ5Ny1hNDFkLTNhZTk3NTY2NGFmZSIsInNpZCI6ImM2YmU2MDQ2LTEyMGItNDMzMi1iMGY1LTdiZmJlYTcyMmJiZCJ9.cr_Rk3KRInwFEKj_iW2APZDmh1krhqey9kqLpskQ4mQ",
  "access_expires_at": "2026-10-30T22:52:59.312105745Z",
  "refresh_token": "VT_Yu5oBtt0vnv8_qnfZDgWBlHbXizfNQ-3h7yOZYVY",
  "refresh_expires_at": "2026-11-29T22:37:59.311492451Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "c8870ea5-7882-42cb-b72c-262e09241858",
  "session_id": "c6be6046-120b-4332-b0f5-7bfbea722bbd",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6c6c4386-ccc6-4ae4-943b-3b8a9de3a358",
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
  "id": "e54bf08c-c003-4217-a5ab-93b10b435479",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T22:42:59.889007Z",
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
  "challenge_id": "89cffaff-b1d8-4a2d-968b-2177d41689f3",
  "expires_at": "2026-10-30T22:43:02.204621872Z",
  "resend_available_at": "2026-10-30T22:38:03.204621872Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380676849334` → **200**

```json
{
  "phone": "+380676849334",
  "audience": "CLIENT",
  "code": "508243",
  "sent_at": "2026-10-30T22:38:02.207166715Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "1974999c-abce-4078-96d8-cfcb4f88370a",
  "challenge_id": "89cffaff-b1d8-4a2d-968b-2177d41689f3",
  "otp_code": "508243"
}
```

```json
{
  "client_id": "c8870ea5-7882-42cb-b72c-262e09241858",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-30T22:38:02.555801056Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "2e9076bd-35ec-4f52-9d1e-315b8d0ec0ad",
  "quote_id": "e54bf08c-c003-4217-a5ab-93b10b435479",
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
  "correlation_id": "44f16c49-4b37-435e-bac1-b2c8cf24b9ee"
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
  "session_id": "145100fb-5b5e-40ca-bd51-df9f2b4a68aa",
  "subject": {
    "type": "STAFF",
    "id": "09fe1c69-c031-458c-a537-a40fa884b9ac"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwOWZlMWM2OS1jMDMxLTQ1OGMtYTUzNy1hNDBmYTg4NGI5YWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDA3ODMsImlhdCI6MTc5MzM5OTg4MywianRpIjoiODFjYjZjNDMtMzQ3Zi00ZGY1LWI4MjEtZmI1ZWE3YTAzZWJkIiwic2lkIjoiMTQ1MTAwZmItNWI1ZS00MGNhLWJkNTEtZGY5ZjJiNGE2OGFhIn0.bInU341POgs0_l2WPg4VH3YqS7DTOo1ftSTN7fRsWJY",
  "access_expires_at": "2026-10-30T22:53:03.454220551Z",
  "refresh_token": "PIPBWH20IpnEB8v9O0iXEHWRA87UUXSg4sresdTORtQ",
  "refresh_expires_at": "2026-10-31T10:38:03.453600347Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "c8870ea5-7882-42cb-b72c-262e09241858",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-30T22:38:02.555801Z",
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

`POST /api/admin/v1/client-deletions/c8870ea5-7882-42cb-b72c-262e09241858/complete` → **200**

```json
{
  "command_id": "434b7a09-612e-4e24-a363-7737e304e0f5",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "c8870ea5-7882-42cb-b72c-262e09241858",
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
  "correlation_id": "670d6746-711f-4f4f-9ec6-f49c4f5a1cbf"
}
```

Done: client c8870ea5-7882-42cb-b72c-262e09241858 anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380667313324",
  "device_ref": "sandbox-15942"
}
```

```json
{
  "challenge_id": "c997a7d9-245b-4ba1-ba1d-a68866975463",
  "expires_at": "2026-10-30T22:43:04.639656593Z",
  "resend_available_at": "2026-10-30T22:38:05.639656593Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380667313324` → **200**

```json
{
  "phone": "+380667313324",
  "audience": "CLIENT",
  "code": "546318",
  "sent_at": "2026-10-30T22:38:04.642858058Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c997a7d9-245b-4ba1-ba1d-a68866975463",
  "code": "546318",
  "device_ref": "sandbox-15942"
}
```

```json
{
  "session_id": "7cd80e76-b3d3-4a44-9877-685b47e20fc2",
  "subject": {
    "type": "CLIENT",
    "id": "b472c825-8218-45e5-b121-3be545abebe9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNDcyYzgyNS04MjE4LTQ1ZTUtYjEyMS0zYmU1NDVhYmViZTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDAwNzg0LCJpYXQiOjE3OTMzOTk4ODQsImp0aSI6Ijc2MTI0N2VmLWYyMWEtNDUwNC05YzNiLWY4YmNhZDk0M2I5MSIsInNpZCI6IjdjZDgwZTc2LWIzZDMtNGE0NC05ODc3LTY4NWI0N2UyMGZjMiJ9._WWcLz32fp16gHDOex6WKGO-42jJlfC4hysRe5r7SV0",
  "access_expires_at": "2026-10-30T22:53:04.962406576Z",
  "refresh_token": "Fx_Y8zUcjL-cQQx32RrBOxE8rnVmh_B6W1XXVLexeoU",
  "refresh_expires_at": "2026-11-29T22:38:04.961816501Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "b472c825-8218-45e5-b121-3be545abebe9",
  "session_id": "7cd80e76-b3d3-4a44-9877-685b47e20fc2",
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
  "session_id": "793c8fc0-a864-4181-bd19-85611f0a8b65",
  "subject": {
    "type": "STAFF",
    "id": "09fe1c69-c031-458c-a537-a40fa884b9ac"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwOWZlMWM2OS1jMDMxLTQ1OGMtYTUzNy1hNDBmYTg4NGI5YWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDA3ODUsImlhdCI6MTc5MzM5OTg4NSwianRpIjoiM2Q2NTQzN2YtZTU2My00MDdiLThkZmItZmQxZGJiZGEwMjljIiwic2lkIjoiNzkzYzhmYzAtYTg2NC00MTgxLWJkMTktODU2MTFmMGE4YjY1In0.CZ0R_TJ0hX7bFWK8DQNpZYYymOPEL2UA8mIHeuys4uw",
  "access_expires_at": "2026-10-30T22:53:05.837612845Z",
  "refresh_token": "M4WCmE-LS1Yn0NndJV6tigw6K5vwlBycADvWSm0b6iQ",
  "refresh_expires_at": "2026-10-31T10:38:05.836996521Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=7313324&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "b472c825-8218-45e5-b121-3be545abebe9",
      "phone": "+380667313324",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-30T22:38:04.960291Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/b472c825-8218-45e5-b121-3be545abebe9` → **200**

```json
{
  "client": {
    "id": "b472c825-8218-45e5-b121-3be545abebe9",
    "phone": "+380667313324",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T22:38:04.960291Z",
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

`POST /api/admin/v1/clients/b472c825-8218-45e5-b121-3be545abebe9/block` → **400**

```json
{
  "command_id": "bd04f988-fad8-4d30-ac46-9157aa97a159",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/b472c825-8218-45e5-b121-3be545abebe9/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "506c81d8-94fc-4559-b83d-b4a82e4be849",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/b472c825-8218-45e5-b121-3be545abebe9/block` → **200**

```json
{
  "command_id": "84c9a78e-341f-4fd2-b7e1-7d75239be5bd",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "b472c825-8218-45e5-b121-3be545abebe9",
  "phone": "+380667313324",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-30T22:38:04.960291Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-30T22:38:07.076137Z",
    "by": "09fe1c69-c031-458c-a537-a40fa884b9ac"
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
  "correlation_id": "e95dc1a0-0b02-4a7b-8404-1c06e90c520b"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380667313324",
  "device_ref": "sandbox-19999"
}
```

```json
{
  "challenge_id": "a09a2114-cbb6-4717-b3c2-e5df7f72d190",
  "expires_at": "2026-10-30T22:43:09.689190395Z",
  "resend_available_at": "2026-10-30T22:38:10.689190395Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380667313324` → **200**

```json
{
  "phone": "+380667313324",
  "audience": "CLIENT",
  "code": "116856",
  "sent_at": "2026-10-30T22:38:09.691969779Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "a09a2114-cbb6-4717-b3c2-e5df7f72d190",
  "code": "116856",
  "device_ref": "sandbox-19999"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "d2e4622f-aceb-4fa0-97b4-2ccc6dd8bd30"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/b472c825-8218-45e5-b121-3be545abebe9` → **200**

```json
{
  "client": {
    "id": "b472c825-8218-45e5-b121-3be545abebe9",
    "phone": "+380667313324",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-30T22:38:04.960291Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-30T22:38:07.076137Z",
      "by": "09fe1c69-c031-458c-a537-a40fa884b9ac"
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

`POST /api/admin/v1/clients/b472c825-8218-45e5-b121-3be545abebe9/unblock` → **200**

```json
{
  "command_id": "628c3342-b22b-49d5-9f06-d88760eb6869",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "b472c825-8218-45e5-b121-3be545abebe9",
  "phone": "+380667313324",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-30T22:38:04.960291Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380667313324",
  "device_ref": "sandbox-9475"
}
```

```json
{
  "challenge_id": "9aad3361-7df3-4f6d-ae34-fed2ced4c3a4",
  "expires_at": "2026-10-30T22:43:12.933793202Z",
  "resend_available_at": "2026-10-30T22:38:13.933793202Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380667313324` → **200**

```json
{
  "phone": "+380667313324",
  "audience": "CLIENT",
  "code": "313962",
  "sent_at": "2026-10-30T22:38:12.936406044Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9aad3361-7df3-4f6d-ae34-fed2ced4c3a4",
  "code": "313962",
  "device_ref": "sandbox-9475"
}
```

```json
{
  "session_id": "02ab8422-5987-4517-aaf1-ea2114032c99",
  "subject": {
    "type": "CLIENT",
    "id": "b472c825-8218-45e5-b121-3be545abebe9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNDcyYzgyNS04MjE4LTQ1ZTUtYjEyMS0zYmU1NDVhYmViZTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDAwNzkzLCJpYXQiOjE3OTMzOTk4OTMsImp0aSI6IjRmOTY3NDQ4LWZkZDMtNDZkMi05ZTRlLTEyOTZiZGYyODZlZSIsInNpZCI6IjAyYWI4NDIyLTU5ODctNDUxNy1hYWYxLWVhMjExNDAzMmM5OSJ9.rEhozbwpfg4WIGrPtG2tTzDH1NV5E1DAayognmqbPsk",
  "access_expires_at": "2026-10-30T22:53:13.255354947Z",
  "refresh_token": "iqEPFrgQou8pgOqXADST-B18Wp9vk0bWnLyLuWW09Qc",
  "refresh_expires_at": "2026-11-29T22:38:13.254769311Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "b472c825-8218-45e5-b121-3be545abebe9",
  "session_id": "02ab8422-5987-4517-aaf1-ea2114032c99",
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
  "phone": "+380660086684",
  "device_ref": "sandbox-13508"
}
```

```json
{
  "challenge_id": "8425f42c-9860-493a-a18c-aadfeb204282",
  "expires_at": "2026-10-30T22:43:13.851452258Z",
  "resend_available_at": "2026-10-30T22:38:14.851452258Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380660086684` → **200**

```json
{
  "phone": "+380660086684",
  "audience": "CLIENT",
  "code": "580795",
  "sent_at": "2026-10-30T22:38:13.854155604Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8425f42c-9860-493a-a18c-aadfeb204282",
  "code": "580795",
  "device_ref": "sandbox-13508"
}
```

```json
{
  "session_id": "cfc1f13d-6ecc-4e8e-9707-c96a83d2a2cb",
  "subject": {
    "type": "CLIENT",
    "id": "f681a48d-a959-4a09-ae90-bc4b7cb19f9b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjgxYTQ4ZC1hOTU5LTRhMDktYWU5MC1iYzRiN2NiMTlmOWIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDAwNzk0LCJpYXQiOjE3OTMzOTk4OTQsImp0aSI6ImQ5Yzk4ZmQ1LTIzMTgtNGIwNi04MDc2LWI3ODZmMjI2ODBhMCIsInNpZCI6ImNmYzFmMTNkLTZlY2MtNGU4ZS05NzA3LWM5NmE4M2QyYTJjYiJ9.AV8_ngByMerToUFAd9aKrp1IcW50dmIa0Hy0ABcN3AE",
  "access_expires_at": "2026-10-30T22:53:14.167380026Z",
  "refresh_token": "CKD9IGb_Pd5fxPGTxBvtsS4Tv5KrcrSWE80IC7CnO5U",
  "refresh_expires_at": "2026-11-29T22:38:14.1668215Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "18083bb0-b8b2-4198-a9cd-f46bc8a7505d",
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
  "id": "e3e04c02-6cfd-4cbd-9d2c-a561c5c63224",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T22:43:14.461773Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: e8817472-3e2f-4916-9cea-5b4b88ef3bc2) → **201**

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
  "session_id": "411d6824-4f1c-428c-87dd-9f99b498f108",
  "subject": {
    "type": "STAFF",
    "id": "09fe1c69-c031-458c-a537-a40fa884b9ac"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwOWZlMWM2OS1jMDMxLTQ1OGMtYTUzNy1hNDBmYTg4NGI5YWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDA3OTUsImlhdCI6MTc5MzM5OTg5NSwianRpIjoiMTQyZjQ4OWItNDQ4MC00Mzk3LTllMGYtNGY2ODNmZDI1YjY1Iiwic2lkIjoiNDExZDY4MjQtNGYxYy00MjhjLTg3ZGQtOWY5OWI0OThmMTA4In0.nLAsmO3i6kvIEvTQemoERT4IG8QY_TO6HeN3knIKqsQ",
  "access_expires_at": "2026-10-30T22:53:15.093572356Z",
  "refresh_token": "570ozdGyMXGSdsc5wniPf4_WoHBg5pF03QDk7ffmj_0",
  "refresh_expires_at": "2026-10-31T10:38:15.092889587Z",
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
  "session_id": "20abc6a2-2c6c-43fb-acdf-fa0ef0a2e7ab",
  "subject": {
    "type": "STAFF",
    "id": "09fe1c69-c031-458c-a537-a40fa884b9ac"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwOWZlMWM2OS1jMDMxLTQ1OGMtYTUzNy1hNDBmYTg4NGI5YWMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDA3OTUsImlhdCI6MTc5MzM5OTg5NSwianRpIjoiODEzN2U2ODItYzQ4My00M2MxLTlmZmYtYzBmYjc2YTI4OGY3Iiwic2lkIjoiMjBhYmM2YTItMmM2Yy00M2ZiLWFjZGYtZmEwZWYwYTJlN2FiIn0.IYC2WIFPb_h41tksMnUbzm54AgDOZPfqrULHIKaZaMY",
  "access_expires_at": "2026-10-30T22:53:15.693514409Z",
  "refresh_token": "gz6cvx_NbL4E3yMb1Ti_5oM8ylwj7zshHWogaE18n4M",
  "refresh_expires_at": "2026-10-31T10:38:15.692947668Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/b0b5cfdb-5411-492b-97d3-269e210b5520/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T22:38:14.766871Z",
      "actor": {
        "type": "CLIENT",
        "id": "f681a48d-a959-4a09-ae90-bc4b7cb19f9b",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "b0b5cfdb-5411-492b-97d3-269e210b5520",
        "quote_id": "e3e04c02-6cfd-4cbd-9d2c-a561c5c63224",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "e8817472-3e2f-4916-9cea-5b4b88ef3bc2"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T22:38:14.768627Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "b0b5cfdb-5411-492b-97d3-269e210b5520",
        "attempt_id": "1da1515a-50ed-4c41-a1fa-4f0464c66627",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "e8817472-3e2f-4916-9cea-5b4b88ef3bc2"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-30T22:38:14.773421Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "b0b5cfdb-5411-492b-97d3-269e210b5520",
        "attempt_id": "1da1515a-50ed-4c41-a1fa-4f0464c66627"
      },
      "correlation_id": "e8817472-3e2f-4916-9cea-5b4b88ef3bc2"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "1da1515a-50ed-4c41-a1fa-4f0464c66627",
        "generation": 1,
        "started_at": "2026-10-30T22:38:14.767827Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-30T22:38:14.773421Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-30T22:38:14.769377Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/e8817472-3e2f-4916-9cea-5b4b88ef3bc2` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "b0b5cfdb-5411-492b-97d3-269e210b5520:0",
      "order_id": "b0b5cfdb-5411-492b-97d3-269e210b5520",
      "at": "2026-10-30T22:38:14.766871Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "b0b5cfdb-5411-492b-97d3-269e210b5520:1",
      "order_id": "b0b5cfdb-5411-492b-97d3-269e210b5520",
      "at": "2026-10-30T22:38:14.768627Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "b0b5cfdb-5411-492b-97d3-269e210b5520:2",
      "order_id": "b0b5cfdb-5411-492b-97d3-269e210b5520",
      "at": "2026-10-30T22:38:14.773421Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/126d440e-2ee5-44cf-8d8a-c68835f79f47` → **200**

```json
{
  "found": []
}
```

Done: request e8817472-3e2f-4916-9cea-5b4b88ef3bc2 — order b0b5cfdb-5411-492b-97d3-269e210b5520 found by its id.

`GET /api/rider/v1/orders/b0b5cfdb-5411-492b-97d3-269e210b5520` → **200**

```json
{
  "id": "b0b5cfdb-5411-492b-97d3-269e210b5520",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f681a48d-a959-4a09-ae90-bc4b7cb19f9b",
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
  "created_at": "2026-10-30T22:38:14.766414Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

`POST /api/rider/v1/orders/b0b5cfdb-5411-492b-97d3-269e210b5520/cancel` → **200**

```json
{
  "command_id": "51ecefe6-9c21-4ee0-b01f-686908aabbfd",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "b0b5cfdb-5411-492b-97d3-269e210b5520",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "f681a48d-a959-4a09-ae90-bc4b7cb19f9b",
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
  "created_at": "2026-10-30T22:38:14.766414Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "ru": "Передумал ехать",
      "en": "Changed my mind",
      "uk": "Передумав їхати",
      "pl": "Zmiana planów"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

# Scenario: data-export

## A rider signs in and asks for a code to confirm the copy

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635398987",
  "device_ref": "sandbox-17245"
}
```

```json
{
  "challenge_id": "a003c5b2-9345-4f32-81a2-1c75180a8ea6",
  "expires_at": "2026-10-30T22:43:17.53887746Z",
  "resend_available_at": "2026-10-30T22:38:18.53887746Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380635398987` → **200**

```json
{
  "phone": "+380635398987",
  "audience": "CLIENT",
  "code": "946950",
  "sent_at": "2026-10-30T22:38:17.541869884Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a003c5b2-9345-4f32-81a2-1c75180a8ea6",
  "code": "946950",
  "device_ref": "sandbox-17245"
}
```

```json
{
  "session_id": "618e32e9-eab4-47d0-92d8-1ceab356ec53",
  "subject": {
    "type": "CLIENT",
    "id": "8606ef59-9fd4-49c2-9261-a5cd1fab03b6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NjA2ZWY1OS05ZmQ0LTQ5YzItOTI2MS1hNWNkMWZhYjAzYjYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDAwNzk3LCJpYXQiOjE3OTMzOTk4OTcsImp0aSI6IjZkZGQ0ZDBmLTdhOWEtNDYwYy1hNWRkLTRkM2FjYmIwYWU0NyIsInNpZCI6IjYxOGUzMmU5LWVhYjQtNDdkMC05MmQ4LTFjZWFiMzU2ZWM1MyJ9.0RvCOOew-gI9Rgyzxf93z44b5AP4tPGU9nRzc5Ni3QA",
  "access_expires_at": "2026-10-30T22:53:17.871945767Z",
  "refresh_token": "gJyckukkC3X-p21JCtwaxKhjFgXrAdr9RtE78cFR47s",
  "refresh_expires_at": "2026-11-29T22:38:17.871313851Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "0a8a50f8-b446-4340-9027-579ef54354aa",
  "expires_at": "2026-10-30T22:43:20.176099044Z",
  "resend_available_at": "2026-10-30T22:38:21.176099044Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635398987` → **200**

```json
{
  "phone": "+380635398987",
  "audience": "CLIENT",
  "code": "959019",
  "sent_at": "2026-10-30T22:38:20.178441622Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "a7779924-5508-4e52-98e8-5c5cd3f7e61f",
  "challenge_id": "0a8a50f8-b446-4340-9027-579ef54354aa",
  "otp_code": "959019"
}
```

```json
{
  "id": "c114e425-4a83-43fa-aca6-a0c5bd2ce6a5",
  "state": "PENDING",
  "created_at": "2026-10-30T22:38:20.501962Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/c114e425-4a83-43fa-aca6-a0c5bd2ce6a5` → **200**

```json
{
  "id": "c114e425-4a83-43fa-aca6-a0c5bd2ce6a5",
  "state": "PENDING",
  "created_at": "2026-10-30T22:38:20.501962Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/c114e425-4a83-43fa-aca6-a0c5bd2ce6a5` → **200**

```json
{
  "id": "c114e425-4a83-43fa-aca6-a0c5bd2ce6a5",
  "state": "PENDING",
  "created_at": "2026-10-30T22:38:20.501962Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/c114e425-4a83-43fa-aca6-a0c5bd2ce6a5` → **200**

```json
{
  "id": "c114e425-4a83-43fa-aca6-a0c5bd2ce6a5",
  "state": "PENDING",
  "created_at": "2026-10-30T22:38:20.501962Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/c114e425-4a83-43fa-aca6-a0c5bd2ce6a5` → **200**

```json
{
  "id": "c114e425-4a83-43fa-aca6-a0c5bd2ce6a5",
  "state": "PENDING",
  "created_at": "2026-10-30T22:38:20.501962Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/c114e425-4a83-43fa-aca6-a0c5bd2ce6a5` → **200**

```json
{
  "id": "c114e425-4a83-43fa-aca6-a0c5bd2ce6a5",
  "state": "PENDING",
  "created_at": "2026-10-30T22:38:20.501962Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/c114e425-4a83-43fa-aca6-a0c5bd2ce6a5` → **200**

```json
{
  "id": "c114e425-4a83-43fa-aca6-a0c5bd2ce6a5",
  "state": "PENDING",
  "created_at": "2026-10-30T22:38:20.501962Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/c114e425-4a83-43fa-aca6-a0c5bd2ce6a5` → **200**

```json
{
  "id": "c114e425-4a83-43fa-aca6-a0c5bd2ce6a5",
  "state": "READY",
  "created_at": "2026-10-30T22:38:20.501962Z",
  "ready_at": "2026-10-30T22:38:27.970509Z",
  "expires_at": "2026-11-06T22:38:27.970509Z",
  "size_bytes": 1030
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/c114e425-4a83-43fa-aca6-a0c5bd2ce6a5/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634166443",
  "device_ref": "sandbox-6145"
}
```

```json
{
  "challenge_id": "808b19cd-2c43-4fb5-b40a-f3b73e5982e8",
  "expires_at": "2026-10-30T22:43:28.828773168Z",
  "resend_available_at": "2026-10-30T22:38:29.828773168Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380634166443` → **200**

```json
{
  "phone": "+380634166443",
  "audience": "CLIENT",
  "code": "691416",
  "sent_at": "2026-10-30T22:38:28.831653091Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "808b19cd-2c43-4fb5-b40a-f3b73e5982e8",
  "code": "691416",
  "device_ref": "sandbox-6145"
}
```

```json
{
  "session_id": "00836a34-fc96-4035-b593-4f97566e37ca",
  "subject": {
    "type": "CLIENT",
    "id": "c2c1ff61-5351-4bcc-9333-a276496a82c5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMmMxZmY2MS01MzUxLTRiY2MtOTMzMy1hMjc2NDk2YTgyYzUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDAwODA5LCJpYXQiOjE3OTMzOTk5MDksImp0aSI6ImI2ZDQzMDRjLThhMzgtNDFjZi1hZTYyLTQ0M2NlYzEzNTk4YyIsInNpZCI6IjAwODM2YTM0LWZjOTYtNDAzNS1iNTkzLTRmOTc1NjZlMzdjYSJ9.m-u-k89RXINyrdapyH5mEqfvWSnACsGGxUBmo3LcQHw",
  "access_expires_at": "2026-10-30T22:53:29.14366833Z",
  "refresh_token": "nsst-pd-z3HoJswy4mtXKMj9uV-og0zYYnEACW-ys1k",
  "refresh_expires_at": "2026-11-29T22:38:29.143075856Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/c114e425-4a83-43fa-aca6-a0c5bd2ce6a5/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/c114e425-4a83-43fa-aca6-a0c5bd2ce6a5/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "cd0225f1-6e96-43dc-895b-9a03e45044cf"
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
  "session_id": "1aa4acee-e7fe-4509-bfa4-18036d12bcf7",
  "subject": {
    "type": "STAFF",
    "id": "09fe1c69-c031-458c-a537-a40fa884b9ac"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwOWZlMWM2OS1jMDMxLTQ1OGMtYTUzNy1hNDBmYTg4NGI5YWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDA4MTAsImlhdCI6MTc5MzM5OTkxMCwianRpIjoiNzg2OTZmNTMtNWE4YS00YjI1LWI5YjYtOWI1NTBkZWY0ZDNjIiwic2lkIjoiMWFhNGFjZWUtZTdmZS00NTA5LWJmYTQtMTgwMzZkMTJiY2Y3In0.0OQkDO0Lz6kpkGcZwwCP0ockG5ijJUyy3XVJjgHBN1E",
  "access_expires_at": "2026-10-30T22:53:30.020280737Z",
  "refresh_token": "QR2ZJz1rQ0JDDm-da4tW4LxA35LGD_ePkWRLKsHH8b8",
  "refresh_expires_at": "2026-10-31T10:38:30.01956624Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "8606ef59-9fd4-49c2-9261-a5cd1fab03b6",
  "session_id": "618e32e9-eab4-47d0-92d8-1ceab356ec53",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/8606ef59-9fd4-49c2-9261-a5cd1fab03b6/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "c114e425-4a83-43fa-aca6-a0c5bd2ce6a5",
      "state": "READY",
      "created_at": "2026-10-30T22:38:20.501962Z",
      "ready_at": "2026-10-30T22:38:27.970509Z",
      "expires_at": "2026-11-06T22:38:27.970509Z",
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
  "device_ref": "sandbox-29536"
}
```

```json
{
  "challenge_id": "ea69a278-c7a0-447f-8292-139c5c5dfdaa",
  "expires_at": "2026-10-30T22:43:30.898822107Z",
  "resend_available_at": "2026-10-30T22:38:31.898822107Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "175504",
  "sent_at": "2026-10-30T22:38:30.901592769Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ea69a278-c7a0-447f-8292-139c5c5dfdaa",
  "code": "175504",
  "device_ref": "sandbox-29536"
}
```

```json
{
  "session_id": "f48d80e8-110f-47e2-a9f9-21b68da192d0",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwMDgxMSwiaWF0IjoxNzkzMzk5OTExLCJqdGkiOiIxMmI0MTFhMi01MTNmLTRkZDYtYTM5ZC1lMDBkM2QwOTBiM2QiLCJzaWQiOiJmNDhkODBlOC0xMTBmLTQ3ZTItYTlmOS0yMWI2OGRhMTkyZDAifQ.3upNPCFjjFmeC6oLoFJKwtz086MWRw_dLRwSVR9nl9E",
  "access_expires_at": "2026-10-30T22:53:31.224256328Z",
  "refresh_token": "PHVE6xLheDzEujDaSQU_hWkUSVF2oUc4hAqNAgqu8Ak",
  "refresh_expires_at": "2026-11-29T22:38:31.223669719Z",
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
  "device_ref": "sandbox-11184"
}
```

```json
{
  "challenge_id": "0682aec5-d95f-47d8-aa4b-245469b23416",
  "expires_at": "2026-10-30T22:43:31.795395508Z",
  "resend_available_at": "2026-10-30T22:38:32.795395508Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "993426",
  "sent_at": "2026-10-30T22:38:31.798365289Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0682aec5-d95f-47d8-aa4b-245469b23416",
  "code": "993426",
  "device_ref": "sandbox-11184"
}
```

```json
{
  "session_id": "0d6e8dbe-8953-4136-91a4-3bbde80cfa5e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwMDgxMiwiaWF0IjoxNzkzMzk5OTEyLCJqdGkiOiJkN2JkZGNiNy04NjliLTQyMzItYjgzNC03NzRlNDhjOGZmMzEiLCJzaWQiOiIwZDZlOGRiZS04OTUzLTQxMzYtOTFhNC0zYmJkZTgwY2ZhNWUifQ.zZdJHbvbdmd7HvIC9rwCvx2hyQfhmBmkbJCgson1QD8",
  "access_expires_at": "2026-10-30T22:53:32.108245005Z",
  "refresh_token": "sUTLCalMidcgPhXc2ZaKfql8Bu6Qg85Cd1evMtfLg8s",
  "refresh_expires_at": "2026-11-29T22:38:32.107595739Z",
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
  "command_id": "3921c360-9bd6-4c8e-a234-521f4038eb87",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:38:32Z",
    "sequence": 1793399912710
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b7d29d1c-dbd4-49ae-9182-fc9cf176863f",
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
  "last_heartbeat_at": "2026-10-30T22:38:32.730269Z",
  "last_location_at": "2026-10-30T22:38:32.730269Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-10242"
}
```

```json
{
  "challenge_id": "e292c8e5-0b42-4d64-8733-6321b0b3df2e",
  "expires_at": "2026-10-30T22:43:33.048032605Z",
  "resend_available_at": "2026-10-30T22:38:34.048032605Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "555242",
  "sent_at": "2026-10-30T22:38:33.05057234Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e292c8e5-0b42-4d64-8733-6321b0b3df2e",
  "code": "555242",
  "device_ref": "sandbox-10242"
}
```

```json
{
  "session_id": "c23ef3b8-23f7-4038-be28-e7e8d7216e37",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwMDgxMywiaWF0IjoxNzkzMzk5OTEzLCJqdGkiOiI1YjhmYjJkNi0xMjI2LTRmMzQtYmZhZi0zZTY4YjA0NTBhMmQiLCJzaWQiOiJjMjNlZjNiOC0yM2Y3LTQwMzgtYmUyOC1lN2U4ZDcyMTZlMzcifQ.e_8k_3AEMxC8vCNlfeTBDZLMVCTI9rBcd0ryNMr-iiI",
  "access_expires_at": "2026-10-30T22:53:33.372191294Z",
  "refresh_token": "V89XcuGBa1H_MJv-Seq40HZLOzN5_Nw9rs6neucdVt0",
  "refresh_expires_at": "2026-11-29T22:38:33.371611218Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "10eccd24-f45d-4382-ab0b-2a3ece6ab308",
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
  "last_heartbeat_at": "2026-10-30T22:34:32.402739Z",
  "last_location_at": "2026-10-30T22:34:32.402739Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/10eccd24-f45d-4382-ab0b-2a3ece6ab308/handover` → **200**

```json
{
  "command_id": "df9eadf4-478d-4807-acf9-e8e959bdf752",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "10eccd24-f45d-4382-ab0b-2a3ece6ab308",
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
  "last_heartbeat_at": "2026-10-30T22:34:32.402739Z",
  "last_location_at": "2026-10-30T22:34:32.402739Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/10eccd24-f45d-4382-ab0b-2a3ece6ab308/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:38:34Z",
    "sequence": 1793399914283
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "10eccd24-f45d-4382-ab0b-2a3ece6ab308",
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
  "last_heartbeat_at": "2026-10-30T22:38:34.302032Z",
  "last_location_at": "2026-10-30T22:38:34.302032Z",
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
  "session_id": "c46c2292-9c15-47f5-a0df-d8b99deca2ec",
  "subject": {
    "type": "STAFF",
    "id": "09fe1c69-c031-458c-a537-a40fa884b9ac"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwOWZlMWM2OS1jMDMxLTQ1OGMtYTUzNy1hNDBmYTg4NGI5YWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDA4MTQsImlhdCI6MTc5MzM5OTkxNCwianRpIjoiNTU1ZTc3MDAtMmJlNS00ZTdlLWI4YTktZGE5ZjhlMGY5YTk0Iiwic2lkIjoiYzQ2YzIyOTItOWMxNS00N2Y1LWEwZGYtZDhiOTlkZWNhMmVjIn0.LkeQ_hTN7ecud2Oc4kMxSuBo-WRhsDoN1jvSRhI2DFM",
  "access_expires_at": "2026-10-30T22:53:34.880184273Z",
  "refresh_token": "bhthJonjzkUcK5k_Foz2o5d9N9vBgfmMKZJ8_aamZcY",
  "refresh_expires_at": "2026-10-31T10:38:34.879613054Z",
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
  "session_id": "ec49ac18-d30c-4e17-bc36-25a07fe1d928",
  "subject": {
    "type": "STAFF",
    "id": "09fe1c69-c031-458c-a537-a40fa884b9ac"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwOWZlMWM2OS1jMDMxLTQ1OGMtYTUzNy1hNDBmYTg4NGI5YWMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDA4MTUsImlhdCI6MTc5MzM5OTkxNSwianRpIjoiOGEzNzgxNTctNDgwMS00MGJmLTk2MDctOTRmY2ExYjc1NGJjIiwic2lkIjoiZWM0OWFjMTgtZDMwYy00ZTE3LWJjMzYtMjVhMDdmZTFkOTI4In0.s3jKExoi-GdDfzyFHVb5xHpta-AI3XqMERBbfY7EGQs",
  "access_expires_at": "2026-10-30T22:53:35.457084776Z",
  "refresh_token": "DMPPM_QJ29SEXcqTjB27p6TlkrV45d-VV1HjcuOgHHA",
  "refresh_expires_at": "2026-10-31T10:38:35.456503348Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380689886011",
  "device_ref": "sandbox-23248"
}
```

```json
{
  "challenge_id": "d02e7107-0975-416f-99b9-6d6dbb3d2f69",
  "expires_at": "2026-10-30T22:43:35.744091494Z",
  "resend_available_at": "2026-10-30T22:38:36.744091494Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380689886011` → **200**

```json
{
  "phone": "+380689886011",
  "audience": "CLIENT",
  "code": "825040",
  "sent_at": "2026-10-30T22:38:35.747107711Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d02e7107-0975-416f-99b9-6d6dbb3d2f69",
  "code": "825040",
  "device_ref": "sandbox-23248"
}
```

```json
{
  "session_id": "45e58f08-7f12-4fac-b80c-4ce855174635",
  "subject": {
    "type": "CLIENT",
    "id": "d2b5daf5-c334-490a-930c-96517c7ff516"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMmI1ZGFmNS1jMzM0LTQ5MGEtOTMwYy05NjUxN2M3ZmY1MTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDAwODE2LCJpYXQiOjE3OTMzOTk5MTYsImp0aSI6Ijk1NjQwZjc5LThmOGQtNDk0NC05NmFmLTI3OTQyMDVmZThiNiIsInNpZCI6IjQ1ZTU4ZjA4LTdmMTItNGZhYy1iODBjLTRjZTg1NTE3NDYzNSJ9.-hbU3qDOwV5dPTY8rQbgwJ0QfIUV6TxgLdvo0Kzcdkk",
  "access_expires_at": "2026-10-30T22:53:36.074515018Z",
  "refresh_token": "GZFacd7Xw6edlOabAztRWdvytHJVwRFfoFwWVEtOz80",
  "refresh_expires_at": "2026-11-29T22:38:36.073957875Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "34592acf-95f9-40a3-ae9b-b27bf7e9db9e",
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
  "id": "a795bb45-c5f8-4ee7-abf1-c8ab420f9ba3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T22:43:36.367745Z",
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
  "command_id": "39282387-c38b-4ad9-b6a8-2a877ffbe4a3",
  "quote_id": "a795bb45-c5f8-4ee7-abf1-c8ab420f9ba3",
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
  "id": "a375dd6c-698f-473e-aabc-9f1c13879283",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d2b5daf5-c334-490a-930c-96517c7ff516",
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
  "created_at": "2026-10-30T22:38:36.675528Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

## The nearest driver declines, the next one accepts

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "eb90352e-bd01-4cc7-886c-e32f62d6079c",
    "order_id": "a375dd6c-698f-473e-aabc-9f1c13879283",
    "expires_at": "2026-10-30T22:38:51.678486Z",
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

`POST /api/driver/v1/offers/eb90352e-bd01-4cc7-886c-e32f62d6079c/reject` → **204**

```json
{
  "command_id": "502f9f7b-5c3b-4907-87f9-51abde25ba49"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "6d596332-6c89-467e-aafa-9a03a7ec574d",
    "order_id": "a375dd6c-698f-473e-aabc-9f1c13879283",
    "expires_at": "2026-10-30T22:38:52.301477Z",
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

`POST /api/driver/v1/offers/6d596332-6c89-467e-aafa-9a03a7ec574d/accept` → **200**

```json
{
  "command_id": "1d3adf91-db9f-4262-ad34-76b0dd0bc196"
}
```

```json
{
  "id": "1840a73f-eba2-4dcf-8a26-8960be845c50",
  "order_id": "a375dd6c-698f-473e-aabc-9f1c13879283",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "481a8875-5bdb-40d1-ab62-43a363034b2c",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/a375dd6c-698f-473e-aabc-9f1c13879283/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T22:38:36.675994Z",
      "actor": {
        "type": "CLIENT",
        "id": "d2b5daf5-c334-490a-930c-96517c7ff516",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "a375dd6c-698f-473e-aabc-9f1c13879283",
        "quote_id": "a795bb45-c5f8-4ee7-abf1-c8ab420f9ba3",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "c8022b5e-8713-4cf7-94dd-d32c431151aa"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T22:38:36.677794Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "a375dd6c-698f-473e-aabc-9f1c13879283",
        "attempt_id": "bdaaa27d-022c-48a8-af19-f7742d66bfb4",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "c8022b5e-8713-4cf7-94dd-d32c431151aa"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T22:38:36.681524Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "eb90352e-bd01-4cc7-886c-e32f62d6079c",
        "order_id": "a375dd6c-698f-473e-aabc-9f1c13879283",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200,
        "expires_at": "2026-10-30T22:38:51.678486095Z"
      },
      "correlation_id": "c8022b5e-8713-4cf7-94dd-d32c431151aa"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-30T22:38:37.300551Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "eb90352e-bd01-4cc7-886c-e32f62d6079c",
        "order_id": "a375dd6c-698f-473e-aabc-9f1c13879283"
      },
      "correlation_id": "56fb23ea-e8e2-4352-9534-87847111b40b"
    },
    {
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order a375dd6c-698f-473e-aabc-9f1c13879283 — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/a375dd6c-698f-473e-aabc-9f1c13879283` → **200**

```json
{
  "id": "a375dd6c-698f-473e-aabc-9f1c13879283",
  "short_number": 13,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "d2b5daf5-c334-490a-930c-96517c7ff516",
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
    "id": "1840a73f-eba2-4dcf-8a26-8960be845c50",
    "order_id": "a375dd6c-698f-473e-aabc-9f1c13879283",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "481a8875-5bdb-40d1-ab62-43a363034b2c",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T22:38:36.675528Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/a375dd6c-698f-473e-aabc-9f1c13879283/cancel` → **200**

```json
{
  "command_id": "4d7cfb6b-038c-4202-809a-6fbc9e73f1aa",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "a375dd6c-698f-473e-aabc-9f1c13879283",
  "short_number": 13,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "d2b5daf5-c334-490a-930c-96517c7ff516",
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
    "id": "1840a73f-eba2-4dcf-8a26-8960be845c50",
    "order_id": "a375dd6c-698f-473e-aabc-9f1c13879283",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "481a8875-5bdb-40d1-ab62-43a363034b2c",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T22:38:36.675528Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "ru": "Нет свободных машин",
      "en": "No cars available",
      "uk": "Немає вільних авто",
      "pl": "Brak wolnych aut"
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
  "session_id": "b7d29d1c-dbd4-49ae-9182-fc9cf176863f",
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
  "last_heartbeat_at": "2026-10-30T22:38:32.730269Z",
  "last_location_at": "2026-10-30T22:38:32.730269Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b7d29d1c-dbd4-49ae-9182-fc9cf176863f/close` → **200**

```json
{
  "command_id": "bf5aae5e-14bb-4fa5-9a95-8425f3ea5911",
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
  "session_id": "10eccd24-f45d-4382-ab0b-2a3ece6ab308",
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
  "last_heartbeat_at": "2026-10-30T22:38:34.302032Z",
  "last_location_at": "2026-10-30T22:38:34.302032Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/10eccd24-f45d-4382-ab0b-2a3ece6ab308/close` → **200**

```json
{
  "command_id": "6926f176-76c4-44b3-b0b7-9789606639d6",
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
  "device_ref": "sandbox-28423"
}
```

```json
{
  "challenge_id": "1474fd31-8025-4643-b689-39f7374cad74",
  "expires_at": "2026-10-30T22:43:40.138530002Z",
  "resend_available_at": "2026-10-30T22:38:41.138530002Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "251137",
  "sent_at": "2026-10-30T22:38:40.141556071Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1474fd31-8025-4643-b689-39f7374cad74",
  "code": "251137",
  "device_ref": "sandbox-28423"
}
```

```json
{
  "session_id": "1cd3da1b-e11e-4f9e-a3da-0b9fd4a7d2c7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwMDgyMCwiaWF0IjoxNzkzMzk5OTIwLCJqdGkiOiIxNzZkZTQ4Mi00ZjJiLTRkNDQtYmU3OS00ZDRhOGE5ZWQyNWMiLCJzaWQiOiIxY2QzZGExYi1lMTFlLTRmOWUtYTNkYS0wYjlmZDRhN2QyYzcifQ.cAYwPQALH-2zFVF4JLDZKC1jmQbATweAIJ-HcTssFCA",
  "access_expires_at": "2026-10-30T22:53:40.461473637Z",
  "refresh_token": "yw2fGJ61R-ScgNKApl0dHnP-7b8PENGxQEagpNbvRag",
  "refresh_expires_at": "2026-11-29T22:38:40.46085558Z",
  "account_created": false
}
```

`POST /api/driver/v1/documents/upload-sessions` → **201**

```json
{
  "command_id": "d7296f19-383b-4163-be1a-d3ec5335d49f",
  "content_type": "application/pdf",
  "size_bytes": 87
}
```

```json
{
  "file_id": "b3e0a865-9678-4046-99ac-c6cd644ff522",
  "upload_path": "/api/driver/v1/uploads/b3e0a865-9678-4046-99ac-c6cd644ff522",
  "expires_at": "2026-10-30T22:53:40.755985195Z",
  "max_bytes": 87
}
```

`PUT /api/driver/v1/uploads/b3e0a865-9678-4046-99ac-c6cd644ff522` → **200**

```json
{
  "file_id": "b3e0a865-9678-4046-99ac-c6cd644ff522",
  "state": "SAFE",
  "content_type": "application/pdf",
  "size_bytes": 87,
  "reject_reason": null
}
```

## On the server's disk the file is not the PDF

Stored at `driver_document/2026-10/b3e0a865-9678-4046-99ac-c6cd644ff522`, first bytes `425a4631d58655db` (plain: `255044462d312e37` = %PDF-1.7).

## His download is exactly what he uploaded

`GET /api/driver/v1/files/b3e0a865-9678-4046-99ac-c6cd644ff522` → **200**

SHA-256 uploaded `60300c85128faba3fd2bcb95c5f588e8debaa761a02bb549590b29c176aecc3d`, downloaded `60300c85128faba3fd2bcb95c5f588e8debaa761a02bb549590b29c176aecc3d`.

Done: document b3e0a865-9678-4046-99ac-c6cd644ff522 is encrypted on disk and downloads unchanged.

# Scenario: driver-block

## Only Andrii is online; he takes an order and starts the trip

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-12147"
}
```

```json
{
  "challenge_id": "6f7cd4d6-8f56-4560-975b-937840ff0d17",
  "expires_at": "2026-10-30T22:43:41.147625906Z",
  "resend_available_at": "2026-10-30T22:38:42.147625906Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "383473",
  "sent_at": "2026-10-30T22:38:41.150531055Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6f7cd4d6-8f56-4560-975b-937840ff0d17",
  "code": "383473",
  "device_ref": "sandbox-12147"
}
```

```json
{
  "session_id": "d67fbdb4-e737-418d-8f3e-0185dad0a095",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwMDgyMSwiaWF0IjoxNzkzMzk5OTIxLCJqdGkiOiJlNmYyYzk5Ny1lMjk0LTQzYWItYjBlZi04Mzg3Njg2NGE4MGQiLCJzaWQiOiJkNjdmYmRiNC1lNzM3LTQxOGQtOGYzZS0wMTg1ZGFkMGEwOTUifQ.D5evmmw1EZ6lQr-0MQVnp29MDX2rbVnXfg8KiYpoQ6E",
  "access_expires_at": "2026-10-30T22:53:41.462252951Z",
  "refresh_token": "ejvtHPbesUOh3P5SgokrDXmiu3OFOhvBY2Krn6DHP3k",
  "refresh_expires_at": "2026-11-29T22:38:41.461687001Z",
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
  "device_ref": "sandbox-19706"
}
```

```json
{
  "challenge_id": "1065979a-7800-4b8b-98a9-f9b6ac8d0c0e",
  "expires_at": "2026-10-30T22:43:42.029961634Z",
  "resend_available_at": "2026-10-30T22:38:43.029961634Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "769710",
  "sent_at": "2026-10-30T22:38:42.032645681Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1065979a-7800-4b8b-98a9-f9b6ac8d0c0e",
  "code": "769710",
  "device_ref": "sandbox-19706"
}
```

```json
{
  "session_id": "879c226d-5916-4375-8ec3-1047c8012223",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwMDgyMiwiaWF0IjoxNzkzMzk5OTIyLCJqdGkiOiJjMWU2MThjMi05MmI2LTRhMTUtYmRhMC05Y2Q4MWE1ZjY2YzMiLCJzaWQiOiI4NzljMjI2ZC01OTE2LTQzNzUtOGVjMy0xMDQ3YzgwMTIyMjMifQ.Yole6W3RBIn6TC33RikV3Q9D9Rr2KA4Tg_44umHuTMs",
  "access_expires_at": "2026-10-30T22:53:42.348524242Z",
  "refresh_token": "LPOumYzOEab2LpgOPTzEOStcwQrxNLjnDqBPpfGCC4I",
  "refresh_expires_at": "2026-11-29T22:38:42.347981035Z",
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
  "session_id": "6ae60a82-96bc-45bc-8961-e4a684136dd5",
  "subject": {
    "type": "STAFF",
    "id": "09fe1c69-c031-458c-a537-a40fa884b9ac"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwOWZlMWM2OS1jMDMxLTQ1OGMtYTUzNy1hNDBmYTg4NGI5YWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDA4MjMsImlhdCI6MTc5MzM5OTkyMywianRpIjoiOWFkNzdiODItZTk2Yi00Zjg1LWExMjEtMDg4OTZhYWIxMjlhIiwic2lkIjoiNmFlNjBhODItOTZiYy00NWJjLTg5NjEtZTRhNjg0MTM2ZGQ1In0.y1vgedI1R_5Hw4sXCgrS5OAFoiSW86w1qBuDXYHUb-Y",
  "access_expires_at": "2026-10-30T22:53:43.214404632Z",
  "refresh_token": "Ae51dc-646aC5f4Q2ZQ2pQSdlrIQwIbe552PjLphXWM",
  "refresh_expires_at": "2026-10-31T10:38:43.213858369Z",
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
  "session_id": "c945d046-1d2b-40b9-a543-6aa0a4e08b51",
  "subject": {
    "type": "STAFF",
    "id": "09fe1c69-c031-458c-a537-a40fa884b9ac"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwOWZlMWM2OS1jMDMxLTQ1OGMtYTUzNy1hNDBmYTg4NGI5YWMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDA4MjMsImlhdCI6MTc5MzM5OTkyMywianRpIjoiZDA2YjYwYzYtOGNhNi00ZjQxLWJmNTUtNGVmYTc1ODE0OTg3Iiwic2lkIjoiYzk0NWQwNDYtMWQyYi00MGI5LWE1NDMtNmFhMGE0ZTA4YjUxIn0.dhDqNfddBshp_9B0-7R9nu14fikPeSJTv1r_vT9q0ms",
  "access_expires_at": "2026-10-30T22:53:43.807170887Z",
  "refresh_token": "Y2I0LeoN41eSXLkzp0qdqoae8hcxHyepyN5_I3mbXWM",
  "refresh_expires_at": "2026-10-31T10:38:43.806584038Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-18686"
}
```

```json
{
  "challenge_id": "2c546415-d14c-4c8e-af01-989c25fc553e",
  "expires_at": "2026-10-30T22:43:44.088590034Z",
  "resend_available_at": "2026-10-30T22:38:45.088590034Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "500655",
  "sent_at": "2026-10-30T22:38:44.091298273Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2c546415-d14c-4c8e-af01-989c25fc553e",
  "code": "500655",
  "device_ref": "sandbox-18686"
}
```

```json
{
  "session_id": "5142781b-5643-4963-82a1-5fc552e937bd",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwMDgyNCwiaWF0IjoxNzkzMzk5OTI0LCJqdGkiOiI5ZmEwYjcxNS00ZmExLTRiMGYtYjBmMy03MWIxZDdkZDM1OTUiLCJzaWQiOiI1MTQyNzgxYi01NjQzLTQ5NjMtODJhMS01ZmM1NTJlOTM3YmQifQ.6fFQAWQr-2Jc1t6T57M1YHLwGQSuH5J23VUK1PzEIvU",
  "access_expires_at": "2026-10-30T22:53:44.403430598Z",
  "refresh_token": "fQPOvwU6znSRBtuHC9XtxrP32fpY4VLKCfL45sZf5TU",
  "refresh_expires_at": "2026-11-29T22:38:44.402836779Z",
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

(the car drives 59 s to the next point)

`POST /api/driver/v1/work-sessions` → **201**

```json
{
  "command_id": "cde0d7c5-0e25-479e-a092-2c2def3410fa",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4528,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:39:44Z",
    "sequence": 1793399984351
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "916a6a7b-b331-4854-b4c2-f02bc8c9e581",
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
  "last_heartbeat_at": "2026-10-30T22:39:44.054635Z",
  "last_location_at": "2026-10-30T22:39:44.054635Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380686449417",
  "device_ref": "sandbox-14258"
}
```

```json
{
  "challenge_id": "30b16e14-d754-40be-802e-f8f6e7e76d9a",
  "expires_at": "2026-10-30T22:44:44.344283288Z",
  "resend_available_at": "2026-10-30T22:39:45.344283288Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380686449417` → **200**

```json
{
  "phone": "+380686449417",
  "audience": "CLIENT",
  "code": "077212",
  "sent_at": "2026-10-30T22:39:44.348016744Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "30b16e14-d754-40be-802e-f8f6e7e76d9a",
  "code": "077212",
  "device_ref": "sandbox-14258"
}
```

```json
{
  "session_id": "b7bb116c-e2b3-47ea-b23b-290433c655a0",
  "subject": {
    "type": "CLIENT",
    "id": "ff3dae20-45a3-4dc9-b1c1-46e64db57932"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZjNkYWUyMC00NWEzLTRkYzktYjFjMS00NmU2NGRiNTc5MzIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDAwODg0LCJpYXQiOjE3OTMzOTk5ODQsImp0aSI6IjM0MDk1ZmI4LWZjNzEtNGU2Zi1hMTA0LTUxZjVlMmZiMDkyNyIsInNpZCI6ImI3YmIxMTZjLWUyYjMtNDdlYS1iMjNiLTI5MDQzM2M2NTVhMCJ9.Fa3tQczGNLZ-nVCFSP90RRr5ElP6gGLxRKXPeEnoEhk",
  "access_expires_at": "2026-10-30T22:54:44.67032884Z",
  "refresh_token": "vc9kbKd8T2ld0OYszDFAeW4mCLPBuqdg03zVdio1pWY",
  "refresh_expires_at": "2026-11-29T22:39:44.66940989Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d44a61fc-2f3e-4bd2-9afd-db08ffd2643b",
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
  "id": "115c428f-afc3-4cdd-99ec-5c0b2791dde3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T22:44:45.002623Z",
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
  "command_id": "4a129d97-db3e-43a0-b0ad-67e155bbf233",
  "quote_id": "115c428f-afc3-4cdd-99ec-5c0b2791dde3",
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
  "id": "9e0c8f84-f822-4fed-8be8-dfb693e28a58",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ff3dae20-45a3-4dc9-b1c1-46e64db57932",
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
  "created_at": "2026-10-30T22:39:45.336372Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "e9e45694-5476-4a68-9db7-c9543d951aa7",
    "order_id": "9e0c8f84-f822-4fed-8be8-dfb693e28a58",
    "expires_at": "2026-10-30T22:40:00.340215Z",
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

`POST /api/driver/v1/offers/e9e45694-5476-4a68-9db7-c9543d951aa7/accept` → **200**

```json
{
  "command_id": "c30c63c8-d167-4a60-9f88-b48bc1466010"
}
```

```json
{
  "id": "76d02c6f-89a0-426c-b999-61d973a7cdfe",
  "order_id": "9e0c8f84-f822-4fed-8be8-dfb693e28a58",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "0d3fe10f-90a7-4444-b10b-d215915643cf",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "0d3fe10f-90a7-4444-b10b-d215915643cf",
  "order_id": "9e0c8f84-f822-4fed-8be8-dfb693e28a58",
  "assignment_id": "76d02c6f-89a0-426c-b999-61d973a7cdfe",
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

`POST /api/driver/v1/work-sessions/916a6a7b-b331-4854-b4c2-f02bc8c9e581/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:39:50Z",
    "sequence": 1793399990602
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "916a6a7b-b331-4854-b4c2-f02bc8c9e581",
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
  "last_heartbeat_at": "2026-10-30T22:39:50.621327Z",
  "last_location_at": "2026-10-30T22:39:50.621327Z",
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
  "id": "0d3fe10f-90a7-4444-b10b-d215915643cf",
  "order_id": "9e0c8f84-f822-4fed-8be8-dfb693e28a58",
  "assignment_id": "76d02c6f-89a0-426c-b999-61d973a7cdfe",
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

`POST /api/driver/v1/trips/0d3fe10f-90a7-4444-b10b-d215915643cf/arrive` → **200**

```json
{
  "command_id": "90b795ee-6fc8-4a28-ab23-802f5f993c17",
  "expected_version": 0
}
```

```json
{
  "id": "0d3fe10f-90a7-4444-b10b-d215915643cf",
  "order_id": "9e0c8f84-f822-4fed-8be8-dfb693e28a58",
  "assignment_id": "76d02c6f-89a0-426c-b999-61d973a7cdfe",
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
  "arrived_at": "2026-10-30T22:39:51.20184Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/0d3fe10f-90a7-4444-b10b-d215915643cf/start` → **200**

```json
{
  "command_id": "b566081f-8b38-469d-bf96-f1c35f949cf0",
  "expected_version": 1
}
```

```json
{
  "id": "0d3fe10f-90a7-4444-b10b-d215915643cf",
  "order_id": "9e0c8f84-f822-4fed-8be8-dfb693e28a58",
  "assignment_id": "76d02c6f-89a0-426c-b999-61d973a7cdfe",
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
  "arrived_at": "2026-10-30T22:39:51.20184Z",
  "started_at": "2026-10-30T22:39:51.509888Z",
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
  "command_id": "a2407dce-9487-4ce2-8939-559e85471369",
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
  "session_id": "916a6a7b-b331-4854-b4c2-f02bc8c9e581",
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
  "last_heartbeat_at": "2026-10-30T22:39:50.621327Z",
  "last_location_at": "2026-10-30T22:39:50.621327Z",
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
  "id": "0d3fe10f-90a7-4444-b10b-d215915643cf",
  "order_id": "9e0c8f84-f822-4fed-8be8-dfb693e28a58",
  "assignment_id": "76d02c6f-89a0-426c-b999-61d973a7cdfe",
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
  "arrived_at": "2026-10-30T22:39:51.20184Z",
  "started_at": "2026-10-30T22:39:51.509888Z",
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
  "command_id": "7a2be198-37a0-44d7-a77a-ef6c989997e5",
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
  "correlation_id": "086537ee-fb63-4533-a1e9-0b8bd5277183"
}
```

`GET /api/driver/v1/broadcast-orders` → **403**

```json
{
  "instance": "/api/driver/v1/broadcast-orders",
  "status": 403,
  "title": "Account blocked",
  "type": "https://errors.blizz.taxi/account-blocked",
  "code": "ACCOUNT_BLOCKED",
  "correlation_id": "df002309-1621-4f40-bf6a-4b6c07b20b28"
}
```

## He completes the trip and writes to support

(the car drives 46 s to the next point)

`POST /api/driver/v1/work-sessions/916a6a7b-b331-4854-b4c2-f02bc8c9e581/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:40:39Z",
    "sequence": 1793400039899
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "916a6a7b-b331-4854-b4c2-f02bc8c9e581",
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
  "last_heartbeat_at": "2026-10-30T22:40:39.918578Z",
  "last_location_at": "2026-10-30T22:40:39.918578Z",
  "eligible": false,
  "ineligible_reasons": [
    "ACCOUNT_BLOCKED",
    "INTENT_PAUSE_AFTER_CURRENT",
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/0d3fe10f-90a7-4444-b10b-d215915643cf/complete` → **200**

```json
{
  "command_id": "453b83c1-b827-40ec-9909-262ac3502e11",
  "expected_version": 2,
  "reported_at": "2026-10-30T22:40:40Z",
  "cash_received": true
}
```

```json
{
  "id": "0d3fe10f-90a7-4444-b10b-d215915643cf",
  "order_id": "9e0c8f84-f822-4fed-8be8-dfb693e28a58",
  "assignment_id": "76d02c6f-89a0-426c-b999-61d973a7cdfe",
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
  "arrived_at": "2026-10-30T22:39:51.20184Z",
  "started_at": "2026-10-30T22:39:51.509888Z",
  "completed_at": "2026-10-30T22:40:40.221775Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/support/cases` → **201**

```json
{
  "command_id": "151b1b85-54b8-4a9c-b834-5bbf9bfb0bf9",
  "category": "OTHER",
  "subject": "Why is my account blocked?",
  "message": "Please explain."
}
```

```json
{
  "id": "4828281f-3052-47c1-a835-460bbfb7668c",
  "number": 3,
  "city_id": null,
  "category": "OTHER",
  "order_id": null,
  "requester_type": "DRIVER",
  "requester_id": "5a000000-0000-4000-8000-000000000403",
  "subject": "Why is my account blocked?",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T22:40:40.53029Z",
  "updated_at": "2026-10-30T22:40:40.53029Z",
  "respond_by": "2026-10-31T02:40:40.53029Z",
  "messages": [
    {
      "id": "bae0ce13-1726-4fc9-96dc-da0cd00a7f73",
      "sequence": 1,
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000403",
      "visibility": "PUBLIC",
      "body": "Please explain.",
      "created_at": "2026-10-30T22:40:40.531636Z",
      "attachments": []
    }
  ]
}
```

`GET /api/driver/v1/trips` → **200**

```json
{
  "items": [
    {
      "id": "0d3fe10f-90a7-4444-b10b-d215915643cf",
      "order_id": "9e0c8f84-f822-4fed-8be8-dfb693e28a58",
      "order_short_number": 14,
      "created_at": "2026-10-30T22:39:46.005393Z",
      "pickup_label": "Майдан",
      "dropoff_label": "Вокзал",
      "final_price_minor": 10517,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "COMPLETED"
    },
    {
      "id": "9a770882-e1ff-4802-9075-3577adc28d52",
      "order_id": "665ac4a5-b514-488e-825f-18feb84f664e",
      "order_short_number": 11,
      "created_at": "2026-10-30T22:36:06.97437Z",
      "pickup_label": "вул. Дмитрівська",
      "dropoff_label": "Нивки",
      "final_price_minor": 16297,
      "currency": "UAH",
      "payment_method": "CARD",
      "phase": "COMPLETED"
    },
    {
      "id": "1e7116ab-d403-4d00-8dcc-e02fe8c87d99",
      "order_id": "bbc3cd55-c166-4cd9-a59a-3e5e1e0310be",
      "order_short_number": 9,
      "created_at": "2026-10-30T22:35:42.113207Z",
      "pickup_label": "вул. Дмитрівська",
      "dropoff_label": "Нивки",
      "final_price_minor": 16297,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "COMPLETED"
    },
    {
      "id": "cf7056b7-61c7-422d-adf8-17c549789d68",
      "order_id": "40266e4b-d8f6-4f38-8c76-b38f19347f0f",
      "order_short_number": 8,
      "created_at": "2026-10-30T22:35:25.690267Z",
      "pickup_label": "вул. Дмитрівська",
      "dropoff_label": "Нивки",
      "final_price_minor": 16297,
      "currency": "UAH",
      "payment_method": "CARD",
      "phase": "COMPLETED"
    },
    {
      "id": "1e9f12ce-7555-4df0-aa4b-ca8b9025519f",
      "order_id": "b5c1ccd5-58d8-4185-b26e-6163674974a6",
      "order_short_number": 7,
      "created_at": "2026-10-30T22:34:36.430336Z",
      "pickup_label": "Хрещатик, 22",
      "dropoff_label": "Позняки",
      "final_price_minor": null,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "ABORTED"
    }
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
```

## After the trip: not accepting, resuming is refused, the next order is not offered to him

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "916a6a7b-b331-4854-b4c2-f02bc8c9e581",
  "session_version": 2,
  "session_state": "OPEN",
  "intent": "NOT_ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "BLOCKED",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "last_heartbeat_at": "2026-10-30T22:40:39.918578Z",
  "last_location_at": "2026-10-30T22:40:39.918578Z",
  "eligible": false,
  "ineligible_reasons": [
    "ACCOUNT_BLOCKED",
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/work-sessions/916a6a7b-b331-4854-b4c2-f02bc8c9e581/resume` → **403**

```json
{
  "command_id": "9c9dda3c-571a-40f3-bf25-867c5e7e49cd",
  "expected_version": 2
}
```

```json
{
  "instance": "/api/driver/v1/work-sessions/916a6a7b-b331-4854-b4c2-f02bc8c9e581/resume",
  "status": 403,
  "title": "Account blocked",
  "type": "https://errors.blizz.taxi/account-blocked",
  "code": "ACCOUNT_BLOCKED",
  "correlation_id": "52478576-79fe-4c9c-810f-0988a5b30b05"
}
```

(the car drives 46 s to the next point)

`POST /api/driver/v1/work-sessions/916a6a7b-b331-4854-b4c2-f02bc8c9e581/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4528,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:41:30Z",
    "sequence": 1793400090787
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "916a6a7b-b331-4854-b4c2-f02bc8c9e581",
  "session_version": 2,
  "session_state": "OPEN",
  "intent": "NOT_ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "BLOCKED",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "last_heartbeat_at": "2026-10-30T22:41:30.806488Z",
  "last_location_at": "2026-10-30T22:41:30.806488Z",
  "eligible": false,
  "ineligible_reasons": [
    "ACCOUNT_BLOCKED",
    "INTENT_NOT_ACCEPTING"
  ],
  "accepted": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "abcbcf66-92b3-4102-8f5b-70f5cea1465e",
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
  "id": "adc3375f-867a-46d9-b5a1-dbf0869f6bae",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T22:46:31.108679Z",
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
  "command_id": "a1cf568a-20f0-41be-ad09-739678228e07",
  "quote_id": "adc3375f-867a-46d9-b5a1-dbf0869f6bae",
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
  "id": "fc68e613-7010-4256-beb7-19cb344fc9db",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ff3dae20-45a3-4dc9-b1c1-46e64db57932",
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
  "created_at": "2026-10-30T22:41:31.410761Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

`GET /api/driver/v1/offers` → **403**

```json
{
  "instance": "/api/driver/v1/offers",
  "status": 403,
  "title": "Account blocked",
  "type": "https://errors.blizz.taxi/account-blocked",
  "code": "ACCOUNT_BLOCKED",
  "correlation_id": "597d4c33-e7e4-4869-adb2-342e75ce1605"
}
```

`GET /api/operator/v1/orders/fc68e613-7010-4256-beb7-19cb344fc9db` → **200**

```json
{
  "id": "fc68e613-7010-4256-beb7-19cb344fc9db",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ff3dae20-45a3-4dc9-b1c1-46e64db57932",
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
  "created_at": "2026-10-30T22:41:31.410761Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

Done: blocked on trip 0d3fe10f-90a7-4444-b10b-d215915643cf, Andrii completed it and reached support; new work answered ACCOUNT_BLOCKED.

`GET /api/driver/v1/trips/current` → **204**

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
  "command_id": "c3f7d275-be96-4b39-b66e-cb9ecf219b0a",
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

`GET /api/operator/v1/orders/9e0c8f84-f822-4fed-8be8-dfb693e28a58` → **200**

```json
{
  "id": "9e0c8f84-f822-4fed-8be8-dfb693e28a58",
  "short_number": 14,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "ff3dae20-45a3-4dc9-b1c1-46e64db57932",
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
  "payment_state": "CASH_REPORTED",
  "price_minor": 10517,
  "final_price_minor": 10517,
  "currency": "UAH",
  "search_phase": "STOPPED",
  "assignment": {
    "id": "76d02c6f-89a0-426c-b999-61d973a7cdfe",
    "order_id": "9e0c8f84-f822-4fed-8be8-dfb693e28a58",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "0d3fe10f-90a7-4444-b10b-d215915643cf",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T22:39:45.336372Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/fc68e613-7010-4256-beb7-19cb344fc9db` → **200**

```json
{
  "id": "fc68e613-7010-4256-beb7-19cb344fc9db",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ff3dae20-45a3-4dc9-b1c1-46e64db57932",
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
  "created_at": "2026-10-30T22:41:31.410761Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/fc68e613-7010-4256-beb7-19cb344fc9db/cancel` → **200**

```json
{
  "command_id": "d0ae942b-7391-45c5-962c-2455ec274809",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "fc68e613-7010-4256-beb7-19cb344fc9db",
  "short_number": 15,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "ff3dae20-45a3-4dc9-b1c1-46e64db57932",
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
  "created_at": "2026-10-30T22:41:31.410761Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "ru": "Нет свободных машин",
      "en": "No cars available",
      "uk": "Немає вільних авто",
      "pl": "Brak wolnych aut"
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
  "session_id": "916a6a7b-b331-4854-b4c2-f02bc8c9e581",
  "session_version": 2,
  "session_state": "OPEN",
  "intent": "NOT_ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "last_heartbeat_at": "2026-10-30T22:41:30.806488Z",
  "last_location_at": "2026-10-30T22:41:30.806488Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/work-sessions/916a6a7b-b331-4854-b4c2-f02bc8c9e581/close` → **200**

```json
{
  "command_id": "81cd9e53-08bf-421f-8769-51a16e928a9e",
  "expected_version": 2
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

# Scenario: driver-states

## Only the two drivers of this scenario are online: Near about 200 m from the pickup, Far about 600 m

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-29808"
}
```

```json
{
  "challenge_id": "f2cc58b4-124d-47f6-ac56-eb102157d4f7",
  "expires_at": "2026-10-30T22:46:34.505349815Z",
  "resend_available_at": "2026-10-30T22:41:35.505349815Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "687258",
  "sent_at": "2026-10-30T22:41:34.507991278Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f2cc58b4-124d-47f6-ac56-eb102157d4f7",
  "code": "687258",
  "device_ref": "sandbox-29808"
}
```

```json
{
  "session_id": "b9729d9e-aeee-4185-9f70-8db167b99d1c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwMDk5NCwiaWF0IjoxNzkzNDAwMDk0LCJqdGkiOiJmZWE5ZmQ2Yi1lNjAzLTQ3NGQtOGMyNS1mOTRlNjc2YjRmNjYiLCJzaWQiOiJiOTcyOWQ5ZS1hZWVlLTQxODUtOWY3MC04ZGIxNjdiOTlkMWMifQ.A9hUN97TVyWRZYAlNBGBmr-YE92jBZb3AxEvGzs7-cU",
  "access_expires_at": "2026-10-30T22:56:34.814915566Z",
  "refresh_token": "3pi8EDGZpuTnXJNHAE9lWsmk5g7szLwOGUhfZdXDGcg",
  "refresh_expires_at": "2026-11-29T22:41:34.814301336Z",
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
  "device_ref": "sandbox-21493"
}
```

```json
{
  "challenge_id": "9e617d9e-9495-4d4a-b695-be608b23da3a",
  "expires_at": "2026-10-30T22:46:35.400803299Z",
  "resend_available_at": "2026-10-30T22:41:36.400803299Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "752721",
  "sent_at": "2026-10-30T22:41:35.403702488Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9e617d9e-9495-4d4a-b695-be608b23da3a",
  "code": "752721",
  "device_ref": "sandbox-21493"
}
```

```json
{
  "session_id": "b27a58eb-9808-4d7c-9a75-aa495c40034d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwMDk5NSwiaWF0IjoxNzkzNDAwMDk1LCJqdGkiOiJiZGVkOTEyNS1jZjIzLTRmMzAtYmMyYi02ZmUxOGYxNzcwODUiLCJzaWQiOiJiMjdhNThlYi05ODA4LTRkN2MtOWE3NS1hYTQ5NWM0MDAzNGQifQ.Jf-RL87RBQ-c6ExNDiS7cltgHbNdISalJ4ft72GtmW8",
  "access_expires_at": "2026-10-30T22:56:35.711660819Z",
  "refresh_token": "JZXYPm7ZF7a73LaNG8FduotDdyPv4d4oGiveHwdUX7M",
  "refresh_expires_at": "2026-11-29T22:41:35.71106832Z",
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
  "command_id": "2b8e412d-24c5-4a2b-bc0e-d7f59e882173",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:41:36Z",
    "sequence": 1793400096304
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9c5e6635-23b5-49b7-bbaf-9979348bf37f",
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
  "last_heartbeat_at": "2026-10-30T22:41:36.323074Z",
  "last_location_at": "2026-10-30T22:41:36.323074Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-26379"
}
```

```json
{
  "challenge_id": "35f82c59-aed0-47a5-92fb-9c5172bd1b88",
  "expires_at": "2026-10-30T22:46:36.621445008Z",
  "resend_available_at": "2026-10-30T22:41:37.621445008Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "491524",
  "sent_at": "2026-10-30T22:41:36.626137689Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "35f82c59-aed0-47a5-92fb-9c5172bd1b88",
  "code": "491524",
  "device_ref": "sandbox-26379"
}
```

```json
{
  "session_id": "31095e80-4bb5-4e90-a685-c187ad9a6219",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwMDk5NiwiaWF0IjoxNzkzNDAwMDk2LCJqdGkiOiIzYjI0YjI0NC03NzNjLTQ3YjktYmI5MC03NjhmY2JiNzE2M2EiLCJzaWQiOiIzMTA5NWU4MC00YmI1LTRlOTAtYTY4NS1jMTg3YWQ5YTYyMTkifQ.UF8cfKW7t0tlwVGieWaJ2J3qpZuF-cuUSHaWwWWUfaw",
  "access_expires_at": "2026-10-30T22:56:36.936544444Z",
  "refresh_token": "Ovor9QMSm3U6nGJ_dn37kj1fdS8gMp3b0BppfFPS-xY",
  "refresh_expires_at": "2026-11-29T22:41:36.935642386Z",
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
  "command_id": "b2458fa7-c7d7-4c78-b8a5-a55c38048a02",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:41:37Z",
    "sequence": 1793400097539
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "20b39159-dfef-4f4f-bb37-13ce3ff9d1ab",
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
  "last_heartbeat_at": "2026-10-30T22:41:37.557412Z",
  "last_location_at": "2026-10-30T22:41:37.557412Z",
  "eligible": true,
  "ineligible_reasons": []
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
  "session_id": "1da08bc6-196f-480f-bfa9-28ca5064e798",
  "subject": {
    "type": "STAFF",
    "id": "09fe1c69-c031-458c-a537-a40fa884b9ac"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwOWZlMWM2OS1jMDMxLTQ1OGMtYTUzNy1hNDBmYTg4NGI5YWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDA5OTgsImlhdCI6MTc5MzQwMDA5OCwianRpIjoiNTVkYmNjYjktNjEyMS00OGZmLWE2ZDYtYjdjODJjMjg0MDI1Iiwic2lkIjoiMWRhMDhiYzYtMTk2Zi00ODBmLWJmYTktMjhjYTUwNjRlNzk4In0.uKAYYWNoxNJCYC-Sd5_xre_C0QeMVTtSegvI5LXgqeU",
  "access_expires_at": "2026-10-30T22:56:38.144146796Z",
  "refresh_token": "KlHGjDtveLUtyzoxMgVf-CTnkzPL_of7QMjR5ONh8cI",
  "refresh_expires_at": "2026-10-31T10:41:38.14354293Z",
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
  "session_id": "17fa3ce4-5cd3-4664-bada-292ec391afcd",
  "subject": {
    "type": "STAFF",
    "id": "09fe1c69-c031-458c-a537-a40fa884b9ac"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwOWZlMWM2OS1jMDMxLTQ1OGMtYTUzNy1hNDBmYTg4NGI5YWMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDA5OTgsImlhdCI6MTc5MzQwMDA5OCwianRpIjoiMzQ4NjNiYjgtZTMxNy00MzA4LWFiYzUtZjQ3ZGZjZjMzZGRjIiwic2lkIjoiMTdmYTNjZTQtNWNkMy00NjY0LWJhZGEtMjkyZWMzOTFhZmNkIn0.JEoZWc9bUZPp8V1IuyT4aoy2pT_y29fn92kbE5pBEnY",
  "access_expires_at": "2026-10-30T22:56:38.730664082Z",
  "refresh_token": "HkED6AX4g2TbmcAw4wy6LA9mZ-srw8X3QQzfXaOuYNI",
  "refresh_expires_at": "2026-10-31T10:41:38.730076602Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380684336091",
  "device_ref": "sandbox-2777"
}
```

```json
{
  "challenge_id": "8630b3cf-fb9f-4a51-85c2-6886dccef755",
  "expires_at": "2026-10-30T22:46:39.013840818Z",
  "resend_available_at": "2026-10-30T22:41:40.013840818Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380684336091` → **200**

```json
{
  "phone": "+380684336091",
  "audience": "CLIENT",
  "code": "482997",
  "sent_at": "2026-10-30T22:41:39.016475747Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8630b3cf-fb9f-4a51-85c2-6886dccef755",
  "code": "482997",
  "device_ref": "sandbox-2777"
}
```

```json
{
  "session_id": "3318227e-b1ce-420c-8b4b-b06d3553ab41",
  "subject": {
    "type": "CLIENT",
    "id": "9d3f770e-0180-4312-bc7e-711f7bc04c9d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZDNmNzcwZS0wMTgwLTQzMTItYmM3ZS03MTFmN2JjMDRjOWQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDAwOTk5LCJpYXQiOjE3OTM0MDAwOTksImp0aSI6IjRiZDRhY2JhLTU0MTgtNGIyZi05MzVkLWQ2MGY5ZjcyY2ExMSIsInNpZCI6IjMzMTgyMjdlLWIxY2UtNDIwYy04YjRiLWIwNmQzNTUzYWI0MSJ9.r72F8ZCHqlR3M-mBfOuB_vl9FHu2WChh1IgIvB8CDu0",
  "access_expires_at": "2026-10-30T22:56:39.335627888Z",
  "refresh_token": "6R-XMlLFSvzZ0xSM51wR7WmMccS8yF3ynozIIYJ-smA",
  "refresh_expires_at": "2026-11-29T22:41:39.335103617Z",
  "account_created": true
}
```

## E2: Near has the offer and pauses: the offer is revoked and Far gets the order at once

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6a6133c8-534f-429b-b73e-c65ea67d6adb",
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
  "id": "2f5a4d3e-2edc-4c2c-b4b4-b066d660ef4e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T22:46:39.636804Z",
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
  "command_id": "2ff63a71-ac8f-48d5-8b4f-c358df0e8d89",
  "quote_id": "2f5a4d3e-2edc-4c2c-b4b4-b066d660ef4e",
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
  "id": "56a28fa4-5d56-49be-8c42-2771c22cfde9",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9d3f770e-0180-4312-bc7e-711f7bc04c9d",
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
  "created_at": "2026-10-30T22:41:39.946731Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "2dbdf2a1-f3bd-49fb-97fe-42c3fc1f7287",
    "order_id": "56a28fa4-5d56-49be-8c42-2771c22cfde9",
    "expires_at": "2026-10-30T22:41:54.950237Z",
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

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9c5e6635-23b5-49b7-bbaf-9979348bf37f",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "OFFERED",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T22:41:36.323074Z",
  "last_location_at": "2026-10-30T22:41:36.323074Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

`POST /api/driver/v1/work-sessions/9c5e6635-23b5-49b7-bbaf-9979348bf37f/pause` → **200**

```json
{
  "command_id": "4605f58d-259c-472f-9cb0-a37a0beca8e3",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9c5e6635-23b5-49b7-bbaf-9979348bf37f",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "NOT_ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T22:41:36.323074Z",
  "last_location_at": "2026-10-30T22:41:36.323074Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/offers/2dbdf2a1-f3bd-49fb-97fe-42c3fc1f7287/accept` → **409**

```json
{
  "command_id": "c7ef9dff-98e7-40c9-988e-5494d8708ceb"
}
```

```json
{
  "instance": "/api/driver/v1/offers/2dbdf2a1-f3bd-49fb-97fe-42c3fc1f7287/accept",
  "status": 409,
  "title": "Offer revoked",
  "type": "https://errors.blizz.taxi/offer-revoked",
  "code": "OFFER_REVOKED",
  "correlation_id": "1d7b2384-221b-4677-812f-eff944776819"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "df90d680-7455-4e02-b6c1-04f1615af12c",
    "order_id": "56a28fa4-5d56-49be-8c42-2771c22cfde9",
    "expires_at": "2026-10-30T22:41:55.868734Z",
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

`POST /api/driver/v1/offers/df90d680-7455-4e02-b6c1-04f1615af12c/reject` → **204**

```json
{
  "command_id": "8fec5c12-c2d1-4d82-8883-def2603b1d05"
}
```

`GET /api/operator/v1/orders/56a28fa4-5d56-49be-8c42-2771c22cfde9/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T22:41:39.947239Z",
      "actor": {
        "type": "CLIENT",
        "id": "9d3f770e-0180-4312-bc7e-711f7bc04c9d",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "56a28fa4-5d56-49be-8c42-2771c22cfde9",
        "quote_id": "2f5a4d3e-2edc-4c2c-b4b4-b066d660ef4e",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "1abf096b-bd76-4836-8d4b-094f48ae3e59"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T22:41:39.949418Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "56a28fa4-5d56-49be-8c42-2771c22cfde9",
        "attempt_id": "26a4adf1-cfc5-4e19-a11b-afa140bd39dd",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "1abf096b-bd76-4836-8d4b-094f48ae3e59"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T22:41:39.953605Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "2dbdf2a1-f3bd-49fb-97fe-42c3fc1f7287",
        "order_id": "56a28fa4-5d56-49be-8c42-2771c22cfde9",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200,
        "expires_at": "2026-10-30T22:41:54.950237337Z"
      },
      "correlation_id": "1abf096b-bd76-4836-8d4b-094f48ae3e59"
    },
    {
      "sequence": 3,
      "type": "OfferRevoked",
      "occurred_at": "2026-10-30T22:41:40.867874Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": "DRIVER_PAUSED",
      "details": {
        "reason": "DRIVER_PAUSED",
        "offer_id": "2dbdf2a1-f3bd-49fb-97fe-42c3fc1f7287",
        "order_id": "56a28fa4-5d56-49be-8c42-2771c22cfde9",
        "driver_id": "5a000000-0000-4000-8000-000000000401"
      },
      "correlation_id": "0cf8ef87-aafe-46ec-a938-3149ecd4c29a"
```

`GET /api/operator/v1/orders/56a28fa4-5d56-49be-8c42-2771c22cfde9` → **200**

```json
{
  "id": "56a28fa4-5d56-49be-8c42-2771c22cfde9",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "9d3f770e-0180-4312-bc7e-711f7bc04c9d",
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
  "created_at": "2026-10-30T22:41:39.946731Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/56a28fa4-5d56-49be-8c42-2771c22cfde9/cancel` → **200**

```json
{
  "command_id": "0aa48fcd-e720-4610-9431-0e33851d00f7",
  "expected_version": 6,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "56a28fa4-5d56-49be-8c42-2771c22cfde9",
  "short_number": 16,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 7,
  "channel": "APP",
  "payer_client_id": "9d3f770e-0180-4312-bc7e-711f7bc04c9d",
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
  "created_at": "2026-10-30T22:41:39.946731Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "ru": "Нет свободных машин",
      "en": "No cars available",
      "uk": "Немає вільних авто",
      "pl": "Brak wolnych aut"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

E2: offer 2dbdf2a1-f3bd-49fb-97fe-42c3fc1f7287 revoked by the pause, the late accept got OFFER_REVOKED, Far had the order next.

## E5: pause and accept sent at the same moment, five rounds; Far is offline so each order goes to Near

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "20b39159-dfef-4f4f-bb37-13ce3ff9d1ab",
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
  "last_heartbeat_at": "2026-10-30T22:41:37.557412Z",
  "last_location_at": "2026-10-30T22:41:37.557412Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/20b39159-dfef-4f4f-bb37-13ce3ff9d1ab/close` → **200**

```json
{
  "command_id": "91cf7f9a-53ca-4435-82db-b5967d22859a",
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

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9c5e6635-23b5-49b7-bbaf-9979348bf37f",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "NOT_ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T22:41:36.323074Z",
  "last_location_at": "2026-10-30T22:41:36.323074Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/work-sessions/9c5e6635-23b5-49b7-bbaf-9979348bf37f/resume` → **200**

```json
{
  "command_id": "a653ad82-50e9-4515-9d4b-8dd713d122e1",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9c5e6635-23b5-49b7-bbaf-9979348bf37f",
  "session_version": 2,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T22:41:36.323074Z",
  "last_location_at": "2026-10-30T22:41:36.323074Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9c5e6635-23b5-49b7-bbaf-9979348bf37f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:41:43Z",
    "sequence": 1793400103959
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9c5e6635-23b5-49b7-bbaf-9979348bf37f",
  "session_version": 2,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T22:41:43.977493Z",
  "last_location_at": "2026-10-30T22:41:43.977493Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "81b9eb6b-03a0-4612-8156-2e5aa3e49774",
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
  "id": "84e364c4-3143-4459-a26d-c6d0f92f3138",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T22:46:44.273072Z",
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
  "command_id": "a484c177-6fe8-4158-9903-cd7cda6e52cd",
  "quote_id": "84e364c4-3143-4459-a26d-c6d0f92f3138",
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
  "id": "e1b1830c-0c57-4f92-8148-4db03a68466f",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9d3f770e-0180-4312-bc7e-711f7bc04c9d",
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
  "created_at": "2026-10-30T22:41:44.580743Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "b3639c04-8c47-4a53-b14a-a9a9c737511d",
    "order_id": "e1b1830c-0c57-4f92-8148-4db03a68466f",
    "expires_at": "2026-10-30T22:41:59.583627Z",
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

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9c5e6635-23b5-49b7-bbaf-9979348bf37f",
  "session_version": 2,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "OFFERED",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T22:41:43.977493Z",
  "last_location_at": "2026-10-30T22:41:43.977493Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

Round 1, at the same moment:

`POST /api/driver/v1/offers/b3639c04-8c47-4a53-b14a-a9a9c737511d/accept` → **200**

```json
{
  "id": "f9585c10-abf9-4230-ab44-124341367183",
  "order_id": "e1b1830c-0c57-4f92-8148-4db03a68466f",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "7542e3d2-3203-436c-96ab-c91e7fc66e12",
  "trip_phase": "TO_PICKUP"
}
```

`POST /api/driver/v1/work-sessions/9c5e6635-23b5-49b7-bbaf-9979348bf37f/pause` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9c5e6635-23b5-49b7-bbaf-9979348bf37f",
  "session_version": 3,
  "session_state": "OPEN",
  "intent": "PAUSE_AFTER_CURRENT",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T22:41:43.977493Z",
  "last_location_at": "2026-10-30T22:41:43.977493Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_PAUSE_AFTER_CURRENT",
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

Round 1: the accept won; the pause waits for the end of the trip.

`GET /api/operator/v1/orders/e1b1830c-0c57-4f92-8148-4db03a68466f` → **200**

```json
{
  "id": "e1b1830c-0c57-4f92-8148-4db03a68466f",
  "short_number": 17,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "9d3f770e-0180-4312-bc7e-711f7bc04c9d",
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
    "id": "f9585c10-abf9-4230-ab44-124341367183",
    "order_id": "e1b1830c-0c57-4f92-8148-4db03a68466f",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "7542e3d2-3203-436c-96ab-c91e7fc66e12",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T22:41:44.580743Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/e1b1830c-0c57-4f92-8148-4db03a68466f` → **200**

```json
{
  "id": "e1b1830c-0c57-4f92-8148-4db03a68466f",
  "short_number": 17,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "9d3f770e-0180-4312-bc7e-711f7bc04c9d",
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
    "id": "f9585c10-abf9-4230-ab44-124341367183",
    "order_id": "e1b1830c-0c57-4f92-8148-4db03a68466f",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "7542e3d2-3203-436c-96ab-c91e7fc66e12",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T22:41:44.580743Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/e1b1830c-0c57-4f92-8148-4db03a68466f/cancel` → **200**

```json
{
  "command_id": "c3274d9c-11d9-441d-afd3-6483537456f3",
  "expected_version": 3,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "e1b1830c-0c57-4f92-8148-4db03a68466f",
  "short_number": 17,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "9d3f770e-0180-4312-bc7e-711f7bc04c9d",
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
    "id": "f9585c10-abf9-4230-ab44-124341367183",
    "order_id": "e1b1830c-0c57-4f92-8148-4db03a68466f",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "7542e3d2-3203-436c-96ab-c91e7fc66e12",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T22:41:44.580743Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "ru": "Нет свободных машин",
      "en": "No cars available",
      "uk": "Немає вільних авто",
      "pl": "Brak wolnych aut"
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
  "session_id": "9c5e6635-23b5-49b7-bbaf-9979348bf37f",
  "session_version": 4,
  "session_state": "OPEN",
  "intent": "NOT_ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T22:41:43.977493Z",
  "last_location_at": "2026-10-30T22:41:43.977493Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/work-sessions/9c5e6635-23b5-49b7-bbaf-9979348bf37f/resume` → **200**

```json
{
  "command_id": "bb9c44c8-267b-4d95-8fa3-89aea4633d52",
  "expected_version": 4
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9c5e6635-23b5-49b7-bbaf-9979348bf37f",
  "session_version": 5,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T22:41:43.977493Z",
  "last_location_at": "2026-10-30T22:41:43.977493Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9c5e6635-23b5-49b7-bbaf-9979348bf37f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:41:47Z",
    "sequence": 1793400107231
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9c5e6635-23b5-49b7-bbaf-9979348bf37f",
  "session_version": 5,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T22:41:47.251167Z",
  "last_location_at": "2026-10-30T22:41:47.251167Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "09f04ae8-be07-490b-91d9-9cab7663899f",
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
  "id": "6a4335b8-4fe6-4ab3-8b59-79c504b2a4f1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T22:46:47.561254Z",
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
  "command_id": "0f5d4c54-9955-444e-b0c1-9b65042beb47",
  "quote_id": "6a4335b8-4fe6-4ab3-8b59-79c504b2a4f1",
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
  "id": "960edaae-71d7-4cb7-ac45-6adbcd6b4cc5",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9d3f770e-0180-4312-bc7e-711f7bc04c9d",
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
  "created_at": "2026-10-30T22:41:47.87195Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "d8fe3424-de8c-47f1-82c5-ef263d455ad8",
    "order_id": "960edaae-71d7-4cb7-ac45-6adbcd6b4cc5",
    "expires_at": "2026-10-30T22:42:02.876358Z",
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

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9c5e6635-23b5-49b7-bbaf-9979348bf37f",
  "session_version": 5,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "OFFERED",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T22:41:47.251167Z",
  "last_location_at": "2026-10-30T22:41:47.251167Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

Round 2, at the same moment:

`POST /api/driver/v1/offers/d8fe3424-de8c-47f1-82c5-ef263d455ad8/accept` → **200**

```json
{
  "id": "32f95d4c-c277-46da-b3fa-54b281e4d31d",
  "order_id": "960edaae-71d7-4cb7-ac45-6adbcd6b4cc5",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "cbd3a975-bcda-4f8f-9186-9bbcb8bcdf41",
  "trip_phase": "TO_PICKUP"
}
```

`POST /api/driver/v1/work-sessions/9c5e6635-23b5-49b7-bbaf-9979348bf37f/pause` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9c5e6635-23b5-49b7-bbaf-9979348bf37f",
  "session_version": 6,
  "session_state": "OPEN",
  "intent": "PAUSE_AFTER_CURRENT",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T22:41:47.251167Z",
  "last_location_at": "2026-10-30T22:41:47.251167Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_PAUSE_AFTER_CURRENT",
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

Round 2: the accept won; the pause waits for the end of the trip.

`GET /api/operator/v1/orders/960edaae-71d7-4cb7-ac45-6adbcd6b4cc5` → **200**

```json
{
  "id": "960edaae-71d7-4cb7-ac45-6adbcd6b4cc5",
  "short_number": 18,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "9d3f770e-0180-4312-bc7e-711f7bc04c9d",
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
    "id": "32f95d4c-c277-46da-b3fa-54b281e4d31d",
    "order_id": "960edaae-71d7-4cb7-ac45-6adbcd6b4cc5",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "cbd3a975-bcda-4f8f-9186-9bbcb8bcdf41",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T22:41:47.87195Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/960edaae-71d7-4cb7-ac45-6adbcd6b4cc5` → **200**

```json
{
  "id": "960edaae-71d7-4cb7-ac45-6adbcd6b4cc5",
  "short_number": 18,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "9d3f770e-0180-4312-bc7e-711f7bc04c9d",
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
    "id": "32f95d4c-c277-46da-b3fa-54b281e4d31d",
    "order_id": "960edaae-71d7-4cb7-ac45-6adbcd6b4cc5",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "cbd3a975-bcda-4f8f-9186-9bbcb8bcdf41",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T22:41:47.87195Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/960edaae-71d7-4cb7-ac45-6adbcd6b4cc5/cancel` → **200**

```json
{
  "command_id": "5c754ce8-497a-4608-8369-f1a086c84bd9",
  "expected_version": 3,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "960edaae-71d7-4cb7-ac45-6adbcd6b4cc5",
  "short_number": 18,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "9d3f770e-0180-4312-bc7e-711f7bc04c9d",
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
    "id": "32f95d4c-c277-46da-b3fa-54b281e4d31d",
    "order_id": "960edaae-71d7-4cb7-ac45-6adbcd6b4cc5",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "cbd3a975-bcda-4f8f-9186-9bbcb8bcdf41",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T22:41:47.87195Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "ru": "Нет свободных машин",
      "en": "No cars available",
      "uk": "Немає вільних авто",
      "pl": "Brak wolnych aut"
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
  "session_id": "9c5e6635-23b5-49b7-bbaf-9979348bf37f",
  "session_version": 7,
  "session_state": "OPEN",
  "intent": "NOT_ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T22:41:47.251167Z",
  "last_location_at": "2026-10-30T22:41:47.251167Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/work-sessions/9c5e6635-23b5-49b7-bbaf-9979348bf37f/resume` → **200**

```json
{
  "command_id": "764980af-161f-46f9-aef7-ecef57ba42db",
  "expected_version": 7
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9c5e6635-23b5-49b7-bbaf-9979348bf37f",
  "session_version": 8,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T22:41:47.251167Z",
  "last_location_at": "2026-10-30T22:41:47.251167Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9c5e6635-23b5-49b7-bbaf-9979348bf37f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:41:50Z",
    "sequence": 1793400110394
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9c5e6635-23b5-49b7-bbaf-9979348bf37f",
  "session_version": 8,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T22:41:50.412942Z",
  "last_location_at": "2026-10-30T22:41:50.412942Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a70839bc-4711-42d2-bfc9-0f76a708a89d",
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
  "id": "91dd8d26-8840-4e38-8cb6-6ab31dbd7e71",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T22:46:50.723669Z",
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
  "command_id": "862b440d-1b05-4299-8768-4a8830abaa1d",
  "quote_id": "91dd8d26-8840-4e38-8cb6-6ab31dbd7e71",
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
  "id": "974033c5-23ed-4ac9-a1e0-eecc432592fd",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9d3f770e-0180-4312-bc7e-711f7bc04c9d",
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
  "created_at": "2026-10-30T22:41:51.029283Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "eab6aab2-b020-42bf-b4ac-29c93c756955",
    "order_id": "974033c5-23ed-4ac9-a1e0-eecc432592fd",
    "expires_at": "2026-10-30T22:42:06.033415Z",
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

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9c5e6635-23b5-49b7-bbaf-9979348bf37f",
  "session_version": 8,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "OFFERED",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T22:41:50.412942Z",
  "last_location_at": "2026-10-30T22:41:50.412942Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

Round 3, at the same moment:

`POST /api/driver/v1/offers/eab6aab2-b020-42bf-b4ac-29c93c756955/accept` → **200**

```json
{
  "id": "344a0563-b76a-4b7c-b103-115527a0540f",
  "order_id": "974033c5-23ed-4ac9-a1e0-eecc432592fd",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "dffa03ee-5ff6-4038-93f7-313f95b1675e",
  "trip_phase": "TO_PICKUP"
}
```

`POST /api/driver/v1/work-sessions/9c5e6635-23b5-49b7-bbaf-9979348bf37f/pause` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9c5e6635-23b5-49b7-bbaf-9979348bf37f",
  "session_version": 9,
  "session_state": "OPEN",
  "intent": "PAUSE_AFTER_CURRENT",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T22:41:50.412942Z",
  "last_location_at": "2026-10-30T22:41:50.412942Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_PAUSE_AFTER_CURRENT",
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

Round 3: the accept won; the pause waits for the end of the trip.

`GET /api/operator/v1/orders/974033c5-23ed-4ac9-a1e0-eecc432592fd` → **200**

```json
{
  "id": "974033c5-23ed-4ac9-a1e0-eecc432592fd",
  "short_number": 19,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "9d3f770e-0180-4312-bc7e-711f7bc04c9d",
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
    "id": "344a0563-b76a-4b7c-b103-115527a0540f",
    "order_id": "974033c5-23ed-4ac9-a1e0-eecc432592fd",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "dffa03ee-5ff6-4038-93f7-313f95b1675e",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T22:41:51.029283Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/974033c5-23ed-4ac9-a1e0-eecc432592fd` → **200**

```json
{
  "id": "974033c5-23ed-4ac9-a1e0-eecc432592fd",
  "short_number": 19,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "9d3f770e-0180-4312-bc7e-711f7bc04c9d",
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
    "id": "344a0563-b76a-4b7c-b103-115527a0540f",
    "order_id": "974033c5-23ed-4ac9-a1e0-eecc432592fd",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "dffa03ee-5ff6-4038-93f7-313f95b1675e",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T22:41:51.029283Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/974033c5-23ed-4ac9-a1e0-eecc432592fd/cancel` → **200**

```json
{
  "command_id": "3c7a85b1-a0d2-4cc4-ac44-26ae5979bd88",
  "expected_version": 3,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "974033c5-23ed-4ac9-a1e0-eecc432592fd",
  "short_number": 19,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "9d3f770e-0180-4312-bc7e-711f7bc04c9d",
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
    "id": "344a0563-b76a-4b7c-b103-115527a0540f",
    "order_id": "974033c5-23ed-4ac9-a1e0-eecc432592fd",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "dffa03ee-5ff6-4038-93f7-313f95b1675e",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T22:41:51.029283Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "ru": "Нет свободных машин",
      "en": "No cars available",
      "uk": "Немає вільних авто",
      "pl": "Brak wolnych aut"
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
  "session_id": "9c5e6635-23b5-49b7-bbaf-9979348bf37f",
  "session_version": 10,
  "session_state": "OPEN",
  "intent": "NOT_ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T22:41:50.412942Z",
  "last_location_at": "2026-10-30T22:41:50.412942Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/work-sessions/9c5e6635-23b5-49b7-bbaf-9979348bf37f/resume` → **200**

```json
{
  "command_id": "411396ff-e667-4226-94a0-3786e4c83f20",
  "expected_version": 10
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9c5e6635-23b5-49b7-bbaf-9979348bf37f",
  "session_version": 11,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T22:41:50.412942Z",
  "last_location_at": "2026-10-30T22:41:50.412942Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9c5e6635-23b5-49b7-bbaf-9979348bf37f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:41:53Z",
    "sequence": 1793400113559
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9c5e6635-23b5-49b7-bbaf-9979348bf37f",
  "session_version": 11,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T22:41:53.5787Z",
  "last_location_at": "2026-10-30T22:41:53.5787Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "0edd14ed-f4e7-4d88-abf9-96759e0c5da6",
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
  "id": "acb9a3eb-d607-4b8c-a7ed-9628c6e6e6ec",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T22:46:53.886512Z",
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
  "command_id": "7d891f88-2cb8-4a06-a49d-d1cb21760127",
  "quote_id": "acb9a3eb-d607-4b8c-a7ed-9628c6e6e6ec",
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
  "id": "0fd1399a-a1bb-406a-841a-18d0590e5bc2",
  "short_number": 20,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9d3f770e-0180-4312-bc7e-711f7bc04c9d",
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
  "created_at": "2026-10-30T22:41:54.194571Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "c83a18e9-79e4-4ce6-9bcc-9242a6423fb2",
    "order_id": "0fd1399a-a1bb-406a-841a-18d0590e5bc2",
    "expires_at": "2026-10-30T22:42:09.198257Z",
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

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9c5e6635-23b5-49b7-bbaf-9979348bf37f",
  "session_version": 11,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "OFFERED",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T22:41:53.5787Z",
  "last_location_at": "2026-10-30T22:41:53.5787Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

Round 4, at the same moment:

`POST /api/driver/v1/offers/c83a18e9-79e4-4ce6-9bcc-9242a6423fb2/accept` → **409**

```json
{
  "instance": "/api/driver/v1/offers/c83a18e9-79e4-4ce6-9bcc-9242a6423fb2/accept",
  "status": 409,
  "title": "Offer revoked",
  "type": "https://errors.blizz.taxi/offer-revoked",
  "code": "OFFER_REVOKED",
  "correlation_id": "001c7e11-9a88-4cf8-8a6c-254f1a390bd4"
}
```

`POST /api/driver/v1/work-sessions/9c5e6635-23b5-49b7-bbaf-9979348bf37f/pause` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9c5e6635-23b5-49b7-bbaf-9979348bf37f",
  "session_version": 12,
  "session_state": "OPEN",
  "intent": "NOT_ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T22:41:53.5787Z",
  "last_location_at": "2026-10-30T22:41:53.5787Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

Round 4: the pause won; the accept got OFFER_REVOKED.

`GET /api/operator/v1/orders/0fd1399a-a1bb-406a-841a-18d0590e5bc2` → **200**

```json
{
  "id": "0fd1399a-a1bb-406a-841a-18d0590e5bc2",
  "short_number": 20,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "9d3f770e-0180-4312-bc7e-711f7bc04c9d",
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
  "created_at": "2026-10-30T22:41:54.194571Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/0fd1399a-a1bb-406a-841a-18d0590e5bc2` → **200**

```json
{
  "id": "0fd1399a-a1bb-406a-841a-18d0590e5bc2",
  "short_number": 20,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "9d3f770e-0180-4312-bc7e-711f7bc04c9d",
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
  "created_at": "2026-10-30T22:41:54.194571Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/0fd1399a-a1bb-406a-841a-18d0590e5bc2/cancel` → **200**

```json
{
  "command_id": "c47f3bbd-f045-4584-908c-72bc0302c4b8",
  "expected_version": 4,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "0fd1399a-a1bb-406a-841a-18d0590e5bc2",
  "short_number": 20,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "9d3f770e-0180-4312-bc7e-711f7bc04c9d",
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
  "created_at": "2026-10-30T22:41:54.194571Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "ru": "Нет свободных машин",
      "en": "No cars available",
      "uk": "Немає вільних авто",
      "pl": "Brak wolnych aut"
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
  "session_id": "9c5e6635-23b5-49b7-bbaf-9979348bf37f",
  "session_version": 12,
  "session_state": "OPEN",
  "intent": "NOT_ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T22:41:53.5787Z",
  "last_location_at": "2026-10-30T22:41:53.5787Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/work-sessions/9c5e6635-23b5-49b7-bbaf-9979348bf37f/resume` → **200**

```json
{
  "command_id": "1645373b-dc1a-4a7c-adc2-31e2681a20d1",
  "expected_version": 12
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9c5e6635-23b5-49b7-bbaf-9979348bf37f",
  "session_version": 13,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T22:41:53.5787Z",
  "last_location_at": "2026-10-30T22:41:53.5787Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9c5e6635-23b5-49b7-bbaf-9979348bf37f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:41:56Z",
    "sequence": 1793400116748
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9c5e6635-23b5-49b7-bbaf-9979348bf37f",
  "session_version": 13,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T22:41:56.767804Z",
  "last_location_at": "2026-10-30T22:41:56.767804Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "210d5fc5-5230-461e-bc20-fb6d5a1459d0",
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
  "id": "383b1350-0f8c-4336-a9c6-694d2df72189",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T22:46:57.070403Z",
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
  "command_id": "61c0cad8-3921-4e67-bbb6-ca20983d250d",
  "quote_id": "383b1350-0f8c-4336-a9c6-694d2df72189",
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
  "id": "e9e6bf19-3749-4f34-99fa-7e8cffd3e84c",
  "short_number": 21,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9d3f770e-0180-4312-bc7e-711f7bc04c9d",
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
  "created_at": "2026-10-30T22:41:57.375009Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "a37ddf4e-b6de-454c-b037-6f5e7a320659",
    "order_id": "e9e6bf19-3749-4f34-99fa-7e8cffd3e84c",
    "expires_at": "2026-10-30T22:42:12.378443Z",
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

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9c5e6635-23b5-49b7-bbaf-9979348bf37f",
  "session_version": 13,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "OFFERED",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T22:41:56.767804Z",
  "last_location_at": "2026-10-30T22:41:56.767804Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

Round 5, at the same moment:

`POST /api/driver/v1/offers/a37ddf4e-b6de-454c-b037-6f5e7a320659/accept` → **200**

```json
{
  "id": "6dec107d-f7e5-4d6d-af62-f30c73b98f79",
  "order_id": "e9e6bf19-3749-4f34-99fa-7e8cffd3e84c",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "9d7f1ed3-dec0-4024-9475-93e845b3d214",
  "trip_phase": "TO_PICKUP"
}
```

`POST /api/driver/v1/work-sessions/9c5e6635-23b5-49b7-bbaf-9979348bf37f/pause` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9c5e6635-23b5-49b7-bbaf-9979348bf37f",
  "session_version": 14,
  "session_state": "OPEN",
  "intent": "PAUSE_AFTER_CURRENT",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T22:41:56.767804Z",
  "last_location_at": "2026-10-30T22:41:56.767804Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_PAUSE_AFTER_CURRENT",
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

Round 5: the accept won; the pause waits for the end of the trip.

`GET /api/operator/v1/orders/e9e6bf19-3749-4f34-99fa-7e8cffd3e84c` → **200**

```json
{
  "id": "e9e6bf19-3749-4f34-99fa-7e8cffd3e84c",
  "short_number": 21,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "9d3f770e-0180-4312-bc7e-711f7bc04c9d",
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
    "id": "6dec107d-f7e5-4d6d-af62-f30c73b98f79",
    "order_id": "e9e6bf19-3749-4f34-99fa-7e8cffd3e84c",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "9d7f1ed3-dec0-4024-9475-93e845b3d214",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T22:41:57.375009Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/e9e6bf19-3749-4f34-99fa-7e8cffd3e84c` → **200**

```json
{
  "id": "e9e6bf19-3749-4f34-99fa-7e8cffd3e84c",
  "short_number": 21,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "9d3f770e-0180-4312-bc7e-711f7bc04c9d",
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
    "id": "6dec107d-f7e5-4d6d-af62-f30c73b98f79",
    "order_id": "e9e6bf19-3749-4f34-99fa-7e8cffd3e84c",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "9d7f1ed3-dec0-4024-9475-93e845b3d214",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T22:41:57.375009Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/e9e6bf19-3749-4f34-99fa-7e8cffd3e84c/cancel` → **200**

```json
{
  "command_id": "626e9251-675b-4ea9-9f39-193e5a7ea062",
  "expected_version": 3,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "e9e6bf19-3749-4f34-99fa-7e8cffd3e84c",
  "short_number": 21,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "9d3f770e-0180-4312-bc7e-711f7bc04c9d",
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
    "id": "6dec107d-f7e5-4d6d-af62-f30c73b98f79",
    "order_id": "e9e6bf19-3749-4f34-99fa-7e8cffd3e84c",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "9d7f1ed3-dec0-4024-9475-93e845b3d214",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T22:41:57.375009Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "ru": "Нет свободных машин",
      "en": "No cars available",
      "uk": "Немає вільних авто",
      "pl": "Brak wolnych aut"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

E5: 4 rounds won by the accept, 1 by the pause; one winner each round, no 5xx.

## E4: a fix with 250 m accuracy keeps Near out of new orders; an accurate one brings him back

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9c5e6635-23b5-49b7-bbaf-9979348bf37f",
  "session_version": 15,
  "session_state": "OPEN",
  "intent": "NOT_ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T22:41:56.767804Z",
  "last_location_at": "2026-10-30T22:41:56.767804Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/work-sessions/9c5e6635-23b5-49b7-bbaf-9979348bf37f/resume` → **200**

```json
{
  "command_id": "333010ed-e735-41db-b5c4-7f79fcfcc15d",
  "expected_version": 15
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9c5e6635-23b5-49b7-bbaf-9979348bf37f",
  "session_version": 16,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T22:41:56.767804Z",
  "last_location_at": "2026-10-30T22:41:56.767804Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9c5e6635-23b5-49b7-bbaf-9979348bf37f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 250,
    "recorded_at": "2026-10-30T22:41:59Z",
    "sequence": 1793400119927
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9c5e6635-23b5-49b7-bbaf-9979348bf37f",
  "session_version": 16,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T22:41:59.94731Z",
  "last_location_at": "2026-10-30T22:41:59.94731Z",
  "eligible": false,
  "ineligible_reasons": [
    "LOCATION_INACCURATE"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/work-sessions/9c5e6635-23b5-49b7-bbaf-9979348bf37f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:42:00Z",
    "sequence": 1793400120240
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9c5e6635-23b5-49b7-bbaf-9979348bf37f",
  "session_version": 16,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T22:42:00.259648Z",
  "last_location_at": "2026-10-30T22:42:00.259648Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

## The support map shows when Near was last heard from

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-30T22:42:00.562685838Z",
  "drivers": [
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
        "lat": 50.4519,
        "lon": 30.5234
      },
      "last_location_at": "2026-10-30T22:42:00.259648Z",
      "last_heartbeat_at": "2026-10-30T22:42:00.259648Z",
      "order_id": null
    }
  ]
}
```

Done: E2, E5 (4/1), E4 and last_heartbeat_at 2026-10-30T22:42:00.259648Z.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9c5e6635-23b5-49b7-bbaf-9979348bf37f",
  "session_version": 16,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T22:42:00.259648Z",
  "last_location_at": "2026-10-30T22:42:00.259648Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9c5e6635-23b5-49b7-bbaf-9979348bf37f/close` → **200**

```json
{
  "command_id": "72aadb19-d020-40bb-8ad7-b215018b0b4e",
  "expected_version": 16
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
  "session_id": "edb04588-6937-46e4-9b19-596080749ae0",
  "subject": {
    "type": "STAFF",
    "id": "09fe1c69-c031-458c-a537-a40fa884b9ac"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwOWZlMWM2OS1jMDMxLTQ1OGMtYTUzNy1hNDBmYTg4NGI5YWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDEwMjIsImlhdCI6MTc5MzQwMDEyMiwianRpIjoiNTAxNmZmNWYtZGJjZi00YTRkLWJiYWMtMWRmZDgyNjkzZGZiIiwic2lkIjoiZWRiMDQ1ODgtNjkzNy00NmU0LTliMTktNTk2MDgwNzQ5YWUwIn0.lHD3ge5pxZ9zOeUJ4KSEaaT5-py7MaGLDdygEgYizNY",
  "access_expires_at": "2026-10-30T22:57:02.061077941Z",
  "refresh_token": "IbFKG1m8KEE24cTH1HpDfSochufKMEyFBpjGwzaBZXI",
  "refresh_expires_at": "2026-10-31T10:42:02.060417535Z",
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
  "command_id": "646c8bfc-c3ca-4fd1-befc-3949d339a7c7",
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
  "changed_by": "09fe1c69-c031-458c-a537-a40fa884b9ac",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-30T22:42:02.66708Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "f80064f0-139b-448f-a1b1-b46b054630e4",
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
  "correlation_id": "34914aca-cb34-4561-952b-a70a64424fcf",
  "current_version": 1
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "0baee937-00ac-4863-bb9f-fffa7a7ca159",
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
  "correlation_id": "325e2c3e-1d4f-45eb-8f76-edf6eaa67431"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634760485",
  "device_ref": "sandbox-17911"
}
```

```json
{
  "challenge_id": "8bbc44ce-9985-4164-b4f2-566236eae8fb",
  "expires_at": "2026-10-30T22:47:03.562334846Z",
  "resend_available_at": "2026-10-30T22:42:04.562334846Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380634760485` → **200**

```json
{
  "phone": "+380634760485",
  "audience": "CLIENT",
  "code": "980981",
  "sent_at": "2026-10-30T22:42:03.565376722Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8bbc44ce-9985-4164-b4f2-566236eae8fb",
  "code": "980981",
  "device_ref": "sandbox-17911"
}
```

```json
{
  "session_id": "00bbeb92-f100-4474-bec4-31d8a20b1ea4",
  "subject": {
    "type": "CLIENT",
    "id": "b732e90f-4928-4192-ad42-c3cb50fd03d1"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNzMyZTkwZi00OTI4LTQxOTItYWQ0Mi1jM2NiNTBmZDAzZDEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDAxMDIzLCJpYXQiOjE3OTM0MDAxMjMsImp0aSI6IjVjMWViYmUxLTYwMGYtNGRkMS04ZDAwLWE2YjI3MGY2YTJiOCIsInNpZCI6IjAwYmJlYjkyLWYxMDAtNDQ3NC1iZWM0LTMxZDhhMjBiMWVhNCJ9.M_YdP_ix647pSZxq08j06ZAu5afgoAUTqdbUg640CmQ",
  "access_expires_at": "2026-10-30T22:57:03.879352607Z",
  "refresh_token": "w1W2hO58aQUr654AKx9qxw9w3gH7-v9h9MwzOJ8zjFA",
  "refresh_expires_at": "2026-11-29T22:42:03.87837125Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "411b9fd4-4fae-4c24-996a-627b853c6720",
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
  "id": "45dc16ec-0159-43dc-838e-7f9a50ac4049",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T22:47:04.174964Z",
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
  "command_id": "a2a07964-cf9c-4656-bd35-e9dc8d9a9802",
  "quote_id": "45dc16ec-0159-43dc-838e-7f9a50ac4049",
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
  "correlation_id": "89b05a89-9669-49a1-aa27-0ba35dd0e7b1"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "90b81542-d00c-4643-b663-113a39f4cdb7",
  "quote_id": "45dc16ec-0159-43dc-838e-7f9a50ac4049",
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
  "id": "1a03c1d0-df02-4b1d-bcc8-f55248a70529",
  "short_number": 22,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b732e90f-4928-4192-ad42-c3cb50fd03d1",
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
  "created_at": "2026-10-30T22:42:04.775603Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

`POST /api/rider/v1/orders/1a03c1d0-df02-4b1d-bcc8-f55248a70529/cancel` → **200**

```json
{
  "command_id": "57c11fbd-1b29-4c9e-9708-5674f6f21f1c",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "1a03c1d0-df02-4b1d-bcc8-f55248a70529",
  "short_number": 22,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "b732e90f-4928-4192-ad42-c3cb50fd03d1",
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
  "created_at": "2026-10-30T22:42:04.775603Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "ru": "Передумал ехать",
      "en": "Changed my mind",
      "uk": "Передумав їхати",
      "pl": "Zmiana planów"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

## The incident is over: card payments are back on

`POST /api/admin/v1/feature-flags/card-payments/change` → **200**

```json
{
  "command_id": "5b80c6ae-c5c5-426e-92da-eda251e17693",
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
  "changed_by": "09fe1c69-c031-458c-a537-a40fa884b9ac",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-30T22:42:05.425512Z"
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
      "changed_by": "09fe1c69-c031-458c-a537-a40fa884b9ac",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-30T22:42:05.425512Z"
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
  "device_ref": "sandbox-14354"
}
```

```json
{
  "challenge_id": "90f2da0c-04ef-46b3-970a-1b7dbb76cbb5",
  "expires_at": "2026-10-30T22:47:06.346523775Z",
  "resend_available_at": "2026-10-30T22:42:07.346523775Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "284372",
  "sent_at": "2026-10-30T22:42:06.349053697Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "90f2da0c-04ef-46b3-970a-1b7dbb76cbb5",
  "code": "284372",
  "device_ref": "sandbox-14354"
}
```

```json
{
  "session_id": "2a6c3035-84b1-4092-87b8-e8f7b17c16e6",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwMTAyNiwiaWF0IjoxNzkzNDAwMTI2LCJqdGkiOiJjMjMwYTMzMS1iZTZhLTQ2MzMtYTE3ZC1mNmUwOWIxZWU3NWUiLCJzaWQiOiIyYTZjMzAzNS04NGIxLTQwOTItODdiOC1lOGY3YjE3YzE2ZTYifQ.2tzmeYDVG2-k-15dOmu1H4irOoo4_VNz6nHJq2ZcQXw",
  "access_expires_at": "2026-10-30T22:57:06.667424173Z",
  "refresh_token": "mM8O36kXwggomPheWvBtoA3TtLkKxSPiiKfkZUZ6gp0",
  "refresh_expires_at": "2026-11-29T22:42:06.666513508Z",
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
  "command_id": "4c4c1105-1156-444c-ac69-0cbfc1cc1807",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:42:07Z",
    "sequence": 1793400127259
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9f3455ad-3de1-44ce-8af9-fe1c1a800ff7",
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
  "last_heartbeat_at": "2026-10-30T22:42:07.277945Z",
  "last_location_at": "2026-10-30T22:42:07.277945Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671524964",
  "device_ref": "sandbox-23442"
}
```

```json
{
  "challenge_id": "661172cc-84e6-4e30-84cc-9e89631fb4dc",
  "expires_at": "2026-10-30T22:47:07.575470811Z",
  "resend_available_at": "2026-10-30T22:42:08.575470811Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380671524964` → **200**

```json
{
  "phone": "+380671524964",
  "audience": "CLIENT",
  "code": "614892",
  "sent_at": "2026-10-30T22:42:07.578024773Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "661172cc-84e6-4e30-84cc-9e89631fb4dc",
  "code": "614892",
  "device_ref": "sandbox-23442"
}
```

```json
{
  "session_id": "e3eb2c20-0d46-4ec9-8d59-b6154fc995e6",
  "subject": {
    "type": "CLIENT",
    "id": "6ceef755-b672-4399-8760-070169c1f022"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2Y2VlZjc1NS1iNjcyLTQzOTktODc2MC0wNzAxNjljMWYwMjIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDAxMDI3LCJpYXQiOjE3OTM0MDAxMjcsImp0aSI6ImQxM2Q1ZGZjLWIzNjgtNGUyZS05OWM5LTcwOGIzZGU1NzlhOCIsInNpZCI6ImUzZWIyYzIwLTBkNDYtNGVjOS04ZDU5LWI2MTU0ZmM5OTVlNiJ9.wmhbqGkYl3UsEJL5QsXKWqBLr7rsBAX0kiumO082gkA",
  "access_expires_at": "2026-10-30T22:57:07.899145564Z",
  "refresh_token": "xScpyo5hbGZOeQYGAxwhlaSfP94evRnnSCKTOENkaPc",
  "refresh_expires_at": "2026-11-29T22:42:07.898462365Z",
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
  "command_id": "998e5b2b-82cd-4feb-b064-b1b8a6e86e4d",
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
  "id": "56d98d6e-08fa-4776-af03-6fb07e32e37d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T22:47:08.493304Z",
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
  "command_id": "78fb836f-82d2-4aa6-844a-8edcff48324a",
  "platform": "ANDROID",
  "token": "sandbox-driver-acedcce0-af03-4133-b26a-86f5934263ee"
}
```

```json
{
  "id": "2baaaf32-2ab0-42ad-81c2-330ea4d4cfc0",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T22:42:08.808336Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "5d240701-a17b-43ac-ae2a-289a01a63c9e",
  "platform": "ANDROID",
  "token": "sandbox-rider-88610d80-10ff-4ef5-be91-4a50f931bb79"
}
```

```json
{
  "id": "db6fc39c-6dab-45fc-84f2-b00887330bbc",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T22:42:09.108337Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "96882e49-b70e-4a85-aa52-d3b898a09d9d",
  "quote_id": "56d98d6e-08fa-4776-af03-6fb07e32e37d",
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
  "id": "e76972d2-2fb5-4648-bd57-78e73e28970b",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6ceef755-b672-4399-8760-070169c1f022",
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
  "created_at": "2026-10-30T22:42:09.412029Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

## The driver's phone gets the offer push, and the driver accepts

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-30T22:42:09.387Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-30T22:42:09.387Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-30T22:42:09.387Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-30T22:42:09.387Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-30T22:42:09.387Z` → **200**

```json
[
  {
    "at": "2026-10-30T22:42:13.567027035Z",
    "token_suffix": "4263ee",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "event_type": "OfferMade",
      "order_id": "e76972d2-2fb5-4648-bd57-78e73e28970b",
      "event_id": "d7871d24-3a19-4dd2-97ed-261b47505276",
      "order_version": "2",
      "offer_id": "15e74c02-ab0e-4d7b-87c9-a6fae396aa75",
      "type": "driver.offer"
    }
  }
]
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "15e74c02-ab0e-4d7b-87c9-a6fae396aa75",
    "order_id": "e76972d2-2fb5-4648-bd57-78e73e28970b",
    "expires_at": "2026-10-30T22:42:24.41619Z",
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

`POST /api/driver/v1/offers/15e74c02-ab0e-4d7b-87c9-a6fae396aa75/accept` → **200**

```json
{
  "command_id": "dc6d48b5-3d88-42d9-a24f-8c7a64930a97"
}
```

```json
{
  "id": "3c9097de-0fca-49b3-a60e-6a1305c799c9",
  "order_id": "e76972d2-2fb5-4648-bd57-78e73e28970b",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "4e198e54-881d-4591-a9b3-d578ee401fe2",
  "trip_phase": "TO_PICKUP"
}
```

## The rider's phone gets "driver assigned"

`GET /sandbox/v1/pushes?phone=%2B380671524964&after=2026-10-30T22:42:09.387Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380671524964&after=2026-10-30T22:42:09.387Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380671524964&after=2026-10-30T22:42:09.387Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380671524964&after=2026-10-30T22:42:09.387Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380671524964&after=2026-10-30T22:42:09.387Z` → **200**

```json
[
  {
    "at": "2026-10-30T22:42:17.576491178Z",
    "token_suffix": "31bb79",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "event_type": "AssignmentCommitted",
      "order_id": "e76972d2-2fb5-4648-bd57-78e73e28970b",
      "event_id": "a5253d1a-2708-4a24-bd9b-d9f722ea7743",
      "order_version": "3",
      "assignment_id": "3c9097de-0fca-49b3-a60e-6a1305c799c9",
      "type": "rider.driver-assigned"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/e76972d2-2fb5-4648-bd57-78e73e28970b/messages` → **201**

```json
{
  "command_id": "7f906eab-45d3-44b5-b3d4-000fe26db126",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "a4c1f7f0-fd06-444b-b387-a524e2410f82",
  "order_id": "e76972d2-2fb5-4648-bd57-78e73e28970b",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-30T22:42:18.62781274Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "4e198e54-881d-4591-a9b3-d578ee401fe2",
  "order_id": "e76972d2-2fb5-4648-bd57-78e73e28970b",
  "assignment_id": "3c9097de-0fca-49b3-a60e-6a1305c799c9",
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

`POST /api/driver/v1/trips/4e198e54-881d-4591-a9b3-d578ee401fe2/messages` → **201**

```json
{
  "command_id": "e9e6be22-237f-4498-bdd9-6a0ddb94f125",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "13e3d892-c5ae-412f-84a5-1c352543630e",
  "order_id": "e76972d2-2fb5-4648-bd57-78e73e28970b",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-30T22:42:19.212528755Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/e76972d2-2fb5-4648-bd57-78e73e28970b/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/4e198e54-881d-4591-a9b3-d578ee401fe2/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380671524964"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/9f3455ad-3de1-44ce-8af9-fe1c1a800ff7/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:42:20Z",
    "sequence": 1793400140932
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9f3455ad-3de1-44ce-8af9-fe1c1a800ff7",
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
  "last_heartbeat_at": "2026-10-30T22:42:20.11176Z",
  "last_location_at": "2026-10-30T22:42:20.11176Z",
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
  "id": "4e198e54-881d-4591-a9b3-d578ee401fe2",
  "order_id": "e76972d2-2fb5-4648-bd57-78e73e28970b",
  "assignment_id": "3c9097de-0fca-49b3-a60e-6a1305c799c9",
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

`POST /api/driver/v1/trips/4e198e54-881d-4591-a9b3-d578ee401fe2/arrive` → **200**

```json
{
  "command_id": "114c5170-cd69-4a07-9832-508d2285134a",
  "expected_version": 0
}
```

```json
{
  "id": "4e198e54-881d-4591-a9b3-d578ee401fe2",
  "order_id": "e76972d2-2fb5-4648-bd57-78e73e28970b",
  "assignment_id": "3c9097de-0fca-49b3-a60e-6a1305c799c9",
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
  "arrived_at": "2026-10-30T22:42:20.711512Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/4e198e54-881d-4591-a9b3-d578ee401fe2/start` → **200**

```json
{
  "command_id": "c3dc1ccb-fa3c-4652-a933-d258d7e845b3",
  "expected_version": 1
}
```

```json
{
  "id": "4e198e54-881d-4591-a9b3-d578ee401fe2",
  "order_id": "e76972d2-2fb5-4648-bd57-78e73e28970b",
  "assignment_id": "3c9097de-0fca-49b3-a60e-6a1305c799c9",
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
  "arrived_at": "2026-10-30T22:42:20.711512Z",
  "started_at": "2026-10-30T22:42:21.021075Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

(the car drives 48 s to the next point)

`POST /api/driver/v1/work-sessions/9f3455ad-3de1-44ce-8af9-fe1c1a800ff7/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:43:09Z",
    "sequence": 1793400189335
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9f3455ad-3de1-44ce-8af9-fe1c1a800ff7",
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
  "last_heartbeat_at": "2026-10-30T22:43:09.354043Z",
  "last_location_at": "2026-10-30T22:43:09.354043Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/4e198e54-881d-4591-a9b3-d578ee401fe2/complete` → **200**

```json
{
  "command_id": "8f98d353-cf42-4641-b0d5-5ce9d4e4e24f",
  "expected_version": 2,
  "reported_at": "2026-10-30T22:43:09Z",
  "cash_received": true
}
```

```json
{
  "id": "4e198e54-881d-4591-a9b3-d578ee401fe2",
  "order_id": "e76972d2-2fb5-4648-bd57-78e73e28970b",
  "assignment_id": "3c9097de-0fca-49b3-a60e-6a1305c799c9",
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
  "arrived_at": "2026-10-30T22:42:20.711512Z",
  "started_at": "2026-10-30T22:42:21.021075Z",
  "completed_at": "2026-10-30T22:43:09.652342Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/e76972d2-2fb5-4648-bd57-78e73e28970b` → **200**

```json
{
  "id": "e76972d2-2fb5-4648-bd57-78e73e28970b",
  "short_number": 23,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "6ceef755-b672-4399-8760-070169c1f022",
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
    "id": "3c9097de-0fca-49b3-a60e-6a1305c799c9",
    "order_id": "e76972d2-2fb5-4648-bd57-78e73e28970b",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "4e198e54-881d-4591-a9b3-d578ee401fe2",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T22:42:09.412029Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": {
    "name": "Іван Петренко",
    "make": "Skoda",
    "model": "Octavia",
    "color": "white",
    "registration_number": "AA0001TX",
    "photo_url": null
  },
  "driver_change": null
}
```

`GET /api/rider/v1/orders` → **200**

```json
{
  "items": [
    {
      "id": "e76972d2-2fb5-4648-bd57-78e73e28970b",
      "short_number": 23,
      "status": "FULFILLED",
      "created_at": "2026-10-30T22:42:09.412029Z",
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
      "id": "4e198e54-881d-4591-a9b3-d578ee401fe2",
      "order_id": "e76972d2-2fb5-4648-bd57-78e73e28970b",
      "order_short_number": 23,
      "created_at": "2026-10-30T22:42:14.189238Z",
      "pickup_label": "Майдан Незалежності",
      "dropoff_label": "Залізничний вокзал",
      "final_price_minor": 10517,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "COMPLETED"
    },
    {
      "id": "9d7f1ed3-dec0-4024-9475-93e845b3d214",
      "order_id": "e9e6bf19-3749-4f34-99fa-7e8cffd3e84c",
      "order_short_number": 21,
      "created_at": "2026-10-30T22:41:58.313473Z",
      "pickup_label": "Майдан",
      "dropoff_label": "Вокзал",
      "final_price_minor": null,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "ABORTED"
    },
    {
      "id": "dffa03ee-5ff6-4038-93f7-313f95b1675e",
      "order_id": "974033c5-23ed-4ac9-a1e0-eecc432592fd",
      "order_short_number": 19,
      "created_at": "2026-10-30T22:41:51.96563Z",
      "pickup_label": "Майдан",
      "dropoff_label": "Вокзал",
      "final_price_minor": null,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "ABORTED"
    },
    {
      "id": "cbd3a975-bcda-4f8f-9186-9bbcb8bcdf41",
      "order_id": "960edaae-71d7-4cb7-ac45-6adbcd6b4cc5",
      "order_short_number": 18,
      "created_at": "2026-10-30T22:41:48.798729Z",
      "pickup_label": "Майдан",
      "dropoff_label": "Вокзал",
      "final_price_minor": null,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "ABORTED"
    },
    {
      "id": "7542e3d2-3203-436c-96ab-c91e7fc66e12",
      "order_id": "e1b1830c-0c57-4f92-8148-4db03a68466f",
      "order_short_number": 17,
      "created_at": "2026-10-30T22:41:45.577011Z",
      "pickup_label": "Майдан",
      "dropoff_label": "Вокзал",
      "final_price_minor": null,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "ABORTED"
    },
    {
      "id": "e9f388d5-5dd1-4bbb-8672-6427dc963124",
      "order_id": "10d1b81b-1c0a-4f72-8c0a-626e79b8c474",
      "order_short_number": 10,
      "created_at": "2026-10-30T22:35:57.36055Z",
      "pickup_label": "Майдан",
      "dropoff_label": "Вокзал",
      "final_price_minor": 10517,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "COMPLETED"
    },
    {
      "id": "b98ee94b-feab-4e53-a32c-245c0aef6869",
      "order_id": "d9fe2d15-a07e-4ac9-9ad2-5b03b0469237",
      "order_short_number": 5,
      "created_at": "2026-10-30T22:34:21.791401Z",
      "pickup_label": "Майдан",
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

`GET /api/driver/v1/earnings?city_id=5a000000-0000-4000-8000-000000000001&from=2026-10-31&to=2026-10-31` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "currency": "UAH",
  "timezone": "Europe/Kyiv",
  "from": "2026-10-31",
  "to": "2026-10-31",
  "days": [
    {
      "date": "2026-10-31",
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

`GET /api/rider/v1/orders/e76972d2-2fb5-4648-bd57-78e73e28970b/tip` → **200**

```json
{
  "order_id": "e76972d2-2fb5-4648-bd57-78e73e28970b",
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
  "available_until": "2026-10-31T22:43:09.652342Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/e76972d2-2fb5-4648-bd57-78e73e28970b/tip` → **201**

```json
{
  "command_id": "c06df916-0e44-4853-9c7d-daf5c5e56dfd",
  "amount_minor": 1100
}
```

```json
{
  "id": "da103d19-7511-4faa-85fe-b75df63509eb",
  "order_id": "e76972d2-2fb5-4648-bd57-78e73e28970b",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-30T22:43:14.744444Z"
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
  "session_id": "a71b24e0-e400-4238-8586-c6038746d6e9",
  "subject": {
    "type": "STAFF",
    "id": "09fe1c69-c031-458c-a537-a40fa884b9ac"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwOWZlMWM2OS1jMDMxLTQ1OGMtYTUzNy1hNDBmYTg4NGI5YWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDEwOTUsImlhdCI6MTc5MzQwMDE5NSwianRpIjoiZDlmMjRhNDQtZWJmOC00NWZkLWEzN2UtNjI4YmE2YWEwZDQzIiwic2lkIjoiYTcxYjI0ZTAtZTQwMC00MjM4LTg1ODYtYzYwMzg3NDZkNmU5In0.6nK8JuGCTAdRic3WcSn7UXhgU0G9PB8wTAYCv3veUVE",
  "access_expires_at": "2026-10-30T22:58:15.327447302Z",
  "refresh_token": "gz1F_nzJuVxospWpZmUNjw3b6uIjwIaAv7f5APADX70",
  "refresh_expires_at": "2026-10-31T10:43:15.326732524Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/reports/orders?city_id=5a000000-0000-4000-8000-000000000001&from=2026-10-31&to=2026-10-31` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "timezone": "Europe/Kyiv",
  "from": "2026-10-31",
  "to": "2026-10-31",
  "days": [
    {
      "date": "2026-10-31",
      "counts": {
        "created": 22,
        "fulfilled": 9,
        "cancelled": 13,
        "unfulfilled": 0,
        "open": 0,
        "by_channel": {
          "APP": 21,
          "PHONE": 1
        },
        "by_payment": {
          "CARD": 2,
          "CASH": 20
        },
        "cancelled_by": {
          "RIDER": 3,
          "STAFF": 9,
          "DRIVER": 1
        }
      }
    }
  ],
  "total": {
    "created": 22,
    "fulfilled": 9,
    "cancelled": 13,
    "unfulfilled": 0,
    "open": 0,
    "by_channel": {
      "APP": 21,
      "PHONE": 1
    },
    "by_payment": {
      "CARD": 2,
      "CASH": 20
    },
    "cancelled_by": {
      "RIDER": 3,
      "STAFF": 9,
      "DRIVER": 1
    }
  },
  "cancellation_reasons": [
    {
      "cancelled_by": "STAFF",
      "code": "NO_CARS",
      "count": 9
    },
    {
      "cancelled_by": "RIDER",
      "code": "CHANGED_MIND",
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
  "generated_at": "2026-10-30T22:43:15.616220703Z"
}
```

`GET /api/admin/v1/reports/finance?city_id=5a000000-0000-4000-8000-000000000001&from=2026-10-31&to=2026-10-31` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "currency": "UAH",
  "timezone": "Europe/Kyiv",
  "from": "2026-10-31",
  "to": "2026-10-31",
  "days": [
    {
      "date": "2026-10-31",
      "figures": {
        "trips": 9,
        "fares_minor": 111993,
        "service_rides_minor": 0,
        "commission_minor": 16803,
        "driver_share_minor": 95190,
        "discounts_minor": 1052,
        "bonuses_granted_minor": 0,
        "paid_by_card_minor": 32594,
        "paid_with_bonuses_minor": 18297,
        "collected_by_drivers_minor": 49533,
        "tips_minor": 5000,
        "rider_debt_change_minor": 10517
      }
    }
  ],
  "total": {
    "trips": 9,
    "fares_minor": 111993,
    "service_rides_minor": 0,
    "commission_minor": 16803,
    "driver_share_minor": 95190,
    "discounts_minor": 1052,
    "bonuses_granted_minor": 0,
    "paid_by_card_minor": 32594,
    "paid_with_bonuses_minor": 18297,
    "collected_by_drivers_minor": 49533,
    "tips_minor": 5000,
    "rider_debt_change_minor": 10517
  },
  "generated_at": "2026-10-30T22:43:15.914292036Z"
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
  "session_id": "ae9f2556-1888-48b4-a1af-8d11fb1a2cab",
  "subject": {
    "type": "STAFF",
    "id": "09fe1c69-c031-458c-a537-a40fa884b9ac"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwOWZlMWM2OS1jMDMxLTQ1OGMtYTUzNy1hNDBmYTg4NGI5YWMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDEwOTYsImlhdCI6MTc5MzQwMDE5NiwianRpIjoiYjE1MjM0MzgtMWUyMy00NjY5LWFmYzUtMmI2NmU3MWVmYzFlIiwic2lkIjoiYWU5ZjI1NTYtMTg4OC00OGI0LWExYWYtOGQxMWZiMWEyY2FiIn0.kkHnN2DxFZbYllnE2dmqfa77fuWZEzlHcdfvRRpJILM",
  "access_expires_at": "2026-10-30T22:58:16.518805595Z",
  "refresh_token": "gRS9exPrqm303e7FdGh1zEuR7OsqQs1DNrdHJBfwB60",
  "refresh_expires_at": "2026-10-31T10:43:16.518121584Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/e76972d2-2fb5-4648-bd57-78e73e28970b/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T22:42:09.412748Z",
      "actor": {
        "type": "CLIENT",
        "id": "6ceef755-b672-4399-8760-070169c1f022",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "e76972d2-2fb5-4648-bd57-78e73e28970b",
        "quote_id": "56d98d6e-08fa-4776-af03-6fb07e32e37d",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "36157b47-c0f9-4fd8-90d4-a8ea049b2e08"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T22:42:09.415212Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "e76972d2-2fb5-4648-bd57-78e73e28970b",
        "attempt_id": "a6b53138-9bf0-4e6a-b33f-649a42c8a627",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "36157b47-c0f9-4fd8-90d4-a8ea049b2e08"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T22:42:09.441424Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "15e74c02-ab0e-4d7b-87c9-a6fae396aa75",
        "order_id": "e76972d2-2fb5-4648-bd57-78e73e28970b",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44,
        "expires_at": "2026-10-30T22:42:24.416190187Z"
      },
      "correlation_id": "36157b47-c0f9-4fd8-90d4-a8ea049b2e08"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T22:42:14.191185Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "15e74c02-ab0e-4d7b-87c9-a6fae396aa75",
        "order_id": "e76972d2-2fb5-4648-bd57-78e73e28970b",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "3c9097de-0fca-49b3-a60e-6a1305c799c9"
      },
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-30T22:43:17.131361904Z",
  "drivers": [
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
      "last_location_at": "2026-10-30T22:43:09.354043Z",
      "last_heartbeat_at": "2026-10-30T22:43:09.354043Z",
      "order_id": null
    }
  ]
}
```

Done: order e76972d2-2fb5-4648-bd57-78e73e28970b.

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
  "session_id": "7d1f913a-a14e-486a-a2ff-b547c06c669b",
  "subject": {
    "type": "STAFF",
    "id": "09fe1c69-c031-458c-a537-a40fa884b9ac"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwOWZlMWM2OS1jMDMxLTQ1OGMtYTUzNy1hNDBmYTg4NGI5YWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDEwOTcsImlhdCI6MTc5MzQwMDE5NywianRpIjoiMGYxYzQ4NDAtZmZmMS00YTcwLTg4YTQtMTBmYmQ4NjhiZjI0Iiwic2lkIjoiN2QxZjkxM2EtYTE0ZS00ODZhLWEyZmYtYjU0N2MwNmM2NjliIn0.xjOQZfEvfXhj1qBfFHRvZFTYIoivZ5zNXu2Gy_LBmhs",
  "access_expires_at": "2026-10-30T22:58:17.733976943Z",
  "refresh_token": "D4mdrJaYjcTB3XaI5vIMNhdSTAJQwQr9cyzQNxZ8FEA",
  "refresh_expires_at": "2026-10-31T10:43:17.733255928Z",
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
  "command_id": "19152873-48de-4990-83bc-527cabb1af8c",
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
  "timestamp": "2026-10-30T22:43:18.000+0000",
  "channel": {
    "id": "1730052000.266112025",
    "linkedid": "1730052000.266112025",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380671771543"
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
  "timestamp": "2026-10-30T22:43:18.000+0000",
  "channel": {
    "id": "1730052000.266112025",
    "linkedid": "1730052000.266112025",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380671771543"
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
  "session_id": "83b4f87b-8816-4e1b-94d9-921327ba4a05",
  "subject": {
    "type": "STAFF",
    "id": "09fe1c69-c031-458c-a537-a40fa884b9ac"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwOWZlMWM2OS1jMDMxLTQ1OGMtYTUzNy1hNDBmYTg4NGI5YWMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDEwOTgsImlhdCI6MTc5MzQwMDE5OCwianRpIjoiODc0NWYzZDYtZGE0OS00ZmZjLWIzYzItODEzNzdjNmU3NTdjIiwic2lkIjoiODNiNGY4N2ItODgxNi00ZTFiLTk0ZDktOTIxMzI3YmE0YTA1In0.4G8OmCiAVxkMMB4b8VA2ArSj85dITYOZIXl7Z_1zgRo",
  "access_expires_at": "2026-10-30T22:58:18.963021654Z",
  "refresh_token": "j76tQOsCd9acmXqqxb0XIrBQbmDbcpW1VV6I2sagBDw",
  "refresh_expires_at": "2026-10-31T10:43:18.962317616Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "5f6e97cf-1aac-47b5-81e9-92977d61fe1c",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380671771543",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T22:43:18Z",
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

`POST /api/operator/v1/calls/5f6e97cf-1aac-47b5-81e9-92977d61fe1c/answer` → **200**

```json
{
  "command_id": "fbd36887-ef9c-4a6e-bfa3-9163e35b7b40"
}
```

```json
{
  "id": "5f6e97cf-1aac-47b5-81e9-92977d61fe1c",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380671771543",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "09fe1c69-c031-458c-a537-a40fa884b9ac",
  "order_ids": [],
  "started_at": "2026-10-30T22:43:18Z",
  "answered_at": "2026-10-30T22:43:19.58318Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.266112025",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "7fa8f9a8-34de-40e4-8f72-3241e6adccf4",
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
  "id": "c19757c1-cf71-44d3-b193-af6f8de5c10a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T22:48:19.909584Z",
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
  "command_id": "5847b3ae-0258-4d0b-81d3-573dd6c55fcd",
  "quote_id": "c19757c1-cf71-44d3-b193-af6f8de5c10a",
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
    "phone": "+380671771543"
  },
  "call_id": "5f6e97cf-1aac-47b5-81e9-92977d61fe1c"
}
```

```json
{
  "id": "4f0d93cd-06ef-4a35-a6c0-08dcf186441d",
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
  "created_at": "2026-10-30T22:43:20.213114Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671771543"
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
    "id": "1730052000.266112025",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "5f6e97cf-1aac-47b5-81e9-92977d61fe1c",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380671771543",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "09fe1c69-c031-458c-a537-a40fa884b9ac",
      "order_ids": [
        "4f0d93cd-06ef-4a35-a6c0-08dcf186441d"
      ],
      "started_at": "2026-10-30T22:43:18Z",
      "answered_at": "2026-10-30T22:43:19.58318Z",
      "ended_at": "2026-10-30T22:43:20.58659Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "b6f86ef8-45f2-4966-ac7b-cdfa39a5fe3f",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380671130875",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "09fe1c69-c031-458c-a537-a40fa884b9ac",
      "order_ids": [],
      "started_at": "2026-10-30T22:34:10.425058Z",
      "answered_at": "2026-10-30T22:34:10.75596Z",
      "ended_at": "2026-10-30T22:34:11.079541Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T22:34:17.922238Z"
      }
    }
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
```

`GET /api/operator/v1/orders/4f0d93cd-06ef-4a35-a6c0-08dcf186441d` → **200**

```json
{
  "id": "4f0d93cd-06ef-4a35-a6c0-08dcf186441d",
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
  "created_at": "2026-10-30T22:43:20.213114Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671771543"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/4f0d93cd-06ef-4a35-a6c0-08dcf186441d` → **200**

```json
{
  "id": "4f0d93cd-06ef-4a35-a6c0-08dcf186441d",
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
  "created_at": "2026-10-30T22:43:20.213114Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671771543"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/4f0d93cd-06ef-4a35-a6c0-08dcf186441d/cancel` → **200**

```json
{
  "command_id": "61f03169-5880-4cce-b338-ae04fa7ea9e1",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "4f0d93cd-06ef-4a35-a6c0-08dcf186441d",
  "short_number": 24,
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
  "created_at": "2026-10-30T22:43:20.213114Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671771543"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "ru": "Нет свободных машин",
      "en": "No cars available",
      "uk": "Немає вільних авто",
      "pl": "Brak wolnych aut"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

Done: call 5f6e97cf-1aac-47b5-81e9-92977d61fe1c with order 4f0d93cd-06ef-4a35-a6c0-08dcf186441d.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-19771"
}
```

```json
{
  "challenge_id": "5a309b2c-4593-4e44-9481-4b92c0e7380a",
  "expires_at": "2026-10-30T22:48:21.878821384Z",
  "resend_available_at": "2026-10-30T22:43:22.878821384Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "279887",
  "sent_at": "2026-10-30T22:43:21.88177371Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5a309b2c-4593-4e44-9481-4b92c0e7380a",
  "code": "279887",
  "device_ref": "sandbox-19771"
}
```

```json
{
  "session_id": "1bd747a9-1c32-423d-9a42-ec2bf018856b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwMTEwMiwiaWF0IjoxNzkzNDAwMjAyLCJqdGkiOiJmZDc5MjE1MS04MzljLTRiYzUtYWJmYS04YjE5MTBmNDNjZTMiLCJzaWQiOiIxYmQ3NDdhOS0xYzMyLTQyM2QtOWE0Mi1lYzJiZjAxODg1NmIifQ.1Ph_odmkP4UJ7nzZxq4juJmEyCspFaB1CU6RAag6TOE",
  "access_expires_at": "2026-10-30T22:58:22.197482905Z",
  "refresh_token": "LT9BJzXVILiZRNPiJzlNPczqg54hhczsnaMtr_VH7Ow",
  "refresh_expires_at": "2026-11-29T22:43:22.196840563Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9f3455ad-3de1-44ce-8af9-fe1c1a800ff7",
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
  "last_heartbeat_at": "2026-10-30T22:43:09.354043Z",
  "last_location_at": "2026-10-30T22:43:09.354043Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9f3455ad-3de1-44ce-8af9-fe1c1a800ff7/handover` → **200**

```json
{
  "command_id": "cf5b86d1-7e5c-4bde-a0f2-24574cc34ae3",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9f3455ad-3de1-44ce-8af9-fe1c1a800ff7",
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
  "last_heartbeat_at": "2026-10-30T22:43:09.354043Z",
  "last_location_at": "2026-10-30T22:43:09.354043Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

(the car drives 85 s to the next point)

`POST /api/driver/v1/work-sessions/9f3455ad-3de1-44ce-8af9-fe1c1a800ff7/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:44:48Z",
    "sequence": 1793400288944
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9f3455ad-3de1-44ce-8af9-fe1c1a800ff7",
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
  "last_heartbeat_at": "2026-10-30T22:44:48.112954Z",
  "last_location_at": "2026-10-30T22:44:48.112954Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380663680649",
  "device_ref": "sandbox-24273"
}
```

```json
{
  "challenge_id": "704cf15d-a9f0-4e09-b60c-bbc21cedb3ec",
  "expires_at": "2026-10-30T22:49:48.403528683Z",
  "resend_available_at": "2026-10-30T22:44:49.403528683Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380663680649` → **200**

```json
{
  "phone": "+380663680649",
  "audience": "CLIENT",
  "code": "938633",
  "sent_at": "2026-10-30T22:44:48.407727092Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "704cf15d-a9f0-4e09-b60c-bbc21cedb3ec",
  "code": "938633",
  "device_ref": "sandbox-24273"
}
```

```json
{
  "session_id": "e74fedac-746b-4bf2-b6ac-c3246c19e1ae",
  "subject": {
    "type": "CLIENT",
    "id": "3e790eb4-a52a-4897-9d94-100534f7bab8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzZTc5MGViNC1hNTJhLTQ4OTctOWQ5NC0xMDA1MzRmN2JhYjgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDAxMTg4LCJpYXQiOjE3OTM0MDAyODgsImp0aSI6ImJiMmY1NzkyLWZjZTMtNGVhOS1hZWMzLTdjZjcwZTkyOWJhNCIsInNpZCI6ImU3NGZlZGFjLTc0NmItNGJmMi1iNmFjLWMzMjQ2YzE5ZTFhZSJ9.gt7BQOs_d77mPtfx8BQ7wp6Y6zSM1VXyUjsfL0Tl1Rc",
  "access_expires_at": "2026-10-30T22:59:48.724996034Z",
  "refresh_token": "PXXckDX6z45oHvzV-TGGheY46ZiWF4f20N6eLulqjS4",
  "refresh_expires_at": "2026-11-29T22:44:48.72442788Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "961b1a00-bcfd-4086-86ba-02192711a71a",
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
  "id": "e8c0f36d-846b-4f2c-b0af-6969d9e63639",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T22:49:49.032390Z",
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
  "command_id": "dc25bdcb-c3b7-41b5-9842-d4e85d93e914",
  "quote_id": "e8c0f36d-846b-4f2c-b0af-6969d9e63639",
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
  "id": "8066cf9b-9973-4897-9553-74be8760c247",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3e790eb4-a52a-4897-9d94-100534f7bab8",
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
  "created_at": "2026-10-30T22:44:49.341191Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "e549acf4-e26c-4d3f-855f-f42f7f2f5d7a",
    "order_id": "8066cf9b-9973-4897-9553-74be8760c247",
    "expires_at": "2026-10-30T22:45:04.344655Z",
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

`POST /api/driver/v1/offers/e549acf4-e26c-4d3f-855f-f42f7f2f5d7a/accept` → **200**

```json
{
  "command_id": "7cd8bfa6-6feb-46e0-b610-0ad47035d302"
}
```

```json
{
  "id": "6b7141e2-093e-47b3-8d17-0998addc52f0",
  "order_id": "8066cf9b-9973-4897-9553-74be8760c247",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "de81b70b-ecbf-41ad-88ea-5f2dcde28c46",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "de81b70b-ecbf-41ad-88ea-5f2dcde28c46",
  "order_id": "8066cf9b-9973-4897-9553-74be8760c247",
  "assignment_id": "6b7141e2-093e-47b3-8d17-0998addc52f0",
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

`POST /api/driver/v1/work-sessions/9f3455ad-3de1-44ce-8af9-fe1c1a800ff7/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:44:50Z",
    "sequence": 1793400290560
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9f3455ad-3de1-44ce-8af9-fe1c1a800ff7",
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
  "last_heartbeat_at": "2026-10-30T22:44:50.578765Z",
  "last_location_at": "2026-10-30T22:44:50.578765Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/de81b70b-ecbf-41ad-88ea-5f2dcde28c46/arrive` → **200**

```json
{
  "command_id": "a4fb1267-9ed9-4ade-a53e-61f8bffab26a",
  "expected_version": 0
}
```

```json
{
  "id": "de81b70b-ecbf-41ad-88ea-5f2dcde28c46",
  "order_id": "8066cf9b-9973-4897-9553-74be8760c247",
  "assignment_id": "6b7141e2-093e-47b3-8d17-0998addc52f0",
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
  "arrived_at": "2026-10-30T22:44:50.877142Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/de81b70b-ecbf-41ad-88ea-5f2dcde28c46/start` → **200**

```json
{
  "command_id": "d5645e61-a5c5-4137-92f7-4b2d13299784",
  "expected_version": 1
}
```

```json
{
  "id": "de81b70b-ecbf-41ad-88ea-5f2dcde28c46",
  "order_id": "8066cf9b-9973-4897-9553-74be8760c247",
  "assignment_id": "6b7141e2-093e-47b3-8d17-0998addc52f0",
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
  "arrived_at": "2026-10-30T22:44:50.877142Z",
  "started_at": "2026-10-30T22:44:51.1851Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

(the car drives 59 s to the next point)

`POST /api/driver/v1/work-sessions/9f3455ad-3de1-44ce-8af9-fe1c1a800ff7/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:45:50Z",
    "sequence": 1793400350502
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9f3455ad-3de1-44ce-8af9-fe1c1a800ff7",
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
  "last_heartbeat_at": "2026-10-30T22:45:50.522049Z",
  "last_location_at": "2026-10-30T22:45:50.522049Z",
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
  "device_ref": "sandbox-1021"
}
```

```json
{
  "challenge_id": "77d6b2f6-624b-4e9c-b382-a0d076a949a1",
  "expires_at": "2026-10-30T22:50:50.811708911Z",
  "resend_available_at": "2026-10-30T22:45:51.811708911Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "660581",
  "sent_at": "2026-10-30T22:45:50.814383358Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "77d6b2f6-624b-4e9c-b382-a0d076a949a1",
  "code": "660581",
  "device_ref": "sandbox-1021"
}
```

```json
{
  "session_id": "a8e4eda6-653c-4a2a-95c5-1d20b9d26a2c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwMTI1MSwiaWF0IjoxNzkzNDAwMzUxLCJqdGkiOiIwYTI3NmM3Zi0zODhmLTRmODItOTk5Yy1lYjNmOGI0ZjFlN2MiLCJzaWQiOiJhOGU0ZWRhNi02NTNjLTRhMmEtOTVjNS0xZDIwYjlkMjZhMmMifQ.CjP2TJrKGjo_g3rI84J-Axvog93OhVdcb_4gPpxMuO0",
  "access_expires_at": "2026-10-30T23:00:51.140446494Z",
  "refresh_token": "JmaJNoblLgIl9btJn4WKl7oGY7gQKwEg4wQoYwYlAgY",
  "refresh_expires_at": "2026-11-29T22:45:51.139881497Z",
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
  "command_id": "e2f9256d-b3f1-44c7-ac83-edb8bdaf243e",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:45:51Z",
    "sequence": 1793400351730
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "adacf9f9-14d0-4b6d-b265-581e8b05d003",
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
  "last_heartbeat_at": "2026-10-30T22:45:51.748305Z",
  "last_location_at": "2026-10-30T22:45:51.748305Z",
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
  "session_id": "7587593f-10c7-4f73-9247-e77ca7531836",
  "subject": {
    "type": "STAFF",
    "id": "09fe1c69-c031-458c-a537-a40fa884b9ac"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwOWZlMWM2OS1jMDMxLTQ1OGMtYTUzNy1hNDBmYTg4NGI5YWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDEyNTIsImlhdCI6MTc5MzQwMDM1MiwianRpIjoiZWJmNjhhNTItZjlmZC00YmVmLWE0NjQtMGI4MDliNjY0Y2MzIiwic2lkIjoiNzU4NzU5M2YtMTBjNy00ZjczLTkyNDctZTc3Y2E3NTMxODM2In0.3hSVj685WKwg5eOW2e-ZBD5ybVm4Fm29vWi76nNsC5Q",
  "access_expires_at": "2026-10-30T23:00:52.343807784Z",
  "refresh_token": "klGfTll_Jz5Xvsbuhk-R1dLzK-Htv0qSFT6sedFUE1w",
  "refresh_expires_at": "2026-10-31T10:45:52.343250542Z",
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
  "session_id": "d649d67f-0a86-4426-bbac-f101ac9d6a38",
  "subject": {
    "type": "STAFF",
    "id": "09fe1c69-c031-458c-a537-a40fa884b9ac"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwOWZlMWM2OS1jMDMxLTQ1OGMtYTUzNy1hNDBmYTg4NGI5YWMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDEyNTIsImlhdCI6MTc5MzQwMDM1MiwianRpIjoiYWJhY2FjNTctNWNmMC00NWRhLWIwZTctMTE5MWIyNWM0MTEyIiwic2lkIjoiZDY0OWQ2N2YtMGE4Ni00NDI2LWJiYWMtZjEwMWFjOWQ2YTM4In0.PoX3Cs5YS5yP_RPaRT4Kp1bHwfNH7jSz-AZrNJJVvhA",
  "access_expires_at": "2026-10-30T23:00:52.919299942Z",
  "refresh_token": "qy3rDqem0IBcciEZmXyP2vNIWXImLYxVUlhhhSqwAvs",
  "refresh_expires_at": "2026-10-31T10:45:52.918707704Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/8066cf9b-9973-4897-9553-74be8760c247` → **200**

```json
{
  "id": "8066cf9b-9973-4897-9553-74be8760c247",
  "short_number": 25,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "3e790eb4-a52a-4897-9d94-100534f7bab8",
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
    "id": "6b7141e2-093e-47b3-8d17-0998addc52f0",
    "order_id": "8066cf9b-9973-4897-9553-74be8760c247",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "de81b70b-ecbf-41ad-88ea-5f2dcde28c46",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-30T22:44:49.341191Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/8066cf9b-9973-4897-9553-74be8760c247/interrupt` → **200**

```json
{
  "command_id": "410c9166-1118-4fc8-a11c-d5ed852dcafa",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "8066cf9b-9973-4897-9553-74be8760c247",
    "short_number": 25,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "3e790eb4-a52a-4897-9d94-100534f7bab8",
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
      "id": "6b7141e2-093e-47b3-8d17-0998addc52f0",
      "order_id": "8066cf9b-9973-4897-9553-74be8760c247",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "de81b70b-ecbf-41ad-88ea-5f2dcde28c46",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-30T22:44:49.341191Z",
    "caller": null,
    "cancellation": {
      "by": "STAFF",
      "reason_code": "VEHICLE_BREAKDOWN",
      "reason_labels": {
        "ru": "Поломка автомобиля в пути",
        "en": "Vehicle broke down on the way",
        "uk": "Поломка автомобіля в дорозі",
        "pl": "Awaria auta w trasie"
      }
    },
    "pickup_at": null,
    "preorder": false,
    "reservation": null,
    "related_order_id": null
  },
  "follow_up": {
    "id": "3a4d174b-8ba5-4e39-96d2-5e27e8632e55",
    "short_number": 26,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "3e790eb4-a52a-4897-9d94-100534f7bab8",
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
    "id": "3b997bcc-b555-415c-969b-5b4fb2ae2b3b",
    "order_id": "3a4d174b-8ba5-4e39-96d2-5e27e8632e55",
    "expires_at": "2026-10-30T22:46:08.537472Z",
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

`POST /api/driver/v1/offers/3b997bcc-b555-415c-969b-5b4fb2ae2b3b/accept` → **200**

```json
{
  "command_id": "5e842321-7213-4311-8770-c9128d5efbe5"
}
```

```json
{
  "id": "5ec88223-6513-4200-8bab-fe50db62d773",
  "order_id": "3a4d174b-8ba5-4e39-96d2-5e27e8632e55",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "22288f82-c9c3-4055-8e57-d5f9b6624026",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "22288f82-c9c3-4055-8e57-d5f9b6624026",
  "order_id": "3a4d174b-8ba5-4e39-96d2-5e27e8632e55",
  "assignment_id": "5ec88223-6513-4200-8bab-fe50db62d773",
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
  "session_id": "adacf9f9-14d0-4b6d-b265-581e8b05d003",
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
  "last_heartbeat_at": "2026-10-30T22:45:51.748305Z",
  "last_location_at": "2026-10-30T22:45:51.748305Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/adacf9f9-14d0-4b6d-b265-581e8b05d003/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:45:55Z",
    "sequence": 1793400355100
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "adacf9f9-14d0-4b6d-b265-581e8b05d003",
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
  "last_heartbeat_at": "2026-10-30T22:45:55.11928Z",
  "last_location_at": "2026-10-30T22:45:55.11928Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/22288f82-c9c3-4055-8e57-d5f9b6624026/arrive` → **200**

```json
{
  "command_id": "e9f8e7eb-24eb-429f-9b24-f8e133ad215b",
  "expected_version": 0
}
```

```json
{
  "id": "22288f82-c9c3-4055-8e57-d5f9b6624026",
  "order_id": "3a4d174b-8ba5-4e39-96d2-5e27e8632e55",
  "assignment_id": "5ec88223-6513-4200-8bab-fe50db62d773",
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
  "arrived_at": "2026-10-30T22:45:55.418143Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/22288f82-c9c3-4055-8e57-d5f9b6624026/start` → **200**

```json
{
  "command_id": "49fd0a05-fa09-4184-b4b7-3e39c0c502f5",
  "expected_version": 1
}
```

```json
{
  "id": "22288f82-c9c3-4055-8e57-d5f9b6624026",
  "order_id": "3a4d174b-8ba5-4e39-96d2-5e27e8632e55",
  "assignment_id": "5ec88223-6513-4200-8bab-fe50db62d773",
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
  "arrived_at": "2026-10-30T22:45:55.418143Z",
  "started_at": "2026-10-30T22:45:55.727711Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/22288f82-c9c3-4055-8e57-d5f9b6624026/complete` → **200**

```json
{
  "command_id": "4c9cb44b-654d-4dfc-821c-3117fb49f29f",
  "expected_version": 2,
  "reported_at": "2026-10-30T22:45:56Z"
}
```

```json
{
  "id": "22288f82-c9c3-4055-8e57-d5f9b6624026",
  "order_id": "3a4d174b-8ba5-4e39-96d2-5e27e8632e55",
  "assignment_id": "5ec88223-6513-4200-8bab-fe50db62d773",
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
  "arrived_at": "2026-10-30T22:45:55.418143Z",
  "started_at": "2026-10-30T22:45:55.727711Z",
  "completed_at": "2026-10-30T22:45:56.036586Z",
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
      "id": "3a4d174b-8ba5-4e39-96d2-5e27e8632e55",
      "short_number": 26,
      "status": "FULFILLED",
      "created_at": "2026-10-30T22:45:53.527586Z",
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
      "id": "8066cf9b-9973-4897-9553-74be8760c247",
      "short_number": 25,
      "status": "CANCELLED",
      "created_at": "2026-10-30T22:44:49.341191Z",
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
          "ru": "Поломка автомобиля в пути",
          "en": "Vehicle broke down on the way",
          "uk": "Поломка автомобіля в дорозі",
          "pl": "Awaria auta w trasie"
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

`GET /api/operator/v1/orders/8066cf9b-9973-4897-9553-74be8760c247/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T22:44:49.341732Z",
      "actor": {
        "type": "CLIENT",
        "id": "3e790eb4-a52a-4897-9d94-100534f7bab8",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "8066cf9b-9973-4897-9553-74be8760c247",
        "quote_id": "e8c0f36d-846b-4f2c-b0af-6969d9e63639",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "7bcf894a-4eca-47af-8253-4589083efe25"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T22:44:49.343858Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "8066cf9b-9973-4897-9553-74be8760c247",
        "attempt_id": "01c5b3d9-d99c-4148-8906-bed8189e80a9",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "7bcf894a-4eca-47af-8253-4589083efe25"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T22:44:49.366816Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "e549acf4-e26c-4d3f-855f-f42f7f2f5d7a",
        "order_id": "8066cf9b-9973-4897-9553-74be8760c247",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78,
        "expires_at": "2026-10-30T22:45:04.344654541Z"
      },
      "correlation_id": "7bcf894a-4eca-47af-8253-4589083efe25"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T22:44:49.971972Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "e549acf4-e26c-4d3f-855f-f42f7f2f5d7a",
        "order_id": "8066cf9b-9973-4897-9553-74be8760c247",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "6b7141e2-093e-47b3-8d17-0998addc52f0"
      },
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/3a4d174b-8ba5-4e39-96d2-5e27e8632e55/tip` → **200**

```json
{
  "order_id": "3a4d174b-8ba5-4e39-96d2-5e27e8632e55",
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
  "available_until": "2026-10-31T22:45:56.036586Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/3a4d174b-8ba5-4e39-96d2-5e27e8632e55/tip` → **409**

```json
{
  "command_id": "61aee089-9399-4867-904b-6d3b673fb347",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/3a4d174b-8ba5-4e39-96d2-5e27e8632e55/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "7ea64141-0c96-487b-8b8c-913f4e7128b3"
}
```

Done: interrupted 8066cf9b-9973-4897-9553-74be8760c247, follow-up 3a4d174b-8ba5-4e39-96d2-5e27e8632e55.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9f3455ad-3de1-44ce-8af9-fe1c1a800ff7",
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
  "last_heartbeat_at": "2026-10-30T22:45:50.522049Z",
  "last_location_at": "2026-10-30T22:45:50.522049Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9f3455ad-3de1-44ce-8af9-fe1c1a800ff7/close` → **200**

```json
{
  "command_id": "abb1ed46-6e5e-4281-8bba-8a5cc9334e5d",
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
  "session_id": "adacf9f9-14d0-4b6d-b265-581e8b05d003",
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
  "last_heartbeat_at": "2026-10-30T22:45:55.11928Z",
  "last_location_at": "2026-10-30T22:45:55.11928Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/adacf9f9-14d0-4b6d-b265-581e8b05d003/close` → **200**

```json
{
  "command_id": "b6f7dd64-7cf2-420c-83bb-9b63d1fabeb4",
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
  "session_id": "b30f8665-2579-4a2f-a2d4-76e05f2306a3",
  "subject": {
    "type": "STAFF",
    "id": "09fe1c69-c031-458c-a537-a40fa884b9ac"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwOWZlMWM2OS1jMDMxLTQ1OGMtYTUzNy1hNDBmYTg4NGI5YWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDEyNjIsImlhdCI6MTc5MzQwMDM2MiwianRpIjoiMDY3YTNhMWMtNjY1Ny00YzA5LTk3YzktYTBlMjM5NzQyMzllIiwic2lkIjoiYjMwZjg2NjUtMjU3OS00YTJmLWEyZDQtNzZlMDVmMjMwNmEzIn0.x4HQFfrZHOkjrNrjDYFeZMr4ivTQ6xLldX0VBCMAoPY",
  "access_expires_at": "2026-10-30T23:01:02.300546136Z",
  "refresh_token": "65lWNxn62N4nvBBAQ-saBrVqjc3O8XDjKVcQgANGe6o",
  "refresh_expires_at": "2026-10-31T10:46:02.299965329Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "b2c54ec2-7e9a-4a61-9b49-e779ec9e706e",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T22:46:02Z"
}
```

```json
{
  "id": "49a4e079-42d0-4a4c-9023-b206e79841ad",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T22:46:02Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/49a4e079-42d0-4a4c-9023-b206e79841ad/publish` → **200**

```json
{
  "command_id": "9f2ccf63-030a-41b8-a19e-4b9966637e3b",
  "expected_version": 0
}
```

```json
{
  "id": "49a4e079-42d0-4a4c-9023-b206e79841ad",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T22:46:02.899888Z",
  "published_at": "2026-10-30T22:46:02.899888Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "49a4e079-42d0-4a4c-9023-b206e79841ad",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-30T22:46:02.899888Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632579678",
  "device_ref": "sandbox-18922"
}
```

```json
{
  "challenge_id": "113cd1da-1b3e-407c-9d22-57f76fb5f8f9",
  "expires_at": "2026-10-30T22:51:03.472995601Z",
  "resend_available_at": "2026-10-30T22:46:04.472995601Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632579678` → **200**

```json
{
  "phone": "+380632579678",
  "audience": "CLIENT",
  "code": "972210",
  "sent_at": "2026-10-30T22:46:03.475855131Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "113cd1da-1b3e-407c-9d22-57f76fb5f8f9",
  "code": "972210",
  "device_ref": "sandbox-18922"
}
```

```json
{
  "session_id": "ceaf785f-9da1-4916-995d-e93f6dfe277c",
  "subject": {
    "type": "CLIENT",
    "id": "1b597fa5-4da0-4764-8a33-346529595c66"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxYjU5N2ZhNS00ZGEwLTQ3NjQtOGEzMy0zNDY1Mjk1OTVjNjYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDAxMjYzLCJpYXQiOjE3OTM0MDAzNjMsImp0aSI6ImYxOTljMDUxLWMyMzEtNDA4Yy05MDkyLWRmZjU0MDFiOGFjYiIsInNpZCI6ImNlYWY3ODVmLTlkYTEtNDkxNi05OTVkLWU5M2Y2ZGZlMjc3YyJ9.evZZbt_EN097bi7_8eoDIGT5_IS0Q-xW_5Nm3EDdiJw",
  "access_expires_at": "2026-10-30T23:01:03.791439623Z",
  "refresh_token": "N5aDcKYW7zKi2WAe7lZagF4fqtFZfAW8QysivF0rxEA",
  "refresh_expires_at": "2026-11-29T22:46:03.790871429Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "49a4e079-42d0-4a4c-9023-b206e79841ad",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-30T22:46:02.899888Z",
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
  "command_id": "8324ab9b-462a-4262-a096-24ef4199ddd6",
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
  "id": "321aeeca-dfc5-42ab-b26f-59b59ae031c9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T22:51:04.400945Z",
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
  "command_id": "808c4097-0088-4057-b9c9-478e70e0f7c1",
  "quote_id": "321aeeca-dfc5-42ab-b26f-59b59ae031c9",
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
  "correlation_id": "68869151-5b60-42b1-b98b-8bf8bf69a9c6"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "1f710d34-eb6b-4cfe-9eca-cf020af62c12",
  "version_id": "49a4e079-42d0-4a4c-9023-b206e79841ad",
  "language": "uk"
}
```

```json
{
  "version_id": "49a4e079-42d0-4a4c-9023-b206e79841ad",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-30T22:46:05.000283Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "14d108e4-7733-433b-9d0d-e4eefd972463",
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
  "id": "9771aeb1-072e-4e9f-bf51-268295b179eb",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T22:51:05.290731Z",
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
  "command_id": "13cd1341-394b-44e7-86f6-cef97de8ded0",
  "quote_id": "9771aeb1-072e-4e9f-bf51-268295b179eb",
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
  "id": "40d83eed-bd6c-48e4-ad88-5e7395fd221b",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1b597fa5-4da0-4764-8a33-346529595c66",
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
  "created_at": "2026-10-30T22:46:05.586411Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

`GET /api/rider/v1/orders/40d83eed-bd6c-48e4-ad88-5e7395fd221b` → **200**

```json
{
  "id": "40d83eed-bd6c-48e4-ad88-5e7395fd221b",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1b597fa5-4da0-4764-8a33-346529595c66",
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
  "created_at": "2026-10-30T22:46:05.586411Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

`POST /api/rider/v1/orders/40d83eed-bd6c-48e4-ad88-5e7395fd221b/cancel` → **200**

```json
{
  "command_id": "40ac02cb-e955-4b69-be01-8df72aef4626",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "40d83eed-bd6c-48e4-ad88-5e7395fd221b",
  "short_number": 27,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "1b597fa5-4da0-4764-8a33-346529595c66",
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
  "created_at": "2026-10-30T22:46:05.586411Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "ru": "Передумал ехать",
      "en": "Changed my mind",
      "uk": "Передумав їхати",
      "pl": "Zmiana planów"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

## A published version never changes

`POST /api/admin/v1/legal-documents/49a4e079-42d0-4a4c-9023-b206e79841ad` → **409**

```json
{
  "command_id": "d2a69a00-0d2c-4d49-88a9-c01a55865524",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T22:46:06Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/49a4e079-42d0-4a4c-9023-b206e79841ad",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "a2a45717-0aeb-4f56-b19b-c1eb1cb870bc"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "ea860d88-8cdf-4448-97ce-c1a7fa2f46dd",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T22:46:06Z"
}
```

```json
{
  "id": "f328dbce-4011-4dd4-89a3-9f1613333f3e",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T22:46:06Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/f328dbce-4011-4dd4-89a3-9f1613333f3e/publish` → **200**

```json
{
  "command_id": "caec38f0-d57f-48a7-ae9f-595aa0ba8f01",
  "expected_version": 0
}
```

```json
{
  "id": "f328dbce-4011-4dd4-89a3-9f1613333f3e",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T22:46:07.18259Z",
  "published_at": "2026-10-30T22:46:07.18259Z",
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
  "device_ref": "sandbox-12152"
}
```

```json
{
  "challenge_id": "78b5685a-af75-4302-b50a-3dbbf8a4a287",
  "expires_at": "2026-10-30T22:51:07.479158903Z",
  "resend_available_at": "2026-10-30T22:46:08.479158903Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "287140",
  "sent_at": "2026-10-30T22:46:07.482825558Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "78b5685a-af75-4302-b50a-3dbbf8a4a287",
  "code": "287140",
  "device_ref": "sandbox-12152"
}
```

```json
{
  "session_id": "d6fbec80-edde-4f7f-95f6-efa6db2a7d27",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwMTI2NywiaWF0IjoxNzkzNDAwMzY3LCJqdGkiOiJmZDc2NWJmMy03MzRjLTQ2Y2EtOGM4MC1kMmQwMWQzZWM1NjUiLCJzaWQiOiJkNmZiZWM4MC1lZGRlLTRmN2YtOTVmNi1lZmE2ZGIyYTdkMjcifQ.qEFcn5lWUGlZbDp5JkppNrtN4V-c9xppjXNXR-_MkMw",
  "access_expires_at": "2026-10-30T23:01:07.792348971Z",
  "refresh_token": "NIo6DI1_4uI2rhA8QcTESt8AE7GkeF7ydMTIoI6It94",
  "refresh_expires_at": "2026-11-29T22:46:07.791705185Z",
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

(the car drives 71 s to the next point)

`POST /api/driver/v1/work-sessions` → **201**

```json
{
  "command_id": "da002ac3-8e02-4696-ba5d-083aba7cbe6a",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:47:19Z",
    "sequence": 1793400439409
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "dddaacc9-365e-4a7a-837a-9526d6f1db69",
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
  "last_heartbeat_at": "2026-10-30T22:47:19.427603Z",
  "last_location_at": "2026-10-30T22:47:19.427603Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673067386",
  "device_ref": "sandbox-1738"
}
```

```json
{
  "challenge_id": "732a058c-4315-4d66-a267-990b0c7edda1",
  "expires_at": "2026-10-30T22:52:19.727581695Z",
  "resend_available_at": "2026-10-30T22:47:20.727581695Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380673067386` → **200**

```json
{
  "phone": "+380673067386",
  "audience": "CLIENT",
  "code": "680929",
  "sent_at": "2026-10-30T22:47:19.731656596Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "732a058c-4315-4d66-a267-990b0c7edda1",
  "code": "680929",
  "device_ref": "sandbox-1738"
}
```

```json
{
  "session_id": "a40ab8c6-15f5-4156-99ef-afbdd33eb68c",
  "subject": {
    "type": "CLIENT",
    "id": "c2b0586d-ef3d-40d1-955b-f9b573d40a5f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMmIwNTg2ZC1lZjNkLTQwZDEtOTU1Yi1mOWI1NzNkNDBhNWYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDAxMzQwLCJpYXQiOjE3OTM0MDA0NDAsImp0aSI6IjVkNmYwNWM0LTQwMzQtNDFlYy1hOTYzLTYxOGIxMDMzOGI5ZiIsInNpZCI6ImE0MGFiOGM2LTE1ZjUtNDE1Ni05OWVmLWFmYmRkMzNlYjY4YyJ9.CVnSxstcaYF3hY-QFqBMefArGZgu_xwM6FryLfOMbxc",
  "access_expires_at": "2026-10-30T23:02:20.071333986Z",
  "refresh_token": "jeIv9DT_QdUlw4QZV36XV-fq0tQMkX3LNVsBMDePbBw",
  "refresh_expires_at": "2026-11-29T22:47:20.070767134Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "da87de88-0319-48ac-a75e-f28631ef3a65",
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
  "id": "46120b63-42c2-479b-aa29-7251cf9f9f35",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T22:52:20.371402Z",
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
  "command_id": "dab7199f-648c-4a7f-8bcc-b3c953c3a9ec",
  "quote_id": "46120b63-42c2-479b-aa29-7251cf9f9f35",
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
    "phone": "+380673861729"
  }
}
```

```json
{
  "id": "da36c91d-fd63-4014-911c-05fd4a2d3fae",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c2b0586d-ef3d-40d1-955b-f9b573d40a5f",
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
  "created_at": "2026-10-30T22:47:20.679235Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

## The offer says nothing about granny; once accepted, the trip does

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "9a545f98-5c23-4743-a473-efa2fdfa6f4e",
    "order_id": "da36c91d-fd63-4014-911c-05fd4a2d3fae",
    "expires_at": "2026-10-30T22:47:35.68246Z",
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

`POST /api/driver/v1/offers/9a545f98-5c23-4743-a473-efa2fdfa6f4e/accept` → **200**

```json
{
  "command_id": "84034971-a98d-464d-9451-1bd989694096"
}
```

```json
{
  "id": "5dbd582a-152b-42dd-9ee3-e67b753e9652",
  "order_id": "da36c91d-fd63-4014-911c-05fd4a2d3fae",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c7bba2cd-30c6-4bb7-b999-584b5c11d987",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c7bba2cd-30c6-4bb7-b999-584b5c11d987",
  "order_id": "da36c91d-fd63-4014-911c-05fd4a2d3fae",
  "assignment_id": "5dbd582a-152b-42dd-9ee3-e67b753e9652",
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
    "phone": "+380673861729"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ea764f30-c209-4e57-a2fe-f40b84eae390",
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
  "id": "faef4bc4-4e42-49bf-8d47-d4f967ecab67",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T22:52:21.891664Z",
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
  "command_id": "7fd44589-1adc-4c77-9511-4921449d4b89",
  "quote_id": "faef4bc4-4e42-49bf-8d47-d4f967ecab67",
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
  "id": "56041109-1c9a-44bd-9107-ee9f1b0b3038",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c2b0586d-ef3d-40d1-955b-f9b573d40a5f",
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
  "created_at": "2026-10-30T22:47:22.194889Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "3ba5cc50-acfb-4db2-96f0-adac24860d4d",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-31T01:47:22Z"
}
```

```json
{
  "id": "c64d2daa-164b-4707-a624-60637bc282bc",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T22:52:22.518700Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-31T01:47:22Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "1406616f-9bd2-4b88-94c4-e721f9ed4b64",
  "quote_id": "c64d2daa-164b-4707-a624-60637bc282bc",
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
  "pickup_at": "2026-10-31T01:47:22Z"
}
```

```json
{
  "id": "cefe706d-7068-45bb-be8a-c2f65a65040c",
  "short_number": 30,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "c2b0586d-ef3d-40d1-955b-f9b573d40a5f",
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
  "created_at": "2026-10-30T22:47:22.823501Z",
  "cancellation": null,
  "pickup_at": "2026-10-31T01:47:22Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

## The fourth is refused: at most three active orders, orders for later included

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ef79d69e-99ad-4378-a434-518789bfb5cb",
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
  "id": "7b812a03-520a-458d-9c8f-e48aeff6d449",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T22:52:23.145002Z",
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
  "command_id": "7b48b935-315f-4deb-a758-d9650ea182c6",
  "quote_id": "7b812a03-520a-458d-9c8f-e48aeff6d449",
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
  "correlation_id": "6fbc0ca4-6282-40c6-900c-b67ff9d22c0f"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "cefe706d-7068-45bb-be8a-c2f65a65040c",
      "short_number": 30,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "c2b0586d-ef3d-40d1-955b-f9b573d40a5f",
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
      "created_at": "2026-10-30T22:47:22.823501Z",
      "cancellation": null,
      "pickup_at": "2026-10-31T01:47:22Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null,
      "driver": null,
      "driver_change": null
    },
    {
      "id": "56041109-1c9a-44bd-9107-ee9f1b0b3038",
      "short_number": 29,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "c2b0586d-ef3d-40d1-955b-f9b573d40a5f",
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
      "created_at": "2026-10-30T22:47:22.194889Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null,
      "driver": null,
      "driver_change": null
    },
    {
      "id": "da36c91d-fd63-4014-911c-05fd4a2d3fae",
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "56041109-1c9a-44bd-9107-ee9f1b0b3038",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c2b0586d-ef3d-40d1-955b-f9b573d40a5f",
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
  "created_at": "2026-10-30T22:47:22.194889Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

## The rider cancels all three; the driver goes off line

`GET /api/rider/v1/orders/da36c91d-fd63-4014-911c-05fd4a2d3fae` → **200**

```json
{
  "id": "da36c91d-fd63-4014-911c-05fd4a2d3fae",
  "short_number": 28,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "c2b0586d-ef3d-40d1-955b-f9b573d40a5f",
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
    "id": "5dbd582a-152b-42dd-9ee3-e67b753e9652",
    "order_id": "da36c91d-fd63-4014-911c-05fd4a2d3fae",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "c7bba2cd-30c6-4bb7-b999-584b5c11d987",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T22:47:20.679235Z",
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
    "location_at": "2026-10-30T22:47:19.427603Z",
    "stale": false
  },
  "driver": {
    "name": "Олег Коваль",
    "make": "Toyota",
    "model": "Corolla",
    "color": "grey",
    "registration_number": "AA0002TX",
    "photo_url": null
  },
  "driver_change": null
}
```

`POST /api/rider/v1/orders/da36c91d-fd63-4014-911c-05fd4a2d3fae/cancel` → **200**

```json
{
  "command_id": "7fbe0dcf-7d9f-4d2d-b3d1-0c4b58919a3f",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "da36c91d-fd63-4014-911c-05fd4a2d3fae",
  "short_number": 28,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "c2b0586d-ef3d-40d1-955b-f9b573d40a5f",
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
    "id": "5dbd582a-152b-42dd-9ee3-e67b753e9652",
    "order_id": "da36c91d-fd63-4014-911c-05fd4a2d3fae",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "c7bba2cd-30c6-4bb7-b999-584b5c11d987",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T22:47:20.679235Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "ru": "Передумал ехать",
      "en": "Changed my mind",
      "uk": "Передумав їхати",
      "pl": "Zmiana planów"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

`GET /api/rider/v1/orders/56041109-1c9a-44bd-9107-ee9f1b0b3038` → **200**

```json
{
  "id": "56041109-1c9a-44bd-9107-ee9f1b0b3038",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c2b0586d-ef3d-40d1-955b-f9b573d40a5f",
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
  "created_at": "2026-10-30T22:47:22.194889Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

`POST /api/rider/v1/orders/56041109-1c9a-44bd-9107-ee9f1b0b3038/cancel` → **200**

```json
{
  "command_id": "e46d381d-69e7-4bec-89d6-ad96cf92eb87",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "56041109-1c9a-44bd-9107-ee9f1b0b3038",
  "short_number": 29,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "c2b0586d-ef3d-40d1-955b-f9b573d40a5f",
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
  "created_at": "2026-10-30T22:47:22.194889Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "ru": "Передумал ехать",
      "en": "Changed my mind",
      "uk": "Передумав їхати",
      "pl": "Zmiana planów"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

`GET /api/rider/v1/orders/cefe706d-7068-45bb-be8a-c2f65a65040c` → **200**

```json
{
  "id": "cefe706d-7068-45bb-be8a-c2f65a65040c",
  "short_number": 30,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "c2b0586d-ef3d-40d1-955b-f9b573d40a5f",
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
  "created_at": "2026-10-30T22:47:22.823501Z",
  "cancellation": null,
  "pickup_at": "2026-10-31T01:47:22Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

`POST /api/rider/v1/orders/cefe706d-7068-45bb-be8a-c2f65a65040c/cancel` → **200**

```json
{
  "command_id": "88ee5f74-1f59-4343-80b9-ee69b9864d86",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "cefe706d-7068-45bb-be8a-c2f65a65040c",
  "short_number": 30,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "c2b0586d-ef3d-40d1-955b-f9b573d40a5f",
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
  "created_at": "2026-10-30T22:47:22.823501Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "ru": "Передумал ехать",
      "en": "Changed my mind",
      "uk": "Передумав їхати",
      "pl": "Zmiana planów"
    }
  },
  "pickup_at": "2026-10-31T01:47:22Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "dddaacc9-365e-4a7a-837a-9526d6f1db69",
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
  "last_heartbeat_at": "2026-10-30T22:47:19.427603Z",
  "last_location_at": "2026-10-30T22:47:19.427603Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/dddaacc9-365e-4a7a-837a-9526d6f1db69/close` → **200**

```json
{
  "command_id": "e7e01a91-e9de-41b2-9cdb-724d70120c01",
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

Done: orders da36c91d-fd63-4014-911c-05fd4a2d3fae, 56041109-1c9a-44bd-9107-ee9f1b0b3038, cefe706d-7068-45bb-be8a-c2f65a65040c.

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
  "session_id": "f683de3f-79ce-49d3-aeb1-76e48e4a9d3d",
  "subject": {
    "type": "STAFF",
    "id": "09fe1c69-c031-458c-a537-a40fa884b9ac"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwOWZlMWM2OS1jMDMxLTQ1OGMtYTUzNy1hNDBmYTg4NGI5YWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDEzNDcsImlhdCI6MTc5MzQwMDQ0NywianRpIjoiOGU1N2FhY2ItMmVlMi00NTI2LWJlMmEtMzJmNzYwYWMzMzdjIiwic2lkIjoiZjY4M2RlM2YtNzljZS00OWQzLWFlYjEtNzZlNDhlNGE5ZDNkIn0.zkn4M5j3nf89ON3cRNO0mjXk6ys2NIPewZK_YlctfIs",
  "access_expires_at": "2026-10-30T23:02:27.122447465Z",
  "refresh_token": "BPYnZy1ZyO9o6XqIrmrhzaFaUZpUxBy6lAcBbzRfX6c",
  "refresh_expires_at": "2026-10-31T10:47:27.121847843Z",
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
  "session_id": "dc1f4158-d5a9-4f42-8c11-63b730787476",
  "subject": {
    "type": "STAFF",
    "id": "09fe1c69-c031-458c-a537-a40fa884b9ac"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwOWZlMWM2OS1jMDMxLTQ1OGMtYTUzNy1hNDBmYTg4NGI5YWMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDEzNDcsImlhdCI6MTc5MzQwMDQ0NywianRpIjoiYjllZTE4MzYtYmNjNS00NGFhLWJkNDQtZjMzZjIyODI5MWY3Iiwic2lkIjoiZGMxZjQxNTgtZDVhOS00ZjQyLThjMTEtNjNiNzMwNzg3NDc2In0.A7TpDnmVUCNBdGrNvjfKx3m-83ms0AYqbwx4OR_Heb0",
  "access_expires_at": "2026-10-30T23:02:27.703364031Z",
  "refresh_token": "sqTL48Ljuw0HkvT8HgbX-NIZb_hMnTPRjWUiZrT8k24",
  "refresh_expires_at": "2026-10-31T10:47:27.70276552Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-25828"
}
```

```json
{
  "challenge_id": "6aba9c84-aabf-4d86-b2a8-866bbd7d0bd4",
  "expires_at": "2026-10-30T22:52:27.985017552Z",
  "resend_available_at": "2026-10-30T22:47:28.985017552Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "635418",
  "sent_at": "2026-10-30T22:47:27.98824602Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6aba9c84-aabf-4d86-b2a8-866bbd7d0bd4",
  "code": "635418",
  "device_ref": "sandbox-25828"
}
```

```json
{
  "session_id": "b15f3ea8-3f14-4ba7-867f-a447107406fb",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwMTM0OCwiaWF0IjoxNzkzNDAwNDQ4LCJqdGkiOiJmZWIzMmE0My05OTEzLTQ4YTQtOWI3ZS1jYTU3YzkyZjJkZjUiLCJzaWQiOiJiMTVmM2VhOC0zZjE0LTRiYTctODY3Zi1hNDQ3MTA3NDA2ZmIifQ.JpQ_Edo4GtlMFumf5suBQQTEVe1ieu1VP9W2cnSxa0w",
  "access_expires_at": "2026-10-30T23:02:28.30428394Z",
  "refresh_token": "3fEcn8snVKf-nF-Dec_JYMu8LW3Iy5GiMSg59ErBXss",
  "refresh_expires_at": "2026-11-29T22:47:28.303695038Z",
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
  "command_id": "d37e4ded-f986-449c-80fb-41ef1035c195",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:47:28Z",
    "sequence": 1793400448902
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0d488390-866e-4172-975e-bcfdb3880f66",
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
  "last_heartbeat_at": "2026-10-30T22:47:28.920291Z",
  "last_location_at": "2026-10-30T22:47:28.920291Z",
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
  "command_id": "f3b98c6e-93cc-4410-a573-da8f6fcff531",
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
  "effective_at": "2026-10-30T22:47:29.52561Z",
  "changed_by": "09fe1c69-c031-458c-a537-a40fa884b9ac",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "09fe1c69-c031-458c-a537-a40fa884b9ac",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-30T22:34:26.588477Z",
  "last_entries": [
    {
      "order_id": "d9fe2d15-a07e-4ac9-9ad2-5b03b0469237",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T22:34:26.588477Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "afc5564b-e9e2-45ba-adc6-90e355789e97",
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
  "id": "5a213c06-66af-48bc-b14b-ec1ae0cb1b59",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T22:52:30.138082Z",
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
  "command_id": "6cc317ce-aa47-477c-8d4a-66b0e6756998",
  "quote_id": "5a213c06-66af-48bc-b14b-ec1ae0cb1b59",
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
    "phone": "+3806711117925"
  }
}
```

```json
{
  "id": "3ecb4aff-34e9-4161-8030-bd28a8b41342",
  "short_number": 31,
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
  "created_at": "2026-10-30T22:47:30.445815Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711117925"
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
    "id": "af61049b-a1de-47cb-8da6-1e732a141467",
    "order_id": "3ecb4aff-34e9-4161-8030-bd28a8b41342",
    "expires_at": "2026-10-30T22:47:45.45001Z",
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

`POST /api/driver/v1/offers/af61049b-a1de-47cb-8da6-1e732a141467/accept` → **200**

```json
{
  "command_id": "5fad00f9-d109-487c-aafc-d591f9e70b90"
}
```

```json
{
  "id": "4b6edfe9-ed59-4572-902d-b5bf1a1a0acc",
  "order_id": "3ecb4aff-34e9-4161-8030-bd28a8b41342",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "647c79ed-7ff4-462a-b9a8-e5766378c107",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "647c79ed-7ff4-462a-b9a8-e5766378c107",
  "order_id": "3ecb4aff-34e9-4161-8030-bd28a8b41342",
  "assignment_id": "4b6edfe9-ed59-4572-902d-b5bf1a1a0acc",
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
    "phone": "+3806711117925"
  }
}
```

`POST /api/driver/v1/work-sessions/0d488390-866e-4172-975e-bcfdb3880f66/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:47:31Z",
    "sequence": 1793400451660
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0d488390-866e-4172-975e-bcfdb3880f66",
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
  "last_heartbeat_at": "2026-10-30T22:47:31.678148Z",
  "last_location_at": "2026-10-30T22:47:31.678148Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/647c79ed-7ff4-462a-b9a8-e5766378c107/arrive` → **200**

```json
{
  "command_id": "e24cd05e-958c-4cd8-9725-229a478f5de5",
  "expected_version": 0
}
```

```json
{
  "id": "647c79ed-7ff4-462a-b9a8-e5766378c107",
  "order_id": "3ecb4aff-34e9-4161-8030-bd28a8b41342",
  "assignment_id": "4b6edfe9-ed59-4572-902d-b5bf1a1a0acc",
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
  "arrived_at": "2026-10-30T22:47:31.972439Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711117925"
  }
}
```

`POST /api/driver/v1/trips/647c79ed-7ff4-462a-b9a8-e5766378c107/start` → **200**

```json
{
  "command_id": "e9560566-f996-4972-8835-7681d3227867",
  "expected_version": 1
}
```

```json
{
  "id": "647c79ed-7ff4-462a-b9a8-e5766378c107",
  "order_id": "3ecb4aff-34e9-4161-8030-bd28a8b41342",
  "assignment_id": "4b6edfe9-ed59-4572-902d-b5bf1a1a0acc",
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
  "arrived_at": "2026-10-30T22:47:31.972439Z",
  "started_at": "2026-10-30T22:47:32.277588Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711117925"
  }
}
```

`POST /api/driver/v1/trips/647c79ed-7ff4-462a-b9a8-e5766378c107/complete` → **200**

```json
{
  "command_id": "4e0b5664-8ec2-40d9-af14-d9591004b7fb",
  "expected_version": 2,
  "reported_at": "2026-10-30T22:47:32Z",
  "cash_received": true
}
```

```json
{
  "id": "647c79ed-7ff4-462a-b9a8-e5766378c107",
  "order_id": "3ecb4aff-34e9-4161-8030-bd28a8b41342",
  "assignment_id": "4b6edfe9-ed59-4572-902d-b5bf1a1a0acc",
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
  "arrived_at": "2026-10-30T22:47:31.972439Z",
  "started_at": "2026-10-30T22:47:32.277588Z",
  "completed_at": "2026-10-30T22:47:32.589346Z",
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
  "command_id": "093eb2b8-6661-463e-89bf-288b397a4955",
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
  "id": "f7936a15-bfbc-42b4-907e-919f6f127e0e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T22:52:32.905032Z",
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
  "command_id": "4a245f10-46d3-43f4-85ec-456257c07196",
  "quote_id": "f7936a15-bfbc-42b4-907e-919f6f127e0e",
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
    "phone": "+3806711115644"
  }
}
```

```json
{
  "id": "393e67c1-b5db-4f85-ac99-c0d88555bdca",
  "short_number": 32,
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
  "created_at": "2026-10-30T22:47:33.214459Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711115644"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/393e67c1-b5db-4f85-ac99-c0d88555bdca` → **200**

```json
{
  "id": "393e67c1-b5db-4f85-ac99-c0d88555bdca",
  "short_number": 32,
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
  "created_at": "2026-10-30T22:47:33.214459Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711115644"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/393e67c1-b5db-4f85-ac99-c0d88555bdca/cancel` → **200**

```json
{
  "command_id": "c9eaf140-521e-47d7-ba6e-3e3bf359b6ad",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "393e67c1-b5db-4f85-ac99-c0d88555bdca",
  "short_number": 32,
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
  "created_at": "2026-10-30T22:47:33.214459Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711115644"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "OPERATOR_ERROR",
    "reason_labels": {
      "ru": "Ошибка оператора",
      "en": "Operator error",
      "uk": "Помилка оператора",
      "pl": "Błąd operatora"
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
  "staff_id": "09fe1c69-c031-458c-a537-a40fa884b9ac",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-30T22:34:26.588477Z",
  "last_entries": [
    {
      "order_id": "393e67c1-b5db-4f85-ac99-c0d88555bdca",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-30T22:47:33.846202Z"
    },
    {
      "order_id": "3ecb4aff-34e9-4161-8030-bd28a8b41342",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-30T22:47:32.595571Z"
    },
    {
      "order_id": "d9fe2d15-a07e-4ac9-9ad2-5b03b0469237",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T22:34:26.588477Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0d488390-866e-4172-975e-bcfdb3880f66",
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
  "last_heartbeat_at": "2026-10-30T22:47:31.678148Z",
  "last_location_at": "2026-10-30T22:47:31.678148Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/0d488390-866e-4172-975e-bcfdb3880f66/close` → **200**

```json
{
  "command_id": "04012505-adc7-46a8-b0a1-e0b2bc6c23e9",
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

Done: operator bonus for fulfilled 3ecb4aff-34e9-4161-8030-bd28a8b41342 and operator-fault cancellation 393e67c1-b5db-4f85-ac99-c0d88555bdca.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679736574",
  "device_ref": "sandbox-4434"
}
```

```json
{
  "challenge_id": "e8d43fe9-8903-499b-970d-b86238f4e37b",
  "expires_at": "2026-10-30T22:52:38.275975407Z",
  "resend_available_at": "2026-10-30T22:47:39.275975407Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380679736574` → **200**

```json
{
  "phone": "+380679736574",
  "audience": "CLIENT",
  "code": "956971",
  "sent_at": "2026-10-30T22:47:38.279876301Z",
  "channel": "SMS"
}
```

## "Call me instead" on the first try still gets an SMS; the resend is a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677650294",
  "device_ref": "sandbox-26055",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "4113adc4-a62c-4a1e-b43e-dbc02883a518",
  "expires_at": "2026-10-30T22:52:39.803267223Z",
  "resend_available_at": "2026-10-30T22:47:40.803267223Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380677650294` → **200**

```json
{
  "phone": "+380677650294",
  "audience": "CLIENT",
  "code": "534148",
  "sent_at": "2026-10-30T22:47:39.808543906Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677650294",
  "device_ref": "sandbox-32242",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "59f167e1-a3a0-4bc8-8163-3d8c68e987c4",
  "expires_at": "2026-10-30T22:52:41.326973252Z",
  "resend_available_at": "2026-10-30T22:47:42.326973252Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380677650294` → **200**

```json
{
  "phone": "+380677650294",
  "audience": "CLIENT",
  "code": "957341",
  "sent_at": "2026-10-30T22:47:41.330514654Z",
  "channel": "VOICE"
}
```

## The SMS does not get through: one request, one attempt; the resend comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676370000",
  "device_ref": "sandbox-9946"
}
```

```json
{
  "challenge_id": "dc260ae6-f3b0-4adf-8b83-e7abadc94714",
  "expires_at": "2026-10-30T22:52:42.846104698Z",
  "resend_available_at": "2026-10-30T22:47:43.846104698Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676370000",
  "device_ref": "sandbox-1301"
}
```

```json
{
  "challenge_id": "22d90170-1569-4340-a810-97945980d69b",
  "expires_at": "2026-10-30T22:52:44.345411268Z",
  "resend_available_at": "2026-10-30T22:47:45.345411268Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380676370000` → **200**

```json
{
  "phone": "+380676370000",
  "audience": "CLIENT",
  "code": "624892",
  "sent_at": "2026-10-30T22:47:44.349042087Z",
  "channel": "VOICE"
}
```

## A second call in the hour is made, the third is refused

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676370000",
  "device_ref": "sandbox-15709",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "0e2ec4f6-d4d9-41aa-ab9c-e539380a1eb1",
  "expires_at": "2026-10-30T22:52:45.866423144Z",
  "resend_available_at": "2026-10-30T22:47:46.866423144Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380676370000` → **200**

```json
{
  "phone": "+380676370000",
  "audience": "CLIENT",
  "code": "112051",
  "sent_at": "2026-10-30T22:47:45.873105658Z",
  "channel": "VOICE"
}
```

`POST /auth/v1/otp/challenges` → **429**

```json
{
  "audience": "CLIENT",
  "phone": "+380676370000",
  "device_ref": "sandbox-3121",
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
  "correlation_id": "19c597b9-c390-491f-944a-c4a0d4393f40",
  "retryable": true,
  "retry_after_seconds": 3600
}
```

## Numbers outside Poland and Ukraine get nothing

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+442000004962"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "9d3a1b6d-6481-409d-990d-07a35c3a038f"
}
```

`GET /sandbox/v1/otp?phone=%2B442000004962` → **404**

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+37120016456"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "4173ebb0-93d5-40e6-ab19-fb625344b734"
}
```

`GET /sandbox/v1/otp?phone=%2B37120016456` → **404**

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
  "session_id": "eca57e9a-90fe-425b-8f23-f175a65f7268",
  "subject": {
    "type": "STAFF",
    "id": "09fe1c69-c031-458c-a537-a40fa884b9ac"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwOWZlMWM2OS1jMDMxLTQ1OGMtYTUzNy1hNDBmYTg4NGI5YWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDEzNjgsImlhdCI6MTc5MzQwMDQ2OCwianRpIjoiODRjNDgyMDktNDk4OS00NDU1LTg4YzktY2ZmMjMwZDVkZjFiIiwic2lkIjoiZWNhNTdlOWEtOTBmZS00MjViLThmMjMtZjE3NWE2NWY3MjY4In0.EogIhXiRSpHFrFo_YT7ozCo4aNs5BII22yNCav9-xB0",
  "access_expires_at": "2026-10-30T23:02:48.622282332Z",
  "refresh_token": "4vkl5Z8eUuZ27QvzUa8GDHgFlJMaSByzSInZ6LuLAJY",
  "refresh_expires_at": "2026-10-31T10:47:48.621721041Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380676370000` → **200**

```json
{
  "deliveries": [
    {
      "id": "8b7d85a3-dea0-4a03-851a-1f7d119833fa",
      "challenge_id": "0e2ec4f6-d4d9-41aa-ab9c-e539380a1eb1",
      "phone": "+380676370000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-68e7f6c4-42c6-471d-906f-9ea4ef147f73",
      "error": null,
      "attempted_at": "2026-10-30T22:47:45.873513Z"
    },
    {
      "id": "b1b6adfe-b04e-4d5e-b59e-c26374f5309c",
      "challenge_id": "22d90170-1569-4340-a810-97945980d69b",
      "phone": "+380676370000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-8c7991d6-fae6-40f1-83e3-95471c500f62",
      "error": null,
      "attempted_at": "2026-10-30T22:47:44.349266Z"
    },
    {
      "id": "339efb16-654f-423e-93c8-d4c7af2f0be5",
      "challenge_id": "dc260ae6-f3b0-4adf-8b83-e7abadc94714",
      "phone": "+380676370000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-30T22:47:42.848795Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380676370000` → **200**

```json
{
  "phone": "+380676370000",
  "audience": "CLIENT",
  "code": "112051",
  "sent_at": "2026-10-30T22:47:45.873105658Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380677650294` → **200**

```json
{
  "deliveries": [
    {
      "id": "138e9a65-a708-4b7a-990d-ec063e603253",
      "challenge_id": "59f167e1-a3a0-4bc8-8163-3d8c68e987c4",
      "phone": "+380677650294",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-1bfd53e9-20bb-48a0-99e9-d496f7a2c941",
      "error": null,
      "attempted_at": "2026-10-30T22:47:41.330771Z"
    },
    {
      "id": "06538d3c-695f-4aa0-a83d-9b8ac8c0eebb",
      "challenge_id": "4113adc4-a62c-4a1e-b43e-dbc02883a518",
      "phone": "+380677650294",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-7cf21463-19f9-4281-ad7c-87ff92d584be",
      "error": null,
      "attempted_at": "2026-10-30T22:47:39.808972Z"
    }
  ]
}
```

Done: SMS to +380679736574; SMS then a call to +380677650294; a failed SMS, two calls and a refused third to +380676370000; +44 and +371 refused.

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
  "session_id": "4fcb2954-39d7-4529-a12c-9a9a77b108c9",
  "subject": {
    "type": "STAFF",
    "id": "09fe1c69-c031-458c-a537-a40fa884b9ac"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwOWZlMWM2OS1jMDMxLTQ1OGMtYTUzNy1hNDBmYTg4NGI5YWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDEzNjksImlhdCI6MTc5MzQwMDQ2OSwianRpIjoiNTYwMjkxY2QtZmJhZC00YTAyLThjYTktODFhOWZhZDAyMGY5Iiwic2lkIjoiNGZjYjI5NTQtMzlkNy00NTI5LWExMmMtOWE5YTc3YjEwOGM5In0.RKzlj4eXbyQfh7t-qSfhfMEzR-sm5H3U83O8Mr_G9aE",
  "access_expires_at": "2026-10-30T23:02:49.832398488Z",
  "refresh_token": "UCyr5riFMsV_xjXzQyPiZIeYvpKDa5rFGS4NdmuA0-g",
  "refresh_expires_at": "2026-10-31T10:47:49.831811839Z",
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
  "session_id": "0df8e9c2-39fb-4cb2-a97b-f2b8f9517936",
  "subject": {
    "type": "STAFF",
    "id": "09fe1c69-c031-458c-a537-a40fa884b9ac"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwOWZlMWM2OS1jMDMxLTQ1OGMtYTUzNy1hNDBmYTg4NGI5YWMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDEzNzAsImlhdCI6MTc5MzQwMDQ3MCwianRpIjoiMjE1YjQ4M2ItMjU5NC00N2M0LWI4OWEtMDlmZTU5ZTY3YjBhIiwic2lkIjoiMGRmOGU5YzItMzlmYi00Y2IyLWE5N2ItZjJiOGY5NTE3OTM2In0.o7gZBe0ItJOq924kRxZyulnLnlWQa6r0n6tS6Kjsxmk",
  "access_expires_at": "2026-10-30T23:02:50.416129214Z",
  "refresh_token": "iNzJtBOAc9VeZtXvyr4f9H1n0BUMADDkR4PiP265uXg",
  "refresh_expires_at": "2026-10-31T10:47:50.415554428Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "09fe1c69-c031-458c-a537-a40fa884b9ac",
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

`POST /api/admin/v1/staff-extensions/09fe1c69-c031-458c-a537-a40fa884b9ac` → **200**

```json
{
  "command_id": "b1586673-ce8a-4ad5-a27f-53a8de15967b",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "09fe1c69-c031-458c-a537-a40fa884b9ac",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "b507c7b0-8035-482e-96ff-8977f30ecfae",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T22:47:51.594367Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T22:47:51.594367Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "ab0e33d4-c329-4310-a84c-fdb74df71131",
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
  "id": "371954f9-7a00-435c-8c65-5488fece12a1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T22:52:52.167176Z",
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
  "command_id": "07a5ad94-2ea3-45e2-9ed5-48deccb448c0",
  "quote_id": "371954f9-7a00-435c-8c65-5488fece12a1",
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
    "phone": "+380675951926"
  }
}
```

```json
{
  "id": "2b0de788-78e0-4ff9-b0d7-b78220613243",
  "short_number": 33,
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
  "created_at": "2026-10-30T22:47:52.472414Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675951926"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/2b0de788-78e0-4ff9-b0d7-b78220613243/calls` → **201**

```json
{
  "command_id": "3ee849d7-e61f-4a92-b0c2-ad46bcc06827",
  "to": "CALLER"
}
```

```json
{
  "id": "030cd27e-595e-4aa5-acec-a1898b9609cf",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "09fe1c69-c031-458c-a537-a40fa884b9ac",
  "order_ids": [
    "2b0de788-78e0-4ff9-b0d7-b78220613243"
  ],
  "started_at": "2026-10-30T22:47:52.834792Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/2b0de788-78e0-4ff9-b0d7-b78220613243/calls` → **201**

```json
{
  "command_id": "3ee849d7-e61f-4a92-b0c2-ad46bcc06827",
  "to": "CALLER"
}
```

```json
{
  "id": "030cd27e-595e-4aa5-acec-a1898b9609cf",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "09fe1c69-c031-458c-a537-a40fa884b9ac",
  "order_ids": [
    "2b0de788-78e0-4ff9-b0d7-b78220613243"
  ],
  "started_at": "2026-10-30T22:47:52.834792Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "030cd27e-595e-4aa5-acec-a1898b9609cf",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380675951926",
    "at": "2026-10-30T22:47:52.837179774Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "030cd27e-595e-4aa5-acec-a1898b9609cf",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.28176",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "030cd27e-595e-4aa5-acec-a1898b9609cf"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "030cd27e-595e-4aa5-acec-a1898b9609cf",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=2b0de788-78e0-4ff9-b0d7-b78220613243` → **200**

```json
{
  "calls": [
    {
      "id": "030cd27e-595e-4aa5-acec-a1898b9609cf",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "09fe1c69-c031-458c-a537-a40fa884b9ac",
      "order_ids": [
        "2b0de788-78e0-4ff9-b0d7-b78220613243"
      ],
      "started_at": "2026-10-30T22:47:52.834792Z",
      "answered_at": "2026-10-30T22:47:53.516976Z",
      "ended_at": "2026-10-30T22:47:53.537734Z",
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

`GET /api/operator/v1/calls?order_id=2b0de788-78e0-4ff9-b0d7-b78220613243` → **200**

```json
{
  "calls": [
    {
      "id": "030cd27e-595e-4aa5-acec-a1898b9609cf",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "09fe1c69-c031-458c-a537-a40fa884b9ac",
      "order_ids": [
        "2b0de788-78e0-4ff9-b0d7-b78220613243"
      ],
      "started_at": "2026-10-30T22:47:52.834792Z",
      "answered_at": "2026-10-30T22:47:53.516976Z",
      "ended_at": "2026-10-30T22:47:53.537734Z",
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

`GET /api/operator/v1/calls?order_id=2b0de788-78e0-4ff9-b0d7-b78220613243` → **200**

```json
{
  "calls": [
    {
      "id": "030cd27e-595e-4aa5-acec-a1898b9609cf",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "09fe1c69-c031-458c-a537-a40fa884b9ac",
      "order_ids": [
        "2b0de788-78e0-4ff9-b0d7-b78220613243"
      ],
      "started_at": "2026-10-30T22:47:52.834792Z",
      "answered_at": "2026-10-30T22:47:53.516976Z",
      "ended_at": "2026-10-30T22:47:53.537734Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T22:47:58.038254Z"
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

`GET /api/operator/v1/orders/2b0de788-78e0-4ff9-b0d7-b78220613243` → **200**

```json
{
  "id": "2b0de788-78e0-4ff9-b0d7-b78220613243",
  "short_number": 33,
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
  "created_at": "2026-10-30T22:47:52.472414Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675951926"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/2b0de788-78e0-4ff9-b0d7-b78220613243/cancel` → **200**

```json
{
  "command_id": "8239f50b-5f48-49df-8cac-468bef471feb",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "2b0de788-78e0-4ff9-b0d7-b78220613243",
  "short_number": 33,
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
  "created_at": "2026-10-30T22:47:52.472414Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675951926"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "ru": "Нет свободных машин",
      "en": "No cars available",
      "uk": "Немає вільних авто",
      "pl": "Brak wolnych aut"
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
  "command_id": "02ab1ef7-aaf7-484e-9713-a1e494b713a3",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-30T22:47:59.099126Z",
  "extension": "101"
}
```

Done: outgoing call 030cd27e-595e-4aa5-acec-a1898b9609cf from order 2b0de788-78e0-4ff9-b0d7-b78220613243, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637653340",
  "device_ref": "sandbox-13907"
}
```

```json
{
  "challenge_id": "4bf48351-99c0-4f4e-acbb-b8f07fb4edbf",
  "expires_at": "2026-10-30T22:52:59.400647839Z",
  "resend_available_at": "2026-10-30T22:48:00.400647839Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637653340` → **200**

```json
{
  "phone": "+380637653340",
  "audience": "CLIENT",
  "code": "927803",
  "sent_at": "2026-10-30T22:47:59.403524729Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4bf48351-99c0-4f4e-acbb-b8f07fb4edbf",
  "code": "927803",
  "device_ref": "sandbox-13907"
}
```

```json
{
  "session_id": "d889671f-cb44-4b85-b9da-83c4c8af081a",
  "subject": {
    "type": "CLIENT",
    "id": "91874506-648b-4065-9295-9aff9c1d5c1d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MTg3NDUwNi02NDhiLTQwNjUtOTI5NS05YWZmOWMxZDVjMWQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDAxMzc5LCJpYXQiOjE3OTM0MDA0NzksImp0aSI6IjA4MzAwZGZjLTI3NDktNGE3MS1hN2EzLTgzMjE2ZmJkNTBkMCIsInNpZCI6ImQ4ODk2NzFmLWNiNDQtNGI4NS1iOWRhLTgzYzRjOGFmMDgxYSJ9.9zp8zCfRxGwOSoAD38Vlw2TKOiR_GupyuxFugmgDMHA",
  "access_expires_at": "2026-10-30T23:02:59.714839552Z",
  "refresh_token": "MuZqqq5cpAlkYHbHgAfXfJmv9Axo1XH3cmNmEJ1xG2k",
  "refresh_expires_at": "2026-11-29T22:47:59.714279273Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "91874506-648b-4065-9295-9aff9c1d5c1d",
  "session_id": "d889671f-cb44-4b85-b9da-83c4c8af081a",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637653340",
  "device_ref": "sandbox-14055"
}
```

```json
{
  "challenge_id": "66b8d774-64ab-4c28-bf40-0b3ae7e314ad",
  "expires_at": "2026-10-30T22:53:02.283446067Z",
  "resend_available_at": "2026-10-30T22:48:03.283446067Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637653340` → **200**

```json
{
  "phone": "+380637653340",
  "audience": "CLIENT",
  "code": "624099",
  "sent_at": "2026-10-30T22:48:02.286644496Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "66b8d774-64ab-4c28-bf40-0b3ae7e314ad",
  "code": "624099",
  "device_ref": "sandbox-14055"
}
```

```json
{
  "session_id": "1e1cca23-51e3-49db-89a4-cd26b1102475",
  "subject": {
    "type": "CLIENT",
    "id": "91874506-648b-4065-9295-9aff9c1d5c1d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MTg3NDUwNi02NDhiLTQwNjUtOTI5NS05YWZmOWMxZDVjMWQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDAxMzgyLCJpYXQiOjE3OTM0MDA0ODIsImp0aSI6ImEyYmRiOTE4LWQxZjUtNDUyZi05MjI0LWEwMDU1MmVhMTVlZSIsInNpZCI6IjFlMWNjYTIzLTUxZTMtNDlkYi04OWE0LWNkMjZiMTEwMjQ3NSJ9.WyGpcZl0Wd3IvwAgAoXBaFojMWuhCMSPG85kPSsh3Is",
  "access_expires_at": "2026-10-30T23:03:02.599822348Z",
  "refresh_token": "rquyUqJsoqoww1QpmFG3Ct-ZFxh2esQatgP14UkRkMo",
  "refresh_expires_at": "2026-11-29T22:48:02.599272323Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "efd507b1-65fe-46f3-9be5-f157e1e48b5d",
  "expires_at": "2026-10-30T22:53:04.89857151Z",
  "resend_available_at": "2026-10-30T22:48:05.89857151Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637653340` → **200**

```json
{
  "phone": "+380637653340",
  "audience": "CLIENT",
  "code": "085476",
  "sent_at": "2026-10-30T22:48:04.901159066Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380631499599"
}
```

```json
{
  "challenge_id": "d8dfaa4a-c0e9-4147-bcd2-6c7db0bc6595",
  "expires_at": "2026-10-30T22:53:05.208415601Z",
  "resend_available_at": "2026-10-30T22:48:06.208415601Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631499599` → **200**

```json
{
  "phone": "+380631499599",
  "audience": "CLIENT",
  "code": "883392",
  "sent_at": "2026-10-30T22:48:05.211258113Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "3a619916-b288-4cac-9f0d-377865a7b17b",
  "current_challenge_id": "efd507b1-65fe-46f3-9be5-f157e1e48b5d",
  "current_code": "000000",
  "new_challenge_id": "d8dfaa4a-c0e9-4147-bcd2-6c7db0bc6595",
  "new_code": "883392"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "471a68c6-b54e-4159-b945-6aaece953019"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "caf111b4-fa59-4234-8f49-717665726830",
  "current_challenge_id": "efd507b1-65fe-46f3-9be5-f157e1e48b5d",
  "current_code": "085476",
  "new_challenge_id": "d8dfaa4a-c0e9-4147-bcd2-6c7db0bc6595",
  "new_code": "883392"
}
```

```json
{
  "subject_id": "91874506-648b-4065-9295-9aff9c1d5c1d",
  "phone": "+380631499599",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "91874506-648b-4065-9295-9aff9c1d5c1d",
  "session_id": "d889671f-cb44-4b85-b9da-83c4c8af081a",
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
  "correlation_id": "3dab2f89-534b-47fc-a09e-c443377de4ff"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631499599",
  "device_ref": "sandbox-6992"
}
```

```json
{
  "challenge_id": "c9d3d0c1-2ade-4265-826f-f5489ab6444f",
  "expires_at": "2026-10-30T22:53:08.696448963Z",
  "resend_available_at": "2026-10-30T22:48:09.696448963Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631499599` → **200**

```json
{
  "phone": "+380631499599",
  "audience": "CLIENT",
  "code": "748221",
  "sent_at": "2026-10-30T22:48:08.69911967Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c9d3d0c1-2ade-4265-826f-f5489ab6444f",
  "code": "748221",
  "device_ref": "sandbox-6992"
}
```

```json
{
  "session_id": "d7d3f5a2-179c-4211-9289-3fddafafb33f",
  "subject": {
    "type": "CLIENT",
    "id": "91874506-648b-4065-9295-9aff9c1d5c1d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MTg3NDUwNi02NDhiLTQwNjUtOTI5NS05YWZmOWMxZDVjMWQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDAxMzg5LCJpYXQiOjE3OTM0MDA0ODksImp0aSI6IjkzMzZiNjE4LTE0NjMtNGE5MS05MjMyLWI1MDJjYmY0MDI4ZiIsInNpZCI6ImQ3ZDNmNWEyLTE3OWMtNDIxMS05Mjg5LTNmZGRhZmFmYjMzZiJ9.NOxNMiRiRk6G84kF0lTOcaguYy10eaUJmK9G4N40i8s",
  "access_expires_at": "2026-10-30T23:03:09.005521879Z",
  "refresh_token": "ZUVvOcajKqTm3smlgr0wxknSZ5Du7AMvuj0lcxd3IGk",
  "refresh_expires_at": "2026-11-29T22:48:09.004851804Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "91874506-648b-4065-9295-9aff9c1d5c1d",
  "session_id": "d7d3f5a2-179c-4211-9289-3fddafafb33f",
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
  "session_id": "fdeeef0c-0395-4aa0-bd88-694c0b6c9f92",
  "subject": {
    "type": "STAFF",
    "id": "09fe1c69-c031-458c-a537-a40fa884b9ac"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwOWZlMWM2OS1jMDMxLTQ1OGMtYTUzNy1hNDBmYTg4NGI5YWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDEzODksImlhdCI6MTc5MzQwMDQ4OSwianRpIjoiYjUzNjJjM2EtNjg0OC00NDBmLThjYmYtZTZmOThlYjY0MjVjIiwic2lkIjoiZmRlZWVmMGMtMDM5NS00YWEwLWJkODgtNjk0YzBiNmM5ZjkyIn0.OiYxtjvVvYkN6XLsHQgC_3X9wr---XEkgqxeAG4DmjE",
  "access_expires_at": "2026-10-30T23:03:09.874500812Z",
  "refresh_token": "7ratDx1De9eWUZkHY6-EJFoPxn-Ao0N7C1hZCbWe5cE",
  "refresh_expires_at": "2026-10-31T10:48:09.873903985Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/91874506-648b-4065-9295-9aff9c1d5c1d` → **200**

```json
{
  "client": {
    "id": "91874506-648b-4065-9295-9aff9c1d5c1d",
    "phone": "+380631499599",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T22:47:59.712731Z",
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

`POST /api/admin/v1/clients/91874506-648b-4065-9295-9aff9c1d5c1d/phone/new-code` → **201**

```json
{
  "phone": "+380632478520"
}
```

```json
{
  "challenge_id": "d29ae952-6a0c-4f94-961e-b3460b5644d4",
  "expires_at": "2026-10-30T22:53:10.483617987Z",
  "resend_available_at": "2026-10-30T22:48:11.483617987Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632478520` → **200**

```json
{
  "phone": "+380632478520",
  "audience": "CLIENT",
  "code": "096735",
  "sent_at": "2026-10-30T22:48:10.486768434Z",
  "channel": "SMS"
}
```

## Without the right code nothing changes; with it, support sets the phone

`POST /api/admin/v1/clients/91874506-648b-4065-9295-9aff9c1d5c1d/phone` → **422**

```json
{
  "command_id": "c7360bdf-4dd3-4bcc-93da-d1d57820e772",
  "expected_version": 3,
  "new_challenge_id": "d29ae952-6a0c-4f94-961e-b3460b5644d4",
  "new_code": "096736",
  "reason": "Passport checked at the office"
}
```

```json
{
  "instance": "/api/admin/v1/clients/91874506-648b-4065-9295-9aff9c1d5c1d/phone",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "ba5f65c6-0ce6-45ea-8210-5c155e67453e"
}
```

`POST /api/admin/v1/clients/91874506-648b-4065-9295-9aff9c1d5c1d/phone` → **400**

```json
{
  "command_id": "5f013d36-ebc5-4bd6-9f69-f74510289212",
  "expected_version": 3,
  "new_challenge_id": "d29ae952-6a0c-4f94-961e-b3460b5644d4",
  "new_code": "096735",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/91874506-648b-4065-9295-9aff9c1d5c1d/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "0b3a5a14-024f-47ca-b7aa-f6f4ecf3fee8",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/clients/91874506-648b-4065-9295-9aff9c1d5c1d/phone` → **200**

```json
{
  "command_id": "75c25a3e-6030-475a-b52b-7521ce888aad",
  "expected_version": 3,
  "new_challenge_id": "d29ae952-6a0c-4f94-961e-b3460b5644d4",
  "new_code": "096735",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "91874506-648b-4065-9295-9aff9c1d5c1d",
  "phone": "+380632478520",
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
  "correlation_id": "eef5d344-1805-4a04-9d43-3a7abef71e70"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632478520",
  "device_ref": "sandbox-7864"
}
```

```json
{
  "challenge_id": "26648efe-98c9-4c7f-be54-c0f3268972c5",
  "expires_at": "2026-10-30T22:53:12.000509248Z",
  "resend_available_at": "2026-10-30T22:48:13.000509248Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632478520` → **200**

```json
{
  "phone": "+380632478520",
  "audience": "CLIENT",
  "code": "217770",
  "sent_at": "2026-10-30T22:48:12.00344858Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "26648efe-98c9-4c7f-be54-c0f3268972c5",
  "code": "217770",
  "device_ref": "sandbox-7864"
}
```

```json
{
  "session_id": "06938584-4c6e-4094-8ca2-19a71121fd7c",
  "subject": {
    "type": "CLIENT",
    "id": "91874506-648b-4065-9295-9aff9c1d5c1d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MTg3NDUwNi02NDhiLTQwNjUtOTI5NS05YWZmOWMxZDVjMWQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDAxMzkyLCJpYXQiOjE3OTM0MDA0OTIsImp0aSI6IjM3NjVjNmRhLTNhOGEtNGNjOS1iZTFkLTkxOGY2YzQ5MmE1MSIsInNpZCI6IjA2OTM4NTg0LTRjNmUtNDA5NC04Y2EyLTE5YTcxMTIxZmQ3YyJ9.hMh8jDuuK_nZDWLqTyI-QbBVN-kjIErwC3FxIOvjpKs",
  "access_expires_at": "2026-10-30T23:03:12.332840798Z",
  "refresh_token": "PL1VdFqWcXvjPzB1n6M415ogmf1IPVtrSpg52oM-gjs",
  "refresh_expires_at": "2026-11-29T22:48:12.332287613Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "91874506-648b-4065-9295-9aff9c1d5c1d",
  "session_id": "06938584-4c6e-4094-8ca2-19a71121fd7c",
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
  "phone": "+380638085602",
  "device_ref": "sandbox-20179"
}
```

```json
{
  "challenge_id": "7afad0dc-2f07-4bfd-9d81-58eaeda67836",
  "expires_at": "2026-10-30T22:53:12.91862876Z",
  "resend_available_at": "2026-10-30T22:48:13.91862876Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638085602` → **200**

```json
{
  "phone": "+380638085602",
  "audience": "CLIENT",
  "code": "204965",
  "sent_at": "2026-10-30T22:48:12.92126858Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7afad0dc-2f07-4bfd-9d81-58eaeda67836",
  "code": "204965",
  "device_ref": "sandbox-20179"
}
```

```json
{
  "session_id": "978ac0ef-2071-48d4-b328-51ed2e233092",
  "subject": {
    "type": "CLIENT",
    "id": "dcc19e4d-ddb7-4dce-9042-4a6fd42e4251"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkY2MxOWU0ZC1kZGI3LTRkY2UtOTA0Mi00YTZmZDQyZTQyNTEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDAxMzkzLCJpYXQiOjE3OTM0MDA0OTMsImp0aSI6IjdmMGY3ODA5LThlNTYtNGM5YS05OWM4LTA4ZmI0NDdjNjI4MiIsInNpZCI6Ijk3OGFjMGVmLTIwNzEtNDhkNC1iMzI4LTUxZWQyZTIzMzA5MiJ9.wq4udX_qjAWiband5tla2bF7HgoRukpd1k3NxIcLTxg",
  "access_expires_at": "2026-10-30T23:03:13.236951019Z",
  "refresh_token": "a2WJAQmYH3-pTptJEVv-L8mxTUdHXcSjs1itruswYW4",
  "refresh_expires_at": "2026-11-29T22:48:13.236403296Z",
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
  "session_id": "bcfbbb73-e992-4fbb-b8fb-aaa1251d3e9d",
  "subject": {
    "type": "STAFF",
    "id": "09fe1c69-c031-458c-a537-a40fa884b9ac"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwOWZlMWM2OS1jMDMxLTQ1OGMtYTUzNy1hNDBmYTg4NGI5YWMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDEzOTQsImlhdCI6MTc5MzQwMDQ5NCwianRpIjoiODAzNTE0NjItYjEyOS00NDVkLWI2YjAtYTYzOTI1MTdjOWY1Iiwic2lkIjoiYmNmYmJiNzMtZTk5Mi00ZmJiLWI4ZmItYWFhMTI1MWQzZTlkIn0.DRwSCcrCXJIWxA0ncatkkE2y_D1pQAn14PK3T3oxlvQ",
  "access_expires_at": "2026-10-30T23:03:14.423485277Z",
  "refresh_token": "rPgO6SYiMOvBQRvVaX1NRknwrPXTm3UwNwhZekQoHyY",
  "refresh_expires_at": "2026-10-31T10:48:14.422910654Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380638085602` → **200**

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
  "correlation_id": "5367dc18-b702-4852-9122-2091d8b15a21"
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
  "session_id": "37c41a4a-05ba-4264-9cb1-457ea937f11d",
  "subject": {
    "type": "STAFF",
    "id": "09fe1c69-c031-458c-a537-a40fa884b9ac"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwOWZlMWM2OS1jMDMxLTQ1OGMtYTUzNy1hNDBmYTg4NGI5YWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDEzOTUsImlhdCI6MTc5MzQwMDQ5NSwianRpIjoiMThiNTUwMmYtZDM0OC00YWQ2LWE2YTMtNzU1ZDVmOWFiYjkzIiwic2lkIjoiMzdjNDFhNGEtMDViYS00MjY0LTljYjEtNDU3ZWE5MzdmMTFkIn0.zvf21MKmdbDkE5t9P4yMqBC1nxyz9JdB4VmYguoyth4",
  "access_expires_at": "2026-10-30T23:03:15.610668084Z",
  "refresh_token": "DIWr21yktew9sPx_kB09j-Gjqc68t3Qi6mvBGGS-AyA",
  "refresh_expires_at": "2026-10-31T10:48:15.610102876Z",
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
  "changed_by": "09fe1c69-c031-458c-a537-a40fa884b9ac",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T22:30:23.94422Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "2bf8ce65-6181-4dcb-b8db-27769992ddd6",
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
  "changed_by": "09fe1c69-c031-458c-a537-a40fa884b9ac",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-30T22:48:16.221156219Z"
}
```

## The rider books the airport for 2026-10-31T01:48:15Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600285157",
  "device_ref": "sandbox-31267"
}
```

```json
{
  "challenge_id": "cd9f6813-b38d-4839-97ef-0aba8c4b7a56",
  "expires_at": "2026-10-30T22:53:16.529359634Z",
  "resend_available_at": "2026-10-30T22:48:17.529359634Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600285157` → **200**

```json
{
  "phone": "+48600285157",
  "audience": "CLIENT",
  "code": "619651",
  "sent_at": "2026-10-30T22:48:16.532177569Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cd9f6813-b38d-4839-97ef-0aba8c4b7a56",
  "code": "619651",
  "device_ref": "sandbox-31267"
}
```

```json
{
  "session_id": "91cb2707-9b77-4073-872d-a1ef549a2609",
  "subject": {
    "type": "CLIENT",
    "id": "e0e26602-76fb-48f0-9cef-ca57edcca829"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMGUyNjYwMi03NmZiLTQ4ZjAtOWNlZi1jYTU3ZWRjY2E4MjkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDAxMzk2LCJpYXQiOjE3OTM0MDA0OTYsImp0aSI6IjcxMGI5MWRhLTliMjYtNDFkMi1iZTFmLTc3MmUyYWRmYjdkNyIsInNpZCI6IjkxY2IyNzA3LTliNzctNDA3My04NzJkLWExZWY1NDlhMjYwOSJ9.X-jHBufhHsy1XnUpOCmj2GWhscAkyoo1eEfuzOSXF94",
  "access_expires_at": "2026-10-30T23:03:16.849566951Z",
  "refresh_token": "uuxYCK_W0FdxPlqEQe8eak8dqNM3lW5HYikjqibtsvM",
  "refresh_expires_at": "2026-11-29T22:48:16.848871184Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b771a0b2-70e7-47a1-a5ea-56ed64a5f076",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-31T01:48:15Z"
}
```

```json
{
  "id": "0a915550-c0ef-47be-bffe-a901c7d08479",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T22:53:17.153479Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-31T01:48:15Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "4ea0e12e-5b5d-4832-9afa-69ddc6b712a0",
  "quote_id": "0a915550-c0ef-47be-bffe-a901c7d08479",
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
  "pickup_at": "2026-10-31T01:48:15Z"
}
```

```json
{
  "id": "be37ec73-b3fd-4d9e-9aca-382a3826335b",
  "short_number": 34,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "e0e26602-76fb-48f0-9cef-ca57edcca829",
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
  "created_at": "2026-10-30T22:48:17.455017Z",
  "cancellation": null,
  "pickup_at": "2026-10-31T01:48:15Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

## A driver in Warsaw sees it and reserves it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000001",
  "device_ref": "sandbox-20688"
}
```

```json
{
  "challenge_id": "20db0a7c-ce71-4f20-9073-68a28ec2a832",
  "expires_at": "2026-10-30T22:53:17.762685914Z",
  "resend_available_at": "2026-10-30T22:48:18.762685914Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "675007",
  "sent_at": "2026-10-30T22:48:17.765301498Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "20db0a7c-ce71-4f20-9073-68a28ec2a832",
  "code": "675007",
  "device_ref": "sandbox-20688"
}
```

```json
{
  "session_id": "370b97fc-aefd-4b28-b7a1-324dca3976c9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwMTM5OCwiaWF0IjoxNzkzNDAwNDk4LCJqdGkiOiJiMGE0ZjU5OS0zMGZlLTQ0YTktOTM3Zi1mYTZiOTg5ZmRiMWIiLCJzaWQiOiIzNzBiOTdmYy1hZWZkLTRiMjgtYjdhMS0zMjRkY2EzOTc2YzkifQ.b8XKlt2jvCcRbV6D5g-C76rZdME4y70Bjo301sJIVdM",
  "access_expires_at": "2026-10-30T23:03:18.077272045Z",
  "refresh_token": "xy9oR1S6udkiBeA9f-JdBzz0wFrDCDbpXt0wke8P0Tg",
  "refresh_expires_at": "2026-11-29T22:48:18.076606512Z",
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
  "command_id": "94c484f9-740e-4b8f-b70f-c7b051cf0ec5",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:48:18Z",
    "sequence": 1793400498664
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "2c834c81-e7c1-49ee-a53a-868e3b8398b4",
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
  "last_heartbeat_at": "2026-10-30T22:48:18.682141Z",
  "last_location_at": "2026-10-30T22:48:18.682141Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "be37ec73-b3fd-4d9e-9aca-382a3826335b",
      "short_number": 34,
      "pickup_at": "2026-10-31T01:48:15Z",
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

`POST /api/driver/v1/preorders/be37ec73-b3fd-4d9e-9aca-382a3826335b/reserve` → **200**

```json
{
  "command_id": "b0135a4f-1761-4ce4-9caf-b48eff0da03a"
}
```

```json
{
  "id": "e527da80-7caf-443b-b664-8cb9005f0f0b",
  "state": "RESERVED",
  "order": {
    "order_id": "be37ec73-b3fd-4d9e-9aca-382a3826335b",
    "short_number": 34,
    "pickup_at": "2026-10-31T01:48:15Z",
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
  "reserved_at": "2026-10-30T22:48:19.276251Z",
  "confirm_from": "2026-10-31T01:18:15Z",
  "confirm_until": "2026-10-31T01:28:15Z",
  "drop_until": "2026-10-31T00:48:15Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "e527da80-7caf-443b-b664-8cb9005f0f0b",
      "state": "RESERVED",
      "order": {
        "order_id": "be37ec73-b3fd-4d9e-9aca-382a3826335b",
        "short_number": 34,
        "pickup_at": "2026-10-31T01:48:15Z",
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
      "reserved_at": "2026-10-30T22:48:19.276251Z",
      "confirm_from": "2026-10-31T01:18:15Z",
      "confirm_until": "2026-10-31T01:28:15Z",
      "drop_until": "2026-10-31T00:48:15Z"
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
      "id": "e527da80-7caf-443b-b664-8cb9005f0f0b",
      "state": "RESERVED",
      "order": {
        "order_id": "be37ec73-b3fd-4d9e-9aca-382a3826335b",
        "short_number": 34,
        "pickup_at": "2026-10-31T01:48:15Z",
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
      "reserved_at": "2026-10-30T22:48:19.276251Z",
      "confirm_from": "2026-10-31T01:18:15Z",
      "confirm_until": "2026-10-31T01:28:15Z",
      "drop_until": "2026-10-31T00:48:15Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/e527da80-7caf-443b-b664-8cb9005f0f0b/confirm` → **409**

```json
{
  "command_id": "6c220618-f157-4c57-aefe-ae9a20b27ba3"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/e527da80-7caf-443b-b664-8cb9005f0f0b/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "08bf53f3-cd49-48c9-b8ff-9a6805f2589d"
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
  "session_id": "2fc242a7-d5af-4537-a75c-ad1581bae4af",
  "subject": {
    "type": "STAFF",
    "id": "09fe1c69-c031-458c-a537-a40fa884b9ac"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwOWZlMWM2OS1jMDMxLTQ1OGMtYTUzNy1hNDBmYTg4NGI5YWMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDE0MDAsImlhdCI6MTc5MzQwMDUwMCwianRpIjoiYmY3ZjIzZWItNDMwZC00YzNlLTk5NTktMTNjYmZmNTUyZGYzIiwic2lkIjoiMmZjMjQyYTctZDVhZi00NTM3LWE3NWMtYWQxNTgxYmFlNGFmIn0.sNSA2QO91J8dDdDrhaV8spfMhpD85mXHsJ-qOC2XmnI",
  "access_expires_at": "2026-10-30T23:03:20.728254415Z",
  "refresh_token": "61hFSzdikfPODhn8z99ZnbhD7AdoDEAyVdEWHhfO0JY",
  "refresh_expires_at": "2026-10-31T10:48:20.727695379Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/be37ec73-b3fd-4d9e-9aca-382a3826335b` → **200**

```json
{
  "id": "be37ec73-b3fd-4d9e-9aca-382a3826335b",
  "short_number": 34,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "e0e26602-76fb-48f0-9cef-ca57edcca829",
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
  "created_at": "2026-10-30T22:48:17.455017Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-31T01:48:15Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "e527da80-7caf-443b-b664-8cb9005f0f0b",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-30T22:48:19.276251Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/be37ec73-b3fd-4d9e-9aca-382a3826335b/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-30T22:48:17.455957Z",
      "actor": {
        "type": "CLIENT",
        "id": "e0e26602-76fb-48f0-9cef-ca57edcca829",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "be37ec73-b3fd-4d9e-9aca-382a3826335b",
        "preorder": true,
        "quote_id": "0a915550-c0ef-47be-bffe-a901c7d08479",
        "pickup_at": "2026-10-31T01:48:15Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "143632ae-6092-4a08-9a4e-cfe65ca7abd3"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-30T22:48:19.27743Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "be37ec73-b3fd-4d9e-9aca-382a3826335b",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "e527da80-7caf-443b-b664-8cb9005f0f0b"
      },
      "correlation_id": "a553a5ca-6c69-4b55-80be-3b284caeda82"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order be37ec73-b3fd-4d9e-9aca-382a3826335b, reservation e527da80-7caf-443b-b664-8cb9005f0f0b.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-17067"
}
```

```json
{
  "challenge_id": "cf3836a0-4660-4344-9c95-8a5cda16f6a8",
  "expires_at": "2026-10-30T22:53:21.647297069Z",
  "resend_available_at": "2026-10-30T22:48:22.647297069Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "172180",
  "sent_at": "2026-10-30T22:48:21.650262959Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cf3836a0-4660-4344-9c95-8a5cda16f6a8",
  "code": "172180",
  "device_ref": "sandbox-17067"
}
```

```json
{
  "session_id": "457bf1b4-e18b-45f3-88a8-43852935671a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwMTQwMSwiaWF0IjoxNzkzNDAwNTAxLCJqdGkiOiI1MjRkYjFmOS02YzY0LTRhODMtYTQ1Yy0wYjU1Yjk4ODBjODgiLCJzaWQiOiI0NTdiZjFiNC1lMThiLTQ1ZjMtODhhOC00Mzg1MjkzNTY3MWEifQ.ThYyudv1wN3cJpKGpnKg_QP0hohGJJgpU74c1LpC8xg",
  "access_expires_at": "2026-10-30T23:03:21.963620278Z",
  "refresh_token": "iJu_hrCt3rHlokcehAQrmy19Gy5SRXmXcMgyWX9H_C4",
  "refresh_expires_at": "2026-11-29T22:48:21.963075766Z",
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
  "command_id": "63d58526-3118-4f6c-a4c1-e4d6f165957a",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:48:22Z",
    "sequence": 1793400502549
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d619d055-251a-4efb-b4db-cd6003eec5bb",
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
  "last_heartbeat_at": "2026-10-30T22:48:22.569458Z",
  "last_location_at": "2026-10-30T22:48:22.569458Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676930271",
  "device_ref": "sandbox-28313"
}
```

```json
{
  "challenge_id": "a0dbb128-d175-4dbd-8f04-aa836bc1fa5b",
  "expires_at": "2026-10-30T22:53:22.8565407Z",
  "resend_available_at": "2026-10-30T22:48:23.8565407Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380676930271` → **200**

```json
{
  "phone": "+380676930271",
  "audience": "CLIENT",
  "code": "996733",
  "sent_at": "2026-10-30T22:48:22.859123433Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a0dbb128-d175-4dbd-8f04-aa836bc1fa5b",
  "code": "996733",
  "device_ref": "sandbox-28313"
}
```

```json
{
  "session_id": "502847e2-e426-46b9-af3b-247bad10587d",
  "subject": {
    "type": "CLIENT",
    "id": "3645f921-ffcf-476e-a190-52f62c62d0f2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzNjQ1ZjkyMS1mZmNmLTQ3NmUtYTE5MC01MmY2MmM2MmQwZjIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDAxNDAzLCJpYXQiOjE3OTM0MDA1MDMsImp0aSI6ImQxMTNkYjFhLWMzNWYtNGI4MC1iMjNmLTM1OTQxNzhiOTgwMyIsInNpZCI6IjUwMjg0N2UyLWU0MjYtNDZiOS1hZjNiLTI0N2JhZDEwNTg3ZCJ9.-UkQxK06MU-W5ehjlmy9i7fkYGGp1DXwnjWhIxXvMdY",
  "access_expires_at": "2026-10-30T23:03:23.16776786Z",
  "refresh_token": "u4Gb7a9inClOqsMrCPuqy3WAdJVz0ckDGjU_WU3YaTo",
  "refresh_expires_at": "2026-11-29T22:48:23.16724402Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "44f09c34-9f26-477c-8ff6-7431b17e4430",
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
  "id": "4973c4e2-af32-49ec-9950-bcd00321e5b4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T22:53:23.463841Z",
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
  "command_id": "6f11274b-1238-4e61-9ed4-1d727954b38b",
  "quote_id": "4973c4e2-af32-49ec-9950-bcd00321e5b4",
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
  "id": "aec4c6d8-3b25-4b0c-bc59-e67622c74b1e",
  "short_number": 35,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3645f921-ffcf-476e-a190-52f62c62d0f2",
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
  "created_at": "2026-10-30T22:48:23.775385Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

## Driver accepts and completes the ride

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "1b9e5987-f14b-4bd3-a024-6255f69f1713",
    "order_id": "aec4c6d8-3b25-4b0c-bc59-e67622c74b1e",
    "expires_at": "2026-10-30T22:48:38.778355Z",
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

`POST /api/driver/v1/offers/1b9e5987-f14b-4bd3-a024-6255f69f1713/accept` → **200**

```json
{
  "command_id": "9e3d951b-e6cf-4c10-aa79-da6115defb95"
}
```

```json
{
  "id": "1e0ef6b8-6a95-49c3-8364-4fa6d09b2ec7",
  "order_id": "aec4c6d8-3b25-4b0c-bc59-e67622c74b1e",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "65924149-6913-4e1e-9d46-8bd67ca1dfa3",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "65924149-6913-4e1e-9d46-8bd67ca1dfa3",
  "order_id": "aec4c6d8-3b25-4b0c-bc59-e67622c74b1e",
  "assignment_id": "1e0ef6b8-6a95-49c3-8364-4fa6d09b2ec7",
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

`POST /api/driver/v1/work-sessions/d619d055-251a-4efb-b4db-cd6003eec5bb/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:48:24Z",
    "sequence": 1793400504980
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d619d055-251a-4efb-b4db-cd6003eec5bb",
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
  "last_heartbeat_at": "2026-10-30T22:48:24.999089Z",
  "last_location_at": "2026-10-30T22:48:24.999089Z",
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
  "id": "65924149-6913-4e1e-9d46-8bd67ca1dfa3",
  "order_id": "aec4c6d8-3b25-4b0c-bc59-e67622c74b1e",
  "assignment_id": "1e0ef6b8-6a95-49c3-8364-4fa6d09b2ec7",
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

`POST /api/driver/v1/trips/65924149-6913-4e1e-9d46-8bd67ca1dfa3/arrive` → **200**

```json
{
  "command_id": "7d66abd3-7a80-402e-b2a9-d4b4f13dab77",
  "expected_version": 0
}
```

```json
{
  "id": "65924149-6913-4e1e-9d46-8bd67ca1dfa3",
  "order_id": "aec4c6d8-3b25-4b0c-bc59-e67622c74b1e",
  "assignment_id": "1e0ef6b8-6a95-49c3-8364-4fa6d09b2ec7",
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
  "arrived_at": "2026-10-30T22:48:25.567319Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/65924149-6913-4e1e-9d46-8bd67ca1dfa3/start` → **200**

```json
{
  "command_id": "8a2b29c7-3e45-4877-aef0-5b0207db5efc",
  "expected_version": 1
}
```

```json
{
  "id": "65924149-6913-4e1e-9d46-8bd67ca1dfa3",
  "order_id": "aec4c6d8-3b25-4b0c-bc59-e67622c74b1e",
  "assignment_id": "1e0ef6b8-6a95-49c3-8364-4fa6d09b2ec7",
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
  "arrived_at": "2026-10-30T22:48:25.567319Z",
  "started_at": "2026-10-30T22:48:25.882021Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

(the car drives 47 s to the next point)

`POST /api/driver/v1/work-sessions/d619d055-251a-4efb-b4db-cd6003eec5bb/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:49:13Z",
    "sequence": 1793400553204
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d619d055-251a-4efb-b4db-cd6003eec5bb",
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
  "last_heartbeat_at": "2026-10-30T22:49:13.222856Z",
  "last_location_at": "2026-10-30T22:49:13.222856Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/65924149-6913-4e1e-9d46-8bd67ca1dfa3/complete` → **200**

```json
{
  "command_id": "11d00cc5-c9f4-4f79-8a08-13e0018c310d",
  "expected_version": 2,
  "reported_at": "2026-10-30T22:49:13Z",
  "cash_received": true
}
```

```json
{
  "id": "65924149-6913-4e1e-9d46-8bd67ca1dfa3",
  "order_id": "aec4c6d8-3b25-4b0c-bc59-e67622c74b1e",
  "assignment_id": "1e0ef6b8-6a95-49c3-8364-4fa6d09b2ec7",
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
  "arrived_at": "2026-10-30T22:48:25.567319Z",
  "started_at": "2026-10-30T22:48:25.882021Z",
  "completed_at": "2026-10-30T22:49:13.517814Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/aec4c6d8-3b25-4b0c-bc59-e67622c74b1e/rating` → **200**

```json
{
  "command_id": "fa7b1843-e316-411d-a1fd-83b31ca0718f",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "aec4c6d8-3b25-4b0c-bc59-e67622c74b1e",
  "score": 5,
  "created_at": "2026-10-30T22:49:13.836109633Z"
}
```

`POST /api/driver/v1/orders/aec4c6d8-3b25-4b0c-bc59-e67622c74b1e/rating` → **200**

```json
{
  "command_id": "3cf14545-ff2d-4378-b3f1-dd1cc7b95b8f",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "aec4c6d8-3b25-4b0c-bc59-e67622c74b1e",
  "score": 4,
  "created_at": "2026-10-30T22:49:14.139585226Z"
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
  "session_id": "c413918b-fa2a-450f-844f-179397e1b9bb",
  "subject": {
    "type": "STAFF",
    "id": "09fe1c69-c031-458c-a537-a40fa884b9ac"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwOWZlMWM2OS1jMDMxLTQ1OGMtYTUzNy1hNDBmYTg4NGI5YWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDE0NTUsImlhdCI6MTc5MzQwMDU1NSwianRpIjoiMGI3MzJiMjktZjQ5MC00ZmUwLWEyZmUtNTJlNGMwNGM3OTUxIiwic2lkIjoiYzQxMzkxOGItZmEyYS00NTBmLTg0NGYtMTc5Mzk3ZTFiOWJiIn0.BwytBVLfAzDpPZsvYaNST24iLYaOOfff5abC7B3X-yw",
  "access_expires_at": "2026-10-30T23:04:15.01979611Z",
  "refresh_token": "k97IB1Fra_SZR0p-6HcZuqek9ZzB64YDLeC-eP6AW88",
  "refresh_expires_at": "2026-10-31T10:49:15.019230161Z",
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
  "session_id": "bdec1bd3-4280-466e-ac27-6db4e9920612",
  "subject": {
    "type": "STAFF",
    "id": "09fe1c69-c031-458c-a537-a40fa884b9ac"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwOWZlMWM2OS1jMDMxLTQ1OGMtYTUzNy1hNDBmYTg4NGI5YWMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDE0NTUsImlhdCI6MTc5MzQwMDU1NSwianRpIjoiNjAyYWY0MTktMzE0OS00NjExLWJhZDEtNWY2MDFhYzk5MmFhIiwic2lkIjoiYmRlYzFiZDMtNDI4MC00NjZlLWFjMjctNmRiNGU5OTIwNjEyIn0.DVQ9VFLeJGfaEWQnYNDUoaYjeRzdYeMr2hsf4WjmfKU",
  "access_expires_at": "2026-10-30T23:04:15.608451664Z",
  "refresh_token": "4Xq7WdpCJwAYaBQ8ywRb0_vnuZfZoRlIaVZIKyhL5Fw",
  "refresh_expires_at": "2026-10-31T10:49:15.60786715Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/aec4c6d8-3b25-4b0c-bc59-e67622c74b1e/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "aec4c6d8-3b25-4b0c-bc59-e67622c74b1e",
      "author_type": "RIDER",
      "author_id": "3645f921-ffcf-476e-a190-52f62c62d0f2",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-30T22:49:13.83611Z"
    },
    {
      "order_id": "aec4c6d8-3b25-4b0c-bc59-e67622c74b1e",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "3645f921-ffcf-476e-a190-52f62c62d0f2",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-30T22:49:14.139585Z"
    }
  ]
}
```

Done: ratings for order aec4c6d8-3b25-4b0c-bc59-e67622c74b1e.

# Scenario: reassignment-push

## Andrii (200 m) and Oleh (600 m) are online; a rider with the app orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-2728"
}
```

```json
{
  "challenge_id": "ca90eb60-ca7b-4f60-a2a9-3c48af2d589b",
  "expires_at": "2026-10-30T22:54:16.202246933Z",
  "resend_available_at": "2026-10-30T22:49:17.202246933Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "070373",
  "sent_at": "2026-10-30T22:49:16.205898318Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ca90eb60-ca7b-4f60-a2a9-3c48af2d589b",
  "code": "070373",
  "device_ref": "sandbox-2728"
}
```

```json
{
  "session_id": "b9ee9d45-a724-4e9a-91b0-5ffcfffe3ed1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwMTQ1NiwiaWF0IjoxNzkzNDAwNTU2LCJqdGkiOiJhNDVlMjFlNS1lMmU3LTQ1YjItODU3NC0wM2I4MGI2ZTM3MzQiLCJzaWQiOiJiOWVlOWQ0NS1hNzI0LTRlOWEtOTFiMC01ZmZjZmZmZTNlZDEifQ.9vreqOGeQxmVnlLk0R2rno_E18UJe62oSUiXQkI0VK4",
  "access_expires_at": "2026-10-30T23:04:16.525341736Z",
  "refresh_token": "zj1wXo-h6V1pvmFiMpNUaDE3tltQhBEQMuxZ91sEQKo",
  "refresh_expires_at": "2026-11-29T22:49:16.5246971Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d619d055-251a-4efb-b4db-cd6003eec5bb",
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
  "last_heartbeat_at": "2026-10-30T22:49:13.222856Z",
  "last_location_at": "2026-10-30T22:49:13.222856Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d619d055-251a-4efb-b4db-cd6003eec5bb/close` → **409**

```json
{
  "command_id": "6c078522-2b3a-4bd5-be74-d030746d4ab7",
  "expected_version": 0
}
```

```json
{
  "instance": "/api/driver/v1/work-sessions/d619d055-251a-4efb-b4db-cd6003eec5bb/close",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "ff8f6df1-e2e4-475f-889b-45cc5cd9ab18"
}
```

**Expected 200, got 409 — scenario stopped.**

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
  "session_id": "83c44c6e-8882-422a-97e1-4596b26e910f",
  "subject": {
    "type": "STAFF",
    "id": "09fe1c69-c031-458c-a537-a40fa884b9ac"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwOWZlMWM2OS1jMDMxLTQ1OGMtYTUzNy1hNDBmYTg4NGI5YWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDE0NTcsImlhdCI6MTc5MzQwMDU1NywianRpIjoiZWUwYWIyZWItMWNjMC00NzdiLWJkN2UtYTMxODRlODM5NzM5Iiwic2lkIjoiODNjNDRjNmUtODg4Mi00MjJhLTk3ZTEtNDU5NmIyNmU5MTBmIn0.biGJkQNVUDeodnq-NjcTLrz2p2zl0q2SmlM-C4qP_Ws",
  "access_expires_at": "2026-10-30T23:04:17.72516761Z",
  "refresh_token": "L8V0BpdNbG5ThQswgwvQZhbhsL8qo0PhvgaViKScrUI",
  "refresh_expires_at": "2026-10-31T10:49:17.724598254Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "7114410c-ba63-4af4-949c-b947e883d2be",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "58bca600-d0a7-434f-94d6-68382c0399a4",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T22:49:18.031032Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/58bca600-d0a7-434f-94d6-68382c0399a4` → **200**

```json
{
  "id": "58bca600-d0a7-434f-94d6-68382c0399a4",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-30.csv",
  "rows": 1,
  "error": null,
  "created_at": "2026-10-30T22:49:18.031032Z",
  "ready_at": "2026-10-30T22:49:18.23659Z",
  "expires_at": "2026-10-31T22:49:18.23659Z"
}
```

`GET /api/admin/v1/reports/exports/58bca600-d0a7-434f-94d6-68382c0399a4/file` → **200**, 2 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
total,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "931eee9a-0b45-4a72-9937-e19fae87e5cf",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "28e3c811-efc3-4d51-8a38-87c68c7ca850",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T22:49:18.668616Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/28e3c811-efc3-4d51-8a38-87c68c7ca850` → **200**

```json
{
  "id": "28e3c811-efc3-4d51-8a38-87c68c7ca850",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T22:49:18.668616Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/28e3c811-efc3-4d51-8a38-87c68c7ca850` → **200**

```json
{
  "id": "28e3c811-efc3-4d51-8a38-87c68c7ca850",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T22:49:18.668616Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/28e3c811-efc3-4d51-8a38-87c68c7ca850` → **200**

```json
{
  "id": "28e3c811-efc3-4d51-8a38-87c68c7ca850",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T22:49:18.668616Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/28e3c811-efc3-4d51-8a38-87c68c7ca850` → **200**

```json
{
  "id": "28e3c811-efc3-4d51-8a38-87c68c7ca850",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T22:49:18.668616Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/28e3c811-efc3-4d51-8a38-87c68c7ca850` → **200**

```json
{
  "id": "28e3c811-efc3-4d51-8a38-87c68c7ca850",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-30.csv",
  "rows": 1,
  "error": null,
  "created_at": "2026-10-30T22:49:18.668616Z",
  "ready_at": "2026-10-30T22:49:23.244725Z",
  "expires_at": "2026-10-31T22:49:23.244725Z"
}
```

`GET /api/admin/v1/reports/exports/28e3c811-efc3-4d51-8a38-87c68c7ca850/file` → **200**, 2 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
total,UAH,0,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/30b45916-db99-4d80-9a3d-50cb4554c00e` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/30b45916-db99-4d80-9a3d-50cb4554c00e",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "1c4f6a2d-108d-459c-a1e2-1e342565049d"
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
  "session_id": "ec940be1-9546-47d2-9df8-4decbcf73bfe",
  "subject": {
    "type": "STAFF",
    "id": "09fe1c69-c031-458c-a537-a40fa884b9ac"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwOWZlMWM2OS1jMDMxLTQ1OGMtYTUzNy1hNDBmYTg4NGI5YWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDE0NjUsImlhdCI6MTc5MzQwMDU2NSwianRpIjoiYTM0NmQwNDYtM2NjOS00Mzg2LWIzNWMtODc4MzllMDk5MWQ1Iiwic2lkIjoiZWM5NDBiZTEtOTU0Ni00N2QyLTlkZjgtNGRlY2JjZjczYmZlIn0.fwflyEKPDnfccow9waDiAinF3bTbWke4ga7ISwZfilY",
  "access_expires_at": "2026-10-30T23:04:25.047433335Z",
  "refresh_token": "WpY3F620NqPQmnlYP_jsA3sZ1gNNbpPWRPqEL9LXUac",
  "refresh_expires_at": "2026-10-31T10:49:25.046824673Z",
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
  "command_id": "34b16f52-f730-4289-895e-5ac2300888a6",
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
  "changed_by": "09fe1c69-c031-458c-a537-a40fa884b9ac",
  "reason": "Sandbox retention boundary",
  "changed_at": "2026-10-30T22:49:25.657515271Z"
}
```

`POST /sandbox/v1/retention/fixtures/61366867-4842-4618-8551-adac80223e9f` → **200**

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

`GET /sandbox/v1/retention/fixtures/61366867-4842-4618-8551-adac80223e9f` → **200**

```json
{
  "old_done": 0,
  "recent_done": 1,
  "failed": 1
}
```

Old DONE event removed; recent DONE and old FAILED events retained. Policy and synthetic fixtures restored on exit.

`DELETE /sandbox/v1/retention/fixtures/61366867-4842-4618-8551-adac80223e9f` → **204**

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
  "changed_by": "09fe1c69-c031-458c-a537-a40fa884b9ac",
  "reason": "Sandbox retention boundary",
  "changed_at": "2026-10-30T22:49:25.657515Z"
}
```

`PUT /api/admin/v1/retention` → **200**

```json
{
  "command_id": "d909386c-4d35-44d1-ad3c-a9ca2e41610f",
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
  "changed_by": "09fe1c69-c031-458c-a537-a40fa884b9ac",
  "reason": "Restore policy after retention sandbox",
  "changed_at": "2026-10-30T22:49:26.375209397Z"
}
```

# Scenario: risk-flag

## The driver starts a new shift in Kyiv

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-18729"
}
```

```json
{
  "challenge_id": "bb44529e-e6c2-4c2b-9bba-96aae9a0014c",
  "expires_at": "2026-10-30T22:54:26.675617277Z",
  "resend_available_at": "2026-10-30T22:49:27.675617277Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "337073",
  "sent_at": "2026-10-30T22:49:26.679162065Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bb44529e-e6c2-4c2b-9bba-96aae9a0014c",
  "code": "337073",
  "device_ref": "sandbox-18729"
}
```

```json
{
  "session_id": "4a02a860-1601-492a-a1b0-438c1f310634",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwMTQ2NywiaWF0IjoxNzkzNDAwNTY3LCJqdGkiOiI0ODliNDA2MS1jMWIxLTQ5MDItODM2NS0xNDA3ZmQyNTc4MzYiLCJzaWQiOiI0YTAyYTg2MC0xNjAxLTQ5MmEtYTFiMC00MzhjMWYzMTA2MzQifQ.9u-CvijdPpyO6ZMI1VuNGfsoNsDqvKLMggxHtvSOFYU",
  "access_expires_at": "2026-10-30T23:04:27.000087177Z",
  "refresh_token": "p1A8KVX7KeBhewWKRhtJzD6hAEkYiGGl5t7NVlDJ6YI",
  "refresh_expires_at": "2026-11-29T22:49:26.999542227Z",
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
  "command_id": "09f94c66-9da9-48ce-8657-6524913f268d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:49:27Z",
    "sequence": 1793400567896
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "fb6abb97-459d-44b7-9820-970d3962b4ca",
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
  "last_heartbeat_at": "2026-10-30T22:49:27.915068Z",
  "last_location_at": "2026-10-30T22:49:27.915068Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "06f615bc-fb36-48b2-a757-d677247f3029",
  "points": [
    {
      "sequence": 1793400570205,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-30T22:48:30Z"
    },
    {
      "sequence": 1793400570213,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-30T22:49:30Z"
    }
  ]
}
```

```json
{
  "accepted": 2,
  "duplicates": 0,
  "flagged": 1
}
```

## Support finds one open flag — the driver is still approved

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
  "session_id": "7332a812-3430-4297-9350-c668e1e739ba",
  "subject": {
    "type": "STAFF",
    "id": "09fe1c69-c031-458c-a537-a40fa884b9ac"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwOWZlMWM2OS1jMDMxLTQ1OGMtYTUzNy1hNDBmYTg4NGI5YWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDE0NzAsImlhdCI6MTc5MzQwMDU3MCwianRpIjoiNzc0MmNlNDgtNzA1Ny00MmNiLWE0YjAtOGE4ODdlMDgyMTQ1Iiwic2lkIjoiNzMzMmE4MTItMzQzMC00Mjk3LTkzNTAtYzY2OGUxZTczOWJhIn0.UkMNW5OiIeVTjSqjTeVQgZGTHvGtW8DuYhAW8pAQNx0",
  "access_expires_at": "2026-10-30T23:04:30.842296207Z",
  "refresh_token": "ewfUwCtqxsslv325Fqi6udfvwGfF6wuPsd4D0inNemk",
  "refresh_expires_at": "2026-10-31T10:49:30.841641581Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "63b4b69f-7fcc-4ad0-8f4f-d38894b361b7",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-30T22:49:30Z",
        "track_point_id": "b65af913-05c4-450e-8fe8-6aeec5f85caa",
        "work_session_id": "fb6abb97-459d-44b7-9820-970d3962b4ca"
      },
      "raised_by": null,
      "raised_at": "2026-10-30T22:49:30Z",
      "reason": null,
      "reviewed_by": null,
      "reviewed_at": null,
      "review_reason": null,
      "version": 1
    }
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
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

## Support confirms it with a reason — once

`POST /api/admin/v1/driver-risk-flags/63b4b69f-7fcc-4ad0-8f4f-d38894b361b7/confirm` → **200**

```json
{
  "command_id": "69aed01b-02e0-4e64-8db9-cca83390505b",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "63b4b69f-7fcc-4ad0-8f4f-d38894b361b7",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-30T22:49:30Z",
    "track_point_id": "b65af913-05c4-450e-8fe8-6aeec5f85caa",
    "work_session_id": "fb6abb97-459d-44b7-9820-970d3962b4ca"
  },
  "raised_by": null,
  "raised_at": "2026-10-30T22:49:30Z",
  "reason": null,
  "reviewed_by": "09fe1c69-c031-458c-a537-a40fa884b9ac",
  "reviewed_at": "2026-10-30T22:49:33.074838Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/63b4b69f-7fcc-4ad0-8f4f-d38894b361b7/dismiss` → **409**

```json
{
  "command_id": "7801d1c8-ddc3-4ce6-bae6-c8d769045662",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/63b4b69f-7fcc-4ad0-8f4f-d38894b361b7/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "6ca73ac4-dc4a-4bfa-9ed3-686256659b3d"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "8746665e-0e6f-4c23-8ff2-0a08c51c3c00",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "2562f024-1862-47ea-a2e5-e6a439cb36db",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "09fe1c69-c031-458c-a537-a40fa884b9ac",
  "raised_at": "2026-10-30T22:49:33.703338Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/2562f024-1862-47ea-a2e5-e6a439cb36db/dismiss` → **200**

```json
{
  "command_id": "1d42fdb3-6d75-4445-a004-0bd8b75fa015",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "2562f024-1862-47ea-a2e5-e6a439cb36db",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "09fe1c69-c031-458c-a537-a40fa884b9ac",
  "raised_at": "2026-10-30T22:49:33.703338Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "09fe1c69-c031-458c-a537-a40fa884b9ac",
  "reviewed_at": "2026-10-30T22:49:34.014156Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "2995fccd-7c10-46f2-ac5a-2e609df28180",
  "expected_version": 15,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "63b4b69f-7fcc-4ad0-8f4f-d38894b361b7"
}
```

```json
{
  "id": "5a000000-0000-4000-8000-000000000403",
  "account_state": "ACTIVE",
  "name": "Андрій Шевчук",
  "language": "ru",
  "review_status": "SUSPENDED",
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
    "review_status": "SUSPENDED",
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
  "history": [
    {
      "from": "APPROVED",
      "to": "SUSPENDED",
      "actor_type": "STAFF",
      "actor_id": "09fe1c69-c031-458c-a537-a40fa884b9ac",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T22:49:34.324781Z"
    }
  ],
  "duplicates": []
}
```

Done: flag 63b4b69f-7fcc-4ad0-8f4f-d38894b361b7 confirmed, suspension named it, driver reinstated.

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
  "session_id": "f3eaa82c-42d6-4759-af30-deac61b6ffc4",
  "subject": {
    "type": "STAFF",
    "id": "09fe1c69-c031-458c-a537-a40fa884b9ac"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwOWZlMWM2OS1jMDMxLTQ1OGMtYTUzNy1hNDBmYTg4NGI5YWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDE0NzUsImlhdCI6MTc5MzQwMDU3NSwianRpIjoiNGJjNDlmOTgtMmM2Mi00YmU2LThhZDYtMTYyMDg4ZWFhMGUwIiwic2lkIjoiZjNlYWE4MmMtNDJkNi00NzU5LWFmMzAtZGVhYzYxYjZmZmM0In0.tPG2WEQha4hzPbFtzZwsZJxMp3dcbaqLXuPbGTOlzQA",
  "access_expires_at": "2026-10-30T23:04:35.2104673Z",
  "refresh_token": "HeatTzt2rLF9lG-TOTJgCvssPiZW3tslutTI_tCSH0s",
  "refresh_expires_at": "2026-10-31T10:49:35.209863277Z",
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
    "review_status": "SUSPENDED",
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
  "history": [
    {
      "from": "APPROVED",
      "to": "SUSPENDED",
      "actor_type": "STAFF",
      "actor_id": "09fe1c69-c031-458c-a537-a40fa884b9ac",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T22:49:34.324781Z"
    }
  ],
  "duplicates": []
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "5d86f690-e75c-4028-b657-9b59d9b79f1f",
  "expected_version": 16,
  "reason": "Sandbox clean-up"
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
  "session_id": "fb6abb97-459d-44b7-9820-970d3962b4ca",
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
  "last_heartbeat_at": "2026-10-30T22:49:27.915068Z",
  "last_location_at": "2026-10-30T22:49:27.915068Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/fb6abb97-459d-44b7-9820-970d3962b4ca/close` → **200**

```json
{
  "command_id": "d1b44d34-0493-419d-bd7e-b20070f70ee9",
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
  "session_id": "b16f5df9-bf6e-4525-9380-485995cec847",
  "subject": {
    "type": "STAFF",
    "id": "09fe1c69-c031-458c-a537-a40fa884b9ac"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwOWZlMWM2OS1jMDMxLTQ1OGMtYTUzNy1hNDBmYTg4NGI5YWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDE0NzYsImlhdCI6MTc5MzQwMDU3NiwianRpIjoiNjhhYmU5OTktMjIxZS00MWE4LTk2ZjAtYTQ5YTY1ZTUwYTljIiwic2lkIjoiYjE2ZjVkZjktYmY2ZS00NTI1LTkzODAtNDg1OTk1Y2VjODQ3In0.x2z4sOvHI7D3kpy5_XLzBhdsAsGcZDUChrGUIb8NQ10",
  "access_expires_at": "2026-10-30T23:04:36.988742952Z",
  "refresh_token": "t-NI40ZQUkFDmniPI_nWieVKE-vKEjGSTWl5mCo_VE8",
  "refresh_expires_at": "2026-10-31T10:49:36.988069506Z",
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
  "command_id": "c039db76-9030-403b-be53-ebe960dfdb0c",
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
  "changed_by": "09fe1c69-c031-458c-a537-a40fa884b9ac",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T22:49:37.570405Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "c039db76-9030-403b-be53-ebe960dfdb0c",
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
  "changed_by": "09fe1c69-c031-458c-a537-a40fa884b9ac",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T22:49:37.570405Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48311263956",
  "device_ref": "sandbox-27754"
}
```

```json
{
  "challenge_id": "7757b39e-ed29-40d6-9057-f94ad98d9787",
  "expires_at": "2026-10-30T22:54:38.185122709Z",
  "resend_available_at": "2026-10-30T22:49:39.185122709Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48311263956` → **200**

```json
{
  "phone": "+48311263956",
  "audience": "CLIENT",
  "code": "718768",
  "sent_at": "2026-10-30T22:49:38.18815692Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7757b39e-ed29-40d6-9057-f94ad98d9787",
  "code": "718768",
  "device_ref": "sandbox-27754"
}
```

```json
{
  "session_id": "7412aec5-2279-4bf1-b934-5c6f19f23382",
  "subject": {
    "type": "CLIENT",
    "id": "e4d341c7-5b82-425b-b9e3-aa0a86bb4607"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNGQzNDFjNy01YjgyLTQyNWItYjllMy1hYTBhODZiYjQ2MDciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDAxNDc4LCJpYXQiOjE3OTM0MDA1NzgsImp0aSI6IjM5ZWM4ZGRlLTM1MzctNDQ5ZC1hODkwLWJmMTUxNjU5NTA2MiIsInNpZCI6Ijc0MTJhZWM1LTIyNzktNGJmMS1iOTM0LTVjNmYxOWYyMzM4MiJ9.qQg_iV6IxF5aAaCmmGyCjB78c4KLsLmn0cujp2Ooae4",
  "access_expires_at": "2026-10-30T23:04:38.51075625Z",
  "refresh_token": "4czQEQgZjFa7qpzuww-Sqq9HaNdiEDb3NXszoVBvO6o",
  "refresh_expires_at": "2026-11-29T22:49:38.510231979Z",
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
  "correlation_id": "f97ad49b-64b0-49cb-8185-05d1cdeed835"
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
  "device_ref": "sandbox-18915"
}
```

```json
{
  "challenge_id": "938d2724-3b5a-42fb-b23b-044bad10eb06",
  "expires_at": "2026-10-30T22:54:39.374628777Z",
  "resend_available_at": "2026-10-30T22:49:40.374628777Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "596963",
  "sent_at": "2026-10-30T22:49:39.378636598Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "938d2724-3b5a-42fb-b23b-044bad10eb06",
  "code": "596963",
  "device_ref": "sandbox-18915"
}
```

```json
{
  "session_id": "7f39db17-79a3-4736-8cf9-0c4f94eeba13",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwMTQ3OSwiaWF0IjoxNzkzNDAwNTc5LCJqdGkiOiI1Yjg2MTU4Zi0yZmU4LTRmNWMtYjczYy0zNDhmZDgyZjM0M2IiLCJzaWQiOiI3ZjM5ZGIxNy03OWEzLTQ3MzYtOGNmOS0wYzRmOTRlZWJhMTMifQ.fUPL9uvH-12J3r6COVfC0DQ3wsSfarRZpBV4HB6p_14",
  "access_expires_at": "2026-10-30T23:04:39.689072398Z",
  "refresh_token": "r6_PcQpxqVfJNmWHwBfRP-M1Kk465nQVqBn0PypmR94",
  "refresh_expires_at": "2026-11-29T22:49:39.688513672Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "2c834c81-e7c1-49ee-a53a-868e3b8398b4",
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
  "last_heartbeat_at": "2026-10-30T22:48:18.682141Z",
  "last_location_at": "2026-10-30T22:48:18.682141Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/2c834c81-e7c1-49ee-a53a-868e3b8398b4/handover` → **200**

```json
{
  "command_id": "e2b58477-e1e9-4222-aa1d-b10256506367",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "2c834c81-e7c1-49ee-a53a-868e3b8398b4",
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
  "last_heartbeat_at": "2026-10-30T22:48:18.682141Z",
  "last_location_at": "2026-10-30T22:48:18.682141Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/2c834c81-e7c1-49ee-a53a-868e3b8398b4/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:49:40Z",
    "sequence": 1793400580584
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "2c834c81-e7c1-49ee-a53a-868e3b8398b4",
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
  "last_heartbeat_at": "2026-10-30T22:49:40.602831Z",
  "last_location_at": "2026-10-30T22:49:40.602831Z",
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
  "session_id": "2c834c81-e7c1-49ee-a53a-868e3b8398b4",
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
  "last_heartbeat_at": "2026-10-30T22:49:40.602831Z",
  "last_location_at": "2026-10-30T22:49:40.602831Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2c834c81-e7c1-49ee-a53a-868e3b8398b4/close` → **200**

```json
{
  "command_id": "582c1fa9-6fd5-477b-9198-069b7de22350",
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
  "correlation_id": "b22075a6-81a8-4b39-af1a-93fd68a87a3c"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675138612",
  "device_ref": "sandbox-6537"
}
```

```json
{
  "challenge_id": "6ae1a22a-0c61-4e0a-adcf-1c1467ea84c4",
  "expires_at": "2026-10-30T22:54:42.097732627Z",
  "resend_available_at": "2026-10-30T22:49:43.097732627Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380675138612` → **200**

```json
{
  "phone": "+380675138612",
  "audience": "CLIENT",
  "code": "705304",
  "sent_at": "2026-10-30T22:49:42.100515792Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6ae1a22a-0c61-4e0a-adcf-1c1467ea84c4",
  "code": "705304",
  "device_ref": "sandbox-6537"
}
```

```json
{
  "session_id": "5f5ff024-4fcb-414e-b65c-17bb1ee267c6",
  "subject": {
    "type": "CLIENT",
    "id": "9567fd43-715f-4028-98a4-b2e358c20944"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NTY3ZmQ0My03MTVmLTQwMjgtOThhNC1iMmUzNThjMjA5NDQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDAxNDgyLCJpYXQiOjE3OTM0MDA1ODIsImp0aSI6IjQ2NmYwYmE5LTRkOWMtNGY3YS1iODkwLTMyNWM2MmFkZjA2MCIsInNpZCI6IjVmNWZmMDI0LTRmY2ItNDE0ZS1iNjVjLTE3YmIxZWUyNjdjNiJ9.S2KUX59aYEhXY9lwbNzKtCz3CG4zYZUftTD9Er3BijY",
  "access_expires_at": "2026-10-30T23:04:42.423890807Z",
  "refresh_token": "SIKVR1fFs1To5_XLwZ6WjYOBrtddlWyrrQnWy6PriPA",
  "refresh_expires_at": "2026-11-29T22:49:42.423338213Z",
  "account_created": true
}
```

## The EICAR antivirus test file is refused by the antivirus

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "cdfab64f-9093-4cb7-8bd1-8bcba8e215a9",
  "content_type": "application/pdf",
  "size_bytes": 86
}
```

```json
{
  "file_id": "0c9f4fed-bb35-493d-9086-fc728707ebdd",
  "upload_path": "/api/rider/v1/uploads/0c9f4fed-bb35-493d-9086-fc728707ebdd",
  "expires_at": "2026-10-30T23:04:42.729250217Z",
  "max_bytes": 86
}
```

`PUT /api/rider/v1/uploads/0c9f4fed-bb35-493d-9086-fc728707ebdd` → **200**

```json
{
  "file_id": "0c9f4fed-bb35-493d-9086-fc728707ebdd",
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
  "command_id": "9bd00ee2-af73-468a-bb0f-f4fe8a3253d9",
  "content_type": "application/pdf",
  "size_bytes": 92
}
```

```json
{
  "file_id": "e658f72f-4b3b-4124-b910-0e89c5f3e187",
  "upload_path": "/api/rider/v1/uploads/e658f72f-4b3b-4124-b910-0e89c5f3e187",
  "expires_at": "2026-10-30T23:04:43.047588604Z",
  "max_bytes": 92
}
```

`PUT /api/rider/v1/uploads/e658f72f-4b3b-4124-b910-0e89c5f3e187` → **200**

```json
{
  "file_id": "e658f72f-4b3b-4124-b910-0e89c5f3e187",
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
  "command_id": "dad30407-50e1-44b6-9a42-88df37aa3fd6",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "84f9ba1a-368f-43f7-9de4-48b525852819",
  "upload_path": "/api/rider/v1/uploads/84f9ba1a-368f-43f7-9de4-48b525852819",
  "expires_at": "2026-10-30T23:04:43.36774695Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/84f9ba1a-368f-43f7-9de4-48b525852819` → **200**

```json
{
  "file_id": "84f9ba1a-368f-43f7-9de4-48b525852819",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "f26fd6db-96d5-4878-b4a5-edcca2f28582",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "84f9ba1a-368f-43f7-9de4-48b525852819"
  ]
}
```

```json
{
  "id": "9ee1eecf-7711-4a6a-9a3c-428935f15069",
  "number": 4,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "9567fd43-715f-4028-98a4-b2e358c20944",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T22:49:43.682511Z",
  "updated_at": "2026-10-30T22:49:43.682511Z",
  "respond_by": "2026-10-31T02:49:43.682511Z",
  "messages": [
    {
      "id": "31481b76-6c37-4e49-8aff-13af37476cb8",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "9567fd43-715f-4028-98a4-b2e358c20944",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T22:49:43.683793Z",
      "attachments": [
        {
          "file_id": "84f9ba1a-368f-43f7-9de4-48b525852819",
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
  "session_id": "83c9fa19-77e5-4736-887a-0e23bb1a18fd",
  "subject": {
    "type": "STAFF",
    "id": "09fe1c69-c031-458c-a537-a40fa884b9ac"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwOWZlMWM2OS1jMDMxLTQ1OGMtYTUzNy1hNDBmYTg4NGI5YWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDE0ODQsImlhdCI6MTc5MzQwMDU4NCwianRpIjoiY2M3YWNkYTMtMGM0Zi00ZTI5LTlmYjctMjhhYjE4OGE1YWQ0Iiwic2lkIjoiODNjOWZhMTktNzdlNS00NzM2LTg4N2EtMGUyM2JiMWExOGZkIn0.IKgyPCnR1YRK29U-FT-LgiGkJZuM1gkj0M-HcM3c2ws",
  "access_expires_at": "2026-10-30T23:04:44.284285461Z",
  "refresh_token": "OVnrlKO72E7P_5KQpdflU39DuafG7iUbp1mKsf_Z9TQ",
  "refresh_expires_at": "2026-10-31T10:49:44.283725002Z",
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
  "session_id": "6ecabcc2-daa1-4c7c-971f-de6e23ec0e2a",
  "subject": {
    "type": "STAFF",
    "id": "09fe1c69-c031-458c-a537-a40fa884b9ac"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwOWZlMWM2OS1jMDMxLTQ1OGMtYTUzNy1hNDBmYTg4NGI5YWMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDE0ODQsImlhdCI6MTc5MzQwMDU4NCwianRpIjoiOTQ2MjQ3OGQtZjgyMS00ODBmLWJiYTMtMGVkNWU2MTU4MzZiIiwic2lkIjoiNmVjYWJjYzItZGFhMS00YzdjLTk3MWYtZGU2ZTIzZWMwZTJhIn0.rWF4kfJ_5Dw4_EEAxW0w2eoSpt_qyoYR7QweB79MU7U",
  "access_expires_at": "2026-10-30T23:04:44.863709815Z",
  "refresh_token": "xbzPfWEqAAP4_HqXgfrKm2utcjVFIajflBkXZgapi7A",
  "refresh_expires_at": "2026-10-31T10:49:44.863074917Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/9ee1eecf-7711-4a6a-9a3c-428935f15069/attachments/84f9ba1a-368f-43f7-9de4-48b525852819` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "4651cf53-2dc5-4ff3-bb22-56f2562d7aa2",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "d3d39037-092a-4385-81a5-70005af3d7d4",
  "upload_path": "/api/operator/v1/uploads/d3d39037-092a-4385-81a5-70005af3d7d4",
  "expires_at": "2026-10-30T23:04:45.19548813Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/d3d39037-092a-4385-81a5-70005af3d7d4` → **200**

```json
{
  "file_id": "d3d39037-092a-4385-81a5-70005af3d7d4",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/9ee1eecf-7711-4a6a-9a3c-428935f15069` → **200**

```json
{
  "id": "9ee1eecf-7711-4a6a-9a3c-428935f15069",
  "number": 4,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "9567fd43-715f-4028-98a4-b2e358c20944",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T22:49:43.682511Z",
  "updated_at": "2026-10-30T22:49:43.682511Z",
  "respond_by": "2026-10-31T02:49:43.682511Z",
  "messages": [
    {
      "id": "31481b76-6c37-4e49-8aff-13af37476cb8",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "9567fd43-715f-4028-98a4-b2e358c20944",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T22:49:43.683793Z",
      "attachments": [
        {
          "file_id": "84f9ba1a-368f-43f7-9de4-48b525852819",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/9ee1eecf-7711-4a6a-9a3c-428935f15069/comments` → **200**

```json
{
  "command_id": "8c28fe8f-7b4f-4e7c-9088-2042ba8be286",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "d3d39037-092a-4385-81a5-70005af3d7d4"
  ]
}
```

```json
{
  "id": "9ee1eecf-7711-4a6a-9a3c-428935f15069",
  "number": 4,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "9567fd43-715f-4028-98a4-b2e358c20944",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T22:49:43.682511Z",
  "updated_at": "2026-10-30T22:49:45.888355Z",
  "respond_by": "2026-10-31T02:49:43.682511Z",
  "messages": [
    {
      "id": "31481b76-6c37-4e49-8aff-13af37476cb8",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "9567fd43-715f-4028-98a4-b2e358c20944",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T22:49:43.683793Z",
      "attachments": [
        {
          "file_id": "84f9ba1a-368f-43f7-9de4-48b525852819",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "b2510b8d-ee00-449c-9a3d-a2796f00400a",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "09fe1c69-c031-458c-a537-a40fa884b9ac",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T22:49:45.88789Z",
      "attachments": [
        {
          "file_id": "d3d39037-092a-4385-81a5-70005af3d7d4",
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

`GET /api/rider/v1/support/cases/9ee1eecf-7711-4a6a-9a3c-428935f15069` → **200**

```json
{
  "id": "9ee1eecf-7711-4a6a-9a3c-428935f15069",
  "number": 4,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "9567fd43-715f-4028-98a4-b2e358c20944",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T22:49:43.682511Z",
  "updated_at": "2026-10-30T22:49:45.888355Z",
  "respond_by": "2026-10-31T02:49:43.682511Z",
  "messages": [
    {
      "id": "31481b76-6c37-4e49-8aff-13af37476cb8",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "9567fd43-715f-4028-98a4-b2e358c20944",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T22:49:43.683793Z",
      "attachments": [
        {
          "file_id": "84f9ba1a-368f-43f7-9de4-48b525852819",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "b2510b8d-ee00-449c-9a3d-a2796f00400a",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T22:49:45.88789Z",
      "attachments": [
        {
          "file_id": "d3d39037-092a-4385-81a5-70005af3d7d4",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/9ee1eecf-7711-4a6a-9a3c-428935f15069/attachments/d3d39037-092a-4385-81a5-70005af3d7d4` → **200**

Done: support case 9ee1eecf-7711-4a6a-9a3c-428935f15069, rider attachment 84f9ba1a-368f-43f7-9de4-48b525852819, operator attachment d3d39037-092a-4385-81a5-70005af3d7d4.

# Scenario: switch-to-cash

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380732763287",
  "device_ref": "sandbox-10401"
}
```

```json
{
  "challenge_id": "68d449ca-6384-4d1c-9977-7fa958542741",
  "expires_at": "2026-10-30T22:54:46.529044756Z",
  "resend_available_at": "2026-10-30T22:49:47.529044756Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380732763287` → **200**

```json
{
  "phone": "+380732763287",
  "audience": "CLIENT",
  "code": "539823",
  "sent_at": "2026-10-30T22:49:46.533051837Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "68d449ca-6384-4d1c-9977-7fa958542741",
  "code": "539823",
  "device_ref": "sandbox-10401"
}
```

```json
{
  "session_id": "9caeecc9-9fc3-4a76-bb41-290fe0ded880",
  "subject": {
    "type": "CLIENT",
    "id": "27556b03-cf10-41a2-8b27-dfa28e443113"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNzU1NmIwMy1jZjEwLTQxYTItOGIyNy1kZmEyOGU0NDMxMTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDAxNDg2LCJpYXQiOjE3OTM0MDA1ODYsImp0aSI6ImIxMDBiZjE2LTZlMGYtNGVkMi1iNmVjLWE4OThhNzhjMGFhMCIsInNpZCI6IjljYWVlY2M5LTlmYzMtNGE3Ni1iYjQxLTI5MGZlMGRlZDg4MCJ9.obz7TP7-kAo4EnYa5XWYyGLnqu4mxsccK3QatG0RJZA",
  "access_expires_at": "2026-10-30T23:04:46.853069878Z",
  "refresh_token": "IsBqXPTXoVv45ZfWC20jmiMsGXxHds-y_rxy8Ux_vw0",
  "refresh_expires_at": "2026-11-29T22:49:46.852530919Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "d4c020a2-8c6a-4f69-aaa3-4ac7dec4eaf4",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "06bdbfdd-ca73-4491-8148-27854fbdb891",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-06bdbfdd-ca73-4491-8148-27854fbdb891",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "1e57bff2950c0d96d99d6cde336dca6b",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=06bdbfdd-ca73-4491-8148-27854fbdb891",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380732763287"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=06bdbfdd-ca73-4491-8148-27854fbdb891",
  "expires_at": "2026-10-30T23:19:47.158441Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/06bdbfdd-ca73-4491-8148-27854fbdb891` → **200**

```json
{
  "id": "06bdbfdd-ca73-4491-8148-27854fbdb891",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T23:19:47.158441Z",
  "card": {
    "id": "b1151ddf-93bf-43f2-8faa-5e08dfdb06b4",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****7310",
    "card_type": "Visa",
    "created_at": "2026-10-30T22:49:47.46242Z"
  },
  "failure_reason": null
}
```

## The rider orders by card: the hold is taken

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6346f5a2-570b-4e2c-9c88-1e875f2eb82e",
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
  "id": "d0d93e62-f145-4b1f-be02-bbfd7969333a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T22:54:47.779259Z",
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
  "command_id": "918bc34e-156d-4318-a4ac-4914df2359cd",
  "quote_id": "d0d93e62-f145-4b1f-be02-bbfd7969333a",
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
  "id": "b3aa83d7-40f4-4158-8de8-230148ebe330",
  "short_number": 36,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "27556b03-cf10-41a2-8b27-dfa28e443113",
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
  "created_at": "2026-10-30T22:49:48.083685Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

`GET /api/rider/v1/orders/b3aa83d7-40f4-4158-8de8-230148ebe330` → **200**

```json
{
  "id": "b3aa83d7-40f4-4158-8de8-230148ebe330",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "27556b03-cf10-41a2-8b27-dfa28e443113",
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
  "created_at": "2026-10-30T22:49:48.083685Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

## The rider decides to pay in cash

`GET /api/rider/v1/orders/b3aa83d7-40f4-4158-8de8-230148ebe330` → **200**

```json
{
  "id": "b3aa83d7-40f4-4158-8de8-230148ebe330",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "27556b03-cf10-41a2-8b27-dfa28e443113",
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
  "created_at": "2026-10-30T22:49:48.083685Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

`POST /api/rider/v1/orders/b3aa83d7-40f4-4158-8de8-230148ebe330/switch-to-cash` → **200**

```json
{
  "command_id": "b7c2dc4f-d4b9-4f46-bc1d-f14dc2d782a5",
  "expected_version": 3
}
```

```json
{
  "id": "b3aa83d7-40f4-4158-8de8-230148ebe330",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "27556b03-cf10-41a2-8b27-dfa28e443113",
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
  "created_at": "2026-10-30T22:49:48.083685Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

`POST /api/rider/v1/orders/b3aa83d7-40f4-4158-8de8-230148ebe330/switch-to-cash` → **409**

```json
{
  "command_id": "67ca6953-9ecb-468c-8a77-0c46f7fcd8b4",
  "expected_version": 4
}
```

```json
{
  "instance": "/api/rider/v1/orders/b3aa83d7-40f4-4158-8de8-230148ebe330/switch-to-cash",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "5feccb06-6c31-4397-b9b7-d9cad8115a4e"
}
```

Done: the card order became cash; a second switch is refused.

`GET /api/rider/v1/orders/b3aa83d7-40f4-4158-8de8-230148ebe330` → **200**

```json
{
  "id": "b3aa83d7-40f4-4158-8de8-230148ebe330",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "27556b03-cf10-41a2-8b27-dfa28e443113",
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
  "created_at": "2026-10-30T22:49:48.083685Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

`POST /api/rider/v1/orders/b3aa83d7-40f4-4158-8de8-230148ebe330/cancel` → **200**

```json
{
  "command_id": "6a3b45a6-7e57-4cf9-aa5f-924ad64ce9a1",
  "expected_version": 4,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "b3aa83d7-40f4-4158-8de8-230148ebe330",
  "short_number": 36,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "27556b03-cf10-41a2-8b27-dfa28e443113",
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
  "created_at": "2026-10-30T22:49:48.083685Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "ru": "Передумал ехать",
      "en": "Changed my mind",
      "uk": "Передумав їхати",
      "pl": "Zmiana planów"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
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
  "session_id": "c385ee67-e7f4-4a05-9357-02e2c3160b6d",
  "subject": {
    "type": "STAFF",
    "id": "09fe1c69-c031-458c-a537-a40fa884b9ac"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwOWZlMWM2OS1jMDMxLTQ1OGMtYTUzNy1hNDBmYTg4NGI5YWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDE0OTAsImlhdCI6MTc5MzQwMDU5MCwianRpIjoiNmEzMjM5OWYtOGUzYy00YjIwLTg3NGEtZjViNjQ1MGZlYTI4Iiwic2lkIjoiYzM4NWVlNjctZTdmNC00YTA1LTkzNTctMDJlMmMzMTYwYjZkIn0.Ysr8MUUk8d4Clc9-m6DED5WyhzQymbV61g9P4cRaBJU",
  "access_expires_at": "2026-10-30T23:04:50.587246922Z",
  "refresh_token": "oyO_YfxebEDCaJHUdFK-ZKW57CXBun_hArmtykeHb9Y",
  "refresh_expires_at": "2026-10-31T10:49:50.586341606Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-3833"
}
```

```json
{
  "challenge_id": "dde682af-acbb-4b48-b88d-f354db550e86",
  "expires_at": "2026-10-30T22:54:50.874143479Z",
  "resend_available_at": "2026-10-30T22:49:51.874143479Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "972604",
  "sent_at": "2026-10-30T22:49:50.876836202Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "dde682af-acbb-4b48-b88d-f354db550e86",
  "code": "972604",
  "device_ref": "sandbox-3833"
}
```

```json
{
  "session_id": "76f50cbd-0551-42b5-9060-c5d2bb337769",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwMTQ5MSwiaWF0IjoxNzkzNDAwNTkxLCJqdGkiOiJkOTAxM2RlNC02NWI3LTQyN2MtOTA1Ni04NmZhM2RhNDY1ZDkiLCJzaWQiOiI3NmY1MGNiZC0wNTUxLTQyYjUtOTA2MC1jNWQyYmIzMzc3NjkifQ.OLuvH2Y99mN9G5KoCYF18VDKmt0mt8HP9_WcCemBcPo",
  "access_expires_at": "2026-10-30T23:04:51.185677265Z",
  "refresh_token": "vKZHeXoNDOudpAT9Z2mTyEmBotDhC2Ua8z1hkavJ4lg",
  "refresh_expires_at": "2026-11-29T22:49:51.185020987Z",
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
  "version": 18,
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
    "version": 18,
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
  "history": [
    {
      "from": "APPROVED",
      "to": "SUSPENDED",
      "actor_type": "STAFF",
      "actor_id": "09fe1c69-c031-458c-a537-a40fa884b9ac",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T22:49:34.324781Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "09fe1c69-c031-458c-a537-a40fa884b9ac",
      "reason": "Sandbox clean-up",
      "at": "2026-10-30T22:49:35.802327Z"
    }
  ],
  "duplicates": []
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "c1a6b0fb-0099-4d1b-8230-c4cbe0dedf61",
  "expected_version": 18,
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
  "version": 19,
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
  "device_ref": "sandbox-5293"
}
```

```json
{
  "challenge_id": "e4db1853-b73d-4994-9dde-20c5f25f8499",
  "expires_at": "2026-10-30T22:54:52.378421122Z",
  "resend_available_at": "2026-10-30T22:49:53.378421122Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "070591",
  "sent_at": "2026-10-30T22:49:52.381134115Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e4db1853-b73d-4994-9dde-20c5f25f8499",
  "code": "070591",
  "device_ref": "sandbox-5293"
}
```

```json
{
  "session_id": "ba2d930a-eafd-4445-bf4d-9177774782d9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwMTQ5MiwiaWF0IjoxNzkzNDAwNTkyLCJqdGkiOiI5NWQyYjA3OS0xYjg4LTQ5YTktOWNmYi1lYjc0ZDlkMjZiOTciLCJzaWQiOiJiYTJkOTMwYS1lYWZkLTQ0NDUtYmY0ZC05MTc3Nzc0NzgyZDkifQ.zVCugHgQM4_TY5Gng2F8syNsHBffJAk5Kkw4YS5r66w",
  "access_expires_at": "2026-10-30T23:04:52.705368309Z",
  "refresh_token": "1wNQiLPgxwL3krjqQ8ZTO15Q2arzXAP6RTLL3aZWNSc",
  "refresh_expires_at": "2026-11-29T22:49:52.704492108Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d619d055-251a-4efb-b4db-cd6003eec5bb",
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
  "last_heartbeat_at": "2026-10-30T22:49:13.222856Z",
  "last_location_at": "2026-10-30T22:49:13.222856Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/d619d055-251a-4efb-b4db-cd6003eec5bb/handover` → **200**

```json
{
  "command_id": "45f253d6-f4b4-417e-917f-8f41b46ace15",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d619d055-251a-4efb-b4db-cd6003eec5bb",
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
  "last_heartbeat_at": "2026-10-30T22:49:13.222856Z",
  "last_location_at": "2026-10-30T22:49:13.222856Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

(the car drives 9 s to the next point)

`POST /api/driver/v1/work-sessions/d619d055-251a-4efb-b4db-cd6003eec5bb/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:50:02Z",
    "sequence": 1793400602620
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d619d055-251a-4efb-b4db-cd6003eec5bb",
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
  "last_heartbeat_at": "2026-10-30T22:50:02.63876Z",
  "last_location_at": "2026-10-30T22:50:02.63876Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
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
  "command_id": "07d18c37-7080-4871-b438-cd7936e79215",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:50:03Z",
    "sequence": 1793400603233
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "4f42e065-370c-4210-ac27-989c108088ab",
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
  "last_heartbeat_at": "2026-10-30T22:50:03.251626Z",
  "last_location_at": "2026-10-30T22:50:03.251626Z",
  "eligible": true,
  "ineligible_reasons": []
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
  "session_id": "a5434d6e-b4bd-4987-ac75-0eb0ffc13376",
  "subject": {
    "type": "STAFF",
    "id": "09fe1c69-c031-458c-a537-a40fa884b9ac"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwOWZlMWM2OS1jMDMxLTQ1OGMtYTUzNy1hNDBmYTg4NGI5YWMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDE1MDMsImlhdCI6MTc5MzQwMDYwMywianRpIjoiMWVkNmJlYjItZTY2OS00MzYzLTk5NDItMDQ3NTUwOWQ1N2ZmIiwic2lkIjoiYTU0MzRkNmUtYjRiZC00OTg3LWFjNzUtMGViMGZmYzEzMzc2In0.F2gkeqTaJwBLgZmx3vmwfQPSw0GvEDXmzKTDN6n--ww",
  "access_expires_at": "2026-10-30T23:05:03.851151105Z",
  "refresh_token": "K5ht1_GVUiXv4bnUXvUwB2xIC2Nj2vCOvCYaOqQ1Yy4",
  "refresh_expires_at": "2026-10-31T10:50:03.850542505Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "209a72cd-e1fa-499e-a730-45c429bfab92",
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
  "id": "736fdb52-60ff-4501-9d0c-dee114a94749",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T22:55:04.137994Z",
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
  "command_id": "95304587-0034-40fd-b2a5-521fae92432a",
  "quote_id": "736fdb52-60ff-4501-9d0c-dee114a94749",
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
  "id": "10af0a20-bc44-4970-b29e-91b2b34c4fc6",
  "short_number": 37,
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
  "search_phase": "PERSONAL",
  "assignment": null,
  "created_at": "2026-10-30T22:50:04.453772Z",
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
[
  {
    "id": "709708cf-7149-4a14-93c3-d8c257283b0d",
    "order_id": "10af0a20-bc44-4970-b29e-91b2b34c4fc6",
    "expires_at": "2026-10-30T22:50:19.457965Z",
    "vehicle_class": "STANDARD",
    "pickup": {
      "lat": 50.4501,
      "lon": 30.5234
    },
    "pickup_label": "Майдан",
    "dropoff_label": "Позняки",
    "payment_method": "TERMINAL",
    "price_minor": 29967,
    "currency": "UAH",
    "distance_m": 656
  }
]
```

`POST /api/driver/v1/offers/709708cf-7149-4a14-93c3-d8c257283b0d/accept` → **200**

```json
{
  "command_id": "7e010b0f-5d0f-459f-a84c-83c9b7c7b7bb"
}
```

```json
{
  "id": "cc54f21c-9479-4dbc-978b-f8b0fa418d38",
  "order_id": "10af0a20-bc44-4970-b29e-91b2b34c4fc6",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c35e821d-ac36-4e57-95ec-e534b362450d",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c35e821d-ac36-4e57-95ec-e534b362450d",
  "order_id": "10af0a20-bc44-4970-b29e-91b2b34c4fc6",
  "assignment_id": "cc54f21c-9479-4dbc-978b-f8b0fa418d38",
  "phase": "TO_PICKUP",
  "version": 0,
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
  "price_minor": 29967,
  "currency": "UAH",
  "arrived_at": null,
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380671112233"
  }
}
```

(the car drives 10 s to the next point)

`POST /api/driver/v1/work-sessions/4f42e065-370c-4210-ac27-989c108088ab/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:50:15Z",
    "sequence": 1793400615993
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "4f42e065-370c-4210-ac27-989c108088ab",
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
  "last_heartbeat_at": "2026-10-30T22:50:16.011718Z",
  "last_location_at": "2026-10-30T22:50:16.011718Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/c35e821d-ac36-4e57-95ec-e534b362450d/arrive` → **200**

```json
{
  "command_id": "08b48b1b-bfd8-4f9b-9876-661adc9e631b",
  "expected_version": 0
}
```

```json
{
  "id": "c35e821d-ac36-4e57-95ec-e534b362450d",
  "order_id": "10af0a20-bc44-4970-b29e-91b2b34c4fc6",
  "assignment_id": "cc54f21c-9479-4dbc-978b-f8b0fa418d38",
  "phase": "WAITING",
  "version": 1,
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
  "price_minor": 29967,
  "currency": "UAH",
  "arrived_at": "2026-10-30T22:50:16.309793Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380671112233"
  }
}
```

`POST /api/driver/v1/trips/c35e821d-ac36-4e57-95ec-e534b362450d/start` → **200**

```json
{
  "command_id": "d09031db-23d3-45bb-b9a1-b52178b131ef",
  "expected_version": 1
}
```

```json
{
  "id": "c35e821d-ac36-4e57-95ec-e534b362450d",
  "order_id": "10af0a20-bc44-4970-b29e-91b2b34c4fc6",
  "assignment_id": "cc54f21c-9479-4dbc-978b-f8b0fa418d38",
  "phase": "IN_PROGRESS",
  "version": 2,
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
  "price_minor": 29967,
  "currency": "UAH",
  "arrived_at": "2026-10-30T22:50:16.309793Z",
  "started_at": "2026-10-30T22:50:16.621432Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380671112233"
  }
}
```

`POST /api/driver/v1/trips/c35e821d-ac36-4e57-95ec-e534b362450d/complete` → **200**

```json
{
  "command_id": "87f620c7-230b-4f15-ac32-ed65372479d6",
  "expected_version": 2,
  "reported_at": "2026-10-30T22:50:16Z",
  "cash_received": true
}
```

```json
{
  "id": "c35e821d-ac36-4e57-95ec-e534b362450d",
  "order_id": "10af0a20-bc44-4970-b29e-91b2b34c4fc6",
  "assignment_id": "cc54f21c-9479-4dbc-978b-f8b0fa418d38",
  "phase": "COMPLETED",
  "version": 3,
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
  "price_minor": 29967,
  "currency": "UAH",
  "arrived_at": "2026-10-30T22:50:16.309793Z",
  "started_at": "2026-10-30T22:50:16.621432Z",
  "completed_at": "2026-10-30T22:50:16.92215Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/10af0a20-bc44-4970-b29e-91b2b34c4fc6` → **200**

```json
{
  "id": "10af0a20-bc44-4970-b29e-91b2b34c4fc6",
  "short_number": 37,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
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
  "payment_state": "TERMINAL_REPORTED",
  "price_minor": 29967,
  "final_price_minor": 29967,
  "currency": "UAH",
  "search_phase": "STOPPED",
  "assignment": {
    "id": "cc54f21c-9479-4dbc-978b-f8b0fa418d38",
    "order_id": "10af0a20-bc44-4970-b29e-91b2b34c4fc6",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "c35e821d-ac36-4e57-95ec-e534b362450d",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T22:50:04.453772Z",
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

`GET /api/driver/v1/balance` → **200**

```json
{
  "balances": [
    {
      "currency": "UAH",
      "balance_minor": 40483,
      "debt_limit_minor": null,
      "blocked": false
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d619d055-251a-4efb-b4db-cd6003eec5bb",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "STALE",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T22:50:02.63876Z",
  "last_location_at": "2026-10-30T22:50:02.63876Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/d619d055-251a-4efb-b4db-cd6003eec5bb/close` → **200**

```json
{
  "command_id": "1407d511-e1d4-4c6b-a000-6635dad66bb2",
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
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "4f42e065-370c-4210-ac27-989c108088ab",
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
  "last_heartbeat_at": "2026-10-30T22:50:16.011718Z",
  "last_location_at": "2026-10-30T22:50:16.011718Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/4f42e065-370c-4210-ac27-989c108088ab/close` → **200**

```json
{
  "command_id": "a653587b-0c9d-4639-bd78-9b8337c3f6c9",
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

Done: terminal order 10af0a20-bc44-4970-b29e-91b2b34c4fc6 by Andrii (5a000000-0000-4000-8000-000000000403).

# Scenario: zz-metrics

## A search without drivers ends as UNFULFILLED

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-24779"
}
```

```json
{
  "challenge_id": "7500efb3-3485-47f8-95b2-603bc37367b6",
  "expires_at": "2026-10-30T22:55:22.037319547Z",
  "resend_available_at": "2026-10-30T22:50:23.037319547Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "413840",
  "sent_at": "2026-10-30T22:50:22.0430314Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7500efb3-3485-47f8-95b2-603bc37367b6",
  "code": "413840",
  "device_ref": "sandbox-24779"
}
```

```json
{
  "session_id": "990d8fea-1409-458d-84a4-bf8a4d92962d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwMTUyMiwiaWF0IjoxNzkzNDAwNjIyLCJqdGkiOiJhYWU1MTg3Zi0yNjUzLTQ3ZmUtYjBlYy1kMWQyZjI3NDY5NjYiLCJzaWQiOiI5OTBkOGZlYS0xNDA5LTQ1OGQtODRhNC1iZjhhNGQ5Mjk2MmQifQ.0hGRtzsaojyktm0iQN94cmhmJ7N3JID2RPYZZzJZj9E",
  "access_expires_at": "2026-10-30T23:05:22.355132714Z",
  "refresh_token": "xTRGSCws6FBkKId85BNQjWhXARJuQTpe3BN0PEE-P2U",
  "refresh_expires_at": "2026-11-29T22:50:22.354501397Z",
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
  "device_ref": "sandbox-32533"
}
```

```json
{
  "challenge_id": "8694ef88-5219-40e7-b6c3-1077eeb83cd0",
  "expires_at": "2026-10-30T22:55:22.927077874Z",
  "resend_available_at": "2026-10-30T22:50:23.927077874Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "718443",
  "sent_at": "2026-10-30T22:50:22.929606839Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8694ef88-5219-40e7-b6c3-1077eeb83cd0",
  "code": "718443",
  "device_ref": "sandbox-32533"
}
```

```json
{
  "session_id": "b81e7092-078f-4046-9182-4f288111035f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwMTUyMywiaWF0IjoxNzkzNDAwNjIzLCJqdGkiOiJmMzVlODgwNy04NTgzLTQ5N2EtYjYwMC05Y2RjMGI0N2VjMGYiLCJzaWQiOiJiODFlNzA5Mi0wNzhmLTQwNDYtOTE4Mi00ZjI4ODExMTAzNWYifQ.U7_htIdmOELIL8IOSfqYVN4tw0n-Tn0QCKaDAMU8MDU",
  "access_expires_at": "2026-10-30T23:05:23.244315118Z",
  "refresh_token": "ovo52eQ7NLTvXfLfln2ve-Cs-GHTZBt7wkDG1XENdTM",
  "refresh_expires_at": "2026-11-29T22:50:23.243632148Z",
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

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-15350"
}
```

```json
{
  "challenge_id": "8ee2cad2-cf94-4b3f-922f-d629434b8f15",
  "expires_at": "2026-10-30T22:55:23.820626786Z",
  "resend_available_at": "2026-10-30T22:50:24.820626786Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "235398",
  "sent_at": "2026-10-30T22:50:23.823547876Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8ee2cad2-cf94-4b3f-922f-d629434b8f15",
  "code": "235398",
  "device_ref": "sandbox-15350"
}
```

```json
{
  "session_id": "bab59537-2026-4bdc-9fcd-1e3e63cf28c7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwMTUyNCwiaWF0IjoxNzkzNDAwNjI0LCJqdGkiOiJlNmZkOTNjNS0zYzQ4LTQ0MzAtYmE5YS05Mzg3ZmI0Yjk1OWUiLCJzaWQiOiJiYWI1OTUzNy0yMDI2LTRiZGMtOWZjZC0xZTNlNjNjZjI4YzcifQ.7uFMsaiqc3zxqFzH8PnUyGEZdEb3yN5p3ADopowuykA",
  "access_expires_at": "2026-10-30T23:05:24.142363163Z",
  "refresh_token": "PVdRlD-Lb-hk_ZLXAfHdhIJcZg82UpmUB4__mByAZiY",
  "refresh_expires_at": "2026-11-29T22:50:24.141712651Z",
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
  "audience": "CLIENT",
  "phone": "+380699782613",
  "device_ref": "sandbox-888"
}
```

```json
{
  "challenge_id": "1e110181-f140-40ce-b679-8fa0326e000a",
  "expires_at": "2026-10-30T22:55:24.703913332Z",
  "resend_available_at": "2026-10-30T22:50:25.703913332Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380699782613` → **200**

```json
{
  "phone": "+380699782613",
  "audience": "CLIENT",
  "code": "783290",
  "sent_at": "2026-10-30T22:50:24.706675454Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1e110181-f140-40ce-b679-8fa0326e000a",
  "code": "783290",
  "device_ref": "sandbox-888"
}
```

```json
{
  "session_id": "340b73bb-b62a-464e-8608-8918879b8e94",
  "subject": {
    "type": "CLIENT",
    "id": "4aa4e87f-4be8-49ab-8cfb-698311a48c59"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YWE0ZTg3Zi00YmU4LTQ5YWItOGNmYi02OTgzMTFhNDhjNTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDAxNTI1LCJpYXQiOjE3OTM0MDA2MjUsImp0aSI6IjExODAxYjFhLTk0M2UtNDdhOS04ZTFlLWZiZjYwNzQ0Y2QxZSIsInNpZCI6IjM0MGI3M2JiLWI2MmEtNDY0ZS04NjA4LTg5MTg4NzliOGU5NCJ9.xzEJb-nxKi3iYmSPFePE2V8MtvQYAuKa9doLFuhmBK0",
  "access_expires_at": "2026-10-30T23:05:25.019264674Z",
  "refresh_token": "p0yE8q2oejf_jsqdxFjrAUCawMcdcD8wGVj6JUjsrfo",
  "refresh_expires_at": "2026-11-29T22:50:25.01868643Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e8cfc818-5c27-4633-ae0c-737cd4596d62",
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
  "id": "cd3754d8-a8ff-4468-a68d-d786bcd0550d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T22:55:25.315625Z",
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
  "command_id": "3ed56f4e-159d-4a64-a82d-7cf2bb7d74fd",
  "quote_id": "cd3754d8-a8ff-4468-a68d-d786bcd0550d",
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
  "id": "c2ab17ea-598f-4b89-81e8-2eb1ed07dfc9",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4aa4e87f-4be8-49ab-8cfb-698311a48c59",
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
  "created_at": "2026-10-30T22:50:25.628299Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

`GET /api/rider/v1/orders/c2ab17ea-598f-4b89-81e8-2eb1ed07dfc9` → **200**

```json
{
  "id": "c2ab17ea-598f-4b89-81e8-2eb1ed07dfc9",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4aa4e87f-4be8-49ab-8cfb-698311a48c59",
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
  "created_at": "2026-10-30T22:50:25.628299Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

`GET /api/rider/v1/orders/c2ab17ea-598f-4b89-81e8-2eb1ed07dfc9` → **200**

```json
{
  "id": "c2ab17ea-598f-4b89-81e8-2eb1ed07dfc9",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4aa4e87f-4be8-49ab-8cfb-698311a48c59",
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
  "created_at": "2026-10-30T22:50:25.628299Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

`GET /api/rider/v1/orders/c2ab17ea-598f-4b89-81e8-2eb1ed07dfc9` → **200**

```json
{
  "id": "c2ab17ea-598f-4b89-81e8-2eb1ed07dfc9",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4aa4e87f-4be8-49ab-8cfb-698311a48c59",
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
  "created_at": "2026-10-30T22:50:25.628299Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

`GET /api/rider/v1/orders/c2ab17ea-598f-4b89-81e8-2eb1ed07dfc9` → **200**

```json
{
  "id": "c2ab17ea-598f-4b89-81e8-2eb1ed07dfc9",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4aa4e87f-4be8-49ab-8cfb-698311a48c59",
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
  "created_at": "2026-10-30T22:50:25.628299Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

`GET /api/rider/v1/orders/c2ab17ea-598f-4b89-81e8-2eb1ed07dfc9` → **200**

```json
{
  "id": "c2ab17ea-598f-4b89-81e8-2eb1ed07dfc9",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4aa4e87f-4be8-49ab-8cfb-698311a48c59",
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
  "created_at": "2026-10-30T22:50:25.628299Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

`GET /api/rider/v1/orders/c2ab17ea-598f-4b89-81e8-2eb1ed07dfc9` → **200**

```json
{
  "id": "c2ab17ea-598f-4b89-81e8-2eb1ed07dfc9",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4aa4e87f-4be8-49ab-8cfb-698311a48c59",
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
  "created_at": "2026-10-30T22:50:25.628299Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

`GET /api/rider/v1/orders/c2ab17ea-598f-4b89-81e8-2eb1ed07dfc9` → **200**

```json
{
  "id": "c2ab17ea-598f-4b89-81e8-2eb1ed07dfc9",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4aa4e87f-4be8-49ab-8cfb-698311a48c59",
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
  "created_at": "2026-10-30T22:50:25.628299Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

`GET /api/rider/v1/orders/c2ab17ea-598f-4b89-81e8-2eb1ed07dfc9` → **200**

```json
{
  "id": "c2ab17ea-598f-4b89-81e8-2eb1ed07dfc9",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4aa4e87f-4be8-49ab-8cfb-698311a48c59",
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
  "created_at": "2026-10-30T22:50:25.628299Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

`GET /api/rider/v1/orders/c2ab17ea-598f-4b89-81e8-2eb1ed07dfc9` → **200**

```json
{
  "id": "c2ab17ea-598f-4b89-81e8-2eb1ed07dfc9",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4aa4e87f-4be8-49ab-8cfb-698311a48c59",
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
  "created_at": "2026-10-30T22:50:25.628299Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

`GET /api/rider/v1/orders/c2ab17ea-598f-4b89-81e8-2eb1ed07dfc9` → **200**

```json
{
  "id": "c2ab17ea-598f-4b89-81e8-2eb1ed07dfc9",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4aa4e87f-4be8-49ab-8cfb-698311a48c59",
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
  "created_at": "2026-10-30T22:50:25.628299Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

`GET /api/rider/v1/orders/c2ab17ea-598f-4b89-81e8-2eb1ed07dfc9` → **200**

```json
{
  "id": "c2ab17ea-598f-4b89-81e8-2eb1ed07dfc9",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4aa4e87f-4be8-49ab-8cfb-698311a48c59",
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
  "created_at": "2026-10-30T22:50:25.628299Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

`GET /api/rider/v1/orders/c2ab17ea-598f-4b89-81e8-2eb1ed07dfc9` → **200**

```json
{
  "id": "c2ab17ea-598f-4b89-81e8-2eb1ed07dfc9",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4aa4e87f-4be8-49ab-8cfb-698311a48c59",
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
  "created_at": "2026-10-30T22:50:25.628299Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

`GET /api/rider/v1/orders/c2ab17ea-598f-4b89-81e8-2eb1ed07dfc9` → **200**

```json
{
  "id": "c2ab17ea-598f-4b89-81e8-2eb1ed07dfc9",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4aa4e87f-4be8-49ab-8cfb-698311a48c59",
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
  "created_at": "2026-10-30T22:50:25.628299Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

`GET /api/rider/v1/orders/c2ab17ea-598f-4b89-81e8-2eb1ed07dfc9` → **200**

```json
{
  "id": "c2ab17ea-598f-4b89-81e8-2eb1ed07dfc9",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4aa4e87f-4be8-49ab-8cfb-698311a48c59",
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
  "created_at": "2026-10-30T22:50:25.628299Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

`GET /api/rider/v1/orders/c2ab17ea-598f-4b89-81e8-2eb1ed07dfc9` → **200**

```json
{
  "id": "c2ab17ea-598f-4b89-81e8-2eb1ed07dfc9",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4aa4e87f-4be8-49ab-8cfb-698311a48c59",
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
  "created_at": "2026-10-30T22:50:25.628299Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

`GET /api/rider/v1/orders/c2ab17ea-598f-4b89-81e8-2eb1ed07dfc9` → **200**

```json
{
  "id": "c2ab17ea-598f-4b89-81e8-2eb1ed07dfc9",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4aa4e87f-4be8-49ab-8cfb-698311a48c59",
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
  "created_at": "2026-10-30T22:50:25.628299Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

`GET /api/rider/v1/orders/c2ab17ea-598f-4b89-81e8-2eb1ed07dfc9` → **200**

```json
{
  "id": "c2ab17ea-598f-4b89-81e8-2eb1ed07dfc9",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4aa4e87f-4be8-49ab-8cfb-698311a48c59",
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
  "created_at": "2026-10-30T22:50:25.628299Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

`GET /api/rider/v1/orders/c2ab17ea-598f-4b89-81e8-2eb1ed07dfc9` → **200**

```json
{
  "id": "c2ab17ea-598f-4b89-81e8-2eb1ed07dfc9",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4aa4e87f-4be8-49ab-8cfb-698311a48c59",
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
  "created_at": "2026-10-30T22:50:25.628299Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

`GET /api/rider/v1/orders/c2ab17ea-598f-4b89-81e8-2eb1ed07dfc9` → **200**

```json
{
  "id": "c2ab17ea-598f-4b89-81e8-2eb1ed07dfc9",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4aa4e87f-4be8-49ab-8cfb-698311a48c59",
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
  "created_at": "2026-10-30T22:50:25.628299Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

`GET /api/rider/v1/orders/c2ab17ea-598f-4b89-81e8-2eb1ed07dfc9` → **200**

```json
{
  "id": "c2ab17ea-598f-4b89-81e8-2eb1ed07dfc9",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4aa4e87f-4be8-49ab-8cfb-698311a48c59",
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
  "created_at": "2026-10-30T22:50:25.628299Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

`GET /api/rider/v1/orders/c2ab17ea-598f-4b89-81e8-2eb1ed07dfc9` → **200**

```json
{
  "id": "c2ab17ea-598f-4b89-81e8-2eb1ed07dfc9",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4aa4e87f-4be8-49ab-8cfb-698311a48c59",
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
  "created_at": "2026-10-30T22:50:25.628299Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

`GET /api/rider/v1/orders/c2ab17ea-598f-4b89-81e8-2eb1ed07dfc9` → **200**

```json
{
  "id": "c2ab17ea-598f-4b89-81e8-2eb1ed07dfc9",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4aa4e87f-4be8-49ab-8cfb-698311a48c59",
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
  "created_at": "2026-10-30T22:50:25.628299Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

`GET /api/rider/v1/orders/c2ab17ea-598f-4b89-81e8-2eb1ed07dfc9` → **200**

```json
{
  "id": "c2ab17ea-598f-4b89-81e8-2eb1ed07dfc9",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4aa4e87f-4be8-49ab-8cfb-698311a48c59",
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
  "created_at": "2026-10-30T22:50:25.628299Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

`GET /api/rider/v1/orders/c2ab17ea-598f-4b89-81e8-2eb1ed07dfc9` → **200**

```json
{
  "id": "c2ab17ea-598f-4b89-81e8-2eb1ed07dfc9",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4aa4e87f-4be8-49ab-8cfb-698311a48c59",
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
  "created_at": "2026-10-30T22:50:25.628299Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

`GET /api/rider/v1/orders/c2ab17ea-598f-4b89-81e8-2eb1ed07dfc9` → **200**

```json
{
  "id": "c2ab17ea-598f-4b89-81e8-2eb1ed07dfc9",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4aa4e87f-4be8-49ab-8cfb-698311a48c59",
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
  "created_at": "2026-10-30T22:50:25.628299Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

`GET /api/rider/v1/orders/c2ab17ea-598f-4b89-81e8-2eb1ed07dfc9` → **200**

```json
{
  "id": "c2ab17ea-598f-4b89-81e8-2eb1ed07dfc9",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4aa4e87f-4be8-49ab-8cfb-698311a48c59",
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
  "created_at": "2026-10-30T22:50:25.628299Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

`GET /api/rider/v1/orders/c2ab17ea-598f-4b89-81e8-2eb1ed07dfc9` → **200**

```json
{
  "id": "c2ab17ea-598f-4b89-81e8-2eb1ed07dfc9",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4aa4e87f-4be8-49ab-8cfb-698311a48c59",
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
  "created_at": "2026-10-30T22:50:25.628299Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

`GET /api/rider/v1/orders/c2ab17ea-598f-4b89-81e8-2eb1ed07dfc9` → **200**

```json
{
  "id": "c2ab17ea-598f-4b89-81e8-2eb1ed07dfc9",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4aa4e87f-4be8-49ab-8cfb-698311a48c59",
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
  "created_at": "2026-10-30T22:50:25.628299Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

`GET /api/rider/v1/orders/c2ab17ea-598f-4b89-81e8-2eb1ed07dfc9` → **200**

```json
{
  "id": "c2ab17ea-598f-4b89-81e8-2eb1ed07dfc9",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4aa4e87f-4be8-49ab-8cfb-698311a48c59",
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
  "created_at": "2026-10-30T22:50:25.628299Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

`GET /api/rider/v1/orders/c2ab17ea-598f-4b89-81e8-2eb1ed07dfc9` → **200**

```json
{
  "id": "c2ab17ea-598f-4b89-81e8-2eb1ed07dfc9",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4aa4e87f-4be8-49ab-8cfb-698311a48c59",
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
  "created_at": "2026-10-30T22:50:25.628299Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

`GET /api/rider/v1/orders/c2ab17ea-598f-4b89-81e8-2eb1ed07dfc9` → **200**

```json
{
  "id": "c2ab17ea-598f-4b89-81e8-2eb1ed07dfc9",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4aa4e87f-4be8-49ab-8cfb-698311a48c59",
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
  "created_at": "2026-10-30T22:50:25.628299Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

`GET /api/rider/v1/orders/c2ab17ea-598f-4b89-81e8-2eb1ed07dfc9` → **200**

```json
{
  "id": "c2ab17ea-598f-4b89-81e8-2eb1ed07dfc9",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4aa4e87f-4be8-49ab-8cfb-698311a48c59",
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
  "created_at": "2026-10-30T22:50:25.628299Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

`GET /api/rider/v1/orders/c2ab17ea-598f-4b89-81e8-2eb1ed07dfc9` → **200**

```json
{
  "id": "c2ab17ea-598f-4b89-81e8-2eb1ed07dfc9",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4aa4e87f-4be8-49ab-8cfb-698311a48c59",
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
  "created_at": "2026-10-30T22:50:25.628299Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

`GET /api/rider/v1/orders/c2ab17ea-598f-4b89-81e8-2eb1ed07dfc9` → **200**

```json
{
  "id": "c2ab17ea-598f-4b89-81e8-2eb1ed07dfc9",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4aa4e87f-4be8-49ab-8cfb-698311a48c59",
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
  "created_at": "2026-10-30T22:50:25.628299Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

`GET /api/rider/v1/orders/c2ab17ea-598f-4b89-81e8-2eb1ed07dfc9` → **200**

```json
{
  "id": "c2ab17ea-598f-4b89-81e8-2eb1ed07dfc9",
  "short_number": 38,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "4aa4e87f-4be8-49ab-8cfb-698311a48c59",
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
  "search_phase": "EXHAUSTED",
  "assignment": null,
  "created_at": "2026-10-30T22:50:25.628299Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

## All eight metrics are non-zero, with closed labels and no ids/phones
Metric validator: good scrape accepted; missing, unknown, id/phone, extra, zero and NaN rejected
{
  "blizz_orders_total": 38,
  "blizz_orders_cancelled_total": 23,
  "blizz_orders_unfulfilled_total": 1,
  "blizz_dispatch_first_offer_seconds_count": 25,
  "blizz_dispatch_assigned_seconds_count": 23,
  "blizz_offers_total": 28,
  "blizz_dispatch_excluded_total": 18,
  "blizz_sms_sent_total": 91
}

```prometheus
blizz_dispatch_assigned_seconds_count{application="blizz-taxi-server",source="BROADCAST"} 1
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="BROADCAST"} 11.984145226
blizz_dispatch_assigned_seconds_count{application="blizz-taxi-server",source="OFFER"} 22
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="OFFER"} 24.173000205
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="BROADCAST"} 0.0
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="OFFER"} 0.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="ALREADY_OFFERED"} 2.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="BUSY"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="CITY_NOT_ADMITTED"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PAUSED"} 4.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PAYMENT"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PREVIOUS_DRIVER"} 2.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="STALE_LOCATION"} 6.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="TOO_FAR"} 1.0
blizz_dispatch_first_offer_seconds_count{application="blizz-taxi-server"} 25
blizz_dispatch_first_offer_seconds_sum{application="blizz-taxi-server"} 0.572794303
blizz_dispatch_first_offer_seconds_max{application="blizz-taxi-server"} 0.0
blizz_offers_total{application="blizz-taxi-server",outcome="ACCEPTED"} 22.0
blizz_offers_total{application="blizz-taxi-server",outcome="DECLINED"} 2.0
blizz_offers_total{application="blizz-taxi-server",outcome="REVOKED"} 4.0
blizz_orders_total{application="blizz-taxi-server",channel="APP",preorder="false"} 30.0
blizz_orders_total{application="blizz-taxi-server",channel="APP",preorder="true"} 2.0
blizz_orders_total{application="blizz-taxi-server",channel="PHONE",preorder="false"} 6.0
blizz_orders_cancelled_total{application="blizz-taxi-server",by="DRIVER",reason="PASSENGER_ASKED"} 2.0
blizz_orders_cancelled_total{application="blizz-taxi-server",by="RIDER",reason="CHANGED_MIND"} 7.0
blizz_orders_cancelled_total{application="blizz-taxi-server",by="RIDER",reason="WAIT_TOO_LONG"} 1.0
blizz_orders_cancelled_total{application="blizz-taxi-server",by="STAFF",reason="NO_CARS"} 11.0
blizz_orders_cancelled_total{application="blizz-taxi-server",by="STAFF",reason="OTHER"} 2.0
blizz_orders_unfulfilled_total{application="blizz-taxi-server"} 1.0
blizz_sms_sent_total{application="blizz-taxi-server",purpose="CALLER",state="SENT"} 6.0
blizz_sms_sent_total{application="blizz-taxi-server",purpose="OTP",state="FAILED"} 1.0
blizz_sms_sent_total{application="blizz-taxi-server",purpose="OTP",state="SENT"} 84.0
```

Done: real no-car deadline, non-zero counters/timers and bounded labels on the management port.

`GET /api/rider/v1/orders/c2ab17ea-598f-4b89-81e8-2eb1ed07dfc9` → **200**

```json
{
  "id": "c2ab17ea-598f-4b89-81e8-2eb1ed07dfc9",
  "short_number": 38,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "4aa4e87f-4be8-49ab-8cfb-698311a48c59",
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
  "search_phase": "EXHAUSTED",
  "assignment": null,
  "created_at": "2026-10-30T22:50:25.628299Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

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
  "session_id": "a8ff32cb-9a0d-4c67-b9fc-6b671f247c86",
  "subject": {
    "type": "STAFF",
    "id": "09fe1c69-c031-458c-a537-a40fa884b9ac"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwOWZlMWM2OS1jMDMxLTQ1OGMtYTUzNy1hNDBmYTg4NGI5YWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDE3MDcsImlhdCI6MTc5MzQwMDgwNywianRpIjoiZTQyNjg0ZmMtYzI0Mi00MjVjLWJkYzQtZTA2ZTBmNTc0NjEzIiwic2lkIjoiYThmZjMyY2ItOWEwZC00YzY3LWI5ZmMtNmI2NzFmMjQ3Yzg2In0.I3-lxj6hpsyg6qrv9FP20Bszc261BYJ2fQDRK2Tk2HU",
  "access_expires_at": "2026-10-30T23:08:27.856066166Z",
  "refresh_token": "mKcNFXWz3jNwSV9yyd7g37cRhb3puMkmkHXExYKTDUE",
  "refresh_expires_at": "2026-10-31T10:53:27.855253515Z",
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
  "id": "86fc390d-81eb-4017-9b96-9a63c5570146",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T22:53:28.165089Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T22:53:28.165134Z",
  "updated_at": "2026-10-30T22:53:28.185901Z",
  "finished_at": "2026-10-30T22:53:28.185901Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/86fc390d-81eb-4017-9b96-9a63c5570146` → **200**

```json
{
  "run": {
    "id": "86fc390d-81eb-4017-9b96-9a63c5570146",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T22:53:28.165089Z",
    "partial": true,
    "state": "CLEAN",
    "local_count": 10,
    "provider_count": 10,
    "item_count": 0,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T22:53:28.165134Z",
    "updated_at": "2026-10-30T22:53:28.185901Z",
    "finished_at": "2026-10-30T22:53:28.185901Z",
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
  "id": "86fc390d-81eb-4017-9b96-9a63c5570146",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T22:53:28.165089Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T22:53:28.165134Z",
  "updated_at": "2026-10-30T22:53:28.185901Z",
  "finished_at": "2026-10-30T22:53:28.185901Z",
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
  "id": "86fc390d-81eb-4017-9b96-9a63c5570146",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T22:53:28.165089Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T22:53:28.165134Z",
  "updated_at": "2026-10-30T22:53:28.185901Z",
  "finished_at": "2026-10-30T22:53:28.185901Z",
  "version": 1
}
```

## One independent bank transaction produces one missing-local item on another merchant's first snapshot

`POST /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/5978589d-6e6e-4744-aac4-0a208727a1f9` → **204**

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
  "id": "b99c0762-f8f0-4901-868e-6888e6e3cfb5",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T22:53:28.625032Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T22:53:28.625055Z",
  "updated_at": "2026-10-30T22:53:28.633194Z",
  "finished_at": "2026-10-30T22:53:28.633194Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/b99c0762-f8f0-4901-868e-6888e6e3cfb5` → **200**

```json
{
  "run": {
    "id": "b99c0762-f8f0-4901-868e-6888e6e3cfb5",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T22:53:28.625032Z",
    "partial": true,
    "state": "OPEN",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 1,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T22:53:28.625055Z",
    "updated_at": "2026-10-30T22:53:28.633194Z",
    "finished_at": "2026-10-30T22:53:28.633194Z",
    "version": 1
  },
  "items": [
    {
      "id": "71e667cb-0c47-4086-8ca7-3494814576cf",
      "run_id": "b99c0762-f8f0-4901-868e-6888e6e3cfb5",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "ad2d5e58daa3a5431fab4d29dc1ad4975ec559b191eaa2eb06b07f209cb794ef",
      "reference_display": "sandbox-reconciliation-#####d-6e6e-4744-aac4-0a#####a1f9",
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
      "provider_at": "2026-10-30T22:53:28Z",
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
  "id": "b99c0762-f8f0-4901-868e-6888e6e3cfb5",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T22:53:28.625032Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T22:53:28.625055Z",
  "updated_at": "2026-10-30T22:53:28.633194Z",
  "finished_at": "2026-10-30T22:53:28.633194Z",
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
  "id": "b99c0762-f8f0-4901-868e-6888e6e3cfb5",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T22:53:28.625032Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T22:53:28.625055Z",
  "updated_at": "2026-10-30T22:53:28.633194Z",
  "finished_at": "2026-10-30T22:53:28.633194Z",
  "version": 1
}
```

## The admin explains the item once; a replay is the same result and a different decision conflicts

`POST /api/admin/v1/payment-reconciliations/items/71e667cb-0c47-4086-8ca7-3494814576cf/resolve` → **200**

```json
{
  "command_id": "4517c27f-63d0-4f98-8adf-add6a8c3a49a",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "71e667cb-0c47-4086-8ca7-3494814576cf",
  "run_id": "b99c0762-f8f0-4901-868e-6888e6e3cfb5",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "ad2d5e58daa3a5431fab4d29dc1ad4975ec559b191eaa2eb06b07f209cb794ef",
  "reference_display": "sandbox-reconciliation-#####d-6e6e-4744-aac4-0a#####a1f9",
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
  "provider_at": "2026-10-30T22:53:28Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "09fe1c69-c031-458c-a537-a40fa884b9ac",
  "resolved_at": "2026-10-30T22:53:29.056362Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/71e667cb-0c47-4086-8ca7-3494814576cf/resolve` → **200**

```json
{
  "command_id": "4517c27f-63d0-4f98-8adf-add6a8c3a49a",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "71e667cb-0c47-4086-8ca7-3494814576cf",
  "run_id": "b99c0762-f8f0-4901-868e-6888e6e3cfb5",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "ad2d5e58daa3a5431fab4d29dc1ad4975ec559b191eaa2eb06b07f209cb794ef",
  "reference_display": "sandbox-reconciliation-#####d-6e6e-4744-aac4-0a#####a1f9",
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
  "provider_at": "2026-10-30T22:53:28Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "09fe1c69-c031-458c-a537-a40fa884b9ac",
  "resolved_at": "2026-10-30T22:53:29.056362Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/71e667cb-0c47-4086-8ca7-3494814576cf/resolve` → **409**

```json
{
  "command_id": "be0b4a0b-b7da-4bf0-9361-28cd9a0a2d5d",
  "expected_version": 1,
  "decision": "ESCALATED",
  "reason": "A conflicting second decision"
}
```

```json
{
  "instance": "/api/admin/v1/payment-reconciliations/items/71e667cb-0c47-4086-8ca7-3494814576cf/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "175fb22e-e7db-4410-827d-ff6487e27865"
}
```

`GET /api/admin/v1/payment-reconciliations/b99c0762-f8f0-4901-868e-6888e6e3cfb5` → **200**

```json
{
  "run": {
    "id": "b99c0762-f8f0-4901-868e-6888e6e3cfb5",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T22:53:28.625032Z",
    "partial": true,
    "state": "RESOLVED",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T22:53:28.625055Z",
    "updated_at": "2026-10-30T22:53:29.056362Z",
    "finished_at": "2026-10-30T22:53:28.633194Z",
    "version": 2
  },
  "items": [
    {
      "id": "71e667cb-0c47-4086-8ca7-3494814576cf",
      "run_id": "b99c0762-f8f0-4901-868e-6888e6e3cfb5",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "ad2d5e58daa3a5431fab4d29dc1ad4975ec559b191eaa2eb06b07f209cb794ef",
      "reference_display": "sandbox-reconciliation-#####d-6e6e-4744-aac4-0a#####a1f9",
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
      "provider_at": "2026-10-30T22:53:28Z",
      "state": "RESOLVED",
      "decision": "EXPLAINED",
      "reason": "Independent sandbox bank fixture; no real money moved",
      "resolved_by": "09fe1c69-c031-458c-a537-a40fa884b9ac",
      "resolved_at": "2026-10-30T22:53:29.056362Z",
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
      "id": "b99c0762-f8f0-4901-868e-6888e6e3cfb5",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-30",
      "period_from": "2026-10-29T22:00:00Z",
      "period_to": "2026-10-31T02:00:00Z",
      "observed_until": "2026-10-30T22:53:28.625032Z",
      "partial": true,
      "state": "RESOLVED",
      "local_count": 0,
      "provider_count": 1,
      "item_count": 1,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-30T22:53:28.625055Z",
      "updated_at": "2026-10-30T22:53:29.056362Z",
      "finished_at": "2026-10-30T22:53:28.633194Z",
      "version": 2
    },
    {
      "id": "5e5e70e9-8984-42f8-a1da-519fa87d2e10",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-29",
      "period_from": "2026-10-28T22:00:00Z",
      "period_to": "2026-10-30T02:00:00Z",
      "observed_until": "2026-10-30T22:30:17.888065Z",
      "partial": false,
      "state": "CLEAN",
      "local_count": 0,
      "provider_count": 0,
      "item_count": 0,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-30T22:30:17.888158Z",
      "updated_at": "2026-10-30T22:30:17.894717Z",
      "finished_at": "2026-10-30T22:30:17.894717Z",
      "version": 1
    }
  ],
  "next_cursor": null
}
```

`DELETE /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/5978589d-6e6e-4744-aac4-0a208727a1f9` → **204**

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30"
}
```

```json
{
  "id": "b99c0762-f8f0-4901-868e-6888e6e3cfb5",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T22:53:28.625032Z",
  "partial": true,
  "state": "RESOLVED",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T22:53:28.625055Z",
  "updated_at": "2026-10-30T22:53:29.056362Z",
  "finished_at": "2026-10-30T22:53:28.633194Z",
  "version": 2
}
```

Done: clean card snapshot, one bank-only difference, three identical runs, audited decision/replay/conflict, bank fixture restored.

# Scenario: zzz-invariants

## Five invariant checks are clean after all scenario transactions settle

```prometheus
blizz_invariant_last_success{application="blizz-taxi-server",check="I1"} 1.793400933343E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I2"} 1.79340093386E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I3"} 1.79340093386E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I4"} 1.793400933343E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I5"} 1.793400933861E9
blizz_invariant_violations{application="blizz-taxi-server",check="I1"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I2"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I3"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I4"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I5"} 0.0
```

Done: five fresh zero invariant gauges after the settling margin.
