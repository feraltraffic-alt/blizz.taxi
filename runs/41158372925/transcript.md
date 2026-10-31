# Sandbox transcript (2026-10-31T02:06:10Z, 4962b91)

# Scenario: admission-cities

## Only Andrii is online in Kyiv for this scenario

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-18474"
}
```

```json
{
  "challenge_id": "e8c72a45-6944-4ef5-a9e2-79e61e6c6ced",
  "expires_at": "2026-10-31T02:11:11.011126791Z",
  "resend_available_at": "2026-10-31T02:06:12.011126791Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "143931",
  "sent_at": "2026-10-31T02:06:11.020980457Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e8c72a45-6944-4ef5-a9e2-79e61e6c6ced",
  "code": "143931",
  "device_ref": "sandbox-18474"
}
```

```json
{
  "session_id": "18be38c9-fa6d-4ab7-88b5-7f4a803c4745",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQxMzI3NywiaWF0IjoxNzkzNDEyMzc3LCJqdGkiOiJmMzU1NmE0NC04MTJlLTRkNzgtYWFiMS05YmFkZmU3ZDc2YzUiLCJzaWQiOiIxOGJlMzhjOS1mYTZkLTRhYjctODhiNS03ZjRhODAzYzQ3NDUifQ.Z5ZjY61sVQWlO8g2FcvXo5Bimdj8E8qHd8biEkJ4ivY",
  "access_expires_at": "2026-10-31T02:21:17.547468851Z",
  "refresh_token": "6idJm2zq5KLyyhuEod_QSaobFtDQkRI8vRiF55iRsno",
  "refresh_expires_at": "2026-11-30T02:06:17.545812639Z",
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
  "device_ref": "sandbox-21122"
}
```

```json
{
  "challenge_id": "6cd195ed-377f-41ed-bd69-fd36c5b32289",
  "expires_at": "2026-10-31T02:11:17.990814007Z",
  "resend_available_at": "2026-10-31T02:06:18.990814007Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "225615",
  "sent_at": "2026-10-31T02:06:17.994795847Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6cd195ed-377f-41ed-bd69-fd36c5b32289",
  "code": "225615",
  "device_ref": "sandbox-21122"
}
```

```json
{
  "session_id": "288e1be8-4130-4c3d-98f5-ea11abc41ead",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQxMzI3OCwiaWF0IjoxNzkzNDEyMzc4LCJqdGkiOiI0NzIzZTNhMC04YjU2LTQ4YmYtYjAyMy1mZjQ2YzI5MzI2OTkiLCJzaWQiOiIyODhlMWJlOC00MTMwLTRjM2QtOThmNS1lYTExYWJjNDFlYWQifQ.fVlygOetI0LM0q0igC6W1DLvg71_-GQhLnrLBAVdsy4",
  "access_expires_at": "2026-10-31T02:21:18.217015932Z",
  "refresh_token": "irs0M8hL7etdQFitov0BbtlfbpUvNx65BkEvicajM0Q",
  "refresh_expires_at": "2026-11-30T02:06:18.216277103Z",
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
  "correlation_id": "3fc0294b-6807-47d5-a637-79ff7e13a79c"
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
  "session_id": "b5a6ddbc-7da5-49d6-9d49-f8336563caf9",
  "subject": {
    "type": "STAFF",
    "id": "13536a6b-90d5-4717-bcad-60e066f5abae"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzUzNmE2Yi05MGQ1LTQ3MTctYmNhZC02MGUwNjZmNWFiYWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MTMyNzksImlhdCI6MTc5MzQxMjM3OSwianRpIjoiNTgxNjM2ZjQtMmI3OS00MDM0LWFiYzctYmYzZTlmNzE2OGMwIiwic2lkIjoiYjVhNmRkYmMtN2RhNS00OWQ2LTlkNDktZjgzMzY1NjNjYWY5In0.8uITaKXqZhVHQZJZhnJH3MJoCtrQQV4vr86a6815vag",
  "access_expires_at": "2026-10-31T02:21:19.229369771Z",
  "refresh_token": "Ae4mPw7jCsx_-Y34hpxidftXU5wIsHzsjoxhIwngoxw",
  "refresh_expires_at": "2026-10-31T14:06:19.228641959Z",
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
  "session_id": "0f142939-4567-471b-b519-74e2002563bc",
  "subject": {
    "type": "STAFF",
    "id": "13536a6b-90d5-4717-bcad-60e066f5abae"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzUzNmE2Yi05MGQ1LTQ3MTctYmNhZC02MGUwNjZmNWFiYWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MTMyODAsImlhdCI6MTc5MzQxMjM4MCwianRpIjoiZjFlMDZmMTEtY2M0Mi00YWI0LWFhOGItZWJkOTNkMWNlY2I0Iiwic2lkIjoiMGYxNDI5MzktNDU2Ny00NzFiLWI1MTktNzRlMjAwMjU2M2JjIn0.ylauuOspWMhfcLlgmN2dy_x1zPdv2guvs2ju1pJnqJ4",
  "access_expires_at": "2026-10-31T02:21:20.478860616Z",
  "refresh_token": "qmu6hGKKP06N0m2ZGRoOKy0knw8_RPtot-BLzf6lZ9c",
  "refresh_expires_at": "2026-10-31T14:06:20.47812382Z",
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
  "session_id": "7b2296b0-5247-4cd6-b868-69f76189981e",
  "subject": {
    "type": "STAFF",
    "id": "13536a6b-90d5-4717-bcad-60e066f5abae"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzUzNmE2Yi05MGQ1LTQ3MTctYmNhZC02MGUwNjZmNWFiYWUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MTMyODAsImlhdCI6MTc5MzQxMjM4MCwianRpIjoiNDE0ZmFmYjgtNGIyMi00OWQ1LWI5MGMtYzU4ZGJkYThmNTc5Iiwic2lkIjoiN2IyMjk2YjAtNTI0Ny00Y2Q2LWI4NjgtNjlmNzYxODk5ODFlIn0.nDSyxFzlVogYLxszSrgF4koa-uOVGAtKKQX1RJLAWgo",
  "access_expires_at": "2026-10-31T02:21:20.874196707Z",
  "refresh_token": "UQ0NcNyBv4WVjeduKloUdnyKOSZ1bVBQf8gVcZ6kUbM",
  "refresh_expires_at": "2026-10-31T14:06:20.873640329Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-18728"
}
```

```json
{
  "challenge_id": "2c626a00-3c9a-409b-bb2b-0f0861906b48",
  "expires_at": "2026-10-31T02:11:21.064432951Z",
  "resend_available_at": "2026-10-31T02:06:22.064432951Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "917369",
  "sent_at": "2026-10-31T02:06:21.068164022Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2c626a00-3c9a-409b-bb2b-0f0861906b48",
  "code": "917369",
  "device_ref": "sandbox-18728"
}
```

```json
{
  "session_id": "1e079467-349a-4dce-9e4d-4a7340b6f8b7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQxMzI4MSwiaWF0IjoxNzkzNDEyMzgxLCJqdGkiOiIwM2I0OGI2Zi01MGRmLTQzYzAtYjY0OC0wNjk4ZTNjMzc2YzEiLCJzaWQiOiIxZTA3OTQ2Ny0zNDlhLTRkY2UtOWU0ZC00YTczNDBiNmY4YjcifQ.hN_NrZ8PFGSSzmASf7lJrQk8mLGdpbpVsH9HMWGoztY",
  "access_expires_at": "2026-10-31T02:21:21.287578405Z",
  "refresh_token": "leIKok3SVKsUx8OBcuJMO9d6wIIlfKbHPG-ad8agwGY",
  "refresh_expires_at": "2026-11-30T02:06:21.286769252Z",
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
  "command_id": "281a3328-e2f5-4891-8077-1b8ecc219cae",
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
  "command_id": "0b0a238e-4bed-44d0-8fae-862dad637205",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4528,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T02:06:22Z",
    "sequence": 1793412382160
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
  "correlation_id": "29ac13f9-49cd-4dfa-af41-46a77a4799d0"
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
  "command_id": "0fe11160-a29c-4515-ae3e-12348e2f69cb",
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
  "command_id": "33e6bdeb-9ca7-4f28-adef-3bbb9c6e387f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4528,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T02:06:23Z",
    "sequence": 1793412383658
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "6ed6ae64-31e7-4286-ba40-32c3dd170f44",
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
  "last_heartbeat_at": "2026-10-31T02:06:23.083433Z",
  "last_location_at": "2026-10-31T02:06:23.083433Z",
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
  "command_id": "08af14b1-d804-4b78-906c-e471ccac9ec4",
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
  "session_id": "6ed6ae64-31e7-4286-ba40-32c3dd170f44",
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
  "last_heartbeat_at": "2026-10-31T02:06:23.083433Z",
  "last_location_at": "2026-10-31T02:06:23.083433Z",
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
  "phone": "+380683429798",
  "device_ref": "sandbox-28297"
}
```

```json
{
  "challenge_id": "268a6c11-8adf-4b97-8a8f-b708a10331cd",
  "expires_at": "2026-10-31T02:11:23.888294257Z",
  "resend_available_at": "2026-10-31T02:06:24.888294257Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380683429798` → **200**

```json
{
  "phone": "+380683429798",
  "audience": "CLIENT",
  "code": "168006",
  "sent_at": "2026-10-31T02:06:23.89284698Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "268a6c11-8adf-4b97-8a8f-b708a10331cd",
  "code": "168006",
  "device_ref": "sandbox-28297"
}
```

```json
{
  "session_id": "9fbd750b-fed0-4508-85de-045d9113e68e",
  "subject": {
    "type": "CLIENT",
    "id": "5a079bb9-bd87-4397-b341-6df910ecc5ee"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTA3OWJiOS1iZDg3LTQzOTctYjM0MS02ZGY5MTBlY2M1ZWUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDEzMjg0LCJpYXQiOjE3OTM0MTIzODQsImp0aSI6ImYxNDg1ODkwLTE1MzEtNDJmMi04YWExLTI4ZmI1YzBmYmExNSIsInNpZCI6IjlmYmQ3NTBiLWZlZDAtNDUwOC04NWRlLTA0NWQ5MTEzZTY4ZSJ9.A0KoOUw_0yNWoWDUo31qxvU3088eCrHq3R-pd-yu5xg",
  "access_expires_at": "2026-10-31T02:21:24.130111032Z",
  "refresh_token": "PKARFP2svrRbv22EQa57Oz5rm2vyRWRX0UDuEoHlWbw",
  "refresh_expires_at": "2026-11-30T02:06:24.129506914Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "10defeb6-974a-41f7-b1b1-b97ad3d52637",
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
  "id": "82490b8f-3749-474e-98c4-cd0178533ac9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T02:11:24.348074Z",
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
  "command_id": "f8a850a2-3df0-4ac5-857a-4a5930a2f50b",
  "quote_id": "82490b8f-3749-474e-98c4-cd0178533ac9",
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
  "id": "6ca32195-0d32-4cfc-9a35-7deb8e936a6e",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5a079bb9-bd87-4397-b341-6df910ecc5ee",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-31T02:06:24.601576Z",
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

`POST /api/driver/v1/orders/6ca32195-0d32-4cfc-9a35-7deb8e936a6e/claim` → **409**

```json
{
  "command_id": "75ded7c7-6f43-4075-8b9f-f9e64ec89017"
}
```

```json
{
  "instance": "/api/driver/v1/orders/6ca32195-0d32-4cfc-9a35-7deb8e936a6e/claim",
  "status": 409,
  "title": "Driver not eligible",
  "type": "https://errors.blizz.taxi/driver-not-eligible",
  "code": "DRIVER_NOT_ELIGIBLE",
  "correlation_id": "b8daa865-7570-4b6b-9988-7da705c93baf"
}
```

`GET /api/operator/v1/orders/6ca32195-0d32-4cfc-9a35-7deb8e936a6e/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-31T02:06:24.603889Z",
      "actor": {
        "type": "CLIENT",
        "id": "5a079bb9-bd87-4397-b341-6df910ecc5ee",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "6ca32195-0d32-4cfc-9a35-7deb8e936a6e",
        "quote_id": "82490b8f-3749-474e-98c4-cd0178533ac9",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "f3787e26-5aef-4667-8fe9-d00d09168585"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-31T02:06:24.608471Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "6ca32195-0d32-4cfc-9a35-7deb8e936a6e",
        "attempt_id": "a7570935-2d63-44d8-8868-3d5a008a80b0",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "f3787e26-5aef-4667-8fe9-d00d09168585"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-31T02:06:24.644134Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "6ca32195-0d32-4cfc-9a35-7deb8e936a6e",
        "attempt_id": "a7570935-2d63-44d8-8868-3d5a008a80b0"
      },
      "correlation_id": "f3787e26-5aef-4667-8fe9-d00d09168585"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "a7570935-2d63-44d8-8868-3d5a008a80b0",
        "generation": 1,
        "started_at": "2026-10-31T02:06:24.606586Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-31T02:06:24.644134Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-31T02:06:24.609787Z",
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
  "command_id": "8c881477-b04d-4265-8022-87536e47cf57",
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

`POST /api/driver/v1/work-sessions/6ed6ae64-31e7-4286-ba40-32c3dd170f44/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4528,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T02:06:26Z",
    "sequence": 1793412386214
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "6ed6ae64-31e7-4286-ba40-32c3dd170f44",
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
  "last_heartbeat_at": "2026-10-31T02:06:26.236196Z",
  "last_location_at": "2026-10-31T02:06:26.236196Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000001/zones` → **201**

```json
{
  "command_id": "944ba331-e665-4119-aa3b-f811d2f07d84",
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
  "id": "a08377f7-d2eb-4181-86a1-be159610df24",
  "state": "DRAFT",
  "version": 0
}
```

`POST /api/admin/v1/zones/a08377f7-d2eb-4181-86a1-be159610df24/publish` → **200**

```json
{
  "command_id": "a8fca7a3-e170-410d-a417-9bf4734d8bd3",
  "expected_version": 0,
  "reason": "Sandbox"
}
```

```json
{
  "id": "a08377f7-d2eb-4181-86a1-be159610df24",
  "state": "PUBLISHED",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000001/zones` → **201**

```json
{
  "command_id": "a8777814-df4e-4167-b886-158a483ebff1",
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
  "id": "be06768a-c12f-48af-ace7-1b3c6049f63f",
  "state": "DRAFT",
  "version": 0
}
```

`POST /api/admin/v1/zones/be06768a-c12f-48af-ace7-1b3c6049f63f/publish` → **200**

```json
{
  "command_id": "5b155a1b-820f-4307-b3bb-3631d7f16757",
  "expected_version": 0,
  "reason": "Sandbox"
}
```

```json
{
  "id": "be06768a-c12f-48af-ace7-1b3c6049f63f",
  "state": "PUBLISHED",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/zones` → **201**

```json
{
  "command_id": "052a91b2-a093-41b3-ae8c-5952b24690e2",
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
  "id": "e45adc1e-8638-471e-897a-5ff699d23b59",
  "state": "DRAFT",
  "version": 0
}
```

`POST /api/admin/v1/zones/e45adc1e-8638-471e-897a-5ff699d23b59/publish` → **200**

```json
{
  "command_id": "96163f23-ab7c-45bc-9259-6862eeb5ddac",
  "expected_version": 0,
  "reason": "Sandbox"
}
```

```json
{
  "id": "e45adc1e-8638-471e-897a-5ff699d23b59",
  "state": "PUBLISHED",
  "version": 1
}
```

`GET /api/driver/v1/broadcast-orders?zone_id=a08377f7-d2eb-4181-86a1-be159610df24` → **200**

```json
[
  {
    "order_id": "6ca32195-0d32-4cfc-9a35-7deb8e936a6e",
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

`GET /api/driver/v1/broadcast-orders?zone_id=be06768a-c12f-48af-ace7-1b3c6049f63f` → **200**

```json
[]
```

`GET /api/driver/v1/broadcast-orders?zone_id=e45adc1e-8638-471e-897a-5ff699d23b59` → **400**

```json
{
  "instance": "/api/driver/v1/broadcast-orders",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "1244d934-f06d-496b-9663-d2168ccf511e"
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
  "command_id": "3ae8b7b3-712e-4a5d-b443-64972cec8bd8",
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

`GET /api/operator/v1/orders/6ca32195-0d32-4cfc-9a35-7deb8e936a6e` → **200**

```json
{
  "id": "6ca32195-0d32-4cfc-9a35-7deb8e936a6e",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5a079bb9-bd87-4397-b341-6df910ecc5ee",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-31T02:06:24.601576Z",
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

`POST /api/operator/v1/orders/6ca32195-0d32-4cfc-9a35-7deb8e936a6e/cancel` → **200**

```json
{
  "command_id": "112ef348-a08d-4210-8048-e20504aa7b2f",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "6ca32195-0d32-4cfc-9a35-7deb8e936a6e",
  "short_number": 1,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "5a079bb9-bd87-4397-b341-6df910ecc5ee",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T02:06:24.601576Z",
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
  "session_id": "6ed6ae64-31e7-4286-ba40-32c3dd170f44",
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
  "last_heartbeat_at": "2026-10-31T02:06:26.236196Z",
  "last_location_at": "2026-10-31T02:06:26.236196Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6ed6ae64-31e7-4286-ba40-32c3dd170f44/close` → **200**

```json
{
  "command_id": "b36dbdf2-277b-44c4-a8bd-482031e41e69",
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
  "session_id": "f065a1c1-6c56-40da-ad7d-7d436e0f1059",
  "subject": {
    "type": "STAFF",
    "id": "13536a6b-90d5-4717-bcad-60e066f5abae"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzUzNmE2Yi05MGQ1LTQ3MTctYmNhZC02MGUwNjZmNWFiYWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MTMyODksImlhdCI6MTc5MzQxMjM4OSwianRpIjoiODk3NzJiZmUtMmUyYi00YzcwLThhYTItZjVjNTZjNDNjZTU0Iiwic2lkIjoiZjA2NWExYzEtNmM1Ni00MGRhLWFkN2QtN2Q0MzZlMGYxMDU5In0.1OzxElz0XXYFIDFILM0Wc8C3EQYZdIiMnZFU_tSDFME",
  "access_expires_at": "2026-10-31T02:21:29.836943485Z",
  "refresh_token": "IA1A4Hhg8OfkSyC5hEO7BYlE9aqLdjxTqNEW6Bs2tdI",
  "refresh_expires_at": "2026-10-31T14:06:29.836468849Z",
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
  "device_ref": "sandbox-20439"
}
```

```json
{
  "challenge_id": "f3e33829-df24-4b42-a2ad-ad80c0bca304",
  "expires_at": "2026-10-31T02:11:30.261875896Z",
  "resend_available_at": "2026-10-31T02:06:31.261875896Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "774323",
  "sent_at": "2026-10-31T02:06:30.266391192Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f3e33829-df24-4b42-a2ad-ad80c0bca304",
  "code": "774323",
  "device_ref": "sandbox-20439"
}
```

```json
{
  "session_id": "66e6dd0e-f676-43d0-84d0-aa463662f4f6",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQxMzI5MCwiaWF0IjoxNzkzNDEyMzkwLCJqdGkiOiIwYzdiZThjMi0wYWFkLTQ2MmEtYTEzOC0zYzM2MDBiMzAzYzYiLCJzaWQiOiI2NmU2ZGQwZS1mNjc2LTQzZDAtODRkMC1hYTQ2MzY2MmY0ZjYifQ.c3x8f-q9a36lFv0y73ZHhK3fdXdTMQymR_zw0w-HtTY",
  "access_expires_at": "2026-10-31T02:21:30.483018468Z",
  "refresh_token": "2ayYok_W5Tbf-vffzymjmM9EVr3agMWEqaaKksOTqeI",
  "refresh_expires_at": "2026-11-30T02:06:30.482487028Z",
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
  "command_id": "13c7660f-9eff-49a8-8397-e842b754c694",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T02:06:30Z",
    "sequence": 1793412390884
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f0f2f753-8b84-4371-8252-6bc93eabef9d",
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
  "last_heartbeat_at": "2026-10-31T02:06:30.90158Z",
  "last_location_at": "2026-10-31T02:06:30.90158Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638842792",
  "device_ref": "sandbox-28039"
}
```

```json
{
  "challenge_id": "99f3facc-a464-455b-b70d-7f3aafca1738",
  "expires_at": "2026-10-31T02:11:31.102428452Z",
  "resend_available_at": "2026-10-31T02:06:32.102428452Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638842792` → **200**

```json
{
  "phone": "+380638842792",
  "audience": "CLIENT",
  "code": "357868",
  "sent_at": "2026-10-31T02:06:31.105610021Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "99f3facc-a464-455b-b70d-7f3aafca1738",
  "code": "357868",
  "device_ref": "sandbox-28039"
}
```

```json
{
  "session_id": "6cc600ff-b6cb-4f8d-bf26-d3e68a0df72c",
  "subject": {
    "type": "CLIENT",
    "id": "2a6026d1-12af-4a43-bd83-bd314333dc0e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYTYwMjZkMS0xMmFmLTRhNDMtYmQ4My1iZDMxNDMzM2RjMGUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDEzMjkxLCJpYXQiOjE3OTM0MTIzOTEsImp0aSI6ImVkYzllYTRhLTAzNzEtNDY0Yy04YjhkLWRjMTNkODMyZTg5ZCIsInNpZCI6IjZjYzYwMGZmLWI2Y2ItNGY4ZC1iZjI2LWQzZTY4YTBkZjcyYyJ9.Sr1pBzvl_rcNQqIXnnQ9IDdgTncnnWOI0WXzlB9Me_k",
  "access_expires_at": "2026-10-31T02:21:31.327095626Z",
  "refresh_token": "6jsaczNHsHaLBu1iczv1yQF8ykv0hMmYdFcE4dYDocQ",
  "refresh_expires_at": "2026-11-30T02:06:31.325425644Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b1f5ecdf-189f-4ec7-a0cd-0c35e238475f",
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
  "id": "80b7e18d-4815-491d-a8d5-b260f76589a6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T02:11:31.529174Z",
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
  "command_id": "2e24f906-2209-4b67-9c18-e0af982cc653",
  "quote_id": "80b7e18d-4815-491d-a8d5-b260f76589a6",
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
  "id": "e8323cc7-430f-48ca-9be1-d7a290eca78e",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2a6026d1-12af-4a43-bd83-bd314333dc0e",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T02:06:31.730469Z",
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
    "id": "f43f3a74-dfd7-4c8f-af29-720a1a7099b3",
    "order_id": "e8323cc7-430f-48ca-9be1-d7a290eca78e",
    "expires_at": "2026-10-31T02:06:46.733524Z",
    "server_time": "2026-10-31T02:06:31.958899683Z",
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

`POST /api/driver/v1/offers/f43f3a74-dfd7-4c8f-af29-720a1a7099b3/accept` → **200**

```json
{
  "command_id": "24169feb-a88a-4b3c-8f27-1f86685d8cad"
}
```

```json
{
  "id": "8f14c71a-98eb-4452-b898-85ff06fceb26",
  "order_id": "e8323cc7-430f-48ca-9be1-d7a290eca78e",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d64d7e6b-6413-4a90-8f48-7fdf2be9db63",
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
  "command_id": "636b3864-5898-4dee-a99f-4ac80567c8ee",
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
  "changed_by": "13536a6b-90d5-4717-bcad-60e066f5abae",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-31T02:06:32.580691049Z"
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
  "id": "d64d7e6b-6413-4a90-8f48-7fdf2be9db63",
  "order_id": "e8323cc7-430f-48ca-9be1-d7a290eca78e",
  "assignment_id": "8f14c71a-98eb-4452-b898-85ff06fceb26",
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
  "entrance": null,
  "contact_attempts": []
}
```

`POST /api/driver/v1/work-sessions/f0f2f753-8b84-4371-8252-6bc93eabef9d/heartbeat` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T02:06:33Z",
    "sequence": 1793412393207
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f0f2f753-8b84-4371-8252-6bc93eabef9d",
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
  "last_heartbeat_at": "2026-10-31T02:06:33.241607Z",
  "last_location_at": "2026-10-31T02:06:33.241607Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/d64d7e6b-6413-4a90-8f48-7fdf2be9db63/arrive` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "39a2c9cf-1c52-4d23-8971-88a9535df546",
  "expected_version": 0
}
```

```json
{
  "id": "d64d7e6b-6413-4a90-8f48-7fdf2be9db63",
  "order_id": "e8323cc7-430f-48ca-9be1-d7a290eca78e",
  "assignment_id": "8f14c71a-98eb-4452-b898-85ff06fceb26",
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
  "arrived_at": "2026-10-31T02:06:33.451699Z",
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

`POST /api/driver/v1/trips/d64d7e6b-6413-4a90-8f48-7fdf2be9db63/start` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "24de21f3-c2ab-47dd-a2b3-1a6128dbfe0b",
  "expected_version": 1
}
```

```json
{
  "id": "d64d7e6b-6413-4a90-8f48-7fdf2be9db63",
  "order_id": "e8323cc7-430f-48ca-9be1-d7a290eca78e",
  "assignment_id": "8f14c71a-98eb-4452-b898-85ff06fceb26",
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
  "arrived_at": "2026-10-31T02:06:33.451699Z",
  "started_at": "2026-10-31T02:06:33.664036Z",
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

`POST /api/driver/v1/trips/d64d7e6b-6413-4a90-8f48-7fdf2be9db63/complete` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "688e45b5-7e67-493f-afca-a9ba18b229bd",
  "expected_version": 2,
  "reported_at": "2026-10-31T02:06:33Z",
  "cash_received": true
}
```

```json
{
  "id": "d64d7e6b-6413-4a90-8f48-7fdf2be9db63",
  "order_id": "e8323cc7-430f-48ca-9be1-d7a290eca78e",
  "assignment_id": "8f14c71a-98eb-4452-b898-85ff06fceb26",
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
  "arrived_at": "2026-10-31T02:06:33.451699Z",
  "started_at": "2026-10-31T02:06:33.664036Z",
  "completed_at": "2026-10-31T02:06:33.881148Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null,
  "comment": null,
  "entrance": null,
  "contact_attempts": []
}
```

## He closes his shift, and cannot go online again with the old app

`GET /api/driver/v1/work-sessions/current` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f0f2f753-8b84-4371-8252-6bc93eabef9d",
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
  "last_heartbeat_at": "2026-10-31T02:06:33.241607Z",
  "last_location_at": "2026-10-31T02:06:33.241607Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f0f2f753-8b84-4371-8252-6bc93eabef9d/close` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "b86d6bc4-9488-48fa-b74d-5cefe0ebb788",
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
  "command_id": "fd8914f2-66e6-4802-b05e-286edbb149f4",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T02:06:34Z",
    "sequence": 1793412394483
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
  "correlation_id": "a33b79c6-4bc4-456d-8bac-8d29f74784ba",
  "minimum_version": "9.0.0"
}
```

## After the update he can

`POST /api/driver/v1/work-sessions` (X-App-Platform: DRIVER_ANDROID X-App-Version: 9.0.0) → **201**

```json
{
  "command_id": "0d2e21ec-afe2-4b43-99f1-ec64bf2e79ac",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T02:06:34Z",
    "sequence": 1793412394693
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6c78d3ab-a04a-4adb-aefd-9a0a8b198762",
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
  "last_heartbeat_at": "2026-10-31T02:06:34.711816Z",
  "last_location_at": "2026-10-31T02:06:34.711816Z",
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
  "changed_by": "13536a6b-90d5-4717-bcad-60e066f5abae",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-31T02:06:32.580691Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "f9e4be42-d6e8-49c6-a5b6-b6bf959c8d84",
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
  "changed_by": "13536a6b-90d5-4717-bcad-60e066f5abae",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-31T02:06:35.116547706Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6c78d3ab-a04a-4adb-aefd-9a0a8b198762",
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
  "last_heartbeat_at": "2026-10-31T02:06:34.711816Z",
  "last_location_at": "2026-10-31T02:06:34.711816Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6c78d3ab-a04a-4adb-aefd-9a0a8b198762/close` → **200**

```json
{
  "command_id": "64bb6d46-2ab1-46dd-9429-a882af524f5e",
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
  "session_id": "301bc3fd-d169-4b96-8f29-be726af93b27",
  "subject": {
    "type": "STAFF",
    "id": "13536a6b-90d5-4717-bcad-60e066f5abae"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzUzNmE2Yi05MGQ1LTQ3MTctYmNhZC02MGUwNjZmNWFiYWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MTMyOTYsImlhdCI6MTc5MzQxMjM5NiwianRpIjoiODE2MDM2OGEtNTc3MS00MGE2LTkwMzQtMjYzZTVlYWM3OGNjIiwic2lkIjoiMzAxYmMzZmQtZDE2OS00Yjk2LThmMjktYmU3MjZhZjkzYjI3In0.NI350XJVFHYkXjWasbzqlHrZX0Hw-MRqdPp0p5UVK7I",
  "access_expires_at": "2026-10-31T02:21:36.039992459Z",
  "refresh_token": "oTUQfS1vuhx_Vo8Hnt7Pv8nV0PXomzZkaIeD2ES15oE",
  "refresh_expires_at": "2026-10-31T14:06:36.039355302Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "8679bf60-02d1-4e71-9cf3-b71baa341365",
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
  "id": "1c37b27c-689a-4e6b-baaf-3bf82a9e70a1",
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
  "created_by": "13536a6b-90d5-4717-bcad-60e066f5abae",
  "created_at": "2026-10-31T02:06:36.251878Z",
  "updated_at": "2026-10-31T02:06:36.251878Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630961412",
  "device_ref": "sandbox-27535"
}
```

```json
{
  "challenge_id": "997dde49-11c2-4496-b565-26d5b86e85bb",
  "expires_at": "2026-10-31T02:11:36.454200142Z",
  "resend_available_at": "2026-10-31T02:06:37.454200142Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380630961412` → **200**

```json
{
  "phone": "+380630961412",
  "audience": "CLIENT",
  "code": "853366",
  "sent_at": "2026-10-31T02:06:36.457081244Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "997dde49-11c2-4496-b565-26d5b86e85bb",
  "code": "853366",
  "device_ref": "sandbox-27535"
}
```

```json
{
  "session_id": "6a5b59ce-7901-403e-9788-124f8d982d5e",
  "subject": {
    "type": "CLIENT",
    "id": "be129a7a-31d1-4fc0-a899-a96c5b62a9f4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiZTEyOWE3YS0zMWQxLTRmYzAtYTg5OS1hOTZjNWI2MmE5ZjQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDEzMjk2LCJpYXQiOjE3OTM0MTIzOTYsImp0aSI6Ijg5MjQ2MDk0LWJhZjMtNDEzYi1hNDM4LTQxZWQ5MDE1NTQ5ZiIsInNpZCI6IjZhNWI1OWNlLTc5MDEtNDAzZS05Nzg4LTEyNGY4ZDk4MmQ1ZSJ9.BYCpQq1CYfW6E7bCi9yAp_JYGUgNJeg1ewY-sA9ecWE",
  "access_expires_at": "2026-10-31T02:21:36.671845315Z",
  "refresh_token": "457sVH2G4NgQnTpphXfioFNZuNOqoFrzhbjKNovyWtk",
  "refresh_expires_at": "2026-11-30T02:06:36.671342497Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380630961412` → **200**

```json
{
  "client_id": "be129a7a-31d1-4fc0-a899-a96c5b62a9f4"
}
```

`POST /api/admin/v1/rider-wallets/be129a7a-31d1-4fc0-a899-a96c5b62a9f4/top-ups` → **201**

```json
{
  "command_id": "5150bff2-7d7c-4dda-9b2e-5dd5761fd958",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "be129a7a-31d1-4fc0-a899-a96c5b62a9f4",
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
      "id": "7a5fafd1-4e8a-4a7b-b2fd-164dab22d341",
      "at": "2026-10-31T02:06:37.065591Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "13536a6b-90d5-4717-bcad-60e066f5abae",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "9b9aa153-aab8-41cb-b698-b9119ab3ce3d",
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
  "id": "5e5aa197-3176-4902-8f9e-b3dcba2e52e4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T02:11:37.273765Z",
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
      "id": "1c37b27c-689a-4e6b-baaf-3bf82a9e70a1",
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
  "device_ref": "sandbox-608"
}
```

```json
{
  "challenge_id": "ba770f2c-1f45-4141-b513-8951846b4879",
  "expires_at": "2026-10-31T02:11:37.477714755Z",
  "resend_available_at": "2026-10-31T02:06:38.477714755Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "734544",
  "sent_at": "2026-10-31T02:06:37.479901505Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ba770f2c-1f45-4141-b513-8951846b4879",
  "code": "734544",
  "device_ref": "sandbox-608"
}
```

```json
{
  "session_id": "08277dee-9e4a-4940-b4bc-3404860c561b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQxMzI5NywiaWF0IjoxNzkzNDEyMzk3LCJqdGkiOiI3MmZiYzhjNy04MzFkLTQ3YzktOWY5MS02NDMxMGExZWNiODciLCJzaWQiOiIwODI3N2RlZS05ZTRhLTQ5NDAtYjRiYy0zNDA0ODYwYzU2MWIifQ.ZgBqsHocYYS5hysUQqAlmF9Ho4BFYK_T8vah_25wC08",
  "access_expires_at": "2026-10-31T02:21:37.692238292Z",
  "refresh_token": "UT4Ih3tpPpMwFqmGO9UeAehbzvh7wNJYfmiEEGMSzhU",
  "refresh_expires_at": "2026-11-30T02:06:37.691682496Z",
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
  "command_id": "7842bfeb-e7df-4128-a7e8-1363bfeb548b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T02:06:38Z",
    "sequence": 1793412398859
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a56fcfea-53a6-4e04-a703-8ade7a73b7b7",
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
  "last_heartbeat_at": "2026-10-31T02:06:38.102351Z",
  "last_location_at": "2026-10-31T02:06:38.102351Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "8ed2698d-d451-4ca9-95d0-a78fd5b6e69c",
  "quote_id": "5e5aa197-3176-4902-8f9e-b3dcba2e52e4",
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
  "id": "d05897fa-daa2-4e73-9736-d04afe0d3876",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "be129a7a-31d1-4fc0-a899-a96c5b62a9f4",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T02:06:38.30669Z",
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
  "client_id": "be129a7a-31d1-4fc0-a899-a96c5b62a9f4",
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
      "id": "7a5fafd1-4e8a-4a7b-b2fd-164dab22d341",
      "at": "2026-10-31T02:06:37.065591Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "13536a6b-90d5-4717-bcad-60e066f5abae",
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
    "id": "0b1c0955-03d6-44ab-8219-4297fc2db215",
    "order_id": "d05897fa-daa2-4e73-9736-d04afe0d3876",
    "expires_at": "2026-10-31T02:06:53.312532Z",
    "server_time": "2026-10-31T02:06:38.73468269Z",
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

`POST /api/driver/v1/offers/0b1c0955-03d6-44ab-8219-4297fc2db215/accept` → **200**

```json
{
  "command_id": "9cc1792f-7f6d-4a9d-8106-9df5c5acf3e5"
}
```

```json
{
  "id": "f4fc47fb-bb08-4337-b64e-8800d3261cf5",
  "order_id": "d05897fa-daa2-4e73-9736-d04afe0d3876",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a6322261-8142-45d4-aefe-c30e9ff65073",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a6322261-8142-45d4-aefe-c30e9ff65073",
  "order_id": "d05897fa-daa2-4e73-9736-d04afe0d3876",
  "assignment_id": "f4fc47fb-bb08-4337-b64e-8800d3261cf5",
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
  "entrance": null,
  "contact_attempts": []
}
```

(the car drives 3 s to the next point)

`POST /api/driver/v1/work-sessions/a56fcfea-53a6-4e04-a703-8ade7a73b7b7/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T02:06:42Z",
    "sequence": 1793412402341
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a56fcfea-53a6-4e04-a703-8ade7a73b7b7",
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
  "last_heartbeat_at": "2026-10-31T02:06:42.358252Z",
  "last_location_at": "2026-10-31T02:06:42.358252Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/a6322261-8142-45d4-aefe-c30e9ff65073/arrive` → **200**

```json
{
  "command_id": "aa0fbe79-12a3-421b-b8b1-dcecbe910eb7",
  "expected_version": 0
}
```

```json
{
  "id": "a6322261-8142-45d4-aefe-c30e9ff65073",
  "order_id": "d05897fa-daa2-4e73-9736-d04afe0d3876",
  "assignment_id": "f4fc47fb-bb08-4337-b64e-8800d3261cf5",
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
  "arrived_at": "2026-10-31T02:06:42.559516Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null,
  "comment": null,
  "entrance": null,
  "contact_attempts": []
}
```

`POST /api/driver/v1/trips/a6322261-8142-45d4-aefe-c30e9ff65073/start` → **200**

```json
{
  "command_id": "808bd681-b6a1-4a78-9a39-1297a43dbb57",
  "expected_version": 1
}
```

```json
{
  "id": "a6322261-8142-45d4-aefe-c30e9ff65073",
  "order_id": "d05897fa-daa2-4e73-9736-d04afe0d3876",
  "assignment_id": "f4fc47fb-bb08-4337-b64e-8800d3261cf5",
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
  "arrived_at": "2026-10-31T02:06:42.559516Z",
  "started_at": "2026-10-31T02:06:42.765033Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null,
  "comment": null,
  "entrance": null,
  "contact_attempts": []
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/a6322261-8142-45d4-aefe-c30e9ff65073/complete` → **200**

```json
{
  "command_id": "311b3a5d-2eab-48b7-b626-69bb152cdd89",
  "expected_version": 2,
  "reported_at": "2026-10-31T02:06:42Z",
  "cash_received": true
}
```

```json
{
  "id": "a6322261-8142-45d4-aefe-c30e9ff65073",
  "order_id": "d05897fa-daa2-4e73-9736-d04afe0d3876",
  "assignment_id": "f4fc47fb-bb08-4337-b64e-8800d3261cf5",
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
  "arrived_at": "2026-10-31T02:06:42.559516Z",
  "started_at": "2026-10-31T02:06:42.765033Z",
  "completed_at": "2026-10-31T02:06:42.980756Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null,
  "comment": null,
  "entrance": null,
  "contact_attempts": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "be129a7a-31d1-4fc0-a899-a96c5b62a9f4",
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
      "id": "791de7b1-ca3b-4625-8909-32bfb651acf9",
      "at": "2026-10-31T02:06:43.508269Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "d05897fa-daa2-4e73-9736-d04afe0d3876"
    },
    {
      "id": "7a5fafd1-4e8a-4a7b-b2fd-164dab22d341",
      "at": "2026-10-31T02:06:37.065591Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "13536a6b-90d5-4717-bcad-60e066f5abae",
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

`POST /api/admin/v1/promotions/1c37b27c-689a-4e6b-baaf-3bf82a9e70a1/archive` → **200**

```json
{
  "command_id": "08b9aa2a-f766-47d6-9ca7-cad00e4cdcb6",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "1c37b27c-689a-4e6b-baaf-3bf82a9e70a1",
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
  "created_by": "13536a6b-90d5-4717-bcad-60e066f5abae",
  "created_at": "2026-10-31T02:06:36.251878Z",
  "updated_at": "2026-10-31T02:06:46.400885Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a56fcfea-53a6-4e04-a703-8ade7a73b7b7",
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
  "last_heartbeat_at": "2026-10-31T02:06:42.358252Z",
  "last_location_at": "2026-10-31T02:06:42.358252Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a56fcfea-53a6-4e04-a703-8ade7a73b7b7/close` → **200**

```json
{
  "command_id": "1a090bf0-3cd1-415a-b075-ac25ca7453fa",
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

Done: order d05897fa-daa2-4e73-9736-d04afe0d3876.

# Scenario: broadcast-abuse

## Anna goes online in Warsaw

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000002",
  "device_ref": "sandbox-8336"
}
```

```json
{
  "challenge_id": "4ae41197-6cc0-4dad-8d9a-3cd18f50df32",
  "expires_at": "2026-10-31T02:11:47.065841857Z",
  "resend_available_at": "2026-10-31T02:06:48.065841857Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000002` → **200**

```json
{
  "phone": "+48500000002",
  "audience": "DRIVER",
  "code": "197290",
  "sent_at": "2026-10-31T02:06:47.068453771Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4ae41197-6cc0-4dad-8d9a-3cd18f50df32",
  "code": "197290",
  "device_ref": "sandbox-8336"
}
```

```json
{
  "session_id": "003592e9-d1ee-41c1-82c4-3abfe2873c8e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000405"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDUiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQxMzMwNywiaWF0IjoxNzkzNDEyNDA3LCJqdGkiOiJjMGE4NzgzYy1kYTFjLTQwYzItYTdkYi1hZDM3Y2M1YWZmNmMiLCJzaWQiOiIwMDM1OTJlOS1kMWVlLTQxYzEtODJjNC0zYWJmZTI4NzNjOGUifQ.OHVDe8bulV_ivei9bPNnZC3Pmyc1CvWj5iK-hmCINTs",
  "access_expires_at": "2026-10-31T02:21:47.277111433Z",
  "refresh_token": "qRFgumvjcx3IIjYYBtVYA4QDj3_H-lq02vXHsK7gZN4",
  "refresh_expires_at": "2026-11-30T02:06:47.276668105Z",
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
  "command_id": "6797c9ae-fcf3-4303-843f-c75ffa357087",
  "vehicle_id": "5a000000-0000-4000-8000-000000000505",
  "location": {
    "lat": 52.2297,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T02:06:47Z",
    "sequence": 1793412407857
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "2c552066-334b-4cbe-b817-b89539baa985",
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
  "last_heartbeat_at": "2026-10-31T02:06:47.874809Z",
  "last_location_at": "2026-10-31T02:06:47.874809Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## 5 seconds later her phone reports Lviv: not taken as her position

`POST /api/driver/v1/work-sessions/2c552066-334b-4cbe-b817-b89539baa985/heartbeat` → **200**

```json
{
  "location": {
    "lat": 49.8397,
    "lon": 24.0297,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T02:06:53Z",
    "sequence": 1793412413692
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "2c552066-334b-4cbe-b817-b89539baa985",
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
  "last_heartbeat_at": "2026-10-31T02:06:53.085448Z",
  "last_location_at": "2026-10-31T02:06:47.874809Z",
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
  "session_id": "86acd26c-cec8-411b-8a94-9c97e24b75aa",
  "subject": {
    "type": "STAFF",
    "id": "13536a6b-90d5-4717-bcad-60e066f5abae"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzUzNmE2Yi05MGQ1LTQ3MTctYmNhZC02MGUwNjZmNWFiYWUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MTMzMTMsImlhdCI6MTc5MzQxMjQxMywianRpIjoiNGJhZjcyNDEtNmIyYS00MjMwLWE2MWUtMDQ5ZGFlYjgzNDdlIiwic2lkIjoiODZhY2QyNmMtY2VjOC00MTFiLThhOTQtOWM5N2UyNGI3NWFhIn0.qy6eLrRgK8yt1cp_l_1O8pTRBs2zLwGh0H-D8sF4TgA",
  "access_expires_at": "2026-10-31T02:21:53.48452501Z",
  "refresh_token": "ctyTxkrhtA7cIR6HJluHGQSBisS2h81TfMO2Ky2fqQ8",
  "refresh_expires_at": "2026-10-31T14:06:53.484171905Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "at": "2026-10-31T02:06:53.670272962Z",
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
      "last_location_at": "2026-10-31T02:06:47.874809Z",
      "last_heartbeat_at": "2026-10-31T02:06:53.085448Z",
      "order_id": null
    }
  ]
}
```

## A fix next to the last accepted one is taken again

`POST /api/driver/v1/work-sessions/2c552066-334b-4cbe-b817-b89539baa985/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2299,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T02:06:53Z",
    "sequence": 1793412413871
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "2c552066-334b-4cbe-b817-b89539baa985",
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
  "last_heartbeat_at": "2026-10-31T02:06:53.889212Z",
  "last_location_at": "2026-10-31T02:06:53.889212Z",
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
  "session_id": "2c552066-334b-4cbe-b817-b89539baa985",
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
  "last_heartbeat_at": "2026-10-31T02:06:53.889212Z",
  "last_location_at": "2026-10-31T02:06:53.889212Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2c552066-334b-4cbe-b817-b89539baa985/close` → **200**

```json
{
  "command_id": "78c9293a-2a76-481b-ae7e-3e0bffbfd8cb",
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
  "device_ref": "sandbox-1505"
}
```

```json
{
  "challenge_id": "e1353f88-b4e1-4c9a-bd05-a56ce6efbd9c",
  "expires_at": "2026-10-31T02:11:54.478679939Z",
  "resend_available_at": "2026-10-31T02:06:55.478679939Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "893977",
  "sent_at": "2026-10-31T02:06:54.481393058Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e1353f88-b4e1-4c9a-bd05-a56ce6efbd9c",
  "code": "893977",
  "device_ref": "sandbox-1505"
}
```

```json
{
  "session_id": "73627c4d-00d0-4aad-b137-e155f08d51a1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQxMzMxNCwiaWF0IjoxNzkzNDEyNDE0LCJqdGkiOiI1ZDQyY2RmYy0yZWUzLTRhYmQtYWQxOC0xMDIwMWE2NzAzOWIiLCJzaWQiOiI3MzYyN2M0ZC0wMGQwLTRhYWQtYjEzNy1lMTU1ZjA4ZDUxYTEifQ.EpqdX87FWAlrS7g2YGRTHBCeKMesv-5iOcqFqaWzAQU",
  "access_expires_at": "2026-10-31T02:21:54.688785443Z",
  "refresh_token": "7hs_4CZYtMrWupWtxXoBOOvWrboOFxNfLURRKqoZIPA",
  "refresh_expires_at": "2026-11-30T02:06:54.688324177Z",
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
  "device_ref": "sandbox-16803"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "f16d97cc-d44e-4df0-8a95-6dab517356c6",
  "retryable": true,
  "retry_after_seconds": 1
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000001",
  "device_ref": "sandbox-16803"
}
```

```json
{
  "challenge_id": "269c2544-e5e6-4fe7-807f-2153fb6f3a77",
  "expires_at": "2026-10-31T02:11:56.281449025Z",
  "resend_available_at": "2026-10-31T02:06:57.281449025Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "513166",
  "sent_at": "2026-10-31T02:06:56.283621545Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "269c2544-e5e6-4fe7-807f-2153fb6f3a77",
  "code": "513166",
  "device_ref": "sandbox-16803"
}
```

```json
{
  "session_id": "03017612-1494-4343-8221-7afbfd7eafb8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQxMzMxNiwiaWF0IjoxNzkzNDEyNDE2LCJqdGkiOiI1YmU4NWNhZi1mYmIyLTRkYTctOTU5Yy0xZTFmOTRiZDZiOTMiLCJzaWQiOiIwMzAxNzYxMi0xNDk0LTQzNDMtODIyMS03YWZiZmQ3ZWFmYjgifQ.jTgISTL2MHIH6-NDF7AJxJHsYYvWiQAzKwKLC13hlg0",
  "access_expires_at": "2026-10-31T02:21:56.490430926Z",
  "refresh_token": "4sSZC4A_Lf6fOmiexjEV--P3RcqTFMMnw1xj5fTkW6Q",
  "refresh_expires_at": "2026-11-30T02:06:56.489967557Z",
  "account_created": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000002",
  "device_ref": "sandbox-1905"
}
```

```json
{
  "challenge_id": "980835fb-97ca-48b1-9db2-06ce5549d573",
  "expires_at": "2026-10-31T02:11:56.683098902Z",
  "resend_available_at": "2026-10-31T02:06:57.683098902Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000002` → **200**

```json
{
  "phone": "+48500000002",
  "audience": "DRIVER",
  "code": "109915",
  "sent_at": "2026-10-31T02:06:56.685957301Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "980835fb-97ca-48b1-9db2-06ce5549d573",
  "code": "109915",
  "device_ref": "sandbox-1905"
}
```

```json
{
  "session_id": "8f58b009-ef43-4fa6-b4f3-806edd90da21",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000405"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDUiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQxMzMxNiwiaWF0IjoxNzkzNDEyNDE2LCJqdGkiOiJiMzVlMzM5ZC1iNTcyLTRhN2YtYjZiNS1hY2VkOWU5MDc1ZDciLCJzaWQiOiI4ZjU4YjAwOS1lZjQzLTRmYTYtYjRmMy04MDZlZGQ5MGRhMjEifQ.qU3ytaxkDoAo0cCPYsd9o4d3p3RNRjm7j1Q_geMymAs",
  "access_expires_at": "2026-10-31T02:21:56.931080372Z",
  "refresh_token": "ciDtuVWxVvR41cA7eX_n8PRUfgxORmjDvzE7CuKqj0Q",
  "refresh_expires_at": "2026-11-30T02:06:56.930709932Z",
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
  "command_id": "4efc264f-605e-4490-96ae-ed336a6302d3",
  "vehicle_id": "5a000000-0000-4000-8000-000000000505",
  "location": {
    "lat": 52.2297,
    "lon": 21.1700,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T02:10:01Z",
    "sequence": 1793412601495
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "88427add-dd4d-47b4-8f95-2bd8e27becf3",
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
  "last_heartbeat_at": "2026-10-31T02:10:01.510953Z",
  "last_location_at": "2026-10-31T02:10:01.510953Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders: nobody is near, the order goes to the ALL tab

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600355298",
  "device_ref": "sandbox-17391"
}
```

```json
{
  "challenge_id": "4f907558-c35c-4486-a907-97aa309335d7",
  "expires_at": "2026-10-31T02:15:01.715972388Z",
  "resend_available_at": "2026-10-31T02:10:02.715972388Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600355298` → **200**

```json
{
  "phone": "+48600355298",
  "audience": "CLIENT",
  "code": "110197",
  "sent_at": "2026-10-31T02:10:01.727155914Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4f907558-c35c-4486-a907-97aa309335d7",
  "code": "110197",
  "device_ref": "sandbox-17391"
}
```

```json
{
  "session_id": "8aaffb42-194f-4058-94b3-498d4c0f4c1b",
  "subject": {
    "type": "CLIENT",
    "id": "2545e4eb-e428-4737-a29b-77fef9cd9db0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNTQ1ZTRlYi1lNDI4LTQ3MzctYTI5Yi03N2ZlZjljZDlkYjAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDEzNTAxLCJpYXQiOjE3OTM0MTI2MDEsImp0aSI6ImQ5OTg2MTA3LWI1YmUtNGU4MS1iYTE3LWY3ZDIxZDYxMTUxYiIsInNpZCI6IjhhYWZmYjQyLTE5NGYtNDA1OC05NGIzLTQ5OGQ0YzBmNGMxYiJ9.ObAOmdokntpieNVaWLl2309JoPkv5rkh5Fss_jdGmIE",
  "access_expires_at": "2026-10-31T02:25:01.959046424Z",
  "refresh_token": "DHx2Uj-JPXJ3MlKiskqlLlq6BlCJXHcWPV06cZC5540",
  "refresh_expires_at": "2026-11-30T02:10:01.958645824Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "357085dd-c292-47e3-be3e-d116aa807dce",
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
  "id": "f0cc04f8-2760-4c6b-aac9-29e76d9308ed",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 4942,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T02:15:02.145117Z",
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
  "command_id": "801e8072-c6e4-4556-b491-24915c14b5f7",
  "quote_id": "f0cc04f8-2760-4c6b-aac9-29e76d9308ed",
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
  "id": "dcccd8cf-0247-45a1-8f64-01a28b38f015",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2545e4eb-e428-4737-a29b-77fef9cd9db0",
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
  "created_at": "2026-10-31T02:10:02.337692Z",
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

`GET /api/rider/v1/orders/dcccd8cf-0247-45a1-8f64-01a28b38f015` → **200**

```json
{
  "id": "dcccd8cf-0247-45a1-8f64-01a28b38f015",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2545e4eb-e428-4737-a29b-77fef9cd9db0",
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
  "created_at": "2026-10-31T02:10:02.337692Z",
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

`POST /api/driver/v1/orders/dcccd8cf-0247-45a1-8f64-01a28b38f015/claim` → **422**

```json
{
  "command_id": "8c380c4d-b95a-4553-ac29-fdde235229ac"
}
```

```json
{
  "instance": "/api/driver/v1/orders/dcccd8cf-0247-45a1-8f64-01a28b38f015/claim",
  "status": 422,
  "title": "Pickup too far",
  "type": "https://errors.blizz.taxi/pickup-too-far",
  "code": "PICKUP_TOO_FAR",
  "correlation_id": "5814d816-8a72-4a2d-a223-10127bd90496"
}
```

`GET /api/rider/v1/orders/dcccd8cf-0247-45a1-8f64-01a28b38f015` → **200**

```json
{
  "id": "dcccd8cf-0247-45a1-8f64-01a28b38f015",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2545e4eb-e428-4737-a29b-77fef9cd9db0",
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
  "created_at": "2026-10-31T02:10:02.337692Z",
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

`POST /api/driver/v1/orders/65f9a046-d2ec-4054-91f3-6fbdf9cb6c74/claim` → **404**

```json
{
  "command_id": "c9e1da3a-1af9-49c3-bfe8-1fc43b55f0e1"
}
```

```json
{
  "instance": "/api/driver/v1/orders/65f9a046-d2ec-4054-91f3-6fbdf9cb6c74/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "59b99ea4-a981-487d-a968-df5a47de2f07"
}
```

`POST /api/driver/v1/orders/27543160-1eeb-450e-a22e-6f70b5f00906/claim` → **404**

```json
{
  "command_id": "be97143f-1098-4f9d-a3e8-db8d0b7ca439"
}
```

```json
{
  "instance": "/api/driver/v1/orders/27543160-1eeb-450e-a22e-6f70b5f00906/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "bd8a1932-1466-4136-9788-5e80463c4b1e"
}
```

`POST /api/driver/v1/orders/423a8fb3-8dfa-42ad-bfcf-839e4cf43b39/claim` → **404**

```json
{
  "command_id": "22d5aacb-5372-4a4c-a4e6-77e4c9e4f53d"
}
```

```json
{
  "instance": "/api/driver/v1/orders/423a8fb3-8dfa-42ad-bfcf-839e4cf43b39/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "4e3c9ff2-bd9b-4f6c-a26e-4d772fd1a8a3"
}
```

`POST /api/driver/v1/orders/4d63d6d9-de75-4132-bbf3-9e5be7127cf6/claim` → **404**

```json
{
  "command_id": "bbea5765-d3ea-44b0-9973-ab8a943166d1"
}
```

```json
{
  "instance": "/api/driver/v1/orders/4d63d6d9-de75-4132-bbf3-9e5be7127cf6/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "d9eb12c4-2d00-4181-9cd7-45cffad1e2d0"
}
```

`POST /api/driver/v1/orders/a173bc87-1702-42a8-8722-91403296de17/claim` → **404**

```json
{
  "command_id": "2d28ab69-e4c8-4e06-a3b0-135bc1200151"
}
```

```json
{
  "instance": "/api/driver/v1/orders/a173bc87-1702-42a8-8722-91403296de17/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "5b8e401e-eb93-4707-96d7-72e94b095e98"
}
```

`POST /api/driver/v1/orders/92c3289d-ae64-4121-889c-9c8a0a94ec4d/claim` → **404**

```json
{
  "command_id": "da5ae9a4-69d9-4b4e-8e25-e5b8246b1962"
}
```

```json
{
  "instance": "/api/driver/v1/orders/92c3289d-ae64-4121-889c-9c8a0a94ec4d/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "61959d59-6bd4-4ec8-be35-1721f29057a8"
}
```

`POST /api/driver/v1/orders/bd081dc6-26e7-43c7-8f99-48c876a7b606/claim` → **404**

```json
{
  "command_id": "94bada21-a96a-4f08-84cd-e4498cb7e318"
}
```

```json
{
  "instance": "/api/driver/v1/orders/bd081dc6-26e7-43c7-8f99-48c876a7b606/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "682fc8e6-e2c8-4d85-8336-9d0f8b6ced0a"
}
```

`POST /api/driver/v1/orders/a6de6817-a0e0-43f6-b4e3-e0ee1839b8bd/claim` → **404**

```json
{
  "command_id": "72c88e0c-6b99-41b0-821c-38e7600b7d6f"
}
```

```json
{
  "instance": "/api/driver/v1/orders/a6de6817-a0e0-43f6-b4e3-e0ee1839b8bd/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "308f1865-0937-4b0d-9948-c3547037c9f4"
}
```

`POST /api/driver/v1/orders/6a358434-1a2d-4431-917b-8b8299be2707/claim` → **404**

```json
{
  "command_id": "657e4b15-9e8c-421d-9e0b-41cdd0770c4c"
}
```

```json
{
  "instance": "/api/driver/v1/orders/6a358434-1a2d-4431-917b-8b8299be2707/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "a3325ee5-61ac-47c0-a1f9-a26d0f0d2151"
}
```

`POST /api/driver/v1/orders/d258d9b6-aa71-47bd-ab6f-5523b92c17f1/claim` → **404**

```json
{
  "command_id": "5ee1bd9b-82ba-4a2b-9d2a-1ca282cfa007"
}
```

```json
{
  "instance": "/api/driver/v1/orders/d258d9b6-aa71-47bd-ab6f-5523b92c17f1/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "5a49ae2f-76f7-42d0-9cb5-7d04befc516e"
}
```

`POST /api/driver/v1/orders/1ce7dfd7-76b6-440d-a352-9699e0aef435/claim` → **404**

```json
{
  "command_id": "03adbe91-9a8c-43a5-9df3-1aff4af5f9c2"
}
```

```json
{
  "instance": "/api/driver/v1/orders/1ce7dfd7-76b6-440d-a352-9699e0aef435/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "fd08f8bf-5d0e-4219-b761-31f2d7c6f0bf"
}
```

`POST /api/driver/v1/orders/83093174-bfec-451d-8daa-8ccb45887735/claim` → **404**

```json
{
  "command_id": "14de87b1-3b55-480a-81a5-daefa3160f98"
}
```

```json
{
  "instance": "/api/driver/v1/orders/83093174-bfec-451d-8daa-8ccb45887735/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "8a991810-4345-411f-bf00-11051e85c3c8"
}
```

`POST /api/driver/v1/orders/0d7fb3f4-c5df-4b96-b22c-7a6117e37d9e/claim` → **404**

```json
{
  "command_id": "0ba94f38-3e04-45d2-be27-4fa06a2163da"
}
```

```json
{
  "instance": "/api/driver/v1/orders/0d7fb3f4-c5df-4b96-b22c-7a6117e37d9e/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "ea6e1026-6fe2-4680-aeb9-1e0bd2bfdb70"
}
```

`POST /api/driver/v1/orders/d41fc3fe-27ca-422e-a138-af5c9918c855/claim` → **404**

```json
{
  "command_id": "e9e9f62b-5f19-4451-8d92-bf5533e3545b"
}
```

```json
{
  "instance": "/api/driver/v1/orders/d41fc3fe-27ca-422e-a138-af5c9918c855/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "af5633ac-0a98-4a13-878f-c8201b2fc37c"
}
```

`POST /api/driver/v1/orders/92b52083-8e0a-46b7-afa2-4d6ce618f097/claim` → **404**

```json
{
  "command_id": "d1ff0ce2-a9c0-4633-ac1d-a549f624e224"
}
```

```json
{
  "instance": "/api/driver/v1/orders/92b52083-8e0a-46b7-afa2-4d6ce618f097/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "5419da5b-4b55-42da-a83a-19ed46a3a20f"
}
```

`POST /api/driver/v1/orders/a78e70ae-4978-4045-9d98-d8705becaf7c/claim` → **404**

```json
{
  "command_id": "5f8fb5a1-99e5-4fec-a57a-9d62d4977933"
}
```

```json
{
  "instance": "/api/driver/v1/orders/a78e70ae-4978-4045-9d98-d8705becaf7c/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "5bdf880c-c52f-4add-86f6-94b307fdcf38"
}
```

`POST /api/driver/v1/orders/1bb26f61-e42c-429a-b666-0fd086b3b1a1/claim` → **404**

```json
{
  "command_id": "856f274c-e0d5-487c-a66f-27f8592ae13f"
}
```

```json
{
  "instance": "/api/driver/v1/orders/1bb26f61-e42c-429a-b666-0fd086b3b1a1/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "8bb1b43a-919e-4271-a23b-98bae8d1be19"
}
```

`POST /api/driver/v1/orders/75d117ab-c0f6-4c94-b0a6-de1a1b18491d/claim` → **404**

```json
{
  "command_id": "d6f83898-ab7e-422c-b463-2667f18d9fa5"
}
```

```json
{
  "instance": "/api/driver/v1/orders/75d117ab-c0f6-4c94-b0a6-de1a1b18491d/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "f7caea14-5824-4d69-802c-b385a7099aa2"
}
```

`POST /api/driver/v1/orders/a5c1fca9-f2cc-4b9e-9de6-2c95cedfb997/claim` → **404**

```json
{
  "command_id": "942bc4be-96a5-4197-807f-67646c9fe878"
}
```

```json
{
  "instance": "/api/driver/v1/orders/a5c1fca9-f2cc-4b9e-9de6-2c95cedfb997/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "e61c0e53-be95-4f6d-9a21-52bf4e7b705a"
}
```

`POST /api/driver/v1/orders/b03bc7a0-8c04-451b-aea9-f3ee0cf46b57/claim` → **404**

```json
{
  "command_id": "17033a38-5ede-49d5-a107-3580935eac77"
}
```

```json
{
  "instance": "/api/driver/v1/orders/b03bc7a0-8c04-451b-aea9-f3ee0cf46b57/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "6b44ba30-7487-48db-943e-6b6f8633ad89"
}
```

`POST /api/driver/v1/orders/4ba7f3e3-b073-413a-9605-c15b06add952/claim` → **404**

```json
{
  "command_id": "c34b6025-2c62-4aec-9be0-50209c6ad145"
}
```

```json
{
  "instance": "/api/driver/v1/orders/4ba7f3e3-b073-413a-9605-c15b06add952/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "83f737b3-6833-4b98-b782-d42f35ea1e55"
}
```

`POST /api/driver/v1/orders/73d41aa3-0d01-4310-b332-c75869a52c66/claim` → **404**

```json
{
  "command_id": "02ab2c52-0fb5-4855-9cd7-aa7811c27546"
}
```

```json
{
  "instance": "/api/driver/v1/orders/73d41aa3-0d01-4310-b332-c75869a52c66/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "15fccc1e-831a-429f-bec8-3095cb4e5dd4"
}
```

`POST /api/driver/v1/orders/e1794d11-d030-4ec8-af11-d633a1ec64dd/claim` → **404**

```json
{
  "command_id": "06d5c0cb-4f53-4de8-ba0b-4e17fdad69d2"
}
```

```json
{
  "instance": "/api/driver/v1/orders/e1794d11-d030-4ec8-af11-d633a1ec64dd/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "37a4cfe8-3a6c-4a00-8708-2064cbed7fbc"
}
```

`POST /api/driver/v1/orders/0dc9396e-87f4-4e88-9cff-07f7b8c817e2/claim` → **404**

```json
{
  "command_id": "375ceae8-5942-482a-93f5-2eba2f71cba3"
}
```

```json
{
  "instance": "/api/driver/v1/orders/0dc9396e-87f4-4e88-9cff-07f7b8c817e2/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "ff3f6224-9ede-42a7-898c-4c022a5e5d4f"
}
```

`POST /api/driver/v1/orders/f595b894-aa0e-42b4-8829-f76c2144db2a/claim` → **404**

```json
{
  "command_id": "6aef77ab-5405-4aab-be1c-843e3ab8667c"
}
```

```json
{
  "instance": "/api/driver/v1/orders/f595b894-aa0e-42b4-8829-f76c2144db2a/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "d361e362-7b58-413b-b1df-6b95fb8a29eb"
}
```

`POST /api/driver/v1/orders/d1f319f6-f046-444f-82b1-1bcd8906187e/claim` → **404**

```json
{
  "command_id": "dfac7335-1daf-4033-bca1-c9f84ef3cb0b"
}
```

```json
{
  "instance": "/api/driver/v1/orders/d1f319f6-f046-444f-82b1-1bcd8906187e/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "7b89fe65-fdd7-4bc4-96f8-5330bf754e99"
}
```

`POST /api/driver/v1/orders/40728d12-1aa1-486a-90af-630b3a3386d0/claim` → **404**

```json
{
  "command_id": "948b387f-190c-474b-9030-e96143fa62e2"
}
```

```json
{
  "instance": "/api/driver/v1/orders/40728d12-1aa1-486a-90af-630b3a3386d0/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "83317d3e-9721-45c5-ad75-3a543bb470a6"
}
```

`POST /api/driver/v1/orders/028bac0b-6191-49c6-881d-df92936f32f5/claim` → **404**

```json
{
  "command_id": "15908693-3afb-466a-9307-3ee36f75debd"
}
```

```json
{
  "instance": "/api/driver/v1/orders/028bac0b-6191-49c6-881d-df92936f32f5/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "b1392cde-9359-4937-8e6e-ae8f4b7c1f9d"
}
```

`POST /api/driver/v1/orders/c19384f7-4379-44f9-91e6-9ba9c356d385/claim` → **404**

```json
{
  "command_id": "2855c3da-d737-4bc1-9ad8-e160de6ce09b"
}
```

```json
{
  "instance": "/api/driver/v1/orders/c19384f7-4379-44f9-91e6-9ba9c356d385/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "7ed162ca-d2bc-4df2-b2ed-4a0b04996513"
}
```

`POST /api/driver/v1/orders/13ec5c36-cb4b-4203-a92d-21621c767443/claim` → **429**

```json
{
  "command_id": "24cda7b9-7034-46a0-b21b-2307a246e3b7"
}
```

```json
{
  "instance": "/api/driver/v1/orders/13ec5c36-cb4b-4203-a92d-21621c767443/claim",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "94eb7295-db8a-4b0b-8113-3d6433bfd231",
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
  "command_id": "cc976d6b-5981-4a6d-b5ee-e6623aa1ea41",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T02:10:09Z",
    "sequence": 1793412609323
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "a408247d-dd59-4c9f-9b96-516b71e21ef8",
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
  "last_heartbeat_at": "2026-10-31T02:10:09.338541Z",
  "last_location_at": "2026-10-31T02:10:09.338541Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/broadcast-orders` → **200**

```json
[
  {
    "order_id": "dcccd8cf-0247-45a1-8f64-01a28b38f015",
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

`POST /api/driver/v1/orders/dcccd8cf-0247-45a1-8f64-01a28b38f015/claim` → **409**

```json
{
  "command_id": "be910997-fb58-4772-bded-45db591e51f6"
}
```

```json
{
  "instance": "/api/driver/v1/orders/dcccd8cf-0247-45a1-8f64-01a28b38f015/claim",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "9462b3c1-ca2f-4df5-92aa-b999307dcd35"
}
```

`POST /api/driver/v1/orders/dcccd8cf-0247-45a1-8f64-01a28b38f015/claim` → **200**

```json
{
  "command_id": "f28ecab3-4f3b-4e69-bcb5-901be02ac78c"
}
```

```json
{
  "id": "db322821-0a0b-48df-8043-d6961d34751e",
  "order_id": "dcccd8cf-0247-45a1-8f64-01a28b38f015",
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "source": "BROADCAST",
  "state": "COMMITTED",
  "trip_id": "db4ed3c6-596c-45ef-83da-16476c47f0bb",
  "trip_phase": "TO_PICKUP"
}
```

## Piotr cancels at the rider's request (sandbox clean-up)

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "db4ed3c6-596c-45ef-83da-16476c47f0bb",
  "order_id": "dcccd8cf-0247-45a1-8f64-01a28b38f015",
  "assignment_id": "db322821-0a0b-48df-8043-d6961d34751e",
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
  "entrance": null,
  "contact_attempts": []
}
```

`POST /api/driver/v1/trips/db4ed3c6-596c-45ef-83da-16476c47f0bb/cancel` → **200**

```json
{
  "command_id": "6421938d-ec67-42c2-983b-77d96dfabbc7",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "db4ed3c6-596c-45ef-83da-16476c47f0bb",
  "order_id": "dcccd8cf-0247-45a1-8f64-01a28b38f015",
  "assignment_id": "db322821-0a0b-48df-8043-d6961d34751e",
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
  "entrance": null,
  "contact_attempts": []
}
```

Done: far claim 422, the 31st claim 429, the phone without the shift 409, the phone with it took the order.

`GET /api/rider/v1/orders/dcccd8cf-0247-45a1-8f64-01a28b38f015` → **200**

```json
{
  "id": "dcccd8cf-0247-45a1-8f64-01a28b38f015",
  "short_number": 4,
  "status": "CANCELLED",
  "status_reason": "PASSENGER_ASKED",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "2545e4eb-e428-4737-a29b-77fef9cd9db0",
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
    "id": "db322821-0a0b-48df-8043-d6961d34751e",
    "order_id": "dcccd8cf-0247-45a1-8f64-01a28b38f015",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "vehicle_id": "5a000000-0000-4000-8000-000000000504",
    "source": "BROADCAST",
    "state": "RELEASED",
    "trip_id": "db4ed3c6-596c-45ef-83da-16476c47f0bb",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-31T02:10:02.337692Z",
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
  "session_id": "88427add-dd4d-47b4-8f95-2bd8e27becf3",
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
  "last_heartbeat_at": "2026-10-31T02:10:01.510953Z",
  "last_location_at": "2026-10-31T02:10:01.510953Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/88427add-dd4d-47b4-8f95-2bd8e27becf3/close` → **200**

```json
{
  "command_id": "0f6ce5e2-cd08-4985-b69e-b6089c3e4f04",
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
  "session_id": "a408247d-dd59-4c9f-9b96-516b71e21ef8",
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
  "last_heartbeat_at": "2026-10-31T02:10:09.338541Z",
  "last_location_at": "2026-10-31T02:10:09.338541Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a408247d-dd59-4c9f-9b96-516b71e21ef8/close` → **200**

```json
{
  "command_id": "d929ae20-04aa-4a8d-b05a-107157479b03",
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
  "session_id": "3c28a3c3-fae4-482b-a111-3d7211f8b264",
  "subject": {
    "type": "STAFF",
    "id": "13536a6b-90d5-4717-bcad-60e066f5abae"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzUzNmE2Yi05MGQ1LTQ3MTctYmNhZC02MGUwNjZmNWFiYWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MTM1MTEsImlhdCI6MTc5MzQxMjYxMSwianRpIjoiY2EwZTI1ZTMtOWFlNi00NzkzLWFlODMtMjQ4YmM0ZDlhMmQ3Iiwic2lkIjoiM2MyOGEzYzMtZmFlNC00ODJiLWExMTEtM2Q3MjExZjhiMjY0In0.x3J64PXHtidluBlJs1qwEGLB2B-E8s7s_tA9ALwQ7YU",
  "access_expires_at": "2026-10-31T02:25:11.722139636Z",
  "refresh_token": "7-dN_2Ri9EjM5u9kXuVxG8BCHXedUx9EMModu3RRVWQ",
  "refresh_expires_at": "2026-10-31T14:10:11.721824808Z",
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
  "command_id": "ee09b0f3-61cf-4c80-9289-0290e1f45dac",
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
  "session_id": "ef6828ab-ecb7-4fe3-aa4b-7b1e62993aed",
  "subject": {
    "type": "STAFF",
    "id": "13536a6b-90d5-4717-bcad-60e066f5abae"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzUzNmE2Yi05MGQ1LTQ3MTctYmNhZC02MGUwNjZmNWFiYWUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MTM1MTIsImlhdCI6MTc5MzQxMjYxMiwianRpIjoiZTA2MmU5N2UtMGM5MC00OGU2LTllZDQtZmMyOWRjOTJhM2Q0Iiwic2lkIjoiZWY2ODI4YWItZWNiNy00ZmUzLWFhNGItN2IxZTYyOTkzYWVkIn0.b2ZT1FoIiFM8lxBVY7Tzu2RPmjordA2akML21M7DWxs",
  "access_expires_at": "2026-10-31T02:25:12.473089176Z",
  "refresh_token": "6VvbDcuRVR6RV4qAGtzjm9TRMEHvAS3YVdWV9hgQq2I",
  "refresh_expires_at": "2026-10-31T14:10:12.472669042Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.284129885",
    "linkedid": "1730052700.284129885",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380672629809"
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
    "id": "1730052700.284129885",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "43ce9b9c-1624-492b-8f37-dc1f0c612eae",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380672629809",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-31T02:10:12.653599Z",
      "answered_at": null,
      "ended_at": "2026-10-31T02:10:12.672693Z",
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
    "id": "1730052600.2883516957",
    "linkedid": "1730052600.2883516957",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380672629809"
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
      "id": "8e8c0c77-a4d8-4aa6-bb77-2f67e16798fb",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380672629809",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-31T02:10:12.884354Z",
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

`POST /api/operator/v1/calls/8e8c0c77-a4d8-4aa6-bb77-2f67e16798fb/answer` → **200**

```json
{
  "command_id": "06ccb084-ba26-4094-9c48-13e128685fcc"
}
```

```json
{
  "id": "8e8c0c77-a4d8-4aa6-bb77-2f67e16798fb",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380672629809",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "13536a6b-90d5-4717-bcad-60e066f5abae",
  "order_ids": [],
  "started_at": "2026-10-31T02:10:12.884354Z",
  "answered_at": "2026-10-31T02:10:13.097753Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.2883516957",
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
    "id": "1730052600.2883516957",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "8e8c0c77-a4d8-4aa6-bb77-2f67e16798fb",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672629809",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "13536a6b-90d5-4717-bcad-60e066f5abae",
      "order_ids": [],
      "started_at": "2026-10-31T02:10:12.884354Z",
      "answered_at": "2026-10-31T02:10:13.097753Z",
      "ended_at": "2026-10-31T02:10:13.311126Z",
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
      "id": "8e8c0c77-a4d8-4aa6-bb77-2f67e16798fb",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672629809",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "13536a6b-90d5-4717-bcad-60e066f5abae",
      "order_ids": [],
      "started_at": "2026-10-31T02:10:12.884354Z",
      "answered_at": "2026-10-31T02:10:13.097753Z",
      "ended_at": "2026-10-31T02:10:13.311126Z",
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
      "id": "8e8c0c77-a4d8-4aa6-bb77-2f67e16798fb",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672629809",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "13536a6b-90d5-4717-bcad-60e066f5abae",
      "order_ids": [],
      "started_at": "2026-10-31T02:10:12.884354Z",
      "answered_at": "2026-10-31T02:10:13.097753Z",
      "ended_at": "2026-10-31T02:10:13.311126Z",
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
      "id": "8e8c0c77-a4d8-4aa6-bb77-2f67e16798fb",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672629809",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "13536a6b-90d5-4717-bcad-60e066f5abae",
      "order_ids": [],
      "started_at": "2026-10-31T02:10:12.884354Z",
      "answered_at": "2026-10-31T02:10:13.097753Z",
      "ended_at": "2026-10-31T02:10:13.311126Z",
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
      "id": "8e8c0c77-a4d8-4aa6-bb77-2f67e16798fb",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672629809",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "13536a6b-90d5-4717-bcad-60e066f5abae",
      "order_ids": [],
      "started_at": "2026-10-31T02:10:12.884354Z",
      "answered_at": "2026-10-31T02:10:13.097753Z",
      "ended_at": "2026-10-31T02:10:13.311126Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-31T02:10:20.2126Z"
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
      "id": "8e8c0c77-a4d8-4aa6-bb77-2f67e16798fb",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672629809",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "13536a6b-90d5-4717-bcad-60e066f5abae",
      "order_ids": [],
      "started_at": "2026-10-31T02:10:12.884354Z",
      "answered_at": "2026-10-31T02:10:13.097753Z",
      "ended_at": "2026-10-31T02:10:13.311126Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-31T02:10:20.2126Z"
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

`GET /api/operator/v1/calls/8e8c0c77-a4d8-4aa6-bb77-2f67e16798fb/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/8e8c0c77-a4d8-4aa6-bb77-2f67e16798fb/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=8e8c0c77-a4d8-4aa6-bb77-2f67e16798fb` → **200**

```json
{
  "changes": [
    {
      "id": "cbfdc685-1621-4e3a-8394-a13785e813d2",
      "occurred_at": "2026-10-31T02:10:22.521935Z",
      "actor_type": "STAFF",
      "actor_id": "13536a6b-90d5-4717-bcad-60e066f5abae",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "8e8c0c77-a4d8-4aa6-bb77-2f67e16798fb",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"9f5a81d7-31e8-40ce-afce-047029cda0de\", \"order_ids\": []}",
      "correlation_id": "e592cdb2-0dac-423e-bcf2-fe7908ba55a6"
    },
    {
      "id": "a05a9b9d-dc7d-44a6-b4c2-c23bc48d9b2f",
      "occurred_at": "2026-10-31T02:10:22.497239Z",
      "actor_type": "STAFF",
      "actor_id": "13536a6b-90d5-4717-bcad-60e066f5abae",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "8e8c0c77-a4d8-4aa6-bb77-2f67e16798fb",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"9f5a81d7-31e8-40ce-afce-047029cda0de\", \"order_ids\": []}",
      "correlation_id": "c006c4f5-53ec-41cc-8661-2353a130d764"
    }
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
```

Done: call 8e8c0c77-a4d8-4aa6-bb77-2f67e16798fb recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-24522"
}
```

```json
{
  "challenge_id": "9371ded8-55ec-46c7-93c5-e41b63052a45",
  "expires_at": "2026-10-31T02:15:22.747722783Z",
  "resend_available_at": "2026-10-31T02:10:23.747722783Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "918236",
  "sent_at": "2026-10-31T02:10:22.749543348Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9371ded8-55ec-46c7-93c5-e41b63052a45",
  "code": "918236",
  "device_ref": "sandbox-24522"
}
```

```json
{
  "session_id": "692540ee-f1e0-48c6-ae79-72062241cb98",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQxMzUyMiwiaWF0IjoxNzkzNDEyNjIyLCJqdGkiOiJhNjU0ZTU0Ni1iZDBhLTRhZDAtYTc1ZC0wMjNkNmYyZGU0OTUiLCJzaWQiOiI2OTI1NDBlZS1mMWUwLTQ4YzYtYWU3OS03MjA2MjI0MWNiOTgifQ.6fYbcYnDuLBzzXoFe_6Oqg06OVrp98TrriHlwc_7qPE",
  "access_expires_at": "2026-10-31T02:25:22.950250524Z",
  "refresh_token": "mT2TJbSnqs9YfVYUreaffhKfqgKeC70XJb5APbrgnFg",
  "refresh_expires_at": "2026-11-30T02:10:22.949809318Z",
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
  "command_id": "fba813e6-d766-41e8-9957-7600818bbeb9",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T02:10:23Z",
    "sequence": 1793412623358
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3b50f28a-330f-4005-8bd5-92762747c5a7",
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
  "last_heartbeat_at": "2026-10-31T02:10:23.374209Z",
  "last_location_at": "2026-10-31T02:10:23.374209Z",
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
  "session_id": "08fbba1e-7e4f-4772-bc6e-7da3fafcac82",
  "subject": {
    "type": "STAFF",
    "id": "13536a6b-90d5-4717-bcad-60e066f5abae"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzUzNmE2Yi05MGQ1LTQ3MTctYmNhZC02MGUwNjZmNWFiYWUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MTM1MjMsImlhdCI6MTc5MzQxMjYyMywianRpIjoiNmNjNTM2MWEtMTIxOS00MmQ5LWFlNmMtMTQxNDU2MWVmMTViIiwic2lkIjoiMDhmYmJhMWUtN2U0Zi00NzcyLWJjNmUtN2RhM2ZhZmNhYzgyIn0.ByHPTNYLHHyrn3Y55VuArfBREk0cbkwC-BZZXHJRkGI",
  "access_expires_at": "2026-10-31T02:25:23.75389662Z",
  "refresh_token": "mR0SvY9ql_uMnxUJp8n2mzCz4C5eGsJfUvUK8CwacPU",
  "refresh_expires_at": "2026-10-31T14:10:23.753504803Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "c6a72a13-8b0c-46b6-9204-bc0f0e498103",
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
  "id": "168398ba-b6b0-4c29-8904-e625780ce424",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T02:15:23.946696Z",
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
  "command_id": "3edd98ce-fa7d-4e61-9b30-8952b097f97d",
  "quote_id": "168398ba-b6b0-4c29-8904-e625780ce424",
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
    "phone": "+380678946815"
  }
}
```

```json
{
  "id": "ee122afb-ebea-474a-8f04-a4b3eae0ddbe",
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
  "created_at": "2026-10-31T02:10:24.157001Z",
  "caller": {
    "name": "Олена",
    "phone": "+380678946815"
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
    "id": "edb91675-1796-4967-8d40-880428232050",
    "order_id": "ee122afb-ebea-474a-8f04-a4b3eae0ddbe",
    "expires_at": "2026-10-31T02:10:39.160235Z",
    "server_time": "2026-10-31T02:10:24.391337326Z",
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

`POST /api/driver/v1/offers/edb91675-1796-4967-8d40-880428232050/accept` → **200**

```json
{
  "command_id": "7b2ceba5-3001-4d61-954a-134e90d41bc7"
}
```

```json
{
  "id": "6a364d29-4fbd-4407-98f8-f4244f16540d",
  "order_id": "ee122afb-ebea-474a-8f04-a4b3eae0ddbe",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "025db0e2-d28e-4c59-847c-e631458e7805",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380678946815` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380678946815` → **200**

```json
[
  {
    "phone": "+380678946815",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-31T02:10:25.531433307Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380678946815` → **200**

```json
[
  {
    "phone": "+380678946815",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-31T02:10:25.531433307Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380678946815` → **200**

```json
[
  {
    "phone": "+380678946815",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-31T02:10:25.531433307Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "025db0e2-d28e-4c59-847c-e631458e7805",
  "order_id": "ee122afb-ebea-474a-8f04-a4b3eae0ddbe",
  "assignment_id": "6a364d29-4fbd-4407-98f8-f4244f16540d",
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
    "phone": "+380678946815"
  },
  "comment": null,
  "entrance": null,
  "contact_attempts": []
}
```

`POST /api/driver/v1/work-sessions/3b50f28a-330f-4005-8bd5-92762747c5a7/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T02:10:26Z",
    "sequence": 1793412626801
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3b50f28a-330f-4005-8bd5-92762747c5a7",
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
  "last_heartbeat_at": "2026-10-31T02:10:26.095759Z",
  "last_location_at": "2026-10-31T02:10:26.095759Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/025db0e2-d28e-4c59-847c-e631458e7805/arrive` → **200**

```json
{
  "command_id": "04d3bfde-0d81-4ebb-9382-a9583242e798",
  "expected_version": 0
}
```

```json
{
  "id": "025db0e2-d28e-4c59-847c-e631458e7805",
  "order_id": "ee122afb-ebea-474a-8f04-a4b3eae0ddbe",
  "assignment_id": "6a364d29-4fbd-4407-98f8-f4244f16540d",
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
  "arrived_at": "2026-10-31T02:10:26.291869Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380678946815"
  },
  "comment": null,
  "entrance": null,
  "contact_attempts": []
}
```

`GET /sandbox/v1/sms?phone=%2B380678946815` → **200**

```json
[
  {
    "phone": "+380678946815",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-31T02:10:25.531433307Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380678946815` → **200**

```json
[
  {
    "phone": "+380678946815",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-31T02:10:25.531433307Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380678946815` → **200**

```json
[
  {
    "phone": "+380678946815",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-31T02:10:25.531433307Z"
  },
  {
    "phone": "+380678946815",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-31T02:10:27.536466938Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380678946815` → **200**

```json
[
  {
    "phone": "+380678946815",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-31T02:10:25.531433307Z"
  },
  {
    "phone": "+380678946815",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-31T02:10:27.536466938Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380678946815` → **200**

```json
[
  {
    "phone": "+380678946815",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-31T02:10:25.531433307Z"
  },
  {
    "phone": "+380678946815",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-31T02:10:27.536466938Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/025db0e2-d28e-4c59-847c-e631458e7805/start` → **200**

```json
{
  "command_id": "55ef9b15-415b-49a3-a1b3-ba84ca19a925",
  "expected_version": 1
}
```

```json
{
  "id": "025db0e2-d28e-4c59-847c-e631458e7805",
  "order_id": "ee122afb-ebea-474a-8f04-a4b3eae0ddbe",
  "assignment_id": "6a364d29-4fbd-4407-98f8-f4244f16540d",
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
  "arrived_at": "2026-10-31T02:10:26.291869Z",
  "started_at": "2026-10-31T02:10:28.587934Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380678946815"
  },
  "comment": null,
  "entrance": null,
  "contact_attempts": []
}
```

`POST /api/driver/v1/trips/025db0e2-d28e-4c59-847c-e631458e7805/complete` → **200**

```json
{
  "command_id": "108b0d91-e857-444e-939d-a9e327e37edf",
  "expected_version": 2,
  "reported_at": "2026-10-31T02:10:28Z",
  "cash_received": true
}
```

```json
{
  "id": "025db0e2-d28e-4c59-847c-e631458e7805",
  "order_id": "ee122afb-ebea-474a-8f04-a4b3eae0ddbe",
  "assignment_id": "6a364d29-4fbd-4407-98f8-f4244f16540d",
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
  "arrived_at": "2026-10-31T02:10:26.291869Z",
  "started_at": "2026-10-31T02:10:28.587934Z",
  "completed_at": "2026-10-31T02:10:28.787553Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null,
  "comment": null,
  "entrance": null,
  "contact_attempts": []
}
```

Done: two SMS to the caller of a phone order.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3b50f28a-330f-4005-8bd5-92762747c5a7",
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
  "last_heartbeat_at": "2026-10-31T02:10:26.095759Z",
  "last_location_at": "2026-10-31T02:10:26.095759Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3b50f28a-330f-4005-8bd5-92762747c5a7/close` → **200**

```json
{
  "command_id": "a6eee711-d49e-4337-a32c-b1906b8aa197",
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
  "phone": "+380634048234",
  "device_ref": "sandbox-10050"
}
```

```json
{
  "challenge_id": "4bd77813-f7c5-40a3-af64-a7499de7e82e",
  "expires_at": "2026-10-31T02:15:29.36624349Z",
  "resend_available_at": "2026-10-31T02:10:30.36624349Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380634048234` → **200**

```json
{
  "phone": "+380634048234",
  "audience": "CLIENT",
  "code": "360480",
  "sent_at": "2026-10-31T02:10:29.368166573Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4bd77813-f7c5-40a3-af64-a7499de7e82e",
  "code": "360480",
  "device_ref": "sandbox-10050"
}
```

```json
{
  "session_id": "d3927e0c-49b4-4841-a8f0-f37096dcccfd",
  "subject": {
    "type": "CLIENT",
    "id": "eb54d996-fd68-4f81-b62d-fe70bd42c07d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlYjU0ZDk5Ni1mZDY4LTRmODEtYjYyZC1mZTcwYmQ0MmMwN2QiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDEzNTI5LCJpYXQiOjE3OTM0MTI2MjksImp0aSI6IjY1NjUyNTJhLTNkYzItNGE4NS04OGI0LTdiOThjNmMxOGNiOCIsInNpZCI6ImQzOTI3ZTBjLTQ5YjQtNDg0MS1hOGYwLWYzNzA5NmRjY2NmZCJ9.7EzdXlcqENcGCbH7KPxfYTtDgymoRi_tq0i9fOk38i0",
  "access_expires_at": "2026-10-31T02:25:29.575762724Z",
  "refresh_token": "Tme54MOR6WIE0hL2lbLjABx9Ra-UJSHAHD4RO-4UAyk",
  "refresh_expires_at": "2026-11-30T02:10:29.575361513Z",
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
  "device_ref": "sandbox-252"
}
```

```json
{
  "challenge_id": "5b282849-11b8-4c9d-9857-115d34fe11be",
  "expires_at": "2026-10-31T02:15:29.946614512Z",
  "resend_available_at": "2026-10-31T02:10:30.946614512Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "623023",
  "sent_at": "2026-10-31T02:10:29.94846386Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5b282849-11b8-4c9d-9857-115d34fe11be",
  "code": "623023",
  "device_ref": "sandbox-252"
}
```

```json
{
  "session_id": "bae7be3d-b954-484e-8eca-63666dbc046d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQxMzUzMCwiaWF0IjoxNzkzNDEyNjMwLCJqdGkiOiJjNWUyNDY1NS02YjYyLTQ1YzMtOGEwNi1iYzAyNjJiODNiMDciLCJzaWQiOiJiYWU3YmUzZC1iOTU0LTQ4NGUtOGVjYS02MzY2NmRiYzA0NmQifQ.5UNCDqEdWaqpoe-H9NdDagpaGd6KX0D5k7fS5BT7-p8",
  "access_expires_at": "2026-10-31T02:25:30.147965598Z",
  "refresh_token": "RMXCNDI-g4ocV1TkBP_bhD9fI_u5cCGBOlE0ILCvURg",
  "refresh_expires_at": "2026-11-30T02:10:30.147594807Z",
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
  "session_id": "4fcd93d8-e48b-49d3-a391-c1a8d38d578f",
  "subject": {
    "type": "STAFF",
    "id": "13536a6b-90d5-4717-bcad-60e066f5abae"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzUzNmE2Yi05MGQ1LTQ3MTctYmNhZC02MGUwNjZmNWFiYWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MTM1MzAsImlhdCI6MTc5MzQxMjYzMCwianRpIjoiODI0ODZjODYtMGU5Yy00NGQ1LTkwZWYtNTA1ZjJlMDQ0MmU3Iiwic2lkIjoiNGZjZDkzZDgtZTQ4Yi00OWQzLWEzOTEtYzFhOGQzOGQ1NzhmIn0.VrwJ9H9gr6adqnGRIbvCVoWGSvZqSYadoE_2GCP9syE",
  "access_expires_at": "2026-10-31T02:25:30.702254729Z",
  "refresh_token": "hrht_lg6AF35aBOansRDQU6TcyW7kR60hoTTBYAPqAs",
  "refresh_expires_at": "2026-10-31T14:10:30.701933822Z",
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
  "session_id": "c86c12b4-ec16-455e-a606-7077e7aaa9ce",
  "subject": {
    "type": "STAFF",
    "id": "13536a6b-90d5-4717-bcad-60e066f5abae"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzUzNmE2Yi05MGQ1LTQ3MTctYmNhZC02MGUwNjZmNWFiYWUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MTM1MzEsImlhdCI6MTc5MzQxMjYzMSwianRpIjoiMGYyMGRiYzAtOWVkYi00YjRkLTg4NDItMzZmMmQ2YjFiNmM3Iiwic2lkIjoiYzg2YzEyYjQtZWMxNi00NTVlLWE2MDYtNzA3N2U3YWFhOWNlIn0.dYhjQqcy1M-1ehs97KFA4UWwCZGFTbxTHmKAEH_OPOM",
  "access_expires_at": "2026-10-31T02:25:31.074078441Z",
  "refresh_token": "7n0MwLcBxhr5dinaqWjN1sOxA5de8T17WplskAH6-8E",
  "refresh_expires_at": "2026-10-31T14:10:31.073474303Z",
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
  "command_id": "0fe1ba5e-28f7-4a61-9197-6bdefedf3fb9",
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
  "id": "cda559fc-07f4-4756-92cc-0ceb9a792767",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T02:15:31.441888Z",
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
  "command_id": "e6dfd91c-6d45-46bf-8a5f-8619d0c72cc5",
  "quote_id": "cda559fc-07f4-4756-92cc-0ceb9a792767",
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
  "id": "50a9f0ef-a523-4342-987f-13ff9ead87f8",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "eb54d996-fd68-4f81-b62d-fe70bd42c07d",
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
  "created_at": "2026-10-31T02:10:31.629787Z",
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

`GET /api/rider/v1/orders/50a9f0ef-a523-4342-987f-13ff9ead87f8` → **200**

```json
{
  "id": "50a9f0ef-a523-4342-987f-13ff9ead87f8",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "eb54d996-fd68-4f81-b62d-fe70bd42c07d",
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
  "created_at": "2026-10-31T02:10:31.629787Z",
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

`POST /api/rider/v1/orders/50a9f0ef-a523-4342-987f-13ff9ead87f8/cancel` → **200**

```json
{
  "command_id": "82f070ff-8fd5-467d-9d2f-2a8576a74f4d",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "50a9f0ef-a523-4342-987f-13ff9ead87f8",
  "short_number": 6,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "eb54d996-fd68-4f81-b62d-fe70bd42c07d",
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
  "created_at": "2026-10-31T02:10:31.629787Z",
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
  "command_id": "95294ba2-cdde-47a3-a734-39cf850282c4",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T02:10:32Z",
    "sequence": 1793412632428
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "0f258eb7-7dc8-4262-b6c7-cac76aa74e8c",
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
  "last_heartbeat_at": "2026-10-31T02:10:32.446508Z",
  "last_location_at": "2026-10-31T02:10:32.446508Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-30121"
}
```

```json
{
  "challenge_id": "fd500dc5-071e-4f51-b0b8-6b212dce5298",
  "expires_at": "2026-10-31T02:15:32.631732993Z",
  "resend_available_at": "2026-10-31T02:10:33.631732993Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "781486",
  "sent_at": "2026-10-31T02:10:32.633575792Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fd500dc5-071e-4f51-b0b8-6b212dce5298",
  "code": "781486",
  "device_ref": "sandbox-30121"
}
```

```json
{
  "session_id": "cd4dd8e7-1b29-460f-948b-d453c46f2083",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQxMzUzMiwiaWF0IjoxNzkzNDEyNjMyLCJqdGkiOiJlNmYwNjU5My00Nzg2LTQ0ZWUtYjI0Zi03ODBkNzc0NjBlMzgiLCJzaWQiOiJjZDRkZDhlNy0xYjI5LTQ2MGYtOTQ4Yi1kNDUzYzQ2ZjIwODMifQ.sWgd32C2MEa9UVNFjvD_UEd7G4PmP75qw9iWWlx1Odw",
  "access_expires_at": "2026-10-31T02:25:32.837712002Z",
  "refresh_token": "hCNCl6C5nr8oDfH2DjeFIWN2bJy0Fpee4cZwlpZdafc",
  "refresh_expires_at": "2026-11-30T02:10:32.837287246Z",
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
  "command_id": "b268d1e2-3dc7-469b-9d39-fe927c1de05f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T02:10:33Z",
    "sequence": 1793412633217
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "d357c486-5cbe-42e3-b3cb-6afdadb2b13b",
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
  "last_heartbeat_at": "2026-10-31T02:10:33.233681Z",
  "last_location_at": "2026-10-31T02:10:33.233681Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8f0b7813-62cf-4fd0-92c3-b3999375285f",
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
  "id": "9c0e7899-23d4-440c-a7d3-69370b47be1b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T02:15:33.432271Z",
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
  "command_id": "7028d8df-5f92-4a63-95d1-9a0d17f63a6f",
  "quote_id": "9c0e7899-23d4-440c-a7d3-69370b47be1b",
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
  "id": "f1ecc28d-09e0-41b4-8ac6-8bd4b17840d2",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "eb54d996-fd68-4f81-b62d-fe70bd42c07d",
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
  "created_at": "2026-10-31T02:10:33.63325Z",
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
    "id": "977c909d-f9fe-4d1c-939c-bdd687903ab5",
    "order_id": "f1ecc28d-09e0-41b4-8ac6-8bd4b17840d2",
    "expires_at": "2026-10-31T02:10:48.635382Z",
    "server_time": "2026-10-31T02:10:33.846442774Z",
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

`POST /api/driver/v1/offers/977c909d-f9fe-4d1c-939c-bdd687903ab5/accept` → **200**

```json
{
  "command_id": "09938a5d-b490-47b6-894c-d4808181c405"
}
```

```json
{
  "id": "073d43d6-21e8-4977-bead-46d744c65912",
  "order_id": "f1ecc28d-09e0-41b4-8ac6-8bd4b17840d2",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "69f8b5ac-550d-4361-9755-7b6ec9e2e555",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "69f8b5ac-550d-4361-9755-7b6ec9e2e555",
  "order_id": "f1ecc28d-09e0-41b4-8ac6-8bd4b17840d2",
  "assignment_id": "073d43d6-21e8-4977-bead-46d744c65912",
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
  "entrance": null,
  "contact_attempts": []
}
```

`POST /api/driver/v1/trips/69f8b5ac-550d-4361-9755-7b6ec9e2e555/cancel` → **200**

```json
{
  "command_id": "b830e5bc-133e-4d7f-978e-9629e6aa0d74",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "69f8b5ac-550d-4361-9755-7b6ec9e2e555",
  "order_id": "f1ecc28d-09e0-41b4-8ac6-8bd4b17840d2",
  "assignment_id": "073d43d6-21e8-4977-bead-46d744c65912",
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
  "entrance": null,
  "contact_attempts": []
}
```

`GET /api/rider/v1/orders/f1ecc28d-09e0-41b4-8ac6-8bd4b17840d2` → **200**

```json
{
  "id": "f1ecc28d-09e0-41b4-8ac6-8bd4b17840d2",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "eb54d996-fd68-4f81-b62d-fe70bd42c07d",
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
  "created_at": "2026-10-31T02:10:33.63325Z",
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
    "at": "2026-10-31T02:10:34.417415Z"
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
    "id": "ad59a8fc-7086-45cc-bad0-e6846268f10f",
    "order_id": "f1ecc28d-09e0-41b4-8ac6-8bd4b17840d2",
    "expires_at": "2026-10-31T02:10:49.419727Z",
    "server_time": "2026-10-31T02:10:34.818518715Z",
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

`POST /api/driver/v1/offers/ad59a8fc-7086-45cc-bad0-e6846268f10f/accept` → **200**

```json
{
  "command_id": "1143e7f3-6a05-4037-b781-b0386dc5efda"
}
```

```json
{
  "id": "bbf978ce-30a4-4167-98d0-ea0dcdd0a60a",
  "order_id": "f1ecc28d-09e0-41b4-8ac6-8bd4b17840d2",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "2bfe00c9-bf8d-44de-aea3-80aef3c9971d",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "2bfe00c9-bf8d-44de-aea3-80aef3c9971d",
  "order_id": "f1ecc28d-09e0-41b4-8ac6-8bd4b17840d2",
  "assignment_id": "bbf978ce-30a4-4167-98d0-ea0dcdd0a60a",
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
  "entrance": null,
  "contact_attempts": []
}
```

`POST /api/driver/v1/trips/2bfe00c9-bf8d-44de-aea3-80aef3c9971d/cancel` → **200**

```json
{
  "command_id": "5654c412-bf60-41e3-b0d1-96ddef547c91",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "2bfe00c9-bf8d-44de-aea3-80aef3c9971d",
  "order_id": "f1ecc28d-09e0-41b4-8ac6-8bd4b17840d2",
  "assignment_id": "bbf978ce-30a4-4167-98d0-ea0dcdd0a60a",
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
  "entrance": null,
  "contact_attempts": []
}
```

## The rider sees who cancelled; the operator sees the whole history

`GET /api/rider/v1/orders` → **200**

```json
{
  "items": [
    {
      "id": "f1ecc28d-09e0-41b4-8ac6-8bd4b17840d2",
      "short_number": 7,
      "status": "CANCELLED",
      "created_at": "2026-10-31T02:10:33.63325Z",
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
      "id": "50a9f0ef-a523-4342-987f-13ff9ead87f8",
      "short_number": 6,
      "status": "CANCELLED",
      "created_at": "2026-10-31T02:10:31.629787Z",
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

`GET /api/operator/v1/orders/f1ecc28d-09e0-41b4-8ac6-8bd4b17840d2/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-31T02:10:33.633636Z",
      "actor": {
        "type": "CLIENT",
        "id": "eb54d996-fd68-4f81-b62d-fe70bd42c07d",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "f1ecc28d-09e0-41b4-8ac6-8bd4b17840d2",
        "quote_id": "9c0e7899-23d4-440c-a7d3-69370b47be1b",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "81f7c2d4-9f5f-47b6-a76f-521abef6ea1e"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-31T02:10:33.634927Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "f1ecc28d-09e0-41b4-8ac6-8bd4b17840d2",
        "attempt_id": "c7823cc4-dcba-4d81-a899-cf92bf9c498b",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "81f7c2d4-9f5f-47b6-a76f-521abef6ea1e"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-31T02:10:33.650543Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "source": "AUTO",
        "offer_id": "977c909d-f9fe-4d1c-939c-bdd687903ab5",
        "order_id": "f1ecc28d-09e0-41b4-8ac6-8bd4b17840d2",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478,
        "expires_at": "2026-10-31T02:10:48.635381833Z"
      },
      "correlation_id": "81f7c2d4-9f5f-47b6-a76f-521abef6ea1e"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-31T02:10:34.034638Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "977c909d-f9fe-4d1c-939c-bdd687903ab5",
        "order_id": "f1ecc28d-09e0-41b4-8ac6-8bd4b17840d2",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "073d43d6-21e8-4977-bead-46d744c65912"
```

Done: orders 50a9f0ef-a523-4342-987f-13ff9ead87f8, f1ecc28d-09e0-41b4-8ac6-8bd4b17840d2.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380734278368",
  "device_ref": "sandbox-7264"
}
```

```json
{
  "challenge_id": "1ed315d4-a703-4726-8e60-07482c444d72",
  "expires_at": "2026-10-31T02:15:35.988744953Z",
  "resend_available_at": "2026-10-31T02:10:36.988744953Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380734278368` → **200**

```json
{
  "phone": "+380734278368",
  "audience": "CLIENT",
  "code": "941916",
  "sent_at": "2026-10-31T02:10:35.998539414Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1ed315d4-a703-4726-8e60-07482c444d72",
  "code": "941916",
  "device_ref": "sandbox-7264"
}
```

```json
{
  "session_id": "a8a0f653-ca4a-4b28-9084-9bbd7cc80a62",
  "subject": {
    "type": "CLIENT",
    "id": "7c6fbf05-f74e-4ccb-b1c9-8701b56de646"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YzZmYmYwNS1mNzRlLTRjY2ItYjFjOS04NzAxYjU2ZGU2NDYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDEzNTM2LCJpYXQiOjE3OTM0MTI2MzYsImp0aSI6IjExYTk3NDk1LTZkNTYtNGI1ZS05YjI0LWM2OWZhYzA4M2U2NyIsInNpZCI6ImE4YTBmNjUzLWNhNGEtNGIyOC05MDg0LTliYmQ3Y2M4MGE2MiJ9.PCUdfv0_i3GsBrvgGyA06I27D7QXusiWnz5TgA-1Mvo",
  "access_expires_at": "2026-10-31T02:25:36.233682121Z",
  "refresh_token": "J0qbzZwGHnbzpKkEnmWtwpDPVllUbifOIPqJzdbLoi8",
  "refresh_expires_at": "2026-11-30T02:10:36.233265753Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "c400218a-a550-4004-8256-3590ac3f885d",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "d2adf696-f9e2-42eb-8c6b-fedb793fdd02",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-d2adf696-f9e2-42eb-8c6b-fedb793fdd02",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "003d9718040b32e1cc0d4324cefa1ea3",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=d2adf696-f9e2-42eb-8c6b-fedb793fdd02",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380734278368"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=d2adf696-f9e2-42eb-8c6b-fedb793fdd02",
  "expires_at": "2026-10-31T02:40:36.41437Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/d2adf696-f9e2-42eb-8c6b-fedb793fdd02` → **200**

```json
{
  "id": "d2adf696-f9e2-42eb-8c6b-fedb793fdd02",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-31T02:40:36.41437Z",
  "card": {
    "id": "54524017-439b-4865-a439-aa518b774fdc",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****1555",
    "card_type": "Visa",
    "created_at": "2026-10-31T02:10:36.610948Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "54524017-439b-4865-a439-aa518b774fdc",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****1555",
      "card_type": "Visa",
      "created_at": "2026-10-31T02:10:36.610948Z"
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
  "device_ref": "sandbox-25706"
}
```

```json
{
  "challenge_id": "a5b34e63-591d-4a04-8439-af4574eef721",
  "expires_at": "2026-10-31T02:15:36.990668634Z",
  "resend_available_at": "2026-10-31T02:10:37.990668634Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "968191",
  "sent_at": "2026-10-31T02:10:36.992484672Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a5b34e63-591d-4a04-8439-af4574eef721",
  "code": "968191",
  "device_ref": "sandbox-25706"
}
```

```json
{
  "session_id": "4a370755-a543-4bf6-9e69-d5d694059d7c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQxMzUzNywiaWF0IjoxNzkzNDEyNjM3LCJqdGkiOiIzYjVkNzNlYi1mZmI3LTQ5ZWMtYWJmZS00N2JlNmJhZDk0ODgiLCJzaWQiOiI0YTM3MDc1NS1hNTQzLTRiZjYtOWU2OS1kNWQ2OTQwNTlkN2MifQ.RjtFlLjN_DYjvxjt0lv82wQLO_8_Jr2AjpL5qUQaJy8",
  "access_expires_at": "2026-10-31T02:25:37.193838648Z",
  "refresh_token": "remSr0Lg4EDlrjbr4zLH5biJ7Q0aL_T2Fe_WxliBo1M",
  "refresh_expires_at": "2026-11-30T02:10:37.193460776Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "d357c486-5cbe-42e3-b3cb-6afdadb2b13b",
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
  "last_heartbeat_at": "2026-10-31T02:10:33.233681Z",
  "last_location_at": "2026-10-31T02:10:33.233681Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d357c486-5cbe-42e3-b3cb-6afdadb2b13b/handover` → **200**

```json
{
  "command_id": "07d66770-7a03-4e7d-96ab-72df527d4459",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "d357c486-5cbe-42e3-b3cb-6afdadb2b13b",
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
  "last_heartbeat_at": "2026-10-31T02:10:33.233681Z",
  "last_location_at": "2026-10-31T02:10:33.233681Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

(the car drives 45 s to the next point)

`POST /api/driver/v1/work-sessions/d357c486-5cbe-42e3-b3cb-6afdadb2b13b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T02:11:22Z",
    "sequence": 1793412682767
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "d357c486-5cbe-42e3-b3cb-6afdadb2b13b",
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
  "last_heartbeat_at": "2026-10-31T02:11:22.782546Z",
  "last_location_at": "2026-10-31T02:11:22.782546Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "99664c16-51c0-4a84-9cc5-24c1b5dd892e",
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
  "id": "4c18f030-8df8-47e1-8ed9-302fc3791669",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T02:16:22.971415Z",
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
  "command_id": "ab0baef4-3bf5-4a53-b621-2e3123e0b341",
  "quote_id": "4c18f030-8df8-47e1-8ed9-302fc3791669",
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
  "id": "87d68a15-bb38-4ac2-b6b4-c15193925a9c",
  "short_number": 8,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "7c6fbf05-f74e-4ccb-b1c9-8701b56de646",
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
  "created_at": "2026-10-31T02:11:23.175651Z",
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

`GET /api/rider/v1/orders/87d68a15-bb38-4ac2-b6b4-c15193925a9c` → **200**

```json
{
  "id": "87d68a15-bb38-4ac2-b6b4-c15193925a9c",
  "short_number": 8,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "7c6fbf05-f74e-4ccb-b1c9-8701b56de646",
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
  "created_at": "2026-10-31T02:11:23.175651Z",
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

`GET /api/rider/v1/orders/87d68a15-bb38-4ac2-b6b4-c15193925a9c` → **200**

```json
{
  "id": "87d68a15-bb38-4ac2-b6b4-c15193925a9c",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "7c6fbf05-f74e-4ccb-b1c9-8701b56de646",
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
  "created_at": "2026-10-31T02:11:23.175651Z",
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
    "id": "5b627741-53e3-445d-a1fe-30f51b5bf3d6",
    "order_id": "87d68a15-bb38-4ac2-b6b4-c15193925a9c",
    "expires_at": "2026-10-31T02:11:38.885282Z",
    "server_time": "2026-10-31T02:11:24.796150813Z",
    "seconds_left": 14,
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

`POST /api/driver/v1/offers/5b627741-53e3-445d-a1fe-30f51b5bf3d6/accept` → **200**

```json
{
  "command_id": "c93db953-c902-4922-81fb-1aaa3e50a3af"
}
```

```json
{
  "id": "feea2100-260a-496b-92a7-503f3987cfe8",
  "order_id": "87d68a15-bb38-4ac2-b6b4-c15193925a9c",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e5a07156-4e2b-42f5-b174-cafbb395d871",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e5a07156-4e2b-42f5-b174-cafbb395d871",
  "order_id": "87d68a15-bb38-4ac2-b6b4-c15193925a9c",
  "assignment_id": "feea2100-260a-496b-92a7-503f3987cfe8",
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
  "entrance": null,
  "contact_attempts": []
}
```

(the car drives 6 s to the next point)

`POST /api/driver/v1/work-sessions/d357c486-5cbe-42e3-b3cb-6afdadb2b13b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T02:11:31Z",
    "sequence": 1793412691375
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "d357c486-5cbe-42e3-b3cb-6afdadb2b13b",
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
  "last_heartbeat_at": "2026-10-31T02:11:31.390577Z",
  "last_location_at": "2026-10-31T02:11:31.390577Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/e5a07156-4e2b-42f5-b174-cafbb395d871/arrive` → **200**

```json
{
  "command_id": "8aef2054-980f-4e9d-aefc-993f71012801",
  "expected_version": 0
}
```

```json
{
  "id": "e5a07156-4e2b-42f5-b174-cafbb395d871",
  "order_id": "87d68a15-bb38-4ac2-b6b4-c15193925a9c",
  "assignment_id": "feea2100-260a-496b-92a7-503f3987cfe8",
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
  "arrived_at": "2026-10-31T02:11:31.585132Z",
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

`POST /api/driver/v1/trips/e5a07156-4e2b-42f5-b174-cafbb395d871/start` → **200**

```json
{
  "command_id": "732f9f5e-7650-4ba9-9ece-68b09088dcc5",
  "expected_version": 1
}
```

```json
{
  "id": "e5a07156-4e2b-42f5-b174-cafbb395d871",
  "order_id": "87d68a15-bb38-4ac2-b6b4-c15193925a9c",
  "assignment_id": "feea2100-260a-496b-92a7-503f3987cfe8",
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
  "arrived_at": "2026-10-31T02:11:31.585132Z",
  "started_at": "2026-10-31T02:11:31.799771Z",
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

`POST /api/driver/v1/trips/e5a07156-4e2b-42f5-b174-cafbb395d871/complete` → **200**

```json
{
  "command_id": "9d02140c-cbc4-42c3-8e54-7ab62f72de63",
  "expected_version": 2,
  "reported_at": "2026-10-31T02:11:32Z",
  "cash_received": true
}
```

```json
{
  "id": "e5a07156-4e2b-42f5-b174-cafbb395d871",
  "order_id": "87d68a15-bb38-4ac2-b6b4-c15193925a9c",
  "assignment_id": "feea2100-260a-496b-92a7-503f3987cfe8",
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
  "arrived_at": "2026-10-31T02:11:31.585132Z",
  "started_at": "2026-10-31T02:11:31.799771Z",
  "completed_at": "2026-10-31T02:11:32.042547Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null,
  "comment": null,
  "entrance": null,
  "contact_attempts": []
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/87d68a15-bb38-4ac2-b6b4-c15193925a9c` → **200**

```json
{
  "id": "87d68a15-bb38-4ac2-b6b4-c15193925a9c",
  "short_number": 8,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "7c6fbf05-f74e-4ccb-b1c9-8701b56de646",
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
    "id": "feea2100-260a-496b-92a7-503f3987cfe8",
    "order_id": "87d68a15-bb38-4ac2-b6b4-c15193925a9c",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "e5a07156-4e2b-42f5-b174-cafbb395d871",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-31T02:11:23.175651Z",
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

`GET /api/rider/v1/orders/87d68a15-bb38-4ac2-b6b4-c15193925a9c` → **200**

```json
{
  "id": "87d68a15-bb38-4ac2-b6b4-c15193925a9c",
  "short_number": 8,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "7c6fbf05-f74e-4ccb-b1c9-8701b56de646",
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
    "id": "feea2100-260a-496b-92a7-503f3987cfe8",
    "order_id": "87d68a15-bb38-4ac2-b6b4-c15193925a9c",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "e5a07156-4e2b-42f5-b174-cafbb395d871",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-31T02:11:23.175651Z",
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

`GET /api/rider/v1/orders/87d68a15-bb38-4ac2-b6b4-c15193925a9c` → **200**

```json
{
  "id": "87d68a15-bb38-4ac2-b6b4-c15193925a9c",
  "short_number": 8,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "7c6fbf05-f74e-4ccb-b1c9-8701b56de646",
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
    "id": "feea2100-260a-496b-92a7-503f3987cfe8",
    "order_id": "87d68a15-bb38-4ac2-b6b4-c15193925a9c",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "e5a07156-4e2b-42f5-b174-cafbb395d871",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-31T02:11:23.175651Z",
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

`GET /api/rider/v1/orders/87d68a15-bb38-4ac2-b6b4-c15193925a9c` → **200**

```json
{
  "id": "87d68a15-bb38-4ac2-b6b4-c15193925a9c",
  "short_number": 8,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "7c6fbf05-f74e-4ccb-b1c9-8701b56de646",
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
    "id": "feea2100-260a-496b-92a7-503f3987cfe8",
    "order_id": "87d68a15-bb38-4ac2-b6b4-c15193925a9c",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "e5a07156-4e2b-42f5-b174-cafbb395d871",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-31T02:11:23.175651Z",
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

`GET /api/rider/v1/orders/87d68a15-bb38-4ac2-b6b4-c15193925a9c/tip` → **200**

```json
{
  "order_id": "87d68a15-bb38-4ac2-b6b4-c15193925a9c",
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
  "available_until": "2026-11-01T02:11:32.042547Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/87d68a15-bb38-4ac2-b6b4-c15193925a9c/tip` → **201**

```json
{
  "command_id": "f1e71127-33e1-4c51-bd74-09b2c5af1658",
  "amount_minor": 2500
}
```

```json
{
  "id": "84e6be76-ddec-4d99-a09a-849f921355da",
  "order_id": "87d68a15-bb38-4ac2-b6b4-c15193925a9c",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-31T02:11:36.397529Z"
}
```

`GET /api/rider/v1/orders/87d68a15-bb38-4ac2-b6b4-c15193925a9c/tip` → **200**

```json
{
  "order_id": "87d68a15-bb38-4ac2-b6b4-c15193925a9c",
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
  "available_until": "2026-11-01T02:11:32.042547Z",
  "open": false,
  "tip": {
    "id": "84e6be76-ddec-4d99-a09a-849f921355da",
    "order_id": "87d68a15-bb38-4ac2-b6b4-c15193925a9c",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T02:11:36.397529Z"
  }
}
```

`GET /api/rider/v1/orders/87d68a15-bb38-4ac2-b6b4-c15193925a9c/tip` → **200**

```json
{
  "order_id": "87d68a15-bb38-4ac2-b6b4-c15193925a9c",
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
  "available_until": "2026-11-01T02:11:32.042547Z",
  "open": false,
  "tip": {
    "id": "84e6be76-ddec-4d99-a09a-849f921355da",
    "order_id": "87d68a15-bb38-4ac2-b6b4-c15193925a9c",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-31T02:11:36.397529Z"
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
      "id": "b8597fbc-235d-4c7f-b828-22f7c66d3ec2",
      "at": "2026-10-31T02:11:32.964755Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "87d68a15-bb38-4ac2-b6b4-c15193925a9c",
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
      "id": "9a8ed755-5cda-454c-9142-23a2deeb2dd1",
      "at": "2026-10-31T02:11:38.002394Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "87d68a15-bb38-4ac2-b6b4-c15193925a9c",
      "counterpart_id": null
    },
    {
      "id": "b8597fbc-235d-4c7f-b828-22f7c66d3ec2",
      "at": "2026-10-31T02:11:32.964755Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "87d68a15-bb38-4ac2-b6b4-c15193925a9c",
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
  "command_id": "db900046-67e4-4ad7-9237-3785d160287c",
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
  "id": "b119545e-3eee-4bce-b649-58bc266de660",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T02:16:39.352956Z",
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
  "session_id": "1440af9d-1fdd-4738-9fe3-a3bedcb81467",
  "subject": {
    "type": "STAFF",
    "id": "13536a6b-90d5-4717-bcad-60e066f5abae"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzUzNmE2Yi05MGQ1LTQ3MTctYmNhZC02MGUwNjZmNWFiYWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MTM1OTksImlhdCI6MTc5MzQxMjY5OSwianRpIjoiZTJhNTA3MmUtNzE0OC00ZmNiLWI0ZTMtZGEzMzRmOTU1MDFhIiwic2lkIjoiMTQ0MGFmOWQtMWZkZC00NzM4LTlmZTMtYTNiZWRjYjgxNDY3In0.4iOPaYwjoh39HzlV5BoEfpzy_D2PZyPAI1gUTd6nciw",
  "access_expires_at": "2026-10-31T02:26:39.747513688Z",
  "refresh_token": "uiwjQVdoU0HV_eGKEhd0m5EmxNi4rO1RJpjXSwwrrBc",
  "refresh_expires_at": "2026-10-31T14:11:39.747094394Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380734278368` → **200**

```json
{
  "client_id": "7c6fbf05-f74e-4ccb-b1c9-8701b56de646"
}
```

`POST /api/admin/v1/rider-wallets/7c6fbf05-f74e-4ccb-b1c9-8701b56de646/top-ups` → **201**

```json
{
  "command_id": "ac0e551e-5971-4910-86a1-931751d55e39",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "7c6fbf05-f74e-4ccb-b1c9-8701b56de646",
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
      "id": "2223bef6-912c-47dc-8368-951f1890add9",
      "at": "2026-10-31T02:11:40.117736Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "13536a6b-90d5-4717-bcad-60e066f5abae",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "45ea2f80-4773-43e6-85c9-596ebcdb49f9",
  "quote_id": "b119545e-3eee-4bce-b649-58bc266de660",
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
  "id": "229e9dce-8c54-48e3-9d2b-20346f3c6f62",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7c6fbf05-f74e-4ccb-b1c9-8701b56de646",
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
  "created_at": "2026-10-31T02:11:40.321287Z",
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

`GET /api/rider/v1/orders/229e9dce-8c54-48e3-9d2b-20346f3c6f62` → **200**

```json
{
  "id": "229e9dce-8c54-48e3-9d2b-20346f3c6f62",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7c6fbf05-f74e-4ccb-b1c9-8701b56de646",
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
  "created_at": "2026-10-31T02:11:40.321287Z",
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
    "id": "fe86efa7-e937-44af-b9d0-947abfe36db0",
    "order_id": "229e9dce-8c54-48e3-9d2b-20346f3c6f62",
    "expires_at": "2026-10-31T02:11:55.324723Z",
    "server_time": "2026-10-31T02:11:40.744697307Z",
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

`POST /api/driver/v1/offers/fe86efa7-e937-44af-b9d0-947abfe36db0/accept` → **200**

```json
{
  "command_id": "1854f583-362c-4a5b-8fec-87968858093f"
}
```

```json
{
  "id": "66182d5c-2f62-4ea5-a6f5-717fc6438e6f",
  "order_id": "229e9dce-8c54-48e3-9d2b-20346f3c6f62",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "8f2750c1-4b96-4dfd-aec8-7f669041672f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "8f2750c1-4b96-4dfd-aec8-7f669041672f",
  "order_id": "229e9dce-8c54-48e3-9d2b-20346f3c6f62",
  "assignment_id": "66182d5c-2f62-4ea5-a6f5-717fc6438e6f",
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
  "entrance": null,
  "contact_attempts": []
}
```

`POST /api/driver/v1/work-sessions/d357c486-5cbe-42e3-b3cb-6afdadb2b13b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T02:11:41Z",
    "sequence": 1793412701315
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "d357c486-5cbe-42e3-b3cb-6afdadb2b13b",
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
  "last_heartbeat_at": "2026-10-31T02:11:41.33104Z",
  "last_location_at": "2026-10-31T02:11:41.33104Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/8f2750c1-4b96-4dfd-aec8-7f669041672f/arrive` → **200**

```json
{
  "command_id": "f7b6f69c-82c2-424e-8e09-ab4d2c033d13",
  "expected_version": 0
}
```

```json
{
  "id": "8f2750c1-4b96-4dfd-aec8-7f669041672f",
  "order_id": "229e9dce-8c54-48e3-9d2b-20346f3c6f62",
  "assignment_id": "66182d5c-2f62-4ea5-a6f5-717fc6438e6f",
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
  "arrived_at": "2026-10-31T02:11:41.524405Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null,
  "comment": null,
  "entrance": null,
  "contact_attempts": []
}
```

`POST /api/driver/v1/trips/8f2750c1-4b96-4dfd-aec8-7f669041672f/start` → **200**

```json
{
  "command_id": "1c6b5368-32e6-4c62-811b-f8a04b7bc85b",
  "expected_version": 1
}
```

```json
{
  "id": "8f2750c1-4b96-4dfd-aec8-7f669041672f",
  "order_id": "229e9dce-8c54-48e3-9d2b-20346f3c6f62",
  "assignment_id": "66182d5c-2f62-4ea5-a6f5-717fc6438e6f",
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
  "arrived_at": "2026-10-31T02:11:41.524405Z",
  "started_at": "2026-10-31T02:11:41.731058Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null,
  "comment": null,
  "entrance": null,
  "contact_attempts": []
}
```

`POST /api/driver/v1/trips/8f2750c1-4b96-4dfd-aec8-7f669041672f/complete` → **200**

```json
{
  "command_id": "c40700fe-002a-438c-9da5-b730612f2f2d",
  "expected_version": 2,
  "reported_at": "2026-10-31T02:11:41Z",
  "cash_received": true
}
```

```json
{
  "id": "8f2750c1-4b96-4dfd-aec8-7f669041672f",
  "order_id": "229e9dce-8c54-48e3-9d2b-20346f3c6f62",
  "assignment_id": "66182d5c-2f62-4ea5-a6f5-717fc6438e6f",
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
  "arrived_at": "2026-10-31T02:11:41.524405Z",
  "started_at": "2026-10-31T02:11:41.731058Z",
  "completed_at": "2026-10-31T02:11:41.93455Z",
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null,
  "comment": null,
  "entrance": null,
  "contact_attempts": []
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "7c6fbf05-f74e-4ccb-b1c9-8701b56de646",
  "balances": [
    {
      "currency": "UAH",
      "balance_minor": 300,
      "reserved_minor": 0,
      "available_minor": 300
    }
  ],
  "entries": [
    {
      "id": "14a19889-d181-4639-8d48-cc961c2048ce",
      "at": "2026-10-31T02:11:42.043592Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -16297,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "229e9dce-8c54-48e3-9d2b-20346f3c6f62"
    },
    {
      "id": "2223bef6-912c-47dc-8368-951f1890add9",
      "at": "2026-10-31T02:11:40.117736Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "13536a6b-90d5-4717-bcad-60e066f5abae",
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

`GET /api/rider/v1/orders/229e9dce-8c54-48e3-9d2b-20346f3c6f62/tip` → **200**

```json
{
  "order_id": "229e9dce-8c54-48e3-9d2b-20346f3c6f62",
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
  "available_until": "2026-11-01T02:11:41.93455Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/229e9dce-8c54-48e3-9d2b-20346f3c6f62/tip` → **201**

```json
{
  "command_id": "3375724a-f596-436a-a869-3ef8eec423e7",
  "amount_minor": 2500
}
```

```json
{
  "id": "e20ac9de-091f-47ca-b720-c2d6a4097858",
  "order_id": "229e9dce-8c54-48e3-9d2b-20346f3c6f62",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-31T02:11:42.682758Z"
}
```

`GET /api/rider/v1/orders/229e9dce-8c54-48e3-9d2b-20346f3c6f62/tip` → **200**

```json
{
  "order_id": "229e9dce-8c54-48e3-9d2b-20346f3c6f62",
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
  "available_until": "2026-11-01T02:11:41.93455Z",
  "open": false,
  "tip": {
    "id": "e20ac9de-091f-47ca-b720-c2d6a4097858",
    "order_id": "229e9dce-8c54-48e3-9d2b-20346f3c6f62",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-31T02:11:42.682758Z"
  }
}
```

`GET /api/rider/v1/orders/229e9dce-8c54-48e3-9d2b-20346f3c6f62/tip` → **200**

```json
{
  "order_id": "229e9dce-8c54-48e3-9d2b-20346f3c6f62",
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
  "available_until": "2026-11-01T02:11:41.93455Z",
  "open": false,
  "tip": {
    "id": "e20ac9de-091f-47ca-b720-c2d6a4097858",
    "order_id": "229e9dce-8c54-48e3-9d2b-20346f3c6f62",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-31T02:11:42.682758Z"
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
      "id": "bc0caff1-e9cb-4284-b370-d588c0fec281",
      "at": "2026-10-31T02:11:44.059531Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "229e9dce-8c54-48e3-9d2b-20346f3c6f62",
      "counterpart_id": null
    },
    {
      "id": "54baa06b-2f23-418c-9fed-0a1a3ee6d22c",
      "at": "2026-10-31T02:11:42.039651Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "229e9dce-8c54-48e3-9d2b-20346f3c6f62",
      "counterpart_id": null
    },
    {
      "id": "9a8ed755-5cda-454c-9142-23a2deeb2dd1",
      "at": "2026-10-31T02:11:38.002394Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "87d68a15-bb38-4ac2-b6b4-c15193925a9c",
      "counterpart_id": null
    },
    {
      "id": "b8597fbc-235d-4c7f-b828-22f7c66d3ec2",
      "at": "2026-10-31T02:11:32.964755Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "87d68a15-bb38-4ac2-b6b4-c15193925a9c",
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
  "session_id": "d357c486-5cbe-42e3-b3cb-6afdadb2b13b",
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
  "last_heartbeat_at": "2026-10-31T02:11:41.33104Z",
  "last_location_at": "2026-10-31T02:11:41.33104Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d357c486-5cbe-42e3-b3cb-6afdadb2b13b/close` → **200**

```json
{
  "command_id": "925b9cfa-5029-4ebf-895d-d4ac1a3cf772",
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

Done: card order 229e9dce-8c54-48e3-9d2b-20346f3c6f62.

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
  "phone": "+380733713122",
  "device_ref": "sandbox-27788"
}
```

```json
{
  "challenge_id": "c0da2da4-e898-4d29-9547-c6b83f046621",
  "expires_at": "2026-10-31T02:16:45.052316015Z",
  "resend_available_at": "2026-10-31T02:11:46.052316015Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380733713122` → **200**

```json
{
  "phone": "+380733713122",
  "audience": "CLIENT",
  "code": "560257",
  "sent_at": "2026-10-31T02:11:45.054123962Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c0da2da4-e898-4d29-9547-c6b83f046621",
  "code": "560257",
  "device_ref": "sandbox-27788"
}
```

```json
{
  "session_id": "2d1f4a9e-1915-4d2b-8767-8e985f920aff",
  "subject": {
    "type": "CLIENT",
    "id": "0b763bb4-7a34-410c-9fad-5758ab7b032d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwYjc2M2JiNC03YTM0LTQxMGMtOWZhZC01NzU4YWI3YjAzMmQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDEzNjA1LCJpYXQiOjE3OTM0MTI3MDUsImp0aSI6IjdkZTEwNjlmLWUzMzktNDRlYS04YTVjLWJiNGRmMzU0YWUxYSIsInNpZCI6IjJkMWY0YTllLTE5MTUtNGQyYi04NzY3LThlOTg1ZjkyMGFmZiJ9.A0TiJ5yB26imswoYi0JT09RRu6VP5mRybCFGGCCGqOE",
  "access_expires_at": "2026-10-31T02:26:45.259645275Z",
  "refresh_token": "i77y5VPBVSa_XZeAP1UPwbtrHhN1LoSRCuLscX8tEvs",
  "refresh_expires_at": "2026-11-30T02:11:45.25931911Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "46ee47b9-f74a-4941-b33c-8d1bd7a72aec",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "a23bf75a-d12a-4cce-8854-a20360a0a9a4",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-a23bf75a-d12a-4cce-8854-a20360a0a9a4",
    "orderDate": "1793412705",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "c22014ac91a508653ec1b63019628dfb",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=a23bf75a-d12a-4cce-8854-a20360a0a9a4",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380733713122"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=a23bf75a-d12a-4cce-8854-a20360a0a9a4",
  "created_at": "2026-10-31T02:11:45.446306Z",
  "expires_at": "2026-10-31T02:41:45.446306Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/a23bf75a-d12a-4cce-8854-a20360a0a9a4` → **200**

```json
{
  "id": "a23bf75a-d12a-4cce-8854-a20360a0a9a4",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-31T02:11:45.446306Z",
  "expires_at": "2026-10-31T02:41:45.446306Z",
  "completed_at": "2026-10-31T02:11:45.634226Z",
  "masked_pan": "41****5784",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "0b763bb4-7a34-410c-9fad-5758ab7b032d",
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
  "client_id": "0b763bb4-7a34-410c-9fad-5758ab7b032d",
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
      "id": "9059bb95-00aa-4040-9c07-c9005a8e8063",
      "at": "2026-10-31T02:11:46.068243Z",
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
  "client_id": "0b763bb4-7a34-410c-9fad-5758ab7b032d",
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
      "id": "9059bb95-00aa-4040-9c07-c9005a8e8063",
      "at": "2026-10-31T02:11:46.068243Z",
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
  "device_ref": "sandbox-7794"
}
```

```json
{
  "challenge_id": "ec3e6210-7cb2-4876-a1b4-ecedb3698e87",
  "expires_at": "2026-10-31T02:16:47.388099573Z",
  "resend_available_at": "2026-10-31T02:11:48.388099573Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "405605",
  "sent_at": "2026-10-31T02:11:47.38989439Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ec3e6210-7cb2-4876-a1b4-ecedb3698e87",
  "code": "405605",
  "device_ref": "sandbox-7794"
}
```

```json
{
  "session_id": "8405e682-4985-4def-8dd7-f47dac30bf14",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQxMzYwNywiaWF0IjoxNzkzNDEyNzA3LCJqdGkiOiIxMjRkMDU0MC1iMWZmLTQzNGItYTIxYS1hYzQ5YjFmMGJhOWYiLCJzaWQiOiI4NDA1ZTY4Mi00OTg1LTRkZWYtOGRkNy1mNDdkYWMzMGJmMTQifQ.mhIAWNeiCK9CUifiNDZfzRiDUzNyRX9X5irb8utoUiY",
  "access_expires_at": "2026-10-31T02:26:47.592753937Z",
  "refresh_token": "kcmBlv4xZxxCSpryEVLDzl0HM55VKGCph1R4s5HGeb8",
  "refresh_expires_at": "2026-11-30T02:11:47.592400152Z",
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
  "command_id": "559c8c86-269d-49ad-ad7e-f31099e4aba6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "069e5f1d-3510-4034-adbc-5d42c38f9011",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-069e5f1d-3510-4034-adbc-5d42c38f9011",
    "orderDate": "1793412707",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "0cb3b64392dc9084cb231a85d8c0c7eb",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=069e5f1d-3510-4034-adbc-5d42c38f9011",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=069e5f1d-3510-4034-adbc-5d42c38f9011",
  "created_at": "2026-10-31T02:11:47.955243Z",
  "expires_at": "2026-10-31T02:41:47.955243Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/069e5f1d-3510-4034-adbc-5d42c38f9011` → **200**

```json
{
  "id": "069e5f1d-3510-4034-adbc-5d42c38f9011",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-31T02:11:47.955243Z",
  "expires_at": "2026-10-31T02:41:47.955243Z",
  "completed_at": "2026-10-31T02:11:48.139202Z",
  "masked_pan": "41****1325",
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
      "id": "637fd1bf-00ef-460d-bf0e-d3c4a7293904",
      "at": "2026-10-31T02:11:49.073882Z",
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
  "command_id": "cc1f81b0-90a7-4b31-b452-9056b16a61dc",
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
  "correlation_id": "504a7053-6bd6-4c21-ac77-ae856675c1fe"
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
  "device_ref": "sandbox-17555"
}
```

```json
{
  "challenge_id": "38bce2bc-6064-49be-95cb-84de10b15301",
  "expires_at": "2026-10-31T02:16:49.912508082Z",
  "resend_available_at": "2026-10-31T02:11:50.912508082Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "142204",
  "sent_at": "2026-10-31T02:11:49.914506542Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "38bce2bc-6064-49be-95cb-84de10b15301",
  "code": "142204",
  "device_ref": "sandbox-17555"
}
```

```json
{
  "session_id": "263a937f-005a-4413-968b-56188b31ba6c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQxMzYxMCwiaWF0IjoxNzkzNDEyNzEwLCJqdGkiOiJmYjAzMTE0NC0zMTFmLTRmZjUtODExZC1mMTA4ZmFhOWE3MWUiLCJzaWQiOiIyNjNhOTM3Zi0wMDVhLTQ0MTMtOTY4Yi01NjE4OGIzMWJhNmMifQ.lekRqGFrGdNbtKlsviKxz2j5NguM5amoGn-3Vl0_PRo",
  "access_expires_at": "2026-10-31T02:26:50.119298957Z",
  "refresh_token": "VQDarzFsyYULT7biiWv6bAysAu_Bo-0rPQ6bGpOsr7E",
  "refresh_expires_at": "2026-11-30T02:11:50.118946724Z",
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
  "command_id": "569a92c2-8673-4e69-88ae-9df48ed46dfb",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T02:11:50Z",
    "sequence": 1793412710504
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "04bb2a55-9dc7-4cdf-9144-13bef928f16d",
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
  "last_heartbeat_at": "2026-10-31T02:11:50.518458Z",
  "last_location_at": "2026-10-31T02:11:50.518458Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A rider orders for cash

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638049863",
  "device_ref": "sandbox-6097"
}
```

```json
{
  "challenge_id": "18be2dc5-2d87-495f-9fd7-520e552c27c6",
  "expires_at": "2026-10-31T02:16:50.706522848Z",
  "resend_available_at": "2026-10-31T02:11:51.706522848Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638049863` → **200**

```json
{
  "phone": "+380638049863",
  "audience": "CLIENT",
  "code": "741377",
  "sent_at": "2026-10-31T02:11:50.708373909Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "18be2dc5-2d87-495f-9fd7-520e552c27c6",
  "code": "741377",
  "device_ref": "sandbox-6097"
}
```

```json
{
  "session_id": "670f4954-f5fb-4ad0-8db3-1482fb903fdb",
  "subject": {
    "type": "CLIENT",
    "id": "bab45c2e-67b9-4bd5-9371-565fd7384aa3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYWI0NWMyZS02N2I5LTRiZDUtOTM3MS01NjVmZDczODRhYTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDEzNjEwLCJpYXQiOjE3OTM0MTI3MTAsImp0aSI6ImYyNjNjNjc0LThlNDUtNDc1Mi05OGU4LTY2YWI5NGNkODRmMyIsInNpZCI6IjY3MGY0OTU0LWY1ZmItNGFkMC04ZGIzLTE0ODJmYjkwM2ZkYiJ9.eGr5oGunfBJ7mtJ_oW_0cJesNlphGQJJ_wyENaDBtrY",
  "access_expires_at": "2026-10-31T02:26:50.912765935Z",
  "refresh_token": "Q2VOcJAYWin6rFJWCwnNc0eSsa6hYVMwihAKTen2xog",
  "refresh_expires_at": "2026-11-30T02:11:50.912382079Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8fe91c45-3ed3-4f92-b7bb-06a584fb5f10",
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
  "id": "dd8427ca-ae52-40f8-905d-599a4c90737b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T02:16:51.100600Z",
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
  "command_id": "e7ce686b-e77b-4a35-8111-d9dd257cff75",
  "quote_id": "dd8427ca-ae52-40f8-905d-599a4c90737b",
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
  "id": "485c8b2e-eab3-4714-9053-caf2a5948165",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bab45c2e-67b9-4bd5-9371-565fd7384aa3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T02:11:51.291515Z",
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
    "id": "cf64dc95-a58f-4a3c-acd4-05844293400c",
    "order_id": "485c8b2e-eab3-4714-9053-caf2a5948165",
    "expires_at": "2026-10-31T02:12:06.293035Z",
    "server_time": "2026-10-31T02:11:51.497377279Z",
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

`POST /api/driver/v1/offers/cf64dc95-a58f-4a3c-acd4-05844293400c/accept` → **200**

```json
{
  "command_id": "3384525e-667a-4481-8013-7c5d49e686f7"
}
```

```json
{
  "id": "794fbcb9-1338-4e60-a0d0-a76e3822de56",
  "order_id": "485c8b2e-eab3-4714-9053-caf2a5948165",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "00d52858-39d9-4f97-ba1e-f71701819835",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "00d52858-39d9-4f97-ba1e-f71701819835",
  "order_id": "485c8b2e-eab3-4714-9053-caf2a5948165",
  "assignment_id": "794fbcb9-1338-4e60-a0d0-a76e3822de56",
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
  "entrance": null,
  "contact_attempts": []
}
```

`POST /api/driver/v1/work-sessions/04bb2a55-9dc7-4cdf-9144-13bef928f16d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T02:11:52Z",
    "sequence": 1793412712755
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "04bb2a55-9dc7-4cdf-9144-13bef928f16d",
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
  "last_heartbeat_at": "2026-10-31T02:11:52.091668Z",
  "last_location_at": "2026-10-31T02:11:52.091668Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/00d52858-39d9-4f97-ba1e-f71701819835/arrive` → **200**

```json
{
  "command_id": "f19fbb94-f31a-4e9d-9a4b-b68f5681b8e4",
  "expected_version": 0
}
```

```json
{
  "id": "00d52858-39d9-4f97-ba1e-f71701819835",
  "order_id": "485c8b2e-eab3-4714-9053-caf2a5948165",
  "assignment_id": "794fbcb9-1338-4e60-a0d0-a76e3822de56",
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
  "arrived_at": "2026-10-31T02:11:52.291692Z",
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

`POST /api/driver/v1/trips/00d52858-39d9-4f97-ba1e-f71701819835/start` → **200**

```json
{
  "command_id": "3ac52044-c65a-4a3c-a400-7d92da428d06",
  "expected_version": 1
}
```

```json
{
  "id": "00d52858-39d9-4f97-ba1e-f71701819835",
  "order_id": "485c8b2e-eab3-4714-9053-caf2a5948165",
  "assignment_id": "794fbcb9-1338-4e60-a0d0-a76e3822de56",
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
  "arrived_at": "2026-10-31T02:11:52.291692Z",
  "started_at": "2026-10-31T02:11:52.492886Z",
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

`POST /api/driver/v1/trips/00d52858-39d9-4f97-ba1e-f71701819835/complete` → **200**

```json
{
  "command_id": "2c44d736-cf5a-48c0-8265-fb1f4b19a8e1",
  "expected_version": 2,
  "reported_at": "2026-10-31T02:11:52Z",
  "cash_received": false
}
```

```json
{
  "id": "00d52858-39d9-4f97-ba1e-f71701819835",
  "order_id": "485c8b2e-eab3-4714-9053-caf2a5948165",
  "assignment_id": "794fbcb9-1338-4e60-a0d0-a76e3822de56",
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
  "arrived_at": "2026-10-31T02:11:52.291692Z",
  "started_at": "2026-10-31T02:11:52.492886Z",
  "completed_at": "2026-10-31T02:11:52.695323Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null,
  "comment": null,
  "entrance": null,
  "contact_attempts": []
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
  "session_id": "da69f34f-97a0-4b0d-b105-3e202e01eacc",
  "subject": {
    "type": "STAFF",
    "id": "13536a6b-90d5-4717-bcad-60e066f5abae"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzUzNmE2Yi05MGQ1LTQ3MTctYmNhZC02MGUwNjZmNWFiYWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MTM2MTMsImlhdCI6MTc5MzQxMjcxMywianRpIjoiNzNkYmJhODMtYmIzYy00YmIxLWI4ZDQtMjVhY2U3MjdmM2I0Iiwic2lkIjoiZGE2OWYzNGYtOTdhMC00YjBkLWIxMDUtM2UyMDJlMDFlYWNjIn0.z5_5SSj7WCHcdAueB5R5wOl79VhjU6TFjZ3lUeONrQo",
  "access_expires_at": "2026-10-31T02:26:53.096528804Z",
  "refresh_token": "caXVyJoShQatZbGDB18kq79G9FzLk6E9krldwSibml0",
  "refresh_expires_at": "2026-10-31T14:11:53.096154007Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/485c8b2e-eab3-4714-9053-caf2a5948165/cash-dispute` → **200**

```json
{
  "order_id": "485c8b2e-eab3-4714-9053-caf2a5948165",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "bab45c2e-67b9-4bd5-9371-565fd7384aa3",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-31T02:11:53.116363Z",
  "decide_by": "2026-11-14T02:11:53.116363Z",
  "decision": null,
  "decided_by": null,
  "reason": null,
  "decided_at": null,
  "version": 1
}
```

Dispute: {"held_minor":0,"rider_debt_minor":10517,"decide_by":"2026-11-14T02:11:53.116363Z","decision":null}

`GET /api/admin/v1/cash-disputes` → **200**

```json
{
  "disputes": [
    {
      "order_id": "485c8b2e-eab3-4714-9053-caf2a5948165",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "payer_client_id": "bab45c2e-67b9-4bd5-9371-565fd7384aa3",
      "currency": "UAH",
      "held_minor": 0,
      "rider_debt_minor": 10517,
      "opened_at": "2026-10-31T02:11:53.116363Z",
      "decide_by": "2026-11-14T02:11:53.116363Z",
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

`POST /api/admin/v1/orders/485c8b2e-eab3-4714-9053-caf2a5948165/cash-dispute/decide` → **400**

```json
{
  "command_id": "e28d2f2a-a366-41e7-a7ef-0136dcb1a8ad",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/orders/485c8b2e-eab3-4714-9053-caf2a5948165/cash-dispute/decide",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "5a2e4831-1e7d-4e63-be12-65852fbb66df",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

`POST /api/admin/v1/orders/485c8b2e-eab3-4714-9053-caf2a5948165/cash-dispute/decide` → **200**

```json
{
  "command_id": "c5be5aa4-3d95-4004-bc59-c30bb3a90bbb",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": "The rider does not answer calls"
}
```

```json
{
  "order_id": "485c8b2e-eab3-4714-9053-caf2a5948165",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "bab45c2e-67b9-4bd5-9371-565fd7384aa3",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-31T02:11:53.116363Z",
  "decide_by": "2026-11-14T02:11:53.116363Z",
  "decision": "PAY_DRIVER",
  "decided_by": "13536a6b-90d5-4717-bcad-60e066f5abae",
  "reason": "The rider does not answer calls",
  "decided_at": "2026-10-31T02:11:53.883936Z",
  "version": 2
}
```

`POST /api/admin/v1/orders/485c8b2e-eab3-4714-9053-caf2a5948165/cash-dispute/decide` → **409**

```json
{
  "command_id": "4806fa56-77e4-4c1c-9bb9-39572181002a",
  "expected_version": 2,
  "decision": "RIDER_PAID",
  "reason": "Again"
}
```

```json
{
  "instance": "/api/admin/v1/orders/485c8b2e-eab3-4714-9053-caf2a5948165/cash-dispute/decide",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "4f767e47-9ec6-48d4-9460-6502dabd479c"
}
```

Done: an unpaid cash trip became a dispute and was decided once.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "04bb2a55-9dc7-4cdf-9144-13bef928f16d",
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
  "last_heartbeat_at": "2026-10-31T02:11:52.091668Z",
  "last_location_at": "2026-10-31T02:11:52.091668Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/04bb2a55-9dc7-4cdf-9144-13bef928f16d/close` → **200**

```json
{
  "command_id": "44e9158c-3258-44ba-8caa-411a80fe2b80",
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
  "phone": "+380730133005",
  "device_ref": "sandbox-28755"
}
```

```json
{
  "challenge_id": "af89d8d5-262a-44d6-ad0c-ab41c70ee9a3",
  "expires_at": "2026-10-31T02:16:54.655152448Z",
  "resend_available_at": "2026-10-31T02:11:55.655152448Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380730133005` → **200**

```json
{
  "phone": "+380730133005",
  "audience": "CLIENT",
  "code": "492477",
  "sent_at": "2026-10-31T02:11:54.661062661Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "af89d8d5-262a-44d6-ad0c-ab41c70ee9a3",
  "code": "492477",
  "device_ref": "sandbox-28755"
}
```

```json
{
  "session_id": "2817bf57-1ba9-49a9-988d-09547155aa7e",
  "subject": {
    "type": "CLIENT",
    "id": "1c4dbea2-35d3-4e72-b44a-14217ed0f1a1"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxYzRkYmVhMi0zNWQzLTRlNzItYjQ0YS0xNDIxN2VkMGYxYTEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDEzNjE0LCJpYXQiOjE3OTM0MTI3MTQsImp0aSI6ImExZGNjOGFkLTZiNzctNDQ1NC1hYzI4LWQwMGZlMmZhNzIzMSIsInNpZCI6IjI4MTdiZjU3LTFiYTktNDlhOS05ODhkLTA5NTQ3MTU1YWE3ZSJ9.irg2jyCw0pFSwZNSlHkzMBgGZRM2bdZTdQhexqK1s5A",
  "access_expires_at": "2026-10-31T02:26:54.867146282Z",
  "refresh_token": "Z2J9wuOi1YrJP3fM4hy667K1QbBxfRi3_76Fo2mH8Tc",
  "refresh_expires_at": "2026-11-30T02:11:54.866822601Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "29bdde5f-f324-4527-b6eb-5d4d4c0654cc",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "b2e1a630-ab72-43fe-a846-099c339041e8",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-b2e1a630-ab72-43fe-a846-099c339041e8",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "89341b4f11dad71c76b013d84ec9b281",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=b2e1a630-ab72-43fe-a846-099c339041e8",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380730133005"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=b2e1a630-ab72-43fe-a846-099c339041e8",
  "expires_at": "2026-10-31T02:41:55.057524Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/b2e1a630-ab72-43fe-a846-099c339041e8` → **200**

```json
{
  "id": "b2e1a630-ab72-43fe-a846-099c339041e8",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-31T02:41:55.057524Z",
  "card": {
    "id": "81376f32-0eac-4988-b891-4188103bb215",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****6286",
    "card_type": "Visa",
    "created_at": "2026-10-31T02:11:55.249381Z"
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
  "device_ref": "sandbox-12938"
}
```

```json
{
  "challenge_id": "87013d42-f320-4b9a-9716-1dc070be2821",
  "expires_at": "2026-10-31T02:16:55.455357971Z",
  "resend_available_at": "2026-10-31T02:11:56.455357971Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "323522",
  "sent_at": "2026-10-31T02:11:55.457239618Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "87013d42-f320-4b9a-9716-1dc070be2821",
  "code": "323522",
  "device_ref": "sandbox-12938"
}
```

```json
{
  "session_id": "aa7636b6-3f82-4d44-b282-632265b416ef",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQxMzYxNSwiaWF0IjoxNzkzNDEyNzE1LCJqdGkiOiJiNTQ0YTFkMS1mMjYwLTQxODMtOWQ4ZS02NzJmZDZlMzlhYjQiLCJzaWQiOiJhYTc2MzZiNi0zZjgyLTRkNDQtYjI4Mi02MzIyNjViNDE2ZWYifQ.p0Sdtxmxr9xh1aScqvJj-8HwqgyBQgA5SZ4WKk7Eam8",
  "access_expires_at": "2026-10-31T02:26:55.66548384Z",
  "refresh_token": "QQrCYXvOJONwEJhiO1NOnpcSgEfp1hanoZbN3TLgfrQ",
  "refresh_expires_at": "2026-11-30T02:11:55.665132608Z",
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
  "command_id": "b6b6d57c-692a-4c2b-945f-4b34391c8fc1",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T02:11:56Z",
    "sequence": 1793412716357
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "5aeed7d7-11a9-4f15-a77a-5463b347d0d6",
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
  "last_heartbeat_at": "2026-10-31T02:11:56.050996Z",
  "last_location_at": "2026-10-31T02:11:56.050996Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A card ride; on the way both write numbers into the chat

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "40ee4ab0-51c7-4d18-8eb2-02a08e1c965f",
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
  "id": "13a3ea06-6153-4b15-88d3-73a7651fd4a5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T02:16:56.252385Z",
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
  "command_id": "fccc0433-b09a-4499-bdbf-d2fb6fa6bdf8",
  "quote_id": "13a3ea06-6153-4b15-88d3-73a7651fd4a5",
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
  "id": "01b10f37-6795-4fcf-b7eb-36d522aad13a",
  "short_number": 11,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "1c4dbea2-35d3-4e72-b44a-14217ed0f1a1",
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
  "created_at": "2026-10-31T02:11:56.444173Z",
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

`GET /api/rider/v1/orders/01b10f37-6795-4fcf-b7eb-36d522aad13a` → **200**

```json
{
  "id": "01b10f37-6795-4fcf-b7eb-36d522aad13a",
  "short_number": 11,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "1c4dbea2-35d3-4e72-b44a-14217ed0f1a1",
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
  "created_at": "2026-10-31T02:11:56.444173Z",
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

`GET /api/rider/v1/orders/01b10f37-6795-4fcf-b7eb-36d522aad13a` → **200**

```json
{
  "id": "01b10f37-6795-4fcf-b7eb-36d522aad13a",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "1c4dbea2-35d3-4e72-b44a-14217ed0f1a1",
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
  "created_at": "2026-10-31T02:11:56.444173Z",
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
    "id": "426547ca-01c0-4792-b1be-e0cd6c8ee09c",
    "order_id": "01b10f37-6795-4fcf-b7eb-36d522aad13a",
    "expires_at": "2026-10-31T02:12:12.147021Z",
    "server_time": "2026-10-31T02:11:58.026180903Z",
    "seconds_left": 14,
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

`POST /api/driver/v1/offers/426547ca-01c0-4792-b1be-e0cd6c8ee09c/accept` → **200**

```json
{
  "command_id": "91a43204-739f-4365-a656-2ca84f2888cf"
}
```

```json
{
  "id": "8c477054-832f-453d-9a44-69e1e5e23c70",
  "order_id": "01b10f37-6795-4fcf-b7eb-36d522aad13a",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d3b35da7-ac1d-45ad-b2c0-431868881e89",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d3b35da7-ac1d-45ad-b2c0-431868881e89",
  "order_id": "01b10f37-6795-4fcf-b7eb-36d522aad13a",
  "assignment_id": "8c477054-832f-453d-9a44-69e1e5e23c70",
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
  "entrance": null,
  "contact_attempts": []
}
```

`POST /api/rider/v1/orders/01b10f37-6795-4fcf-b7eb-36d522aad13a/messages` → **201**

```json
{
  "command_id": "c13a2899-a505-4eb8-a68f-0a5ceb1bc04a",
  "body": "Я біля входу, мій номер +380730133005, картка 4111 1111 1111 1111"
}
```

```json
{
  "id": "d53dde43-726e-40a3-98e8-9d9a4212f8b8",
  "order_id": "01b10f37-6795-4fcf-b7eb-36d522aad13a",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу, мій номер +380730133005, картка 4111 1111 1111 1111",
  "sent_at": "2026-10-31T02:11:58.596833727Z"
}
```

`POST /api/driver/v1/trips/d3b35da7-ac1d-45ad-b2c0-431868881e89/messages` → **201**

```json
{
  "command_id": "c96c9604-f00a-421a-a5cc-1a5f3a9b5bba",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03"
}
```

```json
{
  "id": "dc73a8b5-b1da-447e-9d88-c8ca6193cf6b",
  "order_id": "01b10f37-6795-4fcf-b7eb-36d522aad13a",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03",
  "sent_at": "2026-10-31T02:11:58.78825408Z"
}
```

(the car drives 7 s to the next point)

`POST /api/driver/v1/work-sessions/5aeed7d7-11a9-4f15-a77a-5463b347d0d6/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T02:12:05Z",
    "sequence": 1793412725986
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "5aeed7d7-11a9-4f15-a77a-5463b347d0d6",
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
  "last_heartbeat_at": "2026-10-31T02:12:06.001981Z",
  "last_location_at": "2026-10-31T02:12:06.001981Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/d3b35da7-ac1d-45ad-b2c0-431868881e89/arrive` → **200**

```json
{
  "command_id": "a6e05cdf-4403-42d0-9613-2a8b45c49953",
  "expected_version": 0
}
```

```json
{
  "id": "d3b35da7-ac1d-45ad-b2c0-431868881e89",
  "order_id": "01b10f37-6795-4fcf-b7eb-36d522aad13a",
  "assignment_id": "8c477054-832f-453d-9a44-69e1e5e23c70",
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
  "arrived_at": "2026-10-31T02:12:06.191514Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null,
  "comment": null,
  "entrance": null,
  "contact_attempts": [
    {
      "kind": "MESSAGE",
      "at": "2026-10-31T02:11:58.788254Z"
    }
  ]
}
```

`POST /api/driver/v1/trips/d3b35da7-ac1d-45ad-b2c0-431868881e89/start` → **200**

```json
{
  "command_id": "d7783f3f-bd4e-4931-ac39-2c8d50fec8a8",
  "expected_version": 1
}
```

```json
{
  "id": "d3b35da7-ac1d-45ad-b2c0-431868881e89",
  "order_id": "01b10f37-6795-4fcf-b7eb-36d522aad13a",
  "assignment_id": "8c477054-832f-453d-9a44-69e1e5e23c70",
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
  "arrived_at": "2026-10-31T02:12:06.191514Z",
  "started_at": "2026-10-31T02:12:06.392206Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null,
  "comment": null,
  "entrance": null,
  "contact_attempts": [
    {
      "kind": "MESSAGE",
      "at": "2026-10-31T02:11:58.788254Z"
    }
  ]
}
```

(the car drives 90 s to the next point)

`POST /api/driver/v1/work-sessions/5aeed7d7-11a9-4f15-a77a-5463b347d0d6/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4584,
    "lon": 30.4300,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T02:13:36Z",
    "sequence": 1793412816606
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "5aeed7d7-11a9-4f15-a77a-5463b347d0d6",
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
  "last_heartbeat_at": "2026-10-31T02:13:36.624827Z",
  "last_location_at": "2026-10-31T02:13:36.624827Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/d3b35da7-ac1d-45ad-b2c0-431868881e89/complete` → **200**

```json
{
  "command_id": "ba6bc07c-4417-4d55-a873-96e3ec11f70c",
  "expected_version": 2,
  "reported_at": "2026-10-31T02:13:36Z",
  "cash_received": false
}
```

```json
{
  "id": "d3b35da7-ac1d-45ad-b2c0-431868881e89",
  "order_id": "01b10f37-6795-4fcf-b7eb-36d522aad13a",
  "assignment_id": "8c477054-832f-453d-9a44-69e1e5e23c70",
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
  "arrived_at": "2026-10-31T02:12:06.191514Z",
  "started_at": "2026-10-31T02:12:06.392206Z",
  "completed_at": "2026-10-31T02:13:36.823425Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null,
  "comment": null,
  "entrance": null,
  "contact_attempts": [
    {
      "kind": "MESSAGE",
      "at": "2026-10-31T02:11:58.788254Z"
    }
  ]
}
```

`GET /api/rider/v1/orders/01b10f37-6795-4fcf-b7eb-36d522aad13a` → **200**

```json
{
  "id": "01b10f37-6795-4fcf-b7eb-36d522aad13a",
  "short_number": 11,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "1c4dbea2-35d3-4e72-b44a-14217ed0f1a1",
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
    "id": "8c477054-832f-453d-9a44-69e1e5e23c70",
    "order_id": "01b10f37-6795-4fcf-b7eb-36d522aad13a",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "d3b35da7-ac1d-45ad-b2c0-431868881e89",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-31T02:11:56.444173Z",
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

`GET /api/rider/v1/orders/01b10f37-6795-4fcf-b7eb-36d522aad13a` → **200**

```json
{
  "id": "01b10f37-6795-4fcf-b7eb-36d522aad13a",
  "short_number": 11,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "1c4dbea2-35d3-4e72-b44a-14217ed0f1a1",
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
    "id": "8c477054-832f-453d-9a44-69e1e5e23c70",
    "order_id": "01b10f37-6795-4fcf-b7eb-36d522aad13a",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "d3b35da7-ac1d-45ad-b2c0-431868881e89",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-31T02:11:56.444173Z",
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

`GET /api/rider/v1/orders/01b10f37-6795-4fcf-b7eb-36d522aad13a` → **200**

```json
{
  "id": "01b10f37-6795-4fcf-b7eb-36d522aad13a",
  "short_number": 11,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "1c4dbea2-35d3-4e72-b44a-14217ed0f1a1",
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
    "id": "8c477054-832f-453d-9a44-69e1e5e23c70",
    "order_id": "01b10f37-6795-4fcf-b7eb-36d522aad13a",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "d3b35da7-ac1d-45ad-b2c0-431868881e89",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-31T02:11:56.444173Z",
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
  "session_id": "5aeed7d7-11a9-4f15-a77a-5463b347d0d6",
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
  "last_heartbeat_at": "2026-10-31T02:13:36.624827Z",
  "last_location_at": "2026-10-31T02:13:36.624827Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5aeed7d7-11a9-4f15-a77a-5463b347d0d6/close` → **200**

```json
{
  "command_id": "5caef878-868f-4496-9acb-f0d69c99b73c",
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
  "session_id": "1786154a-d60e-4ae7-95a2-70bbdcfc8a33",
  "subject": {
    "type": "STAFF",
    "id": "13536a6b-90d5-4717-bcad-60e066f5abae"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzUzNmE2Yi05MGQ1LTQ3MTctYmNhZC02MGUwNjZmNWFiYWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MTM3MjAsImlhdCI6MTc5MzQxMjgyMCwianRpIjoiMjRhMzBjYzAtMDllZi00NzQ2LWE4OGUtYmVhY2E0ZjU3NzI5Iiwic2lkIjoiMTc4NjE1NGEtZDYwZS00YWU3LTk1YTItNzBiYmRjZmM4YTMzIn0.bs4aIedFzI_t7jXnbIL1tdJzEAWzncg30VK2ad1cdpA",
  "access_expires_at": "2026-10-31T02:28:40.222152036Z",
  "refresh_token": "l0zSv-9Fsor_eHqYVNxTXxE6pCc6xWUMi7q9ji8Q0cc",
  "refresh_expires_at": "2026-10-31T14:13:40.221797649Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/01b10f37-6795-4fcf-b7eb-36d522aad13a/evidence` → **400**

```json
{
  "instance": "/api/admin/v1/orders/01b10f37-6795-4fcf-b7eb-36d522aad13a/evidence",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "10f6e341-25fa-4383-b4f0-2f4ab018e3cd"
}
```

`GET /api/admin/v1/orders/01b10f37-6795-4fcf-b7eb-36d522aad13a/evidence?reason=Bank%20request%20sandbox` → **200**

```json
{
  "generated_at": "2026-10-31T02:13:40.604984456Z",
  "order": {
    "id": "01b10f37-6795-4fcf-b7eb-36d522aad13a",
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
    "created_at": "2026-10-31T02:11:56.444173Z",
    "assigned_at": "2026-10-31T02:11:58.218234Z",
    "arrived_at": "2026-10-31T02:12:06.191514Z",
    "started_at": "2026-10-31T02:12:06.392206Z",
    "completed_at": "2026-10-31T02:13:36.823425Z"
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
    "id": "1c4dbea2-35d3-4e72-b44a-14217ed0f1a1",
    "registered_at": "2026-10-31T02:11:54.8655Z",
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
      "created_at": "2026-10-31T02:11:56.445614Z"
    },
    {
      "type": "SETTLE",
      "state": "SUCCEEDED",
      "amount_minor": 16297,
      "currency": "UAH",
      "provider_status": "Approved",
      "created_at": "2026-10-31T02:13:37.284002Z"
    }
  ],
  "chat": [
    {
```

## Finance records the chargeback: the rider owes the fare again, a case opens

`POST /api/admin/v1/orders/01b10f37-6795-4fcf-b7eb-36d522aad13a/chargebacks` → **422**

```json
{
  "command_id": "fffc4323-06c8-42da-9b66-27f1a9de29f1",
  "amount_minor": 16298,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-30"
}
```

```json
{
  "instance": "/api/admin/v1/orders/01b10f37-6795-4fcf-b7eb-36d522aad13a/chargebacks",
  "status": 422,
  "title": "Chargeback not allowed",
  "type": "https://errors.blizz.taxi/chargeback-not-allowed",
  "code": "CHARGEBACK_NOT_ALLOWED",
  "correlation_id": "261cfa54-87e8-4923-bbcf-9ee89be93d95"
}
```

`POST /api/admin/v1/orders/01b10f37-6795-4fcf-b7eb-36d522aad13a/chargebacks` → **201**

```json
{
  "command_id": "8faa3d8e-a50b-4fa5-8ffd-d00930ff9c08",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-30"
}
```

```json
{
  "id": "7b90ec34-1920-4397-9169-e48627ddd8ca",
  "order_id": "01b10f37-6795-4fcf-b7eb-36d522aad13a",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-30",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-31T02:13:41.045276Z",
  "resolved_at": null,
  "version": 0
}
```

`POST /api/admin/v1/orders/01b10f37-6795-4fcf-b7eb-36d522aad13a/chargebacks` → **201**

```json
{
  "command_id": "8faa3d8e-a50b-4fa5-8ffd-d00930ff9c08",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-30"
}
```

```json
{
  "id": "7b90ec34-1920-4397-9169-e48627ddd8ca",
  "order_id": "01b10f37-6795-4fcf-b7eb-36d522aad13a",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-30",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-31T02:13:41.045276Z",
  "resolved_at": null,
  "version": 0
}
```

`GET /api/admin/v1/clients/1c4dbea2-35d3-4e72-b44a-14217ed0f1a1` → **200**

```json
{
  "client": {
    "id": "1c4dbea2-35d3-4e72-b44a-14217ed0f1a1",
    "phone": "+380730133005",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-31T02:11:54.8655Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "01b10f37-6795-4fcf-b7eb-36d522aad13a",
      "short_number": 11,
      "status": "FULFILLED",
      "created_at": "2026-10-31T02:11:56.444173Z",
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

`POST /api/admin/v1/orders/01b10f37-6795-4fcf-b7eb-36d522aad13a/chargebacks/7b90ec34-1920-4397-9169-e48627ddd8ca/resolve` → **200**

```json
{
  "command_id": "189a0aaf-70b1-49aa-98d2-e36ccb7cf19d",
  "expected_version": 0,
  "outcome": "WON",
  "reason": "Evidence accepted"
}
```

```json
{
  "id": "7b90ec34-1920-4397-9169-e48627ddd8ca",
  "order_id": "01b10f37-6795-4fcf-b7eb-36d522aad13a",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-30",
  "state": "WON",
  "resolution_reason": "Evidence accepted",
  "created_at": "2026-10-31T02:13:41.045276Z",
  "resolved_at": "2026-10-31T02:13:41.676762Z",
  "version": 1
}
```

`GET /api/admin/v1/clients/1c4dbea2-35d3-4e72-b44a-14217ed0f1a1` → **200**

```json
{
  "client": {
    "id": "1c4dbea2-35d3-4e72-b44a-14217ed0f1a1",
    "phone": "+380730133005",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-31T02:11:54.8655Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "01b10f37-6795-4fcf-b7eb-36d522aad13a",
      "short_number": 11,
      "status": "FULFILLED",
      "created_at": "2026-10-31T02:11:56.444173Z",
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

`GET /api/admin/v1/clients/1c4dbea2-35d3-4e72-b44a-14217ed0f1a1` → **200**

```json
{
  "client": {
    "id": "1c4dbea2-35d3-4e72-b44a-14217ed0f1a1",
    "phone": "+380730133005",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-31T02:11:54.8655Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "01b10f37-6795-4fcf-b7eb-36d522aad13a",
      "short_number": 11,
      "status": "FULFILLED",
      "created_at": "2026-10-31T02:11:56.444173Z",
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

`POST /api/admin/v1/orders/01b10f37-6795-4fcf-b7eb-36d522aad13a/chargebacks/7b90ec34-1920-4397-9169-e48627ddd8ca/resolve` → **409**

```json
{
  "command_id": "dae94129-f70f-429e-bbd6-ab79bcff1f27",
  "expected_version": 1,
  "outcome": "LOST",
  "reason": "Twice"
}
```

```json
{
  "instance": "/api/admin/v1/orders/01b10f37-6795-4fcf-b7eb-36d522aad13a/chargebacks/7b90ec34-1920-4397-9169-e48627ddd8ca/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "a448aac2-c6b5-4494-82b2-5f253467ef98"
}
```

`GET /api/admin/v1/orders/01b10f37-6795-4fcf-b7eb-36d522aad13a/chargebacks` → **200**

```json
{
  "chargebacks": [
    {
      "id": "7b90ec34-1920-4397-9169-e48627ddd8ca",
      "order_id": "01b10f37-6795-4fcf-b7eb-36d522aad13a",
      "amount_minor": 16297,
      "currency": "UAH",
      "bank_reason": "4837 No cardholder authorization",
      "received_on": "2026-10-30",
      "state": "WON",
      "resolution_reason": "Evidence accepted",
      "created_at": "2026-10-31T02:13:41.045276Z",
      "resolved_at": "2026-10-31T02:13:41.676762Z",
      "version": 1
    }
  ]
}
```

Done: the evidence of card order 01b10f37-6795-4fcf-b7eb-36d522aad13a without phone or card digits; chargeback 7b90ec34-1920-4397-9169-e48627ddd8ca recorded and won.

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
  "session_id": "7cc83cba-ac7c-474c-9717-fabf1b162fc3",
  "subject": {
    "type": "STAFF",
    "id": "13536a6b-90d5-4717-bcad-60e066f5abae"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzUzNmE2Yi05MGQ1LTQ3MTctYmNhZC02MGUwNjZmNWFiYWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MTM3MjQsImlhdCI6MTc5MzQxMjgyNCwianRpIjoiYTZmODgwODItNTFiNy00OGVjLTg4ZjItNmI0YmI1ZThhMGMyIiwic2lkIjoiN2NjODNjYmEtYWM3Yy00NzRjLTk3MTctZmFiZjFiMTYyZmMzIn0.HKmK33Dj0BZ0-7LNQOQhgfiiJK19YN5Xm0U5AdLQJLA",
  "access_expires_at": "2026-10-31T02:28:44.067910938Z",
  "refresh_token": "MESSy4HOk9YHEE-yPtdYe4efP03ilZwP3j03OLKpssg",
  "refresh_expires_at": "2026-10-31T14:13:44.067554525Z",
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
  "phone": "+48600639445",
  "device_ref": "sandbox-31083"
}
```

```json
{
  "challenge_id": "1294223c-2dd1-44b2-aea7-0bde81ee389d",
  "expires_at": "2026-10-31T02:18:44.629173348Z",
  "resend_available_at": "2026-10-31T02:13:45.629173348Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600639445` → **200**

```json
{
  "phone": "+48600639445",
  "audience": "CLIENT",
  "code": "116830",
  "sent_at": "2026-10-31T02:13:44.63097747Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1294223c-2dd1-44b2-aea7-0bde81ee389d",
  "code": "116830",
  "device_ref": "sandbox-31083"
}
```

```json
{
  "session_id": "5324f34b-982a-418d-929f-dd8bee3fa6e1",
  "subject": {
    "type": "CLIENT",
    "id": "d32d1f9e-b996-4484-928c-be282489341a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMzJkMWY5ZS1iOTk2LTQ0ODQtOTI4Yy1iZTI4MjQ4OTM0MWEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDEzNzI0LCJpYXQiOjE3OTM0MTI4MjQsImp0aSI6ImUwMWVjODEwLWVlMTItNDBmYy1hNzQ0LWU4MTc0NTUxZWU0NiIsInNpZCI6IjUzMjRmMzRiLTk4MmEtNDE4ZC05MjlmLWRkOGJlZTNmYTZlMSJ9.iXNIM0QcAA-OxQZ2hrr_LT7-ySL3ax7x_MWq_rITzdk",
  "access_expires_at": "2026-10-31T02:28:44.865979462Z",
  "refresh_token": "zezvEUNxlSFzoeIllPNfED2zrg97yvm4BImvlQmnHls",
  "refresh_expires_at": "2026-11-30T02:13:44.864741532Z",
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
  "command_id": "8b3788e3-be71-4525-b0b6-a8c320ab6cd8",
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
  "correlation_id": "f9613503-da9b-4b85-8e13-f52dd90a103f",
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
  "command_id": "4a0aa9f9-da85-4314-b0d4-3598d4b72072",
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
  "paused_at": "2026-10-31T02:13:45.636031676Z",
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
  "command_id": "ab1585e0-ea3b-4dc3-b574-c0f7b7d074f6",
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
  "id": "75d2c019-0e69-4e9b-b9b8-4155be49f783",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T02:18:46.036305Z",
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
  "command_id": "2c158511-6cfb-4f88-9977-8f7126312ce0",
  "quote_id": "75d2c019-0e69-4e9b-b9b8-4155be49f783",
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
  "correlation_id": "5009255c-42ca-4f9c-977e-546154558fb4"
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
  "paused_at": "2026-10-31T02:13:45.636032Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "93eb1324-c28a-4b72-b5e0-e8cc917c3c98",
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
  "command_id": "29171551-b284-4192-843a-04f46a3ad9fe",
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
  "command_id": "f018b9db-95a0-4072-a94b-23f01ce99f26",
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
  "id": "167d3cb7-6c95-434f-97ea-5064b0334c5c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T02:18:47.213119Z",
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
  "command_id": "a862a884-2983-488e-ad14-0982bfe4f6bd",
  "quote_id": "167d3cb7-6c95-434f-97ea-5064b0334c5c",
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
  "correlation_id": "1623935a-c054-46a5-b7ad-126306603b3a"
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
  "command_id": "e21f2c69-c5c5-48b7-95c3-269337d14240",
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
      "from": "05:00",
      "to": "06:00"
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
      "from": "05:00",
      "to": "06:00"
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
  "command_id": "103ebf05-8528-4126-860c-2572c8ca6c20",
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
  "id": "456af7ef-0b3a-4e24-89b3-00027bd92301",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T02:18:48.036387Z",
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
  "command_id": "575a7f96-b989-4308-a489-0302ab2b5855",
  "quote_id": "456af7ef-0b3a-4e24-89b3-00027bd92301",
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
  "correlation_id": "edaf9694-fe61-44e5-97cf-a2f07fa4e434"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "b0d3f6f6-e929-48b5-a423-53817295d664",
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
  "correlation_id": "b8758ab2-89f8-4680-8fbe-ef37d3360a94",
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
      "from": "05:00",
      "to": "06:00"
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
  "command_id": "ee1c361c-bb80-49ab-88de-46dbaae5974c",
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
  "phone": "+380677430576",
  "device_ref": "sandbox-2103"
}
```

```json
{
  "challenge_id": "e03f6852-f3cf-4830-9d4b-9d3399215199",
  "expires_at": "2026-10-31T02:18:49.066152591Z",
  "resend_available_at": "2026-10-31T02:13:50.066152591Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380677430576` → **200**

```json
{
  "phone": "+380677430576",
  "audience": "CLIENT",
  "code": "390626",
  "sent_at": "2026-10-31T02:13:49.068079725Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e03f6852-f3cf-4830-9d4b-9d3399215199",
  "code": "390626",
  "device_ref": "sandbox-2103"
}
```

```json
{
  "session_id": "82d4f339-f410-48d6-b009-8e929de66f09",
  "subject": {
    "type": "CLIENT",
    "id": "d4fdc8e5-6596-47e8-bcbf-116f8aca1992"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNGZkYzhlNS02NTk2LTQ3ZTgtYmNiZi0xMTZmOGFjYTE5OTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDEzNzI5LCJpYXQiOjE3OTM0MTI4MjksImp0aSI6IjE5YWI0MjJjLTdjN2MtNDNlNS1iMjVhLWZiOTIwODAzYjI4MyIsInNpZCI6IjgyZDRmMzM5LWY0MTAtNDhkNi1iMDA5LThlOTI5ZGU2NmYwOSJ9.T4CxDy8sdW_izF20_0xQntMdCG9hnbBkwrjAqfeFDGI",
  "access_expires_at": "2026-10-31T02:28:49.320985162Z",
  "refresh_token": "WTiX_r6CQmBrJLyLKkIBDUDAr_xDLS1JV2-kZqWjqhQ",
  "refresh_expires_at": "2026-11-30T02:13:49.320606589Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "d4fdc8e5-6596-47e8-bcbf-116f8aca1992",
  "session_id": "82d4f339-f410-48d6-b009-8e929de66f09",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "00858cb6-dc4a-4587-94b8-a1948f555b38",
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
  "id": "b292852e-be19-45bd-8d9e-0131eb41facd",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T02:18:49.699425Z",
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
  "challenge_id": "7ae0d15c-da43-4905-870a-d9b30a0c898c",
  "expires_at": "2026-10-31T02:18:51.899663987Z",
  "resend_available_at": "2026-10-31T02:13:52.899663987Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380677430576` → **200**

```json
{
  "phone": "+380677430576",
  "audience": "CLIENT",
  "code": "390073",
  "sent_at": "2026-10-31T02:13:51.90116139Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "48236c4c-4000-4fcf-98b5-ccd09b9b8739",
  "challenge_id": "7ae0d15c-da43-4905-870a-d9b30a0c898c",
  "otp_code": "390073"
}
```

```json
{
  "client_id": "d4fdc8e5-6596-47e8-bcbf-116f8aca1992",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-31T02:13:52.122616354Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "aeba466e-2814-4154-8b40-74599f623bcd",
  "quote_id": "b292852e-be19-45bd-8d9e-0131eb41facd",
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
  "correlation_id": "204f335f-87af-4913-88c1-b219bed80a0d"
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
  "session_id": "440e658b-a237-49b4-b700-abfc8e4624a1",
  "subject": {
    "type": "STAFF",
    "id": "13536a6b-90d5-4717-bcad-60e066f5abae"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzUzNmE2Yi05MGQ1LTQ3MTctYmNhZC02MGUwNjZmNWFiYWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MTM3MzIsImlhdCI6MTc5MzQxMjgzMiwianRpIjoiNmJjMmM0NTEtN2FjZi00MzEyLWFjMjYtY2Q1YmM5MzY5N2YwIiwic2lkIjoiNDQwZTY1OGItYTIzNy00OWI0LWI3MDAtYWJmYzhlNDYyNGExIn0.V-M6i-CwQTyfqPIYLZPlmRONz2w5xatEcaZJdnr_EDg",
  "access_expires_at": "2026-10-31T02:28:52.734753373Z",
  "refresh_token": "7f7JD6tXVZ8-1-1TvPM1g_97dV-z4Qeb8W9s3zlOeKc",
  "refresh_expires_at": "2026-10-31T14:13:52.734365029Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "d4fdc8e5-6596-47e8-bcbf-116f8aca1992",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-31T02:13:52.122616Z",
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

`POST /api/admin/v1/client-deletions/d4fdc8e5-6596-47e8-bcbf-116f8aca1992/complete` → **200**

```json
{
  "command_id": "cf7ad005-0a73-40ca-ba23-e7f8556fe789",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "d4fdc8e5-6596-47e8-bcbf-116f8aca1992",
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
  "correlation_id": "4460ae9a-be61-4a98-a119-ce87b3449177"
}
```

Done: client d4fdc8e5-6596-47e8-bcbf-116f8aca1992 anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380669131428",
  "device_ref": "sandbox-27898"
}
```

```json
{
  "challenge_id": "54692391-006f-4d71-a46d-3906dc30e29a",
  "expires_at": "2026-10-31T02:18:53.530807214Z",
  "resend_available_at": "2026-10-31T02:13:54.530807214Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380669131428` → **200**

```json
{
  "phone": "+380669131428",
  "audience": "CLIENT",
  "code": "224060",
  "sent_at": "2026-10-31T02:13:53.532744958Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "54692391-006f-4d71-a46d-3906dc30e29a",
  "code": "224060",
  "device_ref": "sandbox-27898"
}
```

```json
{
  "session_id": "2c0f8c79-8ad7-4a00-a9bf-44041e7cb6e8",
  "subject": {
    "type": "CLIENT",
    "id": "a8aec1e1-cfe0-4707-8d32-f8148f43f109"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhOGFlYzFlMS1jZmUwLTQ3MDctOGQzMi1mODE0OGY0M2YxMDkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDEzNzMzLCJpYXQiOjE3OTM0MTI4MzMsImp0aSI6IjJhNDFhN2ZhLTFjNTktNDQ1ZS05MWI1LTY5YjRkYTQ0YTVkZCIsInNpZCI6IjJjMGY4Yzc5LThhZDctNGEwMC1hOWJmLTQ0MDQxZTdjYjZlOCJ9.DRCSfhOstsHxdC5X_5LYvvR1Vuej5Gtd-pFPDENfb-E",
  "access_expires_at": "2026-10-31T02:28:53.744028894Z",
  "refresh_token": "hz5L1JnK3mlI_TK7kzbwjLLE7HQc-sx0RRhy1IWjCkk",
  "refresh_expires_at": "2026-11-30T02:13:53.743684151Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "a8aec1e1-cfe0-4707-8d32-f8148f43f109",
  "session_id": "2c0f8c79-8ad7-4a00-a9bf-44041e7cb6e8",
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
  "session_id": "9822d3dd-1938-42f5-a971-8548a2090343",
  "subject": {
    "type": "STAFF",
    "id": "13536a6b-90d5-4717-bcad-60e066f5abae"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzUzNmE2Yi05MGQ1LTQ3MTctYmNhZC02MGUwNjZmNWFiYWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MTM3MzQsImlhdCI6MTc5MzQxMjgzNCwianRpIjoiZWRhYjJhY2EtNWUzNi00MWJiLWJiNWEtNzhlYzgxM2E0NmQ2Iiwic2lkIjoiOTgyMmQzZGQtMTkzOC00MmY1LWE5NzEtODU0OGEyMDkwMzQzIn0.uNIiqDapz2JBP6K7zNyGAWj3XxLBuJ8aoZNblt2-FYE",
  "access_expires_at": "2026-10-31T02:28:54.315593978Z",
  "refresh_token": "0uXsiH-lhD8YVtPOLCbMM5uSYt4KvJol3JWoLdCEg0s",
  "refresh_expires_at": "2026-10-31T14:13:54.315198188Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=9131428&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "a8aec1e1-cfe0-4707-8d32-f8148f43f109",
      "phone": "+380669131428",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-31T02:13:53.742288Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/a8aec1e1-cfe0-4707-8d32-f8148f43f109` → **200**

```json
{
  "client": {
    "id": "a8aec1e1-cfe0-4707-8d32-f8148f43f109",
    "phone": "+380669131428",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-31T02:13:53.742288Z",
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

`POST /api/admin/v1/clients/a8aec1e1-cfe0-4707-8d32-f8148f43f109/block` → **400**

```json
{
  "command_id": "adc3a1fa-bbdc-4bad-8945-5c38cf7b5a58",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/a8aec1e1-cfe0-4707-8d32-f8148f43f109/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "8ec7fe98-0ee9-4320-ad3b-26b18060a049",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/a8aec1e1-cfe0-4707-8d32-f8148f43f109/block` → **200**

```json
{
  "command_id": "de3c64a8-d7f9-4591-86dd-5e80ce939267",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "a8aec1e1-cfe0-4707-8d32-f8148f43f109",
  "phone": "+380669131428",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-31T02:13:53.742288Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-31T02:13:55.1264Z",
    "by": "13536a6b-90d5-4717-bcad-60e066f5abae"
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
  "correlation_id": "9ed3aaae-ca1f-496f-95e4-db5b2408f277"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380669131428",
  "device_ref": "sandbox-5528"
}
```

```json
{
  "challenge_id": "39db2b25-24b3-461e-8afb-9a62f18839cb",
  "expires_at": "2026-10-31T02:18:57.502113768Z",
  "resend_available_at": "2026-10-31T02:13:58.502113768Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380669131428` → **200**

```json
{
  "phone": "+380669131428",
  "audience": "CLIENT",
  "code": "047544",
  "sent_at": "2026-10-31T02:13:57.504706788Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "39db2b25-24b3-461e-8afb-9a62f18839cb",
  "code": "047544",
  "device_ref": "sandbox-5528"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "6f1567f7-0a31-48e8-9d87-95098ec8bc01"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/a8aec1e1-cfe0-4707-8d32-f8148f43f109` → **200**

```json
{
  "client": {
    "id": "a8aec1e1-cfe0-4707-8d32-f8148f43f109",
    "phone": "+380669131428",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-31T02:13:53.742288Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-31T02:13:55.1264Z",
      "by": "13536a6b-90d5-4717-bcad-60e066f5abae"
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

`POST /api/admin/v1/clients/a8aec1e1-cfe0-4707-8d32-f8148f43f109/unblock` → **200**

```json
{
  "command_id": "49b14355-8de9-4bf9-b879-804f4218101f",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "a8aec1e1-cfe0-4707-8d32-f8148f43f109",
  "phone": "+380669131428",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-31T02:13:53.742288Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380669131428",
  "device_ref": "sandbox-29424"
}
```

```json
{
  "challenge_id": "59851fa3-c9dc-4645-aa72-1c505c95fd73",
  "expires_at": "2026-10-31T02:19:00.310000077Z",
  "resend_available_at": "2026-10-31T02:14:01.310000077Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380669131428` → **200**

```json
{
  "phone": "+380669131428",
  "audience": "CLIENT",
  "code": "589941",
  "sent_at": "2026-10-31T02:14:00.312042681Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "59851fa3-c9dc-4645-aa72-1c505c95fd73",
  "code": "589941",
  "device_ref": "sandbox-29424"
}
```

```json
{
  "session_id": "55859088-006c-4af8-a62c-a3dc4fe006bc",
  "subject": {
    "type": "CLIENT",
    "id": "a8aec1e1-cfe0-4707-8d32-f8148f43f109"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhOGFlYzFlMS1jZmUwLTQ3MDctOGQzMi1mODE0OGY0M2YxMDkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDEzNzQwLCJpYXQiOjE3OTM0MTI4NDAsImp0aSI6ImQzOGJhZWNkLTBmNzktNDgxZC1iNmU3LTQzYTA2MGVhNDUzZiIsInNpZCI6IjU1ODU5MDg4LTAwNmMtNGFmOC1hNjJjLWEzZGM0ZmUwMDZiYyJ9.Ls3FQk_wWl28RIlBzBTvS3sY4F8Hj7esizxbqrw5LDU",
  "access_expires_at": "2026-10-31T02:29:00.516409407Z",
  "refresh_token": "Tv7yoz2tQoK-JUweqn7LqqpFG7v0zmTloI4sxsTSDoo",
  "refresh_expires_at": "2026-11-30T02:14:00.516068578Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "a8aec1e1-cfe0-4707-8d32-f8148f43f109",
  "session_id": "55859088-006c-4af8-a62c-a3dc4fe006bc",
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
  "phone": "+380666226654",
  "device_ref": "sandbox-23434"
}
```

```json
{
  "challenge_id": "9c0bfbbf-0ef4-4e16-8c31-d529e74a61d3",
  "expires_at": "2026-10-31T02:19:00.897978348Z",
  "resend_available_at": "2026-10-31T02:14:01.897978348Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380666226654` → **200**

```json
{
  "phone": "+380666226654",
  "audience": "CLIENT",
  "code": "932099",
  "sent_at": "2026-10-31T02:14:00.899885028Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9c0bfbbf-0ef4-4e16-8c31-d529e74a61d3",
  "code": "932099",
  "device_ref": "sandbox-23434"
}
```

```json
{
  "session_id": "312187e8-8217-4563-8fdc-3114b66d80e8",
  "subject": {
    "type": "CLIENT",
    "id": "336cb5a0-b182-4a81-9d83-9b4dde4cf640"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMzZjYjVhMC1iMTgyLTRhODEtOWQ4My05YjRkZGU0Y2Y2NDAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDEzNzQxLCJpYXQiOjE3OTM0MTI4NDEsImp0aSI6IjMyYWQ2YzAxLTUyMGItNDhhMS1hZWJlLTE3M2QwOTZkNTYyNCIsInNpZCI6IjMxMjE4N2U4LTgyMTctNDU2My04ZmRjLTMxMTRiNjZkODBlOCJ9.iXc0znWGHeqWl_2a1GwefEgBn9qTz8yIquPEX0iHgFo",
  "access_expires_at": "2026-10-31T02:29:01.114131534Z",
  "refresh_token": "fzJae3b5q_Om-Esr5gDP16K1brNTF2Yy9Qu35D8FXm8",
  "refresh_expires_at": "2026-11-30T02:14:01.113757566Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "2b5a0e33-af6c-4813-a057-ab2e1a6c9f3a",
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
  "id": "3500a49c-a53d-4727-aa86-b6bd61493b63",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T02:19:01.308249Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: d7a0a3b2-54fe-4a2e-a7b7-c6464c6911ef) → **201**

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
  "session_id": "fbabe2c4-e29b-45b8-942b-a4af294d1d19",
  "subject": {
    "type": "STAFF",
    "id": "13536a6b-90d5-4717-bcad-60e066f5abae"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzUzNmE2Yi05MGQ1LTQ3MTctYmNhZC02MGUwNjZmNWFiYWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MTM3NDEsImlhdCI6MTc5MzQxMjg0MSwianRpIjoiZTdhOThlNzktNzU3OC00ZTg0LTg5NDItM2U5M2UxZmNlMDgwIiwic2lkIjoiZmJhYmUyYzQtZTI5Yi00NWI4LTk0MmItYTRhZjI5NGQxZDE5In0.0ttjEUYMIHhhbJaMfk-1XkNslNxxVsyrSje8wZN2msQ",
  "access_expires_at": "2026-10-31T02:29:01.75958047Z",
  "refresh_token": "mA2TEZCdf4mIsKpEYvrOUoC5adbEOndsU8_jBt6HDd4",
  "refresh_expires_at": "2026-10-31T14:14:01.759180084Z",
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
  "session_id": "da2f4f51-0178-4ec3-9357-1ba54ce08e04",
  "subject": {
    "type": "STAFF",
    "id": "13536a6b-90d5-4717-bcad-60e066f5abae"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzUzNmE2Yi05MGQ1LTQ3MTctYmNhZC02MGUwNjZmNWFiYWUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MTM3NDIsImlhdCI6MTc5MzQxMjg0MiwianRpIjoiZTA3Njc2OGUtZTdlOS00MjRmLTllMzYtY2UwN2UwZjA5YzRjIiwic2lkIjoiZGEyZjRmNTEtMDE3OC00ZWMzLTkzNTctMWJhNTRjZTA4ZTA0In0.uTxKRCF1rw7Jb8xDFar7e99Tp_8niwsKpoMl4AsMazI",
  "access_expires_at": "2026-10-31T02:29:02.151287746Z",
  "refresh_token": "f7TSfz3byCZbHGrecmX4vIjdc7nTs5x1VD7jnljRutY",
  "refresh_expires_at": "2026-10-31T14:14:02.150891682Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/51293f16-2db8-4ac1-8a94-c47def0fa523/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-31T02:14:01.506243Z",
      "actor": {
        "type": "CLIENT",
        "id": "336cb5a0-b182-4a81-9d83-9b4dde4cf640",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "51293f16-2db8-4ac1-8a94-c47def0fa523",
        "quote_id": "3500a49c-a53d-4727-aa86-b6bd61493b63",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "d7a0a3b2-54fe-4a2e-a7b7-c6464c6911ef"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-31T02:14:01.507603Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "51293f16-2db8-4ac1-8a94-c47def0fa523",
        "attempt_id": "750736f5-7f66-4f19-a227-832bf3038be1",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "d7a0a3b2-54fe-4a2e-a7b7-c6464c6911ef"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-31T02:14:01.536555Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "51293f16-2db8-4ac1-8a94-c47def0fa523",
        "attempt_id": "750736f5-7f66-4f19-a227-832bf3038be1"
      },
      "correlation_id": "d7a0a3b2-54fe-4a2e-a7b7-c6464c6911ef"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "750736f5-7f66-4f19-a227-832bf3038be1",
        "generation": 1,
        "started_at": "2026-10-31T02:14:01.506814Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-31T02:14:01.536555Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-31T02:14:01.508069Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/d7a0a3b2-54fe-4a2e-a7b7-c6464c6911ef` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "51293f16-2db8-4ac1-8a94-c47def0fa523:0",
      "order_id": "51293f16-2db8-4ac1-8a94-c47def0fa523",
      "at": "2026-10-31T02:14:01.506243Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "51293f16-2db8-4ac1-8a94-c47def0fa523:1",
      "order_id": "51293f16-2db8-4ac1-8a94-c47def0fa523",
      "at": "2026-10-31T02:14:01.507603Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "51293f16-2db8-4ac1-8a94-c47def0fa523:2",
      "order_id": "51293f16-2db8-4ac1-8a94-c47def0fa523",
      "at": "2026-10-31T02:14:01.536555Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/2ea6dbdf-0427-4304-acd7-4f3c1e0eed91` → **200**

```json
{
  "found": []
}
```

Done: request d7a0a3b2-54fe-4a2e-a7b7-c6464c6911ef — order 51293f16-2db8-4ac1-8a94-c47def0fa523 found by its id.

`GET /api/rider/v1/orders/51293f16-2db8-4ac1-8a94-c47def0fa523` → **200**

```json
{
  "id": "51293f16-2db8-4ac1-8a94-c47def0fa523",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "336cb5a0-b182-4a81-9d83-9b4dde4cf640",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-31T02:14:01.505893Z",
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

`POST /api/rider/v1/orders/51293f16-2db8-4ac1-8a94-c47def0fa523/cancel` → **200**

```json
{
  "command_id": "83cdf060-9852-4bb2-96d0-3afdff90d4c6",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "51293f16-2db8-4ac1-8a94-c47def0fa523",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "336cb5a0-b182-4a81-9d83-9b4dde4cf640",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T02:14:01.505893Z",
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
  "phone": "+380636658527",
  "device_ref": "sandbox-30145"
}
```

```json
{
  "challenge_id": "9f2baeb4-c16f-4787-a63e-12d30ac07d48",
  "expires_at": "2026-10-31T02:19:03.39519499Z",
  "resend_available_at": "2026-10-31T02:14:04.39519499Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636658527` → **200**

```json
{
  "phone": "+380636658527",
  "audience": "CLIENT",
  "code": "804650",
  "sent_at": "2026-10-31T02:14:03.398105554Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9f2baeb4-c16f-4787-a63e-12d30ac07d48",
  "code": "804650",
  "device_ref": "sandbox-30145"
}
```

```json
{
  "session_id": "ae5dc3da-8c73-4dbc-8ee7-d1b61b987a0f",
  "subject": {
    "type": "CLIENT",
    "id": "de2f811f-b1db-46d9-a836-dcb19b9d7f23"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkZTJmODExZi1iMWRiLTQ2ZDktYTgzNi1kY2IxOWI5ZDdmMjMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDEzNzQzLCJpYXQiOjE3OTM0MTI4NDMsImp0aSI6Ijk0YjlkNGE2LTE0YTctNGFmOC1iNWNlLTQ1ZTAyMGUyYzhiOSIsInNpZCI6ImFlNWRjM2RhLThjNzMtNGRiYy04ZWU3LWQxYjYxYjk4N2EwZiJ9.fJtG091S5M_uJQbuaoj2kcRuJ-XvxBwoZoVSa-_iBgA",
  "access_expires_at": "2026-10-31T02:29:03.620552656Z",
  "refresh_token": "IP_AzDr9vNCpqxsGhO__IQZOYNWcaZCjMpuvtk0Fy74",
  "refresh_expires_at": "2026-11-30T02:14:03.620213601Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "bb019d4d-67ef-472e-9e25-8bf91f3c57d6",
  "expires_at": "2026-10-31T02:19:05.809458302Z",
  "resend_available_at": "2026-10-31T02:14:06.809458302Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636658527` → **200**

```json
{
  "phone": "+380636658527",
  "audience": "CLIENT",
  "code": "892764",
  "sent_at": "2026-10-31T02:14:05.810985497Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "c0cba3de-9d68-4b6d-b7eb-4e9f9549ccda",
  "challenge_id": "bb019d4d-67ef-472e-9e25-8bf91f3c57d6",
  "otp_code": "892764"
}
```

```json
{
  "id": "3bf4d260-9a31-4139-ba7d-cf72c4d793cb",
  "state": "PENDING",
  "created_at": "2026-10-31T02:14:06.015973Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/3bf4d260-9a31-4139-ba7d-cf72c4d793cb` → **200**

```json
{
  "id": "3bf4d260-9a31-4139-ba7d-cf72c4d793cb",
  "state": "PENDING",
  "created_at": "2026-10-31T02:14:06.015973Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/3bf4d260-9a31-4139-ba7d-cf72c4d793cb` → **200**

```json
{
  "id": "3bf4d260-9a31-4139-ba7d-cf72c4d793cb",
  "state": "PENDING",
  "created_at": "2026-10-31T02:14:06.015973Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/3bf4d260-9a31-4139-ba7d-cf72c4d793cb` → **200**

```json
{
  "id": "3bf4d260-9a31-4139-ba7d-cf72c4d793cb",
  "state": "PENDING",
  "created_at": "2026-10-31T02:14:06.015973Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/3bf4d260-9a31-4139-ba7d-cf72c4d793cb` → **200**

```json
{
  "id": "3bf4d260-9a31-4139-ba7d-cf72c4d793cb",
  "state": "PENDING",
  "created_at": "2026-10-31T02:14:06.015973Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/3bf4d260-9a31-4139-ba7d-cf72c4d793cb` → **200**

```json
{
  "id": "3bf4d260-9a31-4139-ba7d-cf72c4d793cb",
  "state": "READY",
  "created_at": "2026-10-31T02:14:06.015973Z",
  "ready_at": "2026-10-31T02:14:10.230464Z",
  "expires_at": "2026-11-07T02:14:10.230464Z",
  "size_bytes": 1032
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/3bf4d260-9a31-4139-ba7d-cf72c4d793cb/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631732784",
  "device_ref": "sandbox-21461"
}
```

```json
{
  "challenge_id": "af26d259-8ef1-4880-9dd5-907b12527439",
  "expires_at": "2026-10-31T02:19:11.148107283Z",
  "resend_available_at": "2026-10-31T02:14:12.148107283Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631732784` → **200**

```json
{
  "phone": "+380631732784",
  "audience": "CLIENT",
  "code": "126109",
  "sent_at": "2026-10-31T02:14:11.1499652Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "af26d259-8ef1-4880-9dd5-907b12527439",
  "code": "126109",
  "device_ref": "sandbox-21461"
}
```

```json
{
  "session_id": "72ba7e01-e800-497d-ba42-93feba63f996",
  "subject": {
    "type": "CLIENT",
    "id": "7abc96d5-46ba-4446-82fd-43699ef2fe36"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YWJjOTZkNS00NmJhLTQ0NDYtODJmZC00MzY5OWVmMmZlMzYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDEzNzUxLCJpYXQiOjE3OTM0MTI4NTEsImp0aSI6IjUxZjkxODgxLWI4YTQtNGNmYS04OWNjLWNlNTFmNjNiMWQzZiIsInNpZCI6IjcyYmE3ZTAxLWU4MDAtNDk3ZC1iYTQyLTkzZmViYTYzZjk5NiJ9.tbQbQJpVpVAgX7jm73uj31a2QmgvgAYrgo2rfekUl4w",
  "access_expires_at": "2026-10-31T02:29:11.35521134Z",
  "refresh_token": "ilz4m4zj5azaKA9FNah4HXe9QYvaDcboG_F-Bof0WUo",
  "refresh_expires_at": "2026-11-30T02:14:11.354856151Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/3bf4d260-9a31-4139-ba7d-cf72c4d793cb/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/3bf4d260-9a31-4139-ba7d-cf72c4d793cb/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "5251aa95-a878-4142-b42d-08d605fb8813"
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
  "session_id": "536ea7bd-2a42-4e90-92b0-e0cd57bc1975",
  "subject": {
    "type": "STAFF",
    "id": "13536a6b-90d5-4717-bcad-60e066f5abae"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzUzNmE2Yi05MGQ1LTQ3MTctYmNhZC02MGUwNjZmNWFiYWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MTM3NTEsImlhdCI6MTc5MzQxMjg1MSwianRpIjoiY2JhMjkxYjAtMmJmZC00ZDQ5LTg4OTEtYjdiZTc2YTUzZDIzIiwic2lkIjoiNTM2ZWE3YmQtMmE0Mi00ZTkwLTkyYjAtZTBjZDU3YmMxOTc1In0.9Z_Za_gYDH52GdzySAxkLoofAmJNHI3lVKZPuki5kWw",
  "access_expires_at": "2026-10-31T02:29:11.956235395Z",
  "refresh_token": "lyGAVKA3K2RrAek_Er_CfqdFqrF3TUUi9PU3xyBbBBI",
  "refresh_expires_at": "2026-10-31T14:14:11.955820687Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "de2f811f-b1db-46d9-a836-dcb19b9d7f23",
  "session_id": "ae5dc3da-8c73-4dbc-8ee7-d1b61b987a0f",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/de2f811f-b1db-46d9-a836-dcb19b9d7f23/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "3bf4d260-9a31-4139-ba7d-cf72c4d793cb",
      "state": "READY",
      "created_at": "2026-10-31T02:14:06.015973Z",
      "ready_at": "2026-10-31T02:14:10.230464Z",
      "expires_at": "2026-11-07T02:14:10.230464Z",
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
  "device_ref": "sandbox-24576"
}
```

```json
{
  "challenge_id": "f444fcdf-75b2-49ed-8cbe-c3fd39799ce9",
  "expires_at": "2026-10-31T02:19:12.527893341Z",
  "resend_available_at": "2026-10-31T02:14:13.527893341Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "062732",
  "sent_at": "2026-10-31T02:14:12.529830777Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f444fcdf-75b2-49ed-8cbe-c3fd39799ce9",
  "code": "062732",
  "device_ref": "sandbox-24576"
}
```

```json
{
  "session_id": "148de83f-095b-4273-b44a-4c853e836fb6",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQxMzc1MiwiaWF0IjoxNzkzNDEyODUyLCJqdGkiOiJhM2IyNDlkNi1lNTY4LTRmODAtOTczOC1lZTRjODFkNjNjNjEiLCJzaWQiOiIxNDhkZTgzZi0wOTViLTQyNzMtYjQ0YS00Yzg1M2U4MzZmYjYifQ.cNQvBRrVrTFSbTa_dkT_6lvDFR_q7Yxsf2LHObGnGZQ",
  "access_expires_at": "2026-10-31T02:29:12.738309325Z",
  "refresh_token": "MVOvvbpMlS1XdRlKcUSmk3_Ns29t5Fp191FXXC1KtqY",
  "refresh_expires_at": "2026-11-30T02:14:12.737936345Z",
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
  "device_ref": "sandbox-2401"
}
```

```json
{
  "challenge_id": "0a3f6d5c-9213-43fe-9b31-76614ba0218f",
  "expires_at": "2026-10-31T02:19:13.114733592Z",
  "resend_available_at": "2026-10-31T02:14:14.114733592Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "154376",
  "sent_at": "2026-10-31T02:14:13.117710496Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0a3f6d5c-9213-43fe-9b31-76614ba0218f",
  "code": "154376",
  "device_ref": "sandbox-2401"
}
```

```json
{
  "session_id": "24fab321-af0d-4b94-aac5-73d5c74cfacf",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQxMzc1MywiaWF0IjoxNzkzNDEyODUzLCJqdGkiOiI4ZDk5Y2UzYS02NTY4LTRiZTAtOGU0Mi02MmM4MWMyOThiMGUiLCJzaWQiOiIyNGZhYjMyMS1hZjBkLTRiOTQtYWFjNS03M2Q1Yzc0Y2ZhY2YifQ.BY9JtU-7X2ShlO06BmK654Rrc6tRRzQunvV-isxTkOc",
  "access_expires_at": "2026-10-31T02:29:13.327107513Z",
  "refresh_token": "lhTZE-pEDoQqwjZrwMO3iN9dLguE2LlR1tNHwXz73_Q",
  "refresh_expires_at": "2026-11-30T02:14:13.3267062Z",
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
  "command_id": "2fd74c47-824b-4977-bb96-45d903b4abd3",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T02:14:13Z",
    "sequence": 1793412853719
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "19609b4c-9c19-4a6b-906d-1ba21bf07277",
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
  "last_heartbeat_at": "2026-10-31T02:14:13.734899Z",
  "last_location_at": "2026-10-31T02:14:13.734899Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-10584"
}
```

```json
{
  "challenge_id": "bcec5a5e-fe77-45c7-9a36-b948c56a99ea",
  "expires_at": "2026-10-31T02:19:13.925170553Z",
  "resend_available_at": "2026-10-31T02:14:14.925170553Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "656002",
  "sent_at": "2026-10-31T02:14:13.927168559Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bcec5a5e-fe77-45c7-9a36-b948c56a99ea",
  "code": "656002",
  "device_ref": "sandbox-10584"
}
```

```json
{
  "session_id": "75d817d6-c5a2-45b8-9d78-23604cc5be1a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQxMzc1NCwiaWF0IjoxNzkzNDEyODU0LCJqdGkiOiIwMjlhODU1Yi0yNzg3LTQ1MDMtOGQwMy0wZGIzMmQxNDk1MzkiLCJzaWQiOiI3NWQ4MTdkNi1jNWEyLTQ1YjgtOWQ3OC0yMzYwNGNjNWJlMWEifQ.pOB2i1Ns7ub5eSz9kMhKyxs83j2ZRRkBQ4t6qkEO0m4",
  "access_expires_at": "2026-10-31T02:29:14.139850323Z",
  "refresh_token": "vwmF8gPrTY7OtKXxG6pso9EvyERZNR-M7saI1FuXufc",
  "refresh_expires_at": "2026-11-30T02:14:14.139423827Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "0f258eb7-7dc8-4262-b6c7-cac76aa74e8c",
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
  "last_heartbeat_at": "2026-10-31T02:10:32.446508Z",
  "last_location_at": "2026-10-31T02:10:32.446508Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/0f258eb7-7dc8-4262-b6c7-cac76aa74e8c/handover` → **200**

```json
{
  "command_id": "2c958ed6-1259-49a0-82e1-0a0a56192531",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "0f258eb7-7dc8-4262-b6c7-cac76aa74e8c",
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
  "last_heartbeat_at": "2026-10-31T02:10:32.446508Z",
  "last_location_at": "2026-10-31T02:10:32.446508Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/0f258eb7-7dc8-4262-b6c7-cac76aa74e8c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T02:14:14Z",
    "sequence": 1793412854731
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "0f258eb7-7dc8-4262-b6c7-cac76aa74e8c",
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
  "last_heartbeat_at": "2026-10-31T02:14:14.746782Z",
  "last_location_at": "2026-10-31T02:14:14.746782Z",
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
  "session_id": "9fabffa7-4f74-459d-9407-158568344d7f",
  "subject": {
    "type": "STAFF",
    "id": "13536a6b-90d5-4717-bcad-60e066f5abae"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzUzNmE2Yi05MGQ1LTQ3MTctYmNhZC02MGUwNjZmNWFiYWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MTM3NTUsImlhdCI6MTc5MzQxMjg1NSwianRpIjoiYjg5ZjM4NWItYzI5OC00YmIxLWJiMjgtMzVjOGQ2NjhlYWU4Iiwic2lkIjoiOWZhYmZmYTctNGY3NC00NTlkLTk0MDctMTU4NTY4MzQ0ZDdmIn0.6A-2w82J-ng067g7RNCCwM2M9whFx33tQMg3l8I7JjM",
  "access_expires_at": "2026-10-31T02:29:15.136105796Z",
  "refresh_token": "cmWGyfvwggPwDBXs8IhlvanS4Il4PjNAgspzHoJB6i8",
  "refresh_expires_at": "2026-10-31T14:14:15.135710256Z",
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
  "session_id": "fc0c843a-1029-42c8-8231-c07e18c3e15f",
  "subject": {
    "type": "STAFF",
    "id": "13536a6b-90d5-4717-bcad-60e066f5abae"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzUzNmE2Yi05MGQ1LTQ3MTctYmNhZC02MGUwNjZmNWFiYWUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MTM3NTUsImlhdCI6MTc5MzQxMjg1NSwianRpIjoiNTkxY2RiNmMtMTcxMS00MjYzLThjMGItMjE3NDE5NzFiMTA4Iiwic2lkIjoiZmMwYzg0M2EtMTAyOS00MmM4LTgyMzEtYzA3ZTE4YzNlMTVmIn0.if0LHMqGy4jbNWdRHhjukXVy6ZVnzeinQG4RcIMfRsw",
  "access_expires_at": "2026-10-31T02:29:15.525045613Z",
  "refresh_token": "2EUEo6wHgfIzCorsOFOKtA6KEVIrJSfjGoDC5HIhieQ",
  "refresh_expires_at": "2026-10-31T14:14:15.524684975Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380680551872",
  "device_ref": "sandbox-22745"
}
```

```json
{
  "challenge_id": "093995b3-b12b-467d-ba80-d75916e84218",
  "expires_at": "2026-10-31T02:19:15.712854681Z",
  "resend_available_at": "2026-10-31T02:14:16.712854681Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380680551872` → **200**

```json
{
  "phone": "+380680551872",
  "audience": "CLIENT",
  "code": "962715",
  "sent_at": "2026-10-31T02:14:15.715439637Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "093995b3-b12b-467d-ba80-d75916e84218",
  "code": "962715",
  "device_ref": "sandbox-22745"
}
```

```json
{
  "session_id": "86491020-685e-44f4-a3ef-bc27ee32c9fc",
  "subject": {
    "type": "CLIENT",
    "id": "0f555a3e-a4f3-476a-ba4c-4a83b221471c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwZjU1NWEzZS1hNGYzLTQ3NmEtYmE0Yy00YTgzYjIyMTQ3MWMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDEzNzU1LCJpYXQiOjE3OTM0MTI4NTUsImp0aSI6Ijg1YTlhZTlmLTcyNTYtNDdjNC04ZDBlLTViZDQ2NjFkNmU5YSIsInNpZCI6Ijg2NDkxMDIwLTY4NWUtNDRmNC1hM2VmLWJjMjdlZTMyYzlmYyJ9.jGlpNIDkw1rMt0Iq907_er1DAFWP3uZ2Ven0hXgWWd0",
  "access_expires_at": "2026-10-31T02:29:15.923667697Z",
  "refresh_token": "G_sjO9W8dXmXcSD50K1IHkTgOTxSkHJYQVyZge2cU_0",
  "refresh_expires_at": "2026-11-30T02:14:15.923312357Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8db7471a-a7ab-4570-97e4-d2074bed0425",
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
  "id": "4baa66b3-9ce1-4314-a5ee-76d7dd848c2b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T02:19:16.114641Z",
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
  "command_id": "c8638a0e-40d9-4d6c-806f-1ea3ca0599fa",
  "quote_id": "4baa66b3-9ce1-4314-a5ee-76d7dd848c2b",
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
  "id": "1cc6f395-4ad7-4fbc-87ac-cdc58caaad18",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0f555a3e-a4f3-476a-ba4c-4a83b221471c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T02:14:16.310855Z",
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
    "id": "ce58ce6b-6b70-43ee-8d96-d3ca740e60fc",
    "order_id": "1cc6f395-4ad7-4fbc-87ac-cdc58caaad18",
    "expires_at": "2026-10-31T02:14:31.312765Z",
    "server_time": "2026-10-31T02:14:16.543208259Z",
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

`POST /api/driver/v1/offers/ce58ce6b-6b70-43ee-8d96-d3ca740e60fc/reject` → **204**

```json
{
  "command_id": "134fd337-1ba1-4fd1-ac4c-da98876306f2"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "72352b43-7358-4987-b109-76d4f43cfe70",
    "order_id": "1cc6f395-4ad7-4fbc-87ac-cdc58caaad18",
    "expires_at": "2026-10-31T02:14:31.741284Z",
    "server_time": "2026-10-31T02:14:16.778605913Z",
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

`POST /api/driver/v1/offers/72352b43-7358-4987-b109-76d4f43cfe70/accept` → **200**

```json
{
  "command_id": "40d0cd7a-bc34-429c-bbd9-304855b4111f"
}
```

```json
{
  "id": "08460091-a131-4e7f-b31c-eaa743fd19d9",
  "order_id": "1cc6f395-4ad7-4fbc-87ac-cdc58caaad18",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "5aa627b2-5e49-4d6d-9fe5-82e1b8d9ef1e",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/1cc6f395-4ad7-4fbc-87ac-cdc58caaad18/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-31T02:14:16.311175Z",
      "actor": {
        "type": "CLIENT",
        "id": "0f555a3e-a4f3-476a-ba4c-4a83b221471c",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "1cc6f395-4ad7-4fbc-87ac-cdc58caaad18",
        "quote_id": "4baa66b3-9ce1-4314-a5ee-76d7dd848c2b",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "010b42c6-8a2a-468e-bacd-683eff2bdc9f"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-31T02:14:16.312314Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "1cc6f395-4ad7-4fbc-87ac-cdc58caaad18",
        "attempt_id": "68691eb2-3841-4a9c-91d6-b8b09c72956c",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "010b42c6-8a2a-468e-bacd-683eff2bdc9f"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-31T02:14:16.329574Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "source": "AUTO",
        "offer_id": "ce58ce6b-6b70-43ee-8d96-d3ca740e60fc",
        "order_id": "1cc6f395-4ad7-4fbc-87ac-cdc58caaad18",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200,
        "expires_at": "2026-10-31T02:14:31.312765355Z"
      },
      "correlation_id": "010b42c6-8a2a-468e-bacd-683eff2bdc9f"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-31T02:14:16.740494Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "ce58ce6b-6b70-43ee-8d96-d3ca740e60fc",
        "order_id": "1cc6f395-4ad7-4fbc-87ac-cdc58caaad18"
      },
      "correlation_id": "a427bfd6-f20a-43bc-92dc-b2e1dd8bd711"
    },
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order 1cc6f395-4ad7-4fbc-87ac-cdc58caaad18 — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/1cc6f395-4ad7-4fbc-87ac-cdc58caaad18` → **200**

```json
{
  "id": "1cc6f395-4ad7-4fbc-87ac-cdc58caaad18",
  "short_number": 13,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "0f555a3e-a4f3-476a-ba4c-4a83b221471c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "08460091-a131-4e7f-b31c-eaa743fd19d9",
    "order_id": "1cc6f395-4ad7-4fbc-87ac-cdc58caaad18",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "5aa627b2-5e49-4d6d-9fe5-82e1b8d9ef1e",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-31T02:14:16.310855Z",
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

`POST /api/operator/v1/orders/1cc6f395-4ad7-4fbc-87ac-cdc58caaad18/cancel` → **200**

```json
{
  "command_id": "48e5a11e-ba79-4c64-a00e-dac2953b8fb5",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "1cc6f395-4ad7-4fbc-87ac-cdc58caaad18",
  "short_number": 13,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "0f555a3e-a4f3-476a-ba4c-4a83b221471c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "08460091-a131-4e7f-b31c-eaa743fd19d9",
    "order_id": "1cc6f395-4ad7-4fbc-87ac-cdc58caaad18",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "5aa627b2-5e49-4d6d-9fe5-82e1b8d9ef1e",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-31T02:14:16.310855Z",
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
  "session_id": "19609b4c-9c19-4a6b-906d-1ba21bf07277",
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
  "last_heartbeat_at": "2026-10-31T02:14:13.734899Z",
  "last_location_at": "2026-10-31T02:14:13.734899Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/19609b4c-9c19-4a6b-906d-1ba21bf07277/close` → **200**

```json
{
  "command_id": "1a61cc62-526c-4edc-be8d-5888b0a4d66a",
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
  "session_id": "0f258eb7-7dc8-4262-b6c7-cac76aa74e8c",
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
  "last_heartbeat_at": "2026-10-31T02:14:14.746782Z",
  "last_location_at": "2026-10-31T02:14:14.746782Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/0f258eb7-7dc8-4262-b6c7-cac76aa74e8c/close` → **200**

```json
{
  "command_id": "65485b0a-12c6-4471-a864-45ee8e3d3d0c",
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
  "device_ref": "sandbox-12235"
}
```

```json
{
  "challenge_id": "351d1f68-d83c-4769-8c56-f8c3e6d1b30b",
  "expires_at": "2026-10-31T02:19:18.557821373Z",
  "resend_available_at": "2026-10-31T02:14:19.557821373Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "521744",
  "sent_at": "2026-10-31T02:14:18.559761357Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "351d1f68-d83c-4769-8c56-f8c3e6d1b30b",
  "code": "521744",
  "device_ref": "sandbox-12235"
}
```

```json
{
  "session_id": "b340d0b9-b2a3-41f4-b185-35d419313c85",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQxMzc1OCwiaWF0IjoxNzkzNDEyODU4LCJqdGkiOiIwYjBjYWQ3Ni02OTdlLTQ3NGEtOTQ2Zi1lNzVhMTkzODYwNzEiLCJzaWQiOiJiMzQwZDBiOS1iMmEzLTQxZjQtYjE4NS0zNWQ0MTkzMTNjODUifQ.D1fNH32NHc96YSIinl8PrC74Qg0_aF898ZH_uIDSwkw",
  "access_expires_at": "2026-10-31T02:29:18.770766626Z",
  "refresh_token": "tHPMlm0w_HygB3jAcqcNHUwqZEJOjpJ62XKSVbJCANQ",
  "refresh_expires_at": "2026-11-30T02:14:18.770392977Z",
  "account_created": false
}
```

`POST /api/driver/v1/documents/upload-sessions` → **201**

```json
{
  "command_id": "d18a73f0-f0fa-4442-83d2-6e42850f454a",
  "content_type": "application/pdf",
  "size_bytes": 87
}
```

```json
{
  "file_id": "40746524-bd3f-4c52-833b-189da876a4b7",
  "upload_path": "/api/driver/v1/uploads/40746524-bd3f-4c52-833b-189da876a4b7",
  "expires_at": "2026-10-31T02:29:18.960340615Z",
  "max_bytes": 87
}
```

`PUT /api/driver/v1/uploads/40746524-bd3f-4c52-833b-189da876a4b7` → **200**

```json
{
  "file_id": "40746524-bd3f-4c52-833b-189da876a4b7",
  "state": "SAFE",
  "content_type": "application/pdf",
  "size_bytes": 87,
  "reject_reason": null
}
```

## On the server's disk the file is not the PDF

Stored at `driver_document/2026-10/40746524-bd3f-4c52-833b-189da876a4b7`, first bytes `425a46314c5ce6e1` (plain: `255044462d312e37` = %PDF-1.7).

## His download is exactly what he uploaded

`GET /api/driver/v1/files/40746524-bd3f-4c52-833b-189da876a4b7` → **200**

SHA-256 uploaded `a9cf6813f695bd50140570f619031dd4faafa45dcc9ba570362c6a737b98cee1`, downloaded `a9cf6813f695bd50140570f619031dd4faafa45dcc9ba570362c6a737b98cee1`.

Done: document 40746524-bd3f-4c52-833b-189da876a4b7 is encrypted on disk and downloads unchanged.

# Scenario: driver-block

## Only Andrii is online; he takes an order and starts the trip

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-5467"
}
```

```json
{
  "challenge_id": "b6831421-159b-4f17-acc3-274c587ac3cd",
  "expires_at": "2026-10-31T02:19:19.230037379Z",
  "resend_available_at": "2026-10-31T02:14:20.230037379Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "498045",
  "sent_at": "2026-10-31T02:14:19.232145449Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b6831421-159b-4f17-acc3-274c587ac3cd",
  "code": "498045",
  "device_ref": "sandbox-5467"
}
```

```json
{
  "session_id": "25d08428-ee96-4d86-b1bc-9e8c28539080",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQxMzc1OSwiaWF0IjoxNzkzNDEyODU5LCJqdGkiOiI2ZTJlYzE3MC1jODYwLTQxNTctOGQzNi05ZWFmZmU3ZDRmNTYiLCJzaWQiOiIyNWQwODQyOC1lZTk2LTRkODYtYjFiYy05ZThjMjg1MzkwODAifQ.3vmM3KFLvXBHUvCSVr2q7APt473gCglLhm5lAN7mscA",
  "access_expires_at": "2026-10-31T02:29:19.437310565Z",
  "refresh_token": "2OnnpL5cgb0FAxOSHsOmy06q7XkbYukzi1AWQb3QsW8",
  "refresh_expires_at": "2026-11-30T02:14:19.436974455Z",
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
  "device_ref": "sandbox-10842"
}
```

```json
{
  "challenge_id": "e968ec71-7412-4da9-bfa0-ff3c8779461b",
  "expires_at": "2026-10-31T02:19:19.843832767Z",
  "resend_available_at": "2026-10-31T02:14:20.843832767Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "444531",
  "sent_at": "2026-10-31T02:14:19.845648307Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e968ec71-7412-4da9-bfa0-ff3c8779461b",
  "code": "444531",
  "device_ref": "sandbox-10842"
}
```

```json
{
  "session_id": "790e698f-4fa4-419d-b019-e37d0f6a0318",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQxMzc2MCwiaWF0IjoxNzkzNDEyODYwLCJqdGkiOiI5ZDA2NWI4Ni00NjkzLTQ4MDMtYjVjYy0xNWU4MmNhN2M3ZjciLCJzaWQiOiI3OTBlNjk4Zi00ZmE0LTQxOWQtYjAxOS1lMzdkMGY2YTAzMTgifQ.UcOJmPNp_Eb8DukfZOnL3GQWe_97DhbUBSjb9wBz5aA",
  "access_expires_at": "2026-10-31T02:29:20.056606928Z",
  "refresh_token": "asjwOsXTDZWcvPX-uHYkXn79sm4vym7NlSzbcfU2b-U",
  "refresh_expires_at": "2026-11-30T02:14:20.056193266Z",
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
  "session_id": "dc8314af-8bf5-4da8-8d82-5b53191e41bb",
  "subject": {
    "type": "STAFF",
    "id": "13536a6b-90d5-4717-bcad-60e066f5abae"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzUzNmE2Yi05MGQ1LTQ3MTctYmNhZC02MGUwNjZmNWFiYWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MTM3NjAsImlhdCI6MTc5MzQxMjg2MCwianRpIjoiMzg2MzkwZGYtOWVkYi00MTIwLThmOTAtYWZhZGY1ZjcwZmY3Iiwic2lkIjoiZGM4MzE0YWYtOGJmNS00ZGE4LThkODItNWI1MzE5MWU0MWJiIn0.umFU_EzXMsz8V6U3zUp8CF1Sd0JwtxDoZ2Tn4ECmVLU",
  "access_expires_at": "2026-10-31T02:29:20.638691845Z",
  "refresh_token": "TEVtBXkhWCjTealy-uj3Yu_WhpgjAS0Mab3DZbhRpgQ",
  "refresh_expires_at": "2026-10-31T14:14:20.638287042Z",
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
  "session_id": "27d0303e-a46e-4a45-86da-47d085f16e98",
  "subject": {
    "type": "STAFF",
    "id": "13536a6b-90d5-4717-bcad-60e066f5abae"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzUzNmE2Yi05MGQ1LTQ3MTctYmNhZC02MGUwNjZmNWFiYWUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MTM3NjEsImlhdCI6MTc5MzQxMjg2MSwianRpIjoiMjQwODFhZDYtYzM2ZC00MzJmLThkMTYtNWYwNjQ4NjJhZWRmIiwic2lkIjoiMjdkMDMwM2UtYTQ2ZS00YTQ1LTg2ZGEtNDdkMDg1ZjE2ZTk4In0.eFVT2n-2n2R1l95qofalakGqUTA2ioeziTXkVP7Z9X4",
  "access_expires_at": "2026-10-31T02:29:21.031810027Z",
  "refresh_token": "p00Pw_EGATqf0rtO9qjELAZj02Kk8W6CCM01Ofd7x0w",
  "refresh_expires_at": "2026-10-31T14:14:21.031429225Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-7847"
}
```

```json
{
  "challenge_id": "5f3784f8-b000-4252-8092-4ade70d38263",
  "expires_at": "2026-10-31T02:19:21.213980689Z",
  "resend_available_at": "2026-10-31T02:14:22.213980689Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "278210",
  "sent_at": "2026-10-31T02:14:21.215784656Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5f3784f8-b000-4252-8092-4ade70d38263",
  "code": "278210",
  "device_ref": "sandbox-7847"
}
```

```json
{
  "session_id": "169eaa5f-4664-436c-937a-ee6a504ae730",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQxMzc2MSwiaWF0IjoxNzkzNDEyODYxLCJqdGkiOiJlMTcyNmFmMy03ZDYyLTRkNzYtYTQ2YS05MjM0YWVlODg2NTkiLCJzaWQiOiIxNjllYWE1Zi00NjY0LTQzNmMtOTM3YS1lZTZhNTA0YWU3MzAifQ.nCoIzgB3ZceHldAfc_kjs10ofDr1GbZ2pprWtNUxNd0",
  "access_expires_at": "2026-10-31T02:29:21.42248878Z",
  "refresh_token": "9HPmN0vqnqqPzmIb7S4rNRL9knEhg5SiJey86q9qT_Q",
  "refresh_expires_at": "2026-11-30T02:14:21.422149445Z",
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

(the car drives 75 s to the next point)

`POST /api/driver/v1/work-sessions` → **201**

```json
{
  "command_id": "35ec771f-517c-4ad7-bda2-9fcde812f18f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4528,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T02:15:36Z",
    "sequence": 1793412936811
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "b3af3bb3-f6f0-4f3a-9f46-c8401ccb236b",
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
  "last_heartbeat_at": "2026-10-31T02:15:36.827488Z",
  "last_location_at": "2026-10-31T02:15:36.827488Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380686803995",
  "device_ref": "sandbox-5606"
}
```

```json
{
  "challenge_id": "a50dd0d8-8673-452f-9524-8a428d0f9433",
  "expires_at": "2026-10-31T02:20:37.019735712Z",
  "resend_available_at": "2026-10-31T02:15:38.019735712Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380686803995` → **200**

```json
{
  "phone": "+380686803995",
  "audience": "CLIENT",
  "code": "125902",
  "sent_at": "2026-10-31T02:15:37.022332576Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a50dd0d8-8673-452f-9524-8a428d0f9433",
  "code": "125902",
  "device_ref": "sandbox-5606"
}
```

```json
{
  "session_id": "4afc3931-5381-4592-81c7-44b2c583230f",
  "subject": {
    "type": "CLIENT",
    "id": "75cee672-fffd-425d-8368-8a61c013e45c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3NWNlZTY3Mi1mZmZkLTQyNWQtODM2OC04YTYxYzAxM2U0NWMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDEzODM3LCJpYXQiOjE3OTM0MTI5MzcsImp0aSI6IjY3ZDM5MGJkLWRlNWQtNDkyOS04NDI2LWE1NWVmZWYzYjkzZiIsInNpZCI6IjRhZmMzOTMxLTUzODEtNDU5Mi04MWM3LTQ0YjJjNTgzMjMwZiJ9.FahnNdaQOq6KD9pucwoWQxLKH9yHj0LadxrEKEVfDfI",
  "access_expires_at": "2026-10-31T02:30:37.231501019Z",
  "refresh_token": "7P_as_cAgVPzBc6Y_7br0eOaKXcBzzNySFZ8n2JETOg",
  "refresh_expires_at": "2026-11-30T02:15:37.230937952Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "670b55c5-8956-45f5-8ebc-1c52320fdcb7",
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
  "id": "fd6905f6-cb35-432c-b867-7dab5eb94da0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T02:20:37.422914Z",
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
  "command_id": "98fcd448-23bb-48f9-8670-eb8f1f42f844",
  "quote_id": "fd6905f6-cb35-432c-b867-7dab5eb94da0",
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
  "id": "dc558a6d-2ab4-44f1-a6c4-5864a9f303d2",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "75cee672-fffd-425d-8368-8a61c013e45c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T02:15:37.620394Z",
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
    "id": "a5e53416-aa3b-489a-8dec-5656c9a21507",
    "order_id": "dc558a6d-2ab4-44f1-a6c4-5864a9f303d2",
    "expires_at": "2026-10-31T02:15:52.623071Z",
    "server_time": "2026-10-31T02:15:37.840092052Z",
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

`POST /api/driver/v1/offers/a5e53416-aa3b-489a-8dec-5656c9a21507/accept` → **200**

```json
{
  "command_id": "a2f21e09-f4f5-4250-a560-27e24a1bc386"
}
```

```json
{
  "id": "5e300a76-87a4-4985-9990-78c9a287fb98",
  "order_id": "dc558a6d-2ab4-44f1-a6c4-5864a9f303d2",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "9f684368-b9b0-4a74-89e2-82f4ec180597",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9f684368-b9b0-4a74-89e2-82f4ec180597",
  "order_id": "dc558a6d-2ab4-44f1-a6c4-5864a9f303d2",
  "assignment_id": "5e300a76-87a4-4985-9990-78c9a287fb98",
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
  "entrance": null,
  "contact_attempts": []
}
```

(the car drives 4 s to the next point)

`POST /api/driver/v1/work-sessions/b3af3bb3-f6f0-4f3a-9f46-c8401ccb236b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T02:15:42Z",
    "sequence": 1793412942405
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "b3af3bb3-f6f0-4f3a-9f46-c8401ccb236b",
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
  "last_heartbeat_at": "2026-10-31T02:15:42.421313Z",
  "last_location_at": "2026-10-31T02:15:42.421313Z",
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
  "id": "9f684368-b9b0-4a74-89e2-82f4ec180597",
  "order_id": "dc558a6d-2ab4-44f1-a6c4-5864a9f303d2",
  "assignment_id": "5e300a76-87a4-4985-9990-78c9a287fb98",
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
  "entrance": null,
  "contact_attempts": []
}
```

`POST /api/driver/v1/trips/9f684368-b9b0-4a74-89e2-82f4ec180597/arrive` → **200**

```json
{
  "command_id": "2c933e29-52c4-457e-a442-a8b20beca158",
  "expected_version": 0
}
```

```json
{
  "id": "9f684368-b9b0-4a74-89e2-82f4ec180597",
  "order_id": "dc558a6d-2ab4-44f1-a6c4-5864a9f303d2",
  "assignment_id": "5e300a76-87a4-4985-9990-78c9a287fb98",
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
  "arrived_at": "2026-10-31T02:15:42.804358Z",
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

`POST /api/driver/v1/trips/9f684368-b9b0-4a74-89e2-82f4ec180597/start` → **200**

```json
{
  "command_id": "1bf61650-f35e-4b6e-9cbf-7818c66f5fc7",
  "expected_version": 1
}
```

```json
{
  "id": "9f684368-b9b0-4a74-89e2-82f4ec180597",
  "order_id": "dc558a6d-2ab4-44f1-a6c4-5864a9f303d2",
  "assignment_id": "5e300a76-87a4-4985-9990-78c9a287fb98",
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
  "arrived_at": "2026-10-31T02:15:42.804358Z",
  "started_at": "2026-10-31T02:15:42.998736Z",
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
  "command_id": "7f8d5e80-f185-4eed-b87d-6ca52533df68",
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
  "session_id": "b3af3bb3-f6f0-4f3a-9f46-c8401ccb236b",
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
  "last_heartbeat_at": "2026-10-31T02:15:42.421313Z",
  "last_location_at": "2026-10-31T02:15:42.421313Z",
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
  "id": "9f684368-b9b0-4a74-89e2-82f4ec180597",
  "order_id": "dc558a6d-2ab4-44f1-a6c4-5864a9f303d2",
  "assignment_id": "5e300a76-87a4-4985-9990-78c9a287fb98",
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
  "arrived_at": "2026-10-31T02:15:42.804358Z",
  "started_at": "2026-10-31T02:15:42.998736Z",
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
  "command_id": "925a8231-28f9-4d9a-a124-afdb651a5825",
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
  "correlation_id": "2aa817b8-f1c3-4969-92a5-034d1360c052"
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
  "correlation_id": "cf5af5a3-6538-43f8-9ed9-107e37def79e"
}
```

## He completes the trip and writes to support

(the car drives 47 s to the next point)

`POST /api/driver/v1/work-sessions/b3af3bb3-f6f0-4f3a-9f46-c8401ccb236b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T02:16:31Z",
    "sequence": 1793412991589
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "b3af3bb3-f6f0-4f3a-9f46-c8401ccb236b",
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
  "last_heartbeat_at": "2026-10-31T02:16:31.605581Z",
  "last_location_at": "2026-10-31T02:16:31.605581Z",
  "eligible": false,
  "ineligible_reasons": [
    "ACCOUNT_BLOCKED",
    "INTENT_PAUSE_AFTER_CURRENT",
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/9f684368-b9b0-4a74-89e2-82f4ec180597/complete` → **200**

```json
{
  "command_id": "17dd8dda-e35b-48b4-8b80-91922c756625",
  "expected_version": 2,
  "reported_at": "2026-10-31T02:16:31Z",
  "cash_received": true
}
```

```json
{
  "id": "9f684368-b9b0-4a74-89e2-82f4ec180597",
  "order_id": "dc558a6d-2ab4-44f1-a6c4-5864a9f303d2",
  "assignment_id": "5e300a76-87a4-4985-9990-78c9a287fb98",
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
  "arrived_at": "2026-10-31T02:15:42.804358Z",
  "started_at": "2026-10-31T02:15:42.998736Z",
  "completed_at": "2026-10-31T02:16:31.806976Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null,
  "comment": null,
  "entrance": null,
  "contact_attempts": []
}
```

`POST /api/driver/v1/support/cases` → **201**

```json
{
  "command_id": "8a543ccf-160f-4b92-8a29-f0ecf10d48ae",
  "category": "OTHER",
  "subject": "Why is my account blocked?",
  "message": "Please explain."
}
```

```json
{
  "id": "3aee5146-1d09-4daf-97c4-d02188958d19",
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
  "created_at": "2026-10-31T02:16:32.014302Z",
  "updated_at": "2026-10-31T02:16:32.014302Z",
  "respond_by": "2026-10-31T06:16:32.014302Z",
  "messages": [
    {
      "id": "0a639765-e773-482a-802a-b414b48534e8",
      "sequence": 1,
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000403",
      "visibility": "PUBLIC",
      "body": "Please explain.",
      "created_at": "2026-10-31T02:16:32.01516Z",
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
      "id": "9f684368-b9b0-4a74-89e2-82f4ec180597",
      "order_id": "dc558a6d-2ab4-44f1-a6c4-5864a9f303d2",
      "order_short_number": 14,
      "created_at": "2026-10-31T02:15:38.026251Z",
      "pickup_label": "Майдан",
      "dropoff_label": "Вокзал",
      "final_price_minor": 10517,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "COMPLETED"
    },
    {
      "id": "d3b35da7-ac1d-45ad-b2c0-431868881e89",
      "order_id": "01b10f37-6795-4fcf-b7eb-36d522aad13a",
      "order_short_number": 11,
      "created_at": "2026-10-31T02:11:58.218234Z",
      "pickup_label": "вул. Дмитрівська",
      "dropoff_label": "Нивки",
      "final_price_minor": 16297,
      "currency": "UAH",
      "payment_method": "CARD",
      "phase": "COMPLETED"
    },
    {
      "id": "8f2750c1-4b96-4dfd-aec8-7f669041672f",
      "order_id": "229e9dce-8c54-48e3-9d2b-20346f3c6f62",
      "order_short_number": 9,
      "created_at": "2026-10-31T02:11:40.929115Z",
      "pickup_label": "вул. Дмитрівська",
      "dropoff_label": "Нивки",
      "final_price_minor": 16297,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "COMPLETED"
    },
    {
      "id": "e5a07156-4e2b-42f5-b174-cafbb395d871",
      "order_id": "87d68a15-bb38-4ac2-b6b4-c15193925a9c",
      "order_short_number": 8,
      "created_at": "2026-10-31T02:11:24.986911Z",
      "pickup_label": "вул. Дмитрівська",
      "dropoff_label": "Нивки",
      "final_price_minor": 16297,
      "currency": "UAH",
      "payment_method": "CARD",
      "phase": "COMPLETED"
    },
    {
      "id": "2bfe00c9-bf8d-44de-aea3-80aef3c9971d",
      "order_id": "f1ecc28d-09e0-41b4-8ac6-8bd4b17840d2",
      "order_short_number": 7,
      "created_at": "2026-10-31T02:10:35.010257Z",
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
  "session_id": "b3af3bb3-f6f0-4f3a-9f46-c8401ccb236b",
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
  "last_heartbeat_at": "2026-10-31T02:16:31.605581Z",
  "last_location_at": "2026-10-31T02:16:31.605581Z",
  "eligible": false,
  "ineligible_reasons": [
    "ACCOUNT_BLOCKED",
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/work-sessions/b3af3bb3-f6f0-4f3a-9f46-c8401ccb236b/resume` → **403**

```json
{
  "command_id": "222a4804-b7e8-4f45-b6a6-f1309f704c78",
  "expected_version": 2
}
```

```json
{
  "instance": "/api/driver/v1/work-sessions/b3af3bb3-f6f0-4f3a-9f46-c8401ccb236b/resume",
  "status": 403,
  "title": "Account blocked",
  "type": "https://errors.blizz.taxi/account-blocked",
  "code": "ACCOUNT_BLOCKED",
  "correlation_id": "a1774124-ca80-4d5a-a697-07fb4f4d0289"
}
```

(the car drives 47 s to the next point)

`POST /api/driver/v1/work-sessions/b3af3bb3-f6f0-4f3a-9f46-c8401ccb236b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4528,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T02:17:22Z",
    "sequence": 1793413042794
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "b3af3bb3-f6f0-4f3a-9f46-c8401ccb236b",
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
  "last_heartbeat_at": "2026-10-31T02:17:22.810016Z",
  "last_location_at": "2026-10-31T02:17:22.810016Z",
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
  "command_id": "36fe4475-a2a4-4b99-bd01-1f57e7daf359",
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
  "id": "76e495dc-25c5-4a5f-97fb-7998df17cf95",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T02:22:23.005923Z",
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
  "command_id": "282d39a1-d9dd-495a-8e4b-b38fc0186373",
  "quote_id": "76e495dc-25c5-4a5f-97fb-7998df17cf95",
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
  "id": "3a150113-7b47-4b14-9d0f-b225f0d5514b",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "75cee672-fffd-425d-8368-8a61c013e45c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-31T02:17:23.209872Z",
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
  "correlation_id": "f3edced8-ce99-468d-a328-38ae5653450e"
}
```

`GET /api/operator/v1/orders/3a150113-7b47-4b14-9d0f-b225f0d5514b` → **200**

```json
{
  "id": "3a150113-7b47-4b14-9d0f-b225f0d5514b",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "75cee672-fffd-425d-8368-8a61c013e45c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-31T02:17:23.209872Z",
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

Done: blocked on trip 9f684368-b9b0-4a74-89e2-82f4ec180597, Andrii completed it and reached support; new work answered ACCOUNT_BLOCKED.

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
  "command_id": "4ee4ab9d-1515-4aa6-b0f6-9d7767ebd774",
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

`GET /api/operator/v1/orders/dc558a6d-2ab4-44f1-a6c4-5864a9f303d2` → **200**

```json
{
  "id": "dc558a6d-2ab4-44f1-a6c4-5864a9f303d2",
  "short_number": 14,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "75cee672-fffd-425d-8368-8a61c013e45c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
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
    "id": "5e300a76-87a4-4985-9990-78c9a287fb98",
    "order_id": "dc558a6d-2ab4-44f1-a6c4-5864a9f303d2",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "9f684368-b9b0-4a74-89e2-82f4ec180597",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-31T02:15:37.620394Z",
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

`GET /api/operator/v1/orders/3a150113-7b47-4b14-9d0f-b225f0d5514b` → **200**

```json
{
  "id": "3a150113-7b47-4b14-9d0f-b225f0d5514b",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "75cee672-fffd-425d-8368-8a61c013e45c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-31T02:17:23.209872Z",
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

`POST /api/operator/v1/orders/3a150113-7b47-4b14-9d0f-b225f0d5514b/cancel` → **200**

```json
{
  "command_id": "8deda547-796d-43c7-ae87-c923f56758b8",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "3a150113-7b47-4b14-9d0f-b225f0d5514b",
  "short_number": 15,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "75cee672-fffd-425d-8368-8a61c013e45c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T02:17:23.209872Z",
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
  "session_id": "b3af3bb3-f6f0-4f3a-9f46-c8401ccb236b",
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
  "last_heartbeat_at": "2026-10-31T02:17:22.810016Z",
  "last_location_at": "2026-10-31T02:17:22.810016Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/work-sessions/b3af3bb3-f6f0-4f3a-9f46-c8401ccb236b/close` → **200**

```json
{
  "command_id": "30d0c7a6-90e4-4674-bed3-fee4b67f948a",
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
  "device_ref": "sandbox-14099"
}
```

```json
{
  "challenge_id": "ac2769b3-30c7-43e9-91ea-ac952c414d15",
  "expires_at": "2026-10-31T02:22:25.271305997Z",
  "resend_available_at": "2026-10-31T02:17:26.271305997Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "207357",
  "sent_at": "2026-10-31T02:17:25.273713758Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ac2769b3-30c7-43e9-91ea-ac952c414d15",
  "code": "207357",
  "device_ref": "sandbox-14099"
}
```

```json
{
  "session_id": "2d143c51-be12-468c-9e42-14c7baec3695",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQxMzk0NSwiaWF0IjoxNzkzNDEzMDQ1LCJqdGkiOiI5NTg0NGNmNy1lOWMyLTQ1YTctODE0OC1kOGNhZDBiODEwODciLCJzaWQiOiIyZDE0M2M1MS1iZTEyLTQ2OGMtOWU0Mi0xNGM3YmFlYzM2OTUifQ.Ongke-pu3RXV5em17jCaQEgVH60Mew3vAmdhbxlemAo",
  "access_expires_at": "2026-10-31T02:32:25.482129135Z",
  "refresh_token": "MJcdBfrZ0sMHrpBdFuRRqLQrqauq-X2Dmx2_fEYtJFk",
  "refresh_expires_at": "2026-11-30T02:17:25.481531155Z",
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
  "device_ref": "sandbox-17178"
}
```

```json
{
  "challenge_id": "134fcb9c-169d-437f-989a-9fd0c638789a",
  "expires_at": "2026-10-31T02:22:25.883618212Z",
  "resend_available_at": "2026-10-31T02:17:26.883618212Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "159440",
  "sent_at": "2026-10-31T02:17:25.886199081Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "134fcb9c-169d-437f-989a-9fd0c638789a",
  "code": "159440",
  "device_ref": "sandbox-17178"
}
```

```json
{
  "session_id": "69585931-7d60-40f0-8e18-00c088a7d42c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQxMzk0NiwiaWF0IjoxNzkzNDEzMDQ2LCJqdGkiOiIxNTI4MDUwMi1mNTgxLTRiOTktODgzYS0xYzQ2M2NkNjFkM2UiLCJzaWQiOiI2OTU4NTkzMS03ZDYwLTQwZjAtOGUxOC0wMGMwODhhN2Q0MmMifQ.vR6hnb73r2gaZRgmSvGcNbloSztEf_jom61pxoDu4H8",
  "access_expires_at": "2026-10-31T02:32:26.10236345Z",
  "refresh_token": "6BUuNe2SR1zdxWCCGIjbLHYFzgj_y-UYM3XUoKAi9ok",
  "refresh_expires_at": "2026-11-30T02:17:26.101902159Z",
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
  "command_id": "8981eb0e-ded6-4820-8177-f2ee43620ac4",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T02:17:26Z",
    "sequence": 1793413046494
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c6c2f0c2-8e12-4b16-91a4-a59bf53cd5a7",
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
  "last_heartbeat_at": "2026-10-31T02:17:26.510829Z",
  "last_location_at": "2026-10-31T02:17:26.510829Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-24845"
}
```

```json
{
  "challenge_id": "76e4e797-7742-43c3-8f01-4e581a49ed21",
  "expires_at": "2026-10-31T02:22:26.702751673Z",
  "resend_available_at": "2026-10-31T02:17:27.702751673Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "940438",
  "sent_at": "2026-10-31T02:17:26.705427933Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "76e4e797-7742-43c3-8f01-4e581a49ed21",
  "code": "940438",
  "device_ref": "sandbox-24845"
}
```

```json
{
  "session_id": "3c19e77c-427a-4eec-bdc9-177b7c9aedb8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQxMzk0NiwiaWF0IjoxNzkzNDEzMDQ2LCJqdGkiOiJhMGU3ZmUxOS01OTE1LTRjMzEtYTVhZC0wNDc0YjA1YWRjYzciLCJzaWQiOiIzYzE5ZTc3Yy00MjdhLTRlZWMtYmRjOS0xNzdiN2M5YWVkYjgifQ.AB3oHWt8duwIVwF5MfpTzf8tZ5yeODvResGNyh2XpeQ",
  "access_expires_at": "2026-10-31T02:32:26.916943154Z",
  "refresh_token": "wjcLWDBFMVW7rf6Cfx8Hxr2miUr_ImSnpkibHVuJjNM",
  "refresh_expires_at": "2026-11-30T02:17:26.916312301Z",
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
  "command_id": "b68f734c-0e14-4e1e-b8d4-307c5e9dd14e",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T02:17:27Z",
    "sequence": 1793413047310
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "45b91848-77b0-4797-b9d5-09fec4b78b7b",
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
  "last_heartbeat_at": "2026-10-31T02:17:27.327493Z",
  "last_location_at": "2026-10-31T02:17:27.327493Z",
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
  "session_id": "489fd1bc-7612-4a93-b27a-b56d00665b83",
  "subject": {
    "type": "STAFF",
    "id": "13536a6b-90d5-4717-bcad-60e066f5abae"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzUzNmE2Yi05MGQ1LTQ3MTctYmNhZC02MGUwNjZmNWFiYWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MTM5NDcsImlhdCI6MTc5MzQxMzA0NywianRpIjoiZmJkZmRhMzctMTUyMS00ZjQ5LTljZDUtNDQyMjdhM2E0YzU2Iiwic2lkIjoiNDg5ZmQxYmMtNzYxMi00YTkzLWIyN2EtYjU2ZDAwNjY1YjgzIn0.PqVjrTbUh8twdIVgF_Q0HfM2ylhDh407MXOBylTlr9U",
  "access_expires_at": "2026-10-31T02:32:27.724470792Z",
  "refresh_token": "o5xMBAUN92W1tStcEVrKI_QVxTQDLunGKeJHYHhhDLo",
  "refresh_expires_at": "2026-10-31T14:17:27.724010492Z",
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
  "session_id": "1025156e-f93a-4243-b38c-8082314031ad",
  "subject": {
    "type": "STAFF",
    "id": "13536a6b-90d5-4717-bcad-60e066f5abae"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzUzNmE2Yi05MGQ1LTQ3MTctYmNhZC02MGUwNjZmNWFiYWUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MTM5NDgsImlhdCI6MTc5MzQxMzA0OCwianRpIjoiYjIyMmIxNGYtYjhjNC00NTEwLWEyZDUtM2EwMjFjODFlMTlmIiwic2lkIjoiMTAyNTE1NmUtZjkzYS00MjQzLWIzOGMtODA4MjMxNDAzMWFkIn0.a0AlleI__WZNQAaSePmnt9OSABGi0sXfG8eSYnNR9Uk",
  "access_expires_at": "2026-10-31T02:32:28.115432604Z",
  "refresh_token": "LKCMqpBcRr37OdLFXH9TxY0i2LTseCXYaqP7z5W69eU",
  "refresh_expires_at": "2026-10-31T14:17:28.115026891Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380684491683",
  "device_ref": "sandbox-10615"
}
```

```json
{
  "challenge_id": "7fd5a065-216e-4de5-82e6-92cec6b8a741",
  "expires_at": "2026-10-31T02:22:28.296309772Z",
  "resend_available_at": "2026-10-31T02:17:29.296309772Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380684491683` → **200**

```json
{
  "phone": "+380684491683",
  "audience": "CLIENT",
  "code": "477270",
  "sent_at": "2026-10-31T02:17:28.298265613Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7fd5a065-216e-4de5-82e6-92cec6b8a741",
  "code": "477270",
  "device_ref": "sandbox-10615"
}
```

```json
{
  "session_id": "2f9e6599-93d2-4d25-9f08-5adc8e7cc9cd",
  "subject": {
    "type": "CLIENT",
    "id": "280a3e8a-4b03-42ae-870f-a43c7add31a8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyODBhM2U4YS00YjAzLTQyYWUtODcwZi1hNDNjN2FkZDMxYTgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDEzOTQ4LCJpYXQiOjE3OTM0MTMwNDgsImp0aSI6Ijk1YjliZmE5LTE3ZmYtNDZiYi04Njk2LTk1OWUxZGQwYjRmYyIsInNpZCI6IjJmOWU2NTk5LTkzZDItNGQyNS05ZjA4LTVhZGM4ZTdjYzljZCJ9.nVzH-WCt2_9kK_b85BnbschQDpBxrFQVxgjbaFN0xeE",
  "access_expires_at": "2026-10-31T02:32:28.503415794Z",
  "refresh_token": "6RVP4D0HqTFDVgmQFAohCt2eXJepggzrMvFpBR8ILZc",
  "refresh_expires_at": "2026-11-30T02:17:28.502999511Z",
  "account_created": true
}
```

## E2: Near has the offer and pauses: the offer is revoked and Far gets the order at once

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "30ecf25d-865a-4b2c-9c75-41f470dd7fbe",
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
  "id": "14e6447b-bbdd-4c91-b1d7-72379009fc4a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T02:22:28.695665Z",
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
  "command_id": "56b3e7dd-bdf2-4f96-af6e-c457f2dd5260",
  "quote_id": "14e6447b-bbdd-4c91-b1d7-72379009fc4a",
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
  "id": "4062955e-306b-4716-ae9d-e8100fbd6f0a",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "280a3e8a-4b03-42ae-870f-a43c7add31a8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T02:17:28.899088Z",
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
    "id": "cf839d31-8d05-457f-9da9-7b008f3d9931",
    "order_id": "4062955e-306b-4716-ae9d-e8100fbd6f0a",
    "expires_at": "2026-10-31T02:17:43.9013Z",
    "server_time": "2026-10-31T02:17:29.122478337Z",
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
  "session_id": "c6c2f0c2-8e12-4b16-91a4-a59bf53cd5a7",
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
  "last_heartbeat_at": "2026-10-31T02:17:26.510829Z",
  "last_location_at": "2026-10-31T02:17:26.510829Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

`POST /api/driver/v1/work-sessions/c6c2f0c2-8e12-4b16-91a4-a59bf53cd5a7/pause` → **200**

```json
{
  "command_id": "b419f936-dbeb-413d-afb6-8446515ac66e",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c6c2f0c2-8e12-4b16-91a4-a59bf53cd5a7",
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
  "last_heartbeat_at": "2026-10-31T02:17:26.510829Z",
  "last_location_at": "2026-10-31T02:17:26.510829Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/offers/cf839d31-8d05-457f-9da9-7b008f3d9931/accept` → **409**

```json
{
  "command_id": "122a2ede-ee39-4f20-98f1-71ee765250f2"
}
```

```json
{
  "instance": "/api/driver/v1/offers/cf839d31-8d05-457f-9da9-7b008f3d9931/accept",
  "status": 409,
  "title": "Offer revoked",
  "type": "https://errors.blizz.taxi/offer-revoked",
  "code": "OFFER_REVOKED",
  "correlation_id": "2f1a3b2b-1395-4e8e-bc1f-594339824c3b"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "afc49fb5-d18a-48d8-8a42-66fd6e831175",
    "order_id": "4062955e-306b-4716-ae9d-e8100fbd6f0a",
    "expires_at": "2026-10-31T02:17:44.516773Z",
    "server_time": "2026-10-31T02:17:29.933423897Z",
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

`POST /api/driver/v1/offers/afc49fb5-d18a-48d8-8a42-66fd6e831175/reject` → **204**

```json
{
  "command_id": "295a8496-323c-4f22-9ae2-0f52c6bb12cf"
}
```

`GET /api/operator/v1/orders/4062955e-306b-4716-ae9d-e8100fbd6f0a/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-31T02:17:28.899522Z",
      "actor": {
        "type": "CLIENT",
        "id": "280a3e8a-4b03-42ae-870f-a43c7add31a8",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "4062955e-306b-4716-ae9d-e8100fbd6f0a",
        "quote_id": "14e6447b-bbdd-4c91-b1d7-72379009fc4a",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "293961cd-4a3f-47c3-9855-c44a99ca0155"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-31T02:17:28.900771Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "4062955e-306b-4716-ae9d-e8100fbd6f0a",
        "attempt_id": "24c77e9a-39dd-4a7f-a81d-6f6b8926588e",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "293961cd-4a3f-47c3-9855-c44a99ca0155"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-31T02:17:28.916736Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "source": "AUTO",
        "offer_id": "cf839d31-8d05-457f-9da9-7b008f3d9931",
        "order_id": "4062955e-306b-4716-ae9d-e8100fbd6f0a",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200,
        "expires_at": "2026-10-31T02:17:43.901299873Z"
      },
      "correlation_id": "293961cd-4a3f-47c3-9855-c44a99ca0155"
    },
    {
      "sequence": 3,
      "type": "OfferRevoked",
      "occurred_at": "2026-10-31T02:17:29.515821Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": "DRIVER_PAUSED",
      "details": {
        "reason": "DRIVER_PAUSED",
        "offer_id": "cf839d31-8d05-457f-9da9-7b008f3d9931",
        "order_id": "4062955e-306b-4716-ae9d-e8100fbd6f0a",
        "driver_id": "5a000000-0000-4000-8000-000000000401"
      },
```

`GET /api/operator/v1/orders/4062955e-306b-4716-ae9d-e8100fbd6f0a` → **200**

```json
{
  "id": "4062955e-306b-4716-ae9d-e8100fbd6f0a",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "280a3e8a-4b03-42ae-870f-a43c7add31a8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-31T02:17:28.899088Z",
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

`POST /api/operator/v1/orders/4062955e-306b-4716-ae9d-e8100fbd6f0a/cancel` → **200**

```json
{
  "command_id": "3d13cd08-4189-433c-90a1-52ea7eb8eaeb",
  "expected_version": 6,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "4062955e-306b-4716-ae9d-e8100fbd6f0a",
  "short_number": 16,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 7,
  "channel": "APP",
  "payer_client_id": "280a3e8a-4b03-42ae-870f-a43c7add31a8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T02:17:28.899088Z",
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
  "related_order_id": null,
  "driver": null,
  "driver_change": null,
  "comment": null,
  "entrance": null
}
```

E2: offer cf839d31-8d05-457f-9da9-7b008f3d9931 revoked by the pause, the late accept got OFFER_REVOKED, Far had the order next.

## E5: pause and accept sent at the same moment, five rounds; Far is offline so each order goes to Near

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "45b91848-77b0-4797-b9d5-09fec4b78b7b",
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
  "last_heartbeat_at": "2026-10-31T02:17:27.327493Z",
  "last_location_at": "2026-10-31T02:17:27.327493Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/45b91848-77b0-4797-b9d5-09fec4b78b7b/close` → **200**

```json
{
  "command_id": "547edb26-4a7e-4ebc-b1f0-b8bdec1c1092",
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
  "session_id": "c6c2f0c2-8e12-4b16-91a4-a59bf53cd5a7",
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
  "last_heartbeat_at": "2026-10-31T02:17:26.510829Z",
  "last_location_at": "2026-10-31T02:17:26.510829Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/work-sessions/c6c2f0c2-8e12-4b16-91a4-a59bf53cd5a7/resume` → **200**

```json
{
  "command_id": "cfa717e7-1ff1-47c0-a2d6-e41a1bcd55cf",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c6c2f0c2-8e12-4b16-91a4-a59bf53cd5a7",
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
  "last_heartbeat_at": "2026-10-31T02:17:26.510829Z",
  "last_location_at": "2026-10-31T02:17:26.510829Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c6c2f0c2-8e12-4b16-91a4-a59bf53cd5a7/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T02:17:31Z",
    "sequence": 1793413051616
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c6c2f0c2-8e12-4b16-91a4-a59bf53cd5a7",
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
  "last_heartbeat_at": "2026-10-31T02:17:31.6312Z",
  "last_location_at": "2026-10-31T02:17:31.6312Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1f4cd3c6-af45-4140-805d-3533e1a2e8e1",
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
  "id": "e9fed400-ff95-493f-934d-bfe44fa0c84c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T02:22:31.842819Z",
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
  "command_id": "2775214e-9140-4582-b0bc-ea1ce25cec3f",
  "quote_id": "e9fed400-ff95-493f-934d-bfe44fa0c84c",
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
  "id": "e4e3e8f4-f3db-4dd8-9d14-67a5d0108716",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "280a3e8a-4b03-42ae-870f-a43c7add31a8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T02:17:32.035672Z",
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
    "id": "507304d5-0223-47ca-b3c2-4ef3ad49a52b",
    "order_id": "e4e3e8f4-f3db-4dd8-9d14-67a5d0108716",
    "expires_at": "2026-10-31T02:17:47.037777Z",
    "server_time": "2026-10-31T02:17:32.239321558Z",
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
  "session_id": "c6c2f0c2-8e12-4b16-91a4-a59bf53cd5a7",
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
  "last_heartbeat_at": "2026-10-31T02:17:31.6312Z",
  "last_location_at": "2026-10-31T02:17:31.6312Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

Round 1, at the same moment:

`POST /api/driver/v1/offers/507304d5-0223-47ca-b3c2-4ef3ad49a52b/accept` → **409**

```json
{
  "instance": "/api/driver/v1/offers/507304d5-0223-47ca-b3c2-4ef3ad49a52b/accept",
  "status": 409,
  "title": "Offer revoked",
  "type": "https://errors.blizz.taxi/offer-revoked",
  "code": "OFFER_REVOKED",
  "correlation_id": "5585f270-154c-4a27-a409-2985cd427b63"
}
```

`POST /api/driver/v1/work-sessions/c6c2f0c2-8e12-4b16-91a4-a59bf53cd5a7/pause` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c6c2f0c2-8e12-4b16-91a4-a59bf53cd5a7",
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
  "last_heartbeat_at": "2026-10-31T02:17:31.6312Z",
  "last_location_at": "2026-10-31T02:17:31.6312Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

Round 1: the pause won; the accept got OFFER_REVOKED.

`GET /api/operator/v1/orders/e4e3e8f4-f3db-4dd8-9d14-67a5d0108716` → **200**

```json
{
  "id": "e4e3e8f4-f3db-4dd8-9d14-67a5d0108716",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "280a3e8a-4b03-42ae-870f-a43c7add31a8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-31T02:17:32.035672Z",
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

`GET /api/operator/v1/orders/e4e3e8f4-f3db-4dd8-9d14-67a5d0108716` → **200**

```json
{
  "id": "e4e3e8f4-f3db-4dd8-9d14-67a5d0108716",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "280a3e8a-4b03-42ae-870f-a43c7add31a8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-31T02:17:32.035672Z",
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

`POST /api/operator/v1/orders/e4e3e8f4-f3db-4dd8-9d14-67a5d0108716/cancel` → **200**

```json
{
  "command_id": "9df5347a-7c93-4fbe-a408-8ded51a25a7c",
  "expected_version": 4,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "e4e3e8f4-f3db-4dd8-9d14-67a5d0108716",
  "short_number": 17,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "280a3e8a-4b03-42ae-870f-a43c7add31a8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T02:17:32.035672Z",
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
  "session_id": "c6c2f0c2-8e12-4b16-91a4-a59bf53cd5a7",
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
  "last_heartbeat_at": "2026-10-31T02:17:31.6312Z",
  "last_location_at": "2026-10-31T02:17:31.6312Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/work-sessions/c6c2f0c2-8e12-4b16-91a4-a59bf53cd5a7/resume` → **200**

```json
{
  "command_id": "bee0188b-ca1c-46b8-bddf-56e1ebd494a6",
  "expected_version": 3
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c6c2f0c2-8e12-4b16-91a4-a59bf53cd5a7",
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
  "last_heartbeat_at": "2026-10-31T02:17:31.6312Z",
  "last_location_at": "2026-10-31T02:17:31.6312Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c6c2f0c2-8e12-4b16-91a4-a59bf53cd5a7/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T02:17:33Z",
    "sequence": 1793413053635
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c6c2f0c2-8e12-4b16-91a4-a59bf53cd5a7",
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
  "last_heartbeat_at": "2026-10-31T02:17:33.650449Z",
  "last_location_at": "2026-10-31T02:17:33.650449Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6c8ab441-0f8f-4158-8dfd-3bf92d4d9c94",
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
  "id": "80637907-2980-4576-afe6-d104f3ed371c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T02:22:33.840356Z",
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
  "command_id": "75a2b21b-08a4-4982-96d9-bbc6f38e48be",
  "quote_id": "80637907-2980-4576-afe6-d104f3ed371c",
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
  "id": "68e5fa98-6598-45b8-a700-4f3e2a5311f2",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "280a3e8a-4b03-42ae-870f-a43c7add31a8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T02:17:34.055833Z",
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
    "id": "f684abe3-51df-4ff7-a34e-6897b063278d",
    "order_id": "68e5fa98-6598-45b8-a700-4f3e2a5311f2",
    "expires_at": "2026-10-31T02:17:49.057803Z",
    "server_time": "2026-10-31T02:17:34.256690989Z",
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
  "session_id": "c6c2f0c2-8e12-4b16-91a4-a59bf53cd5a7",
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
  "last_heartbeat_at": "2026-10-31T02:17:33.650449Z",
  "last_location_at": "2026-10-31T02:17:33.650449Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

Round 2, at the same moment:

`POST /api/driver/v1/offers/f684abe3-51df-4ff7-a34e-6897b063278d/accept` → **200**

```json
{
  "id": "0b32f8e3-7b69-4949-a02a-1fa71a4aa349",
  "order_id": "68e5fa98-6598-45b8-a700-4f3e2a5311f2",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "249cc01b-acc3-4f33-88fc-1b415d6ab05d",
  "trip_phase": "TO_PICKUP"
}
```

`POST /api/driver/v1/work-sessions/c6c2f0c2-8e12-4b16-91a4-a59bf53cd5a7/pause` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c6c2f0c2-8e12-4b16-91a4-a59bf53cd5a7",
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
  "last_heartbeat_at": "2026-10-31T02:17:33.650449Z",
  "last_location_at": "2026-10-31T02:17:33.650449Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_PAUSE_AFTER_CURRENT",
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

Round 2: the accept won; the pause waits for the end of the trip.

`GET /api/operator/v1/orders/68e5fa98-6598-45b8-a700-4f3e2a5311f2` → **200**

```json
{
  "id": "68e5fa98-6598-45b8-a700-4f3e2a5311f2",
  "short_number": 18,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "280a3e8a-4b03-42ae-870f-a43c7add31a8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "0b32f8e3-7b69-4949-a02a-1fa71a4aa349",
    "order_id": "68e5fa98-6598-45b8-a700-4f3e2a5311f2",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "249cc01b-acc3-4f33-88fc-1b415d6ab05d",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-31T02:17:34.055833Z",
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

`GET /api/operator/v1/orders/68e5fa98-6598-45b8-a700-4f3e2a5311f2` → **200**

```json
{
  "id": "68e5fa98-6598-45b8-a700-4f3e2a5311f2",
  "short_number": 18,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "280a3e8a-4b03-42ae-870f-a43c7add31a8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "0b32f8e3-7b69-4949-a02a-1fa71a4aa349",
    "order_id": "68e5fa98-6598-45b8-a700-4f3e2a5311f2",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "249cc01b-acc3-4f33-88fc-1b415d6ab05d",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-31T02:17:34.055833Z",
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

`POST /api/operator/v1/orders/68e5fa98-6598-45b8-a700-4f3e2a5311f2/cancel` → **200**

```json
{
  "command_id": "97f52d20-b67d-4a4b-b9f5-e6e52e6a2a9b",
  "expected_version": 3,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "68e5fa98-6598-45b8-a700-4f3e2a5311f2",
  "short_number": 18,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "280a3e8a-4b03-42ae-870f-a43c7add31a8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "0b32f8e3-7b69-4949-a02a-1fa71a4aa349",
    "order_id": "68e5fa98-6598-45b8-a700-4f3e2a5311f2",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "249cc01b-acc3-4f33-88fc-1b415d6ab05d",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-31T02:17:34.055833Z",
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
  "session_id": "c6c2f0c2-8e12-4b16-91a4-a59bf53cd5a7",
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
  "last_heartbeat_at": "2026-10-31T02:17:33.650449Z",
  "last_location_at": "2026-10-31T02:17:33.650449Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/work-sessions/c6c2f0c2-8e12-4b16-91a4-a59bf53cd5a7/resume` → **200**

```json
{
  "command_id": "e501e139-a212-4952-9b6b-db4c2dcd3a86",
  "expected_version": 6
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c6c2f0c2-8e12-4b16-91a4-a59bf53cd5a7",
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
  "last_heartbeat_at": "2026-10-31T02:17:33.650449Z",
  "last_location_at": "2026-10-31T02:17:33.650449Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c6c2f0c2-8e12-4b16-91a4-a59bf53cd5a7/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T02:17:35Z",
    "sequence": 1793413055641
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c6c2f0c2-8e12-4b16-91a4-a59bf53cd5a7",
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
  "last_heartbeat_at": "2026-10-31T02:17:35.655286Z",
  "last_location_at": "2026-10-31T02:17:35.655286Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "35d3d833-854c-4928-9e78-622159c64019",
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
  "id": "0e73271e-1d30-4298-abe0-e7b82fd0a53c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T02:22:35.841776Z",
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
  "command_id": "ffe96ee0-244e-4332-b3cc-47e372c518dc",
  "quote_id": "0e73271e-1d30-4298-abe0-e7b82fd0a53c",
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
  "id": "dd5953f9-cdf4-48f2-9691-f98712306277",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "280a3e8a-4b03-42ae-870f-a43c7add31a8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T02:17:36.034113Z",
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
    "id": "88ac2715-671b-422f-836e-689256ccbd14",
    "order_id": "dd5953f9-cdf4-48f2-9691-f98712306277",
    "expires_at": "2026-10-31T02:17:51.036306Z",
    "server_time": "2026-10-31T02:17:36.24266364Z",
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
  "session_id": "c6c2f0c2-8e12-4b16-91a4-a59bf53cd5a7",
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
  "last_heartbeat_at": "2026-10-31T02:17:35.655286Z",
  "last_location_at": "2026-10-31T02:17:35.655286Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

Round 3, at the same moment:

`POST /api/driver/v1/offers/88ac2715-671b-422f-836e-689256ccbd14/accept` → **200**

```json
{
  "id": "7aa10999-1afc-4a64-bf51-0fde47a29e62",
  "order_id": "dd5953f9-cdf4-48f2-9691-f98712306277",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "26549d5c-9521-43b3-86cc-78bd4ae455ff",
  "trip_phase": "TO_PICKUP"
}
```

`POST /api/driver/v1/work-sessions/c6c2f0c2-8e12-4b16-91a4-a59bf53cd5a7/pause` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c6c2f0c2-8e12-4b16-91a4-a59bf53cd5a7",
  "session_version": 8,
  "session_state": "OPEN",
  "intent": "PAUSE_AFTER_CURRENT",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-31T02:17:35.655286Z",
  "last_location_at": "2026-10-31T02:17:35.655286Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_PAUSE_AFTER_CURRENT",
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

Round 3: the accept won; the pause waits for the end of the trip.

`GET /api/operator/v1/orders/dd5953f9-cdf4-48f2-9691-f98712306277` → **200**

```json
{
  "id": "dd5953f9-cdf4-48f2-9691-f98712306277",
  "short_number": 19,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "280a3e8a-4b03-42ae-870f-a43c7add31a8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "7aa10999-1afc-4a64-bf51-0fde47a29e62",
    "order_id": "dd5953f9-cdf4-48f2-9691-f98712306277",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "26549d5c-9521-43b3-86cc-78bd4ae455ff",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-31T02:17:36.034113Z",
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

`GET /api/operator/v1/orders/dd5953f9-cdf4-48f2-9691-f98712306277` → **200**

```json
{
  "id": "dd5953f9-cdf4-48f2-9691-f98712306277",
  "short_number": 19,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "280a3e8a-4b03-42ae-870f-a43c7add31a8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "7aa10999-1afc-4a64-bf51-0fde47a29e62",
    "order_id": "dd5953f9-cdf4-48f2-9691-f98712306277",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "26549d5c-9521-43b3-86cc-78bd4ae455ff",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-31T02:17:36.034113Z",
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

`POST /api/operator/v1/orders/dd5953f9-cdf4-48f2-9691-f98712306277/cancel` → **200**

```json
{
  "command_id": "9dd6967d-0d99-4c69-ab73-c5aa5809591b",
  "expected_version": 3,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "dd5953f9-cdf4-48f2-9691-f98712306277",
  "short_number": 19,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "280a3e8a-4b03-42ae-870f-a43c7add31a8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "7aa10999-1afc-4a64-bf51-0fde47a29e62",
    "order_id": "dd5953f9-cdf4-48f2-9691-f98712306277",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "26549d5c-9521-43b3-86cc-78bd4ae455ff",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-31T02:17:36.034113Z",
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
  "session_id": "c6c2f0c2-8e12-4b16-91a4-a59bf53cd5a7",
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
  "last_heartbeat_at": "2026-10-31T02:17:35.655286Z",
  "last_location_at": "2026-10-31T02:17:35.655286Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/work-sessions/c6c2f0c2-8e12-4b16-91a4-a59bf53cd5a7/resume` → **200**

```json
{
  "command_id": "38e9c767-85bb-4c34-b712-9011d8eba490",
  "expected_version": 9
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c6c2f0c2-8e12-4b16-91a4-a59bf53cd5a7",
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
  "last_heartbeat_at": "2026-10-31T02:17:35.655286Z",
  "last_location_at": "2026-10-31T02:17:35.655286Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c6c2f0c2-8e12-4b16-91a4-a59bf53cd5a7/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T02:17:37Z",
    "sequence": 1793413057623
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c6c2f0c2-8e12-4b16-91a4-a59bf53cd5a7",
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
  "last_heartbeat_at": "2026-10-31T02:17:37.638571Z",
  "last_location_at": "2026-10-31T02:17:37.638571Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "0e01d1f4-ea82-4e0e-b33d-a2ab93a8d281",
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
  "id": "9921b003-906d-4e66-8eb0-4be9cd524f28",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T02:22:37.828632Z",
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
  "command_id": "b4e2d36b-3af8-4f56-809f-98c3980175b0",
  "quote_id": "9921b003-906d-4e66-8eb0-4be9cd524f28",
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
  "id": "32a90216-821c-4f3a-8ebc-93197dd8b2b7",
  "short_number": 20,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "280a3e8a-4b03-42ae-870f-a43c7add31a8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T02:17:38.022525Z",
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
    "id": "54941f53-bc6c-4668-abd5-48366ff6afe2",
    "order_id": "32a90216-821c-4f3a-8ebc-93197dd8b2b7",
    "expires_at": "2026-10-31T02:17:53.024345Z",
    "server_time": "2026-10-31T02:17:38.235010163Z",
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
  "session_id": "c6c2f0c2-8e12-4b16-91a4-a59bf53cd5a7",
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
  "last_heartbeat_at": "2026-10-31T02:17:37.638571Z",
  "last_location_at": "2026-10-31T02:17:37.638571Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

Round 4, at the same moment:

`POST /api/driver/v1/offers/54941f53-bc6c-4668-abd5-48366ff6afe2/accept` → **409**

```json
{
  "instance": "/api/driver/v1/offers/54941f53-bc6c-4668-abd5-48366ff6afe2/accept",
  "status": 409,
  "title": "Offer revoked",
  "type": "https://errors.blizz.taxi/offer-revoked",
  "code": "OFFER_REVOKED",
  "correlation_id": "55d967ac-48a9-421d-9ef1-d79c2ba53465"
}
```

`POST /api/driver/v1/work-sessions/c6c2f0c2-8e12-4b16-91a4-a59bf53cd5a7/pause` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c6c2f0c2-8e12-4b16-91a4-a59bf53cd5a7",
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
  "last_heartbeat_at": "2026-10-31T02:17:37.638571Z",
  "last_location_at": "2026-10-31T02:17:37.638571Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

Round 4: the pause won; the accept got OFFER_REVOKED.

`GET /api/operator/v1/orders/32a90216-821c-4f3a-8ebc-93197dd8b2b7` → **200**

```json
{
  "id": "32a90216-821c-4f3a-8ebc-93197dd8b2b7",
  "short_number": 20,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "280a3e8a-4b03-42ae-870f-a43c7add31a8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-31T02:17:38.022525Z",
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

`GET /api/operator/v1/orders/32a90216-821c-4f3a-8ebc-93197dd8b2b7` → **200**

```json
{
  "id": "32a90216-821c-4f3a-8ebc-93197dd8b2b7",
  "short_number": 20,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "280a3e8a-4b03-42ae-870f-a43c7add31a8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-31T02:17:38.022525Z",
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

`POST /api/operator/v1/orders/32a90216-821c-4f3a-8ebc-93197dd8b2b7/cancel` → **200**

```json
{
  "command_id": "87249b11-b82d-4445-921a-1accce446363",
  "expected_version": 4,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "32a90216-821c-4f3a-8ebc-93197dd8b2b7",
  "short_number": 20,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "280a3e8a-4b03-42ae-870f-a43c7add31a8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T02:17:38.022525Z",
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
  "session_id": "c6c2f0c2-8e12-4b16-91a4-a59bf53cd5a7",
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
  "last_heartbeat_at": "2026-10-31T02:17:37.638571Z",
  "last_location_at": "2026-10-31T02:17:37.638571Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/work-sessions/c6c2f0c2-8e12-4b16-91a4-a59bf53cd5a7/resume` → **200**

```json
{
  "command_id": "c98ecd96-26b5-40f3-af13-18fa74895dbb",
  "expected_version": 11
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c6c2f0c2-8e12-4b16-91a4-a59bf53cd5a7",
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
  "last_heartbeat_at": "2026-10-31T02:17:37.638571Z",
  "last_location_at": "2026-10-31T02:17:37.638571Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c6c2f0c2-8e12-4b16-91a4-a59bf53cd5a7/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T02:17:39Z",
    "sequence": 1793413059629
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c6c2f0c2-8e12-4b16-91a4-a59bf53cd5a7",
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
  "last_heartbeat_at": "2026-10-31T02:17:39.645312Z",
  "last_location_at": "2026-10-31T02:17:39.645312Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e4e609a8-156c-4a08-aaf7-7636692364de",
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
  "id": "7a747829-d27f-476d-9030-374b66375723",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T02:22:39.846889Z",
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
  "command_id": "bf49b9ea-1e6f-4cb7-96b8-2c27da72a6a3",
  "quote_id": "7a747829-d27f-476d-9030-374b66375723",
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
  "id": "bfc3257f-230d-4a28-b5e2-81e6abdec12b",
  "short_number": 21,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "280a3e8a-4b03-42ae-870f-a43c7add31a8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T02:17:40.056894Z",
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
    "id": "25ccd76c-3810-49d1-878e-1ae4882456cd",
    "order_id": "bfc3257f-230d-4a28-b5e2-81e6abdec12b",
    "expires_at": "2026-10-31T02:17:55.059174Z",
    "server_time": "2026-10-31T02:17:40.292047544Z",
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
  "session_id": "c6c2f0c2-8e12-4b16-91a4-a59bf53cd5a7",
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
  "last_heartbeat_at": "2026-10-31T02:17:39.645312Z",
  "last_location_at": "2026-10-31T02:17:39.645312Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

Round 5, at the same moment:

`POST /api/driver/v1/offers/25ccd76c-3810-49d1-878e-1ae4882456cd/accept` → **200**

```json
{
  "id": "52af9f19-5243-4d39-9b48-be6f8ea225de",
  "order_id": "bfc3257f-230d-4a28-b5e2-81e6abdec12b",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "1952740a-48f2-48c5-8ccc-582da66e380b",
  "trip_phase": "TO_PICKUP"
}
```

`POST /api/driver/v1/work-sessions/c6c2f0c2-8e12-4b16-91a4-a59bf53cd5a7/pause` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c6c2f0c2-8e12-4b16-91a4-a59bf53cd5a7",
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
  "last_heartbeat_at": "2026-10-31T02:17:39.645312Z",
  "last_location_at": "2026-10-31T02:17:39.645312Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_PAUSE_AFTER_CURRENT",
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

Round 5: the accept won; the pause waits for the end of the trip.

`GET /api/operator/v1/orders/bfc3257f-230d-4a28-b5e2-81e6abdec12b` → **200**

```json
{
  "id": "bfc3257f-230d-4a28-b5e2-81e6abdec12b",
  "short_number": 21,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "280a3e8a-4b03-42ae-870f-a43c7add31a8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "52af9f19-5243-4d39-9b48-be6f8ea225de",
    "order_id": "bfc3257f-230d-4a28-b5e2-81e6abdec12b",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "1952740a-48f2-48c5-8ccc-582da66e380b",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-31T02:17:40.056894Z",
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

`GET /api/operator/v1/orders/bfc3257f-230d-4a28-b5e2-81e6abdec12b` → **200**

```json
{
  "id": "bfc3257f-230d-4a28-b5e2-81e6abdec12b",
  "short_number": 21,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "280a3e8a-4b03-42ae-870f-a43c7add31a8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "52af9f19-5243-4d39-9b48-be6f8ea225de",
    "order_id": "bfc3257f-230d-4a28-b5e2-81e6abdec12b",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "1952740a-48f2-48c5-8ccc-582da66e380b",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-31T02:17:40.056894Z",
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

`POST /api/operator/v1/orders/bfc3257f-230d-4a28-b5e2-81e6abdec12b/cancel` → **200**

```json
{
  "command_id": "37146d8f-9787-4712-8454-9f0677e950cb",
  "expected_version": 3,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "bfc3257f-230d-4a28-b5e2-81e6abdec12b",
  "short_number": 21,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "280a3e8a-4b03-42ae-870f-a43c7add31a8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "52af9f19-5243-4d39-9b48-be6f8ea225de",
    "order_id": "bfc3257f-230d-4a28-b5e2-81e6abdec12b",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "1952740a-48f2-48c5-8ccc-582da66e380b",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-31T02:17:40.056894Z",
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
  "session_id": "c6c2f0c2-8e12-4b16-91a4-a59bf53cd5a7",
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
  "last_heartbeat_at": "2026-10-31T02:17:39.645312Z",
  "last_location_at": "2026-10-31T02:17:39.645312Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/work-sessions/c6c2f0c2-8e12-4b16-91a4-a59bf53cd5a7/resume` → **200**

```json
{
  "command_id": "e2ed5429-592b-41a7-a50b-0e352c712cd6",
  "expected_version": 14
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c6c2f0c2-8e12-4b16-91a4-a59bf53cd5a7",
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
  "last_heartbeat_at": "2026-10-31T02:17:39.645312Z",
  "last_location_at": "2026-10-31T02:17:39.645312Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c6c2f0c2-8e12-4b16-91a4-a59bf53cd5a7/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 250,
    "recorded_at": "2026-10-31T02:17:41Z",
    "sequence": 1793413061696
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c6c2f0c2-8e12-4b16-91a4-a59bf53cd5a7",
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
  "last_heartbeat_at": "2026-10-31T02:17:41.711799Z",
  "last_location_at": "2026-10-31T02:17:41.711799Z",
  "eligible": false,
  "ineligible_reasons": [
    "LOCATION_INACCURATE"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/work-sessions/c6c2f0c2-8e12-4b16-91a4-a59bf53cd5a7/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T02:17:41Z",
    "sequence": 1793413061904
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c6c2f0c2-8e12-4b16-91a4-a59bf53cd5a7",
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
  "last_heartbeat_at": "2026-10-31T02:17:41.919432Z",
  "last_location_at": "2026-10-31T02:17:41.919432Z",
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
  "at": "2026-10-31T02:17:42.118953047Z",
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
      "last_location_at": "2026-10-31T02:17:41.919432Z",
      "last_heartbeat_at": "2026-10-31T02:17:41.919432Z",
      "order_id": null
    }
  ]
}
```

Done: E2, E5 (3/2), E4 and last_heartbeat_at 2026-10-31T02:17:41.919432Z.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c6c2f0c2-8e12-4b16-91a4-a59bf53cd5a7",
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
  "last_heartbeat_at": "2026-10-31T02:17:41.919432Z",
  "last_location_at": "2026-10-31T02:17:41.919432Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c6c2f0c2-8e12-4b16-91a4-a59bf53cd5a7/close` → **200**

```json
{
  "command_id": "d274a877-979c-4335-973a-cabccf6c2de7",
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
  "session_id": "310e417c-ae6a-4e7a-838a-ed8e4f223cdb",
  "subject": {
    "type": "STAFF",
    "id": "13536a6b-90d5-4717-bcad-60e066f5abae"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzUzNmE2Yi05MGQ1LTQ3MTctYmNhZC02MGUwNjZmNWFiYWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MTM5NjMsImlhdCI6MTc5MzQxMzA2MywianRpIjoiMTI0NDAxYjktYTVhMy00NzUyLWI3NDItMTliODIzYmQ4MTA1Iiwic2lkIjoiMzEwZTQxN2MtYWU2YS00ZTdhLTgzOGEtZWQ4ZTRmMjIzY2RiIn0.U3wuDZdez4tqTTFDVLYmQXl8dlU9nxnJW65JaQnCRYI",
  "access_expires_at": "2026-10-31T02:32:43.079474799Z",
  "refresh_token": "QmaPS0wi__OWebASDuQiBhj88Ksa3Szl0x1PuXaXgx8",
  "refresh_expires_at": "2026-10-31T14:17:43.079119381Z",
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
  "command_id": "f966662a-8374-4566-a79f-27c3c6b93c83",
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
  "changed_by": "13536a6b-90d5-4717-bcad-60e066f5abae",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-31T02:17:43.45665Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "4ff2dab1-dbde-4d8b-910c-a7ce246ad14b",
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
  "correlation_id": "7a440c00-3fbe-4f33-b2cb-bb95d73e6912",
  "current_version": 1
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "d7d6d386-5ca4-4ad2-bbd7-b4eb5efc0101",
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
  "correlation_id": "15055d19-8dbe-4864-8cbb-9512b0f29357"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638148902",
  "device_ref": "sandbox-11670"
}
```

```json
{
  "challenge_id": "b969594a-eed9-4781-a920-00c0ca868ad3",
  "expires_at": "2026-10-31T02:22:44.015652345Z",
  "resend_available_at": "2026-10-31T02:17:45.015652345Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638148902` → **200**

```json
{
  "phone": "+380638148902",
  "audience": "CLIENT",
  "code": "489276",
  "sent_at": "2026-10-31T02:17:44.017121805Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b969594a-eed9-4781-a920-00c0ca868ad3",
  "code": "489276",
  "device_ref": "sandbox-11670"
}
```

```json
{
  "session_id": "290f53da-e67f-4820-bcee-6f4d04c093d0",
  "subject": {
    "type": "CLIENT",
    "id": "3e944e31-e701-4e97-a152-f1fc63157f5d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzZTk0NGUzMS1lNzAxLTRlOTctYTE1Mi1mMWZjNjMxNTdmNWQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDEzOTY0LCJpYXQiOjE3OTM0MTMwNjQsImp0aSI6IjFmMjU1YmY5LWNiODQtNDU0OC05ZGFiLWFhZDVlZWYyM2RjNCIsInNpZCI6IjI5MGY1M2RhLWU2N2YtNDgyMC1iY2VlLTZmNGQwNGMwOTNkMCJ9.-5Q21AupqZzGwFyAACs1C3P0hos-o-Nu8BZCaV_ezHE",
  "access_expires_at": "2026-10-31T02:32:44.21918966Z",
  "refresh_token": "VbXa4OB6BgFr77p4GhwdXIma8v50R-iF29LZ0uFbmyU",
  "refresh_expires_at": "2026-11-30T02:17:44.218803495Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "deec7a6f-1b99-4ada-bc71-7b407627fc82",
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
  "id": "71c2c5c2-9a45-452d-b473-c2689c76f9eb",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T02:22:44.406720Z",
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
  "command_id": "c35d83c9-79fb-41ce-bdad-c770156fae58",
  "quote_id": "71c2c5c2-9a45-452d-b473-c2689c76f9eb",
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
  "correlation_id": "648b8b19-a426-407a-8721-c66789842442"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "a47152ef-05e7-4772-8b19-6290894643bc",
  "quote_id": "71c2c5c2-9a45-452d-b473-c2689c76f9eb",
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
  "id": "b9730f2e-7291-4846-9e8b-41e4dd451dfa",
  "short_number": 22,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3e944e31-e701-4e97-a152-f1fc63157f5d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-31T02:17:44.785635Z",
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

`POST /api/rider/v1/orders/b9730f2e-7291-4846-9e8b-41e4dd451dfa/cancel` → **200**

```json
{
  "command_id": "aa25cd9d-1343-4e4b-b777-5c45580f4223",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "b9730f2e-7291-4846-9e8b-41e4dd451dfa",
  "short_number": 22,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "3e944e31-e701-4e97-a152-f1fc63157f5d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T02:17:44.785635Z",
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
  "command_id": "ad8468a3-85e1-4362-904a-0cc5e756e455",
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
  "changed_by": "13536a6b-90d5-4717-bcad-60e066f5abae",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-31T02:17:45.194554Z"
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
      "changed_by": "13536a6b-90d5-4717-bcad-60e066f5abae",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-31T02:17:45.194554Z"
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
  "device_ref": "sandbox-13795"
}
```

```json
{
  "challenge_id": "90828fa9-4b00-4b03-8713-ae3c86eb0083",
  "expires_at": "2026-10-31T02:22:45.760676735Z",
  "resend_available_at": "2026-10-31T02:17:46.760676735Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "009830",
  "sent_at": "2026-10-31T02:17:45.762414776Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "90828fa9-4b00-4b03-8713-ae3c86eb0083",
  "code": "009830",
  "device_ref": "sandbox-13795"
}
```

```json
{
  "session_id": "60bba6c1-9ff8-47e0-b752-ccc07e6658b4",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQxMzk2NSwiaWF0IjoxNzkzNDEzMDY1LCJqdGkiOiJjN2E5N2U1OC1lYTJjLTQyYTMtOTBjNy0xOTgyYjc1MjQ4OGUiLCJzaWQiOiI2MGJiYTZjMS05ZmY4LTQ3ZTAtYjc1Mi1jY2MwN2U2NjU4YjQifQ.PlVauxxOXEiC2eEXUiEEEJ0XLkf_edZB01Bi8Ue6708",
  "access_expires_at": "2026-10-31T02:32:45.966350063Z",
  "refresh_token": "NvXZgZK8KsxOkBGU0iuL1zhZo9Icb1XGWvn9T5xYH5k",
  "refresh_expires_at": "2026-11-30T02:17:45.965846624Z",
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
  "command_id": "088b0ab3-defe-45e2-a3fa-f25c7b3efd81",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T02:17:46Z",
    "sequence": 1793413066351
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "88afc84a-3544-4223-a17d-fbdae5b929c2",
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
  "last_heartbeat_at": "2026-10-31T02:17:46.366049Z",
  "last_location_at": "2026-10-31T02:17:46.366049Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672835150",
  "device_ref": "sandbox-31538"
}
```

```json
{
  "challenge_id": "b1e769ae-ac7d-4c95-8b32-58df54e29745",
  "expires_at": "2026-10-31T02:22:46.549194422Z",
  "resend_available_at": "2026-10-31T02:17:47.549194422Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380672835150` → **200**

```json
{
  "phone": "+380672835150",
  "audience": "CLIENT",
  "code": "922712",
  "sent_at": "2026-10-31T02:17:46.550941696Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b1e769ae-ac7d-4c95-8b32-58df54e29745",
  "code": "922712",
  "device_ref": "sandbox-31538"
}
```

```json
{
  "session_id": "7e81e7a5-5e99-4694-b123-69f88a767e34",
  "subject": {
    "type": "CLIENT",
    "id": "ce337886-ad6b-4d5b-bdfd-61d47f011583"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZTMzNzg4Ni1hZDZiLTRkNWItYmRmZC02MWQ0N2YwMTE1ODMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDEzOTY2LCJpYXQiOjE3OTM0MTMwNjYsImp0aSI6ImFjZjJkNDRhLTFhMTYtNDM5MC04YjcxLTBiNWZiZTFhMzQ3MSIsInNpZCI6IjdlODFlN2E1LTVlOTktNDY5NC1iMTIzLTY5Zjg4YTc2N2UzNCJ9.0c8TB4lusgw2LoPtoqOR6_N-kTjC6og4pRqdN0obo0E",
  "access_expires_at": "2026-10-31T02:32:46.752043869Z",
  "refresh_token": "_C_l0KJ69fVleEiml3Poiq-AJGENCY2Ee8eIb7C-HFs",
  "refresh_expires_at": "2026-11-30T02:17:46.75172817Z",
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
  "command_id": "c89e3c01-3562-4b64-91b7-290e0b23492b",
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
  "id": "ffc0fd24-72c8-4aaf-a58d-8d39b0ec0bd8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T02:22:47.115170Z",
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
  "command_id": "d4698b03-96cf-4780-b9f4-ceb3c79536a1",
  "platform": "ANDROID",
  "token": "sandbox-driver-8cb8ae4b-9b4c-4332-9398-6404cf607585"
}
```

```json
{
  "id": "be7d8972-28e5-4ec5-9b95-f9b27697891d",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-31T02:17:47.312903Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "86aa364a-b88d-4b8f-a699-4234de5ecd2c",
  "platform": "ANDROID",
  "token": "sandbox-rider-59567c92-8bb4-4d15-93bb-c02cf91a3349"
}
```

```json
{
  "id": "eb2210bc-8930-4d81-9cb3-b32ee8e8d774",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-31T02:17:47.500578Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "9c7d662e-fbf8-49d4-8149-43ca00c96949",
  "quote_id": "ffc0fd24-72c8-4aaf-a58d-8d39b0ec0bd8",
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
  "id": "45e75069-3117-4348-9ac9-dca0c26eb63d",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ce337886-ad6b-4d5b-bdfd-61d47f011583",
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
  "created_at": "2026-10-31T02:17:47.688873Z",
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

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-31T02:17:47.671Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-31T02:17:47.671Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-31T02:17:47.671Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-31T02:17:47.671Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-31T02:17:47.671Z` → **200**

```json
[
  {
    "at": "2026-10-31T02:17:51.02147198Z",
    "token_suffix": "607585",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "type": "driver.offer",
      "event_type": "OfferMade",
      "order_id": "45e75069-3117-4348-9ac9-dca0c26eb63d",
      "event_id": "7d0082f0-10f3-4614-bf15-7eb6aaa6357d",
      "order_version": "2",
      "offer_id": "f9d57cd5-e906-42f5-9bd0-0721a1b3584c"
    }
  }
]
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "f9d57cd5-e906-42f5-9bd0-0721a1b3584c",
    "order_id": "45e75069-3117-4348-9ac9-dca0c26eb63d",
    "expires_at": "2026-10-31T02:18:02.690727Z",
    "server_time": "2026-10-31T02:17:52.001506985Z",
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

`POST /api/driver/v1/offers/f9d57cd5-e906-42f5-9bd0-0721a1b3584c/accept` → **200**

```json
{
  "command_id": "e4fbce05-4215-4338-bf31-bf7525840410"
}
```

```json
{
  "id": "b2592f67-c2f0-48db-822d-d774e7311dad",
  "order_id": "45e75069-3117-4348-9ac9-dca0c26eb63d",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d203e4c8-c02f-424a-a68a-b16a52304b4f",
  "trip_phase": "TO_PICKUP"
}
```

## The rider's phone gets "driver assigned"

`GET /sandbox/v1/pushes?phone=%2B380672835150&after=2026-10-31T02:17:47.671Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380672835150&after=2026-10-31T02:17:47.671Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380672835150&after=2026-10-31T02:17:47.671Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380672835150&after=2026-10-31T02:17:47.671Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380672835150&after=2026-10-31T02:17:47.671Z` → **200**

```json
[
  {
    "at": "2026-10-31T02:17:56.028534038Z",
    "token_suffix": "1a3349",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "type": "rider.driver-assigned",
      "event_type": "AssignmentCommitted",
      "order_id": "45e75069-3117-4348-9ac9-dca0c26eb63d",
      "event_id": "9557a82a-3812-449a-a226-ed8a195ea185",
      "order_version": "3",
      "assignment_id": "b2592f67-c2f0-48db-822d-d774e7311dad"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/45e75069-3117-4348-9ac9-dca0c26eb63d/messages` → **201**

```json
{
  "command_id": "dac93282-e42f-44f7-8601-782417423a16",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "df46b018-a963-4514-b547-78dcd8d9c777",
  "order_id": "45e75069-3117-4348-9ac9-dca0c26eb63d",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-31T02:17:56.469789632Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d203e4c8-c02f-424a-a68a-b16a52304b4f",
  "order_id": "45e75069-3117-4348-9ac9-dca0c26eb63d",
  "assignment_id": "b2592f67-c2f0-48db-822d-d774e7311dad",
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
  "entrance": null,
  "contact_attempts": []
}
```

`POST /api/driver/v1/trips/d203e4c8-c02f-424a-a68a-b16a52304b4f/messages` → **201**

```json
{
  "command_id": "e3e48e3e-f606-4ea1-b432-3a0e25eb8232",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "216d3c55-c67c-4ff5-b329-20b7e63d5dce",
  "order_id": "45e75069-3117-4348-9ac9-dca0c26eb63d",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-31T02:17:56.884597321Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/45e75069-3117-4348-9ac9-dca0c26eb63d/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/d203e4c8-c02f-424a-a68a-b16a52304b4f/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380672835150"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/88afc84a-3544-4223-a17d-fbdae5b929c2/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T02:17:57Z",
    "sequence": 1793413077446
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "88afc84a-3544-4223-a17d-fbdae5b929c2",
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
  "last_heartbeat_at": "2026-10-31T02:17:57.461127Z",
  "last_location_at": "2026-10-31T02:17:57.461127Z",
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
  "id": "d203e4c8-c02f-424a-a68a-b16a52304b4f",
  "order_id": "45e75069-3117-4348-9ac9-dca0c26eb63d",
  "assignment_id": "b2592f67-c2f0-48db-822d-d774e7311dad",
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
  "entrance": null,
  "contact_attempts": [
    {
      "kind": "MESSAGE",
      "at": "2026-10-31T02:17:56.884597Z"
    },
    {
      "kind": "CALL",
      "at": "2026-10-31T02:17:57.249098Z"
    }
  ]
}
```

`POST /api/driver/v1/trips/d203e4c8-c02f-424a-a68a-b16a52304b4f/arrive` → **200**

```json
{
  "command_id": "944904a2-9476-4af2-b398-67683ba2d13b",
  "expected_version": 0
}
```

```json
{
  "id": "d203e4c8-c02f-424a-a68a-b16a52304b4f",
  "order_id": "45e75069-3117-4348-9ac9-dca0c26eb63d",
  "assignment_id": "b2592f67-c2f0-48db-822d-d774e7311dad",
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
  "arrived_at": "2026-10-31T02:17:57.845427Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null,
  "comment": null,
  "entrance": null,
  "contact_attempts": [
    {
      "kind": "MESSAGE",
      "at": "2026-10-31T02:17:56.884597Z"
    },
    {
      "kind": "CALL",
      "at": "2026-10-31T02:17:57.249098Z"
    }
  ]
}
```

`POST /api/driver/v1/trips/d203e4c8-c02f-424a-a68a-b16a52304b4f/start` → **200**

```json
{
  "command_id": "d499447f-d40e-46a5-bff1-f9e0c9cbce88",
  "expected_version": 1
}
```

```json
{
  "id": "d203e4c8-c02f-424a-a68a-b16a52304b4f",
  "order_id": "45e75069-3117-4348-9ac9-dca0c26eb63d",
  "assignment_id": "b2592f67-c2f0-48db-822d-d774e7311dad",
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
  "arrived_at": "2026-10-31T02:17:57.845427Z",
  "started_at": "2026-10-31T02:17:58.041648Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null,
  "comment": null,
  "entrance": null,
  "contact_attempts": [
    {
      "kind": "MESSAGE",
      "at": "2026-10-31T02:17:56.884597Z"
    },
    {
      "kind": "CALL",
      "at": "2026-10-31T02:17:57.249098Z"
    }
  ]
}
```

(the car drives 48 s to the next point)

`POST /api/driver/v1/work-sessions/88afc84a-3544-4223-a17d-fbdae5b929c2/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T02:18:46Z",
    "sequence": 1793413126249
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "88afc84a-3544-4223-a17d-fbdae5b929c2",
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
  "last_heartbeat_at": "2026-10-31T02:18:46.263504Z",
  "last_location_at": "2026-10-31T02:18:46.263504Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/d203e4c8-c02f-424a-a68a-b16a52304b4f/complete` → **200**

```json
{
  "command_id": "feb1d835-3290-48a1-ba18-e821ab307c6a",
  "expected_version": 2,
  "reported_at": "2026-10-31T02:18:46Z",
  "cash_received": true
}
```

```json
{
  "id": "d203e4c8-c02f-424a-a68a-b16a52304b4f",
  "order_id": "45e75069-3117-4348-9ac9-dca0c26eb63d",
  "assignment_id": "b2592f67-c2f0-48db-822d-d774e7311dad",
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
  "arrived_at": "2026-10-31T02:17:57.845427Z",
  "started_at": "2026-10-31T02:17:58.041648Z",
  "completed_at": "2026-10-31T02:18:46.452939Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null,
  "comment": null,
  "entrance": null,
  "contact_attempts": [
    {
      "kind": "MESSAGE",
      "at": "2026-10-31T02:17:56.884597Z"
    },
    {
      "kind": "CALL",
      "at": "2026-10-31T02:17:57.249098Z"
    }
  ]
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/45e75069-3117-4348-9ac9-dca0c26eb63d` → **200**

```json
{
  "id": "45e75069-3117-4348-9ac9-dca0c26eb63d",
  "short_number": 23,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "ce337886-ad6b-4d5b-bdfd-61d47f011583",
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
    "id": "b2592f67-c2f0-48db-822d-d774e7311dad",
    "order_id": "45e75069-3117-4348-9ac9-dca0c26eb63d",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "d203e4c8-c02f-424a-a68a-b16a52304b4f",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-31T02:17:47.688873Z",
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
      "id": "45e75069-3117-4348-9ac9-dca0c26eb63d",
      "short_number": 23,
      "status": "FULFILLED",
      "created_at": "2026-10-31T02:17:47.688873Z",
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
      "id": "d203e4c8-c02f-424a-a68a-b16a52304b4f",
      "order_id": "45e75069-3117-4348-9ac9-dca0c26eb63d",
      "order_short_number": 23,
      "created_at": "2026-10-31T02:17:52.186426Z",
      "pickup_label": "Майдан Незалежності",
      "dropoff_label": "Залізничний вокзал",
      "final_price_minor": 10517,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "COMPLETED"
    },
    {
      "id": "1952740a-48f2-48c5-8ccc-582da66e380b",
      "order_id": "bfc3257f-230d-4a28-b5e2-81e6abdec12b",
      "order_short_number": 21,
      "created_at": "2026-10-31T02:17:40.667024Z",
      "pickup_label": "Майдан",
      "dropoff_label": "Вокзал",
      "final_price_minor": null,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "ABORTED"
    },
    {
      "id": "26549d5c-9521-43b3-86cc-78bd4ae455ff",
      "order_id": "dd5953f9-cdf4-48f2-9691-f98712306277",
      "order_short_number": 19,
      "created_at": "2026-10-31T02:17:36.604369Z",
      "pickup_label": "Майдан",
      "dropoff_label": "Вокзал",
      "final_price_minor": null,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "ABORTED"
    },
    {
      "id": "249cc01b-acc3-4f33-88fc-1b415d6ab05d",
      "order_id": "68e5fa98-6598-45b8-a700-4f3e2a5311f2",
      "order_short_number": 18,
      "created_at": "2026-10-31T02:17:34.629632Z",
      "pickup_label": "Майдан",
      "dropoff_label": "Вокзал",
      "final_price_minor": null,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "ABORTED"
    },
    {
      "id": "00d52858-39d9-4f97-ba1e-f71701819835",
      "order_id": "485c8b2e-eab3-4714-9053-caf2a5948165",
      "order_short_number": 10,
      "created_at": "2026-10-31T02:11:51.685602Z",
      "pickup_label": "Майдан",
      "dropoff_label": "Вокзал",
      "final_price_minor": 10517,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "COMPLETED"
    },
    {
      "id": "025db0e2-d28e-4c59-847c-e631458e7805",
      "order_id": "ee122afb-ebea-474a-8f04-a4b3eae0ddbe",
      "order_short_number": 5,
      "created_at": "2026-10-31T02:10:24.583432Z",
      "pickup_label": "Майдан",
      "dropoff_label": "Вокзал",
      "final_price_minor": 10517,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "COMPLETED"
    },
    {
      "id": "a6322261-8142-45d4-aefe-c30e9ff65073",
      "order_id": "d05897fa-daa2-4e73-9736-d04afe0d3876",
      "order_short_number": 3,
      "created_at": "2026-10-31T02:06:38.931778Z",
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

`GET /api/rider/v1/orders/45e75069-3117-4348-9ac9-dca0c26eb63d/tip` → **200**

```json
{
  "order_id": "45e75069-3117-4348-9ac9-dca0c26eb63d",
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
  "available_until": "2026-11-01T02:18:46.452939Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/45e75069-3117-4348-9ac9-dca0c26eb63d/tip` → **201**

```json
{
  "command_id": "5a99f39b-a6c0-46b2-bc2b-202e454c025e",
  "amount_minor": 1100
}
```

```json
{
  "id": "4b7205c0-857a-477f-aafc-cd15fd62701f",
  "order_id": "45e75069-3117-4348-9ac9-dca0c26eb63d",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-31T02:18:50.800987Z"
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
  "session_id": "3734892f-b05f-4155-83b1-469c363bab9b",
  "subject": {
    "type": "STAFF",
    "id": "13536a6b-90d5-4717-bcad-60e066f5abae"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzUzNmE2Yi05MGQ1LTQ3MTctYmNhZC02MGUwNjZmNWFiYWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MTQwMzEsImlhdCI6MTc5MzQxMzEzMSwianRpIjoiYTFmOGUxYzUtZmFkMS00YTFhLWJjYzItYWQyNzZjZTM3YzJmIiwic2lkIjoiMzczNDg5MmYtYjA1Zi00MTU1LTgzYjEtNDY5YzM2M2JhYjliIn0.v93Svw4MUu-ScHM79_jzj-9XzeHf4kKwzYfQjdu_8xc",
  "access_expires_at": "2026-10-31T02:33:51.196949661Z",
  "refresh_token": "KOVVEch48qWzVt5lFCmdl6PT9-AFwxIC31yiCzG7l_Q",
  "refresh_expires_at": "2026-10-31T14:18:51.196428881Z",
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
          "PHONE": 1,
          "APP": 21
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
      "PHONE": 1,
      "APP": 21
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
  "generated_at": "2026-10-31T02:18:51.384283468Z"
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
  "generated_at": "2026-10-31T02:18:51.577900704Z"
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
  "session_id": "f4d3061e-4982-4b7b-8ce4-91e8845627be",
  "subject": {
    "type": "STAFF",
    "id": "13536a6b-90d5-4717-bcad-60e066f5abae"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzUzNmE2Yi05MGQ1LTQ3MTctYmNhZC02MGUwNjZmNWFiYWUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MTQwMzEsImlhdCI6MTc5MzQxMzEzMSwianRpIjoiODAwODdkOWUtMmFlZi00OTYwLWE0MjMtMzM1Mjk5ODY3NDJkIiwic2lkIjoiZjRkMzA2MWUtNDk4Mi00YjdiLThjZTQtOTFlODg0NTYyN2JlIn0.zVhaumJ-D700Uk0umUXF5taUYhXDhwXBQGc0FtiTiNM",
  "access_expires_at": "2026-10-31T02:33:51.972043284Z",
  "refresh_token": "JC_fnv9heI5NhImHP7-37AqED4kfVaK1PhR3U-mMtYk",
  "refresh_expires_at": "2026-10-31T14:18:51.971645243Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/45e75069-3117-4348-9ac9-dca0c26eb63d/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-31T02:17:47.689212Z",
      "actor": {
        "type": "CLIENT",
        "id": "ce337886-ad6b-4d5b-bdfd-61d47f011583",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "45e75069-3117-4348-9ac9-dca0c26eb63d",
        "quote_id": "ffc0fd24-72c8-4aaf-a58d-8d39b0ec0bd8",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "d2719f92-7429-41cd-9ebb-5f79e6cd710c"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-31T02:17:47.690362Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "45e75069-3117-4348-9ac9-dca0c26eb63d",
        "attempt_id": "7a0ea43d-2872-42ef-8f13-cbf51daa80e7",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "d2719f92-7429-41cd-9ebb-5f79e6cd710c"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-31T02:17:47.692408Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "source": "AUTO",
        "offer_id": "f9d57cd5-e906-42f5-9bd0-0721a1b3584c",
        "order_id": "45e75069-3117-4348-9ac9-dca0c26eb63d",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44,
        "expires_at": "2026-10-31T02:18:02.690727495Z"
      },
      "correlation_id": "d2719f92-7429-41cd-9ebb-5f79e6cd710c"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-31T02:17:52.187617Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "f9d57cd5-e906-42f5-9bd0-0721a1b3584c",
        "order_id": "45e75069-3117-4348-9ac9-dca0c26eb63d",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "b2592f67-c2f0-48db-822d-d774e7311dad"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-31T02:18:52.345887054Z",
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
      "last_location_at": "2026-10-31T02:18:46.263504Z",
      "last_heartbeat_at": "2026-10-31T02:18:46.263504Z",
      "order_id": null
    }
  ]
}
```

Done: order 45e75069-3117-4348-9ac9-dca0c26eb63d.

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
  "session_id": "ca74f5ef-63bb-47af-bb3b-59e33b5ced76",
  "subject": {
    "type": "STAFF",
    "id": "13536a6b-90d5-4717-bcad-60e066f5abae"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzUzNmE2Yi05MGQ1LTQ3MTctYmNhZC02MGUwNjZmNWFiYWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MTQwMzIsImlhdCI6MTc5MzQxMzEzMiwianRpIjoiZTk0YjZlYjEtMWVlMi00OGYyLThiMjgtNzA1Mjk4MzJlOGViIiwic2lkIjoiY2E3NGY1ZWYtNjNiYi00N2FmLWJiM2ItNTllMzNiNWNlZDc2In0.lE7KqYKDJA54hujHUGgQ-zzX8OmxEHCEqL_mOZIe6oQ",
  "access_expires_at": "2026-10-31T02:33:52.756350338Z",
  "refresh_token": "e96t-gspvLdvdpUIEgQFSrShHp05Ye-yxCMpdxg8d_8",
  "refresh_expires_at": "2026-10-31T14:18:52.755985506Z",
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
  "command_id": "0f4c61e6-dcca-4aa9-8637-d874c7ba326a",
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
  "timestamp": "2026-10-31T02:18:53.000+0000",
  "channel": {
    "id": "1730052000.1746329560",
    "linkedid": "1730052000.1746329560",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380678688166"
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
  "timestamp": "2026-10-31T02:18:53.000+0000",
  "channel": {
    "id": "1730052000.1746329560",
    "linkedid": "1730052000.1746329560",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380678688166"
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
  "session_id": "18cd3362-3638-48b5-9069-ca32bcdbae99",
  "subject": {
    "type": "STAFF",
    "id": "13536a6b-90d5-4717-bcad-60e066f5abae"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzUzNmE2Yi05MGQ1LTQ3MTctYmNhZC02MGUwNjZmNWFiYWUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MTQwMzMsImlhdCI6MTc5MzQxMzEzMywianRpIjoiMTQ1YWE4Y2QtMzgzYy00OTJkLTllZGEtMTA1NDA5NDc3ZWMzIiwic2lkIjoiMThjZDMzNjItMzYzOC00OGI1LTkwNjktY2EzMmJjZGJhZTk5In0.QNPbTCYjT-JrBOaZftOuxw_v9xz1PSi30_Qz9FSRQeo",
  "access_expires_at": "2026-10-31T02:33:53.546856375Z",
  "refresh_token": "sQKzGBICRG0sMnkLc0j2wB45xHglQOOR2oG5tWXkE5I",
  "refresh_expires_at": "2026-10-31T14:18:53.546491342Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "09ab53e4-8319-462f-abea-cb363d0cd612",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380678688166",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-31T02:18:53Z",
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

`POST /api/operator/v1/calls/09ab53e4-8319-462f-abea-cb363d0cd612/answer` → **200**

```json
{
  "command_id": "96f88f90-6408-4370-9e8b-a7a3123eaa34"
}
```

```json
{
  "id": "09ab53e4-8319-462f-abea-cb363d0cd612",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380678688166",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "13536a6b-90d5-4717-bcad-60e066f5abae",
  "order_ids": [],
  "started_at": "2026-10-31T02:18:53Z",
  "answered_at": "2026-10-31T02:18:53.93114Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.1746329560",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "aeed6262-8ba2-4476-91b6-d85f46ddacb8",
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
  "id": "d6978834-0db7-4dec-8661-6c3d5dce3a02",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T02:23:54.147578Z",
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
  "command_id": "919a60a7-572b-4a88-97f2-71859c2fb7b5",
  "quote_id": "d6978834-0db7-4dec-8661-6c3d5dce3a02",
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
    "phone": "+380678688166"
  },
  "call_id": "09ab53e4-8319-462f-abea-cb363d0cd612"
}
```

```json
{
  "id": "28e52d61-72b5-422f-9088-a8f2c8414499",
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
  "created_at": "2026-10-31T02:18:54.403101Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678688166"
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
    "id": "1730052000.1746329560",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "09ab53e4-8319-462f-abea-cb363d0cd612",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380678688166",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "13536a6b-90d5-4717-bcad-60e066f5abae",
      "order_ids": [
        "28e52d61-72b5-422f-9088-a8f2c8414499"
      ],
      "started_at": "2026-10-31T02:18:53Z",
      "answered_at": "2026-10-31T02:18:53.93114Z",
      "ended_at": "2026-10-31T02:18:54.638971Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "8e8c0c77-a4d8-4aa6-bb77-2f67e16798fb",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672629809",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "13536a6b-90d5-4717-bcad-60e066f5abae",
      "order_ids": [],
      "started_at": "2026-10-31T02:10:12.884354Z",
      "answered_at": "2026-10-31T02:10:13.097753Z",
      "ended_at": "2026-10-31T02:10:13.311126Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-31T02:10:20.2126Z"
      }
    }
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
```

`GET /api/operator/v1/orders/28e52d61-72b5-422f-9088-a8f2c8414499` → **200**

```json
{
  "id": "28e52d61-72b5-422f-9088-a8f2c8414499",
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
  "created_at": "2026-10-31T02:18:54.403101Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678688166"
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

`GET /api/operator/v1/orders/28e52d61-72b5-422f-9088-a8f2c8414499` → **200**

```json
{
  "id": "28e52d61-72b5-422f-9088-a8f2c8414499",
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
  "created_at": "2026-10-31T02:18:54.403101Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678688166"
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

`POST /api/operator/v1/orders/28e52d61-72b5-422f-9088-a8f2c8414499/cancel` → **200**

```json
{
  "command_id": "91abf5d3-40b0-48c6-93ae-ddda7b574523",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "28e52d61-72b5-422f-9088-a8f2c8414499",
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
  "created_at": "2026-10-31T02:18:54.403101Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678688166"
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
  "related_order_id": null,
  "driver": null,
  "driver_change": null,
  "comment": null,
  "entrance": null
}
```

Done: call 09ab53e4-8319-462f-abea-cb363d0cd612 with order 28e52d61-72b5-422f-9088-a8f2c8414499.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-19087"
}
```

```json
{
  "challenge_id": "854dd5a5-fb3f-464f-8be4-2b0c8d573a26",
  "expires_at": "2026-10-31T02:23:55.46799541Z",
  "resend_available_at": "2026-10-31T02:18:56.46799541Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "450459",
  "sent_at": "2026-10-31T02:18:55.469820865Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "854dd5a5-fb3f-464f-8be4-2b0c8d573a26",
  "code": "450459",
  "device_ref": "sandbox-19087"
}
```

```json
{
  "session_id": "79e3cbe6-3610-4c38-a9ca-7fdffadacc7d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQxNDAzNSwiaWF0IjoxNzkzNDEzMTM1LCJqdGkiOiI2ZTdjYmI0Yi03MWY2LTRmMzUtYTJiMy01OTdjZmRiNjg4ZTEiLCJzaWQiOiI3OWUzY2JlNi0zNjEwLTRjMzgtYTljYS03ZmRmZmFkYWNjN2QifQ.b46U7MS_q8K8ouN1xYQkNNt9Z10ZziUlekiKzIwPw4k",
  "access_expires_at": "2026-10-31T02:33:55.690442027Z",
  "refresh_token": "JVpRBMZcN48wK0HHZWJR1bvQCY0PJZlCMq20rBpIlOg",
  "refresh_expires_at": "2026-11-30T02:18:55.690074691Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "88afc84a-3544-4223-a17d-fbdae5b929c2",
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
  "last_heartbeat_at": "2026-10-31T02:18:46.263504Z",
  "last_location_at": "2026-10-31T02:18:46.263504Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/88afc84a-3544-4223-a17d-fbdae5b929c2/handover` → **200**

```json
{
  "command_id": "4220ed62-8528-48a7-8af1-b1c40029b0da",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "88afc84a-3544-4223-a17d-fbdae5b929c2",
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
  "last_heartbeat_at": "2026-10-31T02:18:46.263504Z",
  "last_location_at": "2026-10-31T02:18:46.263504Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

(the car drives 89 s to the next point)

`POST /api/driver/v1/work-sessions/88afc84a-3544-4223-a17d-fbdae5b929c2/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T02:20:25Z",
    "sequence": 1793413225264
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "88afc84a-3544-4223-a17d-fbdae5b929c2",
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
  "last_heartbeat_at": "2026-10-31T02:20:25.278726Z",
  "last_location_at": "2026-10-31T02:20:25.278726Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380666225694",
  "device_ref": "sandbox-24300"
}
```

```json
{
  "challenge_id": "89d4cea2-7140-4c2d-8ae4-3ea0e7d067a1",
  "expires_at": "2026-10-31T02:25:25.46918306Z",
  "resend_available_at": "2026-10-31T02:20:26.46918306Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380666225694` → **200**

```json
{
  "phone": "+380666225694",
  "audience": "CLIENT",
  "code": "185878",
  "sent_at": "2026-10-31T02:20:25.471305074Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "89d4cea2-7140-4c2d-8ae4-3ea0e7d067a1",
  "code": "185878",
  "device_ref": "sandbox-24300"
}
```

```json
{
  "session_id": "6fb78239-4ae9-4796-8b73-fd338f27d8f9",
  "subject": {
    "type": "CLIENT",
    "id": "00a0147d-c63c-4dae-95e8-e06bff45f584"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMGEwMTQ3ZC1jNjNjLTRkYWUtOTVlOC1lMDZiZmY0NWY1ODQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDE0MTI1LCJpYXQiOjE3OTM0MTMyMjUsImp0aSI6IjllMWUwNGY3LTUxM2MtNDMyZi04MGJjLWRkM2EwYTAyZWFiOSIsInNpZCI6IjZmYjc4MjM5LTRhZTktNDc5Ni04YjczLWZkMzM4ZjI3ZDhmOSJ9.iUvWZve8grWDwZmDot0f_N-JrRw7I2coo75CxH1gBsc",
  "access_expires_at": "2026-10-31T02:35:25.68180734Z",
  "refresh_token": "TEbwI1oqZjFVC7KhhANSYu79hnq9d_RmnmKXs_sAK1s",
  "refresh_expires_at": "2026-11-30T02:20:25.681425903Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "173c5d9b-4415-4fd7-bd7e-d373dad0c05e",
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
  "id": "364a12ca-4f1d-47f6-a7fe-5dd38292818a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T02:25:25.876515Z",
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
  "command_id": "59c1a133-b352-4113-8964-329585a6d7f3",
  "quote_id": "364a12ca-4f1d-47f6-a7fe-5dd38292818a",
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
  "id": "404832f2-4e08-4061-98c8-e069c820394c",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "00a0147d-c63c-4dae-95e8-e06bff45f584",
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
  "created_at": "2026-10-31T02:20:26.098323Z",
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
    "id": "bb0c4f0f-f94b-4704-a788-479474fe02bb",
    "order_id": "404832f2-4e08-4061-98c8-e069c820394c",
    "expires_at": "2026-10-31T02:20:41.1005Z",
    "server_time": "2026-10-31T02:20:26.337188274Z",
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

`POST /api/driver/v1/offers/bb0c4f0f-f94b-4704-a788-479474fe02bb/accept` → **200**

```json
{
  "command_id": "4487ea61-dd5f-4489-9cf3-ecfaa75f3dc5"
}
```

```json
{
  "id": "73889563-3980-4781-a78a-d5d449fdaaf4",
  "order_id": "404832f2-4e08-4061-98c8-e069c820394c",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "43bab937-4034-4ba0-bbf0-11ec36159000",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "43bab937-4034-4ba0-bbf0-11ec36159000",
  "order_id": "404832f2-4e08-4061-98c8-e069c820394c",
  "assignment_id": "73889563-3980-4781-a78a-d5d449fdaaf4",
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
  "entrance": null,
  "contact_attempts": []
}
```

(the car drives 1 s to the next point)

`POST /api/driver/v1/work-sessions/88afc84a-3544-4223-a17d-fbdae5b929c2/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T02:20:27Z",
    "sequence": 1793413227915
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "88afc84a-3544-4223-a17d-fbdae5b929c2",
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
  "last_heartbeat_at": "2026-10-31T02:20:27.929233Z",
  "last_location_at": "2026-10-31T02:20:27.929233Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/43bab937-4034-4ba0-bbf0-11ec36159000/arrive` → **200**

```json
{
  "command_id": "f4ba78e8-3979-4768-bafa-f7d38f8f1c48",
  "expected_version": 0
}
```

```json
{
  "id": "43bab937-4034-4ba0-bbf0-11ec36159000",
  "order_id": "404832f2-4e08-4061-98c8-e069c820394c",
  "assignment_id": "73889563-3980-4781-a78a-d5d449fdaaf4",
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
  "arrived_at": "2026-10-31T02:20:28.123748Z",
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

`POST /api/driver/v1/trips/43bab937-4034-4ba0-bbf0-11ec36159000/start` → **200**

```json
{
  "command_id": "943e1cdc-f574-4768-9afd-db971a9be305",
  "expected_version": 1
}
```

```json
{
  "id": "43bab937-4034-4ba0-bbf0-11ec36159000",
  "order_id": "404832f2-4e08-4061-98c8-e069c820394c",
  "assignment_id": "73889563-3980-4781-a78a-d5d449fdaaf4",
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
  "arrived_at": "2026-10-31T02:20:28.123748Z",
  "started_at": "2026-10-31T02:20:28.319984Z",
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

## The car breaks down halfway; Oleh is free nearby

(the car drives 59 s to the next point)

`POST /api/driver/v1/work-sessions/88afc84a-3544-4223-a17d-fbdae5b929c2/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T02:21:27Z",
    "sequence": 1793413287531
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "88afc84a-3544-4223-a17d-fbdae5b929c2",
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
  "last_heartbeat_at": "2026-10-31T02:21:27.546964Z",
  "last_location_at": "2026-10-31T02:21:27.546964Z",
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
  "device_ref": "sandbox-28151"
}
```

```json
{
  "challenge_id": "8c8b54a6-daa6-41c6-8d13-76a32336f4af",
  "expires_at": "2026-10-31T02:26:27.735785423Z",
  "resend_available_at": "2026-10-31T02:21:28.735785423Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "646629",
  "sent_at": "2026-10-31T02:21:27.738145682Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8c8b54a6-daa6-41c6-8d13-76a32336f4af",
  "code": "646629",
  "device_ref": "sandbox-28151"
}
```

```json
{
  "session_id": "9ec9d18a-6703-4ad2-a425-54627dcd3ef9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQxNDE4NywiaWF0IjoxNzkzNDEzMjg3LCJqdGkiOiJjNGI1MDg0MC04MWUwLTQ2N2UtYTQwNy1kNWRmZTU4YzNkMGEiLCJzaWQiOiI5ZWM5ZDE4YS02NzAzLTRhZDItYTQyNS01NDYyN2RjZDNlZjkifQ.-IULiGVrz3NXliULYFhzcTvLoHvogi7OXT155TK4qPE",
  "access_expires_at": "2026-10-31T02:36:27.952069196Z",
  "refresh_token": "VPWLupwRT6ooK3X9Oi8DHdKtomPQR5PhYj9meitbWzI",
  "refresh_expires_at": "2026-11-30T02:21:27.951686752Z",
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
  "command_id": "48e07b9d-577f-4c06-a23d-e34df1d1c628",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T02:21:28Z",
    "sequence": 1793413288351
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "9952f269-e27f-4550-940b-72ca74a9f3d4",
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
  "last_heartbeat_at": "2026-10-31T02:21:28.365254Z",
  "last_location_at": "2026-10-31T02:21:28.365254Z",
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
  "session_id": "b4d3040c-04cf-4820-bb4b-db537433da97",
  "subject": {
    "type": "STAFF",
    "id": "13536a6b-90d5-4717-bcad-60e066f5abae"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzUzNmE2Yi05MGQ1LTQ3MTctYmNhZC02MGUwNjZmNWFiYWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MTQxODgsImlhdCI6MTc5MzQxMzI4OCwianRpIjoiMzVmZWJlYWUtOTBjOC00ZDgxLThiZDgtZDRmODgyMWI4YjFlIiwic2lkIjoiYjRkMzA0MGMtMDRjZi00ODIwLWJiNGItZGI1Mzc0MzNkYTk3In0.Nmoi9WVOJmZy1PJIJr2ELnaQUn3z9FlMzkwy3HvqmTA",
  "access_expires_at": "2026-10-31T02:36:28.755034313Z",
  "refresh_token": "jXxGL607Q5FG4NIvjw-biA6aQ8fWkucyFwqrd9HHXdo",
  "refresh_expires_at": "2026-10-31T14:21:28.754689851Z",
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
  "session_id": "889fb1d5-4374-40a2-a57d-8cdbcd29d87d",
  "subject": {
    "type": "STAFF",
    "id": "13536a6b-90d5-4717-bcad-60e066f5abae"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzUzNmE2Yi05MGQ1LTQ3MTctYmNhZC02MGUwNjZmNWFiYWUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MTQxODksImlhdCI6MTc5MzQxMzI4OSwianRpIjoiMjJhMTFmNGMtNjE0OS00ZTAwLTk0YTUtOTRjZjkyMjk1ZWZhIiwic2lkIjoiODg5ZmIxZDUtNDM3NC00MGEyLWE1N2QtOGNkYmNkMjlkODdkIn0.EVJ2IjSFOzbWe_f99LszP3CtLY7BBSmIS0JGhLlLzJQ",
  "access_expires_at": "2026-10-31T02:36:29.149538473Z",
  "refresh_token": "RhX9dXALSTgHyu7vCbEoSeyw0rZWAimsZn-rGWqFCj8",
  "refresh_expires_at": "2026-10-31T14:21:29.149167416Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/404832f2-4e08-4061-98c8-e069c820394c` → **200**

```json
{
  "id": "404832f2-4e08-4061-98c8-e069c820394c",
  "short_number": 25,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "00a0147d-c63c-4dae-95e8-e06bff45f584",
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
    "id": "73889563-3980-4781-a78a-d5d449fdaaf4",
    "order_id": "404832f2-4e08-4061-98c8-e069c820394c",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "43bab937-4034-4ba0-bbf0-11ec36159000",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-31T02:20:26.098323Z",
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

`POST /api/operator/v1/orders/404832f2-4e08-4061-98c8-e069c820394c/interrupt` → **200**

```json
{
  "command_id": "0b67a81b-6fed-4b25-ba53-5c44e29c6433",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "404832f2-4e08-4061-98c8-e069c820394c",
    "short_number": 25,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "00a0147d-c63c-4dae-95e8-e06bff45f584",
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
      "id": "73889563-3980-4781-a78a-d5d449fdaaf4",
      "order_id": "404832f2-4e08-4061-98c8-e069c820394c",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "43bab937-4034-4ba0-bbf0-11ec36159000",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-31T02:20:26.098323Z",
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
    "related_order_id": null,
    "driver": null,
    "driver_change": null,
    "comment": null,
    "entrance": null
  },
  "follow_up": {
    "id": "4b7d873c-aaec-4b60-a4db-b74f5bf0db21",
    "short_number": 26,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "00a0147d-c63c-4dae-95e8-e06bff45f584",
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
    "id": "c89280c7-acf6-4bac-b119-7cb141c64431",
    "order_id": "4b7d873c-aaec-4b60-a4db-b74f5bf0db21",
    "expires_at": "2026-10-31T02:21:44.553788Z",
    "server_time": "2026-10-31T02:21:29.788784107Z",
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

`POST /api/driver/v1/offers/c89280c7-acf6-4bac-b119-7cb141c64431/accept` → **200**

```json
{
  "command_id": "9050e041-0e9c-4319-9078-141f487c45f9"
}
```

```json
{
  "id": "9a39c9c8-36c0-4518-8d9a-e34f1ff7963e",
  "order_id": "4b7d873c-aaec-4b60-a4db-b74f5bf0db21",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "74a19e63-3ff5-4dda-bd33-b9be4670914c",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "74a19e63-3ff5-4dda-bd33-b9be4670914c",
  "order_id": "4b7d873c-aaec-4b60-a4db-b74f5bf0db21",
  "assignment_id": "9a39c9c8-36c0-4518-8d9a-e34f1ff7963e",
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
  "entrance": null,
  "contact_attempts": []
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "9952f269-e27f-4550-940b-72ca74a9f3d4",
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
  "last_heartbeat_at": "2026-10-31T02:21:28.365254Z",
  "last_location_at": "2026-10-31T02:21:28.365254Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/9952f269-e27f-4550-940b-72ca74a9f3d4/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T02:21:30Z",
    "sequence": 1793413290590
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "9952f269-e27f-4550-940b-72ca74a9f3d4",
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
  "last_heartbeat_at": "2026-10-31T02:21:30.604295Z",
  "last_location_at": "2026-10-31T02:21:30.604295Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/74a19e63-3ff5-4dda-bd33-b9be4670914c/arrive` → **200**

```json
{
  "command_id": "c6010034-99b8-4c01-832f-a73ba3620236",
  "expected_version": 0
}
```

```json
{
  "id": "74a19e63-3ff5-4dda-bd33-b9be4670914c",
  "order_id": "4b7d873c-aaec-4b60-a4db-b74f5bf0db21",
  "assignment_id": "9a39c9c8-36c0-4518-8d9a-e34f1ff7963e",
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
  "arrived_at": "2026-10-31T02:21:30.794736Z",
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

`POST /api/driver/v1/trips/74a19e63-3ff5-4dda-bd33-b9be4670914c/start` → **200**

```json
{
  "command_id": "d8efa737-abb5-461d-a9cc-ce5bb54a8239",
  "expected_version": 1
}
```

```json
{
  "id": "74a19e63-3ff5-4dda-bd33-b9be4670914c",
  "order_id": "4b7d873c-aaec-4b60-a4db-b74f5bf0db21",
  "assignment_id": "9a39c9c8-36c0-4518-8d9a-e34f1ff7963e",
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
  "arrived_at": "2026-10-31T02:21:30.794736Z",
  "started_at": "2026-10-31T02:21:30.986574Z",
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

`POST /api/driver/v1/trips/74a19e63-3ff5-4dda-bd33-b9be4670914c/complete` → **200**

```json
{
  "command_id": "a5549914-e8ff-4ee9-b5fe-b75cff70a48b",
  "expected_version": 2,
  "reported_at": "2026-10-31T02:21:31Z"
}
```

```json
{
  "id": "74a19e63-3ff5-4dda-bd33-b9be4670914c",
  "order_id": "4b7d873c-aaec-4b60-a4db-b74f5bf0db21",
  "assignment_id": "9a39c9c8-36c0-4518-8d9a-e34f1ff7963e",
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
  "arrived_at": "2026-10-31T02:21:30.794736Z",
  "started_at": "2026-10-31T02:21:30.986574Z",
  "completed_at": "2026-10-31T02:21:31.185516Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null,
  "comment": null,
  "entrance": null,
  "contact_attempts": []
}
```

`GET /api/rider/v1/orders` → **200**

```json
{
  "items": [
    {
      "id": "4b7d873c-aaec-4b60-a4db-b74f5bf0db21",
      "short_number": 26,
      "status": "FULFILLED",
      "created_at": "2026-10-31T02:21:29.547719Z",
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
      "id": "404832f2-4e08-4061-98c8-e069c820394c",
      "short_number": 25,
      "status": "CANCELLED",
      "created_at": "2026-10-31T02:20:26.098323Z",
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

`GET /api/operator/v1/orders/404832f2-4e08-4061-98c8-e069c820394c/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-31T02:20:26.098766Z",
      "actor": {
        "type": "CLIENT",
        "id": "00a0147d-c63c-4dae-95e8-e06bff45f584",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "404832f2-4e08-4061-98c8-e069c820394c",
        "quote_id": "364a12ca-4f1d-47f6-a7fe-5dd38292818a",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "f4fa204b-e8f1-4af8-afc2-4fe72a33b50b"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-31T02:20:26.100052Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "404832f2-4e08-4061-98c8-e069c820394c",
        "attempt_id": "0b0231d2-fb3b-405b-9258-920503cee9d5",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "f4fa204b-e8f1-4af8-afc2-4fe72a33b50b"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-31T02:20:26.128393Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "source": "AUTO",
        "offer_id": "bb0c4f0f-f94b-4704-a788-479474fe02bb",
        "order_id": "404832f2-4e08-4061-98c8-e069c820394c",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78,
        "expires_at": "2026-10-31T02:20:41.100500223Z"
      },
      "correlation_id": "f4fa204b-e8f1-4af8-afc2-4fe72a33b50b"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-31T02:20:26.527007Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "bb0c4f0f-f94b-4704-a788-479474fe02bb",
        "order_id": "404832f2-4e08-4061-98c8-e069c820394c",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "73889563-3980-4781-a78a-d5d449fdaaf4"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/4b7d873c-aaec-4b60-a4db-b74f5bf0db21/tip` → **200**

```json
{
  "order_id": "4b7d873c-aaec-4b60-a4db-b74f5bf0db21",
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
  "available_until": "2026-11-01T02:21:31.185516Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/4b7d873c-aaec-4b60-a4db-b74f5bf0db21/tip` → **409**

```json
{
  "command_id": "f2ca8086-cda9-4a16-bf88-92cd31e9c797",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/4b7d873c-aaec-4b60-a4db-b74f5bf0db21/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "08f7fd8c-b86c-4554-8a4f-a68e4bcb1c85"
}
```

Done: interrupted 404832f2-4e08-4061-98c8-e069c820394c, follow-up 4b7d873c-aaec-4b60-a4db-b74f5bf0db21.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "88afc84a-3544-4223-a17d-fbdae5b929c2",
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
  "last_heartbeat_at": "2026-10-31T02:21:27.546964Z",
  "last_location_at": "2026-10-31T02:21:27.546964Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/88afc84a-3544-4223-a17d-fbdae5b929c2/close` → **200**

```json
{
  "command_id": "01026ff1-9988-4b50-ba6f-7216efb4575b",
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
  "session_id": "9952f269-e27f-4550-940b-72ca74a9f3d4",
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
  "last_heartbeat_at": "2026-10-31T02:21:30.604295Z",
  "last_location_at": "2026-10-31T02:21:30.604295Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9952f269-e27f-4550-940b-72ca74a9f3d4/close` → **200**

```json
{
  "command_id": "eab2e4ab-b823-47da-9892-2db5a6a4db6a",
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
  "session_id": "ce8a8054-e3f5-4b21-bfef-8e1decc7ee0f",
  "subject": {
    "type": "STAFF",
    "id": "13536a6b-90d5-4717-bcad-60e066f5abae"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzUzNmE2Yi05MGQ1LTQ3MTctYmNhZC02MGUwNjZmNWFiYWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MTQxOTYsImlhdCI6MTc5MzQxMzI5NiwianRpIjoiMDY1YTdmZjQtYWQ5Yy00ZjczLWI4MjQtMTdmMzE0NTQ0MGY2Iiwic2lkIjoiY2U4YTgwNTQtZTNmNS00YjIxLWJmZWYtOGUxZGVjYzdlZTBmIn0.MDNeOgUzx-9vA4aZjqZxmC7eqvSWgO5cNLBHsT2ZMtI",
  "access_expires_at": "2026-10-31T02:36:36.332368872Z",
  "refresh_token": "YpgJfWRYiSLEAatOf255ja8wCjl8a7yChYyI3kk_kOc",
  "refresh_expires_at": "2026-10-31T14:21:36.331935552Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "c120fc2a-c204-4bfa-9fb8-6e9b207066f0",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-31T02:21:36Z"
}
```

```json
{
  "id": "47d2b2dd-3342-4de6-ad81-7b131f1ce89a",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-31T02:21:36Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/47d2b2dd-3342-4de6-ad81-7b131f1ce89a/publish` → **200**

```json
{
  "command_id": "da13822a-0b28-444a-806d-b8d43899eee1",
  "expected_version": 0
}
```

```json
{
  "id": "47d2b2dd-3342-4de6-ad81-7b131f1ce89a",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-31T02:21:36.725376Z",
  "published_at": "2026-10-31T02:21:36.725376Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "47d2b2dd-3342-4de6-ad81-7b131f1ce89a",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-31T02:21:36.725376Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631779714",
  "device_ref": "sandbox-26063"
}
```

```json
{
  "challenge_id": "4a4b176f-bb60-4d90-b2b7-0825bad8cdd3",
  "expires_at": "2026-10-31T02:26:37.10230453Z",
  "resend_available_at": "2026-10-31T02:21:38.10230453Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631779714` → **200**

```json
{
  "phone": "+380631779714",
  "audience": "CLIENT",
  "code": "495619",
  "sent_at": "2026-10-31T02:21:37.104168306Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4a4b176f-bb60-4d90-b2b7-0825bad8cdd3",
  "code": "495619",
  "device_ref": "sandbox-26063"
}
```

```json
{
  "session_id": "79483f12-a42e-47ed-be32-4b8c6976a50e",
  "subject": {
    "type": "CLIENT",
    "id": "a7451461-cbe5-4aa4-a999-6b31baa2cc7b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNzQ1MTQ2MS1jYmU1LTRhYTQtYTk5OS02YjMxYmFhMmNjN2IiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDE0MTk3LCJpYXQiOjE3OTM0MTMyOTcsImp0aSI6IjUwZDI1MzdmLTg0MjctNDQwZC1hOTFmLWNhZDg2M2E2MmQyNiIsInNpZCI6Ijc5NDgzZjEyLWE0MmUtNDdlZC1iZTMyLTRiOGM2OTc2YTUwZSJ9.RKki2XzJ9wTG6qePBDb2wyjzRmXof4ZCFibZmHEeYOI",
  "access_expires_at": "2026-10-31T02:36:37.314664704Z",
  "refresh_token": "VAZrN-4NWKuztkozHWb7_XMoYNdV4KZ1Vav7NUJ7uBA",
  "refresh_expires_at": "2026-11-30T02:21:37.314255956Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "47d2b2dd-3342-4de6-ad81-7b131f1ce89a",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-31T02:21:36.725376Z",
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
  "command_id": "04d94f0d-412b-4d7e-a17c-ebf1f821d193",
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
  "id": "11d52df3-d4e0-40b6-8f62-c5f11d114d31",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T02:26:37.702863Z",
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
  "command_id": "7aff6df6-dcd7-479f-9788-35306d09eba7",
  "quote_id": "11d52df3-d4e0-40b6-8f62-c5f11d114d31",
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
  "correlation_id": "33fc5354-3184-4e4e-8c93-0825859aeb69"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "39d2873b-3d65-4e1c-8e25-b2332faa38ae",
  "version_id": "47d2b2dd-3342-4de6-ad81-7b131f1ce89a",
  "language": "uk"
}
```

```json
{
  "version_id": "47d2b2dd-3342-4de6-ad81-7b131f1ce89a",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-31T02:21:38.094365Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "afca7afc-d586-4562-a3e1-8a46ad51fd32",
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
  "id": "cbbe4272-d071-4095-82ea-870a921afc7a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T02:26:38.281759Z",
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
  "command_id": "8bc62244-e430-4bb5-8ae5-8ef8328d66b6",
  "quote_id": "cbbe4272-d071-4095-82ea-870a921afc7a",
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
  "id": "50e17790-4e31-4896-8c77-59617138e312",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a7451461-cbe5-4aa4-a999-6b31baa2cc7b",
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
  "created_at": "2026-10-31T02:21:38.476379Z",
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

`GET /api/rider/v1/orders/50e17790-4e31-4896-8c77-59617138e312` → **200**

```json
{
  "id": "50e17790-4e31-4896-8c77-59617138e312",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a7451461-cbe5-4aa4-a999-6b31baa2cc7b",
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
  "created_at": "2026-10-31T02:21:38.476379Z",
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

`POST /api/rider/v1/orders/50e17790-4e31-4896-8c77-59617138e312/cancel` → **200**

```json
{
  "command_id": "1fc9b2f3-8b76-48cb-a16e-722a1419a2c8",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "50e17790-4e31-4896-8c77-59617138e312",
  "short_number": 27,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "a7451461-cbe5-4aa4-a999-6b31baa2cc7b",
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
  "created_at": "2026-10-31T02:21:38.476379Z",
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
  "pickup_eta": null,
  "driver": null,
  "driver_change": null,
  "comment": null,
  "entrance": null
}
```

## A published version never changes

`POST /api/admin/v1/legal-documents/47d2b2dd-3342-4de6-ad81-7b131f1ce89a` → **409**

```json
{
  "command_id": "b5ec51a3-f360-4de0-973b-33a9d8a2f67d",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-31T02:21:39Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/47d2b2dd-3342-4de6-ad81-7b131f1ce89a",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "db061358-4e25-4b96-bc09-bf1345b358a1"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "9b9d9ba0-40f2-4ec7-9737-53654ce501d2",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-31T02:21:39Z"
}
```

```json
{
  "id": "9dc35420-fbf6-40a7-baf2-d87701f47d02",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-31T02:21:39Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/9dc35420-fbf6-40a7-baf2-d87701f47d02/publish` → **200**

```json
{
  "command_id": "338d3d53-9758-4237-82ac-bda6ef30e082",
  "expected_version": 0
}
```

```json
{
  "id": "9dc35420-fbf6-40a7-baf2-d87701f47d02",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-31T02:21:39.481777Z",
  "published_at": "2026-10-31T02:21:39.481777Z",
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
  "device_ref": "sandbox-30813"
}
```

```json
{
  "challenge_id": "3cfd0438-62a0-48ac-bb51-cc2780168319",
  "expires_at": "2026-10-31T02:26:39.679417786Z",
  "resend_available_at": "2026-10-31T02:21:40.679417786Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "798753",
  "sent_at": "2026-10-31T02:21:39.681211938Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3cfd0438-62a0-48ac-bb51-cc2780168319",
  "code": "798753",
  "device_ref": "sandbox-30813"
}
```

```json
{
  "session_id": "ece970c6-bb7e-494c-a53c-6a030df3431e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQxNDE5OSwiaWF0IjoxNzkzNDEzMjk5LCJqdGkiOiJhMTYwMjFmYS00YjdlLTQ2ZmUtYjEzYi05ZjlkMjRmMTY3M2IiLCJzaWQiOiJlY2U5NzBjNi1iYjdlLTQ5NGMtYTUzYy02YTAzMGRmMzQzMWUifQ.dciU5u1dUCeL63275AHMd05E67-6chYe8VeRr56PcPM",
  "access_expires_at": "2026-10-31T02:36:39.890483239Z",
  "refresh_token": "tNpQjhMbE8liz9tQt7h6jmhadqb5kiWPISsXcwbJHOg",
  "refresh_expires_at": "2026-11-30T02:21:39.890121191Z",
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
  "device_ref": "sandbox-14986"
}
```

```json
{
  "challenge_id": "2b6fce0a-0322-4b0e-8c8c-def5cafa3a3a",
  "expires_at": "2026-10-31T02:26:40.279670524Z",
  "resend_available_at": "2026-10-31T02:21:41.279670524Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "059785",
  "sent_at": "2026-10-31T02:21:40.281865381Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2b6fce0a-0322-4b0e-8c8c-def5cafa3a3a",
  "code": "059785",
  "device_ref": "sandbox-14986"
}
```

```json
{
  "session_id": "ae9d2236-e6cd-4fa8-8d53-3ad4a8836867",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQxNDIwMCwiaWF0IjoxNzkzNDEzMzAwLCJqdGkiOiI4MjE0ZWYzZC1mZjA2LTQzMTMtODc4Yy0zMDIyN2QzYjMzNWUiLCJzaWQiOiJhZTlkMjIzNi1lNmNkLTRmYTgtOGQ1My0zYWQ0YTg4MzY4NjcifQ.PaPBl0FU-p4aMSwKikXuIjj9Nt0Q6NbzoBYx02dXTvI",
  "access_expires_at": "2026-10-31T02:36:40.495050251Z",
  "refresh_token": "i5K9Mp04lIB7PBn75XRMRJxuj2iUtHZtTgq1YtLJ4Ls",
  "refresh_expires_at": "2026-11-30T02:21:40.494657351Z",
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
  "device_ref": "sandbox-31402"
}
```

```json
{
  "challenge_id": "8ee949fe-3cc6-4f37-a75b-d0c67d7efc70",
  "expires_at": "2026-10-31T02:26:40.872421464Z",
  "resend_available_at": "2026-10-31T02:21:41.872421464Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "176973",
  "sent_at": "2026-10-31T02:21:40.874360872Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8ee949fe-3cc6-4f37-a75b-d0c67d7efc70",
  "code": "176973",
  "device_ref": "sandbox-31402"
}
```

```json
{
  "session_id": "e17694d0-c9f9-43cd-9e59-47a156ee0a29",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQxNDIwMSwiaWF0IjoxNzkzNDEzMzAxLCJqdGkiOiI3ZjI1ZTViOS1mYzUyLTRlNTMtYjc1MS03OGM0ODkzNThjNGUiLCJzaWQiOiJlMTc2OTRkMC1jOWY5LTQzY2QtOWU1OS00N2ExNTZlZTBhMjkifQ.tQCyQeCX6FD1Tp4nSdBcqF0LJb9Mz30y8tdZ_xWK6xE",
  "access_expires_at": "2026-10-31T02:36:41.089007284Z",
  "refresh_token": "9oov05vke2xCD_uq4uFmReqqzofyDeii-KA9qalg3KE",
  "refresh_expires_at": "2026-11-30T02:21:41.088659296Z",
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
  "session_id": "9ee4702c-169a-42a7-a8a4-1f58d5bc855a",
  "subject": {
    "type": "STAFF",
    "id": "13536a6b-90d5-4717-bcad-60e066f5abae"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzUzNmE2Yi05MGQ1LTQ3MTctYmNhZC02MGUwNjZmNWFiYWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MTQyMDEsImlhdCI6MTc5MzQxMzMwMSwianRpIjoiMTEwODJkYWQtYjgzZS00MTRkLTk3MWQtOGEyMGRjZjY2Y2E1Iiwic2lkIjoiOWVlNDcwMmMtMTY5YS00MmE3LWE4YTQtMWY1OGQ1YmM4NTVhIn0.bkZ0wNjVQSGlKA7mQP0TIKrUR-QR5WpI8eoAHAZ1cVE",
  "access_expires_at": "2026-10-31T02:36:41.650140439Z",
  "refresh_token": "-7aIp48U1u4AuT6MB_82pz0VXY5VKIdFN4nqtadp0CM",
  "refresh_expires_at": "2026-10-31T14:21:41.649795336Z",
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
  "session_id": "b1348ded-461d-4f02-a1ec-548f6528b3d3",
  "subject": {
    "type": "STAFF",
    "id": "13536a6b-90d5-4717-bcad-60e066f5abae"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzUzNmE2Yi05MGQ1LTQ3MTctYmNhZC02MGUwNjZmNWFiYWUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MTQyMDIsImlhdCI6MTc5MzQxMzMwMiwianRpIjoiNDg0YmVhMDAtNWY5My00Yjc4LWE2ZTAtYzI3NWMzMjI3YjBjIiwic2lkIjoiYjEzNDhkZWQtNDYxZC00ZjAyLWExZWMtNTQ4ZjY1MjhiM2QzIn0.Mj6vxep-5HUCiPslWqCttDYOwYD9a-wtf1Vq8QHLXKM",
  "access_expires_at": "2026-10-31T02:36:42.032998635Z",
  "refresh_token": "Dj6sqYpHogA70g_ZdvqqozkH-kG4bj421R_ss5reYss",
  "refresh_expires_at": "2026-10-31T14:21:42.032652881Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380687440515",
  "device_ref": "sandbox-15271"
}
```

```json
{
  "challenge_id": "fdd81fb9-74e4-4df7-b735-6c372d18d733",
  "expires_at": "2026-10-31T02:26:42.222445884Z",
  "resend_available_at": "2026-10-31T02:21:43.222445884Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380687440515` → **200**

```json
{
  "phone": "+380687440515",
  "audience": "CLIENT",
  "code": "691102",
  "sent_at": "2026-10-31T02:21:42.224226771Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fdd81fb9-74e4-4df7-b735-6c372d18d733",
  "code": "691102",
  "device_ref": "sandbox-15271"
}
```

```json
{
  "session_id": "d2a5cc36-40ac-4907-ac94-20b40a02f3c5",
  "subject": {
    "type": "CLIENT",
    "id": "4a085d2b-2b79-4b57-90e9-4315dcbe2971"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YTA4NWQyYi0yYjc5LTRiNTctOTBlOS00MzE1ZGNiZTI5NzEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDE0MjAyLCJpYXQiOjE3OTM0MTMzMDIsImp0aSI6ImM2YjhmYmRhLTdkMzAtNDI3MS05MzFlLTc1MmUzZTBmODM3NyIsInNpZCI6ImQyYTVjYzM2LTQwYWMtNDkwNy1hYzk0LTIwYjQwYTAyZjNjNSJ9.BF9tuUvLGfDicYPGH2vgxcw-1tzD81Zx8aBA3LXh4sI",
  "access_expires_at": "2026-10-31T02:36:42.436321218Z",
  "refresh_token": "gJiaAFGf4U0QrZEusUSreKMvMVQL7BX7_zOhaHZE92A",
  "refresh_expires_at": "2026-11-30T02:21:42.435997477Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "13a71733-3626-4bc6-ad33-1560188d7eeb",
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
  "id": "136edd08-012f-4a5d-8135-829feb65af43",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T02:26:42.640237Z",
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
  "command_id": "26915b80-a27e-4d5c-bd0a-28ed8aaf9ae8",
  "quote_id": "136edd08-012f-4a5d-8135-829feb65af43",
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
  "id": "d6efbd0a-6dfc-4559-828d-8c0f2d68305b",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4a085d2b-2b79-4b57-90e9-4315dcbe2971",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-31T02:21:42.849913Z",
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

`POST /api/operator/v1/orders/d6efbd0a-6dfc-4559-828d-8c0f2d68305b/manual-offers` → **409**

```json
{
  "command_id": "8bf34215-933d-41f6-91c6-777650eb5d32",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "reason": "Regular client"
}
```

```json
{
  "instance": "/api/operator/v1/orders/d6efbd0a-6dfc-4559-828d-8c0f2d68305b/manual-offers",
  "status": 409,
  "title": "Driver not eligible",
  "type": "https://errors.blizz.taxi/driver-not-eligible",
  "code": "DRIVER_NOT_ELIGIBLE",
  "correlation_id": "fa160adc-0147-44cf-aed9-ef0bd1b0c864"
}
```

## Andrii comes online 1 km away; the operator offers him the order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-22769"
}
```

```json
{
  "challenge_id": "314844f0-6979-4cda-924e-69a17a120487",
  "expires_at": "2026-10-31T02:26:43.27517089Z",
  "resend_available_at": "2026-10-31T02:21:44.27517089Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "495352",
  "sent_at": "2026-10-31T02:21:43.276984596Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "314844f0-6979-4cda-924e-69a17a120487",
  "code": "495352",
  "device_ref": "sandbox-22769"
}
```

```json
{
  "session_id": "0fe07c7a-1541-45ad-ba22-ed713701bf1e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQxNDIwMywiaWF0IjoxNzkzNDEzMzAzLCJqdGkiOiIyN2U5ODQxZC1kZWQ3LTQyMmEtYmM1NS0xOTdmZTM4MWZhN2QiLCJzaWQiOiIwZmUwN2M3YS0xNTQxLTQ1YWQtYmEyMi1lZDcxMzcwMWJmMWUifQ.Gq_Htym5hzL4ewgEuhUCw9ZySTXIhQQjcSkat4YQwU0",
  "access_expires_at": "2026-10-31T02:36:43.489495021Z",
  "refresh_token": "r2Ka1150eQcq-zohPzqpo1B1u1wUvXa-2-r5zPa1pew",
  "refresh_expires_at": "2026-11-30T02:21:43.489146293Z",
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
  "command_id": "9d923a41-9a14-47af-b26d-8dac9b951aab",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4591,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T02:21:43Z",
    "sequence": 1793413303886
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "21f03850-1f66-4470-9100-fa21b65b1cd4",
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
  "last_heartbeat_at": "2026-10-31T02:21:43.901384Z",
  "last_location_at": "2026-10-31T02:21:43.901384Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/operator/v1/orders/d6efbd0a-6dfc-4559-828d-8c0f2d68305b/manual-offers` → **200**

```json
{
  "command_id": "908ea4ef-d34e-47ad-93e4-3c0f6d29cc2c",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "reason": "Regular client asked for him"
}
```

```json
{
  "id": "d6efbd0a-6dfc-4559-828d-8c0f2d68305b",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "4a085d2b-2b79-4b57-90e9-4315dcbe2971",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-31T02:21:42.849913Z",
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

`POST /api/operator/v1/orders/d6efbd0a-6dfc-4559-828d-8c0f2d68305b/manual-offers` → **409**

```json
{
  "command_id": "a698f20d-bd66-4eb9-acab-16e10147f2ad",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "reason": "Twice"
}
```

```json
{
  "instance": "/api/operator/v1/orders/d6efbd0a-6dfc-4559-828d-8c0f2d68305b/manual-offers",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "407e3ddf-981c-4901-a6f4-62a3d5be9896"
}
```

## Andrii sees an ordinary offer with its terms, the note and the entrance, and accepts it

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "5d9f0560-6da1-48af-a2ba-ef8ed7327537",
    "order_id": "d6efbd0a-6dfc-4559-828d-8c0f2d68305b",
    "expires_at": "2026-10-31T02:21:59.103995Z",
    "server_time": "2026-10-31T02:21:44.509190489Z",
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

`POST /api/driver/v1/offers/5d9f0560-6da1-48af-a2ba-ef8ed7327537/accept` → **200**

```json
{
  "command_id": "5a89a9ce-21dc-46fb-b1d6-30dc65f5e3ac"
}
```

```json
{
  "id": "efaf55f8-3b30-4525-8e95-c659fa9842f0",
  "order_id": "d6efbd0a-6dfc-4559-828d-8c0f2d68305b",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "eda90671-3ab7-4823-a187-af6349bf03d9",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "eda90671-3ab7-4823-a187-af6349bf03d9",
  "order_id": "d6efbd0a-6dfc-4559-828d-8c0f2d68305b",
  "assignment_id": "efaf55f8-3b30-4525-8e95-c659fa9842f0",
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
  "entrance": "Вихід з метро №2",
  "contact_attempts": []
}
```

`GET /api/operator/v1/orders/d6efbd0a-6dfc-4559-828d-8c0f2d68305b/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-31T02:21:42.850411Z",
      "actor": {
        "type": "CLIENT",
        "id": "4a085d2b-2b79-4b57-90e9-4315dcbe2971",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "d6efbd0a-6dfc-4559-828d-8c0f2d68305b",
        "quote_id": "136edd08-012f-4a5d-8135-829feb65af43",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "71564774-62c6-4051-bc01-58f104027b28"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-31T02:21:42.851523Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "d6efbd0a-6dfc-4559-828d-8c0f2d68305b",
        "attempt_id": "8f6c7253-3ee5-488c-85d0-35715825be01",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "71564774-62c6-4051-bc01-58f104027b28"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-31T02:21:42.865301Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "d6efbd0a-6dfc-4559-828d-8c0f2d68305b",
        "attempt_id": "8f6c7253-3ee5-488c-85d0-35715825be01"
      },
      "correlation_id": "71564774-62c6-4051-bc01-58f104027b28"
    },
    {
      "sequence": 3,
      "type": "OfferMade",
      "occurred_at": "2026-10-31T02:21:44.104617Z",
      "actor": {
        "type": "STAFF",
        "id": "13536a6b-90d5-4717-bcad-60e066f5abae",
        "name": "Super Admin",
        "role": "SUPER_ADMIN"
      },
      "reason": null,
      "details": {
        "source": "MANUAL",
        "offer_id": "5d9f0560-6da1-48af-a2ba-ef8ed7327537",
        "order_id": "d6efbd0a-6dfc-4559-828d-8c0f2d68305b",
        "driver_id": "5a000000-0000-4000-8000-000000000403",
        "distance_m": 1001,
        "expires_at": "2026-10-31T02:21:59.103995167Z"
      },
      "correlation_id": "82c9b3b8-7095-4c15-9238-4d08fc23e613"
    },
```

Done: order d6efbd0a-6dfc-4559-828d-8c0f2d68305b offered by hand to 5a000000-0000-4000-8000-000000000403, earnings estimate 8939 of 10517.

`GET /api/operator/v1/orders/d6efbd0a-6dfc-4559-828d-8c0f2d68305b` → **200**

```json
{
  "id": "d6efbd0a-6dfc-4559-828d-8c0f2d68305b",
  "short_number": 28,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "4a085d2b-2b79-4b57-90e9-4315dcbe2971",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "efaf55f8-3b30-4525-8e95-c659fa9842f0",
    "order_id": "d6efbd0a-6dfc-4559-828d-8c0f2d68305b",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "eda90671-3ab7-4823-a187-af6349bf03d9",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-31T02:21:42.849913Z",
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

`POST /api/operator/v1/orders/d6efbd0a-6dfc-4559-828d-8c0f2d68305b/cancel` → **200**

```json
{
  "command_id": "3f814268-7e3c-4b9e-9f35-5ca160af5bc3",
  "expected_version": 4,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "d6efbd0a-6dfc-4559-828d-8c0f2d68305b",
  "short_number": 28,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "4a085d2b-2b79-4b57-90e9-4315dcbe2971",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "efaf55f8-3b30-4525-8e95-c659fa9842f0",
    "order_id": "d6efbd0a-6dfc-4559-828d-8c0f2d68305b",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "eda90671-3ab7-4823-a187-af6349bf03d9",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-31T02:21:42.849913Z",
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
  "session_id": "21f03850-1f66-4470-9100-fa21b65b1cd4",
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
  "last_heartbeat_at": "2026-10-31T02:21:43.901384Z",
  "last_location_at": "2026-10-31T02:21:43.901384Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/21f03850-1f66-4470-9100-fa21b65b1cd4/close` → **200**

```json
{
  "command_id": "aa5bc9ee-de28-4f4c-94bd-fba0b2c752ed",
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
  "device_ref": "sandbox-22323"
}
```

```json
{
  "challenge_id": "ffe760dd-0bc5-4e5e-b5fe-8a8d8e0d4433",
  "expires_at": "2026-10-31T02:26:46.107897484Z",
  "resend_available_at": "2026-10-31T02:21:47.107897484Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "094252",
  "sent_at": "2026-10-31T02:21:46.109698777Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ffe760dd-0bc5-4e5e-b5fe-8a8d8e0d4433",
  "code": "094252",
  "device_ref": "sandbox-22323"
}
```

```json
{
  "session_id": "97b65b91-c0ad-4015-8f04-4b378f4d0ea4",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQxNDIwNiwiaWF0IjoxNzkzNDEzMzA2LCJqdGkiOiIxZTAyNzM2OC0zMDc3LTRmMWEtOWNmNi1iMDAwYzdkMDEyYjEiLCJzaWQiOiI5N2I2NWI5MS1jMGFkLTQwMTUtOGYwNC00YjM3OGY0ZDBlYTQifQ.UZWQLIuR5wEpU0-wG6Owo9F3B19eNqJEVCsvYsHy92Y",
  "access_expires_at": "2026-10-31T02:36:46.317183699Z",
  "refresh_token": "_2F5TgsCDluUt5YzKghg-lFCS8yiV787KI3L5yAmEN4",
  "refresh_expires_at": "2026-11-30T02:21:46.316829132Z",
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

(the car drives 68 s to the next point)

`POST /api/driver/v1/work-sessions` → **201**

```json
{
  "command_id": "583294ec-e467-419c-96f5-234a255e391c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T02:22:54Z",
    "sequence": 1793413374706
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "655079c0-cd45-4fa6-b203-55ba4bc33424",
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
  "last_heartbeat_at": "2026-10-31T02:22:54.720766Z",
  "last_location_at": "2026-10-31T02:22:54.720766Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675430908",
  "device_ref": "sandbox-24637"
}
```

```json
{
  "challenge_id": "e71af1f7-4011-4108-8324-887a4232cc6d",
  "expires_at": "2026-10-31T02:27:54.901201363Z",
  "resend_available_at": "2026-10-31T02:22:55.901201363Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380675430908` → **200**

```json
{
  "phone": "+380675430908",
  "audience": "CLIENT",
  "code": "427566",
  "sent_at": "2026-10-31T02:22:54.902830876Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e71af1f7-4011-4108-8324-887a4232cc6d",
  "code": "427566",
  "device_ref": "sandbox-24637"
}
```

```json
{
  "session_id": "bb040b13-c8d1-4d26-9b29-9b7cc8877b87",
  "subject": {
    "type": "CLIENT",
    "id": "c882374c-6cb5-41d9-8d8c-33d7443f77b0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjODgyMzc0Yy02Y2I1LTQxZDktOGQ4Yy0zM2Q3NDQzZjc3YjAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDE0Mjc1LCJpYXQiOjE3OTM0MTMzNzUsImp0aSI6IjYyZTQyZGMwLWI5YmUtNDhhMy1hZTY3LWM3ZGU1Y2FjZDBlYyIsInNpZCI6ImJiMDQwYjEzLWM4ZDEtNGQyNi05YjI5LTliN2NjODg3N2I4NyJ9.oRznB2Hy2mtfpGsoduXqcjfjxZjjGcrphPrrpV2uoJg",
  "access_expires_at": "2026-10-31T02:37:55.109494357Z",
  "refresh_token": "cAqgGtUrG4T2C3_OJhg9P1_0_Lmhkmr3g_jnuV5pMKw",
  "refresh_expires_at": "2026-11-30T02:22:55.109169444Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "cec42131-d60d-49ef-8628-32bbc0b28455",
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
  "id": "b89e044f-bc61-482f-885e-559fee37d344",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T02:27:55.302784Z",
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
  "command_id": "ccb9f3bc-f9c3-4287-b891-12d97770785d",
  "quote_id": "b89e044f-bc61-482f-885e-559fee37d344",
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
    "phone": "+380678082714"
  }
}
```

```json
{
  "id": "524c9d55-44c4-49ce-805a-ce2f66ee0fa1",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c882374c-6cb5-41d9-8d8c-33d7443f77b0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T02:22:55.497598Z",
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
    "id": "79017582-3c47-4f16-916e-39a78f143ef1",
    "order_id": "524c9d55-44c4-49ce-805a-ce2f66ee0fa1",
    "expires_at": "2026-10-31T02:23:10.499673Z",
    "server_time": "2026-10-31T02:22:55.699838249Z",
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

`POST /api/driver/v1/offers/79017582-3c47-4f16-916e-39a78f143ef1/accept` → **200**

```json
{
  "command_id": "8c1b543d-e2d4-41fe-92d0-ea46f0b63f88"
}
```

```json
{
  "id": "c27fa906-d694-42ba-b098-52feea57c80b",
  "order_id": "524c9d55-44c4-49ce-805a-ce2f66ee0fa1",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "22bd3d18-f231-40e8-8061-aa7e67686389",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "22bd3d18-f231-40e8-8061-aa7e67686389",
  "order_id": "524c9d55-44c4-49ce-805a-ce2f66ee0fa1",
  "assignment_id": "c27fa906-d694-42ba-b098-52feea57c80b",
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
    "phone": "+380678082714"
  },
  "comment": null,
  "entrance": null,
  "contact_attempts": []
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "99e5f0b0-47c2-4817-bf57-ccd8b032befa",
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
  "id": "136508f2-48af-4bf2-8d61-8f352c813ef3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T02:27:56.272729Z",
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
  "command_id": "de64cbab-f85a-4e5e-9b1e-3c7ed7954b27",
  "quote_id": "136508f2-48af-4bf2-8d61-8f352c813ef3",
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
  "id": "43230d16-4615-46f5-8cd8-de0a85544a38",
  "short_number": 30,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c882374c-6cb5-41d9-8d8c-33d7443f77b0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-31T02:22:56.467166Z",
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
  "command_id": "13e57932-2594-4bfe-b63c-516100041b0e",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-31T05:22:56Z"
}
```

```json
{
  "id": "538803bb-3210-42e6-8e22-52f07bfb2868",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T02:27:56.669971Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-31T05:22:56Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "49f5d0cc-a156-416e-ae4e-8cbd349fbfa8",
  "quote_id": "538803bb-3210-42e6-8e22-52f07bfb2868",
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
  "pickup_at": "2026-10-31T05:22:56Z"
}
```

```json
{
  "id": "521ab2f2-03c1-4f6a-9d0f-091f1698b646",
  "short_number": 31,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "c882374c-6cb5-41d9-8d8c-33d7443f77b0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-31T02:22:56.862549Z",
  "cancellation": null,
  "pickup_at": "2026-10-31T05:22:56Z",
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
  "command_id": "3235cdc2-aec5-42cb-bb52-fccfd0ffcea1",
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
  "id": "b7e8d0f5-57d7-4186-b8ac-b005fa5479d5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T02:27:57.061176Z",
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
  "command_id": "36bff919-71b1-42a6-8d93-0c2384b9534d",
  "quote_id": "b7e8d0f5-57d7-4186-b8ac-b005fa5479d5",
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
  "correlation_id": "11b4516f-f5ab-4fad-ab99-c91f5156f642"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "521ab2f2-03c1-4f6a-9d0f-091f1698b646",
      "short_number": 31,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "c882374c-6cb5-41d9-8d8c-33d7443f77b0",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-31T02:22:56.862549Z",
      "cancellation": null,
      "pickup_at": "2026-10-31T05:22:56Z",
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
      "id": "43230d16-4615-46f5-8cd8-de0a85544a38",
      "short_number": 30,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "c882374c-6cb5-41d9-8d8c-33d7443f77b0",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
        "lat": 50.4405,
        "lon": 30.489
      },
      "dropoff_label": "Вокзал",
      "payment_method": "CASH",
      "payment_state": "CASH_EXPECTED",
      "price_minor": 10517,
      "final_price_minor": null,
      "currency": "UAH",
      "search_phase": "BROADCAST",
      "assignment": null,
      "created_at": "2026-10-31T02:22:56.467166Z",
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
  "id": "43230d16-4615-46f5-8cd8-de0a85544a38",
  "short_number": 30,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c882374c-6cb5-41d9-8d8c-33d7443f77b0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-31T02:22:56.467166Z",
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

`GET /api/rider/v1/orders/524c9d55-44c4-49ce-805a-ce2f66ee0fa1` → **200**

```json
{
  "id": "524c9d55-44c4-49ce-805a-ce2f66ee0fa1",
  "short_number": 29,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "c882374c-6cb5-41d9-8d8c-33d7443f77b0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "c27fa906-d694-42ba-b098-52feea57c80b",
    "order_id": "524c9d55-44c4-49ce-805a-ce2f66ee0fa1",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "22bd3d18-f231-40e8-8061-aa7e67686389",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-31T02:22:55.497598Z",
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
    "location_at": "2026-10-31T02:22:54.720766Z",
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

`POST /api/rider/v1/orders/524c9d55-44c4-49ce-805a-ce2f66ee0fa1/cancel` → **200**

```json
{
  "command_id": "ec288830-4bfc-45f4-b90a-22f09afd7eec",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "524c9d55-44c4-49ce-805a-ce2f66ee0fa1",
  "short_number": 29,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "c882374c-6cb5-41d9-8d8c-33d7443f77b0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "c27fa906-d694-42ba-b098-52feea57c80b",
    "order_id": "524c9d55-44c4-49ce-805a-ce2f66ee0fa1",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "22bd3d18-f231-40e8-8061-aa7e67686389",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-31T02:22:55.497598Z",
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
  "pickup_eta": null,
  "driver": null,
  "driver_change": null,
  "comment": null,
  "entrance": null
}
```

`GET /api/rider/v1/orders/43230d16-4615-46f5-8cd8-de0a85544a38` → **200**

```json
{
  "id": "43230d16-4615-46f5-8cd8-de0a85544a38",
  "short_number": 30,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c882374c-6cb5-41d9-8d8c-33d7443f77b0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-31T02:22:56.467166Z",
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

`POST /api/rider/v1/orders/43230d16-4615-46f5-8cd8-de0a85544a38/cancel` → **200**

```json
{
  "command_id": "cda01047-421c-46be-9e6f-622bc02ad497",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "43230d16-4615-46f5-8cd8-de0a85544a38",
  "short_number": 30,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "c882374c-6cb5-41d9-8d8c-33d7443f77b0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T02:22:56.467166Z",
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
  "pickup_eta": null,
  "driver": null,
  "driver_change": null,
  "comment": null,
  "entrance": null
}
```

`GET /api/rider/v1/orders/521ab2f2-03c1-4f6a-9d0f-091f1698b646` → **200**

```json
{
  "id": "521ab2f2-03c1-4f6a-9d0f-091f1698b646",
  "short_number": 31,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "c882374c-6cb5-41d9-8d8c-33d7443f77b0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-31T02:22:56.862549Z",
  "cancellation": null,
  "pickup_at": "2026-10-31T05:22:56Z",
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

`POST /api/rider/v1/orders/521ab2f2-03c1-4f6a-9d0f-091f1698b646/cancel` → **200**

```json
{
  "command_id": "7fbbe2ae-52e4-4296-8208-d2c5a3fa3ebd",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "521ab2f2-03c1-4f6a-9d0f-091f1698b646",
  "short_number": 31,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "c882374c-6cb5-41d9-8d8c-33d7443f77b0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-31T02:22:56.862549Z",
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
  "pickup_at": "2026-10-31T05:22:56Z",
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
  "session_id": "655079c0-cd45-4fa6-b203-55ba4bc33424",
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
  "last_heartbeat_at": "2026-10-31T02:22:54.720766Z",
  "last_location_at": "2026-10-31T02:22:54.720766Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/655079c0-cd45-4fa6-b203-55ba4bc33424/close` → **200**

```json
{
  "command_id": "9cd0716b-f8a4-4b82-bb75-c6d97ec0323d",
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

Done: orders 524c9d55-44c4-49ce-805a-ce2f66ee0fa1, 43230d16-4615-46f5-8cd8-de0a85544a38, 521ab2f2-03c1-4f6a-9d0f-091f1698b646.

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
  "session_id": "114657ba-ea04-483a-be62-7955ea31fb44",
  "subject": {
    "type": "STAFF",
    "id": "13536a6b-90d5-4717-bcad-60e066f5abae"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzUzNmE2Yi05MGQ1LTQ3MTctYmNhZC02MGUwNjZmNWFiYWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MTQyNzksImlhdCI6MTc5MzQxMzM3OSwianRpIjoiNGRiMDBkYzUtZGViYi00NGNiLTg4NzAtNzBlNTA3MzNlZmM3Iiwic2lkIjoiMTE0NjU3YmEtZWEwNC00ODNhLWJlNjItNzk1NWVhMzFmYjQ0In0.V_8dJ67tO2sayW2AFZyI9BsETYEKQEYLygRLnYr6wYM",
  "access_expires_at": "2026-10-31T02:37:59.596872607Z",
  "refresh_token": "-zOeGzudnQxB7dYi5AcT4LLq56mXboqNPELhaivsRQQ",
  "refresh_expires_at": "2026-10-31T14:22:59.596537289Z",
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
  "session_id": "c705a1d3-918f-4b7d-940e-4c4b7790963f",
  "subject": {
    "type": "STAFF",
    "id": "13536a6b-90d5-4717-bcad-60e066f5abae"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzUzNmE2Yi05MGQ1LTQ3MTctYmNhZC02MGUwNjZmNWFiYWUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MTQyNzksImlhdCI6MTc5MzQxMzM3OSwianRpIjoiOWIzNDU3YzctMzVhZi00NDU2LWI0YjUtYWRkNmY1ODJkYWU1Iiwic2lkIjoiYzcwNWExZDMtOTE4Zi00YjdkLTk0MGUtNGM0Yjc3OTA5NjNmIn0.4y2Kd_bJKaxwRkBCRpvc34IPzC8aB8jB5n17ieEo6NE",
  "access_expires_at": "2026-10-31T02:37:59.975650348Z",
  "refresh_token": "efvpGnrYaJGr20I7ExMLU25sKMRQj1cPkaK9fmGj774",
  "refresh_expires_at": "2026-10-31T14:22:59.975239878Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-19455"
}
```

```json
{
  "challenge_id": "a27b2e0b-9bef-4099-a4de-f903b177b04f",
  "expires_at": "2026-10-31T02:28:00.1671175Z",
  "resend_available_at": "2026-10-31T02:23:01.1671175Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "201005",
  "sent_at": "2026-10-31T02:23:00.169169911Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a27b2e0b-9bef-4099-a4de-f903b177b04f",
  "code": "201005",
  "device_ref": "sandbox-19455"
}
```

```json
{
  "session_id": "9c738eb5-5c5e-47d4-810d-55d28898f216",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQxNDI4MCwiaWF0IjoxNzkzNDEzMzgwLCJqdGkiOiJkZmNjOWQ0Yy00ZDk0LTQ0NTAtOTY3MC1hMmQ2MTk5YTkzNjciLCJzaWQiOiI5YzczOGViNS01YzVlLTQ3ZDQtODEwZC01NWQyODg5OGYyMTYifQ.RB2zisLnkQwiEIEoC9vsM3HINRdE87SdSePGS0gzhPI",
  "access_expires_at": "2026-10-31T02:38:00.381608925Z",
  "refresh_token": "XHTkND2_f_8UdUCXD87wp-e8QrpTC5dZzQ7-pEd2klw",
  "refresh_expires_at": "2026-11-30T02:23:00.381219156Z",
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
  "command_id": "e2d35cff-16ce-4794-93a7-291e76b86517",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T02:23:00Z",
    "sequence": 1793413380772
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "90d54630-2405-4ee8-b47a-66ad63d54729",
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
  "last_heartbeat_at": "2026-10-31T02:23:00.7861Z",
  "last_location_at": "2026-10-31T02:23:00.7861Z",
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
  "command_id": "f6a8984e-6a27-483f-9217-c8af8bd4b801",
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
  "effective_at": "2026-10-31T02:23:01.232215Z",
  "changed_by": "13536a6b-90d5-4717-bcad-60e066f5abae",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "13536a6b-90d5-4717-bcad-60e066f5abae",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-31T02:10:28.790896Z",
  "last_entries": [
    {
      "order_id": "ee122afb-ebea-474a-8f04-a4b3eae0ddbe",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-31T02:10:28.790896Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "d9ba9cce-6a07-41ff-92fa-5aadff0e93e4",
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
  "id": "a34945d4-a440-41a1-b435-66bc93a20f5b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T02:28:01.602109Z",
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
  "command_id": "dda1e547-b374-4d61-b22d-003ad58c8357",
  "quote_id": "a34945d4-a440-41a1-b435-66bc93a20f5b",
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
    "phone": "+3806711121244"
  }
}
```

```json
{
  "id": "68d973c7-a3c5-44f2-92ec-d3df73f74c37",
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
  "created_at": "2026-10-31T02:23:01.797425Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711121244"
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
    "id": "e6d0597b-4463-4df8-a55e-6d4fb86c1463",
    "order_id": "68d973c7-a3c5-44f2-92ec-d3df73f74c37",
    "expires_at": "2026-10-31T02:23:16.799702Z",
    "server_time": "2026-10-31T02:23:02.000226988Z",
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

`POST /api/driver/v1/offers/e6d0597b-4463-4df8-a55e-6d4fb86c1463/accept` → **200**

```json
{
  "command_id": "d66f702c-59ab-4abb-9e71-86b94291f46f"
}
```

```json
{
  "id": "71c5fd9c-61c7-4cf5-b10b-ff9f72ef8c16",
  "order_id": "68d973c7-a3c5-44f2-92ec-d3df73f74c37",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "dc1280fb-8d4a-43ab-9e8c-5c7645a9b5de",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "dc1280fb-8d4a-43ab-9e8c-5c7645a9b5de",
  "order_id": "68d973c7-a3c5-44f2-92ec-d3df73f74c37",
  "assignment_id": "71c5fd9c-61c7-4cf5-b10b-ff9f72ef8c16",
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
    "phone": "+3806711121244"
  },
  "comment": null,
  "entrance": null,
  "contact_attempts": []
}
```

`POST /api/driver/v1/work-sessions/90d54630-2405-4ee8-b47a-66ad63d54729/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T02:23:02Z",
    "sequence": 1793413382552
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "90d54630-2405-4ee8-b47a-66ad63d54729",
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
  "last_heartbeat_at": "2026-10-31T02:23:02.566669Z",
  "last_location_at": "2026-10-31T02:23:02.566669Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/dc1280fb-8d4a-43ab-9e8c-5c7645a9b5de/arrive` → **200**

```json
{
  "command_id": "f8e0b18a-fcb5-41d9-8198-b7089ad1fa07",
  "expected_version": 0
}
```

```json
{
  "id": "dc1280fb-8d4a-43ab-9e8c-5c7645a9b5de",
  "order_id": "68d973c7-a3c5-44f2-92ec-d3df73f74c37",
  "assignment_id": "71c5fd9c-61c7-4cf5-b10b-ff9f72ef8c16",
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
  "arrived_at": "2026-10-31T02:23:02.753398Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711121244"
  },
  "comment": null,
  "entrance": null,
  "contact_attempts": []
}
```

`POST /api/driver/v1/trips/dc1280fb-8d4a-43ab-9e8c-5c7645a9b5de/start` → **200**

```json
{
  "command_id": "539c6d5c-f76b-4739-945b-35ee8f85f412",
  "expected_version": 1
}
```

```json
{
  "id": "dc1280fb-8d4a-43ab-9e8c-5c7645a9b5de",
  "order_id": "68d973c7-a3c5-44f2-92ec-d3df73f74c37",
  "assignment_id": "71c5fd9c-61c7-4cf5-b10b-ff9f72ef8c16",
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
  "arrived_at": "2026-10-31T02:23:02.753398Z",
  "started_at": "2026-10-31T02:23:02.950038Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711121244"
  },
  "comment": null,
  "entrance": null,
  "contact_attempts": []
}
```

`POST /api/driver/v1/trips/dc1280fb-8d4a-43ab-9e8c-5c7645a9b5de/complete` → **200**

```json
{
  "command_id": "a2dfa704-48a2-4568-8a91-de45b447d6d7",
  "expected_version": 2,
  "reported_at": "2026-10-31T02:23:03Z",
  "cash_received": true
}
```

```json
{
  "id": "dc1280fb-8d4a-43ab-9e8c-5c7645a9b5de",
  "order_id": "68d973c7-a3c5-44f2-92ec-d3df73f74c37",
  "assignment_id": "71c5fd9c-61c7-4cf5-b10b-ff9f72ef8c16",
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
  "arrived_at": "2026-10-31T02:23:02.753398Z",
  "started_at": "2026-10-31T02:23:02.950038Z",
  "completed_at": "2026-10-31T02:23:03.147687Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null,
  "comment": null,
  "entrance": null,
  "contact_attempts": []
}
```

## Second phone order is cancelled for operator error

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "2efc8244-b164-4a17-8525-86bb91a29f8c",
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
  "id": "b04ab3d8-6317-4429-965c-694dfa5acba8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T02:28:03.339229Z",
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
  "command_id": "1ef8b96c-6b3a-441d-a539-630c044c9963",
  "quote_id": "b04ab3d8-6317-4429-965c-694dfa5acba8",
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
    "phone": "+3806711122434"
  }
}
```

```json
{
  "id": "d9aa352e-f753-42fb-9fdf-32cb6e356749",
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
  "created_at": "2026-10-31T02:23:03.532481Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711122434"
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

`GET /api/operator/v1/orders/d9aa352e-f753-42fb-9fdf-32cb6e356749` → **200**

```json
{
  "id": "d9aa352e-f753-42fb-9fdf-32cb6e356749",
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
  "created_at": "2026-10-31T02:23:03.532481Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711122434"
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

`POST /api/operator/v1/orders/d9aa352e-f753-42fb-9fdf-32cb6e356749/cancel` → **200**

```json
{
  "command_id": "70637f56-4c0e-4d6b-9b74-d096c9e90041",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "d9aa352e-f753-42fb-9fdf-32cb6e356749",
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
  "created_at": "2026-10-31T02:23:03.532481Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711122434"
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
  "staff_id": "13536a6b-90d5-4717-bcad-60e066f5abae",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-31T02:10:28.790896Z",
  "last_entries": [
    {
      "order_id": "d9aa352e-f753-42fb-9fdf-32cb6e356749",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-31T02:23:03.92628Z"
    },
    {
      "order_id": "68d973c7-a3c5-44f2-92ec-d3df73f74c37",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-31T02:23:03.150593Z"
    },
    {
      "order_id": "ee122afb-ebea-474a-8f04-a4b3eae0ddbe",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-31T02:10:28.790896Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "90d54630-2405-4ee8-b47a-66ad63d54729",
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
  "last_heartbeat_at": "2026-10-31T02:23:02.566669Z",
  "last_location_at": "2026-10-31T02:23:02.566669Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/90d54630-2405-4ee8-b47a-66ad63d54729/close` → **200**

```json
{
  "command_id": "5548d1af-6061-4234-9883-c775eec85a1b",
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

Done: operator bonus for fulfilled 68d973c7-a3c5-44f2-92ec-d3df73f74c37 and operator-fault cancellation d9aa352e-f753-42fb-9fdf-32cb6e356749.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678006926",
  "device_ref": "sandbox-23114"
}
```

```json
{
  "challenge_id": "575b43b9-8d9e-4909-a8ac-1c12c69952f8",
  "expires_at": "2026-10-31T02:28:07.928957262Z",
  "resend_available_at": "2026-10-31T02:23:08.928957262Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380678006926` → **200**

```json
{
  "phone": "+380678006926",
  "audience": "CLIENT",
  "code": "953171",
  "sent_at": "2026-10-31T02:23:07.930707979Z",
  "channel": "SMS"
}
```

## "Call me instead" on the first try still gets an SMS; the resend is a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679194480",
  "device_ref": "sandbox-18439",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "2389cf7c-95e5-4d3f-959c-eb9580a6e2b6",
  "expires_at": "2026-10-31T02:28:09.356964975Z",
  "resend_available_at": "2026-10-31T02:23:10.356964975Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380679194480` → **200**

```json
{
  "phone": "+380679194480",
  "audience": "CLIENT",
  "code": "271493",
  "sent_at": "2026-10-31T02:23:09.363079494Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679194480",
  "device_ref": "sandbox-10231",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "028dcd2c-4aca-4053-ba6a-85600b406a5f",
  "expires_at": "2026-10-31T02:28:10.770423084Z",
  "resend_available_at": "2026-10-31T02:23:11.770423084Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380679194480` → **200**

```json
{
  "phone": "+380679194480",
  "audience": "CLIENT",
  "code": "990454",
  "sent_at": "2026-10-31T02:23:10.77237189Z",
  "channel": "VOICE"
}
```

## The SMS does not get through: one request, one attempt; the resend comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679080000",
  "device_ref": "sandbox-27697"
}
```

```json
{
  "challenge_id": "ff70275e-deb9-41a1-8b00-11a62d8ccc7a",
  "expires_at": "2026-10-31T02:28:12.187524126Z",
  "resend_available_at": "2026-10-31T02:23:13.187524126Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679080000",
  "device_ref": "sandbox-6660"
}
```

```json
{
  "challenge_id": "e5ffb14c-3594-43e6-a24e-e0851199c2d6",
  "expires_at": "2026-10-31T02:28:13.582700678Z",
  "resend_available_at": "2026-10-31T02:23:14.582700678Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380679080000` → **200**

```json
{
  "phone": "+380679080000",
  "audience": "CLIENT",
  "code": "298435",
  "sent_at": "2026-10-31T02:23:13.584744115Z",
  "channel": "VOICE"
}
```

## A second call in the hour is made, the third is refused

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679080000",
  "device_ref": "sandbox-8262",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "a9fece0d-5a3c-48eb-ab98-d636deec1c69",
  "expires_at": "2026-10-31T02:28:15.000781655Z",
  "resend_available_at": "2026-10-31T02:23:16.000781655Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380679080000` → **200**

```json
{
  "phone": "+380679080000",
  "audience": "CLIENT",
  "code": "838299",
  "sent_at": "2026-10-31T02:23:15.002639096Z",
  "channel": "VOICE"
}
```

`POST /auth/v1/otp/challenges` → **429**

```json
{
  "audience": "CLIENT",
  "phone": "+380679080000",
  "device_ref": "sandbox-13928",
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
  "correlation_id": "2db5baa9-c411-476e-9d58-4d8d24abfdc6",
  "retryable": true,
  "retry_after_seconds": 3600
}
```

## Numbers outside Poland and Ukraine get nothing

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+442000022600"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "1a7e342a-16bc-4c1e-a79b-dcccaf3cf4c4"
}
```

`GET /sandbox/v1/otp?phone=%2B442000022600` → **404**

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+37120022750"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "628d4c2f-afc3-40a3-b74f-f9350c995297"
}
```

`GET /sandbox/v1/otp?phone=%2B37120022750` → **404**

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
  "session_id": "450017e4-b9d2-490e-81af-2ce1b1f8ac4f",
  "subject": {
    "type": "STAFF",
    "id": "13536a6b-90d5-4717-bcad-60e066f5abae"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzUzNmE2Yi05MGQ1LTQ3MTctYmNhZC02MGUwNjZmNWFiYWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MTQyOTcsImlhdCI6MTc5MzQxMzM5NywianRpIjoiZDIwNThhM2ItZGIxOC00NWM1LTg3MWUtYTJjNGZiMWNlMjZmIiwic2lkIjoiNDUwMDE3ZTQtYjlkMi00OTBlLTgxYWYtMmNlMWIxZjhhYzRmIn0.vzfejA7JqK43ypw_QxDpgqbULTAv2Ym1gdhByPf-EPw",
  "access_expires_at": "2026-10-31T02:38:17.243278639Z",
  "refresh_token": "yhQ0vDC3HouDFql5VIvD3Af1EGUZ3AXof098VnWebAs",
  "refresh_expires_at": "2026-10-31T14:23:17.242896672Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380679080000` → **200**

```json
{
  "deliveries": [
    {
      "id": "7bb4e4c8-0a2d-43c8-b0b9-d7ce2ea9a886",
      "challenge_id": "a9fece0d-5a3c-48eb-ab98-d636deec1c69",
      "phone": "+380679080000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-a32399b7-b058-40a7-ad4a-45a126fd7033",
      "error": null,
      "attempted_at": "2026-10-31T02:23:15.002853Z"
    },
    {
      "id": "fca0972a-7533-49b1-ae05-57ef6101da76",
      "challenge_id": "e5ffb14c-3594-43e6-a24e-e0851199c2d6",
      "phone": "+380679080000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-56bb66c7-363a-41d5-9be4-cad2f8544776",
      "error": null,
      "attempted_at": "2026-10-31T02:23:13.584964Z"
    },
    {
      "id": "aec993ac-2b59-40c7-924e-fe24e25b7f1d",
      "challenge_id": "ff70275e-deb9-41a1-8b00-11a62d8ccc7a",
      "phone": "+380679080000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-31T02:23:12.189476Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380679080000` → **200**

```json
{
  "phone": "+380679080000",
  "audience": "CLIENT",
  "code": "838299",
  "sent_at": "2026-10-31T02:23:15.002639096Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380679194480` → **200**

```json
{
  "deliveries": [
    {
      "id": "946578fd-4d3b-4ecf-95e4-7aea554934b5",
      "challenge_id": "028dcd2c-4aca-4053-ba6a-85600b406a5f",
      "phone": "+380679194480",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-39602dc6-4940-4a37-8429-d4360310617d",
      "error": null,
      "attempted_at": "2026-10-31T02:23:10.772645Z"
    },
    {
      "id": "4fddf543-31b3-4303-a744-ec86005991d5",
      "challenge_id": "2389cf7c-95e5-4d3f-959c-eb9580a6e2b6",
      "phone": "+380679194480",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-c6f9ecf9-8113-400a-ab29-7888b622c1cc",
      "error": null,
      "attempted_at": "2026-10-31T02:23:09.36348Z"
    }
  ]
}
```

Done: SMS to +380678006926; SMS then a call to +380679194480; a failed SMS, two calls and a refused third to +380679080000; +44 and +371 refused.

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
  "session_id": "e6ee8cdd-dd08-465a-97a4-25f55521302e",
  "subject": {
    "type": "STAFF",
    "id": "13536a6b-90d5-4717-bcad-60e066f5abae"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzUzNmE2Yi05MGQ1LTQ3MTctYmNhZC02MGUwNjZmNWFiYWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MTQyOTgsImlhdCI6MTc5MzQxMzM5OCwianRpIjoiNmM0NTMxMGUtNzNkZi00NTBiLTllMDQtZTJkZDMzZTM2M2ZiIiwic2lkIjoiZTZlZThjZGQtZGQwOC00NjVhLTk3YTQtMjVmNTU1MjEzMDJlIn0.xFDAm2WUN3cwDcq8nTRUMicYUg2NxjxkK63ZPmz2lh0",
  "access_expires_at": "2026-10-31T02:38:18.037062272Z",
  "refresh_token": "ZzhiqDgYv50RfoIIxEcgA8OK4oLtAnrH_k7a5bREOt8",
  "refresh_expires_at": "2026-10-31T14:23:18.036662087Z",
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
  "session_id": "0e4a4c09-70f4-43e0-9f88-c5926a759c26",
  "subject": {
    "type": "STAFF",
    "id": "13536a6b-90d5-4717-bcad-60e066f5abae"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzUzNmE2Yi05MGQ1LTQ3MTctYmNhZC02MGUwNjZmNWFiYWUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MTQyOTgsImlhdCI6MTc5MzQxMzM5OCwianRpIjoiZTRiODFmMDUtNTgzYS00ZTVkLWEwNzgtNWM3ZWJlYWQxMzBiIiwic2lkIjoiMGU0YTRjMDktNzBmNC00M2UwLTlmODgtYzU5MjZhNzU5YzI2In0.z_tI7RitVgIgwiDujA6iv-Vv0Yl4pgZTcwTYtm24ydc",
  "access_expires_at": "2026-10-31T02:38:18.417553689Z",
  "refresh_token": "zs_chlygXcKZAmYGlKCUTBdGLO0V88nwEQNafVvUqNo",
  "refresh_expires_at": "2026-10-31T14:23:18.417205721Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "13536a6b-90d5-4717-bcad-60e066f5abae",
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

`POST /api/admin/v1/staff-extensions/13536a6b-90d5-4717-bcad-60e066f5abae` → **200**

```json
{
  "command_id": "b7a3c7cc-5af6-4ad3-b6a2-f0f3baade316",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "13536a6b-90d5-4717-bcad-60e066f5abae",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "157e5afa-cfb2-499e-90b8-e22606a90692",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-31T02:23:19.179017Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-31T02:23:19.179017Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "60d1a784-8383-4b7f-9429-8134a29347c1",
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
  "id": "f7c7a885-9b46-4c6d-b635-3b52ea96e2c5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T02:28:19.564630Z",
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
  "command_id": "2bbf1a4b-d87c-4a7a-a9be-61c2c175ecc5",
  "quote_id": "f7c7a885-9b46-4c6d-b635-3b52ea96e2c5",
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
    "phone": "+380676909854"
  }
}
```

```json
{
  "id": "5120d0b1-9d9c-423a-a3c4-be3c57a25adb",
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
  "created_at": "2026-10-31T02:23:19.756635Z",
  "caller": {
    "name": "Caller",
    "phone": "+380676909854"
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

`POST /api/operator/v1/orders/5120d0b1-9d9c-423a-a3c4-be3c57a25adb/calls` → **201**

```json
{
  "command_id": "6506a011-bcf0-47d4-8e76-d675095fb9a9",
  "to": "CALLER"
}
```

```json
{
  "id": "027e2c9e-737b-46d6-bd4b-98b95fcd19be",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "13536a6b-90d5-4717-bcad-60e066f5abae",
  "order_ids": [
    "5120d0b1-9d9c-423a-a3c4-be3c57a25adb"
  ],
  "started_at": "2026-10-31T02:23:19.985355Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/5120d0b1-9d9c-423a-a3c4-be3c57a25adb/calls` → **201**

```json
{
  "command_id": "6506a011-bcf0-47d4-8e76-d675095fb9a9",
  "to": "CALLER"
}
```

```json
{
  "id": "027e2c9e-737b-46d6-bd4b-98b95fcd19be",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "13536a6b-90d5-4717-bcad-60e066f5abae",
  "order_ids": [
    "5120d0b1-9d9c-423a-a3c4-be3c57a25adb"
  ],
  "started_at": "2026-10-31T02:23:19.985355Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "027e2c9e-737b-46d6-bd4b-98b95fcd19be",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380676909854",
    "at": "2026-10-31T02:23:19.987179154Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "027e2c9e-737b-46d6-bd4b-98b95fcd19be",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.1450",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "027e2c9e-737b-46d6-bd4b-98b95fcd19be"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "027e2c9e-737b-46d6-bd4b-98b95fcd19be",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=5120d0b1-9d9c-423a-a3c4-be3c57a25adb` → **200**

```json
{
  "calls": [
    {
      "id": "027e2c9e-737b-46d6-bd4b-98b95fcd19be",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "13536a6b-90d5-4717-bcad-60e066f5abae",
      "order_ids": [
        "5120d0b1-9d9c-423a-a3c4-be3c57a25adb"
      ],
      "started_at": "2026-10-31T02:23:19.985355Z",
      "answered_at": "2026-10-31T02:23:20.441757Z",
      "ended_at": "2026-10-31T02:23:20.457423Z",
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

`GET /api/operator/v1/calls?order_id=5120d0b1-9d9c-423a-a3c4-be3c57a25adb` → **200**

```json
{
  "calls": [
    {
      "id": "027e2c9e-737b-46d6-bd4b-98b95fcd19be",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "13536a6b-90d5-4717-bcad-60e066f5abae",
      "order_ids": [
        "5120d0b1-9d9c-423a-a3c4-be3c57a25adb"
      ],
      "started_at": "2026-10-31T02:23:19.985355Z",
      "answered_at": "2026-10-31T02:23:20.441757Z",
      "ended_at": "2026-10-31T02:23:20.457423Z",
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

`GET /api/operator/v1/calls?order_id=5120d0b1-9d9c-423a-a3c4-be3c57a25adb` → **200**

```json
{
  "calls": [
    {
      "id": "027e2c9e-737b-46d6-bd4b-98b95fcd19be",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "13536a6b-90d5-4717-bcad-60e066f5abae",
      "order_ids": [
        "5120d0b1-9d9c-423a-a3c4-be3c57a25adb"
      ],
      "started_at": "2026-10-31T02:23:19.985355Z",
      "answered_at": "2026-10-31T02:23:20.441757Z",
      "ended_at": "2026-10-31T02:23:20.457423Z",
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

`GET /api/operator/v1/calls?order_id=5120d0b1-9d9c-423a-a3c4-be3c57a25adb` → **200**

```json
{
  "calls": [
    {
      "id": "027e2c9e-737b-46d6-bd4b-98b95fcd19be",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "13536a6b-90d5-4717-bcad-60e066f5abae",
      "order_ids": [
        "5120d0b1-9d9c-423a-a3c4-be3c57a25adb"
      ],
      "started_at": "2026-10-31T02:23:19.985355Z",
      "answered_at": "2026-10-31T02:23:20.441757Z",
      "ended_at": "2026-10-31T02:23:20.457423Z",
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

`GET /api/operator/v1/calls?order_id=5120d0b1-9d9c-423a-a3c4-be3c57a25adb` → **200**

```json
{
  "calls": [
    {
      "id": "027e2c9e-737b-46d6-bd4b-98b95fcd19be",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "13536a6b-90d5-4717-bcad-60e066f5abae",
      "order_ids": [
        "5120d0b1-9d9c-423a-a3c4-be3c57a25adb"
      ],
      "started_at": "2026-10-31T02:23:19.985355Z",
      "answered_at": "2026-10-31T02:23:20.441757Z",
      "ended_at": "2026-10-31T02:23:20.457423Z",
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

`GET /api/operator/v1/calls?order_id=5120d0b1-9d9c-423a-a3c4-be3c57a25adb` → **200**

```json
{
  "calls": [
    {
      "id": "027e2c9e-737b-46d6-bd4b-98b95fcd19be",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "13536a6b-90d5-4717-bcad-60e066f5abae",
      "order_ids": [
        "5120d0b1-9d9c-423a-a3c4-be3c57a25adb"
      ],
      "started_at": "2026-10-31T02:23:19.985355Z",
      "answered_at": "2026-10-31T02:23:20.441757Z",
      "ended_at": "2026-10-31T02:23:20.457423Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-31T02:23:30.277159Z"
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

`GET /api/operator/v1/orders/5120d0b1-9d9c-423a-a3c4-be3c57a25adb` → **200**

```json
{
  "id": "5120d0b1-9d9c-423a-a3c4-be3c57a25adb",
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
  "created_at": "2026-10-31T02:23:19.756635Z",
  "caller": {
    "name": "Caller",
    "phone": "+380676909854"
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

`POST /api/operator/v1/orders/5120d0b1-9d9c-423a-a3c4-be3c57a25adb/cancel` → **200**

```json
{
  "command_id": "bff9e778-c7e4-4ddc-a0d4-54c6a10eba70",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "5120d0b1-9d9c-423a-a3c4-be3c57a25adb",
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
  "created_at": "2026-10-31T02:23:19.756635Z",
  "caller": {
    "name": "Caller",
    "phone": "+380676909854"
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
  "command_id": "db2b5ac5-76e6-4ccc-a0f4-3a9dfbc6205d",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-31T02:23:32.066092Z",
  "extension": "101"
}
```

Done: outgoing call 027e2c9e-737b-46d6-bd4b-98b95fcd19be from order 5120d0b1-9d9c-423a-a3c4-be3c57a25adb, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632517778",
  "device_ref": "sandbox-31873"
}
```

```json
{
  "challenge_id": "a46a67ec-4cc3-4ae8-8af3-3848ce2e533e",
  "expires_at": "2026-10-31T02:28:32.260258844Z",
  "resend_available_at": "2026-10-31T02:23:33.260258844Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632517778` → **200**

```json
{
  "phone": "+380632517778",
  "audience": "CLIENT",
  "code": "847488",
  "sent_at": "2026-10-31T02:23:32.262192999Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a46a67ec-4cc3-4ae8-8af3-3848ce2e533e",
  "code": "847488",
  "device_ref": "sandbox-31873"
}
```

```json
{
  "session_id": "f048be59-552d-4b62-826a-ac3afdb694bf",
  "subject": {
    "type": "CLIENT",
    "id": "7053ecf9-f6f2-4ace-976b-1dfbf3d9e14d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MDUzZWNmOS1mNmYyLTRhY2UtOTc2Yi0xZGZiZjNkOWUxNGQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDE0MzEyLCJpYXQiOjE3OTM0MTM0MTIsImp0aSI6IjVhMzg2ZmIyLTBmZWQtNGJjMC05N2RkLWJlZWRmY2MwYTRhMSIsInNpZCI6ImYwNDhiZTU5LTU1MmQtNGI2Mi04MjZhLWFjM2FmZGI2OTRiZiJ9.OrxUKrRjV0K9J5p7li4SMSRuQjkcWXmehcGalzD0FU4",
  "access_expires_at": "2026-10-31T02:38:32.463703706Z",
  "refresh_token": "l3I8ArIZlYHjDcKVkFCGypW3LXtVc09fNgs51JUa9Qc",
  "refresh_expires_at": "2026-11-30T02:23:32.463287703Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "7053ecf9-f6f2-4ace-976b-1dfbf3d9e14d",
  "session_id": "f048be59-552d-4b62-826a-ac3afdb694bf",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632517778",
  "device_ref": "sandbox-26558"
}
```

```json
{
  "challenge_id": "41f5c5cc-a8ae-471b-b48c-98df8f7016af",
  "expires_at": "2026-10-31T02:28:34.82688438Z",
  "resend_available_at": "2026-10-31T02:23:35.82688438Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632517778` → **200**

```json
{
  "phone": "+380632517778",
  "audience": "CLIENT",
  "code": "862397",
  "sent_at": "2026-10-31T02:23:34.828426683Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "41f5c5cc-a8ae-471b-b48c-98df8f7016af",
  "code": "862397",
  "device_ref": "sandbox-26558"
}
```

```json
{
  "session_id": "0c99f1c2-a7c6-47dc-b917-a5ec60e2ddef",
  "subject": {
    "type": "CLIENT",
    "id": "7053ecf9-f6f2-4ace-976b-1dfbf3d9e14d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MDUzZWNmOS1mNmYyLTRhY2UtOTc2Yi0xZGZiZjNkOWUxNGQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDE0MzE1LCJpYXQiOjE3OTM0MTM0MTUsImp0aSI6ImI0YjgyYzMyLThmM2QtNDU3Ni05ZGQ1LThmNmQyMWRjNmIyZSIsInNpZCI6IjBjOTlmMWMyLWE3YzYtNDdkYy1iOTE3LWE1ZWM2MGUyZGRlZiJ9.dOinASZeo6LWlI7pNQjdfe-FzmEqYIVGGKAyxWCCH6E",
  "access_expires_at": "2026-10-31T02:38:35.029111783Z",
  "refresh_token": "cNQX5ISraUulgOZzvfwnhnbgXf43oljCIHXK12Tkpw4",
  "refresh_expires_at": "2026-11-30T02:23:35.028725518Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "757f7a55-703c-4a07-b9f9-bfb1d5b470a1",
  "expires_at": "2026-10-31T02:28:37.214136904Z",
  "resend_available_at": "2026-10-31T02:23:38.214136904Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632517778` → **200**

```json
{
  "phone": "+380632517778",
  "audience": "CLIENT",
  "code": "191864",
  "sent_at": "2026-10-31T02:23:37.215600226Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380632474732"
}
```

```json
{
  "challenge_id": "9c9ac52c-27e4-491f-8046-0c333999cae8",
  "expires_at": "2026-10-31T02:28:37.412418864Z",
  "resend_available_at": "2026-10-31T02:23:38.412418864Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632474732` → **200**

```json
{
  "phone": "+380632474732",
  "audience": "CLIENT",
  "code": "602973",
  "sent_at": "2026-10-31T02:23:37.414089654Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "dde56aaa-c6db-470d-96eb-f0e6c74ade2a",
  "current_challenge_id": "757f7a55-703c-4a07-b9f9-bfb1d5b470a1",
  "current_code": "000000",
  "new_challenge_id": "9c9ac52c-27e4-491f-8046-0c333999cae8",
  "new_code": "602973"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "85ae08a8-c089-46d6-af16-92cd47b8a0cc"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "20b3146e-1923-4752-ab7c-6f08ef1f7bfd",
  "current_challenge_id": "757f7a55-703c-4a07-b9f9-bfb1d5b470a1",
  "current_code": "191864",
  "new_challenge_id": "9c9ac52c-27e4-491f-8046-0c333999cae8",
  "new_code": "602973"
}
```

```json
{
  "subject_id": "7053ecf9-f6f2-4ace-976b-1dfbf3d9e14d",
  "phone": "+380632474732",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "7053ecf9-f6f2-4ace-976b-1dfbf3d9e14d",
  "session_id": "f048be59-552d-4b62-826a-ac3afdb694bf",
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
  "correlation_id": "b7c1cae1-4698-4aa4-881b-f6906341376c"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632474732",
  "device_ref": "sandbox-2088"
}
```

```json
{
  "challenge_id": "b6a7f990-59a1-47ca-92bd-7ae5853e9b6f",
  "expires_at": "2026-10-31T02:28:40.378948702Z",
  "resend_available_at": "2026-10-31T02:23:41.378948702Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632474732` → **200**

```json
{
  "phone": "+380632474732",
  "audience": "CLIENT",
  "code": "413294",
  "sent_at": "2026-10-31T02:23:40.380512476Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b6a7f990-59a1-47ca-92bd-7ae5853e9b6f",
  "code": "413294",
  "device_ref": "sandbox-2088"
}
```

```json
{
  "session_id": "6002bbf7-8081-4d76-913d-c1028f8be158",
  "subject": {
    "type": "CLIENT",
    "id": "7053ecf9-f6f2-4ace-976b-1dfbf3d9e14d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MDUzZWNmOS1mNmYyLTRhY2UtOTc2Yi0xZGZiZjNkOWUxNGQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDE0MzIwLCJpYXQiOjE3OTM0MTM0MjAsImp0aSI6IjQ1MGVlMWYwLWQ0ZDgtNDQ4YS1hMmY0LWIxNDQwNGE2N2ZlYyIsInNpZCI6IjYwMDJiYmY3LTgwODEtNGQ3Ni05MTNkLWMxMDI4ZjhiZTE1OCJ9.UKuHHTpYtUQhITNIvihpbNdsVS4giUm5CFxdH9HUMik",
  "access_expires_at": "2026-10-31T02:38:40.596153729Z",
  "refresh_token": "xomPcl5-mKCikty4AimQ1SAEgLo35WTICuxIFdVwHSI",
  "refresh_expires_at": "2026-11-30T02:23:40.595744715Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "7053ecf9-f6f2-4ace-976b-1dfbf3d9e14d",
  "session_id": "6002bbf7-8081-4d76-913d-c1028f8be158",
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
  "session_id": "dcca20f6-aa06-4e0f-8010-013d53af2083",
  "subject": {
    "type": "STAFF",
    "id": "13536a6b-90d5-4717-bcad-60e066f5abae"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzUzNmE2Yi05MGQ1LTQ3MTctYmNhZC02MGUwNjZmNWFiYWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MTQzMjEsImlhdCI6MTc5MzQxMzQyMSwianRpIjoiZWNiMDgyYzctOGQyYS00YzlkLTg1ODQtNzBiNTQ5ODkwZDhiIiwic2lkIjoiZGNjYTIwZjYtYWEwNi00ZTBmLTgwMTAtMDEzZDUzYWYyMDgzIn0.v0gwRGv_UrIDzMJlU9oXu_sf5L46BDOtYSX7pLcIrkA",
  "access_expires_at": "2026-10-31T02:38:41.195621423Z",
  "refresh_token": "GCzZ2q-wx9HHClzd76xPrcMHC2rJPHHoUP1eDrI50Y4",
  "refresh_expires_at": "2026-10-31T14:23:41.195239104Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/7053ecf9-f6f2-4ace-976b-1dfbf3d9e14d` → **200**

```json
{
  "client": {
    "id": "7053ecf9-f6f2-4ace-976b-1dfbf3d9e14d",
    "phone": "+380632474732",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-31T02:23:32.461875Z",
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

`POST /api/admin/v1/clients/7053ecf9-f6f2-4ace-976b-1dfbf3d9e14d/phone/new-code` → **201**

```json
{
  "phone": "+380631668062"
}
```

```json
{
  "challenge_id": "377ff36a-9336-471c-b3f4-d241c57f40dd",
  "expires_at": "2026-10-31T02:28:41.589862695Z",
  "resend_available_at": "2026-10-31T02:23:42.589862695Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631668062` → **200**

```json
{
  "phone": "+380631668062",
  "audience": "CLIENT",
  "code": "448968",
  "sent_at": "2026-10-31T02:23:41.591235856Z",
  "channel": "SMS"
}
```

## Without the right code nothing changes; with it, support sets the phone

`POST /api/admin/v1/clients/7053ecf9-f6f2-4ace-976b-1dfbf3d9e14d/phone` → **422**

```json
{
  "command_id": "4fe53a5d-30f5-4b07-914d-abbcbb211962",
  "expected_version": 3,
  "new_challenge_id": "377ff36a-9336-471c-b3f4-d241c57f40dd",
  "new_code": "448969",
  "reason": "Passport checked at the office"
}
```

```json
{
  "instance": "/api/admin/v1/clients/7053ecf9-f6f2-4ace-976b-1dfbf3d9e14d/phone",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "3389450b-b99d-442f-9e2f-3f26027851ca"
}
```

`POST /api/admin/v1/clients/7053ecf9-f6f2-4ace-976b-1dfbf3d9e14d/phone` → **400**

```json
{
  "command_id": "2dea1bcf-e839-46c8-aa2e-0786dbdb7ea4",
  "expected_version": 3,
  "new_challenge_id": "377ff36a-9336-471c-b3f4-d241c57f40dd",
  "new_code": "448968",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/7053ecf9-f6f2-4ace-976b-1dfbf3d9e14d/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "96b4bfbc-f2f8-46f1-953a-0e9494026528",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

`POST /api/admin/v1/clients/7053ecf9-f6f2-4ace-976b-1dfbf3d9e14d/phone` → **200**

```json
{
  "command_id": "27d0bce3-72dd-49f5-9c90-1fa707edaaee",
  "expected_version": 3,
  "new_challenge_id": "377ff36a-9336-471c-b3f4-d241c57f40dd",
  "new_code": "448968",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "7053ecf9-f6f2-4ace-976b-1dfbf3d9e14d",
  "phone": "+380631668062",
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
  "correlation_id": "0c8cd9d7-3cf6-4abd-89a0-1c721c71ff02"
}
```

`POST /auth/v1/otp/challenges` → **429**

```json
{
  "audience": "CLIENT",
  "phone": "+380631668062",
  "device_ref": "sandbox-28048"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "366fd4e3-7cb4-44df-b414-1f28fbdb88db",
  "retryable": true,
  "retry_after_seconds": 1
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631668062",
  "device_ref": "sandbox-28048"
}
```

```json
{
  "challenge_id": "757930ba-3919-40c1-8cc7-eb1559bd0385",
  "expires_at": "2026-10-31T02:28:43.743763255Z",
  "resend_available_at": "2026-10-31T02:23:44.743763255Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631668062` → **200**

```json
{
  "phone": "+380631668062",
  "audience": "CLIENT",
  "code": "946544",
  "sent_at": "2026-10-31T02:23:43.745477683Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "757930ba-3919-40c1-8cc7-eb1559bd0385",
  "code": "946544",
  "device_ref": "sandbox-28048"
}
```

```json
{
  "session_id": "e0d12d9e-bee4-4e5f-ad0b-dfdc1c6f6e8f",
  "subject": {
    "type": "CLIENT",
    "id": "7053ecf9-f6f2-4ace-976b-1dfbf3d9e14d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MDUzZWNmOS1mNmYyLTRhY2UtOTc2Yi0xZGZiZjNkOWUxNGQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDE0MzIzLCJpYXQiOjE3OTM0MTM0MjMsImp0aSI6ImNmYzcxYjQ3LWExYTUtNDhlNy05YThmLTFhNWEyZDJjMjUxYiIsInNpZCI6ImUwZDEyZDllLWJlZTQtNGU1Zi1hZDBiLWRmZGMxYzZmNmU4ZiJ9.BKiDvMXl20QpzZ-uE-vl1CrIKHbm6gQG6_LJXD19LGQ",
  "access_expires_at": "2026-10-31T02:38:43.953054537Z",
  "refresh_token": "elOoOnnrETdQGwOv4JkilhU9vtPM0e1SKZ-eDqOgNcg",
  "refresh_expires_at": "2026-11-30T02:23:43.952724296Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "7053ecf9-f6f2-4ace-976b-1dfbf3d9e14d",
  "session_id": "e0d12d9e-bee4-4e5f-ad0b-dfdc1c6f6e8f",
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
  "phone": "+380630441427",
  "device_ref": "sandbox-2712"
}
```

```json
{
  "challenge_id": "54295549-973a-4931-a0b4-3d2935e0e64a",
  "expires_at": "2026-10-31T02:28:44.329000557Z",
  "resend_available_at": "2026-10-31T02:23:45.329000557Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380630441427` → **200**

```json
{
  "phone": "+380630441427",
  "audience": "CLIENT",
  "code": "555933",
  "sent_at": "2026-10-31T02:23:44.330900139Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "54295549-973a-4931-a0b4-3d2935e0e64a",
  "code": "555933",
  "device_ref": "sandbox-2712"
}
```

```json
{
  "session_id": "44f0fa4a-4ff0-4254-9d7f-4af43afcfcd6",
  "subject": {
    "type": "CLIENT",
    "id": "8713def9-e1ea-4784-ace2-049c6aa0e424"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NzEzZGVmOS1lMWVhLTQ3ODQtYWNlMi0wNDljNmFhMGU0MjQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDE0MzI0LCJpYXQiOjE3OTM0MTM0MjQsImp0aSI6IjE5ZGU2YjUyLTBiNDEtNDgwOS04YWViLTY1ZDg5YmYyYmUyZCIsInNpZCI6IjQ0ZjBmYTRhLTRmZjAtNDI1NC05ZDdmLTRhZjQzYWZjZmNkNiJ9.pbq1mI6lyBWFlmkkKXj9wvrHSYaCq8NXK3SA4pxn9Ew",
  "access_expires_at": "2026-10-31T02:38:44.537466845Z",
  "refresh_token": "ArRCuwQlQYruz9BHRP5vabt-jvtlsWiGsFx9wLniPZ0",
  "refresh_expires_at": "2026-11-30T02:23:44.537138737Z",
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
  "session_id": "c82d8de9-2f17-46f6-9f11-2f1cd80d5e50",
  "subject": {
    "type": "STAFF",
    "id": "13536a6b-90d5-4717-bcad-60e066f5abae"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzUzNmE2Yi05MGQ1LTQ3MTctYmNhZC02MGUwNjZmNWFiYWUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MTQzMjUsImlhdCI6MTc5MzQxMzQyNSwianRpIjoiZmM3N2NiYWYtMjBlOS00NTExLWI2MTYtMWViMGEyNzA3NGMzIiwic2lkIjoiYzgyZDhkZTktMmYxNy00NmY2LTlmMTEtMmYxY2Q4MGQ1ZTUwIn0.w1MM-6Z4zM-KK9ANYnjtz5gf5DMk9ppsXLP_3MLLDVM",
  "access_expires_at": "2026-10-31T02:38:45.310799999Z",
  "refresh_token": "NZxEPEPTW8uHHjX4pyCnw-36zVOHXmBkK19lCOnO-v0",
  "refresh_expires_at": "2026-10-31T14:23:45.31040657Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380630441427` → **200**

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
  "correlation_id": "53f9d36f-4abb-4dc7-806c-1b10d06872de"
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
  "session_id": "5b34e7de-6493-4455-a005-e00d9b6ffdb9",
  "subject": {
    "type": "STAFF",
    "id": "13536a6b-90d5-4717-bcad-60e066f5abae"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzUzNmE2Yi05MGQ1LTQ3MTctYmNhZC02MGUwNjZmNWFiYWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MTQzMjYsImlhdCI6MTc5MzQxMzQyNiwianRpIjoiZGZmNmZjNzUtYWZiNy00MTc5LTg1MWItMDliNTU1M2RkY2E2Iiwic2lkIjoiNWIzNGU3ZGUtNjQ5My00NDU1LWEwMDUtZTAwZDliNmZmZGI5In0.UCcNfKWx0-4NK7J2BNo75l1BrJc6t3f34FYj2av01MU",
  "access_expires_at": "2026-10-31T02:38:46.06745646Z",
  "refresh_token": "iO9vnm560NonTk5rPQMiAjT8G5FxmK2NIhxLV9lFx4o",
  "refresh_expires_at": "2026-10-31T14:23:46.067116995Z",
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
  "changed_by": "13536a6b-90d5-4717-bcad-60e066f5abae",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-31T02:06:35.116548Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "97e30232-af51-4b12-a0db-5e7682b6e228",
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
  "changed_by": "13536a6b-90d5-4717-bcad-60e066f5abae",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-31T02:23:46.446851587Z"
}
```

## The rider books the airport for 2026-10-31T05:23:45Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600452065",
  "device_ref": "sandbox-5958"
}
```

```json
{
  "challenge_id": "3165281c-8f80-4496-8029-e365dbe3fb2d",
  "expires_at": "2026-10-31T02:28:46.647492716Z",
  "resend_available_at": "2026-10-31T02:23:47.647492716Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600452065` → **200**

```json
{
  "phone": "+48600452065",
  "audience": "CLIENT",
  "code": "156717",
  "sent_at": "2026-10-31T02:23:46.649376995Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3165281c-8f80-4496-8029-e365dbe3fb2d",
  "code": "156717",
  "device_ref": "sandbox-5958"
}
```

```json
{
  "session_id": "668cc9ca-74a1-4867-9d3d-55a98d85334a",
  "subject": {
    "type": "CLIENT",
    "id": "afeca666-0839-4d26-a114-4e08ac0e4955"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZmVjYTY2Ni0wODM5LTRkMjYtYTExNC00ZTA4YWMwZTQ5NTUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDE0MzI2LCJpYXQiOjE3OTM0MTM0MjYsImp0aSI6IjQ3MzU0MGY2LTc2MWUtNDgxMi04OTZmLThmZGFlZWRkNzRiYyIsInNpZCI6IjY2OGNjOWNhLTc0YTEtNDg2Ny05ZDNkLTU1YTk4ZDg1MzM0YSJ9.ewBy4FRd_LLbqaBSJtiEmerKHdu3-DDOABRweNFTCHg",
  "access_expires_at": "2026-10-31T02:38:46.856633476Z",
  "refresh_token": "Kj5wmM0LFBGTmQotaINWgQSX9U-s3yMQgcoD0xTbpd8",
  "refresh_expires_at": "2026-11-30T02:23:46.856304307Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1f92d263-043f-47d5-802c-44fdc71dba14",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-31T05:23:45Z"
}
```

```json
{
  "id": "6ab57781-48b4-447b-81cc-7502b383fab4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T02:28:47.045360Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-31T05:23:45Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "6f6397c7-7433-4a5b-9610-bd9f55025745",
  "quote_id": "6ab57781-48b4-447b-81cc-7502b383fab4",
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
  "pickup_at": "2026-10-31T05:23:45Z"
}
```

```json
{
  "id": "0dec10de-ff08-4050-8125-5c7f012675cc",
  "short_number": 35,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "afeca666-0839-4d26-a114-4e08ac0e4955",
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
  "created_at": "2026-10-31T02:23:47.244437Z",
  "cancellation": null,
  "pickup_at": "2026-10-31T05:23:45Z",
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
  "device_ref": "sandbox-11917"
}
```

```json
{
  "challenge_id": "6eb2cc92-8d16-402e-9e2b-43d845c8f63e",
  "expires_at": "2026-10-31T02:28:47.449394435Z",
  "resend_available_at": "2026-10-31T02:23:48.449394435Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "106312",
  "sent_at": "2026-10-31T02:23:47.451294328Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6eb2cc92-8d16-402e-9e2b-43d845c8f63e",
  "code": "106312",
  "device_ref": "sandbox-11917"
}
```

```json
{
  "session_id": "8714ec4f-b9ff-4f9c-91ec-7e5d67eccbd4",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQxNDMyNywiaWF0IjoxNzkzNDEzNDI3LCJqdGkiOiIxZDE2MWFlNS04OGRjLTQ1YTEtYWQ5NC0yYTdmMmFkMWY2ODIiLCJzaWQiOiI4NzE0ZWM0Zi1iOWZmLTRmOWMtOTFlYy03ZTVkNjdlY2NiZDQifQ.nWV6L6Trfr-P9qc7Fy4QswQzkW5PEji7DTftspjkWBk",
  "access_expires_at": "2026-10-31T02:38:47.656533171Z",
  "refresh_token": "uWklI8SRtWF35UXIrmnXQMAaZcJ09F3hBmGHklLZYjk",
  "refresh_expires_at": "2026-11-30T02:23:47.656198163Z",
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
  "command_id": "f4fda863-e9f9-434f-97b3-c519a4d0c7ce",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T02:23:48Z",
    "sequence": 1793413428317
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "23e7cc31-b5a6-41cb-a822-365801febe2e",
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
  "last_heartbeat_at": "2026-10-31T02:23:48.045632Z",
  "last_location_at": "2026-10-31T02:23:48.045632Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "0dec10de-ff08-4050-8125-5c7f012675cc",
      "short_number": 35,
      "pickup_at": "2026-10-31T05:23:45Z",
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

`POST /api/driver/v1/preorders/0dec10de-ff08-4050-8125-5c7f012675cc/reserve` → **200**

```json
{
  "command_id": "3223e5d3-61f5-4234-a64d-690c0ea8af29"
}
```

```json
{
  "id": "8d53b40d-d847-45a0-a4f4-9793ac9b8ec6",
  "state": "RESERVED",
  "order": {
    "order_id": "0dec10de-ff08-4050-8125-5c7f012675cc",
    "short_number": 35,
    "pickup_at": "2026-10-31T05:23:45Z",
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
  "reserved_at": "2026-10-31T02:23:48.430049Z",
  "confirm_from": "2026-10-31T04:53:45Z",
  "confirm_until": "2026-10-31T05:03:45Z",
  "drop_until": "2026-10-31T04:23:45Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "8d53b40d-d847-45a0-a4f4-9793ac9b8ec6",
      "state": "RESERVED",
      "order": {
        "order_id": "0dec10de-ff08-4050-8125-5c7f012675cc",
        "short_number": 35,
        "pickup_at": "2026-10-31T05:23:45Z",
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
      "reserved_at": "2026-10-31T02:23:48.430049Z",
      "confirm_from": "2026-10-31T04:53:45Z",
      "confirm_until": "2026-10-31T05:03:45Z",
      "drop_until": "2026-10-31T04:23:45Z"
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
      "id": "8d53b40d-d847-45a0-a4f4-9793ac9b8ec6",
      "state": "RESERVED",
      "order": {
        "order_id": "0dec10de-ff08-4050-8125-5c7f012675cc",
        "short_number": 35,
        "pickup_at": "2026-10-31T05:23:45Z",
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
      "reserved_at": "2026-10-31T02:23:48.430049Z",
      "confirm_from": "2026-10-31T04:53:45Z",
      "confirm_until": "2026-10-31T05:03:45Z",
      "drop_until": "2026-10-31T04:23:45Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/8d53b40d-d847-45a0-a4f4-9793ac9b8ec6/confirm` → **409**

```json
{
  "command_id": "2873a767-879f-49ef-abf3-047aba50874a"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/8d53b40d-d847-45a0-a4f4-9793ac9b8ec6/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "825f06ee-e11b-4a7f-95e0-b83e2df19654"
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
  "session_id": "177d867c-8d5e-46dd-9f7c-389adf0fe717",
  "subject": {
    "type": "STAFF",
    "id": "13536a6b-90d5-4717-bcad-60e066f5abae"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzUzNmE2Yi05MGQ1LTQ3MTctYmNhZC02MGUwNjZmNWFiYWUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MTQzMjksImlhdCI6MTc5MzQxMzQyOSwianRpIjoiZjdmN2FhY2ItOWE2YS00NDY2LTgzNzctN2EyNzgyYTk3MzBjIiwic2lkIjoiMTc3ZDg2N2MtOGQ1ZS00NmRkLTlmN2MtMzg5YWRmMGZlNzE3In0.QW8DXhwLusQasu_hlSiI5IDJfk2FfpxUo78Q0eh7x_c",
  "access_expires_at": "2026-10-31T02:38:49.376947782Z",
  "refresh_token": "fI0uzIBixIRui3-BvTlYnxw7GZec_iZvmlz58M91x94",
  "refresh_expires_at": "2026-10-31T14:23:49.376593726Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/0dec10de-ff08-4050-8125-5c7f012675cc` → **200**

```json
{
  "id": "0dec10de-ff08-4050-8125-5c7f012675cc",
  "short_number": 35,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "afeca666-0839-4d26-a114-4e08ac0e4955",
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
  "created_at": "2026-10-31T02:23:47.244437Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-31T05:23:45Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "8d53b40d-d847-45a0-a4f4-9793ac9b8ec6",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-31T02:23:48.430049Z"
  },
  "related_order_id": null,
  "driver": null,
  "driver_change": null,
  "comment": null,
  "entrance": null
}
```

`GET /api/operator/v1/orders/0dec10de-ff08-4050-8125-5c7f012675cc/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-31T02:23:47.245202Z",
      "actor": {
        "type": "CLIENT",
        "id": "afeca666-0839-4d26-a114-4e08ac0e4955",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "0dec10de-ff08-4050-8125-5c7f012675cc",
        "preorder": true,
        "quote_id": "6ab57781-48b4-447b-81cc-7502b383fab4",
        "pickup_at": "2026-10-31T05:23:45Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "ab31fbfc-4638-4ef0-bda8-f57993d9adaa"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-31T02:23:48.430832Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "0dec10de-ff08-4050-8125-5c7f012675cc",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "8d53b40d-d847-45a0-a4f4-9793ac9b8ec6"
      },
      "correlation_id": "4e8fd8cf-4fe0-41f4-b410-54d8fa10c94c"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order 0dec10de-ff08-4050-8125-5c7f012675cc, reservation 8d53b40d-d847-45a0-a4f4-9793ac9b8ec6.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-17060"
}
```

```json
{
  "challenge_id": "6d18105a-9769-4bee-b93b-e43e90115c8e",
  "expires_at": "2026-10-31T02:28:49.966739971Z",
  "resend_available_at": "2026-10-31T02:23:50.966739971Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "026428",
  "sent_at": "2026-10-31T02:23:49.968533715Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6d18105a-9769-4bee-b93b-e43e90115c8e",
  "code": "026428",
  "device_ref": "sandbox-17060"
}
```

```json
{
  "session_id": "e99e8226-629e-47bb-a770-b3fd5aa4fb47",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQxNDMzMCwiaWF0IjoxNzkzNDEzNDMwLCJqdGkiOiJhNzRmYmExMS0zN2UyLTQ3Y2YtYmVmMi1mNDVhYTRiMDA4OTEiLCJzaWQiOiJlOTllODIyNi02MjllLTQ3YmItYTc3MC1iM2ZkNWFhNGZiNDcifQ.5UVWP1XD0uDl-hNfIUtI4k6oKxhpZtc1P0DrFksN6yg",
  "access_expires_at": "2026-10-31T02:38:50.16574243Z",
  "refresh_token": "AY5k9E6ySL75ihWAyFvYLm5SAJQ8ztf2MRbSnpnlz2c",
  "refresh_expires_at": "2026-11-30T02:23:50.165296859Z",
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
  "command_id": "f71ace05-8f63-4756-8315-58ba4d38d39a",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T02:23:50Z",
    "sequence": 1793413430543
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "aeb987f2-d280-4f8f-9eb0-a70228477b7f",
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
  "last_heartbeat_at": "2026-10-31T02:23:50.556825Z",
  "last_location_at": "2026-10-31T02:23:50.556825Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673398716",
  "device_ref": "sandbox-4134"
}
```

```json
{
  "challenge_id": "0c00c540-4845-4ed0-81a9-d4909031065e",
  "expires_at": "2026-10-31T02:28:50.737232485Z",
  "resend_available_at": "2026-10-31T02:23:51.737232485Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380673398716` → **200**

```json
{
  "phone": "+380673398716",
  "audience": "CLIENT",
  "code": "547742",
  "sent_at": "2026-10-31T02:23:50.738963998Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0c00c540-4845-4ed0-81a9-d4909031065e",
  "code": "547742",
  "device_ref": "sandbox-4134"
}
```

```json
{
  "session_id": "dd7cf84b-de10-4846-be31-96de2ef51aee",
  "subject": {
    "type": "CLIENT",
    "id": "19f562e3-107f-43f2-a5a9-4060e260d174"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWY1NjJlMy0xMDdmLTQzZjItYTVhOS00MDYwZTI2MGQxNzQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDE0MzMwLCJpYXQiOjE3OTM0MTM0MzAsImp0aSI6ImE2YWQzNzAwLTI2OTktNDI1Yy05ZmFhLTJjNWJhZGQ3NDJjMSIsInNpZCI6ImRkN2NmODRiLWRlMTAtNDg0Ni1iZTMxLTk2ZGUyZWY1MWFlZSJ9.t07eUhUfypgbT5VMvM21dQBrmuske4ygfMO6-7bI4H0",
  "access_expires_at": "2026-10-31T02:38:50.940246436Z",
  "refresh_token": "6zV9CwaYsx-ISUxw1YvS3sA5MWjb7I2daZRtayj4PjQ",
  "refresh_expires_at": "2026-11-30T02:23:50.939929495Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b5567147-be81-4052-a1e8-7f49dab2d348",
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
  "id": "d722285c-baa0-40b8-9dfd-4be820188cc2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T02:28:51.134870Z",
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
  "command_id": "878a6631-4137-4b5e-9fbe-3d0474365b13",
  "quote_id": "d722285c-baa0-40b8-9dfd-4be820188cc2",
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
  "id": "0338d1fe-e02c-4008-b24d-8dfe71b60dc9",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "19f562e3-107f-43f2-a5a9-4060e260d174",
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
  "created_at": "2026-10-31T02:23:51.334658Z",
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
    "id": "72d86dbe-cc5f-4ecd-b966-3c2c6fc2ff84",
    "order_id": "0338d1fe-e02c-4008-b24d-8dfe71b60dc9",
    "expires_at": "2026-10-31T02:24:06.336459Z",
    "server_time": "2026-10-31T02:23:51.541933889Z",
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

`POST /api/driver/v1/offers/72d86dbe-cc5f-4ecd-b966-3c2c6fc2ff84/accept` → **200**

```json
{
  "command_id": "96fd1894-bdd7-46ec-8b48-f1fba9183ca6"
}
```

```json
{
  "id": "5e6b0f42-ff0b-4a35-85e1-ec11a1b63e18",
  "order_id": "0338d1fe-e02c-4008-b24d-8dfe71b60dc9",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "bea30b89-2cd4-4864-8813-c1f869885b25",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "bea30b89-2cd4-4864-8813-c1f869885b25",
  "order_id": "0338d1fe-e02c-4008-b24d-8dfe71b60dc9",
  "assignment_id": "5e6b0f42-ff0b-4a35-85e1-ec11a1b63e18",
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
  "entrance": null,
  "contact_attempts": []
}
```

`POST /api/driver/v1/work-sessions/aeb987f2-d280-4f8f-9eb0-a70228477b7f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T02:23:52Z",
    "sequence": 1793413432103
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "aeb987f2-d280-4f8f-9eb0-a70228477b7f",
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
  "last_heartbeat_at": "2026-10-31T02:23:52.117064Z",
  "last_location_at": "2026-10-31T02:23:52.117064Z",
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
  "id": "bea30b89-2cd4-4864-8813-c1f869885b25",
  "order_id": "0338d1fe-e02c-4008-b24d-8dfe71b60dc9",
  "assignment_id": "5e6b0f42-ff0b-4a35-85e1-ec11a1b63e18",
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
  "entrance": null,
  "contact_attempts": []
}
```

`POST /api/driver/v1/trips/bea30b89-2cd4-4864-8813-c1f869885b25/arrive` → **200**

```json
{
  "command_id": "98263af7-30d5-49d6-8586-fc04e26e2ce2",
  "expected_version": 0
}
```

```json
{
  "id": "bea30b89-2cd4-4864-8813-c1f869885b25",
  "order_id": "0338d1fe-e02c-4008-b24d-8dfe71b60dc9",
  "assignment_id": "5e6b0f42-ff0b-4a35-85e1-ec11a1b63e18",
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
  "arrived_at": "2026-10-31T02:23:52.477927Z",
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

`POST /api/driver/v1/trips/bea30b89-2cd4-4864-8813-c1f869885b25/start` → **200**

```json
{
  "command_id": "f8199f0f-25b4-4454-9686-bd52b9b7f179",
  "expected_version": 1
}
```

```json
{
  "id": "bea30b89-2cd4-4864-8813-c1f869885b25",
  "order_id": "0338d1fe-e02c-4008-b24d-8dfe71b60dc9",
  "assignment_id": "5e6b0f42-ff0b-4a35-85e1-ec11a1b63e18",
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
  "arrived_at": "2026-10-31T02:23:52.477927Z",
  "started_at": "2026-10-31T02:23:52.670794Z",
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

(the car drives 49 s to the next point)

`POST /api/driver/v1/work-sessions/aeb987f2-d280-4f8f-9eb0-a70228477b7f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T02:24:41Z",
    "sequence": 1793413481874
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "aeb987f2-d280-4f8f-9eb0-a70228477b7f",
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
  "last_heartbeat_at": "2026-10-31T02:24:41.889812Z",
  "last_location_at": "2026-10-31T02:24:41.889812Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/bea30b89-2cd4-4864-8813-c1f869885b25/complete` → **200**

```json
{
  "command_id": "93124bc9-3d30-42eb-a468-097f9b5da853",
  "expected_version": 2,
  "reported_at": "2026-10-31T02:24:42Z",
  "cash_received": true
}
```

```json
{
  "id": "bea30b89-2cd4-4864-8813-c1f869885b25",
  "order_id": "0338d1fe-e02c-4008-b24d-8dfe71b60dc9",
  "assignment_id": "5e6b0f42-ff0b-4a35-85e1-ec11a1b63e18",
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
  "arrived_at": "2026-10-31T02:23:52.477927Z",
  "started_at": "2026-10-31T02:23:52.670794Z",
  "completed_at": "2026-10-31T02:24:42.088952Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null,
  "comment": null,
  "entrance": null,
  "contact_attempts": []
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/0338d1fe-e02c-4008-b24d-8dfe71b60dc9/rating` → **200**

```json
{
  "command_id": "8ccb93bc-7054-436b-8478-de1882044ea1",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "0338d1fe-e02c-4008-b24d-8dfe71b60dc9",
  "score": 5,
  "created_at": "2026-10-31T02:24:42.29933559Z"
}
```

`POST /api/driver/v1/orders/0338d1fe-e02c-4008-b24d-8dfe71b60dc9/rating` → **200**

```json
{
  "command_id": "7accd151-6f66-4be9-b593-5ba92abcca18",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "0338d1fe-e02c-4008-b24d-8dfe71b60dc9",
  "score": 4,
  "created_at": "2026-10-31T02:24:42.491875754Z"
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
  "session_id": "8a67d074-485b-40dd-a187-9e5ae963018e",
  "subject": {
    "type": "STAFF",
    "id": "13536a6b-90d5-4717-bcad-60e066f5abae"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzUzNmE2Yi05MGQ1LTQ3MTctYmNhZC02MGUwNjZmNWFiYWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MTQzODMsImlhdCI6MTc5MzQxMzQ4MywianRpIjoiZDM2YThhNWUtOTMxNC00MDZjLTgwYTUtNGNmNmIyNTVlNjc0Iiwic2lkIjoiOGE2N2QwNzQtNDg1Yi00MGRkLWExODctOWU1YWU5NjMwMThlIn0.oaqz6sk2y4Wjln_FksKrVEmnOtLIo490uW3teahSKl4",
  "access_expires_at": "2026-10-31T02:39:43.06672819Z",
  "refresh_token": "DOo9kD7P409nvVM0gHumjZN1JlxyPW8-CcJU55vgF4U",
  "refresh_expires_at": "2026-10-31T14:24:43.06635107Z",
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
  "session_id": "7f2ed2cc-05f4-4d48-a7ce-37bff5a97d8f",
  "subject": {
    "type": "STAFF",
    "id": "13536a6b-90d5-4717-bcad-60e066f5abae"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzUzNmE2Yi05MGQ1LTQ3MTctYmNhZC02MGUwNjZmNWFiYWUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MTQzODMsImlhdCI6MTc5MzQxMzQ4MywianRpIjoiZTQyMzM1N2MtMzkwZC00ZDBiLWFjY2MtYjlkMzVjN2ZmODRlIiwic2lkIjoiN2YyZWQyY2MtMDVmNC00ZDQ4LWE3Y2UtMzdiZmY1YTk3ZDhmIn0.eq3foRgXdTM1rl23YNhqpeVn9LOHG-0y_PdcjXyz_DI",
  "access_expires_at": "2026-10-31T02:39:43.449758766Z",
  "refresh_token": "-baATOshb-1AtIwNzEtpJg-A8O5ulHWAYntH_yL23-c",
  "refresh_expires_at": "2026-10-31T14:24:43.449403309Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/0338d1fe-e02c-4008-b24d-8dfe71b60dc9/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "0338d1fe-e02c-4008-b24d-8dfe71b60dc9",
      "author_type": "RIDER",
      "author_id": "19f562e3-107f-43f2-a5a9-4060e260d174",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-31T02:24:42.299336Z"
    },
    {
      "order_id": "0338d1fe-e02c-4008-b24d-8dfe71b60dc9",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "19f562e3-107f-43f2-a5a9-4060e260d174",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-31T02:24:42.491876Z"
    }
  ]
}
```

Done: ratings for order 0338d1fe-e02c-4008-b24d-8dfe71b60dc9.

# Scenario: reassignment-push

## Andrii (200 m) and Oleh (600 m) are online; a rider with the app orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-4221"
}
```

```json
{
  "challenge_id": "bd7152ff-219a-4d12-91e0-9d630cbfa1dc",
  "expires_at": "2026-10-31T02:29:43.834446398Z",
  "resend_available_at": "2026-10-31T02:24:44.834446398Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "493499",
  "sent_at": "2026-10-31T02:24:43.837065932Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bd7152ff-219a-4d12-91e0-9d630cbfa1dc",
  "code": "493499",
  "device_ref": "sandbox-4221"
}
```

```json
{
  "session_id": "6fe8fd8c-9c92-49a4-9b51-88cda8947e9d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQxNDM4NCwiaWF0IjoxNzkzNDEzNDg0LCJqdGkiOiJlNzY0MTI0YS0zNzhmLTQzZjEtOTRlOC0xMTljNTQ5YzI3ZGIiLCJzaWQiOiI2ZmU4ZmQ4Yy05YzkyLTQ5YTQtOWI1MS04OGNkYTg5NDdlOWQifQ.xNiWEKHBn6_rlIgpLSl6Q5hlyLvPhC5sOpHVr6g2Y20",
  "access_expires_at": "2026-10-31T02:39:44.039625942Z",
  "refresh_token": "79J-cjZhxdgtWXZ1SjlQHYcOhRGgmkcKhjyP2eAbRsU",
  "refresh_expires_at": "2026-11-30T02:24:44.039257195Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "aeb987f2-d280-4f8f-9eb0-a70228477b7f",
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
  "last_heartbeat_at": "2026-10-31T02:24:41.889812Z",
  "last_location_at": "2026-10-31T02:24:41.889812Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/aeb987f2-d280-4f8f-9eb0-a70228477b7f/handover` → **200**

```json
{
  "command_id": "97f4b582-5eee-4aca-8872-374c358f872a",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "aeb987f2-d280-4f8f-9eb0-a70228477b7f",
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
  "last_heartbeat_at": "2026-10-31T02:24:41.889812Z",
  "last_location_at": "2026-10-31T02:24:41.889812Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/aeb987f2-d280-4f8f-9eb0-a70228477b7f/close` → **200**

```json
{
  "command_id": "f44ef940-4e29-4285-a090-d51013241416",
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
  "session_id": "4313d075-3df1-4583-bd53-36c61c51d09a",
  "subject": {
    "type": "STAFF",
    "id": "13536a6b-90d5-4717-bcad-60e066f5abae"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzUzNmE2Yi05MGQ1LTQ3MTctYmNhZC02MGUwNjZmNWFiYWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MTQzODQsImlhdCI6MTc5MzQxMzQ4NCwianRpIjoiYWNiOTI3YmUtMGEzMS00ZjQ5LWE1NmMtMGIwMTdjNTEwYzUwIiwic2lkIjoiNDMxM2QwNzUtM2RmMS00NTgzLWJkNTMtMzZjNjFjNTFkMDlhIn0.HO2VzPNsKGGHa18LGoYg4D3e1SK9yLhvNm812jju2AU",
  "access_expires_at": "2026-10-31T02:39:44.979180349Z",
  "refresh_token": "e-8FqpkrP9SOo9qyTodsaYebZWKXbyjL-pgj6xbevVY",
  "refresh_expires_at": "2026-10-31T14:24:44.978839973Z",
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
  "session_id": "b73e9dae-4a96-4c91-813c-ca2b53677e71",
  "subject": {
    "type": "STAFF",
    "id": "13536a6b-90d5-4717-bcad-60e066f5abae"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzUzNmE2Yi05MGQ1LTQ3MTctYmNhZC02MGUwNjZmNWFiYWUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MTQzODUsImlhdCI6MTc5MzQxMzQ4NSwianRpIjoiZDdmOGJhYTAtMDhhOS00YWMzLTg1NGYtNWYyY2VlNjhjM2I5Iiwic2lkIjoiYjczZTlkYWUtNGE5Ni00YzkxLTgxM2MtY2EyYjUzNjc3ZTcxIn0.ushnhUyWwUHx8ywNFbyalyTkBD2710IPLkc9my8ERAk",
  "access_expires_at": "2026-10-31T02:39:45.351444801Z",
  "refresh_token": "opLr7uBxldFtpYTfKB5KOO1Owt6gv5E59_jddUcxPSM",
  "refresh_expires_at": "2026-10-31T14:24:45.351128971Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-21446"
}
```

```json
{
  "challenge_id": "38d60c2e-d963-4c07-8925-47cfb3111095",
  "expires_at": "2026-10-31T02:29:45.52970665Z",
  "resend_available_at": "2026-10-31T02:24:46.52970665Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "855669",
  "sent_at": "2026-10-31T02:24:45.532078295Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "38d60c2e-d963-4c07-8925-47cfb3111095",
  "code": "855669",
  "device_ref": "sandbox-21446"
}
```

```json
{
  "session_id": "4d875d77-f09a-4ea3-b846-2dd2bfc2bfc6",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQxNDM4NSwiaWF0IjoxNzkzNDEzNDg1LCJqdGkiOiJjODJhZTlhYi00OTliLTQ2NWQtODI2My1kMTFiNGU3ODM3NWQiLCJzaWQiOiI0ZDg3NWQ3Ny1mMDlhLTRlYTMtYjg0Ni0yZGQyYmZjMmJmYzYifQ.nFfQAOOH04IRXemyNuemrnfqQnK0lCfezaajffSvafo",
  "access_expires_at": "2026-10-31T02:39:45.731157909Z",
  "refresh_token": "vXRd4bV-3EUDe44LfXG5iHhtwd1wlGR-CBusQMBupek",
  "refresh_expires_at": "2026-11-30T02:24:45.730801239Z",
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
  "command_id": "a2833eca-2160-4a9f-a882-0748759a8211",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T02:24:46Z",
    "sequence": 1793413486108
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "1624f6a2-906e-4d97-a60a-ccbdedf38e93",
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
  "last_heartbeat_at": "2026-10-31T02:24:46.122522Z",
  "last_location_at": "2026-10-31T02:24:46.122522Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-3553"
}
```

```json
{
  "challenge_id": "a0f3c61c-addc-4ec2-8a52-a32efd9eb66d",
  "expires_at": "2026-10-31T02:29:46.30394484Z",
  "resend_available_at": "2026-10-31T02:24:47.30394484Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "440267",
  "sent_at": "2026-10-31T02:24:46.305762642Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a0f3c61c-addc-4ec2-8a52-a32efd9eb66d",
  "code": "440267",
  "device_ref": "sandbox-3553"
}
```

```json
{
  "session_id": "7b11ee68-e087-401a-818c-e048b0f1623c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQxNDM4NiwiaWF0IjoxNzkzNDEzNDg2LCJqdGkiOiI0NDBhMGE1Mi1hNGMzLTQ2YjgtYWQ1OC0wNzcxN2JmMzdlMjciLCJzaWQiOiI3YjExZWU2OC1lMDg3LTQwMWEtODE4Yy1lMDQ4YjBmMTYyM2MifQ.Hnjl0Me6tzDjaF4eAjY56CPYUts_zNEWllWD9QDv8jA",
  "access_expires_at": "2026-10-31T02:39:46.503221723Z",
  "refresh_token": "iZWCDCuRnhT4OnR81eet5Bw6ltAU97FSeNhJAK7IFVI",
  "refresh_expires_at": "2026-11-30T02:24:46.502899343Z",
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
  "command_id": "1ca7d6b4-f011-44ac-803b-8cb474d34145",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T02:24:46Z",
    "sequence": 1793413486874
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "c817946a-380d-4f81-a4e4-b52ff8c161e9",
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
  "last_heartbeat_at": "2026-10-31T02:24:46.888265Z",
  "last_location_at": "2026-10-31T02:24:46.888265Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380682428482",
  "device_ref": "sandbox-13520"
}
```

```json
{
  "challenge_id": "af88a902-8a43-4392-baaa-d2bec6f1cfbc",
  "expires_at": "2026-10-31T02:29:47.071794375Z",
  "resend_available_at": "2026-10-31T02:24:48.071794375Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380682428482` → **200**

```json
{
  "phone": "+380682428482",
  "audience": "CLIENT",
  "code": "290869",
  "sent_at": "2026-10-31T02:24:47.07359432Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "af88a902-8a43-4392-baaa-d2bec6f1cfbc",
  "code": "290869",
  "device_ref": "sandbox-13520"
}
```

```json
{
  "session_id": "b46e452d-69d7-463a-8c95-7e3eb3ef4e34",
  "subject": {
    "type": "CLIENT",
    "id": "2a1c8fa1-76b0-4207-ac9e-aad27ce5d258"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYTFjOGZhMS03NmIwLTQyMDctYWM5ZS1hYWQyN2NlNWQyNTgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDE0Mzg3LCJpYXQiOjE3OTM0MTM0ODcsImp0aSI6IjZmOTdjMGY4LTVmNzMtNDU5OC1hM2QwLWU3MzI5NGE1NDQyOSIsInNpZCI6ImI0NmU0NTJkLTY5ZDctNDYzYS04Yzk1LTdlM2ViM2VmNGUzNCJ9.qk9P0Adq3OELOGk-EZwWfd-4D6Y9nS5z-pz85EethBQ",
  "access_expires_at": "2026-10-31T02:39:47.274218515Z",
  "refresh_token": "tShm_BfYCbMUUquXtJig1eyroAOJNpm7Pk7cT0o3stc",
  "refresh_expires_at": "2026-11-30T02:24:47.273906701Z",
  "account_created": true
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "b014338a-bd67-4e69-992d-0d269666bbed",
  "platform": "ANDROID",
  "token": "sandbox-rider-716f1b05-54c9-47d2-9759-2293b892ce10"
}
```

```json
{
  "id": "11eefbac-b2d1-4527-8b92-21f8118c059d",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-31T02:24:47.459136Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "168932e6-0218-4088-b8f6-8e716bb3b7df",
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
  "id": "6dedfe76-ca26-4595-ae79-b755650f4aaf",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T02:29:47.648054Z",
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
  "command_id": "369cd858-21d1-41ed-8dc6-c13db9af48fc",
  "quote_id": "6dedfe76-ca26-4595-ae79-b755650f4aaf",
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
  "id": "ddb58817-7123-4345-8857-11900302a9bb",
  "short_number": 37,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2a1c8fa1-76b0-4207-ac9e-aad27ce5d258",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T02:24:47.845226Z",
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
    "id": "59aca493-fc34-4d22-95b7-f0eae5286de7",
    "order_id": "ddb58817-7123-4345-8857-11900302a9bb",
    "expires_at": "2026-10-31T02:25:02.846963Z",
    "server_time": "2026-10-31T02:24:48.056641438Z",
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

`POST /api/driver/v1/offers/59aca493-fc34-4d22-95b7-f0eae5286de7/accept` → **200**

```json
{
  "command_id": "e0d0a9cf-9886-43e9-89f7-36871b289055"
}
```

```json
{
  "id": "9f1b2c7b-ed7f-4c01-9b53-f0877e222980",
  "order_id": "ddb58817-7123-4345-8857-11900302a9bb",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "72a6d5c7-1403-486b-831b-29cf57da9baa",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/operator/v1/orders/ddb58817-7123-4345-8857-11900302a9bb` → **200**

```json
{
  "id": "ddb58817-7123-4345-8857-11900302a9bb",
  "short_number": 37,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "2a1c8fa1-76b0-4207-ac9e-aad27ce5d258",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "9f1b2c7b-ed7f-4c01-9b53-f0877e222980",
    "order_id": "ddb58817-7123-4345-8857-11900302a9bb",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "72a6d5c7-1403-486b-831b-29cf57da9baa",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-31T02:24:47.845226Z",
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

`POST /api/operator/v1/orders/ddb58817-7123-4345-8857-11900302a9bb/revoke-assignment` → **200**

```json
{
  "command_id": "ec943b2d-7b1d-4cba-956b-0cc283774ab8",
  "expected_version": 3,
  "reason_code": "DRIVER_NOT_RESPONDING"
}
```

```json
{
  "id": "ddb58817-7123-4345-8857-11900302a9bb",
  "short_number": 37,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "2a1c8fa1-76b0-4207-ac9e-aad27ce5d258",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T02:24:47.845226Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null,
  "driver": null,
  "driver_change": {
    "reason_code": "SERVICE_REASSIGNED",
    "at": "2026-10-31T02:24:48.627367Z"
  },
  "comment": null,
  "entrance": null
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "92e68624-0228-4788-9b2e-28f6c3d1ba1b",
    "order_id": "ddb58817-7123-4345-8857-11900302a9bb",
    "expires_at": "2026-10-31T02:25:03.629133Z",
    "server_time": "2026-10-31T02:24:48.84941302Z",
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

`POST /api/driver/v1/offers/92e68624-0228-4788-9b2e-28f6c3d1ba1b/accept` → **200**

```json
{
  "command_id": "b4bdafd0-fa5a-4ffc-8d82-793fc2402162"
}
```

```json
{
  "id": "37282a9a-9284-4438-b601-4a71e2817be2",
  "order_id": "ddb58817-7123-4345-8857-11900302a9bb",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "0239df70-b478-4f68-894c-f9daf390db04",
  "trip_phase": "TO_PICKUP"
}
```

## After the push delay: Andrii's "driver assigned" is SUPERSEDED, Oleh's is SENT

`GET /sandbox/v1/notifications?order_id=ddb58817-7123-4345-8857-11900302a9bb` → **200**

```json
[
  {
    "recipient_type": "DRIVER",
    "recipient_id": "5a000000-0000-4000-8000-000000000403",
    "channel": "PUSH",
    "template": "driver.offer",
    "state": "SUPERSEDED",
    "data": {
      "type": "driver.offer",
      "event_id": "7c15d20e-4d63-462e-9250-71260b119a57",
      "offer_id": "59aca493-fc34-4d22-95b7-f0eae5286de7",
      "order_id": "ddb58817-7123-4345-8857-11900302a9bb",
      "event_type": "OfferMade",
      "order_version": "2"
    },
    "created_at": "2026-10-31T02:24:48.21325Z"
  },
  {
    "recipient_type": "CLIENT",
    "recipient_id": "2a1c8fa1-76b0-4207-ac9e-aad27ce5d258",
    "channel": "PUSH",
    "template": "rider.driver-assigned",
    "state": "SENT",
    "data": {
      "type": "rider.driver-assigned",
      "event_id": "742a54ab-680a-4169-95ec-e78c1c8008e6",
      "order_id": "ddb58817-7123-4345-8857-11900302a9bb",
      "event_type": "AssignmentCommitted",
      "assignment_id": "37282a9a-9284-4438-b601-4a71e2817be2",
      "order_version": "7"
    },
    "created_at": "2026-10-31T02:24:49.217012Z"
  },
  {
    "recipient_type": "CLIENT",
    "recipient_id": "2a1c8fa1-76b0-4207-ac9e-aad27ce5d258",
    "channel": "PUSH",
    "template": "rider.driver-assigned",
    "state": "SUPERSEDED",
    "data": {
      "type": "rider.driver-assigned",
      "event_id": "f4810500-5e8e-46ed-ad98-fc9e7c115a87",
      "order_id": "ddb58817-7123-4345-8857-11900302a9bb",
      "event_type": "AssignmentCommitted",
      "assignment_id": "9f1b2c7b-ed7f-4c01-9b53-f0877e222980",
      "order_version": "3"
    },
    "created_at": "2026-10-31T02:24:49.220182Z"
  },
  {
    "recipient_type": "DRIVER",
    "recipient_id": "5a000000-0000-4000-8000-000000000402",
    "channel": "PUSH",
    "template": "driver.offer",
    "state": "SUPERSEDED",
    "data": {
      "type": "driver.offer",
      "event_id": "56f3e5fd-9d2f-41e7-acad-656f15b00444",
      "offer_id": "92e68624-0228-4788-9b2e-28f6c3d1ba1b",
      "order_id": "ddb58817-7123-4345-8857-11900302a9bb",
      "event_type": "OfferMade",
      "order_version": "6"
    },
    "created_at": "2026-10-31T02:24:49.222461Z"
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380682428482&after=2026-10-31T02:24:47.633Z` → **200**

```json
[
  {
    "at": "2026-10-31T02:24:52.402061388Z",
    "token_suffix": "92ce10",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "type": "rider.driver-assigned",
      "event_type": "AssignmentCommitted",
      "order_id": "ddb58817-7123-4345-8857-11900302a9bb",
      "event_id": "742a54ab-680a-4169-95ec-e78c1c8008e6",
      "order_version": "7",
      "assignment_id": "37282a9a-9284-4438-b601-4a71e2817be2"
    }
  }
]
```

## The rider's order shows Oleh's car and why the driver changed

`GET /api/rider/v1/orders/ddb58817-7123-4345-8857-11900302a9bb` → **200**

```json
{
  "id": "ddb58817-7123-4345-8857-11900302a9bb",
  "short_number": 37,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "2a1c8fa1-76b0-4207-ac9e-aad27ce5d258",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "37282a9a-9284-4438-b601-4a71e2817be2",
    "order_id": "ddb58817-7123-4345-8857-11900302a9bb",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "0239df70-b478-4f68-894c-f9daf390db04",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-31T02:24:47.845226Z",
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
    "location_at": "2026-10-31T02:24:46.888265Z",
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
    "at": "2026-10-31T02:24:48.627367Z"
  },
  "comment": null,
  "entrance": null
}
```

Done: assignment 9f1b2c7b-ed7f-4c01-9b53-f0877e222980 of 5a000000-0000-4000-8000-000000000403 never announced (SUPERSEDED); the rider heard only about 37282a9a-9284-4438-b601-4a71e2817be2.

`GET /api/operator/v1/orders/ddb58817-7123-4345-8857-11900302a9bb` → **200**

```json
{
  "id": "ddb58817-7123-4345-8857-11900302a9bb",
  "short_number": 37,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "2a1c8fa1-76b0-4207-ac9e-aad27ce5d258",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "37282a9a-9284-4438-b601-4a71e2817be2",
    "order_id": "ddb58817-7123-4345-8857-11900302a9bb",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "0239df70-b478-4f68-894c-f9daf390db04",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-31T02:24:47.845226Z",
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
    "at": "2026-10-31T02:24:48.627367Z"
  },
  "comment": null,
  "entrance": null
}
```

`POST /api/operator/v1/orders/ddb58817-7123-4345-8857-11900302a9bb/cancel` → **200**

```json
{
  "command_id": "6aee388c-35fb-4862-bcac-51ee3486959b",
  "expected_version": 7,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "ddb58817-7123-4345-8857-11900302a9bb",
  "short_number": 37,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 8,
  "channel": "APP",
  "payer_client_id": "2a1c8fa1-76b0-4207-ac9e-aad27ce5d258",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "37282a9a-9284-4438-b601-4a71e2817be2",
    "order_id": "ddb58817-7123-4345-8857-11900302a9bb",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "0239df70-b478-4f68-894c-f9daf390db04",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-31T02:24:47.845226Z",
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
  "related_order_id": null,
  "driver": null,
  "driver_change": {
    "reason_code": "SERVICE_REASSIGNED",
    "at": "2026-10-31T02:24:48.627367Z"
  },
  "comment": null,
  "entrance": null
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "1624f6a2-906e-4d97-a60a-ccbdedf38e93",
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
  "last_heartbeat_at": "2026-10-31T02:24:46.122522Z",
  "last_location_at": "2026-10-31T02:24:46.122522Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/1624f6a2-906e-4d97-a60a-ccbdedf38e93/close` → **200**

```json
{
  "command_id": "f6db82fd-91aa-4a71-b2d8-20114ddb9e3b",
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
  "session_id": "c817946a-380d-4f81-a4e4-b52ff8c161e9",
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
  "last_heartbeat_at": "2026-10-31T02:24:46.888265Z",
  "last_location_at": "2026-10-31T02:24:46.888265Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c817946a-380d-4f81-a4e4-b52ff8c161e9/close` → **200**

```json
{
  "command_id": "1153e231-47c7-42a5-b165-aa6ace5987dc",
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
  "session_id": "df94177e-4478-4ad5-936e-514b22c0e2a4",
  "subject": {
    "type": "STAFF",
    "id": "13536a6b-90d5-4717-bcad-60e066f5abae"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzUzNmE2Yi05MGQ1LTQ3MTctYmNhZC02MGUwNjZmNWFiYWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MTQzOTYsImlhdCI6MTc5MzQxMzQ5NiwianRpIjoiN2VmMjEzM2QtZmU1ZC00YTZhLWE4ZTMtOGExYjU2MWM2Nzc2Iiwic2lkIjoiZGY5NDE3N2UtNDQ3OC00YWQ1LTkzNmUtNTE0YjIyYzBlMmE0In0.j0UFxIn7tHD_NWXBiI8O7rIvXxHn-DlkQj8vKBdD5p8",
  "access_expires_at": "2026-10-31T02:39:56.81610302Z",
  "refresh_token": "u8wR5sUzaGz4ImbISYawJ6tNPGfPxl6DWqR4CNf0x0o",
  "refresh_expires_at": "2026-10-31T14:24:56.815772509Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "d8c0357e-f995-46cf-9a5c-90063d70f9b4",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-31"
}
```

```json
{
  "id": "f72a034e-8909-4f8a-bd6f-38e2d88dd68c",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-31",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-31T02:24:57.006188Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/f72a034e-8909-4f8a-bd6f-38e2d88dd68c` → **200**

```json
{
  "id": "f72a034e-8909-4f8a-bd6f-38e2d88dd68c",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-31",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-31T02:24:57.006188Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/f72a034e-8909-4f8a-bd6f-38e2d88dd68c` → **200**

```json
{
  "id": "f72a034e-8909-4f8a-bd6f-38e2d88dd68c",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-31",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-31T02:24:57.006188Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/f72a034e-8909-4f8a-bd6f-38e2d88dd68c` → **200**

```json
{
  "id": "f72a034e-8909-4f8a-bd6f-38e2d88dd68c",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-31",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-31T02:24:57.006188Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/f72a034e-8909-4f8a-bd6f-38e2d88dd68c` → **200**

```json
{
  "id": "f72a034e-8909-4f8a-bd6f-38e2d88dd68c",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-31",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-31.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-31T02:24:57.006188Z",
  "ready_at": "2026-10-31T02:25:00.381616Z",
  "expires_at": "2026-11-01T02:25:00.381616Z"
}
```

`GET /api/admin/v1/reports/exports/f72a034e-8909-4f8a-bd6f-38e2d88dd68c/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-31,35,12,23,0,0,30,5,0,32,2,0,1,7,1,15
total,35,12,23,0,0,30,5,0,32,2,0,1,7,1,15
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "4fb029f4-f205-45e0-89f9-af2ab6313310",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-31"
}
```

```json
{
  "id": "ba7e2b51-c07b-45f1-91a9-1ad9dad64b29",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-31",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-31T02:25:00.963063Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/ba7e2b51-c07b-45f1-91a9-1ad9dad64b29` → **200**

```json
{
  "id": "ba7e2b51-c07b-45f1-91a9-1ad9dad64b29",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-31",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-31T02:25:00.963063Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/ba7e2b51-c07b-45f1-91a9-1ad9dad64b29` → **200**

```json
{
  "id": "ba7e2b51-c07b-45f1-91a9-1ad9dad64b29",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-31",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-31T02:25:00.963063Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/ba7e2b51-c07b-45f1-91a9-1ad9dad64b29` → **200**

```json
{
  "id": "ba7e2b51-c07b-45f1-91a9-1ad9dad64b29",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-31",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-31T02:25:00.963063Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/ba7e2b51-c07b-45f1-91a9-1ad9dad64b29` → **200**

```json
{
  "id": "ba7e2b51-c07b-45f1-91a9-1ad9dad64b29",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-31",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-31T02:25:00.963063Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/ba7e2b51-c07b-45f1-91a9-1ad9dad64b29` → **200**

```json
{
  "id": "ba7e2b51-c07b-45f1-91a9-1ad9dad64b29",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-31",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-31.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-31T02:25:00.963063Z",
  "ready_at": "2026-10-31T02:25:05.387752Z",
  "expires_at": "2026-11-01T02:25:05.387752Z"
}
```

`GET /api/admin/v1/reports/exports/ba7e2b51-c07b-45f1-91a9-1ad9dad64b29/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-31,UAH,12,1655.51,130.74,248.37,1407.14,10.52,0.00,325.94,182.97,900.17,50.00,105.17
total,UAH,12,1655.51,130.74,248.37,1407.14,10.52,0.00,325.94,182.97,900.17,50.00,105.17
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/4dfaee0f-a379-43bb-8ad7-dfa0ffd64189` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/4dfaee0f-a379-43bb-8ad7-dfa0ffd64189",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "45bffa4d-4c5b-496f-9c83-205a257e2946"
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
  "session_id": "2fc6a1aa-eb1f-4165-97d5-9715b126d7a8",
  "subject": {
    "type": "STAFF",
    "id": "13536a6b-90d5-4717-bcad-60e066f5abae"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzUzNmE2Yi05MGQ1LTQ3MTctYmNhZC02MGUwNjZmNWFiYWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MTQ0MDYsImlhdCI6MTc5MzQxMzUwNiwianRpIjoiYzk5NmQwZGMtZWVmNy00NGU5LWIwMmMtNjUzNTY0Mjc4M2U3Iiwic2lkIjoiMmZjNmExYWEtZWIxZi00MTY1LTk3ZDUtOTcxNWIxMjZkN2E4In0.sY1eZC4Mv5jtdQUJhF8LZJmkjWZ73rqIwjj1mYtEwnM",
  "access_expires_at": "2026-10-31T02:40:06.561840465Z",
  "refresh_token": "9RyFL9tlX6qlwJVkces-88eJITGAxNgoFxyE5u3jkl0",
  "refresh_expires_at": "2026-10-31T14:25:06.56148093Z",
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
  "command_id": "c5c0a559-6286-4db2-8abb-8abf6e61e520",
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
  "changed_by": "13536a6b-90d5-4717-bcad-60e066f5abae",
  "reason": "Sandbox retention boundary",
  "changed_at": "2026-10-31T02:25:06.947793681Z"
}
```

`POST /sandbox/v1/retention/fixtures/1eef5971-b8bc-4b8f-99d3-e51a1524790b` → **200**

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

`GET /sandbox/v1/retention/fixtures/1eef5971-b8bc-4b8f-99d3-e51a1524790b` → **200**

```json
{
  "old_done": 0,
  "recent_done": 1,
  "failed": 1
}
```

Old DONE event removed; recent DONE and old FAILED events retained. Policy and synthetic fixtures restored on exit.

`DELETE /sandbox/v1/retention/fixtures/1eef5971-b8bc-4b8f-99d3-e51a1524790b` → **204**

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
  "changed_by": "13536a6b-90d5-4717-bcad-60e066f5abae",
  "reason": "Sandbox retention boundary",
  "changed_at": "2026-10-31T02:25:06.947794Z"
}
```

`PUT /api/admin/v1/retention` → **200**

```json
{
  "command_id": "2aeb24d4-e2dd-45cb-8df6-ff9d3b01895f",
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
  "changed_by": "13536a6b-90d5-4717-bcad-60e066f5abae",
  "reason": "Restore policy after retention sandbox",
  "changed_at": "2026-10-31T02:25:07.408753186Z"
}
```

# Scenario: risk-flag

## The driver starts a new shift in Kyiv

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-5925"
}
```

```json
{
  "challenge_id": "1ecdf1df-3ae3-4b24-98a6-95847e391086",
  "expires_at": "2026-10-31T02:30:07.596352017Z",
  "resend_available_at": "2026-10-31T02:25:08.596352017Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "379846",
  "sent_at": "2026-10-31T02:25:07.598207228Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1ecdf1df-3ae3-4b24-98a6-95847e391086",
  "code": "379846",
  "device_ref": "sandbox-5925"
}
```

```json
{
  "session_id": "830bfb70-6c22-4d61-b4b5-7404aff0bfed",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQxNDQwNywiaWF0IjoxNzkzNDEzNTA3LCJqdGkiOiJjZjgzMzllNy01NjU1LTQ0ZjEtODIxNC0wOTU2Njg2M2E4MGYiLCJzaWQiOiI4MzBiZmI3MC02YzIyLTRkNjEtYjRiNS03NDA0YWZmMGJmZWQifQ.xst-sPsZY28vwCrGTmCLFwqos6W2CMW9rdmUmvVbpBA",
  "access_expires_at": "2026-10-31T02:40:07.798922935Z",
  "refresh_token": "nsj5-QaRmHGkQXxRK7AKPkbVY4cFt73jVk_G_Scr49I",
  "refresh_expires_at": "2026-11-30T02:25:07.798547597Z",
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
  "command_id": "da78e567-14cb-457c-9e3c-e23c8f25e695",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T02:25:08Z",
    "sequence": 1793413508355
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "1cd374cf-e548-4f37-a48d-4c0ecdbf181a",
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
  "last_heartbeat_at": "2026-10-31T02:25:08.369947Z",
  "last_location_at": "2026-10-31T02:25:08.369947Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "25235932-50aa-4a6c-9944-8671ccc95e17",
  "points": [
    {
      "sequence": 1793413510624,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-31T02:24:10Z"
    },
    {
      "sequence": 1793413510630,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-31T02:25:10Z"
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
  "session_id": "03306c6b-197a-4a41-8d88-9fe96a5383c6",
  "subject": {
    "type": "STAFF",
    "id": "13536a6b-90d5-4717-bcad-60e066f5abae"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzUzNmE2Yi05MGQ1LTQ3MTctYmNhZC02MGUwNjZmNWFiYWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MTQ0MTEsImlhdCI6MTc5MzQxMzUxMSwianRpIjoiODdjZGE3YjktNDAwYy00YzcyLWE0YzYtZDU0ZDYzZDQzNjg4Iiwic2lkIjoiMDMzMDZjNmItMTk3YS00YTQxLThkODgtOWZlOTZhNTM4M2M2In0.mpo0VEnl-mGWc_A0jz-LJmurYEwVZwGnlbhniTJNcgc",
  "access_expires_at": "2026-10-31T02:40:11.058164083Z",
  "refresh_token": "i2Z_XtLNnN5dgBAsuDhZ4lt3rQhMyFSlIoJ7M74WImM",
  "refresh_expires_at": "2026-10-31T14:25:11.057816531Z",
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
      "id": "a014b643-e370-4611-86de-bd8b92f2a961",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-31T02:25:10Z",
        "track_point_id": "bc53f745-12a2-4947-b3c5-853f3c7f8178",
        "work_session_id": "1cd374cf-e548-4f37-a48d-4c0ecdbf181a"
      },
      "raised_by": null,
      "raised_at": "2026-10-31T02:25:10Z",
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

`POST /api/admin/v1/driver-risk-flags/a014b643-e370-4611-86de-bd8b92f2a961/confirm` → **200**

```json
{
  "command_id": "400341fb-a092-4f90-a2c9-c3f4c3384890",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "a014b643-e370-4611-86de-bd8b92f2a961",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-31T02:25:10Z",
    "track_point_id": "bc53f745-12a2-4947-b3c5-853f3c7f8178",
    "work_session_id": "1cd374cf-e548-4f37-a48d-4c0ecdbf181a"
  },
  "raised_by": null,
  "raised_at": "2026-10-31T02:25:10Z",
  "reason": null,
  "reviewed_by": "13536a6b-90d5-4717-bcad-60e066f5abae",
  "reviewed_at": "2026-10-31T02:25:12.837322Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/a014b643-e370-4611-86de-bd8b92f2a961/dismiss` → **409**

```json
{
  "command_id": "6dce59ab-5a53-467a-9e3e-1cd55f50ee09",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/a014b643-e370-4611-86de-bd8b92f2a961/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "8e88b812-c71e-4f98-b586-dca23d1896f4"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "64c1f424-32b9-471f-8728-db871fab5207",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "575b6f98-b6c4-417e-9003-aa7d25ac48b6",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "13536a6b-90d5-4717-bcad-60e066f5abae",
  "raised_at": "2026-10-31T02:25:13.224115Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/575b6f98-b6c4-417e-9003-aa7d25ac48b6/dismiss` → **200**

```json
{
  "command_id": "d3cc3ddd-b576-4468-9942-be39141b6cef",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "575b6f98-b6c4-417e-9003-aa7d25ac48b6",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "13536a6b-90d5-4717-bcad-60e066f5abae",
  "raised_at": "2026-10-31T02:25:13.224115Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "13536a6b-90d5-4717-bcad-60e066f5abae",
  "reviewed_at": "2026-10-31T02:25:13.414936Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "5592cc60-1faa-496d-a0a6-a5cc5e83c3f8",
  "expected_version": 18,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "a014b643-e370-4611-86de-bd8b92f2a961"
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
      "actor_id": "13536a6b-90d5-4717-bcad-60e066f5abae",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-31T02:25:13.611361Z"
    }
  ],
  "duplicates": []
}
```

Done: flag a014b643-e370-4611-86de-bd8b92f2a961 confirmed, suspension named it, driver reinstated.

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
  "session_id": "7dd9dd98-92e8-4e03-a639-d3e95d79ed65",
  "subject": {
    "type": "STAFF",
    "id": "13536a6b-90d5-4717-bcad-60e066f5abae"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzUzNmE2Yi05MGQ1LTQ3MTctYmNhZC02MGUwNjZmNWFiYWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MTQ0MTQsImlhdCI6MTc5MzQxMzUxNCwianRpIjoiYTYyY2E5Y2MtMDQ4Yy00MTcwLWI1OGEtNGE5YjM5NzEwYmMwIiwic2lkIjoiN2RkOWRkOTgtOTJlOC00ZTAzLWE2MzktZDNlOTVkNzllZDY1In0.5cRvg6zgyHaw43WvrbLUfr8i3QbRxDPN4tBqk8_jGAo",
  "access_expires_at": "2026-10-31T02:40:14.192393988Z",
  "refresh_token": "k9Im_rZn-cWTjf-aXOsfLUCTyBrIzf0AwE7hDSWWnbM",
  "refresh_expires_at": "2026-10-31T14:25:14.192000428Z",
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
      "actor_id": "13536a6b-90d5-4717-bcad-60e066f5abae",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-31T02:25:13.611361Z"
    }
  ],
  "duplicates": []
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "17be8592-6689-43ad-93ed-608e4a5f80d3",
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
  "session_id": "1cd374cf-e548-4f37-a48d-4c0ecdbf181a",
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
  "last_heartbeat_at": "2026-10-31T02:25:08.369947Z",
  "last_location_at": "2026-10-31T02:25:08.369947Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/1cd374cf-e548-4f37-a48d-4c0ecdbf181a/close` → **200**

```json
{
  "command_id": "bfcd46b1-bdfb-4262-9d8a-ee1986b83b7f",
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
  "session_id": "240c76aa-e2d3-4ec8-b708-a0619cca7f9a",
  "subject": {
    "type": "STAFF",
    "id": "13536a6b-90d5-4717-bcad-60e066f5abae"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzUzNmE2Yi05MGQ1LTQ3MTctYmNhZC02MGUwNjZmNWFiYWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MTQ0MTUsImlhdCI6MTc5MzQxMzUxNSwianRpIjoiY2VhYzY0MTItNTUwZC00YmYxLTk1MTQtMjg4OGI1NzE1ZDJmIiwic2lkIjoiMjQwYzc2YWEtZTJkMy00ZWM4LWI3MDgtYTA2MTljY2E3ZjlhIn0.tLaYh27tBpaldGDFfImgzKr4BYjDU4MhkIwU_ytoo2Q",
  "access_expires_at": "2026-10-31T02:40:15.38804149Z",
  "refresh_token": "gVLDjs_DjNKOV_d0kit9z_B0g4UHwPr_lT-7ZGM5LEo",
  "refresh_expires_at": "2026-10-31T14:25:15.387644986Z",
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
  "command_id": "b5c21795-02e6-46b3-870b-4d994927abc0",
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
  "changed_by": "13536a6b-90d5-4717-bcad-60e066f5abae",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-31T02:25:15.765575Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "b5c21795-02e6-46b3-870b-4d994927abc0",
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
  "changed_by": "13536a6b-90d5-4717-bcad-60e066f5abae",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-31T02:25:15.765575Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48369283575",
  "device_ref": "sandbox-22972"
}
```

```json
{
  "challenge_id": "1201e8ce-e429-49bf-b43c-4d07f3fd1ccd",
  "expires_at": "2026-10-31T02:30:16.148342662Z",
  "resend_available_at": "2026-10-31T02:25:17.148342662Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48369283575` → **200**

```json
{
  "phone": "+48369283575",
  "audience": "CLIENT",
  "code": "851883",
  "sent_at": "2026-10-31T02:25:16.150122208Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1201e8ce-e429-49bf-b43c-4d07f3fd1ccd",
  "code": "851883",
  "device_ref": "sandbox-22972"
}
```

```json
{
  "session_id": "51318f3e-136b-495b-9f2c-103e00dc5214",
  "subject": {
    "type": "CLIENT",
    "id": "044a5614-0ceb-45c1-a305-289348e66948"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNDRhNTYxNC0wY2ViLTQ1YzEtYTMwNS0yODkzNDhlNjY5NDgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDE0NDE2LCJpYXQiOjE3OTM0MTM1MTYsImp0aSI6ImUzOGNjNjlhLWZkMzAtNDIzMS05ZGEzLTNkNzZiNjQ0YWE4ZCIsInNpZCI6IjUxMzE4ZjNlLTEzNmItNDk1Yi05ZjJjLTEwM2UwMGRjNTIxNCJ9.6zTduBaSSB08RQ_kgZnPBY9vHRPHPGu3arqmDEBsMWY",
  "access_expires_at": "2026-10-31T02:40:16.349107142Z",
  "refresh_token": "ENI3ZZ-k6wg4Ig1_UYaBUy5TOGrzJIxNbVwQWaaaaNM",
  "refresh_expires_at": "2026-11-30T02:25:16.348792084Z",
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
  "correlation_id": "85bcf12b-c973-4a29-9374-880b82285987"
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
  "device_ref": "sandbox-18378"
}
```

```json
{
  "challenge_id": "29e695dc-b794-4eba-b92d-6ca617a6f551",
  "expires_at": "2026-10-31T02:30:16.907225734Z",
  "resend_available_at": "2026-10-31T02:25:17.907225734Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "314544",
  "sent_at": "2026-10-31T02:25:16.909078568Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "29e695dc-b794-4eba-b92d-6ca617a6f551",
  "code": "314544",
  "device_ref": "sandbox-18378"
}
```

```json
{
  "session_id": "d1e0c0ae-4b7f-4a38-a5a8-82469798c116",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQxNDQxNywiaWF0IjoxNzkzNDEzNTE3LCJqdGkiOiI1MjRjOTgxZi05MDBiLTRjNTEtYjYxMS1jMzNjMDc4NmY2MzMiLCJzaWQiOiJkMWUwYzBhZS00YjdmLTRhMzgtYTVhOC04MjQ2OTc5OGMxMTYifQ.fOqMGzvorE3R4cwZi6pfdeGVYh0HDXWQBhTksDeDsHY",
  "access_expires_at": "2026-10-31T02:40:17.111877871Z",
  "refresh_token": "y82z1SUJxBsDWDW9sLRn1Skbg_UM3Vct_fwjEkDlLUk",
  "refresh_expires_at": "2026-11-30T02:25:17.111506669Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "23e7cc31-b5a6-41cb-a822-365801febe2e",
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
  "last_heartbeat_at": "2026-10-31T02:23:48.045632Z",
  "last_location_at": "2026-10-31T02:23:48.045632Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/23e7cc31-b5a6-41cb-a822-365801febe2e/handover` → **200**

```json
{
  "command_id": "0776d733-612c-4731-8407-093cd071bdb5",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "23e7cc31-b5a6-41cb-a822-365801febe2e",
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
  "last_heartbeat_at": "2026-10-31T02:23:48.045632Z",
  "last_location_at": "2026-10-31T02:23:48.045632Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/23e7cc31-b5a6-41cb-a822-365801febe2e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T02:25:17Z",
    "sequence": 1793413517683
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "23e7cc31-b5a6-41cb-a822-365801febe2e",
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
  "last_heartbeat_at": "2026-10-31T02:25:17.698264Z",
  "last_location_at": "2026-10-31T02:25:17.698264Z",
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
  "session_id": "23e7cc31-b5a6-41cb-a822-365801febe2e",
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
  "last_heartbeat_at": "2026-10-31T02:25:17.698264Z",
  "last_location_at": "2026-10-31T02:25:17.698264Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/23e7cc31-b5a6-41cb-a822-365801febe2e/close` → **200**

```json
{
  "command_id": "b783105a-795b-4498-90e8-7cedd3cd5d70",
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
  "correlation_id": "4a2b50ac-1bfd-4340-9277-12860592371d"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674620120",
  "device_ref": "sandbox-25350"
}
```

```json
{
  "challenge_id": "deabc1b5-9257-445f-a0ac-7e7cd5ffc2a5",
  "expires_at": "2026-10-31T02:30:18.634398763Z",
  "resend_available_at": "2026-10-31T02:25:19.634398763Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380674620120` → **200**

```json
{
  "phone": "+380674620120",
  "audience": "CLIENT",
  "code": "939164",
  "sent_at": "2026-10-31T02:25:18.636140732Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "deabc1b5-9257-445f-a0ac-7e7cd5ffc2a5",
  "code": "939164",
  "device_ref": "sandbox-25350"
}
```

```json
{
  "session_id": "4d1ea984-d0c8-4e7c-ac90-95dd006a54cc",
  "subject": {
    "type": "CLIENT",
    "id": "35495ca8-44b6-4ab7-8481-104fc2dd38e4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzNTQ5NWNhOC00NGI2LTRhYjctODQ4MS0xMDRmYzJkZDM4ZTQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDE0NDE4LCJpYXQiOjE3OTM0MTM1MTgsImp0aSI6IjYzYjJkMDcxLWI1NmEtNGUyNi1iZjUwLTBkOWMxNTgxOTJkMyIsInNpZCI6IjRkMWVhOTg0LWQwYzgtNGU3Yy1hYzkwLTk1ZGQwMDZhNTRjYyJ9.cNn081ipT8J0K3wSGixq3EdJoS0up3TPNSorYswQe7U",
  "access_expires_at": "2026-10-31T02:40:18.844779347Z",
  "refresh_token": "A_AEEcLRGcCJoyA8KUEYKen1FzEGTpTMcHuX5C9XOOY",
  "refresh_expires_at": "2026-11-30T02:25:18.844332342Z",
  "account_created": true
}
```

## The EICAR antivirus test file is refused by the antivirus

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "3324e2e4-31c2-4122-b651-81113357fa18",
  "content_type": "application/pdf",
  "size_bytes": 86
}
```

```json
{
  "file_id": "fd291d13-84e1-48db-8d5c-0861b94e2fce",
  "upload_path": "/api/rider/v1/uploads/fd291d13-84e1-48db-8d5c-0861b94e2fce",
  "expires_at": "2026-10-31T02:40:19.08774243Z",
  "max_bytes": 86
}
```

`PUT /api/rider/v1/uploads/fd291d13-84e1-48db-8d5c-0861b94e2fce` → **200**

```json
{
  "file_id": "fd291d13-84e1-48db-8d5c-0861b94e2fce",
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
  "command_id": "ceb08b83-f998-41c8-ac6e-2c5eb8ddda98",
  "content_type": "application/pdf",
  "size_bytes": 92
}
```

```json
{
  "file_id": "47eb5411-89ab-4efe-b745-e2ac1eb3d74b",
  "upload_path": "/api/rider/v1/uploads/47eb5411-89ab-4efe-b745-e2ac1eb3d74b",
  "expires_at": "2026-10-31T02:40:19.304371227Z",
  "max_bytes": 92
}
```

`PUT /api/rider/v1/uploads/47eb5411-89ab-4efe-b745-e2ac1eb3d74b` → **200**

```json
{
  "file_id": "47eb5411-89ab-4efe-b745-e2ac1eb3d74b",
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
  "command_id": "c0934db8-7765-4d40-ad07-5ef7ca4f686b",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "efca22b6-aaa8-44b2-bf45-4509861c8b0d",
  "upload_path": "/api/rider/v1/uploads/efca22b6-aaa8-44b2-bf45-4509861c8b0d",
  "expires_at": "2026-10-31T02:40:19.519997524Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/efca22b6-aaa8-44b2-bf45-4509861c8b0d` → **200**

```json
{
  "file_id": "efca22b6-aaa8-44b2-bf45-4509861c8b0d",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "2e2f323b-eb14-4ca7-8d0b-75ac3aaf7c57",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "efca22b6-aaa8-44b2-bf45-4509861c8b0d"
  ]
}
```

```json
{
  "id": "cc7ec9b5-7e7b-4ac2-a321-777b2a47b73c",
  "number": 4,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "35495ca8-44b6-4ab7-8481-104fc2dd38e4",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-31T02:25:19.724669Z",
  "updated_at": "2026-10-31T02:25:19.724669Z",
  "respond_by": "2026-10-31T06:25:19.724669Z",
  "messages": [
    {
      "id": "bc32c286-b497-4f86-8f76-ca6c3e2739ec",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "35495ca8-44b6-4ab7-8481-104fc2dd38e4",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-31T02:25:19.725416Z",
      "attachments": [
        {
          "file_id": "efca22b6-aaa8-44b2-bf45-4509861c8b0d",
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
  "session_id": "162232e8-137f-414a-a735-657ff99b5fe4",
  "subject": {
    "type": "STAFF",
    "id": "13536a6b-90d5-4717-bcad-60e066f5abae"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzUzNmE2Yi05MGQ1LTQ3MTctYmNhZC02MGUwNjZmNWFiYWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MTQ0MjAsImlhdCI6MTc5MzQxMzUyMCwianRpIjoiYTFmMmQ5NTYtNzk2OC00YmE5LThlMDAtNTI4ODEyZWYwOWI5Iiwic2lkIjoiMTYyMjMyZTgtMTM3Zi00MTRhLWE3MzUtNjU3ZmY5OWI1ZmU0In0.0XGH_MxbILhkd2er4XqFeyADDEDiKuyI2BsfTle69Bg",
  "access_expires_at": "2026-10-31T02:40:20.120929552Z",
  "refresh_token": "YnQl_sBaeV-und_ne4K_UhcY0jNWYFCPxzUAZjqwC1w",
  "refresh_expires_at": "2026-10-31T14:25:20.120537359Z",
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
  "session_id": "1594b721-c13f-458f-b311-e76b34884c2f",
  "subject": {
    "type": "STAFF",
    "id": "13536a6b-90d5-4717-bcad-60e066f5abae"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzUzNmE2Yi05MGQ1LTQ3MTctYmNhZC02MGUwNjZmNWFiYWUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MTQ0MjAsImlhdCI6MTc5MzQxMzUyMCwianRpIjoiMjA5NTNlMTMtYzZjNi00YzM0LTlmOTAtMDdlZDFlZjI3OWQyIiwic2lkIjoiMTU5NGI3MjEtYzEzZi00NThmLWIzMTEtZTc2YjM0ODg0YzJmIn0.B48AyC7WbyYU2zq5sxxhetH1ZNA5VTfGg5pnPk7wwSc",
  "access_expires_at": "2026-10-31T02:40:20.50548859Z",
  "refresh_token": "sYimM9bjqcNSks_uRUZbvHs5nCQhTuWYEfBCsD97FHM",
  "refresh_expires_at": "2026-10-31T14:25:20.505101455Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/cc7ec9b5-7e7b-4ac2-a321-777b2a47b73c/attachments/efca22b6-aaa8-44b2-bf45-4509861c8b0d` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "3a9ad623-7ffe-45ad-93ed-e0318e9f3b8b",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "525db7bc-e547-48b8-b438-052323a39335",
  "upload_path": "/api/operator/v1/uploads/525db7bc-e547-48b8-b438-052323a39335",
  "expires_at": "2026-10-31T02:40:20.710936808Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/525db7bc-e547-48b8-b438-052323a39335` → **200**

```json
{
  "file_id": "525db7bc-e547-48b8-b438-052323a39335",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/cc7ec9b5-7e7b-4ac2-a321-777b2a47b73c` → **200**

```json
{
  "id": "cc7ec9b5-7e7b-4ac2-a321-777b2a47b73c",
  "number": 4,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "35495ca8-44b6-4ab7-8481-104fc2dd38e4",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-31T02:25:19.724669Z",
  "updated_at": "2026-10-31T02:25:19.724669Z",
  "respond_by": "2026-10-31T06:25:19.724669Z",
  "messages": [
    {
      "id": "bc32c286-b497-4f86-8f76-ca6c3e2739ec",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "35495ca8-44b6-4ab7-8481-104fc2dd38e4",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-31T02:25:19.725416Z",
      "attachments": [
        {
          "file_id": "efca22b6-aaa8-44b2-bf45-4509861c8b0d",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/cc7ec9b5-7e7b-4ac2-a321-777b2a47b73c/comments` → **200**

```json
{
  "command_id": "97858b1b-e385-4b87-9143-6be808f817a7",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "525db7bc-e547-48b8-b438-052323a39335"
  ]
}
```

```json
{
  "id": "cc7ec9b5-7e7b-4ac2-a321-777b2a47b73c",
  "number": 4,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "35495ca8-44b6-4ab7-8481-104fc2dd38e4",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-31T02:25:19.724669Z",
  "updated_at": "2026-10-31T02:25:21.122894Z",
  "respond_by": "2026-10-31T06:25:19.724669Z",
  "messages": [
    {
      "id": "bc32c286-b497-4f86-8f76-ca6c3e2739ec",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "35495ca8-44b6-4ab7-8481-104fc2dd38e4",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-31T02:25:19.725416Z",
      "attachments": [
        {
          "file_id": "efca22b6-aaa8-44b2-bf45-4509861c8b0d",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "d8625385-d5cb-43d8-baf6-000c42ddfeb1",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "13536a6b-90d5-4717-bcad-60e066f5abae",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-31T02:25:21.122525Z",
      "attachments": [
        {
          "file_id": "525db7bc-e547-48b8-b438-052323a39335",
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

`GET /api/rider/v1/support/cases/cc7ec9b5-7e7b-4ac2-a321-777b2a47b73c` → **200**

```json
{
  "id": "cc7ec9b5-7e7b-4ac2-a321-777b2a47b73c",
  "number": 4,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "35495ca8-44b6-4ab7-8481-104fc2dd38e4",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-31T02:25:19.724669Z",
  "updated_at": "2026-10-31T02:25:21.122894Z",
  "respond_by": "2026-10-31T06:25:19.724669Z",
  "messages": [
    {
      "id": "bc32c286-b497-4f86-8f76-ca6c3e2739ec",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "35495ca8-44b6-4ab7-8481-104fc2dd38e4",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-31T02:25:19.725416Z",
      "attachments": [
        {
          "file_id": "efca22b6-aaa8-44b2-bf45-4509861c8b0d",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "d8625385-d5cb-43d8-baf6-000c42ddfeb1",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-31T02:25:21.122525Z",
      "attachments": [
        {
          "file_id": "525db7bc-e547-48b8-b438-052323a39335",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/cc7ec9b5-7e7b-4ac2-a321-777b2a47b73c/attachments/525db7bc-e547-48b8-b438-052323a39335` → **200**

Done: support case cc7ec9b5-7e7b-4ac2-a321-777b2a47b73c, rider attachment efca22b6-aaa8-44b2-bf45-4509861c8b0d, operator attachment 525db7bc-e547-48b8-b438-052323a39335.

# Scenario: switch-to-cash

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380735942919",
  "device_ref": "sandbox-17131"
}
```

```json
{
  "challenge_id": "aa34fa12-0158-4be9-91f2-aff12382e550",
  "expires_at": "2026-10-31T02:30:21.544082712Z",
  "resend_available_at": "2026-10-31T02:25:22.544082712Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380735942919` → **200**

```json
{
  "phone": "+380735942919",
  "audience": "CLIENT",
  "code": "231845",
  "sent_at": "2026-10-31T02:25:21.545748468Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "aa34fa12-0158-4be9-91f2-aff12382e550",
  "code": "231845",
  "device_ref": "sandbox-17131"
}
```

```json
{
  "session_id": "21f67aa7-39cd-45b5-bc10-180a4a5469b0",
  "subject": {
    "type": "CLIENT",
    "id": "8d623d6e-0ca2-470c-8af8-9488c941f093"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZDYyM2Q2ZS0wY2EyLTQ3MGMtOGFmOC05NDg4Yzk0MWYwOTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDE0NDIxLCJpYXQiOjE3OTM0MTM1MjEsImp0aSI6IjUzZDk4NzRkLTUzNDctNDJmYy05YTBmLTlhZjU3ODc4YzA5OCIsInNpZCI6IjIxZjY3YWE3LTM5Y2QtNDViNS1iYzEwLTE4MGE0YTU0NjliMCJ9.tvdt0f4mTQYGV2Bgfx1cpmNmYM6E4bJWp8KwuVxsfI4",
  "access_expires_at": "2026-10-31T02:40:21.759357127Z",
  "refresh_token": "OCLcEM7pcrce56cVpeupljjoBGDOk5nNW86mhn1ecXk",
  "refresh_expires_at": "2026-11-30T02:25:21.759025264Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "a631ae62-20ee-4c46-ac9f-9db98af68baf",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "720baee1-f349-4a34-9f61-d91afd42e1fa",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-720baee1-f349-4a34-9f61-d91afd42e1fa",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "03a200163f3d90dfe6a43ff8fcad5113",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=720baee1-f349-4a34-9f61-d91afd42e1fa",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380735942919"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=720baee1-f349-4a34-9f61-d91afd42e1fa",
  "expires_at": "2026-10-31T02:55:21.953886Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/720baee1-f349-4a34-9f61-d91afd42e1fa` → **200**

```json
{
  "id": "720baee1-f349-4a34-9f61-d91afd42e1fa",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-31T02:55:21.953886Z",
  "card": {
    "id": "d85f3d86-f137-42c7-b15b-a580c62538eb",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****1782",
    "card_type": "Visa",
    "created_at": "2026-10-31T02:25:22.144665Z"
  },
  "failure_reason": null
}
```

## The rider orders by card: the hold is taken

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f91a0661-bbe7-4a12-b1ce-15cbea0ecfb4",
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
  "id": "0e9b5417-4d08-4bf0-b091-38737196132f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T02:30:22.357107Z",
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
  "command_id": "197663f2-27d5-4a7c-9992-e135b64ca0d3",
  "quote_id": "0e9b5417-4d08-4bf0-b091-38737196132f",
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
  "id": "3bf9af60-92ea-43b2-b60e-b296e71a36c3",
  "short_number": 38,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "8d623d6e-0ca2-470c-8af8-9488c941f093",
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
  "created_at": "2026-10-31T02:25:22.55588Z",
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

`GET /api/rider/v1/orders/3bf9af60-92ea-43b2-b60e-b296e71a36c3` → **200**

```json
{
  "id": "3bf9af60-92ea-43b2-b60e-b296e71a36c3",
  "short_number": 38,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "8d623d6e-0ca2-470c-8af8-9488c941f093",
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
  "created_at": "2026-10-31T02:25:22.55588Z",
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

`GET /api/rider/v1/orders/3bf9af60-92ea-43b2-b60e-b296e71a36c3` → **200**

```json
{
  "id": "3bf9af60-92ea-43b2-b60e-b296e71a36c3",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "8d623d6e-0ca2-470c-8af8-9488c941f093",
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
  "created_at": "2026-10-31T02:25:22.55588Z",
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

`GET /api/rider/v1/orders/3bf9af60-92ea-43b2-b60e-b296e71a36c3` → **200**

```json
{
  "id": "3bf9af60-92ea-43b2-b60e-b296e71a36c3",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "8d623d6e-0ca2-470c-8af8-9488c941f093",
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
  "created_at": "2026-10-31T02:25:22.55588Z",
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

`POST /api/rider/v1/orders/3bf9af60-92ea-43b2-b60e-b296e71a36c3/switch-to-cash` → **200**

```json
{
  "command_id": "5e821295-a00e-4e9c-8b5a-90665cedbda7",
  "expected_version": 3
}
```

```json
{
  "id": "3bf9af60-92ea-43b2-b60e-b296e71a36c3",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "8d623d6e-0ca2-470c-8af8-9488c941f093",
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
  "created_at": "2026-10-31T02:25:22.55588Z",
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

`POST /api/rider/v1/orders/3bf9af60-92ea-43b2-b60e-b296e71a36c3/switch-to-cash` → **409**

```json
{
  "command_id": "0b392bc1-1335-41f8-a14e-1b84716be2cb",
  "expected_version": 4
}
```

```json
{
  "instance": "/api/rider/v1/orders/3bf9af60-92ea-43b2-b60e-b296e71a36c3/switch-to-cash",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "34513b10-2757-4afc-a727-4c2ea54c7e03"
}
```

Done: the card order became cash; a second switch is refused.

`GET /api/rider/v1/orders/3bf9af60-92ea-43b2-b60e-b296e71a36c3` → **200**

```json
{
  "id": "3bf9af60-92ea-43b2-b60e-b296e71a36c3",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "8d623d6e-0ca2-470c-8af8-9488c941f093",
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
  "created_at": "2026-10-31T02:25:22.55588Z",
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

`POST /api/rider/v1/orders/3bf9af60-92ea-43b2-b60e-b296e71a36c3/cancel` → **200**

```json
{
  "command_id": "fb6f26d8-2ef5-472b-a525-db65d047ced3",
  "expected_version": 4,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "3bf9af60-92ea-43b2-b60e-b296e71a36c3",
  "short_number": 38,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "8d623d6e-0ca2-470c-8af8-9488c941f093",
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
  "created_at": "2026-10-31T02:25:22.55588Z",
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
  "session_id": "0c1b0316-4fc8-4453-b16a-9188a2394a98",
  "subject": {
    "type": "STAFF",
    "id": "13536a6b-90d5-4717-bcad-60e066f5abae"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzUzNmE2Yi05MGQ1LTQ3MTctYmNhZC02MGUwNjZmNWFiYWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MTQ0MjUsImlhdCI6MTc5MzQxMzUyNSwianRpIjoiMjA3ZDAwMmEtN2NhNy00NDQyLWEyZTUtMDA0YjI3ODkxN2IyIiwic2lkIjoiMGMxYjAzMTYtNGZjOC00NDUzLWIxNmEtOTE4OGEyMzk0YTk4In0.N_smbySusZvKJHrdChbA35Zv5CsEleoYQDYY8jyNDBo",
  "access_expires_at": "2026-10-31T02:40:25.385522837Z",
  "refresh_token": "nwVy5eRnIi9xEJWbmYqHtZJXFvF8vgvTvNGYuRCPwN0",
  "refresh_expires_at": "2026-10-31T14:25:25.385183148Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-27786"
}
```

```json
{
  "challenge_id": "d6b4f6d1-c4d9-455f-acd6-4ea400846641",
  "expires_at": "2026-10-31T02:30:25.573837393Z",
  "resend_available_at": "2026-10-31T02:25:26.573837393Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "133833",
  "sent_at": "2026-10-31T02:25:25.575439354Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d6b4f6d1-c4d9-455f-acd6-4ea400846641",
  "code": "133833",
  "device_ref": "sandbox-27786"
}
```

```json
{
  "session_id": "dafd4f9c-0a61-4dd1-9ae7-9d918599be01",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQxNDQyNSwiaWF0IjoxNzkzNDEzNTI1LCJqdGkiOiIyMGRlM2U4OC0zMTI5LTRlZWQtYTQzYi0zNGU5ZjUyZjJiNjciLCJzaWQiOiJkYWZkNGY5Yy0wYTYxLTRkZDEtOWFlNy05ZDkxODU5OWJlMDEifQ.SOuRps_WZlBG8fm5dMMv74nbUCXLDOfH5-9FsFLgVzM",
  "access_expires_at": "2026-10-31T02:40:25.787659165Z",
  "refresh_token": "szE289GUhy9EOh6B3SZHH3obCX_BP77EwPKqzKDxAUU",
  "refresh_expires_at": "2026-11-30T02:25:25.78729964Z",
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
      "actor_id": "13536a6b-90d5-4717-bcad-60e066f5abae",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-31T02:25:13.611361Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "13536a6b-90d5-4717-bcad-60e066f5abae",
      "reason": "Sandbox clean-up",
      "at": "2026-10-31T02:25:14.570697Z"
    }
  ],
  "duplicates": []
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "96c45b99-168b-4234-b901-c10016426e0e",
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
  "device_ref": "sandbox-24319"
}
```

```json
{
  "challenge_id": "a8c32a44-ed7d-43d4-8f33-51b2c6d7b14b",
  "expires_at": "2026-10-31T02:30:26.557379665Z",
  "resend_available_at": "2026-10-31T02:25:27.557379665Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "579683",
  "sent_at": "2026-10-31T02:25:26.559332203Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a8c32a44-ed7d-43d4-8f33-51b2c6d7b14b",
  "code": "579683",
  "device_ref": "sandbox-24319"
}
```

```json
{
  "session_id": "6ddb0b2b-4900-4e6c-93d1-211e99796185",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQxNDQyNiwiaWF0IjoxNzkzNDEzNTI2LCJqdGkiOiJlYjg3NzczNi1kZmI3LTQ1NjQtODVmOS03Y2EwMGI3NzViZmIiLCJzaWQiOiI2ZGRiMGIyYi00OTAwLTRlNmMtOTNkMS0yMTFlOTk3OTYxODUifQ.30_ZNnheqtet2_yBpCnOmIW65Rp9-X0YfGyRh8rYapo",
  "access_expires_at": "2026-10-31T02:40:26.768577621Z",
  "refresh_token": "QG3SgoHCvcJPTluid3KAPrkSxEhKT-Ls3dRj0S-4qkA",
  "refresh_expires_at": "2026-11-30T02:25:26.767947934Z",
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

(the car drives 3 s to the next point)

`POST /api/driver/v1/work-sessions` → **201**

```json
{
  "command_id": "9b070f30-7e64-477a-aca9-cd9f08c2fa57",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T02:25:30Z",
    "sequence": 1793413530155
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f212f001-9b26-4c37-975d-22e9264d6f6c",
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
  "last_heartbeat_at": "2026-10-31T02:25:30.169956Z",
  "last_location_at": "2026-10-31T02:25:30.169956Z",
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
  "command_id": "aa42013d-aeab-4c16-851e-f4742bcf5fe7",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T02:25:30Z",
    "sequence": 1793413530559
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "03a02a92-a7b0-4d07-83fc-7285beff090d",
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
  "last_heartbeat_at": "2026-10-31T02:25:30.581732Z",
  "last_location_at": "2026-10-31T02:25:30.581732Z",
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
  "session_id": "d3fa6c18-e8d7-485e-867f-d3f626f1fa56",
  "subject": {
    "type": "STAFF",
    "id": "13536a6b-90d5-4717-bcad-60e066f5abae"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzUzNmE2Yi05MGQ1LTQ3MTctYmNhZC02MGUwNjZmNWFiYWUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MTQ0MzAsImlhdCI6MTc5MzQxMzUzMCwianRpIjoiY2UxZDlkZDMtNGE4Zi00MTQ3LWExMTEtYjk3MDdmZDRkMzk2Iiwic2lkIjoiZDNmYTZjMTgtZThkNy00ODVlLTg2N2YtZDNmNjI2ZjFmYTU2In0.40hhyuHgCsxHorMwruB6YdKDeu6X3_ZumDyFnFy6qy8",
  "access_expires_at": "2026-10-31T02:40:30.975086886Z",
  "refresh_token": "kadTkjEG4pLihpcIsX6DBZrVQJaHU4ivzkFuupuCOqA",
  "refresh_expires_at": "2026-10-31T14:25:30.974656986Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "06022b7d-a6ca-442e-8483-a990fd8f66e0",
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
  "id": "ad1ab020-b090-4a35-b51d-8dc80c3cb983",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T02:30:31.160288Z",
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
  "command_id": "5b99fc10-acd5-4405-bfd9-655a557bee0a",
  "quote_id": "ad1ab020-b090-4a35-b51d-8dc80c3cb983",
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
  "id": "47443fcd-61b0-45e3-a0ea-124e2c2fdd27",
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
  "created_at": "2026-10-31T02:25:31.353798Z",
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
    "id": "e143ed1e-2ada-46ae-93f6-26b470e11391",
    "order_id": "47443fcd-61b0-45e3-a0ea-124e2c2fdd27",
    "expires_at": "2026-10-31T02:25:46.356034Z",
    "server_time": "2026-10-31T02:25:31.754847992Z",
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

`POST /api/driver/v1/offers/e143ed1e-2ada-46ae-93f6-26b470e11391/accept` → **200**

```json
{
  "command_id": "02977291-6f90-4593-bdde-422f716616dd"
}
```

```json
{
  "id": "03fede8b-7e6d-4d13-857c-afcb8e12217b",
  "order_id": "47443fcd-61b0-45e3-a0ea-124e2c2fdd27",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "8cea368f-672e-4d5b-ab04-ea23bfc5b19b",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "8cea368f-672e-4d5b-ab04-ea23bfc5b19b",
  "order_id": "47443fcd-61b0-45e3-a0ea-124e2c2fdd27",
  "assignment_id": "03fede8b-7e6d-4d13-857c-afcb8e12217b",
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
  "entrance": null,
  "contact_attempts": []
}
```

(the car drives 10 s to the next point)

`POST /api/driver/v1/work-sessions/03a02a92-a7b0-4d07-83fc-7285beff090d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T02:25:42Z",
    "sequence": 1793413542344
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "03a02a92-a7b0-4d07-83fc-7285beff090d",
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
  "last_heartbeat_at": "2026-10-31T02:25:42.358871Z",
  "last_location_at": "2026-10-31T02:25:42.358871Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/8cea368f-672e-4d5b-ab04-ea23bfc5b19b/arrive` → **200**

```json
{
  "command_id": "2c915e18-e791-4700-8291-8132f2c70c14",
  "expected_version": 0
}
```

```json
{
  "id": "8cea368f-672e-4d5b-ab04-ea23bfc5b19b",
  "order_id": "47443fcd-61b0-45e3-a0ea-124e2c2fdd27",
  "assignment_id": "03fede8b-7e6d-4d13-857c-afcb8e12217b",
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
  "arrived_at": "2026-10-31T02:25:42.54597Z",
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
  "entrance": null,
  "contact_attempts": []
}
```

`POST /api/driver/v1/trips/8cea368f-672e-4d5b-ab04-ea23bfc5b19b/start` → **200**

```json
{
  "command_id": "8c70bcff-c778-4d3d-954e-1400d4e58b9d",
  "expected_version": 1
}
```

```json
{
  "id": "8cea368f-672e-4d5b-ab04-ea23bfc5b19b",
  "order_id": "47443fcd-61b0-45e3-a0ea-124e2c2fdd27",
  "assignment_id": "03fede8b-7e6d-4d13-857c-afcb8e12217b",
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
  "arrived_at": "2026-10-31T02:25:42.54597Z",
  "started_at": "2026-10-31T02:25:42.745731Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380671112233"
  },
  "comment": null,
  "entrance": null,
  "contact_attempts": []
}
```

`POST /api/driver/v1/trips/8cea368f-672e-4d5b-ab04-ea23bfc5b19b/complete` → **200**

```json
{
  "command_id": "5a528577-bf4a-4c51-b069-8277e84df061",
  "expected_version": 2,
  "reported_at": "2026-10-31T02:25:42Z",
  "cash_received": true
}
```

```json
{
  "id": "8cea368f-672e-4d5b-ab04-ea23bfc5b19b",
  "order_id": "47443fcd-61b0-45e3-a0ea-124e2c2fdd27",
  "assignment_id": "03fede8b-7e6d-4d13-857c-afcb8e12217b",
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
  "arrived_at": "2026-10-31T02:25:42.54597Z",
  "started_at": "2026-10-31T02:25:42.745731Z",
  "completed_at": "2026-10-31T02:25:42.953876Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null,
  "comment": null,
  "entrance": null,
  "contact_attempts": []
}
```

`GET /api/operator/v1/orders/47443fcd-61b0-45e3-a0ea-124e2c2fdd27` → **200**

```json
{
  "id": "47443fcd-61b0-45e3-a0ea-124e2c2fdd27",
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
    "id": "03fede8b-7e6d-4d13-857c-afcb8e12217b",
    "order_id": "47443fcd-61b0-45e3-a0ea-124e2c2fdd27",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "8cea368f-672e-4d5b-ab04-ea23bfc5b19b",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-31T02:25:31.353798Z",
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
  "session_id": "f212f001-9b26-4c37-975d-22e9264d6f6c",
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
  "last_heartbeat_at": "2026-10-31T02:25:30.169956Z",
  "last_location_at": "2026-10-31T02:25:30.169956Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/f212f001-9b26-4c37-975d-22e9264d6f6c/close` → **200**

```json
{
  "command_id": "abe4f6bb-80b9-47fa-9011-a61b66bffaca",
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
  "session_id": "03a02a92-a7b0-4d07-83fc-7285beff090d",
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
  "last_heartbeat_at": "2026-10-31T02:25:42.358871Z",
  "last_location_at": "2026-10-31T02:25:42.358871Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/03a02a92-a7b0-4d07-83fc-7285beff090d/close` → **200**

```json
{
  "command_id": "e49d8b03-b28e-4680-b2cc-c8309f8a3370",
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

Done: terminal order 47443fcd-61b0-45e3-a0ea-124e2c2fdd27 by Andrii (5a000000-0000-4000-8000-000000000403).

# Scenario: zz-metrics

## A search without drivers ends as UNFULFILLED

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-17238"
}
```

```json
{
  "challenge_id": "5447a7c4-f8c2-42b6-bdb5-1bb2774e0e96",
  "expires_at": "2026-10-31T02:30:47.289029996Z",
  "resend_available_at": "2026-10-31T02:25:48.289029996Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "536644",
  "sent_at": "2026-10-31T02:25:47.291059813Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5447a7c4-f8c2-42b6-bdb5-1bb2774e0e96",
  "code": "536644",
  "device_ref": "sandbox-17238"
}
```

```json
{
  "session_id": "15e6d2f9-b614-41e7-be93-7b23b0b573d4",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQxNDQ0NywiaWF0IjoxNzkzNDEzNTQ3LCJqdGkiOiJjNWRlZTg5Yy02NzY0LTQxMWMtYmVhNS0yODAwODBmNTQ5NzciLCJzaWQiOiIxNWU2ZDJmOS1iNjE0LTQxZTctYmU5My03YjIzYjBiNTczZDQifQ.zOfXqiGBuvtiEut_xl3clFlebUdAQKU7zvP0UBEpySA",
  "access_expires_at": "2026-10-31T02:40:47.511249061Z",
  "refresh_token": "nNg7n_srVL7jjuAIlrz9krh8f4l7p30sYp374tlKp94",
  "refresh_expires_at": "2026-11-30T02:25:47.510534901Z",
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
  "device_ref": "sandbox-10420"
}
```

```json
{
  "challenge_id": "98cea5b2-4c66-4411-a3af-4569d7f95d2b",
  "expires_at": "2026-10-31T02:30:47.885285132Z",
  "resend_available_at": "2026-10-31T02:25:48.885285132Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "947090",
  "sent_at": "2026-10-31T02:25:47.887149152Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "98cea5b2-4c66-4411-a3af-4569d7f95d2b",
  "code": "947090",
  "device_ref": "sandbox-10420"
}
```

```json
{
  "session_id": "94240494-b249-4490-9717-4aa8e402534a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQxNDQ0OCwiaWF0IjoxNzkzNDEzNTQ4LCJqdGkiOiI4NTVlYWFjOC00NmY4LTQ2YjEtODkzNi1kMTdmMGFhZTFmY2UiLCJzaWQiOiI5NDI0MDQ5NC1iMjQ5LTQ0OTAtOTcxNy00YWE4ZTQwMjUzNGEifQ.7gYfH83sKSY0v8gswE2cR6bybXjuC7KxkqhrY5dfrWQ",
  "access_expires_at": "2026-10-31T02:40:48.092788446Z",
  "refresh_token": "TSkNaL8KoJBd-VnNCMlvly_qNFBSM1XcK5KDf_pD67Q",
  "refresh_expires_at": "2026-11-30T02:25:48.092411746Z",
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
  "device_ref": "sandbox-622"
}
```

```json
{
  "challenge_id": "47e46fba-329d-4329-9d63-a25577a33ad4",
  "expires_at": "2026-10-31T02:30:48.497889187Z",
  "resend_available_at": "2026-10-31T02:25:49.497889187Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "022823",
  "sent_at": "2026-10-31T02:25:48.49994989Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "47e46fba-329d-4329-9d63-a25577a33ad4",
  "code": "022823",
  "device_ref": "sandbox-622"
}
```

```json
{
  "session_id": "775eedef-ec92-4b2c-b320-fda9a09bd80b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQxNDQ0OCwiaWF0IjoxNzkzNDEzNTQ4LCJqdGkiOiIyOGUzZGE2Mi1mNWRjLTQ2YzctYjU0Yy0xNzQ2MDM2MWZiMDIiLCJzaWQiOiI3NzVlZWRlZi1lYzkyLTRiMmMtYjMyMC1mZGE5YTA5YmQ4MGIifQ.tXgBAiilBe9vCRhPWOyZT25V2nlMfoejLj1HgnYofxg",
  "access_expires_at": "2026-10-31T02:40:48.710470984Z",
  "refresh_token": "Li1362L0zvrLxGI84SgxZy8_jaUZmqQ4lw3D_2iFxuw",
  "refresh_expires_at": "2026-11-30T02:25:48.709999939Z",
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
  "phone": "+380694081226",
  "device_ref": "sandbox-14687"
}
```

```json
{
  "challenge_id": "483319f6-618a-4f50-854a-7e5eaad18646",
  "expires_at": "2026-10-31T02:30:49.08285556Z",
  "resend_available_at": "2026-10-31T02:25:50.08285556Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380694081226` → **200**

```json
{
  "phone": "+380694081226",
  "audience": "CLIENT",
  "code": "354930",
  "sent_at": "2026-10-31T02:25:49.084659381Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "483319f6-618a-4f50-854a-7e5eaad18646",
  "code": "354930",
  "device_ref": "sandbox-14687"
}
```

```json
{
  "session_id": "b709a7f3-3e29-40f5-a891-a3a96a197964",
  "subject": {
    "type": "CLIENT",
    "id": "2619c6b0-1640-4a2a-96ad-80c1859a73b6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNjE5YzZiMC0xNjQwLTRhMmEtOTZhZC04MGMxODU5YTczYjYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDE0NDQ5LCJpYXQiOjE3OTM0MTM1NDksImp0aSI6ImJiZGFmMjNmLTA0MmItNDRkNy04YzM4LWZiOWQ2YTFmNmUwOCIsInNpZCI6ImI3MDlhN2YzLTNlMjktNDBmNS1hODkxLWEzYTk2YTE5Nzk2NCJ9.uL7-Zs_TAZcKOzVMFtFM1WGxDGP99wsZ3ttAtkjv_lc",
  "access_expires_at": "2026-10-31T02:40:49.293732273Z",
  "refresh_token": "z_0ScsUoX14uKaIA-e5I84flOAWoXfq7t0DGDIAbIoo",
  "refresh_expires_at": "2026-11-30T02:25:49.29329254Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "52df657d-35ff-4319-904d-358b71290255",
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
  "id": "05007bfc-4d3f-49ba-b52e-b4d001d3caf9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T02:30:49.482255Z",
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
  "command_id": "5444ff81-31ec-4c25-9eb2-805c2a0db154",
  "quote_id": "05007bfc-4d3f-49ba-b52e-b4d001d3caf9",
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
  "id": "a6580bd4-7d69-4f83-a0df-a49e9f7d4d2d",
  "short_number": 40,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2619c6b0-1640-4a2a-96ad-80c1859a73b6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-31T02:25:49.675236Z",
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

`GET /api/rider/v1/orders/a6580bd4-7d69-4f83-a0df-a49e9f7d4d2d` → **200**

```json
{
  "id": "a6580bd4-7d69-4f83-a0df-a49e9f7d4d2d",
  "short_number": 40,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2619c6b0-1640-4a2a-96ad-80c1859a73b6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-31T02:25:49.675236Z",
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

`GET /api/rider/v1/orders/a6580bd4-7d69-4f83-a0df-a49e9f7d4d2d` → **200**

```json
{
  "id": "a6580bd4-7d69-4f83-a0df-a49e9f7d4d2d",
  "short_number": 40,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2619c6b0-1640-4a2a-96ad-80c1859a73b6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-31T02:25:49.675236Z",
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

`GET /api/rider/v1/orders/a6580bd4-7d69-4f83-a0df-a49e9f7d4d2d` → **200**

```json
{
  "id": "a6580bd4-7d69-4f83-a0df-a49e9f7d4d2d",
  "short_number": 40,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2619c6b0-1640-4a2a-96ad-80c1859a73b6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-31T02:25:49.675236Z",
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

`GET /api/rider/v1/orders/a6580bd4-7d69-4f83-a0df-a49e9f7d4d2d` → **200**

```json
{
  "id": "a6580bd4-7d69-4f83-a0df-a49e9f7d4d2d",
  "short_number": 40,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2619c6b0-1640-4a2a-96ad-80c1859a73b6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-31T02:25:49.675236Z",
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

`GET /api/rider/v1/orders/a6580bd4-7d69-4f83-a0df-a49e9f7d4d2d` → **200**

```json
{
  "id": "a6580bd4-7d69-4f83-a0df-a49e9f7d4d2d",
  "short_number": 40,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2619c6b0-1640-4a2a-96ad-80c1859a73b6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-31T02:25:49.675236Z",
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

`GET /api/rider/v1/orders/a6580bd4-7d69-4f83-a0df-a49e9f7d4d2d` → **200**

```json
{
  "id": "a6580bd4-7d69-4f83-a0df-a49e9f7d4d2d",
  "short_number": 40,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2619c6b0-1640-4a2a-96ad-80c1859a73b6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-31T02:25:49.675236Z",
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

`GET /api/rider/v1/orders/a6580bd4-7d69-4f83-a0df-a49e9f7d4d2d` → **200**

```json
{
  "id": "a6580bd4-7d69-4f83-a0df-a49e9f7d4d2d",
  "short_number": 40,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2619c6b0-1640-4a2a-96ad-80c1859a73b6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-31T02:25:49.675236Z",
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

`GET /api/rider/v1/orders/a6580bd4-7d69-4f83-a0df-a49e9f7d4d2d` → **200**

```json
{
  "id": "a6580bd4-7d69-4f83-a0df-a49e9f7d4d2d",
  "short_number": 40,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2619c6b0-1640-4a2a-96ad-80c1859a73b6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-31T02:25:49.675236Z",
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

`GET /api/rider/v1/orders/a6580bd4-7d69-4f83-a0df-a49e9f7d4d2d` → **200**

```json
{
  "id": "a6580bd4-7d69-4f83-a0df-a49e9f7d4d2d",
  "short_number": 40,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2619c6b0-1640-4a2a-96ad-80c1859a73b6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-31T02:25:49.675236Z",
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

`GET /api/rider/v1/orders/a6580bd4-7d69-4f83-a0df-a49e9f7d4d2d` → **200**

```json
{
  "id": "a6580bd4-7d69-4f83-a0df-a49e9f7d4d2d",
  "short_number": 40,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2619c6b0-1640-4a2a-96ad-80c1859a73b6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-31T02:25:49.675236Z",
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

`GET /api/rider/v1/orders/a6580bd4-7d69-4f83-a0df-a49e9f7d4d2d` → **200**

```json
{
  "id": "a6580bd4-7d69-4f83-a0df-a49e9f7d4d2d",
  "short_number": 40,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2619c6b0-1640-4a2a-96ad-80c1859a73b6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-31T02:25:49.675236Z",
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

`GET /api/rider/v1/orders/a6580bd4-7d69-4f83-a0df-a49e9f7d4d2d` → **200**

```json
{
  "id": "a6580bd4-7d69-4f83-a0df-a49e9f7d4d2d",
  "short_number": 40,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2619c6b0-1640-4a2a-96ad-80c1859a73b6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-31T02:25:49.675236Z",
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

`GET /api/rider/v1/orders/a6580bd4-7d69-4f83-a0df-a49e9f7d4d2d` → **200**

```json
{
  "id": "a6580bd4-7d69-4f83-a0df-a49e9f7d4d2d",
  "short_number": 40,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2619c6b0-1640-4a2a-96ad-80c1859a73b6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-31T02:25:49.675236Z",
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

`GET /api/rider/v1/orders/a6580bd4-7d69-4f83-a0df-a49e9f7d4d2d` → **200**

```json
{
  "id": "a6580bd4-7d69-4f83-a0df-a49e9f7d4d2d",
  "short_number": 40,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2619c6b0-1640-4a2a-96ad-80c1859a73b6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-31T02:25:49.675236Z",
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

`GET /api/rider/v1/orders/a6580bd4-7d69-4f83-a0df-a49e9f7d4d2d` → **200**

```json
{
  "id": "a6580bd4-7d69-4f83-a0df-a49e9f7d4d2d",
  "short_number": 40,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2619c6b0-1640-4a2a-96ad-80c1859a73b6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-31T02:25:49.675236Z",
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

`GET /api/rider/v1/orders/a6580bd4-7d69-4f83-a0df-a49e9f7d4d2d` → **200**

```json
{
  "id": "a6580bd4-7d69-4f83-a0df-a49e9f7d4d2d",
  "short_number": 40,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2619c6b0-1640-4a2a-96ad-80c1859a73b6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-31T02:25:49.675236Z",
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

`GET /api/rider/v1/orders/a6580bd4-7d69-4f83-a0df-a49e9f7d4d2d` → **200**

```json
{
  "id": "a6580bd4-7d69-4f83-a0df-a49e9f7d4d2d",
  "short_number": 40,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2619c6b0-1640-4a2a-96ad-80c1859a73b6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-31T02:25:49.675236Z",
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

`GET /api/rider/v1/orders/a6580bd4-7d69-4f83-a0df-a49e9f7d4d2d` → **200**

```json
{
  "id": "a6580bd4-7d69-4f83-a0df-a49e9f7d4d2d",
  "short_number": 40,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2619c6b0-1640-4a2a-96ad-80c1859a73b6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-31T02:25:49.675236Z",
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

`GET /api/rider/v1/orders/a6580bd4-7d69-4f83-a0df-a49e9f7d4d2d` → **200**

```json
{
  "id": "a6580bd4-7d69-4f83-a0df-a49e9f7d4d2d",
  "short_number": 40,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2619c6b0-1640-4a2a-96ad-80c1859a73b6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-31T02:25:49.675236Z",
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

`GET /api/rider/v1/orders/a6580bd4-7d69-4f83-a0df-a49e9f7d4d2d` → **200**

```json
{
  "id": "a6580bd4-7d69-4f83-a0df-a49e9f7d4d2d",
  "short_number": 40,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2619c6b0-1640-4a2a-96ad-80c1859a73b6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-31T02:25:49.675236Z",
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

`GET /api/rider/v1/orders/a6580bd4-7d69-4f83-a0df-a49e9f7d4d2d` → **200**

```json
{
  "id": "a6580bd4-7d69-4f83-a0df-a49e9f7d4d2d",
  "short_number": 40,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2619c6b0-1640-4a2a-96ad-80c1859a73b6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-31T02:25:49.675236Z",
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

`GET /api/rider/v1/orders/a6580bd4-7d69-4f83-a0df-a49e9f7d4d2d` → **200**

```json
{
  "id": "a6580bd4-7d69-4f83-a0df-a49e9f7d4d2d",
  "short_number": 40,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2619c6b0-1640-4a2a-96ad-80c1859a73b6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-31T02:25:49.675236Z",
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

`GET /api/rider/v1/orders/a6580bd4-7d69-4f83-a0df-a49e9f7d4d2d` → **200**

```json
{
  "id": "a6580bd4-7d69-4f83-a0df-a49e9f7d4d2d",
  "short_number": 40,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2619c6b0-1640-4a2a-96ad-80c1859a73b6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-31T02:25:49.675236Z",
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

`GET /api/rider/v1/orders/a6580bd4-7d69-4f83-a0df-a49e9f7d4d2d` → **200**

```json
{
  "id": "a6580bd4-7d69-4f83-a0df-a49e9f7d4d2d",
  "short_number": 40,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2619c6b0-1640-4a2a-96ad-80c1859a73b6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-31T02:25:49.675236Z",
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

`GET /api/rider/v1/orders/a6580bd4-7d69-4f83-a0df-a49e9f7d4d2d` → **200**

```json
{
  "id": "a6580bd4-7d69-4f83-a0df-a49e9f7d4d2d",
  "short_number": 40,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2619c6b0-1640-4a2a-96ad-80c1859a73b6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-31T02:25:49.675236Z",
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

`GET /api/rider/v1/orders/a6580bd4-7d69-4f83-a0df-a49e9f7d4d2d` → **200**

```json
{
  "id": "a6580bd4-7d69-4f83-a0df-a49e9f7d4d2d",
  "short_number": 40,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2619c6b0-1640-4a2a-96ad-80c1859a73b6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-31T02:25:49.675236Z",
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

`GET /api/rider/v1/orders/a6580bd4-7d69-4f83-a0df-a49e9f7d4d2d` → **200**

```json
{
  "id": "a6580bd4-7d69-4f83-a0df-a49e9f7d4d2d",
  "short_number": 40,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2619c6b0-1640-4a2a-96ad-80c1859a73b6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-31T02:25:49.675236Z",
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

`GET /api/rider/v1/orders/a6580bd4-7d69-4f83-a0df-a49e9f7d4d2d` → **200**

```json
{
  "id": "a6580bd4-7d69-4f83-a0df-a49e9f7d4d2d",
  "short_number": 40,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2619c6b0-1640-4a2a-96ad-80c1859a73b6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-31T02:25:49.675236Z",
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

`GET /api/rider/v1/orders/a6580bd4-7d69-4f83-a0df-a49e9f7d4d2d` → **200**

```json
{
  "id": "a6580bd4-7d69-4f83-a0df-a49e9f7d4d2d",
  "short_number": 40,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2619c6b0-1640-4a2a-96ad-80c1859a73b6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-31T02:25:49.675236Z",
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

`GET /api/rider/v1/orders/a6580bd4-7d69-4f83-a0df-a49e9f7d4d2d` → **200**

```json
{
  "id": "a6580bd4-7d69-4f83-a0df-a49e9f7d4d2d",
  "short_number": 40,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2619c6b0-1640-4a2a-96ad-80c1859a73b6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-31T02:25:49.675236Z",
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

`GET /api/rider/v1/orders/a6580bd4-7d69-4f83-a0df-a49e9f7d4d2d` → **200**

```json
{
  "id": "a6580bd4-7d69-4f83-a0df-a49e9f7d4d2d",
  "short_number": 40,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2619c6b0-1640-4a2a-96ad-80c1859a73b6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-31T02:25:49.675236Z",
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

`GET /api/rider/v1/orders/a6580bd4-7d69-4f83-a0df-a49e9f7d4d2d` → **200**

```json
{
  "id": "a6580bd4-7d69-4f83-a0df-a49e9f7d4d2d",
  "short_number": 40,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2619c6b0-1640-4a2a-96ad-80c1859a73b6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-31T02:25:49.675236Z",
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

`GET /api/rider/v1/orders/a6580bd4-7d69-4f83-a0df-a49e9f7d4d2d` → **200**

```json
{
  "id": "a6580bd4-7d69-4f83-a0df-a49e9f7d4d2d",
  "short_number": 40,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2619c6b0-1640-4a2a-96ad-80c1859a73b6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-31T02:25:49.675236Z",
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

`GET /api/rider/v1/orders/a6580bd4-7d69-4f83-a0df-a49e9f7d4d2d` → **200**

```json
{
  "id": "a6580bd4-7d69-4f83-a0df-a49e9f7d4d2d",
  "short_number": 40,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2619c6b0-1640-4a2a-96ad-80c1859a73b6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-31T02:25:49.675236Z",
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

`GET /api/rider/v1/orders/a6580bd4-7d69-4f83-a0df-a49e9f7d4d2d` → **200**

```json
{
  "id": "a6580bd4-7d69-4f83-a0df-a49e9f7d4d2d",
  "short_number": 40,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2619c6b0-1640-4a2a-96ad-80c1859a73b6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-31T02:25:49.675236Z",
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

`GET /api/rider/v1/orders/a6580bd4-7d69-4f83-a0df-a49e9f7d4d2d` → **200**

```json
{
  "id": "a6580bd4-7d69-4f83-a0df-a49e9f7d4d2d",
  "short_number": 40,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "2619c6b0-1640-4a2a-96ad-80c1859a73b6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T02:25:49.675236Z",
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
  "blizz_sms_sent_total": 98
}

```prometheus
blizz_dispatch_assigned_seconds_count{application="blizz-taxi-server",source="BROADCAST"} 1
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="BROADCAST"} 7.585379428
blizz_dispatch_assigned_seconds_count{application="blizz-taxi-server",source="OFFER"} 24
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="OFFER"} 19.831840652
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
blizz_dispatch_first_offer_seconds_sum{application="blizz-taxi-server"} 1.648360408
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
blizz_sms_sent_total{application="blizz-taxi-server",purpose="CALLER",state="SENT"} 5.0
blizz_sms_sent_total{application="blizz-taxi-server",purpose="OTP",state="FAILED"} 1.0
blizz_sms_sent_total{application="blizz-taxi-server",purpose="OTP",state="SENT"} 92.0
```

Done: real no-car deadline, non-zero counters/timers and bounded labels on the management port.

`GET /api/rider/v1/orders/a6580bd4-7d69-4f83-a0df-a49e9f7d4d2d` → **200**

```json
{
  "id": "a6580bd4-7d69-4f83-a0df-a49e9f7d4d2d",
  "short_number": 40,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "2619c6b0-1640-4a2a-96ad-80c1859a73b6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T02:25:49.675236Z",
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
  "session_id": "1392bae0-6fc0-49e4-8127-d35e0b3fea8e",
  "subject": {
    "type": "STAFF",
    "id": "13536a6b-90d5-4717-bcad-60e066f5abae"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzUzNmE2Yi05MGQ1LTQ3MTctYmNhZC02MGUwNjZmNWFiYWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MTQ2MzIsImlhdCI6MTc5MzQxMzczMiwianRpIjoiOWQ5MTE3NmMtM2E5Ny00YTBiLWFjZGYtMzRlZmU2ZTAxMDBmIiwic2lkIjoiMTM5MmJhZTAtNmZjMC00OWU0LTgxMjctZDM1ZTBiM2ZlYThlIn0.7UmeFwiKwXOvGDIymn8j_5msPVFyMMY4OjOB6eykW7k",
  "access_expires_at": "2026-10-31T02:43:52.615228028Z",
  "refresh_token": "EHIpiA8lm2ms0-zffbPht6rQWWLfd37zarTso-_8_s0",
  "refresh_expires_at": "2026-10-31T14:28:52.614856696Z",
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
  "id": "3cb0686b-ccb8-44e0-b25a-4046b29fd7de",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-31",
  "period_from": "2026-10-30T22:00:00Z",
  "period_to": "2026-11-01T02:00:00Z",
  "observed_until": "2026-10-31T02:28:52.807022Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-31T02:28:52.807062Z",
  "updated_at": "2026-10-31T02:28:52.83184Z",
  "finished_at": "2026-10-31T02:28:52.83184Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/3cb0686b-ccb8-44e0-b25a-4046b29fd7de` → **200**

```json
{
  "run": {
    "id": "3cb0686b-ccb8-44e0-b25a-4046b29fd7de",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "day": "2026-10-31",
    "period_from": "2026-10-30T22:00:00Z",
    "period_to": "2026-11-01T02:00:00Z",
    "observed_until": "2026-10-31T02:28:52.807022Z",
    "partial": true,
    "state": "CLEAN",
    "local_count": 10,
    "provider_count": 10,
    "item_count": 0,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-31T02:28:52.807062Z",
    "updated_at": "2026-10-31T02:28:52.83184Z",
    "finished_at": "2026-10-31T02:28:52.83184Z",
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
  "id": "3cb0686b-ccb8-44e0-b25a-4046b29fd7de",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-31",
  "period_from": "2026-10-30T22:00:00Z",
  "period_to": "2026-11-01T02:00:00Z",
  "observed_until": "2026-10-31T02:28:52.807022Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-31T02:28:52.807062Z",
  "updated_at": "2026-10-31T02:28:52.83184Z",
  "finished_at": "2026-10-31T02:28:52.83184Z",
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
  "id": "3cb0686b-ccb8-44e0-b25a-4046b29fd7de",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-31",
  "period_from": "2026-10-30T22:00:00Z",
  "period_to": "2026-11-01T02:00:00Z",
  "observed_until": "2026-10-31T02:28:52.807022Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-31T02:28:52.807062Z",
  "updated_at": "2026-10-31T02:28:52.83184Z",
  "finished_at": "2026-10-31T02:28:52.83184Z",
  "version": 1
}
```

## One independent bank transaction produces one missing-local item on another merchant's first snapshot

`POST /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/1f7fe0a3-77da-44fd-b6e3-491c4d4218eb` → **204**

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
  "id": "0abc2e08-fa21-4016-95df-856686c0b253",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-31",
  "period_from": "2026-10-30T22:00:00Z",
  "period_to": "2026-11-01T02:00:00Z",
  "observed_until": "2026-10-31T02:28:53.126409Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-31T02:28:53.126432Z",
  "updated_at": "2026-10-31T02:28:53.131173Z",
  "finished_at": "2026-10-31T02:28:53.131173Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/0abc2e08-fa21-4016-95df-856686c0b253` → **200**

```json
{
  "run": {
    "id": "0abc2e08-fa21-4016-95df-856686c0b253",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-31",
    "period_from": "2026-10-30T22:00:00Z",
    "period_to": "2026-11-01T02:00:00Z",
    "observed_until": "2026-10-31T02:28:53.126409Z",
    "partial": true,
    "state": "OPEN",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 1,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-31T02:28:53.126432Z",
    "updated_at": "2026-10-31T02:28:53.131173Z",
    "finished_at": "2026-10-31T02:28:53.131173Z",
    "version": 1
  },
  "items": [
    {
      "id": "09bd6bb9-aeb5-4e1e-9b11-acb23937329a",
      "run_id": "0abc2e08-fa21-4016-95df-856686c0b253",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "377a8a675d5c3d60100822dcb5ef4db9e320b63d8db5589f68fcc791a967365a",
      "reference_display": "sandbox-reconciliation-1f7fe0a3-77da-44fd-b6e3-491c4d4218eb",
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
      "provider_at": "2026-10-31T02:28:53Z",
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
  "id": "0abc2e08-fa21-4016-95df-856686c0b253",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-31",
  "period_from": "2026-10-30T22:00:00Z",
  "period_to": "2026-11-01T02:00:00Z",
  "observed_until": "2026-10-31T02:28:53.126409Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-31T02:28:53.126432Z",
  "updated_at": "2026-10-31T02:28:53.131173Z",
  "finished_at": "2026-10-31T02:28:53.131173Z",
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
  "id": "0abc2e08-fa21-4016-95df-856686c0b253",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-31",
  "period_from": "2026-10-30T22:00:00Z",
  "period_to": "2026-11-01T02:00:00Z",
  "observed_until": "2026-10-31T02:28:53.126409Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-31T02:28:53.126432Z",
  "updated_at": "2026-10-31T02:28:53.131173Z",
  "finished_at": "2026-10-31T02:28:53.131173Z",
  "version": 1
}
```

## The admin explains the item once; a replay is the same result and a different decision conflicts

`POST /api/admin/v1/payment-reconciliations/items/09bd6bb9-aeb5-4e1e-9b11-acb23937329a/resolve` → **200**

```json
{
  "command_id": "7fc975f0-9c9b-4bcd-ba29-6871e6437397",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "09bd6bb9-aeb5-4e1e-9b11-acb23937329a",
  "run_id": "0abc2e08-fa21-4016-95df-856686c0b253",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "377a8a675d5c3d60100822dcb5ef4db9e320b63d8db5589f68fcc791a967365a",
  "reference_display": "sandbox-reconciliation-1f7fe0a3-77da-44fd-b6e3-491c4d4218eb",
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
  "provider_at": "2026-10-31T02:28:53Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "13536a6b-90d5-4717-bcad-60e066f5abae",
  "resolved_at": "2026-10-31T02:28:53.413021Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/09bd6bb9-aeb5-4e1e-9b11-acb23937329a/resolve` → **200**

```json
{
  "command_id": "7fc975f0-9c9b-4bcd-ba29-6871e6437397",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "09bd6bb9-aeb5-4e1e-9b11-acb23937329a",
  "run_id": "0abc2e08-fa21-4016-95df-856686c0b253",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "377a8a675d5c3d60100822dcb5ef4db9e320b63d8db5589f68fcc791a967365a",
  "reference_display": "sandbox-reconciliation-1f7fe0a3-77da-44fd-b6e3-491c4d4218eb",
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
  "provider_at": "2026-10-31T02:28:53Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "13536a6b-90d5-4717-bcad-60e066f5abae",
  "resolved_at": "2026-10-31T02:28:53.413021Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/09bd6bb9-aeb5-4e1e-9b11-acb23937329a/resolve` → **409**

```json
{
  "command_id": "85a67108-f4fd-45bd-8f28-7be4d73e4850",
  "expected_version": 1,
  "decision": "ESCALATED",
  "reason": "A conflicting second decision"
}
```

```json
{
  "instance": "/api/admin/v1/payment-reconciliations/items/09bd6bb9-aeb5-4e1e-9b11-acb23937329a/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "6698d3da-30ab-4928-892c-187de84ae986"
}
```

`GET /api/admin/v1/payment-reconciliations/0abc2e08-fa21-4016-95df-856686c0b253` → **200**

```json
{
  "run": {
    "id": "0abc2e08-fa21-4016-95df-856686c0b253",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-31",
    "period_from": "2026-10-30T22:00:00Z",
    "period_to": "2026-11-01T02:00:00Z",
    "observed_until": "2026-10-31T02:28:53.126409Z",
    "partial": true,
    "state": "RESOLVED",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-31T02:28:53.126432Z",
    "updated_at": "2026-10-31T02:28:53.413021Z",
    "finished_at": "2026-10-31T02:28:53.131173Z",
    "version": 2
  },
  "items": [
    {
      "id": "09bd6bb9-aeb5-4e1e-9b11-acb23937329a",
      "run_id": "0abc2e08-fa21-4016-95df-856686c0b253",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "377a8a675d5c3d60100822dcb5ef4db9e320b63d8db5589f68fcc791a967365a",
      "reference_display": "sandbox-reconciliation-1f7fe0a3-77da-44fd-b6e3-491c4d4218eb",
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
      "provider_at": "2026-10-31T02:28:53Z",
      "state": "RESOLVED",
      "decision": "EXPLAINED",
      "reason": "Independent sandbox bank fixture; no real money moved",
      "resolved_by": "13536a6b-90d5-4717-bcad-60e066f5abae",
      "resolved_at": "2026-10-31T02:28:53.413021Z",
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
      "id": "0abc2e08-fa21-4016-95df-856686c0b253",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-31",
      "period_from": "2026-10-30T22:00:00Z",
      "period_to": "2026-11-01T02:00:00Z",
      "observed_until": "2026-10-31T02:28:53.126409Z",
      "partial": true,
      "state": "RESOLVED",
      "local_count": 0,
      "provider_count": 1,
      "item_count": 1,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-31T02:28:53.126432Z",
      "updated_at": "2026-10-31T02:28:53.413021Z",
      "finished_at": "2026-10-31T02:28:53.131173Z",
      "version": 2
    },
    {
      "id": "56fd706a-3548-4dc6-af20-12b1f4e03367",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-30",
      "period_from": "2026-10-29T22:00:00Z",
      "period_to": "2026-10-31T02:00:00Z",
      "observed_until": "2026-10-31T02:15:00.006092Z",
      "partial": false,
      "state": "CLEAN",
      "local_count": 0,
      "provider_count": 0,
      "item_count": 0,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-31T02:15:00.00611Z",
      "updated_at": "2026-10-31T02:15:00.008726Z",
      "finished_at": "2026-10-31T02:15:00.008726Z",
      "version": 1
    },
    {
      "id": "6b11c09c-3d24-4d99-b6a4-d0ee900b2eb7",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-29",
      "period_from": "2026-10-28T22:00:00Z",
      "period_to": "2026-10-30T02:00:00Z",
      "observed_until": "2026-10-31T02:06:40.179864Z",
      "partial": false,
      "state": "CLEAN",
      "local_count": 0,
      "provider_count": 0,
      "item_count": 0,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-31T02:06:40.179923Z",
      "updated_at": "2026-10-31T02:06:40.183461Z",
      "finished_at": "2026-10-31T02:06:40.183461Z",
      "version": 1
    }
  ],
  "next_cursor": null
}
```

`DELETE /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/1f7fe0a3-77da-44fd-b6e3-491c4d4218eb` → **204**

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-31"
}
```

```json
{
  "id": "0abc2e08-fa21-4016-95df-856686c0b253",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-31",
  "period_from": "2026-10-30T22:00:00Z",
  "period_to": "2026-11-01T02:00:00Z",
  "observed_until": "2026-10-31T02:28:53.126409Z",
  "partial": true,
  "state": "RESOLVED",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-31T02:28:53.126432Z",
  "updated_at": "2026-10-31T02:28:53.413021Z",
  "finished_at": "2026-10-31T02:28:53.131173Z",
  "version": 2
}
```

Done: clean card snapshot, one bank-only difference, three identical runs, audited decision/replay/conflict, bank fixture restored.

# Scenario: zzz-invariants

## Five invariant checks are clean after all scenario transactions settle

```prometheus
blizz_invariant_last_success{application="blizz-taxi-server",check="I1"} 1.793413855427E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I2"} 1.793413855655E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I3"} 1.793413855655E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I4"} 1.793413855427E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I5"} 1.793413855655E9
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
  "phone": "+380683911746",
  "device_ref": "sandbox-27455"
}
```

```json
{
  "challenge_id": "2941f5b0-fc07-4368-9cca-f112f01bb1b1",
  "expires_at": "2026-10-31T02:35:55.852911858Z",
  "resend_available_at": "2026-10-31T02:30:56.852911858Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380683911746` → **200**

```json
{
  "phone": "+380683911746",
  "audience": "CLIENT",
  "code": "995000",
  "sent_at": "2026-10-31T02:30:55.855226298Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2941f5b0-fc07-4368-9cca-f112f01bb1b1",
  "code": "995000",
  "device_ref": "sandbox-27455"
}
```

```json
{
  "session_id": "91d7045d-cf29-4d0b-b19e-2b2c432f8c2d",
  "subject": {
    "type": "CLIENT",
    "id": "af7dd7ec-897d-4730-8613-754b5e2a4939"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZjdkZDdlYy04OTdkLTQ3MzAtODYxMy03NTRiNWUyYTQ5MzkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDE0NzU2LCJpYXQiOjE3OTM0MTM4NTYsImp0aSI6Ijk4Y2NiN2FhLWUxYTktNDNlYS1hMDkzLWNiMzQ2ZDM0MzgxOCIsInNpZCI6IjkxZDcwNDVkLWNmMjktNGQwYi1iMTllLTJiMmM0MzJmOGMyZCJ9.wowZuMJgtzGtxNMdQa48lITX3kASjSp8KxMYdDgZYAc",
  "access_expires_at": "2026-10-31T02:45:56.061961559Z",
  "refresh_token": "00ydUvvc1iMcp897MUeRmtuHTinTChr2-ry3-rvp8gg",
  "refresh_expires_at": "2026-11-30T02:30:56.061447885Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "af7dd7ec-897d-4730-8613-754b5e2a4939",
  "session_id": "91d7045d-cf29-4d0b-b19e-2b2c432f8c2d",
  "account_state": "ACTIVE"
}
```

## Back up the database (deploy/backup.sh)
Backed up blizz to blizz.dump (584K)

## After the backup the rider deletes the account and staff complete it

`POST /api/rider/v1/me/deletion-request/challenge` → **201**

```json
{
  "challenge_id": "259884cc-5b87-4b55-a406-19abaa5d2b02",
  "expires_at": "2026-10-31T02:35:58.77770147Z",
  "resend_available_at": "2026-10-31T02:30:59.77770147Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380683911746` → **200**

```json
{
  "phone": "+380683911746",
  "audience": "CLIENT",
  "code": "178378",
  "sent_at": "2026-10-31T02:30:58.779252223Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "8ca98f12-3631-4a9f-b087-c8a7a4204c20",
  "challenge_id": "259884cc-5b87-4b55-a406-19abaa5d2b02",
  "otp_code": "178378"
}
```

```json
{
  "client_id": "af7dd7ec-897d-4730-8613-754b5e2a4939",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-31T02:30:58.979808782Z"
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
  "session_id": "cc58f375-0437-4091-b3e7-661e8cd0d0ae",
  "subject": {
    "type": "STAFF",
    "id": "13536a6b-90d5-4717-bcad-60e066f5abae"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzUzNmE2Yi05MGQ1LTQ3MTctYmNhZC02MGUwNjZmNWFiYWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MTQ3NTksImlhdCI6MTc5MzQxMzg1OSwianRpIjoiYmYyMDM4NGEtZTM3OS00NzIwLTg5NDItOWU5NTU3MjkzNGQ4Iiwic2lkIjoiY2M1OGYzNzUtMDQzNy00MDkxLWIzZTctNjYxZThjZDBkMGFlIn0.3oXCD-8gN0tDcgA0l4Ftsxa20Cs9MGCAv8hIncEZf9w",
  "access_expires_at": "2026-10-31T02:45:59.362611573Z",
  "refresh_token": "6mxM0GIUJtw4E2K4ybb9ET--FNIC6Mqfjl7NQJJBPeQ",
  "refresh_expires_at": "2026-10-31T14:30:59.362232131Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/client-deletions/af7dd7ec-897d-4730-8613-754b5e2a4939/complete` → **200**

```json
{
  "command_id": "8e2fe4e6-03e9-4ddd-8c84-3f9a68c51646",
  "reason": "Sandbox: backup and restore check"
}
```

```json
{
  "client_id": "af7dd7ec-897d-4730-8613-754b5e2a4939",
  "account_state": "ANONYMIZED"
}
```

## Restore into an empty database (deploy/restore.sh); over data it refuses
Restored blizz.dump into blizz_restored: 106 migrations applied. Start the server on it with the same ERASURE_JOURNAL_DIR.
Database blizz_restored is not empty (114 tables): restore only into an empty database

In the restored database before the server starts: `ACTIVE +380683911746` (the backup predates the deletion).

## Start the server on the restored database with the same journal: the deletion is applied again

After the start: `ANONYMIZED -`.

Done: backup, restore into an empty database, start on it; the deleted rider stayed deleted (T-39).
