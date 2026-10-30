# Sandbox transcript (2026-10-30T15:39:17Z, 5002531)

# Scenario: admission-cities

## Only Andrii is online in Kyiv for this scenario

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-12724"
}
```

```json
{
  "challenge_id": "9712952d-f7b3-445f-9759-99f1296b2f1d",
  "expires_at": "2026-10-30T15:44:17.815509538Z",
  "resend_available_at": "2026-10-30T15:39:18.815509538Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "165512",
  "sent_at": "2026-10-30T15:39:17.82673814Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9712952d-f7b3-445f-9759-99f1296b2f1d",
  "code": "165512",
  "device_ref": "sandbox-12724"
}
```

```json
{
  "session_id": "76d80c3e-d590-490d-8c54-da155f401e1d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NTY2MiwiaWF0IjoxNzkzMzc0NzYyLCJqdGkiOiI4NTI1ZjVjNy00NDA2LTQzZjAtYThiNi0yMTg4OWEzN2FiMTkiLCJzaWQiOiI3NmQ4MGMzZS1kNTkwLTQ5MGQtOGM1NC1kYTE1NWY0MDFlMWQifQ.YhwSQttxSmnnO9iKZ5zGRqShy-2ILPwaZ8mr1o_GsKo",
  "access_expires_at": "2026-10-30T15:54:22.683041033Z",
  "refresh_token": "nP-CyXq2_9wqytJaVKJ5W6d_GoxFCKD0rWvwAbDkskM",
  "refresh_expires_at": "2026-11-29T15:39:22.681103523Z",
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
  "device_ref": "sandbox-25320"
}
```

```json
{
  "challenge_id": "d2710d58-b6ee-4fc7-8087-a849afd93573",
  "expires_at": "2026-10-30T15:44:23.09915932Z",
  "resend_available_at": "2026-10-30T15:39:24.09915932Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "432717",
  "sent_at": "2026-10-30T15:39:23.10305952Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d2710d58-b6ee-4fc7-8087-a849afd93573",
  "code": "432717",
  "device_ref": "sandbox-25320"
}
```

```json
{
  "session_id": "fa8b7111-660e-4721-a117-60070409e019",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NTY2MywiaWF0IjoxNzkzMzc0NzYzLCJqdGkiOiJiNDI3NGM2MC05M2EyLTQ2M2MtYmMxOS02YmE1NzJiNTgxOTAiLCJzaWQiOiJmYThiNzExMS02NjBlLTQ3MjEtYTExNy02MDA3MDQwOWUwMTkifQ.TqQOAREDF0wI9Ygt_VFsRoDZvlvxJy3p5B1BlF9RT1w",
  "access_expires_at": "2026-10-30T15:54:23.307398832Z",
  "refresh_token": "_ose9DEZphnkzbLMY4u_RIcmXhXJRDmaQ9LXWBAvYYo",
  "refresh_expires_at": "2026-11-29T15:39:23.306582185Z",
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
  "correlation_id": "9987c948-134a-4d76-acfb-58009399b867"
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
  "session_id": "4967a603-0f10-4a6b-a108-bbeb0495f71a",
  "subject": {
    "type": "STAFF",
    "id": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiODZhYmMzMi1mMmUyLTRjM2MtOTk2Ny05N2JmYzljZTdjZTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzU2NjQsImlhdCI6MTc5MzM3NDc2NCwianRpIjoiZjVhYzhhNzItNzE5My00YmY2LTg1NjktN2IzYzRmZDRjNTNjIiwic2lkIjoiNDk2N2E2MDMtMGYxMC00YTZiLWExMDgtYmJlYjA0OTVmNzFhIn0.9rCuGIHNg-wh-GEg2-jpyTQxRI9JthZcdSPngklZdTI",
  "access_expires_at": "2026-10-30T15:54:24.263350893Z",
  "refresh_token": "z-2jaTn6ISjOTeYjUsGa60VKH07gnSlHzbGmcXaE0Vw",
  "refresh_expires_at": "2026-10-31T03:39:24.262533816Z",
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
  "session_id": "633c94f2-e833-4598-af44-ed0b33305662",
  "subject": {
    "type": "STAFF",
    "id": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiODZhYmMzMi1mMmUyLTRjM2MtOTk2Ny05N2JmYzljZTdjZTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzU2NjUsImlhdCI6MTc5MzM3NDc2NSwianRpIjoiNDJlZmFkY2MtYzhmZS00MWY3LWEyM2YtMzBhMWViZjMxMDc2Iiwic2lkIjoiNjMzYzk0ZjItZTgzMy00NTk4LWFmNDQtZWQwYjMzMzA1NjYyIn0.e07HC89xuhcwpkUM7lnOnr7ckiyhtKGvKccOZUIQ5Co",
  "access_expires_at": "2026-10-30T15:54:25.453693292Z",
  "refresh_token": "IMgWg0yFR7IBLqOD7MEKVTbJ6QZD7wbOb5v78Fxp1-s",
  "refresh_expires_at": "2026-10-31T03:39:25.453087899Z",
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
  "session_id": "dc4d5333-9b7b-42d0-a071-a0b11fdca341",
  "subject": {
    "type": "STAFF",
    "id": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiODZhYmMzMi1mMmUyLTRjM2MtOTk2Ny05N2JmYzljZTdjZTIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzU2NjUsImlhdCI6MTc5MzM3NDc2NSwianRpIjoiNjE0NzIxYzAtMThjZi00NjZiLTgyNzItYTYyODkxYTk4YTk2Iiwic2lkIjoiZGM0ZDUzMzMtOWI3Yi00MmQwLWEwNzEtYTBiMTFmZGNhMzQxIn0.rVqmatUJ_R1usPHPdhPi_e2CN5VyxBxFg1xaD6ZgrR0",
  "access_expires_at": "2026-10-30T15:54:25.840673348Z",
  "refresh_token": "RaPkf5eGCJMz6Ng_drTAb6lBAdToeK7PWbjJVlsmI9g",
  "refresh_expires_at": "2026-10-31T03:39:25.839933323Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-28302"
}
```

```json
{
  "challenge_id": "9f618ba4-3ccc-4fc4-a93a-6390c054fe77",
  "expires_at": "2026-10-30T15:44:26.021438742Z",
  "resend_available_at": "2026-10-30T15:39:27.021438742Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "830891",
  "sent_at": "2026-10-30T15:39:26.024910855Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9f618ba4-3ccc-4fc4-a93a-6390c054fe77",
  "code": "830891",
  "device_ref": "sandbox-28302"
}
```

```json
{
  "session_id": "c5882fdb-a475-4577-943a-250ccd055df3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NTY2NiwiaWF0IjoxNzkzMzc0NzY2LCJqdGkiOiI3NTkyMmM1ZS0wNzdjLTQyYzYtODI3NS0wN2M4NzZmNGM2YTgiLCJzaWQiOiJjNTg4MmZkYi1hNDc1LTQ1NzctOTQzYS0yNTBjY2QwNTVkZjMifQ.-20HgOhqLIvIGT0KKnydNzHBxqg1yUGPYHDpB9HByII",
  "access_expires_at": "2026-10-30T15:54:26.22747718Z",
  "refresh_token": "u40zrS7YIH77pRNV3rDkIDyUaSziKl2YbZkRA8ddY2Y",
  "refresh_expires_at": "2026-11-29T15:39:26.226719708Z",
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
  "command_id": "ace03eac-cd35-4afb-bd54-b9720f17ef9d",
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
  "command_id": "f0ad789b-1e1c-4d75-8082-ed4b305977d9",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4528,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:39:27Z",
    "sequence": 1793374767453
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
  "correlation_id": "dad19392-ac5c-44af-9d53-23d80f9387e6"
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
  "command_id": "46dc4c73-d3fa-4af0-a971-b4fb903c1107",
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
  "command_id": "1e57e06a-9b47-4d22-b5b8-e055d2760a9f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4528,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:39:27Z",
    "sequence": 1793374767926
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "ab26a05f-4ad9-406a-ae5a-794e50706dfd",
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
  "last_heartbeat_at": "2026-10-30T15:39:27.943062Z",
  "last_location_at": "2026-10-30T15:39:27.943062Z",
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
  "command_id": "9488b1bb-d845-463d-a399-e822be02d3fb",
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
  "session_id": "ab26a05f-4ad9-406a-ae5a-794e50706dfd",
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
  "last_heartbeat_at": "2026-10-30T15:39:27.943062Z",
  "last_location_at": "2026-10-30T15:39:27.943062Z",
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
  "phone": "+380686682573",
  "device_ref": "sandbox-6632"
}
```

```json
{
  "challenge_id": "4621749e-b194-4cb2-a790-fcb713ce90fc",
  "expires_at": "2026-10-30T15:44:28.693562583Z",
  "resend_available_at": "2026-10-30T15:39:29.693562583Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380686682573` → **200**

```json
{
  "phone": "+380686682573",
  "audience": "CLIENT",
  "code": "278295",
  "sent_at": "2026-10-30T15:39:28.69731454Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4621749e-b194-4cb2-a790-fcb713ce90fc",
  "code": "278295",
  "device_ref": "sandbox-6632"
}
```

```json
{
  "session_id": "aad7ce10-2f62-4a4d-9d40-63d465f5d47b",
  "subject": {
    "type": "CLIENT",
    "id": "87b77cd8-b22c-4061-b388-004db876a359"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4N2I3N2NkOC1iMjJjLTQwNjEtYjM4OC0wMDRkYjg3NmEzNTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc1NjY4LCJpYXQiOjE3OTMzNzQ3NjgsImp0aSI6IjM4MjA5YWNjLTJiNDEtNGI1OS1iNTQwLThmOWMxY2YzYzQ4YSIsInNpZCI6ImFhZDdjZTEwLTJmNjItNGE0ZC05ZDQwLTYzZDQ2NWY1ZDQ3YiJ9.FtSejqAqE3yjSf1838bQC9KiYWfiWhqNutsrgUdkHoc",
  "access_expires_at": "2026-10-30T15:54:28.946016764Z",
  "refresh_token": "_1FliM4TeT6XNOWuFQso5QgUvz67_mQhGCPv3eXiens",
  "refresh_expires_at": "2026-11-29T15:39:28.945489654Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "57f77ccc-93ef-4565-bf11-2ceabbe48015",
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
  "id": "cd6da62a-75dd-470d-b19d-0511c01d2720",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:44:29.151094Z",
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
  "command_id": "3e790cfa-61ff-4205-beb9-1fef20e5b2c7",
  "quote_id": "cd6da62a-75dd-470d-b19d-0511c01d2720",
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
  "id": "4e30b86a-f4c0-4015-88bd-e98fe50a34d8",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "87b77cd8-b22c-4061-b388-004db876a359",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:39:29.385547Z",
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

`POST /api/driver/v1/orders/4e30b86a-f4c0-4015-88bd-e98fe50a34d8/claim` → **409**

```json
{
  "command_id": "985ab5a0-6781-452c-bbff-14624acff39f"
}
```

```json
{
  "instance": "/api/driver/v1/orders/4e30b86a-f4c0-4015-88bd-e98fe50a34d8/claim",
  "status": 409,
  "title": "Driver not eligible",
  "type": "https://errors.blizz.taxi/driver-not-eligible",
  "code": "DRIVER_NOT_ELIGIBLE",
  "correlation_id": "8ba07e01-86ce-4f5b-b007-89212b06f53c"
}
```

`GET /api/operator/v1/orders/4e30b86a-f4c0-4015-88bd-e98fe50a34d8/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T15:39:29.388998Z",
      "actor": {
        "type": "CLIENT",
        "id": "87b77cd8-b22c-4061-b388-004db876a359",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "4e30b86a-f4c0-4015-88bd-e98fe50a34d8",
        "quote_id": "cd6da62a-75dd-470d-b19d-0511c01d2720",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "e0286666-17ed-484f-a273-687ee9f51fa0"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T15:39:29.393379Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "4e30b86a-f4c0-4015-88bd-e98fe50a34d8",
        "attempt_id": "30242af3-de97-407d-b5c4-72e85fc3d25f",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "e0286666-17ed-484f-a273-687ee9f51fa0"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-30T15:39:29.438167Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "4e30b86a-f4c0-4015-88bd-e98fe50a34d8",
        "attempt_id": "30242af3-de97-407d-b5c4-72e85fc3d25f"
      },
      "correlation_id": "e0286666-17ed-484f-a273-687ee9f51fa0"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "30242af3-de97-407d-b5c4-72e85fc3d25f",
        "generation": 1,
        "started_at": "2026-10-30T15:39:29.391594Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-30T15:39:29.438167Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-30T15:39:29.394738Z",
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
  "command_id": "6a9b19fa-0d3c-44b4-af29-deae6681e315",
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

`POST /api/driver/v1/work-sessions/ab26a05f-4ad9-406a-ae5a-794e50706dfd/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4528,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:39:30Z",
    "sequence": 1793374770801
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "ab26a05f-4ad9-406a-ae5a-794e50706dfd",
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
  "last_heartbeat_at": "2026-10-30T15:39:30.821813Z",
  "last_location_at": "2026-10-30T15:39:30.821813Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000001/zones` → **201**

```json
{
  "command_id": "28d104c5-550a-43a9-90a7-38673d7eb826",
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
  "id": "39a9da64-3b6e-4a1e-81e2-da331e4201ea",
  "state": "DRAFT",
  "version": 0
}
```

`POST /api/admin/v1/zones/39a9da64-3b6e-4a1e-81e2-da331e4201ea/publish` → **200**

```json
{
  "command_id": "0ba0a849-9c4d-433e-933d-ec0e0fa764a7",
  "expected_version": 0,
  "reason": "Sandbox"
}
```

```json
{
  "id": "39a9da64-3b6e-4a1e-81e2-da331e4201ea",
  "state": "PUBLISHED",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000001/zones` → **201**

```json
{
  "command_id": "57032be0-4150-4fe8-9bd3-a7cb0c97cc4f",
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
  "id": "6934c76f-29a4-499f-9a27-253d5381ab98",
  "state": "DRAFT",
  "version": 0
}
```

`POST /api/admin/v1/zones/6934c76f-29a4-499f-9a27-253d5381ab98/publish` → **200**

```json
{
  "command_id": "12581e3c-23af-4a47-ae50-d7f4453f2706",
  "expected_version": 0,
  "reason": "Sandbox"
}
```

```json
{
  "id": "6934c76f-29a4-499f-9a27-253d5381ab98",
  "state": "PUBLISHED",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/zones` → **201**

```json
{
  "command_id": "3178f698-73d7-4dd2-9a4c-0648e5b1aa1c",
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
  "id": "4eca5a82-a3ed-43a5-83f4-a256ece107ae",
  "state": "DRAFT",
  "version": 0
}
```

`POST /api/admin/v1/zones/4eca5a82-a3ed-43a5-83f4-a256ece107ae/publish` → **200**

```json
{
  "command_id": "cf1f987a-2ae0-42d6-825b-e8c36bfe13fa",
  "expected_version": 0,
  "reason": "Sandbox"
}
```

```json
{
  "id": "4eca5a82-a3ed-43a5-83f4-a256ece107ae",
  "state": "PUBLISHED",
  "version": 1
}
```

`GET /api/driver/v1/broadcast-orders?zone_id=39a9da64-3b6e-4a1e-81e2-da331e4201ea` → **200**

```json
[
  {
    "order_id": "4e30b86a-f4c0-4015-88bd-e98fe50a34d8",
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

`GET /api/driver/v1/broadcast-orders?zone_id=6934c76f-29a4-499f-9a27-253d5381ab98` → **200**

```json
[]
```

`GET /api/driver/v1/broadcast-orders?zone_id=4eca5a82-a3ed-43a5-83f4-a256ece107ae` → **400**

```json
{
  "instance": "/api/driver/v1/broadcast-orders",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "ae8260e2-064d-4f3f-aecb-4a73ebbd716a"
}
```

**Contract validation failed — scenario stopped.**

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
  "command_id": "c7e6b36a-683e-4d35-99d2-97fd5135cd5b",
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

`GET /api/operator/v1/orders/4e30b86a-f4c0-4015-88bd-e98fe50a34d8` → **200**

```json
{
  "id": "4e30b86a-f4c0-4015-88bd-e98fe50a34d8",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "87b77cd8-b22c-4061-b388-004db876a359",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:39:29.385547Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/4e30b86a-f4c0-4015-88bd-e98fe50a34d8/cancel` → **200**

```json
{
  "command_id": "a7a83a68-74c1-48bf-b215-3745d3a68378",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "4e30b86a-f4c0-4015-88bd-e98fe50a34d8",
  "short_number": 1,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "87b77cd8-b22c-4061-b388-004db876a359",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T15:39:29.385547Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "pl": "Brak wolnych aut",
      "ru": "Нет свободных машин",
      "en": "No cars available",
      "uk": "Немає вільних авто"
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
  "session_id": "ab26a05f-4ad9-406a-ae5a-794e50706dfd",
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
  "last_heartbeat_at": "2026-10-30T15:39:30.821813Z",
  "last_location_at": "2026-10-30T15:39:30.821813Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ab26a05f-4ad9-406a-ae5a-794e50706dfd/close` → **200**

```json
{
  "command_id": "463717b2-93d5-44aa-9bef-4b99bea7f4a7",
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
  "session_id": "92c046b4-4c6c-4afe-961a-41d5bedbb7f2",
  "subject": {
    "type": "STAFF",
    "id": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiODZhYmMzMi1mMmUyLTRjM2MtOTk2Ny05N2JmYzljZTdjZTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzU2NzQsImlhdCI6MTc5MzM3NDc3NCwianRpIjoiMzBlODA1ZTQtMzllZS00YTlkLTg3ZWEtMTA1ZWQ4MGM0ZGU1Iiwic2lkIjoiOTJjMDQ2YjQtNGM2Yy00YWZlLTk2MWEtNDFkNWJlZGJiN2YyIn0.O3KdK7HCChPQY-8VJIlqFFLgz185FUQU08GISf2VORo",
  "access_expires_at": "2026-10-30T15:54:34.154851467Z",
  "refresh_token": "EyWniCvxWqW8GtaHsXnqe5I_V5WINP0fMv1IZ5sDgpY",
  "refresh_expires_at": "2026-10-31T03:39:34.154409541Z",
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
  "device_ref": "sandbox-16140"
}
```

```json
{
  "challenge_id": "cae000fc-56c5-49e2-8bdf-7bd7104ad935",
  "expires_at": "2026-10-30T15:44:34.530892237Z",
  "resend_available_at": "2026-10-30T15:39:35.530892237Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "016174",
  "sent_at": "2026-10-30T15:39:34.533817949Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cae000fc-56c5-49e2-8bdf-7bd7104ad935",
  "code": "016174",
  "device_ref": "sandbox-16140"
}
```

```json
{
  "session_id": "9355d64c-0d93-4d52-ba97-5c6d62a70f47",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NTY3NCwiaWF0IjoxNzkzMzc0Nzc0LCJqdGkiOiIwMTA2NzhkMS1lODdlLTQ3ZTYtOGRmYS0wZjRkYjYzYTEwMDQiLCJzaWQiOiI5MzU1ZDY0Yy0wZDkzLTRkNTItYmE5Ny01YzZkNjJhNzBmNDcifQ.2GUY2KdByeX1c0Opj-Gn63V2RnvrdHSXQjZqIvkfo-A",
  "access_expires_at": "2026-10-30T15:54:34.733126026Z",
  "refresh_token": "r2VcPCKxd8op7N76esN0pa2jlZFgpCviJMnKJTtFouw",
  "refresh_expires_at": "2026-11-29T15:39:34.732714045Z",
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
  "command_id": "0ebc6d82-3caa-430e-a23a-1064541a59ae",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:39:35Z",
    "sequence": 1793374775957
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "db857f3c-00f2-42b7-8be3-8f8868ed3d37",
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
  "last_heartbeat_at": "2026-10-30T15:39:35.112109Z",
  "last_location_at": "2026-10-30T15:39:35.112109Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634654458",
  "device_ref": "sandbox-14634"
}
```

```json
{
  "challenge_id": "da8a6df2-217f-4409-b7d1-45085bc58b93",
  "expires_at": "2026-10-30T15:44:35.305789224Z",
  "resend_available_at": "2026-10-30T15:39:36.305789224Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380634654458` → **200**

```json
{
  "phone": "+380634654458",
  "audience": "CLIENT",
  "code": "403098",
  "sent_at": "2026-10-30T15:39:35.308572686Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "da8a6df2-217f-4409-b7d1-45085bc58b93",
  "code": "403098",
  "device_ref": "sandbox-14634"
}
```

```json
{
  "session_id": "1e2599ec-f118-40eb-a451-efdbaa763969",
  "subject": {
    "type": "CLIENT",
    "id": "f5a977b1-095b-4609-9e4b-07a28489d6cb"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNWE5NzdiMS0wOTViLTQ2MDktOWU0Yi0wN2EyODQ4OWQ2Y2IiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc1Njc1LCJpYXQiOjE3OTMzNzQ3NzUsImp0aSI6Ijk0MmM2NmZiLTdjOWEtNGFkZS05MzZjLTQ2NzU5N2I4YTM2MSIsInNpZCI6IjFlMjU5OWVjLWYxMTgtNDBlYi1hNDUxLWVmZGJhYTc2Mzk2OSJ9.eFl1UOpvR8jmTf66ZYBW_osKt4N83gUGkN_CiTBp6sA",
  "access_expires_at": "2026-10-30T15:54:35.512344899Z",
  "refresh_token": "y2i56OfACh-lEF4JOOxoo0SJQL-_HdaRfGBTJWqLLps",
  "refresh_expires_at": "2026-11-29T15:39:35.511908516Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "0ed9fad2-f834-49f1-99d6-1e17d04306b2",
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
  "id": "e91793c6-6854-4c37-9c08-a30833051d74",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:44:35.697485Z",
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
  "command_id": "39b62ba4-84f5-4d2d-97f3-551967789c70",
  "quote_id": "e91793c6-6854-4c37-9c08-a30833051d74",
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
  "id": "5e8602cf-36ba-4bb5-84e8-ca02f9da8f5f",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f5a977b1-095b-4609-9e4b-07a28489d6cb",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T15:39:35.887952Z",
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
    "id": "edbcd4e2-3447-49cc-80d8-6bcd3677ba29",
    "order_id": "5e8602cf-36ba-4bb5-84e8-ca02f9da8f5f",
    "expires_at": "2026-10-30T15:39:50.890925Z",
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

`POST /api/driver/v1/offers/edbcd4e2-3447-49cc-80d8-6bcd3677ba29/accept` → **200**

```json
{
  "command_id": "44badea2-26b6-49b4-8315-d1bc30df0e6c"
}
```

```json
{
  "id": "d017f8dc-997b-4ba0-add4-c10a04181642",
  "order_id": "5e8602cf-36ba-4bb5-84e8-ca02f9da8f5f",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "2d11753d-a2ea-4e23-a156-7090a3efc247",
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
  "command_id": "a3d7ef83-3abc-42c3-944b-0a994d6d5e5c",
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
  "changed_by": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T15:39:36.678356712Z"
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
  "id": "2d11753d-a2ea-4e23-a156-7090a3efc247",
  "order_id": "5e8602cf-36ba-4bb5-84e8-ca02f9da8f5f",
  "assignment_id": "d017f8dc-997b-4ba0-add4-c10a04181642",
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

`POST /api/driver/v1/work-sessions/db857f3c-00f2-42b7-8be3-8f8868ed3d37/heartbeat` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:39:37Z",
    "sequence": 1793374777277
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "db857f3c-00f2-42b7-8be3-8f8868ed3d37",
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
  "last_heartbeat_at": "2026-10-30T15:39:37.293798Z",
  "last_location_at": "2026-10-30T15:39:37.293798Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/2d11753d-a2ea-4e23-a156-7090a3efc247/arrive` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "24fb32ba-4f10-45fa-b686-213d4dd04010",
  "expected_version": 0
}
```

```json
{
  "id": "2d11753d-a2ea-4e23-a156-7090a3efc247",
  "order_id": "5e8602cf-36ba-4bb5-84e8-ca02f9da8f5f",
  "assignment_id": "d017f8dc-997b-4ba0-add4-c10a04181642",
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
  "arrived_at": "2026-10-30T15:39:37.497726Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/2d11753d-a2ea-4e23-a156-7090a3efc247/start` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "1974723a-76c7-4520-adc1-fd22e34c7ae5",
  "expected_version": 1
}
```

```json
{
  "id": "2d11753d-a2ea-4e23-a156-7090a3efc247",
  "order_id": "5e8602cf-36ba-4bb5-84e8-ca02f9da8f5f",
  "assignment_id": "d017f8dc-997b-4ba0-add4-c10a04181642",
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
  "arrived_at": "2026-10-30T15:39:37.497726Z",
  "started_at": "2026-10-30T15:39:37.692758Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/2d11753d-a2ea-4e23-a156-7090a3efc247/complete` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "b0afe4a4-5630-45b9-b3cd-f1b68ab90afa",
  "expected_version": 2,
  "reported_at": "2026-10-30T15:39:37Z",
  "cash_received": true
}
```

```json
{
  "id": "2d11753d-a2ea-4e23-a156-7090a3efc247",
  "order_id": "5e8602cf-36ba-4bb5-84e8-ca02f9da8f5f",
  "assignment_id": "d017f8dc-997b-4ba0-add4-c10a04181642",
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
  "arrived_at": "2026-10-30T15:39:37.497726Z",
  "started_at": "2026-10-30T15:39:37.692758Z",
  "completed_at": "2026-10-30T15:39:37.893775Z",
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
  "session_id": "db857f3c-00f2-42b7-8be3-8f8868ed3d37",
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
  "last_heartbeat_at": "2026-10-30T15:39:37.293798Z",
  "last_location_at": "2026-10-30T15:39:37.293798Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/db857f3c-00f2-42b7-8be3-8f8868ed3d37/close` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "b28a7c5b-cd6c-44a9-a0a7-a554cae687b2",
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
  "command_id": "911a4b25-f84e-4939-8d20-8fe14acfe424",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:39:38Z",
    "sequence": 1793374778478
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
  "correlation_id": "d96a7c3a-5e3f-4389-8e69-220b6e27cb43",
  "minimum_version": "9.0.0"
}
```

## After the update he can

`POST /api/driver/v1/work-sessions` (X-App-Platform: DRIVER_ANDROID X-App-Version: 9.0.0) → **201**

```json
{
  "command_id": "aae49bd1-9485-4e1e-964a-c065ff454b39",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:39:38Z",
    "sequence": 1793374778677
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "301c682a-c59b-4708-b4cf-da71e958ee15",
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
  "last_heartbeat_at": "2026-10-30T15:39:38.694563Z",
  "last_location_at": "2026-10-30T15:39:38.694563Z",
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
  "changed_by": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T15:39:36.678357Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "0888af3c-e31b-45e1-ada7-e4f69885644b",
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
  "changed_by": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T15:39:39.079263143Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "301c682a-c59b-4708-b4cf-da71e958ee15",
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
  "last_heartbeat_at": "2026-10-30T15:39:38.694563Z",
  "last_location_at": "2026-10-30T15:39:38.694563Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/301c682a-c59b-4708-b4cf-da71e958ee15/close` → **200**

```json
{
  "command_id": "f6cd4f0b-a2ff-4d08-b3b1-6aaa4b21e03d",
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
  "session_id": "1ffed6e9-d528-484f-b043-be291a963cd2",
  "subject": {
    "type": "STAFF",
    "id": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiODZhYmMzMi1mMmUyLTRjM2MtOTk2Ny05N2JmYzljZTdjZTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzU2NzksImlhdCI6MTc5MzM3NDc3OSwianRpIjoiOTQyNzQwMDEtMjVjOC00YmVmLTg0MjctOWRlNzIxMTZlY2VlIiwic2lkIjoiMWZmZWQ2ZTktZDUyOC00ODRmLWIwNDMtYmUyOTFhOTYzY2QyIn0.EgGTuocsCOUQxXXHtvIqQIbt0pZpzPl2hSELxlwAjds",
  "access_expires_at": "2026-10-30T15:54:39.847464558Z",
  "refresh_token": "1XLeRDKwwJYn9koaowRGae7jJzqlh1A_dPyPrjYYvZk",
  "refresh_expires_at": "2026-10-31T03:39:39.846962582Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "84757ba4-e947-45dd-9a64-fcbcc17b0483",
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
  "id": "99390d8a-a2fa-4f62-b36f-4e9a21b9a680",
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
  "created_by": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2",
  "created_at": "2026-10-30T15:39:40.042669Z",
  "updated_at": "2026-10-30T15:39:40.042669Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633318789",
  "device_ref": "sandbox-24606"
}
```

```json
{
  "challenge_id": "3593e05e-2cec-4812-97f0-a910eeedb9ef",
  "expires_at": "2026-10-30T15:44:40.23567072Z",
  "resend_available_at": "2026-10-30T15:39:41.23567072Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380633318789` → **200**

```json
{
  "phone": "+380633318789",
  "audience": "CLIENT",
  "code": "713621",
  "sent_at": "2026-10-30T15:39:40.24080117Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3593e05e-2cec-4812-97f0-a910eeedb9ef",
  "code": "713621",
  "device_ref": "sandbox-24606"
}
```

```json
{
  "session_id": "b27f4cc3-e29f-4183-8417-1a08671b7062",
  "subject": {
    "type": "CLIENT",
    "id": "22ef293a-c637-427f-a72e-7df5f760190f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMmVmMjkzYS1jNjM3LTQyN2YtYTcyZS03ZGY1Zjc2MDE5MGYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc1NjgwLCJpYXQiOjE3OTMzNzQ3ODAsImp0aSI6IjM5ZmY4OTU3LTc3OTEtNDdjMi1hYjc3LWNmOGJlMTg4NDI0NCIsInNpZCI6ImIyN2Y0Y2MzLWUyOWYtNDE4My04NDE3LTFhMDg2NzFiNzA2MiJ9.kfP3e9aRpWuTeOp1CDXYOaOaWi9McH52fipqXOpCFmY",
  "access_expires_at": "2026-10-30T15:54:40.454665616Z",
  "refresh_token": "7LMg-0yB__4z0fQO8woYhq-sEXUduetdCNwbXom1NH0",
  "refresh_expires_at": "2026-11-29T15:39:40.454213766Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380633318789` → **200**

```json
{
  "client_id": "22ef293a-c637-427f-a72e-7df5f760190f"
}
```

`POST /api/admin/v1/rider-wallets/22ef293a-c637-427f-a72e-7df5f760190f/top-ups` → **201**

```json
{
  "command_id": "08d71d2f-7532-45f7-be3b-862e0ef6f901",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "22ef293a-c637-427f-a72e-7df5f760190f",
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
      "id": "6231d469-4f78-4bdc-9e4c-cafaed885cfa",
      "at": "2026-10-30T15:39:40.828199Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1d9ef3c6-4b05-476d-92d9-5e2f8b6dd022",
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
  "id": "b0a5cc63-816a-4a59-ae65-366d90f16fcf",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:44:41.030138Z",
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
      "id": "99390d8a-a2fa-4f62-b36f-4e9a21b9a680",
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
  "device_ref": "sandbox-16060"
}
```

```json
{
  "challenge_id": "5c55c390-0c7f-4393-8156-4032cd9b963e",
  "expires_at": "2026-10-30T15:44:41.224493345Z",
  "resend_available_at": "2026-10-30T15:39:42.224493345Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "343186",
  "sent_at": "2026-10-30T15:39:41.226913239Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5c55c390-0c7f-4393-8156-4032cd9b963e",
  "code": "343186",
  "device_ref": "sandbox-16060"
}
```

```json
{
  "session_id": "ac371bde-95a0-41a6-87e6-6ddb2f7131cd",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NTY4MSwiaWF0IjoxNzkzMzc0NzgxLCJqdGkiOiIwZDM3NTQzOC0yNWQxLTQ0MTAtOGVkZC0zOTJjYzM0NWMwODQiLCJzaWQiOiJhYzM3MWJkZS05NWEwLTQxYTYtODdlNi02ZGRiMmY3MTMxY2QifQ.agT-EaLyL85Y2A_LNvLxSMz-Ux7bO2fyh53ycd1lDIQ",
  "access_expires_at": "2026-10-30T15:54:41.429505204Z",
  "refresh_token": "Ait9yHWJLGpy2aUCD1dfUUZ3aJ5n-ZwTCbgGQHvEuHE",
  "refresh_expires_at": "2026-11-29T15:39:41.42894447Z",
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
  "command_id": "0a345e2c-9bc3-446a-ba03-9116e69c256e",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:39:41Z",
    "sequence": 1793374781908
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5397a524-ed2e-4a17-8244-d3d528b9d037",
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
  "last_heartbeat_at": "2026-10-30T15:39:42.034071Z",
  "last_location_at": "2026-10-30T15:39:42.034071Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "60da556a-bab1-4545-8982-cc30485758cb",
  "quote_id": "b0a5cc63-816a-4a59-ae65-366d90f16fcf",
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
  "id": "901b507b-a3e9-4a6b-a0e6-4e75a8c4b351",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "22ef293a-c637-427f-a72e-7df5f760190f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T15:39:42.335767Z",
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
  "client_id": "22ef293a-c637-427f-a72e-7df5f760190f",
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
      "id": "6231d469-4f78-4bdc-9e4c-cafaed885cfa",
      "at": "2026-10-30T15:39:40.828199Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2",
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
    "id": "ce236c9f-23c2-4256-be4d-7fa87ab56089",
    "order_id": "901b507b-a3e9-4a6b-a0e6-4e75a8c4b351",
    "expires_at": "2026-10-30T15:39:57.340867Z",
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

`POST /api/driver/v1/offers/ce236c9f-23c2-4256-be4d-7fa87ab56089/accept` → **200**

```json
{
  "command_id": "51763cdf-2133-455c-8233-3268cb74fffa"
}
```

```json
{
  "id": "cbcf68a5-36a2-4bf9-801a-4eb64789e2db",
  "order_id": "901b507b-a3e9-4a6b-a0e6-4e75a8c4b351",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b3378097-3fb5-4010-9e63-854ed407e0d8",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b3378097-3fb5-4010-9e63-854ed407e0d8",
  "order_id": "901b507b-a3e9-4a6b-a0e6-4e75a8c4b351",
  "assignment_id": "cbcf68a5-36a2-4bf9-801a-4eb64789e2db",
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

`POST /api/driver/v1/work-sessions/5397a524-ed2e-4a17-8244-d3d528b9d037/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:39:45Z",
    "sequence": 1793374785299
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5397a524-ed2e-4a17-8244-d3d528b9d037",
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
  "last_heartbeat_at": "2026-10-30T15:39:45.314769Z",
  "last_location_at": "2026-10-30T15:39:45.314769Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/b3378097-3fb5-4010-9e63-854ed407e0d8/arrive` → **200**

```json
{
  "command_id": "35a5b524-7bed-460a-8143-a4f568167c25",
  "expected_version": 0
}
```

```json
{
  "id": "b3378097-3fb5-4010-9e63-854ed407e0d8",
  "order_id": "901b507b-a3e9-4a6b-a0e6-4e75a8c4b351",
  "assignment_id": "cbcf68a5-36a2-4bf9-801a-4eb64789e2db",
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
  "arrived_at": "2026-10-30T15:39:45.507463Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/b3378097-3fb5-4010-9e63-854ed407e0d8/start` → **200**

```json
{
  "command_id": "afe55a91-9cd9-4fe2-b67a-a4e9732531fc",
  "expected_version": 1
}
```

```json
{
  "id": "b3378097-3fb5-4010-9e63-854ed407e0d8",
  "order_id": "901b507b-a3e9-4a6b-a0e6-4e75a8c4b351",
  "assignment_id": "cbcf68a5-36a2-4bf9-801a-4eb64789e2db",
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
  "arrived_at": "2026-10-30T15:39:45.507463Z",
  "started_at": "2026-10-30T15:39:45.711898Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/b3378097-3fb5-4010-9e63-854ed407e0d8/complete` → **200**

```json
{
  "command_id": "c14d20ee-d753-409a-b4aa-a8abe26b1fbc",
  "expected_version": 2,
  "reported_at": "2026-10-30T15:39:45Z",
  "cash_received": true
}
```

```json
{
  "id": "b3378097-3fb5-4010-9e63-854ed407e0d8",
  "order_id": "901b507b-a3e9-4a6b-a0e6-4e75a8c4b351",
  "assignment_id": "cbcf68a5-36a2-4bf9-801a-4eb64789e2db",
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
  "arrived_at": "2026-10-30T15:39:45.507463Z",
  "started_at": "2026-10-30T15:39:45.711898Z",
  "completed_at": "2026-10-30T15:39:45.917222Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "22ef293a-c637-427f-a72e-7df5f760190f",
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
      "id": "615d72b2-2211-4fc7-9e1b-58887f3c7aad",
      "at": "2026-10-30T15:39:46.182051Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "901b507b-a3e9-4a6b-a0e6-4e75a8c4b351"
    },
    {
      "id": "6231d469-4f78-4bdc-9e4c-cafaed885cfa",
      "at": "2026-10-30T15:39:40.828199Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/99390d8a-a2fa-4f62-b36f-4e9a21b9a680/archive` → **200**

```json
{
  "command_id": "2e1b4c15-8d61-4f25-9225-3ecc8fc28bf8",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "99390d8a-a2fa-4f62-b36f-4e9a21b9a680",
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
  "created_by": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2",
  "created_at": "2026-10-30T15:39:40.042669Z",
  "updated_at": "2026-10-30T15:39:49.308099Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5397a524-ed2e-4a17-8244-d3d528b9d037",
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
  "last_heartbeat_at": "2026-10-30T15:39:45.314769Z",
  "last_location_at": "2026-10-30T15:39:45.314769Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5397a524-ed2e-4a17-8244-d3d528b9d037/close` → **200**

```json
{
  "command_id": "5e74daf3-87df-49f1-80a9-a36e05c9898f",
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

Done: order 901b507b-a3e9-4a6b-a0e6-4e75a8c4b351.

# Scenario: broadcast-abuse

## Anna goes online in Warsaw

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000002",
  "device_ref": "sandbox-21343"
}
```

```json
{
  "challenge_id": "c29d3a2d-e73d-440b-b43d-c0a269ffa59a",
  "expires_at": "2026-10-30T15:44:49.879421933Z",
  "resend_available_at": "2026-10-30T15:39:50.879421933Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000002` → **200**

```json
{
  "phone": "+48500000002",
  "audience": "DRIVER",
  "code": "116535",
  "sent_at": "2026-10-30T15:39:49.882834313Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c29d3a2d-e73d-440b-b43d-c0a269ffa59a",
  "code": "116535",
  "device_ref": "sandbox-21343"
}
```

```json
{
  "session_id": "a476b55b-3e26-4d78-81ca-ccdf5b0cd9c8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000405"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDUiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NTY5MCwiaWF0IjoxNzkzMzc0NzkwLCJqdGkiOiIwMzIxMTlmOS03YjczLTQzMzAtYTY2OC02NGQ2ZjQzYThiNTMiLCJzaWQiOiJhNDc2YjU1Yi0zZTI2LTRkNzgtODFjYS1jY2RmNWIwY2Q5YzgifQ.WPsyJXusJo6JEDPeBno50k27dmkN0NMm9dL4DyB5Aug",
  "access_expires_at": "2026-10-30T15:54:50.091474954Z",
  "refresh_token": "-VxJi-OyOdAHU9rZ_uhoyfPGkE9Rl2ArUbWG0PJh7rY",
  "refresh_expires_at": "2026-11-29T15:39:50.090980604Z",
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
  "command_id": "dd5af8b5-48be-4ff7-a41e-23297bab5a63",
  "vehicle_id": "5a000000-0000-4000-8000-000000000505",
  "location": {
    "lat": 52.2297,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:39:50Z",
    "sequence": 1793374790657
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "f927d4b9-d299-40a2-88da-6141fee9147e",
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
  "last_heartbeat_at": "2026-10-30T15:39:50.675728Z",
  "last_location_at": "2026-10-30T15:39:50.675728Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## 5 seconds later her phone reports Lviv: not taken as her position

`POST /api/driver/v1/work-sessions/f927d4b9-d299-40a2-88da-6141fee9147e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 49.8397,
    "lon": 24.0297,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:39:55Z",
    "sequence": 1793374795871
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "f927d4b9-d299-40a2-88da-6141fee9147e",
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
  "last_heartbeat_at": "2026-10-30T15:39:55.88849Z",
  "last_location_at": "2026-10-30T15:39:50.675728Z",
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
  "session_id": "d503d06a-058d-4c37-8ddc-8be37475f66e",
  "subject": {
    "type": "STAFF",
    "id": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiODZhYmMzMi1mMmUyLTRjM2MtOTk2Ny05N2JmYzljZTdjZTIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzU2OTYsImlhdCI6MTc5MzM3NDc5NiwianRpIjoiZDlkMzE2NTktOTRjZC00ODVkLWE2ZDItMGM2OTFlMWM0MjcyIiwic2lkIjoiZDUwM2QwNmEtMDU4ZC00YzM3LThkZGMtOGJlMzc0NzVmNjZlIn0.1H6AUbuSbIBv83YGBFRVQ0m-cuqzi3RsfU9VndD1cGM",
  "access_expires_at": "2026-10-30T15:54:56.283813805Z",
  "refresh_token": "EURLFfhocCBsobagRz8S6JJ60wmo3u0_ugCVgcXmMVM",
  "refresh_expires_at": "2026-10-31T03:39:56.283451779Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "at": "2026-10-30T15:39:56.460388415Z",
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
      "last_location_at": "2026-10-30T15:39:50.675728Z",
      "last_heartbeat_at": "2026-10-30T15:39:55.88849Z",
      "order_id": null
    }
  ]
}
```

## A fix next to the last accepted one is taken again

`POST /api/driver/v1/work-sessions/f927d4b9-d299-40a2-88da-6141fee9147e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2299,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:39:56Z",
    "sequence": 1793374796654
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "f927d4b9-d299-40a2-88da-6141fee9147e",
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
  "last_heartbeat_at": "2026-10-30T15:39:56.671071Z",
  "last_location_at": "2026-10-30T15:39:56.671071Z",
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
  "session_id": "f927d4b9-d299-40a2-88da-6141fee9147e",
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
  "last_heartbeat_at": "2026-10-30T15:39:56.671071Z",
  "last_location_at": "2026-10-30T15:39:56.671071Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f927d4b9-d299-40a2-88da-6141fee9147e/close` → **200**

```json
{
  "command_id": "47bfa3d7-2fb8-4b7f-9d5b-7ff7ff907a40",
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
  "device_ref": "sandbox-28939"
}
```

```json
{
  "challenge_id": "92ed38a9-f716-4346-ab06-2f98bc4b5e9e",
  "expires_at": "2026-10-30T15:44:57.240962964Z",
  "resend_available_at": "2026-10-30T15:39:58.240962964Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "320791",
  "sent_at": "2026-10-30T15:39:57.243421549Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "92ed38a9-f716-4346-ab06-2f98bc4b5e9e",
  "code": "320791",
  "device_ref": "sandbox-28939"
}
```

```json
{
  "session_id": "980deb6a-2466-4d74-bbfa-87683e317632",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NTY5NywiaWF0IjoxNzkzMzc0Nzk3LCJqdGkiOiI2YmRkZTg5NS1mYTkzLTQyOWMtOWM1ZS0wMmM5OGRiOGM2MjAiLCJzaWQiOiI5ODBkZWI2YS0yNDY2LTRkNzQtYmJmYS04NzY4M2UzMTc2MzIifQ.1xrQvWXGLX3dFcFebjOWTnOQAOkgFuO90CT1EPVwULw",
  "access_expires_at": "2026-10-30T15:54:57.444840331Z",
  "refresh_token": "PXabyhneFXL3MjJxiUMIVep7X_xlWHMUuuREq3prsFE",
  "refresh_expires_at": "2026-11-29T15:39:57.444458365Z",
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
  "device_ref": "sandbox-5242"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "9fafcec6-e047-4c4a-b63d-be6d1cc67efe",
  "retryable": true,
  "retry_after_seconds": 1
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000001",
  "device_ref": "sandbox-5242"
}
```

```json
{
  "challenge_id": "15a3c395-7277-40cf-83d6-60ceda32d880",
  "expires_at": "2026-10-30T15:44:58.998426847Z",
  "resend_available_at": "2026-10-30T15:39:59.998426847Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "776891",
  "sent_at": "2026-10-30T15:39:59.000327725Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "15a3c395-7277-40cf-83d6-60ceda32d880",
  "code": "776891",
  "device_ref": "sandbox-5242"
}
```

```json
{
  "session_id": "b8310a12-d996-47c1-b34a-1aeb6dc48cd7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NTY5OSwiaWF0IjoxNzkzMzc0Nzk5LCJqdGkiOiIwYTNmZTZiMS1kZGViLTQ5MGUtODE2OC05ZTFhMWIyNWIzMmYiLCJzaWQiOiJiODMxMGExMi1kOTk2LTQ3YzEtYjM0YS0xYWViNmRjNDhjZDcifQ.0qS0_WKHCg-n9SdMpScDGxbbjtMyTrtZm5hPgq3fx0Q",
  "access_expires_at": "2026-10-30T15:54:59.199945359Z",
  "refresh_token": "pAd7AQcEexQxqrvGobqv3GEGM-oZ1xUoN5J_8jgfZCE",
  "refresh_expires_at": "2026-11-29T15:39:59.199422666Z",
  "account_created": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000002",
  "device_ref": "sandbox-16135"
}
```

```json
{
  "challenge_id": "2e15e3aa-c94c-4455-bda6-1f4cdb9e4452",
  "expires_at": "2026-10-30T15:44:59.375293706Z",
  "resend_available_at": "2026-10-30T15:40:00.375293706Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000002` → **200**

```json
{
  "phone": "+48500000002",
  "audience": "DRIVER",
  "code": "816354",
  "sent_at": "2026-10-30T15:39:59.377248892Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2e15e3aa-c94c-4455-bda6-1f4cdb9e4452",
  "code": "816354",
  "device_ref": "sandbox-16135"
}
```

```json
{
  "session_id": "1e4d88cf-d91c-4ac1-a808-3d428c9c70ac",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000405"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDUiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NTY5OSwiaWF0IjoxNzkzMzc0Nzk5LCJqdGkiOiJhYzVjMWUwZC02N2IyLTQ0ZDEtODYxOS04MTU2NzQ2OWYwMzYiLCJzaWQiOiIxZTRkODhjZi1kOTFjLTRhYzEtYTgwOC0zZDQyOGM5YzcwYWMifQ.-bPl4YcPiUj0PUb9SCmrXcjVO1HB4cZcdKX5X1wgDGU",
  "access_expires_at": "2026-10-30T15:54:59.590996391Z",
  "refresh_token": "22FWl58Ig8eAFulvlELsfRhbNRbGMPZ47n6b6HMliK8",
  "refresh_expires_at": "2026-11-29T15:39:59.59050534Z",
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
  "command_id": "eada81d5-e483-4971-926b-48ba3951048e",
  "vehicle_id": "5a000000-0000-4000-8000-000000000505",
  "location": {
    "lat": 52.2297,
    "lon": 21.1700,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:43:04Z",
    "sequence": 1793374984153
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "f1f0d7b7-6fb3-4e4f-b36e-933d094d65f9",
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
  "last_heartbeat_at": "2026-10-30T15:43:04.170858Z",
  "last_location_at": "2026-10-30T15:43:04.170858Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders: nobody is near, the order goes to the ALL tab

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600107787",
  "device_ref": "sandbox-17240"
}
```

```json
{
  "challenge_id": "4d4ed925-99fb-4d18-a663-5ff7ea8e2328",
  "expires_at": "2026-10-30T15:48:04.375704094Z",
  "resend_available_at": "2026-10-30T15:43:05.375704094Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600107787` → **200**

```json
{
  "phone": "+48600107787",
  "audience": "CLIENT",
  "code": "565816",
  "sent_at": "2026-10-30T15:43:04.378891093Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4d4ed925-99fb-4d18-a663-5ff7ea8e2328",
  "code": "565816",
  "device_ref": "sandbox-17240"
}
```

```json
{
  "session_id": "d8d6a60c-81d9-428c-8694-4118f79481af",
  "subject": {
    "type": "CLIENT",
    "id": "6a6db886-01eb-4561-b2c8-c217d3136e46"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YTZkYjg4Ni0wMWViLTQ1NjEtYjJjOC1jMjE3ZDMxMzZlNDYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc1ODg0LCJpYXQiOjE3OTMzNzQ5ODQsImp0aSI6IjhkNjFmOTViLThmYWYtNGUwMi04MTIwLTI4MzNiYmZiZmFjMyIsInNpZCI6ImQ4ZDZhNjBjLTgxZDktNDI4Yy04Njk0LTQxMThmNzk0ODFhZiJ9.1gnzGmvjRIX5oXebFYwfZPoLdBVLpRxdjkxkbllVRq4",
  "access_expires_at": "2026-10-30T15:58:04.603852205Z",
  "refresh_token": "hKAetGNAx4oFciZsovD7pMr_49KZJ0oUjOpBQG314Dw",
  "refresh_expires_at": "2026-11-29T15:43:04.603377806Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "042079ce-e981-4cda-8d9d-590c70086e1d",
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
  "id": "a0a5603c-6eb5-451e-8586-c7387d3fd1de",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 4942,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:48:04.809764Z",
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
  "command_id": "94532a69-4361-4483-b50e-000c6b0a711f",
  "quote_id": "a0a5603c-6eb5-451e-8586-c7387d3fd1de",
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
  "id": "5fb1438c-2948-484e-b4ad-b091dd1a9f69",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6a6db886-01eb-4561-b2c8-c217d3136e46",
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
  "created_at": "2026-10-30T15:43:05.024894Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/5fb1438c-2948-484e-b4ad-b091dd1a9f69` → **200**

```json
{
  "id": "5fb1438c-2948-484e-b4ad-b091dd1a9f69",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6a6db886-01eb-4561-b2c8-c217d3136e46",
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
  "created_at": "2026-10-30T15:43:05.024894Z",
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

`POST /api/driver/v1/orders/5fb1438c-2948-484e-b4ad-b091dd1a9f69/claim` → **422**

```json
{
  "command_id": "c3a87493-fa6f-4856-97a4-3ac5fbe05a0d"
}
```

```json
{
  "instance": "/api/driver/v1/orders/5fb1438c-2948-484e-b4ad-b091dd1a9f69/claim",
  "status": 422,
  "title": "Pickup too far",
  "type": "https://errors.blizz.taxi/pickup-too-far",
  "code": "PICKUP_TOO_FAR",
  "correlation_id": "7862ff34-c66f-4a8b-8173-22fda21375f1"
}
```

`GET /api/rider/v1/orders/5fb1438c-2948-484e-b4ad-b091dd1a9f69` → **200**

```json
{
  "id": "5fb1438c-2948-484e-b4ad-b091dd1a9f69",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6a6db886-01eb-4561-b2c8-c217d3136e46",
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
  "created_at": "2026-10-30T15:43:05.024894Z",
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

`POST /api/driver/v1/orders/e8a2eb7c-eea5-4ac0-bce4-d1ba854e65c9/claim` → **404**

```json
{
  "command_id": "46af6bf4-8861-4b06-aded-dec3e5cbe921"
}
```

```json
{
  "instance": "/api/driver/v1/orders/e8a2eb7c-eea5-4ac0-bce4-d1ba854e65c9/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "9d5a849f-31a3-4650-8f6c-126630a53876"
}
```

`POST /api/driver/v1/orders/df8a8483-6aa6-445e-91f0-419fd981b80c/claim` → **404**

```json
{
  "command_id": "6c1dcae2-4f59-4b93-8a11-331e0aaee379"
}
```

```json
{
  "instance": "/api/driver/v1/orders/df8a8483-6aa6-445e-91f0-419fd981b80c/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "724c84af-b3c3-4d40-affa-dcc9b325ca30"
}
```

`POST /api/driver/v1/orders/32c1c2f4-b956-480a-8ea7-79e7815cf185/claim` → **404**

```json
{
  "command_id": "18aaf18b-5912-42ef-9f50-1dab08d38084"
}
```

```json
{
  "instance": "/api/driver/v1/orders/32c1c2f4-b956-480a-8ea7-79e7815cf185/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "84a058f1-d91a-49a6-8829-7781a570c547"
}
```

`POST /api/driver/v1/orders/eb83f7b9-abc8-4e64-b612-4df7934fb128/claim` → **404**

```json
{
  "command_id": "af4b7f9c-8369-462a-8945-d18d0bb5849e"
}
```

```json
{
  "instance": "/api/driver/v1/orders/eb83f7b9-abc8-4e64-b612-4df7934fb128/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "9413adf2-e9f3-4f44-8fa1-24ba70f328fa"
}
```

`POST /api/driver/v1/orders/9d293a49-0a06-4126-8871-00b9f5824233/claim` → **404**

```json
{
  "command_id": "76d15257-e915-4c48-a6c0-9173d408444f"
}
```

```json
{
  "instance": "/api/driver/v1/orders/9d293a49-0a06-4126-8871-00b9f5824233/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "990bc1a6-b280-4eb6-a449-d8520a70b656"
}
```

`POST /api/driver/v1/orders/89f60255-b42e-4223-a3d8-29a36d7f76ef/claim` → **404**

```json
{
  "command_id": "03d8665e-bb9d-4c36-baf5-d25fd18fe2a1"
}
```

```json
{
  "instance": "/api/driver/v1/orders/89f60255-b42e-4223-a3d8-29a36d7f76ef/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "66e4573e-52ce-44b1-8b7c-d8a7e62f537d"
}
```

`POST /api/driver/v1/orders/1318f90b-ef13-4d7f-ad0b-2e356ea1b834/claim` → **404**

```json
{
  "command_id": "8e9c62e5-deb0-41ea-8506-519de8d37ae1"
}
```

```json
{
  "instance": "/api/driver/v1/orders/1318f90b-ef13-4d7f-ad0b-2e356ea1b834/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "ae1496fc-5a94-4d9d-b2dd-3cda7ae39e44"
}
```

`POST /api/driver/v1/orders/5efa9634-19e5-46f2-b665-764fabdf3c56/claim` → **404**

```json
{
  "command_id": "dbe81ff5-68e7-496d-818c-236d218a5030"
}
```

```json
{
  "instance": "/api/driver/v1/orders/5efa9634-19e5-46f2-b665-764fabdf3c56/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "e3fc249e-c9dc-497a-81bb-988fa076aab1"
}
```

`POST /api/driver/v1/orders/6dec8c2d-f59f-4edc-a6f7-b3288671c205/claim` → **404**

```json
{
  "command_id": "cc0ad5ff-ddc0-47b3-813a-b5c61e4ef843"
}
```

```json
{
  "instance": "/api/driver/v1/orders/6dec8c2d-f59f-4edc-a6f7-b3288671c205/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "2fbfcfaa-bebb-4d3a-8ae9-8f57500f647f"
}
```

`POST /api/driver/v1/orders/f3795d2e-ee96-443f-9e76-15cb4823c47f/claim` → **404**

```json
{
  "command_id": "4bc077d9-b3e8-4a6d-870f-cf85c1eb5fd0"
}
```

```json
{
  "instance": "/api/driver/v1/orders/f3795d2e-ee96-443f-9e76-15cb4823c47f/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "14a98b06-cfd8-4cb3-ae44-7408b0a8cad5"
}
```

`POST /api/driver/v1/orders/f0564797-bbb9-4604-852a-1db2be3af269/claim` → **404**

```json
{
  "command_id": "7963e9e2-8009-4426-864a-b30b924f6a30"
}
```

```json
{
  "instance": "/api/driver/v1/orders/f0564797-bbb9-4604-852a-1db2be3af269/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "1cd5b095-d969-48ef-a96a-4fc43d626fcf"
}
```

`POST /api/driver/v1/orders/0e0ed4a5-68a6-4768-8d7c-e172578f9233/claim` → **404**

```json
{
  "command_id": "00f770ed-ce65-4455-a302-b19fb08a3865"
}
```

```json
{
  "instance": "/api/driver/v1/orders/0e0ed4a5-68a6-4768-8d7c-e172578f9233/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "1209fad1-ff73-4e0a-a054-36593b734394"
}
```

`POST /api/driver/v1/orders/b4a595f7-141c-4eed-882e-5c4d52645be4/claim` → **404**

```json
{
  "command_id": "e60f1001-15f0-4359-9f2a-7fe747551c5d"
}
```

```json
{
  "instance": "/api/driver/v1/orders/b4a595f7-141c-4eed-882e-5c4d52645be4/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "d8521bf0-7c8a-4557-8f07-7b2d10f78c53"
}
```

`POST /api/driver/v1/orders/e87b7e88-0841-45a5-adff-a06a7a09333f/claim` → **404**

```json
{
  "command_id": "6312318f-2373-423b-b028-b01edffb33f8"
}
```

```json
{
  "instance": "/api/driver/v1/orders/e87b7e88-0841-45a5-adff-a06a7a09333f/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "ee134554-ea6f-4520-96ad-138e6abe1c10"
}
```

`POST /api/driver/v1/orders/5fe8f7f6-a9e8-45f5-a39f-0c7dcb1f260e/claim` → **404**

```json
{
  "command_id": "92a71dbe-4ddc-45f9-abb2-c6261225b085"
}
```

```json
{
  "instance": "/api/driver/v1/orders/5fe8f7f6-a9e8-45f5-a39f-0c7dcb1f260e/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "9755ac19-8243-4a8e-8a7e-6a354f9de05d"
}
```

`POST /api/driver/v1/orders/bf15e776-ed1e-4a08-9d26-d3a9d3e99d09/claim` → **404**

```json
{
  "command_id": "b46e5035-e4ad-41e4-92eb-4c1d81af7141"
}
```

```json
{
  "instance": "/api/driver/v1/orders/bf15e776-ed1e-4a08-9d26-d3a9d3e99d09/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "e28237e6-d31d-479a-a0b6-bce1d9d25ede"
}
```

`POST /api/driver/v1/orders/683ba7c9-0d9b-4850-8a0b-19533c74a350/claim` → **404**

```json
{
  "command_id": "9e2f54fd-63a1-4c10-9bff-214c8315fd0c"
}
```

```json
{
  "instance": "/api/driver/v1/orders/683ba7c9-0d9b-4850-8a0b-19533c74a350/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "d611440b-8d7a-4fd7-86e3-1836875cd74d"
}
```

`POST /api/driver/v1/orders/3386ad4c-2a1f-4c65-8871-ad332942a203/claim` → **404**

```json
{
  "command_id": "a7ba6a90-0b94-487d-a141-76e0b5904a05"
}
```

```json
{
  "instance": "/api/driver/v1/orders/3386ad4c-2a1f-4c65-8871-ad332942a203/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "cd1f27ad-1dba-4413-8a11-d1e0f4d9df62"
}
```

`POST /api/driver/v1/orders/03bc70fc-589d-41e1-a25c-1ee73edfda0a/claim` → **404**

```json
{
  "command_id": "da6e33ce-b9c9-4690-bcad-606f5bf6d180"
}
```

```json
{
  "instance": "/api/driver/v1/orders/03bc70fc-589d-41e1-a25c-1ee73edfda0a/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "1385950b-5033-40e3-af89-613b1f476bda"
}
```

`POST /api/driver/v1/orders/59670b75-2be5-42bc-99d5-c97da85663f2/claim` → **404**

```json
{
  "command_id": "464152bb-b734-4712-a321-322464f36e91"
}
```

```json
{
  "instance": "/api/driver/v1/orders/59670b75-2be5-42bc-99d5-c97da85663f2/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "ab465bac-eaec-4397-97b2-74b9e9f6aad1"
}
```

`POST /api/driver/v1/orders/d64f4f96-4046-4cf7-8541-7651f62415a3/claim` → **404**

```json
{
  "command_id": "7d7e01e9-e6d1-4749-aa47-35224bc0c318"
}
```

```json
{
  "instance": "/api/driver/v1/orders/d64f4f96-4046-4cf7-8541-7651f62415a3/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "382ca2da-d461-48e5-b5af-0b76248b5db7"
}
```

`POST /api/driver/v1/orders/9d60f01f-292b-4e1a-9c33-f49c0d5606c4/claim` → **404**

```json
{
  "command_id": "97d05320-58f7-47d2-877f-15ebae504ffa"
}
```

```json
{
  "instance": "/api/driver/v1/orders/9d60f01f-292b-4e1a-9c33-f49c0d5606c4/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "fda8ce87-d15f-44ac-b4ef-917859b4b028"
}
```

`POST /api/driver/v1/orders/a7bf17dc-23e7-4df9-9832-e30e2184de88/claim` → **404**

```json
{
  "command_id": "d97d6a34-7770-4d66-9037-f479aa689bba"
}
```

```json
{
  "instance": "/api/driver/v1/orders/a7bf17dc-23e7-4df9-9832-e30e2184de88/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "5a79155e-6219-4890-9ade-7826aa80cd53"
}
```

`POST /api/driver/v1/orders/bf07f2f7-7cb2-4f99-a8a9-b44d95e874e5/claim` → **404**

```json
{
  "command_id": "e04d8b3b-3bf1-4a1b-b860-a43d41d01cfe"
}
```

```json
{
  "instance": "/api/driver/v1/orders/bf07f2f7-7cb2-4f99-a8a9-b44d95e874e5/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "f543d8d5-feea-480d-8ee9-b20e4fe47375"
}
```

`POST /api/driver/v1/orders/58be77ec-5526-4a89-abc4-d31422b1b704/claim` → **404**

```json
{
  "command_id": "80dbe4df-a3bd-4f9f-9e51-e1d0857fe326"
}
```

```json
{
  "instance": "/api/driver/v1/orders/58be77ec-5526-4a89-abc4-d31422b1b704/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "bff6bf20-aa8a-49d7-9bd0-031069f9baca"
}
```

`POST /api/driver/v1/orders/6d0c8640-0f96-4e93-bd42-e0b360e3c7f7/claim` → **404**

```json
{
  "command_id": "f9404344-6675-459b-8a59-df4c5af64162"
}
```

```json
{
  "instance": "/api/driver/v1/orders/6d0c8640-0f96-4e93-bd42-e0b360e3c7f7/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "759cf58f-d3d6-48fe-85ea-5998625e47dd"
}
```

`POST /api/driver/v1/orders/5e452460-6775-4a08-acec-1eab0d3ebaf3/claim` → **404**

```json
{
  "command_id": "1d091d8b-446d-4700-88f4-36837b01e3e0"
}
```

```json
{
  "instance": "/api/driver/v1/orders/5e452460-6775-4a08-acec-1eab0d3ebaf3/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "3f59e4f3-4575-4744-9df8-388e92d1637c"
}
```

`POST /api/driver/v1/orders/10e57597-0466-4dde-b9b6-13df383ca187/claim` → **404**

```json
{
  "command_id": "09b12ed4-391f-48f7-987c-c52595fe342f"
}
```

```json
{
  "instance": "/api/driver/v1/orders/10e57597-0466-4dde-b9b6-13df383ca187/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "dcd02291-c6d9-4df6-a798-4f476e04ed3c"
}
```

`POST /api/driver/v1/orders/9f168ee3-c9dd-4254-ba50-4c09713ba383/claim` → **404**

```json
{
  "command_id": "27cfb320-3584-429b-b6ac-5a24160f7f46"
}
```

```json
{
  "instance": "/api/driver/v1/orders/9f168ee3-c9dd-4254-ba50-4c09713ba383/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "0e1c092e-c99f-4a69-8912-7e6fa9327100"
}
```

`POST /api/driver/v1/orders/0e7ee468-32d9-4892-aed2-2e5b237fd97e/claim` → **429**

```json
{
  "command_id": "7eb81ba1-221f-4d2f-85f8-cceaadc8110c"
}
```

```json
{
  "instance": "/api/driver/v1/orders/0e7ee468-32d9-4892-aed2-2e5b237fd97e/claim",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "32f67ae1-2f37-460d-bd4c-f4c2ba395c2e",
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
  "command_id": "04a768ac-4285-4322-8088-1c85022ae1a2",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:43:12Z",
    "sequence": 1793374992733
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "8e4b5824-cf3c-46a6-8695-f00255646c2a",
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
  "last_heartbeat_at": "2026-10-30T15:43:12.753399Z",
  "last_location_at": "2026-10-30T15:43:12.753399Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/broadcast-orders` → **200**

```json
[
  {
    "order_id": "5fb1438c-2948-484e-b4ad-b091dd1a9f69",
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

`POST /api/driver/v1/orders/5fb1438c-2948-484e-b4ad-b091dd1a9f69/claim` → **409**

```json
{
  "command_id": "a1977910-c471-4528-8bbb-b693294b017a"
}
```

```json
{
  "instance": "/api/driver/v1/orders/5fb1438c-2948-484e-b4ad-b091dd1a9f69/claim",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "f068f1ae-8404-47a2-a104-949d6ae66571"
}
```

`POST /api/driver/v1/orders/5fb1438c-2948-484e-b4ad-b091dd1a9f69/claim` → **200**

```json
{
  "command_id": "093e26f7-e70a-4d35-b90e-0ea923b60d28"
}
```

```json
{
  "id": "349c63e7-7fdc-4842-9c8e-adbbc4d4a4f9",
  "order_id": "5fb1438c-2948-484e-b4ad-b091dd1a9f69",
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "source": "BROADCAST",
  "state": "COMMITTED",
  "trip_id": "994f630f-df03-4a11-b446-47ecfbb04ff8",
  "trip_phase": "TO_PICKUP"
}
```

## Piotr cancels at the rider's request (sandbox clean-up)

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "994f630f-df03-4a11-b446-47ecfbb04ff8",
  "order_id": "5fb1438c-2948-484e-b4ad-b091dd1a9f69",
  "assignment_id": "349c63e7-7fdc-4842-9c8e-adbbc4d4a4f9",
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

`POST /api/driver/v1/trips/994f630f-df03-4a11-b446-47ecfbb04ff8/cancel` → **200**

```json
{
  "command_id": "7747e8b6-6cbb-4ff2-acd9-84e83c0b4371",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "994f630f-df03-4a11-b446-47ecfbb04ff8",
  "order_id": "5fb1438c-2948-484e-b4ad-b091dd1a9f69",
  "assignment_id": "349c63e7-7fdc-4842-9c8e-adbbc4d4a4f9",
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

`GET /api/rider/v1/orders/5fb1438c-2948-484e-b4ad-b091dd1a9f69` → **200**

```json
{
  "id": "5fb1438c-2948-484e-b4ad-b091dd1a9f69",
  "short_number": 4,
  "status": "CANCELLED",
  "status_reason": "PASSENGER_ASKED",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "6a6db886-01eb-4561-b2c8-c217d3136e46",
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
    "id": "349c63e7-7fdc-4842-9c8e-adbbc4d4a4f9",
    "order_id": "5fb1438c-2948-484e-b4ad-b091dd1a9f69",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "vehicle_id": "5a000000-0000-4000-8000-000000000504",
    "source": "BROADCAST",
    "state": "RELEASED",
    "trip_id": "994f630f-df03-4a11-b446-47ecfbb04ff8",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T15:43:05.024894Z",
  "cancellation": {
    "by": "DRIVER",
    "reason_code": "PASSENGER_ASKED",
    "reason_labels": {
      "pl": "Pasażer poprosił o anulowanie",
      "ru": "Пассажир попросил отменить",
      "en": "Passenger asked to cancel",
      "uk": "Пасажир попросив скасувати"
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
  "session_id": "f1f0d7b7-6fb3-4e4f-b36e-933d094d65f9",
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
  "last_heartbeat_at": "2026-10-30T15:43:04.170858Z",
  "last_location_at": "2026-10-30T15:43:04.170858Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f1f0d7b7-6fb3-4e4f-b36e-933d094d65f9/close` → **200**

```json
{
  "command_id": "71d337ea-0ee1-4946-8b4e-f4c3a2e199a0",
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
  "session_id": "8e4b5824-cf3c-46a6-8695-f00255646c2a",
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
  "last_heartbeat_at": "2026-10-30T15:43:12.753399Z",
  "last_location_at": "2026-10-30T15:43:12.753399Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8e4b5824-cf3c-46a6-8695-f00255646c2a/close` → **200**

```json
{
  "command_id": "5e14e13b-ce1e-49cb-a262-ae922dd38a72",
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
  "session_id": "6bb28979-9fe5-4434-aac2-e2cbdc8cf274",
  "subject": {
    "type": "STAFF",
    "id": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiODZhYmMzMi1mMmUyLTRjM2MtOTk2Ny05N2JmYzljZTdjZTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzU4OTUsImlhdCI6MTc5MzM3NDk5NSwianRpIjoiNDUzNTdhNWYtNGRlZi00ZDdmLWJiNDItN2FmNzdkMjMxMDBjIiwic2lkIjoiNmJiMjg5NzktOWZlNS00NDM0LWFhYzItZTJjYmRjOGNmMjc0In0.4BiAwv6gO7DgEKcr-2sM9IHjgDLoF9eeHtRTt4P_HCc",
  "access_expires_at": "2026-10-30T15:58:15.32349409Z",
  "refresh_token": "JK8MhU6EIFe3RrURR_6l0TwVbtu6x6E0X1Et5-BQ4Ng",
  "refresh_expires_at": "2026-10-31T03:43:15.323070823Z",
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
  "command_id": "19fe63cb-8dc8-4d84-b789-6811a00c5b7a",
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
  "session_id": "b764beca-04ac-46d4-98a6-3ef5ecf96c7a",
  "subject": {
    "type": "STAFF",
    "id": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiODZhYmMzMi1mMmUyLTRjM2MtOTk2Ny05N2JmYzljZTdjZTIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzU4OTYsImlhdCI6MTc5MzM3NDk5NiwianRpIjoiNDVjOTVjMjQtMTM4OS00NjQ0LTkxNTktZGExNzgwODc3OGVmIiwic2lkIjoiYjc2NGJlY2EtMDRhYy00NmQ0LTk4YTYtM2VmNWVjZjk2YzdhIn0.f10aSsQCw-pd5qyY2i_jD7hq5GFnXoAM5SnY0yKRrI0",
  "access_expires_at": "2026-10-30T15:58:16.16483554Z",
  "refresh_token": "VVXcVGubdhf8Fks7h-0REV4Nxj3OnqqcXT0I6bpfsJ8",
  "refresh_expires_at": "2026-10-31T03:43:16.164402699Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.245268870",
    "linkedid": "1730052700.245268870",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380677133944"
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
    "id": "1730052700.245268870",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "036fa4b3-88bb-4945-983f-b521cfb2ad43",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380677133944",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T15:43:16.364128Z",
      "answered_at": null,
      "ended_at": "2026-10-30T15:43:16.386917Z",
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
    "id": "1730052600.1797831066",
    "linkedid": "1730052600.1797831066",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380677133944"
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
      "id": "f6ae2dde-155d-47dc-a3ef-a59f4ef59cb2",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380677133944",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T15:43:16.626978Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/f6ae2dde-155d-47dc-a3ef-a59f4ef59cb2/answer` → **200**

```json
{
  "command_id": "3a04cba2-58a4-476d-81de-63729aea532a"
}
```

```json
{
  "id": "f6ae2dde-155d-47dc-a3ef-a59f4ef59cb2",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380677133944",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2",
  "order_ids": [],
  "started_at": "2026-10-30T15:43:16.626978Z",
  "answered_at": "2026-10-30T15:43:16.869646Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.1797831066",
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
    "id": "1730052600.1797831066",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "f6ae2dde-155d-47dc-a3ef-a59f4ef59cb2",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677133944",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2",
      "order_ids": [],
      "started_at": "2026-10-30T15:43:16.626978Z",
      "answered_at": "2026-10-30T15:43:16.869646Z",
      "ended_at": "2026-10-30T15:43:17.092908Z",
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
      "id": "f6ae2dde-155d-47dc-a3ef-a59f4ef59cb2",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677133944",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2",
      "order_ids": [],
      "started_at": "2026-10-30T15:43:16.626978Z",
      "answered_at": "2026-10-30T15:43:16.869646Z",
      "ended_at": "2026-10-30T15:43:17.092908Z",
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
      "id": "f6ae2dde-155d-47dc-a3ef-a59f4ef59cb2",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677133944",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2",
      "order_ids": [],
      "started_at": "2026-10-30T15:43:16.626978Z",
      "answered_at": "2026-10-30T15:43:16.869646Z",
      "ended_at": "2026-10-30T15:43:17.092908Z",
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
      "id": "f6ae2dde-155d-47dc-a3ef-a59f4ef59cb2",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677133944",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2",
      "order_ids": [],
      "started_at": "2026-10-30T15:43:16.626978Z",
      "answered_at": "2026-10-30T15:43:16.869646Z",
      "ended_at": "2026-10-30T15:43:17.092908Z",
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
      "id": "f6ae2dde-155d-47dc-a3ef-a59f4ef59cb2",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677133944",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2",
      "order_ids": [],
      "started_at": "2026-10-30T15:43:16.626978Z",
      "answered_at": "2026-10-30T15:43:16.869646Z",
      "ended_at": "2026-10-30T15:43:17.092908Z",
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
      "id": "f6ae2dde-155d-47dc-a3ef-a59f4ef59cb2",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677133944",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2",
      "order_ids": [],
      "started_at": "2026-10-30T15:43:16.626978Z",
      "answered_at": "2026-10-30T15:43:16.869646Z",
      "ended_at": "2026-10-30T15:43:17.092908Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T15:43:26.86543Z"
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
      "id": "f6ae2dde-155d-47dc-a3ef-a59f4ef59cb2",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677133944",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2",
      "order_ids": [],
      "started_at": "2026-10-30T15:43:16.626978Z",
      "answered_at": "2026-10-30T15:43:16.869646Z",
      "ended_at": "2026-10-30T15:43:17.092908Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T15:43:26.86543Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/f6ae2dde-155d-47dc-a3ef-a59f4ef59cb2/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/f6ae2dde-155d-47dc-a3ef-a59f4ef59cb2/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=f6ae2dde-155d-47dc-a3ef-a59f4ef59cb2` → **200**

```json
{
  "changes": [
    {
      "id": "20b55d0d-f82f-48a0-9c8a-6d325d8dd110",
      "occurred_at": "2026-10-30T15:43:28.569178Z",
      "actor_type": "STAFF",
      "actor_id": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "f6ae2dde-155d-47dc-a3ef-a59f4ef59cb2",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"125d094a-63cf-4a66-bb5a-f4f933bdecea\", \"order_ids\": []}",
      "correlation_id": "0acd3ae3-b925-4321-84b3-699e87ffa2f6"
    },
    {
      "id": "8489bb55-b2f3-40fb-a7a6-fc6a288ebc39",
      "occurred_at": "2026-10-30T15:43:28.544647Z",
      "actor_type": "STAFF",
      "actor_id": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "f6ae2dde-155d-47dc-a3ef-a59f4ef59cb2",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"125d094a-63cf-4a66-bb5a-f4f933bdecea\", \"order_ids\": []}",
      "correlation_id": "822b5f2c-fbc7-4258-89b3-6f43066260e1"
    }
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
```

Done: call f6ae2dde-155d-47dc-a3ef-a59f4ef59cb2 recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-15305"
}
```

```json
{
  "challenge_id": "5a3922bb-5636-444f-8ddc-9788e85e7f85",
  "expires_at": "2026-10-30T15:48:28.807261259Z",
  "resend_available_at": "2026-10-30T15:43:29.807261259Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "531158",
  "sent_at": "2026-10-30T15:43:28.809464316Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5a3922bb-5636-444f-8ddc-9788e85e7f85",
  "code": "531158",
  "device_ref": "sandbox-15305"
}
```

```json
{
  "session_id": "ffb7e553-0001-48b0-89b7-c40026d43458",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NTkwOSwiaWF0IjoxNzkzMzc1MDA5LCJqdGkiOiJlNWI2YmZmZS0zOWZhLTRiMDktOTEwMy1kNzRkNGIzN2IxMzQiLCJzaWQiOiJmZmI3ZTU1My0wMDAxLTQ4YjAtODliNy1jNDAwMjZkNDM0NTgifQ.6yC304OtLb1NYqmTI8ZboTDvy0kNuDS6MbDu-gIjavg",
  "access_expires_at": "2026-10-30T15:58:29.034547742Z",
  "refresh_token": "LEDOAf9_AfFyvr5_shSsraBxNoeZQeUNN58uSPnRDUw",
  "refresh_expires_at": "2026-11-29T15:43:29.034130984Z",
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
  "command_id": "4e990992-d941-4294-911b-74e2825544c9",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:43:29Z",
    "sequence": 1793375009447
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f8249954-1b40-46ea-8c6b-cf1e70d961f6",
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
  "last_heartbeat_at": "2026-10-30T15:43:29.464423Z",
  "last_location_at": "2026-10-30T15:43:29.464423Z",
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
  "session_id": "1e966b75-ad32-4d93-8ad0-9bc2a369f2e2",
  "subject": {
    "type": "STAFF",
    "id": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiODZhYmMzMi1mMmUyLTRjM2MtOTk2Ny05N2JmYzljZTdjZTIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzU5MDksImlhdCI6MTc5MzM3NTAwOSwianRpIjoiZDBlMmM0ZWQtOWE0Zi00ZmM4LWFkYjUtMGE3YjViYzZiZWVhIiwic2lkIjoiMWU5NjZiNzUtYWQzMi00ZDkzLThhZDAtOWJjMmEzNjlmMmUyIn0.mxtr-nZio--ICotUaD19kRrRtLemQcvtGgKYVjeaCh4",
  "access_expires_at": "2026-10-30T15:58:29.896967093Z",
  "refresh_token": "8K0jxrgmK971G-1kLwpYN7Y3P6yWFm1QCSEljD2M6yc",
  "refresh_expires_at": "2026-10-31T03:43:29.896501493Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "13118058-6002-45fa-9f4c-c3f00381b224",
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
  "id": "d34abf31-05f3-460e-920f-f23205c17d4d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:48:30.105673Z",
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
  "command_id": "026694a7-2be2-447e-9093-949bada0e38a",
  "quote_id": "d34abf31-05f3-460e-920f-f23205c17d4d",
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
    "phone": "+380674285252"
  }
}
```

```json
{
  "id": "30b5e674-8050-41b1-a071-a9574399c946",
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
  "created_at": "2026-10-30T15:43:30.335832Z",
  "caller": {
    "name": "Олена",
    "phone": "+380674285252"
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
    "id": "57723d66-800d-4ff5-9956-adc34e9e8977",
    "order_id": "30b5e674-8050-41b1-a071-a9574399c946",
    "expires_at": "2026-10-30T15:43:45.342757Z",
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

`POST /api/driver/v1/offers/57723d66-800d-4ff5-9956-adc34e9e8977/accept` → **200**

```json
{
  "command_id": "6877d7a1-a0c0-4b91-b138-e4648aed8260"
}
```

```json
{
  "id": "299478b7-4441-42e8-88a3-46ff5c67cca2",
  "order_id": "30b5e674-8050-41b1-a071-a9574399c946",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b879b446-ac34-47ec-9749-777fad41e58b",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380674285252` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380674285252` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380674285252` → **200**

```json
[
  {
    "phone": "+380674285252",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T15:43:32.337134431Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380674285252` → **200**

```json
[
  {
    "phone": "+380674285252",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T15:43:32.337134431Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380674285252` → **200**

```json
[
  {
    "phone": "+380674285252",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T15:43:32.337134431Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b879b446-ac34-47ec-9749-777fad41e58b",
  "order_id": "30b5e674-8050-41b1-a071-a9574399c946",
  "assignment_id": "299478b7-4441-42e8-88a3-46ff5c67cca2",
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
    "phone": "+380674285252"
  }
}
```

`POST /api/driver/v1/work-sessions/f8249954-1b40-46ea-8c6b-cf1e70d961f6/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:43:33Z",
    "sequence": 1793375013310
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f8249954-1b40-46ea-8c6b-cf1e70d961f6",
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
  "last_heartbeat_at": "2026-10-30T15:43:33.326934Z",
  "last_location_at": "2026-10-30T15:43:33.326934Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/b879b446-ac34-47ec-9749-777fad41e58b/arrive` → **200**

```json
{
  "command_id": "adad589e-3006-4887-b1fa-efebe10b5b4e",
  "expected_version": 0
}
```

```json
{
  "id": "b879b446-ac34-47ec-9749-777fad41e58b",
  "order_id": "30b5e674-8050-41b1-a071-a9574399c946",
  "assignment_id": "299478b7-4441-42e8-88a3-46ff5c67cca2",
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
  "arrived_at": "2026-10-30T15:43:33.536099Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380674285252"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380674285252` → **200**

```json
[
  {
    "phone": "+380674285252",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T15:43:32.337134431Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380674285252` → **200**

```json
[
  {
    "phone": "+380674285252",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T15:43:32.337134431Z"
  },
  {
    "phone": "+380674285252",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T15:43:34.344464324Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380674285252` → **200**

```json
[
  {
    "phone": "+380674285252",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T15:43:32.337134431Z"
  },
  {
    "phone": "+380674285252",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T15:43:34.344464324Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380674285252` → **200**

```json
[
  {
    "phone": "+380674285252",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T15:43:32.337134431Z"
  },
  {
    "phone": "+380674285252",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T15:43:34.344464324Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/b879b446-ac34-47ec-9749-777fad41e58b/start` → **200**

```json
{
  "command_id": "20e3e7d6-b4c1-459f-b591-db33e50f6b24",
  "expected_version": 1
}
```

```json
{
  "id": "b879b446-ac34-47ec-9749-777fad41e58b",
  "order_id": "30b5e674-8050-41b1-a071-a9574399c946",
  "assignment_id": "299478b7-4441-42e8-88a3-46ff5c67cca2",
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
  "arrived_at": "2026-10-30T15:43:33.536099Z",
  "started_at": "2026-10-30T15:43:34.867227Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380674285252"
  }
}
```

`POST /api/driver/v1/trips/b879b446-ac34-47ec-9749-777fad41e58b/complete` → **200**

```json
{
  "command_id": "f21d4d2a-127d-4114-b50f-492c6bc45dcf",
  "expected_version": 2,
  "reported_at": "2026-10-30T15:43:35Z",
  "cash_received": true
}
```

```json
{
  "id": "b879b446-ac34-47ec-9749-777fad41e58b",
  "order_id": "30b5e674-8050-41b1-a071-a9574399c946",
  "assignment_id": "299478b7-4441-42e8-88a3-46ff5c67cca2",
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
  "arrived_at": "2026-10-30T15:43:33.536099Z",
  "started_at": "2026-10-30T15:43:34.867227Z",
  "completed_at": "2026-10-30T15:43:35.077614Z",
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
  "session_id": "f8249954-1b40-46ea-8c6b-cf1e70d961f6",
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
  "last_heartbeat_at": "2026-10-30T15:43:33.326934Z",
  "last_location_at": "2026-10-30T15:43:33.326934Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f8249954-1b40-46ea-8c6b-cf1e70d961f6/close` → **200**

```json
{
  "command_id": "e9f76038-a4ff-4cf2-8bdd-337d0b5ca8e3",
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
  "phone": "+380630225341",
  "device_ref": "sandbox-19896"
}
```

```json
{
  "challenge_id": "5c086289-e484-428f-9783-bf7c8ab0e649",
  "expires_at": "2026-10-30T15:48:35.69954322Z",
  "resend_available_at": "2026-10-30T15:43:36.69954322Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380630225341` → **200**

```json
{
  "phone": "+380630225341",
  "audience": "CLIENT",
  "code": "869960",
  "sent_at": "2026-10-30T15:43:35.70166658Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5c086289-e484-428f-9783-bf7c8ab0e649",
  "code": "869960",
  "device_ref": "sandbox-19896"
}
```

```json
{
  "session_id": "63dec150-f0aa-4ccf-afa5-4921b327b41b",
  "subject": {
    "type": "CLIENT",
    "id": "77f2ff42-e527-45bf-9835-1f7e46925d6b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3N2YyZmY0Mi1lNTI3LTQ1YmYtOTgzNS0xZjdlNDY5MjVkNmIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc1OTE1LCJpYXQiOjE3OTMzNzUwMTUsImp0aSI6ImMxZGRjMDlkLTA0ZTItNGQwOC05ZDI3LTE0YTlhMTA5MTMzOSIsInNpZCI6IjYzZGVjMTUwLWYwYWEtNGNjZi1hZmE1LTQ5MjFiMzI3YjQxYiJ9.Rj6NtZuWlKEhFWEXv8k_Unds-reIAoxZHihIcS-0C-M",
  "access_expires_at": "2026-10-30T15:58:35.923326352Z",
  "refresh_token": "JytKTYxPrA1vQ5DPtzvTyJPG28wVSAb2XYCN1-iWugo",
  "refresh_expires_at": "2026-11-29T15:43:35.922181268Z",
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
        "ru": "Передумал ехать",
        "en": "Changed my mind",
        "uk": "Передумав їхати"
      },
      "driver_outcome": null
    },
    {
      "code": "WAIT_TOO_LONG",
      "labels": {
        "pl": "Zbyt długie oczekiwanie",
        "ru": "Долго ждать машину",
        "en": "The wait is too long",
        "uk": "Довго чекати авто"
      },
      "driver_outcome": null
    },
    {
      "code": "WRONG_ADDRESS",
      "labels": {
        "pl": "Błędny adres",
        "ru": "Ошибся адресом",
        "en": "Wrong address",
        "uk": "Помилився адресою"
      },
      "driver_outcome": null
    },
    {
      "code": "OTHER_TRANSPORT",
      "labels": {
        "pl": "Inny transport",
        "ru": "Уеду на другом транспорте",
        "en": "Found other transport",
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
  "device_ref": "sandbox-968"
}
```

```json
{
  "challenge_id": "af0501fd-295e-4a9f-9101-0f47587f8e4e",
  "expires_at": "2026-10-30T15:48:36.320217353Z",
  "resend_available_at": "2026-10-30T15:43:37.320217353Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "929989",
  "sent_at": "2026-10-30T15:43:36.322205145Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "af0501fd-295e-4a9f-9101-0f47587f8e4e",
  "code": "929989",
  "device_ref": "sandbox-968"
}
```

```json
{
  "session_id": "cee848e7-451e-4e27-bfa8-125c75adb7b1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NTkxNiwiaWF0IjoxNzkzMzc1MDE2LCJqdGkiOiJlZTA4MDQ2NS05OTZkLTQzZmEtOGQwOS1mMzdiYzFkZTQzZmMiLCJzaWQiOiJjZWU4NDhlNy00NTFlLTRlMjctYmZhOC0xMjVjNzVhZGI3YjEifQ.j-zClsCQyfwJ1XuMRZphQXKEWp90Nlf-YFOHvHsEcH8",
  "access_expires_at": "2026-10-30T15:58:36.551539281Z",
  "refresh_token": "nbqczUUrGPvUDn3q1smYdRoXlryTWZRsvckmaCAVXCE",
  "refresh_expires_at": "2026-11-29T15:43:36.551159019Z",
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
        "ru": "Пассажир не вышел",
        "en": "Passenger did not show up",
        "uk": "Пасажир не вийшов"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "PASSENGER_ASKED",
      "labels": {
        "pl": "Pasażer poprosił o anulowanie",
        "ru": "Пассажир попросил отменить",
        "en": "Passenger asked to cancel",
        "uk": "Пасажир попросив скасувати"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "VEHICLE_PROBLEM",
      "labels": {
        "pl": "Awaria samochodu",
        "ru": "Неисправность автомобиля",
        "en": "Vehicle problem",
        "uk": "Несправність автомобіля"
      },
      "driver_outcome": "RETURN_TO_SEARCH"
    },
    {
      "code": "CANNOT_REACH",
      "labels": {
        "pl": "Nie mogę dojechać",
        "ru": "Не могу подъехать",
        "en": "Cannot reach the pickup",
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
  "session_id": "71820747-a471-4197-9e02-66cc3c828904",
  "subject": {
    "type": "STAFF",
    "id": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiODZhYmMzMi1mMmUyLTRjM2MtOTk2Ny05N2JmYzljZTdjZTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzU5MTcsImlhdCI6MTc5MzM3NTAxNywianRpIjoiYzNiNzZlN2EtODAyYS00Y2E5LTgzZjYtZGZlNTJjZGJhZDZlIiwic2lkIjoiNzE4MjA3NDctYTQ3MS00MTk3LTllMDItNjZjYzNjODI4OTA0In0.m5SdWBIEhmFHlIZG02A7pGufntll-phfznQmZ2Q-tkU",
  "access_expires_at": "2026-10-30T15:58:37.170297232Z",
  "refresh_token": "7cq1IzwVtmlT-F11bHHD61ts5jiVXwd-Ri9-r7kYPH8",
  "refresh_expires_at": "2026-10-31T03:43:37.16981806Z",
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
  "session_id": "56034ae8-e87d-4a73-996d-23574e0fe2ff",
  "subject": {
    "type": "STAFF",
    "id": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiODZhYmMzMi1mMmUyLTRjM2MtOTk2Ny05N2JmYzljZTdjZTIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzU5MTcsImlhdCI6MTc5MzM3NTAxNywianRpIjoiNTUxMDkxMDUtODZhNC00ZWRlLThiY2QtZWU3MDk2Yjc4MjgzIiwic2lkIjoiNTYwMzRhZTgtZTg3ZC00YTczLTk5NmQtMjM1NzRlMGZlMmZmIn0.J7CCDXNxBc1vxFxxOeROtV3h_m7MYIDBlCLSde8G8ps",
  "access_expires_at": "2026-10-30T15:58:37.610202041Z",
  "refresh_token": "7Ur2d4XhMa0b4DHZfxM8pLbfouYEVYx6o1K3eToRH7g",
  "refresh_expires_at": "2026-10-31T03:43:37.609767777Z",
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
        "ru": "Пассажир попросил",
        "en": "Passenger asked",
        "uk": "Пасажир попросив"
      },
      "driver_outcome": null
    },
    {
      "code": "DUPLICATE",
      "labels": {
        "pl": "Duplikat zamówienia",
        "ru": "Дубль заказа",
        "en": "Duplicate order",
        "uk": "Дубль замовлення"
      },
      "driver_outcome": null
    },
    {
      "code": "NO_CARS",
      "labels": {
        "pl": "Brak wolnych aut",
        "ru": "Нет свободных машин",
        "en": "No cars available",
        "uk": "Немає вільних авто"
      },
      "driver_outcome": null
    },
    {
      "code": "TEST_ORDER",
      "labels": {
        "pl": "Zamówienie testowe",
        "ru": "Тестовый заказ",
        "en": "Test order",
        "uk": "Тестове замовлення"
      },
      "driver_outcome": null
    },
    {
      "code": "OPERATOR_ERROR",
      "labels": {
        "pl": "Błąd operatora",
        "ru": "Ошибка оператора",
        "en": "Operator error",
        "uk": "Помилка оператора"
      },
      "driver_outcome": null
    },
    {
      "code": "VEHICLE_BREAKDOWN",
      "labels": {
        "pl": "Awaria auta w trasie",
        "ru": "Поломка автомобиля в пути",
        "en": "Vehicle broke down on the way",
        "uk": "Поломка автомобіля в дорозі"
      },
      "driver_outcome": null
    },
    {
      "code": "ACCIDENT",
      "labels": {
        "pl": "Wypadek",
        "ru": "ДТП",
        "en": "Accident",
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
  "command_id": "e2ee4309-5093-486c-8525-3b21df86bf70",
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
  "id": "29bcb3de-4ff9-449e-8c9c-71b6fdb55f50",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:48:38.011551Z",
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
  "command_id": "c7e6f85c-e703-4ae5-91e4-0544dded682d",
  "quote_id": "29bcb3de-4ff9-449e-8c9c-71b6fdb55f50",
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
  "id": "c4623fd8-a945-4849-993a-854af24cfb3a",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "77f2ff42-e527-45bf-9835-1f7e46925d6b",
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
  "created_at": "2026-10-30T15:43:38.235424Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c4623fd8-a945-4849-993a-854af24cfb3a` → **200**

```json
{
  "id": "c4623fd8-a945-4849-993a-854af24cfb3a",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "77f2ff42-e527-45bf-9835-1f7e46925d6b",
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
  "created_at": "2026-10-30T15:43:38.235424Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/c4623fd8-a945-4849-993a-854af24cfb3a/cancel` → **200**

```json
{
  "command_id": "bd134a81-56ea-4639-a8c7-def04a4156b2",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "c4623fd8-a945-4849-993a-854af24cfb3a",
  "short_number": 6,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "77f2ff42-e527-45bf-9835-1f7e46925d6b",
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
  "created_at": "2026-10-30T15:43:38.235424Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "WAIT_TOO_LONG",
    "reason_labels": {
      "pl": "Zbyt długie oczekiwanie",
      "ru": "Долго ждать машину",
      "en": "The wait is too long",
      "uk": "Довго чекати авто"
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
  "command_id": "a101ff44-93ca-44fd-b898-6133c7fa45b6",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:43:39Z",
    "sequence": 1793375019153
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "80ad0231-7ecd-4efc-9d10-fb3b4a2b680c",
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
  "last_heartbeat_at": "2026-10-30T15:43:39.170075Z",
  "last_location_at": "2026-10-30T15:43:39.170075Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-3494"
}
```

```json
{
  "challenge_id": "3b4821a7-a7ca-4264-8f67-b7f0f3a1a7b7",
  "expires_at": "2026-10-30T15:48:39.374055224Z",
  "resend_available_at": "2026-10-30T15:43:40.374055224Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "794915",
  "sent_at": "2026-10-30T15:43:39.377166165Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3b4821a7-a7ca-4264-8f67-b7f0f3a1a7b7",
  "code": "794915",
  "device_ref": "sandbox-3494"
}
```

```json
{
  "session_id": "eee5653d-cb0a-43d8-af68-d382805b90a5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NTkxOSwiaWF0IjoxNzkzMzc1MDE5LCJqdGkiOiJiYmMzMTk2NS05MTMyLTQzNjEtOTY2YS1mOGJlYWU4NTY4NWQiLCJzaWQiOiJlZWU1NjUzZC1jYjBhLTQzZDgtYWY2OC1kMzgyODA1YjkwYTUifQ.tAERjERqHMrOPllESVbXUOllTCk4o0xzk8H0hr_K5j8",
  "access_expires_at": "2026-10-30T15:58:39.605848109Z",
  "refresh_token": "g8gi-ng0iIdqiKdwpD-sNtYhV0oOJuHBTXgdehNB_lk",
  "refresh_expires_at": "2026-11-29T15:43:39.605207986Z",
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
  "command_id": "e260eed2-be3b-4dd0-a64d-9bbcf15f6208",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:43:40Z",
    "sequence": 1793375020284
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "8a5e9ead-8c5d-46ed-92cd-20a7493f49c5",
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
  "last_heartbeat_at": "2026-10-30T15:43:40.045542Z",
  "last_location_at": "2026-10-30T15:43:40.045542Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a9182595-03b9-4546-bb2f-738d1dd6f7e8",
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
  "id": "4e9050ee-4889-4c81-9fa1-59bc9c88ad6d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:48:40.270190Z",
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
  "command_id": "30f305f2-bf74-4cf7-aad4-86b15e6311d6",
  "quote_id": "4e9050ee-4889-4c81-9fa1-59bc9c88ad6d",
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
  "id": "e4bfc0a1-62ee-4406-a620-5e82b3c81502",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "77f2ff42-e527-45bf-9835-1f7e46925d6b",
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
  "created_at": "2026-10-30T15:43:40.490024Z",
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
    "id": "dd33d345-8c88-4c93-ad08-af758f9f6596",
    "order_id": "e4bfc0a1-62ee-4406-a620-5e82b3c81502",
    "expires_at": "2026-10-30T15:43:55.49243Z",
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

`POST /api/driver/v1/offers/dd33d345-8c88-4c93-ad08-af758f9f6596/accept` → **200**

```json
{
  "command_id": "0a3ea475-0e1b-416e-ac3f-96fd945750a7"
}
```

```json
{
  "id": "6abe7bec-3608-4274-86c4-1967a9494731",
  "order_id": "e4bfc0a1-62ee-4406-a620-5e82b3c81502",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "52fd5431-482d-4263-95ba-0fdd0989b55e",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "52fd5431-482d-4263-95ba-0fdd0989b55e",
  "order_id": "e4bfc0a1-62ee-4406-a620-5e82b3c81502",
  "assignment_id": "6abe7bec-3608-4274-86c4-1967a9494731",
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

`POST /api/driver/v1/trips/52fd5431-482d-4263-95ba-0fdd0989b55e/cancel` → **200**

```json
{
  "command_id": "671a95a7-1df6-4903-8964-12380093ee2c",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "52fd5431-482d-4263-95ba-0fdd0989b55e",
  "order_id": "e4bfc0a1-62ee-4406-a620-5e82b3c81502",
  "assignment_id": "6abe7bec-3608-4274-86c4-1967a9494731",
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

`GET /api/rider/v1/orders/e4bfc0a1-62ee-4406-a620-5e82b3c81502` → **200**

```json
{
  "id": "e4bfc0a1-62ee-4406-a620-5e82b3c81502",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "77f2ff42-e527-45bf-9835-1f7e46925d6b",
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
    "id": "6abe7bec-3608-4274-86c4-1967a9494731",
    "order_id": "e4bfc0a1-62ee-4406-a620-5e82b3c81502",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "52fd5431-482d-4263-95ba-0fdd0989b55e",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T15:43:40.490024Z",
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
    "id": "e781e328-6161-4ae4-a47d-3cbf284cf208",
    "order_id": "e4bfc0a1-62ee-4406-a620-5e82b3c81502",
    "expires_at": "2026-10-30T15:43:56.353717Z",
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

`POST /api/driver/v1/offers/e781e328-6161-4ae4-a47d-3cbf284cf208/accept` → **200**

```json
{
  "command_id": "9edc2889-a05e-496f-a40e-752dfd20d906"
}
```

```json
{
  "id": "47591562-8d75-4daa-bedb-2439e0fc27bd",
  "order_id": "e4bfc0a1-62ee-4406-a620-5e82b3c81502",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b718a921-0f87-40d5-9b03-8ad43433299f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b718a921-0f87-40d5-9b03-8ad43433299f",
  "order_id": "e4bfc0a1-62ee-4406-a620-5e82b3c81502",
  "assignment_id": "47591562-8d75-4daa-bedb-2439e0fc27bd",
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

`POST /api/driver/v1/trips/b718a921-0f87-40d5-9b03-8ad43433299f/cancel` → **200**

```json
{
  "command_id": "0f700175-4a10-4040-9b6f-15417c6436db",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "b718a921-0f87-40d5-9b03-8ad43433299f",
  "order_id": "e4bfc0a1-62ee-4406-a620-5e82b3c81502",
  "assignment_id": "47591562-8d75-4daa-bedb-2439e0fc27bd",
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
      "id": "e4bfc0a1-62ee-4406-a620-5e82b3c81502",
      "short_number": 7,
      "status": "CANCELLED",
      "created_at": "2026-10-30T15:43:40.490024Z",
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
          "ru": "Пассажир попросил отменить",
          "en": "Passenger asked to cancel",
          "uk": "Пасажир попросив скасувати"
        }
      },
      "pickup_at": null
    },
    {
      "id": "c4623fd8-a945-4849-993a-854af24cfb3a",
      "short_number": 6,
      "status": "CANCELLED",
      "created_at": "2026-10-30T15:43:38.235424Z",
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
          "ru": "Долго ждать машину",
          "en": "The wait is too long",
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

`GET /api/operator/v1/orders/e4bfc0a1-62ee-4406-a620-5e82b3c81502/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T15:43:40.490435Z",
      "actor": {
        "type": "CLIENT",
        "id": "77f2ff42-e527-45bf-9835-1f7e46925d6b",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "e4bfc0a1-62ee-4406-a620-5e82b3c81502",
        "quote_id": "4e9050ee-4889-4c81-9fa1-59bc9c88ad6d",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "4225f0f8-a8ee-4897-84d7-f2e4b5362ec9"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T15:43:40.491881Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "e4bfc0a1-62ee-4406-a620-5e82b3c81502",
        "attempt_id": "7641f2d8-42dc-442b-89cf-ddfd90c39ae1",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "4225f0f8-a8ee-4897-84d7-f2e4b5362ec9"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T15:43:40.50999Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "dd33d345-8c88-4c93-ad08-af758f9f6596",
        "order_id": "e4bfc0a1-62ee-4406-a620-5e82b3c81502",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "4225f0f8-a8ee-4897-84d7-f2e4b5362ec9"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T15:43:40.94198Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "dd33d345-8c88-4c93-ad08-af758f9f6596",
        "order_id": "e4bfc0a1-62ee-4406-a620-5e82b3c81502",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "6abe7bec-3608-4274-86c4-1967a9494731"
      },
      "correlation_id": "e65cfb4e-03eb-4b0a-af65-08a3b4f6d698"
```

Done: orders c4623fd8-a945-4849-993a-854af24cfb3a, e4bfc0a1-62ee-4406-a620-5e82b3c81502.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380736414347",
  "device_ref": "sandbox-22608"
}
```

```json
{
  "challenge_id": "4a78538f-fd51-493d-97cd-8a82ae4d4075",
  "expires_at": "2026-10-30T15:48:43.113670207Z",
  "resend_available_at": "2026-10-30T15:43:44.113670207Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380736414347` → **200**

```json
{
  "phone": "+380736414347",
  "audience": "CLIENT",
  "code": "068134",
  "sent_at": "2026-10-30T15:43:43.115787318Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4a78538f-fd51-493d-97cd-8a82ae4d4075",
  "code": "068134",
  "device_ref": "sandbox-22608"
}
```

```json
{
  "session_id": "fe503c09-7bd2-42d0-9bb5-1741eaeba1c4",
  "subject": {
    "type": "CLIENT",
    "id": "3282cfa8-009a-4455-a5f9-8fbc149fc7df"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMjgyY2ZhOC0wMDlhLTQ0NTUtYTVmOS04ZmJjMTQ5ZmM3ZGYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc1OTIzLCJpYXQiOjE3OTMzNzUwMjMsImp0aSI6IjQxMTAxN2Y5LWE5ODMtNGQ0Yy05N2FmLTFhMzhkNWZlOGI0ZiIsInNpZCI6ImZlNTAzYzA5LTdiZDItNDJkMC05YmI1LTE3NDFlYWViYTFjNCJ9.C9cMZui-tixK-oXu2sNAI3ky-wtc6DTsOMzYH7uAaNQ",
  "access_expires_at": "2026-10-30T15:58:43.342548522Z",
  "refresh_token": "bICJUj08F-jXMz5qXTrZNqfdWkjK-myETjKR2U1kMO0",
  "refresh_expires_at": "2026-11-29T15:43:43.342014098Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "140c3500-4b5c-4b5f-a594-12b755fef0f8",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "932beccf-6fdc-4c2d-87b6-b2bbba118e4e",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-932beccf-6fdc-4c2d-87b6-b2bbba118e4e",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "b2281b3ebbad75acf85bfd8d19526e91",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=932beccf-6fdc-4c2d-87b6-b2bbba118e4e",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380736414347"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=932beccf-6fdc-4c2d-87b6-b2bbba118e4e",
  "expires_at": "2026-10-30T16:13:43.551943Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/932beccf-6fdc-4c2d-87b6-b2bbba118e4e` → **200**

```json
{
  "id": "932beccf-6fdc-4c2d-87b6-b2bbba118e4e",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T16:13:43.551943Z",
  "card": {
    "id": "b5a08347-2187-4bad-bc7e-4feb573bd1fb",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****0596",
    "card_type": "Visa",
    "created_at": "2026-10-30T15:43:43.774984Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "b5a08347-2187-4bad-bc7e-4feb573bd1fb",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****0596",
      "card_type": "Visa",
      "created_at": "2026-10-30T15:43:43.774984Z"
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
  "device_ref": "sandbox-7751"
}
```

```json
{
  "challenge_id": "696feef6-757a-4142-bdf4-6c5413f8a398",
  "expires_at": "2026-10-30T15:48:44.250273674Z",
  "resend_available_at": "2026-10-30T15:43:45.250273674Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "944108",
  "sent_at": "2026-10-30T15:43:44.253173378Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "696feef6-757a-4142-bdf4-6c5413f8a398",
  "code": "944108",
  "device_ref": "sandbox-7751"
}
```

```json
{
  "session_id": "b600caae-aa4e-4294-b785-759811fbf14d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NTkyNCwiaWF0IjoxNzkzMzc1MDI0LCJqdGkiOiI4YTI1ZmIwMi0yYzdjLTRjNjUtODk2Mi02NGZlZjdkYjI2MGQiLCJzaWQiOiJiNjAwY2FhZS1hYTRlLTQyOTQtYjc4NS03NTk4MTFmYmYxNGQifQ.Q-0I0wHIvhYw1p8NjBYnen8TZrH2t_LzBWYr3RBeVz8",
  "access_expires_at": "2026-10-30T15:58:44.487356525Z",
  "refresh_token": "-HXt73Xj8Gg5CheOPIc-yWhpEnNaVb2EBVx5xS-IKmo",
  "refresh_expires_at": "2026-11-29T15:43:44.486813858Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "8a5e9ead-8c5d-46ed-92cd-20a7493f49c5",
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
  "last_heartbeat_at": "2026-10-30T15:43:40.045542Z",
  "last_location_at": "2026-10-30T15:43:40.045542Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8a5e9ead-8c5d-46ed-92cd-20a7493f49c5/handover` → **200**

```json
{
  "command_id": "21ca7a5b-cffd-41c6-a4cd-9cc1c0718761",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "8a5e9ead-8c5d-46ed-92cd-20a7493f49c5",
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
  "last_heartbeat_at": "2026-10-30T15:43:40.045542Z",
  "last_location_at": "2026-10-30T15:43:40.045542Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

(the car drives 44 s to the next point)

`POST /api/driver/v1/work-sessions/8a5e9ead-8c5d-46ed-92cd-20a7493f49c5/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:44:29Z",
    "sequence": 1793375069129
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "8a5e9ead-8c5d-46ed-92cd-20a7493f49c5",
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
  "last_heartbeat_at": "2026-10-30T15:44:29.147921Z",
  "last_location_at": "2026-10-30T15:44:29.147921Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b6d993d0-682f-4d41-8acc-19418cdba603",
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
  "id": "186109b7-7d07-4ff7-8389-4ff3e394dda8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:49:29.364609Z",
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
  "command_id": "1f5d8c53-8522-45a9-91a1-4c83cb1d3c39",
  "quote_id": "186109b7-7d07-4ff7-8389-4ff3e394dda8",
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
  "id": "b773c04e-463e-4156-8061-86e03d1f431b",
  "short_number": 8,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "3282cfa8-009a-4455-a5f9-8fbc149fc7df",
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
  "created_at": "2026-10-30T15:44:29.584056Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b773c04e-463e-4156-8061-86e03d1f431b` → **200**

```json
{
  "id": "b773c04e-463e-4156-8061-86e03d1f431b",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "3282cfa8-009a-4455-a5f9-8fbc149fc7df",
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
  "created_at": "2026-10-30T15:44:29.584056Z",
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
    "id": "4fe353b5-5a80-4972-9375-9541abcbaea6",
    "order_id": "b773c04e-463e-4156-8061-86e03d1f431b",
    "expires_at": "2026-10-30T15:44:44.72148Z",
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

`POST /api/driver/v1/offers/4fe353b5-5a80-4972-9375-9541abcbaea6/accept` → **200**

```json
{
  "command_id": "3a5363e4-bf52-49e0-8406-79fdbb036c65"
}
```

```json
{
  "id": "498f62a5-9fe7-4ba0-8b67-347143448a1d",
  "order_id": "b773c04e-463e-4156-8061-86e03d1f431b",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "ee138eb3-2bb9-4a25-9dbf-c3fe2a23a1b4",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "ee138eb3-2bb9-4a25-9dbf-c3fe2a23a1b4",
  "order_id": "b773c04e-463e-4156-8061-86e03d1f431b",
  "assignment_id": "498f62a5-9fe7-4ba0-8b67-347143448a1d",
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

(the car drives 8 s to the next point)

`POST /api/driver/v1/work-sessions/8a5e9ead-8c5d-46ed-92cd-20a7493f49c5/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:44:38Z",
    "sequence": 1793375078675
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "8a5e9ead-8c5d-46ed-92cd-20a7493f49c5",
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
  "last_heartbeat_at": "2026-10-30T15:44:38.693183Z",
  "last_location_at": "2026-10-30T15:44:38.693183Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/ee138eb3-2bb9-4a25-9dbf-c3fe2a23a1b4/arrive` → **200**

```json
{
  "command_id": "7bc3ea97-30e4-4a1c-89fe-efa5cc926369",
  "expected_version": 0
}
```

```json
{
  "id": "ee138eb3-2bb9-4a25-9dbf-c3fe2a23a1b4",
  "order_id": "b773c04e-463e-4156-8061-86e03d1f431b",
  "assignment_id": "498f62a5-9fe7-4ba0-8b67-347143448a1d",
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
  "arrived_at": "2026-10-30T15:44:38.910004Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/ee138eb3-2bb9-4a25-9dbf-c3fe2a23a1b4/start` → **200**

```json
{
  "command_id": "c6050ab9-acc0-463f-ab6a-96a0a15290be",
  "expected_version": 1
}
```

```json
{
  "id": "ee138eb3-2bb9-4a25-9dbf-c3fe2a23a1b4",
  "order_id": "b773c04e-463e-4156-8061-86e03d1f431b",
  "assignment_id": "498f62a5-9fe7-4ba0-8b67-347143448a1d",
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
  "arrived_at": "2026-10-30T15:44:38.910004Z",
  "started_at": "2026-10-30T15:44:39.13085Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/ee138eb3-2bb9-4a25-9dbf-c3fe2a23a1b4/complete` → **200**

```json
{
  "command_id": "53430694-c358-49c5-bc6c-936b21a19100",
  "expected_version": 2,
  "reported_at": "2026-10-30T15:44:39Z",
  "cash_received": true
}
```

```json
{
  "id": "ee138eb3-2bb9-4a25-9dbf-c3fe2a23a1b4",
  "order_id": "b773c04e-463e-4156-8061-86e03d1f431b",
  "assignment_id": "498f62a5-9fe7-4ba0-8b67-347143448a1d",
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
  "arrived_at": "2026-10-30T15:44:38.910004Z",
  "started_at": "2026-10-30T15:44:39.13085Z",
  "completed_at": "2026-10-30T15:44:39.351854Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/b773c04e-463e-4156-8061-86e03d1f431b` → **200**

```json
{
  "id": "b773c04e-463e-4156-8061-86e03d1f431b",
  "short_number": 8,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "3282cfa8-009a-4455-a5f9-8fbc149fc7df",
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
    "id": "498f62a5-9fe7-4ba0-8b67-347143448a1d",
    "order_id": "b773c04e-463e-4156-8061-86e03d1f431b",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "ee138eb3-2bb9-4a25-9dbf-c3fe2a23a1b4",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T15:44:29.584056Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b773c04e-463e-4156-8061-86e03d1f431b` → **200**

```json
{
  "id": "b773c04e-463e-4156-8061-86e03d1f431b",
  "short_number": 8,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "3282cfa8-009a-4455-a5f9-8fbc149fc7df",
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
    "id": "498f62a5-9fe7-4ba0-8b67-347143448a1d",
    "order_id": "b773c04e-463e-4156-8061-86e03d1f431b",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "ee138eb3-2bb9-4a25-9dbf-c3fe2a23a1b4",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T15:44:29.584056Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b773c04e-463e-4156-8061-86e03d1f431b` → **200**

```json
{
  "id": "b773c04e-463e-4156-8061-86e03d1f431b",
  "short_number": 8,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "3282cfa8-009a-4455-a5f9-8fbc149fc7df",
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
    "id": "498f62a5-9fe7-4ba0-8b67-347143448a1d",
    "order_id": "b773c04e-463e-4156-8061-86e03d1f431b",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "ee138eb3-2bb9-4a25-9dbf-c3fe2a23a1b4",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T15:44:29.584056Z",
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

`GET /api/rider/v1/orders/b773c04e-463e-4156-8061-86e03d1f431b/tip` → **200**

```json
{
  "order_id": "b773c04e-463e-4156-8061-86e03d1f431b",
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
  "available_until": "2026-10-31T15:44:39.351854Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/b773c04e-463e-4156-8061-86e03d1f431b/tip` → **201**

```json
{
  "command_id": "260512a6-edc1-43e3-8056-638a54f87736",
  "amount_minor": 2500
}
```

```json
{
  "id": "f8d5819f-7601-405e-a5ab-dba6ecd5b593",
  "order_id": "b773c04e-463e-4156-8061-86e03d1f431b",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T15:44:42.626596Z"
}
```

`GET /api/rider/v1/orders/b773c04e-463e-4156-8061-86e03d1f431b/tip` → **200**

```json
{
  "order_id": "b773c04e-463e-4156-8061-86e03d1f431b",
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
  "available_until": "2026-10-31T15:44:39.351854Z",
  "open": false,
  "tip": {
    "id": "f8d5819f-7601-405e-a5ab-dba6ecd5b593",
    "order_id": "b773c04e-463e-4156-8061-86e03d1f431b",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-30T15:44:42.626596Z"
  }
}
```

`GET /api/rider/v1/orders/b773c04e-463e-4156-8061-86e03d1f431b/tip` → **200**

```json
{
  "order_id": "b773c04e-463e-4156-8061-86e03d1f431b",
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
  "available_until": "2026-10-31T15:44:39.351854Z",
  "open": false,
  "tip": {
    "id": "f8d5819f-7601-405e-a5ab-dba6ecd5b593",
    "order_id": "b773c04e-463e-4156-8061-86e03d1f431b",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T15:44:42.626596Z"
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
      "id": "289c55d0-bbae-424f-ac2e-3e3958e428b5",
      "at": "2026-10-30T15:44:43.854317Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "b773c04e-463e-4156-8061-86e03d1f431b",
      "counterpart_id": null
    },
    {
      "id": "2defb5e1-a886-41c8-b05a-4aaefe91b0f8",
      "at": "2026-10-30T15:44:39.807266Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "b773c04e-463e-4156-8061-86e03d1f431b",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b853391e-d146-47bf-a5d2-83367424b8f3",
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
  "id": "fd80bbda-c57e-46ae-ba17-4808e831c174",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:49:44.483171Z",
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
  "session_id": "cc4af6df-59c4-4036-954f-f2c1f3d7b428",
  "subject": {
    "type": "STAFF",
    "id": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiODZhYmMzMi1mMmUyLTRjM2MtOTk2Ny05N2JmYzljZTdjZTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzU5ODQsImlhdCI6MTc5MzM3NTA4NCwianRpIjoiYzc3NTk2MjMtMmE2NC00NzY3LTk5NTgtMmM2NTQ1Yzc3NWZmIiwic2lkIjoiY2M0YWY2ZGYtNTljNC00MDM2LTk1NGYtZjJjMWYzZDdiNDI4In0.ul5Glnsp7URQHcofJnyzP92t697Xn9DODPxpGcD6A0g",
  "access_expires_at": "2026-10-30T15:59:44.91918831Z",
  "refresh_token": "mQkA-ddzU2hOXMB-9uNoRGM5B7sBxxevnZCdoA_W7PM",
  "refresh_expires_at": "2026-10-31T03:44:44.918774508Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380736414347` → **200**

```json
{
  "client_id": "3282cfa8-009a-4455-a5f9-8fbc149fc7df"
}
```

`POST /api/admin/v1/rider-wallets/3282cfa8-009a-4455-a5f9-8fbc149fc7df/top-ups` → **201**

```json
{
  "command_id": "4b84da95-3b9a-4615-bede-ec70cdef535f",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "3282cfa8-009a-4455-a5f9-8fbc149fc7df",
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
      "id": "02cfa463-e2ad-4059-83b0-f60c2b7e8fcd",
      "at": "2026-10-30T15:44:45.333566Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "cb3c46c6-0cc1-439f-a04f-823174c893b1",
  "quote_id": "fd80bbda-c57e-46ae-ba17-4808e831c174",
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
  "id": "65e94349-16da-445e-b70e-a2397f92efc2",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3282cfa8-009a-4455-a5f9-8fbc149fc7df",
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
  "created_at": "2026-10-30T15:44:45.55178Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/65e94349-16da-445e-b70e-a2397f92efc2` → **200**

```json
{
  "id": "65e94349-16da-445e-b70e-a2397f92efc2",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3282cfa8-009a-4455-a5f9-8fbc149fc7df",
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
  "created_at": "2026-10-30T15:44:45.55178Z",
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
    "id": "6ced48c9-4211-4f8e-991e-4aaa86f4b5f1",
    "order_id": "65e94349-16da-445e-b70e-a2397f92efc2",
    "expires_at": "2026-10-30T15:45:00.555019Z",
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

`POST /api/driver/v1/offers/6ced48c9-4211-4f8e-991e-4aaa86f4b5f1/accept` → **200**

```json
{
  "command_id": "de1e2940-69bf-4f6c-9f04-45e60a7b2497"
}
```

```json
{
  "id": "23dafe1a-e6af-4306-a2fe-91672457a4d9",
  "order_id": "65e94349-16da-445e-b70e-a2397f92efc2",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "6ef558a5-ad78-4186-bbad-043ae6219adf",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "6ef558a5-ad78-4186-bbad-043ae6219adf",
  "order_id": "65e94349-16da-445e-b70e-a2397f92efc2",
  "assignment_id": "23dafe1a-e6af-4306-a2fe-91672457a4d9",
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

`POST /api/driver/v1/work-sessions/8a5e9ead-8c5d-46ed-92cd-20a7493f49c5/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:44:46Z",
    "sequence": 1793375086630
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "8a5e9ead-8c5d-46ed-92cd-20a7493f49c5",
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
  "last_heartbeat_at": "2026-10-30T15:44:46.647936Z",
  "last_location_at": "2026-10-30T15:44:46.647936Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/6ef558a5-ad78-4186-bbad-043ae6219adf/arrive` → **200**

```json
{
  "command_id": "126d0eec-b196-41a5-9224-1172dd28740e",
  "expected_version": 0
}
```

```json
{
  "id": "6ef558a5-ad78-4186-bbad-043ae6219adf",
  "order_id": "65e94349-16da-445e-b70e-a2397f92efc2",
  "assignment_id": "23dafe1a-e6af-4306-a2fe-91672457a4d9",
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
  "arrived_at": "2026-10-30T15:44:46.856342Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/6ef558a5-ad78-4186-bbad-043ae6219adf/start` → **200**

```json
{
  "command_id": "e6c2fbde-920e-45e3-84a8-16ec3732c5c5",
  "expected_version": 1
}
```

```json
{
  "id": "6ef558a5-ad78-4186-bbad-043ae6219adf",
  "order_id": "65e94349-16da-445e-b70e-a2397f92efc2",
  "assignment_id": "23dafe1a-e6af-4306-a2fe-91672457a4d9",
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
  "arrived_at": "2026-10-30T15:44:46.856342Z",
  "started_at": "2026-10-30T15:44:47.074455Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/6ef558a5-ad78-4186-bbad-043ae6219adf/complete` → **200**

```json
{
  "command_id": "0ba76b29-7c4a-4ca6-9aa3-d8388b7b1a39",
  "expected_version": 2,
  "reported_at": "2026-10-30T15:44:47Z",
  "cash_received": true
}
```

```json
{
  "id": "6ef558a5-ad78-4186-bbad-043ae6219adf",
  "order_id": "65e94349-16da-445e-b70e-a2397f92efc2",
  "assignment_id": "23dafe1a-e6af-4306-a2fe-91672457a4d9",
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
  "arrived_at": "2026-10-30T15:44:46.856342Z",
  "started_at": "2026-10-30T15:44:47.074455Z",
  "completed_at": "2026-10-30T15:44:47.292144Z",
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
  "client_id": "3282cfa8-009a-4455-a5f9-8fbc149fc7df",
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
      "id": "02cfa463-e2ad-4059-83b0-f60c2b7e8fcd",
      "at": "2026-10-30T15:44:45.333566Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2",
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

`GET /api/rider/v1/orders/65e94349-16da-445e-b70e-a2397f92efc2/tip` → **200**

```json
{
  "order_id": "65e94349-16da-445e-b70e-a2397f92efc2",
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
  "available_until": "2026-10-31T15:44:47.292144Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/65e94349-16da-445e-b70e-a2397f92efc2/tip` → **201**

```json
{
  "command_id": "f574cbb6-95ad-41c9-a166-31ac995fd717",
  "amount_minor": 2500
}
```

```json
{
  "id": "e9d209b9-8b8b-4606-baf8-c8f9539a8de5",
  "order_id": "65e94349-16da-445e-b70e-a2397f92efc2",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T15:44:48.130492Z"
}
```

`GET /api/rider/v1/orders/65e94349-16da-445e-b70e-a2397f92efc2/tip` → **200**

```json
{
  "order_id": "65e94349-16da-445e-b70e-a2397f92efc2",
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
  "available_until": "2026-10-31T15:44:47.292144Z",
  "open": false,
  "tip": {
    "id": "e9d209b9-8b8b-4606-baf8-c8f9539a8de5",
    "order_id": "65e94349-16da-445e-b70e-a2397f92efc2",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-30T15:44:48.130492Z"
  }
}
```

`GET /api/rider/v1/orders/65e94349-16da-445e-b70e-a2397f92efc2/tip` → **200**

```json
{
  "order_id": "65e94349-16da-445e-b70e-a2397f92efc2",
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
  "available_until": "2026-10-31T15:44:47.292144Z",
  "open": false,
  "tip": {
    "id": "e9d209b9-8b8b-4606-baf8-c8f9539a8de5",
    "order_id": "65e94349-16da-445e-b70e-a2397f92efc2",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T15:44:48.130492Z"
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
      "id": "746d06d6-a64c-4306-9b38-cd02c7b0e32c",
      "at": "2026-10-30T15:44:47.897166Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "65e94349-16da-445e-b70e-a2397f92efc2",
      "counterpart_id": null
    },
    {
      "id": "289c55d0-bbae-424f-ac2e-3e3958e428b5",
      "at": "2026-10-30T15:44:43.854317Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "b773c04e-463e-4156-8061-86e03d1f431b",
      "counterpart_id": null
    },
    {
      "id": "2defb5e1-a886-41c8-b05a-4aaefe91b0f8",
      "at": "2026-10-30T15:44:39.807266Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "b773c04e-463e-4156-8061-86e03d1f431b",
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
      "id": "7be41195-6c80-4d36-8158-37e896917312",
      "at": "2026-10-30T15:44:49.917695Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "65e94349-16da-445e-b70e-a2397f92efc2",
      "counterpart_id": null
    },
    {
      "id": "746d06d6-a64c-4306-9b38-cd02c7b0e32c",
      "at": "2026-10-30T15:44:47.897166Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "65e94349-16da-445e-b70e-a2397f92efc2",
      "counterpart_id": null
    },
    {
      "id": "289c55d0-bbae-424f-ac2e-3e3958e428b5",
      "at": "2026-10-30T15:44:43.854317Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "b773c04e-463e-4156-8061-86e03d1f431b",
      "counterpart_id": null
    },
    {
      "id": "2defb5e1-a886-41c8-b05a-4aaefe91b0f8",
      "at": "2026-10-30T15:44:39.807266Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "b773c04e-463e-4156-8061-86e03d1f431b",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "8a5e9ead-8c5d-46ed-92cd-20a7493f49c5",
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
  "last_heartbeat_at": "2026-10-30T15:44:46.647936Z",
  "last_location_at": "2026-10-30T15:44:46.647936Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8a5e9ead-8c5d-46ed-92cd-20a7493f49c5/close` → **200**

```json
{
  "command_id": "d03bd080-c5c2-4ec1-b277-30e27d8b9661",
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

Done: card order 65e94349-16da-445e-b70e-a2397f92efc2.

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
  "phone": "+380739123104",
  "device_ref": "sandbox-23458"
}
```

```json
{
  "challenge_id": "62651299-c7f7-4b85-8ef6-b5193fb8b556",
  "expires_at": "2026-10-30T15:49:51.785466121Z",
  "resend_available_at": "2026-10-30T15:44:52.785466121Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380739123104` → **200**

```json
{
  "phone": "+380739123104",
  "audience": "CLIENT",
  "code": "698561",
  "sent_at": "2026-10-30T15:44:51.787412881Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "62651299-c7f7-4b85-8ef6-b5193fb8b556",
  "code": "698561",
  "device_ref": "sandbox-23458"
}
```

```json
{
  "session_id": "769bcff8-0b3d-422d-a230-8b23b09ee51c",
  "subject": {
    "type": "CLIENT",
    "id": "63c6b5d0-14de-46b5-882f-d6035bfe50e5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2M2M2YjVkMC0xNGRlLTQ2YjUtODgyZi1kNjAzNWJmZTUwZTUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc1OTkyLCJpYXQiOjE3OTMzNzUwOTIsImp0aSI6ImViNTE0MWQzLWY0ZWMtNDY1Ni1iZWEyLTVlZmRkNWExMGViOSIsInNpZCI6Ijc2OWJjZmY4LTBiM2QtNDIyZC1hMjMwLThiMjNiMDllZTUxYyJ9.DoefPRM7b322hzfBjq-B5OiahzCO-WsCekGpltbAKws",
  "access_expires_at": "2026-10-30T15:59:52.018979627Z",
  "refresh_token": "W3bI8YKDlJSJ23S_V0q29Z-lSrDLmvMWEyuZCmZSmWU",
  "refresh_expires_at": "2026-11-29T15:44:52.018450822Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "21cf48ee-bc87-4b24-8b84-40689af621f5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "c8afa37c-0c73-40a5-bdf5-2394a0781f09",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-c8afa37c-0c73-40a5-bdf5-2394a0781f09",
    "orderDate": "1793375092",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "4b5a81555b3770fcfaccb24888b22d77",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=c8afa37c-0c73-40a5-bdf5-2394a0781f09",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380739123104"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=c8afa37c-0c73-40a5-bdf5-2394a0781f09",
  "created_at": "2026-10-30T15:44:52.234861Z",
  "expires_at": "2026-10-30T16:14:52.234861Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/c8afa37c-0c73-40a5-bdf5-2394a0781f09` → **200**

```json
{
  "id": "c8afa37c-0c73-40a5-bdf5-2394a0781f09",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T15:44:52.234861Z",
  "expires_at": "2026-10-30T16:14:52.234861Z",
  "completed_at": "2026-10-30T15:44:52.452599Z",
  "masked_pan": "41****8943",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "63c6b5d0-14de-46b5-882f-d6035bfe50e5",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "63c6b5d0-14de-46b5-882f-d6035bfe50e5",
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
      "id": "0f8c1aec-8520-4796-b5f6-710fd7f2a103",
      "at": "2026-10-30T15:44:52.932981Z",
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
  "client_id": "63c6b5d0-14de-46b5-882f-d6035bfe50e5",
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
      "id": "0f8c1aec-8520-4796-b5f6-710fd7f2a103",
      "at": "2026-10-30T15:44:52.932981Z",
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
  "device_ref": "sandbox-5185"
}
```

```json
{
  "challenge_id": "07eead57-e45c-44da-988c-92c8e1700744",
  "expires_at": "2026-10-30T15:49:54.292383476Z",
  "resend_available_at": "2026-10-30T15:44:55.292383476Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "584459",
  "sent_at": "2026-10-30T15:44:54.294471388Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "07eead57-e45c-44da-988c-92c8e1700744",
  "code": "584459",
  "device_ref": "sandbox-5185"
}
```

```json
{
  "session_id": "7cb02b17-2754-4383-8165-0d5f68ac662c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NTk5NCwiaWF0IjoxNzkzMzc1MDk0LCJqdGkiOiI2Y2I3NGEyZC1jODk0LTQ1YWItOGEwOS0xYTcyODIxNWZiZmUiLCJzaWQiOiI3Y2IwMmIxNy0yNzU0LTQzODMtODE2NS0wZDVmNjhhYzY2MmMifQ.t54AS7Osxh8IWdPPYYnE26EkTLZR8Dy0cVqIHJNk2ng",
  "access_expires_at": "2026-10-30T15:59:54.525716825Z",
  "refresh_token": "EeeOXjhFI5FMKVUVVuNHx0wKR3_GypVh-J6asc7VCR8",
  "refresh_expires_at": "2026-11-29T15:44:54.525076031Z",
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
  "command_id": "2a345417-3b27-40cb-8e5f-743c55b24274",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "e306cd41-cb85-4ea0-8245-7d80e5705809",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-e306cd41-cb85-4ea0-8245-7d80e5705809",
    "orderDate": "1793375094",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "356873d7468e0941685083e01cfa5f6c",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=e306cd41-cb85-4ea0-8245-7d80e5705809",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=e306cd41-cb85-4ea0-8245-7d80e5705809",
  "created_at": "2026-10-30T15:44:54.933939Z",
  "expires_at": "2026-10-30T16:14:54.933939Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/e306cd41-cb85-4ea0-8245-7d80e5705809` → **200**

```json
{
  "id": "e306cd41-cb85-4ea0-8245-7d80e5705809",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T15:44:54.933939Z",
  "expires_at": "2026-10-30T16:14:54.933939Z",
  "completed_at": "2026-10-30T15:44:55.143118Z",
  "masked_pan": "41****7410",
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
      "id": "c435433b-5667-49ca-a1f0-ecbf0d9ba839",
      "at": "2026-10-30T15:44:55.940796Z",
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
  "command_id": "3ee1e554-8f90-418c-946b-453b9a9ac815",
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
  "correlation_id": "1404d50c-b300-4246-94f1-8dbafefd41b2"
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
  "device_ref": "sandbox-6034"
}
```

```json
{
  "challenge_id": "f40f9f74-edb7-4a2e-a8d9-693dbac42e6a",
  "expires_at": "2026-10-30T15:49:56.985785995Z",
  "resend_available_at": "2026-10-30T15:44:57.985785995Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "808401",
  "sent_at": "2026-10-30T15:44:56.988406638Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f40f9f74-edb7-4a2e-a8d9-693dbac42e6a",
  "code": "808401",
  "device_ref": "sandbox-6034"
}
```

```json
{
  "session_id": "e93933cc-62de-48d8-a728-58c04b35b633",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NTk5NywiaWF0IjoxNzkzMzc1MDk3LCJqdGkiOiJjMTI4Yjc5ZC1kYTVhLTRhMDMtYWJiZS1hZGRiZmIwNWY4YzIiLCJzaWQiOiJlOTM5MzNjYy02MmRlLTQ4ZDgtYTcyOC01OGMwNGIzNWI2MzMifQ.YemPIPd_cLfwCWKuJk2CwaHioj6hlXDTTMV_OmjwJaQ",
  "access_expires_at": "2026-10-30T15:59:57.256294547Z",
  "refresh_token": "h8Xuk-cp-MaQsNpXET26XIWPX5gb0Y4LoYb8JON3smg",
  "refresh_expires_at": "2026-11-29T15:44:57.255814574Z",
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
  "command_id": "c7234c4c-56c6-4715-9c55-9abb09c61afb",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:44:57Z",
    "sequence": 1793375097668
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e758b60b-fff4-44ed-aca3-6a4e76845727",
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
  "last_heartbeat_at": "2026-10-30T15:44:57.685595Z",
  "last_location_at": "2026-10-30T15:44:57.685595Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A rider orders for cash

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630071553",
  "device_ref": "sandbox-8110"
}
```

```json
{
  "challenge_id": "b2d2eac2-8176-4e3b-95d3-fea3a7ab7ce4",
  "expires_at": "2026-10-30T15:49:57.898900456Z",
  "resend_available_at": "2026-10-30T15:44:58.898900456Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380630071553` → **200**

```json
{
  "phone": "+380630071553",
  "audience": "CLIENT",
  "code": "658721",
  "sent_at": "2026-10-30T15:44:57.90088287Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b2d2eac2-8176-4e3b-95d3-fea3a7ab7ce4",
  "code": "658721",
  "device_ref": "sandbox-8110"
}
```

```json
{
  "session_id": "2cf1f79a-1a1a-461f-80db-eafa6b32875c",
  "subject": {
    "type": "CLIENT",
    "id": "a8c2974f-4c5b-46f9-8b42-b2b7ac4998a6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhOGMyOTc0Zi00YzViLTQ2ZjktOGI0Mi1iMmI3YWM0OTk4YTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc1OTk4LCJpYXQiOjE3OTMzNzUwOTgsImp0aSI6ImUxMDUwYzI1LWUxOTctNDdiOC04NzM5LTY1MjhjNjA2N2RlYyIsInNpZCI6IjJjZjFmNzlhLTFhMWEtNDYxZi04MGRiLWVhZmE2YjMyODc1YyJ9.3RPdcbGLa1TGDMfHT9VMbnCuI9JRObhcc741-fy0WoI",
  "access_expires_at": "2026-10-30T15:59:58.127142489Z",
  "refresh_token": "alb5GzUTeTk1bbuJ1Hl9NFxkKm17QJqpJwHDoOJHZnw",
  "refresh_expires_at": "2026-11-29T15:44:58.126680149Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ff56c074-0867-43ab-adec-18e1f4bf8275",
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
  "id": "c93474f6-b6c9-4315-a480-485519058d33",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:49:58.340834Z",
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
  "command_id": "89ddef52-325d-4882-be89-9e69dec91d77",
  "quote_id": "c93474f6-b6c9-4315-a480-485519058d33",
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
  "id": "f7014d63-4253-4fe8-83ec-51dbd19d52ae",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a8c2974f-4c5b-46f9-8b42-b2b7ac4998a6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T15:44:58.556482Z",
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
    "id": "4894a905-5c5c-4cc5-9add-80b3ac80d240",
    "order_id": "f7014d63-4253-4fe8-83ec-51dbd19d52ae",
    "expires_at": "2026-10-30T15:45:13.559219Z",
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

`POST /api/driver/v1/offers/4894a905-5c5c-4cc5-9add-80b3ac80d240/accept` → **200**

```json
{
  "command_id": "75744550-30c9-44e9-b995-a117cd3eff22"
}
```

```json
{
  "id": "cb00d72d-028a-4ab6-b898-ca94cd902c15",
  "order_id": "f7014d63-4253-4fe8-83ec-51dbd19d52ae",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "8ea4cf63-f99d-4ec2-89e0-da756beee9a9",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "8ea4cf63-f99d-4ec2-89e0-da756beee9a9",
  "order_id": "f7014d63-4253-4fe8-83ec-51dbd19d52ae",
  "assignment_id": "cb00d72d-028a-4ab6-b898-ca94cd902c15",
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

`POST /api/driver/v1/work-sessions/e758b60b-fff4-44ed-aca3-6a4e76845727/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:44:59Z",
    "sequence": 1793375099412
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e758b60b-fff4-44ed-aca3-6a4e76845727",
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
  "last_heartbeat_at": "2026-10-30T15:44:59.428994Z",
  "last_location_at": "2026-10-30T15:44:59.428994Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/8ea4cf63-f99d-4ec2-89e0-da756beee9a9/arrive` → **200**

```json
{
  "command_id": "211662f5-ce73-4bd1-93a6-bd7141769fac",
  "expected_version": 0
}
```

```json
{
  "id": "8ea4cf63-f99d-4ec2-89e0-da756beee9a9",
  "order_id": "f7014d63-4253-4fe8-83ec-51dbd19d52ae",
  "assignment_id": "cb00d72d-028a-4ab6-b898-ca94cd902c15",
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
  "arrived_at": "2026-10-30T15:44:59.643082Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/8ea4cf63-f99d-4ec2-89e0-da756beee9a9/start` → **200**

```json
{
  "command_id": "89e17e36-78f8-4419-b383-75578448d088",
  "expected_version": 1
}
```

```json
{
  "id": "8ea4cf63-f99d-4ec2-89e0-da756beee9a9",
  "order_id": "f7014d63-4253-4fe8-83ec-51dbd19d52ae",
  "assignment_id": "cb00d72d-028a-4ab6-b898-ca94cd902c15",
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
  "arrived_at": "2026-10-30T15:44:59.643082Z",
  "started_at": "2026-10-30T15:44:59.856675Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/8ea4cf63-f99d-4ec2-89e0-da756beee9a9/complete` → **200**

```json
{
  "command_id": "a3e66292-ed47-4f74-9d63-d2a0356fa028",
  "expected_version": 2,
  "reported_at": "2026-10-30T15:45:00Z",
  "cash_received": false
}
```

```json
{
  "id": "8ea4cf63-f99d-4ec2-89e0-da756beee9a9",
  "order_id": "f7014d63-4253-4fe8-83ec-51dbd19d52ae",
  "assignment_id": "cb00d72d-028a-4ab6-b898-ca94cd902c15",
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
  "arrived_at": "2026-10-30T15:44:59.643082Z",
  "started_at": "2026-10-30T15:44:59.856675Z",
  "completed_at": "2026-10-30T15:45:00.079265Z",
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
  "session_id": "b110f2c2-9505-49c3-8f4b-50838570ddb4",
  "subject": {
    "type": "STAFF",
    "id": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiODZhYmMzMi1mMmUyLTRjM2MtOTk2Ny05N2JmYzljZTdjZTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzYwMDAsImlhdCI6MTc5MzM3NTEwMCwianRpIjoiOWMyODMyMzItOWUwYS00NjA3LWJkYzktMDBmNjRkMjNlMGZiIiwic2lkIjoiYjExMGYyYzItOTUwNS00OWMzLThmNGItNTA4Mzg1NzBkZGI0In0.BmDnsQNGr7aUyE1l2q9F431pMnOJon1tmjoIDrTh46Q",
  "access_expires_at": "2026-10-30T16:00:00.508439979Z",
  "refresh_token": "XYE3B7QLNmUVNwQzuf0a0FbIEbyO_rK_wbDJPwGKT_8",
  "refresh_expires_at": "2026-10-31T03:45:00.507976928Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/f7014d63-4253-4fe8-83ec-51dbd19d52ae/cash-dispute` → **404**

```json
{
  "instance": "/api/admin/v1/orders/f7014d63-4253-4fe8-83ec-51dbd19d52ae/cash-dispute",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "e7374244-dff1-45aa-8628-e1ca7bb020a9"
}
```

`GET /api/admin/v1/orders/f7014d63-4253-4fe8-83ec-51dbd19d52ae/cash-dispute` → **200**

```json
{
  "order_id": "f7014d63-4253-4fe8-83ec-51dbd19d52ae",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "a8c2974f-4c5b-46f9-8b42-b2b7ac4998a6",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T15:45:00.992404Z",
  "decide_by": "2026-11-13T15:45:00.992404Z",
  "decision": null,
  "decided_by": null,
  "reason": null,
  "decided_at": null,
  "version": 1
}
```

Dispute: {"held_minor":0,"rider_debt_minor":10517,"decide_by":"2026-11-13T15:45:00.992404Z","decision":null}

`GET /api/admin/v1/cash-disputes` → **200**

```json
{
  "disputes": [
    {
      "order_id": "f7014d63-4253-4fe8-83ec-51dbd19d52ae",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "payer_client_id": "a8c2974f-4c5b-46f9-8b42-b2b7ac4998a6",
      "currency": "UAH",
      "held_minor": 0,
      "rider_debt_minor": 10517,
      "opened_at": "2026-10-30T15:45:00.992404Z",
      "decide_by": "2026-11-13T15:45:00.992404Z",
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

`POST /api/admin/v1/orders/f7014d63-4253-4fe8-83ec-51dbd19d52ae/cash-dispute/decide` → **400**

```json
{
  "command_id": "b0d568a5-9759-4cbc-9065-e52696657a34",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/orders/f7014d63-4253-4fe8-83ec-51dbd19d52ae/cash-dispute/decide",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "da1b5058-a79f-4a13-b6d0-2a15e646eb75",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

`POST /api/admin/v1/orders/f7014d63-4253-4fe8-83ec-51dbd19d52ae/cash-dispute/decide` → **200**

```json
{
  "command_id": "33998a91-7983-4b37-b913-4a113696e56e",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": "The rider does not answer calls"
}
```

```json
{
  "order_id": "f7014d63-4253-4fe8-83ec-51dbd19d52ae",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "a8c2974f-4c5b-46f9-8b42-b2b7ac4998a6",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T15:45:00.992404Z",
  "decide_by": "2026-11-13T15:45:00.992404Z",
  "decision": "PAY_DRIVER",
  "decided_by": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2",
  "reason": "The rider does not answer calls",
  "decided_at": "2026-10-30T15:45:02.571399Z",
  "version": 2
}
```

`POST /api/admin/v1/orders/f7014d63-4253-4fe8-83ec-51dbd19d52ae/cash-dispute/decide` → **409**

```json
{
  "command_id": "9b0a6185-fc95-45a1-9e5d-8fad95eb9dc6",
  "expected_version": 2,
  "decision": "RIDER_PAID",
  "reason": "Again"
}
```

```json
{
  "instance": "/api/admin/v1/orders/f7014d63-4253-4fe8-83ec-51dbd19d52ae/cash-dispute/decide",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "41e5ee6f-391d-4757-a41a-74f428e13e01"
}
```

Done: an unpaid cash trip became a dispute and was decided once.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e758b60b-fff4-44ed-aca3-6a4e76845727",
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
  "last_heartbeat_at": "2026-10-30T15:44:59.428994Z",
  "last_location_at": "2026-10-30T15:44:59.428994Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e758b60b-fff4-44ed-aca3-6a4e76845727/close` → **200**

```json
{
  "command_id": "c3595a52-cb74-47c1-8768-47904d70a0f9",
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
  "phone": "+380731008754",
  "device_ref": "sandbox-20172"
}
```

```json
{
  "challenge_id": "8370323b-a6f5-4b4c-ae19-6e90283841b6",
  "expires_at": "2026-10-30T15:50:03.440015402Z",
  "resend_available_at": "2026-10-30T15:45:04.440015402Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380731008754` → **200**

```json
{
  "phone": "+380731008754",
  "audience": "CLIENT",
  "code": "958176",
  "sent_at": "2026-10-30T15:45:03.44211365Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8370323b-a6f5-4b4c-ae19-6e90283841b6",
  "code": "958176",
  "device_ref": "sandbox-20172"
}
```

```json
{
  "session_id": "df40170e-5938-43d6-9034-778335a3d5f5",
  "subject": {
    "type": "CLIENT",
    "id": "97d5749d-2d4c-4be4-b9a0-0791f67c02f6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5N2Q1NzQ5ZC0yZDRjLTRiZTQtYjlhMC0wNzkxZjY3YzAyZjYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc2MDAzLCJpYXQiOjE3OTMzNzUxMDMsImp0aSI6IjZlZWUyYWY0LTVlMmYtNDNhOC04OWU0LWFkMGM3YTc2ODI3MSIsInNpZCI6ImRmNDAxNzBlLTU5MzgtNDNkNi05MDM0LTc3ODMzNWEzZDVmNSJ9.rinlEhkHsKKS3ZhLFzKlzJmsWIjcBTpyShETg4-FENo",
  "access_expires_at": "2026-10-30T16:00:03.669490094Z",
  "refresh_token": "QmZOK9rIa_hgFhst-waNox9VufjlVVY0wLO1VGHga2w",
  "refresh_expires_at": "2026-11-29T15:45:03.669137964Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "1f48bf64-60fd-4333-a1c0-90626ed06f1f",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "837f0a6e-e458-4731-88e0-0e59fa63eeb0",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-837f0a6e-e458-4731-88e0-0e59fa63eeb0",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "18e4cf872e95293820144e01086953a9",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=837f0a6e-e458-4731-88e0-0e59fa63eeb0",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380731008754"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=837f0a6e-e458-4731-88e0-0e59fa63eeb0",
  "expires_at": "2026-10-30T16:15:03.877722Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/837f0a6e-e458-4731-88e0-0e59fa63eeb0` → **200**

```json
{
  "id": "837f0a6e-e458-4731-88e0-0e59fa63eeb0",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T16:15:03.877722Z",
  "card": {
    "id": "02209722-256b-46a3-9fbe-aa5cb7592330",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****5498",
    "card_type": "Visa",
    "created_at": "2026-10-30T15:45:04.092374Z"
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
  "device_ref": "sandbox-19081"
}
```

```json
{
  "challenge_id": "bb84125e-bdb8-43f2-a79a-090d534662fd",
  "expires_at": "2026-10-30T15:50:04.318465253Z",
  "resend_available_at": "2026-10-30T15:45:05.318465253Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "259867",
  "sent_at": "2026-10-30T15:45:04.320670742Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bb84125e-bdb8-43f2-a79a-090d534662fd",
  "code": "259867",
  "device_ref": "sandbox-19081"
}
```

```json
{
  "session_id": "ad52e025-4307-405e-b51a-fba0e4cf81f0",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NjAwNCwiaWF0IjoxNzkzMzc1MTA0LCJqdGkiOiIyNzBiY2NhZC05MDZjLTRiMjYtYWNkOC01OGVhY2QyNTAyMGUiLCJzaWQiOiJhZDUyZTAyNS00MzA3LTQwNWUtYjUxYS1mYmEwZTRjZjgxZjAifQ.mpLTTnQbRZEtdEE4ZXT_xKSjbrP9iealeoiKL6YL9aM",
  "access_expires_at": "2026-10-30T16:00:04.547049365Z",
  "refresh_token": "NwPUDEf9QOU_xYLJii-YCCkzVQOlPXHndtaldJ0gDFQ",
  "refresh_expires_at": "2026-11-29T15:45:04.54660741Z",
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
  "command_id": "b5a396c7-fb51-4c92-b55e-f8fc24d081b2",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:45:04Z",
    "sequence": 1793375104994
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "d99004ce-df89-45dd-aa33-4b566f149ee6",
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
  "last_heartbeat_at": "2026-10-30T15:45:05.010628Z",
  "last_location_at": "2026-10-30T15:45:05.010628Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A card ride; on the way both write numbers into the chat

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "db5ebb17-1237-46e0-ae8d-d2fa20fffc4a",
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
  "id": "e27dbf1c-032f-4cf6-8c1a-4a87e9a0b1b2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:50:05.225199Z",
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
  "command_id": "f436ebe8-be8c-4f58-878c-3a6bf3cb0396",
  "quote_id": "e27dbf1c-032f-4cf6-8c1a-4a87e9a0b1b2",
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
  "id": "23cda625-4f0a-464a-97d6-6cd2444e86ec",
  "short_number": 11,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "97d5749d-2d4c-4be4-b9a0-0791f67c02f6",
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
  "created_at": "2026-10-30T15:45:05.438886Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/23cda625-4f0a-464a-97d6-6cd2444e86ec` → **200**

```json
{
  "id": "23cda625-4f0a-464a-97d6-6cd2444e86ec",
  "short_number": 11,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "97d5749d-2d4c-4be4-b9a0-0791f67c02f6",
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
  "created_at": "2026-10-30T15:45:05.438886Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/23cda625-4f0a-464a-97d6-6cd2444e86ec` → **200**

```json
{
  "id": "23cda625-4f0a-464a-97d6-6cd2444e86ec",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "97d5749d-2d4c-4be4-b9a0-0791f67c02f6",
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
  "created_at": "2026-10-30T15:45:05.438886Z",
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
    "id": "9eb7c575-462c-4a45-854b-fe2f94188328",
    "order_id": "23cda625-4f0a-464a-97d6-6cd2444e86ec",
    "expires_at": "2026-10-30T15:45:21.018453Z",
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

`POST /api/driver/v1/offers/9eb7c575-462c-4a45-854b-fe2f94188328/accept` → **200**

```json
{
  "command_id": "4b5e9f60-3f8e-470b-877f-87ed99d633b6"
}
```

```json
{
  "id": "53a08c46-8cf6-49b5-b46a-9458ccf36371",
  "order_id": "23cda625-4f0a-464a-97d6-6cd2444e86ec",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "5bc77b98-32a1-4e08-9fe2-9843addbe187",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "5bc77b98-32a1-4e08-9fe2-9843addbe187",
  "order_id": "23cda625-4f0a-464a-97d6-6cd2444e86ec",
  "assignment_id": "53a08c46-8cf6-49b5-b46a-9458ccf36371",
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

`POST /api/rider/v1/orders/23cda625-4f0a-464a-97d6-6cd2444e86ec/messages` → **201**

```json
{
  "command_id": "f2cff47f-d6bb-4064-9f0c-71f418c82cac",
  "body": "Я біля входу, мій номер +380731008754, картка 4111 1111 1111 1111"
}
```

```json
{
  "id": "3a32711f-d559-4936-a798-2a1db6ade20e",
  "order_id": "23cda625-4f0a-464a-97d6-6cd2444e86ec",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу, мій номер +380731008754, картка 4111 1111 1111 1111",
  "sent_at": "2026-10-30T15:45:07.687616019Z"
}
```

`POST /api/driver/v1/trips/5bc77b98-32a1-4e08-9fe2-9843addbe187/messages` → **201**

```json
{
  "command_id": "6a964fbf-28fe-41e8-b631-d8c026ceda61",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03"
}
```

```json
{
  "id": "2344ce5d-870a-44c6-95f2-2720c470c704",
  "order_id": "23cda625-4f0a-464a-97d6-6cd2444e86ec",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03",
  "sent_at": "2026-10-30T15:45:07.898363282Z"
}
```

(the car drives 5 s to the next point)

`POST /api/driver/v1/work-sessions/d99004ce-df89-45dd-aa33-4b566f149ee6/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:45:13Z",
    "sequence": 1793375113115
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "d99004ce-df89-45dd-aa33-4b566f149ee6",
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
  "last_heartbeat_at": "2026-10-30T15:45:13.133095Z",
  "last_location_at": "2026-10-30T15:45:13.133095Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/5bc77b98-32a1-4e08-9fe2-9843addbe187/arrive` → **200**

```json
{
  "command_id": "a827cdf6-e4b9-44c3-b0d0-b4708dab34df",
  "expected_version": 0
}
```

```json
{
  "id": "5bc77b98-32a1-4e08-9fe2-9843addbe187",
  "order_id": "23cda625-4f0a-464a-97d6-6cd2444e86ec",
  "assignment_id": "53a08c46-8cf6-49b5-b46a-9458ccf36371",
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
  "arrived_at": "2026-10-30T15:45:13.354176Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/5bc77b98-32a1-4e08-9fe2-9843addbe187/start` → **200**

```json
{
  "command_id": "e7588636-8b61-43c9-afbe-e4349a66cfc7",
  "expected_version": 1
}
```

```json
{
  "id": "5bc77b98-32a1-4e08-9fe2-9843addbe187",
  "order_id": "23cda625-4f0a-464a-97d6-6cd2444e86ec",
  "assignment_id": "53a08c46-8cf6-49b5-b46a-9458ccf36371",
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
  "arrived_at": "2026-10-30T15:45:13.354176Z",
  "started_at": "2026-10-30T15:45:13.572915Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

(the car drives 91 s to the next point)

`POST /api/driver/v1/work-sessions/d99004ce-df89-45dd-aa33-4b566f149ee6/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4584,
    "lon": 30.4300,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:46:44Z",
    "sequence": 1793375204790
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "d99004ce-df89-45dd-aa33-4b566f149ee6",
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
  "last_heartbeat_at": "2026-10-30T15:46:44.805691Z",
  "last_location_at": "2026-10-30T15:46:44.805691Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/5bc77b98-32a1-4e08-9fe2-9843addbe187/complete` → **200**

```json
{
  "command_id": "c7b6481e-4476-431d-8f8e-4833a102bdc1",
  "expected_version": 2,
  "reported_at": "2026-10-30T15:46:44Z",
  "cash_received": false
}
```

```json
{
  "id": "5bc77b98-32a1-4e08-9fe2-9843addbe187",
  "order_id": "23cda625-4f0a-464a-97d6-6cd2444e86ec",
  "assignment_id": "53a08c46-8cf6-49b5-b46a-9458ccf36371",
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
  "arrived_at": "2026-10-30T15:45:13.354176Z",
  "started_at": "2026-10-30T15:45:13.572915Z",
  "completed_at": "2026-10-30T15:46:44.993877Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/rider/v1/orders/23cda625-4f0a-464a-97d6-6cd2444e86ec` → **200**

```json
{
  "id": "23cda625-4f0a-464a-97d6-6cd2444e86ec",
  "short_number": 11,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "97d5749d-2d4c-4be4-b9a0-0791f67c02f6",
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
    "id": "53a08c46-8cf6-49b5-b46a-9458ccf36371",
    "order_id": "23cda625-4f0a-464a-97d6-6cd2444e86ec",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "5bc77b98-32a1-4e08-9fe2-9843addbe187",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T15:45:05.438886Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/23cda625-4f0a-464a-97d6-6cd2444e86ec` → **200**

```json
{
  "id": "23cda625-4f0a-464a-97d6-6cd2444e86ec",
  "short_number": 11,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "97d5749d-2d4c-4be4-b9a0-0791f67c02f6",
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
    "id": "53a08c46-8cf6-49b5-b46a-9458ccf36371",
    "order_id": "23cda625-4f0a-464a-97d6-6cd2444e86ec",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "5bc77b98-32a1-4e08-9fe2-9843addbe187",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T15:45:05.438886Z",
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
  "session_id": "d99004ce-df89-45dd-aa33-4b566f149ee6",
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
  "last_heartbeat_at": "2026-10-30T15:46:44.805691Z",
  "last_location_at": "2026-10-30T15:46:44.805691Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d99004ce-df89-45dd-aa33-4b566f149ee6/close` → **200**

```json
{
  "command_id": "7ba98312-40aa-4fbf-8a39-30815c94674d",
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
  "session_id": "cb373c79-8b72-4d7a-b8a0-c48e59f35805",
  "subject": {
    "type": "STAFF",
    "id": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiODZhYmMzMi1mMmUyLTRjM2MtOTk2Ny05N2JmYzljZTdjZTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzYxMDcsImlhdCI6MTc5MzM3NTIwNywianRpIjoiMzgyZmZmNDUtYzVhNS00ZDgxLWI3NTEtN2EwOGIwMTIwYjVhIiwic2lkIjoiY2IzNzNjNzktOGI3Mi00ZDdhLWI4YTAtYzQ4ZTU5ZjM1ODA1In0.V4D1KLYeIGMBYo-CcXXjxNTkBojbcEgq2DGMZUDUSqw",
  "access_expires_at": "2026-10-30T16:01:47.150008274Z",
  "refresh_token": "d3NIs0bAzKWxeO0eabAe2qitU0Q1ngA1LXwtCd6S6qE",
  "refresh_expires_at": "2026-10-31T03:46:47.149676906Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/23cda625-4f0a-464a-97d6-6cd2444e86ec/evidence` → **400**

```json
{
  "instance": "/api/admin/v1/orders/23cda625-4f0a-464a-97d6-6cd2444e86ec/evidence",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "91386f61-c3c6-49fd-b4a3-f40913eb770a"
}
```

`GET /api/admin/v1/orders/23cda625-4f0a-464a-97d6-6cd2444e86ec/evidence?reason=Bank%20request%20sandbox` → **200**

```json
{
  "generated_at": "2026-10-30T15:46:47.510785785Z",
  "order": {
    "id": "23cda625-4f0a-464a-97d6-6cd2444e86ec",
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
    "created_at": "2026-10-30T15:45:05.438886Z",
    "assigned_at": "2026-10-30T15:45:07.284823Z",
    "arrived_at": "2026-10-30T15:45:13.354176Z",
    "started_at": "2026-10-30T15:45:13.572915Z",
    "completed_at": "2026-10-30T15:46:44.993877Z"
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
    "id": "97d5749d-2d4c-4be4-b9a0-0791f67c02f6",
    "registered_at": "2026-10-30T15:45:03.667617Z",
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
      "created_at": "2026-10-30T15:45:05.440624Z"
    },
    {
      "type": "SETTLE",
      "state": "SUCCEEDED",
      "amount_minor": 16297,
      "currency": "UAH",
      "provider_status": "Approved",
      "created_at": "2026-10-30T15:46:45.20111Z"
    }
  ],
  "chat": [
    {
```

## Finance records the chargeback: the rider owes the fare again, a case opens

`POST /api/admin/v1/orders/23cda625-4f0a-464a-97d6-6cd2444e86ec/chargebacks` → **422**

```json
{
  "command_id": "f6f509f2-771f-4b29-8fb1-d912460bc454",
  "amount_minor": 16298,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "instance": "/api/admin/v1/orders/23cda625-4f0a-464a-97d6-6cd2444e86ec/chargebacks",
  "status": 422,
  "title": "Chargeback not allowed",
  "type": "https://errors.blizz.taxi/chargeback-not-allowed",
  "code": "CHARGEBACK_NOT_ALLOWED",
  "correlation_id": "bfaa2c58-ab86-4dd5-b7ec-2f63e16f771c"
}
```

`POST /api/admin/v1/orders/23cda625-4f0a-464a-97d6-6cd2444e86ec/chargebacks` → **201**

```json
{
  "command_id": "2d582956-9183-4c49-aae5-3b9ba7c85e9f",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "id": "0c3b4e84-29fa-4de7-88b4-bfb0c4cc9e51",
  "order_id": "23cda625-4f0a-464a-97d6-6cd2444e86ec",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-30T15:46:47.929022Z",
  "resolved_at": null,
  "version": 0
}
```

`POST /api/admin/v1/orders/23cda625-4f0a-464a-97d6-6cd2444e86ec/chargebacks` → **201**

```json
{
  "command_id": "2d582956-9183-4c49-aae5-3b9ba7c85e9f",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "id": "0c3b4e84-29fa-4de7-88b4-bfb0c4cc9e51",
  "order_id": "23cda625-4f0a-464a-97d6-6cd2444e86ec",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-30T15:46:47.929022Z",
  "resolved_at": null,
  "version": 0
}
```

`GET /api/admin/v1/clients/97d5749d-2d4c-4be4-b9a0-0791f67c02f6` → **200**

```json
{
  "client": {
    "id": "97d5749d-2d4c-4be4-b9a0-0791f67c02f6",
    "phone": "+380731008754",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T15:45:03.667617Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "23cda625-4f0a-464a-97d6-6cd2444e86ec",
      "short_number": 11,
      "status": "FULFILLED",
      "created_at": "2026-10-30T15:45:05.438886Z",
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

`POST /api/admin/v1/orders/23cda625-4f0a-464a-97d6-6cd2444e86ec/chargebacks/0c3b4e84-29fa-4de7-88b4-bfb0c4cc9e51/resolve` → **200**

```json
{
  "command_id": "759359bf-39c8-44f1-950a-eece0e37aca6",
  "expected_version": 0,
  "outcome": "WON",
  "reason": "Evidence accepted"
}
```

```json
{
  "id": "0c3b4e84-29fa-4de7-88b4-bfb0c4cc9e51",
  "order_id": "23cda625-4f0a-464a-97d6-6cd2444e86ec",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "WON",
  "resolution_reason": "Evidence accepted",
  "created_at": "2026-10-30T15:46:47.929022Z",
  "resolved_at": "2026-10-30T15:46:48.534325Z",
  "version": 1
}
```

`GET /api/admin/v1/clients/97d5749d-2d4c-4be4-b9a0-0791f67c02f6` → **200**

```json
{
  "client": {
    "id": "97d5749d-2d4c-4be4-b9a0-0791f67c02f6",
    "phone": "+380731008754",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T15:45:03.667617Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "23cda625-4f0a-464a-97d6-6cd2444e86ec",
      "short_number": 11,
      "status": "FULFILLED",
      "created_at": "2026-10-30T15:45:05.438886Z",
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

`GET /api/admin/v1/clients/97d5749d-2d4c-4be4-b9a0-0791f67c02f6` → **200**

```json
{
  "client": {
    "id": "97d5749d-2d4c-4be4-b9a0-0791f67c02f6",
    "phone": "+380731008754",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T15:45:03.667617Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "23cda625-4f0a-464a-97d6-6cd2444e86ec",
      "short_number": 11,
      "status": "FULFILLED",
      "created_at": "2026-10-30T15:45:05.438886Z",
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

`POST /api/admin/v1/orders/23cda625-4f0a-464a-97d6-6cd2444e86ec/chargebacks/0c3b4e84-29fa-4de7-88b4-bfb0c4cc9e51/resolve` → **409**

```json
{
  "command_id": "540acb1a-db4b-4af7-ac14-1019381820a8",
  "expected_version": 1,
  "outcome": "LOST",
  "reason": "Twice"
}
```

```json
{
  "instance": "/api/admin/v1/orders/23cda625-4f0a-464a-97d6-6cd2444e86ec/chargebacks/0c3b4e84-29fa-4de7-88b4-bfb0c4cc9e51/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "b0333bc0-5f21-4264-9408-a14c50573178"
}
```

`GET /api/admin/v1/orders/23cda625-4f0a-464a-97d6-6cd2444e86ec/chargebacks` → **200**

```json
{
  "chargebacks": [
    {
      "id": "0c3b4e84-29fa-4de7-88b4-bfb0c4cc9e51",
      "order_id": "23cda625-4f0a-464a-97d6-6cd2444e86ec",
      "amount_minor": 16297,
      "currency": "UAH",
      "bank_reason": "4837 No cardholder authorization",
      "received_on": "2026-10-29",
      "state": "WON",
      "resolution_reason": "Evidence accepted",
      "created_at": "2026-10-30T15:46:47.929022Z",
      "resolved_at": "2026-10-30T15:46:48.534325Z",
      "version": 1
    }
  ]
}
```

Done: the evidence of card order 23cda625-4f0a-464a-97d6-6cd2444e86ec without phone or card digits; chargeback 0c3b4e84-29fa-4de7-88b4-bfb0c4cc9e51 recorded and won.

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
  "session_id": "d79af712-e9a3-43e4-af8c-e2d0f0225ca4",
  "subject": {
    "type": "STAFF",
    "id": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiODZhYmMzMi1mMmUyLTRjM2MtOTk2Ny05N2JmYzljZTdjZTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzYxMTAsImlhdCI6MTc5MzM3NTIxMCwianRpIjoiNjhlMTQxNmYtNWVjMS00YzZiLWFjNGUtNWQ2YjMyNTY3MTVlIiwic2lkIjoiZDc5YWY3MTItZTlhMy00M2U0LWFmOGMtZTJkMGYwMjI1Y2E0In0.f2F0dcKdfOjnyzZ4mv3pluQRvuxbybkCmeC_wKRLysI",
  "access_expires_at": "2026-10-30T16:01:50.874142055Z",
  "refresh_token": "VvS1OdXWSt7qVSvDA6dQMxPPC9JZ_yWaGSTysJvidoI",
  "refresh_expires_at": "2026-10-31T03:46:50.873785148Z",
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
  "phone": "+48600984008",
  "device_ref": "sandbox-7946"
}
```

```json
{
  "challenge_id": "c028bf4f-3ccc-4bd6-9a0d-f1b32dfb576a",
  "expires_at": "2026-10-30T15:51:51.416966795Z",
  "resend_available_at": "2026-10-30T15:46:52.416966795Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600984008` → **200**

```json
{
  "phone": "+48600984008",
  "audience": "CLIENT",
  "code": "723403",
  "sent_at": "2026-10-30T15:46:51.418888515Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c028bf4f-3ccc-4bd6-9a0d-f1b32dfb576a",
  "code": "723403",
  "device_ref": "sandbox-7946"
}
```

```json
{
  "session_id": "f759a00a-08e0-4af9-b378-b3391d54474e",
  "subject": {
    "type": "CLIENT",
    "id": "ce728e31-e78d-4b68-97c5-6c2f2d6a3ca7"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZTcyOGUzMS1lNzhkLTRiNjgtOTdjNS02YzJmMmQ2YTNjYTciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc2MTExLCJpYXQiOjE3OTMzNzUyMTEsImp0aSI6ImEyZGI1NDMwLWM5MmItNDhiMC1iNzIyLTM5ZTg4M2IxM2NmNSIsInNpZCI6ImY3NTlhMDBhLTA4ZTAtNGFmOS1iMzc4LWIzMzkxZDU0NDc0ZSJ9.-ZVJuxKLXK-5v21rlFinm345-o_2zE1ixf2OTI5z3kE",
  "access_expires_at": "2026-10-30T16:01:51.619245675Z",
  "refresh_token": "-TTyXZjnkhYz98PWrm_HJUyLL8aNgalgyKBCvp_sK2M",
  "refresh_expires_at": "2026-11-29T15:46:51.618825438Z",
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
  "command_id": "763b6265-3429-4043-a872-5ae5eefe05dc",
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
  "correlation_id": "3285e8e0-95ab-4ae0-9a27-53c09146781e",
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
  "command_id": "817eb196-a014-4f43-bad8-bfd766635b72",
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
  "paused_at": "2026-10-30T15:46:52.349886835Z",
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
  "command_id": "7ecb2374-1541-415f-8fef-a877eeaa0ce2",
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
  "id": "6172c32f-ae98-4157-bbff-ffd474a2e8f3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:51:52.745152Z",
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
  "command_id": "15c3b61b-7ef3-45e9-801f-d9fd557350b2",
  "quote_id": "6172c32f-ae98-4157-bbff-ffd474a2e8f3",
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
  "correlation_id": "ffb6ff66-a816-4620-81c8-805c5fcac637"
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
  "paused_at": "2026-10-30T15:46:52.349887Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "ad4e33d9-01e9-4d72-94f2-d5c20cd18fbd",
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
  "command_id": "cd8b286f-0394-4333-88c6-bc2f564fb3c6",
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
  "command_id": "f0cbc2a4-a89d-4f45-811b-29e05888a4ea",
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
  "id": "422cb1ee-a292-4b29-89f0-59c046f8e1a0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:51:53.882513Z",
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
  "command_id": "a8ce931e-d8a1-41f6-b51b-4e9506099b4c",
  "quote_id": "422cb1ee-a292-4b29-89f0-59c046f8e1a0",
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
  "correlation_id": "f44af715-4216-478d-ae2d-52c57753120a"
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
  "command_id": "5d7dd5d9-14cf-432e-b49b-012cebbc79c7",
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
      "from": "18:00",
      "to": "19:00"
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
      "from": "18:00",
      "to": "19:00"
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
  "command_id": "0f463c64-ed9a-469f-bc5d-a2b90c2f94af",
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
  "id": "68bf8225-35f2-4d01-82c8-dc40484bc2d0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:51:54.647780Z",
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
  "command_id": "17911380-23e0-4a05-b1ca-25c425eac583",
  "quote_id": "68bf8225-35f2-4d01-82c8-dc40484bc2d0",
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
  "correlation_id": "dcfce401-8149-4a9a-af43-194a35bf81d8"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "a77569ba-0a14-4c23-9614-4acad526de8d",
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
  "correlation_id": "6839d320-1dc2-409c-8af1-25fc513a54a4",
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
      "from": "18:00",
      "to": "19:00"
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
  "command_id": "0e42ee8e-da3d-4212-ba8e-31dc1ec47006",
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
  "phone": "+380673672777",
  "device_ref": "sandbox-32671"
}
```

```json
{
  "challenge_id": "6836725d-bfab-49f0-b9e1-3077be8ffc8a",
  "expires_at": "2026-10-30T15:51:55.605506687Z",
  "resend_available_at": "2026-10-30T15:46:56.605506687Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380673672777` → **200**

```json
{
  "phone": "+380673672777",
  "audience": "CLIENT",
  "code": "145419",
  "sent_at": "2026-10-30T15:46:55.607339733Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6836725d-bfab-49f0-b9e1-3077be8ffc8a",
  "code": "145419",
  "device_ref": "sandbox-32671"
}
```

```json
{
  "session_id": "da740299-67f3-4676-af65-48bd333d52d4",
  "subject": {
    "type": "CLIENT",
    "id": "97d0b943-6ba0-40c6-8361-3bd942cf2cfe"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5N2QwYjk0My02YmEwLTQwYzYtODM2MS0zYmQ5NDJjZjJjZmUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc2MTE1LCJpYXQiOjE3OTMzNzUyMTUsImp0aSI6IjNhM2FlNGZhLWFlZWQtNDFhYi1iNGJmLWViZjU5Yjg0MTY4NCIsInNpZCI6ImRhNzQwMjk5LTY3ZjMtNDY3Ni1hZjY1LTQ4YmQzMzNkNTJkNCJ9.MC8z0BnPax9q5qAFuk9QqfvtdEOtIRdWk6zuF8Qg0Gk",
  "access_expires_at": "2026-10-30T16:01:55.808289213Z",
  "refresh_token": "kuATMC7OVELAXRfruCkH2-pKk-x-35PNAhJcCAMP1XQ",
  "refresh_expires_at": "2026-11-29T15:46:55.807952717Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "97d0b943-6ba0-40c6-8361-3bd942cf2cfe",
  "session_id": "da740299-67f3-4676-af65-48bd333d52d4",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "80e17be5-c8bd-41cf-bab1-0df482e33b3f",
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
  "id": "aa5fb768-2fa7-434f-a020-bd3ad502b1ed",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:51:56.166940Z",
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
  "challenge_id": "73d6ac0d-6a16-43ad-a0df-b50f406a4b22",
  "expires_at": "2026-10-30T15:51:58.357705201Z",
  "resend_available_at": "2026-10-30T15:46:59.357705201Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673672777` → **200**

```json
{
  "phone": "+380673672777",
  "audience": "CLIENT",
  "code": "940844",
  "sent_at": "2026-10-30T15:46:58.359507728Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "1b4b3642-a158-4d40-bdd8-491fe373cb1f",
  "challenge_id": "73d6ac0d-6a16-43ad-a0df-b50f406a4b22",
  "otp_code": "940844"
}
```

```json
{
  "client_id": "97d0b943-6ba0-40c6-8361-3bd942cf2cfe",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-30T15:46:58.578475621Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "7d51efd2-5e7f-4c23-b24c-f669379f1cbe",
  "quote_id": "aa5fb768-2fa7-434f-a020-bd3ad502b1ed",
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
  "correlation_id": "fd214cb6-139b-4241-8d18-4db4c62f5246"
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
  "session_id": "0547d753-2086-44e7-8409-8685077ed601",
  "subject": {
    "type": "STAFF",
    "id": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiODZhYmMzMi1mMmUyLTRjM2MtOTk2Ny05N2JmYzljZTdjZTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzYxMTksImlhdCI6MTc5MzM3NTIxOSwianRpIjoiMDJhZTgyOTUtMzllMS00ZmQzLTlhYTEtNDIyZWQyMTcwNDg3Iiwic2lkIjoiMDU0N2Q3NTMtMjA4Ni00NGU3LTg0MDktODY4NTA3N2VkNjAxIn0.rBuNdyCp6lbWfP3BBm20K08q7RD1LvNFopyOT4Ur2Y4",
  "access_expires_at": "2026-10-30T16:01:59.154206188Z",
  "refresh_token": "gGQPQfQl5G94vHRIVBy_ZDDtgMt69Ki_Gswj0EdyHoo",
  "refresh_expires_at": "2026-10-31T03:46:59.153744004Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "97d0b943-6ba0-40c6-8361-3bd942cf2cfe",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-30T15:46:58.578476Z",
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

`POST /api/admin/v1/client-deletions/97d0b943-6ba0-40c6-8361-3bd942cf2cfe/complete` → **200**

```json
{
  "command_id": "d044ac5f-a78d-4c63-a3d5-604624aa0c9b",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "97d0b943-6ba0-40c6-8361-3bd942cf2cfe",
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
  "correlation_id": "e73b331f-acfe-4b19-9b87-9536eabf51b4"
}
```

Done: client 97d0b943-6ba0-40c6-8361-3bd942cf2cfe anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380660538927",
  "device_ref": "sandbox-23849"
}
```

```json
{
  "challenge_id": "bbc91b9c-d1c8-43f9-82d4-4aa84539570e",
  "expires_at": "2026-10-30T15:51:59.923131614Z",
  "resend_available_at": "2026-10-30T15:47:00.923131614Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380660538927` → **200**

```json
{
  "phone": "+380660538927",
  "audience": "CLIENT",
  "code": "058115",
  "sent_at": "2026-10-30T15:46:59.925057791Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bbc91b9c-d1c8-43f9-82d4-4aa84539570e",
  "code": "058115",
  "device_ref": "sandbox-23849"
}
```

```json
{
  "session_id": "0a6ddd00-1b27-4771-bdfe-d45faf6746d4",
  "subject": {
    "type": "CLIENT",
    "id": "c438fa6d-c959-491d-ae9a-5d2bf6833f0e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNDM4ZmE2ZC1jOTU5LTQ5MWQtYWU5YS01ZDJiZjY4MzNmMGUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc2MTIwLCJpYXQiOjE3OTMzNzUyMjAsImp0aSI6IjJkY2E4MDY2LTJkMDgtNGZmYi04OGVhLWRlZWY2ZWZlNDk3ZSIsInNpZCI6IjBhNmRkZDAwLTFiMjctNDc3MS1iZGZlLWQ0NWZhZjY3NDZkNCJ9.nGFuxg2onY0mwF18N_aSEPhCKr5unyF8GyAgBGMNwKM",
  "access_expires_at": "2026-10-30T16:02:00.127119868Z",
  "refresh_token": "FYHFFeoxOSdRsabM02WhoSkWmo0UypBUyFIEo0d9Iyo",
  "refresh_expires_at": "2026-11-29T15:47:00.126730323Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "c438fa6d-c959-491d-ae9a-5d2bf6833f0e",
  "session_id": "0a6ddd00-1b27-4771-bdfe-d45faf6746d4",
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
  "session_id": "8e1ec3b0-2734-402b-8ca2-4823a2159a99",
  "subject": {
    "type": "STAFF",
    "id": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiODZhYmMzMi1mMmUyLTRjM2MtOTk2Ny05N2JmYzljZTdjZTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzYxMjAsImlhdCI6MTc5MzM3NTIyMCwianRpIjoiMjU3MWQwNTctM2UwOC00ZTE4LWIwNTgtZGQwNmM1Y2IyY2I0Iiwic2lkIjoiOGUxZWMzYjAtMjczNC00MDJiLThjYTItNDgyM2EyMTU5YTk5In0.1yYjKbOdz-wA5YlBz_O76voJHXP5eZy1K383YIuNvjg",
  "access_expires_at": "2026-10-30T16:02:00.690790484Z",
  "refresh_token": "1bhDr1Qyq2lEXap9ejht1S2qrfokZ0eHbp9117_xOTA",
  "refresh_expires_at": "2026-10-31T03:47:00.690334076Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=0538927&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "c438fa6d-c959-491d-ae9a-5d2bf6833f0e",
      "phone": "+380660538927",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-30T15:47:00.125177Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/c438fa6d-c959-491d-ae9a-5d2bf6833f0e` → **200**

```json
{
  "client": {
    "id": "c438fa6d-c959-491d-ae9a-5d2bf6833f0e",
    "phone": "+380660538927",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T15:47:00.125177Z",
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

`POST /api/admin/v1/clients/c438fa6d-c959-491d-ae9a-5d2bf6833f0e/block` → **400**

```json
{
  "command_id": "31b370d5-8f03-4064-8563-54b25994ed51",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/c438fa6d-c959-491d-ae9a-5d2bf6833f0e/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "24d32823-97e5-4adc-9935-016bbc55c758",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/c438fa6d-c959-491d-ae9a-5d2bf6833f0e/block` → **200**

```json
{
  "command_id": "18e273c9-11c2-4d40-be59-0509d25d3216",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "c438fa6d-c959-491d-ae9a-5d2bf6833f0e",
  "phone": "+380660538927",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-30T15:47:00.125177Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-30T15:47:01.456688Z",
    "by": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2"
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
  "correlation_id": "097dd85c-c040-4a23-b1b7-03e04234080b"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380660538927",
  "device_ref": "sandbox-18954"
}
```

```json
{
  "challenge_id": "e38c375f-84ae-4637-b507-1772cd012ab7",
  "expires_at": "2026-10-30T15:52:03.826416259Z",
  "resend_available_at": "2026-10-30T15:47:04.826416259Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380660538927` → **200**

```json
{
  "phone": "+380660538927",
  "audience": "CLIENT",
  "code": "098034",
  "sent_at": "2026-10-30T15:47:03.828379021Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "e38c375f-84ae-4637-b507-1772cd012ab7",
  "code": "098034",
  "device_ref": "sandbox-18954"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "ac44eb47-c95e-4d34-b348-62dd36b586a5"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/c438fa6d-c959-491d-ae9a-5d2bf6833f0e` → **200**

```json
{
  "client": {
    "id": "c438fa6d-c959-491d-ae9a-5d2bf6833f0e",
    "phone": "+380660538927",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-30T15:47:00.125177Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-30T15:47:01.456688Z",
      "by": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2"
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

`POST /api/admin/v1/clients/c438fa6d-c959-491d-ae9a-5d2bf6833f0e/unblock` → **200**

```json
{
  "command_id": "351cfe2e-81da-4816-9941-1c76f1359553",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "c438fa6d-c959-491d-ae9a-5d2bf6833f0e",
  "phone": "+380660538927",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-30T15:47:00.125177Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380660538927",
  "device_ref": "sandbox-10155"
}
```

```json
{
  "challenge_id": "3bdf0a22-d9d7-4053-9170-a1e304ac643a",
  "expires_at": "2026-10-30T15:52:06.616024838Z",
  "resend_available_at": "2026-10-30T15:47:07.616024838Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380660538927` → **200**

```json
{
  "phone": "+380660538927",
  "audience": "CLIENT",
  "code": "580120",
  "sent_at": "2026-10-30T15:47:06.617846502Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3bdf0a22-d9d7-4053-9170-a1e304ac643a",
  "code": "580120",
  "device_ref": "sandbox-10155"
}
```

```json
{
  "session_id": "bc2ce477-7d98-481c-b7bf-8270a9cbac10",
  "subject": {
    "type": "CLIENT",
    "id": "c438fa6d-c959-491d-ae9a-5d2bf6833f0e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNDM4ZmE2ZC1jOTU5LTQ5MWQtYWU5YS01ZDJiZjY4MzNmMGUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc2MTI2LCJpYXQiOjE3OTMzNzUyMjYsImp0aSI6IjE3ZjU5Y2E3LWQwODctNGJhYS1hYWQzLWYxY2U5ODgxMDNmZCIsInNpZCI6ImJjMmNlNDc3LTdkOTgtNDgxYy1iN2JmLTgyNzBhOWNiYWMxMCJ9.E-iUHmjja3VIipvPbHxfOlYkCq6rjjrpRW26kmXBLJI",
  "access_expires_at": "2026-10-30T16:02:06.823390777Z",
  "refresh_token": "_o0BD3R8CNgKFzT_y5bYEgkMB4w6ESxYaQb078gDXpg",
  "refresh_expires_at": "2026-11-29T15:47:06.823005596Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "c438fa6d-c959-491d-ae9a-5d2bf6833f0e",
  "session_id": "bc2ce477-7d98-481c-b7bf-8270a9cbac10",
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
  "phone": "+380668452383",
  "device_ref": "sandbox-7724"
}
```

```json
{
  "challenge_id": "44530738-a400-49ed-992c-41b7f2daf26f",
  "expires_at": "2026-10-30T15:52:07.201378619Z",
  "resend_available_at": "2026-10-30T15:47:08.201378619Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380668452383` → **200**

```json
{
  "phone": "+380668452383",
  "audience": "CLIENT",
  "code": "388912",
  "sent_at": "2026-10-30T15:47:07.203250744Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "44530738-a400-49ed-992c-41b7f2daf26f",
  "code": "388912",
  "device_ref": "sandbox-7724"
}
```

```json
{
  "session_id": "b452bdd2-645f-439f-a099-030c7a20816b",
  "subject": {
    "type": "CLIENT",
    "id": "40ea9ad7-768a-46c2-a4f4-1d7f69f87ff0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MGVhOWFkNy03NjhhLTQ2YzItYTRmNC0xZDdmNjlmODdmZjAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc2MTI3LCJpYXQiOjE3OTMzNzUyMjcsImp0aSI6IjRmOTJjNmFmLTYyNDctNDdiNi1hNjJkLTE0MGQ4ZmQxNzQ0NSIsInNpZCI6ImI0NTJiZGQyLTY0NWYtNDM5Zi1hMDk5LTAzMGM3YTIwODE2YiJ9.xc66rfpC6yoFCL5R_dcvByTfdi_EAf6Wh4nqs3CFL_s",
  "access_expires_at": "2026-10-30T16:02:07.407938799Z",
  "refresh_token": "UEh5RyZvo49OMOAnPHgUXju1W8boNxafUAwMxHiso5s",
  "refresh_expires_at": "2026-11-29T15:47:07.407598356Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b1997094-f01b-4d8d-bbfc-1112eb0c2e40",
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
  "id": "4652ad4b-6951-452c-abb1-ac4dc9286011",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:52:07.590755Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: 11d632af-f140-40e3-b931-78455a56725c) → **201**

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
  "session_id": "af08d054-51c4-44b5-a2df-2ffd568ccdb3",
  "subject": {
    "type": "STAFF",
    "id": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiODZhYmMzMi1mMmUyLTRjM2MtOTk2Ny05N2JmYzljZTdjZTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzYxMjgsImlhdCI6MTc5MzM3NTIyOCwianRpIjoiYjQzOTk2MWEtOTU1MS00ZmM5LWFhZTMtOGNiODAwMDNiMjU0Iiwic2lkIjoiYWYwOGQwNTQtNTFjNC00NGI1LWEyZGYtMmZmZDU2OGNjZGIzIn0.uWl72YIy8TBnYjozYVWiKT4XlMn9AHVP9KjlfjJ2J0Q",
  "access_expires_at": "2026-10-30T16:02:08.030280186Z",
  "refresh_token": "jk0P6dh3Mgw1H3yGz_gNcqPfhA1hOG37s0hx1kk7EUU",
  "refresh_expires_at": "2026-10-31T03:47:08.0299177Z",
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
  "session_id": "6581cb24-63fa-45bf-9455-3d16c83f0640",
  "subject": {
    "type": "STAFF",
    "id": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiODZhYmMzMi1mMmUyLTRjM2MtOTk2Ny05N2JmYzljZTdjZTIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzYxMjgsImlhdCI6MTc5MzM3NTIyOCwianRpIjoiZTgwYTlmNmYtZjY2Yi00Zjg5LTgwMDAtMWU3ODdkMWFhNTFjIiwic2lkIjoiNjU4MWNiMjQtNjNmYS00NWJmLTk0NTUtM2QxNmM4M2YwNjQwIn0.6ew6l6ExvTHMTZnXJltIqoezJ0eATfUKkyP_L15mo1E",
  "access_expires_at": "2026-10-30T16:02:08.416350361Z",
  "refresh_token": "MLOZRApjgbmnghfBukKUAK828GCK-3suvEsIkS8I1cY",
  "refresh_expires_at": "2026-10-31T03:47:08.41598477Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/a4c84866-85d8-431b-a741-7fddc175fd2c/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T15:47:07.780922Z",
      "actor": {
        "type": "CLIENT",
        "id": "40ea9ad7-768a-46c2-a4f4-1d7f69f87ff0",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "a4c84866-85d8-431b-a741-7fddc175fd2c",
        "quote_id": "4652ad4b-6951-452c-abb1-ac4dc9286011",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "11d632af-f140-40e3-b931-78455a56725c"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T15:47:07.782166Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "a4c84866-85d8-431b-a741-7fddc175fd2c",
        "attempt_id": "46bd23c3-f859-4853-a76d-45db39641ec3",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "11d632af-f140-40e3-b931-78455a56725c"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-30T15:47:07.814027Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "a4c84866-85d8-431b-a741-7fddc175fd2c",
        "attempt_id": "46bd23c3-f859-4853-a76d-45db39641ec3"
      },
      "correlation_id": "11d632af-f140-40e3-b931-78455a56725c"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "46bd23c3-f859-4853-a76d-45db39641ec3",
        "generation": 1,
        "started_at": "2026-10-30T15:47:07.781447Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-30T15:47:07.814027Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-30T15:47:07.78262Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/11d632af-f140-40e3-b931-78455a56725c` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "a4c84866-85d8-431b-a741-7fddc175fd2c:0",
      "order_id": "a4c84866-85d8-431b-a741-7fddc175fd2c",
      "at": "2026-10-30T15:47:07.780922Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "a4c84866-85d8-431b-a741-7fddc175fd2c:1",
      "order_id": "a4c84866-85d8-431b-a741-7fddc175fd2c",
      "at": "2026-10-30T15:47:07.782166Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "a4c84866-85d8-431b-a741-7fddc175fd2c:2",
      "order_id": "a4c84866-85d8-431b-a741-7fddc175fd2c",
      "at": "2026-10-30T15:47:07.814027Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/95239593-7987-4290-b3cd-676fd69bea77` → **200**

```json
{
  "found": []
}
```

Done: request 11d632af-f140-40e3-b931-78455a56725c — order a4c84866-85d8-431b-a741-7fddc175fd2c found by its id.

`GET /api/rider/v1/orders/a4c84866-85d8-431b-a741-7fddc175fd2c` → **200**

```json
{
  "id": "a4c84866-85d8-431b-a741-7fddc175fd2c",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "40ea9ad7-768a-46c2-a4f4-1d7f69f87ff0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:47:07.780561Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/a4c84866-85d8-431b-a741-7fddc175fd2c/cancel` → **200**

```json
{
  "command_id": "a1c914cd-10cd-497e-b7d4-2f015484d182",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "a4c84866-85d8-431b-a741-7fddc175fd2c",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "40ea9ad7-768a-46c2-a4f4-1d7f69f87ff0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T15:47:07.780561Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
      "en": "Changed my mind",
      "uk": "Передумав їхати"
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
  "phone": "+380636025479",
  "device_ref": "sandbox-4906"
}
```

```json
{
  "challenge_id": "eee075f1-e8ea-40d3-a87c-987d275551e0",
  "expires_at": "2026-10-30T15:52:09.550486399Z",
  "resend_available_at": "2026-10-30T15:47:10.550486399Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636025479` → **200**

```json
{
  "phone": "+380636025479",
  "audience": "CLIENT",
  "code": "720614",
  "sent_at": "2026-10-30T15:47:09.552583109Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "eee075f1-e8ea-40d3-a87c-987d275551e0",
  "code": "720614",
  "device_ref": "sandbox-4906"
}
```

```json
{
  "session_id": "292f097a-7261-419e-a243-a0d8490fa553",
  "subject": {
    "type": "CLIENT",
    "id": "902303be-90e4-4f21-bc11-533c1703879d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MDIzMDNiZS05MGU0LTRmMjEtYmMxMS01MzNjMTcwMzg3OWQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc2MTI5LCJpYXQiOjE3OTMzNzUyMjksImp0aSI6IjUxMGUyYTk5LTVmNzYtNGIzYy1iMzljLTllNzQ1YmNhNTcyMiIsInNpZCI6IjI5MmYwOTdhLTcyNjEtNDE5ZS1hMjQzLWEwZDg0OTBmYTU1MyJ9.ifJlk2FR4U9PFqnMUuXnD0Obl042iX7U2jun9GajTLg",
  "access_expires_at": "2026-10-30T16:02:09.752013457Z",
  "refresh_token": "TKSLDdJQCpKCMdLUXGqdeg6_8VbqprOmVqK0z4FFSHk",
  "refresh_expires_at": "2026-11-29T15:47:09.751618362Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "a671c3fd-b255-49ff-95e5-4fab18981902",
  "expires_at": "2026-10-30T15:52:11.933049083Z",
  "resend_available_at": "2026-10-30T15:47:12.933049083Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636025479` → **200**

```json
{
  "phone": "+380636025479",
  "audience": "CLIENT",
  "code": "496918",
  "sent_at": "2026-10-30T15:47:11.934677999Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "f68d3411-cc13-4eda-90d3-3a95aeb83c81",
  "challenge_id": "a671c3fd-b255-49ff-95e5-4fab18981902",
  "otp_code": "496918"
}
```

```json
{
  "id": "d44a5549-cd35-422c-b5a7-9581467b61a9",
  "state": "PENDING",
  "created_at": "2026-10-30T15:47:12.139746Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/d44a5549-cd35-422c-b5a7-9581467b61a9` → **200**

```json
{
  "id": "d44a5549-cd35-422c-b5a7-9581467b61a9",
  "state": "PENDING",
  "created_at": "2026-10-30T15:47:12.139746Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/d44a5549-cd35-422c-b5a7-9581467b61a9` → **200**

```json
{
  "id": "d44a5549-cd35-422c-b5a7-9581467b61a9",
  "state": "PENDING",
  "created_at": "2026-10-30T15:47:12.139746Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/d44a5549-cd35-422c-b5a7-9581467b61a9` → **200**

```json
{
  "id": "d44a5549-cd35-422c-b5a7-9581467b61a9",
  "state": "PENDING",
  "created_at": "2026-10-30T15:47:12.139746Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/d44a5549-cd35-422c-b5a7-9581467b61a9` → **200**

```json
{
  "id": "d44a5549-cd35-422c-b5a7-9581467b61a9",
  "state": "PENDING",
  "created_at": "2026-10-30T15:47:12.139746Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/d44a5549-cd35-422c-b5a7-9581467b61a9` → **200**

```json
{
  "id": "d44a5549-cd35-422c-b5a7-9581467b61a9",
  "state": "READY",
  "created_at": "2026-10-30T15:47:12.139746Z",
  "ready_at": "2026-10-30T15:47:16.904009Z",
  "expires_at": "2026-11-06T15:47:16.904009Z",
  "size_bytes": 1031
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/d44a5549-cd35-422c-b5a7-9581467b61a9/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631006163",
  "device_ref": "sandbox-18048"
}
```

```json
{
  "challenge_id": "5752cecc-6651-45b3-8137-62435a90003d",
  "expires_at": "2026-10-30T15:52:17.28017544Z",
  "resend_available_at": "2026-10-30T15:47:18.28017544Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631006163` → **200**

```json
{
  "phone": "+380631006163",
  "audience": "CLIENT",
  "code": "958496",
  "sent_at": "2026-10-30T15:47:17.282717903Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5752cecc-6651-45b3-8137-62435a90003d",
  "code": "958496",
  "device_ref": "sandbox-18048"
}
```

```json
{
  "session_id": "c3759e7e-6f3f-4427-8a98-af9a9641e4fe",
  "subject": {
    "type": "CLIENT",
    "id": "9f68edcd-2436-4edb-b04e-acbdf4c3e058"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZjY4ZWRjZC0yNDM2LTRlZGItYjA0ZS1hY2JkZjRjM2UwNTgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc2MTM3LCJpYXQiOjE3OTMzNzUyMzcsImp0aSI6IjRlMzZjYjRhLTM0ZGYtNDA5OS1hYTJkLTdlMThjNjNiZDg3NSIsInNpZCI6ImMzNzU5ZTdlLTZmM2YtNDQyNy04YTk4LWFmOWE5NjQxZTRmZSJ9.N2hd43ZuC0-wreMzjlZsUtkVJ_atMFXqWFuOn6RBRXw",
  "access_expires_at": "2026-10-30T16:02:17.497460581Z",
  "refresh_token": "mXsQn6zW4tsQawuAl3MaPOMekXY_bZ29BEwIwniQnIE",
  "refresh_expires_at": "2026-11-29T15:47:17.497053244Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/d44a5549-cd35-422c-b5a7-9581467b61a9/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/d44a5549-cd35-422c-b5a7-9581467b61a9/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "0ec4cf6c-0e8f-471f-8c97-17be368cc6ee"
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
  "session_id": "0999b735-dbe5-43f2-bde4-b94b6e92c08c",
  "subject": {
    "type": "STAFF",
    "id": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiODZhYmMzMi1mMmUyLTRjM2MtOTk2Ny05N2JmYzljZTdjZTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzYxMzgsImlhdCI6MTc5MzM3NTIzOCwianRpIjoiYmU2NGI1OWMtNmVlZi00MTMwLThlOGEtMzI1YTc4OTcyZTUwIiwic2lkIjoiMDk5OWI3MzUtZGJlNS00M2YyLWJkZTQtYjk0YjZlOTJjMDhjIn0.qzA4z2RyZ6jRmBJNruw8ow7hNZXfgDGs1Uj_popbpdQ",
  "access_expires_at": "2026-10-30T16:02:18.078333727Z",
  "refresh_token": "T2wdDTd7qgSrFm1aEyEoXZAAybDv0b3RGxDi65AbciM",
  "refresh_expires_at": "2026-10-31T03:47:18.07790001Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "902303be-90e4-4f21-bc11-533c1703879d",
  "session_id": "292f097a-7261-419e-a243-a0d8490fa553",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/902303be-90e4-4f21-bc11-533c1703879d/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "d44a5549-cd35-422c-b5a7-9581467b61a9",
      "state": "READY",
      "created_at": "2026-10-30T15:47:12.139746Z",
      "ready_at": "2026-10-30T15:47:16.904009Z",
      "expires_at": "2026-11-06T15:47:16.904009Z",
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
  "device_ref": "sandbox-13549"
}
```

```json
{
  "challenge_id": "c696e914-13b7-4841-b5da-e00c79963074",
  "expires_at": "2026-10-30T15:52:18.658255868Z",
  "resend_available_at": "2026-10-30T15:47:19.658255868Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "960528",
  "sent_at": "2026-10-30T15:47:18.662475304Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c696e914-13b7-4841-b5da-e00c79963074",
  "code": "960528",
  "device_ref": "sandbox-13549"
}
```

```json
{
  "session_id": "789ac3ff-79e6-4ea2-8b75-50e8b3e9bae7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NjEzOCwiaWF0IjoxNzkzMzc1MjM4LCJqdGkiOiI5NzJkN2Q4YS0xNmExLTRkYzQtODE0Ni1kYzhmZGRmZjM2MjMiLCJzaWQiOiI3ODlhYzNmZi03OWU2LTRlYTItOGI3NS01MGU4YjNlOWJhZTcifQ.GgiaXOXizmSFJAtMntaIhnHpNJh6eFbtJ-iUu35kgwI",
  "access_expires_at": "2026-10-30T16:02:18.879347454Z",
  "refresh_token": "poSbMJuhMSlOhF0O040y1LM-8ZKQPrcWHtJ8YHpC6UQ",
  "refresh_expires_at": "2026-11-29T15:47:18.878979971Z",
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
  "device_ref": "sandbox-7446"
}
```

```json
{
  "challenge_id": "26037d90-2820-44d0-900c-43aa19ffa6ef",
  "expires_at": "2026-10-30T15:52:19.253324883Z",
  "resend_available_at": "2026-10-30T15:47:20.253324883Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "716748",
  "sent_at": "2026-10-30T15:47:19.255577186Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "26037d90-2820-44d0-900c-43aa19ffa6ef",
  "code": "716748",
  "device_ref": "sandbox-7446"
}
```

```json
{
  "session_id": "8049e7c8-1be3-4497-bf72-c48720d3a268",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NjEzOSwiaWF0IjoxNzkzMzc1MjM5LCJqdGkiOiI4ZjM0MTUxMS02YmY4LTQyOWItOWJhNS0xODU0NTNkNzdjNDMiLCJzaWQiOiI4MDQ5ZTdjOC0xYmUzLTQ0OTctYmY3Mi1jNDg3MjBkM2EyNjgifQ.MgVtkiOBJeDgLqyx9LGPKe1RPL1ETWnb4So9MkZ-jYg",
  "access_expires_at": "2026-10-30T16:02:19.468919993Z",
  "refresh_token": "GcpNRjvRripKlBQdltWULVR2fmgA2RSCf0Ql4YZoBZs",
  "refresh_expires_at": "2026-11-29T15:47:19.468427457Z",
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
  "command_id": "d8dc3ab7-992a-490d-b198-73334f6ccee0",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:47:19Z",
    "sequence": 1793375239864
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3ddb8fc8-f45e-43a3-b1c9-c004b002f55d",
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
  "last_heartbeat_at": "2026-10-30T15:47:19.879532Z",
  "last_location_at": "2026-10-30T15:47:19.879532Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-5852"
}
```

```json
{
  "challenge_id": "367de2ac-fb69-4b4d-aecc-f9152f343925",
  "expires_at": "2026-10-30T15:52:20.071807336Z",
  "resend_available_at": "2026-10-30T15:47:21.071807336Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "662420",
  "sent_at": "2026-10-30T15:47:20.073759333Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "367de2ac-fb69-4b4d-aecc-f9152f343925",
  "code": "662420",
  "device_ref": "sandbox-5852"
}
```

```json
{
  "session_id": "7a75a9d6-8509-4119-a3d5-81f18159ac47",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NjE0MCwiaWF0IjoxNzkzMzc1MjQwLCJqdGkiOiI2ZWZiZGQwZi04YThlLTRjNjEtOGNlYi1mYjQ3YWNlOTVjNTEiLCJzaWQiOiI3YTc1YTlkNi04NTA5LTQxMTktYTNkNS04MWYxODE1OWFjNDcifQ.TtkZKu8wCqKers6Vopc31qLQDhFYQ2UCt6aXPZvwEsc",
  "access_expires_at": "2026-10-30T16:02:20.278610026Z",
  "refresh_token": "BxfrRsoTdhtADJXBLD79vF2t-4xwm0eNFzGMBlNGAqQ",
  "refresh_expires_at": "2026-11-29T15:47:20.278253816Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "80ad0231-7ecd-4efc-9d10-fb3b4a2b680c",
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
  "last_heartbeat_at": "2026-10-30T15:43:39.170075Z",
  "last_location_at": "2026-10-30T15:43:39.170075Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/80ad0231-7ecd-4efc-9d10-fb3b4a2b680c/handover` → **200**

```json
{
  "command_id": "d42b6a19-ac00-4a99-9d59-018293177898",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "80ad0231-7ecd-4efc-9d10-fb3b4a2b680c",
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
  "last_heartbeat_at": "2026-10-30T15:43:39.170075Z",
  "last_location_at": "2026-10-30T15:43:39.170075Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/80ad0231-7ecd-4efc-9d10-fb3b4a2b680c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:47:20Z",
    "sequence": 1793375240853
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "80ad0231-7ecd-4efc-9d10-fb3b4a2b680c",
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
  "last_heartbeat_at": "2026-10-30T15:47:20.867916Z",
  "last_location_at": "2026-10-30T15:47:20.867916Z",
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
  "session_id": "c1e395a0-8121-4862-8ad5-52d32845851e",
  "subject": {
    "type": "STAFF",
    "id": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiODZhYmMzMi1mMmUyLTRjM2MtOTk2Ny05N2JmYzljZTdjZTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzYxNDEsImlhdCI6MTc5MzM3NTI0MSwianRpIjoiZGU5YWU3NjgtZWNmMy00ZGJiLThhM2UtMTY0ZDk5ODIyZjIyIiwic2lkIjoiYzFlMzk1YTAtODEyMS00ODYyLThhZDUtNTJkMzI4NDU4NTFlIn0.lDvWKsZ_alfE1OSuRZswiUI1ykObFq6L7U92iDAQl0k",
  "access_expires_at": "2026-10-30T16:02:21.242755305Z",
  "refresh_token": "Y0nypyxZtFgXotsWliESQ3Ic3UOOe-uLQZXbQny-9ac",
  "refresh_expires_at": "2026-10-31T03:47:21.242363216Z",
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
  "session_id": "5a10918b-1f61-4ac4-8870-375351fb3a8a",
  "subject": {
    "type": "STAFF",
    "id": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiODZhYmMzMi1mMmUyLTRjM2MtOTk2Ny05N2JmYzljZTdjZTIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzYxNDEsImlhdCI6MTc5MzM3NTI0MSwianRpIjoiMWFmMDZjYjctMDZiMy00MGYwLWFiODMtMjY0N2U0NTliMzRlIiwic2lkIjoiNWExMDkxOGItMWY2MS00YWM0LTg4NzAtMzc1MzUxZmIzYThhIn0.O18q_gtRlP2kP6y_Q0cEA9OppadV7bSklupHOG804lg",
  "access_expires_at": "2026-10-30T16:02:21.61700799Z",
  "refresh_token": "VlzFjwAqq5eDhbzCcY0aMJ574aW0b9DYBQYnU3gC04g",
  "refresh_expires_at": "2026-10-31T03:47:21.616665816Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380683926712",
  "device_ref": "sandbox-6751"
}
```

```json
{
  "challenge_id": "8a0e5bd0-e069-495d-a1e4-db9f17fe766f",
  "expires_at": "2026-10-30T15:52:21.795785235Z",
  "resend_available_at": "2026-10-30T15:47:22.795785235Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380683926712` → **200**

```json
{
  "phone": "+380683926712",
  "audience": "CLIENT",
  "code": "050335",
  "sent_at": "2026-10-30T15:47:21.797783888Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8a0e5bd0-e069-495d-a1e4-db9f17fe766f",
  "code": "050335",
  "device_ref": "sandbox-6751"
}
```

```json
{
  "session_id": "72ee0456-0c87-4191-b1c7-b95f5114d617",
  "subject": {
    "type": "CLIENT",
    "id": "85f4135f-6113-4156-a41b-885147ff14ad"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NWY0MTM1Zi02MTEzLTQxNTYtYTQxYi04ODUxNDdmZjE0YWQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc2MTQxLCJpYXQiOjE3OTMzNzUyNDEsImp0aSI6IjRmZjk2NTYxLTYyYWItNGE5NS1hOWM1LWRmMWY2YmJhOTQzYiIsInNpZCI6IjcyZWUwNDU2LTBjODctNDE5MS1iMWM3LWI5NWY1MTE0ZDYxNyJ9.XeyNwr-mroLsoXn1HJF9k9io_dvKSvNnRLMRWkM75N0",
  "access_expires_at": "2026-10-30T16:02:21.999145627Z",
  "refresh_token": "p8LseW-JizMFfOc10NHcvrjC2cz200l2_nYBcSCZmhM",
  "refresh_expires_at": "2026-11-29T15:47:21.998806768Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "94a14a6a-4bb4-4d49-a8c8-c7a6c6d9d517",
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
  "id": "b9f54021-aef9-43fd-9272-f751e0fc127a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:52:22.202490Z",
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
  "command_id": "62818897-f5ed-46b7-aa7d-3264fa08deda",
  "quote_id": "b9f54021-aef9-43fd-9272-f751e0fc127a",
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
  "id": "4de3177b-02c8-46fe-b08e-b2061f04b222",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "85f4135f-6113-4156-a41b-885147ff14ad",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T15:47:22.393166Z",
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
    "id": "2daf11bc-a1de-4096-a59d-1afb6338f268",
    "order_id": "4de3177b-02c8-46fe-b08e-b2061f04b222",
    "expires_at": "2026-10-30T15:47:37.395454Z",
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

`POST /api/driver/v1/offers/2daf11bc-a1de-4096-a59d-1afb6338f268/reject` → **204**

```json
{
  "command_id": "b4ae9028-72ae-4d18-a3d7-026efbfcd256"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "4ef54a6e-b04a-458e-b52e-2d8daca1ee20",
    "order_id": "4de3177b-02c8-46fe-b08e-b2061f04b222",
    "expires_at": "2026-10-30T15:47:37.80605Z",
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

`POST /api/driver/v1/offers/4ef54a6e-b04a-458e-b52e-2d8daca1ee20/accept` → **200**

```json
{
  "command_id": "ea02c567-0d0b-46e7-a25b-67d41808799c"
}
```

```json
{
  "id": "bca9d8ad-0949-46d3-8b19-8e4ac57a5693",
  "order_id": "4de3177b-02c8-46fe-b08e-b2061f04b222",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b41d72d9-80f1-41d8-b079-8445d9ae4354",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/4de3177b-02c8-46fe-b08e-b2061f04b222/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T15:47:22.393545Z",
      "actor": {
        "type": "CLIENT",
        "id": "85f4135f-6113-4156-a41b-885147ff14ad",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "4de3177b-02c8-46fe-b08e-b2061f04b222",
        "quote_id": "b9f54021-aef9-43fd-9272-f751e0fc127a",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "5f4ea577-4150-4d0c-98b4-49ff53e73804"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T15:47:22.394914Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "4de3177b-02c8-46fe-b08e-b2061f04b222",
        "attempt_id": "d1093c27-f9ab-4b5c-accd-946ce3a896f0",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "5f4ea577-4150-4d0c-98b4-49ff53e73804"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T15:47:22.413457Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "2daf11bc-a1de-4096-a59d-1afb6338f268",
        "order_id": "4de3177b-02c8-46fe-b08e-b2061f04b222",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "5f4ea577-4150-4d0c-98b4-49ff53e73804"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-30T15:47:22.805249Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "2daf11bc-a1de-4096-a59d-1afb6338f268",
        "order_id": "4de3177b-02c8-46fe-b08e-b2061f04b222"
      },
      "correlation_id": "32b2f1f4-19c0-48a3-8621-400501120a6a"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order 4de3177b-02c8-46fe-b08e-b2061f04b222 — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/4de3177b-02c8-46fe-b08e-b2061f04b222` → **200**

```json
{
  "id": "4de3177b-02c8-46fe-b08e-b2061f04b222",
  "short_number": 13,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "85f4135f-6113-4156-a41b-885147ff14ad",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "bca9d8ad-0949-46d3-8b19-8e4ac57a5693",
    "order_id": "4de3177b-02c8-46fe-b08e-b2061f04b222",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "b41d72d9-80f1-41d8-b079-8445d9ae4354",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T15:47:22.393166Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/4de3177b-02c8-46fe-b08e-b2061f04b222/cancel` → **200**

```json
{
  "command_id": "1918cfbd-44d2-4403-93dd-5cb21b7f3d5b",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "4de3177b-02c8-46fe-b08e-b2061f04b222",
  "short_number": 13,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "85f4135f-6113-4156-a41b-885147ff14ad",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "bca9d8ad-0949-46d3-8b19-8e4ac57a5693",
    "order_id": "4de3177b-02c8-46fe-b08e-b2061f04b222",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "b41d72d9-80f1-41d8-b079-8445d9ae4354",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T15:47:22.393166Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "pl": "Brak wolnych aut",
      "ru": "Нет свободных машин",
      "en": "No cars available",
      "uk": "Немає вільних авто"
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
  "session_id": "3ddb8fc8-f45e-43a3-b1c9-c004b002f55d",
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
  "last_heartbeat_at": "2026-10-30T15:47:19.879532Z",
  "last_location_at": "2026-10-30T15:47:19.879532Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3ddb8fc8-f45e-43a3-b1c9-c004b002f55d/close` → **200**

```json
{
  "command_id": "b577b33c-090a-44e6-8d87-762890bf3480",
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
  "session_id": "80ad0231-7ecd-4efc-9d10-fb3b4a2b680c",
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
  "last_heartbeat_at": "2026-10-30T15:47:20.867916Z",
  "last_location_at": "2026-10-30T15:47:20.867916Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/80ad0231-7ecd-4efc-9d10-fb3b4a2b680c/close` → **200**

```json
{
  "command_id": "1fb5af02-086b-4fb0-a8a1-f94fd5faad52",
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
  "device_ref": "sandbox-11120"
}
```

```json
{
  "challenge_id": "e7b3b99f-15da-4b67-8c89-79678b426ea3",
  "expires_at": "2026-10-30T15:52:24.62501445Z",
  "resend_available_at": "2026-10-30T15:47:25.62501445Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "333758",
  "sent_at": "2026-10-30T15:47:24.627509579Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e7b3b99f-15da-4b67-8c89-79678b426ea3",
  "code": "333758",
  "device_ref": "sandbox-11120"
}
```

```json
{
  "session_id": "0f24aa16-96ce-4aa6-8c06-2af568d451b8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NjE0NCwiaWF0IjoxNzkzMzc1MjQ0LCJqdGkiOiJmMTNlNzY5Yy1jM2FiLTRhODAtODdmYS1lMmJmM2FlMTg3YWEiLCJzaWQiOiIwZjI0YWExNi05NmNlLTRhYTYtOGMwNi0yYWY1NjhkNDUxYjgifQ.S3pfuUG2Ug22lDMJ5sxqK1A5x2p9epAPcE5-wFaYS_Y",
  "access_expires_at": "2026-10-30T16:02:24.97512222Z",
  "refresh_token": "9opha0fqHa4PKrxmxdYRi63qYN9HReX6tFAmlEwJ39g",
  "refresh_expires_at": "2026-11-29T15:47:24.973369604Z",
  "account_created": false
}
```

`POST /api/driver/v1/documents/upload-sessions` → **201**

```json
{
  "command_id": "4c13d64e-bbe5-40ae-8675-25d1e15d61b3",
  "content_type": "application/pdf",
  "size_bytes": 87
}
```

```json
{
  "file_id": "f5ce08e6-ce24-48fc-b1c2-9f16db776051",
  "upload_path": "/api/driver/v1/uploads/f5ce08e6-ce24-48fc-b1c2-9f16db776051",
  "expires_at": "2026-10-30T16:02:25.421183282Z",
  "max_bytes": 87
}
```

`PUT /api/driver/v1/uploads/f5ce08e6-ce24-48fc-b1c2-9f16db776051` → **200**

```json
{
  "file_id": "f5ce08e6-ce24-48fc-b1c2-9f16db776051",
  "state": "SAFE",
  "content_type": "application/pdf",
  "size_bytes": 87,
  "reject_reason": null
}
```

## On the server's disk the file is not the PDF

Stored at `driver_document/2026-10/f5ce08e6-ce24-48fc-b1c2-9f16db776051`, first bytes `425a46318edee943` (plain: `255044462d312e37` = %PDF-1.7).

## His download is exactly what he uploaded

`GET /api/driver/v1/files/f5ce08e6-ce24-48fc-b1c2-9f16db776051` → **200**

SHA-256 uploaded `6aee3e489ee052413e03dc3f1b6c0402e4daf3ea293e9e13f554394236d8bc25`, downloaded `6aee3e489ee052413e03dc3f1b6c0402e4daf3ea293e9e13f554394236d8bc25`.

Done: document f5ce08e6-ce24-48fc-b1c2-9f16db776051 is encrypted on disk and downloads unchanged.

# Scenario: driver-states

## Only the two drivers of this scenario are online: Near about 200 m from the pickup, Far about 600 m

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-2112"
}
```

```json
{
  "challenge_id": "bbec912a-fe3a-4625-86c0-bb11ae22cc78",
  "expires_at": "2026-10-30T15:52:25.758327307Z",
  "resend_available_at": "2026-10-30T15:47:26.758327307Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "576301",
  "sent_at": "2026-10-30T15:47:25.760525548Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bbec912a-fe3a-4625-86c0-bb11ae22cc78",
  "code": "576301",
  "device_ref": "sandbox-2112"
}
```

```json
{
  "session_id": "d0ee86a0-18c2-4ac6-b5fe-f664034ea32a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NjE0NSwiaWF0IjoxNzkzMzc1MjQ1LCJqdGkiOiIwNDBkNjliZC0xMTM4LTRhMDEtYmVhMi1lZjcyMjJlZWY5NzIiLCJzaWQiOiJkMGVlODZhMC0xOGMyLTRhYzYtYjVmZS1mNjY0MDM0ZWEzMmEifQ.cZF7-UcXIGYrt1eQkBh_zuGNCPSij9TKmW7M4dSFE14",
  "access_expires_at": "2026-10-30T16:02:25.987301452Z",
  "refresh_token": "DpY_o86G_7rYHyQXZDzlL0sWz7AqdHiYpQbd2HX3N6A",
  "refresh_expires_at": "2026-11-29T15:47:25.98688847Z",
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
  "device_ref": "sandbox-11891"
}
```

```json
{
  "challenge_id": "c703fa2e-00e5-4897-969c-82acfb501648",
  "expires_at": "2026-10-30T15:52:26.373251704Z",
  "resend_available_at": "2026-10-30T15:47:27.373251704Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "930895",
  "sent_at": "2026-10-30T15:47:26.375397883Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c703fa2e-00e5-4897-969c-82acfb501648",
  "code": "930895",
  "device_ref": "sandbox-11891"
}
```

```json
{
  "session_id": "ee2c310a-b0a5-4475-bdae-93e7eb1ef387",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NjE0NiwiaWF0IjoxNzkzMzc1MjQ2LCJqdGkiOiI3ZDIzYjIxZC1iY2M5LTRkNmEtODZkYi00NTIzOTgzOWYwOTMiLCJzaWQiOiJlZTJjMzEwYS1iMGE1LTQ0NzUtYmRhZS05M2U3ZWIxZWYzODcifQ.TfR9HZtgDIiIz2dwfzA4OqVrtLpAL28CuEx9v3NT92w",
  "access_expires_at": "2026-10-30T16:02:26.595415083Z",
  "refresh_token": "eFe4iWxS3maMwMLzauDwelOCKKzTsjqMWEsWCpopFWA",
  "refresh_expires_at": "2026-11-29T15:47:26.595009995Z",
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
  "command_id": "82fc2c77-5e6e-4737-9552-fd73e974e927",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:47:26Z",
    "sequence": 1793375247156
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "19fb37fb-5df1-4b39-8a85-f8e6d067381b",
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
  "last_heartbeat_at": "2026-10-30T15:47:27.017216Z",
  "last_location_at": "2026-10-30T15:47:27.017216Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-2336"
}
```

```json
{
  "challenge_id": "c3fbb762-f20b-49df-8fe6-d22cb951982c",
  "expires_at": "2026-10-30T15:52:27.214752621Z",
  "resend_available_at": "2026-10-30T15:47:28.214752621Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "513783",
  "sent_at": "2026-10-30T15:47:27.216985519Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c3fbb762-f20b-49df-8fe6-d22cb951982c",
  "code": "513783",
  "device_ref": "sandbox-2336"
}
```

```json
{
  "session_id": "aec13064-ef95-43d2-8c30-d0e1f8058e4a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NjE0NywiaWF0IjoxNzkzMzc1MjQ3LCJqdGkiOiI2ZGM0OGY4MC0zMTUxLTQ2N2MtYmI3MS03YWE1YTYyMTA1ZmYiLCJzaWQiOiJhZWMxMzA2NC1lZjk1LTQzZDItOGMzMC1kMGUxZjgwNThlNGEifQ.xc6iAwCxwmSr5W1AzEw9JM-h_nXL_MSTPH2Gj6n7Ra0",
  "access_expires_at": "2026-10-30T16:02:27.432720127Z",
  "refresh_token": "PxPozflh2EUyrsbPUS-am99_C2cxuWgvRPSzR3ZUAeQ",
  "refresh_expires_at": "2026-11-29T15:47:27.432353756Z",
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
  "command_id": "fa291573-011d-4fe2-8ac9-8e6e1d4962b7",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:47:27Z",
    "sequence": 1793375247829
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "f5cc8bb3-7fa7-4c78-9144-6ffd7715c125",
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
  "last_heartbeat_at": "2026-10-30T15:47:27.84526Z",
  "last_location_at": "2026-10-30T15:47:27.84526Z",
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
  "session_id": "9d17c534-e609-4237-bd64-8d4a2d195e17",
  "subject": {
    "type": "STAFF",
    "id": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiODZhYmMzMi1mMmUyLTRjM2MtOTk2Ny05N2JmYzljZTdjZTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzYxNDgsImlhdCI6MTc5MzM3NTI0OCwianRpIjoiZTE5ZTQ1MDYtOTEyMi00MThlLThmYjMtNDczMjE1ZDYyMzk1Iiwic2lkIjoiOWQxN2M1MzQtZTYwOS00MjM3LWJkNjQtOGQ0YTJkMTk1ZTE3In0.3QwmS0bLp8Ab41DG8srMZ5bLdqYE7TNooqKivbiHAAw",
  "access_expires_at": "2026-10-30T16:02:28.252595428Z",
  "refresh_token": "7_aqVyWC9HEzWUt42-4oa4j1CWJVhkeGcoKW6cwtnP4",
  "refresh_expires_at": "2026-10-31T03:47:28.252119131Z",
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
  "session_id": "03bc9249-b67d-4d44-8905-0218b499ba17",
  "subject": {
    "type": "STAFF",
    "id": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiODZhYmMzMi1mMmUyLTRjM2MtOTk2Ny05N2JmYzljZTdjZTIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzYxNDgsImlhdCI6MTc5MzM3NTI0OCwianRpIjoiMzUxOWZhMmMtODNhOS00YTk4LWI3Y2ItMWZiMDZlNDMzYTk1Iiwic2lkIjoiMDNiYzkyNDktYjY3ZC00ZDQ0LTg5MDUtMDIxOGI0OTliYTE3In0.ocfRQj_wwfq-pwCUvhTbufVqEAnjUWZULD7lTymwXgQ",
  "access_expires_at": "2026-10-30T16:02:28.635777981Z",
  "refresh_token": "326G00eAdyPa7eEhBVIX6SxXFEobMGFARpBwRjvrlOQ",
  "refresh_expires_at": "2026-10-31T03:47:28.635433232Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380685479790",
  "device_ref": "sandbox-13997"
}
```

```json
{
  "challenge_id": "70439c77-c544-47e2-b131-16f5aa72cb43",
  "expires_at": "2026-10-30T15:52:28.819432498Z",
  "resend_available_at": "2026-10-30T15:47:29.819432498Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380685479790` → **200**

```json
{
  "phone": "+380685479790",
  "audience": "CLIENT",
  "code": "386629",
  "sent_at": "2026-10-30T15:47:28.821379737Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "70439c77-c544-47e2-b131-16f5aa72cb43",
  "code": "386629",
  "device_ref": "sandbox-13997"
}
```

```json
{
  "session_id": "f0f1e9d1-ed76-4efb-b0c1-b3d67bc6bfc2",
  "subject": {
    "type": "CLIENT",
    "id": "533c377d-b87c-4df5-bfcb-a2de5a4505f0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MzNjMzc3ZC1iODdjLTRkZjUtYmZjYi1hMmRlNWE0NTA1ZjAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc2MTQ5LCJpYXQiOjE3OTMzNzUyNDksImp0aSI6ImE2YzkzZDQ4LWM5ODctNDkzYS05MGEzLTZiMWFkN2QzMTRiOCIsInNpZCI6ImYwZjFlOWQxLWVkNzYtNGVmYi1iMGMxLWIzZDY3YmM2YmZjMiJ9.znEv4SdHr74tMr7XGcazgOyagFHBG9tVaD7_Xl2sLxE",
  "access_expires_at": "2026-10-30T16:02:29.020996506Z",
  "refresh_token": "N16YCo1wnX_dhJsdqFo7v04gVpzk3Uvpc2ejASOX4g4",
  "refresh_expires_at": "2026-11-29T15:47:29.020663415Z",
  "account_created": true
}
```

## E2: Near has the offer and pauses: the offer is revoked and Far gets the order at once

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "2dc84c72-87eb-4c6b-a5c4-586815c8ff67",
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
  "id": "6b4d7395-351c-49e5-b163-8be8c9d2ff85",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:52:29.205993Z",
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
  "command_id": "938f80d4-175f-4460-83e3-d5695556e5ce",
  "quote_id": "6b4d7395-351c-49e5-b163-8be8c9d2ff85",
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
  "id": "e552cacb-cb90-46bd-8ef9-644cf8874dd0",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "533c377d-b87c-4df5-bfcb-a2de5a4505f0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T15:47:29.399236Z",
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
    "id": "85440050-3ef2-4153-b32a-75342586dbce",
    "order_id": "e552cacb-cb90-46bd-8ef9-644cf8874dd0",
    "expires_at": "2026-10-30T15:47:44.401053Z",
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
  "session_id": "19fb37fb-5df1-4b39-8a85-f8e6d067381b",
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
  "last_heartbeat_at": "2026-10-30T15:47:27.017216Z",
  "last_location_at": "2026-10-30T15:47:27.017216Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

`POST /api/driver/v1/work-sessions/19fb37fb-5df1-4b39-8a85-f8e6d067381b/pause` → **200**

```json
{
  "command_id": "e8356e5c-342e-4628-bab8-792467d42423",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "19fb37fb-5df1-4b39-8a85-f8e6d067381b",
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
  "last_heartbeat_at": "2026-10-30T15:47:27.017216Z",
  "last_location_at": "2026-10-30T15:47:27.017216Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/offers/85440050-3ef2-4153-b32a-75342586dbce/accept` → **409**

```json
{
  "command_id": "c5aae0bd-9903-41f6-a993-b736b5fd95b8"
}
```

```json
{
  "instance": "/api/driver/v1/offers/85440050-3ef2-4153-b32a-75342586dbce/accept",
  "status": 409,
  "title": "Offer revoked",
  "type": "https://errors.blizz.taxi/offer-revoked",
  "code": "OFFER_REVOKED",
  "correlation_id": "18f29dc5-8bda-419d-a2fe-cdfc453ba38e"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "7596415d-a77b-46a8-98a0-3a4cc156e04b",
    "order_id": "e552cacb-cb90-46bd-8ef9-644cf8874dd0",
    "expires_at": "2026-10-30T15:47:44.988599Z",
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

`POST /api/driver/v1/offers/7596415d-a77b-46a8-98a0-3a4cc156e04b/reject` → **204**

```json
{
  "command_id": "ddc5f110-0cc4-42b4-b362-26cc87e82172"
}
```

`GET /api/operator/v1/orders/e552cacb-cb90-46bd-8ef9-644cf8874dd0/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T15:47:29.399564Z",
      "actor": {
        "type": "CLIENT",
        "id": "533c377d-b87c-4df5-bfcb-a2de5a4505f0",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "e552cacb-cb90-46bd-8ef9-644cf8874dd0",
        "quote_id": "6b4d7395-351c-49e5-b163-8be8c9d2ff85",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "665364a1-2437-42b2-8c00-7d3e89085eea"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T15:47:29.400625Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "e552cacb-cb90-46bd-8ef9-644cf8874dd0",
        "attempt_id": "e8e8b81b-6b2d-4ac2-bb91-a30cc055c2ba",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "665364a1-2437-42b2-8c00-7d3e89085eea"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T15:47:29.418467Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "85440050-3ef2-4153-b32a-75342586dbce",
        "order_id": "e552cacb-cb90-46bd-8ef9-644cf8874dd0",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "665364a1-2437-42b2-8c00-7d3e89085eea"
    },
    {
      "sequence": 3,
      "type": "OfferRevoked",
      "occurred_at": "2026-10-30T15:47:29.9878Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": "DRIVER_PAUSED",
      "details": {
        "reason": "DRIVER_PAUSED",
        "offer_id": "85440050-3ef2-4153-b32a-75342586dbce",
        "order_id": "e552cacb-cb90-46bd-8ef9-644cf8874dd0",
        "driver_id": "5a000000-0000-4000-8000-000000000401"
      },
      "correlation_id": "81e2ee30-31fd-436c-a50d-c24dd4f2f381"
    },
```

`GET /api/operator/v1/orders/e552cacb-cb90-46bd-8ef9-644cf8874dd0` → **200**

```json
{
  "id": "e552cacb-cb90-46bd-8ef9-644cf8874dd0",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "533c377d-b87c-4df5-bfcb-a2de5a4505f0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:47:29.399236Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/e552cacb-cb90-46bd-8ef9-644cf8874dd0/cancel` → **200**

```json
{
  "command_id": "4f9e1e4d-4a8a-4d7e-9e79-d5307347b09c",
  "expected_version": 6,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "e552cacb-cb90-46bd-8ef9-644cf8874dd0",
  "short_number": 14,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 7,
  "channel": "APP",
  "payer_client_id": "533c377d-b87c-4df5-bfcb-a2de5a4505f0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T15:47:29.399236Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "pl": "Brak wolnych aut",
      "ru": "Нет свободных машин",
      "en": "No cars available",
      "uk": "Немає вільних авто"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

E2: offer 85440050-3ef2-4153-b32a-75342586dbce revoked by the pause, the late accept got OFFER_REVOKED, Far had the order next.

## E5: pause and accept sent at the same moment, five rounds; Far is offline so each order goes to Near

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "f5cc8bb3-7fa7-4c78-9144-6ffd7715c125",
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
  "last_heartbeat_at": "2026-10-30T15:47:27.84526Z",
  "last_location_at": "2026-10-30T15:47:27.84526Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f5cc8bb3-7fa7-4c78-9144-6ffd7715c125/close` → **200**

```json
{
  "command_id": "e52633b3-6f65-45f9-9917-38e278142529",
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
  "session_id": "19fb37fb-5df1-4b39-8a85-f8e6d067381b",
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
  "last_heartbeat_at": "2026-10-30T15:47:27.017216Z",
  "last_location_at": "2026-10-30T15:47:27.017216Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/work-sessions/19fb37fb-5df1-4b39-8a85-f8e6d067381b/resume` → **200**

```json
{
  "command_id": "cf310029-5ab7-4a1c-a7bc-0326b91369c0",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "19fb37fb-5df1-4b39-8a85-f8e6d067381b",
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
  "last_heartbeat_at": "2026-10-30T15:47:27.017216Z",
  "last_location_at": "2026-10-30T15:47:27.017216Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/19fb37fb-5df1-4b39-8a85-f8e6d067381b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:47:31Z",
    "sequence": 1793375251988
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "19fb37fb-5df1-4b39-8a85-f8e6d067381b",
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
  "last_heartbeat_at": "2026-10-30T15:47:32.003437Z",
  "last_location_at": "2026-10-30T15:47:32.003437Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "29f1262d-e632-477b-ba0f-cd2f50b857ec",
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
  "id": "d1058975-8987-4eb2-a0b7-a171c8241f32",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:52:32.198140Z",
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
  "command_id": "b437d911-1d06-413c-86d7-fcace63568fa",
  "quote_id": "d1058975-8987-4eb2-a0b7-a171c8241f32",
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
  "id": "b6432429-f324-467c-980c-c0518b87121e",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "533c377d-b87c-4df5-bfcb-a2de5a4505f0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T15:47:32.391947Z",
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
    "id": "abecd510-21ed-4da5-85d4-288fac8cdf65",
    "order_id": "b6432429-f324-467c-980c-c0518b87121e",
    "expires_at": "2026-10-30T15:47:47.394923Z",
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
  "session_id": "19fb37fb-5df1-4b39-8a85-f8e6d067381b",
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
  "last_heartbeat_at": "2026-10-30T15:47:32.003437Z",
  "last_location_at": "2026-10-30T15:47:32.003437Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

Round 1, at the same moment:

`POST /api/driver/v1/offers/abecd510-21ed-4da5-85d4-288fac8cdf65/accept` → **409**

```json
{
  "instance": "/api/driver/v1/offers/abecd510-21ed-4da5-85d4-288fac8cdf65/accept",
  "status": 409,
  "title": "Offer revoked",
  "type": "https://errors.blizz.taxi/offer-revoked",
  "code": "OFFER_REVOKED",
  "correlation_id": "8da838cb-9c03-4e7b-ba57-0b3a0e35a8b8"
}
```

`POST /api/driver/v1/work-sessions/19fb37fb-5df1-4b39-8a85-f8e6d067381b/pause` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "19fb37fb-5df1-4b39-8a85-f8e6d067381b",
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
  "last_heartbeat_at": "2026-10-30T15:47:32.003437Z",
  "last_location_at": "2026-10-30T15:47:32.003437Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

Round 1: the pause won; the accept got OFFER_REVOKED.

`GET /api/operator/v1/orders/b6432429-f324-467c-980c-c0518b87121e` → **200**

```json
{
  "id": "b6432429-f324-467c-980c-c0518b87121e",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "533c377d-b87c-4df5-bfcb-a2de5a4505f0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:47:32.391947Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/b6432429-f324-467c-980c-c0518b87121e` → **200**

```json
{
  "id": "b6432429-f324-467c-980c-c0518b87121e",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "533c377d-b87c-4df5-bfcb-a2de5a4505f0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:47:32.391947Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/b6432429-f324-467c-980c-c0518b87121e/cancel` → **200**

```json
{
  "command_id": "393b2b30-b57a-4b6b-b1f1-ebb9e2150d98",
  "expected_version": 4,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "b6432429-f324-467c-980c-c0518b87121e",
  "short_number": 15,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "533c377d-b87c-4df5-bfcb-a2de5a4505f0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T15:47:32.391947Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "pl": "Brak wolnych aut",
      "ru": "Нет свободных машин",
      "en": "No cars available",
      "uk": "Немає вільних авто"
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
  "session_id": "19fb37fb-5df1-4b39-8a85-f8e6d067381b",
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
  "last_heartbeat_at": "2026-10-30T15:47:32.003437Z",
  "last_location_at": "2026-10-30T15:47:32.003437Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/work-sessions/19fb37fb-5df1-4b39-8a85-f8e6d067381b/resume` → **200**

```json
{
  "command_id": "30ae5d0e-37b1-4dfd-9a0b-4abeddbdc9ea",
  "expected_version": 3
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "19fb37fb-5df1-4b39-8a85-f8e6d067381b",
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
  "last_heartbeat_at": "2026-10-30T15:47:32.003437Z",
  "last_location_at": "2026-10-30T15:47:32.003437Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/19fb37fb-5df1-4b39-8a85-f8e6d067381b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:47:34Z",
    "sequence": 1793375254392
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "19fb37fb-5df1-4b39-8a85-f8e6d067381b",
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
  "last_heartbeat_at": "2026-10-30T15:47:34.055684Z",
  "last_location_at": "2026-10-30T15:47:34.055684Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "89472d33-e27d-4148-8af9-df08943f8a38",
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
  "id": "600e2b85-6700-4cbf-a75a-0484f416dcce",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:52:34.256862Z",
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
  "command_id": "374663ac-9ab9-4f21-8cb3-42d7388ddfe9",
  "quote_id": "600e2b85-6700-4cbf-a75a-0484f416dcce",
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
  "id": "3b675e8e-d142-49fa-89c7-6906690cf6fb",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "533c377d-b87c-4df5-bfcb-a2de5a4505f0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T15:47:34.462481Z",
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
    "id": "e5cdd201-c0b7-4eff-8e94-66f37697bf99",
    "order_id": "3b675e8e-d142-49fa-89c7-6906690cf6fb",
    "expires_at": "2026-10-30T15:47:49.464789Z",
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
  "session_id": "19fb37fb-5df1-4b39-8a85-f8e6d067381b",
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
  "last_heartbeat_at": "2026-10-30T15:47:34.055684Z",
  "last_location_at": "2026-10-30T15:47:34.055684Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

Round 2, at the same moment:

`POST /api/driver/v1/offers/e5cdd201-c0b7-4eff-8e94-66f37697bf99/accept` → **409**

```json
{
  "instance": "/api/driver/v1/offers/e5cdd201-c0b7-4eff-8e94-66f37697bf99/accept",
  "status": 409,
  "title": "Offer revoked",
  "type": "https://errors.blizz.taxi/offer-revoked",
  "code": "OFFER_REVOKED",
  "correlation_id": "07ee76b0-244e-4715-a03f-227fdc2fb060"
}
```

`POST /api/driver/v1/work-sessions/19fb37fb-5df1-4b39-8a85-f8e6d067381b/pause` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "19fb37fb-5df1-4b39-8a85-f8e6d067381b",
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
  "last_heartbeat_at": "2026-10-30T15:47:34.055684Z",
  "last_location_at": "2026-10-30T15:47:34.055684Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

Round 2: the pause won; the accept got OFFER_REVOKED.

`GET /api/operator/v1/orders/3b675e8e-d142-49fa-89c7-6906690cf6fb` → **200**

```json
{
  "id": "3b675e8e-d142-49fa-89c7-6906690cf6fb",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "533c377d-b87c-4df5-bfcb-a2de5a4505f0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:47:34.462481Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/3b675e8e-d142-49fa-89c7-6906690cf6fb` → **200**

```json
{
  "id": "3b675e8e-d142-49fa-89c7-6906690cf6fb",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "533c377d-b87c-4df5-bfcb-a2de5a4505f0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:47:34.462481Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/3b675e8e-d142-49fa-89c7-6906690cf6fb/cancel` → **200**

```json
{
  "command_id": "31d26167-982c-470b-8c41-37d977134bc5",
  "expected_version": 4,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "3b675e8e-d142-49fa-89c7-6906690cf6fb",
  "short_number": 16,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "533c377d-b87c-4df5-bfcb-a2de5a4505f0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T15:47:34.462481Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "pl": "Brak wolnych aut",
      "ru": "Нет свободных машин",
      "en": "No cars available",
      "uk": "Немає вільних авто"
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
  "session_id": "19fb37fb-5df1-4b39-8a85-f8e6d067381b",
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
  "last_heartbeat_at": "2026-10-30T15:47:34.055684Z",
  "last_location_at": "2026-10-30T15:47:34.055684Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/work-sessions/19fb37fb-5df1-4b39-8a85-f8e6d067381b/resume` → **200**

```json
{
  "command_id": "43f78ae0-a88c-4d92-9d35-9141c2c1146a",
  "expected_version": 5
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "19fb37fb-5df1-4b39-8a85-f8e6d067381b",
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
  "last_heartbeat_at": "2026-10-30T15:47:34.055684Z",
  "last_location_at": "2026-10-30T15:47:34.055684Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/19fb37fb-5df1-4b39-8a85-f8e6d067381b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:47:36Z",
    "sequence": 1793375256144
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "19fb37fb-5df1-4b39-8a85-f8e6d067381b",
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
  "last_heartbeat_at": "2026-10-30T15:47:36.160358Z",
  "last_location_at": "2026-10-30T15:47:36.160358Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c255470d-e85e-4d0e-9a97-1135ee541dbe",
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
  "id": "c69b8ccd-20d3-40bb-aca3-73df3b49e187",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:52:36.352859Z",
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
  "command_id": "776ced5c-edb6-40f8-8ac2-72b81dfa1f18",
  "quote_id": "c69b8ccd-20d3-40bb-aca3-73df3b49e187",
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
  "id": "d0a03cf7-29eb-47a7-8e7e-db5499138325",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "533c377d-b87c-4df5-bfcb-a2de5a4505f0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T15:47:36.541802Z",
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
    "id": "05e71b86-96ae-4200-b02a-b79c85f45173",
    "order_id": "d0a03cf7-29eb-47a7-8e7e-db5499138325",
    "expires_at": "2026-10-30T15:47:51.544074Z",
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
  "session_id": "19fb37fb-5df1-4b39-8a85-f8e6d067381b",
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
  "last_heartbeat_at": "2026-10-30T15:47:36.160358Z",
  "last_location_at": "2026-10-30T15:47:36.160358Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

Round 3, at the same moment:

`POST /api/driver/v1/offers/05e71b86-96ae-4200-b02a-b79c85f45173/accept` → **409**

```json
{
  "instance": "/api/driver/v1/offers/05e71b86-96ae-4200-b02a-b79c85f45173/accept",
  "status": 409,
  "title": "Offer revoked",
  "type": "https://errors.blizz.taxi/offer-revoked",
  "code": "OFFER_REVOKED",
  "correlation_id": "273eea7d-ad4b-4d6b-a1ac-a7e6681f590d"
}
```

`POST /api/driver/v1/work-sessions/19fb37fb-5df1-4b39-8a85-f8e6d067381b/pause` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "19fb37fb-5df1-4b39-8a85-f8e6d067381b",
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
  "last_heartbeat_at": "2026-10-30T15:47:36.160358Z",
  "last_location_at": "2026-10-30T15:47:36.160358Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

Round 3: the pause won; the accept got OFFER_REVOKED.

`GET /api/operator/v1/orders/d0a03cf7-29eb-47a7-8e7e-db5499138325` → **200**

```json
{
  "id": "d0a03cf7-29eb-47a7-8e7e-db5499138325",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "533c377d-b87c-4df5-bfcb-a2de5a4505f0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:47:36.541802Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/d0a03cf7-29eb-47a7-8e7e-db5499138325` → **200**

```json
{
  "id": "d0a03cf7-29eb-47a7-8e7e-db5499138325",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "533c377d-b87c-4df5-bfcb-a2de5a4505f0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:47:36.541802Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/d0a03cf7-29eb-47a7-8e7e-db5499138325/cancel` → **200**

```json
{
  "command_id": "91b9a3ac-8d62-4528-908a-8365e71010dc",
  "expected_version": 4,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "d0a03cf7-29eb-47a7-8e7e-db5499138325",
  "short_number": 17,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "533c377d-b87c-4df5-bfcb-a2de5a4505f0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T15:47:36.541802Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "pl": "Brak wolnych aut",
      "ru": "Нет свободных машин",
      "en": "No cars available",
      "uk": "Немає вільних авто"
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
  "session_id": "19fb37fb-5df1-4b39-8a85-f8e6d067381b",
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
  "last_heartbeat_at": "2026-10-30T15:47:36.160358Z",
  "last_location_at": "2026-10-30T15:47:36.160358Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/work-sessions/19fb37fb-5df1-4b39-8a85-f8e6d067381b/resume` → **200**

```json
{
  "command_id": "04c6ff42-5d42-45c3-a94e-50f8642b1928",
  "expected_version": 7
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "19fb37fb-5df1-4b39-8a85-f8e6d067381b",
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
  "last_heartbeat_at": "2026-10-30T15:47:36.160358Z",
  "last_location_at": "2026-10-30T15:47:36.160358Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/19fb37fb-5df1-4b39-8a85-f8e6d067381b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:47:38Z",
    "sequence": 1793375258284
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "19fb37fb-5df1-4b39-8a85-f8e6d067381b",
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
  "last_heartbeat_at": "2026-10-30T15:47:38.299851Z",
  "last_location_at": "2026-10-30T15:47:38.299851Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "da6e0f1c-efb4-4118-b1a3-be6cdefe9830",
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
  "id": "b658cc6d-651a-4eb0-8e6f-be15fbb9ae4f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:52:38.491475Z",
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
  "command_id": "63b9f029-7ce1-4cce-9068-a1472b755778",
  "quote_id": "b658cc6d-651a-4eb0-8e6f-be15fbb9ae4f",
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
  "id": "094154ad-d1fc-472c-b1f4-321e7e355f2c",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "533c377d-b87c-4df5-bfcb-a2de5a4505f0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T15:47:38.685585Z",
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
    "id": "85a92a9b-fdc2-48a3-ac64-bd8c86d3aaf7",
    "order_id": "094154ad-d1fc-472c-b1f4-321e7e355f2c",
    "expires_at": "2026-10-30T15:47:53.688952Z",
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
  "session_id": "19fb37fb-5df1-4b39-8a85-f8e6d067381b",
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
  "last_heartbeat_at": "2026-10-30T15:47:38.299851Z",
  "last_location_at": "2026-10-30T15:47:38.299851Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

Round 4, at the same moment:

`POST /api/driver/v1/offers/85a92a9b-fdc2-48a3-ac64-bd8c86d3aaf7/accept` → **409**

```json
{
  "instance": "/api/driver/v1/offers/85a92a9b-fdc2-48a3-ac64-bd8c86d3aaf7/accept",
  "status": 409,
  "title": "Offer revoked",
  "type": "https://errors.blizz.taxi/offer-revoked",
  "code": "OFFER_REVOKED",
  "correlation_id": "84a64167-477d-4a14-ac4e-940fb1697233"
}
```

`POST /api/driver/v1/work-sessions/19fb37fb-5df1-4b39-8a85-f8e6d067381b/pause` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "19fb37fb-5df1-4b39-8a85-f8e6d067381b",
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
  "last_heartbeat_at": "2026-10-30T15:47:38.299851Z",
  "last_location_at": "2026-10-30T15:47:38.299851Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

Round 4: the pause won; the accept got OFFER_REVOKED.

`GET /api/operator/v1/orders/094154ad-d1fc-472c-b1f4-321e7e355f2c` → **200**

```json
{
  "id": "094154ad-d1fc-472c-b1f4-321e7e355f2c",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "533c377d-b87c-4df5-bfcb-a2de5a4505f0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:47:38.685585Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/094154ad-d1fc-472c-b1f4-321e7e355f2c` → **200**

```json
{
  "id": "094154ad-d1fc-472c-b1f4-321e7e355f2c",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "533c377d-b87c-4df5-bfcb-a2de5a4505f0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:47:38.685585Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/094154ad-d1fc-472c-b1f4-321e7e355f2c/cancel` → **200**

```json
{
  "command_id": "30d99389-d779-4b66-a1b7-8497496124e7",
  "expected_version": 4,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "094154ad-d1fc-472c-b1f4-321e7e355f2c",
  "short_number": 18,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "533c377d-b87c-4df5-bfcb-a2de5a4505f0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T15:47:38.685585Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "pl": "Brak wolnych aut",
      "ru": "Нет свободных машин",
      "en": "No cars available",
      "uk": "Немає вільних авто"
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
  "session_id": "19fb37fb-5df1-4b39-8a85-f8e6d067381b",
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
  "last_heartbeat_at": "2026-10-30T15:47:38.299851Z",
  "last_location_at": "2026-10-30T15:47:38.299851Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/work-sessions/19fb37fb-5df1-4b39-8a85-f8e6d067381b/resume` → **200**

```json
{
  "command_id": "30ee1afe-78f9-4d1d-a1fc-6113edefa540",
  "expected_version": 9
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "19fb37fb-5df1-4b39-8a85-f8e6d067381b",
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
  "last_heartbeat_at": "2026-10-30T15:47:38.299851Z",
  "last_location_at": "2026-10-30T15:47:38.299851Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/19fb37fb-5df1-4b39-8a85-f8e6d067381b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:47:40Z",
    "sequence": 1793375260316
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "19fb37fb-5df1-4b39-8a85-f8e6d067381b",
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
  "last_heartbeat_at": "2026-10-30T15:47:40.33224Z",
  "last_location_at": "2026-10-30T15:47:40.33224Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "db6d249a-5607-469c-9c4f-f0a65044dbab",
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
  "id": "174bb221-f48f-4acd-a306-98e97fbc51db",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:52:40.527163Z",
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
  "command_id": "81d40f03-7566-4996-89dd-fc8a2b983514",
  "quote_id": "174bb221-f48f-4acd-a306-98e97fbc51db",
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
  "id": "fd028002-0309-4d32-ab07-a67a9c31c78b",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "533c377d-b87c-4df5-bfcb-a2de5a4505f0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T15:47:40.722322Z",
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
    "id": "e65d193f-0bf1-423d-b45b-3a496ea02c36",
    "order_id": "fd028002-0309-4d32-ab07-a67a9c31c78b",
    "expires_at": "2026-10-30T15:47:55.725028Z",
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
  "session_id": "19fb37fb-5df1-4b39-8a85-f8e6d067381b",
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
  "last_heartbeat_at": "2026-10-30T15:47:40.33224Z",
  "last_location_at": "2026-10-30T15:47:40.33224Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

Round 5, at the same moment:

`POST /api/driver/v1/offers/e65d193f-0bf1-423d-b45b-3a496ea02c36/accept` → **200**

```json
{
  "id": "e41709ff-2241-453d-86bf-4b069371c8d6",
  "order_id": "fd028002-0309-4d32-ab07-a67a9c31c78b",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "7df1edfa-b28b-40cb-8990-5a1c1b8a4216",
  "trip_phase": "TO_PICKUP"
}
```

`POST /api/driver/v1/work-sessions/19fb37fb-5df1-4b39-8a85-f8e6d067381b/pause` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "19fb37fb-5df1-4b39-8a85-f8e6d067381b",
  "session_version": 11,
  "session_state": "OPEN",
  "intent": "PAUSE_AFTER_CURRENT",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T15:47:40.33224Z",
  "last_location_at": "2026-10-30T15:47:40.33224Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_PAUSE_AFTER_CURRENT",
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

Round 5: the accept won; the pause waits for the end of the trip.

`GET /api/operator/v1/orders/fd028002-0309-4d32-ab07-a67a9c31c78b` → **200**

```json
{
  "id": "fd028002-0309-4d32-ab07-a67a9c31c78b",
  "short_number": 19,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "533c377d-b87c-4df5-bfcb-a2de5a4505f0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "e41709ff-2241-453d-86bf-4b069371c8d6",
    "order_id": "fd028002-0309-4d32-ab07-a67a9c31c78b",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "7df1edfa-b28b-40cb-8990-5a1c1b8a4216",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T15:47:40.722322Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/fd028002-0309-4d32-ab07-a67a9c31c78b` → **200**

```json
{
  "id": "fd028002-0309-4d32-ab07-a67a9c31c78b",
  "short_number": 19,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "533c377d-b87c-4df5-bfcb-a2de5a4505f0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "e41709ff-2241-453d-86bf-4b069371c8d6",
    "order_id": "fd028002-0309-4d32-ab07-a67a9c31c78b",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "7df1edfa-b28b-40cb-8990-5a1c1b8a4216",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T15:47:40.722322Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/fd028002-0309-4d32-ab07-a67a9c31c78b/cancel` → **200**

```json
{
  "command_id": "6adaa516-b0a8-4507-b431-ec4af8df8364",
  "expected_version": 3,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "fd028002-0309-4d32-ab07-a67a9c31c78b",
  "short_number": 19,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "533c377d-b87c-4df5-bfcb-a2de5a4505f0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "e41709ff-2241-453d-86bf-4b069371c8d6",
    "order_id": "fd028002-0309-4d32-ab07-a67a9c31c78b",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "7df1edfa-b28b-40cb-8990-5a1c1b8a4216",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T15:47:40.722322Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "pl": "Brak wolnych aut",
      "ru": "Нет свободных машин",
      "en": "No cars available",
      "uk": "Немає вільних авто"
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
  "session_id": "19fb37fb-5df1-4b39-8a85-f8e6d067381b",
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
  "last_heartbeat_at": "2026-10-30T15:47:40.33224Z",
  "last_location_at": "2026-10-30T15:47:40.33224Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/work-sessions/19fb37fb-5df1-4b39-8a85-f8e6d067381b/resume` → **200**

```json
{
  "command_id": "5c594813-5ac9-4a42-9ba5-b36d0454ab5f",
  "expected_version": 12
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "19fb37fb-5df1-4b39-8a85-f8e6d067381b",
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
  "last_heartbeat_at": "2026-10-30T15:47:40.33224Z",
  "last_location_at": "2026-10-30T15:47:40.33224Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/19fb37fb-5df1-4b39-8a85-f8e6d067381b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 250,
    "recorded_at": "2026-10-30T15:47:42Z",
    "sequence": 1793375262292
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "19fb37fb-5df1-4b39-8a85-f8e6d067381b",
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
  "last_heartbeat_at": "2026-10-30T15:47:42.308187Z",
  "last_location_at": "2026-10-30T15:47:42.308187Z",
  "eligible": false,
  "ineligible_reasons": [
    "LOCATION_INACCURATE"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/work-sessions/19fb37fb-5df1-4b39-8a85-f8e6d067381b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:47:42Z",
    "sequence": 1793375262515
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "19fb37fb-5df1-4b39-8a85-f8e6d067381b",
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
  "last_heartbeat_at": "2026-10-30T15:47:42.53211Z",
  "last_location_at": "2026-10-30T15:47:42.53211Z",
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
  "at": "2026-10-30T15:47:42.733075886Z",
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
      "last_location_at": "2026-10-30T15:47:42.53211Z",
      "last_heartbeat_at": "2026-10-30T15:47:42.53211Z",
      "order_id": null
    }
  ]
}
```

Done: E2, E5 (1/4), E4 and last_heartbeat_at 2026-10-30T15:47:42.53211Z.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "19fb37fb-5df1-4b39-8a85-f8e6d067381b",
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
  "last_heartbeat_at": "2026-10-30T15:47:42.53211Z",
  "last_location_at": "2026-10-30T15:47:42.53211Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/19fb37fb-5df1-4b39-8a85-f8e6d067381b/close` → **200**

```json
{
  "command_id": "b2710476-07bf-471e-9ecc-0d2f8f91b5b2",
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
  "session_id": "0b105513-4edc-437d-bcc6-afc82a630cc2",
  "subject": {
    "type": "STAFF",
    "id": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiODZhYmMzMi1mMmUyLTRjM2MtOTk2Ny05N2JmYzljZTdjZTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzYxNjMsImlhdCI6MTc5MzM3NTI2MywianRpIjoiNTIyZGE0YjMtN2FlYy00YmMzLTkwZDQtNGRjNWUzMzRmMzMzIiwic2lkIjoiMGIxMDU1MTMtNGVkYy00MzdkLWJjYzYtYWZjODJhNjMwY2MyIn0.BlOW7Y6GWhRzy9Rl8J4837ydsw43i9Cstv0yvZZPC-A",
  "access_expires_at": "2026-10-30T16:02:43.736591299Z",
  "refresh_token": "lUg6_Ujydn8Tc1_yiFCIE0sgox_sgkirmP19APrfH40",
  "refresh_expires_at": "2026-10-31T03:47:43.735998787Z",
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
  "command_id": "da4cf2a1-8d8b-48db-a59e-0cb5de196505",
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
  "changed_by": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-30T15:47:44.144028Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "3b43d528-0b35-4b1b-b986-89e217d201ac",
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
  "correlation_id": "30cd40cb-1466-43f3-817e-911e71d0c8e8",
  "current_version": 1
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "e0fcfe25-66c0-4ced-9d69-50a7ac794e84",
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
  "correlation_id": "a781f4c3-85b9-4864-a237-094c8ac2d765"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638544696",
  "device_ref": "sandbox-24539"
}
```

```json
{
  "challenge_id": "e9d9387e-e0dd-43ab-8369-da5d7a7cd834",
  "expires_at": "2026-10-30T15:52:44.732353128Z",
  "resend_available_at": "2026-10-30T15:47:45.732353128Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638544696` → **200**

```json
{
  "phone": "+380638544696",
  "audience": "CLIENT",
  "code": "071913",
  "sent_at": "2026-10-30T15:47:44.735154142Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e9d9387e-e0dd-43ab-8369-da5d7a7cd834",
  "code": "071913",
  "device_ref": "sandbox-24539"
}
```

```json
{
  "session_id": "048857b6-01de-48cc-a3aa-f041d8c90d02",
  "subject": {
    "type": "CLIENT",
    "id": "e96961e1-44ea-4bd1-99da-11ffaa6438e3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlOTY5NjFlMS00NGVhLTRiZDEtOTlkYS0xMWZmYWE2NDM4ZTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc2MTY0LCJpYXQiOjE3OTMzNzUyNjQsImp0aSI6ImY3Zjg3YmNjLWU5ODUtNGMwMi05ZWQyLTA0ZDg5YTM3Njg5OSIsInNpZCI6IjA0ODg1N2I2LTAxZGUtNDhjYy1hM2FhLWYwNDFkOGM5MGQwMiJ9.9buznJIeeB-a6Ps2bE_CZu8VWvtZXI0pnMU-cCcL3Qc",
  "access_expires_at": "2026-10-30T16:02:44.951536689Z",
  "refresh_token": "rHe5Hd9ZGDfbu9AduI3aEyZ68aikFuDCs4WS5jpmQz4",
  "refresh_expires_at": "2026-11-29T15:47:44.950908269Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b0c1864e-b763-4d4b-96ea-602ea5528091",
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
  "id": "b07e667a-1ad3-4a4c-94f0-5f47e32dc39a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:52:45.217818Z",
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
  "command_id": "3420ed1f-123d-414f-ad66-c81c69331f24",
  "quote_id": "b07e667a-1ad3-4a4c-94f0-5f47e32dc39a",
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
  "correlation_id": "728a730e-7fef-48e7-a7ae-f74b77fcd0cc"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "5548f7ed-a59c-4281-98f2-b836bb85f2a7",
  "quote_id": "b07e667a-1ad3-4a4c-94f0-5f47e32dc39a",
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
  "id": "50958726-d60e-4f15-998d-078fe34765e6",
  "short_number": 20,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e96961e1-44ea-4bd1-99da-11ffaa6438e3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:47:45.61215Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/50958726-d60e-4f15-998d-078fe34765e6/cancel` → **200**

```json
{
  "command_id": "6db54f4c-58d1-47e7-861f-6ca45e792231",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "50958726-d60e-4f15-998d-078fe34765e6",
  "short_number": 20,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "e96961e1-44ea-4bd1-99da-11ffaa6438e3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T15:47:45.61215Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
      "en": "Changed my mind",
      "uk": "Передумав їхати"
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
  "command_id": "0c72490b-475d-4462-9e34-3166b712b007",
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
  "changed_by": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-30T15:47:46.017364Z"
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
      "changed_by": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-30T15:47:46.017364Z"
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
  "device_ref": "sandbox-17028"
}
```

```json
{
  "challenge_id": "8630d66c-6ad7-4f9c-a0f2-8dae47c6aa67",
  "expires_at": "2026-10-30T15:52:46.701794752Z",
  "resend_available_at": "2026-10-30T15:47:47.701794752Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "365599",
  "sent_at": "2026-10-30T15:47:46.704026445Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8630d66c-6ad7-4f9c-a0f2-8dae47c6aa67",
  "code": "365599",
  "device_ref": "sandbox-17028"
}
```

```json
{
  "session_id": "90376a25-eb8b-4c49-a141-2142a12665c7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NjE2NiwiaWF0IjoxNzkzMzc1MjY2LCJqdGkiOiJiMTQzODBlYS03MWU0LTQ5YmItYjlkMS1jZjlhMWUzODdhNzMiLCJzaWQiOiI5MDM3NmEyNS1lYjhiLTRjNDktYTE0MS0yMTQyYTEyNjY1YzcifQ.jJ_R3GQvPkAdNe9IACwTpXBE9-NqoUAfL10lXl-YeYo",
  "access_expires_at": "2026-10-30T16:02:46.912968268Z",
  "refresh_token": "s4Nd_WtmTnRMPf9p7OAsX3tDavhFZRgaB4XVp0mNUbs",
  "refresh_expires_at": "2026-11-29T15:47:46.912342798Z",
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
  "command_id": "7ca49640-bf3d-4d76-92ef-8b16cac362b6",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:47:47Z",
    "sequence": 1793375267290
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "aafec276-e0a5-4e43-b059-fb6032183f2e",
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
  "last_heartbeat_at": "2026-10-30T15:47:47.304585Z",
  "last_location_at": "2026-10-30T15:47:47.304585Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673267874",
  "device_ref": "sandbox-20011"
}
```

```json
{
  "challenge_id": "15f5ce06-dc22-4edd-9246-5a4b6b8badb8",
  "expires_at": "2026-10-30T15:52:47.493540224Z",
  "resend_available_at": "2026-10-30T15:47:48.493540224Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380673267874` → **200**

```json
{
  "phone": "+380673267874",
  "audience": "CLIENT",
  "code": "218427",
  "sent_at": "2026-10-30T15:47:47.495132891Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "15f5ce06-dc22-4edd-9246-5a4b6b8badb8",
  "code": "218427",
  "device_ref": "sandbox-20011"
}
```

```json
{
  "session_id": "079d38b6-c85a-4160-a96e-a34810925e7d",
  "subject": {
    "type": "CLIENT",
    "id": "70077052-55ab-47d6-a649-6c4de5fd1583"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MDA3NzA1Mi01NWFiLTQ3ZDYtYTY0OS02YzRkZTVmZDE1ODMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc2MTY3LCJpYXQiOjE3OTMzNzUyNjcsImp0aSI6IjgzOTk2MzA4LTA3NDgtNGFhNS1iOTI2LWFkNzY0NGZmMDJjYSIsInNpZCI6IjA3OWQzOGI2LWM4NWEtNDE2MC1hOTZlLWEzNDgxMDkyNWU3ZCJ9.FQpFU4Lz_I081Gy9EY8t0l_326KJ2RuTWFMG07REbBE",
  "access_expires_at": "2026-10-30T16:02:47.703385478Z",
  "refresh_token": "Ibj7QP9bfy-ZmflQup2sA7_f0SGjC--eaZBdAlBuEEs",
  "refresh_expires_at": "2026-11-29T15:47:47.702971494Z",
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
  "command_id": "43bfb025-9c0f-4094-80aa-55c86dc24361",
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
  "id": "656f6a23-f243-4fe4-a0fe-4d97d1d9f5b2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:52:48.068244Z",
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
  "command_id": "c462361e-f189-4554-bf53-94d3a78fe8c7",
  "platform": "ANDROID",
  "token": "sandbox-driver-eb116d49-1d23-4dd7-b93b-6e88d6104b6c"
}
```

```json
{
  "id": "3f1070b2-8d4f-48b1-9156-b7a6b2b1133e",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T15:47:48.265818Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "cf91b2d5-cb72-4801-afcc-9c80a7270aea",
  "platform": "ANDROID",
  "token": "sandbox-rider-2490e195-2548-4836-815b-24ad0dd8ce9d"
}
```

```json
{
  "id": "208c6653-73f3-4e83-83b8-a267a9d9a49a",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T15:47:48.451337Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "24050ea9-b350-4720-ba3b-40f927f02565",
  "quote_id": "656f6a23-f243-4fe4-a0fe-4d97d1d9f5b2",
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
  "id": "181459de-a596-49c7-88ba-0704ee8e2b4f",
  "short_number": 21,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "70077052-55ab-47d6-a649-6c4de5fd1583",
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
  "created_at": "2026-10-30T15:47:48.641589Z",
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
    "id": "2cf6483f-ac80-4436-9c67-3da0b95d6b5d",
    "order_id": "181459de-a596-49c7-88ba-0704ee8e2b4f",
    "expires_at": "2026-10-30T15:48:03.6442Z",
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

`POST /api/driver/v1/offers/2cf6483f-ac80-4436-9c67-3da0b95d6b5d/accept` → **200**

```json
{
  "command_id": "2d9017b4-d016-410e-9d56-bf74497b7613"
}
```

```json
{
  "id": "15c474f3-1a7e-4824-8674-e432aee8b86c",
  "order_id": "181459de-a596-49c7-88ba-0704ee8e2b4f",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "4f679d88-db43-4ec8-8d05-a82130274923",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-30T15:47:48.622Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-30T15:47:48.622Z` → **200**

```json
[
  {
    "at": "2026-10-30T15:47:49.789641924Z",
    "token_suffix": "104b6c",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "event_type": "OfferMade",
      "event_id": "ffde11e4-6c07-4e37-a60f-7bc6134167ca",
      "order_version": "2",
      "order_id": "181459de-a596-49c7-88ba-0704ee8e2b4f",
      "type": "driver.offer"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380673267874&after=2026-10-30T15:47:48.622Z` → **200**

```json
[
  {
    "at": "2026-10-30T15:47:49.791798825Z",
    "token_suffix": "d8ce9d",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "event_type": "AssignmentCommitted",
      "event_id": "8913f78e-c85a-4b3d-bc3d-6b1710b310e4",
      "order_version": "3",
      "order_id": "181459de-a596-49c7-88ba-0704ee8e2b4f",
      "type": "rider.driver-assigned"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/181459de-a596-49c7-88ba-0704ee8e2b4f/messages` → **201**

```json
{
  "command_id": "7a176a52-fcca-4f62-881b-22022e8e769d",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "ddbf1fa1-2cc3-442c-ab9a-9782f53ace5a",
  "order_id": "181459de-a596-49c7-88ba-0704ee8e2b4f",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-30T15:47:50.31103958Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "4f679d88-db43-4ec8-8d05-a82130274923",
  "order_id": "181459de-a596-49c7-88ba-0704ee8e2b4f",
  "assignment_id": "15c474f3-1a7e-4824-8674-e432aee8b86c",
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

`POST /api/driver/v1/trips/4f679d88-db43-4ec8-8d05-a82130274923/messages` → **201**

```json
{
  "command_id": "6be71309-1d76-4de8-8a0a-7c7211248219",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "f9cce383-1f7f-4522-b56c-69c9fbcda813",
  "order_id": "181459de-a596-49c7-88ba-0704ee8e2b4f",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-30T15:47:50.693278362Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/181459de-a596-49c7-88ba-0704ee8e2b4f/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/4f679d88-db43-4ec8-8d05-a82130274923/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380673267874"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/aafec276-e0a5-4e43-b059-fb6032183f2e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:47:51Z",
    "sequence": 1793375271273
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "aafec276-e0a5-4e43-b059-fb6032183f2e",
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
  "last_heartbeat_at": "2026-10-30T15:47:51.28961Z",
  "last_location_at": "2026-10-30T15:47:51.28961Z",
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
  "id": "4f679d88-db43-4ec8-8d05-a82130274923",
  "order_id": "181459de-a596-49c7-88ba-0704ee8e2b4f",
  "assignment_id": "15c474f3-1a7e-4824-8674-e432aee8b86c",
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

`POST /api/driver/v1/trips/4f679d88-db43-4ec8-8d05-a82130274923/arrive` → **200**

```json
{
  "command_id": "8f68570b-8240-4701-8bf4-eafa6aed3b1a",
  "expected_version": 0
}
```

```json
{
  "id": "4f679d88-db43-4ec8-8d05-a82130274923",
  "order_id": "181459de-a596-49c7-88ba-0704ee8e2b4f",
  "assignment_id": "15c474f3-1a7e-4824-8674-e432aee8b86c",
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
  "arrived_at": "2026-10-30T15:47:51.668662Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/4f679d88-db43-4ec8-8d05-a82130274923/start` → **200**

```json
{
  "command_id": "2f257c6e-b2e7-4cae-9362-afe2db653996",
  "expected_version": 1
}
```

```json
{
  "id": "4f679d88-db43-4ec8-8d05-a82130274923",
  "order_id": "181459de-a596-49c7-88ba-0704ee8e2b4f",
  "assignment_id": "15c474f3-1a7e-4824-8674-e432aee8b86c",
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
  "arrived_at": "2026-10-30T15:47:51.668662Z",
  "started_at": "2026-10-30T15:47:51.865907Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

(the car drives 48 s to the next point)

`POST /api/driver/v1/work-sessions/aafec276-e0a5-4e43-b059-fb6032183f2e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:48:40Z",
    "sequence": 1793375320691
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "aafec276-e0a5-4e43-b059-fb6032183f2e",
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
  "last_heartbeat_at": "2026-10-30T15:48:40.08408Z",
  "last_location_at": "2026-10-30T15:48:40.08408Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/4f679d88-db43-4ec8-8d05-a82130274923/complete` → **200**

```json
{
  "command_id": "70977df2-9af1-4f7d-830d-2b05a34dcfed",
  "expected_version": 2,
  "reported_at": "2026-10-30T15:48:40Z",
  "cash_received": true
}
```

```json
{
  "id": "4f679d88-db43-4ec8-8d05-a82130274923",
  "order_id": "181459de-a596-49c7-88ba-0704ee8e2b4f",
  "assignment_id": "15c474f3-1a7e-4824-8674-e432aee8b86c",
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
  "arrived_at": "2026-10-30T15:47:51.668662Z",
  "started_at": "2026-10-30T15:47:51.865907Z",
  "completed_at": "2026-10-30T15:48:40.284002Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/181459de-a596-49c7-88ba-0704ee8e2b4f` → **200**

```json
{
  "id": "181459de-a596-49c7-88ba-0704ee8e2b4f",
  "short_number": 21,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "70077052-55ab-47d6-a649-6c4de5fd1583",
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
    "id": "15c474f3-1a7e-4824-8674-e432aee8b86c",
    "order_id": "181459de-a596-49c7-88ba-0704ee8e2b4f",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "4f679d88-db43-4ec8-8d05-a82130274923",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T15:47:48.641589Z",
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
      "id": "181459de-a596-49c7-88ba-0704ee8e2b4f",
      "short_number": 21,
      "status": "FULFILLED",
      "created_at": "2026-10-30T15:47:48.641589Z",
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
      "id": "4f679d88-db43-4ec8-8d05-a82130274923",
      "order_id": "181459de-a596-49c7-88ba-0704ee8e2b4f",
      "order_short_number": 21,
      "created_at": "2026-10-30T15:47:49.042287Z",
      "pickup_label": "Майдан Незалежності",
      "dropoff_label": "Залізничний вокзал",
      "final_price_minor": 10517,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "COMPLETED"
    },
    {
      "id": "7df1edfa-b28b-40cb-8990-5a1c1b8a4216",
      "order_id": "fd028002-0309-4d32-ab07-a67a9c31c78b",
      "order_short_number": 19,
      "created_at": "2026-10-30T15:47:41.298488Z",
      "pickup_label": "Майдан",
      "dropoff_label": "Вокзал",
      "final_price_minor": null,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "ABORTED"
    },
    {
      "id": "8ea4cf63-f99d-4ec2-89e0-da756beee9a9",
      "order_id": "f7014d63-4253-4fe8-83ec-51dbd19d52ae",
      "order_short_number": 10,
      "created_at": "2026-10-30T15:44:58.99853Z",
      "pickup_label": "Майдан",
      "dropoff_label": "Вокзал",
      "final_price_minor": 10517,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "COMPLETED"
    },
    {
      "id": "b879b446-ac34-47ec-9749-777fad41e58b",
      "order_id": "30b5e674-8050-41b1-a071-a9574399c946",
      "order_short_number": 5,
      "created_at": "2026-10-30T15:43:30.787617Z",
      "pickup_label": "Майдан",
      "dropoff_label": "Вокзал",
      "final_price_minor": 10517,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "COMPLETED"
    },
    {
      "id": "b3378097-3fb5-4010-9e63-854ed407e0d8",
      "order_id": "901b507b-a3e9-4a6b-a0e6-4e75a8c4b351",
      "order_short_number": 3,
      "created_at": "2026-10-30T15:39:42.91626Z",
      "pickup_label": "Майдан",
      "dropoff_label": "Вокзал",
      "final_price_minor": 10517,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "COMPLETED"
    },
    {
      "id": "2d11753d-a2ea-4e23-a156-7090a3efc247",
      "order_id": "5e8602cf-36ba-4bb5-84e8-ca02f9da8f5f",
      "order_short_number": 2,
      "created_at": "2026-10-30T15:39:36.298612Z",
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

`GET /api/rider/v1/orders/181459de-a596-49c7-88ba-0704ee8e2b4f/tip` → **200**

```json
{
  "order_id": "181459de-a596-49c7-88ba-0704ee8e2b4f",
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
  "available_until": "2026-10-31T15:48:40.284002Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/181459de-a596-49c7-88ba-0704ee8e2b4f/tip` → **201**

```json
{
  "command_id": "d9f4e6f3-b80d-4340-9b73-2b2ba52251e6",
  "amount_minor": 1100
}
```

```json
{
  "id": "21390084-3125-48af-82a3-7da278246bea",
  "order_id": "181459de-a596-49c7-88ba-0704ee8e2b4f",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-30T15:48:44.640119Z"
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
  "session_id": "886102d9-bc0e-49c3-917c-ba057d685b62",
  "subject": {
    "type": "STAFF",
    "id": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiODZhYmMzMi1mMmUyLTRjM2MtOTk2Ny05N2JmYzljZTdjZTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzYyMjUsImlhdCI6MTc5MzM3NTMyNSwianRpIjoiM2E4Mjg5OWYtM2ZhOC00N2Q1LThlZTUtZWMyZDFlMzk0YTYxIiwic2lkIjoiODg2MTAyZDktYmMwZS00OWMzLTkxN2MtYmEwNTdkNjg1YjYyIn0.nOfH7E5hZctaSswAgxpD5CCi1ZyvglgV1k_o98ZcyhU",
  "access_expires_at": "2026-10-30T16:03:45.027153848Z",
  "refresh_token": "mFgSMcYwJWb6nDw6P_QcFrVZIobfM5kcVRZrM7-3p6k",
  "refresh_expires_at": "2026-10-31T03:48:45.026680651Z",
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
          "CARD": 2,
          "CASH": 18
        },
        "cancelled_by": {
          "DRIVER": 1,
          "RIDER": 3,
          "STAFF": 8
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
      "CARD": 2,
      "CASH": 18
    },
    "cancelled_by": {
      "DRIVER": 1,
      "RIDER": 3,
      "STAFF": 8
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
  "generated_at": "2026-10-30T15:48:45.207720541Z"
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
  "generated_at": "2026-10-30T15:48:45.405696843Z"
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
  "session_id": "c3da704c-bb87-42d5-a99a-1b7d36b429b0",
  "subject": {
    "type": "STAFF",
    "id": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiODZhYmMzMi1mMmUyLTRjM2MtOTk2Ny05N2JmYzljZTdjZTIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzYyMjUsImlhdCI6MTc5MzM3NTMyNSwianRpIjoiNTRlMjlkODEtZTZjYS00YWRiLTljOWYtMGI4ZTI0YThkMmNiIiwic2lkIjoiYzNkYTcwNGMtYmI4Ny00MmQ1LWE5OWEtMWI3ZDM2YjQyOWIwIn0.fObXHdqZsbYro_DJirXlwdfhDO58Dz1rhKcLDRUlkOA",
  "access_expires_at": "2026-10-30T16:03:45.782619556Z",
  "refresh_token": "MssV4uuNSEVMA6Ft1AY70aBJlXBzN4qHs2QZI92OD6s",
  "refresh_expires_at": "2026-10-31T03:48:45.782178668Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/181459de-a596-49c7-88ba-0704ee8e2b4f/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T15:47:48.641921Z",
      "actor": {
        "type": "CLIENT",
        "id": "70077052-55ab-47d6-a649-6c4de5fd1583",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "181459de-a596-49c7-88ba-0704ee8e2b4f",
        "quote_id": "656f6a23-f243-4fe4-a0fe-4d97d1d9f5b2",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "2ec849c8-ff14-4103-848d-64846c51c2ee"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T15:47:48.643626Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "181459de-a596-49c7-88ba-0704ee8e2b4f",
        "attempt_id": "f650cd57-e102-40a9-b575-17d8916364f3",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "2ec849c8-ff14-4103-848d-64846c51c2ee"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T15:47:48.646877Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "2cf6483f-ac80-4436-9c67-3da0b95d6b5d",
        "order_id": "181459de-a596-49c7-88ba-0704ee8e2b4f",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "2ec849c8-ff14-4103-848d-64846c51c2ee"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T15:47:49.043408Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "2cf6483f-ac80-4436-9c67-3da0b95d6b5d",
        "order_id": "181459de-a596-49c7-88ba-0704ee8e2b4f",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "15c474f3-1a7e-4824-8674-e432aee8b86c"
      },
      "correlation_id": "abb303d5-cf4d-473f-aa14-80f566edf820"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-30T15:48:46.143213211Z",
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
      "last_location_at": "2026-10-30T15:48:40.08408Z",
      "last_heartbeat_at": "2026-10-30T15:48:40.08408Z",
      "order_id": null
    }
  ]
}
```

Done: order 181459de-a596-49c7-88ba-0704ee8e2b4f.

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
  "session_id": "d8aa4dd3-e01f-4879-9809-c9b223567690",
  "subject": {
    "type": "STAFF",
    "id": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiODZhYmMzMi1mMmUyLTRjM2MtOTk2Ny05N2JmYzljZTdjZTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzYyMjYsImlhdCI6MTc5MzM3NTMyNiwianRpIjoiM2ZiYTk4MWEtZGY0Yi00OGQ2LWIwZjktNTYxOWQzOTYyNWViIiwic2lkIjoiZDhhYTRkZDMtZTAxZi00ODc5LTk4MDktYzliMjIzNTY3NjkwIn0.OU5JCusHrfXnezWIRfDrxam5mHY6GMlnTDACmWISov4",
  "access_expires_at": "2026-10-30T16:03:46.530735507Z",
  "refresh_token": "iOW1xi_L-cjIqsNoe00eH9vT_f-IMA_F-cE6fEXSB0U",
  "refresh_expires_at": "2026-10-31T03:48:46.530319281Z",
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
  "command_id": "324d8ccf-5c77-40f9-9632-6d8bf7ba410a",
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
  "timestamp": "2026-10-30T15:48:47.000+0000",
  "channel": {
    "id": "1730052000.1087610171",
    "linkedid": "1730052000.1087610171",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380675950635"
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
  "timestamp": "2026-10-30T15:48:47.000+0000",
  "channel": {
    "id": "1730052000.1087610171",
    "linkedid": "1730052000.1087610171",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380675950635"
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
  "session_id": "703d9d1b-18b6-441a-aa95-7904ed9b56b2",
  "subject": {
    "type": "STAFF",
    "id": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiODZhYmMzMi1mMmUyLTRjM2MtOTk2Ny05N2JmYzljZTdjZTIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzYyMjcsImlhdCI6MTc5MzM3NTMyNywianRpIjoiN2I3ZDQ0MGItYzcxMC00MjI4LWI4YjItNWMzMzAyZGUyMGZmIiwic2lkIjoiNzAzZDlkMWItMThiNi00NDFhLWFhOTUtNzkwNGVkOWI1NmIyIn0.-XOHffcZTKiqsHNTLKqC4TuNimRtn6sRinNElymx8Vs",
  "access_expires_at": "2026-10-30T16:03:47.301372Z",
  "refresh_token": "opiKjNqf91AUlvlB3LyHgwhX_BtUVk83DvuBFMyy8vE",
  "refresh_expires_at": "2026-10-31T03:48:47.30100612Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "916f2493-2b81-4cce-86eb-b788aef15d05",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380675950635",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T15:48:47Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/916f2493-2b81-4cce-86eb-b788aef15d05/answer` → **200**

```json
{
  "command_id": "dda9b3d8-30ae-412b-9df8-715d8dbe39f1"
}
```

```json
{
  "id": "916f2493-2b81-4cce-86eb-b788aef15d05",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380675950635",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2",
  "order_ids": [],
  "started_at": "2026-10-30T15:48:47Z",
  "answered_at": "2026-10-30T15:48:47.676971Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.1087610171",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "25d591aa-b1af-4f88-ab26-323afc9d3600",
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
  "id": "f71a8237-336c-4fa2-a89d-cb8ff5865d53",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:53:47.883833Z",
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
  "command_id": "361e9066-a8a7-47cb-b2d0-4570cb74c2bb",
  "quote_id": "f71a8237-336c-4fa2-a89d-cb8ff5865d53",
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
    "phone": "+380675950635"
  },
  "call_id": "916f2493-2b81-4cce-86eb-b788aef15d05"
}
```

```json
{
  "id": "9b3bb57c-4fb3-46a5-b535-96a513bf9b7e",
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
  "created_at": "2026-10-30T15:48:48.082046Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675950635"
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
    "id": "1730052000.1087610171",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "916f2493-2b81-4cce-86eb-b788aef15d05",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675950635",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2",
      "order_ids": [
        "9b3bb57c-4fb3-46a5-b535-96a513bf9b7e"
      ],
      "started_at": "2026-10-30T15:48:47Z",
      "answered_at": "2026-10-30T15:48:47.676971Z",
      "ended_at": "2026-10-30T15:48:48.285005Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "f6ae2dde-155d-47dc-a3ef-a59f4ef59cb2",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677133944",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2",
      "order_ids": [],
      "started_at": "2026-10-30T15:43:16.626978Z",
      "answered_at": "2026-10-30T15:43:16.869646Z",
      "ended_at": "2026-10-30T15:43:17.092908Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T15:43:26.86543Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/9b3bb57c-4fb3-46a5-b535-96a513bf9b7e` → **200**

```json
{
  "id": "9b3bb57c-4fb3-46a5-b535-96a513bf9b7e",
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
  "created_at": "2026-10-30T15:48:48.082046Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675950635"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/9b3bb57c-4fb3-46a5-b535-96a513bf9b7e` → **200**

```json
{
  "id": "9b3bb57c-4fb3-46a5-b535-96a513bf9b7e",
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
  "created_at": "2026-10-30T15:48:48.082046Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675950635"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/9b3bb57c-4fb3-46a5-b535-96a513bf9b7e/cancel` → **200**

```json
{
  "command_id": "e7fa81aa-6e7c-4a38-bc72-c08d91f58928",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "9b3bb57c-4fb3-46a5-b535-96a513bf9b7e",
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
  "created_at": "2026-10-30T15:48:48.082046Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675950635"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "pl": "Brak wolnych aut",
      "ru": "Нет свободных машин",
      "en": "No cars available",
      "uk": "Немає вільних авто"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

Done: call 916f2493-2b81-4cce-86eb-b788aef15d05 with order 9b3bb57c-4fb3-46a5-b535-96a513bf9b7e.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-20019"
}
```

```json
{
  "challenge_id": "fd5d4816-4b7e-43ee-a8f5-bbf805bcf8fc",
  "expires_at": "2026-10-30T15:53:49.07043916Z",
  "resend_available_at": "2026-10-30T15:48:50.07043916Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "741752",
  "sent_at": "2026-10-30T15:48:49.073068215Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fd5d4816-4b7e-43ee-a8f5-bbf805bcf8fc",
  "code": "741752",
  "device_ref": "sandbox-20019"
}
```

```json
{
  "session_id": "c145a81b-24cc-474b-8364-a020bc5af33f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NjIyOSwiaWF0IjoxNzkzMzc1MzI5LCJqdGkiOiJmODZhYzIxNC0xNWM1LTRjMDktYTY0Ny0zODk1MjRhNTUxNGYiLCJzaWQiOiJjMTQ1YTgxYi0yNGNjLTQ3NGItODM2NC1hMDIwYmM1YWYzM2YifQ.RkclW64s8wA_MatlUEJ0NXzyfRX8xVwVhGfbdgWYR-0",
  "access_expires_at": "2026-10-30T16:03:49.27633817Z",
  "refresh_token": "U1Z2v5sks1YWukbGfMa7LnzSZUwScttW4rWJDgEICX8",
  "refresh_expires_at": "2026-11-29T15:48:49.275772049Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "aafec276-e0a5-4e43-b059-fb6032183f2e",
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
  "last_heartbeat_at": "2026-10-30T15:48:40.08408Z",
  "last_location_at": "2026-10-30T15:48:40.08408Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/aafec276-e0a5-4e43-b059-fb6032183f2e/handover` → **200**

```json
{
  "command_id": "08c654bf-3b91-464b-bb56-1af8aca52441",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "aafec276-e0a5-4e43-b059-fb6032183f2e",
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
  "last_heartbeat_at": "2026-10-30T15:48:40.08408Z",
  "last_location_at": "2026-10-30T15:48:40.08408Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

(the car drives 90 s to the next point)

`POST /api/driver/v1/work-sessions/aafec276-e0a5-4e43-b059-fb6032183f2e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:50:19Z",
    "sequence": 1793375419840
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "aafec276-e0a5-4e43-b059-fb6032183f2e",
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
  "last_heartbeat_at": "2026-10-30T15:50:19.854447Z",
  "last_location_at": "2026-10-30T15:50:19.854447Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380660333007",
  "device_ref": "sandbox-30961"
}
```

```json
{
  "challenge_id": "7452c8d9-ec21-4fd7-878b-74bef186533e",
  "expires_at": "2026-10-30T15:55:20.033196194Z",
  "resend_available_at": "2026-10-30T15:50:21.033196194Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380660333007` → **200**

```json
{
  "phone": "+380660333007",
  "audience": "CLIENT",
  "code": "022090",
  "sent_at": "2026-10-30T15:50:20.035453772Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7452c8d9-ec21-4fd7-878b-74bef186533e",
  "code": "022090",
  "device_ref": "sandbox-30961"
}
```

```json
{
  "session_id": "f9fe6d7a-8d47-43fd-8130-f075d9f0ec8d",
  "subject": {
    "type": "CLIENT",
    "id": "91704686-5e83-4eb5-8a5f-617e65de889b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MTcwNDY4Ni01ZTgzLTRlYjUtOGE1Zi02MTdlNjVkZTg4OWIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc2MzIwLCJpYXQiOjE3OTMzNzU0MjAsImp0aSI6IjUzMWY5YzU2LTJjOTUtNGY0ZC05ZWRkLTUxMGM3ZGIzNGY1ZCIsInNpZCI6ImY5ZmU2ZDdhLThkNDctNDNmZC04MTMwLWYwNzVkOWYwZWM4ZCJ9.pZ_XHoBuiMjgC2zhVDZdEeOYFSVEz-5AHJyoqHWyJyw",
  "access_expires_at": "2026-10-30T16:05:20.232815855Z",
  "refresh_token": "_ylRHGwpTryXLB6eNH80U8HNcfEB2viyLbusSt1TsOI",
  "refresh_expires_at": "2026-11-29T15:50:20.23235519Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a3669a94-f408-4de6-a6ea-41aee051ee10",
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
  "id": "74d44ae7-12ac-42fe-bac0-ed6065bc7a24",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:55:20.411644Z",
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
  "command_id": "a5a10383-51fe-4d56-a958-53d93b07a8d9",
  "quote_id": "74d44ae7-12ac-42fe-bac0-ed6065bc7a24",
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
  "id": "803057f6-2785-459f-b366-c671865a50a0",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "91704686-5e83-4eb5-8a5f-617e65de889b",
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
  "created_at": "2026-10-30T15:50:20.602963Z",
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
    "id": "3606aceb-4a1f-4efb-bef1-69eb65dbe46e",
    "order_id": "803057f6-2785-459f-b366-c671865a50a0",
    "expires_at": "2026-10-30T15:50:35.605438Z",
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

`POST /api/driver/v1/offers/3606aceb-4a1f-4efb-bef1-69eb65dbe46e/accept` → **200**

```json
{
  "command_id": "13d2f115-6389-46cf-a034-6dd23f034d0e"
}
```

```json
{
  "id": "d802c117-6295-4ea9-a39d-ead4fd441b72",
  "order_id": "803057f6-2785-459f-b366-c671865a50a0",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "5d37846c-e3e1-4820-9135-e0f288ab11c0",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "5d37846c-e3e1-4820-9135-e0f288ab11c0",
  "order_id": "803057f6-2785-459f-b366-c671865a50a0",
  "assignment_id": "d802c117-6295-4ea9-a39d-ead4fd441b72",
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

`POST /api/driver/v1/work-sessions/aafec276-e0a5-4e43-b059-fb6032183f2e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:50:21Z",
    "sequence": 1793375421374
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "aafec276-e0a5-4e43-b059-fb6032183f2e",
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
  "last_heartbeat_at": "2026-10-30T15:50:21.38929Z",
  "last_location_at": "2026-10-30T15:50:21.38929Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/5d37846c-e3e1-4820-9135-e0f288ab11c0/arrive` → **200**

```json
{
  "command_id": "0dd0d0ab-57f9-4b04-b9e2-2076abaa2543",
  "expected_version": 0
}
```

```json
{
  "id": "5d37846c-e3e1-4820-9135-e0f288ab11c0",
  "order_id": "803057f6-2785-459f-b366-c671865a50a0",
  "assignment_id": "d802c117-6295-4ea9-a39d-ead4fd441b72",
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
  "arrived_at": "2026-10-30T15:50:21.58013Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/5d37846c-e3e1-4820-9135-e0f288ab11c0/start` → **200**

```json
{
  "command_id": "62f023f0-84bc-4a55-bcd1-31911cfded39",
  "expected_version": 1
}
```

```json
{
  "id": "5d37846c-e3e1-4820-9135-e0f288ab11c0",
  "order_id": "803057f6-2785-459f-b366-c671865a50a0",
  "assignment_id": "d802c117-6295-4ea9-a39d-ead4fd441b72",
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
  "arrived_at": "2026-10-30T15:50:21.58013Z",
  "started_at": "2026-10-30T15:50:21.775984Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

(the car drives 60 s to the next point)

`POST /api/driver/v1/work-sessions/aafec276-e0a5-4e43-b059-fb6032183f2e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:51:21Z",
    "sequence": 1793375481977
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "aafec276-e0a5-4e43-b059-fb6032183f2e",
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
  "last_heartbeat_at": "2026-10-30T15:51:21.992267Z",
  "last_location_at": "2026-10-30T15:51:21.992267Z",
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
  "device_ref": "sandbox-8949"
}
```

```json
{
  "challenge_id": "d7a3fbfe-a0b6-4285-a6a8-560e4dde7996",
  "expires_at": "2026-10-30T15:56:22.168748883Z",
  "resend_available_at": "2026-10-30T15:51:23.168748883Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "678103",
  "sent_at": "2026-10-30T15:51:22.170562747Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d7a3fbfe-a0b6-4285-a6a8-560e4dde7996",
  "code": "678103",
  "device_ref": "sandbox-8949"
}
```

```json
{
  "session_id": "6095470f-78d8-44cd-af79-25fbee5cde71",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NjM4MiwiaWF0IjoxNzkzMzc1NDgyLCJqdGkiOiIwYmJhYzcyZC0zZjljLTRlMmMtYWM5OS1mOTZlODQzOTJlMmEiLCJzaWQiOiI2MDk1NDcwZi03OGQ4LTQ0Y2QtYWY3OS0yNWZiZWU1Y2RlNzEifQ.CMVrTfbgkocqIHBnGBTa2bv08db7jASjAGL1EtqaM-U",
  "access_expires_at": "2026-10-30T16:06:22.372130511Z",
  "refresh_token": "FO6KeDdW3jOF2Aeo8mlRqrxFHgtI-860dXtUPOUJSoA",
  "refresh_expires_at": "2026-11-29T15:51:22.371430195Z",
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
  "command_id": "6682f4ba-202b-4689-9844-5ed1a3b2abd4",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:51:22Z",
    "sequence": 1793375482748
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "c305b383-7940-45de-9ff5-7b4ebefcb989",
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
  "last_heartbeat_at": "2026-10-30T15:51:22.762112Z",
  "last_location_at": "2026-10-30T15:51:22.762112Z",
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
  "session_id": "469eae68-b9d4-4357-ac1c-9fa9c3acb424",
  "subject": {
    "type": "STAFF",
    "id": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiODZhYmMzMi1mMmUyLTRjM2MtOTk2Ny05N2JmYzljZTdjZTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzYzODMsImlhdCI6MTc5MzM3NTQ4MywianRpIjoiYjY3ODg2YjMtMmZjOS00YjQxLTgxMjktMDQ4ODI1OTc4YWQ3Iiwic2lkIjoiNDY5ZWFlNjgtYjlkNC00MzU3LWFjMWMtOWZhOWMzYWNiNDI0In0.AFChnqkgnPeVq-mzRL887tbnHUcpol5UFo2uoClQ37g",
  "access_expires_at": "2026-10-30T16:06:23.143062173Z",
  "refresh_token": "ddIUalhbjWdtupnqrEe87bc_ztt3QAjhA6iduFFiWfc",
  "refresh_expires_at": "2026-10-31T03:51:23.142711805Z",
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
  "session_id": "fe6d6617-8ec5-44ba-9cc5-26bc57ffa065",
  "subject": {
    "type": "STAFF",
    "id": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiODZhYmMzMi1mMmUyLTRjM2MtOTk2Ny05N2JmYzljZTdjZTIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzYzODMsImlhdCI6MTc5MzM3NTQ4MywianRpIjoiNWE5NTU0NjktN2RkMy00ZWMyLTk3MGMtMDRiYWY3NjMxOTJlIiwic2lkIjoiZmU2ZDY2MTctOGVjNS00NGJhLTljYzUtMjZiYzU3ZmZhMDY1In0.D4KcQ0KmNnM8rumDfahhXs5Wd8-NvyVsDtjMKIbMKKA",
  "access_expires_at": "2026-10-30T16:06:23.519113049Z",
  "refresh_token": "MeJW37ZPc4slWE1FfGr_ucp8vFjyIlfRVIvos9WmDbk",
  "refresh_expires_at": "2026-10-31T03:51:23.518753076Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/803057f6-2785-459f-b366-c671865a50a0` → **200**

```json
{
  "id": "803057f6-2785-459f-b366-c671865a50a0",
  "short_number": 23,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "91704686-5e83-4eb5-8a5f-617e65de889b",
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
    "id": "d802c117-6295-4ea9-a39d-ead4fd441b72",
    "order_id": "803057f6-2785-459f-b366-c671865a50a0",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "5d37846c-e3e1-4820-9135-e0f288ab11c0",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-30T15:50:20.602963Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/803057f6-2785-459f-b366-c671865a50a0/interrupt` → **200**

```json
{
  "command_id": "80b3f9ab-72a4-4a37-88d3-3f945cfca4b3",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "803057f6-2785-459f-b366-c671865a50a0",
    "short_number": 23,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "91704686-5e83-4eb5-8a5f-617e65de889b",
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
      "id": "d802c117-6295-4ea9-a39d-ead4fd441b72",
      "order_id": "803057f6-2785-459f-b366-c671865a50a0",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "5d37846c-e3e1-4820-9135-e0f288ab11c0",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-30T15:50:20.602963Z",
    "caller": null,
    "cancellation": {
      "by": "STAFF",
      "reason_code": "VEHICLE_BREAKDOWN",
      "reason_labels": {
        "pl": "Awaria auta w trasie",
        "ru": "Поломка автомобиля в пути",
        "en": "Vehicle broke down on the way",
        "uk": "Поломка автомобіля в дорозі"
      }
    },
    "pickup_at": null,
    "preorder": false,
    "reservation": null,
    "related_order_id": null
  },
  "follow_up": {
    "id": "7daf7972-1081-4612-ac46-6c72a388bc2f",
    "short_number": 24,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "91704686-5e83-4eb5-8a5f-617e65de889b",
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
    "id": "396df620-5db9-48b2-87de-b16199298dc4",
    "order_id": "7daf7972-1081-4612-ac46-6c72a388bc2f",
    "expires_at": "2026-10-30T15:51:38.896978Z",
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

`POST /api/driver/v1/offers/396df620-5db9-48b2-87de-b16199298dc4/accept` → **200**

```json
{
  "command_id": "f8645b73-206c-4332-bf60-139550e23f70"
}
```

```json
{
  "id": "edbb4542-d010-43fd-b888-d26dab9775ee",
  "order_id": "7daf7972-1081-4612-ac46-6c72a388bc2f",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "236b7d41-b5fd-40a9-90bd-299549dc8c16",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "236b7d41-b5fd-40a9-90bd-299549dc8c16",
  "order_id": "7daf7972-1081-4612-ac46-6c72a388bc2f",
  "assignment_id": "edbb4542-d010-43fd-b888-d26dab9775ee",
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
  "session_id": "c305b383-7940-45de-9ff5-7b4ebefcb989",
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
  "last_heartbeat_at": "2026-10-30T15:51:22.762112Z",
  "last_location_at": "2026-10-30T15:51:22.762112Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/c305b383-7940-45de-9ff5-7b4ebefcb989/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:51:24Z",
    "sequence": 1793375484818
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "c305b383-7940-45de-9ff5-7b4ebefcb989",
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
  "last_heartbeat_at": "2026-10-30T15:51:24.832101Z",
  "last_location_at": "2026-10-30T15:51:24.832101Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/236b7d41-b5fd-40a9-90bd-299549dc8c16/arrive` → **200**

```json
{
  "command_id": "2f4b8461-57c6-49d9-b218-1b850f0b6903",
  "expected_version": 0
}
```

```json
{
  "id": "236b7d41-b5fd-40a9-90bd-299549dc8c16",
  "order_id": "7daf7972-1081-4612-ac46-6c72a388bc2f",
  "assignment_id": "edbb4542-d010-43fd-b888-d26dab9775ee",
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
  "arrived_at": "2026-10-30T15:51:25.03186Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/236b7d41-b5fd-40a9-90bd-299549dc8c16/start` → **200**

```json
{
  "command_id": "e318851f-f621-46af-a9cc-0b7e13c6cd4c",
  "expected_version": 1
}
```

```json
{
  "id": "236b7d41-b5fd-40a9-90bd-299549dc8c16",
  "order_id": "7daf7972-1081-4612-ac46-6c72a388bc2f",
  "assignment_id": "edbb4542-d010-43fd-b888-d26dab9775ee",
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
  "arrived_at": "2026-10-30T15:51:25.03186Z",
  "started_at": "2026-10-30T15:51:25.231246Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/236b7d41-b5fd-40a9-90bd-299549dc8c16/complete` → **200**

```json
{
  "command_id": "aa5d170a-361c-4f88-bca9-27b3f374cb29",
  "expected_version": 2,
  "reported_at": "2026-10-30T15:51:25Z"
}
```

```json
{
  "id": "236b7d41-b5fd-40a9-90bd-299549dc8c16",
  "order_id": "7daf7972-1081-4612-ac46-6c72a388bc2f",
  "assignment_id": "edbb4542-d010-43fd-b888-d26dab9775ee",
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
  "arrived_at": "2026-10-30T15:51:25.03186Z",
  "started_at": "2026-10-30T15:51:25.231246Z",
  "completed_at": "2026-10-30T15:51:25.423611Z",
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
      "id": "7daf7972-1081-4612-ac46-6c72a388bc2f",
      "short_number": 24,
      "status": "FULFILLED",
      "created_at": "2026-10-30T15:51:23.890773Z",
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
      "id": "803057f6-2785-459f-b366-c671865a50a0",
      "short_number": 23,
      "status": "CANCELLED",
      "created_at": "2026-10-30T15:50:20.602963Z",
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
          "ru": "Поломка автомобиля в пути",
          "en": "Vehicle broke down on the way",
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

`GET /api/operator/v1/orders/803057f6-2785-459f-b366-c671865a50a0/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T15:50:20.60341Z",
      "actor": {
        "type": "CLIENT",
        "id": "91704686-5e83-4eb5-8a5f-617e65de889b",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "803057f6-2785-459f-b366-c671865a50a0",
        "quote_id": "74d44ae7-12ac-42fe-bac0-ed6065bc7a24",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "c8453b9d-0071-4012-afe3-5d692278708d"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T15:50:20.604997Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "803057f6-2785-459f-b366-c671865a50a0",
        "attempt_id": "23c20968-d8f1-4ab6-b4e2-4955a2379d2d",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "c8453b9d-0071-4012-afe3-5d692278708d"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T15:50:20.619993Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "3606aceb-4a1f-4efb-bef1-69eb65dbe46e",
        "order_id": "803057f6-2785-459f-b366-c671865a50a0",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "c8453b9d-0071-4012-afe3-5d692278708d"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T15:50:20.987685Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "3606aceb-4a1f-4efb-bef1-69eb65dbe46e",
        "order_id": "803057f6-2785-459f-b366-c671865a50a0",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "d802c117-6295-4ea9-a39d-ead4fd441b72"
      },
      "correlation_id": "82c1f49f-aec4-4897-916c-37f08785f832"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/7daf7972-1081-4612-ac46-6c72a388bc2f/tip` → **200**

```json
{
  "order_id": "7daf7972-1081-4612-ac46-6c72a388bc2f",
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
  "available_until": "2026-10-31T15:51:25.423611Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/7daf7972-1081-4612-ac46-6c72a388bc2f/tip` → **409**

```json
{
  "command_id": "8d44085c-2006-4004-bf8c-93cdf08945c1",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/7daf7972-1081-4612-ac46-6c72a388bc2f/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "4041e14b-3982-431c-99e9-802edf3e5709"
}
```

Done: interrupted 803057f6-2785-459f-b366-c671865a50a0, follow-up 7daf7972-1081-4612-ac46-6c72a388bc2f.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "aafec276-e0a5-4e43-b059-fb6032183f2e",
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
  "last_heartbeat_at": "2026-10-30T15:51:21.992267Z",
  "last_location_at": "2026-10-30T15:51:21.992267Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/aafec276-e0a5-4e43-b059-fb6032183f2e/close` → **200**

```json
{
  "command_id": "6c6d69d8-b0ce-4499-ab1b-28e7c5296648",
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
  "session_id": "c305b383-7940-45de-9ff5-7b4ebefcb989",
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
  "last_heartbeat_at": "2026-10-30T15:51:24.832101Z",
  "last_location_at": "2026-10-30T15:51:24.832101Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c305b383-7940-45de-9ff5-7b4ebefcb989/close` → **200**

```json
{
  "command_id": "09429429-021e-408f-825c-ba05b6134a3a",
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
  "session_id": "19323b26-3d0a-4d04-80e7-aae09c15649f",
  "subject": {
    "type": "STAFF",
    "id": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiODZhYmMzMi1mMmUyLTRjM2MtOTk2Ny05N2JmYzljZTdjZTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzYzOTAsImlhdCI6MTc5MzM3NTQ5MCwianRpIjoiNGM5NTcwOWItYjE1MS00MjU4LWFlODctZjViMjIyMTYyYjM4Iiwic2lkIjoiMTkzMjNiMjYtM2QwYS00ZDA0LTgwZTctYWFlMDljMTU2NDlmIn0.Hdui0lJj9UhA-sKykBKHhez3NKGzCO7hOODg3zIwu_o",
  "access_expires_at": "2026-10-30T16:06:30.465788503Z",
  "refresh_token": "95FDBkAOzkAc_IRLVCKby5E12aUtEViwI5nN9qDN9jU",
  "refresh_expires_at": "2026-10-31T03:51:30.465363442Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "089e90b0-63cc-4b92-9a8e-ae7b77daca1d",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T15:51:30Z"
}
```

```json
{
  "id": "537b50b1-c61c-4d7a-9f5b-f111897d37f6",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T15:51:30Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/537b50b1-c61c-4d7a-9f5b-f111897d37f6/publish` → **200**

```json
{
  "command_id": "33cab4a3-cfdb-4e47-a7a9-6dacea788bee",
  "expected_version": 0
}
```

```json
{
  "id": "537b50b1-c61c-4d7a-9f5b-f111897d37f6",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T15:51:30.846912Z",
  "published_at": "2026-10-30T15:51:30.846912Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "537b50b1-c61c-4d7a-9f5b-f111897d37f6",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-30T15:51:30.846912Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637137285",
  "device_ref": "sandbox-27476"
}
```

```json
{
  "challenge_id": "ea52bbaa-fa0f-49b8-a676-12afc44a6949",
  "expires_at": "2026-10-30T15:56:31.219826884Z",
  "resend_available_at": "2026-10-30T15:51:32.219826884Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637137285` → **200**

```json
{
  "phone": "+380637137285",
  "audience": "CLIENT",
  "code": "499473",
  "sent_at": "2026-10-30T15:51:31.221786424Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ea52bbaa-fa0f-49b8-a676-12afc44a6949",
  "code": "499473",
  "device_ref": "sandbox-27476"
}
```

```json
{
  "session_id": "17765a84-9f6b-4f39-94a7-96f6f0f2ac8c",
  "subject": {
    "type": "CLIENT",
    "id": "5aa9f981-4025-482d-8125-51ef653b4796"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YWE5Zjk4MS00MDI1LTQ4MmQtODEyNS01MWVmNjUzYjQ3OTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc2MzkxLCJpYXQiOjE3OTMzNzU0OTEsImp0aSI6ImNkZTQyNDBkLTQ2NmUtNDFlNi1hOWE1LTdiZWViMDAwM2E0NSIsInNpZCI6IjE3NzY1YTg0LTlmNmItNGYzOS05NGE3LTk2ZjZmMGYyYWM4YyJ9.VeX4yXZ7yMLChxT-Uz_zo1rET0DmyKK3iNQ3NmWiBv8",
  "access_expires_at": "2026-10-30T16:06:31.419115596Z",
  "refresh_token": "FTFnjTqTLYByHXzBwhigPevoDIyEp1SsJe6GCn1VqlY",
  "refresh_expires_at": "2026-11-29T15:51:31.418736926Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "537b50b1-c61c-4d7a-9f5b-f111897d37f6",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-30T15:51:30.846912Z",
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
  "command_id": "9ecc8be2-4fb5-482a-9ccd-49387a5d387d",
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
  "id": "2ecbda1a-b2ab-4b50-9f15-1aa4d9447f3f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:56:31.786011Z",
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
  "command_id": "53949863-3fcd-4fc5-9442-b40b94378f12",
  "quote_id": "2ecbda1a-b2ab-4b50-9f15-1aa4d9447f3f",
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
  "correlation_id": "4e5cd4c9-ef57-4c8e-bb44-ae505bf1a397"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "54993b16-b6cd-4642-9305-caa60066fc69",
  "version_id": "537b50b1-c61c-4d7a-9f5b-f111897d37f6",
  "language": "uk"
}
```

```json
{
  "version_id": "537b50b1-c61c-4d7a-9f5b-f111897d37f6",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-30T15:51:32.169025Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c3f45197-d378-4983-bde5-13cae71ec600",
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
  "id": "5a210845-3c80-4d65-8a44-19b35124f5b4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:56:32.372870Z",
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
  "command_id": "ebb20360-46af-4f86-86f9-81a1785358f7",
  "quote_id": "5a210845-3c80-4d65-8a44-19b35124f5b4",
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
  "id": "0a63d1e7-8ef1-4eb1-bee3-5677c77c47b5",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5aa9f981-4025-482d-8125-51ef653b4796",
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
  "created_at": "2026-10-30T15:51:32.560598Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0a63d1e7-8ef1-4eb1-bee3-5677c77c47b5` → **200**

```json
{
  "id": "0a63d1e7-8ef1-4eb1-bee3-5677c77c47b5",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5aa9f981-4025-482d-8125-51ef653b4796",
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
  "created_at": "2026-10-30T15:51:32.560598Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/0a63d1e7-8ef1-4eb1-bee3-5677c77c47b5/cancel` → **200**

```json
{
  "command_id": "049ae57d-e1e9-4489-8460-5d8dfd8b1873",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "0a63d1e7-8ef1-4eb1-bee3-5677c77c47b5",
  "short_number": 25,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "5aa9f981-4025-482d-8125-51ef653b4796",
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
  "created_at": "2026-10-30T15:51:32.560598Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
      "en": "Changed my mind",
      "uk": "Передумав їхати"
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

`POST /api/admin/v1/legal-documents/537b50b1-c61c-4d7a-9f5b-f111897d37f6` → **409**

```json
{
  "command_id": "e17aaaa6-edb2-4dc5-a4f7-a0e04a295ca2",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T15:51:33Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/537b50b1-c61c-4d7a-9f5b-f111897d37f6",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "c7e96c9e-fd3e-4070-89e1-bcc1a77d3e6f"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "52200140-a17f-4706-98cd-909f13be0e7c",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T15:51:33Z"
}
```

```json
{
  "id": "7e0bb2ac-5661-470a-98e4-ab938348f6d8",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T15:51:33Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/7e0bb2ac-5661-470a-98e4-ab938348f6d8/publish` → **200**

```json
{
  "command_id": "31c2d4ea-f7cc-41a5-bcf0-e2fda83d4d8f",
  "expected_version": 0
}
```

```json
{
  "id": "7e0bb2ac-5661-470a-98e4-ab938348f6d8",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T15:51:33.52741Z",
  "published_at": "2026-10-30T15:51:33.52741Z",
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
  "device_ref": "sandbox-13194"
}
```

```json
{
  "challenge_id": "cf0b574e-cd6b-4595-9269-90a726299daf",
  "expires_at": "2026-10-30T15:56:33.716261122Z",
  "resend_available_at": "2026-10-30T15:51:34.716261122Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "937682",
  "sent_at": "2026-10-30T15:51:33.718112079Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cf0b574e-cd6b-4595-9269-90a726299daf",
  "code": "937682",
  "device_ref": "sandbox-13194"
}
```

```json
{
  "session_id": "e89d5c38-bab1-4abf-a4df-af96e3af0732",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NjM5MywiaWF0IjoxNzkzMzc1NDkzLCJqdGkiOiIzYWMzYmYzMS01YWI1LTQxOWUtOGE4Mi0zNTgzOWQ2ZjA4OGUiLCJzaWQiOiJlODlkNWMzOC1iYWIxLTRhYmYtYTRkZi1hZjk2ZTNhZjA3MzIifQ.xzLXcYLiVevi_F9J9cge1MXmuADwS9Aw5it9-cUEVsE",
  "access_expires_at": "2026-10-30T16:06:33.920744733Z",
  "refresh_token": "MDxSJEg1Y424U003HqlpJ3UA8n3g-25BoQPdo98VLnQ",
  "refresh_expires_at": "2026-11-29T15:51:33.920388356Z",
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
  "command_id": "2c95a85c-ed47-49a9-9ee5-c74fef4629a6",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:52:48Z",
    "sequence": 1793375568288
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "8ac7d7ba-9203-4785-ab66-e0b2e026b29c",
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
  "last_heartbeat_at": "2026-10-30T15:52:48.302723Z",
  "last_location_at": "2026-10-30T15:52:48.302723Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675844500",
  "device_ref": "sandbox-10743"
}
```

```json
{
  "challenge_id": "289a505c-94d1-4e50-ab1a-740b963b3d06",
  "expires_at": "2026-10-30T15:57:48.486999418Z",
  "resend_available_at": "2026-10-30T15:52:49.486999418Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380675844500` → **200**

```json
{
  "phone": "+380675844500",
  "audience": "CLIENT",
  "code": "431981",
  "sent_at": "2026-10-30T15:52:48.489089948Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "289a505c-94d1-4e50-ab1a-740b963b3d06",
  "code": "431981",
  "device_ref": "sandbox-10743"
}
```

```json
{
  "session_id": "613b3878-bbed-4862-a2dd-0fbb30268a92",
  "subject": {
    "type": "CLIENT",
    "id": "c4842ff5-fc7b-4b1d-8028-8418b2c6de41"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNDg0MmZmNS1mYzdiLTRiMWQtODAyOC04NDE4YjJjNmRlNDEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc2NDY4LCJpYXQiOjE3OTMzNzU1NjgsImp0aSI6ImQ2Mjg3MGE4LTIzYjYtNDQ4MS1iZmU3LTcwOWIyMjU1ZWY3MSIsInNpZCI6IjYxM2IzODc4LWJiZWQtNDg2Mi1hMmRkLTBmYmIzMDI2OGE5MiJ9.TM3ONQkkGtio3AJO5ifmgpplJroiS6Fv3NQcy84HIyk",
  "access_expires_at": "2026-10-30T16:07:48.684075801Z",
  "refresh_token": "00aHYgH-Hi0RPVTxX1lNmGO4tgLNNv9Dc51aPtlpgv8",
  "refresh_expires_at": "2026-11-29T15:52:48.683753235Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "3cd34f0b-1d40-4f21-94cd-85f23bf7c920",
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
  "id": "6bdc95e7-d9f7-4f72-b0c1-d6777675fe44",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:57:48.865157Z",
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
  "command_id": "af4829b9-8b7a-4613-85fc-60929f3bdb45",
  "quote_id": "6bdc95e7-d9f7-4f72-b0c1-d6777675fe44",
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
    "phone": "+380675879690"
  }
}
```

```json
{
  "id": "98e78913-4b5e-45a4-8ced-2f3aca72ecea",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c4842ff5-fc7b-4b1d-8028-8418b2c6de41",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T15:52:49.055734Z",
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
    "id": "c2c8eb9d-6b9e-454b-b45d-e74b19bcf815",
    "order_id": "98e78913-4b5e-45a4-8ced-2f3aca72ecea",
    "expires_at": "2026-10-30T15:53:04.057758Z",
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

`POST /api/driver/v1/offers/c2c8eb9d-6b9e-454b-b45d-e74b19bcf815/accept` → **200**

```json
{
  "command_id": "d7b530da-16eb-4a9b-a615-01ff302062f1"
}
```

```json
{
  "id": "cabc8bd4-ddd0-402d-bf44-e9e7e59b8982",
  "order_id": "98e78913-4b5e-45a4-8ced-2f3aca72ecea",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "63d47a70-ac2a-4bf6-bf29-23f7d98d4767",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "63d47a70-ac2a-4bf6-bf29-23f7d98d4767",
  "order_id": "98e78913-4b5e-45a4-8ced-2f3aca72ecea",
  "assignment_id": "cabc8bd4-ddd0-402d-bf44-e9e7e59b8982",
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
    "phone": "+380675879690"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "48656bec-3e5a-4ff7-bf4e-af80550684dc",
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
  "id": "7807b023-2fa3-46aa-99e1-c1aa5aba0da1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:57:49.808364Z",
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
  "command_id": "8da86b51-810f-405e-b490-36ae21aaa711",
  "quote_id": "7807b023-2fa3-46aa-99e1-c1aa5aba0da1",
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
  "id": "4d7828e9-4ffa-494d-aba4-27f7fa3961ce",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c4842ff5-fc7b-4b1d-8028-8418b2c6de41",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:52:50.005132Z",
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
  "command_id": "fec21898-de40-46c0-b0c0-381962531793",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-30T18:52:50Z"
}
```

```json
{
  "id": "09db19a7-2e82-421c-8bd5-421fd90c714f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:57:50.202390Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-30T18:52:50Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "4c94d88e-ebc6-4751-9315-6ea8a7b48390",
  "quote_id": "09db19a7-2e82-421c-8bd5-421fd90c714f",
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
  "pickup_at": "2026-10-30T18:52:50Z"
}
```

```json
{
  "id": "9840592f-fa44-412f-9913-6b2e0e11b7cc",
  "short_number": 28,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "c4842ff5-fc7b-4b1d-8028-8418b2c6de41",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T15:52:50.390838Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T18:52:50Z",
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
  "command_id": "29693c12-2084-4029-a4fc-e17b9160e8a8",
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
  "id": "46c4d1a4-da92-47ab-9a43-dfe497963a04",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:57:50.589265Z",
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
  "command_id": "b70a3f57-0c7d-45d8-b359-c5e4682845f9",
  "quote_id": "46c4d1a4-da92-47ab-9a43-dfe497963a04",
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
  "correlation_id": "21af7ceb-c092-4a3b-bcea-3315da291f38"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "9840592f-fa44-412f-9913-6b2e0e11b7cc",
      "short_number": 28,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "c4842ff5-fc7b-4b1d-8028-8418b2c6de41",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-30T15:52:50.390838Z",
      "cancellation": null,
      "pickup_at": "2026-10-30T18:52:50Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "4d7828e9-4ffa-494d-aba4-27f7fa3961ce",
      "short_number": 27,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "c4842ff5-fc7b-4b1d-8028-8418b2c6de41",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
        "lat": 50.4405,
        "lon": 30.489
      },
      "dropoff_label": "Вокзал",
      "payment_method": "CASH",
      "payment_state": "CASH_EXPECTED",
      "price_minor": 10517,
      "final_price_minor": null,
      "currency": "UAH",
      "search_phase": "BROADCAST",
      "assignment": null,
      "created_at": "2026-10-30T15:52:50.005132Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "98e78913-4b5e-45a4-8ced-2f3aca72ecea",
      "short_number": 26,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "4d7828e9-4ffa-494d-aba4-27f7fa3961ce",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c4842ff5-fc7b-4b1d-8028-8418b2c6de41",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:52:50.005132Z",
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

`GET /api/rider/v1/orders/98e78913-4b5e-45a4-8ced-2f3aca72ecea` → **200**

```json
{
  "id": "98e78913-4b5e-45a4-8ced-2f3aca72ecea",
  "short_number": 26,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "c4842ff5-fc7b-4b1d-8028-8418b2c6de41",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "cabc8bd4-ddd0-402d-bf44-e9e7e59b8982",
    "order_id": "98e78913-4b5e-45a4-8ced-2f3aca72ecea",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "63d47a70-ac2a-4bf6-bf29-23f7d98d4767",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T15:52:49.055734Z",
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
    "location_at": "2026-10-30T15:52:48.302723Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/98e78913-4b5e-45a4-8ced-2f3aca72ecea/cancel` → **200**

```json
{
  "command_id": "bc7ab67f-133c-4c99-bbfb-a41586450632",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "98e78913-4b5e-45a4-8ced-2f3aca72ecea",
  "short_number": 26,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "c4842ff5-fc7b-4b1d-8028-8418b2c6de41",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "cabc8bd4-ddd0-402d-bf44-e9e7e59b8982",
    "order_id": "98e78913-4b5e-45a4-8ced-2f3aca72ecea",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "63d47a70-ac2a-4bf6-bf29-23f7d98d4767",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T15:52:49.055734Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
      "en": "Changed my mind",
      "uk": "Передумав їхати"
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

`GET /api/rider/v1/orders/4d7828e9-4ffa-494d-aba4-27f7fa3961ce` → **200**

```json
{
  "id": "4d7828e9-4ffa-494d-aba4-27f7fa3961ce",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c4842ff5-fc7b-4b1d-8028-8418b2c6de41",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:52:50.005132Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/4d7828e9-4ffa-494d-aba4-27f7fa3961ce/cancel` → **200**

```json
{
  "command_id": "8dd0c05f-56cc-4c7f-8fbb-592c622675fa",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "4d7828e9-4ffa-494d-aba4-27f7fa3961ce",
  "short_number": 27,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "c4842ff5-fc7b-4b1d-8028-8418b2c6de41",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T15:52:50.005132Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
      "en": "Changed my mind",
      "uk": "Передумав їхати"
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

`GET /api/rider/v1/orders/9840592f-fa44-412f-9913-6b2e0e11b7cc` → **200**

```json
{
  "id": "9840592f-fa44-412f-9913-6b2e0e11b7cc",
  "short_number": 28,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "c4842ff5-fc7b-4b1d-8028-8418b2c6de41",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T15:52:50.390838Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T18:52:50Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/9840592f-fa44-412f-9913-6b2e0e11b7cc/cancel` → **200**

```json
{
  "command_id": "663c1e38-292a-49ac-822b-0f2acddb27fd",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "9840592f-fa44-412f-9913-6b2e0e11b7cc",
  "short_number": 28,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "c4842ff5-fc7b-4b1d-8028-8418b2c6de41",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T15:52:50.390838Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
      "en": "Changed my mind",
      "uk": "Передумав їхати"
    }
  },
  "pickup_at": "2026-10-30T18:52:50Z",
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
  "session_id": "8ac7d7ba-9203-4785-ab66-e0b2e026b29c",
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
  "last_heartbeat_at": "2026-10-30T15:52:48.302723Z",
  "last_location_at": "2026-10-30T15:52:48.302723Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8ac7d7ba-9203-4785-ab66-e0b2e026b29c/close` → **200**

```json
{
  "command_id": "e5d2939b-645c-433a-803a-2a934ae0dd76",
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

Done: orders 98e78913-4b5e-45a4-8ced-2f3aca72ecea, 4d7828e9-4ffa-494d-aba4-27f7fa3961ce, 9840592f-fa44-412f-9913-6b2e0e11b7cc.

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
  "session_id": "4c2079be-6e62-44a6-848f-b57d8167a40e",
  "subject": {
    "type": "STAFF",
    "id": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiODZhYmMzMi1mMmUyLTRjM2MtOTk2Ny05N2JmYzljZTdjZTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzY0NzMsImlhdCI6MTc5MzM3NTU3MywianRpIjoiZmQwODkyNDAtYzllOS00NmY3LTk1MWYtZWE3OGVlODI1NjVhIiwic2lkIjoiNGMyMDc5YmUtNmU2Mi00NGE2LTg0OGYtYjU3ZDgxNjdhNDBlIn0.p9jcIvbTTCgshs_YTtiAd3tqtFdgYAlL2Jrjr9Ub6pQ",
  "access_expires_at": "2026-10-30T16:07:53.000509889Z",
  "refresh_token": "tzogC3pv_9ZWTmS_KB_wKsDnxGJh56gAoKiIplz3qlA",
  "refresh_expires_at": "2026-10-31T03:52:53.000170978Z",
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
  "session_id": "ae15925b-2c41-4c9c-904e-49e24355aca9",
  "subject": {
    "type": "STAFF",
    "id": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiODZhYmMzMi1mMmUyLTRjM2MtOTk2Ny05N2JmYzljZTdjZTIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzY0NzMsImlhdCI6MTc5MzM3NTU3MywianRpIjoiMTlmYzdmYmMtNDg2YS00M2M2LWI2ZGEtOTc0YzYzZDRkZGY5Iiwic2lkIjoiYWUxNTkyNWItMmM0MS00YzljLTkwNGUtNDllMjQzNTVhY2E5In0.-VqchQLwyIxk-T0gi23zYMx7NSrRBr1QVzVk41fxv6A",
  "access_expires_at": "2026-10-30T16:07:53.36989734Z",
  "refresh_token": "5JG_41U52rVUphDDuIFJk0x9yfno2iOzZHSDggDkckI",
  "refresh_expires_at": "2026-10-31T03:52:53.369525709Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-17405"
}
```

```json
{
  "challenge_id": "a5c6ce13-60a5-48d9-8c85-3fcf2bb1a4fb",
  "expires_at": "2026-10-30T15:57:53.543051967Z",
  "resend_available_at": "2026-10-30T15:52:54.543051967Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "958190",
  "sent_at": "2026-10-30T15:52:53.544973786Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a5c6ce13-60a5-48d9-8c85-3fcf2bb1a4fb",
  "code": "958190",
  "device_ref": "sandbox-17405"
}
```

```json
{
  "session_id": "ca196f79-aaea-4d6f-b79b-bef094d535e3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NjQ3MywiaWF0IjoxNzkzMzc1NTczLCJqdGkiOiI4OWUwZjgyMi1kMDFlLTQ4MDMtYjVjMi01ZTdjZTMwZDlhMGMiLCJzaWQiOiJjYTE5NmY3OS1hYWVhLTRkNmYtYjc5Yi1iZWYwOTRkNTM1ZTMifQ.V75_08gdY2qmL6rbZZ1GLJWsIIADRknR4xO7Rnoo2tY",
  "access_expires_at": "2026-10-30T16:07:53.742996927Z",
  "refresh_token": "G5bqpjAWnz0Nkq6wIbxKvdac0MDJ4dKRAH3QbayBfbw",
  "refresh_expires_at": "2026-11-29T15:52:53.742529161Z",
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
  "command_id": "dfa48a1d-b1d7-401e-8bf8-b4eba9ede970",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:52:54Z",
    "sequence": 1793375574108
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "cd710b8c-4899-46da-b718-a3a46ea11529",
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
  "last_heartbeat_at": "2026-10-30T15:52:54.122798Z",
  "last_location_at": "2026-10-30T15:52:54.122798Z",
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
  "command_id": "c041c917-c642-4f9e-9531-308dac439bf1",
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
  "effective_at": "2026-10-30T15:52:54.493133Z",
  "changed_by": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-30T15:43:35.082132Z",
  "last_entries": [
    {
      "order_id": "30b5e674-8050-41b1-a071-a9574399c946",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T15:43:35.082132Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "0b818059-52be-49bd-9076-6f6c1983e23a",
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
  "id": "9cedee7e-dd28-4d67-8cba-c4cd4eabc426",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:57:54.853570Z",
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
  "command_id": "75371f5b-d1a8-4c48-b93c-06e87b370043",
  "quote_id": "9cedee7e-dd28-4d67-8cba-c4cd4eabc426",
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
    "phone": "+380671111863"
  }
}
```

```json
{
  "id": "5db06557-a237-410c-9445-c59a9d35c300",
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
  "created_at": "2026-10-30T15:52:55.03976Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671111863"
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
    "id": "1e17a91b-284c-4b85-9b2e-beddec639d41",
    "order_id": "5db06557-a237-410c-9445-c59a9d35c300",
    "expires_at": "2026-10-30T15:53:10.042269Z",
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

`POST /api/driver/v1/offers/1e17a91b-284c-4b85-9b2e-beddec639d41/accept` → **200**

```json
{
  "command_id": "caaafab9-9508-479a-a568-c6366929d34d"
}
```

```json
{
  "id": "ee0a5799-9ffb-4b29-9b8e-c1e8c26d16f4",
  "order_id": "5db06557-a237-410c-9445-c59a9d35c300",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "97b8145f-b54f-4c8d-9e7c-bb99481d04c9",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "97b8145f-b54f-4c8d-9e7c-bb99481d04c9",
  "order_id": "5db06557-a237-410c-9445-c59a9d35c300",
  "assignment_id": "ee0a5799-9ffb-4b29-9b8e-c1e8c26d16f4",
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
    "phone": "+380671111863"
  }
}
```

(the car drives 1 s to the next point)

`POST /api/driver/v1/work-sessions/cd710b8c-4899-46da-b718-a3a46ea11529/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:52:56Z",
    "sequence": 1793375576799
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "cd710b8c-4899-46da-b718-a3a46ea11529",
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
  "last_heartbeat_at": "2026-10-30T15:52:56.813175Z",
  "last_location_at": "2026-10-30T15:52:56.813175Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/97b8145f-b54f-4c8d-9e7c-bb99481d04c9/arrive` → **200**

```json
{
  "command_id": "d19e296d-80d1-478b-8449-74638397cf90",
  "expected_version": 0
}
```

```json
{
  "id": "97b8145f-b54f-4c8d-9e7c-bb99481d04c9",
  "order_id": "5db06557-a237-410c-9445-c59a9d35c300",
  "assignment_id": "ee0a5799-9ffb-4b29-9b8e-c1e8c26d16f4",
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
  "arrived_at": "2026-10-30T15:52:56.997702Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671111863"
  }
}
```

`POST /api/driver/v1/trips/97b8145f-b54f-4c8d-9e7c-bb99481d04c9/start` → **200**

```json
{
  "command_id": "eaa1c520-f923-4084-b3d8-1e99cc026cf6",
  "expected_version": 1
}
```

```json
{
  "id": "97b8145f-b54f-4c8d-9e7c-bb99481d04c9",
  "order_id": "5db06557-a237-410c-9445-c59a9d35c300",
  "assignment_id": "ee0a5799-9ffb-4b29-9b8e-c1e8c26d16f4",
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
  "arrived_at": "2026-10-30T15:52:56.997702Z",
  "started_at": "2026-10-30T15:52:57.186033Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671111863"
  }
}
```

`POST /api/driver/v1/trips/97b8145f-b54f-4c8d-9e7c-bb99481d04c9/complete` → **200**

```json
{
  "command_id": "2a37e7c9-fb64-4417-b12a-818aea7641c1",
  "expected_version": 2,
  "reported_at": "2026-10-30T15:52:57Z",
  "cash_received": true
}
```

```json
{
  "id": "97b8145f-b54f-4c8d-9e7c-bb99481d04c9",
  "order_id": "5db06557-a237-410c-9445-c59a9d35c300",
  "assignment_id": "ee0a5799-9ffb-4b29-9b8e-c1e8c26d16f4",
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
  "arrived_at": "2026-10-30T15:52:56.997702Z",
  "started_at": "2026-10-30T15:52:57.186033Z",
  "completed_at": "2026-10-30T15:52:57.375218Z",
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
  "command_id": "4722a383-e48a-43a5-bb8e-a858f3582d3d",
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
  "id": "be7b1e9b-68e1-402a-8583-495b8caa8717",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:57:57.577434Z",
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
  "command_id": "4fb88fa6-531f-4198-ba42-f6b3440589e3",
  "quote_id": "be7b1e9b-68e1-402a-8583-495b8caa8717",
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
    "phone": "+3806711121768"
  }
}
```

```json
{
  "id": "217bdb69-7b9d-406a-b4f4-daf34c3afa90",
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
  "created_at": "2026-10-30T15:52:57.765255Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711121768"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/217bdb69-7b9d-406a-b4f4-daf34c3afa90` → **200**

```json
{
  "id": "217bdb69-7b9d-406a-b4f4-daf34c3afa90",
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
  "created_at": "2026-10-30T15:52:57.765255Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711121768"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/217bdb69-7b9d-406a-b4f4-daf34c3afa90/cancel` → **200**

```json
{
  "command_id": "0ba0cc1d-5331-46f9-afc6-7fffe8dc38b1",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "217bdb69-7b9d-406a-b4f4-daf34c3afa90",
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
  "created_at": "2026-10-30T15:52:57.765255Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711121768"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "OPERATOR_ERROR",
    "reason_labels": {
      "pl": "Błąd operatora",
      "ru": "Ошибка оператора",
      "en": "Operator error",
      "uk": "Помилка оператора"
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
  "staff_id": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-30T15:43:35.082132Z",
  "last_entries": [
    {
      "order_id": "217bdb69-7b9d-406a-b4f4-daf34c3afa90",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-30T15:52:58.154712Z"
    },
    {
      "order_id": "5db06557-a237-410c-9445-c59a9d35c300",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-30T15:52:57.378505Z"
    },
    {
      "order_id": "30b5e674-8050-41b1-a071-a9574399c946",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T15:43:35.082132Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "cd710b8c-4899-46da-b718-a3a46ea11529",
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
  "last_heartbeat_at": "2026-10-30T15:52:56.813175Z",
  "last_location_at": "2026-10-30T15:52:56.813175Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/cd710b8c-4899-46da-b718-a3a46ea11529/close` → **200**

```json
{
  "command_id": "b8e78fe5-ae5a-4e0b-8359-c5016075b3e1",
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

Done: operator bonus for fulfilled 5db06557-a237-410c-9445-c59a9d35c300 and operator-fault cancellation 217bdb69-7b9d-406a-b4f4-daf34c3afa90.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671356907",
  "device_ref": "sandbox-27797"
}
```

```json
{
  "challenge_id": "13fd0151-235a-4b94-9c29-8fef01824e5a",
  "expires_at": "2026-10-30T15:58:02.11251407Z",
  "resend_available_at": "2026-10-30T15:53:03.11251407Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380671356907` → **200**

```json
{
  "phone": "+380671356907",
  "audience": "CLIENT",
  "code": "672969",
  "sent_at": "2026-10-30T15:53:02.114148062Z",
  "channel": "SMS"
}
```

## "Call me instead" on the first try still gets an SMS; the resend is a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670021420",
  "device_ref": "sandbox-14880",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "ba11f92b-0fd0-4354-9928-23949f4980fe",
  "expires_at": "2026-10-30T15:58:03.510616796Z",
  "resend_available_at": "2026-10-30T15:53:04.510616796Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380670021420` → **200**

```json
{
  "phone": "+380670021420",
  "audience": "CLIENT",
  "code": "779741",
  "sent_at": "2026-10-30T15:53:03.512085248Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670021420",
  "device_ref": "sandbox-3926",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "6cf569f8-3950-4b98-9205-404e49fb27fa",
  "expires_at": "2026-10-30T15:58:04.913230579Z",
  "resend_available_at": "2026-10-30T15:53:05.913230579Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380670021420` → **200**

```json
{
  "phone": "+380670021420",
  "audience": "CLIENT",
  "code": "044783",
  "sent_at": "2026-10-30T15:53:04.915135488Z",
  "channel": "VOICE"
}
```

## The SMS does not get through: one request, one attempt; the resend comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678770000",
  "device_ref": "sandbox-15380"
}
```

```json
{
  "challenge_id": "ac38a492-a96a-4f3c-8a00-461d6676d129",
  "expires_at": "2026-10-30T15:58:06.311252231Z",
  "resend_available_at": "2026-10-30T15:53:07.311252231Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678770000",
  "device_ref": "sandbox-20432"
}
```

```json
{
  "challenge_id": "b54b7217-c67f-4f90-9917-953d10180847",
  "expires_at": "2026-10-30T15:58:07.697886961Z",
  "resend_available_at": "2026-10-30T15:53:08.697886961Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380678770000` → **200**

```json
{
  "phone": "+380678770000",
  "audience": "CLIENT",
  "code": "759938",
  "sent_at": "2026-10-30T15:53:07.699765823Z",
  "channel": "VOICE"
}
```

## A second call in the hour is made, the third is refused

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678770000",
  "device_ref": "sandbox-17068",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "d683de4a-ef02-40f0-a32c-2f73a40d3cb1",
  "expires_at": "2026-10-30T15:58:09.101453191Z",
  "resend_available_at": "2026-10-30T15:53:10.101453191Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380678770000` → **200**

```json
{
  "phone": "+380678770000",
  "audience": "CLIENT",
  "code": "640434",
  "sent_at": "2026-10-30T15:53:09.103185538Z",
  "channel": "VOICE"
}
```

`POST /auth/v1/otp/challenges` → **429**

```json
{
  "audience": "CLIENT",
  "phone": "+380678770000",
  "device_ref": "sandbox-17003",
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
  "correlation_id": "7e6215a5-8281-4491-8abe-adbbe4e5bba3",
  "retryable": true,
  "retry_after_seconds": 3600
}
```

## Numbers outside Poland and Ukraine get nothing

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+442000010569"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "40512451-f4bd-45a9-85f1-b41e09b88f3d"
}
```

`GET /sandbox/v1/otp?phone=%2B442000010569` → **404**

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+37120008173"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "6d7690ef-7381-4a27-8949-d04c8b8ad2c2"
}
```

`GET /sandbox/v1/otp?phone=%2B37120008173` → **404**

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
  "session_id": "2995ec04-4b17-463b-a3f7-d20bd71a268b",
  "subject": {
    "type": "STAFF",
    "id": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiODZhYmMzMi1mMmUyLTRjM2MtOTk2Ny05N2JmYzljZTdjZTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzY0OTEsImlhdCI6MTc5MzM3NTU5MSwianRpIjoiN2Q3MjE5NTktMWRhNi00ZWNjLWE5NWYtNjA0MTkxYjRlNWRiIiwic2lkIjoiMjk5NWVjMDQtNGIxNy00NjNiLWEzZjctZDIwYmQ3MWEyNjhiIn0.YNbbnQarQyoCQt01F4bIeW5k1b6NHEG8AIPJtMM-wjI",
  "access_expires_at": "2026-10-30T16:08:11.274218878Z",
  "refresh_token": "cuycEjTpluiba0A8mvEc9MgdckBV8tmjtXHi56NxwyE",
  "refresh_expires_at": "2026-10-31T03:53:11.27386766Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380678770000` → **200**

```json
{
  "deliveries": [
    {
      "id": "cbf717a5-9b2f-499a-9b55-635e824f9726",
      "challenge_id": "d683de4a-ef02-40f0-a32c-2f73a40d3cb1",
      "phone": "+380678770000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-b7508936-c583-4bc1-8a73-b0ed8be7767c",
      "error": null,
      "attempted_at": "2026-10-30T15:53:09.103494Z"
    },
    {
      "id": "91b4a286-1ab0-4bea-9bd1-0cf9d3ef58c4",
      "challenge_id": "b54b7217-c67f-4f90-9917-953d10180847",
      "phone": "+380678770000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-3fc4537e-63d2-416c-9890-9fdc8e68653d",
      "error": null,
      "attempted_at": "2026-10-30T15:53:07.699965Z"
    },
    {
      "id": "24d914f3-8e18-4cfb-8f2b-322cc78d3446",
      "challenge_id": "ac38a492-a96a-4f3c-8a00-461d6676d129",
      "phone": "+380678770000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-30T15:53:06.313053Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380678770000` → **200**

```json
{
  "phone": "+380678770000",
  "audience": "CLIENT",
  "code": "640434",
  "sent_at": "2026-10-30T15:53:09.103185538Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380670021420` → **200**

```json
{
  "deliveries": [
    {
      "id": "508235bf-718f-41d4-aaa1-d305703b60bf",
      "challenge_id": "6cf569f8-3950-4b98-9205-404e49fb27fa",
      "phone": "+380670021420",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-90995875-cbb7-4e55-ab68-0d1a67fee439",
      "error": null,
      "attempted_at": "2026-10-30T15:53:04.915378Z"
    },
    {
      "id": "400cb6d0-acba-4189-aa37-5cc5b0b384bf",
      "challenge_id": "ba11f92b-0fd0-4354-9928-23949f4980fe",
      "phone": "+380670021420",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-8470781f-48dc-48ac-ae1d-ffaf8b30fa2f",
      "error": null,
      "attempted_at": "2026-10-30T15:53:03.512314Z"
    }
  ]
}
```

Done: SMS to +380671356907; SMS then a call to +380670021420; a failed SMS, two calls and a refused third to +380678770000; +44 and +371 refused.

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
  "session_id": "ebf2e25e-754c-492a-9a86-2bb6ab936ceb",
  "subject": {
    "type": "STAFF",
    "id": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiODZhYmMzMi1mMmUyLTRjM2MtOTk2Ny05N2JmYzljZTdjZTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzY0OTIsImlhdCI6MTc5MzM3NTU5MiwianRpIjoiM2E2YzllNjQtOGNiNi00MWFlLTkwOTAtYTI5MmYyODAxNzk1Iiwic2lkIjoiZWJmMmUyNWUtNzU0Yy00OTJhLTlhODYtMmJiNmFiOTM2Y2ViIn0.wyZLmHa5SWwsioZk40pgDmK_ZfVTDBNbrJNlFVWl09A",
  "access_expires_at": "2026-10-30T16:08:12.034681265Z",
  "refresh_token": "Blmny3CojrI6qHlvJST8zxPcNn5SfxTM-Ti6bgdwcAo",
  "refresh_expires_at": "2026-10-31T03:53:12.034327441Z",
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
  "session_id": "3bfc964b-6cb8-488b-aa38-b5e67a3d9203",
  "subject": {
    "type": "STAFF",
    "id": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiODZhYmMzMi1mMmUyLTRjM2MtOTk2Ny05N2JmYzljZTdjZTIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzY0OTIsImlhdCI6MTc5MzM3NTU5MiwianRpIjoiNjgxMDg0MzctY2RhMi00NjFmLWI2YTMtNTU2MTFlNmY1NmQxIiwic2lkIjoiM2JmYzk2NGItNmNiOC00ODhiLWFhMzgtYjVlNjdhM2Q5MjAzIn0.Flfh47zqXdA3StOcZ9G5ZDW4U2gzfzzVxcTmV9rCPpM",
  "access_expires_at": "2026-10-30T16:08:12.404741318Z",
  "refresh_token": "pWd7dzVaU0t7HaXpeFVc5m1__jA0AVla7ZAcPOnn0KE",
  "refresh_expires_at": "2026-10-31T03:53:12.404403098Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2",
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

`POST /api/admin/v1/staff-extensions/b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2` → **200**

```json
{
  "command_id": "d6f74fb4-7429-45b5-aa7e-b3d7a7535088",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "78e3559f-5c26-4af3-b698-8d7fdf95f372",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T15:53:13.129888Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T15:53:13.129888Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "cbd9eefb-53ff-44a5-909e-283296c05ccf",
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
  "id": "7429ff1a-0bf6-4c10-b81f-83263a5eefeb",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:58:13.490670Z",
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
  "command_id": "9b212b81-7c85-46a1-b086-e374afd394cc",
  "quote_id": "7429ff1a-0bf6-4c10-b81f-83263a5eefeb",
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
    "phone": "+380673499617"
  }
}
```

```json
{
  "id": "6d18711c-8d61-492c-b713-18ed35b1a812",
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
  "created_at": "2026-10-30T15:53:13.678126Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673499617"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/6d18711c-8d61-492c-b713-18ed35b1a812/calls` → **201**

```json
{
  "command_id": "6af4d1b9-5330-46d6-a821-4a552f0b4a75",
  "to": "CALLER"
}
```

```json
{
  "id": "9668e5b2-a3a4-4646-a047-65a793174dba",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2",
  "order_ids": [
    "6d18711c-8d61-492c-b713-18ed35b1a812"
  ],
  "started_at": "2026-10-30T15:53:13.911715Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/6d18711c-8d61-492c-b713-18ed35b1a812/calls` → **201**

```json
{
  "command_id": "6af4d1b9-5330-46d6-a821-4a552f0b4a75",
  "to": "CALLER"
}
```

```json
{
  "id": "9668e5b2-a3a4-4646-a047-65a793174dba",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2",
  "order_ids": [
    "6d18711c-8d61-492c-b713-18ed35b1a812"
  ],
  "started_at": "2026-10-30T15:53:13.911715Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "9668e5b2-a3a4-4646-a047-65a793174dba",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380673499617",
    "at": "2026-10-30T15:53:13.913363756Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "9668e5b2-a3a4-4646-a047-65a793174dba",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.15892",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "9668e5b2-a3a4-4646-a047-65a793174dba"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "9668e5b2-a3a4-4646-a047-65a793174dba",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=6d18711c-8d61-492c-b713-18ed35b1a812` → **200**

```json
{
  "calls": [
    {
      "id": "9668e5b2-a3a4-4646-a047-65a793174dba",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2",
      "order_ids": [
        "6d18711c-8d61-492c-b713-18ed35b1a812"
      ],
      "started_at": "2026-10-30T15:53:13.911715Z",
      "answered_at": "2026-10-30T15:53:14.33476Z",
      "ended_at": "2026-10-30T15:53:14.350389Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=6d18711c-8d61-492c-b713-18ed35b1a812` → **200**

```json
{
  "calls": [
    {
      "id": "9668e5b2-a3a4-4646-a047-65a793174dba",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2",
      "order_ids": [
        "6d18711c-8d61-492c-b713-18ed35b1a812"
      ],
      "started_at": "2026-10-30T15:53:13.911715Z",
      "answered_at": "2026-10-30T15:53:14.33476Z",
      "ended_at": "2026-10-30T15:53:14.350389Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=6d18711c-8d61-492c-b713-18ed35b1a812` → **200**

```json
{
  "calls": [
    {
      "id": "9668e5b2-a3a4-4646-a047-65a793174dba",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2",
      "order_ids": [
        "6d18711c-8d61-492c-b713-18ed35b1a812"
      ],
      "started_at": "2026-10-30T15:53:13.911715Z",
      "answered_at": "2026-10-30T15:53:14.33476Z",
      "ended_at": "2026-10-30T15:53:14.350389Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T15:53:16.931812Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/6d18711c-8d61-492c-b713-18ed35b1a812` → **200**

```json
{
  "id": "6d18711c-8d61-492c-b713-18ed35b1a812",
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
  "created_at": "2026-10-30T15:53:13.678126Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673499617"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/6d18711c-8d61-492c-b713-18ed35b1a812/cancel` → **200**

```json
{
  "command_id": "a014a5ca-66a5-45b0-8952-7e576bd42845",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "6d18711c-8d61-492c-b713-18ed35b1a812",
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
  "created_at": "2026-10-30T15:53:13.678126Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673499617"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "pl": "Brak wolnych aut",
      "ru": "Нет свободных машин",
      "en": "No cars available",
      "uk": "Немає вільних авто"
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
  "command_id": "2ff19d3f-1c66-4afa-a1b8-4e217f194c35",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-30T15:53:19.296095Z",
  "extension": "101"
}
```

Done: outgoing call 9668e5b2-a3a4-4646-a047-65a793174dba from order 6d18711c-8d61-492c-b713-18ed35b1a812, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630347966",
  "device_ref": "sandbox-29108"
}
```

```json
{
  "challenge_id": "446037f7-edb0-4b80-beea-270787da3376",
  "expires_at": "2026-10-30T15:58:19.483323904Z",
  "resend_available_at": "2026-10-30T15:53:20.483323904Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380630347966` → **200**

```json
{
  "phone": "+380630347966",
  "audience": "CLIENT",
  "code": "521136",
  "sent_at": "2026-10-30T15:53:19.485186143Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "446037f7-edb0-4b80-beea-270787da3376",
  "code": "521136",
  "device_ref": "sandbox-29108"
}
```

```json
{
  "session_id": "3c06eebe-aa99-40a8-ac19-b865a212953a",
  "subject": {
    "type": "CLIENT",
    "id": "50152dd3-57fb-43b3-9a89-424f1db3ca63"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MDE1MmRkMy01N2ZiLTQzYjMtOWE4OS00MjRmMWRiM2NhNjMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc2NDk5LCJpYXQiOjE3OTMzNzU1OTksImp0aSI6IjczMTI3MTExLTczM2UtNGY0ZS1hZmJlLTI4NDA5ZjgwODMyMyIsInNpZCI6IjNjMDZlZWJlLWFhOTktNDBhOC1hYzE5LWI4NjVhMjEyOTUzYSJ9.XTU252Bgk3KyGXn91o4W6_iIenAQfvkKz10agk3Aiek",
  "access_expires_at": "2026-10-30T16:08:19.683081632Z",
  "refresh_token": "gViogmk--0YverNBbK5cEGyqlMcKp5zkIw7SVNe1Cxs",
  "refresh_expires_at": "2026-11-29T15:53:19.682703552Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "50152dd3-57fb-43b3-9a89-424f1db3ca63",
  "session_id": "3c06eebe-aa99-40a8-ac19-b865a212953a",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630347966",
  "device_ref": "sandbox-27243"
}
```

```json
{
  "challenge_id": "3854299b-da42-448b-ba6b-a9bbbb11ae40",
  "expires_at": "2026-10-30T15:58:22.027089378Z",
  "resend_available_at": "2026-10-30T15:53:23.027089378Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380630347966` → **200**

```json
{
  "phone": "+380630347966",
  "audience": "CLIENT",
  "code": "741199",
  "sent_at": "2026-10-30T15:53:22.028798626Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3854299b-da42-448b-ba6b-a9bbbb11ae40",
  "code": "741199",
  "device_ref": "sandbox-27243"
}
```

```json
{
  "session_id": "d3c72054-0cc3-46a6-89af-85b34b957086",
  "subject": {
    "type": "CLIENT",
    "id": "50152dd3-57fb-43b3-9a89-424f1db3ca63"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MDE1MmRkMy01N2ZiLTQzYjMtOWE4OS00MjRmMWRiM2NhNjMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc2NTAyLCJpYXQiOjE3OTMzNzU2MDIsImp0aSI6Ijc5OWE3MWVmLTdiM2QtNGEyNi04ODg5LWU1ZmU0ZjBiMGJhMiIsInNpZCI6ImQzYzcyMDU0LTBjYzMtNDZhNi04OWFmLTg1YjM0Yjk1NzA4NiJ9.jMjWpwKCGIVz3uyC2ZUce0XYu65Coc5LzPpoWJEO0Ds",
  "access_expires_at": "2026-10-30T16:08:22.224134183Z",
  "refresh_token": "r1E4bvoXFdjiqCp6fgZGQnZzKPC3ODH0Iw2fctXfwpE",
  "refresh_expires_at": "2026-11-29T15:53:22.223724345Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "8818cd34-e8e5-449e-879b-c4dbc10ec0aa",
  "expires_at": "2026-10-30T15:58:24.403866881Z",
  "resend_available_at": "2026-10-30T15:53:25.403866881Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630347966` → **200**

```json
{
  "phone": "+380630347966",
  "audience": "CLIENT",
  "code": "917661",
  "sent_at": "2026-10-30T15:53:24.405895721Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380631023031"
}
```

```json
{
  "challenge_id": "a2ba79e5-6c4a-4202-9ed7-a1750134fb3d",
  "expires_at": "2026-10-30T15:58:24.598478607Z",
  "resend_available_at": "2026-10-30T15:53:25.598478607Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631023031` → **200**

```json
{
  "phone": "+380631023031",
  "audience": "CLIENT",
  "code": "105784",
  "sent_at": "2026-10-30T15:53:24.600015575Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "5bb540e6-8536-4b1c-b15b-bddcb5af8689",
  "current_challenge_id": "8818cd34-e8e5-449e-879b-c4dbc10ec0aa",
  "current_code": "000000",
  "new_challenge_id": "a2ba79e5-6c4a-4202-9ed7-a1750134fb3d",
  "new_code": "105784"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "c19906d4-14a3-4d2e-b81a-818173111989"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "55133da0-0b4d-4caa-96a9-bd38295e5a59",
  "current_challenge_id": "8818cd34-e8e5-449e-879b-c4dbc10ec0aa",
  "current_code": "917661",
  "new_challenge_id": "a2ba79e5-6c4a-4202-9ed7-a1750134fb3d",
  "new_code": "105784"
}
```

```json
{
  "subject_id": "50152dd3-57fb-43b3-9a89-424f1db3ca63",
  "phone": "+380631023031",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "50152dd3-57fb-43b3-9a89-424f1db3ca63",
  "session_id": "3c06eebe-aa99-40a8-ac19-b865a212953a",
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
  "correlation_id": "0ded6398-1826-4b81-80a9-56712dc10596"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631023031",
  "device_ref": "sandbox-2963"
}
```

```json
{
  "challenge_id": "d80772a0-5764-4377-9d55-045f65db3b9b",
  "expires_at": "2026-10-30T15:58:27.507997649Z",
  "resend_available_at": "2026-10-30T15:53:28.507997649Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631023031` → **200**

```json
{
  "phone": "+380631023031",
  "audience": "CLIENT",
  "code": "491522",
  "sent_at": "2026-10-30T15:53:27.509542579Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d80772a0-5764-4377-9d55-045f65db3b9b",
  "code": "491522",
  "device_ref": "sandbox-2963"
}
```

```json
{
  "session_id": "5df92f75-80d6-42a6-8be2-1bd6d97c421c",
  "subject": {
    "type": "CLIENT",
    "id": "50152dd3-57fb-43b3-9a89-424f1db3ca63"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MDE1MmRkMy01N2ZiLTQzYjMtOWE4OS00MjRmMWRiM2NhNjMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc2NTA3LCJpYXQiOjE3OTMzNzU2MDcsImp0aSI6ImE3NGNiZDkyLWIyNDItNDdmYS1iODk2LWZhYWMxYjIyZWFmOSIsInNpZCI6IjVkZjkyZjc1LTgwZDYtNDJhNi04YmUyLTFiZDZkOTdjNDIxYyJ9.5P_Nqx_g4hMDy5ekvQBDURf_erFipn3yfUO_LqjYKCY",
  "access_expires_at": "2026-10-30T16:08:27.703840827Z",
  "refresh_token": "_p77NzYKRz32o2fTynOKynFdmycAmXsPy0sLL9KHteA",
  "refresh_expires_at": "2026-11-29T15:53:27.703327433Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "50152dd3-57fb-43b3-9a89-424f1db3ca63",
  "session_id": "5df92f75-80d6-42a6-8be2-1bd6d97c421c",
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
  "session_id": "cb333db4-aed4-4214-b173-ebd170c691a6",
  "subject": {
    "type": "STAFF",
    "id": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiODZhYmMzMi1mMmUyLTRjM2MtOTk2Ny05N2JmYzljZTdjZTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzY1MDgsImlhdCI6MTc5MzM3NTYwOCwianRpIjoiOWFhODc3NmUtNDMwMS00NWJlLTkwYTAtOWJjNGFmZGU2YzIyIiwic2lkIjoiY2IzMzNkYjQtYWVkNC00MjE0LWIxNzMtZWJkMTcwYzY5MWE2In0.7wYqsghM70aTjLUsz-5fkB6LwN97wIMyHJbFhHyis7g",
  "access_expires_at": "2026-10-30T16:08:28.264314371Z",
  "refresh_token": "75iMT69wJY9iHNNWHvTzRw18FlZLvmWP66RIon8cOzw",
  "refresh_expires_at": "2026-10-31T03:53:28.263976041Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/50152dd3-57fb-43b3-9a89-424f1db3ca63` → **200**

```json
{
  "client": {
    "id": "50152dd3-57fb-43b3-9a89-424f1db3ca63",
    "phone": "+380631023031",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T15:53:19.681385Z",
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

`POST /api/admin/v1/clients/50152dd3-57fb-43b3-9a89-424f1db3ca63/phone/new-code` → **201**

```json
{
  "phone": "+380633453278"
}
```

```json
{
  "challenge_id": "4edc14f5-6660-4cc7-ab42-de63d4fa8dee",
  "expires_at": "2026-10-30T15:58:28.63547124Z",
  "resend_available_at": "2026-10-30T15:53:29.63547124Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633453278` → **200**

```json
{
  "phone": "+380633453278",
  "audience": "CLIENT",
  "code": "187205",
  "sent_at": "2026-10-30T15:53:28.636849597Z",
  "channel": "SMS"
}
```

## Without the right code nothing changes; with it, support sets the phone

`POST /api/admin/v1/clients/50152dd3-57fb-43b3-9a89-424f1db3ca63/phone` → **422**

```json
{
  "command_id": "c6279533-7c39-48fe-b090-69a23000df64",
  "expected_version": 3,
  "new_challenge_id": "4edc14f5-6660-4cc7-ab42-de63d4fa8dee",
  "new_code": "187206",
  "reason": "Passport checked at the office"
}
```

```json
{
  "instance": "/api/admin/v1/clients/50152dd3-57fb-43b3-9a89-424f1db3ca63/phone",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "175ac080-acbc-471f-98f0-1613013401fb"
}
```

`POST /api/admin/v1/clients/50152dd3-57fb-43b3-9a89-424f1db3ca63/phone` → **400**

```json
{
  "command_id": "e4aa68e7-18d8-4b97-bb34-eea191857fc7",
  "expected_version": 3,
  "new_challenge_id": "4edc14f5-6660-4cc7-ab42-de63d4fa8dee",
  "new_code": "187205",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/50152dd3-57fb-43b3-9a89-424f1db3ca63/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "4dc9abd6-3fe5-4205-96d0-d15aec8be404",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

`POST /api/admin/v1/clients/50152dd3-57fb-43b3-9a89-424f1db3ca63/phone` → **200**

```json
{
  "command_id": "bec63337-2617-47ce-be22-a2d56e75aaeb",
  "expected_version": 3,
  "new_challenge_id": "4edc14f5-6660-4cc7-ab42-de63d4fa8dee",
  "new_code": "187205",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "50152dd3-57fb-43b3-9a89-424f1db3ca63",
  "phone": "+380633453278",
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
  "correlation_id": "a79679bc-b5c6-40c0-93cd-d5aa6b6d1e03"
}
```

`POST /auth/v1/otp/challenges` → **429**

```json
{
  "audience": "CLIENT",
  "phone": "+380633453278",
  "device_ref": "sandbox-3508"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "f1655462-42eb-4f00-bbcd-3688d3d8835f",
  "retryable": true,
  "retry_after_seconds": 1
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633453278",
  "device_ref": "sandbox-3508"
}
```

```json
{
  "challenge_id": "4e5634a6-819b-4974-8b49-f0776deaea50",
  "expires_at": "2026-10-30T15:58:30.737330482Z",
  "resend_available_at": "2026-10-30T15:53:31.737330482Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380633453278` → **200**

```json
{
  "phone": "+380633453278",
  "audience": "CLIENT",
  "code": "220827",
  "sent_at": "2026-10-30T15:53:30.739097494Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4e5634a6-819b-4974-8b49-f0776deaea50",
  "code": "220827",
  "device_ref": "sandbox-3508"
}
```

```json
{
  "session_id": "dd2a36c3-32ff-4b30-8c97-4bdf3554f218",
  "subject": {
    "type": "CLIENT",
    "id": "50152dd3-57fb-43b3-9a89-424f1db3ca63"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MDE1MmRkMy01N2ZiLTQzYjMtOWE4OS00MjRmMWRiM2NhNjMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc2NTEwLCJpYXQiOjE3OTMzNzU2MTAsImp0aSI6IjE2NWQ4MGY0LTNlMDItNDQxZi05ZDM0LWVhYjU2YTdmNGIyMSIsInNpZCI6ImRkMmEzNmMzLTMyZmYtNGIzMC04Yzk3LTRiZGYzNTU0ZjIxOCJ9.YnjbIyw0k_AaVGN5IfLymtmxjr-LFoGmss706cc3YA8",
  "access_expires_at": "2026-10-30T16:08:30.935472847Z",
  "refresh_token": "o_xfxKDxk48-TsRDAa3Pbn2ToT5qeNM1AqagiodRRrE",
  "refresh_expires_at": "2026-11-29T15:53:30.935078758Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "50152dd3-57fb-43b3-9a89-424f1db3ca63",
  "session_id": "dd2a36c3-32ff-4b30-8c97-4bdf3554f218",
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
  "phone": "+380639544351",
  "device_ref": "sandbox-8686"
}
```

```json
{
  "challenge_id": "ed003e34-f481-4999-8591-eb5e608acfa2",
  "expires_at": "2026-10-30T15:58:31.284917378Z",
  "resend_available_at": "2026-10-30T15:53:32.284917378Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639544351` → **200**

```json
{
  "phone": "+380639544351",
  "audience": "CLIENT",
  "code": "166229",
  "sent_at": "2026-10-30T15:53:31.286789509Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ed003e34-f481-4999-8591-eb5e608acfa2",
  "code": "166229",
  "device_ref": "sandbox-8686"
}
```

```json
{
  "session_id": "814e1d5a-8031-45da-a0df-0999df04ed8b",
  "subject": {
    "type": "CLIENT",
    "id": "a94fc713-33e0-4102-b687-6a4e847a37a5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhOTRmYzcxMy0zM2UwLTQxMDItYjY4Ny02YTRlODQ3YTM3YTUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc2NTExLCJpYXQiOjE3OTMzNzU2MTEsImp0aSI6Ijk3ZjFjYzkzLTBiZDItNDg4ZC05OGMxLTBmMjBiMWY3NDFlOSIsInNpZCI6IjgxNGUxZDVhLTgwMzEtNDVkYS1hMGRmLTA5OTlkZjA0ZWQ4YiJ9.AIWNlNDmbPc9MzgLkAYqeO7xBRH9FsMfp-XwIeYGJVs",
  "access_expires_at": "2026-10-30T16:08:31.484344559Z",
  "refresh_token": "obRizEgQ-TNTurvflSVVQJtsWkewk5fOp5WAbfA9no8",
  "refresh_expires_at": "2026-11-29T15:53:31.484021176Z",
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
  "session_id": "c0209f8d-affa-4965-b765-2ac8021c39c5",
  "subject": {
    "type": "STAFF",
    "id": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiODZhYmMzMi1mMmUyLTRjM2MtOTk2Ny05N2JmYzljZTdjZTIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzY1MTIsImlhdCI6MTc5MzM3NTYxMiwianRpIjoiN2RkYjkyYTgtMGU5ZC00NzI5LThlZjktYjgzYjEzOWVlYzc2Iiwic2lkIjoiYzAyMDlmOGQtYWZmYS00OTY1LWI3NjUtMmFjODAyMWMzOWM1In0.NYWMNFe7MD2EYQHrddgcXb4bR9coFnwodNPoh6tsoLY",
  "access_expires_at": "2026-10-30T16:08:32.231803396Z",
  "refresh_token": "rJ440ya-tSY-XrWCo1kM6xOsz2e65NGkZ8t91y97MA8",
  "refresh_expires_at": "2026-10-31T03:53:32.231448711Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380639544351` → **200**

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
  "correlation_id": "ff67f924-df31-4dac-80e5-4b41f6d9636b"
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
  "session_id": "b869b392-472b-43e4-908f-245e142b3514",
  "subject": {
    "type": "STAFF",
    "id": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiODZhYmMzMi1mMmUyLTRjM2MtOTk2Ny05N2JmYzljZTdjZTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzY1MTIsImlhdCI6MTc5MzM3NTYxMiwianRpIjoiM2RlODA4OTEtZjhmOS00NjQ2LWJmMTEtYmViNDM3Njk3M2I3Iiwic2lkIjoiYjg2OWIzOTItNDcyYi00M2U0LTkwOGYtMjQ1ZTE0MmIzNTE0In0.SOXWPAtyqGVW0ZgZwnR5XYimRU7JQZLkizZ7BW_gQ5I",
  "access_expires_at": "2026-10-30T16:08:32.960250395Z",
  "refresh_token": "eHlaKAAmWzOMeXvSQzMCKMgADmFVB5jsrd6l9Xw-cm0",
  "refresh_expires_at": "2026-10-31T03:53:32.959892301Z",
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
  "changed_by": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T15:39:39.079263Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "4a4a984e-d3ec-4772-b62e-7fd4280ea4a9",
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
  "changed_by": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-30T15:53:33.32364007Z"
}
```

## The rider books the airport for 2026-10-30T18:53:32Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600714514",
  "device_ref": "sandbox-22189"
}
```

```json
{
  "challenge_id": "1510f2e1-bd4a-4e8f-b717-b0acf3523aea",
  "expires_at": "2026-10-30T15:58:33.513500655Z",
  "resend_available_at": "2026-10-30T15:53:34.513500655Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600714514` → **200**

```json
{
  "phone": "+48600714514",
  "audience": "CLIENT",
  "code": "362915",
  "sent_at": "2026-10-30T15:53:33.515546823Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1510f2e1-bd4a-4e8f-b717-b0acf3523aea",
  "code": "362915",
  "device_ref": "sandbox-22189"
}
```

```json
{
  "session_id": "34a7ce2f-212f-4daf-8abf-b72377d3bffc",
  "subject": {
    "type": "CLIENT",
    "id": "5a3570f1-704f-445d-b8d7-795fc15737e3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTM1NzBmMS03MDRmLTQ0NWQtYjhkNy03OTVmYzE1NzM3ZTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc2NTEzLCJpYXQiOjE3OTMzNzU2MTMsImp0aSI6ImJiNmRkMzQzLTMzNzUtNDkyNC1hNTNiLTMzZmM1ZjRjMmJiNyIsInNpZCI6IjM0YTdjZTJmLTIxMmYtNGRhZi04YWJmLWI3MjM3N2QzYmZmYyJ9.2mWvan44fxbOQiASLQWR0JsugEaqPfXyY5kt5xwsjec",
  "access_expires_at": "2026-10-30T16:08:33.711333534Z",
  "refresh_token": "2R8Q1YskVVYFFlpz0jad3rEbUMXpW_gsYWuLQ0RXP6Y",
  "refresh_expires_at": "2026-11-29T15:53:33.710976661Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "2a65912b-b909-47a3-a90e-e7c7a41b9795",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-30T18:53:32Z"
}
```

```json
{
  "id": "19e208d6-c0ee-41f7-964a-3177b567821c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:58:33.894115Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-30T18:53:32Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "eb0bd42e-9f21-46ba-9a3f-aa004ab549ec",
  "quote_id": "19e208d6-c0ee-41f7-964a-3177b567821c",
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
  "pickup_at": "2026-10-30T18:53:32Z"
}
```

```json
{
  "id": "fb4f79ed-33bc-45f5-a670-d20b82adf01e",
  "short_number": 32,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "5a3570f1-704f-445d-b8d7-795fc15737e3",
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
  "created_at": "2026-10-30T15:53:34.081948Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T18:53:32Z",
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
  "device_ref": "sandbox-24896"
}
```

```json
{
  "challenge_id": "4bce575f-68e0-4580-adb2-3b44c2f39142",
  "expires_at": "2026-10-30T15:58:34.271120023Z",
  "resend_available_at": "2026-10-30T15:53:35.271120023Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "278287",
  "sent_at": "2026-10-30T15:53:34.272991202Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4bce575f-68e0-4580-adb2-3b44c2f39142",
  "code": "278287",
  "device_ref": "sandbox-24896"
}
```

```json
{
  "session_id": "e791adaf-f312-4b21-9a08-41b628ada3fc",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NjUxNCwiaWF0IjoxNzkzMzc1NjE0LCJqdGkiOiJhYmQyYzVkNi0zOWY1LTQ0NDMtYTY2OS1mMWI1ODllMzExODQiLCJzaWQiOiJlNzkxYWRhZi1mMzEyLTRiMjEtOWEwOC00MWI2MjhhZGEzZmMifQ.iHvctyuf8lyCfh1f17pteKJWU9ydsix1jnXECld0sNU",
  "access_expires_at": "2026-10-30T16:08:34.46659209Z",
  "refresh_token": "KRle76ezOVQIAOmoJxNf1rxbA0Yb9Jql3HZv3_PKVyA",
  "refresh_expires_at": "2026-11-29T15:53:34.466262853Z",
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
  "command_id": "30350198-6152-4ff1-a869-0cf94b7da754",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:53:34Z",
    "sequence": 1793375614823
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "0776895f-b5a4-49ac-8913-1592e12d2aa4",
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
  "last_heartbeat_at": "2026-10-30T15:53:34.837097Z",
  "last_location_at": "2026-10-30T15:53:34.837097Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "fb4f79ed-33bc-45f5-a670-d20b82adf01e",
      "short_number": 32,
      "pickup_at": "2026-10-30T18:53:32Z",
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

`POST /api/driver/v1/preorders/fb4f79ed-33bc-45f5-a670-d20b82adf01e/reserve` → **200**

```json
{
  "command_id": "1e7f8512-d436-422c-a1b4-36293de27d24"
}
```

```json
{
  "id": "c07b8d2b-8517-441f-b507-cea311560f12",
  "state": "RESERVED",
  "order": {
    "order_id": "fb4f79ed-33bc-45f5-a670-d20b82adf01e",
    "short_number": 32,
    "pickup_at": "2026-10-30T18:53:32Z",
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
  "reserved_at": "2026-10-30T15:53:35.202771Z",
  "confirm_from": "2026-10-30T18:23:32Z",
  "confirm_until": "2026-10-30T18:33:32Z",
  "drop_until": "2026-10-30T17:53:32Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "c07b8d2b-8517-441f-b507-cea311560f12",
      "state": "RESERVED",
      "order": {
        "order_id": "fb4f79ed-33bc-45f5-a670-d20b82adf01e",
        "short_number": 32,
        "pickup_at": "2026-10-30T18:53:32Z",
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
      "reserved_at": "2026-10-30T15:53:35.202771Z",
      "confirm_from": "2026-10-30T18:23:32Z",
      "confirm_until": "2026-10-30T18:33:32Z",
      "drop_until": "2026-10-30T17:53:32Z"
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
      "id": "c07b8d2b-8517-441f-b507-cea311560f12",
      "state": "RESERVED",
      "order": {
        "order_id": "fb4f79ed-33bc-45f5-a670-d20b82adf01e",
        "short_number": 32,
        "pickup_at": "2026-10-30T18:53:32Z",
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
      "reserved_at": "2026-10-30T15:53:35.202771Z",
      "confirm_from": "2026-10-30T18:23:32Z",
      "confirm_until": "2026-10-30T18:33:32Z",
      "drop_until": "2026-10-30T17:53:32Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/c07b8d2b-8517-441f-b507-cea311560f12/confirm` → **409**

```json
{
  "command_id": "ad0cccc0-7cdb-43f9-88a4-f24f119864dd"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/c07b8d2b-8517-441f-b507-cea311560f12/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "72dec49c-a9db-4925-bb50-4d5596013a74"
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
  "session_id": "8ebf103f-7aa9-4df5-8fa9-a2430321044e",
  "subject": {
    "type": "STAFF",
    "id": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiODZhYmMzMi1mMmUyLTRjM2MtOTk2Ny05N2JmYzljZTdjZTIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzY1MTYsImlhdCI6MTc5MzM3NTYxNiwianRpIjoiMjkyMGY3NWQtZjg0MS00NmVkLWFiMTYtY2YwMjgwYmRkYjE4Iiwic2lkIjoiOGViZjEwM2YtN2FhOS00ZGY1LThmYTktYTI0MzAzMjEwNDRlIn0.CheDiLmZbLXt1eiZmN-5yPSdDRsN04qKvFiHw5GXChk",
  "access_expires_at": "2026-10-30T16:08:36.109906813Z",
  "refresh_token": "Cznyl8Emns6PBpdbxeQ2j4PYef1Kt0gvG7G9gmT5Dag",
  "refresh_expires_at": "2026-10-31T03:53:36.109550246Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/fb4f79ed-33bc-45f5-a670-d20b82adf01e` → **200**

```json
{
  "id": "fb4f79ed-33bc-45f5-a670-d20b82adf01e",
  "short_number": 32,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "5a3570f1-704f-445d-b8d7-795fc15737e3",
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
  "created_at": "2026-10-30T15:53:34.081948Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-30T18:53:32Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "c07b8d2b-8517-441f-b507-cea311560f12",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-30T15:53:35.202771Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/fb4f79ed-33bc-45f5-a670-d20b82adf01e/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-30T15:53:34.082762Z",
      "actor": {
        "type": "CLIENT",
        "id": "5a3570f1-704f-445d-b8d7-795fc15737e3",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "fb4f79ed-33bc-45f5-a670-d20b82adf01e",
        "preorder": true,
        "quote_id": "19e208d6-c0ee-41f7-964a-3177b567821c",
        "pickup_at": "2026-10-30T18:53:32Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "63fc6846-7f0b-49e4-8f18-70be6574dad6"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-30T15:53:35.203573Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "fb4f79ed-33bc-45f5-a670-d20b82adf01e",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "c07b8d2b-8517-441f-b507-cea311560f12"
      },
      "correlation_id": "f9ca042c-e48b-4ebc-8ceb-1004dce2c828"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order fb4f79ed-33bc-45f5-a670-d20b82adf01e, reservation c07b8d2b-8517-441f-b507-cea311560f12.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-16750"
}
```

```json
{
  "challenge_id": "21a4d507-3337-4a58-bd8a-a8b186f43ec1",
  "expires_at": "2026-10-30T15:58:36.661994488Z",
  "resend_available_at": "2026-10-30T15:53:37.661994488Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "445122",
  "sent_at": "2026-10-30T15:53:36.663669529Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "21a4d507-3337-4a58-bd8a-a8b186f43ec1",
  "code": "445122",
  "device_ref": "sandbox-16750"
}
```

```json
{
  "session_id": "f07f0e2f-cbe1-4759-8c03-f20355f469c1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NjUxNiwiaWF0IjoxNzkzMzc1NjE2LCJqdGkiOiJjNjBlYzkwYy1jZmJmLTQ5NTgtYTZhZC1mOGNjNzlmODBkZTAiLCJzaWQiOiJmMDdmMGUyZi1jYmUxLTQ3NTktOGMwMy1mMjAzNTVmNDY5YzEifQ.ulpYVoqUp427fgrv4fzFB2skdt8lMav1WHzmz1utSOg",
  "access_expires_at": "2026-10-30T16:08:36.86043426Z",
  "refresh_token": "NSQVGgDnX5hu6iLtfe_Z5aRxg-QFuTX74QGAF6zqYMY",
  "refresh_expires_at": "2026-11-29T15:53:36.860097513Z",
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
  "command_id": "90ce0d91-3eef-4bb4-bbcb-80e60e088900",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:53:37Z",
    "sequence": 1793375617227
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9c924628-3ab5-4096-b85a-42a33f918f3a",
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
  "last_heartbeat_at": "2026-10-30T15:53:37.240916Z",
  "last_location_at": "2026-10-30T15:53:37.240916Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678403690",
  "device_ref": "sandbox-29293"
}
```

```json
{
  "challenge_id": "cb1e016f-d1cd-4102-acb9-a2308fd0076d",
  "expires_at": "2026-10-30T15:58:37.424383156Z",
  "resend_available_at": "2026-10-30T15:53:38.424383156Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380678403690` → **200**

```json
{
  "phone": "+380678403690",
  "audience": "CLIENT",
  "code": "116813",
  "sent_at": "2026-10-30T15:53:37.426386562Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cb1e016f-d1cd-4102-acb9-a2308fd0076d",
  "code": "116813",
  "device_ref": "sandbox-29293"
}
```

```json
{
  "session_id": "cd26b677-73bb-4b24-8544-a439d1f8b411",
  "subject": {
    "type": "CLIENT",
    "id": "41519d5b-39de-4fd0-9067-cb8f0a116e4e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MTUxOWQ1Yi0zOWRlLTRmZDAtOTA2Ny1jYjhmMGExMTZlNGUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc2NTE3LCJpYXQiOjE3OTMzNzU2MTcsImp0aSI6IjhiZjNkNDA4LWRiMmUtNDk1NS1hMjA5LWE1NGMxZjVlYzBiZCIsInNpZCI6ImNkMjZiNjc3LTczYmItNGIyNC04NTQ0LWE0MzlkMWY4YjQxMSJ9.OgFR-UwqNwbrRrffCSs_kQEuvNBFs4DADEHePqB_EFI",
  "access_expires_at": "2026-10-30T16:08:37.630084918Z",
  "refresh_token": "41s6zq9gP30qn2EXlkfzyjaXpTk34_xiHgjubZpej5I",
  "refresh_expires_at": "2026-11-29T15:53:37.629744796Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "695a01b9-df22-464e-87bf-4f7e5752d07e",
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
  "id": "fe52e095-7319-42ae-b01f-a18b4f2f9479",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:58:37.816428Z",
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
  "command_id": "7944be79-5955-475c-9278-a65ec862ad1a",
  "quote_id": "fe52e095-7319-42ae-b01f-a18b4f2f9479",
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
  "id": "9d99eaa1-8e8f-4a6f-97cd-1681e81a0724",
  "short_number": 33,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "41519d5b-39de-4fd0-9067-cb8f0a116e4e",
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
  "created_at": "2026-10-30T15:53:38.00477Z",
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
    "id": "8a525efa-832a-4d81-bd09-2359761d0634",
    "order_id": "9d99eaa1-8e8f-4a6f-97cd-1681e81a0724",
    "expires_at": "2026-10-30T15:53:53.006553Z",
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

`POST /api/driver/v1/offers/8a525efa-832a-4d81-bd09-2359761d0634/accept` → **200**

```json
{
  "command_id": "c7947a9f-d0bb-4a87-aa94-2053e8d97120"
}
```

```json
{
  "id": "f1ab626d-ca8a-4935-a192-2c732d9b1af8",
  "order_id": "9d99eaa1-8e8f-4a6f-97cd-1681e81a0724",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "488cbace-f5b2-49dc-9e0d-4fded8cb422c",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "488cbace-f5b2-49dc-9e0d-4fded8cb422c",
  "order_id": "9d99eaa1-8e8f-4a6f-97cd-1681e81a0724",
  "assignment_id": "f1ab626d-ca8a-4935-a192-2c732d9b1af8",
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

`POST /api/driver/v1/work-sessions/9c924628-3ab5-4096-b85a-42a33f918f3a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:53:38Z",
    "sequence": 1793375618734
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9c924628-3ab5-4096-b85a-42a33f918f3a",
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
  "last_heartbeat_at": "2026-10-30T15:53:38.748666Z",
  "last_location_at": "2026-10-30T15:53:38.748666Z",
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
  "id": "488cbace-f5b2-49dc-9e0d-4fded8cb422c",
  "order_id": "9d99eaa1-8e8f-4a6f-97cd-1681e81a0724",
  "assignment_id": "f1ab626d-ca8a-4935-a192-2c732d9b1af8",
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

`POST /api/driver/v1/trips/488cbace-f5b2-49dc-9e0d-4fded8cb422c/arrive` → **200**

```json
{
  "command_id": "afdb851f-a195-4429-b3bd-16fe69884d43",
  "expected_version": 0
}
```

```json
{
  "id": "488cbace-f5b2-49dc-9e0d-4fded8cb422c",
  "order_id": "9d99eaa1-8e8f-4a6f-97cd-1681e81a0724",
  "assignment_id": "f1ab626d-ca8a-4935-a192-2c732d9b1af8",
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
  "arrived_at": "2026-10-30T15:53:39.103679Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/488cbace-f5b2-49dc-9e0d-4fded8cb422c/start` → **200**

```json
{
  "command_id": "6b86d3dd-ba42-445e-ab26-b6faf48263ce",
  "expected_version": 1
}
```

```json
{
  "id": "488cbace-f5b2-49dc-9e0d-4fded8cb422c",
  "order_id": "9d99eaa1-8e8f-4a6f-97cd-1681e81a0724",
  "assignment_id": "f1ab626d-ca8a-4935-a192-2c732d9b1af8",
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
  "arrived_at": "2026-10-30T15:53:39.103679Z",
  "started_at": "2026-10-30T15:53:39.295018Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

(the car drives 48 s to the next point)

`POST /api/driver/v1/work-sessions/9c924628-3ab5-4096-b85a-42a33f918f3a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:54:27Z",
    "sequence": 1793375667486
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9c924628-3ab5-4096-b85a-42a33f918f3a",
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
  "last_heartbeat_at": "2026-10-30T15:54:27.49963Z",
  "last_location_at": "2026-10-30T15:54:27.49963Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/488cbace-f5b2-49dc-9e0d-4fded8cb422c/complete` → **200**

```json
{
  "command_id": "04ea199c-40ad-4189-a230-eff8f917341d",
  "expected_version": 2,
  "reported_at": "2026-10-30T15:54:27Z",
  "cash_received": true
}
```

```json
{
  "id": "488cbace-f5b2-49dc-9e0d-4fded8cb422c",
  "order_id": "9d99eaa1-8e8f-4a6f-97cd-1681e81a0724",
  "assignment_id": "f1ab626d-ca8a-4935-a192-2c732d9b1af8",
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
  "arrived_at": "2026-10-30T15:53:39.103679Z",
  "started_at": "2026-10-30T15:53:39.295018Z",
  "completed_at": "2026-10-30T15:54:27.686482Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/9d99eaa1-8e8f-4a6f-97cd-1681e81a0724/rating` → **200**

```json
{
  "command_id": "3bae3115-951d-438e-a8ae-26474bf173f2",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "9d99eaa1-8e8f-4a6f-97cd-1681e81a0724",
  "score": 5,
  "created_at": "2026-10-30T15:54:27.876855521Z"
}
```

`POST /api/driver/v1/orders/9d99eaa1-8e8f-4a6f-97cd-1681e81a0724/rating` → **200**

```json
{
  "command_id": "7c1c40a9-6e3b-4d45-92ad-b5dbdd9d01f1",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "9d99eaa1-8e8f-4a6f-97cd-1681e81a0724",
  "score": 4,
  "created_at": "2026-10-30T15:54:28.057723731Z"
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
  "session_id": "07e4dd14-2513-4071-98df-d70a02a5fb46",
  "subject": {
    "type": "STAFF",
    "id": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiODZhYmMzMi1mMmUyLTRjM2MtOTk2Ny05N2JmYzljZTdjZTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzY1NjgsImlhdCI6MTc5MzM3NTY2OCwianRpIjoiM2Q3YjE5Y2YtODUyMC00MDgyLWIyMDEtZjM0MjAyNTlmMzU5Iiwic2lkIjoiMDdlNGRkMTQtMjUxMy00MDcxLTk4ZGYtZDcwYTAyYTVmYjQ2In0.9tVQ88b-y1Q8o1YJUiukX-Vc05vRlW5y2LFPlg1CQJs",
  "access_expires_at": "2026-10-30T16:09:28.623563443Z",
  "refresh_token": "0lbmCJFH_4OJ5pJ8wqiep2OZVlZ7JfG2vE2NFiORPFw",
  "refresh_expires_at": "2026-10-31T03:54:28.623233486Z",
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
  "session_id": "ea45683f-1af7-431a-aa7d-584fdd968cf1",
  "subject": {
    "type": "STAFF",
    "id": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiODZhYmMzMi1mMmUyLTRjM2MtOTk2Ny05N2JmYzljZTdjZTIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzY1NjgsImlhdCI6MTc5MzM3NTY2OCwianRpIjoiOGI3YTE0YzYtNmU4YS00N2RhLWI3MWUtNDViNzRiNzJiZWU2Iiwic2lkIjoiZWE0NTY4M2YtMWFmNy00MzFhLWFhN2QtNTg0ZmRkOTY4Y2YxIn0.BPxynzqP1Vz_L4-itX0rtq3uGWFB_5vHxUCZxItDp8s",
  "access_expires_at": "2026-10-30T16:09:28.992359693Z",
  "refresh_token": "uEUeENx8bBukPGjY-3GkrCGUFKbNHAGmHdBlKXjSIP4",
  "refresh_expires_at": "2026-10-31T03:54:28.992030997Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/9d99eaa1-8e8f-4a6f-97cd-1681e81a0724/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "9d99eaa1-8e8f-4a6f-97cd-1681e81a0724",
      "author_type": "RIDER",
      "author_id": "41519d5b-39de-4fd0-9067-cb8f0a116e4e",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-30T15:54:27.876856Z"
    },
    {
      "order_id": "9d99eaa1-8e8f-4a6f-97cd-1681e81a0724",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "41519d5b-39de-4fd0-9067-cb8f0a116e4e",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-30T15:54:28.057724Z"
    }
  ]
}
```

Done: ratings for order 9d99eaa1-8e8f-4a6f-97cd-1681e81a0724.

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
  "session_id": "97bdaba5-a517-4b60-84f0-d797bacd1e6a",
  "subject": {
    "type": "STAFF",
    "id": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiODZhYmMzMi1mMmUyLTRjM2MtOTk2Ny05N2JmYzljZTdjZTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzY1NjksImlhdCI6MTc5MzM3NTY2OSwianRpIjoiMzI2NTg5ZDktMGRmNC00ZTBjLWJjZTctYmJhZWYwYmVmZGJmIiwic2lkIjoiOTdiZGFiYTUtYTUxNy00YjYwLTg0ZjAtZDc5N2JhY2QxZTZhIn0.b57rsKMax5Wvd1ECoyKQe_Vf48cDGuJvK7rgAcgYmVM",
  "access_expires_at": "2026-10-30T16:09:29.554667142Z",
  "refresh_token": "jCQEavHeG7mO0WhHNH58Juf5eYssbr8aflMIH3YyGvg",
  "refresh_expires_at": "2026-10-31T03:54:29.554327119Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "50b686cc-7351-4961-a1d0-6d7a15b39a92",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "d969fa7e-83f4-4713-8908-c900d7ccda75",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T15:54:29.74108Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/d969fa7e-83f4-4713-8908-c900d7ccda75` → **200**

```json
{
  "id": "d969fa7e-83f4-4713-8908-c900d7ccda75",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T15:54:29.74108Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/d969fa7e-83f4-4713-8908-c900d7ccda75` → **200**

```json
{
  "id": "d969fa7e-83f4-4713-8908-c900d7ccda75",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T15:54:29.74108Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/d969fa7e-83f4-4713-8908-c900d7ccda75` → **200**

```json
{
  "id": "d969fa7e-83f4-4713-8908-c900d7ccda75",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-30.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-30T15:54:29.74108Z",
  "ready_at": "2026-10-30T15:54:32.026859Z",
  "expires_at": "2026-10-31T15:54:32.026859Z"
}
```

`GET /api/admin/v1/reports/exports/d969fa7e-83f4-4713-8908-c900d7ccda75/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-30,31,11,20,0,0,26,5,0,28,2,0,1,7,1,12
total,31,11,20,0,0,26,5,0,28,2,0,1,7,1,12
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "6fbeeb4b-17d4-4929-a32c-f9441f06654f",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "767f80fa-28eb-41e5-b6c9-c5271c044259",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T15:54:32.476208Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/767f80fa-28eb-41e5-b6c9-c5271c044259` → **200**

```json
{
  "id": "767f80fa-28eb-41e5-b6c9-c5271c044259",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T15:54:32.476208Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/767f80fa-28eb-41e5-b6c9-c5271c044259` → **200**

```json
{
  "id": "767f80fa-28eb-41e5-b6c9-c5271c044259",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T15:54:32.476208Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/767f80fa-28eb-41e5-b6c9-c5271c044259` → **200**

```json
{
  "id": "767f80fa-28eb-41e5-b6c9-c5271c044259",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T15:54:32.476208Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/767f80fa-28eb-41e5-b6c9-c5271c044259` → **200**

```json
{
  "id": "767f80fa-28eb-41e5-b6c9-c5271c044259",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T15:54:32.476208Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/767f80fa-28eb-41e5-b6c9-c5271c044259` → **200**

```json
{
  "id": "767f80fa-28eb-41e5-b6c9-c5271c044259",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-30.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-30T15:54:32.476208Z",
  "ready_at": "2026-10-30T15:54:37.032449Z",
  "expires_at": "2026-10-31T15:54:37.032449Z"
}
```

`GET /api/admin/v1/reports/exports/767f80fa-28eb-41e5-b6c9-c5271c044259/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-30,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
total,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/cd660087-0945-4f7e-9976-f7c631ed5427` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/cd660087-0945-4f7e-9976-f7c631ed5427",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "83ac2be5-6192-476f-8a6a-66cfe0637b49"
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
  "session_id": "86a51fd9-3385-4acc-8a5a-2f0b35cc0903",
  "subject": {
    "type": "STAFF",
    "id": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiODZhYmMzMi1mMmUyLTRjM2MtOTk2Ny05N2JmYzljZTdjZTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzY1NzcsImlhdCI6MTc5MzM3NTY3NywianRpIjoiNzEwYzJlM2MtZGU1Ni00NDA2LWFjOGQtNmYzMjIwMGJiMmNmIiwic2lkIjoiODZhNTFmZDktMzM4NS00YWNjLThhNWEtMmYwYjM1Y2MwOTAzIn0.7l6pkk3zlAMOQA_X-TBjGQGDWO1I0MY1CG2LC2Npe-Y",
  "access_expires_at": "2026-10-30T16:09:37.954792942Z",
  "refresh_token": "P0X6vYazPLArLaMZCWwO7EcOOUDeg6FyK2isFWGh3lU",
  "refresh_expires_at": "2026-10-31T03:54:37.954454262Z",
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
  "command_id": "a138532e-2e43-44b0-a34e-b094637911f0",
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
  "changed_by": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2",
  "reason": "Sandbox retention boundary",
  "changed_at": "2026-10-30T15:54:38.31426324Z"
}
```

`POST /sandbox/v1/retention/fixtures/bc270b71-4b60-41cb-a25f-4e1aca244d14` → **200**

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

`GET /sandbox/v1/retention/fixtures/bc270b71-4b60-41cb-a25f-4e1aca244d14` → **200**

```json
{
  "old_done": 0,
  "recent_done": 1,
  "failed": 1
}
```

Old DONE event removed; recent DONE and old FAILED events retained. Policy and synthetic fixtures restored on exit.

`DELETE /sandbox/v1/retention/fixtures/bc270b71-4b60-41cb-a25f-4e1aca244d14` → **204**

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
  "changed_by": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2",
  "reason": "Sandbox retention boundary",
  "changed_at": "2026-10-30T15:54:38.314263Z"
}
```

`PUT /api/admin/v1/retention` → **200**

```json
{
  "command_id": "f8e54537-ecc3-444e-a533-45c89de3b9b1",
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
  "changed_by": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2",
  "reason": "Restore policy after retention sandbox",
  "changed_at": "2026-10-30T15:54:38.774302428Z"
}
```

# Scenario: risk-flag

## The driver starts a new shift in Kyiv

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-4259"
}
```

```json
{
  "challenge_id": "2a74354d-362e-419c-a6b6-a8dec6ec9feb",
  "expires_at": "2026-10-30T15:59:38.956943671Z",
  "resend_available_at": "2026-10-30T15:54:39.956943671Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "942609",
  "sent_at": "2026-10-30T15:54:38.95930581Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2a74354d-362e-419c-a6b6-a8dec6ec9feb",
  "code": "942609",
  "device_ref": "sandbox-4259"
}
```

```json
{
  "session_id": "8a10b2d3-88f5-43e7-a62f-c93f5283be28",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NjU3OSwiaWF0IjoxNzkzMzc1Njc5LCJqdGkiOiJkNmE5YjU5Mi0zMDFhLTQ1ZmYtYmZkOS0xNDZhOTY0Y2EzY2UiLCJzaWQiOiI4YTEwYjJkMy04OGY1LTQzZTctYTYyZi1jOTNmNTI4M2JlMjgifQ.-_lL5HmZex_FRWZz9Z-0MGAXxo6Ln8YILtseHIozT_8",
  "access_expires_at": "2026-10-30T16:09:39.154135054Z",
  "refresh_token": "BHq-D18GrJ11eKNEajE8k6lvfGWffMWvNW0h0pWF6lw",
  "refresh_expires_at": "2026-11-29T15:54:39.153798698Z",
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
  "command_id": "c9fcdeda-1f99-49e0-a26f-26b3800f2fc8",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:54:39Z",
    "sequence": 1793375679701
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "da6f7a85-744c-4c59-9bec-bbb529f84512",
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
  "last_heartbeat_at": "2026-10-30T15:54:39.714478Z",
  "last_location_at": "2026-10-30T15:54:39.714478Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "83004df0-27fd-43af-94df-c3e84f1ccc32",
  "points": [
    {
      "sequence": 1793375681894,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-30T15:53:41Z"
    },
    {
      "sequence": 1793375681900,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-30T15:54:41Z"
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
  "session_id": "52d6c7f5-decf-4d3f-b826-54c1ed80e17c",
  "subject": {
    "type": "STAFF",
    "id": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiODZhYmMzMi1mMmUyLTRjM2MtOTk2Ny05N2JmYzljZTdjZTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzY1ODIsImlhdCI6MTc5MzM3NTY4MiwianRpIjoiZTFmNWVhN2EtMzk0OC00YTE2LTk3NDAtZTk1OGRlY2U4MDgwIiwic2lkIjoiNTJkNmM3ZjUtZGVjZi00ZDNmLWI4MjYtNTRjMWVkODBlMTdjIn0.5eHGknSwbJl34sfujRHHVjAMD9BfBVp3tqOvtsJUpmE",
  "access_expires_at": "2026-10-30T16:09:42.306292586Z",
  "refresh_token": "dBNSEPOs5od-QWW7yYMQhbZEWQBdSnLsHShNG9P9_K0",
  "refresh_expires_at": "2026-10-31T03:54:42.305951023Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "e01157e7-50af-453e-9fd8-285131463810",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-30T15:54:41Z",
        "track_point_id": "816e8cc9-e560-4e31-a121-1df012cae51a",
        "work_session_id": "da6f7a85-744c-4c59-9bec-bbb529f84512"
      },
      "raised_by": null,
      "raised_at": "2026-10-30T15:54:41Z",
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

`POST /api/admin/v1/driver-risk-flags/e01157e7-50af-453e-9fd8-285131463810/confirm` → **200**

```json
{
  "command_id": "8457b70d-a1f4-470e-a9b9-d11b9e9ad439",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "e01157e7-50af-453e-9fd8-285131463810",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-30T15:54:41Z",
    "track_point_id": "816e8cc9-e560-4e31-a121-1df012cae51a",
    "work_session_id": "da6f7a85-744c-4c59-9bec-bbb529f84512"
  },
  "raised_by": null,
  "raised_at": "2026-10-30T15:54:41Z",
  "reason": null,
  "reviewed_by": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2",
  "reviewed_at": "2026-10-30T15:54:42.864414Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/e01157e7-50af-453e-9fd8-285131463810/dismiss` → **409**

```json
{
  "command_id": "45908e45-c7a6-4aae-9501-d028038f7153",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/e01157e7-50af-453e-9fd8-285131463810/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "324b7827-ba84-4401-8493-9aa6f9475a81"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "2a21b465-ea75-4c62-ad1f-cd6b7477b6a7",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "aae73fa5-1517-4e4c-b1b4-67af2851521b",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2",
  "raised_at": "2026-10-30T15:54:43.243223Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/aae73fa5-1517-4e4c-b1b4-67af2851521b/dismiss` → **200**

```json
{
  "command_id": "70aacafe-dfee-4ab8-8bec-1334209a3ba7",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "aae73fa5-1517-4e4c-b1b4-67af2851521b",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2",
  "raised_at": "2026-10-30T15:54:43.243223Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2",
  "reviewed_at": "2026-10-30T15:54:43.437007Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "5b6991b2-2eac-4f02-be87-fe0554d11b89",
  "expected_version": 12,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "e01157e7-50af-453e-9fd8-285131463810"
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
      "actor_id": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T15:54:43.626562Z"
    }
  ],
  "duplicates": []
}
```

Done: flag e01157e7-50af-453e-9fd8-285131463810 confirmed, suspension named it, driver reinstated.

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
  "session_id": "dee82007-756b-4b8b-8910-0d318db90848",
  "subject": {
    "type": "STAFF",
    "id": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiODZhYmMzMi1mMmUyLTRjM2MtOTk2Ny05N2JmYzljZTdjZTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzY1ODQsImlhdCI6MTc5MzM3NTY4NCwianRpIjoiYzViNjQ2ZTAtNmUxZS00ZDYzLWIxNDUtZThlYjVjM2FlMWEyIiwic2lkIjoiZGVlODIwMDctNzU2Yi00YjhiLTg5MTAtMGQzMThkYjkwODQ4In0.7rRmotu_NT3-0W2Y7FChuvaDJKnacrQDp99KBsuiC7w",
  "access_expires_at": "2026-10-30T16:09:44.191078644Z",
  "refresh_token": "OWtcynFazWsEE0wMsyeABMPnvfPgczan6YYpUNRuKE0",
  "refresh_expires_at": "2026-10-31T03:54:44.190760615Z",
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
      "actor_id": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T15:54:43.626562Z"
    }
  ],
  "duplicates": []
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "99ecdc60-30e4-45c5-be80-b754efb648d5",
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
  "session_id": "da6f7a85-744c-4c59-9bec-bbb529f84512",
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
  "last_heartbeat_at": "2026-10-30T15:54:39.714478Z",
  "last_location_at": "2026-10-30T15:54:39.714478Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/da6f7a85-744c-4c59-9bec-bbb529f84512/close` → **200**

```json
{
  "command_id": "a1cc2417-460c-4530-bee6-b9df3ee41ef3",
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
  "session_id": "6163a03a-c912-4434-a002-5bb6db013a19",
  "subject": {
    "type": "STAFF",
    "id": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiODZhYmMzMi1mMmUyLTRjM2MtOTk2Ny05N2JmYzljZTdjZTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzY1ODUsImlhdCI6MTc5MzM3NTY4NSwianRpIjoiODFhMmZiODgtNmUzNy00ZjUzLWJkMDQtYzFlNWUzODM4NTU4Iiwic2lkIjoiNjE2M2EwM2EtYzkxMi00NDM0LWEwMDItNWJiNmRiMDEzYTE5In0.9K8AsDd8aC7PBgVY4Vi8scU4sgmGfgK3OXLGX1lyCwo",
  "access_expires_at": "2026-10-30T16:09:45.285023885Z",
  "refresh_token": "jWg-8VKpNbrHQZB6NXAVpiRaKwib_oKp4uaw4Xv7VB8",
  "refresh_expires_at": "2026-10-31T03:54:45.284707158Z",
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
  "command_id": "4a75d7c3-37ff-4e34-9b1b-19328a79507a",
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
  "changed_by": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T15:54:45.644767Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "4a75d7c3-37ff-4e34-9b1b-19328a79507a",
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
  "changed_by": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T15:54:45.644767Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48195356153",
  "device_ref": "sandbox-30177"
}
```

```json
{
  "challenge_id": "ea97fbd9-a825-4efd-a25a-a9299f101fce",
  "expires_at": "2026-10-30T15:59:46.01828951Z",
  "resend_available_at": "2026-10-30T15:54:47.01828951Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48195356153` → **200**

```json
{
  "phone": "+48195356153",
  "audience": "CLIENT",
  "code": "585436",
  "sent_at": "2026-10-30T15:54:46.020121782Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ea97fbd9-a825-4efd-a25a-a9299f101fce",
  "code": "585436",
  "device_ref": "sandbox-30177"
}
```

```json
{
  "session_id": "d05e7878-bf50-472f-bd0e-78cd0bbf7bdf",
  "subject": {
    "type": "CLIENT",
    "id": "7101acf7-a5b7-4fb1-8e3b-39b920469647"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MTAxYWNmNy1hNWI3LTRmYjEtOGUzYi0zOWI5MjA0Njk2NDciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc2NTg2LCJpYXQiOjE3OTMzNzU2ODYsImp0aSI6IjJmZDlmNzIzLTk4YjEtNGU5Yy05OTJlLTg3ZDNlZTg5MTUwZSIsInNpZCI6ImQwNWU3ODc4LWJmNTAtNDcyZi1iZDBlLTc4Y2QwYmJmN2JkZiJ9.izUO2vWo9ks2p97jKXRrORlcnyxBl2noNLfAwid1JYs",
  "access_expires_at": "2026-10-30T16:09:46.215771615Z",
  "refresh_token": "7VPY1D8xZNLr3aJwd-WbXynDiyElw3otkeAXanQO0lc",
  "refresh_expires_at": "2026-11-29T15:54:46.215402018Z",
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
  "correlation_id": "e200788f-1444-49bc-9088-6c955264b10d"
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
  "device_ref": "sandbox-12519"
}
```

```json
{
  "challenge_id": "a92ab79e-601b-44e7-b2fd-5a90f55266ce",
  "expires_at": "2026-10-30T15:59:46.744538167Z",
  "resend_available_at": "2026-10-30T15:54:47.744538167Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "935197",
  "sent_at": "2026-10-30T15:54:46.746823851Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a92ab79e-601b-44e7-b2fd-5a90f55266ce",
  "code": "935197",
  "device_ref": "sandbox-12519"
}
```

```json
{
  "session_id": "3f90181a-e9de-45ae-a17f-4bce4cacd85e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NjU4NiwiaWF0IjoxNzkzMzc1Njg2LCJqdGkiOiI5MTAxODQyNy0xMTRiLTQ5ZmEtYjI4Ni02OGRhOTM4ODMwNzAiLCJzaWQiOiIzZjkwMTgxYS1lOWRlLTQ1YWUtYTE3Zi00YmNlNGNhY2Q4NWUifQ.YEDm_3mHPDjg4v3umBlhLK2kyYyJ1LddaxXsZNwOvvs",
  "access_expires_at": "2026-10-30T16:09:46.941510448Z",
  "refresh_token": "AcV9lLZhMqRAlpS7VKUhrTE2xrg281V1STEFIDq4Isc",
  "refresh_expires_at": "2026-11-29T15:54:46.94108353Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "0776895f-b5a4-49ac-8913-1592e12d2aa4",
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
  "last_heartbeat_at": "2026-10-30T15:53:34.837097Z",
  "last_location_at": "2026-10-30T15:53:34.837097Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/0776895f-b5a4-49ac-8913-1592e12d2aa4/handover` → **200**

```json
{
  "command_id": "cd287fd8-6f37-44d7-9682-b97d6a16ca31",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "0776895f-b5a4-49ac-8913-1592e12d2aa4",
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
  "last_heartbeat_at": "2026-10-30T15:53:34.837097Z",
  "last_location_at": "2026-10-30T15:53:34.837097Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/0776895f-b5a4-49ac-8913-1592e12d2aa4/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:54:47Z",
    "sequence": 1793375687492
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "0776895f-b5a4-49ac-8913-1592e12d2aa4",
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
  "last_heartbeat_at": "2026-10-30T15:54:47.505976Z",
  "last_location_at": "2026-10-30T15:54:47.505976Z",
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
  "session_id": "0776895f-b5a4-49ac-8913-1592e12d2aa4",
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
  "last_heartbeat_at": "2026-10-30T15:54:47.505976Z",
  "last_location_at": "2026-10-30T15:54:47.505976Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/0776895f-b5a4-49ac-8913-1592e12d2aa4/close` → **200**

```json
{
  "command_id": "7187e64d-770c-48bc-ae9f-3f4245974b45",
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
  "correlation_id": "e68c8ba8-a824-4cd9-af5d-6153e08cda17"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678425704",
  "device_ref": "sandbox-3035"
}
```

```json
{
  "challenge_id": "95999fe3-1f75-4beb-8639-893cb56f1389",
  "expires_at": "2026-10-30T15:59:48.409057488Z",
  "resend_available_at": "2026-10-30T15:54:49.409057488Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380678425704` → **200**

```json
{
  "phone": "+380678425704",
  "audience": "CLIENT",
  "code": "817955",
  "sent_at": "2026-10-30T15:54:48.411594777Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "95999fe3-1f75-4beb-8639-893cb56f1389",
  "code": "817955",
  "device_ref": "sandbox-3035"
}
```

```json
{
  "session_id": "2915ae5e-9914-463a-b923-e3fbe78c2c69",
  "subject": {
    "type": "CLIENT",
    "id": "78495ef5-b376-4d41-9f12-ec9b8feb35a8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ODQ5NWVmNS1iMzc2LTRkNDEtOWYxMi1lYzliOGZlYjM1YTgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc2NTg4LCJpYXQiOjE3OTMzNzU2ODgsImp0aSI6IjE3YjRkOTMwLTkwNGUtNDljOS1iNmJjLWRjOWM1Nzc0ZWY1NCIsInNpZCI6IjI5MTVhZTVlLTk5MTQtNDYzYS1iOTIzLWUzZmJlNzhjMmM2OSJ9.aSdIxcZ8UycRpHmZpfSgZ04iiDVwHi4I_6sIuyhvib8",
  "access_expires_at": "2026-10-30T16:09:48.619625636Z",
  "refresh_token": "kfaLLw6QGWsdEKDF33zgzwdcWWkZRT8Edve1c1fL3-4",
  "refresh_expires_at": "2026-11-29T15:54:48.619294748Z",
  "account_created": true
}
```

## The EICAR antivirus test file is refused by the antivirus

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "a21e3917-8446-463b-8524-e5a656fef481",
  "content_type": "application/pdf",
  "size_bytes": 86
}
```

```json
{
  "file_id": "9cd4bfbf-d8d8-4b1d-aac9-57737a8e35d0",
  "upload_path": "/api/rider/v1/uploads/9cd4bfbf-d8d8-4b1d-aac9-57737a8e35d0",
  "expires_at": "2026-10-30T16:09:48.812034003Z",
  "max_bytes": 86
}
```

`PUT /api/rider/v1/uploads/9cd4bfbf-d8d8-4b1d-aac9-57737a8e35d0` → **200**

```json
{
  "file_id": "9cd4bfbf-d8d8-4b1d-aac9-57737a8e35d0",
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
  "command_id": "798770f9-7897-420e-9de2-9dcbfe2af247",
  "content_type": "application/pdf",
  "size_bytes": 92
}
```

```json
{
  "file_id": "12a7f4cc-0062-4217-93f8-92f72dcaf59b",
  "upload_path": "/api/rider/v1/uploads/12a7f4cc-0062-4217-93f8-92f72dcaf59b",
  "expires_at": "2026-10-30T16:09:49.013675646Z",
  "max_bytes": 92
}
```

`PUT /api/rider/v1/uploads/12a7f4cc-0062-4217-93f8-92f72dcaf59b` → **200**

```json
{
  "file_id": "12a7f4cc-0062-4217-93f8-92f72dcaf59b",
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
  "command_id": "8af28b7c-4259-4ccf-a599-498412c8d98d",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "6165c8a5-6606-4407-92d4-b9d7f2855263",
  "upload_path": "/api/rider/v1/uploads/6165c8a5-6606-4407-92d4-b9d7f2855263",
  "expires_at": "2026-10-30T16:09:49.211982726Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/6165c8a5-6606-4407-92d4-b9d7f2855263` → **200**

```json
{
  "file_id": "6165c8a5-6606-4407-92d4-b9d7f2855263",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "a40f827d-1a64-4c74-af1e-a759c35e0431",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "6165c8a5-6606-4407-92d4-b9d7f2855263"
  ]
}
```

```json
{
  "id": "f9a7f8a8-fabd-4014-924b-3959685dec84",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "78495ef5-b376-4d41-9f12-ec9b8feb35a8",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T15:54:49.40703Z",
  "updated_at": "2026-10-30T15:54:49.40703Z",
  "respond_by": "2026-10-30T19:54:49.40703Z",
  "messages": [
    {
      "id": "12440a8e-3021-4548-ab20-d98cabc3e14a",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "78495ef5-b376-4d41-9f12-ec9b8feb35a8",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T15:54:49.407834Z",
      "attachments": [
        {
          "file_id": "6165c8a5-6606-4407-92d4-b9d7f2855263",
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
  "session_id": "3a57f359-d8e6-4eda-a53b-99afb670ff77",
  "subject": {
    "type": "STAFF",
    "id": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiODZhYmMzMi1mMmUyLTRjM2MtOTk2Ny05N2JmYzljZTdjZTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzY1ODksImlhdCI6MTc5MzM3NTY4OSwianRpIjoiZTI2Y2FjNGItMTI2Ni00OGJiLWFkYzYtY2ZjNjY3YjZkNDViIiwic2lkIjoiM2E1N2YzNTktZDhlNi00ZWRhLWE1M2ItOTlhZmI2NzBmZjc3In0.159VvRZmnGeMgvZ-ZClioZaTw9SkuxTXnVi741lh2Ls",
  "access_expires_at": "2026-10-30T16:09:49.799161013Z",
  "refresh_token": "4N6lxACiNpnWsXYVUIp2ADitS7EVbQ9cYoGSt4wjmfE",
  "refresh_expires_at": "2026-10-31T03:54:49.79879367Z",
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
  "session_id": "7685e193-9639-4ba2-a965-057ec5e871d0",
  "subject": {
    "type": "STAFF",
    "id": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiODZhYmMzMi1mMmUyLTRjM2MtOTk2Ny05N2JmYzljZTdjZTIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzY1OTAsImlhdCI6MTc5MzM3NTY5MCwianRpIjoiNGNlN2Q3MzgtNThmOC00ZTdmLWE5ODctNTA1Zjg1Mjg2MjkxIiwic2lkIjoiNzY4NWUxOTMtOTYzOS00YmEyLWE5NjUtMDU3ZWM1ZTg3MWQwIn0.rSPGCcjIGFHm_klhDnvjDVz90zBb6kExb7eOFYxAOew",
  "access_expires_at": "2026-10-30T16:09:50.166394588Z",
  "refresh_token": "ZSQ8xqmttoOsQ8hAAm88E6HVc26zaruyzB8zECxw8y0",
  "refresh_expires_at": "2026-10-31T03:54:50.16605707Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/f9a7f8a8-fabd-4014-924b-3959685dec84/attachments/6165c8a5-6606-4407-92d4-b9d7f2855263` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "c115844c-708b-494c-ae79-e87bd33fd54e",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "cf46f8f3-f074-48d6-aeb4-99279c7be442",
  "upload_path": "/api/operator/v1/uploads/cf46f8f3-f074-48d6-aeb4-99279c7be442",
  "expires_at": "2026-10-30T16:09:50.358177898Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/cf46f8f3-f074-48d6-aeb4-99279c7be442` → **200**

```json
{
  "file_id": "cf46f8f3-f074-48d6-aeb4-99279c7be442",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/f9a7f8a8-fabd-4014-924b-3959685dec84` → **200**

```json
{
  "id": "f9a7f8a8-fabd-4014-924b-3959685dec84",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "78495ef5-b376-4d41-9f12-ec9b8feb35a8",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T15:54:49.40703Z",
  "updated_at": "2026-10-30T15:54:49.40703Z",
  "respond_by": "2026-10-30T19:54:49.40703Z",
  "messages": [
    {
      "id": "12440a8e-3021-4548-ab20-d98cabc3e14a",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "78495ef5-b376-4d41-9f12-ec9b8feb35a8",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T15:54:49.407834Z",
      "attachments": [
        {
          "file_id": "6165c8a5-6606-4407-92d4-b9d7f2855263",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/f9a7f8a8-fabd-4014-924b-3959685dec84/comments` → **200**

```json
{
  "command_id": "1286a811-30df-4b37-8585-25085f58767a",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "cf46f8f3-f074-48d6-aeb4-99279c7be442"
  ]
}
```

```json
{
  "id": "f9a7f8a8-fabd-4014-924b-3959685dec84",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "78495ef5-b376-4d41-9f12-ec9b8feb35a8",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T15:54:49.40703Z",
  "updated_at": "2026-10-30T15:54:50.752957Z",
  "respond_by": "2026-10-30T19:54:49.40703Z",
  "messages": [
    {
      "id": "12440a8e-3021-4548-ab20-d98cabc3e14a",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "78495ef5-b376-4d41-9f12-ec9b8feb35a8",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T15:54:49.407834Z",
      "attachments": [
        {
          "file_id": "6165c8a5-6606-4407-92d4-b9d7f2855263",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "31d04308-7df3-4d9b-a382-4d4c7173be16",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T15:54:50.752574Z",
      "attachments": [
        {
          "file_id": "cf46f8f3-f074-48d6-aeb4-99279c7be442",
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

`GET /api/rider/v1/support/cases/f9a7f8a8-fabd-4014-924b-3959685dec84` → **200**

```json
{
  "id": "f9a7f8a8-fabd-4014-924b-3959685dec84",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "78495ef5-b376-4d41-9f12-ec9b8feb35a8",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T15:54:49.40703Z",
  "updated_at": "2026-10-30T15:54:50.752957Z",
  "respond_by": "2026-10-30T19:54:49.40703Z",
  "messages": [
    {
      "id": "12440a8e-3021-4548-ab20-d98cabc3e14a",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "78495ef5-b376-4d41-9f12-ec9b8feb35a8",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T15:54:49.407834Z",
      "attachments": [
        {
          "file_id": "6165c8a5-6606-4407-92d4-b9d7f2855263",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "31d04308-7df3-4d9b-a382-4d4c7173be16",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T15:54:50.752574Z",
      "attachments": [
        {
          "file_id": "cf46f8f3-f074-48d6-aeb4-99279c7be442",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/f9a7f8a8-fabd-4014-924b-3959685dec84/attachments/cf46f8f3-f074-48d6-aeb4-99279c7be442` → **200**

Done: support case f9a7f8a8-fabd-4014-924b-3959685dec84, rider attachment 6165c8a5-6606-4407-92d4-b9d7f2855263, operator attachment cf46f8f3-f074-48d6-aeb4-99279c7be442.

# Scenario: switch-to-cash

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380730951170",
  "device_ref": "sandbox-24483"
}
```

```json
{
  "challenge_id": "0ebdf2e1-e2f4-45e9-a157-09430a7d27aa",
  "expires_at": "2026-10-30T15:59:51.142471684Z",
  "resend_available_at": "2026-10-30T15:54:52.142471684Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380730951170` → **200**

```json
{
  "phone": "+380730951170",
  "audience": "CLIENT",
  "code": "157987",
  "sent_at": "2026-10-30T15:54:51.143970862Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0ebdf2e1-e2f4-45e9-a157-09430a7d27aa",
  "code": "157987",
  "device_ref": "sandbox-24483"
}
```

```json
{
  "session_id": "d9634125-a260-46b9-a372-774d53fa8978",
  "subject": {
    "type": "CLIENT",
    "id": "a369a70f-4ed4-494b-91cd-d477d33f885f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMzY5YTcwZi00ZWQ0LTQ5NGItOTFjZC1kNDc3ZDMzZjg4NWYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc2NTkxLCJpYXQiOjE3OTMzNzU2OTEsImp0aSI6ImNmZTg5MDkxLTIxYmQtNGE1Ni1iNjZkLWZmNjBkMzEwZDUzOSIsInNpZCI6ImQ5NjM0MTI1LWEyNjAtNDZiOS1hMzcyLTc3NGQ1M2ZhODk3OCJ9.koqoEzSI3ROwN9mzvizCz2u-cYW7YPmdk5AMn7O_iRo",
  "access_expires_at": "2026-10-30T16:09:51.338239142Z",
  "refresh_token": "3o9wOwlJp4eFzwAP3u90tfy06Z5NFSzpLH9ZgvFKcCo",
  "refresh_expires_at": "2026-11-29T15:54:51.337921493Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "4e2c6606-49d1-496d-b7b5-489da1ab2f6c",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "3f17b7e8-5cda-4145-b449-9f6f800c7daa",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-3f17b7e8-5cda-4145-b449-9f6f800c7daa",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "f7ca115eb578a4f63a9a94a538390a18",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=3f17b7e8-5cda-4145-b449-9f6f800c7daa",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380730951170"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=3f17b7e8-5cda-4145-b449-9f6f800c7daa",
  "expires_at": "2026-10-30T16:24:51.517144Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/3f17b7e8-5cda-4145-b449-9f6f800c7daa` → **200**

```json
{
  "id": "3f17b7e8-5cda-4145-b449-9f6f800c7daa",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T16:24:51.517144Z",
  "card": {
    "id": "9d850ee1-05d0-444b-a7b2-abccd34dace4",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****5135",
    "card_type": "Visa",
    "created_at": "2026-10-30T15:54:51.69492Z"
  },
  "failure_reason": null
}
```

## The rider orders by card: the hold is taken

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ecd39030-6ef3-4d93-b58b-dfd54f82949e",
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
  "id": "d86b8f78-80b6-4480-ac89-a7dddc713b72",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:59:51.889777Z",
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
  "command_id": "8f5af1f6-e891-497f-a1e7-42d42f7b8fcc",
  "quote_id": "d86b8f78-80b6-4480-ac89-a7dddc713b72",
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
  "id": "73253712-742a-4db7-952a-1918952b7625",
  "short_number": 34,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "a369a70f-4ed4-494b-91cd-d477d33f885f",
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
  "created_at": "2026-10-30T15:54:52.078037Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/73253712-742a-4db7-952a-1918952b7625` → **200**

```json
{
  "id": "73253712-742a-4db7-952a-1918952b7625",
  "short_number": 34,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "a369a70f-4ed4-494b-91cd-d477d33f885f",
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
  "created_at": "2026-10-30T15:54:52.078037Z",
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

`GET /api/rider/v1/orders/73253712-742a-4db7-952a-1918952b7625` → **200**

```json
{
  "id": "73253712-742a-4db7-952a-1918952b7625",
  "short_number": 34,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "a369a70f-4ed4-494b-91cd-d477d33f885f",
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
  "created_at": "2026-10-30T15:54:52.078037Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/73253712-742a-4db7-952a-1918952b7625/switch-to-cash` → **200**

```json
{
  "command_id": "9efb943a-9b4e-400b-a8f6-2c98218c043c",
  "expected_version": 3
}
```

```json
{
  "id": "73253712-742a-4db7-952a-1918952b7625",
  "short_number": 34,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "a369a70f-4ed4-494b-91cd-d477d33f885f",
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
  "created_at": "2026-10-30T15:54:52.078037Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/73253712-742a-4db7-952a-1918952b7625/switch-to-cash` → **409**

```json
{
  "command_id": "c059060c-23d7-4a1e-8b72-b870747bb50f",
  "expected_version": 4
}
```

```json
{
  "instance": "/api/rider/v1/orders/73253712-742a-4db7-952a-1918952b7625/switch-to-cash",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "8de05d72-17fa-42b3-bf8e-d72ece0864a6"
}
```

Done: the card order became cash; a second switch is refused.

`GET /api/rider/v1/orders/73253712-742a-4db7-952a-1918952b7625` → **200**

```json
{
  "id": "73253712-742a-4db7-952a-1918952b7625",
  "short_number": 34,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "a369a70f-4ed4-494b-91cd-d477d33f885f",
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
  "created_at": "2026-10-30T15:54:52.078037Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/73253712-742a-4db7-952a-1918952b7625/cancel` → **200**

```json
{
  "command_id": "712fbd85-9af4-4d64-94d0-09bbd0613034",
  "expected_version": 4,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "73253712-742a-4db7-952a-1918952b7625",
  "short_number": 34,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "a369a70f-4ed4-494b-91cd-d477d33f885f",
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
  "created_at": "2026-10-30T15:54:52.078037Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
      "en": "Changed my mind",
      "uk": "Передумав їхати"
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
  "session_id": "5631a0ce-4a4c-45cd-b026-f17d75e76d52",
  "subject": {
    "type": "STAFF",
    "id": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiODZhYmMzMi1mMmUyLTRjM2MtOTk2Ny05N2JmYzljZTdjZTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzY1OTMsImlhdCI6MTc5MzM3NTY5MywianRpIjoiOWFmMjA2NzYtY2MwNC00ZDM4LTgwY2EtNWU5NjZiMjY2MWJjIiwic2lkIjoiNTYzMWEwY2UtNGE0Yy00NWNkLWIwMjYtZjE3ZDc1ZTc2ZDUyIn0.o6Cv2RzFk9Ak6_RqHK77pZkzwJty--5KmI_h1ORMStw",
  "access_expires_at": "2026-10-30T16:09:53.587762159Z",
  "refresh_token": "zntBE6OEJvaZaRAuQ3CeZ1Gv0BOLxJsfPT4gIslneEU",
  "refresh_expires_at": "2026-10-31T03:54:53.587402002Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-21250"
}
```

```json
{
  "challenge_id": "950e792a-98cd-4015-836e-d60fd0092e72",
  "expires_at": "2026-10-30T15:59:53.762214286Z",
  "resend_available_at": "2026-10-30T15:54:54.762214286Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "381708",
  "sent_at": "2026-10-30T15:54:53.763899195Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "950e792a-98cd-4015-836e-d60fd0092e72",
  "code": "381708",
  "device_ref": "sandbox-21250"
}
```

```json
{
  "session_id": "75236f8e-4caf-4a1b-bcc0-500a57766874",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NjU5MywiaWF0IjoxNzkzMzc1NjkzLCJqdGkiOiJhODMyYWQ4Yi03MjUzLTRjMjAtYjEwYi04YzNkMTI4YzI3MzYiLCJzaWQiOiI3NTIzNmY4ZS00Y2FmLTRhMWItYmNjMC01MDBhNTc3NjY4NzQifQ.0S1sEGWJbO_gj1JzxYi4zEfMSo9pwnDiBfXh5Hy4W1o",
  "access_expires_at": "2026-10-30T16:09:53.956427471Z",
  "refresh_token": "6-ZgAMv89qPb7wSp73rOtTWDu6WukPpPL14a7wx3pQs",
  "refresh_expires_at": "2026-11-29T15:54:53.95608162Z",
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
      "actor_id": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T15:54:43.626562Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2",
      "reason": "Sandbox clean-up",
      "at": "2026-10-30T15:54:44.549688Z"
    }
  ],
  "duplicates": []
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "01c07701-733e-4665-8e5d-6a2bfc971db4",
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
  "device_ref": "sandbox-16709"
}
```

```json
{
  "challenge_id": "c2c3f701-e9dc-4cf2-9f88-e526fe8e1e7b",
  "expires_at": "2026-10-30T15:59:54.675133158Z",
  "resend_available_at": "2026-10-30T15:54:55.675133158Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "456987",
  "sent_at": "2026-10-30T15:54:54.676799599Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c2c3f701-e9dc-4cf2-9f88-e526fe8e1e7b",
  "code": "456987",
  "device_ref": "sandbox-16709"
}
```

```json
{
  "session_id": "8a79b17a-fd44-46f4-94a5-52508fffaf02",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NjU5NCwiaWF0IjoxNzkzMzc1Njk0LCJqdGkiOiIzM2U1YzVjOS1lNzJiLTQ3NDUtOTI4My0xOWNhODBkOWJkNWEiLCJzaWQiOiI4YTc5YjE3YS1mZDQ0LTQ2ZjQtOTRhNS01MjUwOGZmZmFmMDIifQ.cPUhL8aconoKqoMPiFO8BYa_ol7by2ZwP8lM0hPl9IM",
  "access_expires_at": "2026-10-30T16:09:54.876849709Z",
  "refresh_token": "bGY_beRnBJJfYu7cd5sqB3YvJASYBx1BvutNjFGw7N8",
  "refresh_expires_at": "2026-11-29T15:54:54.876490844Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9c924628-3ab5-4096-b85a-42a33f918f3a",
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
  "last_heartbeat_at": "2026-10-30T15:54:27.49963Z",
  "last_location_at": "2026-10-30T15:54:27.49963Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/9c924628-3ab5-4096-b85a-42a33f918f3a/handover` → **200**

```json
{
  "command_id": "1516eb68-6541-450f-b419-7bda15cc34e6",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9c924628-3ab5-4096-b85a-42a33f918f3a",
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
  "last_heartbeat_at": "2026-10-30T15:54:27.49963Z",
  "last_location_at": "2026-10-30T15:54:27.49963Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

(the car drives 21 s to the next point)

`POST /api/driver/v1/work-sessions/9c924628-3ab5-4096-b85a-42a33f918f3a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:55:16Z",
    "sequence": 1793375716439
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9c924628-3ab5-4096-b85a-42a33f918f3a",
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
  "last_heartbeat_at": "2026-10-30T15:55:16.453534Z",
  "last_location_at": "2026-10-30T15:55:16.453534Z",
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
  "command_id": "389fa9a5-bb69-43ad-99b1-57d2dae64606",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:55:16Z",
    "sequence": 1793375716815
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "f4e46edc-cec5-449a-9d2f-4252e13c7517",
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
  "last_heartbeat_at": "2026-10-30T15:55:16.828555Z",
  "last_location_at": "2026-10-30T15:55:16.828555Z",
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
  "session_id": "7a75cf95-0008-4fdb-bbd6-1f822071cbc6",
  "subject": {
    "type": "STAFF",
    "id": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiODZhYmMzMi1mMmUyLTRjM2MtOTk2Ny05N2JmYzljZTdjZTIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzY2MTcsImlhdCI6MTc5MzM3NTcxNywianRpIjoiNDkyMGU0ZGItNmU3Zi00YmEzLWExMmYtOTJjMTFlNjZiOTU2Iiwic2lkIjoiN2E3NWNmOTUtMDAwOC00ZmRiLWJiZDYtMWY4MjIwNzFjYmM2In0.-80uXeBREQlpGZP6W7lN5DHLuvmJYriUUcbZIn8zadI",
  "access_expires_at": "2026-10-30T16:10:17.20844768Z",
  "refresh_token": "IDbttYlJ7YAfxhzBpDZVBWhOJade490rSB_sbAghOHc",
  "refresh_expires_at": "2026-10-31T03:55:17.208104533Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "05524548-3316-4c33-8a62-401d92d6a710",
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
  "id": "047f9a4b-b248-42c5-8edf-7368ececd33c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T16:00:17.386512Z",
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
  "command_id": "a8625620-f2ca-4ad8-9876-f544fbf82d87",
  "quote_id": "047f9a4b-b248-42c5-8edf-7368ececd33c",
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
  "id": "8f6b4c36-1573-4152-b758-e268cf48a50f",
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
  "created_at": "2026-10-30T15:55:17.569016Z",
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
    "id": "36573d02-dbf2-4606-b359-a9720aa42b37",
    "order_id": "8f6b4c36-1573-4152-b758-e268cf48a50f",
    "expires_at": "2026-10-30T15:55:32.571599Z",
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

`POST /api/driver/v1/offers/36573d02-dbf2-4606-b359-a9720aa42b37/accept` → **200**

```json
{
  "command_id": "74f8e8da-c1b5-46d3-a750-f8ca6dff65ad"
}
```

```json
{
  "id": "401db882-119f-4386-8945-aefc5bfb2fdd",
  "order_id": "8f6b4c36-1573-4152-b758-e268cf48a50f",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "2f950cf9-4640-4d3e-ab51-e3adafdb5e0f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "2f950cf9-4640-4d3e-ab51-e3adafdb5e0f",
  "order_id": "8f6b4c36-1573-4152-b758-e268cf48a50f",
  "assignment_id": "401db882-119f-4386-8945-aefc5bfb2fdd",
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

`POST /api/driver/v1/work-sessions/f4e46edc-cec5-449a-9d2f-4252e13c7517/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:55:28Z",
    "sequence": 1793375728488
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "f4e46edc-cec5-449a-9d2f-4252e13c7517",
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
  "last_heartbeat_at": "2026-10-30T15:55:28.502763Z",
  "last_location_at": "2026-10-30T15:55:28.502763Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/2f950cf9-4640-4d3e-ab51-e3adafdb5e0f/arrive` → **200**

```json
{
  "command_id": "b1628629-ccbc-498e-92db-c5b2acbfc754",
  "expected_version": 0
}
```

```json
{
  "id": "2f950cf9-4640-4d3e-ab51-e3adafdb5e0f",
  "order_id": "8f6b4c36-1573-4152-b758-e268cf48a50f",
  "assignment_id": "401db882-119f-4386-8945-aefc5bfb2fdd",
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
  "arrived_at": "2026-10-30T15:55:28.688235Z",
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

`POST /api/driver/v1/trips/2f950cf9-4640-4d3e-ab51-e3adafdb5e0f/start` → **200**

```json
{
  "command_id": "e8f775f5-5519-4c95-bf5c-68645b30eb9b",
  "expected_version": 1
}
```

```json
{
  "id": "2f950cf9-4640-4d3e-ab51-e3adafdb5e0f",
  "order_id": "8f6b4c36-1573-4152-b758-e268cf48a50f",
  "assignment_id": "401db882-119f-4386-8945-aefc5bfb2fdd",
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
  "arrived_at": "2026-10-30T15:55:28.688235Z",
  "started_at": "2026-10-30T15:55:28.885549Z",
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

`POST /api/driver/v1/trips/2f950cf9-4640-4d3e-ab51-e3adafdb5e0f/complete` → **200**

```json
{
  "command_id": "af98517f-5b3a-4401-8b2c-b9786d80f5ba",
  "expected_version": 2,
  "reported_at": "2026-10-30T15:55:29Z",
  "cash_received": true
}
```

```json
{
  "id": "2f950cf9-4640-4d3e-ab51-e3adafdb5e0f",
  "order_id": "8f6b4c36-1573-4152-b758-e268cf48a50f",
  "assignment_id": "401db882-119f-4386-8945-aefc5bfb2fdd",
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
  "arrived_at": "2026-10-30T15:55:28.688235Z",
  "started_at": "2026-10-30T15:55:28.885549Z",
  "completed_at": "2026-10-30T15:55:29.071388Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/8f6b4c36-1573-4152-b758-e268cf48a50f` → **200**

```json
{
  "id": "8f6b4c36-1573-4152-b758-e268cf48a50f",
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
    "id": "401db882-119f-4386-8945-aefc5bfb2fdd",
    "order_id": "8f6b4c36-1573-4152-b758-e268cf48a50f",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "2f950cf9-4640-4d3e-ab51-e3adafdb5e0f",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T15:55:17.569016Z",
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
  "session_id": "9c924628-3ab5-4096-b85a-42a33f918f3a",
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
  "last_heartbeat_at": "2026-10-30T15:55:16.453534Z",
  "last_location_at": "2026-10-30T15:55:16.453534Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/9c924628-3ab5-4096-b85a-42a33f918f3a/close` → **200**

```json
{
  "command_id": "e93fde69-b3e2-4f0b-9dcf-8a0dc03c290b",
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
  "session_id": "f4e46edc-cec5-449a-9d2f-4252e13c7517",
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
  "last_heartbeat_at": "2026-10-30T15:55:28.502763Z",
  "last_location_at": "2026-10-30T15:55:28.502763Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f4e46edc-cec5-449a-9d2f-4252e13c7517/close` → **200**

```json
{
  "command_id": "6e42d6dc-fd5a-47c5-91ce-5d85c3aeb2e0",
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

Done: terminal order 8f6b4c36-1573-4152-b758-e268cf48a50f by Andrii (5a000000-0000-4000-8000-000000000403).

# Scenario: zz-metrics

## A search without drivers ends as UNFULFILLED

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-31132"
}
```

```json
{
  "challenge_id": "d581ad1d-a6a1-42c0-8c11-a6225229d896",
  "expires_at": "2026-10-30T16:00:33.347731045Z",
  "resend_available_at": "2026-10-30T15:55:34.347731045Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "166622",
  "sent_at": "2026-10-30T15:55:33.34961991Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d581ad1d-a6a1-42c0-8c11-a6225229d896",
  "code": "166622",
  "device_ref": "sandbox-31132"
}
```

```json
{
  "session_id": "d4b05d11-73d8-4dc1-aa80-d3fa5743a740",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NjYzMywiaWF0IjoxNzkzMzc1NzMzLCJqdGkiOiI3NGY3Mzg1MS1jYjBlLTQ2ZDEtYmE4MS0xYzE1ZTNlYjczYzciLCJzaWQiOiJkNGIwNWQxMS03M2Q4LTRkYzEtYWE4MC1kM2ZhNTc0M2E3NDAifQ.Jj4uH9IUvX4QP_EcSON5v5HxYeGRZ405-q_O6LW6JdY",
  "access_expires_at": "2026-10-30T16:10:33.545761938Z",
  "refresh_token": "T511dSr3O5yxVnrUp5-6UXuHkQ-5lb_tpcx84FEA72I",
  "refresh_expires_at": "2026-11-29T15:55:33.54539152Z",
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
  "device_ref": "sandbox-28534"
}
```

```json
{
  "challenge_id": "af6e5691-9cea-4630-9ad0-daf49253139f",
  "expires_at": "2026-10-30T16:00:33.913477238Z",
  "resend_available_at": "2026-10-30T15:55:34.913477238Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "220083",
  "sent_at": "2026-10-30T15:55:33.915352208Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "af6e5691-9cea-4630-9ad0-daf49253139f",
  "code": "220083",
  "device_ref": "sandbox-28534"
}
```

```json
{
  "session_id": "2acae36d-84fc-4e33-a2a6-7c6476667e76",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NjYzNCwiaWF0IjoxNzkzMzc1NzM0LCJqdGkiOiI3MTUzZjhmZS0yNjk5LTQ3YjMtYWYxYi01YWFkMGI0YTJiMGUiLCJzaWQiOiIyYWNhZTM2ZC04NGZjLTRlMzMtYTJhNi03YzY0NzY2NjdlNzYifQ.y4Y0i1cM5gYPUEpVtApO1NrIoGLBDbHh0XB-SuGG2ks",
  "access_expires_at": "2026-10-30T16:10:34.11551719Z",
  "refresh_token": "nRvySh6yDkFKvVjrLXljqU6ak87r3cOH8njHRLWScYw",
  "refresh_expires_at": "2026-11-29T15:55:34.115164469Z",
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
  "device_ref": "sandbox-355"
}
```

```json
{
  "challenge_id": "f9cdf893-f5c0-45b6-ba7c-ced2807397a2",
  "expires_at": "2026-10-30T16:00:34.483629144Z",
  "resend_available_at": "2026-10-30T15:55:35.483629144Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "893983",
  "sent_at": "2026-10-30T15:55:34.485473953Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f9cdf893-f5c0-45b6-ba7c-ced2807397a2",
  "code": "893983",
  "device_ref": "sandbox-355"
}
```

```json
{
  "session_id": "44d62781-0801-4f5b-83ae-c39f5cf41264",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NjYzNCwiaWF0IjoxNzkzMzc1NzM0LCJqdGkiOiI4MzM3NDEyZC1mNzFhLTQ5MTUtOWQ1OC1iMWNiNjY4OGVmN2IiLCJzaWQiOiI0NGQ2Mjc4MS0wODAxLTRmNWItODNhZS1jMzlmNWNmNDEyNjQifQ.LxrnGspQ8jbdcXup2L-vR_vbjaw-wZmJc6_25klMNkQ",
  "access_expires_at": "2026-10-30T16:10:34.68658887Z",
  "refresh_token": "dFQ0eq0e2Ow7LFDkvl9UK4zbNLthv_c2QOV2GqxIQQY",
  "refresh_expires_at": "2026-11-29T15:55:34.686245643Z",
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
  "phone": "+380695998571",
  "device_ref": "sandbox-7574"
}
```

```json
{
  "challenge_id": "ee83754b-a350-406d-a7a7-c93c245b77be",
  "expires_at": "2026-10-30T16:00:35.051917527Z",
  "resend_available_at": "2026-10-30T15:55:36.051917527Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380695998571` → **200**

```json
{
  "phone": "+380695998571",
  "audience": "CLIENT",
  "code": "027947",
  "sent_at": "2026-10-30T15:55:35.053717027Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ee83754b-a350-406d-a7a7-c93c245b77be",
  "code": "027947",
  "device_ref": "sandbox-7574"
}
```

```json
{
  "session_id": "c53ee0a5-3444-46b0-9877-4b08bc74be34",
  "subject": {
    "type": "CLIENT",
    "id": "d93878b9-ce27-4b5b-a5d1-abf9c9a2c219"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkOTM4NzhiOS1jZTI3LTRiNWItYTVkMS1hYmY5YzlhMmMyMTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc2NjM1LCJpYXQiOjE3OTMzNzU3MzUsImp0aSI6IjgyZTVkMDA3LTZiY2MtNDAxMy05NDVkLTBkMDE1NGNiZjY0NCIsInNpZCI6ImM1M2VlMGE1LTM0NDQtNDZiMC05ODc3LTRiMDhiYzc0YmUzNCJ9.CVGj1UdYFi7BAjcSlFodFnikGwzyyWOn8UiJNYVJOhg",
  "access_expires_at": "2026-10-30T16:10:35.256116185Z",
  "refresh_token": "GzL-SdJfWibMvGKic0GH6Ph4n2QDUAavx08gjzULybA",
  "refresh_expires_at": "2026-11-29T15:55:35.255776954Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c3eb5525-314f-4b3d-800f-77e309c45205",
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
  "id": "0b90a336-073a-484b-98a5-c76c01f1d1eb",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T16:00:35.442972Z",
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
  "command_id": "98fd5e3a-1daa-4b5d-9c67-a38cbf59a7ae",
  "quote_id": "0b90a336-073a-484b-98a5-c76c01f1d1eb",
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
  "id": "95651e00-ab1a-4b5c-a9ef-4a902416942c",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d93878b9-ce27-4b5b-a5d1-abf9c9a2c219",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:55:35.63143Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/95651e00-ab1a-4b5c-a9ef-4a902416942c` → **200**

```json
{
  "id": "95651e00-ab1a-4b5c-a9ef-4a902416942c",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d93878b9-ce27-4b5b-a5d1-abf9c9a2c219",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:55:35.63143Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/95651e00-ab1a-4b5c-a9ef-4a902416942c` → **200**

```json
{
  "id": "95651e00-ab1a-4b5c-a9ef-4a902416942c",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d93878b9-ce27-4b5b-a5d1-abf9c9a2c219",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:55:35.63143Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/95651e00-ab1a-4b5c-a9ef-4a902416942c` → **200**

```json
{
  "id": "95651e00-ab1a-4b5c-a9ef-4a902416942c",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d93878b9-ce27-4b5b-a5d1-abf9c9a2c219",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:55:35.63143Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/95651e00-ab1a-4b5c-a9ef-4a902416942c` → **200**

```json
{
  "id": "95651e00-ab1a-4b5c-a9ef-4a902416942c",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d93878b9-ce27-4b5b-a5d1-abf9c9a2c219",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:55:35.63143Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/95651e00-ab1a-4b5c-a9ef-4a902416942c` → **200**

```json
{
  "id": "95651e00-ab1a-4b5c-a9ef-4a902416942c",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d93878b9-ce27-4b5b-a5d1-abf9c9a2c219",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:55:35.63143Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/95651e00-ab1a-4b5c-a9ef-4a902416942c` → **200**

```json
{
  "id": "95651e00-ab1a-4b5c-a9ef-4a902416942c",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d93878b9-ce27-4b5b-a5d1-abf9c9a2c219",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:55:35.63143Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/95651e00-ab1a-4b5c-a9ef-4a902416942c` → **200**

```json
{
  "id": "95651e00-ab1a-4b5c-a9ef-4a902416942c",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d93878b9-ce27-4b5b-a5d1-abf9c9a2c219",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:55:35.63143Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/95651e00-ab1a-4b5c-a9ef-4a902416942c` → **200**

```json
{
  "id": "95651e00-ab1a-4b5c-a9ef-4a902416942c",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d93878b9-ce27-4b5b-a5d1-abf9c9a2c219",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:55:35.63143Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/95651e00-ab1a-4b5c-a9ef-4a902416942c` → **200**

```json
{
  "id": "95651e00-ab1a-4b5c-a9ef-4a902416942c",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d93878b9-ce27-4b5b-a5d1-abf9c9a2c219",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:55:35.63143Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/95651e00-ab1a-4b5c-a9ef-4a902416942c` → **200**

```json
{
  "id": "95651e00-ab1a-4b5c-a9ef-4a902416942c",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d93878b9-ce27-4b5b-a5d1-abf9c9a2c219",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:55:35.63143Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/95651e00-ab1a-4b5c-a9ef-4a902416942c` → **200**

```json
{
  "id": "95651e00-ab1a-4b5c-a9ef-4a902416942c",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d93878b9-ce27-4b5b-a5d1-abf9c9a2c219",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:55:35.63143Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/95651e00-ab1a-4b5c-a9ef-4a902416942c` → **200**

```json
{
  "id": "95651e00-ab1a-4b5c-a9ef-4a902416942c",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d93878b9-ce27-4b5b-a5d1-abf9c9a2c219",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:55:35.63143Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/95651e00-ab1a-4b5c-a9ef-4a902416942c` → **200**

```json
{
  "id": "95651e00-ab1a-4b5c-a9ef-4a902416942c",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d93878b9-ce27-4b5b-a5d1-abf9c9a2c219",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:55:35.63143Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/95651e00-ab1a-4b5c-a9ef-4a902416942c` → **200**

```json
{
  "id": "95651e00-ab1a-4b5c-a9ef-4a902416942c",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d93878b9-ce27-4b5b-a5d1-abf9c9a2c219",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:55:35.63143Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/95651e00-ab1a-4b5c-a9ef-4a902416942c` → **200**

```json
{
  "id": "95651e00-ab1a-4b5c-a9ef-4a902416942c",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d93878b9-ce27-4b5b-a5d1-abf9c9a2c219",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:55:35.63143Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/95651e00-ab1a-4b5c-a9ef-4a902416942c` → **200**

```json
{
  "id": "95651e00-ab1a-4b5c-a9ef-4a902416942c",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d93878b9-ce27-4b5b-a5d1-abf9c9a2c219",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:55:35.63143Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/95651e00-ab1a-4b5c-a9ef-4a902416942c` → **200**

```json
{
  "id": "95651e00-ab1a-4b5c-a9ef-4a902416942c",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d93878b9-ce27-4b5b-a5d1-abf9c9a2c219",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:55:35.63143Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/95651e00-ab1a-4b5c-a9ef-4a902416942c` → **200**

```json
{
  "id": "95651e00-ab1a-4b5c-a9ef-4a902416942c",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d93878b9-ce27-4b5b-a5d1-abf9c9a2c219",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:55:35.63143Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/95651e00-ab1a-4b5c-a9ef-4a902416942c` → **200**

```json
{
  "id": "95651e00-ab1a-4b5c-a9ef-4a902416942c",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d93878b9-ce27-4b5b-a5d1-abf9c9a2c219",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:55:35.63143Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/95651e00-ab1a-4b5c-a9ef-4a902416942c` → **200**

```json
{
  "id": "95651e00-ab1a-4b5c-a9ef-4a902416942c",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d93878b9-ce27-4b5b-a5d1-abf9c9a2c219",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:55:35.63143Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/95651e00-ab1a-4b5c-a9ef-4a902416942c` → **200**

```json
{
  "id": "95651e00-ab1a-4b5c-a9ef-4a902416942c",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d93878b9-ce27-4b5b-a5d1-abf9c9a2c219",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:55:35.63143Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/95651e00-ab1a-4b5c-a9ef-4a902416942c` → **200**

```json
{
  "id": "95651e00-ab1a-4b5c-a9ef-4a902416942c",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d93878b9-ce27-4b5b-a5d1-abf9c9a2c219",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:55:35.63143Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/95651e00-ab1a-4b5c-a9ef-4a902416942c` → **200**

```json
{
  "id": "95651e00-ab1a-4b5c-a9ef-4a902416942c",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d93878b9-ce27-4b5b-a5d1-abf9c9a2c219",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:55:35.63143Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/95651e00-ab1a-4b5c-a9ef-4a902416942c` → **200**

```json
{
  "id": "95651e00-ab1a-4b5c-a9ef-4a902416942c",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d93878b9-ce27-4b5b-a5d1-abf9c9a2c219",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:55:35.63143Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/95651e00-ab1a-4b5c-a9ef-4a902416942c` → **200**

```json
{
  "id": "95651e00-ab1a-4b5c-a9ef-4a902416942c",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d93878b9-ce27-4b5b-a5d1-abf9c9a2c219",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:55:35.63143Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/95651e00-ab1a-4b5c-a9ef-4a902416942c` → **200**

```json
{
  "id": "95651e00-ab1a-4b5c-a9ef-4a902416942c",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d93878b9-ce27-4b5b-a5d1-abf9c9a2c219",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:55:35.63143Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/95651e00-ab1a-4b5c-a9ef-4a902416942c` → **200**

```json
{
  "id": "95651e00-ab1a-4b5c-a9ef-4a902416942c",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d93878b9-ce27-4b5b-a5d1-abf9c9a2c219",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:55:35.63143Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/95651e00-ab1a-4b5c-a9ef-4a902416942c` → **200**

```json
{
  "id": "95651e00-ab1a-4b5c-a9ef-4a902416942c",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d93878b9-ce27-4b5b-a5d1-abf9c9a2c219",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:55:35.63143Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/95651e00-ab1a-4b5c-a9ef-4a902416942c` → **200**

```json
{
  "id": "95651e00-ab1a-4b5c-a9ef-4a902416942c",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d93878b9-ce27-4b5b-a5d1-abf9c9a2c219",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:55:35.63143Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/95651e00-ab1a-4b5c-a9ef-4a902416942c` → **200**

```json
{
  "id": "95651e00-ab1a-4b5c-a9ef-4a902416942c",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d93878b9-ce27-4b5b-a5d1-abf9c9a2c219",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:55:35.63143Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/95651e00-ab1a-4b5c-a9ef-4a902416942c` → **200**

```json
{
  "id": "95651e00-ab1a-4b5c-a9ef-4a902416942c",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d93878b9-ce27-4b5b-a5d1-abf9c9a2c219",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:55:35.63143Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/95651e00-ab1a-4b5c-a9ef-4a902416942c` → **200**

```json
{
  "id": "95651e00-ab1a-4b5c-a9ef-4a902416942c",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d93878b9-ce27-4b5b-a5d1-abf9c9a2c219",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:55:35.63143Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/95651e00-ab1a-4b5c-a9ef-4a902416942c` → **200**

```json
{
  "id": "95651e00-ab1a-4b5c-a9ef-4a902416942c",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d93878b9-ce27-4b5b-a5d1-abf9c9a2c219",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:55:35.63143Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/95651e00-ab1a-4b5c-a9ef-4a902416942c` → **200**

```json
{
  "id": "95651e00-ab1a-4b5c-a9ef-4a902416942c",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d93878b9-ce27-4b5b-a5d1-abf9c9a2c219",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:55:35.63143Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/95651e00-ab1a-4b5c-a9ef-4a902416942c` → **200**

```json
{
  "id": "95651e00-ab1a-4b5c-a9ef-4a902416942c",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d93878b9-ce27-4b5b-a5d1-abf9c9a2c219",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:55:35.63143Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/95651e00-ab1a-4b5c-a9ef-4a902416942c` → **200**

```json
{
  "id": "95651e00-ab1a-4b5c-a9ef-4a902416942c",
  "short_number": 36,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "d93878b9-ce27-4b5b-a5d1-abf9c9a2c219",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T15:55:35.63143Z",
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
file:///home/runner/work/blizz.taxi/blizz.taxi/scripts/sandbox/check-metrics.mjs:36
      if (!allowed.includes(tags[key])) throw Error(`Unbounded ${key} in ${name}`);
                                              ^

Error: Unbounded reason in blizz_dispatch_excluded_total
    at validate (file:///home/runner/work/blizz.taxi/blizz.taxi/scripts/sandbox/check-metrics.mjs:36:47)
    at file:///home/runner/work/blizz.taxi/blizz.taxi/scripts/sandbox/check-metrics.mjs:68:30
    at ModuleJob.run (node:internal/modules/esm/module_job:561:25)
    at async node:internal/modules/esm/loader:647:26
    at async asyncRunEntryPointWithESMLoader (node:internal/modules/run_main:101:5)

Node.js v24.22.1

`GET /api/rider/v1/orders/95651e00-ab1a-4b5c-a9ef-4a902416942c` → **200**

```json
{
  "id": "95651e00-ab1a-4b5c-a9ef-4a902416942c",
  "short_number": 36,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "d93878b9-ce27-4b5b-a5d1-abf9c9a2c219",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T15:55:35.63143Z",
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
  "session_id": "920eb6ac-8390-4247-a175-bed1f7d0f996",
  "subject": {
    "type": "STAFF",
    "id": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiODZhYmMzMi1mMmUyLTRjM2MtOTk2Ny05N2JmYzljZTdjZTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzY4MTgsImlhdCI6MTc5MzM3NTkxOCwianRpIjoiMTVlZTIwZmYtMzkxYi00MDFkLTgxYWYtMjQ1YzQxNmRmYjgwIiwic2lkIjoiOTIwZWI2YWMtODM5MC00MjQ3LWExNzUtYmVkMWY3ZDBmOTk2In0.ryshPngmR-3aO27TSXfKvJi1c6NzuOZq9Am_xK706fM",
  "access_expires_at": "2026-10-30T16:13:38.132410874Z",
  "refresh_token": "YWCSFWdd6U0xU6HllQ-w43WE3u-WDXwNoiUiMor2Av0",
  "refresh_expires_at": "2026-10-31T03:58:38.131807416Z",
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
  "id": "b4002f83-39e5-4b1f-8ebf-a98158aaaf62",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T15:58:38.32228Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T15:58:38.322331Z",
  "updated_at": "2026-10-30T15:58:38.333515Z",
  "finished_at": "2026-10-30T15:58:38.333515Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/b4002f83-39e5-4b1f-8ebf-a98158aaaf62` → **200**

```json
{
  "run": {
    "id": "b4002f83-39e5-4b1f-8ebf-a98158aaaf62",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T15:58:38.32228Z",
    "partial": true,
    "state": "CLEAN",
    "local_count": 10,
    "provider_count": 10,
    "item_count": 0,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T15:58:38.322331Z",
    "updated_at": "2026-10-30T15:58:38.333515Z",
    "finished_at": "2026-10-30T15:58:38.333515Z",
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
  "id": "b4002f83-39e5-4b1f-8ebf-a98158aaaf62",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T15:58:38.32228Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T15:58:38.322331Z",
  "updated_at": "2026-10-30T15:58:38.333515Z",
  "finished_at": "2026-10-30T15:58:38.333515Z",
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
  "id": "b4002f83-39e5-4b1f-8ebf-a98158aaaf62",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T15:58:38.32228Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T15:58:38.322331Z",
  "updated_at": "2026-10-30T15:58:38.333515Z",
  "finished_at": "2026-10-30T15:58:38.333515Z",
  "version": 1
}
```

## One independent bank transaction produces one missing-local item on another merchant's first snapshot

`POST /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/8c2a7368-5f1b-4cf9-a12a-a02ab914ce77` → **204**

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
  "id": "6b1c6871-f156-4f0d-b47c-3d7ea824ab16",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T15:58:38.626023Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T15:58:38.626059Z",
  "updated_at": "2026-10-30T15:58:38.631003Z",
  "finished_at": "2026-10-30T15:58:38.631003Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/6b1c6871-f156-4f0d-b47c-3d7ea824ab16` → **200**

```json
{
  "run": {
    "id": "6b1c6871-f156-4f0d-b47c-3d7ea824ab16",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T15:58:38.626023Z",
    "partial": true,
    "state": "OPEN",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 1,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T15:58:38.626059Z",
    "updated_at": "2026-10-30T15:58:38.631003Z",
    "finished_at": "2026-10-30T15:58:38.631003Z",
    "version": 1
  },
  "items": [
    {
      "id": "c1bbc0c2-01bf-4fbd-86ac-3e6f591509cb",
      "run_id": "6b1c6871-f156-4f0d-b47c-3d7ea824ab16",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "4895de8b44ab78237b5fb22b4ba5dcd25603652e5737e04daa1f6dfcdb1e1f98",
      "reference_display": "sandbox-reconciliation-8c2a7368-5f1b-4cf9-a12a-a02ab914ce77",
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
      "provider_at": "2026-10-30T15:58:38Z",
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
  "id": "6b1c6871-f156-4f0d-b47c-3d7ea824ab16",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T15:58:38.626023Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T15:58:38.626059Z",
  "updated_at": "2026-10-30T15:58:38.631003Z",
  "finished_at": "2026-10-30T15:58:38.631003Z",
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
  "id": "6b1c6871-f156-4f0d-b47c-3d7ea824ab16",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T15:58:38.626023Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T15:58:38.626059Z",
  "updated_at": "2026-10-30T15:58:38.631003Z",
  "finished_at": "2026-10-30T15:58:38.631003Z",
  "version": 1
}
```

## The admin explains the item once; a replay is the same result and a different decision conflicts

`POST /api/admin/v1/payment-reconciliations/items/c1bbc0c2-01bf-4fbd-86ac-3e6f591509cb/resolve` → **200**

```json
{
  "command_id": "3824cc12-ca22-4a23-9ce1-b74ee9a68ad2",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "c1bbc0c2-01bf-4fbd-86ac-3e6f591509cb",
  "run_id": "6b1c6871-f156-4f0d-b47c-3d7ea824ab16",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "4895de8b44ab78237b5fb22b4ba5dcd25603652e5737e04daa1f6dfcdb1e1f98",
  "reference_display": "sandbox-reconciliation-8c2a7368-5f1b-4cf9-a12a-a02ab914ce77",
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
  "provider_at": "2026-10-30T15:58:38Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2",
  "resolved_at": "2026-10-30T15:58:38.90383Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/c1bbc0c2-01bf-4fbd-86ac-3e6f591509cb/resolve` → **200**

```json
{
  "command_id": "3824cc12-ca22-4a23-9ce1-b74ee9a68ad2",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "c1bbc0c2-01bf-4fbd-86ac-3e6f591509cb",
  "run_id": "6b1c6871-f156-4f0d-b47c-3d7ea824ab16",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "4895de8b44ab78237b5fb22b4ba5dcd25603652e5737e04daa1f6dfcdb1e1f98",
  "reference_display": "sandbox-reconciliation-8c2a7368-5f1b-4cf9-a12a-a02ab914ce77",
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
  "provider_at": "2026-10-30T15:58:38Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2",
  "resolved_at": "2026-10-30T15:58:38.90383Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/c1bbc0c2-01bf-4fbd-86ac-3e6f591509cb/resolve` → **409**

```json
{
  "command_id": "1b6436b2-7805-401e-b217-6cec809f15c9",
  "expected_version": 1,
  "decision": "ESCALATED",
  "reason": "A conflicting second decision"
}
```

```json
{
  "instance": "/api/admin/v1/payment-reconciliations/items/c1bbc0c2-01bf-4fbd-86ac-3e6f591509cb/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "73619b05-39e6-4a4a-bfd7-77342a144ee3"
}
```

`GET /api/admin/v1/payment-reconciliations/6b1c6871-f156-4f0d-b47c-3d7ea824ab16` → **200**

```json
{
  "run": {
    "id": "6b1c6871-f156-4f0d-b47c-3d7ea824ab16",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T15:58:38.626023Z",
    "partial": true,
    "state": "RESOLVED",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T15:58:38.626059Z",
    "updated_at": "2026-10-30T15:58:38.90383Z",
    "finished_at": "2026-10-30T15:58:38.631003Z",
    "version": 2
  },
  "items": [
    {
      "id": "c1bbc0c2-01bf-4fbd-86ac-3e6f591509cb",
      "run_id": "6b1c6871-f156-4f0d-b47c-3d7ea824ab16",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "4895de8b44ab78237b5fb22b4ba5dcd25603652e5737e04daa1f6dfcdb1e1f98",
      "reference_display": "sandbox-reconciliation-8c2a7368-5f1b-4cf9-a12a-a02ab914ce77",
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
      "provider_at": "2026-10-30T15:58:38Z",
      "state": "RESOLVED",
      "decision": "EXPLAINED",
      "reason": "Independent sandbox bank fixture; no real money moved",
      "resolved_by": "b86abc32-f2e2-4c3c-9967-97bfc9ce7ce2",
      "resolved_at": "2026-10-30T15:58:38.90383Z",
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
      "id": "6b1c6871-f156-4f0d-b47c-3d7ea824ab16",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-30",
      "period_from": "2026-10-29T22:00:00Z",
      "period_to": "2026-10-31T02:00:00Z",
      "observed_until": "2026-10-30T15:58:38.626023Z",
      "partial": true,
      "state": "RESOLVED",
      "local_count": 0,
      "provider_count": 1,
      "item_count": 1,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-30T15:58:38.626059Z",
      "updated_at": "2026-10-30T15:58:38.90383Z",
      "finished_at": "2026-10-30T15:58:38.631003Z",
      "version": 2
    },
    {
      "id": "ad68e4cd-2853-49ae-ae29-a423b954dc09",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-29",
      "period_from": "2026-10-28T22:00:00Z",
      "period_to": "2026-10-30T02:00:00Z",
      "observed_until": "2026-10-30T15:39:46.828456Z",
      "partial": false,
      "state": "CLEAN",
      "local_count": 0,
      "provider_count": 0,
      "item_count": 0,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-30T15:39:46.828534Z",
      "updated_at": "2026-10-30T15:39:46.83159Z",
      "finished_at": "2026-10-30T15:39:46.83159Z",
      "version": 1
    }
  ],
  "next_cursor": null
}
```

`DELETE /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/8c2a7368-5f1b-4cf9-a12a-a02ab914ce77` → **204**

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30"
}
```

```json
{
  "id": "6b1c6871-f156-4f0d-b47c-3d7ea824ab16",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T15:58:38.626023Z",
  "partial": true,
  "state": "RESOLVED",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T15:58:38.626059Z",
  "updated_at": "2026-10-30T15:58:38.90383Z",
  "finished_at": "2026-10-30T15:58:38.631003Z",
  "version": 2
}
```

Done: clean card snapshot, one bank-only difference, three identical runs, audited decision/replay/conflict, bank fixture restored.

# Scenario: zzz-invariants

## Five invariant checks are clean after all scenario transactions settle

```prometheus
blizz_invariant_last_success{application="blizz-taxi-server",check="I1"} 1.79337604208E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I2"} 1.793376042359E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I3"} 1.79337604236E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I4"} 1.79337604208E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I5"} 1.79337604236E9
blizz_invariant_violations{application="blizz-taxi-server",check="I1"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I2"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I3"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I4"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I5"} 0.0
```

Done: five fresh zero invariant gauges after the settling margin.
