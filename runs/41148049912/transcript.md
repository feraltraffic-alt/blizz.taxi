# Sandbox transcript (2026-10-31T00:04:22Z, 7bc2601)

# Scenario: admission-cities

## Only Andrii is online in Kyiv for this scenario

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-12087"
}
```

```json
{
  "challenge_id": "3ea0cba9-9896-421c-84c5-d844f9a0b45a",
  "expires_at": "2026-10-31T00:09:23.047878236Z",
  "resend_available_at": "2026-10-31T00:04:24.047878236Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "081976",
  "sent_at": "2026-10-31T00:04:23.059048093Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3ea0cba9-9896-421c-84c5-d844f9a0b45a",
  "code": "081976",
  "device_ref": "sandbox-12087"
}
```

```json
{
  "session_id": "83d501be-5b92-47ef-90ba-f8b45c9d2c7d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwNTk2OCwiaWF0IjoxNzkzNDA1MDY4LCJqdGkiOiJlZTUyYjU1ZC0xYWNjLTQ3YWUtYjAzMS1hZmM5ZmM5ZjVmNWYiLCJzaWQiOiI4M2Q1MDFiZS01YjkyLTQ3ZWYtOTBiYS1mOGI0NWM5ZDJjN2QifQ.ZDy9TxqD4PkCN3s2xuY5Hf0yfcavwJV6UbnLIDsxNu0",
  "access_expires_at": "2026-10-31T00:19:28.639241715Z",
  "refresh_token": "Q4sxf-zyrU_Oz5vlJAnsfZA4-yRAuzY0NfdPGdLNC9w",
  "refresh_expires_at": "2026-11-30T00:04:28.637691056Z",
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
  "device_ref": "sandbox-15359"
}
```

```json
{
  "challenge_id": "aaa7a83b-2996-4de6-b3cb-82d203fbbff4",
  "expires_at": "2026-10-31T00:09:29.090480333Z",
  "resend_available_at": "2026-10-31T00:04:30.090480333Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "070745",
  "sent_at": "2026-10-31T00:04:29.094771625Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "aaa7a83b-2996-4de6-b3cb-82d203fbbff4",
  "code": "070745",
  "device_ref": "sandbox-15359"
}
```

```json
{
  "session_id": "0b8e34fc-a4cf-4f8b-babf-27572d604fff",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwNTk2OSwiaWF0IjoxNzkzNDA1MDY5LCJqdGkiOiIzMDE4MjliNS05ODYzLTRiOTUtOTI1Mi1hNGJjMmMyZmUzZmUiLCJzaWQiOiIwYjhlMzRmYy1hNGNmLTRmOGItYmFiZi0yNzU3MmQ2MDRmZmYifQ.4SRsKir8pv3bmHvtRPseJFbex8wuH4buYurS47etlho",
  "access_expires_at": "2026-10-31T00:19:29.312617966Z",
  "refresh_token": "UDPhk1w3a-1OzKe4iAKC2B8LNMfAhqG_pEA64usnJwI",
  "refresh_expires_at": "2026-11-30T00:04:29.311883962Z",
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
  "correlation_id": "b3497620-3e38-4736-a8e8-0a44c81df957"
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
  "session_id": "f4b98d65-08d5-40f6-ac47-d0fa081f0c3c",
  "subject": {
    "type": "STAFF",
    "id": "2a3afaa3-e140-4771-8de7-2ab6b356cb06"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYTNhZmFhMy1lMTQwLTQ3NzEtOGRlNy0yYWI2YjM1NmNiMDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDU5NzAsImlhdCI6MTc5MzQwNTA3MCwianRpIjoiNzNiNjEzYTUtMWUxNy00Njk2LTg5YTctMDFlNDc1N2RkZWJkIiwic2lkIjoiZjRiOThkNjUtMDhkNS00MGY2LWFjNDctZDBmYTA4MWYwYzNjIn0.TU1zZIpAkv1OwQveqLAp_qnm1-vjDpPBjSmq4Ca5m40",
  "access_expires_at": "2026-10-31T00:19:30.357167387Z",
  "refresh_token": "BGkmCgxCP7ScVcaA7t8L2_lWY7Qe2Ph1nveLOtUQ3qE",
  "refresh_expires_at": "2026-10-31T12:04:30.356416057Z",
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
  "session_id": "58322c94-043d-4fc4-a545-c0aa6b17f8ee",
  "subject": {
    "type": "STAFF",
    "id": "2a3afaa3-e140-4771-8de7-2ab6b356cb06"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYTNhZmFhMy1lMTQwLTQ3NzEtOGRlNy0yYWI2YjM1NmNiMDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDU5NzEsImlhdCI6MTc5MzQwNTA3MSwianRpIjoiNGZlY2I3NTgtNTY5ZS00ZTg2LTkwYzItMmQ2MTE5NzVmOWE3Iiwic2lkIjoiNTgzMjJjOTQtMDQzZC00ZmM0LWE1NDUtYzBhYTZiMTdmOGVlIn0.HhCXfKDzQ4IYoNcSS8VOMz05c-O4-4aU_FBPV4vHv6Y",
  "access_expires_at": "2026-10-31T00:19:31.638021168Z",
  "refresh_token": "i4mx2M_GxeHhvfwUKN8J-3zUJttnEBwGxY7qoJHHkBQ",
  "refresh_expires_at": "2026-10-31T12:04:31.637211235Z",
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
  "session_id": "a19b7db9-59cf-49c1-83bb-2255d3218426",
  "subject": {
    "type": "STAFF",
    "id": "2a3afaa3-e140-4771-8de7-2ab6b356cb06"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYTNhZmFhMy1lMTQwLTQ3NzEtOGRlNy0yYWI2YjM1NmNiMDYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDU5NzIsImlhdCI6MTc5MzQwNTA3MiwianRpIjoiNjcwNmI5MzAtMWQyZS00YmNlLTg5MDAtOTlhNDIxNTBiYzI5Iiwic2lkIjoiYTE5YjdkYjktNTljZi00OWMxLTgzYmItMjI1NWQzMjE4NDI2In0.60y3QfIG9DxkLcgwM_9MzZQCLyIJOPPJ_nI-2vyXQWU",
  "access_expires_at": "2026-10-31T00:19:32.046144601Z",
  "refresh_token": "aL90mc4_i97-m5oA8k6B3fbRoQ_SRSIZ6RcycuCf4pU",
  "refresh_expires_at": "2026-10-31T12:04:32.045315931Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-28548"
}
```

```json
{
  "challenge_id": "154965e3-6f6d-457b-881d-388f9b2a9612",
  "expires_at": "2026-10-31T00:09:32.241289166Z",
  "resend_available_at": "2026-10-31T00:04:33.241289166Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "207164",
  "sent_at": "2026-10-31T00:04:32.245130842Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "154965e3-6f6d-457b-881d-388f9b2a9612",
  "code": "207164",
  "device_ref": "sandbox-28548"
}
```

```json
{
  "session_id": "851c6685-4424-4731-b6ad-97d020548012",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwNTk3MiwiaWF0IjoxNzkzNDA1MDcyLCJqdGkiOiJmZWUwNWMyNC1mNTBlLTRiZTItOGU3Zi1hZmI0MDM0Y2Q0MDAiLCJzaWQiOiI4NTFjNjY4NS00NDI0LTQ3MzEtYjZhZC05N2QwMjA1NDgwMTIifQ.mpKs7okNxAHqfgsOBA3rVtChHCdslTRlEqLAshRC-Wc",
  "access_expires_at": "2026-10-31T00:19:32.471680756Z",
  "refresh_token": "SGY32g5yKyDeYsuPu-LnORtdpAmea8BeGvcfVbnTo60",
  "refresh_expires_at": "2026-11-30T00:04:32.470939308Z",
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
  "command_id": "77ad964f-10c2-4091-b64e-a2e1ab4c2ea4",
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
  "command_id": "d75c943c-84fe-43a3-a015-10500c33a196",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4528,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T00:04:33Z",
    "sequence": 1793405073293
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
  "correlation_id": "4502fc5e-892a-4bed-9f7e-0bbac31c7f44"
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
  "command_id": "2cee9787-0ac9-49dd-ae1c-58b9cf2db2fc",
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
  "command_id": "e63f86b6-fef1-49d4-b98f-c4d23cb565af",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4528,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T00:04:34Z",
    "sequence": 1793405074207
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "0c23d551-eb49-4f3a-b327-c790980c776f",
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
  "last_heartbeat_at": "2026-10-31T00:04:34.22656Z",
  "last_location_at": "2026-10-31T00:04:34.22656Z",
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
  "command_id": "fa340da7-4a25-4686-96da-8e1acb665bb4",
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
  "session_id": "0c23d551-eb49-4f3a-b327-c790980c776f",
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
  "last_heartbeat_at": "2026-10-31T00:04:34.22656Z",
  "last_location_at": "2026-10-31T00:04:34.22656Z",
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
  "phone": "+380688015144",
  "device_ref": "sandbox-26582"
}
```

```json
{
  "challenge_id": "1da3b159-18aa-4962-9610-ed63961d51aa",
  "expires_at": "2026-10-31T00:09:35.054403097Z",
  "resend_available_at": "2026-10-31T00:04:36.054403097Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380688015144` → **200**

```json
{
  "phone": "+380688015144",
  "audience": "CLIENT",
  "code": "354927",
  "sent_at": "2026-10-31T00:04:35.057854616Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1da3b159-18aa-4962-9610-ed63961d51aa",
  "code": "354927",
  "device_ref": "sandbox-26582"
}
```

```json
{
  "session_id": "5bb60dc9-2ae9-444f-a881-3b96fc43ddc9",
  "subject": {
    "type": "CLIENT",
    "id": "463f76a1-db70-4629-87ce-f39aa7ad8459"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NjNmNzZhMS1kYjcwLTQ2MjktODdjZS1mMzlhYTdhZDg0NTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDA1OTc1LCJpYXQiOjE3OTM0MDUwNzUsImp0aSI6IjgwODM2ZWRhLTBmYWMtNGY5Zi05NGI2LTJkMGNlNmRlZjA1ZiIsInNpZCI6IjViYjYwZGM5LTJhZTktNDQ0Zi1hODgxLTNiOTZmYzQzZGRjOSJ9.oDlyf57WuJcLa2aElgUuymj8F2K_vZDrGb9X8m9B0ZA",
  "access_expires_at": "2026-10-31T00:19:35.289099377Z",
  "refresh_token": "ax9eJTZ9Aou9ShkpueqXhV7ppuDopWkRN11tYlQlvT4",
  "refresh_expires_at": "2026-11-30T00:04:35.28846001Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "67c8257b-d891-4265-9931-6eb8d1a9907a",
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
  "id": "46a5d133-020d-44bb-b563-9a4539825c1b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T00:09:35.507359Z",
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
  "command_id": "13074509-2822-413e-bde7-7b53a366cf46",
  "quote_id": "46a5d133-020d-44bb-b563-9a4539825c1b",
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
  "id": "7a3e233d-8478-4e01-aac8-5792896c7367",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "463f76a1-db70-4629-87ce-f39aa7ad8459",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T00:04:35.76368Z",
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
[]
```

`GET /api/driver/v1/broadcast-orders` → **200**

```json
[]
```

`POST /api/driver/v1/orders/7a3e233d-8478-4e01-aac8-5792896c7367/claim` → **409**

```json
{
  "command_id": "9be0c034-dba7-420e-8666-8538b060d6bf"
}
```

```json
{
  "instance": "/api/driver/v1/orders/7a3e233d-8478-4e01-aac8-5792896c7367/claim",
  "status": 409,
  "title": "Driver not eligible",
  "type": "https://errors.blizz.taxi/driver-not-eligible",
  "code": "DRIVER_NOT_ELIGIBLE",
  "correlation_id": "63adb8be-3006-4c3c-8764-745e38eaf9db"
}
```

`GET /api/operator/v1/orders/7a3e233d-8478-4e01-aac8-5792896c7367/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-31T00:04:35.765846Z",
      "actor": {
        "type": "CLIENT",
        "id": "463f76a1-db70-4629-87ce-f39aa7ad8459",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "7a3e233d-8478-4e01-aac8-5792896c7367",
        "quote_id": "46a5d133-020d-44bb-b563-9a4539825c1b",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "1e8ebbdd-0cd2-4cb2-9024-0f3dbc3ee9a7"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-31T00:04:35.770243Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "7a3e233d-8478-4e01-aac8-5792896c7367",
        "attempt_id": "c478dae4-c927-4443-a61c-20e16e91d96e",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "1e8ebbdd-0cd2-4cb2-9024-0f3dbc3ee9a7"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-31T00:04:35.807661Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "7a3e233d-8478-4e01-aac8-5792896c7367",
        "attempt_id": "c478dae4-c927-4443-a61c-20e16e91d96e"
      },
      "correlation_id": "1e8ebbdd-0cd2-4cb2-9024-0f3dbc3ee9a7"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "c478dae4-c927-4443-a61c-20e16e91d96e",
        "generation": 1,
        "started_at": "2026-10-31T00:04:35.768558Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-31T00:04:35.807661Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-31T00:04:35.771485Z",
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
  "command_id": "6f1bd2bc-e84f-48a4-8f6a-e40c08b93304",
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

`POST /api/driver/v1/work-sessions/0c23d551-eb49-4f3a-b327-c790980c776f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4528,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T00:04:37Z",
    "sequence": 1793405077272
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "0c23d551-eb49-4f3a-b327-c790980c776f",
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
  "last_heartbeat_at": "2026-10-31T00:04:37.293772Z",
  "last_location_at": "2026-10-31T00:04:37.293772Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000001/zones` → **201**

```json
{
  "command_id": "628e2c2b-dd65-44db-a022-6b6013eee1b0",
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
  "id": "209ea916-7833-4e11-b1be-dccc56cfaf44",
  "state": "DRAFT",
  "version": 0
}
```

`POST /api/admin/v1/zones/209ea916-7833-4e11-b1be-dccc56cfaf44/publish` → **200**

```json
{
  "command_id": "2cbbfd8a-78b0-44cb-82d4-a65be34a47f2",
  "expected_version": 0,
  "reason": "Sandbox"
}
```

```json
{
  "id": "209ea916-7833-4e11-b1be-dccc56cfaf44",
  "state": "PUBLISHED",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000001/zones` → **201**

```json
{
  "command_id": "74c13585-fa0b-4fb9-bf2c-f307fcf32611",
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
  "id": "0f5440f6-c122-425e-879c-9f5c5e2879b6",
  "state": "DRAFT",
  "version": 0
}
```

`POST /api/admin/v1/zones/0f5440f6-c122-425e-879c-9f5c5e2879b6/publish` → **200**

```json
{
  "command_id": "a036b542-3f8c-4e50-bdc5-637088628c9e",
  "expected_version": 0,
  "reason": "Sandbox"
}
```

```json
{
  "id": "0f5440f6-c122-425e-879c-9f5c5e2879b6",
  "state": "PUBLISHED",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/zones` → **201**

```json
{
  "command_id": "5d331542-f2be-43b3-bc68-0ed5b6d4948f",
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
  "id": "c525a25b-0996-4268-88d0-a848424f850d",
  "state": "DRAFT",
  "version": 0
}
```

`POST /api/admin/v1/zones/c525a25b-0996-4268-88d0-a848424f850d/publish` → **200**

```json
{
  "command_id": "64686c75-074b-4109-a625-6f35d5e07e13",
  "expected_version": 0,
  "reason": "Sandbox"
}
```

```json
{
  "id": "c525a25b-0996-4268-88d0-a848424f850d",
  "state": "PUBLISHED",
  "version": 1
}
```

`GET /api/driver/v1/broadcast-orders?zone_id=209ea916-7833-4e11-b1be-dccc56cfaf44` → **200**

```json
[
  {
    "order_id": "7a3e233d-8478-4e01-aac8-5792896c7367",
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

`GET /api/driver/v1/broadcast-orders?zone_id=0f5440f6-c122-425e-879c-9f5c5e2879b6` → **200**

```json
[]
```

`GET /api/driver/v1/broadcast-orders?zone_id=c525a25b-0996-4268-88d0-a848424f850d` → **400**

```json
{
  "instance": "/api/driver/v1/broadcast-orders",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "5c0f6256-e483-49e1-9c0b-5e8bb6da1ff3"
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
  "command_id": "e6ba696a-3961-465f-95ad-8aa068cfc93b",
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

`GET /api/operator/v1/orders/7a3e233d-8478-4e01-aac8-5792896c7367` → **200**

```json
{
  "id": "7a3e233d-8478-4e01-aac8-5792896c7367",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "463f76a1-db70-4629-87ce-f39aa7ad8459",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T00:04:35.76368Z",
  "caller": null,
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

`POST /api/operator/v1/orders/7a3e233d-8478-4e01-aac8-5792896c7367/cancel` → **200**

```json
{
  "command_id": "27fe2448-8336-47c4-a97e-1fe547ccdba2",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "7a3e233d-8478-4e01-aac8-5792896c7367",
  "short_number": 1,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "463f76a1-db70-4629-87ce-f39aa7ad8459",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T00:04:35.76368Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "en": "No cars available",
      "ru": "Нет свободных машин",
      "pl": "Brak wolnych aut",
      "uk": "Немає вільних авто"
    }
  },
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

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "0c23d551-eb49-4f3a-b327-c790980c776f",
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
  "last_heartbeat_at": "2026-10-31T00:04:37.293772Z",
  "last_location_at": "2026-10-31T00:04:37.293772Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/0c23d551-eb49-4f3a-b327-c790980c776f/close` → **200**

```json
{
  "command_id": "61d9288b-dd08-4d8d-b960-848c12fd1da1",
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
  "session_id": "25a87553-b8ae-4745-b55e-53eeeb9e412f",
  "subject": {
    "type": "STAFF",
    "id": "2a3afaa3-e140-4771-8de7-2ab6b356cb06"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYTNhZmFhMy1lMTQwLTQ3NzEtOGRlNy0yYWI2YjM1NmNiMDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDU5ODAsImlhdCI6MTc5MzQwNTA4MCwianRpIjoiZmJkOThkOWQtNzg1YS00NjQ2LTg3YmEtYjIzMWM4ZDNmMGE0Iiwic2lkIjoiMjVhODc1NTMtYjhhZS00NzQ1LWI1NWUtNTNlZWViOWU0MTJmIn0.YM_VK3a74Kq82kj3S134bUMaWgVSQMz2IvHTqZEcKtw",
  "access_expires_at": "2026-10-31T00:19:40.886209123Z",
  "refresh_token": "peUiUiK0U8RRWfN20cam7hBNIFdEw8VrQqIbLAn92TE",
  "refresh_expires_at": "2026-10-31T12:04:40.885701959Z",
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
  "device_ref": "sandbox-7460"
}
```

```json
{
  "challenge_id": "ffe863c0-eba0-4ec3-ade9-86d3ce7ae5da",
  "expires_at": "2026-10-31T00:09:41.346665835Z",
  "resend_available_at": "2026-10-31T00:04:42.346665835Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "064448",
  "sent_at": "2026-10-31T00:04:41.349848992Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ffe863c0-eba0-4ec3-ade9-86d3ce7ae5da",
  "code": "064448",
  "device_ref": "sandbox-7460"
}
```

```json
{
  "session_id": "936bbfb4-0eda-491b-b52f-dccae1a74b9e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwNTk4MSwiaWF0IjoxNzkzNDA1MDgxLCJqdGkiOiI1OWI0ZGEwYS01OGYxLTQyYTgtOTY2Yi00ZjAzOWQyM2MzMmMiLCJzaWQiOiI5MzZiYmZiNC0wZWRhLTQ5MWItYjUyZi1kY2NhZTFhNzRiOWUifQ.Q0Cb98wMftT2-qS41sMXi7vv_5uxzNnK62RkeFAsB4Y",
  "access_expires_at": "2026-10-31T00:19:41.589117566Z",
  "refresh_token": "g0mJZX2vBZGylJsuffEvTnZll05J5qgdbWCe7SsiMTE",
  "refresh_expires_at": "2026-11-30T00:04:41.588041926Z",
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
  "command_id": "dbdf7f12-5b90-48ff-895b-897d86af6ca2",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T00:04:41Z",
    "sequence": 1793405081997
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6ab699c8-3acc-4454-83f7-b49f864602f1",
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
  "last_heartbeat_at": "2026-10-31T00:04:42.015067Z",
  "last_location_at": "2026-10-31T00:04:42.015067Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631589857",
  "device_ref": "sandbox-17169"
}
```

```json
{
  "challenge_id": "6cf9af3a-9e02-4038-96c8-d1fd915b116c",
  "expires_at": "2026-10-31T00:09:42.214252572Z",
  "resend_available_at": "2026-10-31T00:04:43.214252572Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631589857` → **200**

```json
{
  "phone": "+380631589857",
  "audience": "CLIENT",
  "code": "086834",
  "sent_at": "2026-10-31T00:04:42.217738151Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6cf9af3a-9e02-4038-96c8-d1fd915b116c",
  "code": "086834",
  "device_ref": "sandbox-17169"
}
```

```json
{
  "session_id": "65e5d09a-06d5-4136-94eb-4c79f2851b31",
  "subject": {
    "type": "CLIENT",
    "id": "e5125467-5e01-4f24-8511-459b47df1136"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNTEyNTQ2Ny01ZTAxLTRmMjQtODUxMS00NTliNDdkZjExMzYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDA1OTgyLCJpYXQiOjE3OTM0MDUwODIsImp0aSI6ImYwN2ZlMzExLWE0Y2EtNDFlNi1iZWNlLWQ2M2QzZDZiYmM4NiIsInNpZCI6IjY1ZTVkMDlhLTA2ZDUtNDEzNi05NGViLTRjNzlmMjg1MWIzMSJ9._EpckLdBnQijMnWGJ-nX8QqZmuCqHYtMq2IwYwg4SPk",
  "access_expires_at": "2026-10-31T00:19:42.478513088Z",
  "refresh_token": "YTW5l_z5c0nrvshOJWz7Q5j6joH1vL84RKCccY4D80g",
  "refresh_expires_at": "2026-11-30T00:04:42.477929549Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f3f4a0d2-e40c-474d-bd34-f66191a75e51",
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
  "id": "c64e5b54-44a9-4538-834e-b3fd666ae963",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T00:09:42.726949Z",
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
  "command_id": "a4f0f666-f097-4c08-9995-42d74d4b4cba",
  "quote_id": "c64e5b54-44a9-4538-834e-b3fd666ae963",
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
  "id": "56f94d69-5593-47b0-937b-121dcf726ce1",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e5125467-5e01-4f24-8511-459b47df1136",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T00:04:42.950017Z",
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
    "id": "2c23e677-d5c3-4c59-ad89-2de7deb91e1e",
    "order_id": "56f94d69-5593-47b0-937b-121dcf726ce1",
    "expires_at": "2026-10-31T00:04:57.954111Z",
    "server_time": "2026-10-31T00:04:43.187287291Z",
    "seconds_left": 14,
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
    "distance_m": 100,
    "price_kind": "FIXED",
    "expected_earnings_minor": 8939,
    "comment": null,
    "entrance": null
  }
]
```

`POST /api/driver/v1/offers/2c23e677-d5c3-4c59-ad89-2de7deb91e1e/accept` → **200**

```json
{
  "command_id": "cd29b684-894c-4419-bd48-772ec00330ee"
}
```

```json
{
  "id": "2fae80db-0cad-4b85-b321-5fb2cb7207e4",
  "order_id": "56f94d69-5593-47b0-937b-121dcf726ce1",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d68e092c-5a28-47a8-8a75-b96191a9df03",
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
  "command_id": "6b18c23f-cb45-4325-bc29-028fb314730c",
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
  "changed_by": "2a3afaa3-e140-4771-8de7-2ab6b356cb06",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-31T00:04:43.865249417Z"
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
  "id": "d68e092c-5a28-47a8-8a75-b96191a9df03",
  "order_id": "56f94d69-5593-47b0-937b-121dcf726ce1",
  "assignment_id": "2fae80db-0cad-4b85-b321-5fb2cb7207e4",
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
  "recipient": null,
  "comment": null,
  "entrance": null
}
```

`POST /api/driver/v1/work-sessions/6ab699c8-3acc-4454-83f7-b49f864602f1/heartbeat` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T00:04:44Z",
    "sequence": 1793405084527
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6ab699c8-3acc-4454-83f7-b49f864602f1",
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
  "last_heartbeat_at": "2026-10-31T00:04:44.545092Z",
  "last_location_at": "2026-10-31T00:04:44.545092Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/d68e092c-5a28-47a8-8a75-b96191a9df03/arrive` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "77b91ea2-5072-4d18-b382-d909a636a3f9",
  "expected_version": 0
}
```

```json
{
  "id": "d68e092c-5a28-47a8-8a75-b96191a9df03",
  "order_id": "56f94d69-5593-47b0-937b-121dcf726ce1",
  "assignment_id": "2fae80db-0cad-4b85-b321-5fb2cb7207e4",
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
  "arrived_at": "2026-10-31T00:04:44.760896Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null,
  "comment": null,
  "entrance": null
}
```

`POST /api/driver/v1/trips/d68e092c-5a28-47a8-8a75-b96191a9df03/start` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "8fe5afd2-16c2-4cc6-8f84-18a1956f5f3f",
  "expected_version": 1
}
```

```json
{
  "id": "d68e092c-5a28-47a8-8a75-b96191a9df03",
  "order_id": "56f94d69-5593-47b0-937b-121dcf726ce1",
  "assignment_id": "2fae80db-0cad-4b85-b321-5fb2cb7207e4",
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
  "arrived_at": "2026-10-31T00:04:44.760896Z",
  "started_at": "2026-10-31T00:04:45.018058Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null,
  "comment": null,
  "entrance": null
}
```

`POST /api/driver/v1/trips/d68e092c-5a28-47a8-8a75-b96191a9df03/complete` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "588b2bbb-346f-4c5a-9591-7c738ab71b49",
  "expected_version": 2,
  "reported_at": "2026-10-31T00:04:45Z",
  "cash_received": true
}
```

```json
{
  "id": "d68e092c-5a28-47a8-8a75-b96191a9df03",
  "order_id": "56f94d69-5593-47b0-937b-121dcf726ce1",
  "assignment_id": "2fae80db-0cad-4b85-b321-5fb2cb7207e4",
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
  "arrived_at": "2026-10-31T00:04:44.760896Z",
  "started_at": "2026-10-31T00:04:45.018058Z",
  "completed_at": "2026-10-31T00:04:45.245706Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null,
  "comment": null,
  "entrance": null
}
```

## He closes his shift, and cannot go online again with the old app

`GET /api/driver/v1/work-sessions/current` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6ab699c8-3acc-4454-83f7-b49f864602f1",
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
  "last_heartbeat_at": "2026-10-31T00:04:44.545092Z",
  "last_location_at": "2026-10-31T00:04:44.545092Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6ab699c8-3acc-4454-83f7-b49f864602f1/close` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "8985ac5e-f790-4485-b975-a5fa470c2803",
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
  "command_id": "83f3fb64-433f-4791-9dc4-6cec875b89b4",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T00:04:45Z",
    "sequence": 1793405085884
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
  "correlation_id": "46e43838-037d-438b-a318-3d000cfdcccf",
  "minimum_version": "9.0.0"
}
```

## After the update he can

`POST /api/driver/v1/work-sessions` (X-App-Platform: DRIVER_ANDROID X-App-Version: 9.0.0) → **201**

```json
{
  "command_id": "e885d44c-b57e-4b16-baca-950c3f607d42",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T00:04:46Z",
    "sequence": 1793405086112
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "792ff3ce-07d5-4fb7-ac31-5703f7c2f639",
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
  "last_heartbeat_at": "2026-10-31T00:04:46.133034Z",
  "last_location_at": "2026-10-31T00:04:46.133034Z",
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
  "changed_by": "2a3afaa3-e140-4771-8de7-2ab6b356cb06",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-31T00:04:43.865249Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "838d7499-3260-4542-8037-52c2af30d869",
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
  "changed_by": "2a3afaa3-e140-4771-8de7-2ab6b356cb06",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-31T00:04:46.560096688Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "792ff3ce-07d5-4fb7-ac31-5703f7c2f639",
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
  "last_heartbeat_at": "2026-10-31T00:04:46.133034Z",
  "last_location_at": "2026-10-31T00:04:46.133034Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/792ff3ce-07d5-4fb7-ac31-5703f7c2f639/close` → **200**

```json
{
  "command_id": "1dadf5cf-86a4-485f-a389-4355eb300193",
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
  "session_id": "78a3a2cd-a468-456e-83c8-53d60fe33256",
  "subject": {
    "type": "STAFF",
    "id": "2a3afaa3-e140-4771-8de7-2ab6b356cb06"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYTNhZmFhMy1lMTQwLTQ3NzEtOGRlNy0yYWI2YjM1NmNiMDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDU5ODcsImlhdCI6MTc5MzQwNTA4NywianRpIjoiMWVkNzlhYjgtOWYwNS00ZDI4LTlmMTgtYTBjMDdiYjRmNzhkIiwic2lkIjoiNzhhM2EyY2QtYTQ2OC00NTZlLTgzYzgtNTNkNjBmZTMzMjU2In0.fhKlhxuwhrJhkQWpE7HPx0CXE7I6HUGhj7al8LocBXU",
  "access_expires_at": "2026-10-31T00:19:47.501217542Z",
  "refresh_token": "cyHGpl2C73rZr2dWEnfasSEFB1bf5MxheoeiuP_mB6A",
  "refresh_expires_at": "2026-10-31T12:04:47.500581564Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "03b5f674-9ccd-406c-aa2f-5aefd3b5b1df",
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
  "id": "95dc4923-1b6c-4258-8bc3-16bdbb6a004c",
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
  "created_by": "2a3afaa3-e140-4771-8de7-2ab6b356cb06",
  "created_at": "2026-10-31T00:04:47.711263Z",
  "updated_at": "2026-10-31T00:04:47.711263Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630063692",
  "device_ref": "sandbox-18401"
}
```

```json
{
  "challenge_id": "8e467f9d-32bd-45a1-a101-a7dff2430a49",
  "expires_at": "2026-10-31T00:09:47.928427657Z",
  "resend_available_at": "2026-10-31T00:04:48.928427657Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380630063692` → **200**

```json
{
  "phone": "+380630063692",
  "audience": "CLIENT",
  "code": "067821",
  "sent_at": "2026-10-31T00:04:47.931545151Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8e467f9d-32bd-45a1-a101-a7dff2430a49",
  "code": "067821",
  "device_ref": "sandbox-18401"
}
```

```json
{
  "session_id": "5012e448-6df1-4902-b94c-0206f1a099e9",
  "subject": {
    "type": "CLIENT",
    "id": "66932c84-25b6-49e6-a284-4bbad08b8188"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NjkzMmM4NC0yNWI2LTQ5ZTYtYTI4NC00YmJhZDA4YjgxODgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDA1OTg4LCJpYXQiOjE3OTM0MDUwODgsImp0aSI6IjEyOWM2ZDU5LTIyZjYtNDRhNi05MTY1LTZlNjY2YzI5ODIwNSIsInNpZCI6IjUwMTJlNDQ4LTZkZjEtNDkwMi1iOTRjLTAyMDZmMWEwOTllOSJ9.G1ospjDAoB74eomKgULXeqwLlE3CLsvxnSgFBtF_kQc",
  "access_expires_at": "2026-10-31T00:19:48.154159997Z",
  "refresh_token": "w6ecO8u7fL32kGCpO3oHQJU6yxaOT8xImerf-qbBYFk",
  "refresh_expires_at": "2026-11-30T00:04:48.153706965Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380630063692` → **200**

```json
{
  "client_id": "66932c84-25b6-49e6-a284-4bbad08b8188"
}
```

`POST /api/admin/v1/rider-wallets/66932c84-25b6-49e6-a284-4bbad08b8188/top-ups` → **201**

```json
{
  "command_id": "77b66297-d315-4520-9e68-3de930b7995f",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "66932c84-25b6-49e6-a284-4bbad08b8188",
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
      "id": "52a611c2-3059-46fd-b3c4-2559ac24fd51",
      "at": "2026-10-31T00:04:48.574226Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "2a3afaa3-e140-4771-8de7-2ab6b356cb06",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1e38def2-f353-4e5e-a530-94e482de722c",
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
  "id": "8c7e7341-f928-450f-9ee3-17b5907403c2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T00:09:48.792456Z",
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
      "id": "95dc4923-1b6c-4258-8bc3-16bdbb6a004c",
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
  "device_ref": "sandbox-29044"
}
```

```json
{
  "challenge_id": "bdf03676-b82a-45e6-8095-e2c01c08a5d7",
  "expires_at": "2026-10-31T00:09:49.003161236Z",
  "resend_available_at": "2026-10-31T00:04:50.003161236Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "079122",
  "sent_at": "2026-10-31T00:04:49.005898011Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bdf03676-b82a-45e6-8095-e2c01c08a5d7",
  "code": "079122",
  "device_ref": "sandbox-29044"
}
```

```json
{
  "session_id": "21ed27ed-301d-461b-bd8d-1eed51c70e32",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwNTk4OSwiaWF0IjoxNzkzNDA1MDg5LCJqdGkiOiI5OWRmMGY2NC0zMzNhLTQ0YjMtOGQzYi0yZWQ0NTllMDEzYjUiLCJzaWQiOiIyMWVkMjdlZC0zMDFkLTQ2MWItYmQ4ZC0xZWVkNTFjNzBlMzIifQ.HOuyLo9O_TNhpNZEB6nN6GpRkjopJ-feHlw1Sdg_Hsc",
  "access_expires_at": "2026-10-31T00:19:49.225809513Z",
  "refresh_token": "-GGoXiuDW9nNAd87kGiLUZdNtDcmlv9_V8N8MRKMeuA",
  "refresh_expires_at": "2026-11-30T00:04:49.225269985Z",
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
  "command_id": "1411e32a-3682-4208-a5a2-ef86e3e6eaed",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T00:04:49Z",
    "sequence": 1793405089637
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d90614c6-4e99-4a6d-9757-18ef63f2da72",
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
  "last_heartbeat_at": "2026-10-31T00:04:49.655392Z",
  "last_location_at": "2026-10-31T00:04:49.655392Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "2b12e68b-29ac-40eb-9a56-759862e075f3",
  "quote_id": "8c7e7341-f928-450f-9ee3-17b5907403c2",
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
  "id": "76e33c91-bff4-49a1-a24f-1ae7a98d160b",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "66932c84-25b6-49e6-a284-4bbad08b8188",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T00:04:49.8696Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null,
  "comment": null,
  "entrance": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "66932c84-25b6-49e6-a284-4bbad08b8188",
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
      "id": "52a611c2-3059-46fd-b3c4-2559ac24fd51",
      "at": "2026-10-31T00:04:48.574226Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "2a3afaa3-e140-4771-8de7-2ab6b356cb06",
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
    "id": "89520ef2-0200-4817-93ab-fe50caf7373b",
    "order_id": "76e33c91-bff4-49a1-a24f-1ae7a98d160b",
    "expires_at": "2026-10-31T00:05:04.875207Z",
    "server_time": "2026-10-31T00:04:50.315018274Z",
    "seconds_left": 14,
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
    "distance_m": 211,
    "price_kind": "FIXED",
    "expected_earnings_minor": 8939,
    "comment": null,
    "entrance": null
  }
]
```

`POST /api/driver/v1/offers/89520ef2-0200-4817-93ab-fe50caf7373b/accept` → **200**

```json
{
  "command_id": "1a194922-a3dc-46bd-ba4f-4d564be4951e"
}
```

```json
{
  "id": "df448fc0-5e76-4e4b-91cd-4e5a16b21ad3",
  "order_id": "76e33c91-bff4-49a1-a24f-1ae7a98d160b",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "1be2501d-e808-4deb-b1d4-979e302d538b",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "1be2501d-e808-4deb-b1d4-979e302d538b",
  "order_id": "76e33c91-bff4-49a1-a24f-1ae7a98d160b",
  "assignment_id": "df448fc0-5e76-4e4b-91cd-4e5a16b21ad3",
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
  "recipient": null,
  "comment": null,
  "entrance": null
}
```

(the car drives 3 s to the next point)

`POST /api/driver/v1/work-sessions/d90614c6-4e99-4a6d-9757-18ef63f2da72/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T00:04:53Z",
    "sequence": 1793405093946
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d90614c6-4e99-4a6d-9757-18ef63f2da72",
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
  "last_heartbeat_at": "2026-10-31T00:04:53.964727Z",
  "last_location_at": "2026-10-31T00:04:53.964727Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/1be2501d-e808-4deb-b1d4-979e302d538b/arrive` → **200**

```json
{
  "command_id": "17723bbb-014e-4a0e-9aa1-b7a7f95f45fb",
  "expected_version": 0
}
```

```json
{
  "id": "1be2501d-e808-4deb-b1d4-979e302d538b",
  "order_id": "76e33c91-bff4-49a1-a24f-1ae7a98d160b",
  "assignment_id": "df448fc0-5e76-4e4b-91cd-4e5a16b21ad3",
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
  "arrived_at": "2026-10-31T00:04:54.173944Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null,
  "comment": null,
  "entrance": null
}
```

`POST /api/driver/v1/trips/1be2501d-e808-4deb-b1d4-979e302d538b/start` → **200**

```json
{
  "command_id": "d1544e2d-44d3-442d-a26e-bacfe0b1246b",
  "expected_version": 1
}
```

```json
{
  "id": "1be2501d-e808-4deb-b1d4-979e302d538b",
  "order_id": "76e33c91-bff4-49a1-a24f-1ae7a98d160b",
  "assignment_id": "df448fc0-5e76-4e4b-91cd-4e5a16b21ad3",
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
  "arrived_at": "2026-10-31T00:04:54.173944Z",
  "started_at": "2026-10-31T00:04:54.387712Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null,
  "comment": null,
  "entrance": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/1be2501d-e808-4deb-b1d4-979e302d538b/complete` → **200**

```json
{
  "command_id": "37f834f5-41b9-45d5-a2c4-0170c9f6a336",
  "expected_version": 2,
  "reported_at": "2026-10-31T00:04:54Z",
  "cash_received": true
}
```

```json
{
  "id": "1be2501d-e808-4deb-b1d4-979e302d538b",
  "order_id": "76e33c91-bff4-49a1-a24f-1ae7a98d160b",
  "assignment_id": "df448fc0-5e76-4e4b-91cd-4e5a16b21ad3",
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
  "arrived_at": "2026-10-31T00:04:54.173944Z",
  "started_at": "2026-10-31T00:04:54.387712Z",
  "completed_at": "2026-10-31T00:04:54.613096Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null,
  "comment": null,
  "entrance": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "66932c84-25b6-49e6-a284-4bbad08b8188",
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
      "id": "d5e37184-87a5-49c3-91ec-59d9ed7acc68",
      "at": "2026-10-31T00:04:54.726622Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "76e33c91-bff4-49a1-a24f-1ae7a98d160b"
    },
    {
      "id": "52a611c2-3059-46fd-b3c4-2559ac24fd51",
      "at": "2026-10-31T00:04:48.574226Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "2a3afaa3-e140-4771-8de7-2ab6b356cb06",
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

`POST /api/admin/v1/promotions/95dc4923-1b6c-4258-8bc3-16bdbb6a004c/archive` → **200**

```json
{
  "command_id": "2c50840e-3dc1-435d-a66a-5d629835657a",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "95dc4923-1b6c-4258-8bc3-16bdbb6a004c",
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
  "created_by": "2a3afaa3-e140-4771-8de7-2ab6b356cb06",
  "created_at": "2026-10-31T00:04:47.711263Z",
  "updated_at": "2026-10-31T00:04:58.04333Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d90614c6-4e99-4a6d-9757-18ef63f2da72",
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
  "last_heartbeat_at": "2026-10-31T00:04:53.964727Z",
  "last_location_at": "2026-10-31T00:04:53.964727Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d90614c6-4e99-4a6d-9757-18ef63f2da72/close` → **200**

```json
{
  "command_id": "5f239ffa-2ef2-4441-8f3c-6f355a020b30",
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

Done: order 76e33c91-bff4-49a1-a24f-1ae7a98d160b.

# Scenario: broadcast-abuse

## Anna goes online in Warsaw

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000002",
  "device_ref": "sandbox-5819"
}
```

```json
{
  "challenge_id": "565f3847-2f55-4d5e-98c6-db01770b3b79",
  "expires_at": "2026-10-31T00:09:58.670377797Z",
  "resend_available_at": "2026-10-31T00:04:59.670377797Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000002` → **200**

```json
{
  "phone": "+48500000002",
  "audience": "DRIVER",
  "code": "485785",
  "sent_at": "2026-10-31T00:04:58.675415775Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "565f3847-2f55-4d5e-98c6-db01770b3b79",
  "code": "485785",
  "device_ref": "sandbox-5819"
}
```

```json
{
  "session_id": "416526f8-d6c1-4faa-a6bd-b8248119864c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000405"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDUiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwNTk5OCwiaWF0IjoxNzkzNDA1MDk4LCJqdGkiOiJiMWFjZGI2ZS1jYTMxLTRlNGItYjMwNi02ZjUxMjBmNGM3MGQiLCJzaWQiOiI0MTY1MjZmOC1kNmMxLTRmYWEtYTZiZC1iODI0ODExOTg2NGMifQ.7EdmOTunvCsIdQuP1-7vIrrVqjk2DPGGoG8OZeuLQIU",
  "access_expires_at": "2026-10-31T00:19:58.896547637Z",
  "refresh_token": "EZGmI1EDgQs1EWTD92-hFcPufiYqzh6T0Azqj0_IU6M",
  "refresh_expires_at": "2026-11-30T00:04:58.896071584Z",
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
  "command_id": "5f05feaf-4a1a-4680-8ce3-1a613b6f563c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000505",
  "location": {
    "lat": 52.2297,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T00:04:59Z",
    "sequence": 1793405099486
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "aaf0d754-de41-4d2c-a568-09ff8a4e5412",
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
  "last_heartbeat_at": "2026-10-31T00:04:59.503596Z",
  "last_location_at": "2026-10-31T00:04:59.503596Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## 5 seconds later her phone reports Lviv: not taken as her position

`POST /api/driver/v1/work-sessions/aaf0d754-de41-4d2c-a568-09ff8a4e5412/heartbeat` → **200**

```json
{
  "location": {
    "lat": 49.8397,
    "lon": 24.0297,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T00:05:04Z",
    "sequence": 1793405104708
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "aaf0d754-de41-4d2c-a568-09ff8a4e5412",
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
  "last_heartbeat_at": "2026-10-31T00:05:04.725444Z",
  "last_location_at": "2026-10-31T00:04:59.503596Z",
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
  "session_id": "5ee4b6e1-d9bb-4a15-a5f1-b2de3680f662",
  "subject": {
    "type": "STAFF",
    "id": "2a3afaa3-e140-4771-8de7-2ab6b356cb06"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYTNhZmFhMy1lMTQwLTQ3NzEtOGRlNy0yYWI2YjM1NmNiMDYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDYwMDUsImlhdCI6MTc5MzQwNTEwNSwianRpIjoiYzc2MWI4ZDctMTgyNi00OTM5LTkyZDQtMTk4Y2NmYzc4ZTZmIiwic2lkIjoiNWVlNGI2ZTEtZDliYi00YTE1LWE1ZjEtYjJkZTM2ODBmNjYyIn0.9_jPOPQkCDjCTbB9XBRHRkca0MPUVQ0UPzifdxkRGcI",
  "access_expires_at": "2026-10-31T00:20:05.14311104Z",
  "refresh_token": "S7CXtvGZ9ZXQZNPGaPvrqV8uYZzFRNgBO0dsz1dPB3c",
  "refresh_expires_at": "2026-10-31T12:05:05.142720142Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "at": "2026-10-31T00:05:05.333379625Z",
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
      "last_location_at": "2026-10-31T00:04:59.503596Z",
      "last_heartbeat_at": "2026-10-31T00:05:04.725444Z",
      "order_id": null
    }
  ]
}
```

## A fix next to the last accepted one is taken again

`POST /api/driver/v1/work-sessions/aaf0d754-de41-4d2c-a568-09ff8a4e5412/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2299,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T00:05:05Z",
    "sequence": 1793405105542
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "aaf0d754-de41-4d2c-a568-09ff8a4e5412",
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
  "last_heartbeat_at": "2026-10-31T00:05:05.559669Z",
  "last_location_at": "2026-10-31T00:05:05.559669Z",
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
  "session_id": "aaf0d754-de41-4d2c-a568-09ff8a4e5412",
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
  "last_heartbeat_at": "2026-10-31T00:05:05.559669Z",
  "last_location_at": "2026-10-31T00:05:05.559669Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/aaf0d754-de41-4d2c-a568-09ff8a4e5412/close` → **200**

```json
{
  "command_id": "eee3e963-fe48-4b64-9ae9-bd324be493b5",
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
  "device_ref": "sandbox-7037"
}
```

```json
{
  "challenge_id": "a7330ef2-d131-4e97-807c-5176402e2edd",
  "expires_at": "2026-10-31T00:10:06.184356909Z",
  "resend_available_at": "2026-10-31T00:05:07.184356909Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "113255",
  "sent_at": "2026-10-31T00:05:06.193740279Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a7330ef2-d131-4e97-807c-5176402e2edd",
  "code": "113255",
  "device_ref": "sandbox-7037"
}
```

```json
{
  "session_id": "939624ae-175f-4c81-9309-0992c8fa1115",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwNjAwNiwiaWF0IjoxNzkzNDA1MTA2LCJqdGkiOiJhZWJlM2NlYS1mYjQ5LTQ5NWUtYjdiNC1hOGM0YTk5Njk2NjUiLCJzaWQiOiI5Mzk2MjRhZS0xNzVmLTRjODEtOTMwOS0wOTkyYzhmYTExMTUifQ.j7hWIL0U4UcBGVI6ckWjbjXiez12g60T5B1Z6WsK6Y0",
  "access_expires_at": "2026-10-31T00:20:06.435081431Z",
  "refresh_token": "R9X2EHVYwZmGekpshr1t4PUlXZk9yX68IK5XwyE_3BQ",
  "refresh_expires_at": "2026-11-30T00:05:06.434590753Z",
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
  "device_ref": "sandbox-8948"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "10690773-d47a-43ac-8d5a-ec35406a52f1",
  "retryable": true,
  "retry_after_seconds": 1
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000001",
  "device_ref": "sandbox-8948"
}
```

```json
{
  "challenge_id": "43ee7dfa-ad9c-4c52-9ab1-999491bf9117",
  "expires_at": "2026-10-31T00:10:08.031576627Z",
  "resend_available_at": "2026-10-31T00:05:09.031576627Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "095487",
  "sent_at": "2026-10-31T00:05:08.0337831Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "43ee7dfa-ad9c-4c52-9ab1-999491bf9117",
  "code": "095487",
  "device_ref": "sandbox-8948"
}
```

```json
{
  "session_id": "2a818a8a-e6cf-4c77-b3d4-5115c47e005d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwNjAwOCwiaWF0IjoxNzkzNDA1MTA4LCJqdGkiOiJiNjY5N2YyZC1mNWUwLTQwYjYtOTBlOC0yMWIxZmVmNzUwZGQiLCJzaWQiOiIyYTgxOGE4YS1lNmNmLTRjNzctYjNkNC01MTE1YzQ3ZTAwNWQifQ.meCQJj71UuiXTVuh0MOjy1QhFwb09Sg-v4t4pjY_QBY",
  "access_expires_at": "2026-10-31T00:20:08.258448119Z",
  "refresh_token": "xJhjZ021PzhP-uWyOrScAwHqtWX2YsggiX8acgrQ1iU",
  "refresh_expires_at": "2026-11-30T00:05:08.257995007Z",
  "account_created": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000002",
  "device_ref": "sandbox-26407"
}
```

```json
{
  "challenge_id": "9cbafeb7-7553-4f01-8394-b115154e234b",
  "expires_at": "2026-10-31T00:10:08.455246361Z",
  "resend_available_at": "2026-10-31T00:05:09.455246361Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000002` → **200**

```json
{
  "phone": "+48500000002",
  "audience": "DRIVER",
  "code": "853573",
  "sent_at": "2026-10-31T00:05:08.457369208Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9cbafeb7-7553-4f01-8394-b115154e234b",
  "code": "853573",
  "device_ref": "sandbox-26407"
}
```

```json
{
  "session_id": "5cef9694-1609-4e2b-b72a-5c19e417532b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000405"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDUiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwNjAwOCwiaWF0IjoxNzkzNDA1MTA4LCJqdGkiOiI3MjFjMWM4MS0xODkyLTQ5MmEtYTdiOC0yNzRkMjQyYjliYTkiLCJzaWQiOiI1Y2VmOTY5NC0xNjA5LTRlMmItYjcyYS01YzE5ZTQxNzUzMmIifQ.FN1LC0JYdvRoEyKE4ZX5VyBpTZKl5d0HfTy9QLIeoxE",
  "access_expires_at": "2026-10-31T00:20:08.692346861Z",
  "refresh_token": "gS-C1RsNR7uasbjyKbGSuOIu3ojQayF6aOrI-6reZVw",
  "refresh_expires_at": "2026-11-30T00:05:08.691843764Z",
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
  "command_id": "e5710643-053f-40d7-a021-88f1705b7609",
  "vehicle_id": "5a000000-0000-4000-8000-000000000505",
  "location": {
    "lat": 52.2297,
    "lon": 21.1700,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T00:08:13Z",
    "sequence": 1793405293337
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "aec7cacc-33b0-42ec-b7ce-313e62fc065d",
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
  "last_heartbeat_at": "2026-10-31T00:08:13.35394Z",
  "last_location_at": "2026-10-31T00:08:13.35394Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders: nobody is near, the order goes to the ALL tab

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600607996",
  "device_ref": "sandbox-11185"
}
```

```json
{
  "challenge_id": "88c5474f-4aac-4e28-8c08-bfd2ea70499c",
  "expires_at": "2026-10-31T00:13:13.552594338Z",
  "resend_available_at": "2026-10-31T00:08:14.552594338Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600607996` → **200**

```json
{
  "phone": "+48600607996",
  "audience": "CLIENT",
  "code": "500736",
  "sent_at": "2026-10-31T00:08:13.5547603Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "88c5474f-4aac-4e28-8c08-bfd2ea70499c",
  "code": "500736",
  "device_ref": "sandbox-11185"
}
```

```json
{
  "session_id": "431d3dd9-677f-4f38-82b2-0780712582ee",
  "subject": {
    "type": "CLIENT",
    "id": "01ecc88e-1eee-49a1-8387-384174741c03"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMWVjYzg4ZS0xZWVlLTQ5YTEtODM4Ny0zODQxNzQ3NDFjMDMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDA2MTkzLCJpYXQiOjE3OTM0MDUyOTMsImp0aSI6ImM2MWY2ZjYxLTdjM2QtNDgyNC05ZGFkLTQxMDNmODg2ZjI3YSIsInNpZCI6IjQzMWQzZGQ5LTY3N2YtNGYzOC04MmIyLTA3ODA3MTI1ODJlZSJ9.ubQ6lrwzA7emiXgQ9W6zb6asPGKz_JmIZKoJB3kv1Lw",
  "access_expires_at": "2026-10-31T00:23:13.767746082Z",
  "refresh_token": "BO0-G0yu3yReYkNRmPJExv6Vw8wUBDxOW3N9MFBusG8",
  "refresh_expires_at": "2026-11-30T00:08:13.767281448Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "76914c17-1a07-4d9a-8237-8c94d9fe2e91",
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
  "id": "402eed0d-2851-4ef7-bc07-8876c10657db",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 4942,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T00:13:13.966350Z",
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
  "command_id": "9d890f0b-7cc4-4f18-9a17-5c92c0923d7e",
  "quote_id": "402eed0d-2851-4ef7-bc07-8876c10657db",
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
  "id": "768974d7-d61c-40d7-9c6c-2ab60e2eb9d9",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "01ecc88e-1eee-49a1-8387-384174741c03",
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
  "created_at": "2026-10-31T00:08:14.173745Z",
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

`GET /api/rider/v1/orders/768974d7-d61c-40d7-9c6c-2ab60e2eb9d9` → **200**

```json
{
  "id": "768974d7-d61c-40d7-9c6c-2ab60e2eb9d9",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "01ecc88e-1eee-49a1-8387-384174741c03",
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
  "created_at": "2026-10-31T00:08:14.173745Z",
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

## Anna, 10 km away, does not see it, and her claim is refused: the order stays in the ALL tab

`GET /api/driver/v1/broadcast-orders` → **200**

```json
[]
```

`POST /api/driver/v1/orders/768974d7-d61c-40d7-9c6c-2ab60e2eb9d9/claim` → **422**

```json
{
  "command_id": "41102446-bb50-4ff8-9f49-3a58f1d57d2a"
}
```

```json
{
  "instance": "/api/driver/v1/orders/768974d7-d61c-40d7-9c6c-2ab60e2eb9d9/claim",
  "status": 422,
  "title": "Pickup too far",
  "type": "https://errors.blizz.taxi/pickup-too-far",
  "code": "PICKUP_TOO_FAR",
  "correlation_id": "333865c3-50d0-404d-b358-6971f68a8a55"
}
```

`GET /api/rider/v1/orders/768974d7-d61c-40d7-9c6c-2ab60e2eb9d9` → **200**

```json
{
  "id": "768974d7-d61c-40d7-9c6c-2ab60e2eb9d9",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "01ecc88e-1eee-49a1-8387-384174741c03",
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
  "created_at": "2026-10-31T00:08:14.173745Z",
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

## A script on Anna's phone keeps claiming: from the 31st claim in 10 minutes, 429

`POST /api/driver/v1/orders/22593b1d-388a-4a5c-9f56-b0e24b14e800/claim` → **404**

```json
{
  "command_id": "a76f10db-7c0b-487e-8d7d-b6aeaca9a865"
}
```

```json
{
  "instance": "/api/driver/v1/orders/22593b1d-388a-4a5c-9f56-b0e24b14e800/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "1ce0dfc1-15e0-4a69-8321-26cf04f3a444"
}
```

`POST /api/driver/v1/orders/d906445d-ccf5-4975-a646-abb4d51a273a/claim` → **404**

```json
{
  "command_id": "a8352890-c4e4-4cc7-9aa5-572f845f2916"
}
```

```json
{
  "instance": "/api/driver/v1/orders/d906445d-ccf5-4975-a646-abb4d51a273a/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "a15937d1-281d-421e-87f8-4180d8b1bbe9"
}
```

`POST /api/driver/v1/orders/24fda145-cbd0-4e74-9654-551539181a53/claim` → **404**

```json
{
  "command_id": "a8e2c482-ef79-4f15-abfb-52c4ad89b301"
}
```

```json
{
  "instance": "/api/driver/v1/orders/24fda145-cbd0-4e74-9654-551539181a53/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "8a4b81fe-3634-4466-8040-9ab5adaedb9c"
}
```

`POST /api/driver/v1/orders/132b7c16-009e-4c99-bc67-8f140d5420fb/claim` → **404**

```json
{
  "command_id": "b9c940e1-c96c-4c1b-90f9-1a3cb7e09769"
}
```

```json
{
  "instance": "/api/driver/v1/orders/132b7c16-009e-4c99-bc67-8f140d5420fb/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "eb5e4cc1-8a3b-4f68-8cb1-9ea3fc5279e7"
}
```

`POST /api/driver/v1/orders/994bdae7-2a16-4f7d-b921-d8037b99a6da/claim` → **404**

```json
{
  "command_id": "b52dfd78-72d0-45ad-99e3-d1751980fb12"
}
```

```json
{
  "instance": "/api/driver/v1/orders/994bdae7-2a16-4f7d-b921-d8037b99a6da/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "2853c56e-8a23-4e35-97cd-0970960276b9"
}
```

`POST /api/driver/v1/orders/1524026f-679f-41aa-9583-9bfe33722f60/claim` → **404**

```json
{
  "command_id": "67dbc350-fb6d-4a37-b555-4ff62bc9e6b2"
}
```

```json
{
  "instance": "/api/driver/v1/orders/1524026f-679f-41aa-9583-9bfe33722f60/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "13b4262b-778c-4a94-a149-f40f0930282e"
}
```

`POST /api/driver/v1/orders/a502ba7f-85e3-4fc3-96e6-aeb1ec5eda81/claim` → **404**

```json
{
  "command_id": "f5382711-a6b2-4eee-bdc4-996626f97a0d"
}
```

```json
{
  "instance": "/api/driver/v1/orders/a502ba7f-85e3-4fc3-96e6-aeb1ec5eda81/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "d07d8844-8ff3-4d89-b9e1-cf5a47f9cfab"
}
```

`POST /api/driver/v1/orders/08b97ceb-d348-428e-8345-83446410e803/claim` → **404**

```json
{
  "command_id": "ce4be4e0-a510-4559-bd34-3949c2e2f46f"
}
```

```json
{
  "instance": "/api/driver/v1/orders/08b97ceb-d348-428e-8345-83446410e803/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "b873feed-cc14-440f-ba23-b36863df5b8f"
}
```

`POST /api/driver/v1/orders/23a25d54-66f1-464b-89d1-443d4843cd2c/claim` → **404**

```json
{
  "command_id": "6c23b076-2e06-4b3a-998a-cdbad49ab3a6"
}
```

```json
{
  "instance": "/api/driver/v1/orders/23a25d54-66f1-464b-89d1-443d4843cd2c/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "ec7543a5-ec70-4b20-befd-c5e14e96b0ad"
}
```

`POST /api/driver/v1/orders/e6f46ec2-9eae-4d3c-bb80-b3c00875cc77/claim` → **404**

```json
{
  "command_id": "481d9f31-f81d-4aec-8a87-4653fdc64abb"
}
```

```json
{
  "instance": "/api/driver/v1/orders/e6f46ec2-9eae-4d3c-bb80-b3c00875cc77/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "50259000-9bb6-4a60-bb30-cb6fc99fe1e0"
}
```

`POST /api/driver/v1/orders/bf422646-4c93-451d-944c-58aa21ba656a/claim` → **404**

```json
{
  "command_id": "8cd786ca-7094-4603-a8c0-b1f26654a5cf"
}
```

```json
{
  "instance": "/api/driver/v1/orders/bf422646-4c93-451d-944c-58aa21ba656a/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "6e4d3750-fc18-48c3-895b-9d510067a227"
}
```

`POST /api/driver/v1/orders/ac54e517-57f0-4825-930a-d19901656350/claim` → **404**

```json
{
  "command_id": "f4873952-bf73-462c-b0e7-80a9410ea41d"
}
```

```json
{
  "instance": "/api/driver/v1/orders/ac54e517-57f0-4825-930a-d19901656350/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "ae0f8f17-d63b-4c2c-8d31-86ff6de41c0b"
}
```

`POST /api/driver/v1/orders/40abbd80-1eea-4139-8ad2-0119b223a3d0/claim` → **404**

```json
{
  "command_id": "aca1d00a-c505-48ca-8742-5d1b65492e45"
}
```

```json
{
  "instance": "/api/driver/v1/orders/40abbd80-1eea-4139-8ad2-0119b223a3d0/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "9efaed7d-769a-41e2-a5e0-ca833a06e695"
}
```

`POST /api/driver/v1/orders/a6135bd5-01f4-4146-acfd-ae68a69aadd8/claim` → **404**

```json
{
  "command_id": "0bb32b11-89a1-4e92-83a1-2f383537cf86"
}
```

```json
{
  "instance": "/api/driver/v1/orders/a6135bd5-01f4-4146-acfd-ae68a69aadd8/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "d31910df-0e1e-43f7-bf15-151786b59b40"
}
```

`POST /api/driver/v1/orders/a58e749f-df9b-4abb-b7d8-03262c60ad34/claim` → **404**

```json
{
  "command_id": "befbf9e4-3e16-480a-9adc-9704750ba93f"
}
```

```json
{
  "instance": "/api/driver/v1/orders/a58e749f-df9b-4abb-b7d8-03262c60ad34/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "72af42bc-1b8c-4a07-98ac-f9f16c32152f"
}
```

`POST /api/driver/v1/orders/89bfa7eb-62c5-4c05-8946-ea6454e32695/claim` → **404**

```json
{
  "command_id": "64a18b31-b45a-41fb-b311-b6c90a9db33f"
}
```

```json
{
  "instance": "/api/driver/v1/orders/89bfa7eb-62c5-4c05-8946-ea6454e32695/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "8be3a6a9-3169-4c25-8835-4ce68e0ecccc"
}
```

`POST /api/driver/v1/orders/8c670d0c-9a97-448c-af19-ae72e3fc4fb2/claim` → **404**

```json
{
  "command_id": "8fcc417c-98d8-4640-9f9a-565337f92678"
}
```

```json
{
  "instance": "/api/driver/v1/orders/8c670d0c-9a97-448c-af19-ae72e3fc4fb2/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "e25a1276-2783-4601-b4ac-78d945b09380"
}
```

`POST /api/driver/v1/orders/bedb11e3-6f69-4280-a8b8-d75fc2fb8760/claim` → **404**

```json
{
  "command_id": "687bfa1f-8934-4b1b-83fb-198dea2ab754"
}
```

```json
{
  "instance": "/api/driver/v1/orders/bedb11e3-6f69-4280-a8b8-d75fc2fb8760/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "001b5189-304b-41f8-9e08-3a7fc2543f26"
}
```

`POST /api/driver/v1/orders/b4753e76-eff8-404f-99df-9219010f8795/claim` → **404**

```json
{
  "command_id": "73b20585-a388-46f1-bbbe-c9893f34c036"
}
```

```json
{
  "instance": "/api/driver/v1/orders/b4753e76-eff8-404f-99df-9219010f8795/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "49e43d74-67c4-4b11-8cd3-7daffaa94498"
}
```

`POST /api/driver/v1/orders/d0e8bf26-4115-41aa-b7f1-fe6cbc250394/claim` → **404**

```json
{
  "command_id": "52291130-c805-4010-9b7b-1a7de2d53dd6"
}
```

```json
{
  "instance": "/api/driver/v1/orders/d0e8bf26-4115-41aa-b7f1-fe6cbc250394/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "77b2a67a-6c0a-40b8-9fa8-a8fd1129820b"
}
```

`POST /api/driver/v1/orders/8329756a-1fd7-491d-a721-6e58a5bbd723/claim` → **404**

```json
{
  "command_id": "bff773f7-021a-4124-963a-8530a3902b35"
}
```

```json
{
  "instance": "/api/driver/v1/orders/8329756a-1fd7-491d-a721-6e58a5bbd723/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "ac4230e2-f8f9-44f7-99ac-0fb95845b757"
}
```

`POST /api/driver/v1/orders/125b3102-f811-41b4-823b-313d53512d74/claim` → **404**

```json
{
  "command_id": "c697531e-43ab-42c9-a8dd-d3c1f827d034"
}
```

```json
{
  "instance": "/api/driver/v1/orders/125b3102-f811-41b4-823b-313d53512d74/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "8b28f708-7e80-4f24-a343-b7f875ef419c"
}
```

`POST /api/driver/v1/orders/d834bb1a-977d-4315-b006-20ce49a08ca0/claim` → **404**

```json
{
  "command_id": "43e49fab-aeeb-4862-b0f3-a6962954bcdb"
}
```

```json
{
  "instance": "/api/driver/v1/orders/d834bb1a-977d-4315-b006-20ce49a08ca0/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "5364f6b2-f620-4fe4-a7bb-0fea1e7ce518"
}
```

`POST /api/driver/v1/orders/915704bb-2048-45e6-998a-787c8a5dfd9d/claim` → **404**

```json
{
  "command_id": "5939e3c4-1bf4-44c0-85fa-867d4cc39693"
}
```

```json
{
  "instance": "/api/driver/v1/orders/915704bb-2048-45e6-998a-787c8a5dfd9d/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "63affdfd-74eb-46c6-af80-260cf4266043"
}
```

`POST /api/driver/v1/orders/6318e74c-0e0c-4460-9218-73ed6279b3b5/claim` → **404**

```json
{
  "command_id": "91c412ae-62e1-4b3f-990c-c4c3ab931bfd"
}
```

```json
{
  "instance": "/api/driver/v1/orders/6318e74c-0e0c-4460-9218-73ed6279b3b5/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "0d04caf3-5851-4adb-8fe8-654efe8575e8"
}
```

`POST /api/driver/v1/orders/824ffddf-963a-4ca1-80cb-b1fa071604a4/claim` → **404**

```json
{
  "command_id": "ca1402a2-c846-4fb3-9ade-8604f0d9d951"
}
```

```json
{
  "instance": "/api/driver/v1/orders/824ffddf-963a-4ca1-80cb-b1fa071604a4/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "71de3ebb-7800-4c0a-86d6-8393e476b690"
}
```

`POST /api/driver/v1/orders/bfff28bf-f4ac-4570-bc28-13caf8039367/claim` → **404**

```json
{
  "command_id": "c3938ba4-89ca-4e97-ac4f-7284f11cf5f0"
}
```

```json
{
  "instance": "/api/driver/v1/orders/bfff28bf-f4ac-4570-bc28-13caf8039367/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "154690db-a512-4add-8650-3033a736aff3"
}
```

`POST /api/driver/v1/orders/de1bf9b4-5c89-4947-96d6-7f23c17a5eaf/claim` → **404**

```json
{
  "command_id": "56144eaa-7bfd-4869-8977-1897c58461b9"
}
```

```json
{
  "instance": "/api/driver/v1/orders/de1bf9b4-5c89-4947-96d6-7f23c17a5eaf/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "9cf4c320-18a6-4b55-a141-5f1431550124"
}
```

`POST /api/driver/v1/orders/8a71ad95-b9c5-4f08-98cf-97c361cad641/claim` → **404**

```json
{
  "command_id": "69dc6d11-c9c1-46e6-a225-f3fe5be7dfda"
}
```

```json
{
  "instance": "/api/driver/v1/orders/8a71ad95-b9c5-4f08-98cf-97c361cad641/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "0a79f0ee-3509-4876-8caf-00f221913814"
}
```

`POST /api/driver/v1/orders/3eb08e75-fee7-4b43-b004-ca3bc96036f9/claim` → **429**

```json
{
  "command_id": "ea8d5ff2-559d-41c3-8788-32e5bb3e87b6"
}
```

```json
{
  "instance": "/api/driver/v1/orders/3eb08e75-fee7-4b43-b004-ca3bc96036f9/claim",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "76bdd4d2-b4e7-4e3f-bb1a-c7bdf346be21",
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
  "command_id": "89b22a7e-c7bf-4870-8e53-9de09ef8b1d2",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T00:08:21Z",
    "sequence": 1793405301441
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "977b5c37-1a96-453a-a7ab-44e9c2d5b2cb",
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
  "last_heartbeat_at": "2026-10-31T00:08:21.456965Z",
  "last_location_at": "2026-10-31T00:08:21.456965Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/broadcast-orders` → **200**

```json
[
  {
    "order_id": "768974d7-d61c-40d7-9c6c-2ab60e2eb9d9",
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

`POST /api/driver/v1/orders/768974d7-d61c-40d7-9c6c-2ab60e2eb9d9/claim` → **409**

```json
{
  "command_id": "6d8a2591-5853-4ec0-823d-903cddc53b85"
}
```

```json
{
  "instance": "/api/driver/v1/orders/768974d7-d61c-40d7-9c6c-2ab60e2eb9d9/claim",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "d154e361-fcb5-4b5f-82b2-43ebb6b15253"
}
```

`POST /api/driver/v1/orders/768974d7-d61c-40d7-9c6c-2ab60e2eb9d9/claim` → **200**

```json
{
  "command_id": "ff9e32e1-adbd-4b7d-9729-da28a4076b92"
}
```

```json
{
  "id": "c6d499ff-b6fe-4914-bb1c-56884d15fee7",
  "order_id": "768974d7-d61c-40d7-9c6c-2ab60e2eb9d9",
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "source": "BROADCAST",
  "state": "COMMITTED",
  "trip_id": "5a17c826-e17e-419f-b84b-824382205a7a",
  "trip_phase": "TO_PICKUP"
}
```

## Piotr cancels at the rider's request (sandbox clean-up)

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "5a17c826-e17e-419f-b84b-824382205a7a",
  "order_id": "768974d7-d61c-40d7-9c6c-2ab60e2eb9d9",
  "assignment_id": "c6d499ff-b6fe-4914-bb1c-56884d15fee7",
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
  "recipient": null,
  "comment": null,
  "entrance": null
}
```

`POST /api/driver/v1/trips/5a17c826-e17e-419f-b84b-824382205a7a/cancel` → **200**

```json
{
  "command_id": "f7469432-7f5a-4f70-ab2c-91e96b2f591e",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "5a17c826-e17e-419f-b84b-824382205a7a",
  "order_id": "768974d7-d61c-40d7-9c6c-2ab60e2eb9d9",
  "assignment_id": "c6d499ff-b6fe-4914-bb1c-56884d15fee7",
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
  "recipient": null,
  "comment": null,
  "entrance": null
}
```

Done: far claim 422, the 31st claim 429, the phone without the shift 409, the phone with it took the order.

`GET /api/rider/v1/orders/768974d7-d61c-40d7-9c6c-2ab60e2eb9d9` → **200**

```json
{
  "id": "768974d7-d61c-40d7-9c6c-2ab60e2eb9d9",
  "short_number": 4,
  "status": "CANCELLED",
  "status_reason": "PASSENGER_ASKED",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "01ecc88e-1eee-49a1-8387-384174741c03",
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
    "id": "c6d499ff-b6fe-4914-bb1c-56884d15fee7",
    "order_id": "768974d7-d61c-40d7-9c6c-2ab60e2eb9d9",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "vehicle_id": "5a000000-0000-4000-8000-000000000504",
    "source": "BROADCAST",
    "state": "RELEASED",
    "trip_id": "5a17c826-e17e-419f-b84b-824382205a7a",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-31T00:08:14.173745Z",
  "cancellation": {
    "by": "DRIVER",
    "reason_code": "PASSENGER_ASKED",
    "reason_labels": {
      "en": "Passenger asked to cancel",
      "ru": "Пассажир попросил отменить",
      "pl": "Pasażer poprosił o anulowanie",
      "uk": "Пасажир попросив скасувати"
    }
  },
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

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "aec7cacc-33b0-42ec-b7ce-313e62fc065d",
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
  "last_heartbeat_at": "2026-10-31T00:08:13.35394Z",
  "last_location_at": "2026-10-31T00:08:13.35394Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/aec7cacc-33b0-42ec-b7ce-313e62fc065d/close` → **200**

```json
{
  "command_id": "714f74ac-6444-4e18-9d82-2c1bdf870be5",
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
  "session_id": "977b5c37-1a96-453a-a7ab-44e9c2d5b2cb",
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
  "last_heartbeat_at": "2026-10-31T00:08:21.456965Z",
  "last_location_at": "2026-10-31T00:08:21.456965Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/977b5c37-1a96-453a-a7ab-44e9c2d5b2cb/close` → **200**

```json
{
  "command_id": "4259041f-dead-40b7-ac4c-809cdf7808ce",
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
  "session_id": "bef1c36a-8606-4248-a58c-29d8c091bfd9",
  "subject": {
    "type": "STAFF",
    "id": "2a3afaa3-e140-4771-8de7-2ab6b356cb06"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYTNhZmFhMy1lMTQwLTQ3NzEtOGRlNy0yYWI2YjM1NmNiMDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDYyMDMsImlhdCI6MTc5MzQwNTMwMywianRpIjoiOGQ2YjkxMjEtMzA1Mi00NmJiLTllMWEtZDQyYzI2NTUwN2JiIiwic2lkIjoiYmVmMWMzNmEtODYwNi00MjQ4LWE1OGMtMjlkOGMwOTFiZmQ5In0.NGxqW-XyiId0KBgA_jaUr_vgnSkOlC6JnSl8vMosZxY",
  "access_expires_at": "2026-10-31T00:23:23.868170632Z",
  "refresh_token": "kUhHyRDam5AxHBxLjyxsdhNnf5_OAEmGu7LAVfmyHps",
  "refresh_expires_at": "2026-10-31T12:08:23.86779757Z",
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
  "command_id": "d59d8f37-71de-464d-93a1-3883b97dafff",
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
  "session_id": "d4198277-70a7-4c2f-8813-17fc3c84c291",
  "subject": {
    "type": "STAFF",
    "id": "2a3afaa3-e140-4771-8de7-2ab6b356cb06"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYTNhZmFhMy1lMTQwLTQ3NzEtOGRlNy0yYWI2YjM1NmNiMDYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDYyMDQsImlhdCI6MTc5MzQwNTMwNCwianRpIjoiMjk1ODZiM2UtYzk1Yi00ZjNjLWFiZjItZDRlY2EwNDUxYmUyIiwic2lkIjoiZDQxOTgyNzctNzBhNy00YzJmLTg4MTMtMTdmYzNjODRjMjkxIn0.8DI2XjVfsQXBI6oVy62LCG_lR3o84pYytQexI9V53dk",
  "access_expires_at": "2026-10-31T00:23:24.660622638Z",
  "refresh_token": "56G0GBR3Wiq8K7PyWfkHNrFYmIxsUmvxLGzO9t1bIOg",
  "refresh_expires_at": "2026-10-31T12:08:24.660231489Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.2424515636",
    "linkedid": "1730052700.2424515636",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380672264024"
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
    "id": "1730052700.2424515636",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "d99cb12a-d1d6-463f-a1e4-8393cc46fd26",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380672264024",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-31T00:08:24.85747Z",
      "answered_at": null,
      "ended_at": "2026-10-31T00:08:24.877256Z",
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
    "id": "1730052600.3206528575",
    "linkedid": "1730052600.3206528575",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380672264024"
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
      "id": "663776be-489a-45c7-9fbe-3fe80d034ba1",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380672264024",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-31T00:08:25.101826Z",
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

`POST /api/operator/v1/calls/663776be-489a-45c7-9fbe-3fe80d034ba1/answer` → **200**

```json
{
  "command_id": "03cfcd8e-b904-4d6a-909c-ca76902f96fb"
}
```

```json
{
  "id": "663776be-489a-45c7-9fbe-3fe80d034ba1",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380672264024",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "2a3afaa3-e140-4771-8de7-2ab6b356cb06",
  "order_ids": [],
  "started_at": "2026-10-31T00:08:25.101826Z",
  "answered_at": "2026-10-31T00:08:25.326219Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.3206528575",
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
    "id": "1730052600.3206528575",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "663776be-489a-45c7-9fbe-3fe80d034ba1",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672264024",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "2a3afaa3-e140-4771-8de7-2ab6b356cb06",
      "order_ids": [],
      "started_at": "2026-10-31T00:08:25.101826Z",
      "answered_at": "2026-10-31T00:08:25.326219Z",
      "ended_at": "2026-10-31T00:08:25.537689Z",
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
      "id": "663776be-489a-45c7-9fbe-3fe80d034ba1",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672264024",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "2a3afaa3-e140-4771-8de7-2ab6b356cb06",
      "order_ids": [],
      "started_at": "2026-10-31T00:08:25.101826Z",
      "answered_at": "2026-10-31T00:08:25.326219Z",
      "ended_at": "2026-10-31T00:08:25.537689Z",
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
      "id": "663776be-489a-45c7-9fbe-3fe80d034ba1",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672264024",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "2a3afaa3-e140-4771-8de7-2ab6b356cb06",
      "order_ids": [],
      "started_at": "2026-10-31T00:08:25.101826Z",
      "answered_at": "2026-10-31T00:08:25.326219Z",
      "ended_at": "2026-10-31T00:08:25.537689Z",
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
      "id": "663776be-489a-45c7-9fbe-3fe80d034ba1",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672264024",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "2a3afaa3-e140-4771-8de7-2ab6b356cb06",
      "order_ids": [],
      "started_at": "2026-10-31T00:08:25.101826Z",
      "answered_at": "2026-10-31T00:08:25.326219Z",
      "ended_at": "2026-10-31T00:08:25.537689Z",
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
      "id": "663776be-489a-45c7-9fbe-3fe80d034ba1",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672264024",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "2a3afaa3-e140-4771-8de7-2ab6b356cb06",
      "order_ids": [],
      "started_at": "2026-10-31T00:08:25.101826Z",
      "answered_at": "2026-10-31T00:08:25.326219Z",
      "ended_at": "2026-10-31T00:08:25.537689Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-31T00:08:32.438004Z"
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
      "id": "663776be-489a-45c7-9fbe-3fe80d034ba1",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672264024",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "2a3afaa3-e140-4771-8de7-2ab6b356cb06",
      "order_ids": [],
      "started_at": "2026-10-31T00:08:25.101826Z",
      "answered_at": "2026-10-31T00:08:25.326219Z",
      "ended_at": "2026-10-31T00:08:25.537689Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-31T00:08:32.438004Z"
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

`GET /api/operator/v1/calls/663776be-489a-45c7-9fbe-3fe80d034ba1/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/663776be-489a-45c7-9fbe-3fe80d034ba1/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=663776be-489a-45c7-9fbe-3fe80d034ba1` → **200**

```json
{
  "changes": [
    {
      "id": "51c89d4a-c901-447b-a574-c38d43e79179",
      "occurred_at": "2026-10-31T00:08:34.76534Z",
      "actor_type": "STAFF",
      "actor_id": "2a3afaa3-e140-4771-8de7-2ab6b356cb06",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "663776be-489a-45c7-9fbe-3fe80d034ba1",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"c6cfd463-d2c4-4918-a5f7-a2bb42870c4f\", \"order_ids\": []}",
      "correlation_id": "2aadf462-fe1a-4f82-ac41-a63f700a471b"
    },
    {
      "id": "3568a835-ddba-430a-b2bf-0cf708118dba",
      "occurred_at": "2026-10-31T00:08:34.740697Z",
      "actor_type": "STAFF",
      "actor_id": "2a3afaa3-e140-4771-8de7-2ab6b356cb06",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "663776be-489a-45c7-9fbe-3fe80d034ba1",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"c6cfd463-d2c4-4918-a5f7-a2bb42870c4f\", \"order_ids\": []}",
      "correlation_id": "edffd4fd-98ae-4963-a0bd-002dd5b62af9"
    }
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
```

Done: call 663776be-489a-45c7-9fbe-3fe80d034ba1 recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-6374"
}
```

```json
{
  "challenge_id": "13b6cd9e-24d8-41a3-bb8d-696b2adb604c",
  "expires_at": "2026-10-31T00:13:35.005404361Z",
  "resend_available_at": "2026-10-31T00:08:36.005404361Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "741462",
  "sent_at": "2026-10-31T00:08:35.007606211Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "13b6cd9e-24d8-41a3-bb8d-696b2adb604c",
  "code": "741462",
  "device_ref": "sandbox-6374"
}
```

```json
{
  "session_id": "811525d9-daeb-432b-bc8e-ffd361ddb1ed",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwNjIxNSwiaWF0IjoxNzkzNDA1MzE1LCJqdGkiOiIxYWVhNTBkYS1mMGY4LTQ5NDgtYjY4Yy05NTg0OTcwMThhNmQiLCJzaWQiOiI4MTE1MjVkOS1kYWViLTQzMmItYmM4ZS1mZmQzNjFkZGIxZWQifQ.TpuV2ZCKfJZ49xVgDJr8Wwa9hD5saFQYL8z4Exz1f3g",
  "access_expires_at": "2026-10-31T00:23:35.22062363Z",
  "refresh_token": "_hKAsAIbzoo42tioCEK5qVPb3CN_BVVQaEEtIfGntOs",
  "refresh_expires_at": "2026-11-30T00:08:35.220131219Z",
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
  "command_id": "5441a23c-52ad-4e0a-959e-a11cdccd07a0",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T00:08:35Z",
    "sequence": 1793405315620
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a42eec76-f265-47df-ae77-7e9ed6ac015a",
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
  "last_heartbeat_at": "2026-10-31T00:08:35.635899Z",
  "last_location_at": "2026-10-31T00:08:35.635899Z",
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
  "session_id": "1261d32e-eac4-4545-b495-2cc80e725730",
  "subject": {
    "type": "STAFF",
    "id": "2a3afaa3-e140-4771-8de7-2ab6b356cb06"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYTNhZmFhMy1lMTQwLTQ3NzEtOGRlNy0yYWI2YjM1NmNiMDYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDYyMTYsImlhdCI6MTc5MzQwNTMxNiwianRpIjoiY2NlYmUwZTItYWMwZS00ZTBkLTllYTEtNjI1ZTgzOGVmOGZiIiwic2lkIjoiMTI2MWQzMmUtZWFjNC00NTQ1LWI0OTUtMmNjODBlNzI1NzMwIn0.WYwtuQV-4FaqL07xHrge0D6h4BM3c4IpPTAWvUYcw54",
  "access_expires_at": "2026-10-31T00:23:36.041039087Z",
  "refresh_token": "HFdIdG3O5II3BEABhOWQ3TO9SjckR8kmYDOPQpBTUME",
  "refresh_expires_at": "2026-10-31T12:08:36.040577955Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "09f9a9c2-dbde-49b3-9c0a-58b52aff7cff",
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
  "id": "46a74724-c412-4537-8d7d-eac3b865715b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T00:13:36.241240Z",
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
  "command_id": "8f16dfea-3a07-4af2-b6b4-65f3ca88ee2c",
  "quote_id": "46a74724-c412-4537-8d7d-eac3b865715b",
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
    "phone": "+380673021516"
  }
}
```

```json
{
  "id": "9d8b8a57-2361-4544-934e-4dee5db5c32b",
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
  "created_at": "2026-10-31T00:08:36.479587Z",
  "caller": {
    "name": "Олена",
    "phone": "+380673021516"
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

## Ivan accepts: the caller gets the car and the plate by SMS

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "1c09450b-1466-4782-9329-15090263c85d",
    "order_id": "9d8b8a57-2361-4544-934e-4dee5db5c32b",
    "expires_at": "2026-10-31T00:08:51.482734Z",
    "server_time": "2026-10-31T00:08:36.734467096Z",
    "seconds_left": 14,
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
    "distance_m": 100,
    "price_kind": "FIXED",
    "expected_earnings_minor": 8939,
    "comment": null,
    "entrance": null
  }
]
```

`POST /api/driver/v1/offers/1c09450b-1466-4782-9329-15090263c85d/accept` → **200**

```json
{
  "command_id": "0eace7a2-0e3b-4c02-86c7-79c65e561099"
}
```

```json
{
  "id": "a48443bd-3d68-4880-b607-a2358c990f18",
  "order_id": "9d8b8a57-2361-4544-934e-4dee5db5c32b",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "84aed5bf-3fe3-445e-bb4f-8eafb9d8a32f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380673021516` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380673021516` → **200**

```json
[
  {
    "phone": "+380673021516",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-31T00:08:37.848469971Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380673021516` → **200**

```json
[
  {
    "phone": "+380673021516",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-31T00:08:37.848469971Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380673021516` → **200**

```json
[
  {
    "phone": "+380673021516",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-31T00:08:37.848469971Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "84aed5bf-3fe3-445e-bb4f-8eafb9d8a32f",
  "order_id": "9d8b8a57-2361-4544-934e-4dee5db5c32b",
  "assignment_id": "a48443bd-3d68-4880-b607-a2358c990f18",
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
    "phone": "+380673021516"
  },
  "comment": null,
  "entrance": null
}
```

`POST /api/driver/v1/work-sessions/a42eec76-f265-47df-ae77-7e9ed6ac015a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T00:08:38Z",
    "sequence": 1793405318429
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a42eec76-f265-47df-ae77-7e9ed6ac015a",
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
  "last_heartbeat_at": "2026-10-31T00:08:38.445687Z",
  "last_location_at": "2026-10-31T00:08:38.445687Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/84aed5bf-3fe3-445e-bb4f-8eafb9d8a32f/arrive` → **200**

```json
{
  "command_id": "58bf274b-d069-4041-90c1-471edf0f3a23",
  "expected_version": 0
}
```

```json
{
  "id": "84aed5bf-3fe3-445e-bb4f-8eafb9d8a32f",
  "order_id": "9d8b8a57-2361-4544-934e-4dee5db5c32b",
  "assignment_id": "a48443bd-3d68-4880-b607-a2358c990f18",
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
  "arrived_at": "2026-10-31T00:08:38.656115Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380673021516"
  },
  "comment": null,
  "entrance": null
}
```

`GET /sandbox/v1/sms?phone=%2B380673021516` → **200**

```json
[
  {
    "phone": "+380673021516",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-31T00:08:37.848469971Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380673021516` → **200**

```json
[
  {
    "phone": "+380673021516",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-31T00:08:37.848469971Z"
  },
  {
    "phone": "+380673021516",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-31T00:08:39.854868743Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380673021516` → **200**

```json
[
  {
    "phone": "+380673021516",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-31T00:08:37.848469971Z"
  },
  {
    "phone": "+380673021516",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-31T00:08:39.854868743Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380673021516` → **200**

```json
[
  {
    "phone": "+380673021516",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-31T00:08:37.848469971Z"
  },
  {
    "phone": "+380673021516",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-31T00:08:39.854868743Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/84aed5bf-3fe3-445e-bb4f-8eafb9d8a32f/start` → **200**

```json
{
  "command_id": "eb64f120-2cfe-42a3-aa85-6fb215e2dce3",
  "expected_version": 1
}
```

```json
{
  "id": "84aed5bf-3fe3-445e-bb4f-8eafb9d8a32f",
  "order_id": "9d8b8a57-2361-4544-934e-4dee5db5c32b",
  "assignment_id": "a48443bd-3d68-4880-b607-a2358c990f18",
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
  "arrived_at": "2026-10-31T00:08:38.656115Z",
  "started_at": "2026-10-31T00:08:39.944845Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380673021516"
  },
  "comment": null,
  "entrance": null
}
```

`POST /api/driver/v1/trips/84aed5bf-3fe3-445e-bb4f-8eafb9d8a32f/complete` → **200**

```json
{
  "command_id": "e4174e6a-79ba-4753-810b-8c006c0bc4e5",
  "expected_version": 2,
  "reported_at": "2026-10-31T00:08:40Z",
  "cash_received": true
}
```

```json
{
  "id": "84aed5bf-3fe3-445e-bb4f-8eafb9d8a32f",
  "order_id": "9d8b8a57-2361-4544-934e-4dee5db5c32b",
  "assignment_id": "a48443bd-3d68-4880-b607-a2358c990f18",
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
  "arrived_at": "2026-10-31T00:08:38.656115Z",
  "started_at": "2026-10-31T00:08:39.944845Z",
  "completed_at": "2026-10-31T00:08:40.149414Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null,
  "comment": null,
  "entrance": null
}
```

Done: two SMS to the caller of a phone order.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a42eec76-f265-47df-ae77-7e9ed6ac015a",
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
  "last_heartbeat_at": "2026-10-31T00:08:38.445687Z",
  "last_location_at": "2026-10-31T00:08:38.445687Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a42eec76-f265-47df-ae77-7e9ed6ac015a/close` → **200**

```json
{
  "command_id": "f0336ed0-8bd8-4c8d-8bf5-e1e1695c69cb",
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
  "phone": "+380633346632",
  "device_ref": "sandbox-15076"
}
```

```json
{
  "challenge_id": "b12c2741-404c-4e58-84d8-0943d8c60a69",
  "expires_at": "2026-10-31T00:13:40.76404182Z",
  "resend_available_at": "2026-10-31T00:08:41.76404182Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380633346632` → **200**

```json
{
  "phone": "+380633346632",
  "audience": "CLIENT",
  "code": "680920",
  "sent_at": "2026-10-31T00:08:40.765823904Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b12c2741-404c-4e58-84d8-0943d8c60a69",
  "code": "680920",
  "device_ref": "sandbox-15076"
}
```

```json
{
  "session_id": "8b531bb7-3844-468a-af2c-45a13ba250d6",
  "subject": {
    "type": "CLIENT",
    "id": "be3bb392-6323-4867-bce3-9ba21ddc3d37"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiZTNiYjM5Mi02MzIzLTQ4NjctYmNlMy05YmEyMWRkYzNkMzciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDA2MjIwLCJpYXQiOjE3OTM0MDUzMjAsImp0aSI6ImQyYzcyNmI0LTE5NTMtNDg2Zi04ZTg5LTJkM2E3NTI5MjkyNiIsInNpZCI6IjhiNTMxYmI3LTM4NDQtNDY4YS1hZjJjLTQ1YTEzYmEyNTBkNiJ9.23J5d-Wcdwh7nfBF_fwXoHPlWObdf-AH3CuFkxsKPWE",
  "access_expires_at": "2026-10-31T00:23:40.992405524Z",
  "refresh_token": "LOG2Iv9EudGVZv645a9_IYo35_j-jYwh__Pp7dg1aS0",
  "refresh_expires_at": "2026-11-30T00:08:40.991879838Z",
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
        "en": "Changed my mind",
        "ru": "Передумал ехать",
        "pl": "Zmiana planów",
        "uk": "Передумав їхати"
      },
      "driver_outcome": null
    },
    {
      "code": "WAIT_TOO_LONG",
      "labels": {
        "en": "The wait is too long",
        "ru": "Долго ждать машину",
        "pl": "Zbyt długie oczekiwanie",
        "uk": "Довго чекати авто"
      },
      "driver_outcome": null
    },
    {
      "code": "WRONG_ADDRESS",
      "labels": {
        "en": "Wrong address",
        "ru": "Ошибся адресом",
        "pl": "Błędny adres",
        "uk": "Помилився адресою"
      },
      "driver_outcome": null
    },
    {
      "code": "OTHER_TRANSPORT",
      "labels": {
        "en": "Found other transport",
        "ru": "Уеду на другом транспорте",
        "pl": "Inny transport",
        "uk": "Поїду іншим транспортом"
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
  "device_ref": "sandbox-4361"
}
```

```json
{
  "challenge_id": "19e7bdb3-38d8-4e2c-8bc9-cb91adf69bbd",
  "expires_at": "2026-10-31T00:13:41.39437127Z",
  "resend_available_at": "2026-10-31T00:08:42.39437127Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "521933",
  "sent_at": "2026-10-31T00:08:41.397890261Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "19e7bdb3-38d8-4e2c-8bc9-cb91adf69bbd",
  "code": "521933",
  "device_ref": "sandbox-4361"
}
```

```json
{
  "session_id": "ab6bf3b0-cf19-446c-bf47-bc46842345cb",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwNjIyMSwiaWF0IjoxNzkzNDA1MzIxLCJqdGkiOiI2MzEyM2U1ZS02M2JiLTQ3N2UtOWJhMC1iYWNmNDFkYzA0OTMiLCJzaWQiOiJhYjZiZjNiMC1jZjE5LTQ0NmMtYmY0Ny1iYzQ2ODQyMzQ1Y2IifQ.oFAFltGIhS6GnG5r8A_7SodYjwelJf-U5huN_oeZ83c",
  "access_expires_at": "2026-10-31T00:23:41.615481719Z",
  "refresh_token": "GAHN4xTYjwQF9DTF8IImcsyFUwRTLcDP2PQDvt9sHIU",
  "refresh_expires_at": "2026-11-30T00:08:41.615104972Z",
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
        "en": "Passenger did not show up",
        "ru": "Пассажир не вышел",
        "pl": "Pasażer nie przyszedł",
        "uk": "Пасажир не вийшов"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "PASSENGER_ASKED",
      "labels": {
        "en": "Passenger asked to cancel",
        "ru": "Пассажир попросил отменить",
        "pl": "Pasażer poprosił o anulowanie",
        "uk": "Пасажир попросив скасувати"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "VEHICLE_PROBLEM",
      "labels": {
        "en": "Vehicle problem",
        "ru": "Неисправность автомобиля",
        "pl": "Awaria samochodu",
        "uk": "Несправність автомобіля"
      },
      "driver_outcome": "RETURN_TO_SEARCH"
    },
    {
      "code": "CANNOT_REACH",
      "labels": {
        "en": "Cannot reach the pickup",
        "ru": "Не могу подъехать",
        "pl": "Nie mogę dojechać",
        "uk": "Не можу під'їхати"
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
  "session_id": "a8259cc8-66d4-4f32-91d5-dbdb5eda35d9",
  "subject": {
    "type": "STAFF",
    "id": "2a3afaa3-e140-4771-8de7-2ab6b356cb06"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYTNhZmFhMy1lMTQwLTQ3NzEtOGRlNy0yYWI2YjM1NmNiMDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDYyMjIsImlhdCI6MTc5MzQwNTMyMiwianRpIjoiOWMxY2Y4NzAtNjRkMi00ODliLWFkY2EtNzUzYjQxZDVjZTVlIiwic2lkIjoiYTgyNTljYzgtNjZkNC00ZjMyLTkxZDUtZGJkYjVlZGEzNWQ5In0.DBAGjfesLpLmOte8lpwG9GYOFE-i5HNDsV4tBa3zSmM",
  "access_expires_at": "2026-10-31T00:23:42.220430235Z",
  "refresh_token": "23U8FGKmBhB1_NfXUIbOzdmjubPRoshMCNvplUAVcew",
  "refresh_expires_at": "2026-10-31T12:08:42.220046477Z",
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
  "session_id": "3fde52c2-d3c4-456b-9979-40a9b39f9b93",
  "subject": {
    "type": "STAFF",
    "id": "2a3afaa3-e140-4771-8de7-2ab6b356cb06"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYTNhZmFhMy1lMTQwLTQ3NzEtOGRlNy0yYWI2YjM1NmNiMDYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDYyMjIsImlhdCI6MTc5MzQwNTMyMiwianRpIjoiNWRjM2JmYzgtODkzNS00NzdlLTk3MWYtZDcwNTMyZjI2NTU1Iiwic2lkIjoiM2ZkZTUyYzItZDNjNC00NTZiLTk5NzktNDBhOWIzOWY5YjkzIn0.9hNURrRkZEgn2NRYW1P3_eSXJ6jUhBc_8fGqioF6-jo",
  "access_expires_at": "2026-10-31T00:23:42.623249351Z",
  "refresh_token": "6wbiXxmc552WoDV96BkEH5NXZHzp93WGYq7UPVuJbB0",
  "refresh_expires_at": "2026-10-31T12:08:42.62288972Z",
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
        "en": "Passenger asked",
        "ru": "Пассажир попросил",
        "pl": "Na prośbę pasażera",
        "uk": "Пасажир попросив"
      },
      "driver_outcome": null
    },
    {
      "code": "DUPLICATE",
      "labels": {
        "en": "Duplicate order",
        "ru": "Дубль заказа",
        "pl": "Duplikat zamówienia",
        "uk": "Дубль замовлення"
      },
      "driver_outcome": null
    },
    {
      "code": "NO_CARS",
      "labels": {
        "en": "No cars available",
        "ru": "Нет свободных машин",
        "pl": "Brak wolnych aut",
        "uk": "Немає вільних авто"
      },
      "driver_outcome": null
    },
    {
      "code": "TEST_ORDER",
      "labels": {
        "en": "Test order",
        "ru": "Тестовый заказ",
        "pl": "Zamówienie testowe",
        "uk": "Тестове замовлення"
      },
      "driver_outcome": null
    },
    {
      "code": "OPERATOR_ERROR",
      "labels": {
        "en": "Operator error",
        "ru": "Ошибка оператора",
        "pl": "Błąd operatora",
        "uk": "Помилка оператора"
      },
      "driver_outcome": null
    },
    {
      "code": "VEHICLE_BREAKDOWN",
      "labels": {
        "en": "Vehicle broke down on the way",
        "ru": "Поломка автомобиля в пути",
        "pl": "Awaria auta w trasie",
        "uk": "Поломка автомобіля в дорозі"
      },
      "driver_outcome": null
    },
    {
      "code": "ACCIDENT",
      "labels": {
        "en": "Accident",
        "ru": "ДТП",
        "pl": "Wypadek",
        "uk": "ДТП"
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
  "command_id": "4c5b1cd8-c8b1-481f-82fc-50568b75b5eb",
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
  "id": "23e4d38e-8ab8-4fd5-abfb-209c0b0bcf8e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T00:13:43.025696Z",
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
  "command_id": "34edab6d-9a6c-4569-9ed5-09cc89442cd5",
  "quote_id": "23e4d38e-8ab8-4fd5-abfb-209c0b0bcf8e",
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
  "id": "c792956b-3dab-4667-81a5-56a04529ee66",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "be3bb392-6323-4867-bce3-9ba21ddc3d37",
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
  "created_at": "2026-10-31T00:08:43.236955Z",
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

`GET /api/rider/v1/orders/c792956b-3dab-4667-81a5-56a04529ee66` → **200**

```json
{
  "id": "c792956b-3dab-4667-81a5-56a04529ee66",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "be3bb392-6323-4867-bce3-9ba21ddc3d37",
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
  "created_at": "2026-10-31T00:08:43.236955Z",
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

`POST /api/rider/v1/orders/c792956b-3dab-4667-81a5-56a04529ee66/cancel` → **200**

```json
{
  "command_id": "23044b7f-de66-41b8-bd3d-c59c4d11ad9e",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "c792956b-3dab-4667-81a5-56a04529ee66",
  "short_number": 6,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "be3bb392-6323-4867-bce3-9ba21ddc3d37",
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
  "created_at": "2026-10-31T00:08:43.236955Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "WAIT_TOO_LONG",
    "reason_labels": {
      "en": "The wait is too long",
      "ru": "Долго ждать машину",
      "pl": "Zbyt długie oczekiwanie",
      "uk": "Довго чекати авто"
    }
  },
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
  "command_id": "05b4838b-8f86-4a2c-a5ba-cb7c4b49fb38",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T00:08:44Z",
    "sequence": 1793405324940
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "7e86b75c-f06c-4584-9115-8a52bda4e32f",
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
  "last_heartbeat_at": "2026-10-31T00:08:44.110717Z",
  "last_location_at": "2026-10-31T00:08:44.110717Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-21067"
}
```

```json
{
  "challenge_id": "87a8c01b-1416-486e-a2d8-8a69c30dc951",
  "expires_at": "2026-10-31T00:13:44.308947474Z",
  "resend_available_at": "2026-10-31T00:08:45.308947474Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "212504",
  "sent_at": "2026-10-31T00:08:44.310879924Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "87a8c01b-1416-486e-a2d8-8a69c30dc951",
  "code": "212504",
  "device_ref": "sandbox-21067"
}
```

```json
{
  "session_id": "19ea185c-1808-46e3-b2ff-2503ced4e33f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwNjIyNCwiaWF0IjoxNzkzNDA1MzI0LCJqdGkiOiI0YWY5ZjY0Ny1hNDY2LTQ4ODItYmUxMS05NWM2MzBmNmIyMDciLCJzaWQiOiIxOWVhMTg1Yy0xODA4LTQ2ZTMtYjJmZi0yNTAzY2VkNGUzM2YifQ.tYoKEBPIw1nKkZHrWjjkAiyxwK60h3adSLVTrsQzpzU",
  "access_expires_at": "2026-10-31T00:23:44.524907856Z",
  "refresh_token": "4lyDb8PaRFHYrAV9VtCMWSmN16Dl4f_7eflXBfm4mRE",
  "refresh_expires_at": "2026-11-30T00:08:44.524506381Z",
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
  "command_id": "ed332c83-d476-4081-a973-93fc12bec145",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T00:08:44Z",
    "sequence": 1793405324963
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "c671d153-0317-4a3e-9f0a-6773884c15cf",
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
  "last_heartbeat_at": "2026-10-31T00:08:44.979606Z",
  "last_location_at": "2026-10-31T00:08:44.979606Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e2eb1d77-4b0b-4987-99be-eacb2be0e888",
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
  "id": "d49a2044-e5bb-47f1-8066-69590739ddb0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T00:13:45.185210Z",
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
  "command_id": "8e0cc75b-0951-4dd3-920f-76e43a77d663",
  "quote_id": "d49a2044-e5bb-47f1-8066-69590739ddb0",
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
  "id": "54b197d1-c764-4c92-9016-13282645c610",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "be3bb392-6323-4867-bce3-9ba21ddc3d37",
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
  "created_at": "2026-10-31T00:08:45.391753Z",
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
    "id": "bd155edd-3daf-48e5-b64c-3eb8e603fa27",
    "order_id": "54b197d1-c764-4c92-9016-13282645c610",
    "expires_at": "2026-10-31T00:09:00.393896Z",
    "server_time": "2026-10-31T00:08:45.605629251Z",
    "seconds_left": 14,
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
    "distance_m": 478,
    "price_kind": "FIXED",
    "expected_earnings_minor": 25953,
    "comment": null,
    "entrance": null
  }
]
```

`POST /api/driver/v1/offers/bd155edd-3daf-48e5-b64c-3eb8e603fa27/accept` → **200**

```json
{
  "command_id": "cfaafbe6-c50c-4232-a8e9-f0757dc64f08"
}
```

```json
{
  "id": "2098fa85-0e10-4116-8c4a-beea3f122760",
  "order_id": "54b197d1-c764-4c92-9016-13282645c610",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d12d7a70-7d9d-4cb3-ac3f-2d53dc86e97c",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d12d7a70-7d9d-4cb3-ac3f-2d53dc86e97c",
  "order_id": "54b197d1-c764-4c92-9016-13282645c610",
  "assignment_id": "2098fa85-0e10-4116-8c4a-beea3f122760",
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
  "recipient": null,
  "comment": null,
  "entrance": null
}
```

`POST /api/driver/v1/trips/d12d7a70-7d9d-4cb3-ac3f-2d53dc86e97c/cancel` → **200**

```json
{
  "command_id": "252803ee-8057-454f-9de5-71d1008f9817",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "d12d7a70-7d9d-4cb3-ac3f-2d53dc86e97c",
  "order_id": "54b197d1-c764-4c92-9016-13282645c610",
  "assignment_id": "2098fa85-0e10-4116-8c4a-beea3f122760",
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
  "recipient": null,
  "comment": null,
  "entrance": null
}
```

`GET /api/rider/v1/orders/54b197d1-c764-4c92-9016-13282645c610` → **200**

```json
{
  "id": "54b197d1-c764-4c92-9016-13282645c610",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "be3bb392-6323-4867-bce3-9ba21ddc3d37",
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
  "created_at": "2026-10-31T00:08:45.391753Z",
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
    "at": "2026-10-31T00:08:46.176711Z"
  },
  "comment": null,
  "entrance": null
}
```

## Andrii gets it and cancels: «Пассажир попросил отменить»

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "9dfb917c-efe7-4e23-b690-e882577afb8e",
    "order_id": "54b197d1-c764-4c92-9016-13282645c610",
    "expires_at": "2026-10-31T00:09:01.178865Z",
    "server_time": "2026-10-31T00:08:46.567450961Z",
    "seconds_left": 14,
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
    "distance_m": 1146,
    "price_kind": "FIXED",
    "expected_earnings_minor": 25953,
    "comment": null,
    "entrance": null
  }
]
```

`POST /api/driver/v1/offers/9dfb917c-efe7-4e23-b690-e882577afb8e/accept` → **200**

```json
{
  "command_id": "5cd4f003-0dfc-4163-8eef-7ac809a86cf4"
}
```

```json
{
  "id": "7ec004d5-c311-471b-8e33-bfbd8d3e04c7",
  "order_id": "54b197d1-c764-4c92-9016-13282645c610",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "2a1a99d2-5b3c-43ed-b639-f23644437864",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "2a1a99d2-5b3c-43ed-b639-f23644437864",
  "order_id": "54b197d1-c764-4c92-9016-13282645c610",
  "assignment_id": "7ec004d5-c311-471b-8e33-bfbd8d3e04c7",
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
  "recipient": null,
  "comment": null,
  "entrance": null
}
```

`POST /api/driver/v1/trips/2a1a99d2-5b3c-43ed-b639-f23644437864/cancel` → **200**

```json
{
  "command_id": "6c4df955-93fa-40e2-8bda-c2092a420068",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "2a1a99d2-5b3c-43ed-b639-f23644437864",
  "order_id": "54b197d1-c764-4c92-9016-13282645c610",
  "assignment_id": "7ec004d5-c311-471b-8e33-bfbd8d3e04c7",
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
  "recipient": null,
  "comment": null,
  "entrance": null
}
```

## The rider sees who cancelled; the operator sees the whole history

`GET /api/rider/v1/orders` → **200**

```json
{
  "items": [
    {
      "id": "54b197d1-c764-4c92-9016-13282645c610",
      "short_number": 7,
      "status": "CANCELLED",
      "created_at": "2026-10-31T00:08:45.391753Z",
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
          "en": "Passenger asked to cancel",
          "ru": "Пассажир попросил отменить",
          "pl": "Pasażer poprosił o anulowanie",
          "uk": "Пасажир попросив скасувати"
        }
      },
      "pickup_at": null
    },
    {
      "id": "c792956b-3dab-4667-81a5-56a04529ee66",
      "short_number": 6,
      "status": "CANCELLED",
      "created_at": "2026-10-31T00:08:43.236955Z",
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
          "en": "The wait is too long",
          "ru": "Долго ждать машину",
          "pl": "Zbyt długie oczekiwanie",
          "uk": "Довго чекати авто"
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

`GET /api/operator/v1/orders/54b197d1-c764-4c92-9016-13282645c610/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-31T00:08:45.392114Z",
      "actor": {
        "type": "CLIENT",
        "id": "be3bb392-6323-4867-bce3-9ba21ddc3d37",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "54b197d1-c764-4c92-9016-13282645c610",
        "quote_id": "d49a2044-e5bb-47f1-8066-69590739ddb0",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "79c5621b-2885-4e62-9062-a2ff29f2da54"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-31T00:08:45.393393Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "54b197d1-c764-4c92-9016-13282645c610",
        "attempt_id": "f9bf45a8-92b9-474a-85ce-c8cd4962d0c2",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "79c5621b-2885-4e62-9062-a2ff29f2da54"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-31T00:08:45.410041Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "source": "AUTO",
        "offer_id": "bd155edd-3daf-48e5-b64c-3eb8e603fa27",
        "order_id": "54b197d1-c764-4c92-9016-13282645c610",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478,
        "expires_at": "2026-10-31T00:09:00.393895583Z"
      },
      "correlation_id": "79c5621b-2885-4e62-9062-a2ff29f2da54"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-31T00:08:45.791013Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "bd155edd-3daf-48e5-b64c-3eb8e603fa27",
        "order_id": "54b197d1-c764-4c92-9016-13282645c610",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "2098fa85-0e10-4116-8c4a-beea3f122760"
```

Done: orders c792956b-3dab-4667-81a5-56a04529ee66, 54b197d1-c764-4c92-9016-13282645c610.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380732153697",
  "device_ref": "sandbox-23407"
}
```

```json
{
  "challenge_id": "a89fc4d1-bd03-4f9f-993b-7989b77d71a0",
  "expires_at": "2026-10-31T00:13:47.748801275Z",
  "resend_available_at": "2026-10-31T00:08:48.748801275Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380732153697` → **200**

```json
{
  "phone": "+380732153697",
  "audience": "CLIENT",
  "code": "832681",
  "sent_at": "2026-10-31T00:08:47.75070947Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a89fc4d1-bd03-4f9f-993b-7989b77d71a0",
  "code": "832681",
  "device_ref": "sandbox-23407"
}
```

```json
{
  "session_id": "2287389b-5bd4-4e3b-83ea-8ca8222da502",
  "subject": {
    "type": "CLIENT",
    "id": "c517df70-01ab-4037-96db-8723040a755e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNTE3ZGY3MC0wMWFiLTQwMzctOTZkYi04NzIzMDQwYTc1NWUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDA2MjI3LCJpYXQiOjE3OTM0MDUzMjcsImp0aSI6IjgyN2VkMWFhLTFhMTEtNDZlMi1hN2E1LWZkMmJjZTVkZjgyOSIsInNpZCI6IjIyODczODliLTViZDQtNGUzYi04M2VhLThjYTgyMjJkYTUwMiJ9.r9MpSdFgSI6mXJw8L8lUateznvTUaJyo_1tow_7YTto",
  "access_expires_at": "2026-10-31T00:23:47.954869786Z",
  "refresh_token": "J5Xh7IjaPGy10aghe42uqHeJ5hVyTSXVYKXN5UNhmyI",
  "refresh_expires_at": "2026-11-30T00:08:47.954542023Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "a55b52ff-bfa6-45ca-acb2-bb6354770516",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "aef7c2a1-45b9-4ca5-8833-556a2e694c7e",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-aef7c2a1-45b9-4ca5-8833-556a2e694c7e",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "42a7d69bfa88d70225d976ee47804574",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=aef7c2a1-45b9-4ca5-8833-556a2e694c7e",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380732153697"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=aef7c2a1-45b9-4ca5-8833-556a2e694c7e",
  "expires_at": "2026-10-31T00:38:48.142505Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/aef7c2a1-45b9-4ca5-8833-556a2e694c7e` → **200**

```json
{
  "id": "aef7c2a1-45b9-4ca5-8833-556a2e694c7e",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-31T00:38:48.142505Z",
  "card": {
    "id": "9c3631c4-f648-451f-a6ff-9d7f38b73d85",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****3450",
    "card_type": "Visa",
    "created_at": "2026-10-31T00:08:48.347195Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "9c3631c4-f648-451f-a6ff-9d7f38b73d85",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****3450",
      "card_type": "Visa",
      "created_at": "2026-10-31T00:08:48.347195Z"
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
  "device_ref": "sandbox-9986"
}
```

```json
{
  "challenge_id": "605969e1-959e-4b46-b5ac-c08eac6be453",
  "expires_at": "2026-10-31T00:13:48.747933809Z",
  "resend_available_at": "2026-10-31T00:08:49.747933809Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "069243",
  "sent_at": "2026-10-31T00:08:48.749838099Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "605969e1-959e-4b46-b5ac-c08eac6be453",
  "code": "069243",
  "device_ref": "sandbox-9986"
}
```

```json
{
  "session_id": "b9081f32-3874-46e6-84ce-74e672c2a2a4",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwNjIyOCwiaWF0IjoxNzkzNDA1MzI4LCJqdGkiOiJmYWJhODNkMS02N2Q2LTQ5MGUtYjdkNi1mMGJjMjlkNTZiZTciLCJzaWQiOiJiOTA4MWYzMi0zODc0LTQ2ZTYtODRjZS03NGU2NzJjMmEyYTQifQ._sH6OSyEtL7hXQDEV54Ecz2qHetT0XYxpW8iGRkCe7Y",
  "access_expires_at": "2026-10-31T00:23:48.95649944Z",
  "refresh_token": "W-8Gx1KRBknyK6TJbuR7_AdmIBx9Wgx8Puf7Beq4WHA",
  "refresh_expires_at": "2026-11-30T00:08:48.956119758Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "c671d153-0317-4a3e-9f0a-6773884c15cf",
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
  "last_heartbeat_at": "2026-10-31T00:08:44.979606Z",
  "last_location_at": "2026-10-31T00:08:44.979606Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c671d153-0317-4a3e-9f0a-6773884c15cf/handover` → **200**

```json
{
  "command_id": "b7a0d5cf-cbc5-44ff-86c2-a43fcab71b7e",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "c671d153-0317-4a3e-9f0a-6773884c15cf",
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
  "last_heartbeat_at": "2026-10-31T00:08:44.979606Z",
  "last_location_at": "2026-10-31T00:08:44.979606Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

(the car drives 44 s to the next point)

`POST /api/driver/v1/work-sessions/c671d153-0317-4a3e-9f0a-6773884c15cf/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T00:09:33Z",
    "sequence": 1793405373559
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "c671d153-0317-4a3e-9f0a-6773884c15cf",
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
  "last_heartbeat_at": "2026-10-31T00:09:33.575665Z",
  "last_location_at": "2026-10-31T00:09:33.575665Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8eae6b50-5106-410c-b803-1a5dbd5f3197",
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
  "id": "a3a7dd6d-31c4-4688-bc09-ddfef7e92261",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T00:14:33.773970Z",
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
  "command_id": "beca5a42-a042-45f5-adc1-3e0e8ea5b318",
  "quote_id": "a3a7dd6d-31c4-4688-bc09-ddfef7e92261",
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
  "id": "14c53844-3d6a-456b-9a3f-cda24c939988",
  "short_number": 8,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "c517df70-01ab-4037-96db-8723040a755e",
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
  "created_at": "2026-10-31T00:09:33.978002Z",
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

`GET /api/rider/v1/orders/14c53844-3d6a-456b-9a3f-cda24c939988` → **200**

```json
{
  "id": "14c53844-3d6a-456b-9a3f-cda24c939988",
  "short_number": 8,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "c517df70-01ab-4037-96db-8723040a755e",
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
  "created_at": "2026-10-31T00:09:33.978002Z",
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

`GET /api/rider/v1/orders/14c53844-3d6a-456b-9a3f-cda24c939988` → **200**

```json
{
  "id": "14c53844-3d6a-456b-9a3f-cda24c939988",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "c517df70-01ab-4037-96db-8723040a755e",
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
  "created_at": "2026-10-31T00:09:33.978002Z",
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

## Andrii takes it and drives

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "c5ea1afd-5161-4c5f-8512-305e91739ac9",
    "order_id": "14c53844-3d6a-456b-9a3f-cda24c939988",
    "expires_at": "2026-10-31T00:09:49.214777Z",
    "server_time": "2026-10-31T00:09:35.630424544Z",
    "seconds_left": 13,
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
    "distance_m": 478,
    "price_kind": "FIXED",
    "expected_earnings_minor": 13852,
    "comment": null,
    "entrance": null
  }
]
```

`POST /api/driver/v1/offers/c5ea1afd-5161-4c5f-8512-305e91739ac9/accept` → **200**

```json
{
  "command_id": "6e9b6dbf-5559-467e-ba9a-42e40b7c6d1a"
}
```

```json
{
  "id": "e63a1db4-e9d0-48ab-863c-abe03626830e",
  "order_id": "14c53844-3d6a-456b-9a3f-cda24c939988",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "0afefc56-0bf0-4378-82cc-f39eaddb04a1",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "0afefc56-0bf0-4378-82cc-f39eaddb04a1",
  "order_id": "14c53844-3d6a-456b-9a3f-cda24c939988",
  "assignment_id": "e63a1db4-e9d0-48ab-863c-abe03626830e",
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
  "recipient": null,
  "comment": null,
  "entrance": null
}
```

(the car drives 6 s to the next point)

`POST /api/driver/v1/work-sessions/c671d153-0317-4a3e-9f0a-6773884c15cf/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T00:09:42Z",
    "sequence": 1793405382216
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "c671d153-0317-4a3e-9f0a-6773884c15cf",
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
  "last_heartbeat_at": "2026-10-31T00:09:42.2327Z",
  "last_location_at": "2026-10-31T00:09:42.2327Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/0afefc56-0bf0-4378-82cc-f39eaddb04a1/arrive` → **200**

```json
{
  "command_id": "5c6a7363-b9bb-451d-bc2c-375cc17c4399",
  "expected_version": 0
}
```

```json
{
  "id": "0afefc56-0bf0-4378-82cc-f39eaddb04a1",
  "order_id": "14c53844-3d6a-456b-9a3f-cda24c939988",
  "assignment_id": "e63a1db4-e9d0-48ab-863c-abe03626830e",
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
  "arrived_at": "2026-10-31T00:09:42.429689Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null,
  "comment": null,
  "entrance": null
}
```

`POST /api/driver/v1/trips/0afefc56-0bf0-4378-82cc-f39eaddb04a1/start` → **200**

```json
{
  "command_id": "ad0169bf-8ddd-4265-a274-eeb576ebc21a",
  "expected_version": 1
}
```

```json
{
  "id": "0afefc56-0bf0-4378-82cc-f39eaddb04a1",
  "order_id": "14c53844-3d6a-456b-9a3f-cda24c939988",
  "assignment_id": "e63a1db4-e9d0-48ab-863c-abe03626830e",
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
  "arrived_at": "2026-10-31T00:09:42.429689Z",
  "started_at": "2026-10-31T00:09:42.63301Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null,
  "comment": null,
  "entrance": null
}
```

`POST /api/driver/v1/trips/0afefc56-0bf0-4378-82cc-f39eaddb04a1/complete` → **200**

```json
{
  "command_id": "7458e742-1ed1-468c-8973-3a394e1534f0",
  "expected_version": 2,
  "reported_at": "2026-10-31T00:09:42Z",
  "cash_received": true
}
```

```json
{
  "id": "0afefc56-0bf0-4378-82cc-f39eaddb04a1",
  "order_id": "14c53844-3d6a-456b-9a3f-cda24c939988",
  "assignment_id": "e63a1db4-e9d0-48ab-863c-abe03626830e",
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
  "arrived_at": "2026-10-31T00:09:42.429689Z",
  "started_at": "2026-10-31T00:09:42.63301Z",
  "completed_at": "2026-10-31T00:09:42.834887Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null,
  "comment": null,
  "entrance": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/14c53844-3d6a-456b-9a3f-cda24c939988` → **200**

```json
{
  "id": "14c53844-3d6a-456b-9a3f-cda24c939988",
  "short_number": 8,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "c517df70-01ab-4037-96db-8723040a755e",
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
    "id": "e63a1db4-e9d0-48ab-863c-abe03626830e",
    "order_id": "14c53844-3d6a-456b-9a3f-cda24c939988",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "0afefc56-0bf0-4378-82cc-f39eaddb04a1",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-31T00:09:33.978002Z",
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
  "driver_change": null,
  "comment": null,
  "entrance": null
}
```

`GET /api/rider/v1/orders/14c53844-3d6a-456b-9a3f-cda24c939988` → **200**

```json
{
  "id": "14c53844-3d6a-456b-9a3f-cda24c939988",
  "short_number": 8,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "c517df70-01ab-4037-96db-8723040a755e",
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
    "id": "e63a1db4-e9d0-48ab-863c-abe03626830e",
    "order_id": "14c53844-3d6a-456b-9a3f-cda24c939988",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "0afefc56-0bf0-4378-82cc-f39eaddb04a1",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-31T00:09:33.978002Z",
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
  "driver_change": null,
  "comment": null,
  "entrance": null
}
```

`GET /api/rider/v1/orders/14c53844-3d6a-456b-9a3f-cda24c939988` → **200**

```json
{
  "id": "14c53844-3d6a-456b-9a3f-cda24c939988",
  "short_number": 8,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "c517df70-01ab-4037-96db-8723040a755e",
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
    "id": "e63a1db4-e9d0-48ab-863c-abe03626830e",
    "order_id": "14c53844-3d6a-456b-9a3f-cda24c939988",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "0afefc56-0bf0-4378-82cc-f39eaddb04a1",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-31T00:09:33.978002Z",
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
  "driver_change": null,
  "comment": null,
  "entrance": null
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

`GET /api/rider/v1/orders/14c53844-3d6a-456b-9a3f-cda24c939988/tip` → **200**

```json
{
  "order_id": "14c53844-3d6a-456b-9a3f-cda24c939988",
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
  "available_until": "2026-11-01T00:09:42.834887Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/14c53844-3d6a-456b-9a3f-cda24c939988/tip` → **201**

```json
{
  "command_id": "ba99279f-25be-43e8-a624-7db588cd6b6a",
  "amount_minor": 2500
}
```

```json
{
  "id": "9853d4e1-62fa-477c-ad45-a8fae95934db",
  "order_id": "14c53844-3d6a-456b-9a3f-cda24c939988",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-31T00:09:46.074883Z"
}
```

`GET /api/rider/v1/orders/14c53844-3d6a-456b-9a3f-cda24c939988/tip` → **200**

```json
{
  "order_id": "14c53844-3d6a-456b-9a3f-cda24c939988",
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
  "available_until": "2026-11-01T00:09:42.834887Z",
  "open": false,
  "tip": {
    "id": "9853d4e1-62fa-477c-ad45-a8fae95934db",
    "order_id": "14c53844-3d6a-456b-9a3f-cda24c939988",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T00:09:46.074883Z"
  }
}
```

`GET /api/rider/v1/orders/14c53844-3d6a-456b-9a3f-cda24c939988/tip` → **200**

```json
{
  "order_id": "14c53844-3d6a-456b-9a3f-cda24c939988",
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
  "available_until": "2026-11-01T00:09:42.834887Z",
  "open": false,
  "tip": {
    "id": "9853d4e1-62fa-477c-ad45-a8fae95934db",
    "order_id": "14c53844-3d6a-456b-9a3f-cda24c939988",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-31T00:09:46.074883Z"
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
      "id": "2ff76864-e9ef-48e6-a52e-f7e25a892a57",
      "at": "2026-10-31T00:09:47.315986Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "14c53844-3d6a-456b-9a3f-cda24c939988",
      "counterpart_id": null
    },
    {
      "id": "504ae336-1c40-4996-b6d2-fbe6e9cebd41",
      "at": "2026-10-31T00:09:43.280828Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "14c53844-3d6a-456b-9a3f-cda24c939988",
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
  "command_id": "0d3f7ec8-d564-42f1-96b0-2834e1fec5ce",
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
  "id": "c4095290-6d08-41bb-bc2d-5935922a4927",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T00:14:47.869310Z",
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
  "session_id": "0bb04d92-309f-4b29-973b-72f14b680567",
  "subject": {
    "type": "STAFF",
    "id": "2a3afaa3-e140-4771-8de7-2ab6b356cb06"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYTNhZmFhMy1lMTQwLTQ3NzEtOGRlNy0yYWI2YjM1NmNiMDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDYyODgsImlhdCI6MTc5MzQwNTM4OCwianRpIjoiNWFlODg3MGQtNDdkNS00NjQ1LTljY2UtNDkzMmRkZjZkNjM2Iiwic2lkIjoiMGJiMDRkOTItMzA5Zi00YjI5LTk3M2ItNzJmMTRiNjgwNTY3In0.BQf7cs9acoqpjqpRiHrLzYDi8GPgUSKY6peSymtXvyE",
  "access_expires_at": "2026-10-31T00:24:48.281268022Z",
  "refresh_token": "ik8g8FUwygePj5ZkQPCWkyMpQngbMZIH_-Etx2DqQ2w",
  "refresh_expires_at": "2026-10-31T12:09:48.28086112Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380732153697` → **200**

```json
{
  "client_id": "c517df70-01ab-4037-96db-8723040a755e"
}
```

`POST /api/admin/v1/rider-wallets/c517df70-01ab-4037-96db-8723040a755e/top-ups` → **201**

```json
{
  "command_id": "451ad793-70f5-4522-81a8-9d9b04c3ba0b",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "c517df70-01ab-4037-96db-8723040a755e",
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
      "id": "90ba2042-37a2-49ea-b4b3-7fdd567b6fdf",
      "at": "2026-10-31T00:09:48.653093Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "2a3afaa3-e140-4771-8de7-2ab6b356cb06",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "4e90577f-62c6-418d-8247-bd01beedbdc5",
  "quote_id": "c4095290-6d08-41bb-bc2d-5935922a4927",
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
  "id": "1216212b-dbd1-4dc6-ae64-b30269cbb6c1",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c517df70-01ab-4037-96db-8723040a755e",
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
  "created_at": "2026-10-31T00:09:48.861559Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null,
  "comment": null,
  "entrance": null
}
```

`GET /api/rider/v1/orders/1216212b-dbd1-4dc6-ae64-b30269cbb6c1` → **200**

```json
{
  "id": "1216212b-dbd1-4dc6-ae64-b30269cbb6c1",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c517df70-01ab-4037-96db-8723040a755e",
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
  "created_at": "2026-10-31T00:09:48.861559Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null,
  "comment": null,
  "entrance": null
}
```

## Andrii takes it and drives

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "c4f9dbbf-abe1-40da-a1b1-1bad844c80a9",
    "order_id": "1216212b-dbd1-4dc6-ae64-b30269cbb6c1",
    "expires_at": "2026-10-31T00:10:03.864497Z",
    "server_time": "2026-10-31T00:09:49.292847742Z",
    "seconds_left": 14,
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
    "distance_m": 11,
    "price_kind": "FIXED",
    "expected_earnings_minor": 13852,
    "comment": null,
    "entrance": null
  }
]
```

`POST /api/driver/v1/offers/c4f9dbbf-abe1-40da-a1b1-1bad844c80a9/accept` → **200**

```json
{
  "command_id": "510bd859-87ab-4fe4-a4dd-c5ba3edafd88"
}
```

```json
{
  "id": "42549d81-2e0f-4d6c-a139-b848cc2d10aa",
  "order_id": "1216212b-dbd1-4dc6-ae64-b30269cbb6c1",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "7a903b81-01ef-4cdc-ab0a-18eef11eb748",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "7a903b81-01ef-4cdc-ab0a-18eef11eb748",
  "order_id": "1216212b-dbd1-4dc6-ae64-b30269cbb6c1",
  "assignment_id": "42549d81-2e0f-4d6c-a139-b848cc2d10aa",
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
  "recipient": null,
  "comment": null,
  "entrance": null
}
```

`POST /api/driver/v1/work-sessions/c671d153-0317-4a3e-9f0a-6773884c15cf/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T00:09:49Z",
    "sequence": 1793405389879
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "c671d153-0317-4a3e-9f0a-6773884c15cf",
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
  "last_heartbeat_at": "2026-10-31T00:09:49.895433Z",
  "last_location_at": "2026-10-31T00:09:49.895433Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/7a903b81-01ef-4cdc-ab0a-18eef11eb748/arrive` → **200**

```json
{
  "command_id": "d1b3f0f2-7734-41c2-8275-2a4968d7c68d",
  "expected_version": 0
}
```

```json
{
  "id": "7a903b81-01ef-4cdc-ab0a-18eef11eb748",
  "order_id": "1216212b-dbd1-4dc6-ae64-b30269cbb6c1",
  "assignment_id": "42549d81-2e0f-4d6c-a139-b848cc2d10aa",
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
  "arrived_at": "2026-10-31T00:09:50.091604Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null,
  "comment": null,
  "entrance": null
}
```

`POST /api/driver/v1/trips/7a903b81-01ef-4cdc-ab0a-18eef11eb748/start` → **200**

```json
{
  "command_id": "fc611be7-4ad9-4fae-9118-d36571ba8f9a",
  "expected_version": 1
}
```

```json
{
  "id": "7a903b81-01ef-4cdc-ab0a-18eef11eb748",
  "order_id": "1216212b-dbd1-4dc6-ae64-b30269cbb6c1",
  "assignment_id": "42549d81-2e0f-4d6c-a139-b848cc2d10aa",
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
  "arrived_at": "2026-10-31T00:09:50.091604Z",
  "started_at": "2026-10-31T00:09:50.292572Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null,
  "comment": null,
  "entrance": null
}
```

`POST /api/driver/v1/trips/7a903b81-01ef-4cdc-ab0a-18eef11eb748/complete` → **200**

```json
{
  "command_id": "6213fd06-c8aa-4751-9ca4-c73dc1148e20",
  "expected_version": 2,
  "reported_at": "2026-10-31T00:09:50Z",
  "cash_received": true
}
```

```json
{
  "id": "7a903b81-01ef-4cdc-ab0a-18eef11eb748",
  "order_id": "1216212b-dbd1-4dc6-ae64-b30269cbb6c1",
  "assignment_id": "42549d81-2e0f-4d6c-a139-b848cc2d10aa",
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
  "arrived_at": "2026-10-31T00:09:50.091604Z",
  "started_at": "2026-10-31T00:09:50.292572Z",
  "completed_at": "2026-10-31T00:09:50.496772Z",
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null,
  "comment": null,
  "entrance": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "c517df70-01ab-4037-96db-8723040a755e",
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
      "id": "90ba2042-37a2-49ea-b4b3-7fdd567b6fdf",
      "at": "2026-10-31T00:09:48.653093Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "2a3afaa3-e140-4771-8de7-2ab6b356cb06",
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

`GET /api/rider/v1/orders/1216212b-dbd1-4dc6-ae64-b30269cbb6c1/tip` → **200**

```json
{
  "order_id": "1216212b-dbd1-4dc6-ae64-b30269cbb6c1",
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
  "available_until": "2026-11-01T00:09:50.496772Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/1216212b-dbd1-4dc6-ae64-b30269cbb6c1/tip` → **201**

```json
{
  "command_id": "ff652565-49ed-49df-b1fa-5fe78414969b",
  "amount_minor": 2500
}
```

```json
{
  "id": "d3591803-2001-483e-9f9e-7e60cb558257",
  "order_id": "1216212b-dbd1-4dc6-ae64-b30269cbb6c1",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-31T00:09:51.272876Z"
}
```

`GET /api/rider/v1/orders/1216212b-dbd1-4dc6-ae64-b30269cbb6c1/tip` → **200**

```json
{
  "order_id": "1216212b-dbd1-4dc6-ae64-b30269cbb6c1",
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
  "available_until": "2026-11-01T00:09:50.496772Z",
  "open": false,
  "tip": {
    "id": "d3591803-2001-483e-9f9e-7e60cb558257",
    "order_id": "1216212b-dbd1-4dc6-ae64-b30269cbb6c1",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-31T00:09:51.272876Z"
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
      "id": "f6c6bc78-5779-4ead-a753-d574086e76ac",
      "at": "2026-10-31T00:09:51.345982Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "1216212b-dbd1-4dc6-ae64-b30269cbb6c1",
      "counterpart_id": null
    },
    {
      "id": "2ff76864-e9ef-48e6-a52e-f7e25a892a57",
      "at": "2026-10-31T00:09:47.315986Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "14c53844-3d6a-456b-9a3f-cda24c939988",
      "counterpart_id": null
    },
    {
      "id": "504ae336-1c40-4996-b6d2-fbe6e9cebd41",
      "at": "2026-10-31T00:09:43.280828Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "14c53844-3d6a-456b-9a3f-cda24c939988",
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
      "id": "e491d9a4-cc3b-4cbb-af56-35a7cb2e94a1",
      "at": "2026-10-31T00:09:52.44764Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "1216212b-dbd1-4dc6-ae64-b30269cbb6c1",
      "counterpart_id": null
    },
    {
      "id": "f6c6bc78-5779-4ead-a753-d574086e76ac",
      "at": "2026-10-31T00:09:51.345982Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "1216212b-dbd1-4dc6-ae64-b30269cbb6c1",
      "counterpart_id": null
    },
    {
      "id": "2ff76864-e9ef-48e6-a52e-f7e25a892a57",
      "at": "2026-10-31T00:09:47.315986Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "14c53844-3d6a-456b-9a3f-cda24c939988",
      "counterpart_id": null
    },
    {
      "id": "504ae336-1c40-4996-b6d2-fbe6e9cebd41",
      "at": "2026-10-31T00:09:43.280828Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "14c53844-3d6a-456b-9a3f-cda24c939988",
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
  "session_id": "c671d153-0317-4a3e-9f0a-6773884c15cf",
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
  "last_heartbeat_at": "2026-10-31T00:09:49.895433Z",
  "last_location_at": "2026-10-31T00:09:49.895433Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c671d153-0317-4a3e-9f0a-6773884c15cf/close` → **200**

```json
{
  "command_id": "e238c7ec-4fc6-4072-a533-179d97313d64",
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

Done: card order 1216212b-dbd1-4dc6-ae64-b30269cbb6c1.

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
  "phone": "+380730595760",
  "device_ref": "sandbox-5850"
}
```

```json
{
  "challenge_id": "d407f16d-67c6-4e86-83d8-db21010b8f5e",
  "expires_at": "2026-10-31T00:14:53.722722035Z",
  "resend_available_at": "2026-10-31T00:09:54.722722035Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380730595760` → **200**

```json
{
  "phone": "+380730595760",
  "audience": "CLIENT",
  "code": "835857",
  "sent_at": "2026-10-31T00:09:53.724549517Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d407f16d-67c6-4e86-83d8-db21010b8f5e",
  "code": "835857",
  "device_ref": "sandbox-5850"
}
```

```json
{
  "session_id": "a86b8052-60fb-4770-974d-09b2d0ae491b",
  "subject": {
    "type": "CLIENT",
    "id": "0adee17d-f682-437e-8b42-296767cf5eb3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwYWRlZTE3ZC1mNjgyLTQzN2UtOGI0Mi0yOTY3NjdjZjVlYjMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDA2MjkzLCJpYXQiOjE3OTM0MDUzOTMsImp0aSI6ImVmMzc0YmRhLTcwOTYtNGM4Yi04ZTdlLTdlZTExNzY3NWYwNyIsInNpZCI6ImE4NmI4MDUyLTYwZmItNDc3MC05NzRkLTA5YjJkMGFlNDkxYiJ9.0Iq20xS907ZBiJlPvolZHhx5_gdAZkXbNbxnq-giSJs",
  "access_expires_at": "2026-10-31T00:24:53.928702982Z",
  "refresh_token": "V5q5IRx_XT0GmVgUGUkHuWEVEQrxoHTJewMXcr2EWDk",
  "refresh_expires_at": "2026-11-30T00:09:53.928387546Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "8e402bd5-3abe-4ced-bf1d-7e59f54d2483",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "7acebab4-3c92-423c-8aa7-1ec26c1db2bb",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-7acebab4-3c92-423c-8aa7-1ec26c1db2bb",
    "orderDate": "1793405394",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "54016761af6a564f164abaf23e674693",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=7acebab4-3c92-423c-8aa7-1ec26c1db2bb",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380730595760"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=7acebab4-3c92-423c-8aa7-1ec26c1db2bb",
  "created_at": "2026-10-31T00:09:54.119661Z",
  "expires_at": "2026-10-31T00:39:54.119661Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/7acebab4-3c92-423c-8aa7-1ec26c1db2bb` → **200**

```json
{
  "id": "7acebab4-3c92-423c-8aa7-1ec26c1db2bb",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-31T00:09:54.119661Z",
  "expires_at": "2026-10-31T00:39:54.119661Z",
  "completed_at": "2026-10-31T00:09:54.305699Z",
  "masked_pan": "41****5923",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "0adee17d-f682-437e-8b42-296767cf5eb3",
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
      "id": "8f995b1d-7148-4fb7-a813-d02d4ccd076b",
      "at": "2026-10-31T00:09:54.45985Z",
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
  "client_id": "0adee17d-f682-437e-8b42-296767cf5eb3",
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
      "id": "8f995b1d-7148-4fb7-a813-d02d4ccd076b",
      "at": "2026-10-31T00:09:54.45985Z",
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
  "device_ref": "sandbox-13638"
}
```

```json
{
  "challenge_id": "32bcb4bc-04f9-48b0-8031-13176144d3ca",
  "expires_at": "2026-10-31T00:14:54.881746334Z",
  "resend_available_at": "2026-10-31T00:09:55.881746334Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "547843",
  "sent_at": "2026-10-31T00:09:54.883758435Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "32bcb4bc-04f9-48b0-8031-13176144d3ca",
  "code": "547843",
  "device_ref": "sandbox-13638"
}
```

```json
{
  "session_id": "13858348-cc59-4163-8e98-6b370dc05427",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwNjI5NSwiaWF0IjoxNzkzNDA1Mzk1LCJqdGkiOiI2OWQ0OWMyZC1hMWY0LTQ4MjQtOTk0Mi1jNjc4N2E5NjdlYWQiLCJzaWQiOiIxMzg1ODM0OC1jYzU5LTQxNjMtOGU5OC02YjM3MGRjMDU0MjcifQ.Bmu2V65n-3EKa4-FfV4sOYQ7zSTx1eXnpH7LhGXIE9o",
  "access_expires_at": "2026-10-31T00:24:55.08881172Z",
  "refresh_token": "PguE8qvbXeR1Djkr-QGt87kOxPMcAmkVcE3jC6CFwm0",
  "refresh_expires_at": "2026-11-30T00:09:55.088407007Z",
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
  "command_id": "3cd02471-705c-4929-8f38-56cb404655d6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "166fca68-407e-4d00-933c-4f64a3bca366",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-166fca68-407e-4d00-933c-4f64a3bca366",
    "orderDate": "1793405395",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "5c80b1e1c92f143bc754bb6757e0a660",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=166fca68-407e-4d00-933c-4f64a3bca366",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=166fca68-407e-4d00-933c-4f64a3bca366",
  "created_at": "2026-10-31T00:09:55.479883Z",
  "expires_at": "2026-10-31T00:39:55.479883Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/166fca68-407e-4d00-933c-4f64a3bca366` → **200**

```json
{
  "id": "166fca68-407e-4d00-933c-4f64a3bca366",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-31T00:09:55.479883Z",
  "expires_at": "2026-10-31T00:39:55.479883Z",
  "completed_at": "2026-10-31T00:09:55.669119Z",
  "masked_pan": "41****3667",
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
      "id": "bda90b81-5d7b-4d97-80fd-bca20410d92d",
      "at": "2026-10-31T00:09:56.466345Z",
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
  "command_id": "6fe2f20a-aaa6-4540-bf91-696342fd6dfd",
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
  "correlation_id": "57bb67b8-87a3-4140-afba-af04b6a08d1d"
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
  "device_ref": "sandbox-1197"
}
```

```json
{
  "challenge_id": "433f151f-5c85-483b-9676-6ce12ede5647",
  "expires_at": "2026-10-31T00:14:57.457035338Z",
  "resend_available_at": "2026-10-31T00:09:58.457035338Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "593927",
  "sent_at": "2026-10-31T00:09:57.459155581Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "433f151f-5c85-483b-9676-6ce12ede5647",
  "code": "593927",
  "device_ref": "sandbox-1197"
}
```

```json
{
  "session_id": "c271712e-e49f-4b34-a198-bc03d35da357",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwNjI5NywiaWF0IjoxNzkzNDA1Mzk3LCJqdGkiOiI4MGY4ZGYzMC05ZTliLTRiODUtOTgwYS1mNWQwNzczZjBlMTYiLCJzaWQiOiJjMjcxNzEyZS1lNDlmLTRiMzQtYTE5OC1iYzAzZDM1ZGEzNTcifQ.o_DumzbSo0EHFPfM_qN3iaIptKLv--Vp7T-1YrUuBho",
  "access_expires_at": "2026-10-31T00:24:57.664607417Z",
  "refresh_token": "HJ5RvUt9IvIFwiHS_lPIEk7SrFAfCpErFXf277kV5Bc",
  "refresh_expires_at": "2026-11-30T00:09:57.664202053Z",
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
  "command_id": "bbe44223-bdee-4d29-9ff2-b901645ff750",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T00:09:58Z",
    "sequence": 1793405398491
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3f26cea5-15fd-450b-9286-23184458ffde",
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
  "last_heartbeat_at": "2026-10-31T00:09:58.063704Z",
  "last_location_at": "2026-10-31T00:09:58.063704Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A rider orders for cash

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633634840",
  "device_ref": "sandbox-23744"
}
```

```json
{
  "challenge_id": "925b1845-b5d3-43de-beb7-f444114d5275",
  "expires_at": "2026-10-31T00:14:58.261642067Z",
  "resend_available_at": "2026-10-31T00:09:59.261642067Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380633634840` → **200**

```json
{
  "phone": "+380633634840",
  "audience": "CLIENT",
  "code": "595549",
  "sent_at": "2026-10-31T00:09:58.263573976Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "925b1845-b5d3-43de-beb7-f444114d5275",
  "code": "595549",
  "device_ref": "sandbox-23744"
}
```

```json
{
  "session_id": "51687e72-ef84-496a-af11-a2dfad3914a7",
  "subject": {
    "type": "CLIENT",
    "id": "cd771c5b-ff27-4966-be49-0bc0e17a0dee"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZDc3MWM1Yi1mZjI3LTQ5NjYtYmU0OS0wYmMwZTE3YTBkZWUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDA2Mjk4LCJpYXQiOjE3OTM0MDUzOTgsImp0aSI6IjNmYmU1MWE3LWFmYmEtNDA1NC04M2IyLWRiMjJmM2E4Yjk1YSIsInNpZCI6IjUxNjg3ZTcyLWVmODQtNDk2YS1hZjExLWEyZGZhZDM5MTRhNyJ9.8UBRJxSAmzFlXbAuOAmoqAjGOpDM0fsPls1h6c8tsyA",
  "access_expires_at": "2026-10-31T00:24:58.465560485Z",
  "refresh_token": "L8nqhwWp3QBaJfXwUh7nPfzTuywBkiToX8i9UuWz80Y",
  "refresh_expires_at": "2026-11-30T00:09:58.465151221Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "2e8222f8-788d-47a8-b2f3-8a8a84c8b224",
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
  "id": "ed8704ba-bd7d-4c00-a8b4-e14c9b9947fa",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T00:14:58.655790Z",
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
  "command_id": "ba1ef11e-830f-402b-a895-c5ca5366b500",
  "quote_id": "ed8704ba-bd7d-4c00-a8b4-e14c9b9947fa",
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
  "id": "bd6ce276-2d1a-421b-835a-73e3aadcb74f",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "cd771c5b-ff27-4966-be49-0bc0e17a0dee",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T00:09:58.854765Z",
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

## Ivan drives; at the end the rider has no money and leaves

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "ab7add43-dc5d-4991-947a-58d850fd0f8c",
    "order_id": "bd6ce276-2d1a-421b-835a-73e3aadcb74f",
    "expires_at": "2026-10-31T00:10:13.856351Z",
    "server_time": "2026-10-31T00:09:59.058190264Z",
    "seconds_left": 14,
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
    "distance_m": 100,
    "price_kind": "FIXED",
    "expected_earnings_minor": 8939,
    "comment": null,
    "entrance": null
  }
]
```

`POST /api/driver/v1/offers/ab7add43-dc5d-4991-947a-58d850fd0f8c/accept` → **200**

```json
{
  "command_id": "e13fdaa3-031e-4f9b-9f98-6a9271ac3a4c"
}
```

```json
{
  "id": "c00bbbc4-c11d-47ea-a94e-1a6d3b1b030b",
  "order_id": "bd6ce276-2d1a-421b-835a-73e3aadcb74f",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "2c76b5d9-f002-4ebc-80c0-092d6b2695d1",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "2c76b5d9-f002-4ebc-80c0-092d6b2695d1",
  "order_id": "bd6ce276-2d1a-421b-835a-73e3aadcb74f",
  "assignment_id": "c00bbbc4-c11d-47ea-a94e-1a6d3b1b030b",
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
  "recipient": null,
  "comment": null,
  "entrance": null
}
```

(the car drives 1 s to the next point)

`POST /api/driver/v1/work-sessions/3f26cea5-15fd-450b-9286-23184458ffde/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T00:10:00Z",
    "sequence": 1793405400626
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3f26cea5-15fd-450b-9286-23184458ffde",
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
  "last_heartbeat_at": "2026-10-31T00:10:00.642399Z",
  "last_location_at": "2026-10-31T00:10:00.642399Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/2c76b5d9-f002-4ebc-80c0-092d6b2695d1/arrive` → **200**

```json
{
  "command_id": "475f475e-0887-4007-8f3c-78f01d5921a8",
  "expected_version": 0
}
```

```json
{
  "id": "2c76b5d9-f002-4ebc-80c0-092d6b2695d1",
  "order_id": "bd6ce276-2d1a-421b-835a-73e3aadcb74f",
  "assignment_id": "c00bbbc4-c11d-47ea-a94e-1a6d3b1b030b",
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
  "arrived_at": "2026-10-31T00:10:00.842222Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null,
  "comment": null,
  "entrance": null
}
```

`POST /api/driver/v1/trips/2c76b5d9-f002-4ebc-80c0-092d6b2695d1/start` → **200**

```json
{
  "command_id": "745b58d1-9ef0-452d-98d0-66bd8a21b8b2",
  "expected_version": 1
}
```

```json
{
  "id": "2c76b5d9-f002-4ebc-80c0-092d6b2695d1",
  "order_id": "bd6ce276-2d1a-421b-835a-73e3aadcb74f",
  "assignment_id": "c00bbbc4-c11d-47ea-a94e-1a6d3b1b030b",
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
  "arrived_at": "2026-10-31T00:10:00.842222Z",
  "started_at": "2026-10-31T00:10:01.054118Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null,
  "comment": null,
  "entrance": null
}
```

`POST /api/driver/v1/trips/2c76b5d9-f002-4ebc-80c0-092d6b2695d1/complete` → **200**

```json
{
  "command_id": "e6c56670-1594-4dd1-9f19-fa6e8fdd1bab",
  "expected_version": 2,
  "reported_at": "2026-10-31T00:10:01Z",
  "cash_received": false
}
```

```json
{
  "id": "2c76b5d9-f002-4ebc-80c0-092d6b2695d1",
  "order_id": "bd6ce276-2d1a-421b-835a-73e3aadcb74f",
  "assignment_id": "c00bbbc4-c11d-47ea-a94e-1a6d3b1b030b",
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
  "arrived_at": "2026-10-31T00:10:00.842222Z",
  "started_at": "2026-10-31T00:10:01.054118Z",
  "completed_at": "2026-10-31T00:10:01.258026Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null,
  "comment": null,
  "entrance": null
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
  "session_id": "5602d13c-cd06-4eb0-a8f7-c73f315eaf30",
  "subject": {
    "type": "STAFF",
    "id": "2a3afaa3-e140-4771-8de7-2ab6b356cb06"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYTNhZmFhMy1lMTQwLTQ3NzEtOGRlNy0yYWI2YjM1NmNiMDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDYzMDEsImlhdCI6MTc5MzQwNTQwMSwianRpIjoiZDQwZmVmNGQtOTM0Yy00ZDY2LWJkOWMtNjkzNmNhYzBmZTJlIiwic2lkIjoiNTYwMmQxM2MtY2QwNi00ZWIwLWE4ZjctYzczZjMxNWVhZjMwIn0.4QYbkO7psTuPwsssA5RIMsiKQrtgRdruG6BAHvCX50g",
  "access_expires_at": "2026-10-31T00:25:01.654531383Z",
  "refresh_token": "2Qt-3CevdhApPNZeaovuUYHIoVj4Z2ZdZaUypgtoszY",
  "refresh_expires_at": "2026-10-31T12:10:01.654125952Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/bd6ce276-2d1a-421b-835a-73e3aadcb74f/cash-dispute` → **200**

```json
{
  "order_id": "bd6ce276-2d1a-421b-835a-73e3aadcb74f",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "cd771c5b-ff27-4966-be49-0bc0e17a0dee",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-31T00:10:01.509985Z",
  "decide_by": "2026-11-14T00:10:01.509985Z",
  "decision": null,
  "decided_by": null,
  "reason": null,
  "decided_at": null,
  "version": 1
}
```

Dispute: {"held_minor":0,"rider_debt_minor":10517,"decide_by":"2026-11-14T00:10:01.509985Z","decision":null}

`GET /api/admin/v1/cash-disputes` → **200**

```json
{
  "disputes": [
    {
      "order_id": "bd6ce276-2d1a-421b-835a-73e3aadcb74f",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "payer_client_id": "cd771c5b-ff27-4966-be49-0bc0e17a0dee",
      "currency": "UAH",
      "held_minor": 0,
      "rider_debt_minor": 10517,
      "opened_at": "2026-10-31T00:10:01.509985Z",
      "decide_by": "2026-11-14T00:10:01.509985Z",
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

`POST /api/admin/v1/orders/bd6ce276-2d1a-421b-835a-73e3aadcb74f/cash-dispute/decide` → **400**

```json
{
  "command_id": "8ebd5841-cb18-4532-9912-bb305c64cbbb",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/orders/bd6ce276-2d1a-421b-835a-73e3aadcb74f/cash-dispute/decide",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "ed96b3fa-42da-4683-be22-f4ef5bd8aa7a",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/orders/bd6ce276-2d1a-421b-835a-73e3aadcb74f/cash-dispute/decide` → **200**

```json
{
  "command_id": "2bbfe406-4c7d-4c17-8af6-5805e04345b5",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": "The rider does not answer calls"
}
```

```json
{
  "order_id": "bd6ce276-2d1a-421b-835a-73e3aadcb74f",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "cd771c5b-ff27-4966-be49-0bc0e17a0dee",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-31T00:10:01.509985Z",
  "decide_by": "2026-11-14T00:10:01.509985Z",
  "decision": "PAY_DRIVER",
  "decided_by": "2a3afaa3-e140-4771-8de7-2ab6b356cb06",
  "reason": "The rider does not answer calls",
  "decided_at": "2026-10-31T00:10:02.480594Z",
  "version": 2
}
```

`POST /api/admin/v1/orders/bd6ce276-2d1a-421b-835a-73e3aadcb74f/cash-dispute/decide` → **409**

```json
{
  "command_id": "1b61af65-ea17-44d1-8a39-608e7a7f3469",
  "expected_version": 2,
  "decision": "RIDER_PAID",
  "reason": "Again"
}
```

```json
{
  "instance": "/api/admin/v1/orders/bd6ce276-2d1a-421b-835a-73e3aadcb74f/cash-dispute/decide",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "e5e3f936-7ed9-472c-9178-0a9ead1ca7f4"
}
```

Done: an unpaid cash trip became a dispute and was decided once.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3f26cea5-15fd-450b-9286-23184458ffde",
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
  "last_heartbeat_at": "2026-10-31T00:10:00.642399Z",
  "last_location_at": "2026-10-31T00:10:00.642399Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3f26cea5-15fd-450b-9286-23184458ffde/close` → **200**

```json
{
  "command_id": "fe16af0c-1582-493e-b6e0-0cfebaab4f4a",
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
  "phone": "+380730765486",
  "device_ref": "sandbox-27311"
}
```

```json
{
  "challenge_id": "a5f65786-2295-4e93-8d5d-2f085f1ec825",
  "expires_at": "2026-10-31T00:15:03.262955689Z",
  "resend_available_at": "2026-10-31T00:10:04.262955689Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380730765486` → **200**

```json
{
  "phone": "+380730765486",
  "audience": "CLIENT",
  "code": "072643",
  "sent_at": "2026-10-31T00:10:03.264947989Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a5f65786-2295-4e93-8d5d-2f085f1ec825",
  "code": "072643",
  "device_ref": "sandbox-27311"
}
```

```json
{
  "session_id": "c8d92f29-11dd-4d8e-be8d-6f5a10511525",
  "subject": {
    "type": "CLIENT",
    "id": "8b9cb216-e25f-42bd-bde3-e274d7ae31df"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4YjljYjIxNi1lMjVmLTQyYmQtYmRlMy1lMjc0ZDdhZTMxZGYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDA2MzAzLCJpYXQiOjE3OTM0MDU0MDMsImp0aSI6IjMwZThhNDc4LTE1YjItNDFhOS04ZDdiLTcxY2Q2NWFlZDliYiIsInNpZCI6ImM4ZDkyZjI5LTExZGQtNGQ4ZS1iZThkLTZmNWExMDUxMTUyNSJ9.AjlbawSUo2W1tiz5VG6j2weGP5OzIQA1lZN6oS9iq_I",
  "access_expires_at": "2026-10-31T00:25:03.471300871Z",
  "refresh_token": "ose4eIKg67_OqNODYrNUb2EFl1bUsdQaIZrKIRSO08U",
  "refresh_expires_at": "2026-11-30T00:10:03.470942582Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "6a89e3c7-fde9-451f-8f08-b0c39173e2d0",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "57a87254-b9ef-450b-a017-85b82027e01e",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-57a87254-b9ef-450b-a017-85b82027e01e",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "71f85e6fdbff8a16dca4ff7c8834b8da",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=57a87254-b9ef-450b-a017-85b82027e01e",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380730765486"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=57a87254-b9ef-450b-a017-85b82027e01e",
  "expires_at": "2026-10-31T00:40:03.65304Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/57a87254-b9ef-450b-a017-85b82027e01e` → **200**

```json
{
  "id": "57a87254-b9ef-450b-a017-85b82027e01e",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-31T00:40:03.65304Z",
  "card": {
    "id": "cbfe6470-7eb6-4be7-8053-9ec94d5c5f6d",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****3099",
    "card_type": "Visa",
    "created_at": "2026-10-31T00:10:03.842036Z"
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
  "device_ref": "sandbox-13632"
}
```

```json
{
  "challenge_id": "45760ff4-8af9-4401-a517-8cfabb8672a9",
  "expires_at": "2026-10-31T00:15:04.039883196Z",
  "resend_available_at": "2026-10-31T00:10:05.039883196Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "767843",
  "sent_at": "2026-10-31T00:10:04.04275566Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "45760ff4-8af9-4401-a517-8cfabb8672a9",
  "code": "767843",
  "device_ref": "sandbox-13632"
}
```

```json
{
  "session_id": "55371758-0a0c-4e41-ae3e-5fcf9a84d45f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwNjMwNCwiaWF0IjoxNzkzNDA1NDA0LCJqdGkiOiI2NmUzOGE2ZC0yOTYzLTQwOTMtOTY5Zi1jOTAxYTg0OTg4NjkiLCJzaWQiOiI1NTM3MTc1OC0wYTBjLTRlNDEtYWUzZS01ZmNmOWE4NGQ0NWYifQ.4sc4Q5qSpMC1iT8AdgpGNgmSthnPRUNq6rehOMPaMOs",
  "access_expires_at": "2026-10-31T00:25:04.294153212Z",
  "refresh_token": "7Nh3ORiWgmZ-BU4DRLLtmUuS5-51E_CPpJK6Qh93X5k",
  "refresh_expires_at": "2026-11-30T00:10:04.293790717Z",
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
  "command_id": "0d23614f-a1d6-4cba-8231-bfb544776719",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T00:10:04Z",
    "sequence": 1793405404677
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "8e9e2fbf-f1bf-403a-9378-ad9a81d82c6c",
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
  "last_heartbeat_at": "2026-10-31T00:10:04.692841Z",
  "last_location_at": "2026-10-31T00:10:04.692841Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A card ride; on the way both write numbers into the chat

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6f48e4cc-ebd5-481f-a6e7-be8adb0939d3",
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
  "id": "d85ab34f-2d6b-4a1e-8cbd-09146780a360",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T00:15:04.902020Z",
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
  "command_id": "179bb20e-c400-447b-bd9f-4ea1c97ac1c8",
  "quote_id": "d85ab34f-2d6b-4a1e-8cbd-09146780a360",
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
  "id": "dfba70a5-e48f-47a7-9dbf-64d02f7795aa",
  "short_number": 11,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "8b9cb216-e25f-42bd-bde3-e274d7ae31df",
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
  "created_at": "2026-10-31T00:10:05.108759Z",
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

`GET /api/rider/v1/orders/dfba70a5-e48f-47a7-9dbf-64d02f7795aa` → **200**

```json
{
  "id": "dfba70a5-e48f-47a7-9dbf-64d02f7795aa",
  "short_number": 11,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "8b9cb216-e25f-42bd-bde3-e274d7ae31df",
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
  "created_at": "2026-10-31T00:10:05.108759Z",
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

`GET /api/rider/v1/orders/dfba70a5-e48f-47a7-9dbf-64d02f7795aa` → **200**

```json
{
  "id": "dfba70a5-e48f-47a7-9dbf-64d02f7795aa",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "8b9cb216-e25f-42bd-bde3-e274d7ae31df",
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
  "created_at": "2026-10-31T00:10:05.108759Z",
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
    "id": "389bb8bc-a8d2-4694-87b0-0e797ab7267e",
    "order_id": "dfba70a5-e48f-47a7-9dbf-64d02f7795aa",
    "expires_at": "2026-10-31T00:10:20.53528Z",
    "server_time": "2026-10-31T00:10:06.739571119Z",
    "seconds_left": 13,
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
    "distance_m": 478,
    "price_kind": "FIXED",
    "expected_earnings_minor": 13852,
    "comment": null,
    "entrance": null
  }
]
```

`POST /api/driver/v1/offers/389bb8bc-a8d2-4694-87b0-0e797ab7267e/accept` → **200**

```json
{
  "command_id": "2f3f940b-5d6f-47ee-856c-b91bba0f314f"
}
```

```json
{
  "id": "0a17f012-bf7d-4fe9-854d-85cc1c8c0b6e",
  "order_id": "dfba70a5-e48f-47a7-9dbf-64d02f7795aa",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f3599c61-ccb9-4967-a797-4fd3c0e24441",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f3599c61-ccb9-4967-a797-4fd3c0e24441",
  "order_id": "dfba70a5-e48f-47a7-9dbf-64d02f7795aa",
  "assignment_id": "0a17f012-bf7d-4fe9-854d-85cc1c8c0b6e",
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
  "recipient": null,
  "comment": null,
  "entrance": null
}
```

`POST /api/rider/v1/orders/dfba70a5-e48f-47a7-9dbf-64d02f7795aa/messages` → **201**

```json
{
  "command_id": "978b5394-a8ad-43af-a852-35d3dc89583d",
  "body": "Я біля входу, мій номер +380730765486, картка 4111 1111 1111 1111"
}
```

```json
{
  "id": "7b698ce6-e622-4a65-be78-27aef577f669",
  "order_id": "dfba70a5-e48f-47a7-9dbf-64d02f7795aa",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу, мій номер +380730765486, картка 4111 1111 1111 1111",
  "sent_at": "2026-10-31T00:10:07.322345351Z"
}
```

`POST /api/driver/v1/trips/f3599c61-ccb9-4967-a797-4fd3c0e24441/messages` → **201**

```json
{
  "command_id": "01f1dfa1-4cb6-4912-ac22-f383b5b8772e",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03"
}
```

```json
{
  "id": "f1a8463f-770e-4dc5-a203-49693dd2944c",
  "order_id": "dfba70a5-e48f-47a7-9dbf-64d02f7795aa",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03",
  "sent_at": "2026-10-31T00:10:07.519925457Z"
}
```

(the car drives 6 s to the next point)

`POST /api/driver/v1/work-sessions/8e9e2fbf-f1bf-403a-9378-ad9a81d82c6c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T00:10:13Z",
    "sequence": 1793405413725
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "8e9e2fbf-f1bf-403a-9378-ad9a81d82c6c",
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
  "last_heartbeat_at": "2026-10-31T00:10:13.740791Z",
  "last_location_at": "2026-10-31T00:10:13.740791Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/f3599c61-ccb9-4967-a797-4fd3c0e24441/arrive` → **200**

```json
{
  "command_id": "2e282623-768d-44dc-9879-2875a38ba564",
  "expected_version": 0
}
```

```json
{
  "id": "f3599c61-ccb9-4967-a797-4fd3c0e24441",
  "order_id": "dfba70a5-e48f-47a7-9dbf-64d02f7795aa",
  "assignment_id": "0a17f012-bf7d-4fe9-854d-85cc1c8c0b6e",
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
  "arrived_at": "2026-10-31T00:10:13.933437Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null,
  "comment": null,
  "entrance": null
}
```

`POST /api/driver/v1/trips/f3599c61-ccb9-4967-a797-4fd3c0e24441/start` → **200**

```json
{
  "command_id": "40fddf3b-e3d4-4c25-bb5e-d1d365586896",
  "expected_version": 1
}
```

```json
{
  "id": "f3599c61-ccb9-4967-a797-4fd3c0e24441",
  "order_id": "dfba70a5-e48f-47a7-9dbf-64d02f7795aa",
  "assignment_id": "0a17f012-bf7d-4fe9-854d-85cc1c8c0b6e",
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
  "arrived_at": "2026-10-31T00:10:13.933437Z",
  "started_at": "2026-10-31T00:10:14.138591Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null,
  "comment": null,
  "entrance": null
}
```

(the car drives 90 s to the next point)

`POST /api/driver/v1/work-sessions/8e9e2fbf-f1bf-403a-9378-ad9a81d82c6c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4584,
    "lon": 30.4300,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T00:11:44Z",
    "sequence": 1793405504344
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "8e9e2fbf-f1bf-403a-9378-ad9a81d82c6c",
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
  "last_heartbeat_at": "2026-10-31T00:11:44.360673Z",
  "last_location_at": "2026-10-31T00:11:44.360673Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/f3599c61-ccb9-4967-a797-4fd3c0e24441/complete` → **200**

```json
{
  "command_id": "31ba727f-7d45-4f2c-b95a-4196002877ad",
  "expected_version": 2,
  "reported_at": "2026-10-31T00:11:44Z",
  "cash_received": false
}
```

```json
{
  "id": "f3599c61-ccb9-4967-a797-4fd3c0e24441",
  "order_id": "dfba70a5-e48f-47a7-9dbf-64d02f7795aa",
  "assignment_id": "0a17f012-bf7d-4fe9-854d-85cc1c8c0b6e",
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
  "arrived_at": "2026-10-31T00:10:13.933437Z",
  "started_at": "2026-10-31T00:10:14.138591Z",
  "completed_at": "2026-10-31T00:11:44.559326Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null,
  "comment": null,
  "entrance": null
}
```

`GET /api/rider/v1/orders/dfba70a5-e48f-47a7-9dbf-64d02f7795aa` → **200**

```json
{
  "id": "dfba70a5-e48f-47a7-9dbf-64d02f7795aa",
  "short_number": 11,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "8b9cb216-e25f-42bd-bde3-e274d7ae31df",
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
    "id": "0a17f012-bf7d-4fe9-854d-85cc1c8c0b6e",
    "order_id": "dfba70a5-e48f-47a7-9dbf-64d02f7795aa",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "f3599c61-ccb9-4967-a797-4fd3c0e24441",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-31T00:10:05.108759Z",
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
  "driver_change": null,
  "comment": null,
  "entrance": null
}
```

`GET /api/rider/v1/orders/dfba70a5-e48f-47a7-9dbf-64d02f7795aa` → **200**

```json
{
  "id": "dfba70a5-e48f-47a7-9dbf-64d02f7795aa",
  "short_number": 11,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "8b9cb216-e25f-42bd-bde3-e274d7ae31df",
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
    "id": "0a17f012-bf7d-4fe9-854d-85cc1c8c0b6e",
    "order_id": "dfba70a5-e48f-47a7-9dbf-64d02f7795aa",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "f3599c61-ccb9-4967-a797-4fd3c0e24441",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-31T00:10:05.108759Z",
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
  "driver_change": null,
  "comment": null,
  "entrance": null
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "8e9e2fbf-f1bf-403a-9378-ad9a81d82c6c",
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
  "last_heartbeat_at": "2026-10-31T00:11:44.360673Z",
  "last_location_at": "2026-10-31T00:11:44.360673Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8e9e2fbf-f1bf-403a-9378-ad9a81d82c6c/close` → **200**

```json
{
  "command_id": "4564837d-b5a0-4c6f-ba81-83f0d4ea25fb",
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
  "session_id": "4187c6a8-1f1e-43c3-b53b-dbdfdadd0919",
  "subject": {
    "type": "STAFF",
    "id": "2a3afaa3-e140-4771-8de7-2ab6b356cb06"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYTNhZmFhMy1lMTQwLTQ3NzEtOGRlNy0yYWI2YjM1NmNiMDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDY0MDYsImlhdCI6MTc5MzQwNTUwNiwianRpIjoiZDg3OTJhODQtZTYwMC00YzA5LWI5ODktNDIxOWRmNDNmYmM1Iiwic2lkIjoiNDE4N2M2YTgtMWYxZS00M2MzLWI1M2ItZGJkZmRhZGQwOTE5In0.gcITae2KFd53SmWC0mCqMbcZyWab7CO5vx9fPORenHg",
  "access_expires_at": "2026-10-31T00:26:46.79038988Z",
  "refresh_token": "r9EwlB2w-AcPh7kekWgFCnC5S-PZMU87PPR6iZcyqYw",
  "refresh_expires_at": "2026-10-31T12:11:46.789992712Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/dfba70a5-e48f-47a7-9dbf-64d02f7795aa/evidence` → **400**

```json
{
  "instance": "/api/admin/v1/orders/dfba70a5-e48f-47a7-9dbf-64d02f7795aa/evidence",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "59581beb-fe58-4dab-9aea-d9f904c95628"
}
```

`GET /api/admin/v1/orders/dfba70a5-e48f-47a7-9dbf-64d02f7795aa/evidence?reason=Bank%20request%20sandbox` → **200**

```json
{
  "generated_at": "2026-10-31T00:11:47.190910502Z",
  "order": {
    "id": "dfba70a5-e48f-47a7-9dbf-64d02f7795aa",
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
    "created_at": "2026-10-31T00:10:05.108759Z",
    "assigned_at": "2026-10-31T00:10:06.932996Z",
    "arrived_at": "2026-10-31T00:10:13.933437Z",
    "started_at": "2026-10-31T00:10:14.138591Z",
    "completed_at": "2026-10-31T00:11:44.559326Z"
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
    "id": "8b9cb216-e25f-42bd-bde3-e274d7ae31df",
    "registered_at": "2026-10-31T00:10:03.469604Z",
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
      "created_at": "2026-10-31T00:10:05.110274Z"
    },
    {
      "type": "SETTLE",
      "state": "SUCCEEDED",
      "amount_minor": 16297,
      "currency": "UAH",
      "provider_status": "Approved",
      "created_at": "2026-10-31T00:11:44.702384Z"
    }
  ],
  "chat": [
    {
```

## Finance records the chargeback: the rider owes the fare again, a case opens

`POST /api/admin/v1/orders/dfba70a5-e48f-47a7-9dbf-64d02f7795aa/chargebacks` → **422**

```json
{
  "command_id": "ccbb2d24-26bd-4162-ac5c-32d56254a8d7",
  "amount_minor": 16298,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-30"
}
```

```json
{
  "instance": "/api/admin/v1/orders/dfba70a5-e48f-47a7-9dbf-64d02f7795aa/chargebacks",
  "status": 422,
  "title": "Chargeback not allowed",
  "type": "https://errors.blizz.taxi/chargeback-not-allowed",
  "code": "CHARGEBACK_NOT_ALLOWED",
  "correlation_id": "4e1d083a-9364-4701-8bdc-d068061752ea"
}
```

`POST /api/admin/v1/orders/dfba70a5-e48f-47a7-9dbf-64d02f7795aa/chargebacks` → **201**

```json
{
  "command_id": "b2871985-8d83-466d-a7fd-9a781d51ee2c",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-30"
}
```

```json
{
  "id": "1503bcbc-e2dd-4873-8a36-05cf4bb51e40",
  "order_id": "dfba70a5-e48f-47a7-9dbf-64d02f7795aa",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-30",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-31T00:11:47.640134Z",
  "resolved_at": null,
  "version": 0
}
```

`POST /api/admin/v1/orders/dfba70a5-e48f-47a7-9dbf-64d02f7795aa/chargebacks` → **201**

```json
{
  "command_id": "b2871985-8d83-466d-a7fd-9a781d51ee2c",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-30"
}
```

```json
{
  "id": "1503bcbc-e2dd-4873-8a36-05cf4bb51e40",
  "order_id": "dfba70a5-e48f-47a7-9dbf-64d02f7795aa",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-30",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-31T00:11:47.640134Z",
  "resolved_at": null,
  "version": 0
}
```

`GET /api/admin/v1/clients/8b9cb216-e25f-42bd-bde3-e274d7ae31df` → **200**

```json
{
  "client": {
    "id": "8b9cb216-e25f-42bd-bde3-e274d7ae31df",
    "phone": "+380730765486",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-31T00:10:03.469604Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "dfba70a5-e48f-47a7-9dbf-64d02f7795aa",
      "short_number": 11,
      "status": "FULFILLED",
      "created_at": "2026-10-31T00:10:05.108759Z",
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

`POST /api/admin/v1/orders/dfba70a5-e48f-47a7-9dbf-64d02f7795aa/chargebacks/1503bcbc-e2dd-4873-8a36-05cf4bb51e40/resolve` → **200**

```json
{
  "command_id": "d9d20ecb-9a50-4379-a20e-b2a7a207b786",
  "expected_version": 0,
  "outcome": "WON",
  "reason": "Evidence accepted"
}
```

```json
{
  "id": "1503bcbc-e2dd-4873-8a36-05cf4bb51e40",
  "order_id": "dfba70a5-e48f-47a7-9dbf-64d02f7795aa",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-30",
  "state": "WON",
  "resolution_reason": "Evidence accepted",
  "created_at": "2026-10-31T00:11:47.640134Z",
  "resolved_at": "2026-10-31T00:11:48.253993Z",
  "version": 1
}
```

`GET /api/admin/v1/clients/8b9cb216-e25f-42bd-bde3-e274d7ae31df` → **200**

```json
{
  "client": {
    "id": "8b9cb216-e25f-42bd-bde3-e274d7ae31df",
    "phone": "+380730765486",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-31T00:10:03.469604Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "dfba70a5-e48f-47a7-9dbf-64d02f7795aa",
      "short_number": 11,
      "status": "FULFILLED",
      "created_at": "2026-10-31T00:10:05.108759Z",
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

`GET /api/admin/v1/clients/8b9cb216-e25f-42bd-bde3-e274d7ae31df` → **200**

```json
{
  "client": {
    "id": "8b9cb216-e25f-42bd-bde3-e274d7ae31df",
    "phone": "+380730765486",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-31T00:10:03.469604Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "dfba70a5-e48f-47a7-9dbf-64d02f7795aa",
      "short_number": 11,
      "status": "FULFILLED",
      "created_at": "2026-10-31T00:10:05.108759Z",
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

`POST /api/admin/v1/orders/dfba70a5-e48f-47a7-9dbf-64d02f7795aa/chargebacks/1503bcbc-e2dd-4873-8a36-05cf4bb51e40/resolve` → **409**

```json
{
  "command_id": "941b8c59-7c3c-487c-8cb8-d71e96c7fa93",
  "expected_version": 1,
  "outcome": "LOST",
  "reason": "Twice"
}
```

```json
{
  "instance": "/api/admin/v1/orders/dfba70a5-e48f-47a7-9dbf-64d02f7795aa/chargebacks/1503bcbc-e2dd-4873-8a36-05cf4bb51e40/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "f2ae6afc-ccb3-4344-a55c-298df7b75f94"
}
```

`GET /api/admin/v1/orders/dfba70a5-e48f-47a7-9dbf-64d02f7795aa/chargebacks` → **200**

```json
{
  "chargebacks": [
    {
      "id": "1503bcbc-e2dd-4873-8a36-05cf4bb51e40",
      "order_id": "dfba70a5-e48f-47a7-9dbf-64d02f7795aa",
      "amount_minor": 16297,
      "currency": "UAH",
      "bank_reason": "4837 No cardholder authorization",
      "received_on": "2026-10-30",
      "state": "WON",
      "resolution_reason": "Evidence accepted",
      "created_at": "2026-10-31T00:11:47.640134Z",
      "resolved_at": "2026-10-31T00:11:48.253993Z",
      "version": 1
    }
  ]
}
```

Done: the evidence of card order dfba70a5-e48f-47a7-9dbf-64d02f7795aa without phone or card digits; chargeback 1503bcbc-e2dd-4873-8a36-05cf4bb51e40 recorded and won.

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
  "session_id": "1d2ded91-f153-4078-8d41-910d65281a6c",
  "subject": {
    "type": "STAFF",
    "id": "2a3afaa3-e140-4771-8de7-2ab6b356cb06"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYTNhZmFhMy1lMTQwLTQ3NzEtOGRlNy0yYWI2YjM1NmNiMDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDY0MTAsImlhdCI6MTc5MzQwNTUxMCwianRpIjoiOTkyZDQ5NjAtNWY3OS00Mzc0LTk2M2ItNGViNDljYzMyMTE1Iiwic2lkIjoiMWQyZGVkOTEtZjE1My00MDc4LThkNDEtOTEwZDY1MjgxYTZjIn0.xG_bmD19KR0DfCu19lqgwQCfNw9pvOwIaFVR1uS5r1Y",
  "access_expires_at": "2026-10-31T00:26:50.696394374Z",
  "refresh_token": "9M7-yMOm0sc9zhYAd892C7-qD_nViUg_A7-1GNjsNFw",
  "refresh_expires_at": "2026-10-31T12:11:50.695850381Z",
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
  "phone": "+48600921750",
  "device_ref": "sandbox-12781"
}
```

```json
{
  "challenge_id": "9f3b7b11-8f3a-4849-9455-72d1301a9abe",
  "expires_at": "2026-10-31T00:16:51.280413726Z",
  "resend_available_at": "2026-10-31T00:11:52.280413726Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600921750` → **200**

```json
{
  "phone": "+48600921750",
  "audience": "CLIENT",
  "code": "370866",
  "sent_at": "2026-10-31T00:11:51.282410262Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9f3b7b11-8f3a-4849-9455-72d1301a9abe",
  "code": "370866",
  "device_ref": "sandbox-12781"
}
```

```json
{
  "session_id": "27dccfe4-defc-47d4-b2e2-a5edc70bd30d",
  "subject": {
    "type": "CLIENT",
    "id": "c048252b-ea8a-4c47-ae7c-dfeadb936729"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMDQ4MjUyYi1lYThhLTRjNDctYWU3Yy1kZmVhZGI5MzY3MjkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDA2NDExLCJpYXQiOjE3OTM0MDU1MTEsImp0aSI6IjUxNWMyMDJmLWFlYmEtNDAyMy1hYjk2LTFlZDg0NDU1NmViOSIsInNpZCI6IjI3ZGNjZmU0LWRlZmMtNDdkNC1iMmUyLWE1ZWRjNzBiZDMwZCJ9.ivxgxJ0VXkYxSJyb0Rndfs7ANv7Bj1QDsNe4Hh5g3Xw",
  "access_expires_at": "2026-10-31T00:26:51.500857042Z",
  "refresh_token": "SadVfERFYGa2WGvgEdBF_ip3viu4jXfbTezVz4_Zn98",
  "refresh_expires_at": "2026-11-30T00:11:51.500467405Z",
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
  "command_id": "deaa2a4c-9ffb-42f2-aa05-d92c4cbbf44a",
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
  "correlation_id": "52ac3870-5378-43d0-8eba-40157a5ccd61",
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
  "command_id": "b21b39fa-8f3d-480d-951b-4072e7f85ac9",
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
  "paused_at": "2026-10-31T00:11:52.26791645Z",
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
  "command_id": "d2e02e7b-9efc-4e68-9875-11840b5ad8d8",
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
  "id": "2fffe520-4589-4481-bddd-a502d6d4963a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T00:16:52.673062Z",
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
  "command_id": "0c983077-e35f-438c-a66e-f1c629d81618",
  "quote_id": "2fffe520-4589-4481-bddd-a502d6d4963a",
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
  "correlation_id": "7566a060-c283-4bb4-b52a-9c0da5d1a2f9"
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
  "paused_at": "2026-10-31T00:11:52.267916Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "a1a2ab48-0740-454b-8344-676bfed13a86",
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
  "command_id": "913813e2-c799-4a86-94d4-59cd1997fef3",
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
  "command_id": "5f793194-7184-46a0-9f69-b09c0f25a49c",
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
  "id": "095c1d89-d313-418a-b13b-0237a593aeb1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T00:16:53.931159Z",
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
  "command_id": "cc9681c7-2ed7-4ad3-aaf7-d7211fb33a92",
  "quote_id": "095c1d89-d313-418a-b13b-0237a593aeb1",
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
  "correlation_id": "0bb074eb-7c2e-4e2b-a28d-1ece03751850"
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
  "command_id": "2f444286-abd3-4e94-b6c4-a772e239633a",
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
      "from": "03:00",
      "to": "04:00"
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
      "from": "03:00",
      "to": "04:00"
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
  "command_id": "d2dad1a8-2f7d-4383-97d4-912cd0c1d332",
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
  "id": "7c562872-1514-43ce-af44-6955ee6f09a6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T00:16:54.747171Z",
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
  "command_id": "df6f4fff-10de-4c3b-ab1f-10edbe4978c5",
  "quote_id": "7c562872-1514-43ce-af44-6955ee6f09a6",
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
  "correlation_id": "d0008df9-fb05-42d9-bcdb-ea030752e4d8"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "55739e02-01ca-49d4-9df6-b415d14e9baf",
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
  "correlation_id": "08149954-4247-4eac-b104-b1cbd584ce08",
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
      "from": "03:00",
      "to": "04:00"
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
  "command_id": "9278d76b-1097-42a4-8e4d-cb1d8b74cd35",
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
  "phone": "+380670799110",
  "device_ref": "sandbox-10854"
}
```

```json
{
  "challenge_id": "c3fe071e-7dd2-4d8e-ac60-6e594770e5ec",
  "expires_at": "2026-10-31T00:16:55.772952453Z",
  "resend_available_at": "2026-10-31T00:11:56.772952453Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380670799110` → **200**

```json
{
  "phone": "+380670799110",
  "audience": "CLIENT",
  "code": "057887",
  "sent_at": "2026-10-31T00:11:55.774894437Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c3fe071e-7dd2-4d8e-ac60-6e594770e5ec",
  "code": "057887",
  "device_ref": "sandbox-10854"
}
```

```json
{
  "session_id": "c31b822b-ddc6-47bf-82b9-51e1e1861b5f",
  "subject": {
    "type": "CLIENT",
    "id": "edeb6928-f289-4de3-b0bf-ca3ab812ba5a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZGViNjkyOC1mMjg5LTRkZTMtYjBiZi1jYTNhYjgxMmJhNWEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDA2NDE1LCJpYXQiOjE3OTM0MDU1MTUsImp0aSI6ImE0MDlhYjJlLWFkY2YtNGM2NC04MGFjLWVmNjVkYjMyYTRhYiIsInNpZCI6ImMzMWI4MjJiLWRkYzYtNDdiZi04MmI5LTUxZTFlMTg2MWI1ZiJ9.wZ2tnFWgAUx0pJJKNUaneaH-vMOHIrffhIpBntTfD44",
  "access_expires_at": "2026-10-31T00:26:55.99013682Z",
  "refresh_token": "hHQIzS9D11BNeAew_pXzdlVLeF6Rg-O5_bWU5XfzaoA",
  "refresh_expires_at": "2026-11-30T00:11:55.989757939Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "edeb6928-f289-4de3-b0bf-ca3ab812ba5a",
  "session_id": "c31b822b-ddc6-47bf-82b9-51e1e1861b5f",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "496119dc-2234-495b-bbdd-097a2c9c137e",
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
  "id": "61162281-f6b7-491e-9c8f-93e70edddb58",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T00:16:56.376309Z",
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
  "challenge_id": "3b0e9dc3-9d63-49cf-bb73-4d86772e0ff7",
  "expires_at": "2026-10-31T00:16:58.619211279Z",
  "resend_available_at": "2026-10-31T00:11:59.619211279Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670799110` → **200**

```json
{
  "phone": "+380670799110",
  "audience": "CLIENT",
  "code": "690120",
  "sent_at": "2026-10-31T00:11:58.620787793Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "736d91b5-a352-49a8-be9d-a98d74c81cd2",
  "challenge_id": "3b0e9dc3-9d63-49cf-bb73-4d86772e0ff7",
  "otp_code": "690120"
}
```

```json
{
  "client_id": "edeb6928-f289-4de3-b0bf-ca3ab812ba5a",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-31T00:11:58.839624772Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "94a10299-fa64-428f-bc2e-755e519added",
  "quote_id": "61162281-f6b7-491e-9c8f-93e70edddb58",
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
  "correlation_id": "8c181f05-8653-42ec-8758-10656d1ab1c8"
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
  "session_id": "01739536-e4bd-4059-a525-ce66576224f4",
  "subject": {
    "type": "STAFF",
    "id": "2a3afaa3-e140-4771-8de7-2ab6b356cb06"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYTNhZmFhMy1lMTQwLTQ3NzEtOGRlNy0yYWI2YjM1NmNiMDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDY0MTksImlhdCI6MTc5MzQwNTUxOSwianRpIjoiZjUzM2FjYWQtYmNjZC00NTRjLWIxNzktYWFkOGEwZmRhZjgyIiwic2lkIjoiMDE3Mzk1MzYtZTRiZC00MDU5LWE1MjUtY2U2NjU3NjIyNGY0In0.VLtu9J3HMKkPYM_0JuiJ2USGkS9U8YxzxFTwveb2fVE",
  "access_expires_at": "2026-10-31T00:26:59.46148212Z",
  "refresh_token": "emJM3k1DXaDp6LcamcwrZDbYtB5z7m5hZ8z0Q-lwPQY",
  "refresh_expires_at": "2026-10-31T12:11:59.460695916Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "edeb6928-f289-4de3-b0bf-ca3ab812ba5a",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-31T00:11:58.839625Z",
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

`POST /api/admin/v1/client-deletions/edeb6928-f289-4de3-b0bf-ca3ab812ba5a/complete` → **200**

```json
{
  "command_id": "72ffb790-34fa-4994-9371-976e07b3dc0e",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "edeb6928-f289-4de3-b0bf-ca3ab812ba5a",
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
  "correlation_id": "ec6a592c-8665-4217-8341-54351fc0b1f2"
}
```

Done: client edeb6928-f289-4de3-b0bf-ca3ab812ba5a anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380663463593",
  "device_ref": "sandbox-25600"
}
```

```json
{
  "challenge_id": "3db77c56-9e45-49e3-8ab7-784ee2865cc8",
  "expires_at": "2026-10-31T00:17:00.242653365Z",
  "resend_available_at": "2026-10-31T00:12:01.242653365Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380663463593` → **200**

```json
{
  "phone": "+380663463593",
  "audience": "CLIENT",
  "code": "807949",
  "sent_at": "2026-10-31T00:12:00.24465726Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3db77c56-9e45-49e3-8ab7-784ee2865cc8",
  "code": "807949",
  "device_ref": "sandbox-25600"
}
```

```json
{
  "session_id": "dd7f129d-79cc-4851-b6f0-881d3ebaf77b",
  "subject": {
    "type": "CLIENT",
    "id": "655d8e36-fb6b-4b5f-b96b-275549731e91"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NTVkOGUzNi1mYjZiLTRiNWYtYjk2Yi0yNzU1NDk3MzFlOTEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDA2NDIwLCJpYXQiOjE3OTM0MDU1MjAsImp0aSI6ImMzYTdmNGJmLTBiOTEtNGVjMi05MTY4LWFkZDI3ZTAwYThkMyIsInNpZCI6ImRkN2YxMjlkLTc5Y2MtNDg1MS1iNmYwLTg4MWQzZWJhZjc3YiJ9.Mn9ZQw5Kl9At6rOZ9D40fIsvauSuuOyHU8m_4lEkEQw",
  "access_expires_at": "2026-10-31T00:27:00.457965527Z",
  "refresh_token": "wZFYKaPC8s2DQEFZ_Nu8JHHYIo78Vc-wDibqrVJKp3U",
  "refresh_expires_at": "2026-11-30T00:12:00.457596121Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "655d8e36-fb6b-4b5f-b96b-275549731e91",
  "session_id": "dd7f129d-79cc-4851-b6f0-881d3ebaf77b",
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
  "session_id": "5ed665f6-ae58-4efa-9035-3eebbfba9914",
  "subject": {
    "type": "STAFF",
    "id": "2a3afaa3-e140-4771-8de7-2ab6b356cb06"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYTNhZmFhMy1lMTQwLTQ3NzEtOGRlNy0yYWI2YjM1NmNiMDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDY0MjEsImlhdCI6MTc5MzQwNTUyMSwianRpIjoiODlmMzhiYzctZjZhNS00ZmI4LWIxNmMtNTFhZWZiZTIwZjVjIiwic2lkIjoiNWVkNjY1ZjYtYWU1OC00ZWZhLTkwMzUtM2VlYmJmYmE5OTE0In0.CJWsiPHeaRaUsRlQ6SzXEe-THG8QCnLtO_QODSnXvX8",
  "access_expires_at": "2026-10-31T00:27:01.047195811Z",
  "refresh_token": "VoMf_m7ssXnZs1vf9gxwiHMOQEW9VOcjKR9qXIZRlw8",
  "refresh_expires_at": "2026-10-31T12:12:01.046796389Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=3463593&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "655d8e36-fb6b-4b5f-b96b-275549731e91",
      "phone": "+380663463593",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-31T00:12:00.45632Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/655d8e36-fb6b-4b5f-b96b-275549731e91` → **200**

```json
{
  "client": {
    "id": "655d8e36-fb6b-4b5f-b96b-275549731e91",
    "phone": "+380663463593",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-31T00:12:00.45632Z",
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

`POST /api/admin/v1/clients/655d8e36-fb6b-4b5f-b96b-275549731e91/block` → **400**

```json
{
  "command_id": "5cbb9a7d-f7c9-4edb-ba6f-b8c268dd8adf",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/655d8e36-fb6b-4b5f-b96b-275549731e91/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "0b63828d-96b4-42a4-b40a-aa958e43a900",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/655d8e36-fb6b-4b5f-b96b-275549731e91/block` → **200**

```json
{
  "command_id": "d7800e2f-0338-41f1-b82a-e253611fbf32",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "655d8e36-fb6b-4b5f-b96b-275549731e91",
  "phone": "+380663463593",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-31T00:12:00.45632Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-31T00:12:01.875209Z",
    "by": "2a3afaa3-e140-4771-8de7-2ab6b356cb06"
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
  "correlation_id": "bfd0c38d-c754-4c42-839f-7bdcef15135d"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380663463593",
  "device_ref": "sandbox-8901"
}
```

```json
{
  "challenge_id": "2758f9a7-043f-4c7d-8ab4-a127a75a8a43",
  "expires_at": "2026-10-31T00:17:04.255043286Z",
  "resend_available_at": "2026-10-31T00:12:05.255043286Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380663463593` → **200**

```json
{
  "phone": "+380663463593",
  "audience": "CLIENT",
  "code": "623363",
  "sent_at": "2026-10-31T00:12:04.256929422Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "2758f9a7-043f-4c7d-8ab4-a127a75a8a43",
  "code": "623363",
  "device_ref": "sandbox-8901"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "beeae5be-a885-4530-8bbc-a01ac9d62f4d"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/655d8e36-fb6b-4b5f-b96b-275549731e91` → **200**

```json
{
  "client": {
    "id": "655d8e36-fb6b-4b5f-b96b-275549731e91",
    "phone": "+380663463593",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-31T00:12:00.45632Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-31T00:12:01.875209Z",
      "by": "2a3afaa3-e140-4771-8de7-2ab6b356cb06"
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

`POST /api/admin/v1/clients/655d8e36-fb6b-4b5f-b96b-275549731e91/unblock` → **200**

```json
{
  "command_id": "390d15ab-4f8d-4f15-9da6-96136c334db5",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "655d8e36-fb6b-4b5f-b96b-275549731e91",
  "phone": "+380663463593",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-31T00:12:00.45632Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380663463593",
  "device_ref": "sandbox-1433"
}
```

```json
{
  "challenge_id": "a468bb15-b556-4dd2-8343-12aeadc244ae",
  "expires_at": "2026-10-31T00:17:07.070090144Z",
  "resend_available_at": "2026-10-31T00:12:08.070090144Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380663463593` → **200**

```json
{
  "phone": "+380663463593",
  "audience": "CLIENT",
  "code": "728033",
  "sent_at": "2026-10-31T00:12:07.071743268Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a468bb15-b556-4dd2-8343-12aeadc244ae",
  "code": "728033",
  "device_ref": "sandbox-1433"
}
```

```json
{
  "session_id": "824a357d-002c-4df3-b56d-75cc54d88b23",
  "subject": {
    "type": "CLIENT",
    "id": "655d8e36-fb6b-4b5f-b96b-275549731e91"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NTVkOGUzNi1mYjZiLTRiNWYtYjk2Yi0yNzU1NDk3MzFlOTEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDA2NDI3LCJpYXQiOjE3OTM0MDU1MjcsImp0aSI6IjBiZTBiZmIwLWE1NjctNGI3NC04OTMzLWMwYjc5NTU0OGVlOSIsInNpZCI6IjgyNGEzNTdkLTAwMmMtNGRmMy1iNTZkLTc1Y2M1NGQ4OGIyMyJ9.K44aEr7F-_M7AhhIXUMp7BbO-r8TbFAvyOPolNrRYHA",
  "access_expires_at": "2026-10-31T00:27:07.279052988Z",
  "refresh_token": "meW818eYDl1XTivX1nSKH43zc2vtCl_avUsliKpFx5I",
  "refresh_expires_at": "2026-11-30T00:12:07.278715239Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "655d8e36-fb6b-4b5f-b96b-275549731e91",
  "session_id": "824a357d-002c-4df3-b56d-75cc54d88b23",
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
  "phone": "+380662194951",
  "device_ref": "sandbox-2252"
}
```

```json
{
  "challenge_id": "d52d11c9-2aed-4b74-ae4e-0bb64db62390",
  "expires_at": "2026-10-31T00:17:07.662480689Z",
  "resend_available_at": "2026-10-31T00:12:08.662480689Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380662194951` → **200**

```json
{
  "phone": "+380662194951",
  "audience": "CLIENT",
  "code": "628026",
  "sent_at": "2026-10-31T00:12:07.664168871Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d52d11c9-2aed-4b74-ae4e-0bb64db62390",
  "code": "628026",
  "device_ref": "sandbox-2252"
}
```

```json
{
  "session_id": "5993ae78-da97-4f34-9838-5c14e81e6aa1",
  "subject": {
    "type": "CLIENT",
    "id": "4cb3318e-20c8-441f-bc48-6cae951a5aea"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0Y2IzMzE4ZS0yMGM4LTQ0MWYtYmM0OC02Y2FlOTUxYTVhZWEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDA2NDI3LCJpYXQiOjE3OTM0MDU1MjcsImp0aSI6IjEzMjE3Y2RmLTg3N2YtNGExZC05NjZlLTc2NThlMDM3OGFlOSIsInNpZCI6IjU5OTNhZTc4LWRhOTctNGYzNC05ODM4LTVjMTRlODFlNmFhMSJ9.xEwj5WwoUb70V1Sb1xMBMmnFjK6frcILihJToH0l644",
  "access_expires_at": "2026-10-31T00:27:07.872913338Z",
  "refresh_token": "YwoqYtqTkzP2Mg8n1lFbxWoyCo4JJi3Sf1jiBrpuyqI",
  "refresh_expires_at": "2026-11-30T00:12:07.872503401Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "fc66940f-32db-46c2-86e1-22a96240b35f",
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
  "id": "52cbca39-e032-42bc-a01d-5c0a3eb4d758",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T00:17:08.067559Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: 90a4071c-99e5-4644-925a-7a6462f41794) → **201**

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
  "session_id": "6751a2c1-08da-4f09-9c27-181182066585",
  "subject": {
    "type": "STAFF",
    "id": "2a3afaa3-e140-4771-8de7-2ab6b356cb06"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYTNhZmFhMy1lMTQwLTQ3NzEtOGRlNy0yYWI2YjM1NmNiMDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDY0MjgsImlhdCI6MTc5MzQwNTUyOCwianRpIjoiNzQ3NzEwZjUtMTY0MS00Y2U0LWEwNTgtZWI4Y2FiNTc0Njg0Iiwic2lkIjoiNjc1MWEyYzEtMDhkYS00ZjA5LTljMjctMTgxMTgyMDY2NTg1In0.L0R9eSfZG-n241KGYpaY8A6QTD8GCIK3WzvOsmNDHlk",
  "access_expires_at": "2026-10-31T00:27:08.513953463Z",
  "refresh_token": "8hheeYn2TASnG9dEaeWmPqHRDwNT0eoZnZr8UTMab_g",
  "refresh_expires_at": "2026-10-31T12:12:08.51353887Z",
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
  "session_id": "5a20bbf5-6d6c-4e71-81f3-3f9f9f1bc88c",
  "subject": {
    "type": "STAFF",
    "id": "2a3afaa3-e140-4771-8de7-2ab6b356cb06"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYTNhZmFhMy1lMTQwLTQ3NzEtOGRlNy0yYWI2YjM1NmNiMDYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDY0MjgsImlhdCI6MTc5MzQwNTUyOCwianRpIjoiZmQ3OTZmODctMmE0My00ZGViLWIzOTMtYjNlNjg1NTEwODYyIiwic2lkIjoiNWEyMGJiZjUtNmQ2Yy00ZTcxLTgxZjMtM2Y5ZjlmMWJjODhjIn0.u2p47A_1zWvB9jh_WmpmUpx-HCprXfuq_fD_CZntJ34",
  "access_expires_at": "2026-10-31T00:27:08.940015558Z",
  "refresh_token": "1MhAVpHe5NybtAQcDCxX47OW_glhK1zTAk7GBFgdo0E",
  "refresh_expires_at": "2026-10-31T12:12:08.939673803Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/29ce775b-5df8-442d-a7da-acaf056f8831/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-31T00:12:08.26692Z",
      "actor": {
        "type": "CLIENT",
        "id": "4cb3318e-20c8-441f-bc48-6cae951a5aea",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "29ce775b-5df8-442d-a7da-acaf056f8831",
        "quote_id": "52cbca39-e032-42bc-a01d-5c0a3eb4d758",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "90a4071c-99e5-4644-925a-7a6462f41794"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-31T00:12:08.268056Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "29ce775b-5df8-442d-a7da-acaf056f8831",
        "attempt_id": "cfbf599c-0234-4957-9ce0-72f6df8ed6e0",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "90a4071c-99e5-4644-925a-7a6462f41794"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-31T00:12:08.270226Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "29ce775b-5df8-442d-a7da-acaf056f8831",
        "attempt_id": "cfbf599c-0234-4957-9ce0-72f6df8ed6e0"
      },
      "correlation_id": "90a4071c-99e5-4644-925a-7a6462f41794"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "cfbf599c-0234-4957-9ce0-72f6df8ed6e0",
        "generation": 1,
        "started_at": "2026-10-31T00:12:08.267532Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-31T00:12:08.270226Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-31T00:12:08.268407Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/90a4071c-99e5-4644-925a-7a6462f41794` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "29ce775b-5df8-442d-a7da-acaf056f8831:0",
      "order_id": "29ce775b-5df8-442d-a7da-acaf056f8831",
      "at": "2026-10-31T00:12:08.26692Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "29ce775b-5df8-442d-a7da-acaf056f8831:1",
      "order_id": "29ce775b-5df8-442d-a7da-acaf056f8831",
      "at": "2026-10-31T00:12:08.268056Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "29ce775b-5df8-442d-a7da-acaf056f8831:2",
      "order_id": "29ce775b-5df8-442d-a7da-acaf056f8831",
      "at": "2026-10-31T00:12:08.270226Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/e93ee651-c58a-436c-8d4f-0477f4a58348` → **200**

```json
{
  "found": []
}
```

Done: request 90a4071c-99e5-4644-925a-7a6462f41794 — order 29ce775b-5df8-442d-a7da-acaf056f8831 found by its id.

`GET /api/rider/v1/orders/29ce775b-5df8-442d-a7da-acaf056f8831` → **200**

```json
{
  "id": "29ce775b-5df8-442d-a7da-acaf056f8831",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4cb3318e-20c8-441f-bc48-6cae951a5aea",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T00:12:08.266481Z",
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

`POST /api/rider/v1/orders/29ce775b-5df8-442d-a7da-acaf056f8831/cancel` → **200**

```json
{
  "command_id": "3ba746b2-01b7-457c-a9cd-2ad4473e482f",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "29ce775b-5df8-442d-a7da-acaf056f8831",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "4cb3318e-20c8-441f-bc48-6cae951a5aea",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T00:12:08.266481Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "en": "Changed my mind",
      "ru": "Передумал ехать",
      "pl": "Zmiana planów",
      "uk": "Передумав їхати"
    }
  },
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

# Scenario: data-export

## A rider signs in and asks for a code to confirm the copy

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634970810",
  "device_ref": "sandbox-8173"
}
```

```json
{
  "challenge_id": "7d780933-ed62-4db5-bd80-4fa29cf5a80d",
  "expires_at": "2026-10-31T00:17:10.197926803Z",
  "resend_available_at": "2026-10-31T00:12:11.197926803Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380634970810` → **200**

```json
{
  "phone": "+380634970810",
  "audience": "CLIENT",
  "code": "938407",
  "sent_at": "2026-10-31T00:12:10.199995478Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7d780933-ed62-4db5-bd80-4fa29cf5a80d",
  "code": "938407",
  "device_ref": "sandbox-8173"
}
```

```json
{
  "session_id": "76e97a2f-1960-4532-a546-2b9ae1306811",
  "subject": {
    "type": "CLIENT",
    "id": "77193e07-e4b4-45bb-b53a-00af2ef73247"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3NzE5M2UwNy1lNGI0LTQ1YmItYjUzYS0wMGFmMmVmNzMyNDciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDA2NDMwLCJpYXQiOjE3OTM0MDU1MzAsImp0aSI6ImVkMjNkY2QyLTEyMWMtNGZjOC1iMjVlLTQyOGM0NWM1OGZmYiIsInNpZCI6Ijc2ZTk3YTJmLTE5NjAtNDUzMi1hNTQ2LTJiOWFlMTMwNjgxMSJ9.P5LDZgZi-d2kjNcZmbJePMJVVeNxej9b3vf2eNIsVI0",
  "access_expires_at": "2026-10-31T00:27:10.407382679Z",
  "refresh_token": "lNNpnJ_ssDUaCG2MkbUD2-BCJd6zyZAjWogMVMzhCKU",
  "refresh_expires_at": "2026-11-30T00:12:10.406971248Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "c291660a-d104-4eae-ad5b-af99896aa53c",
  "expires_at": "2026-10-31T00:17:12.587856665Z",
  "resend_available_at": "2026-10-31T00:12:13.587856665Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634970810` → **200**

```json
{
  "phone": "+380634970810",
  "audience": "CLIENT",
  "code": "766149",
  "sent_at": "2026-10-31T00:12:12.589428692Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "7d946870-b788-4cc3-8891-9d02d3822b0f",
  "challenge_id": "c291660a-d104-4eae-ad5b-af99896aa53c",
  "otp_code": "766149"
}
```

```json
{
  "id": "bec1130b-7838-444e-8bb4-c3927db606b1",
  "state": "PENDING",
  "created_at": "2026-10-31T00:12:12.805743Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/bec1130b-7838-444e-8bb4-c3927db606b1` → **200**

```json
{
  "id": "bec1130b-7838-444e-8bb4-c3927db606b1",
  "state": "PENDING",
  "created_at": "2026-10-31T00:12:12.805743Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/bec1130b-7838-444e-8bb4-c3927db606b1` → **200**

```json
{
  "id": "bec1130b-7838-444e-8bb4-c3927db606b1",
  "state": "PENDING",
  "created_at": "2026-10-31T00:12:12.805743Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/bec1130b-7838-444e-8bb4-c3927db606b1` → **200**

```json
{
  "id": "bec1130b-7838-444e-8bb4-c3927db606b1",
  "state": "PENDING",
  "created_at": "2026-10-31T00:12:12.805743Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/bec1130b-7838-444e-8bb4-c3927db606b1` → **200**

```json
{
  "id": "bec1130b-7838-444e-8bb4-c3927db606b1",
  "state": "PENDING",
  "created_at": "2026-10-31T00:12:12.805743Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/bec1130b-7838-444e-8bb4-c3927db606b1` → **200**

```json
{
  "id": "bec1130b-7838-444e-8bb4-c3927db606b1",
  "state": "PENDING",
  "created_at": "2026-10-31T00:12:12.805743Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/bec1130b-7838-444e-8bb4-c3927db606b1` → **200**

```json
{
  "id": "bec1130b-7838-444e-8bb4-c3927db606b1",
  "state": "PENDING",
  "created_at": "2026-10-31T00:12:12.805743Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/bec1130b-7838-444e-8bb4-c3927db606b1` → **200**

```json
{
  "id": "bec1130b-7838-444e-8bb4-c3927db606b1",
  "state": "PENDING",
  "created_at": "2026-10-31T00:12:12.805743Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/bec1130b-7838-444e-8bb4-c3927db606b1` → **200**

```json
{
  "id": "bec1130b-7838-444e-8bb4-c3927db606b1",
  "state": "PENDING",
  "created_at": "2026-10-31T00:12:12.805743Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/bec1130b-7838-444e-8bb4-c3927db606b1` → **200**

```json
{
  "id": "bec1130b-7838-444e-8bb4-c3927db606b1",
  "state": "READY",
  "created_at": "2026-10-31T00:12:12.805743Z",
  "ready_at": "2026-10-31T00:12:22.464345Z",
  "expires_at": "2026-11-07T00:12:22.464345Z",
  "size_bytes": 1031
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/bec1130b-7838-444e-8bb4-c3927db606b1/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636651374",
  "device_ref": "sandbox-24731"
}
```

```json
{
  "challenge_id": "0d062273-2f74-4836-98ed-2195200168c5",
  "expires_at": "2026-10-31T00:17:22.677394097Z",
  "resend_available_at": "2026-10-31T00:12:23.677394097Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636651374` → **200**

```json
{
  "phone": "+380636651374",
  "audience": "CLIENT",
  "code": "029343",
  "sent_at": "2026-10-31T00:12:22.680036305Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0d062273-2f74-4836-98ed-2195200168c5",
  "code": "029343",
  "device_ref": "sandbox-24731"
}
```

```json
{
  "session_id": "29162a84-6be6-48d9-981d-0541e882fbe3",
  "subject": {
    "type": "CLIENT",
    "id": "92c3167c-fb94-4662-9d25-f5fd5301199a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MmMzMTY3Yy1mYjk0LTQ2NjItOWQyNS1mNWZkNTMwMTE5OWEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDA2NDQyLCJpYXQiOjE3OTM0MDU1NDIsImp0aSI6IjBiOThmNjFkLWM4NmItNDlmNC1hM2E1LWQ1MGM2YzcyMmY4MSIsInNpZCI6IjI5MTYyYTg0LTZiZTYtNDhkOS05ODFkLTA1NDFlODgyZmJlMyJ9.dNgyzeWymyEPdCVmWQM6UjKPx4FAH7F55HjNIkXSUh0",
  "access_expires_at": "2026-10-31T00:27:22.896290572Z",
  "refresh_token": "qFyTGECxNnOTZCEsz6wggwBFBf1RRjE-fTRYnZ_RX7c",
  "refresh_expires_at": "2026-11-30T00:12:22.89595672Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/bec1130b-7838-444e-8bb4-c3927db606b1/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/bec1130b-7838-444e-8bb4-c3927db606b1/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "d3095e4a-3457-4e38-9e47-61e919361c0f"
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
  "session_id": "d64d145e-8034-496e-bde6-030e1454fde6",
  "subject": {
    "type": "STAFF",
    "id": "2a3afaa3-e140-4771-8de7-2ab6b356cb06"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYTNhZmFhMy1lMTQwLTQ3NzEtOGRlNy0yYWI2YjM1NmNiMDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDY0NDMsImlhdCI6MTc5MzQwNTU0MywianRpIjoiMzljNjBjNzktZmZkNi00ZDE1LTlkMWItNDQwODI5Mzg1ZDE4Iiwic2lkIjoiZDY0ZDE0NWUtODAzNC00OTZlLWJkZTYtMDMwZTE0NTRmZGU2In0.x2EM7HdZ_uurEaBqYTvWFLypbBvhKq2hV7o4nhiFjGg",
  "access_expires_at": "2026-10-31T00:27:23.48926005Z",
  "refresh_token": "V_wLyfX7bCwqUlO-ycenrbYlPaSNRyrFwiZCxZsGwuA",
  "refresh_expires_at": "2026-10-31T12:12:23.488773095Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "77193e07-e4b4-45bb-b53a-00af2ef73247",
  "session_id": "76e97a2f-1960-4532-a546-2b9ae1306811",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/77193e07-e4b4-45bb-b53a-00af2ef73247/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "bec1130b-7838-444e-8bb4-c3927db606b1",
      "state": "READY",
      "created_at": "2026-10-31T00:12:12.805743Z",
      "ready_at": "2026-10-31T00:12:22.464345Z",
      "expires_at": "2026-11-07T00:12:22.464345Z",
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
  "device_ref": "sandbox-8915"
}
```

```json
{
  "challenge_id": "1503f7f9-09f9-4973-989d-17e2daa00a9b",
  "expires_at": "2026-10-31T00:17:24.065602662Z",
  "resend_available_at": "2026-10-31T00:12:25.065602662Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "535566",
  "sent_at": "2026-10-31T00:12:24.067775122Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1503f7f9-09f9-4973-989d-17e2daa00a9b",
  "code": "535566",
  "device_ref": "sandbox-8915"
}
```

```json
{
  "session_id": "4a3ed7c7-3945-4dc9-93c6-4fef5f919b00",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwNjQ0NCwiaWF0IjoxNzkzNDA1NTQ0LCJqdGkiOiJjYzcyMjg5Ny1lODY5LTQyNWUtYmRkZC1mYTJlYmVjNTgwOWIiLCJzaWQiOiI0YTNlZDdjNy0zOTQ1LTRkYzktOTNjNi00ZmVmNWY5MTliMDAifQ.N3ElmV1iPh7AcoIJpBS2s0I7s22iPZjRYZYMXqTsHx0",
  "access_expires_at": "2026-10-31T00:27:24.286777088Z",
  "refresh_token": "HVBlwTMFl8oCHrssVIIXINVCcXYzA5tazUdpM_9leLs",
  "refresh_expires_at": "2026-11-30T00:12:24.286361933Z",
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
  "device_ref": "sandbox-687"
}
```

```json
{
  "challenge_id": "d600fae0-6538-4bfd-8816-1822dd3cffec",
  "expires_at": "2026-10-31T00:17:24.674039034Z",
  "resend_available_at": "2026-10-31T00:12:25.674039034Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "576602",
  "sent_at": "2026-10-31T00:12:24.676117858Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d600fae0-6538-4bfd-8816-1822dd3cffec",
  "code": "576602",
  "device_ref": "sandbox-687"
}
```

```json
{
  "session_id": "3279c066-0db7-49ca-826f-d3c6e16c6894",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwNjQ0NCwiaWF0IjoxNzkzNDA1NTQ0LCJqdGkiOiJiMDNkMWIzZS1iMjZmLTRiMzAtOTI4OS0xNzk4N2I1YWQzYjMiLCJzaWQiOiIzMjc5YzA2Ni0wZGI3LTQ5Y2EtODI2Zi1kM2M2ZTE2YzY4OTQifQ.LRA6TR0EAHgFZcLAV0ws4TLfHGRH2lhEQMEijAXslSc",
  "access_expires_at": "2026-10-31T00:27:24.890953834Z",
  "refresh_token": "Yw5DpZyIjhzCyqC40-6Je3vzcLE_-L0M4rLENEdxQ2g",
  "refresh_expires_at": "2026-11-30T00:12:24.890491014Z",
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
  "command_id": "a53dae70-b8a7-4d17-b1e0-4cd712bffe29",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T00:12:25Z",
    "sequence": 1793405545295
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c731d581-d6d6-457b-bf45-19be8bb29852",
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
  "last_heartbeat_at": "2026-10-31T00:12:25.314028Z",
  "last_location_at": "2026-10-31T00:12:25.314028Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-32732"
}
```

```json
{
  "challenge_id": "b1230252-f8f7-4aba-991d-db855aeac273",
  "expires_at": "2026-10-31T00:17:25.515359896Z",
  "resend_available_at": "2026-10-31T00:12:26.515359896Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "229667",
  "sent_at": "2026-10-31T00:12:25.517325465Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b1230252-f8f7-4aba-991d-db855aeac273",
  "code": "229667",
  "device_ref": "sandbox-32732"
}
```

```json
{
  "session_id": "c5b83c85-feb6-4bfa-8f71-fd08669bb603",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwNjQ0NSwiaWF0IjoxNzkzNDA1NTQ1LCJqdGkiOiIyODY1NThjOC01YjI3LTQyMTItOTNkMy01YTY1YTRkNDI2NjMiLCJzaWQiOiJjNWI4M2M4NS1mZWI2LTRiZmEtOGY3MS1mZDA4NjY5YmI2MDMifQ.74h47cyoRtNrZKk0RCxh1rGpU56pSDNRSiDQz4zeVEU",
  "access_expires_at": "2026-10-31T00:27:25.738520683Z",
  "refresh_token": "IxfNZrdA0TTdGDKqL345D1zRfpgdWvge7ttju1lgXxE",
  "refresh_expires_at": "2026-11-30T00:12:25.738118888Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "7e86b75c-f06c-4584-9115-8a52bda4e32f",
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
  "last_heartbeat_at": "2026-10-31T00:08:44.110717Z",
  "last_location_at": "2026-10-31T00:08:44.110717Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/7e86b75c-f06c-4584-9115-8a52bda4e32f/handover` → **200**

```json
{
  "command_id": "a3255a69-9acd-4746-bc1f-57d3296af704",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "7e86b75c-f06c-4584-9115-8a52bda4e32f",
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
  "last_heartbeat_at": "2026-10-31T00:08:44.110717Z",
  "last_location_at": "2026-10-31T00:08:44.110717Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/7e86b75c-f06c-4584-9115-8a52bda4e32f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T00:12:26Z",
    "sequence": 1793405546357
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "7e86b75c-f06c-4584-9115-8a52bda4e32f",
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
  "last_heartbeat_at": "2026-10-31T00:12:26.376057Z",
  "last_location_at": "2026-10-31T00:12:26.376057Z",
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
  "session_id": "e2a78140-d632-40d2-96c2-d3eff1fabdd8",
  "subject": {
    "type": "STAFF",
    "id": "2a3afaa3-e140-4771-8de7-2ab6b356cb06"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYTNhZmFhMy1lMTQwLTQ3NzEtOGRlNy0yYWI2YjM1NmNiMDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDY0NDYsImlhdCI6MTc5MzQwNTU0NiwianRpIjoiZjM2ZTZmNDktZmJkMy00ZGVmLTliMzQtOTllN2U1M2U4OTJiIiwic2lkIjoiZTJhNzgxNDAtZDYzMi00MGQyLTk2YzItZDNlZmYxZmFiZGQ4In0.5lmjwCfz1ynjAH4DzwYSluVoOaCuz2tOAq8PCjm_0M4",
  "access_expires_at": "2026-10-31T00:27:26.823887829Z",
  "refresh_token": "aZJbSFUSSPH9gmZvRQkfvK2aWuWQX42JTccEQ18IsqY",
  "refresh_expires_at": "2026-10-31T12:12:26.823553706Z",
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
  "session_id": "ad078ba0-8717-4725-b2b5-9286fa29caae",
  "subject": {
    "type": "STAFF",
    "id": "2a3afaa3-e140-4771-8de7-2ab6b356cb06"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYTNhZmFhMy1lMTQwLTQ3NzEtOGRlNy0yYWI2YjM1NmNiMDYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDY0NDcsImlhdCI6MTc5MzQwNTU0NywianRpIjoiNTFkYzI3MDUtZTg5Zi00Yzk5LTg2MTctMDdhMjllNjUyNDMwIiwic2lkIjoiYWQwNzhiYTAtODcxNy00NzI1LWIyYjUtOTI4NmZhMjljYWFlIn0.-U4YWqyscOKaFxwWPsdBSD57x0DB8R63L5SVX7u7qfs",
  "access_expires_at": "2026-10-31T00:27:27.212302719Z",
  "refresh_token": "gxecWG1mnd7iVbjMOj4s91yHwx7k7Y6rUrO0P8Ed1NE",
  "refresh_expires_at": "2026-10-31T12:12:27.211946933Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380687302302",
  "device_ref": "sandbox-16734"
}
```

```json
{
  "challenge_id": "96024466-d9ec-4513-b009-225da3b382f7",
  "expires_at": "2026-10-31T00:17:27.405124234Z",
  "resend_available_at": "2026-10-31T00:12:28.405124234Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380687302302` → **200**

```json
{
  "phone": "+380687302302",
  "audience": "CLIENT",
  "code": "577125",
  "sent_at": "2026-10-31T00:12:27.407152719Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "96024466-d9ec-4513-b009-225da3b382f7",
  "code": "577125",
  "device_ref": "sandbox-16734"
}
```

```json
{
  "session_id": "b57fb63b-2b4e-4c2f-ae31-0ffb9c38b024",
  "subject": {
    "type": "CLIENT",
    "id": "afa6ff46-37df-4217-b57c-f2f71cf73cce"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZmE2ZmY0Ni0zN2RmLTQyMTctYjU3Yy1mMmY3MWNmNzNjY2UiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDA2NDQ3LCJpYXQiOjE3OTM0MDU1NDcsImp0aSI6Ijg0NjNlNDI1LThiOGQtNGJhMy04ZDI1LTQ3NWJmOWQ3MzMwNCIsInNpZCI6ImI1N2ZiNjNiLTJiNGUtNGMyZi1hZTMxLTBmZmI5YzM4YjAyNCJ9.tjEgNWT2Ap0pSqdCsNoW9ec60enXtq8AWjqtp6Hx-qw",
  "access_expires_at": "2026-10-31T00:27:27.625661231Z",
  "refresh_token": "5F3YVn9eIyn-oDdNwm-MfA7uIbpLrXwaX_pnY_Us1aU",
  "refresh_expires_at": "2026-11-30T00:12:27.625346768Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "5a3ac423-780f-4785-84bc-8b3953a309bb",
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
  "id": "ba3f3f57-b170-4acc-930e-c095985f447e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T00:17:27.829969Z",
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
  "command_id": "191ca620-64e1-4faf-8bd2-7e22e13d53fb",
  "quote_id": "ba3f3f57-b170-4acc-930e-c095985f447e",
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
  "id": "ba91ac96-7ff2-4c3e-9191-4c8ec44840c3",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "afa6ff46-37df-4217-b57c-f2f71cf73cce",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T00:12:28.054493Z",
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

## The nearest driver declines, the next one accepts

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "6251fc3a-9c85-4717-9617-acbb6735fa26",
    "order_id": "ba91ac96-7ff2-4c3e-9191-4c8ec44840c3",
    "expires_at": "2026-10-31T00:12:43.056571Z",
    "server_time": "2026-10-31T00:12:28.27592521Z",
    "seconds_left": 14,
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
    "distance_m": 200,
    "price_kind": "FIXED",
    "expected_earnings_minor": 8939,
    "comment": null,
    "entrance": null
  }
]
```

`POST /api/driver/v1/offers/6251fc3a-9c85-4717-9617-acbb6735fa26/reject` → **204**

```json
{
  "command_id": "8044e285-571d-4720-ae61-b9d7bf3d4050"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "4207c9ac-6855-44d0-bebb-2048f6d5d374",
    "order_id": "ba91ac96-7ff2-4c3e-9191-4c8ec44840c3",
    "expires_at": "2026-10-31T00:12:43.532019Z",
    "server_time": "2026-10-31T00:12:28.575818272Z",
    "seconds_left": 14,
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
    "distance_m": 601,
    "price_kind": "FIXED",
    "expected_earnings_minor": 8939,
    "comment": null,
    "entrance": null
  }
]
```

`POST /api/driver/v1/offers/4207c9ac-6855-44d0-bebb-2048f6d5d374/accept` → **200**

```json
{
  "command_id": "27fc54df-8254-4a57-9835-77adc462e0fb"
}
```

```json
{
  "id": "c349d0d3-69dd-4ca0-9bbc-a9446b8c644f",
  "order_id": "ba91ac96-7ff2-4c3e-9191-4c8ec44840c3",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "4ae93882-9595-454e-9150-202da27d3608",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/ba91ac96-7ff2-4c3e-9191-4c8ec44840c3/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-31T00:12:28.054849Z",
      "actor": {
        "type": "CLIENT",
        "id": "afa6ff46-37df-4217-b57c-f2f71cf73cce",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "ba91ac96-7ff2-4c3e-9191-4c8ec44840c3",
        "quote_id": "ba3f3f57-b170-4acc-930e-c095985f447e",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "7eba62de-c62d-4210-8433-1e301c897fdf"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-31T00:12:28.056123Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "ba91ac96-7ff2-4c3e-9191-4c8ec44840c3",
        "attempt_id": "4f3db43f-3a16-43c4-b873-4948f6fd43f7",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "7eba62de-c62d-4210-8433-1e301c897fdf"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-31T00:12:28.05876Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "source": "AUTO",
        "offer_id": "6251fc3a-9c85-4717-9617-acbb6735fa26",
        "order_id": "ba91ac96-7ff2-4c3e-9191-4c8ec44840c3",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200,
        "expires_at": "2026-10-31T00:12:43.056571475Z"
      },
      "correlation_id": "7eba62de-c62d-4210-8433-1e301c897fdf"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-31T00:12:28.531093Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "6251fc3a-9c85-4717-9617-acbb6735fa26",
        "order_id": "ba91ac96-7ff2-4c3e-9191-4c8ec44840c3"
      },
      "correlation_id": "074bc9fd-d8ac-4060-bceb-e6f3966fff50"
    },
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order ba91ac96-7ff2-4c3e-9191-4c8ec44840c3 — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/ba91ac96-7ff2-4c3e-9191-4c8ec44840c3` → **200**

```json
{
  "id": "ba91ac96-7ff2-4c3e-9191-4c8ec44840c3",
  "short_number": 13,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "afa6ff46-37df-4217-b57c-f2f71cf73cce",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "c349d0d3-69dd-4ca0-9bbc-a9446b8c644f",
    "order_id": "ba91ac96-7ff2-4c3e-9191-4c8ec44840c3",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "4ae93882-9595-454e-9150-202da27d3608",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-31T00:12:28.054493Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null,
  "driver": {
    "name": "Олег Коваль",
    "make": "Toyota",
    "model": "Corolla",
    "color": "grey",
    "registration_number": "AA0002TX",
    "photo_url": null
  },
  "driver_change": null,
  "comment": null,
  "entrance": null
}
```

`POST /api/operator/v1/orders/ba91ac96-7ff2-4c3e-9191-4c8ec44840c3/cancel` → **200**

```json
{
  "command_id": "241512de-4c52-402f-a8fa-37a87655a364",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "ba91ac96-7ff2-4c3e-9191-4c8ec44840c3",
  "short_number": 13,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "afa6ff46-37df-4217-b57c-f2f71cf73cce",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "c349d0d3-69dd-4ca0-9bbc-a9446b8c644f",
    "order_id": "ba91ac96-7ff2-4c3e-9191-4c8ec44840c3",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "4ae93882-9595-454e-9150-202da27d3608",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-31T00:12:28.054493Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "en": "No cars available",
      "ru": "Нет свободных машин",
      "pl": "Brak wolnych aut",
      "uk": "Немає вільних авто"
    }
  },
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

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c731d581-d6d6-457b-bf45-19be8bb29852",
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
  "last_heartbeat_at": "2026-10-31T00:12:25.314028Z",
  "last_location_at": "2026-10-31T00:12:25.314028Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c731d581-d6d6-457b-bf45-19be8bb29852/close` → **200**

```json
{
  "command_id": "a9b8d2c0-d933-47d2-8d9d-3f0c291eb1ac",
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
  "session_id": "7e86b75c-f06c-4584-9115-8a52bda4e32f",
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
  "last_heartbeat_at": "2026-10-31T00:12:26.376057Z",
  "last_location_at": "2026-10-31T00:12:26.376057Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7e86b75c-f06c-4584-9115-8a52bda4e32f/close` → **200**

```json
{
  "command_id": "1f746f84-0fba-4ff9-81c6-fd99bcafe8ee",
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
  "device_ref": "sandbox-27082"
}
```

```json
{
  "challenge_id": "a0932617-d674-4b70-82eb-234f9a452864",
  "expires_at": "2026-10-31T00:17:30.599097394Z",
  "resend_available_at": "2026-10-31T00:12:31.599097394Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "299154",
  "sent_at": "2026-10-31T00:12:30.601592595Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a0932617-d674-4b70-82eb-234f9a452864",
  "code": "299154",
  "device_ref": "sandbox-27082"
}
```

```json
{
  "session_id": "eb68363b-e805-46d8-8336-7fe9edb439ae",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwNjQ1MCwiaWF0IjoxNzkzNDA1NTUwLCJqdGkiOiJlMDM4MzFiMy0xNzRhLTRhZjctYmY2ZC00OWQ3YjQ1Njc1NDgiLCJzaWQiOiJlYjY4MzYzYi1lODA1LTQ2ZDgtODMzNi03ZmU5ZWRiNDM5YWUifQ.8sh917Ka8oz65N2d9TgJ_Me1A0csTts_5oEEK5GwBl0",
  "access_expires_at": "2026-10-31T00:27:30.844246265Z",
  "refresh_token": "5HzuXrd3IkxNMT7NZHzNs4zNKYR3Q_ROlDre6iQUpyU",
  "refresh_expires_at": "2026-11-30T00:12:30.843831791Z",
  "account_created": false
}
```

`POST /api/driver/v1/documents/upload-sessions` → **201**

```json
{
  "command_id": "c9eff990-eaa1-4b5a-a651-b1c69b67076e",
  "content_type": "application/pdf",
  "size_bytes": 87
}
```

```json
{
  "file_id": "a5218cf1-5b63-48a6-a08f-31dd8d52118c",
  "upload_path": "/api/driver/v1/uploads/a5218cf1-5b63-48a6-a08f-31dd8d52118c",
  "expires_at": "2026-10-31T00:27:31.058793914Z",
  "max_bytes": 87
}
```

`PUT /api/driver/v1/uploads/a5218cf1-5b63-48a6-a08f-31dd8d52118c` → **200**

```json
{
  "file_id": "a5218cf1-5b63-48a6-a08f-31dd8d52118c",
  "state": "SAFE",
  "content_type": "application/pdf",
  "size_bytes": 87,
  "reject_reason": null
}
```

## On the server's disk the file is not the PDF

Stored at `driver_document/2026-10/a5218cf1-5b63-48a6-a08f-31dd8d52118c`, first bytes `425a46317d9b7fa4` (plain: `255044462d312e37` = %PDF-1.7).

## His download is exactly what he uploaded

`GET /api/driver/v1/files/a5218cf1-5b63-48a6-a08f-31dd8d52118c` → **200**

SHA-256 uploaded `76e41017531a6f0a9c9214bce8b43109e89d8eaebf3df2c80eee4b9f25bd8f67`, downloaded `76e41017531a6f0a9c9214bce8b43109e89d8eaebf3df2c80eee4b9f25bd8f67`.

Done: document a5218cf1-5b63-48a6-a08f-31dd8d52118c is encrypted on disk and downloads unchanged.

# Scenario: driver-block

## Only Andrii is online; he takes an order and starts the trip

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-10177"
}
```

```json
{
  "challenge_id": "99f6cfda-5247-46d0-a806-c747def80f55",
  "expires_at": "2026-10-31T00:17:31.383448823Z",
  "resend_available_at": "2026-10-31T00:12:32.383448823Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "111327",
  "sent_at": "2026-10-31T00:12:31.385597889Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "99f6cfda-5247-46d0-a806-c747def80f55",
  "code": "111327",
  "device_ref": "sandbox-10177"
}
```

```json
{
  "session_id": "c630043c-8f97-4341-a3e7-9ee65f966ae3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwNjQ1MSwiaWF0IjoxNzkzNDA1NTUxLCJqdGkiOiI2MWY4Y2E3OC04MzdjLTQxZmItOTgxOS1hNDU1MzY0ODE1YmEiLCJzaWQiOiJjNjMwMDQzYy04Zjk3LTQzNDEtYTNlNy05ZWU2NWY5NjZhZTMifQ.0puXcXDmKci2fGINavF903s7zPaNDCkHkI8fKMgSXi8",
  "access_expires_at": "2026-10-31T00:27:31.621322242Z",
  "refresh_token": "gh33-OfFoTKRyfmEhuLbm-pVwrOUR-DrgCLMGP2BiqI",
  "refresh_expires_at": "2026-11-30T00:12:31.620919095Z",
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
  "device_ref": "sandbox-25879"
}
```

```json
{
  "challenge_id": "22602983-2b5b-4dc7-9630-ad33fd0bf6cc",
  "expires_at": "2026-10-31T00:17:32.018370042Z",
  "resend_available_at": "2026-10-31T00:12:33.018370042Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "077347",
  "sent_at": "2026-10-31T00:12:32.020410745Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "22602983-2b5b-4dc7-9630-ad33fd0bf6cc",
  "code": "077347",
  "device_ref": "sandbox-25879"
}
```

```json
{
  "session_id": "d3f20883-06bd-4e6e-802e-22c56163a393",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwNjQ1MiwiaWF0IjoxNzkzNDA1NTUyLCJqdGkiOiJjOTYwOWQzMi0yMDY1LTQ3YzctOWNiZS03MDJiM2NhOTI1NTgiLCJzaWQiOiJkM2YyMDg4My0wNmJkLTRlNmUtODAyZS0yMmM1NjE2M2EzOTMifQ.0NDL9M9BaDspNt4Hdrcj39S0omwAbn21_03yXDCeuJU",
  "access_expires_at": "2026-10-31T00:27:32.236802455Z",
  "refresh_token": "ggbLgWTKKXrF_gLSXwMS2rKaye3xwp8pYBaj3D6DdPI",
  "refresh_expires_at": "2026-11-30T00:12:32.236433044Z",
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
  "session_id": "204e2807-c0c7-43e4-a133-b3d69e970af5",
  "subject": {
    "type": "STAFF",
    "id": "2a3afaa3-e140-4771-8de7-2ab6b356cb06"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYTNhZmFhMy1lMTQwLTQ3NzEtOGRlNy0yYWI2YjM1NmNiMDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDY0NTIsImlhdCI6MTc5MzQwNTU1MiwianRpIjoiZjU4MmUzM2MtOTljNS00ZDg5LTgyMTEtMThhZDQxZDM2Y2RlIiwic2lkIjoiMjA0ZTI4MDctYzBjNy00M2U0LWExMzMtYjNkNjllOTcwYWY1In0.8HtJsuQFkJciBPV9tGp2KLaQHJlN2MrRYulrGLLQwgc",
  "access_expires_at": "2026-10-31T00:27:32.822063132Z",
  "refresh_token": "E8KVEg2DLL3046KYJyE13Xe1R6ysiMkrXrJi_E_JWXg",
  "refresh_expires_at": "2026-10-31T12:12:32.821718934Z",
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
  "session_id": "1d292909-d021-44f6-ab61-340159c9e11a",
  "subject": {
    "type": "STAFF",
    "id": "2a3afaa3-e140-4771-8de7-2ab6b356cb06"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYTNhZmFhMy1lMTQwLTQ3NzEtOGRlNy0yYWI2YjM1NmNiMDYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDY0NTMsImlhdCI6MTc5MzQwNTU1MywianRpIjoiNjEyNzJiYjgtZGY5Ni00MjFhLWE0MTMtMTk3MmEzNjZlOTFiIiwic2lkIjoiMWQyOTI5MDktZDAyMS00NGY2LWFiNjEtMzQwMTU5YzllMTFhIn0.SGk3vH9DYvKZcZGWDzp6eYs6TgEwP72oHmvujGeGaFo",
  "access_expires_at": "2026-10-31T00:27:33.212462171Z",
  "refresh_token": "xL9wQc2tEKK0EuVX_0DucxgxNpDkErYHW7vzOkJHe3U",
  "refresh_expires_at": "2026-10-31T12:12:33.212031021Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-3537"
}
```

```json
{
  "challenge_id": "d0efaa57-346e-40a0-ada2-34128e85c5d1",
  "expires_at": "2026-10-31T00:17:33.411545144Z",
  "resend_available_at": "2026-10-31T00:12:34.411545144Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "947096",
  "sent_at": "2026-10-31T00:12:33.41357491Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d0efaa57-346e-40a0-ada2-34128e85c5d1",
  "code": "947096",
  "device_ref": "sandbox-3537"
}
```

```json
{
  "session_id": "242e4100-c5fa-48a9-bfbe-49e7c5cd8f34",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwNjQ1MywiaWF0IjoxNzkzNDA1NTUzLCJqdGkiOiI4YWNmZDc4Yi04N2ZhLTQ4YWMtYjZlYi1kNWQwNTFlZmE2YmMiLCJzaWQiOiIyNDJlNDEwMC1jNWZhLTQ4YTktYmZiZS00OWU3YzVjZDhmMzQifQ.ImIz5MYX65XpdiRXwF8xvCtgRyz7vsQ6mWEX152RdL0",
  "access_expires_at": "2026-10-31T00:27:33.635815492Z",
  "refresh_token": "pIMgiuJ4U7OxEvswuhKWuGzB6OrKSc-tAL4qlZOeCAk",
  "refresh_expires_at": "2026-11-30T00:12:33.635438324Z",
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

(the car drives 70 s to the next point)

`POST /api/driver/v1/work-sessions` → **201**

```json
{
  "command_id": "25a2e093-e128-435a-a4aa-0558bf35663e",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4528,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T00:13:44Z",
    "sequence": 1793405624540
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "f7fbccdb-14e4-4cf5-9294-54f4e378b956",
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
  "last_heartbeat_at": "2026-10-31T00:13:44.070375Z",
  "last_location_at": "2026-10-31T00:13:44.070375Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380686708537",
  "device_ref": "sandbox-30394"
}
```

```json
{
  "challenge_id": "c966bf7f-1a6f-4cf9-a497-7ae87640e487",
  "expires_at": "2026-10-31T00:18:44.26915836Z",
  "resend_available_at": "2026-10-31T00:13:45.26915836Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380686708537` → **200**

```json
{
  "phone": "+380686708537",
  "audience": "CLIENT",
  "code": "978542",
  "sent_at": "2026-10-31T00:13:44.271903873Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c966bf7f-1a6f-4cf9-a497-7ae87640e487",
  "code": "978542",
  "device_ref": "sandbox-30394"
}
```

```json
{
  "session_id": "c957ba5c-6352-4bf7-b218-7d53500d3182",
  "subject": {
    "type": "CLIENT",
    "id": "dcead340-43b5-41d7-939f-fca5fef06045"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkY2VhZDM0MC00M2I1LTQxZDctOTM5Zi1mY2E1ZmVmMDYwNDUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDA2NTI0LCJpYXQiOjE3OTM0MDU2MjQsImp0aSI6ImVkMzE4N2Y3LTNhNGEtNDljOS04OWZjLTdiYTVmY2EwYzU3ZSIsInNpZCI6ImM5NTdiYTVjLTYzNTItNGJmNy1iMjE4LTdkNTM1MDBkMzE4MiJ9.djWQUQswRYxHKLomFdkETo7yJnezt30nJEDs6lWYETU",
  "access_expires_at": "2026-10-31T00:28:44.490916708Z",
  "refresh_token": "0VzXIjFC15Hf91eg6A2JwEZ_zhusTRlf0tl6Vl_xd-4",
  "refresh_expires_at": "2026-11-30T00:13:44.490323085Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d926a3ed-d885-4d65-a078-3f637a7f05b6",
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
  "id": "f660f9fb-f696-4d67-8495-172321a29975",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T00:18:44.690882Z",
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
  "command_id": "20d5765e-c454-4a3f-89aa-102b265913e0",
  "quote_id": "f660f9fb-f696-4d67-8495-172321a29975",
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
  "id": "1db4c2d6-71cd-48b3-830e-c56106f1aa41",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "dcead340-43b5-41d7-939f-fca5fef06045",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T00:13:44.911701Z",
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
    "id": "41132452-93c9-45a6-8b2e-55e9fa9e56f7",
    "order_id": "1db4c2d6-71cd-48b3-830e-c56106f1aa41",
    "expires_at": "2026-10-31T00:13:59.913972Z",
    "server_time": "2026-10-31T00:13:45.14409319Z",
    "seconds_left": 14,
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
    "distance_m": 300,
    "price_kind": "FIXED",
    "expected_earnings_minor": 8939,
    "comment": null,
    "entrance": null
  }
]
```

`POST /api/driver/v1/offers/41132452-93c9-45a6-8b2e-55e9fa9e56f7/accept` → **200**

```json
{
  "command_id": "e9ed691c-549d-47d3-90c4-07818a9619ac"
}
```

```json
{
  "id": "ed53da2d-a6d3-4146-8751-e97e57c22225",
  "order_id": "1db4c2d6-71cd-48b3-830e-c56106f1aa41",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "5eaaa663-0061-4b85-8135-89cd4575977c",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "5eaaa663-0061-4b85-8135-89cd4575977c",
  "order_id": "1db4c2d6-71cd-48b3-830e-c56106f1aa41",
  "assignment_id": "ed53da2d-a6d3-4146-8751-e97e57c22225",
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
  "recipient": null,
  "comment": null,
  "entrance": null
}
```

(the car drives 5 s to the next point)

`POST /api/driver/v1/work-sessions/f7fbccdb-14e4-4cf5-9294-54f4e378b956/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T00:13:50Z",
    "sequence": 1793405630758
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "f7fbccdb-14e4-4cf5-9294-54f4e378b956",
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
  "last_heartbeat_at": "2026-10-31T00:13:50.773746Z",
  "last_location_at": "2026-10-31T00:13:50.773746Z",
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
  "id": "5eaaa663-0061-4b85-8135-89cd4575977c",
  "order_id": "1db4c2d6-71cd-48b3-830e-c56106f1aa41",
  "assignment_id": "ed53da2d-a6d3-4146-8751-e97e57c22225",
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
  "recipient": null,
  "comment": null,
  "entrance": null
}
```

`POST /api/driver/v1/trips/5eaaa663-0061-4b85-8135-89cd4575977c/arrive` → **200**

```json
{
  "command_id": "ba16710a-c3d2-4fc8-bb0f-9fa224308691",
  "expected_version": 0
}
```

```json
{
  "id": "5eaaa663-0061-4b85-8135-89cd4575977c",
  "order_id": "1db4c2d6-71cd-48b3-830e-c56106f1aa41",
  "assignment_id": "ed53da2d-a6d3-4146-8751-e97e57c22225",
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
  "arrived_at": "2026-10-31T00:13:51.176916Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null,
  "comment": null,
  "entrance": null
}
```

`POST /api/driver/v1/trips/5eaaa663-0061-4b85-8135-89cd4575977c/start` → **200**

```json
{
  "command_id": "19ab052b-55c7-4fd3-ba5d-02317619b323",
  "expected_version": 1
}
```

```json
{
  "id": "5eaaa663-0061-4b85-8135-89cd4575977c",
  "order_id": "1db4c2d6-71cd-48b3-830e-c56106f1aa41",
  "assignment_id": "ed53da2d-a6d3-4146-8751-e97e57c22225",
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
  "arrived_at": "2026-10-31T00:13:51.176916Z",
  "started_at": "2026-10-31T00:13:51.393473Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null,
  "comment": null,
  "entrance": null
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
  "command_id": "892f6c0c-0762-4323-bac6-a22dea9f10c7",
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
  "session_id": "f7fbccdb-14e4-4cf5-9294-54f4e378b956",
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
  "last_heartbeat_at": "2026-10-31T00:13:50.773746Z",
  "last_location_at": "2026-10-31T00:13:50.773746Z",
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
  "id": "5eaaa663-0061-4b85-8135-89cd4575977c",
  "order_id": "1db4c2d6-71cd-48b3-830e-c56106f1aa41",
  "assignment_id": "ed53da2d-a6d3-4146-8751-e97e57c22225",
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
  "arrived_at": "2026-10-31T00:13:51.176916Z",
  "started_at": "2026-10-31T00:13:51.393473Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null,
  "comment": null,
  "entrance": null
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
  "command_id": "a3bceae0-9b89-49ab-a345-001425d92750",
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
  "correlation_id": "6dd80119-ae18-4328-97a0-fb74a09d7deb"
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
  "correlation_id": "204c8331-2ca0-4be8-8d78-c1a6315fb1fd"
}
```

## He completes the trip and writes to support

(the car drives 46 s to the next point)

`POST /api/driver/v1/work-sessions/f7fbccdb-14e4-4cf5-9294-54f4e378b956/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T00:14:39Z",
    "sequence": 1793405679141
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "f7fbccdb-14e4-4cf5-9294-54f4e378b956",
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
  "last_heartbeat_at": "2026-10-31T00:14:39.157198Z",
  "last_location_at": "2026-10-31T00:14:39.157198Z",
  "eligible": false,
  "ineligible_reasons": [
    "ACCOUNT_BLOCKED",
    "INTENT_PAUSE_AFTER_CURRENT",
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/5eaaa663-0061-4b85-8135-89cd4575977c/complete` → **200**

```json
{
  "command_id": "8a0bdd40-b437-4cc4-8087-e1f4dc5a7bd2",
  "expected_version": 2,
  "reported_at": "2026-10-31T00:14:39Z",
  "cash_received": true
}
```

```json
{
  "id": "5eaaa663-0061-4b85-8135-89cd4575977c",
  "order_id": "1db4c2d6-71cd-48b3-830e-c56106f1aa41",
  "assignment_id": "ed53da2d-a6d3-4146-8751-e97e57c22225",
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
  "arrived_at": "2026-10-31T00:13:51.176916Z",
  "started_at": "2026-10-31T00:13:51.393473Z",
  "completed_at": "2026-10-31T00:14:39.371189Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null,
  "comment": null,
  "entrance": null
}
```

`POST /api/driver/v1/support/cases` → **201**

```json
{
  "command_id": "c44c4393-c608-4753-a31e-0779930fdd75",
  "category": "OTHER",
  "subject": "Why is my account blocked?",
  "message": "Please explain."
}
```

```json
{
  "id": "31d4e9c5-7fc9-43f0-a4d0-64ba89334947",
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
  "created_at": "2026-10-31T00:14:39.588691Z",
  "updated_at": "2026-10-31T00:14:39.588691Z",
  "respond_by": "2026-10-31T04:14:39.588691Z",
  "messages": [
    {
      "id": "bbed6b30-74e9-4cd4-9130-3099b1d77873",
      "sequence": 1,
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000403",
      "visibility": "PUBLIC",
      "body": "Please explain.",
      "created_at": "2026-10-31T00:14:39.589824Z",
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
      "id": "5eaaa663-0061-4b85-8135-89cd4575977c",
      "order_id": "1db4c2d6-71cd-48b3-830e-c56106f1aa41",
      "order_short_number": 14,
      "created_at": "2026-10-31T00:13:45.345085Z",
      "pickup_label": "Майдан",
      "dropoff_label": "Вокзал",
      "final_price_minor": 10517,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "COMPLETED"
    },
    {
      "id": "f3599c61-ccb9-4967-a797-4fd3c0e24441",
      "order_id": "dfba70a5-e48f-47a7-9dbf-64d02f7795aa",
      "order_short_number": 11,
      "created_at": "2026-10-31T00:10:06.932996Z",
      "pickup_label": "вул. Дмитрівська",
      "dropoff_label": "Нивки",
      "final_price_minor": 16297,
      "currency": "UAH",
      "payment_method": "CARD",
      "phase": "COMPLETED"
    },
    {
      "id": "7a903b81-01ef-4cdc-ab0a-18eef11eb748",
      "order_id": "1216212b-dbd1-4dc6-ae64-b30269cbb6c1",
      "order_short_number": 9,
      "created_at": "2026-10-31T00:09:49.492346Z",
      "pickup_label": "вул. Дмитрівська",
      "dropoff_label": "Нивки",
      "final_price_minor": 16297,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "COMPLETED"
    },
    {
      "id": "0afefc56-0bf0-4378-82cc-f39eaddb04a1",
      "order_id": "14c53844-3d6a-456b-9a3f-cda24c939988",
      "order_short_number": 8,
      "created_at": "2026-10-31T00:09:35.817516Z",
      "pickup_label": "вул. Дмитрівська",
      "dropoff_label": "Нивки",
      "final_price_minor": 16297,
      "currency": "UAH",
      "payment_method": "CARD",
      "phase": "COMPLETED"
    },
    {
      "id": "2a1a99d2-5b3c-43ed-b639-f23644437864",
      "order_id": "54b197d1-c764-4c92-9016-13282645c610",
      "order_short_number": 7,
      "created_at": "2026-10-31T00:08:46.75377Z",
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
  "session_id": "f7fbccdb-14e4-4cf5-9294-54f4e378b956",
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
  "last_heartbeat_at": "2026-10-31T00:14:39.157198Z",
  "last_location_at": "2026-10-31T00:14:39.157198Z",
  "eligible": false,
  "ineligible_reasons": [
    "ACCOUNT_BLOCKED",
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/work-sessions/f7fbccdb-14e4-4cf5-9294-54f4e378b956/resume` → **403**

```json
{
  "command_id": "7b067662-7b6d-4638-ac1d-4e616516c6a1",
  "expected_version": 2
}
```

```json
{
  "instance": "/api/driver/v1/work-sessions/f7fbccdb-14e4-4cf5-9294-54f4e378b956/resume",
  "status": 403,
  "title": "Account blocked",
  "type": "https://errors.blizz.taxi/account-blocked",
  "code": "ACCOUNT_BLOCKED",
  "correlation_id": "db20e7bb-65b0-4ae0-8360-8b42cea319e5"
}
```

(the car drives 47 s to the next point)

`POST /api/driver/v1/work-sessions/f7fbccdb-14e4-4cf5-9294-54f4e378b956/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4528,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T00:15:30Z",
    "sequence": 1793405730475
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "f7fbccdb-14e4-4cf5-9294-54f4e378b956",
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
  "last_heartbeat_at": "2026-10-31T00:15:30.493006Z",
  "last_location_at": "2026-10-31T00:15:30.493006Z",
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
  "command_id": "aaf814ca-8aa5-40cc-abac-b6636e86b7f1",
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
  "id": "444d1ef7-2e26-4e79-9f8d-42a80e3bb2e9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T00:20:30.730629Z",
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
  "command_id": "cac1d4d3-e773-4b57-94c6-b68b00461924",
  "quote_id": "444d1ef7-2e26-4e79-9f8d-42a80e3bb2e9",
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
  "id": "46fa1f45-f750-4cde-bc2d-0c8a07198704",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "dcead340-43b5-41d7-939f-fca5fef06045",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T00:15:30.947195Z",
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

`GET /api/driver/v1/offers` → **403**

```json
{
  "instance": "/api/driver/v1/offers",
  "status": 403,
  "title": "Account blocked",
  "type": "https://errors.blizz.taxi/account-blocked",
  "code": "ACCOUNT_BLOCKED",
  "correlation_id": "45538941-fe94-420d-85f6-5ae5a354fd5e"
}
```

`GET /api/operator/v1/orders/46fa1f45-f750-4cde-bc2d-0c8a07198704` → **200**

```json
{
  "id": "46fa1f45-f750-4cde-bc2d-0c8a07198704",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "dcead340-43b5-41d7-939f-fca5fef06045",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T00:15:30.947195Z",
  "caller": null,
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

Done: blocked on trip 5eaaa663-0061-4b85-8135-89cd4575977c, Andrii completed it and reached support; new work answered ACCOUNT_BLOCKED.

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
  "command_id": "e826f7de-390e-4abb-b4ae-767e27f4cfdc",
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

`GET /api/operator/v1/orders/1db4c2d6-71cd-48b3-830e-c56106f1aa41` → **200**

```json
{
  "id": "1db4c2d6-71cd-48b3-830e-c56106f1aa41",
  "short_number": 14,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "dcead340-43b5-41d7-939f-fca5fef06045",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
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
    "id": "ed53da2d-a6d3-4146-8751-e97e57c22225",
    "order_id": "1db4c2d6-71cd-48b3-830e-c56106f1aa41",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "5eaaa663-0061-4b85-8135-89cd4575977c",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-31T00:13:44.911701Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null,
  "driver": {
    "name": "Андрій Шевчук",
    "make": "Hyundai",
    "model": "Sonata",
    "color": "black",
    "registration_number": "AA0003TX",
    "photo_url": null
  },
  "driver_change": null,
  "comment": null,
  "entrance": null
}
```

`GET /api/operator/v1/orders/46fa1f45-f750-4cde-bc2d-0c8a07198704` → **200**

```json
{
  "id": "46fa1f45-f750-4cde-bc2d-0c8a07198704",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "dcead340-43b5-41d7-939f-fca5fef06045",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T00:15:30.947195Z",
  "caller": null,
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

`POST /api/operator/v1/orders/46fa1f45-f750-4cde-bc2d-0c8a07198704/cancel` → **200**

```json
{
  "command_id": "236a6c86-645f-4018-86f6-86729cdb0199",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "46fa1f45-f750-4cde-bc2d-0c8a07198704",
  "short_number": 15,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "dcead340-43b5-41d7-939f-fca5fef06045",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T00:15:30.947195Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "en": "No cars available",
      "ru": "Нет свободных машин",
      "pl": "Brak wolnych aut",
      "uk": "Немає вільних авто"
    }
  },
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

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "f7fbccdb-14e4-4cf5-9294-54f4e378b956",
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
  "last_heartbeat_at": "2026-10-31T00:15:30.493006Z",
  "last_location_at": "2026-10-31T00:15:30.493006Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/work-sessions/f7fbccdb-14e4-4cf5-9294-54f4e378b956/close` → **200**

```json
{
  "command_id": "30a76773-9726-49b6-97f4-e1de027643d4",
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
  "device_ref": "sandbox-9293"
}
```

```json
{
  "challenge_id": "69e4b0f5-2214-46bf-95d9-d6f18e09581d",
  "expires_at": "2026-10-31T00:20:33.222820036Z",
  "resend_available_at": "2026-10-31T00:15:34.222820036Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "173456",
  "sent_at": "2026-10-31T00:15:33.224759633Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "69e4b0f5-2214-46bf-95d9-d6f18e09581d",
  "code": "173456",
  "device_ref": "sandbox-9293"
}
```

```json
{
  "session_id": "04067a1f-812d-4bc6-9163-d3176687e29f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwNjYzMywiaWF0IjoxNzkzNDA1NzMzLCJqdGkiOiJjOTI5YTViOC0xNWZiLTRlMmEtOGFjZS04NzcyMWRkNDk5MTUiLCJzaWQiOiIwNDA2N2ExZi04MTJkLTRiYzYtOTE2My1kMzE3NjY4N2UyOWYifQ.32UOx7t-HynZ9GkTqXw7oeOExE6jx4Y_HNgRY5YR9RU",
  "access_expires_at": "2026-10-31T00:30:33.458735526Z",
  "refresh_token": "el3KksY9yhuhF8SJ51GKQ0CVz8ougkrjEGVKoIh5krU",
  "refresh_expires_at": "2026-11-30T00:15:33.458329374Z",
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
  "device_ref": "sandbox-30078"
}
```

```json
{
  "challenge_id": "8a868720-df31-4f66-894d-bb4a7e233b90",
  "expires_at": "2026-10-31T00:20:33.872644266Z",
  "resend_available_at": "2026-10-31T00:15:34.872644266Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "381180",
  "sent_at": "2026-10-31T00:15:33.874667021Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8a868720-df31-4f66-894d-bb4a7e233b90",
  "code": "381180",
  "device_ref": "sandbox-30078"
}
```

```json
{
  "session_id": "49fd4700-b945-4c7c-8145-957871ae47db",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwNjYzNCwiaWF0IjoxNzkzNDA1NzM0LCJqdGkiOiI3NTQwMTQ0Mi1kOTYyLTQ1MTAtOTk2OS1jZjlkOWNhYzVmYzAiLCJzaWQiOiI0OWZkNDcwMC1iOTQ1LTRjN2MtODE0NS05NTc4NzFhZTQ3ZGIifQ.ohssgvgm659lPYkXCXwKShKc0ZvB8xuwGJyBw1Fun6U",
  "access_expires_at": "2026-10-31T00:30:34.110045322Z",
  "refresh_token": "B_ZTzN3yMwiNI25Uzy0DyzA_J2EoOFqF-5UJaPPL_qg",
  "refresh_expires_at": "2026-11-30T00:15:34.109638199Z",
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
  "command_id": "fd0adee2-faa8-43b2-ac0f-25b0bb6a6456",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T00:15:34Z",
    "sequence": 1793405734534
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "bac5b2cf-49a7-40a4-a5b2-03bfb0e00dfe",
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
  "last_heartbeat_at": "2026-10-31T00:15:34.551391Z",
  "last_location_at": "2026-10-31T00:15:34.551391Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-13837"
}
```

```json
{
  "challenge_id": "e59e976d-fd97-45ca-a0a5-bd43f0f98823",
  "expires_at": "2026-10-31T00:20:34.76331553Z",
  "resend_available_at": "2026-10-31T00:15:35.76331553Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "976046",
  "sent_at": "2026-10-31T00:15:34.765348219Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e59e976d-fd97-45ca-a0a5-bd43f0f98823",
  "code": "976046",
  "device_ref": "sandbox-13837"
}
```

```json
{
  "session_id": "bfc3aaec-6aea-4cc8-b615-29325abf33dd",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwNjYzNCwiaWF0IjoxNzkzNDA1NzM0LCJqdGkiOiI0MmFiMmVjMi03NzdhLTQ5MDQtYjA2MC0yNDYxMDAwZjIwZWIiLCJzaWQiOiJiZmMzYWFlYy02YWVhLTRjYzgtYjYxNS0yOTMyNWFiZjMzZGQifQ.j9WcESNUsajEXyJDhElC4VSvQj_aen-yEjSfDqKNWUI",
  "access_expires_at": "2026-10-31T00:30:34.995862111Z",
  "refresh_token": "MWUkPJx7DOUSOBivXIjDYzUi7rzBeniLVSJAAO6gZTg",
  "refresh_expires_at": "2026-11-30T00:15:34.995237902Z",
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
  "command_id": "7a7aa4a6-22ac-4e27-84a4-d636f755da3d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T00:15:35Z",
    "sequence": 1793405735430
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "e841782e-3065-4f41-ac81-b99609d3e863",
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
  "last_heartbeat_at": "2026-10-31T00:15:35.447559Z",
  "last_location_at": "2026-10-31T00:15:35.447559Z",
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
  "session_id": "e029060d-1de8-4a9e-a659-4ff3697dfbba",
  "subject": {
    "type": "STAFF",
    "id": "2a3afaa3-e140-4771-8de7-2ab6b356cb06"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYTNhZmFhMy1lMTQwLTQ3NzEtOGRlNy0yYWI2YjM1NmNiMDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDY2MzUsImlhdCI6MTc5MzQwNTczNSwianRpIjoiNmE4ZjJiYzUtMzk5Yy00ZDczLWJmYWMtNDIzMzk5MTNmOWM2Iiwic2lkIjoiZTAyOTA2MGQtMWRlOC00YTllLWE2NTktNGZmMzY5N2RmYmJhIn0.CkaJyYXxk3smpKVGJ-z0hWhL6iTNYvXZjIqqqkI64dU",
  "access_expires_at": "2026-10-31T00:30:35.868496748Z",
  "refresh_token": "rRvmUrvVptwlQI_eJV209H9Qpn_PnUnISJbnrQN9TQc",
  "refresh_expires_at": "2026-10-31T12:15:35.867989654Z",
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
  "session_id": "92d8d853-5c07-4c98-ac13-7c3776f5ca7c",
  "subject": {
    "type": "STAFF",
    "id": "2a3afaa3-e140-4771-8de7-2ab6b356cb06"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYTNhZmFhMy1lMTQwLTQ3NzEtOGRlNy0yYWI2YjM1NmNiMDYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDY2MzYsImlhdCI6MTc5MzQwNTczNiwianRpIjoiZTgxYmUzM2MtMDg0YS00OWU0LThlZDItY2RjZTBiOWJjYTFhIiwic2lkIjoiOTJkOGQ4NTMtNWMwNy00Yzk4LWFjMTMtN2MzNzc2ZjVjYTdjIn0.nbBjI39GzfJeSZNpIMaCPIPMo03bswsxCyfzFje6-KM",
  "access_expires_at": "2026-10-31T00:30:36.284772774Z",
  "refresh_token": "rPueielakEkBYg8Aqq20Bg8whPsvXZpONtNPJcX6FvI",
  "refresh_expires_at": "2026-10-31T12:15:36.284377459Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380686664291",
  "device_ref": "sandbox-30513"
}
```

```json
{
  "challenge_id": "ecb1fe98-18e6-4646-81c2-71ee5b14aea3",
  "expires_at": "2026-10-31T00:20:36.499131933Z",
  "resend_available_at": "2026-10-31T00:15:37.499131933Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380686664291` → **200**

```json
{
  "phone": "+380686664291",
  "audience": "CLIENT",
  "code": "361151",
  "sent_at": "2026-10-31T00:15:36.501235844Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ecb1fe98-18e6-4646-81c2-71ee5b14aea3",
  "code": "361151",
  "device_ref": "sandbox-30513"
}
```

```json
{
  "session_id": "09b7415d-65d1-4c97-8dd9-2db3f4d15723",
  "subject": {
    "type": "CLIENT",
    "id": "3765d6f1-c36a-4af6-be5a-37655147096c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzNzY1ZDZmMS1jMzZhLTRhZjYtYmU1YS0zNzY1NTE0NzA5NmMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDA2NjM2LCJpYXQiOjE3OTM0MDU3MzYsImp0aSI6ImFjN2EwM2VhLTY5ZjgtNDNlOS1hMjA0LTc1OGEyOTA1NGFmYiIsInNpZCI6IjA5Yjc0MTVkLTY1ZDEtNGM5Ny04ZGQ5LTJkYjNmNGQxNTcyMyJ9.zP5dS0lJb5ZPRM9JGp2W0WIj3PmR_qbRb437jzbLYhg",
  "access_expires_at": "2026-10-31T00:30:36.746057019Z",
  "refresh_token": "NSwGb7G0vv6GDxDQQUU49aJVr--GsnDALHozzdsG_p4",
  "refresh_expires_at": "2026-11-30T00:15:36.745645249Z",
  "account_created": true
}
```

## E2: Near has the offer and pauses: the offer is revoked and Far gets the order at once

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "2a72aaef-b693-4006-b830-02e2af0c45af",
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
  "id": "5ccbf0ba-13d2-4052-8177-62de4946005e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T00:20:36.967308Z",
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
  "command_id": "bf841cbe-cb6c-468f-b276-8029517d5a2a",
  "quote_id": "5ccbf0ba-13d2-4052-8177-62de4946005e",
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
  "id": "59025694-7984-4579-9959-83431de2140c",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3765d6f1-c36a-4af6-be5a-37655147096c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T00:15:37.192323Z",
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
    "id": "06168b60-794a-46e2-9664-252f0417d524",
    "order_id": "59025694-7984-4579-9959-83431de2140c",
    "expires_at": "2026-10-31T00:15:52.194761Z",
    "server_time": "2026-10-31T00:15:37.424135389Z",
    "seconds_left": 14,
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
    "distance_m": 200,
    "price_kind": "FIXED",
    "expected_earnings_minor": 8939,
    "comment": null,
    "entrance": null
  }
]
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "bac5b2cf-49a7-40a4-a5b2-03bfb0e00dfe",
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
  "last_heartbeat_at": "2026-10-31T00:15:34.551391Z",
  "last_location_at": "2026-10-31T00:15:34.551391Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

`POST /api/driver/v1/work-sessions/bac5b2cf-49a7-40a4-a5b2-03bfb0e00dfe/pause` → **200**

```json
{
  "command_id": "b746cb1d-90ea-45bd-84d2-bed609e35d01",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "bac5b2cf-49a7-40a4-a5b2-03bfb0e00dfe",
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
  "last_heartbeat_at": "2026-10-31T00:15:34.551391Z",
  "last_location_at": "2026-10-31T00:15:34.551391Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/offers/06168b60-794a-46e2-9664-252f0417d524/accept` → **409**

```json
{
  "command_id": "d62b796f-24fa-4a23-8804-262a745e72bb"
}
```

```json
{
  "instance": "/api/driver/v1/offers/06168b60-794a-46e2-9664-252f0417d524/accept",
  "status": 409,
  "title": "Offer revoked",
  "type": "https://errors.blizz.taxi/offer-revoked",
  "code": "OFFER_REVOKED",
  "correlation_id": "53cc85e7-e0d2-4bf3-b333-08b5605c83de"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "8bca82a4-572d-4f6d-a91d-51c59696ac23",
    "order_id": "59025694-7984-4579-9959-83431de2140c",
    "expires_at": "2026-10-31T00:15:52.907635Z",
    "server_time": "2026-10-31T00:15:38.382843773Z",
    "seconds_left": 14,
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
    "distance_m": 601,
    "price_kind": "FIXED",
    "expected_earnings_minor": 8939,
    "comment": null,
    "entrance": null
  }
]
```

`POST /api/driver/v1/offers/8bca82a4-572d-4f6d-a91d-51c59696ac23/reject` → **204**

```json
{
  "command_id": "8d8c25a9-8d7b-4638-82b5-4a3796caa04b"
}
```

`GET /api/operator/v1/orders/59025694-7984-4579-9959-83431de2140c/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-31T00:15:37.192709Z",
      "actor": {
        "type": "CLIENT",
        "id": "3765d6f1-c36a-4af6-be5a-37655147096c",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "59025694-7984-4579-9959-83431de2140c",
        "quote_id": "5ccbf0ba-13d2-4052-8177-62de4946005e",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "ffc6b170-98b9-44e6-9e61-3e9cd24f62c6"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-31T00:15:37.194231Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "59025694-7984-4579-9959-83431de2140c",
        "attempt_id": "88c3265b-4e7b-4e21-9e19-1f14e5e04fe7",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "ffc6b170-98b9-44e6-9e61-3e9cd24f62c6"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-31T00:15:37.197045Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "source": "AUTO",
        "offer_id": "06168b60-794a-46e2-9664-252f0417d524",
        "order_id": "59025694-7984-4579-9959-83431de2140c",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200,
        "expires_at": "2026-10-31T00:15:52.194761242Z"
      },
      "correlation_id": "ffc6b170-98b9-44e6-9e61-3e9cd24f62c6"
    },
    {
      "sequence": 3,
      "type": "OfferRevoked",
      "occurred_at": "2026-10-31T00:15:37.906956Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": "DRIVER_PAUSED",
      "details": {
        "reason": "DRIVER_PAUSED",
        "offer_id": "06168b60-794a-46e2-9664-252f0417d524",
        "order_id": "59025694-7984-4579-9959-83431de2140c",
        "driver_id": "5a000000-0000-4000-8000-000000000401"
      },
```

`GET /api/operator/v1/orders/59025694-7984-4579-9959-83431de2140c` → **200**

```json
{
  "id": "59025694-7984-4579-9959-83431de2140c",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "3765d6f1-c36a-4af6-be5a-37655147096c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T00:15:37.192323Z",
  "caller": null,
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

`POST /api/operator/v1/orders/59025694-7984-4579-9959-83431de2140c/cancel` → **200**

```json
{
  "command_id": "96643182-9712-4c50-937a-a9865824c322",
  "expected_version": 6,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "59025694-7984-4579-9959-83431de2140c",
  "short_number": 16,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 7,
  "channel": "APP",
  "payer_client_id": "3765d6f1-c36a-4af6-be5a-37655147096c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T00:15:37.192323Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "en": "No cars available",
      "ru": "Нет свободных машин",
      "pl": "Brak wolnych aut",
      "uk": "Немає вільних авто"
    }
  },
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

E2: offer 06168b60-794a-46e2-9664-252f0417d524 revoked by the pause, the late accept got OFFER_REVOKED, Far had the order next.

## E5: pause and accept sent at the same moment, five rounds; Far is offline so each order goes to Near

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "e841782e-3065-4f41-ac81-b99609d3e863",
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
  "last_heartbeat_at": "2026-10-31T00:15:35.447559Z",
  "last_location_at": "2026-10-31T00:15:35.447559Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e841782e-3065-4f41-ac81-b99609d3e863/close` → **200**

```json
{
  "command_id": "24538c1b-c507-45c1-b1c0-ab58a07defa8",
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
  "session_id": "bac5b2cf-49a7-40a4-a5b2-03bfb0e00dfe",
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
  "last_heartbeat_at": "2026-10-31T00:15:34.551391Z",
  "last_location_at": "2026-10-31T00:15:34.551391Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/work-sessions/bac5b2cf-49a7-40a4-a5b2-03bfb0e00dfe/resume` → **200**

```json
{
  "command_id": "25315989-2dbf-4959-a5a3-121dfe675037",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "bac5b2cf-49a7-40a4-a5b2-03bfb0e00dfe",
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
  "last_heartbeat_at": "2026-10-31T00:15:34.551391Z",
  "last_location_at": "2026-10-31T00:15:34.551391Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/bac5b2cf-49a7-40a4-a5b2-03bfb0e00dfe/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T00:15:40Z",
    "sequence": 1793405740211
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "bac5b2cf-49a7-40a4-a5b2-03bfb0e00dfe",
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
  "last_heartbeat_at": "2026-10-31T00:15:40.228486Z",
  "last_location_at": "2026-10-31T00:15:40.228486Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "0283d831-2cba-4bd8-af15-d1497ac8b89c",
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
  "id": "fe595dbb-b5ed-4fec-8b1a-7c7965edf69e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T00:20:40.448925Z",
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
  "command_id": "d58411ab-7a29-4425-999a-ea5abba56bab",
  "quote_id": "fe595dbb-b5ed-4fec-8b1a-7c7965edf69e",
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
  "id": "0203cc40-e2ee-403f-bebb-9b17e71974d0",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3765d6f1-c36a-4af6-be5a-37655147096c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T00:15:40.683425Z",
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
    "id": "6e0a6702-577b-4190-8be9-08898ca5833f",
    "order_id": "0203cc40-e2ee-403f-bebb-9b17e71974d0",
    "expires_at": "2026-10-31T00:15:55.685647Z",
    "server_time": "2026-10-31T00:15:40.908660758Z",
    "seconds_left": 14,
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
    "distance_m": 200,
    "price_kind": "FIXED",
    "expected_earnings_minor": 8939,
    "comment": null,
    "entrance": null
  }
]
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "bac5b2cf-49a7-40a4-a5b2-03bfb0e00dfe",
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
  "last_heartbeat_at": "2026-10-31T00:15:40.228486Z",
  "last_location_at": "2026-10-31T00:15:40.228486Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

Round 1, at the same moment:

`POST /api/driver/v1/offers/6e0a6702-577b-4190-8be9-08898ca5833f/accept` → **200**

```json
{
  "id": "5c4acde8-6e9c-45da-869e-24bebf69d0d0",
  "order_id": "0203cc40-e2ee-403f-bebb-9b17e71974d0",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "12164ff6-fe2d-46c2-bfa9-baf46193ea3d",
  "trip_phase": "TO_PICKUP"
}
```

`POST /api/driver/v1/work-sessions/bac5b2cf-49a7-40a4-a5b2-03bfb0e00dfe/pause` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "bac5b2cf-49a7-40a4-a5b2-03bfb0e00dfe",
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
  "last_heartbeat_at": "2026-10-31T00:15:40.228486Z",
  "last_location_at": "2026-10-31T00:15:40.228486Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_PAUSE_AFTER_CURRENT",
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

Round 1: the accept won; the pause waits for the end of the trip.

`GET /api/operator/v1/orders/0203cc40-e2ee-403f-bebb-9b17e71974d0` → **200**

```json
{
  "id": "0203cc40-e2ee-403f-bebb-9b17e71974d0",
  "short_number": 17,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "3765d6f1-c36a-4af6-be5a-37655147096c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "5c4acde8-6e9c-45da-869e-24bebf69d0d0",
    "order_id": "0203cc40-e2ee-403f-bebb-9b17e71974d0",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "12164ff6-fe2d-46c2-bfa9-baf46193ea3d",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-31T00:15:40.683425Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null,
  "driver": {
    "name": "Іван Петренко",
    "make": "Skoda",
    "model": "Octavia",
    "color": "white",
    "registration_number": "AA0001TX",
    "photo_url": null
  },
  "driver_change": null,
  "comment": null,
  "entrance": null
}
```

`GET /api/operator/v1/orders/0203cc40-e2ee-403f-bebb-9b17e71974d0` → **200**

```json
{
  "id": "0203cc40-e2ee-403f-bebb-9b17e71974d0",
  "short_number": 17,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "3765d6f1-c36a-4af6-be5a-37655147096c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "5c4acde8-6e9c-45da-869e-24bebf69d0d0",
    "order_id": "0203cc40-e2ee-403f-bebb-9b17e71974d0",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "12164ff6-fe2d-46c2-bfa9-baf46193ea3d",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-31T00:15:40.683425Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null,
  "driver": {
    "name": "Іван Петренко",
    "make": "Skoda",
    "model": "Octavia",
    "color": "white",
    "registration_number": "AA0001TX",
    "photo_url": null
  },
  "driver_change": null,
  "comment": null,
  "entrance": null
}
```

`POST /api/operator/v1/orders/0203cc40-e2ee-403f-bebb-9b17e71974d0/cancel` → **200**

```json
{
  "command_id": "89cf5371-791a-4178-aa8d-e27c89bfbbe7",
  "expected_version": 3,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "0203cc40-e2ee-403f-bebb-9b17e71974d0",
  "short_number": 17,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "3765d6f1-c36a-4af6-be5a-37655147096c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "5c4acde8-6e9c-45da-869e-24bebf69d0d0",
    "order_id": "0203cc40-e2ee-403f-bebb-9b17e71974d0",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "12164ff6-fe2d-46c2-bfa9-baf46193ea3d",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-31T00:15:40.683425Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "en": "No cars available",
      "ru": "Нет свободных машин",
      "pl": "Brak wolnych aut",
      "uk": "Немає вільних авто"
    }
  },
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

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "bac5b2cf-49a7-40a4-a5b2-03bfb0e00dfe",
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
  "last_heartbeat_at": "2026-10-31T00:15:40.228486Z",
  "last_location_at": "2026-10-31T00:15:40.228486Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/work-sessions/bac5b2cf-49a7-40a4-a5b2-03bfb0e00dfe/resume` → **200**

```json
{
  "command_id": "2692ae56-6ace-4b30-8f41-00d574efb417",
  "expected_version": 4
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "bac5b2cf-49a7-40a4-a5b2-03bfb0e00dfe",
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
  "last_heartbeat_at": "2026-10-31T00:15:40.228486Z",
  "last_location_at": "2026-10-31T00:15:40.228486Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/bac5b2cf-49a7-40a4-a5b2-03bfb0e00dfe/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T00:15:42Z",
    "sequence": 1793405742520
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "bac5b2cf-49a7-40a4-a5b2-03bfb0e00dfe",
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
  "last_heartbeat_at": "2026-10-31T00:15:42.537302Z",
  "last_location_at": "2026-10-31T00:15:42.537302Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "0d03c182-a817-498c-9e1d-aed913c8bda4",
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
  "id": "531bb523-afbc-4b9f-ac0b-dbb0c356e3d7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T00:20:42.755747Z",
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
  "command_id": "cebee498-a858-495c-9883-b247f23fb1a9",
  "quote_id": "531bb523-afbc-4b9f-ac0b-dbb0c356e3d7",
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
  "id": "3b77d8bb-da24-4ce1-ad9c-def1e1d83c31",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3765d6f1-c36a-4af6-be5a-37655147096c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T00:15:42.978788Z",
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
    "id": "83e78373-a986-4e01-a77b-bd55c1c4520c",
    "order_id": "3b77d8bb-da24-4ce1-ad9c-def1e1d83c31",
    "expires_at": "2026-10-31T00:15:57.981669Z",
    "server_time": "2026-10-31T00:15:43.227797893Z",
    "seconds_left": 14,
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
    "distance_m": 200,
    "price_kind": "FIXED",
    "expected_earnings_minor": 8939,
    "comment": null,
    "entrance": null
  }
]
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "bac5b2cf-49a7-40a4-a5b2-03bfb0e00dfe",
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
  "last_heartbeat_at": "2026-10-31T00:15:42.537302Z",
  "last_location_at": "2026-10-31T00:15:42.537302Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

Round 2, at the same moment:

`POST /api/driver/v1/offers/83e78373-a986-4e01-a77b-bd55c1c4520c/accept` → **200**

```json
{
  "id": "e2e7251a-5dbe-407e-8572-a40fece3303d",
  "order_id": "3b77d8bb-da24-4ce1-ad9c-def1e1d83c31",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d834dc4c-13b9-449c-b9db-ff470cb6a950",
  "trip_phase": "TO_PICKUP"
}
```

`POST /api/driver/v1/work-sessions/bac5b2cf-49a7-40a4-a5b2-03bfb0e00dfe/pause` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "bac5b2cf-49a7-40a4-a5b2-03bfb0e00dfe",
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
  "last_heartbeat_at": "2026-10-31T00:15:42.537302Z",
  "last_location_at": "2026-10-31T00:15:42.537302Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_PAUSE_AFTER_CURRENT",
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

Round 2: the accept won; the pause waits for the end of the trip.

`GET /api/operator/v1/orders/3b77d8bb-da24-4ce1-ad9c-def1e1d83c31` → **200**

```json
{
  "id": "3b77d8bb-da24-4ce1-ad9c-def1e1d83c31",
  "short_number": 18,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "3765d6f1-c36a-4af6-be5a-37655147096c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "e2e7251a-5dbe-407e-8572-a40fece3303d",
    "order_id": "3b77d8bb-da24-4ce1-ad9c-def1e1d83c31",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "d834dc4c-13b9-449c-b9db-ff470cb6a950",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-31T00:15:42.978788Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null,
  "driver": {
    "name": "Іван Петренко",
    "make": "Skoda",
    "model": "Octavia",
    "color": "white",
    "registration_number": "AA0001TX",
    "photo_url": null
  },
  "driver_change": null,
  "comment": null,
  "entrance": null
}
```

`GET /api/operator/v1/orders/3b77d8bb-da24-4ce1-ad9c-def1e1d83c31` → **200**

```json
{
  "id": "3b77d8bb-da24-4ce1-ad9c-def1e1d83c31",
  "short_number": 18,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "3765d6f1-c36a-4af6-be5a-37655147096c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "e2e7251a-5dbe-407e-8572-a40fece3303d",
    "order_id": "3b77d8bb-da24-4ce1-ad9c-def1e1d83c31",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "d834dc4c-13b9-449c-b9db-ff470cb6a950",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-31T00:15:42.978788Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null,
  "driver": {
    "name": "Іван Петренко",
    "make": "Skoda",
    "model": "Octavia",
    "color": "white",
    "registration_number": "AA0001TX",
    "photo_url": null
  },
  "driver_change": null,
  "comment": null,
  "entrance": null
}
```

`POST /api/operator/v1/orders/3b77d8bb-da24-4ce1-ad9c-def1e1d83c31/cancel` → **200**

```json
{
  "command_id": "64067c7e-d47a-4f71-a208-23967df4f446",
  "expected_version": 3,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "3b77d8bb-da24-4ce1-ad9c-def1e1d83c31",
  "short_number": 18,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "3765d6f1-c36a-4af6-be5a-37655147096c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "e2e7251a-5dbe-407e-8572-a40fece3303d",
    "order_id": "3b77d8bb-da24-4ce1-ad9c-def1e1d83c31",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "d834dc4c-13b9-449c-b9db-ff470cb6a950",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-31T00:15:42.978788Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "en": "No cars available",
      "ru": "Нет свободных машин",
      "pl": "Brak wolnych aut",
      "uk": "Немає вільних авто"
    }
  },
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

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "bac5b2cf-49a7-40a4-a5b2-03bfb0e00dfe",
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
  "last_heartbeat_at": "2026-10-31T00:15:42.537302Z",
  "last_location_at": "2026-10-31T00:15:42.537302Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/work-sessions/bac5b2cf-49a7-40a4-a5b2-03bfb0e00dfe/resume` → **200**

```json
{
  "command_id": "21ca1a21-c12a-45e0-9a06-58d542abdddc",
  "expected_version": 7
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "bac5b2cf-49a7-40a4-a5b2-03bfb0e00dfe",
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
  "last_heartbeat_at": "2026-10-31T00:15:42.537302Z",
  "last_location_at": "2026-10-31T00:15:42.537302Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/bac5b2cf-49a7-40a4-a5b2-03bfb0e00dfe/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T00:15:44Z",
    "sequence": 1793405744905
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "bac5b2cf-49a7-40a4-a5b2-03bfb0e00dfe",
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
  "last_heartbeat_at": "2026-10-31T00:15:44.922338Z",
  "last_location_at": "2026-10-31T00:15:44.922338Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d5be2ac6-141f-4bcb-8a68-19b2d2784251",
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
  "id": "9bbd30c1-9efd-4f18-bf7b-ae1173379521",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T00:20:45.139517Z",
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
  "command_id": "a47c449e-c5ae-495b-945b-02fd09866f3a",
  "quote_id": "9bbd30c1-9efd-4f18-bf7b-ae1173379521",
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
  "id": "e40aed17-4e4d-47e6-bc78-624d3453ddc0",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3765d6f1-c36a-4af6-be5a-37655147096c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T00:15:45.352046Z",
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
    "id": "9c5599aa-ff05-4dfb-b7cb-f5ee004a34b8",
    "order_id": "e40aed17-4e4d-47e6-bc78-624d3453ddc0",
    "expires_at": "2026-10-31T00:16:00.354947Z",
    "server_time": "2026-10-31T00:15:45.598243154Z",
    "seconds_left": 14,
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
    "distance_m": 200,
    "price_kind": "FIXED",
    "expected_earnings_minor": 8939,
    "comment": null,
    "entrance": null
  }
]
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "bac5b2cf-49a7-40a4-a5b2-03bfb0e00dfe",
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
  "last_heartbeat_at": "2026-10-31T00:15:44.922338Z",
  "last_location_at": "2026-10-31T00:15:44.922338Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

Round 3, at the same moment:

`POST /api/driver/v1/offers/9c5599aa-ff05-4dfb-b7cb-f5ee004a34b8/accept` → **409**

```json
{
  "instance": "/api/driver/v1/offers/9c5599aa-ff05-4dfb-b7cb-f5ee004a34b8/accept",
  "status": 409,
  "title": "Offer revoked",
  "type": "https://errors.blizz.taxi/offer-revoked",
  "code": "OFFER_REVOKED",
  "correlation_id": "6cbb980c-8909-43aa-aa03-82c76a1f9bd0"
}
```

`POST /api/driver/v1/work-sessions/bac5b2cf-49a7-40a4-a5b2-03bfb0e00dfe/pause` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "bac5b2cf-49a7-40a4-a5b2-03bfb0e00dfe",
  "session_version": 9,
  "session_state": "OPEN",
  "intent": "NOT_ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-31T00:15:44.922338Z",
  "last_location_at": "2026-10-31T00:15:44.922338Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

Round 3: the pause won; the accept got OFFER_REVOKED.

`GET /api/operator/v1/orders/e40aed17-4e4d-47e6-bc78-624d3453ddc0` → **200**

```json
{
  "id": "e40aed17-4e4d-47e6-bc78-624d3453ddc0",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "3765d6f1-c36a-4af6-be5a-37655147096c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T00:15:45.352046Z",
  "caller": null,
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

`GET /api/operator/v1/orders/e40aed17-4e4d-47e6-bc78-624d3453ddc0` → **200**

```json
{
  "id": "e40aed17-4e4d-47e6-bc78-624d3453ddc0",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "3765d6f1-c36a-4af6-be5a-37655147096c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T00:15:45.352046Z",
  "caller": null,
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

`POST /api/operator/v1/orders/e40aed17-4e4d-47e6-bc78-624d3453ddc0/cancel` → **200**

```json
{
  "command_id": "70c08156-6a4e-4f18-8715-4fc598e0137f",
  "expected_version": 4,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "e40aed17-4e4d-47e6-bc78-624d3453ddc0",
  "short_number": 19,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "3765d6f1-c36a-4af6-be5a-37655147096c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T00:15:45.352046Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "en": "No cars available",
      "ru": "Нет свободных машин",
      "pl": "Brak wolnych aut",
      "uk": "Немає вільних авто"
    }
  },
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

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "bac5b2cf-49a7-40a4-a5b2-03bfb0e00dfe",
  "session_version": 9,
  "session_state": "OPEN",
  "intent": "NOT_ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-31T00:15:44.922338Z",
  "last_location_at": "2026-10-31T00:15:44.922338Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/work-sessions/bac5b2cf-49a7-40a4-a5b2-03bfb0e00dfe/resume` → **200**

```json
{
  "command_id": "a41d9143-2b54-4414-a583-0171d84b54dd",
  "expected_version": 9
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "bac5b2cf-49a7-40a4-a5b2-03bfb0e00dfe",
  "session_version": 10,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-31T00:15:44.922338Z",
  "last_location_at": "2026-10-31T00:15:44.922338Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/bac5b2cf-49a7-40a4-a5b2-03bfb0e00dfe/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T00:15:47Z",
    "sequence": 1793405747248
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "bac5b2cf-49a7-40a4-a5b2-03bfb0e00dfe",
  "session_version": 10,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-31T00:15:47.264625Z",
  "last_location_at": "2026-10-31T00:15:47.264625Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d6d325df-93a3-49f5-bf23-8440fb4744c2",
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
  "id": "237c43b0-fbf3-4005-948e-384791bffbe2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T00:20:47.495228Z",
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
  "command_id": "9361b5e6-5841-4d4e-a445-71da53c10a6f",
  "quote_id": "237c43b0-fbf3-4005-948e-384791bffbe2",
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
  "id": "887d9df5-bb6b-41e8-8d4b-f54544ab38aa",
  "short_number": 20,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3765d6f1-c36a-4af6-be5a-37655147096c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T00:15:47.71323Z",
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
    "id": "624e3cc6-0f06-4681-be3d-e3790dbf9f1c",
    "order_id": "887d9df5-bb6b-41e8-8d4b-f54544ab38aa",
    "expires_at": "2026-10-31T00:16:02.715363Z",
    "server_time": "2026-10-31T00:15:47.961531415Z",
    "seconds_left": 14,
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
    "distance_m": 200,
    "price_kind": "FIXED",
    "expected_earnings_minor": 8939,
    "comment": null,
    "entrance": null
  }
]
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "bac5b2cf-49a7-40a4-a5b2-03bfb0e00dfe",
  "session_version": 10,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "OFFERED",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-31T00:15:47.264625Z",
  "last_location_at": "2026-10-31T00:15:47.264625Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

Round 4, at the same moment:

`POST /api/driver/v1/offers/624e3cc6-0f06-4681-be3d-e3790dbf9f1c/accept` → **409**

```json
{
  "instance": "/api/driver/v1/offers/624e3cc6-0f06-4681-be3d-e3790dbf9f1c/accept",
  "status": 409,
  "title": "Offer revoked",
  "type": "https://errors.blizz.taxi/offer-revoked",
  "code": "OFFER_REVOKED",
  "correlation_id": "de88c3f3-8f11-4fa8-84a1-d920294b14ca"
}
```

`POST /api/driver/v1/work-sessions/bac5b2cf-49a7-40a4-a5b2-03bfb0e00dfe/pause` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "bac5b2cf-49a7-40a4-a5b2-03bfb0e00dfe",
  "session_version": 11,
  "session_state": "OPEN",
  "intent": "NOT_ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-31T00:15:47.264625Z",
  "last_location_at": "2026-10-31T00:15:47.264625Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

Round 4: the pause won; the accept got OFFER_REVOKED.

`GET /api/operator/v1/orders/887d9df5-bb6b-41e8-8d4b-f54544ab38aa` → **200**

```json
{
  "id": "887d9df5-bb6b-41e8-8d4b-f54544ab38aa",
  "short_number": 20,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "3765d6f1-c36a-4af6-be5a-37655147096c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T00:15:47.71323Z",
  "caller": null,
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

`GET /api/operator/v1/orders/887d9df5-bb6b-41e8-8d4b-f54544ab38aa` → **200**

```json
{
  "id": "887d9df5-bb6b-41e8-8d4b-f54544ab38aa",
  "short_number": 20,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "3765d6f1-c36a-4af6-be5a-37655147096c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T00:15:47.71323Z",
  "caller": null,
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

`POST /api/operator/v1/orders/887d9df5-bb6b-41e8-8d4b-f54544ab38aa/cancel` → **200**

```json
{
  "command_id": "a285ae21-b690-4930-9231-b0f90f58cd09",
  "expected_version": 4,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "887d9df5-bb6b-41e8-8d4b-f54544ab38aa",
  "short_number": 20,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "3765d6f1-c36a-4af6-be5a-37655147096c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T00:15:47.71323Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "en": "No cars available",
      "ru": "Нет свободных машин",
      "pl": "Brak wolnych aut",
      "uk": "Немає вільних авто"
    }
  },
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

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "bac5b2cf-49a7-40a4-a5b2-03bfb0e00dfe",
  "session_version": 11,
  "session_state": "OPEN",
  "intent": "NOT_ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-31T00:15:47.264625Z",
  "last_location_at": "2026-10-31T00:15:47.264625Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/work-sessions/bac5b2cf-49a7-40a4-a5b2-03bfb0e00dfe/resume` → **200**

```json
{
  "command_id": "c2fe657d-5961-4db0-99e7-57b9c37f2d9b",
  "expected_version": 11
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "bac5b2cf-49a7-40a4-a5b2-03bfb0e00dfe",
  "session_version": 12,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-31T00:15:47.264625Z",
  "last_location_at": "2026-10-31T00:15:47.264625Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/bac5b2cf-49a7-40a4-a5b2-03bfb0e00dfe/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T00:15:49Z",
    "sequence": 1793405749636
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "bac5b2cf-49a7-40a4-a5b2-03bfb0e00dfe",
  "session_version": 12,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-31T00:15:49.654335Z",
  "last_location_at": "2026-10-31T00:15:49.654335Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6ab381d0-5cc1-4828-b999-579c74687846",
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
  "id": "d889bd5f-8360-4093-b7df-14e60a4a1cda",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T00:20:49.884947Z",
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
  "command_id": "be7f7632-f8d2-45d5-b38d-f7edde912829",
  "quote_id": "d889bd5f-8360-4093-b7df-14e60a4a1cda",
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
  "id": "a832e137-6549-4eab-b3a7-97d44ad45eeb",
  "short_number": 21,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3765d6f1-c36a-4af6-be5a-37655147096c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T00:15:50.109735Z",
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
    "id": "0b6e5649-7251-4047-b2ce-0ad61cc638e6",
    "order_id": "a832e137-6549-4eab-b3a7-97d44ad45eeb",
    "expires_at": "2026-10-31T00:16:05.111786Z",
    "server_time": "2026-10-31T00:15:50.34228217Z",
    "seconds_left": 14,
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
    "distance_m": 200,
    "price_kind": "FIXED",
    "expected_earnings_minor": 8939,
    "comment": null,
    "entrance": null
  }
]
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "bac5b2cf-49a7-40a4-a5b2-03bfb0e00dfe",
  "session_version": 12,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "OFFERED",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-31T00:15:49.654335Z",
  "last_location_at": "2026-10-31T00:15:49.654335Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

Round 5, at the same moment:

`POST /api/driver/v1/offers/0b6e5649-7251-4047-b2ce-0ad61cc638e6/accept` → **200**

```json
{
  "id": "37916449-ed1b-4a84-8dec-3cc43af0269f",
  "order_id": "a832e137-6549-4eab-b3a7-97d44ad45eeb",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b40b3f8d-8656-4f62-bb1c-608ebac0ec6c",
  "trip_phase": "TO_PICKUP"
}
```

`POST /api/driver/v1/work-sessions/bac5b2cf-49a7-40a4-a5b2-03bfb0e00dfe/pause` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "bac5b2cf-49a7-40a4-a5b2-03bfb0e00dfe",
  "session_version": 13,
  "session_state": "OPEN",
  "intent": "PAUSE_AFTER_CURRENT",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-31T00:15:49.654335Z",
  "last_location_at": "2026-10-31T00:15:49.654335Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_PAUSE_AFTER_CURRENT",
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

Round 5: the accept won; the pause waits for the end of the trip.

`GET /api/operator/v1/orders/a832e137-6549-4eab-b3a7-97d44ad45eeb` → **200**

```json
{
  "id": "a832e137-6549-4eab-b3a7-97d44ad45eeb",
  "short_number": 21,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "3765d6f1-c36a-4af6-be5a-37655147096c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "37916449-ed1b-4a84-8dec-3cc43af0269f",
    "order_id": "a832e137-6549-4eab-b3a7-97d44ad45eeb",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "b40b3f8d-8656-4f62-bb1c-608ebac0ec6c",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-31T00:15:50.109735Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null,
  "driver": {
    "name": "Іван Петренко",
    "make": "Skoda",
    "model": "Octavia",
    "color": "white",
    "registration_number": "AA0001TX",
    "photo_url": null
  },
  "driver_change": null,
  "comment": null,
  "entrance": null
}
```

`GET /api/operator/v1/orders/a832e137-6549-4eab-b3a7-97d44ad45eeb` → **200**

```json
{
  "id": "a832e137-6549-4eab-b3a7-97d44ad45eeb",
  "short_number": 21,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "3765d6f1-c36a-4af6-be5a-37655147096c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "37916449-ed1b-4a84-8dec-3cc43af0269f",
    "order_id": "a832e137-6549-4eab-b3a7-97d44ad45eeb",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "b40b3f8d-8656-4f62-bb1c-608ebac0ec6c",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-31T00:15:50.109735Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null,
  "driver": {
    "name": "Іван Петренко",
    "make": "Skoda",
    "model": "Octavia",
    "color": "white",
    "registration_number": "AA0001TX",
    "photo_url": null
  },
  "driver_change": null,
  "comment": null,
  "entrance": null
}
```

`POST /api/operator/v1/orders/a832e137-6549-4eab-b3a7-97d44ad45eeb/cancel` → **200**

```json
{
  "command_id": "e111d2bd-d3f2-4f23-bbe0-7bf3cc2d42d2",
  "expected_version": 3,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "a832e137-6549-4eab-b3a7-97d44ad45eeb",
  "short_number": 21,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "3765d6f1-c36a-4af6-be5a-37655147096c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "37916449-ed1b-4a84-8dec-3cc43af0269f",
    "order_id": "a832e137-6549-4eab-b3a7-97d44ad45eeb",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "b40b3f8d-8656-4f62-bb1c-608ebac0ec6c",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-31T00:15:50.109735Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "en": "No cars available",
      "ru": "Нет свободных машин",
      "pl": "Brak wolnych aut",
      "uk": "Немає вільних авто"
    }
  },
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

E5: 3 rounds won by the accept, 2 by the pause; one winner each round, no 5xx.

## E4: a fix with 250 m accuracy keeps Near out of new orders; an accurate one brings him back

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "bac5b2cf-49a7-40a4-a5b2-03bfb0e00dfe",
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
  "last_heartbeat_at": "2026-10-31T00:15:49.654335Z",
  "last_location_at": "2026-10-31T00:15:49.654335Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/work-sessions/bac5b2cf-49a7-40a4-a5b2-03bfb0e00dfe/resume` → **200**

```json
{
  "command_id": "af7a33db-ac14-4a5e-89de-6857b109160d",
  "expected_version": 14
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "bac5b2cf-49a7-40a4-a5b2-03bfb0e00dfe",
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
  "last_heartbeat_at": "2026-10-31T00:15:49.654335Z",
  "last_location_at": "2026-10-31T00:15:49.654335Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/bac5b2cf-49a7-40a4-a5b2-03bfb0e00dfe/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 250,
    "recorded_at": "2026-10-31T00:15:51Z",
    "sequence": 1793405751944
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "bac5b2cf-49a7-40a4-a5b2-03bfb0e00dfe",
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
  "last_heartbeat_at": "2026-10-31T00:15:51.962116Z",
  "last_location_at": "2026-10-31T00:15:51.962116Z",
  "eligible": false,
  "ineligible_reasons": [
    "LOCATION_INACCURATE"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/work-sessions/bac5b2cf-49a7-40a4-a5b2-03bfb0e00dfe/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T00:15:52Z",
    "sequence": 1793405752178
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "bac5b2cf-49a7-40a4-a5b2-03bfb0e00dfe",
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
  "last_heartbeat_at": "2026-10-31T00:15:52.196752Z",
  "last_location_at": "2026-10-31T00:15:52.196752Z",
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
  "at": "2026-10-31T00:15:52.420357288Z",
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
      "last_location_at": "2026-10-31T00:15:52.196752Z",
      "last_heartbeat_at": "2026-10-31T00:15:52.196752Z",
      "order_id": null
    }
  ]
}
```

Done: E2, E5 (3/2), E4 and last_heartbeat_at 2026-10-31T00:15:52.196752Z.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "bac5b2cf-49a7-40a4-a5b2-03bfb0e00dfe",
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
  "last_heartbeat_at": "2026-10-31T00:15:52.196752Z",
  "last_location_at": "2026-10-31T00:15:52.196752Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/bac5b2cf-49a7-40a4-a5b2-03bfb0e00dfe/close` → **200**

```json
{
  "command_id": "e0415246-8c54-496c-9df8-4d905b72b87e",
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
  "session_id": "0990352f-7916-42cd-83fe-bbed9c3e4790",
  "subject": {
    "type": "STAFF",
    "id": "2a3afaa3-e140-4771-8de7-2ab6b356cb06"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYTNhZmFhMy1lMTQwLTQ3NzEtOGRlNy0yYWI2YjM1NmNiMDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDY2NTMsImlhdCI6MTc5MzQwNTc1MywianRpIjoiMTg1ODNkOGEtMTMxMC00MWI3LTlmZTItYjkwZjBhNzZmMWY0Iiwic2lkIjoiMDk5MDM1MmYtNzkxNi00MmNkLTgzZmUtYmJlZDljM2U0NzkwIn0.SiPqKW_I7UQKk6A4CmKpBPovGRo2KVi1naYU5sej_9s",
  "access_expires_at": "2026-10-31T00:30:53.500564422Z",
  "refresh_token": "J3vejx6kU1YnT9OH44hBgwwMWn4IhtkHgSuRekE9h50",
  "refresh_expires_at": "2026-10-31T12:15:53.500156427Z",
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
  "command_id": "d8c80310-51d1-41da-bf8f-43fc7bc9b315",
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
  "changed_by": "2a3afaa3-e140-4771-8de7-2ab6b356cb06",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-31T00:15:53.928876Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "5b89228a-0258-4bf0-bd18-5dbfc6e58708",
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
  "correlation_id": "5604109b-3f76-4f68-ad7f-67686a902f12",
  "current_version": 1
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "055b2b29-12a9-44dc-90e6-c218181440f6",
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
  "correlation_id": "fb8a6b3c-af70-4ef4-a65a-a0a495cb4ecb"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637818759",
  "device_ref": "sandbox-26907"
}
```

```json
{
  "challenge_id": "654b4f2c-bdf7-4395-93b0-ed257e6ea37e",
  "expires_at": "2026-10-31T00:20:54.615249456Z",
  "resend_available_at": "2026-10-31T00:15:55.615249456Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637818759` → **200**

```json
{
  "phone": "+380637818759",
  "audience": "CLIENT",
  "code": "831286",
  "sent_at": "2026-10-31T00:15:54.617708969Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "654b4f2c-bdf7-4395-93b0-ed257e6ea37e",
  "code": "831286",
  "device_ref": "sandbox-26907"
}
```

```json
{
  "session_id": "b03e3121-1070-4779-aace-d2a58c461969",
  "subject": {
    "type": "CLIENT",
    "id": "438e54f2-25cf-43ec-900d-40b23497b929"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MzhlNTRmMi0yNWNmLTQzZWMtOTAwZC00MGIyMzQ5N2I5MjkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDA2NjU0LCJpYXQiOjE3OTM0MDU3NTQsImp0aSI6IjE2NGQwMjkyLWRlYTEtNDYzMi1hMDcyLTM4MDg3NDJlZmRkNCIsInNpZCI6ImIwM2UzMTIxLTEwNzAtNDc3OS1hYWNlLWQyYTU4YzQ2MTk2OSJ9.IJzFl46eO4wC8_WrXnqNHGEEjnPBSo2jBpNut5xNmwE",
  "access_expires_at": "2026-10-31T00:30:54.844367864Z",
  "refresh_token": "dkDgaarl4Y22KExrFMoPMoPpnIzE_Us4ukEPJMymZXU",
  "refresh_expires_at": "2026-11-30T00:15:54.843494263Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "fbce1b67-152c-4587-9c30-df2d2efd9081",
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
  "id": "0ea2a4e3-3e24-4ec8-9733-f54f9cc35212",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T00:20:55.055868Z",
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
  "command_id": "f9c4e0ba-633f-4fda-92d3-c0df15ec98c1",
  "quote_id": "0ea2a4e3-3e24-4ec8-9733-f54f9cc35212",
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
  "correlation_id": "adbc5adc-42b9-40fc-bf5d-4d251355e2e4"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "706c863f-57b7-4c3c-9b74-502e898178a4",
  "quote_id": "0ea2a4e3-3e24-4ec8-9733-f54f9cc35212",
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
  "id": "0198d48c-b8d8-4485-971d-d4a8ec84919d",
  "short_number": 22,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "438e54f2-25cf-43ec-900d-40b23497b929",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T00:15:55.488706Z",
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

`POST /api/rider/v1/orders/0198d48c-b8d8-4485-971d-d4a8ec84919d/cancel` → **200**

```json
{
  "command_id": "44f52dd2-c91a-48a0-9fa7-02b5f7540846",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "0198d48c-b8d8-4485-971d-d4a8ec84919d",
  "short_number": 22,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "438e54f2-25cf-43ec-900d-40b23497b929",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T00:15:55.488706Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "en": "Changed my mind",
      "ru": "Передумал ехать",
      "pl": "Zmiana planów",
      "uk": "Передумав їхати"
    }
  },
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

## The incident is over: card payments are back on

`POST /api/admin/v1/feature-flags/card-payments/change` → **200**

```json
{
  "command_id": "813cbe93-37ae-41e8-8c8d-c96f9e9a84b5",
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
  "changed_by": "2a3afaa3-e140-4771-8de7-2ab6b356cb06",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-31T00:15:55.946067Z"
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
      "changed_by": "2a3afaa3-e140-4771-8de7-2ab6b356cb06",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-31T00:15:55.946067Z"
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
  "device_ref": "sandbox-17257"
}
```

```json
{
  "challenge_id": "f3d1f291-6935-42f9-b5f8-6f717e56fbc1",
  "expires_at": "2026-10-31T00:20:56.594556191Z",
  "resend_available_at": "2026-10-31T00:15:57.594556191Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "422331",
  "sent_at": "2026-10-31T00:15:56.596462587Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f3d1f291-6935-42f9-b5f8-6f717e56fbc1",
  "code": "422331",
  "device_ref": "sandbox-17257"
}
```

```json
{
  "session_id": "9180c92d-b734-4f03-bcba-4d9e97730a56",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwNjY1NiwiaWF0IjoxNzkzNDA1NzU2LCJqdGkiOiI4MTlmMzA0Yi04NmUzLTRiODctOTUwZS0zYTFhNTkwMTM3ZGMiLCJzaWQiOiI5MTgwYzkyZC1iNzM0LTRmMDMtYmNiYS00ZDllOTc3MzBhNTYifQ.43nMoPhZRfPSty2dQkhyny0YxqadGR_MgmwUF_Z6z48",
  "access_expires_at": "2026-10-31T00:30:56.828880657Z",
  "refresh_token": "w53qq0MV-_tNg9sy_V9PiNpSVdwtWnA8qzEzAxOeKWw",
  "refresh_expires_at": "2026-11-30T00:15:56.828190017Z",
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
  "command_id": "970ce717-51de-4494-8ce5-ad9898eee0b3",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T00:15:57Z",
    "sequence": 1793405757252
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3d0c6738-66d1-4fc6-a4c2-96bb18a81623",
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
  "last_heartbeat_at": "2026-10-31T00:15:57.268727Z",
  "last_location_at": "2026-10-31T00:15:57.268727Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678701482",
  "device_ref": "sandbox-3601"
}
```

```json
{
  "challenge_id": "abfb2aa4-320f-41c4-828c-a7a590972466",
  "expires_at": "2026-10-31T00:20:57.488376477Z",
  "resend_available_at": "2026-10-31T00:15:58.488376477Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380678701482` → **200**

```json
{
  "phone": "+380678701482",
  "audience": "CLIENT",
  "code": "248509",
  "sent_at": "2026-10-31T00:15:57.490468698Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "abfb2aa4-320f-41c4-828c-a7a590972466",
  "code": "248509",
  "device_ref": "sandbox-3601"
}
```

```json
{
  "session_id": "1c2a895b-3343-4756-8f3f-a6cfd14d851d",
  "subject": {
    "type": "CLIENT",
    "id": "9209641e-5904-49cc-8a82-c6dd482305f1"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MjA5NjQxZS01OTA0LTQ5Y2MtOGE4Mi1jNmRkNDgyMzA1ZjEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDA2NjU3LCJpYXQiOjE3OTM0MDU3NTcsImp0aSI6ImEwODUxYTc3LTljZDMtNDYxZC04YWYxLWE4ZDI1MzdlODEyZCIsInNpZCI6IjFjMmE4OTViLTMzNDMtNDc1Ni04ZjNmLWE2Y2ZkMTRkODUxZCJ9.MmteNcQz64VlLmcYzCEgfGgwFKP3BD-65H2CGg-k1Js",
  "access_expires_at": "2026-10-31T00:30:57.718209771Z",
  "refresh_token": "W11fgqQETkOAjcd-QMFeGqhbnwCMPw9_b7VnVoEP5QA",
  "refresh_expires_at": "2026-11-30T00:15:57.717759373Z",
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
  "command_id": "0dbb6b06-a333-4da4-a88c-23c7d064167a",
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
  "id": "ef121430-791a-43f6-8440-aebc404c79c2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T00:20:58.137592Z",
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
  "command_id": "2f42abac-23f8-415f-95c5-4fde9d8ca029",
  "platform": "ANDROID",
  "token": "sandbox-driver-822f977b-53ce-41d6-aa3b-66d70c33541f"
}
```

```json
{
  "id": "76ae7a16-6bf4-4400-b3f9-731920246057",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-31T00:15:58.365131Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "389e594e-4b92-438d-9270-51c4c8ffc79d",
  "platform": "ANDROID",
  "token": "sandbox-rider-0ca37926-70c3-4b24-a91d-06273c2db199"
}
```

```json
{
  "id": "86fa51b7-cbf4-4d47-9cea-4c15d4941b01",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-31T00:15:58.578311Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "e2ba4b75-3459-4ee7-b916-7d357d263c5c",
  "quote_id": "ef121430-791a-43f6-8440-aebc404c79c2",
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
  "id": "a1c9ec45-1312-48c1-a2b6-297dc7a1e28c",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9209641e-5904-49cc-8a82-c6dd482305f1",
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
  "created_at": "2026-10-31T00:15:58.796918Z",
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

## The driver's phone gets the offer push, and the driver accepts

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-31T00:15:58.774Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-31T00:15:58.774Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-31T00:15:58.774Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-31T00:15:58.774Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-31T00:15:58.774Z` → **200**

```json
[
  {
    "at": "2026-10-31T00:16:02.504443634Z",
    "token_suffix": "33541f",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "event_type": "OfferMade",
      "type": "driver.offer",
      "offer_id": "6f950f64-2126-4b1c-99e6-2c3c7e2143c2",
      "order_version": "2",
      "event_id": "a866239c-1644-4029-8005-6a0858ebdbfa",
      "order_id": "a1c9ec45-1312-48c1-a2b6-297dc7a1e28c"
    }
  }
]
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "6f950f64-2126-4b1c-99e6-2c3c7e2143c2",
    "order_id": "a1c9ec45-1312-48c1-a2b6-297dc7a1e28c",
    "expires_at": "2026-10-31T00:16:13.799526Z",
    "server_time": "2026-10-31T00:16:03.155209274Z",
    "seconds_left": 10,
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
    "distance_m": 44,
    "price_kind": "FIXED",
    "expected_earnings_minor": 8939,
    "comment": null,
    "entrance": null
  }
]
```

`POST /api/driver/v1/offers/6f950f64-2126-4b1c-99e6-2c3c7e2143c2/accept` → **200**

```json
{
  "command_id": "d9b71496-3b9e-4989-9725-f3c4c5e72d90"
}
```

```json
{
  "id": "a38a2bea-4f8a-422d-8c1b-62ccfa95ea03",
  "order_id": "a1c9ec45-1312-48c1-a2b6-297dc7a1e28c",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "ae75b4a2-ac5f-463b-90ac-f46812e302c5",
  "trip_phase": "TO_PICKUP"
}
```

## The rider's phone gets "driver assigned"

`GET /sandbox/v1/pushes?phone=%2B380678701482&after=2026-10-31T00:15:58.774Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380678701482&after=2026-10-31T00:15:58.774Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380678701482&after=2026-10-31T00:15:58.774Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380678701482&after=2026-10-31T00:15:58.774Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380678701482&after=2026-10-31T00:15:58.774Z` → **200**

```json
[
  {
    "at": "2026-10-31T00:16:07.513707553Z",
    "token_suffix": "2db199",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "event_type": "AssignmentCommitted",
      "type": "rider.driver-assigned",
      "assignment_id": "a38a2bea-4f8a-422d-8c1b-62ccfa95ea03",
      "order_version": "3",
      "event_id": "11a57b54-1612-4d56-9e55-185c19881d6f",
      "order_id": "a1c9ec45-1312-48c1-a2b6-297dc7a1e28c"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/a1c9ec45-1312-48c1-a2b6-297dc7a1e28c/messages` → **201**

```json
{
  "command_id": "6adfc3f9-05df-44ab-8b9f-b296b9e3bf6c",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "45443a0e-d933-46ce-8270-31eb055b560d",
  "order_id": "a1c9ec45-1312-48c1-a2b6-297dc7a1e28c",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-31T00:16:07.683238713Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "ae75b4a2-ac5f-463b-90ac-f46812e302c5",
  "order_id": "a1c9ec45-1312-48c1-a2b6-297dc7a1e28c",
  "assignment_id": "a38a2bea-4f8a-422d-8c1b-62ccfa95ea03",
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
  "recipient": null,
  "comment": null,
  "entrance": null
}
```

`POST /api/driver/v1/trips/ae75b4a2-ac5f-463b-90ac-f46812e302c5/messages` → **201**

```json
{
  "command_id": "0825b1d3-09f0-46a1-903d-08f41726d814",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "820933a3-bf26-41d0-9d55-84d0e7dd8304",
  "order_id": "a1c9ec45-1312-48c1-a2b6-297dc7a1e28c",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-31T00:16:08.092622866Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/a1c9ec45-1312-48c1-a2b6-297dc7a1e28c/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/ae75b4a2-ac5f-463b-90ac-f46812e302c5/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380678701482"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/3d0c6738-66d1-4fc6-a4c2-96bb18a81623/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T00:16:08Z",
    "sequence": 1793405768714
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3d0c6738-66d1-4fc6-a4c2-96bb18a81623",
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
  "last_heartbeat_at": "2026-10-31T00:16:08.729857Z",
  "last_location_at": "2026-10-31T00:16:08.729857Z",
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
  "id": "ae75b4a2-ac5f-463b-90ac-f46812e302c5",
  "order_id": "a1c9ec45-1312-48c1-a2b6-297dc7a1e28c",
  "assignment_id": "a38a2bea-4f8a-422d-8c1b-62ccfa95ea03",
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
  "recipient": null,
  "comment": null,
  "entrance": null
}
```

`POST /api/driver/v1/trips/ae75b4a2-ac5f-463b-90ac-f46812e302c5/arrive` → **200**

```json
{
  "command_id": "c378e202-d69b-49ea-a28e-babfe4024909",
  "expected_version": 0
}
```

```json
{
  "id": "ae75b4a2-ac5f-463b-90ac-f46812e302c5",
  "order_id": "a1c9ec45-1312-48c1-a2b6-297dc7a1e28c",
  "assignment_id": "a38a2bea-4f8a-422d-8c1b-62ccfa95ea03",
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
  "arrived_at": "2026-10-31T00:16:09.142972Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null,
  "comment": null,
  "entrance": null
}
```

`POST /api/driver/v1/trips/ae75b4a2-ac5f-463b-90ac-f46812e302c5/start` → **200**

```json
{
  "command_id": "8c757cf5-7a3c-4e83-8bfe-3c0634c59c0a",
  "expected_version": 1
}
```

```json
{
  "id": "ae75b4a2-ac5f-463b-90ac-f46812e302c5",
  "order_id": "a1c9ec45-1312-48c1-a2b6-297dc7a1e28c",
  "assignment_id": "a38a2bea-4f8a-422d-8c1b-62ccfa95ea03",
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
  "arrived_at": "2026-10-31T00:16:09.142972Z",
  "started_at": "2026-10-31T00:16:09.362626Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null,
  "comment": null,
  "entrance": null
}
```

(the car drives 48 s to the next point)

`POST /api/driver/v1/work-sessions/3d0c6738-66d1-4fc6-a4c2-96bb18a81623/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T00:16:57Z",
    "sequence": 1793405817589
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3d0c6738-66d1-4fc6-a4c2-96bb18a81623",
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
  "last_heartbeat_at": "2026-10-31T00:16:57.604957Z",
  "last_location_at": "2026-10-31T00:16:57.604957Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/ae75b4a2-ac5f-463b-90ac-f46812e302c5/complete` → **200**

```json
{
  "command_id": "47415d2d-d638-4c79-b23e-f0c4da61dc43",
  "expected_version": 2,
  "reported_at": "2026-10-31T00:16:57Z",
  "cash_received": true
}
```

```json
{
  "id": "ae75b4a2-ac5f-463b-90ac-f46812e302c5",
  "order_id": "a1c9ec45-1312-48c1-a2b6-297dc7a1e28c",
  "assignment_id": "a38a2bea-4f8a-422d-8c1b-62ccfa95ea03",
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
  "arrived_at": "2026-10-31T00:16:09.142972Z",
  "started_at": "2026-10-31T00:16:09.362626Z",
  "completed_at": "2026-10-31T00:16:57.823909Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null,
  "comment": null,
  "entrance": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/a1c9ec45-1312-48c1-a2b6-297dc7a1e28c` → **200**

```json
{
  "id": "a1c9ec45-1312-48c1-a2b6-297dc7a1e28c",
  "short_number": 23,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "9209641e-5904-49cc-8a82-c6dd482305f1",
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
    "id": "a38a2bea-4f8a-422d-8c1b-62ccfa95ea03",
    "order_id": "a1c9ec45-1312-48c1-a2b6-297dc7a1e28c",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "ae75b4a2-ac5f-463b-90ac-f46812e302c5",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-31T00:15:58.796918Z",
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
  "driver_change": null,
  "comment": null,
  "entrance": null
}
```

`GET /api/rider/v1/orders` → **200**

```json
{
  "items": [
    {
      "id": "a1c9ec45-1312-48c1-a2b6-297dc7a1e28c",
      "short_number": 23,
      "status": "FULFILLED",
      "created_at": "2026-10-31T00:15:58.796918Z",
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
      "id": "ae75b4a2-ac5f-463b-90ac-f46812e302c5",
      "order_id": "a1c9ec45-1312-48c1-a2b6-297dc7a1e28c",
      "order_short_number": 23,
      "created_at": "2026-10-31T00:16:03.363049Z",
      "pickup_label": "Майдан Незалежності",
      "dropoff_label": "Залізничний вокзал",
      "final_price_minor": 10517,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "COMPLETED"
    },
    {
      "id": "b40b3f8d-8656-4f62-bb1c-608ebac0ec6c",
      "order_id": "a832e137-6549-4eab-b3a7-97d44ad45eeb",
      "order_short_number": 21,
      "created_at": "2026-10-31T00:15:50.775244Z",
      "pickup_label": "Майдан",
      "dropoff_label": "Вокзал",
      "final_price_minor": null,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "ABORTED"
    },
    {
      "id": "d834dc4c-13b9-449c-b9db-ff470cb6a950",
      "order_id": "3b77d8bb-da24-4ce1-ad9c-def1e1d83c31",
      "order_short_number": 18,
      "created_at": "2026-10-31T00:15:43.697121Z",
      "pickup_label": "Майдан",
      "dropoff_label": "Вокзал",
      "final_price_minor": null,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "ABORTED"
    },
    {
      "id": "12164ff6-fe2d-46c2-bfa9-baf46193ea3d",
      "order_id": "0203cc40-e2ee-403f-bebb-9b17e71974d0",
      "order_short_number": 17,
      "created_at": "2026-10-31T00:15:41.337267Z",
      "pickup_label": "Майдан",
      "dropoff_label": "Вокзал",
      "final_price_minor": null,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "ABORTED"
    },
    {
      "id": "2c76b5d9-f002-4ebc-80c0-092d6b2695d1",
      "order_id": "bd6ce276-2d1a-421b-835a-73e3aadcb74f",
      "order_short_number": 10,
      "created_at": "2026-10-31T00:09:59.244952Z",
      "pickup_label": "Майдан",
      "dropoff_label": "Вокзал",
      "final_price_minor": 10517,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "COMPLETED"
    },
    {
      "id": "84aed5bf-3fe3-445e-bb4f-8eafb9d8a32f",
      "order_id": "9d8b8a57-2361-4544-934e-4dee5db5c32b",
      "order_short_number": 5,
      "created_at": "2026-10-31T00:08:36.936392Z",
      "pickup_label": "Майдан",
      "dropoff_label": "Вокзал",
      "final_price_minor": 10517,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "COMPLETED"
    },
    {
      "id": "1be2501d-e808-4deb-b1d4-979e302d538b",
      "order_id": "76e33c91-bff4-49a1-a24f-1ae7a98d160b",
      "order_short_number": 3,
      "created_at": "2026-10-31T00:04:50.523569Z",
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

`GET /api/rider/v1/orders/a1c9ec45-1312-48c1-a2b6-297dc7a1e28c/tip` → **200**

```json
{
  "order_id": "a1c9ec45-1312-48c1-a2b6-297dc7a1e28c",
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
  "available_until": "2026-11-01T00:16:57.823909Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/a1c9ec45-1312-48c1-a2b6-297dc7a1e28c/tip` → **201**

```json
{
  "command_id": "c7782132-a357-4be1-a33d-6e9634403d2f",
  "amount_minor": 1100
}
```

```json
{
  "id": "f14dc35b-f4ab-4b09-9d88-1c007dc1972e",
  "order_id": "a1c9ec45-1312-48c1-a2b6-297dc7a1e28c",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-31T00:17:02.385235Z"
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
  "session_id": "33fce9aa-865a-4bd8-947a-d1a4b66ede24",
  "subject": {
    "type": "STAFF",
    "id": "2a3afaa3-e140-4771-8de7-2ab6b356cb06"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYTNhZmFhMy1lMTQwLTQ3NzEtOGRlNy0yYWI2YjM1NmNiMDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDY3MjIsImlhdCI6MTc5MzQwNTgyMiwianRpIjoiYzRiNjM2ZmEtOGUzZS00NzE2LTlkN2QtZDZhOWQxZjFlYzZiIiwic2lkIjoiMzNmY2U5YWEtODY1YS00YmQ4LTk0N2EtZDFhNGI2NmVkZTI0In0.V098Lq6I8vrHATWFXii-47bgitbOjYbuldzTAPlkOJE",
  "access_expires_at": "2026-10-31T00:32:02.808469312Z",
  "refresh_token": "o5gVM1am46rOYM1zK6Bm2BkwGk6aIJit66kS-Gm57nA",
  "refresh_expires_at": "2026-10-31T12:17:02.807966495Z",
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
  "generated_at": "2026-10-31T00:17:03.019705591Z"
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
  "generated_at": "2026-10-31T00:17:03.228765952Z"
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
  "session_id": "fefaaedf-d6d6-4b20-bc2d-15d2196015f6",
  "subject": {
    "type": "STAFF",
    "id": "2a3afaa3-e140-4771-8de7-2ab6b356cb06"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYTNhZmFhMy1lMTQwLTQ3NzEtOGRlNy0yYWI2YjM1NmNiMDYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDY3MjMsImlhdCI6MTc5MzQwNTgyMywianRpIjoiZDllYjZmZGMtN2I3My00YTZmLWE3OGYtMjk1ODFiNmJmY2JkIiwic2lkIjoiZmVmYWFlZGYtZDZkNi00YjIwLWJjMmQtMTVkMjE5NjAxNWY2In0.dWBAM3S5sPz7QdkrbvZAo6Tiu9FZkWBAIND3062Ogls",
  "access_expires_at": "2026-10-31T00:32:03.654429014Z",
  "refresh_token": "Zhv-MqDBVRpsGp43ZILDqNmDcKtSdTTtBzaVFuC8NIA",
  "refresh_expires_at": "2026-10-31T12:17:03.653916022Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/a1c9ec45-1312-48c1-a2b6-297dc7a1e28c/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-31T00:15:58.797429Z",
      "actor": {
        "type": "CLIENT",
        "id": "9209641e-5904-49cc-8a82-c6dd482305f1",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "a1c9ec45-1312-48c1-a2b6-297dc7a1e28c",
        "quote_id": "ef121430-791a-43f6-8440-aebc404c79c2",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "55e73437-d208-49ba-a123-ae602f598a91"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-31T00:15:58.798931Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "a1c9ec45-1312-48c1-a2b6-297dc7a1e28c",
        "attempt_id": "be31c325-19c6-40eb-a4ff-ee4cf98e40e2",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "55e73437-d208-49ba-a123-ae602f598a91"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-31T00:15:58.817916Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "source": "AUTO",
        "offer_id": "6f950f64-2126-4b1c-99e6-2c3c7e2143c2",
        "order_id": "a1c9ec45-1312-48c1-a2b6-297dc7a1e28c",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44,
        "expires_at": "2026-10-31T00:16:13.799526053Z"
      },
      "correlation_id": "55e73437-d208-49ba-a123-ae602f598a91"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-31T00:16:03.36417Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "6f950f64-2126-4b1c-99e6-2c3c7e2143c2",
        "order_id": "a1c9ec45-1312-48c1-a2b6-297dc7a1e28c",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "a38a2bea-4f8a-422d-8c1b-62ccfa95ea03"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-31T00:17:04.064993869Z",
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
      "last_location_at": "2026-10-31T00:16:57.604957Z",
      "last_heartbeat_at": "2026-10-31T00:16:57.604957Z",
      "order_id": null
    }
  ]
}
```

Done: order a1c9ec45-1312-48c1-a2b6-297dc7a1e28c.

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
  "session_id": "c90050d7-9b28-4664-8d49-24544220c279",
  "subject": {
    "type": "STAFF",
    "id": "2a3afaa3-e140-4771-8de7-2ab6b356cb06"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYTNhZmFhMy1lMTQwLTQ3NzEtOGRlNy0yYWI2YjM1NmNiMDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDY3MjQsImlhdCI6MTc5MzQwNTgyNCwianRpIjoiZTU4Yzg2NTUtZDhlYS00NzEzLWJjYTktYmRkMDY2YmI4OTM2Iiwic2lkIjoiYzkwMDUwZDctOWIyOC00NjY0LThkNDktMjQ1NDQyMjBjMjc5In0.66-suX4OffHaFbRG7YywIfD0iPGY_qNdmndI_Da7RFE",
  "access_expires_at": "2026-10-31T00:32:04.492931167Z",
  "refresh_token": "1tsNHShuC3cAeZFgw5hb2l8YpCTLplrMqinWJTaQMik",
  "refresh_expires_at": "2026-10-31T12:17:04.492557204Z",
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
  "command_id": "aa8644eb-4636-4c5e-b77e-750b6b168103",
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
  "timestamp": "2026-10-31T00:17:05.000+0000",
  "channel": {
    "id": "1730052000.382313073",
    "linkedid": "1730052000.382313073",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380679534113"
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
  "timestamp": "2026-10-31T00:17:05.000+0000",
  "channel": {
    "id": "1730052000.382313073",
    "linkedid": "1730052000.382313073",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380679534113"
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
  "session_id": "41f54edb-7e37-4931-9bda-b36e69431ec3",
  "subject": {
    "type": "STAFF",
    "id": "2a3afaa3-e140-4771-8de7-2ab6b356cb06"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYTNhZmFhMy1lMTQwLTQ3NzEtOGRlNy0yYWI2YjM1NmNiMDYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDY3MjUsImlhdCI6MTc5MzQwNTgyNSwianRpIjoiNzVlM2YyZWMtNzllYy00YTk5LWEwM2UtYjE1MWZlMThkNmI1Iiwic2lkIjoiNDFmNTRlZGItN2UzNy00OTMxLTliZGEtYjM2ZTY5NDMxZWMzIn0._LusCP6WHnyD3Zm2vMf_deNJnLAk7pJOb2fGjX2bh8s",
  "access_expires_at": "2026-10-31T00:32:05.424540804Z",
  "refresh_token": "DguZbHGYWmKjKihKECvCnXYSQ94S9HwoSe1enSpEvKw",
  "refresh_expires_at": "2026-10-31T12:17:05.424071217Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "02f7b2e3-924b-4155-8f1f-e0810bca5950",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380679534113",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-31T00:17:05Z",
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

`POST /api/operator/v1/calls/02f7b2e3-924b-4155-8f1f-e0810bca5950/answer` → **200**

```json
{
  "command_id": "7da5e0e0-db42-424d-9706-2389066f3e1f"
}
```

```json
{
  "id": "02f7b2e3-924b-4155-8f1f-e0810bca5950",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380679534113",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "2a3afaa3-e140-4771-8de7-2ab6b356cb06",
  "order_ids": [],
  "started_at": "2026-10-31T00:17:05Z",
  "answered_at": "2026-10-31T00:17:05.84795Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.382313073",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "512f8e7e-c556-4b87-bbd1-10c66c949630",
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
  "id": "5c9d6e24-2282-44fe-88f2-9c49fb952dfa",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T00:22:06.086396Z",
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
  "command_id": "ddef4889-657f-4aed-97d1-64b5e97cceb3",
  "quote_id": "5c9d6e24-2282-44fe-88f2-9c49fb952dfa",
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
    "phone": "+380679534113"
  },
  "call_id": "02f7b2e3-924b-4155-8f1f-e0810bca5950"
}
```

```json
{
  "id": "59616af8-34c0-4053-89f8-1db18435ffbe",
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
  "created_at": "2026-10-31T00:17:06.30674Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679534113"
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

## The caller hangs up: the call is over, the order is not

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "1730052000.382313073",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "02f7b2e3-924b-4155-8f1f-e0810bca5950",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679534113",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "2a3afaa3-e140-4771-8de7-2ab6b356cb06",
      "order_ids": [
        "59616af8-34c0-4053-89f8-1db18435ffbe"
      ],
      "started_at": "2026-10-31T00:17:05Z",
      "answered_at": "2026-10-31T00:17:05.84795Z",
      "ended_at": "2026-10-31T00:17:06.547589Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "663776be-489a-45c7-9fbe-3fe80d034ba1",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672264024",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "2a3afaa3-e140-4771-8de7-2ab6b356cb06",
      "order_ids": [],
      "started_at": "2026-10-31T00:08:25.101826Z",
      "answered_at": "2026-10-31T00:08:25.326219Z",
      "ended_at": "2026-10-31T00:08:25.537689Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-31T00:08:32.438004Z"
      }
    }
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
```

`GET /api/operator/v1/orders/59616af8-34c0-4053-89f8-1db18435ffbe` → **200**

```json
{
  "id": "59616af8-34c0-4053-89f8-1db18435ffbe",
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
  "created_at": "2026-10-31T00:17:06.30674Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679534113"
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

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/59616af8-34c0-4053-89f8-1db18435ffbe` → **200**

```json
{
  "id": "59616af8-34c0-4053-89f8-1db18435ffbe",
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
  "created_at": "2026-10-31T00:17:06.30674Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679534113"
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

`POST /api/operator/v1/orders/59616af8-34c0-4053-89f8-1db18435ffbe/cancel` → **200**

```json
{
  "command_id": "b70666c4-2559-40f2-b536-f33a798cd6c3",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "59616af8-34c0-4053-89f8-1db18435ffbe",
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
  "created_at": "2026-10-31T00:17:06.30674Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679534113"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "en": "No cars available",
      "ru": "Нет свободных машин",
      "pl": "Brak wolnych aut",
      "uk": "Немає вільних авто"
    }
  },
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

Done: call 02f7b2e3-924b-4155-8f1f-e0810bca5950 with order 59616af8-34c0-4053-89f8-1db18435ffbe.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-1194"
}
```

```json
{
  "challenge_id": "0a030e36-77e2-45d7-a04b-6abb1179c4f0",
  "expires_at": "2026-10-31T00:22:07.460659068Z",
  "resend_available_at": "2026-10-31T00:17:08.460659068Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "332055",
  "sent_at": "2026-10-31T00:17:07.464325763Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0a030e36-77e2-45d7-a04b-6abb1179c4f0",
  "code": "332055",
  "device_ref": "sandbox-1194"
}
```

```json
{
  "session_id": "b05e55ed-55ca-4ae9-b365-5b782b461e1c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwNjcyNywiaWF0IjoxNzkzNDA1ODI3LCJqdGkiOiI0OTc3NzQ5NS05ZDFmLTQ2NzctYWRmOS0yNTJhOGRhMDk0YzkiLCJzaWQiOiJiMDVlNTVlZC01NWNhLTRhZTktYjM2NS01Yjc4MmI0NjFlMWMifQ.iRmmjjf7qZdMYqZwk4DeNAwg2xmEnDn5l2qwWPXJxFk",
  "access_expires_at": "2026-10-31T00:32:07.697644934Z",
  "refresh_token": "HJP-ldGRnKyPvPVWNUc5Lg6hHwfkJiuI4ZSWu0E9nMw",
  "refresh_expires_at": "2026-11-30T00:17:07.697116974Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3d0c6738-66d1-4fc6-a4c2-96bb18a81623",
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
  "last_heartbeat_at": "2026-10-31T00:16:57.604957Z",
  "last_location_at": "2026-10-31T00:16:57.604957Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3d0c6738-66d1-4fc6-a4c2-96bb18a81623/handover` → **200**

```json
{
  "command_id": "d26d5315-0dcd-4848-909c-3077de2bd66a",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3d0c6738-66d1-4fc6-a4c2-96bb18a81623",
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
  "last_heartbeat_at": "2026-10-31T00:16:57.604957Z",
  "last_location_at": "2026-10-31T00:16:57.604957Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

(the car drives 88 s to the next point)

`POST /api/driver/v1/work-sessions/3d0c6738-66d1-4fc6-a4c2-96bb18a81623/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T00:18:36Z",
    "sequence": 1793405916324
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3d0c6738-66d1-4fc6-a4c2-96bb18a81623",
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
  "last_heartbeat_at": "2026-10-31T00:18:36.340199Z",
  "last_location_at": "2026-10-31T00:18:36.340199Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380668849626",
  "device_ref": "sandbox-31264"
}
```

```json
{
  "challenge_id": "eb151a68-5e87-449e-9daa-868582a6b276",
  "expires_at": "2026-10-31T00:23:36.545856039Z",
  "resend_available_at": "2026-10-31T00:18:37.545856039Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380668849626` → **200**

```json
{
  "phone": "+380668849626",
  "audience": "CLIENT",
  "code": "320223",
  "sent_at": "2026-10-31T00:18:36.548504346Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "eb151a68-5e87-449e-9daa-868582a6b276",
  "code": "320223",
  "device_ref": "sandbox-31264"
}
```

```json
{
  "session_id": "e15468bb-4506-43d8-9054-53243c613f0d",
  "subject": {
    "type": "CLIENT",
    "id": "b397bd90-7f12-4718-948d-06aa383ed493"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMzk3YmQ5MC03ZjEyLTQ3MTgtOTQ4ZC0wNmFhMzgzZWQ0OTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDA2ODE2LCJpYXQiOjE3OTM0MDU5MTYsImp0aSI6ImIyMjcwYTRhLWE3MmEtNDM4OC1hYzZjLTIyMjczMmNkNTJiOCIsInNpZCI6ImUxNTQ2OGJiLTQ1MDYtNDNkOC05MDU0LTUzMjQzYzYxM2YwZCJ9.CYayV9__JQ9MaAdUi6SMWfPHTUUp93FB92CmldUXbiw",
  "access_expires_at": "2026-10-31T00:33:36.777978414Z",
  "refresh_token": "Z-PrpTbd_ST24-VIymFKhY7PjaXwLYoV5qcXwLMnwBk",
  "refresh_expires_at": "2026-11-30T00:18:36.777518452Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "3fa48363-5370-4371-bf62-2f0d3b4109e7",
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
  "id": "23669480-f81e-4e5a-ba02-02962be66736",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T00:23:36.991333Z",
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
  "command_id": "ec9cc31a-b653-4393-b4c8-e80e0fb321c3",
  "quote_id": "23669480-f81e-4e5a-ba02-02962be66736",
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
  "id": "47736e05-9cd9-4cd2-9f5c-0a63b44d77ab",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b397bd90-7f12-4718-948d-06aa383ed493",
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
  "created_at": "2026-10-31T00:18:37.207889Z",
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
    "id": "a22116ed-3ccd-4d4b-8c2b-8aa3e3b5fd10",
    "order_id": "47736e05-9cd9-4cd2-9f5c-0a63b44d77ab",
    "expires_at": "2026-10-31T00:18:52.210927Z",
    "server_time": "2026-10-31T00:18:37.448498061Z",
    "seconds_left": 14,
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
    "distance_m": 78,
    "price_kind": "FIXED",
    "expected_earnings_minor": 18007,
    "comment": null,
    "entrance": null
  }
]
```

`POST /api/driver/v1/offers/a22116ed-3ccd-4d4b-8c2b-8aa3e3b5fd10/accept` → **200**

```json
{
  "command_id": "803a5b2f-7ddf-4b0d-bca6-3e09e848773d"
}
```

```json
{
  "id": "8e631ea3-29e9-4e5d-9e16-d378bc1ce727",
  "order_id": "47736e05-9cd9-4cd2-9f5c-0a63b44d77ab",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c3013bca-0828-4190-8bb9-f2f536d8860a",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c3013bca-0828-4190-8bb9-f2f536d8860a",
  "order_id": "47736e05-9cd9-4cd2-9f5c-0a63b44d77ab",
  "assignment_id": "8e631ea3-29e9-4e5d-9e16-d378bc1ce727",
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
  "recipient": null,
  "comment": null,
  "entrance": null
}
```

`POST /api/driver/v1/work-sessions/3d0c6738-66d1-4fc6-a4c2-96bb18a81623/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T00:18:38Z",
    "sequence": 1793405918623
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3d0c6738-66d1-4fc6-a4c2-96bb18a81623",
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
  "last_heartbeat_at": "2026-10-31T00:18:38.077305Z",
  "last_location_at": "2026-10-31T00:18:38.077305Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/c3013bca-0828-4190-8bb9-f2f536d8860a/arrive` → **200**

```json
{
  "command_id": "76e983f4-62a1-48bb-b793-bb4beae1f8ce",
  "expected_version": 0
}
```

```json
{
  "id": "c3013bca-0828-4190-8bb9-f2f536d8860a",
  "order_id": "47736e05-9cd9-4cd2-9f5c-0a63b44d77ab",
  "assignment_id": "8e631ea3-29e9-4e5d-9e16-d378bc1ce727",
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
  "arrived_at": "2026-10-31T00:18:38.281961Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null,
  "comment": null,
  "entrance": null
}
```

`POST /api/driver/v1/trips/c3013bca-0828-4190-8bb9-f2f536d8860a/start` → **200**

```json
{
  "command_id": "475571b0-5c8b-4cd2-a4e8-cef9e9437103",
  "expected_version": 1
}
```

```json
{
  "id": "c3013bca-0828-4190-8bb9-f2f536d8860a",
  "order_id": "47736e05-9cd9-4cd2-9f5c-0a63b44d77ab",
  "assignment_id": "8e631ea3-29e9-4e5d-9e16-d378bc1ce727",
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
  "arrived_at": "2026-10-31T00:18:38.281961Z",
  "started_at": "2026-10-31T00:18:38.491841Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null,
  "comment": null,
  "entrance": null
}
```

## The car breaks down halfway; Oleh is free nearby

(the car drives 60 s to the next point)

`POST /api/driver/v1/work-sessions/3d0c6738-66d1-4fc6-a4c2-96bb18a81623/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T00:19:38Z",
    "sequence": 1793405978711
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3d0c6738-66d1-4fc6-a4c2-96bb18a81623",
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
  "last_heartbeat_at": "2026-10-31T00:19:38.727889Z",
  "last_location_at": "2026-10-31T00:19:38.727889Z",
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
  "device_ref": "sandbox-27428"
}
```

```json
{
  "challenge_id": "fb1c34b9-58fd-4345-a1ba-cba66eaaa2ad",
  "expires_at": "2026-10-31T00:24:38.934431728Z",
  "resend_available_at": "2026-10-31T00:19:39.934431728Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "615398",
  "sent_at": "2026-10-31T00:19:38.936447963Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fb1c34b9-58fd-4345-a1ba-cba66eaaa2ad",
  "code": "615398",
  "device_ref": "sandbox-27428"
}
```

```json
{
  "session_id": "c91936f4-afe7-429b-992e-595d616ff1ea",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwNjg3OSwiaWF0IjoxNzkzNDA1OTc5LCJqdGkiOiIyMTM0NzliZS0zMWQ4LTQwOWYtYmQyZC0zYTdmOGU5ZThjNDEiLCJzaWQiOiJjOTE5MzZmNC1hZmU3LTQyOWItOTkyZS01OTVkNjE2ZmYxZWEifQ.shbOC19Mh01G4JV-j2THdgJX66KYrD6AB5YaKWlLDAY",
  "access_expires_at": "2026-10-31T00:34:39.164329023Z",
  "refresh_token": "tEPpZWuXYTGsQPa8IWfVM2y4m3GAfLIKcr5D3cPndHA",
  "refresh_expires_at": "2026-11-30T00:19:39.163950583Z",
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
  "command_id": "adcc90c0-6f86-4ce2-ba6d-e765274179d4",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T00:19:39Z",
    "sequence": 1793405979591
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "2ab94757-8172-40b8-add1-8431baacfa32",
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
  "last_heartbeat_at": "2026-10-31T00:19:39.606873Z",
  "last_location_at": "2026-10-31T00:19:39.606873Z",
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
  "session_id": "88482612-b9d1-47de-92e9-381464d5d362",
  "subject": {
    "type": "STAFF",
    "id": "2a3afaa3-e140-4771-8de7-2ab6b356cb06"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYTNhZmFhMy1lMTQwLTQ3NzEtOGRlNy0yYWI2YjM1NmNiMDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDY4ODAsImlhdCI6MTc5MzQwNTk4MCwianRpIjoiNGJhNTc5YzctYjllMC00YTk2LWE0ZGQtZmI1YmIzYjc4MDFhIiwic2lkIjoiODg0ODI2MTItYjlkMS00N2RlLTkyZTktMzgxNDY0ZDVkMzYyIn0.qtpc0LO3iw6Uy0kGV67SPNtvDSqk0F9YwwjtV9nlsDg",
  "access_expires_at": "2026-10-31T00:34:40.027705276Z",
  "refresh_token": "cAxXvkKZIqEK43zE8JdrNXiw-QDYjh9BhL9r91Jq450",
  "refresh_expires_at": "2026-10-31T12:19:40.027285233Z",
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
  "session_id": "f5617cf1-3d23-42f8-b0a9-20906853decd",
  "subject": {
    "type": "STAFF",
    "id": "2a3afaa3-e140-4771-8de7-2ab6b356cb06"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYTNhZmFhMy1lMTQwLTQ3NzEtOGRlNy0yYWI2YjM1NmNiMDYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDY4ODAsImlhdCI6MTc5MzQwNTk4MCwianRpIjoiOGZlMTFhMDktY2E3ZC00YWY0LWI0OTEtZmJkMmQyMTgwZWU4Iiwic2lkIjoiZjU2MTdjZjEtM2QyMy00MmY4LWIwYTktMjA5MDY4NTNkZWNkIn0.75QJ0yJ0ke42DFfgfgZUzIlKdALI3Ak_-UmNjBK5pDY",
  "access_expires_at": "2026-10-31T00:34:40.442389705Z",
  "refresh_token": "ESPO4t1j5aF77XyRTERY6Cobr65qPJXeIeNZACEYVtY",
  "refresh_expires_at": "2026-10-31T12:19:40.441998786Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/47736e05-9cd9-4cd2-9f5c-0a63b44d77ab` → **200**

```json
{
  "id": "47736e05-9cd9-4cd2-9f5c-0a63b44d77ab",
  "short_number": 25,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "b397bd90-7f12-4718-948d-06aa383ed493",
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
    "id": "8e631ea3-29e9-4e5d-9e16-d378bc1ce727",
    "order_id": "47736e05-9cd9-4cd2-9f5c-0a63b44d77ab",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "c3013bca-0828-4190-8bb9-f2f536d8860a",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-31T00:18:37.207889Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null,
  "driver": {
    "name": "Іван Петренко",
    "make": "Skoda",
    "model": "Octavia",
    "color": "white",
    "registration_number": "AA0001TX",
    "photo_url": null
  },
  "driver_change": null,
  "comment": null,
  "entrance": null
}
```

`POST /api/operator/v1/orders/47736e05-9cd9-4cd2-9f5c-0a63b44d77ab/interrupt` → **200**

```json
{
  "command_id": "98863e4a-d6df-49a0-981a-26638ad28e91",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "47736e05-9cd9-4cd2-9f5c-0a63b44d77ab",
    "short_number": 25,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "b397bd90-7f12-4718-948d-06aa383ed493",
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
      "id": "8e631ea3-29e9-4e5d-9e16-d378bc1ce727",
      "order_id": "47736e05-9cd9-4cd2-9f5c-0a63b44d77ab",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "c3013bca-0828-4190-8bb9-f2f536d8860a",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-31T00:18:37.207889Z",
    "caller": null,
    "cancellation": {
      "by": "STAFF",
      "reason_code": "VEHICLE_BREAKDOWN",
      "reason_labels": {
        "en": "Vehicle broke down on the way",
        "ru": "Поломка автомобиля в пути",
        "pl": "Awaria auta w trasie",
        "uk": "Поломка автомобіля в дорозі"
      }
    },
    "pickup_at": null,
    "preorder": false,
    "reservation": null,
    "related_order_id": null,
    "driver": null,
    "driver_change": null,
    "comment": null,
    "entrance": null
  },
  "follow_up": {
    "id": "f6bad683-a316-4f9e-a9b9-989f2de83e64",
    "short_number": 26,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "b397bd90-7f12-4718-948d-06aa383ed493",
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
```

## Oleh takes the follow-up and finishes; the rider sees both orders

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "34fd2683-5da2-4026-9416-348bda06382d",
    "order_id": "f6bad683-a316-4f9e-a9b9-989f2de83e64",
    "expires_at": "2026-10-31T00:19:55.880776Z",
    "server_time": "2026-10-31T00:19:41.149043207Z",
    "seconds_left": 14,
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
    "distance_m": 56,
    "price_kind": "FIXED",
    "expected_earnings_minor": 11113,
    "comment": null,
    "entrance": null
  }
]
```

`POST /api/driver/v1/offers/34fd2683-5da2-4026-9416-348bda06382d/accept` → **200**

```json
{
  "command_id": "342c70df-e59e-4d1e-9307-d5550d8a163b"
}
```

```json
{
  "id": "b8f3e12c-9f22-4059-8526-236b08d235a7",
  "order_id": "f6bad683-a316-4f9e-a9b9-989f2de83e64",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "68d53c4d-ecec-41c0-8683-b274c0dc2567",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "68d53c4d-ecec-41c0-8683-b274c0dc2567",
  "order_id": "f6bad683-a316-4f9e-a9b9-989f2de83e64",
  "assignment_id": "b8f3e12c-9f22-4059-8526-236b08d235a7",
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
  "recipient": null,
  "comment": null,
  "entrance": null
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "2ab94757-8172-40b8-add1-8431baacfa32",
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
  "last_heartbeat_at": "2026-10-31T00:19:39.606873Z",
  "last_location_at": "2026-10-31T00:19:39.606873Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/2ab94757-8172-40b8-add1-8431baacfa32/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T00:19:41Z",
    "sequence": 1793405981984
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "2ab94757-8172-40b8-add1-8431baacfa32",
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
  "last_heartbeat_at": "2026-10-31T00:19:42.001001Z",
  "last_location_at": "2026-10-31T00:19:42.001001Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/68d53c4d-ecec-41c0-8683-b274c0dc2567/arrive` → **200**

```json
{
  "command_id": "98230b5b-da62-4f2a-a7d7-67a0a7670dff",
  "expected_version": 0
}
```

```json
{
  "id": "68d53c4d-ecec-41c0-8683-b274c0dc2567",
  "order_id": "f6bad683-a316-4f9e-a9b9-989f2de83e64",
  "assignment_id": "b8f3e12c-9f22-4059-8526-236b08d235a7",
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
  "arrived_at": "2026-10-31T00:19:42.220345Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null,
  "comment": null,
  "entrance": null
}
```

`POST /api/driver/v1/trips/68d53c4d-ecec-41c0-8683-b274c0dc2567/start` → **200**

```json
{
  "command_id": "7637dac5-ced0-4932-9354-614dfd3e1f40",
  "expected_version": 1
}
```

```json
{
  "id": "68d53c4d-ecec-41c0-8683-b274c0dc2567",
  "order_id": "f6bad683-a316-4f9e-a9b9-989f2de83e64",
  "assignment_id": "b8f3e12c-9f22-4059-8526-236b08d235a7",
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
  "arrived_at": "2026-10-31T00:19:42.220345Z",
  "started_at": "2026-10-31T00:19:42.439464Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null,
  "comment": null,
  "entrance": null
}
```

`POST /api/driver/v1/trips/68d53c4d-ecec-41c0-8683-b274c0dc2567/complete` → **200**

```json
{
  "command_id": "3c25adad-4019-4f0f-9c4a-c9211a9c4708",
  "expected_version": 2,
  "reported_at": "2026-10-31T00:19:42Z"
}
```

```json
{
  "id": "68d53c4d-ecec-41c0-8683-b274c0dc2567",
  "order_id": "f6bad683-a316-4f9e-a9b9-989f2de83e64",
  "assignment_id": "b8f3e12c-9f22-4059-8526-236b08d235a7",
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
  "arrived_at": "2026-10-31T00:19:42.220345Z",
  "started_at": "2026-10-31T00:19:42.439464Z",
  "completed_at": "2026-10-31T00:19:42.659265Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null,
  "comment": null,
  "entrance": null
}
```

`GET /api/rider/v1/orders` → **200**

```json
{
  "items": [
    {
      "id": "f6bad683-a316-4f9e-a9b9-989f2de83e64",
      "short_number": 26,
      "status": "FULFILLED",
      "created_at": "2026-10-31T00:19:40.873703Z",
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
      "id": "47736e05-9cd9-4cd2-9f5c-0a63b44d77ab",
      "short_number": 25,
      "status": "CANCELLED",
      "created_at": "2026-10-31T00:18:37.207889Z",
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
          "en": "Vehicle broke down on the way",
          "ru": "Поломка автомобиля в пути",
          "pl": "Awaria auta w trasie",
          "uk": "Поломка автомобіля в дорозі"
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

`GET /api/operator/v1/orders/47736e05-9cd9-4cd2-9f5c-0a63b44d77ab/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-31T00:18:37.208358Z",
      "actor": {
        "type": "CLIENT",
        "id": "b397bd90-7f12-4718-948d-06aa383ed493",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "47736e05-9cd9-4cd2-9f5c-0a63b44d77ab",
        "quote_id": "23669480-f81e-4e5a-ba02-02962be66736",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "a4b41483-e05a-4618-8e0a-d8ae047c5043"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-31T00:18:37.21013Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "47736e05-9cd9-4cd2-9f5c-0a63b44d77ab",
        "attempt_id": "6e278910-feb7-4d43-ac79-6cab48a1d195",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "a4b41483-e05a-4618-8e0a-d8ae047c5043"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-31T00:18:37.213574Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "source": "AUTO",
        "offer_id": "a22116ed-3ccd-4d4b-8c2b-8aa3e3b5fd10",
        "order_id": "47736e05-9cd9-4cd2-9f5c-0a63b44d77ab",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78,
        "expires_at": "2026-10-31T00:18:52.210927235Z"
      },
      "correlation_id": "a4b41483-e05a-4618-8e0a-d8ae047c5043"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-31T00:18:37.645378Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "a22116ed-3ccd-4d4b-8c2b-8aa3e3b5fd10",
        "order_id": "47736e05-9cd9-4cd2-9f5c-0a63b44d77ab",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "8e631ea3-29e9-4e5d-9e16-d378bc1ce727"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/f6bad683-a316-4f9e-a9b9-989f2de83e64/tip` → **200**

```json
{
  "order_id": "f6bad683-a316-4f9e-a9b9-989f2de83e64",
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
  "available_until": "2026-11-01T00:19:42.659265Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/f6bad683-a316-4f9e-a9b9-989f2de83e64/tip` → **409**

```json
{
  "command_id": "eee8a540-1b87-46a7-a264-5657feb1d227",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/f6bad683-a316-4f9e-a9b9-989f2de83e64/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "d92f4e79-e354-4bf6-a3fa-3e705ac8570b"
}
```

Done: interrupted 47736e05-9cd9-4cd2-9f5c-0a63b44d77ab, follow-up f6bad683-a316-4f9e-a9b9-989f2de83e64.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3d0c6738-66d1-4fc6-a4c2-96bb18a81623",
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
  "last_heartbeat_at": "2026-10-31T00:19:38.727889Z",
  "last_location_at": "2026-10-31T00:19:38.727889Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3d0c6738-66d1-4fc6-a4c2-96bb18a81623/close` → **200**

```json
{
  "command_id": "8543a943-50cc-4713-ae03-281b75b2691a",
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
  "session_id": "2ab94757-8172-40b8-add1-8431baacfa32",
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
  "last_heartbeat_at": "2026-10-31T00:19:42.001001Z",
  "last_location_at": "2026-10-31T00:19:42.001001Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2ab94757-8172-40b8-add1-8431baacfa32/close` → **200**

```json
{
  "command_id": "af7b61ce-b99d-462c-869a-e9a8dfe373c9",
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
  "session_id": "6ddc6c62-6639-4436-8eef-f7fb99f09cd5",
  "subject": {
    "type": "STAFF",
    "id": "2a3afaa3-e140-4771-8de7-2ab6b356cb06"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYTNhZmFhMy1lMTQwLTQ3NzEtOGRlNy0yYWI2YjM1NmNiMDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDY4ODcsImlhdCI6MTc5MzQwNTk4NywianRpIjoiMmY1MmNlNWUtYzQ3MC00NzE5LTg5YWYtMDJhYWJkNjZkZjk1Iiwic2lkIjoiNmRkYzZjNjItNjYzOS00NDM2LThlZWYtZjdmYjk5ZjA5Y2Q1In0.SscW8Ik-9WWX3Ev-NoRBjtViUrQzXfgDQJBokGmJua8",
  "access_expires_at": "2026-10-31T00:34:47.976827898Z",
  "refresh_token": "1EWI8QtLeV-5k9Up2scYbbbiYsgdHi24aGT_wYjDuA4",
  "refresh_expires_at": "2026-10-31T12:19:47.97635264Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "d54d5be7-f25f-4130-ae36-92bd7c43b5fe",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-31T00:19:48Z"
}
```

```json
{
  "id": "20e233a1-d206-4f61-90f6-4f87327fe6bc",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-31T00:19:48Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/20e233a1-d206-4f61-90f6-4f87327fe6bc/publish` → **200**

```json
{
  "command_id": "db0fd6b0-346c-4928-87b6-5d4f5f568e6e",
  "expected_version": 0
}
```

```json
{
  "id": "20e233a1-d206-4f61-90f6-4f87327fe6bc",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-31T00:19:48.420649Z",
  "published_at": "2026-10-31T00:19:48.420649Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "20e233a1-d206-4f61-90f6-4f87327fe6bc",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-31T00:19:48.420649Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630874088",
  "device_ref": "sandbox-26012"
}
```

```json
{
  "challenge_id": "070f9e8c-2dc3-4d17-9338-6a2f1844fa2f",
  "expires_at": "2026-10-31T00:24:48.841868358Z",
  "resend_available_at": "2026-10-31T00:19:49.841868358Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380630874088` → **200**

```json
{
  "phone": "+380630874088",
  "audience": "CLIENT",
  "code": "106203",
  "sent_at": "2026-10-31T00:19:48.843872802Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "070f9e8c-2dc3-4d17-9338-6a2f1844fa2f",
  "code": "106203",
  "device_ref": "sandbox-26012"
}
```

```json
{
  "session_id": "4a3432ec-fa79-4306-b6c5-a026cec2931e",
  "subject": {
    "type": "CLIENT",
    "id": "bbfb8413-8550-4f92-bfc7-7dc84980daba"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYmZiODQxMy04NTUwLTRmOTItYmZjNy03ZGM4NDk4MGRhYmEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDA2ODg5LCJpYXQiOjE3OTM0MDU5ODksImp0aSI6IjNmMjEyY2JiLWZiMDMtNDY3NC1iOWQyLWI4ZTgwNDgxY2Q3MCIsInNpZCI6IjRhMzQzMmVjLWZhNzktNDMwNi1iNmM1LWEwMjZjZWMyOTMxZSJ9.Yz2HHT3h95z1-NRK5gLmDXGcm17Ot_mO9qgJdlIEZFU",
  "access_expires_at": "2026-10-31T00:34:49.066790297Z",
  "refresh_token": "pl0fED5ehRHuICdD3aYEFsjnqp4vfoibA8VvLMTcuWw",
  "refresh_expires_at": "2026-11-30T00:19:49.06645338Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "20e233a1-d206-4f61-90f6-4f87327fe6bc",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-31T00:19:48.420649Z",
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
  "command_id": "f51db0e9-10e1-436a-a875-edbe85db69c9",
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
  "id": "1f3ceda1-e6b8-4797-a848-4db7d9d630cd",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T00:24:49.497127Z",
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
  "command_id": "eb4df273-21ef-4dd9-943e-061e6e08d60a",
  "quote_id": "1f3ceda1-e6b8-4797-a848-4db7d9d630cd",
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
  "correlation_id": "251179a0-c802-403f-806f-b6cae2826ef8"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "2d1bcfe2-88f3-4a55-bbae-fa2f32eeff4c",
  "version_id": "20e233a1-d206-4f61-90f6-4f87327fe6bc",
  "language": "uk"
}
```

```json
{
  "version_id": "20e233a1-d206-4f61-90f6-4f87327fe6bc",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-31T00:19:49.990147Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "187c373a-7cba-4cf9-b252-8151001680b4",
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
  "id": "ea489b06-8a1b-4fe8-99fa-1b220251c720",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T00:24:50.207239Z",
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
  "command_id": "b8057d9f-a711-4b3e-b5c1-c36c65e531a8",
  "quote_id": "ea489b06-8a1b-4fe8-99fa-1b220251c720",
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
  "id": "692402ba-c979-4bdf-9b1c-7f4551cfd82a",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bbfb8413-8550-4f92-bfc7-7dc84980daba",
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
  "created_at": "2026-10-31T00:19:50.426834Z",
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

`GET /api/rider/v1/orders/692402ba-c979-4bdf-9b1c-7f4551cfd82a` → **200**

```json
{
  "id": "692402ba-c979-4bdf-9b1c-7f4551cfd82a",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bbfb8413-8550-4f92-bfc7-7dc84980daba",
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
  "created_at": "2026-10-31T00:19:50.426834Z",
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

`POST /api/rider/v1/orders/692402ba-c979-4bdf-9b1c-7f4551cfd82a/cancel` → **200**

```json
{
  "command_id": "a213cd5d-a83c-4a57-bbc3-f6b92cbe0b99",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "692402ba-c979-4bdf-9b1c-7f4551cfd82a",
  "short_number": 27,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "bbfb8413-8550-4f92-bfc7-7dc84980daba",
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
  "created_at": "2026-10-31T00:19:50.426834Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "en": "Changed my mind",
      "ru": "Передумал ехать",
      "pl": "Zmiana planów",
      "uk": "Передумав їхати"
    }
  },
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

## A published version never changes

`POST /api/admin/v1/legal-documents/20e233a1-d206-4f61-90f6-4f87327fe6bc` → **409**

```json
{
  "command_id": "f4eb1318-de40-47e6-996d-8944e24f2bec",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-31T00:19:51Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/20e233a1-d206-4f61-90f6-4f87327fe6bc",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "a68d02fc-c96c-41cb-bc55-ebecd43a2da8"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "f748d174-1ff8-4b0e-bb23-785d1e47293f",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-31T00:19:51Z"
}
```

```json
{
  "id": "2970218d-afb5-4040-8521-a43469406629",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-31T00:19:51Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/2970218d-afb5-4040-8521-a43469406629/publish` → **200**

```json
{
  "command_id": "ac20625b-4da7-4c91-a272-e2d57485df7d",
  "expected_version": 0
}
```

```json
{
  "id": "2970218d-afb5-4040-8521-a43469406629",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-31T00:19:51.560522Z",
  "published_at": "2026-10-31T00:19:51.560522Z",
  "version": 1
}
```

# Scenario: manual-offer

## Nobody is online in Kyiv; a rider orders with a note and an entrance

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-31631"
}
```

```json
{
  "challenge_id": "e2bbd1c6-4e00-49cb-8499-3fa7ef1c2a87",
  "expires_at": "2026-10-31T00:24:51.767342335Z",
  "resend_available_at": "2026-10-31T00:19:52.767342335Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "807836",
  "sent_at": "2026-10-31T00:19:51.770001709Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e2bbd1c6-4e00-49cb-8499-3fa7ef1c2a87",
  "code": "807836",
  "device_ref": "sandbox-31631"
}
```

```json
{
  "session_id": "62bbb3ec-7ea6-44dc-971e-5fa619e06dbe",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwNjg5MiwiaWF0IjoxNzkzNDA1OTkyLCJqdGkiOiJjZDA2OTY3OC05NjI0LTQ2MWEtYTBmZC02ODgwOTFkNzA5MmIiLCJzaWQiOiI2MmJiYjNlYy03ZWE2LTQ0ZGMtOTcxZS01ZmE2MTllMDZkYmUifQ.6aoKA9WmgzU3McCZOLG53zH-7k95nGbQohkx40sL86k",
  "access_expires_at": "2026-10-31T00:34:52.003811172Z",
  "refresh_token": "XL0ljEEpzO-Z8hzzX5ZGE8OtT7wWnXoIsOrnLSL-z7E",
  "refresh_expires_at": "2026-11-30T00:19:52.003449768Z",
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
  "device_ref": "sandbox-1564"
}
```

```json
{
  "challenge_id": "70fc78c7-62f0-49bb-a22c-be8b33a9e8da",
  "expires_at": "2026-10-31T00:24:52.406820744Z",
  "resend_available_at": "2026-10-31T00:19:53.406820744Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "573638",
  "sent_at": "2026-10-31T00:19:52.409230909Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "70fc78c7-62f0-49bb-a22c-be8b33a9e8da",
  "code": "573638",
  "device_ref": "sandbox-1564"
}
```

```json
{
  "session_id": "9efd7d5f-a99d-47d5-842e-6acfabb3d884",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwNjg5MiwiaWF0IjoxNzkzNDA1OTkyLCJqdGkiOiJjMzNiZmRjMS1hYjc5LTQyZmEtYTE3Mi0xYjQ4MDk3NjgyODQiLCJzaWQiOiI5ZWZkN2Q1Zi1hOTlkLTQ3ZDUtODQyZS02YWNmYWJiM2Q4ODQifQ.w8cL8K7JfSRvQpLImRx-3V9J9Tfq3DtLnNgxisQCWDI",
  "access_expires_at": "2026-10-31T00:34:52.642838357Z",
  "refresh_token": "CXuiMFnpSKpNZe1t2g7XQakrZxKwAJfctd39ZSGf2X4",
  "refresh_expires_at": "2026-11-30T00:19:52.642439096Z",
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
  "device_ref": "sandbox-30847"
}
```

```json
{
  "challenge_id": "41a87731-abb7-4ed5-90b4-e4b2fdc17664",
  "expires_at": "2026-10-31T00:24:53.062463724Z",
  "resend_available_at": "2026-10-31T00:19:54.062463724Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "067128",
  "sent_at": "2026-10-31T00:19:53.064534842Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "41a87731-abb7-4ed5-90b4-e4b2fdc17664",
  "code": "067128",
  "device_ref": "sandbox-30847"
}
```

```json
{
  "session_id": "087415bc-45a2-467f-8c7c-016eddf57ffc",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwNjg5MywiaWF0IjoxNzkzNDA1OTkzLCJqdGkiOiJlZDk0NjEyNS02N2ViLTQyNDUtYjAxOS0zNWY5OGExYTlhMTQiLCJzaWQiOiIwODc0MTViYy00NWEyLTQ2N2YtOGM3Yy0wMTZlZGRmNTdmZmMifQ.fFulK-nq7bFMTsYrNEYcc97jMUfT3sURy9SAgPqJpPo",
  "access_expires_at": "2026-10-31T00:34:53.299491396Z",
  "refresh_token": "rBfaIXEmdkNjcq_L_cHSYCwdzwO_agYemRJi11e-HBs",
  "refresh_expires_at": "2026-11-30T00:19:53.298847026Z",
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
  "session_id": "54444ba3-cfbe-411f-832b-cf54ec8f445d",
  "subject": {
    "type": "STAFF",
    "id": "2a3afaa3-e140-4771-8de7-2ab6b356cb06"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYTNhZmFhMy1lMTQwLTQ3NzEtOGRlNy0yYWI2YjM1NmNiMDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDY4OTMsImlhdCI6MTc5MzQwNTk5MywianRpIjoiZGE4OGY1NzktOTliOS00MDk0LTgzNGUtMzE0MTNjMzJiMjg1Iiwic2lkIjoiNTQ0NDRiYTMtY2ZiZS00MTFmLTgzMmItY2Y1NGVjOGY0NDVkIn0.SF1qcMpJzs0oIiqMN8yWjuChA7SnaGHrR8DYItahOKU",
  "access_expires_at": "2026-10-31T00:34:53.938724949Z",
  "refresh_token": "pmpU27QYcd8rzEn7Ii3dJvishuZSVVN8LXeZnoYp5zE",
  "refresh_expires_at": "2026-10-31T12:19:53.938292288Z",
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
  "session_id": "87bbbef4-90b3-4111-896d-eeffede545c7",
  "subject": {
    "type": "STAFF",
    "id": "2a3afaa3-e140-4771-8de7-2ab6b356cb06"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYTNhZmFhMy1lMTQwLTQ3NzEtOGRlNy0yYWI2YjM1NmNiMDYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDY4OTQsImlhdCI6MTc5MzQwNTk5NCwianRpIjoiOTQxMzFjYzQtN2JlOS00NzRjLTgxZTEtOWRmZDRjOWRkZGU2Iiwic2lkIjoiODdiYmJlZjQtOTBiMy00MTExLTg5NmQtZWVmZmVkZTU0NWM3In0.imezz0kOwukwfO_Y6mVkKzujb0sUBX4017jpG-SV0iM",
  "access_expires_at": "2026-10-31T00:34:54.351676422Z",
  "refresh_token": "o5OvHE8O9hjjqs1-TGjhnomfWmHhYE5_EuTr7QblYkM",
  "refresh_expires_at": "2026-10-31T12:19:54.35124358Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380682854096",
  "device_ref": "sandbox-29576"
}
```

```json
{
  "challenge_id": "bcf17a7f-c22e-4879-92b4-6967c7d0cfa9",
  "expires_at": "2026-10-31T00:24:54.556064997Z",
  "resend_available_at": "2026-10-31T00:19:55.556064997Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380682854096` → **200**

```json
{
  "phone": "+380682854096",
  "audience": "CLIENT",
  "code": "128078",
  "sent_at": "2026-10-31T00:19:54.558372972Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bcf17a7f-c22e-4879-92b4-6967c7d0cfa9",
  "code": "128078",
  "device_ref": "sandbox-29576"
}
```

```json
{
  "session_id": "8e4defdc-2b2b-465a-8a7d-f4ef980044f5",
  "subject": {
    "type": "CLIENT",
    "id": "b6f640f0-feef-47f7-9bc6-6ea12d11cb16"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNmY2NDBmMC1mZWVmLTQ3ZjctOWJjNi02ZWExMmQxMWNiMTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDA2ODk0LCJpYXQiOjE3OTM0MDU5OTQsImp0aSI6ImQ4ZDdmYTAwLWU2MTAtNGI3MC1iNDZmLTE1NzkyOGUxYmQzNCIsInNpZCI6IjhlNGRlZmRjLTJiMmItNDY1YS04YTdkLWY0ZWY5ODAwNDRmNSJ9.Pk4kXJP7znMuP2aUC4IF_Z6MQEtgwuHp53Gd0_f4mR8",
  "access_expires_at": "2026-10-31T00:34:54.78686971Z",
  "refresh_token": "fLR77X5kQU0uPhAHVXxNkVz42Fx6UebdwcpKtCvgVzw",
  "refresh_expires_at": "2026-11-30T00:19:54.786495497Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "14e1808e-0ce9-4af7-a60d-7ba2197ec5c8",
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
  "id": "3708cdc4-0d47-450a-8c2f-3240dd39c0d0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T00:24:54.989959Z",
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
  "command_id": "9bb84b6d-bbbc-4ff3-b361-a2c334a88e58",
  "quote_id": "3708cdc4-0d47-450a-8c2f-3240dd39c0d0",
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
  "comment": "Дві валізи",
  "entrance": "Вихід з метро №2"
}
```

```json
{
  "id": "f7976864-1b52-4a66-9922-c12e33c9630d",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b6f640f0-feef-47f7-9bc6-6ea12d11cb16",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T00:19:55.20269Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null,
  "comment": "Дві валізи",
  "entrance": "Вихід з метро №2"
}
```

## An offer to Oleh, who is offline, is refused

`POST /api/operator/v1/orders/f7976864-1b52-4a66-9922-c12e33c9630d/manual-offers` → **409**

```json
{
  "command_id": "06c84ded-9603-4fdb-b2e4-d85f66a00aff",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "reason": "Regular client"
}
```

```json
{
  "instance": "/api/operator/v1/orders/f7976864-1b52-4a66-9922-c12e33c9630d/manual-offers",
  "status": 409,
  "title": "Driver not eligible",
  "type": "https://errors.blizz.taxi/driver-not-eligible",
  "code": "DRIVER_NOT_ELIGIBLE",
  "correlation_id": "58e86743-e5ee-41e4-9174-3bb8b0d959a8"
}
```

## Andrii comes online 1 km away; the operator offers him the order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-14615"
}
```

```json
{
  "challenge_id": "0663757a-c696-4d83-94fd-df0c4b016885",
  "expires_at": "2026-10-31T00:24:55.690495456Z",
  "resend_available_at": "2026-10-31T00:19:56.690495456Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "104578",
  "sent_at": "2026-10-31T00:19:55.692813677Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0663757a-c696-4d83-94fd-df0c4b016885",
  "code": "104578",
  "device_ref": "sandbox-14615"
}
```

```json
{
  "session_id": "b669ba36-d317-4934-acbd-59d7bbf3d4cc",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwNjg5NSwiaWF0IjoxNzkzNDA1OTk1LCJqdGkiOiI4ODg0ZmY4OS1mZWMwLTQ1NmYtODc2YS04NTA3ZDQ0MDU5YTMiLCJzaWQiOiJiNjY5YmEzNi1kMzE3LTQ5MzQtYWNiZC01OWQ3YmJmM2Q0Y2MifQ.gRqFQCCXWzOF-Y6FL0rr5QantVD2QttLuceV7i57e74",
  "access_expires_at": "2026-10-31T00:34:55.920758951Z",
  "refresh_token": "4H3zIoMVglaXAj-4LgA1BBAPtpjvdXw1P8oHDhnXsK8",
  "refresh_expires_at": "2026-11-30T00:19:55.920395304Z",
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
  "command_id": "4ee97941-7ebe-4a63-ae6e-9e30f9e0d283",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4591,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T00:19:56Z",
    "sequence": 1793405996351
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "d885860d-e324-42da-bb9f-a168116661fd",
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
  "last_heartbeat_at": "2026-10-31T00:19:56.367046Z",
  "last_location_at": "2026-10-31T00:19:56.367046Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/operator/v1/orders/f7976864-1b52-4a66-9922-c12e33c9630d/manual-offers` → **200**

```json
{
  "command_id": "4c87f77f-9db9-4a74-a941-b080bd413576",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "reason": "Regular client asked for him"
}
```

```json
{
  "id": "f7976864-1b52-4a66-9922-c12e33c9630d",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "b6f640f0-feef-47f7-9bc6-6ea12d11cb16",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T00:19:55.20269Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null,
  "driver": null,
  "driver_change": null,
  "comment": "Дві валізи",
  "entrance": "Вихід з метро №2"
}
```

`POST /api/operator/v1/orders/f7976864-1b52-4a66-9922-c12e33c9630d/manual-offers` → **409**

```json
{
  "command_id": "c22b5adf-43d8-4ed9-afbe-bcdcbf519889",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "reason": "Twice"
}
```

```json
{
  "instance": "/api/operator/v1/orders/f7976864-1b52-4a66-9922-c12e33c9630d/manual-offers",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "cff037cc-226f-4204-be8d-8374fc6430d2"
}
```

## Andrii sees an ordinary offer with its terms, the note and the entrance, and accepts it

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "1b875447-7fb2-43f4-943f-2c0336c46f59",
    "order_id": "f7976864-1b52-4a66-9922-c12e33c9630d",
    "expires_at": "2026-10-31T00:20:11.578254Z",
    "server_time": "2026-10-31T00:19:57.029939233Z",
    "seconds_left": 14,
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
    "distance_m": 1001,
    "price_kind": "FIXED",
    "expected_earnings_minor": 8939,
    "comment": "Дві валізи",
    "entrance": "Вихід з метро №2"
  }
]
```

`POST /api/driver/v1/offers/1b875447-7fb2-43f4-943f-2c0336c46f59/accept` → **200**

```json
{
  "command_id": "ada8838c-9f00-4549-8b94-fb2a07e79e82"
}
```

```json
{
  "id": "9f6eae0f-a920-43c0-9008-554b6b3831ea",
  "order_id": "f7976864-1b52-4a66-9922-c12e33c9630d",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "be44d075-49c3-4974-b76a-167749c4cfe1",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "be44d075-49c3-4974-b76a-167749c4cfe1",
  "order_id": "f7976864-1b52-4a66-9922-c12e33c9630d",
  "assignment_id": "9f6eae0f-a920-43c0-9008-554b6b3831ea",
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
  "recipient": null,
  "comment": "Дві валізи",
  "entrance": "Вихід з метро №2"
}
```

`GET /api/operator/v1/orders/f7976864-1b52-4a66-9922-c12e33c9630d/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-31T00:19:55.20322Z",
      "actor": {
        "type": "CLIENT",
        "id": "b6f640f0-feef-47f7-9bc6-6ea12d11cb16",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "f7976864-1b52-4a66-9922-c12e33c9630d",
        "quote_id": "3708cdc4-0d47-450a-8c2f-3240dd39c0d0",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "3691aea9-e8d5-42f2-af5c-0e62996836d9"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-31T00:19:55.204396Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "f7976864-1b52-4a66-9922-c12e33c9630d",
        "attempt_id": "02a03cc6-7471-47be-8d82-c05ffa301d7f",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "3691aea9-e8d5-42f2-af5c-0e62996836d9"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-31T00:19:55.219974Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "f7976864-1b52-4a66-9922-c12e33c9630d",
        "attempt_id": "02a03cc6-7471-47be-8d82-c05ffa301d7f"
      },
      "correlation_id": "3691aea9-e8d5-42f2-af5c-0e62996836d9"
    },
    {
      "sequence": 3,
      "type": "OfferMade",
      "occurred_at": "2026-10-31T00:19:56.579119Z",
      "actor": {
        "type": "STAFF",
        "id": "2a3afaa3-e140-4771-8de7-2ab6b356cb06",
        "name": "Super Admin",
        "role": "SUPER_ADMIN"
      },
      "reason": null,
      "details": {
        "source": "MANUAL",
        "offer_id": "1b875447-7fb2-43f4-943f-2c0336c46f59",
        "order_id": "f7976864-1b52-4a66-9922-c12e33c9630d",
        "driver_id": "5a000000-0000-4000-8000-000000000403",
        "distance_m": 1001,
        "expires_at": "2026-10-31T00:20:11.578253743Z"
      },
      "correlation_id": "8e813dfa-6a4d-42ed-94ee-6924106a80a2"
    },
```

Done: order f7976864-1b52-4a66-9922-c12e33c9630d offered by hand to 5a000000-0000-4000-8000-000000000403, earnings estimate 8939 of 10517.

`GET /api/operator/v1/orders/f7976864-1b52-4a66-9922-c12e33c9630d` → **200**

```json
{
  "id": "f7976864-1b52-4a66-9922-c12e33c9630d",
  "short_number": 28,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "b6f640f0-feef-47f7-9bc6-6ea12d11cb16",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "9f6eae0f-a920-43c0-9008-554b6b3831ea",
    "order_id": "f7976864-1b52-4a66-9922-c12e33c9630d",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "be44d075-49c3-4974-b76a-167749c4cfe1",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-31T00:19:55.20269Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null,
  "driver": {
    "name": "Андрій Шевчук",
    "make": "Hyundai",
    "model": "Sonata",
    "color": "black",
    "registration_number": "AA0003TX",
    "photo_url": null
  },
  "driver_change": null,
  "comment": "Дві валізи",
  "entrance": "Вихід з метро №2"
}
```

`POST /api/operator/v1/orders/f7976864-1b52-4a66-9922-c12e33c9630d/cancel` → **200**

```json
{
  "command_id": "aad56d14-137e-4dd0-bd9d-9ecf83087fee",
  "expected_version": 4,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "f7976864-1b52-4a66-9922-c12e33c9630d",
  "short_number": 28,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "b6f640f0-feef-47f7-9bc6-6ea12d11cb16",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "9f6eae0f-a920-43c0-9008-554b6b3831ea",
    "order_id": "f7976864-1b52-4a66-9922-c12e33c9630d",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "be44d075-49c3-4974-b76a-167749c4cfe1",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-31T00:19:55.20269Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "en": "No cars available",
      "ru": "Нет свободных машин",
      "pl": "Brak wolnych aut",
      "uk": "Немає вільних авто"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null,
  "driver": null,
  "driver_change": null,
  "comment": "Дві валізи",
  "entrance": "Вихід з метро №2"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "d885860d-e324-42da-bb9f-a168116661fd",
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
  "last_heartbeat_at": "2026-10-31T00:19:56.367046Z",
  "last_location_at": "2026-10-31T00:19:56.367046Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d885860d-e324-42da-bb9f-a168116661fd/close` → **200**

```json
{
  "command_id": "0e1ecc78-f152-4d0a-84ab-1e0a6de6c60b",
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

# Scenario: multiple-orders

## A driver goes online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-27829"
}
```

```json
{
  "challenge_id": "e8b1e762-c174-4095-a543-b45738885833",
  "expires_at": "2026-10-31T00:24:58.808464282Z",
  "resend_available_at": "2026-10-31T00:19:59.808464282Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "523356",
  "sent_at": "2026-10-31T00:19:58.811367148Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e8b1e762-c174-4095-a543-b45738885833",
  "code": "523356",
  "device_ref": "sandbox-27829"
}
```

```json
{
  "session_id": "ecb16b01-1060-4048-9a1b-23c6e93056c1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwNjg5OSwiaWF0IjoxNzkzNDA1OTk5LCJqdGkiOiI2ZjY5NjQwZi0xMjcyLTQ0ZTEtYjk4ZS0zMjkwOGE0ZmUwMTQiLCJzaWQiOiJlY2IxNmIwMS0xMDYwLTQwNDgtOWExYi0yM2M2ZTkzMDU2YzEifQ.4mZPW1-v3BYDvuioN-VBET0fNmIakeXLT12pj9cnK30",
  "access_expires_at": "2026-10-31T00:34:59.046954393Z",
  "refresh_token": "cN32x-pxLg36oV_P-szZ-nuT9zr6HnEo_VUXoRfHXxI",
  "refresh_expires_at": "2026-11-30T00:19:59.046594Z",
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

(the car drives 66 s to the next point)

`POST /api/driver/v1/work-sessions` → **201**

```json
{
  "command_id": "c2d06440-d304-466e-b69c-c0313ccb6b1c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T00:21:05Z",
    "sequence": 1793406065471
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "c89428ea-b5df-45d3-9114-e4defdca84a8",
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
  "last_heartbeat_at": "2026-10-31T00:21:05.487582Z",
  "last_location_at": "2026-10-31T00:21:05.487582Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671315118",
  "device_ref": "sandbox-5532"
}
```

```json
{
  "challenge_id": "16b83cc9-b2b3-4865-b70f-8f564b4fdd60",
  "expires_at": "2026-10-31T00:26:05.708809474Z",
  "resend_available_at": "2026-10-31T00:21:06.708809474Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380671315118` → **200**

```json
{
  "phone": "+380671315118",
  "audience": "CLIENT",
  "code": "882370",
  "sent_at": "2026-10-31T00:21:05.711196969Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "16b83cc9-b2b3-4865-b70f-8f564b4fdd60",
  "code": "882370",
  "device_ref": "sandbox-5532"
}
```

```json
{
  "session_id": "dab9aa3f-7b02-458c-80b7-81042d35dd31",
  "subject": {
    "type": "CLIENT",
    "id": "553e0530-df65-45ab-8b3f-b949b3c53f8f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NTNlMDUzMC1kZjY1LTQ1YWItOGIzZi1iOTQ5YjNjNTNmOGYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDA2OTY1LCJpYXQiOjE3OTM0MDYwNjUsImp0aSI6IjJjYjc5OGM5LWE2NmMtNGU4NC04N2M1LTIwY2NlNzU3MzkyMiIsInNpZCI6ImRhYjlhYTNmLTdiMDItNDU4Yy04MGI3LTgxMDQyZDM1ZGQzMSJ9.i4XJ_kP_AEQopnafZ4T6TQ9LAqt7uOJijAMu78VHIvk",
  "access_expires_at": "2026-10-31T00:36:05.949678006Z",
  "refresh_token": "gLKhTCwHT9gMUzkG9RNu9lT4mTcE7y-ly4BySIcCoXk",
  "refresh_expires_at": "2026-11-30T00:21:05.949309661Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6a05915c-d21f-46e1-ba5c-9b4600d36582",
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
  "id": "5412b891-d04a-446c-86ce-287feae3b6a6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T00:26:06.168558Z",
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
  "command_id": "243913a3-8e3f-4832-82fe-5a0e405c00e8",
  "quote_id": "5412b891-d04a-446c-86ce-287feae3b6a6",
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
    "phone": "+380679142028"
  }
}
```

```json
{
  "id": "320b883c-a9d2-427b-9743-91e86275feee",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "553e0530-df65-45ab-8b3f-b949b3c53f8f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T00:21:06.39696Z",
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

## The offer says nothing about granny; once accepted, the trip does

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "16581c7d-d8fc-4f1f-8e14-975dcd963628",
    "order_id": "320b883c-a9d2-427b-9743-91e86275feee",
    "expires_at": "2026-10-31T00:21:21.399721Z",
    "server_time": "2026-10-31T00:21:06.632820206Z",
    "seconds_left": 14,
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
    "distance_m": 211,
    "price_kind": "FIXED",
    "expected_earnings_minor": 8939,
    "comment": null,
    "entrance": null
  }
]
```

`POST /api/driver/v1/offers/16581c7d-d8fc-4f1f-8e14-975dcd963628/accept` → **200**

```json
{
  "command_id": "9b421d83-2c89-4b34-b38b-e7ee64d49358"
}
```

```json
{
  "id": "663e72ab-023e-4cad-8089-3062be6a0074",
  "order_id": "320b883c-a9d2-427b-9743-91e86275feee",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "337ad5f9-8bd4-4654-b051-d3ac0a603d7c",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "337ad5f9-8bd4-4654-b051-d3ac0a603d7c",
  "order_id": "320b883c-a9d2-427b-9743-91e86275feee",
  "assignment_id": "663e72ab-023e-4cad-8089-3062be6a0074",
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
    "phone": "+380679142028"
  },
  "comment": null,
  "entrance": null
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "77f2e378-3f8c-4f43-8efe-5fb0f0ea4bae",
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
  "id": "eb036852-7514-4773-aa77-ad958362411c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T00:26:07.282113Z",
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
  "command_id": "5343b175-c047-4fcd-924f-ccd769d9857b",
  "quote_id": "eb036852-7514-4773-aa77-ad958362411c",
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
  "id": "0f63a634-67f2-4a73-8686-9ccc340589d6",
  "short_number": 30,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "553e0530-df65-45ab-8b3f-b949b3c53f8f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T00:21:07.506253Z",
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

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "02e60967-0a06-4edc-8cb4-afd78dd3fd9c",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-31T03:21:07Z"
}
```

```json
{
  "id": "d9c84fb7-c347-4a59-80a7-c5dadce54a5b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T00:26:07.743144Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-31T03:21:07Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "2b16d9cd-e536-4013-8e20-10cdad1aea88",
  "quote_id": "d9c84fb7-c347-4a59-80a7-c5dadce54a5b",
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
  "pickup_at": "2026-10-31T03:21:07Z"
}
```

```json
{
  "id": "51135e71-ec10-487a-9697-8a5133d5bb4d",
  "short_number": 31,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "553e0530-df65-45ab-8b3f-b949b3c53f8f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-31T00:21:07.966902Z",
  "cancellation": null,
  "pickup_at": "2026-10-31T03:21:07Z",
  "preorder": true,
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

## The fourth is refused: at most three active orders, orders for later included

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e0a2aa54-f09c-4999-9198-bb9da233fee2",
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
  "id": "916d4517-a92f-4b62-b3c6-f8330f44cf69",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T00:26:08.200844Z",
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
  "command_id": "419e8e92-a3ba-4073-b645-f2f95a56ef43",
  "quote_id": "916d4517-a92f-4b62-b3c6-f8330f44cf69",
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
  "correlation_id": "26446765-6c35-4033-aacf-0d0e5ba6711e"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "51135e71-ec10-487a-9697-8a5133d5bb4d",
      "short_number": 31,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "553e0530-df65-45ab-8b3f-b949b3c53f8f",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-31T00:21:07.966902Z",
      "cancellation": null,
      "pickup_at": "2026-10-31T03:21:07Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null,
      "driver": null,
      "driver_change": null,
      "comment": null,
      "entrance": null
    },
    {
      "id": "0f63a634-67f2-4a73-8686-9ccc340589d6",
      "short_number": 30,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "553e0530-df65-45ab-8b3f-b949b3c53f8f",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
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
      "created_at": "2026-10-31T00:21:07.506253Z",
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
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "0f63a634-67f2-4a73-8686-9ccc340589d6",
  "short_number": 30,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "553e0530-df65-45ab-8b3f-b949b3c53f8f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T00:21:07.506253Z",
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

## The rider cancels all three; the driver goes off line

`GET /api/rider/v1/orders/320b883c-a9d2-427b-9743-91e86275feee` → **200**

```json
{
  "id": "320b883c-a9d2-427b-9743-91e86275feee",
  "short_number": 29,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "553e0530-df65-45ab-8b3f-b949b3c53f8f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "663e72ab-023e-4cad-8089-3062be6a0074",
    "order_id": "320b883c-a9d2-427b-9743-91e86275feee",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "337ad5f9-8bd4-4654-b051-d3ac0a603d7c",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-31T00:21:06.39696Z",
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
    "location_at": "2026-10-31T00:21:05.487582Z",
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
  "driver_change": null,
  "comment": null,
  "entrance": null
}
```

`POST /api/rider/v1/orders/320b883c-a9d2-427b-9743-91e86275feee/cancel` → **200**

```json
{
  "command_id": "57f8f172-198c-4738-9600-956f60957f31",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "320b883c-a9d2-427b-9743-91e86275feee",
  "short_number": 29,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "553e0530-df65-45ab-8b3f-b949b3c53f8f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "663e72ab-023e-4cad-8089-3062be6a0074",
    "order_id": "320b883c-a9d2-427b-9743-91e86275feee",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "337ad5f9-8bd4-4654-b051-d3ac0a603d7c",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-31T00:21:06.39696Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "en": "Changed my mind",
      "ru": "Передумал ехать",
      "pl": "Zmiana planów",
      "uk": "Передумав їхати"
    }
  },
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

`GET /api/rider/v1/orders/0f63a634-67f2-4a73-8686-9ccc340589d6` → **200**

```json
{
  "id": "0f63a634-67f2-4a73-8686-9ccc340589d6",
  "short_number": 30,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "553e0530-df65-45ab-8b3f-b949b3c53f8f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T00:21:07.506253Z",
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

`POST /api/rider/v1/orders/0f63a634-67f2-4a73-8686-9ccc340589d6/cancel` → **200**

```json
{
  "command_id": "5d2554e7-476b-4b5e-a329-5b191ca6569d",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "0f63a634-67f2-4a73-8686-9ccc340589d6",
  "short_number": 30,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "553e0530-df65-45ab-8b3f-b949b3c53f8f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T00:21:07.506253Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "en": "Changed my mind",
      "ru": "Передумал ехать",
      "pl": "Zmiana planów",
      "uk": "Передумав їхати"
    }
  },
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

`GET /api/rider/v1/orders/51135e71-ec10-487a-9697-8a5133d5bb4d` → **200**

```json
{
  "id": "51135e71-ec10-487a-9697-8a5133d5bb4d",
  "short_number": 31,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "553e0530-df65-45ab-8b3f-b949b3c53f8f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-31T00:21:07.966902Z",
  "cancellation": null,
  "pickup_at": "2026-10-31T03:21:07Z",
  "preorder": true,
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

`POST /api/rider/v1/orders/51135e71-ec10-487a-9697-8a5133d5bb4d/cancel` → **200**

```json
{
  "command_id": "69130c87-8fef-45e4-b57e-cc6f616e882d",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "51135e71-ec10-487a-9697-8a5133d5bb4d",
  "short_number": 31,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "553e0530-df65-45ab-8b3f-b949b3c53f8f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-31T00:21:07.966902Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "en": "Changed my mind",
      "ru": "Передумал ехать",
      "pl": "Zmiana planów",
      "uk": "Передумав їхати"
    }
  },
  "pickup_at": "2026-10-31T03:21:07Z",
  "preorder": true,
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

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "c89428ea-b5df-45d3-9114-e4defdca84a8",
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
  "last_heartbeat_at": "2026-10-31T00:21:05.487582Z",
  "last_location_at": "2026-10-31T00:21:05.487582Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c89428ea-b5df-45d3-9114-e4defdca84a8/close` → **200**

```json
{
  "command_id": "83aabc7b-f0d5-41e1-824e-080649ce2a4f",
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

Done: orders 320b883c-a9d2-427b-9743-91e86275feee, 0f63a634-67f2-4a73-8686-9ccc340589d6, 51135e71-ec10-487a-9697-8a5133d5bb4d.

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
  "session_id": "3d104de5-720b-40fc-a008-771be7739b0e",
  "subject": {
    "type": "STAFF",
    "id": "2a3afaa3-e140-4771-8de7-2ab6b356cb06"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYTNhZmFhMy1lMTQwLTQ3NzEtOGRlNy0yYWI2YjM1NmNiMDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDY5NzEsImlhdCI6MTc5MzQwNjA3MSwianRpIjoiMGFjODQyYjktZmExZi00ZWIwLWFjZTItYmIwOGE2NjUwODEwIiwic2lkIjoiM2QxMDRkZTUtNzIwYi00MGZjLWEwMDgtNzcxYmU3NzM5YjBlIn0.Hrap0pllWR98R6XaPlRptitNkY2Wr1w4wV4N81geoD0",
  "access_expires_at": "2026-10-31T00:36:11.101382198Z",
  "refresh_token": "eEvPkeE4AtJAPVvsLse2HtWG-F8Y7JsaVlny__2Haqs",
  "refresh_expires_at": "2026-10-31T12:21:11.100923664Z",
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
  "session_id": "6ed66a1d-26cf-4faa-8b19-d798279ffde4",
  "subject": {
    "type": "STAFF",
    "id": "2a3afaa3-e140-4771-8de7-2ab6b356cb06"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYTNhZmFhMy1lMTQwLTQ3NzEtOGRlNy0yYWI2YjM1NmNiMDYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDY5NzEsImlhdCI6MTc5MzQwNjA3MSwianRpIjoiMTAwNGRlYTUtMzJiNi00ZjRlLWFjZWUtZjE4ZDAyOTA1MWJlIiwic2lkIjoiNmVkNjZhMWQtMjZjZi00ZmFhLThiMTktZDc5ODI3OWZmZGU0In0.G0cx672daS5oW6d4rZ5Odiol-W9jmmjdZrMwC9vJdWQ",
  "access_expires_at": "2026-10-31T00:36:11.523709698Z",
  "refresh_token": "flDyMfqaVwCsn_WACoJyt0HDudLon66esZuCZoMGcL0",
  "refresh_expires_at": "2026-10-31T12:21:11.523261393Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-3507"
}
```

```json
{
  "challenge_id": "1c1ecfbf-448f-4716-a198-ada1146c8090",
  "expires_at": "2026-10-31T00:26:11.725614541Z",
  "resend_available_at": "2026-10-31T00:21:12.725614541Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "919339",
  "sent_at": "2026-10-31T00:21:11.727604016Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1c1ecfbf-448f-4716-a198-ada1146c8090",
  "code": "919339",
  "device_ref": "sandbox-3507"
}
```

```json
{
  "session_id": "2f035a37-036b-4b2e-9948-d5d093635c36",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwNjk3MSwiaWF0IjoxNzkzNDA2MDcxLCJqdGkiOiJhYmEzYTQ2NC1iNzU2LTQ2NGQtOTVjNi0wZDRlNGY3MjQ1MDEiLCJzaWQiOiIyZjAzNWEzNy0wMzZiLTRiMmUtOTk0OC1kNWQwOTM2MzVjMzYifQ.gxzJFSq2GX207LcsK3Ggj3YR0tVhO0CSaVxOqO4DPcA",
  "access_expires_at": "2026-10-31T00:36:11.962523281Z",
  "refresh_token": "lgcipDkAQc-wjH1BTn3jW3xr3qS3ynHCrmazxBH2x6U",
  "refresh_expires_at": "2026-11-30T00:21:11.962069067Z",
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
  "command_id": "01a60210-0dd3-4f57-ac79-4c8f77f667dd",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T00:21:12Z",
    "sequence": 1793406072393
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "238fd780-e2a4-4d9e-bf5e-5d0ecd75debf",
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
  "last_heartbeat_at": "2026-10-31T00:21:12.409433Z",
  "last_location_at": "2026-10-31T00:21:12.409433Z",
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
  "command_id": "df513adf-d242-4fc2-8f1a-8e60ae7d189e",
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
  "effective_at": "2026-10-31T00:21:12.855264Z",
  "changed_by": "2a3afaa3-e140-4771-8de7-2ab6b356cb06",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "2a3afaa3-e140-4771-8de7-2ab6b356cb06",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-31T00:08:40.153265Z",
  "last_entries": [
    {
      "order_id": "9d8b8a57-2361-4544-934e-4dee5db5c32b",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-31T00:08:40.153265Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "bc17a13d-f279-4ad5-933b-d6728f984975",
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
  "id": "1bbaacb1-8a51-4b7f-9d17-5e8a3bd99345",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T00:26:13.296969Z",
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
  "command_id": "1f03fc0c-b86c-4384-b3b2-ac9995c758e9",
  "quote_id": "1bbaacb1-8a51-4b7f-9d17-5e8a3bd99345",
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
    "phone": "+3806711121292"
  }
}
```

```json
{
  "id": "849346d6-61d5-4bd1-bee4-659cb0b41434",
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
  "created_at": "2026-10-31T00:21:13.559878Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711121292"
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
    "id": "a0ea3d4e-5745-47b5-ac98-5553dd284f3d",
    "order_id": "849346d6-61d5-4bd1-bee4-659cb0b41434",
    "expires_at": "2026-10-31T00:21:28.562884Z",
    "server_time": "2026-10-31T00:21:13.803134898Z",
    "seconds_left": 14,
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
    "distance_m": 100,
    "price_kind": "FIXED",
    "expected_earnings_minor": 25472,
    "comment": null,
    "entrance": null
  }
]
```

`POST /api/driver/v1/offers/a0ea3d4e-5745-47b5-ac98-5553dd284f3d/accept` → **200**

```json
{
  "command_id": "8c515a52-a17d-47e4-8fe5-8c62af9a2e39"
}
```

```json
{
  "id": "7ee59779-5779-43a8-ac6e-e1506e3a59bb",
  "order_id": "849346d6-61d5-4bd1-bee4-659cb0b41434",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "10f5722f-c190-4eab-8607-720491c6645f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "10f5722f-c190-4eab-8607-720491c6645f",
  "order_id": "849346d6-61d5-4bd1-bee4-659cb0b41434",
  "assignment_id": "7ee59779-5779-43a8-ac6e-e1506e3a59bb",
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
    "phone": "+3806711121292"
  },
  "comment": null,
  "entrance": null
}
```

`POST /api/driver/v1/work-sessions/238fd780-e2a4-4d9e-bf5e-5d0ecd75debf/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T00:21:14Z",
    "sequence": 1793406074452
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "238fd780-e2a4-4d9e-bf5e-5d0ecd75debf",
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
  "last_heartbeat_at": "2026-10-31T00:21:14.469319Z",
  "last_location_at": "2026-10-31T00:21:14.469319Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/10f5722f-c190-4eab-8607-720491c6645f/arrive` → **200**

```json
{
  "command_id": "cd35885f-4e3e-4c7e-b331-96a01555ee2e",
  "expected_version": 0
}
```

```json
{
  "id": "10f5722f-c190-4eab-8607-720491c6645f",
  "order_id": "849346d6-61d5-4bd1-bee4-659cb0b41434",
  "assignment_id": "7ee59779-5779-43a8-ac6e-e1506e3a59bb",
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
  "arrived_at": "2026-10-31T00:21:14.69535Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711121292"
  },
  "comment": null,
  "entrance": null
}
```

`POST /api/driver/v1/trips/10f5722f-c190-4eab-8607-720491c6645f/start` → **200**

```json
{
  "command_id": "6393fad7-f6da-404e-9fdc-0802683c9347",
  "expected_version": 1
}
```

```json
{
  "id": "10f5722f-c190-4eab-8607-720491c6645f",
  "order_id": "849346d6-61d5-4bd1-bee4-659cb0b41434",
  "assignment_id": "7ee59779-5779-43a8-ac6e-e1506e3a59bb",
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
  "arrived_at": "2026-10-31T00:21:14.69535Z",
  "started_at": "2026-10-31T00:21:14.914061Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711121292"
  },
  "comment": null,
  "entrance": null
}
```

`POST /api/driver/v1/trips/10f5722f-c190-4eab-8607-720491c6645f/complete` → **200**

```json
{
  "command_id": "c5043017-17b4-4c8d-b599-ad6f48ef5769",
  "expected_version": 2,
  "reported_at": "2026-10-31T00:21:15Z",
  "cash_received": true
}
```

```json
{
  "id": "10f5722f-c190-4eab-8607-720491c6645f",
  "order_id": "849346d6-61d5-4bd1-bee4-659cb0b41434",
  "assignment_id": "7ee59779-5779-43a8-ac6e-e1506e3a59bb",
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
  "arrived_at": "2026-10-31T00:21:14.69535Z",
  "started_at": "2026-10-31T00:21:14.914061Z",
  "completed_at": "2026-10-31T00:21:15.141807Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null,
  "comment": null,
  "entrance": null
}
```

## Second phone order is cancelled for operator error

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "8e650606-3111-469e-a9ae-e215d537238d",
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
  "id": "9ca08766-d6f0-4362-a87a-10073653bb3a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T00:26:15.385334Z",
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
  "command_id": "c9d2a96c-dbf6-4f07-89f2-0879c75091fe",
  "quote_id": "9ca08766-d6f0-4362-a87a-10073653bb3a",
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
    "phone": "+3806711113916"
  }
}
```

```json
{
  "id": "6390f310-59c9-4412-a240-81a3ac981d82",
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
  "created_at": "2026-10-31T00:21:15.607718Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711113916"
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

`GET /api/operator/v1/orders/6390f310-59c9-4412-a240-81a3ac981d82` → **200**

```json
{
  "id": "6390f310-59c9-4412-a240-81a3ac981d82",
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
  "created_at": "2026-10-31T00:21:15.607718Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711113916"
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

`POST /api/operator/v1/orders/6390f310-59c9-4412-a240-81a3ac981d82/cancel` → **200**

```json
{
  "command_id": "4df14c13-a1c3-472b-a64f-be1ba3a9d50f",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "6390f310-59c9-4412-a240-81a3ac981d82",
  "short_number": 33,
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
  "created_at": "2026-10-31T00:21:15.607718Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711113916"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "OPERATOR_ERROR",
    "reason_labels": {
      "en": "Operator error",
      "ru": "Ошибка оператора",
      "pl": "Błąd operatora",
      "uk": "Помилка оператора"
    }
  },
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

## Operator reads own bonus account

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "2a3afaa3-e140-4771-8de7-2ab6b356cb06",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-31T00:08:40.153265Z",
  "last_entries": [
    {
      "order_id": "6390f310-59c9-4412-a240-81a3ac981d82",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-31T00:21:16.074781Z"
    },
    {
      "order_id": "849346d6-61d5-4bd1-bee4-659cb0b41434",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-31T00:21:15.155638Z"
    },
    {
      "order_id": "9d8b8a57-2361-4544-934e-4dee5db5c32b",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-31T00:08:40.153265Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "238fd780-e2a4-4d9e-bf5e-5d0ecd75debf",
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
  "last_heartbeat_at": "2026-10-31T00:21:14.469319Z",
  "last_location_at": "2026-10-31T00:21:14.469319Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/238fd780-e2a4-4d9e-bf5e-5d0ecd75debf/close` → **200**

```json
{
  "command_id": "3f5e5f00-5f1d-4f21-aabd-59f9f8d0d226",
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

Done: operator bonus for fulfilled 849346d6-61d5-4bd1-bee4-659cb0b41434 and operator-fault cancellation 6390f310-59c9-4412-a240-81a3ac981d82.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674981019",
  "device_ref": "sandbox-31218"
}
```

```json
{
  "challenge_id": "d7088ad8-b1bf-460e-91a0-73f388cd89d1",
  "expires_at": "2026-10-31T00:26:20.185901605Z",
  "resend_available_at": "2026-10-31T00:21:21.185901605Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380674981019` → **200**

```json
{
  "phone": "+380674981019",
  "audience": "CLIENT",
  "code": "933591",
  "sent_at": "2026-10-31T00:21:20.187885895Z",
  "channel": "SMS"
}
```

## "Call me instead" on the first try still gets an SMS; the resend is a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678170464",
  "device_ref": "sandbox-21078",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "9c7fa06a-f42f-4e89-8cfb-7358cec6a3ac",
  "expires_at": "2026-10-31T00:26:21.631315719Z",
  "resend_available_at": "2026-10-31T00:21:22.631315719Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380678170464` → **200**

```json
{
  "phone": "+380678170464",
  "audience": "CLIENT",
  "code": "904367",
  "sent_at": "2026-10-31T00:21:21.632936619Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678170464",
  "device_ref": "sandbox-1662",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "b9e66a8b-46c8-43b5-80fe-9e5f06c764e6",
  "expires_at": "2026-10-31T00:26:23.074884195Z",
  "resend_available_at": "2026-10-31T00:21:24.074884195Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380678170464` → **200**

```json
{
  "phone": "+380678170464",
  "audience": "CLIENT",
  "code": "946723",
  "sent_at": "2026-10-31T00:21:23.07713329Z",
  "channel": "VOICE"
}
```

## The SMS does not get through: one request, one attempt; the resend comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671370000",
  "device_ref": "sandbox-31645"
}
```

```json
{
  "challenge_id": "ca32763d-58d0-49c6-af7b-c69b5795b1d5",
  "expires_at": "2026-10-31T00:26:24.52072447Z",
  "resend_available_at": "2026-10-31T00:21:25.52072447Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671370000",
  "device_ref": "sandbox-15441"
}
```

```json
{
  "challenge_id": "3b053f46-9adb-4e93-9aae-62fd86f333dd",
  "expires_at": "2026-10-31T00:26:25.949540791Z",
  "resend_available_at": "2026-10-31T00:21:26.949540791Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380671370000` → **200**

```json
{
  "phone": "+380671370000",
  "audience": "CLIENT",
  "code": "669170",
  "sent_at": "2026-10-31T00:21:25.952099413Z",
  "channel": "VOICE"
}
```

## A second call in the hour is made, the third is refused

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671370000",
  "device_ref": "sandbox-29433",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "0bf4a370-032a-45e0-905e-4aed127d5247",
  "expires_at": "2026-10-31T00:26:27.408575385Z",
  "resend_available_at": "2026-10-31T00:21:28.408575385Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380671370000` → **200**

```json
{
  "phone": "+380671370000",
  "audience": "CLIENT",
  "code": "230155",
  "sent_at": "2026-10-31T00:21:27.410683764Z",
  "channel": "VOICE"
}
```

`POST /auth/v1/otp/challenges` → **429**

```json
{
  "audience": "CLIENT",
  "phone": "+380671370000",
  "device_ref": "sandbox-8664",
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
  "correlation_id": "519e20c7-37f1-4587-bcca-746f556d0113",
  "retryable": true,
  "retry_after_seconds": 3600
}
```

## Numbers outside Poland and Ukraine get nothing

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+442000019685"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "eebbdd3b-4056-4d40-9968-83edec28221a"
}
```

`GET /sandbox/v1/otp?phone=%2B442000019685` → **404**

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+37120031472"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "3afe644b-c1c8-493f-bc0c-392ad933eb84"
}
```

`GET /sandbox/v1/otp?phone=%2B37120031472` → **404**

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
  "session_id": "ffd0e607-7506-46b5-b43d-443801810c13",
  "subject": {
    "type": "STAFF",
    "id": "2a3afaa3-e140-4771-8de7-2ab6b356cb06"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYTNhZmFhMy1lMTQwLTQ3NzEtOGRlNy0yYWI2YjM1NmNiMDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDY5ODksImlhdCI6MTc5MzQwNjA4OSwianRpIjoiMzBjYjQyY2QtNzFhNy00OGEwLWJkMjAtMTYyMjk1YzBjYWE2Iiwic2lkIjoiZmZkMGU2MDctNzUwNi00NmI1LWI0M2QtNDQzODAxODEwYzEzIn0._ER2qH8GwDcTnXAwBJ3kgfEqEpouR8MFE3Jg-WqGIbc",
  "access_expires_at": "2026-10-31T00:36:29.764430495Z",
  "refresh_token": "B8-UcE8TGz7QHrbXjF9qhArIV8PJO00W_R-nFpC2flw",
  "refresh_expires_at": "2026-10-31T12:21:29.764033517Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380671370000` → **200**

```json
{
  "deliveries": [
    {
      "id": "1f81a87d-f3af-45b1-88f2-30e3b479951b",
      "challenge_id": "0bf4a370-032a-45e0-905e-4aed127d5247",
      "phone": "+380671370000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-1ee663f1-67c7-4c90-ac20-29682aa6099c",
      "error": null,
      "attempted_at": "2026-10-31T00:21:27.410948Z"
    },
    {
      "id": "c30c574a-a708-417f-95f2-7158df38a4ec",
      "challenge_id": "3b053f46-9adb-4e93-9aae-62fd86f333dd",
      "phone": "+380671370000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-07382f1f-ddaf-4774-86fa-6719acf474e1",
      "error": null,
      "attempted_at": "2026-10-31T00:21:25.952529Z"
    },
    {
      "id": "0feb848b-723a-400d-9992-131cd2b366c8",
      "challenge_id": "ca32763d-58d0-49c6-af7b-c69b5795b1d5",
      "phone": "+380671370000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-31T00:21:24.522774Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380671370000` → **200**

```json
{
  "phone": "+380671370000",
  "audience": "CLIENT",
  "code": "230155",
  "sent_at": "2026-10-31T00:21:27.410683764Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380678170464` → **200**

```json
{
  "deliveries": [
    {
      "id": "dc3c2380-8068-4f4d-ab11-5d1d27c5c7a4",
      "challenge_id": "b9e66a8b-46c8-43b5-80fe-9e5f06c764e6",
      "phone": "+380678170464",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-6bbe7497-8757-411b-b19e-d7b7b916b14b",
      "error": null,
      "attempted_at": "2026-10-31T00:21:23.077387Z"
    },
    {
      "id": "3dec33e5-fba9-4ee8-ba90-04e30a3e3bcb",
      "challenge_id": "9c7fa06a-f42f-4e89-8cfb-7358cec6a3ac",
      "phone": "+380678170464",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-33bf9b2c-cb9a-42ad-944c-71e756dbc5e2",
      "error": null,
      "attempted_at": "2026-10-31T00:21:21.633203Z"
    }
  ]
}
```

Done: SMS to +380674981019; SMS then a call to +380678170464; a failed SMS, two calls and a refused third to +380671370000; +44 and +371 refused.

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
  "session_id": "212100bc-73ae-4195-b512-93232d7152b7",
  "subject": {
    "type": "STAFF",
    "id": "2a3afaa3-e140-4771-8de7-2ab6b356cb06"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYTNhZmFhMy1lMTQwLTQ3NzEtOGRlNy0yYWI2YjM1NmNiMDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDY5OTAsImlhdCI6MTc5MzQwNjA5MCwianRpIjoiN2Y1MmI5NzktNmE3My00ZTJlLTg0MTYtOWQyNDBiOWZhYjZkIiwic2lkIjoiMjEyMTAwYmMtNzNhZS00MTk1LWI1MTItOTMyMzJkNzE1MmI3In0.cS9wxdFwbhzoz1NrHHGwMCOGB2djeU01GVg9PDMMjz0",
  "access_expires_at": "2026-10-31T00:36:30.67463575Z",
  "refresh_token": "u33mc5uU-GIYqj8sQ3RUQtRq_Zv14y7rVCqpFezhWHs",
  "refresh_expires_at": "2026-10-31T12:21:30.674143541Z",
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
  "session_id": "c7a2b758-081c-48cd-adbe-b4f7f13040a5",
  "subject": {
    "type": "STAFF",
    "id": "2a3afaa3-e140-4771-8de7-2ab6b356cb06"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYTNhZmFhMy1lMTQwLTQ3NzEtOGRlNy0yYWI2YjM1NmNiMDYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDY5OTEsImlhdCI6MTc5MzQwNjA5MSwianRpIjoiYTllOTczZDMtZTM2Yy00NTk2LThjZGQtYzFmNWEzNjRhODc4Iiwic2lkIjoiYzdhMmI3NTgtMDgxYy00OGNkLWFkYmUtYjRmN2YxMzA0MGE1In0.f9wf-xSY5RkbEeqk_yPMgNWqONu0TKXh5KMS4GCtFJQ",
  "access_expires_at": "2026-10-31T00:36:31.092705055Z",
  "refresh_token": "yfJs_6yQJ4Zl1HehjNTkzuwHRJLqDxUohHlc3gLSmzg",
  "refresh_expires_at": "2026-10-31T12:21:31.092323701Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "2a3afaa3-e140-4771-8de7-2ab6b356cb06",
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
    "orders.offer",
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

`POST /api/admin/v1/staff-extensions/2a3afaa3-e140-4771-8de7-2ab6b356cb06` → **200**

```json
{
  "command_id": "57cbf495-3662-4061-b7bd-bad623df02a7",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "2a3afaa3-e140-4771-8de7-2ab6b356cb06",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "68a4871d-1e6d-4a31-ad3d-9762831ae02f",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-31T00:21:31.965452Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-31T00:21:31.965452Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "f134f98a-dba0-4922-b08c-ea7f9dd5649a",
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
  "id": "639f4436-4357-4349-931d-3a6e8ea404af",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T00:26:32.394641Z",
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
  "command_id": "aabe1ddf-9439-4a3f-87de-c9bb0d315ec8",
  "quote_id": "639f4436-4357-4349-931d-3a6e8ea404af",
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
    "phone": "+380674177608"
  }
}
```

```json
{
  "id": "9e9a843b-8d8b-4baf-8644-7bfbc0fb36f9",
  "short_number": 34,
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
  "created_at": "2026-10-31T00:21:32.621165Z",
  "caller": {
    "name": "Caller",
    "phone": "+380674177608"
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

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/9e9a843b-8d8b-4baf-8644-7bfbc0fb36f9/calls` → **201**

```json
{
  "command_id": "61b20db1-40a3-4f3b-96c1-9f1beb6975ed",
  "to": "CALLER"
}
```

```json
{
  "id": "4f98fd12-36d9-45da-8df6-b9321d9bdbe4",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "2a3afaa3-e140-4771-8de7-2ab6b356cb06",
  "order_ids": [
    "9e9a843b-8d8b-4baf-8644-7bfbc0fb36f9"
  ],
  "started_at": "2026-10-31T00:21:32.867105Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/9e9a843b-8d8b-4baf-8644-7bfbc0fb36f9/calls` → **201**

```json
{
  "command_id": "61b20db1-40a3-4f3b-96c1-9f1beb6975ed",
  "to": "CALLER"
}
```

```json
{
  "id": "4f98fd12-36d9-45da-8df6-b9321d9bdbe4",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "2a3afaa3-e140-4771-8de7-2ab6b356cb06",
  "order_ids": [
    "9e9a843b-8d8b-4baf-8644-7bfbc0fb36f9"
  ],
  "started_at": "2026-10-31T00:21:32.867105Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "4f98fd12-36d9-45da-8df6-b9321d9bdbe4",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380674177608",
    "at": "2026-10-31T00:21:32.869515356Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "4f98fd12-36d9-45da-8df6-b9321d9bdbe4",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.2151",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "4f98fd12-36d9-45da-8df6-b9321d9bdbe4"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "4f98fd12-36d9-45da-8df6-b9321d9bdbe4",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=9e9a843b-8d8b-4baf-8644-7bfbc0fb36f9` → **200**

```json
{
  "calls": [
    {
      "id": "4f98fd12-36d9-45da-8df6-b9321d9bdbe4",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "2a3afaa3-e140-4771-8de7-2ab6b356cb06",
      "order_ids": [
        "9e9a843b-8d8b-4baf-8644-7bfbc0fb36f9"
      ],
      "started_at": "2026-10-31T00:21:32.867105Z",
      "answered_at": "2026-10-31T00:21:33.418571Z",
      "ended_at": "2026-10-31T00:21:33.439499Z",
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

`GET /api/operator/v1/calls?order_id=9e9a843b-8d8b-4baf-8644-7bfbc0fb36f9` → **200**

```json
{
  "calls": [
    {
      "id": "4f98fd12-36d9-45da-8df6-b9321d9bdbe4",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "2a3afaa3-e140-4771-8de7-2ab6b356cb06",
      "order_ids": [
        "9e9a843b-8d8b-4baf-8644-7bfbc0fb36f9"
      ],
      "started_at": "2026-10-31T00:21:32.867105Z",
      "answered_at": "2026-10-31T00:21:33.418571Z",
      "ended_at": "2026-10-31T00:21:33.439499Z",
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

`GET /api/operator/v1/calls?order_id=9e9a843b-8d8b-4baf-8644-7bfbc0fb36f9` → **200**

```json
{
  "calls": [
    {
      "id": "4f98fd12-36d9-45da-8df6-b9321d9bdbe4",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "2a3afaa3-e140-4771-8de7-2ab6b356cb06",
      "order_ids": [
        "9e9a843b-8d8b-4baf-8644-7bfbc0fb36f9"
      ],
      "started_at": "2026-10-31T00:21:32.867105Z",
      "answered_at": "2026-10-31T00:21:33.418571Z",
      "ended_at": "2026-10-31T00:21:33.439499Z",
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

`GET /api/operator/v1/calls?order_id=9e9a843b-8d8b-4baf-8644-7bfbc0fb36f9` → **200**

```json
{
  "calls": [
    {
      "id": "4f98fd12-36d9-45da-8df6-b9321d9bdbe4",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "2a3afaa3-e140-4771-8de7-2ab6b356cb06",
      "order_ids": [
        "9e9a843b-8d8b-4baf-8644-7bfbc0fb36f9"
      ],
      "started_at": "2026-10-31T00:21:32.867105Z",
      "answered_at": "2026-10-31T00:21:33.418571Z",
      "ended_at": "2026-10-31T00:21:33.439499Z",
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

`GET /api/operator/v1/calls?order_id=9e9a843b-8d8b-4baf-8644-7bfbc0fb36f9` → **200**

```json
{
  "calls": [
    {
      "id": "4f98fd12-36d9-45da-8df6-b9321d9bdbe4",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "2a3afaa3-e140-4771-8de7-2ab6b356cb06",
      "order_ids": [
        "9e9a843b-8d8b-4baf-8644-7bfbc0fb36f9"
      ],
      "started_at": "2026-10-31T00:21:32.867105Z",
      "answered_at": "2026-10-31T00:21:33.418571Z",
      "ended_at": "2026-10-31T00:21:33.439499Z",
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

`GET /api/operator/v1/calls?order_id=9e9a843b-8d8b-4baf-8644-7bfbc0fb36f9` → **200**

```json
{
  "calls": [
    {
      "id": "4f98fd12-36d9-45da-8df6-b9321d9bdbe4",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "2a3afaa3-e140-4771-8de7-2ab6b356cb06",
      "order_ids": [
        "9e9a843b-8d8b-4baf-8644-7bfbc0fb36f9"
      ],
      "started_at": "2026-10-31T00:21:32.867105Z",
      "answered_at": "2026-10-31T00:21:33.418571Z",
      "ended_at": "2026-10-31T00:21:33.439499Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-31T00:21:42.52899Z"
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

`GET /api/operator/v1/orders/9e9a843b-8d8b-4baf-8644-7bfbc0fb36f9` → **200**

```json
{
  "id": "9e9a843b-8d8b-4baf-8644-7bfbc0fb36f9",
  "short_number": 34,
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
  "created_at": "2026-10-31T00:21:32.621165Z",
  "caller": {
    "name": "Caller",
    "phone": "+380674177608"
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

`POST /api/operator/v1/orders/9e9a843b-8d8b-4baf-8644-7bfbc0fb36f9/cancel` → **200**

```json
{
  "command_id": "38773b85-1bd9-4420-a26d-b808b94db483",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "9e9a843b-8d8b-4baf-8644-7bfbc0fb36f9",
  "short_number": 34,
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
  "created_at": "2026-10-31T00:21:32.621165Z",
  "caller": {
    "name": "Caller",
    "phone": "+380674177608"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "en": "No cars available",
      "ru": "Нет свободных машин",
      "pl": "Brak wolnych aut",
      "uk": "Немає вільних авто"
    }
  },
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

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "d3a2d46d-0cd8-4e00-acb6-de8ae6afbf4b",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-31T00:21:45.330127Z",
  "extension": "101"
}
```

Done: outgoing call 4f98fd12-36d9-45da-8df6-b9321d9bdbe4 from order 9e9a843b-8d8b-4baf-8644-7bfbc0fb36f9, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635090152",
  "device_ref": "sandbox-5769"
}
```

```json
{
  "challenge_id": "2a2bbd32-26ab-47b8-ae69-fc8406265e5d",
  "expires_at": "2026-10-31T00:26:45.554441236Z",
  "resend_available_at": "2026-10-31T00:21:46.554441236Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380635090152` → **200**

```json
{
  "phone": "+380635090152",
  "audience": "CLIENT",
  "code": "935659",
  "sent_at": "2026-10-31T00:21:45.556475829Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2a2bbd32-26ab-47b8-ae69-fc8406265e5d",
  "code": "935659",
  "device_ref": "sandbox-5769"
}
```

```json
{
  "session_id": "ac161b37-12e2-44d7-8309-7659f40500b0",
  "subject": {
    "type": "CLIENT",
    "id": "9518c28b-b240-49bc-add3-30caa7e749d6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NTE4YzI4Yi1iMjQwLTQ5YmMtYWRkMy0zMGNhYTdlNzQ5ZDYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDA3MDA1LCJpYXQiOjE3OTM0MDYxMDUsImp0aSI6ImFlNDcyNDkyLTBkZGQtNDI5OC1hNTk1LTA3YWE1NjEzY2RhMyIsInNpZCI6ImFjMTYxYjM3LTEyZTItNDRkNy04MzA5LTc2NTlmNDA1MDBiMCJ9.xWGp6_W0l9mNyDIevbmC_i_t_mIJO_kHf-686y4K2AA",
  "access_expires_at": "2026-10-31T00:36:45.792426239Z",
  "refresh_token": "zycqq3g2eFcgtGjkEf9VTTWd3knSU2KNFQjA_oMP-QU",
  "refresh_expires_at": "2026-11-30T00:21:45.792022182Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "9518c28b-b240-49bc-add3-30caa7e749d6",
  "session_id": "ac161b37-12e2-44d7-8309-7659f40500b0",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635090152",
  "device_ref": "sandbox-32566"
}
```

```json
{
  "challenge_id": "1d8cb766-98b0-4307-8961-7345b7996c48",
  "expires_at": "2026-10-31T00:26:48.223623797Z",
  "resend_available_at": "2026-10-31T00:21:49.223623797Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380635090152` → **200**

```json
{
  "phone": "+380635090152",
  "audience": "CLIENT",
  "code": "228494",
  "sent_at": "2026-10-31T00:21:48.225909184Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1d8cb766-98b0-4307-8961-7345b7996c48",
  "code": "228494",
  "device_ref": "sandbox-32566"
}
```

```json
{
  "session_id": "ccefe7ef-733c-40c9-9c7e-e6769f6fc87f",
  "subject": {
    "type": "CLIENT",
    "id": "9518c28b-b240-49bc-add3-30caa7e749d6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NTE4YzI4Yi1iMjQwLTQ5YmMtYWRkMy0zMGNhYTdlNzQ5ZDYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDA3MDA4LCJpYXQiOjE3OTM0MDYxMDgsImp0aSI6ImFiMjg5NThlLTk2MjUtNGQ4OC04MzZhLTc2MDJiYTgwNjhhNCIsInNpZCI6ImNjZWZlN2VmLTczM2MtNDBjOS05YzdlLWU2NzY5ZjZmYzg3ZiJ9.JlAoaWHn8HKLmoidatih3fxCyI1bg3JJsog1wughi6w",
  "access_expires_at": "2026-10-31T00:36:48.468212257Z",
  "refresh_token": "TioL9gri2MdbADXR2SlnN2J6N5tZDPN7R3-hlhr_R0s",
  "refresh_expires_at": "2026-11-30T00:21:48.467825024Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "7d25b00a-5444-4708-ba72-0cba3c1c1dfd",
  "expires_at": "2026-10-31T00:26:50.688901695Z",
  "resend_available_at": "2026-10-31T00:21:51.688901695Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635090152` → **200**

```json
{
  "phone": "+380635090152",
  "audience": "CLIENT",
  "code": "744373",
  "sent_at": "2026-10-31T00:21:50.690755073Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380637781973"
}
```

```json
{
  "challenge_id": "63e90ba4-ecfe-4d85-8676-09f0986a1d8e",
  "expires_at": "2026-10-31T00:26:50.92920931Z",
  "resend_available_at": "2026-10-31T00:21:51.92920931Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637781973` → **200**

```json
{
  "phone": "+380637781973",
  "audience": "CLIENT",
  "code": "799284",
  "sent_at": "2026-10-31T00:21:50.930874196Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "45b2bfc9-d973-4fce-a62f-b879ade829ba",
  "current_challenge_id": "7d25b00a-5444-4708-ba72-0cba3c1c1dfd",
  "current_code": "000000",
  "new_challenge_id": "63e90ba4-ecfe-4d85-8676-09f0986a1d8e",
  "new_code": "799284"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "8ce82374-f00a-4997-b81d-2dea7810753b"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "90ccfc01-e88d-4a72-b325-cb79714bc709",
  "current_challenge_id": "7d25b00a-5444-4708-ba72-0cba3c1c1dfd",
  "current_code": "744373",
  "new_challenge_id": "63e90ba4-ecfe-4d85-8676-09f0986a1d8e",
  "new_code": "799284"
}
```

```json
{
  "subject_id": "9518c28b-b240-49bc-add3-30caa7e749d6",
  "phone": "+380637781973",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "9518c28b-b240-49bc-add3-30caa7e749d6",
  "session_id": "ac161b37-12e2-44d7-8309-7659f40500b0",
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
  "correlation_id": "bfc879a9-4525-4251-8674-80c8416ed55f"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637781973",
  "device_ref": "sandbox-6281"
}
```

```json
{
  "challenge_id": "80797458-16c1-4e78-890a-c7922f2c309b",
  "expires_at": "2026-10-31T00:26:54.023660242Z",
  "resend_available_at": "2026-10-31T00:21:55.023660242Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637781973` → **200**

```json
{
  "phone": "+380637781973",
  "audience": "CLIENT",
  "code": "766679",
  "sent_at": "2026-10-31T00:21:54.025882769Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "80797458-16c1-4e78-890a-c7922f2c309b",
  "code": "766679",
  "device_ref": "sandbox-6281"
}
```

```json
{
  "session_id": "99c0b32f-19a4-40c3-8bd4-20ccb04a83f9",
  "subject": {
    "type": "CLIENT",
    "id": "9518c28b-b240-49bc-add3-30caa7e749d6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NTE4YzI4Yi1iMjQwLTQ5YmMtYWRkMy0zMGNhYTdlNzQ5ZDYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDA3MDE0LCJpYXQiOjE3OTM0MDYxMTQsImp0aSI6IjA0NTRiYTdmLWU3ZGQtNGQ5MS1hZDZiLWFmYjQ3ZGIyMTc2MiIsInNpZCI6Ijk5YzBiMzJmLTE5YTQtNDBjMy04YmQ0LTIwY2NiMDRhODNmOSJ9.NaqTLyxAOJE8ezJ1fqWxqiOHUvyCH0hUpcBP_dkTSDY",
  "access_expires_at": "2026-10-31T00:36:54.261882754Z",
  "refresh_token": "5KRr6VkgB_Q2EOoyEeqQJbrNkeo6RcZLQxtjVpgfDrE",
  "refresh_expires_at": "2026-11-30T00:21:54.261431424Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "9518c28b-b240-49bc-add3-30caa7e749d6",
  "session_id": "99c0b32f-19a4-40c3-8bd4-20ccb04a83f9",
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
  "session_id": "1d40efc4-c805-4753-8760-f07227fa28c4",
  "subject": {
    "type": "STAFF",
    "id": "2a3afaa3-e140-4771-8de7-2ab6b356cb06"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYTNhZmFhMy1lMTQwLTQ3NzEtOGRlNy0yYWI2YjM1NmNiMDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDcwMTQsImlhdCI6MTc5MzQwNjExNCwianRpIjoiNzM0YTRmMzAtMmMyOC00OTg3LWI1MDQtNWFjZTc3ZTE3NzNkIiwic2lkIjoiMWQ0MGVmYzQtYzgwNS00NzUzLTg3NjAtZjA3MjI3ZmEyOGM0In0.GZFaUUkqx5uQorGA9ZzTBFv6N_FtbVbFmmt5b7VlywA",
  "access_expires_at": "2026-10-31T00:36:54.884264502Z",
  "refresh_token": "LI_CqXj9n4R3oggyiT8OGWjNAIPgxpXtOqS5DR42Obg",
  "refresh_expires_at": "2026-10-31T12:21:54.883797168Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/9518c28b-b240-49bc-add3-30caa7e749d6` → **200**

```json
{
  "client": {
    "id": "9518c28b-b240-49bc-add3-30caa7e749d6",
    "phone": "+380637781973",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-31T00:21:45.790629Z",
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

`POST /api/admin/v1/clients/9518c28b-b240-49bc-add3-30caa7e749d6/phone/new-code` → **201**

```json
{
  "phone": "+380635352263"
}
```

```json
{
  "challenge_id": "f3e06a7c-0f14-4884-825b-6ff188fd5dad",
  "expires_at": "2026-10-31T00:26:55.351445014Z",
  "resend_available_at": "2026-10-31T00:21:56.351445014Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635352263` → **200**

```json
{
  "phone": "+380635352263",
  "audience": "CLIENT",
  "code": "383216",
  "sent_at": "2026-10-31T00:21:55.35299868Z",
  "channel": "SMS"
}
```

## Without the right code nothing changes; with it, support sets the phone

`POST /api/admin/v1/clients/9518c28b-b240-49bc-add3-30caa7e749d6/phone` → **422**

```json
{
  "command_id": "fb21ce59-1875-48a4-b642-7c624c64a8ad",
  "expected_version": 3,
  "new_challenge_id": "f3e06a7c-0f14-4884-825b-6ff188fd5dad",
  "new_code": "383217",
  "reason": "Passport checked at the office"
}
```

```json
{
  "instance": "/api/admin/v1/clients/9518c28b-b240-49bc-add3-30caa7e749d6/phone",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "6a778429-e9ca-45a4-bd5b-84fc2af7b766"
}
```

`POST /api/admin/v1/clients/9518c28b-b240-49bc-add3-30caa7e749d6/phone` → **400**

```json
{
  "command_id": "27bc0c9b-b0a5-4c31-8998-601d2ef1c141",
  "expected_version": 3,
  "new_challenge_id": "f3e06a7c-0f14-4884-825b-6ff188fd5dad",
  "new_code": "383216",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/9518c28b-b240-49bc-add3-30caa7e749d6/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "137c74d4-6e78-49bd-bbaa-79331afc3843",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/clients/9518c28b-b240-49bc-add3-30caa7e749d6/phone` → **200**

```json
{
  "command_id": "4695fbf7-e899-4b51-bf4f-a6a61402571b",
  "expected_version": 3,
  "new_challenge_id": "f3e06a7c-0f14-4884-825b-6ff188fd5dad",
  "new_code": "383216",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "9518c28b-b240-49bc-add3-30caa7e749d6",
  "phone": "+380635352263",
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
  "correlation_id": "bb8be450-3e2a-478a-98a4-d85d7a79ca82"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635352263",
  "device_ref": "sandbox-31990"
}
```

```json
{
  "challenge_id": "09a86f76-cad1-44bf-a291-adfb6c6e4976",
  "expires_at": "2026-10-31T00:26:56.448478135Z",
  "resend_available_at": "2026-10-31T00:21:57.448478135Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380635352263` → **200**

```json
{
  "phone": "+380635352263",
  "audience": "CLIENT",
  "code": "653258",
  "sent_at": "2026-10-31T00:21:56.450458347Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "09a86f76-cad1-44bf-a291-adfb6c6e4976",
  "code": "653258",
  "device_ref": "sandbox-31990"
}
```

```json
{
  "session_id": "547a3d51-19dd-4a0a-baae-e60709798a07",
  "subject": {
    "type": "CLIENT",
    "id": "9518c28b-b240-49bc-add3-30caa7e749d6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NTE4YzI4Yi1iMjQwLTQ5YmMtYWRkMy0zMGNhYTdlNzQ5ZDYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDA3MDE2LCJpYXQiOjE3OTM0MDYxMTYsImp0aSI6IjQ3Y2E5MWIxLWUyODktNGEzOS05NDM4LTRkZTBmZTg3YTA3NyIsInNpZCI6IjU0N2EzZDUxLTE5ZGQtNGEwYS1iYWFlLWU2MDcwOTc5OGEwNyJ9.qStkXo5GNoA1PGn_SodY0b3UgB9Fm64ps2EpcPDpma8",
  "access_expires_at": "2026-10-31T00:36:56.686696318Z",
  "refresh_token": "lpncWSapUY32l4q9tVo3d2w6EGA2SubL-87eGj94zjI",
  "refresh_expires_at": "2026-11-30T00:21:56.68629291Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "9518c28b-b240-49bc-add3-30caa7e749d6",
  "session_id": "547a3d51-19dd-4a0a-baae-e60709798a07",
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
  "phone": "+380631323159",
  "device_ref": "sandbox-3767"
}
```

```json
{
  "challenge_id": "6319a725-bafb-4feb-abba-bf6b78f2a178",
  "expires_at": "2026-10-31T00:26:57.207730544Z",
  "resend_available_at": "2026-10-31T00:21:58.207730544Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631323159` → **200**

```json
{
  "phone": "+380631323159",
  "audience": "CLIENT",
  "code": "473887",
  "sent_at": "2026-10-31T00:21:57.20958152Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6319a725-bafb-4feb-abba-bf6b78f2a178",
  "code": "473887",
  "device_ref": "sandbox-3767"
}
```

```json
{
  "session_id": "8e5bab25-b353-4491-b00f-8573efe18cce",
  "subject": {
    "type": "CLIENT",
    "id": "e474cb91-944f-4409-ba71-b2c2069ec9c2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNDc0Y2I5MS05NDRmLTQ0MDktYmE3MS1iMmMyMDY5ZWM5YzIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDA3MDE3LCJpYXQiOjE3OTM0MDYxMTcsImp0aSI6IjVkZDdjZTA1LTM1NTgtNGJkMi1iMzE5LTJlYjgxYTI1MjI5ZCIsInNpZCI6IjhlNWJhYjI1LWIzNTMtNDQ5MS1iMDBmLTg1NzNlZmUxOGNjZSJ9.dxaH2NWQTjfOiiIvtELNbQSWU9P4lojpqtpEfUcXvh8",
  "access_expires_at": "2026-10-31T00:36:57.44004816Z",
  "refresh_token": "ISoRoLPimLGKwb2xeH4PyjvPc-7KnVUiRiVZ1kSdM4c",
  "refresh_expires_at": "2026-11-30T00:21:57.439675914Z",
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
  "session_id": "6c3b831e-2794-49c6-9c6e-6e9393d15144",
  "subject": {
    "type": "STAFF",
    "id": "2a3afaa3-e140-4771-8de7-2ab6b356cb06"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYTNhZmFhMy1lMTQwLTQ3NzEtOGRlNy0yYWI2YjM1NmNiMDYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDcwMTgsImlhdCI6MTc5MzQwNjExOCwianRpIjoiMGQ0NDY0ZmMtZjRkYS00NGUyLWI0MWYtODNjNjA5MWZkNWE4Iiwic2lkIjoiNmMzYjgzMWUtMjc5NC00OWM2LTljNmUtNmU5MzkzZDE1MTQ0In0.oWBYe6hUu4VDpuwxiwMC4VwDGSYicdTanEWkOPTiKfg",
  "access_expires_at": "2026-10-31T00:36:58.30257027Z",
  "refresh_token": "ciK8KGQbqW3qauyvHS5kAGdX34GI2N4zPvDpMzCuy0M",
  "refresh_expires_at": "2026-10-31T12:21:58.302192802Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380631323159` → **200**

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
  "correlation_id": "7cba47e5-cc83-4d9a-ab97-3ba3bcde5351"
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
  "session_id": "afe34475-8803-48dd-8cd4-42311cd1d438",
  "subject": {
    "type": "STAFF",
    "id": "2a3afaa3-e140-4771-8de7-2ab6b356cb06"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYTNhZmFhMy1lMTQwLTQ3NzEtOGRlNy0yYWI2YjM1NmNiMDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDcwMTksImlhdCI6MTc5MzQwNjExOSwianRpIjoiMjM5YTRjM2MtYmNjOS00NTRiLTkyZDEtMzA2NTFjNjU2NWJhIiwic2lkIjoiYWZlMzQ0NzUtODgwMy00OGRkLThjZDQtNDIzMTFjZDFkNDM4In0.JQZv7IFFFimNL2DzrvQjY0ec5rf_LDWIj9DrWaEmvvo",
  "access_expires_at": "2026-10-31T00:36:59.148448047Z",
  "refresh_token": "9GoS_DOfIDOg-pEkA05Cni4E7gHUGZTx7BmGaOhfzbo",
  "refresh_expires_at": "2026-10-31T12:21:59.148000253Z",
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
  "changed_by": "2a3afaa3-e140-4771-8de7-2ab6b356cb06",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-31T00:04:46.560097Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "3c02724e-0f6e-4a35-94a5-997645579426",
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
  "changed_by": "2a3afaa3-e140-4771-8de7-2ab6b356cb06",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-31T00:21:59.586035264Z"
}
```

## The rider books the airport for 2026-10-31T03:21:58Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600580391",
  "device_ref": "sandbox-18600"
}
```

```json
{
  "challenge_id": "4952e3fc-63dc-4a85-98db-24cffcc6f020",
  "expires_at": "2026-10-31T00:26:59.814520055Z",
  "resend_available_at": "2026-10-31T00:22:00.814520055Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600580391` → **200**

```json
{
  "phone": "+48600580391",
  "audience": "CLIENT",
  "code": "153163",
  "sent_at": "2026-10-31T00:21:59.816995011Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4952e3fc-63dc-4a85-98db-24cffcc6f020",
  "code": "153163",
  "device_ref": "sandbox-18600"
}
```

```json
{
  "session_id": "0ee2b1b9-6a2f-4da4-93ae-a3781313666e",
  "subject": {
    "type": "CLIENT",
    "id": "5e96ddf6-3aa0-4dd6-96f3-596cf0bd0978"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZTk2ZGRmNi0zYWEwLTRkZDYtOTZmMy01OTZjZjBiZDA5NzgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDA3MDIwLCJpYXQiOjE3OTM0MDYxMjAsImp0aSI6IjdiM2Q0NjM3LWEwYzEtNDgzYS1hNWQ4LTY2ZTFhODcxNjc1ZCIsInNpZCI6IjBlZTJiMWI5LTZhMmYtNGRhNC05M2FlLWEzNzgxMzEzNjY2ZSJ9.jsVXKQxOhodrkzNhKr_JkcfftbFtfZRZl5rbTlRQYDs",
  "access_expires_at": "2026-10-31T00:37:00.096885757Z",
  "refresh_token": "dOOvrIviJx6idZ-tyLoslRtP5RiL9iOz12ZIpPY0r4k",
  "refresh_expires_at": "2026-11-30T00:22:00.096488198Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "83593579-d7c3-4440-9d1b-35c008271923",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-31T03:21:58Z"
}
```

```json
{
  "id": "fb7cf88c-12d9-44a1-bba0-29c9c879a7eb",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T00:27:00.303876Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-31T03:21:58Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "268186b0-03dd-45fb-88a4-24b25a43fd3f",
  "quote_id": "fb7cf88c-12d9-44a1-bba0-29c9c879a7eb",
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
  "pickup_at": "2026-10-31T03:21:58Z"
}
```

```json
{
  "id": "9829a8d2-744e-42e4-98db-8aacfbc23b64",
  "short_number": 35,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "5e96ddf6-3aa0-4dd6-96f3-596cf0bd0978",
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
  "created_at": "2026-10-31T00:22:00.521256Z",
  "cancellation": null,
  "pickup_at": "2026-10-31T03:21:58Z",
  "preorder": true,
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

## A driver in Warsaw sees it and reserves it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000001",
  "device_ref": "sandbox-30614"
}
```

```json
{
  "challenge_id": "2a57de68-168b-442c-9a67-da7b202f57ee",
  "expires_at": "2026-10-31T00:27:00.74775264Z",
  "resend_available_at": "2026-10-31T00:22:01.74775264Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "632974",
  "sent_at": "2026-10-31T00:22:00.750051305Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2a57de68-168b-442c-9a67-da7b202f57ee",
  "code": "632974",
  "device_ref": "sandbox-30614"
}
```

```json
{
  "session_id": "0487b079-203c-48fc-bf8a-b10c8c7f7850",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwNzAyMCwiaWF0IjoxNzkzNDA2MTIwLCJqdGkiOiIyNTYwN2E4Mi1hYmU4LTQ1NDItYmUwYS05MTJhZmQzMzE5MzUiLCJzaWQiOiIwNDg3YjA3OS0yMDNjLTQ4ZmMtYmY4YS1iMTBjOGM3Zjc4NTAifQ.Xo-BvzYxXsS4w2oQ0k3G8J_Td2mN-h9oDdSRuyz9PeA",
  "access_expires_at": "2026-10-31T00:37:00.977673172Z",
  "refresh_token": "oGKNVgGsHo5S4ItYhcSmz1_l_KLCKrO2d05F58pZtCM",
  "refresh_expires_at": "2026-11-30T00:22:00.977300481Z",
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
  "command_id": "117fa2e0-4709-42b8-a90f-2ecfd95a3a41",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T00:22:01Z",
    "sequence": 1793406121399
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "8d300643-2be2-4aaf-a72f-faca21ac6d18",
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
  "last_heartbeat_at": "2026-10-31T00:22:01.415448Z",
  "last_location_at": "2026-10-31T00:22:01.415448Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "9829a8d2-744e-42e4-98db-8aacfbc23b64",
      "short_number": 35,
      "pickup_at": "2026-10-31T03:21:58Z",
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

`POST /api/driver/v1/preorders/9829a8d2-744e-42e4-98db-8aacfbc23b64/reserve` → **200**

```json
{
  "command_id": "bd1136eb-4b22-442a-9d17-5565c8c573af"
}
```

```json
{
  "id": "3ee1c11e-f6be-4ac4-bd2f-1776ea7bcba6",
  "state": "RESERVED",
  "order": {
    "order_id": "9829a8d2-744e-42e4-98db-8aacfbc23b64",
    "short_number": 35,
    "pickup_at": "2026-10-31T03:21:58Z",
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
  "reserved_at": "2026-10-31T00:22:01.837871Z",
  "confirm_from": "2026-10-31T02:51:58Z",
  "confirm_until": "2026-10-31T03:01:58Z",
  "drop_until": "2026-10-31T02:21:58Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "3ee1c11e-f6be-4ac4-bd2f-1776ea7bcba6",
      "state": "RESERVED",
      "order": {
        "order_id": "9829a8d2-744e-42e4-98db-8aacfbc23b64",
        "short_number": 35,
        "pickup_at": "2026-10-31T03:21:58Z",
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
      "reserved_at": "2026-10-31T00:22:01.837871Z",
      "confirm_from": "2026-10-31T02:51:58Z",
      "confirm_until": "2026-10-31T03:01:58Z",
      "drop_until": "2026-10-31T02:21:58Z"
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
      "id": "3ee1c11e-f6be-4ac4-bd2f-1776ea7bcba6",
      "state": "RESERVED",
      "order": {
        "order_id": "9829a8d2-744e-42e4-98db-8aacfbc23b64",
        "short_number": 35,
        "pickup_at": "2026-10-31T03:21:58Z",
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
      "reserved_at": "2026-10-31T00:22:01.837871Z",
      "confirm_from": "2026-10-31T02:51:58Z",
      "confirm_until": "2026-10-31T03:01:58Z",
      "drop_until": "2026-10-31T02:21:58Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/3ee1c11e-f6be-4ac4-bd2f-1776ea7bcba6/confirm` → **409**

```json
{
  "command_id": "1834236b-f2f6-4cee-ac9f-c71556caba77"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/3ee1c11e-f6be-4ac4-bd2f-1776ea7bcba6/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "e05b111e-2598-4a0b-8957-80122ee0bf81"
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
  "session_id": "2fdcc5bc-a7cd-4fae-91ad-8624668a6e7b",
  "subject": {
    "type": "STAFF",
    "id": "2a3afaa3-e140-4771-8de7-2ab6b356cb06"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYTNhZmFhMy1lMTQwLTQ3NzEtOGRlNy0yYWI2YjM1NmNiMDYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDcwMjIsImlhdCI6MTc5MzQwNjEyMiwianRpIjoiNDFiODE1OTAtNjBhNC00NGM3LWI0OWQtNjgzZWQ5Yzg4ZTE2Iiwic2lkIjoiMmZkY2M1YmMtYTdjZC00ZmFlLTkxYWQtODYyNDY2OGE2ZTdiIn0.M5HDaDTf6gij0f0mf_0KwHr5vN2Ygs5VHbwVJFJWdHU",
  "access_expires_at": "2026-10-31T00:37:02.881191533Z",
  "refresh_token": "qn8kd6sPbLWs1bjZy_qfRk7xZ-N-XnRFp1FAswqmfSE",
  "refresh_expires_at": "2026-10-31T12:22:02.88079106Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/9829a8d2-744e-42e4-98db-8aacfbc23b64` → **200**

```json
{
  "id": "9829a8d2-744e-42e4-98db-8aacfbc23b64",
  "short_number": 35,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "5e96ddf6-3aa0-4dd6-96f3-596cf0bd0978",
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
  "created_at": "2026-10-31T00:22:00.521256Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-31T03:21:58Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "3ee1c11e-f6be-4ac4-bd2f-1776ea7bcba6",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-31T00:22:01.837871Z"
  },
  "related_order_id": null,
  "driver": null,
  "driver_change": null,
  "comment": null,
  "entrance": null
}
```

`GET /api/operator/v1/orders/9829a8d2-744e-42e4-98db-8aacfbc23b64/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-31T00:22:00.522125Z",
      "actor": {
        "type": "CLIENT",
        "id": "5e96ddf6-3aa0-4dd6-96f3-596cf0bd0978",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "9829a8d2-744e-42e4-98db-8aacfbc23b64",
        "preorder": true,
        "quote_id": "fb7cf88c-12d9-44a1-bba0-29c9c879a7eb",
        "pickup_at": "2026-10-31T03:21:58Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "87bc3d8f-1eb2-4545-ba66-feca8bf3ca14"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-31T00:22:01.838843Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "9829a8d2-744e-42e4-98db-8aacfbc23b64",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "3ee1c11e-f6be-4ac4-bd2f-1776ea7bcba6"
      },
      "correlation_id": "ba3c1436-e1c8-4de5-b925-c2e655890d89"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order 9829a8d2-744e-42e4-98db-8aacfbc23b64, reservation 3ee1c11e-f6be-4ac4-bd2f-1776ea7bcba6.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-2420"
}
```

```json
{
  "challenge_id": "50b70b86-f4ec-4c85-a5cb-ff570ef949bd",
  "expires_at": "2026-10-31T00:27:03.526135457Z",
  "resend_available_at": "2026-10-31T00:22:04.526135457Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "601285",
  "sent_at": "2026-10-31T00:22:03.528310949Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "50b70b86-f4ec-4c85-a5cb-ff570ef949bd",
  "code": "601285",
  "device_ref": "sandbox-2420"
}
```

```json
{
  "session_id": "2fc25ee8-a816-4abf-9983-9ea65532d6ed",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwNzAyMywiaWF0IjoxNzkzNDA2MTIzLCJqdGkiOiI4N2JiZTAwYi03ZWU4LTRjNmEtODc0Mi03ZjFjM2JmNzgwMTYiLCJzaWQiOiIyZmMyNWVlOC1hODE2LTRhYmYtOTk4My05ZWE2NTUzMmQ2ZWQifQ.5yj3vN0xytwSwR6ckLrZq1LhCsJTtZWqzL2fAFX11RQ",
  "access_expires_at": "2026-10-31T00:37:03.761917659Z",
  "refresh_token": "jMIkSjD94P0TVoKVSLgoi5VBHwcDcaRBGkSx1e3xi88",
  "refresh_expires_at": "2026-11-30T00:22:03.761482611Z",
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
  "command_id": "5490702c-ac24-4ce4-ae4b-3af0e512ace8",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T00:22:04Z",
    "sequence": 1793406124196
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a4033faa-b188-442a-8f11-e6f16681ca09",
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
  "last_heartbeat_at": "2026-10-31T00:22:04.211945Z",
  "last_location_at": "2026-10-31T00:22:04.211945Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674149860",
  "device_ref": "sandbox-1800"
}
```

```json
{
  "challenge_id": "bf284109-20a6-4830-8d72-c6020358328d",
  "expires_at": "2026-10-31T00:27:04.424139474Z",
  "resend_available_at": "2026-10-31T00:22:05.424139474Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380674149860` → **200**

```json
{
  "phone": "+380674149860",
  "audience": "CLIENT",
  "code": "262857",
  "sent_at": "2026-10-31T00:22:04.425991963Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bf284109-20a6-4830-8d72-c6020358328d",
  "code": "262857",
  "device_ref": "sandbox-1800"
}
```

```json
{
  "session_id": "c0eedd53-20a8-445d-a2fe-030c908fdffa",
  "subject": {
    "type": "CLIENT",
    "id": "aae1104b-18ab-4c2b-8c14-a53a6059231f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYWUxMTA0Yi0xOGFiLTRjMmItOGMxNC1hNTNhNjA1OTIzMWYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDA3MDI0LCJpYXQiOjE3OTM0MDYxMjQsImp0aSI6IjQ2MDI3YWUzLWQxNGUtNDE5Mi1hMWVmLTczMmNiNjVmODRiNCIsInNpZCI6ImMwZWVkZDUzLTIwYTgtNDQ1ZC1hMmZlLTAzMGM5MDhmZGZmYSJ9.mg4PM0K7J8b-u-cjQk3NP6ZCLmF1dS9YU_i31jmuKOg",
  "access_expires_at": "2026-10-31T00:37:04.656215714Z",
  "refresh_token": "NX2shU-FB-3hIZc3Le6EmJNHrc4CYdYRU4ZDWMn6xE8",
  "refresh_expires_at": "2026-11-30T00:22:04.65582771Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6f427ba2-78b4-4ede-a1d3-521a0962bca8",
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
  "id": "75126213-6341-49f4-b797-32d7b859c8fd",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T00:27:04.865659Z",
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
  "command_id": "60f331e4-dbf2-4aea-9691-3c86ee67a8af",
  "quote_id": "75126213-6341-49f4-b797-32d7b859c8fd",
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
  "id": "eb6232f8-b20a-4a80-8a6c-ed575102c3d2",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "aae1104b-18ab-4c2b-8c14-a53a6059231f",
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
  "created_at": "2026-10-31T00:22:05.090927Z",
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

## Driver accepts and completes the ride

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "02236982-341b-4623-ae9f-0ec8ec90034c",
    "order_id": "eb6232f8-b20a-4a80-8a6c-ed575102c3d2",
    "expires_at": "2026-10-31T00:22:20.093079Z",
    "server_time": "2026-10-31T00:22:05.341229485Z",
    "seconds_left": 14,
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
    "distance_m": 22,
    "price_kind": "FIXED",
    "expected_earnings_minor": 8939,
    "comment": null,
    "entrance": null
  }
]
```

`POST /api/driver/v1/offers/02236982-341b-4623-ae9f-0ec8ec90034c/accept` → **200**

```json
{
  "command_id": "b456c2c9-2340-4840-ae7c-3d58c88d926a"
}
```

```json
{
  "id": "2f922d9b-2eaf-4630-8a16-7093958b7c9b",
  "order_id": "eb6232f8-b20a-4a80-8a6c-ed575102c3d2",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "10a0068b-d428-4181-aebe-1c6acca8ff13",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "10a0068b-d428-4181-aebe-1c6acca8ff13",
  "order_id": "eb6232f8-b20a-4a80-8a6c-ed575102c3d2",
  "assignment_id": "2f922d9b-2eaf-4630-8a16-7093958b7c9b",
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
  "recipient": null,
  "comment": null,
  "entrance": null
}
```

`POST /api/driver/v1/work-sessions/a4033faa-b188-442a-8f11-e6f16681ca09/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T00:22:05Z",
    "sequence": 1793406125984
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a4033faa-b188-442a-8f11-e6f16681ca09",
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
  "last_heartbeat_at": "2026-10-31T00:22:06.000682Z",
  "last_location_at": "2026-10-31T00:22:06.000682Z",
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
  "id": "10a0068b-d428-4181-aebe-1c6acca8ff13",
  "order_id": "eb6232f8-b20a-4a80-8a6c-ed575102c3d2",
  "assignment_id": "2f922d9b-2eaf-4630-8a16-7093958b7c9b",
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
  "recipient": null,
  "comment": null,
  "entrance": null
}
```

`POST /api/driver/v1/trips/10a0068b-d428-4181-aebe-1c6acca8ff13/arrive` → **200**

```json
{
  "command_id": "776e9304-d347-4748-af85-712da80922a8",
  "expected_version": 0
}
```

```json
{
  "id": "10a0068b-d428-4181-aebe-1c6acca8ff13",
  "order_id": "eb6232f8-b20a-4a80-8a6c-ed575102c3d2",
  "assignment_id": "2f922d9b-2eaf-4630-8a16-7093958b7c9b",
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
  "arrived_at": "2026-10-31T00:22:06.423249Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null,
  "comment": null,
  "entrance": null
}
```

`POST /api/driver/v1/trips/10a0068b-d428-4181-aebe-1c6acca8ff13/start` → **200**

```json
{
  "command_id": "8fa089bf-ded9-493d-b9a3-9ff9b2756f3b",
  "expected_version": 1
}
```

```json
{
  "id": "10a0068b-d428-4181-aebe-1c6acca8ff13",
  "order_id": "eb6232f8-b20a-4a80-8a6c-ed575102c3d2",
  "assignment_id": "2f922d9b-2eaf-4630-8a16-7093958b7c9b",
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
  "arrived_at": "2026-10-31T00:22:06.423249Z",
  "started_at": "2026-10-31T00:22:06.638977Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null,
  "comment": null,
  "entrance": null
}
```

(the car drives 48 s to the next point)

`POST /api/driver/v1/work-sessions/a4033faa-b188-442a-8f11-e6f16681ca09/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T00:22:54Z",
    "sequence": 1793406174867
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a4033faa-b188-442a-8f11-e6f16681ca09",
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
  "last_heartbeat_at": "2026-10-31T00:22:54.8876Z",
  "last_location_at": "2026-10-31T00:22:54.8876Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/10a0068b-d428-4181-aebe-1c6acca8ff13/complete` → **200**

```json
{
  "command_id": "fd64ec67-d048-473d-a440-44fb8e61c4d5",
  "expected_version": 2,
  "reported_at": "2026-10-31T00:22:55Z",
  "cash_received": true
}
```

```json
{
  "id": "10a0068b-d428-4181-aebe-1c6acca8ff13",
  "order_id": "eb6232f8-b20a-4a80-8a6c-ed575102c3d2",
  "assignment_id": "2f922d9b-2eaf-4630-8a16-7093958b7c9b",
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
  "arrived_at": "2026-10-31T00:22:06.423249Z",
  "started_at": "2026-10-31T00:22:06.638977Z",
  "completed_at": "2026-10-31T00:22:55.096352Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null,
  "comment": null,
  "entrance": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/eb6232f8-b20a-4a80-8a6c-ed575102c3d2/rating` → **200**

```json
{
  "command_id": "046d1ad7-17b1-46ac-ac68-ddc70941a221",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "eb6232f8-b20a-4a80-8a6c-ed575102c3d2",
  "score": 5,
  "created_at": "2026-10-31T00:22:55.316631621Z"
}
```

`POST /api/driver/v1/orders/eb6232f8-b20a-4a80-8a6c-ed575102c3d2/rating` → **200**

```json
{
  "command_id": "828b6816-fe6c-4cb2-85bc-f71499521156",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "eb6232f8-b20a-4a80-8a6c-ed575102c3d2",
  "score": 4,
  "created_at": "2026-10-31T00:22:55.521782418Z"
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
  "session_id": "00e2076f-5506-4f6e-acdc-3b83374eb4f7",
  "subject": {
    "type": "STAFF",
    "id": "2a3afaa3-e140-4771-8de7-2ab6b356cb06"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYTNhZmFhMy1lMTQwLTQ3NzEtOGRlNy0yYWI2YjM1NmNiMDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDcwNzYsImlhdCI6MTc5MzQwNjE3NiwianRpIjoiNDhiZWU0YjUtOTNhZS00NDVhLThmZTgtNWE4ZjE3ZGU3Zjc3Iiwic2lkIjoiMDBlMjA3NmYtNTUwNi00ZjZlLWFjZGMtM2I4MzM3NGViNGY3In0.9jNBlUQ4i9SccRwJR61_-wD4mIfixr44Zj21VI-5d9Q",
  "access_expires_at": "2026-10-31T00:37:56.134329639Z",
  "refresh_token": "jWVN2wIrPhwweKfFzvIHkWnEvLoYulqAtnr-vSxjSh0",
  "refresh_expires_at": "2026-10-31T12:22:56.133909186Z",
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
  "session_id": "72842e8e-f9e3-4845-8050-95ac763ff958",
  "subject": {
    "type": "STAFF",
    "id": "2a3afaa3-e140-4771-8de7-2ab6b356cb06"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYTNhZmFhMy1lMTQwLTQ3NzEtOGRlNy0yYWI2YjM1NmNiMDYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDcwNzYsImlhdCI6MTc5MzQwNjE3NiwianRpIjoiMDA0ZDMyOTAtNDc2OS00MmI1LTg5NzktZDhmZjMxMTdjZWZkIiwic2lkIjoiNzI4NDJlOGUtZjllMy00ODQ1LTgwNTAtOTVhYzc2M2ZmOTU4In0.Mbu9OmsI0ReEC2YEs5gKll48tWidnqG9pzbPDEPSFsc",
  "access_expires_at": "2026-10-31T00:37:56.538903244Z",
  "refresh_token": "6nAESEMMfFDF0BnRs7NCCpswPjPCAloQAOpOJGxUxjg",
  "refresh_expires_at": "2026-10-31T12:22:56.53848853Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/eb6232f8-b20a-4a80-8a6c-ed575102c3d2/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "eb6232f8-b20a-4a80-8a6c-ed575102c3d2",
      "author_type": "RIDER",
      "author_id": "aae1104b-18ab-4c2b-8c14-a53a6059231f",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-31T00:22:55.316632Z"
    },
    {
      "order_id": "eb6232f8-b20a-4a80-8a6c-ed575102c3d2",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "aae1104b-18ab-4c2b-8c14-a53a6059231f",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-31T00:22:55.521782Z"
    }
  ]
}
```

Done: ratings for order eb6232f8-b20a-4a80-8a6c-ed575102c3d2.

# Scenario: reassignment-push

## Andrii (200 m) and Oleh (600 m) are online; a rider with the app orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-12427"
}
```

```json
{
  "challenge_id": "f943e197-0b2d-4520-b913-e40356413d70",
  "expires_at": "2026-10-31T00:27:56.94199718Z",
  "resend_available_at": "2026-10-31T00:22:57.94199718Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "610141",
  "sent_at": "2026-10-31T00:22:56.944706118Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f943e197-0b2d-4520-b913-e40356413d70",
  "code": "610141",
  "device_ref": "sandbox-12427"
}
```

```json
{
  "session_id": "2b4ee6da-338a-4947-8c0e-6bc4004d37d8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwNzA3NywiaWF0IjoxNzkzNDA2MTc3LCJqdGkiOiI2YTU5MDc0OC04ZTRmLTQ2NjQtYmFkOC1lYWFjNjg1NmE0MWMiLCJzaWQiOiIyYjRlZTZkYS0zMzhhLTQ5NDctOGMwZS02YmM0MDA0ZDM3ZDgifQ.VnsGsjTg-JaLsiPTkgZZnJV9II2kq4U8EUf8-UKXOKY",
  "access_expires_at": "2026-10-31T00:37:57.157713889Z",
  "refresh_token": "1PJbRTBZfrcHO6SysHOnC1mqOw1RSzmefEwy3Fq0bSE",
  "refresh_expires_at": "2026-11-30T00:22:57.15734886Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a4033faa-b188-442a-8f11-e6f16681ca09",
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
  "last_heartbeat_at": "2026-10-31T00:22:54.8876Z",
  "last_location_at": "2026-10-31T00:22:54.8876Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a4033faa-b188-442a-8f11-e6f16681ca09/handover` → **200**

```json
{
  "command_id": "d9194550-ff59-4a57-ad37-3cdcb849214b",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a4033faa-b188-442a-8f11-e6f16681ca09",
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
  "last_heartbeat_at": "2026-10-31T00:22:54.8876Z",
  "last_location_at": "2026-10-31T00:22:54.8876Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a4033faa-b188-442a-8f11-e6f16681ca09/close` → **200**

```json
{
  "command_id": "138a3156-8d1d-4985-a640-dcc1e0750f91",
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
  "session_id": "e69edf72-e45e-4fa1-a4b3-2e9640171702",
  "subject": {
    "type": "STAFF",
    "id": "2a3afaa3-e140-4771-8de7-2ab6b356cb06"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYTNhZmFhMy1lMTQwLTQ3NzEtOGRlNy0yYWI2YjM1NmNiMDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDcwNzgsImlhdCI6MTc5MzQwNjE3OCwianRpIjoiOTUyMTFmMWMtYTI5Zi00Njg0LWJmZGEtMzliZDM1MTY0MzQ0Iiwic2lkIjoiZTY5ZWRmNzItZTQ1ZS00ZmExLWE0YjMtMmU5NjQwMTcxNzAyIn0.Wyw3DEXWXxUPvrRaZoueONeJ83tYI1Ve9VuWMOYQe0s",
  "access_expires_at": "2026-10-31T00:37:58.206719911Z",
  "refresh_token": "Se-uY_Bt94lUCkJ9NyyLY5V74j3Ybjd2LCLpnmIKAGs",
  "refresh_expires_at": "2026-10-31T12:22:58.206322633Z",
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
  "session_id": "6238aa90-c313-4ce5-8a7c-057de6dcbd41",
  "subject": {
    "type": "STAFF",
    "id": "2a3afaa3-e140-4771-8de7-2ab6b356cb06"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYTNhZmFhMy1lMTQwLTQ3NzEtOGRlNy0yYWI2YjM1NmNiMDYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDcwNzgsImlhdCI6MTc5MzQwNjE3OCwianRpIjoiM2RmM2U3YWMtMDZhYy00YTg4LWFhMTUtMWNkNDZhZDNkM2YwIiwic2lkIjoiNjIzOGFhOTAtYzMxMy00Y2U1LThhN2MtMDU3ZGU2ZGNiZDQxIn0.5GFWVcuAjdcniqMdyzT0_c3Pdg1x7HOmiLLds5VaegE",
  "access_expires_at": "2026-10-31T00:37:58.615497878Z",
  "refresh_token": "a02whvwATbRzBgJIjzsgLNX0nix_e_0z_u7MWlvLdXk",
  "refresh_expires_at": "2026-10-31T12:22:58.615124105Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-16575"
}
```

```json
{
  "challenge_id": "fba13a3d-cb60-4a25-9bba-1f128aa58f0c",
  "expires_at": "2026-10-31T00:27:58.807076929Z",
  "resend_available_at": "2026-10-31T00:22:59.807076929Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "598434",
  "sent_at": "2026-10-31T00:22:58.809713628Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fba13a3d-cb60-4a25-9bba-1f128aa58f0c",
  "code": "598434",
  "device_ref": "sandbox-16575"
}
```

```json
{
  "session_id": "981dcde4-559f-4cc5-95a7-b25770169a9a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwNzA3OSwiaWF0IjoxNzkzNDA2MTc5LCJqdGkiOiI3YTE4MWQwNC0xZjM5LTQ0ZGQtYTllOS1lMGJjMmU3ZTQ2ODEiLCJzaWQiOiI5ODFkY2RlNC01NTlmLTRjYzUtOTVhNy1iMjU3NzAxNjlhOWEifQ.vEPRY0mJmWDXQgEnFM80E4xKR5UbTQ7yjAzdJEgkk6E",
  "access_expires_at": "2026-10-31T00:37:59.03113083Z",
  "refresh_token": "m3KidJk2cM6cBjTt4rYJPPbEANyKy14BAksLAPvWXTY",
  "refresh_expires_at": "2026-11-30T00:22:59.030716982Z",
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
  "command_id": "a2a21617-085c-4f9a-9e7d-327dcfcc4426",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T00:22:59Z",
    "sequence": 1793406179442
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "2f511162-d98d-4e94-8ac5-c3ab0f456362",
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
  "last_heartbeat_at": "2026-10-31T00:22:59.456773Z",
  "last_location_at": "2026-10-31T00:22:59.456773Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-27923"
}
```

```json
{
  "challenge_id": "8a19527c-97da-422c-a56a-5ef22103b189",
  "expires_at": "2026-10-31T00:27:59.657802522Z",
  "resend_available_at": "2026-10-31T00:23:00.657802522Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "082461",
  "sent_at": "2026-10-31T00:22:59.659818984Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8a19527c-97da-422c-a56a-5ef22103b189",
  "code": "082461",
  "device_ref": "sandbox-27923"
}
```

```json
{
  "session_id": "70718292-90c0-4dc4-b5ab-05418566fd21",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwNzA3OSwiaWF0IjoxNzkzNDA2MTc5LCJqdGkiOiIwYjkwYjczYy0wYmI1LTRjZTMtYWVjNC0zNjM5NmJkOGMyZTciLCJzaWQiOiI3MDcxODI5Mi05MGMwLTRkYzQtYjVhYi0wNTQxODU2NmZkMjEifQ.i3S3klq5GZ4a4TW7kSmgI_ETjlhIMzh7X10CaCkdiBg",
  "access_expires_at": "2026-10-31T00:37:59.885899767Z",
  "refresh_token": "VC5FHs7cWs2r4pooGtgIcVoXcGb47yKe1-6C7mIWh0c",
  "refresh_expires_at": "2026-11-30T00:22:59.885488207Z",
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
  "command_id": "fec6a411-1fb5-4244-8a5b-c0ce786252bd",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T00:23:00Z",
    "sequence": 1793406180306
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "6abe0549-7482-441b-9437-5c44874f6788",
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
  "last_heartbeat_at": "2026-10-31T00:23:00.321895Z",
  "last_location_at": "2026-10-31T00:23:00.321895Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380682885720",
  "device_ref": "sandbox-15065"
}
```

```json
{
  "challenge_id": "e9163a8d-0298-4fbf-8eb3-219eb340d5b9",
  "expires_at": "2026-10-31T00:28:00.521030126Z",
  "resend_available_at": "2026-10-31T00:23:01.521030126Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380682885720` → **200**

```json
{
  "phone": "+380682885720",
  "audience": "CLIENT",
  "code": "957436",
  "sent_at": "2026-10-31T00:23:00.522993352Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e9163a8d-0298-4fbf-8eb3-219eb340d5b9",
  "code": "957436",
  "device_ref": "sandbox-15065"
}
```

```json
{
  "session_id": "cd4ff54c-afac-4938-be76-8ce7c01e9e93",
  "subject": {
    "type": "CLIENT",
    "id": "a38926dc-864c-4e1c-b8f8-992a5fe2698b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMzg5MjZkYy04NjRjLTRlMWMtYjhmOC05OTJhNWZlMjY5OGIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDA3MDgwLCJpYXQiOjE3OTM0MDYxODAsImp0aSI6IjFmYmMwMjU2LTA1MjQtNDEyMS1iNzEwLTMzN2UzYzJlYjE0NyIsInNpZCI6ImNkNGZmNTRjLWFmYWMtNDkzOC1iZTc2LThjZTdjMDFlOWU5MyJ9.QfmPJ7s-Eg91_9oMCMlJAmwszkjXWA9qMh4UEEH2qfU",
  "access_expires_at": "2026-10-31T00:38:00.752763496Z",
  "refresh_token": "5fcDxZFMB3TZniMFDt6CQU5hRLVXzZb0B1liQHQDQtA",
  "refresh_expires_at": "2026-11-30T00:23:00.752362377Z",
  "account_created": true
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "ed9e3f93-24c6-47b3-a529-5cce552f0085",
  "platform": "ANDROID",
  "token": "sandbox-rider-6e06b126-734e-4279-854c-2ca5e4ee91ef"
}
```

```json
{
  "id": "0ed3d3a6-4787-4a4c-9e8c-fdc8d50422d2",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-31T00:23:00.953074Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "27cedba9-c3ed-49fc-881d-ce8f3f6d9abd",
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
  "id": "0cc7ef3b-faaf-49b8-87e1-683a0043a5ae",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T00:28:01.157075Z",
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
  "command_id": "e9d3eb60-f9ab-46c8-a86e-e25bbcb946f9",
  "quote_id": "0cc7ef3b-faaf-49b8-87e1-683a0043a5ae",
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
  "id": "a7add2fe-169e-4790-ad0a-25f06f9cf5d0",
  "short_number": 37,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a38926dc-864c-4e1c-b8f8-992a5fe2698b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T00:23:01.367729Z",
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

## Andrii accepts; at once the operator takes him off and Oleh takes the order

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "a1d45405-cff4-4f6d-a248-e219da62c076",
    "order_id": "a7add2fe-169e-4790-ad0a-25f06f9cf5d0",
    "expires_at": "2026-10-31T00:23:16.369755Z",
    "server_time": "2026-10-31T00:23:01.584993901Z",
    "seconds_left": 14,
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
    "distance_m": 200,
    "price_kind": "FIXED",
    "expected_earnings_minor": 8939,
    "comment": null,
    "entrance": null
  }
]
```

`POST /api/driver/v1/offers/a1d45405-cff4-4f6d-a248-e219da62c076/accept` → **200**

```json
{
  "command_id": "416d8e1f-4534-4f5f-8daf-47de2e0b59a0"
}
```

```json
{
  "id": "2944c0d4-dac8-446f-a286-c53c36c29654",
  "order_id": "a7add2fe-169e-4790-ad0a-25f06f9cf5d0",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "84955c20-f9d9-4a58-bfc4-b48b89339a81",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/operator/v1/orders/a7add2fe-169e-4790-ad0a-25f06f9cf5d0` → **200**

```json
{
  "id": "a7add2fe-169e-4790-ad0a-25f06f9cf5d0",
  "short_number": 37,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "a38926dc-864c-4e1c-b8f8-992a5fe2698b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "2944c0d4-dac8-446f-a286-c53c36c29654",
    "order_id": "a7add2fe-169e-4790-ad0a-25f06f9cf5d0",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "84955c20-f9d9-4a58-bfc4-b48b89339a81",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-31T00:23:01.367729Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null,
  "driver": {
    "name": "Андрій Шевчук",
    "make": "Hyundai",
    "model": "Sonata",
    "color": "black",
    "registration_number": "AA0003TX",
    "photo_url": null
  },
  "driver_change": null,
  "comment": null,
  "entrance": null
}
```

`POST /api/operator/v1/orders/a7add2fe-169e-4790-ad0a-25f06f9cf5d0/revoke-assignment` → **200**

```json
{
  "command_id": "4f920c09-7692-4c73-95d7-3d916757bd0c",
  "expected_version": 3,
  "reason": "Driver does not answer"
}
```

```json
{
  "id": "a7add2fe-169e-4790-ad0a-25f06f9cf5d0",
  "short_number": 37,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "a38926dc-864c-4e1c-b8f8-992a5fe2698b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T00:23:01.367729Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null,
  "driver": null,
  "driver_change": {
    "reason_code": "SERVICE_REASSIGNED",
    "at": "2026-10-31T00:23:02.214221Z"
  },
  "comment": null,
  "entrance": null
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "a468d919-7b15-4d27-ae7f-3af046414711",
    "order_id": "a7add2fe-169e-4790-ad0a-25f06f9cf5d0",
    "expires_at": "2026-10-31T00:23:17.216403Z",
    "server_time": "2026-10-31T00:23:02.456969576Z",
    "seconds_left": 14,
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
    "distance_m": 601,
    "price_kind": "FIXED",
    "expected_earnings_minor": 8939,
    "comment": null,
    "entrance": null
  }
]
```

`POST /api/driver/v1/offers/a468d919-7b15-4d27-ae7f-3af046414711/accept` → **200**

```json
{
  "command_id": "c3b64894-b9cf-4457-9999-75e6ebe638b7"
}
```

```json
{
  "id": "0c583455-0e1c-44b3-ab30-8829e955a3c7",
  "order_id": "a7add2fe-169e-4790-ad0a-25f06f9cf5d0",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a7c585ed-1f99-464b-9535-84421a6f87f8",
  "trip_phase": "TO_PICKUP"
}
```

## After the push delay: Andrii's "driver assigned" is SUPERSEDED, Oleh's is SENT

`GET /sandbox/v1/notifications?order_id=a7add2fe-169e-4790-ad0a-25f06f9cf5d0` → **200**

```json
[
  {
    "recipient_type": "DRIVER",
    "recipient_id": "5a000000-0000-4000-8000-000000000402",
    "channel": "PUSH",
    "template": "driver.offer",
    "state": "SUPERSEDED",
    "data": {
      "type": "driver.offer",
      "event_id": "4d86af5d-6746-41a2-92ec-065b02111fba",
      "offer_id": "a468d919-7b15-4d27-ae7f-3af046414711",
      "order_id": "a7add2fe-169e-4790-ad0a-25f06f9cf5d0",
      "event_type": "OfferMade",
      "order_version": "6"
    },
    "created_at": "2026-10-31T00:23:02.306855Z"
  },
  {
    "recipient_type": "CLIENT",
    "recipient_id": "a38926dc-864c-4e1c-b8f8-992a5fe2698b",
    "channel": "PUSH",
    "template": "rider.driver-assigned",
    "state": "SUPERSEDED",
    "data": {
      "type": "rider.driver-assigned",
      "event_id": "5e4954d8-ebe5-4f7c-9478-d41421fecdde",
      "order_id": "a7add2fe-169e-4790-ad0a-25f06f9cf5d0",
      "event_type": "AssignmentCommitted",
      "assignment_id": "2944c0d4-dac8-446f-a286-c53c36c29654",
      "order_version": "3"
    },
    "created_at": "2026-10-31T00:23:02.313741Z"
  },
  {
    "recipient_type": "DRIVER",
    "recipient_id": "5a000000-0000-4000-8000-000000000403",
    "channel": "PUSH",
    "template": "driver.offer",
    "state": "SUPERSEDED",
    "data": {
      "type": "driver.offer",
      "event_id": "19dbdd23-f83d-4643-87c8-5658aa8d45b0",
      "offer_id": "a1d45405-cff4-4f6d-a248-e219da62c076",
      "order_id": "a7add2fe-169e-4790-ad0a-25f06f9cf5d0",
      "event_type": "OfferMade",
      "order_version": "2"
    },
    "created_at": "2026-10-31T00:23:02.316595Z"
  },
  {
    "recipient_type": "CLIENT",
    "recipient_id": "a38926dc-864c-4e1c-b8f8-992a5fe2698b",
    "channel": "PUSH",
    "template": "rider.driver-assigned",
    "state": "SENT",
    "data": {
      "type": "rider.driver-assigned",
      "event_id": "3bcd44ad-6ae0-4388-a070-4820edee6a6c",
      "order_id": "a7add2fe-169e-4790-ad0a-25f06f9cf5d0",
      "event_type": "AssignmentCommitted",
      "assignment_id": "0c583455-0e1c-44b3-ab30-8829e955a3c7",
      "order_version": "7"
    },
    "created_at": "2026-10-31T00:23:03.322475Z"
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380682885720&after=2026-10-31T00:23:01.141Z` → **200**

```json
[
  {
    "at": "2026-10-31T00:23:07.081745938Z",
    "token_suffix": "ee91ef",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "event_type": "AssignmentCommitted",
      "type": "rider.driver-assigned",
      "assignment_id": "0c583455-0e1c-44b3-ab30-8829e955a3c7",
      "order_version": "7",
      "event_id": "3bcd44ad-6ae0-4388-a070-4820edee6a6c",
      "order_id": "a7add2fe-169e-4790-ad0a-25f06f9cf5d0"
    }
  }
]
```

## The rider's order shows Oleh's car and why the driver changed

`GET /api/rider/v1/orders/a7add2fe-169e-4790-ad0a-25f06f9cf5d0` → **200**

```json
{
  "id": "a7add2fe-169e-4790-ad0a-25f06f9cf5d0",
  "short_number": 37,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "a38926dc-864c-4e1c-b8f8-992a5fe2698b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "0c583455-0e1c-44b3-ab30-8829e955a3c7",
    "order_id": "a7add2fe-169e-4790-ad0a-25f06f9cf5d0",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "a7c585ed-1f99-464b-9535-84421a6f87f8",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-31T00:23:01.367729Z",
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
    "location_at": "2026-10-31T00:23:00.321895Z",
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
    "at": "2026-10-31T00:23:02.214221Z"
  },
  "comment": null,
  "entrance": null
}
```

Done: assignment 2944c0d4-dac8-446f-a286-c53c36c29654 of 5a000000-0000-4000-8000-000000000403 never announced (SUPERSEDED); the rider heard only about 0c583455-0e1c-44b3-ab30-8829e955a3c7.

`GET /api/operator/v1/orders/a7add2fe-169e-4790-ad0a-25f06f9cf5d0` → **200**

```json
{
  "id": "a7add2fe-169e-4790-ad0a-25f06f9cf5d0",
  "short_number": 37,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "a38926dc-864c-4e1c-b8f8-992a5fe2698b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "0c583455-0e1c-44b3-ab30-8829e955a3c7",
    "order_id": "a7add2fe-169e-4790-ad0a-25f06f9cf5d0",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "a7c585ed-1f99-464b-9535-84421a6f87f8",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-31T00:23:01.367729Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null,
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
    "at": "2026-10-31T00:23:02.214221Z"
  },
  "comment": null,
  "entrance": null
}
```

`POST /api/operator/v1/orders/a7add2fe-169e-4790-ad0a-25f06f9cf5d0/cancel` → **200**

```json
{
  "command_id": "90ca782e-f4f7-4095-b186-595805b34870",
  "expected_version": 7,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "a7add2fe-169e-4790-ad0a-25f06f9cf5d0",
  "short_number": 37,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 8,
  "channel": "APP",
  "payer_client_id": "a38926dc-864c-4e1c-b8f8-992a5fe2698b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "0c583455-0e1c-44b3-ab30-8829e955a3c7",
    "order_id": "a7add2fe-169e-4790-ad0a-25f06f9cf5d0",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "a7c585ed-1f99-464b-9535-84421a6f87f8",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-31T00:23:01.367729Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "en": "No cars available",
      "ru": "Нет свободных машин",
      "pl": "Brak wolnych aut",
      "uk": "Немає вільних авто"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null,
  "driver": null,
  "driver_change": {
    "reason_code": "SERVICE_REASSIGNED",
    "at": "2026-10-31T00:23:02.214221Z"
  },
  "comment": null,
  "entrance": null
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "2f511162-d98d-4e94-8ac5-c3ab0f456362",
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
  "last_heartbeat_at": "2026-10-31T00:22:59.456773Z",
  "last_location_at": "2026-10-31T00:22:59.456773Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2f511162-d98d-4e94-8ac5-c3ab0f456362/close` → **200**

```json
{
  "command_id": "70dd2534-ca01-4f47-8264-167bd139f6ac",
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
  "session_id": "6abe0549-7482-441b-9437-5c44874f6788",
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
  "last_heartbeat_at": "2026-10-31T00:23:00.321895Z",
  "last_location_at": "2026-10-31T00:23:00.321895Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6abe0549-7482-441b-9437-5c44874f6788/close` → **200**

```json
{
  "command_id": "47f3b010-3b1d-434a-960b-6f13929ebc5c",
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
  "session_id": "c9ee7b39-124f-4f9d-ba90-23d0b4563734",
  "subject": {
    "type": "STAFF",
    "id": "2a3afaa3-e140-4771-8de7-2ab6b356cb06"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYTNhZmFhMy1lMTQwLTQ3NzEtOGRlNy0yYWI2YjM1NmNiMDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDcwOTAsImlhdCI6MTc5MzQwNjE5MCwianRpIjoiMWQ0ZDNiYmEtNzdkYi00NzVjLWJiZGEtMTQ1OTI1MzNmMDc0Iiwic2lkIjoiYzllZTdiMzktMTI0Zi00ZjlkLWJhOTAtMjNkMGI0NTYzNzM0In0.DQl4AjKtYFUUxYsQ0NgByAD1Q0PqBbz6Sz_5_568X1U",
  "access_expires_at": "2026-10-31T00:38:10.757555111Z",
  "refresh_token": "NEzTn6bbA_4O5_6QbdO364Q0uNIqBAPI3bVBx_m7GN0",
  "refresh_expires_at": "2026-10-31T12:23:10.75712942Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "e5c0a83e-a5d7-4222-924d-a0fb9c009bd1",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-31"
}
```

```json
{
  "id": "1baeab1d-3021-4bfd-872e-c4e6eca05a50",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-31",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-31T00:23:10.973292Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/1baeab1d-3021-4bfd-872e-c4e6eca05a50` → **200**

```json
{
  "id": "1baeab1d-3021-4bfd-872e-c4e6eca05a50",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-31",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-31T00:23:10.973292Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/1baeab1d-3021-4bfd-872e-c4e6eca05a50` → **200**

```json
{
  "id": "1baeab1d-3021-4bfd-872e-c4e6eca05a50",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-31",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-31T00:23:10.973292Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/1baeab1d-3021-4bfd-872e-c4e6eca05a50` → **200**

```json
{
  "id": "1baeab1d-3021-4bfd-872e-c4e6eca05a50",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-31",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-31.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-31T00:23:10.973292Z",
  "ready_at": "2026-10-31T00:23:12.674689Z",
  "expires_at": "2026-11-01T00:23:12.674689Z"
}
```

`GET /api/admin/v1/reports/exports/1baeab1d-3021-4bfd-872e-c4e6eca05a50/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-31,35,12,23,0,0,30,5,0,32,2,0,1,7,1,15
total,35,12,23,0,0,30,5,0,32,2,0,1,7,1,15
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "997f6709-b987-4635-977c-00d61d5a2511",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-31"
}
```

```json
{
  "id": "dcd4020d-72f7-4491-9d42-7e163fe4ea9a",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-31",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-31T00:23:13.814493Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/dcd4020d-72f7-4491-9d42-7e163fe4ea9a` → **200**

```json
{
  "id": "dcd4020d-72f7-4491-9d42-7e163fe4ea9a",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-31",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-31T00:23:13.814493Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/dcd4020d-72f7-4491-9d42-7e163fe4ea9a` → **200**

```json
{
  "id": "dcd4020d-72f7-4491-9d42-7e163fe4ea9a",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-31",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-31T00:23:13.814493Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/dcd4020d-72f7-4491-9d42-7e163fe4ea9a` → **200**

```json
{
  "id": "dcd4020d-72f7-4491-9d42-7e163fe4ea9a",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-31",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-31T00:23:13.814493Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/dcd4020d-72f7-4491-9d42-7e163fe4ea9a` → **200**

```json
{
  "id": "dcd4020d-72f7-4491-9d42-7e163fe4ea9a",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-31",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-31T00:23:13.814493Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/dcd4020d-72f7-4491-9d42-7e163fe4ea9a` → **200**

```json
{
  "id": "dcd4020d-72f7-4491-9d42-7e163fe4ea9a",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-31",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-31.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-31T00:23:13.814493Z",
  "ready_at": "2026-10-31T00:23:17.681771Z",
  "expires_at": "2026-11-01T00:23:17.681771Z"
}
```

`GET /api/admin/v1/reports/exports/dcd4020d-72f7-4491-9d42-7e163fe4ea9a/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-31,UAH,12,1655.51,130.74,248.37,1407.14,10.52,0.00,325.94,182.97,900.17,50.00,105.17
total,UAH,12,1655.51,130.74,248.37,1407.14,10.52,0.00,325.94,182.97,900.17,50.00,105.17
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/8bc44470-f268-4386-a1e8-772fd5708897` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/8bc44470-f268-4386-a1e8-772fd5708897",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "08075801-a2c2-483b-82f5-0fddba03b287"
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
  "session_id": "c470f020-64e3-4466-b7a0-db8e79007fb4",
  "subject": {
    "type": "STAFF",
    "id": "2a3afaa3-e140-4771-8de7-2ab6b356cb06"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYTNhZmFhMy1lMTQwLTQ3NzEtOGRlNy0yYWI2YjM1NmNiMDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDcwOTksImlhdCI6MTc5MzQwNjE5OSwianRpIjoiYmY2ODViZDgtODMxMi00MjY0LWIyNmYtYjI1YzczNWQ2YTUxIiwic2lkIjoiYzQ3MGYwMjAtNjRlMy00NDY2LWI3YTAtZGI4ZTc5MDA3ZmI0In0.h1HDDJemy0kUHue4uJ-Ii2FNlusgg0sqdA0cuGNsbWA",
  "access_expires_at": "2026-10-31T00:38:19.457673182Z",
  "refresh_token": "7J85bg-ga9nWVwhLK-dKOipebDAkKGF6ZbdYGb06QHA",
  "refresh_expires_at": "2026-10-31T12:23:19.457263699Z",
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
  "command_id": "ae861496-2205-4b18-8c41-2f1c01f8b4e2",
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
  "changed_by": "2a3afaa3-e140-4771-8de7-2ab6b356cb06",
  "reason": "Sandbox retention boundary",
  "changed_at": "2026-10-31T00:23:19.873141697Z"
}
```

`POST /sandbox/v1/retention/fixtures/62cc94c9-6a20-46b7-9ed2-32873d7bc503` → **200**

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

`GET /sandbox/v1/retention/fixtures/62cc94c9-6a20-46b7-9ed2-32873d7bc503` → **200**

```json
{
  "old_done": 0,
  "recent_done": 1,
  "failed": 1
}
```

Old DONE event removed; recent DONE and old FAILED events retained. Policy and synthetic fixtures restored on exit.

`DELETE /sandbox/v1/retention/fixtures/62cc94c9-6a20-46b7-9ed2-32873d7bc503` → **204**

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
  "changed_by": "2a3afaa3-e140-4771-8de7-2ab6b356cb06",
  "reason": "Sandbox retention boundary",
  "changed_at": "2026-10-31T00:23:19.873142Z"
}
```

`PUT /api/admin/v1/retention` → **200**

```json
{
  "command_id": "18dc5f42-d77a-431a-96fe-83d73a6906a0",
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
  "changed_by": "2a3afaa3-e140-4771-8de7-2ab6b356cb06",
  "reason": "Restore policy after retention sandbox",
  "changed_at": "2026-10-31T00:23:20.415224158Z"
}
```

# Scenario: risk-flag

## The driver starts a new shift in Kyiv

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-9056"
}
```

```json
{
  "challenge_id": "339c25ae-d85f-493e-bdc5-9d99324cd029",
  "expires_at": "2026-10-31T00:28:20.623029187Z",
  "resend_available_at": "2026-10-31T00:23:21.623029187Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "026043",
  "sent_at": "2026-10-31T00:23:20.62499681Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "339c25ae-d85f-493e-bdc5-9d99324cd029",
  "code": "026043",
  "device_ref": "sandbox-9056"
}
```

```json
{
  "session_id": "47bfb522-9d92-44c4-b3b7-46d51df5d093",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwNzEwMCwiaWF0IjoxNzkzNDA2MjAwLCJqdGkiOiIyYjBkNDE0My05NjQ2LTRjNzAtODQxZS1iNzNjNzY5ZTM3YmUiLCJzaWQiOiI0N2JmYjUyMi05ZDkyLTQ0YzQtYjNiNy00NmQ1MWRmNWQwOTMifQ.idyoeH7-DnrmCA1M5LdwxGepyWnCouZAwZYtNyArYH0",
  "access_expires_at": "2026-10-31T00:38:20.857881447Z",
  "refresh_token": "_-aHSJve1SgvUt1hv3tib5yt2CubPuiIGO1_QXwydfQ",
  "refresh_expires_at": "2026-11-30T00:23:20.857533904Z",
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
  "command_id": "668b3235-ddc2-42a7-a325-e0a6a50bda69",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T00:23:21Z",
    "sequence": 1793406201478
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "556274a4-0a40-4244-ab06-a4300a7df917",
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
  "last_heartbeat_at": "2026-10-31T00:23:21.493762Z",
  "last_location_at": "2026-10-31T00:23:21.493762Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "67779cf0-4e2f-4ecb-bc89-e70af475144b",
  "points": [
    {
      "sequence": 1793406203702,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-31T00:22:23Z"
    },
    {
      "sequence": 1793406203709,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-31T00:23:23Z"
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
  "session_id": "e7f51261-0737-410a-a5c0-0602d3a283e8",
  "subject": {
    "type": "STAFF",
    "id": "2a3afaa3-e140-4771-8de7-2ab6b356cb06"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYTNhZmFhMy1lMTQwLTQ3NzEtOGRlNy0yYWI2YjM1NmNiMDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDcxMDQsImlhdCI6MTc5MzQwNjIwNCwianRpIjoiM2YyMjlmZWUtNjBkNy00NDNjLTgzZDgtODlkMWE3YjM1YWE4Iiwic2lkIjoiZTdmNTEyNjEtMDczNy00MTBhLWE1YzAtMDYwMmQzYTI4M2U4In0.g3rzw9fm-qLjpZSyw8jIGIHzAiQP24gHz7YyZXPE4x4",
  "access_expires_at": "2026-10-31T00:38:24.147128877Z",
  "refresh_token": "QXqHRrP_hYG5-r3EGiYCCz-M1xmlf9zsMSKZd6M5sL4",
  "refresh_expires_at": "2026-10-31T12:23:24.146768574Z",
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
      "id": "8d845874-42c5-4baf-8deb-aa77be5bcc63",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-31T00:23:23Z",
        "track_point_id": "2f6ea4a8-954f-4d79-964e-e703977f176f",
        "work_session_id": "556274a4-0a40-4244-ab06-a4300a7df917"
      },
      "raised_by": null,
      "raised_at": "2026-10-31T00:23:23Z",
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
  "history": [],
  "duplicates": []
}
```

## Support confirms it with a reason — once

`POST /api/admin/v1/driver-risk-flags/8d845874-42c5-4baf-8deb-aa77be5bcc63/confirm` → **200**

```json
{
  "command_id": "cd802b01-fefd-48ff-a98c-0b0877a59147",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "8d845874-42c5-4baf-8deb-aa77be5bcc63",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-31T00:23:23Z",
    "track_point_id": "2f6ea4a8-954f-4d79-964e-e703977f176f",
    "work_session_id": "556274a4-0a40-4244-ab06-a4300a7df917"
  },
  "raised_by": null,
  "raised_at": "2026-10-31T00:23:23Z",
  "reason": null,
  "reviewed_by": "2a3afaa3-e140-4771-8de7-2ab6b356cb06",
  "reviewed_at": "2026-10-31T00:23:26.007921Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/8d845874-42c5-4baf-8deb-aa77be5bcc63/dismiss` → **409**

```json
{
  "command_id": "fce881b8-5ab0-4d34-a5c7-f9db9157b90e",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/8d845874-42c5-4baf-8deb-aa77be5bcc63/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "b90559d3-76d1-4981-9cf5-ac5130eaaa5f"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "60b1bdf6-912a-437c-8e1e-85158c092594",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "fc3baff4-0844-4446-bad7-8e2b2375eb18",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "2a3afaa3-e140-4771-8de7-2ab6b356cb06",
  "raised_at": "2026-10-31T00:23:26.432106Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/fc3baff4-0844-4446-bad7-8e2b2375eb18/dismiss` → **200**

```json
{
  "command_id": "8090784f-9430-462d-a559-6611e9058165",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "fc3baff4-0844-4446-bad7-8e2b2375eb18",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "2a3afaa3-e140-4771-8de7-2ab6b356cb06",
  "raised_at": "2026-10-31T00:23:26.432106Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "2a3afaa3-e140-4771-8de7-2ab6b356cb06",
  "reviewed_at": "2026-10-31T00:23:26.643084Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "4685bd14-53aa-4393-a637-8e5f3106ac5d",
  "expected_version": 18,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "8d845874-42c5-4baf-8deb-aa77be5bcc63"
}
```

```json
{
  "id": "5a000000-0000-4000-8000-000000000403",
  "account_state": "ACTIVE",
  "name": "Андрій Шевчук",
  "language": "ru",
  "review_status": "SUSPENDED",
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
    "review_status": "SUSPENDED",
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
      "actor_id": "2a3afaa3-e140-4771-8de7-2ab6b356cb06",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-31T00:23:26.859817Z"
    }
  ],
  "duplicates": []
}
```

Done: flag 8d845874-42c5-4baf-8deb-aa77be5bcc63 confirmed, suspension named it, driver reinstated.

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
  "session_id": "6cb8a822-41ff-41e7-bda4-dc78ac980a10",
  "subject": {
    "type": "STAFF",
    "id": "2a3afaa3-e140-4771-8de7-2ab6b356cb06"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYTNhZmFhMy1lMTQwLTQ3NzEtOGRlNy0yYWI2YjM1NmNiMDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDcxMDcsImlhdCI6MTc5MzQwNjIwNywianRpIjoiMjhkMzQ0ZDQtYzhmMS00YmY5LTkxNGQtZTNiZGNiNWYyNWZjIiwic2lkIjoiNmNiOGE4MjItNDFmZi00MWU3LWJkYTQtZGM3OGFjOTgwYTEwIn0.ohN-fnVDeRmYNay96du9zCVbHH65eUZHOiZcie4CD4g",
  "access_expires_at": "2026-10-31T00:38:27.476087079Z",
  "refresh_token": "5mK3a20FNF-bnTsgn3X0fSRJ_EtxP9BpV--tTpuwQSs",
  "refresh_expires_at": "2026-10-31T12:23:27.475655655Z",
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
      "actor_id": "2a3afaa3-e140-4771-8de7-2ab6b356cb06",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-31T00:23:26.859817Z"
    }
  ],
  "duplicates": []
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "dfb6c75a-7426-41d4-a457-54f0c34c06aa",
  "expected_version": 19,
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
  "version": 20,
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
  "session_id": "556274a4-0a40-4244-ab06-a4300a7df917",
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
  "last_heartbeat_at": "2026-10-31T00:23:21.493762Z",
  "last_location_at": "2026-10-31T00:23:21.493762Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/556274a4-0a40-4244-ab06-a4300a7df917/close` → **200**

```json
{
  "command_id": "c527768c-9924-4276-921a-ca6b86ec1264",
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
  "session_id": "8423fb08-fa99-4724-b883-309d3f1ab8e9",
  "subject": {
    "type": "STAFF",
    "id": "2a3afaa3-e140-4771-8de7-2ab6b356cb06"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYTNhZmFhMy1lMTQwLTQ3NzEtOGRlNy0yYWI2YjM1NmNiMDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDcxMDgsImlhdCI6MTc5MzQwNjIwOCwianRpIjoiYzM1NTk2NWMtNDQ0Zi00ZDEyLTg3MGUtMTJlNGM2ZTczYmU5Iiwic2lkIjoiODQyM2ZiMDgtZmE5OS00NzI0LWI4ODMtMzA5ZDNmMWFiOGU5In0.8C_gD6A5DQf-Cp886jCNQsUci7EkS7T5rGsFmyhVRQM",
  "access_expires_at": "2026-10-31T00:38:28.748099681Z",
  "refresh_token": "tZBZ0fK04iZBvtQEffDpLVEbalOrnWWdkpVv7eFPBEM",
  "refresh_expires_at": "2026-10-31T12:23:28.747645577Z",
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
  "command_id": "3e176ecd-ab86-4bad-8199-88b1e268e1b8",
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
  "changed_by": "2a3afaa3-e140-4771-8de7-2ab6b356cb06",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-31T00:23:29.164424Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "3e176ecd-ab86-4bad-8199-88b1e268e1b8",
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
  "changed_by": "2a3afaa3-e140-4771-8de7-2ab6b356cb06",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-31T00:23:29.164424Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48564345112",
  "device_ref": "sandbox-20569"
}
```

```json
{
  "challenge_id": "2e116c6c-1df1-43fb-8d55-3800a6f5d829",
  "expires_at": "2026-10-31T00:28:29.593051296Z",
  "resend_available_at": "2026-10-31T00:23:30.593051296Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48564345112` → **200**

```json
{
  "phone": "+48564345112",
  "audience": "CLIENT",
  "code": "318927",
  "sent_at": "2026-10-31T00:23:29.595199291Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2e116c6c-1df1-43fb-8d55-3800a6f5d829",
  "code": "318927",
  "device_ref": "sandbox-20569"
}
```

```json
{
  "session_id": "c2c6c565-ea1b-46ae-a1a1-4b2874e10fb4",
  "subject": {
    "type": "CLIENT",
    "id": "98e0161d-0463-42df-8918-740c11231415"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5OGUwMTYxZC0wNDYzLTQyZGYtODkxOC03NDBjMTEyMzE0MTUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDA3MTA5LCJpYXQiOjE3OTM0MDYyMDksImp0aSI6IjI3MzczNzU0LWY0ZWItNDFkNS1hMjdkLTBiNTE0MWY1MjM0YiIsInNpZCI6ImMyYzZjNTY1LWVhMWItNDZhZS1hMWExLTRiMjg3NGUxMGZiNCJ9.Sw4oN8Up6CwdawstocbzCWMNm2AkJYJhbAbS6tj4AX4",
  "access_expires_at": "2026-10-31T00:38:29.822940304Z",
  "refresh_token": "YR81Gyuid_7gM6O4xfcTlzHXCupNTfBaL1L5Ht_1v24",
  "refresh_expires_at": "2026-11-30T00:23:29.822592781Z",
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
  "correlation_id": "49ee61bc-57cd-4964-afc1-5a359b43c039"
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
  "device_ref": "sandbox-16844"
}
```

```json
{
  "challenge_id": "7b03893a-e2e1-406e-8431-d691dca4958f",
  "expires_at": "2026-10-31T00:28:30.447910644Z",
  "resend_available_at": "2026-10-31T00:23:31.447910644Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "053549",
  "sent_at": "2026-10-31T00:23:30.449874322Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7b03893a-e2e1-406e-8431-d691dca4958f",
  "code": "053549",
  "device_ref": "sandbox-16844"
}
```

```json
{
  "session_id": "3233ffc3-b2e4-4252-ad5d-d0a500633edc",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwNzExMCwiaWF0IjoxNzkzNDA2MjEwLCJqdGkiOiIxMTIzZmNmYS0wOGE3LTRmMzgtOTg0YS05YTllY2M1MzdlNjgiLCJzaWQiOiIzMjMzZmZjMy1iMmU0LTQyNTItYWQ1ZC1kMGE1MDA2MzNlZGMifQ.xxJktjmiDunnR-cKIWb7w5siTLHNcPc0_1oXFW_vqGw",
  "access_expires_at": "2026-10-31T00:38:30.674911997Z",
  "refresh_token": "2BUSeaTW7_xye-HJonKoCD2io4BEbdWlEdkUiTaNoNg",
  "refresh_expires_at": "2026-11-30T00:23:30.674553908Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "8d300643-2be2-4aaf-a72f-faca21ac6d18",
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
  "last_heartbeat_at": "2026-10-31T00:22:01.415448Z",
  "last_location_at": "2026-10-31T00:22:01.415448Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/8d300643-2be2-4aaf-a72f-faca21ac6d18/handover` → **200**

```json
{
  "command_id": "1f7caab0-43cf-47dc-bc7c-a2dd93e15887",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "8d300643-2be2-4aaf-a72f-faca21ac6d18",
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
  "last_heartbeat_at": "2026-10-31T00:22:01.415448Z",
  "last_location_at": "2026-10-31T00:22:01.415448Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/8d300643-2be2-4aaf-a72f-faca21ac6d18/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T00:23:31Z",
    "sequence": 1793406211308
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "8d300643-2be2-4aaf-a72f-faca21ac6d18",
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
  "last_heartbeat_at": "2026-10-31T00:23:31.325374Z",
  "last_location_at": "2026-10-31T00:23:31.325374Z",
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
  "session_id": "8d300643-2be2-4aaf-a72f-faca21ac6d18",
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
  "last_heartbeat_at": "2026-10-31T00:23:31.325374Z",
  "last_location_at": "2026-10-31T00:23:31.325374Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8d300643-2be2-4aaf-a72f-faca21ac6d18/close` → **200**

```json
{
  "command_id": "2488b6b9-f218-4112-86ed-aaf5e68a54d8",
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
  "correlation_id": "6db37510-26fe-4195-8bf7-7c2bcb04c2de"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671546300",
  "device_ref": "sandbox-633"
}
```

```json
{
  "challenge_id": "ab709e07-8048-4803-908d-e37548069896",
  "expires_at": "2026-10-31T00:28:32.373924719Z",
  "resend_available_at": "2026-10-31T00:23:33.373924719Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380671546300` → **200**

```json
{
  "phone": "+380671546300",
  "audience": "CLIENT",
  "code": "077345",
  "sent_at": "2026-10-31T00:23:32.375551059Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ab709e07-8048-4803-908d-e37548069896",
  "code": "077345",
  "device_ref": "sandbox-633"
}
```

```json
{
  "session_id": "e28b9073-9ffa-4bc3-837f-a5ad5024a3cf",
  "subject": {
    "type": "CLIENT",
    "id": "c40d381e-5b2f-4542-8259-d00c7933e0ec"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNDBkMzgxZS01YjJmLTQ1NDItODI1OS1kMDBjNzkzM2UwZWMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDA3MTEyLCJpYXQiOjE3OTM0MDYyMTIsImp0aSI6Ijc5ODg2ZDEyLWVkNzUtNDE4Ni1hNDkxLTUxZDRlMGU4OTRhNSIsInNpZCI6ImUyOGI5MDczLTlmZmEtNGJjMy04MzdmLWE1YWQ1MDI0YTNjZiJ9.myRFHjZxuC2hFBjwu1PaVTJhqHr9v0GsSRBb9vQE008",
  "access_expires_at": "2026-10-31T00:38:32.605827184Z",
  "refresh_token": "LSP52muJjsK1wxV9kGXKGXSQEFVF6-J-7vBB_3v2RlU",
  "refresh_expires_at": "2026-11-30T00:23:32.605308359Z",
  "account_created": true
}
```

## The EICAR antivirus test file is refused by the antivirus

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "4c81f518-7117-4031-a87e-fb2e672baedd",
  "content_type": "application/pdf",
  "size_bytes": 86
}
```

```json
{
  "file_id": "6805e182-3999-41fd-8531-882050b28499",
  "upload_path": "/api/rider/v1/uploads/6805e182-3999-41fd-8531-882050b28499",
  "expires_at": "2026-10-31T00:38:32.824481308Z",
  "max_bytes": 86
}
```

`PUT /api/rider/v1/uploads/6805e182-3999-41fd-8531-882050b28499` → **200**

```json
{
  "file_id": "6805e182-3999-41fd-8531-882050b28499",
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
  "command_id": "4c10e0d8-ee6c-4696-ae35-b4dfc736c4c8",
  "content_type": "application/pdf",
  "size_bytes": 92
}
```

```json
{
  "file_id": "c31d2e07-18ab-4932-b121-b6fd629eaa1b",
  "upload_path": "/api/rider/v1/uploads/c31d2e07-18ab-4932-b121-b6fd629eaa1b",
  "expires_at": "2026-10-31T00:38:33.061872315Z",
  "max_bytes": 92
}
```

`PUT /api/rider/v1/uploads/c31d2e07-18ab-4932-b121-b6fd629eaa1b` → **200**

```json
{
  "file_id": "c31d2e07-18ab-4932-b121-b6fd629eaa1b",
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
  "command_id": "8b65b3a9-b33f-4643-8936-db4391e7eec2",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "22abed02-7a42-40ac-b8fe-d2a84cc17289",
  "upload_path": "/api/rider/v1/uploads/22abed02-7a42-40ac-b8fe-d2a84cc17289",
  "expires_at": "2026-10-31T00:38:33.287404151Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/22abed02-7a42-40ac-b8fe-d2a84cc17289` → **200**

```json
{
  "file_id": "22abed02-7a42-40ac-b8fe-d2a84cc17289",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "52e82d9e-3fed-4146-a14e-4be48ce2d31b",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "22abed02-7a42-40ac-b8fe-d2a84cc17289"
  ]
}
```

```json
{
  "id": "fdb7cc4d-5db6-42ab-8e75-a25fb6b923bf",
  "number": 4,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "c40d381e-5b2f-4542-8259-d00c7933e0ec",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-31T00:23:33.516166Z",
  "updated_at": "2026-10-31T00:23:33.516166Z",
  "respond_by": "2026-10-31T04:23:33.516166Z",
  "messages": [
    {
      "id": "0f26b45d-3370-4d04-93d6-12891a652dfd",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "c40d381e-5b2f-4542-8259-d00c7933e0ec",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-31T00:23:33.516726Z",
      "attachments": [
        {
          "file_id": "22abed02-7a42-40ac-b8fe-d2a84cc17289",
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
  "session_id": "e25d9ea8-8004-458c-b7be-1d17e09c60a4",
  "subject": {
    "type": "STAFF",
    "id": "2a3afaa3-e140-4771-8de7-2ab6b356cb06"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYTNhZmFhMy1lMTQwLTQ3NzEtOGRlNy0yYWI2YjM1NmNiMDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDcxMTMsImlhdCI6MTc5MzQwNjIxMywianRpIjoiZDhmNTViNjItNTg5Yy00NTExLTk5YWQtYTQ1NzdkOGEyY2RlIiwic2lkIjoiZTI1ZDllYTgtODAwNC00NThjLWI3YmUtMWQxN2UwOWM2MGE0In0.pDHG6gcQO9GgXhPciS8wUMd61YTPdbXWwWteoYAklgQ",
  "access_expires_at": "2026-10-31T00:38:33.935833257Z",
  "refresh_token": "NwnKsGsdDl1zUZHJeOnGlvsc5NBwqWno9XEkYjEAwWg",
  "refresh_expires_at": "2026-10-31T12:23:33.935469449Z",
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
  "session_id": "9382ea23-4a1a-49be-9238-a41808ef2f55",
  "subject": {
    "type": "STAFF",
    "id": "2a3afaa3-e140-4771-8de7-2ab6b356cb06"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYTNhZmFhMy1lMTQwLTQ3NzEtOGRlNy0yYWI2YjM1NmNiMDYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDcxMTQsImlhdCI6MTc5MzQwNjIxNCwianRpIjoiYzE2ZThhOWMtMjU1My00NDZkLTk2YjYtMjY2NzMyNTY4NTgwIiwic2lkIjoiOTM4MmVhMjMtNGExYS00OWJlLTkyMzgtYTQxODA4ZWYyZjU1In0.b7ByQwRLw3fRLkNYD3qdbuYqdR4YrfQ1sCWI3nUJ8Hw",
  "access_expires_at": "2026-10-31T00:38:34.345929313Z",
  "refresh_token": "sw-8FjJLiZLZ8sOSH3tmPwPA2th2VUZnzFNiMk2DMFU",
  "refresh_expires_at": "2026-10-31T12:23:34.34555568Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/fdb7cc4d-5db6-42ab-8e75-a25fb6b923bf/attachments/22abed02-7a42-40ac-b8fe-d2a84cc17289` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "ba7580b9-23e8-4f7b-a02c-1e623fe8dce1",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "6ce6f010-db83-4014-8752-6fa9d6660f79",
  "upload_path": "/api/operator/v1/uploads/6ce6f010-db83-4014-8752-6fa9d6660f79",
  "expires_at": "2026-10-31T00:38:34.56729061Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/6ce6f010-db83-4014-8752-6fa9d6660f79` → **200**

```json
{
  "file_id": "6ce6f010-db83-4014-8752-6fa9d6660f79",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/fdb7cc4d-5db6-42ab-8e75-a25fb6b923bf` → **200**

```json
{
  "id": "fdb7cc4d-5db6-42ab-8e75-a25fb6b923bf",
  "number": 4,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "c40d381e-5b2f-4542-8259-d00c7933e0ec",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-31T00:23:33.516166Z",
  "updated_at": "2026-10-31T00:23:33.516166Z",
  "respond_by": "2026-10-31T04:23:33.516166Z",
  "messages": [
    {
      "id": "0f26b45d-3370-4d04-93d6-12891a652dfd",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "c40d381e-5b2f-4542-8259-d00c7933e0ec",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-31T00:23:33.516726Z",
      "attachments": [
        {
          "file_id": "22abed02-7a42-40ac-b8fe-d2a84cc17289",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/fdb7cc4d-5db6-42ab-8e75-a25fb6b923bf/comments` → **200**

```json
{
  "command_id": "8277728e-296a-46c5-85f2-fa3151825d5b",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "6ce6f010-db83-4014-8752-6fa9d6660f79"
  ]
}
```

```json
{
  "id": "fdb7cc4d-5db6-42ab-8e75-a25fb6b923bf",
  "number": 4,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "c40d381e-5b2f-4542-8259-d00c7933e0ec",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-31T00:23:33.516166Z",
  "updated_at": "2026-10-31T00:23:35.00627Z",
  "respond_by": "2026-10-31T04:23:33.516166Z",
  "messages": [
    {
      "id": "0f26b45d-3370-4d04-93d6-12891a652dfd",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "c40d381e-5b2f-4542-8259-d00c7933e0ec",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-31T00:23:33.516726Z",
      "attachments": [
        {
          "file_id": "22abed02-7a42-40ac-b8fe-d2a84cc17289",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "1f149ddf-b7e3-44de-8878-f515f1167c51",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "2a3afaa3-e140-4771-8de7-2ab6b356cb06",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-31T00:23:35.005857Z",
      "attachments": [
        {
          "file_id": "6ce6f010-db83-4014-8752-6fa9d6660f79",
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

`GET /api/rider/v1/support/cases/fdb7cc4d-5db6-42ab-8e75-a25fb6b923bf` → **200**

```json
{
  "id": "fdb7cc4d-5db6-42ab-8e75-a25fb6b923bf",
  "number": 4,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "c40d381e-5b2f-4542-8259-d00c7933e0ec",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-31T00:23:33.516166Z",
  "updated_at": "2026-10-31T00:23:35.00627Z",
  "respond_by": "2026-10-31T04:23:33.516166Z",
  "messages": [
    {
      "id": "0f26b45d-3370-4d04-93d6-12891a652dfd",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "c40d381e-5b2f-4542-8259-d00c7933e0ec",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-31T00:23:33.516726Z",
      "attachments": [
        {
          "file_id": "22abed02-7a42-40ac-b8fe-d2a84cc17289",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "1f149ddf-b7e3-44de-8878-f515f1167c51",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-31T00:23:35.005857Z",
      "attachments": [
        {
          "file_id": "6ce6f010-db83-4014-8752-6fa9d6660f79",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/fdb7cc4d-5db6-42ab-8e75-a25fb6b923bf/attachments/6ce6f010-db83-4014-8752-6fa9d6660f79` → **200**

Done: support case fdb7cc4d-5db6-42ab-8e75-a25fb6b923bf, rider attachment 22abed02-7a42-40ac-b8fe-d2a84cc17289, operator attachment 6ce6f010-db83-4014-8752-6fa9d6660f79.

# Scenario: switch-to-cash

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380733951525",
  "device_ref": "sandbox-4146"
}
```

```json
{
  "challenge_id": "64dd24f1-6dea-4353-88a6-2011dd07df81",
  "expires_at": "2026-10-31T00:28:35.45489697Z",
  "resend_available_at": "2026-10-31T00:23:36.45489697Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380733951525` → **200**

```json
{
  "phone": "+380733951525",
  "audience": "CLIENT",
  "code": "363593",
  "sent_at": "2026-10-31T00:23:35.45676586Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "64dd24f1-6dea-4353-88a6-2011dd07df81",
  "code": "363593",
  "device_ref": "sandbox-4146"
}
```

```json
{
  "session_id": "264a51f8-af07-4df9-8911-1c848c3c5af6",
  "subject": {
    "type": "CLIENT",
    "id": "646e23e1-2539-4983-97c0-1f4915e2344b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NDZlMjNlMS0yNTM5LTQ5ODMtOTdjMC0xZjQ5MTVlMjM0NGIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDA3MTE1LCJpYXQiOjE3OTM0MDYyMTUsImp0aSI6IjI0NDVhMjcxLThmZDctNDE2MS1iZDFjLTJmY2YyZTdhY2Y1YSIsInNpZCI6IjI2NGE1MWY4LWFmMDctNGRmOS04OTExLTFjODQ4YzNjNWFmNiJ9.a7x69Br1siRoTHkdl8o1bWpGpuJXPXCs9uPQmDkVRko",
  "access_expires_at": "2026-10-31T00:38:35.680040164Z",
  "refresh_token": "n6rckHZWH8CJFyPpZhCqbm8GixlKvaJP3YO48QKMSSI",
  "refresh_expires_at": "2026-11-30T00:23:35.679679842Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "43f60552-8a0c-4ec2-836f-6b3e2de86f27",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "922c9100-02cf-4459-ba7e-379d62a96c1f",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-922c9100-02cf-4459-ba7e-379d62a96c1f",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "b2f8925fc6b90edce357e7d1654fa256",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=922c9100-02cf-4459-ba7e-379d62a96c1f",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380733951525"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=922c9100-02cf-4459-ba7e-379d62a96c1f",
  "expires_at": "2026-10-31T00:53:35.8795Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/922c9100-02cf-4459-ba7e-379d62a96c1f` → **200**

```json
{
  "id": "922c9100-02cf-4459-ba7e-379d62a96c1f",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-31T00:53:35.8795Z",
  "card": {
    "id": "52f7be8b-9508-47a6-bde7-df26302411ac",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****3814",
    "card_type": "Visa",
    "created_at": "2026-10-31T00:23:36.087942Z"
  },
  "failure_reason": null
}
```

## The rider orders by card: the hold is taken

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c5938062-a913-4e47-9079-e11c249b9030",
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
  "id": "73fc544d-7ab0-45cd-a3fd-b0e9d34d6ae3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T00:28:36.308172Z",
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
  "command_id": "44c915b9-76c9-41a0-8dca-712675651dc3",
  "quote_id": "73fc544d-7ab0-45cd-a3fd-b0e9d34d6ae3",
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
  "id": "1e2a85d6-7cb4-4bc0-8495-882a12260e9e",
  "short_number": 38,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "646e23e1-2539-4983-97c0-1f4915e2344b",
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
  "created_at": "2026-10-31T00:23:36.520858Z",
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

`GET /api/rider/v1/orders/1e2a85d6-7cb4-4bc0-8495-882a12260e9e` → **200**

```json
{
  "id": "1e2a85d6-7cb4-4bc0-8495-882a12260e9e",
  "short_number": 38,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "646e23e1-2539-4983-97c0-1f4915e2344b",
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
  "created_at": "2026-10-31T00:23:36.520858Z",
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

`GET /api/rider/v1/orders/1e2a85d6-7cb4-4bc0-8495-882a12260e9e` → **200**

```json
{
  "id": "1e2a85d6-7cb4-4bc0-8495-882a12260e9e",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "646e23e1-2539-4983-97c0-1f4915e2344b",
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
  "created_at": "2026-10-31T00:23:36.520858Z",
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

## The rider decides to pay in cash

`GET /api/rider/v1/orders/1e2a85d6-7cb4-4bc0-8495-882a12260e9e` → **200**

```json
{
  "id": "1e2a85d6-7cb4-4bc0-8495-882a12260e9e",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "646e23e1-2539-4983-97c0-1f4915e2344b",
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
  "created_at": "2026-10-31T00:23:36.520858Z",
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

`POST /api/rider/v1/orders/1e2a85d6-7cb4-4bc0-8495-882a12260e9e/switch-to-cash` → **200**

```json
{
  "command_id": "440e318a-9b23-490d-bb72-57d72fd77324",
  "expected_version": 3
}
```

```json
{
  "id": "1e2a85d6-7cb4-4bc0-8495-882a12260e9e",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "646e23e1-2539-4983-97c0-1f4915e2344b",
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
  "created_at": "2026-10-31T00:23:36.520858Z",
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

`POST /api/rider/v1/orders/1e2a85d6-7cb4-4bc0-8495-882a12260e9e/switch-to-cash` → **409**

```json
{
  "command_id": "1d44d38f-894a-4aee-bb24-571177580203",
  "expected_version": 4
}
```

```json
{
  "instance": "/api/rider/v1/orders/1e2a85d6-7cb4-4bc0-8495-882a12260e9e/switch-to-cash",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "07e5b354-ff1a-49b4-a5aa-f4c6bd7b94d6"
}
```

Done: the card order became cash; a second switch is refused.

`GET /api/rider/v1/orders/1e2a85d6-7cb4-4bc0-8495-882a12260e9e` → **200**

```json
{
  "id": "1e2a85d6-7cb4-4bc0-8495-882a12260e9e",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "646e23e1-2539-4983-97c0-1f4915e2344b",
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
  "created_at": "2026-10-31T00:23:36.520858Z",
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

`POST /api/rider/v1/orders/1e2a85d6-7cb4-4bc0-8495-882a12260e9e/cancel` → **200**

```json
{
  "command_id": "70c77820-2216-40dd-8552-18981d231739",
  "expected_version": 4,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "1e2a85d6-7cb4-4bc0-8495-882a12260e9e",
  "short_number": 38,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "646e23e1-2539-4983-97c0-1f4915e2344b",
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
  "created_at": "2026-10-31T00:23:36.520858Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "en": "Changed my mind",
      "ru": "Передумал ехать",
      "pl": "Zmiana planów",
      "uk": "Передумав їхати"
    }
  },
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
  "session_id": "41efc66f-eaf5-4636-8e9c-3b4be20396f4",
  "subject": {
    "type": "STAFF",
    "id": "2a3afaa3-e140-4771-8de7-2ab6b356cb06"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYTNhZmFhMy1lMTQwLTQ3NzEtOGRlNy0yYWI2YjM1NmNiMDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDcxMTksImlhdCI6MTc5MzQwNjIxOSwianRpIjoiNGUxNTU2NDMtNTgwMy00ZmVkLTg0ZDktMTEyOTkxNDYwNTYzIiwic2lkIjoiNDFlZmM2NmYtZWFmNS00NjM2LThlOWMtM2I0YmUyMDM5NmY0In0.WxEo8PoPV4-GTLYToKk4DytfC_DsG4RlawZshJsQg14",
  "access_expires_at": "2026-10-31T00:38:39.437465351Z",
  "refresh_token": "yqu7XjA7W9iUEwz7Y1Icpnnypdmih9VGfZ0AZjcVf_I",
  "refresh_expires_at": "2026-10-31T12:23:39.43700697Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-13808"
}
```

```json
{
  "challenge_id": "96688144-0ed4-4d3a-9142-f2b3e21fe507",
  "expires_at": "2026-10-31T00:28:39.638017184Z",
  "resend_available_at": "2026-10-31T00:23:40.638017184Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "012966",
  "sent_at": "2026-10-31T00:23:39.639767962Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "96688144-0ed4-4d3a-9142-f2b3e21fe507",
  "code": "012966",
  "device_ref": "sandbox-13808"
}
```

```json
{
  "session_id": "42da6924-25e1-4bdb-b01c-6c0090889579",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwNzExOSwiaWF0IjoxNzkzNDA2MjE5LCJqdGkiOiJkMTFjOTUzMC1lMTIwLTQwOTctYTVmZi05ZmI1YzIzNjA2MmQiLCJzaWQiOiI0MmRhNjkyNC0yNWUxLTRiZGItYjAxYy02YzAwOTA4ODk1NzkifQ.NljLFzFn_ao1Xa-fbUoLMwSj7amwmwiCDFtkgsMTESg",
  "access_expires_at": "2026-10-31T00:38:39.858634459Z",
  "refresh_token": "u-clLF24UWGpFB8cBi8ve4qRLWW5JbW6bwoXAZA-yLs",
  "refresh_expires_at": "2026-11-30T00:23:39.858258022Z",
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
  "version": 21,
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
    "version": 21,
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
      "actor_id": "2a3afaa3-e140-4771-8de7-2ab6b356cb06",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-31T00:23:26.859817Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "2a3afaa3-e140-4771-8de7-2ab6b356cb06",
      "reason": "Sandbox clean-up",
      "at": "2026-10-31T00:23:27.895498Z"
    }
  ],
  "duplicates": []
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "b2fb15c5-d3cb-4fb8-8006-075fe58efaab",
  "expected_version": 21,
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
  "version": 22,
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
  "device_ref": "sandbox-7604"
}
```

```json
{
  "challenge_id": "7cc80ceb-9937-46e8-b3be-0c5aaee73372",
  "expires_at": "2026-10-31T00:28:40.67840966Z",
  "resend_available_at": "2026-10-31T00:23:41.67840966Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "471698",
  "sent_at": "2026-10-31T00:23:40.680520856Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7cc80ceb-9937-46e8-b3be-0c5aaee73372",
  "code": "471698",
  "device_ref": "sandbox-7604"
}
```

```json
{
  "session_id": "325fcc9f-a7cc-4473-b6a2-414eb2b05b28",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwNzEyMCwiaWF0IjoxNzkzNDA2MjIwLCJqdGkiOiI0YThiMmMyOS1lYWIxLTRiMzUtOTRkYS0xZWIyMzFhOGM0Y2MiLCJzaWQiOiIzMjVmY2M5Zi1hN2NjLTQ0NzMtYjZhMi00MTRlYjJiMDViMjgifQ.yZc_gM0SEb-m0IS05oIV69vW7d1EfiJqgrKKmiUX_cQ",
  "access_expires_at": "2026-10-31T00:38:40.901645703Z",
  "refresh_token": "c2IqEGq2IC16iy1LbEYccWyiboyKeqRgkTixqgkWRIQ",
  "refresh_expires_at": "2026-11-30T00:23:40.901198059Z",
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

(the car drives 2 s to the next point)

`POST /api/driver/v1/work-sessions` → **201**

```json
{
  "command_id": "944cf71d-426c-47d2-b009-35b25d6ea201",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T00:23:43Z",
    "sequence": 1793406223321
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f9921d86-00b4-4629-ad95-c87a83b6f4cc",
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
  "last_heartbeat_at": "2026-10-31T00:23:43.337647Z",
  "last_location_at": "2026-10-31T00:23:43.337647Z",
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
  "command_id": "7277a5ab-c9ee-4628-a8ad-b5431802ebca",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T00:23:43Z",
    "sequence": 1793406223753
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "ee09391a-c206-47be-9a68-cd53e5976fd0",
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
  "last_heartbeat_at": "2026-10-31T00:23:43.768847Z",
  "last_location_at": "2026-10-31T00:23:43.768847Z",
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
  "session_id": "753d0c38-2d05-48da-852c-2a479784ee88",
  "subject": {
    "type": "STAFF",
    "id": "2a3afaa3-e140-4771-8de7-2ab6b356cb06"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYTNhZmFhMy1lMTQwLTQ3NzEtOGRlNy0yYWI2YjM1NmNiMDYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDcxMjQsImlhdCI6MTc5MzQwNjIyNCwianRpIjoiNTgzN2VmYmYtNTFiMC00ZWZiLTk1NDQtZDJjNzQ3NDJkNWU0Iiwic2lkIjoiNzUzZDBjMzgtMmQwNS00OGRhLTg1MmMtMmE0Nzk3ODRlZTg4In0.QmI_jP8wneApLzrmBGvHrkGQOjiSOjkFKdcggmk-ITQ",
  "access_expires_at": "2026-10-31T00:38:44.184425429Z",
  "refresh_token": "u2jp09w4xM7CVIsDfebUHvpCdwsTSleQo_UFJ1-v42c",
  "refresh_expires_at": "2026-10-31T12:23:44.183820487Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "8bec8abf-2504-4122-83df-54faba7dd5af",
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
  "id": "571d9341-dfe2-46a0-a8b4-c236094be077",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T00:28:44.386580Z",
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
  "command_id": "f247fdb0-f2f5-4de1-9f39-72e4c6702549",
  "quote_id": "571d9341-dfe2-46a0-a8b4-c236094be077",
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
  "id": "d7dd8352-7c31-42fb-a425-1d593d8f7c7f",
  "short_number": 39,
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
  "created_at": "2026-10-31T00:23:44.600137Z",
  "caller": {
    "name": "Олена",
    "phone": "+380671112233"
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
[]
```

## Andrii accepts, drives and reports the card payment went through

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "502c4dec-2837-4e14-8242-c8a9882ecdf2",
    "order_id": "d7dd8352-7c31-42fb-a425-1d593d8f7c7f",
    "expires_at": "2026-10-31T00:23:59.602665Z",
    "server_time": "2026-10-31T00:23:45.043086633Z",
    "seconds_left": 14,
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
    "distance_m": 656,
    "price_kind": "FIXED",
    "expected_earnings_minor": 25472,
    "comment": null,
    "entrance": null
  }
]
```

`POST /api/driver/v1/offers/502c4dec-2837-4e14-8242-c8a9882ecdf2/accept` → **200**

```json
{
  "command_id": "8be91698-d118-42ee-94a0-6a17dbafe5a2"
}
```

```json
{
  "id": "cb95189d-6221-46e3-a161-fc0b485572fb",
  "order_id": "d7dd8352-7c31-42fb-a425-1d593d8f7c7f",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "8bd35f92-74fd-46ac-a2af-7aebe5517746",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "8bd35f92-74fd-46ac-a2af-7aebe5517746",
  "order_id": "d7dd8352-7c31-42fb-a425-1d593d8f7c7f",
  "assignment_id": "cb95189d-6221-46e3-a161-fc0b485572fb",
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
  },
  "comment": null,
  "entrance": null
}
```

(the car drives 10 s to the next point)

`POST /api/driver/v1/work-sessions/ee09391a-c206-47be-9a68-cd53e5976fd0/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T00:23:55Z",
    "sequence": 1793406235671
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "ee09391a-c206-47be-9a68-cd53e5976fd0",
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
  "last_heartbeat_at": "2026-10-31T00:23:55.687714Z",
  "last_location_at": "2026-10-31T00:23:55.687714Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/8bd35f92-74fd-46ac-a2af-7aebe5517746/arrive` → **200**

```json
{
  "command_id": "194b27d3-2918-4f14-a8bb-a2277f6f54bf",
  "expected_version": 0
}
```

```json
{
  "id": "8bd35f92-74fd-46ac-a2af-7aebe5517746",
  "order_id": "d7dd8352-7c31-42fb-a425-1d593d8f7c7f",
  "assignment_id": "cb95189d-6221-46e3-a161-fc0b485572fb",
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
  "arrived_at": "2026-10-31T00:23:55.895062Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380671112233"
  },
  "comment": null,
  "entrance": null
}
```

`POST /api/driver/v1/trips/8bd35f92-74fd-46ac-a2af-7aebe5517746/start` → **200**

```json
{
  "command_id": "c0f41407-85bc-4b80-baa8-968f0c0a2c35",
  "expected_version": 1
}
```

```json
{
  "id": "8bd35f92-74fd-46ac-a2af-7aebe5517746",
  "order_id": "d7dd8352-7c31-42fb-a425-1d593d8f7c7f",
  "assignment_id": "cb95189d-6221-46e3-a161-fc0b485572fb",
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
  "arrived_at": "2026-10-31T00:23:55.895062Z",
  "started_at": "2026-10-31T00:23:56.110646Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380671112233"
  },
  "comment": null,
  "entrance": null
}
```

`POST /api/driver/v1/trips/8bd35f92-74fd-46ac-a2af-7aebe5517746/complete` → **200**

```json
{
  "command_id": "0f507581-7cbd-4e55-9265-0e7b38ce8709",
  "expected_version": 2,
  "reported_at": "2026-10-31T00:23:56Z",
  "cash_received": true
}
```

```json
{
  "id": "8bd35f92-74fd-46ac-a2af-7aebe5517746",
  "order_id": "d7dd8352-7c31-42fb-a425-1d593d8f7c7f",
  "assignment_id": "cb95189d-6221-46e3-a161-fc0b485572fb",
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
  "arrived_at": "2026-10-31T00:23:55.895062Z",
  "started_at": "2026-10-31T00:23:56.110646Z",
  "completed_at": "2026-10-31T00:23:56.336709Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null,
  "comment": null,
  "entrance": null
}
```

`GET /api/operator/v1/orders/d7dd8352-7c31-42fb-a425-1d593d8f7c7f` → **200**

```json
{
  "id": "d7dd8352-7c31-42fb-a425-1d593d8f7c7f",
  "short_number": 39,
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
    "id": "cb95189d-6221-46e3-a161-fc0b485572fb",
    "order_id": "d7dd8352-7c31-42fb-a425-1d593d8f7c7f",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "8bd35f92-74fd-46ac-a2af-7aebe5517746",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-31T00:23:44.600137Z",
  "caller": {
    "name": "Олена",
    "phone": "+380671112233"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null,
  "driver": {
    "name": "Андрій Шевчук",
    "make": "Hyundai",
    "model": "Sonata",
    "color": "black",
    "registration_number": "AA0003TX",
    "photo_url": null
  },
  "driver_change": null,
  "comment": null,
  "entrance": null
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
  "session_id": "f9921d86-00b4-4629-ad95-c87a83b6f4cc",
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
  "last_heartbeat_at": "2026-10-31T00:23:43.337647Z",
  "last_location_at": "2026-10-31T00:23:43.337647Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/f9921d86-00b4-4629-ad95-c87a83b6f4cc/close` → **200**

```json
{
  "command_id": "c258146f-96fc-4276-a7c3-2385c9b6ab93",
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
  "session_id": "ee09391a-c206-47be-9a68-cd53e5976fd0",
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
  "last_heartbeat_at": "2026-10-31T00:23:55.687714Z",
  "last_location_at": "2026-10-31T00:23:55.687714Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ee09391a-c206-47be-9a68-cd53e5976fd0/close` → **200**

```json
{
  "command_id": "5ca5af96-a376-4d98-a8eb-4eaaa01bdf9e",
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

Done: terminal order d7dd8352-7c31-42fb-a425-1d593d8f7c7f by Andrii (5a000000-0000-4000-8000-000000000403).

# Scenario: zz-metrics

## A search without drivers ends as UNFULFILLED

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-1071"
}
```

```json
{
  "challenge_id": "31787905-8638-4740-ae28-260c323e4626",
  "expires_at": "2026-10-31T00:29:00.834589225Z",
  "resend_available_at": "2026-10-31T00:24:01.834589225Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "711962",
  "sent_at": "2026-10-31T00:24:00.836583402Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "31787905-8638-4740-ae28-260c323e4626",
  "code": "711962",
  "device_ref": "sandbox-1071"
}
```

```json
{
  "session_id": "89aaebea-a6e5-43a0-aa24-ac53bcd71e23",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwNzE0MSwiaWF0IjoxNzkzNDA2MjQxLCJqdGkiOiJhNGYxYmMzMy03ZDY2LTQ4YWMtYjJmYy03MGRjM2U4NTg0YjQiLCJzaWQiOiI4OWFhZWJlYS1hNmU1LTQzYTAtYWEyNC1hYzUzYmNkNzFlMjMifQ.7FtYv27PPMRbewkEtkLX-S4r9D4omKc-OwwAD1p-GdQ",
  "access_expires_at": "2026-10-31T00:39:01.071502896Z",
  "refresh_token": "guH-1nKnL4xEBEs87ZWa-AIhFpoDKPIUGnVEhhoxNzM",
  "refresh_expires_at": "2026-11-30T00:24:01.071050564Z",
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
  "device_ref": "sandbox-11753"
}
```

```json
{
  "challenge_id": "8fc5c2d4-6c3e-4bec-847b-ed5b042dc1fb",
  "expires_at": "2026-10-31T00:29:01.479543345Z",
  "resend_available_at": "2026-10-31T00:24:02.479543345Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "591586",
  "sent_at": "2026-10-31T00:24:01.481385025Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8fc5c2d4-6c3e-4bec-847b-ed5b042dc1fb",
  "code": "591586",
  "device_ref": "sandbox-11753"
}
```

```json
{
  "session_id": "01c3c25a-939b-48cb-83c7-b41cda615758",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwNzE0MSwiaWF0IjoxNzkzNDA2MjQxLCJqdGkiOiIxNmJmMzNhYS1jN2M4LTRiYzYtOTU2My1lNjFhZGUxMTI0MDMiLCJzaWQiOiIwMWMzYzI1YS05MzliLTQ4Y2ItODNjNy1iNDFjZGE2MTU3NTgifQ.mZfPJau7QcHMLsWw6RByafjN9Xl6pGCU-ffO1YO0yMY",
  "access_expires_at": "2026-10-31T00:39:01.711991331Z",
  "refresh_token": "b7nyH65sVPzGZE1L1AKR8fDchLEJgupTMt10Fvq-YN4",
  "refresh_expires_at": "2026-11-30T00:24:01.711295393Z",
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
  "device_ref": "sandbox-19440"
}
```

```json
{
  "challenge_id": "0b8e8f4d-94c7-4064-a743-ae586ff19882",
  "expires_at": "2026-10-31T00:29:02.103041604Z",
  "resend_available_at": "2026-10-31T00:24:03.103041604Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "042715",
  "sent_at": "2026-10-31T00:24:02.105088613Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0b8e8f4d-94c7-4064-a743-ae586ff19882",
  "code": "042715",
  "device_ref": "sandbox-19440"
}
```

```json
{
  "session_id": "f1b4958d-d7f2-465e-b34a-2c16d0781198",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwNzE0MiwiaWF0IjoxNzkzNDA2MjQyLCJqdGkiOiJlZWZjYzRmNy0wMWE3LTQ2YjctYjI0Yi1jMmMwNDJjYzU5OGYiLCJzaWQiOiJmMWI0OTU4ZC1kN2YyLTQ2NWUtYjM0YS0yYzE2ZDA3ODExOTgifQ.M7NAVml4kCgzyq_vHWN0Fx7ydEr7sgVXlFtcIG70Sww",
  "access_expires_at": "2026-10-31T00:39:02.336700184Z",
  "refresh_token": "k2F5MvX0WIoDXJ1hkNl1QnH4iDVPalHUNBmm8nWkYHM",
  "refresh_expires_at": "2026-11-30T00:24:02.336293371Z",
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
  "phone": "+380697596544",
  "device_ref": "sandbox-1868"
}
```

```json
{
  "challenge_id": "d6c37c4b-4b06-4e1e-8bdb-c7a006b198df",
  "expires_at": "2026-10-31T00:29:02.741280385Z",
  "resend_available_at": "2026-10-31T00:24:03.741280385Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380697596544` → **200**

```json
{
  "phone": "+380697596544",
  "audience": "CLIENT",
  "code": "851600",
  "sent_at": "2026-10-31T00:24:02.74312594Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d6c37c4b-4b06-4e1e-8bdb-c7a006b198df",
  "code": "851600",
  "device_ref": "sandbox-1868"
}
```

```json
{
  "session_id": "134b74df-ad82-46f2-8b53-83b247e1a1ef",
  "subject": {
    "type": "CLIENT",
    "id": "bd997b72-98b8-4d5c-aa51-14619d9a8cfe"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiZDk5N2I3Mi05OGI4LTRkNWMtYWE1MS0xNDYxOWQ5YThjZmUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDA3MTQyLCJpYXQiOjE3OTM0MDYyNDIsImp0aSI6ImM0MjUyOWFjLTBjMzAtNGYxYi1hMDI1LTIyNjU4ZmJkMTBhZSIsInNpZCI6IjEzNGI3NGRmLWFkODItNDZmMi04YjUzLTgzYjI0N2UxYTFlZiJ9.tYW3gqw7ZStPT6IndWXAu3pA_JQefYBekmNm28mGf0o",
  "access_expires_at": "2026-10-31T00:39:02.974291719Z",
  "refresh_token": "LbGVwD1xp_DeHfbeV568GSE1lgOjYCLbEdr_DHSryVQ",
  "refresh_expires_at": "2026-11-30T00:24:02.973117129Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "da1b13f0-98a5-4eb2-bbcd-33c9bcd93425",
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
  "id": "214da271-c6d9-4af9-b82a-9dadd95f7ff4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T00:29:03.186943Z",
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
  "command_id": "db40244e-4064-4eea-aab9-fbe8d95bf0b0",
  "quote_id": "214da271-c6d9-4af9-b82a-9dadd95f7ff4",
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
  "id": "70afe310-103a-4259-a751-ffc208277fb3",
  "short_number": 40,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bd997b72-98b8-4d5c-aa51-14619d9a8cfe",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T00:24:03.40628Z",
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

`GET /api/rider/v1/orders/70afe310-103a-4259-a751-ffc208277fb3` → **200**

```json
{
  "id": "70afe310-103a-4259-a751-ffc208277fb3",
  "short_number": 40,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bd997b72-98b8-4d5c-aa51-14619d9a8cfe",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T00:24:03.40628Z",
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

`GET /api/rider/v1/orders/70afe310-103a-4259-a751-ffc208277fb3` → **200**

```json
{
  "id": "70afe310-103a-4259-a751-ffc208277fb3",
  "short_number": 40,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bd997b72-98b8-4d5c-aa51-14619d9a8cfe",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T00:24:03.40628Z",
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

`GET /api/rider/v1/orders/70afe310-103a-4259-a751-ffc208277fb3` → **200**

```json
{
  "id": "70afe310-103a-4259-a751-ffc208277fb3",
  "short_number": 40,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bd997b72-98b8-4d5c-aa51-14619d9a8cfe",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T00:24:03.40628Z",
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

`GET /api/rider/v1/orders/70afe310-103a-4259-a751-ffc208277fb3` → **200**

```json
{
  "id": "70afe310-103a-4259-a751-ffc208277fb3",
  "short_number": 40,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bd997b72-98b8-4d5c-aa51-14619d9a8cfe",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T00:24:03.40628Z",
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

`GET /api/rider/v1/orders/70afe310-103a-4259-a751-ffc208277fb3` → **200**

```json
{
  "id": "70afe310-103a-4259-a751-ffc208277fb3",
  "short_number": 40,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bd997b72-98b8-4d5c-aa51-14619d9a8cfe",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T00:24:03.40628Z",
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

`GET /api/rider/v1/orders/70afe310-103a-4259-a751-ffc208277fb3` → **200**

```json
{
  "id": "70afe310-103a-4259-a751-ffc208277fb3",
  "short_number": 40,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bd997b72-98b8-4d5c-aa51-14619d9a8cfe",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T00:24:03.40628Z",
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

`GET /api/rider/v1/orders/70afe310-103a-4259-a751-ffc208277fb3` → **200**

```json
{
  "id": "70afe310-103a-4259-a751-ffc208277fb3",
  "short_number": 40,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bd997b72-98b8-4d5c-aa51-14619d9a8cfe",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T00:24:03.40628Z",
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

`GET /api/rider/v1/orders/70afe310-103a-4259-a751-ffc208277fb3` → **200**

```json
{
  "id": "70afe310-103a-4259-a751-ffc208277fb3",
  "short_number": 40,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bd997b72-98b8-4d5c-aa51-14619d9a8cfe",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T00:24:03.40628Z",
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

`GET /api/rider/v1/orders/70afe310-103a-4259-a751-ffc208277fb3` → **200**

```json
{
  "id": "70afe310-103a-4259-a751-ffc208277fb3",
  "short_number": 40,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bd997b72-98b8-4d5c-aa51-14619d9a8cfe",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T00:24:03.40628Z",
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

`GET /api/rider/v1/orders/70afe310-103a-4259-a751-ffc208277fb3` → **200**

```json
{
  "id": "70afe310-103a-4259-a751-ffc208277fb3",
  "short_number": 40,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bd997b72-98b8-4d5c-aa51-14619d9a8cfe",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T00:24:03.40628Z",
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

`GET /api/rider/v1/orders/70afe310-103a-4259-a751-ffc208277fb3` → **200**

```json
{
  "id": "70afe310-103a-4259-a751-ffc208277fb3",
  "short_number": 40,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bd997b72-98b8-4d5c-aa51-14619d9a8cfe",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T00:24:03.40628Z",
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

`GET /api/rider/v1/orders/70afe310-103a-4259-a751-ffc208277fb3` → **200**

```json
{
  "id": "70afe310-103a-4259-a751-ffc208277fb3",
  "short_number": 40,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bd997b72-98b8-4d5c-aa51-14619d9a8cfe",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T00:24:03.40628Z",
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

`GET /api/rider/v1/orders/70afe310-103a-4259-a751-ffc208277fb3` → **200**

```json
{
  "id": "70afe310-103a-4259-a751-ffc208277fb3",
  "short_number": 40,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bd997b72-98b8-4d5c-aa51-14619d9a8cfe",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T00:24:03.40628Z",
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

`GET /api/rider/v1/orders/70afe310-103a-4259-a751-ffc208277fb3` → **200**

```json
{
  "id": "70afe310-103a-4259-a751-ffc208277fb3",
  "short_number": 40,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bd997b72-98b8-4d5c-aa51-14619d9a8cfe",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T00:24:03.40628Z",
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

`GET /api/rider/v1/orders/70afe310-103a-4259-a751-ffc208277fb3` → **200**

```json
{
  "id": "70afe310-103a-4259-a751-ffc208277fb3",
  "short_number": 40,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bd997b72-98b8-4d5c-aa51-14619d9a8cfe",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T00:24:03.40628Z",
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

`GET /api/rider/v1/orders/70afe310-103a-4259-a751-ffc208277fb3` → **200**

```json
{
  "id": "70afe310-103a-4259-a751-ffc208277fb3",
  "short_number": 40,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bd997b72-98b8-4d5c-aa51-14619d9a8cfe",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T00:24:03.40628Z",
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

`GET /api/rider/v1/orders/70afe310-103a-4259-a751-ffc208277fb3` → **200**

```json
{
  "id": "70afe310-103a-4259-a751-ffc208277fb3",
  "short_number": 40,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bd997b72-98b8-4d5c-aa51-14619d9a8cfe",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T00:24:03.40628Z",
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

`GET /api/rider/v1/orders/70afe310-103a-4259-a751-ffc208277fb3` → **200**

```json
{
  "id": "70afe310-103a-4259-a751-ffc208277fb3",
  "short_number": 40,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bd997b72-98b8-4d5c-aa51-14619d9a8cfe",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T00:24:03.40628Z",
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

`GET /api/rider/v1/orders/70afe310-103a-4259-a751-ffc208277fb3` → **200**

```json
{
  "id": "70afe310-103a-4259-a751-ffc208277fb3",
  "short_number": 40,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bd997b72-98b8-4d5c-aa51-14619d9a8cfe",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T00:24:03.40628Z",
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

`GET /api/rider/v1/orders/70afe310-103a-4259-a751-ffc208277fb3` → **200**

```json
{
  "id": "70afe310-103a-4259-a751-ffc208277fb3",
  "short_number": 40,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bd997b72-98b8-4d5c-aa51-14619d9a8cfe",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T00:24:03.40628Z",
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

`GET /api/rider/v1/orders/70afe310-103a-4259-a751-ffc208277fb3` → **200**

```json
{
  "id": "70afe310-103a-4259-a751-ffc208277fb3",
  "short_number": 40,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bd997b72-98b8-4d5c-aa51-14619d9a8cfe",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T00:24:03.40628Z",
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

`GET /api/rider/v1/orders/70afe310-103a-4259-a751-ffc208277fb3` → **200**

```json
{
  "id": "70afe310-103a-4259-a751-ffc208277fb3",
  "short_number": 40,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bd997b72-98b8-4d5c-aa51-14619d9a8cfe",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T00:24:03.40628Z",
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

`GET /api/rider/v1/orders/70afe310-103a-4259-a751-ffc208277fb3` → **200**

```json
{
  "id": "70afe310-103a-4259-a751-ffc208277fb3",
  "short_number": 40,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bd997b72-98b8-4d5c-aa51-14619d9a8cfe",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T00:24:03.40628Z",
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

`GET /api/rider/v1/orders/70afe310-103a-4259-a751-ffc208277fb3` → **200**

```json
{
  "id": "70afe310-103a-4259-a751-ffc208277fb3",
  "short_number": 40,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bd997b72-98b8-4d5c-aa51-14619d9a8cfe",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T00:24:03.40628Z",
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

`GET /api/rider/v1/orders/70afe310-103a-4259-a751-ffc208277fb3` → **200**

```json
{
  "id": "70afe310-103a-4259-a751-ffc208277fb3",
  "short_number": 40,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bd997b72-98b8-4d5c-aa51-14619d9a8cfe",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T00:24:03.40628Z",
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

`GET /api/rider/v1/orders/70afe310-103a-4259-a751-ffc208277fb3` → **200**

```json
{
  "id": "70afe310-103a-4259-a751-ffc208277fb3",
  "short_number": 40,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bd997b72-98b8-4d5c-aa51-14619d9a8cfe",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T00:24:03.40628Z",
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

`GET /api/rider/v1/orders/70afe310-103a-4259-a751-ffc208277fb3` → **200**

```json
{
  "id": "70afe310-103a-4259-a751-ffc208277fb3",
  "short_number": 40,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bd997b72-98b8-4d5c-aa51-14619d9a8cfe",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T00:24:03.40628Z",
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

`GET /api/rider/v1/orders/70afe310-103a-4259-a751-ffc208277fb3` → **200**

```json
{
  "id": "70afe310-103a-4259-a751-ffc208277fb3",
  "short_number": 40,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bd997b72-98b8-4d5c-aa51-14619d9a8cfe",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T00:24:03.40628Z",
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

`GET /api/rider/v1/orders/70afe310-103a-4259-a751-ffc208277fb3` → **200**

```json
{
  "id": "70afe310-103a-4259-a751-ffc208277fb3",
  "short_number": 40,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bd997b72-98b8-4d5c-aa51-14619d9a8cfe",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T00:24:03.40628Z",
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

`GET /api/rider/v1/orders/70afe310-103a-4259-a751-ffc208277fb3` → **200**

```json
{
  "id": "70afe310-103a-4259-a751-ffc208277fb3",
  "short_number": 40,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bd997b72-98b8-4d5c-aa51-14619d9a8cfe",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T00:24:03.40628Z",
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

`GET /api/rider/v1/orders/70afe310-103a-4259-a751-ffc208277fb3` → **200**

```json
{
  "id": "70afe310-103a-4259-a751-ffc208277fb3",
  "short_number": 40,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bd997b72-98b8-4d5c-aa51-14619d9a8cfe",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T00:24:03.40628Z",
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

`GET /api/rider/v1/orders/70afe310-103a-4259-a751-ffc208277fb3` → **200**

```json
{
  "id": "70afe310-103a-4259-a751-ffc208277fb3",
  "short_number": 40,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bd997b72-98b8-4d5c-aa51-14619d9a8cfe",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T00:24:03.40628Z",
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

`GET /api/rider/v1/orders/70afe310-103a-4259-a751-ffc208277fb3` → **200**

```json
{
  "id": "70afe310-103a-4259-a751-ffc208277fb3",
  "short_number": 40,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bd997b72-98b8-4d5c-aa51-14619d9a8cfe",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T00:24:03.40628Z",
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

`GET /api/rider/v1/orders/70afe310-103a-4259-a751-ffc208277fb3` → **200**

```json
{
  "id": "70afe310-103a-4259-a751-ffc208277fb3",
  "short_number": 40,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bd997b72-98b8-4d5c-aa51-14619d9a8cfe",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T00:24:03.40628Z",
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

`GET /api/rider/v1/orders/70afe310-103a-4259-a751-ffc208277fb3` → **200**

```json
{
  "id": "70afe310-103a-4259-a751-ffc208277fb3",
  "short_number": 40,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bd997b72-98b8-4d5c-aa51-14619d9a8cfe",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T00:24:03.40628Z",
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

`GET /api/rider/v1/orders/70afe310-103a-4259-a751-ffc208277fb3` → **200**

```json
{
  "id": "70afe310-103a-4259-a751-ffc208277fb3",
  "short_number": 40,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "bd997b72-98b8-4d5c-aa51-14619d9a8cfe",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T00:24:03.40628Z",
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

## All eight metrics are non-zero, with closed labels and no ids/phones
Metric validator: good scrape accepted; missing, unknown, id/phone, extra, zero and NaN rejected
{
  "blizz_orders_total": 40,
  "blizz_orders_cancelled_total": 25,
  "blizz_orders_unfulfilled_total": 1,
  "blizz_dispatch_first_offer_seconds_count": 27,
  "blizz_dispatch_assigned_seconds_count": 25,
  "blizz_offers_total": 31,
  "blizz_dispatch_excluded_total": 19,
  "blizz_sms_sent_total": 99
}

```prometheus
blizz_dispatch_assigned_seconds_count{application="blizz-taxi-server",source="BROADCAST"} 1
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="BROADCAST"} 7.866604124
blizz_dispatch_assigned_seconds_count{application="blizz-taxi-server",source="OFFER"} 24
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="OFFER"} 21.870934583
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
blizz_dispatch_first_offer_seconds_count{application="blizz-taxi-server"} 27
blizz_dispatch_first_offer_seconds_sum{application="blizz-taxi-server"} 1.771277907
blizz_dispatch_first_offer_seconds_max{application="blizz-taxi-server"} 0.0
blizz_offers_total{application="blizz-taxi-server",outcome="ACCEPTED"} 24.0
blizz_offers_total{application="blizz-taxi-server",outcome="DECLINED"} 2.0
blizz_offers_total{application="blizz-taxi-server",outcome="REVOKED"} 5.0
blizz_orders_total{application="blizz-taxi-server",channel="APP",preorder="false"} 32.0
blizz_orders_total{application="blizz-taxi-server",channel="APP",preorder="true"} 2.0
blizz_orders_total{application="blizz-taxi-server",channel="PHONE",preorder="false"} 6.0
blizz_orders_cancelled_total{application="blizz-taxi-server",by="DRIVER",reason="PASSENGER_ASKED"} 2.0
blizz_orders_cancelled_total{application="blizz-taxi-server",by="RIDER",reason="CHANGED_MIND"} 7.0
blizz_orders_cancelled_total{application="blizz-taxi-server",by="RIDER",reason="WAIT_TOO_LONG"} 1.0
blizz_orders_cancelled_total{application="blizz-taxi-server",by="STAFF",reason="NO_CARS"} 13.0
blizz_orders_cancelled_total{application="blizz-taxi-server",by="STAFF",reason="OTHER"} 2.0
blizz_orders_unfulfilled_total{application="blizz-taxi-server"} 1.0
blizz_sms_sent_total{application="blizz-taxi-server",purpose="CALLER",state="SENT"} 6.0
blizz_sms_sent_total{application="blizz-taxi-server",purpose="OTP",state="FAILED"} 1.0
blizz_sms_sent_total{application="blizz-taxi-server",purpose="OTP",state="SENT"} 92.0
```

Done: real no-car deadline, non-zero counters/timers and bounded labels on the management port.

`GET /api/rider/v1/orders/70afe310-103a-4259-a751-ffc208277fb3` → **200**

```json
{
  "id": "70afe310-103a-4259-a751-ffc208277fb3",
  "short_number": 40,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "bd997b72-98b8-4d5c-aa51-14619d9a8cfe",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T00:24:03.40628Z",
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
  "session_id": "45972c0e-5760-481f-9602-fb2d1ee04bf7",
  "subject": {
    "type": "STAFF",
    "id": "2a3afaa3-e140-4771-8de7-2ab6b356cb06"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYTNhZmFhMy1lMTQwLTQ3NzEtOGRlNy0yYWI2YjM1NmNiMDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDczMjcsImlhdCI6MTc5MzQwNjQyNywianRpIjoiMTUwZTZjZmQtYmZiZS00NzdiLTg3ZGMtZWMxMzIzNWJkMjAxIiwic2lkIjoiNDU5NzJjMGUtNTc2MC00ODFmLTk2MDItZmIyZDFlZTA0YmY3In0.VR8mJsVxl4RhPX2QnLJsBbpxRSQI1gwEaaaGV3aCvxM",
  "access_expires_at": "2026-10-31T00:42:07.395575429Z",
  "refresh_token": "topYJGANusX40POXNdfYk0mh_f6l8RlmyJ7fWA7etDg",
  "refresh_expires_at": "2026-10-31T12:27:07.395123227Z",
  "password_change_required": false
}
```

## The earlier card flows reconcile cleanly without moving money

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-31"
}
```

```json
{
  "id": "4e2ad6a7-2bab-428c-8c5e-824a37358db4",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-31",
  "period_from": "2026-10-30T22:00:00Z",
  "period_to": "2026-11-01T02:00:00Z",
  "observed_until": "2026-10-31T00:27:07.627435Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-31T00:27:07.627495Z",
  "updated_at": "2026-10-31T00:27:07.640011Z",
  "finished_at": "2026-10-31T00:27:07.640011Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/4e2ad6a7-2bab-428c-8c5e-824a37358db4` → **200**

```json
{
  "run": {
    "id": "4e2ad6a7-2bab-428c-8c5e-824a37358db4",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "day": "2026-10-31",
    "period_from": "2026-10-30T22:00:00Z",
    "period_to": "2026-11-01T02:00:00Z",
    "observed_until": "2026-10-31T00:27:07.627435Z",
    "partial": true,
    "state": "CLEAN",
    "local_count": 10,
    "provider_count": 10,
    "item_count": 0,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-31T00:27:07.627495Z",
    "updated_at": "2026-10-31T00:27:07.640011Z",
    "finished_at": "2026-10-31T00:27:07.640011Z",
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
  "day": "2026-10-31"
}
```

```json
{
  "id": "4e2ad6a7-2bab-428c-8c5e-824a37358db4",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-31",
  "period_from": "2026-10-30T22:00:00Z",
  "period_to": "2026-11-01T02:00:00Z",
  "observed_until": "2026-10-31T00:27:07.627435Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-31T00:27:07.627495Z",
  "updated_at": "2026-10-31T00:27:07.640011Z",
  "finished_at": "2026-10-31T00:27:07.640011Z",
  "version": 1
}
```

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-31"
}
```

```json
{
  "id": "4e2ad6a7-2bab-428c-8c5e-824a37358db4",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-31",
  "period_from": "2026-10-30T22:00:00Z",
  "period_to": "2026-11-01T02:00:00Z",
  "observed_until": "2026-10-31T00:27:07.627435Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-31T00:27:07.627495Z",
  "updated_at": "2026-10-31T00:27:07.640011Z",
  "finished_at": "2026-10-31T00:27:07.640011Z",
  "version": 1
}
```

## One independent bank transaction produces one missing-local item on another merchant's first snapshot

`POST /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/5c44cdb7-e168-4e58-98f2-1978db14a75f` → **204**

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
  "day": "2026-10-31"
}
```

```json
{
  "id": "abd32c97-92ac-4e6d-b2ca-3b1b08d7c5da",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-31",
  "period_from": "2026-10-30T22:00:00Z",
  "period_to": "2026-11-01T02:00:00Z",
  "observed_until": "2026-10-31T00:27:07.987261Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-31T00:27:07.987305Z",
  "updated_at": "2026-10-31T00:27:07.994303Z",
  "finished_at": "2026-10-31T00:27:07.994303Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/abd32c97-92ac-4e6d-b2ca-3b1b08d7c5da` → **200**

```json
{
  "run": {
    "id": "abd32c97-92ac-4e6d-b2ca-3b1b08d7c5da",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-31",
    "period_from": "2026-10-30T22:00:00Z",
    "period_to": "2026-11-01T02:00:00Z",
    "observed_until": "2026-10-31T00:27:07.987261Z",
    "partial": true,
    "state": "OPEN",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 1,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-31T00:27:07.987305Z",
    "updated_at": "2026-10-31T00:27:07.994303Z",
    "finished_at": "2026-10-31T00:27:07.994303Z",
    "version": 1
  },
  "items": [
    {
      "id": "07a32b10-84e6-47d0-aa97-17afb8422311",
      "run_id": "abd32c97-92ac-4e6d-b2ca-3b1b08d7c5da",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "d9e66513fc44c2d3a4a7a8cc76896af16c9ff5ced93f9610281fd96623207d76",
      "reference_display": "sandbox-reconciliation-5c44cdb7-e168-4e58-98f2-1978db14a75f",
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
      "provider_at": "2026-10-31T00:27:07Z",
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
  "day": "2026-10-31"
}
```

```json
{
  "id": "abd32c97-92ac-4e6d-b2ca-3b1b08d7c5da",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-31",
  "period_from": "2026-10-30T22:00:00Z",
  "period_to": "2026-11-01T02:00:00Z",
  "observed_until": "2026-10-31T00:27:07.987261Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-31T00:27:07.987305Z",
  "updated_at": "2026-10-31T00:27:07.994303Z",
  "finished_at": "2026-10-31T00:27:07.994303Z",
  "version": 1
}
```

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-31"
}
```

```json
{
  "id": "abd32c97-92ac-4e6d-b2ca-3b1b08d7c5da",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-31",
  "period_from": "2026-10-30T22:00:00Z",
  "period_to": "2026-11-01T02:00:00Z",
  "observed_until": "2026-10-31T00:27:07.987261Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-31T00:27:07.987305Z",
  "updated_at": "2026-10-31T00:27:07.994303Z",
  "finished_at": "2026-10-31T00:27:07.994303Z",
  "version": 1
}
```

## The admin explains the item once; a replay is the same result and a different decision conflicts

`POST /api/admin/v1/payment-reconciliations/items/07a32b10-84e6-47d0-aa97-17afb8422311/resolve` → **200**

```json
{
  "command_id": "a2ee0a71-9506-4807-ba58-42291390c9e1",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "07a32b10-84e6-47d0-aa97-17afb8422311",
  "run_id": "abd32c97-92ac-4e6d-b2ca-3b1b08d7c5da",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "d9e66513fc44c2d3a4a7a8cc76896af16c9ff5ced93f9610281fd96623207d76",
  "reference_display": "sandbox-reconciliation-5c44cdb7-e168-4e58-98f2-1978db14a75f",
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
  "provider_at": "2026-10-31T00:27:07Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "2a3afaa3-e140-4771-8de7-2ab6b356cb06",
  "resolved_at": "2026-10-31T00:27:08.32243Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/07a32b10-84e6-47d0-aa97-17afb8422311/resolve` → **200**

```json
{
  "command_id": "a2ee0a71-9506-4807-ba58-42291390c9e1",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "07a32b10-84e6-47d0-aa97-17afb8422311",
  "run_id": "abd32c97-92ac-4e6d-b2ca-3b1b08d7c5da",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "d9e66513fc44c2d3a4a7a8cc76896af16c9ff5ced93f9610281fd96623207d76",
  "reference_display": "sandbox-reconciliation-5c44cdb7-e168-4e58-98f2-1978db14a75f",
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
  "provider_at": "2026-10-31T00:27:07Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "2a3afaa3-e140-4771-8de7-2ab6b356cb06",
  "resolved_at": "2026-10-31T00:27:08.32243Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/07a32b10-84e6-47d0-aa97-17afb8422311/resolve` → **409**

```json
{
  "command_id": "ea5292a8-4d70-49d2-95dc-484a858fc7fe",
  "expected_version": 1,
  "decision": "ESCALATED",
  "reason": "A conflicting second decision"
}
```

```json
{
  "instance": "/api/admin/v1/payment-reconciliations/items/07a32b10-84e6-47d0-aa97-17afb8422311/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "d0149a01-ea8c-40d2-9cb4-faa90c8dd271"
}
```

`GET /api/admin/v1/payment-reconciliations/abd32c97-92ac-4e6d-b2ca-3b1b08d7c5da` → **200**

```json
{
  "run": {
    "id": "abd32c97-92ac-4e6d-b2ca-3b1b08d7c5da",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-31",
    "period_from": "2026-10-30T22:00:00Z",
    "period_to": "2026-11-01T02:00:00Z",
    "observed_until": "2026-10-31T00:27:07.987261Z",
    "partial": true,
    "state": "RESOLVED",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-31T00:27:07.987305Z",
    "updated_at": "2026-10-31T00:27:08.32243Z",
    "finished_at": "2026-10-31T00:27:07.994303Z",
    "version": 2
  },
  "items": [
    {
      "id": "07a32b10-84e6-47d0-aa97-17afb8422311",
      "run_id": "abd32c97-92ac-4e6d-b2ca-3b1b08d7c5da",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "d9e66513fc44c2d3a4a7a8cc76896af16c9ff5ced93f9610281fd96623207d76",
      "reference_display": "sandbox-reconciliation-5c44cdb7-e168-4e58-98f2-1978db14a75f",
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
      "provider_at": "2026-10-31T00:27:07Z",
      "state": "RESOLVED",
      "decision": "EXPLAINED",
      "reason": "Independent sandbox bank fixture; no real money moved",
      "resolved_by": "2a3afaa3-e140-4771-8de7-2ab6b356cb06",
      "resolved_at": "2026-10-31T00:27:08.32243Z",
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
      "id": "abd32c97-92ac-4e6d-b2ca-3b1b08d7c5da",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-31",
      "period_from": "2026-10-30T22:00:00Z",
      "period_to": "2026-11-01T02:00:00Z",
      "observed_until": "2026-10-31T00:27:07.987261Z",
      "partial": true,
      "state": "RESOLVED",
      "local_count": 0,
      "provider_count": 1,
      "item_count": 1,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-31T00:27:07.987305Z",
      "updated_at": "2026-10-31T00:27:08.32243Z",
      "finished_at": "2026-10-31T00:27:07.994303Z",
      "version": 2
    },
    {
      "id": "e0dd3272-c90c-462e-960f-cd769d3674b0",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-29",
      "period_from": "2026-10-28T22:00:00Z",
      "period_to": "2026-10-30T02:00:00Z",
      "observed_until": "2026-10-31T00:04:52.405193Z",
      "partial": false,
      "state": "CLEAN",
      "local_count": 0,
      "provider_count": 0,
      "item_count": 0,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-31T00:04:52.405257Z",
      "updated_at": "2026-10-31T00:04:52.408992Z",
      "finished_at": "2026-10-31T00:04:52.408992Z",
      "version": 1
    }
  ],
  "next_cursor": null
}
```

`DELETE /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/5c44cdb7-e168-4e58-98f2-1978db14a75f` → **204**

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-31"
}
```

```json
{
  "id": "abd32c97-92ac-4e6d-b2ca-3b1b08d7c5da",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-31",
  "period_from": "2026-10-30T22:00:00Z",
  "period_to": "2026-11-01T02:00:00Z",
  "observed_until": "2026-10-31T00:27:07.987261Z",
  "partial": true,
  "state": "RESOLVED",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-31T00:27:07.987305Z",
  "updated_at": "2026-10-31T00:27:08.32243Z",
  "finished_at": "2026-10-31T00:27:07.994303Z",
  "version": 2
}
```

Done: clean card snapshot, one bank-only difference, three identical runs, audited decision/replay/conflict, bank fixture restored.

# Scenario: zzz-invariants

## Five invariant checks are clean after all scenario transactions settle

```prometheus
blizz_invariant_last_success{application="blizz-taxi-server",check="I1"} 1.793406552749E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I2"} 1.793406553021E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I3"} 1.793406553022E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I4"} 1.793406552749E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I5"} 1.793406553023E9
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
  "phone": "+380681482600",
  "device_ref": "sandbox-7282"
}
```

```json
{
  "challenge_id": "a009cd1c-ec91-422b-9b14-04e51a9ef4cb",
  "expires_at": "2026-10-31T00:34:16.092951215Z",
  "resend_available_at": "2026-10-31T00:29:17.092951215Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380681482600` → **200**

```json
{
  "phone": "+380681482600",
  "audience": "CLIENT",
  "code": "604353",
  "sent_at": "2026-10-31T00:29:16.0951412Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a009cd1c-ec91-422b-9b14-04e51a9ef4cb",
  "code": "604353",
  "device_ref": "sandbox-7282"
}
```

```json
{
  "session_id": "2a0432a2-adc0-44e2-bfa9-5518b8b9e98c",
  "subject": {
    "type": "CLIENT",
    "id": "bdf76d55-6e0a-4f70-861f-eacea015b16e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiZGY3NmQ1NS02ZTBhLTRmNzAtODYxZi1lYWNlYTAxNWIxNmUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDA3NDU2LCJpYXQiOjE3OTM0MDY1NTYsImp0aSI6IjgwM2E4MDgyLWZmMTYtNGExYy1hOTA5LTM3NTRlOTk2NjM5MSIsInNpZCI6IjJhMDQzMmEyLWFkYzAtNDRlMi1iZmE5LTU1MThiOGI5ZTk4YyJ9.eRx1sM1EJwxHCb-Hvv2R7mw_w5qyfT1Ywfze7gHUJUI",
  "access_expires_at": "2026-10-31T00:44:16.33061109Z",
  "refresh_token": "HBx1D_ptIOnbOwfhs5gJegQcxTcj5M7vK6XHqnflbAQ",
  "refresh_expires_at": "2026-11-30T00:29:16.330083978Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "bdf76d55-6e0a-4f70-861f-eacea015b16e",
  "session_id": "2a0432a2-adc0-44e2-bfa9-5518b8b9e98c",
  "account_state": "ACTIVE"
}
```

## Back up the database (deploy/backup.sh)
Backed up blizz to blizz.dump (580K)

## After the backup the rider deletes the account and staff complete it

`POST /api/rider/v1/me/deletion-request/challenge` → **201**

```json
{
  "challenge_id": "b3f2aff4-fcc8-40a8-9a69-ccba9da898f7",
  "expires_at": "2026-10-31T00:34:19.15696201Z",
  "resend_available_at": "2026-10-31T00:29:20.15696201Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380681482600` → **200**

```json
{
  "phone": "+380681482600",
  "audience": "CLIENT",
  "code": "948482",
  "sent_at": "2026-10-31T00:29:19.159591326Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "0394ca4d-feaf-436b-a746-fa0dec2df4ce",
  "challenge_id": "b3f2aff4-fcc8-40a8-9a69-ccba9da898f7",
  "otp_code": "948482"
}
```

```json
{
  "client_id": "bdf76d55-6e0a-4f70-861f-eacea015b16e",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-31T00:29:19.423173508Z"
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
  "session_id": "605b505c-3810-426c-96dc-945d757bd6a6",
  "subject": {
    "type": "STAFF",
    "id": "2a3afaa3-e140-4771-8de7-2ab6b356cb06"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYTNhZmFhMy1lMTQwLTQ3NzEtOGRlNy0yYWI2YjM1NmNiMDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDc0NTksImlhdCI6MTc5MzQwNjU1OSwianRpIjoiMWE3MGJlYWMtZjBkZC00MWU1LTk2YzItNjE1YWM1OTFkYzBhIiwic2lkIjoiNjA1YjUwNWMtMzgxMC00MjZjLTk2ZGMtOTQ1ZDc1N2JkNmE2In0.9cHEkQVlAwpqf5DmT-fmHo_7vlrIgQbqwHtH7NC6Eow",
  "access_expires_at": "2026-10-31T00:44:19.877593363Z",
  "refresh_token": "vWcjdvNQpCSbcWWmCFzUaGqxoQCZqRp23HxAQpV5mwo",
  "refresh_expires_at": "2026-10-31T12:29:19.877167411Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/client-deletions/bdf76d55-6e0a-4f70-861f-eacea015b16e/complete` → **200**

```json
{
  "command_id": "8d48d4b8-67c7-475d-a8ce-1c40e45dd88e",
  "reason": "Sandbox: backup and restore check"
}
```

```json
{
  "client_id": "bdf76d55-6e0a-4f70-861f-eacea015b16e",
  "account_state": "ANONYMIZED"
}
```

## Restore into an empty database (deploy/restore.sh); over data it refuses
Restored blizz.dump into blizz_restored: 104 migrations applied. Start the server on it with the same ERASURE_JOURNAL_DIR.
Database blizz_restored is not empty (113 tables): restore only into an empty database

In the restored database before the server starts: `ACTIVE +380681482600` (the backup predates the deletion).

## Start the server on the restored database with the same journal: the deletion is applied again

After the start: `ANONYMIZED -`.

Done: backup, restore into an empty database, start on it; the deleted rider stayed deleted (T-39).
