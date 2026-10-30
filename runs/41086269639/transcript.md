# Sandbox transcript (2026-10-30T16:03:43Z, 02efddb)

# Scenario: admission-cities

## Only Andrii is online in Kyiv for this scenario

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-7183"
}
```

```json
{
  "challenge_id": "1714b5c6-52f3-4125-9e91-60bf8c501e70",
  "expires_at": "2026-10-30T16:08:43.911168168Z",
  "resend_available_at": "2026-10-30T16:03:44.911168168Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "487141",
  "sent_at": "2026-10-30T16:03:43.925436394Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1714b5c6-52f3-4125-9e91-60bf8c501e70",
  "code": "487141",
  "device_ref": "sandbox-7183"
}
```

```json
{
  "session_id": "a50a18b2-af35-459b-92ae-c1c27293543d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NzEzMCwiaWF0IjoxNzkzMzc2MjMwLCJqdGkiOiJkOTQ2MDU1MC0xOTJiLTRlNDUtYjk1Mi1jNTQ0ZGRiOTUwZTMiLCJzaWQiOiJhNTBhMThiMi1hZjM1LTQ1OWItOTJhZS1jMWMyNzI5MzU0M2QifQ.QipzieHcydETNCp9Aymkkzbkuv8q5T3VMlpFvQ7PmiE",
  "access_expires_at": "2026-10-30T16:18:50.8466531Z",
  "refresh_token": "bFUZXhy6FvhXWhMtTJZhOJYKah-0UsLOviIthvvmg-U",
  "refresh_expires_at": "2026-11-29T16:03:50.844142854Z",
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
  "device_ref": "sandbox-3251"
}
```

```json
{
  "challenge_id": "fafac925-4e7d-4c91-8db0-40835c405720",
  "expires_at": "2026-10-30T16:08:51.452112599Z",
  "resend_available_at": "2026-10-30T16:03:52.452112599Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "396267",
  "sent_at": "2026-10-30T16:03:51.458503766Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fafac925-4e7d-4c91-8db0-40835c405720",
  "code": "396267",
  "device_ref": "sandbox-3251"
}
```

```json
{
  "session_id": "95ef5c36-cb9f-4718-a5d8-9040b8e66958",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NzEzMSwiaWF0IjoxNzkzMzc2MjMxLCJqdGkiOiJkZWU5YmEzZS0xNWM5LTQyZDQtYThjNy00NTc5MmVkYTBlMDMiLCJzaWQiOiI5NWVmNWMzNi1jYjlmLTQ3MTgtYTVkOC05MDQwYjhlNjY5NTgifQ.IAjDBVeDocMwZoPK3LBkmq4-BX3WO3syWCzOMbc_nRw",
  "access_expires_at": "2026-10-30T16:18:51.756169686Z",
  "refresh_token": "LxEpbUMkg1vZweVAbPznRkKNAw1eVOSDXBNQ7wGASAU",
  "refresh_expires_at": "2026-11-29T16:03:51.755196374Z",
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
  "correlation_id": "60eddc6b-d6f3-432e-a30a-f341b7044547"
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
  "session_id": "1ff70515-d9fb-4925-a56b-dc05e0c43fcb",
  "subject": {
    "type": "STAFF",
    "id": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NTM4N2IzNC1lN2M5LTRhZmYtOTNjMS0wZGQzZjJhY2QwOGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzcxMzMsImlhdCI6MTc5MzM3NjIzMywianRpIjoiMTAzYWRkZmUtNjI0NS00ZWFmLThiZDktNjliMjI3NmQ2ZGY3Iiwic2lkIjoiMWZmNzA1MTUtZDlmYi00OTI1LWE1NmItZGMwNWUwYzQzZmNiIn0.i69XhCz56UBe5PylBD2HurIuaxvvaMfDQ0o34cnJnoc",
  "access_expires_at": "2026-10-30T16:18:53.194890903Z",
  "refresh_token": "0Z7dH7E2V0UeyEG-OKuxbCJEIWnus4J5QoShAaUY-F8",
  "refresh_expires_at": "2026-10-31T04:03:53.193874904Z",
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
  "session_id": "d502435c-ad14-4c4c-bb4c-ee268b609aba",
  "subject": {
    "type": "STAFF",
    "id": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NTM4N2IzNC1lN2M5LTRhZmYtOTNjMS0wZGQzZjJhY2QwOGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzcxMzUsImlhdCI6MTc5MzM3NjIzNSwianRpIjoiY2EyYWI3MzItZGM1Mi00MTU1LTlmYjktNWE0YjMzNWY5ZjdlIiwic2lkIjoiZDUwMjQzNWMtYWQxNC00YzRjLWJiNGMtZWUyNjhiNjA5YWJhIn0.eEPi4WHq_JSG_evrpdTv8epmCegHIQtrugTFGAGdgdk",
  "access_expires_at": "2026-10-30T16:18:55.024903086Z",
  "refresh_token": "bGAzInk6rmYQxyX4Vtb3cXkJ2HEjDY_hbJfXvM56nUA",
  "refresh_expires_at": "2026-10-31T04:03:55.023699213Z",
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
  "session_id": "67c72436-5ac7-4663-a6df-3c8d40fbbd69",
  "subject": {
    "type": "STAFF",
    "id": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NTM4N2IzNC1lN2M5LTRhZmYtOTNjMS0wZGQzZjJhY2QwOGYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzcxMzUsImlhdCI6MTc5MzM3NjIzNSwianRpIjoiZWVmOTAxZjMtNGFjYS00YjBjLWFlODItYWJmNDg5NGE4YjBjIiwic2lkIjoiNjdjNzI0MzYtNWFjNy00NjYzLWE2ZGYtM2M4ZDQwZmJiZDY5In0.-oqpUCR1kxfvhGyq11r9ssR9kseLrzTTEyADz97hHOY",
  "access_expires_at": "2026-10-30T16:18:55.594232951Z",
  "refresh_token": "iCyp2Gh5wtkp0L-mWFxL082Fk9M5Jak9R0OmKIWAXPE",
  "refresh_expires_at": "2026-10-31T04:03:55.592994924Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-25948"
}
```

```json
{
  "challenge_id": "200832f2-a979-4818-a69e-c4a15d55fcac",
  "expires_at": "2026-10-30T16:08:55.85507098Z",
  "resend_available_at": "2026-10-30T16:03:56.85507098Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "477566",
  "sent_at": "2026-10-30T16:03:55.86031386Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "200832f2-a979-4818-a69e-c4a15d55fcac",
  "code": "477566",
  "device_ref": "sandbox-25948"
}
```

```json
{
  "session_id": "09e13524-f1ba-44cb-a94b-74e73eecb920",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NzEzNiwiaWF0IjoxNzkzMzc2MjM2LCJqdGkiOiIxZTVjODk3Yi0wNWMyLTRhZTAtYTQ5ZC02OGQ3ZTUwY2Y4OWQiLCJzaWQiOiIwOWUxMzUyNC1mMWJhLTQ0Y2ItYTk0Yi03NGU3M2VlY2I5MjAifQ.7FyITZVCHNH6y6hRubDF3rnK0c_gGKxDg2yiV6Gm7bA",
  "access_expires_at": "2026-10-30T16:18:56.150394759Z",
  "refresh_token": "70xsOOFFNCvOhPpIT-SWck6Tt6gJmPa2ikV6askE9Tg",
  "refresh_expires_at": "2026-11-29T16:03:56.149560086Z",
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
  "command_id": "70a91ee4-6723-4306-a965-5b4ce7bd1fae",
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
  "command_id": "f1da5f28-71be-4c71-8331-71cf95d121f5",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4528,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:03:57Z",
    "sequence": 1793376237306
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
  "correlation_id": "50887f04-9bb8-4f8a-83dd-2f1a83d54dba"
}
```

## Back in Kyiv he goes online; then he is taken off Kyiv while online

`GET /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403` → **200**

```json
{
  "profile": {
    "id": "5a000000-0000-4000-8000-000000000403",
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
  "command_id": "7cf8b5be-16bf-4bb0-8a6a-1d388b2ff02e",
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
  "command_id": "ff07813e-04cf-4ae6-948b-209841301f74",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4528,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:03:58Z",
    "sequence": 1793376238566
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "2a74e0bd-c97e-4193-9880-3164d864f18d",
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
  "last_heartbeat_at": "2026-10-30T16:03:58.585469Z",
  "last_location_at": "2026-10-30T16:03:58.585469Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403` → **200**

```json
{
  "profile": {
    "id": "5a000000-0000-4000-8000-000000000403",
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
  "command_id": "07095adc-c375-43db-ba9a-e2505d472477",
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
  "session_id": "2a74e0bd-c97e-4193-9880-3164d864f18d",
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
  "last_heartbeat_at": "2026-10-30T16:03:58.585469Z",
  "last_location_at": "2026-10-30T16:03:58.585469Z",
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
  "phone": "+380688055732",
  "device_ref": "sandbox-9552"
}
```

```json
{
  "challenge_id": "7d0698fd-7a0f-4c5a-915d-ea5e380bb64a",
  "expires_at": "2026-10-30T16:08:59.699750677Z",
  "resend_available_at": "2026-10-30T16:04:00.699750677Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380688055732` → **200**

```json
{
  "phone": "+380688055732",
  "audience": "CLIENT",
  "code": "605738",
  "sent_at": "2026-10-30T16:03:59.704793761Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7d0698fd-7a0f-4c5a-915d-ea5e380bb64a",
  "code": "605738",
  "device_ref": "sandbox-9552"
}
```

```json
{
  "session_id": "62fbd20d-1747-4f65-aebe-50298bd20b40",
  "subject": {
    "type": "CLIENT",
    "id": "f93f6542-8778-424a-8b1b-f594aecf5dc5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmOTNmNjU0Mi04Nzc4LTQyNGEtOGIxYi1mNTk0YWVjZjVkYzUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc3MTQwLCJpYXQiOjE3OTMzNzYyNDAsImp0aSI6Ijc0ZmViNWYwLTMwYmYtNDk2Yi04MDM3LWUxZGE5YTZhZmVkNSIsInNpZCI6IjYyZmJkMjBkLTE3NDctNGY2NS1hZWJlLTUwMjk4YmQyMGI0MCJ9.rxdCM5dCqqR23qWM_5gatLAsG1wbM9nReURGWdyd854",
  "access_expires_at": "2026-10-30T16:19:00.006176741Z",
  "refresh_token": "N4B_N5e7ugvuD_e43l38L5P5gsTBiI6uFKBPxdHEiNk",
  "refresh_expires_at": "2026-11-29T16:04:00.00530137Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "efb6a5df-e131-4397-93ed-fa44bfa3d398",
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
  "id": "fdbe50fc-fe61-4114-a5d9-0292a1cb300f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T16:09:00.319149Z",
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
  "command_id": "b1649143-35f7-47e2-b2c9-5df92dc3ccb0",
  "quote_id": "fdbe50fc-fe61-4114-a5d9-0292a1cb300f",
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
  "id": "7681c6bb-4a7d-4680-8f5e-a63718d95a29",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f93f6542-8778-424a-8b1b-f594aecf5dc5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T16:04:00.660445Z",
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

`POST /api/driver/v1/orders/7681c6bb-4a7d-4680-8f5e-a63718d95a29/claim` → **409**

```json
{
  "command_id": "fb7bb89e-4689-4f0c-972f-afc242e9d6b1"
}
```

```json
{
  "instance": "/api/driver/v1/orders/7681c6bb-4a7d-4680-8f5e-a63718d95a29/claim",
  "status": 409,
  "title": "Driver not eligible",
  "type": "https://errors.blizz.taxi/driver-not-eligible",
  "code": "DRIVER_NOT_ELIGIBLE",
  "correlation_id": "5aad8eed-56a0-4777-8e96-5e76ed6277e6"
}
```

`GET /api/operator/v1/orders/7681c6bb-4a7d-4680-8f5e-a63718d95a29/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T16:04:00.663586Z",
      "actor": {
        "type": "CLIENT",
        "id": "f93f6542-8778-424a-8b1b-f594aecf5dc5",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "7681c6bb-4a7d-4680-8f5e-a63718d95a29",
        "quote_id": "fdbe50fc-fe61-4114-a5d9-0292a1cb300f",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "1da9b41a-676e-4d3f-b217-06a94302ab4e"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T16:04:00.669312Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "7681c6bb-4a7d-4680-8f5e-a63718d95a29",
        "attempt_id": "8acd12f3-fa50-46c3-bb37-a5fc937ee424",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "1da9b41a-676e-4d3f-b217-06a94302ab4e"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-30T16:04:00.722703Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "7681c6bb-4a7d-4680-8f5e-a63718d95a29",
        "attempt_id": "8acd12f3-fa50-46c3-bb37-a5fc937ee424"
      },
      "correlation_id": "1da9b41a-676e-4d3f-b217-06a94302ab4e"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "8acd12f3-fa50-46c3-bb37-a5fc937ee424",
        "generation": 1,
        "started_at": "2026-10-30T16:04:00.667161Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-30T16:04:00.722703Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-30T16:04:00.671078Z",
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
  "command_id": "4e5affa6-07d5-4c49-b275-b9c3d7eebc5b",
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

`POST /api/driver/v1/work-sessions/2a74e0bd-c97e-4193-9880-3164d864f18d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4528,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:04:02Z",
    "sequence": 1793376242738
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "2a74e0bd-c97e-4193-9880-3164d864f18d",
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
  "last_heartbeat_at": "2026-10-30T16:04:02.761077Z",
  "last_location_at": "2026-10-30T16:04:02.761077Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000001/zones` → **201**

```json
{
  "command_id": "13108800-13d9-4758-af93-1eb2d219ae84",
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
  "id": "92b6e980-28f5-4867-9fbd-c4c7563622f0",
  "state": "DRAFT",
  "version": 0
}
```

`POST /api/admin/v1/zones/92b6e980-28f5-4867-9fbd-c4c7563622f0/publish` → **200**

```json
{
  "command_id": "10e92d78-b809-4e73-bb92-f9776e2a6530",
  "expected_version": 0,
  "reason": "Sandbox"
}
```

```json
{
  "id": "92b6e980-28f5-4867-9fbd-c4c7563622f0",
  "state": "PUBLISHED",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000001/zones` → **201**

```json
{
  "command_id": "f186f597-63e1-4349-9158-3f1c2f71d564",
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
  "id": "cea38e9e-92b1-40ed-a607-63471a405d34",
  "state": "DRAFT",
  "version": 0
}
```

`POST /api/admin/v1/zones/cea38e9e-92b1-40ed-a607-63471a405d34/publish` → **200**

```json
{
  "command_id": "9ecf8e03-7767-4d1b-a679-0872467c1dae",
  "expected_version": 0,
  "reason": "Sandbox"
}
```

```json
{
  "id": "cea38e9e-92b1-40ed-a607-63471a405d34",
  "state": "PUBLISHED",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/zones` → **201**

```json
{
  "command_id": "c63bece2-bd22-4390-b609-35ae0becc46e",
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
  "id": "f926a2d1-b89b-4edf-8546-971a20994f7a",
  "state": "DRAFT",
  "version": 0
}
```

`POST /api/admin/v1/zones/f926a2d1-b89b-4edf-8546-971a20994f7a/publish` → **200**

```json
{
  "command_id": "67695c0f-ef58-40a6-a554-83fd95e930f7",
  "expected_version": 0,
  "reason": "Sandbox"
}
```

```json
{
  "id": "f926a2d1-b89b-4edf-8546-971a20994f7a",
  "state": "PUBLISHED",
  "version": 1
}
```

`GET /api/driver/v1/broadcast-orders?zone_id=92b6e980-28f5-4867-9fbd-c4c7563622f0` → **200**

```json
[
  {
    "order_id": "7681c6bb-4a7d-4680-8f5e-a63718d95a29",
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

`GET /api/driver/v1/broadcast-orders?zone_id=cea38e9e-92b1-40ed-a607-63471a405d34` → **200**

```json
[]
```

`GET /api/driver/v1/broadcast-orders?zone_id=f926a2d1-b89b-4edf-8546-971a20994f7a` → **400**

```json
{
  "instance": "/api/driver/v1/broadcast-orders",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "e7044f6c-4280-472f-a090-a8d00d0c41c0"
}
```

Done: E1 for 5a000000-0000-4000-8000-000000000403 (open 409, no offer, empty ALL tab, claim 409, journal CITY_NOT_ADMITTED); zone filter.

`GET /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403` → **200**

```json
{
  "profile": {
    "id": "5a000000-0000-4000-8000-000000000403",
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
  "command_id": "44ea8850-13ae-4628-bff6-765bd772b5aa",
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

`GET /api/operator/v1/orders/7681c6bb-4a7d-4680-8f5e-a63718d95a29` → **200**

```json
{
  "id": "7681c6bb-4a7d-4680-8f5e-a63718d95a29",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f93f6542-8778-424a-8b1b-f594aecf5dc5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T16:04:00.660445Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/7681c6bb-4a7d-4680-8f5e-a63718d95a29/cancel` → **200**

```json
{
  "command_id": "5ee27ffe-c0fe-4429-b7a6-09ea82721248",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "7681c6bb-4a7d-4680-8f5e-a63718d95a29",
  "short_number": 1,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "f93f6542-8778-424a-8b1b-f594aecf5dc5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T16:04:00.660445Z",
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
  "session_id": "2a74e0bd-c97e-4193-9880-3164d864f18d",
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
  "last_heartbeat_at": "2026-10-30T16:04:02.761077Z",
  "last_location_at": "2026-10-30T16:04:02.761077Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2a74e0bd-c97e-4193-9880-3164d864f18d/close` → **200**

```json
{
  "command_id": "4410773b-8f37-4472-868d-e4135d42e16a",
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
  "session_id": "227d0f5d-24d7-434c-be15-849c42b5db06",
  "subject": {
    "type": "STAFF",
    "id": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NTM4N2IzNC1lN2M5LTRhZmYtOTNjMS0wZGQzZjJhY2QwOGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzcxNDcsImlhdCI6MTc5MzM3NjI0NywianRpIjoiMWI5OGQyMDgtYWVmZC00YWVkLWJiZmEtMjBiNWY2YjkxZmY2Iiwic2lkIjoiMjI3ZDBmNWQtMjRkNy00MzRjLWJlMTUtODQ5YzQyYjVkYjA2In0.vHL15-l12BGG7TAUHb6wTLCdGiO_2QNWJi5fdxegyBc",
  "access_expires_at": "2026-10-30T16:19:07.815150747Z",
  "refresh_token": "b5UGyv4KwnGZuAU6yiu_uHlekCSS1jRLgnoxG99mvUA",
  "refresh_expires_at": "2026-10-31T04:04:07.814420139Z",
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
  "device_ref": "sandbox-11977"
}
```

```json
{
  "challenge_id": "3d335663-739a-4b9b-8934-0de2b608f905",
  "expires_at": "2026-10-30T16:09:08.386293023Z",
  "resend_available_at": "2026-10-30T16:04:09.386293023Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "054943",
  "sent_at": "2026-10-30T16:04:08.391266475Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3d335663-739a-4b9b-8934-0de2b608f905",
  "code": "054943",
  "device_ref": "sandbox-11977"
}
```

```json
{
  "session_id": "d2f7d6ef-a3c1-4448-ab55-c646f4a87b7f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NzE0OCwiaWF0IjoxNzkzMzc2MjQ4LCJqdGkiOiIyMjIyNTgwYi05ZGZkLTQ5NGYtYThkMi0xYjA2Y2EzMmM5YzEiLCJzaWQiOiJkMmY3ZDZlZi1hM2MxLTQ0NDgtYWI1NS1jNjQ2ZjRhODdiN2YifQ.L20UWXe2J7V6mZwrgv4-1SLs0eeweb-O87mi4i-vWoE",
  "access_expires_at": "2026-10-30T16:19:08.684206522Z",
  "refresh_token": "M7WmVQG3_90eVsEAd5KxhOMwRI7snspHVtoOlgQlQ-g",
  "refresh_expires_at": "2026-11-29T16:04:08.683592956Z",
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
  "command_id": "6da22c67-da70-4ac5-bd5e-f17ccfc9e625",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:04:09Z",
    "sequence": 1793376249217
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "796c9d11-3e05-409e-8e28-8dc1481968d4",
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
  "last_heartbeat_at": "2026-10-30T16:04:09.236466Z",
  "last_location_at": "2026-10-30T16:04:09.236466Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637615546",
  "device_ref": "sandbox-25934"
}
```

```json
{
  "challenge_id": "0c6a8070-5fe6-4745-a57d-36448cd0fa09",
  "expires_at": "2026-10-30T16:09:09.507893653Z",
  "resend_available_at": "2026-10-30T16:04:10.507893653Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637615546` → **200**

```json
{
  "phone": "+380637615546",
  "audience": "CLIENT",
  "code": "949745",
  "sent_at": "2026-10-30T16:04:09.511555539Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0c6a8070-5fe6-4745-a57d-36448cd0fa09",
  "code": "949745",
  "device_ref": "sandbox-25934"
}
```

```json
{
  "session_id": "d2bce546-a78a-4cc9-8144-c1d4c761b5f2",
  "subject": {
    "type": "CLIENT",
    "id": "cf9fb5af-1d96-40c5-85ff-7303cf627090"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZjlmYjVhZi0xZDk2LTQwYzUtODVmZi03MzAzY2Y2MjcwOTAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc3MTQ5LCJpYXQiOjE3OTMzNzYyNDksImp0aSI6IjY2ZDE0YmNkLTBlOWItNDg5OS04ODY4LWVkYWZhODliODdmOCIsInNpZCI6ImQyYmNlNTQ2LWE3OGEtNGNjOS04MTQ0LWMxZDRjNzYxYjVmMiJ9.6dCLNd_VCXU1lBQv4dgDXy1ELpFtlTc5lbjhu5cVrGg",
  "access_expires_at": "2026-10-30T16:19:09.80588027Z",
  "refresh_token": "VfsyyustPST2AJycTZSk1lriO_FXgTIB-zzSI6HoSpE",
  "refresh_expires_at": "2026-11-29T16:04:09.805289441Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ab082ba4-db89-4aaa-9efb-2b86b10c7c61",
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
  "id": "d85b466b-77e0-4e16-a93c-5b535121a27a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T16:09:10.083585Z",
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
  "command_id": "c89e2610-9e52-4086-9324-5ec220c3d603",
  "quote_id": "d85b466b-77e0-4e16-a93c-5b535121a27a",
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
  "id": "64969b68-d442-4b56-a9a6-4440b4d21f11",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "cf9fb5af-1d96-40c5-85ff-7303cf627090",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T16:04:10.36861Z",
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
    "id": "a4749328-3f88-46cb-8937-13b8fe883ab6",
    "order_id": "64969b68-d442-4b56-a9a6-4440b4d21f11",
    "expires_at": "2026-10-30T16:04:25.373388Z",
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

`POST /api/driver/v1/offers/a4749328-3f88-46cb-8937-13b8fe883ab6/accept` → **200**

```json
{
  "command_id": "d3f3a980-f7ef-41fd-885a-2ec6969e3ab7"
}
```

```json
{
  "id": "be713e7c-6d09-4b53-aae2-feee3a0d8ba6",
  "order_id": "64969b68-d442-4b56-a9a6-4440b4d21f11",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "89b67910-3940-433d-83f9-a51210845793",
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
  "command_id": "8cd634d0-63d7-48fa-829c-d3b2fe944e75",
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
  "changed_by": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T16:04:11.579869499Z"
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
  "id": "89b67910-3940-433d-83f9-a51210845793",
  "order_id": "64969b68-d442-4b56-a9a6-4440b4d21f11",
  "assignment_id": "be713e7c-6d09-4b53-aae2-feee3a0d8ba6",
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

`POST /api/driver/v1/work-sessions/796c9d11-3e05-409e-8e28-8dc1481968d4/heartbeat` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:04:12Z",
    "sequence": 1793376252463
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "796c9d11-3e05-409e-8e28-8dc1481968d4",
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
  "last_heartbeat_at": "2026-10-30T16:04:12.482226Z",
  "last_location_at": "2026-10-30T16:04:12.482226Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/89b67910-3940-433d-83f9-a51210845793/arrive` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "900b8752-8f40-4f86-a735-695215250684",
  "expected_version": 0
}
```

```json
{
  "id": "89b67910-3940-433d-83f9-a51210845793",
  "order_id": "64969b68-d442-4b56-a9a6-4440b4d21f11",
  "assignment_id": "be713e7c-6d09-4b53-aae2-feee3a0d8ba6",
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
  "arrived_at": "2026-10-30T16:04:12.76682Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/89b67910-3940-433d-83f9-a51210845793/start` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "c6baa3c4-4569-4ecd-8058-008e6f290e2a",
  "expected_version": 1
}
```

```json
{
  "id": "89b67910-3940-433d-83f9-a51210845793",
  "order_id": "64969b68-d442-4b56-a9a6-4440b4d21f11",
  "assignment_id": "be713e7c-6d09-4b53-aae2-feee3a0d8ba6",
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
  "arrived_at": "2026-10-30T16:04:12.76682Z",
  "started_at": "2026-10-30T16:04:13.068226Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/89b67910-3940-433d-83f9-a51210845793/complete` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "48491d5d-b6b5-46c3-a5f5-6f12aef7134a",
  "expected_version": 2,
  "reported_at": "2026-10-30T16:04:13Z",
  "cash_received": true
}
```

```json
{
  "id": "89b67910-3940-433d-83f9-a51210845793",
  "order_id": "64969b68-d442-4b56-a9a6-4440b4d21f11",
  "assignment_id": "be713e7c-6d09-4b53-aae2-feee3a0d8ba6",
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
  "arrived_at": "2026-10-30T16:04:12.76682Z",
  "started_at": "2026-10-30T16:04:13.068226Z",
  "completed_at": "2026-10-30T16:04:13.367253Z",
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
  "session_id": "796c9d11-3e05-409e-8e28-8dc1481968d4",
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
  "last_heartbeat_at": "2026-10-30T16:04:12.482226Z",
  "last_location_at": "2026-10-30T16:04:12.482226Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/796c9d11-3e05-409e-8e28-8dc1481968d4/close` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "c17df33f-ecd3-4df8-b547-1042b864feae",
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
  "command_id": "d993215d-2207-40d6-abb6-9a7de254f869",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:04:14Z",
    "sequence": 1793376254195
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
  "correlation_id": "32f72c10-7df6-4108-affc-8762209d7972",
  "minimum_version": "9.0.0"
}
```

## After the update he can

`POST /api/driver/v1/work-sessions` (X-App-Platform: DRIVER_ANDROID X-App-Version: 9.0.0) → **201**

```json
{
  "command_id": "d6b45031-65c7-4a66-8d35-b2d9883825fc",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:04:14Z",
    "sequence": 1793376254503
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "03e703d9-8e60-4904-97b6-58344411e7f4",
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
  "last_heartbeat_at": "2026-10-30T16:04:14.523614Z",
  "last_location_at": "2026-10-30T16:04:14.523614Z",
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
  "changed_by": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T16:04:11.579869Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "9453030e-b389-434d-90ac-c98ed91954f0",
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
  "changed_by": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T16:04:15.081711387Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "03e703d9-8e60-4904-97b6-58344411e7f4",
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
  "last_heartbeat_at": "2026-10-30T16:04:14.523614Z",
  "last_location_at": "2026-10-30T16:04:14.523614Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/03e703d9-8e60-4904-97b6-58344411e7f4/close` → **200**

```json
{
  "command_id": "9ba5a9f0-748b-4ab3-9c30-35eac8d40ecd",
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
  "session_id": "22fc961e-88b3-48d2-81f2-a8f1e3e04e11",
  "subject": {
    "type": "STAFF",
    "id": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NTM4N2IzNC1lN2M5LTRhZmYtOTNjMS0wZGQzZjJhY2QwOGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzcxNTYsImlhdCI6MTc5MzM3NjI1NiwianRpIjoiZjNjYTQzMmUtYWJmZS00NzRkLWJlMzItZTNhNjUzM2E4YTQ3Iiwic2lkIjoiMjJmYzk2MWUtODhiMy00OGQyLTgxZjItYThmMWUzZTA0ZTExIn0.BbQHsbey5xmish-IZ1WBMHVGrueYMadhRp7RLoOF8Tk",
  "access_expires_at": "2026-10-30T16:19:16.234333099Z",
  "refresh_token": "df7khw6bHHyvrvKXIv-Pz3ceeA-D0fXU03UQ6bDWy1o",
  "refresh_expires_at": "2026-10-31T04:04:16.233576943Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "0d36f376-bc23-4e82-88b0-dc95d20e9540",
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
  "id": "241f905c-6ae1-4d16-aaa1-c4635da51df4",
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
  "created_by": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f",
  "created_at": "2026-10-30T16:04:16.518906Z",
  "updated_at": "2026-10-30T16:04:16.518906Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632793321",
  "device_ref": "sandbox-21501"
}
```

```json
{
  "challenge_id": "8adbc93c-196f-4e35-9077-7fce2a457661",
  "expires_at": "2026-10-30T16:09:16.802304774Z",
  "resend_available_at": "2026-10-30T16:04:17.802304774Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632793321` → **200**

```json
{
  "phone": "+380632793321",
  "audience": "CLIENT",
  "code": "842925",
  "sent_at": "2026-10-30T16:04:16.806049589Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8adbc93c-196f-4e35-9077-7fce2a457661",
  "code": "842925",
  "device_ref": "sandbox-21501"
}
```

```json
{
  "session_id": "0330932b-3991-4680-99fc-d447b44ba7d2",
  "subject": {
    "type": "CLIENT",
    "id": "5468a5f6-47f8-4aa3-b9fb-bc894350d373"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NDY4YTVmNi00N2Y4LTRhYTMtYjlmYi1iYzg5NDM1MGQzNzMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc3MTU3LCJpYXQiOjE3OTMzNzYyNTcsImp0aSI6IjE4MDBhNjlkLWVhOGQtNGUwYy1hYjM4LWExZDE3MGRiMDVhYiIsInNpZCI6IjAzMzA5MzJiLTM5OTEtNDY4MC05OWZjLWQ0NDdiNDRiYTdkMiJ9.fyJqaHkq-BsvXByIEwDMqRrfUAMNMlpUGjAdzGIMDkc",
  "access_expires_at": "2026-10-30T16:19:17.092043111Z",
  "refresh_token": "SjbcN8dsDh8-yuqUgSwEJynf0QxFg5Z59kVjIyJBzIc",
  "refresh_expires_at": "2026-11-29T16:04:17.091353475Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380632793321` → **200**

```json
{
  "client_id": "5468a5f6-47f8-4aa3-b9fb-bc894350d373"
}
```

`POST /api/admin/v1/rider-wallets/5468a5f6-47f8-4aa3-b9fb-bc894350d373/top-ups` → **201**

```json
{
  "command_id": "b92fb4f0-ce00-4615-9275-25414720e997",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "5468a5f6-47f8-4aa3-b9fb-bc894350d373",
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
      "id": "97cb6df4-e70a-4cef-8bd1-77bdfb083e09",
      "at": "2026-10-30T16:04:17.627059Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ad616cba-e15d-45ec-b100-4ecb56e26d7a",
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
  "id": "1fe3e11d-3eed-46ee-8faf-8e1b894f686c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T16:09:17.922879Z",
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
      "id": "241f905c-6ae1-4d16-aaa1-c4635da51df4",
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
  "device_ref": "sandbox-15343"
}
```

```json
{
  "challenge_id": "a3d6296f-fb2a-4d90-bece-0fa113acd5c4",
  "expires_at": "2026-10-30T16:09:18.210176974Z",
  "resend_available_at": "2026-10-30T16:04:19.210176974Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "347517",
  "sent_at": "2026-10-30T16:04:18.215038058Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a3d6296f-fb2a-4d90-bece-0fa113acd5c4",
  "code": "347517",
  "device_ref": "sandbox-15343"
}
```

```json
{
  "session_id": "10a66bcb-6f4a-4be6-b422-f993f79f18a2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NzE1OCwiaWF0IjoxNzkzMzc2MjU4LCJqdGkiOiJkZjhkZjk0OC1mNDBlLTQxYTAtYjNiMC0xM2FlMWRkM2JkY2EiLCJzaWQiOiIxMGE2NmJjYi02ZjRhLTRiZTYtYjQyMi1mOTkzZjc5ZjE4YTIifQ.71zR2OJA6zSRi05rDKPtdH_MMDHN_Zm7iGgMTrOVths",
  "access_expires_at": "2026-10-30T16:19:18.513364245Z",
  "refresh_token": "h3t-UdpuxLXEpgirL3Bxy5I16R-xur8kTZ792SvXCQg",
  "refresh_expires_at": "2026-11-29T16:04:18.512553799Z",
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
  "command_id": "c48df75e-3509-434e-a1ea-d08a7192e8c0",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:04:19Z",
    "sequence": 1793376259520
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2f393425-4fab-4b15-ba14-9b1d6f166cfa",
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
  "last_heartbeat_at": "2026-10-30T16:04:19.071076Z",
  "last_location_at": "2026-10-30T16:04:19.071076Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "1212a7cc-83ef-4617-92ac-fb12ad805d89",
  "quote_id": "1fe3e11d-3eed-46ee-8faf-8e1b894f686c",
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
  "id": "e04877ee-7acc-46eb-9f2a-b09b1c629763",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5468a5f6-47f8-4aa3-b9fb-bc894350d373",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T16:04:19.35295Z",
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
  "client_id": "5468a5f6-47f8-4aa3-b9fb-bc894350d373",
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
      "id": "97cb6df4-e70a-4cef-8bd1-77bdfb083e09",
      "at": "2026-10-30T16:04:17.627059Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f",
      "order_id": null
    }
  ]
}
```

## Ivan drives; he collects the price minus the discount and the bonuses

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "1f3f781d-fcdb-444b-8589-0009049dd9dd",
    "order_id": "e04877ee-7acc-46eb-9f2a-b09b1c629763",
    "expires_at": "2026-10-30T16:04:34.360045Z",
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

`POST /api/driver/v1/offers/1f3f781d-fcdb-444b-8589-0009049dd9dd/accept` → **200**

```json
{
  "command_id": "f7f8f01b-36db-4ad3-815d-3dbbc18e2327"
}
```

```json
{
  "id": "4dfdc947-d017-4099-ba10-98837fa0e8a7",
  "order_id": "e04877ee-7acc-46eb-9f2a-b09b1c629763",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d77864fc-eff6-4032-84f2-8c4753f61e76",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d77864fc-eff6-4032-84f2-8c4753f61e76",
  "order_id": "e04877ee-7acc-46eb-9f2a-b09b1c629763",
  "assignment_id": "4dfdc947-d017-4099-ba10-98837fa0e8a7",
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

`POST /api/driver/v1/work-sessions/2f393425-4fab-4b15-ba14-9b1d6f166cfa/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:04:23Z",
    "sequence": 1793376263765
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2f393425-4fab-4b15-ba14-9b1d6f166cfa",
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
  "last_heartbeat_at": "2026-10-30T16:04:23.783825Z",
  "last_location_at": "2026-10-30T16:04:23.783825Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/d77864fc-eff6-4032-84f2-8c4753f61e76/arrive` → **200**

```json
{
  "command_id": "c5b1c15d-ab64-4f4b-a4a7-20d256cb4395",
  "expected_version": 0
}
```

```json
{
  "id": "d77864fc-eff6-4032-84f2-8c4753f61e76",
  "order_id": "e04877ee-7acc-46eb-9f2a-b09b1c629763",
  "assignment_id": "4dfdc947-d017-4099-ba10-98837fa0e8a7",
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
  "arrived_at": "2026-10-30T16:04:24.062879Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/d77864fc-eff6-4032-84f2-8c4753f61e76/start` → **200**

```json
{
  "command_id": "2ad19042-61e8-4918-8b96-6845ab9b156b",
  "expected_version": 1
}
```

```json
{
  "id": "d77864fc-eff6-4032-84f2-8c4753f61e76",
  "order_id": "e04877ee-7acc-46eb-9f2a-b09b1c629763",
  "assignment_id": "4dfdc947-d017-4099-ba10-98837fa0e8a7",
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
  "arrived_at": "2026-10-30T16:04:24.062879Z",
  "started_at": "2026-10-30T16:04:24.359722Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/d77864fc-eff6-4032-84f2-8c4753f61e76/complete` → **200**

```json
{
  "command_id": "437e5c89-78ba-4601-a06d-31d4a86f05d5",
  "expected_version": 2,
  "reported_at": "2026-10-30T16:04:24Z",
  "cash_received": true
}
```

```json
{
  "id": "d77864fc-eff6-4032-84f2-8c4753f61e76",
  "order_id": "e04877ee-7acc-46eb-9f2a-b09b1c629763",
  "assignment_id": "4dfdc947-d017-4099-ba10-98837fa0e8a7",
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
  "arrived_at": "2026-10-30T16:04:24.062879Z",
  "started_at": "2026-10-30T16:04:24.359722Z",
  "completed_at": "2026-10-30T16:04:24.659819Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "5468a5f6-47f8-4aa3-b9fb-bc894350d373",
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
      "id": "91b49daa-a4bc-4b0f-970b-cc9c97a29d1a",
      "at": "2026-10-30T16:04:25.515306Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "e04877ee-7acc-46eb-9f2a-b09b1c629763"
    },
    {
      "id": "97cb6df4-e70a-4cef-8bd1-77bdfb083e09",
      "at": "2026-10-30T16:04:17.627059Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/241f905c-6ae1-4d16-aaa1-c4635da51df4/archive` → **200**

```json
{
  "command_id": "bc6ac9cb-8693-4db2-8c7e-2ba7701706cd",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "241f905c-6ae1-4d16-aaa1-c4635da51df4",
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
  "created_by": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f",
  "created_at": "2026-10-30T16:04:16.518906Z",
  "updated_at": "2026-10-30T16:04:28.242109Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2f393425-4fab-4b15-ba14-9b1d6f166cfa",
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
  "last_heartbeat_at": "2026-10-30T16:04:23.783825Z",
  "last_location_at": "2026-10-30T16:04:23.783825Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2f393425-4fab-4b15-ba14-9b1d6f166cfa/close` → **200**

```json
{
  "command_id": "a1bbe3e9-7be5-4f1f-a46c-91c0c81eca49",
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

Done: order e04877ee-7acc-46eb-9f2a-b09b1c629763.

# Scenario: broadcast-abuse

## Anna goes online in Warsaw

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000002",
  "device_ref": "sandbox-21796"
}
```

```json
{
  "challenge_id": "539fc510-a33a-46ec-b8db-5bdee796c278",
  "expires_at": "2026-10-30T16:09:29.078959584Z",
  "resend_available_at": "2026-10-30T16:04:30.078959584Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000002` → **200**

```json
{
  "phone": "+48500000002",
  "audience": "DRIVER",
  "code": "564430",
  "sent_at": "2026-10-30T16:04:29.082875468Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "539fc510-a33a-46ec-b8db-5bdee796c278",
  "code": "564430",
  "device_ref": "sandbox-21796"
}
```

```json
{
  "session_id": "cb8f5745-11bc-4777-8d68-ceb8d825793d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000405"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDUiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NzE2OSwiaWF0IjoxNzkzMzc2MjY5LCJqdGkiOiI5MWRiZjlkOS01ZTdhLTQ3YmMtOWI4Ny00OTA5NWM4NmQ0NjQiLCJzaWQiOiJjYjhmNTc0NS0xMWJjLTQ3NzctOGQ2OC1jZWI4ZDgyNTc5M2QifQ.HsgkaPxPkI9wMrIX24UlH67ZflEJr-8rIkH-gpw3Mfc",
  "access_expires_at": "2026-10-30T16:19:29.377479836Z",
  "refresh_token": "64UnR06oi8rs2gFcrBV5xvpCbGq6qi-J5GoNC9B_l2s",
  "refresh_expires_at": "2026-11-29T16:04:29.376868593Z",
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
  "command_id": "5aae4f53-a903-4780-8134-3fc124868edf",
  "vehicle_id": "5a000000-0000-4000-8000-000000000505",
  "location": {
    "lat": 52.2297,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:04:30Z",
    "sequence": 1793376270177
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "900dbbbf-7e52-4b42-9753-5d799242f98a",
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
  "last_heartbeat_at": "2026-10-30T16:04:30.195569Z",
  "last_location_at": "2026-10-30T16:04:30.195569Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## 5 seconds later her phone reports Lviv: not taken as her position

`POST /api/driver/v1/work-sessions/900dbbbf-7e52-4b42-9753-5d799242f98a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 49.8397,
    "lon": 24.0297,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:04:35Z",
    "sequence": 1793376275469
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "900dbbbf-7e52-4b42-9753-5d799242f98a",
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
  "last_heartbeat_at": "2026-10-30T16:04:35.489118Z",
  "last_location_at": "2026-10-30T16:04:30.195569Z",
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
  "session_id": "0f103180-a0ed-4102-a7fc-25f091567534",
  "subject": {
    "type": "STAFF",
    "id": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NTM4N2IzNC1lN2M5LTRhZmYtOTNjMS0wZGQzZjJhY2QwOGYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzcxNzYsImlhdCI6MTc5MzM3NjI3NiwianRpIjoiNmUxZmI2ODktYWYzNi00ZTJiLTg4NTgtZmIxNmRlOTA4NjI2Iiwic2lkIjoiMGYxMDMxODAtYTBlZC00MTAyLWE3ZmMtMjVmMDkxNTY3NTM0In0.OYN2S6XPZcqeF3lNdiuLKXdQ75r1kmL2tcm2VvPEdF8",
  "access_expires_at": "2026-10-30T16:19:36.08771675Z",
  "refresh_token": "7seUeSsb8pT7P3R0ZTvQmbCJvJ4Mqh2vOd9K6qwbTw8",
  "refresh_expires_at": "2026-10-31T04:04:36.087010642Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "at": "2026-10-30T16:04:36.35273005Z",
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
      "last_location_at": "2026-10-30T16:04:30.195569Z",
      "last_heartbeat_at": "2026-10-30T16:04:35.489118Z",
      "order_id": null
    }
  ]
}
```

## A fix next to the last accepted one is taken again

`POST /api/driver/v1/work-sessions/900dbbbf-7e52-4b42-9753-5d799242f98a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2299,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:04:36Z",
    "sequence": 1793376276635
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "900dbbbf-7e52-4b42-9753-5d799242f98a",
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
  "last_heartbeat_at": "2026-10-30T16:04:36.653717Z",
  "last_location_at": "2026-10-30T16:04:36.653717Z",
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
  "session_id": "900dbbbf-7e52-4b42-9753-5d799242f98a",
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
  "last_heartbeat_at": "2026-10-30T16:04:36.653717Z",
  "last_location_at": "2026-10-30T16:04:36.653717Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/900dbbbf-7e52-4b42-9753-5d799242f98a/close` → **200**

```json
{
  "command_id": "64f16365-0503-4673-aa5c-834fba71abdb",
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
  "device_ref": "sandbox-8509"
}
```

```json
{
  "challenge_id": "be6f4b24-4e31-4f5e-81cc-6d958938ccdc",
  "expires_at": "2026-10-30T16:09:37.489059464Z",
  "resend_available_at": "2026-10-30T16:04:38.489059464Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "588709",
  "sent_at": "2026-10-30T16:04:37.492500304Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "be6f4b24-4e31-4f5e-81cc-6d958938ccdc",
  "code": "588709",
  "device_ref": "sandbox-8509"
}
```

```json
{
  "session_id": "9bc5c8f2-9cfb-47ea-846e-68fd3692e768",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NzE3NywiaWF0IjoxNzkzMzc2Mjc3LCJqdGkiOiIwM2MxZDE3ZC0xYTA3LTQ0OTYtODU5MC05OTgzZDRiMDBhMzAiLCJzaWQiOiI5YmM1YzhmMi05Y2ZiLTQ3ZWEtODQ2ZS02OGZkMzY5MmU3NjgifQ.6yNcp8wE4NRimdwAmSfTXujAVdxCgrfXM1mAVsp4PFw",
  "access_expires_at": "2026-10-30T16:19:37.787554748Z",
  "refresh_token": "FKaXsEldRxRLBsIFO8XCnZEWBhicuwgK18FXw87r0VQ",
  "refresh_expires_at": "2026-11-29T16:04:37.786807911Z",
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
  "device_ref": "sandbox-25218"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "f8e51a56-32a8-4269-a060-6aef88f300a4",
  "retryable": true,
  "retry_after_seconds": 1
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000001",
  "device_ref": "sandbox-25218"
}
```

```json
{
  "challenge_id": "c84834b4-996a-42e2-b32d-4cfaf66f3d14",
  "expires_at": "2026-10-30T16:09:39.615098032Z",
  "resend_available_at": "2026-10-30T16:04:40.615098032Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "494219",
  "sent_at": "2026-10-30T16:04:39.617895772Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c84834b4-996a-42e2-b32d-4cfaf66f3d14",
  "code": "494219",
  "device_ref": "sandbox-25218"
}
```

```json
{
  "session_id": "e2336d86-b59e-4aed-ae4b-9a6f48de6223",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NzE3OSwiaWF0IjoxNzkzMzc2Mjc5LCJqdGkiOiI2Mjc4OGUyNy05OWMyLTRlYTgtYWRlOS1lMTVlNTY5ODVmOWUiLCJzaWQiOiJlMjMzNmQ4Ni1iNTllLTRhZWQtYWU0Yi05YTZmNDhkZTYyMjMifQ.bL5L4CfaKl_2lXhAS37C9FCD23CLlQYFL3sUbnShxho",
  "access_expires_at": "2026-10-30T16:19:39.907021599Z",
  "refresh_token": "yHPOdLWSOiocOLuN0SfBRZdLTtPhlhnG9364CuIbAi4",
  "refresh_expires_at": "2026-11-29T16:04:39.906362159Z",
  "account_created": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000002",
  "device_ref": "sandbox-30663"
}
```

```json
{
  "challenge_id": "8fa37496-1396-4888-9bcd-ef9d856bedd4",
  "expires_at": "2026-10-30T16:09:40.165782053Z",
  "resend_available_at": "2026-10-30T16:04:41.165782053Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000002` → **200**

```json
{
  "phone": "+48500000002",
  "audience": "DRIVER",
  "code": "287883",
  "sent_at": "2026-10-30T16:04:40.171572858Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8fa37496-1396-4888-9bcd-ef9d856bedd4",
  "code": "287883",
  "device_ref": "sandbox-30663"
}
```

```json
{
  "session_id": "35b91ea0-e827-440d-b755-f1cda7047306",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000405"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDUiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NzE4MCwiaWF0IjoxNzkzMzc2MjgwLCJqdGkiOiJlZTJlMmU3ZC0zZjViLTRlZTYtOWI5My0wMWE0YzdlNTIxYzUiLCJzaWQiOiIzNWI5MWVhMC1lODI3LTQ0MGQtYjc1NS1mMWNkYTcwNDczMDYifQ.Ql4KMhErsY9fzD5uRSZLGflPFjKi2tkw8_QWLxwosjY",
  "access_expires_at": "2026-10-30T16:19:40.45993142Z",
  "refresh_token": "TCRrQHthEuxEfpoT6CvDdiB6zbfmBuO633YeWO0_gDQ",
  "refresh_expires_at": "2026-11-29T16:04:40.459267604Z",
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
  "command_id": "6bc0fbb5-1788-4faf-8f1c-3e5df32e9f62",
  "vehicle_id": "5a000000-0000-4000-8000-000000000505",
  "location": {
    "lat": 52.2297,
    "lon": 21.1700,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:07:44Z",
    "sequence": 1793376464269
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "2eb1e621-05ed-4685-839c-a65fe7b85bf0",
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
  "last_heartbeat_at": "2026-10-30T16:07:44.287941Z",
  "last_location_at": "2026-10-30T16:07:44.287941Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders: nobody is near, the order goes to the ALL tab

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600760993",
  "device_ref": "sandbox-31149"
}
```

```json
{
  "challenge_id": "bd9017ba-2698-4e57-b85c-f654fbf1e158",
  "expires_at": "2026-10-30T16:12:44.568494529Z",
  "resend_available_at": "2026-10-30T16:07:45.568494529Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600760993` → **200**

```json
{
  "phone": "+48600760993",
  "audience": "CLIENT",
  "code": "427627",
  "sent_at": "2026-10-30T16:07:44.571365494Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bd9017ba-2698-4e57-b85c-f654fbf1e158",
  "code": "427627",
  "device_ref": "sandbox-31149"
}
```

```json
{
  "session_id": "75d8197d-d1db-4ce9-aaf8-1f07353ed034",
  "subject": {
    "type": "CLIENT",
    "id": "ebcea69c-4475-402c-80bf-f4ee534a6e7c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlYmNlYTY5Yy00NDc1LTQwMmMtODBiZi1mNGVlNTM0YTZlN2MiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc3MzY0LCJpYXQiOjE3OTMzNzY0NjQsImp0aSI6IjUyYWY5NmRkLTlkZDgtNDE0NC05MDBkLTBmOWYzZGQzODJkZiIsInNpZCI6Ijc1ZDgxOTdkLWQxZGItNGNlOS1hYWY4LTFmMDczNTNlZDAzNCJ9.2KqQ0Yt63zXe3UNs7jV_vZDR8PVbns8yP_pNkbaIqIQ",
  "access_expires_at": "2026-10-30T16:22:44.877627126Z",
  "refresh_token": "8ShyzQeLtVqjwixgRmaQWRLe2S6bvvIgvjDn5QlRUBc",
  "refresh_expires_at": "2026-11-29T16:07:44.876975932Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "84fc7df2-1853-4aa8-bf25-c0183cfe1d78",
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
  "id": "5432e347-1eb1-437e-8c25-df1e8cab2b02",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 4942,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T16:12:45.162597Z",
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
  "command_id": "cd38d996-0c44-4b49-aa86-1a5cd423f17b",
  "quote_id": "5432e347-1eb1-437e-8c25-df1e8cab2b02",
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
  "id": "b5eb986e-e9c6-41d8-b8d4-dbaa4acbbc1c",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ebcea69c-4475-402c-80bf-f4ee534a6e7c",
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
  "created_at": "2026-10-30T16:07:45.45855Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b5eb986e-e9c6-41d8-b8d4-dbaa4acbbc1c` → **200**

```json
{
  "id": "b5eb986e-e9c6-41d8-b8d4-dbaa4acbbc1c",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ebcea69c-4475-402c-80bf-f4ee534a6e7c",
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
  "created_at": "2026-10-30T16:07:45.45855Z",
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

`POST /api/driver/v1/orders/b5eb986e-e9c6-41d8-b8d4-dbaa4acbbc1c/claim` → **422**

```json
{
  "command_id": "9152a77b-47cf-462c-b73f-7ae39e111d74"
}
```

```json
{
  "instance": "/api/driver/v1/orders/b5eb986e-e9c6-41d8-b8d4-dbaa4acbbc1c/claim",
  "status": 422,
  "title": "Pickup too far",
  "type": "https://errors.blizz.taxi/pickup-too-far",
  "code": "PICKUP_TOO_FAR",
  "correlation_id": "84e8bd34-8b73-4be5-a925-80ae95118944"
}
```

`GET /api/rider/v1/orders/b5eb986e-e9c6-41d8-b8d4-dbaa4acbbc1c` → **200**

```json
{
  "id": "b5eb986e-e9c6-41d8-b8d4-dbaa4acbbc1c",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ebcea69c-4475-402c-80bf-f4ee534a6e7c",
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
  "created_at": "2026-10-30T16:07:45.45855Z",
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

`POST /api/driver/v1/orders/798be01b-68ff-4064-ac70-ee161d35f3db/claim` → **404**

```json
{
  "command_id": "72287f31-df81-474a-bab3-af9c7747d58d"
}
```

```json
{
  "instance": "/api/driver/v1/orders/798be01b-68ff-4064-ac70-ee161d35f3db/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "b5761438-149e-4e35-89ff-9bd19d6aaede"
}
```

`POST /api/driver/v1/orders/55200ec3-03a0-4479-a816-7845126dd8f5/claim` → **404**

```json
{
  "command_id": "7e4d7230-9f72-406b-911a-587ccd312f90"
}
```

```json
{
  "instance": "/api/driver/v1/orders/55200ec3-03a0-4479-a816-7845126dd8f5/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "eabc77e2-982a-4b38-819d-e03d23da8cc3"
}
```

`POST /api/driver/v1/orders/8b061694-8897-491f-beb6-bf791265fd72/claim` → **404**

```json
{
  "command_id": "d8c6edc7-6b42-45ca-8469-7a0add217ede"
}
```

```json
{
  "instance": "/api/driver/v1/orders/8b061694-8897-491f-beb6-bf791265fd72/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "057d7a3c-ec62-49a0-934c-ea4c2e711924"
}
```

`POST /api/driver/v1/orders/54230c52-28ea-4469-9170-07220d943bf5/claim` → **404**

```json
{
  "command_id": "7ac2dbbd-22aa-4a57-928d-c7013226de5e"
}
```

```json
{
  "instance": "/api/driver/v1/orders/54230c52-28ea-4469-9170-07220d943bf5/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "006eed2a-ebdc-4d8e-8626-7fbb1df21fea"
}
```

`POST /api/driver/v1/orders/c03f78f4-c3f6-4c9a-adfb-8ce3024d197b/claim` → **404**

```json
{
  "command_id": "dc7a4200-3c4b-4e87-a950-88fc12d66817"
}
```

```json
{
  "instance": "/api/driver/v1/orders/c03f78f4-c3f6-4c9a-adfb-8ce3024d197b/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "736c12a6-7c7e-48b4-aee7-205b4557aaa2"
}
```

`POST /api/driver/v1/orders/0dbb9b88-4fc7-49aa-ba04-3229bcbf78bc/claim` → **404**

```json
{
  "command_id": "6f30be18-cbf1-43f0-87f8-3c1e2f333889"
}
```

```json
{
  "instance": "/api/driver/v1/orders/0dbb9b88-4fc7-49aa-ba04-3229bcbf78bc/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "f3557903-3f27-4016-abf3-ba85c466195d"
}
```

`POST /api/driver/v1/orders/564e81b7-9120-4424-bd6a-3bdf37bd7e22/claim` → **404**

```json
{
  "command_id": "da5f212a-4857-44ab-9eda-0570b2826612"
}
```

```json
{
  "instance": "/api/driver/v1/orders/564e81b7-9120-4424-bd6a-3bdf37bd7e22/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "d02ac3e7-7adb-47ac-810b-1457e18befab"
}
```

`POST /api/driver/v1/orders/e690177e-66a2-4347-bd81-11c1b89a15ff/claim` → **404**

```json
{
  "command_id": "7564c744-9b6b-4cd5-bfdb-603bc2011159"
}
```

```json
{
  "instance": "/api/driver/v1/orders/e690177e-66a2-4347-bd81-11c1b89a15ff/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "990f978a-b787-4cd1-9677-857ee25c2f03"
}
```

`POST /api/driver/v1/orders/26afdff4-8b6f-4ccb-bb21-f36e5bad6b47/claim` → **404**

```json
{
  "command_id": "92621edf-fff3-4c2e-913c-27744d06ea7a"
}
```

```json
{
  "instance": "/api/driver/v1/orders/26afdff4-8b6f-4ccb-bb21-f36e5bad6b47/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "3b076b90-09a1-477f-9498-0b4b180eec5f"
}
```

`POST /api/driver/v1/orders/9cf26db6-7597-40c0-a7e9-4e0462d7a83b/claim` → **404**

```json
{
  "command_id": "4999b4ef-4fc8-4d88-80f3-15d5dd97bb86"
}
```

```json
{
  "instance": "/api/driver/v1/orders/9cf26db6-7597-40c0-a7e9-4e0462d7a83b/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "10296452-842e-4e7c-83ea-3c4d82236c98"
}
```

`POST /api/driver/v1/orders/14c0ae27-c12d-4713-8b71-1debeed2d8df/claim` → **404**

```json
{
  "command_id": "60ef8f85-6511-4fb5-aad8-945732bbfe4b"
}
```

```json
{
  "instance": "/api/driver/v1/orders/14c0ae27-c12d-4713-8b71-1debeed2d8df/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "f1911460-87e4-41d4-9df9-48cde4fc3a17"
}
```

`POST /api/driver/v1/orders/84251ed7-cfb3-441c-8b3a-0c1557fb28b9/claim` → **404**

```json
{
  "command_id": "53dd5bb9-e1cc-46c7-8ac8-c835ca725727"
}
```

```json
{
  "instance": "/api/driver/v1/orders/84251ed7-cfb3-441c-8b3a-0c1557fb28b9/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "d325ce22-b4af-4216-88d8-d136231849f4"
}
```

`POST /api/driver/v1/orders/75bfdfbc-b9a6-48ce-8985-e40f4f8f579c/claim` → **404**

```json
{
  "command_id": "03b8f5d9-e7aa-4333-86b0-544fa23b95be"
}
```

```json
{
  "instance": "/api/driver/v1/orders/75bfdfbc-b9a6-48ce-8985-e40f4f8f579c/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "b9599808-78c1-4b6b-983c-58947e4534c9"
}
```

`POST /api/driver/v1/orders/95db2890-8283-47a7-ba55-d936b553cec1/claim` → **404**

```json
{
  "command_id": "b97334a9-c7b1-4e7f-87df-b98e2ee57076"
}
```

```json
{
  "instance": "/api/driver/v1/orders/95db2890-8283-47a7-ba55-d936b553cec1/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "3c9df392-6bdf-4a8c-a7a0-6758b4dc9824"
}
```

`POST /api/driver/v1/orders/5d640ce2-1150-4df8-8dae-bf7a3811149f/claim` → **404**

```json
{
  "command_id": "60ef3ea7-23fe-4381-a294-90fbb44e04b1"
}
```

```json
{
  "instance": "/api/driver/v1/orders/5d640ce2-1150-4df8-8dae-bf7a3811149f/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "2dffad03-e309-4c2d-ab2e-98de5e8c2356"
}
```

`POST /api/driver/v1/orders/ff462fbe-ae09-47cc-9ee2-b683efaa60aa/claim` → **404**

```json
{
  "command_id": "af18e7a3-0fd6-4e3d-8791-c04c434b2bd6"
}
```

```json
{
  "instance": "/api/driver/v1/orders/ff462fbe-ae09-47cc-9ee2-b683efaa60aa/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "77a00938-7b95-4484-8636-ff8eedc7293e"
}
```

`POST /api/driver/v1/orders/3e1eb923-31bb-4875-afc7-0044305466c7/claim` → **404**

```json
{
  "command_id": "69d753f8-3262-4c09-afae-74d69a911d23"
}
```

```json
{
  "instance": "/api/driver/v1/orders/3e1eb923-31bb-4875-afc7-0044305466c7/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "ccc27e76-5dc0-4476-be85-054b665403ca"
}
```

`POST /api/driver/v1/orders/b43c2527-8de7-4848-be90-25800a848d53/claim` → **404**

```json
{
  "command_id": "8495d8f4-4624-47b7-ba97-fbce5dead006"
}
```

```json
{
  "instance": "/api/driver/v1/orders/b43c2527-8de7-4848-be90-25800a848d53/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "eb47be79-0c00-4f4a-91f6-e376cda8bf70"
}
```

`POST /api/driver/v1/orders/dff8e222-397f-4548-822d-a2b84bbc5242/claim` → **404**

```json
{
  "command_id": "b796bf8a-7f12-4772-9d57-7ffb91e783a0"
}
```

```json
{
  "instance": "/api/driver/v1/orders/dff8e222-397f-4548-822d-a2b84bbc5242/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "74bee8bc-da70-41f8-afff-31f29ed5d1a1"
}
```

`POST /api/driver/v1/orders/8d275683-e239-4fe8-b151-8dc685c19633/claim` → **404**

```json
{
  "command_id": "52cfd262-f76d-478d-94e0-9333f85b2c9b"
}
```

```json
{
  "instance": "/api/driver/v1/orders/8d275683-e239-4fe8-b151-8dc685c19633/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "d00e5fa5-39e8-4c61-b5ff-28e905915a6f"
}
```

`POST /api/driver/v1/orders/a860e517-2911-4503-928e-6abb087989b9/claim` → **404**

```json
{
  "command_id": "a3cf6a5d-30fb-4044-9681-ab7decf9c509"
}
```

```json
{
  "instance": "/api/driver/v1/orders/a860e517-2911-4503-928e-6abb087989b9/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "1fb2298e-a040-46aa-b2be-f391b9e4d3ff"
}
```

`POST /api/driver/v1/orders/79793e0a-319f-464f-b400-c6ad68c1d728/claim` → **404**

```json
{
  "command_id": "1b04c2a5-1175-4801-8b4c-d1b47f6b8098"
}
```

```json
{
  "instance": "/api/driver/v1/orders/79793e0a-319f-464f-b400-c6ad68c1d728/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "ebb5460b-f8be-4cde-9682-74421403461f"
}
```

`POST /api/driver/v1/orders/ce737de3-be14-4c57-942a-a49a9bce38e8/claim` → **404**

```json
{
  "command_id": "4c154b96-e76d-49be-8aa6-821a88a5341b"
}
```

```json
{
  "instance": "/api/driver/v1/orders/ce737de3-be14-4c57-942a-a49a9bce38e8/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "a8572585-bbd2-4d7d-949b-1813036d009f"
}
```

`POST /api/driver/v1/orders/01224579-62d3-4f15-9358-5c2ecbd18e2d/claim` → **404**

```json
{
  "command_id": "1cb11b73-a0b8-4548-9720-8053b6d6d6e9"
}
```

```json
{
  "instance": "/api/driver/v1/orders/01224579-62d3-4f15-9358-5c2ecbd18e2d/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "0e963f2e-a2ff-4be6-85a9-0ee55459fcfe"
}
```

`POST /api/driver/v1/orders/4c649468-20c5-48f3-b915-e7941c6b1fd9/claim` → **404**

```json
{
  "command_id": "74bfce93-906c-4953-89e0-b3d7a73a36d2"
}
```

```json
{
  "instance": "/api/driver/v1/orders/4c649468-20c5-48f3-b915-e7941c6b1fd9/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "ea439a5a-d2a7-49f5-8628-17bb6bf734bf"
}
```

`POST /api/driver/v1/orders/9cbf9098-e090-4a0c-82c5-0f72d180bd4b/claim` → **404**

```json
{
  "command_id": "52eac887-cad5-47b8-b59a-b07d31e5fd61"
}
```

```json
{
  "instance": "/api/driver/v1/orders/9cbf9098-e090-4a0c-82c5-0f72d180bd4b/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "755aa466-712c-4dcf-b333-417a13f8b6fe"
}
```

`POST /api/driver/v1/orders/3318b386-2c34-4978-94ab-6581949b687a/claim` → **404**

```json
{
  "command_id": "9e0eb60b-9777-426a-bc36-84612e63299d"
}
```

```json
{
  "instance": "/api/driver/v1/orders/3318b386-2c34-4978-94ab-6581949b687a/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "ab4cfc39-d646-4cec-9222-06b7a9424c45"
}
```

`POST /api/driver/v1/orders/1ea3b810-412e-471b-a53a-24d126e4b3e2/claim` → **404**

```json
{
  "command_id": "31663522-43a7-40cf-8242-b170582b6bf2"
}
```

```json
{
  "instance": "/api/driver/v1/orders/1ea3b810-412e-471b-a53a-24d126e4b3e2/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "1146b6b9-7e6a-4088-aff2-e2c3a69b717b"
}
```

`POST /api/driver/v1/orders/131ac555-7a40-4364-9ed7-05f711f975ce/claim` → **404**

```json
{
  "command_id": "49c84b45-cd1d-4697-a44c-2a1216d9ead2"
}
```

```json
{
  "instance": "/api/driver/v1/orders/131ac555-7a40-4364-9ed7-05f711f975ce/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "cc32b471-9a6d-4c54-b4cf-7ab3d7aa5285"
}
```

`POST /api/driver/v1/orders/3bc271ce-b4bb-4b48-b362-63be9a9c11ca/claim` → **429**

```json
{
  "command_id": "7f7eb874-d1d4-4f0e-87b2-f20b9e8b5712"
}
```

```json
{
  "instance": "/api/driver/v1/orders/3bc271ce-b4bb-4b48-b362-63be9a9c11ca/claim",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "69d093ea-f9ae-4b7e-9d8f-d488edc26b69",
  "retryable": true,
  "retry_after_seconds": 592
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
  "command_id": "72f5cf9b-b5dc-4575-bca3-51c2fafd7220",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:07:55Z",
    "sequence": 1793376475560
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "e3c7c0f5-4b2c-4703-9238-f549e7b2c53a",
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
  "last_heartbeat_at": "2026-10-30T16:07:55.578445Z",
  "last_location_at": "2026-10-30T16:07:55.578445Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/broadcast-orders` → **200**

```json
[
  {
    "order_id": "b5eb986e-e9c6-41d8-b8d4-dbaa4acbbc1c",
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

`POST /api/driver/v1/orders/b5eb986e-e9c6-41d8-b8d4-dbaa4acbbc1c/claim` → **409**

```json
{
  "command_id": "38442480-3a9c-4c3b-844f-a713df12433a"
}
```

```json
{
  "instance": "/api/driver/v1/orders/b5eb986e-e9c6-41d8-b8d4-dbaa4acbbc1c/claim",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "53361422-c293-4749-9366-485c787f4bbf"
}
```

`POST /api/driver/v1/orders/b5eb986e-e9c6-41d8-b8d4-dbaa4acbbc1c/claim` → **200**

```json
{
  "command_id": "02bb762c-cd1c-46c1-b0b8-ef5512625696"
}
```

```json
{
  "id": "3bf9f0e2-585d-4802-a930-6a203ab31d11",
  "order_id": "b5eb986e-e9c6-41d8-b8d4-dbaa4acbbc1c",
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "source": "BROADCAST",
  "state": "COMMITTED",
  "trip_id": "3494ac4d-cb3c-4ca7-a1c6-1a1681f37f8f",
  "trip_phase": "TO_PICKUP"
}
```

## Piotr cancels at the rider's request (sandbox clean-up)

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "3494ac4d-cb3c-4ca7-a1c6-1a1681f37f8f",
  "order_id": "b5eb986e-e9c6-41d8-b8d4-dbaa4acbbc1c",
  "assignment_id": "3bf9f0e2-585d-4802-a930-6a203ab31d11",
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

`POST /api/driver/v1/trips/3494ac4d-cb3c-4ca7-a1c6-1a1681f37f8f/cancel` → **200**

```json
{
  "command_id": "dca84fb4-1912-419e-8160-adde0b1f2203",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "3494ac4d-cb3c-4ca7-a1c6-1a1681f37f8f",
  "order_id": "b5eb986e-e9c6-41d8-b8d4-dbaa4acbbc1c",
  "assignment_id": "3bf9f0e2-585d-4802-a930-6a203ab31d11",
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

`GET /api/rider/v1/orders/b5eb986e-e9c6-41d8-b8d4-dbaa4acbbc1c` → **200**

```json
{
  "id": "b5eb986e-e9c6-41d8-b8d4-dbaa4acbbc1c",
  "short_number": 4,
  "status": "CANCELLED",
  "status_reason": "PASSENGER_ASKED",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "ebcea69c-4475-402c-80bf-f4ee534a6e7c",
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
    "id": "3bf9f0e2-585d-4802-a930-6a203ab31d11",
    "order_id": "b5eb986e-e9c6-41d8-b8d4-dbaa4acbbc1c",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "vehicle_id": "5a000000-0000-4000-8000-000000000504",
    "source": "BROADCAST",
    "state": "RELEASED",
    "trip_id": "3494ac4d-cb3c-4ca7-a1c6-1a1681f37f8f",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T16:07:45.45855Z",
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
  "pickup_eta": null
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "2eb1e621-05ed-4685-839c-a65fe7b85bf0",
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
  "last_heartbeat_at": "2026-10-30T16:07:44.287941Z",
  "last_location_at": "2026-10-30T16:07:44.287941Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2eb1e621-05ed-4685-839c-a65fe7b85bf0/close` → **200**

```json
{
  "command_id": "433ac301-7f38-42c2-aaad-5e01e0cffda8",
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
  "session_id": "e3c7c0f5-4b2c-4703-9238-f549e7b2c53a",
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
  "last_heartbeat_at": "2026-10-30T16:07:55.578445Z",
  "last_location_at": "2026-10-30T16:07:55.578445Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e3c7c0f5-4b2c-4703-9238-f549e7b2c53a/close` → **200**

```json
{
  "command_id": "6b1acb2d-0b07-4d65-ac14-f60123ad06fa",
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
  "session_id": "ae9d27c7-79fd-4d91-be33-0cf103fd5743",
  "subject": {
    "type": "STAFF",
    "id": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NTM4N2IzNC1lN2M5LTRhZmYtOTNjMS0wZGQzZjJhY2QwOGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzczNzgsImlhdCI6MTc5MzM3NjQ3OCwianRpIjoiNmZlYWM1MDgtNmQyMS00YTEyLWExOTktNmVmYzA1NmI4ZGE2Iiwic2lkIjoiYWU5ZDI3YzctNzlmZC00ZDkxLWJlMzMtMGNmMTAzZmQ1NzQzIn0.gyfq-n_HbzrWR3K7aaMjKSEDC9DQhZ-LO5o_y-QvW6Y",
  "access_expires_at": "2026-10-30T16:22:58.939609223Z",
  "refresh_token": "UUqiy8jLSbDlpdCx8ALBHPXmAWSKDvz8hvMM4JwlBgw",
  "refresh_expires_at": "2026-10-31T04:07:58.938033042Z",
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
  "command_id": "b6f0da66-23f9-402a-8d9f-53ac320991e7",
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
  "session_id": "b6a62dcc-0b13-4d0f-86f3-651339a4fcb6",
  "subject": {
    "type": "STAFF",
    "id": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NTM4N2IzNC1lN2M5LTRhZmYtOTNjMS0wZGQzZjJhY2QwOGYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzczODAsImlhdCI6MTc5MzM3NjQ4MCwianRpIjoiNGQyOGNjMDUtZGVmNy00YjMzLWFmODgtOGRlN2JlYmM3MjA0Iiwic2lkIjoiYjZhNjJkY2MtMGIxMy00ZDBmLTg2ZjMtNjUxMzM5YTRmY2I2In0.gaNP7FE32AowDDIQEt8t5XlSyXOxihU7fEG4uog0QFk",
  "access_expires_at": "2026-10-30T16:23:00.037180072Z",
  "refresh_token": "oHfReEbVl1SXpGCY5p0Ozu6DaGxMt1nrDjwG43QLUB4",
  "refresh_expires_at": "2026-10-31T04:08:00.036689921Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.3079532659",
    "linkedid": "1730052700.3079532659",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380679024203"
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
    "id": "1730052700.3079532659",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "65316518-e384-449d-8035-a34ed3dfda05",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380679024203",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T16:08:00.2988Z",
      "answered_at": null,
      "ended_at": "2026-10-30T16:08:00.32064Z",
      "recording": null
    }
  ]
}
```

## A call is taken and ends: its recording is fetched from Asterisk

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052600.1417256",
    "linkedid": "1730052600.1417256",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380679024203"
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
      "id": "3dba446a-80d9-4af5-9478-7c71e68aae9e",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380679024203",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T16:08:00.620482Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/3dba446a-80d9-4af5-9478-7c71e68aae9e/answer` → **200**

```json
{
  "command_id": "87594dfc-ee78-4d90-bc9a-5beeab66e34e"
}
```

```json
{
  "id": "3dba446a-80d9-4af5-9478-7c71e68aae9e",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380679024203",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f",
  "order_ids": [],
  "started_at": "2026-10-30T16:08:00.620482Z",
  "answered_at": "2026-10-30T16:08:00.929869Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.1417256",
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
    "id": "1730052600.1417256",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "3dba446a-80d9-4af5-9478-7c71e68aae9e",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679024203",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f",
      "order_ids": [],
      "started_at": "2026-10-30T16:08:00.620482Z",
      "answered_at": "2026-10-30T16:08:00.929869Z",
      "ended_at": "2026-10-30T16:08:01.22799Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "3dba446a-80d9-4af5-9478-7c71e68aae9e",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679024203",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f",
      "order_ids": [],
      "started_at": "2026-10-30T16:08:00.620482Z",
      "answered_at": "2026-10-30T16:08:00.929869Z",
      "ended_at": "2026-10-30T16:08:01.22799Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T16:08:03.06493Z"
      }
    }
  ]
}
```

Recording: STORED

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "3dba446a-80d9-4af5-9478-7c71e68aae9e",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679024203",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f",
      "order_ids": [],
      "started_at": "2026-10-30T16:08:00.620482Z",
      "answered_at": "2026-10-30T16:08:00.929869Z",
      "ended_at": "2026-10-30T16:08:01.22799Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T16:08:03.06493Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/3dba446a-80d9-4af5-9478-7c71e68aae9e/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/3dba446a-80d9-4af5-9478-7c71e68aae9e/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=3dba446a-80d9-4af5-9478-7c71e68aae9e` → **200**

```json
{
  "changes": [
    {
      "id": "c98ed16f-a208-4ed0-9820-45a076d6d6b4",
      "occurred_at": "2026-10-30T16:08:04.097151Z",
      "actor_type": "STAFF",
      "actor_id": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "3dba446a-80d9-4af5-9478-7c71e68aae9e",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"920633f1-f319-4bab-bfee-c7dd3958b164\", \"order_ids\": []}",
      "correlation_id": "87820bab-33b2-402a-858d-5d11607001a6"
    },
    {
      "id": "af2b5748-a4aa-401b-a656-aa4d09cd4471",
      "occurred_at": "2026-10-30T16:08:04.06901Z",
      "actor_type": "STAFF",
      "actor_id": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "3dba446a-80d9-4af5-9478-7c71e68aae9e",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"920633f1-f319-4bab-bfee-c7dd3958b164\", \"order_ids\": []}",
      "correlation_id": "1b4b5980-0461-4881-aae4-5cf0c7c10ab1"
    }
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
```

Done: call 3dba446a-80d9-4af5-9478-7c71e68aae9e recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-23740"
}
```

```json
{
  "challenge_id": "c73f68ef-120c-4fc0-9db8-e3b1efe532da",
  "expires_at": "2026-10-30T16:13:04.406287741Z",
  "resend_available_at": "2026-10-30T16:08:05.406287741Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "316618",
  "sent_at": "2026-10-30T16:08:04.409156443Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c73f68ef-120c-4fc0-9db8-e3b1efe532da",
  "code": "316618",
  "device_ref": "sandbox-23740"
}
```

```json
{
  "session_id": "2b4338d8-174e-4522-85dc-ef4b069e3e8f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NzM4NCwiaWF0IjoxNzkzMzc2NDg0LCJqdGkiOiIxNjMwMmQ4Mi02MTEyLTRlNjAtYTVjYi05NGYzZDliYjljOGMiLCJzaWQiOiIyYjQzMzhkOC0xNzRlLTQ1MjItODVkYy1lZjRiMDY5ZTNlOGYifQ.rPvQV60uOwsFgIeG_fszu6bqn9A_Xw3z2Mp-U3S5apo",
  "access_expires_at": "2026-10-30T16:23:04.698193474Z",
  "refresh_token": "9LxWDphH-uszWX_EZ7k6amj_Vorjlf1WWmzCpAyFhfs",
  "refresh_expires_at": "2026-11-29T16:08:04.697653245Z",
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
  "command_id": "b01efd6d-10eb-452b-968d-7891dd31b51e",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:08:05Z",
    "sequence": 1793376485241
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "82d44c4c-93ca-4b6a-93c2-fe2ac908208e",
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
  "last_heartbeat_at": "2026-10-30T16:08:05.25883Z",
  "last_location_at": "2026-10-30T16:08:05.25883Z",
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
  "session_id": "1876f0cb-dc2e-46e4-b09d-b1abdf288fc6",
  "subject": {
    "type": "STAFF",
    "id": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NTM4N2IzNC1lN2M5LTRhZmYtOTNjMS0wZGQzZjJhY2QwOGYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzczODUsImlhdCI6MTc5MzM3NjQ4NSwianRpIjoiNDhhYWZlZmMtYjU4OC00MzQ4LWEyOWUtMmEzODU3NjhkZjhjIiwic2lkIjoiMTg3NmYwY2ItZGMyZS00NmU0LWIwOWQtYjFhYmRmMjg4ZmM2In0.CJmm1_s6t3vLWkxKP0eEGdvGkLwaBdupcl1fvMwnyew",
  "access_expires_at": "2026-10-30T16:23:05.836408481Z",
  "refresh_token": "XFZN1MD2r2QgUpBpzrlQSzdAe788DbLKgnTtcEzYLfw",
  "refresh_expires_at": "2026-10-31T04:08:05.835898162Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "88ef3f57-13f6-48f9-9752-b49d2fd2c0ea",
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
  "id": "fc4ba246-5a21-4976-af08-293bec9e05bd",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T16:13:06.110528Z",
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
  "command_id": "e034a28f-178d-4a57-bcf1-782faed7589d",
  "quote_id": "fc4ba246-5a21-4976-af08-293bec9e05bd",
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
    "phone": "+380679261386"
  }
}
```

```json
{
  "id": "0e1045e5-ff7f-4889-9f5b-590e11ec1217",
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
  "created_at": "2026-10-30T16:08:06.406915Z",
  "caller": {
    "name": "Олена",
    "phone": "+380679261386"
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
    "id": "57314528-918b-4ebf-8335-0b3c5b8e390d",
    "order_id": "0e1045e5-ff7f-4889-9f5b-590e11ec1217",
    "expires_at": "2026-10-30T16:08:21.413476Z",
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

`POST /api/driver/v1/offers/57314528-918b-4ebf-8335-0b3c5b8e390d/accept` → **200**

```json
{
  "command_id": "0a5df212-7d9f-4d43-a159-d2179d23f968"
}
```

```json
{
  "id": "4f4b8ede-f869-45c6-9993-ece873c845fa",
  "order_id": "0e1045e5-ff7f-4889-9f5b-590e11ec1217",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "7036579c-31e1-4e18-a139-a9997adf2511",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380679261386` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380679261386` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380679261386` → **200**

```json
[
  {
    "phone": "+380679261386",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T16:08:08.715305887Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380679261386` → **200**

```json
[
  {
    "phone": "+380679261386",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T16:08:08.715305887Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380679261386` → **200**

```json
[
  {
    "phone": "+380679261386",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T16:08:08.715305887Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "7036579c-31e1-4e18-a139-a9997adf2511",
  "order_id": "0e1045e5-ff7f-4889-9f5b-590e11ec1217",
  "assignment_id": "4f4b8ede-f869-45c6-9993-ece873c845fa",
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
    "phone": "+380679261386"
  }
}
```

`POST /api/driver/v1/work-sessions/82d44c4c-93ca-4b6a-93c2-fe2ac908208e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:08:09Z",
    "sequence": 1793376489659
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "82d44c4c-93ca-4b6a-93c2-fe2ac908208e",
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
  "last_heartbeat_at": "2026-10-30T16:08:09.676202Z",
  "last_location_at": "2026-10-30T16:08:09.676202Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/7036579c-31e1-4e18-a139-a9997adf2511/arrive` → **200**

```json
{
  "command_id": "a8949d6f-ae23-4409-9119-3424c56534e1",
  "expected_version": 0
}
```

```json
{
  "id": "7036579c-31e1-4e18-a139-a9997adf2511",
  "order_id": "0e1045e5-ff7f-4889-9f5b-590e11ec1217",
  "assignment_id": "4f4b8ede-f869-45c6-9993-ece873c845fa",
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
  "arrived_at": "2026-10-30T16:08:09.952661Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380679261386"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380679261386` → **200**

```json
[
  {
    "phone": "+380679261386",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T16:08:08.715305887Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380679261386` → **200**

```json
[
  {
    "phone": "+380679261386",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T16:08:08.715305887Z"
  },
  {
    "phone": "+380679261386",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T16:08:10.722973651Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380679261386` → **200**

```json
[
  {
    "phone": "+380679261386",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T16:08:08.715305887Z"
  },
  {
    "phone": "+380679261386",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T16:08:10.722973651Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380679261386` → **200**

```json
[
  {
    "phone": "+380679261386",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T16:08:08.715305887Z"
  },
  {
    "phone": "+380679261386",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T16:08:10.722973651Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/7036579c-31e1-4e18-a139-a9997adf2511/start` → **200**

```json
{
  "command_id": "18a9d671-6867-4ac9-bdda-133f61141b86",
  "expected_version": 1
}
```

```json
{
  "id": "7036579c-31e1-4e18-a139-a9997adf2511",
  "order_id": "0e1045e5-ff7f-4889-9f5b-590e11ec1217",
  "assignment_id": "4f4b8ede-f869-45c6-9993-ece873c845fa",
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
  "arrived_at": "2026-10-30T16:08:09.952661Z",
  "started_at": "2026-10-30T16:08:11.320968Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380679261386"
  }
}
```

`POST /api/driver/v1/trips/7036579c-31e1-4e18-a139-a9997adf2511/complete` → **200**

```json
{
  "command_id": "fa666559-319e-4237-a576-4cc658c763d6",
  "expected_version": 2,
  "reported_at": "2026-10-30T16:08:11Z",
  "cash_received": true
}
```

```json
{
  "id": "7036579c-31e1-4e18-a139-a9997adf2511",
  "order_id": "0e1045e5-ff7f-4889-9f5b-590e11ec1217",
  "assignment_id": "4f4b8ede-f869-45c6-9993-ece873c845fa",
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
  "arrived_at": "2026-10-30T16:08:09.952661Z",
  "started_at": "2026-10-30T16:08:11.320968Z",
  "completed_at": "2026-10-30T16:08:11.627126Z",
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
  "session_id": "82d44c4c-93ca-4b6a-93c2-fe2ac908208e",
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
  "last_heartbeat_at": "2026-10-30T16:08:09.676202Z",
  "last_location_at": "2026-10-30T16:08:09.676202Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/82d44c4c-93ca-4b6a-93c2-fe2ac908208e/close` → **200**

```json
{
  "command_id": "d0f33991-e4f7-4c87-a8f1-ce961f90cb03",
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
  "phone": "+380631569775",
  "device_ref": "sandbox-3640"
}
```

```json
{
  "challenge_id": "6f95a4f1-06aa-4d88-9fa9-68cd055a132a",
  "expires_at": "2026-10-30T16:13:12.479666998Z",
  "resend_available_at": "2026-10-30T16:08:13.479666998Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631569775` → **200**

```json
{
  "phone": "+380631569775",
  "audience": "CLIENT",
  "code": "484880",
  "sent_at": "2026-10-30T16:08:12.482246534Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6f95a4f1-06aa-4d88-9fa9-68cd055a132a",
  "code": "484880",
  "device_ref": "sandbox-3640"
}
```

```json
{
  "session_id": "654d9fdd-d810-4297-ba63-567e3cfe861a",
  "subject": {
    "type": "CLIENT",
    "id": "9c233f17-d601-4990-96f0-ebc0324a758d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YzIzM2YxNy1kNjAxLTQ5OTAtOTZmMC1lYmMwMzI0YTc1OGQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc3MzkyLCJpYXQiOjE3OTMzNzY0OTIsImp0aSI6Ijk2ODlkOTczLWYxNjMtNDYxZi04YmM4LTNjNjIzZDE2YjEwOCIsInNpZCI6IjY1NGQ5ZmRkLWQ4MTAtNDI5Ny1iYTYzLTU2N2UzY2ZlODYxYSJ9.e94MDgHvXXCT0fqWTRUImCo_syORLRQGXCQ6Y8tvZGU",
  "access_expires_at": "2026-10-30T16:23:12.777947326Z",
  "refresh_token": "8KeQ6I0mv0CV78E7NWOmFrPeNJ1o6IpkQ4zeaUZdrEw",
  "refresh_expires_at": "2026-11-29T16:08:12.777125879Z",
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
  "device_ref": "sandbox-13509"
}
```

```json
{
  "challenge_id": "b7bf2c7e-8673-476b-a7ef-568a89f20392",
  "expires_at": "2026-10-30T16:13:13.306760754Z",
  "resend_available_at": "2026-10-30T16:08:14.306760754Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "596952",
  "sent_at": "2026-10-30T16:08:13.309235482Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b7bf2c7e-8673-476b-a7ef-568a89f20392",
  "code": "596952",
  "device_ref": "sandbox-13509"
}
```

```json
{
  "session_id": "5026c6c4-803f-4a42-b605-28a176d8967c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NzM5MywiaWF0IjoxNzkzMzc2NDkzLCJqdGkiOiI4YWRmNzgwNy0zZjRkLTQxNWQtODY4Mi01YTMwZmYzOWIxZjMiLCJzaWQiOiI1MDI2YzZjNC04MDNmLTRhNDItYjYwNS0yOGExNzZkODk2N2MifQ.zPA4UbivDOVXDHcrrriOzQWHZfSz4OaeBLziR7E-uHg",
  "access_expires_at": "2026-10-30T16:23:13.598457601Z",
  "refresh_token": "eHYxns3l4nqCbtCGWdrGm9iBSImU1KSa_34pMgeNKSY",
  "refresh_expires_at": "2026-11-29T16:08:13.597871841Z",
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
  "session_id": "8367711f-69fe-4cad-b24f-c0b1b52c66c5",
  "subject": {
    "type": "STAFF",
    "id": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NTM4N2IzNC1lN2M5LTRhZmYtOTNjMS0wZGQzZjJhY2QwOGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzczOTQsImlhdCI6MTc5MzM3NjQ5NCwianRpIjoiYjM1YzYzNDEtNWQ2Ny00ZDlmLWFiNjAtZjZhNjk3MWRiYjI1Iiwic2lkIjoiODM2NzcxMWYtNjlmZS00Y2FkLWIyNGYtYzBiMWI1MmM2NmM1In0.PQJT277mesHSi93jI2oqLgNAoujp8skcTCJEBB1uYmw",
  "access_expires_at": "2026-10-30T16:23:14.428798487Z",
  "refresh_token": "g19Nbd8tLzvjQMiMsHKfV-7uz1X8TnDlMn3Ta70Qwmw",
  "refresh_expires_at": "2026-10-31T04:08:14.428271093Z",
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
  "session_id": "a413ae00-9aef-4cf9-adc7-0f3e7f5cdbc6",
  "subject": {
    "type": "STAFF",
    "id": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NTM4N2IzNC1lN2M5LTRhZmYtOTNjMS0wZGQzZjJhY2QwOGYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzczOTQsImlhdCI6MTc5MzM3NjQ5NCwianRpIjoiYTJlN2ZkODAtM2JjZC00MTQyLTk0NDMtNGZiOTIxMjhjOTVlIiwic2lkIjoiYTQxM2FlMDAtOWFlZi00Y2Y5LWFkYzctMGYzZTdmNWNkYmM2In0.TTDoRJZ4XvMxXUpswS2HIWxHMrN1CDTI81UA5UdFGBo",
  "access_expires_at": "2026-10-30T16:23:14.990452025Z",
  "refresh_token": "-UztpWwqdBjlZzKzKg1K7smglTAOaeXNOiB9SdTMBbA",
  "refresh_expires_at": "2026-10-31T04:08:14.989786714Z",
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
  "command_id": "0f694757-f54d-430c-b68c-b2dce8209556",
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
  "id": "e23c9602-431a-4a98-8689-6d2cd098e064",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T16:13:15.531175Z",
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
  "command_id": "881f32ae-ba5a-44fb-9c0c-e755f434f7fd",
  "quote_id": "e23c9602-431a-4a98-8689-6d2cd098e064",
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
  "id": "22939aaa-05af-4fc1-ad6c-10db72288760",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9c233f17-d601-4990-96f0-ebc0324a758d",
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
  "created_at": "2026-10-30T16:08:15.819513Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/22939aaa-05af-4fc1-ad6c-10db72288760` → **200**

```json
{
  "id": "22939aaa-05af-4fc1-ad6c-10db72288760",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9c233f17-d601-4990-96f0-ebc0324a758d",
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
  "created_at": "2026-10-30T16:08:15.819513Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/22939aaa-05af-4fc1-ad6c-10db72288760/cancel` → **200**

```json
{
  "command_id": "8e0337a8-4fe0-4ff2-8b29-da3c694c6145",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "22939aaa-05af-4fc1-ad6c-10db72288760",
  "short_number": 6,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "9c233f17-d601-4990-96f0-ebc0324a758d",
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
  "created_at": "2026-10-30T16:08:15.819513Z",
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
  "command_id": "5fcc111e-db1b-426c-b3e8-0316b4bb2213",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:08:17Z",
    "sequence": 1793376497153
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "9e402278-177a-4a81-80dc-3151a4be19e5",
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
  "last_heartbeat_at": "2026-10-30T16:08:17.03244Z",
  "last_location_at": "2026-10-30T16:08:17.03244Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-11173"
}
```

```json
{
  "challenge_id": "8ea67d63-0b7b-40a1-b198-582887bdfe0d",
  "expires_at": "2026-10-30T16:13:17.303119369Z",
  "resend_available_at": "2026-10-30T16:08:18.303119369Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "452908",
  "sent_at": "2026-10-30T16:08:17.30638182Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8ea67d63-0b7b-40a1-b198-582887bdfe0d",
  "code": "452908",
  "device_ref": "sandbox-11173"
}
```

```json
{
  "session_id": "8e5ba8b9-d8fb-4779-bbe6-80edf48b3aa1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NzM5NywiaWF0IjoxNzkzMzc2NDk3LCJqdGkiOiJlNWQwMzY0ZC1iNjhiLTRhZTItOTgwMy03NjRjY2E1NWFhN2UiLCJzaWQiOiI4ZTViYThiOS1kOGZiLTQ3NzktYmJlNi04MGVkZjQ4YjNhYTEifQ.Dzw7AAOA5OjTTsFDdnigGx9W0e9Uvhz4MadUCYz0Thw",
  "access_expires_at": "2026-10-30T16:23:17.592506743Z",
  "refresh_token": "QWDEzzd7Oqx1BRF17QFgrbAb5c0MKRU2jZ6BlnZ27zA",
  "refresh_expires_at": "2026-11-29T16:08:17.592046049Z",
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
  "command_id": "3586825c-8bee-4e60-9f28-4dd54f7dde6e",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:08:18Z",
    "sequence": 1793376498130
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "1f30c3b2-4398-4820-abc1-34f7f8a3aacf",
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
  "last_heartbeat_at": "2026-10-30T16:08:18.147391Z",
  "last_location_at": "2026-10-30T16:08:18.147391Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e37a8dcd-f5e1-4084-81e9-38ca353b009c",
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
  "id": "42287077-a13d-4409-a081-ac0a64281458",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T16:13:18.424645Z",
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
  "command_id": "b3faf496-b64e-43f2-8a89-4a0a9ebe45fd",
  "quote_id": "42287077-a13d-4409-a081-ac0a64281458",
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
  "id": "a3a277fb-5047-4436-bc92-1b096ad1b901",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9c233f17-d601-4990-96f0-ebc0324a758d",
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
  "created_at": "2026-10-30T16:08:18.713463Z",
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
    "id": "b9c0c1af-2fce-40f9-9c9e-9c082aaa45ae",
    "order_id": "a3a277fb-5047-4436-bc92-1b096ad1b901",
    "expires_at": "2026-10-30T16:08:33.716917Z",
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

`POST /api/driver/v1/offers/b9c0c1af-2fce-40f9-9c9e-9c082aaa45ae/accept` → **200**

```json
{
  "command_id": "eb22f2bf-03ce-4fb0-be5e-6043b3b1c87c"
}
```

```json
{
  "id": "59845790-b16f-41dd-8959-88c8204c8482",
  "order_id": "a3a277fb-5047-4436-bc92-1b096ad1b901",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "acd2d9f2-8700-40ed-9db3-d3f7aa271e68",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "acd2d9f2-8700-40ed-9db3-d3f7aa271e68",
  "order_id": "a3a277fb-5047-4436-bc92-1b096ad1b901",
  "assignment_id": "59845790-b16f-41dd-8959-88c8204c8482",
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

`POST /api/driver/v1/trips/acd2d9f2-8700-40ed-9db3-d3f7aa271e68/cancel` → **200**

```json
{
  "command_id": "2d09a5d2-1a7d-4879-9329-d37dd6b7cad6",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "acd2d9f2-8700-40ed-9db3-d3f7aa271e68",
  "order_id": "a3a277fb-5047-4436-bc92-1b096ad1b901",
  "assignment_id": "59845790-b16f-41dd-8959-88c8204c8482",
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

`GET /api/rider/v1/orders/a3a277fb-5047-4436-bc92-1b096ad1b901` → **200**

```json
{
  "id": "a3a277fb-5047-4436-bc92-1b096ad1b901",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "9c233f17-d601-4990-96f0-ebc0324a758d",
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
    "id": "59845790-b16f-41dd-8959-88c8204c8482",
    "order_id": "a3a277fb-5047-4436-bc92-1b096ad1b901",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "acd2d9f2-8700-40ed-9db3-d3f7aa271e68",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T16:08:18.713463Z",
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
    "id": "22cf1b1e-a201-4ebc-940f-412ec805a9a5",
    "order_id": "a3a277fb-5047-4436-bc92-1b096ad1b901",
    "expires_at": "2026-10-30T16:08:34.850624Z",
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

`POST /api/driver/v1/offers/22cf1b1e-a201-4ebc-940f-412ec805a9a5/accept` → **200**

```json
{
  "command_id": "03ef4eb1-bdfd-44c7-b800-583dbe61d1ff"
}
```

```json
{
  "id": "fd21d0f9-1c15-4b59-9c2c-5b3447ff1b72",
  "order_id": "a3a277fb-5047-4436-bc92-1b096ad1b901",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "bdea6af6-32b1-412a-aa5b-c0511dcd0b39",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "bdea6af6-32b1-412a-aa5b-c0511dcd0b39",
  "order_id": "a3a277fb-5047-4436-bc92-1b096ad1b901",
  "assignment_id": "fd21d0f9-1c15-4b59-9c2c-5b3447ff1b72",
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

`POST /api/driver/v1/trips/bdea6af6-32b1-412a-aa5b-c0511dcd0b39/cancel` → **200**

```json
{
  "command_id": "e5569896-d310-48d8-98de-2594ac65f214",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "bdea6af6-32b1-412a-aa5b-c0511dcd0b39",
  "order_id": "a3a277fb-5047-4436-bc92-1b096ad1b901",
  "assignment_id": "fd21d0f9-1c15-4b59-9c2c-5b3447ff1b72",
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
      "id": "a3a277fb-5047-4436-bc92-1b096ad1b901",
      "short_number": 7,
      "status": "CANCELLED",
      "created_at": "2026-10-30T16:08:18.713463Z",
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
      "id": "22939aaa-05af-4fc1-ad6c-10db72288760",
      "short_number": 6,
      "status": "CANCELLED",
      "created_at": "2026-10-30T16:08:15.819513Z",
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

`GET /api/operator/v1/orders/a3a277fb-5047-4436-bc92-1b096ad1b901/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T16:08:18.714019Z",
      "actor": {
        "type": "CLIENT",
        "id": "9c233f17-d601-4990-96f0-ebc0324a758d",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "a3a277fb-5047-4436-bc92-1b096ad1b901",
        "quote_id": "42287077-a13d-4409-a081-ac0a64281458",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "51d7340f-8f0f-46c8-ace6-35d57dc1b44c"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T16:08:18.716014Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "a3a277fb-5047-4436-bc92-1b096ad1b901",
        "attempt_id": "91e25c3c-9522-4b5a-b420-eb8dfa7ef2ba",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "51d7340f-8f0f-46c8-ace6-35d57dc1b44c"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T16:08:18.740627Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "b9c0c1af-2fce-40f9-9c9e-9c082aaa45ae",
        "order_id": "a3a277fb-5047-4436-bc92-1b096ad1b901",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "51d7340f-8f0f-46c8-ace6-35d57dc1b44c"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T16:08:19.303803Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "b9c0c1af-2fce-40f9-9c9e-9c082aaa45ae",
        "order_id": "a3a277fb-5047-4436-bc92-1b096ad1b901",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "59845790-b16f-41dd-8959-88c8204c8482"
      },
      "correlation_id": "4f69ec86-108d-4610-a6b0-520f45e42af7"
```

Done: orders 22939aaa-05af-4fc1-ad6c-10db72288760, a3a277fb-5047-4436-bc92-1b096ad1b901.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380730252493",
  "device_ref": "sandbox-7639"
}
```

```json
{
  "challenge_id": "2ceb9150-6bd2-490c-89b6-4792367a259b",
  "expires_at": "2026-10-30T16:13:22.103354613Z",
  "resend_available_at": "2026-10-30T16:08:23.103354613Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380730252493` → **200**

```json
{
  "phone": "+380730252493",
  "audience": "CLIENT",
  "code": "188651",
  "sent_at": "2026-10-30T16:08:22.114950877Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2ceb9150-6bd2-490c-89b6-4792367a259b",
  "code": "188651",
  "device_ref": "sandbox-7639"
}
```

```json
{
  "session_id": "7dc0cdcd-e232-4bc6-a24c-e8d50a90e92e",
  "subject": {
    "type": "CLIENT",
    "id": "f6f42895-47b2-4724-86db-48f8f5599e97"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNmY0Mjg5NS00N2IyLTQ3MjQtODZkYi00OGY4ZjU1OTllOTciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc3NDAyLCJpYXQiOjE3OTMzNzY1MDIsImp0aSI6IjgxN2QwNzY4LTc2NjQtNDgyNC1iZWE5LTJmZDBmMWY1ZTBiOSIsInNpZCI6IjdkYzBjZGNkLWUyMzItNGJjNi1hMjRjLWU4ZDUwYTkwZTkyZSJ9.xGTznZp2dovqLrDXE00qT6Xn0qBYlyB51jfTEJoD_sE",
  "access_expires_at": "2026-10-30T16:23:22.408996047Z",
  "refresh_token": "aHutnA2ZKjq0h77FqY3xdZC9WEIdi8-GosFlRBmpQYA",
  "refresh_expires_at": "2026-11-29T16:08:22.408369354Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "62345faa-a018-4440-b3eb-4ec02caf3bb6",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "7a037b69-bbef-4263-b28c-4cad726c4430",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-7a037b69-bbef-4263-b28c-4cad726c4430",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "398eaf18eabef7d8b8755ce722065557",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=7a037b69-bbef-4263-b28c-4cad726c4430",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380730252493"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=7a037b69-bbef-4263-b28c-4cad726c4430",
  "expires_at": "2026-10-30T16:38:22.674921Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/7a037b69-bbef-4263-b28c-4cad726c4430` → **200**

```json
{
  "id": "7a037b69-bbef-4263-b28c-4cad726c4430",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T16:38:22.674921Z",
  "card": {
    "id": "3c09f747-c568-4d4e-b160-310a24f3c949",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****1134",
    "card_type": "Visa",
    "created_at": "2026-10-30T16:08:22.963733Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "3c09f747-c568-4d4e-b160-310a24f3c949",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****1134",
      "card_type": "Visa",
      "created_at": "2026-10-30T16:08:22.963733Z"
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
  "device_ref": "sandbox-21101"
}
```

```json
{
  "challenge_id": "8b9a4422-5dd5-4fe1-b17b-4b0afd0b4319",
  "expires_at": "2026-10-30T16:13:23.509416825Z",
  "resend_available_at": "2026-10-30T16:08:24.509416825Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "717535",
  "sent_at": "2026-10-30T16:08:23.512925914Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8b9a4422-5dd5-4fe1-b17b-4b0afd0b4319",
  "code": "717535",
  "device_ref": "sandbox-21101"
}
```

```json
{
  "session_id": "81d1eb37-b961-4be8-b976-8e8a51a58f4d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NzQwMywiaWF0IjoxNzkzMzc2NTAzLCJqdGkiOiIyN2Y5ZDMyMS1mNDY5LTRhNDYtYmI5OC05NTIyZThmMGY3ZWUiLCJzaWQiOiI4MWQxZWIzNy1iOTYxLTRiZTgtYjk3Ni04ZThhNTFhNThmNGQifQ.jpK-tMwvVFzuGIJTLYzqiBIKcNb_FGyedW2lKVEsgAE",
  "access_expires_at": "2026-10-30T16:23:23.795443066Z",
  "refresh_token": "4ZlFKi1plAWmQpsKnRmZZPHamg-boxsD_vaZmeztdGs",
  "refresh_expires_at": "2026-11-29T16:08:23.794878548Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "1f30c3b2-4398-4820-abc1-34f7f8a3aacf",
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
  "last_heartbeat_at": "2026-10-30T16:08:18.147391Z",
  "last_location_at": "2026-10-30T16:08:18.147391Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/1f30c3b2-4398-4820-abc1-34f7f8a3aacf/handover` → **200**

```json
{
  "command_id": "961f7ad0-cee3-4dda-81c5-9424984a48e1",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "1f30c3b2-4398-4820-abc1-34f7f8a3aacf",
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
  "last_heartbeat_at": "2026-10-30T16:08:18.147391Z",
  "last_location_at": "2026-10-30T16:08:18.147391Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

(the car drives 43 s to the next point)

`POST /api/driver/v1/work-sessions/1f30c3b2-4398-4820-abc1-34f7f8a3aacf/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:09:07Z",
    "sequence": 1793376547624
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "1f30c3b2-4398-4820-abc1-34f7f8a3aacf",
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
  "last_heartbeat_at": "2026-10-30T16:09:07.643806Z",
  "last_location_at": "2026-10-30T16:09:07.643806Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "488b5e8f-eb94-462c-b6d6-96cd13bf29c1",
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
  "id": "f949c513-94e2-4658-9be2-cecab785ae5d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T16:14:07.921247Z",
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
  "command_id": "d24e791b-3f13-4c05-9c8c-229c9ec268ca",
  "quote_id": "f949c513-94e2-4658-9be2-cecab785ae5d",
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
  "id": "52857749-04c8-4a4e-8a80-9e707d59cb2c",
  "short_number": 8,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "f6f42895-47b2-4724-86db-48f8f5599e97",
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
  "created_at": "2026-10-30T16:09:08.217178Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/52857749-04c8-4a4e-8a80-9e707d59cb2c` → **200**

```json
{
  "id": "52857749-04c8-4a4e-8a80-9e707d59cb2c",
  "short_number": 8,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "f6f42895-47b2-4724-86db-48f8f5599e97",
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
  "created_at": "2026-10-30T16:09:08.217178Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/52857749-04c8-4a4e-8a80-9e707d59cb2c` → **200**

```json
{
  "id": "52857749-04c8-4a4e-8a80-9e707d59cb2c",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "f6f42895-47b2-4724-86db-48f8f5599e97",
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
  "created_at": "2026-10-30T16:09:08.217178Z",
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
    "id": "ad48b72a-ac0f-471d-a7c8-a096c6efbf44",
    "order_id": "52857749-04c8-4a4e-8a80-9e707d59cb2c",
    "expires_at": "2026-10-30T16:09:24.192948Z",
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

`POST /api/driver/v1/offers/ad48b72a-ac0f-471d-a7c8-a096c6efbf44/accept` → **200**

```json
{
  "command_id": "50810360-60c5-4e9c-a3f0-c4c9b5ace07e"
}
```

```json
{
  "id": "20227c47-17d3-4e43-80b9-a31c4ddda7b4",
  "order_id": "52857749-04c8-4a4e-8a80-9e707d59cb2c",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f0fd6e66-7530-4639-9d55-6f1e5d82fb6a",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f0fd6e66-7530-4639-9d55-6f1e5d82fb6a",
  "order_id": "52857749-04c8-4a4e-8a80-9e707d59cb2c",
  "assignment_id": "20227c47-17d3-4e43-80b9-a31c4ddda7b4",
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

`POST /api/driver/v1/work-sessions/1f30c3b2-4398-4820-abc1-34f7f8a3aacf/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:09:16Z",
    "sequence": 1793376556884
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "1f30c3b2-4398-4820-abc1-34f7f8a3aacf",
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
  "last_heartbeat_at": "2026-10-30T16:09:16.902496Z",
  "last_location_at": "2026-10-30T16:09:16.902496Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/f0fd6e66-7530-4639-9d55-6f1e5d82fb6a/arrive` → **200**

```json
{
  "command_id": "d6f21293-b5f9-448d-83c1-90b623cd6ba4",
  "expected_version": 0
}
```

```json
{
  "id": "f0fd6e66-7530-4639-9d55-6f1e5d82fb6a",
  "order_id": "52857749-04c8-4a4e-8a80-9e707d59cb2c",
  "assignment_id": "20227c47-17d3-4e43-80b9-a31c4ddda7b4",
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
  "arrived_at": "2026-10-30T16:09:17.18355Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/f0fd6e66-7530-4639-9d55-6f1e5d82fb6a/start` → **200**

```json
{
  "command_id": "6f4149df-d395-4f02-b2d7-91633379e3dc",
  "expected_version": 1
}
```

```json
{
  "id": "f0fd6e66-7530-4639-9d55-6f1e5d82fb6a",
  "order_id": "52857749-04c8-4a4e-8a80-9e707d59cb2c",
  "assignment_id": "20227c47-17d3-4e43-80b9-a31c4ddda7b4",
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
  "arrived_at": "2026-10-30T16:09:17.18355Z",
  "started_at": "2026-10-30T16:09:17.46653Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/f0fd6e66-7530-4639-9d55-6f1e5d82fb6a/complete` → **200**

```json
{
  "command_id": "29440beb-86d0-4b07-9cb8-0d2f16444efd",
  "expected_version": 2,
  "reported_at": "2026-10-30T16:09:17Z",
  "cash_received": true
}
```

```json
{
  "id": "f0fd6e66-7530-4639-9d55-6f1e5d82fb6a",
  "order_id": "52857749-04c8-4a4e-8a80-9e707d59cb2c",
  "assignment_id": "20227c47-17d3-4e43-80b9-a31c4ddda7b4",
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
  "arrived_at": "2026-10-30T16:09:17.18355Z",
  "started_at": "2026-10-30T16:09:17.46653Z",
  "completed_at": "2026-10-30T16:09:17.753532Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/52857749-04c8-4a4e-8a80-9e707d59cb2c` → **200**

```json
{
  "id": "52857749-04c8-4a4e-8a80-9e707d59cb2c",
  "short_number": 8,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "f6f42895-47b2-4724-86db-48f8f5599e97",
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
    "id": "20227c47-17d3-4e43-80b9-a31c4ddda7b4",
    "order_id": "52857749-04c8-4a4e-8a80-9e707d59cb2c",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "f0fd6e66-7530-4639-9d55-6f1e5d82fb6a",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T16:09:08.217178Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/52857749-04c8-4a4e-8a80-9e707d59cb2c` → **200**

```json
{
  "id": "52857749-04c8-4a4e-8a80-9e707d59cb2c",
  "short_number": 8,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "f6f42895-47b2-4724-86db-48f8f5599e97",
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
    "id": "20227c47-17d3-4e43-80b9-a31c4ddda7b4",
    "order_id": "52857749-04c8-4a4e-8a80-9e707d59cb2c",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "f0fd6e66-7530-4639-9d55-6f1e5d82fb6a",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T16:09:08.217178Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/52857749-04c8-4a4e-8a80-9e707d59cb2c` → **200**

```json
{
  "id": "52857749-04c8-4a4e-8a80-9e707d59cb2c",
  "short_number": 8,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "f6f42895-47b2-4724-86db-48f8f5599e97",
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
    "id": "20227c47-17d3-4e43-80b9-a31c4ddda7b4",
    "order_id": "52857749-04c8-4a4e-8a80-9e707d59cb2c",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "f0fd6e66-7530-4639-9d55-6f1e5d82fb6a",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T16:09:08.217178Z",
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

`GET /api/rider/v1/orders/52857749-04c8-4a4e-8a80-9e707d59cb2c/tip` → **200**

```json
{
  "order_id": "52857749-04c8-4a4e-8a80-9e707d59cb2c",
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
  "available_until": "2026-10-31T16:09:17.753532Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/52857749-04c8-4a4e-8a80-9e707d59cb2c/tip` → **201**

```json
{
  "command_id": "950475dc-7b09-4dbf-8dc0-1871b377dc2f",
  "amount_minor": 2500
}
```

```json
{
  "id": "486d8163-16c6-4642-a564-7a1bf5c4760a",
  "order_id": "52857749-04c8-4a4e-8a80-9e707d59cb2c",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T16:09:21.4386Z"
}
```

`GET /api/rider/v1/orders/52857749-04c8-4a4e-8a80-9e707d59cb2c/tip` → **200**

```json
{
  "order_id": "52857749-04c8-4a4e-8a80-9e707d59cb2c",
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
  "available_until": "2026-10-31T16:09:17.753532Z",
  "open": false,
  "tip": {
    "id": "486d8163-16c6-4642-a564-7a1bf5c4760a",
    "order_id": "52857749-04c8-4a4e-8a80-9e707d59cb2c",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-30T16:09:21.4386Z"
  }
}
```

`GET /api/rider/v1/orders/52857749-04c8-4a4e-8a80-9e707d59cb2c/tip` → **200**

```json
{
  "order_id": "52857749-04c8-4a4e-8a80-9e707d59cb2c",
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
  "available_until": "2026-10-31T16:09:17.753532Z",
  "open": false,
  "tip": {
    "id": "486d8163-16c6-4642-a564-7a1bf5c4760a",
    "order_id": "52857749-04c8-4a4e-8a80-9e707d59cb2c",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T16:09:21.4386Z"
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
      "id": "247f5aa1-ddde-4a9c-8de5-87d4144d8e0c",
      "at": "2026-10-30T16:09:18.295876Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "52857749-04c8-4a4e-8a80-9e707d59cb2c",
      "counterpart_id": null
    }
  ]
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
      "id": "e25243b9-1757-419c-a5eb-5ec8c684db32",
      "at": "2026-10-30T16:09:23.356388Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "52857749-04c8-4a4e-8a80-9e707d59cb2c",
      "counterpart_id": null
    },
    {
      "id": "247f5aa1-ddde-4a9c-8de5-87d4144d8e0c",
      "at": "2026-10-30T16:09:18.295876Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "52857749-04c8-4a4e-8a80-9e707d59cb2c",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "df04af4f-d2ef-4caf-a6e5-337bd1c478e6",
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
  "id": "9e7c7c6a-b5e1-473a-adc7-9f33a60fce26",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T16:14:24.829107Z",
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
  "session_id": "f0100446-9d45-451c-a212-6b803571051a",
  "subject": {
    "type": "STAFF",
    "id": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NTM4N2IzNC1lN2M5LTRhZmYtOTNjMS0wZGQzZjJhY2QwOGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzc0NjUsImlhdCI6MTc5MzM3NjU2NSwianRpIjoiNDYzMWM2ZWEtZTczYS00ZjU3LWEzYWMtN2FlNzQ2MzUzZjc1Iiwic2lkIjoiZjAxMDA0NDYtOWQ0NS00NTFjLWEyMTItNmI4MDM1NzEwNTFhIn0.DcABtnnKfF4rInf_6-R0BlDepbIh_zuY6XXVNHRckXo",
  "access_expires_at": "2026-10-30T16:24:25.410135211Z",
  "refresh_token": "DypQOips-S0DKRYv9iijFCMRptwVeTEtN_i2C8FnrLU",
  "refresh_expires_at": "2026-10-31T04:09:25.409561906Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380730252493` → **200**

```json
{
  "client_id": "f6f42895-47b2-4724-86db-48f8f5599e97"
}
```

`POST /api/admin/v1/rider-wallets/f6f42895-47b2-4724-86db-48f8f5599e97/top-ups` → **201**

```json
{
  "command_id": "d330d33b-bcff-467e-bf99-f4738f995b84",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "f6f42895-47b2-4724-86db-48f8f5599e97",
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
      "id": "6dde6677-d860-4dfe-8ac2-b8b1720e33c3",
      "at": "2026-10-30T16:09:25.939535Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "5683b2e0-a4ff-4904-aaa1-7e86a922915d",
  "quote_id": "9e7c7c6a-b5e1-473a-adc7-9f33a60fce26",
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
  "id": "4e364399-81d1-469d-9e8b-7cefe387b0cd",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f6f42895-47b2-4724-86db-48f8f5599e97",
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
  "created_at": "2026-10-30T16:09:26.239455Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/4e364399-81d1-469d-9e8b-7cefe387b0cd` → **200**

```json
{
  "id": "4e364399-81d1-469d-9e8b-7cefe387b0cd",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f6f42895-47b2-4724-86db-48f8f5599e97",
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
  "created_at": "2026-10-30T16:09:26.239455Z",
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
    "id": "84eacde0-7708-45aa-b7b5-3bfaff059403",
    "order_id": "4e364399-81d1-469d-9e8b-7cefe387b0cd",
    "expires_at": "2026-10-30T16:09:41.242957Z",
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

`POST /api/driver/v1/offers/84eacde0-7708-45aa-b7b5-3bfaff059403/accept` → **200**

```json
{
  "command_id": "fa824fed-2355-40a8-9536-0360d024d843"
}
```

```json
{
  "id": "d3a8d7c6-2af3-4a65-a7eb-c0781c0f16c4",
  "order_id": "4e364399-81d1-469d-9e8b-7cefe387b0cd",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "aa80e3c9-29ba-4b51-89ff-090872088f04",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "aa80e3c9-29ba-4b51-89ff-090872088f04",
  "order_id": "4e364399-81d1-469d-9e8b-7cefe387b0cd",
  "assignment_id": "d3a8d7c6-2af3-4a65-a7eb-c0781c0f16c4",
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

`POST /api/driver/v1/work-sessions/1f30c3b2-4398-4820-abc1-34f7f8a3aacf/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:09:27Z",
    "sequence": 1793376567653
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "1f30c3b2-4398-4820-abc1-34f7f8a3aacf",
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
  "last_heartbeat_at": "2026-10-30T16:09:27.670523Z",
  "last_location_at": "2026-10-30T16:09:27.670523Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/aa80e3c9-29ba-4b51-89ff-090872088f04/arrive` → **200**

```json
{
  "command_id": "de296253-babe-44a7-af6d-ae29f2f3cd78",
  "expected_version": 0
}
```

```json
{
  "id": "aa80e3c9-29ba-4b51-89ff-090872088f04",
  "order_id": "4e364399-81d1-469d-9e8b-7cefe387b0cd",
  "assignment_id": "d3a8d7c6-2af3-4a65-a7eb-c0781c0f16c4",
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
  "arrived_at": "2026-10-30T16:09:27.944827Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/aa80e3c9-29ba-4b51-89ff-090872088f04/start` → **200**

```json
{
  "command_id": "13558dd4-796b-4305-ba53-be8ceb794755",
  "expected_version": 1
}
```

```json
{
  "id": "aa80e3c9-29ba-4b51-89ff-090872088f04",
  "order_id": "4e364399-81d1-469d-9e8b-7cefe387b0cd",
  "assignment_id": "d3a8d7c6-2af3-4a65-a7eb-c0781c0f16c4",
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
  "arrived_at": "2026-10-30T16:09:27.944827Z",
  "started_at": "2026-10-30T16:09:28.221523Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/aa80e3c9-29ba-4b51-89ff-090872088f04/complete` → **200**

```json
{
  "command_id": "b0e97530-7dd2-4afe-8c72-092d9a503bc3",
  "expected_version": 2,
  "reported_at": "2026-10-30T16:09:28Z",
  "cash_received": true
}
```

```json
{
  "id": "aa80e3c9-29ba-4b51-89ff-090872088f04",
  "order_id": "4e364399-81d1-469d-9e8b-7cefe387b0cd",
  "assignment_id": "d3a8d7c6-2af3-4a65-a7eb-c0781c0f16c4",
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
  "arrived_at": "2026-10-30T16:09:27.944827Z",
  "started_at": "2026-10-30T16:09:28.221523Z",
  "completed_at": "2026-10-30T16:09:28.506771Z",
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
  "client_id": "f6f42895-47b2-4724-86db-48f8f5599e97",
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
      "id": "6dde6677-d860-4dfe-8ac2-b8b1720e33c3",
      "at": "2026-10-30T16:09:25.939535Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f",
      "order_id": null
    }
  ]
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

`GET /api/rider/v1/orders/4e364399-81d1-469d-9e8b-7cefe387b0cd/tip` → **200**

```json
{
  "order_id": "4e364399-81d1-469d-9e8b-7cefe387b0cd",
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
  "available_until": "2026-10-31T16:09:28.506771Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/4e364399-81d1-469d-9e8b-7cefe387b0cd/tip` → **201**

```json
{
  "command_id": "98dfeb74-7bfe-4188-a399-9933f84a1310",
  "amount_minor": 2500
}
```

```json
{
  "id": "836693c6-0cba-4bc3-86a2-2948ecec30b7",
  "order_id": "4e364399-81d1-469d-9e8b-7cefe387b0cd",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T16:09:29.620888Z"
}
```

`GET /api/rider/v1/orders/4e364399-81d1-469d-9e8b-7cefe387b0cd/tip` → **200**

```json
{
  "order_id": "4e364399-81d1-469d-9e8b-7cefe387b0cd",
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
  "available_until": "2026-10-31T16:09:28.506771Z",
  "open": false,
  "tip": {
    "id": "836693c6-0cba-4bc3-86a2-2948ecec30b7",
    "order_id": "4e364399-81d1-469d-9e8b-7cefe387b0cd",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-30T16:09:29.620888Z"
  }
}
```

`GET /api/rider/v1/orders/4e364399-81d1-469d-9e8b-7cefe387b0cd/tip` → **200**

```json
{
  "order_id": "4e364399-81d1-469d-9e8b-7cefe387b0cd",
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
  "available_until": "2026-10-31T16:09:28.506771Z",
  "open": false,
  "tip": {
    "id": "836693c6-0cba-4bc3-86a2-2948ecec30b7",
    "order_id": "4e364399-81d1-469d-9e8b-7cefe387b0cd",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T16:09:29.620888Z"
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
      "id": "31a030bf-d47f-4c61-952f-b53e60579b10",
      "at": "2026-10-30T16:09:29.416719Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "4e364399-81d1-469d-9e8b-7cefe387b0cd",
      "counterpart_id": null
    },
    {
      "id": "e25243b9-1757-419c-a5eb-5ec8c684db32",
      "at": "2026-10-30T16:09:23.356388Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "52857749-04c8-4a4e-8a80-9e707d59cb2c",
      "counterpart_id": null
    },
    {
      "id": "247f5aa1-ddde-4a9c-8de5-87d4144d8e0c",
      "at": "2026-10-30T16:09:18.295876Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "52857749-04c8-4a4e-8a80-9e707d59cb2c",
      "counterpart_id": null
    }
  ]
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
      "id": "753919bf-1d94-4e06-8cd8-bb38cf671e25",
      "at": "2026-10-30T16:09:31.441987Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "4e364399-81d1-469d-9e8b-7cefe387b0cd",
      "counterpart_id": null
    },
    {
      "id": "31a030bf-d47f-4c61-952f-b53e60579b10",
      "at": "2026-10-30T16:09:29.416719Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "4e364399-81d1-469d-9e8b-7cefe387b0cd",
      "counterpart_id": null
    },
    {
      "id": "e25243b9-1757-419c-a5eb-5ec8c684db32",
      "at": "2026-10-30T16:09:23.356388Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "52857749-04c8-4a4e-8a80-9e707d59cb2c",
      "counterpart_id": null
    },
    {
      "id": "247f5aa1-ddde-4a9c-8de5-87d4144d8e0c",
      "at": "2026-10-30T16:09:18.295876Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "52857749-04c8-4a4e-8a80-9e707d59cb2c",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "1f30c3b2-4398-4820-abc1-34f7f8a3aacf",
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
  "last_heartbeat_at": "2026-10-30T16:09:27.670523Z",
  "last_location_at": "2026-10-30T16:09:27.670523Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/1f30c3b2-4398-4820-abc1-34f7f8a3aacf/close` → **200**

```json
{
  "command_id": "242ec3b6-6899-4bec-a2eb-8ca22e5887d1",
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

Done: card order 4e364399-81d1-469d-9e8b-7cefe387b0cd.

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
  "phone": "+380736780875",
  "device_ref": "sandbox-24079"
}
```

```json
{
  "challenge_id": "e94d45db-d233-4519-a28b-c935b2c47cba",
  "expires_at": "2026-10-30T16:14:33.785059839Z",
  "resend_available_at": "2026-10-30T16:09:34.785059839Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380736780875` → **200**

```json
{
  "phone": "+380736780875",
  "audience": "CLIENT",
  "code": "348234",
  "sent_at": "2026-10-30T16:09:33.787443361Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e94d45db-d233-4519-a28b-c935b2c47cba",
  "code": "348234",
  "device_ref": "sandbox-24079"
}
```

```json
{
  "session_id": "37128feb-2612-45ac-a8c7-f1cafe5cc029",
  "subject": {
    "type": "CLIENT",
    "id": "782eaf0c-93e0-4a4f-9a7e-f7a99a5af720"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ODJlYWYwYy05M2UwLTRhNGYtOWE3ZS1mN2E5OWE1YWY3MjAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc3NDc0LCJpYXQiOjE3OTMzNzY1NzQsImp0aSI6ImQ4ZDJmYTU4LTU4NmItNDY0Mi1hMThlLWY1ODkxMmE4OGExYyIsInNpZCI6IjM3MTI4ZmViLTI2MTItNDVhYy1hOGM3LWYxY2FmZTVjYzAyOSJ9.YG5RJ3lBlZpw3nRwz1aGahZvdFnySP_oTXqtq3pUDdw",
  "access_expires_at": "2026-10-30T16:24:34.073415905Z",
  "refresh_token": "2GR3XG2vzhPzbKlCciFRO3uzE9GqYvQQCEH02LW56fc",
  "refresh_expires_at": "2026-11-29T16:09:34.072898892Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "16459304-1870-4109-968f-6ff6e380c6c8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "04963503-e5ff-47b9-aedf-6627700284f8",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-04963503-e5ff-47b9-aedf-6627700284f8",
    "orderDate": "1793376574",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "442b33a7e9d8ed8087281b641068561a",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=04963503-e5ff-47b9-aedf-6627700284f8",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380736780875"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=04963503-e5ff-47b9-aedf-6627700284f8",
  "created_at": "2026-10-30T16:09:34.345808Z",
  "expires_at": "2026-10-30T16:39:34.345808Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/04963503-e5ff-47b9-aedf-6627700284f8` → **200**

```json
{
  "id": "04963503-e5ff-47b9-aedf-6627700284f8",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T16:09:34.345808Z",
  "expires_at": "2026-10-30T16:39:34.345808Z",
  "completed_at": "2026-10-30T16:09:34.624498Z",
  "masked_pan": "41****6133",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "782eaf0c-93e0-4a4f-9a7e-f7a99a5af720",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "782eaf0c-93e0-4a4f-9a7e-f7a99a5af720",
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
      "id": "86249c64-431f-4602-9963-7e7df74230e8",
      "at": "2026-10-30T16:09:35.460544Z",
      "kind": "CARD_TOP_UP",
      "currency": "UAH",
      "amount_minor": 15000,
      "reason": "Top-up by card",
      "staff_id": null,
      "order_id": null
    }
  ]
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "782eaf0c-93e0-4a4f-9a7e-f7a99a5af720",
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
      "id": "86249c64-431f-4602-9963-7e7df74230e8",
      "at": "2026-10-30T16:09:35.460544Z",
      "kind": "CARD_TOP_UP",
      "currency": "UAH",
      "amount_minor": 15000,
      "reason": "Top-up by card",
      "staff_id": null,
      "order_id": null
    }
  ]
}
```

## The driver tops up the balance by 500.00

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-2381"
}
```

```json
{
  "challenge_id": "2b3e0f7a-9f5e-4289-91e9-0dded1714f5d",
  "expires_at": "2026-10-30T16:14:36.698011822Z",
  "resend_available_at": "2026-10-30T16:09:37.698011822Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "275413",
  "sent_at": "2026-10-30T16:09:36.700907894Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2b3e0f7a-9f5e-4289-91e9-0dded1714f5d",
  "code": "275413",
  "device_ref": "sandbox-2381"
}
```

```json
{
  "session_id": "1cdb2b08-a078-4424-bb66-123c126ea192",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NzQ3NiwiaWF0IjoxNzkzMzc2NTc2LCJqdGkiOiI2OTE5Nzk5OS04MDY4LTQ5OGUtOTRjMi0wZDg1MmRmMmQ4NzEiLCJzaWQiOiIxY2RiMmIwOC1hMDc4LTQ0MjQtYmI2Ni0xMjNjMTI2ZWExOTIifQ.hUqt7jdpjrm-tRIeNyDhI1pPhqvc51hxX8hug2Fss5o",
  "access_expires_at": "2026-10-30T16:24:36.998767098Z",
  "refresh_token": "Dqs3isGyGQGlr5MkMjBRsh_405d3cJpx9pCtc1yG1ew",
  "refresh_expires_at": "2026-11-29T16:09:36.998090235Z",
  "account_created": false
}
```

`GET /api/driver/v1/balance/history` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "balances": [],
  "entries": []
}
```

`POST /api/driver/v1/balance/card-top-ups` → **201**

```json
{
  "command_id": "d2878467-a18b-48d0-8452-d5920454c23c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "86da3323-fdb9-43dd-b4fc-5319c7c5dfda",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-86da3323-fdb9-43dd-b4fc-5319c7c5dfda",
    "orderDate": "1793376577",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "e452deb60725ffc596e3cb22079923ab",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=86da3323-fdb9-43dd-b4fc-5319c7c5dfda",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=86da3323-fdb9-43dd-b4fc-5319c7c5dfda",
  "created_at": "2026-10-30T16:09:37.539962Z",
  "expires_at": "2026-10-30T16:39:37.539962Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/86da3323-fdb9-43dd-b4fc-5319c7c5dfda` → **200**

```json
{
  "id": "86da3323-fdb9-43dd-b4fc-5319c7c5dfda",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T16:09:37.539962Z",
  "expires_at": "2026-10-30T16:39:37.539962Z",
  "completed_at": "2026-10-30T16:09:37.814813Z",
  "masked_pan": "41****1055",
  "failure_reason": null
}
```

`GET /api/driver/v1/balance/history` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "balances": [],
  "entries": []
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
      "id": "92c82881-3746-442f-858b-f4c6d113d14a",
      "at": "2026-10-30T16:09:38.468427Z",
      "kind": "CARD_TOP_UP",
      "currency": "UAH",
      "amount_minor": 50000,
      "reason": "Top-up by card",
      "order_id": null,
      "counterpart_id": null
    }
  ]
}
```

## A rider's token does not open the driver's path

`POST /api/driver/v1/balance/card-top-ups` → **401**

```json
{
  "command_id": "e808595d-b14d-477b-973c-d0bcc10d23a3",
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
  "correlation_id": "8651f1f2-6184-49d7-8f44-10cf18b2cfff"
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
  "device_ref": "sandbox-30012"
}
```

```json
{
  "challenge_id": "0cfd20c3-c3b4-46fa-83b3-cdef5ab97f18",
  "expires_at": "2026-10-30T16:14:39.921889354Z",
  "resend_available_at": "2026-10-30T16:09:40.921889354Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "203758",
  "sent_at": "2026-10-30T16:09:39.92519262Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0cfd20c3-c3b4-46fa-83b3-cdef5ab97f18",
  "code": "203758",
  "device_ref": "sandbox-30012"
}
```

```json
{
  "session_id": "eac9a927-26f1-4051-9ded-6314404cacc6",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NzQ4MCwiaWF0IjoxNzkzMzc2NTgwLCJqdGkiOiI2ZDgzNzQ2MC1jNjNiLTQ5NDMtODc0Yi00ZWE5ZmNhMGM2NjQiLCJzaWQiOiJlYWM5YTkyNy0yNmYxLTQwNTEtOWRlZC02MzE0NDA0Y2FjYzYifQ.blwEH6HaskLjIINQiKdfkUCsSFr0XuCy6FkYfnfL4IA",
  "access_expires_at": "2026-10-30T16:24:40.212517996Z",
  "refresh_token": "BN9eUUBbyC50_cpC8ifqgSVDgogTDP51iVurGZTm4H0",
  "refresh_expires_at": "2026-11-29T16:09:40.211863841Z",
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
  "command_id": "023e63c7-e022-4d3c-b90f-2b7770fad720",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:09:40Z",
    "sequence": 1793376580749
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "26060a9d-eee2-442b-a78d-eff6e283e8f7",
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
  "last_heartbeat_at": "2026-10-30T16:09:40.765619Z",
  "last_location_at": "2026-10-30T16:09:40.765619Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A rider orders for cash

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637038223",
  "device_ref": "sandbox-1046"
}
```

```json
{
  "challenge_id": "2802e7d4-0549-4a9e-8c96-f33af9fd42d4",
  "expires_at": "2026-10-30T16:14:41.037634957Z",
  "resend_available_at": "2026-10-30T16:09:42.037634957Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637038223` → **200**

```json
{
  "phone": "+380637038223",
  "audience": "CLIENT",
  "code": "125111",
  "sent_at": "2026-10-30T16:09:41.040867351Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2802e7d4-0549-4a9e-8c96-f33af9fd42d4",
  "code": "125111",
  "device_ref": "sandbox-1046"
}
```

```json
{
  "session_id": "5a8af83d-60e6-4421-ad93-5d92ea418fed",
  "subject": {
    "type": "CLIENT",
    "id": "2aca90f2-2e60-4836-a47d-9f8f4d61571e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYWNhOTBmMi0yZTYwLTQ4MzYtYTQ3ZC05ZjhmNGQ2MTU3MWUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc3NDgxLCJpYXQiOjE3OTMzNzY1ODEsImp0aSI6ImUwZWFiODY5LTI5MGQtNDc1Ny1iZWUwLTA0NTJiNzA5MjM2MiIsInNpZCI6IjVhOGFmODNkLTYwZTYtNDQyMS1hZDkzLTVkOTJlYTQxOGZlZCJ9.KrbcHEKhA2WIbYF768JJkQZSJTwqCUOa-ZDiRMoB-Aw",
  "access_expires_at": "2026-10-30T16:24:41.327626997Z",
  "refresh_token": "7a67HwnQ2EgLO2kpd2rL8yA8RF-xNDUaD8-qbJTUMOI",
  "refresh_expires_at": "2026-11-29T16:09:41.327182655Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1d63a9cf-04dc-4b94-8635-140ed77c0633",
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
  "id": "a205d0ae-b02a-48ca-94bf-1fcb1f3f7b40",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T16:14:41.600801Z",
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
  "command_id": "f4bac6f5-6988-4a36-8436-bb35d6f44192",
  "quote_id": "a205d0ae-b02a-48ca-94bf-1fcb1f3f7b40",
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
  "id": "c2655250-d1c9-4f63-88bb-90cefc5bba4a",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2aca90f2-2e60-4836-a47d-9f8f4d61571e",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T16:09:41.886046Z",
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
    "id": "a2643938-a645-4fb2-84ea-8514e69990fd",
    "order_id": "c2655250-d1c9-4f63-88bb-90cefc5bba4a",
    "expires_at": "2026-10-30T16:09:56.888771Z",
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

`POST /api/driver/v1/offers/a2643938-a645-4fb2-84ea-8514e69990fd/accept` → **200**

```json
{
  "command_id": "f90cecc5-279b-4b9d-9a53-ce3583b31626"
}
```

```json
{
  "id": "b3438610-162f-4f2b-9f75-9d8a97558911",
  "order_id": "c2655250-d1c9-4f63-88bb-90cefc5bba4a",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f511fe0e-3aac-4aa7-a192-507d6ff5cc3b",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f511fe0e-3aac-4aa7-a192-507d6ff5cc3b",
  "order_id": "c2655250-d1c9-4f63-88bb-90cefc5bba4a",
  "assignment_id": "b3438610-162f-4f2b-9f75-9d8a97558911",
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

`POST /api/driver/v1/work-sessions/26060a9d-eee2-442b-a78d-eff6e283e8f7/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:09:43Z",
    "sequence": 1793376583131
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "26060a9d-eee2-442b-a78d-eff6e283e8f7",
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
  "last_heartbeat_at": "2026-10-30T16:09:43.034463Z",
  "last_location_at": "2026-10-30T16:09:43.034463Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/f511fe0e-3aac-4aa7-a192-507d6ff5cc3b/arrive` → **200**

```json
{
  "command_id": "d56bf557-f0f9-4f0e-8184-1432e92c41d9",
  "expected_version": 0
}
```

```json
{
  "id": "f511fe0e-3aac-4aa7-a192-507d6ff5cc3b",
  "order_id": "c2655250-d1c9-4f63-88bb-90cefc5bba4a",
  "assignment_id": "b3438610-162f-4f2b-9f75-9d8a97558911",
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
  "arrived_at": "2026-10-30T16:09:43.322798Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/f511fe0e-3aac-4aa7-a192-507d6ff5cc3b/start` → **200**

```json
{
  "command_id": "201ed04d-1092-4e1f-a210-fb90b552c3b9",
  "expected_version": 1
}
```

```json
{
  "id": "f511fe0e-3aac-4aa7-a192-507d6ff5cc3b",
  "order_id": "c2655250-d1c9-4f63-88bb-90cefc5bba4a",
  "assignment_id": "b3438610-162f-4f2b-9f75-9d8a97558911",
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
  "arrived_at": "2026-10-30T16:09:43.322798Z",
  "started_at": "2026-10-30T16:09:43.61153Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/f511fe0e-3aac-4aa7-a192-507d6ff5cc3b/complete` → **200**

```json
{
  "command_id": "d39875a0-cc65-40c1-8923-2afcb73180e9",
  "expected_version": 2,
  "reported_at": "2026-10-30T16:09:43Z",
  "cash_received": false
}
```

```json
{
  "id": "f511fe0e-3aac-4aa7-a192-507d6ff5cc3b",
  "order_id": "c2655250-d1c9-4f63-88bb-90cefc5bba4a",
  "assignment_id": "b3438610-162f-4f2b-9f75-9d8a97558911",
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
  "arrived_at": "2026-10-30T16:09:43.322798Z",
  "started_at": "2026-10-30T16:09:43.61153Z",
  "completed_at": "2026-10-30T16:09:43.898934Z",
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
  "session_id": "9e2ee711-eedb-4a77-bc91-643a90983242",
  "subject": {
    "type": "STAFF",
    "id": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NTM4N2IzNC1lN2M5LTRhZmYtOTNjMS0wZGQzZjJhY2QwOGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzc0ODQsImlhdCI6MTc5MzM3NjU4NCwianRpIjoiMjU2YWZkYzItYTllNC00MTcxLTk3MDQtY2IwYzEwNDVjYmUwIiwic2lkIjoiOWUyZWU3MTEtZWVkYi00YTc3LWJjOTEtNjQzYTkwOTgzMjQyIn0.Cy492tktbW58EeMDWaa0nmaAUvSau7L2DfxZg6Zknjo",
  "access_expires_at": "2026-10-30T16:24:44.471535708Z",
  "refresh_token": "hrphSiZWVEquJGknl-M0jl23cIzS_K_apHJoPDu-pPw",
  "refresh_expires_at": "2026-10-31T04:09:44.470990275Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/c2655250-d1c9-4f63-88bb-90cefc5bba4a/cash-dispute` → **200**

```json
{
  "order_id": "c2655250-d1c9-4f63-88bb-90cefc5bba4a",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "2aca90f2-2e60-4836-a47d-9f8f4d61571e",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T16:09:44.524791Z",
  "decide_by": "2026-11-13T16:09:44.524791Z",
  "decision": null,
  "decided_by": null,
  "reason": null,
  "decided_at": null,
  "version": 1
}
```

Dispute: {"held_minor":0,"rider_debt_minor":10517,"decide_by":"2026-11-13T16:09:44.524791Z","decision":null}

`GET /api/admin/v1/cash-disputes` → **200**

```json
{
  "disputes": [
    {
      "order_id": "c2655250-d1c9-4f63-88bb-90cefc5bba4a",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "payer_client_id": "2aca90f2-2e60-4836-a47d-9f8f4d61571e",
      "currency": "UAH",
      "held_minor": 0,
      "rider_debt_minor": 10517,
      "opened_at": "2026-10-30T16:09:44.524791Z",
      "decide_by": "2026-11-13T16:09:44.524791Z",
      "decision": null,
      "decided_by": null,
      "reason": null,
      "decided_at": null,
      "version": 1
    }
  ]
}
```

## Finance decides: the rider did not pay, the service pays the driver

`POST /api/admin/v1/orders/c2655250-d1c9-4f63-88bb-90cefc5bba4a/cash-dispute/decide` → **400**

```json
{
  "command_id": "d02729ab-0b53-4e59-9499-840330c4af0a",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/orders/c2655250-d1c9-4f63-88bb-90cefc5bba4a/cash-dispute/decide",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "366ca389-74c1-456e-8c5f-570cc8b11252",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

`POST /api/admin/v1/orders/c2655250-d1c9-4f63-88bb-90cefc5bba4a/cash-dispute/decide` → **200**

```json
{
  "command_id": "cafb644c-bb0a-41ae-a68d-5a51cbace6fa",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": "The rider does not answer calls"
}
```

```json
{
  "order_id": "c2655250-d1c9-4f63-88bb-90cefc5bba4a",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "2aca90f2-2e60-4836-a47d-9f8f4d61571e",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T16:09:44.524791Z",
  "decide_by": "2026-11-13T16:09:44.524791Z",
  "decision": "PAY_DRIVER",
  "decided_by": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f",
  "reason": "The rider does not answer calls",
  "decided_at": "2026-10-30T16:09:45.610713Z",
  "version": 2
}
```

`POST /api/admin/v1/orders/c2655250-d1c9-4f63-88bb-90cefc5bba4a/cash-dispute/decide` → **409**

```json
{
  "command_id": "372e94bf-cc03-4f9d-b734-ec1a2998d333",
  "expected_version": 2,
  "decision": "RIDER_PAID",
  "reason": "Again"
}
```

```json
{
  "instance": "/api/admin/v1/orders/c2655250-d1c9-4f63-88bb-90cefc5bba4a/cash-dispute/decide",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "5160a82d-d52a-4a17-a5d0-4599eb0ca8f1"
}
```

Done: an unpaid cash trip became a dispute and was decided once.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "26060a9d-eee2-442b-a78d-eff6e283e8f7",
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
  "last_heartbeat_at": "2026-10-30T16:09:43.034463Z",
  "last_location_at": "2026-10-30T16:09:43.034463Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/26060a9d-eee2-442b-a78d-eff6e283e8f7/close` → **200**

```json
{
  "command_id": "d41b0a8f-0c7b-498d-adf8-daa62fa53e11",
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
  "phone": "+380736089092",
  "device_ref": "sandbox-12651"
}
```

```json
{
  "challenge_id": "ae984c98-a4b2-4477-a3f0-ae3e83d3257f",
  "expires_at": "2026-10-30T16:14:46.715779789Z",
  "resend_available_at": "2026-10-30T16:09:47.715779789Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380736089092` → **200**

```json
{
  "phone": "+380736089092",
  "audience": "CLIENT",
  "code": "057776",
  "sent_at": "2026-10-30T16:09:46.71846843Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ae984c98-a4b2-4477-a3f0-ae3e83d3257f",
  "code": "057776",
  "device_ref": "sandbox-12651"
}
```

```json
{
  "session_id": "375b7122-372d-41d3-895d-b9bdd5e58ab6",
  "subject": {
    "type": "CLIENT",
    "id": "5282579e-10c8-4591-846c-a6b6b28f15cc"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MjgyNTc5ZS0xMGM4LTQ1OTEtODQ2Yy1hNmI2YjI4ZjE1Y2MiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc3NDg3LCJpYXQiOjE3OTMzNzY1ODcsImp0aSI6IjgyZDQ3MTFmLWQ3Y2ItNDc0ZS04NjUwLTk0NWFhNWY1N2YwMCIsInNpZCI6IjM3NWI3MTIyLTM3MmQtNDFkMy04OTVkLWI5YmRkNWU1OGFiNiJ9.ImQDIBC4j37QmRjGgXkxxXWw1RS5hED9OEorRLf4D4I",
  "access_expires_at": "2026-10-30T16:24:47.002939988Z",
  "refresh_token": "eILzD9otQa2pICvHKLsapvv_r-wfxd5D48Odbg2iIDg",
  "refresh_expires_at": "2026-11-29T16:09:47.002462291Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "3a0d31c8-d218-4f4b-9b0a-c0043303d496",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "08fe79a1-5e9d-4cbb-8172-b3350f7e9e21",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-08fe79a1-5e9d-4cbb-8172-b3350f7e9e21",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "b8b43642fee26bc00a1b17dfe942910f",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=08fe79a1-5e9d-4cbb-8172-b3350f7e9e21",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380736089092"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=08fe79a1-5e9d-4cbb-8172-b3350f7e9e21",
  "expires_at": "2026-10-30T16:39:47.281717Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/08fe79a1-5e9d-4cbb-8172-b3350f7e9e21` → **200**

```json
{
  "id": "08fe79a1-5e9d-4cbb-8172-b3350f7e9e21",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T16:39:47.281717Z",
  "card": {
    "id": "f6f9e0cc-d714-4526-942d-df710681278b",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****0008",
    "card_type": "Visa",
    "created_at": "2026-10-30T16:09:47.545889Z"
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
  "device_ref": "sandbox-2831"
}
```

```json
{
  "challenge_id": "58ac5724-abab-4878-bef8-7eba0244658e",
  "expires_at": "2026-10-30T16:14:47.830160283Z",
  "resend_available_at": "2026-10-30T16:09:48.830160283Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "310266",
  "sent_at": "2026-10-30T16:09:47.832729454Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "58ac5724-abab-4878-bef8-7eba0244658e",
  "code": "310266",
  "device_ref": "sandbox-2831"
}
```

```json
{
  "session_id": "53cb84d9-8e90-42ae-b9c1-1be04cfd203b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NzQ4OCwiaWF0IjoxNzkzMzc2NTg4LCJqdGkiOiIxZGQzMjg2NS1jMzNiLTRmZGYtOTdmMy1kYzk1Yzg2ZDMyNzgiLCJzaWQiOiI1M2NiODRkOS04ZTkwLTQyYWUtYjljMS0xYmUwNGNmZDIwM2IifQ.svgAM-MPWKs-AvkkycM4QHJDDxzJCWC4vTOVH37OsdI",
  "access_expires_at": "2026-10-30T16:24:48.132222044Z",
  "refresh_token": "5f2Gvw8vXiMp4d9PEPbZ1gesrO_zvlYxmt7KxyDj3a0",
  "refresh_expires_at": "2026-11-29T16:09:48.131420712Z",
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
  "command_id": "ca7a324b-1103-4aeb-a990-6f67e7aeb68e",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:09:48Z",
    "sequence": 1793376588679
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "68540d22-d0cd-469a-8743-66f19dcfe687",
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
  "last_heartbeat_at": "2026-10-30T16:09:48.695823Z",
  "last_location_at": "2026-10-30T16:09:48.695823Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A card ride; on the way both write numbers into the chat

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "96ee2564-1319-4750-a59f-e9d9b50a8521",
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
  "id": "5dfef3f7-2e11-47c2-a924-9db2508f1569",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T16:14:48.973906Z",
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
  "command_id": "9e935aec-7027-406c-99a8-5d965d404a1c",
  "quote_id": "5dfef3f7-2e11-47c2-a924-9db2508f1569",
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
  "id": "e684d9d1-2e5f-4886-bca1-c84975e1dbae",
  "short_number": 11,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "5282579e-10c8-4591-846c-a6b6b28f15cc",
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
  "created_at": "2026-10-30T16:09:49.250837Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e684d9d1-2e5f-4886-bca1-c84975e1dbae` → **200**

```json
{
  "id": "e684d9d1-2e5f-4886-bca1-c84975e1dbae",
  "short_number": 11,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "5282579e-10c8-4591-846c-a6b6b28f15cc",
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
  "created_at": "2026-10-30T16:09:49.250837Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e684d9d1-2e5f-4886-bca1-c84975e1dbae` → **200**

```json
{
  "id": "e684d9d1-2e5f-4886-bca1-c84975e1dbae",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "5282579e-10c8-4591-846c-a6b6b28f15cc",
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
  "created_at": "2026-10-30T16:09:49.250837Z",
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
    "id": "69545a12-f0e3-48e6-88ec-5d850f79b4f6",
    "order_id": "e684d9d1-2e5f-4886-bca1-c84975e1dbae",
    "expires_at": "2026-10-30T16:10:04.567524Z",
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

`POST /api/driver/v1/offers/69545a12-f0e3-48e6-88ec-5d850f79b4f6/accept` → **200**

```json
{
  "command_id": "72e45c99-5d2e-4db7-bb1c-81e4c714c0f1"
}
```

```json
{
  "id": "de196dd4-f2d3-4fd6-a862-6d657baa668c",
  "order_id": "e684d9d1-2e5f-4886-bca1-c84975e1dbae",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "818f4a40-a4fe-4fcb-b955-fa23e8c5df6e",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "818f4a40-a4fe-4fcb-b955-fa23e8c5df6e",
  "order_id": "e684d9d1-2e5f-4886-bca1-c84975e1dbae",
  "assignment_id": "de196dd4-f2d3-4fd6-a862-6d657baa668c",
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

`POST /api/rider/v1/orders/e684d9d1-2e5f-4886-bca1-c84975e1dbae/messages` → **201**

```json
{
  "command_id": "01264c95-1908-46dd-8b09-fa67a672d686",
  "body": "Я біля входу, мій номер +380736089092, картка 4111 1111 1111 1111"
}
```

```json
{
  "id": "ab73e36a-b09e-431b-a8f1-7e6d5a9077b5",
  "order_id": "e684d9d1-2e5f-4886-bca1-c84975e1dbae",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу, мій номер +380736089092, картка 4111 1111 1111 1111",
  "sent_at": "2026-10-30T16:09:51.918235817Z"
}
```

`POST /api/driver/v1/trips/818f4a40-a4fe-4fcb-b955-fa23e8c5df6e/messages` → **201**

```json
{
  "command_id": "7094bc8f-0bc2-4830-8696-7432cd5fa4f6",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03"
}
```

```json
{
  "id": "70057f78-1d95-481e-afb9-98aa918768cb",
  "order_id": "e684d9d1-2e5f-4886-bca1-c84975e1dbae",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03",
  "sent_at": "2026-10-30T16:09:52.197303733Z"
}
```

(the car drives 5 s to the next point)

`POST /api/driver/v1/work-sessions/68540d22-d0cd-469a-8743-66f19dcfe687/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:09:57Z",
    "sequence": 1793376597488
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "68540d22-d0cd-469a-8743-66f19dcfe687",
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
  "last_heartbeat_at": "2026-10-30T16:09:57.505859Z",
  "last_location_at": "2026-10-30T16:09:57.505859Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/818f4a40-a4fe-4fcb-b955-fa23e8c5df6e/arrive` → **200**

```json
{
  "command_id": "a339bddc-34df-4922-a876-29b27a64fb03",
  "expected_version": 0
}
```

```json
{
  "id": "818f4a40-a4fe-4fcb-b955-fa23e8c5df6e",
  "order_id": "e684d9d1-2e5f-4886-bca1-c84975e1dbae",
  "assignment_id": "de196dd4-f2d3-4fd6-a862-6d657baa668c",
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
  "arrived_at": "2026-10-30T16:09:57.795524Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/818f4a40-a4fe-4fcb-b955-fa23e8c5df6e/start` → **200**

```json
{
  "command_id": "c98a7d5f-e3d3-4c73-8ddb-3271b97920da",
  "expected_version": 1
}
```

```json
{
  "id": "818f4a40-a4fe-4fcb-b955-fa23e8c5df6e",
  "order_id": "e684d9d1-2e5f-4886-bca1-c84975e1dbae",
  "assignment_id": "de196dd4-f2d3-4fd6-a862-6d657baa668c",
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
  "arrived_at": "2026-10-30T16:09:57.795524Z",
  "started_at": "2026-10-30T16:09:58.080765Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

(the car drives 90 s to the next point)

`POST /api/driver/v1/work-sessions/68540d22-d0cd-469a-8743-66f19dcfe687/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4584,
    "lon": 30.4300,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:11:28Z",
    "sequence": 1793376688369
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "68540d22-d0cd-469a-8743-66f19dcfe687",
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
  "last_heartbeat_at": "2026-10-30T16:11:28.388289Z",
  "last_location_at": "2026-10-30T16:11:28.388289Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/818f4a40-a4fe-4fcb-b955-fa23e8c5df6e/complete` → **200**

```json
{
  "command_id": "eb4a26c2-6bef-4561-8c1b-fe9d7ba362d2",
  "expected_version": 2,
  "reported_at": "2026-10-30T16:11:28Z",
  "cash_received": false
}
```

```json
{
  "id": "818f4a40-a4fe-4fcb-b955-fa23e8c5df6e",
  "order_id": "e684d9d1-2e5f-4886-bca1-c84975e1dbae",
  "assignment_id": "de196dd4-f2d3-4fd6-a862-6d657baa668c",
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
  "arrived_at": "2026-10-30T16:09:57.795524Z",
  "started_at": "2026-10-30T16:09:58.080765Z",
  "completed_at": "2026-10-30T16:11:28.682012Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/rider/v1/orders/e684d9d1-2e5f-4886-bca1-c84975e1dbae` → **200**

```json
{
  "id": "e684d9d1-2e5f-4886-bca1-c84975e1dbae",
  "short_number": 11,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "5282579e-10c8-4591-846c-a6b6b28f15cc",
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
    "id": "de196dd4-f2d3-4fd6-a862-6d657baa668c",
    "order_id": "e684d9d1-2e5f-4886-bca1-c84975e1dbae",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "818f4a40-a4fe-4fcb-b955-fa23e8c5df6e",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T16:09:49.250837Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e684d9d1-2e5f-4886-bca1-c84975e1dbae` → **200**

```json
{
  "id": "e684d9d1-2e5f-4886-bca1-c84975e1dbae",
  "short_number": 11,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "5282579e-10c8-4591-846c-a6b6b28f15cc",
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
    "id": "de196dd4-f2d3-4fd6-a862-6d657baa668c",
    "order_id": "e684d9d1-2e5f-4886-bca1-c84975e1dbae",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "818f4a40-a4fe-4fcb-b955-fa23e8c5df6e",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T16:09:49.250837Z",
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
  "session_id": "68540d22-d0cd-469a-8743-66f19dcfe687",
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
  "last_heartbeat_at": "2026-10-30T16:11:28.388289Z",
  "last_location_at": "2026-10-30T16:11:28.388289Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/68540d22-d0cd-469a-8743-66f19dcfe687/close` → **200**

```json
{
  "command_id": "8025537a-7ac2-47af-bf91-73dd811cbb93",
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
  "session_id": "bb74de4e-441f-4a1c-9476-4830d9cdf519",
  "subject": {
    "type": "STAFF",
    "id": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NTM4N2IzNC1lN2M5LTRhZmYtOTNjMS0wZGQzZjJhY2QwOGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzc1OTEsImlhdCI6MTc5MzM3NjY5MSwianRpIjoiNDk0OThmOGMtNjMyNS00ODhhLThkYWYtZjMyOGE2YjZkZjhmIiwic2lkIjoiYmI3NGRlNGUtNDQxZi00YTFjLTk0NzYtNDgzMGQ5Y2RmNTE5In0.jtfS1dSvxLCHB5Js-pIlIzKHCdX7sbWhjs7CgmBQzOY",
  "access_expires_at": "2026-10-30T16:26:31.38527765Z",
  "refresh_token": "cRyVXIXGFCTJDGKg0oVGoDTCsBQXgOOoKHH6I-akDhI",
  "refresh_expires_at": "2026-10-31T04:11:31.384813Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/e684d9d1-2e5f-4886-bca1-c84975e1dbae/evidence` → **400**

```json
{
  "instance": "/api/admin/v1/orders/e684d9d1-2e5f-4886-bca1-c84975e1dbae/evidence",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "ebe65bfa-b5c5-42b3-996c-656e5abc2039"
}
```

`GET /api/admin/v1/orders/e684d9d1-2e5f-4886-bca1-c84975e1dbae/evidence?reason=Bank%20request%20sandbox` → **200**

```json
{
  "generated_at": "2026-10-30T16:11:31.931341661Z",
  "order": {
    "id": "e684d9d1-2e5f-4886-bca1-c84975e1dbae",
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
    "created_at": "2026-10-30T16:09:49.250837Z",
    "assigned_at": "2026-10-30T16:09:51.37331Z",
    "arrived_at": "2026-10-30T16:09:57.795524Z",
    "started_at": "2026-10-30T16:09:58.080765Z",
    "completed_at": "2026-10-30T16:11:28.682012Z"
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
    "id": "5282579e-10c8-4591-846c-a6b6b28f15cc",
    "registered_at": "2026-10-30T16:09:47.000652Z",
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
      "created_at": "2026-10-30T16:09:49.252967Z"
    },
    {
      "type": "SETTLE",
      "state": "SUCCEEDED",
      "amount_minor": 16297,
      "currency": "UAH",
      "provider_status": "Approved",
      "created_at": "2026-10-30T16:11:28.770502Z"
    }
  ],
  "chat": [
    {
```

## Finance records the chargeback: the rider owes the fare again, a case opens

`POST /api/admin/v1/orders/e684d9d1-2e5f-4886-bca1-c84975e1dbae/chargebacks` → **422**

```json
{
  "command_id": "88dba23b-7fce-4f14-ac18-ff86fa87bc11",
  "amount_minor": 16298,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "instance": "/api/admin/v1/orders/e684d9d1-2e5f-4886-bca1-c84975e1dbae/chargebacks",
  "status": 422,
  "title": "Chargeback not allowed",
  "type": "https://errors.blizz.taxi/chargeback-not-allowed",
  "code": "CHARGEBACK_NOT_ALLOWED",
  "correlation_id": "719c0051-c302-4d91-a674-c79b97c1a51f"
}
```

`POST /api/admin/v1/orders/e684d9d1-2e5f-4886-bca1-c84975e1dbae/chargebacks` → **201**

```json
{
  "command_id": "c14836e1-8885-48a4-9d38-e60a10480ce6",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "id": "2ca0b51a-7e45-45f5-9ded-af822525d6ca",
  "order_id": "e684d9d1-2e5f-4886-bca1-c84975e1dbae",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-30T16:11:32.539018Z",
  "resolved_at": null,
  "version": 0
}
```

`POST /api/admin/v1/orders/e684d9d1-2e5f-4886-bca1-c84975e1dbae/chargebacks` → **201**

```json
{
  "command_id": "c14836e1-8885-48a4-9d38-e60a10480ce6",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "id": "2ca0b51a-7e45-45f5-9ded-af822525d6ca",
  "order_id": "e684d9d1-2e5f-4886-bca1-c84975e1dbae",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-30T16:11:32.539018Z",
  "resolved_at": null,
  "version": 0
}
```

`GET /api/admin/v1/clients/5282579e-10c8-4591-846c-a6b6b28f15cc` → **200**

```json
{
  "client": {
    "id": "5282579e-10c8-4591-846c-a6b6b28f15cc",
    "phone": "+380736089092",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T16:09:47.000652Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "e684d9d1-2e5f-4886-bca1-c84975e1dbae",
      "short_number": 11,
      "status": "FULFILLED",
      "created_at": "2026-10-30T16:09:49.250837Z",
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

`POST /api/admin/v1/orders/e684d9d1-2e5f-4886-bca1-c84975e1dbae/chargebacks/2ca0b51a-7e45-45f5-9ded-af822525d6ca/resolve` → **200**

```json
{
  "command_id": "4a226196-ab85-4318-9288-2c2b899623be",
  "expected_version": 0,
  "outcome": "WON",
  "reason": "Evidence accepted"
}
```

```json
{
  "id": "2ca0b51a-7e45-45f5-9ded-af822525d6ca",
  "order_id": "e684d9d1-2e5f-4886-bca1-c84975e1dbae",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "WON",
  "resolution_reason": "Evidence accepted",
  "created_at": "2026-10-30T16:11:32.539018Z",
  "resolved_at": "2026-10-30T16:11:33.435255Z",
  "version": 1
}
```

`GET /api/admin/v1/clients/5282579e-10c8-4591-846c-a6b6b28f15cc` → **200**

```json
{
  "client": {
    "id": "5282579e-10c8-4591-846c-a6b6b28f15cc",
    "phone": "+380736089092",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T16:09:47.000652Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "e684d9d1-2e5f-4886-bca1-c84975e1dbae",
      "short_number": 11,
      "status": "FULFILLED",
      "created_at": "2026-10-30T16:09:49.250837Z",
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

`GET /api/admin/v1/clients/5282579e-10c8-4591-846c-a6b6b28f15cc` → **200**

```json
{
  "client": {
    "id": "5282579e-10c8-4591-846c-a6b6b28f15cc",
    "phone": "+380736089092",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T16:09:47.000652Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "e684d9d1-2e5f-4886-bca1-c84975e1dbae",
      "short_number": 11,
      "status": "FULFILLED",
      "created_at": "2026-10-30T16:09:49.250837Z",
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

`POST /api/admin/v1/orders/e684d9d1-2e5f-4886-bca1-c84975e1dbae/chargebacks/2ca0b51a-7e45-45f5-9ded-af822525d6ca/resolve` → **409**

```json
{
  "command_id": "10663edb-4704-4603-a5ae-c35c542625c8",
  "expected_version": 1,
  "outcome": "LOST",
  "reason": "Twice"
}
```

```json
{
  "instance": "/api/admin/v1/orders/e684d9d1-2e5f-4886-bca1-c84975e1dbae/chargebacks/2ca0b51a-7e45-45f5-9ded-af822525d6ca/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "8fc0329d-6968-42fb-a208-d9f7d3f07b8a"
}
```

`GET /api/admin/v1/orders/e684d9d1-2e5f-4886-bca1-c84975e1dbae/chargebacks` → **200**

```json
{
  "chargebacks": [
    {
      "id": "2ca0b51a-7e45-45f5-9ded-af822525d6ca",
      "order_id": "e684d9d1-2e5f-4886-bca1-c84975e1dbae",
      "amount_minor": 16297,
      "currency": "UAH",
      "bank_reason": "4837 No cardholder authorization",
      "received_on": "2026-10-29",
      "state": "WON",
      "resolution_reason": "Evidence accepted",
      "created_at": "2026-10-30T16:11:32.539018Z",
      "resolved_at": "2026-10-30T16:11:33.435255Z",
      "version": 1
    }
  ]
}
```

Done: the evidence of card order e684d9d1-2e5f-4886-bca1-c84975e1dbae without phone or card digits; chargeback 2ca0b51a-7e45-45f5-9ded-af822525d6ca recorded and won.

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
  "session_id": "46e24520-d5ec-4e8d-8f5c-95e1697fad05",
  "subject": {
    "type": "STAFF",
    "id": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NTM4N2IzNC1lN2M5LTRhZmYtOTNjMS0wZGQzZjJhY2QwOGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzc1OTYsImlhdCI6MTc5MzM3NjY5NiwianRpIjoiNjU0NTA3YjctZjkyYy00N2Q0LThhOGQtNGJhNjI1MWI2ODU5Iiwic2lkIjoiNDZlMjQ1MjAtZDVlYy00ZThkLThmNWMtOTVlMTY5N2ZhZDA1In0.I3PZXGX-wbIKS6ux1nvs5SEASJdUWRH8K0H_2POhs3A",
  "access_expires_at": "2026-10-30T16:26:36.458920401Z",
  "refresh_token": "yjEqlcCNXL7ZxepCz5wuGZtnmjXAmzGPRc9LWXJqmF4",
  "refresh_expires_at": "2026-10-31T04:11:36.458375777Z",
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
  "phone": "+48600509452",
  "device_ref": "sandbox-22894"
}
```

```json
{
  "challenge_id": "fd519192-c345-4d4b-bc08-f20b297a319b",
  "expires_at": "2026-10-30T16:16:37.278737289Z",
  "resend_available_at": "2026-10-30T16:11:38.278737289Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600509452` → **200**

```json
{
  "phone": "+48600509452",
  "audience": "CLIENT",
  "code": "786571",
  "sent_at": "2026-10-30T16:11:37.281769804Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fd519192-c345-4d4b-bc08-f20b297a319b",
  "code": "786571",
  "device_ref": "sandbox-22894"
}
```

```json
{
  "session_id": "5f352032-b914-4f65-973d-0e06700d6b6b",
  "subject": {
    "type": "CLIENT",
    "id": "0b28fe00-0881-4f7d-8f2b-7a8cbe6e0647"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwYjI4ZmUwMC0wODgxLTRmN2QtOGYyYi03YThjYmU2ZTA2NDciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc3NTk3LCJpYXQiOjE3OTMzNzY2OTcsImp0aSI6IjJhYWE3MTNlLWRiZjItNDdjMS1hMGEyLTcxYzQyNjQzNTk2ZCIsInNpZCI6IjVmMzUyMDMyLWI5MTQtNGY2NS05NzNkLTBlMDY3MDBkNmI2YiJ9.0qt436TAqokbjzxEBAdSZ9fRnkybwn96EuZi0fyLTeo",
  "access_expires_at": "2026-10-30T16:26:37.572647332Z",
  "refresh_token": "7EIATycvvkmbcy58iGSV828N6FUmswEIAVZz7c8E_Zg",
  "refresh_expires_at": "2026-11-29T16:11:37.571967911Z",
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
  "command_id": "32c3ad24-255d-4e62-9ce4-880d47239310",
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
  "correlation_id": "e8499509-b14c-4369-9759-3fa7f5fc7a54",
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
  "command_id": "e6c9d113-c460-4260-a831-0b33f2290f2a",
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
  "paused_at": "2026-10-30T16:11:38.687397912Z",
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
  "command_id": "bc91bb3e-49a1-4e61-b743-a8b1dbd23d42",
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
  "id": "5c6e1514-b765-44b9-842d-e84f06c540ad",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T16:16:39.255221Z",
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
  "command_id": "24bfe053-9cac-4b7a-9a47-dc6d3247a2e3",
  "quote_id": "5c6e1514-b765-44b9-842d-e84f06c540ad",
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
  "correlation_id": "5e48c6c5-d09f-42d6-975a-04da77aa972e"
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
  "paused_at": "2026-10-30T16:11:38.687398Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "9a246a6c-417a-45ba-8169-75ea7257eede",
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
  "command_id": "80f89ee5-15a2-4e66-9190-79b11ef0a3c6",
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
  "command_id": "293330c4-63dc-45aa-a711-1fcdc801cbf8",
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
  "id": "3d18a8be-8a89-44c1-9222-4b2c1edb36e2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T16:16:40.929117Z",
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
  "command_id": "f971c11c-2462-4c88-99d7-3738dd94c5d0",
  "quote_id": "3d18a8be-8a89-44c1-9222-4b2c1edb36e2",
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
  "correlation_id": "fb9d324d-4989-4e91-9dd8-cd7f5777d5a4"
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
  "command_id": "450f7fa9-f140-4385-86b6-3a656daae631",
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
      "from": "19:00",
      "to": "20:00"
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
      "from": "19:00",
      "to": "20:00"
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
  "command_id": "81ca5a2f-c135-44e0-923a-fe68235490fa",
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
  "id": "6b4a90e9-81c0-4812-980d-3ddf4fac2cff",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T16:16:42.058467Z",
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
  "command_id": "28183090-993a-4ddf-9860-1a5b1fa645c7",
  "quote_id": "6b4a90e9-81c0-4812-980d-3ddf4fac2cff",
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
  "correlation_id": "b04e6bff-e9ca-4913-88dc-e2c5adb42005"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "5d6f904b-93ce-40c9-96ea-851f9395fa6a",
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
  "correlation_id": "d26f91f6-bf7f-4805-bd2c-418734d4e2eb",
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
      "from": "19:00",
      "to": "20:00"
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
  "command_id": "2860e798-5316-4012-803a-ce237c63d54b",
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
  "phone": "+380671030095",
  "device_ref": "sandbox-1576"
}
```

```json
{
  "challenge_id": "4579d252-fd5b-427a-b92a-9961990ce6a0",
  "expires_at": "2026-10-30T16:16:43.455640168Z",
  "resend_available_at": "2026-10-30T16:11:44.455640168Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380671030095` → **200**

```json
{
  "phone": "+380671030095",
  "audience": "CLIENT",
  "code": "742738",
  "sent_at": "2026-10-30T16:11:43.458076987Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4579d252-fd5b-427a-b92a-9961990ce6a0",
  "code": "742738",
  "device_ref": "sandbox-1576"
}
```

```json
{
  "session_id": "b8f9d73c-fa0b-439f-9fe7-2c102aa58254",
  "subject": {
    "type": "CLIENT",
    "id": "eaf5caab-6216-4881-97dc-90981ae679e7"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlYWY1Y2FhYi02MjE2LTQ4ODEtOTdkYy05MDk4MWFlNjc5ZTciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc3NjAzLCJpYXQiOjE3OTMzNzY3MDMsImp0aSI6IjJjODNjZGQxLTNmNTItNDAwMS05OTQyLWIyNjFhNWExZTIwNiIsInNpZCI6ImI4ZjlkNzNjLWZhMGItNDM5Zi05ZmU3LTJjMTAyYWE1ODI1NCJ9.v1neubmxScIhBn5CTpVfYML3wduymMGfOlUIEydLK6c",
  "access_expires_at": "2026-10-30T16:26:43.767460795Z",
  "refresh_token": "dTYvYygEUVMHWwG_HaMtH77MMbODq5_CtHhdj310-Rc",
  "refresh_expires_at": "2026-11-29T16:11:43.766909155Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "eaf5caab-6216-4881-97dc-90981ae679e7",
  "session_id": "b8f9d73c-fa0b-439f-9fe7-2c102aa58254",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1bc4ec11-5ff5-45fd-8bde-242223809fa0",
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
  "id": "681e6031-9dd9-4667-8cd6-65fa66c3c130",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T16:16:44.314912Z",
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
  "challenge_id": "b6728e2f-eb8a-46be-a27d-d898ecb2d296",
  "expires_at": "2026-10-30T16:16:46.600618771Z",
  "resend_available_at": "2026-10-30T16:11:47.600618771Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380671030095` → **200**

```json
{
  "phone": "+380671030095",
  "audience": "CLIENT",
  "code": "031325",
  "sent_at": "2026-10-30T16:11:46.602975165Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "25a2e99f-4cc7-4afa-bd83-341a809ab62e",
  "challenge_id": "b6728e2f-eb8a-46be-a27d-d898ecb2d296",
  "otp_code": "031325"
}
```

```json
{
  "client_id": "eaf5caab-6216-4881-97dc-90981ae679e7",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-30T16:11:46.907301032Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "c12a4103-0e91-415a-bf49-db1ecdf534a2",
  "quote_id": "681e6031-9dd9-4667-8cd6-65fa66c3c130",
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
  "correlation_id": "ea207bf7-ed83-4844-957c-7e7c5f03c7f5"
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
  "session_id": "c1e27f3d-7f2e-467b-b7f2-6747318b758e",
  "subject": {
    "type": "STAFF",
    "id": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NTM4N2IzNC1lN2M5LTRhZmYtOTNjMS0wZGQzZjJhY2QwOGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzc2MDcsImlhdCI6MTc5MzM3NjcwNywianRpIjoiNjU5ZTUxNTMtNTk2Mi00ZjM5LTgwZDEtNjQ3MmY4NTg2NDQxIiwic2lkIjoiYzFlMjdmM2QtN2YyZS00NjdiLWI3ZjItNjc0NzMxOGI3NThlIn0._-eKktBrYAY4jjulMPROVklCUGyhmIkq2dzkhmWNIAk",
  "access_expires_at": "2026-10-30T16:26:47.769613198Z",
  "refresh_token": "V0eBA9W6DV73JuJhGDVGTQgB7i9dv0H6Tcy9NJAh0HE",
  "refresh_expires_at": "2026-10-31T04:11:47.768956978Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "eaf5caab-6216-4881-97dc-90981ae679e7",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-30T16:11:46.907301Z",
      "blockers": {
        "active_order_id": null,
        "debt": [],
        "open_support_cases": 0,
        "bonuses_to_burn": [],
        "blocked": false
      }
    }
  ]
}
```

`POST /api/admin/v1/client-deletions/eaf5caab-6216-4881-97dc-90981ae679e7/complete` → **200**

```json
{
  "command_id": "81c8d0b3-a7e9-45e1-8653-fed83a286491",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "eaf5caab-6216-4881-97dc-90981ae679e7",
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
  "correlation_id": "ad566239-469f-4bd0-a1fe-c1ab1b4bae6e"
}
```

Done: client eaf5caab-6216-4881-97dc-90981ae679e7 anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380660647676",
  "device_ref": "sandbox-25838"
}
```

```json
{
  "challenge_id": "9f1aaaaf-bebf-405a-9c54-db65666f8750",
  "expires_at": "2026-10-30T16:16:48.8953633Z",
  "resend_available_at": "2026-10-30T16:11:49.8953633Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380660647676` → **200**

```json
{
  "phone": "+380660647676",
  "audience": "CLIENT",
  "code": "480082",
  "sent_at": "2026-10-30T16:11:48.898243798Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9f1aaaaf-bebf-405a-9c54-db65666f8750",
  "code": "480082",
  "device_ref": "sandbox-25838"
}
```

```json
{
  "session_id": "8c4ca292-26bc-4d58-8faa-ccb0b1edd124",
  "subject": {
    "type": "CLIENT",
    "id": "f69183b1-ad8e-4cfc-b57a-a9b63c18e9dd"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjkxODNiMS1hZDhlLTRjZmMtYjU3YS1hOWI2M2MxOGU5ZGQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc3NjA5LCJpYXQiOjE3OTMzNzY3MDksImp0aSI6IjZmZTIwMzQzLWJhOTAtNDNmOC1iOGE2LThkZjc0NGQ5ZTAyNCIsInNpZCI6IjhjNGNhMjkyLTI2YmMtNGQ1OC04ZmFhLWNjYjBiMWVkZDEyNCJ9.ZPcwt7ch6x8H7UTJT08uE57KMjjpEh8AjBDoForD4HE",
  "access_expires_at": "2026-10-30T16:26:49.194216148Z",
  "refresh_token": "GO1tl9iu-NNeVrs0K1uXIQ-iGWEv8w354qCJJLhBexo",
  "refresh_expires_at": "2026-11-29T16:11:49.193745154Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "f69183b1-ad8e-4cfc-b57a-a9b63c18e9dd",
  "session_id": "8c4ca292-26bc-4d58-8faa-ccb0b1edd124",
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
  "session_id": "ea9f6af3-dab6-4b28-80ab-b0708af2ebb5",
  "subject": {
    "type": "STAFF",
    "id": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NTM4N2IzNC1lN2M5LTRhZmYtOTNjMS0wZGQzZjJhY2QwOGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzc2MTAsImlhdCI6MTc5MzM3NjcxMCwianRpIjoiMzMyNjE2MGItMzI1Mi00ZWI4LTlhYzUtNjc4OWYzNzA4MzRiIiwic2lkIjoiZWE5ZjZhZjMtZGFiNi00YjI4LTgwYWItYjA3MDhhZjJlYmI1In0.lN-qJ54n6HTq75-HJg8KDJc_YE9cDXz9sG9aw2zB1uk",
  "access_expires_at": "2026-10-30T16:26:50.018625218Z",
  "refresh_token": "hflryQprjPUx_iwvkg59621_zsnqJekWorAidCAsaLc",
  "refresh_expires_at": "2026-10-31T04:11:50.018081717Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=0647676&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "f69183b1-ad8e-4cfc-b57a-a9b63c18e9dd",
      "phone": "+380660647676",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-30T16:11:49.191738Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/f69183b1-ad8e-4cfc-b57a-a9b63c18e9dd` → **200**

```json
{
  "client": {
    "id": "f69183b1-ad8e-4cfc-b57a-a9b63c18e9dd",
    "phone": "+380660647676",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T16:11:49.191738Z",
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

`POST /api/admin/v1/clients/f69183b1-ad8e-4cfc-b57a-a9b63c18e9dd/block` → **400**

```json
{
  "command_id": "8e103882-4eec-482b-a23c-1c5af5442fa2",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/f69183b1-ad8e-4cfc-b57a-a9b63c18e9dd/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "2026b830-4e99-41bf-8d1e-29b7dffb6694",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/f69183b1-ad8e-4cfc-b57a-a9b63c18e9dd/block` → **200**

```json
{
  "command_id": "e98c7a4d-a3d4-4c0c-a80a-8d0b275875e0",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "f69183b1-ad8e-4cfc-b57a-a9b63c18e9dd",
  "phone": "+380660647676",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-30T16:11:49.191738Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-30T16:11:51.14807Z",
    "by": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f"
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
  "correlation_id": "041924eb-dfac-48fb-a2e7-fbdabf0de8a4"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380660647676",
  "device_ref": "sandbox-10951"
}
```

```json
{
  "challenge_id": "cee42a90-0630-40c5-92f8-3b659263c804",
  "expires_at": "2026-10-30T16:16:53.702708282Z",
  "resend_available_at": "2026-10-30T16:11:54.702708282Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380660647676` → **200**

```json
{
  "phone": "+380660647676",
  "audience": "CLIENT",
  "code": "545313",
  "sent_at": "2026-10-30T16:11:53.70579927Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "cee42a90-0630-40c5-92f8-3b659263c804",
  "code": "545313",
  "device_ref": "sandbox-10951"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "84de48cd-fd97-4789-ac8b-62978831d2e5"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/f69183b1-ad8e-4cfc-b57a-a9b63c18e9dd` → **200**

```json
{
  "client": {
    "id": "f69183b1-ad8e-4cfc-b57a-a9b63c18e9dd",
    "phone": "+380660647676",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-30T16:11:49.191738Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-30T16:11:51.14807Z",
      "by": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f"
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

`POST /api/admin/v1/clients/f69183b1-ad8e-4cfc-b57a-a9b63c18e9dd/unblock` → **200**

```json
{
  "command_id": "cba4149c-7365-4045-b9a3-10835eae2a20",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "f69183b1-ad8e-4cfc-b57a-a9b63c18e9dd",
  "phone": "+380660647676",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-30T16:11:49.191738Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380660647676",
  "device_ref": "sandbox-26175"
}
```

```json
{
  "challenge_id": "d0fa630e-7c30-48e7-9884-c0052be6b82c",
  "expires_at": "2026-10-30T16:16:56.866358324Z",
  "resend_available_at": "2026-10-30T16:11:57.866358324Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380660647676` → **200**

```json
{
  "phone": "+380660647676",
  "audience": "CLIENT",
  "code": "436568",
  "sent_at": "2026-10-30T16:11:56.869067558Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d0fa630e-7c30-48e7-9884-c0052be6b82c",
  "code": "436568",
  "device_ref": "sandbox-26175"
}
```

```json
{
  "session_id": "e403fbc7-67aa-4ed2-8b5e-d24e293fd25b",
  "subject": {
    "type": "CLIENT",
    "id": "f69183b1-ad8e-4cfc-b57a-a9b63c18e9dd"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjkxODNiMS1hZDhlLTRjZmMtYjU3YS1hOWI2M2MxOGU5ZGQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc3NjE3LCJpYXQiOjE3OTMzNzY3MTcsImp0aSI6ImZhNGQ0Mjg3LWY1NzQtNGE2My04NTE5LTVlZTlhMDg3ODA5MiIsInNpZCI6ImU0MDNmYmM3LTY3YWEtNGVkMi04YjVlLWQyNGUyOTNmZDI1YiJ9.lC8lbEn1Ebd1AC_JWtSet6-RyhfVMwo9QJm8EDUr1mY",
  "access_expires_at": "2026-10-30T16:26:57.155903119Z",
  "refresh_token": "tShQxtRuGaN59WzFCy0zCKxo-aiEnWmeopg7705vr3M",
  "refresh_expires_at": "2026-11-29T16:11:57.155358273Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "f69183b1-ad8e-4cfc-b57a-a9b63c18e9dd",
  "session_id": "e403fbc7-67aa-4ed2-8b5e-d24e293fd25b",
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
  "phone": "+380669790975",
  "device_ref": "sandbox-16526"
}
```

```json
{
  "challenge_id": "5f39c86d-e4f2-4939-80ef-6104a5b75d0a",
  "expires_at": "2026-10-30T16:16:57.699381704Z",
  "resend_available_at": "2026-10-30T16:11:58.699381704Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380669790975` → **200**

```json
{
  "phone": "+380669790975",
  "audience": "CLIENT",
  "code": "933483",
  "sent_at": "2026-10-30T16:11:57.702453527Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5f39c86d-e4f2-4939-80ef-6104a5b75d0a",
  "code": "933483",
  "device_ref": "sandbox-16526"
}
```

```json
{
  "session_id": "b7380795-e3b3-4a73-b7ed-fb4391804643",
  "subject": {
    "type": "CLIENT",
    "id": "6021b02e-f016-49ec-979a-5b3f9eb54b55"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MDIxYjAyZS1mMDE2LTQ5ZWMtOTc5YS01YjNmOWViNTRiNTUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc3NjE3LCJpYXQiOjE3OTMzNzY3MTcsImp0aSI6ImQ1ZTYyZTE0LWQxZTgtNGIyNi05Yzc5LThmMGVmYjBmY2Y4YyIsInNpZCI6ImI3MzgwNzk1LWUzYjMtNGE3My1iN2VkLWZiNDM5MTgwNDY0MyJ9.jxFymxuPKSswPaJDIKsh5eunaDU-q0rngAzYCI_EaX4",
  "access_expires_at": "2026-10-30T16:26:57.994314442Z",
  "refresh_token": "2XAHlsSuEQuiyge7hRki7NxWqqlAYqfWhhm2BzrRHbQ",
  "refresh_expires_at": "2026-11-29T16:11:57.993604938Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1140c2af-1e2f-44d4-8e52-4356796f80bf",
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
  "id": "404115f1-30f0-49bf-b501-9109abdd1ae4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T16:16:58.267731Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: 393d773a-b308-4441-9590-e1696df39680) → **201**

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
  "session_id": "01f077d7-4b74-4e3d-bbd3-8d06d5babc37",
  "subject": {
    "type": "STAFF",
    "id": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NTM4N2IzNC1lN2M5LTRhZmYtOTNjMS0wZGQzZjJhY2QwOGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzc2MTgsImlhdCI6MTc5MzM3NjcxOCwianRpIjoiYzI0ZGZjOWQtNzhmNC00Y2Q2LWI0ODItYjI2ODRjYTU1ZjZmIiwic2lkIjoiMDFmMDc3ZDctNGI3NC00ZTNkLWJiZDMtOGQwNmQ1YmFiYzM3In0.bPmOn3MzwVESBtgxOLwvM0QoY8MGWlmlyRqMwqnhA_8",
  "access_expires_at": "2026-10-30T16:26:58.872999693Z",
  "refresh_token": "RnUiafzUU7P6OG2KsiKukkEP1mAZXsCrn0Nsu3XrBgY",
  "refresh_expires_at": "2026-10-31T04:11:58.872383456Z",
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
  "session_id": "6ae6151a-7dee-4fdd-97a0-bcb9855a5858",
  "subject": {
    "type": "STAFF",
    "id": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NTM4N2IzNC1lN2M5LTRhZmYtOTNjMS0wZGQzZjJhY2QwOGYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzc2MTksImlhdCI6MTc5MzM3NjcxOSwianRpIjoiNGRkMTA0YTQtOThkNy00ZWU4LWE0NWQtZDc1MjgxY2QwM2M5Iiwic2lkIjoiNmFlNjE1MWEtN2RlZS00ZmRkLTk3YTAtYmNiOTg1NWE1ODU4In0.o8QwdH2cBRM-fJEGufJpV6AM3oBwZDgwcwLy7umS_uQ",
  "access_expires_at": "2026-10-30T16:26:59.448540616Z",
  "refresh_token": "lrtvPXYofrk1pnIQ2X_VDEDuRCzo36H_9BesilFfnTY",
  "refresh_expires_at": "2026-10-31T04:11:59.447916909Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/073f9495-5430-42e1-ad0c-937f8ce82ee5/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T16:11:58.542918Z",
      "actor": {
        "type": "CLIENT",
        "id": "6021b02e-f016-49ec-979a-5b3f9eb54b55",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "073f9495-5430-42e1-ad0c-937f8ce82ee5",
        "quote_id": "404115f1-30f0-49bf-b501-9109abdd1ae4",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "393d773a-b308-4441-9590-e1696df39680"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T16:11:58.544257Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "073f9495-5430-42e1-ad0c-937f8ce82ee5",
        "attempt_id": "2ef86ed0-54fe-4f03-ab22-df14f0cb3f44",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "393d773a-b308-4441-9590-e1696df39680"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-30T16:11:58.549107Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "073f9495-5430-42e1-ad0c-937f8ce82ee5",
        "attempt_id": "2ef86ed0-54fe-4f03-ab22-df14f0cb3f44"
      },
      "correlation_id": "393d773a-b308-4441-9590-e1696df39680"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "2ef86ed0-54fe-4f03-ab22-df14f0cb3f44",
        "generation": 1,
        "started_at": "2026-10-30T16:11:58.543525Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-30T16:11:58.549107Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-30T16:11:58.544772Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/393d773a-b308-4441-9590-e1696df39680` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "073f9495-5430-42e1-ad0c-937f8ce82ee5:0",
      "order_id": "073f9495-5430-42e1-ad0c-937f8ce82ee5",
      "at": "2026-10-30T16:11:58.542918Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "073f9495-5430-42e1-ad0c-937f8ce82ee5:1",
      "order_id": "073f9495-5430-42e1-ad0c-937f8ce82ee5",
      "at": "2026-10-30T16:11:58.544257Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "073f9495-5430-42e1-ad0c-937f8ce82ee5:2",
      "order_id": "073f9495-5430-42e1-ad0c-937f8ce82ee5",
      "at": "2026-10-30T16:11:58.549107Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/e7d02b9e-d8f7-460c-bb42-12f9b08cd1a9` → **200**

```json
{
  "found": []
}
```

Done: request 393d773a-b308-4441-9590-e1696df39680 — order 073f9495-5430-42e1-ad0c-937f8ce82ee5 found by its id.

`GET /api/rider/v1/orders/073f9495-5430-42e1-ad0c-937f8ce82ee5` → **200**

```json
{
  "id": "073f9495-5430-42e1-ad0c-937f8ce82ee5",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6021b02e-f016-49ec-979a-5b3f9eb54b55",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T16:11:58.542474Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/073f9495-5430-42e1-ad0c-937f8ce82ee5/cancel` → **200**

```json
{
  "command_id": "5572b907-5240-4622-871c-e67edf02577b",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "073f9495-5430-42e1-ad0c-937f8ce82ee5",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "6021b02e-f016-49ec-979a-5b3f9eb54b55",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T16:11:58.542474Z",
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
  "pickup_eta": null
}
```

# Scenario: data-export

## A rider signs in and asks for a code to confirm the copy

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638453743",
  "device_ref": "sandbox-18953"
}
```

```json
{
  "challenge_id": "8219a8e6-ff88-47bd-8c4f-1fcf2b37455c",
  "expires_at": "2026-10-30T16:17:01.13433153Z",
  "resend_available_at": "2026-10-30T16:12:02.13433153Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638453743` → **200**

```json
{
  "phone": "+380638453743",
  "audience": "CLIENT",
  "code": "540280",
  "sent_at": "2026-10-30T16:12:01.137669559Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8219a8e6-ff88-47bd-8c4f-1fcf2b37455c",
  "code": "540280",
  "device_ref": "sandbox-18953"
}
```

```json
{
  "session_id": "ce423a72-d191-4ab8-9b3c-94d92536ed8f",
  "subject": {
    "type": "CLIENT",
    "id": "d0851fc1-e4c4-4c11-a702-21b1c873b641"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMDg1MWZjMS1lNGM0LTRjMTEtYTcwMi0yMWIxYzg3M2I2NDEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc3NjIxLCJpYXQiOjE3OTMzNzY3MjEsImp0aSI6IjIwYmNiYTU2LTUxOGUtNDY5OC05NGJkLTI3ZTM4YzA0M2MwYSIsInNpZCI6ImNlNDIzYTcyLWQxOTEtNGFiOC05YjNjLTk0ZDkyNTM2ZWQ4ZiJ9.Gtp1VVVBrVqTXRqdNerGiSzdB1N3e50k4QI0D1RTG8k",
  "access_expires_at": "2026-10-30T16:27:01.426774397Z",
  "refresh_token": "RMeAgmLpyM-KD7y43fcs_sEh-BVY59IQ9yY15_J-7Ug",
  "refresh_expires_at": "2026-11-29T16:12:01.426305304Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "9b7d07d9-9d0f-4432-9568-525d57a4660f",
  "expires_at": "2026-10-30T16:17:03.696620965Z",
  "resend_available_at": "2026-10-30T16:12:04.696620965Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638453743` → **200**

```json
{
  "phone": "+380638453743",
  "audience": "CLIENT",
  "code": "505970",
  "sent_at": "2026-10-30T16:12:03.698936129Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "dc90ea13-751b-460d-9189-227d7ae229b5",
  "challenge_id": "9b7d07d9-9d0f-4432-9568-525d57a4660f",
  "otp_code": "505970"
}
```

```json
{
  "id": "e38d1ec9-9cf5-499b-8e52-df95c21c98f9",
  "state": "PENDING",
  "created_at": "2026-10-30T16:12:04.006461Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/e38d1ec9-9cf5-499b-8e52-df95c21c98f9` → **200**

```json
{
  "id": "e38d1ec9-9cf5-499b-8e52-df95c21c98f9",
  "state": "PENDING",
  "created_at": "2026-10-30T16:12:04.006461Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/e38d1ec9-9cf5-499b-8e52-df95c21c98f9` → **200**

```json
{
  "id": "e38d1ec9-9cf5-499b-8e52-df95c21c98f9",
  "state": "PENDING",
  "created_at": "2026-10-30T16:12:04.006461Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/e38d1ec9-9cf5-499b-8e52-df95c21c98f9` → **200**

```json
{
  "id": "e38d1ec9-9cf5-499b-8e52-df95c21c98f9",
  "state": "PENDING",
  "created_at": "2026-10-30T16:12:04.006461Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/e38d1ec9-9cf5-499b-8e52-df95c21c98f9` → **200**

```json
{
  "id": "e38d1ec9-9cf5-499b-8e52-df95c21c98f9",
  "state": "PENDING",
  "created_at": "2026-10-30T16:12:04.006461Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/e38d1ec9-9cf5-499b-8e52-df95c21c98f9` → **200**

```json
{
  "id": "e38d1ec9-9cf5-499b-8e52-df95c21c98f9",
  "state": "PENDING",
  "created_at": "2026-10-30T16:12:04.006461Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/e38d1ec9-9cf5-499b-8e52-df95c21c98f9` → **200**

```json
{
  "id": "e38d1ec9-9cf5-499b-8e52-df95c21c98f9",
  "state": "PENDING",
  "created_at": "2026-10-30T16:12:04.006461Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/e38d1ec9-9cf5-499b-8e52-df95c21c98f9` → **200**

```json
{
  "id": "e38d1ec9-9cf5-499b-8e52-df95c21c98f9",
  "state": "PENDING",
  "created_at": "2026-10-30T16:12:04.006461Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/e38d1ec9-9cf5-499b-8e52-df95c21c98f9` → **200**

```json
{
  "id": "e38d1ec9-9cf5-499b-8e52-df95c21c98f9",
  "state": "READY",
  "created_at": "2026-10-30T16:12:04.006461Z",
  "ready_at": "2026-10-30T16:12:13.103919Z",
  "expires_at": "2026-11-06T16:12:13.103919Z",
  "size_bytes": 1032
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/e38d1ec9-9cf5-499b-8e52-df95c21c98f9/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639640763",
  "device_ref": "sandbox-23356"
}
```

```json
{
  "challenge_id": "8f87fb0b-3630-47a4-abeb-f85290248371",
  "expires_at": "2026-10-30T16:17:13.421409556Z",
  "resend_available_at": "2026-10-30T16:12:14.421409556Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639640763` → **200**

```json
{
  "phone": "+380639640763",
  "audience": "CLIENT",
  "code": "604642",
  "sent_at": "2026-10-30T16:12:13.424276174Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8f87fb0b-3630-47a4-abeb-f85290248371",
  "code": "604642",
  "device_ref": "sandbox-23356"
}
```

```json
{
  "session_id": "7d0568c9-bb1b-46fb-9bc0-70a8ffccf3fc",
  "subject": {
    "type": "CLIENT",
    "id": "bbd09e26-0126-47a8-b0a6-4d2cff0facc3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYmQwOWUyNi0wMTI2LTQ3YTgtYjBhNi00ZDJjZmYwZmFjYzMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc3NjMzLCJpYXQiOjE3OTMzNzY3MzMsImp0aSI6ImU4MTczNWFhLTBmMTAtNDVhZS1iOTUxLTk2ZjJhOGE3MWEyMiIsInNpZCI6IjdkMDU2OGM5LWJiMWItNDZmYi05YmMwLTcwYThmZmNjZjNmYyJ9.1-ffNgDoew0tomFf1dMCuodJhTOYvJpTnXz0y8hkKCo",
  "access_expires_at": "2026-10-30T16:27:13.713529616Z",
  "refresh_token": "8CjWcn8YSv0INMVM2MIo-jIdScZNYHdohTCeiYHV2pQ",
  "refresh_expires_at": "2026-11-29T16:12:13.713027679Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/e38d1ec9-9cf5-499b-8e52-df95c21c98f9/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/e38d1ec9-9cf5-499b-8e52-df95c21c98f9/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "f27663a1-b38a-43d3-9071-2cf8b0ca7780"
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
  "session_id": "2f3e9d65-1899-44e1-b85c-ceb4f58c7a11",
  "subject": {
    "type": "STAFF",
    "id": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NTM4N2IzNC1lN2M5LTRhZmYtOTNjMS0wZGQzZjJhY2QwOGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzc2MzQsImlhdCI6MTc5MzM3NjczNCwianRpIjoiMjFlODcyNWEtMzIyZC00MjIxLWFhMzctZTQxYzg0YTNkYzkzIiwic2lkIjoiMmYzZTlkNjUtMTg5OS00NGUxLWI4NWMtY2ViNGY1OGM3YTExIn0.9Bnkqd6FkKoGBP4CaWuWyGi66jJWifWwV5I5bNLp8gU",
  "access_expires_at": "2026-10-30T16:27:14.550588368Z",
  "refresh_token": "u0BsqtZPiUw9kmLw04nJjS3C8oNN_77x86V8Fpetm_w",
  "refresh_expires_at": "2026-10-31T04:12:14.550068785Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "d0851fc1-e4c4-4c11-a702-21b1c873b641",
  "session_id": "ce423a72-d191-4ab8-9b3c-94d92536ed8f",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/d0851fc1-e4c4-4c11-a702-21b1c873b641/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "e38d1ec9-9cf5-499b-8e52-df95c21c98f9",
      "state": "READY",
      "created_at": "2026-10-30T16:12:04.006461Z",
      "ready_at": "2026-10-30T16:12:13.103919Z",
      "expires_at": "2026-11-06T16:12:13.103919Z",
      "size_bytes": 1032
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
  "device_ref": "sandbox-25743"
}
```

```json
{
  "challenge_id": "77d03412-a62a-419e-b0f8-5b303611c4ec",
  "expires_at": "2026-10-30T16:17:15.352520406Z",
  "resend_available_at": "2026-10-30T16:12:16.352520406Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "813718",
  "sent_at": "2026-10-30T16:12:15.35507104Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "77d03412-a62a-419e-b0f8-5b303611c4ec",
  "code": "813718",
  "device_ref": "sandbox-25743"
}
```

```json
{
  "session_id": "7666444f-7059-406c-90b1-f16a83f7f1a5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NzYzNSwiaWF0IjoxNzkzMzc2NzM1LCJqdGkiOiI0NjY0ZDc0Ni1jNWQ1LTRiNjMtODMyNi1iOTVkN2M2NTJhNzEiLCJzaWQiOiI3NjY2NDQ0Zi03MDU5LTQwNmMtOTBiMS1mMTZhODNmN2YxYTUifQ.XCjERnN4QWXgg_sgNpu3E03nVR4kTHU12wvmhSuscoc",
  "access_expires_at": "2026-10-30T16:27:15.651519776Z",
  "refresh_token": "nage2pwq9BZzoEugmbDV6FlM5pL7tkXEzPsondloEUw",
  "refresh_expires_at": "2026-11-29T16:12:15.650939291Z",
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
  "device_ref": "sandbox-16156"
}
```

```json
{
  "challenge_id": "9290be08-cc49-4df4-9366-6057d8cbc25e",
  "expires_at": "2026-10-30T16:17:16.192736121Z",
  "resend_available_at": "2026-10-30T16:12:17.192736121Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "969751",
  "sent_at": "2026-10-30T16:12:16.195740345Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9290be08-cc49-4df4-9366-6057d8cbc25e",
  "code": "969751",
  "device_ref": "sandbox-16156"
}
```

```json
{
  "session_id": "18b64f27-d704-435f-993e-f24e97c19a3f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NzYzNiwiaWF0IjoxNzkzMzc2NzM2LCJqdGkiOiJiZTcxZjU5Mi1lYTliLTRjM2MtOGZlMS0zMmUwNjIyMTgxNDIiLCJzaWQiOiIxOGI2NGYyNy1kNzA0LTQzNWYtOTkzZS1mMjRlOTdjMTlhM2YifQ.8DcdCMywxYF5HmG7cjy2Fq03tIvAmAdlD8MdsCXYL5U",
  "access_expires_at": "2026-10-30T16:27:16.48583456Z",
  "refresh_token": "21IlJoK2qVHNZdBsPELiMBXQ3lEW09t4ZvVSOx8aPXw",
  "refresh_expires_at": "2026-11-29T16:12:16.485312039Z",
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
  "command_id": "ad92809a-cd68-4963-9e0d-5e0c622f5e3d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:12:17Z",
    "sequence": 1793376737389
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b488f683-7ee5-409f-9949-f61a3c1c3f7f",
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
  "last_heartbeat_at": "2026-10-30T16:12:17.05603Z",
  "last_location_at": "2026-10-30T16:12:17.05603Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-12895"
}
```

```json
{
  "challenge_id": "55a9bf13-cfcf-466e-b9b8-f2a9723b74f1",
  "expires_at": "2026-10-30T16:17:17.324539509Z",
  "resend_available_at": "2026-10-30T16:12:18.324539509Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "636802",
  "sent_at": "2026-10-30T16:12:17.327078276Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "55a9bf13-cfcf-466e-b9b8-f2a9723b74f1",
  "code": "636802",
  "device_ref": "sandbox-12895"
}
```

```json
{
  "session_id": "5f0ea2ce-1fba-4ddc-89aa-79aa798de2a0",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NzYzNywiaWF0IjoxNzkzMzc2NzM3LCJqdGkiOiIzMTRlNWFlNi1jNWFlLTQyNjktYWFiNC05MGM0OWFkMDA1MzgiLCJzaWQiOiI1ZjBlYTJjZS0xZmJhLTRkZGMtODlhYS03OWFhNzk4ZGUyYTAifQ.dXaQX1-Bc_W-IWwYgqEuEl6bLb6dJc7GnW9sxq8t2No",
  "access_expires_at": "2026-10-30T16:27:17.625503206Z",
  "refresh_token": "HdoL1W5x-F2PEsq0937ubFHAc1_8WW87Id6CsKz7KVw",
  "refresh_expires_at": "2026-11-29T16:12:17.62495184Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "9e402278-177a-4a81-80dc-3151a4be19e5",
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
  "last_heartbeat_at": "2026-10-30T16:08:17.03244Z",
  "last_location_at": "2026-10-30T16:08:17.03244Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/9e402278-177a-4a81-80dc-3151a4be19e5/handover` → **200**

```json
{
  "command_id": "f0913511-aad0-4def-b8e6-6bc02b52ff40",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "9e402278-177a-4a81-80dc-3151a4be19e5",
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
  "last_heartbeat_at": "2026-10-30T16:08:17.03244Z",
  "last_location_at": "2026-10-30T16:08:17.03244Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/9e402278-177a-4a81-80dc-3151a4be19e5/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:12:18Z",
    "sequence": 1793376738448
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "9e402278-177a-4a81-80dc-3151a4be19e5",
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
  "last_heartbeat_at": "2026-10-30T16:12:18.464811Z",
  "last_location_at": "2026-10-30T16:12:18.464811Z",
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
  "session_id": "0f68cd35-bf52-484c-af2d-58d1973275f2",
  "subject": {
    "type": "STAFF",
    "id": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NTM4N2IzNC1lN2M5LTRhZmYtOTNjMS0wZGQzZjJhY2QwOGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzc2MzksImlhdCI6MTc5MzM3NjczOSwianRpIjoiNmQ1NDk1NWYtMzhhNC00NmRiLWE2ZjgtMDhhMTZiYWRiNTljIiwic2lkIjoiMGY2OGNkMzUtYmY1Mi00ODRjLWFmMmQtNThkMTk3MzI3NWYyIn0.7g5B1HErgVGqDngmF81AnU-aLjrItk3DvRl3Vn-FJcU",
  "access_expires_at": "2026-10-30T16:27:19.032949547Z",
  "refresh_token": "qg-WbWAQNXBX7ni0qjy95Tel0sbZEbgSZ3Y7BJPTMHw",
  "refresh_expires_at": "2026-10-31T04:12:19.032485105Z",
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
  "session_id": "059f6dd7-96df-47ed-ad76-daba140bfdd4",
  "subject": {
    "type": "STAFF",
    "id": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NTM4N2IzNC1lN2M5LTRhZmYtOTNjMS0wZGQzZjJhY2QwOGYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzc2MzksImlhdCI6MTc5MzM3NjczOSwianRpIjoiN2Q4OThiM2ItNWRjNi00ZWY1LTgyZDctOTc1ZjIyZDlkNTYyIiwic2lkIjoiMDU5ZjZkZDctOTZkZi00N2VkLWFkNzYtZGFiYTE0MGJmZGQ0In0.LbKEEEijgB7tpEy2aTqwHYwAP0t6wvx90evBsjHW1eY",
  "access_expires_at": "2026-10-30T16:27:19.607131495Z",
  "refresh_token": "iqN4mZv3H4JryEzQv5WpCvQwNiOomalgXlDUy25BN3A",
  "refresh_expires_at": "2026-10-31T04:12:19.606627319Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380684894551",
  "device_ref": "sandbox-1727"
}
```

```json
{
  "challenge_id": "a21dd121-745e-4d04-b739-9b92a9ba4603",
  "expires_at": "2026-10-30T16:17:19.875002723Z",
  "resend_available_at": "2026-10-30T16:12:20.875002723Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380684894551` → **200**

```json
{
  "phone": "+380684894551",
  "audience": "CLIENT",
  "code": "671986",
  "sent_at": "2026-10-30T16:12:19.87749868Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a21dd121-745e-4d04-b739-9b92a9ba4603",
  "code": "671986",
  "device_ref": "sandbox-1727"
}
```

```json
{
  "session_id": "c1ccacf6-c614-4b0f-86aa-948c05ca70a6",
  "subject": {
    "type": "CLIENT",
    "id": "ac46039d-a16f-46ab-b0bf-8fbbe65ca44a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYzQ2MDM5ZC1hMTZmLTQ2YWItYjBiZi04ZmJiZTY1Y2E0NGEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc3NjQwLCJpYXQiOjE3OTMzNzY3NDAsImp0aSI6ImJiOTNmYjRkLWJlOGUtNGI0MS1iMDJkLTg4YWM5OWRhNjE5OSIsInNpZCI6ImMxY2NhY2Y2LWM2MTQtNGIwZi04NmFhLTk0OGMwNWNhNzBhNiJ9.sSG7QxGzRjTWGUhjtmXqx_GW5uvsxSugxmRxAllBkmg",
  "access_expires_at": "2026-10-30T16:27:20.168507188Z",
  "refresh_token": "0S0W6xmXmbMyxoUOmqdLxN9oZ5bGXN7n_xtW3ai1oNc",
  "refresh_expires_at": "2026-11-29T16:12:20.167896755Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d099961e-9ecb-4645-bca1-ac016c13db7b",
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
  "id": "c7df31e7-50b1-4fb7-8d50-5ac7b86732e2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T16:17:20.456018Z",
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
  "command_id": "b5508470-5cff-4bd4-b703-1499bcea44f2",
  "quote_id": "c7df31e7-50b1-4fb7-8d50-5ac7b86732e2",
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
  "id": "dfaad4e7-7c6b-4361-8a1e-f4b506fd404e",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ac46039d-a16f-46ab-b0bf-8fbbe65ca44a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T16:12:20.739188Z",
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
    "id": "4c48cfcd-45a2-4637-80ea-2f95a7d387e2",
    "order_id": "dfaad4e7-7c6b-4361-8a1e-f4b506fd404e",
    "expires_at": "2026-10-30T16:12:35.742307Z",
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

`POST /api/driver/v1/offers/4c48cfcd-45a2-4637-80ea-2f95a7d387e2/reject` → **204**

```json
{
  "command_id": "8fbb6cd3-f430-4e58-a177-457fa7a59469"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "025eda6d-09b2-4585-b792-e9929df4829b",
    "order_id": "dfaad4e7-7c6b-4361-8a1e-f4b506fd404e",
    "expires_at": "2026-10-30T16:12:36.339999Z",
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

`POST /api/driver/v1/offers/025eda6d-09b2-4585-b792-e9929df4829b/accept` → **200**

```json
{
  "command_id": "ca7c9eb9-ace8-4360-93ef-1d4e9130b071"
}
```

```json
{
  "id": "51b9f270-8157-4a71-b71c-865b0c9c1d53",
  "order_id": "dfaad4e7-7c6b-4361-8a1e-f4b506fd404e",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d5f4fcfa-b212-482c-9832-d5107d2785b5",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/dfaad4e7-7c6b-4361-8a1e-f4b506fd404e/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T16:12:20.739771Z",
      "actor": {
        "type": "CLIENT",
        "id": "ac46039d-a16f-46ab-b0bf-8fbbe65ca44a",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "dfaad4e7-7c6b-4361-8a1e-f4b506fd404e",
        "quote_id": "c7df31e7-50b1-4fb7-8d50-5ac7b86732e2",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "b3059374-8522-493f-8480-8e0c45cdfb04"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T16:12:20.741536Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "dfaad4e7-7c6b-4361-8a1e-f4b506fd404e",
        "attempt_id": "e9733910-85f3-42e1-bab3-e1e91660f819",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "b3059374-8522-493f-8480-8e0c45cdfb04"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T16:12:20.768641Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "4c48cfcd-45a2-4637-80ea-2f95a7d387e2",
        "order_id": "dfaad4e7-7c6b-4361-8a1e-f4b506fd404e",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "b3059374-8522-493f-8480-8e0c45cdfb04"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-30T16:12:21.339111Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "4c48cfcd-45a2-4637-80ea-2f95a7d387e2",
        "order_id": "dfaad4e7-7c6b-4361-8a1e-f4b506fd404e"
      },
      "correlation_id": "f746093f-6447-43e9-b5b3-2da5f1befc2e"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order dfaad4e7-7c6b-4361-8a1e-f4b506fd404e — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/dfaad4e7-7c6b-4361-8a1e-f4b506fd404e` → **200**

```json
{
  "id": "dfaad4e7-7c6b-4361-8a1e-f4b506fd404e",
  "short_number": 13,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "ac46039d-a16f-46ab-b0bf-8fbbe65ca44a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "51b9f270-8157-4a71-b71c-865b0c9c1d53",
    "order_id": "dfaad4e7-7c6b-4361-8a1e-f4b506fd404e",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "d5f4fcfa-b212-482c-9832-d5107d2785b5",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T16:12:20.739188Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/dfaad4e7-7c6b-4361-8a1e-f4b506fd404e/cancel` → **200**

```json
{
  "command_id": "a6911977-c9db-46a8-a684-b9967e781967",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "dfaad4e7-7c6b-4361-8a1e-f4b506fd404e",
  "short_number": 13,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "ac46039d-a16f-46ab-b0bf-8fbbe65ca44a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "51b9f270-8157-4a71-b71c-865b0c9c1d53",
    "order_id": "dfaad4e7-7c6b-4361-8a1e-f4b506fd404e",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "d5f4fcfa-b212-482c-9832-d5107d2785b5",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T16:12:20.739188Z",
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
  "session_id": "b488f683-7ee5-409f-9949-f61a3c1c3f7f",
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
  "last_heartbeat_at": "2026-10-30T16:12:17.05603Z",
  "last_location_at": "2026-10-30T16:12:17.05603Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b488f683-7ee5-409f-9949-f61a3c1c3f7f/close` → **200**

```json
{
  "command_id": "deaf5c97-66c4-47b8-a6e0-f73ce376abd0",
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
  "session_id": "9e402278-177a-4a81-80dc-3151a4be19e5",
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
  "last_heartbeat_at": "2026-10-30T16:12:18.464811Z",
  "last_location_at": "2026-10-30T16:12:18.464811Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9e402278-177a-4a81-80dc-3151a4be19e5/close` → **200**

```json
{
  "command_id": "515a3b6a-d4c7-4614-987f-54ee079c8aef",
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
  "device_ref": "sandbox-18117"
}
```

```json
{
  "challenge_id": "d74fb103-6eab-4dcb-ba56-e0bf9ed5bc54",
  "expires_at": "2026-10-30T16:17:23.924775645Z",
  "resend_available_at": "2026-10-30T16:12:24.924775645Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "902641",
  "sent_at": "2026-10-30T16:12:23.927307356Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d74fb103-6eab-4dcb-ba56-e0bf9ed5bc54",
  "code": "902641",
  "device_ref": "sandbox-18117"
}
```

```json
{
  "session_id": "774ac1c3-561a-4df3-a567-8d853f89278a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NzY0NCwiaWF0IjoxNzkzMzc2NzQ0LCJqdGkiOiI3Zjc0NjhlYy05NzJlLTQ4MDMtOTcyOC02OWVkNzlhYjJmZDEiLCJzaWQiOiI3NzRhYzFjMy01NjFhLTRkZjMtYTU2Ny04ZDg1M2Y4OTI3OGEifQ.FT4BdvZDu9VOgX8VNo0XGjQkG9EZD7-FVvW2ZHsON9A",
  "access_expires_at": "2026-10-30T16:27:24.233437927Z",
  "refresh_token": "5hAeUVIhupr0SotLF3H934wUdHg-VB2Q1S5Be4WeEUA",
  "refresh_expires_at": "2026-11-29T16:12:24.23294376Z",
  "account_created": false
}
```

`POST /api/driver/v1/documents/upload-sessions` → **201**

```json
{
  "command_id": "5452f27b-864d-400b-b069-9c66e57d8a4c",
  "content_type": "application/pdf",
  "size_bytes": 86
}
```

```json
{
  "file_id": "7a1ab66f-20da-40d8-bf4c-e466c330acf6",
  "upload_path": "/api/driver/v1/uploads/7a1ab66f-20da-40d8-bf4c-e466c330acf6",
  "expires_at": "2026-10-30T16:27:24.50673556Z",
  "max_bytes": 86
}
```

`PUT /api/driver/v1/uploads/7a1ab66f-20da-40d8-bf4c-e466c330acf6` → **200**

```json
{
  "file_id": "7a1ab66f-20da-40d8-bf4c-e466c330acf6",
  "state": "SAFE",
  "content_type": "application/pdf",
  "size_bytes": 86,
  "reject_reason": null
}
```

## On the server's disk the file is not the PDF

Stored at `driver_document/2026-10/7a1ab66f-20da-40d8-bf4c-e466c330acf6`, first bytes `425a4631d9c0f464` (plain: `255044462d312e37` = %PDF-1.7).

## His download is exactly what he uploaded

`GET /api/driver/v1/files/7a1ab66f-20da-40d8-bf4c-e466c330acf6` → **200**

SHA-256 uploaded `c3b8dc5d8d6022840a4879a38e2c778f7962f3f4bff74150391dc3c538a46450`, downloaded `c3b8dc5d8d6022840a4879a38e2c778f7962f3f4bff74150391dc3c538a46450`.

Done: document 7a1ab66f-20da-40d8-bf4c-e466c330acf6 is encrypted on disk and downloads unchanged.

# Scenario: driver-states

## Only the two drivers of this scenario are online: Near about 200 m from the pickup, Far about 600 m

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-20187"
}
```

```json
{
  "challenge_id": "f9b64278-1c18-4062-94f1-73faf99fe6f4",
  "expires_at": "2026-10-30T16:17:24.852421387Z",
  "resend_available_at": "2026-10-30T16:12:25.852421387Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "600485",
  "sent_at": "2026-10-30T16:12:24.855606707Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f9b64278-1c18-4062-94f1-73faf99fe6f4",
  "code": "600485",
  "device_ref": "sandbox-20187"
}
```

```json
{
  "session_id": "8c448cee-ffec-49cd-8927-9d24ca0fbd0c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NzY0NSwiaWF0IjoxNzkzMzc2NzQ1LCJqdGkiOiJmNmZiYWRhOS1iMjc2LTRjMWQtOWJmMi1lM2FlNDUxOTRhMWIiLCJzaWQiOiI4YzQ0OGNlZS1mZmVjLTQ5Y2QtODkyNy05ZDI0Y2EwZmJkMGMifQ.LFKrPp4Tr6Iu7CFG_WmoZhMIsD3QY2k9qKzxbOH4vpg",
  "access_expires_at": "2026-10-30T16:27:25.152613432Z",
  "refresh_token": "MIE97p8vADYQw0ZQ4HnxDWHLURjcmm_BeDdR2NlwR9o",
  "refresh_expires_at": "2026-11-29T16:12:25.152093633Z",
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
  "device_ref": "sandbox-24091"
}
```

```json
{
  "challenge_id": "560be462-96ab-4cc0-8312-0d5e4fae7f6a",
  "expires_at": "2026-10-30T16:17:25.678648541Z",
  "resend_available_at": "2026-10-30T16:12:26.678648541Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "175893",
  "sent_at": "2026-10-30T16:12:25.681387544Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "560be462-96ab-4cc0-8312-0d5e4fae7f6a",
  "code": "175893",
  "device_ref": "sandbox-24091"
}
```

```json
{
  "session_id": "e499c07f-3a59-4417-9765-c61aa001beb6",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NzY0NSwiaWF0IjoxNzkzMzc2NzQ1LCJqdGkiOiI2MTIzMWZkZS1iNzVkLTQ1OTUtOTc5Yi0yYWFkMDhkZTRlZjMiLCJzaWQiOiJlNDk5YzA3Zi0zYTU5LTQ0MTctOTc2NS1jNjFhYTAwMWJlYjYifQ.tUwE8kAsObXP5CrB9f1z0TnooQxA7gPk7yYBsJEPTI0",
  "access_expires_at": "2026-10-30T16:27:25.969788254Z",
  "refresh_token": "z-aIWH0FlDF02CLISgX0FIjkbchoYPuKkGzjgI1TgK8",
  "refresh_expires_at": "2026-11-29T16:12:25.969246874Z",
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
  "command_id": "fe117835-db35-4abe-a3a3-16178ece8735",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:12:26Z",
    "sequence": 1793376746510
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b652978a-94fc-4135-ab17-0d0ebbd4d3a0",
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
  "last_heartbeat_at": "2026-10-30T16:12:26.527978Z",
  "last_location_at": "2026-10-30T16:12:26.527978Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-1382"
}
```

```json
{
  "challenge_id": "486b5aa9-29ba-4e87-838e-450e4f8f2386",
  "expires_at": "2026-10-30T16:17:26.797016431Z",
  "resend_available_at": "2026-10-30T16:12:27.797016431Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "862277",
  "sent_at": "2026-10-30T16:12:26.799381958Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "486b5aa9-29ba-4e87-838e-450e4f8f2386",
  "code": "862277",
  "device_ref": "sandbox-1382"
}
```

```json
{
  "session_id": "0b8d1b3e-f1ee-460c-8eed-effa63d88cf8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NzY0NywiaWF0IjoxNzkzMzc2NzQ3LCJqdGkiOiI2NWExNmQxYy1kNjBlLTRiNDUtOTE1ZS02YmNiNjlhZGMxNDEiLCJzaWQiOiIwYjhkMWIzZS1mMWVlLTQ2MGMtOGVlZC1lZmZhNjNkODhjZjgifQ.0_5kRtBf0XTAv3SQ_WuGWIZBv7_5yJ861ndJMnVVK0A",
  "access_expires_at": "2026-10-30T16:27:27.091031211Z",
  "refresh_token": "Sew5P1lG6_hvRimwgMdX28WGuMVl-yTvTnzO3Wjw214",
  "refresh_expires_at": "2026-11-29T16:12:27.090568512Z",
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
  "command_id": "6ac82a4f-ef3d-4753-bfe0-19ecbf9800bd",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:12:27Z",
    "sequence": 1793376747641
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "0aacc174-2c83-4430-9f5f-694e41a90290",
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
  "last_heartbeat_at": "2026-10-30T16:12:27.658595Z",
  "last_location_at": "2026-10-30T16:12:27.658595Z",
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
  "session_id": "5ccfec26-ef22-432b-b206-236f275a5e01",
  "subject": {
    "type": "STAFF",
    "id": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NTM4N2IzNC1lN2M5LTRhZmYtOTNjMS0wZGQzZjJhY2QwOGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzc2NDgsImlhdCI6MTc5MzM3Njc0OCwianRpIjoiZDZmM2YzZDktYmVlZC00ZGU1LTgzYWQtYTQxNWE1MjcxYTA5Iiwic2lkIjoiNWNjZmVjMjYtZWYyMi00MzJiLWIyMDYtMjM2ZjI3NWE1ZTAxIn0.6GJ1k3FjlVLSnh7L5SxsBwv2YxpezcJ7qCGs6GXdnWc",
  "access_expires_at": "2026-10-30T16:27:28.236182691Z",
  "refresh_token": "CPsFaolJxO2a_teeP1meua_XLOq0qNH4m7dwUp9WMZo",
  "refresh_expires_at": "2026-10-31T04:12:28.235638879Z",
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
  "session_id": "c0a883ab-920c-451b-be62-9c676d2a8a45",
  "subject": {
    "type": "STAFF",
    "id": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NTM4N2IzNC1lN2M5LTRhZmYtOTNjMS0wZGQzZjJhY2QwOGYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzc2NDgsImlhdCI6MTc5MzM3Njc0OCwianRpIjoiNWQ0MmQ2MTItMzcyMS00NTdhLThkOTktNzRiNDU3MmY4Y2I3Iiwic2lkIjoiYzBhODgzYWItOTIwYy00NTFiLWJlNjItOWM2NzZkMmE4YTQ1In0.SPAUk_e3_uILnBykPqmNGxa1gpxSuMkN4LFSmoqbNRI",
  "access_expires_at": "2026-10-30T16:27:28.808027446Z",
  "refresh_token": "z71xrD2W7Muf7ivdWtSMyFKSjaJtzKf9p6S8F7TWM8c",
  "refresh_expires_at": "2026-10-31T04:12:28.80745062Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380684394234",
  "device_ref": "sandbox-27"
}
```

```json
{
  "challenge_id": "eada6756-759d-4b23-9b5d-3efabe33fa09",
  "expires_at": "2026-10-30T16:17:29.079343383Z",
  "resend_available_at": "2026-10-30T16:12:30.079343383Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380684394234` → **200**

```json
{
  "phone": "+380684394234",
  "audience": "CLIENT",
  "code": "258331",
  "sent_at": "2026-10-30T16:12:29.082044942Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "eada6756-759d-4b23-9b5d-3efabe33fa09",
  "code": "258331",
  "device_ref": "sandbox-27"
}
```

```json
{
  "session_id": "04b81289-9aa1-466e-9dc5-f9f28064812e",
  "subject": {
    "type": "CLIENT",
    "id": "3a902188-08c0-466f-b1db-01a60c3d3434"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYTkwMjE4OC0wOGMwLTQ2NmYtYjFkYi0wMWE2MGMzZDM0MzQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc3NjQ5LCJpYXQiOjE3OTMzNzY3NDksImp0aSI6ImM3Yjg3MzFjLTdkMDEtNGFjMy1hYmI1LTI3MmJhNjgwMjA1OSIsInNpZCI6IjA0YjgxMjg5LTlhYTEtNDY2ZS05ZGM1LWY5ZjI4MDY0ODEyZSJ9.N-N5HKKBqOy8sMppCiD907CoMNb5WcM-cTWXr3zMZOw",
  "access_expires_at": "2026-10-30T16:27:29.386191875Z",
  "refresh_token": "r20Gg6TckvP_A7uUnNA0JhQiA5W-OfhDN-wwVq_yFdU",
  "refresh_expires_at": "2026-11-29T16:12:29.385642712Z",
  "account_created": true
}
```

## E2: Near has the offer and pauses: the offer is revoked and Far gets the order at once

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c68325e1-aeac-4746-804d-b41c872df8d8",
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
  "id": "2d403efc-1b22-4634-8b02-20875f07bf1d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T16:17:29.671592Z",
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
  "command_id": "ea900afc-f781-4322-8bc0-929fc58b54f3",
  "quote_id": "2d403efc-1b22-4634-8b02-20875f07bf1d",
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
  "id": "24822227-f6f8-4f7c-bd64-c84ee371d26c",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3a902188-08c0-466f-b1db-01a60c3d3434",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T16:12:29.966725Z",
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
    "id": "e95fb92d-9539-4e36-93b9-527eedaf9766",
    "order_id": "24822227-f6f8-4f7c-bd64-c84ee371d26c",
    "expires_at": "2026-10-30T16:12:44.969876Z",
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
  "session_id": "b652978a-94fc-4135-ab17-0d0ebbd4d3a0",
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
  "last_heartbeat_at": "2026-10-30T16:12:26.527978Z",
  "last_location_at": "2026-10-30T16:12:26.527978Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

`POST /api/driver/v1/work-sessions/b652978a-94fc-4135-ab17-0d0ebbd4d3a0/pause` → **200**

```json
{
  "command_id": "0d7c2d26-db6d-453e-a171-9de25e92de43",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b652978a-94fc-4135-ab17-0d0ebbd4d3a0",
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
  "last_heartbeat_at": "2026-10-30T16:12:26.527978Z",
  "last_location_at": "2026-10-30T16:12:26.527978Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/offers/e95fb92d-9539-4e36-93b9-527eedaf9766/accept` → **409**

```json
{
  "command_id": "63588b8d-654c-49d4-b69b-8d5738340649"
}
```

```json
{
  "instance": "/api/driver/v1/offers/e95fb92d-9539-4e36-93b9-527eedaf9766/accept",
  "status": 409,
  "title": "Offer revoked",
  "type": "https://errors.blizz.taxi/offer-revoked",
  "code": "OFFER_REVOKED",
  "correlation_id": "6111972d-0b09-47ed-ae29-6f92a1125d8f"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "bae872dc-42ad-4e56-bd4d-d70257e1f375",
    "order_id": "24822227-f6f8-4f7c-bd64-c84ee371d26c",
    "expires_at": "2026-10-30T16:12:45.812926Z",
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

`POST /api/driver/v1/offers/bae872dc-42ad-4e56-bd4d-d70257e1f375/reject` → **204**

```json
{
  "command_id": "d1dfec36-1965-498b-9140-75108aa92f9d"
}
```

`GET /api/operator/v1/orders/24822227-f6f8-4f7c-bd64-c84ee371d26c/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T16:12:29.967327Z",
      "actor": {
        "type": "CLIENT",
        "id": "3a902188-08c0-466f-b1db-01a60c3d3434",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "24822227-f6f8-4f7c-bd64-c84ee371d26c",
        "quote_id": "2d403efc-1b22-4634-8b02-20875f07bf1d",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "9c287d3a-eb9c-425f-8554-f39e04537435"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T16:12:29.969153Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "24822227-f6f8-4f7c-bd64-c84ee371d26c",
        "attempt_id": "51f6d1fe-3138-4917-b708-14e0c8acd140",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "9c287d3a-eb9c-425f-8554-f39e04537435"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T16:12:29.995735Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "e95fb92d-9539-4e36-93b9-527eedaf9766",
        "order_id": "24822227-f6f8-4f7c-bd64-c84ee371d26c",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "9c287d3a-eb9c-425f-8554-f39e04537435"
    },
    {
      "sequence": 3,
      "type": "OfferRevoked",
      "occurred_at": "2026-10-30T16:12:30.812022Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": "DRIVER_PAUSED",
      "details": {
        "reason": "DRIVER_PAUSED",
        "offer_id": "e95fb92d-9539-4e36-93b9-527eedaf9766",
        "order_id": "24822227-f6f8-4f7c-bd64-c84ee371d26c",
        "driver_id": "5a000000-0000-4000-8000-000000000401"
      },
      "correlation_id": "1734c197-03a7-44a8-9a77-15d0dfc0846f"
    },
```

`GET /api/operator/v1/orders/24822227-f6f8-4f7c-bd64-c84ee371d26c` → **200**

```json
{
  "id": "24822227-f6f8-4f7c-bd64-c84ee371d26c",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "3a902188-08c0-466f-b1db-01a60c3d3434",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T16:12:29.966725Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/24822227-f6f8-4f7c-bd64-c84ee371d26c/cancel` → **200**

```json
{
  "command_id": "20c0cbce-8f9c-4bf4-8107-c2c9ab0c970c",
  "expected_version": 6,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "24822227-f6f8-4f7c-bd64-c84ee371d26c",
  "short_number": 14,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 7,
  "channel": "APP",
  "payer_client_id": "3a902188-08c0-466f-b1db-01a60c3d3434",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T16:12:29.966725Z",
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

E2: offer e95fb92d-9539-4e36-93b9-527eedaf9766 revoked by the pause, the late accept got OFFER_REVOKED, Far had the order next.

## E5: pause and accept sent at the same moment, five rounds; Far is offline so each order goes to Near

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "0aacc174-2c83-4430-9f5f-694e41a90290",
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
  "last_heartbeat_at": "2026-10-30T16:12:27.658595Z",
  "last_location_at": "2026-10-30T16:12:27.658595Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/0aacc174-2c83-4430-9f5f-694e41a90290/close` → **200**

```json
{
  "command_id": "12a54abc-3fa2-469e-b4d4-8a542883418f",
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
  "session_id": "b652978a-94fc-4135-ab17-0d0ebbd4d3a0",
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
  "last_heartbeat_at": "2026-10-30T16:12:26.527978Z",
  "last_location_at": "2026-10-30T16:12:26.527978Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/work-sessions/b652978a-94fc-4135-ab17-0d0ebbd4d3a0/resume` → **200**

```json
{
  "command_id": "0f430e15-eaae-495b-a12c-dec453ac0bbd",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b652978a-94fc-4135-ab17-0d0ebbd4d3a0",
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
  "last_heartbeat_at": "2026-10-30T16:12:26.527978Z",
  "last_location_at": "2026-10-30T16:12:26.527978Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b652978a-94fc-4135-ab17-0d0ebbd4d3a0/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:12:33Z",
    "sequence": 1793376753670
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b652978a-94fc-4135-ab17-0d0ebbd4d3a0",
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
  "last_heartbeat_at": "2026-10-30T16:12:33.687231Z",
  "last_location_at": "2026-10-30T16:12:33.687231Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "455bc500-4d6a-4a71-a99f-d5a7cf4a1a7f",
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
  "id": "4e802ceb-222f-41f6-bde5-b645e84ebc70",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T16:17:33.966325Z",
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
  "command_id": "3c824941-d295-4271-8ebc-9b9ce654b1c8",
  "quote_id": "4e802ceb-222f-41f6-bde5-b645e84ebc70",
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
  "id": "029047b9-04be-45e1-a532-9466495f04a2",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3a902188-08c0-466f-b1db-01a60c3d3434",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T16:12:34.258906Z",
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
    "id": "2c1da9fd-8851-42d5-9f37-4fbeb094a5cf",
    "order_id": "029047b9-04be-45e1-a532-9466495f04a2",
    "expires_at": "2026-10-30T16:12:49.262555Z",
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
  "session_id": "b652978a-94fc-4135-ab17-0d0ebbd4d3a0",
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
  "last_heartbeat_at": "2026-10-30T16:12:33.687231Z",
  "last_location_at": "2026-10-30T16:12:33.687231Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

Round 1, at the same moment:

`POST /api/driver/v1/offers/2c1da9fd-8851-42d5-9f37-4fbeb094a5cf/accept` → **409**

```json
{
  "instance": "/api/driver/v1/offers/2c1da9fd-8851-42d5-9f37-4fbeb094a5cf/accept",
  "status": 409,
  "title": "Offer revoked",
  "type": "https://errors.blizz.taxi/offer-revoked",
  "code": "OFFER_REVOKED",
  "correlation_id": "8a2f27d2-152f-48db-8944-f62d0098f08e"
}
```

`POST /api/driver/v1/work-sessions/b652978a-94fc-4135-ab17-0d0ebbd4d3a0/pause` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b652978a-94fc-4135-ab17-0d0ebbd4d3a0",
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
  "last_heartbeat_at": "2026-10-30T16:12:33.687231Z",
  "last_location_at": "2026-10-30T16:12:33.687231Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

Round 1: the pause won; the accept got OFFER_REVOKED.

`GET /api/operator/v1/orders/029047b9-04be-45e1-a532-9466495f04a2` → **200**

```json
{
  "id": "029047b9-04be-45e1-a532-9466495f04a2",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "3a902188-08c0-466f-b1db-01a60c3d3434",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T16:12:34.258906Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/029047b9-04be-45e1-a532-9466495f04a2` → **200**

```json
{
  "id": "029047b9-04be-45e1-a532-9466495f04a2",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "3a902188-08c0-466f-b1db-01a60c3d3434",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T16:12:34.258906Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/029047b9-04be-45e1-a532-9466495f04a2/cancel` → **200**

```json
{
  "command_id": "77c896db-49c9-4b5b-b604-660dcbce4415",
  "expected_version": 4,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "029047b9-04be-45e1-a532-9466495f04a2",
  "short_number": 15,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "3a902188-08c0-466f-b1db-01a60c3d3434",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T16:12:34.258906Z",
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
  "session_id": "b652978a-94fc-4135-ab17-0d0ebbd4d3a0",
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
  "last_heartbeat_at": "2026-10-30T16:12:33.687231Z",
  "last_location_at": "2026-10-30T16:12:33.687231Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/work-sessions/b652978a-94fc-4135-ab17-0d0ebbd4d3a0/resume` → **200**

```json
{
  "command_id": "552aa3ac-f4eb-44fa-aa1a-146b3c99f54b",
  "expected_version": 3
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b652978a-94fc-4135-ab17-0d0ebbd4d3a0",
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
  "last_heartbeat_at": "2026-10-30T16:12:33.687231Z",
  "last_location_at": "2026-10-30T16:12:33.687231Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b652978a-94fc-4135-ab17-0d0ebbd4d3a0/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:12:36Z",
    "sequence": 1793376756588
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b652978a-94fc-4135-ab17-0d0ebbd4d3a0",
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
  "last_heartbeat_at": "2026-10-30T16:12:36.604763Z",
  "last_location_at": "2026-10-30T16:12:36.604763Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "60e0b2a7-fde7-4bae-8b47-f324901efbf9",
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
  "id": "6eccc3a8-9cd4-4e79-bb4d-b265acaedf8d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T16:17:36.878145Z",
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
  "command_id": "0c22818d-f09c-4e1a-a8a6-6583531c29e9",
  "quote_id": "6eccc3a8-9cd4-4e79-bb4d-b265acaedf8d",
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
  "id": "ba5c4016-7417-4943-94e7-a93b8f394c45",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3a902188-08c0-466f-b1db-01a60c3d3434",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T16:12:37.159057Z",
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
    "id": "dd9dd8d1-851e-4969-93e5-e017d830bf19",
    "order_id": "ba5c4016-7417-4943-94e7-a93b8f394c45",
    "expires_at": "2026-10-30T16:12:52.161752Z",
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
  "session_id": "b652978a-94fc-4135-ab17-0d0ebbd4d3a0",
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
  "last_heartbeat_at": "2026-10-30T16:12:36.604763Z",
  "last_location_at": "2026-10-30T16:12:36.604763Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

Round 2, at the same moment:

`POST /api/driver/v1/offers/dd9dd8d1-851e-4969-93e5-e017d830bf19/accept` → **200**

```json
{
  "id": "6e1a59e0-4d8b-4810-b7ff-38a51901ed64",
  "order_id": "ba5c4016-7417-4943-94e7-a93b8f394c45",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "11c1421d-8785-4feb-83af-dca315dd9d91",
  "trip_phase": "TO_PICKUP"
}
```

`POST /api/driver/v1/work-sessions/b652978a-94fc-4135-ab17-0d0ebbd4d3a0/pause` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b652978a-94fc-4135-ab17-0d0ebbd4d3a0",
  "session_version": 5,
  "session_state": "OPEN",
  "intent": "PAUSE_AFTER_CURRENT",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T16:12:36.604763Z",
  "last_location_at": "2026-10-30T16:12:36.604763Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_PAUSE_AFTER_CURRENT",
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

Round 2: the accept won; the pause waits for the end of the trip.

`GET /api/operator/v1/orders/ba5c4016-7417-4943-94e7-a93b8f394c45` → **200**

```json
{
  "id": "ba5c4016-7417-4943-94e7-a93b8f394c45",
  "short_number": 16,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "3a902188-08c0-466f-b1db-01a60c3d3434",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "6e1a59e0-4d8b-4810-b7ff-38a51901ed64",
    "order_id": "ba5c4016-7417-4943-94e7-a93b8f394c45",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "11c1421d-8785-4feb-83af-dca315dd9d91",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T16:12:37.159057Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/ba5c4016-7417-4943-94e7-a93b8f394c45` → **200**

```json
{
  "id": "ba5c4016-7417-4943-94e7-a93b8f394c45",
  "short_number": 16,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "3a902188-08c0-466f-b1db-01a60c3d3434",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "6e1a59e0-4d8b-4810-b7ff-38a51901ed64",
    "order_id": "ba5c4016-7417-4943-94e7-a93b8f394c45",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "11c1421d-8785-4feb-83af-dca315dd9d91",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T16:12:37.159057Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/ba5c4016-7417-4943-94e7-a93b8f394c45/cancel` → **200**

```json
{
  "command_id": "2bda4e98-3316-4621-a58c-7a9cb0cd91e3",
  "expected_version": 3,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "ba5c4016-7417-4943-94e7-a93b8f394c45",
  "short_number": 16,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "3a902188-08c0-466f-b1db-01a60c3d3434",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "6e1a59e0-4d8b-4810-b7ff-38a51901ed64",
    "order_id": "ba5c4016-7417-4943-94e7-a93b8f394c45",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "11c1421d-8785-4feb-83af-dca315dd9d91",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T16:12:37.159057Z",
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
  "session_id": "b652978a-94fc-4135-ab17-0d0ebbd4d3a0",
  "session_version": 6,
  "session_state": "OPEN",
  "intent": "NOT_ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T16:12:36.604763Z",
  "last_location_at": "2026-10-30T16:12:36.604763Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/work-sessions/b652978a-94fc-4135-ab17-0d0ebbd4d3a0/resume` → **200**

```json
{
  "command_id": "6ae81ba0-3bfd-4333-af87-170c6f9db06a",
  "expected_version": 6
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b652978a-94fc-4135-ab17-0d0ebbd4d3a0",
  "session_version": 7,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T16:12:36.604763Z",
  "last_location_at": "2026-10-30T16:12:36.604763Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b652978a-94fc-4135-ab17-0d0ebbd4d3a0/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:12:39Z",
    "sequence": 1793376759463
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b652978a-94fc-4135-ab17-0d0ebbd4d3a0",
  "session_version": 7,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T16:12:39.480605Z",
  "last_location_at": "2026-10-30T16:12:39.480605Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "aecb6f5c-7ab4-4601-8f02-f41869081841",
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
  "id": "35b0241b-e60a-489c-a531-11074ad11294",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T16:17:39.755365Z",
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
  "command_id": "23c0d7e9-1b8c-4a75-8d3a-f3db2b45968d",
  "quote_id": "35b0241b-e60a-489c-a531-11074ad11294",
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
  "id": "c16936cd-6249-494d-875e-41bc84f510c7",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3a902188-08c0-466f-b1db-01a60c3d3434",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T16:12:40.033467Z",
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
    "id": "2a68094a-51af-4df9-9365-2bedfcee14e0",
    "order_id": "c16936cd-6249-494d-875e-41bc84f510c7",
    "expires_at": "2026-10-30T16:12:55.036166Z",
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
  "session_id": "b652978a-94fc-4135-ab17-0d0ebbd4d3a0",
  "session_version": 7,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "OFFERED",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T16:12:39.480605Z",
  "last_location_at": "2026-10-30T16:12:39.480605Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

Round 3, at the same moment:

`POST /api/driver/v1/offers/2a68094a-51af-4df9-9365-2bedfcee14e0/accept` → **409**

```json
{
  "instance": "/api/driver/v1/offers/2a68094a-51af-4df9-9365-2bedfcee14e0/accept",
  "status": 409,
  "title": "Offer revoked",
  "type": "https://errors.blizz.taxi/offer-revoked",
  "code": "OFFER_REVOKED",
  "correlation_id": "61708049-566b-4cd7-a9de-7d24d5ec88cd"
}
```

`POST /api/driver/v1/work-sessions/b652978a-94fc-4135-ab17-0d0ebbd4d3a0/pause` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b652978a-94fc-4135-ab17-0d0ebbd4d3a0",
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
  "last_heartbeat_at": "2026-10-30T16:12:39.480605Z",
  "last_location_at": "2026-10-30T16:12:39.480605Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

Round 3: the pause won; the accept got OFFER_REVOKED.

`GET /api/operator/v1/orders/c16936cd-6249-494d-875e-41bc84f510c7` → **200**

```json
{
  "id": "c16936cd-6249-494d-875e-41bc84f510c7",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "3a902188-08c0-466f-b1db-01a60c3d3434",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T16:12:40.033467Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/c16936cd-6249-494d-875e-41bc84f510c7` → **200**

```json
{
  "id": "c16936cd-6249-494d-875e-41bc84f510c7",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "3a902188-08c0-466f-b1db-01a60c3d3434",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T16:12:40.033467Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/c16936cd-6249-494d-875e-41bc84f510c7/cancel` → **200**

```json
{
  "command_id": "0855cef4-0043-461f-bd8a-253bc88cc6cb",
  "expected_version": 4,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "c16936cd-6249-494d-875e-41bc84f510c7",
  "short_number": 17,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "3a902188-08c0-466f-b1db-01a60c3d3434",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T16:12:40.033467Z",
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
  "session_id": "b652978a-94fc-4135-ab17-0d0ebbd4d3a0",
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
  "last_heartbeat_at": "2026-10-30T16:12:39.480605Z",
  "last_location_at": "2026-10-30T16:12:39.480605Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/work-sessions/b652978a-94fc-4135-ab17-0d0ebbd4d3a0/resume` → **200**

```json
{
  "command_id": "b6c916e8-97d5-4aaa-a03a-bcbdab724147",
  "expected_version": 8
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b652978a-94fc-4135-ab17-0d0ebbd4d3a0",
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
  "last_heartbeat_at": "2026-10-30T16:12:39.480605Z",
  "last_location_at": "2026-10-30T16:12:39.480605Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b652978a-94fc-4135-ab17-0d0ebbd4d3a0/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:12:42Z",
    "sequence": 1793376762375
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b652978a-94fc-4135-ab17-0d0ebbd4d3a0",
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
  "last_heartbeat_at": "2026-10-30T16:12:42.392472Z",
  "last_location_at": "2026-10-30T16:12:42.392472Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "96460ee0-c13c-4d52-8032-1d036aa3832b",
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
  "id": "4e34dd71-e7ae-4216-adbd-82a86593f122",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T16:17:42.671049Z",
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
  "command_id": "5516209c-ee8f-4f7d-86e3-ea22dc1c407d",
  "quote_id": "4e34dd71-e7ae-4216-adbd-82a86593f122",
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
  "id": "927f1870-063a-46f3-a631-f655d65b52b4",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3a902188-08c0-466f-b1db-01a60c3d3434",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T16:12:42.96036Z",
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
    "id": "f1c532e1-6982-4e1c-aea3-74c4046c3327",
    "order_id": "927f1870-063a-46f3-a631-f655d65b52b4",
    "expires_at": "2026-10-30T16:12:57.963356Z",
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
  "session_id": "b652978a-94fc-4135-ab17-0d0ebbd4d3a0",
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
  "last_heartbeat_at": "2026-10-30T16:12:42.392472Z",
  "last_location_at": "2026-10-30T16:12:42.392472Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

Round 4, at the same moment:

`POST /api/driver/v1/offers/f1c532e1-6982-4e1c-aea3-74c4046c3327/accept` → **409**

```json
{
  "instance": "/api/driver/v1/offers/f1c532e1-6982-4e1c-aea3-74c4046c3327/accept",
  "status": 409,
  "title": "Offer revoked",
  "type": "https://errors.blizz.taxi/offer-revoked",
  "code": "OFFER_REVOKED",
  "correlation_id": "5528f2ad-60df-4594-ade3-b8edae448401"
}
```

`POST /api/driver/v1/work-sessions/b652978a-94fc-4135-ab17-0d0ebbd4d3a0/pause` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b652978a-94fc-4135-ab17-0d0ebbd4d3a0",
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
  "last_heartbeat_at": "2026-10-30T16:12:42.392472Z",
  "last_location_at": "2026-10-30T16:12:42.392472Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

Round 4: the pause won; the accept got OFFER_REVOKED.

`GET /api/operator/v1/orders/927f1870-063a-46f3-a631-f655d65b52b4` → **200**

```json
{
  "id": "927f1870-063a-46f3-a631-f655d65b52b4",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "3a902188-08c0-466f-b1db-01a60c3d3434",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T16:12:42.96036Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/927f1870-063a-46f3-a631-f655d65b52b4` → **200**

```json
{
  "id": "927f1870-063a-46f3-a631-f655d65b52b4",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "3a902188-08c0-466f-b1db-01a60c3d3434",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T16:12:42.96036Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/927f1870-063a-46f3-a631-f655d65b52b4/cancel` → **200**

```json
{
  "command_id": "57ab38c7-b626-4b63-92ff-5455387ddc9f",
  "expected_version": 4,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "927f1870-063a-46f3-a631-f655d65b52b4",
  "short_number": 18,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "3a902188-08c0-466f-b1db-01a60c3d3434",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T16:12:42.96036Z",
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
  "session_id": "b652978a-94fc-4135-ab17-0d0ebbd4d3a0",
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
  "last_heartbeat_at": "2026-10-30T16:12:42.392472Z",
  "last_location_at": "2026-10-30T16:12:42.392472Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/work-sessions/b652978a-94fc-4135-ab17-0d0ebbd4d3a0/resume` → **200**

```json
{
  "command_id": "3d493d25-bbe2-4895-b482-9421da54d412",
  "expected_version": 10
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b652978a-94fc-4135-ab17-0d0ebbd4d3a0",
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
  "last_heartbeat_at": "2026-10-30T16:12:42.392472Z",
  "last_location_at": "2026-10-30T16:12:42.392472Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b652978a-94fc-4135-ab17-0d0ebbd4d3a0/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:12:45Z",
    "sequence": 1793376765266
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b652978a-94fc-4135-ab17-0d0ebbd4d3a0",
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
  "last_heartbeat_at": "2026-10-30T16:12:45.283078Z",
  "last_location_at": "2026-10-30T16:12:45.283078Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f41fcc0a-f43e-41b8-b23f-7f6d7e6c2da6",
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
  "id": "98ca9f9d-eadc-4b0b-84c8-73da70de0d53",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T16:17:45.557577Z",
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
  "command_id": "902c4a43-945b-452b-847e-b440890a6ac1",
  "quote_id": "98ca9f9d-eadc-4b0b-84c8-73da70de0d53",
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
  "id": "b39d043f-3696-41aa-8472-96cc6b957678",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3a902188-08c0-466f-b1db-01a60c3d3434",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T16:12:45.843302Z",
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
    "id": "92c91ad2-036d-49af-bf82-2d44627ae141",
    "order_id": "b39d043f-3696-41aa-8472-96cc6b957678",
    "expires_at": "2026-10-30T16:13:00.846795Z",
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
  "session_id": "b652978a-94fc-4135-ab17-0d0ebbd4d3a0",
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
  "last_heartbeat_at": "2026-10-30T16:12:45.283078Z",
  "last_location_at": "2026-10-30T16:12:45.283078Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

Round 5, at the same moment:

`POST /api/driver/v1/offers/92c91ad2-036d-49af-bf82-2d44627ae141/accept` → **409**

```json
{
  "instance": "/api/driver/v1/offers/92c91ad2-036d-49af-bf82-2d44627ae141/accept",
  "status": 409,
  "title": "Offer revoked",
  "type": "https://errors.blizz.taxi/offer-revoked",
  "code": "OFFER_REVOKED",
  "correlation_id": "2cd3dd51-1b3b-4571-9882-131ddd3e8197"
}
```

`POST /api/driver/v1/work-sessions/b652978a-94fc-4135-ab17-0d0ebbd4d3a0/pause` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b652978a-94fc-4135-ab17-0d0ebbd4d3a0",
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
  "last_heartbeat_at": "2026-10-30T16:12:45.283078Z",
  "last_location_at": "2026-10-30T16:12:45.283078Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

Round 5: the pause won; the accept got OFFER_REVOKED.

`GET /api/operator/v1/orders/b39d043f-3696-41aa-8472-96cc6b957678` → **200**

```json
{
  "id": "b39d043f-3696-41aa-8472-96cc6b957678",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "3a902188-08c0-466f-b1db-01a60c3d3434",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T16:12:45.843302Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/b39d043f-3696-41aa-8472-96cc6b957678` → **200**

```json
{
  "id": "b39d043f-3696-41aa-8472-96cc6b957678",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "3a902188-08c0-466f-b1db-01a60c3d3434",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T16:12:45.843302Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/b39d043f-3696-41aa-8472-96cc6b957678/cancel` → **200**

```json
{
  "command_id": "78127f3a-3b5e-44ad-b50a-c85b37326667",
  "expected_version": 4,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "b39d043f-3696-41aa-8472-96cc6b957678",
  "short_number": 19,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "3a902188-08c0-466f-b1db-01a60c3d3434",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T16:12:45.843302Z",
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

E5: 1 rounds won by the accept, 4 by the pause; one winner each round, no 5xx.

## E4: a fix with 250 m accuracy keeps Near out of new orders; an accurate one brings him back

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b652978a-94fc-4135-ab17-0d0ebbd4d3a0",
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
  "last_heartbeat_at": "2026-10-30T16:12:45.283078Z",
  "last_location_at": "2026-10-30T16:12:45.283078Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/work-sessions/b652978a-94fc-4135-ab17-0d0ebbd4d3a0/resume` → **200**

```json
{
  "command_id": "f5cfbd42-89de-4ffc-a00b-b5c0b94d905e",
  "expected_version": 12
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b652978a-94fc-4135-ab17-0d0ebbd4d3a0",
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
  "last_heartbeat_at": "2026-10-30T16:12:45.283078Z",
  "last_location_at": "2026-10-30T16:12:45.283078Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b652978a-94fc-4135-ab17-0d0ebbd4d3a0/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 250,
    "recorded_at": "2026-10-30T16:12:48Z",
    "sequence": 1793376768120
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b652978a-94fc-4135-ab17-0d0ebbd4d3a0",
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
  "last_heartbeat_at": "2026-10-30T16:12:48.141764Z",
  "last_location_at": "2026-10-30T16:12:48.141764Z",
  "eligible": false,
  "ineligible_reasons": [
    "LOCATION_INACCURATE"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/work-sessions/b652978a-94fc-4135-ab17-0d0ebbd4d3a0/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:12:48Z",
    "sequence": 1793376768414
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b652978a-94fc-4135-ab17-0d0ebbd4d3a0",
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
  "last_heartbeat_at": "2026-10-30T16:12:48.431784Z",
  "last_location_at": "2026-10-30T16:12:48.431784Z",
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
  "at": "2026-10-30T16:12:48.704358076Z",
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
      "last_location_at": "2026-10-30T16:12:48.431784Z",
      "last_heartbeat_at": "2026-10-30T16:12:48.431784Z",
      "order_id": null
    }
  ]
}
```

Done: E2, E5 (1/4), E4 and last_heartbeat_at 2026-10-30T16:12:48.431784Z.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b652978a-94fc-4135-ab17-0d0ebbd4d3a0",
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
  "last_heartbeat_at": "2026-10-30T16:12:48.431784Z",
  "last_location_at": "2026-10-30T16:12:48.431784Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b652978a-94fc-4135-ab17-0d0ebbd4d3a0/close` → **200**

```json
{
  "command_id": "dfea8086-7be9-4bc1-890d-8436acd050fe",
  "expected_version": 13
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
  "session_id": "62ba892f-13af-4664-8902-eacc8922d0a6",
  "subject": {
    "type": "STAFF",
    "id": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NTM4N2IzNC1lN2M5LTRhZmYtOTNjMS0wZGQzZjJhY2QwOGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzc2NzAsImlhdCI6MTc5MzM3Njc3MCwianRpIjoiMzI0Nzc3MTAtOTRjNy00MWU0LTg4YTItNjFmMWM2NGZmNmRmIiwic2lkIjoiNjJiYTg5MmYtMTNhZi00NjY0LTg5MDItZWFjYzg5MjJkMGE2In0.XfPb0ZB5q3VwWjEEvTR0iVXWAN7D9j9BgWUBVuISIxY",
  "access_expires_at": "2026-10-30T16:27:50.120202999Z",
  "refresh_token": "4z_7wzxI0LWaviAk18kAeKV4UCczpDi2OQMUMWzmgZk",
  "refresh_expires_at": "2026-10-31T04:12:50.119618749Z",
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
  "command_id": "89ba980a-a615-4e69-85f5-06ab999f1df8",
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
  "changed_by": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-30T16:12:50.688135Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "5951b25c-84ac-4a43-ade7-ad7c7dadad2a",
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
  "correlation_id": "ea28fed4-e33d-4889-a1f2-f0504e219d43",
  "current_version": 1
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "5bcc91da-35e5-4ccc-9d13-c25d960bb03e",
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
  "correlation_id": "bdecd044-c509-4fee-85a7-6d78878f6ecd"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636743320",
  "device_ref": "sandbox-9304"
}
```

```json
{
  "challenge_id": "0bcd8125-39ff-4e4d-b2ff-7907b56234ec",
  "expires_at": "2026-10-30T16:17:51.578981276Z",
  "resend_available_at": "2026-10-30T16:12:52.578981276Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636743320` → **200**

```json
{
  "phone": "+380636743320",
  "audience": "CLIENT",
  "code": "077244",
  "sent_at": "2026-10-30T16:12:51.582002141Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0bcd8125-39ff-4e4d-b2ff-7907b56234ec",
  "code": "077244",
  "device_ref": "sandbox-9304"
}
```

```json
{
  "session_id": "a1e354c5-966f-4d9f-9ea1-248c8bc7a81a",
  "subject": {
    "type": "CLIENT",
    "id": "c0966ab4-8e77-49d2-b445-c4ada4a4c4bc"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMDk2NmFiNC04ZTc3LTQ5ZDItYjQ0NS1jNGFkYTRhNGM0YmMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc3NjcxLCJpYXQiOjE3OTMzNzY3NzEsImp0aSI6IjgxMWY4Y2FjLTZmYWYtNGVjNi04NzM2LTllNDJiMTNmNTJkNiIsInNpZCI6ImExZTM1NGM1LTk2NmYtNGQ5Zi05ZWExLTI0OGM4YmM3YTgxYSJ9.Re-bnFnR_ToUKa0qQEnVRTdOoIF9oFfyNQ8RcBN2QQc",
  "access_expires_at": "2026-10-30T16:27:51.872749589Z",
  "refresh_token": "KI79KtX0NZDBchtwSJGVCVvPMYtLuXb_ZCq8RhMONd8",
  "refresh_expires_at": "2026-11-29T16:12:51.871758121Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d0711bcd-fb18-41f8-a96e-0903afe8b04c",
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
  "id": "9ae5c832-426c-44a9-a8b0-9b5b5937da16",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T16:17:52.144052Z",
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
  "command_id": "f50b2707-1f4c-41d6-8117-d945ffe0bf25",
  "quote_id": "9ae5c832-426c-44a9-a8b0-9b5b5937da16",
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
  "correlation_id": "6cc0ea51-55ea-436f-90d2-a4d06d4b8c8c"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "6bd6f772-4a32-4e58-b5fe-6026b146ff6e",
  "quote_id": "9ae5c832-426c-44a9-a8b0-9b5b5937da16",
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
  "id": "fec3bb65-b798-49c7-9449-503f58121e51",
  "short_number": 20,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c0966ab4-8e77-49d2-b445-c4ada4a4c4bc",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T16:12:52.702007Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/fec3bb65-b798-49c7-9449-503f58121e51/cancel` → **200**

```json
{
  "command_id": "f6ea7005-4259-4135-b937-6da51d95aa28",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "fec3bb65-b798-49c7-9449-503f58121e51",
  "short_number": 20,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "c0966ab4-8e77-49d2-b445-c4ada4a4c4bc",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T16:12:52.702007Z",
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
  "pickup_eta": null
}
```

## The incident is over: card payments are back on

`POST /api/admin/v1/feature-flags/card-payments/change` → **200**

```json
{
  "command_id": "d119fe08-f994-426e-bdc9-be4c2404b62b",
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
  "changed_by": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-30T16:12:53.326019Z"
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
      "changed_by": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-30T16:12:53.326019Z"
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
  "device_ref": "sandbox-28248"
}
```

```json
{
  "challenge_id": "577cc1e3-9e1a-48a8-b9ac-74eb9541ccf5",
  "expires_at": "2026-10-30T16:17:54.156576538Z",
  "resend_available_at": "2026-10-30T16:12:55.156576538Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "337353",
  "sent_at": "2026-10-30T16:12:54.158954529Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "577cc1e3-9e1a-48a8-b9ac-74eb9541ccf5",
  "code": "337353",
  "device_ref": "sandbox-28248"
}
```

```json
{
  "session_id": "7ef2f11c-97d7-4a22-a74e-dec3ceb030b6",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NzY3NCwiaWF0IjoxNzkzMzc2Nzc0LCJqdGkiOiJiZTg0NjRlNy1iYWMwLTRiNWItYmVlYS03YzYzNjQyMzc5M2YiLCJzaWQiOiI3ZWYyZjExYy05N2Q3LTRhMjItYTc0ZS1kZWMzY2ViMDMwYjYifQ.JPGp_LAMpcesWNkkr6THsk6rzcGjf_FLjZfKiuMFsIc",
  "access_expires_at": "2026-10-30T16:27:54.45318414Z",
  "refresh_token": "JI4d5P35VlNxkcIDtQnLSQg4XbG82_1Y6JcxvWoN-pE",
  "refresh_expires_at": "2026-11-29T16:12:54.45241055Z",
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
  "command_id": "a489fac7-08a9-4d6c-9f31-342af2bf2919",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:12:55Z",
    "sequence": 1793376775200
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e299f60e-eaef-4ccb-84f4-806407051ae9",
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
  "last_heartbeat_at": "2026-10-30T16:12:55.036442Z",
  "last_location_at": "2026-10-30T16:12:55.036442Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674320059",
  "device_ref": "sandbox-14485"
}
```

```json
{
  "challenge_id": "ad59afc8-b820-4781-993a-4c9e170d8533",
  "expires_at": "2026-10-30T16:17:55.309182144Z",
  "resend_available_at": "2026-10-30T16:12:56.309182144Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380674320059` → **200**

```json
{
  "phone": "+380674320059",
  "audience": "CLIENT",
  "code": "876204",
  "sent_at": "2026-10-30T16:12:55.311288478Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ad59afc8-b820-4781-993a-4c9e170d8533",
  "code": "876204",
  "device_ref": "sandbox-14485"
}
```

```json
{
  "session_id": "873bf245-ffb6-4de2-8d97-f69f461c93ab",
  "subject": {
    "type": "CLIENT",
    "id": "72e65f37-6d51-4db3-a786-a30a3a61bc7d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MmU2NWYzNy02ZDUxLTRkYjMtYTc4Ni1hMzBhM2E2MWJjN2QiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc3Njc1LCJpYXQiOjE3OTMzNzY3NzUsImp0aSI6ImY0YWI4Y2U3LWE3Y2ItNGYyZi1iNzNiLTMzMDU2MmRlYzcyYSIsInNpZCI6Ijg3M2JmMjQ1LWZmYjYtNGRlMi04ZDk3LWY2OWY0NjFjOTNhYiJ9.WDI8SzztnCW-qDZtIlKqPkHFm-uxfdQpEaHQZy_i2f0",
  "access_expires_at": "2026-10-30T16:27:55.595382375Z",
  "refresh_token": "e4wbNXkdBbz6NdiLMJbWUwOE3xPA4xcGdg3YeWWEq9Q",
  "refresh_expires_at": "2026-11-29T16:12:55.594870741Z",
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
  "command_id": "44649006-985f-421e-9dc9-d5b55fe13360",
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
  "id": "a5441a4d-47ce-4f06-97ec-3863c067c71a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T16:17:56.128092Z",
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
  "command_id": "a2a1b55c-065b-40cd-a1f8-f1245084da22",
  "platform": "ANDROID",
  "token": "sandbox-driver-56f802be-97b8-467b-a818-67c7d8901792"
}
```

```json
{
  "id": "adb88e0e-ba58-43dc-93d8-0d21bdab62b4",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T16:12:56.414412Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "2e958265-dd42-4fdc-a720-15ca22308935",
  "platform": "ANDROID",
  "token": "sandbox-rider-6d073f9a-6a28-464d-a7dd-ab68e17a94fc"
}
```

```json
{
  "id": "e18d4d4d-16b7-4ce8-a104-d2f16fb3b4f6",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T16:12:56.687248Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "e2b4e8e3-c942-4ed0-a513-e2f088db5718",
  "quote_id": "a5441a4d-47ce-4f06-97ec-3863c067c71a",
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
  "id": "393c7733-6aa3-4bc0-be00-c56adba864ec",
  "short_number": 21,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "72e65f37-6d51-4db3-a786-a30a3a61bc7d",
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
  "created_at": "2026-10-30T16:12:56.967666Z",
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
    "id": "de2767dd-8322-477b-b045-6b74ea6f60fe",
    "order_id": "393c7733-6aa3-4bc0-be00-c56adba864ec",
    "expires_at": "2026-10-30T16:13:11.971976Z",
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

`POST /api/driver/v1/offers/de2767dd-8322-477b-b045-6b74ea6f60fe/accept` → **200**

```json
{
  "command_id": "08fa24d3-18e3-404e-86f6-e51f1799a745"
}
```

```json
{
  "id": "6b595c14-2955-4b15-b5f0-d5162dfab367",
  "order_id": "393c7733-6aa3-4bc0-be00-c56adba864ec",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d473e71d-58f1-4d76-96da-385ef1e2a73c",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-30T16:12:56.945Z` → **200**

```json
[
  {
    "at": "2026-10-30T16:12:57.401687033Z",
    "token_suffix": "901792",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "event_id": "f7c8eadf-693a-4f45-9201-68944caa33c3",
      "event_type": "OfferMade",
      "type": "driver.offer",
      "order_id": "393c7733-6aa3-4bc0-be00-c56adba864ec",
      "order_version": "2"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380674320059&after=2026-10-30T16:12:56.945Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380674320059&after=2026-10-30T16:12:56.945Z` → **200**

```json
[
  {
    "at": "2026-10-30T16:12:58.409343334Z",
    "token_suffix": "7a94fc",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "event_id": "423ea43c-97bc-4bd4-a6a3-f4002e24f0ca",
      "event_type": "AssignmentCommitted",
      "type": "rider.driver-assigned",
      "order_id": "393c7733-6aa3-4bc0-be00-c56adba864ec",
      "order_version": "3"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/393c7733-6aa3-4bc0-be00-c56adba864ec/messages` → **201**

```json
{
  "command_id": "567aae9a-3adb-46be-a3b5-3d6c7c25239b",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "234da4fe-a0c2-4807-b0bd-ef6b966cd739",
  "order_id": "393c7733-6aa3-4bc0-be00-c56adba864ec",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-30T16:12:58.912666422Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d473e71d-58f1-4d76-96da-385ef1e2a73c",
  "order_id": "393c7733-6aa3-4bc0-be00-c56adba864ec",
  "assignment_id": "6b595c14-2955-4b15-b5f0-d5162dfab367",
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

`POST /api/driver/v1/trips/d473e71d-58f1-4d76-96da-385ef1e2a73c/messages` → **201**

```json
{
  "command_id": "456cfb67-e53c-4690-b768-649ece753d91",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "ccd93aa4-98c0-4f05-93ee-6e9f2c3723c3",
  "order_id": "393c7733-6aa3-4bc0-be00-c56adba864ec",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-30T16:12:59.438971877Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/393c7733-6aa3-4bc0-be00-c56adba864ec/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/d473e71d-58f1-4d76-96da-385ef1e2a73c/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380674320059"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/e299f60e-eaef-4ccb-84f4-806407051ae9/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:13:00Z",
    "sequence": 1793376780259
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e299f60e-eaef-4ccb-84f4-806407051ae9",
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
  "last_heartbeat_at": "2026-10-30T16:13:00.277003Z",
  "last_location_at": "2026-10-30T16:13:00.277003Z",
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
  "id": "d473e71d-58f1-4d76-96da-385ef1e2a73c",
  "order_id": "393c7733-6aa3-4bc0-be00-c56adba864ec",
  "assignment_id": "6b595c14-2955-4b15-b5f0-d5162dfab367",
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

`POST /api/driver/v1/trips/d473e71d-58f1-4d76-96da-385ef1e2a73c/arrive` → **200**

```json
{
  "command_id": "dcfcd246-f33d-4b92-aa05-76a5ef1046fb",
  "expected_version": 0
}
```

```json
{
  "id": "d473e71d-58f1-4d76-96da-385ef1e2a73c",
  "order_id": "393c7733-6aa3-4bc0-be00-c56adba864ec",
  "assignment_id": "6b595c14-2955-4b15-b5f0-d5162dfab367",
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
  "arrived_at": "2026-10-30T16:13:00.820726Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/d473e71d-58f1-4d76-96da-385ef1e2a73c/start` → **200**

```json
{
  "command_id": "75457495-5280-4afa-bbd0-c97f728cf323",
  "expected_version": 1
}
```

```json
{
  "id": "d473e71d-58f1-4d76-96da-385ef1e2a73c",
  "order_id": "393c7733-6aa3-4bc0-be00-c56adba864ec",
  "assignment_id": "6b595c14-2955-4b15-b5f0-d5162dfab367",
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
  "arrived_at": "2026-10-30T16:13:00.820726Z",
  "started_at": "2026-10-30T16:13:01.096756Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

(the car drives 48 s to the next point)

`POST /api/driver/v1/work-sessions/e299f60e-eaef-4ccb-84f4-806407051ae9/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:13:49Z",
    "sequence": 1793376829383
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e299f60e-eaef-4ccb-84f4-806407051ae9",
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
  "last_heartbeat_at": "2026-10-30T16:13:49.40055Z",
  "last_location_at": "2026-10-30T16:13:49.40055Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/d473e71d-58f1-4d76-96da-385ef1e2a73c/complete` → **200**

```json
{
  "command_id": "c9c6222b-e959-4fa6-8c3d-09615b95e530",
  "expected_version": 2,
  "reported_at": "2026-10-30T16:13:49Z",
  "cash_received": true
}
```

```json
{
  "id": "d473e71d-58f1-4d76-96da-385ef1e2a73c",
  "order_id": "393c7733-6aa3-4bc0-be00-c56adba864ec",
  "assignment_id": "6b595c14-2955-4b15-b5f0-d5162dfab367",
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
  "arrived_at": "2026-10-30T16:13:00.820726Z",
  "started_at": "2026-10-30T16:13:01.096756Z",
  "completed_at": "2026-10-30T16:13:49.679917Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/393c7733-6aa3-4bc0-be00-c56adba864ec` → **200**

```json
{
  "id": "393c7733-6aa3-4bc0-be00-c56adba864ec",
  "short_number": 21,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "72e65f37-6d51-4db3-a786-a30a3a61bc7d",
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
    "id": "6b595c14-2955-4b15-b5f0-d5162dfab367",
    "order_id": "393c7733-6aa3-4bc0-be00-c56adba864ec",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "d473e71d-58f1-4d76-96da-385ef1e2a73c",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T16:12:56.967666Z",
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
      "id": "393c7733-6aa3-4bc0-be00-c56adba864ec",
      "short_number": 21,
      "status": "FULFILLED",
      "created_at": "2026-10-30T16:12:56.967666Z",
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
      "id": "d473e71d-58f1-4d76-96da-385ef1e2a73c",
      "order_id": "393c7733-6aa3-4bc0-be00-c56adba864ec",
      "order_short_number": 21,
      "created_at": "2026-10-30T16:12:57.556607Z",
      "pickup_label": "Майдан Незалежності",
      "dropoff_label": "Залізничний вокзал",
      "final_price_minor": 10517,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "COMPLETED"
    },
    {
      "id": "11c1421d-8785-4feb-83af-dca315dd9d91",
      "order_id": "ba5c4016-7417-4943-94e7-a93b8f394c45",
      "order_short_number": 16,
      "created_at": "2026-10-30T16:12:37.986564Z",
      "pickup_label": "Майдан",
      "dropoff_label": "Вокзал",
      "final_price_minor": null,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "ABORTED"
    },
    {
      "id": "f511fe0e-3aac-4aa7-a192-507d6ff5cc3b",
      "order_id": "c2655250-d1c9-4f63-88bb-90cefc5bba4a",
      "order_short_number": 10,
      "created_at": "2026-10-30T16:09:42.478548Z",
      "pickup_label": "Майдан",
      "dropoff_label": "Вокзал",
      "final_price_minor": 10517,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "COMPLETED"
    },
    {
      "id": "7036579c-31e1-4e18-a139-a9997adf2511",
      "order_id": "0e1045e5-ff7f-4889-9f5b-590e11ec1217",
      "order_short_number": 5,
      "created_at": "2026-10-30T16:08:07.007191Z",
      "pickup_label": "Майдан",
      "dropoff_label": "Вокзал",
      "final_price_minor": 10517,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "COMPLETED"
    },
    {
      "id": "d77864fc-eff6-4032-84f2-8c4753f61e76",
      "order_id": "e04877ee-7acc-46eb-9f2a-b09b1c629763",
      "order_short_number": 3,
      "created_at": "2026-10-30T16:04:20.225893Z",
      "pickup_label": "Майдан",
      "dropoff_label": "Вокзал",
      "final_price_minor": 10517,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "COMPLETED"
    },
    {
      "id": "89b67910-3940-433d-83f9-a51210845793",
      "order_id": "64969b68-d442-4b56-a9a6-4440b4d21f11",
      "order_short_number": 2,
      "created_at": "2026-10-30T16:04:10.962479Z",
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

`GET /api/rider/v1/orders/393c7733-6aa3-4bc0-be00-c56adba864ec/tip` → **200**

```json
{
  "order_id": "393c7733-6aa3-4bc0-be00-c56adba864ec",
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
  "available_until": "2026-10-31T16:13:49.679917Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/393c7733-6aa3-4bc0-be00-c56adba864ec/tip` → **201**

```json
{
  "command_id": "cc901d73-93ef-413c-abe9-9dc68d2ad02c",
  "amount_minor": 1100
}
```

```json
{
  "id": "9eb477c9-a234-459e-ac27-79d9579657db",
  "order_id": "393c7733-6aa3-4bc0-be00-c56adba864ec",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-30T16:13:54.644171Z"
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
  "session_id": "82fa9a5d-79b9-44bb-a484-140394606785",
  "subject": {
    "type": "STAFF",
    "id": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NTM4N2IzNC1lN2M5LTRhZmYtOTNjMS0wZGQzZjJhY2QwOGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzc3MzUsImlhdCI6MTc5MzM3NjgzNSwianRpIjoiZjNiMTRjMjktYTVhYi00NDg5LThjNjgtMjEzYzkwMmI5OWYyIiwic2lkIjoiODJmYTlhNWQtNzliOS00NGJiLWE0ODQtMTQwMzk0NjA2Nzg1In0.XhbYWWUgZYgXSlddFPXUWE4ztjqQVcicxtUz6K04JR0",
  "access_expires_at": "2026-10-30T16:28:55.222057086Z",
  "refresh_token": "i4mdwk70pridL4x_b7Uwb8gq5jA6y3ADGhEc03GpVjc",
  "refresh_expires_at": "2026-10-31T04:13:55.22145169Z",
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
        "created": 20,
        "fulfilled": 8,
        "cancelled": 12,
        "unfulfilled": 0,
        "open": 0,
        "by_channel": {
          "PHONE": 1,
          "APP": 19
        },
        "by_payment": {
          "CASH": 18,
          "CARD": 2
        },
        "cancelled_by": {
          "DRIVER": 1,
          "STAFF": 8,
          "RIDER": 3
        }
      }
    }
  ],
  "total": {
    "created": 20,
    "fulfilled": 8,
    "cancelled": 12,
    "unfulfilled": 0,
    "open": 0,
    "by_channel": {
      "PHONE": 1,
      "APP": 19
    },
    "by_payment": {
      "CASH": 18,
      "CARD": 2
    },
    "cancelled_by": {
      "DRIVER": 1,
      "STAFF": 8,
      "RIDER": 3
    }
  },
  "cancellation_reasons": [
    {
      "cancelled_by": "STAFF",
      "code": "NO_CARS",
      "count": 8
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
  "generated_at": "2026-10-30T16:13:55.499811827Z"
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
  "generated_at": "2026-10-30T16:13:55.770956557Z"
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
  "session_id": "0c64a8c2-3ce3-4cf8-b819-07fd76a791ab",
  "subject": {
    "type": "STAFF",
    "id": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NTM4N2IzNC1lN2M5LTRhZmYtOTNjMS0wZGQzZjJhY2QwOGYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzc3MzYsImlhdCI6MTc5MzM3NjgzNiwianRpIjoiMDI1ZDk5YjktOTY2MC00YTA2LTg0MTYtMjA0YTg0OGMwMTZkIiwic2lkIjoiMGM2NGE4YzItM2NlMy00Y2Y4LWI4MTktMDdmZDc2YTc5MWFiIn0.HHk3KechujupQw78rKOFSXenK5nWYUr-FadaOYVIayk",
  "access_expires_at": "2026-10-30T16:28:56.341130132Z",
  "refresh_token": "lTzbgQ01OSkMN_xG8Qmws5VZ8AEI2HJKncQuxSRHfIU",
  "refresh_expires_at": "2026-10-31T04:13:56.340565433Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/393c7733-6aa3-4bc0-be00-c56adba864ec/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T16:12:56.968338Z",
      "actor": {
        "type": "CLIENT",
        "id": "72e65f37-6d51-4db3-a786-a30a3a61bc7d",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "393c7733-6aa3-4bc0-be00-c56adba864ec",
        "quote_id": "a5441a4d-47ce-4f06-97ec-3863c067c71a",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "92d372e1-0d4a-46a7-a720-1bb37be02842"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T16:12:56.971024Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "393c7733-6aa3-4bc0-be00-c56adba864ec",
        "attempt_id": "d40d773c-24bb-4798-9408-155c9deafafb",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "92d372e1-0d4a-46a7-a720-1bb37be02842"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T16:12:56.994499Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "de2767dd-8322-477b-b045-6b74ea6f60fe",
        "order_id": "393c7733-6aa3-4bc0-be00-c56adba864ec",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "92d372e1-0d4a-46a7-a720-1bb37be02842"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T16:12:57.557974Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "de2767dd-8322-477b-b045-6b74ea6f60fe",
        "order_id": "393c7733-6aa3-4bc0-be00-c56adba864ec",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "6b595c14-2955-4b15-b5f0-d5162dfab367"
      },
      "correlation_id": "a5f53612-4663-41c9-9665-7a0c273054ed"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-30T16:13:56.879477756Z",
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
      "last_location_at": "2026-10-30T16:13:49.40055Z",
      "last_heartbeat_at": "2026-10-30T16:13:49.40055Z",
      "order_id": null
    }
  ]
}
```

Done: order 393c7733-6aa3-4bc0-be00-c56adba864ec.

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
  "session_id": "2c804b2b-c398-4cdb-a7f3-286e7750d9bf",
  "subject": {
    "type": "STAFF",
    "id": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NTM4N2IzNC1lN2M5LTRhZmYtOTNjMS0wZGQzZjJhY2QwOGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzc3MzcsImlhdCI6MTc5MzM3NjgzNywianRpIjoiYjNlOTZhMTgtMjdkNy00MDk4LWE0NWEtNGI4NGUzNGY2YjBmIiwic2lkIjoiMmM4MDRiMmItYzM5OC00Y2RiLWE3ZjMtMjg2ZTc3NTBkOWJmIn0.AjrHvPSEjPIT63F983RX6x3R6P3kRV1TS_uyxVH9nuc",
  "access_expires_at": "2026-10-30T16:28:57.463603273Z",
  "refresh_token": "lvNVEY8kngDuXn70X7REcauemq26dRK_EcZDM_KUC6o",
  "refresh_expires_at": "2026-10-31T04:13:57.46304684Z",
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
  "command_id": "b547e121-1938-409e-93f4-3af1c4e22889",
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
  "timestamp": "2026-10-30T16:13:58.000+0000",
  "channel": {
    "id": "1730052000.2499731582",
    "linkedid": "1730052000.2499731582",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380677688476"
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
  "timestamp": "2026-10-30T16:13:58.000+0000",
  "channel": {
    "id": "1730052000.2499731582",
    "linkedid": "1730052000.2499731582",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380677688476"
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
  "session_id": "470dcd36-9b75-49da-bddc-51806bd19090",
  "subject": {
    "type": "STAFF",
    "id": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NTM4N2IzNC1lN2M5LTRhZmYtOTNjMS0wZGQzZjJhY2QwOGYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzc3MzgsImlhdCI6MTc5MzM3NjgzOCwianRpIjoiNzUwYzUwZGMtOTdhNi00NGU2LWIwNjAtMWI0ZGM1ZWIzNjc1Iiwic2lkIjoiNDcwZGNkMzYtOWI3NS00OWRhLWJkZGMtNTE4MDZiZDE5MDkwIn0.kCXeRiT89BZd37jiSp-9OmhKPlh9qswH3dVUNGbfqpE",
  "access_expires_at": "2026-10-30T16:28:58.604251732Z",
  "refresh_token": "HkzxVvQzahyC20_KyZJp2PuEjzItCi8aCJc8XtR09uE",
  "refresh_expires_at": "2026-10-31T04:13:58.603733128Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "f18a8b90-98b5-48ed-b284-fc485bb5e600",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380677688476",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T16:13:58Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/f18a8b90-98b5-48ed-b284-fc485bb5e600/answer` → **200**

```json
{
  "command_id": "63cb9bf4-ec9f-43e0-b7cf-00c2f073412c"
}
```

```json
{
  "id": "f18a8b90-98b5-48ed-b284-fc485bb5e600",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380677688476",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f",
  "order_ids": [],
  "started_at": "2026-10-30T16:13:58Z",
  "answered_at": "2026-10-30T16:13:59.156287Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.2499731582",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "1a02b9b5-ee00-4bb0-a9f3-0b25eb54944c",
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
  "id": "e6f4b299-b8fd-401f-a179-c4ffb986236f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T16:18:59.449091Z",
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
  "command_id": "8d70f39c-d57f-4f7f-8945-0682af4a2c74",
  "quote_id": "e6f4b299-b8fd-401f-a179-c4ffb986236f",
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
    "phone": "+380677688476"
  },
  "call_id": "f18a8b90-98b5-48ed-b284-fc485bb5e600"
}
```

```json
{
  "id": "f14b23e2-cba0-4b41-8d02-ce3c4d6a373e",
  "short_number": 22,
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
  "created_at": "2026-10-30T16:13:59.733534Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677688476"
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
    "id": "1730052000.2499731582",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "f18a8b90-98b5-48ed-b284-fc485bb5e600",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677688476",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f",
      "order_ids": [
        "f14b23e2-cba0-4b41-8d02-ce3c4d6a373e"
      ],
      "started_at": "2026-10-30T16:13:58Z",
      "answered_at": "2026-10-30T16:13:59.156287Z",
      "ended_at": "2026-10-30T16:14:00.031818Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "3dba446a-80d9-4af5-9478-7c71e68aae9e",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679024203",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f",
      "order_ids": [],
      "started_at": "2026-10-30T16:08:00.620482Z",
      "answered_at": "2026-10-30T16:08:00.929869Z",
      "ended_at": "2026-10-30T16:08:01.22799Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T16:08:03.06493Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/f14b23e2-cba0-4b41-8d02-ce3c4d6a373e` → **200**

```json
{
  "id": "f14b23e2-cba0-4b41-8d02-ce3c4d6a373e",
  "short_number": 22,
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
  "created_at": "2026-10-30T16:13:59.733534Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677688476"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/f14b23e2-cba0-4b41-8d02-ce3c4d6a373e` → **200**

```json
{
  "id": "f14b23e2-cba0-4b41-8d02-ce3c4d6a373e",
  "short_number": 22,
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
  "created_at": "2026-10-30T16:13:59.733534Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677688476"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/f14b23e2-cba0-4b41-8d02-ce3c4d6a373e/cancel` → **200**

```json
{
  "command_id": "1af19384-3c38-46c2-aaac-17392644770f",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "f14b23e2-cba0-4b41-8d02-ce3c4d6a373e",
  "short_number": 22,
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
  "created_at": "2026-10-30T16:13:59.733534Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677688476"
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

Done: call f18a8b90-98b5-48ed-b284-fc485bb5e600 with order f14b23e2-cba0-4b41-8d02-ce3c4d6a373e.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-26326"
}
```

```json
{
  "challenge_id": "b70ed34e-2e02-4e22-9b4b-bbfdffbf652b",
  "expires_at": "2026-10-30T16:19:01.190005569Z",
  "resend_available_at": "2026-10-30T16:14:02.190005569Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "396218",
  "sent_at": "2026-10-30T16:14:01.19239794Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b70ed34e-2e02-4e22-9b4b-bbfdffbf652b",
  "code": "396218",
  "device_ref": "sandbox-26326"
}
```

```json
{
  "session_id": "a7b2f383-93a0-4cca-92b9-dc0489891a07",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3Nzc0MSwiaWF0IjoxNzkzMzc2ODQxLCJqdGkiOiI3M2RlNTU1Ni1kM2VhLTQ1MTctYTcwYS1mZjgwZmJjYjMzZTUiLCJzaWQiOiJhN2IyZjM4My05M2EwLTRjY2EtOTJiOS1kYzA0ODk4OTFhMDcifQ.R8amW1zxGTZa0Ehe4JD5vvcsC_jKpGfBoeyJAZeUPPM",
  "access_expires_at": "2026-10-30T16:29:01.484415111Z",
  "refresh_token": "t4qU7R85tfLOOgesBLc-xh2nDjvU45O27-8AIiOpiwI",
  "refresh_expires_at": "2026-11-29T16:14:01.483329388Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e299f60e-eaef-4ccb-84f4-806407051ae9",
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
  "last_heartbeat_at": "2026-10-30T16:13:49.40055Z",
  "last_location_at": "2026-10-30T16:13:49.40055Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e299f60e-eaef-4ccb-84f4-806407051ae9/handover` → **200**

```json
{
  "command_id": "3046586b-0c10-4195-8c84-3540d62ad628",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e299f60e-eaef-4ccb-84f4-806407051ae9",
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
  "last_heartbeat_at": "2026-10-30T16:13:49.40055Z",
  "last_location_at": "2026-10-30T16:13:49.40055Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

(the car drives 86 s to the next point)

`POST /api/driver/v1/work-sessions/e299f60e-eaef-4ccb-84f4-806407051ae9/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:15:28Z",
    "sequence": 1793376928321
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e299f60e-eaef-4ccb-84f4-806407051ae9",
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
  "last_heartbeat_at": "2026-10-30T16:15:28.338345Z",
  "last_location_at": "2026-10-30T16:15:28.338345Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380668305129",
  "device_ref": "sandbox-13307"
}
```

```json
{
  "challenge_id": "33c9d0f3-26ef-4668-9d0b-41145b38d898",
  "expires_at": "2026-10-30T16:20:28.6040011Z",
  "resend_available_at": "2026-10-30T16:15:29.6040011Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380668305129` → **200**

```json
{
  "phone": "+380668305129",
  "audience": "CLIENT",
  "code": "908348",
  "sent_at": "2026-10-30T16:15:28.606300455Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "33c9d0f3-26ef-4668-9d0b-41145b38d898",
  "code": "908348",
  "device_ref": "sandbox-13307"
}
```

```json
{
  "session_id": "f88f8719-fd0f-4391-a970-d3d30bb1bbcf",
  "subject": {
    "type": "CLIENT",
    "id": "df85572e-7035-4203-bde7-f0eb0c5675fa"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkZjg1NTcyZS03MDM1LTQyMDMtYmRlNy1mMGViMGM1Njc1ZmEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc3ODI4LCJpYXQiOjE3OTMzNzY5MjgsImp0aSI6IjU2ZWViNjliLTRkZTMtNDY2OS1iMmM2LTcyZGM2NjUzZDg2MCIsInNpZCI6ImY4OGY4NzE5LWZkMGYtNDM5MS1hOTcwLWQzZDMwYmIxYmJjZiJ9.0dg1eVZNcCVcIEd7bA5W7yXM9VTt5cx9lvHGmtYEDCY",
  "access_expires_at": "2026-10-30T16:30:28.890578285Z",
  "refresh_token": "Bie7-UonecGY_wtdEB-cdZUhTY3haXGvKx-2xAGi30w",
  "refresh_expires_at": "2026-11-29T16:15:28.889880143Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8a465c5b-2033-44a8-82cf-c4ae9eb8f52f",
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
  "id": "6c3885e3-5ef2-4ecc-970c-306d38a28131",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T16:20:29.159736Z",
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
  "command_id": "e86b4f5c-487c-49cb-9ab6-51bcaf220a92",
  "quote_id": "6c3885e3-5ef2-4ecc-970c-306d38a28131",
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
  "id": "dd140580-02a4-4344-b03e-6dd712142278",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "df85572e-7035-4203-bde7-f0eb0c5675fa",
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
  "created_at": "2026-10-30T16:15:29.438044Z",
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
    "id": "a6334eff-f7a0-46fc-a7f3-0bcb2b78e0ae",
    "order_id": "dd140580-02a4-4344-b03e-6dd712142278",
    "expires_at": "2026-10-30T16:15:44.440804Z",
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

`POST /api/driver/v1/offers/a6334eff-f7a0-46fc-a7f3-0bcb2b78e0ae/accept` → **200**

```json
{
  "command_id": "9b66cf73-7f46-4305-a0f9-5c4254977bd4"
}
```

```json
{
  "id": "ecc2d15e-f14c-4aa1-84e6-fdbe93d27888",
  "order_id": "dd140580-02a4-4344-b03e-6dd712142278",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a3bfe24e-2768-46c8-b8b0-c6cb5fa6edd3",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a3bfe24e-2768-46c8-b8b0-c6cb5fa6edd3",
  "order_id": "dd140580-02a4-4344-b03e-6dd712142278",
  "assignment_id": "ecc2d15e-f14c-4aa1-84e6-fdbe93d27888",
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

`POST /api/driver/v1/work-sessions/e299f60e-eaef-4ccb-84f4-806407051ae9/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:15:30Z",
    "sequence": 1793376930542
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e299f60e-eaef-4ccb-84f4-806407051ae9",
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
  "last_heartbeat_at": "2026-10-30T16:15:30.558825Z",
  "last_location_at": "2026-10-30T16:15:30.558825Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/a3bfe24e-2768-46c8-b8b0-c6cb5fa6edd3/arrive` → **200**

```json
{
  "command_id": "c18de031-bd12-4c62-b874-c224f24ec388",
  "expected_version": 0
}
```

```json
{
  "id": "a3bfe24e-2768-46c8-b8b0-c6cb5fa6edd3",
  "order_id": "dd140580-02a4-4344-b03e-6dd712142278",
  "assignment_id": "ecc2d15e-f14c-4aa1-84e6-fdbe93d27888",
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
  "arrived_at": "2026-10-30T16:15:30.839021Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/a3bfe24e-2768-46c8-b8b0-c6cb5fa6edd3/start` → **200**

```json
{
  "command_id": "94ad6a18-0498-4baa-81b0-8a897858b74a",
  "expected_version": 1
}
```

```json
{
  "id": "a3bfe24e-2768-46c8-b8b0-c6cb5fa6edd3",
  "order_id": "dd140580-02a4-4344-b03e-6dd712142278",
  "assignment_id": "ecc2d15e-f14c-4aa1-84e6-fdbe93d27888",
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
  "arrived_at": "2026-10-30T16:15:30.839021Z",
  "started_at": "2026-10-30T16:15:31.11865Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

(the car drives 59 s to the next point)

`POST /api/driver/v1/work-sessions/e299f60e-eaef-4ccb-84f4-806407051ae9/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:16:30Z",
    "sequence": 1793376990408
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e299f60e-eaef-4ccb-84f4-806407051ae9",
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
  "last_heartbeat_at": "2026-10-30T16:16:30.424516Z",
  "last_location_at": "2026-10-30T16:16:30.424516Z",
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
  "device_ref": "sandbox-20604"
}
```

```json
{
  "challenge_id": "cbb15ef0-8f54-4cab-8837-1fdf6f7cbfe9",
  "expires_at": "2026-10-30T16:21:30.693793785Z",
  "resend_available_at": "2026-10-30T16:16:31.693793785Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "978538",
  "sent_at": "2026-10-30T16:16:30.696098269Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cbb15ef0-8f54-4cab-8837-1fdf6f7cbfe9",
  "code": "978538",
  "device_ref": "sandbox-20604"
}
```

```json
{
  "session_id": "7ebfe7a0-535e-402b-8fe5-a55e13b52abc",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3Nzg5MCwiaWF0IjoxNzkzMzc2OTkwLCJqdGkiOiJmMWQ3OTY3YS00Mjg0LTRjMzYtOThmYy0yMGM3YzQ5NjJkZTkiLCJzaWQiOiI3ZWJmZTdhMC01MzVlLTQwMmItOGZlNS1hNTVlMTNiNTJhYmMifQ.oVMWKHeC0yfQtWq9b9CN_osmUtkelbp-X_Rk5Hj-Ng0",
  "access_expires_at": "2026-10-30T16:31:30.987478804Z",
  "refresh_token": "3lderzilo331VKkGRzv4uf-NEIZeN-NRYiBQOsNlzxk",
  "refresh_expires_at": "2026-11-29T16:16:30.986939988Z",
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
  "command_id": "9b631bae-a1f8-4837-9336-fa3b59c23e65",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:16:31Z",
    "sequence": 1793376991545
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "f28f13ca-0e99-4ef5-9d51-536137b2ee19",
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
  "last_heartbeat_at": "2026-10-30T16:16:31.568684Z",
  "last_location_at": "2026-10-30T16:16:31.568684Z",
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
  "session_id": "b9551f6a-7118-44a8-9ba5-b44b07954f63",
  "subject": {
    "type": "STAFF",
    "id": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NTM4N2IzNC1lN2M5LTRhZmYtOTNjMS0wZGQzZjJhY2QwOGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzc4OTIsImlhdCI6MTc5MzM3Njk5MiwianRpIjoiM2U4NjEwMDEtNTk2MS00YmU3LTlkYWQtMzdjNzYzZDk4MGM0Iiwic2lkIjoiYjk1NTFmNmEtNzExOC00NGE4LTliYTUtYjQ0YjA3OTU0ZjYzIn0.MmdspTWhGhgTUYRtwaLlIZrZ7dtbioEOnDqE_AkhNFA",
  "access_expires_at": "2026-10-30T16:31:32.166513588Z",
  "refresh_token": "5VZ9zRCxy7N93oRa8LNCnH9JhSWyOD18Qs-VdMF9SV4",
  "refresh_expires_at": "2026-10-31T04:16:32.165769186Z",
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
  "session_id": "1a524c7e-eef5-4926-8994-f7b0c0db86fe",
  "subject": {
    "type": "STAFF",
    "id": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NTM4N2IzNC1lN2M5LTRhZmYtOTNjMS0wZGQzZjJhY2QwOGYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzc4OTIsImlhdCI6MTc5MzM3Njk5MiwianRpIjoiMzAzYmFjM2YtNWRiMC00YWRhLWE5ZWMtYmZmNzIzMzE3ZWQ1Iiwic2lkIjoiMWE1MjRjN2UtZWVmNS00OTI2LTg5OTQtZjdiMGMwZGI4NmZlIn0.h1gzsDHgPJ5prvBDv2BB8tHArdq_aFx74hu2Xzhr5DQ",
  "access_expires_at": "2026-10-30T16:31:32.732604412Z",
  "refresh_token": "lgqsUr2hhG3AUTnOSWPkZvn9-GW0bvVkLYSvgJUi3L0",
  "refresh_expires_at": "2026-10-31T04:16:32.732084282Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/dd140580-02a4-4344-b03e-6dd712142278` → **200**

```json
{
  "id": "dd140580-02a4-4344-b03e-6dd712142278",
  "short_number": 23,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "df85572e-7035-4203-bde7-f0eb0c5675fa",
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
    "id": "ecc2d15e-f14c-4aa1-84e6-fdbe93d27888",
    "order_id": "dd140580-02a4-4344-b03e-6dd712142278",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "a3bfe24e-2768-46c8-b8b0-c6cb5fa6edd3",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-30T16:15:29.438044Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/dd140580-02a4-4344-b03e-6dd712142278/interrupt` → **200**

```json
{
  "command_id": "578a1f7c-993f-4397-8a8d-631ff8a4d6bc",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "dd140580-02a4-4344-b03e-6dd712142278",
    "short_number": 23,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "df85572e-7035-4203-bde7-f0eb0c5675fa",
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
      "id": "ecc2d15e-f14c-4aa1-84e6-fdbe93d27888",
      "order_id": "dd140580-02a4-4344-b03e-6dd712142278",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "a3bfe24e-2768-46c8-b8b0-c6cb5fa6edd3",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-30T16:15:29.438044Z",
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
    "id": "bb952d70-f03c-4144-98b7-d32d5d8f3ad4",
    "short_number": 24,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "df85572e-7035-4203-bde7-f0eb0c5675fa",
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
    "id": "c31087eb-4a8b-4a9b-83b7-9a682c6f1e5d",
    "order_id": "bb952d70-f03c-4144-98b7-d32d5d8f3ad4",
    "expires_at": "2026-10-30T16:16:48.304997Z",
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

`POST /api/driver/v1/offers/c31087eb-4a8b-4a9b-83b7-9a682c6f1e5d/accept` → **200**

```json
{
  "command_id": "e5cba3bd-8f43-448c-ae71-f328580d017d"
}
```

```json
{
  "id": "ff007faa-0039-42fe-a069-4a2ffd38e2d6",
  "order_id": "bb952d70-f03c-4144-98b7-d32d5d8f3ad4",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b09911be-59fc-46a9-ad38-0b4fa8d20b11",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b09911be-59fc-46a9-ad38-0b4fa8d20b11",
  "order_id": "bb952d70-f03c-4144-98b7-d32d5d8f3ad4",
  "assignment_id": "ff007faa-0039-42fe-a069-4a2ffd38e2d6",
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
  "session_id": "f28f13ca-0e99-4ef5-9d51-536137b2ee19",
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
  "last_heartbeat_at": "2026-10-30T16:16:31.568684Z",
  "last_location_at": "2026-10-30T16:16:31.568684Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/f28f13ca-0e99-4ef5-9d51-536137b2ee19/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:16:34Z",
    "sequence": 1793376994676
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "f28f13ca-0e99-4ef5-9d51-536137b2ee19",
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
  "last_heartbeat_at": "2026-10-30T16:16:34.691985Z",
  "last_location_at": "2026-10-30T16:16:34.691985Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/b09911be-59fc-46a9-ad38-0b4fa8d20b11/arrive` → **200**

```json
{
  "command_id": "090bf173-9218-413e-a86a-e30435929f7d",
  "expected_version": 0
}
```

```json
{
  "id": "b09911be-59fc-46a9-ad38-0b4fa8d20b11",
  "order_id": "bb952d70-f03c-4144-98b7-d32d5d8f3ad4",
  "assignment_id": "ff007faa-0039-42fe-a069-4a2ffd38e2d6",
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
  "arrived_at": "2026-10-30T16:16:34.960604Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/b09911be-59fc-46a9-ad38-0b4fa8d20b11/start` → **200**

```json
{
  "command_id": "b848d910-1943-4a6c-a463-620b89a334ff",
  "expected_version": 1
}
```

```json
{
  "id": "b09911be-59fc-46a9-ad38-0b4fa8d20b11",
  "order_id": "bb952d70-f03c-4144-98b7-d32d5d8f3ad4",
  "assignment_id": "ff007faa-0039-42fe-a069-4a2ffd38e2d6",
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
  "arrived_at": "2026-10-30T16:16:34.960604Z",
  "started_at": "2026-10-30T16:16:35.23862Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/b09911be-59fc-46a9-ad38-0b4fa8d20b11/complete` → **200**

```json
{
  "command_id": "92bfb43d-3d00-4fae-a339-b7bf75769ac9",
  "expected_version": 2,
  "reported_at": "2026-10-30T16:16:35Z"
}
```

```json
{
  "id": "b09911be-59fc-46a9-ad38-0b4fa8d20b11",
  "order_id": "bb952d70-f03c-4144-98b7-d32d5d8f3ad4",
  "assignment_id": "ff007faa-0039-42fe-a069-4a2ffd38e2d6",
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
  "arrived_at": "2026-10-30T16:16:34.960604Z",
  "started_at": "2026-10-30T16:16:35.23862Z",
  "completed_at": "2026-10-30T16:16:35.5244Z",
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
      "id": "bb952d70-f03c-4144-98b7-d32d5d8f3ad4",
      "short_number": 24,
      "status": "FULFILLED",
      "created_at": "2026-10-30T16:16:33.295197Z",
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
      "id": "dd140580-02a4-4344-b03e-6dd712142278",
      "short_number": 23,
      "status": "CANCELLED",
      "created_at": "2026-10-30T16:15:29.438044Z",
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

`GET /api/operator/v1/orders/dd140580-02a4-4344-b03e-6dd712142278/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T16:15:29.438563Z",
      "actor": {
        "type": "CLIENT",
        "id": "df85572e-7035-4203-bde7-f0eb0c5675fa",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "dd140580-02a4-4344-b03e-6dd712142278",
        "quote_id": "6c3885e3-5ef2-4ecc-970c-306d38a28131",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "8cc99a5f-faa1-43ce-8518-5f97bf3ebbd6"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T16:15:29.440275Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "dd140580-02a4-4344-b03e-6dd712142278",
        "attempt_id": "df2c9a61-aeff-4908-9814-cb6fc590087a",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "8cc99a5f-faa1-43ce-8518-5f97bf3ebbd6"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T16:15:29.443313Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "a6334eff-f7a0-46fc-a7f3-0bcb2b78e0ae",
        "order_id": "dd140580-02a4-4344-b03e-6dd712142278",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "8cc99a5f-faa1-43ce-8518-5f97bf3ebbd6"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T16:15:30.001324Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "a6334eff-f7a0-46fc-a7f3-0bcb2b78e0ae",
        "order_id": "dd140580-02a4-4344-b03e-6dd712142278",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "ecc2d15e-f14c-4aa1-84e6-fdbe93d27888"
      },
      "correlation_id": "876df6ec-2f35-40de-8638-721bc25d8644"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/bb952d70-f03c-4144-98b7-d32d5d8f3ad4/tip` → **200**

```json
{
  "order_id": "bb952d70-f03c-4144-98b7-d32d5d8f3ad4",
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
  "available_until": "2026-10-31T16:16:35.5244Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/bb952d70-f03c-4144-98b7-d32d5d8f3ad4/tip` → **409**

```json
{
  "command_id": "f6fa037d-7193-48a7-8284-3044a8214721",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/bb952d70-f03c-4144-98b7-d32d5d8f3ad4/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "809fe619-ab6b-4527-9031-35f0571a8619"
}
```

Done: interrupted dd140580-02a4-4344-b03e-6dd712142278, follow-up bb952d70-f03c-4144-98b7-d32d5d8f3ad4.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e299f60e-eaef-4ccb-84f4-806407051ae9",
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
  "last_heartbeat_at": "2026-10-30T16:16:30.424516Z",
  "last_location_at": "2026-10-30T16:16:30.424516Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e299f60e-eaef-4ccb-84f4-806407051ae9/close` → **200**

```json
{
  "command_id": "6c1973a6-1261-4cfb-8c8c-79ad8a303911",
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
  "session_id": "f28f13ca-0e99-4ef5-9d51-536137b2ee19",
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
  "last_heartbeat_at": "2026-10-30T16:16:34.691985Z",
  "last_location_at": "2026-10-30T16:16:34.691985Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f28f13ca-0e99-4ef5-9d51-536137b2ee19/close` → **200**

```json
{
  "command_id": "a20c6809-6bb8-4732-8cfe-05be86177025",
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
  "session_id": "d3156d80-ccc7-4e1c-9cf9-c91ab3dd5bd8",
  "subject": {
    "type": "STAFF",
    "id": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NTM4N2IzNC1lN2M5LTRhZmYtOTNjMS0wZGQzZjJhY2QwOGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzc5MDEsImlhdCI6MTc5MzM3NzAwMSwianRpIjoiZDI2ZDhmM2MtMjc3MS00M2Q1LWJmNDQtZDhjYzU4NWE2M2NiIiwic2lkIjoiZDMxNTZkODAtY2NjNy00ZTFjLTljZjktYzkxYWIzZGQ1YmQ4In0.2mB9cGnLdvCjQ9Ay_JClE8DDC_HFqqr0Nruf0y5aKdk",
  "access_expires_at": "2026-10-30T16:31:41.565028619Z",
  "refresh_token": "SY8Fy5fohE_R9Ae5j0QVDsbgq1qpH9ZQS0fLYu1zrjI",
  "refresh_expires_at": "2026-10-31T04:16:41.564568016Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "496c1eec-1509-43d1-b6a6-4e2fbdc1cc20",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T16:16:41Z"
}
```

```json
{
  "id": "43a12fa2-6070-4789-8976-151da08fd7e0",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T16:16:41Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/43a12fa2-6070-4789-8976-151da08fd7e0/publish` → **200**

```json
{
  "command_id": "3d543df1-1d06-4942-95fe-cbff9db53548",
  "expected_version": 0
}
```

```json
{
  "id": "43a12fa2-6070-4789-8976-151da08fd7e0",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T16:16:42.127569Z",
  "published_at": "2026-10-30T16:16:42.127569Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "43a12fa2-6070-4789-8976-151da08fd7e0",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-30T16:16:42.127569Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633363399",
  "device_ref": "sandbox-4136"
}
```

```json
{
  "challenge_id": "9acdd3d1-d939-4c61-b1df-0d6107543029",
  "expires_at": "2026-10-30T16:21:42.680663106Z",
  "resend_available_at": "2026-10-30T16:16:43.680663106Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380633363399` → **200**

```json
{
  "phone": "+380633363399",
  "audience": "CLIENT",
  "code": "513776",
  "sent_at": "2026-10-30T16:16:42.683646119Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9acdd3d1-d939-4c61-b1df-0d6107543029",
  "code": "513776",
  "device_ref": "sandbox-4136"
}
```

```json
{
  "session_id": "7d1086ce-dfd0-4077-aead-ea095fa38f6b",
  "subject": {
    "type": "CLIENT",
    "id": "0dff8f56-212a-41df-93fe-f5ec626e9eec"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwZGZmOGY1Ni0yMTJhLTQxZGYtOTNmZS1mNWVjNjI2ZTllZWMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc3OTAyLCJpYXQiOjE3OTMzNzcwMDIsImp0aSI6IjkyYTNkNDNlLWI3OTAtNDJiZC1iOTdmLTNhOTBiMDM2MjA4NCIsInNpZCI6IjdkMTA4NmNlLWRmZDAtNDA3Ny1hZWFkLWVhMDk1ZmEzOGY2YiJ9.lfC1DJyF5W3PcC9aN1VEm-9J4FI4dPFWVxoul4RydAI",
  "access_expires_at": "2026-10-30T16:31:42.976332121Z",
  "refresh_token": "3OUrbdLbe3qQ4nFYn_nYu7fe54Ha-AvcpEDFucvynvc",
  "refresh_expires_at": "2026-11-29T16:16:42.975757894Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "43a12fa2-6070-4789-8976-151da08fd7e0",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-30T16:16:42.127569Z",
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
  "command_id": "33c715f6-5b6a-443b-b1c8-09e5f53ebe3f",
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
  "id": "9aed8034-773f-4b18-89bf-4277288baac5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T16:21:43.526632Z",
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
  "command_id": "0f109008-c06a-4b0b-a727-dd651c467481",
  "quote_id": "9aed8034-773f-4b18-89bf-4277288baac5",
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
  "correlation_id": "15026937-7a44-4e5a-89f0-0526474cdc9d"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "48b46919-546c-4c8b-a04c-51572c9a98ad",
  "version_id": "43a12fa2-6070-4789-8976-151da08fd7e0",
  "language": "uk"
}
```

```json
{
  "version_id": "43a12fa2-6070-4789-8976-151da08fd7e0",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-30T16:16:44.074047Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b350bdf7-5711-4962-8bda-9901ca4043c8",
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
  "id": "e78466aa-9087-4a16-adb2-44aebcd4eb17",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T16:21:44.352325Z",
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
  "command_id": "b6c67d95-a2bc-4903-816a-f3bc8533c3aa",
  "quote_id": "e78466aa-9087-4a16-adb2-44aebcd4eb17",
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
  "id": "debd31ed-75a0-4aa5-9f2e-73052f1f1745",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0dff8f56-212a-41df-93fe-f5ec626e9eec",
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
  "created_at": "2026-10-30T16:16:44.630159Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/debd31ed-75a0-4aa5-9f2e-73052f1f1745` → **200**

```json
{
  "id": "debd31ed-75a0-4aa5-9f2e-73052f1f1745",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0dff8f56-212a-41df-93fe-f5ec626e9eec",
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
  "created_at": "2026-10-30T16:16:44.630159Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/debd31ed-75a0-4aa5-9f2e-73052f1f1745/cancel` → **200**

```json
{
  "command_id": "68167765-be45-4e3a-ad7f-1c286b81e7a0",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "debd31ed-75a0-4aa5-9f2e-73052f1f1745",
  "short_number": 25,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "0dff8f56-212a-41df-93fe-f5ec626e9eec",
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
  "created_at": "2026-10-30T16:16:44.630159Z",
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
  "pickup_eta": null
}
```

## A published version never changes

`POST /api/admin/v1/legal-documents/43a12fa2-6070-4789-8976-151da08fd7e0` → **409**

```json
{
  "command_id": "54effa66-d104-4cef-b065-ea8543709608",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T16:16:45Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/43a12fa2-6070-4789-8976-151da08fd7e0",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "e7d3f0b0-466c-4247-95c4-c7da2b7268e5"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "7a436c2b-922b-4312-9b47-2ae8c0900e57",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T16:16:45Z"
}
```

```json
{
  "id": "101b85f1-f8de-48b8-a750-949b1e20b31c",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T16:16:45Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/101b85f1-f8de-48b8-a750-949b1e20b31c/publish` → **200**

```json
{
  "command_id": "98e09fc3-c8e5-446d-9fbf-06548a34b6d2",
  "expected_version": 0
}
```

```json
{
  "id": "101b85f1-f8de-48b8-a750-949b1e20b31c",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T16:16:46.034297Z",
  "published_at": "2026-10-30T16:16:46.034297Z",
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
  "device_ref": "sandbox-29174"
}
```

```json
{
  "challenge_id": "e86aa13f-775f-4c5c-bb28-79911d3f1134",
  "expires_at": "2026-10-30T16:21:46.308008238Z",
  "resend_available_at": "2026-10-30T16:16:47.308008238Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "544690",
  "sent_at": "2026-10-30T16:16:46.310603531Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e86aa13f-775f-4c5c-bb28-79911d3f1134",
  "code": "544690",
  "device_ref": "sandbox-29174"
}
```

```json
{
  "session_id": "71144ff8-6ddd-4587-af98-5c40b375d575",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NzkwNiwiaWF0IjoxNzkzMzc3MDA2LCJqdGkiOiIxMjFiYTlkZi1hMzg4LTQzZjAtYTdiNy1hYTdkOTg4YjNiOGMiLCJzaWQiOiI3MTE0NGZmOC02ZGRkLTQ1ODctYWY5OC01YzQwYjM3NWQ1NzUifQ.VeREt-EpwGkiJK3_ozygqV0dSG0hHXIYuP6PYoAFh0I",
  "access_expires_at": "2026-10-30T16:31:46.595363076Z",
  "refresh_token": "5zmsA_QqK41FqDmOfMLsPWzw7xxzSRUriNi9Rguh_00",
  "refresh_expires_at": "2026-11-29T16:16:46.594900263Z",
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
  "command_id": "403f387c-43bb-4a91-9c6d-ba75a0eb5ab7",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:17:58Z",
    "sequence": 1793377078140
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "85da6aab-6a5f-45e6-b286-a10f1bc4161a",
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
  "last_heartbeat_at": "2026-10-30T16:17:58.157009Z",
  "last_location_at": "2026-10-30T16:17:58.157009Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670155290",
  "device_ref": "sandbox-24543"
}
```

```json
{
  "challenge_id": "3637029d-c717-4f80-a3e9-b2ee847f64e8",
  "expires_at": "2026-10-30T16:22:58.435600104Z",
  "resend_available_at": "2026-10-30T16:17:59.435600104Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380670155290` → **200**

```json
{
  "phone": "+380670155290",
  "audience": "CLIENT",
  "code": "361023",
  "sent_at": "2026-10-30T16:17:58.43864717Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3637029d-c717-4f80-a3e9-b2ee847f64e8",
  "code": "361023",
  "device_ref": "sandbox-24543"
}
```

```json
{
  "session_id": "c5ee3245-c6a0-4d77-891a-b98c9b13a399",
  "subject": {
    "type": "CLIENT",
    "id": "cc976686-8902-47da-bac4-8a0193c46947"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjYzk3NjY4Ni04OTAyLTQ3ZGEtYmFjNC04YTAxOTNjNDY5NDciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc3OTc4LCJpYXQiOjE3OTMzNzcwNzgsImp0aSI6ImViYzk2N2NhLTZiN2YtNDVkZi1iMWU4LTFlYzgzODBmM2Q0ZSIsInNpZCI6ImM1ZWUzMjQ1LWM2YTAtNGQ3Ny04OTFhLWI5OGM5YjEzYTM5OSJ9.OUHWlWMfCY4Pj_RjsJZtdkH8yav6_TK6rP0nDXk1IZg",
  "access_expires_at": "2026-10-30T16:32:58.725071106Z",
  "refresh_token": "r7GsAai4CaFv__9XQBZBH5rnwOIgnstihIsFF6uBCGQ",
  "refresh_expires_at": "2026-11-29T16:17:58.724615084Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "42da8072-3a03-40ff-a1e8-815de39d42b4",
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
  "id": "2d81c4a3-5a59-4e6b-bf63-914cf6ec1247",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T16:22:58.999879Z",
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
  "command_id": "4ea060c0-a4a0-4c7c-9253-41f65cc2a56d",
  "quote_id": "2d81c4a3-5a59-4e6b-bf63-914cf6ec1247",
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
    "phone": "+380679213927"
  }
}
```

```json
{
  "id": "bc2cccf5-ef0c-4a70-92fe-c6d412690998",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "cc976686-8902-47da-bac4-8a0193c46947",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T16:17:59.281359Z",
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
    "id": "57c1deb6-238c-4fc5-831a-e7dff21a6090",
    "order_id": "bc2cccf5-ef0c-4a70-92fe-c6d412690998",
    "expires_at": "2026-10-30T16:18:14.28426Z",
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

`POST /api/driver/v1/offers/57c1deb6-238c-4fc5-831a-e7dff21a6090/accept` → **200**

```json
{
  "command_id": "1cace96e-2ad3-47e6-8b08-336d75ffa5bb"
}
```

```json
{
  "id": "e7b80a94-3537-4652-b046-9692f9fa3892",
  "order_id": "bc2cccf5-ef0c-4a70-92fe-c6d412690998",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "4e2bf1bd-0f36-49fb-9e68-99461c38f95c",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "4e2bf1bd-0f36-49fb-9e68-99461c38f95c",
  "order_id": "bc2cccf5-ef0c-4a70-92fe-c6d412690998",
  "assignment_id": "e7b80a94-3537-4652-b046-9692f9fa3892",
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
    "phone": "+380679213927"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a16e79ee-b532-4d04-9c49-8b765dcd959e",
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
  "id": "867346f4-58ce-4750-9830-389efc0671dc",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T16:23:00.382832Z",
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
  "command_id": "8a7608c9-f1b4-473d-b514-e30a2c2a3a4f",
  "quote_id": "867346f4-58ce-4750-9830-389efc0671dc",
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
  "id": "e10958ce-db29-4e5a-a8a4-fc5f1339cfe3",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "cc976686-8902-47da-bac4-8a0193c46947",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T16:18:00.6637Z",
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
  "command_id": "1c2449a4-5214-43d8-95f1-bbf5f6266523",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-30T19:18:00Z"
}
```

```json
{
  "id": "268cde00-4a1a-46dd-80d1-186ef7b05585",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T16:23:00.959734Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-30T19:18:00Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "0c657d16-2e43-4cbd-8238-a9e4fba30c38",
  "quote_id": "268cde00-4a1a-46dd-80d1-186ef7b05585",
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
  "pickup_at": "2026-10-30T19:18:00Z"
}
```

```json
{
  "id": "69be59f7-e117-4564-a9a0-2e5494c27bac",
  "short_number": 28,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "cc976686-8902-47da-bac4-8a0193c46947",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T16:18:01.238438Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T19:18:00Z",
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
  "command_id": "01334b4a-7230-4aaa-84ab-bcc3e89e6532",
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
  "id": "df7669c9-84b8-4d45-8e10-815a405400dd",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T16:23:01.525802Z",
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
  "command_id": "8e3245af-d4b6-44e5-af10-e23a808f1b05",
  "quote_id": "df7669c9-84b8-4d45-8e10-815a405400dd",
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
  "correlation_id": "ec909c0d-d492-4431-9cda-e96de37772a8"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "69be59f7-e117-4564-a9a0-2e5494c27bac",
      "short_number": 28,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "cc976686-8902-47da-bac4-8a0193c46947",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-30T16:18:01.238438Z",
      "cancellation": null,
      "pickup_at": "2026-10-30T19:18:00Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "e10958ce-db29-4e5a-a8a4-fc5f1339cfe3",
      "short_number": 27,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "cc976686-8902-47da-bac4-8a0193c46947",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
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
      "created_at": "2026-10-30T16:18:00.6637Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "bc2cccf5-ef0c-4a70-92fe-c6d412690998",
      "short_number": 26,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "e10958ce-db29-4e5a-a8a4-fc5f1339cfe3",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "cc976686-8902-47da-bac4-8a0193c46947",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T16:18:00.6637Z",
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

`GET /api/rider/v1/orders/bc2cccf5-ef0c-4a70-92fe-c6d412690998` → **200**

```json
{
  "id": "bc2cccf5-ef0c-4a70-92fe-c6d412690998",
  "short_number": 26,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "cc976686-8902-47da-bac4-8a0193c46947",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "e7b80a94-3537-4652-b046-9692f9fa3892",
    "order_id": "bc2cccf5-ef0c-4a70-92fe-c6d412690998",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "4e2bf1bd-0f36-49fb-9e68-99461c38f95c",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T16:17:59.281359Z",
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
    "location_at": "2026-10-30T16:17:58.157009Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/bc2cccf5-ef0c-4a70-92fe-c6d412690998/cancel` → **200**

```json
{
  "command_id": "66af32a2-519c-4b99-87d3-ae2871ce4e88",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "bc2cccf5-ef0c-4a70-92fe-c6d412690998",
  "short_number": 26,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "cc976686-8902-47da-bac4-8a0193c46947",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "e7b80a94-3537-4652-b046-9692f9fa3892",
    "order_id": "bc2cccf5-ef0c-4a70-92fe-c6d412690998",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "4e2bf1bd-0f36-49fb-9e68-99461c38f95c",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T16:17:59.281359Z",
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
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e10958ce-db29-4e5a-a8a4-fc5f1339cfe3` → **200**

```json
{
  "id": "e10958ce-db29-4e5a-a8a4-fc5f1339cfe3",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "cc976686-8902-47da-bac4-8a0193c46947",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T16:18:00.6637Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/e10958ce-db29-4e5a-a8a4-fc5f1339cfe3/cancel` → **200**

```json
{
  "command_id": "ce4f07d2-97d7-4414-bc41-38191e84b16d",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "e10958ce-db29-4e5a-a8a4-fc5f1339cfe3",
  "short_number": 27,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "cc976686-8902-47da-bac4-8a0193c46947",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T16:18:00.6637Z",
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
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/69be59f7-e117-4564-a9a0-2e5494c27bac` → **200**

```json
{
  "id": "69be59f7-e117-4564-a9a0-2e5494c27bac",
  "short_number": 28,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "cc976686-8902-47da-bac4-8a0193c46947",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T16:18:01.238438Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T19:18:00Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/69be59f7-e117-4564-a9a0-2e5494c27bac/cancel` → **200**

```json
{
  "command_id": "65743c8c-4283-459e-8034-8834dc346d43",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "69be59f7-e117-4564-a9a0-2e5494c27bac",
  "short_number": 28,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "cc976686-8902-47da-bac4-8a0193c46947",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T16:18:01.238438Z",
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
  "pickup_at": "2026-10-30T19:18:00Z",
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
  "session_id": "85da6aab-6a5f-45e6-b286-a10f1bc4161a",
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
  "last_heartbeat_at": "2026-10-30T16:17:58.157009Z",
  "last_location_at": "2026-10-30T16:17:58.157009Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/85da6aab-6a5f-45e6-b286-a10f1bc4161a/close` → **200**

```json
{
  "command_id": "79448e44-8920-4f5e-bdfd-2e570e153d46",
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

Done: orders bc2cccf5-ef0c-4a70-92fe-c6d412690998, e10958ce-db29-4e5a-a8a4-fc5f1339cfe3, 69be59f7-e117-4564-a9a0-2e5494c27bac.

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
  "session_id": "455f606b-8ad0-416b-bf3e-52d49e38ab72",
  "subject": {
    "type": "STAFF",
    "id": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NTM4N2IzNC1lN2M5LTRhZmYtOTNjMS0wZGQzZjJhY2QwOGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzc5ODUsImlhdCI6MTc5MzM3NzA4NSwianRpIjoiYjEzNTM3MWQtMWYwYS00MDllLWI5NTgtYWIxMTIwZjY3MGExIiwic2lkIjoiNDU1ZjYwNmItOGFkMC00MTZiLWJmM2UtNTJkNDllMzhhYjcyIn0._UeLoDayXRNLnUnt5ZnN_X5QGYtdbTc-jH2KbL9v4TY",
  "access_expires_at": "2026-10-30T16:33:05.179494342Z",
  "refresh_token": "v9CbOZoSUkAVfDZKTqvNeUQ9-awQKKsEIZNZHOBVT-Y",
  "refresh_expires_at": "2026-10-31T04:18:05.179047649Z",
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
  "session_id": "fc49720c-0b96-4bad-b1aa-470cfb1772ac",
  "subject": {
    "type": "STAFF",
    "id": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NTM4N2IzNC1lN2M5LTRhZmYtOTNjMS0wZGQzZjJhY2QwOGYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzc5ODUsImlhdCI6MTc5MzM3NzA4NSwianRpIjoiOWVhOTZkM2YtMDc1MC00OTIwLTkzMWYtMmFiY2EwMGVjYWJmIiwic2lkIjoiZmM0OTcyMGMtMGI5Ni00YmFkLWIxYWEtNDcwY2ZiMTc3MmFjIn0.Cgd8vrT-OVCDc_fpioMZKDKXZHeCcmIBaeNGUn3PdwI",
  "access_expires_at": "2026-10-30T16:33:05.742945143Z",
  "refresh_token": "lDuSUCFagKJOeKiY-VaDUUZlCUm5gWskQmRkcHAi3VE",
  "refresh_expires_at": "2026-10-31T04:18:05.74243691Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-26938"
}
```

```json
{
  "challenge_id": "338df3eb-9904-404a-9dad-b229df38cf55",
  "expires_at": "2026-10-30T16:23:05.99841519Z",
  "resend_available_at": "2026-10-30T16:18:06.99841519Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "184907",
  "sent_at": "2026-10-30T16:18:06.000945549Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "338df3eb-9904-404a-9dad-b229df38cf55",
  "code": "184907",
  "device_ref": "sandbox-26938"
}
```

```json
{
  "session_id": "7b63097e-d2e4-4069-8aa9-d7ee59503283",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3Nzk4NiwiaWF0IjoxNzkzMzc3MDg2LCJqdGkiOiJmZTA0YWQ3OS1iNThjLTQ3YTgtYTNjZC05Y2ZjNTQ0ZTk3NTIiLCJzaWQiOiI3YjYzMDk3ZS1kMmU0LTQwNjktOGFhOS1kN2VlNTk1MDMyODMifQ.disgnJ4ooeRnCA_YJB83nnvXA9TZ2bfFBWx1liyWnZg",
  "access_expires_at": "2026-10-30T16:33:06.288026359Z",
  "refresh_token": "KCrsFtWtl7Mm7gp1W1SVNjMrCOwkQn-UfdeXAq4Bd8s",
  "refresh_expires_at": "2026-11-29T16:18:06.287430502Z",
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
  "command_id": "0009dd14-643e-4382-b327-3dea49841d1a",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:18:06Z",
    "sequence": 1793377086829
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "81ad609a-8411-4130-b5cd-6e81032c1d37",
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
  "last_heartbeat_at": "2026-10-30T16:18:06.845998Z",
  "last_location_at": "2026-10-30T16:18:06.845998Z",
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
  "command_id": "9602b119-e475-4e3c-ada8-6f5abbfcbb80",
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
  "effective_at": "2026-10-30T16:18:07.404541Z",
  "changed_by": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-30T16:08:11.633916Z",
  "last_entries": [
    {
      "order_id": "0e1045e5-ff7f-4889-9f5b-590e11ec1217",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T16:08:11.633916Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "770fdfa7-a259-4b62-b540-912ac516f8b7",
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
  "id": "054139b1-cde9-4347-ac7a-28bd49eedb47",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T16:23:07.952507Z",
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
  "command_id": "e3c6e6ae-8457-4ce1-9973-b555e166104c",
  "quote_id": "054139b1-cde9-4347-ac7a-28bd49eedb47",
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
    "phone": "+3806711119967"
  }
}
```

```json
{
  "id": "532d395d-d37d-4ffb-830d-51c825bd24ec",
  "short_number": 29,
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
  "created_at": "2026-10-30T16:18:08.237234Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711119967"
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
    "id": "af08a089-acf1-4635-b67e-772fbcfd675b",
    "order_id": "532d395d-d37d-4ffb-830d-51c825bd24ec",
    "expires_at": "2026-10-30T16:18:23.240891Z",
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

`POST /api/driver/v1/offers/af08a089-acf1-4635-b67e-772fbcfd675b/accept` → **200**

```json
{
  "command_id": "28128b5c-a834-489b-a772-82596aa56b5e"
}
```

```json
{
  "id": "c281c3d3-efab-483b-8620-798d7d9f7061",
  "order_id": "532d395d-d37d-4ffb-830d-51c825bd24ec",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "ada4cd87-ba85-4191-95ad-218b7a76549b",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "ada4cd87-ba85-4191-95ad-218b7a76549b",
  "order_id": "532d395d-d37d-4ffb-830d-51c825bd24ec",
  "assignment_id": "c281c3d3-efab-483b-8620-798d7d9f7061",
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
    "phone": "+3806711119967"
  }
}
```

`POST /api/driver/v1/work-sessions/81ad609a-8411-4130-b5cd-6e81032c1d37/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:18:09Z",
    "sequence": 1793377089342
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "81ad609a-8411-4130-b5cd-6e81032c1d37",
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
  "last_heartbeat_at": "2026-10-30T16:18:09.358221Z",
  "last_location_at": "2026-10-30T16:18:09.358221Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/ada4cd87-ba85-4191-95ad-218b7a76549b/arrive` → **200**

```json
{
  "command_id": "d987f72f-5667-463b-b835-4ab0cbabc33d",
  "expected_version": 0
}
```

```json
{
  "id": "ada4cd87-ba85-4191-95ad-218b7a76549b",
  "order_id": "532d395d-d37d-4ffb-830d-51c825bd24ec",
  "assignment_id": "c281c3d3-efab-483b-8620-798d7d9f7061",
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
  "arrived_at": "2026-10-30T16:18:09.624957Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711119967"
  }
}
```

`POST /api/driver/v1/trips/ada4cd87-ba85-4191-95ad-218b7a76549b/start` → **200**

```json
{
  "command_id": "efbddf27-eef3-41aa-b417-48b15965eb63",
  "expected_version": 1
}
```

```json
{
  "id": "ada4cd87-ba85-4191-95ad-218b7a76549b",
  "order_id": "532d395d-d37d-4ffb-830d-51c825bd24ec",
  "assignment_id": "c281c3d3-efab-483b-8620-798d7d9f7061",
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
  "arrived_at": "2026-10-30T16:18:09.624957Z",
  "started_at": "2026-10-30T16:18:09.905402Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711119967"
  }
}
```

`POST /api/driver/v1/trips/ada4cd87-ba85-4191-95ad-218b7a76549b/complete` → **200**

```json
{
  "command_id": "eba3247f-85ed-48e4-9faf-dd25051b63dc",
  "expected_version": 2,
  "reported_at": "2026-10-30T16:18:10Z",
  "cash_received": true
}
```

```json
{
  "id": "ada4cd87-ba85-4191-95ad-218b7a76549b",
  "order_id": "532d395d-d37d-4ffb-830d-51c825bd24ec",
  "assignment_id": "c281c3d3-efab-483b-8620-798d7d9f7061",
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
  "arrived_at": "2026-10-30T16:18:09.624957Z",
  "started_at": "2026-10-30T16:18:09.905402Z",
  "completed_at": "2026-10-30T16:18:10.183512Z",
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
  "command_id": "ea26213a-bfbe-4fcc-9884-05cce864a949",
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
  "id": "84ec8b42-2258-4059-9262-db1f81265e24",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T16:23:10.459854Z",
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
  "command_id": "13675b78-b634-4acb-b59e-2fdb27007272",
  "quote_id": "84ec8b42-2258-4059-9262-db1f81265e24",
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
    "phone": "+3806711125840"
  }
}
```

```json
{
  "id": "19c02da5-82a3-4b39-8914-d2734f8db4f8",
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
  "created_at": "2026-10-30T16:18:10.735629Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711125840"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/19c02da5-82a3-4b39-8914-d2734f8db4f8` → **200**

```json
{
  "id": "19c02da5-82a3-4b39-8914-d2734f8db4f8",
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
  "created_at": "2026-10-30T16:18:10.735629Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711125840"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/19c02da5-82a3-4b39-8914-d2734f8db4f8/cancel` → **200**

```json
{
  "command_id": "ea581c6e-cc04-49ac-8a7d-872af4f22575",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "19c02da5-82a3-4b39-8914-d2734f8db4f8",
  "short_number": 30,
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
  "created_at": "2026-10-30T16:18:10.735629Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711125840"
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
  "staff_id": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-30T16:08:11.633916Z",
  "last_entries": [
    {
      "order_id": "19c02da5-82a3-4b39-8914-d2734f8db4f8",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-30T16:18:11.321396Z"
    },
    {
      "order_id": "532d395d-d37d-4ffb-830d-51c825bd24ec",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-30T16:18:10.18787Z"
    },
    {
      "order_id": "0e1045e5-ff7f-4889-9f5b-590e11ec1217",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T16:08:11.633916Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "81ad609a-8411-4130-b5cd-6e81032c1d37",
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
  "last_heartbeat_at": "2026-10-30T16:18:09.358221Z",
  "last_location_at": "2026-10-30T16:18:09.358221Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/81ad609a-8411-4130-b5cd-6e81032c1d37/close` → **200**

```json
{
  "command_id": "1c7fc4b4-864f-479a-817d-46261bb87e81",
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

Done: operator bonus for fulfilled 532d395d-d37d-4ffb-830d-51c825bd24ec and operator-fault cancellation 19c02da5-82a3-4b39-8914-d2734f8db4f8.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673817364",
  "device_ref": "sandbox-4166"
}
```

```json
{
  "challenge_id": "f6ba7f27-34d7-4ee9-8da1-2458d5bd12fa",
  "expires_at": "2026-10-30T16:23:15.664512163Z",
  "resend_available_at": "2026-10-30T16:18:16.664512163Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380673817364` → **200**

```json
{
  "phone": "+380673817364",
  "audience": "CLIENT",
  "code": "850619",
  "sent_at": "2026-10-30T16:18:15.666974456Z",
  "channel": "SMS"
}
```

## "Call me instead" on the first try still gets an SMS; the resend is a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672470721",
  "device_ref": "sandbox-7707",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "e24fe037-d164-43db-a948-df57b87975d2",
  "expires_at": "2026-10-30T16:23:17.160666446Z",
  "resend_available_at": "2026-10-30T16:18:18.160666446Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380672470721` → **200**

```json
{
  "phone": "+380672470721",
  "audience": "CLIENT",
  "code": "896354",
  "sent_at": "2026-10-30T16:18:17.162711762Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672470721",
  "device_ref": "sandbox-23170",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "32d760b9-0c23-4214-9f55-cbf358fafff0",
  "expires_at": "2026-10-30T16:23:18.647327633Z",
  "resend_available_at": "2026-10-30T16:18:19.647327633Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380672470721` → **200**

```json
{
  "phone": "+380672470721",
  "audience": "CLIENT",
  "code": "595048",
  "sent_at": "2026-10-30T16:18:18.649903797Z",
  "channel": "VOICE"
}
```

## The SMS does not get through: one request, one attempt; the resend comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677710000",
  "device_ref": "sandbox-27921"
}
```

```json
{
  "challenge_id": "3254799d-59f5-4359-ac35-d0b0bdbb723b",
  "expires_at": "2026-10-30T16:23:20.137492893Z",
  "resend_available_at": "2026-10-30T16:18:21.137492893Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677710000",
  "device_ref": "sandbox-21110"
}
```

```json
{
  "challenge_id": "00f48e9b-7f4f-4b2b-856c-638afc820165",
  "expires_at": "2026-10-30T16:23:21.612458378Z",
  "resend_available_at": "2026-10-30T16:18:22.612458378Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380677710000` → **200**

```json
{
  "phone": "+380677710000",
  "audience": "CLIENT",
  "code": "038962",
  "sent_at": "2026-10-30T16:18:21.615055933Z",
  "channel": "VOICE"
}
```

## A second call in the hour is made, the third is refused

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677710000",
  "device_ref": "sandbox-22674",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "ac469d60-6738-44f9-8d02-a28754f3b804",
  "expires_at": "2026-10-30T16:23:23.105725629Z",
  "resend_available_at": "2026-10-30T16:18:24.105725629Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380677710000` → **200**

```json
{
  "phone": "+380677710000",
  "audience": "CLIENT",
  "code": "966797",
  "sent_at": "2026-10-30T16:18:23.10857328Z",
  "channel": "VOICE"
}
```

`POST /auth/v1/otp/challenges` → **429**

```json
{
  "audience": "CLIENT",
  "phone": "+380677710000",
  "device_ref": "sandbox-27533",
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
  "correlation_id": "4df71542-5ae9-4dd0-be80-510f02331b1c",
  "retryable": true,
  "retry_after_seconds": 3600
}
```

## Numbers outside Poland and Ukraine get nothing

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+442000006479"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "d63633a0-acca-4fc5-9461-b35933e9ce4e"
}
```

`GET /sandbox/v1/otp?phone=%2B442000006479` → **404**

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+37120008412"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "43ba6636-4b59-4e8d-9c95-ba7621736dcf"
}
```

`GET /sandbox/v1/otp?phone=%2B37120008412` → **404**

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
  "session_id": "61cd8f05-03e8-4c39-8a90-c420fe6b39c6",
  "subject": {
    "type": "STAFF",
    "id": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NTM4N2IzNC1lN2M5LTRhZmYtOTNjMS0wZGQzZjJhY2QwOGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzgwMDUsImlhdCI6MTc5MzM3NzEwNSwianRpIjoiNGQwMTgwNjktNWIxNS00MzQxLWE1NGUtZWE4NzE3ZjkyNjhhIiwic2lkIjoiNjFjZDhmMDUtMDNlOC00YzM5LThhOTAtYzQyMGZlNmIzOWM2In0.Zt09df-DHtgSazIDykJlLhuI3NcJPtSxZvQ8urpLMUI",
  "access_expires_at": "2026-10-30T16:33:25.751033464Z",
  "refresh_token": "yynIfERkLkY_mz9_o_fmi-YrXdRQVFolH_IxJnpBkoU",
  "refresh_expires_at": "2026-10-31T04:18:25.75053131Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380677710000` → **200**

```json
{
  "deliveries": [
    {
      "id": "a7f5c37b-6b4d-4edf-80ab-c1aedc69ff88",
      "challenge_id": "ac469d60-6738-44f9-8d02-a28754f3b804",
      "phone": "+380677710000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-8771e43b-9f18-4f5e-8068-c9a54862d89d",
      "error": null,
      "attempted_at": "2026-10-30T16:18:23.1089Z"
    },
    {
      "id": "a19527ea-37e1-495a-b43a-fbfd43911350",
      "challenge_id": "00f48e9b-7f4f-4b2b-856c-638afc820165",
      "phone": "+380677710000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-a0ace6e8-1d92-44ea-9c87-d2cac48f9733",
      "error": null,
      "attempted_at": "2026-10-30T16:18:21.615443Z"
    },
    {
      "id": "992bb567-42ee-41eb-b2b4-8701e475c8d3",
      "challenge_id": "3254799d-59f5-4359-ac35-d0b0bdbb723b",
      "phone": "+380677710000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-30T16:18:20.139969Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380677710000` → **200**

```json
{
  "phone": "+380677710000",
  "audience": "CLIENT",
  "code": "966797",
  "sent_at": "2026-10-30T16:18:23.10857328Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380672470721` → **200**

```json
{
  "deliveries": [
    {
      "id": "523c0fe2-ed1a-440a-82f6-0efd787e1923",
      "challenge_id": "32d760b9-0c23-4214-9f55-cbf358fafff0",
      "phone": "+380672470721",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-14e06691-a4e5-4013-8a82-5cb221cc69ed",
      "error": null,
      "attempted_at": "2026-10-30T16:18:18.650188Z"
    },
    {
      "id": "3e5e5921-c3e7-45d5-84cc-7f68094a6f4a",
      "challenge_id": "e24fe037-d164-43db-a948-df57b87975d2",
      "phone": "+380672470721",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-687c0a55-5534-4695-a6fe-e524e0d7cdaf",
      "error": null,
      "attempted_at": "2026-10-30T16:18:17.163061Z"
    }
  ]
}
```

Done: SMS to +380673817364; SMS then a call to +380672470721; a failed SMS, two calls and a refused third to +380677710000; +44 and +371 refused.

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
  "session_id": "041096dd-5804-46fe-ae14-b21184c6f639",
  "subject": {
    "type": "STAFF",
    "id": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NTM4N2IzNC1lN2M5LTRhZmYtOTNjMS0wZGQzZjJhY2QwOGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzgwMDYsImlhdCI6MTc5MzM3NzEwNiwianRpIjoiNmVlN2NhYzktZDQ1ZC00ZDdlLThkMDQtZTNiYTEzYjk1ZjlmIiwic2lkIjoiMDQxMDk2ZGQtNTgwNC00NmZlLWFlMTQtYjIxMTg0YzZmNjM5In0.gGNoEmpRB0AlVkCpO6clnwUaAS71CnnLztHs5WaHNC4",
  "access_expires_at": "2026-10-30T16:33:26.887423641Z",
  "refresh_token": "1Phw8MslAWQ7FklXdSMeyhOK4EvlkgUVTDAdChApAiw",
  "refresh_expires_at": "2026-10-31T04:18:26.886899397Z",
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
  "session_id": "27fd629f-3d3f-4dce-8210-ce3754865277",
  "subject": {
    "type": "STAFF",
    "id": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NTM4N2IzNC1lN2M5LTRhZmYtOTNjMS0wZGQzZjJhY2QwOGYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzgwMDcsImlhdCI6MTc5MzM3NzEwNywianRpIjoiMTE1Y2U4ZTgtYzhkNC00NzEwLWExNDgtMTU5YjgxMjY5YzA2Iiwic2lkIjoiMjdmZDYyOWYtM2QzZi00ZGNlLTgyMTAtY2UzNzU0ODY1Mjc3In0.wuF4oYbyH2_2a2t0h-TFamz0rtHvmsXpJW8skq0hqVA",
  "access_expires_at": "2026-10-30T16:33:27.455947136Z",
  "refresh_token": "91fYuXSkgP0_72k17B89bmbLzBx_ulB51QQozRy-2LI",
  "refresh_expires_at": "2026-10-31T04:18:27.455513321Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f",
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

`POST /api/admin/v1/staff-extensions/65387b34-e7c9-4aff-93c1-0dd3f2acd08f` → **200**

```json
{
  "command_id": "c56fa76f-2b61-4435-85ea-bfa48c9f928a",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "e393093a-4530-4b83-840f-54c4defcf609",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T16:18:28.53404Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T16:18:28.53404Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "47954709-e2a1-4721-909b-651cf5042058",
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
  "id": "9929e8e0-34e9-4818-9f60-57980c6cafa6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T16:23:29.088065Z",
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
  "command_id": "3522d4e1-7376-4eca-b3c9-32b146373778",
  "quote_id": "9929e8e0-34e9-4818-9f60-57980c6cafa6",
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
    "phone": "+380677842124"
  }
}
```

```json
{
  "id": "597f23e1-53ec-47fd-86f0-c556306d94be",
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
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T16:18:29.367375Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677842124"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/597f23e1-53ec-47fd-86f0-c556306d94be/calls` → **201**

```json
{
  "command_id": "71d20820-916f-42fd-9586-97a2f7924809",
  "to": "CALLER"
}
```

```json
{
  "id": "0f82fff4-1191-4638-9347-914859a860a6",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f",
  "order_ids": [
    "597f23e1-53ec-47fd-86f0-c556306d94be"
  ],
  "started_at": "2026-10-30T16:18:29.675482Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/597f23e1-53ec-47fd-86f0-c556306d94be/calls` → **201**

```json
{
  "command_id": "71d20820-916f-42fd-9586-97a2f7924809",
  "to": "CALLER"
}
```

```json
{
  "id": "0f82fff4-1191-4638-9347-914859a860a6",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f",
  "order_ids": [
    "597f23e1-53ec-47fd-86f0-c556306d94be"
  ],
  "started_at": "2026-10-30T16:18:29.675482Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "0f82fff4-1191-4638-9347-914859a860a6",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380677842124",
    "at": "2026-10-30T16:18:29.677750946Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "0f82fff4-1191-4638-9347-914859a860a6",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.514",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "0f82fff4-1191-4638-9347-914859a860a6"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "0f82fff4-1191-4638-9347-914859a860a6",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=597f23e1-53ec-47fd-86f0-c556306d94be` → **200**

```json
{
  "calls": [
    {
      "id": "0f82fff4-1191-4638-9347-914859a860a6",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f",
      "order_ids": [
        "597f23e1-53ec-47fd-86f0-c556306d94be"
      ],
      "started_at": "2026-10-30T16:18:29.675482Z",
      "answered_at": "2026-10-30T16:18:30.291432Z",
      "ended_at": "2026-10-30T16:18:30.309747Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=597f23e1-53ec-47fd-86f0-c556306d94be` → **200**

```json
{
  "calls": [
    {
      "id": "0f82fff4-1191-4638-9347-914859a860a6",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f",
      "order_ids": [
        "597f23e1-53ec-47fd-86f0-c556306d94be"
      ],
      "started_at": "2026-10-30T16:18:29.675482Z",
      "answered_at": "2026-10-30T16:18:30.291432Z",
      "ended_at": "2026-10-30T16:18:30.309747Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=597f23e1-53ec-47fd-86f0-c556306d94be` → **200**

```json
{
  "calls": [
    {
      "id": "0f82fff4-1191-4638-9347-914859a860a6",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f",
      "order_ids": [
        "597f23e1-53ec-47fd-86f0-c556306d94be"
      ],
      "started_at": "2026-10-30T16:18:29.675482Z",
      "answered_at": "2026-10-30T16:18:30.291432Z",
      "ended_at": "2026-10-30T16:18:30.309747Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T16:18:33.163286Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/597f23e1-53ec-47fd-86f0-c556306d94be` → **200**

```json
{
  "id": "597f23e1-53ec-47fd-86f0-c556306d94be",
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
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T16:18:29.367375Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677842124"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/597f23e1-53ec-47fd-86f0-c556306d94be/cancel` → **200**

```json
{
  "command_id": "7fc1f5ba-04b9-4f99-bdde-56b072d1ec61",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "597f23e1-53ec-47fd-86f0-c556306d94be",
  "short_number": 31,
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
  "created_at": "2026-10-30T16:18:29.367375Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677842124"
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
  "command_id": "ed3c0b05-fc03-40f8-8cee-6650078eba50",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-30T16:18:35.756927Z",
  "extension": "101"
}
```

Done: outgoing call 0f82fff4-1191-4638-9347-914859a860a6 from order 597f23e1-53ec-47fd-86f0-c556306d94be, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636417416",
  "device_ref": "sandbox-16337"
}
```

```json
{
  "challenge_id": "4917f41b-a29d-4309-b347-ed3420c4e923",
  "expires_at": "2026-10-30T16:23:36.042424245Z",
  "resend_available_at": "2026-10-30T16:18:37.042424245Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636417416` → **200**

```json
{
  "phone": "+380636417416",
  "audience": "CLIENT",
  "code": "653607",
  "sent_at": "2026-10-30T16:18:36.045027558Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4917f41b-a29d-4309-b347-ed3420c4e923",
  "code": "653607",
  "device_ref": "sandbox-16337"
}
```

```json
{
  "session_id": "3b93048d-2a3d-4306-a451-b41a50a585c3",
  "subject": {
    "type": "CLIENT",
    "id": "4a4aecbb-df70-45ce-bdf1-2da90f08a176"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YTRhZWNiYi1kZjcwLTQ1Y2UtYmRmMS0yZGE5MGYwOGExNzYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc4MDE2LCJpYXQiOjE3OTMzNzcxMTYsImp0aSI6IjAzODI3MzBkLTQyZjQtNGZjMy05NWU4LTdiMTQ1MjM2YTVmNyIsInNpZCI6IjNiOTMwNDhkLTJhM2QtNDMwNi1hNDUxLWI0MWE1MGE1ODVjMyJ9.ppMyZ5FHinrftwfGaSSziJPyYUKXxOzaCjs2B8U-jAM",
  "access_expires_at": "2026-10-30T16:33:36.32952421Z",
  "refresh_token": "oMirGRu1Tw039UDerj58SLSQmea9fcLLFPYbRHdA0e8",
  "refresh_expires_at": "2026-11-29T16:18:36.329030792Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "4a4aecbb-df70-45ce-bdf1-2da90f08a176",
  "session_id": "3b93048d-2a3d-4306-a451-b41a50a585c3",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636417416",
  "device_ref": "sandbox-1717"
}
```

```json
{
  "challenge_id": "4211a71d-937c-422d-9014-f981fbfc9cf0",
  "expires_at": "2026-10-30T16:23:38.863013478Z",
  "resend_available_at": "2026-10-30T16:18:39.863013478Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636417416` → **200**

```json
{
  "phone": "+380636417416",
  "audience": "CLIENT",
  "code": "498727",
  "sent_at": "2026-10-30T16:18:38.865360977Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4211a71d-937c-422d-9014-f981fbfc9cf0",
  "code": "498727",
  "device_ref": "sandbox-1717"
}
```

```json
{
  "session_id": "b4e2d6cd-b2bd-42b2-91de-76033347ba23",
  "subject": {
    "type": "CLIENT",
    "id": "4a4aecbb-df70-45ce-bdf1-2da90f08a176"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YTRhZWNiYi1kZjcwLTQ1Y2UtYmRmMS0yZGE5MGYwOGExNzYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc4MDE5LCJpYXQiOjE3OTMzNzcxMTksImp0aSI6IjM3N2NmZGEzLTZlZTYtNDZkYi05MGI1LWViZDAwNGU2NmNlNyIsInNpZCI6ImI0ZTJkNmNkLWIyYmQtNDJiMi05MWRlLTc2MDMzMzQ3YmEyMyJ9.wYuuXXN12DrmhuSWbuX_kC_rouemFwSsNskLLyFzoLE",
  "access_expires_at": "2026-10-30T16:33:39.151205692Z",
  "refresh_token": "HicwcDc3TbsJ1pAssSxkhKGuCPKx7-mm78topDaMhs0",
  "refresh_expires_at": "2026-11-29T16:18:39.150752514Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "3c43c09b-066e-4ad8-92e1-402fc2be1caf",
  "expires_at": "2026-10-30T16:23:41.416584459Z",
  "resend_available_at": "2026-10-30T16:18:42.416584459Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636417416` → **200**

```json
{
  "phone": "+380636417416",
  "audience": "CLIENT",
  "code": "009636",
  "sent_at": "2026-10-30T16:18:41.418907409Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380638782137"
}
```

```json
{
  "challenge_id": "77fa8065-89aa-4131-b4d9-08b566576d83",
  "expires_at": "2026-10-30T16:23:41.704250356Z",
  "resend_available_at": "2026-10-30T16:18:42.704250356Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638782137` → **200**

```json
{
  "phone": "+380638782137",
  "audience": "CLIENT",
  "code": "917444",
  "sent_at": "2026-10-30T16:18:41.706398348Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "8a479d42-1db8-4332-b0db-15abb37e2979",
  "current_challenge_id": "3c43c09b-066e-4ad8-92e1-402fc2be1caf",
  "current_code": "000000",
  "new_challenge_id": "77fa8065-89aa-4131-b4d9-08b566576d83",
  "new_code": "917444"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "18508ae3-efb5-48e7-9ef6-6d4c37f079f8"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "d438778b-eb32-4b98-b20b-97e6e3fbea62",
  "current_challenge_id": "3c43c09b-066e-4ad8-92e1-402fc2be1caf",
  "current_code": "009636",
  "new_challenge_id": "77fa8065-89aa-4131-b4d9-08b566576d83",
  "new_code": "917444"
}
```

```json
{
  "subject_id": "4a4aecbb-df70-45ce-bdf1-2da90f08a176",
  "phone": "+380638782137",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "4a4aecbb-df70-45ce-bdf1-2da90f08a176",
  "session_id": "3b93048d-2a3d-4306-a451-b41a50a585c3",
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
  "correlation_id": "2591d2bf-50e7-4bef-a101-10abe4c538fd"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638782137",
  "device_ref": "sandbox-1465"
}
```

```json
{
  "challenge_id": "8f226b30-3f9e-4822-89d3-47b6679e3ec3",
  "expires_at": "2026-10-30T16:23:45.065018486Z",
  "resend_available_at": "2026-10-30T16:18:46.065018486Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638782137` → **200**

```json
{
  "phone": "+380638782137",
  "audience": "CLIENT",
  "code": "442574",
  "sent_at": "2026-10-30T16:18:45.06722376Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8f226b30-3f9e-4822-89d3-47b6679e3ec3",
  "code": "442574",
  "device_ref": "sandbox-1465"
}
```

```json
{
  "session_id": "75ccda9f-3889-433e-b3e3-6caf507ee275",
  "subject": {
    "type": "CLIENT",
    "id": "4a4aecbb-df70-45ce-bdf1-2da90f08a176"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YTRhZWNiYi1kZjcwLTQ1Y2UtYmRmMS0yZGE5MGYwOGExNzYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc4MDI1LCJpYXQiOjE3OTMzNzcxMjUsImp0aSI6IjY0MzZlNzBiLTcwOWQtNDczZi1iZjhjLWJiZDBhNDJkYTE3YyIsInNpZCI6Ijc1Y2NkYTlmLTM4ODktNDMzZS1iM2UzLTZjYWY1MDdlZTI3NSJ9.iR65kt__fV6prQ8YqEs7Yp2e9f-SwLTJ6LFXBDbkMy4",
  "access_expires_at": "2026-10-30T16:33:45.355787985Z",
  "refresh_token": "nnbi_2geomckPZzkbWI1PYiiIhFudClCGrBVJi8Ap1s",
  "refresh_expires_at": "2026-11-29T16:18:45.355327935Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "4a4aecbb-df70-45ce-bdf1-2da90f08a176",
  "session_id": "75ccda9f-3889-433e-b3e3-6caf507ee275",
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
  "session_id": "822a55c0-caa2-410a-8140-c8bdcbc94372",
  "subject": {
    "type": "STAFF",
    "id": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NTM4N2IzNC1lN2M5LTRhZmYtOTNjMS0wZGQzZjJhY2QwOGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzgwMjYsImlhdCI6MTc5MzM3NzEyNiwianRpIjoiMGUwNTZkMDUtNzUwNC00NmNmLWJkOWUtYmRhY2Y0YjNiZmFiIiwic2lkIjoiODIyYTU1YzAtY2FhMi00MTBhLTgxNDAtYzhiZGNiYzk0MzcyIn0.nkF4hW7ExkoGPWjCXZiuKT83-m4qhJKRtpGBKmRko-s",
  "access_expires_at": "2026-10-30T16:33:46.184594256Z",
  "refresh_token": "rP2_WAPwW7cdGhnjczlGTRnXqaPHx2g_vUy-RQqmlxw",
  "refresh_expires_at": "2026-10-31T04:18:46.184051005Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/4a4aecbb-df70-45ce-bdf1-2da90f08a176` → **200**

```json
{
  "client": {
    "id": "4a4aecbb-df70-45ce-bdf1-2da90f08a176",
    "phone": "+380638782137",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T16:18:36.327284Z",
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

`POST /api/admin/v1/clients/4a4aecbb-df70-45ce-bdf1-2da90f08a176/phone/new-code` → **201**

```json
{
  "phone": "+380634520000"
}
```

```json
{
  "challenge_id": "f3832086-1ce1-4e81-99bf-503249f33460",
  "expires_at": "2026-10-30T16:23:46.747766242Z",
  "resend_available_at": "2026-10-30T16:18:47.747766242Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634520000` → **404**

## Without the right code nothing changes; with it, support sets the phone

# Scenario: places

## A new rider searches: no history yet, the provider answers

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637836964",
  "device_ref": "sandbox-4825"
}
```

```json
{
  "challenge_id": "c9c503cd-8e1b-421f-8c3d-ee038a6e4be5",
  "expires_at": "2026-10-30T16:23:47.059158451Z",
  "resend_available_at": "2026-10-30T16:18:48.059158451Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637836964` → **200**

```json
{
  "phone": "+380637836964",
  "audience": "CLIENT",
  "code": "327177",
  "sent_at": "2026-10-30T16:18:47.061665238Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c9c503cd-8e1b-421f-8c3d-ee038a6e4be5",
  "code": "327177",
  "device_ref": "sandbox-4825"
}
```

```json
{
  "session_id": "208043c3-0792-4d9d-9166-7bc51b0ac68e",
  "subject": {
    "type": "CLIENT",
    "id": "fee93b00-2653-4c9a-bdc4-b8d6519495c3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZWU5M2IwMC0yNjUzLTRjOWEtYmRjNC1iOGQ2NTE5NDk1YzMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc4MDI3LCJpYXQiOjE3OTMzNzcxMjcsImp0aSI6ImU4ZmI5YWU5LWVlZTYtNGY5ZS1hMzBiLWI5OTkyNjZhODVkOCIsInNpZCI6IjIwODA0M2MzLTA3OTItNGQ5ZC05MTY2LTdiYzUxYjBhYzY4ZSJ9.GgU2INqW-CDMWzUCcNo6IqUAniufsQHtGdvHiyp1k8Q",
  "access_expires_at": "2026-10-30T16:33:47.353349958Z",
  "refresh_token": "T27Xbb8Qb78GYYDlDlIiDieUWeFQLkE7_UIX2fkke28",
  "refresh_expires_at": "2026-11-29T16:18:47.352689846Z",
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
  "session_id": "cfad137b-f9d2-4f01-ba65-de5d205ab201",
  "subject": {
    "type": "STAFF",
    "id": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NTM4N2IzNC1lN2M5LTRhZmYtOTNjMS0wZGQzZjJhY2QwOGYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzgwMjgsImlhdCI6MTc5MzM3NzEyOCwianRpIjoiZjEyMGQ3ZTctYzI0NC00NWRlLTkwZWEtM2E3NjY5MDFmMGJiIiwic2lkIjoiY2ZhZDEzN2ItZjlkMi00ZjAxLWJhNjUtZGU1ZDIwNWFiMjAxIn0.u4BtzB8WNmDnlvTUxjzKgzbDl1UQ0TBzIFdTKpmm8yc",
  "access_expires_at": "2026-10-30T16:33:48.46396967Z",
  "refresh_token": "pUOtaEW-Mk1m7M80HBU_Q1DU0uTKF5vHWbnm451762g",
  "refresh_expires_at": "2026-10-31T04:18:48.463537287Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380637836964` → **200**

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
  "correlation_id": "2a0cc8a6-a4e5-41a3-b826-75b0f43edcf2"
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
  "session_id": "b7fb27f5-5f35-4f00-9af6-c6ed906816a0",
  "subject": {
    "type": "STAFF",
    "id": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NTM4N2IzNC1lN2M5LTRhZmYtOTNjMS0wZGQzZjJhY2QwOGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzgwMjksImlhdCI6MTc5MzM3NzEyOSwianRpIjoiYTVkMjY2NmYtNjE3Mi00MjhiLTk4ZmQtMTMyMDI2ZDEyMjM2Iiwic2lkIjoiYjdmYjI3ZjUtNWYzNS00ZjAwLTlhZjYtYzZlZDkwNjgxNmEwIn0.fPkAy2NFoG6f441jtOqqv1zQIuSc_2aQhC01gama9nc",
  "access_expires_at": "2026-10-30T16:33:49.574446541Z",
  "refresh_token": "hqtWoaSVv6yT4AutbZaKr5MYtLKXPrNXfx30LFjWtus",
  "refresh_expires_at": "2026-10-31T04:18:49.573856948Z",
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
  "changed_by": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T16:04:15.081711Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "61eb9a89-3aaf-46ed-91d3-504c86133a5c",
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
  "changed_by": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-30T16:18:50.12414775Z"
}
```

## The rider books the airport for 2026-10-30T19:18:49Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600500191",
  "device_ref": "sandbox-25992"
}
```

```json
{
  "challenge_id": "a116259a-3b7e-434f-bd4a-5f615dd0f2f1",
  "expires_at": "2026-10-30T16:23:50.409244298Z",
  "resend_available_at": "2026-10-30T16:18:51.409244298Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600500191` → **200**

```json
{
  "phone": "+48600500191",
  "audience": "CLIENT",
  "code": "993618",
  "sent_at": "2026-10-30T16:18:50.412719128Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a116259a-3b7e-434f-bd4a-5f615dd0f2f1",
  "code": "993618",
  "device_ref": "sandbox-25992"
}
```

```json
{
  "session_id": "cc3ba3df-9c5f-46cd-b02a-4d31c1813bc4",
  "subject": {
    "type": "CLIENT",
    "id": "8f8f04f9-5140-4b5c-9e35-60991e4e6e5a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZjhmMDRmOS01MTQwLTRiNWMtOWUzNS02MDk5MWU0ZTZlNWEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc4MDMwLCJpYXQiOjE3OTMzNzcxMzAsImp0aSI6ImIxYTlkY2U3LTdlMmYtNGQ1Mi1hZmNlLTUyYjRlMGI2OGNlNiIsInNpZCI6ImNjM2JhM2RmLTljNWYtNDZjZC1iMDJhLTRkMzFjMTgxM2JjNCJ9.QZoN6gu8-P9W_Ab8kvrv83LxQfsPzjKJMcZnedlGpg4",
  "access_expires_at": "2026-10-30T16:33:50.701038233Z",
  "refresh_token": "z2MfJMiyxIhg1xQYoFc9vVirc9QQizLJe7-QPGvGjXQ",
  "refresh_expires_at": "2026-11-29T16:18:50.700542432Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "28e51cbe-187e-4769-8467-5a7c27bbb926",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-30T19:18:49Z"
}
```

```json
{
  "id": "4a264f10-0224-4f58-9b0d-0d0bb3354bca",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T16:23:50.968039Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-30T19:18:49Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "8d9947dd-b9f9-4166-b347-e45546e1e193",
  "quote_id": "4a264f10-0224-4f58-9b0d-0d0bb3354bca",
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
  "pickup_at": "2026-10-30T19:18:49Z"
}
```

```json
{
  "id": "ca127164-efb5-429e-930b-ebc6c7f6056c",
  "short_number": 32,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "8f8f04f9-5140-4b5c-9e35-60991e4e6e5a",
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
  "created_at": "2026-10-30T16:18:51.254339Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T19:18:49Z",
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
  "device_ref": "sandbox-25520"
}
```

```json
{
  "challenge_id": "8c34009b-2eae-4a5b-9ebb-695c34d744d7",
  "expires_at": "2026-10-30T16:23:51.530211201Z",
  "resend_available_at": "2026-10-30T16:18:52.530211201Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "317425",
  "sent_at": "2026-10-30T16:18:51.53289229Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8c34009b-2eae-4a5b-9ebb-695c34d744d7",
  "code": "317425",
  "device_ref": "sandbox-25520"
}
```

```json
{
  "session_id": "28030504-f322-4120-ad65-71ff4820dc8c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3ODAzMSwiaWF0IjoxNzkzMzc3MTMxLCJqdGkiOiJmZWYyZWY1OS01M2UwLTRiZjYtYmQzYy1jNTE1NjEzOWZlMmIiLCJzaWQiOiIyODAzMDUwNC1mMzIyLTQxMjAtYWQ2NS03MWZmNDgyMGRjOGMifQ.F5asuzq6XL_epQZ8SUVg6HqGyAL4XEJ46pVD3KNyNrk",
  "access_expires_at": "2026-10-30T16:33:51.822001754Z",
  "refresh_token": "KMM_VtHIvG2ReVlpI-vURV2XfgzqtRlo5jNKy3ehLvc",
  "refresh_expires_at": "2026-11-29T16:18:51.821358857Z",
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
  "command_id": "8edccc3b-76b6-43ef-81ce-9970763c5713",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:18:52Z",
    "sequence": 1793377132366
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "e87137ee-6a81-43fb-9295-12f265c757bf",
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
  "last_heartbeat_at": "2026-10-30T16:18:52.38207Z",
  "last_location_at": "2026-10-30T16:18:52.38207Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "ca127164-efb5-429e-930b-ebc6c7f6056c",
      "short_number": 32,
      "pickup_at": "2026-10-30T19:18:49Z",
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

`POST /api/driver/v1/preorders/ca127164-efb5-429e-930b-ebc6c7f6056c/reserve` → **200**

```json
{
  "command_id": "b2d2db9e-cb13-444f-91f4-8e9fc122892c"
}
```

```json
{
  "id": "94113368-15be-4e1f-ae06-62bddd265f96",
  "state": "RESERVED",
  "order": {
    "order_id": "ca127164-efb5-429e-930b-ebc6c7f6056c",
    "short_number": 32,
    "pickup_at": "2026-10-30T19:18:49Z",
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
  "reserved_at": "2026-10-30T16:18:52.922688Z",
  "confirm_from": "2026-10-30T18:48:49Z",
  "confirm_until": "2026-10-30T18:58:49Z",
  "drop_until": "2026-10-30T18:18:49Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "94113368-15be-4e1f-ae06-62bddd265f96",
      "state": "RESERVED",
      "order": {
        "order_id": "ca127164-efb5-429e-930b-ebc6c7f6056c",
        "short_number": 32,
        "pickup_at": "2026-10-30T19:18:49Z",
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
      "reserved_at": "2026-10-30T16:18:52.922688Z",
      "confirm_from": "2026-10-30T18:48:49Z",
      "confirm_until": "2026-10-30T18:58:49Z",
      "drop_until": "2026-10-30T18:18:49Z"
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
      "id": "94113368-15be-4e1f-ae06-62bddd265f96",
      "state": "RESERVED",
      "order": {
        "order_id": "ca127164-efb5-429e-930b-ebc6c7f6056c",
        "short_number": 32,
        "pickup_at": "2026-10-30T19:18:49Z",
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
      "reserved_at": "2026-10-30T16:18:52.922688Z",
      "confirm_from": "2026-10-30T18:48:49Z",
      "confirm_until": "2026-10-30T18:58:49Z",
      "drop_until": "2026-10-30T18:18:49Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/94113368-15be-4e1f-ae06-62bddd265f96/confirm` → **409**

```json
{
  "command_id": "667542f0-85b2-47fe-93e6-340ee1c1d3d9"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/94113368-15be-4e1f-ae06-62bddd265f96/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "68e10dfd-079f-455d-8d6e-0e399d6ba85b"
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
  "session_id": "a7e6b943-03be-492d-9ee1-98f788c4b047",
  "subject": {
    "type": "STAFF",
    "id": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NTM4N2IzNC1lN2M5LTRhZmYtOTNjMS0wZGQzZjJhY2QwOGYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzgwMzQsImlhdCI6MTc5MzM3NzEzNCwianRpIjoiMWNlMDQ3N2QtMjVjNC00Yzk2LWI4NGItNjcyYWFiMjkzZWNjIiwic2lkIjoiYTdlNmI5NDMtMDNiZS00OTJkLTllZTEtOThmNzg4YzRiMDQ3In0.6QLRC_7ey4lTyVg6zCNb5_4ygLj1uANrlFovuDI9HjY",
  "access_expires_at": "2026-10-30T16:33:54.3295333Z",
  "refresh_token": "_si8auHjSFd2clfmSt0FDDYFT5_0xWndjKUn4U_m8AQ",
  "refresh_expires_at": "2026-10-31T04:18:54.329039994Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/ca127164-efb5-429e-930b-ebc6c7f6056c` → **200**

```json
{
  "id": "ca127164-efb5-429e-930b-ebc6c7f6056c",
  "short_number": 32,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "8f8f04f9-5140-4b5c-9e35-60991e4e6e5a",
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
  "created_at": "2026-10-30T16:18:51.254339Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-30T19:18:49Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "94113368-15be-4e1f-ae06-62bddd265f96",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-30T16:18:52.922688Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/ca127164-efb5-429e-930b-ebc6c7f6056c/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-30T16:18:51.255476Z",
      "actor": {
        "type": "CLIENT",
        "id": "8f8f04f9-5140-4b5c-9e35-60991e4e6e5a",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "ca127164-efb5-429e-930b-ebc6c7f6056c",
        "preorder": true,
        "quote_id": "4a264f10-0224-4f58-9b0d-0d0bb3354bca",
        "pickup_at": "2026-10-30T19:18:49Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "df5659d1-97d2-4307-9aed-1bd77fb6e23a"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-30T16:18:52.923825Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "ca127164-efb5-429e-930b-ebc6c7f6056c",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "94113368-15be-4e1f-ae06-62bddd265f96"
      },
      "correlation_id": "123c2d9a-7f97-4b32-aa56-83b80b26fc1b"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order ca127164-efb5-429e-930b-ebc6c7f6056c, reservation 94113368-15be-4e1f-ae06-62bddd265f96.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-20691"
}
```

```json
{
  "challenge_id": "58c791ad-2c57-498d-86cd-0ef4c65f67b5",
  "expires_at": "2026-10-30T16:23:55.175352753Z",
  "resend_available_at": "2026-10-30T16:18:56.175352753Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "517450",
  "sent_at": "2026-10-30T16:18:55.177568766Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "58c791ad-2c57-498d-86cd-0ef4c65f67b5",
  "code": "517450",
  "device_ref": "sandbox-20691"
}
```

```json
{
  "session_id": "8c522529-3613-4361-8907-c8096d456744",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3ODAzNSwiaWF0IjoxNzkzMzc3MTM1LCJqdGkiOiJlM2FmN2U2Ny05YjMzLTRkMWQtYTNhNS0zMDNkNGU0ODgxMTYiLCJzaWQiOiI4YzUyMjUyOS0zNjEzLTQzNjEtODkwNy1jODA5NmQ0NTY3NDQifQ.Tx3hSBdngn92RN6gW0BisAsXhaXjEdAm-G4vW-l7KCE",
  "access_expires_at": "2026-10-30T16:33:55.464524285Z",
  "refresh_token": "R5lfZunjo26AP66DVEEWMHqiX5W8tMRw73kunLQpzW8",
  "refresh_expires_at": "2026-11-29T16:18:55.463886507Z",
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
  "command_id": "235d1e1f-2fc8-42e0-9fa6-81d0278db5d5",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:18:56Z",
    "sequence": 1793377136342
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "190a7be9-ad5f-4101-8555-9204212f7143",
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
  "last_heartbeat_at": "2026-10-30T16:18:56.019198Z",
  "last_location_at": "2026-10-30T16:18:56.019198Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674936701",
  "device_ref": "sandbox-28116"
}
```

```json
{
  "challenge_id": "7f40f7d7-17b7-474f-b3b6-862bf69ea90e",
  "expires_at": "2026-10-30T16:23:56.280764713Z",
  "resend_available_at": "2026-10-30T16:18:57.280764713Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380674936701` → **200**

```json
{
  "phone": "+380674936701",
  "audience": "CLIENT",
  "code": "392746",
  "sent_at": "2026-10-30T16:18:56.283396036Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7f40f7d7-17b7-474f-b3b6-862bf69ea90e",
  "code": "392746",
  "device_ref": "sandbox-28116"
}
```

```json
{
  "session_id": "fd47e1f1-0608-49f9-9472-bccedef0a71a",
  "subject": {
    "type": "CLIENT",
    "id": "b71b9f39-12e2-4aa7-b2aa-f112555f78fe"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNzFiOWYzOS0xMmUyLTRhYTctYjJhYS1mMTEyNTU1Zjc4ZmUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc4MDM2LCJpYXQiOjE3OTMzNzcxMzYsImp0aSI6ImQyMDFjNWM0LTU2ZTItNGVjMC1hZDRlLTA0MTRiZGZmMmM0MCIsInNpZCI6ImZkNDdlMWYxLTA2MDgtNDlmOS05NDcyLWJjY2VkZWYwYTcxYSJ9.xnp20xPhTJhJTwRvoLBetnMxjNtIzhYxWAJC5AvKDNo",
  "access_expires_at": "2026-10-30T16:33:56.575773414Z",
  "refresh_token": "-uZhj7bDkXQukXb5O1YL3i71p2xSGoTHPU-YHJs8AWk",
  "refresh_expires_at": "2026-11-29T16:18:56.575256317Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "2b423b6f-f529-4ba1-aaef-2b825df17d14",
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
  "id": "b265951a-9f06-41d7-8fbf-3cd9b40408f2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T16:23:56.852977Z",
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
  "command_id": "2a668026-1cc4-43f6-aa9e-a6b351665cbb",
  "quote_id": "b265951a-9f06-41d7-8fbf-3cd9b40408f2",
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
  "id": "028c2438-c10c-4b36-b6a0-0e7ed1cd63c3",
  "short_number": 33,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b71b9f39-12e2-4aa7-b2aa-f112555f78fe",
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
  "created_at": "2026-10-30T16:18:57.125498Z",
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
    "id": "c329adee-82bd-4630-997c-6444baf88da7",
    "order_id": "028c2438-c10c-4b36-b6a0-0e7ed1cd63c3",
    "expires_at": "2026-10-30T16:19:12.128378Z",
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

`POST /api/driver/v1/offers/c329adee-82bd-4630-997c-6444baf88da7/accept` → **200**

```json
{
  "command_id": "935a3eb7-c76d-4561-ba03-d1008f65c803"
}
```

```json
{
  "id": "12777240-bdee-45d0-a9c5-8bea4f8468f5",
  "order_id": "028c2438-c10c-4b36-b6a0-0e7ed1cd63c3",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "6db17c99-f1e3-4ea8-8338-c36acaefa070",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "6db17c99-f1e3-4ea8-8338-c36acaefa070",
  "order_id": "028c2438-c10c-4b36-b6a0-0e7ed1cd63c3",
  "assignment_id": "12777240-bdee-45d0-a9c5-8bea4f8468f5",
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

`POST /api/driver/v1/work-sessions/190a7be9-ad5f-4101-8555-9204212f7143/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:18:58Z",
    "sequence": 1793377138234
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "190a7be9-ad5f-4101-8555-9204212f7143",
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
  "last_heartbeat_at": "2026-10-30T16:18:58.250507Z",
  "last_location_at": "2026-10-30T16:18:58.250507Z",
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
  "id": "6db17c99-f1e3-4ea8-8338-c36acaefa070",
  "order_id": "028c2438-c10c-4b36-b6a0-0e7ed1cd63c3",
  "assignment_id": "12777240-bdee-45d0-a9c5-8bea4f8468f5",
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

`POST /api/driver/v1/trips/6db17c99-f1e3-4ea8-8338-c36acaefa070/arrive` → **200**

```json
{
  "command_id": "176984d2-9983-4b3f-bc84-4f3d77319cc4",
  "expected_version": 0
}
```

```json
{
  "id": "6db17c99-f1e3-4ea8-8338-c36acaefa070",
  "order_id": "028c2438-c10c-4b36-b6a0-0e7ed1cd63c3",
  "assignment_id": "12777240-bdee-45d0-a9c5-8bea4f8468f5",
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
  "arrived_at": "2026-10-30T16:18:58.780895Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/6db17c99-f1e3-4ea8-8338-c36acaefa070/start` → **200**

```json
{
  "command_id": "09bde67e-51b2-4c7b-8333-7d4f5cb620d2",
  "expected_version": 1
}
```

```json
{
  "id": "6db17c99-f1e3-4ea8-8338-c36acaefa070",
  "order_id": "028c2438-c10c-4b36-b6a0-0e7ed1cd63c3",
  "assignment_id": "12777240-bdee-45d0-a9c5-8bea4f8468f5",
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
  "arrived_at": "2026-10-30T16:18:58.780895Z",
  "started_at": "2026-10-30T16:18:59.067415Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

(the car drives 48 s to the next point)

`POST /api/driver/v1/work-sessions/190a7be9-ad5f-4101-8555-9204212f7143/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:19:47Z",
    "sequence": 1793377187353
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "190a7be9-ad5f-4101-8555-9204212f7143",
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
  "last_heartbeat_at": "2026-10-30T16:19:47.370374Z",
  "last_location_at": "2026-10-30T16:19:47.370374Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/6db17c99-f1e3-4ea8-8338-c36acaefa070/complete` → **200**

```json
{
  "command_id": "8f1259b2-73cd-443f-b7d5-f06b45ed2999",
  "expected_version": 2,
  "reported_at": "2026-10-30T16:19:47Z",
  "cash_received": true
}
```

```json
{
  "id": "6db17c99-f1e3-4ea8-8338-c36acaefa070",
  "order_id": "028c2438-c10c-4b36-b6a0-0e7ed1cd63c3",
  "assignment_id": "12777240-bdee-45d0-a9c5-8bea4f8468f5",
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
  "arrived_at": "2026-10-30T16:18:58.780895Z",
  "started_at": "2026-10-30T16:18:59.067415Z",
  "completed_at": "2026-10-30T16:19:47.642593Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/028c2438-c10c-4b36-b6a0-0e7ed1cd63c3/rating` → **200**

```json
{
  "command_id": "971705b8-613b-41a8-ab4c-29e13f91a7f3",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "028c2438-c10c-4b36-b6a0-0e7ed1cd63c3",
  "score": 5,
  "created_at": "2026-10-30T16:19:47.930049408Z"
}
```

`POST /api/driver/v1/orders/028c2438-c10c-4b36-b6a0-0e7ed1cd63c3/rating` → **200**

```json
{
  "command_id": "98487c3e-acb8-478d-a1e0-b2882ae07855",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "028c2438-c10c-4b36-b6a0-0e7ed1cd63c3",
  "score": 4,
  "created_at": "2026-10-30T16:19:48.208274522Z"
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
  "session_id": "86de601f-4d06-468e-b290-7ba21ff967f3",
  "subject": {
    "type": "STAFF",
    "id": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NTM4N2IzNC1lN2M5LTRhZmYtOTNjMS0wZGQzZjJhY2QwOGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzgwODksImlhdCI6MTc5MzM3NzE4OSwianRpIjoiNzVhMWIwNzgtMDQ5MC00NmY5LWFjOTEtZGY1ZDA0YzM2MmQyIiwic2lkIjoiODZkZTYwMWYtNGQwNi00NjhlLWIyOTAtN2JhMjFmZjk2N2YzIn0.nwdOpGX8gqtU8D9ACfnO7yxAylZsPskvAHEavDRkaqA",
  "access_expires_at": "2026-10-30T16:34:49.041743305Z",
  "refresh_token": "SNg98yzCMfX4N8yXc5hgxrFqUeqv6qg1BkQQUwbH8Fk",
  "refresh_expires_at": "2026-10-31T04:19:49.041213148Z",
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
  "session_id": "a45c401f-2f5b-4df2-b733-84cd2991fcff",
  "subject": {
    "type": "STAFF",
    "id": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NTM4N2IzNC1lN2M5LTRhZmYtOTNjMS0wZGQzZjJhY2QwOGYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzgwODksImlhdCI6MTc5MzM3NzE4OSwianRpIjoiZjUyMWEzNTYtYzFmNy00YzZhLWE5OWQtNDZhNzc2MDQyY2VhIiwic2lkIjoiYTQ1YzQwMWYtMmY1Yi00ZGYyLWI3MzMtODRjZDI5OTFmY2ZmIn0.pl7_3O2OWE_1_GQ0LQfqjVBnSANDnrBP5psDkHcw2tA",
  "access_expires_at": "2026-10-30T16:34:49.616365991Z",
  "refresh_token": "7xMQiiriwyxcvdJLLtfFMpPgcJ7wj1JilWL-3JhNGCA",
  "refresh_expires_at": "2026-10-31T04:19:49.615902621Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/028c2438-c10c-4b36-b6a0-0e7ed1cd63c3/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "028c2438-c10c-4b36-b6a0-0e7ed1cd63c3",
      "author_type": "RIDER",
      "author_id": "b71b9f39-12e2-4aa7-b2aa-f112555f78fe",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-30T16:19:47.930049Z"
    },
    {
      "order_id": "028c2438-c10c-4b36-b6a0-0e7ed1cd63c3",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "b71b9f39-12e2-4aa7-b2aa-f112555f78fe",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-30T16:19:48.208275Z"
    }
  ]
}
```

Done: ratings for order 028c2438-c10c-4b36-b6a0-0e7ed1cd63c3.

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
  "session_id": "435c9d00-f192-4720-ab05-5616d917fdce",
  "subject": {
    "type": "STAFF",
    "id": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NTM4N2IzNC1lN2M5LTRhZmYtOTNjMS0wZGQzZjJhY2QwOGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzgwOTAsImlhdCI6MTc5MzM3NzE5MCwianRpIjoiMjYwZmE4MzEtNmQ3Zi00MDE4LTgzNjctZDViMDhlNDEwMjk0Iiwic2lkIjoiNDM1YzlkMDAtZjE5Mi00NzIwLWFiMDUtNTYxNmQ5MTdmZGNlIn0.9-EQ1d3Rgn2IB6J7QUoRQ6DZgAPRltW9Ghzs4APT_XU",
  "access_expires_at": "2026-10-30T16:34:50.465534808Z",
  "refresh_token": "PnqPCOoB6ABkvLmyOXJ7g1K2kcgGxY-D5DoQYYbTm7w",
  "refresh_expires_at": "2026-10-31T04:19:50.465021007Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "c76a8267-1406-40fc-b30d-ff59f3575de7",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "1458f809-03ce-4ff8-b31f-81e8398447da",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T16:19:50.750316Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/1458f809-03ce-4ff8-b31f-81e8398447da` → **200**

```json
{
  "id": "1458f809-03ce-4ff8-b31f-81e8398447da",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T16:19:50.750316Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/1458f809-03ce-4ff8-b31f-81e8398447da` → **200**

```json
{
  "id": "1458f809-03ce-4ff8-b31f-81e8398447da",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T16:19:50.750316Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/1458f809-03ce-4ff8-b31f-81e8398447da` → **200**

```json
{
  "id": "1458f809-03ce-4ff8-b31f-81e8398447da",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-30.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-30T16:19:50.750316Z",
  "ready_at": "2026-10-30T16:19:53.304825Z",
  "expires_at": "2026-10-31T16:19:53.304825Z"
}
```

`GET /api/admin/v1/reports/exports/1458f809-03ce-4ff8-b31f-81e8398447da/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-30,31,11,20,0,0,26,5,0,28,2,0,1,7,1,12
total,31,11,20,0,0,26,5,0,28,2,0,1,7,1,12
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "62b4f0ef-43d6-43d7-813d-261f0f2a0767",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "382b46f6-6afd-4327-9f5c-8ce06629feec",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T16:19:53.861858Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/382b46f6-6afd-4327-9f5c-8ce06629feec` → **200**

```json
{
  "id": "382b46f6-6afd-4327-9f5c-8ce06629feec",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T16:19:53.861858Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/382b46f6-6afd-4327-9f5c-8ce06629feec` → **200**

```json
{
  "id": "382b46f6-6afd-4327-9f5c-8ce06629feec",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T16:19:53.861858Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/382b46f6-6afd-4327-9f5c-8ce06629feec` → **200**

```json
{
  "id": "382b46f6-6afd-4327-9f5c-8ce06629feec",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T16:19:53.861858Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/382b46f6-6afd-4327-9f5c-8ce06629feec` → **200**

```json
{
  "id": "382b46f6-6afd-4327-9f5c-8ce06629feec",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T16:19:53.861858Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/382b46f6-6afd-4327-9f5c-8ce06629feec` → **200**

```json
{
  "id": "382b46f6-6afd-4327-9f5c-8ce06629feec",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-30.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-30T16:19:53.861858Z",
  "ready_at": "2026-10-30T16:19:58.312656Z",
  "expires_at": "2026-10-31T16:19:58.312656Z"
}
```

`GET /api/admin/v1/reports/exports/382b46f6-6afd-4327-9f5c-8ce06629feec/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-30,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
total,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/5be098a1-bd6a-412f-8244-5516e69e44b3` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/5be098a1-bd6a-412f-8244-5516e69e44b3",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "b39beabb-4a9b-421b-b889-44681217420f"
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
  "session_id": "11e3d92d-739b-482a-8bc8-077d35c48397",
  "subject": {
    "type": "STAFF",
    "id": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NTM4N2IzNC1lN2M5LTRhZmYtOTNjMS0wZGQzZjJhY2QwOGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzgxMDAsImlhdCI6MTc5MzM3NzIwMCwianRpIjoiNzkwYzA4ZDUtYWY5My00OTczLWI1ZDAtMGVlODY5M2JlOTRjIiwic2lkIjoiMTFlM2Q5MmQtNzM5Yi00ODJhLThiYzgtMDc3ZDM1YzQ4Mzk3In0.KjX1ec2nE2oSh2vpfnFpxkw7pY9XWi0Ya5exyqFQgHs",
  "access_expires_at": "2026-10-30T16:35:00.069967859Z",
  "refresh_token": "uHHOntnLXjW_2182jWNh1gbbHIOtAuOevZoC1w9QcnE",
  "refresh_expires_at": "2026-10-31T04:20:00.069463602Z",
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
  "command_id": "989b7b95-00f6-4ae3-a690-58004796f9ec",
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
  "changed_by": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f",
  "reason": "Sandbox retention boundary",
  "changed_at": "2026-10-30T16:20:00.618496798Z"
}
```

`POST /sandbox/v1/retention/fixtures/dcf37c86-f8d6-496f-89d2-d30627629a52` → **200**

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

`GET /sandbox/v1/retention/fixtures/dcf37c86-f8d6-496f-89d2-d30627629a52` → **200**

```json
{
  "old_done": 0,
  "recent_done": 1,
  "failed": 1
}
```

Old DONE event removed; recent DONE and old FAILED events retained. Policy and synthetic fixtures restored on exit.

`DELETE /sandbox/v1/retention/fixtures/dcf37c86-f8d6-496f-89d2-d30627629a52` → **204**

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
  "changed_by": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f",
  "reason": "Sandbox retention boundary",
  "changed_at": "2026-10-30T16:20:00.618497Z"
}
```

`PUT /api/admin/v1/retention` → **200**

```json
{
  "command_id": "db41bd04-5b7a-4c72-9a59-ddb2b3d875c1",
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
  "changed_by": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f",
  "reason": "Restore policy after retention sandbox",
  "changed_at": "2026-10-30T16:20:01.277473941Z"
}
```

# Scenario: risk-flag

## The driver starts a new shift in Kyiv

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-27775"
}
```

```json
{
  "challenge_id": "dc7eb031-616f-4f85-af50-8ea9cd1b35a3",
  "expires_at": "2026-10-30T16:25:01.552275443Z",
  "resend_available_at": "2026-10-30T16:20:02.552275443Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "739340",
  "sent_at": "2026-10-30T16:20:01.554755997Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "dc7eb031-616f-4f85-af50-8ea9cd1b35a3",
  "code": "739340",
  "device_ref": "sandbox-27775"
}
```

```json
{
  "session_id": "1ff05a6d-aef7-4f6b-855e-5f495f7ddf5d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3ODEwMSwiaWF0IjoxNzkzMzc3MjAxLCJqdGkiOiJlODhhOTI5ZS05MmFkLTRiMzYtODhmNi01ZWMwNWNkYmY4OGIiLCJzaWQiOiIxZmYwNWE2ZC1hZWY3LTRmNmItODU1ZS01ZjQ5NWY3ZGRmNWQifQ.lT2L-t-FyvE5BWEJAP8Wiw47ocGFM60IuhCcWdyDwu8",
  "access_expires_at": "2026-10-30T16:35:01.842186431Z",
  "refresh_token": "j9ixP0O9zxmUfYDHSb_wIDWf3Wr9DUlSg0GwNuJPVxk",
  "refresh_expires_at": "2026-11-29T16:20:01.841655605Z",
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
  "command_id": "9d0da63b-db2d-43bd-a300-8e162dd03c72",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:20:02Z",
    "sequence": 1793377202649
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "91c7471a-49d7-4618-aa93-7d61e1a675e5",
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
  "last_heartbeat_at": "2026-10-30T16:20:02.664426Z",
  "last_location_at": "2026-10-30T16:20:02.664426Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "5c945bfa-0c75-43d6-b058-f40fd038017f",
  "points": [
    {
      "sequence": 1793377204934,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-30T16:19:04Z"
    },
    {
      "sequence": 1793377204941,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-30T16:20:04Z"
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
  "session_id": "0ae63580-329d-4044-bd6e-4ca1ec5b1457",
  "subject": {
    "type": "STAFF",
    "id": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NTM4N2IzNC1lN2M5LTRhZmYtOTNjMS0wZGQzZjJhY2QwOGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzgxMDUsImlhdCI6MTc5MzM3NzIwNSwianRpIjoiZmFmNzdlODctN2NhZC00ODdlLTg4MmQtYTgwNDBmY2Q2NTQ0Iiwic2lkIjoiMGFlNjM1ODAtMzI5ZC00MDQ0LWJkNmUtNGNhMWVjNWIxNDU3In0.uBn4lzmNfpKMsYWp9L5codQZLz5HTr9yLQjEQN-WGDw",
  "access_expires_at": "2026-10-30T16:35:05.565430435Z",
  "refresh_token": "hj2J-qPcYmozIlNhred6J5NkTkE3miNS4G5LWrgUAdo",
  "refresh_expires_at": "2026-10-31T04:20:05.56499227Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "bcf05e6b-e104-4679-838f-1f9a04ca8dfa",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-30T16:20:04Z",
        "track_point_id": "78597214-b908-4e3e-b058-dd799750b934",
        "work_session_id": "91c7471a-49d7-4618-aa93-7d61e1a675e5"
      },
      "raised_by": null,
      "raised_at": "2026-10-30T16:20:04Z",
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

## Support confirms it with a reason — once

`POST /api/admin/v1/driver-risk-flags/bcf05e6b-e104-4679-838f-1f9a04ca8dfa/confirm` → **200**

```json
{
  "command_id": "992162f8-e0fe-4b95-b227-e7ef307e42f1",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "bcf05e6b-e104-4679-838f-1f9a04ca8dfa",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-30T16:20:04Z",
    "track_point_id": "78597214-b908-4e3e-b058-dd799750b934",
    "work_session_id": "91c7471a-49d7-4618-aa93-7d61e1a675e5"
  },
  "raised_by": null,
  "raised_at": "2026-10-30T16:20:04Z",
  "reason": null,
  "reviewed_by": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f",
  "reviewed_at": "2026-10-30T16:20:06.396939Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/bcf05e6b-e104-4679-838f-1f9a04ca8dfa/dismiss` → **409**

```json
{
  "command_id": "54bc1897-10af-4232-a65e-d94c1383cea1",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/bcf05e6b-e104-4679-838f-1f9a04ca8dfa/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "4b4b4cbd-8824-4eec-a254-1338d6fbe5b1"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "13a234ec-4237-4afd-961a-386b039155ad",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "c0a4176a-94ba-4949-979b-b7490f14befd",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f",
  "raised_at": "2026-10-30T16:20:06.961922Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/c0a4176a-94ba-4949-979b-b7490f14befd/dismiss` → **200**

```json
{
  "command_id": "2acca7eb-f717-4d46-b8fa-39c59bdf7151",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "c0a4176a-94ba-4949-979b-b7490f14befd",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f",
  "raised_at": "2026-10-30T16:20:06.961922Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f",
  "reviewed_at": "2026-10-30T16:20:07.233411Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "d3906622-aba8-4ce8-b92e-36297999c114",
  "expected_version": 12,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "bcf05e6b-e104-4679-838f-1f9a04ca8dfa"
}
```

```json
{
  "id": "5a000000-0000-4000-8000-000000000403",
  "name": "Андрій Шевчук",
  "language": "ru",
  "review_status": "SUSPENDED",
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

`GET /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403` → **200**

```json
{
  "profile": {
    "id": "5a000000-0000-4000-8000-000000000403",
    "name": "Андрій Шевчук",
    "language": "ru",
    "review_status": "SUSPENDED",
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
  },
  "phone": "+380500000003",
  "history": [
    {
      "from": "APPROVED",
      "to": "SUSPENDED",
      "actor_type": "STAFF",
      "actor_id": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T16:20:07.511553Z"
    }
  ],
  "duplicates": []
}
```

Done: flag bcf05e6b-e104-4679-838f-1f9a04ca8dfa confirmed, suspension named it, driver reinstated.

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
  "session_id": "3390543e-1d12-4270-98ae-de35f435d082",
  "subject": {
    "type": "STAFF",
    "id": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NTM4N2IzNC1lN2M5LTRhZmYtOTNjMS0wZGQzZjJhY2QwOGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzgxMDgsImlhdCI6MTc5MzM3NzIwOCwianRpIjoiYjdkYWQzZjctM2RjNC00ZWU5LTliMjAtN2M4YjYxMDZiNGJlIiwic2lkIjoiMzM5MDU0M2UtMWQxMi00MjcwLTk4YWUtZGUzNWY0MzVkMDgyIn0.KRFO-CU4yxWyIQsWWaz9NCW3rC3sJLMmwB6MLo9feTg",
  "access_expires_at": "2026-10-30T16:35:08.352906595Z",
  "refresh_token": "9T4ma1KQjUfRWrg5I3zWuuwhF9POrE9SUYCNYFbp25g",
  "refresh_expires_at": "2026-10-31T04:20:08.352458096Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403` → **200**

```json
{
  "profile": {
    "id": "5a000000-0000-4000-8000-000000000403",
    "name": "Андрій Шевчук",
    "language": "ru",
    "review_status": "SUSPENDED",
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
  },
  "phone": "+380500000003",
  "history": [
    {
      "from": "APPROVED",
      "to": "SUSPENDED",
      "actor_type": "STAFF",
      "actor_id": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T16:20:07.511553Z"
    }
  ],
  "duplicates": []
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "feff6339-02a9-4032-b335-b052059d915a",
  "expected_version": 13,
  "reason": "Sandbox clean-up"
}
```

```json
{
  "id": "5a000000-0000-4000-8000-000000000403",
  "name": "Андрій Шевчук",
  "language": "ru",
  "review_status": "APPROVED",
  "version": 14,
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
  "session_id": "91c7471a-49d7-4618-aa93-7d61e1a675e5",
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
  "last_heartbeat_at": "2026-10-30T16:20:02.664426Z",
  "last_location_at": "2026-10-30T16:20:02.664426Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/91c7471a-49d7-4618-aa93-7d61e1a675e5/close` → **200**

```json
{
  "command_id": "599d6be6-7317-45f0-9363-0e19b93ea601",
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
  "session_id": "d1fc2f5e-638f-4af2-acbc-acfa6835baf1",
  "subject": {
    "type": "STAFF",
    "id": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NTM4N2IzNC1lN2M5LTRhZmYtOTNjMS0wZGQzZjJhY2QwOGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzgxMTAsImlhdCI6MTc5MzM3NzIxMCwianRpIjoiNzU5NWFlNmYtMDgwNS00MjUxLTg4NmMtMjg0ZGRkYTcwYjIxIiwic2lkIjoiZDFmYzJmNWUtNjM4Zi00YWYyLWFjYmMtYWNmYTY4MzViYWYxIn0.yDVd5Nq1w4ChStuYN6KInZdMOm3wtzvaF9JdVgw2DpI",
  "access_expires_at": "2026-10-30T16:35:10.015576898Z",
  "refresh_token": "oaZKZ_SWv3aurpmFCIn3RO_n8S3slB8fcX4G_K36Y_c",
  "refresh_expires_at": "2026-10-31T04:20:10.015069481Z",
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
  "command_id": "a1719a33-fa15-41ad-b450-582d95d230b0",
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
  "changed_by": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T16:20:10.56764Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "a1719a33-fa15-41ad-b450-582d95d230b0",
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
  "changed_by": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T16:20:10.56764Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48905232705",
  "device_ref": "sandbox-3072"
}
```

```json
{
  "challenge_id": "20ba0f53-7288-462a-8abf-9003f4525c7a",
  "expires_at": "2026-10-30T16:25:11.129129992Z",
  "resend_available_at": "2026-10-30T16:20:12.129129992Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48905232705` → **200**

```json
{
  "phone": "+48905232705",
  "audience": "CLIENT",
  "code": "749079",
  "sent_at": "2026-10-30T16:20:11.131750269Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "20ba0f53-7288-462a-8abf-9003f4525c7a",
  "code": "749079",
  "device_ref": "sandbox-3072"
}
```

```json
{
  "session_id": "3ae949fa-cbfa-44cc-be33-9ef16478ecc0",
  "subject": {
    "type": "CLIENT",
    "id": "9bbf13ee-328a-4920-a6ec-01c13747029c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YmJmMTNlZS0zMjhhLTQ5MjAtYTZlYy0wMWMxMzc0NzAyOWMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc4MTExLCJpYXQiOjE3OTMzNzcyMTEsImp0aSI6Ijg3YWIzN2FhLWRhZjEtNDc3Ny05MWVmLTk5ZjBiMjVmMTVjYyIsInNpZCI6IjNhZTk0OWZhLWNiZmEtNDRjYy1iZTMzLTllZjE2NDc4ZWNjMCJ9.HZVD1_-8puWTHwlVijYLce5lktdNZVr_0iwUd3XqQPI",
  "access_expires_at": "2026-10-30T16:35:11.424339806Z",
  "refresh_token": "bCFl74UtAx4aogkeaV-Qn-FxpjxoUksO-ZLhz2p7dF0",
  "refresh_expires_at": "2026-11-29T16:20:11.423858552Z",
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
  "correlation_id": "ba2d8239-56d5-4634-b7ae-c2c36e13d867"
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
  "device_ref": "sandbox-17557"
}
```

```json
{
  "challenge_id": "3857355f-4e51-47e7-aca1-90ec122bf926",
  "expires_at": "2026-10-30T16:25:12.247440515Z",
  "resend_available_at": "2026-10-30T16:20:13.247440515Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "693104",
  "sent_at": "2026-10-30T16:20:12.249933697Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3857355f-4e51-47e7-aca1-90ec122bf926",
  "code": "693104",
  "device_ref": "sandbox-17557"
}
```

```json
{
  "session_id": "7cab4c1b-0df3-456c-baac-19ed79764dff",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3ODExMiwiaWF0IjoxNzkzMzc3MjEyLCJqdGkiOiI2MjljYTY5YS0zMGNiLTQwMDItYjZmZS1hN2VmODI4MDAwN2UiLCJzaWQiOiI3Y2FiNGMxYi0wZGYzLTQ1NmMtYmFhYy0xOWVkNzk3NjRkZmYifQ.Go7Wv130I3IZL9buxiCrTR8I2edHt_gIea5SX1uQauI",
  "access_expires_at": "2026-10-30T16:35:12.542620407Z",
  "refresh_token": "POptbXR-iGEjZBVIcIGOaRtnXwsXR7HObkabj-kw7Cc",
  "refresh_expires_at": "2026-11-29T16:20:12.542043061Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "e87137ee-6a81-43fb-9295-12f265c757bf",
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
  "last_heartbeat_at": "2026-10-30T16:18:52.38207Z",
  "last_location_at": "2026-10-30T16:18:52.38207Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/e87137ee-6a81-43fb-9295-12f265c757bf/handover` → **200**

```json
{
  "command_id": "96748541-f94b-43ed-b73b-2a211f843fab",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "e87137ee-6a81-43fb-9295-12f265c757bf",
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
  "last_heartbeat_at": "2026-10-30T16:18:52.38207Z",
  "last_location_at": "2026-10-30T16:18:52.38207Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/e87137ee-6a81-43fb-9295-12f265c757bf/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:20:13Z",
    "sequence": 1793377213355
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "e87137ee-6a81-43fb-9295-12f265c757bf",
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
  "last_heartbeat_at": "2026-10-30T16:20:13.370824Z",
  "last_location_at": "2026-10-30T16:20:13.370824Z",
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
  "session_id": "e87137ee-6a81-43fb-9295-12f265c757bf",
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
  "last_heartbeat_at": "2026-10-30T16:20:13.370824Z",
  "last_location_at": "2026-10-30T16:20:13.370824Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e87137ee-6a81-43fb-9295-12f265c757bf/close` → **200**

```json
{
  "command_id": "24e5e986-fe0e-4ef3-8fd3-d044fedab2c5",
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
  "correlation_id": "582bad16-27d7-407b-9146-433debf363fb"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678636912",
  "device_ref": "sandbox-363"
}
```

```json
{
  "challenge_id": "63c2cec4-5561-4d8e-97bc-a85ae1f0ec1d",
  "expires_at": "2026-10-30T16:25:14.741138742Z",
  "resend_available_at": "2026-10-30T16:20:15.741138742Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380678636912` → **200**

```json
{
  "phone": "+380678636912",
  "audience": "CLIENT",
  "code": "974234",
  "sent_at": "2026-10-30T16:20:14.743515838Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "63c2cec4-5561-4d8e-97bc-a85ae1f0ec1d",
  "code": "974234",
  "device_ref": "sandbox-363"
}
```

```json
{
  "session_id": "f3d2cc35-be4c-4500-a171-a993f2960de0",
  "subject": {
    "type": "CLIENT",
    "id": "953c74c3-4a8d-4d52-84a9-0c9347779c3d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NTNjNzRjMy00YThkLTRkNTItODRhOS0wYzkzNDc3NzljM2QiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc4MTE1LCJpYXQiOjE3OTMzNzcyMTUsImp0aSI6IjgwYTJlODQzLTlkNzQtNDY2MS05NTMxLTJkYWE2YTc1MGVhYSIsInNpZCI6ImYzZDJjYzM1LWJlNGMtNDUwMC1hMTcxLWE5OTNmMjk2MGRlMCJ9.2hRM16JMGOiQ5U4K024H9dzgdh58_d4GrmzmVW0vx9E",
  "access_expires_at": "2026-10-30T16:35:15.034573433Z",
  "refresh_token": "ymjAONb0i-YeqbopzRpQaFFA5LqtYUYvif_psQaFZtQ",
  "refresh_expires_at": "2026-11-29T16:20:15.033931693Z",
  "account_created": true
}
```

## The EICAR antivirus test file is refused by the antivirus

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "4804f696-ff81-4e35-ac85-b7bf5f139752",
  "content_type": "application/pdf",
  "size_bytes": 86
}
```

```json
{
  "file_id": "0ed89670-62af-4e26-b330-1de72681312d",
  "upload_path": "/api/rider/v1/uploads/0ed89670-62af-4e26-b330-1de72681312d",
  "expires_at": "2026-10-30T16:35:15.325657096Z",
  "max_bytes": 86
}
```

`PUT /api/rider/v1/uploads/0ed89670-62af-4e26-b330-1de72681312d` → **200**

```json
{
  "file_id": "0ed89670-62af-4e26-b330-1de72681312d",
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
  "command_id": "4040eac8-2dfe-4054-b06e-9b1cc24f574d",
  "content_type": "application/pdf",
  "size_bytes": 92
}
```

```json
{
  "file_id": "94fbbd1b-5bd7-41cb-a970-ec8f830de2ad",
  "upload_path": "/api/rider/v1/uploads/94fbbd1b-5bd7-41cb-a970-ec8f830de2ad",
  "expires_at": "2026-10-30T16:35:15.617599705Z",
  "max_bytes": 92
}
```

`PUT /api/rider/v1/uploads/94fbbd1b-5bd7-41cb-a970-ec8f830de2ad` → **200**

```json
{
  "file_id": "94fbbd1b-5bd7-41cb-a970-ec8f830de2ad",
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
  "command_id": "c65d7c06-2aaa-4aaa-9596-be7729e543f2",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "099b49c0-6436-499c-bb13-bb42ee938e72",
  "upload_path": "/api/rider/v1/uploads/099b49c0-6436-499c-bb13-bb42ee938e72",
  "expires_at": "2026-10-30T16:35:15.907491865Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/099b49c0-6436-499c-bb13-bb42ee938e72` → **200**

```json
{
  "file_id": "099b49c0-6436-499c-bb13-bb42ee938e72",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "1d3c08c1-c82d-466f-ba1e-f3798253f2b9",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "099b49c0-6436-499c-bb13-bb42ee938e72"
  ]
}
```

```json
{
  "id": "dea86e76-6dcc-4fad-a2aa-484528579d13",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "953c74c3-4a8d-4d52-84a9-0c9347779c3d",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T16:20:16.206725Z",
  "updated_at": "2026-10-30T16:20:16.206725Z",
  "respond_by": "2026-10-30T20:20:16.206725Z",
  "messages": [
    {
      "id": "01e2cbd6-e6a9-4d7a-ba50-d3fc25a7a63a",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "953c74c3-4a8d-4d52-84a9-0c9347779c3d",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T16:20:16.207816Z",
      "attachments": [
        {
          "file_id": "099b49c0-6436-499c-bb13-bb42ee938e72",
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
  "session_id": "fef84d10-0039-4213-b5d9-c1e506494b6e",
  "subject": {
    "type": "STAFF",
    "id": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NTM4N2IzNC1lN2M5LTRhZmYtOTNjMS0wZGQzZjJhY2QwOGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzgxMTYsImlhdCI6MTc5MzM3NzIxNiwianRpIjoiNjRiYzYxN2ItN2Q0Yy00Yjc4LTk2ODYtMDZkNjMyMjFlYzUxIiwic2lkIjoiZmVmODRkMTAtMDAzOS00MjEzLWI1ZDktYzFlNTA2NDk0YjZlIn0.AAXkEKy9Yecbjt9RFp_04DOhdpQv_HnglebVHZK5q10",
  "access_expires_at": "2026-10-30T16:35:16.799878237Z",
  "refresh_token": "-QxPRObJB9KTXMMSzLmGJVxEhoo6iSYez_fNJYvGMd4",
  "refresh_expires_at": "2026-10-31T04:20:16.799415763Z",
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
  "session_id": "620381cd-f842-430d-942f-e2e0f4f44beb",
  "subject": {
    "type": "STAFF",
    "id": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NTM4N2IzNC1lN2M5LTRhZmYtOTNjMS0wZGQzZjJhY2QwOGYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzgxMTcsImlhdCI6MTc5MzM3NzIxNywianRpIjoiMGIxNTk0NTctYWZhOC00MzMyLThkYzYtYzc5NjEzN2RlYjA2Iiwic2lkIjoiNjIwMzgxY2QtZjg0Mi00MzBkLTk0MmYtZTJlMGY0ZjQ0YmViIn0.kYswR_Wt2n4ZXIJZ8pvK-VdUWqQJ5vCeQhIZu6psEpM",
  "access_expires_at": "2026-10-30T16:35:17.359044716Z",
  "refresh_token": "nPE7Aj7Wc3ibQKKApwvfjoBh0giIpcdhxPswJhTSxnA",
  "refresh_expires_at": "2026-10-31T04:20:17.358575048Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/dea86e76-6dcc-4fad-a2aa-484528579d13/attachments/099b49c0-6436-499c-bb13-bb42ee938e72` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "d9becc80-a7ae-489c-aaa1-6a7b839879be",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "f432ad0a-c4ab-423b-bfd9-302e7e6a337c",
  "upload_path": "/api/operator/v1/uploads/f432ad0a-c4ab-423b-bfd9-302e7e6a337c",
  "expires_at": "2026-10-30T16:35:17.640719781Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/f432ad0a-c4ab-423b-bfd9-302e7e6a337c` → **200**

```json
{
  "file_id": "f432ad0a-c4ab-423b-bfd9-302e7e6a337c",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/dea86e76-6dcc-4fad-a2aa-484528579d13` → **200**

```json
{
  "id": "dea86e76-6dcc-4fad-a2aa-484528579d13",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "953c74c3-4a8d-4d52-84a9-0c9347779c3d",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T16:20:16.206725Z",
  "updated_at": "2026-10-30T16:20:16.206725Z",
  "respond_by": "2026-10-30T20:20:16.206725Z",
  "messages": [
    {
      "id": "01e2cbd6-e6a9-4d7a-ba50-d3fc25a7a63a",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "953c74c3-4a8d-4d52-84a9-0c9347779c3d",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T16:20:16.207816Z",
      "attachments": [
        {
          "file_id": "099b49c0-6436-499c-bb13-bb42ee938e72",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/dea86e76-6dcc-4fad-a2aa-484528579d13/comments` → **200**

```json
{
  "command_id": "1a85bb6d-4b49-4fc8-a4b0-63af8f52b7b6",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "f432ad0a-c4ab-423b-bfd9-302e7e6a337c"
  ]
}
```

```json
{
  "id": "dea86e76-6dcc-4fad-a2aa-484528579d13",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "953c74c3-4a8d-4d52-84a9-0c9347779c3d",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T16:20:16.206725Z",
  "updated_at": "2026-10-30T16:20:18.218595Z",
  "respond_by": "2026-10-30T20:20:16.206725Z",
  "messages": [
    {
      "id": "01e2cbd6-e6a9-4d7a-ba50-d3fc25a7a63a",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "953c74c3-4a8d-4d52-84a9-0c9347779c3d",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T16:20:16.207816Z",
      "attachments": [
        {
          "file_id": "099b49c0-6436-499c-bb13-bb42ee938e72",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "b0e100e4-ac9b-46b4-8a27-77eb1b9dcf9d",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T16:20:18.218173Z",
      "attachments": [
        {
          "file_id": "f432ad0a-c4ab-423b-bfd9-302e7e6a337c",
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

`GET /api/rider/v1/support/cases/dea86e76-6dcc-4fad-a2aa-484528579d13` → **200**

```json
{
  "id": "dea86e76-6dcc-4fad-a2aa-484528579d13",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "953c74c3-4a8d-4d52-84a9-0c9347779c3d",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T16:20:16.206725Z",
  "updated_at": "2026-10-30T16:20:18.218595Z",
  "respond_by": "2026-10-30T20:20:16.206725Z",
  "messages": [
    {
      "id": "01e2cbd6-e6a9-4d7a-ba50-d3fc25a7a63a",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "953c74c3-4a8d-4d52-84a9-0c9347779c3d",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T16:20:16.207816Z",
      "attachments": [
        {
          "file_id": "099b49c0-6436-499c-bb13-bb42ee938e72",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "b0e100e4-ac9b-46b4-8a27-77eb1b9dcf9d",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T16:20:18.218173Z",
      "attachments": [
        {
          "file_id": "f432ad0a-c4ab-423b-bfd9-302e7e6a337c",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/dea86e76-6dcc-4fad-a2aa-484528579d13/attachments/f432ad0a-c4ab-423b-bfd9-302e7e6a337c` → **200**

Done: support case dea86e76-6dcc-4fad-a2aa-484528579d13, rider attachment 099b49c0-6436-499c-bb13-bb42ee938e72, operator attachment f432ad0a-c4ab-423b-bfd9-302e7e6a337c.

# Scenario: switch-to-cash

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380734662563",
  "device_ref": "sandbox-9665"
}
```

```json
{
  "challenge_id": "f05b920f-c86f-4299-9284-6add96e6e912",
  "expires_at": "2026-10-30T16:25:18.791330644Z",
  "resend_available_at": "2026-10-30T16:20:19.791330644Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380734662563` → **200**

```json
{
  "phone": "+380734662563",
  "audience": "CLIENT",
  "code": "195303",
  "sent_at": "2026-10-30T16:20:18.793931474Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f05b920f-c86f-4299-9284-6add96e6e912",
  "code": "195303",
  "device_ref": "sandbox-9665"
}
```

```json
{
  "session_id": "148a5850-0c21-46f2-878a-9133ca93e983",
  "subject": {
    "type": "CLIENT",
    "id": "c2ce3b01-af49-49aa-ac66-bd0fa7254868"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMmNlM2IwMS1hZjQ5LTQ5YWEtYWM2Ni1iZDBmYTcyNTQ4NjgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc4MTE5LCJpYXQiOjE3OTMzNzcyMTksImp0aSI6ImI1ZTdmODc1LThlNTEtNDM0Mi1iMzZlLTcyMzM5NjBkNmNkMiIsInNpZCI6IjE0OGE1ODUwLTBjMjEtNDZmMi04NzhhLTkxMzNjYTkzZTk4MyJ9.rE8EbaV0fNv_MKMhq9tDEYa6ONj54dd_sTAj5H8ByEE",
  "access_expires_at": "2026-10-30T16:35:19.079235569Z",
  "refresh_token": "x35qwtFbphsXRfkO-6S2-NeWr_Wzgpu8qPNA6di2RN0",
  "refresh_expires_at": "2026-11-29T16:20:19.078790234Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "205a396f-ee50-4d33-91e9-fbb57da991ad",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "1f7a3cdc-9200-46b2-accd-00075c490c23",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-1f7a3cdc-9200-46b2-accd-00075c490c23",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "2789cec7e06bbb54ce4f28bb0ca1b1db",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=1f7a3cdc-9200-46b2-accd-00075c490c23",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380734662563"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=1f7a3cdc-9200-46b2-accd-00075c490c23",
  "expires_at": "2026-10-30T16:50:19.344955Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/1f7a3cdc-9200-46b2-accd-00075c490c23` → **200**

```json
{
  "id": "1f7a3cdc-9200-46b2-accd-00075c490c23",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T16:50:19.344955Z",
  "card": {
    "id": "a385e7f8-2920-4d2e-87b0-997086eaa3ca",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****9423",
    "card_type": "Visa",
    "created_at": "2026-10-30T16:20:19.616498Z"
  },
  "failure_reason": null
}
```

## The rider orders by card: the hold is taken

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "0374309a-516b-41a9-b765-b56741cf068e",
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
  "id": "1dbf3aa7-9814-46e2-9468-c2bfa2ba5125",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T16:25:19.911093Z",
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
  "command_id": "7140f154-7494-410e-bf9b-a18b941c567d",
  "quote_id": "1dbf3aa7-9814-46e2-9468-c2bfa2ba5125",
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
  "id": "65822be8-4d56-4c79-9c1b-7273eb6a89aa",
  "short_number": 34,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "c2ce3b01-af49-49aa-ac66-bd0fa7254868",
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
  "created_at": "2026-10-30T16:20:20.201408Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/65822be8-4d56-4c79-9c1b-7273eb6a89aa` → **200**

```json
{
  "id": "65822be8-4d56-4c79-9c1b-7273eb6a89aa",
  "short_number": 34,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "c2ce3b01-af49-49aa-ac66-bd0fa7254868",
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
  "created_at": "2026-10-30T16:20:20.201408Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/65822be8-4d56-4c79-9c1b-7273eb6a89aa` → **200**

```json
{
  "id": "65822be8-4d56-4c79-9c1b-7273eb6a89aa",
  "short_number": 34,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "c2ce3b01-af49-49aa-ac66-bd0fa7254868",
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
  "created_at": "2026-10-30T16:20:20.201408Z",
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

`GET /api/rider/v1/orders/65822be8-4d56-4c79-9c1b-7273eb6a89aa` → **200**

```json
{
  "id": "65822be8-4d56-4c79-9c1b-7273eb6a89aa",
  "short_number": 34,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "c2ce3b01-af49-49aa-ac66-bd0fa7254868",
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
  "created_at": "2026-10-30T16:20:20.201408Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/65822be8-4d56-4c79-9c1b-7273eb6a89aa/switch-to-cash` → **200**

```json
{
  "command_id": "b2f2a245-bceb-4fd2-b17e-d8530c28f7dc",
  "expected_version": 3
}
```

```json
{
  "id": "65822be8-4d56-4c79-9c1b-7273eb6a89aa",
  "short_number": 34,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "c2ce3b01-af49-49aa-ac66-bd0fa7254868",
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
  "created_at": "2026-10-30T16:20:20.201408Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/65822be8-4d56-4c79-9c1b-7273eb6a89aa/switch-to-cash` → **409**

```json
{
  "command_id": "241aeb42-6442-446a-ba27-d10333940286",
  "expected_version": 4
}
```

```json
{
  "instance": "/api/rider/v1/orders/65822be8-4d56-4c79-9c1b-7273eb6a89aa/switch-to-cash",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "59d26227-d527-47f6-a6b2-e44bfd99abe8"
}
```

Done: the card order became cash; a second switch is refused.

`GET /api/rider/v1/orders/65822be8-4d56-4c79-9c1b-7273eb6a89aa` → **200**

```json
{
  "id": "65822be8-4d56-4c79-9c1b-7273eb6a89aa",
  "short_number": 34,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "c2ce3b01-af49-49aa-ac66-bd0fa7254868",
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
  "created_at": "2026-10-30T16:20:20.201408Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/65822be8-4d56-4c79-9c1b-7273eb6a89aa/cancel` → **200**

```json
{
  "command_id": "9819ceac-6d3a-42ed-8039-ac0f5954763e",
  "expected_version": 4,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "65822be8-4d56-4c79-9c1b-7273eb6a89aa",
  "short_number": 34,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "c2ce3b01-af49-49aa-ac66-bd0fa7254868",
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
  "created_at": "2026-10-30T16:20:20.201408Z",
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
  "session_id": "be842db0-9817-4450-a07a-97197b42e5f8",
  "subject": {
    "type": "STAFF",
    "id": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NTM4N2IzNC1lN2M5LTRhZmYtOTNjMS0wZGQzZjJhY2QwOGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzgxMjMsImlhdCI6MTc5MzM3NzIyMywianRpIjoiNmJmMzMyOGEtNTY1ZC00ODRmLWEyZTMtN2Y0ZWQ3NGZiZGM0Iiwic2lkIjoiYmU4NDJkYjAtOTgxNy00NDUwLWEwN2EtOTcxOTdiNDJlNWY4In0.T73DfzNA-avtHN2bg5KLdd-6JVFCXFqBjdeShOdrjaE",
  "access_expires_at": "2026-10-30T16:35:23.772421248Z",
  "refresh_token": "j1KthaeYQ_YjzdUDoJ9CD8Tuo3qyPgLHMpVuY15DtQc",
  "refresh_expires_at": "2026-10-31T04:20:23.771937755Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-19658"
}
```

```json
{
  "challenge_id": "22f3ee45-bf57-4688-bbab-8eab3320a094",
  "expires_at": "2026-10-30T16:25:24.040484308Z",
  "resend_available_at": "2026-10-30T16:20:25.040484308Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "311395",
  "sent_at": "2026-10-30T16:20:24.043165506Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "22f3ee45-bf57-4688-bbab-8eab3320a094",
  "code": "311395",
  "device_ref": "sandbox-19658"
}
```

```json
{
  "session_id": "872973d6-49ef-441b-872d-fcb1afd64603",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3ODEyNCwiaWF0IjoxNzkzMzc3MjI0LCJqdGkiOiJjOTE5ZDhmNS04MzQyLTQ4YWEtYjgxMy00NTI2OWVmM2E3ZjUiLCJzaWQiOiI4NzI5NzNkNi00OWVmLTQ0MWItODcyZC1mY2IxYWZkNjQ2MDMifQ.f0lRdYgAPPCK90urXAOASVYeYMSvybDLpUwgE2HUvS4",
  "access_expires_at": "2026-10-30T16:35:24.325424358Z",
  "refresh_token": "9T-Eqm1Sjvox3pylPYCqsxxAJrDWDPBa2TPAsfp5o_M",
  "refresh_expires_at": "2026-11-29T16:20:24.324984936Z",
  "account_created": false
}
```

`GET /api/driver/v1/profile` → **200**

```json
{
  "id": "5a000000-0000-4000-8000-000000000403",
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
}
```

`GET /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403` → **200**

```json
{
  "profile": {
    "id": "5a000000-0000-4000-8000-000000000403",
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
  "history": [
    {
      "from": "APPROVED",
      "to": "SUSPENDED",
      "actor_type": "STAFF",
      "actor_id": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T16:20:07.511553Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f",
      "reason": "Sandbox clean-up",
      "at": "2026-10-30T16:20:08.897543Z"
    }
  ],
  "duplicates": []
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "a8c75bdf-d53c-49b8-9059-b0b4c3ed5ff7",
  "expected_version": 15,
  "has_terminal": true,
  "reason": "ФОП, власний POS-термінал"
}
```

```json
{
  "id": "5a000000-0000-4000-8000-000000000403",
  "name": "Андрій Шевчук",
  "language": "ru",
  "review_status": "APPROVED",
  "version": 16,
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
  "device_ref": "sandbox-16752"
}
```

```json
{
  "challenge_id": "82cec3ca-db00-4a5f-81de-0ccbcab5fd32",
  "expires_at": "2026-10-30T16:25:25.410194641Z",
  "resend_available_at": "2026-10-30T16:20:26.410194641Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "209635",
  "sent_at": "2026-10-30T16:20:25.412582857Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "82cec3ca-db00-4a5f-81de-0ccbcab5fd32",
  "code": "209635",
  "device_ref": "sandbox-16752"
}
```

```json
{
  "session_id": "66fc4f36-7940-46ab-b86c-dd4580efea5a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3ODEyNSwiaWF0IjoxNzkzMzc3MjI1LCJqdGkiOiJmMmQzNjYxMy04MTM0LTRiMzUtYmZiYi0yNTExYTdjNGQ3YWIiLCJzaWQiOiI2NmZjNGYzNi03OTQwLTQ2YWItYjg2Yy1kZDQ1ODBlZmVhNWEifQ.R4Np5ZfDuSye57MHcAfBKF92FcwcOETpSl4DYgpassU",
  "access_expires_at": "2026-10-30T16:35:25.698573461Z",
  "refresh_token": "LgTaDzXQAhQDRQw4XK1daoT1CdL1e_H6AR9S9D3i37I",
  "refresh_expires_at": "2026-11-29T16:20:25.698071957Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "190a7be9-ad5f-4101-8555-9204212f7143",
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
  "last_heartbeat_at": "2026-10-30T16:19:47.370374Z",
  "last_location_at": "2026-10-30T16:19:47.370374Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/190a7be9-ad5f-4101-8555-9204212f7143/handover` → **200**

```json
{
  "command_id": "8ac45999-a36f-4e25-9475-32f750cd7235",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "190a7be9-ad5f-4101-8555-9204212f7143",
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
  "last_heartbeat_at": "2026-10-30T16:19:47.370374Z",
  "last_location_at": "2026-10-30T16:19:47.370374Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

(the car drives 10 s to the next point)

`POST /api/driver/v1/work-sessions/190a7be9-ad5f-4101-8555-9204212f7143/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:20:36Z",
    "sequence": 1793377236511
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "190a7be9-ad5f-4101-8555-9204212f7143",
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
  "last_heartbeat_at": "2026-10-30T16:20:36.528194Z",
  "last_location_at": "2026-10-30T16:20:36.528194Z",
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
  "command_id": "17ca22e9-d0c9-4f01-84c9-1502fb3ea6f2",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:20:37Z",
    "sequence": 1793377237658
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "b8cf044a-fee4-49b6-baa6-93088b902f67",
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
  "last_heartbeat_at": "2026-10-30T16:20:37.081391Z",
  "last_location_at": "2026-10-30T16:20:37.081391Z",
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
  "session_id": "29b77403-f033-4910-b554-8e84ae618270",
  "subject": {
    "type": "STAFF",
    "id": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NTM4N2IzNC1lN2M5LTRhZmYtOTNjMS0wZGQzZjJhY2QwOGYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzgxMzcsImlhdCI6MTc5MzM3NzIzNywianRpIjoiMTVjYmIzZjktN2I1ZC00MzJiLWI4YTAtM2M0MjYzNzhlMDhlIiwic2lkIjoiMjliNzc0MDMtZjAzMy00OTEwLWI1NTQtOGU4NGFlNjE4MjcwIn0.tcUzoTZn-nfyghFr4acRwlyJTyzdEBjJ63yZRKgt3fE",
  "access_expires_at": "2026-10-30T16:35:37.659436541Z",
  "refresh_token": "386hyIaIwbecr1FGPryqTZHhTtxVs8TeQRySGgb30OY",
  "refresh_expires_at": "2026-10-31T04:20:37.658945463Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "5b398558-6f67-441b-a232-69d588b50482",
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
  "id": "ac31c899-1436-4e78-a0ee-a8ec7335b7d8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T16:25:37.932048Z",
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
  "command_id": "d1cc6800-3818-482c-8097-9fedb45ccdc6",
  "quote_id": "ac31c899-1436-4e78-a0ee-a8ec7335b7d8",
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
  "id": "15e0766f-6656-4eb2-883a-92a0642c1d76",
  "short_number": 35,
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
  "created_at": "2026-10-30T16:20:38.210219Z",
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
    "id": "7e9ce4df-72c4-42cb-8d33-ad92f38fad86",
    "order_id": "15e0766f-6656-4eb2-883a-92a0642c1d76",
    "expires_at": "2026-10-30T16:20:53.21367Z",
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

`POST /api/driver/v1/offers/7e9ce4df-72c4-42cb-8d33-ad92f38fad86/accept` → **200**

```json
{
  "command_id": "e4917f56-fd9d-4959-be0b-ef5ee7797152"
}
```

```json
{
  "id": "95983e4d-fbc3-4c64-a70b-ff0e6262a5f6",
  "order_id": "15e0766f-6656-4eb2-883a-92a0642c1d76",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f46c5829-6932-4d14-9d55-f1293a90b80f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f46c5829-6932-4d14-9d55-f1293a90b80f",
  "order_id": "15e0766f-6656-4eb2-883a-92a0642c1d76",
  "assignment_id": "95983e4d-fbc3-4c64-a70b-ff0e6262a5f6",
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

`POST /api/driver/v1/work-sessions/b8cf044a-fee4-49b6-baa6-93088b902f67/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:20:49Z",
    "sequence": 1793377249613
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "b8cf044a-fee4-49b6-baa6-93088b902f67",
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
  "last_heartbeat_at": "2026-10-30T16:20:49.629985Z",
  "last_location_at": "2026-10-30T16:20:49.629985Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/f46c5829-6932-4d14-9d55-f1293a90b80f/arrive` → **200**

```json
{
  "command_id": "91d57183-1568-4c39-aa0a-47a60915dc0e",
  "expected_version": 0
}
```

```json
{
  "id": "f46c5829-6932-4d14-9d55-f1293a90b80f",
  "order_id": "15e0766f-6656-4eb2-883a-92a0642c1d76",
  "assignment_id": "95983e4d-fbc3-4c64-a70b-ff0e6262a5f6",
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
  "arrived_at": "2026-10-30T16:20:49.905236Z",
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

`POST /api/driver/v1/trips/f46c5829-6932-4d14-9d55-f1293a90b80f/start` → **200**

```json
{
  "command_id": "a0a001e0-5a73-47fc-b61f-603d6b93a336",
  "expected_version": 1
}
```

```json
{
  "id": "f46c5829-6932-4d14-9d55-f1293a90b80f",
  "order_id": "15e0766f-6656-4eb2-883a-92a0642c1d76",
  "assignment_id": "95983e4d-fbc3-4c64-a70b-ff0e6262a5f6",
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
  "arrived_at": "2026-10-30T16:20:49.905236Z",
  "started_at": "2026-10-30T16:20:50.190031Z",
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

`POST /api/driver/v1/trips/f46c5829-6932-4d14-9d55-f1293a90b80f/complete` → **200**

```json
{
  "command_id": "0ce574b9-20c9-4df9-83c9-5717af80977d",
  "expected_version": 2,
  "reported_at": "2026-10-30T16:20:50Z",
  "cash_received": true
}
```

```json
{
  "id": "f46c5829-6932-4d14-9d55-f1293a90b80f",
  "order_id": "15e0766f-6656-4eb2-883a-92a0642c1d76",
  "assignment_id": "95983e4d-fbc3-4c64-a70b-ff0e6262a5f6",
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
  "arrived_at": "2026-10-30T16:20:49.905236Z",
  "started_at": "2026-10-30T16:20:50.190031Z",
  "completed_at": "2026-10-30T16:20:50.493784Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/15e0766f-6656-4eb2-883a-92a0642c1d76` → **200**

```json
{
  "id": "15e0766f-6656-4eb2-883a-92a0642c1d76",
  "short_number": 35,
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
    "id": "95983e4d-fbc3-4c64-a70b-ff0e6262a5f6",
    "order_id": "15e0766f-6656-4eb2-883a-92a0642c1d76",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "f46c5829-6932-4d14-9d55-f1293a90b80f",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T16:20:38.210219Z",
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
      "balance_minor": 42061,
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
  "session_id": "190a7be9-ad5f-4101-8555-9204212f7143",
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
  "last_heartbeat_at": "2026-10-30T16:20:36.528194Z",
  "last_location_at": "2026-10-30T16:20:36.528194Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/190a7be9-ad5f-4101-8555-9204212f7143/close` → **200**

```json
{
  "command_id": "d707277f-de96-448d-b3f1-42811da73b6d",
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
  "session_id": "b8cf044a-fee4-49b6-baa6-93088b902f67",
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
  "last_heartbeat_at": "2026-10-30T16:20:49.629985Z",
  "last_location_at": "2026-10-30T16:20:49.629985Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b8cf044a-fee4-49b6-baa6-93088b902f67/close` → **200**

```json
{
  "command_id": "fa10352b-7653-47d5-a37c-79a32248f81f",
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

Done: terminal order 15e0766f-6656-4eb2-883a-92a0642c1d76 by Andrii (5a000000-0000-4000-8000-000000000403).

# Scenario: zz-metrics

## A search without drivers ends as UNFULFILLED

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-24758"
}
```

```json
{
  "challenge_id": "02f3c9ae-9df7-464e-9c9a-089a01bd62db",
  "expires_at": "2026-10-30T16:25:55.425482324Z",
  "resend_available_at": "2026-10-30T16:20:56.425482324Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "288277",
  "sent_at": "2026-10-30T16:20:55.428092665Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "02f3c9ae-9df7-464e-9c9a-089a01bd62db",
  "code": "288277",
  "device_ref": "sandbox-24758"
}
```

```json
{
  "session_id": "364c9110-0f1a-42bf-8611-a7c9977095ff",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3ODE1NSwiaWF0IjoxNzkzMzc3MjU1LCJqdGkiOiJhMTJjYTQ0Yy1iNGI4LTQwMTUtOGFlYy1jMDBkNzQ5YjQwMzMiLCJzaWQiOiIzNjRjOTExMC0wZjFhLTQyYmYtODYxMS1hN2M5OTc3MDk1ZmYifQ._E1S3j1eg-gm1e1Vls6n0UZvPh8-vW0LuQ-biRwkGtI",
  "access_expires_at": "2026-10-30T16:35:55.716183084Z",
  "refresh_token": "DfRsXNVzXlNwXg6Oih_EcSt3ywa8CZ8Dgux0T2UbOJE",
  "refresh_expires_at": "2026-11-29T16:20:55.715645864Z",
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
  "device_ref": "sandbox-12420"
}
```

```json
{
  "challenge_id": "3c506098-7c22-4b7e-9daf-164d844ed417",
  "expires_at": "2026-10-30T16:25:56.248326806Z",
  "resend_available_at": "2026-10-30T16:20:57.248326806Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "287464",
  "sent_at": "2026-10-30T16:20:56.251079727Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3c506098-7c22-4b7e-9daf-164d844ed417",
  "code": "287464",
  "device_ref": "sandbox-12420"
}
```

```json
{
  "session_id": "78d6aa7a-c132-484f-9d10-3d9498b71203",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3ODE1NiwiaWF0IjoxNzkzMzc3MjU2LCJqdGkiOiJiNDVlNTk0Yi1mNWNiLTRjMjktYmRmMy1mMzE2NWNmODk1Y2UiLCJzaWQiOiI3OGQ2YWE3YS1jMTMyLTQ4NGYtOWQxMC0zZDk0OThiNzEyMDMifQ.LvoyP8pUl2GzEV7kKE9ODz9Zj6zPF-f_e01lgoFBUNM",
  "access_expires_at": "2026-10-30T16:35:56.53793514Z",
  "refresh_token": "rDb9DD8agzQitVDBpD6l4VhiifQuhENad_aJtUZgjOU",
  "refresh_expires_at": "2026-11-29T16:20:56.537402137Z",
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
  "device_ref": "sandbox-16353"
}
```

```json
{
  "challenge_id": "a2865897-035b-4cbb-92cd-be42a57c1747",
  "expires_at": "2026-10-30T16:25:57.078049473Z",
  "resend_available_at": "2026-10-30T16:20:58.078049473Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "225636",
  "sent_at": "2026-10-30T16:20:57.08020641Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a2865897-035b-4cbb-92cd-be42a57c1747",
  "code": "225636",
  "device_ref": "sandbox-16353"
}
```

```json
{
  "session_id": "cb08674f-d1f1-48b8-9a46-395a2b108e12",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3ODE1NywiaWF0IjoxNzkzMzc3MjU3LCJqdGkiOiJkODRiMTU3Yi1iYmRlLTQ4YmItYWI2My01MzgzZmI0ZTRjMGYiLCJzaWQiOiJjYjA4Njc0Zi1kMWYxLTQ4YjgtOWE0Ni0zOTVhMmIxMDhlMTIifQ.O6TrWJZPW2fSMPPhiwGCVl-U6lMfrnsSHOtZcwllo6k",
  "access_expires_at": "2026-10-30T16:35:57.367656107Z",
  "refresh_token": "t-1rb2WvzlBvrmK6q6PicrIHWArdRo2BvaKcOWIAJAg",
  "refresh_expires_at": "2026-11-29T16:20:57.367194906Z",
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
  "phone": "+380693014310",
  "device_ref": "sandbox-29601"
}
```

```json
{
  "challenge_id": "e5a6daad-2a65-4538-b07e-331502800f9e",
  "expires_at": "2026-10-30T16:25:57.898816107Z",
  "resend_available_at": "2026-10-30T16:20:58.898816107Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380693014310` → **200**

```json
{
  "phone": "+380693014310",
  "audience": "CLIENT",
  "code": "538109",
  "sent_at": "2026-10-30T16:20:57.901753058Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e5a6daad-2a65-4538-b07e-331502800f9e",
  "code": "538109",
  "device_ref": "sandbox-29601"
}
```

```json
{
  "session_id": "cf130b30-9a40-4b55-8313-9a7fdac4965d",
  "subject": {
    "type": "CLIENT",
    "id": "67a0bb73-7a50-4a46-8082-ac4607ccaa39"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2N2EwYmI3My03YTUwLTRhNDYtODA4Mi1hYzQ2MDdjY2FhMzkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc4MTU4LCJpYXQiOjE3OTMzNzcyNTgsImp0aSI6ImQ2MzUwMmJiLTg4MGYtNGQyMC04NWJiLWFjMTM2NWU3YjRiZCIsInNpZCI6ImNmMTMwYjMwLTlhNDAtNGI1NS04MzEzLTlhN2ZkYWM0OTY1ZCJ9.XHyFs2aZQdZ2XfFLBT-wulUk4kZlF8Tc4IQzkD_Ipik",
  "access_expires_at": "2026-10-30T16:35:58.191449678Z",
  "refresh_token": "65R3-3337TX-LxjUxLRhVoqMnwxnIR9-aKO50CgcvCY",
  "refresh_expires_at": "2026-11-29T16:20:58.191025884Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "aac9371c-59b9-4199-82a7-9f905a3986bd",
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
  "id": "7115d780-d7bd-4b8e-8c41-6aea46f323ed",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T16:25:58.458815Z",
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
  "command_id": "05cf241b-d72d-4221-bf25-f59daeb053f9",
  "quote_id": "7115d780-d7bd-4b8e-8c41-6aea46f323ed",
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
  "id": "a5b9ad31-8fde-46a8-bb85-0794193e03a8",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "67a0bb73-7a50-4a46-8082-ac4607ccaa39",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T16:20:58.73298Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a5b9ad31-8fde-46a8-bb85-0794193e03a8` → **200**

```json
{
  "id": "a5b9ad31-8fde-46a8-bb85-0794193e03a8",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "67a0bb73-7a50-4a46-8082-ac4607ccaa39",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T16:20:58.73298Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a5b9ad31-8fde-46a8-bb85-0794193e03a8` → **200**

```json
{
  "id": "a5b9ad31-8fde-46a8-bb85-0794193e03a8",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "67a0bb73-7a50-4a46-8082-ac4607ccaa39",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T16:20:58.73298Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a5b9ad31-8fde-46a8-bb85-0794193e03a8` → **200**

```json
{
  "id": "a5b9ad31-8fde-46a8-bb85-0794193e03a8",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "67a0bb73-7a50-4a46-8082-ac4607ccaa39",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T16:20:58.73298Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a5b9ad31-8fde-46a8-bb85-0794193e03a8` → **200**

```json
{
  "id": "a5b9ad31-8fde-46a8-bb85-0794193e03a8",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "67a0bb73-7a50-4a46-8082-ac4607ccaa39",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T16:20:58.73298Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a5b9ad31-8fde-46a8-bb85-0794193e03a8` → **200**

```json
{
  "id": "a5b9ad31-8fde-46a8-bb85-0794193e03a8",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "67a0bb73-7a50-4a46-8082-ac4607ccaa39",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T16:20:58.73298Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a5b9ad31-8fde-46a8-bb85-0794193e03a8` → **200**

```json
{
  "id": "a5b9ad31-8fde-46a8-bb85-0794193e03a8",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "67a0bb73-7a50-4a46-8082-ac4607ccaa39",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T16:20:58.73298Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a5b9ad31-8fde-46a8-bb85-0794193e03a8` → **200**

```json
{
  "id": "a5b9ad31-8fde-46a8-bb85-0794193e03a8",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "67a0bb73-7a50-4a46-8082-ac4607ccaa39",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T16:20:58.73298Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a5b9ad31-8fde-46a8-bb85-0794193e03a8` → **200**

```json
{
  "id": "a5b9ad31-8fde-46a8-bb85-0794193e03a8",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "67a0bb73-7a50-4a46-8082-ac4607ccaa39",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T16:20:58.73298Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a5b9ad31-8fde-46a8-bb85-0794193e03a8` → **200**

```json
{
  "id": "a5b9ad31-8fde-46a8-bb85-0794193e03a8",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "67a0bb73-7a50-4a46-8082-ac4607ccaa39",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T16:20:58.73298Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a5b9ad31-8fde-46a8-bb85-0794193e03a8` → **200**

```json
{
  "id": "a5b9ad31-8fde-46a8-bb85-0794193e03a8",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "67a0bb73-7a50-4a46-8082-ac4607ccaa39",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T16:20:58.73298Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a5b9ad31-8fde-46a8-bb85-0794193e03a8` → **200**

```json
{
  "id": "a5b9ad31-8fde-46a8-bb85-0794193e03a8",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "67a0bb73-7a50-4a46-8082-ac4607ccaa39",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T16:20:58.73298Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a5b9ad31-8fde-46a8-bb85-0794193e03a8` → **200**

```json
{
  "id": "a5b9ad31-8fde-46a8-bb85-0794193e03a8",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "67a0bb73-7a50-4a46-8082-ac4607ccaa39",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T16:20:58.73298Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a5b9ad31-8fde-46a8-bb85-0794193e03a8` → **200**

```json
{
  "id": "a5b9ad31-8fde-46a8-bb85-0794193e03a8",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "67a0bb73-7a50-4a46-8082-ac4607ccaa39",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T16:20:58.73298Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a5b9ad31-8fde-46a8-bb85-0794193e03a8` → **200**

```json
{
  "id": "a5b9ad31-8fde-46a8-bb85-0794193e03a8",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "67a0bb73-7a50-4a46-8082-ac4607ccaa39",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T16:20:58.73298Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a5b9ad31-8fde-46a8-bb85-0794193e03a8` → **200**

```json
{
  "id": "a5b9ad31-8fde-46a8-bb85-0794193e03a8",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "67a0bb73-7a50-4a46-8082-ac4607ccaa39",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T16:20:58.73298Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a5b9ad31-8fde-46a8-bb85-0794193e03a8` → **200**

```json
{
  "id": "a5b9ad31-8fde-46a8-bb85-0794193e03a8",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "67a0bb73-7a50-4a46-8082-ac4607ccaa39",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T16:20:58.73298Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a5b9ad31-8fde-46a8-bb85-0794193e03a8` → **200**

```json
{
  "id": "a5b9ad31-8fde-46a8-bb85-0794193e03a8",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "67a0bb73-7a50-4a46-8082-ac4607ccaa39",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T16:20:58.73298Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a5b9ad31-8fde-46a8-bb85-0794193e03a8` → **200**

```json
{
  "id": "a5b9ad31-8fde-46a8-bb85-0794193e03a8",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "67a0bb73-7a50-4a46-8082-ac4607ccaa39",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T16:20:58.73298Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a5b9ad31-8fde-46a8-bb85-0794193e03a8` → **200**

```json
{
  "id": "a5b9ad31-8fde-46a8-bb85-0794193e03a8",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "67a0bb73-7a50-4a46-8082-ac4607ccaa39",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T16:20:58.73298Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a5b9ad31-8fde-46a8-bb85-0794193e03a8` → **200**

```json
{
  "id": "a5b9ad31-8fde-46a8-bb85-0794193e03a8",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "67a0bb73-7a50-4a46-8082-ac4607ccaa39",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T16:20:58.73298Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a5b9ad31-8fde-46a8-bb85-0794193e03a8` → **200**

```json
{
  "id": "a5b9ad31-8fde-46a8-bb85-0794193e03a8",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "67a0bb73-7a50-4a46-8082-ac4607ccaa39",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T16:20:58.73298Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a5b9ad31-8fde-46a8-bb85-0794193e03a8` → **200**

```json
{
  "id": "a5b9ad31-8fde-46a8-bb85-0794193e03a8",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "67a0bb73-7a50-4a46-8082-ac4607ccaa39",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T16:20:58.73298Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a5b9ad31-8fde-46a8-bb85-0794193e03a8` → **200**

```json
{
  "id": "a5b9ad31-8fde-46a8-bb85-0794193e03a8",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "67a0bb73-7a50-4a46-8082-ac4607ccaa39",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T16:20:58.73298Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a5b9ad31-8fde-46a8-bb85-0794193e03a8` → **200**

```json
{
  "id": "a5b9ad31-8fde-46a8-bb85-0794193e03a8",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "67a0bb73-7a50-4a46-8082-ac4607ccaa39",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T16:20:58.73298Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a5b9ad31-8fde-46a8-bb85-0794193e03a8` → **200**

```json
{
  "id": "a5b9ad31-8fde-46a8-bb85-0794193e03a8",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "67a0bb73-7a50-4a46-8082-ac4607ccaa39",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T16:20:58.73298Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a5b9ad31-8fde-46a8-bb85-0794193e03a8` → **200**

```json
{
  "id": "a5b9ad31-8fde-46a8-bb85-0794193e03a8",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "67a0bb73-7a50-4a46-8082-ac4607ccaa39",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T16:20:58.73298Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a5b9ad31-8fde-46a8-bb85-0794193e03a8` → **200**

```json
{
  "id": "a5b9ad31-8fde-46a8-bb85-0794193e03a8",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "67a0bb73-7a50-4a46-8082-ac4607ccaa39",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T16:20:58.73298Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a5b9ad31-8fde-46a8-bb85-0794193e03a8` → **200**

```json
{
  "id": "a5b9ad31-8fde-46a8-bb85-0794193e03a8",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "67a0bb73-7a50-4a46-8082-ac4607ccaa39",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T16:20:58.73298Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a5b9ad31-8fde-46a8-bb85-0794193e03a8` → **200**

```json
{
  "id": "a5b9ad31-8fde-46a8-bb85-0794193e03a8",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "67a0bb73-7a50-4a46-8082-ac4607ccaa39",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T16:20:58.73298Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a5b9ad31-8fde-46a8-bb85-0794193e03a8` → **200**

```json
{
  "id": "a5b9ad31-8fde-46a8-bb85-0794193e03a8",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "67a0bb73-7a50-4a46-8082-ac4607ccaa39",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T16:20:58.73298Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a5b9ad31-8fde-46a8-bb85-0794193e03a8` → **200**

```json
{
  "id": "a5b9ad31-8fde-46a8-bb85-0794193e03a8",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "67a0bb73-7a50-4a46-8082-ac4607ccaa39",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T16:20:58.73298Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a5b9ad31-8fde-46a8-bb85-0794193e03a8` → **200**

```json
{
  "id": "a5b9ad31-8fde-46a8-bb85-0794193e03a8",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "67a0bb73-7a50-4a46-8082-ac4607ccaa39",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T16:20:58.73298Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a5b9ad31-8fde-46a8-bb85-0794193e03a8` → **200**

```json
{
  "id": "a5b9ad31-8fde-46a8-bb85-0794193e03a8",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "67a0bb73-7a50-4a46-8082-ac4607ccaa39",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T16:20:58.73298Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a5b9ad31-8fde-46a8-bb85-0794193e03a8` → **200**

```json
{
  "id": "a5b9ad31-8fde-46a8-bb85-0794193e03a8",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "67a0bb73-7a50-4a46-8082-ac4607ccaa39",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T16:20:58.73298Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a5b9ad31-8fde-46a8-bb85-0794193e03a8` → **200**

```json
{
  "id": "a5b9ad31-8fde-46a8-bb85-0794193e03a8",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "67a0bb73-7a50-4a46-8082-ac4607ccaa39",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T16:20:58.73298Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a5b9ad31-8fde-46a8-bb85-0794193e03a8` → **200**

```json
{
  "id": "a5b9ad31-8fde-46a8-bb85-0794193e03a8",
  "short_number": 36,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "67a0bb73-7a50-4a46-8082-ac4607ccaa39",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T16:20:58.73298Z",
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
  "blizz_orders_total": 36,
  "blizz_orders_cancelled_total": 22,
  "blizz_orders_unfulfilled_total": 1,
  "blizz_dispatch_first_offer_seconds_count": 24,
  "blizz_dispatch_assigned_seconds_count": 19,
  "blizz_offers_total": 27,
  "blizz_dispatch_excluded_total": 20,
  "blizz_sms_sent_total": 85
}

```prometheus
blizz_dispatch_assigned_seconds_count{application="blizz-taxi-server",source="BROADCAST"} 1
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="BROADCAST"} 10.975195523
blizz_dispatch_assigned_seconds_count{application="blizz-taxi-server",source="OFFER"} 18
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="OFFER"} 15.09261081
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
blizz_dispatch_first_offer_seconds_count{application="blizz-taxi-server"} 24
blizz_dispatch_first_offer_seconds_sum{application="blizz-taxi-server"} 0.432088706
blizz_dispatch_first_offer_seconds_max{application="blizz-taxi-server"} 0.0
blizz_offers_total{application="blizz-taxi-server",outcome="ACCEPTED"} 18.0
blizz_offers_total{application="blizz-taxi-server",outcome="DECLINED"} 2.0
blizz_offers_total{application="blizz-taxi-server",outcome="REVOKED"} 7.0
blizz_orders_total{application="blizz-taxi-server",channel="APP",preorder="false"} 28.0
blizz_orders_total{application="blizz-taxi-server",channel="APP",preorder="true"} 2.0
blizz_orders_total{application="blizz-taxi-server",channel="PHONE",preorder="false"} 6.0
blizz_orders_cancelled_total{application="blizz-taxi-server",by="DRIVER",reason="PASSENGER_ASKED"} 2.0
blizz_orders_cancelled_total{application="blizz-taxi-server",by="RIDER",reason="CHANGED_MIND"} 7.0
blizz_orders_cancelled_total{application="blizz-taxi-server",by="RIDER",reason="WAIT_TOO_LONG"} 1.0
blizz_orders_cancelled_total{application="blizz-taxi-server",by="STAFF",reason="NO_CARS"} 10.0
blizz_orders_cancelled_total{application="blizz-taxi-server",by="STAFF",reason="OTHER"} 2.0
blizz_orders_unfulfilled_total{application="blizz-taxi-server"} 1.0
blizz_sms_sent_total{application="blizz-taxi-server",purpose="CALLER",state="SENT"} 6.0
blizz_sms_sent_total{application="blizz-taxi-server",purpose="OTP",state="FAILED"} 2.0
blizz_sms_sent_total{application="blizz-taxi-server",purpose="OTP",state="SENT"} 77.0
```

Done: real no-car deadline, non-zero counters/timers and bounded labels on the management port.

`GET /api/rider/v1/orders/a5b9ad31-8fde-46a8-bb85-0794193e03a8` → **200**

```json
{
  "id": "a5b9ad31-8fde-46a8-bb85-0794193e03a8",
  "short_number": 36,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "67a0bb73-7a50-4a46-8082-ac4607ccaa39",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T16:20:58.73298Z",
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
  "session_id": "db5fa1b3-a877-4666-adb0-56b9b9fd8dcf",
  "subject": {
    "type": "STAFF",
    "id": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NTM4N2IzNC1lN2M5LTRhZmYtOTNjMS0wZGQzZjJhY2QwOGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzgzNDUsImlhdCI6MTc5MzM3NzQ0NSwianRpIjoiODZjMTgyZDYtOTRmNi00Nzk1LWI3NTgtMTQwMDE2ZDI4ZGYzIiwic2lkIjoiZGI1ZmExYjMtYTg3Ny00NjY2LWFkYjAtNTZiOWI5ZmQ4ZGNmIn0.OqOa021dhxQtNGX63Vh_0LWsC55y1ckPUEVdiT7hy7Q",
  "access_expires_at": "2026-10-30T16:39:05.117992629Z",
  "refresh_token": "R1OETNEOTK0G7fWnQOj62f6jvZIdvI3AG06ShpcmcTo",
  "refresh_expires_at": "2026-10-31T04:24:05.117035993Z",
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
  "id": "f1a0013c-8ce0-4535-861a-e960385155c4",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T16:24:05.404108Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T16:24:05.404169Z",
  "updated_at": "2026-10-30T16:24:05.420971Z",
  "finished_at": "2026-10-30T16:24:05.420971Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/f1a0013c-8ce0-4535-861a-e960385155c4` → **200**

```json
{
  "run": {
    "id": "f1a0013c-8ce0-4535-861a-e960385155c4",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T16:24:05.404108Z",
    "partial": true,
    "state": "CLEAN",
    "local_count": 10,
    "provider_count": 10,
    "item_count": 0,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T16:24:05.404169Z",
    "updated_at": "2026-10-30T16:24:05.420971Z",
    "finished_at": "2026-10-30T16:24:05.420971Z",
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
  "id": "f1a0013c-8ce0-4535-861a-e960385155c4",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T16:24:05.404108Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T16:24:05.404169Z",
  "updated_at": "2026-10-30T16:24:05.420971Z",
  "finished_at": "2026-10-30T16:24:05.420971Z",
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
  "id": "f1a0013c-8ce0-4535-861a-e960385155c4",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T16:24:05.404108Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T16:24:05.404169Z",
  "updated_at": "2026-10-30T16:24:05.420971Z",
  "finished_at": "2026-10-30T16:24:05.420971Z",
  "version": 1
}
```

## One independent bank transaction produces one missing-local item on another merchant's first snapshot

`POST /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/46d85b1b-a7aa-4937-b8d4-12c1242c331e` → **204**

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
  "id": "1a333fe8-825d-4e25-b057-f8779dfbb327",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T16:24:05.825727Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T16:24:05.825767Z",
  "updated_at": "2026-10-30T16:24:05.832864Z",
  "finished_at": "2026-10-30T16:24:05.832864Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/1a333fe8-825d-4e25-b057-f8779dfbb327` → **200**

```json
{
  "run": {
    "id": "1a333fe8-825d-4e25-b057-f8779dfbb327",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T16:24:05.825727Z",
    "partial": true,
    "state": "OPEN",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 1,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T16:24:05.825767Z",
    "updated_at": "2026-10-30T16:24:05.832864Z",
    "finished_at": "2026-10-30T16:24:05.832864Z",
    "version": 1
  },
  "items": [
    {
      "id": "b162d4de-bc0d-4b5e-8486-73441975e8ec",
      "run_id": "1a333fe8-825d-4e25-b057-f8779dfbb327",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "efd5edb9fd0db4ce3a5a5464101354c428eb9bd8f8a578d2edb7035b28fd9dd6",
      "reference_display": "sandbox-reconciliation-46d85b1b-a7aa-4937-b8d4-12c1242c331e",
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
      "provider_at": "2026-10-30T16:24:05Z",
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
  "id": "1a333fe8-825d-4e25-b057-f8779dfbb327",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T16:24:05.825727Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T16:24:05.825767Z",
  "updated_at": "2026-10-30T16:24:05.832864Z",
  "finished_at": "2026-10-30T16:24:05.832864Z",
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
  "id": "1a333fe8-825d-4e25-b057-f8779dfbb327",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T16:24:05.825727Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T16:24:05.825767Z",
  "updated_at": "2026-10-30T16:24:05.832864Z",
  "finished_at": "2026-10-30T16:24:05.832864Z",
  "version": 1
}
```

## The admin explains the item once; a replay is the same result and a different decision conflicts

`POST /api/admin/v1/payment-reconciliations/items/b162d4de-bc0d-4b5e-8486-73441975e8ec/resolve` → **200**

```json
{
  "command_id": "51194c28-72cc-41f0-8fd4-1a7622e47a9f",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "b162d4de-bc0d-4b5e-8486-73441975e8ec",
  "run_id": "1a333fe8-825d-4e25-b057-f8779dfbb327",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "efd5edb9fd0db4ce3a5a5464101354c428eb9bd8f8a578d2edb7035b28fd9dd6",
  "reference_display": "sandbox-reconciliation-46d85b1b-a7aa-4937-b8d4-12c1242c331e",
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
  "provider_at": "2026-10-30T16:24:05Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f",
  "resolved_at": "2026-10-30T16:24:06.226861Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/b162d4de-bc0d-4b5e-8486-73441975e8ec/resolve` → **200**

```json
{
  "command_id": "51194c28-72cc-41f0-8fd4-1a7622e47a9f",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "b162d4de-bc0d-4b5e-8486-73441975e8ec",
  "run_id": "1a333fe8-825d-4e25-b057-f8779dfbb327",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "efd5edb9fd0db4ce3a5a5464101354c428eb9bd8f8a578d2edb7035b28fd9dd6",
  "reference_display": "sandbox-reconciliation-46d85b1b-a7aa-4937-b8d4-12c1242c331e",
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
  "provider_at": "2026-10-30T16:24:05Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f",
  "resolved_at": "2026-10-30T16:24:06.226861Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/b162d4de-bc0d-4b5e-8486-73441975e8ec/resolve` → **409**

```json
{
  "command_id": "6aa492d8-0638-49b9-b920-840c9e4f44d0",
  "expected_version": 1,
  "decision": "ESCALATED",
  "reason": "A conflicting second decision"
}
```

```json
{
  "instance": "/api/admin/v1/payment-reconciliations/items/b162d4de-bc0d-4b5e-8486-73441975e8ec/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "72244ba2-1dcb-4f8d-9d7d-bf8d4825f4ab"
}
```

`GET /api/admin/v1/payment-reconciliations/1a333fe8-825d-4e25-b057-f8779dfbb327` → **200**

```json
{
  "run": {
    "id": "1a333fe8-825d-4e25-b057-f8779dfbb327",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T16:24:05.825727Z",
    "partial": true,
    "state": "RESOLVED",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T16:24:05.825767Z",
    "updated_at": "2026-10-30T16:24:06.226861Z",
    "finished_at": "2026-10-30T16:24:05.832864Z",
    "version": 2
  },
  "items": [
    {
      "id": "b162d4de-bc0d-4b5e-8486-73441975e8ec",
      "run_id": "1a333fe8-825d-4e25-b057-f8779dfbb327",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "efd5edb9fd0db4ce3a5a5464101354c428eb9bd8f8a578d2edb7035b28fd9dd6",
      "reference_display": "sandbox-reconciliation-46d85b1b-a7aa-4937-b8d4-12c1242c331e",
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
      "provider_at": "2026-10-30T16:24:05Z",
      "state": "RESOLVED",
      "decision": "EXPLAINED",
      "reason": "Independent sandbox bank fixture; no real money moved",
      "resolved_by": "65387b34-e7c9-4aff-93c1-0dd3f2acd08f",
      "resolved_at": "2026-10-30T16:24:06.226861Z",
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
      "id": "1a333fe8-825d-4e25-b057-f8779dfbb327",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-30",
      "period_from": "2026-10-29T22:00:00Z",
      "period_to": "2026-10-31T02:00:00Z",
      "observed_until": "2026-10-30T16:24:05.825727Z",
      "partial": true,
      "state": "RESOLVED",
      "local_count": 0,
      "provider_count": 1,
      "item_count": 1,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-30T16:24:05.825767Z",
      "updated_at": "2026-10-30T16:24:06.226861Z",
      "finished_at": "2026-10-30T16:24:05.832864Z",
      "version": 2
    },
    {
      "id": "dc06e3eb-59b5-417f-9274-71f12539c869",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-29",
      "period_from": "2026-10-28T22:00:00Z",
      "period_to": "2026-10-30T02:00:00Z",
      "observed_until": "2026-10-30T16:04:13.037394Z",
      "partial": false,
      "state": "CLEAN",
      "local_count": 0,
      "provider_count": 0,
      "item_count": 0,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-30T16:04:13.037512Z",
      "updated_at": "2026-10-30T16:04:13.044612Z",
      "finished_at": "2026-10-30T16:04:13.044612Z",
      "version": 1
    }
  ],
  "next_cursor": null
}
```

`DELETE /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/46d85b1b-a7aa-4937-b8d4-12c1242c331e` → **204**

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30"
}
```

```json
{
  "id": "1a333fe8-825d-4e25-b057-f8779dfbb327",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T16:24:05.825727Z",
  "partial": true,
  "state": "RESOLVED",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T16:24:05.825767Z",
  "updated_at": "2026-10-30T16:24:06.226861Z",
  "finished_at": "2026-10-30T16:24:05.832864Z",
  "version": 2
}
```

Done: clean card snapshot, one bank-only difference, three identical runs, audited decision/replay/conflict, bank fixture restored.

# Scenario: zzz-invariants

## Five invariant checks are clean after all scenario transactions settle

```prometheus
blizz_invariant_last_success{application="blizz-taxi-server",check="I1"} 1.793377568395E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I2"} 1.793377568827E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I3"} 1.793377568828E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I4"} 1.793377568423E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I5"} 1.793377568828E9
blizz_invariant_violations{application="blizz-taxi-server",check="I1"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I2"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I3"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I4"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I5"} 0.0
```

Done: five fresh zero invariant gauges after the settling margin.
