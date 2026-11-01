# Sandbox transcript (2026-11-01T22:41:05Z, fe90ce5)

# Scenario: first-city

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
  "correlation_id": "98dc8768-8525-42bf-889a-45902ba57cb5"
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
  "session_id": "ae4a9b95-5aec-4107-b902-56e4ce871bd7",
  "subject": {
    "type": "STAFF",
    "id": "be4860ca-23a3-4424-96fe-338c557b95c5"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiZTQ4NjBjYS0yM2EzLTQ0MjQtOTZmZS0zMzhjNTU3Yjk1YzUiLCJhdWQiOiJhZG1pbiIsInN2YyI6IjVlMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDAwMSIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM1NzM3NzQsImlhdCI6MTc5MzU3Mjg3NCwianRpIjoiZDYwOWZiMWQtZDA0ZS00NTdkLTkxODctYWRlMDgxOWUxZWYwIiwic2lkIjoiYWU0YTliOTUtNWFlYy00MTA3LWI5MDItNTZlNGNlODcxYmQ3In0.Jbz0bCtOdWeAw56pUKQ8rQFgnnvQI4XJV5irkMooDdA",
  "access_expires_at": "2026-11-01T22:56:14.330003414Z",
  "refresh_token": "eIlz3YxY2RQhw_kNi_xItwMRCIWiYJErZiBmAUGVxcA",
  "refresh_expires_at": "2026-11-02T10:41:14.328006225Z",
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
  "session_id": "48aa15ed-bffc-44b7-99b7-e43c18e813e6",
  "subject": {
    "type": "STAFF",
    "id": "be4860ca-23a3-4424-96fe-338c557b95c5"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiZTQ4NjBjYS0yM2EzLTQ0MjQtOTZmZS0zMzhjNTU3Yjk1YzUiLCJhdWQiOiJhZG1pbiIsInN2YyI6IjVlMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDAwMSIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM1NzM3NzUsImlhdCI6MTc5MzU3Mjg3NSwianRpIjoiNzI4NmQyYzAtNzdmMS00MWVjLWExNWQtMWZiNDg4M2E5ZjI5Iiwic2lkIjoiNDhhYTE1ZWQtYmZmYy00NGI3LTk5YjctZTQzYzE4ZTgxM2U2In0.syRK60oojGrGc_4K0e0TZwRwzrCF2weWe3EmMTaSB48",
  "access_expires_at": "2026-11-01T22:56:15.947134508Z",
  "refresh_token": "-m8JdO8pdAkcesE0rmduTLX_BONGpa-Ff04FFlErCh4",
  "refresh_expires_at": "2026-11-02T10:41:15.946235421Z",
  "password_change_required": false
}
```

## The admin creates a new city in the Southern Ocean and publishes it

`POST /api/admin/v1/cities` → **201**

```json
{
  "command_id": "71df9e21-9bf6-4420-8577-ff7a7c689cbd",
  "code": "sandbox-first-141-9486",
  "name": "Sandbox first city",
  "currency": "UAH",
  "timezone": "Europe/Kyiv",
  "polygon": {
    "type": "MultiPolygon",
    "coordinates": [
      [
        [
          [
            141,
            -61
          ],
          [
            142,
            -61
          ],
          [
            142,
            -60
          ],
          [
            141,
            -60
          ],
          [
            141,
            -61
          ]
        ]
      ]
    ]
  },
  "priority": 0,
  "reason": "Sandbox: the first city (AC-01)"
}
```

```json
{
  "id": "d24a7656-60d5-4b2d-b48e-ed9e13ecc6be",
  "state": "DRAFT",
  "version": 0
}
```

`POST /api/admin/v1/cities/d24a7656-60d5-4b2d-b48e-ed9e13ecc6be/publish` → **200**

```json
{
  "command_id": "bbd7967b-f3da-4bf1-88e7-49cce18e0142",
  "expected_version": 0,
  "reason": "Sandbox: open"
}
```

```json
{
  "id": "d24a7656-60d5-4b2d-b48e-ed9e13ecc6be",
  "state": "PUBLISHED",
  "version": 1
}
```

`GET /api/admin/v1/cities/d24a7656-60d5-4b2d-b48e-ed9e13ecc6be/operations` → **200**

```json
{
  "city_id": "d24a7656-60d5-4b2d-b48e-ed9e13ecc6be",
  "working_hours": [],
  "payment_methods": [
    "CARD",
    "CASH",
    "TERMINAL"
  ],
  "return_zone_meters": 0,
  "dropoff_outside_city": {
    "allowed": true,
    "max_distance_km": null
  },
  "orders_paused": false,
  "pause_reason": null,
  "paused_at": null,
  "version": 0
}
```

`POST /api/admin/v1/cities/d24a7656-60d5-4b2d-b48e-ed9e13ecc6be/operations` → **200**

```json
{
  "command_id": "2da23d8e-6b88-4d47-8281-23ed408cd2c5",
  "expected_version": 0,
  "working_hours": [],
  "payment_methods": [
    "CASH",
    "TERMINAL"
  ],
  "reason": "Sandbox: open around the clock, cash and terminal"
}
```

```json
{
  "city_id": "d24a7656-60d5-4b2d-b48e-ed9e13ecc6be",
  "working_hours": [],
  "payment_methods": [
    "CASH",
    "TERMINAL"
  ],
  "return_zone_meters": 0,
  "dropoff_outside_city": {
    "allowed": true,
    "max_distance_km": null
  },
  "orders_paused": false,
  "pause_reason": null,
  "paused_at": null,
  "version": 1
}
```

## The class and the tariff: the only step in SQL, as the tariffs admin API waits for #30

Inserted one vehicle class STANDARD and one published tariff for city `d24a7656-60d5-4b2d-b48e-ed9e13ecc6be` (#30).

## A new driver signs in, adds a car and the documents, and asks for the check

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380502196290",
  "device_ref": "sandbox-9370"
}
```

```json
{
  "challenge_id": "b4d78971-cc6b-4d8b-93be-4ade2c88afb5",
  "expires_at": "2026-11-01T22:46:18.325180107Z",
  "resend_available_at": "2026-11-01T22:41:19.325180107Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380502196290` → **200**

```json
{
  "phone": "+380502196290",
  "audience": "DRIVER",
  "code": "723771",
  "sent_at": "2026-11-01T22:41:18.334667014Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b4d78971-cc6b-4d8b-93be-4ade2c88afb5",
  "code": "723771",
  "device_ref": "sandbox-9370"
}
```

```json
{
  "session_id": "f005ac8a-5ae6-487e-b9b3-6aa40e79a761",
  "subject": {
    "type": "DRIVER",
    "id": "ca779563-4a9e-4370-9710-e2d50005ed10"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjYTc3OTU2My00YTllLTQzNzAtOTcxMC1lMmQ1MDAwNWVkMTAiLCJhdWQiOiJkcml2ZXIiLCJzdmMiOiI1ZTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwMDEiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzU3Mzc3OCwiaWF0IjoxNzkzNTcyODc4LCJqdGkiOiJjNTEzY2RjMC02Yzc5LTQzM2QtYTZhMy1iNDlkM2U0ZmY5YzUiLCJzaWQiOiJmMDA1YWM4YS01YWU2LTQ4N2UtYjliMy02YWE0MGU3OWE3NjEifQ.GGCtYwPlr9pJz07ZfvZ8ciChoRtXZiAX9wDdefheHtE",
  "access_expires_at": "2026-11-01T22:56:18.625739583Z",
  "refresh_token": "ICb5iFwIWzBLdZxjcHZrtSIsVCo20Qb4DzezvtRQYtY",
  "refresh_expires_at": "2026-12-01T22:41:18.624931189Z",
  "account_created": true
}
```

`PATCH /api/driver/v1/profile` → **200**

```json
{
  "command_id": "c86e184f-886d-4506-b014-9eacf1e480ef",
  "name": "Taras (sandbox)",
  "language": "uk"
}
```

```json
{
  "id": "ca779563-4a9e-4370-9710-e2d50005ed10",
  "account_state": "ACTIVE",
  "name": "Taras (sandbox)",
  "language": "uk",
  "review_status": "NOT_SUBMITTED",
  "version": 1,
  "has_payment_terminal": false,
  "admission_city_ids": [],
  "vehicles": [],
  "documents": []
}
```

`POST /api/driver/v1/vehicles` → **201**

```json
{
  "command_id": "31de9b55-1573-41d0-8ff0-e6aa4af39307",
  "registration_number": "AA4751AA",
  "make": "Skoda",
  "model": "Octavia",
  "color": "white",
  "production_year": 2021
}
```

```json
{
  "id": "670fb1e2-ab54-49e1-9f5c-5d6c261f6003"
}
```

`POST /api/driver/v1/documents/upload-sessions` → **201**

```json
{
  "command_id": "a6ee917c-9824-40a1-8bae-7087c2cf44bd",
  "content_type": "application/pdf",
  "size_bytes": 81
}
```

```json
{
  "file_id": "f00d0b14-46d0-443a-9503-bd382484e8f4",
  "upload_path": "/api/driver/v1/uploads/f00d0b14-46d0-443a-9503-bd382484e8f4",
  "expires_at": "2026-11-01T22:56:19.431846025Z",
  "max_bytes": 81
}
```

`POST /api/driver/v1/documents` → **201**

```json
{
  "command_id": "f1c80390-00a6-4be5-a0d6-7d0ffab08c05",
  "type": "DRIVER_LICENSE",
  "file_id": "f00d0b14-46d0-443a-9503-bd382484e8f4",
  "number": "SANDBOX-DRIVER_LICENSE-8756",
  "valid_from": "2025-11-01",
  "valid_to": "2027-11-01"
}
```

```json
{
  "id": "35d9bdda-c34c-4068-937c-585e3c2fea6a"
}
```

`POST /api/driver/v1/documents/upload-sessions` → **201**

```json
{
  "command_id": "fe8ee394-c333-4b83-abac-a3db110e7299",
  "content_type": "application/pdf",
  "size_bytes": 87
}
```

```json
{
  "file_id": "9f1b95c1-a031-4d2b-8f51-21332bdbcce6",
  "upload_path": "/api/driver/v1/uploads/9f1b95c1-a031-4d2b-8f51-21332bdbcce6",
  "expires_at": "2026-11-01T22:56:20.026766514Z",
  "max_bytes": 87
}
```

`POST /api/driver/v1/documents` → **201**

```json
{
  "command_id": "d4b2b230-07a3-4f28-b81b-65daeef33ac0",
  "type": "VEHICLE_REGISTRATION",
  "file_id": "9f1b95c1-a031-4d2b-8f51-21332bdbcce6",
  "vehicle_id": "670fb1e2-ab54-49e1-9f5c-5d6c261f6003",
  "number": "SANDBOX-VEHICLE_REGISTRATION-12926",
  "valid_from": "2025-11-01",
  "valid_to": "2027-11-01"
}
```

```json
{
  "id": "a2650290-1008-48fb-8e13-7481e37f0c8a"
}
```

`POST /api/driver/v1/documents/upload-sessions` → **201**

```json
{
  "command_id": "ae053a5d-c7bf-4bd9-b705-e9a49e0a9f8a",
  "content_type": "application/pdf",
  "size_bytes": 76
}
```

```json
{
  "file_id": "dcf38e6f-3d1f-45a2-b107-95cd514e28b9",
  "upload_path": "/api/driver/v1/uploads/dcf38e6f-3d1f-45a2-b107-95cd514e28b9",
  "expires_at": "2026-11-01T22:56:20.562918468Z",
  "max_bytes": 76
}
```

`POST /api/driver/v1/documents` → **201**

```json
{
  "command_id": "e157e76c-476d-4c4f-8fca-89506eefc857",
  "type": "INSURANCE",
  "file_id": "dcf38e6f-3d1f-45a2-b107-95cd514e28b9",
  "vehicle_id": "670fb1e2-ab54-49e1-9f5c-5d6c261f6003",
  "number": "SANDBOX-INSURANCE-29812",
  "valid_from": "2025-11-01",
  "valid_to": "2027-11-01"
}
```

```json
{
  "id": "41a7e6d3-61e8-4c17-931f-f0299459308a"
}
```

`GET /api/driver/v1/profile` → **200**

```json
{
  "id": "ca779563-4a9e-4370-9710-e2d50005ed10",
  "account_state": "ACTIVE",
  "name": "Taras (sandbox)",
  "language": "uk",
  "review_status": "NOT_SUBMITTED",
  "version": 1,
  "has_payment_terminal": false,
  "admission_city_ids": [],
  "vehicles": [
    {
      "id": "670fb1e2-ab54-49e1-9f5c-5d6c261f6003",
      "registration_number": "AA4751AA",
      "make": "Skoda",
      "model": "Octavia",
      "color": "white",
      "production_year": 2021,
      "state": "DRAFT",
      "class_approvals": []
    }
  ],
  "documents": [
    {
      "id": "35d9bdda-c34c-4068-937c-585e3c2fea6a",
      "type": "DRIVER_LICENSE",
      "vehicle_id": null,
      "file_id": "f00d0b14-46d0-443a-9503-bd382484e8f4",
      "number": "SANDBOX-DRIVER_LICENSE-8756",
      "valid_from": "2025-11-01",
      "valid_to": "2027-11-01",
      "decision": "PENDING",
      "decision_reason": null
    },
    {
      "id": "41a7e6d3-61e8-4c17-931f-f0299459308a",
      "type": "INSURANCE",
      "vehicle_id": "670fb1e2-ab54-49e1-9f5c-5d6c261f6003",
      "file_id": "dcf38e6f-3d1f-45a2-b107-95cd514e28b9",
      "number": "SANDBOX-INSURANCE-29812",
      "valid_from": "2025-11-01",
      "valid_to": "2027-11-01",
      "decision": "PENDING",
      "decision_reason": null
    },
    {
      "id": "a2650290-1008-48fb-8e13-7481e37f0c8a",
      "type": "VEHICLE_REGISTRATION",
      "vehicle_id": "670fb1e2-ab54-49e1-9f5c-5d6c261f6003",
      "file_id": "9f1b95c1-a031-4d2b-8f51-21332bdbcce6",
      "number": "SANDBOX-VEHICLE_REGISTRATION-12926",
      "valid_from": "2025-11-01",
      "valid_to": "2027-11-01",
      "decision": "PENDING",
      "decision_reason": null
    }
  ]
}
```

Review status before the check: `NOT_SUBMITTED`.

`POST /api/driver/v1/verification/submit` → **200**

```json
{
  "command_id": "8a26fbee-3bd1-481e-956c-888991a6390d",
  "expected_version": 1
}
```

```json
{
  "id": "ca779563-4a9e-4370-9710-e2d50005ed10",
  "account_state": "ACTIVE",
  "name": "Taras (sandbox)",
  "language": "uk",
  "review_status": "IN_REVIEW",
  "version": 2,
  "has_payment_terminal": false,
  "admission_city_ids": [],
  "vehicles": [
    {
      "id": "670fb1e2-ab54-49e1-9f5c-5d6c261f6003",
      "registration_number": "AA4751AA",
      "make": "Skoda",
      "model": "Octavia",
      "color": "white",
      "production_year": 2021,
      "state": "IN_REVIEW",
      "class_approvals": []
    }
  ],
  "documents": [
    {
      "id": "35d9bdda-c34c-4068-937c-585e3c2fea6a",
      "type": "DRIVER_LICENSE",
      "vehicle_id": null,
      "file_id": "f00d0b14-46d0-443a-9503-bd382484e8f4",
      "number": "SANDBOX-DRIVER_LICENSE-8756",
      "valid_from": "2025-11-01",
      "valid_to": "2027-11-01",
      "decision": "PENDING",
      "decision_reason": null
    },
    {
      "id": "41a7e6d3-61e8-4c17-931f-f0299459308a",
      "type": "INSURANCE",
      "vehicle_id": "670fb1e2-ab54-49e1-9f5c-5d6c261f6003",
      "file_id": "dcf38e6f-3d1f-45a2-b107-95cd514e28b9",
      "number": "SANDBOX-INSURANCE-29812",
      "valid_from": "2025-11-01",
      "valid_to": "2027-11-01",
      "decision": "PENDING",
      "decision_reason": null
    },
    {
      "id": "a2650290-1008-48fb-8e13-7481e37f0c8a",
      "type": "VEHICLE_REGISTRATION",
      "vehicle_id": "670fb1e2-ab54-49e1-9f5c-5d6c261f6003",
      "file_id": "9f1b95c1-a031-4d2b-8f51-21332bdbcce6",
      "number": "SANDBOX-VEHICLE_REGISTRATION-12926",
      "valid_from": "2025-11-01",
      "valid_to": "2027-11-01",
      "decision": "PENDING",
      "decision_reason": null
    }
  ]
}
```

After submitting: `IN_REVIEW`.

## The admin approves the driver for STANDARD and admits him to the new city

`POST /api/admin/v1/drivers/ca779563-4a9e-4370-9710-e2d50005ed10/decision` → **200**

```json
{
  "command_id": "9ce7449e-6682-4ec2-a534-3a414d5819f1",
  "expected_version": 2,
  "decision": "APPROVE",
  "reason": "Documents valid",
  "vehicle_classes": [
    "STANDARD"
  ]
}
```

```json
{
  "id": "ca779563-4a9e-4370-9710-e2d50005ed10",
  "account_state": "ACTIVE",
  "name": "Taras (sandbox)",
  "language": "uk",
  "review_status": "APPROVED",
  "version": 3,
  "has_payment_terminal": false,
  "admission_city_ids": [],
  "vehicles": [
    {
      "id": "670fb1e2-ab54-49e1-9f5c-5d6c261f6003",
      "registration_number": "AA4751AA",
      "make": "Skoda",
      "model": "Octavia",
      "color": "white",
      "production_year": 2021,
      "state": "APPROVED",
      "class_approvals": [
        "STANDARD"
      ]
    }
  ],
  "documents": [
    {
      "id": "35d9bdda-c34c-4068-937c-585e3c2fea6a",
      "type": "DRIVER_LICENSE",
      "vehicle_id": null,
      "file_id": "f00d0b14-46d0-443a-9503-bd382484e8f4",
      "number": "SANDBOX-DRIVER_LICENSE-8756",
      "valid_from": "2025-11-01",
      "valid_to": "2027-11-01",
      "decision": "ACCEPTED",
      "decision_reason": null
    },
    {
      "id": "41a7e6d3-61e8-4c17-931f-f0299459308a",
      "type": "INSURANCE",
      "vehicle_id": "670fb1e2-ab54-49e1-9f5c-5d6c261f6003",
      "file_id": "dcf38e6f-3d1f-45a2-b107-95cd514e28b9",
      "number": "SANDBOX-INSURANCE-29812",
      "valid_from": "2025-11-01",
      "valid_to": "2027-11-01",
      "decision": "ACCEPTED",
      "decision_reason": null
    },
    {
      "id": "a2650290-1008-48fb-8e13-7481e37f0c8a",
      "type": "VEHICLE_REGISTRATION",
      "vehicle_id": "670fb1e2-ab54-49e1-9f5c-5d6c261f6003",
      "file_id": "9f1b95c1-a031-4d2b-8f51-21332bdbcce6",
      "number": "SANDBOX-VEHICLE_REGISTRATION-12926",
      "valid_from": "2025-11-01",
      "valid_to": "2027-11-01",
      "decision": "ACCEPTED",
      "decision_reason": null
    }
  ]
}
```

After the decision: `APPROVED`.

`PUT /api/admin/v1/drivers/ca779563-4a9e-4370-9710-e2d50005ed10/admission-cities` → **200**

```json
{
  "command_id": "c0c06298-c19c-46ee-a062-529014c71c28",
  "expected_version": 3,
  "city_ids": [
    "d24a7656-60d5-4b2d-b48e-ed9e13ecc6be"
  ],
  "reason": "Sandbox: the new city"
}
```

```json
{
  "id": "ca779563-4a9e-4370-9710-e2d50005ed10",
  "account_state": "ACTIVE",
  "name": "Taras (sandbox)",
  "language": "uk",
  "review_status": "APPROVED",
  "version": 4,
  "has_payment_terminal": false,
  "admission_city_ids": [
    "d24a7656-60d5-4b2d-b48e-ed9e13ecc6be"
  ],
  "vehicles": [
    {
      "id": "670fb1e2-ab54-49e1-9f5c-5d6c261f6003",
      "registration_number": "AA4751AA",
      "make": "Skoda",
      "model": "Octavia",
      "color": "white",
      "production_year": 2021,
      "state": "APPROVED",
      "class_approvals": [
        "STANDARD"
      ]
    }
  ],
  "documents": [
    {
      "id": "35d9bdda-c34c-4068-937c-585e3c2fea6a",
      "type": "DRIVER_LICENSE",
      "vehicle_id": null,
      "file_id": "f00d0b14-46d0-443a-9503-bd382484e8f4",
      "number": "SANDBOX-DRIVER_LICENSE-8756",
      "valid_from": "2025-11-01",
      "valid_to": "2027-11-01",
      "decision": "ACCEPTED",
      "decision_reason": null
    },
    {
      "id": "41a7e6d3-61e8-4c17-931f-f0299459308a",
      "type": "INSURANCE",
      "vehicle_id": "670fb1e2-ab54-49e1-9f5c-5d6c261f6003",
      "file_id": "dcf38e6f-3d1f-45a2-b107-95cd514e28b9",
      "number": "SANDBOX-INSURANCE-29812",
      "valid_from": "2025-11-01",
      "valid_to": "2027-11-01",
      "decision": "ACCEPTED",
      "decision_reason": null
    },
    {
      "id": "a2650290-1008-48fb-8e13-7481e37f0c8a",
      "type": "VEHICLE_REGISTRATION",
      "vehicle_id": "670fb1e2-ab54-49e1-9f5c-5d6c261f6003",
      "file_id": "9f1b95c1-a031-4d2b-8f51-21332bdbcce6",
      "number": "SANDBOX-VEHICLE_REGISTRATION-12926",
      "valid_from": "2025-11-01",
      "valid_to": "2027-11-01",
      "decision": "ACCEPTED",
      "decision_reason": null
    }
  ]
}
```

## The driver goes online in the new city

`POST /api/driver/v1/work-sessions` → **201**

```json
{
  "command_id": "bc044ddf-83d3-4d8d-b404-4e6b73e15e95",
  "vehicle_id": "670fb1e2-ab54-49e1-9f5c-5d6c261f6003",
  "location": {
    "lat": -60.49,
    "lon": 141.5,
    "accuracy_m": 5,
    "recorded_at": "2026-11-01T22:41:22Z",
    "sequence": 1793572882190
  }
}
```

```json
{
  "driver_id": "ca779563-4a9e-4370-9710-e2d50005ed10",
  "session_id": "bfb6c110-92c3-4551-aa6f-984a296a2448",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "d24a7656-60d5-4b2d-b48e-ed9e13ecc6be",
  "vehicle_id": "670fb1e2-ab54-49e1-9f5c-5d6c261f6003",
  "last_heartbeat_at": "2026-11-01T22:41:22.229567Z",
  "last_location_at": "2026-11-01T22:41:22.229567Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A rider orders in the app (cash) and the new driver drives it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679492241",
  "device_ref": "sandbox-28729"
}
```

```json
{
  "challenge_id": "4b988aa6-d3a2-41af-bed0-f63300ec02a0",
  "expires_at": "2026-11-01T22:46:22.492883728Z",
  "resend_available_at": "2026-11-01T22:41:23.492883728Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380679492241` → **200**

```json
{
  "phone": "+380679492241",
  "audience": "CLIENT",
  "code": "798174",
  "sent_at": "2026-11-01T22:41:22.497043125Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4b988aa6-d3a2-41af-bed0-f63300ec02a0",
  "code": "798174",
  "device_ref": "sandbox-28729"
}
```

```json
{
  "session_id": "93156d4e-72ad-498d-bb76-b26e499cd09b",
  "subject": {
    "type": "CLIENT",
    "id": "d5efdff3-ac06-42da-9a28-844257e393f6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNWVmZGZmMy1hYzA2LTQyZGEtOWEyOC04NDQyNTdlMzkzZjYiLCJhdWQiOiJyaWRlciIsInN2YyI6IjVlMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDAwMSIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNTczNzgyLCJpYXQiOjE3OTM1NzI4ODIsImp0aSI6IjViZGMwYjg4LWM2M2MtNDJkZC1iZGI5LTJlN2MyMmYxZmQ5MiIsInNpZCI6IjkzMTU2ZDRlLTcyYWQtNDk4ZC1iYjc2LWIyNmU0OTljZDA5YiJ9.wruXeClfrAF7hA8Yp0qlE-topxFTEWaiXrC3toqsK1A",
  "access_expires_at": "2026-11-01T22:56:22.770051971Z",
  "refresh_token": "U28wzJEq3gOUejFAndh0p0xIt6QBEhCxMcsrV4hLU5Y",
  "refresh_expires_at": "2026-12-01T22:41:22.76929256Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b1d553d0-1bca-497c-b018-4f861e1af910",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": -60.5,
    "lon": 141.5
  },
  "dropoff": {
    "lat": -60.45,
    "lon": 141.55
  }
}
```

```json
{
  "id": "54adcffd-ed3b-44e5-b618-31fbf263183a",
  "vehicle_class": "STANDARD",
  "city_id": "d24a7656-60d5-4b2d-b48e-ed9e13ecc6be",
  "amount_minor": 21931,
  "currency": "UAH",
  "distance_m": 8077,
  "duration_s": 1163,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-11-01T22:46:23.039244Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false,
  "discount_minor": 0,
  "to_pay_minor": 21931,
  "promotions": [],
  "payment_methods": [
    "CASH"
  ],
  "card_hold_minor": null
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "be15ba88-4584-4195-af62-08a49399a635",
  "quote_id": "54adcffd-ed3b-44e5-b618-31fbf263183a",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": -60.5,
    "lon": 141.5
  },
  "pickup_label": "Pier",
  "dropoff": {
    "lat": -60.45,
    "lon": 141.55
  },
  "dropoff_label": "Station",
  "payment_method": "CASH"
}
```

```json
{
  "id": "a1b8c074-c2f2-412f-b286-799bf99507dc",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d5efdff3-ac06-42da-9a28-844257e393f6",
  "city_id": "d24a7656-60d5-4b2d-b48e-ed9e13ecc6be",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": -60.5,
    "lon": 141.5
  },
  "pickup_label": "Pier",
  "dropoff": {
    "lat": -60.45,
    "lon": 141.55
  },
  "dropoff_label": "Station",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 21931,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "PERSONAL",
  "assignment": null,
  "created_at": "2026-11-01T22:41:23.366372Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null,
  "comment": null,
  "entrance": null
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "0ac024de-d53e-4a98-8587-3cb9ad893432",
    "order_id": "a1b8c074-c2f2-412f-b286-799bf99507dc",
    "expires_at": "2026-11-01T22:41:38.374259Z",
    "server_time": "2026-11-01T22:41:23.675164202Z",
    "seconds_left": 14,
    "vehicle_class": "STANDARD",
    "pickup": {
      "lat": -60.5,
      "lon": 141.5
    },
    "pickup_label": "Pier",
    "dropoff_label": "Station",
    "payment_method": "CASH",
    "price_minor": 21931,
    "currency": "UAH",
    "distance_m": 1114,
    "price_kind": "FIXED",
    "expected_earnings_minor": 18641,
    "comment": null,
    "entrance": null
  }
]
```

`POST /api/driver/v1/offers/0ac024de-d53e-4a98-8587-3cb9ad893432/accept` → **200**

```json
{
  "command_id": "e19a8404-d221-4ab2-8238-e99c6cf64695"
}
```

```json
{
  "id": "8e32a8ce-da10-4402-b121-4b920d7b6564",
  "order_id": "a1b8c074-c2f2-412f-b286-799bf99507dc",
  "driver_id": "ca779563-4a9e-4370-9710-e2d50005ed10",
  "vehicle_id": "670fb1e2-ab54-49e1-9f5c-5d6c261f6003",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f4ff66b9-fb1b-4d8b-b434-c61a981f4154",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f4ff66b9-fb1b-4d8b-b434-c61a981f4154",
  "order_id": "a1b8c074-c2f2-412f-b286-799bf99507dc",
  "assignment_id": "8e32a8ce-da10-4402-b121-4b920d7b6564",
  "phase": "TO_PICKUP",
  "version": 0,
  "pickup": {
    "lat": -60.5,
    "lon": 141.5
  },
  "pickup_label": "Pier",
  "dropoff": {
    "lat": -60.45,
    "lon": 141.55
  },
  "dropoff_label": "Station",
  "payment_method": "CASH",
  "price_minor": 21931,
  "currency": "UAH",
  "arrived_at": null,
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null,
  "comment": null,
  "entrance": null,
  "contact_attempts": []
}
```

(the car drives 18 s to the next point)

`POST /api/driver/v1/work-sessions/bfb6c110-92c3-4551-aa6f-984a296a2448/heartbeat` → **200**

```json
{
  "location": {
    "lat": -60.4998,
    "lon": 141.5,
    "accuracy_m": 5,
    "recorded_at": "2026-11-01T22:41:42Z",
    "sequence": 1793572902458
  }
}
```

```json
{
  "driver_id": "ca779563-4a9e-4370-9710-e2d50005ed10",
  "session_id": "bfb6c110-92c3-4551-aa6f-984a296a2448",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "d24a7656-60d5-4b2d-b48e-ed9e13ecc6be",
  "vehicle_id": "670fb1e2-ab54-49e1-9f5c-5d6c261f6003",
  "last_heartbeat_at": "2026-11-01T22:41:42.569717Z",
  "last_location_at": "2026-11-01T22:41:42.569717Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/f4ff66b9-fb1b-4d8b-b434-c61a981f4154/arrive` → **200**

```json
{
  "command_id": "74e5e1a5-57c0-4e91-a8dd-8b052c2d772e",
  "expected_version": 0
}
```

```json
{
  "id": "f4ff66b9-fb1b-4d8b-b434-c61a981f4154",
  "order_id": "a1b8c074-c2f2-412f-b286-799bf99507dc",
  "assignment_id": "8e32a8ce-da10-4402-b121-4b920d7b6564",
  "phase": "WAITING",
  "version": 1,
  "pickup": {
    "lat": -60.5,
    "lon": 141.5
  },
  "pickup_label": "Pier",
  "dropoff": {
    "lat": -60.45,
    "lon": 141.55
  },
  "dropoff_label": "Station",
  "payment_method": "CASH",
  "price_minor": 21931,
  "currency": "UAH",
  "arrived_at": "2026-11-01T22:41:42.830948Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null,
  "comment": null,
  "entrance": null,
  "contact_attempts": []
}
```

`POST /api/driver/v1/trips/f4ff66b9-fb1b-4d8b-b434-c61a981f4154/start` → **200**

```json
{
  "command_id": "5049269b-8f2d-4257-a484-c51076af52b1",
  "expected_version": 1
}
```

```json
{
  "id": "f4ff66b9-fb1b-4d8b-b434-c61a981f4154",
  "order_id": "a1b8c074-c2f2-412f-b286-799bf99507dc",
  "assignment_id": "8e32a8ce-da10-4402-b121-4b920d7b6564",
  "phase": "IN_PROGRESS",
  "version": 2,
  "pickup": {
    "lat": -60.5,
    "lon": 141.5
  },
  "pickup_label": "Pier",
  "dropoff": {
    "lat": -60.45,
    "lon": 141.55
  },
  "dropoff_label": "Station",
  "payment_method": "CASH",
  "price_minor": 21931,
  "currency": "UAH",
  "arrived_at": "2026-11-01T22:41:42.830948Z",
  "started_at": "2026-11-01T22:41:43.106022Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null,
  "comment": null,
  "entrance": null,
  "contact_attempts": []
}
```

`POST /api/driver/v1/trips/f4ff66b9-fb1b-4d8b-b434-c61a981f4154/complete` → **200**

```json
{
  "command_id": "b3d9b9dc-ea2d-42d2-bec8-b076513456c5",
  "expected_version": 2,
  "reported_at": "2026-11-01T22:41:43Z",
  "cash_received": true
}
```

```json
{
  "id": "f4ff66b9-fb1b-4d8b-b434-c61a981f4154",
  "order_id": "a1b8c074-c2f2-412f-b286-799bf99507dc",
  "assignment_id": "8e32a8ce-da10-4402-b121-4b920d7b6564",
  "phase": "COMPLETED",
  "version": 3,
  "pickup": {
    "lat": -60.5,
    "lon": 141.5
  },
  "pickup_label": "Pier",
  "dropoff": {
    "lat": -60.45,
    "lon": 141.55
  },
  "dropoff_label": "Station",
  "payment_method": "CASH",
  "price_minor": 21931,
  "currency": "UAH",
  "arrived_at": "2026-11-01T22:41:42.830948Z",
  "started_at": "2026-11-01T22:41:43.106022Z",
  "completed_at": "2026-11-01T22:41:43.375378Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null,
  "comment": null,
  "entrance": null,
  "contact_attempts": []
}
```

## An operator takes a phone order (cash) and the new driver drives it

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
  "session_id": "ee9b246c-ba84-4e6d-9be2-0b5d4e71a2d3",
  "subject": {
    "type": "STAFF",
    "id": "be4860ca-23a3-4424-96fe-338c557b95c5"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiZTQ4NjBjYS0yM2EzLTQ0MjQtOTZmZS0zMzhjNTU3Yjk1YzUiLCJhdWQiOiJvcGVyYXRvciIsInN2YyI6IjVlMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDAwMSIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM1NzM4MDMsImlhdCI6MTc5MzU3MjkwMywianRpIjoiODk4Y2NmOTUtODhlYi00NDJkLTlhMzQtMGI4NTIyZTRmYzlkIiwic2lkIjoiZWU5YjI0NmMtYmE4NC00ZTZkLTliZTItMGI1ZDRlNzFhMmQzIn0.6pusaF1swFaoAIIYFzH3FLNFtchUPv6yGAVDHPlSgbw",
  "access_expires_at": "2026-11-01T22:56:43.907785142Z",
  "refresh_token": "SESXfaVu4PU-8EaZiYZyFriFwrs9iTY_J3396mjinok",
  "refresh_expires_at": "2026-11-02T10:41:43.907020633Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "35122c84-878f-476b-830e-5309be1402f0",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": -60.5,
    "lon": 141.5
  },
  "dropoff": {
    "lat": -60.45,
    "lon": 141.55
  }
}
```

```json
{
  "id": "c5c3985f-8177-4243-9702-57ae04aad45d",
  "vehicle_class": "STANDARD",
  "city_id": "d24a7656-60d5-4b2d-b48e-ed9e13ecc6be",
  "amount_minor": 21931,
  "currency": "UAH",
  "distance_m": 8077,
  "duration_s": 1163,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-11-01T22:46:44.186426Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false,
  "discount_minor": 0,
  "to_pay_minor": 21931,
  "promotions": [],
  "payment_methods": [
    "CASH",
    "TERMINAL"
  ],
  "card_hold_minor": null
}
```

`POST /api/operator/v1/orders` → **201**

```json
{
  "command_id": "3d945fa0-1eb2-4880-b8c1-b45da0cfef60",
  "quote_id": "c5c3985f-8177-4243-9702-57ae04aad45d",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": -60.5,
    "lon": 141.5
  },
  "pickup_label": "Pier",
  "dropoff": {
    "lat": -60.45,
    "lon": 141.55
  },
  "dropoff_label": "Station",
  "payment_method": "CASH",
  "caller": {
    "name": "Olena",
    "phone": "+380670041013"
  }
}
```

```json
{
  "id": "b74e6c10-464b-494c-891a-9511d925881f",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "PHONE",
  "payer_client_id": null,
  "city_id": "d24a7656-60d5-4b2d-b48e-ed9e13ecc6be",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": -60.5,
    "lon": 141.5
  },
  "pickup_label": "Pier",
  "dropoff": {
    "lat": -60.45,
    "lon": 141.55
  },
  "dropoff_label": "Station",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 21931,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "PERSONAL",
  "assignment": null,
  "created_at": "2026-11-01T22:41:44.458474Z",
  "caller": {
    "name": "Olena",
    "phone": "+380670041013"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null,
  "driver": null,
  "driver_change": null,
  "comment": null,
  "entrance": null
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "43866ada-de10-450c-9fb0-9115f0df7e6c",
    "order_id": "b74e6c10-464b-494c-891a-9511d925881f",
    "expires_at": "2026-11-01T22:41:59.462941Z",
    "server_time": "2026-11-01T22:41:44.757796144Z",
    "seconds_left": 14,
    "vehicle_class": "STANDARD",
    "pickup": {
      "lat": -60.5,
      "lon": 141.5
    },
    "pickup_label": "Pier",
    "dropoff_label": "Station",
    "payment_method": "CASH",
    "price_minor": 21931,
    "currency": "UAH",
    "distance_m": 22,
    "price_kind": "FIXED",
    "expected_earnings_minor": 18641,
    "comment": null,
    "entrance": null
  }
]
```

`POST /api/driver/v1/offers/43866ada-de10-450c-9fb0-9115f0df7e6c/accept` → **200**

```json
{
  "command_id": "abbbfe27-96ec-4e98-847a-a04d3dbf4a1e"
}
```

```json
{
  "id": "f4d49403-fd32-4f1b-849d-b4a0b73ea265",
  "order_id": "b74e6c10-464b-494c-891a-9511d925881f",
  "driver_id": "ca779563-4a9e-4370-9710-e2d50005ed10",
  "vehicle_id": "670fb1e2-ab54-49e1-9f5c-5d6c261f6003",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b7ba00bd-568d-404b-9ec4-61e5d4988a79",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b7ba00bd-568d-404b-9ec4-61e5d4988a79",
  "order_id": "b74e6c10-464b-494c-891a-9511d925881f",
  "assignment_id": "f4d49403-fd32-4f1b-849d-b4a0b73ea265",
  "phase": "TO_PICKUP",
  "version": 0,
  "pickup": {
    "lat": -60.5,
    "lon": 141.5
  },
  "pickup_label": "Pier",
  "dropoff": {
    "lat": -60.45,
    "lon": 141.55
  },
  "dropoff_label": "Station",
  "payment_method": "CASH",
  "price_minor": 21931,
  "currency": "UAH",
  "arrived_at": null,
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Olena",
    "phone": "+380670041013"
  },
  "comment": null,
  "entrance": null,
  "contact_attempts": []
}
```

`POST /api/driver/v1/work-sessions/bfb6c110-92c3-4551-aa6f-984a296a2448/heartbeat` → **200**

```json
{
  "location": {
    "lat": -60.4998,
    "lon": 141.5,
    "accuracy_m": 5,
    "recorded_at": "2026-11-01T22:41:45Z",
    "sequence": 1793572905516
  }
}
```

```json
{
  "driver_id": "ca779563-4a9e-4370-9710-e2d50005ed10",
  "session_id": "bfb6c110-92c3-4551-aa6f-984a296a2448",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "d24a7656-60d5-4b2d-b48e-ed9e13ecc6be",
  "vehicle_id": "670fb1e2-ab54-49e1-9f5c-5d6c261f6003",
  "last_heartbeat_at": "2026-11-01T22:41:45.535751Z",
  "last_location_at": "2026-11-01T22:41:45.535751Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/b7ba00bd-568d-404b-9ec4-61e5d4988a79/arrive` → **200**

```json
{
  "command_id": "c0f53813-05d6-4863-9d66-b4039840748c",
  "expected_version": 0
}
```

```json
{
  "id": "b7ba00bd-568d-404b-9ec4-61e5d4988a79",
  "order_id": "b74e6c10-464b-494c-891a-9511d925881f",
  "assignment_id": "f4d49403-fd32-4f1b-849d-b4a0b73ea265",
  "phase": "WAITING",
  "version": 1,
  "pickup": {
    "lat": -60.5,
    "lon": 141.5
  },
  "pickup_label": "Pier",
  "dropoff": {
    "lat": -60.45,
    "lon": 141.55
  },
  "dropoff_label": "Station",
  "payment_method": "CASH",
  "price_minor": 21931,
  "currency": "UAH",
  "arrived_at": "2026-11-01T22:41:45.793491Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Olena",
    "phone": "+380670041013"
  },
  "comment": null,
  "entrance": null,
  "contact_attempts": []
}
```

`POST /api/driver/v1/trips/b7ba00bd-568d-404b-9ec4-61e5d4988a79/start` → **200**

```json
{
  "command_id": "d07123e2-9d35-4d15-8618-952ecea14f1e",
  "expected_version": 1
}
```

```json
{
  "id": "b7ba00bd-568d-404b-9ec4-61e5d4988a79",
  "order_id": "b74e6c10-464b-494c-891a-9511d925881f",
  "assignment_id": "f4d49403-fd32-4f1b-849d-b4a0b73ea265",
  "phase": "IN_PROGRESS",
  "version": 2,
  "pickup": {
    "lat": -60.5,
    "lon": 141.5
  },
  "pickup_label": "Pier",
  "dropoff": {
    "lat": -60.45,
    "lon": 141.55
  },
  "dropoff_label": "Station",
  "payment_method": "CASH",
  "price_minor": 21931,
  "currency": "UAH",
  "arrived_at": "2026-11-01T22:41:45.793491Z",
  "started_at": "2026-11-01T22:41:46.052015Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Olena",
    "phone": "+380670041013"
  },
  "comment": null,
  "entrance": null,
  "contact_attempts": []
}
```

`POST /api/driver/v1/trips/b7ba00bd-568d-404b-9ec4-61e5d4988a79/complete` → **200**

```json
{
  "command_id": "8824580f-7dcb-49c4-98b9-bfe6447d6eb0",
  "expected_version": 2,
  "reported_at": "2026-11-01T22:41:46Z",
  "cash_received": true
}
```

```json
{
  "id": "b7ba00bd-568d-404b-9ec4-61e5d4988a79",
  "order_id": "b74e6c10-464b-494c-891a-9511d925881f",
  "assignment_id": "f4d49403-fd32-4f1b-849d-b4a0b73ea265",
  "phase": "COMPLETED",
  "version": 3,
  "pickup": {
    "lat": -60.5,
    "lon": 141.5
  },
  "pickup_label": "Pier",
  "dropoff": {
    "lat": -60.45,
    "lon": 141.55
  },
  "dropoff_label": "Station",
  "payment_method": "CASH",
  "price_minor": 21931,
  "currency": "UAH",
  "arrived_at": "2026-11-01T22:41:45.793491Z",
  "started_at": "2026-11-01T22:41:46.052015Z",
  "completed_at": "2026-11-01T22:41:46.327236Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null,
  "comment": null,
  "entrance": null,
  "contact_attempts": []
}
```

## The financial result: both fares posted, the driver's earnings and the city's money report

`GET /api/admin/v1/orders/a1b8c074-c2f2-412f-b286-799bf99507dc/fare` → **200**

```json
{
  "order_id": "a1b8c074-c2f2-412f-b286-799bf99507dc",
  "currency": "UAH",
  "current_version": 1,
  "versions": [
    {
      "id": "4a8aa78e-5120-4e2b-86f2-8cd38b9003ce",
      "version": 1,
      "amount_minor": 21931,
      "commission_minor": 3290,
      "driver_share_minor": 18641,
      "created_at": "2026-11-01T22:41:43.380305Z",
      "corrects_id": null,
      "reason": null,
      "author_id": null
    }
  ],
  "refund_obligation_minor": 0,
  "refund_state": "NONE",
  "accounting": "POSTED"
}
```

Order a1b8c074-c2f2-412f-b286-799bf99507dc: accounting `POSTED`.

`GET /api/admin/v1/orders/b74e6c10-464b-494c-891a-9511d925881f/fare` → **200**

```json
{
  "order_id": "b74e6c10-464b-494c-891a-9511d925881f",
  "currency": "UAH",
  "current_version": 1,
  "versions": [
    {
      "id": "d834266f-cf59-4aed-aff2-527bfc2ec307",
      "version": 1,
      "amount_minor": 21931,
      "commission_minor": 3290,
      "driver_share_minor": 18641,
      "created_at": "2026-11-01T22:41:46.329729Z",
      "corrects_id": null,
      "reason": null,
      "author_id": null
    }
  ],
  "refund_obligation_minor": 0,
  "refund_state": "NONE",
  "accounting": "PENDING"
}
```

`GET /api/admin/v1/orders/b74e6c10-464b-494c-891a-9511d925881f/fare` → **200**

```json
{
  "order_id": "b74e6c10-464b-494c-891a-9511d925881f",
  "currency": "UAH",
  "current_version": 1,
  "versions": [
    {
      "id": "d834266f-cf59-4aed-aff2-527bfc2ec307",
      "version": 1,
      "amount_minor": 21931,
      "commission_minor": 3290,
      "driver_share_minor": 18641,
      "created_at": "2026-11-01T22:41:46.329729Z",
      "corrects_id": null,
      "reason": null,
      "author_id": null
    }
  ],
  "refund_obligation_minor": 0,
  "refund_state": "NONE",
  "accounting": "POSTED"
}
```

Order b74e6c10-464b-494c-891a-9511d925881f: accounting `POSTED`.

`GET /api/admin/v1/orders/a1b8c074-c2f2-412f-b286-799bf99507dc/fare` → **200**

```json
{
  "order_id": "a1b8c074-c2f2-412f-b286-799bf99507dc",
  "currency": "UAH",
  "current_version": 1,
  "versions": [
    {
      "id": "4a8aa78e-5120-4e2b-86f2-8cd38b9003ce",
      "version": 1,
      "amount_minor": 21931,
      "commission_minor": 3290,
      "driver_share_minor": 18641,
      "created_at": "2026-11-01T22:41:43.380305Z",
      "corrects_id": null,
      "reason": null,
      "author_id": null
    }
  ],
  "refund_obligation_minor": 0,
  "refund_state": "NONE",
  "accounting": "POSTED"
}
```

`GET /api/admin/v1/orders/b74e6c10-464b-494c-891a-9511d925881f/fare` → **200**

```json
{
  "order_id": "b74e6c10-464b-494c-891a-9511d925881f",
  "currency": "UAH",
  "current_version": 1,
  "versions": [
    {
      "id": "d834266f-cf59-4aed-aff2-527bfc2ec307",
      "version": 1,
      "amount_minor": 21931,
      "commission_minor": 3290,
      "driver_share_minor": 18641,
      "created_at": "2026-11-01T22:41:46.329729Z",
      "corrects_id": null,
      "reason": null,
      "author_id": null
    }
  ],
  "refund_obligation_minor": 0,
  "refund_state": "NONE",
  "accounting": "POSTED"
}
```

`GET /api/driver/v1/earnings?city_id=d24a7656-60d5-4b2d-b48e-ed9e13ecc6be&from=2026-11-01&to=2026-11-01` → **200**

```json
{
  "driver_id": "ca779563-4a9e-4370-9710-e2d50005ed10",
  "city_id": "d24a7656-60d5-4b2d-b48e-ed9e13ecc6be",
  "currency": "UAH",
  "timezone": "Europe/Kyiv",
  "from": "2026-11-01",
  "to": "2026-11-01",
  "days": [],
  "total": {
    "trips": 0,
    "fare_minor": 0,
    "commission_minor": 0,
    "driver_share_minor": 0,
    "held_minor": 0,
    "cash_minor": 0,
    "cashless_minor": 0,
    "tips_minor": 0,
    "bonuses_minor": 0,
    "top_ups_minor": 0,
    "transfers_in_minor": 0,
    "transfers_out_minor": 0,
    "adjustments_minor": 0,
    "net_minor": 0
  },
  "balance_minor": -6580,
  "pending": {
    "trips": 0,
    "fare_minor": 0
  }
}
```

Earnings today: {"trips":0,"fares":0,"commission":0,"balance":-6580}.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "ca779563-4a9e-4370-9710-e2d50005ed10",
  "session_id": "bfb6c110-92c3-4551-aa6f-984a296a2448",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "d24a7656-60d5-4b2d-b48e-ed9e13ecc6be",
  "vehicle_id": "670fb1e2-ab54-49e1-9f5c-5d6c261f6003",
  "last_heartbeat_at": "2026-11-01T22:41:45.535751Z",
  "last_location_at": "2026-11-01T22:41:45.535751Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/bfb6c110-92c3-4551-aa6f-984a296a2448/close` → **200**

```json
{
  "command_id": "f68b7644-34ff-411b-be24-39b2ce5efefb",
  "expected_version": 0
}
```

```json
{
  "driver_id": "ca779563-4a9e-4370-9710-e2d50005ed10",
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

`GET /api/admin/v1/cities?state=PUBLISHED` → **200**

```json
{
  "cities": [
    {
      "id": "d24a7656-60d5-4b2d-b48e-ed9e13ecc6be",
      "code": "sandbox-first-141-9486",
      "name": "Sandbox first city",
      "currency": "UAH",
      "timezone": "Europe/Kyiv",
      "priority": 0,
      "state": "PUBLISHED",
      "version": 1,
      "polygon": {
        "type": "MultiPolygon",
        "coordinates": [
          [
            [
              [
                141,
                -61
              ],
              [
                142,
                -61
              ],
              [
                142,
                -60
              ],
              [
                141,
                -60
              ],
              [
                141,
                -61
              ]
            ]
          ]
        ]
      }
    },
    {
      "id": "5a000000-0000-4000-8000-000000000002",
      "code": "warszawa",
      "name": "Warszawa",
      "currency": "PLN",
      "timezone": "Europe/Warsaw",
      "priority": 100,
      "state": "PUBLISHED",
      "version": 0,
      "polygon": {
        "type": "MultiPolygon",
        "coordinates": [
          [
            [
              [
                20.85,
                52.09
              ],
              [
                21.27,
                52.09
              ],
              [
                21.27,
                52.37
              ],
              [
                20.85,
                52.37
              ],
              [
                20.85,
                52.09
              ]
            ]
          ]
        ]
      }
    },
```

`POST /api/admin/v1/cities/d24a7656-60d5-4b2d-b48e-ed9e13ecc6be/archive` → **200**

```json
{
  "command_id": "dec0e4a1-2856-40e1-bdcf-6ba32bda7321",
  "expected_version": 1,
  "reason": "Sandbox: first city done"
}
```

```json
{
  "id": "d24a7656-60d5-4b2d-b48e-ed9e13ecc6be",
  "state": "ARCHIVED",
  "version": 2
}
```
