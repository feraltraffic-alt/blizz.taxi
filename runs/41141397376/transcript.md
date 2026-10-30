# Sandbox transcript (2026-10-30T22:57:38Z, fdf9a7f)

# Scenario: admission-cities

## Only Andrii is online in Kyiv for this scenario

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-15938"
}
```

```json
{
  "challenge_id": "cdce3630-8729-424c-86fc-77f998cf070d",
  "expires_at": "2026-10-30T23:02:38.575455987Z",
  "resend_available_at": "2026-10-30T22:57:39.575455987Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "812636",
  "sent_at": "2026-10-30T22:57:38.586266627Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cdce3630-8729-424c-86fc-77f998cf070d",
  "code": "812636",
  "device_ref": "sandbox-15938"
}
```

```json
{
  "session_id": "675d58b7-ea95-40d3-994e-65f276a4b2bc",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwMTk2NCwiaWF0IjoxNzkzNDAxMDY0LCJqdGkiOiI3NTczNjQ2ZS05ZGMwLTRiYTAtOTg2ZC04MGZiNGRjNjlkMDMiLCJzaWQiOiI2NzVkNThiNy1lYTk1LTQwZDMtOTk0ZS02NWYyNzZhNGIyYmMifQ.i844IgCriCTfhMecOkXqKfuTSTrmBnhWIj8zanlouEM",
  "access_expires_at": "2026-10-30T23:12:44.400222664Z",
  "refresh_token": "vPyGqmVq8a4MwIdfibjIWax-zE1KO2cjxB63Ugi6Pnk",
  "refresh_expires_at": "2026-11-29T22:57:44.398597906Z",
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
  "device_ref": "sandbox-20331"
}
```

```json
{
  "challenge_id": "436f7b39-c188-4d04-aab2-02185660097d",
  "expires_at": "2026-10-30T23:02:44.863910089Z",
  "resend_available_at": "2026-10-30T22:57:45.863910089Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "227242",
  "sent_at": "2026-10-30T22:57:44.868141347Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "436f7b39-c188-4d04-aab2-02185660097d",
  "code": "227242",
  "device_ref": "sandbox-20331"
}
```

```json
{
  "session_id": "0942b87e-72a1-4d1b-9635-6e189e96131e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwMTk2NSwiaWF0IjoxNzkzNDAxMDY1LCJqdGkiOiI5OTkwMWE4NC1kYzc0LTQ0M2EtYjc2NS0yY2I2MTk3OGNhN2QiLCJzaWQiOiIwOTQyYjg3ZS03MmExLTRkMWItOTYzNS02ZTE4OWU5NjEzMWUifQ.J3BhgSgqPUH6xCqUDRvCn1kcdQVyQdkPaL_fT0aWPeg",
  "access_expires_at": "2026-10-30T23:12:45.0894661Z",
  "refresh_token": "6gLLHf_e1goyoF6fF0NaNxSez5N1fkzXaLY3bj-1eRM",
  "refresh_expires_at": "2026-11-29T22:57:45.088613832Z",
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
  "correlation_id": "33adfc23-21bd-49b0-a942-c68d00e46f3a"
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
  "session_id": "35ff20b8-ca58-4329-917f-d80005a7492f",
  "subject": {
    "type": "STAFF",
    "id": "c66269c2-93bc-421d-8af2-6f0cafc54be4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjYyNjljMi05M2JjLTQyMWQtOGFmMi02ZjBjYWZjNTRiZTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDE5NjYsImlhdCI6MTc5MzQwMTA2NiwianRpIjoiNjliNWQ0YWEtN2I0Ni00YmNmLWJmYTYtZTI3OGZjNjQ2NDQ3Iiwic2lkIjoiMzVmZjIwYjgtY2E1OC00MzI5LTkxN2YtZDgwMDA1YTc0OTJmIn0.ruWYPLtL6Fws5jL-9MquSGbIwXWROrJAAjCjONhPgVA",
  "access_expires_at": "2026-10-30T23:12:46.095855008Z",
  "refresh_token": "Wfm25rLKfD0PytJSFwGaou2U66ll_t3ILkQDUxrVMu4",
  "refresh_expires_at": "2026-10-31T10:57:46.095084806Z",
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
  "session_id": "aab096ab-bb64-4069-9a33-f444d747b3a1",
  "subject": {
    "type": "STAFF",
    "id": "c66269c2-93bc-421d-8af2-6f0cafc54be4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjYyNjljMi05M2JjLTQyMWQtOGFmMi02ZjBjYWZjNTRiZTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDE5NjcsImlhdCI6MTc5MzQwMTA2NywianRpIjoiYzhiMDdmZWEtNjEwNy00NzI2LTg5YTgtNGUzYjI5Mjc4MGVmIiwic2lkIjoiYWFiMDk2YWItYmI2NC00MDY5LTlhMzMtZjQ0NGQ3NDdiM2ExIn0.MwJ54bEPZF_hwdeX5Eh5IZ6S9BM9ZYGt3U95E7WSZFs",
  "access_expires_at": "2026-10-30T23:12:47.331422852Z",
  "refresh_token": "8-HLk69PW9vBVS0yg1hDZXrnGDvdOHToEcnbS6RH2Vk",
  "refresh_expires_at": "2026-10-31T10:57:47.330565386Z",
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
  "session_id": "c257ca5c-ad55-4431-a3cf-306319e16b84",
  "subject": {
    "type": "STAFF",
    "id": "c66269c2-93bc-421d-8af2-6f0cafc54be4"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjYyNjljMi05M2JjLTQyMWQtOGFmMi02ZjBjYWZjNTRiZTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDE5NjcsImlhdCI6MTc5MzQwMTA2NywianRpIjoiOWU2Njk0ZjgtNjcyYy00N2JkLWE1ODYtN2FlZTg1NzYxNDc3Iiwic2lkIjoiYzI1N2NhNWMtYWQ1NS00NDMxLWEzY2YtMzA2MzE5ZTE2Yjg0In0.84t2j6zZktl_WSWLqG5pRwuP9WnuE8NVw9qn4OMpr_I",
  "access_expires_at": "2026-10-30T23:12:47.7521189Z",
  "refresh_token": "K9ABWmiB-CEa3yF0x8PnpRD2V6Hxvjhk7DtsAeSHQZs",
  "refresh_expires_at": "2026-10-31T10:57:47.751271159Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-1070"
}
```

```json
{
  "challenge_id": "5fde0a0a-da9f-4ee6-bbfe-2c7d1a44d383",
  "expires_at": "2026-10-30T23:02:47.952975728Z",
  "resend_available_at": "2026-10-30T22:57:48.952975728Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "724521",
  "sent_at": "2026-10-30T22:57:47.956901017Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5fde0a0a-da9f-4ee6-bbfe-2c7d1a44d383",
  "code": "724521",
  "device_ref": "sandbox-1070"
}
```

```json
{
  "session_id": "58755cc9-7754-463b-aeba-d92a8f1859bd",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwMTk2OCwiaWF0IjoxNzkzNDAxMDY4LCJqdGkiOiJkMjI1ZGQ0MC1iYjBmLTQxZDctYjUyMC01NThiNTZhZTNkMmUiLCJzaWQiOiI1ODc1NWNjOS03NzU0LTQ2M2ItYWViYS1kOTJhOGYxODU5YmQifQ.9yrYIgJV5wjzxb3D2na4BzUZRD4Quy3SiNZoo1aMZek",
  "access_expires_at": "2026-10-30T23:12:48.183248832Z",
  "refresh_token": "oR12ftyKI-IBZyaLm-9rKhdqUMP3WJolZdijrnM-k2g",
  "refresh_expires_at": "2026-11-29T22:57:48.182518565Z",
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
  "command_id": "e2e80b70-a0ff-457d-9b4a-c90ecc9be6b0",
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
  "command_id": "de6ee4ae-0e5e-48d4-8009-1f30d08734fb",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4528,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:57:49Z",
    "sequence": 1793401069560
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
  "correlation_id": "45dfca04-d07f-4355-9bc2-2d92ce2c8bee"
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
  "command_id": "fd083ea2-977d-4c16-9530-37891c424359",
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
  "command_id": "53eb4bfb-449d-4b01-ac7d-6e1414584308",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4528,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:57:50Z",
    "sequence": 1793401070799
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "edb29f5f-b257-415c-b7b9-22275b28bebd",
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
  "last_heartbeat_at": "2026-10-30T22:57:50.098603Z",
  "last_location_at": "2026-10-30T22:57:50.098603Z",
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
  "command_id": "0d9327c8-120f-4854-b93c-5ccc0fb54c60",
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
  "session_id": "edb29f5f-b257-415c-b7b9-22275b28bebd",
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
  "last_heartbeat_at": "2026-10-30T22:57:50.098603Z",
  "last_location_at": "2026-10-30T22:57:50.098603Z",
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
  "phone": "+380687729706",
  "device_ref": "sandbox-1113"
}
```

```json
{
  "challenge_id": "baa95e99-3c54-445d-97f7-a2c73971126c",
  "expires_at": "2026-10-30T23:02:50.941406313Z",
  "resend_available_at": "2026-10-30T22:57:51.941406313Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380687729706` → **200**

```json
{
  "phone": "+380687729706",
  "audience": "CLIENT",
  "code": "269609",
  "sent_at": "2026-10-30T22:57:50.945229541Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "baa95e99-3c54-445d-97f7-a2c73971126c",
  "code": "269609",
  "device_ref": "sandbox-1113"
}
```

```json
{
  "session_id": "d5e958e7-da73-40c8-a2fb-fdc34beaa7da",
  "subject": {
    "type": "CLIENT",
    "id": "c68aa88e-c7c1-49f2-b266-30793a2f1b26"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjhhYTg4ZS1jN2MxLTQ5ZjItYjI2Ni0zMDc5M2EyZjFiMjYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDAxOTcxLCJpYXQiOjE3OTM0MDEwNzEsImp0aSI6ImQ5ZTI0YTQ4LTMzYzktNDBlMC1iYWEzLTRlODc4MDVmZjM0YiIsInNpZCI6ImQ1ZTk1OGU3LWRhNzMtNDBjOC1hMmZiLWZkYzM0YmVhYTdkYSJ9.cjBkVZLtg7DVH_gPA0DHt6S0AVJ-4MBNb9ZgqmwEHiE",
  "access_expires_at": "2026-10-30T23:12:51.17683641Z",
  "refresh_token": "R68DxczH3dZp9n6nDvHgkBrSzcr9kfwNFMBHSrfE5BA",
  "refresh_expires_at": "2026-11-29T22:57:51.176247343Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "88f7e7de-db58-491d-87fb-750512792e07",
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
  "id": "bd96574c-cdc4-4c61-baa0-6679d69b8b9c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T23:02:51.393387Z",
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
  "command_id": "1704329a-7df4-4a99-bb9f-353955068170",
  "quote_id": "bd96574c-cdc4-4c61-baa0-6679d69b8b9c",
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
  "id": "36f87da5-4e7a-4aaf-aec0-d0a564894382",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c68aa88e-c7c1-49f2-b266-30793a2f1b26",
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
  "created_at": "2026-10-30T22:57:51.662496Z",
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

`POST /api/driver/v1/orders/36f87da5-4e7a-4aaf-aec0-d0a564894382/claim` → **409**

```json
{
  "command_id": "b035066f-156f-42e1-92ef-5923150b6dbd"
}
```

```json
{
  "instance": "/api/driver/v1/orders/36f87da5-4e7a-4aaf-aec0-d0a564894382/claim",
  "status": 409,
  "title": "Driver not eligible",
  "type": "https://errors.blizz.taxi/driver-not-eligible",
  "code": "DRIVER_NOT_ELIGIBLE",
  "correlation_id": "8c46bee1-b4a0-49ab-ab66-4c986958634b"
}
```

`GET /api/operator/v1/orders/36f87da5-4e7a-4aaf-aec0-d0a564894382/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T22:57:51.664894Z",
      "actor": {
        "type": "CLIENT",
        "id": "c68aa88e-c7c1-49f2-b266-30793a2f1b26",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "36f87da5-4e7a-4aaf-aec0-d0a564894382",
        "quote_id": "bd96574c-cdc4-4c61-baa0-6679d69b8b9c",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "4e95bea7-acc7-4097-b564-3d6cf56d134f"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T22:57:51.669685Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "36f87da5-4e7a-4aaf-aec0-d0a564894382",
        "attempt_id": "63a6ffba-7f2a-4a49-8721-e85e9f4fc151",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "4e95bea7-acc7-4097-b564-3d6cf56d134f"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-30T22:57:51.711032Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "36f87da5-4e7a-4aaf-aec0-d0a564894382",
        "attempt_id": "63a6ffba-7f2a-4a49-8721-e85e9f4fc151"
      },
      "correlation_id": "4e95bea7-acc7-4097-b564-3d6cf56d134f"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "63a6ffba-7f2a-4a49-8721-e85e9f4fc151",
        "generation": 1,
        "started_at": "2026-10-30T22:57:51.667864Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-30T22:57:51.711032Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-30T22:57:51.671075Z",
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
  "command_id": "71b7d9e6-d0da-4678-a686-e9444e505369",
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

`POST /api/driver/v1/work-sessions/edb29f5f-b257-415c-b7b9-22275b28bebd/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4528,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:57:53Z",
    "sequence": 1793401073215
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "edb29f5f-b257-415c-b7b9-22275b28bebd",
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
  "last_heartbeat_at": "2026-10-30T22:57:53.237522Z",
  "last_location_at": "2026-10-30T22:57:53.237522Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000001/zones` → **201**

```json
{
  "command_id": "23511c40-d1c1-4add-88fc-0151c5a1d051",
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
  "id": "cfbda3ca-5c7e-4a37-b08d-cebbd21b2e76",
  "state": "DRAFT",
  "version": 0
}
```

`POST /api/admin/v1/zones/cfbda3ca-5c7e-4a37-b08d-cebbd21b2e76/publish` → **200**

```json
{
  "command_id": "af1ed80f-8b94-46c3-b40d-8b20fc82c4bc",
  "expected_version": 0,
  "reason": "Sandbox"
}
```

```json
{
  "id": "cfbda3ca-5c7e-4a37-b08d-cebbd21b2e76",
  "state": "PUBLISHED",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000001/zones` → **201**

```json
{
  "command_id": "9407d13e-9a05-4cef-9d41-7d5d3c15e1fb",
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
  "id": "0d83d479-8e6e-4951-961f-3cb3b4ec3632",
  "state": "DRAFT",
  "version": 0
}
```

`POST /api/admin/v1/zones/0d83d479-8e6e-4951-961f-3cb3b4ec3632/publish` → **200**

```json
{
  "command_id": "ba594793-c214-4506-985e-6a058637e6c3",
  "expected_version": 0,
  "reason": "Sandbox"
}
```

```json
{
  "id": "0d83d479-8e6e-4951-961f-3cb3b4ec3632",
  "state": "PUBLISHED",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/zones` → **201**

```json
{
  "command_id": "04c1786a-d291-4ea1-a91a-27f2f63a1064",
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
  "id": "3a0d80db-3f3e-452b-af63-f699e68a9a69",
  "state": "DRAFT",
  "version": 0
}
```

`POST /api/admin/v1/zones/3a0d80db-3f3e-452b-af63-f699e68a9a69/publish` → **200**

```json
{
  "command_id": "58ecdbb8-4258-4fa7-aeb2-ddae9567231c",
  "expected_version": 0,
  "reason": "Sandbox"
}
```

```json
{
  "id": "3a0d80db-3f3e-452b-af63-f699e68a9a69",
  "state": "PUBLISHED",
  "version": 1
}
```

`GET /api/driver/v1/broadcast-orders?zone_id=cfbda3ca-5c7e-4a37-b08d-cebbd21b2e76` → **200**

```json
[
  {
    "order_id": "36f87da5-4e7a-4aaf-aec0-d0a564894382",
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

`GET /api/driver/v1/broadcast-orders?zone_id=0d83d479-8e6e-4951-961f-3cb3b4ec3632` → **200**

```json
[]
```

`GET /api/driver/v1/broadcast-orders?zone_id=3a0d80db-3f3e-452b-af63-f699e68a9a69` → **400**

```json
{
  "instance": "/api/driver/v1/broadcast-orders",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "e4efc3f9-23e1-4dea-ab74-1e6002136f63"
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
  "command_id": "1ee00d3c-3c98-40a3-b158-ec7373df71e8",
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

`GET /api/operator/v1/orders/36f87da5-4e7a-4aaf-aec0-d0a564894382` → **200**

```json
{
  "id": "36f87da5-4e7a-4aaf-aec0-d0a564894382",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c68aa88e-c7c1-49f2-b266-30793a2f1b26",
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
  "created_at": "2026-10-30T22:57:51.662496Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/36f87da5-4e7a-4aaf-aec0-d0a564894382/cancel` → **200**

```json
{
  "command_id": "117e7e99-2ef4-455d-bc2e-712a3f61149c",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "36f87da5-4e7a-4aaf-aec0-d0a564894382",
  "short_number": 1,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "c68aa88e-c7c1-49f2-b266-30793a2f1b26",
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
  "created_at": "2026-10-30T22:57:51.662496Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "ru": "Нет свободных машин",
      "pl": "Brak wolnych aut",
      "uk": "Немає вільних авто",
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
  "session_id": "edb29f5f-b257-415c-b7b9-22275b28bebd",
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
  "last_heartbeat_at": "2026-10-30T22:57:53.237522Z",
  "last_location_at": "2026-10-30T22:57:53.237522Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/edb29f5f-b257-415c-b7b9-22275b28bebd/close` → **200**

```json
{
  "command_id": "49fc0b31-41c1-42b2-bbeb-fb43cfcb32e4",
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
  "session_id": "f522d8bb-cf26-40f2-8e44-d635723b81cc",
  "subject": {
    "type": "STAFF",
    "id": "c66269c2-93bc-421d-8af2-6f0cafc54be4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjYyNjljMi05M2JjLTQyMWQtOGFmMi02ZjBjYWZjNTRiZTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDE5NzYsImlhdCI6MTc5MzQwMTA3NiwianRpIjoiOWI1MjU3ZGItZjcxMi00OWE0LWFiOWItNDY3N2MxNGM1NGJjIiwic2lkIjoiZjUyMmQ4YmItY2YyNi00MGYyLThlNDQtZDYzNTcyM2I4MWNjIn0.lbTlt_tvLBefYtFYvHBa51Ya9maXMdrswDJboN3ydZM",
  "access_expires_at": "2026-10-30T23:12:56.852637532Z",
  "refresh_token": "0OetIxmnajNC4XLP5Rq4SFfva8EWf-LNQTOz99auBWk",
  "refresh_expires_at": "2026-10-31T10:57:56.852059664Z",
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
  "device_ref": "sandbox-11867"
}
```

```json
{
  "challenge_id": "04d38cd4-4284-4333-bbfa-be14aa6c6426",
  "expires_at": "2026-10-30T23:02:57.273516924Z",
  "resend_available_at": "2026-10-30T22:57:58.273516924Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "430306",
  "sent_at": "2026-10-30T22:57:57.277394606Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "04d38cd4-4284-4333-bbfa-be14aa6c6426",
  "code": "430306",
  "device_ref": "sandbox-11867"
}
```

```json
{
  "session_id": "f6be95f6-e4f5-4435-a86b-4e12eb3414fb",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwMTk3NywiaWF0IjoxNzkzNDAxMDc3LCJqdGkiOiIyZDViMGFhYi01M2ZjLTRjYzMtOWIzMi01MmU5OTMzNGU5ZDYiLCJzaWQiOiJmNmJlOTVmNi1lNGY1LTQ0MzUtYTg2Yi00ZTEyZWIzNDE0ZmIifQ.jyLymGNPVWlCTkbxAh_7AjjlLGTZLk5VaRy7ldqXhsE",
  "access_expires_at": "2026-10-30T23:12:57.524572468Z",
  "refresh_token": "5IQFPGn804BVvs8Fo-UXBKCs_sBWriv9q-g34xvnPys",
  "refresh_expires_at": "2026-11-29T22:57:57.524025926Z",
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
  "command_id": "d291047c-af82-47ad-ab3f-39a6636ecca8",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:57:57Z",
    "sequence": 1793401077947
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "992adc78-599b-450e-9716-82a606aab5fb",
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
  "last_heartbeat_at": "2026-10-30T22:57:57.964941Z",
  "last_location_at": "2026-10-30T22:57:57.964941Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631737676",
  "device_ref": "sandbox-1945"
}
```

```json
{
  "challenge_id": "f3f5dc03-f506-44e4-8da6-e1a1a9a57d14",
  "expires_at": "2026-10-30T23:02:58.177865467Z",
  "resend_available_at": "2026-10-30T22:57:59.177865467Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631737676` → **200**

```json
{
  "phone": "+380631737676",
  "audience": "CLIENT",
  "code": "249943",
  "sent_at": "2026-10-30T22:57:58.180570056Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f3f5dc03-f506-44e4-8da6-e1a1a9a57d14",
  "code": "249943",
  "device_ref": "sandbox-1945"
}
```

```json
{
  "session_id": "0673237d-216f-4467-9d6b-c4e5a30ae130",
  "subject": {
    "type": "CLIENT",
    "id": "ef9a4b7b-2a96-4060-9685-b02a7a206371"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZjlhNGI3Yi0yYTk2LTQwNjAtOTY4NS1iMDJhN2EyMDYzNzEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDAxOTc4LCJpYXQiOjE3OTM0MDEwNzgsImp0aSI6ImIyYWQwZWFkLTcxYmItNDY2Ni1hY2JlLTQ3NTg4YzliZTJkOCIsInNpZCI6IjA2NzMyMzdkLTIxNmYtNDQ2Ny05ZDZiLWM0ZTVhMzBhZTEzMCJ9.tpTIeOChWFryf2aKJj6Cn6cVkd9_YBeVaRDtOkPWDRc",
  "access_expires_at": "2026-10-30T23:12:58.405641562Z",
  "refresh_token": "sm1PyeJ-7NAVjZ3BGWJZW6wpdYv6vMUOZ_7q1-9iHG8",
  "refresh_expires_at": "2026-11-29T22:57:58.405116157Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "eb465bab-67bb-4266-8a6b-8db03091cc7c",
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
  "id": "c3f0bfcd-3d39-43ac-bb4d-cd298e01b51e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T23:02:58.617949Z",
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
  "command_id": "acf299a2-7eb8-4614-8a1a-5660d0a6529d",
  "quote_id": "c3f0bfcd-3d39-43ac-bb4d-cd298e01b51e",
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
  "id": "917fd764-176f-45f1-8dd3-f9804003b093",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ef9a4b7b-2a96-4060-9685-b02a7a206371",
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
  "created_at": "2026-10-30T22:57:58.839532Z",
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
    "id": "c4497a64-426d-4dde-b2e3-607a9117ba83",
    "order_id": "917fd764-176f-45f1-8dd3-f9804003b093",
    "expires_at": "2026-10-30T22:58:13.843298Z",
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

`POST /api/driver/v1/offers/c4497a64-426d-4dde-b2e3-607a9117ba83/accept` → **200**

```json
{
  "command_id": "3fb348da-febf-4822-b9dd-1913f4995949"
}
```

```json
{
  "id": "430f05c7-4322-4877-84d6-757cbf16d333",
  "order_id": "917fd764-176f-45f1-8dd3-f9804003b093",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f77c0c96-7818-43f0-bb5d-5a9ec22534ec",
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
  "command_id": "6d6f9d8f-ed83-4fc3-9019-a9202a05437c",
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
  "changed_by": "c66269c2-93bc-421d-8af2-6f0cafc54be4",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T22:57:59.75508603Z"
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
  "id": "f77c0c96-7818-43f0-bb5d-5a9ec22534ec",
  "order_id": "917fd764-176f-45f1-8dd3-f9804003b093",
  "assignment_id": "430f05c7-4322-4877-84d6-757cbf16d333",
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

`POST /api/driver/v1/work-sessions/992adc78-599b-450e-9716-82a606aab5fb/heartbeat` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:58:00Z",
    "sequence": 1793401080439
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "992adc78-599b-450e-9716-82a606aab5fb",
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
  "last_heartbeat_at": "2026-10-30T22:58:00.457324Z",
  "last_location_at": "2026-10-30T22:58:00.457324Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/f77c0c96-7818-43f0-bb5d-5a9ec22534ec/arrive` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "ac0de57e-04bb-472b-bb5f-a4260b41dfea",
  "expected_version": 0
}
```

```json
{
  "id": "f77c0c96-7818-43f0-bb5d-5a9ec22534ec",
  "order_id": "917fd764-176f-45f1-8dd3-f9804003b093",
  "assignment_id": "430f05c7-4322-4877-84d6-757cbf16d333",
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
  "arrived_at": "2026-10-30T22:58:00.674583Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/f77c0c96-7818-43f0-bb5d-5a9ec22534ec/start` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "7902427e-3c48-4564-98f6-f97de5236a89",
  "expected_version": 1
}
```

```json
{
  "id": "f77c0c96-7818-43f0-bb5d-5a9ec22534ec",
  "order_id": "917fd764-176f-45f1-8dd3-f9804003b093",
  "assignment_id": "430f05c7-4322-4877-84d6-757cbf16d333",
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
  "arrived_at": "2026-10-30T22:58:00.674583Z",
  "started_at": "2026-10-30T22:58:00.893843Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/f77c0c96-7818-43f0-bb5d-5a9ec22534ec/complete` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "7c9552e8-5c8e-4552-a90f-6b1811b9d6bd",
  "expected_version": 2,
  "reported_at": "2026-10-30T22:58:01Z",
  "cash_received": true
}
```

```json
{
  "id": "f77c0c96-7818-43f0-bb5d-5a9ec22534ec",
  "order_id": "917fd764-176f-45f1-8dd3-f9804003b093",
  "assignment_id": "430f05c7-4322-4877-84d6-757cbf16d333",
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
  "arrived_at": "2026-10-30T22:58:00.674583Z",
  "started_at": "2026-10-30T22:58:00.893843Z",
  "completed_at": "2026-10-30T22:58:01.254372Z",
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
  "session_id": "992adc78-599b-450e-9716-82a606aab5fb",
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
  "last_heartbeat_at": "2026-10-30T22:58:00.457324Z",
  "last_location_at": "2026-10-30T22:58:00.457324Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/992adc78-599b-450e-9716-82a606aab5fb/close` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "f5194c39-86e1-4314-be50-8724075a9db1",
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
  "command_id": "9b0e3694-c973-4d8e-bda2-79c6aabaf57a",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:58:01Z",
    "sequence": 1793401081896
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
  "correlation_id": "3914ed29-5924-42b4-8d7b-73b514f64da8",
  "minimum_version": "9.0.0"
}
```

## After the update he can

`POST /api/driver/v1/work-sessions` (X-App-Platform: DRIVER_ANDROID X-App-Version: 9.0.0) → **201**

```json
{
  "command_id": "dd35ea66-0b2a-4dc8-a2e9-c963e0fe2c27",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:58:02Z",
    "sequence": 1793401082113
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "42ecd16d-ff53-4c47-960f-0ddc279f49af",
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
  "last_heartbeat_at": "2026-10-30T22:58:02.132454Z",
  "last_location_at": "2026-10-30T22:58:02.132454Z",
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
  "changed_by": "c66269c2-93bc-421d-8af2-6f0cafc54be4",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T22:57:59.755086Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "c34ec318-0095-4132-b55b-af90eb24ab0e",
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
  "changed_by": "c66269c2-93bc-421d-8af2-6f0cafc54be4",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T22:58:02.546105039Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "42ecd16d-ff53-4c47-960f-0ddc279f49af",
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
  "last_heartbeat_at": "2026-10-30T22:58:02.132454Z",
  "last_location_at": "2026-10-30T22:58:02.132454Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/42ecd16d-ff53-4c47-960f-0ddc279f49af/close` → **200**

```json
{
  "command_id": "4606f190-08d0-4ee6-a316-dc8f616ad0a7",
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
  "session_id": "31ca7a38-8be4-4521-8b25-f43ec2ba553c",
  "subject": {
    "type": "STAFF",
    "id": "c66269c2-93bc-421d-8af2-6f0cafc54be4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjYyNjljMi05M2JjLTQyMWQtOGFmMi02ZjBjYWZjNTRiZTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDE5ODMsImlhdCI6MTc5MzQwMTA4MywianRpIjoiNTYwZTlhNTAtZDU1ZC00ZmMzLWFmZGUtMGQxMTg4YjViNDYwIiwic2lkIjoiMzFjYTdhMzgtOGJlNC00NTIxLThiMjUtZjQzZWMyYmE1NTNjIn0.nouDROyRzRm9NX5c0C3UtAyDFOJDncR_-7M3M8jeL7I",
  "access_expires_at": "2026-10-30T23:13:03.413867899Z",
  "refresh_token": "5m4Ur9EY1RciY_CCDbdHvxkYznB7DfvStX_NTyTjtzA",
  "refresh_expires_at": "2026-10-31T10:58:03.413349499Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "6660b621-0c72-4d53-8e88-14950bc436e3",
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
  "id": "afedb75d-6855-42f0-afc3-ac15c7943970",
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
  "created_by": "c66269c2-93bc-421d-8af2-6f0cafc54be4",
  "created_at": "2026-10-30T22:58:03.634017Z",
  "updated_at": "2026-10-30T22:58:03.634017Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633181637",
  "device_ref": "sandbox-7801"
}
```

```json
{
  "challenge_id": "c04f6c18-a97d-4b9d-a79c-35d684cf5e22",
  "expires_at": "2026-10-30T23:03:03.844482221Z",
  "resend_available_at": "2026-10-30T22:58:04.844482221Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380633181637` → **200**

```json
{
  "phone": "+380633181637",
  "audience": "CLIENT",
  "code": "261945",
  "sent_at": "2026-10-30T22:58:03.847275294Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c04f6c18-a97d-4b9d-a79c-35d684cf5e22",
  "code": "261945",
  "device_ref": "sandbox-7801"
}
```

```json
{
  "session_id": "25700328-d442-41d5-b780-f59b1335c9ba",
  "subject": {
    "type": "CLIENT",
    "id": "59013be9-a708-4d4f-adf6-1a22ee1539a1"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1OTAxM2JlOS1hNzA4LTRkNGYtYWRmNi0xYTIyZWUxNTM5YTEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDAxOTg0LCJpYXQiOjE3OTM0MDEwODQsImp0aSI6Ijc5ZjE2OTY5LTU5YTQtNGE3MS1iYzg3LTdmMzYwZjIzMjhmNSIsInNpZCI6IjI1NzAwMzI4LWQ0NDItNDFkNS1iNzgwLWY1OWIxMzM1YzliYSJ9.5umqQ66Dmfb_PZNOh8bxRTlpYxNDSTN4_jsXED6SUlg",
  "access_expires_at": "2026-10-30T23:13:04.075539164Z",
  "refresh_token": "FToxJCgZZEscZFV7BwtBPJm9_bJM_SWAOc_JmEk_uS0",
  "refresh_expires_at": "2026-11-29T22:58:04.075000755Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380633181637` → **200**

```json
{
  "client_id": "59013be9-a708-4d4f-adf6-1a22ee1539a1"
}
```

`POST /api/admin/v1/rider-wallets/59013be9-a708-4d4f-adf6-1a22ee1539a1/top-ups` → **201**

```json
{
  "command_id": "6d3f2cf1-f9f2-4672-a30e-b5800b2804da",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "59013be9-a708-4d4f-adf6-1a22ee1539a1",
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
      "id": "cd8d12ef-c0d8-429c-a35f-716519bcb8e6",
      "at": "2026-10-30T22:58:04.499142Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "c66269c2-93bc-421d-8af2-6f0cafc54be4",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c4793063-b23b-4334-8c6c-224f403d7ae4",
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
  "id": "229ac0a2-2bb2-4d49-a4f2-0508889b4000",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T23:03:04.715090Z",
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
      "id": "afedb75d-6855-42f0-afc3-ac15c7943970",
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
  "device_ref": "sandbox-19700"
}
```

```json
{
  "challenge_id": "b4220f18-2c39-46c4-8c3e-94e6f647c359",
  "expires_at": "2026-10-30T23:03:04.9318099Z",
  "resend_available_at": "2026-10-30T22:58:05.9318099Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "732134",
  "sent_at": "2026-10-30T22:58:04.934731254Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b4220f18-2c39-46c4-8c3e-94e6f647c359",
  "code": "732134",
  "device_ref": "sandbox-19700"
}
```

```json
{
  "session_id": "512ef1a5-2dfe-42bf-8b09-f33b2bc8fa5d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwMTk4NSwiaWF0IjoxNzkzNDAxMDg1LCJqdGkiOiJmNDlhZDUyZi1lZDZjLTQ5ODctYjUyOS1jYTA2MWQ3OWNmZDEiLCJzaWQiOiI1MTJlZjFhNS0yZGZlLTQyYmYtOGIwOS1mMzNiMmJjOGZhNWQifQ.hwKkjYhLukmWS1R6yPud5ocbubmvRafu5L5A2CFidIs",
  "access_expires_at": "2026-10-30T23:13:05.159799818Z",
  "refresh_token": "YqCLCdJOpj1Sxn_11p7qpuezoLb6A5LkuTL90r_yfck",
  "refresh_expires_at": "2026-11-29T22:58:05.15926966Z",
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
  "command_id": "dd3c261f-d675-48f0-8ab1-a1d17e752ab2",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:58:05Z",
    "sequence": 1793401085569
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "faa3a606-52fb-44fb-a660-a89384d12c81",
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
  "last_heartbeat_at": "2026-10-30T22:58:05.587555Z",
  "last_location_at": "2026-10-30T22:58:05.587555Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "db2acd33-239e-4f9d-8b0f-c74b0d923b03",
  "quote_id": "229ac0a2-2bb2-4d49-a4f2-0508889b4000",
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
  "id": "01e66469-d2f4-43be-9d01-4bed151d9c15",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "59013be9-a708-4d4f-adf6-1a22ee1539a1",
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
  "created_at": "2026-10-30T22:58:05.818565Z",
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
  "client_id": "59013be9-a708-4d4f-adf6-1a22ee1539a1",
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
      "id": "cd8d12ef-c0d8-429c-a35f-716519bcb8e6",
      "at": "2026-10-30T22:58:04.499142Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "c66269c2-93bc-421d-8af2-6f0cafc54be4",
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
    "id": "f5119035-7cdd-4f75-8ca2-30c2a3335909",
    "order_id": "01e66469-d2f4-43be-9d01-4bed151d9c15",
    "expires_at": "2026-10-30T22:58:20.825546Z",
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

`POST /api/driver/v1/offers/f5119035-7cdd-4f75-8ca2-30c2a3335909/accept` → **200**

```json
{
  "command_id": "c4aa9883-269f-4e7e-b83e-1302d113f0b6"
}
```

```json
{
  "id": "ae3f1d0a-cc4c-4dc1-ad49-9bfbee875ee6",
  "order_id": "01e66469-d2f4-43be-9d01-4bed151d9c15",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a7bc84a6-075a-47a9-96c3-cea2b65a3833",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a7bc84a6-075a-47a9-96c3-cea2b65a3833",
  "order_id": "01e66469-d2f4-43be-9d01-4bed151d9c15",
  "assignment_id": "ae3f1d0a-cc4c-4dc1-ad49-9bfbee875ee6",
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

(the car drives 3 s to the next point)

`POST /api/driver/v1/work-sessions/faa3a606-52fb-44fb-a660-a89384d12c81/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:58:09Z",
    "sequence": 1793401089892
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "faa3a606-52fb-44fb-a660-a89384d12c81",
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
  "last_heartbeat_at": "2026-10-30T22:58:09.911341Z",
  "last_location_at": "2026-10-30T22:58:09.911341Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/a7bc84a6-075a-47a9-96c3-cea2b65a3833/arrive` → **200**

```json
{
  "command_id": "b5893ac7-44f3-4bb3-a32e-9e2e4c24ed29",
  "expected_version": 0
}
```

```json
{
  "id": "a7bc84a6-075a-47a9-96c3-cea2b65a3833",
  "order_id": "01e66469-d2f4-43be-9d01-4bed151d9c15",
  "assignment_id": "ae3f1d0a-cc4c-4dc1-ad49-9bfbee875ee6",
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
  "arrived_at": "2026-10-30T22:58:10.12548Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/a7bc84a6-075a-47a9-96c3-cea2b65a3833/start` → **200**

```json
{
  "command_id": "10c32837-a3c9-42c3-bd84-975e1bc56308",
  "expected_version": 1
}
```

```json
{
  "id": "a7bc84a6-075a-47a9-96c3-cea2b65a3833",
  "order_id": "01e66469-d2f4-43be-9d01-4bed151d9c15",
  "assignment_id": "ae3f1d0a-cc4c-4dc1-ad49-9bfbee875ee6",
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
  "arrived_at": "2026-10-30T22:58:10.12548Z",
  "started_at": "2026-10-30T22:58:10.34592Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/a7bc84a6-075a-47a9-96c3-cea2b65a3833/complete` → **200**

```json
{
  "command_id": "0fcd9d18-7eb7-471c-9eea-363d53e1a6c5",
  "expected_version": 2,
  "reported_at": "2026-10-30T22:58:10Z",
  "cash_received": true
}
```

```json
{
  "id": "a7bc84a6-075a-47a9-96c3-cea2b65a3833",
  "order_id": "01e66469-d2f4-43be-9d01-4bed151d9c15",
  "assignment_id": "ae3f1d0a-cc4c-4dc1-ad49-9bfbee875ee6",
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
  "arrived_at": "2026-10-30T22:58:10.12548Z",
  "started_at": "2026-10-30T22:58:10.34592Z",
  "completed_at": "2026-10-30T22:58:10.577216Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "59013be9-a708-4d4f-adf6-1a22ee1539a1",
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
      "id": "8ac553d7-8890-467f-8a8d-720d9eff0ffc",
      "at": "2026-10-30T22:58:10.671153Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "01e66469-d2f4-43be-9d01-4bed151d9c15"
    },
    {
      "id": "cd8d12ef-c0d8-429c-a35f-716519bcb8e6",
      "at": "2026-10-30T22:58:04.499142Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "c66269c2-93bc-421d-8af2-6f0cafc54be4",
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

`POST /api/admin/v1/promotions/afedb75d-6855-42f0-afc3-ac15c7943970/archive` → **200**

```json
{
  "command_id": "69a4179d-c278-46a7-9e74-02fc4a8856b5",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "afedb75d-6855-42f0-afc3-ac15c7943970",
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
  "created_by": "c66269c2-93bc-421d-8af2-6f0cafc54be4",
  "created_at": "2026-10-30T22:58:03.634017Z",
  "updated_at": "2026-10-30T22:58:14.031083Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "faa3a606-52fb-44fb-a660-a89384d12c81",
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
  "last_heartbeat_at": "2026-10-30T22:58:09.911341Z",
  "last_location_at": "2026-10-30T22:58:09.911341Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/faa3a606-52fb-44fb-a660-a89384d12c81/close` → **200**

```json
{
  "command_id": "84b7c971-ad6c-4083-8f85-dddbdfd3ba4c",
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

Done: order 01e66469-d2f4-43be-9d01-4bed151d9c15.

# Scenario: broadcast-abuse

## Anna goes online in Warsaw

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000002",
  "device_ref": "sandbox-30629"
}
```

```json
{
  "challenge_id": "14a4b1d0-bd07-45bd-9bd3-2d2d471f4a1a",
  "expires_at": "2026-10-30T23:03:14.694696813Z",
  "resend_available_at": "2026-10-30T22:58:15.694696813Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000002` → **200**

```json
{
  "phone": "+48500000002",
  "audience": "DRIVER",
  "code": "934151",
  "sent_at": "2026-10-30T22:58:14.697952328Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "14a4b1d0-bd07-45bd-9bd3-2d2d471f4a1a",
  "code": "934151",
  "device_ref": "sandbox-30629"
}
```

```json
{
  "session_id": "c96bbed8-0136-4b46-952e-968a4f633e24",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000405"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDUiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwMTk5NCwiaWF0IjoxNzkzNDAxMDk0LCJqdGkiOiJmMzZkM2IyOC0wNDFjLTQ3MzgtOWRkNS0yNTNjZDJlNGI4NjMiLCJzaWQiOiJjOTZiYmVkOC0wMTM2LTRiNDYtOTUyZS05NjhhNGY2MzNlMjQifQ.LLeomKJ9QaWKZfL-Rl3EuUqrXHg_DCleiclJNzDDqV4",
  "access_expires_at": "2026-10-30T23:13:14.932410021Z",
  "refresh_token": "_BsCfpHQdG9bgU973kutn0kQD6QH9YcJ4LIWTwcJWVo",
  "refresh_expires_at": "2026-11-29T22:58:14.931880909Z",
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
  "command_id": "cc55cc61-ca05-4438-87fc-328acac3574c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000505",
  "location": {
    "lat": 52.2297,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:58:15Z",
    "sequence": 1793401095570
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "d439b4c3-8729-4f53-b9bc-9590243740a3",
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
  "last_heartbeat_at": "2026-10-30T22:58:15.588409Z",
  "last_location_at": "2026-10-30T22:58:15.588409Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## 5 seconds later her phone reports Lviv: not taken as her position

`POST /api/driver/v1/work-sessions/d439b4c3-8729-4f53-b9bc-9590243740a3/heartbeat` → **200**

```json
{
  "location": {
    "lat": 49.8397,
    "lon": 24.0297,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:58:20Z",
    "sequence": 1793401100810
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "d439b4c3-8729-4f53-b9bc-9590243740a3",
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
  "last_heartbeat_at": "2026-10-30T22:58:20.829804Z",
  "last_location_at": "2026-10-30T22:58:15.588409Z",
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
  "session_id": "e8d1b77b-7afe-46f7-8561-f8aa902a1ce3",
  "subject": {
    "type": "STAFF",
    "id": "c66269c2-93bc-421d-8af2-6f0cafc54be4"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjYyNjljMi05M2JjLTQyMWQtOGFmMi02ZjBjYWZjNTRiZTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDIwMDEsImlhdCI6MTc5MzQwMTEwMSwianRpIjoiZDE3ODE5ZDctMzMzYS00ZjU1LWEzMTktNjQzYTVkZjQxNmM2Iiwic2lkIjoiZThkMWI3N2ItN2FmZS00NmY3LTg1NjEtZjhhYTkwMmExY2UzIn0.Sn8DLbrUraJdxlcIIkW0RLOije7YBl8ksihjIaIPPOY",
  "access_expires_at": "2026-10-30T23:13:21.267146435Z",
  "refresh_token": "-unlubUMXljxvZYXNGWjtDs5gIt15qbTNxb5nTPDdTA",
  "refresh_expires_at": "2026-10-31T10:58:21.266552393Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "at": "2026-10-30T22:58:21.462396264Z",
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
      "last_location_at": "2026-10-30T22:58:15.588409Z",
      "last_heartbeat_at": "2026-10-30T22:58:20.829804Z",
      "order_id": null
    }
  ]
}
```

## A fix next to the last accepted one is taken again

`POST /api/driver/v1/work-sessions/d439b4c3-8729-4f53-b9bc-9590243740a3/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2299,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:58:21Z",
    "sequence": 1793401101666
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "d439b4c3-8729-4f53-b9bc-9590243740a3",
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
  "last_heartbeat_at": "2026-10-30T22:58:21.684063Z",
  "last_location_at": "2026-10-30T22:58:21.684063Z",
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
  "session_id": "d439b4c3-8729-4f53-b9bc-9590243740a3",
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
  "last_heartbeat_at": "2026-10-30T22:58:21.684063Z",
  "last_location_at": "2026-10-30T22:58:21.684063Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d439b4c3-8729-4f53-b9bc-9590243740a3/close` → **200**

```json
{
  "command_id": "ef46db48-5fa7-4de1-88a3-4d8e584a283b",
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
  "device_ref": "sandbox-24464"
}
```

```json
{
  "challenge_id": "0c86397d-b3e7-410a-967e-e8d4ebb9d45a",
  "expires_at": "2026-10-30T23:03:22.303912434Z",
  "resend_available_at": "2026-10-30T22:58:23.303912434Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "254293",
  "sent_at": "2026-10-30T22:58:22.306373378Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0c86397d-b3e7-410a-967e-e8d4ebb9d45a",
  "code": "254293",
  "device_ref": "sandbox-24464"
}
```

```json
{
  "session_id": "a239064a-3c85-460a-a7b1-453a0786f22b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwMjAwMiwiaWF0IjoxNzkzNDAxMTAyLCJqdGkiOiJkYzkwMzQzNy0wZTViLTQ1NmEtODc1NC04NmZjYWEwZTIzYzMiLCJzaWQiOiJhMjM5MDY0YS0zYzg1LTQ2MGEtYTdiMS00NTNhMDc4NmYyMmIifQ._xa9uY0BbB_Ntq6u8oaBo1ppzJOA40h2BmIoElUp9oA",
  "access_expires_at": "2026-10-30T23:13:22.527106212Z",
  "refresh_token": "2s1AqRcxcbVi2fyeWpi8R8wRuIzs_UzAGjYDQip4BCc",
  "refresh_expires_at": "2026-11-29T22:58:22.526630957Z",
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
  "device_ref": "sandbox-4761"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "5125e883-30c0-493c-8397-82e6985aef42",
  "retryable": true,
  "retry_after_seconds": 1
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000001",
  "device_ref": "sandbox-4761"
}
```

```json
{
  "challenge_id": "167052a8-829e-48a2-ad89-70f33b814520",
  "expires_at": "2026-10-30T23:03:24.11373049Z",
  "resend_available_at": "2026-10-30T22:58:25.11373049Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "338528",
  "sent_at": "2026-10-30T22:58:24.115697521Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "167052a8-829e-48a2-ad89-70f33b814520",
  "code": "338528",
  "device_ref": "sandbox-4761"
}
```

```json
{
  "session_id": "d55ea3b0-93ee-4d81-a599-80b35bc8c3b9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwMjAwNCwiaWF0IjoxNzkzNDAxMTA0LCJqdGkiOiIxZmQxMDE5YS1iODdjLTRiODctYmMyNC02ZDY1ZjdjYTFkZTYiLCJzaWQiOiJkNTVlYTNiMC05M2VlLTRkODEtYTU5OS04MGIzNWJjOGMzYjkifQ.CcD2crX2Kdf-EJxDqoZBhkZwBcDFwelvM_UHexxUl8I",
  "access_expires_at": "2026-10-30T23:13:24.324507297Z",
  "refresh_token": "vhMRhimOgdd9Np02Q4IFvx2B-sAz3b5iUkppHjg-nUI",
  "refresh_expires_at": "2026-11-29T22:58:24.324077639Z",
  "account_created": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000002",
  "device_ref": "sandbox-27378"
}
```

```json
{
  "challenge_id": "c4e2ab46-faae-4ebe-951b-97cc9f97dc30",
  "expires_at": "2026-10-30T23:03:24.515567069Z",
  "resend_available_at": "2026-10-30T22:58:25.515567069Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000002` → **200**

```json
{
  "phone": "+48500000002",
  "audience": "DRIVER",
  "code": "224625",
  "sent_at": "2026-10-30T22:58:24.517433231Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c4e2ab46-faae-4ebe-951b-97cc9f97dc30",
  "code": "224625",
  "device_ref": "sandbox-27378"
}
```

```json
{
  "session_id": "7a52b60b-e884-4ec3-80ba-88c3b191e821",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000405"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDUiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwMjAwNCwiaWF0IjoxNzkzNDAxMTA0LCJqdGkiOiI5YjU5MTcxMS0xZTM1LTQ3YjQtOWVlMS1lOWQ2MTNhOWI5MDkiLCJzaWQiOiI3YTUyYjYwYi1lODg0LTRlYzMtODBiYS04OGMzYjE5MWU4MjEifQ.Dd1G5j7zcacUi_omCJOEzx6_92gKsk6XNdu-RUHQObY",
  "access_expires_at": "2026-10-30T23:13:24.738314376Z",
  "refresh_token": "nz-Wd6rC8ueIEIcRIrBorHCVNlhp-kO03a2zH9Mqv1Q",
  "refresh_expires_at": "2026-11-29T22:58:24.737905068Z",
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
  "command_id": "b453e609-1761-4c66-b70c-2452be198829",
  "vehicle_id": "5a000000-0000-4000-8000-000000000505",
  "location": {
    "lat": 52.2297,
    "lon": 21.1700,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T23:01:29Z",
    "sequence": 1793401289343
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "aeb8b6a6-b583-49e6-be13-bc23df0f7355",
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
  "last_heartbeat_at": "2026-10-30T23:01:29.360141Z",
  "last_location_at": "2026-10-30T23:01:29.360141Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders: nobody is near, the order goes to the ALL tab

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600859060",
  "device_ref": "sandbox-26945"
}
```

```json
{
  "challenge_id": "546011a5-7959-4a47-8c43-f4c4f21afb34",
  "expires_at": "2026-10-30T23:06:29.548555389Z",
  "resend_available_at": "2026-10-30T23:01:30.548555389Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600859060` → **200**

```json
{
  "phone": "+48600859060",
  "audience": "CLIENT",
  "code": "543477",
  "sent_at": "2026-10-30T23:01:29.550932554Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "546011a5-7959-4a47-8c43-f4c4f21afb34",
  "code": "543477",
  "device_ref": "sandbox-26945"
}
```

```json
{
  "session_id": "c9560453-e428-47bb-a063-bfa7689767b6",
  "subject": {
    "type": "CLIENT",
    "id": "ef853da9-d63e-44cb-acbb-f895c2c9d687"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZjg1M2RhOS1kNjNlLTQ0Y2ItYWNiYi1mODk1YzJjOWQ2ODciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDAyMTg5LCJpYXQiOjE3OTM0MDEyODksImp0aSI6ImJjZDViYjJlLWE2ZmEtNDNhZC1hZDU5LTA3Y2NkNGQ3Y2ViYyIsInNpZCI6ImM5NTYwNDUzLWU0MjgtNDdiYi1hMDYzLWJmYTc2ODk3NjdiNiJ9.LevcqYk8Y6k1nQWUB-C--_Fk6vPnNBlTR6DLCx8d2Sw",
  "access_expires_at": "2026-10-30T23:16:29.766871513Z",
  "refresh_token": "mjgyYRerjQqRbcsiCyG7-DVEyYNzDlPedxddF8p9GNQ",
  "refresh_expires_at": "2026-11-29T23:01:29.766434203Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "7db96bf3-ad5c-47e5-a805-0c55b40dddc6",
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
  "id": "bb16c8d7-6ef2-4932-b2e1-3ba51ffcd3e6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 4942,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T23:06:29.964510Z",
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
  "command_id": "95222996-61b4-4ef2-b718-e17ebaed0431",
  "quote_id": "bb16c8d7-6ef2-4932-b2e1-3ba51ffcd3e6",
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
  "id": "b90e5438-db0b-4fc4-8633-b2dd7692e2b8",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ef853da9-d63e-44cb-acbb-f895c2c9d687",
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
  "created_at": "2026-10-30T23:01:30.167531Z",
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

`GET /api/rider/v1/orders/b90e5438-db0b-4fc4-8633-b2dd7692e2b8` → **200**

```json
{
  "id": "b90e5438-db0b-4fc4-8633-b2dd7692e2b8",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ef853da9-d63e-44cb-acbb-f895c2c9d687",
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
  "created_at": "2026-10-30T23:01:30.167531Z",
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

`POST /api/driver/v1/orders/b90e5438-db0b-4fc4-8633-b2dd7692e2b8/claim` → **422**

```json
{
  "command_id": "038a6be9-1e66-477d-a6fa-9b35de48791a"
}
```

```json
{
  "instance": "/api/driver/v1/orders/b90e5438-db0b-4fc4-8633-b2dd7692e2b8/claim",
  "status": 422,
  "title": "Pickup too far",
  "type": "https://errors.blizz.taxi/pickup-too-far",
  "code": "PICKUP_TOO_FAR",
  "correlation_id": "0747e9b8-c1c1-4400-9644-28577dcb1a2a"
}
```

`GET /api/rider/v1/orders/b90e5438-db0b-4fc4-8633-b2dd7692e2b8` → **200**

```json
{
  "id": "b90e5438-db0b-4fc4-8633-b2dd7692e2b8",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ef853da9-d63e-44cb-acbb-f895c2c9d687",
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
  "created_at": "2026-10-30T23:01:30.167531Z",
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

`POST /api/driver/v1/orders/8b693d83-bf88-4199-9869-55abbf0bdb6b/claim` → **404**

```json
{
  "command_id": "e9f072ca-5ef8-4f4d-8eca-6c9c4428af3f"
}
```

```json
{
  "instance": "/api/driver/v1/orders/8b693d83-bf88-4199-9869-55abbf0bdb6b/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "1509be35-4196-4851-a758-80c8a24ad0df"
}
```

`POST /api/driver/v1/orders/16698d2a-bf49-4daf-88da-a0778b583f56/claim` → **404**

```json
{
  "command_id": "207a628e-cf88-4bc1-a8d4-494953b7cfd6"
}
```

```json
{
  "instance": "/api/driver/v1/orders/16698d2a-bf49-4daf-88da-a0778b583f56/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "e5b16925-3a2f-4622-b77f-2d7917d0eac3"
}
```

`POST /api/driver/v1/orders/a8fbbdb5-ca54-4d96-bd68-cb776a74f50e/claim` → **404**

```json
{
  "command_id": "5b2e5172-b438-478c-ab3b-5589d5e23df2"
}
```

```json
{
  "instance": "/api/driver/v1/orders/a8fbbdb5-ca54-4d96-bd68-cb776a74f50e/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "463da46c-586e-498e-9eae-286ec5141276"
}
```

`POST /api/driver/v1/orders/29419e10-c518-4ac8-b032-becff39f15c9/claim` → **404**

```json
{
  "command_id": "07d53518-8e47-40df-b630-835719d38552"
}
```

```json
{
  "instance": "/api/driver/v1/orders/29419e10-c518-4ac8-b032-becff39f15c9/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "90152ebf-acbb-47f0-94ee-ed2218e5a92e"
}
```

`POST /api/driver/v1/orders/c17a6432-6cc1-4315-8c9c-cc813e239a68/claim` → **404**

```json
{
  "command_id": "51af125d-b0d8-49bb-975a-fd213ceae2e5"
}
```

```json
{
  "instance": "/api/driver/v1/orders/c17a6432-6cc1-4315-8c9c-cc813e239a68/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "9b4a9daf-2137-4cfc-9d54-69dee8c22348"
}
```

`POST /api/driver/v1/orders/3a66af07-7d98-43ec-9c40-3dea2acb6864/claim` → **404**

```json
{
  "command_id": "3db6fb1c-e2d4-4124-967d-9d4f45a4a8bf"
}
```

```json
{
  "instance": "/api/driver/v1/orders/3a66af07-7d98-43ec-9c40-3dea2acb6864/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "b64b87fb-9f59-4537-b3e0-4eb1ecc85068"
}
```

`POST /api/driver/v1/orders/2a09ced8-2871-4214-94fc-8a3957777661/claim` → **404**

```json
{
  "command_id": "4646d848-99c4-4af7-a73f-72477ad83a6e"
}
```

```json
{
  "instance": "/api/driver/v1/orders/2a09ced8-2871-4214-94fc-8a3957777661/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "3bb8ff35-c8b7-4e4d-b03e-353c207cdda2"
}
```

`POST /api/driver/v1/orders/ff3a6878-2760-48a8-92ee-17384d899ff1/claim` → **404**

```json
{
  "command_id": "512777a8-14c4-4391-84ae-4b12648d69d2"
}
```

```json
{
  "instance": "/api/driver/v1/orders/ff3a6878-2760-48a8-92ee-17384d899ff1/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "73782965-558a-4027-8a84-906ff82dd04a"
}
```

`POST /api/driver/v1/orders/4f2ef085-f063-4420-997e-a08e033109c6/claim` → **404**

```json
{
  "command_id": "2afc6a7a-d54a-4f5e-9335-1c3d9e400000"
}
```

```json
{
  "instance": "/api/driver/v1/orders/4f2ef085-f063-4420-997e-a08e033109c6/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "1ebdfd60-bf0f-45d6-921b-6d3f52d97eda"
}
```

`POST /api/driver/v1/orders/ed13ad5d-928a-4770-811c-95a410eccd91/claim` → **404**

```json
{
  "command_id": "39d95992-701d-4e07-aa4c-e51a415dbb86"
}
```

```json
{
  "instance": "/api/driver/v1/orders/ed13ad5d-928a-4770-811c-95a410eccd91/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "67738f36-b164-4447-9ac0-a2d435febfee"
}
```

`POST /api/driver/v1/orders/b55a9661-cc0b-4410-824f-39932f140718/claim` → **404**

```json
{
  "command_id": "7132b68e-dd7b-4f5e-a420-8d61233cface"
}
```

```json
{
  "instance": "/api/driver/v1/orders/b55a9661-cc0b-4410-824f-39932f140718/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "b37e719b-c181-428f-809d-7baeefd73af2"
}
```

`POST /api/driver/v1/orders/bf0f5ee4-2eda-4ccb-8ccc-4bf8ad8b271e/claim` → **404**

```json
{
  "command_id": "0516e204-2b36-4656-a137-65b2ce6eb415"
}
```

```json
{
  "instance": "/api/driver/v1/orders/bf0f5ee4-2eda-4ccb-8ccc-4bf8ad8b271e/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "55dcac6f-ac6f-4b3b-9601-4eb8c676b942"
}
```

`POST /api/driver/v1/orders/dbc1095b-e8e9-45d5-9939-ca28bf3a773d/claim` → **404**

```json
{
  "command_id": "ad3feed2-4f78-4fb1-9115-57ccb090df98"
}
```

```json
{
  "instance": "/api/driver/v1/orders/dbc1095b-e8e9-45d5-9939-ca28bf3a773d/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "e4025d2c-80bd-4ff9-b4cb-9e10ead82e1f"
}
```

`POST /api/driver/v1/orders/9f768e09-e798-4b9b-b002-8a3f9de538f9/claim` → **404**

```json
{
  "command_id": "9a9044f0-b1c3-429c-9f40-cdc69c5f1dd8"
}
```

```json
{
  "instance": "/api/driver/v1/orders/9f768e09-e798-4b9b-b002-8a3f9de538f9/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "f9f6a5ef-1e2d-4a44-92d8-6e95f9b17f0f"
}
```

`POST /api/driver/v1/orders/409b178b-086e-4129-9e5f-2e7934ff9d9d/claim` → **404**

```json
{
  "command_id": "3b65742e-9acd-403f-bf70-969c87f413b3"
}
```

```json
{
  "instance": "/api/driver/v1/orders/409b178b-086e-4129-9e5f-2e7934ff9d9d/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "51006719-0c18-4ac3-84f8-6849cef77e22"
}
```

`POST /api/driver/v1/orders/37e8ad0d-b049-4ec4-bcaf-ef942f1859da/claim` → **404**

```json
{
  "command_id": "1e5cc99a-d3c4-4272-9931-7ac04b7110c0"
}
```

```json
{
  "instance": "/api/driver/v1/orders/37e8ad0d-b049-4ec4-bcaf-ef942f1859da/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "727c9cf5-b2ae-4f18-97c9-2bacb679e683"
}
```

`POST /api/driver/v1/orders/9bd37a09-524a-48de-9161-f45550c867e2/claim` → **404**

```json
{
  "command_id": "28d80adc-5fee-4368-906d-2de71eccf1b3"
}
```

```json
{
  "instance": "/api/driver/v1/orders/9bd37a09-524a-48de-9161-f45550c867e2/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "f207af9f-9f93-4bbf-afd1-d88920d65603"
}
```

`POST /api/driver/v1/orders/e6ff389e-2673-4dbe-b529-ff534bdce5ad/claim` → **404**

```json
{
  "command_id": "6f9bac09-07b6-4611-9b8d-9dd4e49166e9"
}
```

```json
{
  "instance": "/api/driver/v1/orders/e6ff389e-2673-4dbe-b529-ff534bdce5ad/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "db2d05c5-e1fb-4762-9186-66cdb1c5bcff"
}
```

`POST /api/driver/v1/orders/4db625f4-d3b1-4358-93c9-001e2446fad1/claim` → **404**

```json
{
  "command_id": "34f5973f-717a-4233-8711-a9d2b3373909"
}
```

```json
{
  "instance": "/api/driver/v1/orders/4db625f4-d3b1-4358-93c9-001e2446fad1/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "108867a4-4e66-4298-a678-7ed2f0d3f5f5"
}
```

`POST /api/driver/v1/orders/2207f35b-de27-4512-a85f-e471b36b16d6/claim` → **404**

```json
{
  "command_id": "3412284d-3993-4476-a7d4-9470039f2ebe"
}
```

```json
{
  "instance": "/api/driver/v1/orders/2207f35b-de27-4512-a85f-e471b36b16d6/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "e0c721ca-c22c-47fc-a3c7-b3b4995279a7"
}
```

`POST /api/driver/v1/orders/0b08a01d-688b-4cce-992d-7ecbfc51f086/claim` → **404**

```json
{
  "command_id": "82d0f2af-86d5-412a-b20c-38ebe040a3db"
}
```

```json
{
  "instance": "/api/driver/v1/orders/0b08a01d-688b-4cce-992d-7ecbfc51f086/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "d05e21ca-3afe-452a-b3ab-836c7494cfd6"
}
```

`POST /api/driver/v1/orders/c0b2af54-8bad-4835-938b-df2b7d49e603/claim` → **404**

```json
{
  "command_id": "db32a04d-a7d9-4f08-a708-16d6668fe29c"
}
```

```json
{
  "instance": "/api/driver/v1/orders/c0b2af54-8bad-4835-938b-df2b7d49e603/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "53a824aa-08d1-4ab3-9b35-f43446b9cdc1"
}
```

`POST /api/driver/v1/orders/49597450-846a-4469-bf44-34ce80bc795a/claim` → **404**

```json
{
  "command_id": "f3571e57-ee87-47ea-8148-0b61df3027cd"
}
```

```json
{
  "instance": "/api/driver/v1/orders/49597450-846a-4469-bf44-34ce80bc795a/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "adfcb1ea-7410-48cf-90b6-0b06d095b23e"
}
```

`POST /api/driver/v1/orders/cff8e40f-fa68-4d52-974a-eaa0c0da5dae/claim` → **404**

```json
{
  "command_id": "1402a343-8342-4eab-9161-ddb5ad8b365b"
}
```

```json
{
  "instance": "/api/driver/v1/orders/cff8e40f-fa68-4d52-974a-eaa0c0da5dae/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "19818681-ac78-4418-ae63-2f2876584e16"
}
```

`POST /api/driver/v1/orders/0f919d50-318e-43d3-88c0-eb7a66f95b04/claim` → **404**

```json
{
  "command_id": "6d60fd04-d8e0-4cbf-aade-564f734c43a6"
}
```

```json
{
  "instance": "/api/driver/v1/orders/0f919d50-318e-43d3-88c0-eb7a66f95b04/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "086f3372-da81-427e-8402-49a6aa93ab9d"
}
```

`POST /api/driver/v1/orders/8eaf8ef9-5bfd-446b-ae04-552d886fb783/claim` → **404**

```json
{
  "command_id": "1a33c4d3-795d-437a-952d-dd42a3865bc5"
}
```

```json
{
  "instance": "/api/driver/v1/orders/8eaf8ef9-5bfd-446b-ae04-552d886fb783/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "4c3127db-9afb-4c6f-b5d4-cd6875574935"
}
```

`POST /api/driver/v1/orders/8367f77a-0e74-4ab1-8fc1-f41f30a5eecd/claim` → **404**

```json
{
  "command_id": "56a0cc8d-e9a6-4904-affb-25ee321ee360"
}
```

```json
{
  "instance": "/api/driver/v1/orders/8367f77a-0e74-4ab1-8fc1-f41f30a5eecd/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "4e656435-153f-4dff-a4d8-84176ad97186"
}
```

`POST /api/driver/v1/orders/94df9036-fae6-41a0-b47f-8a55d2a51588/claim` → **404**

```json
{
  "command_id": "ebcd66e7-c361-459d-9d4e-66242371aae0"
}
```

```json
{
  "instance": "/api/driver/v1/orders/94df9036-fae6-41a0-b47f-8a55d2a51588/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "bbe17b81-619e-4581-be71-2a217cc8053e"
}
```

`POST /api/driver/v1/orders/9716a9c7-72ab-48a9-ba38-edd22324e48e/claim` → **404**

```json
{
  "command_id": "1e106694-e5b2-4a79-9bec-0d9e05dc321d"
}
```

```json
{
  "instance": "/api/driver/v1/orders/9716a9c7-72ab-48a9-ba38-edd22324e48e/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "e2bddf32-e76e-40f2-84b1-8c9bceb55ee0"
}
```

`POST /api/driver/v1/orders/531360fd-9513-49cd-ae39-f6f802f493e5/claim` → **429**

```json
{
  "command_id": "e7b09c37-fe80-484f-8249-e0a090aa04bb"
}
```

```json
{
  "instance": "/api/driver/v1/orders/531360fd-9513-49cd-ae39-f6f802f493e5/claim",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "b081b7d2-0119-44f9-befc-d404d6586cd0",
  "retryable": true,
  "retry_after_seconds": 594
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
  "command_id": "6335cb5a-d598-4356-9d42-5b98d0c5f9e7",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T23:01:37Z",
    "sequence": 1793401297496
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "cac53475-5f9a-4e95-8a8c-59795da896c3",
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
  "last_heartbeat_at": "2026-10-30T23:01:37.514468Z",
  "last_location_at": "2026-10-30T23:01:37.514468Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/broadcast-orders` → **200**

```json
[
  {
    "order_id": "b90e5438-db0b-4fc4-8633-b2dd7692e2b8",
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

`POST /api/driver/v1/orders/b90e5438-db0b-4fc4-8633-b2dd7692e2b8/claim` → **409**

```json
{
  "command_id": "ea598e4c-9cb0-4423-9800-233264af30d3"
}
```

```json
{
  "instance": "/api/driver/v1/orders/b90e5438-db0b-4fc4-8633-b2dd7692e2b8/claim",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "be8079aa-86b3-4284-a5b2-1693713e92a1"
}
```

`POST /api/driver/v1/orders/b90e5438-db0b-4fc4-8633-b2dd7692e2b8/claim` → **200**

```json
{
  "command_id": "bcd5a297-4f61-4d7b-8afc-c3fb4d75bb4b"
}
```

```json
{
  "id": "cc1b63bd-f792-4175-8d2c-02e271101daa",
  "order_id": "b90e5438-db0b-4fc4-8633-b2dd7692e2b8",
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "source": "BROADCAST",
  "state": "COMMITTED",
  "trip_id": "9f0f0053-3ef9-4b3a-996d-93db7ea4d935",
  "trip_phase": "TO_PICKUP"
}
```

## Piotr cancels at the rider's request (sandbox clean-up)

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9f0f0053-3ef9-4b3a-996d-93db7ea4d935",
  "order_id": "b90e5438-db0b-4fc4-8633-b2dd7692e2b8",
  "assignment_id": "cc1b63bd-f792-4175-8d2c-02e271101daa",
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

`POST /api/driver/v1/trips/9f0f0053-3ef9-4b3a-996d-93db7ea4d935/cancel` → **200**

```json
{
  "command_id": "b120b744-0892-4a26-8b5e-f7515c591394",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "9f0f0053-3ef9-4b3a-996d-93db7ea4d935",
  "order_id": "b90e5438-db0b-4fc4-8633-b2dd7692e2b8",
  "assignment_id": "cc1b63bd-f792-4175-8d2c-02e271101daa",
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

`GET /api/rider/v1/orders/b90e5438-db0b-4fc4-8633-b2dd7692e2b8` → **200**

```json
{
  "id": "b90e5438-db0b-4fc4-8633-b2dd7692e2b8",
  "short_number": 4,
  "status": "CANCELLED",
  "status_reason": "PASSENGER_ASKED",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "ef853da9-d63e-44cb-acbb-f895c2c9d687",
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
    "id": "cc1b63bd-f792-4175-8d2c-02e271101daa",
    "order_id": "b90e5438-db0b-4fc4-8633-b2dd7692e2b8",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "vehicle_id": "5a000000-0000-4000-8000-000000000504",
    "source": "BROADCAST",
    "state": "RELEASED",
    "trip_id": "9f0f0053-3ef9-4b3a-996d-93db7ea4d935",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T23:01:30.167531Z",
  "cancellation": {
    "by": "DRIVER",
    "reason_code": "PASSENGER_ASKED",
    "reason_labels": {
      "ru": "Пассажир попросил отменить",
      "pl": "Pasażer poprosił o anulowanie",
      "uk": "Пасажир попросив скасувати",
      "en": "Passenger asked to cancel"
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
  "session_id": "aeb8b6a6-b583-49e6-be13-bc23df0f7355",
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
  "last_heartbeat_at": "2026-10-30T23:01:29.360141Z",
  "last_location_at": "2026-10-30T23:01:29.360141Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/aeb8b6a6-b583-49e6-be13-bc23df0f7355/close` → **200**

```json
{
  "command_id": "71d587da-b16e-4678-8918-23af99026b51",
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
  "session_id": "cac53475-5f9a-4e95-8a8c-59795da896c3",
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
  "last_heartbeat_at": "2026-10-30T23:01:37.514468Z",
  "last_location_at": "2026-10-30T23:01:37.514468Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/cac53475-5f9a-4e95-8a8c-59795da896c3/close` → **200**

```json
{
  "command_id": "356b9637-5cb6-437a-b74e-dedd8ddab8d1",
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
  "session_id": "7ce4202f-a7c6-4f45-8619-199a48962d21",
  "subject": {
    "type": "STAFF",
    "id": "c66269c2-93bc-421d-8af2-6f0cafc54be4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjYyNjljMi05M2JjLTQyMWQtOGFmMi02ZjBjYWZjNTRiZTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDIxOTksImlhdCI6MTc5MzQwMTI5OSwianRpIjoiYWQwODJjNGMtNjZjOS00NGIxLWE3NTYtNDcwYmU4YjkyM2E0Iiwic2lkIjoiN2NlNDIwMmYtYTdjNi00ZjQ1LTg2MTktMTk5YTQ4OTYyZDIxIn0.w--pXHHMYH6tslkp2lz8mdZqdVrSipjWDZAgLPp6YLQ",
  "access_expires_at": "2026-10-30T23:16:39.915607525Z",
  "refresh_token": "-3KpYC3LY-VrU7cqOfFtIREXYM_UvToUZM7kOt76Xk8",
  "refresh_expires_at": "2026-10-31T11:01:39.915161416Z",
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
  "command_id": "05e2a12c-8951-4533-a086-d4da3460bfc5",
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
  "session_id": "82effe57-b604-48d5-a953-938a77e6be80",
  "subject": {
    "type": "STAFF",
    "id": "c66269c2-93bc-421d-8af2-6f0cafc54be4"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjYyNjljMi05M2JjLTQyMWQtOGFmMi02ZjBjYWZjNTRiZTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDIyMDAsImlhdCI6MTc5MzQwMTMwMCwianRpIjoiMjE5ZTIzOTQtYjQ2Yy00ZDk4LTg3ZTUtNDk1NzJlNTg3OTVkIiwic2lkIjoiODJlZmZlNTctYjYwNC00OGQ1LWE5NTMtOTM4YTc3ZTZiZTgwIn0.1xue9jAz3VA1WAlmQziwkKWatnTur300oWvxZ3wiBvA",
  "access_expires_at": "2026-10-30T23:16:40.691561317Z",
  "refresh_token": "RFQHT4ClP3jaQ0qaSAtsx1gNzhnR8E9A_2SwkzYphJs",
  "refresh_expires_at": "2026-10-31T11:01:40.691183996Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.837628895",
    "linkedid": "1730052700.837628895",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380676788230"
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
    "id": "1730052700.837628895",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "68beff14-49a0-4082-813a-ba9fafdc5c03",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380676788230",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T23:01:40.880511Z",
      "answered_at": null,
      "ended_at": "2026-10-30T23:01:40.902145Z",
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
    "id": "1730052600.2140913678",
    "linkedid": "1730052600.2140913678",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380676788230"
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
      "id": "8e388b8a-a90c-4636-ab5f-7570bb921952",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380676788230",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T23:01:41.123945Z",
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

`POST /api/operator/v1/calls/8e388b8a-a90c-4636-ab5f-7570bb921952/answer` → **200**

```json
{
  "command_id": "06738215-f7db-4060-8fcb-c62e6802784c"
}
```

```json
{
  "id": "8e388b8a-a90c-4636-ab5f-7570bb921952",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380676788230",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "c66269c2-93bc-421d-8af2-6f0cafc54be4",
  "order_ids": [],
  "started_at": "2026-10-30T23:01:41.123945Z",
  "answered_at": "2026-10-30T23:01:41.349883Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.2140913678",
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
    "id": "1730052600.2140913678",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "8e388b8a-a90c-4636-ab5f-7570bb921952",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380676788230",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "c66269c2-93bc-421d-8af2-6f0cafc54be4",
      "order_ids": [],
      "started_at": "2026-10-30T23:01:41.123945Z",
      "answered_at": "2026-10-30T23:01:41.349883Z",
      "ended_at": "2026-10-30T23:01:41.57378Z",
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
      "id": "8e388b8a-a90c-4636-ab5f-7570bb921952",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380676788230",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "c66269c2-93bc-421d-8af2-6f0cafc54be4",
      "order_ids": [],
      "started_at": "2026-10-30T23:01:41.123945Z",
      "answered_at": "2026-10-30T23:01:41.349883Z",
      "ended_at": "2026-10-30T23:01:41.57378Z",
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
      "id": "8e388b8a-a90c-4636-ab5f-7570bb921952",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380676788230",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "c66269c2-93bc-421d-8af2-6f0cafc54be4",
      "order_ids": [],
      "started_at": "2026-10-30T23:01:41.123945Z",
      "answered_at": "2026-10-30T23:01:41.349883Z",
      "ended_at": "2026-10-30T23:01:41.57378Z",
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
      "id": "8e388b8a-a90c-4636-ab5f-7570bb921952",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380676788230",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "c66269c2-93bc-421d-8af2-6f0cafc54be4",
      "order_ids": [],
      "started_at": "2026-10-30T23:01:41.123945Z",
      "answered_at": "2026-10-30T23:01:41.349883Z",
      "ended_at": "2026-10-30T23:01:41.57378Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T23:01:47.323998Z"
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
      "id": "8e388b8a-a90c-4636-ab5f-7570bb921952",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380676788230",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "c66269c2-93bc-421d-8af2-6f0cafc54be4",
      "order_ids": [],
      "started_at": "2026-10-30T23:01:41.123945Z",
      "answered_at": "2026-10-30T23:01:41.349883Z",
      "ended_at": "2026-10-30T23:01:41.57378Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T23:01:47.323998Z"
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

`GET /api/operator/v1/calls/8e388b8a-a90c-4636-ab5f-7570bb921952/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/8e388b8a-a90c-4636-ab5f-7570bb921952/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=8e388b8a-a90c-4636-ab5f-7570bb921952` → **200**

```json
{
  "changes": [
    {
      "id": "b5d792c2-cd82-4b30-8e56-04b2ac13ed8d",
      "occurred_at": "2026-10-30T23:01:48.626149Z",
      "actor_type": "STAFF",
      "actor_id": "c66269c2-93bc-421d-8af2-6f0cafc54be4",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "8e388b8a-a90c-4636-ab5f-7570bb921952",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"1f5e9dc4-1132-467c-8e51-992387de1657\", \"order_ids\": []}",
      "correlation_id": "6e46a643-91eb-4160-ae9e-76611502a09a"
    },
    {
      "id": "b73388b2-44f2-4608-9048-e98751b9200e",
      "occurred_at": "2026-10-30T23:01:48.600826Z",
      "actor_type": "STAFF",
      "actor_id": "c66269c2-93bc-421d-8af2-6f0cafc54be4",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "8e388b8a-a90c-4636-ab5f-7570bb921952",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"1f5e9dc4-1132-467c-8e51-992387de1657\", \"order_ids\": []}",
      "correlation_id": "a3f43a79-ee6b-4af1-96a2-c2498e706d4c"
    }
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
```

Done: call 8e388b8a-a90c-4636-ab5f-7570bb921952 recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-20713"
}
```

```json
{
  "challenge_id": "c2d12243-8dc3-4016-9feb-0c6b0fb548de",
  "expires_at": "2026-10-30T23:06:48.864579914Z",
  "resend_available_at": "2026-10-30T23:01:49.864579914Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "539521",
  "sent_at": "2026-10-30T23:01:48.866911572Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c2d12243-8dc3-4016-9feb-0c6b0fb548de",
  "code": "539521",
  "device_ref": "sandbox-20713"
}
```

```json
{
  "session_id": "2e4e01de-d074-4080-b3b2-ea3431fa7b54",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwMjIwOSwiaWF0IjoxNzkzNDAxMzA5LCJqdGkiOiJiOTFhNGZiZS0wODljLTRhODEtYjQ2NC03MmQ4M2QxMzY4MmIiLCJzaWQiOiIyZTRlMDFkZS1kMDc0LTQwODAtYjNiMi1lYTM0MzFmYTdiNTQifQ.lQDyiNQ--4ZwJj67ab-37CkpodNt6CfWvHcFsxI6wBI",
  "access_expires_at": "2026-10-30T23:16:49.089133326Z",
  "refresh_token": "B6MPzX_cLDRnk_WTU-ojva_4XiYu3Hn8yrbTsIjHFuM",
  "refresh_expires_at": "2026-11-29T23:01:49.088716385Z",
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
  "command_id": "82e987a8-f64d-4c6a-a48c-7e9d6d553d7c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T23:01:49Z",
    "sequence": 1793401309469
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "94f3fae8-5e71-4f25-b282-09b296e13bed",
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
  "last_heartbeat_at": "2026-10-30T23:01:49.484563Z",
  "last_location_at": "2026-10-30T23:01:49.484563Z",
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
  "session_id": "902eb525-ef8b-4485-8936-a56355718011",
  "subject": {
    "type": "STAFF",
    "id": "c66269c2-93bc-421d-8af2-6f0cafc54be4"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjYyNjljMi05M2JjLTQyMWQtOGFmMi02ZjBjYWZjNTRiZTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDIyMDksImlhdCI6MTc5MzQwMTMwOSwianRpIjoiODhiNWY2YjQtNDRlMy00NzJhLTg3NTMtODY4MGU3MDMyNzg2Iiwic2lkIjoiOTAyZWI1MjUtZWY4Yi00NDg1LTg5MzYtYTU2MzU1NzE4MDExIn0.RbBfNbtWx4q0ntlJ6TR4WxAj4vbbkDeqpp5m3gaLqpQ",
  "access_expires_at": "2026-10-30T23:16:49.877310982Z",
  "refresh_token": "r19ko-ym9hdb6QZd51IsvvRXpSAa8PqW2UyrArWRypQ",
  "refresh_expires_at": "2026-10-31T11:01:49.876878289Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "48f60ad0-69a8-4d10-ba7d-a38633f745bf",
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
  "id": "ce862072-b30a-4922-828c-e79aa9cf1529",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T23:06:50.078900Z",
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
  "command_id": "daa9aded-2989-4ce1-a782-3593c62f3d38",
  "quote_id": "ce862072-b30a-4922-828c-e79aa9cf1529",
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
    "phone": "+380671978435"
  }
}
```

```json
{
  "id": "af3607a5-5fc8-4432-91a7-2ad89db2ae9f",
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
  "created_at": "2026-10-30T23:01:50.287423Z",
  "caller": {
    "name": "Олена",
    "phone": "+380671978435"
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
    "id": "04c2131c-17cf-4e1d-8d8e-4d7f51da1255",
    "order_id": "af3607a5-5fc8-4432-91a7-2ad89db2ae9f",
    "expires_at": "2026-10-30T23:02:05.291589Z",
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

`POST /api/driver/v1/offers/04c2131c-17cf-4e1d-8d8e-4d7f51da1255/accept` → **200**

```json
{
  "command_id": "7769dc02-b8dd-4da2-91a5-634a31e0253c"
}
```

```json
{
  "id": "c08578fb-03b2-4e03-a21e-1556571bdded",
  "order_id": "af3607a5-5fc8-4432-91a7-2ad89db2ae9f",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "959e417e-0c95-40ca-8a75-2b587153589c",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380671978435` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380671978435` → **200**

```json
[
  {
    "phone": "+380671978435",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T23:01:51.824235137Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380671978435` → **200**

```json
[
  {
    "phone": "+380671978435",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T23:01:51.824235137Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380671978435` → **200**

```json
[
  {
    "phone": "+380671978435",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T23:01:51.824235137Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "959e417e-0c95-40ca-8a75-2b587153589c",
  "order_id": "af3607a5-5fc8-4432-91a7-2ad89db2ae9f",
  "assignment_id": "c08578fb-03b2-4e03-a21e-1556571bdded",
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
    "phone": "+380671978435"
  }
}
```

`POST /api/driver/v1/work-sessions/94f3fae8-5e71-4f25-b282-09b296e13bed/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T23:01:52Z",
    "sequence": 1793401312242
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "94f3fae8-5e71-4f25-b282-09b296e13bed",
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
  "last_heartbeat_at": "2026-10-30T23:01:52.257956Z",
  "last_location_at": "2026-10-30T23:01:52.257956Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/959e417e-0c95-40ca-8a75-2b587153589c/arrive` → **200**

```json
{
  "command_id": "78db67f0-a41b-4164-9888-551ac599d36e",
  "expected_version": 0
}
```

```json
{
  "id": "959e417e-0c95-40ca-8a75-2b587153589c",
  "order_id": "af3607a5-5fc8-4432-91a7-2ad89db2ae9f",
  "assignment_id": "c08578fb-03b2-4e03-a21e-1556571bdded",
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
  "arrived_at": "2026-10-30T23:01:52.448793Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380671978435"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380671978435` → **200**

```json
[
  {
    "phone": "+380671978435",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T23:01:51.824235137Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380671978435` → **200**

```json
[
  {
    "phone": "+380671978435",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T23:01:51.824235137Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380671978435` → **200**

```json
[
  {
    "phone": "+380671978435",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T23:01:51.824235137Z"
  },
  {
    "phone": "+380671978435",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T23:01:53.830211942Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380671978435` → **200**

```json
[
  {
    "phone": "+380671978435",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T23:01:51.824235137Z"
  },
  {
    "phone": "+380671978435",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T23:01:53.830211942Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380671978435` → **200**

```json
[
  {
    "phone": "+380671978435",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T23:01:51.824235137Z"
  },
  {
    "phone": "+380671978435",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T23:01:53.830211942Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/959e417e-0c95-40ca-8a75-2b587153589c/start` → **200**

```json
{
  "command_id": "1fa4e4fd-d60d-4389-a150-9939213a4749",
  "expected_version": 1
}
```

```json
{
  "id": "959e417e-0c95-40ca-8a75-2b587153589c",
  "order_id": "af3607a5-5fc8-4432-91a7-2ad89db2ae9f",
  "assignment_id": "c08578fb-03b2-4e03-a21e-1556571bdded",
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
  "arrived_at": "2026-10-30T23:01:52.448793Z",
  "started_at": "2026-10-30T23:01:54.741439Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380671978435"
  }
}
```

`POST /api/driver/v1/trips/959e417e-0c95-40ca-8a75-2b587153589c/complete` → **200**

```json
{
  "command_id": "4ba92afa-c5a0-4329-a48b-d5cad010af23",
  "expected_version": 2,
  "reported_at": "2026-10-30T23:01:54Z",
  "cash_received": true
}
```

```json
{
  "id": "959e417e-0c95-40ca-8a75-2b587153589c",
  "order_id": "af3607a5-5fc8-4432-91a7-2ad89db2ae9f",
  "assignment_id": "c08578fb-03b2-4e03-a21e-1556571bdded",
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
  "arrived_at": "2026-10-30T23:01:52.448793Z",
  "started_at": "2026-10-30T23:01:54.741439Z",
  "completed_at": "2026-10-30T23:01:54.943362Z",
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
  "session_id": "94f3fae8-5e71-4f25-b282-09b296e13bed",
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
  "last_heartbeat_at": "2026-10-30T23:01:52.257956Z",
  "last_location_at": "2026-10-30T23:01:52.257956Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/94f3fae8-5e71-4f25-b282-09b296e13bed/close` → **200**

```json
{
  "command_id": "a43d9723-1a92-478f-bfe0-f12819064cd3",
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
  "phone": "+380632960261",
  "device_ref": "sandbox-16449"
}
```

```json
{
  "challenge_id": "169637bd-c5ab-421e-820a-0119b713dfa4",
  "expires_at": "2026-10-30T23:06:55.515579887Z",
  "resend_available_at": "2026-10-30T23:01:56.515579887Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632960261` → **200**

```json
{
  "phone": "+380632960261",
  "audience": "CLIENT",
  "code": "990771",
  "sent_at": "2026-10-30T23:01:55.51749787Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "169637bd-c5ab-421e-820a-0119b713dfa4",
  "code": "990771",
  "device_ref": "sandbox-16449"
}
```

```json
{
  "session_id": "d2da1772-3b5e-47de-80a9-9b58fbf00c9f",
  "subject": {
    "type": "CLIENT",
    "id": "c55968de-7f15-4152-bb7b-23a7fa81cd81"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNTU5NjhkZS03ZjE1LTQxNTItYmI3Yi0yM2E3ZmE4MWNkODEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDAyMjE1LCJpYXQiOjE3OTM0MDEzMTUsImp0aSI6IjFjODljZTg5LWI3ODEtNDY3ZC1iYjA4LWY0ZTc0NDQ2MjBhMyIsInNpZCI6ImQyZGExNzcyLTNiNWUtNDdkZS04MGE5LTliNThmYmYwMGM5ZiJ9.C3mr0SKwoOvHo3_iZr4nshmqkSi85X2xwbtqiOQTli4",
  "access_expires_at": "2026-10-30T23:16:55.718121652Z",
  "refresh_token": "LyY54rMlLf8RJyGuNU2vn1SskHB18a_8HsUTAjBP2Kw",
  "refresh_expires_at": "2026-11-29T23:01:55.717799813Z",
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
        "pl": "Zmiana planów",
        "uk": "Передумав їхати",
        "en": "Changed my mind"
      },
      "driver_outcome": null
    },
    {
      "code": "WAIT_TOO_LONG",
      "labels": {
        "ru": "Долго ждать машину",
        "pl": "Zbyt długie oczekiwanie",
        "uk": "Довго чекати авто",
        "en": "The wait is too long"
      },
      "driver_outcome": null
    },
    {
      "code": "WRONG_ADDRESS",
      "labels": {
        "ru": "Ошибся адресом",
        "pl": "Błędny adres",
        "uk": "Помилився адресою",
        "en": "Wrong address"
      },
      "driver_outcome": null
    },
    {
      "code": "OTHER_TRANSPORT",
      "labels": {
        "ru": "Уеду на другом транспорте",
        "pl": "Inny transport",
        "uk": "Поїду іншим транспортом",
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
  "device_ref": "sandbox-16453"
}
```

```json
{
  "challenge_id": "d896654e-fab9-4651-95e2-5f057d8aa4a4",
  "expires_at": "2026-10-30T23:06:56.071952041Z",
  "resend_available_at": "2026-10-30T23:01:57.071952041Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "872051",
  "sent_at": "2026-10-30T23:01:56.073830154Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d896654e-fab9-4651-95e2-5f057d8aa4a4",
  "code": "872051",
  "device_ref": "sandbox-16453"
}
```

```json
{
  "session_id": "860a8a05-3a46-437a-89c5-72909edf526e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwMjIxNiwiaWF0IjoxNzkzNDAxMzE2LCJqdGkiOiI2NzBjZjRiMy1iY2YzLTRlMjktYjc4OC1lN2I0YTg3MjkxMzQiLCJzaWQiOiI4NjBhOGEwNS0zYTQ2LTQzN2EtODljNS03MjkwOWVkZjUyNmUifQ.GKJWYDHz5UBqR_H4u6pc0GypIK8AwbkrIK_d3Ar6tXA",
  "access_expires_at": "2026-10-30T23:16:56.281658749Z",
  "refresh_token": "2EIU4IjXx-7YoRuy16InK6Th1P_tO03TGM5GOwsW-gs",
  "refresh_expires_at": "2026-11-29T23:01:56.281280436Z",
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
        "pl": "Pasażer nie przyszedł",
        "uk": "Пасажир не вийшов",
        "en": "Passenger did not show up"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "PASSENGER_ASKED",
      "labels": {
        "ru": "Пассажир попросил отменить",
        "pl": "Pasażer poprosił o anulowanie",
        "uk": "Пасажир попросив скасувати",
        "en": "Passenger asked to cancel"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "VEHICLE_PROBLEM",
      "labels": {
        "ru": "Неисправность автомобиля",
        "pl": "Awaria samochodu",
        "uk": "Несправність автомобіля",
        "en": "Vehicle problem"
      },
      "driver_outcome": "RETURN_TO_SEARCH"
    },
    {
      "code": "CANNOT_REACH",
      "labels": {
        "ru": "Не могу подъехать",
        "pl": "Nie mogę dojechać",
        "uk": "Не можу під'їхати",
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
  "session_id": "9f4ca403-1691-46ab-82c0-00eab60bd72a",
  "subject": {
    "type": "STAFF",
    "id": "c66269c2-93bc-421d-8af2-6f0cafc54be4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjYyNjljMi05M2JjLTQyMWQtOGFmMi02ZjBjYWZjNTRiZTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDIyMTYsImlhdCI6MTc5MzQwMTMxNiwianRpIjoiYjMyYmQ4ZmMtY2NlYS00MDY2LWIxN2UtOGZkMzhhZjMxOTY4Iiwic2lkIjoiOWY0Y2E0MDMtMTY5MS00NmFiLTgyYzAtMDBlYWI2MGJkNzJhIn0.Eo04vpn7ePzevY_NlxlXC1NqbKy1F4jAYvL2nQHDM2I",
  "access_expires_at": "2026-10-30T23:16:56.856333503Z",
  "refresh_token": "uVWc6zkfjHaO6h78Y4JNEY4NJ-zD68aXEt2EORULfeU",
  "refresh_expires_at": "2026-10-31T11:01:56.855971825Z",
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
  "session_id": "88e9530e-1e38-4657-8da7-8667d7a014c9",
  "subject": {
    "type": "STAFF",
    "id": "c66269c2-93bc-421d-8af2-6f0cafc54be4"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjYyNjljMi05M2JjLTQyMWQtOGFmMi02ZjBjYWZjNTRiZTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDIyMTcsImlhdCI6MTc5MzQwMTMxNywianRpIjoiZDZmMGFmNmQtMzM0My00NTI1LTgxMTAtNDdmOWYxY2EyZWM4Iiwic2lkIjoiODhlOTUzMGUtMWUzOC00NjU3LThkYTctODY2N2Q3YTAxNGM5In0.NY8NTvAFZVcNWgPq7PbL7QIeoFxiknNgeAWZOBjg7wg",
  "access_expires_at": "2026-10-30T23:16:57.271478298Z",
  "refresh_token": "QxC10AyJ-qiYnU4S3befHdTzpiJ9UEETd8Z-n3SvAPg",
  "refresh_expires_at": "2026-10-31T11:01:57.27092859Z",
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
        "pl": "Na prośbę pasażera",
        "uk": "Пасажир попросив",
        "en": "Passenger asked"
      },
      "driver_outcome": null
    },
    {
      "code": "DUPLICATE",
      "labels": {
        "ru": "Дубль заказа",
        "pl": "Duplikat zamówienia",
        "uk": "Дубль замовлення",
        "en": "Duplicate order"
      },
      "driver_outcome": null
    },
    {
      "code": "NO_CARS",
      "labels": {
        "ru": "Нет свободных машин",
        "pl": "Brak wolnych aut",
        "uk": "Немає вільних авто",
        "en": "No cars available"
      },
      "driver_outcome": null
    },
    {
      "code": "TEST_ORDER",
      "labels": {
        "ru": "Тестовый заказ",
        "pl": "Zamówienie testowe",
        "uk": "Тестове замовлення",
        "en": "Test order"
      },
      "driver_outcome": null
    },
    {
      "code": "OPERATOR_ERROR",
      "labels": {
        "ru": "Ошибка оператора",
        "pl": "Błąd operatora",
        "uk": "Помилка оператора",
        "en": "Operator error"
      },
      "driver_outcome": null
    },
    {
      "code": "VEHICLE_BREAKDOWN",
      "labels": {
        "ru": "Поломка автомобиля в пути",
        "pl": "Awaria auta w trasie",
        "uk": "Поломка автомобіля в дорозі",
        "en": "Vehicle broke down on the way"
      },
      "driver_outcome": null
    },
    {
      "code": "ACCIDENT",
      "labels": {
        "ru": "ДТП",
        "pl": "Wypadek",
        "uk": "ДТП",
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
  "command_id": "b88a9d05-13d3-4a42-903e-0b185b5297d3",
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
  "id": "57e54ac7-1101-487d-be48-eb0f0f8f40be",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T23:06:57.669834Z",
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
  "command_id": "91bb225e-5ee4-496d-8ae8-0f968305166f",
  "quote_id": "57e54ac7-1101-487d-be48-eb0f0f8f40be",
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
  "id": "753cca22-c428-493c-9144-1eedc3fee5e6",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c55968de-7f15-4152-bb7b-23a7fa81cd81",
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
  "created_at": "2026-10-30T23:01:57.877294Z",
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

`GET /api/rider/v1/orders/753cca22-c428-493c-9144-1eedc3fee5e6` → **200**

```json
{
  "id": "753cca22-c428-493c-9144-1eedc3fee5e6",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c55968de-7f15-4152-bb7b-23a7fa81cd81",
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
  "created_at": "2026-10-30T23:01:57.877294Z",
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

`POST /api/rider/v1/orders/753cca22-c428-493c-9144-1eedc3fee5e6/cancel` → **200**

```json
{
  "command_id": "d7fef6fd-34e1-4719-8a4a-061d59cf2106",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "753cca22-c428-493c-9144-1eedc3fee5e6",
  "short_number": 6,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "c55968de-7f15-4152-bb7b-23a7fa81cd81",
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
  "created_at": "2026-10-30T23:01:57.877294Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "WAIT_TOO_LONG",
    "reason_labels": {
      "ru": "Долго ждать машину",
      "pl": "Zbyt długie oczekiwanie",
      "uk": "Довго чекати авто",
      "en": "The wait is too long"
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
  "command_id": "673582ea-8504-4868-927d-0921b2bb915f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T23:01:58Z",
    "sequence": 1793401318725
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "4cf49fb8-0e87-4987-acb9-8866f10f07d7",
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
  "last_heartbeat_at": "2026-10-30T23:01:58.740638Z",
  "last_location_at": "2026-10-30T23:01:58.740638Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-20073"
}
```

```json
{
  "challenge_id": "db12e121-c385-41c2-8999-c482f117b22e",
  "expires_at": "2026-10-30T23:06:58.927430784Z",
  "resend_available_at": "2026-10-30T23:01:59.927430784Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "991188",
  "sent_at": "2026-10-30T23:01:58.929341316Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "db12e121-c385-41c2-8999-c482f117b22e",
  "code": "991188",
  "device_ref": "sandbox-20073"
}
```

```json
{
  "session_id": "094bfb17-213f-4bd3-bbd3-a42330205797",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwMjIxOSwiaWF0IjoxNzkzNDAxMzE5LCJqdGkiOiJkNmI4YTNiMi03NGI4LTQzNDAtOWIyMC0xMmFjMzI1OGUwOTQiLCJzaWQiOiIwOTRiZmIxNy0yMTNmLTRiZDMtYmJkMy1hNDIzMzAyMDU3OTcifQ.Wsi8PcG0AiWqY9V_-h0NX30PDVxTv9pSOreFkJl90Y8",
  "access_expires_at": "2026-10-30T23:16:59.153403437Z",
  "refresh_token": "oUzLHQVMz3ATbSIXeMe07aZ-5k2kHpgVYWJ3rX_LuxY",
  "refresh_expires_at": "2026-11-29T23:01:59.152947579Z",
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
  "command_id": "9d008615-38e4-4572-8cea-9de452114cf1",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T23:01:59Z",
    "sequence": 1793401319609
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "df4235d8-1094-4330-a4f4-9fce5fdc3e4b",
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
  "last_heartbeat_at": "2026-10-30T23:01:59.625304Z",
  "last_location_at": "2026-10-30T23:01:59.625304Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "9aae2f41-7bc3-46dd-b5c0-191dc066b445",
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
  "id": "1b114db7-521b-4783-a9e8-24bcce16184a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T23:06:59.824816Z",
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
  "command_id": "03574ab7-31a8-44ad-ab61-a76588f0ec77",
  "quote_id": "1b114db7-521b-4783-a9e8-24bcce16184a",
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
  "id": "fcf6a1e3-4f96-4a8c-80bf-de5f8986476c",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c55968de-7f15-4152-bb7b-23a7fa81cd81",
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
  "created_at": "2026-10-30T23:02:00.028578Z",
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
    "id": "05e5d8df-1e19-4fd2-95c0-2a51f2169efd",
    "order_id": "fcf6a1e3-4f96-4a8c-80bf-de5f8986476c",
    "expires_at": "2026-10-30T23:02:15.031338Z",
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

`POST /api/driver/v1/offers/05e5d8df-1e19-4fd2-95c0-2a51f2169efd/accept` → **200**

```json
{
  "command_id": "3a97a734-444c-49ae-aa12-b2c0e6621cfc"
}
```

```json
{
  "id": "77955590-1203-4bf7-ac0f-56bf234eab1b",
  "order_id": "fcf6a1e3-4f96-4a8c-80bf-de5f8986476c",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "deb505ce-1a1a-478e-8500-8aee7952f72b",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "deb505ce-1a1a-478e-8500-8aee7952f72b",
  "order_id": "fcf6a1e3-4f96-4a8c-80bf-de5f8986476c",
  "assignment_id": "77955590-1203-4bf7-ac0f-56bf234eab1b",
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

`POST /api/driver/v1/trips/deb505ce-1a1a-478e-8500-8aee7952f72b/cancel` → **200**

```json
{
  "command_id": "bec1e8ac-c1fd-4077-af18-2eae81bc4b12",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "deb505ce-1a1a-478e-8500-8aee7952f72b",
  "order_id": "fcf6a1e3-4f96-4a8c-80bf-de5f8986476c",
  "assignment_id": "77955590-1203-4bf7-ac0f-56bf234eab1b",
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

`GET /api/rider/v1/orders/fcf6a1e3-4f96-4a8c-80bf-de5f8986476c` → **200**

```json
{
  "id": "fcf6a1e3-4f96-4a8c-80bf-de5f8986476c",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "c55968de-7f15-4152-bb7b-23a7fa81cd81",
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
  "created_at": "2026-10-30T23:02:00.028578Z",
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
    "at": "2026-10-30T23:02:00.838194Z"
  }
}
```

## Andrii gets it and cancels: «Пассажир попросил отменить»

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "9d796620-4121-4222-9cb2-34d1de7348f1",
    "order_id": "fcf6a1e3-4f96-4a8c-80bf-de5f8986476c",
    "expires_at": "2026-10-30T23:02:15.840586Z",
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

`POST /api/driver/v1/offers/9d796620-4121-4222-9cb2-34d1de7348f1/accept` → **200**

```json
{
  "command_id": "708887df-4826-4c49-b02e-b6ffbd3ac76f"
}
```

```json
{
  "id": "56dcacab-fda6-4769-a22c-04ffa62b2421",
  "order_id": "fcf6a1e3-4f96-4a8c-80bf-de5f8986476c",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "084a8bf6-809d-43cd-9b6b-d7405c11d344",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "084a8bf6-809d-43cd-9b6b-d7405c11d344",
  "order_id": "fcf6a1e3-4f96-4a8c-80bf-de5f8986476c",
  "assignment_id": "56dcacab-fda6-4769-a22c-04ffa62b2421",
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

`POST /api/driver/v1/trips/084a8bf6-809d-43cd-9b6b-d7405c11d344/cancel` → **200**

```json
{
  "command_id": "8956c74f-cdcc-40a2-aecc-088f6d3df93b",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "084a8bf6-809d-43cd-9b6b-d7405c11d344",
  "order_id": "fcf6a1e3-4f96-4a8c-80bf-de5f8986476c",
  "assignment_id": "56dcacab-fda6-4769-a22c-04ffa62b2421",
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
      "id": "fcf6a1e3-4f96-4a8c-80bf-de5f8986476c",
      "short_number": 7,
      "status": "CANCELLED",
      "created_at": "2026-10-30T23:02:00.028578Z",
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
          "pl": "Pasażer poprosił o anulowanie",
          "uk": "Пасажир попросив скасувати",
          "en": "Passenger asked to cancel"
        }
      },
      "pickup_at": null
    },
    {
      "id": "753cca22-c428-493c-9144-1eedc3fee5e6",
      "short_number": 6,
      "status": "CANCELLED",
      "created_at": "2026-10-30T23:01:57.877294Z",
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
          "pl": "Zbyt długie oczekiwanie",
          "uk": "Довго чекати авто",
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

`GET /api/operator/v1/orders/fcf6a1e3-4f96-4a8c-80bf-de5f8986476c/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T23:02:00.028985Z",
      "actor": {
        "type": "CLIENT",
        "id": "c55968de-7f15-4152-bb7b-23a7fa81cd81",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "fcf6a1e3-4f96-4a8c-80bf-de5f8986476c",
        "quote_id": "1b114db7-521b-4783-a9e8-24bcce16184a",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "8ffc6b06-584e-42c1-b421-dbd28131db3b"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T23:02:00.030612Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "fcf6a1e3-4f96-4a8c-80bf-de5f8986476c",
        "attempt_id": "18e33c51-67bc-4240-88b2-d35741230b63",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "8ffc6b06-584e-42c1-b421-dbd28131db3b"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T23:02:00.048855Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "05e5d8df-1e19-4fd2-95c0-2a51f2169efd",
        "order_id": "fcf6a1e3-4f96-4a8c-80bf-de5f8986476c",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478,
        "expires_at": "2026-10-30T23:02:15.031337521Z"
      },
      "correlation_id": "8ffc6b06-584e-42c1-b421-dbd28131db3b"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T23:02:00.454856Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "05e5d8df-1e19-4fd2-95c0-2a51f2169efd",
        "order_id": "fcf6a1e3-4f96-4a8c-80bf-de5f8986476c",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "77955590-1203-4bf7-ac0f-56bf234eab1b"
      },
```

Done: orders 753cca22-c428-493c-9144-1eedc3fee5e6, fcf6a1e3-4f96-4a8c-80bf-de5f8986476c.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380733828933",
  "device_ref": "sandbox-30200"
}
```

```json
{
  "challenge_id": "12163613-d663-4b86-839f-214e11c2a55f",
  "expires_at": "2026-10-30T23:07:02.4323437Z",
  "resend_available_at": "2026-10-30T23:02:03.4323437Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380733828933` → **200**

```json
{
  "phone": "+380733828933",
  "audience": "CLIENT",
  "code": "564994",
  "sent_at": "2026-10-30T23:02:02.43462926Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "12163613-d663-4b86-839f-214e11c2a55f",
  "code": "564994",
  "device_ref": "sandbox-30200"
}
```

```json
{
  "session_id": "0716e1d2-2f2c-4582-8fc9-a0db25c7d673",
  "subject": {
    "type": "CLIENT",
    "id": "ada4383c-3607-47c3-9f14-5d0ae3e4c1a3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZGE0MzgzYy0zNjA3LTQ3YzMtOWYxNC01ZDBhZTNlNGMxYTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDAyMjIyLCJpYXQiOjE3OTM0MDEzMjIsImp0aSI6ImNhOGE4Mjc1LTg0Y2YtNDQ0Zi05MTI2LTVjNWYwMzZlZjdiZiIsInNpZCI6IjA3MTZlMWQyLTJmMmMtNDU4Mi04ZmM5LWEwZGIyNWM3ZDY3MyJ9.jA3ZAaw5pDQ1dbd3hDoirhZwCKxHiFtxiINpVo6oAD4",
  "access_expires_at": "2026-10-30T23:17:02.662116516Z",
  "refresh_token": "AVkIMBXIIN1UHM1S7m0fAAU_85-4-jZHwOPiG1UY9ZY",
  "refresh_expires_at": "2026-11-29T23:02:02.661684763Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "22f81816-61b6-43ef-b84a-90b626bd0950",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "c770597f-c76f-4cd8-be5d-690d509eda95",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-c770597f-c76f-4cd8-be5d-690d509eda95",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "7624b9febffbc6995b2f71b79ab1e99d",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=c770597f-c76f-4cd8-be5d-690d509eda95",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380733828933"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=c770597f-c76f-4cd8-be5d-690d509eda95",
  "expires_at": "2026-10-30T23:32:02.852248Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/c770597f-c76f-4cd8-be5d-690d509eda95` → **200**

```json
{
  "id": "c770597f-c76f-4cd8-be5d-690d509eda95",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T23:32:02.852248Z",
  "card": {
    "id": "c31f2b7f-dfb4-426b-a6bf-f936c13482dd",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****5297",
    "card_type": "Visa",
    "created_at": "2026-10-30T23:02:03.048946Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "c31f2b7f-dfb4-426b-a6bf-f936c13482dd",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****5297",
      "card_type": "Visa",
      "created_at": "2026-10-30T23:02:03.048946Z"
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
  "device_ref": "sandbox-21203"
}
```

```json
{
  "challenge_id": "20bc0602-cd82-4427-966d-ec6eb89c6057",
  "expires_at": "2026-10-30T23:07:03.444334805Z",
  "resend_available_at": "2026-10-30T23:02:04.444334805Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "404390",
  "sent_at": "2026-10-30T23:02:03.44633205Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "20bc0602-cd82-4427-966d-ec6eb89c6057",
  "code": "404390",
  "device_ref": "sandbox-21203"
}
```

```json
{
  "session_id": "6dddb1c8-48fd-4d26-8374-8ad4a7f2fd1b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwMjIyMywiaWF0IjoxNzkzNDAxMzIzLCJqdGkiOiJhMTJjZTU4YS1jNTUwLTQyYmQtYWM5YS1mZGYxMzUyMTdkOGUiLCJzaWQiOiI2ZGRkYjFjOC00OGZkLTRkMjYtODM3NC04YWQ0YTdmMmZkMWIifQ.5f3AjemuXbeumF_yOSrpJDjS97Jff-ORnRrkq8v_Zi0",
  "access_expires_at": "2026-10-30T23:17:03.655509865Z",
  "refresh_token": "dly4HufDXGWztS1CsUvJzubWGLPdkOyYfdgth0PSnGQ",
  "refresh_expires_at": "2026-11-29T23:02:03.655122087Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "df4235d8-1094-4330-a4f4-9fce5fdc3e4b",
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
  "last_heartbeat_at": "2026-10-30T23:01:59.625304Z",
  "last_location_at": "2026-10-30T23:01:59.625304Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/df4235d8-1094-4330-a4f4-9fce5fdc3e4b/handover` → **200**

```json
{
  "command_id": "80ff1158-e68b-4ee8-a074-a751cecdb276",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "df4235d8-1094-4330-a4f4-9fce5fdc3e4b",
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
  "last_heartbeat_at": "2026-10-30T23:01:59.625304Z",
  "last_location_at": "2026-10-30T23:01:59.625304Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

(the car drives 44 s to the next point)

`POST /api/driver/v1/work-sessions/df4235d8-1094-4330-a4f4-9fce5fdc3e4b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T23:02:48Z",
    "sequence": 1793401368252
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "df4235d8-1094-4330-a4f4-9fce5fdc3e4b",
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
  "last_heartbeat_at": "2026-10-30T23:02:48.2741Z",
  "last_location_at": "2026-10-30T23:02:48.2741Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "77284c4e-436a-40a1-8a3e-fdf1bd3e71c9",
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
  "id": "f3381bb0-9a30-47df-96d5-ccfb384956fb",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T23:07:48.493295Z",
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
  "command_id": "14d322b5-06e0-404c-ac07-a670f46a0706",
  "quote_id": "f3381bb0-9a30-47df-96d5-ccfb384956fb",
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
  "id": "5289ad49-c171-4038-9138-7dfb8d0d1dad",
  "short_number": 8,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "ada4383c-3607-47c3-9f14-5d0ae3e4c1a3",
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
  "created_at": "2026-10-30T23:02:48.717531Z",
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

`GET /api/rider/v1/orders/5289ad49-c171-4038-9138-7dfb8d0d1dad` → **200**

```json
{
  "id": "5289ad49-c171-4038-9138-7dfb8d0d1dad",
  "short_number": 8,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "ada4383c-3607-47c3-9f14-5d0ae3e4c1a3",
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
  "created_at": "2026-10-30T23:02:48.717531Z",
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

`GET /api/rider/v1/orders/5289ad49-c171-4038-9138-7dfb8d0d1dad` → **200**

```json
{
  "id": "5289ad49-c171-4038-9138-7dfb8d0d1dad",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "ada4383c-3607-47c3-9f14-5d0ae3e4c1a3",
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
  "created_at": "2026-10-30T23:02:48.717531Z",
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
    "id": "de6da509-424e-4095-a471-86fb6234223f",
    "order_id": "5289ad49-c171-4038-9138-7dfb8d0d1dad",
    "expires_at": "2026-10-30T23:03:04.215055Z",
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

`POST /api/driver/v1/offers/de6da509-424e-4095-a471-86fb6234223f/accept` → **200**

```json
{
  "command_id": "8e4986ec-f183-4794-8063-e5ad31a32bf4"
}
```

```json
{
  "id": "08645221-67a0-4c68-b951-f70d0359cf09",
  "order_id": "5289ad49-c171-4038-9138-7dfb8d0d1dad",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "5c523346-fb84-413f-b3be-c72793186a4f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "5c523346-fb84-413f-b3be-c72793186a4f",
  "order_id": "5289ad49-c171-4038-9138-7dfb8d0d1dad",
  "assignment_id": "08645221-67a0-4c68-b951-f70d0359cf09",
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

`POST /api/driver/v1/work-sessions/df4235d8-1094-4330-a4f4-9fce5fdc3e4b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T23:02:57Z",
    "sequence": 1793401377545
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "df4235d8-1094-4330-a4f4-9fce5fdc3e4b",
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
  "last_heartbeat_at": "2026-10-30T23:02:57.072235Z",
  "last_location_at": "2026-10-30T23:02:57.072235Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/5c523346-fb84-413f-b3be-c72793186a4f/arrive` → **200**

```json
{
  "command_id": "eb6a68cb-e5c0-40c9-873e-6678e1abaf9e",
  "expected_version": 0
}
```

```json
{
  "id": "5c523346-fb84-413f-b3be-c72793186a4f",
  "order_id": "5289ad49-c171-4038-9138-7dfb8d0d1dad",
  "assignment_id": "08645221-67a0-4c68-b951-f70d0359cf09",
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
  "arrived_at": "2026-10-30T23:02:57.291013Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/5c523346-fb84-413f-b3be-c72793186a4f/start` → **200**

```json
{
  "command_id": "3f99b301-c7c9-4bad-ae80-b0ac177ba37b",
  "expected_version": 1
}
```

```json
{
  "id": "5c523346-fb84-413f-b3be-c72793186a4f",
  "order_id": "5289ad49-c171-4038-9138-7dfb8d0d1dad",
  "assignment_id": "08645221-67a0-4c68-b951-f70d0359cf09",
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
  "arrived_at": "2026-10-30T23:02:57.291013Z",
  "started_at": "2026-10-30T23:02:57.516229Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/5c523346-fb84-413f-b3be-c72793186a4f/complete` → **200**

```json
{
  "command_id": "9ef79407-2719-4e65-b981-9630cd7d39b8",
  "expected_version": 2,
  "reported_at": "2026-10-30T23:02:57Z",
  "cash_received": true
}
```

```json
{
  "id": "5c523346-fb84-413f-b3be-c72793186a4f",
  "order_id": "5289ad49-c171-4038-9138-7dfb8d0d1dad",
  "assignment_id": "08645221-67a0-4c68-b951-f70d0359cf09",
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
  "arrived_at": "2026-10-30T23:02:57.291013Z",
  "started_at": "2026-10-30T23:02:57.516229Z",
  "completed_at": "2026-10-30T23:02:57.749303Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/5289ad49-c171-4038-9138-7dfb8d0d1dad` → **200**

```json
{
  "id": "5289ad49-c171-4038-9138-7dfb8d0d1dad",
  "short_number": 8,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "ada4383c-3607-47c3-9f14-5d0ae3e4c1a3",
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
    "id": "08645221-67a0-4c68-b951-f70d0359cf09",
    "order_id": "5289ad49-c171-4038-9138-7dfb8d0d1dad",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "5c523346-fb84-413f-b3be-c72793186a4f",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T23:02:48.717531Z",
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

`GET /api/rider/v1/orders/5289ad49-c171-4038-9138-7dfb8d0d1dad` → **200**

```json
{
  "id": "5289ad49-c171-4038-9138-7dfb8d0d1dad",
  "short_number": 8,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "ada4383c-3607-47c3-9f14-5d0ae3e4c1a3",
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
    "id": "08645221-67a0-4c68-b951-f70d0359cf09",
    "order_id": "5289ad49-c171-4038-9138-7dfb8d0d1dad",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "5c523346-fb84-413f-b3be-c72793186a4f",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T23:02:48.717531Z",
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

`GET /api/rider/v1/orders/5289ad49-c171-4038-9138-7dfb8d0d1dad` → **200**

```json
{
  "id": "5289ad49-c171-4038-9138-7dfb8d0d1dad",
  "short_number": 8,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "ada4383c-3607-47c3-9f14-5d0ae3e4c1a3",
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
    "id": "08645221-67a0-4c68-b951-f70d0359cf09",
    "order_id": "5289ad49-c171-4038-9138-7dfb8d0d1dad",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "5c523346-fb84-413f-b3be-c72793186a4f",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T23:02:48.717531Z",
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

`GET /api/rider/v1/orders/5289ad49-c171-4038-9138-7dfb8d0d1dad` → **200**

```json
{
  "id": "5289ad49-c171-4038-9138-7dfb8d0d1dad",
  "short_number": 8,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "ada4383c-3607-47c3-9f14-5d0ae3e4c1a3",
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
    "id": "08645221-67a0-4c68-b951-f70d0359cf09",
    "order_id": "5289ad49-c171-4038-9138-7dfb8d0d1dad",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "5c523346-fb84-413f-b3be-c72793186a4f",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T23:02:48.717531Z",
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

`GET /api/rider/v1/orders/5289ad49-c171-4038-9138-7dfb8d0d1dad/tip` → **200**

```json
{
  "order_id": "5289ad49-c171-4038-9138-7dfb8d0d1dad",
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
  "available_until": "2026-10-31T23:02:57.749303Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/5289ad49-c171-4038-9138-7dfb8d0d1dad/tip` → **201**

```json
{
  "command_id": "f460b031-cb93-44e9-ac80-a4c57bc62d95",
  "amount_minor": 2500
}
```

```json
{
  "id": "27fde341-1cc0-45c4-b6b4-44b9175e12f3",
  "order_id": "5289ad49-c171-4038-9138-7dfb8d0d1dad",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T23:03:02.290235Z"
}
```

`GET /api/rider/v1/orders/5289ad49-c171-4038-9138-7dfb8d0d1dad/tip` → **200**

```json
{
  "order_id": "5289ad49-c171-4038-9138-7dfb8d0d1dad",
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
  "available_until": "2026-10-31T23:02:57.749303Z",
  "open": false,
  "tip": {
    "id": "27fde341-1cc0-45c4-b6b4-44b9175e12f3",
    "order_id": "5289ad49-c171-4038-9138-7dfb8d0d1dad",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T23:03:02.290235Z"
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
      "id": "e0b40f29-5ecb-4054-8073-b5a03144727c",
      "at": "2026-10-30T23:02:58.342501Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "5289ad49-c171-4038-9138-7dfb8d0d1dad",
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
      "id": "83de8435-5503-450e-9eb6-a75c81fb40b2",
      "at": "2026-10-30T23:03:03.457228Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "5289ad49-c171-4038-9138-7dfb8d0d1dad",
      "counterpart_id": null
    },
    {
      "id": "e0b40f29-5ecb-4054-8073-b5a03144727c",
      "at": "2026-10-30T23:02:58.342501Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "5289ad49-c171-4038-9138-7dfb8d0d1dad",
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
  "command_id": "2e5ddde8-21e4-4303-8387-c79a88274d30",
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
  "id": "e9cbe1d0-4b62-4735-8245-083c404ab118",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T23:08:04.138767Z",
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
  "session_id": "253297f9-6b3c-4e75-b3c8-abdcb7f5ea10",
  "subject": {
    "type": "STAFF",
    "id": "c66269c2-93bc-421d-8af2-6f0cafc54be4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjYyNjljMi05M2JjLTQyMWQtOGFmMi02ZjBjYWZjNTRiZTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDIyODQsImlhdCI6MTc5MzQwMTM4NCwianRpIjoiYTM2ZjQyM2YtMGExMC00ZDg1LTk3YzUtODcxN2FkOGJiMDk5Iiwic2lkIjoiMjUzMjk3ZjktNmIzYy00ZTc1LWIzYzgtYWJkY2I3ZjVlYTEwIn0.64fUBto1gH5rIQTVzAWS21LdhJAc9t90OKHZe0Cap0w",
  "access_expires_at": "2026-10-30T23:18:04.558807307Z",
  "refresh_token": "-LSORGJ7k7uHC5_QPi2-bVLY2Pflg3tPuadcUKQTcWU",
  "refresh_expires_at": "2026-10-31T11:03:04.55837906Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380733828933` → **200**

```json
{
  "client_id": "ada4383c-3607-47c3-9f14-5d0ae3e4c1a3"
}
```

`POST /api/admin/v1/rider-wallets/ada4383c-3607-47c3-9f14-5d0ae3e4c1a3/top-ups` → **201**

```json
{
  "command_id": "86c8267d-396a-4416-8286-0197103db9c6",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "ada4383c-3607-47c3-9f14-5d0ae3e4c1a3",
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
      "id": "d1dcb6d8-1f17-479f-81f4-f0e3d2f3629c",
      "at": "2026-10-30T23:03:04.965241Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "c66269c2-93bc-421d-8af2-6f0cafc54be4",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "07a2f41f-1913-407d-b925-720ff57ad41e",
  "quote_id": "e9cbe1d0-4b62-4735-8245-083c404ab118",
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
  "id": "f4fe2f3c-9c20-4b58-995c-9b573524b425",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ada4383c-3607-47c3-9f14-5d0ae3e4c1a3",
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
  "created_at": "2026-10-30T23:03:05.194725Z",
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

`GET /api/rider/v1/orders/f4fe2f3c-9c20-4b58-995c-9b573524b425` → **200**

```json
{
  "id": "f4fe2f3c-9c20-4b58-995c-9b573524b425",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ada4383c-3607-47c3-9f14-5d0ae3e4c1a3",
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
  "created_at": "2026-10-30T23:03:05.194725Z",
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
    "id": "1287cff5-2764-43a5-bb42-97f1903880f5",
    "order_id": "f4fe2f3c-9c20-4b58-995c-9b573524b425",
    "expires_at": "2026-10-30T23:03:20.198145Z",
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

`POST /api/driver/v1/offers/1287cff5-2764-43a5-bb42-97f1903880f5/accept` → **200**

```json
{
  "command_id": "7ae2403a-ec2c-473a-a3da-e666843080d5"
}
```

```json
{
  "id": "c1475b6d-d49b-4409-9842-c729d663c91f",
  "order_id": "f4fe2f3c-9c20-4b58-995c-9b573524b425",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d7d19359-1598-4c55-9492-a02d50c72247",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d7d19359-1598-4c55-9492-a02d50c72247",
  "order_id": "f4fe2f3c-9c20-4b58-995c-9b573524b425",
  "assignment_id": "c1475b6d-d49b-4409-9842-c729d663c91f",
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

`POST /api/driver/v1/work-sessions/df4235d8-1094-4330-a4f4-9fce5fdc3e4b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T23:03:06Z",
    "sequence": 1793401386289
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "df4235d8-1094-4330-a4f4-9fce5fdc3e4b",
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
  "last_heartbeat_at": "2026-10-30T23:03:06.306708Z",
  "last_location_at": "2026-10-30T23:03:06.306708Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/d7d19359-1598-4c55-9492-a02d50c72247/arrive` → **200**

```json
{
  "command_id": "5e37d49f-b57f-4a44-a88f-795da510d243",
  "expected_version": 0
}
```

```json
{
  "id": "d7d19359-1598-4c55-9492-a02d50c72247",
  "order_id": "f4fe2f3c-9c20-4b58-995c-9b573524b425",
  "assignment_id": "c1475b6d-d49b-4409-9842-c729d663c91f",
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
  "arrived_at": "2026-10-30T23:03:06.524187Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/d7d19359-1598-4c55-9492-a02d50c72247/start` → **200**

```json
{
  "command_id": "14bfb433-eab7-443b-a491-1c4b98e73535",
  "expected_version": 1
}
```

```json
{
  "id": "d7d19359-1598-4c55-9492-a02d50c72247",
  "order_id": "f4fe2f3c-9c20-4b58-995c-9b573524b425",
  "assignment_id": "c1475b6d-d49b-4409-9842-c729d663c91f",
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
  "arrived_at": "2026-10-30T23:03:06.524187Z",
  "started_at": "2026-10-30T23:03:06.743392Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/d7d19359-1598-4c55-9492-a02d50c72247/complete` → **200**

```json
{
  "command_id": "92f1cb17-0cc9-4006-a21e-79bf50372c7d",
  "expected_version": 2,
  "reported_at": "2026-10-30T23:03:06Z",
  "cash_received": true
}
```

```json
{
  "id": "d7d19359-1598-4c55-9492-a02d50c72247",
  "order_id": "f4fe2f3c-9c20-4b58-995c-9b573524b425",
  "assignment_id": "c1475b6d-d49b-4409-9842-c729d663c91f",
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
  "arrived_at": "2026-10-30T23:03:06.524187Z",
  "started_at": "2026-10-30T23:03:06.743392Z",
  "completed_at": "2026-10-30T23:03:06.965576Z",
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
  "client_id": "ada4383c-3607-47c3-9f14-5d0ae3e4c1a3",
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
      "id": "d1dcb6d8-1f17-479f-81f4-f0e3d2f3629c",
      "at": "2026-10-30T23:03:04.965241Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "c66269c2-93bc-421d-8af2-6f0cafc54be4",
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

`GET /api/rider/v1/orders/f4fe2f3c-9c20-4b58-995c-9b573524b425/tip` → **200**

```json
{
  "order_id": "f4fe2f3c-9c20-4b58-995c-9b573524b425",
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
  "available_until": "2026-10-31T23:03:06.965576Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/f4fe2f3c-9c20-4b58-995c-9b573524b425/tip` → **201**

```json
{
  "command_id": "87475a71-561c-422e-96ef-c1f9b625d8a3",
  "amount_minor": 2500
}
```

```json
{
  "id": "7a0caf20-d6c0-4f12-8679-acf5670958b4",
  "order_id": "f4fe2f3c-9c20-4b58-995c-9b573524b425",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T23:03:07.844257Z"
}
```

`GET /api/rider/v1/orders/f4fe2f3c-9c20-4b58-995c-9b573524b425/tip` → **200**

```json
{
  "order_id": "f4fe2f3c-9c20-4b58-995c-9b573524b425",
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
  "available_until": "2026-10-31T23:03:06.965576Z",
  "open": false,
  "tip": {
    "id": "7a0caf20-d6c0-4f12-8679-acf5670958b4",
    "order_id": "f4fe2f3c-9c20-4b58-995c-9b573524b425",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-30T23:03:07.844257Z"
  }
}
```

`GET /api/rider/v1/orders/f4fe2f3c-9c20-4b58-995c-9b573524b425/tip` → **200**

```json
{
  "order_id": "f4fe2f3c-9c20-4b58-995c-9b573524b425",
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
  "available_until": "2026-10-31T23:03:06.965576Z",
  "open": false,
  "tip": {
    "id": "7a0caf20-d6c0-4f12-8679-acf5670958b4",
    "order_id": "f4fe2f3c-9c20-4b58-995c-9b573524b425",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T23:03:07.844257Z"
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
      "balance_minor": 30204
    }
  ],
  "entries": [
    {
      "id": "a38bf110-44ba-42ae-b073-640cdfd4e8c3",
      "at": "2026-10-30T23:03:07.511096Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "f4fe2f3c-9c20-4b58-995c-9b573524b425",
      "counterpart_id": null
    },
    {
      "id": "83de8435-5503-450e-9eb6-a75c81fb40b2",
      "at": "2026-10-30T23:03:03.457228Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "5289ad49-c171-4038-9138-7dfb8d0d1dad",
      "counterpart_id": null
    },
    {
      "id": "e0b40f29-5ecb-4054-8073-b5a03144727c",
      "at": "2026-10-30T23:02:58.342501Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "5289ad49-c171-4038-9138-7dfb8d0d1dad",
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
      "balance_minor": 32704
    }
  ],
  "entries": [
    {
      "id": "c617df47-85a3-45f2-a7a1-19463d966463",
      "at": "2026-10-30T23:03:09.540605Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "f4fe2f3c-9c20-4b58-995c-9b573524b425",
      "counterpart_id": null
    },
    {
      "id": "a38bf110-44ba-42ae-b073-640cdfd4e8c3",
      "at": "2026-10-30T23:03:07.511096Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "f4fe2f3c-9c20-4b58-995c-9b573524b425",
      "counterpart_id": null
    },
    {
      "id": "83de8435-5503-450e-9eb6-a75c81fb40b2",
      "at": "2026-10-30T23:03:03.457228Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "5289ad49-c171-4038-9138-7dfb8d0d1dad",
      "counterpart_id": null
    },
    {
      "id": "e0b40f29-5ecb-4054-8073-b5a03144727c",
      "at": "2026-10-30T23:02:58.342501Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "5289ad49-c171-4038-9138-7dfb8d0d1dad",
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
  "session_id": "df4235d8-1094-4330-a4f4-9fce5fdc3e4b",
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
  "last_heartbeat_at": "2026-10-30T23:03:06.306708Z",
  "last_location_at": "2026-10-30T23:03:06.306708Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/df4235d8-1094-4330-a4f4-9fce5fdc3e4b/close` → **200**

```json
{
  "command_id": "63ed3de7-f74f-4639-bf45-355f4e4fef15",
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

Done: card order f4fe2f3c-9c20-4b58-995c-9b573524b425.

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
  "phone": "+380733935224",
  "device_ref": "sandbox-29618"
}
```

```json
{
  "challenge_id": "c28640ae-baa1-4f3f-ab2b-f338ed4f6566",
  "expires_at": "2026-10-30T23:08:11.596880078Z",
  "resend_available_at": "2026-10-30T23:03:12.596880078Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380733935224` → **200**

```json
{
  "phone": "+380733935224",
  "audience": "CLIENT",
  "code": "786615",
  "sent_at": "2026-10-30T23:03:11.599202593Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c28640ae-baa1-4f3f-ab2b-f338ed4f6566",
  "code": "786615",
  "device_ref": "sandbox-29618"
}
```

```json
{
  "session_id": "050a3cfe-a8c5-4479-b4f1-7670fab5e0b9",
  "subject": {
    "type": "CLIENT",
    "id": "39229c70-de6e-4455-ad0c-aaae885f705d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzOTIyOWM3MC1kZTZlLTQ0NTUtYWQwYy1hYWFlODg1ZjcwNWQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDAyMjkxLCJpYXQiOjE3OTM0MDEzOTEsImp0aSI6IjE0YmQwYWY2LTA1Y2QtNGY1OC05ZjFkLTQ3MmJkNzIyODUyNiIsInNpZCI6IjA1MGEzY2ZlLWE4YzUtNDQ3OS1iNGYxLTc2NzBmYWI1ZTBiOSJ9._LiVEZiCe0Fzi7JEbR3sCSut4_2qpzH_CUmMfe79Uf8",
  "access_expires_at": "2026-10-30T23:18:11.8409247Z",
  "refresh_token": "tkbuM2ZR9aSs7jVDZR-WIz8ChsjmNtpr-RcD45_25bg",
  "refresh_expires_at": "2026-11-29T23:03:11.840513172Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "51716bd7-108f-46bb-b427-78d58755f3c3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "65b76860-3470-4e82-a333-b7f7e8fef536",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-65b76860-3470-4e82-a333-b7f7e8fef536",
    "orderDate": "1793401392",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "1b0f76166d8bdd7cec052238a48992e9",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=65b76860-3470-4e82-a333-b7f7e8fef536",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380733935224"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=65b76860-3470-4e82-a333-b7f7e8fef536",
  "created_at": "2026-10-30T23:03:12.056512Z",
  "expires_at": "2026-10-30T23:33:12.056512Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/65b76860-3470-4e82-a333-b7f7e8fef536` → **200**

```json
{
  "id": "65b76860-3470-4e82-a333-b7f7e8fef536",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T23:03:12.056512Z",
  "expires_at": "2026-10-30T23:33:12.056512Z",
  "completed_at": "2026-10-30T23:03:12.291728Z",
  "masked_pan": "41****5350",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "39229c70-de6e-4455-ad0c-aaae885f705d",
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
  "client_id": "39229c70-de6e-4455-ad0c-aaae885f705d",
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
      "id": "07232ef4-4b47-4029-b755-135840545dda",
      "at": "2026-10-30T23:03:12.554001Z",
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
  "client_id": "39229c70-de6e-4455-ad0c-aaae885f705d",
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
      "id": "07232ef4-4b47-4029-b755-135840545dda",
      "at": "2026-10-30T23:03:12.554001Z",
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
  "device_ref": "sandbox-30558"
}
```

```json
{
  "challenge_id": "0fd849f1-63c8-4a3a-8334-54222f475b95",
  "expires_at": "2026-10-30T23:08:14.159723065Z",
  "resend_available_at": "2026-10-30T23:03:15.159723065Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "121245",
  "sent_at": "2026-10-30T23:03:14.161650213Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0fd849f1-63c8-4a3a-8334-54222f475b95",
  "code": "121245",
  "device_ref": "sandbox-30558"
}
```

```json
{
  "session_id": "dbcaf727-d962-4764-8c56-4cda8eb283bb",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwMjI5NCwiaWF0IjoxNzkzNDAxMzk0LCJqdGkiOiIwMmZjMGI1Zi1iNmQ5LTRlNTItODc0Yi1lY2U3ZGU1Mzc5MDciLCJzaWQiOiJkYmNhZjcyNy1kOTYyLTQ3NjQtOGM1Ni00Y2RhOGViMjgzYmIifQ.ngTKSfDeEoQGUfnC0hJbqDKxZfv6APzBgkr8ZFezxrs",
  "access_expires_at": "2026-10-30T23:18:14.393140894Z",
  "refresh_token": "XIrD3zobKKjfj8F-7XgM-Omulh0hk8MftrzMk3WaSjo",
  "refresh_expires_at": "2026-11-29T23:03:14.392773457Z",
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
  "command_id": "780363f3-bf95-4e02-8736-e51fa50cf8c5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "382e9585-3b9b-494d-bf50-5b5359e6fdda",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-382e9585-3b9b-494d-bf50-5b5359e6fdda",
    "orderDate": "1793401394",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "30eef1077b18db018004a19f6b8c6169",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=382e9585-3b9b-494d-bf50-5b5359e6fdda",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=382e9585-3b9b-494d-bf50-5b5359e6fdda",
  "created_at": "2026-10-30T23:03:14.809649Z",
  "expires_at": "2026-10-30T23:33:14.809649Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/382e9585-3b9b-494d-bf50-5b5359e6fdda` → **200**

```json
{
  "id": "382e9585-3b9b-494d-bf50-5b5359e6fdda",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T23:03:14.809649Z",
  "expires_at": "2026-10-30T23:33:14.809649Z",
  "completed_at": "2026-10-30T23:03:15.034631Z",
  "masked_pan": "41****6759",
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
      "id": "55079b10-8285-4986-aa09-b0b7a307dfc8",
      "at": "2026-10-30T23:03:15.561611Z",
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
  "command_id": "f6045dfe-1958-46be-bb03-5f0f41ee20e0",
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
  "correlation_id": "18c49f88-a6ee-4a33-b1a4-cc8a0460c86c"
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
  "device_ref": "sandbox-21305"
}
```

```json
{
  "challenge_id": "064c2572-f6b4-4f17-a662-0e712dfb544c",
  "expires_at": "2026-10-30T23:08:16.882983476Z",
  "resend_available_at": "2026-10-30T23:03:17.882983476Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "940804",
  "sent_at": "2026-10-30T23:03:16.885021448Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "064c2572-f6b4-4f17-a662-0e712dfb544c",
  "code": "940804",
  "device_ref": "sandbox-21305"
}
```

```json
{
  "session_id": "7b9a5c4b-674f-4777-8beb-896743355ceb",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwMjI5NywiaWF0IjoxNzkzNDAxMzk3LCJqdGkiOiI5ZDJhOGFjNS1jYTQwLTQ5ZWMtOGUyZi0zNGQ4NzgyYjQ5MDciLCJzaWQiOiI3YjlhNWM0Yi02NzRmLTQ3NzctOGJlYi04OTY3NDMzNTVjZWIifQ.uP0qPFq50dKYfugNjIbvD4Bf9c29PXj-ICQjNP7E59s",
  "access_expires_at": "2026-10-30T23:18:17.111804741Z",
  "refresh_token": "pbacphPdF8srP5oakz1EXDK8oXtXAAeryWy8JahkW3U",
  "refresh_expires_at": "2026-11-29T23:03:17.111392387Z",
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
  "command_id": "9d038a28-5a33-4d24-86a6-53f3d951f7b9",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T23:03:17Z",
    "sequence": 1793401397557
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "bb928ddb-5eec-4d36-acd5-22890321102c",
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
  "last_heartbeat_at": "2026-10-30T23:03:17.574248Z",
  "last_location_at": "2026-10-30T23:03:17.574248Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A rider orders for cash

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638939527",
  "device_ref": "sandbox-12760"
}
```

```json
{
  "challenge_id": "48f4714f-e36b-4b92-860e-b35e7e84dead",
  "expires_at": "2026-10-30T23:08:17.78751505Z",
  "resend_available_at": "2026-10-30T23:03:18.78751505Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638939527` → **200**

```json
{
  "phone": "+380638939527",
  "audience": "CLIENT",
  "code": "007009",
  "sent_at": "2026-10-30T23:03:17.789756239Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "48f4714f-e36b-4b92-860e-b35e7e84dead",
  "code": "007009",
  "device_ref": "sandbox-12760"
}
```

```json
{
  "session_id": "12e2321e-fd7f-4bad-9daa-def3cf5084a3",
  "subject": {
    "type": "CLIENT",
    "id": "86befc19-9bd1-4764-8c34-a3429e3a8afb"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NmJlZmMxOS05YmQxLTQ3NjQtOGMzNC1hMzQyOWUzYThhZmIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDAyMjk4LCJpYXQiOjE3OTM0MDEzOTgsImp0aSI6ImEzOTA0ODhkLTFmOWItNDJiZC1iZjY2LWFiZWE3NjM0MzdlMyIsInNpZCI6IjEyZTIzMjFlLWZkN2YtNGJhZC05ZGFhLWRlZjNjZjUwODRhMyJ9.GVU-pslLPnaeI1041QLqCDTTWXw4ZgRjyrWCMoDtV78",
  "access_expires_at": "2026-10-30T23:18:18.051511576Z",
  "refresh_token": "RUTOFtzkYqaFTl6SQZOLjWUOsXpCzz1nDc4-Z1QXfKU",
  "refresh_expires_at": "2026-11-29T23:03:18.050865074Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "0ae9dc12-a7d0-434f-8234-227fc7411503",
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
  "id": "353d53d7-be56-4105-96b8-029b12962371",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T23:08:18.275762Z",
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
  "command_id": "a12bb45b-35e1-4e0e-a6b8-6ca3d134ab54",
  "quote_id": "353d53d7-be56-4105-96b8-029b12962371",
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
  "id": "12e03ec2-f576-424a-acae-8e767b56cf20",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "86befc19-9bd1-4764-8c34-a3429e3a8afb",
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
  "created_at": "2026-10-30T23:03:18.485615Z",
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
    "id": "d3aad84d-a25c-4ee6-8760-a3047c66389d",
    "order_id": "12e03ec2-f576-424a-acae-8e767b56cf20",
    "expires_at": "2026-10-30T23:03:33.487705Z",
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

`POST /api/driver/v1/offers/d3aad84d-a25c-4ee6-8760-a3047c66389d/accept` → **200**

```json
{
  "command_id": "cbc5a5f2-9c05-4378-8c1d-2b210d0838ae"
}
```

```json
{
  "id": "8a3b28e3-544f-4f40-b0ce-1a668681779f",
  "order_id": "12e03ec2-f576-424a-acae-8e767b56cf20",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "ac8218fe-9ec1-45c3-a4eb-b7998f2569aa",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "ac8218fe-9ec1-45c3-a4eb-b7998f2569aa",
  "order_id": "12e03ec2-f576-424a-acae-8e767b56cf20",
  "assignment_id": "8a3b28e3-544f-4f40-b0ce-1a668681779f",
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

`POST /api/driver/v1/work-sessions/bb928ddb-5eec-4d36-acd5-22890321102c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T23:03:19Z",
    "sequence": 1793401399367
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "bb928ddb-5eec-4d36-acd5-22890321102c",
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
  "last_heartbeat_at": "2026-10-30T23:03:19.383855Z",
  "last_location_at": "2026-10-30T23:03:19.383855Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/ac8218fe-9ec1-45c3-a4eb-b7998f2569aa/arrive` → **200**

```json
{
  "command_id": "44760fa9-6562-4d5b-8fb8-ba3adb189f16",
  "expected_version": 0
}
```

```json
{
  "id": "ac8218fe-9ec1-45c3-a4eb-b7998f2569aa",
  "order_id": "12e03ec2-f576-424a-acae-8e767b56cf20",
  "assignment_id": "8a3b28e3-544f-4f40-b0ce-1a668681779f",
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
  "arrived_at": "2026-10-30T23:03:19.605006Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/ac8218fe-9ec1-45c3-a4eb-b7998f2569aa/start` → **200**

```json
{
  "command_id": "7e24a4ae-5150-4c6a-9ed3-42c7fff4b91d",
  "expected_version": 1
}
```

```json
{
  "id": "ac8218fe-9ec1-45c3-a4eb-b7998f2569aa",
  "order_id": "12e03ec2-f576-424a-acae-8e767b56cf20",
  "assignment_id": "8a3b28e3-544f-4f40-b0ce-1a668681779f",
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
  "arrived_at": "2026-10-30T23:03:19.605006Z",
  "started_at": "2026-10-30T23:03:19.839781Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/ac8218fe-9ec1-45c3-a4eb-b7998f2569aa/complete` → **200**

```json
{
  "command_id": "5603a767-a3d8-46bf-9d11-429eb06375ca",
  "expected_version": 2,
  "reported_at": "2026-10-30T23:03:20Z",
  "cash_received": false
}
```

```json
{
  "id": "ac8218fe-9ec1-45c3-a4eb-b7998f2569aa",
  "order_id": "12e03ec2-f576-424a-acae-8e767b56cf20",
  "assignment_id": "8a3b28e3-544f-4f40-b0ce-1a668681779f",
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
  "arrived_at": "2026-10-30T23:03:19.605006Z",
  "started_at": "2026-10-30T23:03:19.839781Z",
  "completed_at": "2026-10-30T23:03:20.064021Z",
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
  "session_id": "4d178f89-4834-4df2-b24f-f517d1a0dbc4",
  "subject": {
    "type": "STAFF",
    "id": "c66269c2-93bc-421d-8af2-6f0cafc54be4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjYyNjljMi05M2JjLTQyMWQtOGFmMi02ZjBjYWZjNTRiZTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDIzMDAsImlhdCI6MTc5MzQwMTQwMCwianRpIjoiMmQ4ZTUwYjctNjdhOS00OWFjLWFkOWItZjU5MzgyODg1OWZiIiwic2lkIjoiNGQxNzhmODktNDgzNC00ZGYyLWIyNGYtZjUxN2QxYTBkYmM0In0.e8Arkd-M2NBmfiTyzpM6ofby5bzu4ExjTJZNdo7Ba4U",
  "access_expires_at": "2026-10-30T23:18:20.497169086Z",
  "refresh_token": "DimWl3LT569NwGjgUYPnUCA20PJw2OWAVo6rEPVxsbY",
  "refresh_expires_at": "2026-10-31T11:03:20.496727217Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/12e03ec2-f576-424a-acae-8e767b56cf20/cash-dispute` → **200**

```json
{
  "order_id": "12e03ec2-f576-424a-acae-8e767b56cf20",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "86befc19-9bd1-4764-8c34-a3429e3a8afb",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T23:03:20.629953Z",
  "decide_by": "2026-11-13T23:03:20.629953Z",
  "decision": null,
  "decided_by": null,
  "reason": null,
  "decided_at": null,
  "version": 1
}
```

Dispute: {"held_minor":0,"rider_debt_minor":10517,"decide_by":"2026-11-13T23:03:20.629953Z","decision":null}

`GET /api/admin/v1/cash-disputes` → **200**

```json
{
  "disputes": [
    {
      "order_id": "12e03ec2-f576-424a-acae-8e767b56cf20",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "payer_client_id": "86befc19-9bd1-4764-8c34-a3429e3a8afb",
      "currency": "UAH",
      "held_minor": 0,
      "rider_debt_minor": 10517,
      "opened_at": "2026-10-30T23:03:20.629953Z",
      "decide_by": "2026-11-13T23:03:20.629953Z",
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

`POST /api/admin/v1/orders/12e03ec2-f576-424a-acae-8e767b56cf20/cash-dispute/decide` → **400**

```json
{
  "command_id": "c6bbc2ea-fe63-4cf0-bdba-6f139fdf34c5",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/orders/12e03ec2-f576-424a-acae-8e767b56cf20/cash-dispute/decide",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "83c1c0a2-fe8d-46e2-b3b5-64ebae37250e",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/orders/12e03ec2-f576-424a-acae-8e767b56cf20/cash-dispute/decide` → **200**

```json
{
  "command_id": "9220bdb8-d0ca-4963-bbf2-69ae88763be2",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": "The rider does not answer calls"
}
```

```json
{
  "order_id": "12e03ec2-f576-424a-acae-8e767b56cf20",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "86befc19-9bd1-4764-8c34-a3429e3a8afb",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T23:03:20.629953Z",
  "decide_by": "2026-11-13T23:03:20.629953Z",
  "decision": "PAY_DRIVER",
  "decided_by": "c66269c2-93bc-421d-8af2-6f0cafc54be4",
  "reason": "The rider does not answer calls",
  "decided_at": "2026-10-30T23:03:21.400997Z",
  "version": 2
}
```

`POST /api/admin/v1/orders/12e03ec2-f576-424a-acae-8e767b56cf20/cash-dispute/decide` → **409**

```json
{
  "command_id": "e26acb21-749c-4ecc-8abb-21b280520255",
  "expected_version": 2,
  "decision": "RIDER_PAID",
  "reason": "Again"
}
```

```json
{
  "instance": "/api/admin/v1/orders/12e03ec2-f576-424a-acae-8e767b56cf20/cash-dispute/decide",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "7135eaa4-eb4c-4ea4-99b6-67b2e6c5ec15"
}
```

Done: an unpaid cash trip became a dispute and was decided once.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "bb928ddb-5eec-4d36-acd5-22890321102c",
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
  "last_heartbeat_at": "2026-10-30T23:03:19.383855Z",
  "last_location_at": "2026-10-30T23:03:19.383855Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/bb928ddb-5eec-4d36-acd5-22890321102c/close` → **200**

```json
{
  "command_id": "a23a0c58-6de4-4129-b1da-8adf7f803ebb",
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
  "phone": "+380731649334",
  "device_ref": "sandbox-27125"
}
```

```json
{
  "challenge_id": "88e6ed67-59db-4cad-a5a3-2c701a6ec672",
  "expires_at": "2026-10-30T23:08:22.286699028Z",
  "resend_available_at": "2026-10-30T23:03:23.286699028Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380731649334` → **200**

```json
{
  "phone": "+380731649334",
  "audience": "CLIENT",
  "code": "535029",
  "sent_at": "2026-10-30T23:03:22.288806548Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "88e6ed67-59db-4cad-a5a3-2c701a6ec672",
  "code": "535029",
  "device_ref": "sandbox-27125"
}
```

```json
{
  "session_id": "5cacb323-acfb-4469-8c70-42fcbf7d6466",
  "subject": {
    "type": "CLIENT",
    "id": "b130354a-acf5-4b7f-a62c-14e12018524b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMTMwMzU0YS1hY2Y1LTRiN2YtYTYyYy0xNGUxMjAxODUyNGIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDAyMzAyLCJpYXQiOjE3OTM0MDE0MDIsImp0aSI6IjQyN2VlNjI4LTE2ZWUtNDA0OS1iYmYzLWQ2OWIyOWFmZDcyOCIsInNpZCI6IjVjYWNiMzIzLWFjZmItNDQ2OS04YzcwLTQyZmNiZjdkNjQ2NiJ9.pzO7NWr9M8GZoHUiCiFhzbNgtBRKfPRBzocfpbrStww",
  "access_expires_at": "2026-10-30T23:18:22.54368113Z",
  "refresh_token": "gl4KDIJMkMEZ65Hvsjwb6xoDvoN5t_zNsvKlNBFw3Uk",
  "refresh_expires_at": "2026-11-29T23:03:22.543266622Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "7f74ff17-24a8-4233-a4e9-a9e8b576c883",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "b1d500e2-1f89-45db-ad66-0578aca7c53f",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-b1d500e2-1f89-45db-ad66-0578aca7c53f",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "be1d5c50d90dd500a03a4e8843d4bb52",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=b1d500e2-1f89-45db-ad66-0578aca7c53f",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380731649334"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=b1d500e2-1f89-45db-ad66-0578aca7c53f",
  "expires_at": "2026-10-30T23:33:22.753338Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/b1d500e2-1f89-45db-ad66-0578aca7c53f` → **200**

```json
{
  "id": "b1d500e2-1f89-45db-ad66-0578aca7c53f",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T23:33:22.753338Z",
  "card": {
    "id": "7c45d3bc-dc96-4714-a6da-5fef263fbbff",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****5203",
    "card_type": "Visa",
    "created_at": "2026-10-30T23:03:22.96533Z"
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
  "device_ref": "sandbox-7314"
}
```

```json
{
  "challenge_id": "6b6ac00b-3b4b-4f8e-b240-974df5ba0fcc",
  "expires_at": "2026-10-30T23:08:23.198128478Z",
  "resend_available_at": "2026-10-30T23:03:24.198128478Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "893487",
  "sent_at": "2026-10-30T23:03:23.200099223Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6b6ac00b-3b4b-4f8e-b240-974df5ba0fcc",
  "code": "893487",
  "device_ref": "sandbox-7314"
}
```

```json
{
  "session_id": "2d774452-d7dc-4404-9db4-8084ac60d1de",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwMjMwMywiaWF0IjoxNzkzNDAxNDAzLCJqdGkiOiJjN2ZkYWMzMC04ZmIxLTQ0ZWMtYTdhMy03ZTFiZGIzYWJmZWMiLCJzaWQiOiIyZDc3NDQ1Mi1kN2RjLTQ0MDQtOWRiNC04MDg0YWM2MGQxZGUifQ.1RzW714PNb56mVXQonGh_awXjNtWw0r15EYhjn42zwY",
  "access_expires_at": "2026-10-30T23:18:23.427268147Z",
  "refresh_token": "WMS4oN7XDpNBWqcK9SImv7VpY1fm75BemM_P5r6nWR0",
  "refresh_expires_at": "2026-11-29T23:03:23.426870736Z",
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
  "command_id": "09ad2e8f-c470-4acd-aee7-44b698fcbb15",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T23:03:23Z",
    "sequence": 1793401403835
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "49977ca4-fd77-406a-a80f-3cbff9e4858c",
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
  "last_heartbeat_at": "2026-10-30T23:03:23.851692Z",
  "last_location_at": "2026-10-30T23:03:23.851692Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A card ride; on the way both write numbers into the chat

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "57c5ade3-c3db-47d6-9259-4026ce9d94e3",
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
  "id": "4332ba1a-e2f5-400c-81c8-bd09f72397a7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T23:08:24.066820Z",
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
  "command_id": "f8390e40-0064-4b05-8208-38f488e6f147",
  "quote_id": "4332ba1a-e2f5-400c-81c8-bd09f72397a7",
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
  "id": "0e855860-f5ae-4c66-ac6b-eb231120e737",
  "short_number": 11,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "b130354a-acf5-4b7f-a62c-14e12018524b",
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
  "created_at": "2026-10-30T23:03:24.288647Z",
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

`GET /api/rider/v1/orders/0e855860-f5ae-4c66-ac6b-eb231120e737` → **200**

```json
{
  "id": "0e855860-f5ae-4c66-ac6b-eb231120e737",
  "short_number": 11,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "b130354a-acf5-4b7f-a62c-14e12018524b",
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
  "created_at": "2026-10-30T23:03:24.288647Z",
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

`GET /api/rider/v1/orders/0e855860-f5ae-4c66-ac6b-eb231120e737` → **200**

```json
{
  "id": "0e855860-f5ae-4c66-ac6b-eb231120e737",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "b130354a-acf5-4b7f-a62c-14e12018524b",
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
  "created_at": "2026-10-30T23:03:24.288647Z",
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
    "id": "b0d4fc05-b467-4af9-9d03-d723cd3246d1",
    "order_id": "0e855860-f5ae-4c66-ac6b-eb231120e737",
    "expires_at": "2026-10-30T23:03:39.666148Z",
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

`POST /api/driver/v1/offers/b0d4fc05-b467-4af9-9d03-d723cd3246d1/accept` → **200**

```json
{
  "command_id": "ca26fcf0-5a7b-4f59-8310-c94afed5c83b"
}
```

```json
{
  "id": "ef66e81e-5683-45e3-ad26-577efb6d21a0",
  "order_id": "0e855860-f5ae-4c66-ac6b-eb231120e737",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "127d8441-9fe5-452d-9e12-9de85d08be1a",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "127d8441-9fe5-452d-9e12-9de85d08be1a",
  "order_id": "0e855860-f5ae-4c66-ac6b-eb231120e737",
  "assignment_id": "ef66e81e-5683-45e3-ad26-577efb6d21a0",
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

`POST /api/rider/v1/orders/0e855860-f5ae-4c66-ac6b-eb231120e737/messages` → **201**

```json
{
  "command_id": "ff1acda3-c061-47cd-b3b8-ed11483df5d7",
  "body": "Я біля входу, мій номер +380731649334, картка 4111 1111 1111 1111"
}
```

```json
{
  "id": "fde2d504-f7f6-472f-8e2a-322df734b5b7",
  "order_id": "0e855860-f5ae-4c66-ac6b-eb231120e737",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу, мій номер +380731649334, картка 4111 1111 1111 1111",
  "sent_at": "2026-10-30T23:03:26.539012043Z"
}
```

`POST /api/driver/v1/trips/127d8441-9fe5-452d-9e12-9de85d08be1a/messages` → **201**

```json
{
  "command_id": "264445f5-bd75-4814-bce0-be8a19f730f6",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03"
}
```

```json
{
  "id": "de3d6d4b-bc55-49df-a1b2-1fda146ffdf9",
  "order_id": "0e855860-f5ae-4c66-ac6b-eb231120e737",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03",
  "sent_at": "2026-10-30T23:03:26.753268066Z"
}
```

(the car drives 6 s to the next point)

`POST /api/driver/v1/work-sessions/49977ca4-fd77-406a-a80f-3cbff9e4858c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T23:03:32Z",
    "sequence": 1793401412983
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "49977ca4-fd77-406a-a80f-3cbff9e4858c",
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
  "last_heartbeat_at": "2026-10-30T23:03:33.001604Z",
  "last_location_at": "2026-10-30T23:03:33.001604Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/127d8441-9fe5-452d-9e12-9de85d08be1a/arrive` → **200**

```json
{
  "command_id": "c1072001-1049-4866-b666-f42d1337b3a8",
  "expected_version": 0
}
```

```json
{
  "id": "127d8441-9fe5-452d-9e12-9de85d08be1a",
  "order_id": "0e855860-f5ae-4c66-ac6b-eb231120e737",
  "assignment_id": "ef66e81e-5683-45e3-ad26-577efb6d21a0",
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
  "arrived_at": "2026-10-30T23:03:33.220481Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/127d8441-9fe5-452d-9e12-9de85d08be1a/start` → **200**

```json
{
  "command_id": "4a21c8da-b754-4018-8594-05a7d08a253d",
  "expected_version": 1
}
```

```json
{
  "id": "127d8441-9fe5-452d-9e12-9de85d08be1a",
  "order_id": "0e855860-f5ae-4c66-ac6b-eb231120e737",
  "assignment_id": "ef66e81e-5683-45e3-ad26-577efb6d21a0",
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
  "arrived_at": "2026-10-30T23:03:33.220481Z",
  "started_at": "2026-10-30T23:03:33.440987Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

(the car drives 90 s to the next point)

`POST /api/driver/v1/work-sessions/49977ca4-fd77-406a-a80f-3cbff9e4858c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4584,
    "lon": 30.4300,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T23:05:03Z",
    "sequence": 1793401503670
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "49977ca4-fd77-406a-a80f-3cbff9e4858c",
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
  "last_heartbeat_at": "2026-10-30T23:05:03.687095Z",
  "last_location_at": "2026-10-30T23:05:03.687095Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/127d8441-9fe5-452d-9e12-9de85d08be1a/complete` → **200**

```json
{
  "command_id": "a42ebab8-9661-4633-b198-b4b2cbeba06d",
  "expected_version": 2,
  "reported_at": "2026-10-30T23:05:03Z",
  "cash_received": false
}
```

```json
{
  "id": "127d8441-9fe5-452d-9e12-9de85d08be1a",
  "order_id": "0e855860-f5ae-4c66-ac6b-eb231120e737",
  "assignment_id": "ef66e81e-5683-45e3-ad26-577efb6d21a0",
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
  "arrived_at": "2026-10-30T23:03:33.220481Z",
  "started_at": "2026-10-30T23:03:33.440987Z",
  "completed_at": "2026-10-30T23:05:03.897591Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/rider/v1/orders/0e855860-f5ae-4c66-ac6b-eb231120e737` → **200**

```json
{
  "id": "0e855860-f5ae-4c66-ac6b-eb231120e737",
  "short_number": 11,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "b130354a-acf5-4b7f-a62c-14e12018524b",
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
    "id": "ef66e81e-5683-45e3-ad26-577efb6d21a0",
    "order_id": "0e855860-f5ae-4c66-ac6b-eb231120e737",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "127d8441-9fe5-452d-9e12-9de85d08be1a",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T23:03:24.288647Z",
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

`GET /api/rider/v1/orders/0e855860-f5ae-4c66-ac6b-eb231120e737` → **200**

```json
{
  "id": "0e855860-f5ae-4c66-ac6b-eb231120e737",
  "short_number": 11,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "b130354a-acf5-4b7f-a62c-14e12018524b",
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
    "id": "ef66e81e-5683-45e3-ad26-577efb6d21a0",
    "order_id": "0e855860-f5ae-4c66-ac6b-eb231120e737",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "127d8441-9fe5-452d-9e12-9de85d08be1a",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T23:03:24.288647Z",
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

`GET /api/rider/v1/orders/0e855860-f5ae-4c66-ac6b-eb231120e737` → **200**

```json
{
  "id": "0e855860-f5ae-4c66-ac6b-eb231120e737",
  "short_number": 11,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "b130354a-acf5-4b7f-a62c-14e12018524b",
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
    "id": "ef66e81e-5683-45e3-ad26-577efb6d21a0",
    "order_id": "0e855860-f5ae-4c66-ac6b-eb231120e737",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "127d8441-9fe5-452d-9e12-9de85d08be1a",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T23:03:24.288647Z",
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

`GET /api/rider/v1/orders/0e855860-f5ae-4c66-ac6b-eb231120e737` → **200**

```json
{
  "id": "0e855860-f5ae-4c66-ac6b-eb231120e737",
  "short_number": 11,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "b130354a-acf5-4b7f-a62c-14e12018524b",
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
    "id": "ef66e81e-5683-45e3-ad26-577efb6d21a0",
    "order_id": "0e855860-f5ae-4c66-ac6b-eb231120e737",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "127d8441-9fe5-452d-9e12-9de85d08be1a",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T23:03:24.288647Z",
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
  "session_id": "49977ca4-fd77-406a-a80f-3cbff9e4858c",
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
  "last_heartbeat_at": "2026-10-30T23:05:03.687095Z",
  "last_location_at": "2026-10-30T23:05:03.687095Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/49977ca4-fd77-406a-a80f-3cbff9e4858c/close` → **200**

```json
{
  "command_id": "11045475-cd50-447d-9b0f-dc0fbc8db648",
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
  "session_id": "cbe0630c-41eb-4b27-b443-332a2540c545",
  "subject": {
    "type": "STAFF",
    "id": "c66269c2-93bc-421d-8af2-6f0cafc54be4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjYyNjljMi05M2JjLTQyMWQtOGFmMi02ZjBjYWZjNTRiZTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDI0MDgsImlhdCI6MTc5MzQwMTUwOCwianRpIjoiNmMzNDhlOWYtYTMyOC00MTk0LTk1MTctY2QxOTc0YWIyNmI2Iiwic2lkIjoiY2JlMDYzMGMtNDFlYi00YjI3LWI0NDMtMzMyYTI1NDBjNTQ1In0.IBiFpjbevQZsnci9Bvt2yRsFiPknUB6G0zPzoHDfHhg",
  "access_expires_at": "2026-10-30T23:20:08.603572558Z",
  "refresh_token": "BU1kXjFo9dP-pTI0qLE_e3TbzRjCYRPurcjvw8tEXlE",
  "refresh_expires_at": "2026-10-31T11:05:08.603157159Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/0e855860-f5ae-4c66-ac6b-eb231120e737/evidence` → **400**

```json
{
  "instance": "/api/admin/v1/orders/0e855860-f5ae-4c66-ac6b-eb231120e737/evidence",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "1f036e66-e0bc-4fda-85ed-7051338d6dc3"
}
```

`GET /api/admin/v1/orders/0e855860-f5ae-4c66-ac6b-eb231120e737/evidence?reason=Bank%20request%20sandbox` → **200**

```json
{
  "generated_at": "2026-10-30T23:05:09.015556204Z",
  "order": {
    "id": "0e855860-f5ae-4c66-ac6b-eb231120e737",
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
    "created_at": "2026-10-30T23:03:24.288647Z",
    "assigned_at": "2026-10-30T23:03:26.130246Z",
    "arrived_at": "2026-10-30T23:03:33.220481Z",
    "started_at": "2026-10-30T23:03:33.440987Z",
    "completed_at": "2026-10-30T23:05:03.897591Z"
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
    "id": "b130354a-acf5-4b7f-a62c-14e12018524b",
    "registered_at": "2026-10-30T23:03:22.541836Z",
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
      "created_at": "2026-10-30T23:03:24.290111Z"
    },
    {
      "type": "SETTLE",
      "state": "SUCCEEDED",
      "amount_minor": 16297,
      "currency": "UAH",
      "provider_status": "Approved",
      "created_at": "2026-10-30T23:05:04.857358Z"
    }
  ],
  "chat": [
    {
```

## Finance records the chargeback: the rider owes the fare again, a case opens

`POST /api/admin/v1/orders/0e855860-f5ae-4c66-ac6b-eb231120e737/chargebacks` → **422**

```json
{
  "command_id": "fd69b211-7cb0-40f1-9ef0-3dcecf6df335",
  "amount_minor": 16298,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "instance": "/api/admin/v1/orders/0e855860-f5ae-4c66-ac6b-eb231120e737/chargebacks",
  "status": 422,
  "title": "Chargeback not allowed",
  "type": "https://errors.blizz.taxi/chargeback-not-allowed",
  "code": "CHARGEBACK_NOT_ALLOWED",
  "correlation_id": "d4157de5-42be-4f3d-826b-d511194ecf30"
}
```

`POST /api/admin/v1/orders/0e855860-f5ae-4c66-ac6b-eb231120e737/chargebacks` → **201**

```json
{
  "command_id": "1f31e86b-2a2b-4504-b378-3a7c8f4af1d9",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "id": "c836e84e-b3ae-4484-b73d-4350500fb99d",
  "order_id": "0e855860-f5ae-4c66-ac6b-eb231120e737",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-30T23:05:09.489401Z",
  "resolved_at": null,
  "version": 0
}
```

`POST /api/admin/v1/orders/0e855860-f5ae-4c66-ac6b-eb231120e737/chargebacks` → **201**

```json
{
  "command_id": "1f31e86b-2a2b-4504-b378-3a7c8f4af1d9",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "id": "c836e84e-b3ae-4484-b73d-4350500fb99d",
  "order_id": "0e855860-f5ae-4c66-ac6b-eb231120e737",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-30T23:05:09.489401Z",
  "resolved_at": null,
  "version": 0
}
```

`GET /api/admin/v1/clients/b130354a-acf5-4b7f-a62c-14e12018524b` → **200**

```json
{
  "client": {
    "id": "b130354a-acf5-4b7f-a62c-14e12018524b",
    "phone": "+380731649334",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T23:03:22.541836Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "0e855860-f5ae-4c66-ac6b-eb231120e737",
      "short_number": 11,
      "status": "FULFILLED",
      "created_at": "2026-10-30T23:03:24.288647Z",
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

`POST /api/admin/v1/orders/0e855860-f5ae-4c66-ac6b-eb231120e737/chargebacks/c836e84e-b3ae-4484-b73d-4350500fb99d/resolve` → **200**

```json
{
  "command_id": "2f08aaf0-1c63-4bd2-a824-e6a84743f0c5",
  "expected_version": 0,
  "outcome": "WON",
  "reason": "Evidence accepted"
}
```

```json
{
  "id": "c836e84e-b3ae-4484-b73d-4350500fb99d",
  "order_id": "0e855860-f5ae-4c66-ac6b-eb231120e737",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "WON",
  "resolution_reason": "Evidence accepted",
  "created_at": "2026-10-30T23:05:09.489401Z",
  "resolved_at": "2026-10-30T23:05:10.163791Z",
  "version": 1
}
```

`GET /api/admin/v1/clients/b130354a-acf5-4b7f-a62c-14e12018524b` → **200**

```json
{
  "client": {
    "id": "b130354a-acf5-4b7f-a62c-14e12018524b",
    "phone": "+380731649334",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T23:03:22.541836Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "0e855860-f5ae-4c66-ac6b-eb231120e737",
      "short_number": 11,
      "status": "FULFILLED",
      "created_at": "2026-10-30T23:03:24.288647Z",
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

`GET /api/admin/v1/clients/b130354a-acf5-4b7f-a62c-14e12018524b` → **200**

```json
{
  "client": {
    "id": "b130354a-acf5-4b7f-a62c-14e12018524b",
    "phone": "+380731649334",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T23:03:22.541836Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "0e855860-f5ae-4c66-ac6b-eb231120e737",
      "short_number": 11,
      "status": "FULFILLED",
      "created_at": "2026-10-30T23:03:24.288647Z",
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

`POST /api/admin/v1/orders/0e855860-f5ae-4c66-ac6b-eb231120e737/chargebacks/c836e84e-b3ae-4484-b73d-4350500fb99d/resolve` → **409**

```json
{
  "command_id": "967f3cc0-54b2-4e70-90e4-7532b4a57b46",
  "expected_version": 1,
  "outcome": "LOST",
  "reason": "Twice"
}
```

```json
{
  "instance": "/api/admin/v1/orders/0e855860-f5ae-4c66-ac6b-eb231120e737/chargebacks/c836e84e-b3ae-4484-b73d-4350500fb99d/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "fcb067ec-9063-4040-8e02-022255a78404"
}
```

`GET /api/admin/v1/orders/0e855860-f5ae-4c66-ac6b-eb231120e737/chargebacks` → **200**

```json
{
  "chargebacks": [
    {
      "id": "c836e84e-b3ae-4484-b73d-4350500fb99d",
      "order_id": "0e855860-f5ae-4c66-ac6b-eb231120e737",
      "amount_minor": 16297,
      "currency": "UAH",
      "bank_reason": "4837 No cardholder authorization",
      "received_on": "2026-10-29",
      "state": "WON",
      "resolution_reason": "Evidence accepted",
      "created_at": "2026-10-30T23:05:09.489401Z",
      "resolved_at": "2026-10-30T23:05:10.163791Z",
      "version": 1
    }
  ]
}
```

Done: the evidence of card order 0e855860-f5ae-4c66-ac6b-eb231120e737 without phone or card digits; chargeback c836e84e-b3ae-4484-b73d-4350500fb99d recorded and won.

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
  "session_id": "8eb51043-08c0-4193-8caf-c724d9e14f85",
  "subject": {
    "type": "STAFF",
    "id": "c66269c2-93bc-421d-8af2-6f0cafc54be4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjYyNjljMi05M2JjLTQyMWQtOGFmMi02ZjBjYWZjNTRiZTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDI0MTIsImlhdCI6MTc5MzQwMTUxMiwianRpIjoiODMwOTBkMjgtYTk5MS00ZTcxLWEzYzctOWMzYTQwMGVjODIxIiwic2lkIjoiOGViNTEwNDMtMDhjMC00MTkzLThjYWYtYzcyNGQ5ZTE0Zjg1In0.T1IonW3iESGklPq8MYUgsdIPLf2_sJKsX9_OiGN1rog",
  "access_expires_at": "2026-10-30T23:20:12.636683856Z",
  "refresh_token": "nb4TVj52T8vOsnyvKxUpWYeNkLtesy91sPFZV3qfQug",
  "refresh_expires_at": "2026-10-31T11:05:12.63631644Z",
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
  "phone": "+48600948883",
  "device_ref": "sandbox-15420"
}
```

```json
{
  "challenge_id": "f524aba8-8b71-406f-b17c-a32275b59fd1",
  "expires_at": "2026-10-30T23:10:13.257929275Z",
  "resend_available_at": "2026-10-30T23:05:14.257929275Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600948883` → **200**

```json
{
  "phone": "+48600948883",
  "audience": "CLIENT",
  "code": "284904",
  "sent_at": "2026-10-30T23:05:13.259973508Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f524aba8-8b71-406f-b17c-a32275b59fd1",
  "code": "284904",
  "device_ref": "sandbox-15420"
}
```

```json
{
  "session_id": "c19db54f-9838-412c-af06-b2ca694444fa",
  "subject": {
    "type": "CLIENT",
    "id": "3a8a29c2-a1ca-499f-b1b6-1ab6e3cb3bdd"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYThhMjljMi1hMWNhLTQ5OWYtYjFiNi0xYWI2ZTNjYjNiZGQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDAyNDEzLCJpYXQiOjE3OTM0MDE1MTMsImp0aSI6Ijg4OGI3MWE0LTI5NTgtNGM3OC05Y2Y0LWRkMmU0YzUwMTRkZSIsInNpZCI6ImMxOWRiNTRmLTk4MzgtNDEyYy1hZjA2LWIyY2E2OTQ0NDRmYSJ9.eyWo_EnvVU9yRwh0qA9FxyN1rEGpiQ5dUT6qsWO-AVM",
  "access_expires_at": "2026-10-30T23:20:13.497659381Z",
  "refresh_token": "eeYY4FG_MxkFqnjU3PxT6kXbol3fgs2dzoMDF6EbEJ8",
  "refresh_expires_at": "2026-11-29T23:05:13.497316481Z",
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
  "command_id": "0af22ba3-449b-4e03-9bc3-55b8207b10ce",
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
  "correlation_id": "14f731de-e6fd-4a84-925d-ac9effd98007",
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
  "command_id": "fe89d6dc-b7fc-4737-82e7-259f3bfe8614",
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
  "paused_at": "2026-10-30T23:05:14.31648614Z",
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
  "command_id": "f29cd537-3f6c-47a4-8314-66fc9e808624",
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
  "id": "b2e0a004-179f-42d7-879a-83ab783df228",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T23:10:14.758558Z",
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
  "command_id": "46359828-f718-476c-aab1-c3766ecae4f8",
  "quote_id": "b2e0a004-179f-42d7-879a-83ab783df228",
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
  "correlation_id": "fb350d40-4d8b-495d-9a4f-ae5e3c45f59c"
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
  "paused_at": "2026-10-30T23:05:14.316486Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "06a24a97-f7f9-4703-8acc-d26edeb4e5fc",
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
  "command_id": "fd835402-5699-4c73-b630-230dbb34d051",
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
  "command_id": "4a934649-b244-470b-bd04-073be18f5144",
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
  "id": "a9b5f901-bf9b-42a5-9564-4c644835de01",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T23:10:16.002172Z",
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
  "command_id": "e06993d1-951e-4006-9832-3fb8a37e5cd2",
  "quote_id": "a9b5f901-bf9b-42a5-9564-4c644835de01",
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
  "correlation_id": "d1bcdd5b-2f66-4ace-a9fc-f076fc2dcf5f"
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
  "command_id": "d3e27efc-05c1-4f08-abf0-05b1a6f1a34c",
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
      "from": "02:00",
      "to": "03:00"
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
      "from": "02:00",
      "to": "03:00"
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
  "command_id": "be56494d-0415-40ef-a2cc-e92af62cf9dd",
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
  "id": "ad833441-8ffe-4906-af40-d4b3100aa069",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T23:10:16.844123Z",
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
  "command_id": "a948ccd4-97ed-41e5-aa5e-e11bb22e07b5",
  "quote_id": "ad833441-8ffe-4906-af40-d4b3100aa069",
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
  "correlation_id": "92cf5097-dd36-4817-bab7-c560e848584a"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "e672642f-8fb1-4dec-8bec-0d7e85b19592",
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
  "correlation_id": "b2727706-591a-4b83-b9b3-adc2c69d85e8",
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
      "from": "02:00",
      "to": "03:00"
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
  "command_id": "ed7d5cc1-3447-426f-8a15-31accebccc98",
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
  "phone": "+380679879284",
  "device_ref": "sandbox-18042"
}
```

```json
{
  "challenge_id": "36f51383-f46d-4846-8880-7386dc93d449",
  "expires_at": "2026-10-30T23:10:17.876569983Z",
  "resend_available_at": "2026-10-30T23:05:18.876569983Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380679879284` → **200**

```json
{
  "phone": "+380679879284",
  "audience": "CLIENT",
  "code": "148322",
  "sent_at": "2026-10-30T23:05:17.878655471Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "36f51383-f46d-4846-8880-7386dc93d449",
  "code": "148322",
  "device_ref": "sandbox-18042"
}
```

```json
{
  "session_id": "554de0bf-eff3-428f-b2f8-24f2b361b0bb",
  "subject": {
    "type": "CLIENT",
    "id": "e1841f20-6407-4912-ae82-67276ca0d8d7"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMTg0MWYyMC02NDA3LTQ5MTItYWU4Mi02NzI3NmNhMGQ4ZDciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDAyNDE4LCJpYXQiOjE3OTM0MDE1MTgsImp0aSI6IjUxOWE3ZDA2LWNkOTUtNGI1MC04NjY3LTUxMWE3YTNhMDI0NyIsInNpZCI6IjU1NGRlMGJmLWVmZjMtNDI4Zi1iMmY4LTI0ZjJiMzYxYjBiYiJ9.LfgTTHj-p8PSXx53h1k8esCSvTYPri-Er3jnaDB67Co",
  "access_expires_at": "2026-10-30T23:20:18.099480381Z",
  "refresh_token": "si8sSygjB4qygyciyAg8u1zmLWIscsEfwQMnID7zev4",
  "refresh_expires_at": "2026-11-29T23:05:18.099050712Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "e1841f20-6407-4912-ae82-67276ca0d8d7",
  "session_id": "554de0bf-eff3-428f-b2f8-24f2b361b0bb",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "2c29e98d-15ca-4e9b-b2fa-57b79925a36c",
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
  "id": "5193f146-7bde-44a1-943f-60e34236f6b6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T23:10:18.506974Z",
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
  "challenge_id": "cd66c357-07be-445b-821d-cf3d22280775",
  "expires_at": "2026-10-30T23:10:20.738692132Z",
  "resend_available_at": "2026-10-30T23:05:21.738692132Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380679879284` → **200**

```json
{
  "phone": "+380679879284",
  "audience": "CLIENT",
  "code": "962849",
  "sent_at": "2026-10-30T23:05:20.745087121Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "c83683e9-d5c0-4e32-a2e7-b3decef7c117",
  "challenge_id": "cd66c357-07be-445b-821d-cf3d22280775",
  "otp_code": "962849"
}
```

```json
{
  "client_id": "e1841f20-6407-4912-ae82-67276ca0d8d7",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-30T23:05:20.98279588Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "a479fded-549d-4130-96ab-de0f390f2a72",
  "quote_id": "5193f146-7bde-44a1-943f-60e34236f6b6",
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
  "correlation_id": "e194735b-843d-4123-bf15-cc20c888cb4f"
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
  "session_id": "9cfca930-010c-4d6e-b6d3-b9b640a24242",
  "subject": {
    "type": "STAFF",
    "id": "c66269c2-93bc-421d-8af2-6f0cafc54be4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjYyNjljMi05M2JjLTQyMWQtOGFmMi02ZjBjYWZjNTRiZTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDI0MjEsImlhdCI6MTc5MzQwMTUyMSwianRpIjoiOTMxNTExNDgtMTZlMi00OTg0LTk3MDYtY2I2OTdjM2ViYmNmIiwic2lkIjoiOWNmY2E5MzAtMDEwYy00ZDZlLWI2ZDMtYjliNjQwYTI0MjQyIn0.TrFZX95PZ-sFwq3E6t2YBYPZB_zNfy0OJ2lim0usmbg",
  "access_expires_at": "2026-10-30T23:20:21.689468345Z",
  "refresh_token": "cxXij1ugzFtWW2wOV5hP4qF3exwRUDkbk9xuI97f7rg",
  "refresh_expires_at": "2026-10-31T11:05:21.689053858Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "e1841f20-6407-4912-ae82-67276ca0d8d7",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-30T23:05:20.982796Z",
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

`POST /api/admin/v1/client-deletions/e1841f20-6407-4912-ae82-67276ca0d8d7/complete` → **200**

```json
{
  "command_id": "be3e93f6-bd32-465c-af6a-37a34deeaecc",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "e1841f20-6407-4912-ae82-67276ca0d8d7",
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
  "correlation_id": "1f71cd2d-8109-4301-93f9-3886310cbf2e"
}
```

Done: client e1841f20-6407-4912-ae82-67276ca0d8d7 anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380668452042",
  "device_ref": "sandbox-11912"
}
```

```json
{
  "challenge_id": "e7b8f9f0-fc4b-46b9-b810-29e29c2f6683",
  "expires_at": "2026-10-30T23:10:22.494347454Z",
  "resend_available_at": "2026-10-30T23:05:23.494347454Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380668452042` → **200**

```json
{
  "phone": "+380668452042",
  "audience": "CLIENT",
  "code": "524795",
  "sent_at": "2026-10-30T23:05:22.496290292Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e7b8f9f0-fc4b-46b9-b810-29e29c2f6683",
  "code": "524795",
  "device_ref": "sandbox-11912"
}
```

```json
{
  "session_id": "530e4c08-1a56-4cec-9e21-a3c8a8e85a7b",
  "subject": {
    "type": "CLIENT",
    "id": "58c595b1-9f4e-4e5b-8238-736f1cae8597"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1OGM1OTViMS05ZjRlLTRlNWItODIzOC03MzZmMWNhZTg1OTciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDAyNDIyLCJpYXQiOjE3OTM0MDE1MjIsImp0aSI6IjA5YWQwYzU2LTdmOWQtNGYwZC05NjQ1LTA5Mzk4MjE4MWQ4MCIsInNpZCI6IjUzMGU0YzA4LTFhNTYtNGNlYy05ZTIxLWEzYzhhOGU4NWE3YiJ9.XDajVWCemAilCVWjV-oANs9S_d3cCBTX9hG4J0QwQfg",
  "access_expires_at": "2026-10-30T23:20:22.712123075Z",
  "refresh_token": "TLqXuLRoLl8qxJNbNnLNa7Z9Gosu981Z72a3SUpXl7M",
  "refresh_expires_at": "2026-11-29T23:05:22.711753885Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "58c595b1-9f4e-4e5b-8238-736f1cae8597",
  "session_id": "530e4c08-1a56-4cec-9e21-a3c8a8e85a7b",
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
  "session_id": "ed90dc0b-50c8-497b-afe7-9aa5d775d402",
  "subject": {
    "type": "STAFF",
    "id": "c66269c2-93bc-421d-8af2-6f0cafc54be4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjYyNjljMi05M2JjLTQyMWQtOGFmMi02ZjBjYWZjNTRiZTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDI0MjMsImlhdCI6MTc5MzQwMTUyMywianRpIjoiZTk5MTllYTUtYjdiMC00Yzc4LTk1ZWMtNDcyZTRhYmVjNjNjIiwic2lkIjoiZWQ5MGRjMGItNTBjOC00OTdiLWFmZTctOWFhNWQ3NzVkNDAyIn0.oEyJ9PxT8WQQxF3Vxp5C_ws-IJAeTWxfdZl-c0FooZw",
  "access_expires_at": "2026-10-30T23:20:23.310410375Z",
  "refresh_token": "5GSTEXs4_Bz-BtEalHjvm9MjgUiZG_VVjOjeS7NqM4g",
  "refresh_expires_at": "2026-10-31T11:05:23.310045652Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=8452042&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "58c595b1-9f4e-4e5b-8238-736f1cae8597",
      "phone": "+380668452042",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-30T23:05:22.710465Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/58c595b1-9f4e-4e5b-8238-736f1cae8597` → **200**

```json
{
  "client": {
    "id": "58c595b1-9f4e-4e5b-8238-736f1cae8597",
    "phone": "+380668452042",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T23:05:22.710465Z",
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

`POST /api/admin/v1/clients/58c595b1-9f4e-4e5b-8238-736f1cae8597/block` → **400**

```json
{
  "command_id": "ac14202b-c161-44dc-97d4-85957fd3468d",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/58c595b1-9f4e-4e5b-8238-736f1cae8597/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "e63443ce-86b1-4a14-88a4-8e93b240ea92",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/58c595b1-9f4e-4e5b-8238-736f1cae8597/block` → **200**

```json
{
  "command_id": "413dd870-16fe-4483-a24c-584417df1f6a",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "58c595b1-9f4e-4e5b-8238-736f1cae8597",
  "phone": "+380668452042",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-30T23:05:22.710465Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-30T23:05:24.225748Z",
    "by": "c66269c2-93bc-421d-8af2-6f0cafc54be4"
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
  "correlation_id": "14fa11a3-0716-402f-ac6f-399e430c25bd"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380668452042",
  "device_ref": "sandbox-14073"
}
```

```json
{
  "challenge_id": "7ccd6fe7-2dbc-4731-8483-200d01535f36",
  "expires_at": "2026-10-30T23:10:26.619513988Z",
  "resend_available_at": "2026-10-30T23:05:27.619513988Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380668452042` → **200**

```json
{
  "phone": "+380668452042",
  "audience": "CLIENT",
  "code": "395694",
  "sent_at": "2026-10-30T23:05:26.621356716Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "7ccd6fe7-2dbc-4731-8483-200d01535f36",
  "code": "395694",
  "device_ref": "sandbox-14073"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "c861bfcc-96d3-4c82-b286-2bc365f7265f"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/58c595b1-9f4e-4e5b-8238-736f1cae8597` → **200**

```json
{
  "client": {
    "id": "58c595b1-9f4e-4e5b-8238-736f1cae8597",
    "phone": "+380668452042",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-30T23:05:22.710465Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-30T23:05:24.225748Z",
      "by": "c66269c2-93bc-421d-8af2-6f0cafc54be4"
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

`POST /api/admin/v1/clients/58c595b1-9f4e-4e5b-8238-736f1cae8597/unblock` → **200**

```json
{
  "command_id": "dcfa7cc0-6050-40cf-a109-980f2d593e8a",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "58c595b1-9f4e-4e5b-8238-736f1cae8597",
  "phone": "+380668452042",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-30T23:05:22.710465Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380668452042",
  "device_ref": "sandbox-17104"
}
```

```json
{
  "challenge_id": "159cc00a-70cb-4051-8236-c4236d025f84",
  "expires_at": "2026-10-30T23:10:29.463431834Z",
  "resend_available_at": "2026-10-30T23:05:30.463431834Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380668452042` → **200**

```json
{
  "phone": "+380668452042",
  "audience": "CLIENT",
  "code": "637628",
  "sent_at": "2026-10-30T23:05:29.4651896Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "159cc00a-70cb-4051-8236-c4236d025f84",
  "code": "637628",
  "device_ref": "sandbox-17104"
}
```

```json
{
  "session_id": "551b078f-965b-4cd1-a9d2-525c6a32df26",
  "subject": {
    "type": "CLIENT",
    "id": "58c595b1-9f4e-4e5b-8238-736f1cae8597"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1OGM1OTViMS05ZjRlLTRlNWItODIzOC03MzZmMWNhZTg1OTciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDAyNDI5LCJpYXQiOjE3OTM0MDE1MjksImp0aSI6ImNmNjU4OWU4LTk0MWYtNGYwOC04ODQwLWVmOGM4MWE0MmQ2NiIsInNpZCI6IjU1MWIwNzhmLTk2NWItNGNkMS1hOWQyLTUyNWM2YTMyZGYyNiJ9.Qzzj34txoNPh2gbrBrrhRwznhKn-EcPAEbAmIQcRWow",
  "access_expires_at": "2026-10-30T23:20:29.683510362Z",
  "refresh_token": "ChCoo6AWFqOYT6qmiak8l26hzeEYnZ9EaD6jRcoIRjs",
  "refresh_expires_at": "2026-11-29T23:05:29.683160952Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "58c595b1-9f4e-4e5b-8238-736f1cae8597",
  "session_id": "551b078f-965b-4cd1-a9d2-525c6a32df26",
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
  "phone": "+380664338634",
  "device_ref": "sandbox-27795"
}
```

```json
{
  "challenge_id": "5bf98fe2-b74f-4ace-9ae5-ee2e291ffc8f",
  "expires_at": "2026-10-30T23:10:30.084509835Z",
  "resend_available_at": "2026-10-30T23:05:31.084509835Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380664338634` → **200**

```json
{
  "phone": "+380664338634",
  "audience": "CLIENT",
  "code": "281827",
  "sent_at": "2026-10-30T23:05:30.086443807Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5bf98fe2-b74f-4ace-9ae5-ee2e291ffc8f",
  "code": "281827",
  "device_ref": "sandbox-27795"
}
```

```json
{
  "session_id": "09468341-c7d5-4b59-bfaf-285962e03b54",
  "subject": {
    "type": "CLIENT",
    "id": "5f5d00ee-f223-43ec-91b8-e352c8c9511f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZjVkMDBlZS1mMjIzLTQzZWMtOTFiOC1lMzUyYzhjOTUxMWYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDAyNDMwLCJpYXQiOjE3OTM0MDE1MzAsImp0aSI6ImQ4OGFmYTc0LTU4NjEtNGVlYS04YzM0LTI5YTUwMmJhOGI1ZSIsInNpZCI6IjA5NDY4MzQxLWM3ZDUtNGI1OS1iZmFmLTI4NTk2MmUwM2I1NCJ9.2jbEj6Ut3DidOFGRqZSM5lZ7PSI9SgOWscapeY7VDQ0",
  "access_expires_at": "2026-10-30T23:20:30.369925962Z",
  "refresh_token": "G_2EraHiSDKspRlqePa8cT84WCIvg4q5N3pks9I8v38",
  "refresh_expires_at": "2026-11-29T23:05:30.369478267Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "65b737da-ff2e-4501-8eb7-ab7f3f2da8d9",
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
  "id": "9f9cedd9-799c-402e-be79-bf4aca195c17",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T23:10:30.577403Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: 8777c2a5-a53d-495c-88ed-6a7aaaa038c6) → **201**

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
  "session_id": "efb370c6-ec39-4c96-8152-501752f1268b",
  "subject": {
    "type": "STAFF",
    "id": "c66269c2-93bc-421d-8af2-6f0cafc54be4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjYyNjljMi05M2JjLTQyMWQtOGFmMi02ZjBjYWZjNTRiZTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDI0MzEsImlhdCI6MTc5MzQwMTUzMSwianRpIjoiOWI4OGJiYmEtMDU1NC00YWYzLWI1MjktMzk5NDAyNWE0NGNjIiwic2lkIjoiZWZiMzcwYzYtZWMzOS00Yzk2LTgxNTItNTAxNzUyZjEyNjhiIn0.rHPoc3cSmB66bSCamKM95nHhzDGx_ai-UAA5vfGTtRA",
  "access_expires_at": "2026-10-30T23:20:31.005007478Z",
  "refresh_token": "rTX1vwnmySbCcjbZKX129FBxwFHp-sT28HwS611qfFo",
  "refresh_expires_at": "2026-10-31T11:05:31.004613923Z",
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
  "session_id": "d24f4977-a20b-46a0-b9f7-06f0b7b994f0",
  "subject": {
    "type": "STAFF",
    "id": "c66269c2-93bc-421d-8af2-6f0cafc54be4"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjYyNjljMi05M2JjLTQyMWQtOGFmMi02ZjBjYWZjNTRiZTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDI0MzEsImlhdCI6MTc5MzQwMTUzMSwianRpIjoiN2YyMjE3M2YtYzAwMy00NmQyLWFjZjAtMDU2MGQ1MjM0OGM3Iiwic2lkIjoiZDI0ZjQ5NzctYTIwYi00NmEwLWI5ZjctMDZmMGI3Yjk5NGYwIn0.DiryGqrCwC_rpUYtOzxK48WfyZM9nt2EMUMyMBIBcQU",
  "access_expires_at": "2026-10-30T23:20:31.398214158Z",
  "refresh_token": "sgK4rnjJPLsV-581uC9cgz0G0ehBNa3lYvW0-AdB_50",
  "refresh_expires_at": "2026-10-31T11:05:31.397852069Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/eb5aad3e-b62d-46a5-abe6-a87c27b22822/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T23:05:30.782478Z",
      "actor": {
        "type": "CLIENT",
        "id": "5f5d00ee-f223-43ec-91b8-e352c8c9511f",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "eb5aad3e-b62d-46a5-abe6-a87c27b22822",
        "quote_id": "9f9cedd9-799c-402e-be79-bf4aca195c17",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "8777c2a5-a53d-495c-88ed-6a7aaaa038c6"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T23:05:30.783482Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "eb5aad3e-b62d-46a5-abe6-a87c27b22822",
        "attempt_id": "814aef2d-460d-4749-9e3d-ef6f66342dc5",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "8777c2a5-a53d-495c-88ed-6a7aaaa038c6"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-30T23:05:30.785626Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "eb5aad3e-b62d-46a5-abe6-a87c27b22822",
        "attempt_id": "814aef2d-460d-4749-9e3d-ef6f66342dc5"
      },
      "correlation_id": "8777c2a5-a53d-495c-88ed-6a7aaaa038c6"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "814aef2d-460d-4749-9e3d-ef6f66342dc5",
        "generation": 1,
        "started_at": "2026-10-30T23:05:30.782986Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-30T23:05:30.785626Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-30T23:05:30.783813Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/8777c2a5-a53d-495c-88ed-6a7aaaa038c6` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "eb5aad3e-b62d-46a5-abe6-a87c27b22822:0",
      "order_id": "eb5aad3e-b62d-46a5-abe6-a87c27b22822",
      "at": "2026-10-30T23:05:30.782478Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "eb5aad3e-b62d-46a5-abe6-a87c27b22822:1",
      "order_id": "eb5aad3e-b62d-46a5-abe6-a87c27b22822",
      "at": "2026-10-30T23:05:30.783482Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "eb5aad3e-b62d-46a5-abe6-a87c27b22822:2",
      "order_id": "eb5aad3e-b62d-46a5-abe6-a87c27b22822",
      "at": "2026-10-30T23:05:30.785626Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/82f0a43f-8093-4adb-8129-6c2706069bd6` → **200**

```json
{
  "found": []
}
```

Done: request 8777c2a5-a53d-495c-88ed-6a7aaaa038c6 — order eb5aad3e-b62d-46a5-abe6-a87c27b22822 found by its id.

`GET /api/rider/v1/orders/eb5aad3e-b62d-46a5-abe6-a87c27b22822` → **200**

```json
{
  "id": "eb5aad3e-b62d-46a5-abe6-a87c27b22822",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5f5d00ee-f223-43ec-91b8-e352c8c9511f",
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
  "created_at": "2026-10-30T23:05:30.782148Z",
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

`POST /api/rider/v1/orders/eb5aad3e-b62d-46a5-abe6-a87c27b22822/cancel` → **200**

```json
{
  "command_id": "64fc6028-c979-489f-b05d-fce0ccd2be64",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "eb5aad3e-b62d-46a5-abe6-a87c27b22822",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "5f5d00ee-f223-43ec-91b8-e352c8c9511f",
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
  "created_at": "2026-10-30T23:05:30.782148Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "ru": "Передумал ехать",
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
      "en": "Changed my mind"
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
  "phone": "+380633408724",
  "device_ref": "sandbox-5610"
}
```

```json
{
  "challenge_id": "a0937397-fa4b-412e-b7a5-720ebbb73f48",
  "expires_at": "2026-10-30T23:10:32.636864962Z",
  "resend_available_at": "2026-10-30T23:05:33.636864962Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380633408724` → **200**

```json
{
  "phone": "+380633408724",
  "audience": "CLIENT",
  "code": "752085",
  "sent_at": "2026-10-30T23:05:32.639011157Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a0937397-fa4b-412e-b7a5-720ebbb73f48",
  "code": "752085",
  "device_ref": "sandbox-5610"
}
```

```json
{
  "session_id": "506e6ad4-be24-4707-aeb5-60f9c16acfb2",
  "subject": {
    "type": "CLIENT",
    "id": "8fa615b8-6296-44fc-80f2-d0f5504b4005"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZmE2MTViOC02Mjk2LTQ0ZmMtODBmMi1kMGY1NTA0YjQwMDUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDAyNDMyLCJpYXQiOjE3OTM0MDE1MzIsImp0aSI6IjczYmEwYTRhLTI0NDctNDkwMi1hM2Q4LWZlNDI4N2E1MGJlNSIsInNpZCI6IjUwNmU2YWQ0LWJlMjQtNDcwNy1hZWI1LTYwZjljMTZhY2ZiMiJ9.0AeWBlMWZ6DDDzYTQMUXy2rFkpQL_18G1eQnEudFhbc",
  "access_expires_at": "2026-10-30T23:20:32.853063105Z",
  "refresh_token": "HsL3nkto48RW-dYSmS7wGUpqUdFj5Co6IoHStzKfUak",
  "refresh_expires_at": "2026-11-29T23:05:32.852633666Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "c9f39a79-5f97-4705-b8a6-a6d1a456e07a",
  "expires_at": "2026-10-30T23:10:35.064120113Z",
  "resend_available_at": "2026-10-30T23:05:36.064120113Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633408724` → **200**

```json
{
  "phone": "+380633408724",
  "audience": "CLIENT",
  "code": "508563",
  "sent_at": "2026-10-30T23:05:35.065888805Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "eb5ce4fb-a708-4d42-b05a-ae4e2c4708a6",
  "challenge_id": "c9f39a79-5f97-4705-b8a6-a6d1a456e07a",
  "otp_code": "508563"
}
```

```json
{
  "id": "66d5d3a0-5165-44a5-9215-9db495b24d35",
  "state": "PENDING",
  "created_at": "2026-10-30T23:05:35.289793Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/66d5d3a0-5165-44a5-9215-9db495b24d35` → **200**

```json
{
  "id": "66d5d3a0-5165-44a5-9215-9db495b24d35",
  "state": "PENDING",
  "created_at": "2026-10-30T23:05:35.289793Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/66d5d3a0-5165-44a5-9215-9db495b24d35` → **200**

```json
{
  "id": "66d5d3a0-5165-44a5-9215-9db495b24d35",
  "state": "PENDING",
  "created_at": "2026-10-30T23:05:35.289793Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/66d5d3a0-5165-44a5-9215-9db495b24d35` → **200**

```json
{
  "id": "66d5d3a0-5165-44a5-9215-9db495b24d35",
  "state": "READY",
  "created_at": "2026-10-30T23:05:35.289793Z",
  "ready_at": "2026-10-30T23:05:37.357154Z",
  "expires_at": "2026-11-06T23:05:37.357154Z",
  "size_bytes": 1030
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/66d5d3a0-5165-44a5-9215-9db495b24d35/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636239573",
  "device_ref": "sandbox-2110"
}
```

```json
{
  "challenge_id": "542ed0e1-fddc-4ead-bbbd-fb9daedc3aab",
  "expires_at": "2026-10-30T23:10:38.216809748Z",
  "resend_available_at": "2026-10-30T23:05:39.216809748Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636239573` → **200**

```json
{
  "phone": "+380636239573",
  "audience": "CLIENT",
  "code": "894835",
  "sent_at": "2026-10-30T23:05:38.218714213Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "542ed0e1-fddc-4ead-bbbd-fb9daedc3aab",
  "code": "894835",
  "device_ref": "sandbox-2110"
}
```

```json
{
  "session_id": "e5101959-f3c1-4eec-8346-91d46d6bff55",
  "subject": {
    "type": "CLIENT",
    "id": "5bfe1856-9d12-4ea5-8d92-e4025bf17fbc"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YmZlMTg1Ni05ZDEyLTRlYTUtOGQ5Mi1lNDAyNWJmMTdmYmMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDAyNDM4LCJpYXQiOjE3OTM0MDE1MzgsImp0aSI6ImQzZjIzZTlmLWQ2OTYtNDBlMy1iNzdkLTgzODU5NTgwYjI3ZiIsInNpZCI6ImU1MTAxOTU5LWYzYzEtNGVlYy04MzQ2LTkxZDQ2ZDZiZmY1NSJ9.tuaWMwnUH9pXwW5NoExXSgScBVSieS7oiFM-hNFWXLE",
  "access_expires_at": "2026-10-30T23:20:38.432603053Z",
  "refresh_token": "a3Va40c_QCB5gBoPQWg1tVtwXN-wQ3K5JLZw_7RVp2A",
  "refresh_expires_at": "2026-11-29T23:05:38.432262125Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/66d5d3a0-5165-44a5-9215-9db495b24d35/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/66d5d3a0-5165-44a5-9215-9db495b24d35/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "eac192b0-a2ac-4066-86d3-8421ad0ef38f"
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
  "session_id": "0c90c04a-da43-43e5-969d-bef2c19647fa",
  "subject": {
    "type": "STAFF",
    "id": "c66269c2-93bc-421d-8af2-6f0cafc54be4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjYyNjljMi05M2JjLTQyMWQtOGFmMi02ZjBjYWZjNTRiZTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDI0MzksImlhdCI6MTc5MzQwMTUzOSwianRpIjoiYjcyZTkxMjktZTczNC00YmM1LWIwNzEtODc2NGYyMjMzZjJhIiwic2lkIjoiMGM5MGMwNGEtZGE0My00M2U1LTk2OWQtYmVmMmMxOTY0N2ZhIn0.J8Ebs43Ym7LFTKeYWmvRaY0HdnRIyKov9QVYmJqWGL0",
  "access_expires_at": "2026-10-30T23:20:39.023840688Z",
  "refresh_token": "VwVEEqP4PTie7uAbWFKC33gMMTAcL1hnKK_XPwJ5OR0",
  "refresh_expires_at": "2026-10-31T11:05:39.023409076Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "8fa615b8-6296-44fc-80f2-d0f5504b4005",
  "session_id": "506e6ad4-be24-4707-aeb5-60f9c16acfb2",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/8fa615b8-6296-44fc-80f2-d0f5504b4005/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "66d5d3a0-5165-44a5-9215-9db495b24d35",
      "state": "READY",
      "created_at": "2026-10-30T23:05:35.289793Z",
      "ready_at": "2026-10-30T23:05:37.357154Z",
      "expires_at": "2026-11-06T23:05:37.357154Z",
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
  "device_ref": "sandbox-15978"
}
```

```json
{
  "challenge_id": "e048c4c9-fcaa-4847-9fed-10f0464d5675",
  "expires_at": "2026-10-30T23:10:39.614225002Z",
  "resend_available_at": "2026-10-30T23:05:40.614225002Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "513808",
  "sent_at": "2026-10-30T23:05:39.616315824Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e048c4c9-fcaa-4847-9fed-10f0464d5675",
  "code": "513808",
  "device_ref": "sandbox-15978"
}
```

```json
{
  "session_id": "f658db49-636d-4944-8dd2-acb39e891583",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwMjQzOSwiaWF0IjoxNzkzNDAxNTM5LCJqdGkiOiI1NDZiOTJlOC0yNzk1LTQwNjgtODcxYi00ZTlhYWQ2NTMxZmUiLCJzaWQiOiJmNjU4ZGI0OS02MzZkLTQ5NDQtOGRkMi1hY2IzOWU4OTE1ODMifQ.MmZsE7qKYJVJsrNetJ_5gMKRv3kCumCafECQ0UEtG04",
  "access_expires_at": "2026-10-30T23:20:39.838490738Z",
  "refresh_token": "D_oSmAj_XFoaT8QRrVGj9cklVjKuud1MxFIlxoZCGz0",
  "refresh_expires_at": "2026-11-29T23:05:39.83812956Z",
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
  "device_ref": "sandbox-17391"
}
```

```json
{
  "challenge_id": "f4b87448-d531-45ce-856d-f6fa943806ee",
  "expires_at": "2026-10-30T23:10:40.218881635Z",
  "resend_available_at": "2026-10-30T23:05:41.218881635Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "303420",
  "sent_at": "2026-10-30T23:05:40.220820581Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f4b87448-d531-45ce-856d-f6fa943806ee",
  "code": "303420",
  "device_ref": "sandbox-17391"
}
```

```json
{
  "session_id": "e86a99f3-19a5-4b34-9873-beb214f886c4",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwMjQ0MCwiaWF0IjoxNzkzNDAxNTQwLCJqdGkiOiJjNjdmZmY3NC0wOTI1LTQwMzQtOTEwOS1iMjUzYmRkZDdlNTIiLCJzaWQiOiJlODZhOTlmMy0xOWE1LTRiMzQtOTg3My1iZWIyMTRmODg2YzQifQ.hM4cFomSmzNo7Id8BKNXOr2CBSra_tx8beCCnEM-1ew",
  "access_expires_at": "2026-10-30T23:20:40.442188114Z",
  "refresh_token": "lPcIoZZR_IpsQrp8UPGYHAyRtng6hig_XCLpZDE_kL4",
  "refresh_expires_at": "2026-11-29T23:05:40.441686758Z",
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
  "command_id": "849312c0-e4ce-49d0-8b7d-32bf54113e66",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T23:05:40Z",
    "sequence": 1793401540909
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "88e9423f-8de4-4493-89f8-157547ddedf9",
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
  "last_heartbeat_at": "2026-10-30T23:05:40.926526Z",
  "last_location_at": "2026-10-30T23:05:40.926526Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-21231"
}
```

```json
{
  "challenge_id": "a78060ae-fe11-404e-b818-21f07b7a03e8",
  "expires_at": "2026-10-30T23:10:41.12555909Z",
  "resend_available_at": "2026-10-30T23:05:42.12555909Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "338604",
  "sent_at": "2026-10-30T23:05:41.127507681Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a78060ae-fe11-404e-b818-21f07b7a03e8",
  "code": "338604",
  "device_ref": "sandbox-21231"
}
```

```json
{
  "session_id": "9ef7413b-fa9a-4e01-952c-52c862d31622",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwMjQ0MSwiaWF0IjoxNzkzNDAxNTQxLCJqdGkiOiI4MjZmMWQyZC00ZTU1LTQzZmMtYTFiNS1hOWUyNjI0ZmZkOTIiLCJzaWQiOiI5ZWY3NDEzYi1mYTlhLTRlMDEtOTUyYy01MmM4NjJkMzE2MjIifQ.uE_Or7xFZeWG33sXr3xbx8gfTA1BLX2HQDRYCB7AKso",
  "access_expires_at": "2026-10-30T23:20:41.343507985Z",
  "refresh_token": "Kbw88ajmMeT0ts4erU_DoRHAe2WLkz6XPSCAUWyN3mk",
  "refresh_expires_at": "2026-11-29T23:05:41.343056848Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "4cf49fb8-0e87-4987-acb9-8866f10f07d7",
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
  "last_heartbeat_at": "2026-10-30T23:01:58.740638Z",
  "last_location_at": "2026-10-30T23:01:58.740638Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/4cf49fb8-0e87-4987-acb9-8866f10f07d7/handover` → **200**

```json
{
  "command_id": "64f5cd82-f112-4ee4-b351-f4e016a991c7",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "4cf49fb8-0e87-4987-acb9-8866f10f07d7",
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
  "last_heartbeat_at": "2026-10-30T23:01:58.740638Z",
  "last_location_at": "2026-10-30T23:01:58.740638Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/4cf49fb8-0e87-4987-acb9-8866f10f07d7/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T23:05:41Z",
    "sequence": 1793401541952
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "4cf49fb8-0e87-4987-acb9-8866f10f07d7",
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
  "last_heartbeat_at": "2026-10-30T23:05:41.969435Z",
  "last_location_at": "2026-10-30T23:05:41.969435Z",
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
  "session_id": "d56e5315-cecd-402c-99ea-39b32598bedf",
  "subject": {
    "type": "STAFF",
    "id": "c66269c2-93bc-421d-8af2-6f0cafc54be4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjYyNjljMi05M2JjLTQyMWQtOGFmMi02ZjBjYWZjNTRiZTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDI0NDIsImlhdCI6MTc5MzQwMTU0MiwianRpIjoiYzVlNzE2N2QtOThkOS00NThlLWJjZTYtMDhjM2Y2OGQ0NGZiIiwic2lkIjoiZDU2ZTUzMTUtY2VjZC00MDJjLTk5ZWEtMzliMzI1OThiZWRmIn0.OyjQvEKDIpreo9LaBVCiaJFqrth5E3SdMtLPxRg7owU",
  "access_expires_at": "2026-10-30T23:20:42.363427306Z",
  "refresh_token": "hKT3lWCYustYalbP42OUExgW5TQIh0Z4lXhX0Ri3Bwc",
  "refresh_expires_at": "2026-10-31T11:05:42.362998247Z",
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
  "session_id": "9db60045-d99f-4862-9643-555224acc4c2",
  "subject": {
    "type": "STAFF",
    "id": "c66269c2-93bc-421d-8af2-6f0cafc54be4"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjYyNjljMi05M2JjLTQyMWQtOGFmMi02ZjBjYWZjNTRiZTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDI0NDIsImlhdCI6MTc5MzQwMTU0MiwianRpIjoiNzEyNjZhYjAtN2JiOS00ODFiLTk0ZTctNTcyOWFkY2E3MDlmIiwic2lkIjoiOWRiNjAwNDUtZDk5Zi00ODYyLTk2NDMtNTU1MjI0YWNjNGMyIn0.BtJE7yR0A3-94ffJLZmmpyvincbSZHLXOr2fnmR-YSE",
  "access_expires_at": "2026-10-30T23:20:42.763905101Z",
  "refresh_token": "XyESGwxHHMOswaw8jiSOFUlux1yGkf1lMgaUsXZLQ64",
  "refresh_expires_at": "2026-10-31T11:05:42.763540809Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380686275627",
  "device_ref": "sandbox-1739"
}
```

```json
{
  "challenge_id": "8b11a074-e4df-4b24-9e01-6fb01f395121",
  "expires_at": "2026-10-30T23:10:42.968064449Z",
  "resend_available_at": "2026-10-30T23:05:43.968064449Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380686275627` → **200**

```json
{
  "phone": "+380686275627",
  "audience": "CLIENT",
  "code": "730663",
  "sent_at": "2026-10-30T23:05:42.970126504Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8b11a074-e4df-4b24-9e01-6fb01f395121",
  "code": "730663",
  "device_ref": "sandbox-1739"
}
```

```json
{
  "session_id": "e317cd01-30d7-4eba-9e1e-5d9b65b6a73e",
  "subject": {
    "type": "CLIENT",
    "id": "be19b66a-7384-45c9-af28-6be08088c50c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiZTE5YjY2YS03Mzg0LTQ1YzktYWYyOC02YmUwODA4OGM1MGMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDAyNDQzLCJpYXQiOjE3OTM0MDE1NDMsImp0aSI6IjM1MTNiZmQxLWZmYzQtNGM1ZC1hZDQzLTVmNDc1NjI0ZTM4ZCIsInNpZCI6ImUzMTdjZDAxLTMwZDctNGViYS05ZTFlLTVkOWI2NWI2YTczZSJ9.0Jba2Y1pkHIBwVXxf7ytvl9l6u-iZE1cO9ILIrKufvA",
  "access_expires_at": "2026-10-30T23:20:43.193641738Z",
  "refresh_token": "RIURgulXP8urNN_PBiiOyGnPr7oWQcsKzBh2tF4EFbA",
  "refresh_expires_at": "2026-11-29T23:05:43.193297706Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "0c6d87a0-e302-45b5-a2c4-3c849f297862",
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
  "id": "354b602a-fb93-4642-b525-593a50a840ab",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T23:10:43.392241Z",
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
  "command_id": "f4bdab30-5473-4fa2-bfda-79f6affa3c03",
  "quote_id": "354b602a-fb93-4642-b525-593a50a840ab",
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
  "id": "5d0d4a9b-d403-4ed5-bb3b-6d9eac8cb809",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "be19b66a-7384-45c9-af28-6be08088c50c",
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
  "created_at": "2026-10-30T23:05:43.604508Z",
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
    "id": "e4c23164-fa34-4eb7-9f80-ff37b2528c05",
    "order_id": "5d0d4a9b-d403-4ed5-bb3b-6d9eac8cb809",
    "expires_at": "2026-10-30T23:05:58.606356Z",
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

`POST /api/driver/v1/offers/e4c23164-fa34-4eb7-9f80-ff37b2528c05/reject` → **204**

```json
{
  "command_id": "aae7c073-9f5a-4ab1-b230-2ab3c76d246e"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "02344b8f-88ff-494a-a51c-c203626ebb46",
    "order_id": "5d0d4a9b-d403-4ed5-bb3b-6d9eac8cb809",
    "expires_at": "2026-10-30T23:05:59.052946Z",
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

`POST /api/driver/v1/offers/02344b8f-88ff-494a-a51c-c203626ebb46/accept` → **200**

```json
{
  "command_id": "eaa6785f-33db-487b-86c4-4f4aa985f56c"
}
```

```json
{
  "id": "55480221-674c-487a-a833-43bdc165a2aa",
  "order_id": "5d0d4a9b-d403-4ed5-bb3b-6d9eac8cb809",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d3ec397e-f18c-4d27-b74d-e777d54d1221",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/5d0d4a9b-d403-4ed5-bb3b-6d9eac8cb809/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T23:05:43.604845Z",
      "actor": {
        "type": "CLIENT",
        "id": "be19b66a-7384-45c9-af28-6be08088c50c",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "5d0d4a9b-d403-4ed5-bb3b-6d9eac8cb809",
        "quote_id": "354b602a-fb93-4642-b525-593a50a840ab",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "3f39b339-6783-4819-9adc-db01eec53c28"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T23:05:43.605987Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "5d0d4a9b-d403-4ed5-bb3b-6d9eac8cb809",
        "attempt_id": "b56943c3-0843-435c-97be-44573d031f19",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "3f39b339-6783-4819-9adc-db01eec53c28"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T23:05:43.608435Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "e4c23164-fa34-4eb7-9f80-ff37b2528c05",
        "order_id": "5d0d4a9b-d403-4ed5-bb3b-6d9eac8cb809",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200,
        "expires_at": "2026-10-30T23:05:58.606356262Z"
      },
      "correlation_id": "3f39b339-6783-4819-9adc-db01eec53c28"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-30T23:05:44.052278Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "e4c23164-fa34-4eb7-9f80-ff37b2528c05",
        "order_id": "5d0d4a9b-d403-4ed5-bb3b-6d9eac8cb809"
      },
      "correlation_id": "e0071b66-e412-40ae-a976-361f8eb74cac"
    },
    {
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order 5d0d4a9b-d403-4ed5-bb3b-6d9eac8cb809 — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/5d0d4a9b-d403-4ed5-bb3b-6d9eac8cb809` → **200**

```json
{
  "id": "5d0d4a9b-d403-4ed5-bb3b-6d9eac8cb809",
  "short_number": 13,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "be19b66a-7384-45c9-af28-6be08088c50c",
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
    "id": "55480221-674c-487a-a833-43bdc165a2aa",
    "order_id": "5d0d4a9b-d403-4ed5-bb3b-6d9eac8cb809",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "d3ec397e-f18c-4d27-b74d-e777d54d1221",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T23:05:43.604508Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/5d0d4a9b-d403-4ed5-bb3b-6d9eac8cb809/cancel` → **200**

```json
{
  "command_id": "bb8788fb-b8c6-4d76-8134-6b461541539a",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "5d0d4a9b-d403-4ed5-bb3b-6d9eac8cb809",
  "short_number": 13,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "be19b66a-7384-45c9-af28-6be08088c50c",
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
    "id": "55480221-674c-487a-a833-43bdc165a2aa",
    "order_id": "5d0d4a9b-d403-4ed5-bb3b-6d9eac8cb809",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "d3ec397e-f18c-4d27-b74d-e777d54d1221",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T23:05:43.604508Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "ru": "Нет свободных машин",
      "pl": "Brak wolnych aut",
      "uk": "Немає вільних авто",
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
  "session_id": "88e9423f-8de4-4493-89f8-157547ddedf9",
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
  "last_heartbeat_at": "2026-10-30T23:05:40.926526Z",
  "last_location_at": "2026-10-30T23:05:40.926526Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/88e9423f-8de4-4493-89f8-157547ddedf9/close` → **200**

```json
{
  "command_id": "36f61e00-fe7b-43f1-a1eb-e5bf0c3ad716",
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
  "session_id": "4cf49fb8-0e87-4987-acb9-8866f10f07d7",
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
  "last_heartbeat_at": "2026-10-30T23:05:41.969435Z",
  "last_location_at": "2026-10-30T23:05:41.969435Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/4cf49fb8-0e87-4987-acb9-8866f10f07d7/close` → **200**

```json
{
  "command_id": "e9644a44-fe43-4d93-99cf-10f729193c56",
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
  "device_ref": "sandbox-14121"
}
```

```json
{
  "challenge_id": "e9315541-55c6-446e-9699-de3c0c2cef56",
  "expires_at": "2026-10-30T23:10:46.02914162Z",
  "resend_available_at": "2026-10-30T23:05:47.02914162Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "870952",
  "sent_at": "2026-10-30T23:05:46.031287715Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e9315541-55c6-446e-9699-de3c0c2cef56",
  "code": "870952",
  "device_ref": "sandbox-14121"
}
```

```json
{
  "session_id": "e715e806-bb15-49a9-8c7d-8ccab835c370",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwMjQ0NiwiaWF0IjoxNzkzNDAxNTQ2LCJqdGkiOiI4OGFhMGYzMy1jMGU3LTRiMDEtOTA0MS01ZjE2YzIxMDQ3ZDQiLCJzaWQiOiJlNzE1ZTgwNi1iYjE1LTQ5YTktOGM3ZC04Y2NhYjgzNWMzNzAifQ.qwLQzFB7SH0gLLv3yupIcL_7XiAWVIKKfEEnIz5i8zk",
  "access_expires_at": "2026-10-30T23:20:46.258874954Z",
  "refresh_token": "MxYj4xvQX_AjIOBJ72kE0dfgi7OcSdPZNeNsyhDKVMk",
  "refresh_expires_at": "2026-11-29T23:05:46.25837502Z",
  "account_created": false
}
```

`POST /api/driver/v1/documents/upload-sessions` → **201**

```json
{
  "command_id": "72b411c8-4e0f-4eb8-b582-05e285a37694",
  "content_type": "application/pdf",
  "size_bytes": 86
}
```

```json
{
  "file_id": "57e988ea-9965-482a-97ff-bfc886469ad7",
  "upload_path": "/api/driver/v1/uploads/57e988ea-9965-482a-97ff-bfc886469ad7",
  "expires_at": "2026-10-30T23:20:46.472400105Z",
  "max_bytes": 86
}
```

`PUT /api/driver/v1/uploads/57e988ea-9965-482a-97ff-bfc886469ad7` → **200**

```json
{
  "file_id": "57e988ea-9965-482a-97ff-bfc886469ad7",
  "state": "SAFE",
  "content_type": "application/pdf",
  "size_bytes": 86,
  "reject_reason": null
}
```

## On the server's disk the file is not the PDF

Stored at `driver_document/2026-10/57e988ea-9965-482a-97ff-bfc886469ad7`, first bytes `425a46312984e897` (plain: `255044462d312e37` = %PDF-1.7).

## His download is exactly what he uploaded

`GET /api/driver/v1/files/57e988ea-9965-482a-97ff-bfc886469ad7` → **200**

SHA-256 uploaded `38dfb5cee4b4eb7f6efc45e63fe557b70b287608d0f730c046a8d29fa44f573e`, downloaded `38dfb5cee4b4eb7f6efc45e63fe557b70b287608d0f730c046a8d29fa44f573e`.

Done: document 57e988ea-9965-482a-97ff-bfc886469ad7 is encrypted on disk and downloads unchanged.

# Scenario: driver-block

## Only Andrii is online; he takes an order and starts the trip

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-10628"
}
```

```json
{
  "challenge_id": "1291ace9-cf4b-4edc-a9ce-702af2352ab8",
  "expires_at": "2026-10-30T23:10:46.760414009Z",
  "resend_available_at": "2026-10-30T23:05:47.760414009Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "993083",
  "sent_at": "2026-10-30T23:05:46.762482588Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1291ace9-cf4b-4edc-a9ce-702af2352ab8",
  "code": "993083",
  "device_ref": "sandbox-10628"
}
```

```json
{
  "session_id": "14293b19-e280-496b-aa95-8508f5774ec2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwMjQ0NiwiaWF0IjoxNzkzNDAxNTQ2LCJqdGkiOiIyYjJmOTJkMy00ZTQ4LTQ3OWYtYTJiMi00Zjc5YTY2NTg2Y2YiLCJzaWQiOiIxNDI5M2IxOS1lMjgwLTQ5NmItYWE5NS04NTA4ZjU3NzRlYzIifQ.Qw9kTBt95HLBj5KSujrBl9bMzcZ_G2TbUan7V-UFe2o",
  "access_expires_at": "2026-10-30T23:20:46.993525172Z",
  "refresh_token": "DECvJxWV_Ri43NmlpiOoNJ3DEbjOHKQ9FrNXJk1xo2U",
  "refresh_expires_at": "2026-11-29T23:05:46.993089193Z",
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
  "device_ref": "sandbox-22948"
}
```

```json
{
  "challenge_id": "8bcc4630-54f8-4b00-b804-77c51532a9e9",
  "expires_at": "2026-10-30T23:10:47.405221871Z",
  "resend_available_at": "2026-10-30T23:05:48.405221871Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "360007",
  "sent_at": "2026-10-30T23:05:47.407183702Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8bcc4630-54f8-4b00-b804-77c51532a9e9",
  "code": "360007",
  "device_ref": "sandbox-22948"
}
```

```json
{
  "session_id": "9ac3cad8-be06-4a1e-bcbc-86e95f4e50a6",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwMjQ0NywiaWF0IjoxNzkzNDAxNTQ3LCJqdGkiOiI3NmIzYWIyZC1mNzI4LTQ0MGItOTExNi1mZWVhYmU4YWY1ZTYiLCJzaWQiOiI5YWMzY2FkOC1iZTA2LTRhMWUtYmNiYy04NmU5NWY0ZTUwYTYifQ.shWJoLdZIi6kqmxU9z_ddgzj2UoW-oVtuySUry9-RsU",
  "access_expires_at": "2026-10-30T23:20:47.646327278Z",
  "refresh_token": "kN1Qatg4QeGO1IuklAD35F-xn3ITBEJUwyAKvUVqnyc",
  "refresh_expires_at": "2026-11-29T23:05:47.645904028Z",
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
  "session_id": "5f1ba600-21ff-40c4-9d4d-6c9ee2deb5c2",
  "subject": {
    "type": "STAFF",
    "id": "c66269c2-93bc-421d-8af2-6f0cafc54be4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjYyNjljMi05M2JjLTQyMWQtOGFmMi02ZjBjYWZjNTRiZTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDI0NDgsImlhdCI6MTc5MzQwMTU0OCwianRpIjoiYTliMTQ4OGYtNTkxYS00NmRhLTg5YjItZjBlZmRlZmZkMzhkIiwic2lkIjoiNWYxYmE2MDAtMjFmZi00MGM0LTlkNGQtNmM5ZWUyZGViNWMyIn0.hI2iL3oxsVTb5Cg3wQ2uM5AsAIHK37MolcreLdQNPRk",
  "access_expires_at": "2026-10-30T23:20:48.286859373Z",
  "refresh_token": "ITgiw31QoSSV1bIkr06V_eo5lvrXewOZP_FsdYAEEOI",
  "refresh_expires_at": "2026-10-31T11:05:48.286395733Z",
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
  "session_id": "cf8bc593-5e5d-41d4-99ee-589edc4f90cb",
  "subject": {
    "type": "STAFF",
    "id": "c66269c2-93bc-421d-8af2-6f0cafc54be4"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjYyNjljMi05M2JjLTQyMWQtOGFmMi02ZjBjYWZjNTRiZTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDI0NDgsImlhdCI6MTc5MzQwMTU0OCwianRpIjoiMzMwZWQwZDYtMzYxMy00YjQ0LWI4MTktYTM4NDZkNzg4NjYzIiwic2lkIjoiY2Y4YmM1OTMtNWU1ZC00MWQ0LTk5ZWUtNTg5ZWRjNGY5MGNiIn0.4JjBT0KyBhVEu2KC9jt-ConGusqKFQT2irSJXRSUNhc",
  "access_expires_at": "2026-10-30T23:20:48.709899742Z",
  "refresh_token": "ocZK_jEJR7cd9R-tGvtYISi_ihSSn_13QecRUWc2PcQ",
  "refresh_expires_at": "2026-10-31T11:05:48.709462722Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-5333"
}
```

```json
{
  "challenge_id": "7c355dcb-b855-4e40-b9cc-8990837accaa",
  "expires_at": "2026-10-30T23:10:48.91363788Z",
  "resend_available_at": "2026-10-30T23:05:49.91363788Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "656278",
  "sent_at": "2026-10-30T23:05:48.915682604Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7c355dcb-b855-4e40-b9cc-8990837accaa",
  "code": "656278",
  "device_ref": "sandbox-5333"
}
```

```json
{
  "session_id": "0f8f8510-8ddf-4143-85f4-9effeaba4e91",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwMjQ0OSwiaWF0IjoxNzkzNDAxNTQ5LCJqdGkiOiI0OTI3MWVkOC1kYjQwLTQ3YjEtYTQ0Zi0zMTVlYzgwNDM3YmIiLCJzaWQiOiIwZjhmODUxMC04ZGRmLTQxNDMtODVmNC05ZWZmZWFiYTRlOTEifQ.QaePedU0Gp-VoeXiTYBoj4f1N4tDOp9DJwTY-OGpmYc",
  "access_expires_at": "2026-10-30T23:20:49.148877623Z",
  "refresh_token": "bVusNjyatfvpyGe_bYjN1TySWIRM76x-nEUP9pEW9iU",
  "refresh_expires_at": "2026-11-29T23:05:49.148455865Z",
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

(the car drives 74 s to the next point)

`POST /api/driver/v1/work-sessions` → **201**

```json
{
  "command_id": "287e9358-ada0-4d9f-810c-71a73be2e91d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4528,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T23:07:03Z",
    "sequence": 1793401623582
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "e9371664-7e33-4a4d-b8ae-203e07fdf327",
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
  "last_heartbeat_at": "2026-10-30T23:07:03.598617Z",
  "last_location_at": "2026-10-30T23:07:03.598617Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380689541930",
  "device_ref": "sandbox-20876"
}
```

```json
{
  "challenge_id": "bb4d0d33-5471-47fb-9ccc-5bb57c45cf6a",
  "expires_at": "2026-10-30T23:12:03.793676527Z",
  "resend_available_at": "2026-10-30T23:07:04.793676527Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380689541930` → **200**

```json
{
  "phone": "+380689541930",
  "audience": "CLIENT",
  "code": "288820",
  "sent_at": "2026-10-30T23:07:03.796393834Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bb4d0d33-5471-47fb-9ccc-5bb57c45cf6a",
  "code": "288820",
  "device_ref": "sandbox-20876"
}
```

```json
{
  "session_id": "f028a748-87ed-42a2-89c3-ad09b41259fe",
  "subject": {
    "type": "CLIENT",
    "id": "c83b6899-511a-4840-9c09-647a7d99d329"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjODNiNjg5OS01MTFhLTQ4NDAtOWMwOS02NDdhN2Q5OWQzMjkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDAyNTI0LCJpYXQiOjE3OTM0MDE2MjQsImp0aSI6ImM1YWVjNDk1LTA3YjUtNGY4Mi04YWYyLWRkZGVlMDc4MmIxMyIsInNpZCI6ImYwMjhhNzQ4LTg3ZWQtNDJhMi04OWMzLWFkMDliNDEyNTlmZSJ9.gbxyNa2zIRfFI9PCWpTwQnXAcvZC70z5tJuqCW_7DoY",
  "access_expires_at": "2026-10-30T23:22:04.016267565Z",
  "refresh_token": "ohrjl03ePERV6_t4vB3v2GrKVmCcqGx1NBlYhRFwbD8",
  "refresh_expires_at": "2026-11-29T23:07:04.015628934Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "679930e7-7e72-4b34-8420-b4f9de6348ce",
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
  "id": "20c798d7-73bc-4b9d-8ae5-cbd7ac8fdd1c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T23:12:04.230196Z",
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
  "command_id": "116ef4a9-9c7e-4cdb-91aa-77894ee8d499",
  "quote_id": "20c798d7-73bc-4b9d-8ae5-cbd7ac8fdd1c",
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
  "id": "e2556396-e7bc-4248-938b-d0187a229d37",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c83b6899-511a-4840-9c09-647a7d99d329",
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
  "created_at": "2026-10-30T23:07:04.441067Z",
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
    "id": "0874d2aa-c741-4e1f-ab7a-87ac683ec3fe",
    "order_id": "e2556396-e7bc-4248-938b-d0187a229d37",
    "expires_at": "2026-10-30T23:07:19.443468Z",
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

`POST /api/driver/v1/offers/0874d2aa-c741-4e1f-ab7a-87ac683ec3fe/accept` → **200**

```json
{
  "command_id": "9b31db4f-ebb5-4458-9a01-d4f68e930d53"
}
```

```json
{
  "id": "bf5e9850-a158-4ee7-ba46-d0d46501d29f",
  "order_id": "e2556396-e7bc-4248-938b-d0187a229d37",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "483b9c6b-a4a4-4f63-8af4-8f4810c6d112",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "483b9c6b-a4a4-4f63-8af4-8f4810c6d112",
  "order_id": "e2556396-e7bc-4248-938b-d0187a229d37",
  "assignment_id": "bf5e9850-a158-4ee7-ba46-d0d46501d29f",
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

`POST /api/driver/v1/work-sessions/e9371664-7e33-4a4d-b8ae-203e07fdf327/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T23:07:09Z",
    "sequence": 1793401629300
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "e9371664-7e33-4a4d-b8ae-203e07fdf327",
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
  "last_heartbeat_at": "2026-10-30T23:07:09.316457Z",
  "last_location_at": "2026-10-30T23:07:09.316457Z",
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
  "id": "483b9c6b-a4a4-4f63-8af4-8f4810c6d112",
  "order_id": "e2556396-e7bc-4248-938b-d0187a229d37",
  "assignment_id": "bf5e9850-a158-4ee7-ba46-d0d46501d29f",
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

`POST /api/driver/v1/trips/483b9c6b-a4a4-4f63-8af4-8f4810c6d112/arrive` → **200**

```json
{
  "command_id": "e97087f1-5a94-412d-945a-0c19adeaaba1",
  "expected_version": 0
}
```

```json
{
  "id": "483b9c6b-a4a4-4f63-8af4-8f4810c6d112",
  "order_id": "e2556396-e7bc-4248-938b-d0187a229d37",
  "assignment_id": "bf5e9850-a158-4ee7-ba46-d0d46501d29f",
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
  "arrived_at": "2026-10-30T23:07:09.722668Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/483b9c6b-a4a4-4f63-8af4-8f4810c6d112/start` → **200**

```json
{
  "command_id": "b37042b8-425c-4b99-8fda-c4fa984fa607",
  "expected_version": 1
}
```

```json
{
  "id": "483b9c6b-a4a4-4f63-8af4-8f4810c6d112",
  "order_id": "e2556396-e7bc-4248-938b-d0187a229d37",
  "assignment_id": "bf5e9850-a158-4ee7-ba46-d0d46501d29f",
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
  "arrived_at": "2026-10-30T23:07:09.722668Z",
  "started_at": "2026-10-30T23:07:09.930984Z",
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
  "command_id": "d17f2988-dcae-460f-ad59-6f2b86539c07",
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
  "session_id": "e9371664-7e33-4a4d-b8ae-203e07fdf327",
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
  "last_heartbeat_at": "2026-10-30T23:07:09.316457Z",
  "last_location_at": "2026-10-30T23:07:09.316457Z",
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
  "id": "483b9c6b-a4a4-4f63-8af4-8f4810c6d112",
  "order_id": "e2556396-e7bc-4248-938b-d0187a229d37",
  "assignment_id": "bf5e9850-a158-4ee7-ba46-d0d46501d29f",
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
  "arrived_at": "2026-10-30T23:07:09.722668Z",
  "started_at": "2026-10-30T23:07:09.930984Z",
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
  "command_id": "fd4ee10d-3786-4ddd-9891-afa63f4114d5",
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
  "correlation_id": "277125a4-9a07-48e7-a66a-679f2627f589"
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
  "correlation_id": "bbbfb1f2-f364-4a1c-82a1-9007861d9a28"
}
```

## He completes the trip and writes to support

(the car drives 47 s to the next point)

`POST /api/driver/v1/work-sessions/e9371664-7e33-4a4d-b8ae-203e07fdf327/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T23:07:58Z",
    "sequence": 1793401678597
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "e9371664-7e33-4a4d-b8ae-203e07fdf327",
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
  "last_heartbeat_at": "2026-10-30T23:07:58.613495Z",
  "last_location_at": "2026-10-30T23:07:58.613495Z",
  "eligible": false,
  "ineligible_reasons": [
    "ACCOUNT_BLOCKED",
    "INTENT_PAUSE_AFTER_CURRENT",
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/483b9c6b-a4a4-4f63-8af4-8f4810c6d112/complete` → **200**

```json
{
  "command_id": "0bba8699-4dd6-48a7-a713-e2836d556114",
  "expected_version": 2,
  "reported_at": "2026-10-30T23:07:58Z",
  "cash_received": true
}
```

```json
{
  "id": "483b9c6b-a4a4-4f63-8af4-8f4810c6d112",
  "order_id": "e2556396-e7bc-4248-938b-d0187a229d37",
  "assignment_id": "bf5e9850-a158-4ee7-ba46-d0d46501d29f",
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
  "arrived_at": "2026-10-30T23:07:09.722668Z",
  "started_at": "2026-10-30T23:07:09.930984Z",
  "completed_at": "2026-10-30T23:07:58.815699Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/support/cases` → **201**

```json
{
  "command_id": "b77f054d-c2b2-45e0-a010-a1d2d68d1248",
  "category": "OTHER",
  "subject": "Why is my account blocked?",
  "message": "Please explain."
}
```

```json
{
  "id": "a796039b-2616-4fae-9f03-af09fc8ce2d5",
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
  "created_at": "2026-10-30T23:07:59.023269Z",
  "updated_at": "2026-10-30T23:07:59.023269Z",
  "respond_by": "2026-10-31T03:07:59.023269Z",
  "messages": [
    {
      "id": "28e818d6-f243-480f-bd0c-49fc5fd0d689",
      "sequence": 1,
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000403",
      "visibility": "PUBLIC",
      "body": "Please explain.",
      "created_at": "2026-10-30T23:07:59.024521Z",
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
      "id": "483b9c6b-a4a4-4f63-8af4-8f4810c6d112",
      "order_id": "e2556396-e7bc-4248-938b-d0187a229d37",
      "order_short_number": 14,
      "created_at": "2026-10-30T23:07:04.887111Z",
      "pickup_label": "Майдан",
      "dropoff_label": "Вокзал",
      "final_price_minor": 10517,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "COMPLETED"
    },
    {
      "id": "127d8441-9fe5-452d-9e12-9de85d08be1a",
      "order_id": "0e855860-f5ae-4c66-ac6b-eb231120e737",
      "order_short_number": 11,
      "created_at": "2026-10-30T23:03:26.130246Z",
      "pickup_label": "вул. Дмитрівська",
      "dropoff_label": "Нивки",
      "final_price_minor": 16297,
      "currency": "UAH",
      "payment_method": "CARD",
      "phase": "COMPLETED"
    },
    {
      "id": "d7d19359-1598-4c55-9492-a02d50c72247",
      "order_id": "f4fe2f3c-9c20-4b58-995c-9b573524b425",
      "order_short_number": 9,
      "created_at": "2026-10-30T23:03:05.871994Z",
      "pickup_label": "вул. Дмитрівська",
      "dropoff_label": "Нивки",
      "final_price_minor": 16297,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "COMPLETED"
    },
    {
      "id": "5c523346-fb84-413f-b3be-c72793186a4f",
      "order_id": "5289ad49-c171-4038-9138-7dfb8d0d1dad",
      "order_short_number": 8,
      "created_at": "2026-10-30T23:02:50.613005Z",
      "pickup_label": "вул. Дмитрівська",
      "dropoff_label": "Нивки",
      "final_price_minor": 16297,
      "currency": "UAH",
      "payment_method": "CARD",
      "phase": "COMPLETED"
    },
    {
      "id": "084a8bf6-809d-43cd-9b6b-d7405c11d344",
      "order_id": "fcf6a1e3-4f96-4a8c-80bf-de5f8986476c",
      "order_short_number": 7,
      "created_at": "2026-10-30T23:02:01.427979Z",
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
  "session_id": "e9371664-7e33-4a4d-b8ae-203e07fdf327",
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
  "last_heartbeat_at": "2026-10-30T23:07:58.613495Z",
  "last_location_at": "2026-10-30T23:07:58.613495Z",
  "eligible": false,
  "ineligible_reasons": [
    "ACCOUNT_BLOCKED",
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/work-sessions/e9371664-7e33-4a4d-b8ae-203e07fdf327/resume` → **403**

```json
{
  "command_id": "439d7e63-0896-43fd-b513-7d888f95d76e",
  "expected_version": 2
}
```

```json
{
  "instance": "/api/driver/v1/work-sessions/e9371664-7e33-4a4d-b8ae-203e07fdf327/resume",
  "status": 403,
  "title": "Account blocked",
  "type": "https://errors.blizz.taxi/account-blocked",
  "code": "ACCOUNT_BLOCKED",
  "correlation_id": "3ad0dbe5-d087-42bf-9405-50a5ba663219"
}
```

(the car drives 47 s to the next point)

`POST /api/driver/v1/work-sessions/e9371664-7e33-4a4d-b8ae-203e07fdf327/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4528,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T23:08:49Z",
    "sequence": 1793401729866
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "e9371664-7e33-4a4d-b8ae-203e07fdf327",
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
  "last_heartbeat_at": "2026-10-30T23:08:49.881824Z",
  "last_location_at": "2026-10-30T23:08:49.881824Z",
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
  "command_id": "21a472c0-f422-4bfd-92e1-50d301c086f9",
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
  "id": "31dc7114-63a5-4376-82ce-b0e3a0c1dd1f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T23:13:50.068478Z",
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
  "command_id": "9423699b-10c2-4d76-9bea-04eba0e22f06",
  "quote_id": "31dc7114-63a5-4376-82ce-b0e3a0c1dd1f",
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
  "id": "4a00a39b-d513-4c15-8bfd-a64bb62e2be5",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c83b6899-511a-4840-9c09-647a7d99d329",
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
  "created_at": "2026-10-30T23:08:50.263779Z",
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
  "correlation_id": "c2ce2e41-82be-4959-be11-dd9c11489926"
}
```

`GET /api/operator/v1/orders/4a00a39b-d513-4c15-8bfd-a64bb62e2be5` → **200**

```json
{
  "id": "4a00a39b-d513-4c15-8bfd-a64bb62e2be5",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c83b6899-511a-4840-9c09-647a7d99d329",
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
  "created_at": "2026-10-30T23:08:50.263779Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

Done: blocked on trip 483b9c6b-a4a4-4f63-8af4-8f4810c6d112, Andrii completed it and reached support; new work answered ACCOUNT_BLOCKED.

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
  "command_id": "32b5c57e-c8d7-4ddf-b960-d4bf0988d856",
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

`GET /api/operator/v1/orders/e2556396-e7bc-4248-938b-d0187a229d37` → **200**

```json
{
  "id": "e2556396-e7bc-4248-938b-d0187a229d37",
  "short_number": 14,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "c83b6899-511a-4840-9c09-647a7d99d329",
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
    "id": "bf5e9850-a158-4ee7-ba46-d0d46501d29f",
    "order_id": "e2556396-e7bc-4248-938b-d0187a229d37",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "483b9c6b-a4a4-4f63-8af4-8f4810c6d112",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T23:07:04.441067Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/4a00a39b-d513-4c15-8bfd-a64bb62e2be5` → **200**

```json
{
  "id": "4a00a39b-d513-4c15-8bfd-a64bb62e2be5",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c83b6899-511a-4840-9c09-647a7d99d329",
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
  "created_at": "2026-10-30T23:08:50.263779Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/4a00a39b-d513-4c15-8bfd-a64bb62e2be5/cancel` → **200**

```json
{
  "command_id": "ade400bb-4249-4a22-b09e-6caabc33b9c7",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "4a00a39b-d513-4c15-8bfd-a64bb62e2be5",
  "short_number": 15,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "c83b6899-511a-4840-9c09-647a7d99d329",
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
  "created_at": "2026-10-30T23:08:50.263779Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "ru": "Нет свободных машин",
      "pl": "Brak wolnych aut",
      "uk": "Немає вільних авто",
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
  "session_id": "e9371664-7e33-4a4d-b8ae-203e07fdf327",
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
  "last_heartbeat_at": "2026-10-30T23:08:49.881824Z",
  "last_location_at": "2026-10-30T23:08:49.881824Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/work-sessions/e9371664-7e33-4a4d-b8ae-203e07fdf327/close` → **200**

```json
{
  "command_id": "53beedc3-4c8b-4e50-a66f-aa0b632cac70",
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
  "device_ref": "sandbox-23048"
}
```

```json
{
  "challenge_id": "f9cbf91b-c36d-4209-ada6-5e9a5475947b",
  "expires_at": "2026-10-30T23:13:52.257438816Z",
  "resend_available_at": "2026-10-30T23:08:53.257438816Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "012817",
  "sent_at": "2026-10-30T23:08:52.259316641Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f9cbf91b-c36d-4209-ada6-5e9a5475947b",
  "code": "012817",
  "device_ref": "sandbox-23048"
}
```

```json
{
  "session_id": "c4fcb895-26db-4958-9b42-dc3c07bf91cd",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwMjYzMiwiaWF0IjoxNzkzNDAxNzMyLCJqdGkiOiI3ZTEwMDk0Yy0xMDA4LTQ5MTEtODc3Zi0wNGYzMGEwODZjOTAiLCJzaWQiOiJjNGZjYjg5NS0yNmRiLTQ5NTgtOWI0Mi1kYzNjMDdiZjkxY2QifQ.Oj-kAx_Pe5G-bTJF_EtXhT4Wz46fqKuRnRbrEeAogcA",
  "access_expires_at": "2026-10-30T23:23:52.466417167Z",
  "refresh_token": "lS9t7Eb4DrgmXfmfluQeoJgeVVFr-hLZlcZMNPS0lZs",
  "refresh_expires_at": "2026-11-29T23:08:52.465866321Z",
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
  "device_ref": "sandbox-17278"
}
```

```json
{
  "challenge_id": "e29271d2-b682-4cd6-a961-d072eb9da68d",
  "expires_at": "2026-10-30T23:13:52.832981401Z",
  "resend_available_at": "2026-10-30T23:08:53.832981401Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "743305",
  "sent_at": "2026-10-30T23:08:52.835077427Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e29271d2-b682-4cd6-a961-d072eb9da68d",
  "code": "743305",
  "device_ref": "sandbox-17278"
}
```

```json
{
  "session_id": "712f979a-4e8f-4ca3-8312-b531f9a77b2a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwMjYzMywiaWF0IjoxNzkzNDAxNzMzLCJqdGkiOiI4NmZlMThhYS1mYjI2LTRlMDAtYTQxZC1iMDA0YzliNTZlZjgiLCJzaWQiOiI3MTJmOTc5YS00ZThmLTRjYTMtODMxMi1iNTMxZjlhNzdiMmEifQ.Mhcvj1GSL8WsTquHOii9LtP5Ly22AUYRJIqfZoSFKgY",
  "access_expires_at": "2026-10-30T23:23:53.034084044Z",
  "refresh_token": "6S5tZuBtTOHK-YE9lUmaiY6bQz8A2QIkBmRBXBoyv64",
  "refresh_expires_at": "2026-11-29T23:08:53.03363152Z",
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
  "command_id": "d3922aee-9592-40f6-88eb-fd19df68ea7a",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T23:08:53Z",
    "sequence": 1793401733419
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9637ebfe-06ee-4699-9167-9afc94f66666",
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
  "last_heartbeat_at": "2026-10-30T23:08:53.434629Z",
  "last_location_at": "2026-10-30T23:08:53.434629Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-15341"
}
```

```json
{
  "challenge_id": "32f328f1-1cd2-459b-8298-50e9165758b1",
  "expires_at": "2026-10-30T23:13:53.62889949Z",
  "resend_available_at": "2026-10-30T23:08:54.62889949Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "269302",
  "sent_at": "2026-10-30T23:08:53.630771471Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "32f328f1-1cd2-459b-8298-50e9165758b1",
  "code": "269302",
  "device_ref": "sandbox-15341"
}
```

```json
{
  "session_id": "98aa3b2b-cbef-46e2-91bf-6c731d1c8a46",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwMjYzMywiaWF0IjoxNzkzNDAxNzMzLCJqdGkiOiIwZjAwYjJlOC1iMjE4LTRlNTYtYTg0Yy01NjNmZDI3M2YwN2IiLCJzaWQiOiI5OGFhM2IyYi1jYmVmLTQ2ZTItOTFiZi02YzczMWQxYzhhNDYifQ.eH9ML5ZmHb9RJNhFVs1_Bgtcc56gGTHM6z08zMyR5sg",
  "access_expires_at": "2026-10-30T23:23:53.840315179Z",
  "refresh_token": "CE2bS-15aaYsKyAM-a199NCH3aJakYDvUmN56dSUoiM",
  "refresh_expires_at": "2026-11-29T23:08:53.839664646Z",
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
  "command_id": "78736a60-234f-4d65-b415-d129c99e534f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T23:08:54Z",
    "sequence": 1793401734229
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "620dc41a-eaa3-4fa4-964f-213cb343207e",
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
  "last_heartbeat_at": "2026-10-30T23:08:54.254619Z",
  "last_location_at": "2026-10-30T23:08:54.254619Z",
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
  "session_id": "3a49a111-b6fe-476a-ae7a-ef89b79f9d7b",
  "subject": {
    "type": "STAFF",
    "id": "c66269c2-93bc-421d-8af2-6f0cafc54be4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjYyNjljMi05M2JjLTQyMWQtOGFmMi02ZjBjYWZjNTRiZTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDI2MzQsImlhdCI6MTc5MzQwMTczNCwianRpIjoiMDE3NjEzOWEtYzU2NS00YjExLTkzZjEtZDMwNDg2OTg2NDYyIiwic2lkIjoiM2E0OWExMTEtYjZmZS00NzZhLWFlN2EtZWY4OWI3OWY5ZDdiIn0.ZtUPMhc9XlwTuwkmWujBmqccoxUFrMLaM9WxWYuxhnM",
  "access_expires_at": "2026-10-30T23:23:54.643351438Z",
  "refresh_token": "97GLl-K4wMbSGOIPa2Ea9HNpIc9kUbjRCQWZp_ueOQ0",
  "refresh_expires_at": "2026-10-31T11:08:54.642920502Z",
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
  "session_id": "0080448f-15cf-4d9c-80a2-65ee96f47be3",
  "subject": {
    "type": "STAFF",
    "id": "c66269c2-93bc-421d-8af2-6f0cafc54be4"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjYyNjljMi05M2JjLTQyMWQtOGFmMi02ZjBjYWZjNTRiZTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDI2MzUsImlhdCI6MTc5MzQwMTczNSwianRpIjoiMjRkZDFmMDEtOGYzNC00MjFlLThkZTctYzg1YTk5M2RjOWI3Iiwic2lkIjoiMDA4MDQ0OGYtMTVjZi00ZDljLTgwYTItNjVlZTk2ZjQ3YmUzIn0.15wXh2O8MjQ2VLvJAZU-DZ8YExieWGx-7VekP-nwxYw",
  "access_expires_at": "2026-10-30T23:23:55.033372871Z",
  "refresh_token": "YW8CJlBNv1kIFqp1-fWZf8wz0kzFtsucDIDejkJq5Tc",
  "refresh_expires_at": "2026-10-31T11:08:55.032970492Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380685106911",
  "device_ref": "sandbox-14893"
}
```

```json
{
  "challenge_id": "845c0d04-68f7-4737-ab6a-9ecadaaee624",
  "expires_at": "2026-10-30T23:13:55.221651339Z",
  "resend_available_at": "2026-10-30T23:08:56.221651339Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380685106911` → **200**

```json
{
  "phone": "+380685106911",
  "audience": "CLIENT",
  "code": "142103",
  "sent_at": "2026-10-30T23:08:55.223599719Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "845c0d04-68f7-4737-ab6a-9ecadaaee624",
  "code": "142103",
  "device_ref": "sandbox-14893"
}
```

```json
{
  "session_id": "cc25951f-4117-4e2f-b098-6255b45f8474",
  "subject": {
    "type": "CLIENT",
    "id": "9a0cb83e-f0fe-4257-9685-48462f001dd5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YTBjYjgzZS1mMGZlLTQyNTctOTY4NS00ODQ2MmYwMDFkZDUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDAyNjM1LCJpYXQiOjE3OTM0MDE3MzUsImp0aSI6IjVkMzE3MGE2LTM5ZjAtNGRkZi1iYWI1LWJmNDUwYzkzM2Q1OSIsInNpZCI6ImNjMjU5NTFmLTQxMTctNGUyZi1iMDk4LTYyNTViNDVmODQ3NCJ9.WJ9KGtwaCZFK5tvlUMyN50sP40pdFnocd85S9Mg4FOo",
  "access_expires_at": "2026-10-30T23:23:55.435273579Z",
  "refresh_token": "cazKdGTYPrY_R5zs_PefRfXBlBbsgPtWqaLjD6KKhAM",
  "refresh_expires_at": "2026-11-29T23:08:55.434941915Z",
  "account_created": true
}
```

## E2: Near has the offer and pauses: the offer is revoked and Far gets the order at once

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8f55939e-d94a-4db8-a00b-d2e1cd70283b",
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
  "id": "3efaaa9d-75c3-4df4-92f1-20d3e6b75645",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T23:13:55.638174Z",
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
  "command_id": "d9e78329-6fae-4d48-a2b7-dfaa6430c917",
  "quote_id": "3efaaa9d-75c3-4df4-92f1-20d3e6b75645",
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
  "id": "6eeeff6d-5a00-4578-bd11-4e6b3d3127f6",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9a0cb83e-f0fe-4257-9685-48462f001dd5",
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
  "created_at": "2026-10-30T23:08:55.843483Z",
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
    "id": "b166df89-e927-4402-a56e-4d5e47862af5",
    "order_id": "6eeeff6d-5a00-4578-bd11-4e6b3d3127f6",
    "expires_at": "2026-10-30T23:09:10.845583Z",
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
  "session_id": "9637ebfe-06ee-4699-9167-9afc94f66666",
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
  "last_heartbeat_at": "2026-10-30T23:08:53.434629Z",
  "last_location_at": "2026-10-30T23:08:53.434629Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

`POST /api/driver/v1/work-sessions/9637ebfe-06ee-4699-9167-9afc94f66666/pause` → **200**

```json
{
  "command_id": "35d4af32-58d6-4cb1-9ffd-650a129fcade",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9637ebfe-06ee-4699-9167-9afc94f66666",
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
  "last_heartbeat_at": "2026-10-30T23:08:53.434629Z",
  "last_location_at": "2026-10-30T23:08:53.434629Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/offers/b166df89-e927-4402-a56e-4d5e47862af5/accept` → **409**

```json
{
  "command_id": "ef2b2dfd-8922-4f22-8535-ba58eef85419"
}
```

```json
{
  "instance": "/api/driver/v1/offers/b166df89-e927-4402-a56e-4d5e47862af5/accept",
  "status": 409,
  "title": "Offer revoked",
  "type": "https://errors.blizz.taxi/offer-revoked",
  "code": "OFFER_REVOKED",
  "correlation_id": "84ef64e2-a347-4556-b843-6801f765a0c0"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "28577b5a-4115-43ef-8ba1-eaf1376b07ed",
    "order_id": "6eeeff6d-5a00-4578-bd11-4e6b3d3127f6",
    "expires_at": "2026-10-30T23:09:11.439538Z",
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

`POST /api/driver/v1/offers/28577b5a-4115-43ef-8ba1-eaf1376b07ed/reject` → **204**

```json
{
  "command_id": "905f6b3b-a876-473d-bbf4-f6fa06cbff3c"
}
```

`GET /api/operator/v1/orders/6eeeff6d-5a00-4578-bd11-4e6b3d3127f6/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T23:08:55.84384Z",
      "actor": {
        "type": "CLIENT",
        "id": "9a0cb83e-f0fe-4257-9685-48462f001dd5",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "6eeeff6d-5a00-4578-bd11-4e6b3d3127f6",
        "quote_id": "3efaaa9d-75c3-4df4-92f1-20d3e6b75645",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "b6b828e4-c20f-4263-b2d1-c45afd8cb134"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T23:08:55.845108Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "6eeeff6d-5a00-4578-bd11-4e6b3d3127f6",
        "attempt_id": "cae8a1d1-4058-4c83-88cd-f6e5223bff9e",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "b6b828e4-c20f-4263-b2d1-c45afd8cb134"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T23:08:55.847491Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "b166df89-e927-4402-a56e-4d5e47862af5",
        "order_id": "6eeeff6d-5a00-4578-bd11-4e6b3d3127f6",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200,
        "expires_at": "2026-10-30T23:09:10.845582811Z"
      },
      "correlation_id": "b6b828e4-c20f-4263-b2d1-c45afd8cb134"
    },
    {
      "sequence": 3,
      "type": "OfferRevoked",
      "occurred_at": "2026-10-30T23:08:56.438954Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": "DRIVER_PAUSED",
      "details": {
        "reason": "DRIVER_PAUSED",
        "offer_id": "b166df89-e927-4402-a56e-4d5e47862af5",
        "order_id": "6eeeff6d-5a00-4578-bd11-4e6b3d3127f6",
        "driver_id": "5a000000-0000-4000-8000-000000000401"
      },
      "correlation_id": "3ce5d3a2-58fe-4d0e-bf15-3d992c9d6ab2"
```

`GET /api/operator/v1/orders/6eeeff6d-5a00-4578-bd11-4e6b3d3127f6` → **200**

```json
{
  "id": "6eeeff6d-5a00-4578-bd11-4e6b3d3127f6",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "9a0cb83e-f0fe-4257-9685-48462f001dd5",
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
  "created_at": "2026-10-30T23:08:55.843483Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/6eeeff6d-5a00-4578-bd11-4e6b3d3127f6/cancel` → **200**

```json
{
  "command_id": "1d2eae4e-5e6e-4508-b065-6193789759e3",
  "expected_version": 6,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "6eeeff6d-5a00-4578-bd11-4e6b3d3127f6",
  "short_number": 16,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 7,
  "channel": "APP",
  "payer_client_id": "9a0cb83e-f0fe-4257-9685-48462f001dd5",
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
  "created_at": "2026-10-30T23:08:55.843483Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "ru": "Нет свободных машин",
      "pl": "Brak wolnych aut",
      "uk": "Немає вільних авто",
      "en": "No cars available"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

E2: offer b166df89-e927-4402-a56e-4d5e47862af5 revoked by the pause, the late accept got OFFER_REVOKED, Far had the order next.

## E5: pause and accept sent at the same moment, five rounds; Far is offline so each order goes to Near

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "620dc41a-eaa3-4fa4-964f-213cb343207e",
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
  "last_heartbeat_at": "2026-10-30T23:08:54.254619Z",
  "last_location_at": "2026-10-30T23:08:54.254619Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/620dc41a-eaa3-4fa4-964f-213cb343207e/close` → **200**

```json
{
  "command_id": "7e561dbc-a270-45c2-812f-096aff2f67ea",
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
  "session_id": "9637ebfe-06ee-4699-9167-9afc94f66666",
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
  "last_heartbeat_at": "2026-10-30T23:08:53.434629Z",
  "last_location_at": "2026-10-30T23:08:53.434629Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/work-sessions/9637ebfe-06ee-4699-9167-9afc94f66666/resume` → **200**

```json
{
  "command_id": "655da6f2-2dae-4fd6-8098-7144b3864874",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9637ebfe-06ee-4699-9167-9afc94f66666",
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
  "last_heartbeat_at": "2026-10-30T23:08:53.434629Z",
  "last_location_at": "2026-10-30T23:08:53.434629Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9637ebfe-06ee-4699-9167-9afc94f66666/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T23:08:58Z",
    "sequence": 1793401738530
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9637ebfe-06ee-4699-9167-9afc94f66666",
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
  "last_heartbeat_at": "2026-10-30T23:08:58.545194Z",
  "last_location_at": "2026-10-30T23:08:58.545194Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "998ecde9-a372-4863-af4f-40dda4168953",
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
  "id": "e31caf34-ac6a-4389-a620-d2481276dfcd",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T23:13:58.750964Z",
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
  "command_id": "0ec27548-c027-47ff-a22a-8eaf5d87ba08",
  "quote_id": "e31caf34-ac6a-4389-a620-d2481276dfcd",
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
  "id": "dbd530b1-2687-4856-a67e-0ffa2a1e8411",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9a0cb83e-f0fe-4257-9685-48462f001dd5",
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
  "created_at": "2026-10-30T23:08:58.95805Z",
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
    "id": "3bf8cb6c-1d49-48c0-9d96-255afc7a9ba9",
    "order_id": "dbd530b1-2687-4856-a67e-0ffa2a1e8411",
    "expires_at": "2026-10-30T23:09:13.960058Z",
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
  "session_id": "9637ebfe-06ee-4699-9167-9afc94f66666",
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
  "last_heartbeat_at": "2026-10-30T23:08:58.545194Z",
  "last_location_at": "2026-10-30T23:08:58.545194Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

Round 1, at the same moment:

`POST /api/driver/v1/offers/3bf8cb6c-1d49-48c0-9d96-255afc7a9ba9/accept` → **200**

```json
{
  "id": "06bd90d9-8452-4a1d-90f4-1de3ed168433",
  "order_id": "dbd530b1-2687-4856-a67e-0ffa2a1e8411",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "5baaec14-c5ad-4649-8e74-eb2378c0b26c",
  "trip_phase": "TO_PICKUP"
}
```

`POST /api/driver/v1/work-sessions/9637ebfe-06ee-4699-9167-9afc94f66666/pause` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9637ebfe-06ee-4699-9167-9afc94f66666",
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
  "last_heartbeat_at": "2026-10-30T23:08:58.545194Z",
  "last_location_at": "2026-10-30T23:08:58.545194Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_PAUSE_AFTER_CURRENT",
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

Round 1: the accept won; the pause waits for the end of the trip.

`GET /api/operator/v1/orders/dbd530b1-2687-4856-a67e-0ffa2a1e8411` → **200**

```json
{
  "id": "dbd530b1-2687-4856-a67e-0ffa2a1e8411",
  "short_number": 17,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "9a0cb83e-f0fe-4257-9685-48462f001dd5",
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
    "id": "06bd90d9-8452-4a1d-90f4-1de3ed168433",
    "order_id": "dbd530b1-2687-4856-a67e-0ffa2a1e8411",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "5baaec14-c5ad-4649-8e74-eb2378c0b26c",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T23:08:58.95805Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/dbd530b1-2687-4856-a67e-0ffa2a1e8411` → **200**

```json
{
  "id": "dbd530b1-2687-4856-a67e-0ffa2a1e8411",
  "short_number": 17,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "9a0cb83e-f0fe-4257-9685-48462f001dd5",
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
    "id": "06bd90d9-8452-4a1d-90f4-1de3ed168433",
    "order_id": "dbd530b1-2687-4856-a67e-0ffa2a1e8411",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "5baaec14-c5ad-4649-8e74-eb2378c0b26c",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T23:08:58.95805Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/dbd530b1-2687-4856-a67e-0ffa2a1e8411/cancel` → **200**

```json
{
  "command_id": "93f5df93-50b4-432a-ac37-f880ac0b5177",
  "expected_version": 3,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "dbd530b1-2687-4856-a67e-0ffa2a1e8411",
  "short_number": 17,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "9a0cb83e-f0fe-4257-9685-48462f001dd5",
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
    "id": "06bd90d9-8452-4a1d-90f4-1de3ed168433",
    "order_id": "dbd530b1-2687-4856-a67e-0ffa2a1e8411",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "5baaec14-c5ad-4649-8e74-eb2378c0b26c",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T23:08:58.95805Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "ru": "Нет свободных машин",
      "pl": "Brak wolnych aut",
      "uk": "Немає вільних авто",
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
  "session_id": "9637ebfe-06ee-4699-9167-9afc94f66666",
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
  "last_heartbeat_at": "2026-10-30T23:08:58.545194Z",
  "last_location_at": "2026-10-30T23:08:58.545194Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/work-sessions/9637ebfe-06ee-4699-9167-9afc94f66666/resume` → **200**

```json
{
  "command_id": "44e151b2-4da4-4c73-a455-ac43e0fc8403",
  "expected_version": 4
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9637ebfe-06ee-4699-9167-9afc94f66666",
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
  "last_heartbeat_at": "2026-10-30T23:08:58.545194Z",
  "last_location_at": "2026-10-30T23:08:58.545194Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9637ebfe-06ee-4699-9167-9afc94f66666/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T23:09:00Z",
    "sequence": 1793401740628
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9637ebfe-06ee-4699-9167-9afc94f66666",
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
  "last_heartbeat_at": "2026-10-30T23:09:00.643822Z",
  "last_location_at": "2026-10-30T23:09:00.643822Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "5b929b83-cbc8-4cd9-944e-56c6eb3aa181",
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
  "id": "92ff3046-5bcf-400d-9552-d35da535c12c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T23:14:00.841463Z",
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
  "command_id": "6031a50d-98c2-4c9f-b72e-1ee47248e3e3",
  "quote_id": "92ff3046-5bcf-400d-9552-d35da535c12c",
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
  "id": "02e8dae9-5566-43a0-8952-9c94ca5d57d5",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9a0cb83e-f0fe-4257-9685-48462f001dd5",
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
  "created_at": "2026-10-30T23:09:01.042805Z",
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
    "id": "117217e6-39f6-4206-8937-a19686808790",
    "order_id": "02e8dae9-5566-43a0-8952-9c94ca5d57d5",
    "expires_at": "2026-10-30T23:09:16.045004Z",
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
  "session_id": "9637ebfe-06ee-4699-9167-9afc94f66666",
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
  "last_heartbeat_at": "2026-10-30T23:09:00.643822Z",
  "last_location_at": "2026-10-30T23:09:00.643822Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

Round 2, at the same moment:

`POST /api/driver/v1/offers/117217e6-39f6-4206-8937-a19686808790/accept` → **200**

```json
{
  "id": "9c3f33fa-0896-49bd-9913-bd64dfd0bdab",
  "order_id": "02e8dae9-5566-43a0-8952-9c94ca5d57d5",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d970c011-a4e7-42ed-ba53-09fb880cfcfd",
  "trip_phase": "TO_PICKUP"
}
```

`POST /api/driver/v1/work-sessions/9637ebfe-06ee-4699-9167-9afc94f66666/pause` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9637ebfe-06ee-4699-9167-9afc94f66666",
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
  "last_heartbeat_at": "2026-10-30T23:09:00.643822Z",
  "last_location_at": "2026-10-30T23:09:00.643822Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_PAUSE_AFTER_CURRENT",
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

Round 2: the accept won; the pause waits for the end of the trip.

`GET /api/operator/v1/orders/02e8dae9-5566-43a0-8952-9c94ca5d57d5` → **200**

```json
{
  "id": "02e8dae9-5566-43a0-8952-9c94ca5d57d5",
  "short_number": 18,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "9a0cb83e-f0fe-4257-9685-48462f001dd5",
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
    "id": "9c3f33fa-0896-49bd-9913-bd64dfd0bdab",
    "order_id": "02e8dae9-5566-43a0-8952-9c94ca5d57d5",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "d970c011-a4e7-42ed-ba53-09fb880cfcfd",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T23:09:01.042805Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/02e8dae9-5566-43a0-8952-9c94ca5d57d5` → **200**

```json
{
  "id": "02e8dae9-5566-43a0-8952-9c94ca5d57d5",
  "short_number": 18,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "9a0cb83e-f0fe-4257-9685-48462f001dd5",
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
    "id": "9c3f33fa-0896-49bd-9913-bd64dfd0bdab",
    "order_id": "02e8dae9-5566-43a0-8952-9c94ca5d57d5",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "d970c011-a4e7-42ed-ba53-09fb880cfcfd",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T23:09:01.042805Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/02e8dae9-5566-43a0-8952-9c94ca5d57d5/cancel` → **200**

```json
{
  "command_id": "b057c03d-1b77-4d2a-a3e6-5cb8f7ae4fbe",
  "expected_version": 3,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "02e8dae9-5566-43a0-8952-9c94ca5d57d5",
  "short_number": 18,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "9a0cb83e-f0fe-4257-9685-48462f001dd5",
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
    "id": "9c3f33fa-0896-49bd-9913-bd64dfd0bdab",
    "order_id": "02e8dae9-5566-43a0-8952-9c94ca5d57d5",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "d970c011-a4e7-42ed-ba53-09fb880cfcfd",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T23:09:01.042805Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "ru": "Нет свободных машин",
      "pl": "Brak wolnych aut",
      "uk": "Немає вільних авто",
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
  "session_id": "9637ebfe-06ee-4699-9167-9afc94f66666",
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
  "last_heartbeat_at": "2026-10-30T23:09:00.643822Z",
  "last_location_at": "2026-10-30T23:09:00.643822Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/work-sessions/9637ebfe-06ee-4699-9167-9afc94f66666/resume` → **200**

```json
{
  "command_id": "9be1642b-865c-4da4-b977-588bd7e4269f",
  "expected_version": 7
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9637ebfe-06ee-4699-9167-9afc94f66666",
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
  "last_heartbeat_at": "2026-10-30T23:09:00.643822Z",
  "last_location_at": "2026-10-30T23:09:00.643822Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9637ebfe-06ee-4699-9167-9afc94f66666/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T23:09:02Z",
    "sequence": 1793401742699
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9637ebfe-06ee-4699-9167-9afc94f66666",
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
  "last_heartbeat_at": "2026-10-30T23:09:02.714887Z",
  "last_location_at": "2026-10-30T23:09:02.714887Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d09c3382-8586-4501-9fa6-10b4abe58a86",
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
  "id": "e531953b-d978-4297-9539-fbfbd87bef3d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T23:14:02.923281Z",
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
  "command_id": "ff912742-3837-48f1-bfcf-a3131b0f7a3b",
  "quote_id": "e531953b-d978-4297-9539-fbfbd87bef3d",
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
  "id": "667581e0-747e-4a9b-b68a-cff018a2bdbb",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9a0cb83e-f0fe-4257-9685-48462f001dd5",
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
  "created_at": "2026-10-30T23:09:03.128323Z",
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
    "id": "eaa7115f-e8b2-4818-b8ff-cfdaac02592d",
    "order_id": "667581e0-747e-4a9b-b68a-cff018a2bdbb",
    "expires_at": "2026-10-30T23:09:18.131721Z",
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
  "session_id": "9637ebfe-06ee-4699-9167-9afc94f66666",
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
  "last_heartbeat_at": "2026-10-30T23:09:02.714887Z",
  "last_location_at": "2026-10-30T23:09:02.714887Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

Round 3, at the same moment:

`POST /api/driver/v1/offers/eaa7115f-e8b2-4818-b8ff-cfdaac02592d/accept` → **200**

```json
{
  "id": "b594435e-78db-4b49-b7a1-308ce4945789",
  "order_id": "667581e0-747e-4a9b-b68a-cff018a2bdbb",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e3482d5e-887a-482d-98bb-ab00a95ce4f3",
  "trip_phase": "TO_PICKUP"
}
```

`POST /api/driver/v1/work-sessions/9637ebfe-06ee-4699-9167-9afc94f66666/pause` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9637ebfe-06ee-4699-9167-9afc94f66666",
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
  "last_heartbeat_at": "2026-10-30T23:09:02.714887Z",
  "last_location_at": "2026-10-30T23:09:02.714887Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_PAUSE_AFTER_CURRENT",
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

Round 3: the accept won; the pause waits for the end of the trip.

`GET /api/operator/v1/orders/667581e0-747e-4a9b-b68a-cff018a2bdbb` → **200**

```json
{
  "id": "667581e0-747e-4a9b-b68a-cff018a2bdbb",
  "short_number": 19,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "9a0cb83e-f0fe-4257-9685-48462f001dd5",
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
    "id": "b594435e-78db-4b49-b7a1-308ce4945789",
    "order_id": "667581e0-747e-4a9b-b68a-cff018a2bdbb",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "e3482d5e-887a-482d-98bb-ab00a95ce4f3",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T23:09:03.128323Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/667581e0-747e-4a9b-b68a-cff018a2bdbb` → **200**

```json
{
  "id": "667581e0-747e-4a9b-b68a-cff018a2bdbb",
  "short_number": 19,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "9a0cb83e-f0fe-4257-9685-48462f001dd5",
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
    "id": "b594435e-78db-4b49-b7a1-308ce4945789",
    "order_id": "667581e0-747e-4a9b-b68a-cff018a2bdbb",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "e3482d5e-887a-482d-98bb-ab00a95ce4f3",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T23:09:03.128323Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/667581e0-747e-4a9b-b68a-cff018a2bdbb/cancel` → **200**

```json
{
  "command_id": "3514c183-0c94-459e-9346-650c18787a06",
  "expected_version": 3,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "667581e0-747e-4a9b-b68a-cff018a2bdbb",
  "short_number": 19,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "9a0cb83e-f0fe-4257-9685-48462f001dd5",
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
    "id": "b594435e-78db-4b49-b7a1-308ce4945789",
    "order_id": "667581e0-747e-4a9b-b68a-cff018a2bdbb",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "e3482d5e-887a-482d-98bb-ab00a95ce4f3",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T23:09:03.128323Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "ru": "Нет свободных машин",
      "pl": "Brak wolnych aut",
      "uk": "Немає вільних авто",
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
  "session_id": "9637ebfe-06ee-4699-9167-9afc94f66666",
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
  "last_heartbeat_at": "2026-10-30T23:09:02.714887Z",
  "last_location_at": "2026-10-30T23:09:02.714887Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/work-sessions/9637ebfe-06ee-4699-9167-9afc94f66666/resume` → **200**

```json
{
  "command_id": "0989a9b2-8f4c-4e9d-80f4-38b616b0afca",
  "expected_version": 10
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9637ebfe-06ee-4699-9167-9afc94f66666",
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
  "last_heartbeat_at": "2026-10-30T23:09:02.714887Z",
  "last_location_at": "2026-10-30T23:09:02.714887Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9637ebfe-06ee-4699-9167-9afc94f66666/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T23:09:04Z",
    "sequence": 1793401744799
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9637ebfe-06ee-4699-9167-9afc94f66666",
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
  "last_heartbeat_at": "2026-10-30T23:09:04.814749Z",
  "last_location_at": "2026-10-30T23:09:04.814749Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f6d454ab-52cb-45c9-9868-b19c1799e7d9",
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
  "id": "e3216419-1a8d-4e3a-b5ee-659fd4aa659f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T23:14:05.012442Z",
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
  "command_id": "0e527d37-160e-459d-add0-461b1d8f8a99",
  "quote_id": "e3216419-1a8d-4e3a-b5ee-659fd4aa659f",
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
  "id": "66b3cae6-47d2-4bdb-9f80-732f6cbf6c32",
  "short_number": 20,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9a0cb83e-f0fe-4257-9685-48462f001dd5",
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
  "created_at": "2026-10-30T23:09:05.215074Z",
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
    "id": "e48f8e68-d09d-48ec-b609-34a721734e45",
    "order_id": "66b3cae6-47d2-4bdb-9f80-732f6cbf6c32",
    "expires_at": "2026-10-30T23:09:20.217451Z",
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
  "session_id": "9637ebfe-06ee-4699-9167-9afc94f66666",
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
  "last_heartbeat_at": "2026-10-30T23:09:04.814749Z",
  "last_location_at": "2026-10-30T23:09:04.814749Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

Round 4, at the same moment:

`POST /api/driver/v1/offers/e48f8e68-d09d-48ec-b609-34a721734e45/accept` → **409**

```json
{
  "instance": "/api/driver/v1/offers/e48f8e68-d09d-48ec-b609-34a721734e45/accept",
  "status": 409,
  "title": "Offer revoked",
  "type": "https://errors.blizz.taxi/offer-revoked",
  "code": "OFFER_REVOKED",
  "correlation_id": "b5210065-9394-4de9-9c97-80c26c008821"
}
```

`POST /api/driver/v1/work-sessions/9637ebfe-06ee-4699-9167-9afc94f66666/pause` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9637ebfe-06ee-4699-9167-9afc94f66666",
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
  "last_heartbeat_at": "2026-10-30T23:09:04.814749Z",
  "last_location_at": "2026-10-30T23:09:04.814749Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

Round 4: the pause won; the accept got OFFER_REVOKED.

`GET /api/operator/v1/orders/66b3cae6-47d2-4bdb-9f80-732f6cbf6c32` → **200**

```json
{
  "id": "66b3cae6-47d2-4bdb-9f80-732f6cbf6c32",
  "short_number": 20,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "9a0cb83e-f0fe-4257-9685-48462f001dd5",
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
  "created_at": "2026-10-30T23:09:05.215074Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/66b3cae6-47d2-4bdb-9f80-732f6cbf6c32` → **200**

```json
{
  "id": "66b3cae6-47d2-4bdb-9f80-732f6cbf6c32",
  "short_number": 20,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "9a0cb83e-f0fe-4257-9685-48462f001dd5",
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
  "created_at": "2026-10-30T23:09:05.215074Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/66b3cae6-47d2-4bdb-9f80-732f6cbf6c32/cancel` → **200**

```json
{
  "command_id": "ec48fee3-cc8a-48bf-a6ce-2b0094803633",
  "expected_version": 4,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "66b3cae6-47d2-4bdb-9f80-732f6cbf6c32",
  "short_number": 20,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "9a0cb83e-f0fe-4257-9685-48462f001dd5",
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
  "created_at": "2026-10-30T23:09:05.215074Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "ru": "Нет свободных машин",
      "pl": "Brak wolnych aut",
      "uk": "Немає вільних авто",
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
  "session_id": "9637ebfe-06ee-4699-9167-9afc94f66666",
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
  "last_heartbeat_at": "2026-10-30T23:09:04.814749Z",
  "last_location_at": "2026-10-30T23:09:04.814749Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/work-sessions/9637ebfe-06ee-4699-9167-9afc94f66666/resume` → **200**

```json
{
  "command_id": "29c94584-8982-482d-aca4-83359d8bb539",
  "expected_version": 12
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9637ebfe-06ee-4699-9167-9afc94f66666",
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
  "last_heartbeat_at": "2026-10-30T23:09:04.814749Z",
  "last_location_at": "2026-10-30T23:09:04.814749Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9637ebfe-06ee-4699-9167-9afc94f66666/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T23:09:06Z",
    "sequence": 1793401746918
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9637ebfe-06ee-4699-9167-9afc94f66666",
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
  "last_heartbeat_at": "2026-10-30T23:09:06.934855Z",
  "last_location_at": "2026-10-30T23:09:06.934855Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "05b2195e-8845-4d50-a17b-a1974c769cb3",
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
  "id": "4607d053-25b5-43cf-8958-f756f06aa9bd",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T23:14:07.131342Z",
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
  "command_id": "c3241eb8-273d-4f5d-a8b6-3b4b83155266",
  "quote_id": "4607d053-25b5-43cf-8958-f756f06aa9bd",
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
  "id": "00857446-87b5-4a8d-94b1-c48692315c29",
  "short_number": 21,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9a0cb83e-f0fe-4257-9685-48462f001dd5",
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
  "created_at": "2026-10-30T23:09:07.340108Z",
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
    "id": "51bd64db-76d7-46f6-8d63-dc305a7f0249",
    "order_id": "00857446-87b5-4a8d-94b1-c48692315c29",
    "expires_at": "2026-10-30T23:09:22.342346Z",
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
  "session_id": "9637ebfe-06ee-4699-9167-9afc94f66666",
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
  "last_heartbeat_at": "2026-10-30T23:09:06.934855Z",
  "last_location_at": "2026-10-30T23:09:06.934855Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

Round 5, at the same moment:

`POST /api/driver/v1/offers/51bd64db-76d7-46f6-8d63-dc305a7f0249/accept` → **409**

```json
{
  "instance": "/api/driver/v1/offers/51bd64db-76d7-46f6-8d63-dc305a7f0249/accept",
  "status": 409,
  "title": "Offer revoked",
  "type": "https://errors.blizz.taxi/offer-revoked",
  "code": "OFFER_REVOKED",
  "correlation_id": "865db881-22a2-4fcf-b16d-b712a5fa6db5"
}
```

`POST /api/driver/v1/work-sessions/9637ebfe-06ee-4699-9167-9afc94f66666/pause` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9637ebfe-06ee-4699-9167-9afc94f66666",
  "session_version": 14,
  "session_state": "OPEN",
  "intent": "NOT_ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T23:09:06.934855Z",
  "last_location_at": "2026-10-30T23:09:06.934855Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

Round 5: the pause won; the accept got OFFER_REVOKED.

`GET /api/operator/v1/orders/00857446-87b5-4a8d-94b1-c48692315c29` → **200**

```json
{
  "id": "00857446-87b5-4a8d-94b1-c48692315c29",
  "short_number": 21,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "9a0cb83e-f0fe-4257-9685-48462f001dd5",
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
  "created_at": "2026-10-30T23:09:07.340108Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/00857446-87b5-4a8d-94b1-c48692315c29` → **200**

```json
{
  "id": "00857446-87b5-4a8d-94b1-c48692315c29",
  "short_number": 21,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "9a0cb83e-f0fe-4257-9685-48462f001dd5",
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
  "created_at": "2026-10-30T23:09:07.340108Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/00857446-87b5-4a8d-94b1-c48692315c29/cancel` → **200**

```json
{
  "command_id": "94334e25-0618-4b3d-9682-5001729d7adf",
  "expected_version": 4,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "00857446-87b5-4a8d-94b1-c48692315c29",
  "short_number": 21,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "9a0cb83e-f0fe-4257-9685-48462f001dd5",
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
  "created_at": "2026-10-30T23:09:07.340108Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "ru": "Нет свободных машин",
      "pl": "Brak wolnych aut",
      "uk": "Немає вільних авто",
      "en": "No cars available"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

E5: 3 rounds won by the accept, 2 by the pause; one winner each round, no 5xx.

## E4: a fix with 250 m accuracy keeps Near out of new orders; an accurate one brings him back

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9637ebfe-06ee-4699-9167-9afc94f66666",
  "session_version": 14,
  "session_state": "OPEN",
  "intent": "NOT_ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T23:09:06.934855Z",
  "last_location_at": "2026-10-30T23:09:06.934855Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/work-sessions/9637ebfe-06ee-4699-9167-9afc94f66666/resume` → **200**

```json
{
  "command_id": "a575ffdb-f619-470c-8aea-24025b68b7cd",
  "expected_version": 14
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9637ebfe-06ee-4699-9167-9afc94f66666",
  "session_version": 15,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T23:09:06.934855Z",
  "last_location_at": "2026-10-30T23:09:06.934855Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9637ebfe-06ee-4699-9167-9afc94f66666/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 250,
    "recorded_at": "2026-10-30T23:09:09Z",
    "sequence": 1793401749130
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9637ebfe-06ee-4699-9167-9afc94f66666",
  "session_version": 15,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T23:09:09.029233Z",
  "last_location_at": "2026-10-30T23:09:09.029233Z",
  "eligible": false,
  "ineligible_reasons": [
    "LOCATION_INACCURATE"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/work-sessions/9637ebfe-06ee-4699-9167-9afc94f66666/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T23:09:09Z",
    "sequence": 1793401749229
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9637ebfe-06ee-4699-9167-9afc94f66666",
  "session_version": 15,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T23:09:09.245339Z",
  "last_location_at": "2026-10-30T23:09:09.245339Z",
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
  "at": "2026-10-30T23:09:09.457646928Z",
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
      "last_location_at": "2026-10-30T23:09:09.245339Z",
      "last_heartbeat_at": "2026-10-30T23:09:09.245339Z",
      "order_id": null
    }
  ]
}
```

Done: E2, E5 (3/2), E4 and last_heartbeat_at 2026-10-30T23:09:09.245339Z.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9637ebfe-06ee-4699-9167-9afc94f66666",
  "session_version": 15,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T23:09:09.245339Z",
  "last_location_at": "2026-10-30T23:09:09.245339Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9637ebfe-06ee-4699-9167-9afc94f66666/close` → **200**

```json
{
  "command_id": "1275b30a-4c60-4c1d-93de-1ccb4a846aef",
  "expected_version": 15
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
  "session_id": "da64910c-4560-4796-8e0b-d30582e41255",
  "subject": {
    "type": "STAFF",
    "id": "c66269c2-93bc-421d-8af2-6f0cafc54be4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjYyNjljMi05M2JjLTQyMWQtOGFmMi02ZjBjYWZjNTRiZTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDI2NTAsImlhdCI6MTc5MzQwMTc1MCwianRpIjoiZGRjNWYxMzEtYmI2YS00NjkzLWJmY2QtMGY2MWMwMjVkOTdmIiwic2lkIjoiZGE2NDkxMGMtNDU2MC00Nzk2LThlMGItZDMwNTgyZTQxMjU1In0.fCKLAqiQXm7V43Xe8GomNW9Ru7eEzqJZlC3t-6uT9y4",
  "access_expires_at": "2026-10-30T23:24:10.546686061Z",
  "refresh_token": "rnc15Xm6-8w7-WEVVGl999Dmg0NprQgZ4Gtj46cwLyM",
  "refresh_expires_at": "2026-10-31T11:09:10.545951437Z",
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
  "command_id": "437fffe6-6d37-4d13-8bbf-cee13ae5b97e",
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
  "changed_by": "c66269c2-93bc-421d-8af2-6f0cafc54be4",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-30T23:09:10.955605Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "812fc745-ebf6-4581-890f-4b3eabdb6784",
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
  "correlation_id": "b0c92cde-24d7-4001-9d14-40707c90ff10",
  "current_version": 1
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "104a2e8a-5fdd-46c4-a99a-4f7d900163c0",
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
  "correlation_id": "9c5b0036-eee9-44d6-bfb6-bb740b415d71"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636974210",
  "device_ref": "sandbox-32270"
}
```

```json
{
  "challenge_id": "5b3c027d-fe95-4d05-85d6-34c5cca68473",
  "expires_at": "2026-10-30T23:14:11.558948021Z",
  "resend_available_at": "2026-10-30T23:09:12.558948021Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636974210` → **200**

```json
{
  "phone": "+380636974210",
  "audience": "CLIENT",
  "code": "137157",
  "sent_at": "2026-10-30T23:09:11.562113023Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5b3c027d-fe95-4d05-85d6-34c5cca68473",
  "code": "137157",
  "device_ref": "sandbox-32270"
}
```

```json
{
  "session_id": "6d216fa7-c041-459b-9437-90fa0f451daf",
  "subject": {
    "type": "CLIENT",
    "id": "f0197043-f78d-4552-a20a-30ad503aa120"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmMDE5NzA0My1mNzhkLTQ1NTItYTIwYS0zMGFkNTAzYWExMjAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDAyNjUxLCJpYXQiOjE3OTM0MDE3NTEsImp0aSI6IjliYWRiYTJkLWY3NmYtNDZhNi04MmQzLTVmNzYzZDM4OTUwOCIsInNpZCI6IjZkMjE2ZmE3LWMwNDEtNDU5Yi05NDM3LTkwZmEwZjQ1MWRhZiJ9.gXwSqUYHVI__sS79jV1PiF8l24bWg1xL7_7O91oeqbY",
  "access_expires_at": "2026-10-30T23:24:11.771969649Z",
  "refresh_token": "5TaKpV0otKHn8eEOEi_yd1pbWmzv3_ZjWZn82iReIk0",
  "refresh_expires_at": "2026-11-29T23:09:11.77161123Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f547ffca-35ec-4279-bbd0-fb056c14a1de",
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
  "id": "526db5c2-f7b3-4030-b874-f491de2cbc14",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T23:14:11.973915Z",
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
  "command_id": "58d051d3-8c64-4c34-96c9-f395dedd72c2",
  "quote_id": "526db5c2-f7b3-4030-b874-f491de2cbc14",
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
  "correlation_id": "72d8d0a9-da5c-453b-a3db-fb92d1779a54"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "12b1bc87-ee1c-42f8-b66f-358095433f42",
  "quote_id": "526db5c2-f7b3-4030-b874-f491de2cbc14",
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
  "id": "d2c9da08-07ff-4f4e-9a56-8ed558435207",
  "short_number": 22,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f0197043-f78d-4552-a20a-30ad503aa120",
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
  "created_at": "2026-10-30T23:09:12.373371Z",
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

`POST /api/rider/v1/orders/d2c9da08-07ff-4f4e-9a56-8ed558435207/cancel` → **200**

```json
{
  "command_id": "dc331708-0746-4994-b0bd-ebafeb59f08d",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "d2c9da08-07ff-4f4e-9a56-8ed558435207",
  "short_number": 22,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "f0197043-f78d-4552-a20a-30ad503aa120",
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
  "created_at": "2026-10-30T23:09:12.373371Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "ru": "Передумал ехать",
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
      "en": "Changed my mind"
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
  "command_id": "ad82145a-7d7a-489d-9220-fe146b1d8db0",
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
  "changed_by": "c66269c2-93bc-421d-8af2-6f0cafc54be4",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-30T23:09:12.83732Z"
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
      "changed_by": "c66269c2-93bc-421d-8af2-6f0cafc54be4",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-30T23:09:12.83732Z"
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
  "device_ref": "sandbox-4454"
}
```

```json
{
  "challenge_id": "60d2c3e8-2c05-40a0-9b45-b9eaa88f439d",
  "expires_at": "2026-10-30T23:14:13.472593646Z",
  "resend_available_at": "2026-10-30T23:09:14.472593646Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "210537",
  "sent_at": "2026-10-30T23:09:13.475418445Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "60d2c3e8-2c05-40a0-9b45-b9eaa88f439d",
  "code": "210537",
  "device_ref": "sandbox-4454"
}
```

```json
{
  "session_id": "99e29fa8-b0fc-44e9-9478-a76dc26a4e25",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwMjY1MywiaWF0IjoxNzkzNDAxNzUzLCJqdGkiOiI1ZDEwODkyOC03ZTlhLTRkMjItYmJiZC0wZmZjYTE0OTc1MDMiLCJzaWQiOiI5OWUyOWZhOC1iMGZjLTQ0ZTktOTQ3OC1hNzZkYzI2YTRlMjUifQ.5q4BVcipk-di6zVzhbq1_nLGi8UYAsg8U3rc0aR4cVk",
  "access_expires_at": "2026-10-30T23:24:13.682834058Z",
  "refresh_token": "-thlHv7xDJxya7y4jS6kIS5HLSuk4d_7q2qr4imlkV4",
  "refresh_expires_at": "2026-11-29T23:09:13.682303358Z",
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
  "command_id": "75e9a6ce-c730-4071-a8d2-1691bf35d459",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T23:09:14Z",
    "sequence": 1793401754849
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7ef1f56a-78a3-4a0e-bda7-1c6c91c2cc8c",
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
  "last_heartbeat_at": "2026-10-30T23:09:14.099563Z",
  "last_location_at": "2026-10-30T23:09:14.099563Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679105694",
  "device_ref": "sandbox-4736"
}
```

```json
{
  "challenge_id": "7dd6960e-f73d-448c-be64-b7d3599d39f2",
  "expires_at": "2026-10-30T23:14:14.297084149Z",
  "resend_available_at": "2026-10-30T23:09:15.297084149Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380679105694` → **200**

```json
{
  "phone": "+380679105694",
  "audience": "CLIENT",
  "code": "336864",
  "sent_at": "2026-10-30T23:09:14.299650573Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7dd6960e-f73d-448c-be64-b7d3599d39f2",
  "code": "336864",
  "device_ref": "sandbox-4736"
}
```

```json
{
  "session_id": "affc42c6-38c5-4a9b-90f1-e7acf274f243",
  "subject": {
    "type": "CLIENT",
    "id": "07a2f02e-5e31-4ce9-9781-ef3794b5d1dd"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwN2EyZjAyZS01ZTMxLTRjZTktOTc4MS1lZjM3OTRiNWQxZGQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDAyNjU0LCJpYXQiOjE3OTM0MDE3NTQsImp0aSI6ImI3ZDdhNjQ2LWRhYWYtNDAzNi1iZDZlLTZiMWU2NTk3ODUzYSIsInNpZCI6ImFmZmM0MmM2LTM4YzUtNGE5Yi05MGYxLWU3YWNmMjc0ZjI0MyJ9.8GB_DFulpmTrBIFO5N-0KDuffyOpS2lAMHlYqIGnn2M",
  "access_expires_at": "2026-10-30T23:24:14.520163246Z",
  "refresh_token": "t07a-N9iuxk52Ah6nAYcwsxXvnUTeR-GZ0NO86mGgp4",
  "refresh_expires_at": "2026-11-29T23:09:14.519724793Z",
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
  "command_id": "9bc0e591-e597-4578-9442-7a525486ec4d",
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
  "id": "eefdde78-38e3-4129-82de-992e24e5ad13",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T23:14:14.931015Z",
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
  "command_id": "846890e4-39f5-43c7-bacb-8f7d162fcc6d",
  "platform": "ANDROID",
  "token": "sandbox-driver-afd1cc1e-3fa2-404d-ba22-df5e63dc024a"
}
```

```json
{
  "id": "2daa787e-bf41-4ee4-ab18-43f3b638559b",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T23:09:15.147513Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "dfe4c4c4-8f4d-4b76-9f73-30cd89752f56",
  "platform": "ANDROID",
  "token": "sandbox-rider-39848921-b3b0-49ae-9107-6e6759191c38"
}
```

```json
{
  "id": "78dec46c-adae-4c9a-b312-099ad1ef66a4",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T23:09:15.36133Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "35fe72b4-271a-425f-9a7b-3e919a1c322b",
  "quote_id": "eefdde78-38e3-4129-82de-992e24e5ad13",
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
  "id": "4173693b-992b-43d6-9298-d3736170fce9",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "07a2f02e-5e31-4ce9-9781-ef3794b5d1dd",
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
  "created_at": "2026-10-30T23:09:15.569793Z",
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

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-30T23:09:15.550Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-30T23:09:15.550Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-30T23:09:15.550Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-30T23:09:15.550Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-30T23:09:15.550Z` → **200**

```json
[
  {
    "at": "2026-10-30T23:09:19.551515993Z",
    "token_suffix": "dc024a",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "event_type": "OfferMade",
      "type": "driver.offer",
      "offer_id": "fd44f263-123a-4301-86b6-d7e060167e92",
      "order_version": "2",
      "event_id": "e8965083-809b-4122-87bc-0bae84e8166c",
      "order_id": "4173693b-992b-43d6-9298-d3736170fce9"
    }
  }
]
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "fd44f263-123a-4301-86b6-d7e060167e92",
    "order_id": "4173693b-992b-43d6-9298-d3736170fce9",
    "expires_at": "2026-10-30T23:09:30.572098Z",
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

`POST /api/driver/v1/offers/fd44f263-123a-4301-86b6-d7e060167e92/accept` → **200**

```json
{
  "command_id": "b46e8554-b278-4e57-8ef3-571e9519539f"
}
```

```json
{
  "id": "3a349a59-028d-429b-86bf-d324d2cc1e58",
  "order_id": "4173693b-992b-43d6-9298-d3736170fce9",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "7b548794-39ea-4231-ba82-977450b0c590",
  "trip_phase": "TO_PICKUP"
}
```

## The rider's phone gets "driver assigned"

`GET /sandbox/v1/pushes?phone=%2B380679105694&after=2026-10-30T23:09:15.550Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380679105694&after=2026-10-30T23:09:15.550Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380679105694&after=2026-10-30T23:09:15.550Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380679105694&after=2026-10-30T23:09:15.550Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380679105694&after=2026-10-30T23:09:15.550Z` → **200**

```json
[
  {
    "at": "2026-10-30T23:09:23.558882759Z",
    "token_suffix": "191c38",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "event_type": "AssignmentCommitted",
      "type": "rider.driver-assigned",
      "assignment_id": "3a349a59-028d-429b-86bf-d324d2cc1e58",
      "order_version": "3",
      "event_id": "305a4d2d-87f4-4005-9ad7-7501b6a33704",
      "order_id": "4173693b-992b-43d6-9298-d3736170fce9"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/4173693b-992b-43d6-9298-d3736170fce9/messages` → **201**

```json
{
  "command_id": "993ce9ca-7e4b-4ece-9525-f2cd7ab96506",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "de47c419-fb54-4e74-a9e0-1d82423a1fc4",
  "order_id": "4173693b-992b-43d6-9298-d3736170fce9",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-30T23:09:24.409953211Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "7b548794-39ea-4231-ba82-977450b0c590",
  "order_id": "4173693b-992b-43d6-9298-d3736170fce9",
  "assignment_id": "3a349a59-028d-429b-86bf-d324d2cc1e58",
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

`POST /api/driver/v1/trips/7b548794-39ea-4231-ba82-977450b0c590/messages` → **201**

```json
{
  "command_id": "14b53237-e32e-4840-be67-f7ec315f00f4",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "f013ac00-d0b5-4e50-b1fe-cb935521fbbb",
  "order_id": "4173693b-992b-43d6-9298-d3736170fce9",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-30T23:09:24.815895986Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/4173693b-992b-43d6-9298-d3736170fce9/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/7b548794-39ea-4231-ba82-977450b0c590/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380679105694"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/7ef1f56a-78a3-4a0e-bda7-1c6c91c2cc8c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T23:09:25Z",
    "sequence": 1793401765469
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7ef1f56a-78a3-4a0e-bda7-1c6c91c2cc8c",
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
  "last_heartbeat_at": "2026-10-30T23:09:25.485025Z",
  "last_location_at": "2026-10-30T23:09:25.485025Z",
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
  "id": "7b548794-39ea-4231-ba82-977450b0c590",
  "order_id": "4173693b-992b-43d6-9298-d3736170fce9",
  "assignment_id": "3a349a59-028d-429b-86bf-d324d2cc1e58",
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

`POST /api/driver/v1/trips/7b548794-39ea-4231-ba82-977450b0c590/arrive` → **200**

```json
{
  "command_id": "a5c484e2-d123-4a2c-955f-7b4792620245",
  "expected_version": 0
}
```

```json
{
  "id": "7b548794-39ea-4231-ba82-977450b0c590",
  "order_id": "4173693b-992b-43d6-9298-d3736170fce9",
  "assignment_id": "3a349a59-028d-429b-86bf-d324d2cc1e58",
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
  "arrived_at": "2026-10-30T23:09:25.895901Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/7b548794-39ea-4231-ba82-977450b0c590/start` → **200**

```json
{
  "command_id": "757aecf6-870c-4e92-b162-d8aff8953a84",
  "expected_version": 1
}
```

```json
{
  "id": "7b548794-39ea-4231-ba82-977450b0c590",
  "order_id": "4173693b-992b-43d6-9298-d3736170fce9",
  "assignment_id": "3a349a59-028d-429b-86bf-d324d2cc1e58",
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
  "arrived_at": "2026-10-30T23:09:25.895901Z",
  "started_at": "2026-10-30T23:09:26.100884Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

(the car drives 48 s to the next point)

`POST /api/driver/v1/work-sessions/7ef1f56a-78a3-4a0e-bda7-1c6c91c2cc8c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T23:10:14Z",
    "sequence": 1793401814322
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7ef1f56a-78a3-4a0e-bda7-1c6c91c2cc8c",
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
  "last_heartbeat_at": "2026-10-30T23:10:14.337422Z",
  "last_location_at": "2026-10-30T23:10:14.337422Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/7b548794-39ea-4231-ba82-977450b0c590/complete` → **200**

```json
{
  "command_id": "c1e0754c-f190-487d-acb1-e063dc38ae8f",
  "expected_version": 2,
  "reported_at": "2026-10-30T23:10:14Z",
  "cash_received": true
}
```

```json
{
  "id": "7b548794-39ea-4231-ba82-977450b0c590",
  "order_id": "4173693b-992b-43d6-9298-d3736170fce9",
  "assignment_id": "3a349a59-028d-429b-86bf-d324d2cc1e58",
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
  "arrived_at": "2026-10-30T23:09:25.895901Z",
  "started_at": "2026-10-30T23:09:26.100884Z",
  "completed_at": "2026-10-30T23:10:14.543725Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/4173693b-992b-43d6-9298-d3736170fce9` → **200**

```json
{
  "id": "4173693b-992b-43d6-9298-d3736170fce9",
  "short_number": 23,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "07a2f02e-5e31-4ce9-9781-ef3794b5d1dd",
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
    "id": "3a349a59-028d-429b-86bf-d324d2cc1e58",
    "order_id": "4173693b-992b-43d6-9298-d3736170fce9",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "7b548794-39ea-4231-ba82-977450b0c590",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T23:09:15.569793Z",
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
      "id": "4173693b-992b-43d6-9298-d3736170fce9",
      "short_number": 23,
      "status": "FULFILLED",
      "created_at": "2026-10-30T23:09:15.569793Z",
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
      "id": "7b548794-39ea-4231-ba82-977450b0c590",
      "order_id": "4173693b-992b-43d6-9298-d3736170fce9",
      "order_short_number": 23,
      "created_at": "2026-10-30T23:09:20.094196Z",
      "pickup_label": "Майдан Незалежності",
      "dropoff_label": "Залізничний вокзал",
      "final_price_minor": 10517,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "COMPLETED"
    },
    {
      "id": "e3482d5e-887a-482d-98bb-ab00a95ce4f3",
      "order_id": "667581e0-747e-4a9b-b68a-cff018a2bdbb",
      "order_short_number": 19,
      "created_at": "2026-10-30T23:09:03.735726Z",
      "pickup_label": "Майдан",
      "dropoff_label": "Вокзал",
      "final_price_minor": null,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "ABORTED"
    },
    {
      "id": "d970c011-a4e7-42ed-ba53-09fb880cfcfd",
      "order_id": "02e8dae9-5566-43a0-8952-9c94ca5d57d5",
      "order_short_number": 18,
      "created_at": "2026-10-30T23:09:01.652866Z",
      "pickup_label": "Майдан",
      "dropoff_label": "Вокзал",
      "final_price_minor": null,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "ABORTED"
    },
    {
      "id": "5baaec14-c5ad-4649-8e74-eb2378c0b26c",
      "order_id": "dbd530b1-2687-4856-a67e-0ffa2a1e8411",
      "order_short_number": 17,
      "created_at": "2026-10-30T23:08:59.555065Z",
      "pickup_label": "Майдан",
      "dropoff_label": "Вокзал",
      "final_price_minor": null,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "ABORTED"
    },
    {
      "id": "ac8218fe-9ec1-45c3-a4eb-b7998f2569aa",
      "order_id": "12e03ec2-f576-424a-acae-8e767b56cf20",
      "order_short_number": 10,
      "created_at": "2026-10-30T23:03:18.935954Z",
      "pickup_label": "Майдан",
      "dropoff_label": "Вокзал",
      "final_price_minor": 10517,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "COMPLETED"
    },
    {
      "id": "959e417e-0c95-40ca-8a75-2b587153589c",
      "order_id": "af3607a5-5fc8-4432-91a7-2ad89db2ae9f",
      "order_short_number": 5,
      "created_at": "2026-10-30T23:01:50.778447Z",
      "pickup_label": "Майдан",
      "dropoff_label": "Вокзал",
      "final_price_minor": 10517,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "COMPLETED"
    },
    {
      "id": "a7bc84a6-075a-47a9-96c3-cea2b65a3833",
      "order_id": "01e66469-d2f4-43be-9d01-4bed151d9c15",
      "order_short_number": 3,
      "created_at": "2026-10-30T22:58:06.46422Z",
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

`GET /api/rider/v1/orders/4173693b-992b-43d6-9298-d3736170fce9/tip` → **200**

```json
{
  "order_id": "4173693b-992b-43d6-9298-d3736170fce9",
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
  "available_until": "2026-10-31T23:10:14.543725Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/4173693b-992b-43d6-9298-d3736170fce9/tip` → **201**

```json
{
  "command_id": "2f91d6a8-4a54-4da3-adef-e8a303d62b5b",
  "amount_minor": 1100
}
```

```json
{
  "id": "bea7c42f-a83a-4e9c-821e-72bc8ac01b7c",
  "order_id": "4173693b-992b-43d6-9298-d3736170fce9",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-30T23:10:19.021757Z"
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
  "session_id": "faeb033e-bd65-4f50-a0a2-788fd243c452",
  "subject": {
    "type": "STAFF",
    "id": "c66269c2-93bc-421d-8af2-6f0cafc54be4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjYyNjljMi05M2JjLTQyMWQtOGFmMi02ZjBjYWZjNTRiZTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDI3MTksImlhdCI6MTc5MzQwMTgxOSwianRpIjoiNWQwN2Y4MTMtMjVjOC00NDExLTk2MTAtMmZkNmZhOTVmNDAyIiwic2lkIjoiZmFlYjAzM2UtYmQ2NS00ZjUwLWEwYTItNzg4ZmQyNDNjNDUyIn0.Ie7Ub8mRw8tEhbrHxi6bMsEP1ee5DcGL0Pak_kpmJCY",
  "access_expires_at": "2026-10-30T23:25:19.455614385Z",
  "refresh_token": "1IQDkaV0lHC0LufsGO_5OYegwxoaVLZI9_bGE4ZdOG0",
  "refresh_expires_at": "2026-10-31T11:10:19.454981228Z",
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
          "CASH": 20,
          "CARD": 2
        },
        "cancelled_by": {
          "RIDER": 3,
          "DRIVER": 1,
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
      "APP": 21,
      "PHONE": 1
    },
    "by_payment": {
      "CASH": 20,
      "CARD": 2
    },
    "cancelled_by": {
      "RIDER": 3,
      "DRIVER": 1,
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
  "generated_at": "2026-10-30T23:10:19.657498916Z"
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
  "generated_at": "2026-10-30T23:10:19.858609994Z"
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
  "session_id": "1d7e7690-f178-418f-b715-4c305c4c42b3",
  "subject": {
    "type": "STAFF",
    "id": "c66269c2-93bc-421d-8af2-6f0cafc54be4"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjYyNjljMi05M2JjLTQyMWQtOGFmMi02ZjBjYWZjNTRiZTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDI3MjAsImlhdCI6MTc5MzQwMTgyMCwianRpIjoiZTA5NjQzZTQtZTU3My00YjU0LWJkNTQtZWUxZjk2NjZlNDYwIiwic2lkIjoiMWQ3ZTc2OTAtZjE3OC00MThmLWI3MTUtNGMzMDVjNGM0MmIzIn0.wyKKfL1cKBvaRUZPlmV_rLLR0TY8FyQToNDQzaJvVTc",
  "access_expires_at": "2026-10-30T23:25:20.282557481Z",
  "refresh_token": "z4dhn_Gtw8sDY3AYqQQgToipUENM1R-QkeRSwZeDBrc",
  "refresh_expires_at": "2026-10-31T11:10:20.28216713Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/4173693b-992b-43d6-9298-d3736170fce9/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T23:09:15.570234Z",
      "actor": {
        "type": "CLIENT",
        "id": "07a2f02e-5e31-4ce9-9781-ef3794b5d1dd",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "4173693b-992b-43d6-9298-d3736170fce9",
        "quote_id": "eefdde78-38e3-4129-82de-992e24e5ad13",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "71cb4968-4c34-44a5-bafa-8076fe0bee3a"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T23:09:15.571605Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "4173693b-992b-43d6-9298-d3736170fce9",
        "attempt_id": "d0b23133-e2fb-4324-b1c4-666e2337f3e6",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "71cb4968-4c34-44a5-bafa-8076fe0bee3a"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T23:09:15.573987Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "fd44f263-123a-4301-86b6-d7e060167e92",
        "order_id": "4173693b-992b-43d6-9298-d3736170fce9",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44,
        "expires_at": "2026-10-30T23:09:30.572097638Z"
      },
      "correlation_id": "71cb4968-4c34-44a5-bafa-8076fe0bee3a"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T23:09:20.095936Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "fd44f263-123a-4301-86b6-d7e060167e92",
        "order_id": "4173693b-992b-43d6-9298-d3736170fce9",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "3a349a59-028d-429b-86bf-d324d2cc1e58"
      },
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-30T23:10:20.74976462Z",
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
      "last_location_at": "2026-10-30T23:10:14.337422Z",
      "last_heartbeat_at": "2026-10-30T23:10:14.337422Z",
      "order_id": null
    }
  ]
}
```

Done: order 4173693b-992b-43d6-9298-d3736170fce9.

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
  "session_id": "36eb55ec-01cd-451b-9102-01e04a355319",
  "subject": {
    "type": "STAFF",
    "id": "c66269c2-93bc-421d-8af2-6f0cafc54be4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjYyNjljMi05M2JjLTQyMWQtOGFmMi02ZjBjYWZjNTRiZTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDI3MjEsImlhdCI6MTc5MzQwMTgyMSwianRpIjoiOGJmN2JiYjktOGExNC00MzY0LWJhYjYtYzBlMGQ0NGYwZWNlIiwic2lkIjoiMzZlYjU1ZWMtMDFjZC00NTFiLTkxMDItMDFlMDRhMzU1MzE5In0.DQGRaFJ5t6Bu9pRWJqT2UefKOsNsvWpamC97gYUPWvo",
  "access_expires_at": "2026-10-30T23:25:21.173279252Z",
  "refresh_token": "qVnRH5u-8MpduccVY1V3QHerFo5pvmnLZoJmJgOu9k4",
  "refresh_expires_at": "2026-10-31T11:10:21.172783745Z",
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
  "command_id": "c2c282a3-4416-450e-b659-7b54d33a6f68",
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
  "timestamp": "2026-10-30T23:10:21.000+0000",
  "channel": {
    "id": "1730052000.57913779",
    "linkedid": "1730052000.57913779",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380679040560"
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
  "timestamp": "2026-10-30T23:10:21.000+0000",
  "channel": {
    "id": "1730052000.57913779",
    "linkedid": "1730052000.57913779",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380679040560"
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
  "session_id": "108c4f44-c752-4a00-bd7f-9d30dc889abb",
  "subject": {
    "type": "STAFF",
    "id": "c66269c2-93bc-421d-8af2-6f0cafc54be4"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjYyNjljMi05M2JjLTQyMWQtOGFmMi02ZjBjYWZjNTRiZTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDI3MjIsImlhdCI6MTc5MzQwMTgyMiwianRpIjoiNGYzOWVmMjEtYmJkZS00NzU5LWE1NTktYmFhMDY0YTFkMTIxIiwic2lkIjoiMTA4YzRmNDQtYzc1Mi00YTAwLWJkN2YtOWQzMGRjODg5YWJiIn0.vlpD4ykjMH-FYBcObyfdVyX_IKCF4Zm6CNO-inmLOBI",
  "access_expires_at": "2026-10-30T23:25:22.035419086Z",
  "refresh_token": "Sr3stLiqPz2-_VNqbz-HBuVpQXUwNeHq_8L_NKCUzCs",
  "refresh_expires_at": "2026-10-31T11:10:22.03489429Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "d29e176f-6289-41fa-abb8-3b9d2f86821a",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380679040560",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T23:10:21Z",
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

`POST /api/operator/v1/calls/d29e176f-6289-41fa-abb8-3b9d2f86821a/answer` → **200**

```json
{
  "command_id": "f8c01039-47c3-4cf1-a3da-b572e6647ba8"
}
```

```json
{
  "id": "d29e176f-6289-41fa-abb8-3b9d2f86821a",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380679040560",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "c66269c2-93bc-421d-8af2-6f0cafc54be4",
  "order_ids": [],
  "started_at": "2026-10-30T23:10:21Z",
  "answered_at": "2026-10-30T23:10:22.451168Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.57913779",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "92f85141-a5fa-41d4-b9b3-5af5cb0e01aa",
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
  "id": "d5704bd6-2a6b-4b9a-bdf4-6c1cf30417b9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T23:15:22.682882Z",
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
  "command_id": "b829e271-1b37-475a-a142-0cce0222fc92",
  "quote_id": "d5704bd6-2a6b-4b9a-bdf4-6c1cf30417b9",
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
    "phone": "+380679040560"
  },
  "call_id": "d29e176f-6289-41fa-abb8-3b9d2f86821a"
}
```

```json
{
  "id": "e68f5d87-2cca-4b2f-8e5b-2bdc35374947",
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
  "created_at": "2026-10-30T23:10:22.891138Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679040560"
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
    "id": "1730052000.57913779",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "d29e176f-6289-41fa-abb8-3b9d2f86821a",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679040560",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "c66269c2-93bc-421d-8af2-6f0cafc54be4",
      "order_ids": [
        "e68f5d87-2cca-4b2f-8e5b-2bdc35374947"
      ],
      "started_at": "2026-10-30T23:10:21Z",
      "answered_at": "2026-10-30T23:10:22.451168Z",
      "ended_at": "2026-10-30T23:10:23.13098Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "8e388b8a-a90c-4636-ab5f-7570bb921952",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380676788230",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "c66269c2-93bc-421d-8af2-6f0cafc54be4",
      "order_ids": [],
      "started_at": "2026-10-30T23:01:41.123945Z",
      "answered_at": "2026-10-30T23:01:41.349883Z",
      "ended_at": "2026-10-30T23:01:41.57378Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T23:01:47.323998Z"
      }
    }
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
```

`GET /api/operator/v1/orders/e68f5d87-2cca-4b2f-8e5b-2bdc35374947` → **200**

```json
{
  "id": "e68f5d87-2cca-4b2f-8e5b-2bdc35374947",
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
  "created_at": "2026-10-30T23:10:22.891138Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679040560"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/e68f5d87-2cca-4b2f-8e5b-2bdc35374947` → **200**

```json
{
  "id": "e68f5d87-2cca-4b2f-8e5b-2bdc35374947",
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
  "created_at": "2026-10-30T23:10:22.891138Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679040560"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/e68f5d87-2cca-4b2f-8e5b-2bdc35374947/cancel` → **200**

```json
{
  "command_id": "750b26a1-04b0-4f6f-8597-4f649868c565",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "e68f5d87-2cca-4b2f-8e5b-2bdc35374947",
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
  "created_at": "2026-10-30T23:10:22.891138Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679040560"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "ru": "Нет свободных машин",
      "pl": "Brak wolnych aut",
      "uk": "Немає вільних авто",
      "en": "No cars available"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

Done: call d29e176f-6289-41fa-abb8-3b9d2f86821a with order e68f5d87-2cca-4b2f-8e5b-2bdc35374947.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-19037"
}
```

```json
{
  "challenge_id": "ae0a8832-7bc7-47e8-a0a3-6f964cca5699",
  "expires_at": "2026-10-30T23:15:24.049847073Z",
  "resend_available_at": "2026-10-30T23:10:25.049847073Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "024197",
  "sent_at": "2026-10-30T23:10:24.052811026Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ae0a8832-7bc7-47e8-a0a3-6f964cca5699",
  "code": "024197",
  "device_ref": "sandbox-19037"
}
```

```json
{
  "session_id": "13a8aa68-3537-48c2-a0ff-3e5abe1ed051",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwMjcyNCwiaWF0IjoxNzkzNDAxODI0LCJqdGkiOiI0NGNkMDVkZi01ZTI2LTRhNDAtOWMwNy05OWQ2NjAxOTU3ZTkiLCJzaWQiOiIxM2E4YWE2OC0zNTM3LTQ4YzItYTBmZi0zZTVhYmUxZWQwNTEifQ.cGm0Z6ksT-Ubm_5pZ-QuXg5kQ2N1DxAiJpl_grvBCic",
  "access_expires_at": "2026-10-30T23:25:24.262647065Z",
  "refresh_token": "CBP1lgZcOzkVtEGBrbZFPyhhV0opiLimOiXSTwrVomY",
  "refresh_expires_at": "2026-11-29T23:10:24.262158947Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7ef1f56a-78a3-4a0e-bda7-1c6c91c2cc8c",
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
  "last_heartbeat_at": "2026-10-30T23:10:14.337422Z",
  "last_location_at": "2026-10-30T23:10:14.337422Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7ef1f56a-78a3-4a0e-bda7-1c6c91c2cc8c/handover` → **200**

```json
{
  "command_id": "cec0e5ff-9d6c-4b0e-a1f7-028751b26292",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7ef1f56a-78a3-4a0e-bda7-1c6c91c2cc8c",
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
  "last_heartbeat_at": "2026-10-30T23:10:14.337422Z",
  "last_location_at": "2026-10-30T23:10:14.337422Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

(the car drives 89 s to the next point)

`POST /api/driver/v1/work-sessions/7ef1f56a-78a3-4a0e-bda7-1c6c91c2cc8c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T23:11:53Z",
    "sequence": 1793401913838
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7ef1f56a-78a3-4a0e-bda7-1c6c91c2cc8c",
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
  "last_heartbeat_at": "2026-10-30T23:11:53.852843Z",
  "last_location_at": "2026-10-30T23:11:53.852843Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380667233230",
  "device_ref": "sandbox-13841"
}
```

```json
{
  "challenge_id": "1e1084fb-a0c7-432c-b0eb-3e0014a66c12",
  "expires_at": "2026-10-30T23:16:54.040221343Z",
  "resend_available_at": "2026-10-30T23:11:55.040221343Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380667233230` → **200**

```json
{
  "phone": "+380667233230",
  "audience": "CLIENT",
  "code": "334897",
  "sent_at": "2026-10-30T23:11:54.042347369Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1e1084fb-a0c7-432c-b0eb-3e0014a66c12",
  "code": "334897",
  "device_ref": "sandbox-13841"
}
```

```json
{
  "session_id": "ccd83e28-2049-4b12-87b3-8a0c7399b7e0",
  "subject": {
    "type": "CLIENT",
    "id": "5dd37dee-d0db-445f-acc8-f74b67a740bc"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZGQzN2RlZS1kMGRiLTQ0NWYtYWNjOC1mNzRiNjdhNzQwYmMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDAyODE0LCJpYXQiOjE3OTM0MDE5MTQsImp0aSI6ImFmMmIzOTllLWE0MzQtNDgwOC1iYTcwLTc5NTkxZmNjOTM4NyIsInNpZCI6ImNjZDgzZTI4LTIwNDktNGIxMi04N2IzLThhMGM3Mzk5YjdlMCJ9.9lWb9UFHW5cl8JSJUhTePE4wDkSgJpebuI_MQ4MaGTc",
  "access_expires_at": "2026-10-30T23:26:54.271721359Z",
  "refresh_token": "_DKwCTE6gjfLfky1bi7UQ9aoSTvMuukmzlmhguLXbVE",
  "refresh_expires_at": "2026-11-29T23:11:54.271242616Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "fade4fda-708b-4f0f-82c0-98d1229a63e7",
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
  "id": "6986acba-5965-482e-b8f4-6ffedc09d9b4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T23:16:54.476067Z",
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
  "command_id": "8f2334d4-614f-481c-b7d4-095a12252a75",
  "quote_id": "6986acba-5965-482e-b8f4-6ffedc09d9b4",
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
  "id": "8564eb4c-df99-4e93-9ee0-89e1fdbb4265",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5dd37dee-d0db-445f-acc8-f74b67a740bc",
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
  "created_at": "2026-10-30T23:11:54.687828Z",
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
    "id": "a74769ed-9439-4221-bfdc-e6b1ab9b6016",
    "order_id": "8564eb4c-df99-4e93-9ee0-89e1fdbb4265",
    "expires_at": "2026-10-30T23:12:09.690513Z",
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

`POST /api/driver/v1/offers/a74769ed-9439-4221-bfdc-e6b1ab9b6016/accept` → **200**

```json
{
  "command_id": "ffbdd257-a725-4076-9e29-aceeb2bdb135"
}
```

```json
{
  "id": "18f0c586-8123-4b95-baaa-9b7d404070bf",
  "order_id": "8564eb4c-df99-4e93-9ee0-89e1fdbb4265",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e09d09f1-5e55-426c-a7f7-4999757955be",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e09d09f1-5e55-426c-a7f7-4999757955be",
  "order_id": "8564eb4c-df99-4e93-9ee0-89e1fdbb4265",
  "assignment_id": "18f0c586-8123-4b95-baaa-9b7d404070bf",
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

`POST /api/driver/v1/work-sessions/7ef1f56a-78a3-4a0e-bda7-1c6c91c2cc8c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T23:11:55Z",
    "sequence": 1793401915544
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7ef1f56a-78a3-4a0e-bda7-1c6c91c2cc8c",
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
  "last_heartbeat_at": "2026-10-30T23:11:55.559925Z",
  "last_location_at": "2026-10-30T23:11:55.559925Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/e09d09f1-5e55-426c-a7f7-4999757955be/arrive` → **200**

```json
{
  "command_id": "084cbf32-fdad-45e1-af1e-aa1f450ecfc5",
  "expected_version": 0
}
```

```json
{
  "id": "e09d09f1-5e55-426c-a7f7-4999757955be",
  "order_id": "8564eb4c-df99-4e93-9ee0-89e1fdbb4265",
  "assignment_id": "18f0c586-8123-4b95-baaa-9b7d404070bf",
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
  "arrived_at": "2026-10-30T23:11:55.76455Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/e09d09f1-5e55-426c-a7f7-4999757955be/start` → **200**

```json
{
  "command_id": "dbd7e542-69a9-4cb3-bb0b-e9f1cd4f23ba",
  "expected_version": 1
}
```

```json
{
  "id": "e09d09f1-5e55-426c-a7f7-4999757955be",
  "order_id": "8564eb4c-df99-4e93-9ee0-89e1fdbb4265",
  "assignment_id": "18f0c586-8123-4b95-baaa-9b7d404070bf",
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
  "arrived_at": "2026-10-30T23:11:55.76455Z",
  "started_at": "2026-10-30T23:11:55.96806Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

(the car drives 59 s to the next point)

`POST /api/driver/v1/work-sessions/7ef1f56a-78a3-4a0e-bda7-1c6c91c2cc8c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T23:12:55Z",
    "sequence": 1793401975183
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7ef1f56a-78a3-4a0e-bda7-1c6c91c2cc8c",
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
  "last_heartbeat_at": "2026-10-30T23:12:55.199221Z",
  "last_location_at": "2026-10-30T23:12:55.199221Z",
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
  "device_ref": "sandbox-18232"
}
```

```json
{
  "challenge_id": "dbb9fd8f-db7e-4b80-b8cc-d86f33cee455",
  "expires_at": "2026-10-30T23:17:55.390863336Z",
  "resend_available_at": "2026-10-30T23:12:56.390863336Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "078917",
  "sent_at": "2026-10-30T23:12:55.393495035Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "dbb9fd8f-db7e-4b80-b8cc-d86f33cee455",
  "code": "078917",
  "device_ref": "sandbox-18232"
}
```

```json
{
  "session_id": "344da242-a47e-4b42-8ec5-966dbc91045b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwMjg3NSwiaWF0IjoxNzkzNDAxOTc1LCJqdGkiOiJmZDUxMTU0Ni01NjI3LTQwYzYtYjAyMi1lZGI5YzBhMWE5OTYiLCJzaWQiOiIzNDRkYTI0Mi1hNDdlLTRiNDItOGVjNS05NjZkYmM5MTA0NWIifQ.pjVxNuS4UF3Zo0wPnTfJOesz2uIyDM26nwBoGKVWIbk",
  "access_expires_at": "2026-10-30T23:27:55.603555001Z",
  "refresh_token": "aVfsivqGZcxK_7MLgtz03xBMPlPwdU9wgSzfT-5lxuk",
  "refresh_expires_at": "2026-11-29T23:12:55.60315806Z",
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
  "command_id": "43e01716-7943-4db4-bef3-0959d5768be0",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T23:12:55Z",
    "sequence": 1793401975994
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "28ede964-2ce5-44cc-9f8c-ef2642d36a94",
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
  "last_heartbeat_at": "2026-10-30T23:12:56.009026Z",
  "last_location_at": "2026-10-30T23:12:56.009026Z",
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
  "session_id": "89864d21-56f1-42e1-a4db-cc807b32283c",
  "subject": {
    "type": "STAFF",
    "id": "c66269c2-93bc-421d-8af2-6f0cafc54be4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjYyNjljMi05M2JjLTQyMWQtOGFmMi02ZjBjYWZjNTRiZTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDI4NzYsImlhdCI6MTc5MzQwMTk3NiwianRpIjoiNjE4OTRlYjItZTgwNC00NGU0LWEyNDYtZTE2YWZhNDk1MTk5Iiwic2lkIjoiODk4NjRkMjEtNTZmMS00MmUxLWE0ZGItY2M4MDdiMzIyODNjIn0.E5SKHxGHg9lCn1nyRzi8KGxy_CybdnIbh7xi8_PF0rg",
  "access_expires_at": "2026-10-30T23:27:56.409308634Z",
  "refresh_token": "dQRe46LQ1hjz4bdFSZiqBlPVg4VlD8GMa_DYaQqJIVc",
  "refresh_expires_at": "2026-10-31T11:12:56.408957051Z",
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
  "session_id": "e845942a-a8c7-4920-9119-f22bfeae4d5e",
  "subject": {
    "type": "STAFF",
    "id": "c66269c2-93bc-421d-8af2-6f0cafc54be4"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjYyNjljMi05M2JjLTQyMWQtOGFmMi02ZjBjYWZjNTRiZTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDI4NzYsImlhdCI6MTc5MzQwMTk3NiwianRpIjoiZGI0YTEwMGYtMDIxZC00ODI5LWFlNjMtOTJkMjA2MGQyNTUyIiwic2lkIjoiZTg0NTk0MmEtYThjNy00OTIwLTkxMTktZjIyYmZlYWU0ZDVlIn0.A598CHMB2tn4oU7tOLA2QOLxD2s3znmcjjkCg3vVq_A",
  "access_expires_at": "2026-10-30T23:27:56.797151169Z",
  "refresh_token": "aPIo4L6Eklf-LoL0tsdOHKfXX5nRn39TiyD4CzA6kw4",
  "refresh_expires_at": "2026-10-31T11:12:56.796727859Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/8564eb4c-df99-4e93-9ee0-89e1fdbb4265` → **200**

```json
{
  "id": "8564eb4c-df99-4e93-9ee0-89e1fdbb4265",
  "short_number": 25,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "5dd37dee-d0db-445f-acc8-f74b67a740bc",
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
    "id": "18f0c586-8123-4b95-baaa-9b7d404070bf",
    "order_id": "8564eb4c-df99-4e93-9ee0-89e1fdbb4265",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "e09d09f1-5e55-426c-a7f7-4999757955be",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-30T23:11:54.687828Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/8564eb4c-df99-4e93-9ee0-89e1fdbb4265/interrupt` → **200**

```json
{
  "command_id": "6214a185-046d-4ff4-821e-f28a543fa920",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "8564eb4c-df99-4e93-9ee0-89e1fdbb4265",
    "short_number": 25,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "5dd37dee-d0db-445f-acc8-f74b67a740bc",
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
      "id": "18f0c586-8123-4b95-baaa-9b7d404070bf",
      "order_id": "8564eb4c-df99-4e93-9ee0-89e1fdbb4265",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "e09d09f1-5e55-426c-a7f7-4999757955be",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-30T23:11:54.687828Z",
    "caller": null,
    "cancellation": {
      "by": "STAFF",
      "reason_code": "VEHICLE_BREAKDOWN",
      "reason_labels": {
        "ru": "Поломка автомобиля в пути",
        "pl": "Awaria auta w trasie",
        "uk": "Поломка автомобіля в дорозі",
        "en": "Vehicle broke down on the way"
      }
    },
    "pickup_at": null,
    "preorder": false,
    "reservation": null,
    "related_order_id": null
  },
  "follow_up": {
    "id": "a81d2301-61bd-433d-8069-7566af3a2828",
    "short_number": 26,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "5dd37dee-d0db-445f-acc8-f74b67a740bc",
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
    "id": "c74dbaae-f969-4ec7-ae7a-02ab51cad2f2",
    "order_id": "a81d2301-61bd-433d-8069-7566af3a2828",
    "expires_at": "2026-10-30T23:13:12.210816Z",
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

`POST /api/driver/v1/offers/c74dbaae-f969-4ec7-ae7a-02ab51cad2f2/accept` → **200**

```json
{
  "command_id": "59db985c-249c-49ae-ba24-ad282c3037e1"
}
```

```json
{
  "id": "5421e635-750d-43be-9bb1-c2d32466d525",
  "order_id": "a81d2301-61bd-433d-8069-7566af3a2828",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "64599c5a-b3a5-4130-9841-b6d93943b1b7",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "64599c5a-b3a5-4130-9841-b6d93943b1b7",
  "order_id": "a81d2301-61bd-433d-8069-7566af3a2828",
  "assignment_id": "5421e635-750d-43be-9bb1-c2d32466d525",
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
  "session_id": "28ede964-2ce5-44cc-9f8c-ef2642d36a94",
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
  "last_heartbeat_at": "2026-10-30T23:12:56.009026Z",
  "last_location_at": "2026-10-30T23:12:56.009026Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/28ede964-2ce5-44cc-9f8c-ef2642d36a94/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T23:12:58Z",
    "sequence": 1793401978360
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "28ede964-2ce5-44cc-9f8c-ef2642d36a94",
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
  "last_heartbeat_at": "2026-10-30T23:12:58.375693Z",
  "last_location_at": "2026-10-30T23:12:58.375693Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/64599c5a-b3a5-4130-9841-b6d93943b1b7/arrive` → **200**

```json
{
  "command_id": "a493c1e9-f9cb-4913-be3a-f8b62fdf75e2",
  "expected_version": 0
}
```

```json
{
  "id": "64599c5a-b3a5-4130-9841-b6d93943b1b7",
  "order_id": "a81d2301-61bd-433d-8069-7566af3a2828",
  "assignment_id": "5421e635-750d-43be-9bb1-c2d32466d525",
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
  "arrived_at": "2026-10-30T23:12:58.576964Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/64599c5a-b3a5-4130-9841-b6d93943b1b7/start` → **200**

```json
{
  "command_id": "c2433ead-342e-4f33-8f57-2d4bc6f71dd6",
  "expected_version": 1
}
```

```json
{
  "id": "64599c5a-b3a5-4130-9841-b6d93943b1b7",
  "order_id": "a81d2301-61bd-433d-8069-7566af3a2828",
  "assignment_id": "5421e635-750d-43be-9bb1-c2d32466d525",
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
  "arrived_at": "2026-10-30T23:12:58.576964Z",
  "started_at": "2026-10-30T23:12:58.788304Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/64599c5a-b3a5-4130-9841-b6d93943b1b7/complete` → **200**

```json
{
  "command_id": "8d6aadcd-4996-4e79-8361-745da2667237",
  "expected_version": 2,
  "reported_at": "2026-10-30T23:12:58Z"
}
```

```json
{
  "id": "64599c5a-b3a5-4130-9841-b6d93943b1b7",
  "order_id": "a81d2301-61bd-433d-8069-7566af3a2828",
  "assignment_id": "5421e635-750d-43be-9bb1-c2d32466d525",
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
  "arrived_at": "2026-10-30T23:12:58.576964Z",
  "started_at": "2026-10-30T23:12:58.788304Z",
  "completed_at": "2026-10-30T23:12:58.996008Z",
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
      "id": "a81d2301-61bd-433d-8069-7566af3a2828",
      "short_number": 26,
      "status": "FULFILLED",
      "created_at": "2026-10-30T23:12:57.204459Z",
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
      "id": "8564eb4c-df99-4e93-9ee0-89e1fdbb4265",
      "short_number": 25,
      "status": "CANCELLED",
      "created_at": "2026-10-30T23:11:54.687828Z",
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
          "pl": "Awaria auta w trasie",
          "uk": "Поломка автомобіля в дорозі",
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

`GET /api/operator/v1/orders/8564eb4c-df99-4e93-9ee0-89e1fdbb4265/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T23:11:54.688281Z",
      "actor": {
        "type": "CLIENT",
        "id": "5dd37dee-d0db-445f-acc8-f74b67a740bc",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "8564eb4c-df99-4e93-9ee0-89e1fdbb4265",
        "quote_id": "6986acba-5965-482e-b8f4-6ffedc09d9b4",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "bb5bbff4-e4b4-4a1f-858f-a7f2e6c1b611"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T23:11:54.689919Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "8564eb4c-df99-4e93-9ee0-89e1fdbb4265",
        "attempt_id": "9fd743fd-913c-4439-a58a-adea25f62cd1",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "bb5bbff4-e4b4-4a1f-858f-a7f2e6c1b611"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T23:11:54.694146Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "a74769ed-9439-4221-bfdc-e6b1ab9b6016",
        "order_id": "8564eb4c-df99-4e93-9ee0-89e1fdbb4265",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78,
        "expires_at": "2026-10-30T23:12:09.690512826Z"
      },
      "correlation_id": "bb5bbff4-e4b4-4a1f-858f-a7f2e6c1b611"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T23:11:55.118825Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "a74769ed-9439-4221-bfdc-e6b1ab9b6016",
        "order_id": "8564eb4c-df99-4e93-9ee0-89e1fdbb4265",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "18f0c586-8123-4b95-baaa-9b7d404070bf"
      },
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/a81d2301-61bd-433d-8069-7566af3a2828/tip` → **200**

```json
{
  "order_id": "a81d2301-61bd-433d-8069-7566af3a2828",
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
  "available_until": "2026-10-31T23:12:58.996008Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/a81d2301-61bd-433d-8069-7566af3a2828/tip` → **409**

```json
{
  "command_id": "084f940d-1e8d-475e-a4a3-363b66e3f4f4",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/a81d2301-61bd-433d-8069-7566af3a2828/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "3b51c22d-3ccb-4774-a203-e9ffcf7ed989"
}
```

Done: interrupted 8564eb4c-df99-4e93-9ee0-89e1fdbb4265, follow-up a81d2301-61bd-433d-8069-7566af3a2828.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7ef1f56a-78a3-4a0e-bda7-1c6c91c2cc8c",
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
  "last_heartbeat_at": "2026-10-30T23:12:55.199221Z",
  "last_location_at": "2026-10-30T23:12:55.199221Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7ef1f56a-78a3-4a0e-bda7-1c6c91c2cc8c/close` → **200**

```json
{
  "command_id": "f725ae1f-cfd2-4ddf-b689-f21d361787d8",
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
  "session_id": "28ede964-2ce5-44cc-9f8c-ef2642d36a94",
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
  "last_heartbeat_at": "2026-10-30T23:12:58.375693Z",
  "last_location_at": "2026-10-30T23:12:58.375693Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/28ede964-2ce5-44cc-9f8c-ef2642d36a94/close` → **200**

```json
{
  "command_id": "1c5eef10-d46c-408d-b75f-5013e3bf5897",
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
  "session_id": "f655f332-2ae8-483a-b8d2-f0ebcae15827",
  "subject": {
    "type": "STAFF",
    "id": "c66269c2-93bc-421d-8af2-6f0cafc54be4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjYyNjljMi05M2JjLTQyMWQtOGFmMi02ZjBjYWZjNTRiZTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDI4ODQsImlhdCI6MTc5MzQwMTk4NCwianRpIjoiYTdlYzRmZWMtYTEzYi00ZTk3LThkM2EtM2IzYjE2MjMxYTUwIiwic2lkIjoiZjY1NWYzMzItMmFlOC00ODNhLWI4ZDItZjBlYmNhZTE1ODI3In0.4CZp-sh9HZ4ADh7ayHARxS7gsXMTq0oiMW7aplpsaGk",
  "access_expires_at": "2026-10-30T23:28:04.215301046Z",
  "refresh_token": "_IymgO4waBhyFimFeTePc6itgy6z0YFi71oHjQWHp34",
  "refresh_expires_at": "2026-10-31T11:13:04.214833219Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "220a4326-ad5f-4d52-a870-5c4296647e49",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T23:13:04Z"
}
```

```json
{
  "id": "8b791e16-2048-444a-92da-7a1da49474ff",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T23:13:04Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/8b791e16-2048-444a-92da-7a1da49474ff/publish` → **200**

```json
{
  "command_id": "c1c1b130-a068-4e4d-b33b-0cf8697ff9fe",
  "expected_version": 0
}
```

```json
{
  "id": "8b791e16-2048-444a-92da-7a1da49474ff",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T23:13:04.618453Z",
  "published_at": "2026-10-30T23:13:04.618453Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "8b791e16-2048-444a-92da-7a1da49474ff",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-30T23:13:04.618453Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630605159",
  "device_ref": "sandbox-9205"
}
```

```json
{
  "challenge_id": "23dd4cda-4a95-4629-8d67-3ce46f245bbd",
  "expires_at": "2026-10-30T23:18:05.002719797Z",
  "resend_available_at": "2026-10-30T23:13:06.002719797Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380630605159` → **200**

```json
{
  "phone": "+380630605159",
  "audience": "CLIENT",
  "code": "257400",
  "sent_at": "2026-10-30T23:13:05.005099742Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "23dd4cda-4a95-4629-8d67-3ce46f245bbd",
  "code": "257400",
  "device_ref": "sandbox-9205"
}
```

```json
{
  "session_id": "f7f717eb-0c1f-49ac-b951-bdd5695bad1b",
  "subject": {
    "type": "CLIENT",
    "id": "e6d95636-87fe-4711-9021-9eb7a904ec11"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNmQ5NTYzNi04N2ZlLTQ3MTEtOTAyMS05ZWI3YTkwNGVjMTEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDAyODg1LCJpYXQiOjE3OTM0MDE5ODUsImp0aSI6Ijc2ODhiMmE1LTRmNzctNDliZS1hOTE3LWEzZDk5ZGIyNWNlZiIsInNpZCI6ImY3ZjcxN2ViLTBjMWYtNDlhYy1iOTUxLWJkZDU2OTViYWQxYiJ9.IFOl__llcw8PuoPosuI5wMDjusnVFSN50XbBbigsfQI",
  "access_expires_at": "2026-10-30T23:28:05.222830513Z",
  "refresh_token": "G-RUvwC8Tn1WBTce_cR-cGZn56vzCVMA5XKYBNvzsAE",
  "refresh_expires_at": "2026-11-29T23:13:05.222470337Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "8b791e16-2048-444a-92da-7a1da49474ff",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-30T23:13:04.618453Z",
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
  "command_id": "efc241f5-513c-44ca-92c4-09d4cc1c4b66",
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
  "id": "a4033ca8-6754-4f7f-95fb-a55b6516d1bf",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T23:18:05.599034Z",
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
  "command_id": "ff071bc5-20df-4d49-b699-9b154a3aeeaf",
  "quote_id": "a4033ca8-6754-4f7f-95fb-a55b6516d1bf",
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
  "correlation_id": "ad32d105-7700-41b5-8b27-57834925ea68"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "19bcbe39-a399-4974-8c6d-0cac0c9d64ed",
  "version_id": "8b791e16-2048-444a-92da-7a1da49474ff",
  "language": "uk"
}
```

```json
{
  "version_id": "8b791e16-2048-444a-92da-7a1da49474ff",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-30T23:13:05.996766Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "98d32133-6938-4cd4-9d4d-c9f013162474",
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
  "id": "19b8a760-9ad0-4dd0-81b7-ee769477c5b0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T23:18:06.190271Z",
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
  "command_id": "abc969e8-30bc-4bfd-8263-fef4eb53fe39",
  "quote_id": "19b8a760-9ad0-4dd0-81b7-ee769477c5b0",
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
  "id": "a38fafd7-7846-44fd-bc54-352ee2ca5dc7",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e6d95636-87fe-4711-9021-9eb7a904ec11",
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
  "created_at": "2026-10-30T23:13:06.383324Z",
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

`GET /api/rider/v1/orders/a38fafd7-7846-44fd-bc54-352ee2ca5dc7` → **200**

```json
{
  "id": "a38fafd7-7846-44fd-bc54-352ee2ca5dc7",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e6d95636-87fe-4711-9021-9eb7a904ec11",
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
  "created_at": "2026-10-30T23:13:06.383324Z",
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

`POST /api/rider/v1/orders/a38fafd7-7846-44fd-bc54-352ee2ca5dc7/cancel` → **200**

```json
{
  "command_id": "2505af4e-dfdd-43ec-b18a-dca23e65554d",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "a38fafd7-7846-44fd-bc54-352ee2ca5dc7",
  "short_number": 27,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "e6d95636-87fe-4711-9021-9eb7a904ec11",
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
  "created_at": "2026-10-30T23:13:06.383324Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "ru": "Передумал ехать",
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
      "en": "Changed my mind"
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

`POST /api/admin/v1/legal-documents/8b791e16-2048-444a-92da-7a1da49474ff` → **409**

```json
{
  "command_id": "ab710a2a-4b35-4f8f-bc38-993389e83c9a",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T23:13:07Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/8b791e16-2048-444a-92da-7a1da49474ff",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "9be3eaa5-b51c-4e31-afce-faba443a36b9"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "b5b1508b-3c8d-477d-a529-994728417a62",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T23:13:07Z"
}
```

```json
{
  "id": "2672593c-e894-42d0-837d-245d7b65df95",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T23:13:07Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/2672593c-e894-42d0-837d-245d7b65df95/publish` → **200**

```json
{
  "command_id": "5ee62fdd-14c5-49ad-8d1a-422b84f8d197",
  "expected_version": 0
}
```

```json
{
  "id": "2672593c-e894-42d0-837d-245d7b65df95",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T23:13:07.446475Z",
  "published_at": "2026-10-30T23:13:07.446475Z",
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
  "device_ref": "sandbox-11138"
}
```

```json
{
  "challenge_id": "32b264fe-deec-4130-a50a-fbc0ebf27802",
  "expires_at": "2026-10-30T23:18:07.647377385Z",
  "resend_available_at": "2026-10-30T23:13:08.647377385Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "216960",
  "sent_at": "2026-10-30T23:13:07.649313558Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "32b264fe-deec-4130-a50a-fbc0ebf27802",
  "code": "216960",
  "device_ref": "sandbox-11138"
}
```

```json
{
  "session_id": "4dc705fe-ed4c-431b-8db3-ec32ae34241e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwMjg4NywiaWF0IjoxNzkzNDAxOTg3LCJqdGkiOiJmNTBlNTQ0Mi1hMGNlLTQwZWMtYWQ2NS04YjIwYmU5N2E3ZTkiLCJzaWQiOiI0ZGM3MDVmZS1lZDRjLTQzMWItOGRiMy1lYzMyYWUzNDI0MWUifQ.tFzsT1VBTTwvlPSF4HWIqVfHAx7y6Fy9amHQMN14FQc",
  "access_expires_at": "2026-10-30T23:28:07.867122837Z",
  "refresh_token": "m_8uXrQSo797UErysajW4KldZUMRqfnY5ipVQj4N_a0",
  "refresh_expires_at": "2026-11-29T23:13:07.866651154Z",
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

(the car drives 74 s to the next point)

`POST /api/driver/v1/work-sessions` → **201**

```json
{
  "command_id": "9bea6164-574c-432b-83d5-a299d8d05ae9",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T23:14:22Z",
    "sequence": 1793402062325
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "aafdba5f-eb5a-4b40-9ccf-bb5c7d55b11c",
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
  "last_heartbeat_at": "2026-10-30T23:14:22.340502Z",
  "last_location_at": "2026-10-30T23:14:22.340502Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679153383",
  "device_ref": "sandbox-26927"
}
```

```json
{
  "challenge_id": "5d9f465a-3fbe-409a-98bb-b30e628740fa",
  "expires_at": "2026-10-30T23:19:22.54477556Z",
  "resend_available_at": "2026-10-30T23:14:23.54477556Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380679153383` → **200**

```json
{
  "phone": "+380679153383",
  "audience": "CLIENT",
  "code": "147118",
  "sent_at": "2026-10-30T23:14:22.546657334Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5d9f465a-3fbe-409a-98bb-b30e628740fa",
  "code": "147118",
  "device_ref": "sandbox-26927"
}
```

```json
{
  "session_id": "7a4d6f4e-93f4-4197-a647-a59cee981246",
  "subject": {
    "type": "CLIENT",
    "id": "655f1d1c-f2d7-4b35-862a-b6b619db2365"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NTVmMWQxYy1mMmQ3LTRiMzUtODYyYS1iNmI2MTlkYjIzNjUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDAyOTYyLCJpYXQiOjE3OTM0MDIwNjIsImp0aSI6ImY2YmY5NmE3LTc1MmQtNDE5Zi04YWFjLWRiMDU5OTA3YWQ5ZiIsInNpZCI6IjdhNGQ2ZjRlLTkzZjQtNDE5Ny1hNjQ3LWE1OWNlZTk4MTI0NiJ9.SZWJZKprdWNbU_m3XyHJ25ELfB28JrX2PVN85BU3TEM",
  "access_expires_at": "2026-10-30T23:29:22.842448266Z",
  "refresh_token": "RKEezKCjdWleg9BTDzBQuCwDxvF9jNNy_PauKmp0MGE",
  "refresh_expires_at": "2026-11-29T23:14:22.842059467Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "880dadd4-5e1a-4fc4-b740-52a48942ba15",
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
  "id": "80cdf427-c7d2-421b-88f8-2d9897c73c63",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T23:19:23.049673Z",
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
  "command_id": "5fa6ccbb-4e93-4e49-a13e-642e6b340858",
  "quote_id": "80cdf427-c7d2-421b-88f8-2d9897c73c63",
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
    "phone": "+380677354330"
  }
}
```

```json
{
  "id": "ec13dbe1-af53-415e-97e8-517dff9f2882",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "655f1d1c-f2d7-4b35-862a-b6b619db2365",
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
  "created_at": "2026-10-30T23:14:23.269816Z",
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
    "id": "cda6b463-cda1-4e77-92fb-bb536f44dfe7",
    "order_id": "ec13dbe1-af53-415e-97e8-517dff9f2882",
    "expires_at": "2026-10-30T23:14:38.271691Z",
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

`POST /api/driver/v1/offers/cda6b463-cda1-4e77-92fb-bb536f44dfe7/accept` → **200**

```json
{
  "command_id": "5841d31b-7f35-4e41-87e0-b2ea80f036d6"
}
```

```json
{
  "id": "86be0f96-ca42-48f3-b583-e9a238c50a76",
  "order_id": "ec13dbe1-af53-415e-97e8-517dff9f2882",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d9f17844-70b0-439a-8685-27666b5a777e",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d9f17844-70b0-439a-8685-27666b5a777e",
  "order_id": "ec13dbe1-af53-415e-97e8-517dff9f2882",
  "assignment_id": "86be0f96-ca42-48f3-b583-e9a238c50a76",
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
    "phone": "+380677354330"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d3fc5db1-203a-4a02-9fe8-9ffdafa924f3",
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
  "id": "906f7a12-0754-435f-bc3f-ef96b61e8669",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T23:19:24.112759Z",
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
  "command_id": "9ab2dc8e-5731-476e-b5e3-a8f7fd4353e7",
  "quote_id": "906f7a12-0754-435f-bc3f-ef96b61e8669",
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
  "id": "2ea10d77-8194-471c-a2b2-eaa66cdf62fc",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "655f1d1c-f2d7-4b35-862a-b6b619db2365",
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
  "created_at": "2026-10-30T23:14:24.318647Z",
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
  "command_id": "7f435b7c-adf0-4cef-ae6d-94aea5a3f907",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-31T02:14:24Z"
}
```

```json
{
  "id": "08600f26-6213-483a-9640-e61e1f03ec91",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T23:19:24.548156Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-31T02:14:24Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "42f24504-21b7-4fc6-8c11-d5144819a2de",
  "quote_id": "08600f26-6213-483a-9640-e61e1f03ec91",
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
  "pickup_at": "2026-10-31T02:14:24Z"
}
```

```json
{
  "id": "6e29e5bf-aa19-4e1b-8b01-60cb2dc65a17",
  "short_number": 30,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "655f1d1c-f2d7-4b35-862a-b6b619db2365",
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
  "created_at": "2026-10-30T23:14:24.761488Z",
  "cancellation": null,
  "pickup_at": "2026-10-31T02:14:24Z",
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
  "command_id": "2acc98c1-bcb9-4a16-8067-846cbf207259",
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
  "id": "b4063fb3-3c99-49f4-9418-f65e36511c76",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T23:19:24.988302Z",
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
  "command_id": "8cb3bffd-b396-4740-bff6-2ad8706f7b8b",
  "quote_id": "b4063fb3-3c99-49f4-9418-f65e36511c76",
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
  "correlation_id": "d85fbc70-010e-4e97-8e68-7adec0b3df92"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "6e29e5bf-aa19-4e1b-8b01-60cb2dc65a17",
      "short_number": 30,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "655f1d1c-f2d7-4b35-862a-b6b619db2365",
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
      "created_at": "2026-10-30T23:14:24.761488Z",
      "cancellation": null,
      "pickup_at": "2026-10-31T02:14:24Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null,
      "driver": null,
      "driver_change": null
    },
    {
      "id": "2ea10d77-8194-471c-a2b2-eaa66cdf62fc",
      "short_number": 29,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "655f1d1c-f2d7-4b35-862a-b6b619db2365",
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
      "created_at": "2026-10-30T23:14:24.318647Z",
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
      "id": "ec13dbe1-af53-415e-97e8-517dff9f2882",
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "2ea10d77-8194-471c-a2b2-eaa66cdf62fc",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "655f1d1c-f2d7-4b35-862a-b6b619db2365",
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
  "created_at": "2026-10-30T23:14:24.318647Z",
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

`GET /api/rider/v1/orders/ec13dbe1-af53-415e-97e8-517dff9f2882` → **200**

```json
{
  "id": "ec13dbe1-af53-415e-97e8-517dff9f2882",
  "short_number": 28,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "655f1d1c-f2d7-4b35-862a-b6b619db2365",
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
    "id": "86be0f96-ca42-48f3-b583-e9a238c50a76",
    "order_id": "ec13dbe1-af53-415e-97e8-517dff9f2882",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "d9f17844-70b0-439a-8685-27666b5a777e",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T23:14:23.269816Z",
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
    "location_at": "2026-10-30T23:14:22.340502Z",
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

`POST /api/rider/v1/orders/ec13dbe1-af53-415e-97e8-517dff9f2882/cancel` → **200**

```json
{
  "command_id": "13310505-10f4-49b6-ad4a-1a7b5433d16c",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "ec13dbe1-af53-415e-97e8-517dff9f2882",
  "short_number": 28,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "655f1d1c-f2d7-4b35-862a-b6b619db2365",
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
    "id": "86be0f96-ca42-48f3-b583-e9a238c50a76",
    "order_id": "ec13dbe1-af53-415e-97e8-517dff9f2882",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "d9f17844-70b0-439a-8685-27666b5a777e",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T23:14:23.269816Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "ru": "Передумал ехать",
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
      "en": "Changed my mind"
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

`GET /api/rider/v1/orders/2ea10d77-8194-471c-a2b2-eaa66cdf62fc` → **200**

```json
{
  "id": "2ea10d77-8194-471c-a2b2-eaa66cdf62fc",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "655f1d1c-f2d7-4b35-862a-b6b619db2365",
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
  "created_at": "2026-10-30T23:14:24.318647Z",
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

`POST /api/rider/v1/orders/2ea10d77-8194-471c-a2b2-eaa66cdf62fc/cancel` → **200**

```json
{
  "command_id": "fa3e6fda-183c-4bc4-80da-f7327afa8dc7",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "2ea10d77-8194-471c-a2b2-eaa66cdf62fc",
  "short_number": 29,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "655f1d1c-f2d7-4b35-862a-b6b619db2365",
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
  "created_at": "2026-10-30T23:14:24.318647Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "ru": "Передумал ехать",
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
      "en": "Changed my mind"
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

`GET /api/rider/v1/orders/6e29e5bf-aa19-4e1b-8b01-60cb2dc65a17` → **200**

```json
{
  "id": "6e29e5bf-aa19-4e1b-8b01-60cb2dc65a17",
  "short_number": 30,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "655f1d1c-f2d7-4b35-862a-b6b619db2365",
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
  "created_at": "2026-10-30T23:14:24.761488Z",
  "cancellation": null,
  "pickup_at": "2026-10-31T02:14:24Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

`POST /api/rider/v1/orders/6e29e5bf-aa19-4e1b-8b01-60cb2dc65a17/cancel` → **200**

```json
{
  "command_id": "78259d02-6b9e-45df-b05c-a004571b2c18",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "6e29e5bf-aa19-4e1b-8b01-60cb2dc65a17",
  "short_number": 30,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "655f1d1c-f2d7-4b35-862a-b6b619db2365",
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
  "created_at": "2026-10-30T23:14:24.761488Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "ru": "Передумал ехать",
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
      "en": "Changed my mind"
    }
  },
  "pickup_at": "2026-10-31T02:14:24Z",
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
  "session_id": "aafdba5f-eb5a-4b40-9ccf-bb5c7d55b11c",
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
  "last_heartbeat_at": "2026-10-30T23:14:22.340502Z",
  "last_location_at": "2026-10-30T23:14:22.340502Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/aafdba5f-eb5a-4b40-9ccf-bb5c7d55b11c/close` → **200**

```json
{
  "command_id": "01b99dc2-05aa-4303-b5df-0b67cbfcee70",
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

Done: orders ec13dbe1-af53-415e-97e8-517dff9f2882, 2ea10d77-8194-471c-a2b2-eaa66cdf62fc, 6e29e5bf-aa19-4e1b-8b01-60cb2dc65a17.

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
  "session_id": "0f4e21b7-3286-4867-ac39-de90491f0992",
  "subject": {
    "type": "STAFF",
    "id": "c66269c2-93bc-421d-8af2-6f0cafc54be4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjYyNjljMi05M2JjLTQyMWQtOGFmMi02ZjBjYWZjNTRiZTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDI5NjcsImlhdCI6MTc5MzQwMjA2NywianRpIjoiZTQzYjFkMzAtM2VjYy00MzdlLTk2NGItYmZlZTYzYWI2YWZjIiwic2lkIjoiMGY0ZTIxYjctMzI4Ni00ODY3LWFjMzktZGU5MDQ5MWYwOTkyIn0.-8xpVaq24T9oB6wFSpQsRG1ALK4TDw9XZnt1NkGztGw",
  "access_expires_at": "2026-10-30T23:29:27.750833894Z",
  "refresh_token": "dUzQSGBLzOAQ6Hy4DQKJhbfhS0F-TYabEmx6Y1hkKsA",
  "refresh_expires_at": "2026-10-31T11:14:27.75044856Z",
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
  "session_id": "368323b1-a5d3-4ecc-84aa-04d8130cdcae",
  "subject": {
    "type": "STAFF",
    "id": "c66269c2-93bc-421d-8af2-6f0cafc54be4"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjYyNjljMi05M2JjLTQyMWQtOGFmMi02ZjBjYWZjNTRiZTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDI5NjgsImlhdCI6MTc5MzQwMjA2OCwianRpIjoiODFhNDYxNDgtNzk0My00NDA2LTg0NjItY2FkZmZmZDUwNTY3Iiwic2lkIjoiMzY4MzIzYjEtYTVkMy00ZWNjLTg0YWEtMDRkODEzMGNkY2FlIn0.AS0YfY5C2kiBE86LOzmWEheNFYc1CrRbaPDXRi5ya_U",
  "access_expires_at": "2026-10-30T23:29:28.15156339Z",
  "refresh_token": "Yt39y3JjYR70hkiLlVko9PFJRAmopXPJ3X0_hj_WXhw",
  "refresh_expires_at": "2026-10-31T11:14:28.151175002Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-2696"
}
```

```json
{
  "challenge_id": "b516ef93-8c85-4425-9b7a-c3557177c281",
  "expires_at": "2026-10-30T23:19:28.347432585Z",
  "resend_available_at": "2026-10-30T23:14:29.347432585Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "651994",
  "sent_at": "2026-10-30T23:14:28.349600862Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b516ef93-8c85-4425-9b7a-c3557177c281",
  "code": "651994",
  "device_ref": "sandbox-2696"
}
```

```json
{
  "session_id": "223969aa-587f-4b1d-b7f9-92921f438ce2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwMjk2OCwiaWF0IjoxNzkzNDAyMDY4LCJqdGkiOiI0MzljNzEyOC01ZWQwLTRhN2UtODNiNy03NmNiNGRiMjJjMzQiLCJzaWQiOiIyMjM5NjlhYS01ODdmLTRiMWQtYjdmOS05MjkyMWY0MzhjZTIifQ.IdLqDTmhBNKqYi5fntQgP9ppnJr7hU7K-KFlkU8oTcs",
  "access_expires_at": "2026-10-30T23:29:28.596154053Z",
  "refresh_token": "1wMWnatoMsngG-JmaSOHWqxcEVBdrwc7puw1f8B07aM",
  "refresh_expires_at": "2026-11-29T23:14:28.595706106Z",
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
  "command_id": "23a4f78b-d49f-4a40-bc43-34eb68500a12",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T23:14:29Z",
    "sequence": 1793402069209
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "74c82400-c696-46b0-aa14-cea01bcfca76",
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
  "last_heartbeat_at": "2026-10-30T23:14:29.036048Z",
  "last_location_at": "2026-10-30T23:14:29.036048Z",
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
  "command_id": "b4f15dfb-4643-49bd-b4b7-f65bea6d895d",
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
  "effective_at": "2026-10-30T23:14:29.483918Z",
  "changed_by": "c66269c2-93bc-421d-8af2-6f0cafc54be4",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "c66269c2-93bc-421d-8af2-6f0cafc54be4",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-30T23:01:54.946582Z",
  "last_entries": [
    {
      "order_id": "af3607a5-5fc8-4432-91a7-2ad89db2ae9f",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T23:01:54.946582Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "82999c86-3013-4858-b994-d059e1dd2a9e",
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
  "id": "cdd6a367-e6d9-40b4-a962-04a334e02033",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T23:19:29.921522Z",
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
  "command_id": "5d280393-2c94-430b-98b4-a831090e4271",
  "quote_id": "cdd6a367-e6d9-40b4-a962-04a334e02033",
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
    "phone": "+3806711114630"
  }
}
```

```json
{
  "id": "a4b80f53-c2c0-492f-8d88-8542f84bd957",
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
  "created_at": "2026-10-30T23:14:30.140312Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711114630"
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
    "id": "1342c3d5-5132-4429-b8c0-889a788375b2",
    "order_id": "a4b80f53-c2c0-492f-8d88-8542f84bd957",
    "expires_at": "2026-10-30T23:14:45.143406Z",
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

`POST /api/driver/v1/offers/1342c3d5-5132-4429-b8c0-889a788375b2/accept` → **200**

```json
{
  "command_id": "f42b404c-d8cd-4917-90c8-f26cc2058c7b"
}
```

```json
{
  "id": "251ddcc5-7a25-4741-81bb-a5a682d7d94f",
  "order_id": "a4b80f53-c2c0-492f-8d88-8542f84bd957",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "3e9b31f5-6110-4f28-8934-d41192ba1890",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "3e9b31f5-6110-4f28-8934-d41192ba1890",
  "order_id": "a4b80f53-c2c0-492f-8d88-8542f84bd957",
  "assignment_id": "251ddcc5-7a25-4741-81bb-a5a682d7d94f",
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
    "phone": "+3806711114630"
  }
}
```

`POST /api/driver/v1/work-sessions/74c82400-c696-46b0-aa14-cea01bcfca76/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T23:14:31Z",
    "sequence": 1793402071380
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "74c82400-c696-46b0-aa14-cea01bcfca76",
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
  "last_heartbeat_at": "2026-10-30T23:14:31.055126Z",
  "last_location_at": "2026-10-30T23:14:31.055126Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/3e9b31f5-6110-4f28-8934-d41192ba1890/arrive` → **200**

```json
{
  "command_id": "04d0fbbd-1e1c-4480-a787-421089169e7a",
  "expected_version": 0
}
```

```json
{
  "id": "3e9b31f5-6110-4f28-8934-d41192ba1890",
  "order_id": "a4b80f53-c2c0-492f-8d88-8542f84bd957",
  "assignment_id": "251ddcc5-7a25-4741-81bb-a5a682d7d94f",
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
  "arrived_at": "2026-10-30T23:14:31.266814Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711114630"
  }
}
```

`POST /api/driver/v1/trips/3e9b31f5-6110-4f28-8934-d41192ba1890/start` → **200**

```json
{
  "command_id": "b05c61b2-0ab1-4eb4-a434-9192958df306",
  "expected_version": 1
}
```

```json
{
  "id": "3e9b31f5-6110-4f28-8934-d41192ba1890",
  "order_id": "a4b80f53-c2c0-492f-8d88-8542f84bd957",
  "assignment_id": "251ddcc5-7a25-4741-81bb-a5a682d7d94f",
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
  "arrived_at": "2026-10-30T23:14:31.266814Z",
  "started_at": "2026-10-30T23:14:31.482362Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711114630"
  }
}
```

`POST /api/driver/v1/trips/3e9b31f5-6110-4f28-8934-d41192ba1890/complete` → **200**

```json
{
  "command_id": "6279fc0e-18cb-47a8-a88f-9aa856e9e0c3",
  "expected_version": 2,
  "reported_at": "2026-10-30T23:14:31Z",
  "cash_received": true
}
```

```json
{
  "id": "3e9b31f5-6110-4f28-8934-d41192ba1890",
  "order_id": "a4b80f53-c2c0-492f-8d88-8542f84bd957",
  "assignment_id": "251ddcc5-7a25-4741-81bb-a5a682d7d94f",
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
  "arrived_at": "2026-10-30T23:14:31.266814Z",
  "started_at": "2026-10-30T23:14:31.482362Z",
  "completed_at": "2026-10-30T23:14:31.693229Z",
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
  "command_id": "cf478081-f699-42f2-99bd-2f9e82e38dca",
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
  "id": "c35e4166-69a9-402e-be3d-160e8ad4e7db",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T23:19:31.912555Z",
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
  "command_id": "38984bf9-61e8-4435-abd8-d2023ff3ee70",
  "quote_id": "c35e4166-69a9-402e-be3d-160e8ad4e7db",
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
    "phone": "+380671111222"
  }
}
```

```json
{
  "id": "8e197656-d7dd-46ec-a266-b6cb3e5d9d4c",
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
  "created_at": "2026-10-30T23:14:32.121477Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671111222"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/8e197656-d7dd-46ec-a266-b6cb3e5d9d4c` → **200**

```json
{
  "id": "8e197656-d7dd-46ec-a266-b6cb3e5d9d4c",
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
  "created_at": "2026-10-30T23:14:32.121477Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671111222"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/8e197656-d7dd-46ec-a266-b6cb3e5d9d4c/cancel` → **200**

```json
{
  "command_id": "ed34f0ec-591c-4c2e-8240-ee94c3cf88ba",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "8e197656-d7dd-46ec-a266-b6cb3e5d9d4c",
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
  "created_at": "2026-10-30T23:14:32.121477Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671111222"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "OPERATOR_ERROR",
    "reason_labels": {
      "ru": "Ошибка оператора",
      "pl": "Błąd operatora",
      "uk": "Помилка оператора",
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
  "staff_id": "c66269c2-93bc-421d-8af2-6f0cafc54be4",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-30T23:01:54.946582Z",
  "last_entries": [
    {
      "order_id": "8e197656-d7dd-46ec-a266-b6cb3e5d9d4c",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-30T23:14:32.560049Z"
    },
    {
      "order_id": "a4b80f53-c2c0-492f-8d88-8542f84bd957",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-30T23:14:31.697142Z"
    },
    {
      "order_id": "af3607a5-5fc8-4432-91a7-2ad89db2ae9f",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T23:01:54.946582Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "74c82400-c696-46b0-aa14-cea01bcfca76",
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
  "last_heartbeat_at": "2026-10-30T23:14:31.055126Z",
  "last_location_at": "2026-10-30T23:14:31.055126Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/74c82400-c696-46b0-aa14-cea01bcfca76/close` → **200**

```json
{
  "command_id": "215f97ea-078e-4e7f-a0a2-d9e81baa29fd",
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

Done: operator bonus for fulfilled a4b80f53-c2c0-492f-8d88-8542f84bd957 and operator-fault cancellation 8e197656-d7dd-46ec-a266-b6cb3e5d9d4c.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674963311",
  "device_ref": "sandbox-18742"
}
```

```json
{
  "challenge_id": "071ffff1-d848-4ad7-8d1c-315be3697c05",
  "expires_at": "2026-10-30T23:19:36.71184101Z",
  "resend_available_at": "2026-10-30T23:14:37.71184101Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380674963311` → **200**

```json
{
  "phone": "+380674963311",
  "audience": "CLIENT",
  "code": "162919",
  "sent_at": "2026-10-30T23:14:36.713727303Z",
  "channel": "SMS"
}
```

## "Call me instead" on the first try still gets an SMS; the resend is a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677685044",
  "device_ref": "sandbox-5533",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "aec4e4aa-edab-4a1c-bad5-4f0d51bd6399",
  "expires_at": "2026-10-30T23:19:38.134411908Z",
  "resend_available_at": "2026-10-30T23:14:39.134411908Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380677685044` → **200**

```json
{
  "phone": "+380677685044",
  "audience": "CLIENT",
  "code": "630878",
  "sent_at": "2026-10-30T23:14:38.136556185Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677685044",
  "device_ref": "sandbox-3940",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "660301e6-a4d2-4abf-9b9d-0f811e0920a1",
  "expires_at": "2026-10-30T23:19:39.571447243Z",
  "resend_available_at": "2026-10-30T23:14:40.571447243Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380677685044` → **200**

```json
{
  "phone": "+380677685044",
  "audience": "CLIENT",
  "code": "495106",
  "sent_at": "2026-10-30T23:14:39.573403315Z",
  "channel": "VOICE"
}
```

## The SMS does not get through: one request, one attempt; the resend comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670220000",
  "device_ref": "sandbox-28746"
}
```

```json
{
  "challenge_id": "1dc7fb20-2870-47ad-8709-af92519fa8a7",
  "expires_at": "2026-10-30T23:19:41.002425146Z",
  "resend_available_at": "2026-10-30T23:14:42.002425146Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670220000",
  "device_ref": "sandbox-31414"
}
```

```json
{
  "challenge_id": "5c2cff06-b735-4b59-a66c-c7feb055c137",
  "expires_at": "2026-10-30T23:19:42.397124524Z",
  "resend_available_at": "2026-10-30T23:14:43.397124524Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380670220000` → **200**

```json
{
  "phone": "+380670220000",
  "audience": "CLIENT",
  "code": "328532",
  "sent_at": "2026-10-30T23:14:42.400135886Z",
  "channel": "VOICE"
}
```

## A second call in the hour is made, the third is refused

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670220000",
  "device_ref": "sandbox-2245",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "ecd004b8-74a3-4df1-9daf-84e2e66f09b5",
  "expires_at": "2026-10-30T23:19:43.820839372Z",
  "resend_available_at": "2026-10-30T23:14:44.820839372Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380670220000` → **200**

```json
{
  "phone": "+380670220000",
  "audience": "CLIENT",
  "code": "755486",
  "sent_at": "2026-10-30T23:14:43.822932163Z",
  "channel": "VOICE"
}
```

`POST /auth/v1/otp/challenges` → **429**

```json
{
  "audience": "CLIENT",
  "phone": "+380670220000",
  "device_ref": "sandbox-20710",
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
  "correlation_id": "7149593f-828a-4b7c-b40c-85294c37183d",
  "retryable": true,
  "retry_after_seconds": 3600
}
```

## Numbers outside Poland and Ukraine get nothing

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+442000008054"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "11b5b15a-ed09-48dd-96d6-30810be595ba"
}
```

`GET /sandbox/v1/otp?phone=%2B442000008054` → **404**

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+37120025512"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "96ec0563-a785-411a-8ac0-5c9f0b035ebe"
}
```

`GET /sandbox/v1/otp?phone=%2B37120025512` → **404**

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
  "session_id": "992d0391-2419-49cc-905f-60fd304fea6a",
  "subject": {
    "type": "STAFF",
    "id": "c66269c2-93bc-421d-8af2-6f0cafc54be4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjYyNjljMi05M2JjLTQyMWQtOGFmMi02ZjBjYWZjNTRiZTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDI5ODYsImlhdCI6MTc5MzQwMjA4NiwianRpIjoiM2E4OTI1MmMtM2RiMS00YTEwLTgyZGQtZjUwNDkzNzhlYTQ4Iiwic2lkIjoiOTkyZDAzOTEtMjQxOS00OWNjLTkwNWYtNjBmZDMwNGZlYTZhIn0.T8BsGCm_K_4zyX15nTThbbnmBmkEf2NCGzaqmqd271s",
  "access_expires_at": "2026-10-30T23:29:46.121125881Z",
  "refresh_token": "o3kMvWXSSOgxjzteELFPwcdenjV4aGg0wLgktamD-cg",
  "refresh_expires_at": "2026-10-31T11:14:46.120751424Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380670220000` → **200**

```json
{
  "deliveries": [
    {
      "id": "3dbf564b-5279-4d57-9c2b-90fcd9f95581",
      "challenge_id": "ecd004b8-74a3-4df1-9daf-84e2e66f09b5",
      "phone": "+380670220000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-f0cd37c3-990f-4eae-952c-de0fa99ff5fd",
      "error": null,
      "attempted_at": "2026-10-30T23:14:43.82318Z"
    },
    {
      "id": "9a1a0833-37cc-4172-a750-ba87aa41f8de",
      "challenge_id": "5c2cff06-b735-4b59-a66c-c7feb055c137",
      "phone": "+380670220000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-a5af1a74-0595-41df-aae4-377afcb18435",
      "error": null,
      "attempted_at": "2026-10-30T23:14:42.400395Z"
    },
    {
      "id": "6e6ef884-fa68-4364-ac45-bd72f13524f6",
      "challenge_id": "1dc7fb20-2870-47ad-8709-af92519fa8a7",
      "phone": "+380670220000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-30T23:14:41.004682Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380670220000` → **200**

```json
{
  "phone": "+380670220000",
  "audience": "CLIENT",
  "code": "755486",
  "sent_at": "2026-10-30T23:14:43.822932163Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380677685044` → **200**

```json
{
  "deliveries": [
    {
      "id": "43e1f7e7-879b-4729-9314-3f417c8c234c",
      "challenge_id": "660301e6-a4d2-4abf-9b9d-0f811e0920a1",
      "phone": "+380677685044",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-dfa02067-a49b-4494-9f2e-20ff562f55e3",
      "error": null,
      "attempted_at": "2026-10-30T23:14:39.57378Z"
    },
    {
      "id": "7d0f0a2c-b934-45a7-8f03-65b5d5837319",
      "challenge_id": "aec4e4aa-edab-4a1c-bad5-4f0d51bd6399",
      "phone": "+380677685044",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-bd29cde7-d2b4-4692-949a-8f2f74b92318",
      "error": null,
      "attempted_at": "2026-10-30T23:14:38.136835Z"
    }
  ]
}
```

Done: SMS to +380674963311; SMS then a call to +380677685044; a failed SMS, two calls and a refused third to +380670220000; +44 and +371 refused.

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
  "session_id": "b511ae8a-4857-4710-81ba-0fe7ae9e74ea",
  "subject": {
    "type": "STAFF",
    "id": "c66269c2-93bc-421d-8af2-6f0cafc54be4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjYyNjljMi05M2JjLTQyMWQtOGFmMi02ZjBjYWZjNTRiZTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDI5ODYsImlhdCI6MTc5MzQwMjA4NiwianRpIjoiMjUxZTYxYWMtNmVlMi00NTEzLWFlOGMtMTYyZjJkZmU0N2Y4Iiwic2lkIjoiYjUxMWFlOGEtNDg1Ny00NzEwLTgxYmEtMGZlN2FlOWU3NGVhIn0.v1-2fP0sZyCRvE8dcrnH7wlMWwFU3DMYBttkLHdbpew",
  "access_expires_at": "2026-10-30T23:29:46.972980052Z",
  "refresh_token": "Tt4Z3_0yI4AYl90ImOd3qDyQgCrJuTFvfEBHTBt60hY",
  "refresh_expires_at": "2026-10-31T11:14:46.97256143Z",
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
  "session_id": "214b964f-0c41-4087-8422-cc9904a3fa9a",
  "subject": {
    "type": "STAFF",
    "id": "c66269c2-93bc-421d-8af2-6f0cafc54be4"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjYyNjljMi05M2JjLTQyMWQtOGFmMi02ZjBjYWZjNTRiZTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDI5ODcsImlhdCI6MTc5MzQwMjA4NywianRpIjoiZDU1NTA2ZWItNDBiNy00YmM0LWJlMTMtNDYyZGM0ZWRhMWE4Iiwic2lkIjoiMjE0Yjk2NGYtMGM0MS00MDg3LTg0MjItY2M5OTA0YTNmYTlhIn0.T9MYQEEhLbji7Vd2-gsNcTog4NJ0fTiUERoX1Q5Lrmg",
  "access_expires_at": "2026-10-30T23:29:47.37566633Z",
  "refresh_token": "CoaIO4NN3NCz0O1OByJD8AQTihYPfIAPE20tMYPeybw",
  "refresh_expires_at": "2026-10-31T11:14:47.375298479Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "c66269c2-93bc-421d-8af2-6f0cafc54be4",
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

`POST /api/admin/v1/staff-extensions/c66269c2-93bc-421d-8af2-6f0cafc54be4` → **200**

```json
{
  "command_id": "0c498c95-16f4-4363-8806-56f902bf1d02",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "c66269c2-93bc-421d-8af2-6f0cafc54be4",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "9ef59123-69b0-4a7b-937c-24c9dbcaa72b",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T23:14:48.222869Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T23:14:48.222869Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "6ecf00f4-f53d-4332-a704-0c81054ae945",
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
  "id": "2bc50b69-a8a0-40e5-81d7-e69688302276",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T23:19:48.619658Z",
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
  "command_id": "31557fa8-7fd5-4713-b78a-605617b97791",
  "quote_id": "2bc50b69-a8a0-40e5-81d7-e69688302276",
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
    "phone": "+380679640785"
  }
}
```

```json
{
  "id": "3624dda7-f763-4d64-9300-b1759e31a32f",
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
  "created_at": "2026-10-30T23:14:48.836656Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679640785"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/3624dda7-f763-4d64-9300-b1759e31a32f/calls` → **201**

```json
{
  "command_id": "8549d51b-0b6f-48bb-8c37-3f8b33c0a0b7",
  "to": "CALLER"
}
```

```json
{
  "id": "3c7e5e85-dfd7-4220-a2d6-49583dd68c1f",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "c66269c2-93bc-421d-8af2-6f0cafc54be4",
  "order_ids": [
    "3624dda7-f763-4d64-9300-b1759e31a32f"
  ],
  "started_at": "2026-10-30T23:14:49.086222Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/3624dda7-f763-4d64-9300-b1759e31a32f/calls` → **201**

```json
{
  "command_id": "8549d51b-0b6f-48bb-8c37-3f8b33c0a0b7",
  "to": "CALLER"
}
```

```json
{
  "id": "3c7e5e85-dfd7-4220-a2d6-49583dd68c1f",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "c66269c2-93bc-421d-8af2-6f0cafc54be4",
  "order_ids": [
    "3624dda7-f763-4d64-9300-b1759e31a32f"
  ],
  "started_at": "2026-10-30T23:14:49.086222Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "3c7e5e85-dfd7-4220-a2d6-49583dd68c1f",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380679640785",
    "at": "2026-10-30T23:14:49.088501859Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "3c7e5e85-dfd7-4220-a2d6-49583dd68c1f",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.23281",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "3c7e5e85-dfd7-4220-a2d6-49583dd68c1f"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "3c7e5e85-dfd7-4220-a2d6-49583dd68c1f",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=3624dda7-f763-4d64-9300-b1759e31a32f` → **200**

```json
{
  "calls": [
    {
      "id": "3c7e5e85-dfd7-4220-a2d6-49583dd68c1f",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "c66269c2-93bc-421d-8af2-6f0cafc54be4",
      "order_ids": [
        "3624dda7-f763-4d64-9300-b1759e31a32f"
      ],
      "started_at": "2026-10-30T23:14:49.086222Z",
      "answered_at": "2026-10-30T23:14:49.58356Z",
      "ended_at": "2026-10-30T23:14:49.604494Z",
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

`GET /api/operator/v1/calls?order_id=3624dda7-f763-4d64-9300-b1759e31a32f` → **200**

```json
{
  "calls": [
    {
      "id": "3c7e5e85-dfd7-4220-a2d6-49583dd68c1f",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "c66269c2-93bc-421d-8af2-6f0cafc54be4",
      "order_ids": [
        "3624dda7-f763-4d64-9300-b1759e31a32f"
      ],
      "started_at": "2026-10-30T23:14:49.086222Z",
      "answered_at": "2026-10-30T23:14:49.58356Z",
      "ended_at": "2026-10-30T23:14:49.604494Z",
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

`GET /api/operator/v1/calls?order_id=3624dda7-f763-4d64-9300-b1759e31a32f` → **200**

```json
{
  "calls": [
    {
      "id": "3c7e5e85-dfd7-4220-a2d6-49583dd68c1f",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "c66269c2-93bc-421d-8af2-6f0cafc54be4",
      "order_ids": [
        "3624dda7-f763-4d64-9300-b1759e31a32f"
      ],
      "started_at": "2026-10-30T23:14:49.086222Z",
      "answered_at": "2026-10-30T23:14:49.58356Z",
      "ended_at": "2026-10-30T23:14:49.604494Z",
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

`GET /api/operator/v1/calls?order_id=3624dda7-f763-4d64-9300-b1759e31a32f` → **200**

```json
{
  "calls": [
    {
      "id": "3c7e5e85-dfd7-4220-a2d6-49583dd68c1f",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "c66269c2-93bc-421d-8af2-6f0cafc54be4",
      "order_ids": [
        "3624dda7-f763-4d64-9300-b1759e31a32f"
      ],
      "started_at": "2026-10-30T23:14:49.086222Z",
      "answered_at": "2026-10-30T23:14:49.58356Z",
      "ended_at": "2026-10-30T23:14:49.604494Z",
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

`GET /api/operator/v1/calls?order_id=3624dda7-f763-4d64-9300-b1759e31a32f` → **200**

```json
{
  "calls": [
    {
      "id": "3c7e5e85-dfd7-4220-a2d6-49583dd68c1f",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "c66269c2-93bc-421d-8af2-6f0cafc54be4",
      "order_ids": [
        "3624dda7-f763-4d64-9300-b1759e31a32f"
      ],
      "started_at": "2026-10-30T23:14:49.086222Z",
      "answered_at": "2026-10-30T23:14:49.58356Z",
      "ended_at": "2026-10-30T23:14:49.604494Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T23:14:57.425861Z"
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

`GET /api/operator/v1/orders/3624dda7-f763-4d64-9300-b1759e31a32f` → **200**

```json
{
  "id": "3624dda7-f763-4d64-9300-b1759e31a32f",
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
  "created_at": "2026-10-30T23:14:48.836656Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679640785"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/3624dda7-f763-4d64-9300-b1759e31a32f/cancel` → **200**

```json
{
  "command_id": "27f82628-7b42-4512-855f-eddb2308b32f",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "3624dda7-f763-4d64-9300-b1759e31a32f",
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
  "created_at": "2026-10-30T23:14:48.836656Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679640785"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "ru": "Нет свободных машин",
      "pl": "Brak wolnych aut",
      "uk": "Немає вільних авто",
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
  "command_id": "f29c9512-878c-4ee4-94e2-76518d32e9c3",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-30T23:14:59.123004Z",
  "extension": "101"
}
```

Done: outgoing call 3c7e5e85-dfd7-4220-a2d6-49583dd68c1f from order 3624dda7-f763-4d64-9300-b1759e31a32f, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639021071",
  "device_ref": "sandbox-21344"
}
```

```json
{
  "challenge_id": "13bfe02e-8303-44c2-bd23-cf0e7aa726cc",
  "expires_at": "2026-10-30T23:19:59.33345568Z",
  "resend_available_at": "2026-10-30T23:15:00.33345568Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639021071` → **200**

```json
{
  "phone": "+380639021071",
  "audience": "CLIENT",
  "code": "253125",
  "sent_at": "2026-10-30T23:14:59.335461638Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "13bfe02e-8303-44c2-bd23-cf0e7aa726cc",
  "code": "253125",
  "device_ref": "sandbox-21344"
}
```

```json
{
  "session_id": "9a66ee68-4af7-4551-bb7d-fbaccb1d6e70",
  "subject": {
    "type": "CLIENT",
    "id": "15fe5c81-bf2d-4c76-ae5e-a4a0edfff34c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNWZlNWM4MS1iZjJkLTRjNzYtYWU1ZS1hNGEwZWRmZmYzNGMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDAyOTk5LCJpYXQiOjE3OTM0MDIwOTksImp0aSI6IjhhYjVlNmJkLWIwYzYtNGZkNC1iYjdjLWU5MjM5YTBhMDNlNCIsInNpZCI6IjlhNjZlZTY4LTRhZjctNDU1MS1iYjdkLWZiYWNjYjFkNmU3MCJ9.mWoggLMyTbCaqPKuPZdjzl_MY1XanqdE2jFoj8K3uf4",
  "access_expires_at": "2026-10-30T23:29:59.558242434Z",
  "refresh_token": "hA_YfAhRoB6oI1VDNCuDY4oDUh51EQIrgwkJc9h7NkU",
  "refresh_expires_at": "2026-11-29T23:14:59.557893845Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "15fe5c81-bf2d-4c76-ae5e-a4a0edfff34c",
  "session_id": "9a66ee68-4af7-4551-bb7d-fbaccb1d6e70",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639021071",
  "device_ref": "sandbox-21433"
}
```

```json
{
  "challenge_id": "23582e5a-ccc7-4f26-a8f1-c642d00ec714",
  "expires_at": "2026-10-30T23:20:01.959548147Z",
  "resend_available_at": "2026-10-30T23:15:02.959548147Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639021071` → **200**

```json
{
  "phone": "+380639021071",
  "audience": "CLIENT",
  "code": "741097",
  "sent_at": "2026-10-30T23:15:01.961253474Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "23582e5a-ccc7-4f26-a8f1-c642d00ec714",
  "code": "741097",
  "device_ref": "sandbox-21433"
}
```

```json
{
  "session_id": "19d64d42-daca-49e8-9a28-247340bd2326",
  "subject": {
    "type": "CLIENT",
    "id": "15fe5c81-bf2d-4c76-ae5e-a4a0edfff34c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNWZlNWM4MS1iZjJkLTRjNzYtYWU1ZS1hNGEwZWRmZmYzNGMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDAzMDAyLCJpYXQiOjE3OTM0MDIxMDIsImp0aSI6IjZkMmRiZDllLTE1YzEtNDlmMC1iNDE3LTM0ZTE3MDZiMWVmNCIsInNpZCI6IjE5ZDY0ZDQyLWRhY2EtNDllOC05YTI4LTI0NzM0MGJkMjMyNiJ9.fKK4jRdVsuJS1G6bFvAhlNrXu3Ymu14Xzs5aLMckyDo",
  "access_expires_at": "2026-10-30T23:30:02.182779646Z",
  "refresh_token": "1Qjtw_QJcngA28QCyEQXsD4MZPA04KBL5Dy7buc4Rbc",
  "refresh_expires_at": "2026-11-29T23:15:02.182404258Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "ac3287ae-260e-4fe4-85f3-eb237d7db409",
  "expires_at": "2026-10-30T23:20:04.385209485Z",
  "resend_available_at": "2026-10-30T23:15:05.385209485Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639021071` → **200**

```json
{
  "phone": "+380639021071",
  "audience": "CLIENT",
  "code": "623869",
  "sent_at": "2026-10-30T23:15:04.38692745Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380632020541"
}
```

```json
{
  "challenge_id": "a598c2e7-7f33-47c8-8f3a-9e883a1e55d9",
  "expires_at": "2026-10-30T23:20:04.611111926Z",
  "resend_available_at": "2026-10-30T23:15:05.611111926Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632020541` → **200**

```json
{
  "phone": "+380632020541",
  "audience": "CLIENT",
  "code": "741047",
  "sent_at": "2026-10-30T23:15:04.612810602Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "a840adde-2dcc-44b3-9ab7-da41d071d970",
  "current_challenge_id": "ac3287ae-260e-4fe4-85f3-eb237d7db409",
  "current_code": "000000",
  "new_challenge_id": "a598c2e7-7f33-47c8-8f3a-9e883a1e55d9",
  "new_code": "741047"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "70be9d08-3d49-4734-9e60-8080bc3f9804"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "e1f47f74-be25-4447-9682-f5ef305f5277",
  "current_challenge_id": "ac3287ae-260e-4fe4-85f3-eb237d7db409",
  "current_code": "623869",
  "new_challenge_id": "a598c2e7-7f33-47c8-8f3a-9e883a1e55d9",
  "new_code": "741047"
}
```

```json
{
  "subject_id": "15fe5c81-bf2d-4c76-ae5e-a4a0edfff34c",
  "phone": "+380632020541",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "15fe5c81-bf2d-4c76-ae5e-a4a0edfff34c",
  "session_id": "9a66ee68-4af7-4551-bb7d-fbaccb1d6e70",
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
  "correlation_id": "e517df18-4cd8-498a-aac9-1b5ab36a3ac4"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632020541",
  "device_ref": "sandbox-24244"
}
```

```json
{
  "challenge_id": "e660d635-098d-45a7-b6e9-13d4c0a15ae4",
  "expires_at": "2026-10-30T23:20:07.705471267Z",
  "resend_available_at": "2026-10-30T23:15:08.705471267Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632020541` → **200**

```json
{
  "phone": "+380632020541",
  "audience": "CLIENT",
  "code": "497707",
  "sent_at": "2026-10-30T23:15:07.707434695Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e660d635-098d-45a7-b6e9-13d4c0a15ae4",
  "code": "497707",
  "device_ref": "sandbox-24244"
}
```

```json
{
  "session_id": "cbfbfd40-cd03-4a93-812d-936af0aef3f6",
  "subject": {
    "type": "CLIENT",
    "id": "15fe5c81-bf2d-4c76-ae5e-a4a0edfff34c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNWZlNWM4MS1iZjJkLTRjNzYtYWU1ZS1hNGEwZWRmZmYzNGMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDAzMDA3LCJpYXQiOjE3OTM0MDIxMDcsImp0aSI6IjViOTk0NWQ4LTgzYzYtNDZlNC1hYWEwLWQ0N2NiYTRjNWU4NyIsInNpZCI6ImNiZmJmZDQwLWNkMDMtNGE5My04MTJkLTkzNmFmMGFlZjNmNiJ9.PtX-hctjo3qn8nHBhIGw5hqULYaAhGYPhW4xwCMyVL0",
  "access_expires_at": "2026-10-30T23:30:07.932137774Z",
  "refresh_token": "P-psbQ2-D673p5BixM0JCmhLJbbJXs0QRfGBCMzcNBE",
  "refresh_expires_at": "2026-11-29T23:15:07.931712699Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "15fe5c81-bf2d-4c76-ae5e-a4a0edfff34c",
  "session_id": "cbfbfd40-cd03-4a93-812d-936af0aef3f6",
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
  "session_id": "2e9db536-50e4-4667-8403-7d6991d7c757",
  "subject": {
    "type": "STAFF",
    "id": "c66269c2-93bc-421d-8af2-6f0cafc54be4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjYyNjljMi05M2JjLTQyMWQtOGFmMi02ZjBjYWZjNTRiZTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDMwMDgsImlhdCI6MTc5MzQwMjEwOCwianRpIjoiZmU2YjNkODgtODM3MC00YzljLTkxZjEtM2Q2NmI5NGI2MzkwIiwic2lkIjoiMmU5ZGI1MzYtNTBlNC00NjY3LTg0MDMtN2Q2OTkxZDdjNzU3In0.Sbxfv970LD3lZiArp72qKgorcaDiDZwJfW5ctmSVxlI",
  "access_expires_at": "2026-10-30T23:30:08.530128513Z",
  "refresh_token": "-YwpOUMnUPYZDZhtSooROGMjlduOn1aOuJWvZpgXk7Q",
  "refresh_expires_at": "2026-10-31T11:15:08.529719697Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/15fe5c81-bf2d-4c76-ae5e-a4a0edfff34c` → **200**

```json
{
  "client": {
    "id": "15fe5c81-bf2d-4c76-ae5e-a4a0edfff34c",
    "phone": "+380632020541",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T23:14:59.556574Z",
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

`POST /api/admin/v1/clients/15fe5c81-bf2d-4c76-ae5e-a4a0edfff34c/phone/new-code` → **201**

```json
{
  "phone": "+380632045328"
}
```

```json
{
  "challenge_id": "3ce0d554-ac87-4311-9c2a-1a90240e2a5e",
  "expires_at": "2026-10-30T23:20:08.948253927Z",
  "resend_available_at": "2026-10-30T23:15:09.948253927Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632045328` → **200**

```json
{
  "phone": "+380632045328",
  "audience": "CLIENT",
  "code": "756801",
  "sent_at": "2026-10-30T23:15:08.950334383Z",
  "channel": "SMS"
}
```

## Without the right code nothing changes; with it, support sets the phone

`POST /api/admin/v1/clients/15fe5c81-bf2d-4c76-ae5e-a4a0edfff34c/phone` → **422**

```json
{
  "command_id": "40ee2bcd-2ed1-4780-9190-c89194b0deea",
  "expected_version": 3,
  "new_challenge_id": "3ce0d554-ac87-4311-9c2a-1a90240e2a5e",
  "new_code": "756802",
  "reason": "Passport checked at the office"
}
```

```json
{
  "instance": "/api/admin/v1/clients/15fe5c81-bf2d-4c76-ae5e-a4a0edfff34c/phone",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "9eb8e3d2-618d-4635-b456-d80851db0671"
}
```

`POST /api/admin/v1/clients/15fe5c81-bf2d-4c76-ae5e-a4a0edfff34c/phone` → **400**

```json
{
  "command_id": "48b6c91c-23a1-43d1-b33d-5041f31b7b92",
  "expected_version": 3,
  "new_challenge_id": "3ce0d554-ac87-4311-9c2a-1a90240e2a5e",
  "new_code": "756801",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/15fe5c81-bf2d-4c76-ae5e-a4a0edfff34c/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "65e7293e-6621-4580-bd10-f604e2ca8ef7",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/clients/15fe5c81-bf2d-4c76-ae5e-a4a0edfff34c/phone` → **200**

```json
{
  "command_id": "496fa866-e785-4301-bc2a-550cd17ce515",
  "expected_version": 3,
  "new_challenge_id": "3ce0d554-ac87-4311-9c2a-1a90240e2a5e",
  "new_code": "756801",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "15fe5c81-bf2d-4c76-ae5e-a4a0edfff34c",
  "phone": "+380632045328",
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
  "correlation_id": "9f013c31-7a25-4d33-8834-c079a1094d17"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632045328",
  "device_ref": "sandbox-11482"
}
```

```json
{
  "challenge_id": "d115cb5e-7c86-4518-b83e-ec7c2d65ccb3",
  "expires_at": "2026-10-30T23:20:09.971915637Z",
  "resend_available_at": "2026-10-30T23:15:10.971915637Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632045328` → **200**

```json
{
  "phone": "+380632045328",
  "audience": "CLIENT",
  "code": "270488",
  "sent_at": "2026-10-30T23:15:09.974329736Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d115cb5e-7c86-4518-b83e-ec7c2d65ccb3",
  "code": "270488",
  "device_ref": "sandbox-11482"
}
```

```json
{
  "session_id": "67ce1955-3805-40f7-b6c0-087e5801cf39",
  "subject": {
    "type": "CLIENT",
    "id": "15fe5c81-bf2d-4c76-ae5e-a4a0edfff34c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNWZlNWM4MS1iZjJkLTRjNzYtYWU1ZS1hNGEwZWRmZmYzNGMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDAzMDEwLCJpYXQiOjE3OTM0MDIxMTAsImp0aSI6ImU2Y2EyZjYxLTFmN2YtNDY4Ny04OGQxLWQ3MTE4N2UwOWI0MyIsInNpZCI6IjY3Y2UxOTU1LTM4MDUtNDBmNy1iNmMwLTA4N2U1ODAxY2YzOSJ9.wMtBybs1ba-BVN8f4R4ywNWOse8YFN95AEAu06ty-C4",
  "access_expires_at": "2026-10-30T23:30:10.194370596Z",
  "refresh_token": "q0w_tFFJAiPTO5JIq5h6Lf2OCNJ8ooI_UgMtP8FBqNo",
  "refresh_expires_at": "2026-11-29T23:15:10.194010282Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "15fe5c81-bf2d-4c76-ae5e-a4a0edfff34c",
  "session_id": "67ce1955-3805-40f7-b6c0-087e5801cf39",
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
  "phone": "+380633754936",
  "device_ref": "sandbox-20192"
}
```

```json
{
  "challenge_id": "31add9f5-c63f-477e-8ff3-b9d16560a090",
  "expires_at": "2026-10-30T23:20:10.579044425Z",
  "resend_available_at": "2026-10-30T23:15:11.579044425Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380633754936` → **200**

```json
{
  "phone": "+380633754936",
  "audience": "CLIENT",
  "code": "041677",
  "sent_at": "2026-10-30T23:15:10.580886627Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "31add9f5-c63f-477e-8ff3-b9d16560a090",
  "code": "041677",
  "device_ref": "sandbox-20192"
}
```

```json
{
  "session_id": "b3e0d9c7-8748-4e40-9f3b-8163e9b6f107",
  "subject": {
    "type": "CLIENT",
    "id": "e15542f9-2ad0-4299-ac3d-d288c91cd4b5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMTU1NDJmOS0yYWQwLTQyOTktYWMzZC1kMjg4YzkxY2Q0YjUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDAzMDEwLCJpYXQiOjE3OTM0MDIxMTAsImp0aSI6ImJmODU2OGE0LTc3ZTUtNGMzNy05NjhlLWQwNzliZjU0NGQ0OSIsInNpZCI6ImIzZTBkOWM3LTg3NDgtNGU0MC05ZjNiLTgxNjNlOWI2ZjEwNyJ9.SDu2o16iJzpXD4MSOOy9dIR6msk3p4SoIEgbAaenODY",
  "access_expires_at": "2026-10-30T23:30:10.801877355Z",
  "refresh_token": "p0bxq32AoN6scgsaExbxjLxeLCBQWlddBtR8yBeZKTw",
  "refresh_expires_at": "2026-11-29T23:15:10.801544311Z",
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
  "session_id": "9e7bffbd-4dc2-41a6-8a30-8673f492592b",
  "subject": {
    "type": "STAFF",
    "id": "c66269c2-93bc-421d-8af2-6f0cafc54be4"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjYyNjljMi05M2JjLTQyMWQtOGFmMi02ZjBjYWZjNTRiZTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDMwMTEsImlhdCI6MTc5MzQwMjExMSwianRpIjoiYzE1ZmNkNTQtYTI5Yy00Mzk3LTk0MjYtYTQxNTZkNzgyZTExIiwic2lkIjoiOWU3YmZmYmQtNGRjMi00MWE2LThhMzAtODY3M2Y0OTI1OTJiIn0.93eQbTTPETAOjW3lciVM6tBhlZd0G4c5OIzJuyGn-p8",
  "access_expires_at": "2026-10-30T23:30:11.593325721Z",
  "refresh_token": "6xMjRRMfR32pI8NrGlm9edr2iivquJf870qvanScuXE",
  "refresh_expires_at": "2026-10-31T11:15:11.592977174Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380633754936` → **200**

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
  "correlation_id": "408159ce-2fcf-4a4f-99cb-963d823297b4"
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
  "session_id": "e72728ef-630a-4f5c-84ca-cedee0e994a2",
  "subject": {
    "type": "STAFF",
    "id": "c66269c2-93bc-421d-8af2-6f0cafc54be4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjYyNjljMi05M2JjLTQyMWQtOGFmMi02ZjBjYWZjNTRiZTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDMwMTIsImlhdCI6MTc5MzQwMjExMiwianRpIjoiZDIzMjRiNGEtZDVlOC00YmJmLWFkNjUtNmZhODllZWU2Njg0Iiwic2lkIjoiZTcyNzI4ZWYtNjMwYS00ZjVjLTg0Y2EtY2VkZWUwZTk5NGEyIn0.kq1HwsJKn7v1dlMQiOeYRyTuEKQnPLhQVRbuT6fUlgM",
  "access_expires_at": "2026-10-30T23:30:12.380313753Z",
  "refresh_token": "JQH4_mfdPUb61WQRuHfSs4tVGU_LULhOvaDifX_a4qA",
  "refresh_expires_at": "2026-10-31T11:15:12.379929322Z",
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
  "changed_by": "c66269c2-93bc-421d-8af2-6f0cafc54be4",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T22:58:02.546105Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "3cdad6be-2049-4406-bf8e-8f5906e83995",
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
  "changed_by": "c66269c2-93bc-421d-8af2-6f0cafc54be4",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-30T23:15:12.77926173Z"
}
```

## The rider books the airport for 2026-10-31T02:15:12Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600490409",
  "device_ref": "sandbox-15549"
}
```

```json
{
  "challenge_id": "1a99de5a-493b-4806-9895-09446243f0c3",
  "expires_at": "2026-10-30T23:20:12.989860892Z",
  "resend_available_at": "2026-10-30T23:15:13.989860892Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600490409` → **200**

```json
{
  "phone": "+48600490409",
  "audience": "CLIENT",
  "code": "697293",
  "sent_at": "2026-10-30T23:15:12.991729491Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1a99de5a-493b-4806-9895-09446243f0c3",
  "code": "697293",
  "device_ref": "sandbox-15549"
}
```

```json
{
  "session_id": "826096f1-ef46-45f1-a051-1136c749e7c3",
  "subject": {
    "type": "CLIENT",
    "id": "8eac81f4-f165-434f-b28b-41b7ba1e529e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZWFjODFmNC1mMTY1LTQzNGYtYjI4Yi00MWI3YmExZTUyOWUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDAzMDEzLCJpYXQiOjE3OTM0MDIxMTMsImp0aSI6ImQ0MDZhYmZmLTM3ODItNDBiMC05Y2FjLWExMWZkOWZkZTNjMSIsInNpZCI6IjgyNjA5NmYxLWVmNDYtNDVmMS1hMDUxLTExMzZjNzQ5ZTdjMyJ9.tHSR_tcuGmogutVYMSzm2YgZn3hoO_T4T1EmB5NBWMQ",
  "access_expires_at": "2026-10-30T23:30:13.203859622Z",
  "refresh_token": "pZ171dQN9iOHea4ENI2JqQSek2AvutlghpGBfYQ8D8E",
  "refresh_expires_at": "2026-11-29T23:15:13.203470175Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "99214d39-078a-4974-8f9d-286820f602ee",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-31T02:15:12Z"
}
```

```json
{
  "id": "d53a664c-8043-4030-a11f-73b2b2f9bc6f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T23:20:13.406099Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-31T02:15:12Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "921832b8-9e9a-41f4-a21e-9dfbab943736",
  "quote_id": "d53a664c-8043-4030-a11f-73b2b2f9bc6f",
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
  "pickup_at": "2026-10-31T02:15:12Z"
}
```

```json
{
  "id": "3ebc5206-2679-4051-aac8-c6f56fbc7178",
  "short_number": 34,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "8eac81f4-f165-434f-b28b-41b7ba1e529e",
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
  "created_at": "2026-10-30T23:15:13.620935Z",
  "cancellation": null,
  "pickup_at": "2026-10-31T02:15:12Z",
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
  "device_ref": "sandbox-24804"
}
```

```json
{
  "challenge_id": "9995940f-c1b2-475d-ad28-3529e214c9a7",
  "expires_at": "2026-10-30T23:20:13.836505779Z",
  "resend_available_at": "2026-10-30T23:15:14.836505779Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "133080",
  "sent_at": "2026-10-30T23:15:13.83835598Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9995940f-c1b2-475d-ad28-3529e214c9a7",
  "code": "133080",
  "device_ref": "sandbox-24804"
}
```

```json
{
  "session_id": "39243e5f-aa00-4fb2-b009-f0bb04b83012",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwMzAxNCwiaWF0IjoxNzkzNDAyMTE0LCJqdGkiOiJlMjM2OTBmZC03ZmJlLTQwNDAtOTBlOS1kMTEzZDEyNTUwZDgiLCJzaWQiOiIzOTI0M2U1Zi1hYTAwLTRmYjItYjAwOS1mMGJiMDRiODMwMTIifQ.zWW-37tTL9OBU_DNh_M6YvQMJjrMUix1cNzs7Jk4Fr4",
  "access_expires_at": "2026-10-30T23:30:14.068321806Z",
  "refresh_token": "qeW3dsrQkfFiTDnC2pn82NUV-TSPse1Tn3eKzyrRvew",
  "refresh_expires_at": "2026-11-29T23:15:14.067898268Z",
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
  "command_id": "587cc9ed-83db-4b0c-90de-8eb61b001ed5",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T23:15:14Z",
    "sequence": 1793402114466
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "915dabcb-d80e-449c-8c9c-3b854ca07d8b",
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
  "last_heartbeat_at": "2026-10-30T23:15:14.481561Z",
  "last_location_at": "2026-10-30T23:15:14.481561Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "3ebc5206-2679-4051-aac8-c6f56fbc7178",
      "short_number": 34,
      "pickup_at": "2026-10-31T02:15:12Z",
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

`POST /api/driver/v1/preorders/3ebc5206-2679-4051-aac8-c6f56fbc7178/reserve` → **200**

```json
{
  "command_id": "5a0c3970-b5e7-40ab-afac-edf6c284a1de"
}
```

```json
{
  "id": "77aded9c-f24f-4523-976d-a072d2a70627",
  "state": "RESERVED",
  "order": {
    "order_id": "3ebc5206-2679-4051-aac8-c6f56fbc7178",
    "short_number": 34,
    "pickup_at": "2026-10-31T02:15:12Z",
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
  "reserved_at": "2026-10-30T23:15:14.877447Z",
  "confirm_from": "2026-10-31T01:45:12Z",
  "confirm_until": "2026-10-31T01:55:12Z",
  "drop_until": "2026-10-31T01:15:12Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "77aded9c-f24f-4523-976d-a072d2a70627",
      "state": "RESERVED",
      "order": {
        "order_id": "3ebc5206-2679-4051-aac8-c6f56fbc7178",
        "short_number": 34,
        "pickup_at": "2026-10-31T02:15:12Z",
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
      "reserved_at": "2026-10-30T23:15:14.877447Z",
      "confirm_from": "2026-10-31T01:45:12Z",
      "confirm_until": "2026-10-31T01:55:12Z",
      "drop_until": "2026-10-31T01:15:12Z"
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
      "id": "77aded9c-f24f-4523-976d-a072d2a70627",
      "state": "RESERVED",
      "order": {
        "order_id": "3ebc5206-2679-4051-aac8-c6f56fbc7178",
        "short_number": 34,
        "pickup_at": "2026-10-31T02:15:12Z",
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
      "reserved_at": "2026-10-30T23:15:14.877447Z",
      "confirm_from": "2026-10-31T01:45:12Z",
      "confirm_until": "2026-10-31T01:55:12Z",
      "drop_until": "2026-10-31T01:15:12Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/77aded9c-f24f-4523-976d-a072d2a70627/confirm` → **409**

```json
{
  "command_id": "28b3223b-b655-41b6-8326-631c4e78ae32"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/77aded9c-f24f-4523-976d-a072d2a70627/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "01e2e2a9-ec0a-42fa-8bcb-b97c1f698427"
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
  "session_id": "2c8ef264-1095-4d7a-8646-b527d412c31e",
  "subject": {
    "type": "STAFF",
    "id": "c66269c2-93bc-421d-8af2-6f0cafc54be4"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjYyNjljMi05M2JjLTQyMWQtOGFmMi02ZjBjYWZjNTRiZTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDMwMTUsImlhdCI6MTc5MzQwMjExNSwianRpIjoiNjQ0NDdkYTgtZTdlNy00YjEyLWI3ZWEtZWZjNzM1MWVlOGI0Iiwic2lkIjoiMmM4ZWYyNjQtMTA5NS00ZDdhLTg2NDYtYjUyN2Q0MTJjMzFlIn0.QoQ7KchlaxM9KMBPDJRAv8RpMmWld9gGMJNOemyS6y0",
  "access_expires_at": "2026-10-30T23:30:15.88406255Z",
  "refresh_token": "-1Hmg_qUMP4iywADodoY6rOOGmITe2qrVf1j0qxRE-s",
  "refresh_expires_at": "2026-10-31T11:15:15.883652753Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/3ebc5206-2679-4051-aac8-c6f56fbc7178` → **200**

```json
{
  "id": "3ebc5206-2679-4051-aac8-c6f56fbc7178",
  "short_number": 34,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "8eac81f4-f165-434f-b28b-41b7ba1e529e",
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
  "created_at": "2026-10-30T23:15:13.620935Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-31T02:15:12Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "77aded9c-f24f-4523-976d-a072d2a70627",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-30T23:15:14.877447Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/3ebc5206-2679-4051-aac8-c6f56fbc7178/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-30T23:15:13.621846Z",
      "actor": {
        "type": "CLIENT",
        "id": "8eac81f4-f165-434f-b28b-41b7ba1e529e",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "3ebc5206-2679-4051-aac8-c6f56fbc7178",
        "preorder": true,
        "quote_id": "d53a664c-8043-4030-a11f-73b2b2f9bc6f",
        "pickup_at": "2026-10-31T02:15:12Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "aa812bdf-17f2-4d82-8f50-ec7a3fb036dd"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-30T23:15:14.878492Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "3ebc5206-2679-4051-aac8-c6f56fbc7178",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "77aded9c-f24f-4523-976d-a072d2a70627"
      },
      "correlation_id": "8557db5e-5626-4daa-b4d2-87a96ad1d5e2"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order 3ebc5206-2679-4051-aac8-c6f56fbc7178, reservation 77aded9c-f24f-4523-976d-a072d2a70627.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-25369"
}
```

```json
{
  "challenge_id": "73c9d749-b816-40ff-85d0-4e478de32e07",
  "expires_at": "2026-10-30T23:20:16.506251127Z",
  "resend_available_at": "2026-10-30T23:15:17.506251127Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "120229",
  "sent_at": "2026-10-30T23:15:16.508215682Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "73c9d749-b816-40ff-85d0-4e478de32e07",
  "code": "120229",
  "device_ref": "sandbox-25369"
}
```

```json
{
  "session_id": "b15b81d3-9dae-41bb-a7f8-bc2d46342bb8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwMzAxNiwiaWF0IjoxNzkzNDAyMTE2LCJqdGkiOiI1MWVmYTEwZC03OGVmLTQ1ZmEtYTRlZS03YzgyOGZkNmQ1MTciLCJzaWQiOiJiMTViODFkMy05ZGFlLTQxYmItYTdmOC1iYzJkNDYzNDJiYjgifQ.jC37E5MJ_IcihfrU153C5T12Zie3k4mNzlEFt0m531U",
  "access_expires_at": "2026-10-30T23:30:16.728089421Z",
  "refresh_token": "manfGO5oDvTkk6bIsven4W1q8koX5J9kO9wVJpyJYAA",
  "refresh_expires_at": "2026-11-29T23:15:16.727638769Z",
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
  "command_id": "1cfaeaf4-cc78-4d30-b3da-2c2b2549f742",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T23:15:17Z",
    "sequence": 1793402117127
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f326ae4e-b3cc-4c14-869b-d28174998942",
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
  "last_heartbeat_at": "2026-10-30T23:15:17.142437Z",
  "last_location_at": "2026-10-30T23:15:17.142437Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676334185",
  "device_ref": "sandbox-31934"
}
```

```json
{
  "challenge_id": "c37a2257-f0f9-446f-b1e5-b03bc3fb6dca",
  "expires_at": "2026-10-30T23:20:17.339134098Z",
  "resend_available_at": "2026-10-30T23:15:18.339134098Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380676334185` → **200**

```json
{
  "phone": "+380676334185",
  "audience": "CLIENT",
  "code": "155515",
  "sent_at": "2026-10-30T23:15:17.341132664Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c37a2257-f0f9-446f-b1e5-b03bc3fb6dca",
  "code": "155515",
  "device_ref": "sandbox-31934"
}
```

```json
{
  "session_id": "161afd1b-50f8-4a82-8d9b-75d143a90eab",
  "subject": {
    "type": "CLIENT",
    "id": "d6573a0e-e14f-4eb3-a01f-888fd1b6258a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNjU3M2EwZS1lMTRmLTRlYjMtYTAxZi04ODhmZDFiNjI1OGEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDAzMDE3LCJpYXQiOjE3OTM0MDIxMTcsImp0aSI6ImE4NGY2YzgzLWRiZmItNGRlNy1iYmVmLTM2M2Y3ZTI0OTE1NiIsInNpZCI6IjE2MWFmZDFiLTUwZjgtNGE4Mi04ZDliLTc1ZDE0M2E5MGVhYiJ9.V_IkVt4QOVi9oFNr_5SaQDVE9oKNAS4a9eEpyAatba8",
  "access_expires_at": "2026-10-30T23:30:17.563871698Z",
  "refresh_token": "OQFxHsGNo3hSy6hvBVOuS7mEZvfM7hEgzVqn4atZwgI",
  "refresh_expires_at": "2026-11-29T23:15:17.563527017Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d5f937b9-5345-48ff-9177-2c168299dd37",
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
  "id": "ec5cadc9-3817-4601-b6b8-c23e20aadde1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T23:20:17.767483Z",
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
  "command_id": "9a02e15d-4cc6-4397-9983-da99cb1a1d37",
  "quote_id": "ec5cadc9-3817-4601-b6b8-c23e20aadde1",
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
  "id": "3e143764-04db-47bc-ac68-6bc37b05bc3f",
  "short_number": 35,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d6573a0e-e14f-4eb3-a01f-888fd1b6258a",
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
  "created_at": "2026-10-30T23:15:17.984211Z",
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
    "id": "b85a1179-0f7d-4ff5-8ee1-a6ef1b415820",
    "order_id": "3e143764-04db-47bc-ac68-6bc37b05bc3f",
    "expires_at": "2026-10-30T23:15:32.986768Z",
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

`POST /api/driver/v1/offers/b85a1179-0f7d-4ff5-8ee1-a6ef1b415820/accept` → **200**

```json
{
  "command_id": "25279ea7-2b7e-4e6d-908e-303f2dbd6329"
}
```

```json
{
  "id": "33335c22-8274-4dcd-ad6c-134385a39ac3",
  "order_id": "3e143764-04db-47bc-ac68-6bc37b05bc3f",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "66a859ff-8b01-4550-8ae6-3c75709a8ded",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "66a859ff-8b01-4550-8ae6-3c75709a8ded",
  "order_id": "3e143764-04db-47bc-ac68-6bc37b05bc3f",
  "assignment_id": "33335c22-8274-4dcd-ad6c-134385a39ac3",
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

`POST /api/driver/v1/work-sessions/f326ae4e-b3cc-4c14-869b-d28174998942/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T23:15:18Z",
    "sequence": 1793402118826
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f326ae4e-b3cc-4c14-869b-d28174998942",
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
  "last_heartbeat_at": "2026-10-30T23:15:18.841257Z",
  "last_location_at": "2026-10-30T23:15:18.841257Z",
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
  "id": "66a859ff-8b01-4550-8ae6-3c75709a8ded",
  "order_id": "3e143764-04db-47bc-ac68-6bc37b05bc3f",
  "assignment_id": "33335c22-8274-4dcd-ad6c-134385a39ac3",
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

`POST /api/driver/v1/trips/66a859ff-8b01-4550-8ae6-3c75709a8ded/arrive` → **200**

```json
{
  "command_id": "84509893-4a3b-4a9f-bd51-67eb1ddee9c9",
  "expected_version": 0
}
```

```json
{
  "id": "66a859ff-8b01-4550-8ae6-3c75709a8ded",
  "order_id": "3e143764-04db-47bc-ac68-6bc37b05bc3f",
  "assignment_id": "33335c22-8274-4dcd-ad6c-134385a39ac3",
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
  "arrived_at": "2026-10-30T23:15:19.237588Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/66a859ff-8b01-4550-8ae6-3c75709a8ded/start` → **200**

```json
{
  "command_id": "645f95d8-e80f-4d8a-b270-73de841c9061",
  "expected_version": 1
}
```

```json
{
  "id": "66a859ff-8b01-4550-8ae6-3c75709a8ded",
  "order_id": "3e143764-04db-47bc-ac68-6bc37b05bc3f",
  "assignment_id": "33335c22-8274-4dcd-ad6c-134385a39ac3",
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
  "arrived_at": "2026-10-30T23:15:19.237588Z",
  "started_at": "2026-10-30T23:15:19.444001Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

(the car drives 48 s to the next point)

`POST /api/driver/v1/work-sessions/f326ae4e-b3cc-4c14-869b-d28174998942/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T23:16:07Z",
    "sequence": 1793402167665
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f326ae4e-b3cc-4c14-869b-d28174998942",
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
  "last_heartbeat_at": "2026-10-30T23:16:07.680033Z",
  "last_location_at": "2026-10-30T23:16:07.680033Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/66a859ff-8b01-4550-8ae6-3c75709a8ded/complete` → **200**

```json
{
  "command_id": "cf40bfa5-6e96-4cb1-a127-53e1b7c3f8cb",
  "expected_version": 2,
  "reported_at": "2026-10-30T23:16:07Z",
  "cash_received": true
}
```

```json
{
  "id": "66a859ff-8b01-4550-8ae6-3c75709a8ded",
  "order_id": "3e143764-04db-47bc-ac68-6bc37b05bc3f",
  "assignment_id": "33335c22-8274-4dcd-ad6c-134385a39ac3",
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
  "arrived_at": "2026-10-30T23:15:19.237588Z",
  "started_at": "2026-10-30T23:15:19.444001Z",
  "completed_at": "2026-10-30T23:16:07.885127Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/3e143764-04db-47bc-ac68-6bc37b05bc3f/rating` → **200**

```json
{
  "command_id": "382a6eda-cf38-4ace-8eb0-cd166364a830",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "3e143764-04db-47bc-ac68-6bc37b05bc3f",
  "score": 5,
  "created_at": "2026-10-30T23:16:08.10343111Z"
}
```

`POST /api/driver/v1/orders/3e143764-04db-47bc-ac68-6bc37b05bc3f/rating` → **200**

```json
{
  "command_id": "b4fe0e83-4ce3-45fe-b4d0-1073b1f5cb01",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "3e143764-04db-47bc-ac68-6bc37b05bc3f",
  "score": 4,
  "created_at": "2026-10-30T23:16:08.31341484Z"
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
  "session_id": "94fe7964-539b-41d7-848d-09b5bf1bd726",
  "subject": {
    "type": "STAFF",
    "id": "c66269c2-93bc-421d-8af2-6f0cafc54be4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjYyNjljMi05M2JjLTQyMWQtOGFmMi02ZjBjYWZjNTRiZTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDMwNjgsImlhdCI6MTc5MzQwMjE2OCwianRpIjoiMzYxNWIxYTctOTUxZi00N2EzLTllYTMtZTBkYzZmZDA2ZDJlIiwic2lkIjoiOTRmZTc5NjQtNTM5Yi00MWQ3LTg0OGQtMDliNWJmMWJkNzI2In0.ys-gkIol-Cx21Ty_WbO1ulIjSIjDyAnNzNiK_0qM9mc",
  "access_expires_at": "2026-10-30T23:31:08.906213607Z",
  "refresh_token": "iUb3JMXDPGPfkf3shpuC4MXR2QcqUuBsFCVhq_Mopa8",
  "refresh_expires_at": "2026-10-31T11:16:08.90583488Z",
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
  "session_id": "3ff0b226-1031-49b4-861c-cdf55346eec0",
  "subject": {
    "type": "STAFF",
    "id": "c66269c2-93bc-421d-8af2-6f0cafc54be4"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjYyNjljMi05M2JjLTQyMWQtOGFmMi02ZjBjYWZjNTRiZTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDMwNjksImlhdCI6MTc5MzQwMjE2OSwianRpIjoiZmM1MmE3ODctNjE0OC00ZDM3LWE1NWYtYjNmODQ1NWI1NWI1Iiwic2lkIjoiM2ZmMGIyMjYtMTAzMS00OWI0LTg2MWMtY2RmNTUzNDZlZWMwIn0.fjYwaPsGk2_CmVZ4OnFc-__6YHVkSATqIXexWzaXbLk",
  "access_expires_at": "2026-10-30T23:31:09.305555106Z",
  "refresh_token": "PMFBtdC76PrZWGrCagB7KJbhapuACUHdSo-25F6ilVY",
  "refresh_expires_at": "2026-10-31T11:16:09.305176856Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/3e143764-04db-47bc-ac68-6bc37b05bc3f/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "3e143764-04db-47bc-ac68-6bc37b05bc3f",
      "author_type": "RIDER",
      "author_id": "d6573a0e-e14f-4eb3-a01f-888fd1b6258a",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-30T23:16:08.103431Z"
    },
    {
      "order_id": "3e143764-04db-47bc-ac68-6bc37b05bc3f",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "d6573a0e-e14f-4eb3-a01f-888fd1b6258a",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-30T23:16:08.313415Z"
    }
  ]
}
```

Done: ratings for order 3e143764-04db-47bc-ac68-6bc37b05bc3f.

# Scenario: reassignment-push

## Andrii (200 m) and Oleh (600 m) are online; a rider with the app orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-32084"
}
```

```json
{
  "challenge_id": "5e3ba273-907b-428b-80af-2dab48359ba8",
  "expires_at": "2026-10-30T23:21:09.71833822Z",
  "resend_available_at": "2026-10-30T23:16:10.71833822Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "371113",
  "sent_at": "2026-10-30T23:16:09.720970684Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5e3ba273-907b-428b-80af-2dab48359ba8",
  "code": "371113",
  "device_ref": "sandbox-32084"
}
```

```json
{
  "session_id": "142ac482-5168-46c3-be58-1e7a8a4e574a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwMzA2OSwiaWF0IjoxNzkzNDAyMTY5LCJqdGkiOiJiMTA1OTBjZC1hYWM0LTQ2OGMtOTQxZS1lNDM2ZTdhNzExOWEiLCJzaWQiOiIxNDJhYzQ4Mi01MTY4LTQ2YzMtYmU1OC0xZTdhOGE0ZTU3NGEifQ.3xUigM8-mDAZISAWn_Y8yzbuqM_WGAq2EumEFQDeihM",
  "access_expires_at": "2026-10-30T23:31:09.931594436Z",
  "refresh_token": "0ixVjvHmHdJ9LbjaTKaSUuRvAP-wYQtDGvs6H_7mRng",
  "refresh_expires_at": "2026-11-29T23:16:09.931254512Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f326ae4e-b3cc-4c14-869b-d28174998942",
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
  "last_heartbeat_at": "2026-10-30T23:16:07.680033Z",
  "last_location_at": "2026-10-30T23:16:07.680033Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f326ae4e-b3cc-4c14-869b-d28174998942/handover` → **200**

```json
{
  "command_id": "908963a2-e4b6-4ac7-9655-86f58d45e723",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f326ae4e-b3cc-4c14-869b-d28174998942",
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
  "last_heartbeat_at": "2026-10-30T23:16:07.680033Z",
  "last_location_at": "2026-10-30T23:16:07.680033Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f326ae4e-b3cc-4c14-869b-d28174998942/close` → **200**

```json
{
  "command_id": "f304e51f-ff7c-4c92-9cf1-7758e02098a2",
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
  "session_id": "e3a238bd-87a5-4712-9d97-410417a8b48d",
  "subject": {
    "type": "STAFF",
    "id": "c66269c2-93bc-421d-8af2-6f0cafc54be4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjYyNjljMi05M2JjLTQyMWQtOGFmMi02ZjBjYWZjNTRiZTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDMwNzAsImlhdCI6MTc5MzQwMjE3MCwianRpIjoiMDg1OGYzZDAtNDczOC00NWE0LWEwYWItNjVjNDFkMDJjMTIwIiwic2lkIjoiZTNhMjM4YmQtODdhNS00NzEyLTlkOTctNDEwNDE3YThiNDhkIn0.T7duD5rpIuBXrRWG_95Rl3ho7MdJTXrPLzlOQY-iqh8",
  "access_expires_at": "2026-10-30T23:31:10.917529932Z",
  "refresh_token": "Y7BgpF7R6FRnbAV3SD5ikN1Goer88VEl7BNEoYu6cE8",
  "refresh_expires_at": "2026-10-31T11:16:10.917170189Z",
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
  "session_id": "07cc428d-d27a-44bf-99d0-d8d7a038c037",
  "subject": {
    "type": "STAFF",
    "id": "c66269c2-93bc-421d-8af2-6f0cafc54be4"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjYyNjljMi05M2JjLTQyMWQtOGFmMi02ZjBjYWZjNTRiZTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDMwNzEsImlhdCI6MTc5MzQwMjE3MSwianRpIjoiNmUwODU4ZjAtZTcwYi00MDU2LTgzMTEtNWEwN2IyNTUwMTg5Iiwic2lkIjoiMDdjYzQyOGQtZDI3YS00NGJmLTk5ZDAtZDhkN2EwMzhjMDM3In0.2o_z8K4VscBiuf96SKlSl_lZ54ZxLdj8a0mLeCOIxhc",
  "access_expires_at": "2026-10-30T23:31:11.311332778Z",
  "refresh_token": "9lwe809pp75kDVdqFTRljBobQAsWsTvsr3qfaUmiR_w",
  "refresh_expires_at": "2026-10-31T11:16:11.31099031Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-22610"
}
```

```json
{
  "challenge_id": "05d96953-6135-4a00-b97f-813296f2cc9d",
  "expires_at": "2026-10-30T23:21:11.501624313Z",
  "resend_available_at": "2026-10-30T23:16:12.501624313Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "467127",
  "sent_at": "2026-10-30T23:16:11.503401018Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "05d96953-6135-4a00-b97f-813296f2cc9d",
  "code": "467127",
  "device_ref": "sandbox-22610"
}
```

```json
{
  "session_id": "8b14a5bf-0698-4596-bcdd-5153f87f45d9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwMzA3MSwiaWF0IjoxNzkzNDAyMTcxLCJqdGkiOiIxMDMxODg0NS1jZDY3LTQ3ZjUtODRiNy1mYzA2ZmVmZjQ1Y2MiLCJzaWQiOiI4YjE0YTViZi0wNjk4LTQ1OTYtYmNkZC01MTUzZjg3ZjQ1ZDkifQ.-Z_5tKAx2303KjWkfVR6fUKmp86sIIOg0XuZX_rH9qo",
  "access_expires_at": "2026-10-30T23:31:11.723679489Z",
  "refresh_token": "KjoOVfQsKPgps05OuteH246gE_5rUW5M-lBjSzmdwVw",
  "refresh_expires_at": "2026-11-29T23:16:11.723271213Z",
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
  "command_id": "9b49594c-8c91-48d2-9c79-ccd1f915e7e6",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T23:16:12Z",
    "sequence": 1793402172127
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "97b646e1-17a7-4ea7-8eda-370fe0762ab9",
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
  "last_heartbeat_at": "2026-10-30T23:16:12.142765Z",
  "last_location_at": "2026-10-30T23:16:12.142765Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-24694"
}
```

```json
{
  "challenge_id": "3ba18bf3-6830-44f3-b499-5bee07fdbe64",
  "expires_at": "2026-10-30T23:21:12.349826459Z",
  "resend_available_at": "2026-10-30T23:16:13.349826459Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "440063",
  "sent_at": "2026-10-30T23:16:12.351680364Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3ba18bf3-6830-44f3-b499-5bee07fdbe64",
  "code": "440063",
  "device_ref": "sandbox-24694"
}
```

```json
{
  "session_id": "e8285fb0-7288-416f-bb6d-7effd5fed41b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwMzA3MiwiaWF0IjoxNzkzNDAyMTcyLCJqdGkiOiJlM2MwNTNkOS04OTBhLTRhODktYWU3Ny01YWE4YjU0Y2EwOTMiLCJzaWQiOiJlODI4NWZiMC03Mjg4LTQxNmYtYmI2ZC03ZWZmZDVmZWQ0MWIifQ.xjMt8V4XuLbjKzZfgfME6TygK1BO_qmzpSsX0xA9nrc",
  "access_expires_at": "2026-10-30T23:31:12.570023224Z",
  "refresh_token": "EaT62obUUfvlqAZjbH8AnMkQQ4lqSOGK0bZCGauN5t8",
  "refresh_expires_at": "2026-11-29T23:16:12.56965684Z",
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
  "command_id": "e48dacd0-bdb8-4f70-b169-c122982c5bf0",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T23:16:12Z",
    "sequence": 1793402172981
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "89613c33-634a-4f69-8e18-7083295adad3",
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
  "last_heartbeat_at": "2026-10-30T23:16:12.996149Z",
  "last_location_at": "2026-10-30T23:16:12.996149Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380686670462",
  "device_ref": "sandbox-2063"
}
```

```json
{
  "challenge_id": "a745767a-ee38-48de-a0d6-352ea49507f5",
  "expires_at": "2026-10-30T23:21:13.195198808Z",
  "resend_available_at": "2026-10-30T23:16:14.195198808Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380686670462` → **200**

```json
{
  "phone": "+380686670462",
  "audience": "CLIENT",
  "code": "158014",
  "sent_at": "2026-10-30T23:16:13.197221829Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a745767a-ee38-48de-a0d6-352ea49507f5",
  "code": "158014",
  "device_ref": "sandbox-2063"
}
```

```json
{
  "session_id": "caa56cf1-de1d-4180-86cf-e83e56db27cc",
  "subject": {
    "type": "CLIENT",
    "id": "c3916b3e-a69d-49a5-aad7-9e1b6d6fee36"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMzkxNmIzZS1hNjlkLTQ5YTUtYWFkNy05ZTFiNmQ2ZmVlMzYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDAzMDczLCJpYXQiOjE3OTM0MDIxNzMsImp0aSI6IjE0NGU4NTNlLTE2YjEtNGNjNi1iZWNlLThmMmQxNGQ3YTU1NSIsInNpZCI6ImNhYTU2Y2YxLWRlMWQtNDE4MC04NmNmLWU4M2U1NmRiMjdjYyJ9.tSWA4sw0DpvXmf1UFV8SmqZjLOda0YfVtqB-FPiBGPo",
  "access_expires_at": "2026-10-30T23:31:13.417801777Z",
  "refresh_token": "SvSWqapRSN2kUfsYAt0MUl1NYrgwz8i9pYgsZLgE1d0",
  "refresh_expires_at": "2026-11-29T23:16:13.417463746Z",
  "account_created": true
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "e3414678-3987-4a91-8432-ab3f53378435",
  "platform": "ANDROID",
  "token": "sandbox-rider-e43eed97-40c9-4f2d-9ba6-fa2810ed3efe"
}
```

```json
{
  "id": "28549b9d-e612-4454-9357-92d2236fec33",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T23:16:13.613181Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "cf0a6a4e-5f02-4dea-93fb-aabd52a64c6f",
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
  "id": "412a0d30-d81f-4341-8077-8e32f2932462",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T23:21:13.812589Z",
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
  "command_id": "1d2068fe-121b-4ff7-b423-ebb8fc2d79fe",
  "quote_id": "412a0d30-d81f-4341-8077-8e32f2932462",
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
  "id": "fa5b22fa-a0de-45ac-b9d0-823d2d30669b",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c3916b3e-a69d-49a5-aad7-9e1b6d6fee36",
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
  "created_at": "2026-10-30T23:16:14.010026Z",
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

## Andrii accepts; at once the operator takes him off and Oleh takes the order

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "e625798a-2204-47f7-b005-ac3b265dbf28",
    "order_id": "fa5b22fa-a0de-45ac-b9d0-823d2d30669b",
    "expires_at": "2026-10-30T23:16:29.011552Z",
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

`POST /api/driver/v1/offers/e625798a-2204-47f7-b005-ac3b265dbf28/accept` → **200**

```json
{
  "command_id": "497fca15-96ef-4251-bf5d-f27659d07665"
}
```

```json
{
  "id": "5201c48e-ccb9-4f6f-8efe-e5426be4296b",
  "order_id": "fa5b22fa-a0de-45ac-b9d0-823d2d30669b",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "327e37ba-d7ff-4e50-9e2a-e30d9f951c71",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/operator/v1/orders/fa5b22fa-a0de-45ac-b9d0-823d2d30669b` → **200**

```json
{
  "id": "fa5b22fa-a0de-45ac-b9d0-823d2d30669b",
  "short_number": 36,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "c3916b3e-a69d-49a5-aad7-9e1b6d6fee36",
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
    "id": "5201c48e-ccb9-4f6f-8efe-e5426be4296b",
    "order_id": "fa5b22fa-a0de-45ac-b9d0-823d2d30669b",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "327e37ba-d7ff-4e50-9e2a-e30d9f951c71",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T23:16:14.010026Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/fa5b22fa-a0de-45ac-b9d0-823d2d30669b/revoke-assignment` → **200**

```json
{
  "command_id": "20194ac7-7e0d-4ed3-9304-7a301bb47b4a",
  "expected_version": 3,
  "reason": "Driver does not answer"
}
```

```json
{
  "id": "fa5b22fa-a0de-45ac-b9d0-823d2d30669b",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "c3916b3e-a69d-49a5-aad7-9e1b6d6fee36",
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
  "created_at": "2026-10-30T23:16:14.010026Z",
  "caller": null,
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
    "id": "7c7f6942-cc36-4454-80ce-0f67c7d39aa6",
    "order_id": "fa5b22fa-a0de-45ac-b9d0-823d2d30669b",
    "expires_at": "2026-10-30T23:16:29.846943Z",
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

`POST /api/driver/v1/offers/7c7f6942-cc36-4454-80ce-0f67c7d39aa6/accept` → **200**

```json
{
  "command_id": "0036db43-2a45-4ab6-9050-c5cd1d44f91c"
}
```

```json
{
  "id": "7886a64d-594c-44ac-b404-5508ebfc4b7e",
  "order_id": "fa5b22fa-a0de-45ac-b9d0-823d2d30669b",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "449c9ca1-0c6c-45e3-9aef-b63bf824a2cc",
  "trip_phase": "TO_PICKUP"
}
```

## After the push delay: Andrii's "driver assigned" is SUPERSEDED, Oleh's is SENT

`GET /sandbox/v1/notifications?order_id=fa5b22fa-a0de-45ac-b9d0-823d2d30669b` → **200**

```json
[
  {
    "recipient_type": "CLIENT",
    "recipient_id": "c3916b3e-a69d-49a5-aad7-9e1b6d6fee36",
    "channel": "PUSH",
    "template": "rider.driver-assigned",
    "state": "SUPERSEDED",
    "data": {
      "type": "rider.driver-assigned",
      "event_id": "6adf4677-fea8-413c-83f6-0cef3d8db731",
      "order_id": "fa5b22fa-a0de-45ac-b9d0-823d2d30669b",
      "event_type": "AssignmentCommitted",
      "assignment_id": "5201c48e-ccb9-4f6f-8efe-e5426be4296b",
      "order_version": "3"
    },
    "created_at": "2026-10-30T23:16:15.032067Z"
  },
  {
    "recipient_type": "DRIVER",
    "recipient_id": "5a000000-0000-4000-8000-000000000403",
    "channel": "PUSH",
    "template": "driver.offer",
    "state": "SUPERSEDED",
    "data": {
      "type": "driver.offer",
      "event_id": "b7c06b7f-d92a-426c-8431-0bb1084c6155",
      "offer_id": "e625798a-2204-47f7-b005-ac3b265dbf28",
      "order_id": "fa5b22fa-a0de-45ac-b9d0-823d2d30669b",
      "event_type": "OfferMade",
      "order_version": "2"
    },
    "created_at": "2026-10-30T23:16:15.034875Z"
  },
  {
    "recipient_type": "DRIVER",
    "recipient_id": "5a000000-0000-4000-8000-000000000402",
    "channel": "PUSH",
    "template": "driver.offer",
    "state": "SUPERSEDED",
    "data": {
      "type": "driver.offer",
      "event_id": "303779cc-bd11-460a-bc90-5c67d2a29a9e",
      "offer_id": "7c7f6942-cc36-4454-80ce-0f67c7d39aa6",
      "order_id": "fa5b22fa-a0de-45ac-b9d0-823d2d30669b",
      "event_type": "OfferMade",
      "order_version": "6"
    },
    "created_at": "2026-10-30T23:16:15.037341Z"
  },
  {
    "recipient_type": "CLIENT",
    "recipient_id": "c3916b3e-a69d-49a5-aad7-9e1b6d6fee36",
    "channel": "PUSH",
    "template": "rider.driver-assigned",
    "state": "SENT",
    "data": {
      "type": "rider.driver-assigned",
      "event_id": "79f79a78-c616-4e1a-992b-02f0dcfc6ff3",
      "order_id": "fa5b22fa-a0de-45ac-b9d0-823d2d30669b",
      "event_type": "AssignmentCommitted",
      "assignment_id": "7886a64d-594c-44ac-b404-5508ebfc4b7e",
      "order_version": "7"
    },
    "created_at": "2026-10-30T23:16:16.043323Z"
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380686670462&after=2026-10-30T23:16:13.796Z` → **200**

```json
[
  {
    "at": "2026-10-30T23:16:19.085184703Z",
    "token_suffix": "ed3efe",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "event_type": "AssignmentCommitted",
      "type": "rider.driver-assigned",
      "assignment_id": "7886a64d-594c-44ac-b404-5508ebfc4b7e",
      "order_version": "7",
      "event_id": "79f79a78-c616-4e1a-992b-02f0dcfc6ff3",
      "order_id": "fa5b22fa-a0de-45ac-b9d0-823d2d30669b"
    }
  }
]
```

## The rider's order shows Oleh's car and why the driver changed

`GET /api/rider/v1/orders/fa5b22fa-a0de-45ac-b9d0-823d2d30669b` → **200**

```json
{
  "id": "fa5b22fa-a0de-45ac-b9d0-823d2d30669b",
  "short_number": 36,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "c3916b3e-a69d-49a5-aad7-9e1b6d6fee36",
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
    "id": "7886a64d-594c-44ac-b404-5508ebfc4b7e",
    "order_id": "fa5b22fa-a0de-45ac-b9d0-823d2d30669b",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "449c9ca1-0c6c-45e3-9aef-b63bf824a2cc",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T23:16:14.010026Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": {
    "seconds": 112,
    "distance_metres": 781,
    "source": "STRAIGHT_LINE",
    "location_at": "2026-10-30T23:16:12.996149Z",
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
  "driver_change": {
    "reason_code": "SERVICE_REASSIGNED",
    "at": "2026-10-30T23:16:14.845294Z"
  }
}
```

Done: assignment 5201c48e-ccb9-4f6f-8efe-e5426be4296b of 5a000000-0000-4000-8000-000000000403 never announced (SUPERSEDED); the rider heard only about 7886a64d-594c-44ac-b404-5508ebfc4b7e.

`GET /api/operator/v1/orders/fa5b22fa-a0de-45ac-b9d0-823d2d30669b` → **200**

```json
{
  "id": "fa5b22fa-a0de-45ac-b9d0-823d2d30669b",
  "short_number": 36,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "c3916b3e-a69d-49a5-aad7-9e1b6d6fee36",
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
    "id": "7886a64d-594c-44ac-b404-5508ebfc4b7e",
    "order_id": "fa5b22fa-a0de-45ac-b9d0-823d2d30669b",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "449c9ca1-0c6c-45e3-9aef-b63bf824a2cc",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T23:16:14.010026Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/fa5b22fa-a0de-45ac-b9d0-823d2d30669b/cancel` → **200**

```json
{
  "command_id": "9c6171af-4255-45ef-9c69-fb925d12d376",
  "expected_version": 7,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "fa5b22fa-a0de-45ac-b9d0-823d2d30669b",
  "short_number": 36,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 8,
  "channel": "APP",
  "payer_client_id": "c3916b3e-a69d-49a5-aad7-9e1b6d6fee36",
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
    "id": "7886a64d-594c-44ac-b404-5508ebfc4b7e",
    "order_id": "fa5b22fa-a0de-45ac-b9d0-823d2d30669b",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "449c9ca1-0c6c-45e3-9aef-b63bf824a2cc",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T23:16:14.010026Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "ru": "Нет свободных машин",
      "pl": "Brak wolnych aut",
      "uk": "Немає вільних авто",
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
  "session_id": "97b646e1-17a7-4ea7-8eda-370fe0762ab9",
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
  "last_heartbeat_at": "2026-10-30T23:16:12.142765Z",
  "last_location_at": "2026-10-30T23:16:12.142765Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/97b646e1-17a7-4ea7-8eda-370fe0762ab9/close` → **200**

```json
{
  "command_id": "497198cc-c167-40e3-8c6c-371bd2781290",
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

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "89613c33-634a-4f69-8e18-7083295adad3",
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
  "last_heartbeat_at": "2026-10-30T23:16:12.996149Z",
  "last_location_at": "2026-10-30T23:16:12.996149Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/89613c33-634a-4f69-8e18-7083295adad3/close` → **200**

```json
{
  "command_id": "dd448cae-1b37-45ad-82fb-d6cbd04ec5ba",
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
  "session_id": "7dc8c905-fac0-4494-bc4b-afebf1b48b2c",
  "subject": {
    "type": "STAFF",
    "id": "c66269c2-93bc-421d-8af2-6f0cafc54be4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjYyNjljMi05M2JjLTQyMWQtOGFmMi02ZjBjYWZjNTRiZTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDMwODMsImlhdCI6MTc5MzQwMjE4MywianRpIjoiN2JlN2JlMzUtZWQyNC00OGJiLWI0OTQtYTE1N2Y3Y2MxMGZhIiwic2lkIjoiN2RjOGM5MDUtZmFjMC00NDk0LWJjNGItYWZlYmYxYjQ4YjJjIn0.2yZBrQgjyObda4zrsQ6T67UP6QptW9Lnkt759jxrRoI",
  "access_expires_at": "2026-10-30T23:31:23.178028435Z",
  "refresh_token": "0pNRmthjswxPxyFGFH8izYTLCDfPL9oz36X9lWJi_4o",
  "refresh_expires_at": "2026-10-31T11:16:23.177662431Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "f3a70b2d-70cd-497f-863a-a8b3f821186e",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "886b412d-8ebc-40f6-96ff-54467e089138",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T23:16:23.380113Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/886b412d-8ebc-40f6-96ff-54467e089138` → **200**

```json
{
  "id": "886b412d-8ebc-40f6-96ff-54467e089138",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T23:16:23.380113Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/886b412d-8ebc-40f6-96ff-54467e089138` → **200**

```json
{
  "id": "886b412d-8ebc-40f6-96ff-54467e089138",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T23:16:23.380113Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/886b412d-8ebc-40f6-96ff-54467e089138` → **200**

```json
{
  "id": "886b412d-8ebc-40f6-96ff-54467e089138",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T23:16:23.380113Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/886b412d-8ebc-40f6-96ff-54467e089138` → **200**

```json
{
  "id": "886b412d-8ebc-40f6-96ff-54467e089138",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T23:16:23.380113Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/886b412d-8ebc-40f6-96ff-54467e089138` → **200**

```json
{
  "id": "886b412d-8ebc-40f6-96ff-54467e089138",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-30.csv",
  "rows": 1,
  "error": null,
  "created_at": "2026-10-30T23:16:23.380113Z",
  "ready_at": "2026-10-30T23:16:27.568723Z",
  "expires_at": "2026-10-31T23:16:27.568723Z"
}
```

`GET /api/admin/v1/reports/exports/886b412d-8ebc-40f6-96ff-54467e089138/file` → **200**, 2 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
total,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "51539bee-ac35-433d-8435-830994e75ae7",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "b80656cd-237a-4189-9f68-d730b484f1ab",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T23:16:28.598158Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/b80656cd-237a-4189-9f68-d730b484f1ab` → **200**

```json
{
  "id": "b80656cd-237a-4189-9f68-d730b484f1ab",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T23:16:28.598158Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/b80656cd-237a-4189-9f68-d730b484f1ab` → **200**

```json
{
  "id": "b80656cd-237a-4189-9f68-d730b484f1ab",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T23:16:28.598158Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/b80656cd-237a-4189-9f68-d730b484f1ab` → **200**

```json
{
  "id": "b80656cd-237a-4189-9f68-d730b484f1ab",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T23:16:28.598158Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/b80656cd-237a-4189-9f68-d730b484f1ab` → **200**

```json
{
  "id": "b80656cd-237a-4189-9f68-d730b484f1ab",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T23:16:28.598158Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/b80656cd-237a-4189-9f68-d730b484f1ab` → **200**

```json
{
  "id": "b80656cd-237a-4189-9f68-d730b484f1ab",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-30.csv",
  "rows": 1,
  "error": null,
  "created_at": "2026-10-30T23:16:28.598158Z",
  "ready_at": "2026-10-30T23:16:32.575299Z",
  "expires_at": "2026-10-31T23:16:32.575299Z"
}
```

`GET /api/admin/v1/reports/exports/b80656cd-237a-4189-9f68-d730b484f1ab/file` → **200**, 2 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
total,UAH,0,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/21991b81-7297-43d6-9bf9-c38841664054` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/21991b81-7297-43d6-9bf9-c38841664054",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "cb1b3225-a919-4a68-bb19-0d0abfff1d5d"
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
  "session_id": "a3cdf5ca-9645-4fef-82fc-54259ca7de3b",
  "subject": {
    "type": "STAFF",
    "id": "c66269c2-93bc-421d-8af2-6f0cafc54be4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjYyNjljMi05M2JjLTQyMWQtOGFmMi02ZjBjYWZjNTRiZTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDMwOTQsImlhdCI6MTc5MzQwMjE5NCwianRpIjoiYWQ2MDQ5MTItMmY4Ni00ZmZlLTk4NTktYTlmOTNjOTU2MGYwIiwic2lkIjoiYTNjZGY1Y2EtOTY0NS00ZmVmLTgyZmMtNTQyNTljYTdkZTNiIn0.nuiCSXP4we7DxzFEhoBWUGLALS2KzWfkvs90U0FXoDU",
  "access_expires_at": "2026-10-30T23:31:34.216206327Z",
  "refresh_token": "FB7ry0-39xKrOYxd4vY9q8hM_LI5lCXtE1s2blxqdMg",
  "refresh_expires_at": "2026-10-31T11:16:34.215773034Z",
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
  "command_id": "874d48f7-3e6a-4721-9a7c-e83aa30feb5e",
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
  "changed_by": "c66269c2-93bc-421d-8af2-6f0cafc54be4",
  "reason": "Sandbox retention boundary",
  "changed_at": "2026-10-30T23:16:34.639297095Z"
}
```

`POST /sandbox/v1/retention/fixtures/54a49a39-e223-48ba-bb57-fdd496fd77da` → **200**

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

`GET /sandbox/v1/retention/fixtures/54a49a39-e223-48ba-bb57-fdd496fd77da` → **200**

```json
{
  "old_done": 0,
  "recent_done": 1,
  "failed": 1
}
```

Old DONE event removed; recent DONE and old FAILED events retained. Policy and synthetic fixtures restored on exit.

`DELETE /sandbox/v1/retention/fixtures/54a49a39-e223-48ba-bb57-fdd496fd77da` → **204**

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
  "changed_by": "c66269c2-93bc-421d-8af2-6f0cafc54be4",
  "reason": "Sandbox retention boundary",
  "changed_at": "2026-10-30T23:16:34.639297Z"
}
```

`PUT /api/admin/v1/retention` → **200**

```json
{
  "command_id": "67d3b239-1e0e-494d-a3f4-b68cbf02cc27",
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
  "changed_by": "c66269c2-93bc-421d-8af2-6f0cafc54be4",
  "reason": "Restore policy after retention sandbox",
  "changed_at": "2026-10-30T23:16:35.163824012Z"
}
```

# Scenario: risk-flag

## The driver starts a new shift in Kyiv

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-22541"
}
```

```json
{
  "challenge_id": "16353fba-0b94-4d5a-98ca-d2c2ac024a2c",
  "expires_at": "2026-10-30T23:21:35.367022405Z",
  "resend_available_at": "2026-10-30T23:16:36.367022405Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "182698",
  "sent_at": "2026-10-30T23:16:35.368949866Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "16353fba-0b94-4d5a-98ca-d2c2ac024a2c",
  "code": "182698",
  "device_ref": "sandbox-22541"
}
```

```json
{
  "session_id": "0cc99ad4-1957-433c-8a40-8e6d96c274e3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwMzA5NSwiaWF0IjoxNzkzNDAyMTk1LCJqdGkiOiIwNjc3OWIzNC02NTY5LTQyNmQtODMwYy04NzhlNWYxYTE5MjciLCJzaWQiOiIwY2M5OWFkNC0xOTU3LTQzM2MtOGE0MC04ZTZkOTZjMjc0ZTMifQ.9gxuayN0Rwl6n-G0yx13E9_D5mPEGxRo0IH7zdIa1BU",
  "access_expires_at": "2026-10-30T23:31:35.585502072Z",
  "refresh_token": "-j0jqGyoWANxdBAJhVFGWaLjoCXuiIJ0EsghUQEwY8E",
  "refresh_expires_at": "2026-11-29T23:16:35.585149799Z",
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
  "command_id": "839f6c3a-5b26-455a-aca4-8f4f0a5718fb",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T23:16:36Z",
    "sequence": 1793402196185
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "8732da0e-1e0d-47f8-8bb3-1141fd3ce47d",
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
  "last_heartbeat_at": "2026-10-30T23:16:36.200585Z",
  "last_location_at": "2026-10-30T23:16:36.200585Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "7b6a760b-1e37-43c9-8513-e8c083226a23",
  "points": [
    {
      "sequence": 1793402198411,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-30T23:15:38Z"
    },
    {
      "sequence": 1793402198417,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-30T23:16:38Z"
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
  "session_id": "66be1fce-63e3-4abd-a2ef-dccca8748b0f",
  "subject": {
    "type": "STAFF",
    "id": "c66269c2-93bc-421d-8af2-6f0cafc54be4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjYyNjljMi05M2JjLTQyMWQtOGFmMi02ZjBjYWZjNTRiZTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDMwOTgsImlhdCI6MTc5MzQwMjE5OCwianRpIjoiMjIzZjQ3N2UtZmNjNi00MWNiLWIwYzgtN2ZjY2NmM2JlYjBkIiwic2lkIjoiNjZiZTFmY2UtNjNlMy00YWJkLWEyZWYtZGNjY2E4NzQ4YjBmIn0.rT22_RbGRMoaIJyD_hfSNi_Y16j70lb2MfBOizYtpDY",
  "access_expires_at": "2026-10-30T23:31:38.838885921Z",
  "refresh_token": "WUpSSQr0qQmSpU1p3vBA4Y_YtLuyBs2j9Ua43Puq3LY",
  "refresh_expires_at": "2026-10-31T11:16:38.83852116Z",
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
      "id": "38c15f14-95ce-4c95-b5ad-767f3b0e803e",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-30T23:16:38Z",
        "track_point_id": "181e5784-b5cb-4fff-a54a-979bfe805d66",
        "work_session_id": "8732da0e-1e0d-47f8-8bb3-1141fd3ce47d"
      },
      "raised_by": null,
      "raised_at": "2026-10-30T23:16:38Z",
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

## Support confirms it with a reason — once

`POST /api/admin/v1/driver-risk-flags/38c15f14-95ce-4c95-b5ad-767f3b0e803e/confirm` → **200**

```json
{
  "command_id": "74c484c3-674c-41b9-b999-cdafcf9ec3c7",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "38c15f14-95ce-4c95-b5ad-767f3b0e803e",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-30T23:16:38Z",
    "track_point_id": "181e5784-b5cb-4fff-a54a-979bfe805d66",
    "work_session_id": "8732da0e-1e0d-47f8-8bb3-1141fd3ce47d"
  },
  "raised_by": null,
  "raised_at": "2026-10-30T23:16:38Z",
  "reason": null,
  "reviewed_by": "c66269c2-93bc-421d-8af2-6f0cafc54be4",
  "reviewed_at": "2026-10-30T23:16:40.653214Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/38c15f14-95ce-4c95-b5ad-767f3b0e803e/dismiss` → **409**

```json
{
  "command_id": "c978ed51-2a79-4fb8-a0f1-dc85742bf0ee",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/38c15f14-95ce-4c95-b5ad-767f3b0e803e/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "712ef234-2804-4f24-a7ce-2da71b68d259"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "c9c20dd0-77f2-4029-8080-03b9c4c2beb6",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "ce36af5e-b75a-40e3-a3ab-c0ecb0960062",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "c66269c2-93bc-421d-8af2-6f0cafc54be4",
  "raised_at": "2026-10-30T23:16:41.060677Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/ce36af5e-b75a-40e3-a3ab-c0ecb0960062/dismiss` → **200**

```json
{
  "command_id": "cd3071ee-b561-40c5-abc2-227e50a0e8c1",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "ce36af5e-b75a-40e3-a3ab-c0ecb0960062",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "c66269c2-93bc-421d-8af2-6f0cafc54be4",
  "raised_at": "2026-10-30T23:16:41.060677Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "c66269c2-93bc-421d-8af2-6f0cafc54be4",
  "reviewed_at": "2026-10-30T23:16:41.269374Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "d3142d99-62bf-46f6-87a1-ed6e7fe596ff",
  "expected_version": 16,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "38c15f14-95ce-4c95-b5ad-767f3b0e803e"
}
```

```json
{
  "id": "5a000000-0000-4000-8000-000000000403",
  "account_state": "ACTIVE",
  "name": "Андрій Шевчук",
  "language": "ru",
  "review_status": "SUSPENDED",
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

`GET /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403` → **200**

```json
{
  "profile": {
    "id": "5a000000-0000-4000-8000-000000000403",
    "account_state": "ACTIVE",
    "name": "Андрій Шевчук",
    "language": "ru",
    "review_status": "SUSPENDED",
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
  },
  "phone": "+380500000003",
  "history": [
    {
      "from": "APPROVED",
      "to": "SUSPENDED",
      "actor_type": "STAFF",
      "actor_id": "c66269c2-93bc-421d-8af2-6f0cafc54be4",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T23:16:41.475931Z"
    }
  ],
  "duplicates": []
}
```

Done: flag 38c15f14-95ce-4c95-b5ad-767f3b0e803e confirmed, suspension named it, driver reinstated.

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
  "session_id": "edf4dc45-aa1c-4cc5-80cd-74b895f517c8",
  "subject": {
    "type": "STAFF",
    "id": "c66269c2-93bc-421d-8af2-6f0cafc54be4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjYyNjljMi05M2JjLTQyMWQtOGFmMi02ZjBjYWZjNTRiZTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDMxMDIsImlhdCI6MTc5MzQwMjIwMiwianRpIjoiNWUwN2U4YTUtMjUyMy00MTE4LTlmODEtNjViMzk5NzE5YzE3Iiwic2lkIjoiZWRmNGRjNDUtYWExYy00Y2M1LTgwY2QtNzRiODk1ZjUxN2M4In0.QAY6FD-Ag5v8XJ4peRDG05MJdwW-unrBF8iigihMla4",
  "access_expires_at": "2026-10-30T23:31:42.057613603Z",
  "refresh_token": "PobQpbkkV_SJyhC9aYaOJYJ8rOIQ5BpSKmykFF2YpXA",
  "refresh_expires_at": "2026-10-31T11:16:42.057189586Z",
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
  },
  "phone": "+380500000003",
  "history": [
    {
      "from": "APPROVED",
      "to": "SUSPENDED",
      "actor_type": "STAFF",
      "actor_id": "c66269c2-93bc-421d-8af2-6f0cafc54be4",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T23:16:41.475931Z"
    }
  ],
  "duplicates": []
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "4a47edf5-e721-44d3-9ff6-e3c99f3265cf",
  "expected_version": 17,
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

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "8732da0e-1e0d-47f8-8bb3-1141fd3ce47d",
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
  "last_heartbeat_at": "2026-10-30T23:16:36.200585Z",
  "last_location_at": "2026-10-30T23:16:36.200585Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8732da0e-1e0d-47f8-8bb3-1141fd3ce47d/close` → **200**

```json
{
  "command_id": "529ff9bb-30a0-459b-b910-5cd50c498eef",
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
  "session_id": "1cb3c3ea-3199-4b33-aafa-cc9089b1f5c7",
  "subject": {
    "type": "STAFF",
    "id": "c66269c2-93bc-421d-8af2-6f0cafc54be4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjYyNjljMi05M2JjLTQyMWQtOGFmMi02ZjBjYWZjNTRiZTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDMxMDMsImlhdCI6MTc5MzQwMjIwMywianRpIjoiMWYwZGM0M2ItZmMzOC00MGIwLTlmZDQtNTVhMzQ4MzU4OGU0Iiwic2lkIjoiMWNiM2MzZWEtMzE5OS00YjMzLWFhZmEtY2M5MDg5YjFmNWM3In0.ucsDwCKvOEud7WeYH1iuD6FPXqFkh3rQo1l3_aQpDGc",
  "access_expires_at": "2026-10-30T23:31:43.232504459Z",
  "refresh_token": "9BtBmBho1NUfgzKg_WO0FPH5BE-8EdAcVTe9iG9KYlA",
  "refresh_expires_at": "2026-10-31T11:16:43.232159444Z",
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
  "command_id": "f8f231c8-fb00-4c05-bb58-f514d0f85786",
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
  "changed_by": "c66269c2-93bc-421d-8af2-6f0cafc54be4",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T23:16:43.633474Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "f8f231c8-fb00-4c05-bb58-f514d0f85786",
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
  "changed_by": "c66269c2-93bc-421d-8af2-6f0cafc54be4",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T23:16:43.633474Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48476731173",
  "device_ref": "sandbox-27267"
}
```

```json
{
  "challenge_id": "7272b96d-eb92-4f03-b0c6-0d3247613fe8",
  "expires_at": "2026-10-30T23:21:44.045056304Z",
  "resend_available_at": "2026-10-30T23:16:45.045056304Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48476731173` → **200**

```json
{
  "phone": "+48476731173",
  "audience": "CLIENT",
  "code": "807047",
  "sent_at": "2026-10-30T23:16:44.046982583Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7272b96d-eb92-4f03-b0c6-0d3247613fe8",
  "code": "807047",
  "device_ref": "sandbox-27267"
}
```

```json
{
  "session_id": "0fc16623-65a0-4c44-840e-79d8e4a9c1ab",
  "subject": {
    "type": "CLIENT",
    "id": "4061f8f9-d5a1-49d7-b569-b16f6b13ce06"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MDYxZjhmOS1kNWExLTQ5ZDctYjU2OS1iMTZmNmIxM2NlMDYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDAzMTA0LCJpYXQiOjE3OTM0MDIyMDQsImp0aSI6ImJkNTEwMDA1LTUwNTAtNGFhZC1iY2YzLTg2ZmJjNjAxODY2MSIsInNpZCI6IjBmYzE2NjIzLTY1YTAtNGM0NC04NDBlLTc5ZDhlNGE5YzFhYiJ9.wQogaCNUeEmPH2F13neIsVaLZKu87eiQfgeeJXPH7ME",
  "access_expires_at": "2026-10-30T23:31:44.270094307Z",
  "refresh_token": "HcqUkh2Ys_rMzjX39acIdK2luZF6mQRGD6FLqIIuZGs",
  "refresh_expires_at": "2026-11-29T23:16:44.269701214Z",
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
  "correlation_id": "851f5782-b5e6-4fbb-b387-fed8d17f8b01"
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
  "device_ref": "sandbox-30805"
}
```

```json
{
  "challenge_id": "4d903e60-9706-468d-8196-53027df5d36e",
  "expires_at": "2026-10-30T23:21:44.852178214Z",
  "resend_available_at": "2026-10-30T23:16:45.852178214Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "215330",
  "sent_at": "2026-10-30T23:16:44.855684236Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4d903e60-9706-468d-8196-53027df5d36e",
  "code": "215330",
  "device_ref": "sandbox-30805"
}
```

```json
{
  "session_id": "1259bd3b-c7ba-4582-b362-c23ce308d48f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwMzEwNSwiaWF0IjoxNzkzNDAyMjA1LCJqdGkiOiIwNzg3ZmRhOS05OTcxLTQ1MzUtODlhYy1iMTJiZjdiNjQ5NTQiLCJzaWQiOiIxMjU5YmQzYi1jN2JhLTQ1ODItYjM2Mi1jMjNjZTMwOGQ0OGYifQ.TkEseD-tVej1tXTYDuc1_sQrwtqpU0APWQSHAs_mORk",
  "access_expires_at": "2026-10-30T23:31:45.079873615Z",
  "refresh_token": "zWOHonfBU7bNWQl5a8HdXV2Q-iNcRhnD1RdP3CpghL4",
  "refresh_expires_at": "2026-11-29T23:16:45.079489365Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "915dabcb-d80e-449c-8c9c-3b854ca07d8b",
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
  "last_heartbeat_at": "2026-10-30T23:15:14.481561Z",
  "last_location_at": "2026-10-30T23:15:14.481561Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/915dabcb-d80e-449c-8c9c-3b854ca07d8b/handover` → **200**

```json
{
  "command_id": "3687c927-818d-432e-94db-7aa9294e53b3",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "915dabcb-d80e-449c-8c9c-3b854ca07d8b",
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
  "last_heartbeat_at": "2026-10-30T23:15:14.481561Z",
  "last_location_at": "2026-10-30T23:15:14.481561Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/915dabcb-d80e-449c-8c9c-3b854ca07d8b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T23:16:45Z",
    "sequence": 1793402205677
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "915dabcb-d80e-449c-8c9c-3b854ca07d8b",
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
  "last_heartbeat_at": "2026-10-30T23:16:45.69305Z",
  "last_location_at": "2026-10-30T23:16:45.69305Z",
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
  "session_id": "915dabcb-d80e-449c-8c9c-3b854ca07d8b",
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
  "last_heartbeat_at": "2026-10-30T23:16:45.69305Z",
  "last_location_at": "2026-10-30T23:16:45.69305Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/915dabcb-d80e-449c-8c9c-3b854ca07d8b/close` → **200**

```json
{
  "command_id": "a75e9c27-16a9-4789-a3c6-5a5b82dec2e9",
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
  "correlation_id": "e660f12f-a434-4ca2-a27e-29a384e74b78"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674672180",
  "device_ref": "sandbox-4261"
}
```

```json
{
  "challenge_id": "971b857d-3422-4783-a935-8b8bdf84ce60",
  "expires_at": "2026-10-30T23:21:46.698402199Z",
  "resend_available_at": "2026-10-30T23:16:47.698402199Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380674672180` → **200**

```json
{
  "phone": "+380674672180",
  "audience": "CLIENT",
  "code": "556636",
  "sent_at": "2026-10-30T23:16:46.700070484Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "971b857d-3422-4783-a935-8b8bdf84ce60",
  "code": "556636",
  "device_ref": "sandbox-4261"
}
```

```json
{
  "session_id": "30bcfb1c-5b56-4bb1-b976-40fe81bc9e35",
  "subject": {
    "type": "CLIENT",
    "id": "a2a07b0c-ff63-4ec4-8e6b-45ff92b58c27"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMmEwN2IwYy1mZjYzLTRlYzQtOGU2Yi00NWZmOTJiNThjMjciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDAzMTA2LCJpYXQiOjE3OTM0MDIyMDYsImp0aSI6ImYzYTk5NWY2LTMwNzUtNDI3ZS05M2EwLTMzMGQ1NGU2MGE2NCIsInNpZCI6IjMwYmNmYjFjLTViNTYtNGJiMS1iOTc2LTQwZmU4MWJjOWUzNSJ9.CGRj-tzTVMXoXfoOjvsKaIXe_AGvsb-YpYU7gUxPINw",
  "access_expires_at": "2026-10-30T23:31:46.92183521Z",
  "refresh_token": "H-Za-mTjrh7PkqSzwkog-F6XRIQbncgbkNaYkKZ_4nI",
  "refresh_expires_at": "2026-11-29T23:16:46.921474885Z",
  "account_created": true
}
```

## The EICAR antivirus test file is refused by the antivirus

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "bc597a86-3fb0-44b8-844b-b510ae77ba65",
  "content_type": "application/pdf",
  "size_bytes": 86
}
```

```json
{
  "file_id": "1f3d8ab1-c825-434f-afef-8a1c2a41414b",
  "upload_path": "/api/rider/v1/uploads/1f3d8ab1-c825-434f-afef-8a1c2a41414b",
  "expires_at": "2026-10-30T23:31:47.12125324Z",
  "max_bytes": 86
}
```

`PUT /api/rider/v1/uploads/1f3d8ab1-c825-434f-afef-8a1c2a41414b` → **200**

```json
{
  "file_id": "1f3d8ab1-c825-434f-afef-8a1c2a41414b",
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
  "command_id": "be79f014-0d11-4811-bd46-93c364ee8f72",
  "content_type": "application/pdf",
  "size_bytes": 92
}
```

```json
{
  "file_id": "2e6425cf-9084-43c5-8725-4d656f045a3c",
  "upload_path": "/api/rider/v1/uploads/2e6425cf-9084-43c5-8725-4d656f045a3c",
  "expires_at": "2026-10-30T23:31:47.361878824Z",
  "max_bytes": 92
}
```

`PUT /api/rider/v1/uploads/2e6425cf-9084-43c5-8725-4d656f045a3c` → **200**

```json
{
  "file_id": "2e6425cf-9084-43c5-8725-4d656f045a3c",
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
  "command_id": "f1ddb6db-7d04-453b-bb50-3dcaeda25fb3",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "dd8cd1ee-77b4-47c1-a22f-e132d9f5a15c",
  "upload_path": "/api/rider/v1/uploads/dd8cd1ee-77b4-47c1-a22f-e132d9f5a15c",
  "expires_at": "2026-10-30T23:31:47.58272345Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/dd8cd1ee-77b4-47c1-a22f-e132d9f5a15c` → **200**

```json
{
  "file_id": "dd8cd1ee-77b4-47c1-a22f-e132d9f5a15c",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "79ece8e1-4e48-465c-b005-43f112a69476",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "dd8cd1ee-77b4-47c1-a22f-e132d9f5a15c"
  ]
}
```

```json
{
  "id": "3be4518a-8088-4e6d-9b6d-bccad0eba929",
  "number": 4,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "a2a07b0c-ff63-4ec4-8e6b-45ff92b58c27",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T23:16:47.80157Z",
  "updated_at": "2026-10-30T23:16:47.80157Z",
  "respond_by": "2026-10-31T03:16:47.80157Z",
  "messages": [
    {
      "id": "58e0a4fa-f67b-4db1-ac42-025430319b3b",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "a2a07b0c-ff63-4ec4-8e6b-45ff92b58c27",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T23:16:47.802134Z",
      "attachments": [
        {
          "file_id": "dd8cd1ee-77b4-47c1-a22f-e132d9f5a15c",
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
  "session_id": "7154f089-2edc-4a23-b55b-6bee705d1e1e",
  "subject": {
    "type": "STAFF",
    "id": "c66269c2-93bc-421d-8af2-6f0cafc54be4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjYyNjljMi05M2JjLTQyMWQtOGFmMi02ZjBjYWZjNTRiZTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDMxMDgsImlhdCI6MTc5MzQwMjIwOCwianRpIjoiODUzOGE3ZTUtMjE5Mi00ZDBhLTlhNjQtZTk3ZWZhMzE0N2RmIiwic2lkIjoiNzE1NGYwODktMmVkYy00YTIzLWI1NWItNmJlZTcwNWQxZTFlIn0.lgzc2YCR8hY19NQuiHi0RTnXktK7SQhD07JWPJrjPCY",
  "access_expires_at": "2026-10-30T23:31:48.217299202Z",
  "refresh_token": "Tm18QmPUoKFsqOz4Ox_xIXzEuIq45uAEfc3RJk5zpz4",
  "refresh_expires_at": "2026-10-31T11:16:48.216894842Z",
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
  "session_id": "f8015f74-b3ae-4240-aa7d-3788702a49f6",
  "subject": {
    "type": "STAFF",
    "id": "c66269c2-93bc-421d-8af2-6f0cafc54be4"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjYyNjljMi05M2JjLTQyMWQtOGFmMi02ZjBjYWZjNTRiZTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDMxMDgsImlhdCI6MTc5MzQwMjIwOCwianRpIjoiZGNmZDcyNzEtYWYwZC00ODNjLWI3OGEtZGM5NmIwYmMwMDE5Iiwic2lkIjoiZjgwMTVmNzQtYjNhZS00MjQwLWFhN2QtMzc4ODcwMmE0OWY2In0.p51yC8OsmOra8jTC7k2T4El2PVdd7ct48pR9yexwK4s",
  "access_expires_at": "2026-10-30T23:31:48.617183477Z",
  "refresh_token": "e71B5YBu4B-W-6wUZfY9jfqB6t-cZOS_9TIZ_kQpTk8",
  "refresh_expires_at": "2026-10-31T11:16:48.616823102Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/3be4518a-8088-4e6d-9b6d-bccad0eba929/attachments/dd8cd1ee-77b4-47c1-a22f-e132d9f5a15c` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "057c6cf9-18d1-476b-b2e4-599d580f48d6",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "ccc68873-163f-4ab4-992b-17e33a6b3cdd",
  "upload_path": "/api/operator/v1/uploads/ccc68873-163f-4ab4-992b-17e33a6b3cdd",
  "expires_at": "2026-10-30T23:31:48.834444541Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/ccc68873-163f-4ab4-992b-17e33a6b3cdd` → **200**

```json
{
  "file_id": "ccc68873-163f-4ab4-992b-17e33a6b3cdd",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/3be4518a-8088-4e6d-9b6d-bccad0eba929` → **200**

```json
{
  "id": "3be4518a-8088-4e6d-9b6d-bccad0eba929",
  "number": 4,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "a2a07b0c-ff63-4ec4-8e6b-45ff92b58c27",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T23:16:47.80157Z",
  "updated_at": "2026-10-30T23:16:47.80157Z",
  "respond_by": "2026-10-31T03:16:47.80157Z",
  "messages": [
    {
      "id": "58e0a4fa-f67b-4db1-ac42-025430319b3b",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "a2a07b0c-ff63-4ec4-8e6b-45ff92b58c27",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T23:16:47.802134Z",
      "attachments": [
        {
          "file_id": "dd8cd1ee-77b4-47c1-a22f-e132d9f5a15c",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/3be4518a-8088-4e6d-9b6d-bccad0eba929/comments` → **200**

```json
{
  "command_id": "3a1021f7-8bee-43c7-a4a7-77a8c18b2d32",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "ccc68873-163f-4ab4-992b-17e33a6b3cdd"
  ]
}
```

```json
{
  "id": "3be4518a-8088-4e6d-9b6d-bccad0eba929",
  "number": 4,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "a2a07b0c-ff63-4ec4-8e6b-45ff92b58c27",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T23:16:47.80157Z",
  "updated_at": "2026-10-30T23:16:49.255718Z",
  "respond_by": "2026-10-31T03:16:47.80157Z",
  "messages": [
    {
      "id": "58e0a4fa-f67b-4db1-ac42-025430319b3b",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "a2a07b0c-ff63-4ec4-8e6b-45ff92b58c27",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T23:16:47.802134Z",
      "attachments": [
        {
          "file_id": "dd8cd1ee-77b4-47c1-a22f-e132d9f5a15c",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "929764d8-e59d-497b-945f-65217700f2e1",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "c66269c2-93bc-421d-8af2-6f0cafc54be4",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T23:16:49.255368Z",
      "attachments": [
        {
          "file_id": "ccc68873-163f-4ab4-992b-17e33a6b3cdd",
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

`GET /api/rider/v1/support/cases/3be4518a-8088-4e6d-9b6d-bccad0eba929` → **200**

```json
{
  "id": "3be4518a-8088-4e6d-9b6d-bccad0eba929",
  "number": 4,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "a2a07b0c-ff63-4ec4-8e6b-45ff92b58c27",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T23:16:47.80157Z",
  "updated_at": "2026-10-30T23:16:49.255718Z",
  "respond_by": "2026-10-31T03:16:47.80157Z",
  "messages": [
    {
      "id": "58e0a4fa-f67b-4db1-ac42-025430319b3b",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "a2a07b0c-ff63-4ec4-8e6b-45ff92b58c27",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T23:16:47.802134Z",
      "attachments": [
        {
          "file_id": "dd8cd1ee-77b4-47c1-a22f-e132d9f5a15c",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "929764d8-e59d-497b-945f-65217700f2e1",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T23:16:49.255368Z",
      "attachments": [
        {
          "file_id": "ccc68873-163f-4ab4-992b-17e33a6b3cdd",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/3be4518a-8088-4e6d-9b6d-bccad0eba929/attachments/ccc68873-163f-4ab4-992b-17e33a6b3cdd` → **200**

Done: support case 3be4518a-8088-4e6d-9b6d-bccad0eba929, rider attachment dd8cd1ee-77b4-47c1-a22f-e132d9f5a15c, operator attachment ccc68873-163f-4ab4-992b-17e33a6b3cdd.

# Scenario: switch-to-cash

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380731606648",
  "device_ref": "sandbox-16310"
}
```

```json
{
  "challenge_id": "ed8f3799-71b8-40f0-a100-48b19bbc9de3",
  "expires_at": "2026-10-30T23:21:49.6896014Z",
  "resend_available_at": "2026-10-30T23:16:50.6896014Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380731606648` → **200**

```json
{
  "phone": "+380731606648",
  "audience": "CLIENT",
  "code": "414720",
  "sent_at": "2026-10-30T23:16:49.691431654Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ed8f3799-71b8-40f0-a100-48b19bbc9de3",
  "code": "414720",
  "device_ref": "sandbox-16310"
}
```

```json
{
  "session_id": "00eda27e-383a-44cb-9cfa-1c4dc39a1245",
  "subject": {
    "type": "CLIENT",
    "id": "63a577e0-15d2-4851-845b-84bab24f571b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2M2E1NzdlMC0xNWQyLTQ4NTEtODQ1Yi04NGJhYjI0ZjU3MWIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDAzMTA5LCJpYXQiOjE3OTM0MDIyMDksImp0aSI6ImY3OTAwMmZjLWIwMTEtNDUwZS04ZDQ5LTRlZDhjZDdiYTZhYyIsInNpZCI6IjAwZWRhMjdlLTM4M2EtNDRjYi05Y2ZhLTFjNGRjMzlhMTI0NSJ9.4sVirMorewLmVNGmc30DWkwedwVBb6R6wzBuyxCw0wg",
  "access_expires_at": "2026-10-30T23:31:49.910492533Z",
  "refresh_token": "MC0Pk5JrQzXwjR40vaC5tP6OCSPXJrvuUMp7GU5IMVE",
  "refresh_expires_at": "2026-11-29T23:16:49.910043475Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "de513cfe-b229-4b04-93f1-1e593eb2f9c5",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "c5fea62f-b95c-4990-8c62-fe8093915e8b",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-c5fea62f-b95c-4990-8c62-fe8093915e8b",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "79a51758f8d073f489f1c1d7d7b1bc02",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=c5fea62f-b95c-4990-8c62-fe8093915e8b",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380731606648"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=c5fea62f-b95c-4990-8c62-fe8093915e8b",
  "expires_at": "2026-10-30T23:46:50.105127Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/c5fea62f-b95c-4990-8c62-fe8093915e8b` → **200**

```json
{
  "id": "c5fea62f-b95c-4990-8c62-fe8093915e8b",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T23:46:50.105127Z",
  "card": {
    "id": "9c47706f-4912-464d-9902-22027961fcba",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****7002",
    "card_type": "Visa",
    "created_at": "2026-10-30T23:16:50.307068Z"
  },
  "failure_reason": null
}
```

## The rider orders by card: the hold is taken

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "bece6431-e142-46c4-9cdb-fa1953805819",
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
  "id": "0be4a475-98a3-4d6e-a7b3-85ca15f32bcf",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T23:21:50.525281Z",
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
  "command_id": "d31a223d-55fe-4067-ba2b-96abf5772dd0",
  "quote_id": "0be4a475-98a3-4d6e-a7b3-85ca15f32bcf",
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
  "id": "81eb7127-4353-472f-b1e3-73813b7cd974",
  "short_number": 37,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "63a577e0-15d2-4851-845b-84bab24f571b",
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
  "created_at": "2026-10-30T23:16:50.730997Z",
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

`GET /api/rider/v1/orders/81eb7127-4353-472f-b1e3-73813b7cd974` → **200**

```json
{
  "id": "81eb7127-4353-472f-b1e3-73813b7cd974",
  "short_number": 37,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "63a577e0-15d2-4851-845b-84bab24f571b",
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
  "created_at": "2026-10-30T23:16:50.730997Z",
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

`GET /api/rider/v1/orders/81eb7127-4353-472f-b1e3-73813b7cd974` → **200**

```json
{
  "id": "81eb7127-4353-472f-b1e3-73813b7cd974",
  "short_number": 37,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "63a577e0-15d2-4851-845b-84bab24f571b",
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
  "created_at": "2026-10-30T23:16:50.730997Z",
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

`GET /api/rider/v1/orders/81eb7127-4353-472f-b1e3-73813b7cd974` → **200**

```json
{
  "id": "81eb7127-4353-472f-b1e3-73813b7cd974",
  "short_number": 37,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "63a577e0-15d2-4851-845b-84bab24f571b",
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
  "created_at": "2026-10-30T23:16:50.730997Z",
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

`POST /api/rider/v1/orders/81eb7127-4353-472f-b1e3-73813b7cd974/switch-to-cash` → **200**

```json
{
  "command_id": "2b325d9c-f4d4-45d4-883f-bb329acb2cc7",
  "expected_version": 3
}
```

```json
{
  "id": "81eb7127-4353-472f-b1e3-73813b7cd974",
  "short_number": 37,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "63a577e0-15d2-4851-845b-84bab24f571b",
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
  "created_at": "2026-10-30T23:16:50.730997Z",
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

`POST /api/rider/v1/orders/81eb7127-4353-472f-b1e3-73813b7cd974/switch-to-cash` → **409**

```json
{
  "command_id": "139487b7-bd5e-4d44-ae70-31211523e6ac",
  "expected_version": 4
}
```

```json
{
  "instance": "/api/rider/v1/orders/81eb7127-4353-472f-b1e3-73813b7cd974/switch-to-cash",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "7b053252-60a3-435e-b370-d794eccbc9bf"
}
```

Done: the card order became cash; a second switch is refused.

`GET /api/rider/v1/orders/81eb7127-4353-472f-b1e3-73813b7cd974` → **200**

```json
{
  "id": "81eb7127-4353-472f-b1e3-73813b7cd974",
  "short_number": 37,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "63a577e0-15d2-4851-845b-84bab24f571b",
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
  "created_at": "2026-10-30T23:16:50.730997Z",
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

`POST /api/rider/v1/orders/81eb7127-4353-472f-b1e3-73813b7cd974/cancel` → **200**

```json
{
  "command_id": "0e6224b6-09ac-450e-9f5c-c947d62e60eb",
  "expected_version": 4,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "81eb7127-4353-472f-b1e3-73813b7cd974",
  "short_number": 37,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "63a577e0-15d2-4851-845b-84bab24f571b",
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
  "created_at": "2026-10-30T23:16:50.730997Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "ru": "Передумал ехать",
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
      "en": "Changed my mind"
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
  "session_id": "1fb97ae0-13f4-4886-a1e3-90623106c38b",
  "subject": {
    "type": "STAFF",
    "id": "c66269c2-93bc-421d-8af2-6f0cafc54be4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjYyNjljMi05M2JjLTQyMWQtOGFmMi02ZjBjYWZjNTRiZTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDMxMTMsImlhdCI6MTc5MzQwMjIxMywianRpIjoiYTQwNjdmMzAtZmI4MS00ZTgxLWI3ZDMtOGZmYTI3NDdmYzRjIiwic2lkIjoiMWZiOTdhZTAtMTNmNC00ODg2LWExZTMtOTA2MjMxMDZjMzhiIn0.5eipl4ChAgwfcw0q6TbZ4L2WyLtajW6zTpyV9wPMWgc",
  "access_expires_at": "2026-10-30T23:31:53.642870828Z",
  "refresh_token": "faJPyE75u8oNYHImJSf-_eUvw69Krvp-Pg__DaL2Sjs",
  "refresh_expires_at": "2026-10-31T11:16:53.642400159Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-22674"
}
```

```json
{
  "challenge_id": "0b27fcd6-099b-46a4-a737-0d7c2f3e82e9",
  "expires_at": "2026-10-30T23:21:53.862989901Z",
  "resend_available_at": "2026-10-30T23:16:54.862989901Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "725697",
  "sent_at": "2026-10-30T23:16:53.865122756Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0b27fcd6-099b-46a4-a737-0d7c2f3e82e9",
  "code": "725697",
  "device_ref": "sandbox-22674"
}
```

```json
{
  "session_id": "cf976569-bed3-446b-b21b-22aa41101b6d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwMzExNCwiaWF0IjoxNzkzNDAyMjE0LCJqdGkiOiIyNWIwMTYxNy1jY2YyLTRmOTYtYTg2My1hNDMyYjk2MzIwNDIiLCJzaWQiOiJjZjk3NjU2OS1iZWQzLTQ0NmItYjIxYi0yMmFhNDExMDFiNmQifQ.t3SzwtemiYA9WIuNV4q3XN5rYwNuEBzFO74Lz2VKPrE",
  "access_expires_at": "2026-10-30T23:31:54.084547693Z",
  "refresh_token": "g1IwgWoBb7WeeuQ0LVxPHobRDEngjwDrZvo21ZEIr2M",
  "refresh_expires_at": "2026-11-29T23:16:54.084193548Z",
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
  "version": 19,
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
    "version": 19,
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
      "actor_id": "c66269c2-93bc-421d-8af2-6f0cafc54be4",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T23:16:41.475931Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "c66269c2-93bc-421d-8af2-6f0cafc54be4",
      "reason": "Sandbox clean-up",
      "at": "2026-10-30T23:16:42.452526Z"
    }
  ],
  "duplicates": []
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "5cf84752-9d23-4a22-b169-4b09a69ef3a4",
  "expected_version": 19,
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
  "version": 20,
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
  "device_ref": "sandbox-11663"
}
```

```json
{
  "challenge_id": "9719315d-f49e-4c06-9f70-2404807dea1f",
  "expires_at": "2026-10-30T23:21:54.893564483Z",
  "resend_available_at": "2026-10-30T23:16:55.893564483Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "082148",
  "sent_at": "2026-10-30T23:16:54.895397994Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9719315d-f49e-4c06-9f70-2404807dea1f",
  "code": "082148",
  "device_ref": "sandbox-11663"
}
```

```json
{
  "session_id": "971660ad-80ed-40a8-8507-015a423e2ab9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwMzExNSwiaWF0IjoxNzkzNDAyMjE1LCJqdGkiOiI3ZDFjYzU0Mi1jNzYyLTQwMjEtOTQ2Mi1hYWU0ZjE2OTMxMTUiLCJzaWQiOiI5NzE2NjBhZC04MGVkLTQwYTgtODUwNy0wMTVhNDIzZTJhYjkifQ.X0S0A6xtKf88Mnuu-5tvQz2hllDUtt9d2ikWGtcaRow",
  "access_expires_at": "2026-10-30T23:31:55.119715935Z",
  "refresh_token": "8EMuMEM9SEmZznXJBjmSFS6dAZ8V1oBuAsz4NCszYcU",
  "refresh_expires_at": "2026-11-29T23:16:55.11936234Z",
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

(the car drives 1 s to the next point)

`POST /api/driver/v1/work-sessions` → **201**

```json
{
  "command_id": "7a2011e4-b41c-4acf-b36d-53fa5dea56fd",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T23:16:56Z",
    "sequence": 1793402216529
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "bc8e57f2-1d6b-4553-b8d1-81064dbcdb4c",
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
  "last_heartbeat_at": "2026-10-30T23:16:56.544897Z",
  "last_location_at": "2026-10-30T23:16:56.544897Z",
  "eligible": true,
  "ineligible_reasons": []
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
  "command_id": "8c0621b9-0d76-4e3b-bb99-44c59e9c8493",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T23:16:56Z",
    "sequence": 1793402216955
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "5702fb3f-7ef9-4e3e-97da-cda628a2bab7",
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
  "last_heartbeat_at": "2026-10-30T23:16:56.972372Z",
  "last_location_at": "2026-10-30T23:16:56.972372Z",
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
  "session_id": "a045e3a5-8da1-427a-ae55-db1087add43e",
  "subject": {
    "type": "STAFF",
    "id": "c66269c2-93bc-421d-8af2-6f0cafc54be4"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjYyNjljMi05M2JjLTQyMWQtOGFmMi02ZjBjYWZjNTRiZTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDMxMTcsImlhdCI6MTc5MzQwMjIxNywianRpIjoiZTZhNGJmMDItZjdiYS00MmU0LTk3YmQtOTBiYjUwMGJhNmI1Iiwic2lkIjoiYTA0NWUzYTUtOGRhMS00MjdhLWFlNTUtZGIxMDg3YWRkNDNlIn0.7qgn5XgwvosqL4la4Q5hOcxrCXWkWGphosUueTFjZfc",
  "access_expires_at": "2026-10-30T23:31:57.383187402Z",
  "refresh_token": "6v2eq3SEBJRqdz_olqblN7A5Ge3zUcVeyLj9BfFgMHU",
  "refresh_expires_at": "2026-10-31T11:16:57.382489686Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "e731598f-2152-4a2f-b0e9-316df0e7ebe9",
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
  "id": "16fd7f4b-fd81-4fa0-b20e-4d5f62ebd5fe",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T23:21:57.585900Z",
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
  "command_id": "89184f6a-b2e7-43d1-9eb8-594d851a90de",
  "quote_id": "16fd7f4b-fd81-4fa0-b20e-4d5f62ebd5fe",
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
  "id": "1fc5445b-875d-4b5c-8ef1-77391a6fbe42",
  "short_number": 38,
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
  "created_at": "2026-10-30T23:16:57.795529Z",
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
    "id": "ec47223c-ece5-4d76-8deb-cc5cc305cccf",
    "order_id": "1fc5445b-875d-4b5c-8ef1-77391a6fbe42",
    "expires_at": "2026-10-30T23:17:12.798056Z",
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

`POST /api/driver/v1/offers/ec47223c-ece5-4d76-8deb-cc5cc305cccf/accept` → **200**

```json
{
  "command_id": "05d9bd24-db93-4a17-8dd0-c9d983799dee"
}
```

```json
{
  "id": "c2f0ecc8-5735-44c9-8e17-cd74b21dbcce",
  "order_id": "1fc5445b-875d-4b5c-8ef1-77391a6fbe42",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e2c7bcee-24cb-457c-85c9-e582501be71a",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e2c7bcee-24cb-457c-85c9-e582501be71a",
  "order_id": "1fc5445b-875d-4b5c-8ef1-77391a6fbe42",
  "assignment_id": "c2f0ecc8-5735-44c9-8e17-cd74b21dbcce",
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

`POST /api/driver/v1/work-sessions/5702fb3f-7ef9-4e3e-97da-cda628a2bab7/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T23:17:08Z",
    "sequence": 1793402228849
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "5702fb3f-7ef9-4e3e-97da-cda628a2bab7",
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
  "last_heartbeat_at": "2026-10-30T23:17:08.865051Z",
  "last_location_at": "2026-10-30T23:17:08.865051Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/e2c7bcee-24cb-457c-85c9-e582501be71a/arrive` → **200**

```json
{
  "command_id": "278911d1-a52e-4959-8a06-ac2de43121f5",
  "expected_version": 0
}
```

```json
{
  "id": "e2c7bcee-24cb-457c-85c9-e582501be71a",
  "order_id": "1fc5445b-875d-4b5c-8ef1-77391a6fbe42",
  "assignment_id": "c2f0ecc8-5735-44c9-8e17-cd74b21dbcce",
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
  "arrived_at": "2026-10-30T23:17:09.071894Z",
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

`POST /api/driver/v1/trips/e2c7bcee-24cb-457c-85c9-e582501be71a/start` → **200**

```json
{
  "command_id": "f36776f3-3864-4cf2-a372-a1e8b32f700e",
  "expected_version": 1
}
```

```json
{
  "id": "e2c7bcee-24cb-457c-85c9-e582501be71a",
  "order_id": "1fc5445b-875d-4b5c-8ef1-77391a6fbe42",
  "assignment_id": "c2f0ecc8-5735-44c9-8e17-cd74b21dbcce",
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
  "arrived_at": "2026-10-30T23:17:09.071894Z",
  "started_at": "2026-10-30T23:17:09.287545Z",
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

`POST /api/driver/v1/trips/e2c7bcee-24cb-457c-85c9-e582501be71a/complete` → **200**

```json
{
  "command_id": "b0f5c6a7-34a0-4b0a-8d07-c7cb988fd97e",
  "expected_version": 2,
  "reported_at": "2026-10-30T23:17:09Z",
  "cash_received": true
}
```

```json
{
  "id": "e2c7bcee-24cb-457c-85c9-e582501be71a",
  "order_id": "1fc5445b-875d-4b5c-8ef1-77391a6fbe42",
  "assignment_id": "c2f0ecc8-5735-44c9-8e17-cd74b21dbcce",
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
  "arrived_at": "2026-10-30T23:17:09.071894Z",
  "started_at": "2026-10-30T23:17:09.287545Z",
  "completed_at": "2026-10-30T23:17:09.499393Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/1fc5445b-875d-4b5c-8ef1-77391a6fbe42` → **200**

```json
{
  "id": "1fc5445b-875d-4b5c-8ef1-77391a6fbe42",
  "short_number": 38,
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
    "id": "c2f0ecc8-5735-44c9-8e17-cd74b21dbcce",
    "order_id": "1fc5445b-875d-4b5c-8ef1-77391a6fbe42",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "e2c7bcee-24cb-457c-85c9-e582501be71a",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T23:16:57.795529Z",
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
  "session_id": "bc8e57f2-1d6b-4553-b8d1-81064dbcdb4c",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "STALE",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T23:16:56.544897Z",
  "last_location_at": "2026-10-30T23:16:56.544897Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/bc8e57f2-1d6b-4553-b8d1-81064dbcdb4c/close` → **200**

```json
{
  "command_id": "4239adbf-89ec-40e9-9b20-f74d95026479",
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
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "5702fb3f-7ef9-4e3e-97da-cda628a2bab7",
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
  "last_heartbeat_at": "2026-10-30T23:17:08.865051Z",
  "last_location_at": "2026-10-30T23:17:08.865051Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5702fb3f-7ef9-4e3e-97da-cda628a2bab7/close` → **200**

```json
{
  "command_id": "1c369efd-4cba-4548-b57b-0f3b53e29b67",
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

Done: terminal order 1fc5445b-875d-4b5c-8ef1-77391a6fbe42 by Andrii (5a000000-0000-4000-8000-000000000403).

# Scenario: zz-metrics

## A search without drivers ends as UNFULFILLED

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-13691"
}
```

```json
{
  "challenge_id": "1947ae62-c13c-4a80-a0ed-49d591054f31",
  "expires_at": "2026-10-30T23:22:13.922477529Z",
  "resend_available_at": "2026-10-30T23:17:14.922477529Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "967134",
  "sent_at": "2026-10-30T23:17:13.924541692Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1947ae62-c13c-4a80-a0ed-49d591054f31",
  "code": "967134",
  "device_ref": "sandbox-13691"
}
```

```json
{
  "session_id": "8c8f4de3-77d5-4774-be65-74138172a560",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwMzEzNCwiaWF0IjoxNzkzNDAyMjM0LCJqdGkiOiIyOWFkNDNhMC01MGUxLTQ0N2MtOWY5MC0yOGJiNTA1NWI4M2QiLCJzaWQiOiI4YzhmNGRlMy03N2Q1LTQ3NzQtYmU2NS03NDEzODE3MmE1NjAifQ.ZPufLz7VpgDg5f5SBVtdhJij2dobKaVr5DmOzbmZZ2U",
  "access_expires_at": "2026-10-30T23:32:14.147125837Z",
  "refresh_token": "Vr09Lk3zfvn-ERxWc-i1vmajxa-Vvn-ZgYAXhImWmhA",
  "refresh_expires_at": "2026-11-29T23:17:14.146645808Z",
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
  "device_ref": "sandbox-20952"
}
```

```json
{
  "challenge_id": "18f8e9b2-cb1b-4c8e-a586-baad78a01b80",
  "expires_at": "2026-10-30T23:22:14.542726356Z",
  "resend_available_at": "2026-10-30T23:17:15.542726356Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "212184",
  "sent_at": "2026-10-30T23:17:14.544576026Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "18f8e9b2-cb1b-4c8e-a586-baad78a01b80",
  "code": "212184",
  "device_ref": "sandbox-20952"
}
```

```json
{
  "session_id": "4ee035d9-a533-4e8f-af36-d2223121275b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwMzEzNCwiaWF0IjoxNzkzNDAyMjM0LCJqdGkiOiIzOGViZWVhMy0zODMwLTQyMTktYWY3Yy05OWZlYjRmZTFmMDgiLCJzaWQiOiI0ZWUwMzVkOS1hNTMzLTRlOGYtYWYzNi1kMjIyMzEyMTI3NWIifQ.2I2gdI-zVkzdqkPT6PvUQjnJTwZRzdZW2Hj7S7KjFdk",
  "access_expires_at": "2026-10-30T23:32:14.762696203Z",
  "refresh_token": "P1kFdzx8CoQ-al6qaWLfpWpIJyoE9FGe5B0EyngPl2w",
  "refresh_expires_at": "2026-11-29T23:17:14.762309889Z",
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
  "device_ref": "sandbox-2459"
}
```

```json
{
  "challenge_id": "a3e692e5-6b2a-48b4-b377-6aaaf6b90632",
  "expires_at": "2026-10-30T23:22:15.149597978Z",
  "resend_available_at": "2026-10-30T23:17:16.149597978Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "709208",
  "sent_at": "2026-10-30T23:17:15.152626741Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a3e692e5-6b2a-48b4-b377-6aaaf6b90632",
  "code": "709208",
  "device_ref": "sandbox-2459"
}
```

```json
{
  "session_id": "6e7bb900-24b0-4c26-a943-a3348cd7a39b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwMzEzNSwiaWF0IjoxNzkzNDAyMjM1LCJqdGkiOiI0NTdmNGY1OS1hZGJkLTQ0MzAtODcxYy1iNzZkNjI2NzBiNDkiLCJzaWQiOiI2ZTdiYjkwMC0yNGIwLTRjMjYtYTk0My1hMzM0OGNkN2EzOWIifQ.bS7pwW0s5_MJg3ewSx9OtR9K6DBVAM3SmDRlx15bqe4",
  "access_expires_at": "2026-10-30T23:32:15.372575086Z",
  "refresh_token": "5XjWtGuSK0XxlKaooV87MvqMOhhVwvxdVgkiCD_wr2Q",
  "refresh_expires_at": "2026-11-29T23:17:15.371927974Z",
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
  "phone": "+380699884282",
  "device_ref": "sandbox-16082"
}
```

```json
{
  "challenge_id": "942274ee-bf88-4b29-827f-4ba230568436",
  "expires_at": "2026-10-30T23:22:15.761941726Z",
  "resend_available_at": "2026-10-30T23:17:16.761941726Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380699884282` → **200**

```json
{
  "phone": "+380699884282",
  "audience": "CLIENT",
  "code": "832628",
  "sent_at": "2026-10-30T23:17:15.7638205Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "942274ee-bf88-4b29-827f-4ba230568436",
  "code": "832628",
  "device_ref": "sandbox-16082"
}
```

```json
{
  "session_id": "34ff29f4-960b-4839-8794-3d353723f82d",
  "subject": {
    "type": "CLIENT",
    "id": "a3168c8a-0cd8-4faa-bf85-aaa450fe1307"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMzE2OGM4YS0wY2Q4LTRmYWEtYmY4NS1hYWE0NTBmZTEzMDciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDAzMTM1LCJpYXQiOjE3OTM0MDIyMzUsImp0aSI6IjgxMzAxNTAxLTU2NzktNDdjYS1iYjc0LWZhNTA2N2I0YWZhNSIsInNpZCI6IjM0ZmYyOWY0LTk2MGItNDgzOS04Nzk0LTNkMzUzNzIzZjgyZCJ9.r5eR8yi4hFA5Lg9xK1-ou0iQ7P8c3A-pFlH_dPNf0rE",
  "access_expires_at": "2026-10-30T23:32:15.982100515Z",
  "refresh_token": "DsD_UwxqbSMW8XrMtkJkW-MLloLP7nlUldbm05vSeS8",
  "refresh_expires_at": "2026-11-29T23:17:15.981546906Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f73dffa1-23a7-4b87-87c4-708bdd2d1469",
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
  "id": "249ad2a6-5e01-490c-adf9-941c42d1ae0c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T23:22:16.180396Z",
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
  "command_id": "b522d5f6-0c13-4fb1-ad5e-0f2a3529269c",
  "quote_id": "249ad2a6-5e01-490c-adf9-941c42d1ae0c",
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
  "id": "3bbe1269-247b-404e-8010-34a3693a8398",
  "short_number": 39,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a3168c8a-0cd8-4faa-bf85-aaa450fe1307",
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
  "created_at": "2026-10-30T23:17:16.388549Z",
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

`GET /api/rider/v1/orders/3bbe1269-247b-404e-8010-34a3693a8398` → **200**

```json
{
  "id": "3bbe1269-247b-404e-8010-34a3693a8398",
  "short_number": 39,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a3168c8a-0cd8-4faa-bf85-aaa450fe1307",
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
  "created_at": "2026-10-30T23:17:16.388549Z",
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

`GET /api/rider/v1/orders/3bbe1269-247b-404e-8010-34a3693a8398` → **200**

```json
{
  "id": "3bbe1269-247b-404e-8010-34a3693a8398",
  "short_number": 39,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a3168c8a-0cd8-4faa-bf85-aaa450fe1307",
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
  "created_at": "2026-10-30T23:17:16.388549Z",
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

`GET /api/rider/v1/orders/3bbe1269-247b-404e-8010-34a3693a8398` → **200**

```json
{
  "id": "3bbe1269-247b-404e-8010-34a3693a8398",
  "short_number": 39,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a3168c8a-0cd8-4faa-bf85-aaa450fe1307",
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
  "created_at": "2026-10-30T23:17:16.388549Z",
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

`GET /api/rider/v1/orders/3bbe1269-247b-404e-8010-34a3693a8398` → **200**

```json
{
  "id": "3bbe1269-247b-404e-8010-34a3693a8398",
  "short_number": 39,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a3168c8a-0cd8-4faa-bf85-aaa450fe1307",
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
  "created_at": "2026-10-30T23:17:16.388549Z",
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

`GET /api/rider/v1/orders/3bbe1269-247b-404e-8010-34a3693a8398` → **200**

```json
{
  "id": "3bbe1269-247b-404e-8010-34a3693a8398",
  "short_number": 39,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a3168c8a-0cd8-4faa-bf85-aaa450fe1307",
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
  "created_at": "2026-10-30T23:17:16.388549Z",
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

`GET /api/rider/v1/orders/3bbe1269-247b-404e-8010-34a3693a8398` → **200**

```json
{
  "id": "3bbe1269-247b-404e-8010-34a3693a8398",
  "short_number": 39,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a3168c8a-0cd8-4faa-bf85-aaa450fe1307",
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
  "created_at": "2026-10-30T23:17:16.388549Z",
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

`GET /api/rider/v1/orders/3bbe1269-247b-404e-8010-34a3693a8398` → **200**

```json
{
  "id": "3bbe1269-247b-404e-8010-34a3693a8398",
  "short_number": 39,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a3168c8a-0cd8-4faa-bf85-aaa450fe1307",
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
  "created_at": "2026-10-30T23:17:16.388549Z",
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

`GET /api/rider/v1/orders/3bbe1269-247b-404e-8010-34a3693a8398` → **200**

```json
{
  "id": "3bbe1269-247b-404e-8010-34a3693a8398",
  "short_number": 39,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a3168c8a-0cd8-4faa-bf85-aaa450fe1307",
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
  "created_at": "2026-10-30T23:17:16.388549Z",
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

`GET /api/rider/v1/orders/3bbe1269-247b-404e-8010-34a3693a8398` → **200**

```json
{
  "id": "3bbe1269-247b-404e-8010-34a3693a8398",
  "short_number": 39,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a3168c8a-0cd8-4faa-bf85-aaa450fe1307",
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
  "created_at": "2026-10-30T23:17:16.388549Z",
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

`GET /api/rider/v1/orders/3bbe1269-247b-404e-8010-34a3693a8398` → **200**

```json
{
  "id": "3bbe1269-247b-404e-8010-34a3693a8398",
  "short_number": 39,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a3168c8a-0cd8-4faa-bf85-aaa450fe1307",
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
  "created_at": "2026-10-30T23:17:16.388549Z",
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

`GET /api/rider/v1/orders/3bbe1269-247b-404e-8010-34a3693a8398` → **200**

```json
{
  "id": "3bbe1269-247b-404e-8010-34a3693a8398",
  "short_number": 39,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a3168c8a-0cd8-4faa-bf85-aaa450fe1307",
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
  "created_at": "2026-10-30T23:17:16.388549Z",
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

`GET /api/rider/v1/orders/3bbe1269-247b-404e-8010-34a3693a8398` → **200**

```json
{
  "id": "3bbe1269-247b-404e-8010-34a3693a8398",
  "short_number": 39,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a3168c8a-0cd8-4faa-bf85-aaa450fe1307",
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
  "created_at": "2026-10-30T23:17:16.388549Z",
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

`GET /api/rider/v1/orders/3bbe1269-247b-404e-8010-34a3693a8398` → **200**

```json
{
  "id": "3bbe1269-247b-404e-8010-34a3693a8398",
  "short_number": 39,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a3168c8a-0cd8-4faa-bf85-aaa450fe1307",
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
  "created_at": "2026-10-30T23:17:16.388549Z",
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

`GET /api/rider/v1/orders/3bbe1269-247b-404e-8010-34a3693a8398` → **200**

```json
{
  "id": "3bbe1269-247b-404e-8010-34a3693a8398",
  "short_number": 39,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a3168c8a-0cd8-4faa-bf85-aaa450fe1307",
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
  "created_at": "2026-10-30T23:17:16.388549Z",
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

`GET /api/rider/v1/orders/3bbe1269-247b-404e-8010-34a3693a8398` → **200**

```json
{
  "id": "3bbe1269-247b-404e-8010-34a3693a8398",
  "short_number": 39,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a3168c8a-0cd8-4faa-bf85-aaa450fe1307",
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
  "created_at": "2026-10-30T23:17:16.388549Z",
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

`GET /api/rider/v1/orders/3bbe1269-247b-404e-8010-34a3693a8398` → **200**

```json
{
  "id": "3bbe1269-247b-404e-8010-34a3693a8398",
  "short_number": 39,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a3168c8a-0cd8-4faa-bf85-aaa450fe1307",
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
  "created_at": "2026-10-30T23:17:16.388549Z",
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

`GET /api/rider/v1/orders/3bbe1269-247b-404e-8010-34a3693a8398` → **200**

```json
{
  "id": "3bbe1269-247b-404e-8010-34a3693a8398",
  "short_number": 39,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a3168c8a-0cd8-4faa-bf85-aaa450fe1307",
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
  "created_at": "2026-10-30T23:17:16.388549Z",
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

`GET /api/rider/v1/orders/3bbe1269-247b-404e-8010-34a3693a8398` → **200**

```json
{
  "id": "3bbe1269-247b-404e-8010-34a3693a8398",
  "short_number": 39,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a3168c8a-0cd8-4faa-bf85-aaa450fe1307",
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
  "created_at": "2026-10-30T23:17:16.388549Z",
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

`GET /api/rider/v1/orders/3bbe1269-247b-404e-8010-34a3693a8398` → **200**

```json
{
  "id": "3bbe1269-247b-404e-8010-34a3693a8398",
  "short_number": 39,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a3168c8a-0cd8-4faa-bf85-aaa450fe1307",
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
  "created_at": "2026-10-30T23:17:16.388549Z",
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

`GET /api/rider/v1/orders/3bbe1269-247b-404e-8010-34a3693a8398` → **200**

```json
{
  "id": "3bbe1269-247b-404e-8010-34a3693a8398",
  "short_number": 39,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a3168c8a-0cd8-4faa-bf85-aaa450fe1307",
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
  "created_at": "2026-10-30T23:17:16.388549Z",
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

`GET /api/rider/v1/orders/3bbe1269-247b-404e-8010-34a3693a8398` → **200**

```json
{
  "id": "3bbe1269-247b-404e-8010-34a3693a8398",
  "short_number": 39,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a3168c8a-0cd8-4faa-bf85-aaa450fe1307",
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
  "created_at": "2026-10-30T23:17:16.388549Z",
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

`GET /api/rider/v1/orders/3bbe1269-247b-404e-8010-34a3693a8398` → **200**

```json
{
  "id": "3bbe1269-247b-404e-8010-34a3693a8398",
  "short_number": 39,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a3168c8a-0cd8-4faa-bf85-aaa450fe1307",
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
  "created_at": "2026-10-30T23:17:16.388549Z",
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

`GET /api/rider/v1/orders/3bbe1269-247b-404e-8010-34a3693a8398` → **200**

```json
{
  "id": "3bbe1269-247b-404e-8010-34a3693a8398",
  "short_number": 39,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a3168c8a-0cd8-4faa-bf85-aaa450fe1307",
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
  "created_at": "2026-10-30T23:17:16.388549Z",
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

`GET /api/rider/v1/orders/3bbe1269-247b-404e-8010-34a3693a8398` → **200**

```json
{
  "id": "3bbe1269-247b-404e-8010-34a3693a8398",
  "short_number": 39,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a3168c8a-0cd8-4faa-bf85-aaa450fe1307",
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
  "created_at": "2026-10-30T23:17:16.388549Z",
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

`GET /api/rider/v1/orders/3bbe1269-247b-404e-8010-34a3693a8398` → **200**

```json
{
  "id": "3bbe1269-247b-404e-8010-34a3693a8398",
  "short_number": 39,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a3168c8a-0cd8-4faa-bf85-aaa450fe1307",
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
  "created_at": "2026-10-30T23:17:16.388549Z",
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

`GET /api/rider/v1/orders/3bbe1269-247b-404e-8010-34a3693a8398` → **200**

```json
{
  "id": "3bbe1269-247b-404e-8010-34a3693a8398",
  "short_number": 39,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a3168c8a-0cd8-4faa-bf85-aaa450fe1307",
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
  "created_at": "2026-10-30T23:17:16.388549Z",
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

`GET /api/rider/v1/orders/3bbe1269-247b-404e-8010-34a3693a8398` → **200**

```json
{
  "id": "3bbe1269-247b-404e-8010-34a3693a8398",
  "short_number": 39,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a3168c8a-0cd8-4faa-bf85-aaa450fe1307",
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
  "created_at": "2026-10-30T23:17:16.388549Z",
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

`GET /api/rider/v1/orders/3bbe1269-247b-404e-8010-34a3693a8398` → **200**

```json
{
  "id": "3bbe1269-247b-404e-8010-34a3693a8398",
  "short_number": 39,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a3168c8a-0cd8-4faa-bf85-aaa450fe1307",
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
  "created_at": "2026-10-30T23:17:16.388549Z",
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

`GET /api/rider/v1/orders/3bbe1269-247b-404e-8010-34a3693a8398` → **200**

```json
{
  "id": "3bbe1269-247b-404e-8010-34a3693a8398",
  "short_number": 39,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a3168c8a-0cd8-4faa-bf85-aaa450fe1307",
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
  "created_at": "2026-10-30T23:17:16.388549Z",
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

`GET /api/rider/v1/orders/3bbe1269-247b-404e-8010-34a3693a8398` → **200**

```json
{
  "id": "3bbe1269-247b-404e-8010-34a3693a8398",
  "short_number": 39,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a3168c8a-0cd8-4faa-bf85-aaa450fe1307",
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
  "created_at": "2026-10-30T23:17:16.388549Z",
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

`GET /api/rider/v1/orders/3bbe1269-247b-404e-8010-34a3693a8398` → **200**

```json
{
  "id": "3bbe1269-247b-404e-8010-34a3693a8398",
  "short_number": 39,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a3168c8a-0cd8-4faa-bf85-aaa450fe1307",
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
  "created_at": "2026-10-30T23:17:16.388549Z",
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

`GET /api/rider/v1/orders/3bbe1269-247b-404e-8010-34a3693a8398` → **200**

```json
{
  "id": "3bbe1269-247b-404e-8010-34a3693a8398",
  "short_number": 39,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a3168c8a-0cd8-4faa-bf85-aaa450fe1307",
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
  "created_at": "2026-10-30T23:17:16.388549Z",
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

`GET /api/rider/v1/orders/3bbe1269-247b-404e-8010-34a3693a8398` → **200**

```json
{
  "id": "3bbe1269-247b-404e-8010-34a3693a8398",
  "short_number": 39,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a3168c8a-0cd8-4faa-bf85-aaa450fe1307",
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
  "created_at": "2026-10-30T23:17:16.388549Z",
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

`GET /api/rider/v1/orders/3bbe1269-247b-404e-8010-34a3693a8398` → **200**

```json
{
  "id": "3bbe1269-247b-404e-8010-34a3693a8398",
  "short_number": 39,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a3168c8a-0cd8-4faa-bf85-aaa450fe1307",
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
  "created_at": "2026-10-30T23:17:16.388549Z",
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

`GET /api/rider/v1/orders/3bbe1269-247b-404e-8010-34a3693a8398` → **200**

```json
{
  "id": "3bbe1269-247b-404e-8010-34a3693a8398",
  "short_number": 39,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a3168c8a-0cd8-4faa-bf85-aaa450fe1307",
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
  "created_at": "2026-10-30T23:17:16.388549Z",
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

`GET /api/rider/v1/orders/3bbe1269-247b-404e-8010-34a3693a8398` → **200**

```json
{
  "id": "3bbe1269-247b-404e-8010-34a3693a8398",
  "short_number": 39,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "a3168c8a-0cd8-4faa-bf85-aaa450fe1307",
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
  "created_at": "2026-10-30T23:17:16.388549Z",
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
  "blizz_orders_total": 39,
  "blizz_orders_cancelled_total": 24,
  "blizz_orders_unfulfilled_total": 1,
  "blizz_dispatch_first_offer_seconds_count": 26,
  "blizz_dispatch_assigned_seconds_count": 24,
  "blizz_offers_total": 30,
  "blizz_dispatch_excluded_total": 19,
  "blizz_sms_sent_total": 94
}

```prometheus
blizz_dispatch_assigned_seconds_count{application="blizz-taxi-server",source="BROADCAST"} 1
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="BROADCAST"} 7.982483345
blizz_dispatch_assigned_seconds_count{application="blizz-taxi-server",source="OFFER"} 23
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="OFFER"} 19.388758698
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="BROADCAST"} 0.0
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="OFFER"} 0.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="ALREADY_OFFERED"} 2.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="BUSY"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="CITY_NOT_ADMITTED"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PAUSED"} 5.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PAYMENT"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PREVIOUS_DRIVER"} 3.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="STALE_LOCATION"} 5.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="TOO_FAR"} 1.0
blizz_dispatch_first_offer_seconds_count{application="blizz-taxi-server"} 26
blizz_dispatch_first_offer_seconds_sum{application="blizz-taxi-server"} 0.401560532
blizz_dispatch_first_offer_seconds_max{application="blizz-taxi-server"} 0.0
blizz_offers_total{application="blizz-taxi-server",outcome="ACCEPTED"} 23.0
blizz_offers_total{application="blizz-taxi-server",outcome="DECLINED"} 2.0
blizz_offers_total{application="blizz-taxi-server",outcome="REVOKED"} 5.0
blizz_orders_total{application="blizz-taxi-server",channel="APP",preorder="false"} 31.0
blizz_orders_total{application="blizz-taxi-server",channel="APP",preorder="true"} 2.0
blizz_orders_total{application="blizz-taxi-server",channel="PHONE",preorder="false"} 6.0
blizz_orders_cancelled_total{application="blizz-taxi-server",by="DRIVER",reason="PASSENGER_ASKED"} 2.0
blizz_orders_cancelled_total{application="blizz-taxi-server",by="RIDER",reason="CHANGED_MIND"} 7.0
blizz_orders_cancelled_total{application="blizz-taxi-server",by="RIDER",reason="WAIT_TOO_LONG"} 1.0
blizz_orders_cancelled_total{application="blizz-taxi-server",by="STAFF",reason="NO_CARS"} 12.0
blizz_orders_cancelled_total{application="blizz-taxi-server",by="STAFF",reason="OTHER"} 2.0
blizz_orders_unfulfilled_total{application="blizz-taxi-server"} 1.0
blizz_sms_sent_total{application="blizz-taxi-server",purpose="CALLER",state="SENT"} 6.0
blizz_sms_sent_total{application="blizz-taxi-server",purpose="OTP",state="FAILED"} 1.0
blizz_sms_sent_total{application="blizz-taxi-server",purpose="OTP",state="SENT"} 87.0
```

Done: real no-car deadline, non-zero counters/timers and bounded labels on the management port.

`GET /api/rider/v1/orders/3bbe1269-247b-404e-8010-34a3693a8398` → **200**

```json
{
  "id": "3bbe1269-247b-404e-8010-34a3693a8398",
  "short_number": 39,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "a3168c8a-0cd8-4faa-bf85-aaa450fe1307",
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
  "created_at": "2026-10-30T23:17:16.388549Z",
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
  "session_id": "925ca7cd-648c-4eb5-99dc-a1a0a5221e9c",
  "subject": {
    "type": "STAFF",
    "id": "c66269c2-93bc-421d-8af2-6f0cafc54be4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjYyNjljMi05M2JjLTQyMWQtOGFmMi02ZjBjYWZjNTRiZTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDMzMTksImlhdCI6MTc5MzQwMjQxOSwianRpIjoiNzcyZTM4NjYtODhjZS00YTU3LTllNzctODMyOGMyYmRmYzQyIiwic2lkIjoiOTI1Y2E3Y2QtNjQ4Yy00ZWI1LTk5ZGMtYTFhMGE1MjIxZTljIn0.0FEGW9DyeUVMu5qZSZQzJA_qx7QhlBGk404_5vifeLE",
  "access_expires_at": "2026-10-30T23:35:19.769646954Z",
  "refresh_token": "e5EUHYWwIuuJ8qfpvxNR4m0q8Q8HZlDP29Byviirv5Q",
  "refresh_expires_at": "2026-10-31T11:20:19.769171958Z",
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
  "id": "c5aa79dc-77c1-4c50-871d-2209462eb856",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T23:20:19.97534Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T23:20:19.975396Z",
  "updated_at": "2026-10-30T23:20:19.987297Z",
  "finished_at": "2026-10-30T23:20:19.987297Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/c5aa79dc-77c1-4c50-871d-2209462eb856` → **200**

```json
{
  "run": {
    "id": "c5aa79dc-77c1-4c50-871d-2209462eb856",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T23:20:19.97534Z",
    "partial": true,
    "state": "CLEAN",
    "local_count": 10,
    "provider_count": 10,
    "item_count": 0,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T23:20:19.975396Z",
    "updated_at": "2026-10-30T23:20:19.987297Z",
    "finished_at": "2026-10-30T23:20:19.987297Z",
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
  "id": "c5aa79dc-77c1-4c50-871d-2209462eb856",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T23:20:19.97534Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T23:20:19.975396Z",
  "updated_at": "2026-10-30T23:20:19.987297Z",
  "finished_at": "2026-10-30T23:20:19.987297Z",
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
  "id": "c5aa79dc-77c1-4c50-871d-2209462eb856",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T23:20:19.97534Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T23:20:19.975396Z",
  "updated_at": "2026-10-30T23:20:19.987297Z",
  "finished_at": "2026-10-30T23:20:19.987297Z",
  "version": 1
}
```

## One independent bank transaction produces one missing-local item on another merchant's first snapshot

`POST /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/673cf49b-b1e6-4ca1-baf7-27fd2aebbafe` → **204**

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
  "id": "a834a0b9-0144-40fe-83cb-7ff01ef4f146",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T23:20:20.315307Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T23:20:20.315352Z",
  "updated_at": "2026-10-30T23:20:20.321105Z",
  "finished_at": "2026-10-30T23:20:20.321105Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/a834a0b9-0144-40fe-83cb-7ff01ef4f146` → **200**

```json
{
  "run": {
    "id": "a834a0b9-0144-40fe-83cb-7ff01ef4f146",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T23:20:20.315307Z",
    "partial": true,
    "state": "OPEN",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 1,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T23:20:20.315352Z",
    "updated_at": "2026-10-30T23:20:20.321105Z",
    "finished_at": "2026-10-30T23:20:20.321105Z",
    "version": 1
  },
  "items": [
    {
      "id": "61de936e-2fdf-4ae0-837c-5381a95e7011",
      "run_id": "a834a0b9-0144-40fe-83cb-7ff01ef4f146",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "55e8ff584fa1a93d0c009cf79c034c331daddf3e73fd0cb914170723fcdd2bb5",
      "reference_display": "sandbox-reconciliation-673cf49b-b1e6-4ca1-baf7-27fd2aebbafe",
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
      "provider_at": "2026-10-30T23:20:20Z",
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
  "id": "a834a0b9-0144-40fe-83cb-7ff01ef4f146",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T23:20:20.315307Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T23:20:20.315352Z",
  "updated_at": "2026-10-30T23:20:20.321105Z",
  "finished_at": "2026-10-30T23:20:20.321105Z",
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
  "id": "a834a0b9-0144-40fe-83cb-7ff01ef4f146",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T23:20:20.315307Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T23:20:20.315352Z",
  "updated_at": "2026-10-30T23:20:20.321105Z",
  "finished_at": "2026-10-30T23:20:20.321105Z",
  "version": 1
}
```

## The admin explains the item once; a replay is the same result and a different decision conflicts

`POST /api/admin/v1/payment-reconciliations/items/61de936e-2fdf-4ae0-837c-5381a95e7011/resolve` → **200**

```json
{
  "command_id": "c8cb60ed-d2a9-4a04-87a6-13d73a3db94c",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "61de936e-2fdf-4ae0-837c-5381a95e7011",
  "run_id": "a834a0b9-0144-40fe-83cb-7ff01ef4f146",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "55e8ff584fa1a93d0c009cf79c034c331daddf3e73fd0cb914170723fcdd2bb5",
  "reference_display": "sandbox-reconciliation-673cf49b-b1e6-4ca1-baf7-27fd2aebbafe",
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
  "provider_at": "2026-10-30T23:20:20Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "c66269c2-93bc-421d-8af2-6f0cafc54be4",
  "resolved_at": "2026-10-30T23:20:20.634515Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/61de936e-2fdf-4ae0-837c-5381a95e7011/resolve` → **200**

```json
{
  "command_id": "c8cb60ed-d2a9-4a04-87a6-13d73a3db94c",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "61de936e-2fdf-4ae0-837c-5381a95e7011",
  "run_id": "a834a0b9-0144-40fe-83cb-7ff01ef4f146",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "55e8ff584fa1a93d0c009cf79c034c331daddf3e73fd0cb914170723fcdd2bb5",
  "reference_display": "sandbox-reconciliation-673cf49b-b1e6-4ca1-baf7-27fd2aebbafe",
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
  "provider_at": "2026-10-30T23:20:20Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "c66269c2-93bc-421d-8af2-6f0cafc54be4",
  "resolved_at": "2026-10-30T23:20:20.634515Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/61de936e-2fdf-4ae0-837c-5381a95e7011/resolve` → **409**

```json
{
  "command_id": "6e1bff70-fe60-4c20-9b55-7fb751632f96",
  "expected_version": 1,
  "decision": "ESCALATED",
  "reason": "A conflicting second decision"
}
```

```json
{
  "instance": "/api/admin/v1/payment-reconciliations/items/61de936e-2fdf-4ae0-837c-5381a95e7011/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "b6d796d8-5bc5-4b3b-acd3-112d14cf305c"
}
```

`GET /api/admin/v1/payment-reconciliations/a834a0b9-0144-40fe-83cb-7ff01ef4f146` → **200**

```json
{
  "run": {
    "id": "a834a0b9-0144-40fe-83cb-7ff01ef4f146",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T23:20:20.315307Z",
    "partial": true,
    "state": "RESOLVED",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T23:20:20.315352Z",
    "updated_at": "2026-10-30T23:20:20.634515Z",
    "finished_at": "2026-10-30T23:20:20.321105Z",
    "version": 2
  },
  "items": [
    {
      "id": "61de936e-2fdf-4ae0-837c-5381a95e7011",
      "run_id": "a834a0b9-0144-40fe-83cb-7ff01ef4f146",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "55e8ff584fa1a93d0c009cf79c034c331daddf3e73fd0cb914170723fcdd2bb5",
      "reference_display": "sandbox-reconciliation-673cf49b-b1e6-4ca1-baf7-27fd2aebbafe",
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
      "provider_at": "2026-10-30T23:20:20Z",
      "state": "RESOLVED",
      "decision": "EXPLAINED",
      "reason": "Independent sandbox bank fixture; no real money moved",
      "resolved_by": "c66269c2-93bc-421d-8af2-6f0cafc54be4",
      "resolved_at": "2026-10-30T23:20:20.634515Z",
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
      "id": "a834a0b9-0144-40fe-83cb-7ff01ef4f146",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-30",
      "period_from": "2026-10-29T22:00:00Z",
      "period_to": "2026-10-31T02:00:00Z",
      "observed_until": "2026-10-30T23:20:20.315307Z",
      "partial": true,
      "state": "RESOLVED",
      "local_count": 0,
      "provider_count": 1,
      "item_count": 1,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-30T23:20:20.315352Z",
      "updated_at": "2026-10-30T23:20:20.634515Z",
      "finished_at": "2026-10-30T23:20:20.321105Z",
      "version": 2
    },
    {
      "id": "93b0d1b2-6ed9-4cd7-81ab-95f7b1531810",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-29",
      "period_from": "2026-10-28T22:00:00Z",
      "period_to": "2026-10-30T02:00:00Z",
      "observed_until": "2026-10-30T22:58:07.291305Z",
      "partial": false,
      "state": "CLEAN",
      "local_count": 0,
      "provider_count": 0,
      "item_count": 0,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-30T22:58:07.291356Z",
      "updated_at": "2026-10-30T22:58:07.295495Z",
      "finished_at": "2026-10-30T22:58:07.295495Z",
      "version": 1
    }
  ],
  "next_cursor": null
}
```

`DELETE /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/673cf49b-b1e6-4ca1-baf7-27fd2aebbafe` → **204**

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30"
}
```

```json
{
  "id": "a834a0b9-0144-40fe-83cb-7ff01ef4f146",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T23:20:20.315307Z",
  "partial": true,
  "state": "RESOLVED",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T23:20:20.315352Z",
  "updated_at": "2026-10-30T23:20:20.634515Z",
  "finished_at": "2026-10-30T23:20:20.321105Z",
  "version": 2
}
```

Done: clean card snapshot, one bank-only difference, three identical runs, audited decision/replay/conflict, bank fixture restored.

# Scenario: zzz-invariants

## Five invariant checks are clean after all scenario transactions settle

```prometheus
blizz_invariant_last_success{application="blizz-taxi-server",check="I1"} 1.793402542646E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I2"} 1.79340254297E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I3"} 1.793402542971E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I4"} 1.793402542694E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I5"} 1.793402542971E9
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
  "phone": "+380686238435",
  "device_ref": "sandbox-22547"
}
```

```json
{
  "challenge_id": "577e0975-8031-49ef-bb9b-870166b5a8eb",
  "expires_at": "2026-10-30T23:27:23.307426401Z",
  "resend_available_at": "2026-10-30T23:22:24.307426401Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380686238435` → **200**

```json
{
  "phone": "+380686238435",
  "audience": "CLIENT",
  "code": "055286",
  "sent_at": "2026-10-30T23:22:23.309431294Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "577e0975-8031-49ef-bb9b-870166b5a8eb",
  "code": "055286",
  "device_ref": "sandbox-22547"
}
```

```json
{
  "session_id": "1bfb542b-3f27-45ef-a81a-6225a6d5ecfe",
  "subject": {
    "type": "CLIENT",
    "id": "a17dec39-2703-4501-8a66-654d3907440f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMTdkZWMzOS0yNzAzLTQ1MDEtOGE2Ni02NTRkMzkwNzQ0MGYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDAzNDQzLCJpYXQiOjE3OTM0MDI1NDMsImp0aSI6ImZjNDQ4Y2Y2LTYyMTEtNDBkYi1iNjc4LTE1NTA0NGUwN2I1YSIsInNpZCI6IjFiZmI1NDJiLTNmMjctNDVlZi1hODFhLTYyMjVhNmQ1ZWNmZSJ9.efOsbMo_RJIKNCdYKcxFKcMNEDbfd6-QAMYfya8MpF8",
  "access_expires_at": "2026-10-30T23:37:23.52677505Z",
  "refresh_token": "Wo-q8h36FjcKiTvTLWdYf_frDNoVAQU30NSr7PB8ZTo",
  "refresh_expires_at": "2026-11-29T23:22:23.526276863Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "a17dec39-2703-4501-8a66-654d3907440f",
  "session_id": "1bfb542b-3f27-45ef-a81a-6225a6d5ecfe",
  "account_state": "ACTIVE"
}
```

## Back up the database (deploy/backup.sh)
Backed up blizz to blizz.dump (572K)

## After the backup the rider deletes the account and staff complete it

`POST /api/rider/v1/me/deletion-request/challenge` → **201**

```json
{
  "challenge_id": "50517847-e049-4d6b-b99a-529448b68495",
  "expires_at": "2026-10-30T23:27:26.426115854Z",
  "resend_available_at": "2026-10-30T23:22:27.426115854Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380686238435` → **200**

```json
{
  "phone": "+380686238435",
  "audience": "CLIENT",
  "code": "817339",
  "sent_at": "2026-10-30T23:22:26.427807004Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "a767a31e-b44c-45cd-94fa-caaea7ab7aa5",
  "challenge_id": "50517847-e049-4d6b-b99a-529448b68495",
  "otp_code": "817339"
}
```

```json
{
  "client_id": "a17dec39-2703-4501-8a66-654d3907440f",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-30T23:22:26.640967632Z"
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
  "session_id": "38ff80a9-e591-480d-96d9-fbc666e3a3ed",
  "subject": {
    "type": "STAFF",
    "id": "c66269c2-93bc-421d-8af2-6f0cafc54be4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjYyNjljMi05M2JjLTQyMWQtOGFmMi02ZjBjYWZjNTRiZTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDM0NDcsImlhdCI6MTc5MzQwMjU0NywianRpIjoiMDM3MzNlODMtZTk4MS00MjViLWFhZTUtYWU5ZjNhMWE0MmYyIiwic2lkIjoiMzhmZjgwYTktZTU5MS00ODBkLTk2ZDktZmJjNjY2ZTNhM2VkIn0.vRPKljGyEs3zBDnMbzcc8cYJ9FqD6d7uPRIb7BIqCCI",
  "access_expires_at": "2026-10-30T23:37:27.026927162Z",
  "refresh_token": "v87YTVL19sznKIqVS347n7JBnmbZ9AXT_ObnHi2pSxE",
  "refresh_expires_at": "2026-10-31T11:22:27.026454263Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/client-deletions/a17dec39-2703-4501-8a66-654d3907440f/complete` → **200**

```json
{
  "command_id": "b1a3b2a3-78f1-45fb-b912-44c1b1383fb2",
  "reason": "Sandbox: backup and restore check"
}
```

```json
{
  "client_id": "a17dec39-2703-4501-8a66-654d3907440f",
  "account_state": "ANONYMIZED"
}
```

## Restore into an empty database (deploy/restore.sh); over data it refuses
Restored blizz.dump into blizz_restored: 103 migrations applied. Start the server on it with the same ERASURE_JOURNAL_DIR.
Database blizz_restored is not empty (113 tables): restore only into an empty database

In the restored database before the server starts: `ACTIVE +380686238435` (the backup predates the deletion).

## Start the server on the restored database with the same journal: the deletion is applied again

After the start: `ANONYMIZED -`.

Done: backup, restore into an empty database, start on it; the deleted rider stayed deleted (T-39).
