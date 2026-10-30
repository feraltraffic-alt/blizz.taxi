# Sandbox transcript (2026-10-30T19:25:04Z, 83c0c7b)

# Scenario: admission-cities

## Only Andrii is online in Kyiv for this scenario

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-30133"
}
```

```json
{
  "challenge_id": "82397b8a-385d-4c65-aadc-d5ce937f6088",
  "expires_at": "2026-10-30T19:30:04.742628328Z",
  "resend_available_at": "2026-10-30T19:25:05.742628328Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "200604",
  "sent_at": "2026-10-30T19:25:04.762452Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "82397b8a-385d-4c65-aadc-d5ce937f6088",
  "code": "200604",
  "device_ref": "sandbox-30133"
}
```

```json
{
  "session_id": "67257484-737b-4332-a8a7-09b8719eeb40",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4OTIxMywiaWF0IjoxNzkzMzg4MzEzLCJqdGkiOiI0ZjcwMWQ2My1lMWQxLTQzYjItYWM5YS0wYTkwYTAwNDZlMjAiLCJzaWQiOiI2NzI1NzQ4NC03MzdiLTQzMzItYThhNy0wOWI4NzE5ZWViNDAifQ.7i0y-c8qHkfBnl4dYUVN8zYUzAsADZO64SexyVccbBU",
  "access_expires_at": "2026-10-30T19:40:13.081252996Z",
  "refresh_token": "rXQVcv9Zo1-tIM4eGd8uto_7_eGiXWTqvu1W5fDyxmo",
  "refresh_expires_at": "2026-11-29T19:25:13.079028489Z",
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
  "device_ref": "sandbox-2088"
}
```

```json
{
  "challenge_id": "0264347c-0eae-4e8a-ad67-1b43c0a37ffb",
  "expires_at": "2026-10-30T19:30:13.762361608Z",
  "resend_available_at": "2026-10-30T19:25:14.762361608Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "725650",
  "sent_at": "2026-10-30T19:25:13.768862953Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0264347c-0eae-4e8a-ad67-1b43c0a37ffb",
  "code": "725650",
  "device_ref": "sandbox-2088"
}
```

```json
{
  "session_id": "e41651e7-582c-494e-a940-7e138bb9642c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4OTIxNCwiaWF0IjoxNzkzMzg4MzE0LCJqdGkiOiI2NTlhNjAwNi02OTA5LTQ1MzAtOGYwZC1lMDYwOTU2NDcwMjkiLCJzaWQiOiJlNDE2NTFlNy01ODJjLTQ5NGUtYTk0MC03ZTEzOGJiOTY0MmMifQ.dXDQPujbWKW5S0Q1oTR6N3YB4nHwYq09NOk3MCtq6RQ",
  "access_expires_at": "2026-10-30T19:40:14.089124092Z",
  "refresh_token": "p4lMcvQJthdHMZpKs44MzLwwYECtin2H6sV0dUyWTHA",
  "refresh_expires_at": "2026-11-29T19:25:14.088002459Z",
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
  "correlation_id": "40f3a34f-b5a6-416d-9de6-768bb90a5fc8"
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
  "session_id": "9640da0c-7bc3-49f4-9077-70107a72f08b",
  "subject": {
    "type": "STAFF",
    "id": "bbeb0bd1-546e-4687-8aa4-9df00ff27005"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYmViMGJkMS01NDZlLTQ2ODctOGFhNC05ZGYwMGZmMjcwMDUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODkyMTUsImlhdCI6MTc5MzM4ODMxNSwianRpIjoiMmIxNTEzZmYtYWQ0Yy00NWIxLWJjYTUtZjViNDE4OWIyZjQxIiwic2lkIjoiOTY0MGRhMGMtN2JjMy00OWY0LTkwNzctNzAxMDdhNzJmMDhiIn0.QJ3Dz8KnIFFaEVXcUQN4OyvnRN2rzRxMYXn6lva4fgg",
  "access_expires_at": "2026-10-30T19:40:15.586120605Z",
  "refresh_token": "SkMEkiUp3YV8M-RcRaZUlk07uzSYchW26T5v5-kocaQ",
  "refresh_expires_at": "2026-10-31T07:25:15.584952397Z",
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
  "session_id": "0d0770dc-2481-4510-a134-72677f90d654",
  "subject": {
    "type": "STAFF",
    "id": "bbeb0bd1-546e-4687-8aa4-9df00ff27005"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYmViMGJkMS01NDZlLTQ2ODctOGFhNC05ZGYwMGZmMjcwMDUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODkyMTcsImlhdCI6MTc5MzM4ODMxNywianRpIjoiODMyNGQ5YzEtOGVmZS00N2QxLThmYzEtZTZjM2ZiYTZiODU4Iiwic2lkIjoiMGQwNzcwZGMtMjQ4MS00NTEwLWExMzQtNzI2NzdmOTBkNjU0In0.jRvsB2RiuC2PbCxTaVyfplvSlB_LUiaJJ4g-tDHh65w",
  "access_expires_at": "2026-10-30T19:40:17.394982203Z",
  "refresh_token": "4CbFZBVq-OqlWNm_v4CfL7hw1-cZYrEfsqFD4UuN5gI",
  "refresh_expires_at": "2026-10-31T07:25:17.394026671Z",
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
  "session_id": "e33d331e-3cc1-4f1d-9fbb-7b32202506d8",
  "subject": {
    "type": "STAFF",
    "id": "bbeb0bd1-546e-4687-8aa4-9df00ff27005"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYmViMGJkMS01NDZlLTQ2ODctOGFhNC05ZGYwMGZmMjcwMDUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODkyMTcsImlhdCI6MTc5MzM4ODMxNywianRpIjoiOTMyYWI1N2EtZDlhZi00YTM5LTg5OGEtYzEyZDZmNWRkNzlmIiwic2lkIjoiZTMzZDMzMWUtM2NjMS00ZjFkLTlmYmItN2IzMjIwMjUwNmQ4In0.TkLJJmBs9msZhAyqSwHPK_quGO_SlLDip0jUjFqKuug",
  "access_expires_at": "2026-10-30T19:40:17.98420078Z",
  "refresh_token": "p2NgRZOD56LlXmuS2aRsdARk_CdS4ky_IgiZHM-PQ9I",
  "refresh_expires_at": "2026-10-31T07:25:17.983136365Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-28859"
}
```

```json
{
  "challenge_id": "6ffa87c3-01e9-4960-82d8-555283345e9d",
  "expires_at": "2026-10-30T19:30:18.274516687Z",
  "resend_available_at": "2026-10-30T19:25:19.274516687Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "402518",
  "sent_at": "2026-10-30T19:25:18.279560283Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6ffa87c3-01e9-4960-82d8-555283345e9d",
  "code": "402518",
  "device_ref": "sandbox-28859"
}
```

```json
{
  "session_id": "27f95fd7-4d99-4604-a61e-cb66833cd55e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4OTIxOCwiaWF0IjoxNzkzMzg4MzE4LCJqdGkiOiIzZDNmMWE1Zi02YWU5LTQ1MDMtYTE3Ni02Yjc1NzU2M2UxYzQiLCJzaWQiOiIyN2Y5NWZkNy00ZDk5LTQ2MDQtYTYxZS1jYjY2ODMzY2Q1NWUifQ.YQtdHbqLfeIa2oGihm7LIl1d6swl475Y2bdgdlC_X80",
  "access_expires_at": "2026-10-30T19:40:18.607951643Z",
  "refresh_token": "fhPepvJsZUknpkqTcetBDPWsbbsj2HfNl4lUNbRrCDw",
  "refresh_expires_at": "2026-11-29T19:25:18.607065019Z",
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
  "command_id": "b4ba1b3d-c999-4ac3-bbf7-c33a99dc8eeb",
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
  "command_id": "fbad404a-fc54-40d0-a61b-c9e36202d373",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4528,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:25:19Z",
    "sequence": 1793388319874
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
  "correlation_id": "f33afc8e-8583-453f-80ba-58bbe165647e"
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
  "command_id": "fec08de4-1590-4369-bf44-c63453b21ebe",
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
  "command_id": "bfa4ec15-af6c-465b-a3a7-589f75eed16f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4528,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:25:21Z",
    "sequence": 1793388321188
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "a266d72c-59b8-400c-aa09-ee3647b3689e",
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
  "last_heartbeat_at": "2026-10-30T19:25:21.210943Z",
  "last_location_at": "2026-10-30T19:25:21.210943Z",
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
  "command_id": "d920223f-f837-481f-b7f4-91a5cb7e882a",
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
  "session_id": "a266d72c-59b8-400c-aa09-ee3647b3689e",
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
  "last_heartbeat_at": "2026-10-30T19:25:21.210943Z",
  "last_location_at": "2026-10-30T19:25:21.210943Z",
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
  "phone": "+380688142951",
  "device_ref": "sandbox-6782"
}
```

```json
{
  "challenge_id": "69dbe470-0ba4-4433-b567-0650eb94cf4e",
  "expires_at": "2026-10-30T19:30:22.461701602Z",
  "resend_available_at": "2026-10-30T19:25:23.461701602Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380688142951` → **200**

```json
{
  "phone": "+380688142951",
  "audience": "CLIENT",
  "code": "784051",
  "sent_at": "2026-10-30T19:25:22.466109503Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "69dbe470-0ba4-4433-b567-0650eb94cf4e",
  "code": "784051",
  "device_ref": "sandbox-6782"
}
```

```json
{
  "session_id": "e5bb18d4-9a52-43bf-a3c9-a78c2bffec5a",
  "subject": {
    "type": "CLIENT",
    "id": "54dcd07c-27fa-43ee-8281-3c14d6d5fd65"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NGRjZDA3Yy0yN2ZhLTQzZWUtODI4MS0zYzE0ZDZkNWZkNjUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzg5MjIyLCJpYXQiOjE3OTMzODgzMjIsImp0aSI6ImQxZGM3YWQ2LWFmZmMtNGEzMS1hYjgzLTg0NWY2MzQxN2EwMyIsInNpZCI6ImU1YmIxOGQ0LTlhNTItNDNiZi1hM2M5LWE3OGMyYmZmZWM1YSJ9.e5J5VjOYZPNtl80SxjvqMfqI30L_5p3qXm2rbfc62k8",
  "access_expires_at": "2026-10-30T19:40:22.780277855Z",
  "refresh_token": "Ib7OuSqNXPVUSL8aUD7EJGkRvvz8IEAamxAwygKsHyc",
  "refresh_expires_at": "2026-11-29T19:25:22.779587924Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "4012a23a-40e3-496e-b1c9-c7b3d9322083",
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
  "id": "55208d89-61ee-4759-bc51-78ab8e8f51a8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T19:30:23.093737Z",
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
  "command_id": "369bda85-446d-4bfc-882e-bce8eff00e4c",
  "quote_id": "55208d89-61ee-4759-bc51-78ab8e8f51a8",
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
  "id": "1d498312-90ad-43ae-a718-8115f4e8692e",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "54dcd07c-27fa-43ee-8281-3c14d6d5fd65",
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
  "created_at": "2026-10-30T19:25:23.513514Z",
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

`POST /api/driver/v1/orders/1d498312-90ad-43ae-a718-8115f4e8692e/claim` → **409**

```json
{
  "command_id": "009cab7a-5330-468d-9bc8-cf594911b127"
}
```

```json
{
  "instance": "/api/driver/v1/orders/1d498312-90ad-43ae-a718-8115f4e8692e/claim",
  "status": 409,
  "title": "Driver not eligible",
  "type": "https://errors.blizz.taxi/driver-not-eligible",
  "code": "DRIVER_NOT_ELIGIBLE",
  "correlation_id": "af6de579-39a5-4400-bb9b-b4b81967aba8"
}
```

`GET /api/operator/v1/orders/1d498312-90ad-43ae-a718-8115f4e8692e/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T19:25:23.516402Z",
      "actor": {
        "type": "CLIENT",
        "id": "54dcd07c-27fa-43ee-8281-3c14d6d5fd65",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "1d498312-90ad-43ae-a718-8115f4e8692e",
        "quote_id": "55208d89-61ee-4759-bc51-78ab8e8f51a8",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "80363b27-9157-4b42-a11b-eb448e7bfc84"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T19:25:23.522623Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "1d498312-90ad-43ae-a718-8115f4e8692e",
        "attempt_id": "d95525ec-6767-433b-9922-265a28faaded",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "80363b27-9157-4b42-a11b-eb448e7bfc84"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-30T19:25:23.584821Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "1d498312-90ad-43ae-a718-8115f4e8692e",
        "attempt_id": "d95525ec-6767-433b-9922-265a28faaded"
      },
      "correlation_id": "80363b27-9157-4b42-a11b-eb448e7bfc84"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "d95525ec-6767-433b-9922-265a28faaded",
        "generation": 1,
        "started_at": "2026-10-30T19:25:23.520063Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-30T19:25:23.584821Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-30T19:25:23.524731Z",
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
  "command_id": "77195313-5bc2-4023-98ea-1c7cbbdb9c91",
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

`POST /api/driver/v1/work-sessions/a266d72c-59b8-400c-aa09-ee3647b3689e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4528,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:25:25Z",
    "sequence": 1793388325776
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "a266d72c-59b8-400c-aa09-ee3647b3689e",
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
  "last_heartbeat_at": "2026-10-30T19:25:25.803965Z",
  "last_location_at": "2026-10-30T19:25:25.803965Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000001/zones` → **201**

```json
{
  "command_id": "8b0b2513-22ac-4831-9ecf-41251e52affa",
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
  "id": "46567770-12ec-4f35-9072-e182b0829c7e",
  "state": "DRAFT",
  "version": 0
}
```

`POST /api/admin/v1/zones/46567770-12ec-4f35-9072-e182b0829c7e/publish` → **200**

```json
{
  "command_id": "951fb9d7-30cf-4535-97d8-0f18bb5bac7d",
  "expected_version": 0,
  "reason": "Sandbox"
}
```

```json
{
  "id": "46567770-12ec-4f35-9072-e182b0829c7e",
  "state": "PUBLISHED",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000001/zones` → **201**

```json
{
  "command_id": "5d34dc2f-fa40-478a-9990-e5e18fa69069",
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
  "id": "25f15d1e-95a1-4ce3-9394-fc993e817fc6",
  "state": "DRAFT",
  "version": 0
}
```

`POST /api/admin/v1/zones/25f15d1e-95a1-4ce3-9394-fc993e817fc6/publish` → **200**

```json
{
  "command_id": "29006c46-d3de-43ad-8883-9fb246e02fb7",
  "expected_version": 0,
  "reason": "Sandbox"
}
```

```json
{
  "id": "25f15d1e-95a1-4ce3-9394-fc993e817fc6",
  "state": "PUBLISHED",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/zones` → **201**

```json
{
  "command_id": "8fcaa79b-789d-4f68-b2d9-986e74d5194b",
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
  "id": "7a61c317-246d-43e4-a00a-95b315b76b73",
  "state": "DRAFT",
  "version": 0
}
```

`POST /api/admin/v1/zones/7a61c317-246d-43e4-a00a-95b315b76b73/publish` → **200**

```json
{
  "command_id": "f95bbded-ab2e-4487-afff-6b1e10acd445",
  "expected_version": 0,
  "reason": "Sandbox"
}
```

```json
{
  "id": "7a61c317-246d-43e4-a00a-95b315b76b73",
  "state": "PUBLISHED",
  "version": 1
}
```

`GET /api/driver/v1/broadcast-orders?zone_id=46567770-12ec-4f35-9072-e182b0829c7e` → **200**

```json
[
  {
    "order_id": "1d498312-90ad-43ae-a718-8115f4e8692e",
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

`GET /api/driver/v1/broadcast-orders?zone_id=25f15d1e-95a1-4ce3-9394-fc993e817fc6` → **200**

```json
[]
```

`GET /api/driver/v1/broadcast-orders?zone_id=7a61c317-246d-43e4-a00a-95b315b76b73` → **400**

```json
{
  "instance": "/api/driver/v1/broadcast-orders",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "aaf077b7-50ca-4b69-b163-5f8ea91059c1"
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
  "command_id": "35ab43ee-1f8f-44b5-8b55-b1aaa6737cef",
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

`GET /api/operator/v1/orders/1d498312-90ad-43ae-a718-8115f4e8692e` → **200**

```json
{
  "id": "1d498312-90ad-43ae-a718-8115f4e8692e",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "54dcd07c-27fa-43ee-8281-3c14d6d5fd65",
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
  "created_at": "2026-10-30T19:25:23.513514Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/1d498312-90ad-43ae-a718-8115f4e8692e/cancel` → **200**

```json
{
  "command_id": "9cfd9af7-b3d1-4d0e-bbf2-5cbe050294b4",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "1d498312-90ad-43ae-a718-8115f4e8692e",
  "short_number": 1,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "54dcd07c-27fa-43ee-8281-3c14d6d5fd65",
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
  "created_at": "2026-10-30T19:25:23.513514Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "uk": "Немає вільних авто",
      "pl": "Brak wolnych aut",
      "ru": "Нет свободных машин",
      "en": "No cars available"
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
  "session_id": "a266d72c-59b8-400c-aa09-ee3647b3689e",
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
  "last_heartbeat_at": "2026-10-30T19:25:25.803965Z",
  "last_location_at": "2026-10-30T19:25:25.803965Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a266d72c-59b8-400c-aa09-ee3647b3689e/close` → **200**

```json
{
  "command_id": "937c692b-53ee-447e-8016-eb3168a867fc",
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
  "session_id": "87696619-819e-46bf-8d8e-48968e2890ff",
  "subject": {
    "type": "STAFF",
    "id": "bbeb0bd1-546e-4687-8aa4-9df00ff27005"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYmViMGJkMS01NDZlLTQ2ODctOGFhNC05ZGYwMGZmMjcwMDUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODkyMzEsImlhdCI6MTc5MzM4ODMzMSwianRpIjoiODRmZDY3NWUtNzljYy00ZmE4LWIzYTEtZjViYWJkNTYyNGNhIiwic2lkIjoiODc2OTY2MTktODE5ZS00NmJmLThkOGUtNDg5NjhlMjg5MGZmIn0.ST0Cs1sS_HshNee5nykP2W-3_8-8-CFWuFhlrBnEmQk",
  "access_expires_at": "2026-10-30T19:40:31.065974004Z",
  "refresh_token": "MilgAEbXwvPLQ3tMqMl4hasDkeqhNmAxpru0x8eDtI8",
  "refresh_expires_at": "2026-10-31T07:25:31.065264851Z",
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
  "device_ref": "sandbox-21978"
}
```

```json
{
  "challenge_id": "be01de84-88a3-4ed9-a16e-7dd62e424c42",
  "expires_at": "2026-10-30T19:30:31.68372078Z",
  "resend_available_at": "2026-10-30T19:25:32.68372078Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "243655",
  "sent_at": "2026-10-30T19:25:31.688604419Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "be01de84-88a3-4ed9-a16e-7dd62e424c42",
  "code": "243655",
  "device_ref": "sandbox-21978"
}
```

```json
{
  "session_id": "796d16b4-767b-4c00-ae5b-d469b94b5a9c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4OTIzMiwiaWF0IjoxNzkzMzg4MzMyLCJqdGkiOiJjN2ExN2IzNS05NDA4LTQxMGUtYmVhOS1hNzNlMjJjNTg0OGUiLCJzaWQiOiI3OTZkMTZiNC03NjdiLTRjMDAtYWU1Yi1kNDY5Yjk0YjVhOWMifQ.Vz-I0cr_3kvkuKcp-2DQYhylcRoz4BFX2Aiswc41h3M",
  "access_expires_at": "2026-10-30T19:40:32.024879743Z",
  "refresh_token": "pUDCgh_pLWK_BFi3GC5ydnxb6y8p581GtMlntR4i4Jc",
  "refresh_expires_at": "2026-11-29T19:25:32.024196929Z",
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
  "command_id": "2f60d48b-5fcd-4b6d-b3b6-04ac9876ac8a",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:25:32Z",
    "sequence": 1793388332667
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0a0732eb-d323-4448-a2e8-881fe9803857",
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
  "last_heartbeat_at": "2026-10-30T19:25:32.689597Z",
  "last_location_at": "2026-10-30T19:25:32.689597Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639659429",
  "device_ref": "sandbox-3539"
}
```

```json
{
  "challenge_id": "3c420696-69fb-447f-ab4f-aa93b4947550",
  "expires_at": "2026-10-30T19:30:33.008730713Z",
  "resend_available_at": "2026-10-30T19:25:34.008730713Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639659429` → **200**

```json
{
  "phone": "+380639659429",
  "audience": "CLIENT",
  "code": "076026",
  "sent_at": "2026-10-30T19:25:33.013520676Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3c420696-69fb-447f-ab4f-aa93b4947550",
  "code": "076026",
  "device_ref": "sandbox-3539"
}
```

```json
{
  "session_id": "499b2ce6-23ce-407b-a84f-471f5f2d38c2",
  "subject": {
    "type": "CLIENT",
    "id": "34e96cb2-0371-4297-9729-23b823533cd0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzNGU5NmNiMi0wMzcxLTQyOTctOTcyOS0yM2I4MjM1MzNjZDAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzg5MjMzLCJpYXQiOjE3OTMzODgzMzMsImp0aSI6ImMxYjdhODMzLWNjYjItNGRhZi1hNGNkLTdhYTQyY2FmYmViMCIsInNpZCI6IjQ5OWIyY2U2LTIzY2UtNDA3Yi1hODRmLTQ3MWY1ZjJkMzhjMiJ9.hlH3dDq-AEC3ASXv-76ua7BRoklRpYRzLCBUO1tJQD0",
  "access_expires_at": "2026-10-30T19:40:33.394149929Z",
  "refresh_token": "WhBR_FTU-Kg_bE0Bs6D3BWR6IlNWP0xiIqgh6A22Gss",
  "refresh_expires_at": "2026-11-29T19:25:33.393356118Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "2b23206a-2f7e-44d9-adb4-00b3a9ccfd27",
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
  "id": "c589f7cd-3baf-4af6-abaf-6711657a2410",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T19:30:33.704614Z",
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
  "command_id": "d08a7fd2-b816-468a-8fbe-afdcaa93105b",
  "quote_id": "c589f7cd-3baf-4af6-abaf-6711657a2410",
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
  "id": "2e5e9ec0-fe1f-45c1-b0b1-b9e15cb69ae9",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "34e96cb2-0371-4297-9729-23b823533cd0",
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
  "created_at": "2026-10-30T19:25:34.02771Z",
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
    "id": "147f996c-e38a-431c-9683-31293d2067b6",
    "order_id": "2e5e9ec0-fe1f-45c1-b0b1-b9e15cb69ae9",
    "expires_at": "2026-10-30T19:25:49.032218Z",
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

`POST /api/driver/v1/offers/147f996c-e38a-431c-9683-31293d2067b6/accept` → **200**

```json
{
  "command_id": "15690162-a851-4e76-b1b2-6c95fbd1bc6d"
}
```

```json
{
  "id": "d1c8cf92-f108-468b-8a56-77e87ec710c4",
  "order_id": "2e5e9ec0-fe1f-45c1-b0b1-b9e15cb69ae9",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "aa253476-eae6-44de-a0ee-ef699b3d3eb6",
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
  "command_id": "1793315a-1285-4d2f-8165-1306ed9d93c0",
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
  "changed_by": "bbeb0bd1-546e-4687-8aa4-9df00ff27005",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T19:25:35.327677975Z"
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
  "id": "aa253476-eae6-44de-a0ee-ef699b3d3eb6",
  "order_id": "2e5e9ec0-fe1f-45c1-b0b1-b9e15cb69ae9",
  "assignment_id": "d1c8cf92-f108-468b-8a56-77e87ec710c4",
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

`POST /api/driver/v1/work-sessions/0a0732eb-d323-4448-a2e8-881fe9803857/heartbeat` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:25:36Z",
    "sequence": 1793388336271
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0a0732eb-d323-4448-a2e8-881fe9803857",
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
  "last_heartbeat_at": "2026-10-30T19:25:36.293801Z",
  "last_location_at": "2026-10-30T19:25:36.293801Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/aa253476-eae6-44de-a0ee-ef699b3d3eb6/arrive` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "07dcfafb-251c-415d-ace1-2a4af5f60749",
  "expected_version": 0
}
```

```json
{
  "id": "aa253476-eae6-44de-a0ee-ef699b3d3eb6",
  "order_id": "2e5e9ec0-fe1f-45c1-b0b1-b9e15cb69ae9",
  "assignment_id": "d1c8cf92-f108-468b-8a56-77e87ec710c4",
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
  "arrived_at": "2026-10-30T19:25:36.619856Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/aa253476-eae6-44de-a0ee-ef699b3d3eb6/start` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "0ab5dc77-e7e9-49cb-bb58-bd17d3f1bd2a",
  "expected_version": 1
}
```

```json
{
  "id": "aa253476-eae6-44de-a0ee-ef699b3d3eb6",
  "order_id": "2e5e9ec0-fe1f-45c1-b0b1-b9e15cb69ae9",
  "assignment_id": "d1c8cf92-f108-468b-8a56-77e87ec710c4",
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
  "arrived_at": "2026-10-30T19:25:36.619856Z",
  "started_at": "2026-10-30T19:25:36.941878Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/aa253476-eae6-44de-a0ee-ef699b3d3eb6/complete` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "4bd832b1-a5b5-461d-b0cb-5eac2385ce18",
  "expected_version": 2,
  "reported_at": "2026-10-30T19:25:37Z",
  "cash_received": true
}
```

```json
{
  "id": "aa253476-eae6-44de-a0ee-ef699b3d3eb6",
  "order_id": "2e5e9ec0-fe1f-45c1-b0b1-b9e15cb69ae9",
  "assignment_id": "d1c8cf92-f108-468b-8a56-77e87ec710c4",
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
  "arrived_at": "2026-10-30T19:25:36.619856Z",
  "started_at": "2026-10-30T19:25:36.941878Z",
  "completed_at": "2026-10-30T19:25:37.284679Z",
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
  "session_id": "0a0732eb-d323-4448-a2e8-881fe9803857",
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
  "last_heartbeat_at": "2026-10-30T19:25:36.293801Z",
  "last_location_at": "2026-10-30T19:25:36.293801Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/0a0732eb-d323-4448-a2e8-881fe9803857/close` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "af79b3f4-a2db-4a8c-8a80-3eaeb8607a09",
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
  "command_id": "79653049-1042-4de4-9877-b40992a66733",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:25:38Z",
    "sequence": 1793388338218
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
  "correlation_id": "bbf97557-39ce-40b3-8d39-4243a52cc85f",
  "minimum_version": "9.0.0"
}
```

## After the update he can

`POST /api/driver/v1/work-sessions` (X-App-Platform: DRIVER_ANDROID X-App-Version: 9.0.0) → **201**

```json
{
  "command_id": "79c436c1-cac6-4689-8b0d-710bfd6e3dea",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:25:38Z",
    "sequence": 1793388338553
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3fd9179d-f1d1-485d-85f3-f658d8b90476",
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
  "last_heartbeat_at": "2026-10-30T19:25:38.57573Z",
  "last_location_at": "2026-10-30T19:25:38.57573Z",
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
  "changed_by": "bbeb0bd1-546e-4687-8aa4-9df00ff27005",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T19:25:35.327678Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "93681d6d-7c54-4cc5-9a95-8ea99426f003",
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
  "changed_by": "bbeb0bd1-546e-4687-8aa4-9df00ff27005",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T19:25:39.188412031Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3fd9179d-f1d1-485d-85f3-f658d8b90476",
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
  "last_heartbeat_at": "2026-10-30T19:25:38.57573Z",
  "last_location_at": "2026-10-30T19:25:38.57573Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3fd9179d-f1d1-485d-85f3-f658d8b90476/close` → **200**

```json
{
  "command_id": "234330ea-b1b8-41b3-8144-74b4f024422a",
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
  "session_id": "cf4d5725-1209-4497-9388-cb4552748210",
  "subject": {
    "type": "STAFF",
    "id": "bbeb0bd1-546e-4687-8aa4-9df00ff27005"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYmViMGJkMS01NDZlLTQ2ODctOGFhNC05ZGYwMGZmMjcwMDUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODkyNDAsImlhdCI6MTc5MzM4ODM0MCwianRpIjoiMjM2YWMzM2YtMDJmNi00ZDZlLWI5NDgtNjVlMjFjOGJmM2E5Iiwic2lkIjoiY2Y0ZDU3MjUtMTIwOS00NDk3LTkzODgtY2I0NTUyNzQ4MjEwIn0.72uVIEX0qexrKnAIJTpVsk1voAy6iMUIYCONfmwphW4",
  "access_expires_at": "2026-10-30T19:40:40.422288966Z",
  "refresh_token": "5u3buM7dXCW1z09DKugxhsW-v0Qj-jTC2PUgn_IaH_k",
  "refresh_expires_at": "2026-10-31T07:25:40.421607044Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "a774e70f-abb6-46de-9ac1-7627a43d87a0",
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
  "id": "c015f08e-6790-420b-aa81-f764351cee42",
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
  "created_by": "bbeb0bd1-546e-4687-8aa4-9df00ff27005",
  "created_at": "2026-10-30T19:25:40.725618Z",
  "updated_at": "2026-10-30T19:25:40.725618Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638718564",
  "device_ref": "sandbox-2193"
}
```

```json
{
  "challenge_id": "1861642c-7176-471e-a9bb-772587711636",
  "expires_at": "2026-10-30T19:30:41.039726512Z",
  "resend_available_at": "2026-10-30T19:25:42.039726512Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638718564` → **200**

```json
{
  "phone": "+380638718564",
  "audience": "CLIENT",
  "code": "183454",
  "sent_at": "2026-10-30T19:25:41.043536463Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1861642c-7176-471e-a9bb-772587711636",
  "code": "183454",
  "device_ref": "sandbox-2193"
}
```

```json
{
  "session_id": "2a4f5021-4c69-47d3-9941-61c1f1ddc52d",
  "subject": {
    "type": "CLIENT",
    "id": "120ad151-4990-4f8a-b335-ecc5ab586e5f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMjBhZDE1MS00OTkwLTRmOGEtYjMzNS1lY2M1YWI1ODZlNWYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzg5MjQxLCJpYXQiOjE3OTMzODgzNDEsImp0aSI6IjMzMWExYTcwLTU5YTYtNGExMC1hZjkzLWRlYjlhYWFlYjk3OCIsInNpZCI6IjJhNGY1MDIxLTRjNjktNDdkMy05OTQxLTYxYzFmMWRkYzUyZCJ9.plLdjQxiqv5svv450jzAPTP0zbzRAViwG2S5786nvBc",
  "access_expires_at": "2026-10-30T19:40:41.364126802Z",
  "refresh_token": "WvFWlaLucy0rbUhgACdAIHihxAPBwXEONvx9xLryTDQ",
  "refresh_expires_at": "2026-11-29T19:25:41.362952741Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380638718564` → **200**

```json
{
  "client_id": "120ad151-4990-4f8a-b335-ecc5ab586e5f"
}
```

`POST /api/admin/v1/rider-wallets/120ad151-4990-4f8a-b335-ecc5ab586e5f/top-ups` → **201**

```json
{
  "command_id": "8bc5cc52-601f-4d3b-be19-0a61393bb0f1",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "120ad151-4990-4f8a-b335-ecc5ab586e5f",
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
      "id": "24112c26-9e70-4b10-b38d-52ab32ffc03a",
      "at": "2026-10-30T19:25:41.96866Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "bbeb0bd1-546e-4687-8aa4-9df00ff27005",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "30bd5ea7-9c2d-40fa-a603-8edb42282319",
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
  "id": "7f7e9be5-8073-43d1-a190-920d07ecba06",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T19:30:42.331514Z",
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
      "id": "c015f08e-6790-420b-aa81-f764351cee42",
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
  "device_ref": "sandbox-2904"
}
```

```json
{
  "challenge_id": "36ad58d6-e1fe-4481-8cac-46be8209147b",
  "expires_at": "2026-10-30T19:30:42.647783247Z",
  "resend_available_at": "2026-10-30T19:25:43.647783247Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "313970",
  "sent_at": "2026-10-30T19:25:42.652900432Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "36ad58d6-e1fe-4481-8cac-46be8209147b",
  "code": "313970",
  "device_ref": "sandbox-2904"
}
```

```json
{
  "session_id": "ab8e2419-657f-4b8c-9730-75ed619e9bbf",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4OTI0MiwiaWF0IjoxNzkzMzg4MzQyLCJqdGkiOiI5NDIxNTYyNC0zZmY2LTRhN2QtYmIxNi04NGQwM2NlN2EyYTQiLCJzaWQiOiJhYjhlMjQxOS02NTdmLTRiOGMtOTczMC03NWVkNjE5ZTliYmYifQ.hlg1tiYQ0xtHHD0QyhKXUcve_EEVyydbjlmGHy2O0i4",
  "access_expires_at": "2026-10-30T19:40:42.975193109Z",
  "refresh_token": "CU68DFdhu-ciyqmLTxFzNmNoGoLlePEl6Dt__GoaQY8",
  "refresh_expires_at": "2026-11-29T19:25:42.974454152Z",
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
  "command_id": "78c54f43-5f19-4c1d-8954-24805c4c814e",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:25:43Z",
    "sequence": 1793388343579
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3fff3958-cb87-4291-8566-47014f4112dd",
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
  "last_heartbeat_at": "2026-10-30T19:25:43.599622Z",
  "last_location_at": "2026-10-30T19:25:43.599622Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "ed71a295-4bdf-4f70-8d0f-edf618c1c78b",
  "quote_id": "7f7e9be5-8073-43d1-a190-920d07ecba06",
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
  "id": "9cb9373f-7088-4877-9dc1-0fb74da1caf2",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "120ad151-4990-4f8a-b335-ecc5ab586e5f",
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
  "created_at": "2026-10-30T19:25:43.913335Z",
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
  "client_id": "120ad151-4990-4f8a-b335-ecc5ab586e5f",
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
      "id": "24112c26-9e70-4b10-b38d-52ab32ffc03a",
      "at": "2026-10-30T19:25:41.96866Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "bbeb0bd1-546e-4687-8aa4-9df00ff27005",
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
    "id": "ec3776f4-16f4-46fd-b343-e6c725651b22",
    "order_id": "9cb9373f-7088-4877-9dc1-0fb74da1caf2",
    "expires_at": "2026-10-30T19:25:58.92117Z",
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

`POST /api/driver/v1/offers/ec3776f4-16f4-46fd-b343-e6c725651b22/accept` → **200**

```json
{
  "command_id": "2823b41a-7197-44e1-a00b-bcfd0cfe2c8d"
}
```

```json
{
  "id": "c34cc9eb-4f58-4559-a847-7cf4c9c954c8",
  "order_id": "9cb9373f-7088-4877-9dc1-0fb74da1caf2",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "11b59fc9-272f-4771-9c95-88cba1a51ffd",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "11b59fc9-272f-4771-9c95-88cba1a51ffd",
  "order_id": "9cb9373f-7088-4877-9dc1-0fb74da1caf2",
  "assignment_id": "c34cc9eb-4f58-4559-a847-7cf4c9c954c8",
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

`POST /api/driver/v1/work-sessions/3fff3958-cb87-4291-8566-47014f4112dd/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:25:47Z",
    "sequence": 1793388347498
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3fff3958-cb87-4291-8566-47014f4112dd",
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
  "last_heartbeat_at": "2026-10-30T19:25:47.519449Z",
  "last_location_at": "2026-10-30T19:25:47.519449Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/11b59fc9-272f-4771-9c95-88cba1a51ffd/arrive` → **200**

```json
{
  "command_id": "db03bf14-e75a-44c1-a780-e108412a56fc",
  "expected_version": 0
}
```

```json
{
  "id": "11b59fc9-272f-4771-9c95-88cba1a51ffd",
  "order_id": "9cb9373f-7088-4877-9dc1-0fb74da1caf2",
  "assignment_id": "c34cc9eb-4f58-4559-a847-7cf4c9c954c8",
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
  "arrived_at": "2026-10-30T19:25:47.851435Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/11b59fc9-272f-4771-9c95-88cba1a51ffd/start` → **200**

```json
{
  "command_id": "9845b5b0-8845-4703-8d0a-9f6dbb449d1c",
  "expected_version": 1
}
```

```json
{
  "id": "11b59fc9-272f-4771-9c95-88cba1a51ffd",
  "order_id": "9cb9373f-7088-4877-9dc1-0fb74da1caf2",
  "assignment_id": "c34cc9eb-4f58-4559-a847-7cf4c9c954c8",
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
  "arrived_at": "2026-10-30T19:25:47.851435Z",
  "started_at": "2026-10-30T19:25:48.165201Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/11b59fc9-272f-4771-9c95-88cba1a51ffd/complete` → **200**

```json
{
  "command_id": "25ead21a-7751-4b21-a100-be329d580e23",
  "expected_version": 2,
  "reported_at": "2026-10-30T19:25:48Z",
  "cash_received": true
}
```

```json
{
  "id": "11b59fc9-272f-4771-9c95-88cba1a51ffd",
  "order_id": "9cb9373f-7088-4877-9dc1-0fb74da1caf2",
  "assignment_id": "c34cc9eb-4f58-4559-a847-7cf4c9c954c8",
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
  "arrived_at": "2026-10-30T19:25:47.851435Z",
  "started_at": "2026-10-30T19:25:48.165201Z",
  "completed_at": "2026-10-30T19:25:48.504661Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "120ad151-4990-4f8a-b335-ecc5ab586e5f",
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
      "id": "3ca5f77f-1265-4dfc-97ad-1c14b648e3a0",
      "at": "2026-10-30T19:25:48.67266Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "9cb9373f-7088-4877-9dc1-0fb74da1caf2"
    },
    {
      "id": "24112c26-9e70-4b10-b38d-52ab32ffc03a",
      "at": "2026-10-30T19:25:41.96866Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "bbeb0bd1-546e-4687-8aa4-9df00ff27005",
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

`POST /api/admin/v1/promotions/c015f08e-6790-420b-aa81-f764351cee42/archive` → **200**

```json
{
  "command_id": "500b4f1d-d09b-483e-a4c2-a5f85fe59403",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "c015f08e-6790-420b-aa81-f764351cee42",
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
  "created_by": "bbeb0bd1-546e-4687-8aa4-9df00ff27005",
  "created_at": "2026-10-30T19:25:40.725618Z",
  "updated_at": "2026-10-30T19:25:52.159525Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3fff3958-cb87-4291-8566-47014f4112dd",
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
  "last_heartbeat_at": "2026-10-30T19:25:47.519449Z",
  "last_location_at": "2026-10-30T19:25:47.519449Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3fff3958-cb87-4291-8566-47014f4112dd/close` → **200**

```json
{
  "command_id": "ec238042-615f-4887-aace-8495410799c6",
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

Done: order 9cb9373f-7088-4877-9dc1-0fb74da1caf2.

# Scenario: broadcast-abuse

## Anna goes online in Warsaw

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000002",
  "device_ref": "sandbox-6843"
}
```

```json
{
  "challenge_id": "7e83eae7-42f2-481a-be31-5028ffaac490",
  "expires_at": "2026-10-30T19:30:53.090645071Z",
  "resend_available_at": "2026-10-30T19:25:54.090645071Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000002` → **200**

```json
{
  "phone": "+48500000002",
  "audience": "DRIVER",
  "code": "964966",
  "sent_at": "2026-10-30T19:25:53.094524756Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7e83eae7-42f2-481a-be31-5028ffaac490",
  "code": "964966",
  "device_ref": "sandbox-6843"
}
```

```json
{
  "session_id": "a069efb5-a739-4b5f-84e2-a3a450ea4962",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000405"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDUiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4OTI1MywiaWF0IjoxNzkzMzg4MzUzLCJqdGkiOiJmODAzOTMzMy01NDUwLTQxOTMtYTRmZS02Zjg4YjFlOGY5YzIiLCJzaWQiOiJhMDY5ZWZiNS1hNzM5LTRiNWYtODRlMi1hM2E0NTBlYTQ5NjIifQ.eUwa_76aGiFHQgXAUTefHdUJiXp3vbUOog07OWIaKE8",
  "access_expires_at": "2026-10-30T19:40:53.422345988Z",
  "refresh_token": "kRtyc6D8U9QEAgeiQRqhvjliat9Id8CrH3ZYOt7H_gQ",
  "refresh_expires_at": "2026-11-29T19:25:53.421724398Z",
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
  "command_id": "2247af35-65f5-4745-8dbc-d12d4f8e1dec",
  "vehicle_id": "5a000000-0000-4000-8000-000000000505",
  "location": {
    "lat": 52.2297,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:25:54Z",
    "sequence": 1793388354316
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "e2c5b679-6887-4709-ad8b-09016df74dc5",
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
  "last_heartbeat_at": "2026-10-30T19:25:54.33699Z",
  "last_location_at": "2026-10-30T19:25:54.33699Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## 5 seconds later her phone reports Lviv: not taken as her position

`POST /api/driver/v1/work-sessions/e2c5b679-6887-4709-ad8b-09016df74dc5/heartbeat` → **200**

```json
{
  "location": {
    "lat": 49.8397,
    "lon": 24.0297,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:25:59Z",
    "sequence": 1793388359649
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "e2c5b679-6887-4709-ad8b-09016df74dc5",
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
  "last_heartbeat_at": "2026-10-30T19:25:59.670671Z",
  "last_location_at": "2026-10-30T19:25:54.33699Z",
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
  "session_id": "6221f451-2b3d-422d-b1c9-e1e1f8945923",
  "subject": {
    "type": "STAFF",
    "id": "bbeb0bd1-546e-4687-8aa4-9df00ff27005"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYmViMGJkMS01NDZlLTQ2ODctOGFhNC05ZGYwMGZmMjcwMDUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODkyNjAsImlhdCI6MTc5MzM4ODM2MCwianRpIjoiZmRiMDQ5ODgtMjMyOC00OTdhLTg0ODctNzM4MzM2YTM1YTlmIiwic2lkIjoiNjIyMWY0NTEtMmIzZC00MjJkLWIxYzktZTFlMWY4OTQ1OTIzIn0.MBSBjWbZCVnWw9ynfncCuNrMZ-B_75shr6dPM1GBz0g",
  "access_expires_at": "2026-10-30T19:41:00.298854252Z",
  "refresh_token": "0xB67wZxf4wnaIgt_2iIlPq1Jdb0QkjnzHdk8Jog0lc",
  "refresh_expires_at": "2026-10-31T07:26:00.298149767Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "at": "2026-10-30T19:26:00.590357859Z",
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
      "last_location_at": "2026-10-30T19:25:54.33699Z",
      "last_heartbeat_at": "2026-10-30T19:25:59.670671Z",
      "order_id": null
    }
  ]
}
```

## A fix next to the last accepted one is taken again

`POST /api/driver/v1/work-sessions/e2c5b679-6887-4709-ad8b-09016df74dc5/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2299,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:26:00Z",
    "sequence": 1793388360900
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "e2c5b679-6887-4709-ad8b-09016df74dc5",
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
  "last_heartbeat_at": "2026-10-30T19:26:00.921088Z",
  "last_location_at": "2026-10-30T19:26:00.921088Z",
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
  "session_id": "e2c5b679-6887-4709-ad8b-09016df74dc5",
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
  "last_heartbeat_at": "2026-10-30T19:26:00.921088Z",
  "last_location_at": "2026-10-30T19:26:00.921088Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e2c5b679-6887-4709-ad8b-09016df74dc5/close` → **200**

```json
{
  "command_id": "ff78eb59-8d52-4022-89fe-e7a79f73fb1c",
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
  "device_ref": "sandbox-3035"
}
```

```json
{
  "challenge_id": "f4b47d16-5349-4156-b41d-aca6bc171548",
  "expires_at": "2026-10-30T19:31:01.858542813Z",
  "resend_available_at": "2026-10-30T19:26:02.858542813Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "172148",
  "sent_at": "2026-10-30T19:26:01.862340222Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f4b47d16-5349-4156-b41d-aca6bc171548",
  "code": "172148",
  "device_ref": "sandbox-3035"
}
```

```json
{
  "session_id": "b58a00ff-104a-48fb-89a1-05d5a665a282",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4OTI2MiwiaWF0IjoxNzkzMzg4MzYyLCJqdGkiOiIxMDNhNTI4Ny0xMGQzLTQ0YjgtODljNy1mMjA4Zjc1NTg5ZmYiLCJzaWQiOiJiNThhMDBmZi0xMDRhLTQ4ZmItODlhMS0wNWQ1YTY2NWEyODIifQ.uPRTl2jp7HgvaZImbDkTGvApTvw7rcqCV-2Pf_G8goI",
  "access_expires_at": "2026-10-30T19:41:02.178297716Z",
  "refresh_token": "oIPR2lhifd5Hx-OfmU9kOPpq4U3AGmzuFnljEhj85io",
  "refresh_expires_at": "2026-11-29T19:26:02.177573193Z",
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
  "device_ref": "sandbox-29325"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "78fd65eb-1488-43f3-8151-372b7aa64e5a",
  "retryable": true,
  "retry_after_seconds": 1
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000001",
  "device_ref": "sandbox-29325"
}
```

```json
{
  "challenge_id": "e96db720-9468-42e1-84ae-9955e6bd8ea1",
  "expires_at": "2026-10-30T19:31:04.085418188Z",
  "resend_available_at": "2026-10-30T19:26:05.085418188Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "703162",
  "sent_at": "2026-10-30T19:26:04.089053654Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e96db720-9468-42e1-84ae-9955e6bd8ea1",
  "code": "703162",
  "device_ref": "sandbox-29325"
}
```

```json
{
  "session_id": "313d45a2-d765-4a8a-bbb7-bb775497ddf6",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4OTI2NCwiaWF0IjoxNzkzMzg4MzY0LCJqdGkiOiI0OTgwZDJkMS00ZGM2LTQwYmMtYjI1OC0yYTg0ZWYyMWE3MGEiLCJzaWQiOiIzMTNkNDVhMi1kNzY1LTRhOGEtYmJiNy1iYjc3NTQ5N2RkZjYifQ.CInHEixx_j8oVcDowr1uO_Z5jo37i193ScWmZxdw_sY",
  "access_expires_at": "2026-10-30T19:41:04.430064756Z",
  "refresh_token": "d6LMlSSOJGR_ZXn-qgC4-FxoiOKyi00WkpjlhNBDsDU",
  "refresh_expires_at": "2026-11-29T19:26:04.429406317Z",
  "account_created": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000002",
  "device_ref": "sandbox-3532"
}
```

```json
{
  "challenge_id": "3e3f6682-7bad-4356-a6ed-a6be12880e50",
  "expires_at": "2026-10-30T19:31:04.716203114Z",
  "resend_available_at": "2026-10-30T19:26:05.716203114Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000002` → **200**

```json
{
  "phone": "+48500000002",
  "audience": "DRIVER",
  "code": "854398",
  "sent_at": "2026-10-30T19:26:04.71905929Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3e3f6682-7bad-4356-a6ed-a6be12880e50",
  "code": "854398",
  "device_ref": "sandbox-3532"
}
```

```json
{
  "session_id": "f251688c-d138-453c-a541-6625642e89ca",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000405"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDUiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4OTI2NSwiaWF0IjoxNzkzMzg4MzY1LCJqdGkiOiJhNjZlYzQwOS03ODc1LTRkNDYtOTkwMy1jNDgwNTQ0OTRmMWMiLCJzaWQiOiJmMjUxNjg4Yy1kMTM4LTQ1M2MtYTU0MS02NjI1NjQyZTg5Y2EifQ.vDZ8TOv6fDb-8Bz1cNUC9cgdroKtrRbJqVd6iUOUGlY",
  "access_expires_at": "2026-10-30T19:41:05.042268583Z",
  "refresh_token": "00BW6SCX5VtoAHyORvb9byx4mjVnURprLNev9RwllgQ",
  "refresh_expires_at": "2026-11-29T19:26:05.041638739Z",
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

(the car drives 183 s to the next point)

`POST /api/driver/v1/work-sessions` → **201**

```json
{
  "command_id": "5e42f4a2-bc5d-4c42-922c-8489ff85cd6b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000505",
  "location": {
    "lat": 52.2297,
    "lon": 21.1700,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:29:08Z",
    "sequence": 1793388548951
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "65d2e210-ab1b-4c72-a6e7-b8ba942ea45f",
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
  "last_heartbeat_at": "2026-10-30T19:29:08.972417Z",
  "last_location_at": "2026-10-30T19:29:08.972417Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders: nobody is near, the order goes to the ALL tab

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600148017",
  "device_ref": "sandbox-31075"
}
```

```json
{
  "challenge_id": "9c45bd5a-4e59-413f-8d28-cfea73ff1028",
  "expires_at": "2026-10-30T19:34:09.268924268Z",
  "resend_available_at": "2026-10-30T19:29:10.268924268Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600148017` → **200**

```json
{
  "phone": "+48600148017",
  "audience": "CLIENT",
  "code": "168633",
  "sent_at": "2026-10-30T19:29:09.271829267Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9c45bd5a-4e59-413f-8d28-cfea73ff1028",
  "code": "168633",
  "device_ref": "sandbox-31075"
}
```

```json
{
  "session_id": "fdb591b1-7523-41bb-82e4-0d9983400e25",
  "subject": {
    "type": "CLIENT",
    "id": "17f4e680-ad32-443c-bcc9-8e9c82af11cf"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxN2Y0ZTY4MC1hZDMyLTQ0M2MtYmNjOS04ZTljODJhZjExY2YiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzg5NDQ5LCJpYXQiOjE3OTMzODg1NDksImp0aSI6IjM3NTMzMWJmLTFkYzQtNDFiYS04ZDJhLWE5MTA5YjFjMjAwZSIsInNpZCI6ImZkYjU5MWIxLTc1MjMtNDFiYi04MmU0LTBkOTk4MzQwMGUyNSJ9.OJNHITKkVgwWWlD3vAy6vAyo69iKji6KvFnxvw8tZzA",
  "access_expires_at": "2026-10-30T19:44:09.591870471Z",
  "refresh_token": "W5uPtOnzQKPaEVjLjHXSS4Uw3u2Yn_iSZtFzi89dvbk",
  "refresh_expires_at": "2026-11-29T19:29:09.591120517Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "78c6c21b-8a6d-4e90-849f-54fc8c053c77",
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
  "id": "575b004c-716e-4c2d-a6f4-39b241824147",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 4942,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T19:34:09.897909Z",
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
  "command_id": "63c1ace8-4509-4451-b7a9-f06aa3fc308b",
  "quote_id": "575b004c-716e-4c2d-a6f4-39b241824147",
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
  "id": "9613c434-be61-4e20-8be4-64291d64f657",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "17f4e680-ad32-443c-bcc9-8e9c82af11cf",
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
  "created_at": "2026-10-30T19:29:10.211625Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/9613c434-be61-4e20-8be4-64291d64f657` → **200**

```json
{
  "id": "9613c434-be61-4e20-8be4-64291d64f657",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "17f4e680-ad32-443c-bcc9-8e9c82af11cf",
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
  "created_at": "2026-10-30T19:29:10.211625Z",
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

`POST /api/driver/v1/orders/9613c434-be61-4e20-8be4-64291d64f657/claim` → **422**

```json
{
  "command_id": "b1879969-c7a5-4f7c-b6d5-286257e530c8"
}
```

```json
{
  "instance": "/api/driver/v1/orders/9613c434-be61-4e20-8be4-64291d64f657/claim",
  "status": 422,
  "title": "Pickup too far",
  "type": "https://errors.blizz.taxi/pickup-too-far",
  "code": "PICKUP_TOO_FAR",
  "correlation_id": "20be000b-86a2-4a89-b894-842a20d296f3"
}
```

`GET /api/rider/v1/orders/9613c434-be61-4e20-8be4-64291d64f657` → **200**

```json
{
  "id": "9613c434-be61-4e20-8be4-64291d64f657",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "17f4e680-ad32-443c-bcc9-8e9c82af11cf",
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
  "created_at": "2026-10-30T19:29:10.211625Z",
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

`POST /api/driver/v1/orders/139d5259-d41e-4b9a-bc2f-169b71536c30/claim` → **404**

```json
{
  "command_id": "a0ab97d9-50a5-4770-8022-339818c3758e"
}
```

```json
{
  "instance": "/api/driver/v1/orders/139d5259-d41e-4b9a-bc2f-169b71536c30/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "b1ccf20a-69d9-41b5-ba0f-d7b3f01fb3b4"
}
```

`POST /api/driver/v1/orders/c70ece02-e497-4743-954d-680e65e8845a/claim` → **404**

```json
{
  "command_id": "95068395-1213-4e0c-83d9-b4a7791d4cdc"
}
```

```json
{
  "instance": "/api/driver/v1/orders/c70ece02-e497-4743-954d-680e65e8845a/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "ecdb4452-dcb3-4baf-b731-3f84c7c9e557"
}
```

`POST /api/driver/v1/orders/052ab662-9984-4076-923e-f17080e309d9/claim` → **404**

```json
{
  "command_id": "a66ca76c-8bf0-44b3-87f2-36f74b546a40"
}
```

```json
{
  "instance": "/api/driver/v1/orders/052ab662-9984-4076-923e-f17080e309d9/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "bde521cd-4a27-418c-acad-395bb2becc43"
}
```

`POST /api/driver/v1/orders/8a68773c-967e-434b-bb60-994e5b5ffdef/claim` → **404**

```json
{
  "command_id": "3b14f7b9-fcf1-4995-8d27-ce0d999d09de"
}
```

```json
{
  "instance": "/api/driver/v1/orders/8a68773c-967e-434b-bb60-994e5b5ffdef/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "58bc7c07-9e4c-413c-8c26-e66b22af7f2f"
}
```

`POST /api/driver/v1/orders/3b0fd44e-2c67-4e29-9468-8b6f68a022c5/claim` → **404**

```json
{
  "command_id": "0c3d6d39-0582-4d7f-92d3-d5d759909dc8"
}
```

```json
{
  "instance": "/api/driver/v1/orders/3b0fd44e-2c67-4e29-9468-8b6f68a022c5/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "cdfe2f39-227f-431f-8408-32495b86852c"
}
```

`POST /api/driver/v1/orders/6c48add6-a1b3-439f-add4-1c3dc0fc41c8/claim` → **404**

```json
{
  "command_id": "0b786c6e-85f4-4e87-9ce1-0f0df7f0ac21"
}
```

```json
{
  "instance": "/api/driver/v1/orders/6c48add6-a1b3-439f-add4-1c3dc0fc41c8/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "3e7b16c0-a59b-4493-abdc-3e19f7bca5e5"
}
```

`POST /api/driver/v1/orders/af736043-f77e-4bc6-ab5a-0dadd4db8ba2/claim` → **404**

```json
{
  "command_id": "1dd84112-3548-4135-b530-22b21ffeb693"
}
```

```json
{
  "instance": "/api/driver/v1/orders/af736043-f77e-4bc6-ab5a-0dadd4db8ba2/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "b9da7580-8c08-4906-85ce-261dd76ab3af"
}
```

`POST /api/driver/v1/orders/9a43f992-16e4-4be6-8797-8d4f41f53e84/claim` → **404**

```json
{
  "command_id": "5d745e08-f182-4cf4-8ce4-378e7f9ed8b0"
}
```

```json
{
  "instance": "/api/driver/v1/orders/9a43f992-16e4-4be6-8797-8d4f41f53e84/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "475ee8a4-407d-4a4f-85b4-2a3e8d43843e"
}
```

`POST /api/driver/v1/orders/36562a49-a3d2-45a7-9409-9aee91e5778d/claim` → **404**

```json
{
  "command_id": "2f390d9b-58bc-4897-9f59-3d110efeb882"
}
```

```json
{
  "instance": "/api/driver/v1/orders/36562a49-a3d2-45a7-9409-9aee91e5778d/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "5e19c245-a174-4b06-9f62-68ca27ca04cb"
}
```

`POST /api/driver/v1/orders/8162b4fa-cc86-4015-a8fa-a420ceda597a/claim` → **404**

```json
{
  "command_id": "8cc6839c-0582-412f-87dd-62df3eb2d9da"
}
```

```json
{
  "instance": "/api/driver/v1/orders/8162b4fa-cc86-4015-a8fa-a420ceda597a/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "cc5e28c4-a331-4c7f-9ca9-2bad13d88a6a"
}
```

`POST /api/driver/v1/orders/f0f56f28-0a6a-4f08-9a4f-e8fae6c23a49/claim` → **404**

```json
{
  "command_id": "cf99c8ac-6f86-4b7b-88a9-f41cc074a571"
}
```

```json
{
  "instance": "/api/driver/v1/orders/f0f56f28-0a6a-4f08-9a4f-e8fae6c23a49/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "77f37d12-d024-4575-90e4-4b523ef462ac"
}
```

`POST /api/driver/v1/orders/1ab1a498-1032-4262-9603-d75c23721a36/claim` → **404**

```json
{
  "command_id": "4c7bfc27-0a3f-4f0f-ab31-edc534e67971"
}
```

```json
{
  "instance": "/api/driver/v1/orders/1ab1a498-1032-4262-9603-d75c23721a36/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "51ee2617-6529-456d-869b-f931a18de86c"
}
```

`POST /api/driver/v1/orders/37360e31-0a05-464e-9927-537f5ad5710a/claim` → **404**

```json
{
  "command_id": "95e5dac6-d327-47d1-9b23-067b15950a59"
}
```

```json
{
  "instance": "/api/driver/v1/orders/37360e31-0a05-464e-9927-537f5ad5710a/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "180f2f86-ce4c-41e2-bd7d-ee5d1287bd68"
}
```

`POST /api/driver/v1/orders/a422ca64-0bb6-47c6-920b-1f81e8db84fb/claim` → **404**

```json
{
  "command_id": "85bd1839-71cc-4f23-b7d1-8a9a6bcd4d23"
}
```

```json
{
  "instance": "/api/driver/v1/orders/a422ca64-0bb6-47c6-920b-1f81e8db84fb/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "99aa4321-b180-43f6-b147-c19723d2b3cc"
}
```

`POST /api/driver/v1/orders/ed2b6a09-159c-48b9-8869-a5e5e65cffa4/claim` → **404**

```json
{
  "command_id": "77adc175-e385-4a22-91d3-44d1566dd91d"
}
```

```json
{
  "instance": "/api/driver/v1/orders/ed2b6a09-159c-48b9-8869-a5e5e65cffa4/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "7b5b8689-abf4-4db3-b8a8-fc1081dbc2e5"
}
```

`POST /api/driver/v1/orders/5db19e47-ad8a-4a0e-a957-fbbb23aee342/claim` → **404**

```json
{
  "command_id": "c8201baf-1cf9-4c66-8163-9b983fa4fd50"
}
```

```json
{
  "instance": "/api/driver/v1/orders/5db19e47-ad8a-4a0e-a957-fbbb23aee342/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "a7baa3b0-da39-48da-b85f-119900ba2101"
}
```

`POST /api/driver/v1/orders/b4c5f2ef-db1c-4e00-8c65-b67a7999e6fa/claim` → **404**

```json
{
  "command_id": "c3c7e7e4-18cb-4279-87eb-af6073e59ced"
}
```

```json
{
  "instance": "/api/driver/v1/orders/b4c5f2ef-db1c-4e00-8c65-b67a7999e6fa/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "7862b598-f514-4f84-8e8a-912fb9414d50"
}
```

`POST /api/driver/v1/orders/8300b2a3-e1a7-4b93-aa2f-cadaf143f3c7/claim` → **404**

```json
{
  "command_id": "fd1e9ebc-505c-4312-8166-6757bf60b7e5"
}
```

```json
{
  "instance": "/api/driver/v1/orders/8300b2a3-e1a7-4b93-aa2f-cadaf143f3c7/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "25e7e9d8-c139-4371-b60f-7d9a5356d61b"
}
```

`POST /api/driver/v1/orders/16a8bacd-f8ed-4dfe-88e9-1e93e6e5b2e6/claim` → **404**

```json
{
  "command_id": "d3fc915f-a523-40a0-8e61-2fc29017fada"
}
```

```json
{
  "instance": "/api/driver/v1/orders/16a8bacd-f8ed-4dfe-88e9-1e93e6e5b2e6/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "e88ca2bc-8799-4a65-b06f-0e1a7f6434e4"
}
```

`POST /api/driver/v1/orders/f7df8d75-3419-4993-a401-1bdd8f72624d/claim` → **404**

```json
{
  "command_id": "8f70b51e-fd21-4d21-b312-21737758afa5"
}
```

```json
{
  "instance": "/api/driver/v1/orders/f7df8d75-3419-4993-a401-1bdd8f72624d/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "cf783fe6-9fc0-4f36-9793-cd2d78c0e52c"
}
```

`POST /api/driver/v1/orders/6cbe4941-ca3a-4832-99fc-b0df3e0eaf36/claim` → **404**

```json
{
  "command_id": "c46cdcea-635d-410b-a4b5-368ff451436d"
}
```

```json
{
  "instance": "/api/driver/v1/orders/6cbe4941-ca3a-4832-99fc-b0df3e0eaf36/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "4053081d-f170-4fe7-a3be-16683f3094f1"
}
```

`POST /api/driver/v1/orders/247c7f51-f547-4b71-9a9f-b7cb0e335bd3/claim` → **404**

```json
{
  "command_id": "295daf58-1bc4-4056-b160-6b705648674c"
}
```

```json
{
  "instance": "/api/driver/v1/orders/247c7f51-f547-4b71-9a9f-b7cb0e335bd3/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "63e5b9ca-0997-45f3-b91b-59913b29d978"
}
```

`POST /api/driver/v1/orders/ae7bceef-31a1-467e-9978-e319e19d69dd/claim` → **404**

```json
{
  "command_id": "035173ae-db19-41de-be12-3564db1d0100"
}
```

```json
{
  "instance": "/api/driver/v1/orders/ae7bceef-31a1-467e-9978-e319e19d69dd/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "b1b30d0c-894f-449f-9b37-a416eebd442b"
}
```

`POST /api/driver/v1/orders/9db1fcd4-2817-4641-adab-add36c8e9463/claim` → **404**

```json
{
  "command_id": "8d517b4f-3a0c-4c16-8334-d450f9c9b8cb"
}
```

```json
{
  "instance": "/api/driver/v1/orders/9db1fcd4-2817-4641-adab-add36c8e9463/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "9b4a6e88-c6cc-47db-bba0-bb06b10148e5"
}
```

`POST /api/driver/v1/orders/894cbc7c-1534-416e-aa47-f5a5361a8d96/claim` → **404**

```json
{
  "command_id": "65df66dd-1653-4c05-9fee-aceab80e51f7"
}
```

```json
{
  "instance": "/api/driver/v1/orders/894cbc7c-1534-416e-aa47-f5a5361a8d96/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "86625b15-f755-48e5-b562-f4e25dac1894"
}
```

`POST /api/driver/v1/orders/bfab32d8-e6f9-40d7-b664-b60856cb723a/claim` → **404**

```json
{
  "command_id": "c2a25432-9727-4f91-ad33-368a782a5b2d"
}
```

```json
{
  "instance": "/api/driver/v1/orders/bfab32d8-e6f9-40d7-b664-b60856cb723a/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "90b93170-b975-43e5-8e32-56427f357792"
}
```

`POST /api/driver/v1/orders/6d730b10-e304-4f24-85ae-1cd1920380dd/claim` → **404**

```json
{
  "command_id": "8675265d-ac82-4228-a697-94cd3842995b"
}
```

```json
{
  "instance": "/api/driver/v1/orders/6d730b10-e304-4f24-85ae-1cd1920380dd/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "429a93b2-40eb-46ba-b5cf-85e70f650bba"
}
```

`POST /api/driver/v1/orders/b16e0429-44d2-4ee9-a043-075f9299afc8/claim` → **404**

```json
{
  "command_id": "1b9b1aab-9abd-49df-a119-d7fef8bfe563"
}
```

```json
{
  "instance": "/api/driver/v1/orders/b16e0429-44d2-4ee9-a043-075f9299afc8/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "17a6ff23-16f7-40f7-b772-7b652050ad2e"
}
```

`POST /api/driver/v1/orders/646df08e-4aae-40cf-b7b6-0f96ca854fd3/claim` → **404**

```json
{
  "command_id": "53963379-cfbf-4535-b292-eb9d1a9f1723"
}
```

```json
{
  "instance": "/api/driver/v1/orders/646df08e-4aae-40cf-b7b6-0f96ca854fd3/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "59a209bb-b14c-4c3e-a86b-81198043a8de"
}
```

`POST /api/driver/v1/orders/9ecdae64-4d09-43d5-ba87-7a711aa4bc82/claim` → **429**

```json
{
  "command_id": "0726ffd3-dc5c-47d0-a0a9-0dbdbc171c71"
}
```

```json
{
  "instance": "/api/driver/v1/orders/9ecdae64-4d09-43d5-ba87-7a711aa4bc82/claim",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "b96c9add-30f7-4806-bc46-6c3d9ea6871c",
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
  "command_id": "84b0c573-43e5-4a72-8a82-f67dd83e38b4",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:29:21Z",
    "sequence": 1793388561240
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "c8d5ea07-4310-40be-a5b0-93dea1792d08",
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
  "last_heartbeat_at": "2026-10-30T19:29:21.260109Z",
  "last_location_at": "2026-10-30T19:29:21.260109Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/broadcast-orders` → **200**

```json
[
  {
    "order_id": "9613c434-be61-4e20-8be4-64291d64f657",
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

`POST /api/driver/v1/orders/9613c434-be61-4e20-8be4-64291d64f657/claim` → **409**

```json
{
  "command_id": "745dc569-0cf9-4129-96ce-c94999ba5178"
}
```

```json
{
  "instance": "/api/driver/v1/orders/9613c434-be61-4e20-8be4-64291d64f657/claim",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "abbd087a-2a6c-4cca-aec2-c6ddf0e9da54"
}
```

`POST /api/driver/v1/orders/9613c434-be61-4e20-8be4-64291d64f657/claim` → **200**

```json
{
  "command_id": "b3728e42-1c50-4693-aa93-ca9662d70f5a"
}
```

```json
{
  "id": "e34f695b-9dd3-4c53-ae17-bf7987de34e2",
  "order_id": "9613c434-be61-4e20-8be4-64291d64f657",
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "source": "BROADCAST",
  "state": "COMMITTED",
  "trip_id": "2ffac488-29f0-4af2-bcad-5f11ad6b3ed5",
  "trip_phase": "TO_PICKUP"
}
```

## Piotr cancels at the rider's request (sandbox clean-up)

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "2ffac488-29f0-4af2-bcad-5f11ad6b3ed5",
  "order_id": "9613c434-be61-4e20-8be4-64291d64f657",
  "assignment_id": "e34f695b-9dd3-4c53-ae17-bf7987de34e2",
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

`POST /api/driver/v1/trips/2ffac488-29f0-4af2-bcad-5f11ad6b3ed5/cancel` → **200**

```json
{
  "command_id": "456a8d23-5f55-4ffc-8204-aaff3c3375b1",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "2ffac488-29f0-4af2-bcad-5f11ad6b3ed5",
  "order_id": "9613c434-be61-4e20-8be4-64291d64f657",
  "assignment_id": "e34f695b-9dd3-4c53-ae17-bf7987de34e2",
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

`GET /api/rider/v1/orders/9613c434-be61-4e20-8be4-64291d64f657` → **200**

```json
{
  "id": "9613c434-be61-4e20-8be4-64291d64f657",
  "short_number": 4,
  "status": "CANCELLED",
  "status_reason": "PASSENGER_ASKED",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "17f4e680-ad32-443c-bcc9-8e9c82af11cf",
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
    "id": "e34f695b-9dd3-4c53-ae17-bf7987de34e2",
    "order_id": "9613c434-be61-4e20-8be4-64291d64f657",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "vehicle_id": "5a000000-0000-4000-8000-000000000504",
    "source": "BROADCAST",
    "state": "RELEASED",
    "trip_id": "2ffac488-29f0-4af2-bcad-5f11ad6b3ed5",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T19:29:10.211625Z",
  "cancellation": {
    "by": "DRIVER",
    "reason_code": "PASSENGER_ASKED",
    "reason_labels": {
      "uk": "Пасажир попросив скасувати",
      "pl": "Pasażer poprosił o anulowanie",
      "ru": "Пассажир попросил отменить",
      "en": "Passenger asked to cancel"
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
  "session_id": "65d2e210-ab1b-4c72-a6e7-b8ba942ea45f",
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
  "last_heartbeat_at": "2026-10-30T19:29:08.972417Z",
  "last_location_at": "2026-10-30T19:29:08.972417Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/65d2e210-ab1b-4c72-a6e7-b8ba942ea45f/close` → **200**

```json
{
  "command_id": "898ae1c0-b80b-40d0-ab38-5dbd6f8c84c4",
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
  "session_id": "c8d5ea07-4310-40be-a5b0-93dea1792d08",
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
  "last_heartbeat_at": "2026-10-30T19:29:21.260109Z",
  "last_location_at": "2026-10-30T19:29:21.260109Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c8d5ea07-4310-40be-a5b0-93dea1792d08/close` → **200**

```json
{
  "command_id": "04e2ffbb-4291-409e-904e-f08c12475bc5",
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
  "session_id": "9f6df709-8f7b-4f8d-9a74-e0450bbe256a",
  "subject": {
    "type": "STAFF",
    "id": "bbeb0bd1-546e-4687-8aa4-9df00ff27005"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYmViMGJkMS01NDZlLTQ2ODctOGFhNC05ZGYwMGZmMjcwMDUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODk0NjQsImlhdCI6MTc5MzM4ODU2NCwianRpIjoiYTgzY2YwNTAtYTkzMi00ZTM1LWJhY2UtY2FkZDZkNWM3ODc0Iiwic2lkIjoiOWY2ZGY3MDktOGY3Yi00ZjhkLTlhNzQtZTA0NTBiYmUyNTZhIn0.6gtucJeBKTSxAz3ZUakHUk5lnJ2FtLQbcD3fIag7wiQ",
  "access_expires_at": "2026-10-30T19:44:24.867034807Z",
  "refresh_token": "hUGg5d49M5y4Yu0XOub8qnojjjUdHfX0AOW1OXg9k80",
  "refresh_expires_at": "2026-10-31T07:29:24.86641044Z",
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
  "command_id": "e0b85964-0d4f-4ac1-8714-77706ed4d1ee",
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
  "session_id": "7c337452-94e0-4295-8d19-b8b2ade641ff",
  "subject": {
    "type": "STAFF",
    "id": "bbeb0bd1-546e-4687-8aa4-9df00ff27005"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYmViMGJkMS01NDZlLTQ2ODctOGFhNC05ZGYwMGZmMjcwMDUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODk0NjYsImlhdCI6MTc5MzM4ODU2NiwianRpIjoiNGIxMDZmZTYtOTcyNS00MWZjLTkwMmUtN2Q1ZGNlMjA5ZmZkIiwic2lkIjoiN2MzMzc0NTItOTRlMC00Mjk1LThkMTktYjhiMmFkZTY0MWZmIn0.Z1Z7Zf-Qc25tx8_7zZ8_8bwpAqvCVfQa_WXhWLuRZz8",
  "access_expires_at": "2026-10-30T19:44:26.078929863Z",
  "refresh_token": "lfrh1kaNhzvaS55jfbLdEFd1heCQSAPVIs4eDs2YSig",
  "refresh_expires_at": "2026-10-31T07:29:26.078358134Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.681826777",
    "linkedid": "1730052700.681826777",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380672327504"
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
    "id": "1730052700.681826777",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "1e01fa1c-a1af-4be4-a896-5d59d8cf1c04",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380672327504",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T19:29:26.360445Z",
      "answered_at": null,
      "ended_at": "2026-10-30T19:29:26.384841Z",
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
    "id": "1730052600.1717630695",
    "linkedid": "1730052600.1717630695",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380672327504"
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
      "id": "7c20f595-bff8-4582-bb32-07cef970fae6",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380672327504",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T19:29:26.710958Z",
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

`POST /api/operator/v1/calls/7c20f595-bff8-4582-bb32-07cef970fae6/answer` → **200**

```json
{
  "command_id": "9309ea6e-5a1b-4cdd-8686-d5913876da9c"
}
```

```json
{
  "id": "7c20f595-bff8-4582-bb32-07cef970fae6",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380672327504",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "bbeb0bd1-546e-4687-8aa4-9df00ff27005",
  "order_ids": [],
  "started_at": "2026-10-30T19:29:26.710958Z",
  "answered_at": "2026-10-30T19:29:27.038743Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.1717630695",
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
    "id": "1730052600.1717630695",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "7c20f595-bff8-4582-bb32-07cef970fae6",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672327504",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "bbeb0bd1-546e-4687-8aa4-9df00ff27005",
      "order_ids": [],
      "started_at": "2026-10-30T19:29:26.710958Z",
      "answered_at": "2026-10-30T19:29:27.038743Z",
      "ended_at": "2026-10-30T19:29:27.352751Z",
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
      "id": "7c20f595-bff8-4582-bb32-07cef970fae6",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672327504",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "bbeb0bd1-546e-4687-8aa4-9df00ff27005",
      "order_ids": [],
      "started_at": "2026-10-30T19:29:26.710958Z",
      "answered_at": "2026-10-30T19:29:27.038743Z",
      "ended_at": "2026-10-30T19:29:27.352751Z",
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
      "id": "7c20f595-bff8-4582-bb32-07cef970fae6",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672327504",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "bbeb0bd1-546e-4687-8aa4-9df00ff27005",
      "order_ids": [],
      "started_at": "2026-10-30T19:29:26.710958Z",
      "answered_at": "2026-10-30T19:29:27.038743Z",
      "ended_at": "2026-10-30T19:29:27.352751Z",
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
      "id": "7c20f595-bff8-4582-bb32-07cef970fae6",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672327504",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "bbeb0bd1-546e-4687-8aa4-9df00ff27005",
      "order_ids": [],
      "started_at": "2026-10-30T19:29:26.710958Z",
      "answered_at": "2026-10-30T19:29:27.038743Z",
      "ended_at": "2026-10-30T19:29:27.352751Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T19:29:33.287134Z"
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
      "id": "7c20f595-bff8-4582-bb32-07cef970fae6",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672327504",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "bbeb0bd1-546e-4687-8aa4-9df00ff27005",
      "order_ids": [],
      "started_at": "2026-10-30T19:29:26.710958Z",
      "answered_at": "2026-10-30T19:29:27.038743Z",
      "ended_at": "2026-10-30T19:29:27.352751Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T19:29:33.287134Z"
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

`GET /api/operator/v1/calls/7c20f595-bff8-4582-bb32-07cef970fae6/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/7c20f595-bff8-4582-bb32-07cef970fae6/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=7c20f595-bff8-4582-bb32-07cef970fae6` → **200**

```json
{
  "changes": [
    {
      "id": "bb954212-6d6b-488d-8195-40463f4e6b5d",
      "occurred_at": "2026-10-30T19:29:34.923171Z",
      "actor_type": "STAFF",
      "actor_id": "bbeb0bd1-546e-4687-8aa4-9df00ff27005",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "7c20f595-bff8-4582-bb32-07cef970fae6",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"0523e489-8cde-430b-8b45-79bbf8006bed\", \"order_ids\": []}",
      "correlation_id": "73fb2bc7-47d5-4de6-a3ca-805763d0ac8f"
    },
    {
      "id": "582c853b-d466-4ca9-8c9d-ea5dcc8be3a8",
      "occurred_at": "2026-10-30T19:29:34.891582Z",
      "actor_type": "STAFF",
      "actor_id": "bbeb0bd1-546e-4687-8aa4-9df00ff27005",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "7c20f595-bff8-4582-bb32-07cef970fae6",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"0523e489-8cde-430b-8b45-79bbf8006bed\", \"order_ids\": []}",
      "correlation_id": "2c28a070-2548-4441-b01a-c085de326fcb"
    }
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
```

Done: call 7c20f595-bff8-4582-bb32-07cef970fae6 recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-22184"
}
```

```json
{
  "challenge_id": "a57bd6f9-0716-4ac5-9de8-c6e574895ca6",
  "expires_at": "2026-10-30T19:34:35.275975726Z",
  "resend_available_at": "2026-10-30T19:29:36.275975726Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "417336",
  "sent_at": "2026-10-30T19:29:35.279958892Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a57bd6f9-0716-4ac5-9de8-c6e574895ca6",
  "code": "417336",
  "device_ref": "sandbox-22184"
}
```

```json
{
  "session_id": "546f2576-ee32-4dba-98ea-53ea77a34eb9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4OTQ3NSwiaWF0IjoxNzkzMzg4NTc1LCJqdGkiOiI1ZmY1ZmMxMS1hMmVmLTRlNDUtYWJlMS1mMzlmZmRiZjFhZjMiLCJzaWQiOiI1NDZmMjU3Ni1lZTMyLTRkYmEtOThlYS01M2VhNzdhMzRlYjkifQ.DnGa2a498jsJC_79NiP3GfnuReKRotVFFWzQtU9uss0",
  "access_expires_at": "2026-10-30T19:44:35.611259059Z",
  "refresh_token": "-Ey0KXA6URJo6kG_u8piQEQoofU9z3RvzO5O9WF_0UA",
  "refresh_expires_at": "2026-11-29T19:29:35.610491622Z",
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
  "command_id": "42673426-3855-4afb-96f7-19f69c3c6a0f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:29:36Z",
    "sequence": 1793388576218
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e6a6d307-c214-40f1-af15-62be9369fe70",
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
  "last_heartbeat_at": "2026-10-30T19:29:36.23805Z",
  "last_location_at": "2026-10-30T19:29:36.23805Z",
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
  "session_id": "e6acf71e-924b-4d11-a51f-bbc253dadf60",
  "subject": {
    "type": "STAFF",
    "id": "bbeb0bd1-546e-4687-8aa4-9df00ff27005"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYmViMGJkMS01NDZlLTQ2ODctOGFhNC05ZGYwMGZmMjcwMDUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODk0NzYsImlhdCI6MTc5MzM4ODU3NiwianRpIjoiZWZiYjdmYjYtNTE4OC00OGU0LWE5NzktYzE0MzA5OTdhNWNjIiwic2lkIjoiZTZhY2Y3MWUtOTI0Yi00ZDExLWE1MWYtYmJjMjUzZGFkZjYwIn0.HQ7QTVCiGcpdhd7qy57u3Cm0mlZ8e9NQW8ZDYyv1MdQ",
  "access_expires_at": "2026-10-30T19:44:36.835935848Z",
  "refresh_token": "Rvq1zdvHfe_Mm4V_yrgDiJvcqmtxwoVPiJJROYoBM5k",
  "refresh_expires_at": "2026-10-31T07:29:36.835266611Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "524bf79e-3b54-433f-8ce3-7fed4c5b51e2",
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
  "id": "bbd3d6a3-a28d-485d-8f28-ea91ad20d034",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T19:34:37.139739Z",
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
  "command_id": "ef1b7b4d-a40e-48ed-9da2-b5f3a42572e4",
  "quote_id": "bbd3d6a3-a28d-485d-8f28-ea91ad20d034",
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
    "phone": "+380672407509"
  }
}
```

```json
{
  "id": "79dff704-8e29-4fa3-91e6-51a4bdee200b",
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
  "created_at": "2026-10-30T19:29:37.466866Z",
  "caller": {
    "name": "Олена",
    "phone": "+380672407509"
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
    "id": "461b9ce4-c182-4e2b-acf6-3bc6ada89d4c",
    "order_id": "79dff704-8e29-4fa3-91e6-51a4bdee200b",
    "expires_at": "2026-10-30T19:29:52.472311Z",
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

`POST /api/driver/v1/offers/461b9ce4-c182-4e2b-acf6-3bc6ada89d4c/accept` → **200**

```json
{
  "command_id": "8a36b0ad-c506-43c3-a337-2a9d27fa6a63"
}
```

```json
{
  "id": "e75d05ff-9f13-43d8-9e19-284f372ed4d8",
  "order_id": "79dff704-8e29-4fa3-91e6-51a4bdee200b",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "86429bbe-b8cc-45d8-b6f7-5b4ed3b5be2b",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380672407509` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380672407509` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380672407509` → **200**

```json
[
  {
    "phone": "+380672407509",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T19:29:39.955876855Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380672407509` → **200**

```json
[
  {
    "phone": "+380672407509",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T19:29:39.955876855Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380672407509` → **200**

```json
[
  {
    "phone": "+380672407509",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T19:29:39.955876855Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "86429bbe-b8cc-45d8-b6f7-5b4ed3b5be2b",
  "order_id": "79dff704-8e29-4fa3-91e6-51a4bdee200b",
  "assignment_id": "e75d05ff-9f13-43d8-9e19-284f372ed4d8",
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
    "phone": "+380672407509"
  }
}
```

`POST /api/driver/v1/work-sessions/e6a6d307-c214-40f1-af15-62be9369fe70/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:29:40Z",
    "sequence": 1793388580821
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e6a6d307-c214-40f1-af15-62be9369fe70",
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
  "last_heartbeat_at": "2026-10-30T19:29:40.841801Z",
  "last_location_at": "2026-10-30T19:29:40.841801Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/86429bbe-b8cc-45d8-b6f7-5b4ed3b5be2b/arrive` → **200**

```json
{
  "command_id": "c315bb0c-d4e0-4a79-aeca-4543eee09545",
  "expected_version": 0
}
```

```json
{
  "id": "86429bbe-b8cc-45d8-b6f7-5b4ed3b5be2b",
  "order_id": "79dff704-8e29-4fa3-91e6-51a4bdee200b",
  "assignment_id": "e75d05ff-9f13-43d8-9e19-284f372ed4d8",
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
  "arrived_at": "2026-10-30T19:29:41.144368Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380672407509"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380672407509` → **200**

```json
[
  {
    "phone": "+380672407509",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T19:29:39.955876855Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380672407509` → **200**

```json
[
  {
    "phone": "+380672407509",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T19:29:39.955876855Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380672407509` → **200**

```json
[
  {
    "phone": "+380672407509",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T19:29:39.955876855Z"
  },
  {
    "phone": "+380672407509",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T19:29:42.96495935Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380672407509` → **200**

```json
[
  {
    "phone": "+380672407509",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T19:29:39.955876855Z"
  },
  {
    "phone": "+380672407509",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T19:29:42.96495935Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380672407509` → **200**

```json
[
  {
    "phone": "+380672407509",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T19:29:39.955876855Z"
  },
  {
    "phone": "+380672407509",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T19:29:42.96495935Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/86429bbe-b8cc-45d8-b6f7-5b4ed3b5be2b/start` → **200**

```json
{
  "command_id": "098b01bf-d325-4dbb-8fd6-96e38fd3f52c",
  "expected_version": 1
}
```

```json
{
  "id": "86429bbe-b8cc-45d8-b6f7-5b4ed3b5be2b",
  "order_id": "79dff704-8e29-4fa3-91e6-51a4bdee200b",
  "assignment_id": "e75d05ff-9f13-43d8-9e19-284f372ed4d8",
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
  "arrived_at": "2026-10-30T19:29:41.144368Z",
  "started_at": "2026-10-30T19:29:43.582821Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380672407509"
  }
}
```

`POST /api/driver/v1/trips/86429bbe-b8cc-45d8-b6f7-5b4ed3b5be2b/complete` → **200**

```json
{
  "command_id": "106f3004-2964-4d8f-8359-7fc655dea3d6",
  "expected_version": 2,
  "reported_at": "2026-10-30T19:29:43Z",
  "cash_received": true
}
```

```json
{
  "id": "86429bbe-b8cc-45d8-b6f7-5b4ed3b5be2b",
  "order_id": "79dff704-8e29-4fa3-91e6-51a4bdee200b",
  "assignment_id": "e75d05ff-9f13-43d8-9e19-284f372ed4d8",
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
  "arrived_at": "2026-10-30T19:29:41.144368Z",
  "started_at": "2026-10-30T19:29:43.582821Z",
  "completed_at": "2026-10-30T19:29:43.901527Z",
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
  "session_id": "e6a6d307-c214-40f1-af15-62be9369fe70",
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
  "last_heartbeat_at": "2026-10-30T19:29:40.841801Z",
  "last_location_at": "2026-10-30T19:29:40.841801Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e6a6d307-c214-40f1-af15-62be9369fe70/close` → **200**

```json
{
  "command_id": "817d0d6f-6da6-48a4-9d02-18ff1d19d8c6",
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
  "phone": "+380632002499",
  "device_ref": "sandbox-28105"
}
```

```json
{
  "challenge_id": "c341e2d2-d89f-46fe-936f-ea171b0a4d23",
  "expires_at": "2026-10-30T19:34:44.80739552Z",
  "resend_available_at": "2026-10-30T19:29:45.80739552Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632002499` → **200**

```json
{
  "phone": "+380632002499",
  "audience": "CLIENT",
  "code": "202501",
  "sent_at": "2026-10-30T19:29:44.811787052Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c341e2d2-d89f-46fe-936f-ea171b0a4d23",
  "code": "202501",
  "device_ref": "sandbox-28105"
}
```

```json
{
  "session_id": "e59a3b8b-f3a4-4382-8a05-47bbc2db5e75",
  "subject": {
    "type": "CLIENT",
    "id": "7e782d25-8550-4607-9692-95170188a89d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZTc4MmQyNS04NTUwLTQ2MDctOTY5Mi05NTE3MDE4OGE4OWQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzg5NDg1LCJpYXQiOjE3OTMzODg1ODUsImp0aSI6ImEzNjQyYTJkLWQyNTAtNGNiMS1iZmYwLWQwZDUxZjEyN2NiNSIsInNpZCI6ImU1OWEzYjhiLWYzYTQtNDM4Mi04YTA1LTQ3YmJjMmRiNWU3NSJ9.hXfPgJ0PRU24sKcHyfJZLiLx7mM7ZsudE4K7bYLnOSw",
  "access_expires_at": "2026-10-30T19:44:45.125397805Z",
  "refresh_token": "sh4ykEo8sx_HOw1D3vvOKl1XfcrqmFK2nRDZ3JyE8kU",
  "refresh_expires_at": "2026-11-29T19:29:45.124833275Z",
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
        "uk": "Передумав їхати",
        "pl": "Zmiana planów",
        "ru": "Передумал ехать",
        "en": "Changed my mind"
      },
      "driver_outcome": null
    },
    {
      "code": "WAIT_TOO_LONG",
      "labels": {
        "uk": "Довго чекати авто",
        "pl": "Zbyt długie oczekiwanie",
        "ru": "Долго ждать машину",
        "en": "The wait is too long"
      },
      "driver_outcome": null
    },
    {
      "code": "WRONG_ADDRESS",
      "labels": {
        "uk": "Помилився адресою",
        "pl": "Błędny adres",
        "ru": "Ошибся адресом",
        "en": "Wrong address"
      },
      "driver_outcome": null
    },
    {
      "code": "OTHER_TRANSPORT",
      "labels": {
        "uk": "Поїду іншим транспортом",
        "pl": "Inny transport",
        "ru": "Уеду на другом транспорте",
        "en": "Found other transport"
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
  "device_ref": "sandbox-25169"
}
```

```json
{
  "challenge_id": "0b904071-a3b7-49e6-af19-795049651f58",
  "expires_at": "2026-10-30T19:34:45.726124201Z",
  "resend_available_at": "2026-10-30T19:29:46.726124201Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "960300",
  "sent_at": "2026-10-30T19:29:45.728743066Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0b904071-a3b7-49e6-af19-795049651f58",
  "code": "960300",
  "device_ref": "sandbox-25169"
}
```

```json
{
  "session_id": "e174af20-d533-4c01-ae0b-93d2c948fdb1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4OTQ4NiwiaWF0IjoxNzkzMzg4NTg2LCJqdGkiOiJjNzM5MWFlMC01ZmViLTQxNWQtODI4Ni0xZWM1NDQ1YzU5ZGQiLCJzaWQiOiJlMTc0YWYyMC1kNTMzLTRjMDEtYWUwYi05M2QyYzk0OGZkYjEifQ.sm-CS_OcFwEnb3n56O7QaRlD-PLERGCZNYT44yMFvlQ",
  "access_expires_at": "2026-10-30T19:44:46.048298293Z",
  "refresh_token": "MtAEtErpKWz2o7Rn3OIypP7Iu8WTP80vlXJ6BwHIXrI",
  "refresh_expires_at": "2026-11-29T19:29:46.047761399Z",
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
        "uk": "Пасажир не вийшов",
        "pl": "Pasażer nie przyszedł",
        "ru": "Пассажир не вышел",
        "en": "Passenger did not show up"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "PASSENGER_ASKED",
      "labels": {
        "uk": "Пасажир попросив скасувати",
        "pl": "Pasażer poprosił o anulowanie",
        "ru": "Пассажир попросил отменить",
        "en": "Passenger asked to cancel"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "VEHICLE_PROBLEM",
      "labels": {
        "uk": "Несправність автомобіля",
        "pl": "Awaria samochodu",
        "ru": "Неисправность автомобиля",
        "en": "Vehicle problem"
      },
      "driver_outcome": "RETURN_TO_SEARCH"
    },
    {
      "code": "CANNOT_REACH",
      "labels": {
        "uk": "Не можу під'їхати",
        "pl": "Nie mogę dojechać",
        "ru": "Не могу подъехать",
        "en": "Cannot reach the pickup"
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
  "session_id": "0382efcb-1eac-46ca-bcb9-ace24dc433ba",
  "subject": {
    "type": "STAFF",
    "id": "bbeb0bd1-546e-4687-8aa4-9df00ff27005"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYmViMGJkMS01NDZlLTQ2ODctOGFhNC05ZGYwMGZmMjcwMDUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODk0ODYsImlhdCI6MTc5MzM4ODU4NiwianRpIjoiZGZiNWI5ZmEtMzE2Ni00ZTNlLTgxYWUtZTc2YjFjNTdlMGJhIiwic2lkIjoiMDM4MmVmY2ItMWVhYy00NmNhLWJjYjktYWNlMjRkYzQzM2JhIn0.Or7xdKpTxixy0Xbe6K9g8-JdefGJ7ucqSc7LWNhN_Jg",
  "access_expires_at": "2026-10-30T19:44:46.928004166Z",
  "refresh_token": "hEBbV5SloU_dtdym-Z8OmEd35mUTT3rmW3OxaSX8A_M",
  "refresh_expires_at": "2026-10-31T07:29:46.927307654Z",
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
  "session_id": "f6e824ee-d670-4354-952e-4c9461dc928b",
  "subject": {
    "type": "STAFF",
    "id": "bbeb0bd1-546e-4687-8aa4-9df00ff27005"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYmViMGJkMS01NDZlLTQ2ODctOGFhNC05ZGYwMGZmMjcwMDUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODk0ODcsImlhdCI6MTc5MzM4ODU4NywianRpIjoiY2YzOGE1MWItNjY2Yi00NzI5LTljY2QtYjJiNDdlMjcwYjA3Iiwic2lkIjoiZjZlODI0ZWUtZDY3MC00MzU0LTk1MmUtNGM5NDYxZGM5MjhiIn0.HmeHtKnMgALZpiOq8pYqPPe66e2PunvogD26318v5ZU",
  "access_expires_at": "2026-10-30T19:44:47.51112192Z",
  "refresh_token": "l_sAtl0uXvMQU2SmgfJsLiQXXjibC21MSJMNv7CHN98",
  "refresh_expires_at": "2026-10-31T07:29:47.510568134Z",
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
        "uk": "Пасажир попросив",
        "pl": "Na prośbę pasażera",
        "ru": "Пассажир попросил",
        "en": "Passenger asked"
      },
      "driver_outcome": null
    },
    {
      "code": "DUPLICATE",
      "labels": {
        "uk": "Дубль замовлення",
        "pl": "Duplikat zamówienia",
        "ru": "Дубль заказа",
        "en": "Duplicate order"
      },
      "driver_outcome": null
    },
    {
      "code": "NO_CARS",
      "labels": {
        "uk": "Немає вільних авто",
        "pl": "Brak wolnych aut",
        "ru": "Нет свободных машин",
        "en": "No cars available"
      },
      "driver_outcome": null
    },
    {
      "code": "TEST_ORDER",
      "labels": {
        "uk": "Тестове замовлення",
        "pl": "Zamówienie testowe",
        "ru": "Тестовый заказ",
        "en": "Test order"
      },
      "driver_outcome": null
    },
    {
      "code": "OPERATOR_ERROR",
      "labels": {
        "uk": "Помилка оператора",
        "pl": "Błąd operatora",
        "ru": "Ошибка оператора",
        "en": "Operator error"
      },
      "driver_outcome": null
    },
    {
      "code": "VEHICLE_BREAKDOWN",
      "labels": {
        "uk": "Поломка автомобіля в дорозі",
        "pl": "Awaria auta w trasie",
        "ru": "Поломка автомобиля в пути",
        "en": "Vehicle broke down on the way"
      },
      "driver_outcome": null
    },
    {
      "code": "ACCIDENT",
      "labels": {
        "uk": "ДТП",
        "pl": "Wypadek",
        "ru": "ДТП",
        "en": "Accident"
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
  "command_id": "1b147926-275c-4e41-b5d2-568618e1d7e1",
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
  "id": "465c0c98-ab04-466b-ad39-30c4d188cf43",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T19:34:48.093356Z",
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
  "command_id": "ddc311e9-b830-4225-a92d-7a20bb9ec56a",
  "quote_id": "465c0c98-ab04-466b-ad39-30c4d188cf43",
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
  "id": "2ceaf072-d17e-4d91-a58a-e72396c70654",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7e782d25-8550-4607-9692-95170188a89d",
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
  "created_at": "2026-10-30T19:29:48.416099Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2ceaf072-d17e-4d91-a58a-e72396c70654` → **200**

```json
{
  "id": "2ceaf072-d17e-4d91-a58a-e72396c70654",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7e782d25-8550-4607-9692-95170188a89d",
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
  "created_at": "2026-10-30T19:29:48.416099Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/2ceaf072-d17e-4d91-a58a-e72396c70654/cancel` → **200**

```json
{
  "command_id": "ffaaa82b-3b94-4f6c-84d1-e933e3cafe14",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "2ceaf072-d17e-4d91-a58a-e72396c70654",
  "short_number": 6,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "7e782d25-8550-4607-9692-95170188a89d",
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
  "created_at": "2026-10-30T19:29:48.416099Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "WAIT_TOO_LONG",
    "reason_labels": {
      "uk": "Довго чекати авто",
      "pl": "Zbyt długie oczekiwanie",
      "ru": "Долго ждать машину",
      "en": "The wait is too long"
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
  "command_id": "af6f1732-0ed3-4c93-b994-977079659107",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:29:49Z",
    "sequence": 1793388589734
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "e0a862e6-3f0d-4e9f-838a-9a47053bfd74",
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
  "last_heartbeat_at": "2026-10-30T19:29:49.755815Z",
  "last_location_at": "2026-10-30T19:29:49.755815Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-4142"
}
```

```json
{
  "challenge_id": "01823e04-7447-415b-aebc-bd5869c816fa",
  "expires_at": "2026-10-30T19:34:50.053736975Z",
  "resend_available_at": "2026-10-30T19:29:51.053736975Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "529647",
  "sent_at": "2026-10-30T19:29:50.05663377Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "01823e04-7447-415b-aebc-bd5869c816fa",
  "code": "529647",
  "device_ref": "sandbox-4142"
}
```

```json
{
  "session_id": "e11610f7-574d-4a07-9097-0545cf20ea54",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4OTQ5MCwiaWF0IjoxNzkzMzg4NTkwLCJqdGkiOiIwODJkYThmOS1kNmU4LTRkNzUtYThmYi05NDE4NjU3M2UzODIiLCJzaWQiOiJlMTE2MTBmNy01NzRkLTRhMDctOTA5Ny0wNTQ1Y2YyMGVhNTQifQ.ZGl9UsYPwSq_3gnwYo_QeE1_nP66AGs5_YZFYvZr_h8",
  "access_expires_at": "2026-10-30T19:44:50.373616693Z",
  "refresh_token": "AH4ZiL8oiZTbSxDj-GY9Bw3f3E2AOMTyzeBd7ahyF_I",
  "refresh_expires_at": "2026-11-29T19:29:50.372927121Z",
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
  "command_id": "8de5412f-2e3e-4259-a283-510d4976cf48",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:29:50Z",
    "sequence": 1793388590977
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "443ba053-247d-461c-b2e2-8079b0455d9b",
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
  "last_heartbeat_at": "2026-10-30T19:29:50.997913Z",
  "last_location_at": "2026-10-30T19:29:50.997913Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "55583593-d7c8-4deb-85ca-651870ccd08a",
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
  "id": "d9df49a0-4619-4413-9220-4125b77ae8e1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T19:34:51.300929Z",
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
  "command_id": "cc95d712-4d79-419f-b359-ed1d82c7d0ad",
  "quote_id": "d9df49a0-4619-4413-9220-4125b77ae8e1",
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
  "id": "40784ecd-9f2c-4e59-87cd-0c7d00f6095c",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7e782d25-8550-4607-9692-95170188a89d",
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
  "created_at": "2026-10-30T19:29:51.612062Z",
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
    "id": "ee2a5fed-36e2-4b6c-bc4b-fb517682712a",
    "order_id": "40784ecd-9f2c-4e59-87cd-0c7d00f6095c",
    "expires_at": "2026-10-30T19:30:06.615613Z",
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

`POST /api/driver/v1/offers/ee2a5fed-36e2-4b6c-bc4b-fb517682712a/accept` → **200**

```json
{
  "command_id": "075614f7-6561-4dbb-bbb6-035561c3947e"
}
```

```json
{
  "id": "c197e559-9044-4d60-9552-ec6b2321eda9",
  "order_id": "40784ecd-9f2c-4e59-87cd-0c7d00f6095c",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c7193990-296d-4891-959e-e6166877e576",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c7193990-296d-4891-959e-e6166877e576",
  "order_id": "40784ecd-9f2c-4e59-87cd-0c7d00f6095c",
  "assignment_id": "c197e559-9044-4d60-9552-ec6b2321eda9",
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

`POST /api/driver/v1/trips/c7193990-296d-4891-959e-e6166877e576/cancel` → **200**

```json
{
  "command_id": "2a570801-054e-4118-9d72-66c791140c17",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "c7193990-296d-4891-959e-e6166877e576",
  "order_id": "40784ecd-9f2c-4e59-87cd-0c7d00f6095c",
  "assignment_id": "c197e559-9044-4d60-9552-ec6b2321eda9",
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

`GET /api/rider/v1/orders/40784ecd-9f2c-4e59-87cd-0c7d00f6095c` → **200**

```json
{
  "id": "40784ecd-9f2c-4e59-87cd-0c7d00f6095c",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "7e782d25-8550-4607-9692-95170188a89d",
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
    "id": "c197e559-9044-4d60-9552-ec6b2321eda9",
    "order_id": "40784ecd-9f2c-4e59-87cd-0c7d00f6095c",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "c7193990-296d-4891-959e-e6166877e576",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T19:29:51.612062Z",
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
    "id": "d6d3c4c3-2a6d-45bc-8dc7-210f0fcd61d6",
    "order_id": "40784ecd-9f2c-4e59-87cd-0c7d00f6095c",
    "expires_at": "2026-10-30T19:30:07.853516Z",
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

`POST /api/driver/v1/offers/d6d3c4c3-2a6d-45bc-8dc7-210f0fcd61d6/accept` → **200**

```json
{
  "command_id": "643264f7-6d8b-49fb-b617-8161827ad8ef"
}
```

```json
{
  "id": "a75406a2-da0e-4c08-ae2b-ca2862b3c209",
  "order_id": "40784ecd-9f2c-4e59-87cd-0c7d00f6095c",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e693a562-43ec-4fb8-8bef-9fbbf1b0001f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e693a562-43ec-4fb8-8bef-9fbbf1b0001f",
  "order_id": "40784ecd-9f2c-4e59-87cd-0c7d00f6095c",
  "assignment_id": "a75406a2-da0e-4c08-ae2b-ca2862b3c209",
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

`POST /api/driver/v1/trips/e693a562-43ec-4fb8-8bef-9fbbf1b0001f/cancel` → **200**

```json
{
  "command_id": "64463b49-47e9-4c86-acfa-8e4bde4428d2",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "e693a562-43ec-4fb8-8bef-9fbbf1b0001f",
  "order_id": "40784ecd-9f2c-4e59-87cd-0c7d00f6095c",
  "assignment_id": "a75406a2-da0e-4c08-ae2b-ca2862b3c209",
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
      "id": "40784ecd-9f2c-4e59-87cd-0c7d00f6095c",
      "short_number": 7,
      "status": "CANCELLED",
      "created_at": "2026-10-30T19:29:51.612062Z",
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
          "uk": "Пасажир попросив скасувати",
          "pl": "Pasażer poprosił o anulowanie",
          "ru": "Пассажир попросил отменить",
          "en": "Passenger asked to cancel"
        }
      },
      "pickup_at": null
    },
    {
      "id": "2ceaf072-d17e-4d91-a58a-e72396c70654",
      "short_number": 6,
      "status": "CANCELLED",
      "created_at": "2026-10-30T19:29:48.416099Z",
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
          "uk": "Довго чекати авто",
          "pl": "Zbyt długie oczekiwanie",
          "ru": "Долго ждать машину",
          "en": "The wait is too long"
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

`GET /api/operator/v1/orders/40784ecd-9f2c-4e59-87cd-0c7d00f6095c/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T19:29:51.612747Z",
      "actor": {
        "type": "CLIENT",
        "id": "7e782d25-8550-4607-9692-95170188a89d",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "40784ecd-9f2c-4e59-87cd-0c7d00f6095c",
        "quote_id": "d9df49a0-4619-4413-9220-4125b77ae8e1",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "ee41107d-27be-4b79-be63-2737787cfc34"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T19:29:51.614759Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "40784ecd-9f2c-4e59-87cd-0c7d00f6095c",
        "attempt_id": "71149424-3b54-4afe-aaaa-b8358fc17b7e",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "ee41107d-27be-4b79-be63-2737787cfc34"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T19:29:51.640639Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "ee2a5fed-36e2-4b6c-bc4b-fb517682712a",
        "order_id": "40784ecd-9f2c-4e59-87cd-0c7d00f6095c",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "ee41107d-27be-4b79-be63-2737787cfc34"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T19:29:52.251818Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "ee2a5fed-36e2-4b6c-bc4b-fb517682712a",
        "order_id": "40784ecd-9f2c-4e59-87cd-0c7d00f6095c",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "c197e559-9044-4d60-9552-ec6b2321eda9"
      },
      "correlation_id": "42be0d92-98ab-44e4-b1d8-ef9d3dafd95a"
```

Done: orders 2ceaf072-d17e-4d91-a58a-e72396c70654, 40784ecd-9f2c-4e59-87cd-0c7d00f6095c.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380733850432",
  "device_ref": "sandbox-2780"
}
```

```json
{
  "challenge_id": "b14e2eb2-c9fa-434e-ba32-d478580d3763",
  "expires_at": "2026-10-30T19:34:55.300916733Z",
  "resend_available_at": "2026-10-30T19:29:56.300916733Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380733850432` → **200**

```json
{
  "phone": "+380733850432",
  "audience": "CLIENT",
  "code": "016317",
  "sent_at": "2026-10-30T19:29:55.303920269Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b14e2eb2-c9fa-434e-ba32-d478580d3763",
  "code": "016317",
  "device_ref": "sandbox-2780"
}
```

```json
{
  "session_id": "b8440b3d-5351-44b9-8b70-2193df655a30",
  "subject": {
    "type": "CLIENT",
    "id": "8e2dd573-fad7-463b-ad89-e4565301bc36"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZTJkZDU3My1mYWQ3LTQ2M2ItYWQ4OS1lNDU2NTMwMWJjMzYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzg5NDk1LCJpYXQiOjE3OTMzODg1OTUsImp0aSI6IjkxZjBiNDk3LWM4NmYtNGQ2MC1hYzRkLTVhZTY1NjEwYWM4NCIsInNpZCI6ImI4NDQwYjNkLTUzNTEtNDRiOS04YjcwLTIxOTNkZjY1NWEzMCJ9.bE4LpsPEubtb8T5dx6jCqEwE94Fzp5RdPnmJuNNMmOY",
  "access_expires_at": "2026-10-30T19:44:55.632866115Z",
  "refresh_token": "oG-qsCgQtcQRJMrcCeNcskZxxJNFMKop_5dOTJA1YJg",
  "refresh_expires_at": "2026-11-29T19:29:55.63222284Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "55674c64-58e8-4a36-8d6c-aae74fc3e4ac",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "d3c9bd0d-07b3-42d7-b5f4-c1d90dcffc2c",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-d3c9bd0d-07b3-42d7-b5f4-c1d90dcffc2c",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "954c562f75b42b0448f876eb733e4bae",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=d3c9bd0d-07b3-42d7-b5f4-c1d90dcffc2c",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380733850432"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=d3c9bd0d-07b3-42d7-b5f4-c1d90dcffc2c",
  "expires_at": "2026-10-30T19:59:55.932916Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/d3c9bd0d-07b3-42d7-b5f4-c1d90dcffc2c` → **200**

```json
{
  "id": "d3c9bd0d-07b3-42d7-b5f4-c1d90dcffc2c",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T19:59:55.932916Z",
  "card": {
    "id": "86a54445-ce26-4b63-aede-ba9828ad5925",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****6008",
    "card_type": "Visa",
    "created_at": "2026-10-30T19:29:56.246049Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "86a54445-ce26-4b63-aede-ba9828ad5925",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****6008",
      "card_type": "Visa",
      "created_at": "2026-10-30T19:29:56.246049Z"
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
  "device_ref": "sandbox-27846"
}
```

```json
{
  "challenge_id": "1c869417-31f9-4f10-b628-9043d933ee0f",
  "expires_at": "2026-10-30T19:34:56.85041193Z",
  "resend_available_at": "2026-10-30T19:29:57.85041193Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "138334",
  "sent_at": "2026-10-30T19:29:56.853011643Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1c869417-31f9-4f10-b628-9043d933ee0f",
  "code": "138334",
  "device_ref": "sandbox-27846"
}
```

```json
{
  "session_id": "fbd1238e-5b3f-42e6-820b-33c29f3a4347",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4OTQ5NywiaWF0IjoxNzkzMzg4NTk3LCJqdGkiOiJiNTg5ZGIwMy1hN2Q5LTQxODAtYjc3OS0wZTU0NDdhZTYyMGEiLCJzaWQiOiJmYmQxMjM4ZS01YjNmLTQyZTYtODIwYi0zM2MyOWYzYTQzNDcifQ.IGF1TysIseozb0ksTj9vCU2zv3wqmqitIsfr6WSwOAA",
  "access_expires_at": "2026-10-30T19:44:57.175867167Z",
  "refresh_token": "7TNq7E2XZm95huU7kfiAiXDYKBXk8D9vD-RXrgh9YoM",
  "refresh_expires_at": "2026-11-29T19:29:57.175279277Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "443ba053-247d-461c-b2e2-8079b0455d9b",
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
  "last_heartbeat_at": "2026-10-30T19:29:50.997913Z",
  "last_location_at": "2026-10-30T19:29:50.997913Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/443ba053-247d-461c-b2e2-8079b0455d9b/handover` → **200**

```json
{
  "command_id": "af1abc8d-913d-4956-aff1-355145e8de15",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "443ba053-247d-461c-b2e2-8079b0455d9b",
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
  "last_heartbeat_at": "2026-10-30T19:29:50.997913Z",
  "last_location_at": "2026-10-30T19:29:50.997913Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

(the car drives 41 s to the next point)

`POST /api/driver/v1/work-sessions/443ba053-247d-461c-b2e2-8079b0455d9b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:30:39Z",
    "sequence": 1793388639799
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "443ba053-247d-461c-b2e2-8079b0455d9b",
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
  "last_heartbeat_at": "2026-10-30T19:30:39.100245Z",
  "last_location_at": "2026-10-30T19:30:39.100245Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1dfc617c-2cc1-4988-9507-2cff75afac47",
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
  "id": "dbb66b66-3ec8-4e63-b951-69cdca7dd114",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T19:35:39.406231Z",
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
  "command_id": "ffcb5db9-8713-479f-806c-74b74a647d5c",
  "quote_id": "dbb66b66-3ec8-4e63-b951-69cdca7dd114",
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
  "id": "3df26597-b6b7-46b0-b89c-c6f2690a92e5",
  "short_number": 8,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "8e2dd573-fad7-463b-ad89-e4565301bc36",
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
  "created_at": "2026-10-30T19:30:39.714264Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3df26597-b6b7-46b0-b89c-c6f2690a92e5` → **200**

```json
{
  "id": "3df26597-b6b7-46b0-b89c-c6f2690a92e5",
  "short_number": 8,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "8e2dd573-fad7-463b-ad89-e4565301bc36",
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
  "created_at": "2026-10-30T19:30:39.714264Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3df26597-b6b7-46b0-b89c-c6f2690a92e5` → **200**

```json
{
  "id": "3df26597-b6b7-46b0-b89c-c6f2690a92e5",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "8e2dd573-fad7-463b-ad89-e4565301bc36",
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
  "created_at": "2026-10-30T19:30:39.714264Z",
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
    "id": "4e74afe9-a6c2-40bf-8fb6-7d1f09e1a9fe",
    "order_id": "3df26597-b6b7-46b0-b89c-c6f2690a92e5",
    "expires_at": "2026-10-30T19:30:55.339339Z",
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

`POST /api/driver/v1/offers/4e74afe9-a6c2-40bf-8fb6-7d1f09e1a9fe/accept` → **200**

```json
{
  "command_id": "db266434-3d9b-4fd1-b1ff-af8881151824"
}
```

```json
{
  "id": "99d512a6-4d39-4ab1-b9f5-638bd8fffd40",
  "order_id": "3df26597-b6b7-46b0-b89c-c6f2690a92e5",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b9b69d9b-53b3-4921-9672-adc0a4654b2f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b9b69d9b-53b3-4921-9672-adc0a4654b2f",
  "order_id": "3df26597-b6b7-46b0-b89c-c6f2690a92e5",
  "assignment_id": "99d512a6-4d39-4ab1-b9f5-638bd8fffd40",
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

`POST /api/driver/v1/work-sessions/443ba053-247d-461c-b2e2-8079b0455d9b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:30:48Z",
    "sequence": 1793388648538
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "443ba053-247d-461c-b2e2-8079b0455d9b",
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
  "last_heartbeat_at": "2026-10-30T19:30:48.559944Z",
  "last_location_at": "2026-10-30T19:30:48.559944Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/b9b69d9b-53b3-4921-9672-adc0a4654b2f/arrive` → **200**

```json
{
  "command_id": "b3b3f3d2-3516-48b7-bbf1-ed9697c91740",
  "expected_version": 0
}
```

```json
{
  "id": "b9b69d9b-53b3-4921-9672-adc0a4654b2f",
  "order_id": "3df26597-b6b7-46b0-b89c-c6f2690a92e5",
  "assignment_id": "99d512a6-4d39-4ab1-b9f5-638bd8fffd40",
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
  "arrived_at": "2026-10-30T19:30:48.850576Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/b9b69d9b-53b3-4921-9672-adc0a4654b2f/start` → **200**

```json
{
  "command_id": "d6aa637f-16cb-46f2-a8eb-d94821c9706a",
  "expected_version": 1
}
```

```json
{
  "id": "b9b69d9b-53b3-4921-9672-adc0a4654b2f",
  "order_id": "3df26597-b6b7-46b0-b89c-c6f2690a92e5",
  "assignment_id": "99d512a6-4d39-4ab1-b9f5-638bd8fffd40",
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
  "arrived_at": "2026-10-30T19:30:48.850576Z",
  "started_at": "2026-10-30T19:30:49.155126Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/b9b69d9b-53b3-4921-9672-adc0a4654b2f/complete` → **200**

```json
{
  "command_id": "f2f20d1c-497c-4a86-9584-9f78dc574910",
  "expected_version": 2,
  "reported_at": "2026-10-30T19:30:49Z",
  "cash_received": true
}
```

```json
{
  "id": "b9b69d9b-53b3-4921-9672-adc0a4654b2f",
  "order_id": "3df26597-b6b7-46b0-b89c-c6f2690a92e5",
  "assignment_id": "99d512a6-4d39-4ab1-b9f5-638bd8fffd40",
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
  "arrived_at": "2026-10-30T19:30:48.850576Z",
  "started_at": "2026-10-30T19:30:49.155126Z",
  "completed_at": "2026-10-30T19:30:49.466424Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/3df26597-b6b7-46b0-b89c-c6f2690a92e5` → **200**

```json
{
  "id": "3df26597-b6b7-46b0-b89c-c6f2690a92e5",
  "short_number": 8,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "8e2dd573-fad7-463b-ad89-e4565301bc36",
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
    "id": "99d512a6-4d39-4ab1-b9f5-638bd8fffd40",
    "order_id": "3df26597-b6b7-46b0-b89c-c6f2690a92e5",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "b9b69d9b-53b3-4921-9672-adc0a4654b2f",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T19:30:39.714264Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3df26597-b6b7-46b0-b89c-c6f2690a92e5` → **200**

```json
{
  "id": "3df26597-b6b7-46b0-b89c-c6f2690a92e5",
  "short_number": 8,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "8e2dd573-fad7-463b-ad89-e4565301bc36",
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
    "id": "99d512a6-4d39-4ab1-b9f5-638bd8fffd40",
    "order_id": "3df26597-b6b7-46b0-b89c-c6f2690a92e5",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "b9b69d9b-53b3-4921-9672-adc0a4654b2f",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T19:30:39.714264Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3df26597-b6b7-46b0-b89c-c6f2690a92e5` → **200**

```json
{
  "id": "3df26597-b6b7-46b0-b89c-c6f2690a92e5",
  "short_number": 8,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "8e2dd573-fad7-463b-ad89-e4565301bc36",
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
    "id": "99d512a6-4d39-4ab1-b9f5-638bd8fffd40",
    "order_id": "3df26597-b6b7-46b0-b89c-c6f2690a92e5",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "b9b69d9b-53b3-4921-9672-adc0a4654b2f",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T19:30:39.714264Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3df26597-b6b7-46b0-b89c-c6f2690a92e5` → **200**

```json
{
  "id": "3df26597-b6b7-46b0-b89c-c6f2690a92e5",
  "short_number": 8,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "8e2dd573-fad7-463b-ad89-e4565301bc36",
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
    "id": "99d512a6-4d39-4ab1-b9f5-638bd8fffd40",
    "order_id": "3df26597-b6b7-46b0-b89c-c6f2690a92e5",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "b9b69d9b-53b3-4921-9672-adc0a4654b2f",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T19:30:39.714264Z",
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

`GET /api/rider/v1/orders/3df26597-b6b7-46b0-b89c-c6f2690a92e5/tip` → **200**

```json
{
  "order_id": "3df26597-b6b7-46b0-b89c-c6f2690a92e5",
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
  "available_until": "2026-10-31T19:30:49.466424Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/3df26597-b6b7-46b0-b89c-c6f2690a92e5/tip` → **201**

```json
{
  "command_id": "0c4237a2-9562-469f-88e8-5828b260f50d",
  "amount_minor": 2500
}
```

```json
{
  "id": "5c57ee62-b43c-4a05-bbf8-0436ae62f94a",
  "order_id": "3df26597-b6b7-46b0-b89c-c6f2690a92e5",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T19:30:54.567643Z"
}
```

`GET /api/rider/v1/orders/3df26597-b6b7-46b0-b89c-c6f2690a92e5/tip` → **200**

```json
{
  "order_id": "3df26597-b6b7-46b0-b89c-c6f2690a92e5",
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
  "available_until": "2026-10-31T19:30:49.466424Z",
  "open": false,
  "tip": {
    "id": "5c57ee62-b43c-4a05-bbf8-0436ae62f94a",
    "order_id": "3df26597-b6b7-46b0-b89c-c6f2690a92e5",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-30T19:30:54.567643Z"
  }
}
```

`GET /api/rider/v1/orders/3df26597-b6b7-46b0-b89c-c6f2690a92e5/tip` → **200**

```json
{
  "order_id": "3df26597-b6b7-46b0-b89c-c6f2690a92e5",
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
  "available_until": "2026-10-31T19:30:49.466424Z",
  "open": false,
  "tip": {
    "id": "5c57ee62-b43c-4a05-bbf8-0436ae62f94a",
    "order_id": "3df26597-b6b7-46b0-b89c-c6f2690a92e5",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T19:30:54.567643Z"
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
      "id": "ee8ccbed-0cdc-4253-9602-8cab89739f41",
      "at": "2026-10-30T19:30:50.43799Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "3df26597-b6b7-46b0-b89c-c6f2690a92e5",
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
      "id": "f62075e8-8642-4ab3-9dc0-eadfed7de02a",
      "at": "2026-10-30T19:30:56.490699Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "3df26597-b6b7-46b0-b89c-c6f2690a92e5",
      "counterpart_id": null
    },
    {
      "id": "ee8ccbed-0cdc-4253-9602-8cab89739f41",
      "at": "2026-10-30T19:30:50.43799Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "3df26597-b6b7-46b0-b89c-c6f2690a92e5",
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
  "command_id": "9677256a-d659-40d5-b69c-e23db1e40506",
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
  "id": "3924c903-baa3-4574-afa5-7585f47f67cf",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T19:35:58.049366Z",
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
  "session_id": "1fbd13c9-4ddd-43e4-83eb-0a6ce43270d4",
  "subject": {
    "type": "STAFF",
    "id": "bbeb0bd1-546e-4687-8aa4-9df00ff27005"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYmViMGJkMS01NDZlLTQ2ODctOGFhNC05ZGYwMGZmMjcwMDUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODk1NTgsImlhdCI6MTc5MzM4ODY1OCwianRpIjoiMzY1MTE3OGQtYTE3Yy00NDY2LWI5ZTgtMWRhNGM0ZGVmNWJlIiwic2lkIjoiMWZiZDEzYzktNGRkZC00M2U0LTgzZWItMGE2Y2U0MzI3MGQ0In0.Zs51USADRk-vevnUpekTEvvKO_wH7JG26YpMfTMAM6I",
  "access_expires_at": "2026-10-30T19:45:58.646835685Z",
  "refresh_token": "IbiMVFtvJ0oztIpr7mi-IDHW2WYbBxy5haxMUwjotPE",
  "refresh_expires_at": "2026-10-31T07:30:58.646218621Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380733850432` → **200**

```json
{
  "client_id": "8e2dd573-fad7-463b-ad89-e4565301bc36"
}
```

`POST /api/admin/v1/rider-wallets/8e2dd573-fad7-463b-ad89-e4565301bc36/top-ups` → **201**

```json
{
  "command_id": "85bea08c-9b11-46d6-8fa6-66a69ac9fbff",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "8e2dd573-fad7-463b-ad89-e4565301bc36",
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
      "id": "c6e6564b-b99e-48a2-977b-cae721ac3fae",
      "at": "2026-10-30T19:30:59.209904Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "bbeb0bd1-546e-4687-8aa4-9df00ff27005",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "4c3be92b-9546-49db-b22a-2f5da4e6ee0c",
  "quote_id": "3924c903-baa3-4574-afa5-7585f47f67cf",
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
  "id": "632bbd4b-0390-478b-8417-e95061c9666b",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8e2dd573-fad7-463b-ad89-e4565301bc36",
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
  "created_at": "2026-10-30T19:30:59.517356Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/632bbd4b-0390-478b-8417-e95061c9666b` → **200**

```json
{
  "id": "632bbd4b-0390-478b-8417-e95061c9666b",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8e2dd573-fad7-463b-ad89-e4565301bc36",
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
  "created_at": "2026-10-30T19:30:59.517356Z",
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
    "id": "9e71056f-d8ea-405d-88aa-18f55aeb1d6f",
    "order_id": "632bbd4b-0390-478b-8417-e95061c9666b",
    "expires_at": "2026-10-30T19:31:14.522551Z",
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

`POST /api/driver/v1/offers/9e71056f-d8ea-405d-88aa-18f55aeb1d6f/accept` → **200**

```json
{
  "command_id": "83cbc045-d4aa-452c-8b31-a54b151ea90b"
}
```

```json
{
  "id": "30a68306-9092-423c-aa59-c3ef0fba97a6",
  "order_id": "632bbd4b-0390-478b-8417-e95061c9666b",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d65a3c3e-8bd8-4018-b8ed-a99605148bae",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d65a3c3e-8bd8-4018-b8ed-a99605148bae",
  "order_id": "632bbd4b-0390-478b-8417-e95061c9666b",
  "assignment_id": "30a68306-9092-423c-aa59-c3ef0fba97a6",
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

`POST /api/driver/v1/work-sessions/443ba053-247d-461c-b2e2-8079b0455d9b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:31:01Z",
    "sequence": 1793388661449
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "443ba053-247d-461c-b2e2-8079b0455d9b",
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
  "last_heartbeat_at": "2026-10-30T19:31:01.064225Z",
  "last_location_at": "2026-10-30T19:31:01.064225Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/d65a3c3e-8bd8-4018-b8ed-a99605148bae/arrive` → **200**

```json
{
  "command_id": "b4551031-405d-4c2a-83f9-2d99c9af04f9",
  "expected_version": 0
}
```

```json
{
  "id": "d65a3c3e-8bd8-4018-b8ed-a99605148bae",
  "order_id": "632bbd4b-0390-478b-8417-e95061c9666b",
  "assignment_id": "30a68306-9092-423c-aa59-c3ef0fba97a6",
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
  "arrived_at": "2026-10-30T19:31:01.357033Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/d65a3c3e-8bd8-4018-b8ed-a99605148bae/start` → **200**

```json
{
  "command_id": "6ee0d325-4f49-4f2d-85a9-ec49f2110ee5",
  "expected_version": 1
}
```

```json
{
  "id": "d65a3c3e-8bd8-4018-b8ed-a99605148bae",
  "order_id": "632bbd4b-0390-478b-8417-e95061c9666b",
  "assignment_id": "30a68306-9092-423c-aa59-c3ef0fba97a6",
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
  "arrived_at": "2026-10-30T19:31:01.357033Z",
  "started_at": "2026-10-30T19:31:01.673955Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/d65a3c3e-8bd8-4018-b8ed-a99605148bae/complete` → **200**

```json
{
  "command_id": "6c1429f1-c102-4348-b774-30cfac745029",
  "expected_version": 2,
  "reported_at": "2026-10-30T19:31:01Z",
  "cash_received": true
}
```

```json
{
  "id": "d65a3c3e-8bd8-4018-b8ed-a99605148bae",
  "order_id": "632bbd4b-0390-478b-8417-e95061c9666b",
  "assignment_id": "30a68306-9092-423c-aa59-c3ef0fba97a6",
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
  "arrived_at": "2026-10-30T19:31:01.357033Z",
  "started_at": "2026-10-30T19:31:01.673955Z",
  "completed_at": "2026-10-30T19:31:01.974019Z",
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
  "client_id": "8e2dd573-fad7-463b-ad89-e4565301bc36",
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
      "id": "c6e6564b-b99e-48a2-977b-cae721ac3fae",
      "at": "2026-10-30T19:30:59.209904Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "bbeb0bd1-546e-4687-8aa4-9df00ff27005",
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

`GET /api/rider/v1/orders/632bbd4b-0390-478b-8417-e95061c9666b/tip` → **200**

```json
{
  "order_id": "632bbd4b-0390-478b-8417-e95061c9666b",
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
  "available_until": "2026-10-31T19:31:01.974019Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/632bbd4b-0390-478b-8417-e95061c9666b/tip` → **201**

```json
{
  "command_id": "3549cac0-9ee9-46aa-b3cd-cc8c265d3a95",
  "amount_minor": 2500
}
```

```json
{
  "id": "3a3d3115-a105-44fc-b800-5c8180c1bc95",
  "order_id": "632bbd4b-0390-478b-8417-e95061c9666b",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T19:31:03.14539Z"
}
```

`GET /api/rider/v1/orders/632bbd4b-0390-478b-8417-e95061c9666b/tip` → **200**

```json
{
  "order_id": "632bbd4b-0390-478b-8417-e95061c9666b",
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
  "available_until": "2026-10-31T19:31:01.974019Z",
  "open": false,
  "tip": {
    "id": "3a3d3115-a105-44fc-b800-5c8180c1bc95",
    "order_id": "632bbd4b-0390-478b-8417-e95061c9666b",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-30T19:31:03.14539Z"
  }
}
```

`GET /api/rider/v1/orders/632bbd4b-0390-478b-8417-e95061c9666b/tip` → **200**

```json
{
  "order_id": "632bbd4b-0390-478b-8417-e95061c9666b",
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
  "available_until": "2026-10-31T19:31:01.974019Z",
  "open": false,
  "tip": {
    "id": "3a3d3115-a105-44fc-b800-5c8180c1bc95",
    "order_id": "632bbd4b-0390-478b-8417-e95061c9666b",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T19:31:03.14539Z"
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
      "id": "a708d282-25eb-4201-bf94-6d6b25e561e1",
      "at": "2026-10-30T19:31:04.555832Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "632bbd4b-0390-478b-8417-e95061c9666b",
      "counterpart_id": null
    },
    {
      "id": "128ac035-b0a5-474a-a207-4bbbe24fd1f1",
      "at": "2026-10-30T19:31:02.534303Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "632bbd4b-0390-478b-8417-e95061c9666b",
      "counterpart_id": null
    },
    {
      "id": "f62075e8-8642-4ab3-9dc0-eadfed7de02a",
      "at": "2026-10-30T19:30:56.490699Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "3df26597-b6b7-46b0-b89c-c6f2690a92e5",
      "counterpart_id": null
    },
    {
      "id": "ee8ccbed-0cdc-4253-9602-8cab89739f41",
      "at": "2026-10-30T19:30:50.43799Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "3df26597-b6b7-46b0-b89c-c6f2690a92e5",
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
  "session_id": "443ba053-247d-461c-b2e2-8079b0455d9b",
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
  "last_heartbeat_at": "2026-10-30T19:31:01.064225Z",
  "last_location_at": "2026-10-30T19:31:01.064225Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/443ba053-247d-461c-b2e2-8079b0455d9b/close` → **200**

```json
{
  "command_id": "79244690-3e89-4d21-b504-2382b19227f1",
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

Done: card order 632bbd4b-0390-478b-8417-e95061c9666b.

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
  "phone": "+380739084409",
  "device_ref": "sandbox-11534"
}
```

```json
{
  "challenge_id": "29f66fb9-bcb8-450f-8153-00cba75a1b92",
  "expires_at": "2026-10-30T19:36:06.206131485Z",
  "resend_available_at": "2026-10-30T19:31:07.206131485Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380739084409` → **200**

```json
{
  "phone": "+380739084409",
  "audience": "CLIENT",
  "code": "468041",
  "sent_at": "2026-10-30T19:31:06.208625013Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "29f66fb9-bcb8-450f-8153-00cba75a1b92",
  "code": "468041",
  "device_ref": "sandbox-11534"
}
```

```json
{
  "session_id": "6ee86661-22f5-427a-890f-7aa1d7f98469",
  "subject": {
    "type": "CLIENT",
    "id": "4f75b179-ec28-4642-b6db-a09f07c5f977"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0Zjc1YjE3OS1lYzI4LTQ2NDItYjZkYi1hMDlmMDdjNWY5NzciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzg5NTY2LCJpYXQiOjE3OTMzODg2NjYsImp0aSI6IjIyN2M2ODkwLThjYzQtNDM1NC04ZDJhLTdhN2QzNWU5MjliZCIsInNpZCI6IjZlZTg2NjYxLTIyZjUtNDI3YS04OTBmLTdhYTFkN2Y5ODQ2OSJ9.0zMNphR5Hp45HwytsDH5UdqHLthTcd8nUAkN0Qx_iFc",
  "access_expires_at": "2026-10-30T19:46:06.532589462Z",
  "refresh_token": "w9xDRosAWnSpH8MBDno2NUkSjLB8Ro6c5cIsdqBrRFM",
  "refresh_expires_at": "2026-11-29T19:31:06.531945278Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "b55bac9f-2c40-46d6-b7f2-f18eba066e17",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "286d8d21-f6a2-4dcb-ad86-dfa2fb2998d5",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-286d8d21-f6a2-4dcb-ad86-dfa2fb2998d5",
    "orderDate": "1793388666",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "f2d2c6676aeed335deb17e4ab47b5e3d",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=286d8d21-f6a2-4dcb-ad86-dfa2fb2998d5",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380739084409"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=286d8d21-f6a2-4dcb-ad86-dfa2fb2998d5",
  "created_at": "2026-10-30T19:31:06.827345Z",
  "expires_at": "2026-10-30T20:01:06.827345Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/286d8d21-f6a2-4dcb-ad86-dfa2fb2998d5` → **200**

```json
{
  "id": "286d8d21-f6a2-4dcb-ad86-dfa2fb2998d5",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T19:31:06.827345Z",
  "expires_at": "2026-10-30T20:01:06.827345Z",
  "completed_at": "2026-10-30T19:31:07.133807Z",
  "masked_pan": "41****6959",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "4f75b179-ec28-4642-b6db-a09f07c5f977",
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
  "client_id": "4f75b179-ec28-4642-b6db-a09f07c5f977",
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
      "id": "814faca4-b3db-47cd-9b5f-598508d472b2",
      "at": "2026-10-30T19:31:07.573122Z",
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
  "client_id": "4f75b179-ec28-4642-b6db-a09f07c5f977",
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
      "id": "814faca4-b3db-47cd-9b5f-598508d472b2",
      "at": "2026-10-30T19:31:07.573122Z",
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
  "device_ref": "sandbox-2133"
}
```

```json
{
  "challenge_id": "374b6380-4191-45db-87c0-3a17e07dce86",
  "expires_at": "2026-10-30T19:36:09.315855884Z",
  "resend_available_at": "2026-10-30T19:31:10.315855884Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "497937",
  "sent_at": "2026-10-30T19:31:09.318561641Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "374b6380-4191-45db-87c0-3a17e07dce86",
  "code": "497937",
  "device_ref": "sandbox-2133"
}
```

```json
{
  "session_id": "f59fbb79-ef51-4cd6-a629-85806af81e48",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4OTU2OSwiaWF0IjoxNzkzMzg4NjY5LCJqdGkiOiI5MmM4MjIxOC00MWJkLTRiMDYtYTBhNS1kYTVmMTliNGQyZjUiLCJzaWQiOiJmNTlmYmI3OS1lZjUxLTRjZDYtYTYyOS04NTgwNmFmODFlNDgifQ.lIMOwowBVsFQD7xc5hWihJqujHeByTItFNw1KW0Z1-g",
  "access_expires_at": "2026-10-30T19:46:09.630346551Z",
  "refresh_token": "6Ih8JaXRC_pKdzHWEAPjdpMjPVTkhfcFuJ0xdpoi2LA",
  "refresh_expires_at": "2026-11-29T19:31:09.629828994Z",
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
  "command_id": "48e573c6-5156-45b6-b4fd-176c513451f1",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "df5b93e0-8edb-4b2b-9e8b-6cc491c2c23a",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-df5b93e0-8edb-4b2b-9e8b-6cc491c2c23a",
    "orderDate": "1793388670",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "224e083847aa4dff8b6487aa77c34e36",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=df5b93e0-8edb-4b2b-9e8b-6cc491c2c23a",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=df5b93e0-8edb-4b2b-9e8b-6cc491c2c23a",
  "created_at": "2026-10-30T19:31:10.205754Z",
  "expires_at": "2026-10-30T20:01:10.205754Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/df5b93e0-8edb-4b2b-9e8b-6cc491c2c23a` → **200**

```json
{
  "id": "df5b93e0-8edb-4b2b-9e8b-6cc491c2c23a",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T19:31:10.205754Z",
  "expires_at": "2026-10-30T20:01:10.205754Z",
  "completed_at": "2026-10-30T19:31:10.500321Z",
  "masked_pan": "41****9856",
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
      "id": "18242fe1-dc4b-4330-bc9d-95a1246f3a26",
      "at": "2026-10-30T19:31:10.584518Z",
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
  "command_id": "01b9b578-20f4-40d3-b028-5cc51b5f164f",
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
  "correlation_id": "892226b1-e739-453c-b8a8-b56bc5b02520"
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
  "device_ref": "sandbox-7136"
}
```

```json
{
  "challenge_id": "82af4d52-6e25-43b5-9abe-f0946937ffc6",
  "expires_at": "2026-10-30T19:36:11.397644371Z",
  "resend_available_at": "2026-10-30T19:31:12.397644371Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "244372",
  "sent_at": "2026-10-30T19:31:11.400036123Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "82af4d52-6e25-43b5-9abe-f0946937ffc6",
  "code": "244372",
  "device_ref": "sandbox-7136"
}
```

```json
{
  "session_id": "35191d20-21ae-4884-ad82-b3ed28f9112d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4OTU3MSwiaWF0IjoxNzkzMzg4NjcxLCJqdGkiOiI2YWM0MmYyOC0yZWNlLTRiNzAtYTQ5MC02Y2FmOGUxMzI5OWIiLCJzaWQiOiIzNTE5MWQyMC0yMWFlLTQ4ODQtYWQ4Mi1iM2VkMjhmOTExMmQifQ.weZZJWt-9NDH1zZT1Yd8sm45kJaW5BBx5uG5y7GU0Oc",
  "access_expires_at": "2026-10-30T19:46:11.731328781Z",
  "refresh_token": "xQcYCH_JyYtBq0NRqek54OfIntQH6x64QbdIQUW2glE",
  "refresh_expires_at": "2026-11-29T19:31:11.73080374Z",
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
  "command_id": "6dd1b358-3cd0-40e4-a3eb-a5d468ec7187",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:31:12Z",
    "sequence": 1793388672323
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2c8d51b6-2909-4332-9ed5-056efdc7f4da",
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
  "last_heartbeat_at": "2026-10-30T19:31:12.34222Z",
  "last_location_at": "2026-10-30T19:31:12.34222Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A rider orders for cash

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631147959",
  "device_ref": "sandbox-25320"
}
```

```json
{
  "challenge_id": "578cf2aa-e714-40e4-838e-081e9c6383c4",
  "expires_at": "2026-10-30T19:36:12.631700456Z",
  "resend_available_at": "2026-10-30T19:31:13.631700456Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631147959` → **200**

```json
{
  "phone": "+380631147959",
  "audience": "CLIENT",
  "code": "028041",
  "sent_at": "2026-10-30T19:31:12.634203156Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "578cf2aa-e714-40e4-838e-081e9c6383c4",
  "code": "028041",
  "device_ref": "sandbox-25320"
}
```

```json
{
  "session_id": "bacda282-67ff-493a-bc81-c6f40bebe89b",
  "subject": {
    "type": "CLIENT",
    "id": "e18f894d-3348-477f-8dbf-5ee27daa8fe5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMThmODk0ZC0zMzQ4LTQ3N2YtOGRiZi01ZWUyN2RhYThmZTUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzg5NTcyLCJpYXQiOjE3OTMzODg2NzIsImp0aSI6IjFjZGFmZjVhLTkyY2ItNDJhNC1hYzgyLWY3ZDlmYjQ4NjY1NyIsInNpZCI6ImJhY2RhMjgyLTY3ZmYtNDkzYS1iYzgxLWM2ZjQwYmViZTg5YiJ9.7iz7pMtKkGf_LlggMuOX9yJgnpDlQmJPrGNqgPrFf9M",
  "access_expires_at": "2026-10-30T19:46:12.952165225Z",
  "refresh_token": "TKlgKb4hy2nywxuzD4ydukotEYBwKac61xmuw26kpNY",
  "refresh_expires_at": "2026-11-29T19:31:12.951668657Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "79eb97be-0f86-4b87-8681-d282786b4274",
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
  "id": "3beacfe0-8c35-46e0-b8b1-570ecc326c67",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T19:36:13.247791Z",
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
  "command_id": "e98f82aa-777e-4929-99e7-b9038ba7c38f",
  "quote_id": "3beacfe0-8c35-46e0-b8b1-570ecc326c67",
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
  "id": "c80ea9d0-7e16-4d29-a8c0-4a67816008fd",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e18f894d-3348-477f-8dbf-5ee27daa8fe5",
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
  "created_at": "2026-10-30T19:31:13.547095Z",
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
    "id": "b1c4f21f-899b-42f7-bc6c-cd46756f99fe",
    "order_id": "c80ea9d0-7e16-4d29-a8c0-4a67816008fd",
    "expires_at": "2026-10-30T19:31:28.550232Z",
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

`POST /api/driver/v1/offers/b1c4f21f-899b-42f7-bc6c-cd46756f99fe/accept` → **200**

```json
{
  "command_id": "da68d6d3-fde8-4e8e-8f31-b93f3164ead9"
}
```

```json
{
  "id": "14bbc86d-31e6-49c3-aee6-27e3cfd51d20",
  "order_id": "c80ea9d0-7e16-4d29-a8c0-4a67816008fd",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a232c44f-af3d-4102-a7b2-632aec02ffa7",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a232c44f-af3d-4102-a7b2-632aec02ffa7",
  "order_id": "c80ea9d0-7e16-4d29-a8c0-4a67816008fd",
  "assignment_id": "14bbc86d-31e6-49c3-aee6-27e3cfd51d20",
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

`POST /api/driver/v1/work-sessions/2c8d51b6-2909-4332-9ed5-056efdc7f4da/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:31:14Z",
    "sequence": 1793388674742
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2c8d51b6-2909-4332-9ed5-056efdc7f4da",
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
  "last_heartbeat_at": "2026-10-30T19:31:14.761403Z",
  "last_location_at": "2026-10-30T19:31:14.761403Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/a232c44f-af3d-4102-a7b2-632aec02ffa7/arrive` → **200**

```json
{
  "command_id": "23a8be12-881c-4fe2-9be6-ae8cd39ebe40",
  "expected_version": 0
}
```

```json
{
  "id": "a232c44f-af3d-4102-a7b2-632aec02ffa7",
  "order_id": "c80ea9d0-7e16-4d29-a8c0-4a67816008fd",
  "assignment_id": "14bbc86d-31e6-49c3-aee6-27e3cfd51d20",
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
  "arrived_at": "2026-10-30T19:31:15.060043Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/a232c44f-af3d-4102-a7b2-632aec02ffa7/start` → **200**

```json
{
  "command_id": "3a689130-ce33-43a0-a5a3-c6dc243c1376",
  "expected_version": 1
}
```

```json
{
  "id": "a232c44f-af3d-4102-a7b2-632aec02ffa7",
  "order_id": "c80ea9d0-7e16-4d29-a8c0-4a67816008fd",
  "assignment_id": "14bbc86d-31e6-49c3-aee6-27e3cfd51d20",
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
  "arrived_at": "2026-10-30T19:31:15.060043Z",
  "started_at": "2026-10-30T19:31:15.361698Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/a232c44f-af3d-4102-a7b2-632aec02ffa7/complete` → **200**

```json
{
  "command_id": "a224698c-5f12-4fa0-87bd-042f54a87f7f",
  "expected_version": 2,
  "reported_at": "2026-10-30T19:31:15Z",
  "cash_received": false
}
```

```json
{
  "id": "a232c44f-af3d-4102-a7b2-632aec02ffa7",
  "order_id": "c80ea9d0-7e16-4d29-a8c0-4a67816008fd",
  "assignment_id": "14bbc86d-31e6-49c3-aee6-27e3cfd51d20",
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
  "arrived_at": "2026-10-30T19:31:15.060043Z",
  "started_at": "2026-10-30T19:31:15.361698Z",
  "completed_at": "2026-10-30T19:31:15.669106Z",
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
  "session_id": "93e342ce-05dc-41d9-9ef7-73f80ca303c4",
  "subject": {
    "type": "STAFF",
    "id": "bbeb0bd1-546e-4687-8aa4-9df00ff27005"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYmViMGJkMS01NDZlLTQ2ODctOGFhNC05ZGYwMGZmMjcwMDUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODk1NzYsImlhdCI6MTc5MzM4ODY3NiwianRpIjoiN2I4YTMwOWItYzU0Yi00NTdhLWIxOTUtZTNlOTlmYjZhNTY4Iiwic2lkIjoiOTNlMzQyY2UtMDVkYy00MWQ5LTllZjctNzNmODBjYTMwM2M0In0.ch90sz8VlLhJBB3MIsOL50dlu_2_gRTf8LNZDKTbt9o",
  "access_expires_at": "2026-10-30T19:46:16.260855597Z",
  "refresh_token": "KpJCSxZd3D_kzt8FRKEcO03wIGSX2nxFkrsUc__ySpQ",
  "refresh_expires_at": "2026-10-31T07:31:16.260209959Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/c80ea9d0-7e16-4d29-a8c0-4a67816008fd/cash-dispute` → **404**

```json
{
  "instance": "/api/admin/v1/orders/c80ea9d0-7e16-4d29-a8c0-4a67816008fd/cash-dispute",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "fcf05c62-dde0-4270-918c-7d374dd3efea"
}
```

`GET /api/admin/v1/orders/c80ea9d0-7e16-4d29-a8c0-4a67816008fd/cash-dispute` → **200**

```json
{
  "order_id": "c80ea9d0-7e16-4d29-a8c0-4a67816008fd",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "e18f894d-3348-477f-8dbf-5ee27daa8fe5",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T19:31:16.653407Z",
  "decide_by": "2026-11-13T19:31:16.653407Z",
  "decision": null,
  "decided_by": null,
  "reason": null,
  "decided_at": null,
  "version": 1
}
```

Dispute: {"held_minor":0,"rider_debt_minor":10517,"decide_by":"2026-11-13T19:31:16.653407Z","decision":null}

`GET /api/admin/v1/cash-disputes` → **200**

```json
{
  "disputes": [
    {
      "order_id": "c80ea9d0-7e16-4d29-a8c0-4a67816008fd",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "payer_client_id": "e18f894d-3348-477f-8dbf-5ee27daa8fe5",
      "currency": "UAH",
      "held_minor": 0,
      "rider_debt_minor": 10517,
      "opened_at": "2026-10-30T19:31:16.653407Z",
      "decide_by": "2026-11-13T19:31:16.653407Z",
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

`POST /api/admin/v1/orders/c80ea9d0-7e16-4d29-a8c0-4a67816008fd/cash-dispute/decide` → **400**

```json
{
  "command_id": "f8196fd2-510b-488f-b401-506a67c027d8",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/orders/c80ea9d0-7e16-4d29-a8c0-4a67816008fd/cash-dispute/decide",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "4ee16de9-e54b-4f2f-9174-cc95873a726e",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

`POST /api/admin/v1/orders/c80ea9d0-7e16-4d29-a8c0-4a67816008fd/cash-dispute/decide` → **200**

```json
{
  "command_id": "40cbd6bd-c1a9-4168-8e24-c895d5eaa561",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": "The rider does not answer calls"
}
```

```json
{
  "order_id": "c80ea9d0-7e16-4d29-a8c0-4a67816008fd",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "e18f894d-3348-477f-8dbf-5ee27daa8fe5",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T19:31:16.653407Z",
  "decide_by": "2026-11-13T19:31:16.653407Z",
  "decision": "PAY_DRIVER",
  "decided_by": "bbeb0bd1-546e-4687-8aa4-9df00ff27005",
  "reason": "The rider does not answer calls",
  "decided_at": "2026-10-30T19:31:18.791143Z",
  "version": 2
}
```

`POST /api/admin/v1/orders/c80ea9d0-7e16-4d29-a8c0-4a67816008fd/cash-dispute/decide` → **409**

```json
{
  "command_id": "61eaa470-9b06-4499-8d87-a002bfff0d8a",
  "expected_version": 2,
  "decision": "RIDER_PAID",
  "reason": "Again"
}
```

```json
{
  "instance": "/api/admin/v1/orders/c80ea9d0-7e16-4d29-a8c0-4a67816008fd/cash-dispute/decide",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "f520668a-fa60-44ac-8ab8-94658368d2ad"
}
```

Done: an unpaid cash trip became a dispute and was decided once.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2c8d51b6-2909-4332-9ed5-056efdc7f4da",
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
  "last_heartbeat_at": "2026-10-30T19:31:14.761403Z",
  "last_location_at": "2026-10-30T19:31:14.761403Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2c8d51b6-2909-4332-9ed5-056efdc7f4da/close` → **200**

```json
{
  "command_id": "0dc39c4e-229a-4967-8e3f-666ed194a246",
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
  "phone": "+380735399119",
  "device_ref": "sandbox-8530"
}
```

```json
{
  "challenge_id": "4e205996-3048-4911-a8ae-badbaf3c0bc8",
  "expires_at": "2026-10-30T19:36:19.960860911Z",
  "resend_available_at": "2026-10-30T19:31:20.960860911Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380735399119` → **200**

```json
{
  "phone": "+380735399119",
  "audience": "CLIENT",
  "code": "603742",
  "sent_at": "2026-10-30T19:31:19.963372155Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4e205996-3048-4911-a8ae-badbaf3c0bc8",
  "code": "603742",
  "device_ref": "sandbox-8530"
}
```

```json
{
  "session_id": "3b5f1ab4-4572-490c-a3a7-c20eda45b833",
  "subject": {
    "type": "CLIENT",
    "id": "fa4fbd33-0e8a-4595-bcfb-d2e150f86836"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYTRmYmQzMy0wZThhLTQ1OTUtYmNmYi1kMmUxNTBmODY4MzYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzg5NTgwLCJpYXQiOjE3OTMzODg2ODAsImp0aSI6ImEzMmMwZTNjLTIzMjgtNGUxMS1iOWVjLWFmY2M1ZmY4NjA2MCIsInNpZCI6IjNiNWYxYWI0LTQ1NzItNDkwYy1hM2E3LWMyMGVkYTQ1YjgzMyJ9.r8zhM6Rrzs-f38ikdGAtreXsrZemRDud_tzs7p62k1Q",
  "access_expires_at": "2026-10-30T19:46:20.271207272Z",
  "refresh_token": "pVPytovnTit_3qkuJrElYc5b7Q8mJpQc8iG0inNKVFo",
  "refresh_expires_at": "2026-11-29T19:31:20.270637858Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "434d20af-c347-4348-9a5a-cba3cca2a1dd",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "1dd103f6-916f-44bd-82d3-8c3295dde2e3",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-1dd103f6-916f-44bd-82d3-8c3295dde2e3",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "760997d1e3f65af9bf32ba083aa040d3",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=1dd103f6-916f-44bd-82d3-8c3295dde2e3",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380735399119"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=1dd103f6-916f-44bd-82d3-8c3295dde2e3",
  "expires_at": "2026-10-30T20:01:20.554386Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/1dd103f6-916f-44bd-82d3-8c3295dde2e3` → **200**

```json
{
  "id": "1dd103f6-916f-44bd-82d3-8c3295dde2e3",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T20:01:20.554386Z",
  "card": {
    "id": "8bad259d-2500-42be-9aa8-a6c34e1d5a09",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****0498",
    "card_type": "Visa",
    "created_at": "2026-10-30T19:31:20.847335Z"
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
  "device_ref": "sandbox-4347"
}
```

```json
{
  "challenge_id": "eb3be78f-da87-4872-8bb9-d007e6c4badd",
  "expires_at": "2026-10-30T19:36:21.162726885Z",
  "resend_available_at": "2026-10-30T19:31:22.162726885Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "220306",
  "sent_at": "2026-10-30T19:31:21.165287222Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "eb3be78f-da87-4872-8bb9-d007e6c4badd",
  "code": "220306",
  "device_ref": "sandbox-4347"
}
```

```json
{
  "session_id": "b974054a-9f2e-4ebb-80e1-a6c9eb987653",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4OTU4MSwiaWF0IjoxNzkzMzg4NjgxLCJqdGkiOiJmNWE3YzA1OS04MTlmLTQ5OWQtYjZkOC1iODdkZGNmNzg0NTUiLCJzaWQiOiJiOTc0MDU0YS05ZjJlLTRlYmItODBlMS1hNmM5ZWI5ODc2NTMifQ.6ccm2_91Nvf6nVhPgCYVVaNBt4T1GGpG72NiST5MV9Y",
  "access_expires_at": "2026-10-30T19:46:21.471407495Z",
  "refresh_token": "iZXn9JLnVbclhCzPS5LWggXPu5ks2UujHMJBQHQWXJE",
  "refresh_expires_at": "2026-11-29T19:31:21.470845154Z",
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
  "command_id": "ff982739-a288-425f-8f1f-d2f7ccca2edb",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:31:22Z",
    "sequence": 1793388682766
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "8685b7ee-c075-4515-9059-83276355985b",
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
  "last_heartbeat_at": "2026-10-30T19:31:22.096408Z",
  "last_location_at": "2026-10-30T19:31:22.096408Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A card ride; on the way both write numbers into the chat

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a6786bdc-aecc-4771-85d7-831fb4c78024",
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
  "id": "d7896a4d-a29e-409a-af2c-228f9543786b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T19:36:22.410020Z",
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
  "command_id": "a8477adc-fd39-4f2a-9e5b-c01a09c0c007",
  "quote_id": "d7896a4d-a29e-409a-af2c-228f9543786b",
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
  "id": "349453f9-da73-4d9a-8b9b-2b289fe26523",
  "short_number": 11,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "fa4fbd33-0e8a-4595-bcfb-d2e150f86836",
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
  "created_at": "2026-10-30T19:31:22.702219Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/349453f9-da73-4d9a-8b9b-2b289fe26523` → **200**

```json
{
  "id": "349453f9-da73-4d9a-8b9b-2b289fe26523",
  "short_number": 11,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "fa4fbd33-0e8a-4595-bcfb-d2e150f86836",
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
  "created_at": "2026-10-30T19:31:22.702219Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/349453f9-da73-4d9a-8b9b-2b289fe26523` → **200**

```json
{
  "id": "349453f9-da73-4d9a-8b9b-2b289fe26523",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "fa4fbd33-0e8a-4595-bcfb-d2e150f86836",
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
  "created_at": "2026-10-30T19:31:22.702219Z",
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
    "id": "edd7defe-2415-4208-b78b-93f49731b8b5",
    "order_id": "349453f9-da73-4d9a-8b9b-2b289fe26523",
    "expires_at": "2026-10-30T19:31:38.704519Z",
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

`POST /api/driver/v1/offers/edd7defe-2415-4208-b78b-93f49731b8b5/accept` → **200**

```json
{
  "command_id": "512df248-76cc-4563-be40-fcb583688034"
}
```

```json
{
  "id": "6a85c5df-2d6c-4bed-a2c5-a173e73ce885",
  "order_id": "349453f9-da73-4d9a-8b9b-2b289fe26523",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "ee3925a5-bbcf-42ea-b3cf-504f9923d741",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "ee3925a5-bbcf-42ea-b3cf-504f9923d741",
  "order_id": "349453f9-da73-4d9a-8b9b-2b289fe26523",
  "assignment_id": "6a85c5df-2d6c-4bed-a2c5-a173e73ce885",
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

`POST /api/rider/v1/orders/349453f9-da73-4d9a-8b9b-2b289fe26523/messages` → **201**

```json
{
  "command_id": "d583e0bb-dfff-4601-9716-ea88328c1132",
  "body": "Я біля входу, мій номер +380735399119, картка 4111 1111 1111 1111"
}
```

```json
{
  "id": "1c7ddbbf-691c-4392-a6c5-b0edb850acb1",
  "order_id": "349453f9-da73-4d9a-8b9b-2b289fe26523",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу, мій номер +380735399119, картка 4111 1111 1111 1111",
  "sent_at": "2026-10-30T19:31:25.489030802Z"
}
```

`POST /api/driver/v1/trips/ee3925a5-bbcf-42ea-b3cf-504f9923d741/messages` → **201**

```json
{
  "command_id": "79985c88-3038-4bd4-a8b2-51738d0b1877",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03"
}
```

```json
{
  "id": "98b792b3-3dc3-4697-848b-51a286160393",
  "order_id": "349453f9-da73-4d9a-8b9b-2b289fe26523",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03",
  "sent_at": "2026-10-30T19:31:25.793382932Z"
}
```

(the car drives 5 s to the next point)

`POST /api/driver/v1/work-sessions/8685b7ee-c075-4515-9059-83276355985b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:31:31Z",
    "sequence": 1793388691105
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "8685b7ee-c075-4515-9059-83276355985b",
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
  "last_heartbeat_at": "2026-10-30T19:31:31.12473Z",
  "last_location_at": "2026-10-30T19:31:31.12473Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/ee3925a5-bbcf-42ea-b3cf-504f9923d741/arrive` → **200**

```json
{
  "command_id": "aec2f3f3-de14-4374-a1d7-0edd0477691a",
  "expected_version": 0
}
```

```json
{
  "id": "ee3925a5-bbcf-42ea-b3cf-504f9923d741",
  "order_id": "349453f9-da73-4d9a-8b9b-2b289fe26523",
  "assignment_id": "6a85c5df-2d6c-4bed-a2c5-a173e73ce885",
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
  "arrived_at": "2026-10-30T19:31:31.420348Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/ee3925a5-bbcf-42ea-b3cf-504f9923d741/start` → **200**

```json
{
  "command_id": "6768046c-a646-4ce3-bc58-767f091f552c",
  "expected_version": 1
}
```

```json
{
  "id": "ee3925a5-bbcf-42ea-b3cf-504f9923d741",
  "order_id": "349453f9-da73-4d9a-8b9b-2b289fe26523",
  "assignment_id": "6a85c5df-2d6c-4bed-a2c5-a173e73ce885",
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
  "arrived_at": "2026-10-30T19:31:31.420348Z",
  "started_at": "2026-10-30T19:31:31.72121Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

(the car drives 90 s to the next point)

`POST /api/driver/v1/work-sessions/8685b7ee-c075-4515-9059-83276355985b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4584,
    "lon": 30.4300,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:33:02Z",
    "sequence": 1793388782463
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "8685b7ee-c075-4515-9059-83276355985b",
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
  "last_heartbeat_at": "2026-10-30T19:33:02.065179Z",
  "last_location_at": "2026-10-30T19:33:02.065179Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/ee3925a5-bbcf-42ea-b3cf-504f9923d741/complete` → **200**

```json
{
  "command_id": "49b2f2a3-ae7f-471c-8bb2-f46723ca48d3",
  "expected_version": 2,
  "reported_at": "2026-10-30T19:33:02Z",
  "cash_received": false
}
```

```json
{
  "id": "ee3925a5-bbcf-42ea-b3cf-504f9923d741",
  "order_id": "349453f9-da73-4d9a-8b9b-2b289fe26523",
  "assignment_id": "6a85c5df-2d6c-4bed-a2c5-a173e73ce885",
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
  "arrived_at": "2026-10-30T19:31:31.420348Z",
  "started_at": "2026-10-30T19:31:31.72121Z",
  "completed_at": "2026-10-30T19:33:02.366267Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/rider/v1/orders/349453f9-da73-4d9a-8b9b-2b289fe26523` → **200**

```json
{
  "id": "349453f9-da73-4d9a-8b9b-2b289fe26523",
  "short_number": 11,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "fa4fbd33-0e8a-4595-bcfb-d2e150f86836",
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
    "id": "6a85c5df-2d6c-4bed-a2c5-a173e73ce885",
    "order_id": "349453f9-da73-4d9a-8b9b-2b289fe26523",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "ee3925a5-bbcf-42ea-b3cf-504f9923d741",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T19:31:22.702219Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/349453f9-da73-4d9a-8b9b-2b289fe26523` → **200**

```json
{
  "id": "349453f9-da73-4d9a-8b9b-2b289fe26523",
  "short_number": 11,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "fa4fbd33-0e8a-4595-bcfb-d2e150f86836",
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
    "id": "6a85c5df-2d6c-4bed-a2c5-a173e73ce885",
    "order_id": "349453f9-da73-4d9a-8b9b-2b289fe26523",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "ee3925a5-bbcf-42ea-b3cf-504f9923d741",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T19:31:22.702219Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/349453f9-da73-4d9a-8b9b-2b289fe26523` → **200**

```json
{
  "id": "349453f9-da73-4d9a-8b9b-2b289fe26523",
  "short_number": 11,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "fa4fbd33-0e8a-4595-bcfb-d2e150f86836",
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
    "id": "6a85c5df-2d6c-4bed-a2c5-a173e73ce885",
    "order_id": "349453f9-da73-4d9a-8b9b-2b289fe26523",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "ee3925a5-bbcf-42ea-b3cf-504f9923d741",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T19:31:22.702219Z",
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
  "session_id": "8685b7ee-c075-4515-9059-83276355985b",
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
  "last_heartbeat_at": "2026-10-30T19:33:02.065179Z",
  "last_location_at": "2026-10-30T19:33:02.065179Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8685b7ee-c075-4515-9059-83276355985b/close` → **200**

```json
{
  "command_id": "6506ec3b-b257-406f-b0e7-3e4c5e14e392",
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
  "session_id": "51fc33de-d04d-484c-8903-566fccd76bb1",
  "subject": {
    "type": "STAFF",
    "id": "bbeb0bd1-546e-4687-8aa4-9df00ff27005"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYmViMGJkMS01NDZlLTQ2ODctOGFhNC05ZGYwMGZmMjcwMDUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODk2ODYsImlhdCI6MTc5MzM4ODc4NiwianRpIjoiMWI5MDk1Y2ItOGM2MC00ODI2LWEwODUtNDcyZWY0ZDA0ZGE3Iiwic2lkIjoiNTFmYzMzZGUtZDA0ZC00ODRjLTg5MDMtNTY2ZmNjZDc2YmIxIn0.YYtZHEnFTXtFIFqlZVaXx8oEax5h1eRhNstexyNPfC8",
  "access_expires_at": "2026-10-30T19:48:06.449639797Z",
  "refresh_token": "VKN8qoUjqYpsBeGjAlz5O_-xlkSho_9jGqj83dkSZnU",
  "refresh_expires_at": "2026-10-31T07:33:06.44909556Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/349453f9-da73-4d9a-8b9b-2b289fe26523/evidence` → **400**

```json
{
  "instance": "/api/admin/v1/orders/349453f9-da73-4d9a-8b9b-2b289fe26523/evidence",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "7bb4129a-eaa2-436f-873c-c7367c11e89f"
}
```

`GET /api/admin/v1/orders/349453f9-da73-4d9a-8b9b-2b289fe26523/evidence?reason=Bank%20request%20sandbox` → **200**

```json
{
  "generated_at": "2026-10-30T19:33:07.007971103Z",
  "order": {
    "id": "349453f9-da73-4d9a-8b9b-2b289fe26523",
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
    "created_at": "2026-10-30T19:31:22.702219Z",
    "assigned_at": "2026-10-30T19:31:24.896219Z",
    "arrived_at": "2026-10-30T19:31:31.420348Z",
    "started_at": "2026-10-30T19:31:31.72121Z",
    "completed_at": "2026-10-30T19:33:02.366267Z"
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
    "id": "fa4fbd33-0e8a-4595-bcfb-d2e150f86836",
    "registered_at": "2026-10-30T19:31:20.268928Z",
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
      "created_at": "2026-10-30T19:31:22.704322Z"
    },
    {
      "type": "SETTLE",
      "state": "SUCCEEDED",
      "amount_minor": 16297,
      "currency": "UAH",
      "provider_status": "Approved",
      "created_at": "2026-10-30T19:33:02.926921Z"
    }
  ],
  "chat": [
    {
```

## Finance records the chargeback: the rider owes the fare again, a case opens

`POST /api/admin/v1/orders/349453f9-da73-4d9a-8b9b-2b289fe26523/chargebacks` → **422**

```json
{
  "command_id": "36fd989f-34d0-4616-b16b-dfbc0143097f",
  "amount_minor": 16298,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "instance": "/api/admin/v1/orders/349453f9-da73-4d9a-8b9b-2b289fe26523/chargebacks",
  "status": 422,
  "title": "Chargeback not allowed",
  "type": "https://errors.blizz.taxi/chargeback-not-allowed",
  "code": "CHARGEBACK_NOT_ALLOWED",
  "correlation_id": "38f1e1a5-5507-4e41-ac13-7540009effe8"
}
```

`POST /api/admin/v1/orders/349453f9-da73-4d9a-8b9b-2b289fe26523/chargebacks` → **201**

```json
{
  "command_id": "35df3b46-3b9c-490f-93bf-dcfb35f3af7b",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "id": "962c4049-c6a6-4719-88cb-8157153fdedb",
  "order_id": "349453f9-da73-4d9a-8b9b-2b289fe26523",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-30T19:33:07.66178Z",
  "resolved_at": null,
  "version": 0
}
```

`POST /api/admin/v1/orders/349453f9-da73-4d9a-8b9b-2b289fe26523/chargebacks` → **201**

```json
{
  "command_id": "35df3b46-3b9c-490f-93bf-dcfb35f3af7b",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "id": "962c4049-c6a6-4719-88cb-8157153fdedb",
  "order_id": "349453f9-da73-4d9a-8b9b-2b289fe26523",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-30T19:33:07.66178Z",
  "resolved_at": null,
  "version": 0
}
```

`GET /api/admin/v1/clients/fa4fbd33-0e8a-4595-bcfb-d2e150f86836` → **200**

```json
{
  "client": {
    "id": "fa4fbd33-0e8a-4595-bcfb-d2e150f86836",
    "phone": "+380735399119",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T19:31:20.268928Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "349453f9-da73-4d9a-8b9b-2b289fe26523",
      "short_number": 11,
      "status": "FULFILLED",
      "created_at": "2026-10-30T19:31:22.702219Z",
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

`POST /api/admin/v1/orders/349453f9-da73-4d9a-8b9b-2b289fe26523/chargebacks/962c4049-c6a6-4719-88cb-8157153fdedb/resolve` → **200**

```json
{
  "command_id": "cac2eb4e-27be-41b5-a4bf-ab3ba55bbce8",
  "expected_version": 0,
  "outcome": "WON",
  "reason": "Evidence accepted"
}
```

```json
{
  "id": "962c4049-c6a6-4719-88cb-8157153fdedb",
  "order_id": "349453f9-da73-4d9a-8b9b-2b289fe26523",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "WON",
  "resolution_reason": "Evidence accepted",
  "created_at": "2026-10-30T19:33:07.66178Z",
  "resolved_at": "2026-10-30T19:33:08.596871Z",
  "version": 1
}
```

`GET /api/admin/v1/clients/fa4fbd33-0e8a-4595-bcfb-d2e150f86836` → **200**

```json
{
  "client": {
    "id": "fa4fbd33-0e8a-4595-bcfb-d2e150f86836",
    "phone": "+380735399119",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T19:31:20.268928Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "349453f9-da73-4d9a-8b9b-2b289fe26523",
      "short_number": 11,
      "status": "FULFILLED",
      "created_at": "2026-10-30T19:31:22.702219Z",
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

`GET /api/admin/v1/clients/fa4fbd33-0e8a-4595-bcfb-d2e150f86836` → **200**

```json
{
  "client": {
    "id": "fa4fbd33-0e8a-4595-bcfb-d2e150f86836",
    "phone": "+380735399119",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T19:31:20.268928Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "349453f9-da73-4d9a-8b9b-2b289fe26523",
      "short_number": 11,
      "status": "FULFILLED",
      "created_at": "2026-10-30T19:31:22.702219Z",
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

`POST /api/admin/v1/orders/349453f9-da73-4d9a-8b9b-2b289fe26523/chargebacks/962c4049-c6a6-4719-88cb-8157153fdedb/resolve` → **409**

```json
{
  "command_id": "413d3397-fdda-433c-b67a-8e8e1cb198a0",
  "expected_version": 1,
  "outcome": "LOST",
  "reason": "Twice"
}
```

```json
{
  "instance": "/api/admin/v1/orders/349453f9-da73-4d9a-8b9b-2b289fe26523/chargebacks/962c4049-c6a6-4719-88cb-8157153fdedb/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "f0c67cba-fd21-426e-894f-a3be0b99fbfd"
}
```

`GET /api/admin/v1/orders/349453f9-da73-4d9a-8b9b-2b289fe26523/chargebacks` → **200**

```json
{
  "chargebacks": [
    {
      "id": "962c4049-c6a6-4719-88cb-8157153fdedb",
      "order_id": "349453f9-da73-4d9a-8b9b-2b289fe26523",
      "amount_minor": 16297,
      "currency": "UAH",
      "bank_reason": "4837 No cardholder authorization",
      "received_on": "2026-10-29",
      "state": "WON",
      "resolution_reason": "Evidence accepted",
      "created_at": "2026-10-30T19:33:07.66178Z",
      "resolved_at": "2026-10-30T19:33:08.596871Z",
      "version": 1
    }
  ]
}
```

Done: the evidence of card order 349453f9-da73-4d9a-8b9b-2b289fe26523 without phone or card digits; chargeback 962c4049-c6a6-4719-88cb-8157153fdedb recorded and won.

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
  "session_id": "c3394361-c0dd-4c16-b946-d79cc5fdb2de",
  "subject": {
    "type": "STAFF",
    "id": "bbeb0bd1-546e-4687-8aa4-9df00ff27005"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYmViMGJkMS01NDZlLTQ2ODctOGFhNC05ZGYwMGZmMjcwMDUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODk2OTEsImlhdCI6MTc5MzM4ODc5MSwianRpIjoiNGUwZTkwZjgtNWZiNy00ZjlkLTk0YjgtMmViNzAzYzM0NTgzIiwic2lkIjoiYzMzOTQzNjEtYzBkZC00YzE2LWI5NDYtZDc5Y2M1ZmRiMmRlIn0.jizdqUNlDzg9ZatQ8iI8xsxDnsiinO6hyvUyQkEygRk",
  "access_expires_at": "2026-10-30T19:48:11.687434178Z",
  "refresh_token": "VaC6ihK6J09qLe21M9qqXewpABaziryae5WKkkqIFfo",
  "refresh_expires_at": "2026-10-31T07:33:11.686928328Z",
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
  "phone": "+48600674116",
  "device_ref": "sandbox-25200"
}
```

```json
{
  "challenge_id": "1bc6d989-d7bd-453d-aa2d-f1cfabc23cfa",
  "expires_at": "2026-10-30T19:38:12.55357791Z",
  "resend_available_at": "2026-10-30T19:33:13.55357791Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600674116` → **200**

```json
{
  "phone": "+48600674116",
  "audience": "CLIENT",
  "code": "921511",
  "sent_at": "2026-10-30T19:33:12.556147655Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1bc6d989-d7bd-453d-aa2d-f1cfabc23cfa",
  "code": "921511",
  "device_ref": "sandbox-25200"
}
```

```json
{
  "session_id": "9669eddc-a476-4fb9-98fc-9a4968a031b0",
  "subject": {
    "type": "CLIENT",
    "id": "9baa914c-2246-42dd-95ad-02b72bb75f8f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YmFhOTE0Yy0yMjQ2LTQyZGQtOTVhZC0wMmI3MmJiNzVmOGYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzg5NjkyLCJpYXQiOjE3OTMzODg3OTIsImp0aSI6ImJhZjJkNWUzLWQyNWMtNDdhZS04ZjBlLWZkNmFkZjI2YTM1OCIsInNpZCI6Ijk2NjllZGRjLWE0NzYtNGZiOS05OGZjLTlhNDk2OGEwMzFiMCJ9.kA10cZHuiIqfvsJvSqKsZy7-o9OI-zNRHaTDPge7a4o",
  "access_expires_at": "2026-10-30T19:48:12.863522844Z",
  "refresh_token": "cHyEE5BHTIgYvTsZeXhXzm-SFsfzgIUGGeTx3co8QQ4",
  "refresh_expires_at": "2026-11-29T19:33:12.863008794Z",
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
  "command_id": "eefc4bae-7d8d-4edb-9164-f3ece1c5be51",
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
  "correlation_id": "46a38e70-1d36-4bed-8b61-a3036836612b",
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
  "command_id": "556359a8-89d2-4670-a0cd-a223ad21b8fe",
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
  "paused_at": "2026-10-30T19:33:14.034503023Z",
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
  "command_id": "7d4b1125-fc66-47ee-8aea-5292da53ff6a",
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
  "id": "6c6f0491-0c46-4aa6-b409-2525adfe8594",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T19:38:14.631309Z",
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
  "command_id": "5cea0959-0cf3-45b0-b772-d2fea60d6b63",
  "quote_id": "6c6f0491-0c46-4aa6-b409-2525adfe8594",
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
  "correlation_id": "cae9605d-a02c-465a-98fc-1c65982a08ed"
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
  "paused_at": "2026-10-30T19:33:14.034503Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "670eff02-407a-4165-8c1c-468153a882ee",
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
  "command_id": "e0cf2a4b-36ba-4b9d-8f62-89d762033eb7",
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
  "command_id": "aae4ac67-0cfa-413d-aedc-fe49cb7603a5",
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
  "id": "6a98a9f6-2e5b-48d1-b768-1a4a2483664f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T19:38:16.380822Z",
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
  "command_id": "1c4613a6-3dc2-4dc5-8875-0b5a8e97418b",
  "quote_id": "6a98a9f6-2e5b-48d1-b768-1a4a2483664f",
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
  "correlation_id": "fb4a7b6c-a94e-4dcd-8237-983dbbbd07b3"
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
  "command_id": "34a1cb49-b37e-469c-928c-22706a82d73b",
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
  "command_id": "f73230d0-3faa-4ae6-8ed8-ab56ec5230c1",
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
  "id": "a3823b49-e0e5-445a-921d-b81e8e7cb206",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T19:38:17.564047Z",
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
  "command_id": "62014b47-e1f2-442f-8d68-ec6623b3e4c6",
  "quote_id": "a3823b49-e0e5-445a-921d-b81e8e7cb206",
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
  "correlation_id": "8f5ef42d-bca9-46ed-87a0-17ef23218a25"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "74aa8610-b8ae-4ac7-9aac-a4ea219c6e33",
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
  "correlation_id": "8b9ee642-936a-45e5-9872-83f91ed90ed1",
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
  "command_id": "74d824ec-7251-4ea9-a8a2-c39baca15c7c",
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
  "phone": "+380677312691",
  "device_ref": "sandbox-29014"
}
```

```json
{
  "challenge_id": "82d2e6cf-8f2f-4cd6-b762-9059a679c60d",
  "expires_at": "2026-10-30T19:38:19.099141876Z",
  "resend_available_at": "2026-10-30T19:33:20.099141876Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380677312691` → **200**

```json
{
  "phone": "+380677312691",
  "audience": "CLIENT",
  "code": "550347",
  "sent_at": "2026-10-30T19:33:19.101645456Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "82d2e6cf-8f2f-4cd6-b762-9059a679c60d",
  "code": "550347",
  "device_ref": "sandbox-29014"
}
```

```json
{
  "session_id": "84c8f9b9-644b-47f4-a933-f6329831aea0",
  "subject": {
    "type": "CLIENT",
    "id": "7ae6f54c-81f9-4852-b7ed-2537140e9af3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YWU2ZjU0Yy04MWY5LTQ4NTItYjdlZC0yNTM3MTQwZTlhZjMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzg5Njk5LCJpYXQiOjE3OTMzODg3OTksImp0aSI6IjhiNzFiYWE3LTRlMmItNDBkNS04NjQyLWEzZWYwZTY1ZWYzYSIsInNpZCI6Ijg0YzhmOWI5LTY0NGItNDdmNC1hOTMzLWY2MzI5ODMxYWVhMCJ9.qyeJT-4n9AW_d5_wRpbzGF4JDeU5ICWmfPDI4shhcN4",
  "access_expires_at": "2026-10-30T19:48:19.420958431Z",
  "refresh_token": "zcQsNpUOnIyRDqrJBpVdV6mlLW1KWmmFrhoNKhwhXHw",
  "refresh_expires_at": "2026-11-29T19:33:19.42019816Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "7ae6f54c-81f9-4852-b7ed-2537140e9af3",
  "session_id": "84c8f9b9-644b-47f4-a933-f6329831aea0",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "3d4b9bdd-1159-402f-a6ef-37d74ffb3c9b",
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
  "id": "18ccf10d-fcff-4c41-8504-961c846a483b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T19:38:20.003805Z",
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
  "challenge_id": "eae7e48a-6a97-4d26-8048-eb5ca0b8d442",
  "expires_at": "2026-10-30T19:38:22.302564265Z",
  "resend_available_at": "2026-10-30T19:33:23.302564265Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380677312691` → **200**

```json
{
  "phone": "+380677312691",
  "audience": "CLIENT",
  "code": "453869",
  "sent_at": "2026-10-30T19:33:22.304970393Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "dfad0697-d14a-4bb2-a39f-960c77085d8d",
  "challenge_id": "eae7e48a-6a97-4d26-8048-eb5ca0b8d442",
  "otp_code": "453869"
}
```

```json
{
  "client_id": "7ae6f54c-81f9-4852-b7ed-2537140e9af3",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-30T19:33:22.628997824Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "c8da1a0e-14d2-4f52-b27e-952ede5f49e1",
  "quote_id": "18ccf10d-fcff-4c41-8504-961c846a483b",
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
  "correlation_id": "db3e3ef4-1810-4de3-bfb1-83a7035e33c9"
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
  "session_id": "613adfa2-6d08-4b55-affc-396239b27db3",
  "subject": {
    "type": "STAFF",
    "id": "bbeb0bd1-546e-4687-8aa4-9df00ff27005"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYmViMGJkMS01NDZlLTQ2ODctOGFhNC05ZGYwMGZmMjcwMDUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODk3MDMsImlhdCI6MTc5MzM4ODgwMywianRpIjoiNWNjMTQzYzgtMWFiMy00ZGIwLTlhNDktNGUzOGU5MGUzYWY1Iiwic2lkIjoiNjEzYWRmYTItNmQwOC00YjU1LWFmZmMtMzk2MjM5YjI3ZGIzIn0.P5ajtw-DRWyB33xgqtpzRhoQn_RNRpkuiEvjV33Bj3Y",
  "access_expires_at": "2026-10-30T19:48:23.516419258Z",
  "refresh_token": "7FW_tENGz6D7t2mJPMgPG9Ba9L892ft5rKcxkPTXOaM",
  "refresh_expires_at": "2026-10-31T07:33:23.515836107Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "7ae6f54c-81f9-4852-b7ed-2537140e9af3",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-30T19:33:22.628998Z",
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

`POST /api/admin/v1/client-deletions/7ae6f54c-81f9-4852-b7ed-2537140e9af3/complete` → **200**

```json
{
  "command_id": "fa21991c-9b49-43bd-b9e6-d3622d9c0b92",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "7ae6f54c-81f9-4852-b7ed-2537140e9af3",
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
  "correlation_id": "d9ec0fb5-df4c-4854-89fa-787e11a41137"
}
```

Done: client 7ae6f54c-81f9-4852-b7ed-2537140e9af3 anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380663599627",
  "device_ref": "sandbox-18067"
}
```

```json
{
  "challenge_id": "4313d4cb-ba80-4d5a-a115-e6306695de3a",
  "expires_at": "2026-10-30T19:38:24.705332698Z",
  "resend_available_at": "2026-10-30T19:33:25.705332698Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380663599627` → **200**

```json
{
  "phone": "+380663599627",
  "audience": "CLIENT",
  "code": "093233",
  "sent_at": "2026-10-30T19:33:24.707961032Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4313d4cb-ba80-4d5a-a115-e6306695de3a",
  "code": "093233",
  "device_ref": "sandbox-18067"
}
```

```json
{
  "session_id": "16bbca41-16e0-496a-b5e4-1ec4dfc28941",
  "subject": {
    "type": "CLIENT",
    "id": "c4f419f6-f832-4c99-9d23-f5a934f56179"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNGY0MTlmNi1mODMyLTRjOTktOWQyMy1mNWE5MzRmNTYxNzkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzg5NzA1LCJpYXQiOjE3OTMzODg4MDUsImp0aSI6IjMzOTU3ZGQ1LWJmOTEtNDQyYi05ZmUzLTZlZTg2NmY0OWFmZCIsInNpZCI6IjE2YmJjYTQxLTE2ZTAtNDk2YS1iNWU0LTFlYzRkZmMyODk0MSJ9.7O4I0Ib8UdJU-xKzhFOIiNJFR-nph8dDcNnp8lv26UQ",
  "access_expires_at": "2026-10-30T19:48:25.019010746Z",
  "refresh_token": "9tacCjTEaQfq6N651A36vnYzSsRSvEPKorOCIcmZ5FM",
  "refresh_expires_at": "2026-11-29T19:33:25.018460247Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "c4f419f6-f832-4c99-9d23-f5a934f56179",
  "session_id": "16bbca41-16e0-496a-b5e4-1ec4dfc28941",
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
  "session_id": "c2809173-4922-4e51-b236-85f059d31fb3",
  "subject": {
    "type": "STAFF",
    "id": "bbeb0bd1-546e-4687-8aa4-9df00ff27005"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYmViMGJkMS01NDZlLTQ2ODctOGFhNC05ZGYwMGZmMjcwMDUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODk3MDUsImlhdCI6MTc5MzM4ODgwNSwianRpIjoiMjQ4YmZkOTktMTE4Mi00Y2E1LTk2ZWUtZjk2YTE5YjdmNjNhIiwic2lkIjoiYzI4MDkxNzMtNDkyMi00ZTUxLWIyMzYtODVmMDU5ZDMxZmIzIn0.zVS1tHyyMN6RYpIN5vjDMt40tQrGV0MF2RbVT507KLk",
  "access_expires_at": "2026-10-30T19:48:25.87787423Z",
  "refresh_token": "Jx_dYoWh0aGyOuQrne5HsVuNgTClWDqV2Nqa8mTVf80",
  "refresh_expires_at": "2026-10-31T07:33:25.87692695Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=3599627&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "c4f419f6-f832-4c99-9d23-f5a934f56179",
      "phone": "+380663599627",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-30T19:33:25.016956Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/c4f419f6-f832-4c99-9d23-f5a934f56179` → **200**

```json
{
  "client": {
    "id": "c4f419f6-f832-4c99-9d23-f5a934f56179",
    "phone": "+380663599627",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T19:33:25.016956Z",
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

`POST /api/admin/v1/clients/c4f419f6-f832-4c99-9d23-f5a934f56179/block` → **400**

```json
{
  "command_id": "98380505-5868-4b98-91d5-0317e1e934f6",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/c4f419f6-f832-4c99-9d23-f5a934f56179/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "768a5f4b-a6ae-441b-b655-4124cf464213",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/c4f419f6-f832-4c99-9d23-f5a934f56179/block` → **200**

```json
{
  "command_id": "d7aed399-9e73-43bc-a25e-978c49684c3e",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "c4f419f6-f832-4c99-9d23-f5a934f56179",
  "phone": "+380663599627",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-30T19:33:25.016956Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-30T19:33:27.101494Z",
    "by": "bbeb0bd1-546e-4687-8aa4-9df00ff27005"
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
  "correlation_id": "50aaa7a5-2e4a-4b0e-8950-04bae6597617"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380663599627",
  "device_ref": "sandbox-23529"
}
```

```json
{
  "challenge_id": "aa664bc1-dc1b-4854-a312-2cd24e1b0858",
  "expires_at": "2026-10-30T19:38:29.688826796Z",
  "resend_available_at": "2026-10-30T19:33:30.688826796Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380663599627` → **200**

```json
{
  "phone": "+380663599627",
  "audience": "CLIENT",
  "code": "680140",
  "sent_at": "2026-10-30T19:33:29.691210674Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "aa664bc1-dc1b-4854-a312-2cd24e1b0858",
  "code": "680140",
  "device_ref": "sandbox-23529"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "b55b7100-41d6-493a-810b-7638b11a65eb"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/c4f419f6-f832-4c99-9d23-f5a934f56179` → **200**

```json
{
  "client": {
    "id": "c4f419f6-f832-4c99-9d23-f5a934f56179",
    "phone": "+380663599627",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-30T19:33:25.016956Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-30T19:33:27.101494Z",
      "by": "bbeb0bd1-546e-4687-8aa4-9df00ff27005"
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

`POST /api/admin/v1/clients/c4f419f6-f832-4c99-9d23-f5a934f56179/unblock` → **200**

```json
{
  "command_id": "e116a8fa-b854-480f-87c2-b7d06b4d6288",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "c4f419f6-f832-4c99-9d23-f5a934f56179",
  "phone": "+380663599627",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-30T19:33:25.016956Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380663599627",
  "device_ref": "sandbox-23453"
}
```

```json
{
  "challenge_id": "082ac13a-959a-4432-aa62-0e75c26cb007",
  "expires_at": "2026-10-30T19:38:32.920947903Z",
  "resend_available_at": "2026-10-30T19:33:33.920947903Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380663599627` → **200**

```json
{
  "phone": "+380663599627",
  "audience": "CLIENT",
  "code": "171705",
  "sent_at": "2026-10-30T19:33:32.923559024Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "082ac13a-959a-4432-aa62-0e75c26cb007",
  "code": "171705",
  "device_ref": "sandbox-23453"
}
```

```json
{
  "session_id": "35a05fc9-57b3-4712-a9f7-70a070a7b90a",
  "subject": {
    "type": "CLIENT",
    "id": "c4f419f6-f832-4c99-9d23-f5a934f56179"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNGY0MTlmNi1mODMyLTRjOTktOWQyMy1mNWE5MzRmNTYxNzkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzg5NzEzLCJpYXQiOjE3OTMzODg4MTMsImp0aSI6IjAzZTFkN2YxLTZhMjAtNGY0YS1hZWMwLTZkMmM5ZTA5ZDg0ZiIsInNpZCI6IjM1YTA1ZmM5LTU3YjMtNDcxMi1hOWY3LTcwYTA3MGE3YjkwYSJ9.bTOqOF1BuvGYl2y3dU9weK2Rbn2rHK6vjfhRRoA-yhg",
  "access_expires_at": "2026-10-30T19:48:33.291880476Z",
  "refresh_token": "P7HUhcryQGX5rrKTXNcXJfCawSRfsi2DYR41g0qrmVY",
  "refresh_expires_at": "2026-11-29T19:33:33.291174179Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "c4f419f6-f832-4c99-9d23-f5a934f56179",
  "session_id": "35a05fc9-57b3-4712-a9f7-70a070a7b90a",
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
  "phone": "+380669140233",
  "device_ref": "sandbox-7409"
}
```

```json
{
  "challenge_id": "19077eae-dbd6-418d-9b22-d73bdb8a5277",
  "expires_at": "2026-10-30T19:38:33.955282842Z",
  "resend_available_at": "2026-10-30T19:33:34.955282842Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380669140233` → **200**

```json
{
  "phone": "+380669140233",
  "audience": "CLIENT",
  "code": "563557",
  "sent_at": "2026-10-30T19:33:33.958852585Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "19077eae-dbd6-418d-9b22-d73bdb8a5277",
  "code": "563557",
  "device_ref": "sandbox-7409"
}
```

```json
{
  "session_id": "bf54719a-fb0d-4dae-b7aa-879fda9d0ccb",
  "subject": {
    "type": "CLIENT",
    "id": "ddf50613-1470-4488-b870-1fa495a21084"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkZGY1MDYxMy0xNDcwLTQ0ODgtYjg3MC0xZmE0OTVhMjEwODQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzg5NzE0LCJpYXQiOjE3OTMzODg4MTQsImp0aSI6ImM0MDFmZWZhLTU0NGEtNDAxMi1hY2U5LTBhNGJmNTM1YjM5MCIsInNpZCI6ImJmNTQ3MTlhLWZiMGQtNGRhZS1iN2FhLTg3OWZkYTlkMGNjYiJ9.wfYRVIALNAmjYvfpuKwTllVmD-WC8AU8h6jeDbQMZnI",
  "access_expires_at": "2026-10-30T19:48:34.304075541Z",
  "refresh_token": "MkUzUnjLQmUc5o4f_2JQCz_zHYtogLmbG5bqk1NsG2A",
  "refresh_expires_at": "2026-11-29T19:33:34.303560426Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "13fc800c-4c46-458c-b7e2-2d2a341c7d9b",
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
  "id": "fe3c0c6f-95e9-4c52-acc9-a67267a8758c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T19:38:34.592115Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: 813a28f4-6a1c-4139-9501-f6664d94404f) → **201**

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
  "session_id": "15f98d65-0a47-4af1-8683-c77426199678",
  "subject": {
    "type": "STAFF",
    "id": "bbeb0bd1-546e-4687-8aa4-9df00ff27005"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYmViMGJkMS01NDZlLTQ2ODctOGFhNC05ZGYwMGZmMjcwMDUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODk3MTUsImlhdCI6MTc5MzM4ODgxNSwianRpIjoiZDgwNGU1MGEtMTc5My00MzgzLTljYTUtOTg1Y2I4N2FiZTQ3Iiwic2lkIjoiMTVmOThkNjUtMGE0Ny00YWYxLTg2ODMtYzc3NDI2MTk5Njc4In0.wZPPfgH3O7YpAvlRJligpUxv82nPyXgTAhblICEvXuc",
  "access_expires_at": "2026-10-30T19:48:35.229191016Z",
  "refresh_token": "ioOeeQgYK1HznqEv9d1vQ0fiHRENMoqVjdR868w8vHw",
  "refresh_expires_at": "2026-10-31T07:33:35.228589301Z",
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
  "session_id": "cdb5c142-0ae1-4841-8148-d744b6ff6981",
  "subject": {
    "type": "STAFF",
    "id": "bbeb0bd1-546e-4687-8aa4-9df00ff27005"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYmViMGJkMS01NDZlLTQ2ODctOGFhNC05ZGYwMGZmMjcwMDUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODk3MTUsImlhdCI6MTc5MzM4ODgxNSwianRpIjoiOGM2ZGFkOTgtZTc3Zi00NDg5LTk3NzgtMjIxNDc0NjBiZWMzIiwic2lkIjoiY2RiNWMxNDItMGFlMS00ODQxLTgxNDgtZDc0NGI2ZmY2OTgxIn0.J-QakYawXOlvFHjqDckTgo0FVA1Z8fK8faFxJ18fIsM",
  "access_expires_at": "2026-10-30T19:48:35.815093876Z",
  "refresh_token": "uqPeRJcIrt8pK68Y8h3-XL1h9yZIi5PamQjyaadncjU",
  "refresh_expires_at": "2026-10-31T07:33:35.814557293Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/2b585f44-b48f-4f06-b7b4-e570d0630114/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T19:33:34.902538Z",
      "actor": {
        "type": "CLIENT",
        "id": "ddf50613-1470-4488-b870-1fa495a21084",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "2b585f44-b48f-4f06-b7b4-e570d0630114",
        "quote_id": "fe3c0c6f-95e9-4c52-acc9-a67267a8758c",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "813a28f4-6a1c-4139-9501-f6664d94404f"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T19:33:34.904151Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "2b585f44-b48f-4f06-b7b4-e570d0630114",
        "attempt_id": "b2a6a5de-d60e-4203-8b38-af8cd728a7d5",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "813a28f4-6a1c-4139-9501-f6664d94404f"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-30T19:33:34.909806Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "2b585f44-b48f-4f06-b7b4-e570d0630114",
        "attempt_id": "b2a6a5de-d60e-4203-8b38-af8cd728a7d5"
      },
      "correlation_id": "813a28f4-6a1c-4139-9501-f6664d94404f"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "b2a6a5de-d60e-4203-8b38-af8cd728a7d5",
        "generation": 1,
        "started_at": "2026-10-30T19:33:34.903264Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-30T19:33:34.909806Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-30T19:33:34.904743Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/813a28f4-6a1c-4139-9501-f6664d94404f` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "2b585f44-b48f-4f06-b7b4-e570d0630114:0",
      "order_id": "2b585f44-b48f-4f06-b7b4-e570d0630114",
      "at": "2026-10-30T19:33:34.902538Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "2b585f44-b48f-4f06-b7b4-e570d0630114:1",
      "order_id": "2b585f44-b48f-4f06-b7b4-e570d0630114",
      "at": "2026-10-30T19:33:34.904151Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "2b585f44-b48f-4f06-b7b4-e570d0630114:2",
      "order_id": "2b585f44-b48f-4f06-b7b4-e570d0630114",
      "at": "2026-10-30T19:33:34.909806Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/09dc92eb-6a40-46bb-be1e-58e1e7c888d6` → **200**

```json
{
  "found": []
}
```

Done: request 813a28f4-6a1c-4139-9501-f6664d94404f — order 2b585f44-b48f-4f06-b7b4-e570d0630114 found by its id.

`GET /api/rider/v1/orders/2b585f44-b48f-4f06-b7b4-e570d0630114` → **200**

```json
{
  "id": "2b585f44-b48f-4f06-b7b4-e570d0630114",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ddf50613-1470-4488-b870-1fa495a21084",
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
  "created_at": "2026-10-30T19:33:34.902101Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/2b585f44-b48f-4f06-b7b4-e570d0630114/cancel` → **200**

```json
{
  "command_id": "edb525ab-8d4f-4989-b030-cd20737be8d9",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "2b585f44-b48f-4f06-b7b4-e570d0630114",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "ddf50613-1470-4488-b870-1fa495a21084",
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
  "created_at": "2026-10-30T19:33:34.902101Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "uk": "Передумав їхати",
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
      "en": "Changed my mind"
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
  "phone": "+380630967892",
  "device_ref": "sandbox-14969"
}
```

```json
{
  "challenge_id": "d2af2c84-7b31-4be6-8ef1-3938ced0eae2",
  "expires_at": "2026-10-30T19:38:37.626122259Z",
  "resend_available_at": "2026-10-30T19:33:38.626122259Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380630967892` → **200**

```json
{
  "phone": "+380630967892",
  "audience": "CLIENT",
  "code": "974897",
  "sent_at": "2026-10-30T19:33:37.628777552Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d2af2c84-7b31-4be6-8ef1-3938ced0eae2",
  "code": "974897",
  "device_ref": "sandbox-14969"
}
```

```json
{
  "session_id": "8e7c678c-f9c1-4444-bc29-a770ddd1db04",
  "subject": {
    "type": "CLIENT",
    "id": "826b2a43-929e-404e-b7f7-c4bb9b4da420"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4MjZiMmE0My05MjllLTQwNGUtYjdmNy1jNGJiOWI0ZGE0MjAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzg5NzE3LCJpYXQiOjE3OTMzODg4MTcsImp0aSI6ImMxZDA5MTIwLTQwZDktNGQxZS1iOTgxLThlZTBlMTIwODEyMyIsInNpZCI6IjhlN2M2NzhjLWY5YzEtNDQ0NC1iYzI5LWE3NzBkZGQxZGIwNCJ9.dAiEn3QSm-5MFbKJK29KC3cXHW7lL63LU2cY7OE6rIs",
  "access_expires_at": "2026-10-30T19:48:37.942556046Z",
  "refresh_token": "GYuwpM4QI3eAzFkyG7KD7tOYnMK6W2kjxEvDZ3WVpck",
  "refresh_expires_at": "2026-11-29T19:33:37.941939032Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "99753d47-8a8e-4c34-b491-f4c8b6cea722",
  "expires_at": "2026-10-30T19:38:40.230596941Z",
  "resend_available_at": "2026-10-30T19:33:41.230596941Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630967892` → **200**

```json
{
  "phone": "+380630967892",
  "audience": "CLIENT",
  "code": "306491",
  "sent_at": "2026-10-30T19:33:40.233686016Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "5d2540f9-19f1-47b0-8d1d-3f768a263a71",
  "challenge_id": "99753d47-8a8e-4c34-b491-f4c8b6cea722",
  "otp_code": "306491"
}
```

```json
{
  "id": "7640ca57-9f56-4638-b46f-e53cb9528b3d",
  "state": "PENDING",
  "created_at": "2026-10-30T19:33:40.558873Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/7640ca57-9f56-4638-b46f-e53cb9528b3d` → **200**

```json
{
  "id": "7640ca57-9f56-4638-b46f-e53cb9528b3d",
  "state": "PENDING",
  "created_at": "2026-10-30T19:33:40.558873Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/7640ca57-9f56-4638-b46f-e53cb9528b3d` → **200**

```json
{
  "id": "7640ca57-9f56-4638-b46f-e53cb9528b3d",
  "state": "PENDING",
  "created_at": "2026-10-30T19:33:40.558873Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/7640ca57-9f56-4638-b46f-e53cb9528b3d` → **200**

```json
{
  "id": "7640ca57-9f56-4638-b46f-e53cb9528b3d",
  "state": "READY",
  "created_at": "2026-10-30T19:33:40.558873Z",
  "ready_at": "2026-10-30T19:33:43.340533Z",
  "expires_at": "2026-11-06T19:33:43.340533Z",
  "size_bytes": 1031
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/7640ca57-9f56-4638-b46f-e53cb9528b3d/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638024645",
  "device_ref": "sandbox-18901"
}
```

```json
{
  "challenge_id": "1637430a-cef8-43e8-a517-7448317a7541",
  "expires_at": "2026-10-30T19:38:43.728685727Z",
  "resend_available_at": "2026-10-30T19:33:44.728685727Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638024645` → **200**

```json
{
  "phone": "+380638024645",
  "audience": "CLIENT",
  "code": "109135",
  "sent_at": "2026-10-30T19:33:43.731645327Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1637430a-cef8-43e8-a517-7448317a7541",
  "code": "109135",
  "device_ref": "sandbox-18901"
}
```

```json
{
  "session_id": "a905a0c7-1e22-4a50-b285-479d20b4cfc9",
  "subject": {
    "type": "CLIENT",
    "id": "b2bef0d8-3284-4a38-8531-22e4711130fc"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMmJlZjBkOC0zMjg0LTRhMzgtODUzMS0yMmU0NzExMTMwZmMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzg5NzI0LCJpYXQiOjE3OTMzODg4MjQsImp0aSI6ImYxYTQ4MTFlLTQ5MDUtNGZmOC05ZjA3LWIyOGIyYTBmNjUwNSIsInNpZCI6ImE5MDVhMGM3LTFlMjItNGE1MC1iMjg1LTQ3OWQyMGI0Y2ZjOSJ9.BVJ1c4Wlk7jsg_TzjG4Q5vRaWeIhpfk4q5if66JEL9Q",
  "access_expires_at": "2026-10-30T19:48:44.048312231Z",
  "refresh_token": "IGEYkSJ7RwTwXUSkUxBadmQ_S29vUIcSPGl6TrGGpgE",
  "refresh_expires_at": "2026-11-29T19:33:44.0478192Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/7640ca57-9f56-4638-b46f-e53cb9528b3d/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/7640ca57-9f56-4638-b46f-e53cb9528b3d/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "225624c6-bb18-4beb-8c5e-1b34f972ef0f"
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
  "session_id": "195ee241-5b02-44af-922a-2b19860a6575",
  "subject": {
    "type": "STAFF",
    "id": "bbeb0bd1-546e-4687-8aa4-9df00ff27005"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYmViMGJkMS01NDZlLTQ2ODctOGFhNC05ZGYwMGZmMjcwMDUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODk3MjQsImlhdCI6MTc5MzM4ODgyNCwianRpIjoiMDBjYjM3ZjctYzFiOC00Y2I5LTkzYzEtNTY1YzE4NGQzN2Y4Iiwic2lkIjoiMTk1ZWUyNDEtNWIwMi00NGFmLTkyMmEtMmIxOTg2MGE2NTc1In0.NIa5zM5LSv2yjgByJ3h-1vgqoVbvmmpJxYH2H6ok0rY",
  "access_expires_at": "2026-10-30T19:48:44.915676466Z",
  "refresh_token": "wirL1HZq46-6UwCB12wKZnlnbUohNCs1nWNKilhkqAE",
  "refresh_expires_at": "2026-10-31T07:33:44.91504452Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "826b2a43-929e-404e-b7f7-c4bb9b4da420",
  "session_id": "8e7c678c-f9c1-4444-bc29-a770ddd1db04",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/826b2a43-929e-404e-b7f7-c4bb9b4da420/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "7640ca57-9f56-4638-b46f-e53cb9528b3d",
      "state": "READY",
      "created_at": "2026-10-30T19:33:40.558873Z",
      "ready_at": "2026-10-30T19:33:43.340533Z",
      "expires_at": "2026-11-06T19:33:43.340533Z",
      "size_bytes": 1031
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
  "device_ref": "sandbox-31820"
}
```

```json
{
  "challenge_id": "4a85d86f-339a-428b-aed3-c93859dae4bb",
  "expires_at": "2026-10-30T19:38:45.76961448Z",
  "resend_available_at": "2026-10-30T19:33:46.76961448Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "665729",
  "sent_at": "2026-10-30T19:33:45.772321212Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4a85d86f-339a-428b-aed3-c93859dae4bb",
  "code": "665729",
  "device_ref": "sandbox-31820"
}
```

```json
{
  "session_id": "87e51615-07dc-4de4-8e83-1d26e7fc1c6a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4OTcyNiwiaWF0IjoxNzkzMzg4ODI2LCJqdGkiOiJhYjMzODRmNy00MTE0LTRlZmItYjRmYS03M2M5YTJhOTgxNjEiLCJzaWQiOiI4N2U1MTYxNS0wN2RjLTRkZTQtOGU4My0xZDI2ZTdmYzFjNmEifQ.vEK9tS3o34BSQ9fh2hKR13xcJiJtzM7_IKJlelkwu3g",
  "access_expires_at": "2026-10-30T19:48:46.085601089Z",
  "refresh_token": "zCBZ_ENkBBmo1Q2XgVo5Df8oYS5NvT3kJqWG6ciFuIo",
  "refresh_expires_at": "2026-11-29T19:33:46.084813697Z",
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
  "device_ref": "sandbox-13886"
}
```

```json
{
  "challenge_id": "a5eece7c-9e7f-43b4-b74a-c1af6228e3ce",
  "expires_at": "2026-10-30T19:38:46.64776436Z",
  "resend_available_at": "2026-10-30T19:33:47.64776436Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "432191",
  "sent_at": "2026-10-30T19:33:46.650504941Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a5eece7c-9e7f-43b4-b74a-c1af6228e3ce",
  "code": "432191",
  "device_ref": "sandbox-13886"
}
```

```json
{
  "session_id": "5dd12c0c-5d08-4e62-9070-e5abf80838e4",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4OTcyNiwiaWF0IjoxNzkzMzg4ODI2LCJqdGkiOiIwZjhiODAxYS1hODhhLTQzZjgtYWRiNC1lMjlkOTIzYTEyOTIiLCJzaWQiOiI1ZGQxMmMwYy01ZDA4LTRlNjItOTA3MC1lNWFiZjgwODM4ZTQifQ.ApnI3izD0XZTnXvkAWw5odpNIRBZ_axAtgKw-EKCV04",
  "access_expires_at": "2026-10-30T19:48:46.964738423Z",
  "refresh_token": "Tb2bBq-AaqVMlZKYyhfXiyMmc-RsaDuL4oNoxxk-rFc",
  "refresh_expires_at": "2026-11-29T19:33:46.964160701Z",
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
  "command_id": "c294741d-6ebe-42da-a31a-1608e15cf65b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:33:47Z",
    "sequence": 1793388827561
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8cc34ea6-95c2-42fc-955d-f023e9396c87",
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
  "last_heartbeat_at": "2026-10-30T19:33:47.581261Z",
  "last_location_at": "2026-10-30T19:33:47.581261Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-13056"
}
```

```json
{
  "challenge_id": "ffdfe8a8-b91e-44c6-b105-8bc026414201",
  "expires_at": "2026-10-30T19:38:47.874431662Z",
  "resend_available_at": "2026-10-30T19:33:48.874431662Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "661464",
  "sent_at": "2026-10-30T19:33:47.877143566Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ffdfe8a8-b91e-44c6-b105-8bc026414201",
  "code": "661464",
  "device_ref": "sandbox-13056"
}
```

```json
{
  "session_id": "eb583136-60d1-4eaa-be64-426dcc049eb1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4OTcyOCwiaWF0IjoxNzkzMzg4ODI4LCJqdGkiOiI2MWRmNGNjMi1iYTIwLTQxZjktYTExYi00NmM1Y2YxZWZjOTQiLCJzaWQiOiJlYjU4MzEzNi02MGQxLTRlYWEtYmU2NC00MjZkY2MwNDllYjEifQ.4ff5ItKDSnyhAMe-q0XW_zVh5AyufEl64XQ8nMRmvc8",
  "access_expires_at": "2026-10-30T19:48:48.190286214Z",
  "refresh_token": "OGUDK4AwMz2OgdaOc-5zdbeg1c014GbvtBpWxit6-vo",
  "refresh_expires_at": "2026-11-29T19:33:48.189736928Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "e0a862e6-3f0d-4e9f-838a-9a47053bfd74",
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
  "last_heartbeat_at": "2026-10-30T19:29:49.755815Z",
  "last_location_at": "2026-10-30T19:29:49.755815Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/e0a862e6-3f0d-4e9f-838a-9a47053bfd74/handover` → **200**

```json
{
  "command_id": "56130824-aa50-4b55-a67c-9b763295ba5f",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "e0a862e6-3f0d-4e9f-838a-9a47053bfd74",
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
  "last_heartbeat_at": "2026-10-30T19:29:49.755815Z",
  "last_location_at": "2026-10-30T19:29:49.755815Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/e0a862e6-3f0d-4e9f-838a-9a47053bfd74/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:33:49Z",
    "sequence": 1793388829848
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "e0a862e6-3f0d-4e9f-838a-9a47053bfd74",
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
  "last_heartbeat_at": "2026-10-30T19:33:49.102789Z",
  "last_location_at": "2026-10-30T19:33:49.102789Z",
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
  "session_id": "1ada07ad-6145-4066-a6d7-ce1c1342bb88",
  "subject": {
    "type": "STAFF",
    "id": "bbeb0bd1-546e-4687-8aa4-9df00ff27005"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYmViMGJkMS01NDZlLTQ2ODctOGFhNC05ZGYwMGZmMjcwMDUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODk3MjksImlhdCI6MTc5MzM4ODgyOSwianRpIjoiMzc4ODhlNjAtMTU3YS00MDQzLThmZGEtNWU5NWFlNzIzYjRmIiwic2lkIjoiMWFkYTA3YWQtNjE0NS00MDY2LWE2ZDctY2UxYzEzNDJiYjg4In0.HG2CWzl_fbLccY5ePkEda8D-WB9Z6nX4i1MHAkey_jY",
  "access_expires_at": "2026-10-30T19:48:49.674845108Z",
  "refresh_token": "fI9vaYvctUnaffJZ3irMlnxHeWyPT8TyqtO7n2IHEdo",
  "refresh_expires_at": "2026-10-31T07:33:49.674255366Z",
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
  "session_id": "014a42ad-7032-490e-8646-7d2a324ee970",
  "subject": {
    "type": "STAFF",
    "id": "bbeb0bd1-546e-4687-8aa4-9df00ff27005"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYmViMGJkMS01NDZlLTQ2ODctOGFhNC05ZGYwMGZmMjcwMDUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODk3MzAsImlhdCI6MTc5MzM4ODgzMCwianRpIjoiN2M2ZDM3ZDctMGY3MC00MjFkLTg2ZTktMjAwYzNhZTNmMTNkIiwic2lkIjoiMDE0YTQyYWQtNzAzMi00OTBlLTg2NDYtN2QyYTMyNGVlOTcwIn0.E297cxH83xk98srU5jFJCYS5m8lpbovusBIZO-x23Ds",
  "access_expires_at": "2026-10-30T19:48:50.259220882Z",
  "refresh_token": "DzpxEmIuk8mqEVrAbMjA0xhVW4L7n2qsazpwuo11Xvo",
  "refresh_expires_at": "2026-10-31T07:33:50.258711724Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380684138254",
  "device_ref": "sandbox-24743"
}
```

```json
{
  "challenge_id": "adb761f8-9f56-4484-afd3-1f62a9262a74",
  "expires_at": "2026-10-30T19:38:50.54636015Z",
  "resend_available_at": "2026-10-30T19:33:51.54636015Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380684138254` → **200**

```json
{
  "phone": "+380684138254",
  "audience": "CLIENT",
  "code": "456920",
  "sent_at": "2026-10-30T19:33:50.549619398Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "adb761f8-9f56-4484-afd3-1f62a9262a74",
  "code": "456920",
  "device_ref": "sandbox-24743"
}
```

```json
{
  "session_id": "d76acc18-8ff5-4fff-af00-06dbabfdb186",
  "subject": {
    "type": "CLIENT",
    "id": "6f194909-9ace-4d50-b3b2-9bfcf6aa0c02"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZjE5NDkwOS05YWNlLTRkNTAtYjNiMi05YmZjZjZhYTBjMDIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzg5NzMwLCJpYXQiOjE3OTMzODg4MzAsImp0aSI6IjY5YzQwMGZiLWJjNDctNDIzOC04MDAxLTY5NGFjMDQ0NjNmNCIsInNpZCI6ImQ3NmFjYzE4LThmZjUtNGZmZi1hZjAwLTA2ZGJhYmZkYjE4NiJ9.F2tlu0MzuM52Ppc8O45DeFEu2H9KgdH7N_CZF42u-D4",
  "access_expires_at": "2026-10-30T19:48:50.857602763Z",
  "refresh_token": "GIXZP79injsAyacceWU1_Ms5RJCmOUlEWP2m8Hl2tog",
  "refresh_expires_at": "2026-11-29T19:33:50.857091391Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "7e8ecc86-d17d-4383-aade-7c857751ceb7",
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
  "id": "117956c7-cc66-48fa-9858-36f737382bc9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T19:38:51.150452Z",
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
  "command_id": "45b9d3b1-86c9-40cf-83dc-3a06ffa34578",
  "quote_id": "117956c7-cc66-48fa-9858-36f737382bc9",
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
  "id": "8cfad735-78f7-41a1-8f36-14b7f89beae7",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6f194909-9ace-4d50-b3b2-9bfcf6aa0c02",
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
  "created_at": "2026-10-30T19:33:51.462587Z",
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
    "id": "1c866795-da14-49f5-b9db-5aad3b1c8cd7",
    "order_id": "8cfad735-78f7-41a1-8f36-14b7f89beae7",
    "expires_at": "2026-10-30T19:34:06.46551Z",
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

`POST /api/driver/v1/offers/1c866795-da14-49f5-b9db-5aad3b1c8cd7/reject` → **204**

```json
{
  "command_id": "3f60252a-d5f6-47a7-8cae-e12139eb2952"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "2e1fb703-8d71-49fc-86c5-d2d1367662fe",
    "order_id": "8cfad735-78f7-41a1-8f36-14b7f89beae7",
    "expires_at": "2026-10-30T19:34:07.076037Z",
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

`POST /api/driver/v1/offers/2e1fb703-8d71-49fc-86c5-d2d1367662fe/accept` → **200**

```json
{
  "command_id": "c8a65a8c-597b-4f38-847d-217d6a8a2821"
}
```

```json
{
  "id": "725d33fb-d482-4481-95b4-2c7b398ceb0a",
  "order_id": "8cfad735-78f7-41a1-8f36-14b7f89beae7",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "4881525d-f528-4ad4-b9ff-eb950dc9cc0a",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/8cfad735-78f7-41a1-8f36-14b7f89beae7/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T19:33:51.46301Z",
      "actor": {
        "type": "CLIENT",
        "id": "6f194909-9ace-4d50-b3b2-9bfcf6aa0c02",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "8cfad735-78f7-41a1-8f36-14b7f89beae7",
        "quote_id": "117956c7-cc66-48fa-9858-36f737382bc9",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "6fb14940-af59-4fda-8e0b-19f4936a38e3"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T19:33:51.464815Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "8cfad735-78f7-41a1-8f36-14b7f89beae7",
        "attempt_id": "98cd437f-d53d-47b4-8328-5247dc80c2a5",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "6fb14940-af59-4fda-8e0b-19f4936a38e3"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T19:33:51.468623Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "1c866795-da14-49f5-b9db-5aad3b1c8cd7",
        "order_id": "8cfad735-78f7-41a1-8f36-14b7f89beae7",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "6fb14940-af59-4fda-8e0b-19f4936a38e3"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-30T19:33:52.0751Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "1c866795-da14-49f5-b9db-5aad3b1c8cd7",
        "order_id": "8cfad735-78f7-41a1-8f36-14b7f89beae7"
      },
      "correlation_id": "d3c00319-2f44-4f99-a311-24d449c5b1d8"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order 8cfad735-78f7-41a1-8f36-14b7f89beae7 — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/8cfad735-78f7-41a1-8f36-14b7f89beae7` → **200**

```json
{
  "id": "8cfad735-78f7-41a1-8f36-14b7f89beae7",
  "short_number": 13,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "6f194909-9ace-4d50-b3b2-9bfcf6aa0c02",
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
    "id": "725d33fb-d482-4481-95b4-2c7b398ceb0a",
    "order_id": "8cfad735-78f7-41a1-8f36-14b7f89beae7",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "4881525d-f528-4ad4-b9ff-eb950dc9cc0a",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T19:33:51.462587Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/8cfad735-78f7-41a1-8f36-14b7f89beae7/cancel` → **200**

```json
{
  "command_id": "8895c223-f588-49d5-b8c4-3c497c167f8e",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "8cfad735-78f7-41a1-8f36-14b7f89beae7",
  "short_number": 13,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "6f194909-9ace-4d50-b3b2-9bfcf6aa0c02",
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
    "id": "725d33fb-d482-4481-95b4-2c7b398ceb0a",
    "order_id": "8cfad735-78f7-41a1-8f36-14b7f89beae7",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "4881525d-f528-4ad4-b9ff-eb950dc9cc0a",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T19:33:51.462587Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "uk": "Немає вільних авто",
      "pl": "Brak wolnych aut",
      "ru": "Нет свободных машин",
      "en": "No cars available"
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
  "session_id": "8cc34ea6-95c2-42fc-955d-f023e9396c87",
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
  "last_heartbeat_at": "2026-10-30T19:33:47.581261Z",
  "last_location_at": "2026-10-30T19:33:47.581261Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8cc34ea6-95c2-42fc-955d-f023e9396c87/close` → **200**

```json
{
  "command_id": "66c8d851-017d-45c9-87a3-e14cc8ac4294",
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
  "session_id": "e0a862e6-3f0d-4e9f-838a-9a47053bfd74",
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
  "last_heartbeat_at": "2026-10-30T19:33:49.102789Z",
  "last_location_at": "2026-10-30T19:33:49.102789Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e0a862e6-3f0d-4e9f-838a-9a47053bfd74/close` → **200**

```json
{
  "command_id": "bd522d55-ddc1-4499-89fb-0bbae1be5a22",
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
  "device_ref": "sandbox-31227"
}
```

```json
{
  "challenge_id": "9ce3c82d-1f51-4934-8858-9dbd7c7b3e1c",
  "expires_at": "2026-10-30T19:38:54.866396833Z",
  "resend_available_at": "2026-10-30T19:33:55.866396833Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "934685",
  "sent_at": "2026-10-30T19:33:54.868845219Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9ce3c82d-1f51-4934-8858-9dbd7c7b3e1c",
  "code": "934685",
  "device_ref": "sandbox-31227"
}
```

```json
{
  "session_id": "08186614-dd27-4f2a-8d9b-4e66d790cfcf",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4OTczNSwiaWF0IjoxNzkzMzg4ODM1LCJqdGkiOiJmYWExOWI5Ni02NjQ5LTRhZDItOGY2MS05OTIyNzAzYjBiNzAiLCJzaWQiOiIwODE4NjYxNC1kZDI3LTRmMmEtOGQ5Yi00ZTY2ZDc5MGNmY2YifQ.2C-wQ8OSmNJK__eRVSdx1aC-dPM65rTney8BHpWxlAo",
  "access_expires_at": "2026-10-30T19:48:55.205846533Z",
  "refresh_token": "fhdQwaAmGP_JpalpXNBBdT3Amimux8YSswHFGI4zoCs",
  "refresh_expires_at": "2026-11-29T19:33:55.205271725Z",
  "account_created": false
}
```

`POST /api/driver/v1/documents/upload-sessions` → **201**

```json
{
  "command_id": "9fccf0f3-522c-492c-b2f8-e0024230a495",
  "content_type": "application/pdf",
  "size_bytes": 87
}
```

```json
{
  "file_id": "7598d808-4bdb-4328-b26b-434240ad9a30",
  "upload_path": "/api/driver/v1/uploads/7598d808-4bdb-4328-b26b-434240ad9a30",
  "expires_at": "2026-10-30T19:48:55.501763728Z",
  "max_bytes": 87
}
```

`PUT /api/driver/v1/uploads/7598d808-4bdb-4328-b26b-434240ad9a30` → **200**

```json
{
  "file_id": "7598d808-4bdb-4328-b26b-434240ad9a30",
  "state": "SAFE",
  "content_type": "application/pdf",
  "size_bytes": 87,
  "reject_reason": null
}
```

## On the server's disk the file is not the PDF

Stored at `driver_document/2026-10/7598d808-4bdb-4328-b26b-434240ad9a30`, first bytes `425a4631131a03d2` (plain: `255044462d312e37` = %PDF-1.7).

## His download is exactly what he uploaded

`GET /api/driver/v1/files/7598d808-4bdb-4328-b26b-434240ad9a30` → **200**

SHA-256 uploaded `98f4f5376cfd23cfdff10967b70c6886d62ed6ad936098e4b6afe3a66d3ae324`, downloaded `98f4f5376cfd23cfdff10967b70c6886d62ed6ad936098e4b6afe3a66d3ae324`.

Done: document 7598d808-4bdb-4328-b26b-434240ad9a30 is encrypted on disk and downloads unchanged.

# Scenario: driver-block

## Only Andrii is online; he takes an order and starts the trip

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-14664"
}
```

```json
{
  "challenge_id": "06251372-2ca8-4365-9c5c-5fde3f72d7b7",
  "expires_at": "2026-10-30T19:38:55.865439465Z",
  "resend_available_at": "2026-10-30T19:33:56.865439465Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "855877",
  "sent_at": "2026-10-30T19:33:55.867988701Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "06251372-2ca8-4365-9c5c-5fde3f72d7b7",
  "code": "855877",
  "device_ref": "sandbox-14664"
}
```

```json
{
  "session_id": "630acd62-73f2-4280-90e6-d4784edad774",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4OTczNiwiaWF0IjoxNzkzMzg4ODM2LCJqdGkiOiI3Y2M3MmNjNC0zOGE0LTQyYmItOGYyNi1mZmQ3NDE3ZjRiMGUiLCJzaWQiOiI2MzBhY2Q2Mi03M2YyLTQyODAtOTBlNi1kNDc4NGVkYWQ3NzQifQ.q5BQFiK8ruxwYJgO-LZXSbxQCNekKcMjwpMoq050sLk",
  "access_expires_at": "2026-10-30T19:48:56.191236382Z",
  "refresh_token": "I2HQqmUEJ_T8WDMgPGhz8njn05A9yV4Gw4sfvjMos4s",
  "refresh_expires_at": "2026-11-29T19:33:56.190734023Z",
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
  "device_ref": "sandbox-22342"
}
```

```json
{
  "challenge_id": "31a042cb-adae-481b-a139-899fe9856ee8",
  "expires_at": "2026-10-30T19:38:56.754295933Z",
  "resend_available_at": "2026-10-30T19:33:57.754295933Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "592586",
  "sent_at": "2026-10-30T19:33:56.756946364Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "31a042cb-adae-481b-a139-899fe9856ee8",
  "code": "592586",
  "device_ref": "sandbox-22342"
}
```

```json
{
  "session_id": "88bec76e-796d-47e8-9bb8-30473eb8084c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4OTczNywiaWF0IjoxNzkzMzg4ODM3LCJqdGkiOiJiZjkxNjExZi1jMGI5LTQ3ODMtYjA5Ny01YTkzZDFmYmI5YTQiLCJzaWQiOiI4OGJlYzc2ZS03OTZkLTQ3ZTgtOWJiOC0zMDQ3M2ViODA4NGMifQ.DahIGzesNMC1ZnnZMyaf7wYFdn3UxbFqLd_R_wyJQK4",
  "access_expires_at": "2026-10-30T19:48:57.08257722Z",
  "refresh_token": "lS-mWdwQNdb66mDdWzXsPxU-jYVXhceXliL7ROZi-8k",
  "refresh_expires_at": "2026-11-29T19:33:57.082030137Z",
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
  "session_id": "c1634334-c068-480c-ac8c-c5d82da13780",
  "subject": {
    "type": "STAFF",
    "id": "bbeb0bd1-546e-4687-8aa4-9df00ff27005"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYmViMGJkMS01NDZlLTQ2ODctOGFhNC05ZGYwMGZmMjcwMDUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODk3MzcsImlhdCI6MTc5MzM4ODgzNywianRpIjoiNzM2OGQ4YzEtM2QxOS00MGNmLWIyYjktMTBlM2UwM2JiYzYzIiwic2lkIjoiYzE2MzQzMzQtYzA2OC00ODBjLWFjOGMtYzVkODJkYTEzNzgwIn0.7CIu1G4BzZ1IytaSSTFzEsX5onxCVWIMVOyXjOyJ598",
  "access_expires_at": "2026-10-30T19:48:57.951197957Z",
  "refresh_token": "SQLa0E_5i1updADFkg5mT_ZQIIBfmko5nbsMjMJ3NrQ",
  "refresh_expires_at": "2026-10-31T07:33:57.950564574Z",
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
  "session_id": "503b6ac8-3cd3-4af1-972e-01e381e57180",
  "subject": {
    "type": "STAFF",
    "id": "bbeb0bd1-546e-4687-8aa4-9df00ff27005"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYmViMGJkMS01NDZlLTQ2ODctOGFhNC05ZGYwMGZmMjcwMDUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODk3MzgsImlhdCI6MTc5MzM4ODgzOCwianRpIjoiYmFhY2QxZDAtMTc4Zi00MmRiLWFjMzEtMThhNWE1M2IyYTAyIiwic2lkIjoiNTAzYjZhYzgtM2NkMy00YWYxLTk3MmUtMDFlMzgxZTU3MTgwIn0.jquVqsPv5zec8XeTv55iTcRg7UnMWdMnN_7JC7gPTqQ",
  "access_expires_at": "2026-10-30T19:48:58.535710959Z",
  "refresh_token": "KxZN95PPwXoPgtXkVK0IHDQ0ILCmni8_oGZzXcOfTGQ",
  "refresh_expires_at": "2026-10-31T07:33:58.535088195Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-13399"
}
```

```json
{
  "challenge_id": "b6f9ede6-ed8e-4d1e-a5fa-58b71c1ee907",
  "expires_at": "2026-10-30T19:38:58.820588002Z",
  "resend_available_at": "2026-10-30T19:33:59.820588002Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "481244",
  "sent_at": "2026-10-30T19:33:58.823636625Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b6f9ede6-ed8e-4d1e-a5fa-58b71c1ee907",
  "code": "481244",
  "device_ref": "sandbox-13399"
}
```

```json
{
  "session_id": "10123e52-cc9c-42db-9f80-ac9448268dba",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4OTczOSwiaWF0IjoxNzkzMzg4ODM5LCJqdGkiOiJhMTE3OWE5OC1iZjYzLTQ2ZjQtODE2NS1mNGYxMTlkOGIxNWIiLCJzaWQiOiIxMDEyM2U1Mi1jYzljLTQyZGItOWY4MC1hYzk0NDgyNjhkYmEifQ.UfrMfx-9T5xnK-3FOWy8jZRqpvuSVtRPxPMaAY7j6uk",
  "access_expires_at": "2026-10-30T19:48:59.164421226Z",
  "refresh_token": "caeJ1hfY1lqd62Uq4zQ_-S0O0j8UhBlcVNO0loT0rkg",
  "refresh_expires_at": "2026-11-29T19:33:59.163896676Z",
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

(the car drives 63 s to the next point)

`POST /api/driver/v1/work-sessions` → **201**

```json
{
  "command_id": "b008bbc7-a06d-4618-b775-bda18d069a76",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4528,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:35:02Z",
    "sequence": 1793388902761
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "e1cfbe82-6f0a-4e83-88e5-2f8a894ce2bb",
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
  "last_heartbeat_at": "2026-10-30T19:35:02.780874Z",
  "last_location_at": "2026-10-30T19:35:02.780874Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380688480857",
  "device_ref": "sandbox-46"
}
```

```json
{
  "challenge_id": "cf616891-8c42-4e1d-8c68-3aadb0961fea",
  "expires_at": "2026-10-30T19:40:03.073163888Z",
  "resend_available_at": "2026-10-30T19:35:04.073163888Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380688480857` → **200**

```json
{
  "phone": "+380688480857",
  "audience": "CLIENT",
  "code": "233018",
  "sent_at": "2026-10-30T19:35:03.076709847Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cf616891-8c42-4e1d-8c68-3aadb0961fea",
  "code": "233018",
  "device_ref": "sandbox-46"
}
```

```json
{
  "session_id": "99b3b392-902a-4f6c-9e08-62623b116de1",
  "subject": {
    "type": "CLIENT",
    "id": "dc6a2d88-bcce-4e2a-89ca-7e0a38c309ae"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYzZhMmQ4OC1iY2NlLTRlMmEtODljYS03ZTBhMzhjMzA5YWUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzg5ODAzLCJpYXQiOjE3OTMzODg5MDMsImp0aSI6ImJmOTJhNjFiLWI5ZDgtNGFkYS1iZTM2LWQ4OTEwYjkwYjk0MyIsInNpZCI6Ijk5YjNiMzkyLTkwMmEtNGY2Yy05ZTA4LTYyNjIzYjExNmRlMSJ9.Q9SkHRcPJRNoRo9Rj3AVWqndGl11oUZJeY5UqDKRxXI",
  "access_expires_at": "2026-10-30T19:50:03.394349098Z",
  "refresh_token": "ajmjAFdTIupaEd4_ruWkb8owtUhA3zUyCmb8rictDlI",
  "refresh_expires_at": "2026-11-29T19:35:03.393584365Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "eb5ce759-b09f-4e8a-bcb3-c74d2f9f4190",
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
  "id": "e31414ba-48ad-4b85-8cb9-bf1dd2b48495",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T19:40:03.687145Z",
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
  "command_id": "c71dcabb-3963-47e9-ade0-dcc62c633a12",
  "quote_id": "e31414ba-48ad-4b85-8cb9-bf1dd2b48495",
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
  "id": "8dfdbd71-94a7-4bb5-ad84-87e41236869e",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "dc6a2d88-bcce-4e2a-89ca-7e0a38c309ae",
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
  "created_at": "2026-10-30T19:35:04.019045Z",
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
    "id": "885d803f-c5fe-43aa-95ba-c30a21d82c6a",
    "order_id": "8dfdbd71-94a7-4bb5-ad84-87e41236869e",
    "expires_at": "2026-10-30T19:35:19.022335Z",
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

`POST /api/driver/v1/offers/885d803f-c5fe-43aa-95ba-c30a21d82c6a/accept` → **200**

```json
{
  "command_id": "4bbc49ff-a812-4fb4-b05f-46210fca5a84"
}
```

```json
{
  "id": "28dd241b-a56e-4e62-bb33-1391a593fb8d",
  "order_id": "8dfdbd71-94a7-4bb5-ad84-87e41236869e",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f8731188-b49e-4acb-bd2c-bfa0a6fb1a99",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f8731188-b49e-4acb-bd2c-bfa0a6fb1a99",
  "order_id": "8dfdbd71-94a7-4bb5-ad84-87e41236869e",
  "assignment_id": "28dd241b-a56e-4e62-bb33-1391a593fb8d",
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

(the car drives 3 s to the next point)

`POST /api/driver/v1/work-sessions/e1cfbe82-6f0a-4e83-88e5-2f8a894ce2bb/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:35:08Z",
    "sequence": 1793388908248
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "e1cfbe82-6f0a-4e83-88e5-2f8a894ce2bb",
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
  "last_heartbeat_at": "2026-10-30T19:35:08.268318Z",
  "last_location_at": "2026-10-30T19:35:08.268318Z",
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
  "id": "f8731188-b49e-4acb-bd2c-bfa0a6fb1a99",
  "order_id": "8dfdbd71-94a7-4bb5-ad84-87e41236869e",
  "assignment_id": "28dd241b-a56e-4e62-bb33-1391a593fb8d",
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

`POST /api/driver/v1/trips/f8731188-b49e-4acb-bd2c-bfa0a6fb1a99/arrive` → **200**

```json
{
  "command_id": "d9e691da-3393-48b8-8699-39db20792d9e",
  "expected_version": 0
}
```

```json
{
  "id": "f8731188-b49e-4acb-bd2c-bfa0a6fb1a99",
  "order_id": "8dfdbd71-94a7-4bb5-ad84-87e41236869e",
  "assignment_id": "28dd241b-a56e-4e62-bb33-1391a593fb8d",
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
  "arrived_at": "2026-10-30T19:35:08.849168Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/f8731188-b49e-4acb-bd2c-bfa0a6fb1a99/start` → **200**

```json
{
  "command_id": "0efe5c3f-1d73-4649-ab3a-4b4644256d7c",
  "expected_version": 1
}
```

```json
{
  "id": "f8731188-b49e-4acb-bd2c-bfa0a6fb1a99",
  "order_id": "8dfdbd71-94a7-4bb5-ad84-87e41236869e",
  "assignment_id": "28dd241b-a56e-4e62-bb33-1391a593fb8d",
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
  "arrived_at": "2026-10-30T19:35:08.849168Z",
  "started_at": "2026-10-30T19:35:09.15161Z",
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
  "command_id": "3e68f5ff-001d-42ab-8df8-9d13f189d73c",
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
  "session_id": "e1cfbe82-6f0a-4e83-88e5-2f8a894ce2bb",
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
  "last_heartbeat_at": "2026-10-30T19:35:08.268318Z",
  "last_location_at": "2026-10-30T19:35:08.268318Z",
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
  "id": "f8731188-b49e-4acb-bd2c-bfa0a6fb1a99",
  "order_id": "8dfdbd71-94a7-4bb5-ad84-87e41236869e",
  "assignment_id": "28dd241b-a56e-4e62-bb33-1391a593fb8d",
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
  "arrived_at": "2026-10-30T19:35:08.849168Z",
  "started_at": "2026-10-30T19:35:09.15161Z",
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
  "command_id": "2b6457b3-1031-49af-8d97-ffaa1d0552e1",
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
  "correlation_id": "624ae06f-364d-4c37-8455-6b004b7eede0"
}
```

## He completes the trip and writes to support

(the car drives 46 s to the next point)

`POST /api/driver/v1/work-sessions/e1cfbe82-6f0a-4e83-88e5-2f8a894ce2bb/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:35:57Z",
    "sequence": 1793388957294
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "e1cfbe82-6f0a-4e83-88e5-2f8a894ce2bb",
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
  "last_heartbeat_at": "2026-10-30T19:35:57.313757Z",
  "last_location_at": "2026-10-30T19:35:57.313757Z",
  "eligible": false,
  "ineligible_reasons": [
    "ACCOUNT_BLOCKED",
    "INTENT_PAUSE_AFTER_CURRENT",
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/f8731188-b49e-4acb-bd2c-bfa0a6fb1a99/complete` → **200**

```json
{
  "command_id": "a44e160c-0e2a-48ff-af77-a0355430c204",
  "expected_version": 2,
  "reported_at": "2026-10-30T19:35:57Z",
  "cash_received": true
}
```

```json
{
  "id": "f8731188-b49e-4acb-bd2c-bfa0a6fb1a99",
  "order_id": "8dfdbd71-94a7-4bb5-ad84-87e41236869e",
  "assignment_id": "28dd241b-a56e-4e62-bb33-1391a593fb8d",
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
  "arrived_at": "2026-10-30T19:35:08.849168Z",
  "started_at": "2026-10-30T19:35:09.15161Z",
  "completed_at": "2026-10-30T19:35:57.616875Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/support/cases` → **201**

```json
{
  "command_id": "51ebfaf1-0ba7-4683-b411-0372ecf4d6e0",
  "category": "OTHER",
  "subject": "Why is my account blocked?",
  "message": "Please explain."
}
```

```json
{
  "id": "672fec6a-e373-41c4-ba82-752d32081d88",
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
  "created_at": "2026-10-30T19:35:57.931883Z",
  "updated_at": "2026-10-30T19:35:57.931883Z",
  "respond_by": "2026-10-30T23:35:57.931883Z",
  "messages": [
    {
      "id": "dd4a3543-3eb8-4d4a-b96e-9e7ae1dd3150",
      "sequence": 1,
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000403",
      "visibility": "PUBLIC",
      "body": "Please explain.",
      "created_at": "2026-10-30T19:35:57.933139Z",
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
      "id": "f8731188-b49e-4acb-bd2c-bfa0a6fb1a99",
      "order_id": "8dfdbd71-94a7-4bb5-ad84-87e41236869e",
      "order_short_number": 14,
      "created_at": "2026-10-30T19:35:04.646986Z",
      "pickup_label": "Майдан",
      "dropoff_label": "Вокзал",
      "final_price_minor": 10517,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "COMPLETED"
    },
    {
      "id": "ee3925a5-bbcf-42ea-b3cf-504f9923d741",
      "order_id": "349453f9-da73-4d9a-8b9b-2b289fe26523",
      "order_short_number": 11,
      "created_at": "2026-10-30T19:31:24.896219Z",
      "pickup_label": "вул. Дмитрівська",
      "dropoff_label": "Нивки",
      "final_price_minor": 16297,
      "currency": "UAH",
      "payment_method": "CARD",
      "phase": "COMPLETED"
    },
    {
      "id": "d65a3c3e-8bd8-4018-b8ed-a99605148bae",
      "order_id": "632bbd4b-0390-478b-8417-e95061c9666b",
      "order_short_number": 9,
      "created_at": "2026-10-30T19:31:00.451607Z",
      "pickup_label": "вул. Дмитрівська",
      "dropoff_label": "Нивки",
      "final_price_minor": 16297,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "COMPLETED"
    },
    {
      "id": "b9b69d9b-53b3-4921-9672-adc0a4654b2f",
      "order_id": "3df26597-b6b7-46b0-b89c-c6f2690a92e5",
      "order_short_number": 8,
      "created_at": "2026-10-30T19:30:41.941027Z",
      "pickup_label": "вул. Дмитрівська",
      "dropoff_label": "Нивки",
      "final_price_minor": 16297,
      "currency": "UAH",
      "payment_method": "CARD",
      "phase": "COMPLETED"
    },
    {
      "id": "e693a562-43ec-4fb8-8bef-9fbbf1b0001f",
      "order_id": "40784ecd-9f2c-4e59-87cd-0c7d00f6095c",
      "order_short_number": 7,
      "created_at": "2026-10-30T19:29:53.778155Z",
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
  "session_id": "e1cfbe82-6f0a-4e83-88e5-2f8a894ce2bb",
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
  "last_heartbeat_at": "2026-10-30T19:35:57.313757Z",
  "last_location_at": "2026-10-30T19:35:57.313757Z",
  "eligible": false,
  "ineligible_reasons": [
    "ACCOUNT_BLOCKED",
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/work-sessions/e1cfbe82-6f0a-4e83-88e5-2f8a894ce2bb/resume` → **403**

```json
{
  "command_id": "a57b08fd-884c-4276-a270-067e007271ef",
  "expected_version": 2
}
```

```json
{
  "instance": "/api/driver/v1/work-sessions/e1cfbe82-6f0a-4e83-88e5-2f8a894ce2bb/resume",
  "status": 403,
  "title": "Account blocked",
  "type": "https://errors.blizz.taxi/account-blocked",
  "code": "ACCOUNT_BLOCKED",
  "correlation_id": "e89d4ae1-119e-4bbc-b31b-e31b5c5ada0e"
}
```

(the car drives 46 s to the next point)

`POST /api/driver/v1/work-sessions/e1cfbe82-6f0a-4e83-88e5-2f8a894ce2bb/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4528,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:36:48Z",
    "sequence": 1793389008155
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "e1cfbe82-6f0a-4e83-88e5-2f8a894ce2bb",
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
  "last_heartbeat_at": "2026-10-30T19:36:48.174721Z",
  "last_location_at": "2026-10-30T19:36:48.174721Z",
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
  "command_id": "461cafee-f9d9-4beb-b7e3-bce647def804",
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
  "id": "b00536cc-5b6b-4238-96dd-aa7937b713f9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T19:41:48.473745Z",
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
  "command_id": "8ef283db-cadc-4444-a71d-184447cacf15",
  "quote_id": "b00536cc-5b6b-4238-96dd-aa7937b713f9",
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
  "id": "c4c821e7-924a-46cf-9360-1ca157222550",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "dc6a2d88-bcce-4e2a-89ca-7e0a38c309ae",
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
  "created_at": "2026-10-30T19:36:48.778426Z",
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

Done: blocked on trip f8731188-b49e-4acb-bd2c-bfa0a6fb1a99, Andrii completed it and reached support; new work answered ACCOUNT_BLOCKED.

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
  "command_id": "f7455f69-9542-439d-a636-81513cc810fc",
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

`GET /api/operator/v1/orders/8dfdbd71-94a7-4bb5-ad84-87e41236869e` → **200**

```json
{
  "id": "8dfdbd71-94a7-4bb5-ad84-87e41236869e",
  "short_number": 14,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "dc6a2d88-bcce-4e2a-89ca-7e0a38c309ae",
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
    "id": "28dd241b-a56e-4e62-bb33-1391a593fb8d",
    "order_id": "8dfdbd71-94a7-4bb5-ad84-87e41236869e",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "f8731188-b49e-4acb-bd2c-bfa0a6fb1a99",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T19:35:04.019045Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/c4c821e7-924a-46cf-9360-1ca157222550` → **200**

```json
{
  "id": "c4c821e7-924a-46cf-9360-1ca157222550",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "dc6a2d88-bcce-4e2a-89ca-7e0a38c309ae",
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
  "created_at": "2026-10-30T19:36:48.778426Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/c4c821e7-924a-46cf-9360-1ca157222550/cancel` → **200**

```json
{
  "command_id": "8f392a05-96f4-48c8-88a8-6d690ec2ae5a",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "c4c821e7-924a-46cf-9360-1ca157222550",
  "short_number": 15,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "dc6a2d88-bcce-4e2a-89ca-7e0a38c309ae",
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
  "created_at": "2026-10-30T19:36:48.778426Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "uk": "Немає вільних авто",
      "pl": "Brak wolnych aut",
      "ru": "Нет свободных машин",
      "en": "No cars available"
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
  "session_id": "e1cfbe82-6f0a-4e83-88e5-2f8a894ce2bb",
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
  "last_heartbeat_at": "2026-10-30T19:36:48.174721Z",
  "last_location_at": "2026-10-30T19:36:48.174721Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/work-sessions/e1cfbe82-6f0a-4e83-88e5-2f8a894ce2bb/close` → **200**

```json
{
  "command_id": "216cdbe9-b2f4-40d6-91f4-dfa88e33605e",
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
  "device_ref": "sandbox-5965"
}
```

```json
{
  "challenge_id": "91f871ad-79fe-4f5e-b293-d9a17a66a2ed",
  "expires_at": "2026-10-30T19:41:51.540231176Z",
  "resend_available_at": "2026-10-30T19:36:52.540231176Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "457966",
  "sent_at": "2026-10-30T19:36:51.54272687Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "91f871ad-79fe-4f5e-b293-d9a17a66a2ed",
  "code": "457966",
  "device_ref": "sandbox-5965"
}
```

```json
{
  "session_id": "223a2763-10ad-4d97-be79-0d37bbc7fb00",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4OTkxMSwiaWF0IjoxNzkzMzg5MDExLCJqdGkiOiJjZTE4YTBkZS04NDVmLTRjMTEtODU2OC01M2ViZmU5MDYwZDEiLCJzaWQiOiIyMjNhMjc2My0xMGFkLTRkOTctYmU3OS0wZDM3YmJjN2ZiMDAifQ.1bf0jsNINowBoeOGTjC_gKD8XND8CQ64hFu0S7QnXTE",
  "access_expires_at": "2026-10-30T19:51:51.860966258Z",
  "refresh_token": "AHstnMOXh0dPmcgzYLl9GEsCE8AjMLNVBijcJxQO2jY",
  "refresh_expires_at": "2026-11-29T19:36:51.860160793Z",
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
  "device_ref": "sandbox-16116"
}
```

```json
{
  "challenge_id": "6a95d8bc-64c8-4a76-b5d6-52134430effb",
  "expires_at": "2026-10-30T19:41:52.432755333Z",
  "resend_available_at": "2026-10-30T19:36:53.432755333Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "424587",
  "sent_at": "2026-10-30T19:36:52.435578669Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6a95d8bc-64c8-4a76-b5d6-52134430effb",
  "code": "424587",
  "device_ref": "sandbox-16116"
}
```

```json
{
  "session_id": "b3cb2f7c-d85a-407b-9ee9-1065de2add0d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4OTkxMiwiaWF0IjoxNzkzMzg5MDEyLCJqdGkiOiJiNDNlY2JiNi1hYTQ4LTRkMTktODlmZC1jMTBjMDk2MzRmODAiLCJzaWQiOiJiM2NiMmY3Yy1kODVhLTQwN2ItOWVlOS0xMDY1ZGUyYWRkMGQifQ.FABjs7RIiqSsrvhDb9QgkgB5CqR52Xhsq2BCvtuFB60",
  "access_expires_at": "2026-10-30T19:51:52.753864409Z",
  "refresh_token": "yi7rc0FCCoYF0oAbQmGFzghAAfNjts3thsqSXnN4PY4",
  "refresh_expires_at": "2026-11-29T19:36:52.753252015Z",
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
  "command_id": "3ecb88ed-96d2-4fe4-9f9b-ed5f234f4b19",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:36:53Z",
    "sequence": 1793389013358
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e49eb3dd-da46-4a8b-b405-a5ecc1ec792a",
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
  "last_heartbeat_at": "2026-10-30T19:36:53.377369Z",
  "last_location_at": "2026-10-30T19:36:53.377369Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-29269"
}
```

```json
{
  "challenge_id": "b3a75aec-8f07-4e50-bf3d-5b2e4e2fc96e",
  "expires_at": "2026-10-30T19:41:53.670003748Z",
  "resend_available_at": "2026-10-30T19:36:54.670003748Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "009865",
  "sent_at": "2026-10-30T19:36:53.672697713Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b3a75aec-8f07-4e50-bf3d-5b2e4e2fc96e",
  "code": "009865",
  "device_ref": "sandbox-29269"
}
```

```json
{
  "session_id": "c9834da9-67f5-4975-9ad0-89cabe6de3b2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4OTkxMywiaWF0IjoxNzkzMzg5MDEzLCJqdGkiOiI2ZWQ4YWQ5Mi0zYWNjLTRiZjAtYTc1Ni00OGFlYTc1MGI5ODUiLCJzaWQiOiJjOTgzNGRhOS02N2Y1LTQ5NzUtOWFkMC04OWNhYmU2ZGUzYjIifQ.frcg58ZafziBmLTFMvc-E6PCaJ5ffrmlIE1pfVE_WLM",
  "access_expires_at": "2026-10-30T19:51:53.989106646Z",
  "refresh_token": "d3PXqaBtLjaQAKs6WyX7Ajyy5iZeyqQaTuBTEMS_E2Q",
  "refresh_expires_at": "2026-11-29T19:36:53.98830072Z",
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
  "command_id": "a063650a-5b34-40de-b87e-684e29b1a8b5",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:36:54Z",
    "sequence": 1793389014578
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "ed4ede56-7284-45b5-b9d3-4a17e1cdfaac",
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
  "last_heartbeat_at": "2026-10-30T19:36:54.596909Z",
  "last_location_at": "2026-10-30T19:36:54.596909Z",
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
  "session_id": "ff520847-8f9e-4f61-ab49-2a5e0412f7c2",
  "subject": {
    "type": "STAFF",
    "id": "bbeb0bd1-546e-4687-8aa4-9df00ff27005"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYmViMGJkMS01NDZlLTQ2ODctOGFhNC05ZGYwMGZmMjcwMDUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODk5MTUsImlhdCI6MTc5MzM4OTAxNSwianRpIjoiMTNlZTQ2ZWUtYTA0YS00Mjc3LWE3MDItODBmNzIzNDdhMDIzIiwic2lkIjoiZmY1MjA4NDctOGY5ZS00ZjYxLWFiNDktMmE1ZTA0MTJmN2MyIn0.A6woGSrXageVqKAQdZg528HZJ5rTiqauu7OEAtIefu8",
  "access_expires_at": "2026-10-30T19:51:55.188536576Z",
  "refresh_token": "NHg4pG8XYo_rtKxVkMfpK646VOzFUNg_4JZbbINkCwE",
  "refresh_expires_at": "2026-10-31T07:36:55.187953296Z",
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
  "session_id": "2da9fe97-cba6-460f-8eab-53f9b81fbc28",
  "subject": {
    "type": "STAFF",
    "id": "bbeb0bd1-546e-4687-8aa4-9df00ff27005"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYmViMGJkMS01NDZlLTQ2ODctOGFhNC05ZGYwMGZmMjcwMDUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODk5MTUsImlhdCI6MTc5MzM4OTAxNSwianRpIjoiYmZiZWZjM2QtZmFlOC00ZDJlLWJkMTMtMTNkYTRlOTc5YmRjIiwic2lkIjoiMmRhOWZlOTctY2JhNi00NjBmLThlYWItNTNmOWI4MWZiYzI4In0.AvrmcBh88rTT6FwclP-9IdH-Yb3yASnUiQIHoLIT5_g",
  "access_expires_at": "2026-10-30T19:51:55.767181549Z",
  "refresh_token": "VoUcwPwZXAt3i8XWHQWNisGjTqIlABZh-EcqMmBZ1DY",
  "refresh_expires_at": "2026-10-31T07:36:55.766616289Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380683965166",
  "device_ref": "sandbox-1733"
}
```

```json
{
  "challenge_id": "6f50e8cc-a804-4c1f-ae99-a00a2f091600",
  "expires_at": "2026-10-30T19:41:56.057303697Z",
  "resend_available_at": "2026-10-30T19:36:57.057303697Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380683965166` → **200**

```json
{
  "phone": "+380683965166",
  "audience": "CLIENT",
  "code": "845952",
  "sent_at": "2026-10-30T19:36:56.060062308Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6f50e8cc-a804-4c1f-ae99-a00a2f091600",
  "code": "845952",
  "device_ref": "sandbox-1733"
}
```

```json
{
  "session_id": "eed2b996-8e96-43a0-8021-f33be4e66608",
  "subject": {
    "type": "CLIENT",
    "id": "50201229-d205-4aea-af79-90407b9e6f62"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MDIwMTIyOS1kMjA1LTRhZWEtYWY3OS05MDQwN2I5ZTZmNjIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzg5OTE2LCJpYXQiOjE3OTMzODkwMTYsImp0aSI6ImRjNWE3MzJkLTk5ZGQtNDRkMy04ZWU3LTFlZWJjN2JjNTgzYiIsInNpZCI6ImVlZDJiOTk2LThlOTYtNDNhMC04MDIxLWYzM2JlNGU2NjYwOCJ9.2AKB416iD9hjOkk5_YWU9Z8xtZJsa3XUUFm6P7rZ7q8",
  "access_expires_at": "2026-10-30T19:51:56.379757088Z",
  "refresh_token": "vikvjW85Uj9DVTSSxJRsH6UqtIO0dIKbTqnzW8WC_PI",
  "refresh_expires_at": "2026-11-29T19:36:56.379154261Z",
  "account_created": true
}
```

## E2: Near has the offer and pauses: the offer is revoked and Far gets the order at once

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "04f72598-f18d-4b17-8dce-3eb2f5ba897d",
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
  "id": "ebf8dd3a-7c5b-470a-849c-3334cbc8d71d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T19:41:56.678165Z",
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
  "command_id": "8417313a-f6f5-4eea-b82d-707990b44db0",
  "quote_id": "ebf8dd3a-7c5b-470a-849c-3334cbc8d71d",
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
  "id": "7f5a694e-fc71-4d1e-a28b-166a8db868d3",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "50201229-d205-4aea-af79-90407b9e6f62",
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
  "created_at": "2026-10-30T19:36:56.982764Z",
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
    "id": "02004102-b815-4a35-915e-cd3ee285793e",
    "order_id": "7f5a694e-fc71-4d1e-a28b-166a8db868d3",
    "expires_at": "2026-10-30T19:37:11.986265Z",
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
  "session_id": "e49eb3dd-da46-4a8b-b405-a5ecc1ec792a",
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
  "last_heartbeat_at": "2026-10-30T19:36:53.377369Z",
  "last_location_at": "2026-10-30T19:36:53.377369Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

`POST /api/driver/v1/work-sessions/e49eb3dd-da46-4a8b-b405-a5ecc1ec792a/pause` → **200**

```json
{
  "command_id": "c2ac4499-063e-44ac-a694-7d79f8e70af9",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e49eb3dd-da46-4a8b-b405-a5ecc1ec792a",
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
  "last_heartbeat_at": "2026-10-30T19:36:53.377369Z",
  "last_location_at": "2026-10-30T19:36:53.377369Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/offers/02004102-b815-4a35-915e-cd3ee285793e/accept` → **409**

```json
{
  "command_id": "093ccfc0-fc36-4951-914e-7f82a08ff96e"
}
```

```json
{
  "instance": "/api/driver/v1/offers/02004102-b815-4a35-915e-cd3ee285793e/accept",
  "status": 409,
  "title": "Offer revoked",
  "type": "https://errors.blizz.taxi/offer-revoked",
  "code": "OFFER_REVOKED",
  "correlation_id": "39303362-6e86-481e-98bf-0217dd304d23"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "57385bec-5dbf-4acd-b298-9fbe445eb9d7",
    "order_id": "7f5a694e-fc71-4d1e-a28b-166a8db868d3",
    "expires_at": "2026-10-30T19:37:12.885104Z",
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

`POST /api/driver/v1/offers/57385bec-5dbf-4acd-b298-9fbe445eb9d7/reject` → **204**

```json
{
  "command_id": "c02a02a3-b7f9-4ad7-b29a-d62ad9df3d29"
}
```

`GET /api/operator/v1/orders/7f5a694e-fc71-4d1e-a28b-166a8db868d3/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T19:36:56.983338Z",
      "actor": {
        "type": "CLIENT",
        "id": "50201229-d205-4aea-af79-90407b9e6f62",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "7f5a694e-fc71-4d1e-a28b-166a8db868d3",
        "quote_id": "ebf8dd3a-7c5b-470a-849c-3334cbc8d71d",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "338a33be-a7bd-49e9-9673-3a323679623f"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T19:36:56.985537Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "7f5a694e-fc71-4d1e-a28b-166a8db868d3",
        "attempt_id": "6f9ff162-5c6d-4cc8-aaa2-64b911702534",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "338a33be-a7bd-49e9-9673-3a323679623f"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T19:36:56.99024Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "02004102-b815-4a35-915e-cd3ee285793e",
        "order_id": "7f5a694e-fc71-4d1e-a28b-166a8db868d3",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "338a33be-a7bd-49e9-9673-3a323679623f"
    },
    {
      "sequence": 3,
      "type": "OfferRevoked",
      "occurred_at": "2026-10-30T19:36:57.884247Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": "DRIVER_PAUSED",
      "details": {
        "reason": "DRIVER_PAUSED",
        "offer_id": "02004102-b815-4a35-915e-cd3ee285793e",
        "order_id": "7f5a694e-fc71-4d1e-a28b-166a8db868d3",
        "driver_id": "5a000000-0000-4000-8000-000000000401"
      },
      "correlation_id": "062113ef-2af6-454a-bddb-6e946b0c5d1f"
    },
```

`GET /api/operator/v1/orders/7f5a694e-fc71-4d1e-a28b-166a8db868d3` → **200**

```json
{
  "id": "7f5a694e-fc71-4d1e-a28b-166a8db868d3",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "50201229-d205-4aea-af79-90407b9e6f62",
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
  "created_at": "2026-10-30T19:36:56.982764Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/7f5a694e-fc71-4d1e-a28b-166a8db868d3/cancel` → **200**

```json
{
  "command_id": "18712941-6657-4609-a0e5-4a309b855b8c",
  "expected_version": 6,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "7f5a694e-fc71-4d1e-a28b-166a8db868d3",
  "short_number": 16,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 7,
  "channel": "APP",
  "payer_client_id": "50201229-d205-4aea-af79-90407b9e6f62",
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
  "created_at": "2026-10-30T19:36:56.982764Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "uk": "Немає вільних авто",
      "pl": "Brak wolnych aut",
      "ru": "Нет свободных машин",
      "en": "No cars available"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

E2: offer 02004102-b815-4a35-915e-cd3ee285793e revoked by the pause, the late accept got OFFER_REVOKED, Far had the order next.

## E5: pause and accept sent at the same moment, five rounds; Far is offline so each order goes to Near

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "ed4ede56-7284-45b5-b9d3-4a17e1cdfaac",
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
  "last_heartbeat_at": "2026-10-30T19:36:54.596909Z",
  "last_location_at": "2026-10-30T19:36:54.596909Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ed4ede56-7284-45b5-b9d3-4a17e1cdfaac/close` → **200**

```json
{
  "command_id": "6f5ff1f2-39bf-45b8-afbd-5ac401b06f36",
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
  "session_id": "e49eb3dd-da46-4a8b-b405-a5ecc1ec792a",
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
  "last_heartbeat_at": "2026-10-30T19:36:53.377369Z",
  "last_location_at": "2026-10-30T19:36:53.377369Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/work-sessions/e49eb3dd-da46-4a8b-b405-a5ecc1ec792a/resume` → **200**

```json
{
  "command_id": "f240e042-6cd4-4830-aae4-11d7fb992052",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e49eb3dd-da46-4a8b-b405-a5ecc1ec792a",
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
  "last_heartbeat_at": "2026-10-30T19:36:53.377369Z",
  "last_location_at": "2026-10-30T19:36:53.377369Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e49eb3dd-da46-4a8b-b405-a5ecc1ec792a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:37:00Z",
    "sequence": 1793389020971
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e49eb3dd-da46-4a8b-b405-a5ecc1ec792a",
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
  "last_heartbeat_at": "2026-10-30T19:37:00.989552Z",
  "last_location_at": "2026-10-30T19:37:00.989552Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "47b18d3f-0b40-4d1f-8b9d-2305bd459fdd",
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
  "id": "5045fec9-dcfc-4381-93ac-3a7132c5f85c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T19:42:01.295877Z",
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
  "command_id": "2938f3d8-d210-4c88-b20e-07d4e809e0ec",
  "quote_id": "5045fec9-dcfc-4381-93ac-3a7132c5f85c",
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
  "id": "37f82676-b64a-4b4e-ad72-99c219a5de77",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "50201229-d205-4aea-af79-90407b9e6f62",
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
  "created_at": "2026-10-30T19:37:01.611412Z",
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
    "id": "5f8b80c9-c1bb-4b9e-9836-27dc85542cc0",
    "order_id": "37f82676-b64a-4b4e-ad72-99c219a5de77",
    "expires_at": "2026-10-30T19:37:16.614156Z",
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
  "session_id": "e49eb3dd-da46-4a8b-b405-a5ecc1ec792a",
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
  "last_heartbeat_at": "2026-10-30T19:37:00.989552Z",
  "last_location_at": "2026-10-30T19:37:00.989552Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

Round 1, at the same moment:

`POST /api/driver/v1/offers/5f8b80c9-c1bb-4b9e-9836-27dc85542cc0/accept` → **409**

```json
{
  "instance": "/api/driver/v1/offers/5f8b80c9-c1bb-4b9e-9836-27dc85542cc0/accept",
  "status": 409,
  "title": "Offer revoked",
  "type": "https://errors.blizz.taxi/offer-revoked",
  "code": "OFFER_REVOKED",
  "correlation_id": "76bf3e34-ab39-45e0-8d56-83ea52e33465"
}
```

`POST /api/driver/v1/work-sessions/e49eb3dd-da46-4a8b-b405-a5ecc1ec792a/pause` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e49eb3dd-da46-4a8b-b405-a5ecc1ec792a",
  "session_version": 3,
  "session_state": "OPEN",
  "intent": "NOT_ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T19:37:00.989552Z",
  "last_location_at": "2026-10-30T19:37:00.989552Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

Round 1: the pause won; the accept got OFFER_REVOKED.

`GET /api/operator/v1/orders/37f82676-b64a-4b4e-ad72-99c219a5de77` → **200**

```json
{
  "id": "37f82676-b64a-4b4e-ad72-99c219a5de77",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "50201229-d205-4aea-af79-90407b9e6f62",
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
  "created_at": "2026-10-30T19:37:01.611412Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/37f82676-b64a-4b4e-ad72-99c219a5de77` → **200**

```json
{
  "id": "37f82676-b64a-4b4e-ad72-99c219a5de77",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "50201229-d205-4aea-af79-90407b9e6f62",
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
  "created_at": "2026-10-30T19:37:01.611412Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/37f82676-b64a-4b4e-ad72-99c219a5de77/cancel` → **200**

```json
{
  "command_id": "6e18e1dd-366d-46bf-8e44-beba301c199c",
  "expected_version": 4,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "37f82676-b64a-4b4e-ad72-99c219a5de77",
  "short_number": 17,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "50201229-d205-4aea-af79-90407b9e6f62",
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
  "created_at": "2026-10-30T19:37:01.611412Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "uk": "Немає вільних авто",
      "pl": "Brak wolnych aut",
      "ru": "Нет свободных машин",
      "en": "No cars available"
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
  "session_id": "e49eb3dd-da46-4a8b-b405-a5ecc1ec792a",
  "session_version": 3,
  "session_state": "OPEN",
  "intent": "NOT_ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T19:37:00.989552Z",
  "last_location_at": "2026-10-30T19:37:00.989552Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/work-sessions/e49eb3dd-da46-4a8b-b405-a5ecc1ec792a/resume` → **200**

```json
{
  "command_id": "2cd41622-3264-4282-bb84-d13247e9ff33",
  "expected_version": 3
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e49eb3dd-da46-4a8b-b405-a5ecc1ec792a",
  "session_version": 4,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T19:37:00.989552Z",
  "last_location_at": "2026-10-30T19:37:00.989552Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e49eb3dd-da46-4a8b-b405-a5ecc1ec792a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:37:04Z",
    "sequence": 1793389024169
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e49eb3dd-da46-4a8b-b405-a5ecc1ec792a",
  "session_version": 4,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T19:37:04.189742Z",
  "last_location_at": "2026-10-30T19:37:04.189742Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a1eae724-a23c-44c0-911e-91252a6a2bf6",
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
  "id": "25eb2c36-e7ac-4b2f-b37c-8c5eb27502a7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T19:42:04.504197Z",
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
  "command_id": "3f49e776-2701-4f0e-8077-f92239424fa9",
  "quote_id": "25eb2c36-e7ac-4b2f-b37c-8c5eb27502a7",
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
  "id": "98a12bbf-f114-427d-9282-ff32b8ea44c9",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "50201229-d205-4aea-af79-90407b9e6f62",
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
  "created_at": "2026-10-30T19:37:04.812254Z",
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
    "id": "9ea46ac4-3a5a-489d-8922-6889e3cc88f6",
    "order_id": "98a12bbf-f114-427d-9282-ff32b8ea44c9",
    "expires_at": "2026-10-30T19:37:19.815156Z",
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
  "session_id": "e49eb3dd-da46-4a8b-b405-a5ecc1ec792a",
  "session_version": 4,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "OFFERED",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T19:37:04.189742Z",
  "last_location_at": "2026-10-30T19:37:04.189742Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

Round 2, at the same moment:

`POST /api/driver/v1/offers/9ea46ac4-3a5a-489d-8922-6889e3cc88f6/accept` → **409**

```json
{
  "instance": "/api/driver/v1/offers/9ea46ac4-3a5a-489d-8922-6889e3cc88f6/accept",
  "status": 409,
  "title": "Offer revoked",
  "type": "https://errors.blizz.taxi/offer-revoked",
  "code": "OFFER_REVOKED",
  "correlation_id": "6c1ab054-ad2c-4ef3-9f03-ecf095722f8e"
}
```

`POST /api/driver/v1/work-sessions/e49eb3dd-da46-4a8b-b405-a5ecc1ec792a/pause` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e49eb3dd-da46-4a8b-b405-a5ecc1ec792a",
  "session_version": 5,
  "session_state": "OPEN",
  "intent": "NOT_ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T19:37:04.189742Z",
  "last_location_at": "2026-10-30T19:37:04.189742Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

Round 2: the pause won; the accept got OFFER_REVOKED.

`GET /api/operator/v1/orders/98a12bbf-f114-427d-9282-ff32b8ea44c9` → **200**

```json
{
  "id": "98a12bbf-f114-427d-9282-ff32b8ea44c9",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "50201229-d205-4aea-af79-90407b9e6f62",
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
  "created_at": "2026-10-30T19:37:04.812254Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/98a12bbf-f114-427d-9282-ff32b8ea44c9` → **200**

```json
{
  "id": "98a12bbf-f114-427d-9282-ff32b8ea44c9",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "50201229-d205-4aea-af79-90407b9e6f62",
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
  "created_at": "2026-10-30T19:37:04.812254Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/98a12bbf-f114-427d-9282-ff32b8ea44c9/cancel` → **200**

```json
{
  "command_id": "9095a65d-64d3-453c-a709-8ba215e628ce",
  "expected_version": 4,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "98a12bbf-f114-427d-9282-ff32b8ea44c9",
  "short_number": 18,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "50201229-d205-4aea-af79-90407b9e6f62",
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
  "created_at": "2026-10-30T19:37:04.812254Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "uk": "Немає вільних авто",
      "pl": "Brak wolnych aut",
      "ru": "Нет свободных машин",
      "en": "No cars available"
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
  "session_id": "e49eb3dd-da46-4a8b-b405-a5ecc1ec792a",
  "session_version": 5,
  "session_state": "OPEN",
  "intent": "NOT_ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T19:37:04.189742Z",
  "last_location_at": "2026-10-30T19:37:04.189742Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/work-sessions/e49eb3dd-da46-4a8b-b405-a5ecc1ec792a/resume` → **200**

```json
{
  "command_id": "c0bf63ce-1876-49fe-acef-efb5b813a3ed",
  "expected_version": 5
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e49eb3dd-da46-4a8b-b405-a5ecc1ec792a",
  "session_version": 6,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T19:37:04.189742Z",
  "last_location_at": "2026-10-30T19:37:04.189742Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e49eb3dd-da46-4a8b-b405-a5ecc1ec792a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:37:07Z",
    "sequence": 1793389027379
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e49eb3dd-da46-4a8b-b405-a5ecc1ec792a",
  "session_version": 6,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T19:37:07.398509Z",
  "last_location_at": "2026-10-30T19:37:07.398509Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d9c7456c-4880-4875-a11d-62d634862c42",
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
  "id": "b2c70eee-e88d-4256-8b9e-d6ee9389845c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T19:42:07.703260Z",
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
  "command_id": "107bd077-c91c-4748-b881-222ccd2b751a",
  "quote_id": "b2c70eee-e88d-4256-8b9e-d6ee9389845c",
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
  "id": "25f446a9-8208-475f-98f3-212aca7dc6a2",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "50201229-d205-4aea-af79-90407b9e6f62",
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
  "created_at": "2026-10-30T19:37:08.00575Z",
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
    "id": "a091c3fc-1dac-4df5-ba5d-398582d2aa99",
    "order_id": "25f446a9-8208-475f-98f3-212aca7dc6a2",
    "expires_at": "2026-10-30T19:37:23.00845Z",
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
  "session_id": "e49eb3dd-da46-4a8b-b405-a5ecc1ec792a",
  "session_version": 6,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "OFFERED",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T19:37:07.398509Z",
  "last_location_at": "2026-10-30T19:37:07.398509Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

Round 3, at the same moment:

`POST /api/driver/v1/offers/a091c3fc-1dac-4df5-ba5d-398582d2aa99/accept` → **200**

```json
{
  "id": "d398ba94-a927-4265-aa8d-7215cdd58116",
  "order_id": "25f446a9-8208-475f-98f3-212aca7dc6a2",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d6f9f9e1-ce78-45ad-9f43-e9f0713192e0",
  "trip_phase": "TO_PICKUP"
}
```

`POST /api/driver/v1/work-sessions/e49eb3dd-da46-4a8b-b405-a5ecc1ec792a/pause` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e49eb3dd-da46-4a8b-b405-a5ecc1ec792a",
  "session_version": 7,
  "session_state": "OPEN",
  "intent": "PAUSE_AFTER_CURRENT",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T19:37:07.398509Z",
  "last_location_at": "2026-10-30T19:37:07.398509Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_PAUSE_AFTER_CURRENT",
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

Round 3: the accept won; the pause waits for the end of the trip.

`GET /api/operator/v1/orders/25f446a9-8208-475f-98f3-212aca7dc6a2` → **200**

```json
{
  "id": "25f446a9-8208-475f-98f3-212aca7dc6a2",
  "short_number": 19,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "50201229-d205-4aea-af79-90407b9e6f62",
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
    "id": "d398ba94-a927-4265-aa8d-7215cdd58116",
    "order_id": "25f446a9-8208-475f-98f3-212aca7dc6a2",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "d6f9f9e1-ce78-45ad-9f43-e9f0713192e0",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T19:37:08.00575Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/25f446a9-8208-475f-98f3-212aca7dc6a2` → **200**

```json
{
  "id": "25f446a9-8208-475f-98f3-212aca7dc6a2",
  "short_number": 19,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "50201229-d205-4aea-af79-90407b9e6f62",
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
    "id": "d398ba94-a927-4265-aa8d-7215cdd58116",
    "order_id": "25f446a9-8208-475f-98f3-212aca7dc6a2",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "d6f9f9e1-ce78-45ad-9f43-e9f0713192e0",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T19:37:08.00575Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/25f446a9-8208-475f-98f3-212aca7dc6a2/cancel` → **200**

```json
{
  "command_id": "20e6843a-2e94-4b02-a31d-7fa8085d90aa",
  "expected_version": 3,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "25f446a9-8208-475f-98f3-212aca7dc6a2",
  "short_number": 19,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "50201229-d205-4aea-af79-90407b9e6f62",
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
    "id": "d398ba94-a927-4265-aa8d-7215cdd58116",
    "order_id": "25f446a9-8208-475f-98f3-212aca7dc6a2",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "d6f9f9e1-ce78-45ad-9f43-e9f0713192e0",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T19:37:08.00575Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "uk": "Немає вільних авто",
      "pl": "Brak wolnych aut",
      "ru": "Нет свободных машин",
      "en": "No cars available"
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
  "session_id": "e49eb3dd-da46-4a8b-b405-a5ecc1ec792a",
  "session_version": 8,
  "session_state": "OPEN",
  "intent": "NOT_ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T19:37:07.398509Z",
  "last_location_at": "2026-10-30T19:37:07.398509Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/work-sessions/e49eb3dd-da46-4a8b-b405-a5ecc1ec792a/resume` → **200**

```json
{
  "command_id": "d0a541be-3211-4e8f-886b-67f5f3ea0433",
  "expected_version": 8
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e49eb3dd-da46-4a8b-b405-a5ecc1ec792a",
  "session_version": 9,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T19:37:07.398509Z",
  "last_location_at": "2026-10-30T19:37:07.398509Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e49eb3dd-da46-4a8b-b405-a5ecc1ec792a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:37:10Z",
    "sequence": 1793389030523
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e49eb3dd-da46-4a8b-b405-a5ecc1ec792a",
  "session_version": 9,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T19:37:10.542213Z",
  "last_location_at": "2026-10-30T19:37:10.542213Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "14f29eb7-1c16-460b-8d2c-3ce666fdf222",
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
  "id": "90013966-a7d5-4882-b36d-3b8e4c76885c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T19:42:10.847692Z",
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
  "command_id": "f9b2d1b6-a0d8-44bc-b99a-b41277f77eda",
  "quote_id": "90013966-a7d5-4882-b36d-3b8e4c76885c",
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
  "id": "c0eb0f1a-dc2d-4c28-ac29-e8b60db4fc27",
  "short_number": 20,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "50201229-d205-4aea-af79-90407b9e6f62",
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
  "created_at": "2026-10-30T19:37:11.148332Z",
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
    "id": "cd4aad3c-8a05-46ee-9c76-2216ebdfeb46",
    "order_id": "c0eb0f1a-dc2d-4c28-ac29-e8b60db4fc27",
    "expires_at": "2026-10-30T19:37:26.152006Z",
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
  "session_id": "e49eb3dd-da46-4a8b-b405-a5ecc1ec792a",
  "session_version": 9,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "OFFERED",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T19:37:10.542213Z",
  "last_location_at": "2026-10-30T19:37:10.542213Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

Round 4, at the same moment:

`POST /api/driver/v1/offers/cd4aad3c-8a05-46ee-9c76-2216ebdfeb46/accept` → **409**

```json
{
  "instance": "/api/driver/v1/offers/cd4aad3c-8a05-46ee-9c76-2216ebdfeb46/accept",
  "status": 409,
  "title": "Offer revoked",
  "type": "https://errors.blizz.taxi/offer-revoked",
  "code": "OFFER_REVOKED",
  "correlation_id": "17e08e7e-8fad-4721-b8be-81accd30c255"
}
```

`POST /api/driver/v1/work-sessions/e49eb3dd-da46-4a8b-b405-a5ecc1ec792a/pause` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e49eb3dd-da46-4a8b-b405-a5ecc1ec792a",
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
  "last_heartbeat_at": "2026-10-30T19:37:10.542213Z",
  "last_location_at": "2026-10-30T19:37:10.542213Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

Round 4: the pause won; the accept got OFFER_REVOKED.

`GET /api/operator/v1/orders/c0eb0f1a-dc2d-4c28-ac29-e8b60db4fc27` → **200**

```json
{
  "id": "c0eb0f1a-dc2d-4c28-ac29-e8b60db4fc27",
  "short_number": 20,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "50201229-d205-4aea-af79-90407b9e6f62",
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
  "created_at": "2026-10-30T19:37:11.148332Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/c0eb0f1a-dc2d-4c28-ac29-e8b60db4fc27` → **200**

```json
{
  "id": "c0eb0f1a-dc2d-4c28-ac29-e8b60db4fc27",
  "short_number": 20,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "50201229-d205-4aea-af79-90407b9e6f62",
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
  "created_at": "2026-10-30T19:37:11.148332Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/c0eb0f1a-dc2d-4c28-ac29-e8b60db4fc27/cancel` → **200**

```json
{
  "command_id": "46e52783-b6a1-4d6d-925e-7370b26c682b",
  "expected_version": 4,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "c0eb0f1a-dc2d-4c28-ac29-e8b60db4fc27",
  "short_number": 20,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "50201229-d205-4aea-af79-90407b9e6f62",
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
  "created_at": "2026-10-30T19:37:11.148332Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "uk": "Немає вільних авто",
      "pl": "Brak wolnych aut",
      "ru": "Нет свободных машин",
      "en": "No cars available"
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
  "session_id": "e49eb3dd-da46-4a8b-b405-a5ecc1ec792a",
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
  "last_heartbeat_at": "2026-10-30T19:37:10.542213Z",
  "last_location_at": "2026-10-30T19:37:10.542213Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/work-sessions/e49eb3dd-da46-4a8b-b405-a5ecc1ec792a/resume` → **200**

```json
{
  "command_id": "1b17a33b-a591-40bc-a20f-b5f850d2f837",
  "expected_version": 10
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e49eb3dd-da46-4a8b-b405-a5ecc1ec792a",
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
  "last_heartbeat_at": "2026-10-30T19:37:10.542213Z",
  "last_location_at": "2026-10-30T19:37:10.542213Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e49eb3dd-da46-4a8b-b405-a5ecc1ec792a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:37:13Z",
    "sequence": 1793389033721
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e49eb3dd-da46-4a8b-b405-a5ecc1ec792a",
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
  "last_heartbeat_at": "2026-10-30T19:37:13.741097Z",
  "last_location_at": "2026-10-30T19:37:13.741097Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "3ee4ce03-2f18-4dc2-9810-0934160b5f59",
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
  "id": "82bcc49e-3860-47c0-86b0-9f22a029f15f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T19:42:14.047134Z",
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
  "command_id": "78d7e85b-4940-4a49-9bba-3661059a63f0",
  "quote_id": "82bcc49e-3860-47c0-86b0-9f22a029f15f",
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
  "id": "7e997753-87a6-4db0-a464-1ec454a46a1d",
  "short_number": 21,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "50201229-d205-4aea-af79-90407b9e6f62",
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
  "created_at": "2026-10-30T19:37:14.360535Z",
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
    "id": "fe67b1b5-c85e-4fb5-a209-a5175cf1b0b7",
    "order_id": "7e997753-87a6-4db0-a464-1ec454a46a1d",
    "expires_at": "2026-10-30T19:37:29.364215Z",
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
  "session_id": "e49eb3dd-da46-4a8b-b405-a5ecc1ec792a",
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
  "last_heartbeat_at": "2026-10-30T19:37:13.741097Z",
  "last_location_at": "2026-10-30T19:37:13.741097Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

Round 5, at the same moment:

`POST /api/driver/v1/offers/fe67b1b5-c85e-4fb5-a209-a5175cf1b0b7/accept` → **200**

```json
{
  "id": "2c1b1ff0-cf45-4ff3-bc62-246ab49b2bd3",
  "order_id": "7e997753-87a6-4db0-a464-1ec454a46a1d",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "80c126f6-deb7-43f3-9746-8c88afc4559b",
  "trip_phase": "TO_PICKUP"
}
```

`POST /api/driver/v1/work-sessions/e49eb3dd-da46-4a8b-b405-a5ecc1ec792a/pause` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e49eb3dd-da46-4a8b-b405-a5ecc1ec792a",
  "session_version": 12,
  "session_state": "OPEN",
  "intent": "PAUSE_AFTER_CURRENT",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T19:37:13.741097Z",
  "last_location_at": "2026-10-30T19:37:13.741097Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_PAUSE_AFTER_CURRENT",
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

Round 5: the accept won; the pause waits for the end of the trip.

`GET /api/operator/v1/orders/7e997753-87a6-4db0-a464-1ec454a46a1d` → **200**

```json
{
  "id": "7e997753-87a6-4db0-a464-1ec454a46a1d",
  "short_number": 21,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "50201229-d205-4aea-af79-90407b9e6f62",
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
    "id": "2c1b1ff0-cf45-4ff3-bc62-246ab49b2bd3",
    "order_id": "7e997753-87a6-4db0-a464-1ec454a46a1d",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "80c126f6-deb7-43f3-9746-8c88afc4559b",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T19:37:14.360535Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/7e997753-87a6-4db0-a464-1ec454a46a1d` → **200**

```json
{
  "id": "7e997753-87a6-4db0-a464-1ec454a46a1d",
  "short_number": 21,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "50201229-d205-4aea-af79-90407b9e6f62",
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
    "id": "2c1b1ff0-cf45-4ff3-bc62-246ab49b2bd3",
    "order_id": "7e997753-87a6-4db0-a464-1ec454a46a1d",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "80c126f6-deb7-43f3-9746-8c88afc4559b",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T19:37:14.360535Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/7e997753-87a6-4db0-a464-1ec454a46a1d/cancel` → **200**

```json
{
  "command_id": "e06a084f-1f33-4893-b064-cac28eebc380",
  "expected_version": 3,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "7e997753-87a6-4db0-a464-1ec454a46a1d",
  "short_number": 21,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "50201229-d205-4aea-af79-90407b9e6f62",
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
    "id": "2c1b1ff0-cf45-4ff3-bc62-246ab49b2bd3",
    "order_id": "7e997753-87a6-4db0-a464-1ec454a46a1d",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "80c126f6-deb7-43f3-9746-8c88afc4559b",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T19:37:14.360535Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "uk": "Немає вільних авто",
      "pl": "Brak wolnych aut",
      "ru": "Нет свободных машин",
      "en": "No cars available"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

E5: 2 rounds won by the accept, 3 by the pause; one winner each round, no 5xx.

## E4: a fix with 250 m accuracy keeps Near out of new orders; an accurate one brings him back

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e49eb3dd-da46-4a8b-b405-a5ecc1ec792a",
  "session_version": 13,
  "session_state": "OPEN",
  "intent": "NOT_ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T19:37:13.741097Z",
  "last_location_at": "2026-10-30T19:37:13.741097Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/work-sessions/e49eb3dd-da46-4a8b-b405-a5ecc1ec792a/resume` → **200**

```json
{
  "command_id": "514f0bca-a97e-421f-bb2d-69ac54b66658",
  "expected_version": 13
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e49eb3dd-da46-4a8b-b405-a5ecc1ec792a",
  "session_version": 14,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T19:37:13.741097Z",
  "last_location_at": "2026-10-30T19:37:13.741097Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e49eb3dd-da46-4a8b-b405-a5ecc1ec792a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 250,
    "recorded_at": "2026-10-30T19:37:16Z",
    "sequence": 1793389036874
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e49eb3dd-da46-4a8b-b405-a5ecc1ec792a",
  "session_version": 14,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T19:37:16.894619Z",
  "last_location_at": "2026-10-30T19:37:16.894619Z",
  "eligible": false,
  "ineligible_reasons": [
    "LOCATION_INACCURATE"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/work-sessions/e49eb3dd-da46-4a8b-b405-a5ecc1ec792a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:37:17Z",
    "sequence": 1793389037187
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e49eb3dd-da46-4a8b-b405-a5ecc1ec792a",
  "session_version": 14,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T19:37:17.206714Z",
  "last_location_at": "2026-10-30T19:37:17.206714Z",
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
  "at": "2026-10-30T19:37:17.511866553Z",
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
      "last_location_at": "2026-10-30T19:37:17.206714Z",
      "last_heartbeat_at": "2026-10-30T19:37:17.206714Z",
      "order_id": null
    }
  ]
}
```

Done: E2, E5 (2/3), E4 and last_heartbeat_at 2026-10-30T19:37:17.206714Z.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e49eb3dd-da46-4a8b-b405-a5ecc1ec792a",
  "session_version": 14,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T19:37:17.206714Z",
  "last_location_at": "2026-10-30T19:37:17.206714Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e49eb3dd-da46-4a8b-b405-a5ecc1ec792a/close` → **200**

```json
{
  "command_id": "e0d49f33-773f-4e4c-b4fb-d98cb69c9a10",
  "expected_version": 14
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
  "session_id": "44c09703-5cd5-4b20-b39a-e58cbf5a03a3",
  "subject": {
    "type": "STAFF",
    "id": "bbeb0bd1-546e-4687-8aa4-9df00ff27005"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYmViMGJkMS01NDZlLTQ2ODctOGFhNC05ZGYwMGZmMjcwMDUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODk5MzksImlhdCI6MTc5MzM4OTAzOSwianRpIjoiMjk0ZDgzMzMtNzdhYi00N2FjLTk3OTEtMjcyMTM5N2Q4ZmVjIiwic2lkIjoiNDRjMDk3MDMtNWNkNS00YjIwLWIzOWEtZTU4Y2JmNWEwM2EzIn0.NIhPm7KYUo8NyLJ-SsYOerlLRaCnpL_qjWIvCM5P-dM",
  "access_expires_at": "2026-10-30T19:52:19.014310667Z",
  "refresh_token": "5h_aHX3kL3piCtFcG-EME3yCOmk_ppQRdThrqIxtCjo",
  "refresh_expires_at": "2026-10-31T07:37:19.013657787Z",
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
  "command_id": "54efdac4-3e2f-4eb3-b559-cb4e74a76439",
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
  "changed_by": "bbeb0bd1-546e-4687-8aa4-9df00ff27005",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-30T19:37:19.613667Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "3214b00b-d900-4f00-a28b-eda621dd2431",
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
  "correlation_id": "271b624b-cfc2-4dfc-8e11-4224342bfb2b",
  "current_version": 1
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "b741c629-8d19-4b11-b71c-b869e42d33f7",
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
  "correlation_id": "66adeec6-42ca-4ebe-8eaf-7ce139be5771"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635902560",
  "device_ref": "sandbox-27148"
}
```

```json
{
  "challenge_id": "4831f062-a9e8-4681-afba-7610d617fa17",
  "expires_at": "2026-10-30T19:42:20.511681316Z",
  "resend_available_at": "2026-10-30T19:37:21.511681316Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380635902560` → **200**

```json
{
  "phone": "+380635902560",
  "audience": "CLIENT",
  "code": "804296",
  "sent_at": "2026-10-30T19:37:20.515878932Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4831f062-a9e8-4681-afba-7610d617fa17",
  "code": "804296",
  "device_ref": "sandbox-27148"
}
```

```json
{
  "session_id": "20e2beb0-df31-4cca-91c4-dfe75dabb75f",
  "subject": {
    "type": "CLIENT",
    "id": "d1100500-abc8-4c02-b4c5-5b653d09faf0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMTEwMDUwMC1hYmM4LTRjMDItYjRjNS01YjY1M2QwOWZhZjAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzg5OTQwLCJpYXQiOjE3OTMzODkwNDAsImp0aSI6ImQ2YjUxMzBlLWFlYzEtNDM2Ny04NjRiLWE0N2U5NjdmYTlkMSIsInNpZCI6IjIwZTJiZWIwLWRmMzEtNGNjYS05MWM0LWRmZTc1ZGFiYjc1ZiJ9.ChrsYS8Zi5A0-9G71V4qD9nqn-oLnm_QXRQJwoi2q9Q",
  "access_expires_at": "2026-10-30T19:52:20.837386203Z",
  "refresh_token": "r-8kr7xTWK5TEUzsymf5FhForO6SZKZ0HA59p8nph7s",
  "refresh_expires_at": "2026-11-29T19:37:20.836836475Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "10ceeff2-4b3a-49c0-a557-53cac5fe124b",
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
  "id": "193e6f0b-f40d-42b2-beae-d350d16d47c4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T19:42:21.140429Z",
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
  "command_id": "5fbf7efe-0669-478b-8dd3-f7f48990d6fb",
  "quote_id": "193e6f0b-f40d-42b2-beae-d350d16d47c4",
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
  "correlation_id": "765b8085-d6fa-449f-91fc-ca43c269a356"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "5d765451-d45d-4cec-b66b-4dba76fd0ffe",
  "quote_id": "193e6f0b-f40d-42b2-beae-d350d16d47c4",
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
  "id": "32e4fdc5-b15b-450f-8db7-ad8ef7cc3d89",
  "short_number": 22,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d1100500-abc8-4c02-b4c5-5b653d09faf0",
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
  "created_at": "2026-10-30T19:37:21.755291Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/32e4fdc5-b15b-450f-8db7-ad8ef7cc3d89/cancel` → **200**

```json
{
  "command_id": "85553607-0fb4-4e18-ba9e-fc0ce15308c5",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "32e4fdc5-b15b-450f-8db7-ad8ef7cc3d89",
  "short_number": 22,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "d1100500-abc8-4c02-b4c5-5b653d09faf0",
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
  "created_at": "2026-10-30T19:37:21.755291Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "uk": "Передумав їхати",
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
      "en": "Changed my mind"
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
  "command_id": "5a034abb-a6f7-4ab4-a5df-e829ee8ba654",
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
  "changed_by": "bbeb0bd1-546e-4687-8aa4-9df00ff27005",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-30T19:37:22.43531Z"
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
      "changed_by": "bbeb0bd1-546e-4687-8aa4-9df00ff27005",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-30T19:37:22.43531Z"
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
  "device_ref": "sandbox-32531"
}
```

```json
{
  "challenge_id": "56dad405-fa90-4860-8a11-db69c612884f",
  "expires_at": "2026-10-30T19:42:23.333938658Z",
  "resend_available_at": "2026-10-30T19:37:24.333938658Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "378430",
  "sent_at": "2026-10-30T19:37:23.337105982Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "56dad405-fa90-4860-8a11-db69c612884f",
  "code": "378430",
  "device_ref": "sandbox-32531"
}
```

```json
{
  "session_id": "44149c41-93e3-4638-b62e-15ebc863b8d0",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4OTk0MywiaWF0IjoxNzkzMzg5MDQzLCJqdGkiOiJiZmY1MzFjMi0xZDk5LTRhMDYtOTk1Mi0xNWE4OTMwZDllOWUiLCJzaWQiOiI0NDE0OWM0MS05M2UzLTQ2MzgtYjYyZS0xNWViYzg2M2I4ZDAifQ.Jb9ylfCySsh-_tD8YnH60eobMe2CQivWE7cVLrL_jHY",
  "access_expires_at": "2026-10-30T19:52:23.654743872Z",
  "refresh_token": "r6K3aSBFmGHmFHccfemPJynlm1OxulVetECc5XFlebg",
  "refresh_expires_at": "2026-11-29T19:37:23.654008096Z",
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
  "command_id": "0049f7bc-5179-46c7-8d6d-14c02f176296",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:37:24Z",
    "sequence": 1793389044242
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b499b322-3401-4c88-86dc-7dd7e99a894e",
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
  "last_heartbeat_at": "2026-10-30T19:37:24.261346Z",
  "last_location_at": "2026-10-30T19:37:24.261346Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679410074",
  "device_ref": "sandbox-9980"
}
```

```json
{
  "challenge_id": "85608424-1321-459f-ba91-1e98439ef2f9",
  "expires_at": "2026-10-30T19:42:24.558935708Z",
  "resend_available_at": "2026-10-30T19:37:25.558935708Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380679410074` → **200**

```json
{
  "phone": "+380679410074",
  "audience": "CLIENT",
  "code": "753974",
  "sent_at": "2026-10-30T19:37:24.562030797Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "85608424-1321-459f-ba91-1e98439ef2f9",
  "code": "753974",
  "device_ref": "sandbox-9980"
}
```

```json
{
  "session_id": "a5a6f946-a524-44ab-ac28-df585af39447",
  "subject": {
    "type": "CLIENT",
    "id": "fea7a621-ec93-4325-9488-4ddd3ac4b517"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZWE3YTYyMS1lYzkzLTQzMjUtOTQ4OC00ZGRkM2FjNGI1MTciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzg5OTQ0LCJpYXQiOjE3OTMzODkwNDQsImp0aSI6IjFmNmYwMjk4LTBiM2UtNGQxZi04ZDUyLWFlMDQ3YjJhN2I5ZiIsInNpZCI6ImE1YTZmOTQ2LWE1MjQtNDRhYi1hYzI4LWRmNTg1YWYzOTQ0NyJ9.KlCEYbvy9KER7uUjCMGSfgs5jETiDvbQcd88yMhJQBI",
  "access_expires_at": "2026-10-30T19:52:24.879680028Z",
  "refresh_token": "1Pzs6K9up_JW28zFzhL6E7mgHRqLglqSWGhCr8AoT_Y",
  "refresh_expires_at": "2026-11-29T19:37:24.879091867Z",
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
  "command_id": "492a0a6d-1131-4189-b91b-9f167beb721b",
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
  "id": "0175a9c4-d5f7-4ad5-be16-07598e771d0e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T19:42:25.466005Z",
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
  "command_id": "13992d5a-4923-4d3b-a14a-24fede543e28",
  "platform": "ANDROID",
  "token": "sandbox-driver-6464fdc1-805d-4948-8b53-656d0e0051a4"
}
```

```json
{
  "id": "7e937f94-5644-4235-a7c1-d2eb1b8d1760",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T19:37:25.773446Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "0c132553-e8a3-4a97-9644-fa8b51e21ae2",
  "platform": "ANDROID",
  "token": "sandbox-rider-1d9bb53f-9ba4-4843-a055-a476ee031e4b"
}
```

```json
{
  "id": "6c1a8a9a-2a89-4500-96d9-a1fd4ea32df9",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T19:37:26.068339Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "abd07596-4458-4b75-b91d-86130395c547",
  "quote_id": "0175a9c4-d5f7-4ad5-be16-07598e771d0e",
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
  "id": "fac5702b-5d1e-4a4d-8a35-7539953da504",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "fea7a621-ec93-4325-9488-4ddd3ac4b517",
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
  "created_at": "2026-10-30T19:37:26.37237Z",
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
    "id": "664a3392-02b7-4853-8685-b8cefa8ccd1b",
    "order_id": "fac5702b-5d1e-4a4d-8a35-7539953da504",
    "expires_at": "2026-10-30T19:37:41.375933Z",
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

`POST /api/driver/v1/offers/664a3392-02b7-4853-8685-b8cefa8ccd1b/accept` → **200**

```json
{
  "command_id": "86a9ac55-cb88-4a4e-b994-d0619fba42d5"
}
```

```json
{
  "id": "c239ffa3-5516-4f2b-b1ed-cdc5f827838e",
  "order_id": "fac5702b-5d1e-4a4d-8a35-7539953da504",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "8a1763b8-3df9-4aa2-b079-007ade30c71d",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-30T19:37:26.349Z` → **200**

```json
[
  {
    "at": "2026-10-30T19:37:26.853051738Z",
    "token_suffix": "0051a4",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "event_type": "OfferMade",
      "event_id": "7b4ce631-1825-4078-bf12-3c1c4ba8de70",
      "order_version": "2",
      "order_id": "fac5702b-5d1e-4a4d-8a35-7539953da504",
      "type": "driver.offer"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380679410074&after=2026-10-30T19:37:26.349Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380679410074&after=2026-10-30T19:37:26.349Z` → **200**

```json
[
  {
    "at": "2026-10-30T19:37:27.859338347Z",
    "token_suffix": "031e4b",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "event_type": "AssignmentCommitted",
      "event_id": "d56b0a0c-e8b1-4a9a-b11c-8beace5410db",
      "order_version": "3",
      "order_id": "fac5702b-5d1e-4a4d-8a35-7539953da504",
      "type": "rider.driver-assigned"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/fac5702b-5d1e-4a4d-8a35-7539953da504/messages` → **201**

```json
{
  "command_id": "9ab7f9d0-631f-4ac0-9588-8ab142a760a6",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "363038e1-f2a4-4131-8602-754450bdabac",
  "order_id": "fac5702b-5d1e-4a4d-8a35-7539953da504",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-30T19:37:28.39186432Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "8a1763b8-3df9-4aa2-b079-007ade30c71d",
  "order_id": "fac5702b-5d1e-4a4d-8a35-7539953da504",
  "assignment_id": "c239ffa3-5516-4f2b-b1ed-cdc5f827838e",
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

`POST /api/driver/v1/trips/8a1763b8-3df9-4aa2-b079-007ade30c71d/messages` → **201**

```json
{
  "command_id": "98ff22ff-3d19-4516-ab65-462c0e35d27d",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "ffc2988a-6cde-44b3-b371-42ddc06fa2a2",
  "order_id": "fac5702b-5d1e-4a4d-8a35-7539953da504",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-30T19:37:28.97036319Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/fac5702b-5d1e-4a4d-8a35-7539953da504/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/8a1763b8-3df9-4aa2-b079-007ade30c71d/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380679410074"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/b499b322-3401-4c88-86dc-7dd7e99a894e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:37:29Z",
    "sequence": 1793389049844
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b499b322-3401-4c88-86dc-7dd7e99a894e",
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
  "last_heartbeat_at": "2026-10-30T19:37:29.862784Z",
  "last_location_at": "2026-10-30T19:37:29.862784Z",
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
  "id": "8a1763b8-3df9-4aa2-b079-007ade30c71d",
  "order_id": "fac5702b-5d1e-4a4d-8a35-7539953da504",
  "assignment_id": "c239ffa3-5516-4f2b-b1ed-cdc5f827838e",
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

`POST /api/driver/v1/trips/8a1763b8-3df9-4aa2-b079-007ade30c71d/arrive` → **200**

```json
{
  "command_id": "eeac19bf-5f9b-4aa9-b725-f0527c4d93e1",
  "expected_version": 0
}
```

```json
{
  "id": "8a1763b8-3df9-4aa2-b079-007ade30c71d",
  "order_id": "fac5702b-5d1e-4a4d-8a35-7539953da504",
  "assignment_id": "c239ffa3-5516-4f2b-b1ed-cdc5f827838e",
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
  "arrived_at": "2026-10-30T19:37:30.444207Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/8a1763b8-3df9-4aa2-b079-007ade30c71d/start` → **200**

```json
{
  "command_id": "3c982d23-dce8-4f88-8965-af438b8fd9de",
  "expected_version": 1
}
```

```json
{
  "id": "8a1763b8-3df9-4aa2-b079-007ade30c71d",
  "order_id": "fac5702b-5d1e-4a4d-8a35-7539953da504",
  "assignment_id": "c239ffa3-5516-4f2b-b1ed-cdc5f827838e",
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
  "arrived_at": "2026-10-30T19:37:30.444207Z",
  "started_at": "2026-10-30T19:37:30.754399Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

(the car drives 47 s to the next point)

`POST /api/driver/v1/work-sessions/b499b322-3401-4c88-86dc-7dd7e99a894e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:38:18Z",
    "sequence": 1793389098778
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b499b322-3401-4c88-86dc-7dd7e99a894e",
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
  "last_heartbeat_at": "2026-10-30T19:38:18.096814Z",
  "last_location_at": "2026-10-30T19:38:18.096814Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/8a1763b8-3df9-4aa2-b079-007ade30c71d/complete` → **200**

```json
{
  "command_id": "73f3cbb3-6c1f-4947-ba2c-19a1321c8e68",
  "expected_version": 2,
  "reported_at": "2026-10-30T19:38:18Z",
  "cash_received": true
}
```

```json
{
  "id": "8a1763b8-3df9-4aa2-b079-007ade30c71d",
  "order_id": "fac5702b-5d1e-4a4d-8a35-7539953da504",
  "assignment_id": "c239ffa3-5516-4f2b-b1ed-cdc5f827838e",
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
  "arrived_at": "2026-10-30T19:37:30.444207Z",
  "started_at": "2026-10-30T19:37:30.754399Z",
  "completed_at": "2026-10-30T19:38:18.403129Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/fac5702b-5d1e-4a4d-8a35-7539953da504` → **200**

```json
{
  "id": "fac5702b-5d1e-4a4d-8a35-7539953da504",
  "short_number": 23,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "fea7a621-ec93-4325-9488-4ddd3ac4b517",
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
    "id": "c239ffa3-5516-4f2b-b1ed-cdc5f827838e",
    "order_id": "fac5702b-5d1e-4a4d-8a35-7539953da504",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "8a1763b8-3df9-4aa2-b079-007ade30c71d",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T19:37:26.37237Z",
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
      "id": "fac5702b-5d1e-4a4d-8a35-7539953da504",
      "short_number": 23,
      "status": "FULFILLED",
      "created_at": "2026-10-30T19:37:26.37237Z",
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
      "id": "8a1763b8-3df9-4aa2-b079-007ade30c71d",
      "order_id": "fac5702b-5d1e-4a4d-8a35-7539953da504",
      "order_short_number": 23,
      "created_at": "2026-10-30T19:37:27.005618Z",
      "pickup_label": "Майдан Незалежності",
      "dropoff_label": "Залізничний вокзал",
      "final_price_minor": 10517,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "COMPLETED"
    },
    {
      "id": "80c126f6-deb7-43f3-9746-8c88afc4559b",
      "order_id": "7e997753-87a6-4db0-a464-1ec454a46a1d",
      "order_short_number": 21,
      "created_at": "2026-10-30T19:37:15.296503Z",
      "pickup_label": "Майдан",
      "dropoff_label": "Вокзал",
      "final_price_minor": null,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "ABORTED"
    },
    {
      "id": "d6f9f9e1-ce78-45ad-9f43-e9f0713192e0",
      "order_id": "25f446a9-8208-475f-98f3-212aca7dc6a2",
      "order_short_number": 19,
      "created_at": "2026-10-30T19:37:08.928372Z",
      "pickup_label": "Майдан",
      "dropoff_label": "Вокзал",
      "final_price_minor": null,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "ABORTED"
    },
    {
      "id": "a232c44f-af3d-4102-a7b2-632aec02ffa7",
      "order_id": "c80ea9d0-7e16-4d29-a8c0-4a67816008fd",
      "order_short_number": 10,
      "created_at": "2026-10-30T19:31:14.147842Z",
      "pickup_label": "Майдан",
      "dropoff_label": "Вокзал",
      "final_price_minor": 10517,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "COMPLETED"
    },
    {
      "id": "86429bbe-b8cc-45d8-b6f7-5b4ed3b5be2b",
      "order_id": "79dff704-8e29-4fa3-91e6-51a4bdee200b",
      "order_short_number": 5,
      "created_at": "2026-10-30T19:29:38.104027Z",
      "pickup_label": "Майдан",
      "dropoff_label": "Вокзал",
      "final_price_minor": 10517,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "COMPLETED"
    },
    {
      "id": "11b59fc9-272f-4771-9c95-88cba1a51ffd",
      "order_id": "9cb9373f-7088-4877-9dc1-0fb74da1caf2",
      "order_short_number": 3,
      "created_at": "2026-10-30T19:25:44.888396Z",
      "pickup_label": "Майдан",
      "dropoff_label": "Вокзал",
      "final_price_minor": 10517,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "COMPLETED"
    },
    {
      "id": "aa253476-eae6-44de-a0ee-ef699b3d3eb6",
      "order_id": "2e5e9ec0-fe1f-45c1-b0b1-b9e15cb69ae9",
      "order_short_number": 2,
      "created_at": "2026-10-30T19:25:34.684055Z",
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

`GET /api/rider/v1/orders/fac5702b-5d1e-4a4d-8a35-7539953da504/tip` → **200**

```json
{
  "order_id": "fac5702b-5d1e-4a4d-8a35-7539953da504",
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
  "available_until": "2026-10-31T19:38:18.403129Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/fac5702b-5d1e-4a4d-8a35-7539953da504/tip` → **201**

```json
{
  "command_id": "5023208b-4008-4379-8736-9a004a153ced",
  "amount_minor": 1100
}
```

```json
{
  "id": "c0623fb4-c981-41e3-8f20-d52f16b729c5",
  "order_id": "fac5702b-5d1e-4a4d-8a35-7539953da504",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-30T19:38:23.49684Z"
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
  "session_id": "92dd3414-665a-4942-8c78-ef44e28172cb",
  "subject": {
    "type": "STAFF",
    "id": "bbeb0bd1-546e-4687-8aa4-9df00ff27005"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYmViMGJkMS01NDZlLTQ2ODctOGFhNC05ZGYwMGZmMjcwMDUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTAwMDQsImlhdCI6MTc5MzM4OTEwNCwianRpIjoiZDBmYWQ4NjUtNWEwYy00ODQwLWJiZjMtNTc0YzQ3ZDg0NWU4Iiwic2lkIjoiOTJkZDM0MTQtNjY1YS00OTQyLThjNzgtZWY0NGUyODE3MmNiIn0.b7w1QGM39OA8sCb6j4MJ_J1uFHQK8xtUh2qNbuGZdAo",
  "access_expires_at": "2026-10-30T19:53:24.088223383Z",
  "refresh_token": "9IpCQzfikl8jq4cLTv685tzGygnUSAiLtWMWKOpYEQM",
  "refresh_expires_at": "2026-10-31T07:38:24.087621297Z",
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
        "created": 22,
        "fulfilled": 9,
        "cancelled": 13,
        "unfulfilled": 0,
        "open": 0,
        "by_channel": {
          "PHONE": 1,
          "APP": 21
        },
        "by_payment": {
          "CARD": 2,
          "CASH": 20
        },
        "cancelled_by": {
          "DRIVER": 1,
          "RIDER": 3,
          "STAFF": 9
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
      "PHONE": 1,
      "APP": 21
    },
    "by_payment": {
      "CARD": 2,
      "CASH": 20
    },
    "cancelled_by": {
      "DRIVER": 1,
      "RIDER": 3,
      "STAFF": 9
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
  "generated_at": "2026-10-30T19:38:24.386220045Z"
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
  "generated_at": "2026-10-30T19:38:24.70555444Z"
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
  "session_id": "0ea5651f-a369-4d09-8650-a874cbb4e591",
  "subject": {
    "type": "STAFF",
    "id": "bbeb0bd1-546e-4687-8aa4-9df00ff27005"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYmViMGJkMS01NDZlLTQ2ODctOGFhNC05ZGYwMGZmMjcwMDUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTAwMDUsImlhdCI6MTc5MzM4OTEwNSwianRpIjoiMzM2M2I0OTQtNzkxYS00YjMxLTk1MjEtYWUxNzNmYjE5NzI3Iiwic2lkIjoiMGVhNTY1MWYtYTM2OS00ZDA5LTg2NTAtYTg3NGNiYjRlNTkxIn0.bZrDRb3JuZGTylXCZt5QNa_PRdpXQ3L9Qa4jjjGYAlo",
  "access_expires_at": "2026-10-30T19:53:25.296689448Z",
  "refresh_token": "eyWpit34AA0SwzC9spvhNt3s6l_m3vKxobnHFdqMLjE",
  "refresh_expires_at": "2026-10-31T07:38:25.29590955Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/fac5702b-5d1e-4a4d-8a35-7539953da504/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T19:37:26.372929Z",
      "actor": {
        "type": "CLIENT",
        "id": "fea7a621-ec93-4325-9488-4ddd3ac4b517",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "fac5702b-5d1e-4a4d-8a35-7539953da504",
        "quote_id": "0175a9c4-d5f7-4ad5-be16-07598e771d0e",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "497ad498-b18f-4724-984b-730db2791e07"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T19:37:26.375146Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "fac5702b-5d1e-4a4d-8a35-7539953da504",
        "attempt_id": "99c54e98-0a22-4103-afc9-6ee6957895a1",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "497ad498-b18f-4724-984b-730db2791e07"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T19:37:26.378989Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "664a3392-02b7-4853-8685-b8cefa8ccd1b",
        "order_id": "fac5702b-5d1e-4a4d-8a35-7539953da504",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "497ad498-b18f-4724-984b-730db2791e07"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T19:37:27.0081Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "664a3392-02b7-4853-8685-b8cefa8ccd1b",
        "order_id": "fac5702b-5d1e-4a4d-8a35-7539953da504",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "c239ffa3-5516-4f2b-b1ed-cdc5f827838e"
      },
      "correlation_id": "7e68eb3b-e537-477e-a2a4-f2faf57d9034"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-30T19:38:25.875728188Z",
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
      "last_location_at": "2026-10-30T19:38:18.096814Z",
      "last_heartbeat_at": "2026-10-30T19:38:18.096814Z",
      "order_id": null
    }
  ]
}
```

Done: order fac5702b-5d1e-4a4d-8a35-7539953da504.

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
  "session_id": "cc6d0dab-1f17-4728-8fe0-0ad78c5824a0",
  "subject": {
    "type": "STAFF",
    "id": "bbeb0bd1-546e-4687-8aa4-9df00ff27005"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYmViMGJkMS01NDZlLTQ2ODctOGFhNC05ZGYwMGZmMjcwMDUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTAwMDYsImlhdCI6MTc5MzM4OTEwNiwianRpIjoiODhhNGQ2MWEtYTEwMC00N2VlLWIwYzktZTg1Y2YxZDAzMTNhIiwic2lkIjoiY2M2ZDBkYWItMWYxNy00NzI4LThmZTAtMGFkNzhjNTgyNGEwIn0.IPyPX5TZc1CDktEifmLPv3UmYF-lmjZr9hkK2VPnRu8",
  "access_expires_at": "2026-10-30T19:53:26.473775838Z",
  "refresh_token": "YAvGsPLzPG9jjoe7PKKLxro9wm2hUwi4Gcjl2K1NhT4",
  "refresh_expires_at": "2026-10-31T07:38:26.473202496Z",
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
  "command_id": "e8de509f-80d6-44da-9584-0eb2833a6178",
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
  "timestamp": "2026-10-30T19:38:27.000+0000",
  "channel": {
    "id": "1730052000.145918866",
    "linkedid": "1730052000.145918866",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380670405730"
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
  "timestamp": "2026-10-30T19:38:27.000+0000",
  "channel": {
    "id": "1730052000.145918866",
    "linkedid": "1730052000.145918866",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380670405730"
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
  "session_id": "fbfafb17-81e4-4550-9681-9b49c806dd2c",
  "subject": {
    "type": "STAFF",
    "id": "bbeb0bd1-546e-4687-8aa4-9df00ff27005"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYmViMGJkMS01NDZlLTQ2ODctOGFhNC05ZGYwMGZmMjcwMDUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTAwMDcsImlhdCI6MTc5MzM4OTEwNywianRpIjoiYjNiNWExMzgtZThmNy00NjY2LWEwMDQtOTYxMDkzODEwMjQ1Iiwic2lkIjoiZmJmYWZiMTctODFlNC00NTUwLTk2ODEtOWI0OWM4MDZkZDJjIn0.UcDQr0mg-IB6BkAglAklW9TTHGwT3Ch76Djn3oG9McA",
  "access_expires_at": "2026-10-30T19:53:27.697338431Z",
  "refresh_token": "Cc_2UI90pfgaYaraDKoZWwHDkWVKfBVpTBjhrqOtbzo",
  "refresh_expires_at": "2026-10-31T07:38:27.696776962Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "43c98ecd-3555-4e9b-9943-c4c994e51b3e",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380670405730",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T19:38:27Z",
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

`POST /api/operator/v1/calls/43c98ecd-3555-4e9b-9943-c4c994e51b3e/answer` → **200**

```json
{
  "command_id": "ea157245-6ec0-415e-8a22-1a8947d69b44"
}
```

```json
{
  "id": "43c98ecd-3555-4e9b-9943-c4c994e51b3e",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380670405730",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "bbeb0bd1-546e-4687-8aa4-9df00ff27005",
  "order_ids": [],
  "started_at": "2026-10-30T19:38:27Z",
  "answered_at": "2026-10-30T19:38:28.295927Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.145918866",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "9a45f425-21a0-4aef-a049-4ef469649eff",
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
  "id": "96aa2b4b-328e-4218-a5cc-e94412b492f4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T19:43:28.621909Z",
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
  "command_id": "1b8a6c7f-4562-4ca2-86ee-e0ca32890ce9",
  "quote_id": "96aa2b4b-328e-4218-a5cc-e94412b492f4",
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
    "phone": "+380670405730"
  },
  "call_id": "43c98ecd-3555-4e9b-9943-c4c994e51b3e"
}
```

```json
{
  "id": "0859af05-109d-406b-b8b9-fe7f47dfc04b",
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
  "created_at": "2026-10-30T19:38:28.921359Z",
  "caller": {
    "name": "Caller",
    "phone": "+380670405730"
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
    "id": "1730052000.145918866",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "43c98ecd-3555-4e9b-9943-c4c994e51b3e",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670405730",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "bbeb0bd1-546e-4687-8aa4-9df00ff27005",
      "order_ids": [
        "0859af05-109d-406b-b8b9-fe7f47dfc04b"
      ],
      "started_at": "2026-10-30T19:38:27Z",
      "answered_at": "2026-10-30T19:38:28.295927Z",
      "ended_at": "2026-10-30T19:38:29.273984Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "7c20f595-bff8-4582-bb32-07cef970fae6",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672327504",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "bbeb0bd1-546e-4687-8aa4-9df00ff27005",
      "order_ids": [],
      "started_at": "2026-10-30T19:29:26.710958Z",
      "answered_at": "2026-10-30T19:29:27.038743Z",
      "ended_at": "2026-10-30T19:29:27.352751Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T19:29:33.287134Z"
      }
    }
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
```

`GET /api/operator/v1/orders/0859af05-109d-406b-b8b9-fe7f47dfc04b` → **200**

```json
{
  "id": "0859af05-109d-406b-b8b9-fe7f47dfc04b",
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
  "created_at": "2026-10-30T19:38:28.921359Z",
  "caller": {
    "name": "Caller",
    "phone": "+380670405730"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/0859af05-109d-406b-b8b9-fe7f47dfc04b` → **200**

```json
{
  "id": "0859af05-109d-406b-b8b9-fe7f47dfc04b",
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
  "created_at": "2026-10-30T19:38:28.921359Z",
  "caller": {
    "name": "Caller",
    "phone": "+380670405730"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/0859af05-109d-406b-b8b9-fe7f47dfc04b/cancel` → **200**

```json
{
  "command_id": "adf5e60b-6518-4951-9bb0-391d8b481a3a",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "0859af05-109d-406b-b8b9-fe7f47dfc04b",
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
  "created_at": "2026-10-30T19:38:28.921359Z",
  "caller": {
    "name": "Caller",
    "phone": "+380670405730"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "uk": "Немає вільних авто",
      "pl": "Brak wolnych aut",
      "ru": "Нет свободных машин",
      "en": "No cars available"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

Done: call 43c98ecd-3555-4e9b-9943-c4c994e51b3e with order 0859af05-109d-406b-b8b9-fe7f47dfc04b.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-14630"
}
```

```json
{
  "challenge_id": "0605e2b3-7241-4682-9802-bf4cda54b404",
  "expires_at": "2026-10-30T19:43:30.538865419Z",
  "resend_available_at": "2026-10-30T19:38:31.538865419Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "315429",
  "sent_at": "2026-10-30T19:38:30.542351195Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0605e2b3-7241-4682-9802-bf4cda54b404",
  "code": "315429",
  "device_ref": "sandbox-14630"
}
```

```json
{
  "session_id": "9497fad9-2161-4325-9fc1-3a6e2f8afb48",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM5MDAxMCwiaWF0IjoxNzkzMzg5MTEwLCJqdGkiOiI0OGQyODFmZS0yZTdhLTQ1MWItODIzZS1lY2U0M2JkZjc4YmMiLCJzaWQiOiI5NDk3ZmFkOS0yMTYxLTQzMjUtOWZjMS0zYTZlMmY4YWZiNDgifQ.hEvglK5PxzxDS9gy7jAjzfiQc4NWMlAjZ7alXWin4rE",
  "access_expires_at": "2026-10-30T19:53:30.868110488Z",
  "refresh_token": "RIzl_0IRydR4bUvm3Z3kpGfo8jfojIqcEl4UW8h-Pns",
  "refresh_expires_at": "2026-11-29T19:38:30.867306155Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b499b322-3401-4c88-86dc-7dd7e99a894e",
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
  "last_heartbeat_at": "2026-10-30T19:38:18.096814Z",
  "last_location_at": "2026-10-30T19:38:18.096814Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b499b322-3401-4c88-86dc-7dd7e99a894e/handover` → **200**

```json
{
  "command_id": "e3808b2f-6259-49dd-aba9-25fd66538057",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b499b322-3401-4c88-86dc-7dd7e99a894e",
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
  "last_heartbeat_at": "2026-10-30T19:38:18.096814Z",
  "last_location_at": "2026-10-30T19:38:18.096814Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

(the car drives 86 s to the next point)

`POST /api/driver/v1/work-sessions/b499b322-3401-4c88-86dc-7dd7e99a894e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:39:57Z",
    "sequence": 1793389197835
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b499b322-3401-4c88-86dc-7dd7e99a894e",
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
  "last_heartbeat_at": "2026-10-30T19:39:57.853712Z",
  "last_location_at": "2026-10-30T19:39:57.853712Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380668030138",
  "device_ref": "sandbox-26658"
}
```

```json
{
  "challenge_id": "d72dc807-f014-418b-a184-9412b7696106",
  "expires_at": "2026-10-30T19:44:58.130912732Z",
  "resend_available_at": "2026-10-30T19:39:59.130912732Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380668030138` → **200**

```json
{
  "phone": "+380668030138",
  "audience": "CLIENT",
  "code": "959453",
  "sent_at": "2026-10-30T19:39:58.134249996Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d72dc807-f014-418b-a184-9412b7696106",
  "code": "959453",
  "device_ref": "sandbox-26658"
}
```

```json
{
  "session_id": "769332d2-0232-4c4f-a4c8-748932659a7b",
  "subject": {
    "type": "CLIENT",
    "id": "247379ee-de65-4cbf-89cd-982a7006c449"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNDczNzllZS1kZTY1LTRjYmYtODljZC05ODJhNzAwNmM0NDkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzkwMDk4LCJpYXQiOjE3OTMzODkxOTgsImp0aSI6IjMzZDQ1ZWM3LTk2N2EtNGQ1Ny04MjZlLTJlNzZlZWJjODkxOSIsInNpZCI6Ijc2OTMzMmQyLTAyMzItNGM0Zi1hNGM4LTc0ODkzMjY1OWE3YiJ9.iZqtP7ReoFRbF8lRfQ4BRRAMMxAV-UHzsA_oG2iw94g",
  "access_expires_at": "2026-10-30T19:54:58.45110585Z",
  "refresh_token": "qOqEt2tf3DbnoWRqSjh25Hqx6sOJov5OdU93Kpv7t34",
  "refresh_expires_at": "2026-11-29T19:39:58.450572764Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ab09ee9c-5f52-4845-a0b7-1138ffce19d9",
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
  "id": "a62169d3-2e64-4b15-a070-0657fcb18637",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T19:44:58.742757Z",
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
  "command_id": "4cd636c5-d91c-430b-b27e-98629ee608bc",
  "quote_id": "a62169d3-2e64-4b15-a070-0657fcb18637",
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
  "id": "3a53424c-1fbd-440f-8dea-e83e4e29aacd",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "247379ee-de65-4cbf-89cd-982a7006c449",
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
  "created_at": "2026-10-30T19:39:59.055818Z",
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
    "id": "0554a185-c150-4028-aceb-07e93d76d6c3",
    "order_id": "3a53424c-1fbd-440f-8dea-e83e4e29aacd",
    "expires_at": "2026-10-30T19:40:14.05923Z",
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

`POST /api/driver/v1/offers/0554a185-c150-4028-aceb-07e93d76d6c3/accept` → **200**

```json
{
  "command_id": "d0461e19-af35-4453-b6c8-3d15e1a40148"
}
```

```json
{
  "id": "c2f46ff3-f027-45e7-84ca-541bd5b5d7f0",
  "order_id": "3a53424c-1fbd-440f-8dea-e83e4e29aacd",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d582abff-ded9-46d9-982e-73035f3e2b7b",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d582abff-ded9-46d9-982e-73035f3e2b7b",
  "order_id": "3a53424c-1fbd-440f-8dea-e83e4e29aacd",
  "assignment_id": "c2f46ff3-f027-45e7-84ca-541bd5b5d7f0",
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

`POST /api/driver/v1/work-sessions/b499b322-3401-4c88-86dc-7dd7e99a894e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:40:00Z",
    "sequence": 1793389200257
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b499b322-3401-4c88-86dc-7dd7e99a894e",
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
  "last_heartbeat_at": "2026-10-30T19:40:00.275311Z",
  "last_location_at": "2026-10-30T19:40:00.275311Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/d582abff-ded9-46d9-982e-73035f3e2b7b/arrive` → **200**

```json
{
  "command_id": "656472e7-9468-49b9-a46f-75c2c919e945",
  "expected_version": 0
}
```

```json
{
  "id": "d582abff-ded9-46d9-982e-73035f3e2b7b",
  "order_id": "3a53424c-1fbd-440f-8dea-e83e4e29aacd",
  "assignment_id": "c2f46ff3-f027-45e7-84ca-541bd5b5d7f0",
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
  "arrived_at": "2026-10-30T19:40:00.574193Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/d582abff-ded9-46d9-982e-73035f3e2b7b/start` → **200**

```json
{
  "command_id": "ddebf45c-070e-4ab7-8c4b-4f2b10ed54fa",
  "expected_version": 1
}
```

```json
{
  "id": "d582abff-ded9-46d9-982e-73035f3e2b7b",
  "order_id": "3a53424c-1fbd-440f-8dea-e83e4e29aacd",
  "assignment_id": "c2f46ff3-f027-45e7-84ca-541bd5b5d7f0",
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
  "arrived_at": "2026-10-30T19:40:00.574193Z",
  "started_at": "2026-10-30T19:40:00.873689Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

(the car drives 59 s to the next point)

`POST /api/driver/v1/work-sessions/b499b322-3401-4c88-86dc-7dd7e99a894e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:41:00Z",
    "sequence": 1793389260197
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b499b322-3401-4c88-86dc-7dd7e99a894e",
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
  "last_heartbeat_at": "2026-10-30T19:41:00.21591Z",
  "last_location_at": "2026-10-30T19:41:00.21591Z",
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
  "device_ref": "sandbox-5871"
}
```

```json
{
  "challenge_id": "96bf318c-65e2-4e07-8729-c2271dc629e9",
  "expires_at": "2026-10-30T19:46:00.495527048Z",
  "resend_available_at": "2026-10-30T19:41:01.495527048Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "156567",
  "sent_at": "2026-10-30T19:41:00.498707477Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "96bf318c-65e2-4e07-8729-c2271dc629e9",
  "code": "156567",
  "device_ref": "sandbox-5871"
}
```

```json
{
  "session_id": "503ffedb-0465-468d-bd94-729b25ab28b8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM5MDE2MCwiaWF0IjoxNzkzMzg5MjYwLCJqdGkiOiIzNDBjZWJkMC0yYTBjLTRkYzAtYjUzOS01Mjc0NDY3MGVjMmQiLCJzaWQiOiI1MDNmZmVkYi0wNDY1LTQ2OGQtYmQ5NC03MjliMjVhYjI4YjgifQ.t3_dz-oZ-cb1RtTp1UCIkTd6hzr_4DCgl9wdrVd5Quw",
  "access_expires_at": "2026-10-30T19:56:00.808756065Z",
  "refresh_token": "6R0HBZfDN4X5GjxLnNtWz2eV6JWIhgtDIwib9g6xhzE",
  "refresh_expires_at": "2026-11-29T19:41:00.808194546Z",
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
  "command_id": "f131b04a-d629-41cb-82c6-24790b45a41d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:41:01Z",
    "sequence": 1793389261377
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "b1c1740b-5365-4595-83e9-843053041185",
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
  "last_heartbeat_at": "2026-10-30T19:41:01.395438Z",
  "last_location_at": "2026-10-30T19:41:01.395438Z",
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
  "session_id": "4cbbbeb9-5f34-42bb-928b-91ee1bb8555d",
  "subject": {
    "type": "STAFF",
    "id": "bbeb0bd1-546e-4687-8aa4-9df00ff27005"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYmViMGJkMS01NDZlLTQ2ODctOGFhNC05ZGYwMGZmMjcwMDUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTAxNjEsImlhdCI6MTc5MzM4OTI2MSwianRpIjoiODgxODM5OGMtOTMzOC00YzU5LWE4ZWItYTI5YmQ1OTQ1MzllIiwic2lkIjoiNGNiYmJlYjktNWYzNC00MmJiLTkyOGItOTFlZTFiYjg1NTVkIn0.HfoAurbdlZ4M4Ca_AusLbME8d99knfuLiVd4lXAjUNQ",
  "access_expires_at": "2026-10-30T19:56:01.969976488Z",
  "refresh_token": "nI5MPZN0wuy9DlN_cO-wH5gUN28k_BykI5MV3SB7WuA",
  "refresh_expires_at": "2026-10-31T07:41:01.969433853Z",
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
  "session_id": "486f9c66-fcdd-472c-aa89-8629d1f82c68",
  "subject": {
    "type": "STAFF",
    "id": "bbeb0bd1-546e-4687-8aa4-9df00ff27005"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYmViMGJkMS01NDZlLTQ2ODctOGFhNC05ZGYwMGZmMjcwMDUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTAxNjIsImlhdCI6MTc5MzM4OTI2MiwianRpIjoiNjdmZGQ0NmMtNzJlYy00MjA2LWE3ZWYtYjE1ODIxNGM4ZTllIiwic2lkIjoiNDg2ZjljNjYtZmNkZC00NzJjLWFhODktODYyOWQxZjgyYzY4In0.QhaFTd1K0U8V7I1Vn4RXCRTsPuFfm3hCTNeK3AZknvA",
  "access_expires_at": "2026-10-30T19:56:02.537837275Z",
  "refresh_token": "cAWnrfQCDz7EX1c4mXw1Lvfw8_FwtyOSJipCsWJoniM",
  "refresh_expires_at": "2026-10-31T07:41:02.537271968Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/3a53424c-1fbd-440f-8dea-e83e4e29aacd` → **200**

```json
{
  "id": "3a53424c-1fbd-440f-8dea-e83e4e29aacd",
  "short_number": 25,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "247379ee-de65-4cbf-89cd-982a7006c449",
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
    "id": "c2f46ff3-f027-45e7-84ca-541bd5b5d7f0",
    "order_id": "3a53424c-1fbd-440f-8dea-e83e4e29aacd",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "d582abff-ded9-46d9-982e-73035f3e2b7b",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-30T19:39:59.055818Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/3a53424c-1fbd-440f-8dea-e83e4e29aacd/interrupt` → **200**

```json
{
  "command_id": "ecb00d1c-e8fb-45ce-977d-051a9c7e4380",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "3a53424c-1fbd-440f-8dea-e83e4e29aacd",
    "short_number": 25,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "247379ee-de65-4cbf-89cd-982a7006c449",
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
      "id": "c2f46ff3-f027-45e7-84ca-541bd5b5d7f0",
      "order_id": "3a53424c-1fbd-440f-8dea-e83e4e29aacd",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "d582abff-ded9-46d9-982e-73035f3e2b7b",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-30T19:39:59.055818Z",
    "caller": null,
    "cancellation": {
      "by": "STAFF",
      "reason_code": "VEHICLE_BREAKDOWN",
      "reason_labels": {
        "uk": "Поломка автомобіля в дорозі",
        "pl": "Awaria auta w trasie",
        "ru": "Поломка автомобиля в пути",
        "en": "Vehicle broke down on the way"
      }
    },
    "pickup_at": null,
    "preorder": false,
    "reservation": null,
    "related_order_id": null
  },
  "follow_up": {
    "id": "1c27bfb9-5fe4-4c16-abb1-be66b3f67210",
    "short_number": 26,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "247379ee-de65-4cbf-89cd-982a7006c449",
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
    "id": "0995945e-f719-49ec-ac90-bf45335da4da",
    "order_id": "1c27bfb9-5fe4-4c16-abb1-be66b3f67210",
    "expires_at": "2026-10-30T19:41:18.129182Z",
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

`POST /api/driver/v1/offers/0995945e-f719-49ec-ac90-bf45335da4da/accept` → **200**

```json
{
  "command_id": "b0f6c058-e5c1-47de-acad-df9b4cafb196"
}
```

```json
{
  "id": "42a49d3f-7ecb-4bfc-9952-2c01136107a7",
  "order_id": "1c27bfb9-5fe4-4c16-abb1-be66b3f67210",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a2b025f0-2062-4d7d-ba5b-5e393b6c1ce0",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a2b025f0-2062-4d7d-ba5b-5e393b6c1ce0",
  "order_id": "1c27bfb9-5fe4-4c16-abb1-be66b3f67210",
  "assignment_id": "42a49d3f-7ecb-4bfc-9952-2c01136107a7",
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
  "session_id": "b1c1740b-5365-4595-83e9-843053041185",
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
  "last_heartbeat_at": "2026-10-30T19:41:01.395438Z",
  "last_location_at": "2026-10-30T19:41:01.395438Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/b1c1740b-5365-4595-83e9-843053041185/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:41:04Z",
    "sequence": 1793389264643
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "b1c1740b-5365-4595-83e9-843053041185",
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
  "last_heartbeat_at": "2026-10-30T19:41:04.661194Z",
  "last_location_at": "2026-10-30T19:41:04.661194Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/a2b025f0-2062-4d7d-ba5b-5e393b6c1ce0/arrive` → **200**

```json
{
  "command_id": "103d40f4-eede-43a2-802c-19120c55ffe0",
  "expected_version": 0
}
```

```json
{
  "id": "a2b025f0-2062-4d7d-ba5b-5e393b6c1ce0",
  "order_id": "1c27bfb9-5fe4-4c16-abb1-be66b3f67210",
  "assignment_id": "42a49d3f-7ecb-4bfc-9952-2c01136107a7",
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
  "arrived_at": "2026-10-30T19:41:04.958075Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/a2b025f0-2062-4d7d-ba5b-5e393b6c1ce0/start` → **200**

```json
{
  "command_id": "5329ed74-0829-490c-bc06-7b51f059e98d",
  "expected_version": 1
}
```

```json
{
  "id": "a2b025f0-2062-4d7d-ba5b-5e393b6c1ce0",
  "order_id": "1c27bfb9-5fe4-4c16-abb1-be66b3f67210",
  "assignment_id": "42a49d3f-7ecb-4bfc-9952-2c01136107a7",
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
  "arrived_at": "2026-10-30T19:41:04.958075Z",
  "started_at": "2026-10-30T19:41:05.254874Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/a2b025f0-2062-4d7d-ba5b-5e393b6c1ce0/complete` → **200**

```json
{
  "command_id": "e73b226a-4ea2-43df-aa1f-eb3a8f325a1e",
  "expected_version": 2,
  "reported_at": "2026-10-30T19:41:05Z"
}
```

```json
{
  "id": "a2b025f0-2062-4d7d-ba5b-5e393b6c1ce0",
  "order_id": "1c27bfb9-5fe4-4c16-abb1-be66b3f67210",
  "assignment_id": "42a49d3f-7ecb-4bfc-9952-2c01136107a7",
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
  "arrived_at": "2026-10-30T19:41:04.958075Z",
  "started_at": "2026-10-30T19:41:05.254874Z",
  "completed_at": "2026-10-30T19:41:05.555255Z",
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
      "id": "1c27bfb9-5fe4-4c16-abb1-be66b3f67210",
      "short_number": 26,
      "status": "FULFILLED",
      "created_at": "2026-10-30T19:41:03.119802Z",
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
      "id": "3a53424c-1fbd-440f-8dea-e83e4e29aacd",
      "short_number": 25,
      "status": "CANCELLED",
      "created_at": "2026-10-30T19:39:59.055818Z",
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
          "uk": "Поломка автомобіля в дорозі",
          "pl": "Awaria auta w trasie",
          "ru": "Поломка автомобиля в пути",
          "en": "Vehicle broke down on the way"
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

`GET /api/operator/v1/orders/3a53424c-1fbd-440f-8dea-e83e4e29aacd/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T19:39:59.05639Z",
      "actor": {
        "type": "CLIENT",
        "id": "247379ee-de65-4cbf-89cd-982a7006c449",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "3a53424c-1fbd-440f-8dea-e83e4e29aacd",
        "quote_id": "a62169d3-2e64-4b15-a070-0657fcb18637",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "8fc648ac-eee9-432b-8e49-f9e8b7e6854e"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T19:39:59.058448Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "3a53424c-1fbd-440f-8dea-e83e4e29aacd",
        "attempt_id": "a7888508-7772-4963-a17b-9490436f5345",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "8fc648ac-eee9-432b-8e49-f9e8b7e6854e"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T19:39:59.081989Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "0554a185-c150-4028-aceb-07e93d76d6c3",
        "order_id": "3a53424c-1fbd-440f-8dea-e83e4e29aacd",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "8fc648ac-eee9-432b-8e49-f9e8b7e6854e"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T19:39:59.6742Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "0554a185-c150-4028-aceb-07e93d76d6c3",
        "order_id": "3a53424c-1fbd-440f-8dea-e83e4e29aacd",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "c2f46ff3-f027-45e7-84ca-541bd5b5d7f0"
      },
      "correlation_id": "779b0580-345e-47f0-8755-6ed8fcc1a126"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/1c27bfb9-5fe4-4c16-abb1-be66b3f67210/tip` → **200**

```json
{
  "order_id": "1c27bfb9-5fe4-4c16-abb1-be66b3f67210",
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
  "available_until": "2026-10-31T19:41:05.555255Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/1c27bfb9-5fe4-4c16-abb1-be66b3f67210/tip` → **409**

```json
{
  "command_id": "3ccedb26-6ea0-4b9a-adc6-96602957a1a6",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/1c27bfb9-5fe4-4c16-abb1-be66b3f67210/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "9f3eb3f0-2eaa-4458-beaa-d9628a1003e5"
}
```

Done: interrupted 3a53424c-1fbd-440f-8dea-e83e4e29aacd, follow-up 1c27bfb9-5fe4-4c16-abb1-be66b3f67210.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b499b322-3401-4c88-86dc-7dd7e99a894e",
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
  "last_heartbeat_at": "2026-10-30T19:41:00.21591Z",
  "last_location_at": "2026-10-30T19:41:00.21591Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b499b322-3401-4c88-86dc-7dd7e99a894e/close` → **200**

```json
{
  "command_id": "39d88d48-3e7f-46eb-ba8a-7720941ba5c5",
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
  "session_id": "b1c1740b-5365-4595-83e9-843053041185",
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
  "last_heartbeat_at": "2026-10-30T19:41:04.661194Z",
  "last_location_at": "2026-10-30T19:41:04.661194Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b1c1740b-5365-4595-83e9-843053041185/close` → **200**

```json
{
  "command_id": "5855a506-d006-488f-b6cf-3a853807e7f0",
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
  "session_id": "821f8506-ad66-4940-a720-6317ff969f62",
  "subject": {
    "type": "STAFF",
    "id": "bbeb0bd1-546e-4687-8aa4-9df00ff27005"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYmViMGJkMS01NDZlLTQ2ODctOGFhNC05ZGYwMGZmMjcwMDUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTAxNzEsImlhdCI6MTc5MzM4OTI3MSwianRpIjoiZWJjZTIxYTktOTQ2Yy00YTI2LWI2MzQtNjM4Zjg2OWIyYWNiIiwic2lkIjoiODIxZjg1MDYtYWQ2Ni00OTQwLWE3MjAtNjMxN2ZmOTY5ZjYyIn0.xjMIBfqwQPW8uB3S2ISup6xqQapZ4C1gz9NnjWU9YYY",
  "access_expires_at": "2026-10-30T19:56:11.775243455Z",
  "refresh_token": "Z1ir3QHZIQLuC-PfB2W-m1urpHFdBtggWRHhHlURwps",
  "refresh_expires_at": "2026-10-31T07:41:11.774685997Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "c6da7265-d29d-4afd-91b8-460c69496b44",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T19:41:12Z"
}
```

```json
{
  "id": "b5e3ea58-0133-46ef-9ea7-51ff5828491c",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T19:41:12Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/b5e3ea58-0133-46ef-9ea7-51ff5828491c/publish` → **200**

```json
{
  "command_id": "e617cf2e-a96a-4333-86b0-57370bb6cf58",
  "expected_version": 0
}
```

```json
{
  "id": "b5e3ea58-0133-46ef-9ea7-51ff5828491c",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T19:41:12.372583Z",
  "published_at": "2026-10-30T19:41:12.372583Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "b5e3ea58-0133-46ef-9ea7-51ff5828491c",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-30T19:41:12.372583Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630229410",
  "device_ref": "sandbox-17094"
}
```

```json
{
  "challenge_id": "eaf11745-a601-4ced-b997-b86aa31075af",
  "expires_at": "2026-10-30T19:46:12.938139672Z",
  "resend_available_at": "2026-10-30T19:41:13.938139672Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380630229410` → **200**

```json
{
  "phone": "+380630229410",
  "audience": "CLIENT",
  "code": "015429",
  "sent_at": "2026-10-30T19:41:12.940750206Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "eaf11745-a601-4ced-b997-b86aa31075af",
  "code": "015429",
  "device_ref": "sandbox-17094"
}
```

```json
{
  "session_id": "4ee1e998-4af5-4df7-8b2f-6f5f7e6ea095",
  "subject": {
    "type": "CLIENT",
    "id": "4c0dfc49-13a1-4a17-986a-323bf53ee8cf"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YzBkZmM0OS0xM2ExLTRhMTctOTg2YS0zMjNiZjUzZWU4Y2YiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzkwMTczLCJpYXQiOjE3OTMzODkyNzMsImp0aSI6IjBhNWYwODcwLWY4M2ItNDk2NS04MzFiLTVlNzMyMDE0Y2E0YyIsInNpZCI6IjRlZTFlOTk4LTRhZjUtNGRmNy04YjJmLTZmNWY3ZTZlYTA5NSJ9.VYKOC18IHEGccutzT-dMlzTAzWZ8sIY7stYzEjklO6U",
  "access_expires_at": "2026-10-30T19:56:13.249801345Z",
  "refresh_token": "OV7Txa2Ja83qO02yot-TdyVApRFPazExYHzMDWeP-RY",
  "refresh_expires_at": "2026-11-29T19:41:13.249213316Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "b5e3ea58-0133-46ef-9ea7-51ff5828491c",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-30T19:41:12.372583Z",
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
  "command_id": "b3ad8abc-f03d-4415-a608-a148d063c0fd",
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
  "id": "108de43d-6d4b-4e98-9bf0-06bf4fcbf941",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T19:46:13.815614Z",
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
  "command_id": "ec25f509-7fc7-44ee-9bae-b52aa322db87",
  "quote_id": "108de43d-6d4b-4e98-9bf0-06bf4fcbf941",
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
  "correlation_id": "e51c55b6-bc22-4f19-a65f-017ff4b52e6d"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "85c83ef7-4343-4ad1-8616-a253c2dfcdcb",
  "version_id": "b5e3ea58-0133-46ef-9ea7-51ff5828491c",
  "language": "uk"
}
```

```json
{
  "version_id": "b5e3ea58-0133-46ef-9ea7-51ff5828491c",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-30T19:41:14.412695Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "dbe8ab4a-df38-441f-a12c-0ee25fcf470d",
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
  "id": "9139932d-15f8-45df-8dd9-2edcc280e23b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T19:46:14.700248Z",
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
  "command_id": "82f90f28-e55b-4c40-8b5e-98af78fe06fc",
  "quote_id": "9139932d-15f8-45df-8dd9-2edcc280e23b",
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
  "id": "7aa52950-b445-4c58-95fd-5753684cd100",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4c0dfc49-13a1-4a17-986a-323bf53ee8cf",
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
  "created_at": "2026-10-30T19:41:15.020526Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/7aa52950-b445-4c58-95fd-5753684cd100` → **200**

```json
{
  "id": "7aa52950-b445-4c58-95fd-5753684cd100",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4c0dfc49-13a1-4a17-986a-323bf53ee8cf",
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
  "created_at": "2026-10-30T19:41:15.020526Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/7aa52950-b445-4c58-95fd-5753684cd100/cancel` → **200**

```json
{
  "command_id": "9499145d-05fc-44de-a9c6-8207d5e40565",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "7aa52950-b445-4c58-95fd-5753684cd100",
  "short_number": 27,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "4c0dfc49-13a1-4a17-986a-323bf53ee8cf",
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
  "created_at": "2026-10-30T19:41:15.020526Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "uk": "Передумав їхати",
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
      "en": "Changed my mind"
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

`POST /api/admin/v1/legal-documents/b5e3ea58-0133-46ef-9ea7-51ff5828491c` → **409**

```json
{
  "command_id": "867a0224-7e95-42c4-b48f-98ae51f97aea",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T19:41:15Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/b5e3ea58-0133-46ef-9ea7-51ff5828491c",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "8d917686-4524-425e-9ed4-763bc0d9956f"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "da33549c-4e38-494e-ac4c-fae5746fe345",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T19:41:16Z"
}
```

```json
{
  "id": "10292654-7d42-460b-96c7-172fca712c66",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T19:41:16Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/10292654-7d42-460b-96c7-172fca712c66/publish` → **200**

```json
{
  "command_id": "07aaba70-b87e-48d7-9127-601d0f378990",
  "expected_version": 0
}
```

```json
{
  "id": "10292654-7d42-460b-96c7-172fca712c66",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T19:41:16.522795Z",
  "published_at": "2026-10-30T19:41:16.522795Z",
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
  "device_ref": "sandbox-26442"
}
```

```json
{
  "challenge_id": "5a9473ab-0cbb-488b-96b5-1314a21c34bf",
  "expires_at": "2026-10-30T19:46:16.81058078Z",
  "resend_available_at": "2026-10-30T19:41:17.81058078Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "845760",
  "sent_at": "2026-10-30T19:41:16.813611488Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5a9473ab-0cbb-488b-96b5-1314a21c34bf",
  "code": "845760",
  "device_ref": "sandbox-26442"
}
```

```json
{
  "session_id": "de772551-4848-4f3a-8654-4f03fb0f7afb",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM5MDE3NywiaWF0IjoxNzkzMzg5Mjc3LCJqdGkiOiI3Yzc2MGY4Ni01YjY5LTRlN2QtYmM0Zi0yZWYwMWYwMGEzOTEiLCJzaWQiOiJkZTc3MjU1MS00ODQ4LTRmM2EtODY1NC00ZjAzZmIwZjdhZmIifQ.V23GNNt-xFizYr6SCQ22784sgjRMznWFsflXhDM7DWs",
  "access_expires_at": "2026-10-30T19:56:17.129703317Z",
  "refresh_token": "QCrmBIm8pqyph8N7btsJXfQsKAltiuPLG_IEISaUGKc",
  "refresh_expires_at": "2026-11-29T19:41:17.129175028Z",
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
  "command_id": "a7241a8f-9657-4f41-8e83-d3dbcc3e97c3",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:42:28Z",
    "sequence": 1793389348705
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "0faf7d3f-cce5-455c-9d20-253d432c97ee",
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
  "last_heartbeat_at": "2026-10-30T19:42:28.723657Z",
  "last_location_at": "2026-10-30T19:42:28.723657Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676361267",
  "device_ref": "sandbox-12853"
}
```

```json
{
  "challenge_id": "b8a63d96-ef1e-40ba-9374-8bbdd48d4510",
  "expires_at": "2026-10-30T19:47:29.015778605Z",
  "resend_available_at": "2026-10-30T19:42:30.015778605Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380676361267` → **200**

```json
{
  "phone": "+380676361267",
  "audience": "CLIENT",
  "code": "570216",
  "sent_at": "2026-10-30T19:42:29.01858255Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b8a63d96-ef1e-40ba-9374-8bbdd48d4510",
  "code": "570216",
  "device_ref": "sandbox-12853"
}
```

```json
{
  "session_id": "b8a60223-53ae-4256-8978-f63f17a589d6",
  "subject": {
    "type": "CLIENT",
    "id": "b250fcfa-a67a-46be-bebd-494b9146f3fd"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMjUwZmNmYS1hNjdhLTQ2YmUtYmViZC00OTRiOTE0NmYzZmQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzkwMjQ5LCJpYXQiOjE3OTMzODkzNDksImp0aSI6ImU1MDI1NmRmLTQ1YjMtNGYyOC04M2NmLTcxYWY0NDJhMDBmNSIsInNpZCI6ImI4YTYwMjIzLTUzYWUtNDI1Ni04OTc4LWY2M2YxN2E1ODlkNiJ9.1pqi2JXUatpyv2vJ0UVK1OskZIYVLNcYN7mhWv0VIo4",
  "access_expires_at": "2026-10-30T19:57:29.327149259Z",
  "refresh_token": "Gihq-26UvWB6cbgOXNKp0M2v1ia70ylVZkMmWURHSbE",
  "refresh_expires_at": "2026-11-29T19:42:29.326609343Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d834e1c1-134e-4111-9ab3-ac034c2f96df",
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
  "id": "27cd4999-7b87-400d-8bdd-43389d62fc70",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T19:47:29.616009Z",
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
  "command_id": "05083fc8-7ade-4091-80db-bb9adde2b496",
  "quote_id": "27cd4999-7b87-400d-8bdd-43389d62fc70",
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
    "phone": "+380678012568"
  }
}
```

```json
{
  "id": "0beaa88a-e97f-40ae-9742-6d78d5b632fd",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b250fcfa-a67a-46be-bebd-494b9146f3fd",
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
  "created_at": "2026-10-30T19:42:29.927772Z",
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
    "id": "de171559-e88e-45a3-9720-2e2691c7bc8f",
    "order_id": "0beaa88a-e97f-40ae-9742-6d78d5b632fd",
    "expires_at": "2026-10-30T19:42:44.931028Z",
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

`POST /api/driver/v1/offers/de171559-e88e-45a3-9720-2e2691c7bc8f/accept` → **200**

```json
{
  "command_id": "e2e33e87-3fc1-4e3c-85f2-84c139fde111"
}
```

```json
{
  "id": "1d9537d1-7681-4434-a237-e5cfc6696d7b",
  "order_id": "0beaa88a-e97f-40ae-9742-6d78d5b632fd",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a6d5834f-5ef2-4205-bb39-91f9d21514cc",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a6d5834f-5ef2-4205-bb39-91f9d21514cc",
  "order_id": "0beaa88a-e97f-40ae-9742-6d78d5b632fd",
  "assignment_id": "1d9537d1-7681-4434-a237-e5cfc6696d7b",
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
    "phone": "+380678012568"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "82119c6a-e080-4632-ab06-6fe0f0d77407",
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
  "id": "670b8c76-eeec-4709-ad6a-274152a9b3f8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T19:47:31.144216Z",
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
  "command_id": "aae110db-0b41-4c22-99f9-88c18dd14390",
  "quote_id": "670b8c76-eeec-4709-ad6a-274152a9b3f8",
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
  "id": "32533ae1-2c2b-4caa-ab5d-0c74ad7b04c5",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b250fcfa-a67a-46be-bebd-494b9146f3fd",
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
  "created_at": "2026-10-30T19:42:31.43781Z",
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
  "command_id": "1fb3e059-ee4d-4f87-b6f0-ec58a21b8002",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-30T22:42:31Z"
}
```

```json
{
  "id": "eeb7f149-e4e6-454e-ac43-7ffb1b5852ea",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T19:47:31.768419Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-30T22:42:31Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "71c3979e-9d40-44a5-ab25-11d4228097a6",
  "quote_id": "eeb7f149-e4e6-454e-ac43-7ffb1b5852ea",
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
  "pickup_at": "2026-10-30T22:42:31Z"
}
```

```json
{
  "id": "72426f4e-ec71-4d92-813a-52a5ee4b0155",
  "short_number": 30,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "b250fcfa-a67a-46be-bebd-494b9146f3fd",
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
  "created_at": "2026-10-30T19:42:32.067066Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T22:42:31Z",
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
  "command_id": "3eb09769-7708-4a64-9549-fd3c47f9fa3c",
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
  "id": "c0f3503a-fc16-4091-b2ab-bb6d5062d7d7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T19:47:32.384764Z",
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
  "command_id": "1b3ef088-a029-4166-bb91-f0293d5a1fec",
  "quote_id": "c0f3503a-fc16-4091-b2ab-bb6d5062d7d7",
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
  "correlation_id": "3a5a1116-308d-497f-9a52-5058cbede465"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "72426f4e-ec71-4d92-813a-52a5ee4b0155",
      "short_number": 30,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "b250fcfa-a67a-46be-bebd-494b9146f3fd",
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
      "created_at": "2026-10-30T19:42:32.067066Z",
      "cancellation": null,
      "pickup_at": "2026-10-30T22:42:31Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "32533ae1-2c2b-4caa-ab5d-0c74ad7b04c5",
      "short_number": 29,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "b250fcfa-a67a-46be-bebd-494b9146f3fd",
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
      "created_at": "2026-10-30T19:42:31.43781Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "0beaa88a-e97f-40ae-9742-6d78d5b632fd",
      "short_number": 28,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "32533ae1-2c2b-4caa-ab5d-0c74ad7b04c5",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b250fcfa-a67a-46be-bebd-494b9146f3fd",
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
  "created_at": "2026-10-30T19:42:31.43781Z",
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

`GET /api/rider/v1/orders/0beaa88a-e97f-40ae-9742-6d78d5b632fd` → **200**

```json
{
  "id": "0beaa88a-e97f-40ae-9742-6d78d5b632fd",
  "short_number": 28,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "b250fcfa-a67a-46be-bebd-494b9146f3fd",
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
    "id": "1d9537d1-7681-4434-a237-e5cfc6696d7b",
    "order_id": "0beaa88a-e97f-40ae-9742-6d78d5b632fd",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "a6d5834f-5ef2-4205-bb39-91f9d21514cc",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T19:42:29.927772Z",
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
    "location_at": "2026-10-30T19:42:28.723657Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/0beaa88a-e97f-40ae-9742-6d78d5b632fd/cancel` → **200**

```json
{
  "command_id": "3338d434-fe2c-4cd3-9e08-553eed8900a2",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "0beaa88a-e97f-40ae-9742-6d78d5b632fd",
  "short_number": 28,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "b250fcfa-a67a-46be-bebd-494b9146f3fd",
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
    "id": "1d9537d1-7681-4434-a237-e5cfc6696d7b",
    "order_id": "0beaa88a-e97f-40ae-9742-6d78d5b632fd",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "a6d5834f-5ef2-4205-bb39-91f9d21514cc",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T19:42:29.927772Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "uk": "Передумав їхати",
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
      "en": "Changed my mind"
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

`GET /api/rider/v1/orders/32533ae1-2c2b-4caa-ab5d-0c74ad7b04c5` → **200**

```json
{
  "id": "32533ae1-2c2b-4caa-ab5d-0c74ad7b04c5",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b250fcfa-a67a-46be-bebd-494b9146f3fd",
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
  "created_at": "2026-10-30T19:42:31.43781Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/32533ae1-2c2b-4caa-ab5d-0c74ad7b04c5/cancel` → **200**

```json
{
  "command_id": "eec31a37-91bd-42ec-bbbb-b79dcf90c5a3",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "32533ae1-2c2b-4caa-ab5d-0c74ad7b04c5",
  "short_number": 29,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "b250fcfa-a67a-46be-bebd-494b9146f3fd",
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
  "created_at": "2026-10-30T19:42:31.43781Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "uk": "Передумав їхати",
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
      "en": "Changed my mind"
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

`GET /api/rider/v1/orders/72426f4e-ec71-4d92-813a-52a5ee4b0155` → **200**

```json
{
  "id": "72426f4e-ec71-4d92-813a-52a5ee4b0155",
  "short_number": 30,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "b250fcfa-a67a-46be-bebd-494b9146f3fd",
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
  "created_at": "2026-10-30T19:42:32.067066Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T22:42:31Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/72426f4e-ec71-4d92-813a-52a5ee4b0155/cancel` → **200**

```json
{
  "command_id": "a2518a4d-6cce-4ba4-bc5b-a0135ebcd463",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "72426f4e-ec71-4d92-813a-52a5ee4b0155",
  "short_number": 30,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "b250fcfa-a67a-46be-bebd-494b9146f3fd",
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
  "created_at": "2026-10-30T19:42:32.067066Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "uk": "Передумав їхати",
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
      "en": "Changed my mind"
    }
  },
  "pickup_at": "2026-10-30T22:42:31Z",
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
  "session_id": "0faf7d3f-cce5-455c-9d20-253d432c97ee",
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
  "last_heartbeat_at": "2026-10-30T19:42:28.723657Z",
  "last_location_at": "2026-10-30T19:42:28.723657Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/0faf7d3f-cce5-455c-9d20-253d432c97ee/close` → **200**

```json
{
  "command_id": "bbed14be-5f41-4358-98bd-abc8428f86b4",
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

Done: orders 0beaa88a-e97f-40ae-9742-6d78d5b632fd, 32533ae1-2c2b-4caa-ab5d-0c74ad7b04c5, 72426f4e-ec71-4d92-813a-52a5ee4b0155.

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
  "session_id": "77d4bfa1-df42-4129-a6dc-d7222c4bf591",
  "subject": {
    "type": "STAFF",
    "id": "bbeb0bd1-546e-4687-8aa4-9df00ff27005"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYmViMGJkMS01NDZlLTQ2ODctOGFhNC05ZGYwMGZmMjcwMDUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTAyNTYsImlhdCI6MTc5MzM4OTM1NiwianRpIjoiYTY2MjI2NDMtMWY2Mi00ZjhhLTkyN2MtNjk4ZmUwNDJhYzM2Iiwic2lkIjoiNzdkNGJmYTEtZGY0Mi00MTI5LWE2ZGMtZDcyMjJjNGJmNTkxIn0.f-0NV68I9nmIDT4x4fzw4nPoTcSOuCJnUJf-ra4SJ-8",
  "access_expires_at": "2026-10-30T19:57:36.418435862Z",
  "refresh_token": "718cOFfLunmrAqy0gvtY_2jnfltwYoEcBJo0h0Sl36w",
  "refresh_expires_at": "2026-10-31T07:42:36.417895447Z",
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
  "session_id": "9f08495d-4a13-455e-94dd-efe4e8683be7",
  "subject": {
    "type": "STAFF",
    "id": "bbeb0bd1-546e-4687-8aa4-9df00ff27005"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYmViMGJkMS01NDZlLTQ2ODctOGFhNC05ZGYwMGZmMjcwMDUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTAyNTYsImlhdCI6MTc5MzM4OTM1NiwianRpIjoiYzdhYmIyMTctNzgyZC00NzU2LWE1MDItYTA3NzU3MmYxZGZmIiwic2lkIjoiOWYwODQ5NWQtNGExMy00NTVlLTk0ZGQtZWZlNGU4NjgzYmU3In0.GVUc22d24hRrtHJwNcdgvsy5YN1tJpfyIAzRSgqewuU",
  "access_expires_at": "2026-10-30T19:57:36.99097966Z",
  "refresh_token": "1ZV59dBjTgglF83ejLt84vK4E4GGIcsPHoA4PWXFHbI",
  "refresh_expires_at": "2026-10-31T07:42:36.989968246Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-14010"
}
```

```json
{
  "challenge_id": "595c82aa-c5cf-4e3e-a572-f92ea6348ceb",
  "expires_at": "2026-10-30T19:47:37.262006584Z",
  "resend_available_at": "2026-10-30T19:42:38.262006584Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "904752",
  "sent_at": "2026-10-30T19:42:37.264436992Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "595c82aa-c5cf-4e3e-a572-f92ea6348ceb",
  "code": "904752",
  "device_ref": "sandbox-14010"
}
```

```json
{
  "session_id": "62707cc9-ace8-4071-8cce-43bdb7a8a7d5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM5MDI1NywiaWF0IjoxNzkzMzg5MzU3LCJqdGkiOiJhYTk1M2VkYi1mNjk1LTQwZjYtODRiZC0zN2M4NDc3ZGUwYjgiLCJzaWQiOiI2MjcwN2NjOS1hY2U4LTQwNzEtOGNjZS00M2JkYjdhOGE3ZDUifQ.4g66PwmzHG8qTc5O7NZGWY8rK853Dbp-ccfiM_He3_o",
  "access_expires_at": "2026-10-30T19:57:37.570137712Z",
  "refresh_token": "kLOh_p490eKBMF9YeI0LQeeet2sqBXswxwm0PNvneto",
  "refresh_expires_at": "2026-11-29T19:42:37.569634832Z",
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
  "command_id": "94a9f22e-c186-47e7-9ab2-b520dedbef63",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:42:38Z",
    "sequence": 1793389358157
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e72f19f5-eaf5-468c-acd2-069579e046c3",
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
  "last_heartbeat_at": "2026-10-30T19:42:38.176446Z",
  "last_location_at": "2026-10-30T19:42:38.176446Z",
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
  "command_id": "cabf06d5-cb35-454b-a3dc-4894d9958741",
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
  "effective_at": "2026-10-30T19:42:38.77039Z",
  "changed_by": "bbeb0bd1-546e-4687-8aa4-9df00ff27005",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "bbeb0bd1-546e-4687-8aa4-9df00ff27005",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-30T19:29:43.90737Z",
  "last_entries": [
    {
      "order_id": "79dff704-8e29-4fa3-91e6-51a4bdee200b",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T19:29:43.90737Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "4996894b-5f9e-49c4-aab9-32e119de2336",
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
  "id": "45fe24e4-86aa-44fd-bb20-3ec57bf835f6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T19:47:39.351330Z",
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
  "command_id": "18f06a0b-6c2d-4a58-9abd-ee05ed6e7890",
  "quote_id": "45fe24e4-86aa-44fd-bb20-3ec57bf835f6",
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
    "phone": "+380671118349"
  }
}
```

```json
{
  "id": "0faca1f7-4be7-4780-bb54-8d95434f8a38",
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
  "created_at": "2026-10-30T19:42:39.643525Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671118349"
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
    "id": "6a9532fa-8b25-471a-a3d9-a0eefe3c03ce",
    "order_id": "0faca1f7-4be7-4780-bb54-8d95434f8a38",
    "expires_at": "2026-10-30T19:42:54.648499Z",
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

`POST /api/driver/v1/offers/6a9532fa-8b25-471a-a3d9-a0eefe3c03ce/accept` → **200**

```json
{
  "command_id": "64f2a99d-57a5-4f8f-8f67-fb570b266df1"
}
```

```json
{
  "id": "76a1e5e6-bd15-402c-9d97-9c164a4e8462",
  "order_id": "0faca1f7-4be7-4780-bb54-8d95434f8a38",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a3e5d7b5-d328-4cf2-aa97-a5aa5dddd021",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a3e5d7b5-d328-4cf2-aa97-a5aa5dddd021",
  "order_id": "0faca1f7-4be7-4780-bb54-8d95434f8a38",
  "assignment_id": "76a1e5e6-bd15-402c-9d97-9c164a4e8462",
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
    "phone": "+380671118349"
  }
}
```

`POST /api/driver/v1/work-sessions/e72f19f5-eaf5-468c-acd2-069579e046c3/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:42:40Z",
    "sequence": 1793389360836
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e72f19f5-eaf5-468c-acd2-069579e046c3",
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
  "last_heartbeat_at": "2026-10-30T19:42:40.85356Z",
  "last_location_at": "2026-10-30T19:42:40.85356Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/a3e5d7b5-d328-4cf2-aa97-a5aa5dddd021/arrive` → **200**

```json
{
  "command_id": "cf21c214-8145-496e-9810-9a0409695d91",
  "expected_version": 0
}
```

```json
{
  "id": "a3e5d7b5-d328-4cf2-aa97-a5aa5dddd021",
  "order_id": "0faca1f7-4be7-4780-bb54-8d95434f8a38",
  "assignment_id": "76a1e5e6-bd15-402c-9d97-9c164a4e8462",
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
  "arrived_at": "2026-10-30T19:42:41.163794Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671118349"
  }
}
```

`POST /api/driver/v1/trips/a3e5d7b5-d328-4cf2-aa97-a5aa5dddd021/start` → **200**

```json
{
  "command_id": "f1f9bade-f8f1-4ff9-b6b9-0b34de2638eb",
  "expected_version": 1
}
```

```json
{
  "id": "a3e5d7b5-d328-4cf2-aa97-a5aa5dddd021",
  "order_id": "0faca1f7-4be7-4780-bb54-8d95434f8a38",
  "assignment_id": "76a1e5e6-bd15-402c-9d97-9c164a4e8462",
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
  "arrived_at": "2026-10-30T19:42:41.163794Z",
  "started_at": "2026-10-30T19:42:41.461542Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671118349"
  }
}
```

`POST /api/driver/v1/trips/a3e5d7b5-d328-4cf2-aa97-a5aa5dddd021/complete` → **200**

```json
{
  "command_id": "83747b2b-8cc8-4caf-a928-45ee2362a826",
  "expected_version": 2,
  "reported_at": "2026-10-30T19:42:41Z",
  "cash_received": true
}
```

```json
{
  "id": "a3e5d7b5-d328-4cf2-aa97-a5aa5dddd021",
  "order_id": "0faca1f7-4be7-4780-bb54-8d95434f8a38",
  "assignment_id": "76a1e5e6-bd15-402c-9d97-9c164a4e8462",
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
  "arrived_at": "2026-10-30T19:42:41.163794Z",
  "started_at": "2026-10-30T19:42:41.461542Z",
  "completed_at": "2026-10-30T19:42:41.757931Z",
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
  "command_id": "19cd576d-01f5-49ab-955c-f4bdd3140fbb",
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
  "id": "1dc48069-e9da-4d46-9a22-de7ce124df2c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T19:47:42.061274Z",
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
  "command_id": "4f186801-3780-434a-a5b1-949f2810215a",
  "quote_id": "1dc48069-e9da-4d46-9a22-de7ce124df2c",
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
    "phone": "+3806711113843"
  }
}
```

```json
{
  "id": "b7dc5fe5-2856-4f7a-ab88-ed439a485e2d",
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
  "created_at": "2026-10-30T19:42:42.357631Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711113843"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/b7dc5fe5-2856-4f7a-ab88-ed439a485e2d` → **200**

```json
{
  "id": "b7dc5fe5-2856-4f7a-ab88-ed439a485e2d",
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
  "created_at": "2026-10-30T19:42:42.357631Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711113843"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/b7dc5fe5-2856-4f7a-ab88-ed439a485e2d/cancel` → **200**

```json
{
  "command_id": "c4cf86e6-1e56-4dd7-959b-cc8bcafc587b",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "b7dc5fe5-2856-4f7a-ab88-ed439a485e2d",
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
  "created_at": "2026-10-30T19:42:42.357631Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711113843"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "OPERATOR_ERROR",
    "reason_labels": {
      "uk": "Помилка оператора",
      "pl": "Błąd operatora",
      "ru": "Ошибка оператора",
      "en": "Operator error"
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
  "staff_id": "bbeb0bd1-546e-4687-8aa4-9df00ff27005",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-30T19:29:43.90737Z",
  "last_entries": [
    {
      "order_id": "b7dc5fe5-2856-4f7a-ab88-ed439a485e2d",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-30T19:42:42.999333Z"
    },
    {
      "order_id": "0faca1f7-4be7-4780-bb54-8d95434f8a38",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-30T19:42:41.763644Z"
    },
    {
      "order_id": "79dff704-8e29-4fa3-91e6-51a4bdee200b",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T19:29:43.90737Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e72f19f5-eaf5-468c-acd2-069579e046c3",
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
  "last_heartbeat_at": "2026-10-30T19:42:40.85356Z",
  "last_location_at": "2026-10-30T19:42:40.85356Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e72f19f5-eaf5-468c-acd2-069579e046c3/close` → **200**

```json
{
  "command_id": "68de1c88-f764-451a-b553-76acea140ac7",
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

Done: operator bonus for fulfilled 0faca1f7-4be7-4780-bb54-8d95434f8a38 and operator-fault cancellation b7dc5fe5-2856-4f7a-ab88-ed439a485e2d.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672336654",
  "device_ref": "sandbox-22424"
}
```

```json
{
  "challenge_id": "61f20381-855c-4c4c-ae57-25bbaa5ac0d2",
  "expires_at": "2026-10-30T19:47:47.404547725Z",
  "resend_available_at": "2026-10-30T19:42:48.404547725Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380672336654` → **200**

```json
{
  "phone": "+380672336654",
  "audience": "CLIENT",
  "code": "588639",
  "sent_at": "2026-10-30T19:42:47.408632006Z",
  "channel": "SMS"
}
```

## "Call me instead" on the first try still gets an SMS; the resend is a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677351730",
  "device_ref": "sandbox-24117",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "9d433df9-399b-4c8b-9512-d7a45052f496",
  "expires_at": "2026-10-30T19:47:48.917011562Z",
  "resend_available_at": "2026-10-30T19:42:49.917011562Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380677351730` → **200**

```json
{
  "phone": "+380677351730",
  "audience": "CLIENT",
  "code": "577143",
  "sent_at": "2026-10-30T19:42:48.919546362Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677351730",
  "device_ref": "sandbox-18883",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "818af821-1543-446e-9731-ae5abc1e4c5c",
  "expires_at": "2026-10-30T19:47:50.429418097Z",
  "resend_available_at": "2026-10-30T19:42:51.429418097Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380677351730` → **200**

```json
{
  "phone": "+380677351730",
  "audience": "CLIENT",
  "code": "183642",
  "sent_at": "2026-10-30T19:42:50.431993605Z",
  "channel": "VOICE"
}
```

## The SMS does not get through: one request, one attempt; the resend comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678830000",
  "device_ref": "sandbox-32334"
}
```

```json
{
  "challenge_id": "c3e62802-e7e4-4d88-b27c-0bf40c12c1be",
  "expires_at": "2026-10-30T19:47:51.942646048Z",
  "resend_available_at": "2026-10-30T19:42:52.942646048Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678830000",
  "device_ref": "sandbox-175"
}
```

```json
{
  "challenge_id": "97c68e44-7c7b-4e50-b0b0-bb232b57918d",
  "expires_at": "2026-10-30T19:47:53.429134978Z",
  "resend_available_at": "2026-10-30T19:42:54.429134978Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380678830000` → **200**

```json
{
  "phone": "+380678830000",
  "audience": "CLIENT",
  "code": "110165",
  "sent_at": "2026-10-30T19:42:53.431990397Z",
  "channel": "VOICE"
}
```

## A second call in the hour is made, the third is refused

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678830000",
  "device_ref": "sandbox-26920",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "6d962a75-471c-47d6-ab67-bdbf7f3334f5",
  "expires_at": "2026-10-30T19:47:54.939940529Z",
  "resend_available_at": "2026-10-30T19:42:55.939940529Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380678830000` → **200**

```json
{
  "phone": "+380678830000",
  "audience": "CLIENT",
  "code": "855366",
  "sent_at": "2026-10-30T19:42:54.94266283Z",
  "channel": "VOICE"
}
```

`POST /auth/v1/otp/challenges` → **429**

```json
{
  "audience": "CLIENT",
  "phone": "+380678830000",
  "device_ref": "sandbox-13652",
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
  "correlation_id": "8b4b5fb9-3074-4efc-8476-a563483c94b9",
  "retryable": true,
  "retry_after_seconds": 3600
}
```

## Numbers outside Poland and Ukraine get nothing

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+442000012724"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "cd06dd80-59ca-48ac-a195-9aebbc0fca44"
}
```

`GET /sandbox/v1/otp?phone=%2B442000012724` → **404**

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+37120005766"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "adc9afcb-2c4a-4392-b3b1-89c160cf4c61"
}
```

`GET /sandbox/v1/otp?phone=%2B37120005766` → **404**

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
  "session_id": "fb1864ef-0ebd-4709-af2c-6b2ac87e5665",
  "subject": {
    "type": "STAFF",
    "id": "bbeb0bd1-546e-4687-8aa4-9df00ff27005"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYmViMGJkMS01NDZlLTQ2ODctOGFhNC05ZGYwMGZmMjcwMDUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTAyNzcsImlhdCI6MTc5MzM4OTM3NywianRpIjoiZjBmNGJkMDctMGVhMS00ZGU0LWIzOTYtODc0NjdiNzM2YzdlIiwic2lkIjoiZmIxODY0ZWYtMGViZC00NzA5LWFmMmMtNmIyYWM4N2U1NjY1In0.esfPmYHoRhqdgUh55rn46xp0FRRuGjLU3DtrHtjIhuQ",
  "access_expires_at": "2026-10-30T19:57:57.645121126Z",
  "refresh_token": "fiq5pvAiqmUvig0hF5QJqMT3MPte_BC3fljqskhu12s",
  "refresh_expires_at": "2026-10-31T07:42:57.644608438Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380678830000` → **200**

```json
{
  "deliveries": [
    {
      "id": "44523f5c-916a-40cb-958c-617e6532c2f2",
      "challenge_id": "6d962a75-471c-47d6-ab67-bdbf7f3334f5",
      "phone": "+380678830000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-8375574e-f995-4437-81b5-8cf9342da491",
      "error": null,
      "attempted_at": "2026-10-30T19:42:54.942894Z"
    },
    {
      "id": "0bcb6016-194f-4ad2-b78b-7b64b965b323",
      "challenge_id": "97c68e44-7c7b-4e50-b0b0-bb232b57918d",
      "phone": "+380678830000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-06b737d4-67d1-4a66-9ac8-e3908691f846",
      "error": null,
      "attempted_at": "2026-10-30T19:42:53.432207Z"
    },
    {
      "id": "214741a4-4138-4860-a4a8-a792aa85389c",
      "challenge_id": "c3e62802-e7e4-4d88-b27c-0bf40c12c1be",
      "phone": "+380678830000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-30T19:42:51.945136Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380678830000` → **200**

```json
{
  "phone": "+380678830000",
  "audience": "CLIENT",
  "code": "855366",
  "sent_at": "2026-10-30T19:42:54.94266283Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380677351730` → **200**

```json
{
  "deliveries": [
    {
      "id": "86aee658-3c13-40c5-b621-d7d5b63b9815",
      "challenge_id": "818af821-1543-446e-9731-ae5abc1e4c5c",
      "phone": "+380677351730",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-7da84eef-3095-444f-a8ac-2cc2e0d444bd",
      "error": null,
      "attempted_at": "2026-10-30T19:42:50.432355Z"
    },
    {
      "id": "a2620cf6-1b60-46e9-bb41-6792e391cc60",
      "challenge_id": "9d433df9-399b-4c8b-9512-d7a45052f496",
      "phone": "+380677351730",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-0ec10253-cc61-4810-aed6-846343de4c56",
      "error": null,
      "attempted_at": "2026-10-30T19:42:48.919759Z"
    }
  ]
}
```

Done: SMS to +380672336654; SMS then a call to +380677351730; a failed SMS, two calls and a refused third to +380678830000; +44 and +371 refused.

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
  "session_id": "29959981-cf0c-4697-9c9c-49c5f998da44",
  "subject": {
    "type": "STAFF",
    "id": "bbeb0bd1-546e-4687-8aa4-9df00ff27005"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYmViMGJkMS01NDZlLTQ2ODctOGFhNC05ZGYwMGZmMjcwMDUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTAyNzgsImlhdCI6MTc5MzM4OTM3OCwianRpIjoiZGE4YjI5YmItODhlMC00MjcyLWJmZDgtNDY5NWNhY2JhOWZmIiwic2lkIjoiMjk5NTk5ODEtY2YwYy00Njk3LTljOWMtNDljNWY5OThkYTQ0In0._r7nvD4ZpRhftZBZlpePvAZlI4REadqBI-gvfV5DOsc",
  "access_expires_at": "2026-10-30T19:57:58.836692658Z",
  "refresh_token": "Ot22uz_KrAfkELf3ZS9n42QnfeKpL6Tufe1djnTCmmY",
  "refresh_expires_at": "2026-10-31T07:42:58.836006235Z",
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
  "session_id": "769354de-d64a-4016-a4c6-971a3c02f807",
  "subject": {
    "type": "STAFF",
    "id": "bbeb0bd1-546e-4687-8aa4-9df00ff27005"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYmViMGJkMS01NDZlLTQ2ODctOGFhNC05ZGYwMGZmMjcwMDUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTAyNzksImlhdCI6MTc5MzM4OTM3OSwianRpIjoiZDI5NDNhODItZGI1Ni00NjZkLTkxN2EtMTVjNzg2ODI2OWE1Iiwic2lkIjoiNzY5MzU0ZGUtZDY0YS00MDE2LWE0YzYtOTcxYTNjMDJmODA3In0.1KDs-CX0PnWx1zFo3KXMzGvEBqibove-JtviPt-JFcM",
  "access_expires_at": "2026-10-30T19:57:59.409375713Z",
  "refresh_token": "mRckgvVD8jasjY0l0qER9iyaqRv-2imugQY22nd2tG4",
  "refresh_expires_at": "2026-10-31T07:42:59.408867122Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "bbeb0bd1-546e-4687-8aa4-9df00ff27005",
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

`POST /api/admin/v1/staff-extensions/bbeb0bd1-546e-4687-8aa4-9df00ff27005` → **200**

```json
{
  "command_id": "785c8cd4-7017-410f-a733-c6989e503657",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "bbeb0bd1-546e-4687-8aa4-9df00ff27005",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "346ef179-074e-4615-a9db-3e4248fa6f8b",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T19:43:00.549602Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T19:43:00.549602Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "aab08ab1-4d14-4bb8-a3c6-dffbd9e858a1",
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
  "id": "c1df494d-99ef-4d94-83f0-ed0eaf3ddde5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T19:48:01.122253Z",
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
  "command_id": "a05985fe-d546-4a36-bd08-f4a8a4c8cdc9",
  "quote_id": "c1df494d-99ef-4d94-83f0-ed0eaf3ddde5",
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
    "phone": "+380677112743"
  }
}
```

```json
{
  "id": "9ca8843b-4fd6-4659-9834-81c8518b2fbd",
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
  "created_at": "2026-10-30T19:43:01.428176Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677112743"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/9ca8843b-4fd6-4659-9834-81c8518b2fbd/calls` → **201**

```json
{
  "command_id": "ac807162-2a03-472b-af54-45fb370112a7",
  "to": "CALLER"
}
```

```json
{
  "id": "77925c27-4fa3-4162-a07e-c3f0247d4bc1",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "bbeb0bd1-546e-4687-8aa4-9df00ff27005",
  "order_ids": [
    "9ca8843b-4fd6-4659-9834-81c8518b2fbd"
  ],
  "started_at": "2026-10-30T19:43:01.749073Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/9ca8843b-4fd6-4659-9834-81c8518b2fbd/calls` → **201**

```json
{
  "command_id": "ac807162-2a03-472b-af54-45fb370112a7",
  "to": "CALLER"
}
```

```json
{
  "id": "77925c27-4fa3-4162-a07e-c3f0247d4bc1",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "bbeb0bd1-546e-4687-8aa4-9df00ff27005",
  "order_ids": [
    "9ca8843b-4fd6-4659-9834-81c8518b2fbd"
  ],
  "started_at": "2026-10-30T19:43:01.749073Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "77925c27-4fa3-4162-a07e-c3f0247d4bc1",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380677112743",
    "at": "2026-10-30T19:43:01.751530263Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "77925c27-4fa3-4162-a07e-c3f0247d4bc1",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.16175",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "77925c27-4fa3-4162-a07e-c3f0247d4bc1"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "77925c27-4fa3-4162-a07e-c3f0247d4bc1",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=9ca8843b-4fd6-4659-9834-81c8518b2fbd` → **200**

```json
{
  "calls": [
    {
      "id": "77925c27-4fa3-4162-a07e-c3f0247d4bc1",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "bbeb0bd1-546e-4687-8aa4-9df00ff27005",
      "order_ids": [
        "9ca8843b-4fd6-4659-9834-81c8518b2fbd"
      ],
      "started_at": "2026-10-30T19:43:01.749073Z",
      "answered_at": "2026-10-30T19:43:02.411285Z",
      "ended_at": "2026-10-30T19:43:02.431985Z",
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

`GET /api/operator/v1/calls?order_id=9ca8843b-4fd6-4659-9834-81c8518b2fbd` → **200**

```json
{
  "calls": [
    {
      "id": "77925c27-4fa3-4162-a07e-c3f0247d4bc1",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "bbeb0bd1-546e-4687-8aa4-9df00ff27005",
      "order_ids": [
        "9ca8843b-4fd6-4659-9834-81c8518b2fbd"
      ],
      "started_at": "2026-10-30T19:43:01.749073Z",
      "answered_at": "2026-10-30T19:43:02.411285Z",
      "ended_at": "2026-10-30T19:43:02.431985Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T19:43:03.405398Z"
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

`GET /api/operator/v1/orders/9ca8843b-4fd6-4659-9834-81c8518b2fbd` → **200**

```json
{
  "id": "9ca8843b-4fd6-4659-9834-81c8518b2fbd",
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
  "created_at": "2026-10-30T19:43:01.428176Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677112743"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/9ca8843b-4fd6-4659-9834-81c8518b2fbd/cancel` → **200**

```json
{
  "command_id": "acf3e85f-a2f4-40fc-9378-fcaacdeedc5e",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "9ca8843b-4fd6-4659-9834-81c8518b2fbd",
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
  "created_at": "2026-10-30T19:43:01.428176Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677112743"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "uk": "Немає вільних авто",
      "pl": "Brak wolnych aut",
      "ru": "Нет свободных машин",
      "en": "No cars available"
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
  "command_id": "1bdbd997-4fa5-42b9-862f-d4b8049d5e36",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-30T19:43:05.682626Z",
  "extension": "101"
}
```

Done: outgoing call 77925c27-4fa3-4162-a07e-c3f0247d4bc1 from order 9ca8843b-4fd6-4659-9834-81c8518b2fbd, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636591588",
  "device_ref": "sandbox-2174"
}
```

```json
{
  "challenge_id": "7b58c401-656b-4df4-a771-829ed4690440",
  "expires_at": "2026-10-30T19:48:05.975675598Z",
  "resend_available_at": "2026-10-30T19:43:06.975675598Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636591588` → **200**

```json
{
  "phone": "+380636591588",
  "audience": "CLIENT",
  "code": "112228",
  "sent_at": "2026-10-30T19:43:05.979294762Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7b58c401-656b-4df4-a771-829ed4690440",
  "code": "112228",
  "device_ref": "sandbox-2174"
}
```

```json
{
  "session_id": "c795f7b1-8e3e-43f6-8e23-b32df76cf23e",
  "subject": {
    "type": "CLIENT",
    "id": "34d78354-9d7e-4ea7-ac0b-3de1add5f6dc"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzNGQ3ODM1NC05ZDdlLTRlYTctYWMwYi0zZGUxYWRkNWY2ZGMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzkwMjg2LCJpYXQiOjE3OTMzODkzODYsImp0aSI6IjNmNWJjODJiLThjYzAtNDYwZC1hMmJlLTEwNDY0ZTdlYTNlZCIsInNpZCI6ImM3OTVmN2IxLThlM2UtNDNmNi04ZTIzLWIzMmRmNzZjZjIzZSJ9.65LR7_qwCvpiwrTG5vGabOX3dBKM8Ej7GE3qF3wxFxI",
  "access_expires_at": "2026-10-30T19:58:06.309007943Z",
  "refresh_token": "jdWOs_xbga0gJw_SivOet1A61XmpiuJsygJsTKp3vRI",
  "refresh_expires_at": "2026-11-29T19:43:06.308502939Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "34d78354-9d7e-4ea7-ac0b-3de1add5f6dc",
  "session_id": "c795f7b1-8e3e-43f6-8e23-b32df76cf23e",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636591588",
  "device_ref": "sandbox-18873"
}
```

```json
{
  "challenge_id": "cfb7d05d-0b2f-4e1c-8dfb-b63c583ba3df",
  "expires_at": "2026-10-30T19:48:08.869333573Z",
  "resend_available_at": "2026-10-30T19:43:09.869333573Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636591588` → **200**

```json
{
  "phone": "+380636591588",
  "audience": "CLIENT",
  "code": "089401",
  "sent_at": "2026-10-30T19:43:08.87197351Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cfb7d05d-0b2f-4e1c-8dfb-b63c583ba3df",
  "code": "089401",
  "device_ref": "sandbox-18873"
}
```

```json
{
  "session_id": "df1ff6e6-fbd6-4c6d-8a61-7c4a1a6a437f",
  "subject": {
    "type": "CLIENT",
    "id": "34d78354-9d7e-4ea7-ac0b-3de1add5f6dc"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzNGQ3ODM1NC05ZDdlLTRlYTctYWMwYi0zZGUxYWRkNWY2ZGMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzkwMjg5LCJpYXQiOjE3OTMzODkzODksImp0aSI6ImU3NTAxMWM3LTgyOTItNGVjNy05NjRmLWYyZWI0ZGNhYzIyZiIsInNpZCI6ImRmMWZmNmU2LWZiZDYtNGM2ZC04YTYxLTdjNGExYTZhNDM3ZiJ9.bgc4yUHwf5k36W5ueBPdXRdij4J0FN7NaCgN2HMqyiU",
  "access_expires_at": "2026-10-30T19:58:09.181813877Z",
  "refresh_token": "CVzgEVDUWGyuPyvKBEaonkbV3yY_VrfeZVmW5IF2tfM",
  "refresh_expires_at": "2026-11-29T19:43:09.181209848Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "43a84556-3d0a-413d-8a38-f314ad9e167f",
  "expires_at": "2026-10-30T19:48:11.472852722Z",
  "resend_available_at": "2026-10-30T19:43:12.472852722Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636591588` → **200**

```json
{
  "phone": "+380636591588",
  "audience": "CLIENT",
  "code": "691077",
  "sent_at": "2026-10-30T19:43:11.475245685Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380636136911"
}
```

```json
{
  "challenge_id": "e95392cd-42a8-465e-a606-16b80232c9ab",
  "expires_at": "2026-10-30T19:48:11.772696128Z",
  "resend_available_at": "2026-10-30T19:43:12.772696128Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636136911` → **200**

```json
{
  "phone": "+380636136911",
  "audience": "CLIENT",
  "code": "535620",
  "sent_at": "2026-10-30T19:43:11.774905188Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "7b7f94d3-b00e-4b0a-83d1-b1725b3e350f",
  "current_challenge_id": "43a84556-3d0a-413d-8a38-f314ad9e167f",
  "current_code": "000000",
  "new_challenge_id": "e95392cd-42a8-465e-a606-16b80232c9ab",
  "new_code": "535620"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "68de0258-0851-459b-b09c-6e21d15271f6"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "8b681d52-7cb0-44ec-996a-17c596353b9d",
  "current_challenge_id": "43a84556-3d0a-413d-8a38-f314ad9e167f",
  "current_code": "691077",
  "new_challenge_id": "e95392cd-42a8-465e-a606-16b80232c9ab",
  "new_code": "535620"
}
```

```json
{
  "subject_id": "34d78354-9d7e-4ea7-ac0b-3de1add5f6dc",
  "phone": "+380636136911",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "34d78354-9d7e-4ea7-ac0b-3de1add5f6dc",
  "session_id": "c795f7b1-8e3e-43f6-8e23-b32df76cf23e",
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
  "correlation_id": "606dc9c3-db67-4567-b085-9ba913982cfd"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636136911",
  "device_ref": "sandbox-17676"
}
```

```json
{
  "challenge_id": "70837fb1-dde0-4c81-9809-7b7f0455292b",
  "expires_at": "2026-10-30T19:48:15.214483498Z",
  "resend_available_at": "2026-10-30T19:43:16.214483498Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636136911` → **200**

```json
{
  "phone": "+380636136911",
  "audience": "CLIENT",
  "code": "404753",
  "sent_at": "2026-10-30T19:43:15.217999381Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "70837fb1-dde0-4c81-9809-7b7f0455292b",
  "code": "404753",
  "device_ref": "sandbox-17676"
}
```

```json
{
  "session_id": "0d051bbb-cef1-45f8-a46c-5394dc567965",
  "subject": {
    "type": "CLIENT",
    "id": "34d78354-9d7e-4ea7-ac0b-3de1add5f6dc"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzNGQ3ODM1NC05ZDdlLTRlYTctYWMwYi0zZGUxYWRkNWY2ZGMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzkwMjk1LCJpYXQiOjE3OTMzODkzOTUsImp0aSI6IjAxN2IwYmMyLTY2NWUtNGVkYi1iYjhkLWQ1MmQyMDliNDVhNiIsInNpZCI6IjBkMDUxYmJiLWNlZjEtNDVmOC1hNDZjLTUzOTRkYzU2Nzk2NSJ9.x7t-jcAitKdLscQ1gvQXw1RU0jsaWCOgPkEwuZrmMXQ",
  "access_expires_at": "2026-10-30T19:58:15.518224217Z",
  "refresh_token": "6hqeHexJOVlGZsurZSVfl8tyQ2o5xMV6DJbU3pnNdLY",
  "refresh_expires_at": "2026-11-29T19:43:15.517705212Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "34d78354-9d7e-4ea7-ac0b-3de1add5f6dc",
  "session_id": "0d051bbb-cef1-45f8-a46c-5394dc567965",
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
  "session_id": "33a237d4-8243-462a-990b-e61178e23090",
  "subject": {
    "type": "STAFF",
    "id": "bbeb0bd1-546e-4687-8aa4-9df00ff27005"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYmViMGJkMS01NDZlLTQ2ODctOGFhNC05ZGYwMGZmMjcwMDUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTAyOTYsImlhdCI6MTc5MzM4OTM5NiwianRpIjoiMWM0YTFkZTgtMWJjYS00OTNjLWFmMTctNWQyYzRlNmRlNjVlIiwic2lkIjoiMzNhMjM3ZDQtODI0My00NjJhLTk5MGItZTYxMTc4ZTIzMDkwIn0.WRSqcgJkvwzRlVQ7lYCzzhX2g9iI1baV5txaqBaHw6g",
  "access_expires_at": "2026-10-30T19:58:16.36360396Z",
  "refresh_token": "eaYickPJKo7rKqL1LOw8oRobndaTmBy1s83iEoUUFgw",
  "refresh_expires_at": "2026-10-31T07:43:16.362885522Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/34d78354-9d7e-4ea7-ac0b-3de1add5f6dc` → **200**

```json
{
  "client": {
    "id": "34d78354-9d7e-4ea7-ac0b-3de1add5f6dc",
    "phone": "+380636136911",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T19:43:06.30705Z",
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

`POST /api/admin/v1/clients/34d78354-9d7e-4ea7-ac0b-3de1add5f6dc/phone/new-code` → **201**

```json
{
  "phone": "+380637261119"
}
```

```json
{
  "challenge_id": "da7ce772-c38e-4d6b-a848-beb0d8882d42",
  "expires_at": "2026-10-30T19:48:16.977208874Z",
  "resend_available_at": "2026-10-30T19:43:17.977208874Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637261119` → **200**

```json
{
  "phone": "+380637261119",
  "audience": "CLIENT",
  "code": "690509",
  "sent_at": "2026-10-30T19:43:16.97948483Z",
  "channel": "SMS"
}
```

## Without the right code nothing changes; with it, support sets the phone

`POST /api/admin/v1/clients/34d78354-9d7e-4ea7-ac0b-3de1add5f6dc/phone` → **422**

```json
{
  "command_id": "cde10269-b4b4-4269-9001-3dd90ca4f65e",
  "expected_version": 3,
  "new_challenge_id": "da7ce772-c38e-4d6b-a848-beb0d8882d42",
  "new_code": "690510",
  "reason": "Passport checked at the office"
}
```

```json
{
  "instance": "/api/admin/v1/clients/34d78354-9d7e-4ea7-ac0b-3de1add5f6dc/phone",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "884caf94-b6b3-4f07-9954-5d88f14daa43"
}
```

`POST /api/admin/v1/clients/34d78354-9d7e-4ea7-ac0b-3de1add5f6dc/phone` → **400**

```json
{
  "command_id": "0ceaa307-9371-4320-856b-e2cc0298001b",
  "expected_version": 3,
  "new_challenge_id": "da7ce772-c38e-4d6b-a848-beb0d8882d42",
  "new_code": "690509",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/34d78354-9d7e-4ea7-ac0b-3de1add5f6dc/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "c77add63-06fe-40fb-9d03-b9662b916689",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

`POST /api/admin/v1/clients/34d78354-9d7e-4ea7-ac0b-3de1add5f6dc/phone` → **200**

```json
{
  "command_id": "21bc2972-a8a5-47e1-9b41-3eb9a2db623a",
  "expected_version": 3,
  "new_challenge_id": "da7ce772-c38e-4d6b-a848-beb0d8882d42",
  "new_code": "690509",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "34d78354-9d7e-4ea7-ac0b-3de1add5f6dc",
  "phone": "+380637261119",
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
  "correlation_id": "2cd0b417-38e6-4159-a770-3d17d506839e"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637261119",
  "device_ref": "sandbox-26572"
}
```

```json
{
  "challenge_id": "a9376dda-245e-4785-bcfd-ddc12723ac10",
  "expires_at": "2026-10-30T19:48:18.44995438Z",
  "resend_available_at": "2026-10-30T19:43:19.44995438Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637261119` → **200**

```json
{
  "phone": "+380637261119",
  "audience": "CLIENT",
  "code": "535205",
  "sent_at": "2026-10-30T19:43:18.452577687Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a9376dda-245e-4785-bcfd-ddc12723ac10",
  "code": "535205",
  "device_ref": "sandbox-26572"
}
```

```json
{
  "session_id": "e09f8754-4312-466b-9a9e-8bf43d81fb67",
  "subject": {
    "type": "CLIENT",
    "id": "34d78354-9d7e-4ea7-ac0b-3de1add5f6dc"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzNGQ3ODM1NC05ZDdlLTRlYTctYWMwYi0zZGUxYWRkNWY2ZGMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzkwMjk4LCJpYXQiOjE3OTMzODkzOTgsImp0aSI6ImE3NmU0MmQ4LWUwNzAtNDgzMC05NjNlLWMwZGE5OWM3ZjMzNyIsInNpZCI6ImUwOWY4NzU0LTQzMTItNDY2Yi05YTllLThiZjQzZDgxZmI2NyJ9.j8RA-yFkHhCtfaMuWKJ54zciT-N00ckrAqehbMqCNn4",
  "access_expires_at": "2026-10-30T19:58:18.764371496Z",
  "refresh_token": "3uN9UucMEbMnw1r4cK9_mDU-9GnX7_y6aXGKbwzguaU",
  "refresh_expires_at": "2026-11-29T19:43:18.763848143Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "34d78354-9d7e-4ea7-ac0b-3de1add5f6dc",
  "session_id": "e09f8754-4312-466b-9a9e-8bf43d81fb67",
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
  "phone": "+380639717985",
  "device_ref": "sandbox-29953"
}
```

```json
{
  "challenge_id": "a8f07761-6612-4992-affa-29d999598a79",
  "expires_at": "2026-10-30T19:48:19.333630227Z",
  "resend_available_at": "2026-10-30T19:43:20.333630227Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639717985` → **200**

```json
{
  "phone": "+380639717985",
  "audience": "CLIENT",
  "code": "213655",
  "sent_at": "2026-10-30T19:43:19.335934305Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a8f07761-6612-4992-affa-29d999598a79",
  "code": "213655",
  "device_ref": "sandbox-29953"
}
```

```json
{
  "session_id": "e06e99b8-cb95-4ae4-9387-c3567a635543",
  "subject": {
    "type": "CLIENT",
    "id": "c9357493-b33b-47cd-82a1-612e2c162fe1"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjOTM1NzQ5My1iMzNiLTQ3Y2QtODJhMS02MTJlMmMxNjJmZTEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzkwMjk5LCJpYXQiOjE3OTMzODkzOTksImp0aSI6IjdjMWYwZjk0LTM2YWItNGJmMy1hYjVjLTI2YWRhZDlmNmFkNiIsInNpZCI6ImUwNmU5OWI4LWNiOTUtNGFlNC05Mzg3LWMzNTY3YTYzNTU0MyJ9.6xtEXJley32VS0e_lzDEZBmgx9UaNJnQ6yaztl8YAhA",
  "access_expires_at": "2026-10-30T19:58:19.643180531Z",
  "refresh_token": "MUh5CvAJy4YrPsy6r5FH-voVjIDqJvHYS3Vh1m3DlHo",
  "refresh_expires_at": "2026-11-29T19:43:19.642681147Z",
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
  "session_id": "2e4d27f7-fcb6-4625-99c7-f77ddd9a08ba",
  "subject": {
    "type": "STAFF",
    "id": "bbeb0bd1-546e-4687-8aa4-9df00ff27005"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYmViMGJkMS01NDZlLTQ2ODctOGFhNC05ZGYwMGZmMjcwMDUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTAzMDAsImlhdCI6MTc5MzM4OTQwMCwianRpIjoiNDZlZjEwY2YtNDFmYi00ZGEwLThlYmItNTViZDYyOTk2ZjM3Iiwic2lkIjoiMmU0ZDI3ZjctZmNiNi00NjI1LTk5YzctZjc3ZGRkOWEwOGJhIn0.OKIQUeDykoze-CkrQFqblUk0blqb7FXVldsI7qFKCWY",
  "access_expires_at": "2026-10-30T19:58:20.807857009Z",
  "refresh_token": "wKDEEusEkSBLsyJJ0sZmTuawQSXtgKJfJRBDV8KkFLc",
  "refresh_expires_at": "2026-10-31T07:43:20.807309425Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380639717985` → **200**

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
  "correlation_id": "6f0a3db1-618b-4241-aa1d-178d49632318"
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
  "session_id": "1b9f0468-4e4d-47a9-93a3-c7186b6aae88",
  "subject": {
    "type": "STAFF",
    "id": "bbeb0bd1-546e-4687-8aa4-9df00ff27005"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYmViMGJkMS01NDZlLTQ2ODctOGFhNC05ZGYwMGZmMjcwMDUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTAzMDEsImlhdCI6MTc5MzM4OTQwMSwianRpIjoiYTg1MjIxMzUtMmNhOC00YmM3LWIxNGQtODVkNDk0MTljYTg2Iiwic2lkIjoiMWI5ZjA0NjgtNGU0ZC00N2E5LTkzYTMtYzcxODZiNmFhZTg4In0.wiNjfVuWCFLs6F3EXcWerjc3VNWMWnoiJuKBmRK-i0M",
  "access_expires_at": "2026-10-30T19:58:21.979171375Z",
  "refresh_token": "LW-ZMEwC_RG-FWmW6OzhctyK_LdsGC-j1CreaWbzv-o",
  "refresh_expires_at": "2026-10-31T07:43:21.978642017Z",
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
  "changed_by": "bbeb0bd1-546e-4687-8aa4-9df00ff27005",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T19:25:39.188412Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "5e235345-ea4e-4012-bc2d-d137d3f1bf25",
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
  "changed_by": "bbeb0bd1-546e-4687-8aa4-9df00ff27005",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-30T19:43:22.563151444Z"
}
```

## The rider books the airport for 2026-10-30T22:43:21Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600413644",
  "device_ref": "sandbox-35"
}
```

```json
{
  "challenge_id": "1a03fde1-d08c-405a-976e-3f2f68194aa5",
  "expires_at": "2026-10-30T19:48:22.863919757Z",
  "resend_available_at": "2026-10-30T19:43:23.863919757Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600413644` → **200**

```json
{
  "phone": "+48600413644",
  "audience": "CLIENT",
  "code": "824470",
  "sent_at": "2026-10-30T19:43:22.866344561Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1a03fde1-d08c-405a-976e-3f2f68194aa5",
  "code": "824470",
  "device_ref": "sandbox-35"
}
```

```json
{
  "session_id": "5817024f-272e-4825-81e1-7e2ebb9e64da",
  "subject": {
    "type": "CLIENT",
    "id": "06be4cba-dfa3-4dda-9280-ca22de759f49"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNmJlNGNiYS1kZmEzLTRkZGEtOTI4MC1jYTIyZGU3NTlmNDkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzkwMzAzLCJpYXQiOjE3OTMzODk0MDMsImp0aSI6IjFhNjk2ZjhiLTdhMzUtNDVlYy1hODEyLTM3YTE0NGFiYTA5YyIsInNpZCI6IjU4MTcwMjRmLTI3MmUtNDgyNS04MWUxLTdlMmViYjllNjRkYSJ9.O4Vf6Ptm5BVt9ULqlaeIU4GFuqWaNr8dO77VkiTb9MQ",
  "access_expires_at": "2026-10-30T19:58:23.173084751Z",
  "refresh_token": "cyctb4c8eJw-K1GVa1QiiRwUcigOTk04zhrGveo3HaI",
  "refresh_expires_at": "2026-11-29T19:43:23.172610875Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a6d46d31-4155-4458-8d42-c6705e868ecc",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-30T22:43:21Z"
}
```

```json
{
  "id": "a8744900-d3e9-4ae0-9c7d-845c38eabb78",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T19:48:23.456960Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-30T22:43:21Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "764b52ef-cd1d-4962-bf68-7dcaae32ae9e",
  "quote_id": "a8744900-d3e9-4ae0-9c7d-845c38eabb78",
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
  "pickup_at": "2026-10-30T22:43:21Z"
}
```

```json
{
  "id": "c0945b8d-e800-4ddd-82b7-ee3e285d7224",
  "short_number": 34,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "06be4cba-dfa3-4dda-9280-ca22de759f49",
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
  "created_at": "2026-10-30T19:43:23.760664Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T22:43:21Z",
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
  "device_ref": "sandbox-29792"
}
```

```json
{
  "challenge_id": "684572a5-ef88-46dd-9609-0a81f133b755",
  "expires_at": "2026-10-30T19:48:24.069707816Z",
  "resend_available_at": "2026-10-30T19:43:25.069707816Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "472096",
  "sent_at": "2026-10-30T19:43:24.072160842Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "684572a5-ef88-46dd-9609-0a81f133b755",
  "code": "472096",
  "device_ref": "sandbox-29792"
}
```

```json
{
  "session_id": "fd022e0f-4585-4c2d-972f-770d0ea954ba",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM5MDMwNCwiaWF0IjoxNzkzMzg5NDA0LCJqdGkiOiJmOGQ2ZGVlMS0xZjgyLTRkNDgtODBhNC1jNjc5YThlNTA1MmUiLCJzaWQiOiJmZDAyMmUwZi00NTg1LTRjMmQtOTcyZi03NzBkMGVhOTU0YmEifQ.VFqN0wjFZEgZH5iYGZCP1pMWtlBler2M8zgBF8Skpog",
  "access_expires_at": "2026-10-30T19:58:24.373851079Z",
  "refresh_token": "DoyLoiLb0gvHrVBB0fUMC_RggEFRCKXfAnyqnMf3DUg",
  "refresh_expires_at": "2026-11-29T19:43:24.373224976Z",
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
  "command_id": "f79c50f9-8b40-4d26-98bf-21b088ecb4ed",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:43:24Z",
    "sequence": 1793389404951
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "bfeae3af-1505-413d-b82d-9a20a7a50174",
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
  "last_heartbeat_at": "2026-10-30T19:43:24.969272Z",
  "last_location_at": "2026-10-30T19:43:24.969272Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "c0945b8d-e800-4ddd-82b7-ee3e285d7224",
      "short_number": 34,
      "pickup_at": "2026-10-30T22:43:21Z",
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

`POST /api/driver/v1/preorders/c0945b8d-e800-4ddd-82b7-ee3e285d7224/reserve` → **200**

```json
{
  "command_id": "f2962e3f-2f4e-4ba1-a3d3-732dbc8856e9"
}
```

```json
{
  "id": "8a72417f-73ff-468f-a929-a5474276bb25",
  "state": "RESERVED",
  "order": {
    "order_id": "c0945b8d-e800-4ddd-82b7-ee3e285d7224",
    "short_number": 34,
    "pickup_at": "2026-10-30T22:43:21Z",
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
  "reserved_at": "2026-10-30T19:43:25.545408Z",
  "confirm_from": "2026-10-30T22:13:21Z",
  "confirm_until": "2026-10-30T22:23:21Z",
  "drop_until": "2026-10-30T21:43:21Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "8a72417f-73ff-468f-a929-a5474276bb25",
      "state": "RESERVED",
      "order": {
        "order_id": "c0945b8d-e800-4ddd-82b7-ee3e285d7224",
        "short_number": 34,
        "pickup_at": "2026-10-30T22:43:21Z",
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
      "reserved_at": "2026-10-30T19:43:25.545408Z",
      "confirm_from": "2026-10-30T22:13:21Z",
      "confirm_until": "2026-10-30T22:23:21Z",
      "drop_until": "2026-10-30T21:43:21Z"
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
      "id": "8a72417f-73ff-468f-a929-a5474276bb25",
      "state": "RESERVED",
      "order": {
        "order_id": "c0945b8d-e800-4ddd-82b7-ee3e285d7224",
        "short_number": 34,
        "pickup_at": "2026-10-30T22:43:21Z",
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
      "reserved_at": "2026-10-30T19:43:25.545408Z",
      "confirm_from": "2026-10-30T22:13:21Z",
      "confirm_until": "2026-10-30T22:23:21Z",
      "drop_until": "2026-10-30T21:43:21Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/8a72417f-73ff-468f-a929-a5474276bb25/confirm` → **409**

```json
{
  "command_id": "43729134-f6f7-450d-9503-8d1299716e27"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/8a72417f-73ff-468f-a929-a5474276bb25/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "90d0fa1d-30a4-441c-9328-cd8abc709d69"
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
  "session_id": "b387310e-0614-4599-94eb-4832f96ce629",
  "subject": {
    "type": "STAFF",
    "id": "bbeb0bd1-546e-4687-8aa4-9df00ff27005"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYmViMGJkMS01NDZlLTQ2ODctOGFhNC05ZGYwMGZmMjcwMDUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTAzMDcsImlhdCI6MTc5MzM4OTQwNywianRpIjoiMDk1NmM5YmQtMWEyZi00NjBmLTg2ZTMtNjFiZmJhMTViNzkwIiwic2lkIjoiYjM4NzMxMGUtMDYxNC00NTk5LTk0ZWItNDgzMmY5NmNlNjI5In0.Uj1m7Wq1XZwgTJiIg3Ob6SsymiNQlJsR-tmQHXBaiM4",
  "access_expires_at": "2026-10-30T19:58:27.006696292Z",
  "refresh_token": "LTu4XJZX9GW5zc2-FjyGRgP06tVe6areVAeGQGvB-Jk",
  "refresh_expires_at": "2026-10-31T07:43:27.00614405Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/c0945b8d-e800-4ddd-82b7-ee3e285d7224` → **200**

```json
{
  "id": "c0945b8d-e800-4ddd-82b7-ee3e285d7224",
  "short_number": 34,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "06be4cba-dfa3-4dda-9280-ca22de759f49",
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
  "created_at": "2026-10-30T19:43:23.760664Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-30T22:43:21Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "8a72417f-73ff-468f-a929-a5474276bb25",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-30T19:43:25.545408Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/c0945b8d-e800-4ddd-82b7-ee3e285d7224/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-30T19:43:23.761759Z",
      "actor": {
        "type": "CLIENT",
        "id": "06be4cba-dfa3-4dda-9280-ca22de759f49",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "c0945b8d-e800-4ddd-82b7-ee3e285d7224",
        "preorder": true,
        "quote_id": "a8744900-d3e9-4ae0-9c7d-845c38eabb78",
        "pickup_at": "2026-10-30T22:43:21Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "3b422ca5-6203-4616-9df4-6866ba23017d"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-30T19:43:25.546631Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "c0945b8d-e800-4ddd-82b7-ee3e285d7224",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "8a72417f-73ff-468f-a929-a5474276bb25"
      },
      "correlation_id": "642bf824-103c-4e9f-b148-18209968262f"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order c0945b8d-e800-4ddd-82b7-ee3e285d7224, reservation 8a72417f-73ff-468f-a929-a5474276bb25.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-2873"
}
```

```json
{
  "challenge_id": "6bb2111b-5d24-4704-b4ef-49db6c9d0dfe",
  "expires_at": "2026-10-30T19:48:27.891097834Z",
  "resend_available_at": "2026-10-30T19:43:28.891097834Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "686007",
  "sent_at": "2026-10-30T19:43:27.893863428Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6bb2111b-5d24-4704-b4ef-49db6c9d0dfe",
  "code": "686007",
  "device_ref": "sandbox-2873"
}
```

```json
{
  "session_id": "003050a7-d4f2-4b39-8a66-8e8ab8dabb66",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM5MDMwOCwiaWF0IjoxNzkzMzg5NDA4LCJqdGkiOiI0MDRjMzA2Yi1iMmViLTQ3MzQtYjg3Zi05NGE5MjhlNzdlYjYiLCJzaWQiOiIwMDMwNTBhNy1kNGYyLTRiMzktOGE2Ni04ZThhYjhkYWJiNjYifQ.1ecNDSR-4Lmzz53pYDVLmj_yfRrg2Q9XkAbNfBNmeyM",
  "access_expires_at": "2026-10-30T19:58:28.201565699Z",
  "refresh_token": "HFfkrt4_W45de7dQgslYCHiJu1bXwYIRegFiCL08jh0",
  "refresh_expires_at": "2026-11-29T19:43:28.200978341Z",
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
  "command_id": "99fe1725-5323-4231-8c1e-a787bfb04fe6",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:43:28Z",
    "sequence": 1793389408781
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d3ba373c-6aae-4a54-943c-b2cfed6d8e3c",
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
  "last_heartbeat_at": "2026-10-30T19:43:28.799315Z",
  "last_location_at": "2026-10-30T19:43:28.799315Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678510533",
  "device_ref": "sandbox-8374"
}
```

```json
{
  "challenge_id": "9837865a-3724-47b6-a286-ad4a09f10340",
  "expires_at": "2026-10-30T19:48:29.083777161Z",
  "resend_available_at": "2026-10-30T19:43:30.083777161Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380678510533` → **200**

```json
{
  "phone": "+380678510533",
  "audience": "CLIENT",
  "code": "294373",
  "sent_at": "2026-10-30T19:43:29.086425736Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9837865a-3724-47b6-a286-ad4a09f10340",
  "code": "294373",
  "device_ref": "sandbox-8374"
}
```

```json
{
  "session_id": "c7608e10-c9e6-4a45-9106-1ce6ccf096e0",
  "subject": {
    "type": "CLIENT",
    "id": "89307dcb-d509-4f04-979d-bcc30f049915"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4OTMwN2RjYi1kNTA5LTRmMDQtOTc5ZC1iY2MzMGYwNDk5MTUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzkwMzA5LCJpYXQiOjE3OTMzODk0MDksImp0aSI6IjM4NzZjZGFhLTAyODAtNGE4ZC05YzEzLTYwYzI2NTFjY2YyOSIsInNpZCI6ImM3NjA4ZTEwLWM5ZTYtNGE0NS05MTA2LTFjZTZjY2YwOTZlMCJ9.-h_IwSVdZAvU_O6bQMsxzXggRaFIW8_TxU-mw1x-bjg",
  "access_expires_at": "2026-10-30T19:58:29.39149672Z",
  "refresh_token": "RVdB7hiGVPtJ3X5B5NPrgm4swUqjSk-1oUfIz-LT--M",
  "refresh_expires_at": "2026-11-29T19:43:29.390880284Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "2ab3ff68-07af-494e-94a3-d3f5bc5a9b3d",
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
  "id": "f215e7b8-80bc-4574-af09-89a3fc4640d7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T19:48:29.680319Z",
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
  "command_id": "a1ec4a3f-b176-41c5-ae15-ae130aacc5b4",
  "quote_id": "f215e7b8-80bc-4574-af09-89a3fc4640d7",
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
  "id": "84079326-a6ce-47a6-873f-bed77d6bdff2",
  "short_number": 35,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "89307dcb-d509-4f04-979d-bcc30f049915",
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
  "created_at": "2026-10-30T19:43:29.975534Z",
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
    "id": "7f66fc42-122b-43a7-9dcd-f9a7858ba3c1",
    "order_id": "84079326-a6ce-47a6-873f-bed77d6bdff2",
    "expires_at": "2026-10-30T19:43:44.979342Z",
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

`POST /api/driver/v1/offers/7f66fc42-122b-43a7-9dcd-f9a7858ba3c1/accept` → **200**

```json
{
  "command_id": "41686bdb-35d3-409c-8f28-a5b270eb8c07"
}
```

```json
{
  "id": "9b302ba2-545e-4a46-9838-7d94d44a90ef",
  "order_id": "84079326-a6ce-47a6-873f-bed77d6bdff2",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "bf1658ad-0a9e-4f53-93ce-64cb15f7bd36",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "bf1658ad-0a9e-4f53-93ce-64cb15f7bd36",
  "order_id": "84079326-a6ce-47a6-873f-bed77d6bdff2",
  "assignment_id": "9b302ba2-545e-4a46-9838-7d94d44a90ef",
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

`POST /api/driver/v1/work-sessions/d3ba373c-6aae-4a54-943c-b2cfed6d8e3c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:43:31Z",
    "sequence": 1793389411166
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d3ba373c-6aae-4a54-943c-b2cfed6d8e3c",
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
  "last_heartbeat_at": "2026-10-30T19:43:31.184587Z",
  "last_location_at": "2026-10-30T19:43:31.184587Z",
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
  "id": "bf1658ad-0a9e-4f53-93ce-64cb15f7bd36",
  "order_id": "84079326-a6ce-47a6-873f-bed77d6bdff2",
  "assignment_id": "9b302ba2-545e-4a46-9838-7d94d44a90ef",
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

`POST /api/driver/v1/trips/bf1658ad-0a9e-4f53-93ce-64cb15f7bd36/arrive` → **200**

```json
{
  "command_id": "9d23bca0-1141-491d-910b-73d333fdd679",
  "expected_version": 0
}
```

```json
{
  "id": "bf1658ad-0a9e-4f53-93ce-64cb15f7bd36",
  "order_id": "84079326-a6ce-47a6-873f-bed77d6bdff2",
  "assignment_id": "9b302ba2-545e-4a46-9838-7d94d44a90ef",
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
  "arrived_at": "2026-10-30T19:43:31.776272Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/bf1658ad-0a9e-4f53-93ce-64cb15f7bd36/start` → **200**

```json
{
  "command_id": "8dd5c6cd-ed2d-44a9-aeb6-f2dbf982b06b",
  "expected_version": 1
}
```

```json
{
  "id": "bf1658ad-0a9e-4f53-93ce-64cb15f7bd36",
  "order_id": "84079326-a6ce-47a6-873f-bed77d6bdff2",
  "assignment_id": "9b302ba2-545e-4a46-9838-7d94d44a90ef",
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
  "arrived_at": "2026-10-30T19:43:31.776272Z",
  "started_at": "2026-10-30T19:43:32.069617Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

(the car drives 48 s to the next point)

`POST /api/driver/v1/work-sessions/d3ba373c-6aae-4a54-943c-b2cfed6d8e3c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:44:20Z",
    "sequence": 1793389460388
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d3ba373c-6aae-4a54-943c-b2cfed6d8e3c",
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
  "last_heartbeat_at": "2026-10-30T19:44:20.406016Z",
  "last_location_at": "2026-10-30T19:44:20.406016Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/bf1658ad-0a9e-4f53-93ce-64cb15f7bd36/complete` → **200**

```json
{
  "command_id": "8abee0eb-086b-4082-b7d4-ab1ac8dc6250",
  "expected_version": 2,
  "reported_at": "2026-10-30T19:44:20Z",
  "cash_received": true
}
```

```json
{
  "id": "bf1658ad-0a9e-4f53-93ce-64cb15f7bd36",
  "order_id": "84079326-a6ce-47a6-873f-bed77d6bdff2",
  "assignment_id": "9b302ba2-545e-4a46-9838-7d94d44a90ef",
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
  "arrived_at": "2026-10-30T19:43:31.776272Z",
  "started_at": "2026-10-30T19:43:32.069617Z",
  "completed_at": "2026-10-30T19:44:20.695574Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/84079326-a6ce-47a6-873f-bed77d6bdff2/rating` → **200**

```json
{
  "command_id": "241c0ff6-efce-413a-a024-5cdd4f87242a",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "84079326-a6ce-47a6-873f-bed77d6bdff2",
  "score": 5,
  "created_at": "2026-10-30T19:44:20.993434029Z"
}
```

`POST /api/driver/v1/orders/84079326-a6ce-47a6-873f-bed77d6bdff2/rating` → **200**

```json
{
  "command_id": "092d2eec-a244-46d0-bd81-6733c86eb9d0",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "84079326-a6ce-47a6-873f-bed77d6bdff2",
  "score": 4,
  "created_at": "2026-10-30T19:44:21.278868374Z"
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
  "session_id": "b5c2b4ce-aa98-454f-a704-52cde48b515a",
  "subject": {
    "type": "STAFF",
    "id": "bbeb0bd1-546e-4687-8aa4-9df00ff27005"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYmViMGJkMS01NDZlLTQ2ODctOGFhNC05ZGYwMGZmMjcwMDUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTAzNjIsImlhdCI6MTc5MzM4OTQ2MiwianRpIjoiYTJiNjlmMGEtN2MzYS00NWJlLWFlZjktNjdhZjdkZmZlOGZlIiwic2lkIjoiYjVjMmI0Y2UtYWE5OC00NTRmLWE3MDQtNTJjZGU0OGI1MTVhIn0.Cfn_IkChErb134Y4-3oqfZSCD8BIMH6Pp8HT1HGjrw4",
  "access_expires_at": "2026-10-30T19:59:22.140590548Z",
  "refresh_token": "CzUBhS_WTSZ6SCgI9atmpubC1bQQ1kQ9qnybOhwoca4",
  "refresh_expires_at": "2026-10-31T07:44:22.140043085Z",
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
  "session_id": "8af3bdbd-abd5-48b4-bed2-5af3f7550843",
  "subject": {
    "type": "STAFF",
    "id": "bbeb0bd1-546e-4687-8aa4-9df00ff27005"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYmViMGJkMS01NDZlLTQ2ODctOGFhNC05ZGYwMGZmMjcwMDUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTAzNjIsImlhdCI6MTc5MzM4OTQ2MiwianRpIjoiOTc2ZTgxYWYtMmQzNi00MzYyLWFkMjYtNTk4NTI2NTA5MGQxIiwic2lkIjoiOGFmM2JkYmQtYWJkNS00OGI0LWJlZDItNWFmM2Y3NTUwODQzIn0.5NKhqgobq5LmIg8GSqkBltJBTEiscZuA-4N7qk01EHY",
  "access_expires_at": "2026-10-30T19:59:22.72625444Z",
  "refresh_token": "Sq9i-R6BP7K25wk0KbFp7Kka_XIsrt-nfXqPRVBUbz8",
  "refresh_expires_at": "2026-10-31T07:44:22.725735751Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/84079326-a6ce-47a6-873f-bed77d6bdff2/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "84079326-a6ce-47a6-873f-bed77d6bdff2",
      "author_type": "RIDER",
      "author_id": "89307dcb-d509-4f04-979d-bcc30f049915",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-30T19:44:20.993434Z"
    },
    {
      "order_id": "84079326-a6ce-47a6-873f-bed77d6bdff2",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "89307dcb-d509-4f04-979d-bcc30f049915",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-30T19:44:21.278868Z"
    }
  ]
}
```

Done: ratings for order 84079326-a6ce-47a6-873f-bed77d6bdff2.

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
  "session_id": "6c8aaa5f-8086-4afe-bd07-039dcaae0d23",
  "subject": {
    "type": "STAFF",
    "id": "bbeb0bd1-546e-4687-8aa4-9df00ff27005"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYmViMGJkMS01NDZlLTQ2ODctOGFhNC05ZGYwMGZmMjcwMDUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTAzNjMsImlhdCI6MTc5MzM4OTQ2MywianRpIjoiNGUxMWQ5ZjItOTQzOC00NmEwLWE0NzYtMDIyNzA5ZjI3MDQxIiwic2lkIjoiNmM4YWFhNWYtODA4Ni00YWZlLWJkMDctMDM5ZGNhYWUwZDIzIn0.dYxAs-ydOiVtMWg0DkU0eLdLxM1ll3OiXxyYlribvaE",
  "access_expires_at": "2026-10-30T19:59:23.606037682Z",
  "refresh_token": "VpUscd7SWk_lVW4U0mnckyyN6a6o2fCpfWtveDjdaxY",
  "refresh_expires_at": "2026-10-31T07:44:23.605494346Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "d885efe7-f878-4fc7-918a-08f5ca0f3929",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "417bcaf2-c4aa-4d7f-90b0-23ebb1934c08",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T19:44:23.894578Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/417bcaf2-c4aa-4d7f-90b0-23ebb1934c08` → **200**

```json
{
  "id": "417bcaf2-c4aa-4d7f-90b0-23ebb1934c08",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T19:44:23.894578Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/417bcaf2-c4aa-4d7f-90b0-23ebb1934c08` → **200**

```json
{
  "id": "417bcaf2-c4aa-4d7f-90b0-23ebb1934c08",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T19:44:23.894578Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/417bcaf2-c4aa-4d7f-90b0-23ebb1934c08` → **200**

```json
{
  "id": "417bcaf2-c4aa-4d7f-90b0-23ebb1934c08",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T19:44:23.894578Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/417bcaf2-c4aa-4d7f-90b0-23ebb1934c08` → **200**

```json
{
  "id": "417bcaf2-c4aa-4d7f-90b0-23ebb1934c08",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T19:44:23.894578Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/417bcaf2-c4aa-4d7f-90b0-23ebb1934c08` → **200**

```json
{
  "id": "417bcaf2-c4aa-4d7f-90b0-23ebb1934c08",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-30.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-30T19:44:23.894578Z",
  "ready_at": "2026-10-30T19:44:28.60068Z",
  "expires_at": "2026-10-31T19:44:28.60068Z"
}
```

`GET /api/admin/v1/reports/exports/417bcaf2-c4aa-4d7f-90b0-23ebb1934c08/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-30,33,12,21,0,0,28,5,0,30,2,0,1,7,1,13
total,33,12,21,0,0,28,5,0,30,2,0,1,7,1,13
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "41c7affa-5497-44ba-b81a-c281f5d11a0e",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "9151004a-ba82-444d-87d5-656cc82d6922",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T19:44:29.600193Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/9151004a-ba82-444d-87d5-656cc82d6922` → **200**

```json
{
  "id": "9151004a-ba82-444d-87d5-656cc82d6922",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T19:44:29.600193Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/9151004a-ba82-444d-87d5-656cc82d6922` → **200**

```json
{
  "id": "9151004a-ba82-444d-87d5-656cc82d6922",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T19:44:29.600193Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/9151004a-ba82-444d-87d5-656cc82d6922` → **200**

```json
{
  "id": "9151004a-ba82-444d-87d5-656cc82d6922",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T19:44:29.600193Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/9151004a-ba82-444d-87d5-656cc82d6922` → **200**

```json
{
  "id": "9151004a-ba82-444d-87d5-656cc82d6922",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-30.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-30T19:44:29.600193Z",
  "ready_at": "2026-10-30T19:44:33.607487Z",
  "expires_at": "2026-10-31T19:44:33.607487Z"
}
```

`GET /api/admin/v1/reports/exports/9151004a-ba82-444d-87d5-656cc82d6922/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-30,UAH,12,1655.51,130.74,248.37,1407.14,10.52,0.00,325.94,182.97,900.17,50.00,105.17
total,UAH,12,1655.51,130.74,248.37,1407.14,10.52,0.00,325.94,182.97,900.17,50.00,105.17
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/2a7fea34-fd61-407c-a746-04593f38ffee` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/2a7fea34-fd61-407c-a746-04593f38ffee",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "9f16623f-4670-46dc-b96b-cffdf73c94a9"
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
  "session_id": "e7b8bb79-1a90-4583-8131-3f7249cabcfc",
  "subject": {
    "type": "STAFF",
    "id": "bbeb0bd1-546e-4687-8aa4-9df00ff27005"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYmViMGJkMS01NDZlLTQ2ODctOGFhNC05ZGYwMGZmMjcwMDUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTAzNzQsImlhdCI6MTc5MzM4OTQ3NCwianRpIjoiOGNjOTIyNzItMWRlNS00YTE5LWI4OGMtMzhkODNmZDgzODVjIiwic2lkIjoiZTdiOGJiNzktMWE5MC00NTgzLTgxMzEtM2Y3MjQ5Y2FiY2ZjIn0.x-D_c6KV0HOvbQb_V8-g4UrxNCLYEAC_Fs1hlKEdgEo",
  "access_expires_at": "2026-10-30T19:59:34.669896421Z",
  "refresh_token": "mqK9-Jg5RxrpkhoxPSb7jkbMX91rwFrklLhRFJcADQo",
  "refresh_expires_at": "2026-10-31T07:44:34.669357423Z",
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
  "command_id": "5015615d-e718-457a-b121-025056cd9892",
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
  "changed_by": "bbeb0bd1-546e-4687-8aa4-9df00ff27005",
  "reason": "Sandbox retention boundary",
  "changed_at": "2026-10-30T19:44:35.254379406Z"
}
```

`POST /sandbox/v1/retention/fixtures/5351c8bb-f24c-4aa7-864c-3d8d7dba2d0a` → **200**

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

`GET /sandbox/v1/retention/fixtures/5351c8bb-f24c-4aa7-864c-3d8d7dba2d0a` → **200**

```json
{
  "old_done": 0,
  "recent_done": 1,
  "failed": 1
}
```

Old DONE event removed; recent DONE and old FAILED events retained. Policy and synthetic fixtures restored on exit.

`DELETE /sandbox/v1/retention/fixtures/5351c8bb-f24c-4aa7-864c-3d8d7dba2d0a` → **204**

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
  "changed_by": "bbeb0bd1-546e-4687-8aa4-9df00ff27005",
  "reason": "Sandbox retention boundary",
  "changed_at": "2026-10-30T19:44:35.254379Z"
}
```

`PUT /api/admin/v1/retention` → **200**

```json
{
  "command_id": "80866435-49b7-4cc5-8e2f-c1cc83044ead",
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
  "changed_by": "bbeb0bd1-546e-4687-8aa4-9df00ff27005",
  "reason": "Restore policy after retention sandbox",
  "changed_at": "2026-10-30T19:44:35.942265024Z"
}
```

# Scenario: risk-flag

## The driver starts a new shift in Kyiv

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-18150"
}
```

```json
{
  "challenge_id": "78b52c5a-1642-41c8-bb7f-ae2bc618a750",
  "expires_at": "2026-10-30T19:49:36.240575253Z",
  "resend_available_at": "2026-10-30T19:44:37.240575253Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "417813",
  "sent_at": "2026-10-30T19:44:36.245450244Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "78b52c5a-1642-41c8-bb7f-ae2bc618a750",
  "code": "417813",
  "device_ref": "sandbox-18150"
}
```

```json
{
  "session_id": "6ad285bb-2d8a-415d-84f1-ffc4941ee054",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM5MDM3NiwiaWF0IjoxNzkzMzg5NDc2LCJqdGkiOiJmYTkzNmYxZS05ZGI1LTQ1OTUtOWY3MS03YzY5NTgyZWFmNDMiLCJzaWQiOiI2YWQyODViYi0yZDhhLTQxNWQtODRmMS1mZmM0OTQxZWUwNTQifQ.TvTuWOYFBPIQpg-TlB8jyO0TNUFc9gj8O-1_DsWi-3o",
  "access_expires_at": "2026-10-30T19:59:36.557739192Z",
  "refresh_token": "inT9WfC8FfRgNs2CvsW8DO4wIAPcQjir7bg7SOS9yLw",
  "refresh_expires_at": "2026-11-29T19:44:36.557214261Z",
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
  "command_id": "0ae70a9a-b72c-4e14-b995-1b3bcf5f6cfd",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:44:37Z",
    "sequence": 1793389477408
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "2bbd7350-e98b-41cc-90f4-6e7640063db0",
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
  "last_heartbeat_at": "2026-10-30T19:44:37.4269Z",
  "last_location_at": "2026-10-30T19:44:37.4269Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "f48e4ec6-3303-4182-ae11-b0d778428f9b",
  "points": [
    {
      "sequence": 1793389479740,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-30T19:43:39Z"
    },
    {
      "sequence": 1793389479747,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-30T19:44:39Z"
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
  "session_id": "2d9a0196-244c-4f45-a007-03e96e1949dc",
  "subject": {
    "type": "STAFF",
    "id": "bbeb0bd1-546e-4687-8aa4-9df00ff27005"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYmViMGJkMS01NDZlLTQ2ODctOGFhNC05ZGYwMGZmMjcwMDUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTAzODAsImlhdCI6MTc5MzM4OTQ4MCwianRpIjoiZTY2NmM5M2MtM2FmZS00ZTg0LWEzZWItZTM3ZmJlZGE3N2NiIiwic2lkIjoiMmQ5YTAxOTYtMjQ0Yy00ZjQ1LWEwMDctMDNlOTZlMTk0OWRjIn0.g9EcY2qKRRkA5mCsqbFGztitaFLq06HOBRIGOo9AHew",
  "access_expires_at": "2026-10-30T19:59:40.375530248Z",
  "refresh_token": "cyvC2GL-mWD4OkZmtKgmlyjdimJxKZ6qNZm3610VxZM",
  "refresh_expires_at": "2026-10-31T07:44:40.374877834Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "22024011-2052-43e6-84cf-63036d090e88",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-30T19:44:39Z",
        "track_point_id": "d708e32b-e7f6-45c5-a538-f3b35e003a6e",
        "work_session_id": "2bbd7350-e98b-41cc-90f4-6e7640063db0"
      },
      "raised_by": null,
      "raised_at": "2026-10-30T19:44:39Z",
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

`POST /api/admin/v1/driver-risk-flags/22024011-2052-43e6-84cf-63036d090e88/confirm` → **200**

```json
{
  "command_id": "c180e3e8-6844-4ef0-a137-683cf2a6190e",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "22024011-2052-43e6-84cf-63036d090e88",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-30T19:44:39Z",
    "track_point_id": "d708e32b-e7f6-45c5-a538-f3b35e003a6e",
    "work_session_id": "2bbd7350-e98b-41cc-90f4-6e7640063db0"
  },
  "raised_by": null,
  "raised_at": "2026-10-30T19:44:39Z",
  "reason": null,
  "reviewed_by": "bbeb0bd1-546e-4687-8aa4-9df00ff27005",
  "reviewed_at": "2026-10-30T19:44:41.274394Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/22024011-2052-43e6-84cf-63036d090e88/dismiss` → **409**

```json
{
  "command_id": "f1918338-41fa-47cd-b61b-14d9c9d330bd",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/22024011-2052-43e6-84cf-63036d090e88/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "1220254f-e83a-4498-8976-5a737cf4d96a"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "c0a733e7-7077-4bf2-9f60-ae4ee3815169",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "cc6438e2-d48e-4696-97ae-3c8156bca90b",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "bbeb0bd1-546e-4687-8aa4-9df00ff27005",
  "raised_at": "2026-10-30T19:44:42.012241Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/cc6438e2-d48e-4696-97ae-3c8156bca90b/dismiss` → **200**

```json
{
  "command_id": "8562b436-69cb-490f-9b3b-cb2f8adefac3",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "cc6438e2-d48e-4696-97ae-3c8156bca90b",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "bbeb0bd1-546e-4687-8aa4-9df00ff27005",
  "raised_at": "2026-10-30T19:44:42.012241Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "bbeb0bd1-546e-4687-8aa4-9df00ff27005",
  "reviewed_at": "2026-10-30T19:44:42.310932Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "00c9291e-52c2-402a-8442-80970f756e9c",
  "expected_version": 15,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "22024011-2052-43e6-84cf-63036d090e88"
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
      "actor_id": "bbeb0bd1-546e-4687-8aa4-9df00ff27005",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T19:44:42.625816Z"
    }
  ],
  "duplicates": []
}
```

Done: flag 22024011-2052-43e6-84cf-63036d090e88 confirmed, suspension named it, driver reinstated.

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
  "session_id": "b8258b9f-0a66-4df4-b8bc-ddaf2a7fa787",
  "subject": {
    "type": "STAFF",
    "id": "bbeb0bd1-546e-4687-8aa4-9df00ff27005"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYmViMGJkMS01NDZlLTQ2ODctOGFhNC05ZGYwMGZmMjcwMDUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTAzODMsImlhdCI6MTc5MzM4OTQ4MywianRpIjoiZjBhODEwZDQtMTc2Mi00MGVkLTk3MTktZTg3MzZkY2EzODZkIiwic2lkIjoiYjgyNThiOWYtMGE2Ni00ZGY0LWI4YmMtZGRhZjJhN2ZhNzg3In0.OhMNFWfpcrcP1SIPFiQgPYh7fkoyJajJZaM8o1fNToE",
  "access_expires_at": "2026-10-30T19:59:43.525048601Z",
  "refresh_token": "e4GvyIaWxn9iQjRNazZIAZtBNPtd___0JxonhDSJKuQ",
  "refresh_expires_at": "2026-10-31T07:44:43.524436812Z",
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
      "actor_id": "bbeb0bd1-546e-4687-8aa4-9df00ff27005",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T19:44:42.625816Z"
    }
  ],
  "duplicates": []
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "d9ba6302-64f1-4d7d-8085-c6fa73063486",
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
  "session_id": "2bbd7350-e98b-41cc-90f4-6e7640063db0",
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
  "last_heartbeat_at": "2026-10-30T19:44:37.4269Z",
  "last_location_at": "2026-10-30T19:44:37.4269Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2bbd7350-e98b-41cc-90f4-6e7640063db0/close` → **200**

```json
{
  "command_id": "673a236d-0339-4e60-8d10-d3aa1f2b8beb",
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
  "session_id": "4594f330-ff6f-417f-8c6e-0983e0ca48eb",
  "subject": {
    "type": "STAFF",
    "id": "bbeb0bd1-546e-4687-8aa4-9df00ff27005"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYmViMGJkMS01NDZlLTQ2ODctOGFhNC05ZGYwMGZmMjcwMDUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTAzODUsImlhdCI6MTc5MzM4OTQ4NSwianRpIjoiNzkyNjgzNDgtNjdiZS00NzNiLWI5NTItMzBiNTM4YjY2OTZhIiwic2lkIjoiNDU5NGYzMzAtZmY2Zi00MTdmLThjNmUtMDk4M2UwY2E0OGViIn0.k7nrHeMvJkl2-Fh8wL-gQDgg9CMlT5u5pUmilszlZew",
  "access_expires_at": "2026-10-30T19:59:45.301159231Z",
  "refresh_token": "aGZi1EpWiOgzT7sLqW7rBzzZnncdzXZGSNuqiDSRoX0",
  "refresh_expires_at": "2026-10-31T07:44:45.300658776Z",
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
  "command_id": "ff267b8c-4276-4855-aa52-d4ef4aaf5818",
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
  "changed_by": "bbeb0bd1-546e-4687-8aa4-9df00ff27005",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T19:44:45.871256Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "ff267b8c-4276-4855-aa52-d4ef4aaf5818",
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
  "changed_by": "bbeb0bd1-546e-4687-8aa4-9df00ff27005",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T19:44:45.871256Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48561385584",
  "device_ref": "sandbox-16298"
}
```

```json
{
  "challenge_id": "2aac0412-ebee-45cc-a489-c9dd320c607e",
  "expires_at": "2026-10-30T19:49:46.457905011Z",
  "resend_available_at": "2026-10-30T19:44:47.457905011Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48561385584` → **200**

```json
{
  "phone": "+48561385584",
  "audience": "CLIENT",
  "code": "670580",
  "sent_at": "2026-10-30T19:44:46.460383014Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2aac0412-ebee-45cc-a489-c9dd320c607e",
  "code": "670580",
  "device_ref": "sandbox-16298"
}
```

```json
{
  "session_id": "de998b5a-b026-452f-bce2-554a31cd09d5",
  "subject": {
    "type": "CLIENT",
    "id": "fec24825-f2cf-4ad1-955c-81106748a043"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZWMyNDgyNS1mMmNmLTRhZDEtOTU1Yy04MTEwNjc0OGEwNDMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzkwMzg2LCJpYXQiOjE3OTMzODk0ODYsImp0aSI6ImFkOWNlZjM5LTYwZWUtNGZmNS04MDc1LTQzYjMwMGJkNTI1ZSIsInNpZCI6ImRlOTk4YjVhLWIwMjYtNDUyZi1iY2UyLTU1NGEzMWNkMDlkNSJ9.ztRHWjd9HuWO5r60rGNnsB3qk4p44y8Qz0Yh2R0NhEw",
  "access_expires_at": "2026-10-30T19:59:46.771614751Z",
  "refresh_token": "Fz_blBtXRyVspHPJmSU0eTto_tDdA9xeNkYkfKEavqY",
  "refresh_expires_at": "2026-11-29T19:44:46.77107394Z",
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
  "correlation_id": "7a3ace9d-a04e-4e3d-870d-f99a67e66c05"
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
  "device_ref": "sandbox-13858"
}
```

```json
{
  "challenge_id": "29d5c526-31f8-4609-b8cc-24a158bd21ef",
  "expires_at": "2026-10-30T19:49:47.613330574Z",
  "resend_available_at": "2026-10-30T19:44:48.613330574Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "801214",
  "sent_at": "2026-10-30T19:44:47.616679587Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "29d5c526-31f8-4609-b8cc-24a158bd21ef",
  "code": "801214",
  "device_ref": "sandbox-13858"
}
```

```json
{
  "session_id": "1a266843-ec46-4cac-a7dd-d4a5f1c559c5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM5MDM4NywiaWF0IjoxNzkzMzg5NDg3LCJqdGkiOiJjZTM3ZGE5Yi1kNTlmLTRhMTYtODg2OS1hYjFmMWY2ODNlZmYiLCJzaWQiOiIxYTI2Njg0My1lYzQ2LTRjYWMtYTdkZC1kNGE1ZjFjNTU5YzUifQ.f9tiMsfNs-j2CltKA64xpRmDYnEFtV8zZBsloypKYV8",
  "access_expires_at": "2026-10-30T19:59:47.928612596Z",
  "refresh_token": "OQcXdQDx2Du1xhXK5_6V-Toh3fF9xAEeg3jQczfJ4RU",
  "refresh_expires_at": "2026-11-29T19:44:47.92808528Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "bfeae3af-1505-413d-b82d-9a20a7a50174",
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
  "last_heartbeat_at": "2026-10-30T19:43:24.969272Z",
  "last_location_at": "2026-10-30T19:43:24.969272Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/bfeae3af-1505-413d-b82d-9a20a7a50174/handover` → **200**

```json
{
  "command_id": "a85b70af-97f4-421e-8b45-d4f95bf7d170",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "bfeae3af-1505-413d-b82d-9a20a7a50174",
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
  "last_heartbeat_at": "2026-10-30T19:43:24.969272Z",
  "last_location_at": "2026-10-30T19:43:24.969272Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/bfeae3af-1505-413d-b82d-9a20a7a50174/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:44:48Z",
    "sequence": 1793389488788
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "bfeae3af-1505-413d-b82d-9a20a7a50174",
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
  "last_heartbeat_at": "2026-10-30T19:44:48.805394Z",
  "last_location_at": "2026-10-30T19:44:48.805394Z",
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
  "session_id": "bfeae3af-1505-413d-b82d-9a20a7a50174",
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
  "last_heartbeat_at": "2026-10-30T19:44:48.805394Z",
  "last_location_at": "2026-10-30T19:44:48.805394Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/bfeae3af-1505-413d-b82d-9a20a7a50174/close` → **200**

```json
{
  "command_id": "22f41068-49ee-4449-80cc-13fc8afe5067",
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
  "correlation_id": "8f6d106f-ff41-4d4d-af9b-d5e7be176d83"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676987834",
  "device_ref": "sandbox-1551"
}
```

```json
{
  "challenge_id": "932d1ae0-735a-4c84-81dc-4ec74e537a48",
  "expires_at": "2026-10-30T19:49:50.230003261Z",
  "resend_available_at": "2026-10-30T19:44:51.230003261Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380676987834` → **200**

```json
{
  "phone": "+380676987834",
  "audience": "CLIENT",
  "code": "613466",
  "sent_at": "2026-10-30T19:44:50.232573132Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "932d1ae0-735a-4c84-81dc-4ec74e537a48",
  "code": "613466",
  "device_ref": "sandbox-1551"
}
```

```json
{
  "session_id": "75d9f013-40b5-4c45-abb5-25235aa45c11",
  "subject": {
    "type": "CLIENT",
    "id": "cfdd27c4-00c4-40c7-95e0-7d6098673c9b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZmRkMjdjNC0wMGM0LTQwYzctOTVlMC03ZDYwOTg2NzNjOWIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzkwMzkwLCJpYXQiOjE3OTMzODk0OTAsImp0aSI6IjRmNDI5M2ZmLTA1MzUtNGIzNi1iYjM1LTc3YTAzYzg1ZmZmYiIsInNpZCI6Ijc1ZDlmMDEzLTQwYjUtNGM0NS1hYmI1LTI1MjM1YWE0NWMxMSJ9.nFzaap9eBhxK8tnAY2wamLW6WTUQL-U5xNocWBvvxbU",
  "access_expires_at": "2026-10-30T19:59:50.536129639Z",
  "refresh_token": "eS6z4GQcKQfyGm4hxGcf0O5jO3kBbLqs9wKNMk2aa4k",
  "refresh_expires_at": "2026-11-29T19:44:50.53560044Z",
  "account_created": true
}
```

## The EICAR antivirus test file is refused by the antivirus

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "06a7dcca-6fcc-4b8a-9f6c-18cd44a9fc8c",
  "content_type": "application/pdf",
  "size_bytes": 86
}
```

```json
{
  "file_id": "1a070103-faca-4218-b000-a6fa4291908a",
  "upload_path": "/api/rider/v1/uploads/1a070103-faca-4218-b000-a6fa4291908a",
  "expires_at": "2026-10-30T19:59:50.82468187Z",
  "max_bytes": 86
}
```

`PUT /api/rider/v1/uploads/1a070103-faca-4218-b000-a6fa4291908a` → **200**

```json
{
  "file_id": "1a070103-faca-4218-b000-a6fa4291908a",
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
  "command_id": "6b4a8f9d-5d5b-40c7-8481-b2707c1a46fb",
  "content_type": "application/pdf",
  "size_bytes": 92
}
```

```json
{
  "file_id": "61d9f335-619e-445f-adff-085ccbe51c9b",
  "upload_path": "/api/rider/v1/uploads/61d9f335-619e-445f-adff-085ccbe51c9b",
  "expires_at": "2026-10-30T19:59:51.134216687Z",
  "max_bytes": 92
}
```

`PUT /api/rider/v1/uploads/61d9f335-619e-445f-adff-085ccbe51c9b` → **200**

```json
{
  "file_id": "61d9f335-619e-445f-adff-085ccbe51c9b",
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
  "command_id": "09134428-b09c-4bd0-9f5a-cf21bf87802d",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "b3fcc678-cc24-422e-8ca9-7e3bd42d31bc",
  "upload_path": "/api/rider/v1/uploads/b3fcc678-cc24-422e-8ca9-7e3bd42d31bc",
  "expires_at": "2026-10-30T19:59:51.444127554Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/b3fcc678-cc24-422e-8ca9-7e3bd42d31bc` → **200**

```json
{
  "file_id": "b3fcc678-cc24-422e-8ca9-7e3bd42d31bc",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "81df9ab9-8f04-4d36-9e94-fe7b52056c68",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "b3fcc678-cc24-422e-8ca9-7e3bd42d31bc"
  ]
}
```

```json
{
  "id": "dc0442e3-ce68-4312-b67a-a0eba76886e2",
  "number": 4,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "cfdd27c4-00c4-40c7-95e0-7d6098673c9b",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T19:44:51.742663Z",
  "updated_at": "2026-10-30T19:44:51.742663Z",
  "respond_by": "2026-10-30T23:44:51.742663Z",
  "messages": [
    {
      "id": "0eab6698-046e-4360-b4f8-c83541e208d1",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "cfdd27c4-00c4-40c7-95e0-7d6098673c9b",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T19:44:51.74331Z",
      "attachments": [
        {
          "file_id": "b3fcc678-cc24-422e-8ca9-7e3bd42d31bc",
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
  "session_id": "48f1531e-cee3-41e6-bfcb-ac0e8744c042",
  "subject": {
    "type": "STAFF",
    "id": "bbeb0bd1-546e-4687-8aa4-9df00ff27005"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYmViMGJkMS01NDZlLTQ2ODctOGFhNC05ZGYwMGZmMjcwMDUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTAzOTIsImlhdCI6MTc5MzM4OTQ5MiwianRpIjoiZmViZGZhZjItZDExYS00M2RmLTkzMGItZGY2Yzk3Yjk1YmZjIiwic2lkIjoiNDhmMTUzMWUtY2VlMy00MWU2LWJmY2ItYWMwZTg3NDRjMDQyIn0.AWIpvkINxzxtIDoYfdvVCSYXbCmcj6LwhL17yymotTc",
  "access_expires_at": "2026-10-30T19:59:52.32821787Z",
  "refresh_token": "j-84XObhr1K9evlwnvI3rXsNJsbaQbRjNIkhbZLRpnI",
  "refresh_expires_at": "2026-10-31T07:44:52.327678726Z",
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
  "session_id": "a142204f-add7-422f-9a84-421341a9ed46",
  "subject": {
    "type": "STAFF",
    "id": "bbeb0bd1-546e-4687-8aa4-9df00ff27005"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYmViMGJkMS01NDZlLTQ2ODctOGFhNC05ZGYwMGZmMjcwMDUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTAzOTIsImlhdCI6MTc5MzM4OTQ5MiwianRpIjoiNmRmMjEzYTQtYjQxNC00M2VlLThkNGUtZDBlN2Y0ZTJmNDkzIiwic2lkIjoiYTE0MjIwNGYtYWRkNy00MjJmLTlhODQtNDIxMzQxYTllZDQ2In0.JIVyxQxQo37ax33B_7opcgktt53y4ttHzmhRG2BJ2qw",
  "access_expires_at": "2026-10-30T19:59:52.896910732Z",
  "refresh_token": "Msmr7rNWmWzF7kU0D7_mcJ0um3R73k5qeI1UN2-JP_g",
  "refresh_expires_at": "2026-10-31T07:44:52.896396711Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/dc0442e3-ce68-4312-b67a-a0eba76886e2/attachments/b3fcc678-cc24-422e-8ca9-7e3bd42d31bc` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "ba661691-6921-44aa-804f-e57c06efc8a7",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "34d7002e-38ee-4597-a1e3-c0999cbb35ac",
  "upload_path": "/api/operator/v1/uploads/34d7002e-38ee-4597-a1e3-c0999cbb35ac",
  "expires_at": "2026-10-30T19:59:53.189589977Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/34d7002e-38ee-4597-a1e3-c0999cbb35ac` → **200**

```json
{
  "file_id": "34d7002e-38ee-4597-a1e3-c0999cbb35ac",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/dc0442e3-ce68-4312-b67a-a0eba76886e2` → **200**

```json
{
  "id": "dc0442e3-ce68-4312-b67a-a0eba76886e2",
  "number": 4,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "cfdd27c4-00c4-40c7-95e0-7d6098673c9b",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T19:44:51.742663Z",
  "updated_at": "2026-10-30T19:44:51.742663Z",
  "respond_by": "2026-10-30T23:44:51.742663Z",
  "messages": [
    {
      "id": "0eab6698-046e-4360-b4f8-c83541e208d1",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "cfdd27c4-00c4-40c7-95e0-7d6098673c9b",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T19:44:51.74331Z",
      "attachments": [
        {
          "file_id": "b3fcc678-cc24-422e-8ca9-7e3bd42d31bc",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/dc0442e3-ce68-4312-b67a-a0eba76886e2/comments` → **200**

```json
{
  "command_id": "f0a23348-2a6c-442e-9d99-66b553d90405",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "34d7002e-38ee-4597-a1e3-c0999cbb35ac"
  ]
}
```

```json
{
  "id": "dc0442e3-ce68-4312-b67a-a0eba76886e2",
  "number": 4,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "cfdd27c4-00c4-40c7-95e0-7d6098673c9b",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T19:44:51.742663Z",
  "updated_at": "2026-10-30T19:44:53.791894Z",
  "respond_by": "2026-10-30T23:44:51.742663Z",
  "messages": [
    {
      "id": "0eab6698-046e-4360-b4f8-c83541e208d1",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "cfdd27c4-00c4-40c7-95e0-7d6098673c9b",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T19:44:51.74331Z",
      "attachments": [
        {
          "file_id": "b3fcc678-cc24-422e-8ca9-7e3bd42d31bc",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "86061b13-5f94-4215-b046-9aa09c98c991",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "bbeb0bd1-546e-4687-8aa4-9df00ff27005",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T19:44:53.791445Z",
      "attachments": [
        {
          "file_id": "34d7002e-38ee-4597-a1e3-c0999cbb35ac",
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

`GET /api/rider/v1/support/cases/dc0442e3-ce68-4312-b67a-a0eba76886e2` → **200**

```json
{
  "id": "dc0442e3-ce68-4312-b67a-a0eba76886e2",
  "number": 4,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "cfdd27c4-00c4-40c7-95e0-7d6098673c9b",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T19:44:51.742663Z",
  "updated_at": "2026-10-30T19:44:53.791894Z",
  "respond_by": "2026-10-30T23:44:51.742663Z",
  "messages": [
    {
      "id": "0eab6698-046e-4360-b4f8-c83541e208d1",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "cfdd27c4-00c4-40c7-95e0-7d6098673c9b",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T19:44:51.74331Z",
      "attachments": [
        {
          "file_id": "b3fcc678-cc24-422e-8ca9-7e3bd42d31bc",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "86061b13-5f94-4215-b046-9aa09c98c991",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T19:44:53.791445Z",
      "attachments": [
        {
          "file_id": "34d7002e-38ee-4597-a1e3-c0999cbb35ac",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/dc0442e3-ce68-4312-b67a-a0eba76886e2/attachments/34d7002e-38ee-4597-a1e3-c0999cbb35ac` → **200**

Done: support case dc0442e3-ce68-4312-b67a-a0eba76886e2, rider attachment b3fcc678-cc24-422e-8ca9-7e3bd42d31bc, operator attachment 34d7002e-38ee-4597-a1e3-c0999cbb35ac.

# Scenario: switch-to-cash

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380735712657",
  "device_ref": "sandbox-3681"
}
```

```json
{
  "challenge_id": "778d1502-aea9-4c7a-aa9c-46ce7bf76c43",
  "expires_at": "2026-10-30T19:49:54.402090357Z",
  "resend_available_at": "2026-10-30T19:44:55.402090357Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380735712657` → **200**

```json
{
  "phone": "+380735712657",
  "audience": "CLIENT",
  "code": "836373",
  "sent_at": "2026-10-30T19:44:54.405923132Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "778d1502-aea9-4c7a-aa9c-46ce7bf76c43",
  "code": "836373",
  "device_ref": "sandbox-3681"
}
```

```json
{
  "session_id": "e1c85344-d838-44bf-be55-c42752b7e2a9",
  "subject": {
    "type": "CLIENT",
    "id": "30358735-bd64-464f-9fab-851d1b0ea00d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMDM1ODczNS1iZDY0LTQ2NGYtOWZhYi04NTFkMWIwZWEwMGQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzkwMzk0LCJpYXQiOjE3OTMzODk0OTQsImp0aSI6ImY1MDkxZDUxLTg2M2QtNDg2OC1hYmI2LTc5MjI3ODc1NjYwOCIsInNpZCI6ImUxYzg1MzQ0LWQ4MzgtNDRiZi1iZTU1LWM0Mjc1MmI3ZTJhOSJ9.5XTN0t9OweB7sQYseBGRZ8xzG2BV-dYLU-8QdFyEeMM",
  "access_expires_at": "2026-10-30T19:59:54.709702759Z",
  "refresh_token": "ZPnm-rT-fRkkOojH9CZeT_H8MIFwK_ogmkJgu0qPfS0",
  "refresh_expires_at": "2026-11-29T19:44:54.709126633Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "902c1399-9b22-43be-bb79-78c66faada8a",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "e1c82be5-d9ce-4f75-9a2e-1fddb0eadd6e",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-e1c82be5-d9ce-4f75-9a2e-1fddb0eadd6e",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "c5d4aa73eb341c35320cf6d7837e65eb",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=e1c82be5-d9ce-4f75-9a2e-1fddb0eadd6e",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380735712657"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=e1c82be5-d9ce-4f75-9a2e-1fddb0eadd6e",
  "expires_at": "2026-10-30T20:14:54.989413Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/e1c82be5-d9ce-4f75-9a2e-1fddb0eadd6e` → **200**

```json
{
  "id": "e1c82be5-d9ce-4f75-9a2e-1fddb0eadd6e",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T20:14:54.989413Z",
  "card": {
    "id": "a7f8b20a-db96-4246-93c1-09bc4cb4360e",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****9738",
    "card_type": "Visa",
    "created_at": "2026-10-30T19:44:55.274067Z"
  },
  "failure_reason": null
}
```

## The rider orders by card: the hold is taken

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "7615fa7f-5f63-4910-b138-527132bedf28",
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
  "id": "fe68701d-c686-49b4-948d-9095fa3a7e3b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T19:49:55.582906Z",
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
  "command_id": "0b3d7789-81a8-4060-8f8b-b770ad747d78",
  "quote_id": "fe68701d-c686-49b4-948d-9095fa3a7e3b",
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
  "id": "e3fc406b-80e2-4ec0-83d1-314d9c985949",
  "short_number": 36,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "30358735-bd64-464f-9fab-851d1b0ea00d",
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
  "created_at": "2026-10-30T19:44:55.873296Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e3fc406b-80e2-4ec0-83d1-314d9c985949` → **200**

```json
{
  "id": "e3fc406b-80e2-4ec0-83d1-314d9c985949",
  "short_number": 36,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "30358735-bd64-464f-9fab-851d1b0ea00d",
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
  "created_at": "2026-10-30T19:44:55.873296Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e3fc406b-80e2-4ec0-83d1-314d9c985949` → **200**

```json
{
  "id": "e3fc406b-80e2-4ec0-83d1-314d9c985949",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "30358735-bd64-464f-9fab-851d1b0ea00d",
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
  "created_at": "2026-10-30T19:44:55.873296Z",
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

`GET /api/rider/v1/orders/e3fc406b-80e2-4ec0-83d1-314d9c985949` → **200**

```json
{
  "id": "e3fc406b-80e2-4ec0-83d1-314d9c985949",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "30358735-bd64-464f-9fab-851d1b0ea00d",
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
  "created_at": "2026-10-30T19:44:55.873296Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/e3fc406b-80e2-4ec0-83d1-314d9c985949/switch-to-cash` → **200**

```json
{
  "command_id": "aa285170-a99f-4f5d-83f8-b87eed6c4cb0",
  "expected_version": 3
}
```

```json
{
  "id": "e3fc406b-80e2-4ec0-83d1-314d9c985949",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "30358735-bd64-464f-9fab-851d1b0ea00d",
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
  "created_at": "2026-10-30T19:44:55.873296Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/e3fc406b-80e2-4ec0-83d1-314d9c985949/switch-to-cash` → **409**

```json
{
  "command_id": "f8040744-3d5b-4f15-9bfe-83631b6b6d5b",
  "expected_version": 4
}
```

```json
{
  "instance": "/api/rider/v1/orders/e3fc406b-80e2-4ec0-83d1-314d9c985949/switch-to-cash",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "1b0aa502-52be-4ca3-8153-016049b37cf6"
}
```

Done: the card order became cash; a second switch is refused.

`GET /api/rider/v1/orders/e3fc406b-80e2-4ec0-83d1-314d9c985949` → **200**

```json
{
  "id": "e3fc406b-80e2-4ec0-83d1-314d9c985949",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "30358735-bd64-464f-9fab-851d1b0ea00d",
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
  "created_at": "2026-10-30T19:44:55.873296Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/e3fc406b-80e2-4ec0-83d1-314d9c985949/cancel` → **200**

```json
{
  "command_id": "7ef17856-dcbf-4658-92fe-c8efba8c523d",
  "expected_version": 4,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "e3fc406b-80e2-4ec0-83d1-314d9c985949",
  "short_number": 36,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "30358735-bd64-464f-9fab-851d1b0ea00d",
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
  "created_at": "2026-10-30T19:44:55.873296Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "uk": "Передумав їхати",
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
      "en": "Changed my mind"
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
  "session_id": "9e4f8ad0-7980-4b9c-99e5-9258eff5c46f",
  "subject": {
    "type": "STAFF",
    "id": "bbeb0bd1-546e-4687-8aa4-9df00ff27005"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYmViMGJkMS01NDZlLTQ2ODctOGFhNC05ZGYwMGZmMjcwMDUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTAzOTksImlhdCI6MTc5MzM4OTQ5OSwianRpIjoiYTY5ZjRjNjAtMWZhZS00MjBjLTg0YzMtYWY3YjAxMWJjNjkwIiwic2lkIjoiOWU0ZjhhZDAtNzk4MC00YjljLTk5ZTUtOTI1OGVmZjVjNDZmIn0.L1mciyegmjvAQGg4201eYVFdLUQcF1TXOi_LTDv132c",
  "access_expires_at": "2026-10-30T19:59:59.568614119Z",
  "refresh_token": "rGWTE3EW4KGOnJO2nAZiutwyfPBVe5tezXVrkQDBeoQ",
  "refresh_expires_at": "2026-10-31T07:44:59.568068158Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-2942"
}
```

```json
{
  "challenge_id": "a561c4e8-f55e-41a0-bede-39e2396a05b1",
  "expires_at": "2026-10-30T19:49:59.841036792Z",
  "resend_available_at": "2026-10-30T19:45:00.841036792Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "101195",
  "sent_at": "2026-10-30T19:44:59.843661269Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a561c4e8-f55e-41a0-bede-39e2396a05b1",
  "code": "101195",
  "device_ref": "sandbox-2942"
}
```

```json
{
  "session_id": "52bebf6f-8633-4b5c-92cf-329ad0cb2989",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM5MDQwMCwiaWF0IjoxNzkzMzg5NTAwLCJqdGkiOiJhNTZkYmQwZC02MDZhLTQ1MmItYjEyZS00MGE5MThiNWRmMDkiLCJzaWQiOiI1MmJlYmY2Zi04NjMzLTRiNWMtOTJjZi0zMjlhZDBjYjI5ODkifQ.PBk2RDgL5Ti97BkO1u4zRVAIZ9U1WHpHhQe3i5lcBZg",
  "access_expires_at": "2026-10-30T20:00:00.151632015Z",
  "refresh_token": "gPZ64gF88BRjsoOYOU0jE3f520UyRWr5nCmPK1vS4SA",
  "refresh_expires_at": "2026-11-29T19:45:00.151072281Z",
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
      "actor_id": "bbeb0bd1-546e-4687-8aa4-9df00ff27005",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T19:44:42.625816Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "bbeb0bd1-546e-4687-8aa4-9df00ff27005",
      "reason": "Sandbox clean-up",
      "at": "2026-10-30T19:44:44.117579Z"
    }
  ],
  "duplicates": []
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "a6b9205d-621d-4f83-9055-56c8a8277b39",
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
  "device_ref": "sandbox-17709"
}
```

```json
{
  "challenge_id": "65632972-1967-44fd-8e49-8a4f9bd03271",
  "expires_at": "2026-10-30T19:50:01.314633416Z",
  "resend_available_at": "2026-10-30T19:45:02.314633416Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "159078",
  "sent_at": "2026-10-30T19:45:01.317156975Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "65632972-1967-44fd-8e49-8a4f9bd03271",
  "code": "159078",
  "device_ref": "sandbox-17709"
}
```

```json
{
  "session_id": "7a6340a1-f17f-4bf9-bef0-4c6c3963f6a8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM5MDQwMSwiaWF0IjoxNzkzMzg5NTAxLCJqdGkiOiI5MzgyYThkYy0yMzgxLTQwMWMtYTI0MC1hZTg4YjhjMTBkYzkiLCJzaWQiOiI3YTYzNDBhMS1mMTdmLTRiZjktYmVmMC00YzZjMzk2M2Y2YTgifQ.2XBSKIfn2_3Lwrf-9oDMPqqifaOlrVd8A9u41qNHoMU",
  "access_expires_at": "2026-10-30T20:00:01.617736239Z",
  "refresh_token": "mOHSifhp2q740qMGFLh8xjDVyRstcMykklRV2jhv9fk",
  "refresh_expires_at": "2026-11-29T19:45:01.61718055Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d3ba373c-6aae-4a54-943c-b2cfed6d8e3c",
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
  "last_heartbeat_at": "2026-10-30T19:44:20.406016Z",
  "last_location_at": "2026-10-30T19:44:20.406016Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/d3ba373c-6aae-4a54-943c-b2cfed6d8e3c/handover` → **200**

```json
{
  "command_id": "05eafa49-1de3-4fba-b422-da9faed579b0",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d3ba373c-6aae-4a54-943c-b2cfed6d8e3c",
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
  "last_heartbeat_at": "2026-10-30T19:44:20.406016Z",
  "last_location_at": "2026-10-30T19:44:20.406016Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

(the car drives 7 s to the next point)

`POST /api/driver/v1/work-sessions/d3ba373c-6aae-4a54-943c-b2cfed6d8e3c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:45:09Z",
    "sequence": 1793389509487
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d3ba373c-6aae-4a54-943c-b2cfed6d8e3c",
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
  "last_heartbeat_at": "2026-10-30T19:45:09.505604Z",
  "last_location_at": "2026-10-30T19:45:09.505604Z",
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
  "command_id": "30b3388a-6e62-470d-813c-9c59141df39d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:45:10Z",
    "sequence": 1793389510883
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "da0f33c4-ed66-4abe-ad76-3a2c12b7b06e",
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
  "last_heartbeat_at": "2026-10-30T19:45:10.1059Z",
  "last_location_at": "2026-10-30T19:45:10.1059Z",
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
  "session_id": "57a6034a-a337-4964-8a16-29385b65303b",
  "subject": {
    "type": "STAFF",
    "id": "bbeb0bd1-546e-4687-8aa4-9df00ff27005"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYmViMGJkMS01NDZlLTQ2ODctOGFhNC05ZGYwMGZmMjcwMDUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTA0MTAsImlhdCI6MTc5MzM4OTUxMCwianRpIjoiYTk5ODg5MDYtNWNmNi00Yzc5LTg0ZDgtYjg4OWVkZWE0MjVjIiwic2lkIjoiNTdhNjAzNGEtYTMzNy00OTY0LThhMTYtMjkzODViNjUzMDNiIn0.KaANU3mMUb7vzTfTt7lR3Fb_N6mpWkyypFViRilHxpc",
  "access_expires_at": "2026-10-30T20:00:10.685638025Z",
  "refresh_token": "On5Q26vFuNzco3peTD8pnJV7ggXZtMJ7BfAR-rjydaU",
  "refresh_expires_at": "2026-10-31T07:45:10.684848179Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "8f84a44a-7e6d-4fa4-a7cd-df3bb9d6b7c7",
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
  "id": "4e5d475b-47f2-4097-a0a6-f66884cb96f0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T19:50:10.969725Z",
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
  "command_id": "b16f4cf1-fe9b-4a8e-b439-9950eb33737c",
  "quote_id": "4e5d475b-47f2-4097-a0a6-f66884cb96f0",
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
  "id": "88f76805-317f-4d8f-bab6-062f805f0658",
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
  "created_at": "2026-10-30T19:45:11.265603Z",
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
    "id": "29e68b1a-eedc-425b-9b45-c1964f644398",
    "order_id": "88f76805-317f-4d8f-bab6-062f805f0658",
    "expires_at": "2026-10-30T19:45:26.269884Z",
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

`POST /api/driver/v1/offers/29e68b1a-eedc-425b-9b45-c1964f644398/accept` → **200**

```json
{
  "command_id": "54535d82-e37c-4833-bedd-88caa661c5bd"
}
```

```json
{
  "id": "2303ff84-4f79-4900-bc4c-603502aaf675",
  "order_id": "88f76805-317f-4d8f-bab6-062f805f0658",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f6babb81-fe17-401a-b6f0-edf826def711",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f6babb81-fe17-401a-b6f0-edf826def711",
  "order_id": "88f76805-317f-4d8f-bab6-062f805f0658",
  "assignment_id": "2303ff84-4f79-4900-bc4c-603502aaf675",
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

`POST /api/driver/v1/work-sessions/da0f33c4-ed66-4abe-ad76-3a2c12b7b06e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T19:45:22Z",
    "sequence": 1793389522778
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "da0f33c4-ed66-4abe-ad76-3a2c12b7b06e",
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
  "last_heartbeat_at": "2026-10-30T19:45:22.795998Z",
  "last_location_at": "2026-10-30T19:45:22.795998Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/f6babb81-fe17-401a-b6f0-edf826def711/arrive` → **200**

```json
{
  "command_id": "f7aa2fe6-672c-47cd-953c-be3987a95151",
  "expected_version": 0
}
```

```json
{
  "id": "f6babb81-fe17-401a-b6f0-edf826def711",
  "order_id": "88f76805-317f-4d8f-bab6-062f805f0658",
  "assignment_id": "2303ff84-4f79-4900-bc4c-603502aaf675",
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
  "arrived_at": "2026-10-30T19:45:23.089568Z",
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

`POST /api/driver/v1/trips/f6babb81-fe17-401a-b6f0-edf826def711/start` → **200**

```json
{
  "command_id": "65e1e266-45d3-4e41-807a-a3e5c99a167f",
  "expected_version": 1
}
```

```json
{
  "id": "f6babb81-fe17-401a-b6f0-edf826def711",
  "order_id": "88f76805-317f-4d8f-bab6-062f805f0658",
  "assignment_id": "2303ff84-4f79-4900-bc4c-603502aaf675",
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
  "arrived_at": "2026-10-30T19:45:23.089568Z",
  "started_at": "2026-10-30T19:45:23.388065Z",
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

`POST /api/driver/v1/trips/f6babb81-fe17-401a-b6f0-edf826def711/complete` → **200**

```json
{
  "command_id": "544113ff-f06e-4810-ab4d-10846e9ed5c9",
  "expected_version": 2,
  "reported_at": "2026-10-30T19:45:23Z",
  "cash_received": true
}
```

```json
{
  "id": "f6babb81-fe17-401a-b6f0-edf826def711",
  "order_id": "88f76805-317f-4d8f-bab6-062f805f0658",
  "assignment_id": "2303ff84-4f79-4900-bc4c-603502aaf675",
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
  "arrived_at": "2026-10-30T19:45:23.089568Z",
  "started_at": "2026-10-30T19:45:23.388065Z",
  "completed_at": "2026-10-30T19:45:23.683678Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/88f76805-317f-4d8f-bab6-062f805f0658` → **200**

```json
{
  "id": "88f76805-317f-4d8f-bab6-062f805f0658",
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
    "id": "2303ff84-4f79-4900-bc4c-603502aaf675",
    "order_id": "88f76805-317f-4d8f-bab6-062f805f0658",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "f6babb81-fe17-401a-b6f0-edf826def711",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T19:45:11.265603Z",
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
  "session_id": "d3ba373c-6aae-4a54-943c-b2cfed6d8e3c",
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
  "last_heartbeat_at": "2026-10-30T19:45:09.505604Z",
  "last_location_at": "2026-10-30T19:45:09.505604Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/d3ba373c-6aae-4a54-943c-b2cfed6d8e3c/close` → **200**

```json
{
  "command_id": "5bd908bc-286e-448f-9a35-54a633599447",
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
  "session_id": "da0f33c4-ed66-4abe-ad76-3a2c12b7b06e",
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
  "last_heartbeat_at": "2026-10-30T19:45:22.795998Z",
  "last_location_at": "2026-10-30T19:45:22.795998Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/da0f33c4-ed66-4abe-ad76-3a2c12b7b06e/close` → **200**

```json
{
  "command_id": "f44eb634-791a-4a07-a940-93f5156fb8ca",
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

Done: terminal order 88f76805-317f-4d8f-bab6-062f805f0658 by Andrii (5a000000-0000-4000-8000-000000000403).

# Scenario: zz-metrics

## A search without drivers ends as UNFULFILLED

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-19709"
}
```

```json
{
  "challenge_id": "034335d5-2747-4cef-912f-72a5f4aefd2a",
  "expires_at": "2026-10-30T19:50:28.704805138Z",
  "resend_available_at": "2026-10-30T19:45:29.704805138Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "541954",
  "sent_at": "2026-10-30T19:45:28.707376853Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "034335d5-2747-4cef-912f-72a5f4aefd2a",
  "code": "541954",
  "device_ref": "sandbox-19709"
}
```

```json
{
  "session_id": "eea7aebc-ef8f-42ca-b9fc-ad1399aa1cf5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM5MDQyOSwiaWF0IjoxNzkzMzg5NTI5LCJqdGkiOiJkNWU4OTZjYi0yMTJkLTRmODctYjU2ZS0zN2Q2OWFjZDZjZDIiLCJzaWQiOiJlZWE3YWViYy1lZjhmLTQyY2EtYjlmYy1hZDEzOTlhYTFjZjUifQ.e71uzJa2ryDuDR_-Xlz55qIAhqSyBp8iD8-zNxjO6qE",
  "access_expires_at": "2026-10-30T20:00:29.004858732Z",
  "refresh_token": "kfthInpLJM9zLnjfZJE-IxktA5vdO6B1ZgfgAWwdbEY",
  "refresh_expires_at": "2026-11-29T19:45:29.004016078Z",
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
  "device_ref": "sandbox-22181"
}
```

```json
{
  "challenge_id": "14014ce9-12c7-438c-9bd8-b745ae5f38e3",
  "expires_at": "2026-10-30T19:50:29.564691528Z",
  "resend_available_at": "2026-10-30T19:45:30.564691528Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "540234",
  "sent_at": "2026-10-30T19:45:29.567187139Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "14014ce9-12c7-438c-9bd8-b745ae5f38e3",
  "code": "540234",
  "device_ref": "sandbox-22181"
}
```

```json
{
  "session_id": "7e0ee260-8211-4f23-9fab-881104ddd4a9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM5MDQyOSwiaWF0IjoxNzkzMzg5NTI5LCJqdGkiOiIzZTZhMjE2MC1lNzQyLTQyYjQtYmYxNS04N2JhODkzODkxMTEiLCJzaWQiOiI3ZTBlZTI2MC04MjExLTRmMjMtOWZhYi04ODExMDRkZGQ0YTkifQ.I2-_QRov-akVlQlroQbjXTrxHvIE2uQu1zINlWp9zMw",
  "access_expires_at": "2026-10-30T20:00:29.864882352Z",
  "refresh_token": "EYqJ1crGEEIiHuyjpvFyHofpEXbjxCGU0AyeS7rWdRM",
  "refresh_expires_at": "2026-11-29T19:45:29.86422329Z",
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
  "device_ref": "sandbox-26181"
}
```

```json
{
  "challenge_id": "a2bcaa84-493d-46d7-8503-22e78e0b224b",
  "expires_at": "2026-10-30T19:50:30.417772837Z",
  "resend_available_at": "2026-10-30T19:45:31.417772837Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "718845",
  "sent_at": "2026-10-30T19:45:30.420153576Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a2bcaa84-493d-46d7-8503-22e78e0b224b",
  "code": "718845",
  "device_ref": "sandbox-26181"
}
```

```json
{
  "session_id": "1db12130-ac35-4cb9-af30-851832b72547",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM5MDQzMCwiaWF0IjoxNzkzMzg5NTMwLCJqdGkiOiI2OTg3OWU3ZS0zYzk3LTRmM2UtYjEyMC1jYWM0OWYzZGZjOTMiLCJzaWQiOiIxZGIxMjEzMC1hYzM1LTRjYjktYWYzMC04NTE4MzJiNzI1NDcifQ.GQu1Fky4EDA1z0dljOW6w8eCB7-TIY-nNrZ5wQkiMwc",
  "access_expires_at": "2026-10-30T20:00:30.726055018Z",
  "refresh_token": "XWKT0c6uRAHe_N73bZBpMquqLUM7fqUjeXN7ltiw1HM",
  "refresh_expires_at": "2026-11-29T19:45:30.725385998Z",
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
  "phone": "+380691012705",
  "device_ref": "sandbox-6719"
}
```

```json
{
  "challenge_id": "ce9bdd65-e65f-4394-9523-7aab9198b6e4",
  "expires_at": "2026-10-30T19:50:31.295051793Z",
  "resend_available_at": "2026-10-30T19:45:32.295051793Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380691012705` → **200**

```json
{
  "phone": "+380691012705",
  "audience": "CLIENT",
  "code": "899571",
  "sent_at": "2026-10-30T19:45:31.297646972Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ce9bdd65-e65f-4394-9523-7aab9198b6e4",
  "code": "899571",
  "device_ref": "sandbox-6719"
}
```

```json
{
  "session_id": "dad36bb5-f1b9-45d1-909f-9f7ec60a65d2",
  "subject": {
    "type": "CLIENT",
    "id": "30acf75f-bca4-4dc0-8a3d-a86b39d11523"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMGFjZjc1Zi1iY2E0LTRkYzAtOGEzZC1hODZiMzlkMTE1MjMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzkwNDMxLCJpYXQiOjE3OTMzODk1MzEsImp0aSI6ImVjZmE3MGY3LWUxN2MtNGFmZi1iMGY5LWFkY2RhMjcyMTIyNSIsInNpZCI6ImRhZDM2YmI1LWYxYjktNDVkMS05MDlmLTlmN2VjNjBhNjVkMiJ9.hrJWGMP_ZsJI-PQnGDpA8ito7ju710zNw8Qc9DJwS7E",
  "access_expires_at": "2026-10-30T20:00:31.623049057Z",
  "refresh_token": "0Wq8hL2jGs96rs8ljjjZta3Al2x1k7wH_CoFOcOt_Qc",
  "refresh_expires_at": "2026-11-29T19:45:31.622430691Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1ef935e2-e072-40b1-8bc5-2f9f8ac7e7c2",
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
  "id": "0ae035fb-75f6-45cd-98e2-08acbb3c51e1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T19:50:31.930020Z",
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
  "command_id": "3c28d9f3-1547-419b-b109-4e6c6937f860",
  "quote_id": "0ae035fb-75f6-45cd-98e2-08acbb3c51e1",
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
  "id": "b76b7a63-1f5a-4356-8da1-c16473d14df1",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "30acf75f-bca4-4dc0-8a3d-a86b39d11523",
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
  "created_at": "2026-10-30T19:45:32.229404Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b76b7a63-1f5a-4356-8da1-c16473d14df1` → **200**

```json
{
  "id": "b76b7a63-1f5a-4356-8da1-c16473d14df1",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "30acf75f-bca4-4dc0-8a3d-a86b39d11523",
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
  "created_at": "2026-10-30T19:45:32.229404Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b76b7a63-1f5a-4356-8da1-c16473d14df1` → **200**

```json
{
  "id": "b76b7a63-1f5a-4356-8da1-c16473d14df1",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "30acf75f-bca4-4dc0-8a3d-a86b39d11523",
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
  "created_at": "2026-10-30T19:45:32.229404Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b76b7a63-1f5a-4356-8da1-c16473d14df1` → **200**

```json
{
  "id": "b76b7a63-1f5a-4356-8da1-c16473d14df1",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "30acf75f-bca4-4dc0-8a3d-a86b39d11523",
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
  "created_at": "2026-10-30T19:45:32.229404Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b76b7a63-1f5a-4356-8da1-c16473d14df1` → **200**

```json
{
  "id": "b76b7a63-1f5a-4356-8da1-c16473d14df1",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "30acf75f-bca4-4dc0-8a3d-a86b39d11523",
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
  "created_at": "2026-10-30T19:45:32.229404Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b76b7a63-1f5a-4356-8da1-c16473d14df1` → **200**

```json
{
  "id": "b76b7a63-1f5a-4356-8da1-c16473d14df1",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "30acf75f-bca4-4dc0-8a3d-a86b39d11523",
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
  "created_at": "2026-10-30T19:45:32.229404Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b76b7a63-1f5a-4356-8da1-c16473d14df1` → **200**

```json
{
  "id": "b76b7a63-1f5a-4356-8da1-c16473d14df1",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "30acf75f-bca4-4dc0-8a3d-a86b39d11523",
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
  "created_at": "2026-10-30T19:45:32.229404Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b76b7a63-1f5a-4356-8da1-c16473d14df1` → **200**

```json
{
  "id": "b76b7a63-1f5a-4356-8da1-c16473d14df1",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "30acf75f-bca4-4dc0-8a3d-a86b39d11523",
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
  "created_at": "2026-10-30T19:45:32.229404Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b76b7a63-1f5a-4356-8da1-c16473d14df1` → **200**

```json
{
  "id": "b76b7a63-1f5a-4356-8da1-c16473d14df1",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "30acf75f-bca4-4dc0-8a3d-a86b39d11523",
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
  "created_at": "2026-10-30T19:45:32.229404Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b76b7a63-1f5a-4356-8da1-c16473d14df1` → **200**

```json
{
  "id": "b76b7a63-1f5a-4356-8da1-c16473d14df1",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "30acf75f-bca4-4dc0-8a3d-a86b39d11523",
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
  "created_at": "2026-10-30T19:45:32.229404Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b76b7a63-1f5a-4356-8da1-c16473d14df1` → **200**

```json
{
  "id": "b76b7a63-1f5a-4356-8da1-c16473d14df1",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "30acf75f-bca4-4dc0-8a3d-a86b39d11523",
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
  "created_at": "2026-10-30T19:45:32.229404Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b76b7a63-1f5a-4356-8da1-c16473d14df1` → **200**

```json
{
  "id": "b76b7a63-1f5a-4356-8da1-c16473d14df1",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "30acf75f-bca4-4dc0-8a3d-a86b39d11523",
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
  "created_at": "2026-10-30T19:45:32.229404Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b76b7a63-1f5a-4356-8da1-c16473d14df1` → **200**

```json
{
  "id": "b76b7a63-1f5a-4356-8da1-c16473d14df1",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "30acf75f-bca4-4dc0-8a3d-a86b39d11523",
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
  "created_at": "2026-10-30T19:45:32.229404Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b76b7a63-1f5a-4356-8da1-c16473d14df1` → **200**

```json
{
  "id": "b76b7a63-1f5a-4356-8da1-c16473d14df1",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "30acf75f-bca4-4dc0-8a3d-a86b39d11523",
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
  "created_at": "2026-10-30T19:45:32.229404Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b76b7a63-1f5a-4356-8da1-c16473d14df1` → **200**

```json
{
  "id": "b76b7a63-1f5a-4356-8da1-c16473d14df1",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "30acf75f-bca4-4dc0-8a3d-a86b39d11523",
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
  "created_at": "2026-10-30T19:45:32.229404Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b76b7a63-1f5a-4356-8da1-c16473d14df1` → **200**

```json
{
  "id": "b76b7a63-1f5a-4356-8da1-c16473d14df1",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "30acf75f-bca4-4dc0-8a3d-a86b39d11523",
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
  "created_at": "2026-10-30T19:45:32.229404Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b76b7a63-1f5a-4356-8da1-c16473d14df1` → **200**

```json
{
  "id": "b76b7a63-1f5a-4356-8da1-c16473d14df1",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "30acf75f-bca4-4dc0-8a3d-a86b39d11523",
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
  "created_at": "2026-10-30T19:45:32.229404Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b76b7a63-1f5a-4356-8da1-c16473d14df1` → **200**

```json
{
  "id": "b76b7a63-1f5a-4356-8da1-c16473d14df1",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "30acf75f-bca4-4dc0-8a3d-a86b39d11523",
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
  "created_at": "2026-10-30T19:45:32.229404Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b76b7a63-1f5a-4356-8da1-c16473d14df1` → **200**

```json
{
  "id": "b76b7a63-1f5a-4356-8da1-c16473d14df1",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "30acf75f-bca4-4dc0-8a3d-a86b39d11523",
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
  "created_at": "2026-10-30T19:45:32.229404Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b76b7a63-1f5a-4356-8da1-c16473d14df1` → **200**

```json
{
  "id": "b76b7a63-1f5a-4356-8da1-c16473d14df1",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "30acf75f-bca4-4dc0-8a3d-a86b39d11523",
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
  "created_at": "2026-10-30T19:45:32.229404Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b76b7a63-1f5a-4356-8da1-c16473d14df1` → **200**

```json
{
  "id": "b76b7a63-1f5a-4356-8da1-c16473d14df1",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "30acf75f-bca4-4dc0-8a3d-a86b39d11523",
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
  "created_at": "2026-10-30T19:45:32.229404Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b76b7a63-1f5a-4356-8da1-c16473d14df1` → **200**

```json
{
  "id": "b76b7a63-1f5a-4356-8da1-c16473d14df1",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "30acf75f-bca4-4dc0-8a3d-a86b39d11523",
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
  "created_at": "2026-10-30T19:45:32.229404Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b76b7a63-1f5a-4356-8da1-c16473d14df1` → **200**

```json
{
  "id": "b76b7a63-1f5a-4356-8da1-c16473d14df1",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "30acf75f-bca4-4dc0-8a3d-a86b39d11523",
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
  "created_at": "2026-10-30T19:45:32.229404Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b76b7a63-1f5a-4356-8da1-c16473d14df1` → **200**

```json
{
  "id": "b76b7a63-1f5a-4356-8da1-c16473d14df1",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "30acf75f-bca4-4dc0-8a3d-a86b39d11523",
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
  "created_at": "2026-10-30T19:45:32.229404Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b76b7a63-1f5a-4356-8da1-c16473d14df1` → **200**

```json
{
  "id": "b76b7a63-1f5a-4356-8da1-c16473d14df1",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "30acf75f-bca4-4dc0-8a3d-a86b39d11523",
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
  "created_at": "2026-10-30T19:45:32.229404Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b76b7a63-1f5a-4356-8da1-c16473d14df1` → **200**

```json
{
  "id": "b76b7a63-1f5a-4356-8da1-c16473d14df1",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "30acf75f-bca4-4dc0-8a3d-a86b39d11523",
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
  "created_at": "2026-10-30T19:45:32.229404Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b76b7a63-1f5a-4356-8da1-c16473d14df1` → **200**

```json
{
  "id": "b76b7a63-1f5a-4356-8da1-c16473d14df1",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "30acf75f-bca4-4dc0-8a3d-a86b39d11523",
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
  "created_at": "2026-10-30T19:45:32.229404Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b76b7a63-1f5a-4356-8da1-c16473d14df1` → **200**

```json
{
  "id": "b76b7a63-1f5a-4356-8da1-c16473d14df1",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "30acf75f-bca4-4dc0-8a3d-a86b39d11523",
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
  "created_at": "2026-10-30T19:45:32.229404Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b76b7a63-1f5a-4356-8da1-c16473d14df1` → **200**

```json
{
  "id": "b76b7a63-1f5a-4356-8da1-c16473d14df1",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "30acf75f-bca4-4dc0-8a3d-a86b39d11523",
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
  "created_at": "2026-10-30T19:45:32.229404Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b76b7a63-1f5a-4356-8da1-c16473d14df1` → **200**

```json
{
  "id": "b76b7a63-1f5a-4356-8da1-c16473d14df1",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "30acf75f-bca4-4dc0-8a3d-a86b39d11523",
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
  "created_at": "2026-10-30T19:45:32.229404Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b76b7a63-1f5a-4356-8da1-c16473d14df1` → **200**

```json
{
  "id": "b76b7a63-1f5a-4356-8da1-c16473d14df1",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "30acf75f-bca4-4dc0-8a3d-a86b39d11523",
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
  "created_at": "2026-10-30T19:45:32.229404Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b76b7a63-1f5a-4356-8da1-c16473d14df1` → **200**

```json
{
  "id": "b76b7a63-1f5a-4356-8da1-c16473d14df1",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "30acf75f-bca4-4dc0-8a3d-a86b39d11523",
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
  "created_at": "2026-10-30T19:45:32.229404Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b76b7a63-1f5a-4356-8da1-c16473d14df1` → **200**

```json
{
  "id": "b76b7a63-1f5a-4356-8da1-c16473d14df1",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "30acf75f-bca4-4dc0-8a3d-a86b39d11523",
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
  "created_at": "2026-10-30T19:45:32.229404Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b76b7a63-1f5a-4356-8da1-c16473d14df1` → **200**

```json
{
  "id": "b76b7a63-1f5a-4356-8da1-c16473d14df1",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "30acf75f-bca4-4dc0-8a3d-a86b39d11523",
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
  "created_at": "2026-10-30T19:45:32.229404Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b76b7a63-1f5a-4356-8da1-c16473d14df1` → **200**

```json
{
  "id": "b76b7a63-1f5a-4356-8da1-c16473d14df1",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "30acf75f-bca4-4dc0-8a3d-a86b39d11523",
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
  "created_at": "2026-10-30T19:45:32.229404Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b76b7a63-1f5a-4356-8da1-c16473d14df1` → **200**

```json
{
  "id": "b76b7a63-1f5a-4356-8da1-c16473d14df1",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "30acf75f-bca4-4dc0-8a3d-a86b39d11523",
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
  "created_at": "2026-10-30T19:45:32.229404Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b76b7a63-1f5a-4356-8da1-c16473d14df1` → **200**

```json
{
  "id": "b76b7a63-1f5a-4356-8da1-c16473d14df1",
  "short_number": 38,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "30acf75f-bca4-4dc0-8a3d-a86b39d11523",
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
  "created_at": "2026-10-30T19:45:32.229404Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

## All eight metrics are non-zero, with closed labels and no ids/phones
Metric validator: good scrape accepted; missing, unknown, id/phone, extra, zero and NaN rejected
{
  "blizz_orders_total": 38,
  "blizz_orders_cancelled_total": 23,
  "blizz_orders_unfulfilled_total": 1,
  "blizz_dispatch_first_offer_seconds_count": 25,
  "blizz_dispatch_assigned_seconds_count": 21,
  "blizz_offers_total": 28,
  "blizz_dispatch_excluded_total": 20,
  "blizz_sms_sent_total": 90
}

```prometheus
blizz_dispatch_assigned_seconds_count{application="blizz-taxi-server",source="BROADCAST"} 1
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="BROADCAST"} 11.941881859
blizz_dispatch_assigned_seconds_count{application="blizz-taxi-server",source="OFFER"} 20
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="OFFER"} 17.527292789
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="BROADCAST"} 0.0
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="OFFER"} 0.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="ALREADY_OFFERED"} 2.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="BUSY"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="CITY_NOT_ADMITTED"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PAUSED"} 6.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PAYMENT"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PREVIOUS_DRIVER"} 2.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="STALE_LOCATION"} 6.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="TOO_FAR"} 1.0
blizz_dispatch_first_offer_seconds_count{application="blizz-taxi-server"} 25
blizz_dispatch_first_offer_seconds_sum{application="blizz-taxi-server"} 0.553354164
blizz_dispatch_first_offer_seconds_max{application="blizz-taxi-server"} 0.0
blizz_offers_total{application="blizz-taxi-server",outcome="ACCEPTED"} 20.0
blizz_offers_total{application="blizz-taxi-server",outcome="DECLINED"} 2.0
blizz_offers_total{application="blizz-taxi-server",outcome="REVOKED"} 6.0
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
blizz_sms_sent_total{application="blizz-taxi-server",purpose="OTP",state="SENT"} 83.0
```

Done: real no-car deadline, non-zero counters/timers and bounded labels on the management port.

`GET /api/rider/v1/orders/b76b7a63-1f5a-4356-8da1-c16473d14df1` → **200**

```json
{
  "id": "b76b7a63-1f5a-4356-8da1-c16473d14df1",
  "short_number": 38,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "30acf75f-bca4-4dc0-8a3d-a86b39d11523",
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
  "created_at": "2026-10-30T19:45:32.229404Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
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
  "session_id": "37043ede-1a32-4337-97f2-4504e7d6a721",
  "subject": {
    "type": "STAFF",
    "id": "bbeb0bd1-546e-4687-8aa4-9df00ff27005"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYmViMGJkMS01NDZlLTQ2ODctOGFhNC05ZGYwMGZmMjcwMDUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTA2MTksImlhdCI6MTc5MzM4OTcxOSwianRpIjoiYTgzNGNiYTYtMjUwMi00NWNhLThkNDctZmI3YzI1ZmQ5OTI4Iiwic2lkIjoiMzcwNDNlZGUtMWEzMi00MzM3LTk3ZjItNDUwNGU3ZDZhNzIxIn0._VyaalHQ4g3ubGMiNqEqGzU0q9xpyC6zUKF2ChFqbXY",
  "access_expires_at": "2026-10-30T20:03:39.156031022Z",
  "refresh_token": "-89amWPYyW83xVMAuo_PaPWn-IXIju7LbHmcwSrlaTo",
  "refresh_expires_at": "2026-10-31T07:48:39.155393021Z",
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
  "id": "fb8d978e-ba27-45af-b313-2427e7b1d086",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T19:48:39.449325Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T19:48:39.449366Z",
  "updated_at": "2026-10-30T19:48:39.46578Z",
  "finished_at": "2026-10-30T19:48:39.46578Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/fb8d978e-ba27-45af-b313-2427e7b1d086` → **200**

```json
{
  "run": {
    "id": "fb8d978e-ba27-45af-b313-2427e7b1d086",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T19:48:39.449325Z",
    "partial": true,
    "state": "CLEAN",
    "local_count": 10,
    "provider_count": 10,
    "item_count": 0,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T19:48:39.449366Z",
    "updated_at": "2026-10-30T19:48:39.46578Z",
    "finished_at": "2026-10-30T19:48:39.46578Z",
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
  "id": "fb8d978e-ba27-45af-b313-2427e7b1d086",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T19:48:39.449325Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T19:48:39.449366Z",
  "updated_at": "2026-10-30T19:48:39.46578Z",
  "finished_at": "2026-10-30T19:48:39.46578Z",
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
  "id": "fb8d978e-ba27-45af-b313-2427e7b1d086",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T19:48:39.449325Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T19:48:39.449366Z",
  "updated_at": "2026-10-30T19:48:39.46578Z",
  "finished_at": "2026-10-30T19:48:39.46578Z",
  "version": 1
}
```

## One independent bank transaction produces one missing-local item on another merchant's first snapshot

`POST /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/8960a55e-60de-4aaf-b2d8-069910379eb8` → **204**

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
  "id": "07a96cb0-539f-4e72-acd2-d90077024f1a",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T19:48:39.898016Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T19:48:39.898046Z",
  "updated_at": "2026-10-30T19:48:39.905241Z",
  "finished_at": "2026-10-30T19:48:39.905241Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/07a96cb0-539f-4e72-acd2-d90077024f1a` → **200**

```json
{
  "run": {
    "id": "07a96cb0-539f-4e72-acd2-d90077024f1a",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T19:48:39.898016Z",
    "partial": true,
    "state": "OPEN",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 1,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T19:48:39.898046Z",
    "updated_at": "2026-10-30T19:48:39.905241Z",
    "finished_at": "2026-10-30T19:48:39.905241Z",
    "version": 1
  },
  "items": [
    {
      "id": "641d46bb-f972-4c81-bee7-abc3949593f6",
      "run_id": "07a96cb0-539f-4e72-acd2-d90077024f1a",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "984459414e617ed44f2bab6a04f231a75794825c9fd33fc2d6a02a6bd0d58193",
      "reference_display": "sandbox-reconciliation-8960a55e-60de-4aaf-b2d8-#####eb8",
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
      "provider_at": "2026-10-30T19:48:39Z",
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
  "id": "07a96cb0-539f-4e72-acd2-d90077024f1a",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T19:48:39.898016Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T19:48:39.898046Z",
  "updated_at": "2026-10-30T19:48:39.905241Z",
  "finished_at": "2026-10-30T19:48:39.905241Z",
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
  "id": "07a96cb0-539f-4e72-acd2-d90077024f1a",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T19:48:39.898016Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T19:48:39.898046Z",
  "updated_at": "2026-10-30T19:48:39.905241Z",
  "finished_at": "2026-10-30T19:48:39.905241Z",
  "version": 1
}
```

## The admin explains the item once; a replay is the same result and a different decision conflicts

`POST /api/admin/v1/payment-reconciliations/items/641d46bb-f972-4c81-bee7-abc3949593f6/resolve` → **200**

```json
{
  "command_id": "ae9b5a0a-fbda-4902-8e4b-ddaa2416410f",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "641d46bb-f972-4c81-bee7-abc3949593f6",
  "run_id": "07a96cb0-539f-4e72-acd2-d90077024f1a",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "984459414e617ed44f2bab6a04f231a75794825c9fd33fc2d6a02a6bd0d58193",
  "reference_display": "sandbox-reconciliation-8960a55e-60de-4aaf-b2d8-#####eb8",
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
  "provider_at": "2026-10-30T19:48:39Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "bbeb0bd1-546e-4687-8aa4-9df00ff27005",
  "resolved_at": "2026-10-30T19:48:40.321285Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/641d46bb-f972-4c81-bee7-abc3949593f6/resolve` → **200**

```json
{
  "command_id": "ae9b5a0a-fbda-4902-8e4b-ddaa2416410f",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "641d46bb-f972-4c81-bee7-abc3949593f6",
  "run_id": "07a96cb0-539f-4e72-acd2-d90077024f1a",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "984459414e617ed44f2bab6a04f231a75794825c9fd33fc2d6a02a6bd0d58193",
  "reference_display": "sandbox-reconciliation-8960a55e-60de-4aaf-b2d8-#####eb8",
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
  "provider_at": "2026-10-30T19:48:39Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "bbeb0bd1-546e-4687-8aa4-9df00ff27005",
  "resolved_at": "2026-10-30T19:48:40.321285Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/641d46bb-f972-4c81-bee7-abc3949593f6/resolve` → **409**

```json
{
  "command_id": "0a4f0f78-3dd9-461e-8dcc-9509f37cd995",
  "expected_version": 1,
  "decision": "ESCALATED",
  "reason": "A conflicting second decision"
}
```

```json
{
  "instance": "/api/admin/v1/payment-reconciliations/items/641d46bb-f972-4c81-bee7-abc3949593f6/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "2fdcb163-f921-4178-90a2-076a50aa5fac"
}
```

`GET /api/admin/v1/payment-reconciliations/07a96cb0-539f-4e72-acd2-d90077024f1a` → **200**

```json
{
  "run": {
    "id": "07a96cb0-539f-4e72-acd2-d90077024f1a",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T19:48:39.898016Z",
    "partial": true,
    "state": "RESOLVED",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T19:48:39.898046Z",
    "updated_at": "2026-10-30T19:48:40.321285Z",
    "finished_at": "2026-10-30T19:48:39.905241Z",
    "version": 2
  },
  "items": [
    {
      "id": "641d46bb-f972-4c81-bee7-abc3949593f6",
      "run_id": "07a96cb0-539f-4e72-acd2-d90077024f1a",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "984459414e617ed44f2bab6a04f231a75794825c9fd33fc2d6a02a6bd0d58193",
      "reference_display": "sandbox-reconciliation-8960a55e-60de-4aaf-b2d8-#####eb8",
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
      "provider_at": "2026-10-30T19:48:39Z",
      "state": "RESOLVED",
      "decision": "EXPLAINED",
      "reason": "Independent sandbox bank fixture; no real money moved",
      "resolved_by": "bbeb0bd1-546e-4687-8aa4-9df00ff27005",
      "resolved_at": "2026-10-30T19:48:40.321285Z",
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
      "id": "07a96cb0-539f-4e72-acd2-d90077024f1a",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-30",
      "period_from": "2026-10-29T22:00:00Z",
      "period_to": "2026-10-31T02:00:00Z",
      "observed_until": "2026-10-30T19:48:39.898016Z",
      "partial": true,
      "state": "RESOLVED",
      "local_count": 0,
      "provider_count": 1,
      "item_count": 1,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-30T19:48:39.898046Z",
      "updated_at": "2026-10-30T19:48:40.321285Z",
      "finished_at": "2026-10-30T19:48:39.905241Z",
      "version": 2
    },
    {
      "id": "a16ec8b0-c417-4bfe-afcd-e6b90aeb4f19",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-29",
      "period_from": "2026-10-28T22:00:00Z",
      "period_to": "2026-10-30T02:00:00Z",
      "observed_until": "2026-10-30T19:25:33.279578Z",
      "partial": false,
      "state": "CLEAN",
      "local_count": 0,
      "provider_count": 0,
      "item_count": 0,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-30T19:25:33.279749Z",
      "updated_at": "2026-10-30T19:25:33.28714Z",
      "finished_at": "2026-10-30T19:25:33.28714Z",
      "version": 1
    }
  ],
  "next_cursor": null
}
```

`DELETE /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/8960a55e-60de-4aaf-b2d8-069910379eb8` → **204**

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30"
}
```

```json
{
  "id": "07a96cb0-539f-4e72-acd2-d90077024f1a",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T19:48:39.898016Z",
  "partial": true,
  "state": "RESOLVED",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T19:48:39.898046Z",
  "updated_at": "2026-10-30T19:48:40.321285Z",
  "finished_at": "2026-10-30T19:48:39.905241Z",
  "version": 2
}
```

Done: clean card snapshot, one bank-only difference, three identical runs, audited decision/replay/conflict, bank fixture restored.

# Scenario: zzz-invariants

## Five invariant checks are clean after all scenario transactions settle

```prometheus
blizz_invariant_last_success{application="blizz-taxi-server",check="I1"} 1.793389848695E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I2"} 1.793389844212E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I3"} 1.793389844213E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I4"} 1.793389848695E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I5"} 1.793389844213E9
blizz_invariant_violations{application="blizz-taxi-server",check="I1"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I2"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I3"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I4"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I5"} 0.0
```

Done: five fresh zero invariant gauges after the settling margin.

# Scenario: backup-restore

## A rider exists when the backup is taken

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380680166072",
  "device_ref": "sandbox-30815"
}
```

```json
{
  "challenge_id": "3c0e80cf-a49a-432c-a858-4f01a527016e",
  "expires_at": "2026-10-30T19:55:48.831890186Z",
  "resend_available_at": "2026-10-30T19:50:49.831890186Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380680166072` → **200**

```json
{
  "phone": "+380680166072",
  "audience": "CLIENT",
  "code": "784664",
  "sent_at": "2026-10-30T19:50:48.834959753Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3c0e80cf-a49a-432c-a858-4f01a527016e",
  "code": "784664",
  "device_ref": "sandbox-30815"
}
```

```json
{
  "session_id": "7c0fc8f1-4420-44ca-98cb-25382b45003a",
  "subject": {
    "type": "CLIENT",
    "id": "3281ba59-2a6e-41a6-933c-1b95858453fe"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMjgxYmE1OS0yYTZlLTQxYTYtOTMzYy0xYjk1ODU4NDUzZmUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzkwNzQ5LCJpYXQiOjE3OTMzODk4NDksImp0aSI6IjhmMTIxYjJhLTQ3OGQtNGE0OS04Yjg5LThlZTRmZjNkYzE5MCIsInNpZCI6IjdjMGZjOGYxLTQ0MjAtNDRjYS05OGNiLTI1MzgyYjQ1MDAzYSJ9.5YAJwupdycd96ebr2-yEYwbMBJ7gEIimpgIB-piuO9M",
  "access_expires_at": "2026-10-30T20:05:49.154940544Z",
  "refresh_token": "Lvp4qWCuHN0MTxzQrDxyrq9CajJbN80OLTnNkBfYoTk",
  "refresh_expires_at": "2026-11-29T19:50:49.154188389Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "3281ba59-2a6e-41a6-933c-1b95858453fe",
  "session_id": "7c0fc8f1-4420-44ca-98cb-25382b45003a",
  "account_state": "ACTIVE"
}
```

## Back up the database (deploy/backup.sh)
Backed up blizz to blizz.dump (564K)

## After the backup the rider deletes the account and staff complete it

`POST /api/rider/v1/me/deletion-request/challenge` → **201**

```json
{
  "challenge_id": "bc0c6cef-9ae6-4876-9c19-cf0b672b9c7a",
  "expires_at": "2026-10-30T19:55:52.250795017Z",
  "resend_available_at": "2026-10-30T19:50:53.250795017Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380680166072` → **200**

```json
{
  "phone": "+380680166072",
  "audience": "CLIENT",
  "code": "958331",
  "sent_at": "2026-10-30T19:50:52.253008437Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "e932e416-88a7-4bcc-8995-dcfb25899bcc",
  "challenge_id": "bc0c6cef-9ae6-4876-9c19-cf0b672b9c7a",
  "otp_code": "958331"
}
```

```json
{
  "client_id": "3281ba59-2a6e-41a6-933c-1b95858453fe",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-30T19:50:52.562526481Z"
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
  "session_id": "83373c20-35f3-4932-b2a9-5f4d56ef115e",
  "subject": {
    "type": "STAFF",
    "id": "bbeb0bd1-546e-4687-8aa4-9df00ff27005"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYmViMGJkMS01NDZlLTQ2ODctOGFhNC05ZGYwMGZmMjcwMDUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTA3NTMsImlhdCI6MTc5MzM4OTg1MywianRpIjoiMDQzMjI3YjYtODVjMi00MGMwLWJhYjYtY2E4Y2IwOWFlYWZmIiwic2lkIjoiODMzNzNjMjAtMzVmMy00OTMyLWIyYTktNWY0ZDU2ZWYxMTVlIn0.FfPs6JBde2bJS9nlaqXjf3C8peH4b9jkhCCWSU06bQ4",
  "access_expires_at": "2026-10-30T20:05:53.129741164Z",
  "refresh_token": "0ZFL1GXwdvi2xIsOMLLl19pX4nYe4T5BNUk42xYN9Ew",
  "refresh_expires_at": "2026-10-31T07:50:53.129158074Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/client-deletions/3281ba59-2a6e-41a6-933c-1b95858453fe/complete` → **200**

```json
{
  "command_id": "e490cb72-1978-475b-95d9-42c4c08aa73e",
  "reason": "Sandbox: backup and restore check"
}
```

```json
{
  "client_id": "3281ba59-2a6e-41a6-933c-1b95858453fe",
  "account_state": "ANONYMIZED"
}
```

## Restore into an empty database (deploy/restore.sh); over data it refuses
Restored blizz.dump into blizz_restored: 102 migrations applied. Start the server on it with the same ERASURE_JOURNAL_DIR.
Database blizz_restored is not empty (113 tables): restore only into an empty database

In the restored database before the server starts: `ACTIVE +380680166072` (the backup predates the deletion).

## Start the server on the restored database with the same journal: the deletion is applied again

After the start: `ANONYMIZED -`.

Done: backup, restore into an empty database, start on it; the deleted rider stayed deleted (T-39).
