# Sandbox transcript (2026-10-30T17:41:11Z, bdd4e4d)

# Scenario: admission-cities

## Only Andrii is online in Kyiv for this scenario

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-18140"
}
```

```json
{
  "challenge_id": "4abec9fb-77af-42bf-8219-11850678fc4a",
  "expires_at": "2026-10-30T17:46:11.922727532Z",
  "resend_available_at": "2026-10-30T17:41:12.922727532Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "193701",
  "sent_at": "2026-10-30T17:41:11.934924626Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4abec9fb-77af-42bf-8219-11850678fc4a",
  "code": "193701",
  "device_ref": "sandbox-18140"
}
```

```json
{
  "session_id": "b8f681f6-49a3-4e08-912f-1df526703fd3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4Mjk3OCwiaWF0IjoxNzkzMzgyMDc4LCJqdGkiOiIzMDkzZWNmYi00MTI0LTRmNzAtYjA5Ny03OWI4NjBkMGY0ZmQiLCJzaWQiOiJiOGY2ODFmNi00OWEzLTRlMDgtOTEyZi0xZGY1MjY3MDNmZDMifQ.X36Cb4AeJkAe5TaIfNDlF73Xx2aju5agExi9D8LOGqM",
  "access_expires_at": "2026-10-30T17:56:18.119628321Z",
  "refresh_token": "ZvwxyZPCRU0KCfM7lJ3VhbZc3eNhUoSM_V3T8bezrX4",
  "refresh_expires_at": "2026-11-29T17:41:18.11779083Z",
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
  "device_ref": "sandbox-18000"
}
```

```json
{
  "challenge_id": "482c3d13-19e9-48e2-8f59-937cec68c258",
  "expires_at": "2026-10-30T17:46:18.550376882Z",
  "resend_available_at": "2026-10-30T17:41:19.550376882Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "884541",
  "sent_at": "2026-10-30T17:41:18.554261984Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "482c3d13-19e9-48e2-8f59-937cec68c258",
  "code": "884541",
  "device_ref": "sandbox-18000"
}
```

```json
{
  "session_id": "9d1dc15c-b88e-4cf1-8db9-508352790000",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4Mjk3OCwiaWF0IjoxNzkzMzgyMDc4LCJqdGkiOiI4MGE2Yzc1My1kYTFjLTQ1NWQtOGE4Yy02YTRlZmRiYTM2NGIiLCJzaWQiOiI5ZDFkYzE1Yy1iODhlLTRjZjEtOGRiOS01MDgzNTI3OTAwMDAifQ.ApS-7nEqUrvHHAoyP3mllBNP5dybKFTqqg5p3H-gcWI",
  "access_expires_at": "2026-10-30T17:56:18.763102385Z",
  "refresh_token": "AFXuoGf4PYB2_k2Fhb_Ito6blPOpDkYVKT4lqqlkce0",
  "refresh_expires_at": "2026-11-29T17:41:18.762294882Z",
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
  "correlation_id": "0a33ddd1-07ea-4c0d-b277-ddfcd290a76d"
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
  "session_id": "6da85399-6544-47d0-ab22-2e86e147fcdf",
  "subject": {
    "type": "STAFF",
    "id": "c1a6f303-45cb-4836-9719-3861c6b8ed9b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMWE2ZjMwMy00NWNiLTQ4MzYtOTcxOS0zODYxYzZiOGVkOWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODI5NzksImlhdCI6MTc5MzM4MjA3OSwianRpIjoiODUzNWFlOTgtN2ZkMC00MzlmLWJkNTUtM2M2ZTkyZDg2YmMwIiwic2lkIjoiNmRhODUzOTktNjU0NC00N2QwLWFiMjItMmU4NmUxNDdmY2RmIn0.kpZsF7tHpOL3db6Z-mEMinVdFDs3Vmb9bf5NWETWfIw",
  "access_expires_at": "2026-10-30T17:56:19.757436154Z",
  "refresh_token": "YXlaJ4drUK4YMUtVBVaFey8BWLe6LxsoHkydaSfCLRU",
  "refresh_expires_at": "2026-10-31T05:41:19.756653495Z",
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
  "session_id": "727880d6-7c8d-41ea-8722-1ac7328fbc7a",
  "subject": {
    "type": "STAFF",
    "id": "c1a6f303-45cb-4836-9719-3861c6b8ed9b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMWE2ZjMwMy00NWNiLTQ4MzYtOTcxOS0zODYxYzZiOGVkOWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODI5ODAsImlhdCI6MTc5MzM4MjA4MCwianRpIjoiODEyNmExMDYtYWQ2YS00ZWRlLTljZDAtOWNlYmFiMTRmMmQ4Iiwic2lkIjoiNzI3ODgwZDYtN2M4ZC00MWVhLTg3MjItMWFjNzMyOGZiYzdhIn0.IEIU8DYz_sttJsdCVDE_HxK3O7MEhSeKtrJTzp_-Ohg",
  "access_expires_at": "2026-10-30T17:56:20.962078534Z",
  "refresh_token": "4cxiPyx2290k8QStQZs7lRioxe-8oZ_8aZlZDXRDdU4",
  "refresh_expires_at": "2026-10-31T05:41:20.961420067Z",
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
  "session_id": "0957ba3c-a506-4f09-aa55-b0c40875b4cf",
  "subject": {
    "type": "STAFF",
    "id": "c1a6f303-45cb-4836-9719-3861c6b8ed9b"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMWE2ZjMwMy00NWNiLTQ4MzYtOTcxOS0zODYxYzZiOGVkOWIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODI5ODEsImlhdCI6MTc5MzM4MjA4MSwianRpIjoiYzRjMTc2NTgtYjVkNS00ZTE1LTkzZTctOTg1MjQyYzdiMWZiIiwic2lkIjoiMDk1N2JhM2MtYTUwNi00ZjA5LWFhNTUtYjBjNDA4NzViNGNmIn0.JCzxZbvBHAxy3ey1jUys9ELgcNQu0tw_Xk1YlfgpmrA",
  "access_expires_at": "2026-10-30T17:56:21.382056755Z",
  "refresh_token": "-SyeOLsB1z16lky9_62xGSrtXzkmzZQB4EidHeAhZA8",
  "refresh_expires_at": "2026-10-31T05:41:21.38139931Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-11156"
}
```

```json
{
  "challenge_id": "4758d70a-cbf8-43d5-bb6d-387ee5929ba6",
  "expires_at": "2026-10-30T17:46:21.557860519Z",
  "resend_available_at": "2026-10-30T17:41:22.557860519Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "888003",
  "sent_at": "2026-10-30T17:41:21.561501321Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4758d70a-cbf8-43d5-bb6d-387ee5929ba6",
  "code": "888003",
  "device_ref": "sandbox-11156"
}
```

```json
{
  "session_id": "cd59ce06-f439-4be7-bf39-cfeabd353cc7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4Mjk4MSwiaWF0IjoxNzkzMzgyMDgxLCJqdGkiOiJhMGNmNDAxYi1hYWU4LTQ1ZGQtOTNkYy00M2Q4ZjhhOGNkNjciLCJzaWQiOiJjZDU5Y2UwNi1mNDM5LTRiZTctYmYzOS1jZmVhYmQzNTNjYzcifQ.nqSbuQEL-CejFJZve1M68kF5MJ0CNCn-FGC6ugIf_TU",
  "access_expires_at": "2026-10-30T17:56:21.772431511Z",
  "refresh_token": "uBpxtJBFwZ7vTQo52PnTQDnrthkvpMZy2yFaT7TolFQ",
  "refresh_expires_at": "2026-11-29T17:41:21.771683789Z",
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
  "command_id": "98600e2b-51e6-44c8-9225-514c11ca33a4",
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
  "command_id": "2eaf887a-3d64-4635-861b-207db15046f5",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4528,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T17:41:22Z",
    "sequence": 1793382082601
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
  "correlation_id": "26278e56-1684-422b-967e-473e996e239b"
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
  "command_id": "90c4e0bb-39c4-4e68-8ff1-72f50ac66439",
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
  "command_id": "4885a4f5-6ea4-4bd9-8f22-bd4820f65386",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4528,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T17:41:23Z",
    "sequence": 1793382083537
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "77139335-19d6-4200-8ca9-0c57eb08082c",
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
  "last_heartbeat_at": "2026-10-30T17:41:23.554969Z",
  "last_location_at": "2026-10-30T17:41:23.554969Z",
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
  "command_id": "032772aa-eccf-482d-b2f9-dcadada9a6c9",
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
  "session_id": "77139335-19d6-4200-8ca9-0c57eb08082c",
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
  "last_heartbeat_at": "2026-10-30T17:41:23.554969Z",
  "last_location_at": "2026-10-30T17:41:23.554969Z",
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
  "phone": "+380689770126",
  "device_ref": "sandbox-16339"
}
```

```json
{
  "challenge_id": "031d1e4b-f71d-4d8f-907f-93ecb5763ce9",
  "expires_at": "2026-10-30T17:46:24.349511121Z",
  "resend_available_at": "2026-10-30T17:41:25.349511121Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380689770126` → **200**

```json
{
  "phone": "+380689770126",
  "audience": "CLIENT",
  "code": "880855",
  "sent_at": "2026-10-30T17:41:24.353032542Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "031d1e4b-f71d-4d8f-907f-93ecb5763ce9",
  "code": "880855",
  "device_ref": "sandbox-16339"
}
```

```json
{
  "session_id": "e4d42f6d-1355-4854-9ae6-25a91d1ece38",
  "subject": {
    "type": "CLIENT",
    "id": "7b7e4b34-3ad7-4bb9-a58d-f4bc3c3ab00b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YjdlNGIzNC0zYWQ3LTRiYjktYTU4ZC1mNGJjM2MzYWIwMGIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzgyOTg0LCJpYXQiOjE3OTMzODIwODQsImp0aSI6ImZjNmViZjRjLWRhMGQtNDk3NS04YjEyLWM0MGNmY2M5Mzk2OCIsInNpZCI6ImU0ZDQyZjZkLTEzNTUtNDg1NC05YWU2LTI1YTkxZDFlY2UzOCJ9.dHSzbTtLQMQUHiRWB_wHYUyK5Mi8laR_dEG0czxJxCE",
  "access_expires_at": "2026-10-30T17:56:24.567421758Z",
  "refresh_token": "rRkAN9snB6eDiJfsetVXwFOV77AfV_a4Whkcazl4gBI",
  "refresh_expires_at": "2026-11-29T17:41:24.566909072Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "24c95dc6-1435-4147-97b5-2d1ff592bf55",
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
  "id": "c8190d90-f902-451c-b755-acd45137a767",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T17:46:24.777845Z",
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
  "command_id": "acbfc4c1-0578-4b4f-9f3f-b3bf6508c581",
  "quote_id": "c8190d90-f902-451c-b755-acd45137a767",
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
  "id": "e87b295e-76a2-43e6-a12e-eab7eae61bb9",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7b7e4b34-3ad7-4bb9-a58d-f4bc3c3ab00b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T17:41:25.012182Z",
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

`POST /api/driver/v1/orders/e87b295e-76a2-43e6-a12e-eab7eae61bb9/claim` → **409**

```json
{
  "command_id": "73f0cf15-35d4-4845-b2cf-dd450e581cfc"
}
```

```json
{
  "instance": "/api/driver/v1/orders/e87b295e-76a2-43e6-a12e-eab7eae61bb9/claim",
  "status": 409,
  "title": "Driver not eligible",
  "type": "https://errors.blizz.taxi/driver-not-eligible",
  "code": "DRIVER_NOT_ELIGIBLE",
  "correlation_id": "a5e2013e-0990-4ece-b09f-01dba7c8b614"
}
```

`GET /api/operator/v1/orders/e87b295e-76a2-43e6-a12e-eab7eae61bb9/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T17:41:25.014122Z",
      "actor": {
        "type": "CLIENT",
        "id": "7b7e4b34-3ad7-4bb9-a58d-f4bc3c3ab00b",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "e87b295e-76a2-43e6-a12e-eab7eae61bb9",
        "quote_id": "c8190d90-f902-451c-b755-acd45137a767",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "289878c7-64aa-47a5-8b5c-37f06999f7ea"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T17:41:25.020076Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "e87b295e-76a2-43e6-a12e-eab7eae61bb9",
        "attempt_id": "3b0905c8-6aee-41dc-aafb-d0fb3257f737",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "289878c7-64aa-47a5-8b5c-37f06999f7ea"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-30T17:41:25.055394Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "e87b295e-76a2-43e6-a12e-eab7eae61bb9",
        "attempt_id": "3b0905c8-6aee-41dc-aafb-d0fb3257f737"
      },
      "correlation_id": "289878c7-64aa-47a5-8b5c-37f06999f7ea"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "3b0905c8-6aee-41dc-aafb-d0fb3257f737",
        "generation": 1,
        "started_at": "2026-10-30T17:41:25.018137Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-30T17:41:25.055394Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-30T17:41:25.021347Z",
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
  "command_id": "04e26dda-122b-4e8e-88e3-40115974c75d",
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

`POST /api/driver/v1/work-sessions/77139335-19d6-4200-8ca9-0c57eb08082c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4528,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T17:41:26Z",
    "sequence": 1793382086506
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "77139335-19d6-4200-8ca9-0c57eb08082c",
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
  "last_heartbeat_at": "2026-10-30T17:41:26.527485Z",
  "last_location_at": "2026-10-30T17:41:26.527485Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000001/zones` → **201**

```json
{
  "command_id": "541a90d4-9cbf-43c6-b11b-ad63c744c721",
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
  "id": "bd600c38-cdc5-408c-a907-17458a315172",
  "state": "DRAFT",
  "version": 0
}
```

`POST /api/admin/v1/zones/bd600c38-cdc5-408c-a907-17458a315172/publish` → **200**

```json
{
  "command_id": "578fd0b7-1a2c-4446-b210-3bfeb1626c7c",
  "expected_version": 0,
  "reason": "Sandbox"
}
```

```json
{
  "id": "bd600c38-cdc5-408c-a907-17458a315172",
  "state": "PUBLISHED",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000001/zones` → **201**

```json
{
  "command_id": "d0aac133-4b7f-4273-86ae-de2cefeb424d",
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
  "id": "6274c41b-08d0-4caf-9c8b-102a39220e78",
  "state": "DRAFT",
  "version": 0
}
```

`POST /api/admin/v1/zones/6274c41b-08d0-4caf-9c8b-102a39220e78/publish` → **200**

```json
{
  "command_id": "bf9510cf-de6f-4e71-aea7-5442cc34d305",
  "expected_version": 0,
  "reason": "Sandbox"
}
```

```json
{
  "id": "6274c41b-08d0-4caf-9c8b-102a39220e78",
  "state": "PUBLISHED",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/zones` → **201**

```json
{
  "command_id": "58d47251-b978-45a6-843c-465a93ae4fc3",
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
  "id": "731061b2-5078-4e69-92a6-3b92f2b5851c",
  "state": "DRAFT",
  "version": 0
}
```

`POST /api/admin/v1/zones/731061b2-5078-4e69-92a6-3b92f2b5851c/publish` → **200**

```json
{
  "command_id": "a531dbd0-697d-45a4-bf81-2a45cafb50b8",
  "expected_version": 0,
  "reason": "Sandbox"
}
```

```json
{
  "id": "731061b2-5078-4e69-92a6-3b92f2b5851c",
  "state": "PUBLISHED",
  "version": 1
}
```

`GET /api/driver/v1/broadcast-orders?zone_id=bd600c38-cdc5-408c-a907-17458a315172` → **200**

```json
[
  {
    "order_id": "e87b295e-76a2-43e6-a12e-eab7eae61bb9",
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

`GET /api/driver/v1/broadcast-orders?zone_id=6274c41b-08d0-4caf-9c8b-102a39220e78` → **200**

```json
[]
```

`GET /api/driver/v1/broadcast-orders?zone_id=731061b2-5078-4e69-92a6-3b92f2b5851c` → **400**

```json
{
  "instance": "/api/driver/v1/broadcast-orders",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "3e68a54c-5666-4e7b-9cad-0d35bdc09d98"
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
  "command_id": "0aef2577-04c4-4256-975c-99e1daf0cbf8",
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

`GET /api/operator/v1/orders/e87b295e-76a2-43e6-a12e-eab7eae61bb9` → **200**

```json
{
  "id": "e87b295e-76a2-43e6-a12e-eab7eae61bb9",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7b7e4b34-3ad7-4bb9-a58d-f4bc3c3ab00b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T17:41:25.012182Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/e87b295e-76a2-43e6-a12e-eab7eae61bb9/cancel` → **200**

```json
{
  "command_id": "f36e4167-f877-4411-80b0-8133aaf1c2ed",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "e87b295e-76a2-43e6-a12e-eab7eae61bb9",
  "short_number": 1,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "7b7e4b34-3ad7-4bb9-a58d-f4bc3c3ab00b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T17:41:25.012182Z",
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
  "session_id": "77139335-19d6-4200-8ca9-0c57eb08082c",
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
  "last_heartbeat_at": "2026-10-30T17:41:26.527485Z",
  "last_location_at": "2026-10-30T17:41:26.527485Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/77139335-19d6-4200-8ca9-0c57eb08082c/close` → **200**

```json
{
  "command_id": "a327f489-2546-40ab-85f6-69693ec98e78",
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
  "session_id": "ae80741a-0379-474f-813f-9dc137c7e398",
  "subject": {
    "type": "STAFF",
    "id": "c1a6f303-45cb-4836-9719-3861c6b8ed9b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMWE2ZjMwMy00NWNiLTQ4MzYtOTcxOS0zODYxYzZiOGVkOWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODI5ODksImlhdCI6MTc5MzM4MjA4OSwianRpIjoiMWIzODAwOTktMjVkYy00NmIzLTk0M2UtZjY3MzE1MDI5MDViIiwic2lkIjoiYWU4MDc0MWEtMDM3OS00NzRmLTgxM2YtOWRjMTM3YzdlMzk4In0.fmouOyH-AIst7gQQ_IyZi9d8Pgt86X-i2T6cdsEPFMs",
  "access_expires_at": "2026-10-30T17:56:29.965098926Z",
  "refresh_token": "-5ndlPLlkzSdCPOn8BFNxeL5bfgRrKS2GRBU_z8cIUo",
  "refresh_expires_at": "2026-10-31T05:41:29.964682321Z",
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
  "device_ref": "sandbox-24772"
}
```

```json
{
  "challenge_id": "c10840db-bb7a-41a1-a3ab-9d10bad8750e",
  "expires_at": "2026-10-30T17:46:30.366548071Z",
  "resend_available_at": "2026-10-30T17:41:31.366548071Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "424953",
  "sent_at": "2026-10-30T17:41:30.369732662Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c10840db-bb7a-41a1-a3ab-9d10bad8750e",
  "code": "424953",
  "device_ref": "sandbox-24772"
}
```

```json
{
  "session_id": "d635c05f-e791-4066-b6ef-04421c6a4e4b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4Mjk5MCwiaWF0IjoxNzkzMzgyMDkwLCJqdGkiOiI1Y2E4N2UyMS00NjA4LTQ4ZmEtODIzMy0yYmY2NGRmZDg5OGIiLCJzaWQiOiJkNjM1YzA1Zi1lNzkxLTQwNjYtYjZlZi0wNDQyMWM2YTRlNGIifQ.Fz1f2t0kmMqqSuBaLf68iNSfs7CIfqLaRtckKmiRrgI",
  "access_expires_at": "2026-10-30T17:56:30.590821887Z",
  "refresh_token": "UeZiHMkuR3mA4dSqnuq_nV2tgzyhvzCeNLBFicifvpc",
  "refresh_expires_at": "2026-11-29T17:41:30.590180406Z",
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
  "command_id": "c532a2f5-b301-4b9a-a630-b001c6e8e327",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T17:41:30Z",
    "sequence": 1793382090999
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f75606e9-9ccd-466c-bc5e-99d3c06afb6a",
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
  "last_heartbeat_at": "2026-10-30T17:41:31.017972Z",
  "last_location_at": "2026-10-30T17:41:31.017972Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633949826",
  "device_ref": "sandbox-24457"
}
```

```json
{
  "challenge_id": "30c51c1f-6824-47a8-8093-e2f16cfb560c",
  "expires_at": "2026-10-30T17:46:31.227785213Z",
  "resend_available_at": "2026-10-30T17:41:32.227785213Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380633949826` → **200**

```json
{
  "phone": "+380633949826",
  "audience": "CLIENT",
  "code": "882287",
  "sent_at": "2026-10-30T17:41:31.230607035Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "30c51c1f-6824-47a8-8093-e2f16cfb560c",
  "code": "882287",
  "device_ref": "sandbox-24457"
}
```

```json
{
  "session_id": "be797dbd-8980-4902-a15c-d25a4e1630b1",
  "subject": {
    "type": "CLIENT",
    "id": "4cdfa45f-e38e-4c86-9173-0f0351ef3221"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0Y2RmYTQ1Zi1lMzhlLTRjODYtOTE3My0wZjAzNTFlZjMyMjEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzgyOTkxLCJpYXQiOjE3OTMzODIwOTEsImp0aSI6ImI4ODI0YmI2LWUyMDYtNGY1ZS04ZmFhLWRjOWNkYmE5YmExYSIsInNpZCI6ImJlNzk3ZGJkLTg5ODAtNDkwMi1hMTVjLWQyNWE0ZTE2MzBiMSJ9.dPtNrGJiY9Eson18dbvI59pA8mXEOXbWSzr-PRFOPqY",
  "access_expires_at": "2026-10-30T17:56:31.454469118Z",
  "refresh_token": "bDhL_iTDunS14IcdKwFQsUiO8Pe3YClKqbDGOLOIXrQ",
  "refresh_expires_at": "2026-11-29T17:41:31.453845904Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "5502d46b-fef0-497c-a35d-9bf3c6a45ae4",
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
  "id": "a358ffe8-6e5a-457f-98e2-fdbc05071ab6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T17:46:31.656579Z",
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
  "command_id": "f138a690-a936-477f-bf09-d675a66b3a89",
  "quote_id": "a358ffe8-6e5a-457f-98e2-fdbc05071ab6",
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
  "id": "377a6fab-8b11-4263-ba4c-395b6bc99e9e",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4cdfa45f-e38e-4c86-9173-0f0351ef3221",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T17:41:31.871981Z",
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
    "id": "162e4ba4-fd74-4a5a-a102-a653e94a9366",
    "order_id": "377a6fab-8b11-4263-ba4c-395b6bc99e9e",
    "expires_at": "2026-10-30T17:41:46.875452Z",
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

`POST /api/driver/v1/offers/162e4ba4-fd74-4a5a-a102-a653e94a9366/accept` → **200**

```json
{
  "command_id": "ec41dd8a-a473-4010-88df-4c575762cd5f"
}
```

```json
{
  "id": "da4e1b7d-325e-4e13-8d56-d3bb2c6836e3",
  "order_id": "377a6fab-8b11-4263-ba4c-395b6bc99e9e",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "916c133d-3536-4a6f-8edd-7d93aaf065b5",
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
  "command_id": "d7f759db-d202-40af-bb9b-2d0e13ca26e0",
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
  "changed_by": "c1a6f303-45cb-4836-9719-3861c6b8ed9b",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T17:41:32.735081952Z"
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
  "id": "916c133d-3536-4a6f-8edd-7d93aaf065b5",
  "order_id": "377a6fab-8b11-4263-ba4c-395b6bc99e9e",
  "assignment_id": "da4e1b7d-325e-4e13-8d56-d3bb2c6836e3",
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

`POST /api/driver/v1/work-sessions/f75606e9-9ccd-466c-bc5e-99d3c06afb6a/heartbeat` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T17:41:33Z",
    "sequence": 1793382093378
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f75606e9-9ccd-466c-bc5e-99d3c06afb6a",
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
  "last_heartbeat_at": "2026-10-30T17:41:33.396481Z",
  "last_location_at": "2026-10-30T17:41:33.396481Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/916c133d-3536-4a6f-8edd-7d93aaf065b5/arrive` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "810a5630-d94c-4cf6-a944-4bd4be929b23",
  "expected_version": 0
}
```

```json
{
  "id": "916c133d-3536-4a6f-8edd-7d93aaf065b5",
  "order_id": "377a6fab-8b11-4263-ba4c-395b6bc99e9e",
  "assignment_id": "da4e1b7d-325e-4e13-8d56-d3bb2c6836e3",
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
  "arrived_at": "2026-10-30T17:41:33.618793Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/916c133d-3536-4a6f-8edd-7d93aaf065b5/start` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "29b4b6d9-fc82-416f-8927-080000a51dd4",
  "expected_version": 1
}
```

```json
{
  "id": "916c133d-3536-4a6f-8edd-7d93aaf065b5",
  "order_id": "377a6fab-8b11-4263-ba4c-395b6bc99e9e",
  "assignment_id": "da4e1b7d-325e-4e13-8d56-d3bb2c6836e3",
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
  "arrived_at": "2026-10-30T17:41:33.618793Z",
  "started_at": "2026-10-30T17:41:33.838067Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/916c133d-3536-4a6f-8edd-7d93aaf065b5/complete` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "9ba3da58-9cd9-4d04-870a-eb7b4d576671",
  "expected_version": 2,
  "reported_at": "2026-10-30T17:41:34Z",
  "cash_received": true
}
```

```json
{
  "id": "916c133d-3536-4a6f-8edd-7d93aaf065b5",
  "order_id": "377a6fab-8b11-4263-ba4c-395b6bc99e9e",
  "assignment_id": "da4e1b7d-325e-4e13-8d56-d3bb2c6836e3",
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
  "arrived_at": "2026-10-30T17:41:33.618793Z",
  "started_at": "2026-10-30T17:41:33.838067Z",
  "completed_at": "2026-10-30T17:41:34.074317Z",
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
  "session_id": "f75606e9-9ccd-466c-bc5e-99d3c06afb6a",
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
  "last_heartbeat_at": "2026-10-30T17:41:33.396481Z",
  "last_location_at": "2026-10-30T17:41:33.396481Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f75606e9-9ccd-466c-bc5e-99d3c06afb6a/close` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "c63a7ac7-d64a-4257-aa74-8e766a0a8a67",
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
  "command_id": "a57af642-90ef-4f1a-aee7-22a6b8bfca36",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T17:41:34Z",
    "sequence": 1793382094751
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
  "correlation_id": "da5ed061-8567-4d99-bf4e-bdea7055f8df",
  "minimum_version": "9.0.0"
}
```

## After the update he can

`POST /api/driver/v1/work-sessions` (X-App-Platform: DRIVER_ANDROID X-App-Version: 9.0.0) → **201**

```json
{
  "command_id": "252d8676-732a-490f-9fb5-cce9e83e9238",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T17:41:34Z",
    "sequence": 1793382094964
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ef9431a0-efea-4228-b221-f89298ea4637",
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
  "last_heartbeat_at": "2026-10-30T17:41:34.983525Z",
  "last_location_at": "2026-10-30T17:41:34.983525Z",
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
  "changed_by": "c1a6f303-45cb-4836-9719-3861c6b8ed9b",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T17:41:32.735082Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "a1f70e72-db5b-4b49-b9fb-90f06e65cb8e",
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
  "changed_by": "c1a6f303-45cb-4836-9719-3861c6b8ed9b",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T17:41:35.405707718Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ef9431a0-efea-4228-b221-f89298ea4637",
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
  "last_heartbeat_at": "2026-10-30T17:41:34.983525Z",
  "last_location_at": "2026-10-30T17:41:34.983525Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ef9431a0-efea-4228-b221-f89298ea4637/close` → **200**

```json
{
  "command_id": "b0e5868a-3027-4b13-98e8-60ceabda67b3",
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
  "session_id": "5c803af6-8d8f-41a7-9b05-8a66347c1337",
  "subject": {
    "type": "STAFF",
    "id": "c1a6f303-45cb-4836-9719-3861c6b8ed9b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMWE2ZjMwMy00NWNiLTQ4MzYtOTcxOS0zODYxYzZiOGVkOWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODI5OTYsImlhdCI6MTc5MzM4MjA5NiwianRpIjoiMmE1Yzg1NWUtZWY5Ni00Zjc3LWE4YWYtOWVlOGNhMTBhMjY4Iiwic2lkIjoiNWM4MDNhZjYtOGQ4Zi00MWE3LTliMDUtOGE2NjM0N2MxMzM3In0.1H7dKxkoZRI0qkXjV4BN7S92oWc7cqERBQHVOjimFio",
  "access_expires_at": "2026-10-30T17:56:36.247130244Z",
  "refresh_token": "W71a13xNf6CTeLIHHySH77hAIhqXpqWtilRhd1ZNp2s",
  "refresh_expires_at": "2026-10-31T05:41:36.246578034Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "e3bacee7-1df4-4fa3-98e9-4426677ecedd",
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
  "id": "8adec4db-8adb-42ac-ada3-4552656c478b",
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
  "created_by": "c1a6f303-45cb-4836-9719-3861c6b8ed9b",
  "created_at": "2026-10-30T17:41:36.451628Z",
  "updated_at": "2026-10-30T17:41:36.451628Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634274963",
  "device_ref": "sandbox-13092"
}
```

```json
{
  "challenge_id": "ad7af1cb-2fc2-4d12-9a36-c28e83ffb31a",
  "expires_at": "2026-10-30T17:46:36.658549475Z",
  "resend_available_at": "2026-10-30T17:41:37.658549475Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380634274963` → **200**

```json
{
  "phone": "+380634274963",
  "audience": "CLIENT",
  "code": "106671",
  "sent_at": "2026-10-30T17:41:36.661870804Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ad7af1cb-2fc2-4d12-9a36-c28e83ffb31a",
  "code": "106671",
  "device_ref": "sandbox-13092"
}
```

```json
{
  "session_id": "0d7c4b0e-0074-4c89-b5f8-41309bb7a698",
  "subject": {
    "type": "CLIENT",
    "id": "755dbfec-d457-45a0-bb31-cf8aebf854c6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3NTVkYmZlYy1kNDU3LTQ1YTAtYmIzMS1jZjhhZWJmODU0YzYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzgyOTk2LCJpYXQiOjE3OTMzODIwOTYsImp0aSI6IjNiZmRjOThlLTEzZmQtNGU1Yy05OGU0LTk5ZmZhZmY0MTk1MyIsInNpZCI6IjBkN2M0YjBlLTAwNzQtNGM4OS1iNWY4LTQxMzA5YmI3YTY5OCJ9.gZbLEATOJ1mGAKiM-q8spfDPdfMqQSN8tefdO58hk0M",
  "access_expires_at": "2026-10-30T17:56:36.882147Z",
  "refresh_token": "Aou_ZjMLxBcTdQcDkrj3zNRoQMSLGprTu_V7I_jC9ys",
  "refresh_expires_at": "2026-11-29T17:41:36.881682217Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380634274963` → **200**

```json
{
  "client_id": "755dbfec-d457-45a0-bb31-cf8aebf854c6"
}
```

`POST /api/admin/v1/rider-wallets/755dbfec-d457-45a0-bb31-cf8aebf854c6/top-ups` → **201**

```json
{
  "command_id": "93c09792-2836-44ef-9ec5-f7a25024e546",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "755dbfec-d457-45a0-bb31-cf8aebf854c6",
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
      "id": "8b07ae5a-812e-4de3-951d-098810aba3e0",
      "at": "2026-10-30T17:41:37.44257Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "c1a6f303-45cb-4836-9719-3861c6b8ed9b",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "51f7d420-4426-4cf3-a408-4b632dc1e445",
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
  "id": "07bb511e-56ff-41b6-8523-777f93208296",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T17:46:37.668133Z",
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
      "id": "8adec4db-8adb-42ac-ada3-4552656c478b",
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
  "device_ref": "sandbox-11341"
}
```

```json
{
  "challenge_id": "16f2d495-87ba-4e74-b857-08ac3429efa7",
  "expires_at": "2026-10-30T17:46:37.878091553Z",
  "resend_available_at": "2026-10-30T17:41:38.878091553Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "743688",
  "sent_at": "2026-10-30T17:41:37.880717839Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "16f2d495-87ba-4e74-b857-08ac3429efa7",
  "code": "743688",
  "device_ref": "sandbox-11341"
}
```

```json
{
  "session_id": "7674e9c8-55b3-4de1-ade4-941344d8eef2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4Mjk5OCwiaWF0IjoxNzkzMzgyMDk4LCJqdGkiOiIwMTc2NDdkYi1jZGYwLTQxOGUtYjM0OS1mZDMwOTFkNzY4NzQiLCJzaWQiOiI3Njc0ZTljOC01NWIzLTRkZTEtYWRlNC05NDEzNDRkOGVlZjIifQ.f8d7NIp9oCkg6LaoxQkIW7839mpyQzbeCeJn4ypwdCE",
  "access_expires_at": "2026-10-30T17:56:38.100998392Z",
  "refresh_token": "IKx06lt6QwM8_KbS_JcB5Zzc2gwiJruYW9Q4staVPes",
  "refresh_expires_at": "2026-11-29T17:41:38.100500308Z",
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
  "command_id": "0d621ca2-e119-4124-b58f-211ead284849",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T17:41:38Z",
    "sequence": 1793382098498
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6a181f4e-cfe1-40df-93cc-50717950bfad",
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
  "last_heartbeat_at": "2026-10-30T17:41:38.5154Z",
  "last_location_at": "2026-10-30T17:41:38.5154Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "33a20e4e-b7e8-42ca-b463-8d1e75cef93b",
  "quote_id": "07bb511e-56ff-41b6-8523-777f93208296",
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
  "id": "f78df9a5-5561-4c3c-8cc6-012126c8bd38",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "755dbfec-d457-45a0-bb31-cf8aebf854c6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T17:41:38.728955Z",
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
  "client_id": "755dbfec-d457-45a0-bb31-cf8aebf854c6",
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
      "id": "8b07ae5a-812e-4de3-951d-098810aba3e0",
      "at": "2026-10-30T17:41:37.44257Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "c1a6f303-45cb-4836-9719-3861c6b8ed9b",
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
    "id": "626593b8-b4bf-4e41-9ab4-6fa80636dad0",
    "order_id": "f78df9a5-5561-4c3c-8cc6-012126c8bd38",
    "expires_at": "2026-10-30T17:41:53.735713Z",
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

`POST /api/driver/v1/offers/626593b8-b4bf-4e41-9ab4-6fa80636dad0/accept` → **200**

```json
{
  "command_id": "cf8b75c0-bfed-4c0f-b193-2628d882ed31"
}
```

```json
{
  "id": "ed520bea-f3ff-427c-9dd0-f2cc6c350d9b",
  "order_id": "f78df9a5-5561-4c3c-8cc6-012126c8bd38",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "1e8859f1-d970-467b-ac6f-db3213d3b61f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "1e8859f1-d970-467b-ac6f-db3213d3b61f",
  "order_id": "f78df9a5-5561-4c3c-8cc6-012126c8bd38",
  "assignment_id": "ed520bea-f3ff-427c-9dd0-f2cc6c350d9b",
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

`POST /api/driver/v1/work-sessions/6a181f4e-cfe1-40df-93cc-50717950bfad/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T17:41:42Z",
    "sequence": 1793382102742
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6a181f4e-cfe1-40df-93cc-50717950bfad",
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
  "last_heartbeat_at": "2026-10-30T17:41:42.760437Z",
  "last_location_at": "2026-10-30T17:41:42.760437Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/1e8859f1-d970-467b-ac6f-db3213d3b61f/arrive` → **200**

```json
{
  "command_id": "0525ffae-97eb-4651-8c53-fa96365487cd",
  "expected_version": 0
}
```

```json
{
  "id": "1e8859f1-d970-467b-ac6f-db3213d3b61f",
  "order_id": "f78df9a5-5561-4c3c-8cc6-012126c8bd38",
  "assignment_id": "ed520bea-f3ff-427c-9dd0-f2cc6c350d9b",
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
  "arrived_at": "2026-10-30T17:41:42.974302Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/1e8859f1-d970-467b-ac6f-db3213d3b61f/start` → **200**

```json
{
  "command_id": "dd7d0ef9-3747-4111-a7ae-489dd06687eb",
  "expected_version": 1
}
```

```json
{
  "id": "1e8859f1-d970-467b-ac6f-db3213d3b61f",
  "order_id": "f78df9a5-5561-4c3c-8cc6-012126c8bd38",
  "assignment_id": "ed520bea-f3ff-427c-9dd0-f2cc6c350d9b",
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
  "arrived_at": "2026-10-30T17:41:42.974302Z",
  "started_at": "2026-10-30T17:41:43.201172Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/1e8859f1-d970-467b-ac6f-db3213d3b61f/complete` → **200**

```json
{
  "command_id": "47500abc-7b08-4cba-bfb3-28b15b61d539",
  "expected_version": 2,
  "reported_at": "2026-10-30T17:41:43Z",
  "cash_received": true
}
```

```json
{
  "id": "1e8859f1-d970-467b-ac6f-db3213d3b61f",
  "order_id": "f78df9a5-5561-4c3c-8cc6-012126c8bd38",
  "assignment_id": "ed520bea-f3ff-427c-9dd0-f2cc6c350d9b",
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
  "arrived_at": "2026-10-30T17:41:42.974302Z",
  "started_at": "2026-10-30T17:41:43.201172Z",
  "completed_at": "2026-10-30T17:41:43.430927Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "755dbfec-d457-45a0-bb31-cf8aebf854c6",
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
      "id": "849b0820-c945-4f13-a3ce-bf74e2e4b0c9",
      "at": "2026-10-30T17:41:44.341184Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "f78df9a5-5561-4c3c-8cc6-012126c8bd38"
    },
    {
      "id": "8b07ae5a-812e-4de3-951d-098810aba3e0",
      "at": "2026-10-30T17:41:37.44257Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "c1a6f303-45cb-4836-9719-3861c6b8ed9b",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/8adec4db-8adb-42ac-ada3-4552656c478b/archive` → **200**

```json
{
  "command_id": "b9a5cd66-9947-4607-98db-6aabe4e07be3",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "8adec4db-8adb-42ac-ada3-4552656c478b",
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
  "created_by": "c1a6f303-45cb-4836-9719-3861c6b8ed9b",
  "created_at": "2026-10-30T17:41:36.451628Z",
  "updated_at": "2026-10-30T17:41:46.859508Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6a181f4e-cfe1-40df-93cc-50717950bfad",
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
  "last_heartbeat_at": "2026-10-30T17:41:42.760437Z",
  "last_location_at": "2026-10-30T17:41:42.760437Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6a181f4e-cfe1-40df-93cc-50717950bfad/close` → **200**

```json
{
  "command_id": "c39b2f2d-21ad-40e4-a822-833d4a1adc2f",
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

Done: order f78df9a5-5561-4c3c-8cc6-012126c8bd38.

# Scenario: broadcast-abuse

## Anna goes online in Warsaw

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000002",
  "device_ref": "sandbox-31007"
}
```

```json
{
  "challenge_id": "9605df85-c35d-4058-97e6-682300be2eb9",
  "expires_at": "2026-10-30T17:46:47.474367578Z",
  "resend_available_at": "2026-10-30T17:41:48.474367578Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000002` → **200**

```json
{
  "phone": "+48500000002",
  "audience": "DRIVER",
  "code": "657491",
  "sent_at": "2026-10-30T17:41:47.476863736Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9605df85-c35d-4058-97e6-682300be2eb9",
  "code": "657491",
  "device_ref": "sandbox-31007"
}
```

```json
{
  "session_id": "215377f8-720c-4910-9105-53f5947ec0cd",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000405"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDUiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4MzAwNywiaWF0IjoxNzkzMzgyMTA3LCJqdGkiOiJjZmNiYmIzMS1lZDgxLTRjZjItYjYzYi0zOThkOWZjODVmYmEiLCJzaWQiOiIyMTUzNzdmOC03MjBjLTQ5MTAtOTEwNS01M2Y1OTQ3ZWMwY2QifQ.VrEu5B29yEn_sXP1_E3fgkzSAZKhSHgJ0m6euRiqs0Y",
  "access_expires_at": "2026-10-30T17:56:47.682512576Z",
  "refresh_token": "d8g9F0LRA9ZJOZXvkXyECH847nQH5sBPzE0gfDqvAqc",
  "refresh_expires_at": "2026-11-29T17:41:47.682011697Z",
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
  "command_id": "6487146a-dc35-4c36-85c5-34422ab0d449",
  "vehicle_id": "5a000000-0000-4000-8000-000000000505",
  "location": {
    "lat": 52.2297,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T17:41:48Z",
    "sequence": 1793382108257
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "f8901523-31c9-489a-8493-39c4fc7dd385",
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
  "last_heartbeat_at": "2026-10-30T17:41:48.27426Z",
  "last_location_at": "2026-10-30T17:41:48.27426Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## 5 seconds later her phone reports Lviv: not taken as her position

`POST /api/driver/v1/work-sessions/f8901523-31c9-489a-8493-39c4fc7dd385/heartbeat` → **200**

```json
{
  "location": {
    "lat": 49.8397,
    "lon": 24.0297,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T17:41:53Z",
    "sequence": 1793382113474
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "f8901523-31c9-489a-8493-39c4fc7dd385",
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
  "last_heartbeat_at": "2026-10-30T17:41:53.491253Z",
  "last_location_at": "2026-10-30T17:41:48.27426Z",
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
  "session_id": "31b9d029-99e5-4619-b8c8-d172a30b1973",
  "subject": {
    "type": "STAFF",
    "id": "c1a6f303-45cb-4836-9719-3861c6b8ed9b"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMWE2ZjMwMy00NWNiLTQ4MzYtOTcxOS0zODYxYzZiOGVkOWIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODMwMTMsImlhdCI6MTc5MzM4MjExMywianRpIjoiMTFmNzcxZTQtN2Y5NC00MDcyLThhODktZTA4MzJkOGFiYWE0Iiwic2lkIjoiMzFiOWQwMjktOTllNS00NjE5LWI4YzgtZDE3MmEzMGIxOTczIn0.rER6jjRtLrlT1vv3iocpHviLKSHMvtyxImo6ZETo5Wo",
  "access_expires_at": "2026-10-30T17:56:53.881580405Z",
  "refresh_token": "Dy5OoFSmwj5P1TAJ5RnRlYxVSBu_KeGA58dmTdHILA8",
  "refresh_expires_at": "2026-10-31T05:41:53.881086543Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "at": "2026-10-30T17:41:54.061260347Z",
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
      "last_location_at": "2026-10-30T17:41:48.27426Z",
      "last_heartbeat_at": "2026-10-30T17:41:53.491253Z",
      "order_id": null
    }
  ]
}
```

## A fix next to the last accepted one is taken again

`POST /api/driver/v1/work-sessions/f8901523-31c9-489a-8493-39c4fc7dd385/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2299,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T17:41:54Z",
    "sequence": 1793382114252
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "f8901523-31c9-489a-8493-39c4fc7dd385",
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
  "last_heartbeat_at": "2026-10-30T17:41:54.26886Z",
  "last_location_at": "2026-10-30T17:41:54.26886Z",
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
  "session_id": "f8901523-31c9-489a-8493-39c4fc7dd385",
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
  "last_heartbeat_at": "2026-10-30T17:41:54.26886Z",
  "last_location_at": "2026-10-30T17:41:54.26886Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f8901523-31c9-489a-8493-39c4fc7dd385/close` → **200**

```json
{
  "command_id": "df190507-f0a8-4945-ba4e-084070a7fd3f",
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
  "device_ref": "sandbox-18645"
}
```

```json
{
  "challenge_id": "5ffcab55-750a-4d20-9344-e1bc158da053",
  "expires_at": "2026-10-30T17:46:54.84933Z",
  "resend_available_at": "2026-10-30T17:41:55.84933Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "980455",
  "sent_at": "2026-10-30T17:41:54.851866385Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5ffcab55-750a-4d20-9344-e1bc158da053",
  "code": "980455",
  "device_ref": "sandbox-18645"
}
```

```json
{
  "session_id": "3fb61e2a-5b04-4bea-9791-bc16d15f77e8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4MzAxNSwiaWF0IjoxNzkzMzgyMTE1LCJqdGkiOiJjMTc2ZTQxZC0xZDZkLTRhMmItYTcxOC0zM2I2YTRiYTljZmYiLCJzaWQiOiIzZmI2MWUyYS01YjA0LTRiZWEtOTc5MS1iYzE2ZDE1Zjc3ZTgifQ.egNbrjsGaPrJ5KwCyjd6pXgzREF7QKJVKP2rgUEWpeg",
  "access_expires_at": "2026-10-30T17:56:55.059699939Z",
  "refresh_token": "XLSvfv6laxnj0oRxlYnv8fAFEeYg5GRZkhtiS2dXwb4",
  "refresh_expires_at": "2026-11-29T17:41:55.059187373Z",
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
  "device_ref": "sandbox-21780"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "9f32c669-c9a2-4104-b14a-b161eb1ed7ca",
  "retryable": true,
  "retry_after_seconds": 1
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000001",
  "device_ref": "sandbox-21780"
}
```

```json
{
  "challenge_id": "7d280f3a-d870-4156-a954-527cc4df58e8",
  "expires_at": "2026-10-30T17:46:56.605742257Z",
  "resend_available_at": "2026-10-30T17:41:57.605742257Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "101027",
  "sent_at": "2026-10-30T17:41:56.607629633Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7d280f3a-d870-4156-a954-527cc4df58e8",
  "code": "101027",
  "device_ref": "sandbox-21780"
}
```

```json
{
  "session_id": "3c6f2c71-b4cd-434a-afcc-e398207f110a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4MzAxNiwiaWF0IjoxNzkzMzgyMTE2LCJqdGkiOiJhYWMyZmE2YS02MmNiLTRjODAtYmM5MC0zNjAyNzZiZmNkYzMiLCJzaWQiOiIzYzZmMmM3MS1iNGNkLTQzNGEtYWZjYy1lMzk4MjA3ZjExMGEifQ.jcg3uIUj3XdmnXG1zf2nPPsDrWKNU3n8hDe9oeWMVuI",
  "access_expires_at": "2026-10-30T17:56:56.811302183Z",
  "refresh_token": "nJ085xiENibRKk8pyQgs1mV6w5kdpnzEkxi4nFA60B8",
  "refresh_expires_at": "2026-11-29T17:41:56.810869999Z",
  "account_created": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000002",
  "device_ref": "sandbox-29769"
}
```

```json
{
  "challenge_id": "aa1c77f0-5dd7-4540-a792-06f20300bd17",
  "expires_at": "2026-10-30T17:46:56.990904476Z",
  "resend_available_at": "2026-10-30T17:41:57.990904476Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000002` → **200**

```json
{
  "phone": "+48500000002",
  "audience": "DRIVER",
  "code": "872294",
  "sent_at": "2026-10-30T17:41:57.002375771Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "aa1c77f0-5dd7-4540-a792-06f20300bd17",
  "code": "872294",
  "device_ref": "sandbox-29769"
}
```

```json
{
  "session_id": "af3ef27c-8b78-4977-8570-50e01b35cb11",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000405"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDUiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4MzAxNywiaWF0IjoxNzkzMzgyMTE3LCJqdGkiOiIxNGIzNzg1OC1jYWY3LTQ2NTItYTU0ZS0xOTJiZWYyNTY3ZmMiLCJzaWQiOiJhZjNlZjI3Yy04Yjc4LTQ5NzctODU3MC01MGUwMWIzNWNiMTEifQ.mu2SUkXDcUSzByR_bBj8kq1ErDQGoqa-cOImrpZKHpU",
  "access_expires_at": "2026-10-30T17:56:57.210377382Z",
  "refresh_token": "av7wOJTQ35pTW8Ec_sAY3aIK6J6DPy6U8v3uwWMRuKU",
  "refresh_expires_at": "2026-11-29T17:41:57.209922933Z",
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

(the car drives 185 s to the next point)

`POST /api/driver/v1/work-sessions` → **201**

```json
{
  "command_id": "2bf9a1d2-6050-4069-9d03-cc2aaf307c9c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000505",
  "location": {
    "lat": 52.2297,
    "lon": 21.1700,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T17:45:02Z",
    "sequence": 1793382302763
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "e18169a8-c8dc-44de-9fb5-f0ecf62cfbb3",
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
  "last_heartbeat_at": "2026-10-30T17:45:02.779526Z",
  "last_location_at": "2026-10-30T17:45:02.779526Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders: nobody is near, the order goes to the ALL tab

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600866893",
  "device_ref": "sandbox-24784"
}
```

```json
{
  "challenge_id": "8c8f89c6-45e8-4ef6-890a-06400edca59f",
  "expires_at": "2026-10-30T17:50:02.969428681Z",
  "resend_available_at": "2026-10-30T17:45:03.969428681Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600866893` → **200**

```json
{
  "phone": "+48600866893",
  "audience": "CLIENT",
  "code": "007811",
  "sent_at": "2026-10-30T17:45:02.971496571Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8c8f89c6-45e8-4ef6-890a-06400edca59f",
  "code": "007811",
  "device_ref": "sandbox-24784"
}
```

```json
{
  "session_id": "8c4b4fd0-f91e-47e8-8601-47ead51d91e5",
  "subject": {
    "type": "CLIENT",
    "id": "2a35b5d8-ebb2-4930-8cef-9d82e3fc68b5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYTM1YjVkOC1lYmIyLTQ5MzAtOGNlZi05ZDgyZTNmYzY4YjUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzgzMjAzLCJpYXQiOjE3OTMzODIzMDMsImp0aSI6IjVhNTVlZWIyLTcwODUtNDFhNy1iOTE2LTFkZTE1NTA2YWE0NCIsInNpZCI6IjhjNGI0ZmQwLWY5MWUtNDdlOC04NjAxLTQ3ZWFkNTFkOTFlNSJ9.25oPmVQfqdNyQYMBD5PksNHhO8ChZQJ_HWyDKZ6XBvI",
  "access_expires_at": "2026-10-30T18:00:03.181054391Z",
  "refresh_token": "tl7APwgFk3uNKoJth4vvHkaOGJI3I4lrZgsHu7JRGls",
  "refresh_expires_at": "2026-11-29T17:45:03.180613073Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "3ecb854d-a93d-4df6-8658-6085a0060d65",
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
  "id": "1e8c3a1b-8f9d-421a-bae4-20ed8a7fd71c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 4942,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T17:50:03.371442Z",
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
  "command_id": "85f5968d-fe00-439c-89e0-3eac9861520b",
  "quote_id": "1e8c3a1b-8f9d-421a-bae4-20ed8a7fd71c",
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
  "id": "2a3a1420-a555-475f-bfe7-0c36435c3b45",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2a35b5d8-ebb2-4930-8cef-9d82e3fc68b5",
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
  "created_at": "2026-10-30T17:45:03.568247Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2a3a1420-a555-475f-bfe7-0c36435c3b45` → **200**

```json
{
  "id": "2a3a1420-a555-475f-bfe7-0c36435c3b45",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2a35b5d8-ebb2-4930-8cef-9d82e3fc68b5",
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
  "created_at": "2026-10-30T17:45:03.568247Z",
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

`POST /api/driver/v1/orders/2a3a1420-a555-475f-bfe7-0c36435c3b45/claim` → **422**

```json
{
  "command_id": "5bdbaea9-071b-4e3e-97c8-794c8877452d"
}
```

```json
{
  "instance": "/api/driver/v1/orders/2a3a1420-a555-475f-bfe7-0c36435c3b45/claim",
  "status": 422,
  "title": "Pickup too far",
  "type": "https://errors.blizz.taxi/pickup-too-far",
  "code": "PICKUP_TOO_FAR",
  "correlation_id": "a5a38c81-7e19-4665-a967-27dba3a63c2c"
}
```

`GET /api/rider/v1/orders/2a3a1420-a555-475f-bfe7-0c36435c3b45` → **200**

```json
{
  "id": "2a3a1420-a555-475f-bfe7-0c36435c3b45",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2a35b5d8-ebb2-4930-8cef-9d82e3fc68b5",
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
  "created_at": "2026-10-30T17:45:03.568247Z",
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

`POST /api/driver/v1/orders/74fdfffc-bd1c-472a-aac7-1a72781d5437/claim` → **404**

```json
{
  "command_id": "ed4b7c5b-693b-4a54-bca2-60f883807ee0"
}
```

```json
{
  "instance": "/api/driver/v1/orders/74fdfffc-bd1c-472a-aac7-1a72781d5437/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "91907a20-4c05-4b14-a46e-859ce09b8c19"
}
```

`POST /api/driver/v1/orders/073eb973-8c80-4ee4-b356-6d6bab94bab6/claim` → **404**

```json
{
  "command_id": "e544f599-4120-4578-89a7-fd35893b83ac"
}
```

```json
{
  "instance": "/api/driver/v1/orders/073eb973-8c80-4ee4-b356-6d6bab94bab6/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "57e252dd-ad4e-4141-8fe4-aed5d70cccf9"
}
```

`POST /api/driver/v1/orders/d5795c84-eef0-4818-a958-b31f629ae5b7/claim` → **404**

```json
{
  "command_id": "3477924d-7707-45db-b884-1723afa976bb"
}
```

```json
{
  "instance": "/api/driver/v1/orders/d5795c84-eef0-4818-a958-b31f629ae5b7/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "29ae1d40-c8de-4f5e-bf58-56da6b0beabb"
}
```

`POST /api/driver/v1/orders/f45b9a65-327a-45c1-b0f1-bab734dade10/claim` → **404**

```json
{
  "command_id": "02439e59-d05f-4ad6-98be-c74fbf439e1d"
}
```

```json
{
  "instance": "/api/driver/v1/orders/f45b9a65-327a-45c1-b0f1-bab734dade10/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "d5a994b3-c30f-42f3-9ac8-114d03af8279"
}
```

`POST /api/driver/v1/orders/2265eda8-9334-4053-8b17-9b651edbb689/claim` → **404**

```json
{
  "command_id": "179fbfc3-ef06-4917-a19c-4195cf9898ec"
}
```

```json
{
  "instance": "/api/driver/v1/orders/2265eda8-9334-4053-8b17-9b651edbb689/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "377b50ae-2362-43c8-94cb-19a68042650a"
}
```

`POST /api/driver/v1/orders/5b70187a-30f0-47e0-817e-dbd22d0ec362/claim` → **404**

```json
{
  "command_id": "9eafa4ba-db7d-44d6-a169-21b4fbd819e2"
}
```

```json
{
  "instance": "/api/driver/v1/orders/5b70187a-30f0-47e0-817e-dbd22d0ec362/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "18c59f83-5645-4537-9f00-48fdfce7b89a"
}
```

`POST /api/driver/v1/orders/750257fd-7f1e-4138-b7b4-5355fd9e5531/claim` → **404**

```json
{
  "command_id": "970a10cd-9470-42b9-bb70-ca0411309b8f"
}
```

```json
{
  "instance": "/api/driver/v1/orders/750257fd-7f1e-4138-b7b4-5355fd9e5531/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "6071976b-5ce4-4c00-b0cc-c72f246b73b0"
}
```

`POST /api/driver/v1/orders/6c742cc1-809b-49f9-9eac-0777257514a3/claim` → **404**

```json
{
  "command_id": "c29df082-947b-43a6-9879-85bf7f189302"
}
```

```json
{
  "instance": "/api/driver/v1/orders/6c742cc1-809b-49f9-9eac-0777257514a3/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "51ea1a7a-0391-41c0-98da-61d946c90f14"
}
```

`POST /api/driver/v1/orders/ff833dca-512b-4078-8eae-3d4d21b1b4b6/claim` → **404**

```json
{
  "command_id": "48e0a719-99c9-42d2-94ee-67db045c0629"
}
```

```json
{
  "instance": "/api/driver/v1/orders/ff833dca-512b-4078-8eae-3d4d21b1b4b6/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "89dd68fa-2bb8-46cb-8701-915b2a602817"
}
```

`POST /api/driver/v1/orders/8aa654b9-ec23-45ce-ac24-b5fdade490f6/claim` → **404**

```json
{
  "command_id": "e7f32288-5f28-41f8-8cfc-8bbd7755205e"
}
```

```json
{
  "instance": "/api/driver/v1/orders/8aa654b9-ec23-45ce-ac24-b5fdade490f6/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "82131ce7-bf52-4f35-b2e8-50bbd49ac7c8"
}
```

`POST /api/driver/v1/orders/220d0fd1-5cc7-4af7-abd3-e61db7986d85/claim` → **404**

```json
{
  "command_id": "a7b555ca-0d22-4684-acd0-14ee46f2636f"
}
```

```json
{
  "instance": "/api/driver/v1/orders/220d0fd1-5cc7-4af7-abd3-e61db7986d85/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "e1883778-0dcf-494d-84ad-229a7941c930"
}
```

`POST /api/driver/v1/orders/bab95000-2f52-41a0-8012-e8427d51eac3/claim` → **404**

```json
{
  "command_id": "c27c79a2-305a-4afd-a338-5f077cff6477"
}
```

```json
{
  "instance": "/api/driver/v1/orders/bab95000-2f52-41a0-8012-e8427d51eac3/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "3df484d2-19a4-47a2-90da-a599ec0f4ea4"
}
```

`POST /api/driver/v1/orders/9ee1aedb-942f-4c77-b73c-42d5398b743a/claim` → **404**

```json
{
  "command_id": "d680b127-2d77-4a96-9161-d86ea9b4272d"
}
```

```json
{
  "instance": "/api/driver/v1/orders/9ee1aedb-942f-4c77-b73c-42d5398b743a/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "1942c350-6a8a-43b8-bf30-e5f361855720"
}
```

`POST /api/driver/v1/orders/5f797903-b8f6-49c1-844c-46c145d2ff73/claim` → **404**

```json
{
  "command_id": "1417b370-18b5-4239-ba8c-ef9c2b430ee9"
}
```

```json
{
  "instance": "/api/driver/v1/orders/5f797903-b8f6-49c1-844c-46c145d2ff73/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "9dfaa210-f2ec-43d8-affe-685fb48cbeb3"
}
```

`POST /api/driver/v1/orders/c2ea872c-3303-497c-85b2-e162d7bd111b/claim` → **404**

```json
{
  "command_id": "0d394dfe-c1fd-4681-871c-83c9570e3c69"
}
```

```json
{
  "instance": "/api/driver/v1/orders/c2ea872c-3303-497c-85b2-e162d7bd111b/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "905df3aa-f769-4cb6-a8c8-563e482f9efe"
}
```

`POST /api/driver/v1/orders/d2c5f6ce-f978-4ce5-8753-43edb3c13409/claim` → **404**

```json
{
  "command_id": "a156a761-5abf-406b-a1c1-f8f66af9faab"
}
```

```json
{
  "instance": "/api/driver/v1/orders/d2c5f6ce-f978-4ce5-8753-43edb3c13409/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "deea14e0-39aa-4652-b29f-948a7e732ef8"
}
```

`POST /api/driver/v1/orders/7a02c6db-23a1-4b92-9404-bd29773026d0/claim` → **404**

```json
{
  "command_id": "634f945e-786e-46af-9ff8-a947f7e1a445"
}
```

```json
{
  "instance": "/api/driver/v1/orders/7a02c6db-23a1-4b92-9404-bd29773026d0/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "d116b564-52ea-4ddb-bf91-ec3627eadb56"
}
```

`POST /api/driver/v1/orders/587526a9-79d6-4351-b34e-435758bbe1c7/claim` → **404**

```json
{
  "command_id": "d0dd9902-8e9f-4963-95a0-6410f1d694c5"
}
```

```json
{
  "instance": "/api/driver/v1/orders/587526a9-79d6-4351-b34e-435758bbe1c7/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "2685d727-9eb8-4fb1-a78b-79ee6d52ad9a"
}
```

`POST /api/driver/v1/orders/7c4b4460-2b91-4b60-9b80-dbae7bd3b2ad/claim` → **404**

```json
{
  "command_id": "f370d339-eb68-4981-ac6a-328a768817bf"
}
```

```json
{
  "instance": "/api/driver/v1/orders/7c4b4460-2b91-4b60-9b80-dbae7bd3b2ad/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "75d0dcdd-e40e-4564-b7cf-692c5342efce"
}
```

`POST /api/driver/v1/orders/13b939de-48ed-45fb-b21e-ab76112c9d37/claim` → **404**

```json
{
  "command_id": "b9c678c8-ae6e-404c-a2a2-17de4c19bbad"
}
```

```json
{
  "instance": "/api/driver/v1/orders/13b939de-48ed-45fb-b21e-ab76112c9d37/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "824ed231-06d2-4424-845e-b56d345ad54b"
}
```

`POST /api/driver/v1/orders/50a04a79-e65d-4b14-94ee-1504103fb79e/claim` → **404**

```json
{
  "command_id": "62947837-7adf-4292-8695-abd2d09327da"
}
```

```json
{
  "instance": "/api/driver/v1/orders/50a04a79-e65d-4b14-94ee-1504103fb79e/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "d49d7948-20b1-43d8-934f-9073447d5428"
}
```

`POST /api/driver/v1/orders/c7317d6c-a846-4b95-9fea-38b390545735/claim` → **404**

```json
{
  "command_id": "d9cda0f4-cf49-4ea9-b5e7-5c5fe056ef8d"
}
```

```json
{
  "instance": "/api/driver/v1/orders/c7317d6c-a846-4b95-9fea-38b390545735/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "51595822-0375-4fca-b83d-4c743ce8c6c8"
}
```

`POST /api/driver/v1/orders/5b034345-bc99-42c3-b4fa-47b40898b637/claim` → **404**

```json
{
  "command_id": "a2588a40-c25a-44af-9118-33be6115a3a2"
}
```

```json
{
  "instance": "/api/driver/v1/orders/5b034345-bc99-42c3-b4fa-47b40898b637/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "e2d903cb-eaf0-4470-a446-b4f0d0dc45b0"
}
```

`POST /api/driver/v1/orders/b84d5e2e-0d11-47b4-b491-ecdbc0d6b6bb/claim` → **404**

```json
{
  "command_id": "2ccebf1c-f6be-400e-b201-88db76ab4c74"
}
```

```json
{
  "instance": "/api/driver/v1/orders/b84d5e2e-0d11-47b4-b491-ecdbc0d6b6bb/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "4a86fe82-78ce-4b35-ada0-25b0db0bded8"
}
```

`POST /api/driver/v1/orders/64188ff4-936e-4646-bab8-539f318e606e/claim` → **404**

```json
{
  "command_id": "739c4336-26a0-4075-894a-73167184d3c1"
}
```

```json
{
  "instance": "/api/driver/v1/orders/64188ff4-936e-4646-bab8-539f318e606e/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "b69cae5d-f0e6-441a-9afd-410a05a77219"
}
```

`POST /api/driver/v1/orders/a316c837-4f2a-4e81-93f7-1ffaee8dc5a5/claim` → **404**

```json
{
  "command_id": "f322a3db-5549-458a-afff-8dbb04857f62"
}
```

```json
{
  "instance": "/api/driver/v1/orders/a316c837-4f2a-4e81-93f7-1ffaee8dc5a5/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "7c8cc016-bead-4d88-bc2b-58c32690935f"
}
```

`POST /api/driver/v1/orders/b0bed404-33c0-448b-9636-b3382cbf7b73/claim` → **404**

```json
{
  "command_id": "aa99a1f3-ea5e-449c-8276-301319e90cc2"
}
```

```json
{
  "instance": "/api/driver/v1/orders/b0bed404-33c0-448b-9636-b3382cbf7b73/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "756b8160-33f2-4ae1-b3a6-c4ec34ec8802"
}
```

`POST /api/driver/v1/orders/f3d56eec-dd42-475e-9321-1c0a16662c57/claim` → **404**

```json
{
  "command_id": "dc6a28e5-4616-4d84-8859-98cf04f79413"
}
```

```json
{
  "instance": "/api/driver/v1/orders/f3d56eec-dd42-475e-9321-1c0a16662c57/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "32e6cc77-6536-4836-a47c-b7453a2454e1"
}
```

`POST /api/driver/v1/orders/bb3717c1-d91d-4681-a991-7a03071bd6ab/claim` → **404**

```json
{
  "command_id": "f3f5ec9a-78b6-47ee-9a2c-cd79a23382ad"
}
```

```json
{
  "instance": "/api/driver/v1/orders/bb3717c1-d91d-4681-a991-7a03071bd6ab/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "6fb57e23-8057-4d80-9ec9-e133895001e5"
}
```

`POST /api/driver/v1/orders/8bbfc4e8-6acd-4b94-81e9-d11ab1e49445/claim` → **429**

```json
{
  "command_id": "a9956019-33f4-4755-99e1-24dda3b2155b"
}
```

```json
{
  "instance": "/api/driver/v1/orders/8bbfc4e8-6acd-4b94-81e9-d11ab1e49445/claim",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "83f76860-7e9c-4868-b6c4-88c92c978d63",
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
  "command_id": "85e2b8d5-6f92-40a6-ac1f-c7dc1ef68e47",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T17:45:10Z",
    "sequence": 1793382310630
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "b5893797-2861-4159-8342-ce96517875a6",
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
  "last_heartbeat_at": "2026-10-30T17:45:10.646459Z",
  "last_location_at": "2026-10-30T17:45:10.646459Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/broadcast-orders` → **200**

```json
[
  {
    "order_id": "2a3a1420-a555-475f-bfe7-0c36435c3b45",
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

`POST /api/driver/v1/orders/2a3a1420-a555-475f-bfe7-0c36435c3b45/claim` → **409**

```json
{
  "command_id": "995aa07c-dda0-428a-8171-b7f1bc966785"
}
```

```json
{
  "instance": "/api/driver/v1/orders/2a3a1420-a555-475f-bfe7-0c36435c3b45/claim",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "c39f241d-0d4b-4443-b167-322d8764b69e"
}
```

`POST /api/driver/v1/orders/2a3a1420-a555-475f-bfe7-0c36435c3b45/claim` → **200**

```json
{
  "command_id": "1ace5ae7-5ba5-440c-a891-7b8256e7c1d1"
}
```

```json
{
  "id": "400f9e4a-d0aa-4d6a-892b-c21ef71c1515",
  "order_id": "2a3a1420-a555-475f-bfe7-0c36435c3b45",
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "source": "BROADCAST",
  "state": "COMMITTED",
  "trip_id": "fcb529b0-38d3-4b2b-8f89-33aed13ae307",
  "trip_phase": "TO_PICKUP"
}
```

## Piotr cancels at the rider's request (sandbox clean-up)

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "fcb529b0-38d3-4b2b-8f89-33aed13ae307",
  "order_id": "2a3a1420-a555-475f-bfe7-0c36435c3b45",
  "assignment_id": "400f9e4a-d0aa-4d6a-892b-c21ef71c1515",
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

`POST /api/driver/v1/trips/fcb529b0-38d3-4b2b-8f89-33aed13ae307/cancel` → **200**

```json
{
  "command_id": "9e474e19-3c52-43eb-b65d-0b70a0a022ff",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "fcb529b0-38d3-4b2b-8f89-33aed13ae307",
  "order_id": "2a3a1420-a555-475f-bfe7-0c36435c3b45",
  "assignment_id": "400f9e4a-d0aa-4d6a-892b-c21ef71c1515",
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

`GET /api/rider/v1/orders/2a3a1420-a555-475f-bfe7-0c36435c3b45` → **200**

```json
{
  "id": "2a3a1420-a555-475f-bfe7-0c36435c3b45",
  "short_number": 4,
  "status": "CANCELLED",
  "status_reason": "PASSENGER_ASKED",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "2a35b5d8-ebb2-4930-8cef-9d82e3fc68b5",
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
    "id": "400f9e4a-d0aa-4d6a-892b-c21ef71c1515",
    "order_id": "2a3a1420-a555-475f-bfe7-0c36435c3b45",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "vehicle_id": "5a000000-0000-4000-8000-000000000504",
    "source": "BROADCAST",
    "state": "RELEASED",
    "trip_id": "fcb529b0-38d3-4b2b-8f89-33aed13ae307",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T17:45:03.568247Z",
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
  "session_id": "e18169a8-c8dc-44de-9fb5-f0ecf62cfbb3",
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
  "last_heartbeat_at": "2026-10-30T17:45:02.779526Z",
  "last_location_at": "2026-10-30T17:45:02.779526Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e18169a8-c8dc-44de-9fb5-f0ecf62cfbb3/close` → **200**

```json
{
  "command_id": "4bbbbef9-0ece-4781-a769-7fd1359cce3d",
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
  "session_id": "b5893797-2861-4159-8342-ce96517875a6",
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
  "last_heartbeat_at": "2026-10-30T17:45:10.646459Z",
  "last_location_at": "2026-10-30T17:45:10.646459Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b5893797-2861-4159-8342-ce96517875a6/close` → **200**

```json
{
  "command_id": "e8063439-fd12-4361-b65a-78ec9a84557f",
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
  "session_id": "02faddfa-85c3-4f21-8847-b6b18ff3af63",
  "subject": {
    "type": "STAFF",
    "id": "c1a6f303-45cb-4836-9719-3861c6b8ed9b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMWE2ZjMwMy00NWNiLTQ4MzYtOTcxOS0zODYxYzZiOGVkOWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODMyMTMsImlhdCI6MTc5MzM4MjMxMywianRpIjoiZTczNzQyMjYtNmRmNC00ZTcyLTk5OGEtZDczNzQyMzMyN2FiIiwic2lkIjoiMDJmYWRkZmEtODVjMy00ZjIxLTg4NDctYjZiMThmZjNhZjYzIn0.sB-kKG3ZSU8xK225YKg-4idF-di-lc0HoEgeEY3hZqQ",
  "access_expires_at": "2026-10-30T18:00:13.013233909Z",
  "refresh_token": "nYUcE-mEXL0aLNlAX4u5UUhta-mVEM7ETorOeOU00AI",
  "refresh_expires_at": "2026-10-31T05:45:13.012775725Z",
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
  "command_id": "7e698bbf-474c-4c0c-8eb8-e8867a970cee",
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
  "session_id": "43be6914-3eba-482a-afaf-f0e38354dae6",
  "subject": {
    "type": "STAFF",
    "id": "c1a6f303-45cb-4836-9719-3861c6b8ed9b"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMWE2ZjMwMy00NWNiLTQ4MzYtOTcxOS0zODYxYzZiOGVkOWIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODMyMTMsImlhdCI6MTc5MzM4MjMxMywianRpIjoiMzhjMDZiNTctOWFiOC00NWQ4LWIwYzMtYWI5MTQ3M2I0MTJiIiwic2lkIjoiNDNiZTY5MTQtM2ViYS00ODJhLWFmYWYtZjBlMzgzNTRkYWU2In0.XfO6CG6yBWV8THeSeISkhVqqWZigk93Om7OPxcyIY0Y",
  "access_expires_at": "2026-10-30T18:00:13.784324993Z",
  "refresh_token": "MAUTgvh7_YvM6hSYZvQGFl34A9lp6DO38M7GcKN09mE",
  "refresh_expires_at": "2026-10-31T05:45:13.783948974Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.75819234",
    "linkedid": "1730052700.75819234",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380670640799"
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
    "id": "1730052700.75819234",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "0d429655-a37c-4b73-abb5-8bf1d6b32884",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380670640799",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T17:45:13.968983Z",
      "answered_at": null,
      "ended_at": "2026-10-30T17:45:13.988197Z",
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
    "id": "1730052600.135333297",
    "linkedid": "1730052600.135333297",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380670640799"
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
      "id": "de656073-41e9-458a-af68-494f741b0c3c",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380670640799",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T17:45:14.204474Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/de656073-41e9-458a-af68-494f741b0c3c/answer` → **200**

```json
{
  "command_id": "df553b51-5504-4696-889b-97724d438a4f"
}
```

```json
{
  "id": "de656073-41e9-458a-af68-494f741b0c3c",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380670640799",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "c1a6f303-45cb-4836-9719-3861c6b8ed9b",
  "order_ids": [],
  "started_at": "2026-10-30T17:45:14.204474Z",
  "answered_at": "2026-10-30T17:45:14.41878Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.135333297",
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
    "id": "1730052600.135333297",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "de656073-41e9-458a-af68-494f741b0c3c",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670640799",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "c1a6f303-45cb-4836-9719-3861c6b8ed9b",
      "order_ids": [],
      "started_at": "2026-10-30T17:45:14.204474Z",
      "answered_at": "2026-10-30T17:45:14.41878Z",
      "ended_at": "2026-10-30T17:45:14.629259Z",
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
      "id": "de656073-41e9-458a-af68-494f741b0c3c",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670640799",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "c1a6f303-45cb-4836-9719-3861c6b8ed9b",
      "order_ids": [],
      "started_at": "2026-10-30T17:45:14.204474Z",
      "answered_at": "2026-10-30T17:45:14.41878Z",
      "ended_at": "2026-10-30T17:45:14.629259Z",
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
      "id": "de656073-41e9-458a-af68-494f741b0c3c",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670640799",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "c1a6f303-45cb-4836-9719-3861c6b8ed9b",
      "order_ids": [],
      "started_at": "2026-10-30T17:45:14.204474Z",
      "answered_at": "2026-10-30T17:45:14.41878Z",
      "ended_at": "2026-10-30T17:45:14.629259Z",
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
      "id": "de656073-41e9-458a-af68-494f741b0c3c",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670640799",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "c1a6f303-45cb-4836-9719-3861c6b8ed9b",
      "order_ids": [],
      "started_at": "2026-10-30T17:45:14.204474Z",
      "answered_at": "2026-10-30T17:45:14.41878Z",
      "ended_at": "2026-10-30T17:45:14.629259Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T17:45:21.045462Z"
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
      "id": "de656073-41e9-458a-af68-494f741b0c3c",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670640799",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "c1a6f303-45cb-4836-9719-3861c6b8ed9b",
      "order_ids": [],
      "started_at": "2026-10-30T17:45:14.204474Z",
      "answered_at": "2026-10-30T17:45:14.41878Z",
      "ended_at": "2026-10-30T17:45:14.629259Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T17:45:21.045462Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/de656073-41e9-458a-af68-494f741b0c3c/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/de656073-41e9-458a-af68-494f741b0c3c/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=de656073-41e9-458a-af68-494f741b0c3c` → **200**

```json
{
  "changes": [
    {
      "id": "f0df9bea-770b-4700-b272-3bb38ab7eb03",
      "occurred_at": "2026-10-30T17:45:21.626097Z",
      "actor_type": "STAFF",
      "actor_id": "c1a6f303-45cb-4836-9719-3861c6b8ed9b",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "de656073-41e9-458a-af68-494f741b0c3c",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"a0460455-fc7b-4afb-a958-85c2fcc4b82c\", \"order_ids\": []}",
      "correlation_id": "599b7fc1-035a-407e-a902-bc36a592ae7d"
    },
    {
      "id": "87216f18-0f05-4180-8564-e2b1adaaacf8",
      "occurred_at": "2026-10-30T17:45:21.603261Z",
      "actor_type": "STAFF",
      "actor_id": "c1a6f303-45cb-4836-9719-3861c6b8ed9b",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "de656073-41e9-458a-af68-494f741b0c3c",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"a0460455-fc7b-4afb-a958-85c2fcc4b82c\", \"order_ids\": []}",
      "correlation_id": "532694c7-58de-49bb-b256-0b535af1e96c"
    }
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
```

Done: call de656073-41e9-458a-af68-494f741b0c3c recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-10251"
}
```

```json
{
  "challenge_id": "14aafaf3-1024-486d-b927-92ebdb1b1923",
  "expires_at": "2026-10-30T17:50:21.837215526Z",
  "resend_available_at": "2026-10-30T17:45:22.837215526Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "392781",
  "sent_at": "2026-10-30T17:45:21.839389017Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "14aafaf3-1024-486d-b927-92ebdb1b1923",
  "code": "392781",
  "device_ref": "sandbox-10251"
}
```

```json
{
  "session_id": "35f38026-c9b6-41a7-95e7-a376d4cb5e56",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4MzIyMiwiaWF0IjoxNzkzMzgyMzIyLCJqdGkiOiJjMjA3MWUyOC04MDk5LTRiN2QtOWRkMy03Y2MzNzRhODAwODkiLCJzaWQiOiIzNWYzODAyNi1jOWI2LTQxYTctOTVlNy1hMzc2ZDRjYjVlNTYifQ.SIhJw9uvjfLO3IEFgcui2RXjoZPgbF-Rmrm8QQ7C8fg",
  "access_expires_at": "2026-10-30T18:00:22.044708957Z",
  "refresh_token": "SBdAjsm5Ca09-zSih-EPyv_jOyLf2XglxysQYr_JpiE",
  "refresh_expires_at": "2026-11-29T17:45:22.044286557Z",
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
  "command_id": "985dda64-283d-4215-b20f-a88254c9edeb",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T17:45:22Z",
    "sequence": 1793382322418
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "09157937-7824-4fbe-a788-ade2aa6f51e8",
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
  "last_heartbeat_at": "2026-10-30T17:45:22.4341Z",
  "last_location_at": "2026-10-30T17:45:22.4341Z",
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
  "session_id": "1281bcfe-283d-47ae-9f62-6e4902c059d7",
  "subject": {
    "type": "STAFF",
    "id": "c1a6f303-45cb-4836-9719-3861c6b8ed9b"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMWE2ZjMwMy00NWNiLTQ4MzYtOTcxOS0zODYxYzZiOGVkOWIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODMyMjIsImlhdCI6MTc5MzM4MjMyMiwianRpIjoiM2UzY2EyMTItMTRlYi00MDg3LTg5YTYtNTliZjJmOTQyNjRmIiwic2lkIjoiMTI4MWJjZmUtMjgzZC00N2FlLTlmNjItNmU0OTAyYzA1OWQ3In0.FrQYdRYZFvOK6svZaBSwOPdeFn2iai7MkaEsX19oe3Y",
  "access_expires_at": "2026-10-30T18:00:22.816271332Z",
  "refresh_token": "-Mo7P--uemGjOUiGpYMJ4X0wHFq0ndVWYa4v5cKZc7c",
  "refresh_expires_at": "2026-10-31T05:45:22.81586694Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "7f7698df-e677-4c71-8057-68015faef6c0",
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
  "id": "e3483858-849b-402a-ab93-234a2c904e87",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T17:50:23.007192Z",
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
  "command_id": "8641192a-985b-4fb9-a5a5-9db39f76c734",
  "quote_id": "e3483858-849b-402a-ab93-234a2c904e87",
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
    "phone": "+380673103900"
  }
}
```

```json
{
  "id": "6baffe02-6c03-4230-8993-b372566303c6",
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
  "created_at": "2026-10-30T17:45:23.210473Z",
  "caller": {
    "name": "Олена",
    "phone": "+380673103900"
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
    "id": "676e51c2-2c49-417c-89b1-64f47d8a7465",
    "order_id": "6baffe02-6c03-4230-8993-b372566303c6",
    "expires_at": "2026-10-30T17:45:38.213899Z",
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

`POST /api/driver/v1/offers/676e51c2-2c49-417c-89b1-64f47d8a7465/accept` → **200**

```json
{
  "command_id": "04426399-7ad7-447a-a40b-0d954d5e8ec1"
}
```

```json
{
  "id": "b35404ba-88f6-4c3a-8985-4e1aeb16e874",
  "order_id": "6baffe02-6c03-4230-8993-b372566303c6",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f5059d84-46c7-4938-a8ba-be94d581d075",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380673103900` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380673103900` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380673103900` → **200**

```json
[
  {
    "phone": "+380673103900",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T17:45:25.444910617Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380673103900` → **200**

```json
[
  {
    "phone": "+380673103900",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T17:45:25.444910617Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380673103900` → **200**

```json
[
  {
    "phone": "+380673103900",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T17:45:25.444910617Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f5059d84-46c7-4938-a8ba-be94d581d075",
  "order_id": "6baffe02-6c03-4230-8993-b372566303c6",
  "assignment_id": "b35404ba-88f6-4c3a-8985-4e1aeb16e874",
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
    "phone": "+380673103900"
  }
}
```

`POST /api/driver/v1/work-sessions/09157937-7824-4fbe-a788-ade2aa6f51e8/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T17:45:26Z",
    "sequence": 1793382326870
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "09157937-7824-4fbe-a788-ade2aa6f51e8",
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
  "last_heartbeat_at": "2026-10-30T17:45:26.102223Z",
  "last_location_at": "2026-10-30T17:45:26.102223Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/f5059d84-46c7-4938-a8ba-be94d581d075/arrive` → **200**

```json
{
  "command_id": "a6cdda48-27eb-4d16-9cc4-a9f1cce1dd9a",
  "expected_version": 0
}
```

```json
{
  "id": "f5059d84-46c7-4938-a8ba-be94d581d075",
  "order_id": "6baffe02-6c03-4230-8993-b372566303c6",
  "assignment_id": "b35404ba-88f6-4c3a-8985-4e1aeb16e874",
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
  "arrived_at": "2026-10-30T17:45:26.310723Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380673103900"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380673103900` → **200**

```json
[
  {
    "phone": "+380673103900",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T17:45:25.444910617Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380673103900` → **200**

```json
[
  {
    "phone": "+380673103900",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T17:45:25.444910617Z"
  },
  {
    "phone": "+380673103900",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T17:45:27.450883589Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380673103900` → **200**

```json
[
  {
    "phone": "+380673103900",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T17:45:25.444910617Z"
  },
  {
    "phone": "+380673103900",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T17:45:27.450883589Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380673103900` → **200**

```json
[
  {
    "phone": "+380673103900",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T17:45:25.444910617Z"
  },
  {
    "phone": "+380673103900",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T17:45:27.450883589Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/f5059d84-46c7-4938-a8ba-be94d581d075/start` → **200**

```json
{
  "command_id": "d568bb51-fc6a-4c9a-87ba-bc67ad243996",
  "expected_version": 1
}
```

```json
{
  "id": "f5059d84-46c7-4938-a8ba-be94d581d075",
  "order_id": "6baffe02-6c03-4230-8993-b372566303c6",
  "assignment_id": "b35404ba-88f6-4c3a-8985-4e1aeb16e874",
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
  "arrived_at": "2026-10-30T17:45:26.310723Z",
  "started_at": "2026-10-30T17:45:27.587881Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380673103900"
  }
}
```

`POST /api/driver/v1/trips/f5059d84-46c7-4938-a8ba-be94d581d075/complete` → **200**

```json
{
  "command_id": "6933db14-628e-46af-8e52-01397d00c329",
  "expected_version": 2,
  "reported_at": "2026-10-30T17:45:27Z",
  "cash_received": true
}
```

```json
{
  "id": "f5059d84-46c7-4938-a8ba-be94d581d075",
  "order_id": "6baffe02-6c03-4230-8993-b372566303c6",
  "assignment_id": "b35404ba-88f6-4c3a-8985-4e1aeb16e874",
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
  "arrived_at": "2026-10-30T17:45:26.310723Z",
  "started_at": "2026-10-30T17:45:27.587881Z",
  "completed_at": "2026-10-30T17:45:27.800118Z",
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
  "session_id": "09157937-7824-4fbe-a788-ade2aa6f51e8",
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
  "last_heartbeat_at": "2026-10-30T17:45:26.102223Z",
  "last_location_at": "2026-10-30T17:45:26.102223Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/09157937-7824-4fbe-a788-ade2aa6f51e8/close` → **200**

```json
{
  "command_id": "bb1a6ee7-6419-4ad6-953c-f263fefab2dc",
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
  "phone": "+380633100531",
  "device_ref": "sandbox-17462"
}
```

```json
{
  "challenge_id": "ed37fe6d-b282-4f98-9ed2-a89f70fb50b6",
  "expires_at": "2026-10-30T17:50:28.394657872Z",
  "resend_available_at": "2026-10-30T17:45:29.394657872Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380633100531` → **200**

```json
{
  "phone": "+380633100531",
  "audience": "CLIENT",
  "code": "258270",
  "sent_at": "2026-10-30T17:45:28.396735206Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ed37fe6d-b282-4f98-9ed2-a89f70fb50b6",
  "code": "258270",
  "device_ref": "sandbox-17462"
}
```

```json
{
  "session_id": "738582ef-a6b4-4013-8945-39c2acf047fb",
  "subject": {
    "type": "CLIENT",
    "id": "7677a7ea-4029-47e8-a85e-8c85fe5b0c64"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3Njc3YTdlYS00MDI5LTQ3ZTgtYTg1ZS04Yzg1ZmU1YjBjNjQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzgzMjI4LCJpYXQiOjE3OTMzODIzMjgsImp0aSI6IjYzODA4OTQzLWM2NjQtNGExNi04ZTc3LTVmZWEzZGFmYTYzNyIsInNpZCI6IjczODU4MmVmLWE2YjQtNDAxMy04OTQ1LTM5YzJhY2YwNDdmYiJ9.CZ3LunVpqB53jux3iw2BNFuMmoyZ4zmGryd-J6dnveo",
  "access_expires_at": "2026-10-30T18:00:28.605365247Z",
  "refresh_token": "6JBBYUAJ3tqQZZDQryi-a1hFxlgDUEC1XZ9PaJAYWJg",
  "refresh_expires_at": "2026-11-29T17:45:28.60502358Z",
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
  "device_ref": "sandbox-13712"
}
```

```json
{
  "challenge_id": "23573bcf-c160-4801-9f67-98cb9a7c7e3b",
  "expires_at": "2026-10-30T17:50:28.980658225Z",
  "resend_available_at": "2026-10-30T17:45:29.980658225Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "484470",
  "sent_at": "2026-10-30T17:45:28.982578321Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "23573bcf-c160-4801-9f67-98cb9a7c7e3b",
  "code": "484470",
  "device_ref": "sandbox-13712"
}
```

```json
{
  "session_id": "b44c5184-a641-4c89-b617-97740f11cc89",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4MzIyOSwiaWF0IjoxNzkzMzgyMzI5LCJqdGkiOiJiYTRiOGFlZS0yNDJkLTQ4NTQtYmYxZC1kNmUxYjZkZWMzMzMiLCJzaWQiOiJiNDRjNTE4NC1hNjQxLTRjODktYjYxNy05Nzc0MGYxMWNjODkifQ.aFRycLM4lybs9dDxxfPa9TePzCZdKl4AWQlATsnSf6U",
  "access_expires_at": "2026-10-30T18:00:29.19008001Z",
  "refresh_token": "LHL__GBCG9EY75X9G6IDrZ9yN43J1jjpvzM8jX2YWxE",
  "refresh_expires_at": "2026-11-29T17:45:29.189660138Z",
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
  "session_id": "103f7d06-16c5-4708-9553-154d6f4e9459",
  "subject": {
    "type": "STAFF",
    "id": "c1a6f303-45cb-4836-9719-3861c6b8ed9b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMWE2ZjMwMy00NWNiLTQ4MzYtOTcxOS0zODYxYzZiOGVkOWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODMyMjksImlhdCI6MTc5MzM4MjMyOSwianRpIjoiZjk5ZTI5NTgtZGI3ZC00NTU5LWEzYWEtMWQ4ZjYxNmE2ZmQ1Iiwic2lkIjoiMTAzZjdkMDYtMTZjNS00NzA4LTk1NTMtMTU0ZDZmNGU5NDU5In0.CXqixrFERp8azXpp1vAVhF4ktbOxJWi-wHhez_qwLmM",
  "access_expires_at": "2026-10-30T18:00:29.752215784Z",
  "refresh_token": "JajWfAmgbSfBbn1JjUFAmm_EWE4FCrNB3O708kV25h8",
  "refresh_expires_at": "2026-10-31T05:45:29.751845914Z",
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
  "session_id": "007825c8-c6d1-4702-b5c3-496f342ba7e3",
  "subject": {
    "type": "STAFF",
    "id": "c1a6f303-45cb-4836-9719-3861c6b8ed9b"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMWE2ZjMwMy00NWNiLTQ4MzYtOTcxOS0zODYxYzZiOGVkOWIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODMyMzAsImlhdCI6MTc5MzM4MjMzMCwianRpIjoiYTExNzVjOTUtOTE5Ni00ODdjLWJhMDMtZGVjYmVlMDI0MWRlIiwic2lkIjoiMDA3ODI1YzgtYzZkMS00NzAyLWI1YzMtNDk2ZjM0MmJhN2UzIn0.zyBB-C2n72BdcFS2N3n11KyUDW6ZLKrFieTTDr06C2s",
  "access_expires_at": "2026-10-30T18:00:30.137681851Z",
  "refresh_token": "-TgvYquw3qaHSjYNxhOoBJP3DCCXqztSluvJLDyN2Oo",
  "refresh_expires_at": "2026-10-31T05:45:30.137231139Z",
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
  "command_id": "a69ea44f-009a-49fa-9b3b-c40e96ed9759",
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
  "id": "bcbb7dc4-d8ac-44ef-a8ee-6a90bc358ef0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T17:50:30.506977Z",
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
  "command_id": "667da469-cd96-466e-984e-a638a6833b7b",
  "quote_id": "bcbb7dc4-d8ac-44ef-a8ee-6a90bc358ef0",
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
  "id": "347735c8-7095-4d7e-a962-870ef363ccbf",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7677a7ea-4029-47e8-a85e-8c85fe5b0c64",
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
  "created_at": "2026-10-30T17:45:30.707099Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/347735c8-7095-4d7e-a962-870ef363ccbf` → **200**

```json
{
  "id": "347735c8-7095-4d7e-a962-870ef363ccbf",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7677a7ea-4029-47e8-a85e-8c85fe5b0c64",
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
  "created_at": "2026-10-30T17:45:30.707099Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/347735c8-7095-4d7e-a962-870ef363ccbf/cancel` → **200**

```json
{
  "command_id": "607a228c-0402-448a-8dd6-d235ae469d83",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "347735c8-7095-4d7e-a962-870ef363ccbf",
  "short_number": 6,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "7677a7ea-4029-47e8-a85e-8c85fe5b0c64",
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
  "created_at": "2026-10-30T17:45:30.707099Z",
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
  "command_id": "0d067f74-dfec-4ffd-894c-d87f41ba3816",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T17:45:31Z",
    "sequence": 1793382331514
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "298bfc09-79e6-4e56-b74c-2249f3a4c222",
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
  "last_heartbeat_at": "2026-10-30T17:45:31.531712Z",
  "last_location_at": "2026-10-30T17:45:31.531712Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-10613"
}
```

```json
{
  "challenge_id": "1565d7c8-a4a8-403d-b3be-f3ac9b17e866",
  "expires_at": "2026-10-30T17:50:31.717140159Z",
  "resend_available_at": "2026-10-30T17:45:32.717140159Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "456539",
  "sent_at": "2026-10-30T17:45:31.718964001Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1565d7c8-a4a8-403d-b3be-f3ac9b17e866",
  "code": "456539",
  "device_ref": "sandbox-10613"
}
```

```json
{
  "session_id": "a64bfe3f-4eed-4441-8f02-2eb7a48d4eb3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4MzIzMSwiaWF0IjoxNzkzMzgyMzMxLCJqdGkiOiIxNmEyN2E2Yi0wYjZhLTQyOGYtYTM2MS00OTg5YjYyYTI4MzciLCJzaWQiOiJhNjRiZmUzZi00ZWVkLTQ0NDEtOGYwMi0yZWI3YTQ4ZDRlYjMifQ.sWOrCErGm_3217_xF0_9Vgkb_MfePFbukzTyzyEaK8I",
  "access_expires_at": "2026-10-30T18:00:31.916032742Z",
  "refresh_token": "CHR4ZNCa74-iVlcmFXSfwjUwHP-RfzPPIVK728F3oDY",
  "refresh_expires_at": "2026-11-29T17:45:31.915689522Z",
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
  "command_id": "4f7e6767-d2df-4460-b8af-2fe272bb4e96",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T17:45:32Z",
    "sequence": 1793382332289
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "fa314eca-932b-4bcc-b8b2-0b7dfb9e5dd2",
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
  "last_heartbeat_at": "2026-10-30T17:45:32.304485Z",
  "last_location_at": "2026-10-30T17:45:32.304485Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "adaf3d27-da3a-4b07-a1db-c4f2632ebb20",
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
  "id": "8be9315b-ba2f-48de-a454-f52d96f74dc9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T17:50:32.492378Z",
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
  "command_id": "dad4b617-f79a-4d15-be58-0b84c3318947",
  "quote_id": "8be9315b-ba2f-48de-a454-f52d96f74dc9",
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
  "id": "35a80804-a4ee-4c5c-bd28-4c5b43849884",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7677a7ea-4029-47e8-a85e-8c85fe5b0c64",
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
  "created_at": "2026-10-30T17:45:32.682784Z",
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
    "id": "4772d315-e3bb-473a-9686-033fba28a5d4",
    "order_id": "35a80804-a4ee-4c5c-bd28-4c5b43849884",
    "expires_at": "2026-10-30T17:45:47.685059Z",
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

`POST /api/driver/v1/offers/4772d315-e3bb-473a-9686-033fba28a5d4/accept` → **200**

```json
{
  "command_id": "fb380743-7c43-4de2-abe1-4e32c2b40317"
}
```

```json
{
  "id": "5fd10a5f-81fe-4d9d-a6d4-66569fed7e7f",
  "order_id": "35a80804-a4ee-4c5c-bd28-4c5b43849884",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "cdb0b0cc-6722-40cb-8a11-a3555bd91d76",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "cdb0b0cc-6722-40cb-8a11-a3555bd91d76",
  "order_id": "35a80804-a4ee-4c5c-bd28-4c5b43849884",
  "assignment_id": "5fd10a5f-81fe-4d9d-a6d4-66569fed7e7f",
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

`POST /api/driver/v1/trips/cdb0b0cc-6722-40cb-8a11-a3555bd91d76/cancel` → **200**

```json
{
  "command_id": "dc702bee-f0c9-4dcd-9a37-92eec18b7a69",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "cdb0b0cc-6722-40cb-8a11-a3555bd91d76",
  "order_id": "35a80804-a4ee-4c5c-bd28-4c5b43849884",
  "assignment_id": "5fd10a5f-81fe-4d9d-a6d4-66569fed7e7f",
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

`GET /api/rider/v1/orders/35a80804-a4ee-4c5c-bd28-4c5b43849884` → **200**

```json
{
  "id": "35a80804-a4ee-4c5c-bd28-4c5b43849884",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "7677a7ea-4029-47e8-a85e-8c85fe5b0c64",
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
    "id": "5fd10a5f-81fe-4d9d-a6d4-66569fed7e7f",
    "order_id": "35a80804-a4ee-4c5c-bd28-4c5b43849884",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "cdb0b0cc-6722-40cb-8a11-a3555bd91d76",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T17:45:32.682784Z",
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
    "id": "8161c8ee-0fef-4b11-80e4-c49ebb51b8be",
    "order_id": "35a80804-a4ee-4c5c-bd28-4c5b43849884",
    "expires_at": "2026-10-30T17:45:48.456268Z",
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

`POST /api/driver/v1/offers/8161c8ee-0fef-4b11-80e4-c49ebb51b8be/accept` → **200**

```json
{
  "command_id": "043b7432-769b-4c93-95fd-f789e79663af"
}
```

```json
{
  "id": "54a8ca33-3e54-48ef-ac38-8507dc4ec637",
  "order_id": "35a80804-a4ee-4c5c-bd28-4c5b43849884",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "1f13b165-edc9-47e5-aafd-bad9848aca88",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "1f13b165-edc9-47e5-aafd-bad9848aca88",
  "order_id": "35a80804-a4ee-4c5c-bd28-4c5b43849884",
  "assignment_id": "54a8ca33-3e54-48ef-ac38-8507dc4ec637",
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

`POST /api/driver/v1/trips/1f13b165-edc9-47e5-aafd-bad9848aca88/cancel` → **200**

```json
{
  "command_id": "ff15fa70-9aed-4169-a9bc-89cca768397e",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "1f13b165-edc9-47e5-aafd-bad9848aca88",
  "order_id": "35a80804-a4ee-4c5c-bd28-4c5b43849884",
  "assignment_id": "54a8ca33-3e54-48ef-ac38-8507dc4ec637",
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
      "id": "35a80804-a4ee-4c5c-bd28-4c5b43849884",
      "short_number": 7,
      "status": "CANCELLED",
      "created_at": "2026-10-30T17:45:32.682784Z",
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
      "id": "347735c8-7095-4d7e-a962-870ef363ccbf",
      "short_number": 6,
      "status": "CANCELLED",
      "created_at": "2026-10-30T17:45:30.707099Z",
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

`GET /api/operator/v1/orders/35a80804-a4ee-4c5c-bd28-4c5b43849884/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T17:45:32.683152Z",
      "actor": {
        "type": "CLIENT",
        "id": "7677a7ea-4029-47e8-a85e-8c85fe5b0c64",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "35a80804-a4ee-4c5c-bd28-4c5b43849884",
        "quote_id": "8be9315b-ba2f-48de-a454-f52d96f74dc9",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "4dedd503-0c5e-44a9-80bd-02c6a2365cea"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T17:45:32.684534Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "35a80804-a4ee-4c5c-bd28-4c5b43849884",
        "attempt_id": "ff940c8e-82f2-4074-9aa5-f331379a40c6",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "4dedd503-0c5e-44a9-80bd-02c6a2365cea"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T17:45:32.700305Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "4772d315-e3bb-473a-9686-033fba28a5d4",
        "order_id": "35a80804-a4ee-4c5c-bd28-4c5b43849884",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "4dedd503-0c5e-44a9-80bd-02c6a2365cea"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T17:45:33.086188Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "4772d315-e3bb-473a-9686-033fba28a5d4",
        "order_id": "35a80804-a4ee-4c5c-bd28-4c5b43849884",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "5fd10a5f-81fe-4d9d-a6d4-66569fed7e7f"
      },
      "correlation_id": "55d4a67e-05af-41d7-a96b-4fb85357fd5b"
```

Done: orders 347735c8-7095-4d7e-a962-870ef363ccbf, 35a80804-a4ee-4c5c-bd28-4c5b43849884.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380734535165",
  "device_ref": "sandbox-32105"
}
```

```json
{
  "challenge_id": "c043ff45-bfd1-4d9c-abfb-34e29e41bccd",
  "expires_at": "2026-10-30T17:50:34.971711635Z",
  "resend_available_at": "2026-10-30T17:45:35.971711635Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380734535165` → **200**

```json
{
  "phone": "+380734535165",
  "audience": "CLIENT",
  "code": "448732",
  "sent_at": "2026-10-30T17:45:34.973672523Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c043ff45-bfd1-4d9c-abfb-34e29e41bccd",
  "code": "448732",
  "device_ref": "sandbox-32105"
}
```

```json
{
  "session_id": "f3e03dc3-abd7-48b6-a23a-e3a37dcb0b83",
  "subject": {
    "type": "CLIENT",
    "id": "8587a9bc-1675-42c4-b1ab-1454783873d3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NTg3YTliYy0xNjc1LTQyYzQtYjFhYi0xNDU0NzgzODczZDMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzgzMjM1LCJpYXQiOjE3OTMzODIzMzUsImp0aSI6IjZlNDJkMGVjLTQxMzgtNGYwOC04NjUwLTJhZGJiZjBhMDhmYyIsInNpZCI6ImYzZTAzZGMzLWFiZDctNDhiNi1hMjNhLWUzYTM3ZGNiMGI4MyJ9.wCeGuY3WxgC64_ITxlPblPnyMpSL2A4i871GydHL8Oo",
  "access_expires_at": "2026-10-30T18:00:35.173931733Z",
  "refresh_token": "vWttDoHkK-t269GLFGr9gpIX4KK5vAsbZdYAWxrOGLM",
  "refresh_expires_at": "2026-11-29T17:45:35.173580722Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "a50e3664-7ab4-47ec-854a-5fbd99825037",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "47e083ad-9649-4876-9cdc-4d8861f2c66e",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-47e083ad-9649-4876-9cdc-4d8861f2c66e",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "a943d9b50ddbe9267a69a334e1dd33a7",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=47e083ad-9649-4876-9cdc-4d8861f2c66e",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380734535165"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=47e083ad-9649-4876-9cdc-4d8861f2c66e",
  "expires_at": "2026-10-30T18:15:35.361328Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/47e083ad-9649-4876-9cdc-4d8861f2c66e` → **200**

```json
{
  "id": "47e083ad-9649-4876-9cdc-4d8861f2c66e",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T18:15:35.361328Z",
  "card": {
    "id": "40a148e1-f577-44d1-985a-e8d4b3b985b1",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****5530",
    "card_type": "Visa",
    "created_at": "2026-10-30T17:45:35.561628Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "40a148e1-f577-44d1-985a-e8d4b3b985b1",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****5530",
      "card_type": "Visa",
      "created_at": "2026-10-30T17:45:35.561628Z"
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
  "device_ref": "sandbox-32559"
}
```

```json
{
  "challenge_id": "57eaec3b-6c40-46b9-96ff-824d17be7b16",
  "expires_at": "2026-10-30T17:50:35.930603311Z",
  "resend_available_at": "2026-10-30T17:45:36.930603311Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "561600",
  "sent_at": "2026-10-30T17:45:35.932482956Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "57eaec3b-6c40-46b9-96ff-824d17be7b16",
  "code": "561600",
  "device_ref": "sandbox-32559"
}
```

```json
{
  "session_id": "145e7098-4dd2-4cd5-b455-ce25d311f90d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4MzIzNiwiaWF0IjoxNzkzMzgyMzM2LCJqdGkiOiI2ZmFjYWRkOS0zMjE4LTRmMjgtYjExMC1kMWI0OTE5MGRkNzIiLCJzaWQiOiIxNDVlNzA5OC00ZGQyLTRjZDUtYjQ1NS1jZTI1ZDMxMWY5MGQifQ.S6O__R3UkbPuNq_PVx6UXkX5rY7EFRSx6vHfprCciSQ",
  "access_expires_at": "2026-10-30T18:00:36.130041513Z",
  "refresh_token": "oVrmeIhQyIUYNa8hN13I0o8BR6vkWul4eET83nzk1yk",
  "refresh_expires_at": "2026-11-29T17:45:36.129671082Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "fa314eca-932b-4bcc-b8b2-0b7dfb9e5dd2",
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
  "last_heartbeat_at": "2026-10-30T17:45:32.304485Z",
  "last_location_at": "2026-10-30T17:45:32.304485Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/fa314eca-932b-4bcc-b8b2-0b7dfb9e5dd2/handover` → **200**

```json
{
  "command_id": "5cd0654d-321d-4646-853c-5657421d2063",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "fa314eca-932b-4bcc-b8b2-0b7dfb9e5dd2",
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
  "last_heartbeat_at": "2026-10-30T17:45:32.304485Z",
  "last_location_at": "2026-10-30T17:45:32.304485Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

(the car drives 45 s to the next point)

`POST /api/driver/v1/work-sessions/fa314eca-932b-4bcc-b8b2-0b7dfb9e5dd2/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T17:46:21Z",
    "sequence": 1793382381702
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "fa314eca-932b-4bcc-b8b2-0b7dfb9e5dd2",
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
  "last_heartbeat_at": "2026-10-30T17:46:21.718322Z",
  "last_location_at": "2026-10-30T17:46:21.718322Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "5593d2b6-a417-4dcb-9fa1-ff94a25fb714",
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
  "id": "f900740e-d2f4-40be-836a-4773c82bbba6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T17:51:21.913283Z",
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
  "command_id": "db4b2681-39a2-4cd3-8c9e-b32fc5d215d3",
  "quote_id": "f900740e-d2f4-40be-836a-4773c82bbba6",
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
  "id": "8ff4c6c7-9701-40c7-ad87-5ad38f925368",
  "short_number": 8,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "8587a9bc-1675-42c4-b1ab-1454783873d3",
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
  "created_at": "2026-10-30T17:46:22.11444Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8ff4c6c7-9701-40c7-ad87-5ad38f925368` → **200**

```json
{
  "id": "8ff4c6c7-9701-40c7-ad87-5ad38f925368",
  "short_number": 8,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "8587a9bc-1675-42c4-b1ab-1454783873d3",
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
  "created_at": "2026-10-30T17:46:22.11444Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8ff4c6c7-9701-40c7-ad87-5ad38f925368` → **200**

```json
{
  "id": "8ff4c6c7-9701-40c7-ad87-5ad38f925368",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "8587a9bc-1675-42c4-b1ab-1454783873d3",
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
  "created_at": "2026-10-30T17:46:22.11444Z",
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
    "id": "104a0d1a-a83c-4af6-84b1-e168d3141566",
    "order_id": "8ff4c6c7-9701-40c7-ad87-5ad38f925368",
    "expires_at": "2026-10-30T17:46:37.745912Z",
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

`POST /api/driver/v1/offers/104a0d1a-a83c-4af6-84b1-e168d3141566/accept` → **200**

```json
{
  "command_id": "6fee90aa-0603-4b89-bfb7-fa96b1203aa5"
}
```

```json
{
  "id": "f3b8eeff-0651-4ccc-841a-afe956bdc8e4",
  "order_id": "8ff4c6c7-9701-40c7-ad87-5ad38f925368",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "ca47d21d-0ba2-4cbc-a051-794eaebbe301",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "ca47d21d-0ba2-4cbc-a051-794eaebbe301",
  "order_id": "8ff4c6c7-9701-40c7-ad87-5ad38f925368",
  "assignment_id": "f3b8eeff-0651-4ccc-841a-afe956bdc8e4",
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

`POST /api/driver/v1/work-sessions/fa314eca-932b-4bcc-b8b2-0b7dfb9e5dd2/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T17:46:30Z",
    "sequence": 1793382390273
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "fa314eca-932b-4bcc-b8b2-0b7dfb9e5dd2",
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
  "last_heartbeat_at": "2026-10-30T17:46:30.289082Z",
  "last_location_at": "2026-10-30T17:46:30.289082Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/ca47d21d-0ba2-4cbc-a051-794eaebbe301/arrive` → **200**

```json
{
  "command_id": "c1b80035-4dcb-437f-9abf-6c0be18c6c4e",
  "expected_version": 0
}
```

```json
{
  "id": "ca47d21d-0ba2-4cbc-a051-794eaebbe301",
  "order_id": "8ff4c6c7-9701-40c7-ad87-5ad38f925368",
  "assignment_id": "f3b8eeff-0651-4ccc-841a-afe956bdc8e4",
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
  "arrived_at": "2026-10-30T17:46:30.482066Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/ca47d21d-0ba2-4cbc-a051-794eaebbe301/start` → **200**

```json
{
  "command_id": "dac127aa-1913-4bde-9abc-11d522c13599",
  "expected_version": 1
}
```

```json
{
  "id": "ca47d21d-0ba2-4cbc-a051-794eaebbe301",
  "order_id": "8ff4c6c7-9701-40c7-ad87-5ad38f925368",
  "assignment_id": "f3b8eeff-0651-4ccc-841a-afe956bdc8e4",
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
  "arrived_at": "2026-10-30T17:46:30.482066Z",
  "started_at": "2026-10-30T17:46:30.680941Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/ca47d21d-0ba2-4cbc-a051-794eaebbe301/complete` → **200**

```json
{
  "command_id": "b671d512-bbdf-4e7d-abc4-af1d3bcbe19d",
  "expected_version": 2,
  "reported_at": "2026-10-30T17:46:30Z",
  "cash_received": true
}
```

```json
{
  "id": "ca47d21d-0ba2-4cbc-a051-794eaebbe301",
  "order_id": "8ff4c6c7-9701-40c7-ad87-5ad38f925368",
  "assignment_id": "f3b8eeff-0651-4ccc-841a-afe956bdc8e4",
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
  "arrived_at": "2026-10-30T17:46:30.482066Z",
  "started_at": "2026-10-30T17:46:30.680941Z",
  "completed_at": "2026-10-30T17:46:30.886447Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/8ff4c6c7-9701-40c7-ad87-5ad38f925368` → **200**

```json
{
  "id": "8ff4c6c7-9701-40c7-ad87-5ad38f925368",
  "short_number": 8,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "8587a9bc-1675-42c4-b1ab-1454783873d3",
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
    "id": "f3b8eeff-0651-4ccc-841a-afe956bdc8e4",
    "order_id": "8ff4c6c7-9701-40c7-ad87-5ad38f925368",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "ca47d21d-0ba2-4cbc-a051-794eaebbe301",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T17:46:22.11444Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8ff4c6c7-9701-40c7-ad87-5ad38f925368` → **200**

```json
{
  "id": "8ff4c6c7-9701-40c7-ad87-5ad38f925368",
  "short_number": 8,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "8587a9bc-1675-42c4-b1ab-1454783873d3",
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
    "id": "f3b8eeff-0651-4ccc-841a-afe956bdc8e4",
    "order_id": "8ff4c6c7-9701-40c7-ad87-5ad38f925368",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "ca47d21d-0ba2-4cbc-a051-794eaebbe301",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T17:46:22.11444Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8ff4c6c7-9701-40c7-ad87-5ad38f925368` → **200**

```json
{
  "id": "8ff4c6c7-9701-40c7-ad87-5ad38f925368",
  "short_number": 8,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "8587a9bc-1675-42c4-b1ab-1454783873d3",
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
    "id": "f3b8eeff-0651-4ccc-841a-afe956bdc8e4",
    "order_id": "8ff4c6c7-9701-40c7-ad87-5ad38f925368",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "ca47d21d-0ba2-4cbc-a051-794eaebbe301",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T17:46:22.11444Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8ff4c6c7-9701-40c7-ad87-5ad38f925368` → **200**

```json
{
  "id": "8ff4c6c7-9701-40c7-ad87-5ad38f925368",
  "short_number": 8,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "8587a9bc-1675-42c4-b1ab-1454783873d3",
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
    "id": "f3b8eeff-0651-4ccc-841a-afe956bdc8e4",
    "order_id": "8ff4c6c7-9701-40c7-ad87-5ad38f925368",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "ca47d21d-0ba2-4cbc-a051-794eaebbe301",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T17:46:22.11444Z",
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

`GET /api/rider/v1/orders/8ff4c6c7-9701-40c7-ad87-5ad38f925368/tip` → **200**

```json
{
  "order_id": "8ff4c6c7-9701-40c7-ad87-5ad38f925368",
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
  "available_until": "2026-10-31T17:46:30.886447Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/8ff4c6c7-9701-40c7-ad87-5ad38f925368/tip` → **201**

```json
{
  "command_id": "b4ba94a6-068a-4243-8826-9585f1b89544",
  "amount_minor": 2500
}
```

```json
{
  "id": "d9b211f3-b247-4629-8c5e-96faf4c26bf9",
  "order_id": "8ff4c6c7-9701-40c7-ad87-5ad38f925368",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T17:46:35.230764Z"
}
```

`GET /api/rider/v1/orders/8ff4c6c7-9701-40c7-ad87-5ad38f925368/tip` → **200**

```json
{
  "order_id": "8ff4c6c7-9701-40c7-ad87-5ad38f925368",
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
  "available_until": "2026-10-31T17:46:30.886447Z",
  "open": false,
  "tip": {
    "id": "d9b211f3-b247-4629-8c5e-96faf4c26bf9",
    "order_id": "8ff4c6c7-9701-40c7-ad87-5ad38f925368",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-30T17:46:35.230764Z"
  }
}
```

`GET /api/rider/v1/orders/8ff4c6c7-9701-40c7-ad87-5ad38f925368/tip` → **200**

```json
{
  "order_id": "8ff4c6c7-9701-40c7-ad87-5ad38f925368",
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
  "available_until": "2026-10-31T17:46:30.886447Z",
  "open": false,
  "tip": {
    "id": "d9b211f3-b247-4629-8c5e-96faf4c26bf9",
    "order_id": "8ff4c6c7-9701-40c7-ad87-5ad38f925368",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T17:46:35.230764Z"
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
      "id": "159a0364-f718-4872-9f86-e2d990b01040",
      "at": "2026-10-30T17:46:31.790514Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "8ff4c6c7-9701-40c7-ad87-5ad38f925368",
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
      "id": "4d7aaa3c-b56d-4304-b2ae-c4773c55255a",
      "at": "2026-10-30T17:46:36.82893Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "8ff4c6c7-9701-40c7-ad87-5ad38f925368",
      "counterpart_id": null
    },
    {
      "id": "159a0364-f718-4872-9f86-e2d990b01040",
      "at": "2026-10-30T17:46:31.790514Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "8ff4c6c7-9701-40c7-ad87-5ad38f925368",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6a63a990-aea8-4932-ba22-8970366600db",
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
  "id": "8cb4e688-bcdd-421f-8d04-6d4bf4937cc3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T17:51:38.173817Z",
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
  "session_id": "d1a5905c-12d7-43c4-b173-0b2fb2c609d3",
  "subject": {
    "type": "STAFF",
    "id": "c1a6f303-45cb-4836-9719-3861c6b8ed9b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMWE2ZjMwMy00NWNiLTQ4MzYtOTcxOS0zODYxYzZiOGVkOWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODMyOTgsImlhdCI6MTc5MzM4MjM5OCwianRpIjoiNmY5OGY1MGYtNDhmMy00NjEwLTljODUtNDJlYzZkNWYwNmE1Iiwic2lkIjoiZDFhNTkwNWMtMTJkNy00M2M0LWIxNzMtMGIyZmIyYzYwOWQzIn0.vQlHmTIbWqqsTYhBKpVQMZC2-i02hZBaw77Mg_kBjYw",
  "access_expires_at": "2026-10-30T18:01:38.577439479Z",
  "refresh_token": "y1awaNBWqAQ-1tgfCet7DeUaCuc5j-bHaKL9kFkTXhM",
  "refresh_expires_at": "2026-10-31T05:46:38.577107687Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380734535165` → **200**

```json
{
  "client_id": "8587a9bc-1675-42c4-b1ab-1454783873d3"
}
```

`POST /api/admin/v1/rider-wallets/8587a9bc-1675-42c4-b1ab-1454783873d3/top-ups` → **201**

```json
{
  "command_id": "6453d62a-7d09-42e8-9a96-19a31ee4dc1e",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "8587a9bc-1675-42c4-b1ab-1454783873d3",
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
      "id": "31fb6714-2431-4169-bf17-207f015ce9fa",
      "at": "2026-10-30T17:46:38.945787Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "c1a6f303-45cb-4836-9719-3861c6b8ed9b",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "6bb8c93e-e062-4718-817e-1f5cb2d22944",
  "quote_id": "8cb4e688-bcdd-421f-8d04-6d4bf4937cc3",
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
  "id": "6f208c9a-1997-46dc-85f0-0108e3b1d4cf",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8587a9bc-1675-42c4-b1ab-1454783873d3",
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
  "created_at": "2026-10-30T17:46:39.145941Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6f208c9a-1997-46dc-85f0-0108e3b1d4cf` → **200**

```json
{
  "id": "6f208c9a-1997-46dc-85f0-0108e3b1d4cf",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8587a9bc-1675-42c4-b1ab-1454783873d3",
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
  "created_at": "2026-10-30T17:46:39.145941Z",
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
    "id": "b2cac245-c139-4f5b-9af6-81e24ca19cee",
    "order_id": "6f208c9a-1997-46dc-85f0-0108e3b1d4cf",
    "expires_at": "2026-10-30T17:46:54.148871Z",
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

`POST /api/driver/v1/offers/b2cac245-c139-4f5b-9af6-81e24ca19cee/accept` → **200**

```json
{
  "command_id": "4f8a5f33-3aeb-4668-bbcf-1da25331eea3"
}
```

```json
{
  "id": "175928ba-684e-4e14-beb5-d90a69703d87",
  "order_id": "6f208c9a-1997-46dc-85f0-0108e3b1d4cf",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a582db0f-b6e4-440d-b0f9-f5f6c9a7d26c",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a582db0f-b6e4-440d-b0f9-f5f6c9a7d26c",
  "order_id": "6f208c9a-1997-46dc-85f0-0108e3b1d4cf",
  "assignment_id": "175928ba-684e-4e14-beb5-d90a69703d87",
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

`POST /api/driver/v1/work-sessions/fa314eca-932b-4bcc-b8b2-0b7dfb9e5dd2/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T17:46:40Z",
    "sequence": 1793382400104
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "fa314eca-932b-4bcc-b8b2-0b7dfb9e5dd2",
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
  "last_heartbeat_at": "2026-10-30T17:46:40.119949Z",
  "last_location_at": "2026-10-30T17:46:40.119949Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/a582db0f-b6e4-440d-b0f9-f5f6c9a7d26c/arrive` → **200**

```json
{
  "command_id": "b29bd5c5-109d-4280-8379-95bce4ce5c4f",
  "expected_version": 0
}
```

```json
{
  "id": "a582db0f-b6e4-440d-b0f9-f5f6c9a7d26c",
  "order_id": "6f208c9a-1997-46dc-85f0-0108e3b1d4cf",
  "assignment_id": "175928ba-684e-4e14-beb5-d90a69703d87",
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
  "arrived_at": "2026-10-30T17:46:40.308669Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/a582db0f-b6e4-440d-b0f9-f5f6c9a7d26c/start` → **200**

```json
{
  "command_id": "e8de8288-e800-4a76-acec-e9818d86634e",
  "expected_version": 1
}
```

```json
{
  "id": "a582db0f-b6e4-440d-b0f9-f5f6c9a7d26c",
  "order_id": "6f208c9a-1997-46dc-85f0-0108e3b1d4cf",
  "assignment_id": "175928ba-684e-4e14-beb5-d90a69703d87",
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
  "arrived_at": "2026-10-30T17:46:40.308669Z",
  "started_at": "2026-10-30T17:46:40.500804Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/a582db0f-b6e4-440d-b0f9-f5f6c9a7d26c/complete` → **200**

```json
{
  "command_id": "e6ee7927-d7fc-45e0-922e-609161bd4146",
  "expected_version": 2,
  "reported_at": "2026-10-30T17:46:40Z",
  "cash_received": true
}
```

```json
{
  "id": "a582db0f-b6e4-440d-b0f9-f5f6c9a7d26c",
  "order_id": "6f208c9a-1997-46dc-85f0-0108e3b1d4cf",
  "assignment_id": "175928ba-684e-4e14-beb5-d90a69703d87",
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
  "arrived_at": "2026-10-30T17:46:40.308669Z",
  "started_at": "2026-10-30T17:46:40.500804Z",
  "completed_at": "2026-10-30T17:46:40.700954Z",
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
  "client_id": "8587a9bc-1675-42c4-b1ab-1454783873d3",
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
      "id": "66ecb597-6da3-44e5-b7e8-9b69d35ead2f",
      "at": "2026-10-30T17:46:40.881036Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -16297,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "6f208c9a-1997-46dc-85f0-0108e3b1d4cf"
    },
    {
      "id": "31fb6714-2431-4169-bf17-207f015ce9fa",
      "at": "2026-10-30T17:46:38.945787Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "c1a6f303-45cb-4836-9719-3861c6b8ed9b",
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
      "balance_minor": 30204,
      "debt_limit_minor": null,
      "blocked": false
    }
  ]
}
```

## The rider tips 15 % on the same card; all of it goes to Andrii

`GET /api/rider/v1/orders/6f208c9a-1997-46dc-85f0-0108e3b1d4cf/tip` → **200**

```json
{
  "order_id": "6f208c9a-1997-46dc-85f0-0108e3b1d4cf",
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
  "available_until": "2026-10-31T17:46:40.700954Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/6f208c9a-1997-46dc-85f0-0108e3b1d4cf/tip` → **201**

```json
{
  "command_id": "836c8a5b-78b2-407e-b652-b744ecdc3200",
  "amount_minor": 2500
}
```

```json
{
  "id": "f47cf05c-061e-4cbd-8149-f37bff858ccd",
  "order_id": "6f208c9a-1997-46dc-85f0-0108e3b1d4cf",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T17:46:41.466761Z"
}
```

`GET /api/rider/v1/orders/6f208c9a-1997-46dc-85f0-0108e3b1d4cf/tip` → **200**

```json
{
  "order_id": "6f208c9a-1997-46dc-85f0-0108e3b1d4cf",
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
  "available_until": "2026-10-31T17:46:40.700954Z",
  "open": false,
  "tip": {
    "id": "f47cf05c-061e-4cbd-8149-f37bff858ccd",
    "order_id": "6f208c9a-1997-46dc-85f0-0108e3b1d4cf",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-30T17:46:41.466761Z"
  }
}
```

`GET /api/rider/v1/orders/6f208c9a-1997-46dc-85f0-0108e3b1d4cf/tip` → **200**

```json
{
  "order_id": "6f208c9a-1997-46dc-85f0-0108e3b1d4cf",
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
  "available_until": "2026-10-31T17:46:40.700954Z",
  "open": false,
  "tip": {
    "id": "f47cf05c-061e-4cbd-8149-f37bff858ccd",
    "order_id": "6f208c9a-1997-46dc-85f0-0108e3b1d4cf",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T17:46:41.466761Z"
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
      "id": "cc92bf91-bcb1-4420-bd42-98419704b2af",
      "at": "2026-10-30T17:46:42.893813Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "6f208c9a-1997-46dc-85f0-0108e3b1d4cf",
      "counterpart_id": null
    },
    {
      "id": "ee28117c-8d27-4384-b6e5-c7caeb9e391c",
      "at": "2026-10-30T17:46:40.876463Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "6f208c9a-1997-46dc-85f0-0108e3b1d4cf",
      "counterpart_id": null
    },
    {
      "id": "4d7aaa3c-b56d-4304-b2ae-c4773c55255a",
      "at": "2026-10-30T17:46:36.82893Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "8ff4c6c7-9701-40c7-ad87-5ad38f925368",
      "counterpart_id": null
    },
    {
      "id": "159a0364-f718-4872-9f86-e2d990b01040",
      "at": "2026-10-30T17:46:31.790514Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "8ff4c6c7-9701-40c7-ad87-5ad38f925368",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "fa314eca-932b-4bcc-b8b2-0b7dfb9e5dd2",
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
  "last_heartbeat_at": "2026-10-30T17:46:40.119949Z",
  "last_location_at": "2026-10-30T17:46:40.119949Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/fa314eca-932b-4bcc-b8b2-0b7dfb9e5dd2/close` → **200**

```json
{
  "command_id": "a981e36e-96b8-4d18-815c-8ebdca0a2e3c",
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

Done: card order 6f208c9a-1997-46dc-85f0-0108e3b1d4cf.

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
  "phone": "+380733191720",
  "device_ref": "sandbox-28147"
}
```

```json
{
  "challenge_id": "5fb39373-2138-485d-9a17-26cafed76808",
  "expires_at": "2026-10-30T17:51:43.753615645Z",
  "resend_available_at": "2026-10-30T17:46:44.753615645Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380733191720` → **200**

```json
{
  "phone": "+380733191720",
  "audience": "CLIENT",
  "code": "099301",
  "sent_at": "2026-10-30T17:46:43.755392695Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5fb39373-2138-485d-9a17-26cafed76808",
  "code": "099301",
  "device_ref": "sandbox-28147"
}
```

```json
{
  "session_id": "7279bce9-dfc5-4297-9f9f-621881801844",
  "subject": {
    "type": "CLIENT",
    "id": "8053d520-baad-4f46-a4b3-dcd704dee166"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4MDUzZDUyMC1iYWFkLTRmNDYtYTRiMy1kY2Q3MDRkZWUxNjYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzgzMzAzLCJpYXQiOjE3OTMzODI0MDMsImp0aSI6ImQ4Y2U4YTUwLTNiNGItNDlkMi1hYTNlLTkzNDc0ZDZiNGMyZiIsInNpZCI6IjcyNzliY2U5LWRmYzUtNDI5Ny05ZjlmLTYyMTg4MTgwMTg0NCJ9.AnvKLTy_0Apw5ybxTlZK4RcI6X3z2s9YT4LUwX9-wYE",
  "access_expires_at": "2026-10-30T18:01:43.95219135Z",
  "refresh_token": "HuYfmg6YN6bE8TzM61UlvRSy-TZCA-dGqxyY3TkLL5o",
  "refresh_expires_at": "2026-11-29T17:46:43.951803763Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "efed51e9-a8c6-409e-ba28-06564df367f5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "62da53bf-c00f-4b33-9f09-a587a7a9a5d0",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-62da53bf-c00f-4b33-9f09-a587a7a9a5d0",
    "orderDate": "1793382404",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "60451050b46051ddacef7434e3278bc2",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=62da53bf-c00f-4b33-9f09-a587a7a9a5d0",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380733191720"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=62da53bf-c00f-4b33-9f09-a587a7a9a5d0",
  "created_at": "2026-10-30T17:46:44.14145Z",
  "expires_at": "2026-10-30T18:16:44.14145Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/62da53bf-c00f-4b33-9f09-a587a7a9a5d0` → **200**

```json
{
  "id": "62da53bf-c00f-4b33-9f09-a587a7a9a5d0",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T17:46:44.14145Z",
  "expires_at": "2026-10-30T18:16:44.14145Z",
  "completed_at": "2026-10-30T17:46:44.334938Z",
  "masked_pan": "41****0574",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "8053d520-baad-4f46-a4b3-dcd704dee166",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "8053d520-baad-4f46-a4b3-dcd704dee166",
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
      "id": "34335d72-75a2-4b4e-b620-f9179c1bf70d",
      "at": "2026-10-30T17:46:44.906101Z",
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
  "client_id": "8053d520-baad-4f46-a4b3-dcd704dee166",
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
      "id": "34335d72-75a2-4b4e-b620-f9179c1bf70d",
      "at": "2026-10-30T17:46:44.906101Z",
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
  "device_ref": "sandbox-3447"
}
```

```json
{
  "challenge_id": "aaf7940d-9ae6-4257-9a60-3392faa39c76",
  "expires_at": "2026-10-30T17:51:46.080125684Z",
  "resend_available_at": "2026-10-30T17:46:47.080125684Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "209707",
  "sent_at": "2026-10-30T17:46:46.082046081Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "aaf7940d-9ae6-4257-9a60-3392faa39c76",
  "code": "209707",
  "device_ref": "sandbox-3447"
}
```

```json
{
  "session_id": "ef428f16-6704-4cdd-bf06-fc51bdea3830",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4MzMwNiwiaWF0IjoxNzkzMzgyNDA2LCJqdGkiOiJkNjU2OGYzYy02ZTk1LTQ4MWQtYWI1Ni0zZjBjNjBhMzFhYjkiLCJzaWQiOiJlZjQyOGYxNi02NzA0LTRjZGQtYmYwNi1mYzUxYmRlYTM4MzAifQ.KfYFlhpzfs28dD_P7LfrkhnTYVHl-U4Y6K_qUXbHkas",
  "access_expires_at": "2026-10-30T18:01:46.283552112Z",
  "refresh_token": "npry-xSRInOtdE07ZDlKQ7IMr6Ud7lbVyZV_gCDdsvQ",
  "refresh_expires_at": "2026-11-29T17:46:46.283109682Z",
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
  "command_id": "12b2a31e-1e88-4aa9-8539-bbb2c13465fd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "3fe8128b-3cb5-4f56-9a58-1405f8ac9119",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-3fe8128b-3cb5-4f56-9a58-1405f8ac9119",
    "orderDate": "1793382406",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "5842484a18ff3eefa6ff7da654c80e0d",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=3fe8128b-3cb5-4f56-9a58-1405f8ac9119",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=3fe8128b-3cb5-4f56-9a58-1405f8ac9119",
  "created_at": "2026-10-30T17:46:46.646201Z",
  "expires_at": "2026-10-30T18:16:46.646201Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/3fe8128b-3cb5-4f56-9a58-1405f8ac9119` → **200**

```json
{
  "id": "3fe8128b-3cb5-4f56-9a58-1405f8ac9119",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T17:46:46.646201Z",
  "expires_at": "2026-10-30T18:16:46.646201Z",
  "completed_at": "2026-10-30T17:46:46.830068Z",
  "masked_pan": "41****9439",
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
      "id": "85153e39-d2b9-4e9e-8fe6-d6625715e637",
      "at": "2026-10-30T17:46:46.910696Z",
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
  "command_id": "b69227cf-76bb-474e-aadb-a7919b7dba81",
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
  "correlation_id": "877f57b4-0d98-476f-9266-7ea2eeb9a7e5"
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
  "device_ref": "sandbox-6208"
}
```

```json
{
  "challenge_id": "b6216473-9614-4e6c-bd9d-050547d12af1",
  "expires_at": "2026-10-30T17:51:47.396194154Z",
  "resend_available_at": "2026-10-30T17:46:48.396194154Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "139995",
  "sent_at": "2026-10-30T17:46:47.398089143Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b6216473-9614-4e6c-bd9d-050547d12af1",
  "code": "139995",
  "device_ref": "sandbox-6208"
}
```

```json
{
  "session_id": "9271403d-0b2d-4d21-8207-242b5a88cf0e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4MzMwNywiaWF0IjoxNzkzMzgyNDA3LCJqdGkiOiJkNzQwNDNlNS1iY2ExLTQwNWUtOWY0Mi0wZWI3ZGRiNGViYjgiLCJzaWQiOiI5MjcxNDAzZC0wYjJkLTRkMjEtODIwNy0yNDJiNWE4OGNmMGUifQ.5xkVn91FgcVsrjW3l1FqLqSK20YS0tsWLvYVwf3_cJk",
  "access_expires_at": "2026-10-30T18:01:47.599536238Z",
  "refresh_token": "zAoKT6U-wXc9QUv1IlBJZO6MJlRNE8wJ01CWxdWoOZ4",
  "refresh_expires_at": "2026-11-29T17:46:47.598865643Z",
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
  "command_id": "748eaee5-fd74-484f-8b3c-c91b8d2605dd",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T17:46:48Z",
    "sequence": 1793382408186
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "08f59f13-c86a-4092-abaf-baf951f369cf",
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
  "last_heartbeat_at": "2026-10-30T17:46:48.033738Z",
  "last_location_at": "2026-10-30T17:46:48.033738Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A rider orders for cash

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631702892",
  "device_ref": "sandbox-30960"
}
```

```json
{
  "challenge_id": "b66372a1-bc54-4f55-864d-cd4b32044dc8",
  "expires_at": "2026-10-30T17:51:48.225022985Z",
  "resend_available_at": "2026-10-30T17:46:49.225022985Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631702892` → **200**

```json
{
  "phone": "+380631702892",
  "audience": "CLIENT",
  "code": "446239",
  "sent_at": "2026-10-30T17:46:48.226833887Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b66372a1-bc54-4f55-864d-cd4b32044dc8",
  "code": "446239",
  "device_ref": "sandbox-30960"
}
```

```json
{
  "session_id": "79923ee1-b352-4270-ae23-871b95ded787",
  "subject": {
    "type": "CLIENT",
    "id": "60fd6596-244e-4e09-afc5-9ff412609804"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MGZkNjU5Ni0yNDRlLTRlMDktYWZjNS05ZmY0MTI2MDk4MDQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzgzMzA4LCJpYXQiOjE3OTMzODI0MDgsImp0aSI6IjYyMDUyZDRmLWQwOTktNGVmNy05YTg0LWExYjkxOTdjYjA3MCIsInNpZCI6Ijc5OTIzZWUxLWIzNTItNDI3MC1hZTIzLTg3MWI5NWRlZDc4NyJ9.7gOlrs2nQ6OOZ-yhoU-cf-361Tr4kzGBWVav2Wyux0E",
  "access_expires_at": "2026-10-30T18:01:48.437719739Z",
  "refresh_token": "4j1rFsq1atHv5KZNIdzL9tWI4YO2uIhGdxoalan4ip4",
  "refresh_expires_at": "2026-11-29T17:46:48.437237639Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "dc502ba8-b88a-47da-a93b-3bddce690c66",
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
  "id": "3400b6f1-a421-4204-9925-287906c05f7d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T17:51:48.634722Z",
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
  "command_id": "40314384-f16f-4284-a577-db3e72bd7f51",
  "quote_id": "3400b6f1-a421-4204-9925-287906c05f7d",
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
  "id": "576ab33d-a8e9-4838-9e73-a34ed7e97a02",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "60fd6596-244e-4e09-afc5-9ff412609804",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T17:46:48.827104Z",
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
    "id": "1fb0c5d9-f136-45b8-ac34-15e3bfe30bfe",
    "order_id": "576ab33d-a8e9-4838-9e73-a34ed7e97a02",
    "expires_at": "2026-10-30T17:47:03.828813Z",
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

`POST /api/driver/v1/offers/1fb0c5d9-f136-45b8-ac34-15e3bfe30bfe/accept` → **200**

```json
{
  "command_id": "08e087a2-d0c3-4446-9a8e-512f030f9669"
}
```

```json
{
  "id": "00a85532-b1c2-48ca-bc15-ef7e1be7f33a",
  "order_id": "576ab33d-a8e9-4838-9e73-a34ed7e97a02",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "4120f834-d384-4740-b677-4daf6c0ce16d",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "4120f834-d384-4740-b677-4daf6c0ce16d",
  "order_id": "576ab33d-a8e9-4838-9e73-a34ed7e97a02",
  "assignment_id": "00a85532-b1c2-48ca-bc15-ef7e1be7f33a",
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

(the car drives 1 s to the next point)

`POST /api/driver/v1/work-sessions/08f59f13-c86a-4092-abaf-baf951f369cf/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T17:46:50Z",
    "sequence": 1793382410585
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "08f59f13-c86a-4092-abaf-baf951f369cf",
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
  "last_heartbeat_at": "2026-10-30T17:46:50.600678Z",
  "last_location_at": "2026-10-30T17:46:50.600678Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/4120f834-d384-4740-b677-4daf6c0ce16d/arrive` → **200**

```json
{
  "command_id": "768873eb-b401-485f-af2f-cb2b62ac5cfe",
  "expected_version": 0
}
```

```json
{
  "id": "4120f834-d384-4740-b677-4daf6c0ce16d",
  "order_id": "576ab33d-a8e9-4838-9e73-a34ed7e97a02",
  "assignment_id": "00a85532-b1c2-48ca-bc15-ef7e1be7f33a",
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
  "arrived_at": "2026-10-30T17:46:50.794503Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/4120f834-d384-4740-b677-4daf6c0ce16d/start` → **200**

```json
{
  "command_id": "63bd24ef-aad3-4355-ab76-419beff6ce2e",
  "expected_version": 1
}
```

```json
{
  "id": "4120f834-d384-4740-b677-4daf6c0ce16d",
  "order_id": "576ab33d-a8e9-4838-9e73-a34ed7e97a02",
  "assignment_id": "00a85532-b1c2-48ca-bc15-ef7e1be7f33a",
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
  "arrived_at": "2026-10-30T17:46:50.794503Z",
  "started_at": "2026-10-30T17:46:50.994153Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/4120f834-d384-4740-b677-4daf6c0ce16d/complete` → **200**

```json
{
  "command_id": "8e387ecb-e12b-4789-8ffb-d3f37b24a0ce",
  "expected_version": 2,
  "reported_at": "2026-10-30T17:46:51Z",
  "cash_received": false
}
```

```json
{
  "id": "4120f834-d384-4740-b677-4daf6c0ce16d",
  "order_id": "576ab33d-a8e9-4838-9e73-a34ed7e97a02",
  "assignment_id": "00a85532-b1c2-48ca-bc15-ef7e1be7f33a",
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
  "arrived_at": "2026-10-30T17:46:50.794503Z",
  "started_at": "2026-10-30T17:46:50.994153Z",
  "completed_at": "2026-10-30T17:46:51.191536Z",
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
  "session_id": "7ad38fdf-009b-4ad1-8e66-961f51470737",
  "subject": {
    "type": "STAFF",
    "id": "c1a6f303-45cb-4836-9719-3861c6b8ed9b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMWE2ZjMwMy00NWNiLTQ4MzYtOTcxOS0zODYxYzZiOGVkOWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODMzMTEsImlhdCI6MTc5MzM4MjQxMSwianRpIjoiYzUwZDQ1MTktMzdhNi00MzIyLTk2ZjctMzgwODk0MDQ5YWRjIiwic2lkIjoiN2FkMzhmZGYtMDA5Yi00YWQxLThlNjYtOTYxZjUxNDcwNzM3In0.R_6Z0BNbnojvsp5CLy2-Ord8KRR_SttkBi_n7pdIB0c",
  "access_expires_at": "2026-10-30T18:01:51.588113792Z",
  "refresh_token": "WLrzw6In6rQK_znBHvvX7g9JkZHHla6YKgs7U05e1qs",
  "refresh_expires_at": "2026-10-31T05:46:51.587450938Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/576ab33d-a8e9-4838-9e73-a34ed7e97a02/cash-dispute` → **404**

```json
{
  "instance": "/api/admin/v1/orders/576ab33d-a8e9-4838-9e73-a34ed7e97a02/cash-dispute",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "249c81c1-32bc-4066-97fd-f6b9978ceea7"
}
```

`GET /api/admin/v1/orders/576ab33d-a8e9-4838-9e73-a34ed7e97a02/cash-dispute` → **200**

```json
{
  "order_id": "576ab33d-a8e9-4838-9e73-a34ed7e97a02",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "60fd6596-244e-4e09-afc5-9ff412609804",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T17:46:51.959485Z",
  "decide_by": "2026-11-13T17:46:51.959485Z",
  "decision": null,
  "decided_by": null,
  "reason": null,
  "decided_at": null,
  "version": 1
}
```

Dispute: {"held_minor":0,"rider_debt_minor":10517,"decide_by":"2026-11-13T17:46:51.959485Z","decision":null}

`GET /api/admin/v1/cash-disputes` → **200**

```json
{
  "disputes": [
    {
      "order_id": "576ab33d-a8e9-4838-9e73-a34ed7e97a02",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "payer_client_id": "60fd6596-244e-4e09-afc5-9ff412609804",
      "currency": "UAH",
      "held_minor": 0,
      "rider_debt_minor": 10517,
      "opened_at": "2026-10-30T17:46:51.959485Z",
      "decide_by": "2026-11-13T17:46:51.959485Z",
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

`POST /api/admin/v1/orders/576ab33d-a8e9-4838-9e73-a34ed7e97a02/cash-dispute/decide` → **400**

```json
{
  "command_id": "625c3ffd-e720-44dc-8da3-161e309833e8",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/orders/576ab33d-a8e9-4838-9e73-a34ed7e97a02/cash-dispute/decide",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "c7ee8418-6136-4f09-8a32-f3ae305b0597",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

`POST /api/admin/v1/orders/576ab33d-a8e9-4838-9e73-a34ed7e97a02/cash-dispute/decide` → **200**

```json
{
  "command_id": "f3b7f96a-6861-4ea2-a40d-8298dbedbfb3",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": "The rider does not answer calls"
}
```

```json
{
  "order_id": "576ab33d-a8e9-4838-9e73-a34ed7e97a02",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "60fd6596-244e-4e09-afc5-9ff412609804",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T17:46:51.959485Z",
  "decide_by": "2026-11-13T17:46:51.959485Z",
  "decision": "PAY_DRIVER",
  "decided_by": "c1a6f303-45cb-4836-9719-3861c6b8ed9b",
  "reason": "The rider does not answer calls",
  "decided_at": "2026-10-30T17:46:53.596364Z",
  "version": 2
}
```

`POST /api/admin/v1/orders/576ab33d-a8e9-4838-9e73-a34ed7e97a02/cash-dispute/decide` → **409**

```json
{
  "command_id": "966bc0d4-3af1-4510-84a9-7302efcba3d0",
  "expected_version": 2,
  "decision": "RIDER_PAID",
  "reason": "Again"
}
```

```json
{
  "instance": "/api/admin/v1/orders/576ab33d-a8e9-4838-9e73-a34ed7e97a02/cash-dispute/decide",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "4461a470-59a2-4bfb-935c-9c364edb5992"
}
```

Done: an unpaid cash trip became a dispute and was decided once.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "08f59f13-c86a-4092-abaf-baf951f369cf",
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
  "last_heartbeat_at": "2026-10-30T17:46:50.600678Z",
  "last_location_at": "2026-10-30T17:46:50.600678Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/08f59f13-c86a-4092-abaf-baf951f369cf/close` → **200**

```json
{
  "command_id": "cf04e5ee-0847-459b-970f-9467fe30c4ca",
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
  "phone": "+380735557154",
  "device_ref": "sandbox-4617"
}
```

```json
{
  "challenge_id": "88eb1b8d-09d0-4bc8-be78-52db4502df36",
  "expires_at": "2026-10-30T17:51:54.362084282Z",
  "resend_available_at": "2026-10-30T17:46:55.362084282Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380735557154` → **200**

```json
{
  "phone": "+380735557154",
  "audience": "CLIENT",
  "code": "457485",
  "sent_at": "2026-10-30T17:46:54.364043401Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "88eb1b8d-09d0-4bc8-be78-52db4502df36",
  "code": "457485",
  "device_ref": "sandbox-4617"
}
```

```json
{
  "session_id": "45fe7fbf-0768-4f0a-bcf0-edeac294ba53",
  "subject": {
    "type": "CLIENT",
    "id": "89a5c189-33d5-4258-b567-ffb0c70351ca"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4OWE1YzE4OS0zM2Q1LTQyNTgtYjU2Ny1mZmIwYzcwMzUxY2EiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzgzMzE0LCJpYXQiOjE3OTMzODI0MTQsImp0aSI6IjI1NWRmMTdmLTlkNWItNDg2OS1iM2M2LTE0NWYyOWNjMDcxOCIsInNpZCI6IjQ1ZmU3ZmJmLTA3NjgtNGYwYS1iY2YwLWVkZWFjMjk0YmE1MyJ9.fTN0qaw7fsMi4w2DyW2Fz9xqWrNN0YEPDISLG-nfiJE",
  "access_expires_at": "2026-10-30T18:01:54.581407238Z",
  "refresh_token": "yGZJfqm3Ko-G9BOObWYvKtOt77FA4RkIL2WC8EnTbzE",
  "refresh_expires_at": "2026-11-29T17:46:54.581103098Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "21c93e49-9353-499f-99cc-bbb4015ff26f",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "9f47a864-39d3-4f83-83c2-f9a50d7cb955",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-9f47a864-39d3-4f83-83c2-f9a50d7cb955",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "16ab5becd15f6bd93d5c65f02eb7bba9",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=9f47a864-39d3-4f83-83c2-f9a50d7cb955",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380735557154"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=9f47a864-39d3-4f83-83c2-f9a50d7cb955",
  "expires_at": "2026-10-30T18:16:54.767886Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/9f47a864-39d3-4f83-83c2-f9a50d7cb955` → **200**

```json
{
  "id": "9f47a864-39d3-4f83-83c2-f9a50d7cb955",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T18:16:54.767886Z",
  "card": {
    "id": "e1e61e03-aebd-4809-a583-36ffc5128c2a",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****3902",
    "card_type": "Visa",
    "created_at": "2026-10-30T17:46:55.003669Z"
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
  "device_ref": "sandbox-24885"
}
```

```json
{
  "challenge_id": "65660d56-d160-4104-958b-f8231a192a54",
  "expires_at": "2026-10-30T17:51:55.211522601Z",
  "resend_available_at": "2026-10-30T17:46:56.211522601Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "109202",
  "sent_at": "2026-10-30T17:46:55.21340119Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "65660d56-d160-4104-958b-f8231a192a54",
  "code": "109202",
  "device_ref": "sandbox-24885"
}
```

```json
{
  "session_id": "10f41dde-f13b-486a-aa24-f4ac138e8ed0",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4MzMxNSwiaWF0IjoxNzkzMzgyNDE1LCJqdGkiOiIyZjRlYWJkOS0wOTUwLTQ2OTgtYjI2YS1lYzA2MmJmN2E4OTEiLCJzaWQiOiIxMGY0MWRkZS1mMTNiLTQ4NmEtYWEyNC1mNGFjMTM4ZThlZDAifQ.0u6IWl7Y7eYvxSBrRvxL5RXY9LLIgjA5bPCLn2Gzp0E",
  "access_expires_at": "2026-10-30T18:01:55.420138536Z",
  "refresh_token": "2T1HhFEb1jWgmOVdl-np6rj81Py2Xz8Jc4Np--qTO8I",
  "refresh_expires_at": "2026-11-29T17:46:55.419730213Z",
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
  "command_id": "917e3dea-c114-4e67-addc-cc1a97187c83",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T17:46:55Z",
    "sequence": 1793382415796
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "f51c7139-5cb8-4d20-9ecf-a6eba7c4b214",
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
  "last_heartbeat_at": "2026-10-30T17:46:55.811864Z",
  "last_location_at": "2026-10-30T17:46:55.811864Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A card ride; on the way both write numbers into the chat

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "9d15663e-e151-4b61-b9fa-79438cb9d072",
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
  "id": "e04420d7-28a6-48bf-b132-48a45cfaa1f0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T17:51:56.005446Z",
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
  "command_id": "a3d4af0d-8bd4-4b50-ae90-01d5a4b2a1db",
  "quote_id": "e04420d7-28a6-48bf-b132-48a45cfaa1f0",
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
  "id": "674a4e92-604b-4df3-9653-6cace1f9d0e1",
  "short_number": 11,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "89a5c189-33d5-4258-b567-ffb0c70351ca",
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
  "created_at": "2026-10-30T17:46:56.205189Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/674a4e92-604b-4df3-9653-6cace1f9d0e1` → **200**

```json
{
  "id": "674a4e92-604b-4df3-9653-6cace1f9d0e1",
  "short_number": 11,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "89a5c189-33d5-4258-b567-ffb0c70351ca",
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
  "created_at": "2026-10-30T17:46:56.205189Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/674a4e92-604b-4df3-9653-6cace1f9d0e1` → **200**

```json
{
  "id": "674a4e92-604b-4df3-9653-6cace1f9d0e1",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "89a5c189-33d5-4258-b567-ffb0c70351ca",
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
  "created_at": "2026-10-30T17:46:56.205189Z",
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
    "id": "e9deb55a-ed57-4994-b0ee-f982e16d8d51",
    "order_id": "674a4e92-604b-4df3-9653-6cace1f9d0e1",
    "expires_at": "2026-10-30T17:47:11.995158Z",
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

`POST /api/driver/v1/offers/e9deb55a-ed57-4994-b0ee-f982e16d8d51/accept` → **200**

```json
{
  "command_id": "ff719212-6765-408c-9074-f4091d5f5942"
}
```

```json
{
  "id": "e290c323-c342-4fd2-b2e7-077f228bc94f",
  "order_id": "674a4e92-604b-4df3-9653-6cace1f9d0e1",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "ba6d555c-b3e8-480e-8b6b-fd691ef5bd03",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "ba6d555c-b3e8-480e-8b6b-fd691ef5bd03",
  "order_id": "674a4e92-604b-4df3-9653-6cace1f9d0e1",
  "assignment_id": "e290c323-c342-4fd2-b2e7-077f228bc94f",
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

`POST /api/rider/v1/orders/674a4e92-604b-4df3-9653-6cace1f9d0e1/messages` → **201**

```json
{
  "command_id": "b63f9b1a-8064-4b7e-9403-989571fb3c81",
  "body": "Я біля входу, мій номер +380735557154, картка 4111 1111 1111 1111"
}
```

```json
{
  "id": "b4b3e9a1-27f6-4b99-9603-674895f92f1a",
  "order_id": "674a4e92-604b-4df3-9653-6cace1f9d0e1",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу, мій номер +380735557154, картка 4111 1111 1111 1111",
  "sent_at": "2026-10-30T17:46:58.413577458Z"
}
```

`POST /api/driver/v1/trips/ba6d555c-b3e8-480e-8b6b-fd691ef5bd03/messages` → **201**

```json
{
  "command_id": "9a81d093-bca4-4411-963d-5c71988f4a58",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03"
}
```

```json
{
  "id": "5a03ccfc-c3ba-4464-8c87-261d2e992621",
  "order_id": "674a4e92-604b-4df3-9653-6cace1f9d0e1",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03",
  "sent_at": "2026-10-30T17:46:58.607625691Z"
}
```

(the car drives 6 s to the next point)

`POST /api/driver/v1/work-sessions/f51c7139-5cb8-4d20-9ecf-a6eba7c4b214/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T17:47:04Z",
    "sequence": 1793382424804
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "f51c7139-5cb8-4d20-9ecf-a6eba7c4b214",
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
  "last_heartbeat_at": "2026-10-30T17:47:04.81961Z",
  "last_location_at": "2026-10-30T17:47:04.81961Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/ba6d555c-b3e8-480e-8b6b-fd691ef5bd03/arrive` → **200**

```json
{
  "command_id": "887d89af-50a9-4b29-af21-cb9ed72be405",
  "expected_version": 0
}
```

```json
{
  "id": "ba6d555c-b3e8-480e-8b6b-fd691ef5bd03",
  "order_id": "674a4e92-604b-4df3-9653-6cace1f9d0e1",
  "assignment_id": "e290c323-c342-4fd2-b2e7-077f228bc94f",
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
  "arrived_at": "2026-10-30T17:47:05.010251Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/ba6d555c-b3e8-480e-8b6b-fd691ef5bd03/start` → **200**

```json
{
  "command_id": "1cb4bddb-c65d-4303-b73f-3b30cc2f7d6c",
  "expected_version": 1
}
```

```json
{
  "id": "ba6d555c-b3e8-480e-8b6b-fd691ef5bd03",
  "order_id": "674a4e92-604b-4df3-9653-6cace1f9d0e1",
  "assignment_id": "e290c323-c342-4fd2-b2e7-077f228bc94f",
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
  "arrived_at": "2026-10-30T17:47:05.010251Z",
  "started_at": "2026-10-30T17:47:05.199543Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

(the car drives 90 s to the next point)

`POST /api/driver/v1/work-sessions/f51c7139-5cb8-4d20-9ecf-a6eba7c4b214/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4584,
    "lon": 30.4300,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T17:48:35Z",
    "sequence": 1793382515403
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "f51c7139-5cb8-4d20-9ecf-a6eba7c4b214",
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
  "last_heartbeat_at": "2026-10-30T17:48:35.419193Z",
  "last_location_at": "2026-10-30T17:48:35.419193Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/ba6d555c-b3e8-480e-8b6b-fd691ef5bd03/complete` → **200**

```json
{
  "command_id": "e55302fa-95d1-4f43-be97-9795ac1d0013",
  "expected_version": 2,
  "reported_at": "2026-10-30T17:48:35Z",
  "cash_received": false
}
```

```json
{
  "id": "ba6d555c-b3e8-480e-8b6b-fd691ef5bd03",
  "order_id": "674a4e92-604b-4df3-9653-6cace1f9d0e1",
  "assignment_id": "e290c323-c342-4fd2-b2e7-077f228bc94f",
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
  "arrived_at": "2026-10-30T17:47:05.010251Z",
  "started_at": "2026-10-30T17:47:05.199543Z",
  "completed_at": "2026-10-30T17:48:35.612618Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/rider/v1/orders/674a4e92-604b-4df3-9653-6cace1f9d0e1` → **200**

```json
{
  "id": "674a4e92-604b-4df3-9653-6cace1f9d0e1",
  "short_number": 11,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "89a5c189-33d5-4258-b567-ffb0c70351ca",
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
    "id": "e290c323-c342-4fd2-b2e7-077f228bc94f",
    "order_id": "674a4e92-604b-4df3-9653-6cace1f9d0e1",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "ba6d555c-b3e8-480e-8b6b-fd691ef5bd03",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T17:46:56.205189Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/674a4e92-604b-4df3-9653-6cace1f9d0e1` → **200**

```json
{
  "id": "674a4e92-604b-4df3-9653-6cace1f9d0e1",
  "short_number": 11,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "89a5c189-33d5-4258-b567-ffb0c70351ca",
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
    "id": "e290c323-c342-4fd2-b2e7-077f228bc94f",
    "order_id": "674a4e92-604b-4df3-9653-6cace1f9d0e1",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "ba6d555c-b3e8-480e-8b6b-fd691ef5bd03",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T17:46:56.205189Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/674a4e92-604b-4df3-9653-6cace1f9d0e1` → **200**

```json
{
  "id": "674a4e92-604b-4df3-9653-6cace1f9d0e1",
  "short_number": 11,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "89a5c189-33d5-4258-b567-ffb0c70351ca",
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
    "id": "e290c323-c342-4fd2-b2e7-077f228bc94f",
    "order_id": "674a4e92-604b-4df3-9653-6cace1f9d0e1",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "ba6d555c-b3e8-480e-8b6b-fd691ef5bd03",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T17:46:56.205189Z",
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
  "session_id": "f51c7139-5cb8-4d20-9ecf-a6eba7c4b214",
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
  "last_heartbeat_at": "2026-10-30T17:48:35.419193Z",
  "last_location_at": "2026-10-30T17:48:35.419193Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f51c7139-5cb8-4d20-9ecf-a6eba7c4b214/close` → **200**

```json
{
  "command_id": "57032006-444a-4413-9984-99a36c64b394",
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
  "session_id": "fea350f6-ed98-4b3b-ac18-dfd40065f2af",
  "subject": {
    "type": "STAFF",
    "id": "c1a6f303-45cb-4836-9719-3861c6b8ed9b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMWE2ZjMwMy00NWNiLTQ4MzYtOTcxOS0zODYxYzZiOGVkOWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODM0MTgsImlhdCI6MTc5MzM4MjUxOCwianRpIjoiMzg4N2I0MjAtZWU1Mi00MGIzLTg0ZmUtNDFlYjg5ZDViYjdkIiwic2lkIjoiZmVhMzUwZjYtZWQ5OC00YjNiLWFjMTgtZGZkNDAwNjVmMmFmIn0.d78AKIDF9ruCBgEJpOTl0YRiq7N3fzUYnPswHc9mcug",
  "access_expires_at": "2026-10-30T18:03:38.967799374Z",
  "refresh_token": "U4x-vo7pQ2AwV6PMRv-8zQHICG-TE-AFJl-qfIYUA-U",
  "refresh_expires_at": "2026-10-31T05:48:38.967442004Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/674a4e92-604b-4df3-9653-6cace1f9d0e1/evidence` → **400**

```json
{
  "instance": "/api/admin/v1/orders/674a4e92-604b-4df3-9653-6cace1f9d0e1/evidence",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "a6d73717-6242-421e-a72f-58153e4959c3"
}
```

`GET /api/admin/v1/orders/674a4e92-604b-4df3-9653-6cace1f9d0e1/evidence?reason=Bank%20request%20sandbox` → **200**

```json
{
  "generated_at": "2026-10-30T17:48:39.335700147Z",
  "order": {
    "id": "674a4e92-604b-4df3-9653-6cace1f9d0e1",
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
    "created_at": "2026-10-30T17:46:56.205189Z",
    "assigned_at": "2026-10-30T17:46:58.000398Z",
    "arrived_at": "2026-10-30T17:47:05.010251Z",
    "started_at": "2026-10-30T17:47:05.199543Z",
    "completed_at": "2026-10-30T17:48:35.612618Z"
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
    "id": "89a5c189-33d5-4258-b567-ffb0c70351ca",
    "registered_at": "2026-10-30T17:46:54.579919Z",
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
      "created_at": "2026-10-30T17:46:56.20686Z"
    },
    {
      "type": "SETTLE",
      "state": "SUCCEEDED",
      "amount_minor": 16297,
      "currency": "UAH",
      "provider_status": "Approved",
      "created_at": "2026-10-30T17:48:36.148724Z"
    }
  ],
  "chat": [
    {
```

## Finance records the chargeback: the rider owes the fare again, a case opens

`POST /api/admin/v1/orders/674a4e92-604b-4df3-9653-6cace1f9d0e1/chargebacks` → **422**

```json
{
  "command_id": "99c4c43c-59e3-4992-bf2d-0912adeae8ea",
  "amount_minor": 16298,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "instance": "/api/admin/v1/orders/674a4e92-604b-4df3-9653-6cace1f9d0e1/chargebacks",
  "status": 422,
  "title": "Chargeback not allowed",
  "type": "https://errors.blizz.taxi/chargeback-not-allowed",
  "code": "CHARGEBACK_NOT_ALLOWED",
  "correlation_id": "84cc588c-f5b5-43a5-9e03-0baf99f82254"
}
```

`POST /api/admin/v1/orders/674a4e92-604b-4df3-9653-6cace1f9d0e1/chargebacks` → **201**

```json
{
  "command_id": "8dc54fb4-55e4-4921-aabd-1363a65d8b15",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "id": "aee51693-90e4-4763-9dc8-7729215fad97",
  "order_id": "674a4e92-604b-4df3-9653-6cace1f9d0e1",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-30T17:48:39.769569Z",
  "resolved_at": null,
  "version": 0
}
```

`POST /api/admin/v1/orders/674a4e92-604b-4df3-9653-6cace1f9d0e1/chargebacks` → **201**

```json
{
  "command_id": "8dc54fb4-55e4-4921-aabd-1363a65d8b15",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "id": "aee51693-90e4-4763-9dc8-7729215fad97",
  "order_id": "674a4e92-604b-4df3-9653-6cace1f9d0e1",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-30T17:48:39.769569Z",
  "resolved_at": null,
  "version": 0
}
```

`GET /api/admin/v1/clients/89a5c189-33d5-4258-b567-ffb0c70351ca` → **200**

```json
{
  "client": {
    "id": "89a5c189-33d5-4258-b567-ffb0c70351ca",
    "phone": "+380735557154",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T17:46:54.579919Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "674a4e92-604b-4df3-9653-6cace1f9d0e1",
      "short_number": 11,
      "status": "FULFILLED",
      "created_at": "2026-10-30T17:46:56.205189Z",
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

`POST /api/admin/v1/orders/674a4e92-604b-4df3-9653-6cace1f9d0e1/chargebacks/aee51693-90e4-4763-9dc8-7729215fad97/resolve` → **200**

```json
{
  "command_id": "f591709a-f2f7-4132-b517-b498a00d5479",
  "expected_version": 0,
  "outcome": "WON",
  "reason": "Evidence accepted"
}
```

```json
{
  "id": "aee51693-90e4-4763-9dc8-7729215fad97",
  "order_id": "674a4e92-604b-4df3-9653-6cace1f9d0e1",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "WON",
  "resolution_reason": "Evidence accepted",
  "created_at": "2026-10-30T17:48:39.769569Z",
  "resolved_at": "2026-10-30T17:48:40.417773Z",
  "version": 1
}
```

`GET /api/admin/v1/clients/89a5c189-33d5-4258-b567-ffb0c70351ca` → **200**

```json
{
  "client": {
    "id": "89a5c189-33d5-4258-b567-ffb0c70351ca",
    "phone": "+380735557154",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T17:46:54.579919Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "674a4e92-604b-4df3-9653-6cace1f9d0e1",
      "short_number": 11,
      "status": "FULFILLED",
      "created_at": "2026-10-30T17:46:56.205189Z",
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

`GET /api/admin/v1/clients/89a5c189-33d5-4258-b567-ffb0c70351ca` → **200**

```json
{
  "client": {
    "id": "89a5c189-33d5-4258-b567-ffb0c70351ca",
    "phone": "+380735557154",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T17:46:54.579919Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "674a4e92-604b-4df3-9653-6cace1f9d0e1",
      "short_number": 11,
      "status": "FULFILLED",
      "created_at": "2026-10-30T17:46:56.205189Z",
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

`POST /api/admin/v1/orders/674a4e92-604b-4df3-9653-6cace1f9d0e1/chargebacks/aee51693-90e4-4763-9dc8-7729215fad97/resolve` → **409**

```json
{
  "command_id": "e9ceef28-98c4-42d2-9331-e485d0bc9f0c",
  "expected_version": 1,
  "outcome": "LOST",
  "reason": "Twice"
}
```

```json
{
  "instance": "/api/admin/v1/orders/674a4e92-604b-4df3-9653-6cace1f9d0e1/chargebacks/aee51693-90e4-4763-9dc8-7729215fad97/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "3e426842-e50b-4d38-a847-456f46ed3e66"
}
```

`GET /api/admin/v1/orders/674a4e92-604b-4df3-9653-6cace1f9d0e1/chargebacks` → **200**

```json
{
  "chargebacks": [
    {
      "id": "aee51693-90e4-4763-9dc8-7729215fad97",
      "order_id": "674a4e92-604b-4df3-9653-6cace1f9d0e1",
      "amount_minor": 16297,
      "currency": "UAH",
      "bank_reason": "4837 No cardholder authorization",
      "received_on": "2026-10-29",
      "state": "WON",
      "resolution_reason": "Evidence accepted",
      "created_at": "2026-10-30T17:48:39.769569Z",
      "resolved_at": "2026-10-30T17:48:40.417773Z",
      "version": 1
    }
  ]
}
```

Done: the evidence of card order 674a4e92-604b-4df3-9653-6cace1f9d0e1 without phone or card digits; chargeback aee51693-90e4-4763-9dc8-7729215fad97 recorded and won.

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
  "session_id": "00ef8476-3b44-4b9b-ac70-5987aaa7ef20",
  "subject": {
    "type": "STAFF",
    "id": "c1a6f303-45cb-4836-9719-3861c6b8ed9b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMWE2ZjMwMy00NWNiLTQ4MzYtOTcxOS0zODYxYzZiOGVkOWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODM0MjIsImlhdCI6MTc5MzM4MjUyMiwianRpIjoiYTBiYzNkMjctMzA4OS00YmNlLTkxNmItYjZhMjE5ODgxYTkwIiwic2lkIjoiMDBlZjg0NzYtM2I0NC00YjliLWFjNzAtNTk4N2FhYTdlZjIwIn0.rpnydN5uuQdhDQFGMmPyHSX7yPJcdXyB0DoG2BrFIpU",
  "access_expires_at": "2026-10-30T18:03:42.7925461Z",
  "refresh_token": "EGdJVKV3cemEMlblrvN_Mz7ZobQGRn1FUo4P2UdM_Pc",
  "refresh_expires_at": "2026-10-31T05:48:42.792158764Z",
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
  "phone": "+48600258089",
  "device_ref": "sandbox-22916"
}
```

```json
{
  "challenge_id": "dedae1b5-5dff-42e9-9b5c-7ce9e95065c3",
  "expires_at": "2026-10-30T17:53:43.34310206Z",
  "resend_available_at": "2026-10-30T17:48:44.34310206Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600258089` → **200**

```json
{
  "phone": "+48600258089",
  "audience": "CLIENT",
  "code": "195546",
  "sent_at": "2026-10-30T17:48:43.344962613Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "dedae1b5-5dff-42e9-9b5c-7ce9e95065c3",
  "code": "195546",
  "device_ref": "sandbox-22916"
}
```

```json
{
  "session_id": "d8368fd3-e652-4f02-b57c-912c04b6e564",
  "subject": {
    "type": "CLIENT",
    "id": "1de7b354-b374-4304-9d0d-550097ff0e0b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZGU3YjM1NC1iMzc0LTQzMDQtOWQwZC01NTAwOTdmZjBlMGIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzgzNDIzLCJpYXQiOjE3OTMzODI1MjMsImp0aSI6IjU1NWE5OGNlLTY3NDYtNDUwMi04OTUzLTdkNWY3OTFiNDI2YSIsInNpZCI6ImQ4MzY4ZmQzLWU2NTItNGYwMi1iNTdjLTkxMmMwNGI2ZTU2NCJ9.lFRgpKJX5MuGppBOYEX-1UxgspxT4S2LOvG_1M5myG8",
  "access_expires_at": "2026-10-30T18:03:43.548678172Z",
  "refresh_token": "Y5pnB0fon16eAc8bMstXo0IOW5hOoNHVPCRmnddj-W4",
  "refresh_expires_at": "2026-11-29T17:48:43.548300251Z",
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
  "command_id": "e327448c-1a32-4a3b-86e6-d1bc5c8bd25b",
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
  "correlation_id": "4c04fa06-516c-4d99-bb5b-4df34b9c554f",
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
  "command_id": "9508f69b-c195-4fcd-80eb-cfa8f612c73e",
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
  "paused_at": "2026-10-30T17:48:44.292349428Z",
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
  "command_id": "474fbbd4-bbf7-4e60-878c-f12dd4f85b07",
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
  "id": "3e54a5da-8d23-4c7e-b09e-d3128261c54b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T17:53:44.688471Z",
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
  "command_id": "5f04d006-e935-4006-a6d4-7582764a3920",
  "quote_id": "3e54a5da-8d23-4c7e-b09e-d3128261c54b",
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
  "correlation_id": "545ce6b2-c855-47f8-962a-4c09847dc447"
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
  "paused_at": "2026-10-30T17:48:44.292349Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "65d41701-8642-48ac-bba6-bd2668ae32da",
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
  "command_id": "ffde3dce-5bad-4db4-8e5a-199a19126e9e",
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
  "command_id": "e13edbed-96b3-4b38-a8fd-3793fbaf08dc",
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
  "id": "9cd6bb17-ef3c-461b-ba89-f50264bbcfd3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T17:53:45.829225Z",
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
  "command_id": "d968652f-3fcb-42d3-8e68-9f99028cf17b",
  "quote_id": "9cd6bb17-ef3c-461b-ba89-f50264bbcfd3",
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
  "correlation_id": "114b91aa-fbfc-4b62-916b-964fe29b95f9"
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
  "command_id": "db6f9410-c4fa-4da7-bfa6-e3d50d76b617",
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
      "from": "20:00",
      "to": "21:00"
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
      "from": "20:00",
      "to": "21:00"
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
  "command_id": "3968875f-58df-4a87-a410-53770e37b9cc",
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
  "id": "77d77f6d-85a6-45b1-a949-e33732a428fd",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T17:53:46.592229Z",
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
  "command_id": "ab018041-5b61-440d-aeb6-686dacac4328",
  "quote_id": "77d77f6d-85a6-45b1-a949-e33732a428fd",
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
  "correlation_id": "9c169db9-72e9-4956-b275-f503bdf6117f"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "3677e6f9-0b41-433c-a776-63caabed219b",
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
  "correlation_id": "0789b943-e6ed-4594-9bdb-b0c2a128a81a",
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
      "from": "20:00",
      "to": "21:00"
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
  "command_id": "aef09634-2433-4bb9-a924-5a3727bd0ea5",
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
  "phone": "+380677686470",
  "device_ref": "sandbox-21868"
}
```

```json
{
  "challenge_id": "22008f97-a964-47b4-930c-6fd03c67ca6f",
  "expires_at": "2026-10-30T17:53:47.589320036Z",
  "resend_available_at": "2026-10-30T17:48:48.589320036Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380677686470` → **200**

```json
{
  "phone": "+380677686470",
  "audience": "CLIENT",
  "code": "310018",
  "sent_at": "2026-10-30T17:48:47.591376301Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "22008f97-a964-47b4-930c-6fd03c67ca6f",
  "code": "310018",
  "device_ref": "sandbox-21868"
}
```

```json
{
  "session_id": "68a00281-c903-4290-a51e-0755f088dae1",
  "subject": {
    "type": "CLIENT",
    "id": "3eeef28b-f6f0-4b06-8a7d-7555b6898cd9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzZWVlZjI4Yi1mNmYwLTRiMDYtOGE3ZC03NTU1YjY4OThjZDkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzgzNDI3LCJpYXQiOjE3OTMzODI1MjcsImp0aSI6ImIzNjI3MjM4LTI3MDMtNDc5My1iMWY0LTA0YmVlNzdkMzdmNSIsInNpZCI6IjY4YTAwMjgxLWM5MDMtNDI5MC1hNTFlLTA3NTVmMDg4ZGFlMSJ9.1wXIGFkIZ1iWaVKLGzBGVd8R7YJOISnH7h9PXEABQcU",
  "access_expires_at": "2026-10-30T18:03:47.790449083Z",
  "refresh_token": "4Fc_wr3466ZK3ZFWisrIlIH3hlBRrIvZVAzs-zTWDhg",
  "refresh_expires_at": "2026-11-29T17:48:47.790062548Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "3eeef28b-f6f0-4b06-8a7d-7555b6898cd9",
  "session_id": "68a00281-c903-4290-a51e-0755f088dae1",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "47613682-534b-4d57-a14f-4378b4cf9946",
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
  "id": "a64a82f6-477e-4d52-bb78-2dc12b49b2db",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T17:53:48.163760Z",
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
  "challenge_id": "b8b0dd3b-2227-4eec-9266-a6e4b49bf5ee",
  "expires_at": "2026-10-30T17:53:50.353181099Z",
  "resend_available_at": "2026-10-30T17:48:51.353181099Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380677686470` → **200**

```json
{
  "phone": "+380677686470",
  "audience": "CLIENT",
  "code": "210840",
  "sent_at": "2026-10-30T17:48:50.356362602Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "90a4436f-91a8-49ac-a710-35a41600fa66",
  "challenge_id": "b8b0dd3b-2227-4eec-9266-a6e4b49bf5ee",
  "otp_code": "210840"
}
```

```json
{
  "client_id": "3eeef28b-f6f0-4b06-8a7d-7555b6898cd9",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-30T17:48:50.575936757Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "fbb0e55a-660a-43cc-9dcf-1e9dbfb1150d",
  "quote_id": "a64a82f6-477e-4d52-bb78-2dc12b49b2db",
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
  "correlation_id": "59e855de-d5da-46ed-b897-954617e91ff4"
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
  "session_id": "c337a612-5827-4b6d-a9fe-c9dbd7913613",
  "subject": {
    "type": "STAFF",
    "id": "c1a6f303-45cb-4836-9719-3861c6b8ed9b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMWE2ZjMwMy00NWNiLTQ4MzYtOTcxOS0zODYxYzZiOGVkOWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODM0MzEsImlhdCI6MTc5MzM4MjUzMSwianRpIjoiOGJmYmE2ZjUtNTBkNS00YTc4LTkwNzItNGM5OWU0YmQ2NmZkIiwic2lkIjoiYzMzN2E2MTItNTgyNy00YjZkLWE5ZmUtYzlkYmQ3OTEzNjEzIn0.qtseWXTNrhPMWcKqI1DquKPjtPRZ2xQskVoTREAv3_M",
  "access_expires_at": "2026-10-30T18:03:51.159928443Z",
  "refresh_token": "63rgFg0m997iJyJ7zAz3oTLjaOV7zaeopctJvkmiXjI",
  "refresh_expires_at": "2026-10-31T05:48:51.159535639Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "3eeef28b-f6f0-4b06-8a7d-7555b6898cd9",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-30T17:48:50.575937Z",
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

`POST /api/admin/v1/client-deletions/3eeef28b-f6f0-4b06-8a7d-7555b6898cd9/complete` → **200**

```json
{
  "command_id": "9fab2f32-239c-4cbc-b4cf-232cef2e3675",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "3eeef28b-f6f0-4b06-8a7d-7555b6898cd9",
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
  "correlation_id": "260b4374-7c12-40df-9f0e-892e341049e4"
}
```

Done: client 3eeef28b-f6f0-4b06-8a7d-7555b6898cd9 anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380669213781",
  "device_ref": "sandbox-28983"
}
```

```json
{
  "challenge_id": "ddc61b01-56c8-46d3-b8ef-d380a573abc5",
  "expires_at": "2026-10-30T17:53:51.91393369Z",
  "resend_available_at": "2026-10-30T17:48:52.91393369Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380669213781` → **200**

```json
{
  "phone": "+380669213781",
  "audience": "CLIENT",
  "code": "028285",
  "sent_at": "2026-10-30T17:48:51.915967557Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ddc61b01-56c8-46d3-b8ef-d380a573abc5",
  "code": "028285",
  "device_ref": "sandbox-28983"
}
```

```json
{
  "session_id": "740bc9b8-1232-46fc-ad07-861b285b85ed",
  "subject": {
    "type": "CLIENT",
    "id": "6aad843f-5a51-4756-87bf-ef971ff62af1"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YWFkODQzZi01YTUxLTQ3NTYtODdiZi1lZjk3MWZmNjJhZjEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzgzNDMyLCJpYXQiOjE3OTMzODI1MzIsImp0aSI6ImJlNDRjOTU1LWRmMGMtNDA5YS1hZGY1LWYzYzcwZThhMThmZSIsInNpZCI6Ijc0MGJjOWI4LTEyMzItNDZmYy1hZDA3LTg2MWIyODViODVlZCJ9.NkN6TT6w71VYkI2hPOk5nEcea4EfBwRkc2Qi6H4JbWM",
  "access_expires_at": "2026-10-30T18:03:52.127183559Z",
  "refresh_token": "T-7o_0APQEmWWopzdHhu42nWWsOzFDksYq5mAz5pGjU",
  "refresh_expires_at": "2026-11-29T17:48:52.126700965Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "6aad843f-5a51-4756-87bf-ef971ff62af1",
  "session_id": "740bc9b8-1232-46fc-ad07-861b285b85ed",
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
  "session_id": "e0f5e7a7-5489-422b-9df9-4270f3547bc5",
  "subject": {
    "type": "STAFF",
    "id": "c1a6f303-45cb-4836-9719-3861c6b8ed9b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMWE2ZjMwMy00NWNiLTQ4MzYtOTcxOS0zODYxYzZiOGVkOWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODM0MzIsImlhdCI6MTc5MzM4MjUzMiwianRpIjoiOGFkMDRlMzEtZjVmNS00MTE2LTgzNWEtYzczMmVlMDI1MWUwIiwic2lkIjoiZTBmNWU3YTctNTQ4OS00MjJiLTlkZjktNDI3MGYzNTQ3YmM1In0.G3BNtmM2P65YbQ4cs6oygjQfJtY2PkvUUtctVG5vIzk",
  "access_expires_at": "2026-10-30T18:03:52.69262987Z",
  "refresh_token": "lnC2X9HQFFCvXiZrp6ONSXZwAbA34jGW9pZr3PDnRvw",
  "refresh_expires_at": "2026-10-31T05:48:52.692255905Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=9213781&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "6aad843f-5a51-4756-87bf-ef971ff62af1",
      "phone": "+380669213781",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-30T17:48:52.125399Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/6aad843f-5a51-4756-87bf-ef971ff62af1` → **200**

```json
{
  "client": {
    "id": "6aad843f-5a51-4756-87bf-ef971ff62af1",
    "phone": "+380669213781",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T17:48:52.125399Z",
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

`POST /api/admin/v1/clients/6aad843f-5a51-4756-87bf-ef971ff62af1/block` → **400**

```json
{
  "command_id": "5866e5a6-0a45-49c9-9d1b-2f24f26792d2",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/6aad843f-5a51-4756-87bf-ef971ff62af1/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "9b64634d-8d50-491a-a2c2-6a17813ba2e6",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/6aad843f-5a51-4756-87bf-ef971ff62af1/block` → **200**

```json
{
  "command_id": "cc1eb868-4e66-4a35-bff7-ced5925f71a5",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "6aad843f-5a51-4756-87bf-ef971ff62af1",
  "phone": "+380669213781",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-30T17:48:52.125399Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-30T17:48:53.477243Z",
    "by": "c1a6f303-45cb-4836-9719-3861c6b8ed9b"
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
  "correlation_id": "66611633-ea10-419f-839e-e8025565b27f"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380669213781",
  "device_ref": "sandbox-15071"
}
```

```json
{
  "challenge_id": "b04fb118-507e-42bb-a71a-9a4ac4cf85dc",
  "expires_at": "2026-10-30T17:53:55.857147521Z",
  "resend_available_at": "2026-10-30T17:48:56.857147521Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380669213781` → **200**

```json
{
  "phone": "+380669213781",
  "audience": "CLIENT",
  "code": "124557",
  "sent_at": "2026-10-30T17:48:55.858767552Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "b04fb118-507e-42bb-a71a-9a4ac4cf85dc",
  "code": "124557",
  "device_ref": "sandbox-15071"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "defce82a-2336-40da-b214-38b12f8836a7"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/6aad843f-5a51-4756-87bf-ef971ff62af1` → **200**

```json
{
  "client": {
    "id": "6aad843f-5a51-4756-87bf-ef971ff62af1",
    "phone": "+380669213781",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-30T17:48:52.125399Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-30T17:48:53.477243Z",
      "by": "c1a6f303-45cb-4836-9719-3861c6b8ed9b"
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

`POST /api/admin/v1/clients/6aad843f-5a51-4756-87bf-ef971ff62af1/unblock` → **200**

```json
{
  "command_id": "7560723c-e0b8-4c63-b76d-c7f320f03694",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "6aad843f-5a51-4756-87bf-ef971ff62af1",
  "phone": "+380669213781",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-30T17:48:52.125399Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380669213781",
  "device_ref": "sandbox-7595"
}
```

```json
{
  "challenge_id": "084b5412-b4f3-40eb-b08a-8ecb1bc53426",
  "expires_at": "2026-10-30T17:53:58.627370102Z",
  "resend_available_at": "2026-10-30T17:48:59.627370102Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380669213781` → **200**

```json
{
  "phone": "+380669213781",
  "audience": "CLIENT",
  "code": "002175",
  "sent_at": "2026-10-30T17:48:58.629033149Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "084b5412-b4f3-40eb-b08a-8ecb1bc53426",
  "code": "002175",
  "device_ref": "sandbox-7595"
}
```

```json
{
  "session_id": "3163b400-3da4-4c16-a448-37d6033647a5",
  "subject": {
    "type": "CLIENT",
    "id": "6aad843f-5a51-4756-87bf-ef971ff62af1"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YWFkODQzZi01YTUxLTQ3NTYtODdiZi1lZjk3MWZmNjJhZjEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzgzNDM4LCJpYXQiOjE3OTMzODI1MzgsImp0aSI6IjhhNGUzZDg0LWI1OWMtNDVhYS1iNzI2LTk5YjhmNWQ3YWViNiIsInNpZCI6IjMxNjNiNDAwLTNkYTQtNGMxNi1hNDQ4LTM3ZDYwMzM2NDdhNSJ9.GRYa9yrmSIGMPl2X2RIfoVS-RrwjfHEqKHa04pkoD88",
  "access_expires_at": "2026-10-30T18:03:58.832511015Z",
  "refresh_token": "vulfoAUqfZLgM7elMA95rJZ6Yvk9kAun5YPk2RYGpso",
  "refresh_expires_at": "2026-11-29T17:48:58.832162958Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "6aad843f-5a51-4756-87bf-ef971ff62af1",
  "session_id": "3163b400-3da4-4c16-a448-37d6033647a5",
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
  "phone": "+380664360087",
  "device_ref": "sandbox-1510"
}
```

```json
{
  "challenge_id": "9b398b07-2690-453b-a1fa-053276fbb563",
  "expires_at": "2026-10-30T17:53:59.198510063Z",
  "resend_available_at": "2026-10-30T17:49:00.198510063Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380664360087` → **200**

```json
{
  "phone": "+380664360087",
  "audience": "CLIENT",
  "code": "665231",
  "sent_at": "2026-10-30T17:48:59.200328364Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9b398b07-2690-453b-a1fa-053276fbb563",
  "code": "665231",
  "device_ref": "sandbox-1510"
}
```

```json
{
  "session_id": "6640edd2-0387-41b6-8345-3371674fb2f2",
  "subject": {
    "type": "CLIENT",
    "id": "ca428619-8ab6-42e1-81a5-4791d36d1556"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjYTQyODYxOS04YWI2LTQyZTEtODFhNS00NzkxZDM2ZDE1NTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzgzNDM5LCJpYXQiOjE3OTMzODI1MzksImp0aSI6IjRjMjI4Zjc5LThmZjQtNDRhMC1hNjEzLTA5YWVlZjc0ZWEwNyIsInNpZCI6IjY2NDBlZGQyLTAzODctNDFiNi04MzQ1LTMzNzE2NzRmYjJmMiJ9.oJzuYs4RPwQCuSrec8AgT8ow3ekbHWgiy4glxDOyLSs",
  "access_expires_at": "2026-10-30T18:03:59.403567103Z",
  "refresh_token": "I68VmLzxOn9GYoUtA7oCis6L32M_KB71j9gY9s5-laY",
  "refresh_expires_at": "2026-11-29T17:48:59.403229042Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8687e455-eca5-4c4b-8c61-fd5cfdea8b9b",
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
  "id": "6b322e66-0c81-4712-a8dc-cff7c38d504e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T17:53:59.588871Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: 918ccb52-9dd9-4429-a9b0-67589535c914) → **201**

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
  "session_id": "ee9a8609-3d8c-40b1-a0c7-f311b59eaf7f",
  "subject": {
    "type": "STAFF",
    "id": "c1a6f303-45cb-4836-9719-3861c6b8ed9b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMWE2ZjMwMy00NWNiLTQ4MzYtOTcxOS0zODYxYzZiOGVkOWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODM0NDAsImlhdCI6MTc5MzM4MjU0MCwianRpIjoiNDlhODYzMDItNDI2ZS00NzgwLWE5MDEtNjIyODNmMWU2OWIwIiwic2lkIjoiZWU5YTg2MDktM2Q4Yy00MGIxLWEwYzctZjMxMWI1OWVhZjdmIn0.7YyX2Q_KiBZhInq8vTTmcG7NlCSw2O2kKAzr5cYwets",
  "access_expires_at": "2026-10-30T18:04:00.040007556Z",
  "refresh_token": "gJg7BjJ6LLKXb0I772_kOu4SVKmIJd8FIYNYKonNd3U",
  "refresh_expires_at": "2026-10-31T05:49:00.039674742Z",
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
  "session_id": "0632f834-c589-4c56-a1d1-3686c21f1857",
  "subject": {
    "type": "STAFF",
    "id": "c1a6f303-45cb-4836-9719-3861c6b8ed9b"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMWE2ZjMwMy00NWNiLTQ4MzYtOTcxOS0zODYxYzZiOGVkOWIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODM0NDAsImlhdCI6MTc5MzM4MjU0MCwianRpIjoiNWEwZTRjNTItNDY4MS00NDM5LTkwM2MtNTliZjU5MjAyODkwIiwic2lkIjoiMDYzMmY4MzQtYzU4OS00YzU2LWExZDEtMzY4NmMyMWYxODU3In0.GkOiGuVDU11I138S1RkU3TjsJubRei07NsHlbUEWCuE",
  "access_expires_at": "2026-10-30T18:04:00.425056354Z",
  "refresh_token": "fpWKbvzEyCiUGxXmiloKRtEANwNhXISJK41co5jfAYw",
  "refresh_expires_at": "2026-10-31T05:49:00.424680987Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/4a36b515-a977-4346-a45a-20fcd089f5f9/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T17:48:59.786799Z",
      "actor": {
        "type": "CLIENT",
        "id": "ca428619-8ab6-42e1-81a5-4791d36d1556",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "4a36b515-a977-4346-a45a-20fcd089f5f9",
        "quote_id": "6b322e66-0c81-4712-a8dc-cff7c38d504e",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "918ccb52-9dd9-4429-a9b0-67589535c914"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T17:48:59.787999Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "4a36b515-a977-4346-a45a-20fcd089f5f9",
        "attempt_id": "eeae1e7b-b32a-46dc-b763-c88d9161d761",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "918ccb52-9dd9-4429-a9b0-67589535c914"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-30T17:48:59.818741Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "4a36b515-a977-4346-a45a-20fcd089f5f9",
        "attempt_id": "eeae1e7b-b32a-46dc-b763-c88d9161d761"
      },
      "correlation_id": "918ccb52-9dd9-4429-a9b0-67589535c914"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "eeae1e7b-b32a-46dc-b763-c88d9161d761",
        "generation": 1,
        "started_at": "2026-10-30T17:48:59.787311Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-30T17:48:59.818741Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-30T17:48:59.788397Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/918ccb52-9dd9-4429-a9b0-67589535c914` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "4a36b515-a977-4346-a45a-20fcd089f5f9:0",
      "order_id": "4a36b515-a977-4346-a45a-20fcd089f5f9",
      "at": "2026-10-30T17:48:59.786799Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "4a36b515-a977-4346-a45a-20fcd089f5f9:1",
      "order_id": "4a36b515-a977-4346-a45a-20fcd089f5f9",
      "at": "2026-10-30T17:48:59.787999Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "4a36b515-a977-4346-a45a-20fcd089f5f9:2",
      "order_id": "4a36b515-a977-4346-a45a-20fcd089f5f9",
      "at": "2026-10-30T17:48:59.818741Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/57bd7f70-ebc7-484f-9426-6072d97490d3` → **200**

```json
{
  "found": []
}
```

Done: request 918ccb52-9dd9-4429-a9b0-67589535c914 — order 4a36b515-a977-4346-a45a-20fcd089f5f9 found by its id.

`GET /api/rider/v1/orders/4a36b515-a977-4346-a45a-20fcd089f5f9` → **200**

```json
{
  "id": "4a36b515-a977-4346-a45a-20fcd089f5f9",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ca428619-8ab6-42e1-81a5-4791d36d1556",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T17:48:59.786414Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/4a36b515-a977-4346-a45a-20fcd089f5f9/cancel` → **200**

```json
{
  "command_id": "8d42ed4a-3550-4be7-ab1c-743ee3367646",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "4a36b515-a977-4346-a45a-20fcd089f5f9",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "ca428619-8ab6-42e1-81a5-4791d36d1556",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T17:48:59.786414Z",
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
  "phone": "+380631682276",
  "device_ref": "sandbox-24280"
}
```

```json
{
  "challenge_id": "1cc1cf7f-bd5c-4923-bcf4-a9a357db6e01",
  "expires_at": "2026-10-30T17:54:01.610497535Z",
  "resend_available_at": "2026-10-30T17:49:02.610497535Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631682276` → **200**

```json
{
  "phone": "+380631682276",
  "audience": "CLIENT",
  "code": "123105",
  "sent_at": "2026-10-30T17:49:01.612550982Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1cc1cf7f-bd5c-4923-bcf4-a9a357db6e01",
  "code": "123105",
  "device_ref": "sandbox-24280"
}
```

```json
{
  "session_id": "8c0febd5-f429-4728-aed1-638456d1611e",
  "subject": {
    "type": "CLIENT",
    "id": "c35d7227-0482-47b6-a789-477c65a8e888"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMzVkNzIyNy0wNDgyLTQ3YjYtYTc4OS00NzdjNjVhOGU4ODgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzgzNDQxLCJpYXQiOjE3OTMzODI1NDEsImp0aSI6IjU5MmQzNzU2LTEyMzItNGEyMC1iMzQwLTA1NmQxYWE5MmE3OSIsInNpZCI6IjhjMGZlYmQ1LWY0MjktNDcyOC1hZWQxLTYzODQ1NmQxNjExZSJ9.CasmyjQOvBUD4z5vGqE6t5fJzphdBxjmN09gRo5BJmQ",
  "access_expires_at": "2026-10-30T18:04:01.812580204Z",
  "refresh_token": "lcqndC5FHROUmN7bNNrSPmbzxCiFDSrSKTslbFgbBFU",
  "refresh_expires_at": "2026-11-29T17:49:01.812255543Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "b7262435-91d7-462f-8bd4-2a5dffddb601",
  "expires_at": "2026-10-30T17:54:03.996839222Z",
  "resend_available_at": "2026-10-30T17:49:04.996839222Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631682276` → **200**

```json
{
  "phone": "+380631682276",
  "audience": "CLIENT",
  "code": "375532",
  "sent_at": "2026-10-30T17:49:03.998348336Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "764fc7fe-33fb-4716-abf2-7b118bc5a8b5",
  "challenge_id": "b7262435-91d7-462f-8bd4-2a5dffddb601",
  "otp_code": "375532"
}
```

```json
{
  "id": "3ede001c-08ba-490c-b23a-fddbe57de922",
  "state": "PENDING",
  "created_at": "2026-10-30T17:49:04.208196Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/3ede001c-08ba-490c-b23a-fddbe57de922` → **200**

```json
{
  "id": "3ede001c-08ba-490c-b23a-fddbe57de922",
  "state": "PENDING",
  "created_at": "2026-10-30T17:49:04.208196Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/3ede001c-08ba-490c-b23a-fddbe57de922` → **200**

```json
{
  "id": "3ede001c-08ba-490c-b23a-fddbe57de922",
  "state": "PENDING",
  "created_at": "2026-10-30T17:49:04.208196Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/3ede001c-08ba-490c-b23a-fddbe57de922` → **200**

```json
{
  "id": "3ede001c-08ba-490c-b23a-fddbe57de922",
  "state": "PENDING",
  "created_at": "2026-10-30T17:49:04.208196Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/3ede001c-08ba-490c-b23a-fddbe57de922` → **200**

```json
{
  "id": "3ede001c-08ba-490c-b23a-fddbe57de922",
  "state": "PENDING",
  "created_at": "2026-10-30T17:49:04.208196Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/3ede001c-08ba-490c-b23a-fddbe57de922` → **200**

```json
{
  "id": "3ede001c-08ba-490c-b23a-fddbe57de922",
  "state": "PENDING",
  "created_at": "2026-10-30T17:49:04.208196Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/3ede001c-08ba-490c-b23a-fddbe57de922` → **200**

```json
{
  "id": "3ede001c-08ba-490c-b23a-fddbe57de922",
  "state": "PENDING",
  "created_at": "2026-10-30T17:49:04.208196Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/3ede001c-08ba-490c-b23a-fddbe57de922` → **200**

```json
{
  "id": "3ede001c-08ba-490c-b23a-fddbe57de922",
  "state": "READY",
  "created_at": "2026-10-30T17:49:04.208196Z",
  "ready_at": "2026-10-30T17:49:11.075762Z",
  "expires_at": "2026-11-06T17:49:11.075762Z",
  "size_bytes": 1032
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/3ede001c-08ba-490c-b23a-fddbe57de922/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635887624",
  "device_ref": "sandbox-27281"
}
```

```json
{
  "challenge_id": "8c604699-9e8a-4cdd-a506-c6ee58958060",
  "expires_at": "2026-10-30T17:54:11.698339556Z",
  "resend_available_at": "2026-10-30T17:49:12.698339556Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380635887624` → **200**

```json
{
  "phone": "+380635887624",
  "audience": "CLIENT",
  "code": "833866",
  "sent_at": "2026-10-30T17:49:11.700197082Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8c604699-9e8a-4cdd-a506-c6ee58958060",
  "code": "833866",
  "device_ref": "sandbox-27281"
}
```

```json
{
  "session_id": "33fa6c9d-a4be-4574-a313-bc7d4e9b5739",
  "subject": {
    "type": "CLIENT",
    "id": "7abe6238-cec3-479e-8e66-ea663cd170c2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YWJlNjIzOC1jZWMzLTQ3OWUtOGU2Ni1lYTY2M2NkMTcwYzIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzgzNDUxLCJpYXQiOjE3OTMzODI1NTEsImp0aSI6IjNjY2RhODEzLTIxOWItNDI2Ny1iMDg3LWI1Y2Y3NTMwYmJiOSIsInNpZCI6IjMzZmE2YzlkLWE0YmUtNDU3NC1hMzEzLWJjN2Q0ZTliNTczOSJ9.acvRam7eHyH2KqO4vHlXIogU6ck8jgQiLCvdYzm--r4",
  "access_expires_at": "2026-10-30T18:04:11.949548038Z",
  "refresh_token": "l_FoFsD2-bb4ESSmzo8euy332Yib0Vs68zCcJb_b610",
  "refresh_expires_at": "2026-11-29T17:49:11.949196035Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/3ede001c-08ba-490c-b23a-fddbe57de922/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/3ede001c-08ba-490c-b23a-fddbe57de922/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "35d20ffb-f619-43a5-a443-93da85d096ac"
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
  "session_id": "147d538d-cce8-44f7-86da-528a01805965",
  "subject": {
    "type": "STAFF",
    "id": "c1a6f303-45cb-4836-9719-3861c6b8ed9b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMWE2ZjMwMy00NWNiLTQ4MzYtOTcxOS0zODYxYzZiOGVkOWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODM0NTIsImlhdCI6MTc5MzM4MjU1MiwianRpIjoiZjRlOTJjYTUtOTExYy00ZmEwLTkxY2EtYTAzMjU3ZGY2OTk5Iiwic2lkIjoiMTQ3ZDUzOGQtY2NlOC00NGY3LTg2ZGEtNTI4YTAxODA1OTY1In0.1Fgsy7B40Znj1Jax_dQ6dA8GuxAGgp8dp9-2boZ-W98",
  "access_expires_at": "2026-10-30T18:04:12.563105212Z",
  "refresh_token": "cpDkIiCfeJ7Vh505G68xyUqnsq-JDq0Gu5PXMIn4GAg",
  "refresh_expires_at": "2026-10-31T05:49:12.562645957Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "c35d7227-0482-47b6-a789-477c65a8e888",
  "session_id": "8c0febd5-f429-4728-aed1-638456d1611e",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/c35d7227-0482-47b6-a789-477c65a8e888/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "3ede001c-08ba-490c-b23a-fddbe57de922",
      "state": "READY",
      "created_at": "2026-10-30T17:49:04.208196Z",
      "ready_at": "2026-10-30T17:49:11.075762Z",
      "expires_at": "2026-11-06T17:49:11.075762Z",
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
  "device_ref": "sandbox-20204"
}
```

```json
{
  "challenge_id": "db5bda2e-555e-48c5-a291-6dc3ee00cf93",
  "expires_at": "2026-10-30T17:54:13.116921026Z",
  "resend_available_at": "2026-10-30T17:49:14.116921026Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "193206",
  "sent_at": "2026-10-30T17:49:13.118918788Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "db5bda2e-555e-48c5-a291-6dc3ee00cf93",
  "code": "193206",
  "device_ref": "sandbox-20204"
}
```

```json
{
  "session_id": "3efa3ba3-8288-47a7-8172-8e4ee7c84787",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4MzQ1MywiaWF0IjoxNzkzMzgyNTUzLCJqdGkiOiIxNzdiY2UzZi05MzAzLTQ3ZDUtYWQwYy03NTNmMDdlZGYwODgiLCJzaWQiOiIzZWZhM2JhMy04Mjg4LTQ3YTctODE3Mi04ZTRlZTdjODQ3ODcifQ.YWW-u0OUafVKYZf_6RYwMXrmgSE_-HhBcIJidbTWp6c",
  "access_expires_at": "2026-10-30T18:04:13.326605155Z",
  "refresh_token": "i4a46kSm6Fy7Rezi_TTsTjFHNCe_IkHfFCPRIbLvCck",
  "refresh_expires_at": "2026-11-29T17:49:13.326187226Z",
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
  "device_ref": "sandbox-22935"
}
```

```json
{
  "challenge_id": "055dac3e-e281-433f-a17a-a5c0ea61810f",
  "expires_at": "2026-10-30T17:54:13.693112664Z",
  "resend_available_at": "2026-10-30T17:49:14.693112664Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "112020",
  "sent_at": "2026-10-30T17:49:13.695339985Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "055dac3e-e281-433f-a17a-a5c0ea61810f",
  "code": "112020",
  "device_ref": "sandbox-22935"
}
```

```json
{
  "session_id": "6dad3102-74d2-41f9-88ca-b10cbbd32b61",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4MzQ1MywiaWF0IjoxNzkzMzgyNTUzLCJqdGkiOiJmNWIyNjE1NS1lYWI1LTQ1N2QtOTgyMS0zOWM2NThkM2NjM2UiLCJzaWQiOiI2ZGFkMzEwMi03NGQyLTQxZjktODhjYS1iMTBjYmJkMzJiNjEifQ.0lyHNxe8tcUVs35beDJfe7liYOrqbb6PUS8C9l-1-LU",
  "access_expires_at": "2026-10-30T18:04:13.898915625Z",
  "refresh_token": "28cLDeYhQep2_fp5kqyOvvlSwLc1KPUi2-nX0DwKdgc",
  "refresh_expires_at": "2026-11-29T17:49:13.898365854Z",
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
  "command_id": "40b21d0c-0574-46ed-825e-dfad9c3e6c0d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T17:49:14Z",
    "sequence": 1793382554271
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "69ac4853-0af4-45e9-83a5-cbf81f3af83a",
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
  "last_heartbeat_at": "2026-10-30T17:49:14.286595Z",
  "last_location_at": "2026-10-30T17:49:14.286595Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-9438"
}
```

```json
{
  "challenge_id": "f0564060-b97b-4fd7-a3dd-0e0a50f71c69",
  "expires_at": "2026-10-30T17:54:14.474594739Z",
  "resend_available_at": "2026-10-30T17:49:15.474594739Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "798954",
  "sent_at": "2026-10-30T17:49:14.476411027Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f0564060-b97b-4fd7-a3dd-0e0a50f71c69",
  "code": "798954",
  "device_ref": "sandbox-9438"
}
```

```json
{
  "session_id": "c5badabc-313e-4cb0-beef-11a8a23a2128",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4MzQ1NCwiaWF0IjoxNzkzMzgyNTU0LCJqdGkiOiJlM2RhOWEwNC03ZjAyLTRhNGEtOTFjNi02YTVjNWI3ZGIxOGIiLCJzaWQiOiJjNWJhZGFiYy0zMTNlLTRjYjAtYmVlZi0xMWE4YTIzYTIxMjgifQ.TwghtIH177djDbzNqQWCEW4LjKHAY2UJPuFubryYyOQ",
  "access_expires_at": "2026-10-30T18:04:14.684466896Z",
  "refresh_token": "rpbzHoa4a0dC6H8oIReOalWoAomLupkXxZA4vqmSvxU",
  "refresh_expires_at": "2026-11-29T17:49:14.684122555Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "298bfc09-79e6-4e56-b74c-2249f3a4c222",
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
  "last_heartbeat_at": "2026-10-30T17:45:31.531712Z",
  "last_location_at": "2026-10-30T17:45:31.531712Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/298bfc09-79e6-4e56-b74c-2249f3a4c222/handover` → **200**

```json
{
  "command_id": "a28f4142-2f92-4ca2-bc8e-16774dbef068",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "298bfc09-79e6-4e56-b74c-2249f3a4c222",
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
  "last_heartbeat_at": "2026-10-30T17:45:31.531712Z",
  "last_location_at": "2026-10-30T17:45:31.531712Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/298bfc09-79e6-4e56-b74c-2249f3a4c222/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T17:49:15Z",
    "sequence": 1793382555270
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "298bfc09-79e6-4e56-b74c-2249f3a4c222",
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
  "last_heartbeat_at": "2026-10-30T17:49:15.285128Z",
  "last_location_at": "2026-10-30T17:49:15.285128Z",
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
  "session_id": "408b66f5-6636-413f-9e72-e48c0bd12d6e",
  "subject": {
    "type": "STAFF",
    "id": "c1a6f303-45cb-4836-9719-3861c6b8ed9b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMWE2ZjMwMy00NWNiLTQ4MzYtOTcxOS0zODYxYzZiOGVkOWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODM0NTUsImlhdCI6MTc5MzM4MjU1NSwianRpIjoiNGM1MjA3NjctMGZiMy00NGQyLTkyMjItZmRlZDhhYzRjN2U0Iiwic2lkIjoiNDA4YjY2ZjUtNjYzNi00MTNmLTllNzItZTQ4YzBiZDEyZDZlIn0.-KLPrKd8TatIPsShvygwA1lnpnqP-E9B_TgptzrsXGI",
  "access_expires_at": "2026-10-30T18:04:15.669249425Z",
  "refresh_token": "ZutAK6vJVpCwT3aoPUyOJjowzGaqiVdVXFlJJTytQT0",
  "refresh_expires_at": "2026-10-31T05:49:15.668913917Z",
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
  "session_id": "e4a90ead-0141-4060-ae3c-7658310c4053",
  "subject": {
    "type": "STAFF",
    "id": "c1a6f303-45cb-4836-9719-3861c6b8ed9b"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMWE2ZjMwMy00NWNiLTQ4MzYtOTcxOS0zODYxYzZiOGVkOWIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODM0NTYsImlhdCI6MTc5MzM4MjU1NiwianRpIjoiOTg5MDU5ZTMtM2UyZC00NGU1LWE3ZmEtNTA1MTZkN2JjN2M5Iiwic2lkIjoiZTRhOTBlYWQtMDE0MS00MDYwLWFlM2MtNzY1ODMxMGM0MDUzIn0.zJKl0j_OP0y7c8SzeegVrlssYqrQV_0Iz6i9WkFXG0Q",
  "access_expires_at": "2026-10-30T18:04:16.050321157Z",
  "refresh_token": "XGGCjjsfMgOm7lagA0R3AcJPZw-k7hxu4kfMJ5NnN24",
  "refresh_expires_at": "2026-10-31T05:49:16.049983396Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380680024042",
  "device_ref": "sandbox-12972"
}
```

```json
{
  "challenge_id": "04826cc4-97bc-42a7-a330-86d2603af17e",
  "expires_at": "2026-10-30T17:54:16.236169285Z",
  "resend_available_at": "2026-10-30T17:49:17.236169285Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380680024042` → **200**

```json
{
  "phone": "+380680024042",
  "audience": "CLIENT",
  "code": "302606",
  "sent_at": "2026-10-30T17:49:16.237958923Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "04826cc4-97bc-42a7-a330-86d2603af17e",
  "code": "302606",
  "device_ref": "sandbox-12972"
}
```

```json
{
  "session_id": "8589eb01-790e-486a-863c-4d8d82f64e13",
  "subject": {
    "type": "CLIENT",
    "id": "5baee450-3c65-4ef2-b7ac-9fdf9311a4c2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YmFlZTQ1MC0zYzY1LTRlZjItYjdhYy05ZmRmOTMxMWE0YzIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzgzNDU2LCJpYXQiOjE3OTMzODI1NTYsImp0aSI6Ijk0ZWM0MTZlLTY2Y2MtNDE2OS1hN2RiLTRhZTcwZTE1YjkyYSIsInNpZCI6Ijg1ODllYjAxLTc5MGUtNDg2YS04NjNjLTRkOGQ4MmY2NGUxMyJ9.dejWzScAnUHtP3cCbLYJ3FcqjFvpX5Qm0VGPpZDiowU",
  "access_expires_at": "2026-10-30T18:04:16.438123699Z",
  "refresh_token": "Lnch9nI6Z0XND5uY_VvKplexuEvzfrM5Dq2ZBuT3ZuE",
  "refresh_expires_at": "2026-11-29T17:49:16.437682481Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e3dfdba3-62ed-4d2e-a7dc-c8a9c1de32d8",
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
  "id": "d79fff79-310d-4b90-a5d7-cfe5aca03966",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T17:54:16.625990Z",
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
  "command_id": "7b4aa95e-76b7-4b85-a518-4395f8693bb8",
  "quote_id": "d79fff79-310d-4b90-a5d7-cfe5aca03966",
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
  "id": "f99a24dd-6a9a-4d06-94f4-153c6a869be7",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5baee450-3c65-4ef2-b7ac-9fdf9311a4c2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T17:49:16.821701Z",
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
    "id": "398f70c6-113b-46bd-a5a4-00926bac3ab9",
    "order_id": "f99a24dd-6a9a-4d06-94f4-153c6a869be7",
    "expires_at": "2026-10-30T17:49:31.824163Z",
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

`POST /api/driver/v1/offers/398f70c6-113b-46bd-a5a4-00926bac3ab9/reject` → **204**

```json
{
  "command_id": "a9d2bc3b-f92f-4c45-b8b4-7a7ee8411061"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "da175533-9f1e-417d-8320-2c675c1e77b2",
    "order_id": "f99a24dd-6a9a-4d06-94f4-153c6a869be7",
    "expires_at": "2026-10-30T17:49:32.228929Z",
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

`POST /api/driver/v1/offers/da175533-9f1e-417d-8320-2c675c1e77b2/accept` → **200**

```json
{
  "command_id": "e525f101-cb13-48f4-ba1e-16eeafd781d0"
}
```

```json
{
  "id": "adf7303c-f45b-426f-a3dc-95e2d2b575ef",
  "order_id": "f99a24dd-6a9a-4d06-94f4-153c6a869be7",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d6b2b4e3-62ea-4a8a-9127-1be511519f06",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/f99a24dd-6a9a-4d06-94f4-153c6a869be7/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T17:49:16.822105Z",
      "actor": {
        "type": "CLIENT",
        "id": "5baee450-3c65-4ef2-b7ac-9fdf9311a4c2",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "f99a24dd-6a9a-4d06-94f4-153c6a869be7",
        "quote_id": "d79fff79-310d-4b90-a5d7-cfe5aca03966",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "52d1cc16-5a6a-46b4-9b96-e274b86ec68d"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T17:49:16.823667Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "f99a24dd-6a9a-4d06-94f4-153c6a869be7",
        "attempt_id": "92bc5bc4-7f28-4272-b269-3a5d0855b854",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "52d1cc16-5a6a-46b4-9b96-e274b86ec68d"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T17:49:16.841266Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "398f70c6-113b-46bd-a5a4-00926bac3ab9",
        "order_id": "f99a24dd-6a9a-4d06-94f4-153c6a869be7",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "52d1cc16-5a6a-46b4-9b96-e274b86ec68d"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-30T17:49:17.22809Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "398f70c6-113b-46bd-a5a4-00926bac3ab9",
        "order_id": "f99a24dd-6a9a-4d06-94f4-153c6a869be7"
      },
      "correlation_id": "d7adfa9e-7cad-4e7d-9592-bb7e94ecf79a"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order f99a24dd-6a9a-4d06-94f4-153c6a869be7 — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/f99a24dd-6a9a-4d06-94f4-153c6a869be7` → **200**

```json
{
  "id": "f99a24dd-6a9a-4d06-94f4-153c6a869be7",
  "short_number": 13,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "5baee450-3c65-4ef2-b7ac-9fdf9311a4c2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "adf7303c-f45b-426f-a3dc-95e2d2b575ef",
    "order_id": "f99a24dd-6a9a-4d06-94f4-153c6a869be7",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "d6b2b4e3-62ea-4a8a-9127-1be511519f06",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T17:49:16.821701Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/f99a24dd-6a9a-4d06-94f4-153c6a869be7/cancel` → **200**

```json
{
  "command_id": "090bee1b-f6d5-4860-baa2-f9d16cd4327a",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "f99a24dd-6a9a-4d06-94f4-153c6a869be7",
  "short_number": 13,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "5baee450-3c65-4ef2-b7ac-9fdf9311a4c2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "adf7303c-f45b-426f-a3dc-95e2d2b575ef",
    "order_id": "f99a24dd-6a9a-4d06-94f4-153c6a869be7",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "d6b2b4e3-62ea-4a8a-9127-1be511519f06",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T17:49:16.821701Z",
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
  "session_id": "69ac4853-0af4-45e9-83a5-cbf81f3af83a",
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
  "last_heartbeat_at": "2026-10-30T17:49:14.286595Z",
  "last_location_at": "2026-10-30T17:49:14.286595Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/69ac4853-0af4-45e9-83a5-cbf81f3af83a/close` → **200**

```json
{
  "command_id": "f3105bb9-729c-4669-921f-1dbb058585ce",
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
  "session_id": "298bfc09-79e6-4e56-b74c-2249f3a4c222",
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
  "last_heartbeat_at": "2026-10-30T17:49:15.285128Z",
  "last_location_at": "2026-10-30T17:49:15.285128Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/298bfc09-79e6-4e56-b74c-2249f3a4c222/close` → **200**

```json
{
  "command_id": "1db04b41-4821-43e0-b559-6cf2bf467813",
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
  "device_ref": "sandbox-29966"
}
```

```json
{
  "challenge_id": "2a72dca2-70bf-4f4f-92a4-087115d2ac54",
  "expires_at": "2026-10-30T17:54:19.002187168Z",
  "resend_available_at": "2026-10-30T17:49:20.002187168Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "067241",
  "sent_at": "2026-10-30T17:49:19.004161778Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2a72dca2-70bf-4f4f-92a4-087115d2ac54",
  "code": "067241",
  "device_ref": "sandbox-29966"
}
```

```json
{
  "session_id": "7f92a4ae-ef40-462e-8fe4-38311d1ebef6",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4MzQ1OSwiaWF0IjoxNzkzMzgyNTU5LCJqdGkiOiJmYTVmNmE2ZS1jMGRiLTQwOWUtOTlmMi04NGRhMDgyMzU2MzEiLCJzaWQiOiI3ZjkyYTRhZS1lZjQwLTQ2MmUtOGZlNC0zODMxMWQxZWJlZjYifQ.zEhAASeBy7IDM8cs2mr7CVHcvpRVgQQw3erX9x4GnCY",
  "access_expires_at": "2026-10-30T18:04:19.204870246Z",
  "refresh_token": "RpnaHP1JziGK-u4was-JIDMq_7eRd3X75Tq_x14VPUM",
  "refresh_expires_at": "2026-11-29T17:49:19.204403405Z",
  "account_created": false
}
```

`POST /api/driver/v1/documents/upload-sessions` → **201**

```json
{
  "command_id": "f712107e-64dd-4797-a965-f8a20a0e9546",
  "content_type": "application/pdf",
  "size_bytes": 87
}
```

```json
{
  "file_id": "9a0e93e7-316e-4ab9-abbd-7661f0d011dd",
  "upload_path": "/api/driver/v1/uploads/9a0e93e7-316e-4ab9-abbd-7661f0d011dd",
  "expires_at": "2026-10-30T18:04:19.392605941Z",
  "max_bytes": 87
}
```

`PUT /api/driver/v1/uploads/9a0e93e7-316e-4ab9-abbd-7661f0d011dd` → **200**

```json
{
  "file_id": "9a0e93e7-316e-4ab9-abbd-7661f0d011dd",
  "state": "SAFE",
  "content_type": "application/pdf",
  "size_bytes": 87,
  "reject_reason": null
}
```

## On the server's disk the file is not the PDF

Stored at `driver_document/2026-10/9a0e93e7-316e-4ab9-abbd-7661f0d011dd`, first bytes `425a46317a514a4d` (plain: `255044462d312e37` = %PDF-1.7).

## His download is exactly what he uploaded

`GET /api/driver/v1/files/9a0e93e7-316e-4ab9-abbd-7661f0d011dd` → **200**

SHA-256 uploaded `f2aaf6e80b0fb944a4040f4a770a60819f4e07e36855cbebd5ee7c3b4a99dddc`, downloaded `f2aaf6e80b0fb944a4040f4a770a60819f4e07e36855cbebd5ee7c3b4a99dddc`.

Done: document 9a0e93e7-316e-4ab9-abbd-7661f0d011dd is encrypted on disk and downloads unchanged.

# Scenario: driver-states

## Only the two drivers of this scenario are online: Near about 200 m from the pickup, Far about 600 m

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-31071"
}
```

```json
{
  "challenge_id": "34762171-ec87-4976-a6e3-c340310e10b1",
  "expires_at": "2026-10-30T17:54:19.649235808Z",
  "resend_available_at": "2026-10-30T17:49:20.649235808Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "094589",
  "sent_at": "2026-10-30T17:49:19.651084286Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "34762171-ec87-4976-a6e3-c340310e10b1",
  "code": "094589",
  "device_ref": "sandbox-31071"
}
```

```json
{
  "session_id": "8b15590e-4cc5-44e0-8ce8-1bb11aa4b78e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4MzQ1OSwiaWF0IjoxNzkzMzgyNTU5LCJqdGkiOiIwY2QzMjM5NC0yMTQ2LTRiODAtYjJjZS1lMDIzNzk2YjBhN2UiLCJzaWQiOiI4YjE1NTkwZS00Y2M1LTQ0ZTAtOGNlOC0xYmIxMWFhNGI3OGUifQ.zYrsxT6oAmKPR-fKuItpyJSlIT-nm4NYhKFTCVf3DgU",
  "access_expires_at": "2026-10-30T18:04:19.852470392Z",
  "refresh_token": "1aT272pgcmhPRdOckEk6vb2gorC9kD0LisLn-kvpj-c",
  "refresh_expires_at": "2026-11-29T17:49:19.852074803Z",
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
  "device_ref": "sandbox-2256"
}
```

```json
{
  "challenge_id": "44eae3b6-5bc3-41e3-bb5e-2e228c4da1f0",
  "expires_at": "2026-10-30T17:54:20.241417857Z",
  "resend_available_at": "2026-10-30T17:49:21.241417857Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "313795",
  "sent_at": "2026-10-30T17:49:20.24342721Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "44eae3b6-5bc3-41e3-bb5e-2e228c4da1f0",
  "code": "313795",
  "device_ref": "sandbox-2256"
}
```

```json
{
  "session_id": "28bd30ab-812c-4167-9d2b-c36599566fb0",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4MzQ2MCwiaWF0IjoxNzkzMzgyNTYwLCJqdGkiOiJjYjU4Y2FkZC0xOTI0LTQwN2MtYTBiNi1iNTdlNjU4NTY0NTkiLCJzaWQiOiIyOGJkMzBhYi04MTJjLTQxNjctOWQyYi1jMzY1OTk1NjZmYjAifQ.zVgb4yxGk9hWyi7VP2RBgBMWS7URJFXVhCe_8e02OKU",
  "access_expires_at": "2026-10-30T18:04:20.447625022Z",
  "refresh_token": "RlhFbIMMjJuS0RTz18uTVZJTgnaNY1O-UT1kwZD_j60",
  "refresh_expires_at": "2026-11-29T17:49:20.44724697Z",
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
  "command_id": "44f53e3e-7943-454b-a423-f3926c0e3c0d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T17:49:20Z",
    "sequence": 1793382560828
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f6804979-c54f-43c9-85f3-956ce13f55d1",
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
  "last_heartbeat_at": "2026-10-30T17:49:20.84379Z",
  "last_location_at": "2026-10-30T17:49:20.84379Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-3068"
}
```

```json
{
  "challenge_id": "16bf20bd-a08a-4d4d-87de-0666fdb1a994",
  "expires_at": "2026-10-30T17:54:21.028397205Z",
  "resend_available_at": "2026-10-30T17:49:22.028397205Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "525561",
  "sent_at": "2026-10-30T17:49:21.030328685Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "16bf20bd-a08a-4d4d-87de-0666fdb1a994",
  "code": "525561",
  "device_ref": "sandbox-3068"
}
```

```json
{
  "session_id": "ecef6de6-adfc-491b-885a-d992d8179010",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4MzQ2MSwiaWF0IjoxNzkzMzgyNTYxLCJqdGkiOiI0ZmJiZjJiNi0wN2RjLTQxZjEtODczNC00ZGVjOGZlNjM2ZTMiLCJzaWQiOiJlY2VmNmRlNi1hZGZjLTQ5MWItODg1YS1kOTkyZDgxNzkwMTAifQ.XW4pd9-HhqcnndtKn_3NHzt4hR-kgtsgq8TuSJy8Xi8",
  "access_expires_at": "2026-10-30T18:04:21.243325946Z",
  "refresh_token": "G1zEruBWojYkjOuur2UORhzRoD2k-EybDeJKe-Z9JNY",
  "refresh_expires_at": "2026-11-29T17:49:21.242933782Z",
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
  "command_id": "7a0a0a6a-ec6a-42f1-96c7-1a4d015ad923",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T17:49:21Z",
    "sequence": 1793382561622
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "a1257719-5895-4248-8378-a661c8dc8afb",
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
  "last_heartbeat_at": "2026-10-30T17:49:21.637404Z",
  "last_location_at": "2026-10-30T17:49:21.637404Z",
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
  "session_id": "69c1554d-fd78-4603-9ccc-c7cc15a9e98d",
  "subject": {
    "type": "STAFF",
    "id": "c1a6f303-45cb-4836-9719-3861c6b8ed9b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMWE2ZjMwMy00NWNiLTQ4MzYtOTcxOS0zODYxYzZiOGVkOWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODM0NjIsImlhdCI6MTc5MzM4MjU2MiwianRpIjoiNmE2NGI5OTMtMDg0YS00NzBjLTgxMTUtMjA1YWZhYWQ1NmEzIiwic2lkIjoiNjljMTU1NGQtZmQ3OC00NjAzLTljY2MtYzdjYzE1YTllOThkIn0.FDotg9nT9pcuFTQMeu_hadDmw-fK_FLJrCfJMJicCzE",
  "access_expires_at": "2026-10-30T18:04:22.029214288Z",
  "refresh_token": "pi9gA6luTdi3d-fPXhWjiIzxRNpH7hlgKP2c7rOzlqk",
  "refresh_expires_at": "2026-10-31T05:49:22.02883941Z",
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
  "session_id": "0e072d5b-e3cc-4842-9592-36b98d3ed7ce",
  "subject": {
    "type": "STAFF",
    "id": "c1a6f303-45cb-4836-9719-3861c6b8ed9b"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMWE2ZjMwMy00NWNiLTQ4MzYtOTcxOS0zODYxYzZiOGVkOWIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODM0NjIsImlhdCI6MTc5MzM4MjU2MiwianRpIjoiMTg4OTU3ZDQtMDg3ZS00MjRhLWJlNTEtYjNjOTBkMGNmMjM4Iiwic2lkIjoiMGUwNzJkNWItZTNjYy00ODQyLTk1OTItMzZiOThkM2VkN2NlIn0.aPttjK6zKSxKpFB_IXdKS90XMdZg3XBBAMBoeYMHdfw",
  "access_expires_at": "2026-10-30T18:04:22.41084186Z",
  "refresh_token": "zOsWZTesOYf0hkreLJDxWktput5AuNHTIzXob35zqHo",
  "refresh_expires_at": "2026-10-31T05:49:22.41049225Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380681036106",
  "device_ref": "sandbox-13068"
}
```

```json
{
  "challenge_id": "03417a46-a484-474a-9e1f-a6baa19ed154",
  "expires_at": "2026-10-30T17:54:22.59137352Z",
  "resend_available_at": "2026-10-30T17:49:23.59137352Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380681036106` → **200**

```json
{
  "phone": "+380681036106",
  "audience": "CLIENT",
  "code": "900325",
  "sent_at": "2026-10-30T17:49:22.594018366Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "03417a46-a484-474a-9e1f-a6baa19ed154",
  "code": "900325",
  "device_ref": "sandbox-13068"
}
```

```json
{
  "session_id": "239498ed-8280-4f92-aa83-3723057cd7a1",
  "subject": {
    "type": "CLIENT",
    "id": "9fb3356d-e57a-4a67-b895-681ae71dc638"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmIzMzU2ZC1lNTdhLTRhNjctYjg5NS02ODFhZTcxZGM2MzgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzgzNDYyLCJpYXQiOjE3OTMzODI1NjIsImp0aSI6ImNiNjIxMWJjLWI2MjUtNDc5ZS1iOGUzLTQ4ZDgzMmYzMTI5MCIsInNpZCI6IjIzOTQ5OGVkLTgyODAtNGY5Mi1hYTgzLTM3MjMwNTdjZDdhMSJ9.DH4A9JzO2bLa_Tnii-tih6-CsAMY1_rh6Y4ZQydbDHc",
  "access_expires_at": "2026-10-30T18:04:22.796389021Z",
  "refresh_token": "eKhGfBhonQi3wmyBHrgL0FYEP9kPoOShl46ojw6UEQY",
  "refresh_expires_at": "2026-11-29T17:49:22.795724976Z",
  "account_created": true
}
```

## E2: Near has the offer and pauses: the offer is revoked and Far gets the order at once

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "3d0ad316-a147-4c70-adc4-986e540bf7ba",
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
  "id": "d0c5c8fc-22e9-4313-a971-5124426a5ebe",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T17:54:23.044777Z",
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
  "command_id": "d5529703-30a6-444b-b537-cd200ab69123",
  "quote_id": "d0c5c8fc-22e9-4313-a971-5124426a5ebe",
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
  "id": "ac0e19da-e333-4a62-af8e-69deb525d94c",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9fb3356d-e57a-4a67-b895-681ae71dc638",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T17:49:23.239608Z",
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
    "id": "e06c8d90-49cd-4a17-9d38-979c5341515c",
    "order_id": "ac0e19da-e333-4a62-af8e-69deb525d94c",
    "expires_at": "2026-10-30T17:49:38.242404Z",
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
  "session_id": "f6804979-c54f-43c9-85f3-956ce13f55d1",
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
  "last_heartbeat_at": "2026-10-30T17:49:20.84379Z",
  "last_location_at": "2026-10-30T17:49:20.84379Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

`POST /api/driver/v1/work-sessions/f6804979-c54f-43c9-85f3-956ce13f55d1/pause` → **200**

```json
{
  "command_id": "ac449ace-f170-4630-8a96-06a9bc27cb83",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f6804979-c54f-43c9-85f3-956ce13f55d1",
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
  "last_heartbeat_at": "2026-10-30T17:49:20.84379Z",
  "last_location_at": "2026-10-30T17:49:20.84379Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/offers/e06c8d90-49cd-4a17-9d38-979c5341515c/accept` → **409**

```json
{
  "command_id": "179bef4b-6437-4648-9b96-570a717ae30b"
}
```

```json
{
  "instance": "/api/driver/v1/offers/e06c8d90-49cd-4a17-9d38-979c5341515c/accept",
  "status": 409,
  "title": "Offer revoked",
  "type": "https://errors.blizz.taxi/offer-revoked",
  "code": "OFFER_REVOKED",
  "correlation_id": "42661390-0e89-4a01-829a-c6d10a00d51f"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "487ad746-ea60-4c76-a18f-a7bc0384408d",
    "order_id": "ac0e19da-e333-4a62-af8e-69deb525d94c",
    "expires_at": "2026-10-30T17:49:38.830333Z",
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

`POST /api/driver/v1/offers/487ad746-ea60-4c76-a18f-a7bc0384408d/reject` → **204**

```json
{
  "command_id": "34320e62-5cff-47ce-9f97-9e829403ce96"
}
```

`GET /api/operator/v1/orders/ac0e19da-e333-4a62-af8e-69deb525d94c/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T17:49:23.240022Z",
      "actor": {
        "type": "CLIENT",
        "id": "9fb3356d-e57a-4a67-b895-681ae71dc638",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "ac0e19da-e333-4a62-af8e-69deb525d94c",
        "quote_id": "d0c5c8fc-22e9-4313-a971-5124426a5ebe",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "459ad52a-6cd0-44c4-8742-bfa541669117"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T17:49:23.241735Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "ac0e19da-e333-4a62-af8e-69deb525d94c",
        "attempt_id": "df8a2765-cd92-4be0-8f75-b259dcbdb0a4",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "459ad52a-6cd0-44c4-8742-bfa541669117"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T17:49:23.259587Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "e06c8d90-49cd-4a17-9d38-979c5341515c",
        "order_id": "ac0e19da-e333-4a62-af8e-69deb525d94c",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "459ad52a-6cd0-44c4-8742-bfa541669117"
    },
    {
      "sequence": 3,
      "type": "OfferRevoked",
      "occurred_at": "2026-10-30T17:49:23.829518Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": "DRIVER_PAUSED",
      "details": {
        "reason": "DRIVER_PAUSED",
        "offer_id": "e06c8d90-49cd-4a17-9d38-979c5341515c",
        "order_id": "ac0e19da-e333-4a62-af8e-69deb525d94c",
        "driver_id": "5a000000-0000-4000-8000-000000000401"
      },
      "correlation_id": "74f80689-7a4e-4b0b-93ab-7bd52e1fbc6d"
    },
```

`GET /api/operator/v1/orders/ac0e19da-e333-4a62-af8e-69deb525d94c` → **200**

```json
{
  "id": "ac0e19da-e333-4a62-af8e-69deb525d94c",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "9fb3356d-e57a-4a67-b895-681ae71dc638",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T17:49:23.239608Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/ac0e19da-e333-4a62-af8e-69deb525d94c/cancel` → **200**

```json
{
  "command_id": "abf1d9af-3e4f-4906-b3e4-d26436d2f9e5",
  "expected_version": 6,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "ac0e19da-e333-4a62-af8e-69deb525d94c",
  "short_number": 14,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 7,
  "channel": "APP",
  "payer_client_id": "9fb3356d-e57a-4a67-b895-681ae71dc638",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T17:49:23.239608Z",
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

E2: offer e06c8d90-49cd-4a17-9d38-979c5341515c revoked by the pause, the late accept got OFFER_REVOKED, Far had the order next.

## E5: pause and accept sent at the same moment, five rounds; Far is offline so each order goes to Near

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "a1257719-5895-4248-8378-a661c8dc8afb",
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
  "last_heartbeat_at": "2026-10-30T17:49:21.637404Z",
  "last_location_at": "2026-10-30T17:49:21.637404Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a1257719-5895-4248-8378-a661c8dc8afb/close` → **200**

```json
{
  "command_id": "f01013fb-24c0-49a8-9317-c9b8cfcb4e96",
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
  "session_id": "f6804979-c54f-43c9-85f3-956ce13f55d1",
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
  "last_heartbeat_at": "2026-10-30T17:49:20.84379Z",
  "last_location_at": "2026-10-30T17:49:20.84379Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/work-sessions/f6804979-c54f-43c9-85f3-956ce13f55d1/resume` → **200**

```json
{
  "command_id": "374aa392-608a-4e46-a469-e716a8f28900",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f6804979-c54f-43c9-85f3-956ce13f55d1",
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
  "last_heartbeat_at": "2026-10-30T17:49:20.84379Z",
  "last_location_at": "2026-10-30T17:49:20.84379Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f6804979-c54f-43c9-85f3-956ce13f55d1/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T17:49:25Z",
    "sequence": 1793382565836
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f6804979-c54f-43c9-85f3-956ce13f55d1",
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
  "last_heartbeat_at": "2026-10-30T17:49:25.853659Z",
  "last_location_at": "2026-10-30T17:49:25.853659Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "7b172515-575b-4829-884f-8ff811fa99ba",
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
  "id": "5b259684-a189-4412-aee5-13a4415820a3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T17:54:26.041003Z",
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
  "command_id": "d49634ce-8e9e-4bdd-ba57-9e7963ca961a",
  "quote_id": "5b259684-a189-4412-aee5-13a4415820a3",
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
  "id": "dc72b81b-bbee-40e5-b135-fa3edcf508ec",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9fb3356d-e57a-4a67-b895-681ae71dc638",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T17:49:26.237512Z",
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
    "id": "4b99eaaa-37b1-42d3-bf2a-ef91f460d836",
    "order_id": "dc72b81b-bbee-40e5-b135-fa3edcf508ec",
    "expires_at": "2026-10-30T17:49:41.239709Z",
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
  "session_id": "f6804979-c54f-43c9-85f3-956ce13f55d1",
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
  "last_heartbeat_at": "2026-10-30T17:49:25.853659Z",
  "last_location_at": "2026-10-30T17:49:25.853659Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

Round 1, at the same moment:

`POST /api/driver/v1/offers/4b99eaaa-37b1-42d3-bf2a-ef91f460d836/accept` → **200**

```json
{
  "id": "9f996bfc-2ee1-4f72-b201-4613b8115482",
  "order_id": "dc72b81b-bbee-40e5-b135-fa3edcf508ec",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "1c348d3d-1da5-44f4-bdbd-28e29d111f6f",
  "trip_phase": "TO_PICKUP"
}
```

`POST /api/driver/v1/work-sessions/f6804979-c54f-43c9-85f3-956ce13f55d1/pause` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f6804979-c54f-43c9-85f3-956ce13f55d1",
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
  "last_heartbeat_at": "2026-10-30T17:49:25.853659Z",
  "last_location_at": "2026-10-30T17:49:25.853659Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_PAUSE_AFTER_CURRENT",
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

Round 1: the accept won; the pause waits for the end of the trip.

`GET /api/operator/v1/orders/dc72b81b-bbee-40e5-b135-fa3edcf508ec` → **200**

```json
{
  "id": "dc72b81b-bbee-40e5-b135-fa3edcf508ec",
  "short_number": 15,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "9fb3356d-e57a-4a67-b895-681ae71dc638",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "9f996bfc-2ee1-4f72-b201-4613b8115482",
    "order_id": "dc72b81b-bbee-40e5-b135-fa3edcf508ec",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "1c348d3d-1da5-44f4-bdbd-28e29d111f6f",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T17:49:26.237512Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/dc72b81b-bbee-40e5-b135-fa3edcf508ec` → **200**

```json
{
  "id": "dc72b81b-bbee-40e5-b135-fa3edcf508ec",
  "short_number": 15,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "9fb3356d-e57a-4a67-b895-681ae71dc638",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "9f996bfc-2ee1-4f72-b201-4613b8115482",
    "order_id": "dc72b81b-bbee-40e5-b135-fa3edcf508ec",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "1c348d3d-1da5-44f4-bdbd-28e29d111f6f",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T17:49:26.237512Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/dc72b81b-bbee-40e5-b135-fa3edcf508ec/cancel` → **200**

```json
{
  "command_id": "addb28df-8a69-47b1-8fe6-79c93fb1edc4",
  "expected_version": 3,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "dc72b81b-bbee-40e5-b135-fa3edcf508ec",
  "short_number": 15,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "9fb3356d-e57a-4a67-b895-681ae71dc638",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "9f996bfc-2ee1-4f72-b201-4613b8115482",
    "order_id": "dc72b81b-bbee-40e5-b135-fa3edcf508ec",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "1c348d3d-1da5-44f4-bdbd-28e29d111f6f",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T17:49:26.237512Z",
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
  "session_id": "f6804979-c54f-43c9-85f3-956ce13f55d1",
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
  "last_heartbeat_at": "2026-10-30T17:49:25.853659Z",
  "last_location_at": "2026-10-30T17:49:25.853659Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/work-sessions/f6804979-c54f-43c9-85f3-956ce13f55d1/resume` → **200**

```json
{
  "command_id": "3be0aa0c-2dde-4ca0-b518-60803a649b6d",
  "expected_version": 4
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f6804979-c54f-43c9-85f3-956ce13f55d1",
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
  "last_heartbeat_at": "2026-10-30T17:49:25.853659Z",
  "last_location_at": "2026-10-30T17:49:25.853659Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f6804979-c54f-43c9-85f3-956ce13f55d1/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T17:49:27Z",
    "sequence": 1793382567896
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f6804979-c54f-43c9-85f3-956ce13f55d1",
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
  "last_heartbeat_at": "2026-10-30T17:49:27.911681Z",
  "last_location_at": "2026-10-30T17:49:27.911681Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "92b4f362-362e-45ea-83d4-913052507da0",
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
  "id": "f75bd152-4abc-4989-9eb4-b5859f324023",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T17:54:28.106874Z",
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
  "command_id": "43292595-9c1a-468e-950e-a1288492914d",
  "quote_id": "f75bd152-4abc-4989-9eb4-b5859f324023",
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
  "id": "71f5e4ea-0dd3-474b-a1c3-1d90fada5063",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9fb3356d-e57a-4a67-b895-681ae71dc638",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T17:49:28.304871Z",
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
    "id": "661a6991-1c87-4db0-983a-d8c27de29d91",
    "order_id": "71f5e4ea-0dd3-474b-a1c3-1d90fada5063",
    "expires_at": "2026-10-30T17:49:43.30721Z",
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
  "session_id": "f6804979-c54f-43c9-85f3-956ce13f55d1",
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
  "last_heartbeat_at": "2026-10-30T17:49:27.911681Z",
  "last_location_at": "2026-10-30T17:49:27.911681Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

Round 2, at the same moment:

`POST /api/driver/v1/offers/661a6991-1c87-4db0-983a-d8c27de29d91/accept` → **200**

```json
{
  "id": "0bbf8c35-63b5-461f-af26-42309e3de527",
  "order_id": "71f5e4ea-0dd3-474b-a1c3-1d90fada5063",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "8ec7016f-d74c-44c4-a87d-28de36beba7e",
  "trip_phase": "TO_PICKUP"
}
```

`POST /api/driver/v1/work-sessions/f6804979-c54f-43c9-85f3-956ce13f55d1/pause` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f6804979-c54f-43c9-85f3-956ce13f55d1",
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
  "last_heartbeat_at": "2026-10-30T17:49:27.911681Z",
  "last_location_at": "2026-10-30T17:49:27.911681Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_PAUSE_AFTER_CURRENT",
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

Round 2: the accept won; the pause waits for the end of the trip.

`GET /api/operator/v1/orders/71f5e4ea-0dd3-474b-a1c3-1d90fada5063` → **200**

```json
{
  "id": "71f5e4ea-0dd3-474b-a1c3-1d90fada5063",
  "short_number": 16,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "9fb3356d-e57a-4a67-b895-681ae71dc638",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "0bbf8c35-63b5-461f-af26-42309e3de527",
    "order_id": "71f5e4ea-0dd3-474b-a1c3-1d90fada5063",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "8ec7016f-d74c-44c4-a87d-28de36beba7e",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T17:49:28.304871Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/71f5e4ea-0dd3-474b-a1c3-1d90fada5063` → **200**

```json
{
  "id": "71f5e4ea-0dd3-474b-a1c3-1d90fada5063",
  "short_number": 16,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "9fb3356d-e57a-4a67-b895-681ae71dc638",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "0bbf8c35-63b5-461f-af26-42309e3de527",
    "order_id": "71f5e4ea-0dd3-474b-a1c3-1d90fada5063",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "8ec7016f-d74c-44c4-a87d-28de36beba7e",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T17:49:28.304871Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/71f5e4ea-0dd3-474b-a1c3-1d90fada5063/cancel` → **200**

```json
{
  "command_id": "a8367d44-7713-48ca-91b9-cf69c74808bf",
  "expected_version": 3,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "71f5e4ea-0dd3-474b-a1c3-1d90fada5063",
  "short_number": 16,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "9fb3356d-e57a-4a67-b895-681ae71dc638",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "0bbf8c35-63b5-461f-af26-42309e3de527",
    "order_id": "71f5e4ea-0dd3-474b-a1c3-1d90fada5063",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "8ec7016f-d74c-44c4-a87d-28de36beba7e",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T17:49:28.304871Z",
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
  "session_id": "f6804979-c54f-43c9-85f3-956ce13f55d1",
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
  "last_heartbeat_at": "2026-10-30T17:49:27.911681Z",
  "last_location_at": "2026-10-30T17:49:27.911681Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/work-sessions/f6804979-c54f-43c9-85f3-956ce13f55d1/resume` → **200**

```json
{
  "command_id": "adf1fa22-e77e-464d-a5a9-2a30d9542fd9",
  "expected_version": 7
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f6804979-c54f-43c9-85f3-956ce13f55d1",
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
  "last_heartbeat_at": "2026-10-30T17:49:27.911681Z",
  "last_location_at": "2026-10-30T17:49:27.911681Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f6804979-c54f-43c9-85f3-956ce13f55d1/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T17:49:29Z",
    "sequence": 1793382569926
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f6804979-c54f-43c9-85f3-956ce13f55d1",
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
  "last_heartbeat_at": "2026-10-30T17:49:29.941549Z",
  "last_location_at": "2026-10-30T17:49:29.941549Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c464abb7-f72e-4ba9-8f85-62de6c218d44",
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
  "id": "09e8dc5b-f7f4-47a2-92fd-70479a227bad",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T17:54:30.138260Z",
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
  "command_id": "de572b86-3283-42b7-86c7-93f270b04f1e",
  "quote_id": "09e8dc5b-f7f4-47a2-92fd-70479a227bad",
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
  "id": "524d2fe1-799f-48a5-b22f-6fc8ec11b92c",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9fb3356d-e57a-4a67-b895-681ae71dc638",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T17:49:30.339254Z",
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
    "id": "3787d94f-8dbd-4b52-a5c0-bcf6a012481e",
    "order_id": "524d2fe1-799f-48a5-b22f-6fc8ec11b92c",
    "expires_at": "2026-10-30T17:49:45.341785Z",
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
  "session_id": "f6804979-c54f-43c9-85f3-956ce13f55d1",
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
  "last_heartbeat_at": "2026-10-30T17:49:29.941549Z",
  "last_location_at": "2026-10-30T17:49:29.941549Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

Round 3, at the same moment:

`POST /api/driver/v1/offers/3787d94f-8dbd-4b52-a5c0-bcf6a012481e/accept` → **200**

```json
{
  "id": "3f38abad-8962-4c9e-b5f5-9e026caca2f9",
  "order_id": "524d2fe1-799f-48a5-b22f-6fc8ec11b92c",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b76c8a0b-163a-43e0-ac55-35b2d8ace512",
  "trip_phase": "TO_PICKUP"
}
```

`POST /api/driver/v1/work-sessions/f6804979-c54f-43c9-85f3-956ce13f55d1/pause` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f6804979-c54f-43c9-85f3-956ce13f55d1",
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
  "last_heartbeat_at": "2026-10-30T17:49:29.941549Z",
  "last_location_at": "2026-10-30T17:49:29.941549Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_PAUSE_AFTER_CURRENT",
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

Round 3: the accept won; the pause waits for the end of the trip.

`GET /api/operator/v1/orders/524d2fe1-799f-48a5-b22f-6fc8ec11b92c` → **200**

```json
{
  "id": "524d2fe1-799f-48a5-b22f-6fc8ec11b92c",
  "short_number": 17,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "9fb3356d-e57a-4a67-b895-681ae71dc638",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "3f38abad-8962-4c9e-b5f5-9e026caca2f9",
    "order_id": "524d2fe1-799f-48a5-b22f-6fc8ec11b92c",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "b76c8a0b-163a-43e0-ac55-35b2d8ace512",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T17:49:30.339254Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/524d2fe1-799f-48a5-b22f-6fc8ec11b92c` → **200**

```json
{
  "id": "524d2fe1-799f-48a5-b22f-6fc8ec11b92c",
  "short_number": 17,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "9fb3356d-e57a-4a67-b895-681ae71dc638",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "3f38abad-8962-4c9e-b5f5-9e026caca2f9",
    "order_id": "524d2fe1-799f-48a5-b22f-6fc8ec11b92c",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "b76c8a0b-163a-43e0-ac55-35b2d8ace512",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T17:49:30.339254Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/524d2fe1-799f-48a5-b22f-6fc8ec11b92c/cancel` → **200**

```json
{
  "command_id": "1665c3e4-56e3-4939-87e5-4c6af1e5802c",
  "expected_version": 3,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "524d2fe1-799f-48a5-b22f-6fc8ec11b92c",
  "short_number": 17,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "9fb3356d-e57a-4a67-b895-681ae71dc638",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "3f38abad-8962-4c9e-b5f5-9e026caca2f9",
    "order_id": "524d2fe1-799f-48a5-b22f-6fc8ec11b92c",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "b76c8a0b-163a-43e0-ac55-35b2d8ace512",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T17:49:30.339254Z",
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
  "session_id": "f6804979-c54f-43c9-85f3-956ce13f55d1",
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
  "last_heartbeat_at": "2026-10-30T17:49:29.941549Z",
  "last_location_at": "2026-10-30T17:49:29.941549Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/work-sessions/f6804979-c54f-43c9-85f3-956ce13f55d1/resume` → **200**

```json
{
  "command_id": "4dac7d39-2001-412d-8edd-e0fe33e80319",
  "expected_version": 10
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f6804979-c54f-43c9-85f3-956ce13f55d1",
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
  "last_heartbeat_at": "2026-10-30T17:49:29.941549Z",
  "last_location_at": "2026-10-30T17:49:29.941549Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f6804979-c54f-43c9-85f3-956ce13f55d1/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T17:49:31Z",
    "sequence": 1793382571918
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f6804979-c54f-43c9-85f3-956ce13f55d1",
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
  "last_heartbeat_at": "2026-10-30T17:49:31.93394Z",
  "last_location_at": "2026-10-30T17:49:31.93394Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "5470d16e-d91f-40dc-9f61-f148feeeb0d3",
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
  "id": "39a929cf-a9ba-4314-a38b-b3ce62b19427",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T17:54:32.133946Z",
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
  "command_id": "97e50df4-05d3-4129-ae36-63ee92d657fd",
  "quote_id": "39a929cf-a9ba-4314-a38b-b3ce62b19427",
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
  "id": "88c45332-914d-4d96-80db-1e25bd5159ef",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9fb3356d-e57a-4a67-b895-681ae71dc638",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T17:49:32.330184Z",
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
    "id": "bbd08d62-cca9-49e0-aa4d-7069e735eedd",
    "order_id": "88c45332-914d-4d96-80db-1e25bd5159ef",
    "expires_at": "2026-10-30T17:49:47.332135Z",
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
  "session_id": "f6804979-c54f-43c9-85f3-956ce13f55d1",
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
  "last_heartbeat_at": "2026-10-30T17:49:31.93394Z",
  "last_location_at": "2026-10-30T17:49:31.93394Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

Round 4, at the same moment:

`POST /api/driver/v1/offers/bbd08d62-cca9-49e0-aa4d-7069e735eedd/accept` → **409**

```json
{
  "instance": "/api/driver/v1/offers/bbd08d62-cca9-49e0-aa4d-7069e735eedd/accept",
  "status": 409,
  "title": "Offer revoked",
  "type": "https://errors.blizz.taxi/offer-revoked",
  "code": "OFFER_REVOKED",
  "correlation_id": "4493bd57-786f-4b3f-b586-cb7798b92d45"
}
```

`POST /api/driver/v1/work-sessions/f6804979-c54f-43c9-85f3-956ce13f55d1/pause` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f6804979-c54f-43c9-85f3-956ce13f55d1",
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
  "last_heartbeat_at": "2026-10-30T17:49:31.93394Z",
  "last_location_at": "2026-10-30T17:49:31.93394Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

Round 4: the pause won; the accept got OFFER_REVOKED.

`GET /api/operator/v1/orders/88c45332-914d-4d96-80db-1e25bd5159ef` → **200**

```json
{
  "id": "88c45332-914d-4d96-80db-1e25bd5159ef",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "9fb3356d-e57a-4a67-b895-681ae71dc638",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T17:49:32.330184Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/88c45332-914d-4d96-80db-1e25bd5159ef` → **200**

```json
{
  "id": "88c45332-914d-4d96-80db-1e25bd5159ef",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "9fb3356d-e57a-4a67-b895-681ae71dc638",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T17:49:32.330184Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/88c45332-914d-4d96-80db-1e25bd5159ef/cancel` → **200**

```json
{
  "command_id": "9ddfb261-5587-435e-9593-1fa1245900c0",
  "expected_version": 4,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "88c45332-914d-4d96-80db-1e25bd5159ef",
  "short_number": 18,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "9fb3356d-e57a-4a67-b895-681ae71dc638",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T17:49:32.330184Z",
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
  "session_id": "f6804979-c54f-43c9-85f3-956ce13f55d1",
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
  "last_heartbeat_at": "2026-10-30T17:49:31.93394Z",
  "last_location_at": "2026-10-30T17:49:31.93394Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/work-sessions/f6804979-c54f-43c9-85f3-956ce13f55d1/resume` → **200**

```json
{
  "command_id": "09eb2a16-cf52-4a9c-b2db-2e03c6f210ab",
  "expected_version": 12
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f6804979-c54f-43c9-85f3-956ce13f55d1",
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
  "last_heartbeat_at": "2026-10-30T17:49:31.93394Z",
  "last_location_at": "2026-10-30T17:49:31.93394Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f6804979-c54f-43c9-85f3-956ce13f55d1/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T17:49:33Z",
    "sequence": 1793382573900
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f6804979-c54f-43c9-85f3-956ce13f55d1",
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
  "last_heartbeat_at": "2026-10-30T17:49:33.915879Z",
  "last_location_at": "2026-10-30T17:49:33.915879Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "077ea97a-0e35-4ef3-8c07-87d1b5b2ed7a",
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
  "id": "11f29444-89cb-44ed-abfa-b33fe0e7c02f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T17:54:34.103992Z",
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
  "command_id": "e0ece11f-e007-4e2e-ba07-2ba9dca48d46",
  "quote_id": "11f29444-89cb-44ed-abfa-b33fe0e7c02f",
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
  "id": "25638807-4324-4fc2-8f96-0b5eb19b0485",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9fb3356d-e57a-4a67-b895-681ae71dc638",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T17:49:34.297187Z",
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
    "id": "ddd99c05-6f9a-4f6c-83ca-ff056a40ad35",
    "order_id": "25638807-4324-4fc2-8f96-0b5eb19b0485",
    "expires_at": "2026-10-30T17:49:49.299434Z",
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
  "session_id": "f6804979-c54f-43c9-85f3-956ce13f55d1",
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
  "last_heartbeat_at": "2026-10-30T17:49:33.915879Z",
  "last_location_at": "2026-10-30T17:49:33.915879Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

Round 5, at the same moment:

`POST /api/driver/v1/offers/ddd99c05-6f9a-4f6c-83ca-ff056a40ad35/accept` → **200**

```json
{
  "id": "63518bb4-56ed-43d3-9a68-f015b87ac0fe",
  "order_id": "25638807-4324-4fc2-8f96-0b5eb19b0485",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "1c299e10-b2f9-45cb-a6fd-5343f31ac57b",
  "trip_phase": "TO_PICKUP"
}
```

`POST /api/driver/v1/work-sessions/f6804979-c54f-43c9-85f3-956ce13f55d1/pause` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f6804979-c54f-43c9-85f3-956ce13f55d1",
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
  "last_heartbeat_at": "2026-10-30T17:49:33.915879Z",
  "last_location_at": "2026-10-30T17:49:33.915879Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_PAUSE_AFTER_CURRENT",
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

Round 5: the accept won; the pause waits for the end of the trip.

`GET /api/operator/v1/orders/25638807-4324-4fc2-8f96-0b5eb19b0485` → **200**

```json
{
  "id": "25638807-4324-4fc2-8f96-0b5eb19b0485",
  "short_number": 19,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "9fb3356d-e57a-4a67-b895-681ae71dc638",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "63518bb4-56ed-43d3-9a68-f015b87ac0fe",
    "order_id": "25638807-4324-4fc2-8f96-0b5eb19b0485",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "1c299e10-b2f9-45cb-a6fd-5343f31ac57b",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T17:49:34.297187Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/25638807-4324-4fc2-8f96-0b5eb19b0485` → **200**

```json
{
  "id": "25638807-4324-4fc2-8f96-0b5eb19b0485",
  "short_number": 19,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "9fb3356d-e57a-4a67-b895-681ae71dc638",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "63518bb4-56ed-43d3-9a68-f015b87ac0fe",
    "order_id": "25638807-4324-4fc2-8f96-0b5eb19b0485",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "1c299e10-b2f9-45cb-a6fd-5343f31ac57b",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T17:49:34.297187Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/25638807-4324-4fc2-8f96-0b5eb19b0485/cancel` → **200**

```json
{
  "command_id": "1b07e060-2182-40b0-b089-fc2c6e73a551",
  "expected_version": 3,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "25638807-4324-4fc2-8f96-0b5eb19b0485",
  "short_number": 19,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "9fb3356d-e57a-4a67-b895-681ae71dc638",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "63518bb4-56ed-43d3-9a68-f015b87ac0fe",
    "order_id": "25638807-4324-4fc2-8f96-0b5eb19b0485",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "1c299e10-b2f9-45cb-a6fd-5343f31ac57b",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T17:49:34.297187Z",
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

E5: 4 rounds won by the accept, 1 by the pause; one winner each round, no 5xx.

## E4: a fix with 250 m accuracy keeps Near out of new orders; an accurate one brings him back

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f6804979-c54f-43c9-85f3-956ce13f55d1",
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
  "last_heartbeat_at": "2026-10-30T17:49:33.915879Z",
  "last_location_at": "2026-10-30T17:49:33.915879Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/work-sessions/f6804979-c54f-43c9-85f3-956ce13f55d1/resume` → **200**

```json
{
  "command_id": "bb307007-3530-488a-8a3e-87593cc0a52d",
  "expected_version": 15
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f6804979-c54f-43c9-85f3-956ce13f55d1",
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
  "last_heartbeat_at": "2026-10-30T17:49:33.915879Z",
  "last_location_at": "2026-10-30T17:49:33.915879Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f6804979-c54f-43c9-85f3-956ce13f55d1/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 250,
    "recorded_at": "2026-10-30T17:49:35Z",
    "sequence": 1793382575880
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f6804979-c54f-43c9-85f3-956ce13f55d1",
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
  "last_heartbeat_at": "2026-10-30T17:49:35.897669Z",
  "last_location_at": "2026-10-30T17:49:35.897669Z",
  "eligible": false,
  "ineligible_reasons": [
    "LOCATION_INACCURATE"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/work-sessions/f6804979-c54f-43c9-85f3-956ce13f55d1/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T17:49:36Z",
    "sequence": 1793382576830
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f6804979-c54f-43c9-85f3-956ce13f55d1",
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
  "last_heartbeat_at": "2026-10-30T17:49:36.098983Z",
  "last_location_at": "2026-10-30T17:49:36.098983Z",
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
  "at": "2026-10-30T17:49:36.298743982Z",
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
      "last_location_at": "2026-10-30T17:49:36.098983Z",
      "last_heartbeat_at": "2026-10-30T17:49:36.098983Z",
      "order_id": null
    }
  ]
}
```

Done: E2, E5 (4/1), E4 and last_heartbeat_at 2026-10-30T17:49:36.098983Z.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f6804979-c54f-43c9-85f3-956ce13f55d1",
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
  "last_heartbeat_at": "2026-10-30T17:49:36.098983Z",
  "last_location_at": "2026-10-30T17:49:36.098983Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f6804979-c54f-43c9-85f3-956ce13f55d1/close` → **200**

```json
{
  "command_id": "b638f4db-e3ec-4fff-a20a-f9cc0e2edec6",
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
  "session_id": "1611edd2-5060-4ac7-9c2e-741d5cc1151d",
  "subject": {
    "type": "STAFF",
    "id": "c1a6f303-45cb-4836-9719-3861c6b8ed9b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMWE2ZjMwMy00NWNiLTQ4MzYtOTcxOS0zODYxYzZiOGVkOWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODM0NzcsImlhdCI6MTc5MzM4MjU3NywianRpIjoiNDQxMmJiZjctYzUzYi00YjQ4LWIwNTUtNWM0NjUyMTkxMTkyIiwic2lkIjoiMTYxMWVkZDItNTA2MC00YWM3LTljMmUtNzQxZDVjYzExNTFkIn0.CkhIt3NWQT7lOw5nJNaCeIaf0RxHPyU4qCfTfGIU-o4",
  "access_expires_at": "2026-10-30T18:04:37.270492466Z",
  "refresh_token": "5a4il9ECnOkK1zy-S_79nQOL5uwWfd-ubHghRQhxvAo",
  "refresh_expires_at": "2026-10-31T05:49:37.270084228Z",
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
  "command_id": "a60db0ed-9061-4ef8-86b9-fdfac1bf6610",
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
  "changed_by": "c1a6f303-45cb-4836-9719-3861c6b8ed9b",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-30T17:49:37.657765Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "77b658bb-6450-4ca2-9688-bfa45ce171c9",
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
  "correlation_id": "9af161f5-40c2-4229-9716-4ce6671e8ec4",
  "current_version": 1
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "1928c5c2-0afd-4187-8291-79c4540c6f4d",
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
  "correlation_id": "c6f896ca-3ef5-4ef1-b3bf-72c6d6f8dafe"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639439626",
  "device_ref": "sandbox-28726"
}
```

```json
{
  "challenge_id": "174e23a3-1db1-4d44-aa6f-e7dade2def58",
  "expires_at": "2026-10-30T17:54:38.266716938Z",
  "resend_available_at": "2026-10-30T17:49:39.266716938Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639439626` → **200**

```json
{
  "phone": "+380639439626",
  "audience": "CLIENT",
  "code": "059630",
  "sent_at": "2026-10-30T17:49:38.268619899Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "174e23a3-1db1-4d44-aa6f-e7dade2def58",
  "code": "059630",
  "device_ref": "sandbox-28726"
}
```

```json
{
  "session_id": "aa2cb3ea-7196-4364-a1b8-0e72e40b0e13",
  "subject": {
    "type": "CLIENT",
    "id": "5bb661da-2d36-43f7-b961-e1409726a323"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YmI2NjFkYS0yZDM2LTQzZjctYjk2MS1lMTQwOTcyNmEzMjMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzgzNDc4LCJpYXQiOjE3OTMzODI1NzgsImp0aSI6ImVkYTgwZjZlLTFlZWQtNGMxMS05ODQyLWMyMmU0YmVjOTA5MCIsInNpZCI6ImFhMmNiM2VhLTcxOTYtNDM2NC1hMWI4LTBlNzJlNDBiMGUxMyJ9.bOi1QSnGU9rtozjqCPkEW3maUdSw30AKgHf5D_feM3w",
  "access_expires_at": "2026-10-30T18:04:38.473486517Z",
  "refresh_token": "023T96OVtCazrDaFSdx0FrIJwCfCN37L3mAv4kFHf-o",
  "refresh_expires_at": "2026-11-29T17:49:38.473087212Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "72293484-6e20-483e-9ec5-582a6d21e543",
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
  "id": "f4d910c3-af04-402d-835c-17dd3386414b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T17:54:38.658978Z",
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
  "command_id": "0511d1b3-ed94-4997-9ef0-871ac12f3a81",
  "quote_id": "f4d910c3-af04-402d-835c-17dd3386414b",
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
  "correlation_id": "4e8e8ecb-2635-46ad-9dc4-8f4f5d894d4f"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "d4566073-c3c6-4c88-b2b8-84b7a79eea1c",
  "quote_id": "f4d910c3-af04-402d-835c-17dd3386414b",
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
  "id": "200a6ac3-112d-4d8c-acd3-292c37914ec9",
  "short_number": 20,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5bb661da-2d36-43f7-b961-e1409726a323",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T17:49:39.046909Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/200a6ac3-112d-4d8c-acd3-292c37914ec9/cancel` → **200**

```json
{
  "command_id": "2d42586e-b987-4ba0-890a-09d4dcbe43c7",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "200a6ac3-112d-4d8c-acd3-292c37914ec9",
  "short_number": 20,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "5bb661da-2d36-43f7-b961-e1409726a323",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T17:49:39.046909Z",
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
  "command_id": "465a1bb1-df61-41bc-abd1-503651409689",
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
  "changed_by": "c1a6f303-45cb-4836-9719-3861c6b8ed9b",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-30T17:49:39.458458Z"
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
      "changed_by": "c1a6f303-45cb-4836-9719-3861c6b8ed9b",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-30T17:49:39.458458Z"
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
  "device_ref": "sandbox-28441"
}
```

```json
{
  "challenge_id": "248e7680-9fbe-470a-b7d4-e3ab161cc77c",
  "expires_at": "2026-10-30T17:54:40.07369604Z",
  "resend_available_at": "2026-10-30T17:49:41.07369604Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "063072",
  "sent_at": "2026-10-30T17:49:40.075739307Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "248e7680-9fbe-470a-b7d4-e3ab161cc77c",
  "code": "063072",
  "device_ref": "sandbox-28441"
}
```

```json
{
  "session_id": "be58eb82-3f59-4393-b91f-c5ba0beedf86",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4MzQ4MCwiaWF0IjoxNzkzMzgyNTgwLCJqdGkiOiIxMWEyNzFhNy02Nzc5LTRkN2UtODQzZC0wNjU0MWZlMTczMDciLCJzaWQiOiJiZTU4ZWI4Mi0zZjU5LTQzOTMtYjkxZi1jNWJhMGJlZWRmODYifQ.xlybt6eOrHTa_PXk9Uyrhb-Y_o3g0_Ja2QY41pteE2k",
  "access_expires_at": "2026-10-30T18:04:40.292351132Z",
  "refresh_token": "ysTvL6AoP2yo5JUKpLbi_J68oSNJWAaMYeTfxB3_1BE",
  "refresh_expires_at": "2026-11-29T17:49:40.291729311Z",
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
  "command_id": "38f46d8e-80c9-47b1-8366-1099624c5b97",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T17:49:40Z",
    "sequence": 1793382580672
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ab66cf55-0998-47f0-8aa5-b1b9f48e1eae",
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
  "last_heartbeat_at": "2026-10-30T17:49:40.687302Z",
  "last_location_at": "2026-10-30T17:49:40.687302Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679417969",
  "device_ref": "sandbox-20188"
}
```

```json
{
  "challenge_id": "ca888f18-07d7-4bb5-971f-fe511080238c",
  "expires_at": "2026-10-30T17:54:40.877239343Z",
  "resend_available_at": "2026-10-30T17:49:41.877239343Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380679417969` → **200**

```json
{
  "phone": "+380679417969",
  "audience": "CLIENT",
  "code": "216996",
  "sent_at": "2026-10-30T17:49:40.879059789Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ca888f18-07d7-4bb5-971f-fe511080238c",
  "code": "216996",
  "device_ref": "sandbox-20188"
}
```

```json
{
  "session_id": "2a05556a-11c5-4e45-82f8-2be465d9780b",
  "subject": {
    "type": "CLIENT",
    "id": "69d87422-07df-431d-888a-424f5d1b0744"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OWQ4NzQyMi0wN2RmLTQzMWQtODg4YS00MjRmNWQxYjA3NDQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzgzNDgxLCJpYXQiOjE3OTMzODI1ODEsImp0aSI6ImJmMGMwNzU1LTcwZGMtNDcyYy1iOTUzLWJlY2YzNTczNWE1NSIsInNpZCI6IjJhMDU1NTZhLTExYzUtNGU0NS04MmY4LTJiZTQ2NWQ5NzgwYiJ9.CBbcpqN8AGO7ragcvfcZn9mfLB5riHb7Ys9sp9ZzSGg",
  "access_expires_at": "2026-10-30T18:04:41.093542061Z",
  "refresh_token": "PCTNdD0TC5h8f0KJjnd0voVhQJabuU4OJKb0HiAoueI",
  "refresh_expires_at": "2026-11-29T17:49:41.093149677Z",
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
  "command_id": "afc7d40c-2549-4ac8-b11a-91ad8053d17e",
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
  "id": "2a883011-fdec-4d70-9c5a-98cc116127c4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T17:54:41.468122Z",
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
  "command_id": "72c36cb5-21cb-4286-8641-f97b8c828169",
  "platform": "ANDROID",
  "token": "sandbox-driver-a59484fd-191e-49e7-a560-f572078b26c6"
}
```

```json
{
  "id": "a65d9880-5a3b-4fd2-8be1-9c3b0600547d",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T17:49:41.667807Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "18371a72-e70c-4925-9805-710eee8d3a9c",
  "platform": "ANDROID",
  "token": "sandbox-rider-6070440e-69d7-4dff-9656-75a9c9fec117"
}
```

```json
{
  "id": "07ba53c2-ce5c-4937-bda2-5b4fc1afc568",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T17:49:41.857364Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "d7d6b62c-96b3-49ab-b1f8-f21337cb88be",
  "quote_id": "2a883011-fdec-4d70-9c5a-98cc116127c4",
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
  "id": "5bc725f3-1cbe-4def-834b-703c9460527d",
  "short_number": 21,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "69d87422-07df-431d-888a-424f5d1b0744",
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
  "created_at": "2026-10-30T17:49:42.051026Z",
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
    "id": "f2b5f3d9-e033-4809-b77c-cca8b8e6ef09",
    "order_id": "5bc725f3-1cbe-4def-834b-703c9460527d",
    "expires_at": "2026-10-30T17:49:57.052726Z",
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

`POST /api/driver/v1/offers/f2b5f3d9-e033-4809-b77c-cca8b8e6ef09/accept` → **200**

```json
{
  "command_id": "3b7fd7c8-9f4d-49e4-97bb-552208985be6"
}
```

```json
{
  "id": "083cf2c3-f6e8-49b8-ad31-bc998ac98f32",
  "order_id": "5bc725f3-1cbe-4def-834b-703c9460527d",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "ae374ca2-feb0-4059-b069-c4354f38145f",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-30T17:49:42.324Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-30T17:49:42.324Z` → **200**

```json
[
  {
    "at": "2026-10-30T17:49:42.785699437Z",
    "token_suffix": "8b26c6",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "type": "driver.offer",
      "event_type": "OfferMade",
      "event_id": "2e84ca20-79a0-4ead-aacb-949791086b20",
      "order_version": "2",
      "order_id": "5bc725f3-1cbe-4def-834b-703c9460527d"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380679417969&after=2026-10-30T17:49:42.324Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380679417969&after=2026-10-30T17:49:42.324Z` → **200**

```json
[
  {
    "at": "2026-10-30T17:49:43.78938795Z",
    "token_suffix": "fec117",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "type": "rider.driver-assigned",
      "event_type": "AssignmentCommitted",
      "event_id": "f3bcdfcd-a0db-4c7c-8950-476d2200f2c3",
      "order_version": "3",
      "order_id": "5bc725f3-1cbe-4def-834b-703c9460527d"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/5bc725f3-1cbe-4def-834b-703c9460527d/messages` → **201**

```json
{
  "command_id": "cb805a6d-59c8-4a68-b2f2-c97805383d0d",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "dfbd5706-c8c2-41af-ad10-e473373039f7",
  "order_id": "5bc725f3-1cbe-4def-834b-703c9460527d",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-30T17:49:44.715887751Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "ae374ca2-feb0-4059-b069-c4354f38145f",
  "order_id": "5bc725f3-1cbe-4def-834b-703c9460527d",
  "assignment_id": "083cf2c3-f6e8-49b8-ad31-bc998ac98f32",
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

`POST /api/driver/v1/trips/ae374ca2-feb0-4059-b069-c4354f38145f/messages` → **201**

```json
{
  "command_id": "79efca58-5bb1-42e6-8ecc-9bc383b8cdf3",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "a8835190-fbe6-4359-ae06-71d6a7887a65",
  "order_id": "5bc725f3-1cbe-4def-834b-703c9460527d",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-30T17:49:45.076284954Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/5bc725f3-1cbe-4def-834b-703c9460527d/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/ae374ca2-feb0-4059-b069-c4354f38145f/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380679417969"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/ab66cf55-0998-47f0-8aa5-b1b9f48e1eae/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T17:49:45Z",
    "sequence": 1793382585645
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ab66cf55-0998-47f0-8aa5-b1b9f48e1eae",
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
  "last_heartbeat_at": "2026-10-30T17:49:45.659942Z",
  "last_location_at": "2026-10-30T17:49:45.659942Z",
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
  "id": "ae374ca2-feb0-4059-b069-c4354f38145f",
  "order_id": "5bc725f3-1cbe-4def-834b-703c9460527d",
  "assignment_id": "083cf2c3-f6e8-49b8-ad31-bc998ac98f32",
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

`POST /api/driver/v1/trips/ae374ca2-feb0-4059-b069-c4354f38145f/arrive` → **200**

```json
{
  "command_id": "030835af-6e9a-4981-860b-9ec52ab0b7b1",
  "expected_version": 0
}
```

```json
{
  "id": "ae374ca2-feb0-4059-b069-c4354f38145f",
  "order_id": "5bc725f3-1cbe-4def-834b-703c9460527d",
  "assignment_id": "083cf2c3-f6e8-49b8-ad31-bc998ac98f32",
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
  "arrived_at": "2026-10-30T17:49:46.023931Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/ae374ca2-feb0-4059-b069-c4354f38145f/start` → **200**

```json
{
  "command_id": "f9dcb86f-dff0-4456-b155-dc182703de54",
  "expected_version": 1
}
```

```json
{
  "id": "ae374ca2-feb0-4059-b069-c4354f38145f",
  "order_id": "5bc725f3-1cbe-4def-834b-703c9460527d",
  "assignment_id": "083cf2c3-f6e8-49b8-ad31-bc998ac98f32",
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
  "arrived_at": "2026-10-30T17:49:46.023931Z",
  "started_at": "2026-10-30T17:49:46.214606Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

(the car drives 48 s to the next point)

`POST /api/driver/v1/work-sessions/ab66cf55-0998-47f0-8aa5-b1b9f48e1eae/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T17:50:34Z",
    "sequence": 1793382634417
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ab66cf55-0998-47f0-8aa5-b1b9f48e1eae",
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
  "last_heartbeat_at": "2026-10-30T17:50:34.434454Z",
  "last_location_at": "2026-10-30T17:50:34.434454Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/ae374ca2-feb0-4059-b069-c4354f38145f/complete` → **200**

```json
{
  "command_id": "955fc482-e136-46da-93d3-7895993414d4",
  "expected_version": 2,
  "reported_at": "2026-10-30T17:50:34Z",
  "cash_received": true
}
```

```json
{
  "id": "ae374ca2-feb0-4059-b069-c4354f38145f",
  "order_id": "5bc725f3-1cbe-4def-834b-703c9460527d",
  "assignment_id": "083cf2c3-f6e8-49b8-ad31-bc998ac98f32",
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
  "arrived_at": "2026-10-30T17:49:46.023931Z",
  "started_at": "2026-10-30T17:49:46.214606Z",
  "completed_at": "2026-10-30T17:50:34.629538Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/5bc725f3-1cbe-4def-834b-703c9460527d` → **200**

```json
{
  "id": "5bc725f3-1cbe-4def-834b-703c9460527d",
  "short_number": 21,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "69d87422-07df-431d-888a-424f5d1b0744",
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
    "id": "083cf2c3-f6e8-49b8-ad31-bc998ac98f32",
    "order_id": "5bc725f3-1cbe-4def-834b-703c9460527d",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "ae374ca2-feb0-4059-b069-c4354f38145f",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T17:49:42.051026Z",
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
      "id": "5bc725f3-1cbe-4def-834b-703c9460527d",
      "short_number": 21,
      "status": "FULFILLED",
      "created_at": "2026-10-30T17:49:42.051026Z",
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
      "id": "ae374ca2-feb0-4059-b069-c4354f38145f",
      "order_id": "5bc725f3-1cbe-4def-834b-703c9460527d",
      "order_short_number": 21,
      "created_at": "2026-10-30T17:49:42.441308Z",
      "pickup_label": "Майдан Незалежності",
      "dropoff_label": "Залізничний вокзал",
      "final_price_minor": 10517,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "COMPLETED"
    },
    {
      "id": "1c299e10-b2f9-45cb-a6fd-5343f31ac57b",
      "order_id": "25638807-4324-4fc2-8f96-0b5eb19b0485",
      "order_short_number": 19,
      "created_at": "2026-10-30T17:49:34.882103Z",
      "pickup_label": "Майдан",
      "dropoff_label": "Вокзал",
      "final_price_minor": null,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "ABORTED"
    },
    {
      "id": "b76c8a0b-163a-43e0-ac55-35b2d8ace512",
      "order_id": "524d2fe1-799f-48a5-b22f-6fc8ec11b92c",
      "order_short_number": 17,
      "created_at": "2026-10-30T17:49:30.91642Z",
      "pickup_label": "Майдан",
      "dropoff_label": "Вокзал",
      "final_price_minor": null,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "ABORTED"
    },
    {
      "id": "8ec7016f-d74c-44c4-a87d-28de36beba7e",
      "order_id": "71f5e4ea-0dd3-474b-a1c3-1d90fada5063",
      "order_short_number": 16,
      "created_at": "2026-10-30T17:49:28.891171Z",
      "pickup_label": "Майдан",
      "dropoff_label": "Вокзал",
      "final_price_minor": null,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "ABORTED"
    },
    {
      "id": "1c348d3d-1da5-44f4-bdbd-28e29d111f6f",
      "order_id": "dc72b81b-bbee-40e5-b135-fa3edcf508ec",
      "order_short_number": 15,
      "created_at": "2026-10-30T17:49:26.88013Z",
      "pickup_label": "Майдан",
      "dropoff_label": "Вокзал",
      "final_price_minor": null,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "ABORTED"
    },
    {
      "id": "4120f834-d384-4740-b677-4daf6c0ce16d",
      "order_id": "576ab33d-a8e9-4838-9e73-a34ed7e97a02",
      "order_short_number": 10,
      "created_at": "2026-10-30T17:46:49.209972Z",
      "pickup_label": "Майдан",
      "dropoff_label": "Вокзал",
      "final_price_minor": 10517,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "COMPLETED"
    },
    {
      "id": "f5059d84-46c7-4938-a8ba-be94d581d075",
      "order_id": "6baffe02-6c03-4230-8993-b372566303c6",
      "order_short_number": 5,
      "created_at": "2026-10-30T17:45:23.612582Z",
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

`GET /api/rider/v1/orders/5bc725f3-1cbe-4def-834b-703c9460527d/tip` → **200**

```json
{
  "order_id": "5bc725f3-1cbe-4def-834b-703c9460527d",
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
  "available_until": "2026-10-31T17:50:34.629538Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/5bc725f3-1cbe-4def-834b-703c9460527d/tip` → **201**

```json
{
  "command_id": "b36cea60-7531-4b86-bb6d-81c17b8cbe5b",
  "amount_minor": 1100
}
```

```json
{
  "id": "f01937cf-6127-41f0-b2e6-a404c7cbe9e4",
  "order_id": "5bc725f3-1cbe-4def-834b-703c9460527d",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-30T17:50:39.01432Z"
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
  "session_id": "9caa396f-1d05-48e9-aa53-932b03314acf",
  "subject": {
    "type": "STAFF",
    "id": "c1a6f303-45cb-4836-9719-3861c6b8ed9b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMWE2ZjMwMy00NWNiLTQ4MzYtOTcxOS0zODYxYzZiOGVkOWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODM1MzksImlhdCI6MTc5MzM4MjYzOSwianRpIjoiYTRmYWVmOTEtZTU1Yi00MzI0LWE3MDAtMmVjNzQzOWMzNzAzIiwic2lkIjoiOWNhYTM5NmYtMWQwNS00OGU5LWFhNTMtOTMyYjAzMzE0YWNmIn0.GlQFBkKf_bdSKufHWzXfea9-D5Dhqef4XICDMwQOv0Q",
  "access_expires_at": "2026-10-30T18:05:39.404383615Z",
  "refresh_token": "lA-tPMnJLHLl8pudm6n-T2GzEUjPA4hRRVtaQ318Ooc",
  "refresh_expires_at": "2026-10-31T05:50:39.403917058Z",
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
      "CASH": 18,
      "CARD": 2
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
  "generated_at": "2026-10-30T17:50:39.594815234Z"
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
  "generated_at": "2026-10-30T17:50:39.786681749Z"
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
  "session_id": "9816d1a4-0bd9-4c98-8bc9-f67f3ece689b",
  "subject": {
    "type": "STAFF",
    "id": "c1a6f303-45cb-4836-9719-3861c6b8ed9b"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMWE2ZjMwMy00NWNiLTQ4MzYtOTcxOS0zODYxYzZiOGVkOWIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODM1NDAsImlhdCI6MTc5MzM4MjY0MCwianRpIjoiYTI2YjQ2OTktY2ZhYS00YzVhLTkyYjMtNzU1YzJmNmMzYjhhIiwic2lkIjoiOTgxNmQxYTQtMGJkOS00Yzk4LThiYzktZjY3ZjNlY2U2ODliIn0.MUx3fzuat1hylRxCMX2YsPZ620GZuZeiM-WsrlMqSb4",
  "access_expires_at": "2026-10-30T18:05:40.185410523Z",
  "refresh_token": "fEK1jY1fSsIJ30hlpVtaQhRknXk9iXqDeOWJh10gY5Y",
  "refresh_expires_at": "2026-10-31T05:50:40.18500555Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/5bc725f3-1cbe-4def-834b-703c9460527d/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T17:49:42.051344Z",
      "actor": {
        "type": "CLIENT",
        "id": "69d87422-07df-431d-888a-424f5d1b0744",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "5bc725f3-1cbe-4def-834b-703c9460527d",
        "quote_id": "2a883011-fdec-4d70-9c5a-98cc116127c4",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "980e137c-3fc8-49e4-9166-939ac040dbfc"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T17:49:42.052406Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "5bc725f3-1cbe-4def-834b-703c9460527d",
        "attempt_id": "d26d6041-3dda-4fb8-9587-2ae1c00b6c25",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "980e137c-3fc8-49e4-9166-939ac040dbfc"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T17:49:42.054288Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "f2b5f3d9-e033-4809-b77c-cca8b8e6ef09",
        "order_id": "5bc725f3-1cbe-4def-834b-703c9460527d",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "980e137c-3fc8-49e4-9166-939ac040dbfc"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T17:49:42.443086Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "f2b5f3d9-e033-4809-b77c-cca8b8e6ef09",
        "order_id": "5bc725f3-1cbe-4def-834b-703c9460527d",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "083cf2c3-f6e8-49b8-ad31-bc998ac98f32"
      },
      "correlation_id": "dd87ba4f-4e06-4c3b-a7af-d6b7186a7c78"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-30T17:50:40.569015427Z",
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
      "last_location_at": "2026-10-30T17:50:34.434454Z",
      "last_heartbeat_at": "2026-10-30T17:50:34.434454Z",
      "order_id": null
    }
  ]
}
```

Done: order 5bc725f3-1cbe-4def-834b-703c9460527d.

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
  "session_id": "9d0e04da-a51f-4a8f-af47-361e9de496cf",
  "subject": {
    "type": "STAFF",
    "id": "c1a6f303-45cb-4836-9719-3861c6b8ed9b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMWE2ZjMwMy00NWNiLTQ4MzYtOTcxOS0zODYxYzZiOGVkOWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODM1NDAsImlhdCI6MTc5MzM4MjY0MCwianRpIjoiMDc1NjNkYzMtNjliYi00YTJhLTg0MzgtYWQ1NjU2MTI0MGZjIiwic2lkIjoiOWQwZTA0ZGEtYTUxZi00YThmLWFmNDctMzYxZTlkZTQ5NmNmIn0.pJMK7hAayxC9crRpY8hcEv8L5q7ZSavBJjprQVWHiXM",
  "access_expires_at": "2026-10-30T18:05:40.991091715Z",
  "refresh_token": "hP6Ei9azKg0E8Od5Hfx5QCbGp34AAt1kcVJNE6rNK9Q",
  "refresh_expires_at": "2026-10-31T05:50:40.990331804Z",
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
  "command_id": "478ca5fe-375e-4f73-a8e8-c53a788ece9f",
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
  "timestamp": "2026-10-30T17:50:41.000+0000",
  "channel": {
    "id": "1730052000.21081405",
    "linkedid": "1730052000.21081405",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380676303040"
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
  "timestamp": "2026-10-30T17:50:41.000+0000",
  "channel": {
    "id": "1730052000.21081405",
    "linkedid": "1730052000.21081405",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380676303040"
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
  "session_id": "b68332b2-1f5d-4fe0-a021-bdc7fdc12968",
  "subject": {
    "type": "STAFF",
    "id": "c1a6f303-45cb-4836-9719-3861c6b8ed9b"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMWE2ZjMwMy00NWNiLTQ4MzYtOTcxOS0zODYxYzZiOGVkOWIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODM1NDEsImlhdCI6MTc5MzM4MjY0MSwianRpIjoiY2EyYjQzN2ItODg0Ni00NjdlLTk0MTYtYTEzOGExMzYwNWYxIiwic2lkIjoiYjY4MzMyYjItMWY1ZC00ZmUwLWEwMjEtYmRjN2ZkYzEyOTY4In0.OgwrWJZL45aLszt2ZHhsdmRL72YmwbY6fEgmBijY3T4",
  "access_expires_at": "2026-10-30T18:05:41.807122496Z",
  "refresh_token": "GFi8xDwrOwSYtNpXPtL5zk9XI5JnaIPcagttrOV9Upk",
  "refresh_expires_at": "2026-10-31T05:50:41.80668301Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "37e12b89-ee19-48e7-b1f3-d27a8b64fe25",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380676303040",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T17:50:41Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/37e12b89-ee19-48e7-b1f3-d27a8b64fe25/answer` → **200**

```json
{
  "command_id": "3ec7122f-1f23-4d16-865a-e8770943464f"
}
```

```json
{
  "id": "37e12b89-ee19-48e7-b1f3-d27a8b64fe25",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380676303040",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "c1a6f303-45cb-4836-9719-3861c6b8ed9b",
  "order_ids": [],
  "started_at": "2026-10-30T17:50:41Z",
  "answered_at": "2026-10-30T17:50:42.194458Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.21081405",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "954ac0e3-284d-4d20-8512-05d2c3597af5",
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
  "id": "b4c15cff-218e-4613-9357-55b25c72d008",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T17:55:42.411704Z",
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
  "command_id": "53cc09cf-a64c-4694-afc2-db5984cb5b45",
  "quote_id": "b4c15cff-218e-4613-9357-55b25c72d008",
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
    "phone": "+380676303040"
  },
  "call_id": "37e12b89-ee19-48e7-b1f3-d27a8b64fe25"
}
```

```json
{
  "id": "11866c7e-cc04-473d-b385-72d14fe964f8",
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
  "created_at": "2026-10-30T17:50:42.613068Z",
  "caller": {
    "name": "Caller",
    "phone": "+380676303040"
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
    "id": "1730052000.21081405",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "37e12b89-ee19-48e7-b1f3-d27a8b64fe25",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380676303040",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "c1a6f303-45cb-4836-9719-3861c6b8ed9b",
      "order_ids": [
        "11866c7e-cc04-473d-b385-72d14fe964f8"
      ],
      "started_at": "2026-10-30T17:50:41Z",
      "answered_at": "2026-10-30T17:50:42.194458Z",
      "ended_at": "2026-10-30T17:50:42.853623Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "de656073-41e9-458a-af68-494f741b0c3c",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670640799",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "c1a6f303-45cb-4836-9719-3861c6b8ed9b",
      "order_ids": [],
      "started_at": "2026-10-30T17:45:14.204474Z",
      "answered_at": "2026-10-30T17:45:14.41878Z",
      "ended_at": "2026-10-30T17:45:14.629259Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T17:45:21.045462Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/11866c7e-cc04-473d-b385-72d14fe964f8` → **200**

```json
{
  "id": "11866c7e-cc04-473d-b385-72d14fe964f8",
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
  "created_at": "2026-10-30T17:50:42.613068Z",
  "caller": {
    "name": "Caller",
    "phone": "+380676303040"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/11866c7e-cc04-473d-b385-72d14fe964f8` → **200**

```json
{
  "id": "11866c7e-cc04-473d-b385-72d14fe964f8",
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
  "created_at": "2026-10-30T17:50:42.613068Z",
  "caller": {
    "name": "Caller",
    "phone": "+380676303040"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/11866c7e-cc04-473d-b385-72d14fe964f8/cancel` → **200**

```json
{
  "command_id": "6805aad2-d207-4668-baba-05af012d3ee5",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "11866c7e-cc04-473d-b385-72d14fe964f8",
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
  "created_at": "2026-10-30T17:50:42.613068Z",
  "caller": {
    "name": "Caller",
    "phone": "+380676303040"
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

Done: call 37e12b89-ee19-48e7-b1f3-d27a8b64fe25 with order 11866c7e-cc04-473d-b385-72d14fe964f8.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-28479"
}
```

```json
{
  "challenge_id": "1fcd6437-26a3-4ba0-b851-e7b250580a2d",
  "expires_at": "2026-10-30T17:55:43.680425284Z",
  "resend_available_at": "2026-10-30T17:50:44.680425284Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "254134",
  "sent_at": "2026-10-30T17:50:43.683348281Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1fcd6437-26a3-4ba0-b851-e7b250580a2d",
  "code": "254134",
  "device_ref": "sandbox-28479"
}
```

```json
{
  "session_id": "4f9e9774-00b0-4d41-a23b-4ba5dc2ae1bd",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4MzU0MywiaWF0IjoxNzkzMzgyNjQzLCJqdGkiOiIwMjM5ZWE2Yy04YTM4LTRjOGYtYjg4Zi0xZjg2MzdlYzA3OTQiLCJzaWQiOiI0ZjllOTc3NC0wMGIwLTRkNDEtYTIzYi00YmE1ZGMyYWUxYmQifQ.zuyLXUG-rR2xaNTEQZB6609r9P1FCcMKYPwses4b1Os",
  "access_expires_at": "2026-10-30T18:05:43.887255184Z",
  "refresh_token": "mwCyQFpvr8UTXZd8LZTs-ocw0VdAmNLUEQsJjrm5XqE",
  "refresh_expires_at": "2026-11-29T17:50:43.886599612Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ab66cf55-0998-47f0-8aa5-b1b9f48e1eae",
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
  "last_heartbeat_at": "2026-10-30T17:50:34.434454Z",
  "last_location_at": "2026-10-30T17:50:34.434454Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ab66cf55-0998-47f0-8aa5-b1b9f48e1eae/handover` → **200**

```json
{
  "command_id": "d1ea8ab7-568c-462f-97c4-13f9ba2925ba",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ab66cf55-0998-47f0-8aa5-b1b9f48e1eae",
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
  "last_heartbeat_at": "2026-10-30T17:50:34.434454Z",
  "last_location_at": "2026-10-30T17:50:34.434454Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

(the car drives 89 s to the next point)

`POST /api/driver/v1/work-sessions/ab66cf55-0998-47f0-8aa5-b1b9f48e1eae/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T17:52:13Z",
    "sequence": 1793382733466
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ab66cf55-0998-47f0-8aa5-b1b9f48e1eae",
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
  "last_heartbeat_at": "2026-10-30T17:52:13.481359Z",
  "last_location_at": "2026-10-30T17:52:13.481359Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380664132220",
  "device_ref": "sandbox-652"
}
```

```json
{
  "challenge_id": "74a96a0d-1597-418f-be88-d70f32907193",
  "expires_at": "2026-10-30T17:57:13.66571859Z",
  "resend_available_at": "2026-10-30T17:52:14.66571859Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380664132220` → **200**

```json
{
  "phone": "+380664132220",
  "audience": "CLIENT",
  "code": "735760",
  "sent_at": "2026-10-30T17:52:13.667716343Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "74a96a0d-1597-418f-be88-d70f32907193",
  "code": "735760",
  "device_ref": "sandbox-652"
}
```

```json
{
  "session_id": "c1e7ea66-cad8-4369-80ac-a225ec20a712",
  "subject": {
    "type": "CLIENT",
    "id": "c1563a1b-dab9-4e08-b214-5d8c73620db5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMTU2M2ExYi1kYWI5LTRlMDgtYjIxNC01ZDhjNzM2MjBkYjUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzgzNjMzLCJpYXQiOjE3OTMzODI3MzMsImp0aSI6IjczNTZiZGFlLWFhNjUtNDJjNC04YThhLWFlYWU4Mzg4MTdkOCIsInNpZCI6ImMxZTdlYTY2LWNhZDgtNDM2OS04MGFjLWEyMjVlYzIwYTcxMiJ9.VXXY4WF_Vq_kyyqrx5TV-y-XaPjrNXOnl04cnWHLCiM",
  "access_expires_at": "2026-10-30T18:07:13.875250326Z",
  "refresh_token": "_TUcgrEOp6RJiE-WVFcHOoz9FyWUZ8SWIUd509h3d8o",
  "refresh_expires_at": "2026-11-29T17:52:13.874765277Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ce9a8fd7-6a47-44d5-82a8-1d2f43bf0de5",
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
  "id": "99e5dec4-c343-4d0a-925c-1759b7b4fe60",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T17:57:14.070459Z",
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
  "command_id": "e8d0ecf9-3584-4d39-9f60-eaaa8e05bcc3",
  "quote_id": "99e5dec4-c343-4d0a-925c-1759b7b4fe60",
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
  "id": "a92b170c-b3ab-401a-a445-8990030794c2",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c1563a1b-dab9-4e08-b214-5d8c73620db5",
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
  "created_at": "2026-10-30T17:52:14.27104Z",
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
    "id": "3b333356-7461-461e-8d0e-a017395dfa79",
    "order_id": "a92b170c-b3ab-401a-a445-8990030794c2",
    "expires_at": "2026-10-30T17:52:29.27357Z",
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

`POST /api/driver/v1/offers/3b333356-7461-461e-8d0e-a017395dfa79/accept` → **200**

```json
{
  "command_id": "e21a1b83-813b-4d4a-940e-8b674ce25a0a"
}
```

```json
{
  "id": "a37d055e-03cb-4f57-be2b-1e5fd49e9e3e",
  "order_id": "a92b170c-b3ab-401a-a445-8990030794c2",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "32ffc7d3-48a5-419d-af6b-a483408a01b9",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "32ffc7d3-48a5-419d-af6b-a483408a01b9",
  "order_id": "a92b170c-b3ab-401a-a445-8990030794c2",
  "assignment_id": "a37d055e-03cb-4f57-be2b-1e5fd49e9e3e",
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

`POST /api/driver/v1/work-sessions/ab66cf55-0998-47f0-8aa5-b1b9f48e1eae/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T17:52:15Z",
    "sequence": 1793382735551
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ab66cf55-0998-47f0-8aa5-b1b9f48e1eae",
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
  "last_heartbeat_at": "2026-10-30T17:52:15.070022Z",
  "last_location_at": "2026-10-30T17:52:15.070022Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/32ffc7d3-48a5-419d-af6b-a483408a01b9/arrive` → **200**

```json
{
  "command_id": "5cb16c35-4cd6-498c-a07f-af2bb655cda9",
  "expected_version": 0
}
```

```json
{
  "id": "32ffc7d3-48a5-419d-af6b-a483408a01b9",
  "order_id": "a92b170c-b3ab-401a-a445-8990030794c2",
  "assignment_id": "a37d055e-03cb-4f57-be2b-1e5fd49e9e3e",
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
  "arrived_at": "2026-10-30T17:52:15.273072Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/32ffc7d3-48a5-419d-af6b-a483408a01b9/start` → **200**

```json
{
  "command_id": "4cb66697-a32a-411f-a8b5-376afdf45b8f",
  "expected_version": 1
}
```

```json
{
  "id": "32ffc7d3-48a5-419d-af6b-a483408a01b9",
  "order_id": "a92b170c-b3ab-401a-a445-8990030794c2",
  "assignment_id": "a37d055e-03cb-4f57-be2b-1e5fd49e9e3e",
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
  "arrived_at": "2026-10-30T17:52:15.273072Z",
  "started_at": "2026-10-30T17:52:15.467117Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

(the car drives 60 s to the next point)

`POST /api/driver/v1/work-sessions/ab66cf55-0998-47f0-8aa5-b1b9f48e1eae/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T17:53:15Z",
    "sequence": 1793382795675
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ab66cf55-0998-47f0-8aa5-b1b9f48e1eae",
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
  "last_heartbeat_at": "2026-10-30T17:53:15.68882Z",
  "last_location_at": "2026-10-30T17:53:15.68882Z",
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
  "device_ref": "sandbox-24753"
}
```

```json
{
  "challenge_id": "7769a4e1-672a-48c6-8aa1-bf7ee5ee3d6e",
  "expires_at": "2026-10-30T17:58:15.864436555Z",
  "resend_available_at": "2026-10-30T17:53:16.864436555Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "222021",
  "sent_at": "2026-10-30T17:53:15.866145715Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7769a4e1-672a-48c6-8aa1-bf7ee5ee3d6e",
  "code": "222021",
  "device_ref": "sandbox-24753"
}
```

```json
{
  "session_id": "feaf6cfe-0960-4985-bec7-2e1f90455d0d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4MzY5NiwiaWF0IjoxNzkzMzgyNzk2LCJqdGkiOiJkZjBlMmU0My1mOTA3LTQ5ZGEtOWVmMC01ZjU3M2QzZTJkOTkiLCJzaWQiOiJmZWFmNmNmZS0wOTYwLTQ5ODUtYmVjNy0yZTFmOTA0NTVkMGQifQ.sTq146bhMDshoT6PJPnmkiPc5_F9VRqaKgwhWSFVW2Y",
  "access_expires_at": "2026-10-30T18:08:16.060032507Z",
  "refresh_token": "Ex07ZLXzlREnTv63dgtKIK2Xtg0ge_u7mzXPnlJgLpo",
  "refresh_expires_at": "2026-11-29T17:53:16.059467362Z",
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
  "command_id": "3e83dbc7-0727-438f-acd1-0f6d5386dbc9",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T17:53:16Z",
    "sequence": 1793382796436
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "200a8cb5-65db-449b-8637-3667dd5353e3",
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
  "last_heartbeat_at": "2026-10-30T17:53:16.451417Z",
  "last_location_at": "2026-10-30T17:53:16.451417Z",
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
  "session_id": "608cec5e-4eb5-44ec-9f69-6b1da2ac6bb6",
  "subject": {
    "type": "STAFF",
    "id": "c1a6f303-45cb-4836-9719-3861c6b8ed9b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMWE2ZjMwMy00NWNiLTQ4MzYtOTcxOS0zODYxYzZiOGVkOWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODM2OTYsImlhdCI6MTc5MzM4Mjc5NiwianRpIjoiMmM4YjFkN2UtOTQ2OC00YzNjLWI0ZDktMDU3MjQ1YzA1MGI5Iiwic2lkIjoiNjA4Y2VjNWUtNGViNS00NGVjLTlmNjktNmIxZGEyYWM2YmI2In0.YBEIGjgjnaha4aXcLCrIicg8x_VQUMPiLQ0M807EeOk",
  "access_expires_at": "2026-10-30T18:08:16.87666843Z",
  "refresh_token": "i-70HFQlI6inXV7AENDnyooPmOXjFzQ-ZM9DWRj8SG0",
  "refresh_expires_at": "2026-10-31T05:53:16.876308295Z",
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
  "session_id": "f6286334-b468-4c2e-a817-be34cbdc32b9",
  "subject": {
    "type": "STAFF",
    "id": "c1a6f303-45cb-4836-9719-3861c6b8ed9b"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMWE2ZjMwMy00NWNiLTQ4MzYtOTcxOS0zODYxYzZiOGVkOWIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODM2OTcsImlhdCI6MTc5MzM4Mjc5NywianRpIjoiOWZjZTQ0ODEtN2E5NC00ZTkyLTg4ZjMtZGM5MDEwYjEwYzMzIiwic2lkIjoiZjYyODYzMzQtYjQ2OC00YzJlLWE4MTctYmUzNGNiZGMzMmI5In0.0aguUe2CVrRr9zsmZQ6NXWQP5-eSIVmo0qiY4vmaTQA",
  "access_expires_at": "2026-10-30T18:08:17.252863518Z",
  "refresh_token": "8HtATVThgYE-0PcOh3TtPoDNmbzLGPxYDnh6_FBczQw",
  "refresh_expires_at": "2026-10-31T05:53:17.252425999Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/a92b170c-b3ab-401a-a445-8990030794c2` → **200**

```json
{
  "id": "a92b170c-b3ab-401a-a445-8990030794c2",
  "short_number": 23,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "c1563a1b-dab9-4e08-b214-5d8c73620db5",
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
    "id": "a37d055e-03cb-4f57-be2b-1e5fd49e9e3e",
    "order_id": "a92b170c-b3ab-401a-a445-8990030794c2",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "32ffc7d3-48a5-419d-af6b-a483408a01b9",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-30T17:52:14.27104Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/a92b170c-b3ab-401a-a445-8990030794c2/interrupt` → **200**

```json
{
  "command_id": "eae91f52-add4-451d-be47-aa06c9056fc6",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "a92b170c-b3ab-401a-a445-8990030794c2",
    "short_number": 23,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "c1563a1b-dab9-4e08-b214-5d8c73620db5",
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
      "id": "a37d055e-03cb-4f57-be2b-1e5fd49e9e3e",
      "order_id": "a92b170c-b3ab-401a-a445-8990030794c2",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "32ffc7d3-48a5-419d-af6b-a483408a01b9",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-30T17:52:14.27104Z",
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
    "id": "f4fe1589-4c83-49fa-b850-3ae3b9247961",
    "short_number": 24,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "c1563a1b-dab9-4e08-b214-5d8c73620db5",
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
    "id": "61daade0-032d-48c6-acd5-6e16e1986d0e",
    "order_id": "f4fe1589-4c83-49fa-b850-3ae3b9247961",
    "expires_at": "2026-10-30T17:53:32.635864Z",
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

`POST /api/driver/v1/offers/61daade0-032d-48c6-acd5-6e16e1986d0e/accept` → **200**

```json
{
  "command_id": "909c1950-3f00-4d9d-945d-5812bc42b7d5"
}
```

```json
{
  "id": "f08be39c-3b11-40a9-b876-7f85f61c13e6",
  "order_id": "f4fe1589-4c83-49fa-b850-3ae3b9247961",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "523062db-10d7-491d-9d43-16abd154032d",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "523062db-10d7-491d-9d43-16abd154032d",
  "order_id": "f4fe1589-4c83-49fa-b850-3ae3b9247961",
  "assignment_id": "f08be39c-3b11-40a9-b876-7f85f61c13e6",
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
  "session_id": "200a8cb5-65db-449b-8637-3667dd5353e3",
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
  "last_heartbeat_at": "2026-10-30T17:53:16.451417Z",
  "last_location_at": "2026-10-30T17:53:16.451417Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/200a8cb5-65db-449b-8637-3667dd5353e3/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T17:53:18Z",
    "sequence": 1793382798557
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "200a8cb5-65db-449b-8637-3667dd5353e3",
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
  "last_heartbeat_at": "2026-10-30T17:53:18.571407Z",
  "last_location_at": "2026-10-30T17:53:18.571407Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/523062db-10d7-491d-9d43-16abd154032d/arrive` → **200**

```json
{
  "command_id": "36c075e8-a8f8-4334-ada6-39903c223151",
  "expected_version": 0
}
```

```json
{
  "id": "523062db-10d7-491d-9d43-16abd154032d",
  "order_id": "f4fe1589-4c83-49fa-b850-3ae3b9247961",
  "assignment_id": "f08be39c-3b11-40a9-b876-7f85f61c13e6",
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
  "arrived_at": "2026-10-30T17:53:18.767939Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/523062db-10d7-491d-9d43-16abd154032d/start` → **200**

```json
{
  "command_id": "a0e7831d-bbb3-4cd9-821e-e935dce09f24",
  "expected_version": 1
}
```

```json
{
  "id": "523062db-10d7-491d-9d43-16abd154032d",
  "order_id": "f4fe1589-4c83-49fa-b850-3ae3b9247961",
  "assignment_id": "f08be39c-3b11-40a9-b876-7f85f61c13e6",
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
  "arrived_at": "2026-10-30T17:53:18.767939Z",
  "started_at": "2026-10-30T17:53:18.957354Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/523062db-10d7-491d-9d43-16abd154032d/complete` → **200**

```json
{
  "command_id": "05d9e93c-5081-406b-bbb6-2d14b88bf6d9",
  "expected_version": 2,
  "reported_at": "2026-10-30T17:53:19Z"
}
```

```json
{
  "id": "523062db-10d7-491d-9d43-16abd154032d",
  "order_id": "f4fe1589-4c83-49fa-b850-3ae3b9247961",
  "assignment_id": "f08be39c-3b11-40a9-b876-7f85f61c13e6",
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
  "arrived_at": "2026-10-30T17:53:18.767939Z",
  "started_at": "2026-10-30T17:53:18.957354Z",
  "completed_at": "2026-10-30T17:53:19.148764Z",
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
      "id": "f4fe1589-4c83-49fa-b850-3ae3b9247961",
      "short_number": 24,
      "status": "FULFILLED",
      "created_at": "2026-10-30T17:53:17.627889Z",
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
      "id": "a92b170c-b3ab-401a-a445-8990030794c2",
      "short_number": 23,
      "status": "CANCELLED",
      "created_at": "2026-10-30T17:52:14.27104Z",
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

`GET /api/operator/v1/orders/a92b170c-b3ab-401a-a445-8990030794c2/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T17:52:14.271544Z",
      "actor": {
        "type": "CLIENT",
        "id": "c1563a1b-dab9-4e08-b214-5d8c73620db5",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "a92b170c-b3ab-401a-a445-8990030794c2",
        "quote_id": "99e5dec4-c343-4d0a-925c-1759b7b4fe60",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "178ddb93-7e1f-469b-a166-2a407a64eb66"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T17:52:14.27311Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "a92b170c-b3ab-401a-a445-8990030794c2",
        "attempt_id": "2cc5a6fb-716e-48c2-a844-3b40fd792b23",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "178ddb93-7e1f-469b-a166-2a407a64eb66"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T17:52:14.290038Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "3b333356-7461-461e-8d0e-a017395dfa79",
        "order_id": "a92b170c-b3ab-401a-a445-8990030794c2",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "178ddb93-7e1f-469b-a166-2a407a64eb66"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T17:52:14.671349Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "3b333356-7461-461e-8d0e-a017395dfa79",
        "order_id": "a92b170c-b3ab-401a-a445-8990030794c2",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "a37d055e-03cb-4f57-be2b-1e5fd49e9e3e"
      },
      "correlation_id": "c9cc0fd1-ec57-4cad-8096-04715e435cf5"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/f4fe1589-4c83-49fa-b850-3ae3b9247961/tip` → **200**

```json
{
  "order_id": "f4fe1589-4c83-49fa-b850-3ae3b9247961",
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
  "available_until": "2026-10-31T17:53:19.148764Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/f4fe1589-4c83-49fa-b850-3ae3b9247961/tip` → **409**

```json
{
  "command_id": "0d281c0e-b38a-4053-9a7b-52f14da955bb",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/f4fe1589-4c83-49fa-b850-3ae3b9247961/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "63e7a075-0def-49a3-aec9-5b8afca9cdf4"
}
```

Done: interrupted a92b170c-b3ab-401a-a445-8990030794c2, follow-up f4fe1589-4c83-49fa-b850-3ae3b9247961.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ab66cf55-0998-47f0-8aa5-b1b9f48e1eae",
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
  "last_heartbeat_at": "2026-10-30T17:53:15.68882Z",
  "last_location_at": "2026-10-30T17:53:15.68882Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ab66cf55-0998-47f0-8aa5-b1b9f48e1eae/close` → **200**

```json
{
  "command_id": "f123edc7-9ff4-48c2-a11f-5fdd563e7cc1",
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
  "session_id": "200a8cb5-65db-449b-8637-3667dd5353e3",
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
  "last_heartbeat_at": "2026-10-30T17:53:18.571407Z",
  "last_location_at": "2026-10-30T17:53:18.571407Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/200a8cb5-65db-449b-8637-3667dd5353e3/close` → **200**

```json
{
  "command_id": "f2875810-9af5-4e0e-9c86-0581dd7c3e75",
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
  "session_id": "cf88731d-4a3e-4bea-a39f-93d13f759175",
  "subject": {
    "type": "STAFF",
    "id": "c1a6f303-45cb-4836-9719-3861c6b8ed9b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMWE2ZjMwMy00NWNiLTQ4MzYtOTcxOS0zODYxYzZiOGVkOWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODM3MDQsImlhdCI6MTc5MzM4MjgwNCwianRpIjoiZjRlOTE0NmItMGVjOC00NmJkLWJkMmUtZDg1NjE5OWFiNDk2Iiwic2lkIjoiY2Y4ODczMWQtNGEzZS00YmVhLWEzOWYtOTNkMTNmNzU5MTc1In0.cDG3XVo-TSLsBJLykZfoSAoTaqC1_S315goHVJUpk0U",
  "access_expires_at": "2026-10-30T18:08:24.226380502Z",
  "refresh_token": "eYPY9rultxg-FaDJfbMHT5D7W3LzQgVEYW4EDgfYzcg",
  "refresh_expires_at": "2026-10-31T05:53:24.225973235Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "410efbec-c960-442a-9ae6-1203e26efa83",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T17:53:24Z"
}
```

```json
{
  "id": "2bcc00f7-5d41-422a-bd19-a59b926b163d",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T17:53:24Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/2bcc00f7-5d41-422a-bd19-a59b926b163d/publish` → **200**

```json
{
  "command_id": "216d0ca2-9052-4846-a85b-39dcaf9516c0",
  "expected_version": 0
}
```

```json
{
  "id": "2bcc00f7-5d41-422a-bd19-a59b926b163d",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T17:53:24.607137Z",
  "published_at": "2026-10-30T17:53:24.607137Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "2bcc00f7-5d41-422a-bd19-a59b926b163d",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-30T17:53:24.607137Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634031498",
  "device_ref": "sandbox-7689"
}
```

```json
{
  "challenge_id": "7c8551c4-5b2e-4ea9-b405-63c4271629d9",
  "expires_at": "2026-10-30T17:58:24.960454195Z",
  "resend_available_at": "2026-10-30T17:53:25.960454195Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380634031498` → **200**

```json
{
  "phone": "+380634031498",
  "audience": "CLIENT",
  "code": "427171",
  "sent_at": "2026-10-30T17:53:24.962333019Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7c8551c4-5b2e-4ea9-b405-63c4271629d9",
  "code": "427171",
  "device_ref": "sandbox-7689"
}
```

```json
{
  "session_id": "8e312a4b-c68e-4b1e-8004-69743609ec96",
  "subject": {
    "type": "CLIENT",
    "id": "5ef79439-13a1-4774-b336-b30c4d8f8fc9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZWY3OTQzOS0xM2ExLTQ3NzQtYjMzNi1iMzBjNGQ4ZjhmYzkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzgzNzA1LCJpYXQiOjE3OTMzODI4MDUsImp0aSI6ImZiNWM0ODNmLWFmYjEtNGJiNy1iNTU0LWMzZTY4NDhlZDNlYiIsInNpZCI6IjhlMzEyYTRiLWM2OGUtNGIxZS04MDA0LTY5NzQzNjA5ZWM5NiJ9.qj-5auL-ruOCcynuKIKs_tur_GuHW17OaQujQ9vV6Os",
  "access_expires_at": "2026-10-30T18:08:25.162552827Z",
  "refresh_token": "dbHStxF8AFVXuOVRaGZBN8QM7_Gj0oZIX3sB8Wszt_c",
  "refresh_expires_at": "2026-11-29T17:53:25.162170398Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "2bcc00f7-5d41-422a-bd19-a59b926b163d",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-30T17:53:24.607137Z",
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
  "command_id": "6021fb90-9082-4483-acfb-8f02cabb45ff",
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
  "id": "9d334cd3-352f-42a7-8ad9-9b22c39b007d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T17:58:25.529438Z",
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
  "command_id": "f8e3f6d3-ed72-4b3a-99b9-0e496d15a8a7",
  "quote_id": "9d334cd3-352f-42a7-8ad9-9b22c39b007d",
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
  "correlation_id": "b19765d8-ffcc-43bf-85ee-22672d4dad34"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "31d6e491-489d-472d-9e64-cd406a1a2ef1",
  "version_id": "2bcc00f7-5d41-422a-bd19-a59b926b163d",
  "language": "uk"
}
```

```json
{
  "version_id": "2bcc00f7-5d41-422a-bd19-a59b926b163d",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-30T17:53:25.916413Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "922f30f0-078b-4852-bf2e-4d6dfe909d6b",
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
  "id": "f976865f-dd74-470f-88ed-b86f7e455bbf",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T17:58:26.102130Z",
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
  "command_id": "dc276074-9381-422e-8114-d723a0b53b28",
  "quote_id": "f976865f-dd74-470f-88ed-b86f7e455bbf",
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
  "id": "1a9f3bb7-c821-4410-bcea-de316ffa5d95",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5ef79439-13a1-4774-b336-b30c4d8f8fc9",
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
  "created_at": "2026-10-30T17:53:26.288126Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/1a9f3bb7-c821-4410-bcea-de316ffa5d95` → **200**

```json
{
  "id": "1a9f3bb7-c821-4410-bcea-de316ffa5d95",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5ef79439-13a1-4774-b336-b30c4d8f8fc9",
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
  "created_at": "2026-10-30T17:53:26.288126Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/1a9f3bb7-c821-4410-bcea-de316ffa5d95/cancel` → **200**

```json
{
  "command_id": "538d774b-a9a0-48de-a0ea-64f837157da6",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "1a9f3bb7-c821-4410-bcea-de316ffa5d95",
  "short_number": 25,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "5ef79439-13a1-4774-b336-b30c4d8f8fc9",
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
  "created_at": "2026-10-30T17:53:26.288126Z",
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

`POST /api/admin/v1/legal-documents/2bcc00f7-5d41-422a-bd19-a59b926b163d` → **409**

```json
{
  "command_id": "20dd6999-02de-470b-8158-d3d1a1ace4d7",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T17:53:26Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/2bcc00f7-5d41-422a-bd19-a59b926b163d",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "d7a6b99a-d4f0-491b-be9f-9b4a1785b54e"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "f7a70f48-675a-4a0a-9715-f205f8257faa",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T17:53:27Z"
}
```

```json
{
  "id": "6981972f-a3b5-44eb-b4fd-d26e02413808",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T17:53:27Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/6981972f-a3b5-44eb-b4fd-d26e02413808/publish` → **200**

```json
{
  "command_id": "8b45ae3b-ce8f-4e07-ae3d-d48198e487cb",
  "expected_version": 0
}
```

```json
{
  "id": "6981972f-a3b5-44eb-b4fd-d26e02413808",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T17:53:27.269217Z",
  "published_at": "2026-10-30T17:53:27.269217Z",
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
  "device_ref": "sandbox-3772"
}
```

```json
{
  "challenge_id": "30d59e7a-2908-4ead-810e-cdd77e28776f",
  "expires_at": "2026-10-30T17:58:27.456772007Z",
  "resend_available_at": "2026-10-30T17:53:28.456772007Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "631363",
  "sent_at": "2026-10-30T17:53:27.459488623Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "30d59e7a-2908-4ead-810e-cdd77e28776f",
  "code": "631363",
  "device_ref": "sandbox-3772"
}
```

```json
{
  "session_id": "f96f2371-4214-46e1-ab35-60738eacd8f4",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4MzcwNywiaWF0IjoxNzkzMzgyODA3LCJqdGkiOiIxNTg2OGJjNS05ODA3LTRiMzctYWJmOS01Nzk2MWIzNjkxMTMiLCJzaWQiOiJmOTZmMjM3MS00MjE0LTQ2ZTEtYWIzNS02MDczOGVhY2Q4ZjQifQ.m4ZArtvzEkWylP4hL7eugvxjXbqDTga8arw0XtZRlJ8",
  "access_expires_at": "2026-10-30T18:08:27.661863359Z",
  "refresh_token": "H2D62SQhuGrZu-hORDpEtwY4u_NOZFSoZgfY6t4OlKo",
  "refresh_expires_at": "2026-11-29T17:53:27.661494751Z",
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
  "command_id": "4bfc7f64-eefa-4089-bef0-a77d440f40a0",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T17:54:42Z",
    "sequence": 1793382882543
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "e587fa75-89a4-480e-9569-0292651a5739",
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
  "last_heartbeat_at": "2026-10-30T17:54:42.071553Z",
  "last_location_at": "2026-10-30T17:54:42.071553Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675393339",
  "device_ref": "sandbox-29836"
}
```

```json
{
  "challenge_id": "0bb1d337-2103-49ae-bc91-2a07219ae4f0",
  "expires_at": "2026-10-30T17:59:42.260385937Z",
  "resend_available_at": "2026-10-30T17:54:43.260385937Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380675393339` → **200**

```json
{
  "phone": "+380675393339",
  "audience": "CLIENT",
  "code": "107841",
  "sent_at": "2026-10-30T17:54:42.262943569Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0bb1d337-2103-49ae-bc91-2a07219ae4f0",
  "code": "107841",
  "device_ref": "sandbox-29836"
}
```

```json
{
  "session_id": "e4d4b310-bdb2-4b09-96c4-7659bb2afc3e",
  "subject": {
    "type": "CLIENT",
    "id": "a4207187-68a1-4c4d-8408-c4cd4c54c03d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNDIwNzE4Ny02OGExLTRjNGQtODQwOC1jNGNkNGM1NGMwM2QiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzgzNzgyLCJpYXQiOjE3OTMzODI4ODIsImp0aSI6ImNkNGMwMzE0LTA3ZDEtNDA3Yi05MmE4LTk2MGVkM2FhMzJkNiIsInNpZCI6ImU0ZDRiMzEwLWJkYjItNGIwOS05NmM0LTc2NTliYjJhZmMzZSJ9.DA4fT_4HdDLFEW26__NE5DvVc6LiEJMLJkmQxQ9XtOU",
  "access_expires_at": "2026-10-30T18:09:42.47256128Z",
  "refresh_token": "o39Zg59YMS2s7UDO5U1M5_4AqHGVskOWylB-pRcH_kE",
  "refresh_expires_at": "2026-11-29T17:54:42.472067538Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "5417c1e2-9b45-48e8-952c-1e4562410c53",
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
  "id": "8abae2a7-4ca3-4611-be04-a1b6ddb2db4c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T17:59:42.662545Z",
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
  "command_id": "29232989-459d-4ec4-8844-29a21ac243c0",
  "quote_id": "8abae2a7-4ca3-4611-be04-a1b6ddb2db4c",
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
    "phone": "+380674592854"
  }
}
```

```json
{
  "id": "74297736-e872-4127-90cb-2ee1804cc4b3",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a4207187-68a1-4c4d-8408-c4cd4c54c03d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T17:54:42.869351Z",
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
    "id": "e8686cca-18b9-44df-bbc6-e9e36703e583",
    "order_id": "74297736-e872-4127-90cb-2ee1804cc4b3",
    "expires_at": "2026-10-30T17:54:57.87184Z",
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

`POST /api/driver/v1/offers/e8686cca-18b9-44df-bbc6-e9e36703e583/accept` → **200**

```json
{
  "command_id": "9f64954d-4c93-4826-a58f-ea7f69b80732"
}
```

```json
{
  "id": "5bd84094-e64d-476b-8474-013fbb132ac0",
  "order_id": "74297736-e872-4127-90cb-2ee1804cc4b3",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "cfd02dda-11ec-448a-9ef4-7ff24d8d0087",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "cfd02dda-11ec-448a-9ef4-7ff24d8d0087",
  "order_id": "74297736-e872-4127-90cb-2ee1804cc4b3",
  "assignment_id": "5bd84094-e64d-476b-8474-013fbb132ac0",
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
    "phone": "+380674592854"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "fa2e0021-e1d7-40fa-a62f-009e91f8e414",
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
  "id": "bb656095-b3de-4269-a14f-2f9db1748fcf",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T17:59:43.682461Z",
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
  "command_id": "8776dc43-8f9f-48be-beab-1b8de8c98b3f",
  "quote_id": "bb656095-b3de-4269-a14f-2f9db1748fcf",
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
  "id": "ae7aac10-1bc4-4a6c-a61b-540aea23c5b9",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a4207187-68a1-4c4d-8408-c4cd4c54c03d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T17:54:43.877929Z",
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
  "command_id": "6c75c213-a54d-4fd1-a46d-2dbc418a1cdb",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-30T20:54:44Z"
}
```

```json
{
  "id": "fbea4358-e04e-49eb-b4bf-483db1f7ce38",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T17:59:44.083903Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-30T20:54:44Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "da2fc8e1-8fb2-4ccc-9eee-cfbd69a56996",
  "quote_id": "fbea4358-e04e-49eb-b4bf-483db1f7ce38",
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
  "pickup_at": "2026-10-30T20:54:44Z"
}
```

```json
{
  "id": "e021e6ba-6c55-47bc-a6d2-a3a34e05debb",
  "short_number": 28,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "a4207187-68a1-4c4d-8408-c4cd4c54c03d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T17:54:44.277829Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T20:54:44Z",
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
  "command_id": "7d2a7331-f97a-41f7-ae6c-a387a964e677",
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
  "id": "d129b061-f617-448b-bbe1-d02f63a3a2ba",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T17:59:44.475371Z",
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
  "command_id": "e8b12a0a-e930-4c18-a4e9-93f25fbd7f17",
  "quote_id": "d129b061-f617-448b-bbe1-d02f63a3a2ba",
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
  "correlation_id": "2d218da9-773d-41ae-95bd-a78e4fea56b6"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "e021e6ba-6c55-47bc-a6d2-a3a34e05debb",
      "short_number": 28,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "a4207187-68a1-4c4d-8408-c4cd4c54c03d",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-30T17:54:44.277829Z",
      "cancellation": null,
      "pickup_at": "2026-10-30T20:54:44Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "ae7aac10-1bc4-4a6c-a61b-540aea23c5b9",
      "short_number": 27,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "a4207187-68a1-4c4d-8408-c4cd4c54c03d",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
        "lat": 50.4405,
        "lon": 30.489
      },
      "dropoff_label": "Вокзал",
      "payment_method": "CASH",
      "payment_state": "CASH_EXPECTED",
      "price_minor": 10517,
      "final_price_minor": null,
      "currency": "UAH",
      "search_phase": "BROADCAST",
      "assignment": null,
      "created_at": "2026-10-30T17:54:43.877929Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "74297736-e872-4127-90cb-2ee1804cc4b3",
      "short_number": 26,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "ae7aac10-1bc4-4a6c-a61b-540aea23c5b9",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a4207187-68a1-4c4d-8408-c4cd4c54c03d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T17:54:43.877929Z",
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

`GET /api/rider/v1/orders/74297736-e872-4127-90cb-2ee1804cc4b3` → **200**

```json
{
  "id": "74297736-e872-4127-90cb-2ee1804cc4b3",
  "short_number": 26,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "a4207187-68a1-4c4d-8408-c4cd4c54c03d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "5bd84094-e64d-476b-8474-013fbb132ac0",
    "order_id": "74297736-e872-4127-90cb-2ee1804cc4b3",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "cfd02dda-11ec-448a-9ef4-7ff24d8d0087",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T17:54:42.869351Z",
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
    "location_at": "2026-10-30T17:54:42.071553Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/74297736-e872-4127-90cb-2ee1804cc4b3/cancel` → **200**

```json
{
  "command_id": "6366e1bb-e857-4fb0-a4ce-192c055b29e0",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "74297736-e872-4127-90cb-2ee1804cc4b3",
  "short_number": 26,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "a4207187-68a1-4c4d-8408-c4cd4c54c03d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "5bd84094-e64d-476b-8474-013fbb132ac0",
    "order_id": "74297736-e872-4127-90cb-2ee1804cc4b3",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "cfd02dda-11ec-448a-9ef4-7ff24d8d0087",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T17:54:42.869351Z",
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

`GET /api/rider/v1/orders/ae7aac10-1bc4-4a6c-a61b-540aea23c5b9` → **200**

```json
{
  "id": "ae7aac10-1bc4-4a6c-a61b-540aea23c5b9",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a4207187-68a1-4c4d-8408-c4cd4c54c03d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T17:54:43.877929Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/ae7aac10-1bc4-4a6c-a61b-540aea23c5b9/cancel` → **200**

```json
{
  "command_id": "4bce7a0c-b5f6-44a6-ab0e-a00de5c3dbe4",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "ae7aac10-1bc4-4a6c-a61b-540aea23c5b9",
  "short_number": 27,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "a4207187-68a1-4c4d-8408-c4cd4c54c03d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T17:54:43.877929Z",
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

`GET /api/rider/v1/orders/e021e6ba-6c55-47bc-a6d2-a3a34e05debb` → **200**

```json
{
  "id": "e021e6ba-6c55-47bc-a6d2-a3a34e05debb",
  "short_number": 28,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "a4207187-68a1-4c4d-8408-c4cd4c54c03d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T17:54:44.277829Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T20:54:44Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/e021e6ba-6c55-47bc-a6d2-a3a34e05debb/cancel` → **200**

```json
{
  "command_id": "8a0bd550-ee2a-4fb2-b7e3-adada745f2db",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "e021e6ba-6c55-47bc-a6d2-a3a34e05debb",
  "short_number": 28,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "a4207187-68a1-4c4d-8408-c4cd4c54c03d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T17:54:44.277829Z",
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
  "pickup_at": "2026-10-30T20:54:44Z",
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
  "session_id": "e587fa75-89a4-480e-9569-0292651a5739",
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
  "last_heartbeat_at": "2026-10-30T17:54:42.071553Z",
  "last_location_at": "2026-10-30T17:54:42.071553Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e587fa75-89a4-480e-9569-0292651a5739/close` → **200**

```json
{
  "command_id": "8ab1f8d3-7003-4c46-859b-bdeacac0fb7b",
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

Done: orders 74297736-e872-4127-90cb-2ee1804cc4b3, ae7aac10-1bc4-4a6c-a61b-540aea23c5b9, e021e6ba-6c55-47bc-a6d2-a3a34e05debb.

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
  "session_id": "a13404c6-e4dc-4775-8221-ab47b3839ab7",
  "subject": {
    "type": "STAFF",
    "id": "c1a6f303-45cb-4836-9719-3861c6b8ed9b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMWE2ZjMwMy00NWNiLTQ4MzYtOTcxOS0zODYxYzZiOGVkOWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODM3ODcsImlhdCI6MTc5MzM4Mjg4NywianRpIjoiNmM0ZDJkNzctYzA0OC00YWIzLWIzYTYtZmU4MTIzZGZlZDk3Iiwic2lkIjoiYTEzNDA0YzYtZTRkYy00Nzc1LTgyMjEtYWI0N2IzODM5YWI3In0.wKBpI_jjiyUlgZNcDZ316DO66e8tFd7hjWlsZ0lADLs",
  "access_expires_at": "2026-10-30T18:09:47.139915147Z",
  "refresh_token": "VdVlwZNLrpXCIJkRo0dsp9ztLS8YULb6fIxAf4cH6lM",
  "refresh_expires_at": "2026-10-31T05:54:47.139562483Z",
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
  "session_id": "de6b24a3-8461-4b08-a9b4-be20782e923d",
  "subject": {
    "type": "STAFF",
    "id": "c1a6f303-45cb-4836-9719-3861c6b8ed9b"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMWE2ZjMwMy00NWNiLTQ4MzYtOTcxOS0zODYxYzZiOGVkOWIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODM3ODcsImlhdCI6MTc5MzM4Mjg4NywianRpIjoiZTVlZjc5ODYtMjgxMy00ZWYyLWIxNDctMjU4NjcyY2Y1NWJhIiwic2lkIjoiZGU2YjI0YTMtODQ2MS00YjA4LWE5YjQtYmUyMDc4MmU5MjNkIn0.9o6gzQFnTGUY8S66zKKKRUR39VZKj02iTledRf8MEAk",
  "access_expires_at": "2026-10-30T18:09:47.531311692Z",
  "refresh_token": "fR2fiu0JfXNtmbiEEaxSJFnhz3rvDFqvlTssVf5zxyY",
  "refresh_expires_at": "2026-10-31T05:54:47.5309469Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-27035"
}
```

```json
{
  "challenge_id": "1edefa82-86ac-412d-bc20-abd9ce0915d8",
  "expires_at": "2026-10-30T17:59:47.763161795Z",
  "resend_available_at": "2026-10-30T17:54:48.763161795Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "429970",
  "sent_at": "2026-10-30T17:54:47.765238077Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1edefa82-86ac-412d-bc20-abd9ce0915d8",
  "code": "429970",
  "device_ref": "sandbox-27035"
}
```

```json
{
  "session_id": "6fa1c4a3-30f3-4ed7-8ac1-c8b1895dde4e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4Mzc4NywiaWF0IjoxNzkzMzgyODg3LCJqdGkiOiI1NGVmNWU1MS0wZmExLTRmOWItODg3NC0zNDUwMzkxYmM4NTgiLCJzaWQiOiI2ZmExYzRhMy0zMGYzLTRlZDctOGFjMS1jOGIxODk1ZGRlNGUifQ.mUJpspSW_MHthM_Iz22qRlLi0arcmkhoWOZPkeKvM9I",
  "access_expires_at": "2026-10-30T18:09:47.985474745Z",
  "refresh_token": "d6Vi7PctDGrAGGMzixpJQm91wyhrFwCeKdGFajxr-rw",
  "refresh_expires_at": "2026-11-29T17:54:47.98512757Z",
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
  "command_id": "519182b8-9888-4421-9d45-a78985ca9816",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T17:54:48Z",
    "sequence": 1793382888367
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b74ec8b7-83fa-4e7d-a685-24e253c3a113",
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
  "last_heartbeat_at": "2026-10-30T17:54:48.382095Z",
  "last_location_at": "2026-10-30T17:54:48.382095Z",
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
  "command_id": "ffc94ac8-47c1-4034-b79f-7a2920354a5c",
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
  "effective_at": "2026-10-30T17:54:48.770023Z",
  "changed_by": "c1a6f303-45cb-4836-9719-3861c6b8ed9b",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "c1a6f303-45cb-4836-9719-3861c6b8ed9b",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-30T17:45:27.804266Z",
  "last_entries": [
    {
      "order_id": "6baffe02-6c03-4230-8993-b372566303c6",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T17:45:27.804266Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "442f9c7f-5e36-42ac-bf9f-436ea8747313",
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
  "id": "0631ce4f-d98b-426b-9fd3-531fe0bfb08c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T17:59:49.200433Z",
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
  "command_id": "e17466f5-02ee-449c-bd97-73e95435491f",
  "quote_id": "0631ce4f-d98b-426b-9fd3-531fe0bfb08c",
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
    "phone": "+380671112410"
  }
}
```

```json
{
  "id": "a6f94590-ec18-40a7-854a-f6eab0547f2c",
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
  "created_at": "2026-10-30T17:54:49.51374Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671112410"
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
    "id": "0dae5512-db73-4e9c-8e92-fb35aeaf1a8e",
    "order_id": "a6f94590-ec18-40a7-854a-f6eab0547f2c",
    "expires_at": "2026-10-30T17:55:04.5209Z",
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

`POST /api/driver/v1/offers/0dae5512-db73-4e9c-8e92-fb35aeaf1a8e/accept` → **200**

```json
{
  "command_id": "5152d7cd-bdb5-4fa5-a83b-28b8358fa8c0"
}
```

```json
{
  "id": "297526eb-b6c7-4a6f-9755-e4a4d726c9e3",
  "order_id": "a6f94590-ec18-40a7-854a-f6eab0547f2c",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "23f30b32-c271-45a0-afe8-b6b80e3b78a6",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "23f30b32-c271-45a0-afe8-b6b80e3b78a6",
  "order_id": "a6f94590-ec18-40a7-854a-f6eab0547f2c",
  "assignment_id": "297526eb-b6c7-4a6f-9755-e4a4d726c9e3",
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
    "phone": "+380671112410"
  }
}
```

`POST /api/driver/v1/work-sessions/b74ec8b7-83fa-4e7d-a685-24e253c3a113/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T17:54:50Z",
    "sequence": 1793382890434
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b74ec8b7-83fa-4e7d-a685-24e253c3a113",
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
  "last_heartbeat_at": "2026-10-30T17:54:50.449845Z",
  "last_location_at": "2026-10-30T17:54:50.449845Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/23f30b32-c271-45a0-afe8-b6b80e3b78a6/arrive` → **200**

```json
{
  "command_id": "e341e1ba-d9bf-4821-bb24-9dfcb0f3d4d1",
  "expected_version": 0
}
```

```json
{
  "id": "23f30b32-c271-45a0-afe8-b6b80e3b78a6",
  "order_id": "a6f94590-ec18-40a7-854a-f6eab0547f2c",
  "assignment_id": "297526eb-b6c7-4a6f-9755-e4a4d726c9e3",
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
  "arrived_at": "2026-10-30T17:54:50.642968Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671112410"
  }
}
```

`POST /api/driver/v1/trips/23f30b32-c271-45a0-afe8-b6b80e3b78a6/start` → **200**

```json
{
  "command_id": "ef461868-6bd6-49c5-9d6a-7eb238fae5a8",
  "expected_version": 1
}
```

```json
{
  "id": "23f30b32-c271-45a0-afe8-b6b80e3b78a6",
  "order_id": "a6f94590-ec18-40a7-854a-f6eab0547f2c",
  "assignment_id": "297526eb-b6c7-4a6f-9755-e4a4d726c9e3",
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
  "arrived_at": "2026-10-30T17:54:50.642968Z",
  "started_at": "2026-10-30T17:54:50.853571Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671112410"
  }
}
```

`POST /api/driver/v1/trips/23f30b32-c271-45a0-afe8-b6b80e3b78a6/complete` → **200**

```json
{
  "command_id": "807b6c74-9dd4-4526-bc7b-b4bd7c5a2294",
  "expected_version": 2,
  "reported_at": "2026-10-30T17:54:51Z",
  "cash_received": true
}
```

```json
{
  "id": "23f30b32-c271-45a0-afe8-b6b80e3b78a6",
  "order_id": "a6f94590-ec18-40a7-854a-f6eab0547f2c",
  "assignment_id": "297526eb-b6c7-4a6f-9755-e4a4d726c9e3",
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
  "arrived_at": "2026-10-30T17:54:50.642968Z",
  "started_at": "2026-10-30T17:54:50.853571Z",
  "completed_at": "2026-10-30T17:54:51.056255Z",
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
  "command_id": "04c8c6c9-b026-4441-be0c-62953f2335fb",
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
  "id": "28407980-e75a-49e5-8e7f-33bd6e9b185b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T17:59:51.267511Z",
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
  "command_id": "6f9f30ed-f5d1-4049-94ee-c97e32f175ab",
  "quote_id": "28407980-e75a-49e5-8e7f-33bd6e9b185b",
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
    "phone": "+380671118705"
  }
}
```

```json
{
  "id": "d12a34d2-5441-4e5a-8952-92d361106512",
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
  "created_at": "2026-10-30T17:54:51.470148Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671118705"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/d12a34d2-5441-4e5a-8952-92d361106512` → **200**

```json
{
  "id": "d12a34d2-5441-4e5a-8952-92d361106512",
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
  "created_at": "2026-10-30T17:54:51.470148Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671118705"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/d12a34d2-5441-4e5a-8952-92d361106512/cancel` → **200**

```json
{
  "command_id": "9262086e-ad43-4fba-98a4-308a33906b63",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "d12a34d2-5441-4e5a-8952-92d361106512",
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
  "created_at": "2026-10-30T17:54:51.470148Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671118705"
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
  "staff_id": "c1a6f303-45cb-4836-9719-3861c6b8ed9b",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-30T17:45:27.804266Z",
  "last_entries": [
    {
      "order_id": "d12a34d2-5441-4e5a-8952-92d361106512",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-30T17:54:51.904502Z"
    },
    {
      "order_id": "a6f94590-ec18-40a7-854a-f6eab0547f2c",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-30T17:54:51.062067Z"
    },
    {
      "order_id": "6baffe02-6c03-4230-8993-b372566303c6",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T17:45:27.804266Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b74ec8b7-83fa-4e7d-a685-24e253c3a113",
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
  "last_heartbeat_at": "2026-10-30T17:54:50.449845Z",
  "last_location_at": "2026-10-30T17:54:50.449845Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b74ec8b7-83fa-4e7d-a685-24e253c3a113/close` → **200**

```json
{
  "command_id": "6a0b52a8-7ac3-402d-87ba-165b846d7d66",
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

Done: operator bonus for fulfilled a6f94590-ec18-40a7-854a-f6eab0547f2c and operator-fault cancellation d12a34d2-5441-4e5a-8952-92d361106512.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675852924",
  "device_ref": "sandbox-1425"
}
```

```json
{
  "challenge_id": "e5bf8180-b702-47b1-ae86-559b03cd66e8",
  "expires_at": "2026-10-30T17:59:55.900394079Z",
  "resend_available_at": "2026-10-30T17:54:56.900394079Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380675852924` → **200**

```json
{
  "phone": "+380675852924",
  "audience": "CLIENT",
  "code": "867876",
  "sent_at": "2026-10-30T17:54:55.902684466Z",
  "channel": "SMS"
}
```

## "Call me instead" on the first try still gets an SMS; the resend is a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677096161",
  "device_ref": "sandbox-18847",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "d3bdc482-bc04-461a-ace6-c4d5ca377f0b",
  "expires_at": "2026-10-30T17:59:57.30987398Z",
  "resend_available_at": "2026-10-30T17:54:58.30987398Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380677096161` → **200**

```json
{
  "phone": "+380677096161",
  "audience": "CLIENT",
  "code": "372457",
  "sent_at": "2026-10-30T17:54:57.312592905Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677096161",
  "device_ref": "sandbox-19144",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "35dc1a15-5218-427a-b33e-34d3ce9ec994",
  "expires_at": "2026-10-30T17:59:58.727300393Z",
  "resend_available_at": "2026-10-30T17:54:59.727300393Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380677096161` → **200**

```json
{
  "phone": "+380677096161",
  "audience": "CLIENT",
  "code": "794076",
  "sent_at": "2026-10-30T17:54:58.729950718Z",
  "channel": "VOICE"
}
```

## The SMS does not get through: one request, one attempt; the resend comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677960000",
  "device_ref": "sandbox-14039"
}
```

```json
{
  "challenge_id": "a5be8111-4911-47b8-8eeb-24bf20315ee1",
  "expires_at": "2026-10-30T18:00:00.137560412Z",
  "resend_available_at": "2026-10-30T17:55:01.137560412Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677960000",
  "device_ref": "sandbox-17471"
}
```

```json
{
  "challenge_id": "20c5ee6f-d613-4f25-b5a9-bbce8748b1bd",
  "expires_at": "2026-10-30T18:00:01.526466918Z",
  "resend_available_at": "2026-10-30T17:55:02.526466918Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380677960000` → **200**

```json
{
  "phone": "+380677960000",
  "audience": "CLIENT",
  "code": "453728",
  "sent_at": "2026-10-30T17:55:01.528593577Z",
  "channel": "VOICE"
}
```

## A second call in the hour is made, the third is refused

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677960000",
  "device_ref": "sandbox-17667",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "3f4d3efd-a440-46d9-a42d-5bda64925834",
  "expires_at": "2026-10-30T18:00:02.93679943Z",
  "resend_available_at": "2026-10-30T17:55:03.93679943Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380677960000` → **200**

```json
{
  "phone": "+380677960000",
  "audience": "CLIENT",
  "code": "590318",
  "sent_at": "2026-10-30T17:55:02.938648002Z",
  "channel": "VOICE"
}
```

`POST /auth/v1/otp/challenges` → **429**

```json
{
  "audience": "CLIENT",
  "phone": "+380677960000",
  "device_ref": "sandbox-18033",
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
  "correlation_id": "f18a2006-df73-4a94-acba-22d6187f736a",
  "retryable": true,
  "retry_after_seconds": 3600
}
```

## Numbers outside Poland and Ukraine get nothing

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+442000011045"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "a0606432-712d-4aeb-beee-5acefe813f09"
}
```

`GET /sandbox/v1/otp?phone=%2B442000011045` → **404**

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+37120030305"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "4bdcb96c-8cc0-4f30-8af5-573bc2c1e1e3"
}
```

`GET /sandbox/v1/otp?phone=%2B37120030305` → **404**

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
  "session_id": "b2383f03-e03d-4738-b5ce-53dd056d45af",
  "subject": {
    "type": "STAFF",
    "id": "c1a6f303-45cb-4836-9719-3861c6b8ed9b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMWE2ZjMwMy00NWNiLTQ4MzYtOTcxOS0zODYxYzZiOGVkOWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODM4MDUsImlhdCI6MTc5MzM4MjkwNSwianRpIjoiOWM0ZWUzODItODRkYi00ZDljLThhYmMtMDU1Y2ZlYjVhOWFiIiwic2lkIjoiYjIzODNmMDMtZTAzZC00NzM4LWI1Y2UtNTNkZDA1NmQ0NWFmIn0.xKxjn-YPp_8ZjTLL5kvr3G850kfXnBkYsYBDwCt-erg",
  "access_expires_at": "2026-10-30T18:10:05.275460488Z",
  "refresh_token": "Ifk012E-pu0sJu15ySbek71NJbxOfFdI233byLF-S7M",
  "refresh_expires_at": "2026-10-31T05:55:05.275100603Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380677960000` → **200**

```json
{
  "deliveries": [
    {
      "id": "408e0fec-6e24-469b-b0f9-564c83ec7e62",
      "challenge_id": "3f4d3efd-a440-46d9-a42d-5bda64925834",
      "phone": "+380677960000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-c8057dc4-8ba8-483a-b770-8d777213031a",
      "error": null,
      "attempted_at": "2026-10-30T17:55:02.938866Z"
    },
    {
      "id": "63a00d3f-7234-4797-bb6e-d1dd04765a2c",
      "challenge_id": "20c5ee6f-d613-4f25-b5a9-bbce8748b1bd",
      "phone": "+380677960000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-5fd5b9b1-8e3e-444b-981c-2ebd7e888cdd",
      "error": null,
      "attempted_at": "2026-10-30T17:55:01.528855Z"
    },
    {
      "id": "b39d3da8-4516-419a-bb3e-726e011e24e5",
      "challenge_id": "a5be8111-4911-47b8-8eeb-24bf20315ee1",
      "phone": "+380677960000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-30T17:55:00.139429Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380677960000` → **200**

```json
{
  "phone": "+380677960000",
  "audience": "CLIENT",
  "code": "590318",
  "sent_at": "2026-10-30T17:55:02.938648002Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380677096161` → **200**

```json
{
  "deliveries": [
    {
      "id": "94288b0f-58f2-425a-bab8-f35b97de681f",
      "challenge_id": "35dc1a15-5218-427a-b33e-34d3ce9ec994",
      "phone": "+380677096161",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-6f4126cc-901f-4c03-a1f2-94ed3ea6ffe5",
      "error": null,
      "attempted_at": "2026-10-30T17:54:58.730471Z"
    },
    {
      "id": "b16c2d24-798c-41de-b845-3823df3c82cc",
      "challenge_id": "d3bdc482-bc04-461a-ace6-c4d5ca377f0b",
      "phone": "+380677096161",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-47714506-b784-482f-8ba6-e33cfc24fb49",
      "error": null,
      "attempted_at": "2026-10-30T17:54:57.313144Z"
    }
  ]
}
```

Done: SMS to +380675852924; SMS then a call to +380677096161; a failed SMS, two calls and a refused third to +380677960000; +44 and +371 refused.

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
  "session_id": "8bdc1191-e698-4bf0-9e94-b86948c42ff9",
  "subject": {
    "type": "STAFF",
    "id": "c1a6f303-45cb-4836-9719-3861c6b8ed9b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMWE2ZjMwMy00NWNiLTQ4MzYtOTcxOS0zODYxYzZiOGVkOWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODM4MDYsImlhdCI6MTc5MzM4MjkwNiwianRpIjoiMjU5MGUxZDYtNmYzYy00YmMwLTg1ZTQtNGM2MWI1YTAxYWY1Iiwic2lkIjoiOGJkYzExOTEtZTY5OC00YmYwLTllOTQtYjg2OTQ4YzQyZmY5In0.ILCn31vCDvioLWpeqqamxRgx4lwrASlJYij2EiyXUMw",
  "access_expires_at": "2026-10-30T18:10:06.113958708Z",
  "refresh_token": "BrBEduz1blR5vX-7kzCXiS2Mswyja6X1JLvAwlP8uLQ",
  "refresh_expires_at": "2026-10-31T05:55:06.113576439Z",
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
  "session_id": "5ed651a5-98cd-45de-978b-db4faa0a5b4a",
  "subject": {
    "type": "STAFF",
    "id": "c1a6f303-45cb-4836-9719-3861c6b8ed9b"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMWE2ZjMwMy00NWNiLTQ4MzYtOTcxOS0zODYxYzZiOGVkOWIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODM4MDYsImlhdCI6MTc5MzM4MjkwNiwianRpIjoiMzkxZTVkNDYtY2Q3Yi00MzZhLTk4ZjEtYTk3M2Y2NTE2YjU2Iiwic2lkIjoiNWVkNjUxYTUtOThjZC00NWRlLTk3OGItZGI0ZmFhMGE1YjRhIn0.2woRfJVcZno67ksUUIx9Em0uRaVRrpMiutzbc0SP6jQ",
  "access_expires_at": "2026-10-30T18:10:06.496384155Z",
  "refresh_token": "OXbaZyRT7AjmEfu-ABhlvdC83gWFl3HgPFiz1GTAkj4",
  "refresh_expires_at": "2026-10-31T05:55:06.496051772Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "c1a6f303-45cb-4836-9719-3861c6b8ed9b",
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

`POST /api/admin/v1/staff-extensions/c1a6f303-45cb-4836-9719-3861c6b8ed9b` → **200**

```json
{
  "command_id": "4ce21653-c1f5-4d6f-853e-5e243a11b4cd",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "c1a6f303-45cb-4836-9719-3861c6b8ed9b",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "68483457-7fd3-4ab9-a265-c50ad92550f7",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T17:55:07.25695Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T17:55:07.25695Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "44c86f27-7e08-4eeb-a647-a30bf4f96110",
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
  "id": "ccc87cd1-8c44-4ae1-9316-7c19e8dcba47",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T18:00:07.629197Z",
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
  "command_id": "7be7dcde-4973-4a63-9626-b166a34f86b4",
  "quote_id": "ccc87cd1-8c44-4ae1-9316-7c19e8dcba47",
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
    "phone": "+380678716860"
  }
}
```

```json
{
  "id": "d5282199-49fe-4a07-b599-46c3371b7592",
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
  "created_at": "2026-10-30T17:55:07.82886Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678716860"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/d5282199-49fe-4a07-b599-46c3371b7592/calls` → **201**

```json
{
  "command_id": "f96aff70-df4f-42b3-9e92-b3643d11cb7b",
  "to": "CALLER"
}
```

```json
{
  "id": "dd82b4f1-475e-4b9f-8796-02ab78d9c11a",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "c1a6f303-45cb-4836-9719-3861c6b8ed9b",
  "order_ids": [
    "d5282199-49fe-4a07-b599-46c3371b7592"
  ],
  "started_at": "2026-10-30T17:55:08.064885Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/d5282199-49fe-4a07-b599-46c3371b7592/calls` → **201**

```json
{
  "command_id": "f96aff70-df4f-42b3-9e92-b3643d11cb7b",
  "to": "CALLER"
}
```

```json
{
  "id": "dd82b4f1-475e-4b9f-8796-02ab78d9c11a",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "c1a6f303-45cb-4836-9719-3861c6b8ed9b",
  "order_ids": [
    "d5282199-49fe-4a07-b599-46c3371b7592"
  ],
  "started_at": "2026-10-30T17:55:08.064885Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "dd82b4f1-475e-4b9f-8796-02ab78d9c11a",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380678716860",
    "at": "2026-10-30T17:55:08.071047875Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "dd82b4f1-475e-4b9f-8796-02ab78d9c11a",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.2898",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "dd82b4f1-475e-4b9f-8796-02ab78d9c11a"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "dd82b4f1-475e-4b9f-8796-02ab78d9c11a",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=d5282199-49fe-4a07-b599-46c3371b7592` → **200**

```json
{
  "calls": [
    {
      "id": "dd82b4f1-475e-4b9f-8796-02ab78d9c11a",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "c1a6f303-45cb-4836-9719-3861c6b8ed9b",
      "order_ids": [
        "d5282199-49fe-4a07-b599-46c3371b7592"
      ],
      "started_at": "2026-10-30T17:55:08.064885Z",
      "answered_at": "2026-10-30T17:55:08.51545Z",
      "ended_at": "2026-10-30T17:55:08.531485Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=d5282199-49fe-4a07-b599-46c3371b7592` → **200**

```json
{
  "calls": [
    {
      "id": "dd82b4f1-475e-4b9f-8796-02ab78d9c11a",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "c1a6f303-45cb-4836-9719-3861c6b8ed9b",
      "order_ids": [
        "d5282199-49fe-4a07-b599-46c3371b7592"
      ],
      "started_at": "2026-10-30T17:55:08.064885Z",
      "answered_at": "2026-10-30T17:55:08.51545Z",
      "ended_at": "2026-10-30T17:55:08.531485Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=d5282199-49fe-4a07-b599-46c3371b7592` → **200**

```json
{
  "calls": [
    {
      "id": "dd82b4f1-475e-4b9f-8796-02ab78d9c11a",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "c1a6f303-45cb-4836-9719-3861c6b8ed9b",
      "order_ids": [
        "d5282199-49fe-4a07-b599-46c3371b7592"
      ],
      "started_at": "2026-10-30T17:55:08.064885Z",
      "answered_at": "2026-10-30T17:55:08.51545Z",
      "ended_at": "2026-10-30T17:55:08.531485Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T17:55:11.106384Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/d5282199-49fe-4a07-b599-46c3371b7592` → **200**

```json
{
  "id": "d5282199-49fe-4a07-b599-46c3371b7592",
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
  "created_at": "2026-10-30T17:55:07.82886Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678716860"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/d5282199-49fe-4a07-b599-46c3371b7592/cancel` → **200**

```json
{
  "command_id": "755c6bbe-3ac6-4703-a093-f5f70f388630",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "d5282199-49fe-4a07-b599-46c3371b7592",
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
  "created_at": "2026-10-30T17:55:07.82886Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678716860"
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
  "command_id": "23e2d79c-3c65-490a-9b23-426455ef07ac",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-30T17:55:13.559861Z",
  "extension": "101"
}
```

Done: outgoing call dd82b4f1-475e-4b9f-8796-02ab78d9c11a from order d5282199-49fe-4a07-b599-46c3371b7592, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636485018",
  "device_ref": "sandbox-29444"
}
```

```json
{
  "challenge_id": "9a4469b3-c81e-46d7-a0b4-3e21533cd9c0",
  "expires_at": "2026-10-30T18:00:13.757660132Z",
  "resend_available_at": "2026-10-30T17:55:14.757660132Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636485018` → **200**

```json
{
  "phone": "+380636485018",
  "audience": "CLIENT",
  "code": "189858",
  "sent_at": "2026-10-30T17:55:13.75959798Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9a4469b3-c81e-46d7-a0b4-3e21533cd9c0",
  "code": "189858",
  "device_ref": "sandbox-29444"
}
```

```json
{
  "session_id": "653c5602-8734-4aa7-935b-b4d471077ab1",
  "subject": {
    "type": "CLIENT",
    "id": "e6e396fa-0d0f-4be9-abee-3957143ac53b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNmUzOTZmYS0wZDBmLTRiZTktYWJlZS0zOTU3MTQzYWM1M2IiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzgzODEzLCJpYXQiOjE3OTMzODI5MTMsImp0aSI6ImM4NGViNTg2LThhNWEtNGU2Yy1hMDVlLWVjY2IxMDkyMTQ3ZCIsInNpZCI6IjY1M2M1NjAyLTg3MzQtNGFhNy05MzViLWI0ZDQ3MTA3N2FiMSJ9.uuUFY7w3CS7PBMTPoan-DV4StrLFZmbkIWyY-CSzrpI",
  "access_expires_at": "2026-10-30T18:10:13.967436582Z",
  "refresh_token": "0GaJcDsahtlPgax_lii-zr1avQjXR3q_-sv4QI5Zids",
  "refresh_expires_at": "2026-11-29T17:55:13.967094193Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "e6e396fa-0d0f-4be9-abee-3957143ac53b",
  "session_id": "653c5602-8734-4aa7-935b-b4d471077ab1",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636485018",
  "device_ref": "sandbox-20084"
}
```

```json
{
  "challenge_id": "6f26b4a9-de33-406d-9c45-85b2fa827a41",
  "expires_at": "2026-10-30T18:00:16.335318394Z",
  "resend_available_at": "2026-10-30T17:55:17.335318394Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636485018` → **200**

```json
{
  "phone": "+380636485018",
  "audience": "CLIENT",
  "code": "022171",
  "sent_at": "2026-10-30T17:55:16.337006238Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6f26b4a9-de33-406d-9c45-85b2fa827a41",
  "code": "022171",
  "device_ref": "sandbox-20084"
}
```

```json
{
  "session_id": "c64d7257-ba53-42ec-9b77-272298288a1f",
  "subject": {
    "type": "CLIENT",
    "id": "e6e396fa-0d0f-4be9-abee-3957143ac53b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNmUzOTZmYS0wZDBmLTRiZTktYWJlZS0zOTU3MTQzYWM1M2IiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzgzODE2LCJpYXQiOjE3OTMzODI5MTYsImp0aSI6Ijc1OTdjOThmLTZiOGYtNDBlNC04OTJjLWEyZTRkYjlmYTc2YiIsInNpZCI6ImM2NGQ3MjU3LWJhNTMtNDJlYy05Yjc3LTI3MjI5ODI4OGExZiJ9.l4QGmAxDODEiuoOVs5z1WO_NhGgPQTpRbp1qMeivSxk",
  "access_expires_at": "2026-10-30T18:10:16.543908988Z",
  "refresh_token": "1-1A5iJV_4Vw5KU6jclo8vrXuQXCKIQdiyHzxqWmca8",
  "refresh_expires_at": "2026-11-29T17:55:16.543527381Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "07c711aa-188f-4b1f-a7a9-b19f80c7f197",
  "expires_at": "2026-10-30T18:00:18.728784491Z",
  "resend_available_at": "2026-10-30T17:55:19.728784491Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636485018` → **200**

```json
{
  "phone": "+380636485018",
  "audience": "CLIENT",
  "code": "552946",
  "sent_at": "2026-10-30T17:55:18.730350722Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380639125015"
}
```

```json
{
  "challenge_id": "5713b9b1-4e8c-42a8-980c-de9871713d31",
  "expires_at": "2026-10-30T18:00:18.929735776Z",
  "resend_available_at": "2026-10-30T17:55:19.929735776Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639125015` → **200**

```json
{
  "phone": "+380639125015",
  "audience": "CLIENT",
  "code": "535522",
  "sent_at": "2026-10-30T17:55:18.931453972Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "57d984e7-d9cc-448f-922d-24b921039d79",
  "current_challenge_id": "07c711aa-188f-4b1f-a7a9-b19f80c7f197",
  "current_code": "000000",
  "new_challenge_id": "5713b9b1-4e8c-42a8-980c-de9871713d31",
  "new_code": "535522"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "f635a566-745a-4176-910b-ba4fcd0f6e44"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "370f540b-5db2-49a6-b41d-b520c1448c7d",
  "current_challenge_id": "07c711aa-188f-4b1f-a7a9-b19f80c7f197",
  "current_code": "552946",
  "new_challenge_id": "5713b9b1-4e8c-42a8-980c-de9871713d31",
  "new_code": "535522"
}
```

```json
{
  "subject_id": "e6e396fa-0d0f-4be9-abee-3957143ac53b",
  "phone": "+380639125015",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "e6e396fa-0d0f-4be9-abee-3957143ac53b",
  "session_id": "653c5602-8734-4aa7-935b-b4d471077ab1",
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
  "correlation_id": "6376f39e-0aab-4d4e-a5f0-709df15f0cad"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639125015",
  "device_ref": "sandbox-2604"
}
```

```json
{
  "challenge_id": "820aa620-bbd4-4da2-806a-22c72b7c8c36",
  "expires_at": "2026-10-30T18:00:21.87720467Z",
  "resend_available_at": "2026-10-30T17:55:22.87720467Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639125015` → **200**

```json
{
  "phone": "+380639125015",
  "audience": "CLIENT",
  "code": "136505",
  "sent_at": "2026-10-30T17:55:21.878893436Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "820aa620-bbd4-4da2-806a-22c72b7c8c36",
  "code": "136505",
  "device_ref": "sandbox-2604"
}
```

```json
{
  "session_id": "206613dc-130b-432e-bb15-9bc7ceed7e51",
  "subject": {
    "type": "CLIENT",
    "id": "e6e396fa-0d0f-4be9-abee-3957143ac53b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNmUzOTZmYS0wZDBmLTRiZTktYWJlZS0zOTU3MTQzYWM1M2IiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzgzODIyLCJpYXQiOjE3OTMzODI5MjIsImp0aSI6IjUwMDU1ZTI5LTc4ZWUtNDA3OS1hYzk2LTA2NTlhYjY3MzY5ZSIsInNpZCI6IjIwNjYxM2RjLTEzMGItNDMyZS1iYjE1LTliYzdjZWVkN2U1MSJ9.jBo1lkoiX5KkeEJ2ZtHGR0AYvMb6CsYVRbcMDfFIo4I",
  "access_expires_at": "2026-10-30T18:10:22.079922988Z",
  "refresh_token": "o4URA7nRQI2lpj6An2pIWQe9TNkuBc536IVyPTRMA9I",
  "refresh_expires_at": "2026-11-29T17:55:22.07956059Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "e6e396fa-0d0f-4be9-abee-3957143ac53b",
  "session_id": "206613dc-130b-432e-bb15-9bc7ceed7e51",
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
  "session_id": "864e7224-3d03-4cc4-aae4-cdadd8825d05",
  "subject": {
    "type": "STAFF",
    "id": "c1a6f303-45cb-4836-9719-3861c6b8ed9b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMWE2ZjMwMy00NWNiLTQ4MzYtOTcxOS0zODYxYzZiOGVkOWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODM4MjIsImlhdCI6MTc5MzM4MjkyMiwianRpIjoiZGUyNDM2NjktODlmMS00ZTRlLWJjODctODM2M2Y1NWJhMmE2Iiwic2lkIjoiODY0ZTcyMjQtM2QwMy00Y2M0LWFhZTQtY2RhZGQ4ODI1ZDA1In0.3n2AlWDuJtCAh0ICaL5YsZFuQddD3d3AW9TiszpHPr4",
  "access_expires_at": "2026-10-30T18:10:22.658436342Z",
  "refresh_token": "_N8QtDN1dA7DJwLE3juaNBUA1rhSzvuwi_FolDxRRHo",
  "refresh_expires_at": "2026-10-31T05:55:22.657964152Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/e6e396fa-0d0f-4be9-abee-3957143ac53b` → **200**

```json
{
  "client": {
    "id": "e6e396fa-0d0f-4be9-abee-3957143ac53b",
    "phone": "+380639125015",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T17:55:13.965826Z",
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

`POST /api/admin/v1/clients/e6e396fa-0d0f-4be9-abee-3957143ac53b/phone/new-code` → **201**

```json
{
  "phone": "+380636004438"
}
```

```json
{
  "challenge_id": "4ef2ba09-7d24-4e50-bbf6-48e55475934d",
  "expires_at": "2026-10-30T18:00:23.079282043Z",
  "resend_available_at": "2026-10-30T17:55:24.079282043Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636004438` → **200**

```json
{
  "phone": "+380636004438",
  "audience": "CLIENT",
  "code": "493546",
  "sent_at": "2026-10-30T17:55:23.080709223Z",
  "channel": "SMS"
}
```

## Without the right code nothing changes; with it, support sets the phone

`POST /api/admin/v1/clients/e6e396fa-0d0f-4be9-abee-3957143ac53b/phone` → **422**

```json
{
  "command_id": "7b3fbbdb-4e37-40b9-9477-36a2f0d0c22f",
  "expected_version": 3,
  "new_challenge_id": "4ef2ba09-7d24-4e50-bbf6-48e55475934d",
  "new_code": "493547",
  "reason": "Passport checked at the office"
}
```

```json
{
  "instance": "/api/admin/v1/clients/e6e396fa-0d0f-4be9-abee-3957143ac53b/phone",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "5efa386e-fa34-4e13-bef4-2d94fb9a82dc"
}
```

`POST /api/admin/v1/clients/e6e396fa-0d0f-4be9-abee-3957143ac53b/phone` → **400**

```json
{
  "command_id": "71afc51b-b370-4f69-b1b5-7678ffdafa46",
  "expected_version": 3,
  "new_challenge_id": "4ef2ba09-7d24-4e50-bbf6-48e55475934d",
  "new_code": "493546",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/e6e396fa-0d0f-4be9-abee-3957143ac53b/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "57455dd7-0724-49f3-ab5f-c55d9c03b10f",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

`POST /api/admin/v1/clients/e6e396fa-0d0f-4be9-abee-3957143ac53b/phone` → **200**

```json
{
  "command_id": "2961f583-dc69-40db-862b-962dcc726204",
  "expected_version": 3,
  "new_challenge_id": "4ef2ba09-7d24-4e50-bbf6-48e55475934d",
  "new_code": "493546",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "e6e396fa-0d0f-4be9-abee-3957143ac53b",
  "phone": "+380636004438",
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
  "correlation_id": "b94dbebd-e8c3-4235-9fa1-63c2b2411de1"
}
```

`POST /auth/v1/otp/challenges` → **429**

```json
{
  "audience": "CLIENT",
  "phone": "+380636004438",
  "device_ref": "sandbox-1172"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "f4d2f853-b919-48fc-8037-bc76470f5656",
  "retryable": true,
  "retry_after_seconds": 1
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636004438",
  "device_ref": "sandbox-1172"
}
```

```json
{
  "challenge_id": "d54f7c96-6646-464f-8f9b-5072f91cad98",
  "expires_at": "2026-10-30T18:00:25.246670067Z",
  "resend_available_at": "2026-10-30T17:55:26.246670067Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636004438` → **200**

```json
{
  "phone": "+380636004438",
  "audience": "CLIENT",
  "code": "289300",
  "sent_at": "2026-10-30T17:55:25.249050244Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d54f7c96-6646-464f-8f9b-5072f91cad98",
  "code": "289300",
  "device_ref": "sandbox-1172"
}
```

```json
{
  "session_id": "eaaae159-a1eb-46ed-8031-6873feae1ee9",
  "subject": {
    "type": "CLIENT",
    "id": "e6e396fa-0d0f-4be9-abee-3957143ac53b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNmUzOTZmYS0wZDBmLTRiZTktYWJlZS0zOTU3MTQzYWM1M2IiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzgzODI1LCJpYXQiOjE3OTMzODI5MjUsImp0aSI6Ijk1ZmNkZTVlLWIyNDUtNDI2ZS04NWYwLTBjOGJkNTE5OTExZCIsInNpZCI6ImVhYWFlMTU5LWExZWItNDZlZC04MDMxLTY4NzNmZWFlMWVlOSJ9.hDl4X8RkLiMgkmL3xlflo0lRKIyT_DHpMa595MqewHA",
  "access_expires_at": "2026-10-30T18:10:25.45651824Z",
  "refresh_token": "Nn9JHxe3xLdRyvx2xEJsQOQeWN5-WVTvyED3AmCL_t0",
  "refresh_expires_at": "2026-11-29T17:55:25.45615477Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "e6e396fa-0d0f-4be9-abee-3957143ac53b",
  "session_id": "eaaae159-a1eb-46ed-8031-6873feae1ee9",
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
  "phone": "+380630110152",
  "device_ref": "sandbox-32361"
}
```

```json
{
  "challenge_id": "65ad837a-c718-4869-8269-eb5c375cf78e",
  "expires_at": "2026-10-30T18:00:25.833025663Z",
  "resend_available_at": "2026-10-30T17:55:26.833025663Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380630110152` → **200**

```json
{
  "phone": "+380630110152",
  "audience": "CLIENT",
  "code": "293075",
  "sent_at": "2026-10-30T17:55:25.835286034Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "65ad837a-c718-4869-8269-eb5c375cf78e",
  "code": "293075",
  "device_ref": "sandbox-32361"
}
```

```json
{
  "session_id": "6a15aa05-27c3-42b8-83b5-44d3cdfb45d5",
  "subject": {
    "type": "CLIENT",
    "id": "6530c5d1-acb9-4089-9b54-90a54740e437"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NTMwYzVkMS1hY2I5LTQwODktOWI1NC05MGE1NDc0MGU0MzciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzgzODI2LCJpYXQiOjE3OTMzODI5MjYsImp0aSI6ImZlOWVhZjk4LTkzMTktNDRjNy1iMjgwLWE4NTUyYzJiYjg1OCIsInNpZCI6IjZhMTVhYTA1LTI3YzMtNDJiOC04M2I1LTQ0ZDNjZGZiNDVkNSJ9.SiPyJ6aXaHmtEj6cFIIYFqLH7P5xQ6-e1jvIeci3NvE",
  "access_expires_at": "2026-10-30T18:10:26.037035991Z",
  "refresh_token": "34kU9ZaBDSa2-tb7Bn_JvPeRdgiZlm6Am9y4qBb07tc",
  "refresh_expires_at": "2026-11-29T17:55:26.036679576Z",
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
  "session_id": "e8f29ca1-8c2d-4cfd-81dd-9788a7a9d566",
  "subject": {
    "type": "STAFF",
    "id": "c1a6f303-45cb-4836-9719-3861c6b8ed9b"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMWE2ZjMwMy00NWNiLTQ4MzYtOTcxOS0zODYxYzZiOGVkOWIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODM4MjYsImlhdCI6MTc5MzM4MjkyNiwianRpIjoiNzI2ZTI5YzUtNThhYS00ZGZjLTg3MmQtOWZjMzE3MTA4ZDdmIiwic2lkIjoiZThmMjljYTEtOGMyZC00Y2ZkLTgxZGQtOTc4OGE3YTlkNTY2In0.owViSEcSX2tBaVFtsrn8auMzy_PtePTQD2pIUOk2ttA",
  "access_expires_at": "2026-10-30T18:10:26.809048423Z",
  "refresh_token": "EO44nv1IQE75I1g8jzcJLl0amDyTKTqD3mEEEbdxURc",
  "refresh_expires_at": "2026-10-31T05:55:26.808717362Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380630110152` → **200**

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
  "correlation_id": "d4728076-607b-429f-a3ce-c0a724477da3"
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
  "session_id": "039edf6a-6c00-412b-bb61-e4eeeb9d30e9",
  "subject": {
    "type": "STAFF",
    "id": "c1a6f303-45cb-4836-9719-3861c6b8ed9b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMWE2ZjMwMy00NWNiLTQ4MzYtOTcxOS0zODYxYzZiOGVkOWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODM4MjcsImlhdCI6MTc5MzM4MjkyNywianRpIjoiZTZlMWY1YWMtZjdjYi00ZWM1LTkyOTctNGE1ZTI2MzJmYzI3Iiwic2lkIjoiMDM5ZWRmNmEtNmMwMC00MTJiLWJiNjEtZTRlZWViOWQzMGU5In0.xZuRQotTehihhbPBUoAbU5JxyBKtbbKT7P5nmtucPQA",
  "access_expires_at": "2026-10-30T18:10:27.5777076Z",
  "refresh_token": "x61PgbQX439MEqiDd2SWtRPM1Bt5ep_qXh6mzCqFBbU",
  "refresh_expires_at": "2026-10-31T05:55:27.57729778Z",
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
  "changed_by": "c1a6f303-45cb-4836-9719-3861c6b8ed9b",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T17:41:35.405708Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "8c832917-4700-40f2-8d31-b207603c5848",
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
  "changed_by": "c1a6f303-45cb-4836-9719-3861c6b8ed9b",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-30T17:55:27.953548712Z"
}
```

## The rider books the airport for 2026-10-30T20:55:27Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600656471",
  "device_ref": "sandbox-14446"
}
```

```json
{
  "challenge_id": "7163d5e3-90a2-4bc3-9b75-d92d4b2844cb",
  "expires_at": "2026-10-30T18:00:28.151313832Z",
  "resend_available_at": "2026-10-30T17:55:29.151313832Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600656471` → **200**

```json
{
  "phone": "+48600656471",
  "audience": "CLIENT",
  "code": "755843",
  "sent_at": "2026-10-30T17:55:28.153675942Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7163d5e3-90a2-4bc3-9b75-d92d4b2844cb",
  "code": "755843",
  "device_ref": "sandbox-14446"
}
```

```json
{
  "session_id": "e92bed72-b75a-4102-96b4-9ebbd33c2cd1",
  "subject": {
    "type": "CLIENT",
    "id": "9603c0df-96eb-445d-9278-0edd20fd095a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NjAzYzBkZi05NmViLTQ0NWQtOTI3OC0wZWRkMjBmZDA5NWEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzgzODI4LCJpYXQiOjE3OTMzODI5MjgsImp0aSI6IjlkNTQ0NzQyLWJkNzQtNDg2NC04NjMzLWJkOGU4MTEwNWE2NiIsInNpZCI6ImU5MmJlZDcyLWI3NWEtNDEwMi05NmI0LTllYmJkMzNjMmNkMSJ9.ITaoQA1sdDApXbwlzFrGv0dOKXFt3XJztkyZEg_o8Q8",
  "access_expires_at": "2026-10-30T18:10:28.366377762Z",
  "refresh_token": "FOscGofpKuPa28L1KBsHjRsQmbGSkxc9-fI3keioYvs",
  "refresh_expires_at": "2026-11-29T17:55:28.365981637Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d4b9343f-a5be-471b-a3e7-c9e1439edad1",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-30T20:55:27Z"
}
```

```json
{
  "id": "e226071c-423c-4a06-8d00-4e2b63cdf0ba",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T18:00:28.553584Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-30T20:55:27Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "dbb1f7b8-30d3-4681-bae1-ab18a315d5a9",
  "quote_id": "e226071c-423c-4a06-8d00-4e2b63cdf0ba",
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
  "pickup_at": "2026-10-30T20:55:27Z"
}
```

```json
{
  "id": "52ed9a3a-7c12-4f09-88ea-1087730a13c8",
  "short_number": 32,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "9603c0df-96eb-445d-9278-0edd20fd095a",
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
  "created_at": "2026-10-30T17:55:28.752314Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T20:55:27Z",
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
  "device_ref": "sandbox-27385"
}
```

```json
{
  "challenge_id": "8484f9b8-e8e5-491c-8616-30780bdaa142",
  "expires_at": "2026-10-30T18:00:28.951321923Z",
  "resend_available_at": "2026-10-30T17:55:29.951321923Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "460759",
  "sent_at": "2026-10-30T17:55:28.953712211Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8484f9b8-e8e5-491c-8616-30780bdaa142",
  "code": "460759",
  "device_ref": "sandbox-27385"
}
```

```json
{
  "session_id": "a65be6db-3a49-4f95-ba92-f1dbd9938943",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4MzgyOSwiaWF0IjoxNzkzMzgyOTI5LCJqdGkiOiI5ZDlmZmJmYy0xZWE4LTQ5YzQtOGU5Ny1lYTgwNjcwYTBiZDIiLCJzaWQiOiJhNjViZTZkYi0zYTQ5LTRmOTUtYmE5Mi1mMWRiZDk5Mzg5NDMifQ.o-zk-z6W_QAkJ_TvqJwttovTAIXJe222BseTnCL4ejI",
  "access_expires_at": "2026-10-30T18:10:29.156391092Z",
  "refresh_token": "nCNrP7tGE0XVm0sPhnEBAllFZnC06oV5YCALlsP5Hvk",
  "refresh_expires_at": "2026-11-29T17:55:29.156042274Z",
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
  "command_id": "915f7565-5f5d-41ef-8bc1-810779cf4401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T17:55:29Z",
    "sequence": 1793382929537
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "f4b16bfe-6258-4e94-a040-30298ebb45e7",
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
  "last_heartbeat_at": "2026-10-30T17:55:29.552568Z",
  "last_location_at": "2026-10-30T17:55:29.552568Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "52ed9a3a-7c12-4f09-88ea-1087730a13c8",
      "short_number": 32,
      "pickup_at": "2026-10-30T20:55:27Z",
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

`POST /api/driver/v1/preorders/52ed9a3a-7c12-4f09-88ea-1087730a13c8/reserve` → **200**

```json
{
  "command_id": "f0f20995-eb9c-44c0-97e5-1d93f7b31cbc"
}
```

```json
{
  "id": "429d5785-43e7-4526-bfdc-a48bc7cb44cd",
  "state": "RESERVED",
  "order": {
    "order_id": "52ed9a3a-7c12-4f09-88ea-1087730a13c8",
    "short_number": 32,
    "pickup_at": "2026-10-30T20:55:27Z",
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
  "reserved_at": "2026-10-30T17:55:29.936923Z",
  "confirm_from": "2026-10-30T20:25:27Z",
  "confirm_until": "2026-10-30T20:35:27Z",
  "drop_until": "2026-10-30T19:55:27Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "429d5785-43e7-4526-bfdc-a48bc7cb44cd",
      "state": "RESERVED",
      "order": {
        "order_id": "52ed9a3a-7c12-4f09-88ea-1087730a13c8",
        "short_number": 32,
        "pickup_at": "2026-10-30T20:55:27Z",
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
      "reserved_at": "2026-10-30T17:55:29.936923Z",
      "confirm_from": "2026-10-30T20:25:27Z",
      "confirm_until": "2026-10-30T20:35:27Z",
      "drop_until": "2026-10-30T19:55:27Z"
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
      "id": "429d5785-43e7-4526-bfdc-a48bc7cb44cd",
      "state": "RESERVED",
      "order": {
        "order_id": "52ed9a3a-7c12-4f09-88ea-1087730a13c8",
        "short_number": 32,
        "pickup_at": "2026-10-30T20:55:27Z",
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
      "reserved_at": "2026-10-30T17:55:29.936923Z",
      "confirm_from": "2026-10-30T20:25:27Z",
      "confirm_until": "2026-10-30T20:35:27Z",
      "drop_until": "2026-10-30T19:55:27Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/429d5785-43e7-4526-bfdc-a48bc7cb44cd/confirm` → **409**

```json
{
  "command_id": "b572038e-c96f-4fac-9506-8c730726b50b"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/429d5785-43e7-4526-bfdc-a48bc7cb44cd/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "33bebcf6-6778-4b0e-bc50-7d8fcea02900"
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
  "session_id": "a4b2f380-17fd-4be1-bae0-a821ac10567d",
  "subject": {
    "type": "STAFF",
    "id": "c1a6f303-45cb-4836-9719-3861c6b8ed9b"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMWE2ZjMwMy00NWNiLTQ4MzYtOTcxOS0zODYxYzZiOGVkOWIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODM4MzAsImlhdCI6MTc5MzM4MjkzMCwianRpIjoiMjE5MDEwMWYtYTZmZC00NDQ2LTgzYWQtZmVkMjIyMjU3YTViIiwic2lkIjoiYTRiMmYzODAtMTdmZC00YmUxLWJhZTAtYTgyMWFjMTA1NjdkIn0.veihAdidmBZiPHNGwVgc58Lw4R_4hOq8RAofPGf06Wo",
  "access_expires_at": "2026-10-30T18:10:30.881290904Z",
  "refresh_token": "NlwM1KzFurq0kj6JnO53xKFd9RkZP1J53dmL8TVz-i4",
  "refresh_expires_at": "2026-10-31T05:55:30.880895942Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/52ed9a3a-7c12-4f09-88ea-1087730a13c8` → **200**

```json
{
  "id": "52ed9a3a-7c12-4f09-88ea-1087730a13c8",
  "short_number": 32,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "9603c0df-96eb-445d-9278-0edd20fd095a",
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
  "created_at": "2026-10-30T17:55:28.752314Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-30T20:55:27Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "429d5785-43e7-4526-bfdc-a48bc7cb44cd",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-30T17:55:29.936923Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/52ed9a3a-7c12-4f09-88ea-1087730a13c8/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-30T17:55:28.75314Z",
      "actor": {
        "type": "CLIENT",
        "id": "9603c0df-96eb-445d-9278-0edd20fd095a",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "52ed9a3a-7c12-4f09-88ea-1087730a13c8",
        "preorder": true,
        "quote_id": "e226071c-423c-4a06-8d00-4e2b63cdf0ba",
        "pickup_at": "2026-10-30T20:55:27Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "3e26745a-9c36-4d44-ae8d-b0416bda3e39"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-30T17:55:29.938005Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "52ed9a3a-7c12-4f09-88ea-1087730a13c8",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "429d5785-43e7-4526-bfdc-a48bc7cb44cd"
      },
      "correlation_id": "d1d2e917-2781-4304-8ba4-0597b0e2c188"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order 52ed9a3a-7c12-4f09-88ea-1087730a13c8, reservation 429d5785-43e7-4526-bfdc-a48bc7cb44cd.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-500"
}
```

```json
{
  "challenge_id": "a15f44d5-1e45-4ffe-a610-cbd9d25e75e8",
  "expires_at": "2026-10-30T18:00:31.452709315Z",
  "resend_available_at": "2026-10-30T17:55:32.452709315Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "035164",
  "sent_at": "2026-10-30T17:55:31.454564823Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a15f44d5-1e45-4ffe-a610-cbd9d25e75e8",
  "code": "035164",
  "device_ref": "sandbox-500"
}
```

```json
{
  "session_id": "60d1acce-8dbf-4ce7-9503-800fbfe2fff0",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4MzgzMSwiaWF0IjoxNzkzMzgyOTMxLCJqdGkiOiI1NDNmOTAwMS1hNmEwLTQ2MmMtYjZlMC0zYjdlMWZjOWMxNjciLCJzaWQiOiI2MGQxYWNjZS04ZGJmLTRjZTctOTUwMy04MDBmYmZlMmZmZjAifQ.pOv8mmlYlqbKCMqBbdfjIDko3jyI3bAJi53QfeAZeRQ",
  "access_expires_at": "2026-10-30T18:10:31.656195308Z",
  "refresh_token": "319MKJAnww4ZrJYjgPx0xerJwTfXfSRB_AAZw0AJufw",
  "refresh_expires_at": "2026-11-29T17:55:31.655856405Z",
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
  "command_id": "287529ac-8875-4bc3-a4e7-a11575d91bfe",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T17:55:32Z",
    "sequence": 1793382932356
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "192d683e-9837-4c36-a543-3deb06fb2e8d",
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
  "last_heartbeat_at": "2026-10-30T17:55:32.049797Z",
  "last_location_at": "2026-10-30T17:55:32.049797Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677521283",
  "device_ref": "sandbox-24876"
}
```

```json
{
  "challenge_id": "5d3f5a9d-1903-4d31-b6ff-874ea8fb0f78",
  "expires_at": "2026-10-30T18:00:32.234855239Z",
  "resend_available_at": "2026-10-30T17:55:33.234855239Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380677521283` → **200**

```json
{
  "phone": "+380677521283",
  "audience": "CLIENT",
  "code": "179642",
  "sent_at": "2026-10-30T17:55:32.23666663Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5d3f5a9d-1903-4d31-b6ff-874ea8fb0f78",
  "code": "179642",
  "device_ref": "sandbox-24876"
}
```

```json
{
  "session_id": "9c4549f5-3ec7-41e9-b6eb-ad0a400b7041",
  "subject": {
    "type": "CLIENT",
    "id": "f8fb10e2-91a7-4085-8b1b-972540d24025"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmOGZiMTBlMi05MWE3LTQwODUtOGIxYi05NzI1NDBkMjQwMjUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzgzODMyLCJpYXQiOjE3OTMzODI5MzIsImp0aSI6IjEzYTAwMzliLTRmYjUtNDE4YS1iZjEyLTI4ZDA0NzFiNWZjYiIsInNpZCI6IjljNDU0OWY1LTNlYzctNDFlOS1iNmViLWFkMGE0MDBiNzA0MSJ9.f30bXILm8IEZY2o6T_2fJAIxdrr0DcfuVSY3XrdEgJI",
  "access_expires_at": "2026-10-30T18:10:32.437329756Z",
  "refresh_token": "k2mGADtQsUm9HR4v7PKXY6g8CP3eGIROnJ7_Znc8ZFE",
  "refresh_expires_at": "2026-11-29T17:55:32.437012746Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f940c4e4-091b-4724-ae4e-1fb0d2f8c0aa",
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
  "id": "ec1ee6ba-3ecb-4c0f-b293-66561610a94c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T18:00:32.621064Z",
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
  "command_id": "8c64ccb1-af2b-48ec-b597-6fa5f5bcab95",
  "quote_id": "ec1ee6ba-3ecb-4c0f-b293-66561610a94c",
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
  "id": "3da65b2b-a9fc-45d1-9940-917302d27f44",
  "short_number": 33,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f8fb10e2-91a7-4085-8b1b-972540d24025",
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
  "created_at": "2026-10-30T17:55:32.817402Z",
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
    "id": "c4f74184-5bc4-4fec-bfad-87b30360591d",
    "order_id": "3da65b2b-a9fc-45d1-9940-917302d27f44",
    "expires_at": "2026-10-30T17:55:47.819398Z",
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

`POST /api/driver/v1/offers/c4f74184-5bc4-4fec-bfad-87b30360591d/accept` → **200**

```json
{
  "command_id": "d3c51906-2afc-457d-be01-5e1554e8fecc"
}
```

```json
{
  "id": "3f071a53-a80e-4d2a-8d90-99ba98c1da9e",
  "order_id": "3da65b2b-a9fc-45d1-9940-917302d27f44",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "07b323aa-68a7-4704-9b07-d3341f14d8b4",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "07b323aa-68a7-4704-9b07-d3341f14d8b4",
  "order_id": "3da65b2b-a9fc-45d1-9940-917302d27f44",
  "assignment_id": "3f071a53-a80e-4d2a-8d90-99ba98c1da9e",
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

`POST /api/driver/v1/work-sessions/192d683e-9837-4c36-a543-3deb06fb2e8d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T17:55:33Z",
    "sequence": 1793382933581
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "192d683e-9837-4c36-a543-3deb06fb2e8d",
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
  "last_heartbeat_at": "2026-10-30T17:55:33.596247Z",
  "last_location_at": "2026-10-30T17:55:33.596247Z",
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
  "id": "07b323aa-68a7-4704-9b07-d3341f14d8b4",
  "order_id": "3da65b2b-a9fc-45d1-9940-917302d27f44",
  "assignment_id": "3f071a53-a80e-4d2a-8d90-99ba98c1da9e",
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

`POST /api/driver/v1/trips/07b323aa-68a7-4704-9b07-d3341f14d8b4/arrive` → **200**

```json
{
  "command_id": "227e9efb-4af3-4cd8-beba-4097ae8d277a",
  "expected_version": 0
}
```

```json
{
  "id": "07b323aa-68a7-4704-9b07-d3341f14d8b4",
  "order_id": "3da65b2b-a9fc-45d1-9940-917302d27f44",
  "assignment_id": "3f071a53-a80e-4d2a-8d90-99ba98c1da9e",
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
  "arrived_at": "2026-10-30T17:55:33.958136Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/07b323aa-68a7-4704-9b07-d3341f14d8b4/start` → **200**

```json
{
  "command_id": "188d640f-e8f6-496f-a78e-72e58d9cad6b",
  "expected_version": 1
}
```

```json
{
  "id": "07b323aa-68a7-4704-9b07-d3341f14d8b4",
  "order_id": "3da65b2b-a9fc-45d1-9940-917302d27f44",
  "assignment_id": "3f071a53-a80e-4d2a-8d90-99ba98c1da9e",
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
  "arrived_at": "2026-10-30T17:55:33.958136Z",
  "started_at": "2026-10-30T17:55:34.146097Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

(the car drives 48 s to the next point)

`POST /api/driver/v1/work-sessions/192d683e-9837-4c36-a543-3deb06fb2e8d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T17:56:22Z",
    "sequence": 1793382982350
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "192d683e-9837-4c36-a543-3deb06fb2e8d",
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
  "last_heartbeat_at": "2026-10-30T17:56:22.364415Z",
  "last_location_at": "2026-10-30T17:56:22.364415Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/07b323aa-68a7-4704-9b07-d3341f14d8b4/complete` → **200**

```json
{
  "command_id": "05fc8b61-2069-416c-b50c-19a26d60c4d6",
  "expected_version": 2,
  "reported_at": "2026-10-30T17:56:22Z",
  "cash_received": true
}
```

```json
{
  "id": "07b323aa-68a7-4704-9b07-d3341f14d8b4",
  "order_id": "3da65b2b-a9fc-45d1-9940-917302d27f44",
  "assignment_id": "3f071a53-a80e-4d2a-8d90-99ba98c1da9e",
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
  "arrived_at": "2026-10-30T17:55:33.958136Z",
  "started_at": "2026-10-30T17:55:34.146097Z",
  "completed_at": "2026-10-30T17:56:22.552128Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/3da65b2b-a9fc-45d1-9940-917302d27f44/rating` → **200**

```json
{
  "command_id": "a2f173b2-77ec-4e8f-b78a-9e701b768e44",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "3da65b2b-a9fc-45d1-9940-917302d27f44",
  "score": 5,
  "created_at": "2026-10-30T17:56:22.751247942Z"
}
```

`POST /api/driver/v1/orders/3da65b2b-a9fc-45d1-9940-917302d27f44/rating` → **200**

```json
{
  "command_id": "8abad743-3525-4ea3-bfd4-d6c4dfe2303e",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "3da65b2b-a9fc-45d1-9940-917302d27f44",
  "score": 4,
  "created_at": "2026-10-30T17:56:22.941622726Z"
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
  "session_id": "7b9d27af-a0c1-4b7b-926b-9a37450b1eb0",
  "subject": {
    "type": "STAFF",
    "id": "c1a6f303-45cb-4836-9719-3861c6b8ed9b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMWE2ZjMwMy00NWNiLTQ4MzYtOTcxOS0zODYxYzZiOGVkOWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODM4ODMsImlhdCI6MTc5MzM4Mjk4MywianRpIjoiNzZhNGQzZWYtODZlZi00MzQ4LTg4ZDItYTMwMzBiZDVkMjc4Iiwic2lkIjoiN2I5ZDI3YWYtYTBjMS00YjdiLTkyNmItOWEzNzQ1MGIxZWIwIn0.iDjEtwTDxRsbP-ZHkH6xVr52K4QFzekH1cEqW2pTDr0",
  "access_expires_at": "2026-10-30T18:11:23.534892445Z",
  "refresh_token": "PCbwXF76tUX4_tkaEK6YXP9gy_eg784RXuVDnB4hrrc",
  "refresh_expires_at": "2026-10-31T05:56:23.534473788Z",
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
  "session_id": "df84a06e-3746-440e-a35b-83acd6bc0a77",
  "subject": {
    "type": "STAFF",
    "id": "c1a6f303-45cb-4836-9719-3861c6b8ed9b"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMWE2ZjMwMy00NWNiLTQ4MzYtOTcxOS0zODYxYzZiOGVkOWIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODM4ODMsImlhdCI6MTc5MzM4Mjk4MywianRpIjoiMGY1N2M0YzctODViMi00NDUzLWE1ZDAtMGViMDllOTljNGFmIiwic2lkIjoiZGY4NGEwNmUtMzc0Ni00NDBlLWEzNWItODNhY2Q2YmMwYTc3In0.YMeXOVZ_O7TDgptyeE5Z8x14cH5U7S2oHhZwAGxbHuA",
  "access_expires_at": "2026-10-30T18:11:23.928251999Z",
  "refresh_token": "yUX6Xbtgj_KWRbostv--fkSsdN-rB-KUyGsbK0iDxXA",
  "refresh_expires_at": "2026-10-31T05:56:23.927897863Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/3da65b2b-a9fc-45d1-9940-917302d27f44/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "3da65b2b-a9fc-45d1-9940-917302d27f44",
      "author_type": "RIDER",
      "author_id": "f8fb10e2-91a7-4085-8b1b-972540d24025",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-30T17:56:22.751248Z"
    },
    {
      "order_id": "3da65b2b-a9fc-45d1-9940-917302d27f44",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "f8fb10e2-91a7-4085-8b1b-972540d24025",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-30T17:56:22.941623Z"
    }
  ]
}
```

Done: ratings for order 3da65b2b-a9fc-45d1-9940-917302d27f44.

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
  "session_id": "705b4e67-5059-43d9-a103-d6f26d771039",
  "subject": {
    "type": "STAFF",
    "id": "c1a6f303-45cb-4836-9719-3861c6b8ed9b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMWE2ZjMwMy00NWNiLTQ4MzYtOTcxOS0zODYxYzZiOGVkOWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODM4ODQsImlhdCI6MTc5MzM4Mjk4NCwianRpIjoiMzYzMzI0MGUtYjgzNy00NjFlLWEyYWEtZDU3Zjk0OTAzZmIyIiwic2lkIjoiNzA1YjRlNjctNTA1OS00M2Q5LWExMDMtZDZmMjZkNzcxMDM5In0.FOAdrBWPnaz1XEaplalW255SMr9_NoxtJU8WDx-Ui3Y",
  "access_expires_at": "2026-10-30T18:11:24.510353833Z",
  "refresh_token": "YCYhebQZApcqTAGfCwPmFTWME3GzWk9iAkR9ia39ck0",
  "refresh_expires_at": "2026-10-31T05:56:24.509977613Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "6a257e82-06fa-4173-afd9-adca9c698d97",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "54561126-b642-4333-8832-ccfdd709da60",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T17:56:24.699855Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/54561126-b642-4333-8832-ccfdd709da60` → **200**

```json
{
  "id": "54561126-b642-4333-8832-ccfdd709da60",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T17:56:24.699855Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/54561126-b642-4333-8832-ccfdd709da60` → **200**

```json
{
  "id": "54561126-b642-4333-8832-ccfdd709da60",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T17:56:24.699855Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/54561126-b642-4333-8832-ccfdd709da60` → **200**

```json
{
  "id": "54561126-b642-4333-8832-ccfdd709da60",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-30.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-30T17:56:24.699855Z",
  "ready_at": "2026-10-30T17:56:26.198032Z",
  "expires_at": "2026-10-31T17:56:26.198032Z"
}
```

`GET /api/admin/v1/reports/exports/54561126-b642-4333-8832-ccfdd709da60/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-30,31,11,20,0,0,26,5,0,28,2,0,1,7,1,12
total,31,11,20,0,0,26,5,0,28,2,0,1,7,1,12
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "6e8531ec-a411-42a3-bbdf-f86bea3f5285",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "f2d13821-6448-4d04-b107-e9a9fd84235e",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T17:56:27.526006Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/f2d13821-6448-4d04-b107-e9a9fd84235e` → **200**

```json
{
  "id": "f2d13821-6448-4d04-b107-e9a9fd84235e",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T17:56:27.526006Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/f2d13821-6448-4d04-b107-e9a9fd84235e` → **200**

```json
{
  "id": "f2d13821-6448-4d04-b107-e9a9fd84235e",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T17:56:27.526006Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/f2d13821-6448-4d04-b107-e9a9fd84235e` → **200**

```json
{
  "id": "f2d13821-6448-4d04-b107-e9a9fd84235e",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T17:56:27.526006Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/f2d13821-6448-4d04-b107-e9a9fd84235e` → **200**

```json
{
  "id": "f2d13821-6448-4d04-b107-e9a9fd84235e",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-30.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-30T17:56:27.526006Z",
  "ready_at": "2026-10-30T17:56:31.204424Z",
  "expires_at": "2026-10-31T17:56:31.204424Z"
}
```

`GET /api/admin/v1/reports/exports/f2d13821-6448-4d04-b107-e9a9fd84235e/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-30,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
total,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/a13c8aba-b86f-471b-a82a-648ce8cb3a08` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/a13c8aba-b86f-471b-a82a-648ce8cb3a08",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "c3c36110-0cd8-4c92-9e3a-73bca53b047c"
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
  "session_id": "113b291a-3493-4dcb-b7f9-950025e7f6c7",
  "subject": {
    "type": "STAFF",
    "id": "c1a6f303-45cb-4836-9719-3861c6b8ed9b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMWE2ZjMwMy00NWNiLTQ4MzYtOTcxOS0zODYxYzZiOGVkOWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODM4OTEsImlhdCI6MTc5MzM4Mjk5MSwianRpIjoiYWYwMDUwMmMtZjFjMC00Y2M0LWI2NjMtNzc5NGNhZWExNzcxIiwic2lkIjoiMTEzYjI5MWEtMzQ5My00ZGNiLWI3ZjktOTUwMDI1ZTdmNmM3In0.hSRppTl8Dw1vqnonutUvwrnSQcEhuuTeLRd-APIQBqs",
  "access_expires_at": "2026-10-30T18:11:31.993476677Z",
  "refresh_token": "3GQW-YlbfmNtZt8eiU90v-_p704yaO-OA5cSg4fvc6Y",
  "refresh_expires_at": "2026-10-31T05:56:31.993071768Z",
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
  "command_id": "94b12beb-9312-44e2-909a-f546399b5390",
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
  "changed_by": "c1a6f303-45cb-4836-9719-3861c6b8ed9b",
  "reason": "Sandbox retention boundary",
  "changed_at": "2026-10-30T17:56:32.386893285Z"
}
```

`POST /sandbox/v1/retention/fixtures/705953b2-d83d-4b49-9a97-91a4d1047a07` → **200**

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

`GET /sandbox/v1/retention/fixtures/705953b2-d83d-4b49-9a97-91a4d1047a07` → **200**

```json
{
  "old_done": 0,
  "recent_done": 1,
  "failed": 1
}
```

Old DONE event removed; recent DONE and old FAILED events retained. Policy and synthetic fixtures restored on exit.

`DELETE /sandbox/v1/retention/fixtures/705953b2-d83d-4b49-9a97-91a4d1047a07` → **204**

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
  "changed_by": "c1a6f303-45cb-4836-9719-3861c6b8ed9b",
  "reason": "Sandbox retention boundary",
  "changed_at": "2026-10-30T17:56:32.386893Z"
}
```

`PUT /api/admin/v1/retention` → **200**

```json
{
  "command_id": "2a58c520-91db-4994-b70d-a0213637dbea",
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
  "changed_by": "c1a6f303-45cb-4836-9719-3861c6b8ed9b",
  "reason": "Restore policy after retention sandbox",
  "changed_at": "2026-10-30T17:56:32.867784669Z"
}
```

# Scenario: risk-flag

## The driver starts a new shift in Kyiv

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-9050"
}
```

```json
{
  "challenge_id": "dfaf2f31-32f1-45e5-961e-dbaa5493bcfc",
  "expires_at": "2026-10-30T18:01:33.068158874Z",
  "resend_available_at": "2026-10-30T17:56:34.068158874Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "751728",
  "sent_at": "2026-10-30T17:56:33.070550308Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "dfaf2f31-32f1-45e5-961e-dbaa5493bcfc",
  "code": "751728",
  "device_ref": "sandbox-9050"
}
```

```json
{
  "session_id": "81b1a7cc-e0e3-44b8-9a38-6e7fdaaf5980",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4Mzg5MywiaWF0IjoxNzkzMzgyOTkzLCJqdGkiOiI2NTZkYzhkYy1hZjYzLTQwNTEtODE2NS1hZjQyMmU5ZjQ5YzYiLCJzaWQiOiI4MWIxYTdjYy1lMGUzLTQ0YjgtOWEzOC02ZTdmZGFhZjU5ODAifQ.sJhP3Q5v3lXSf6V6nbIakKSO9mW7XCNAHzfmK7djmTM",
  "access_expires_at": "2026-10-30T18:11:33.280551568Z",
  "refresh_token": "PzHNPCOmFmbDCvKcTcNMBW9Q7RlgExVqFjr1ZNYpQ5g",
  "refresh_expires_at": "2026-11-29T17:56:33.280210352Z",
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
  "command_id": "9b819061-587e-483b-a469-9ff1e062b82e",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T17:56:33Z",
    "sequence": 1793382993844
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "69b06266-ccfb-443c-9e43-d8256441086d",
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
  "last_heartbeat_at": "2026-10-30T17:56:33.861023Z",
  "last_location_at": "2026-10-30T17:56:33.861023Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "b76ebfb2-0c73-441d-8361-7b088cdae06c",
  "points": [
    {
      "sequence": 1793382996595,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-30T17:55:36Z"
    },
    {
      "sequence": 1793382996658,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-30T17:56:36Z"
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
  "session_id": "da5fbdd3-a4ea-4168-8527-62fa2592635b",
  "subject": {
    "type": "STAFF",
    "id": "c1a6f303-45cb-4836-9719-3861c6b8ed9b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMWE2ZjMwMy00NWNiLTQ4MzYtOTcxOS0zODYxYzZiOGVkOWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODM4OTYsImlhdCI6MTc5MzM4Mjk5NiwianRpIjoiNjhmZjllMTEtNDQxZi00MDkyLTk2NzktNjUxNmFlYjgwMjlmIiwic2lkIjoiZGE1ZmJkZDMtYTRlYS00MTY4LTg1MjctNjJmYTI1OTI2MzViIn0.BQ671Yb0LPe_XMe7NlsA-V77RTni2qwwDLr1lHKnfxM",
  "access_expires_at": "2026-10-30T18:11:36.524459797Z",
  "refresh_token": "5P61O_nPXqm6n54EaZlLmehD9n1w7ZaPrt9FqfOyAwE",
  "refresh_expires_at": "2026-10-31T05:56:36.524066642Z",
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
      "id": "dbb1c524-478f-4458-abc6-7b91698de71b",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-30T17:56:36Z",
        "track_point_id": "1383f78e-e010-4e42-8488-660c260e1dde",
        "work_session_id": "69b06266-ccfb-443c-9e43-d8256441086d"
      },
      "raised_by": null,
      "raised_at": "2026-10-30T17:56:36Z",
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

`POST /api/admin/v1/driver-risk-flags/dbb1c524-478f-4458-abc6-7b91698de71b/confirm` → **200**

```json
{
  "command_id": "1c94ac60-9c46-4422-86a6-23acc4c8376a",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "dbb1c524-478f-4458-abc6-7b91698de71b",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-30T17:56:36Z",
    "track_point_id": "1383f78e-e010-4e42-8488-660c260e1dde",
    "work_session_id": "69b06266-ccfb-443c-9e43-d8256441086d"
  },
  "raised_by": null,
  "raised_at": "2026-10-30T17:56:36Z",
  "reason": null,
  "reviewed_by": "c1a6f303-45cb-4836-9719-3861c6b8ed9b",
  "reviewed_at": "2026-10-30T17:56:38.336853Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/dbb1c524-478f-4458-abc6-7b91698de71b/dismiss` → **409**

```json
{
  "command_id": "6ad1411b-70b5-4802-a1f6-1e1877505feb",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/dbb1c524-478f-4458-abc6-7b91698de71b/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "6f1dfda0-f42e-4680-b4cd-4afdec5ea47d"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "6929b1da-c1f8-4e21-89aa-e2d666f68341",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "8c714598-e3af-433f-9c9e-21b862a0f7c4",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "c1a6f303-45cb-4836-9719-3861c6b8ed9b",
  "raised_at": "2026-10-30T17:56:38.753575Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/8c714598-e3af-433f-9c9e-21b862a0f7c4/dismiss` → **200**

```json
{
  "command_id": "ae9d80b6-39e9-4fb0-8b33-ded2424c7748",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "8c714598-e3af-433f-9c9e-21b862a0f7c4",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "c1a6f303-45cb-4836-9719-3861c6b8ed9b",
  "raised_at": "2026-10-30T17:56:38.753575Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "c1a6f303-45cb-4836-9719-3861c6b8ed9b",
  "reviewed_at": "2026-10-30T17:56:38.968086Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "314c6f9d-9074-482a-b016-5e0ad28003f7",
  "expected_version": 12,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "dbb1c524-478f-4458-abc6-7b91698de71b"
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
      "actor_id": "c1a6f303-45cb-4836-9719-3861c6b8ed9b",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T17:56:39.171414Z"
    }
  ],
  "duplicates": []
}
```

Done: flag dbb1c524-478f-4458-abc6-7b91698de71b confirmed, suspension named it, driver reinstated.

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "de29f84f-43dc-4148-acdb-8b0819fd4c7f",
  "subject": {
    "type": "STAFF",
    "id": "c1a6f303-45cb-4836-9719-3861c6b8ed9b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMWE2ZjMwMy00NWNiLTQ4MzYtOTcxOS0zODYxYzZiOGVkOWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODM4OTksImlhdCI6MTc5MzM4Mjk5OSwianRpIjoiOTQ1MDAyYzUtNDZmMS00ZDU5LWI2NGYtZTdiMGFiZmE2Y2E5Iiwic2lkIjoiZGUyOWY4NGYtNDNkYy00MTQ4LWFjZGItOGIwODE5ZmQ0YzdmIn0.9upOpp-e7xhf_14PCwKkHQuZ-KxDWnA4jkmrH6iwn3A",
  "access_expires_at": "2026-10-30T18:11:39.783480797Z",
  "refresh_token": "i2l-Fv2cYx9fNSS1dpKOV8eggRFf1OIHyiYd6MnPiKs",
  "refresh_expires_at": "2026-10-31T05:56:39.783081964Z",
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
      "actor_id": "c1a6f303-45cb-4836-9719-3861c6b8ed9b",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T17:56:39.171414Z"
    }
  ],
  "duplicates": []
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "36f635c5-052b-4631-921c-3d516526ee08",
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
  "session_id": "69b06266-ccfb-443c-9e43-d8256441086d",
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
  "last_heartbeat_at": "2026-10-30T17:56:33.861023Z",
  "last_location_at": "2026-10-30T17:56:33.861023Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/69b06266-ccfb-443c-9e43-d8256441086d/close` → **200**

```json
{
  "command_id": "a34e2974-b110-4910-a271-a75abc2efff7",
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
  "session_id": "9faa9ddc-aff1-48a2-9c0c-093ef7eb8ca8",
  "subject": {
    "type": "STAFF",
    "id": "c1a6f303-45cb-4836-9719-3861c6b8ed9b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMWE2ZjMwMy00NWNiLTQ4MzYtOTcxOS0zODYxYzZiOGVkOWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODM5MDAsImlhdCI6MTc5MzM4MzAwMCwianRpIjoiYThmNWVlZjItOGIzMi00MGY3LWIwZDMtYzcyMjM4MDFmOTg5Iiwic2lkIjoiOWZhYTlkZGMtYWZmMS00OGEyLTljMGMtMDkzZWY3ZWI4Y2E4In0.eCOe2Bo0L5OOLHsIHdE3b2sYZV4k_QwS8-nwNq4pXQw",
  "access_expires_at": "2026-10-30T18:11:40.985229298Z",
  "refresh_token": "gKlMX9CxyvYuQQSyJ1wU07jMu8iRxEHOSSrs_j0zC94",
  "refresh_expires_at": "2026-10-31T05:56:40.984748073Z",
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
  "command_id": "6dafe41b-9346-4b98-81ae-440780112822",
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
  "changed_by": "c1a6f303-45cb-4836-9719-3861c6b8ed9b",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T17:56:41.385344Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "6dafe41b-9346-4b98-81ae-440780112822",
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
  "changed_by": "c1a6f303-45cb-4836-9719-3861c6b8ed9b",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T17:56:41.385344Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48039081287",
  "device_ref": "sandbox-31244"
}
```

```json
{
  "challenge_id": "1999ac79-19e5-43ad-9200-df5cfb590ca1",
  "expires_at": "2026-10-30T18:01:41.772245673Z",
  "resend_available_at": "2026-10-30T17:56:42.772245673Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48039081287` → **200**

```json
{
  "phone": "+48039081287",
  "audience": "CLIENT",
  "code": "864680",
  "sent_at": "2026-10-30T17:56:41.774107941Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1999ac79-19e5-43ad-9200-df5cfb590ca1",
  "code": "864680",
  "device_ref": "sandbox-31244"
}
```

```json
{
  "session_id": "99bfb313-57c9-4166-812a-9984b4377a8d",
  "subject": {
    "type": "CLIENT",
    "id": "da743258-204c-4c49-a20a-a60c83175571"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYTc0MzI1OC0yMDRjLTRjNDktYTIwYS1hNjBjODMxNzU1NzEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzgzOTAxLCJpYXQiOjE3OTMzODMwMDEsImp0aSI6IjIxOGY5ZjI3LWZiYTMtNGE5YS05MDgzLWNlNDlhMTU3MmQ2YyIsInNpZCI6Ijk5YmZiMzEzLTU3YzktNDE2Ni04MTJhLTk5ODRiNDM3N2E4ZCJ9.037R04OdpQt4Jn5-qxtPvwAVazPfHB78AUJ-GBXnorc",
  "access_expires_at": "2026-10-30T18:11:41.976445057Z",
  "refresh_token": "GtXDJPdKnv4YhDKvSP0vb7GtodoqiAE2flv3QI2O0aM",
  "refresh_expires_at": "2026-11-29T17:56:41.976088988Z",
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
  "correlation_id": "e0bf9297-d511-4725-b5bf-e913f8a602e0"
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
  "device_ref": "sandbox-16067"
}
```

```json
{
  "challenge_id": "0f6b541c-7434-4713-843a-cefd0dd9b894",
  "expires_at": "2026-10-30T18:01:42.523933348Z",
  "resend_available_at": "2026-10-30T17:56:43.523933348Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "833524",
  "sent_at": "2026-10-30T17:56:42.525761365Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0f6b541c-7434-4713-843a-cefd0dd9b894",
  "code": "833524",
  "device_ref": "sandbox-16067"
}
```

```json
{
  "session_id": "cbbdb7db-fdc2-4e37-8e07-1834d5e2c98f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4MzkwMiwiaWF0IjoxNzkzMzgzMDAyLCJqdGkiOiIwMmI0ZmMwYS1kM2EwLTQ0YzAtODU5ZS1lMmU2M2IyYWU1NzciLCJzaWQiOiJjYmJkYjdkYi1mZGMyLTRlMzctOGUwNy0xODM0ZDVlMmM5OGYifQ.txdAbq2ZGX15tb0ttiDcW7nvWJ5D4KcnIMYbKoTEBG4",
  "access_expires_at": "2026-10-30T18:11:42.729279743Z",
  "refresh_token": "xI_bn5H1CUUmZT4yAtmIvsa8x3i9eioyOBS1-ZGbN5g",
  "refresh_expires_at": "2026-11-29T17:56:42.728832621Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "f4b16bfe-6258-4e94-a040-30298ebb45e7",
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
  "last_heartbeat_at": "2026-10-30T17:55:29.552568Z",
  "last_location_at": "2026-10-30T17:55:29.552568Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/f4b16bfe-6258-4e94-a040-30298ebb45e7/handover` → **200**

```json
{
  "command_id": "bdf8db2b-e0fa-40cd-abea-06030f612c88",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "f4b16bfe-6258-4e94-a040-30298ebb45e7",
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
  "last_heartbeat_at": "2026-10-30T17:55:29.552568Z",
  "last_location_at": "2026-10-30T17:55:29.552568Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/f4b16bfe-6258-4e94-a040-30298ebb45e7/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T17:56:43Z",
    "sequence": 1793383003301
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "f4b16bfe-6258-4e94-a040-30298ebb45e7",
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
  "last_heartbeat_at": "2026-10-30T17:56:43.317487Z",
  "last_location_at": "2026-10-30T17:56:43.317487Z",
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
  "session_id": "f4b16bfe-6258-4e94-a040-30298ebb45e7",
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
  "last_heartbeat_at": "2026-10-30T17:56:43.317487Z",
  "last_location_at": "2026-10-30T17:56:43.317487Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f4b16bfe-6258-4e94-a040-30298ebb45e7/close` → **200**

```json
{
  "command_id": "90b8afca-e558-4821-840a-d1a3fc28f405",
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
  "correlation_id": "ce4d1489-27d8-4397-b8db-d9fc69cabdc2"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674032990",
  "device_ref": "sandbox-12697"
}
```

```json
{
  "challenge_id": "6b85c7af-9e86-47f2-aa4c-07837072115c",
  "expires_at": "2026-10-30T18:01:44.314375369Z",
  "resend_available_at": "2026-10-30T17:56:45.314375369Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380674032990` → **200**

```json
{
  "phone": "+380674032990",
  "audience": "CLIENT",
  "code": "961143",
  "sent_at": "2026-10-30T17:56:44.316287037Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6b85c7af-9e86-47f2-aa4c-07837072115c",
  "code": "961143",
  "device_ref": "sandbox-12697"
}
```

```json
{
  "session_id": "351a2e36-a86e-4593-9dcd-2d452c4366ef",
  "subject": {
    "type": "CLIENT",
    "id": "85ec0268-20df-4fe2-bb70-8ad0369c58ee"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NWVjMDI2OC0yMGRmLTRmZTItYmI3MC04YWQwMzY5YzU4ZWUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzgzOTA0LCJpYXQiOjE3OTMzODMwMDQsImp0aSI6IjVmNTI1YTViLTJjMTgtNDljNy04MTBkLWM5Yzc0OTZiOTg5MSIsInNpZCI6IjM1MWEyZTM2LWE4NmUtNDU5My05ZGNkLTJkNDUyYzQzNjZlZiJ9.SGyTZmpHdfSM0pNS2RUQb-H4jiLjJTkNDzfbC9LB-7o",
  "access_expires_at": "2026-10-30T18:11:44.519999364Z",
  "refresh_token": "Wg2pfc7dAgZjg8bzuYBW5yw0FSmsinqkQfyY4fIQS_I",
  "refresh_expires_at": "2026-11-29T17:56:44.519559048Z",
  "account_created": true
}
```

## The EICAR antivirus test file is refused by the antivirus

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "fb08d043-bbf8-484e-ae5c-7bb1bdfc6d58",
  "content_type": "application/pdf",
  "size_bytes": 86
}
```

```json
{
  "file_id": "2ae0b86e-b7b7-431b-8290-5aabd1a836af",
  "upload_path": "/api/rider/v1/uploads/2ae0b86e-b7b7-431b-8290-5aabd1a836af",
  "expires_at": "2026-10-30T18:11:44.754660838Z",
  "max_bytes": 86
}
```

`PUT /api/rider/v1/uploads/2ae0b86e-b7b7-431b-8290-5aabd1a836af` → **200**

```json
{
  "file_id": "2ae0b86e-b7b7-431b-8290-5aabd1a836af",
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
  "command_id": "77eae844-7f6a-484a-acc9-fb8ed027a11b",
  "content_type": "application/pdf",
  "size_bytes": 92
}
```

```json
{
  "file_id": "51c50613-b76d-44ae-8ed2-8537c4c775d3",
  "upload_path": "/api/rider/v1/uploads/51c50613-b76d-44ae-8ed2-8537c4c775d3",
  "expires_at": "2026-10-30T18:11:44.970794085Z",
  "max_bytes": 92
}
```

`PUT /api/rider/v1/uploads/51c50613-b76d-44ae-8ed2-8537c4c775d3` → **200**

```json
{
  "file_id": "51c50613-b76d-44ae-8ed2-8537c4c775d3",
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
  "command_id": "4c13d12d-42aa-4133-997a-ecea11812033",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "c38c344a-ef24-451a-a08c-16b370e0c94b",
  "upload_path": "/api/rider/v1/uploads/c38c344a-ef24-451a-a08c-16b370e0c94b",
  "expires_at": "2026-10-30T18:11:45.182074046Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/c38c344a-ef24-451a-a08c-16b370e0c94b` → **200**

```json
{
  "file_id": "c38c344a-ef24-451a-a08c-16b370e0c94b",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "f6325598-a6d2-47bb-8997-c1a9c24a2871",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "c38c344a-ef24-451a-a08c-16b370e0c94b"
  ]
}
```

```json
{
  "id": "dba1b5ec-f752-4869-9961-2e82ba415772",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "85ec0268-20df-4fe2-bb70-8ad0369c58ee",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T17:56:45.395863Z",
  "updated_at": "2026-10-30T17:56:45.395863Z",
  "respond_by": "2026-10-30T21:56:45.395863Z",
  "messages": [
    {
      "id": "47ecb573-a23e-422c-8e94-dc4a73139769",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "85ec0268-20df-4fe2-bb70-8ad0369c58ee",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T17:56:45.396771Z",
      "attachments": [
        {
          "file_id": "c38c344a-ef24-451a-a08c-16b370e0c94b",
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
  "session_id": "5b7e91b4-c185-4b1c-8b84-69d958e97080",
  "subject": {
    "type": "STAFF",
    "id": "c1a6f303-45cb-4836-9719-3861c6b8ed9b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMWE2ZjMwMy00NWNiLTQ4MzYtOTcxOS0zODYxYzZiOGVkOWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODM5MDUsImlhdCI6MTc5MzM4MzAwNSwianRpIjoiY2IzMzA1ZWYtMWEwOS00M2I5LTk3YjItYjcyZDhlNTc2MjI5Iiwic2lkIjoiNWI3ZTkxYjQtYzE4NS00YjFjLThiODQtNjlkOTU4ZTk3MDgwIn0.jko9AH09G_FBNesQPY0wZRqLw9YVYwS702bGDF74BQo",
  "access_expires_at": "2026-10-30T18:11:45.841681988Z",
  "refresh_token": "yk1XiHN0lQqNGidweqabt66Twqh8K30Jv6f7xlGMXm8",
  "refresh_expires_at": "2026-10-31T05:56:45.841311968Z",
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
  "session_id": "5018ec5d-bd20-46e3-8f56-4f54e9dfd194",
  "subject": {
    "type": "STAFF",
    "id": "c1a6f303-45cb-4836-9719-3861c6b8ed9b"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMWE2ZjMwMy00NWNiLTQ4MzYtOTcxOS0zODYxYzZiOGVkOWIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODM5MDYsImlhdCI6MTc5MzM4MzAwNiwianRpIjoiNGJjMDQzYzQtMDEzNS00Mjk3LTliODgtOGJlMjdmNjcwZGVlIiwic2lkIjoiNTAxOGVjNWQtYmQyMC00NmUzLThmNTYtNGY1NGU5ZGZkMTk0In0.iE_w-0aq9p9pn8eHEU1J-D6xZgArXhu-a9k6lQzhLY8",
  "access_expires_at": "2026-10-30T18:11:46.239864558Z",
  "refresh_token": "VvCT_yPmU7UV2XzJlhmKpuIs6r-uCIEset9RERUbtLw",
  "refresh_expires_at": "2026-10-31T05:56:46.239466585Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/dba1b5ec-f752-4869-9961-2e82ba415772/attachments/c38c344a-ef24-451a-a08c-16b370e0c94b` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "986d1125-da90-46ee-a7fb-36cb83de1a6a",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "538e9c14-fffc-4ae2-88cf-6503e9818dd6",
  "upload_path": "/api/operator/v1/uploads/538e9c14-fffc-4ae2-88cf-6503e9818dd6",
  "expires_at": "2026-10-30T18:11:46.440218751Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/538e9c14-fffc-4ae2-88cf-6503e9818dd6` → **200**

```json
{
  "file_id": "538e9c14-fffc-4ae2-88cf-6503e9818dd6",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/dba1b5ec-f752-4869-9961-2e82ba415772` → **200**

```json
{
  "id": "dba1b5ec-f752-4869-9961-2e82ba415772",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "85ec0268-20df-4fe2-bb70-8ad0369c58ee",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T17:56:45.395863Z",
  "updated_at": "2026-10-30T17:56:45.395863Z",
  "respond_by": "2026-10-30T21:56:45.395863Z",
  "messages": [
    {
      "id": "47ecb573-a23e-422c-8e94-dc4a73139769",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "85ec0268-20df-4fe2-bb70-8ad0369c58ee",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T17:56:45.396771Z",
      "attachments": [
        {
          "file_id": "c38c344a-ef24-451a-a08c-16b370e0c94b",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/dba1b5ec-f752-4869-9961-2e82ba415772/comments` → **200**

```json
{
  "command_id": "418ef6a8-e98c-4649-a0e9-5a6eedb774f5",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "538e9c14-fffc-4ae2-88cf-6503e9818dd6"
  ]
}
```

```json
{
  "id": "dba1b5ec-f752-4869-9961-2e82ba415772",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "85ec0268-20df-4fe2-bb70-8ad0369c58ee",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T17:56:45.395863Z",
  "updated_at": "2026-10-30T17:56:46.852184Z",
  "respond_by": "2026-10-30T21:56:45.395863Z",
  "messages": [
    {
      "id": "47ecb573-a23e-422c-8e94-dc4a73139769",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "85ec0268-20df-4fe2-bb70-8ad0369c58ee",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T17:56:45.396771Z",
      "attachments": [
        {
          "file_id": "c38c344a-ef24-451a-a08c-16b370e0c94b",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "e75ca3ef-50bc-487d-bebe-e6d78b47e58a",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "c1a6f303-45cb-4836-9719-3861c6b8ed9b",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T17:56:46.851773Z",
      "attachments": [
        {
          "file_id": "538e9c14-fffc-4ae2-88cf-6503e9818dd6",
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

`GET /api/rider/v1/support/cases/dba1b5ec-f752-4869-9961-2e82ba415772` → **200**

```json
{
  "id": "dba1b5ec-f752-4869-9961-2e82ba415772",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "85ec0268-20df-4fe2-bb70-8ad0369c58ee",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T17:56:45.395863Z",
  "updated_at": "2026-10-30T17:56:46.852184Z",
  "respond_by": "2026-10-30T21:56:45.395863Z",
  "messages": [
    {
      "id": "47ecb573-a23e-422c-8e94-dc4a73139769",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "85ec0268-20df-4fe2-bb70-8ad0369c58ee",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T17:56:45.396771Z",
      "attachments": [
        {
          "file_id": "c38c344a-ef24-451a-a08c-16b370e0c94b",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "e75ca3ef-50bc-487d-bebe-e6d78b47e58a",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T17:56:46.851773Z",
      "attachments": [
        {
          "file_id": "538e9c14-fffc-4ae2-88cf-6503e9818dd6",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/dba1b5ec-f752-4869-9961-2e82ba415772/attachments/538e9c14-fffc-4ae2-88cf-6503e9818dd6` → **200**

Done: support case dba1b5ec-f752-4869-9961-2e82ba415772, rider attachment c38c344a-ef24-451a-a08c-16b370e0c94b, operator attachment 538e9c14-fffc-4ae2-88cf-6503e9818dd6.

# Scenario: switch-to-cash

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380733610508",
  "device_ref": "sandbox-28823"
}
```

```json
{
  "challenge_id": "e318b448-169e-4279-bfb1-552fdbe58340",
  "expires_at": "2026-10-30T18:01:47.26782732Z",
  "resend_available_at": "2026-10-30T17:56:48.26782732Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380733610508` → **200**

```json
{
  "phone": "+380733610508",
  "audience": "CLIENT",
  "code": "929584",
  "sent_at": "2026-10-30T17:56:47.269605969Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e318b448-169e-4279-bfb1-552fdbe58340",
  "code": "929584",
  "device_ref": "sandbox-28823"
}
```

```json
{
  "session_id": "9bffc445-03e0-4b02-93cf-e3bd5305f217",
  "subject": {
    "type": "CLIENT",
    "id": "29fb1bb9-d874-4664-92d2-13d98936949e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyOWZiMWJiOS1kODc0LTQ2NjQtOTJkMi0xM2Q5ODkzNjk0OWUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzgzOTA3LCJpYXQiOjE3OTMzODMwMDcsImp0aSI6IjkxYmRkZjkwLTIxZTctNDFkOC1hMjBmLTJlNWRkOTJjMWRmOCIsInNpZCI6IjliZmZjNDQ1LTAzZTAtNGIwMi05M2NmLWUzYmQ1MzA1ZjIxNyJ9.imEFCgiuz_cLJCvsBBhz6gYEi8pntcpKz1Z2pWG2HNs",
  "access_expires_at": "2026-10-30T18:11:47.571337555Z",
  "refresh_token": "-WCEZEC1LpqCwv-kQN8riwfMoSKGWkGs7Rkr5IVIGy8",
  "refresh_expires_at": "2026-11-29T17:56:47.56949402Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "20cd1a8e-166b-4861-9c89-e690c55a9c29",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "0d81a018-6464-446a-8712-69541e72603e",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-0d81a018-6464-446a-8712-69541e72603e",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "4b86bdf919f7e81ea96d98f3354bfb19",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=0d81a018-6464-446a-8712-69541e72603e",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380733610508"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=0d81a018-6464-446a-8712-69541e72603e",
  "expires_at": "2026-10-30T18:26:47.785854Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/0d81a018-6464-446a-8712-69541e72603e` → **200**

```json
{
  "id": "0d81a018-6464-446a-8712-69541e72603e",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T18:26:47.785854Z",
  "card": {
    "id": "2e3b47e1-17d7-4809-b2e0-f9285030a165",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****8316",
    "card_type": "Visa",
    "created_at": "2026-10-30T17:56:47.986029Z"
  },
  "failure_reason": null
}
```

## The rider orders by card: the hold is taken

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "380c4ba0-da7e-45e9-9b2e-3414e79314ef",
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
  "id": "73a81e2a-41ed-4fab-8719-3b2f69dc06c8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T18:01:48.196251Z",
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
  "command_id": "ca9ccf50-7174-4cd3-9438-5615c5ad1f8e",
  "quote_id": "73a81e2a-41ed-4fab-8719-3b2f69dc06c8",
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
  "id": "3d7932ad-b9d9-40f8-9d1e-4ac132d4e3ad",
  "short_number": 34,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "29fb1bb9-d874-4664-92d2-13d98936949e",
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
  "created_at": "2026-10-30T17:56:48.404941Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3d7932ad-b9d9-40f8-9d1e-4ac132d4e3ad` → **200**

```json
{
  "id": "3d7932ad-b9d9-40f8-9d1e-4ac132d4e3ad",
  "short_number": 34,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "29fb1bb9-d874-4664-92d2-13d98936949e",
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
  "created_at": "2026-10-30T17:56:48.404941Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3d7932ad-b9d9-40f8-9d1e-4ac132d4e3ad` → **200**

```json
{
  "id": "3d7932ad-b9d9-40f8-9d1e-4ac132d4e3ad",
  "short_number": 34,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "29fb1bb9-d874-4664-92d2-13d98936949e",
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
  "created_at": "2026-10-30T17:56:48.404941Z",
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

`GET /api/rider/v1/orders/3d7932ad-b9d9-40f8-9d1e-4ac132d4e3ad` → **200**

```json
{
  "id": "3d7932ad-b9d9-40f8-9d1e-4ac132d4e3ad",
  "short_number": 34,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "29fb1bb9-d874-4664-92d2-13d98936949e",
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
  "created_at": "2026-10-30T17:56:48.404941Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/3d7932ad-b9d9-40f8-9d1e-4ac132d4e3ad/switch-to-cash` → **200**

```json
{
  "command_id": "2eef6450-b451-47a6-8588-0f4023aacd22",
  "expected_version": 3
}
```

```json
{
  "id": "3d7932ad-b9d9-40f8-9d1e-4ac132d4e3ad",
  "short_number": 34,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "29fb1bb9-d874-4664-92d2-13d98936949e",
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
  "created_at": "2026-10-30T17:56:48.404941Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/3d7932ad-b9d9-40f8-9d1e-4ac132d4e3ad/switch-to-cash` → **409**

```json
{
  "command_id": "631f35b6-6903-4455-bdcd-58b6343a0361",
  "expected_version": 4
}
```

```json
{
  "instance": "/api/rider/v1/orders/3d7932ad-b9d9-40f8-9d1e-4ac132d4e3ad/switch-to-cash",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "6d43db38-c781-4404-9227-0666bfee9f8f"
}
```

Done: the card order became cash; a second switch is refused.

`GET /api/rider/v1/orders/3d7932ad-b9d9-40f8-9d1e-4ac132d4e3ad` → **200**

```json
{
  "id": "3d7932ad-b9d9-40f8-9d1e-4ac132d4e3ad",
  "short_number": 34,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "29fb1bb9-d874-4664-92d2-13d98936949e",
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
  "created_at": "2026-10-30T17:56:48.404941Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/3d7932ad-b9d9-40f8-9d1e-4ac132d4e3ad/cancel` → **200**

```json
{
  "command_id": "4cd1fca3-352d-4f2c-a692-7df48605ea31",
  "expected_version": 4,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "3d7932ad-b9d9-40f8-9d1e-4ac132d4e3ad",
  "short_number": 34,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "29fb1bb9-d874-4664-92d2-13d98936949e",
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
  "created_at": "2026-10-30T17:56:48.404941Z",
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
  "session_id": "a8f4d175-b68b-45b8-a851-65a3ca6c28d2",
  "subject": {
    "type": "STAFF",
    "id": "c1a6f303-45cb-4836-9719-3861c6b8ed9b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMWE2ZjMwMy00NWNiLTQ4MzYtOTcxOS0zODYxYzZiOGVkOWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODM5MTEsImlhdCI6MTc5MzM4MzAxMSwianRpIjoiZTY2Y2Y4ZjYtZjY4Zi00OTA5LTk0ZWItM2VkMDk5ZTEzZmQwIiwic2lkIjoiYThmNGQxNzUtYjY4Yi00NWI4LWE4NTEtNjVhM2NhNmMyOGQyIn0.AtCi03JDKj6KWTav_5Yj5IwpHgSvD2v7XJqsM3-BNGM",
  "access_expires_at": "2026-10-30T18:11:51.255607951Z",
  "refresh_token": "lyM2X4msvC2BzfvvKAejYjCM4j3Rx1BpnybVf99G04A",
  "refresh_expires_at": "2026-10-31T05:56:51.255271942Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-7815"
}
```

```json
{
  "challenge_id": "85aca9a9-6c58-4c2b-97c6-135325a5b384",
  "expires_at": "2026-10-30T18:01:51.47738632Z",
  "resend_available_at": "2026-10-30T17:56:52.47738632Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "645531",
  "sent_at": "2026-10-30T17:56:51.479312401Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "85aca9a9-6c58-4c2b-97c6-135325a5b384",
  "code": "645531",
  "device_ref": "sandbox-7815"
}
```

```json
{
  "session_id": "1d6108d4-f2cd-4bcc-b7ae-57d91ae7e462",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4MzkxMSwiaWF0IjoxNzkzMzgzMDExLCJqdGkiOiJhNzBmMWZlOS1kMDgxLTQyZjUtOWVhMi01NjkzYmE2OGNmMzMiLCJzaWQiOiIxZDYxMDhkNC1mMmNkLTRiY2MtYjdhZS01N2Q5MWFlN2U0NjIifQ.urpizvxyTCCXLMCBnDEZWn0T8_TIEvI_dlSaVhP_as4",
  "access_expires_at": "2026-10-30T18:11:51.685859432Z",
  "refresh_token": "_vsXfJmEnliZ4Ik7znpzS3c3x0W7G5huT6yQMP6fCXM",
  "refresh_expires_at": "2026-11-29T17:56:51.685496372Z",
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
      "actor_id": "c1a6f303-45cb-4836-9719-3861c6b8ed9b",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T17:56:39.171414Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "c1a6f303-45cb-4836-9719-3861c6b8ed9b",
      "reason": "Sandbox clean-up",
      "at": "2026-10-30T17:56:40.175483Z"
    }
  ],
  "duplicates": []
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "66c46bf3-4056-41f5-8389-e59a67683f23",
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
  "device_ref": "sandbox-18775"
}
```

```json
{
  "challenge_id": "627398b2-70e3-48b5-a9ab-89883e7a1bb4",
  "expires_at": "2026-10-30T18:01:52.49151462Z",
  "resend_available_at": "2026-10-30T17:56:53.49151462Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "575426",
  "sent_at": "2026-10-30T17:56:52.493460865Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "627398b2-70e3-48b5-a9ab-89883e7a1bb4",
  "code": "575426",
  "device_ref": "sandbox-18775"
}
```

```json
{
  "session_id": "3fd69a11-91ce-44ba-9998-743b24083198",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4MzkxMiwiaWF0IjoxNzkzMzgzMDEyLCJqdGkiOiJhYzcyNGVhYy1jZGM2LTQ0MjAtYjY5Yi02ZmU1NGE0MDkzMzUiLCJzaWQiOiIzZmQ2OWExMS05MWNlLTQ0YmEtOTk5OC03NDNiMjQwODMxOTgifQ.AuAuIOLKwOHn2BwjU15ANzxhtAP3JVlNWJN01Ls2huo",
  "access_expires_at": "2026-10-30T18:11:52.708317238Z",
  "refresh_token": "dcLrXdVTlsql8Wm2RRkqbcrPgTGPcfCMPAkndnZOnY4",
  "refresh_expires_at": "2026-11-29T17:56:52.707957744Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "192d683e-9837-4c36-a543-3deb06fb2e8d",
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
  "last_heartbeat_at": "2026-10-30T17:56:22.364415Z",
  "last_location_at": "2026-10-30T17:56:22.364415Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/192d683e-9837-4c36-a543-3deb06fb2e8d/handover` → **200**

```json
{
  "command_id": "f5d6fc7b-782d-4d82-bf67-137a2ab3959b",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "192d683e-9837-4c36-a543-3deb06fb2e8d",
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
  "last_heartbeat_at": "2026-10-30T17:56:22.364415Z",
  "last_location_at": "2026-10-30T17:56:22.364415Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

(the car drives 18 s to the next point)

`POST /api/driver/v1/work-sessions/192d683e-9837-4c36-a543-3deb06fb2e8d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T17:57:11Z",
    "sequence": 1793383031338
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "192d683e-9837-4c36-a543-3deb06fb2e8d",
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
  "last_heartbeat_at": "2026-10-30T17:57:11.353192Z",
  "last_location_at": "2026-10-30T17:57:11.353192Z",
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
  "command_id": "2c55e8cc-d6e0-4b35-bd37-ce49969ddd3d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T17:57:11Z",
    "sequence": 1793383031745
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "268f2aa0-0332-428d-a958-103ef1d0b605",
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
  "last_heartbeat_at": "2026-10-30T17:57:11.759787Z",
  "last_location_at": "2026-10-30T17:57:11.759787Z",
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
  "session_id": "1cb0f274-ad3a-4750-81c4-e098818945a0",
  "subject": {
    "type": "STAFF",
    "id": "c1a6f303-45cb-4836-9719-3861c6b8ed9b"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMWE2ZjMwMy00NWNiLTQ4MzYtOTcxOS0zODYxYzZiOGVkOWIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODM5MzIsImlhdCI6MTc5MzM4MzAzMiwianRpIjoiNDgxYTg3Y2YtY2Y4NC00Y2FmLWEwOWQtNDNlNmVjMjQyYzg5Iiwic2lkIjoiMWNiMGYyNzQtYWQzYS00NzUwLTgxYzQtZTA5ODgxODk0NWEwIn0.3rLkZiO0W4_45Cmrmxg6GEEugP7X77_nM3eeLWdwRPE",
  "access_expires_at": "2026-10-30T18:12:12.16210345Z",
  "refresh_token": "omyASiZEADXVQuDB6WJofsXaSwj5WrP363li-s84tZ8",
  "refresh_expires_at": "2026-10-31T05:57:12.161737626Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "c6728c00-0ccf-4c9d-9d21-610977093f04",
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
  "id": "9a6ee79b-8f99-4c7a-94d1-e657b7d277a2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T18:02:12.361418Z",
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
  "command_id": "81af7888-90a9-4554-b17f-1f55d80fff9e",
  "quote_id": "9a6ee79b-8f99-4c7a-94d1-e657b7d277a2",
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
  "id": "d985ec2a-7f49-43a8-9e4b-a5366dbfab7c",
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
  "created_at": "2026-10-30T17:57:12.565514Z",
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
    "id": "3fbf44bd-0889-45c3-9550-5abf6f7d9f63",
    "order_id": "d985ec2a-7f49-43a8-9e4b-a5366dbfab7c",
    "expires_at": "2026-10-30T17:57:27.568485Z",
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

`POST /api/driver/v1/offers/3fbf44bd-0889-45c3-9550-5abf6f7d9f63/accept` → **200**

```json
{
  "command_id": "89d2b1e2-0519-4c67-8385-37e7522756b0"
}
```

```json
{
  "id": "f883ee1f-7188-4e24-9c11-5f47cceae5fc",
  "order_id": "d985ec2a-7f49-43a8-9e4b-a5366dbfab7c",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "38202296-3feb-4bef-a424-58530024b32a",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "38202296-3feb-4bef-a424-58530024b32a",
  "order_id": "d985ec2a-7f49-43a8-9e4b-a5366dbfab7c",
  "assignment_id": "f883ee1f-7188-4e24-9c11-5f47cceae5fc",
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

`POST /api/driver/v1/work-sessions/268f2aa0-0332-428d-a958-103ef1d0b605/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T17:57:23Z",
    "sequence": 1793383043554
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "268f2aa0-0332-428d-a958-103ef1d0b605",
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
  "last_heartbeat_at": "2026-10-30T17:57:23.569701Z",
  "last_location_at": "2026-10-30T17:57:23.569701Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/38202296-3feb-4bef-a424-58530024b32a/arrive` → **200**

```json
{
  "command_id": "0f17a6b0-afab-4257-aa08-ff3619057514",
  "expected_version": 0
}
```

```json
{
  "id": "38202296-3feb-4bef-a424-58530024b32a",
  "order_id": "d985ec2a-7f49-43a8-9e4b-a5366dbfab7c",
  "assignment_id": "f883ee1f-7188-4e24-9c11-5f47cceae5fc",
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
  "arrived_at": "2026-10-30T17:57:23.763712Z",
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

`POST /api/driver/v1/trips/38202296-3feb-4bef-a424-58530024b32a/start` → **200**

```json
{
  "command_id": "6c42d5f0-b78f-4290-b13f-1afd4a3f0692",
  "expected_version": 1
}
```

```json
{
  "id": "38202296-3feb-4bef-a424-58530024b32a",
  "order_id": "d985ec2a-7f49-43a8-9e4b-a5366dbfab7c",
  "assignment_id": "f883ee1f-7188-4e24-9c11-5f47cceae5fc",
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
  "arrived_at": "2026-10-30T17:57:23.763712Z",
  "started_at": "2026-10-30T17:57:23.962595Z",
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

`POST /api/driver/v1/trips/38202296-3feb-4bef-a424-58530024b32a/complete` → **200**

```json
{
  "command_id": "eb5aa7ca-cf2c-4805-b518-b54dda1535d7",
  "expected_version": 2,
  "reported_at": "2026-10-30T17:57:24Z",
  "cash_received": true
}
```

```json
{
  "id": "38202296-3feb-4bef-a424-58530024b32a",
  "order_id": "d985ec2a-7f49-43a8-9e4b-a5366dbfab7c",
  "assignment_id": "f883ee1f-7188-4e24-9c11-5f47cceae5fc",
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
  "arrived_at": "2026-10-30T17:57:23.763712Z",
  "started_at": "2026-10-30T17:57:23.962595Z",
  "completed_at": "2026-10-30T17:57:24.16193Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/d985ec2a-7f49-43a8-9e4b-a5366dbfab7c` → **200**

```json
{
  "id": "d985ec2a-7f49-43a8-9e4b-a5366dbfab7c",
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
    "id": "f883ee1f-7188-4e24-9c11-5f47cceae5fc",
    "order_id": "d985ec2a-7f49-43a8-9e4b-a5366dbfab7c",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "38202296-3feb-4bef-a424-58530024b32a",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T17:57:12.565514Z",
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
  "session_id": "192d683e-9837-4c36-a543-3deb06fb2e8d",
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
  "last_heartbeat_at": "2026-10-30T17:57:11.353192Z",
  "last_location_at": "2026-10-30T17:57:11.353192Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/192d683e-9837-4c36-a543-3deb06fb2e8d/close` → **200**

```json
{
  "command_id": "61eb81d7-fa08-4131-a7b2-392dbdf33453",
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
  "session_id": "268f2aa0-0332-428d-a958-103ef1d0b605",
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
  "last_heartbeat_at": "2026-10-30T17:57:23.569701Z",
  "last_location_at": "2026-10-30T17:57:23.569701Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/268f2aa0-0332-428d-a958-103ef1d0b605/close` → **200**

```json
{
  "command_id": "397b0907-7ad0-44df-b163-af53bd0c399f",
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

Done: terminal order d985ec2a-7f49-43a8-9e4b-a5366dbfab7c by Andrii (5a000000-0000-4000-8000-000000000403).

# Scenario: zz-metrics

## A search without drivers ends as UNFULFILLED

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-28058"
}
```

```json
{
  "challenge_id": "0445d2b2-9451-45e2-9025-e663cfa07f02",
  "expires_at": "2026-10-30T18:02:28.503432375Z",
  "resend_available_at": "2026-10-30T17:57:29.503432375Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "502276",
  "sent_at": "2026-10-30T17:57:28.506128009Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0445d2b2-9451-45e2-9025-e663cfa07f02",
  "code": "502276",
  "device_ref": "sandbox-28058"
}
```

```json
{
  "session_id": "b57d5abe-c382-4112-9922-d2be22e4ba39",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4Mzk0OCwiaWF0IjoxNzkzMzgzMDQ4LCJqdGkiOiJiNGI5MjczOS1jMGY4LTQ1NjMtOTMzOC0zNzhjNDlkM2Y5NWMiLCJzaWQiOiJiNTdkNWFiZS1jMzgyLTQxMTItOTkyMi1kMmJlMjJlNGJhMzkifQ.c0su-T3csZXaRpFATkmtt2HInKwYMhA1-UP5lyB-aeM",
  "access_expires_at": "2026-10-30T18:12:28.713319621Z",
  "refresh_token": "MUMfCoN5m4rtg6WWstHt6yRAHYtXO7Nza2ImgVmypQo",
  "refresh_expires_at": "2026-11-29T17:57:28.712687544Z",
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
  "device_ref": "sandbox-1267"
}
```

```json
{
  "challenge_id": "1784d5fe-ae22-4e09-add8-e0cb6ce488de",
  "expires_at": "2026-10-30T18:02:29.079928076Z",
  "resend_available_at": "2026-10-30T17:57:30.079928076Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "001835",
  "sent_at": "2026-10-30T17:57:29.081830275Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1784d5fe-ae22-4e09-add8-e0cb6ce488de",
  "code": "001835",
  "device_ref": "sandbox-1267"
}
```

```json
{
  "session_id": "cfa0dddf-ed93-421e-b300-1e622a038a24",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4Mzk0OSwiaWF0IjoxNzkzMzgzMDQ5LCJqdGkiOiJkMTFhMTE0OS1jNDcwLTRmNTAtOWY0NC1mYzY2MzBiYTAyYTEiLCJzaWQiOiJjZmEwZGRkZi1lZDkzLTQyMWUtYjMwMC0xZTYyMmEwMzhhMjQifQ.Yb-unqCGvbFOz7ZDFObRbS0rdTfihXNu3UZA2mmWVY0",
  "access_expires_at": "2026-10-30T18:12:29.286001986Z",
  "refresh_token": "sF11TKXMGz52RL4RZVPMwSBmo0z6e3GDR6MyHH5Ws7o",
  "refresh_expires_at": "2026-11-29T17:57:29.285604024Z",
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
  "device_ref": "sandbox-11551"
}
```

```json
{
  "challenge_id": "d4d96da5-04ae-4b08-aa58-cc995684dc8d",
  "expires_at": "2026-10-30T18:02:29.656480485Z",
  "resend_available_at": "2026-10-30T17:57:30.656480485Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "165510",
  "sent_at": "2026-10-30T17:57:29.658378338Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d4d96da5-04ae-4b08-aa58-cc995684dc8d",
  "code": "165510",
  "device_ref": "sandbox-11551"
}
```

```json
{
  "session_id": "dec264e4-a47e-4617-8e38-eba0318701c1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM4Mzk0OSwiaWF0IjoxNzkzMzgzMDQ5LCJqdGkiOiJlY2I3NDU3Mi1kNDZkLTQzMDItOGZkMC0yOTk2MzI2Yzk2OGQiLCJzaWQiOiJkZWMyNjRlNC1hNDdlLTQ2MTctOGUzOC1lYmEwMzE4NzAxYzEifQ.Mt4OFY0_a3bv5duZdxcjmzooec8B6Ssgtv9rZOxdgrs",
  "access_expires_at": "2026-10-30T18:12:29.865009896Z",
  "refresh_token": "jw7FT1NkCb44XUSu39vhsEAu0XNKnCjGHvFtOBbgcfw",
  "refresh_expires_at": "2026-11-29T17:57:29.864627147Z",
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
  "phone": "+380695783123",
  "device_ref": "sandbox-2852"
}
```

```json
{
  "challenge_id": "bda6c3e4-8411-48c3-b253-18ffcc51f6f1",
  "expires_at": "2026-10-30T18:02:30.224497875Z",
  "resend_available_at": "2026-10-30T17:57:31.224497875Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380695783123` → **200**

```json
{
  "phone": "+380695783123",
  "audience": "CLIENT",
  "code": "618439",
  "sent_at": "2026-10-30T17:57:30.226299452Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bda6c3e4-8411-48c3-b253-18ffcc51f6f1",
  "code": "618439",
  "device_ref": "sandbox-2852"
}
```

```json
{
  "session_id": "19c8c074-fde3-4b99-97a9-33dc93342b51",
  "subject": {
    "type": "CLIENT",
    "id": "2a5f512c-80b5-48c4-a882-49b526c27c7f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYTVmNTEyYy04MGI1LTQ4YzQtYTg4Mi00OWI1MjZjMjdjN2YiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzgzOTUwLCJpYXQiOjE3OTMzODMwNTAsImp0aSI6ImI0NDgzZGUwLWE1YjgtNDkzYi1iOTg0LTNkZDRjZWI3OGM4ZiIsInNpZCI6IjE5YzhjMDc0LWZkZTMtNGI5OS05N2E5LTMzZGM5MzM0MmI1MSJ9.H0wk3kTZdx2ojs_HlC8mjDkHjZwTAx0YEGx5gAmB1dk",
  "access_expires_at": "2026-10-30T18:12:30.421496198Z",
  "refresh_token": "B-mclo2zXzEXGFHKrE2ZjuXGzuNgkHKmA4J7l4ajaqw",
  "refresh_expires_at": "2026-11-29T17:57:30.421069203Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "fe97daaf-bbe1-4518-82ed-233371f52040",
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
  "id": "8a3b0296-8d27-4427-815b-052003fb1097",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T18:02:30.651388Z",
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
  "command_id": "29b4b6de-fe65-4118-af2c-c86ae257a439",
  "quote_id": "8a3b0296-8d27-4427-815b-052003fb1097",
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
  "id": "7baff352-a9b7-48b0-8311-e780d751faac",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2a5f512c-80b5-48c4-a882-49b526c27c7f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T17:57:30.841726Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/7baff352-a9b7-48b0-8311-e780d751faac` → **200**

```json
{
  "id": "7baff352-a9b7-48b0-8311-e780d751faac",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2a5f512c-80b5-48c4-a882-49b526c27c7f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T17:57:30.841726Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/7baff352-a9b7-48b0-8311-e780d751faac` → **200**

```json
{
  "id": "7baff352-a9b7-48b0-8311-e780d751faac",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2a5f512c-80b5-48c4-a882-49b526c27c7f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T17:57:30.841726Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/7baff352-a9b7-48b0-8311-e780d751faac` → **200**

```json
{
  "id": "7baff352-a9b7-48b0-8311-e780d751faac",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2a5f512c-80b5-48c4-a882-49b526c27c7f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T17:57:30.841726Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/7baff352-a9b7-48b0-8311-e780d751faac` → **200**

```json
{
  "id": "7baff352-a9b7-48b0-8311-e780d751faac",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2a5f512c-80b5-48c4-a882-49b526c27c7f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T17:57:30.841726Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/7baff352-a9b7-48b0-8311-e780d751faac` → **200**

```json
{
  "id": "7baff352-a9b7-48b0-8311-e780d751faac",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2a5f512c-80b5-48c4-a882-49b526c27c7f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T17:57:30.841726Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/7baff352-a9b7-48b0-8311-e780d751faac` → **200**

```json
{
  "id": "7baff352-a9b7-48b0-8311-e780d751faac",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2a5f512c-80b5-48c4-a882-49b526c27c7f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T17:57:30.841726Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/7baff352-a9b7-48b0-8311-e780d751faac` → **200**

```json
{
  "id": "7baff352-a9b7-48b0-8311-e780d751faac",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2a5f512c-80b5-48c4-a882-49b526c27c7f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T17:57:30.841726Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/7baff352-a9b7-48b0-8311-e780d751faac` → **200**

```json
{
  "id": "7baff352-a9b7-48b0-8311-e780d751faac",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2a5f512c-80b5-48c4-a882-49b526c27c7f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T17:57:30.841726Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/7baff352-a9b7-48b0-8311-e780d751faac` → **200**

```json
{
  "id": "7baff352-a9b7-48b0-8311-e780d751faac",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2a5f512c-80b5-48c4-a882-49b526c27c7f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T17:57:30.841726Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/7baff352-a9b7-48b0-8311-e780d751faac` → **200**

```json
{
  "id": "7baff352-a9b7-48b0-8311-e780d751faac",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2a5f512c-80b5-48c4-a882-49b526c27c7f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T17:57:30.841726Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/7baff352-a9b7-48b0-8311-e780d751faac` → **200**

```json
{
  "id": "7baff352-a9b7-48b0-8311-e780d751faac",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2a5f512c-80b5-48c4-a882-49b526c27c7f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T17:57:30.841726Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/7baff352-a9b7-48b0-8311-e780d751faac` → **200**

```json
{
  "id": "7baff352-a9b7-48b0-8311-e780d751faac",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2a5f512c-80b5-48c4-a882-49b526c27c7f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T17:57:30.841726Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/7baff352-a9b7-48b0-8311-e780d751faac` → **200**

```json
{
  "id": "7baff352-a9b7-48b0-8311-e780d751faac",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2a5f512c-80b5-48c4-a882-49b526c27c7f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T17:57:30.841726Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/7baff352-a9b7-48b0-8311-e780d751faac` → **200**

```json
{
  "id": "7baff352-a9b7-48b0-8311-e780d751faac",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2a5f512c-80b5-48c4-a882-49b526c27c7f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T17:57:30.841726Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/7baff352-a9b7-48b0-8311-e780d751faac` → **200**

```json
{
  "id": "7baff352-a9b7-48b0-8311-e780d751faac",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2a5f512c-80b5-48c4-a882-49b526c27c7f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T17:57:30.841726Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/7baff352-a9b7-48b0-8311-e780d751faac` → **200**

```json
{
  "id": "7baff352-a9b7-48b0-8311-e780d751faac",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2a5f512c-80b5-48c4-a882-49b526c27c7f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T17:57:30.841726Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/7baff352-a9b7-48b0-8311-e780d751faac` → **200**

```json
{
  "id": "7baff352-a9b7-48b0-8311-e780d751faac",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2a5f512c-80b5-48c4-a882-49b526c27c7f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T17:57:30.841726Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/7baff352-a9b7-48b0-8311-e780d751faac` → **200**

```json
{
  "id": "7baff352-a9b7-48b0-8311-e780d751faac",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2a5f512c-80b5-48c4-a882-49b526c27c7f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T17:57:30.841726Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/7baff352-a9b7-48b0-8311-e780d751faac` → **200**

```json
{
  "id": "7baff352-a9b7-48b0-8311-e780d751faac",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2a5f512c-80b5-48c4-a882-49b526c27c7f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T17:57:30.841726Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/7baff352-a9b7-48b0-8311-e780d751faac` → **200**

```json
{
  "id": "7baff352-a9b7-48b0-8311-e780d751faac",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2a5f512c-80b5-48c4-a882-49b526c27c7f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T17:57:30.841726Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/7baff352-a9b7-48b0-8311-e780d751faac` → **200**

```json
{
  "id": "7baff352-a9b7-48b0-8311-e780d751faac",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2a5f512c-80b5-48c4-a882-49b526c27c7f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T17:57:30.841726Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/7baff352-a9b7-48b0-8311-e780d751faac` → **200**

```json
{
  "id": "7baff352-a9b7-48b0-8311-e780d751faac",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2a5f512c-80b5-48c4-a882-49b526c27c7f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T17:57:30.841726Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/7baff352-a9b7-48b0-8311-e780d751faac` → **200**

```json
{
  "id": "7baff352-a9b7-48b0-8311-e780d751faac",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2a5f512c-80b5-48c4-a882-49b526c27c7f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T17:57:30.841726Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/7baff352-a9b7-48b0-8311-e780d751faac` → **200**

```json
{
  "id": "7baff352-a9b7-48b0-8311-e780d751faac",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2a5f512c-80b5-48c4-a882-49b526c27c7f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T17:57:30.841726Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/7baff352-a9b7-48b0-8311-e780d751faac` → **200**

```json
{
  "id": "7baff352-a9b7-48b0-8311-e780d751faac",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2a5f512c-80b5-48c4-a882-49b526c27c7f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T17:57:30.841726Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/7baff352-a9b7-48b0-8311-e780d751faac` → **200**

```json
{
  "id": "7baff352-a9b7-48b0-8311-e780d751faac",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2a5f512c-80b5-48c4-a882-49b526c27c7f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T17:57:30.841726Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/7baff352-a9b7-48b0-8311-e780d751faac` → **200**

```json
{
  "id": "7baff352-a9b7-48b0-8311-e780d751faac",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2a5f512c-80b5-48c4-a882-49b526c27c7f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T17:57:30.841726Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/7baff352-a9b7-48b0-8311-e780d751faac` → **200**

```json
{
  "id": "7baff352-a9b7-48b0-8311-e780d751faac",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2a5f512c-80b5-48c4-a882-49b526c27c7f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T17:57:30.841726Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/7baff352-a9b7-48b0-8311-e780d751faac` → **200**

```json
{
  "id": "7baff352-a9b7-48b0-8311-e780d751faac",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2a5f512c-80b5-48c4-a882-49b526c27c7f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T17:57:30.841726Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/7baff352-a9b7-48b0-8311-e780d751faac` → **200**

```json
{
  "id": "7baff352-a9b7-48b0-8311-e780d751faac",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2a5f512c-80b5-48c4-a882-49b526c27c7f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T17:57:30.841726Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/7baff352-a9b7-48b0-8311-e780d751faac` → **200**

```json
{
  "id": "7baff352-a9b7-48b0-8311-e780d751faac",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2a5f512c-80b5-48c4-a882-49b526c27c7f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T17:57:30.841726Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/7baff352-a9b7-48b0-8311-e780d751faac` → **200**

```json
{
  "id": "7baff352-a9b7-48b0-8311-e780d751faac",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2a5f512c-80b5-48c4-a882-49b526c27c7f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T17:57:30.841726Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/7baff352-a9b7-48b0-8311-e780d751faac` → **200**

```json
{
  "id": "7baff352-a9b7-48b0-8311-e780d751faac",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2a5f512c-80b5-48c4-a882-49b526c27c7f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T17:57:30.841726Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/7baff352-a9b7-48b0-8311-e780d751faac` → **200**

```json
{
  "id": "7baff352-a9b7-48b0-8311-e780d751faac",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2a5f512c-80b5-48c4-a882-49b526c27c7f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T17:57:30.841726Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/7baff352-a9b7-48b0-8311-e780d751faac` → **200**

```json
{
  "id": "7baff352-a9b7-48b0-8311-e780d751faac",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2a5f512c-80b5-48c4-a882-49b526c27c7f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T17:57:30.841726Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/7baff352-a9b7-48b0-8311-e780d751faac` → **200**

```json
{
  "id": "7baff352-a9b7-48b0-8311-e780d751faac",
  "short_number": 36,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "2a5f512c-80b5-48c4-a882-49b526c27c7f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T17:57:30.841726Z",
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
  "blizz_dispatch_assigned_seconds_count": 22,
  "blizz_offers_total": 27,
  "blizz_dispatch_excluded_total": 17,
  "blizz_sms_sent_total": 86
}

```prometheus
blizz_dispatch_assigned_seconds_count{application="blizz-taxi-server",source="BROADCAST"} 1
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="BROADCAST"} 7.652657398
blizz_dispatch_assigned_seconds_count{application="blizz-taxi-server",source="OFFER"} 21
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="OFFER"} 12.487450944
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="BROADCAST"} 0.0
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="OFFER"} 0.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="ALREADY_OFFERED"} 2.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="BUSY"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="CITY_NOT_ADMITTED"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PAUSED"} 3.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PAYMENT"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PREVIOUS_DRIVER"} 2.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="STALE_LOCATION"} 6.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="TOO_FAR"} 1.0
blizz_dispatch_first_offer_seconds_count{application="blizz-taxi-server"} 24
blizz_dispatch_first_offer_seconds_sum{application="blizz-taxi-server"} 0.399536159
blizz_dispatch_first_offer_seconds_max{application="blizz-taxi-server"} 0.0
blizz_offers_total{application="blizz-taxi-server",outcome="ACCEPTED"} 21.0
blizz_offers_total{application="blizz-taxi-server",outcome="DECLINED"} 2.0
blizz_offers_total{application="blizz-taxi-server",outcome="REVOKED"} 4.0
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
blizz_sms_sent_total{application="blizz-taxi-server",purpose="OTP",state="FAILED"} 1.0
blizz_sms_sent_total{application="blizz-taxi-server",purpose="OTP",state="SENT"} 79.0
```

Done: real no-car deadline, non-zero counters/timers and bounded labels on the management port.

`GET /api/rider/v1/orders/7baff352-a9b7-48b0-8311-e780d751faac` → **200**

```json
{
  "id": "7baff352-a9b7-48b0-8311-e780d751faac",
  "short_number": 36,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "2a5f512c-80b5-48c4-a882-49b526c27c7f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T17:57:30.841726Z",
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
  "session_id": "9c35821b-c9a2-4f67-b2a3-68ab411bce8a",
  "subject": {
    "type": "STAFF",
    "id": "c1a6f303-45cb-4836-9719-3861c6b8ed9b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMWE2ZjMwMy00NWNiLTQ4MzYtOTcxOS0zODYxYzZiOGVkOWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODQxMzMsImlhdCI6MTc5MzM4MzIzMywianRpIjoiZDM0M2Q3ZmQtOThiNi00NDFhLTlhODEtMGQ5MTY3NzRiNThmIiwic2lkIjoiOWMzNTgyMWItYzlhMi00ZjY3LWIyYTMtNjhhYjQxMWJjZThhIn0.IWZrysOH6xV60W5UQ3Vou-UuwW1_OM24QrswK4XbTyg",
  "access_expires_at": "2026-10-30T18:15:33.832268422Z",
  "refresh_token": "KPSiwG8bg6YpnvbUtPLZOqZqeKJYI0kbbcuXlXv8Qh8",
  "refresh_expires_at": "2026-10-31T06:00:33.831826814Z",
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
  "id": "7de23125-3af7-4f4f-a0f5-6b4856f02181",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T18:00:34.041266Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T18:00:34.041306Z",
  "updated_at": "2026-10-30T18:00:34.0523Z",
  "finished_at": "2026-10-30T18:00:34.0523Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/7de23125-3af7-4f4f-a0f5-6b4856f02181` → **200**

```json
{
  "run": {
    "id": "7de23125-3af7-4f4f-a0f5-6b4856f02181",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T18:00:34.041266Z",
    "partial": true,
    "state": "CLEAN",
    "local_count": 10,
    "provider_count": 10,
    "item_count": 0,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T18:00:34.041306Z",
    "updated_at": "2026-10-30T18:00:34.0523Z",
    "finished_at": "2026-10-30T18:00:34.0523Z",
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
  "id": "7de23125-3af7-4f4f-a0f5-6b4856f02181",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T18:00:34.041266Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T18:00:34.041306Z",
  "updated_at": "2026-10-30T18:00:34.0523Z",
  "finished_at": "2026-10-30T18:00:34.0523Z",
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
  "id": "7de23125-3af7-4f4f-a0f5-6b4856f02181",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T18:00:34.041266Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T18:00:34.041306Z",
  "updated_at": "2026-10-30T18:00:34.0523Z",
  "finished_at": "2026-10-30T18:00:34.0523Z",
  "version": 1
}
```

## One independent bank transaction produces one missing-local item on another merchant's first snapshot

`POST /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/e5e4fbeb-ac75-4f9a-8f10-d5a4bdb275ce` → **204**

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
  "id": "b81486ce-1758-45e2-b5b7-7c91ae166172",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T18:00:34.368583Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T18:00:34.368626Z",
  "updated_at": "2026-10-30T18:00:34.374171Z",
  "finished_at": "2026-10-30T18:00:34.374171Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/b81486ce-1758-45e2-b5b7-7c91ae166172` → **200**

```json
{
  "run": {
    "id": "b81486ce-1758-45e2-b5b7-7c91ae166172",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T18:00:34.368583Z",
    "partial": true,
    "state": "OPEN",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 1,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T18:00:34.368626Z",
    "updated_at": "2026-10-30T18:00:34.374171Z",
    "finished_at": "2026-10-30T18:00:34.374171Z",
    "version": 1
  },
  "items": [
    {
      "id": "fb8f7563-8590-4166-a31b-77135bdef14e",
      "run_id": "b81486ce-1758-45e2-b5b7-7c91ae166172",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "2d33238c6e2d48d022e726d23784bffb3ff3ea5ce7d8e39a959e3d49004367d7",
      "reference_display": "sandbox-reconciliation-e5e4fbeb-ac75-4f9a-8f10-d5a4bdb275ce",
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
      "provider_at": "2026-10-30T18:00:34Z",
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
  "id": "b81486ce-1758-45e2-b5b7-7c91ae166172",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T18:00:34.368583Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T18:00:34.368626Z",
  "updated_at": "2026-10-30T18:00:34.374171Z",
  "finished_at": "2026-10-30T18:00:34.374171Z",
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
  "id": "b81486ce-1758-45e2-b5b7-7c91ae166172",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T18:00:34.368583Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T18:00:34.368626Z",
  "updated_at": "2026-10-30T18:00:34.374171Z",
  "finished_at": "2026-10-30T18:00:34.374171Z",
  "version": 1
}
```

## The admin explains the item once; a replay is the same result and a different decision conflicts

`POST /api/admin/v1/payment-reconciliations/items/fb8f7563-8590-4166-a31b-77135bdef14e/resolve` → **200**

```json
{
  "command_id": "2d27e7ad-2cf4-450f-a426-efebcc6013ba",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "fb8f7563-8590-4166-a31b-77135bdef14e",
  "run_id": "b81486ce-1758-45e2-b5b7-7c91ae166172",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "2d33238c6e2d48d022e726d23784bffb3ff3ea5ce7d8e39a959e3d49004367d7",
  "reference_display": "sandbox-reconciliation-e5e4fbeb-ac75-4f9a-8f10-d5a4bdb275ce",
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
  "provider_at": "2026-10-30T18:00:34Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "c1a6f303-45cb-4836-9719-3861c6b8ed9b",
  "resolved_at": "2026-10-30T18:00:34.680826Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/fb8f7563-8590-4166-a31b-77135bdef14e/resolve` → **200**

```json
{
  "command_id": "2d27e7ad-2cf4-450f-a426-efebcc6013ba",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "fb8f7563-8590-4166-a31b-77135bdef14e",
  "run_id": "b81486ce-1758-45e2-b5b7-7c91ae166172",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "2d33238c6e2d48d022e726d23784bffb3ff3ea5ce7d8e39a959e3d49004367d7",
  "reference_display": "sandbox-reconciliation-e5e4fbeb-ac75-4f9a-8f10-d5a4bdb275ce",
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
  "provider_at": "2026-10-30T18:00:34Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "c1a6f303-45cb-4836-9719-3861c6b8ed9b",
  "resolved_at": "2026-10-30T18:00:34.680826Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/fb8f7563-8590-4166-a31b-77135bdef14e/resolve` → **409**

```json
{
  "command_id": "bc500ca8-8e24-46be-8ef9-f60a9cc3e9e0",
  "expected_version": 1,
  "decision": "ESCALATED",
  "reason": "A conflicting second decision"
}
```

```json
{
  "instance": "/api/admin/v1/payment-reconciliations/items/fb8f7563-8590-4166-a31b-77135bdef14e/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "14291d07-6e12-488c-9b41-7afe42e2ffde"
}
```

`GET /api/admin/v1/payment-reconciliations/b81486ce-1758-45e2-b5b7-7c91ae166172` → **200**

```json
{
  "run": {
    "id": "b81486ce-1758-45e2-b5b7-7c91ae166172",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T18:00:34.368583Z",
    "partial": true,
    "state": "RESOLVED",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T18:00:34.368626Z",
    "updated_at": "2026-10-30T18:00:34.680826Z",
    "finished_at": "2026-10-30T18:00:34.374171Z",
    "version": 2
  },
  "items": [
    {
      "id": "fb8f7563-8590-4166-a31b-77135bdef14e",
      "run_id": "b81486ce-1758-45e2-b5b7-7c91ae166172",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "2d33238c6e2d48d022e726d23784bffb3ff3ea5ce7d8e39a959e3d49004367d7",
      "reference_display": "sandbox-reconciliation-e5e4fbeb-ac75-4f9a-8f10-d5a4bdb275ce",
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
      "provider_at": "2026-10-30T18:00:34Z",
      "state": "RESOLVED",
      "decision": "EXPLAINED",
      "reason": "Independent sandbox bank fixture; no real money moved",
      "resolved_by": "c1a6f303-45cb-4836-9719-3861c6b8ed9b",
      "resolved_at": "2026-10-30T18:00:34.680826Z",
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
      "id": "b81486ce-1758-45e2-b5b7-7c91ae166172",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-30",
      "period_from": "2026-10-29T22:00:00Z",
      "period_to": "2026-10-31T02:00:00Z",
      "observed_until": "2026-10-30T18:00:34.368583Z",
      "partial": true,
      "state": "RESOLVED",
      "local_count": 0,
      "provider_count": 1,
      "item_count": 1,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-30T18:00:34.368626Z",
      "updated_at": "2026-10-30T18:00:34.680826Z",
      "finished_at": "2026-10-30T18:00:34.374171Z",
      "version": 2
    },
    {
      "id": "e8857a32-d027-4caa-b1b0-f9e6f6b7bb95",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-29",
      "period_from": "2026-10-28T22:00:00Z",
      "period_to": "2026-10-30T02:00:00Z",
      "observed_until": "2026-10-30T17:41:41.016945Z",
      "partial": false,
      "state": "CLEAN",
      "local_count": 0,
      "provider_count": 0,
      "item_count": 0,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-30T17:41:41.017025Z",
      "updated_at": "2026-10-30T17:41:41.020328Z",
      "finished_at": "2026-10-30T17:41:41.020328Z",
      "version": 1
    }
  ],
  "next_cursor": null
}
```

`DELETE /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/e5e4fbeb-ac75-4f9a-8f10-d5a4bdb275ce` → **204**

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30"
}
```

```json
{
  "id": "b81486ce-1758-45e2-b5b7-7c91ae166172",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T18:00:34.368583Z",
  "partial": true,
  "state": "RESOLVED",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T18:00:34.368626Z",
  "updated_at": "2026-10-30T18:00:34.680826Z",
  "finished_at": "2026-10-30T18:00:34.374171Z",
  "version": 2
}
```

Done: clean card snapshot, one bank-only difference, three identical runs, audited decision/replay/conflict, bank fixture restored.

# Scenario: zzz-invariants

## Five invariant checks are clean after all scenario transactions settle

```prometheus
blizz_invariant_last_success{application="blizz-taxi-server",check="I1"} 1.79338335626E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I2"} 1.793383356539E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I3"} 1.793383356539E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I4"} 1.79338335626E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I5"} 1.793383356539E9
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
  "phone": "+380683065245",
  "device_ref": "sandbox-10580"
}
```

```json
{
  "challenge_id": "215f6383-6bc8-4cf4-86ad-8aec7d396aed",
  "expires_at": "2026-10-30T18:07:37.224842139Z",
  "resend_available_at": "2026-10-30T18:02:38.224842139Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380683065245` → **200**

```json
{
  "phone": "+380683065245",
  "audience": "CLIENT",
  "code": "136082",
  "sent_at": "2026-10-30T18:02:37.227080576Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "215f6383-6bc8-4cf4-86ad-8aec7d396aed",
  "code": "136082",
  "device_ref": "sandbox-10580"
}
```

```json
{
  "session_id": "e8dccc39-f00c-4f44-bea1-8f76c40af102",
  "subject": {
    "type": "CLIENT",
    "id": "2adfd488-aae5-4312-8721-4091f3275481"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYWRmZDQ4OC1hYWU1LTQzMTItODcyMS00MDkxZjMyNzU0ODEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzg0MjU3LCJpYXQiOjE3OTMzODMzNTcsImp0aSI6IjI1OTg5ZWQyLWJjZmItNGUyNS05YzIyLTJhMTlhMjQzNTcwNSIsInNpZCI6ImU4ZGNjYzM5LWYwMGMtNGY0NC1iZWExLThmNzZjNDBhZjEwMiJ9.LZu2HGip3UWA_h0HFBaifpxIFlqEVJd4qh_durbi_5o",
  "access_expires_at": "2026-10-30T18:17:37.430210675Z",
  "refresh_token": "vxKS65mlkDS2UjsTYSnWXwvPluQHCvTr1A-1moFCn6k",
  "refresh_expires_at": "2026-11-29T18:02:37.429768355Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "2adfd488-aae5-4312-8721-4091f3275481",
  "session_id": "e8dccc39-f00c-4f44-bea1-8f76c40af102",
  "account_state": "ACTIVE"
}
```

## Back up the database (deploy/backup.sh)
Backed up blizz to blizz.dump (552K)

## After the backup the rider deletes the account and staff complete it

`POST /api/rider/v1/me/deletion-request/challenge` → **201**

```json
{
  "challenge_id": "eda6edfb-49b2-4cd9-a115-6eda8136a875",
  "expires_at": "2026-10-30T18:07:40.224746473Z",
  "resend_available_at": "2026-10-30T18:02:41.224746473Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380683065245` → **200**

```json
{
  "phone": "+380683065245",
  "audience": "CLIENT",
  "code": "646332",
  "sent_at": "2026-10-30T18:02:40.22619784Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "634c9627-ad1c-476c-a4e8-776ac5d3e4d8",
  "challenge_id": "eda6edfb-49b2-4cd9-a115-6eda8136a875",
  "otp_code": "646332"
}
```

```json
{
  "client_id": "2adfd488-aae5-4312-8721-4091f3275481",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-30T18:02:40.428558204Z"
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
  "session_id": "44866e19-5e8a-44a4-b558-f567fcf1ca17",
  "subject": {
    "type": "STAFF",
    "id": "c1a6f303-45cb-4836-9719-3861c6b8ed9b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMWE2ZjMwMy00NWNiLTQ4MzYtOTcxOS0zODYxYzZiOGVkOWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzODQyNjAsImlhdCI6MTc5MzM4MzM2MCwianRpIjoiYWNlMmI3YjktNDExNy00Y2RlLTlmMmEtYTk1ZjBjMzMzM2VmIiwic2lkIjoiNDQ4NjZlMTktNWU4YS00NGE0LWI1NTgtZjU2N2ZjZjFjYTE3In0.ZqiPwlJij1kDRg9hlaS1TzT0jnjsegl6AV6I6c1jXvY",
  "access_expires_at": "2026-10-30T18:17:40.798112706Z",
  "refresh_token": "EbFWNOkcrJPvjmcBG72EPMG8KVTAxNLa9-KYU2l07lo",
  "refresh_expires_at": "2026-10-31T06:02:40.79776539Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/client-deletions/2adfd488-aae5-4312-8721-4091f3275481/complete` → **200**

```json
{
  "command_id": "08aa6c53-7121-43ca-9d1e-7bde6121eeb9",
  "reason": "Sandbox: backup and restore check"
}
```

```json
{
  "client_id": "2adfd488-aae5-4312-8721-4091f3275481",
  "account_state": "ANONYMIZED"
}
```

## Restore into an empty database (deploy/restore.sh); over data it refuses
Restored blizz.dump into blizz_restored: 102 migrations applied. Start the server on it with the same ERASURE_JOURNAL_DIR.
Database blizz_restored is not empty (113 tables): restore only into an empty database

In the restored database before the server starts: `ACTIVE +380683065245` (the backup predates the deletion).

## Start the server on the restored database with the same journal: the deletion is applied again

After the start: `ANONYMIZED -`.

Done: backup, restore into an empty database, start on it; the deleted rider stayed deleted (T-39).
