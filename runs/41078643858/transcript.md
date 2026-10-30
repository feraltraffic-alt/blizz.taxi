# Sandbox transcript (2026-10-30T15:14:02Z, 88ee843)

# Scenario: admission-cities

## Only Andrii is online in Kyiv for this scenario

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-1842"
}
```

```json
{
  "challenge_id": "aa3ce856-e752-43b3-b46a-9b5c0084d3e0",
  "expires_at": "2026-10-30T15:19:02.893676729Z",
  "resend_available_at": "2026-10-30T15:14:03.893676729Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "732721",
  "sent_at": "2026-10-30T15:14:02.907574953Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "aa3ce856-e752-43b3-b46a-9b5c0084d3e0",
  "code": "732721",
  "device_ref": "sandbox-1842"
}
```

```json
{
  "session_id": "d9d9c77d-bced-426f-9779-771a7da0f938",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NDE1MCwiaWF0IjoxNzkzMzczMjUwLCJqdGkiOiJlNWFlNWQyMS1mMWRhLTRmZGMtYjdkMi03MThlZWM3NGU2YTciLCJzaWQiOiJkOWQ5Yzc3ZC1iY2VkLTQyNmYtOTc3OS03NzFhN2RhMGY5MzgifQ.cxIMKiEraSP9pv61ysPqPlMp_bH_fcDWKLcRoThQkyQ",
  "access_expires_at": "2026-10-30T15:29:10.139549214Z",
  "refresh_token": "NY2oG_kfP94W7cBKviAJ1yUrqltMiK22SpugAI4cxGk",
  "refresh_expires_at": "2026-11-29T15:14:10.137037317Z",
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
  "device_ref": "sandbox-21635"
}
```

```json
{
  "challenge_id": "58234a71-4e05-412c-954e-36b7175ebee4",
  "expires_at": "2026-10-30T15:19:10.839607423Z",
  "resend_available_at": "2026-10-30T15:14:11.839607423Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "314873",
  "sent_at": "2026-10-30T15:14:10.845245379Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "58234a71-4e05-412c-954e-36b7175ebee4",
  "code": "314873",
  "device_ref": "sandbox-21635"
}
```

```json
{
  "session_id": "6888c4fc-7250-426a-993a-b8fe85331750",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NDE1MSwiaWF0IjoxNzkzMzczMjUxLCJqdGkiOiJhYTUyNTAyNS03NTg4LTRhMDktOWY3NC1hYTc0MmUxZDc4ZjkiLCJzaWQiOiI2ODg4YzRmYy03MjUwLTQyNmEtOTkzYS1iOGZlODUzMzE3NTAifQ.s3Kv8G4M0im-iDwAESiE4oRjPv-foBAyuTJrmSD8KVY",
  "access_expires_at": "2026-10-30T15:29:11.1675311Z",
  "refresh_token": "25EZANL2YVIgrcrdJGGx82p0qCbOizRgTvmOLs_4jpQ",
  "refresh_expires_at": "2026-11-29T15:14:11.166518208Z",
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
  "correlation_id": "69774007-0da8-4706-b6d7-dd2eda9134d4"
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
  "session_id": "df714c30-ed40-473f-adae-bf320a881ead",
  "subject": {
    "type": "STAFF",
    "id": "04f20d10-faa2-4386-bfcf-0d466abe8fa8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNGYyMGQxMC1mYWEyLTQzODYtYmZjZi0wZDQ2NmFiZThmYTgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzQxNTIsImlhdCI6MTc5MzM3MzI1MiwianRpIjoiOTY4YmE1MjktMDFmMS00Zjk1LWI2NjItNThhMTE2ODE2NDA3Iiwic2lkIjoiZGY3MTRjMzAtZWQ0MC00NzNmLWFkYWUtYmYzMjBhODgxZWFkIn0.EgUEJ5q6XjdgXVK_d3wr72dhfnyJBtixc96k2If9zIY",
  "access_expires_at": "2026-10-30T15:29:12.694939189Z",
  "refresh_token": "sRLj9cZX1-DZh66pzsFTY8UQwkgDWpCcV0mvNPLyvko",
  "refresh_expires_at": "2026-10-31T03:14:12.69372361Z",
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
  "session_id": "e43a327d-4bdc-46b0-a46d-7830c915b4ab",
  "subject": {
    "type": "STAFF",
    "id": "04f20d10-faa2-4386-bfcf-0d466abe8fa8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNGYyMGQxMC1mYWEyLTQzODYtYmZjZi0wZDQ2NmFiZThmYTgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzQxNTQsImlhdCI6MTc5MzM3MzI1NCwianRpIjoiNDk3MDFlY2EtYWZlZS00MTQxLTg1OWMtNDQ0NGNmYzk5Mzc0Iiwic2lkIjoiZTQzYTMyN2QtNGJkYy00NmIwLWE0NmQtNzgzMGM5MTViNGFiIn0.F8SAqn3oGTIfJY65OTNtZSWF1fLl19-bu-3G3HKpsgg",
  "access_expires_at": "2026-10-30T15:29:14.489807938Z",
  "refresh_token": "X_jbFSm0MnFxXnUr_pIP2Z5jR9TYXxDGs-q5qnu9vqw",
  "refresh_expires_at": "2026-10-31T03:14:14.488709215Z",
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
  "session_id": "51a918ba-e7f0-44fb-a220-179b5edc5a80",
  "subject": {
    "type": "STAFF",
    "id": "04f20d10-faa2-4386-bfcf-0d466abe8fa8"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNGYyMGQxMC1mYWEyLTQzODYtYmZjZi0wZDQ2NmFiZThmYTgiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzQxNTUsImlhdCI6MTc5MzM3MzI1NSwianRpIjoiNGIxOGIzMjctNzE5MC00NDEzLWI3ZWEtOTMzZDhkNTc2OWNkIiwic2lkIjoiNTFhOTE4YmEtZTdmMC00NGZiLWEyMjAtMTc5YjVlZGM1YTgwIn0.Ei-db3RGvA6eukGb-7fWl-jLoZJDKZrocWpbdEQweP4",
  "access_expires_at": "2026-10-30T15:29:15.082105988Z",
  "refresh_token": "YirRggYSTBQkc0fgoYRqaUXDoEF2odPHCF4ewjxTsc0",
  "refresh_expires_at": "2026-10-31T03:14:15.080984747Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-19711"
}
```

```json
{
  "challenge_id": "3d8e8e1b-7019-4334-96a6-7306a80afe42",
  "expires_at": "2026-10-30T15:19:15.363065098Z",
  "resend_available_at": "2026-10-30T15:14:16.363065098Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "907543",
  "sent_at": "2026-10-30T15:14:15.36812095Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3d8e8e1b-7019-4334-96a6-7306a80afe42",
  "code": "907543",
  "device_ref": "sandbox-19711"
}
```

```json
{
  "session_id": "206c2800-5639-4020-8e6a-5448c3dc1ccc",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NDE1NSwiaWF0IjoxNzkzMzczMjU1LCJqdGkiOiI4OTg4OGE1Zi1iMDAwLTRhZDEtOGRmZC03ODQ1MGFmOTcyZjIiLCJzaWQiOiIyMDZjMjgwMC01NjM5LTQwMjAtOGU2YS01NDQ4YzNkYzFjY2MifQ.HbIMW1dwtz_VMZ8nczYzmmthDrJIHZfLfY_EwA3QQ1w",
  "access_expires_at": "2026-10-30T15:29:15.688481579Z",
  "refresh_token": "PinTqI4op01VFhf4Hz2Rk1px-Cb5NpyXBjNmO7Lc3OM",
  "refresh_expires_at": "2026-11-29T15:14:15.687574316Z",
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
  "command_id": "6507fa51-03be-4ca0-b0d3-40a4b445697d",
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
  "command_id": "0fc11cf4-6542-43bc-a74e-dd45b2b1e773",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4528,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:14:16Z",
    "sequence": 1793373256993
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
  "correlation_id": "0856c571-2506-4725-8cfa-a1f9869843e0"
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
  "command_id": "083f7fc7-6248-4650-b5fb-9b3fbce1a873",
  "expected_version": 2,
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
  "session_id": "063a7a78-a0a9-4214-95c3-dbf01fd40917",
  "subject": {
    "type": "STAFF",
    "id": "04f20d10-faa2-4386-bfcf-0d466abe8fa8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNGYyMGQxMC1mYWEyLTQzODYtYmZjZi0wZDQ2NmFiZThmYTgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzQxNTgsImlhdCI6MTc5MzM3MzI1OCwianRpIjoiZTFmYmE2NDMtYTExMi00MWJjLTgzMDAtY2YwZDA5YjU5MmE3Iiwic2lkIjoiMDYzYTdhNzgtYTBhOS00MjE0LTk1YzMtZGJmMDFmZDQwOTE3In0.JHtrUCOYuqlnGRfbgY1Ulm_tGSPszLXOCsjvKub8ZEI",
  "access_expires_at": "2026-10-30T15:29:18.628213994Z",
  "refresh_token": "i9Z53KMgEqfJakXxBbnEFKQjVt3lQ_9BkcyKbpd8Eq0",
  "refresh_expires_at": "2026-10-31T03:14:18.627391076Z",
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
  "device_ref": "sandbox-28927"
}
```

```json
{
  "challenge_id": "102d61ce-4a40-49af-9889-2c92ca02a54e",
  "expires_at": "2026-10-30T15:19:19.226270763Z",
  "resend_available_at": "2026-10-30T15:14:20.226270763Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "845522",
  "sent_at": "2026-10-30T15:14:19.232561969Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "102d61ce-4a40-49af-9889-2c92ca02a54e",
  "code": "845522",
  "device_ref": "sandbox-28927"
}
```

```json
{
  "session_id": "63666b7b-f041-40a9-99b0-d61c7aa5930b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NDE1OSwiaWF0IjoxNzkzMzczMjU5LCJqdGkiOiJmYmNkOTg0Yy05MjhkLTQ3YmYtYTE5ZC1jYjk4Y2QzNmMzOTgiLCJzaWQiOiI2MzY2NmI3Yi1mMDQxLTQwYTktOTliMC1kNjFjN2FhNTkzMGIifQ.2VQYmb1ZkaS48lllSQy09Yo227rlz0sp9qJOZZnLSlo",
  "access_expires_at": "2026-10-30T15:29:19.555082706Z",
  "refresh_token": "5s01Bk1Iynkw4_TG_7VqUVT6-gJ0_zOQXckUxTmT5kY",
  "refresh_expires_at": "2026-11-29T15:14:19.554261665Z",
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
  "command_id": "352f269c-ea5d-42a6-98ba-11b57d0628f2",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:14:20Z",
    "sequence": 1793373260128
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "65708d06-cab1-44c5-a256-dfda139ce9bb",
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
  "last_heartbeat_at": "2026-10-30T15:14:20.150245Z",
  "last_location_at": "2026-10-30T15:14:20.150245Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630910228",
  "device_ref": "sandbox-5686"
}
```

```json
{
  "challenge_id": "dd3887dc-c592-460e-b74c-8384678405d3",
  "expires_at": "2026-10-30T15:19:20.461724486Z",
  "resend_available_at": "2026-10-30T15:14:21.461724486Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380630910228` → **200**

```json
{
  "phone": "+380630910228",
  "audience": "CLIENT",
  "code": "931067",
  "sent_at": "2026-10-30T15:14:20.467151523Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "dd3887dc-c592-460e-b74c-8384678405d3",
  "code": "931067",
  "device_ref": "sandbox-5686"
}
```

```json
{
  "session_id": "01ed55eb-19d1-4753-928d-087f6b5c07f0",
  "subject": {
    "type": "CLIENT",
    "id": "cd8447eb-26a2-4da6-b4fd-8227eb836d35"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZDg0NDdlYi0yNmEyLTRkYTYtYjRmZC04MjI3ZWI4MzZkMzUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc0MTYwLCJpYXQiOjE3OTMzNzMyNjAsImp0aSI6IjA0NjgxOWVlLWQ4NjgtNDI5Ny1hYzMzLTc2ODgwMDllOGE2MyIsInNpZCI6IjAxZWQ1NWViLTE5ZDEtNDc1My05MjhkLTA4N2Y2YjVjMDdmMCJ9.EXaW35stDv5MubZwk1Es-oWTxEUAVsHihycL7cR1KlM",
  "access_expires_at": "2026-10-30T15:29:20.78257083Z",
  "refresh_token": "tXLKtypn-WamkXJlybgGKMM7_KlppNKqQqoST6nOx2I",
  "refresh_expires_at": "2026-11-29T15:14:20.78176095Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "11e68bb6-444f-42c4-a49a-d81a12d3b041",
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
  "id": "f8ed7cad-d8fd-4112-b476-1e66d388f3de",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:19:21.102026Z",
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
  "command_id": "7d9874d1-f8be-4849-94df-06f904b24e7c",
  "quote_id": "f8ed7cad-d8fd-4112-b476-1e66d388f3de",
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
  "id": "3fa6a602-6d7a-4d3e-bec4-b338087590d3",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "cd8447eb-26a2-4da6-b4fd-8227eb836d35",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T15:14:21.496197Z",
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
    "id": "439ac5b3-284f-49ac-8c1e-7b713970d38a",
    "order_id": "3fa6a602-6d7a-4d3e-bec4-b338087590d3",
    "expires_at": "2026-10-30T15:14:36.505734Z",
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

`POST /api/driver/v1/offers/439ac5b3-284f-49ac-8c1e-7b713970d38a/accept` → **200**

```json
{
  "command_id": "5be719fa-7655-4922-9b8b-393f612d0ac9"
}
```

```json
{
  "id": "dfac426d-3123-4131-bbf7-67dbb39e7aa7",
  "order_id": "3fa6a602-6d7a-4d3e-bec4-b338087590d3",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "0a84d154-e096-413a-8299-33da5f8db923",
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
  "command_id": "88cbb8e1-3511-4a1b-8099-7c69f3d5b44e",
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
  "changed_by": "04f20d10-faa2-4386-bfcf-0d466abe8fa8",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T15:14:22.80628192Z"
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
  "id": "0a84d154-e096-413a-8299-33da5f8db923",
  "order_id": "3fa6a602-6d7a-4d3e-bec4-b338087590d3",
  "assignment_id": "dfac426d-3123-4131-bbf7-67dbb39e7aa7",
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

`POST /api/driver/v1/work-sessions/65708d06-cab1-44c5-a256-dfda139ce9bb/heartbeat` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:14:23Z",
    "sequence": 1793373263736
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "65708d06-cab1-44c5-a256-dfda139ce9bb",
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
  "last_heartbeat_at": "2026-10-30T15:14:23.764462Z",
  "last_location_at": "2026-10-30T15:14:23.764462Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/0a84d154-e096-413a-8299-33da5f8db923/arrive` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "5428ba64-be01-4abb-b7cd-76a7a7bdb67f",
  "expected_version": 0
}
```

```json
{
  "id": "0a84d154-e096-413a-8299-33da5f8db923",
  "order_id": "3fa6a602-6d7a-4d3e-bec4-b338087590d3",
  "assignment_id": "dfac426d-3123-4131-bbf7-67dbb39e7aa7",
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
  "arrived_at": "2026-10-30T15:14:24.088246Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/0a84d154-e096-413a-8299-33da5f8db923/start` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "3f108f43-e75a-44ad-9ed4-ffc64d764b4f",
  "expected_version": 1
}
```

```json
{
  "id": "0a84d154-e096-413a-8299-33da5f8db923",
  "order_id": "3fa6a602-6d7a-4d3e-bec4-b338087590d3",
  "assignment_id": "dfac426d-3123-4131-bbf7-67dbb39e7aa7",
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
  "arrived_at": "2026-10-30T15:14:24.088246Z",
  "started_at": "2026-10-30T15:14:24.397544Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/0a84d154-e096-413a-8299-33da5f8db923/complete` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "2f9a43b3-c315-4ff5-ba08-89a608e1b847",
  "expected_version": 2,
  "reported_at": "2026-10-30T15:14:24Z",
  "cash_received": true
}
```

```json
{
  "id": "0a84d154-e096-413a-8299-33da5f8db923",
  "order_id": "3fa6a602-6d7a-4d3e-bec4-b338087590d3",
  "assignment_id": "dfac426d-3123-4131-bbf7-67dbb39e7aa7",
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
  "arrived_at": "2026-10-30T15:14:24.088246Z",
  "started_at": "2026-10-30T15:14:24.397544Z",
  "completed_at": "2026-10-30T15:14:24.726754Z",
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
  "session_id": "65708d06-cab1-44c5-a256-dfda139ce9bb",
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
  "last_heartbeat_at": "2026-10-30T15:14:23.764462Z",
  "last_location_at": "2026-10-30T15:14:23.764462Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/65708d06-cab1-44c5-a256-dfda139ce9bb/close` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "8c74bbd0-9839-475f-b1c6-d130a38aa15f",
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
  "command_id": "7c59ea74-ac3c-428e-beab-1b3de067bc01",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:14:25Z",
    "sequence": 1793373265656
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
  "correlation_id": "c5c75ea8-967b-4358-a17e-50a38990f3ba",
  "minimum_version": "9.0.0"
}
```

## After the update he can

`POST /api/driver/v1/work-sessions` (X-App-Platform: DRIVER_ANDROID X-App-Version: 9.0.0) → **201**

```json
{
  "command_id": "bd116acf-a8fb-4995-b8bc-997d48cc297f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:14:25Z",
    "sequence": 1793373265966
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4c6c8b45-c1f8-4216-af95-212ef900d5a4",
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
  "last_heartbeat_at": "2026-10-30T15:14:25.988423Z",
  "last_location_at": "2026-10-30T15:14:25.988423Z",
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
  "changed_by": "04f20d10-faa2-4386-bfcf-0d466abe8fa8",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T15:14:22.806282Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "db8b036f-bfcd-4af9-abfc-e52c63aab532",
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
  "changed_by": "04f20d10-faa2-4386-bfcf-0d466abe8fa8",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T15:14:26.611930048Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4c6c8b45-c1f8-4216-af95-212ef900d5a4",
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
  "last_heartbeat_at": "2026-10-30T15:14:25.988423Z",
  "last_location_at": "2026-10-30T15:14:25.988423Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/4c6c8b45-c1f8-4216-af95-212ef900d5a4/close` → **200**

```json
{
  "command_id": "ca657a87-a58e-401f-9dc0-f9a5ba490e25",
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
  "session_id": "96caab86-ab63-440a-ba76-ddbd1cf66a68",
  "subject": {
    "type": "STAFF",
    "id": "04f20d10-faa2-4386-bfcf-0d466abe8fa8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNGYyMGQxMC1mYWEyLTQzODYtYmZjZi0wZDQ2NmFiZThmYTgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzQxNjcsImlhdCI6MTc5MzM3MzI2NywianRpIjoiODdlY2UxMzktMTlhNC00ZTk0LWJiZDItYjNhOGRlZTcxYmJjIiwic2lkIjoiOTZjYWFiODYtYWI2My00NDBhLWJhNzYtZGRiZDFjZjY2YTY4In0.DiVGdwHRp6UuIjIlrE0KdOCxCv8Iy4aEHT33S8UjU38",
  "access_expires_at": "2026-10-30T15:29:27.853801634Z",
  "refresh_token": "45pvxc2yj9eZHbBE9dHvN_gERC8Rhd5qNrGxUm7Ol8U",
  "refresh_expires_at": "2026-10-31T03:14:27.853041066Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "ffc2c7fe-1f2f-408d-bdae-461faeed56a9",
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
  "id": "6c501471-081c-430c-934c-47be2e91f665",
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
  "created_by": "04f20d10-faa2-4386-bfcf-0d466abe8fa8",
  "created_at": "2026-10-30T15:14:28.156378Z",
  "updated_at": "2026-10-30T15:14:28.156378Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635878715",
  "device_ref": "sandbox-28679"
}
```

```json
{
  "challenge_id": "096fd2fd-ceff-4c20-babd-d5b0ae5c1a6d",
  "expires_at": "2026-10-30T15:19:28.466805929Z",
  "resend_available_at": "2026-10-30T15:14:29.466805929Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380635878715` → **200**

```json
{
  "phone": "+380635878715",
  "audience": "CLIENT",
  "code": "738846",
  "sent_at": "2026-10-30T15:14:28.471620789Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "096fd2fd-ceff-4c20-babd-d5b0ae5c1a6d",
  "code": "738846",
  "device_ref": "sandbox-28679"
}
```

```json
{
  "session_id": "b597c888-16e3-4d40-bbd0-cfcc01e1cc36",
  "subject": {
    "type": "CLIENT",
    "id": "d31c942f-0fca-4ad2-a395-444568415638"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMzFjOTQyZi0wZmNhLTRhZDItYTM5NS00NDQ1Njg0MTU2MzgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc0MTY4LCJpYXQiOjE3OTMzNzMyNjgsImp0aSI6IjE2ODJlMjYzLWEwZTktNGM4Yi1hNGFjLTExNTJlNDEzMTM4NiIsInNpZCI6ImI1OTdjODg4LTE2ZTMtNGQ0MC1iYmQwLWNmY2MwMWUxY2MzNiJ9.lnNTezbe5Yvc9rpq11llZmp6HyFJsi90BMN-4-kFcx8",
  "access_expires_at": "2026-10-30T15:29:28.787925858Z",
  "refresh_token": "L0CANazZRu8vMRvOAacKfZp7PTxmYnwqsHCeNnD4owA",
  "refresh_expires_at": "2026-11-29T15:14:28.787017944Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380635878715` → **200**

```json
{
  "client_id": "d31c942f-0fca-4ad2-a395-444568415638"
}
```

`POST /api/admin/v1/rider-wallets/d31c942f-0fca-4ad2-a395-444568415638/top-ups` → **201**

```json
{
  "command_id": "75a5ac04-63ae-4a99-8f64-a83898a1ab07",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "d31c942f-0fca-4ad2-a395-444568415638",
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
      "id": "ececc6fc-03a4-4e74-b78c-06e363fc5b44",
      "at": "2026-10-30T15:14:29.390307Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "04f20d10-faa2-4386-bfcf-0d466abe8fa8",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "248e6ecb-1de3-418d-94cc-5bab5eb40f4e",
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
  "id": "1e0b3705-aea7-4303-a1ab-799f1a33455c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:19:29.728812Z",
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
      "id": "6c501471-081c-430c-934c-47be2e91f665",
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
  "device_ref": "sandbox-31366"
}
```

```json
{
  "challenge_id": "90b56a1a-7489-4700-abf7-c6fac7bc18fa",
  "expires_at": "2026-10-30T15:19:30.030593925Z",
  "resend_available_at": "2026-10-30T15:14:31.030593925Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "967513",
  "sent_at": "2026-10-30T15:14:30.03499602Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "90b56a1a-7489-4700-abf7-c6fac7bc18fa",
  "code": "967513",
  "device_ref": "sandbox-31366"
}
```

```json
{
  "session_id": "2b23722d-7452-4ede-8564-27aeab6ca676",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NDE3MCwiaWF0IjoxNzkzMzczMjcwLCJqdGkiOiI3YTE3MjAwNy0zZGU0LTQzZGQtYTg1OS04ZTQwYWFiMzdmZmIiLCJzaWQiOiIyYjIzNzIyZC03NDUyLTRlZGUtODU2NC0yN2FlYWI2Y2E2NzYifQ.GKRNkTeo2jFFt4H0zJKm3JuCAEDtUzeUGBmY-7zJ9JY",
  "access_expires_at": "2026-10-30T15:29:30.345106417Z",
  "refresh_token": "sLG7j6e5MRdfkGAcFHOs5sOe1rs_u0vTsVA5iuzedEY",
  "refresh_expires_at": "2026-11-29T15:14:30.344280072Z",
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
  "command_id": "6df57e06-dbd5-486f-a0c4-a5bf95c14b8c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:14:30Z",
    "sequence": 1793373270930
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ed922a6b-bea5-4640-bac7-5d3637090bd3",
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
  "last_heartbeat_at": "2026-10-30T15:14:30.951359Z",
  "last_location_at": "2026-10-30T15:14:30.951359Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "9b172cc5-191b-47fb-864d-ce00ba6a0009",
  "quote_id": "1e0b3705-aea7-4303-a1ab-799f1a33455c",
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
  "id": "63acda11-5881-4035-9055-c7bbe0bcfe5d",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d31c942f-0fca-4ad2-a395-444568415638",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T15:14:31.261682Z",
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
  "client_id": "d31c942f-0fca-4ad2-a395-444568415638",
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
      "id": "ececc6fc-03a4-4e74-b78c-06e363fc5b44",
      "at": "2026-10-30T15:14:29.390307Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "04f20d10-faa2-4386-bfcf-0d466abe8fa8",
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
    "id": "1cc7a5b1-2376-4953-a5eb-b5c81798ff21",
    "order_id": "63acda11-5881-4035-9055-c7bbe0bcfe5d",
    "expires_at": "2026-10-30T15:14:46.270094Z",
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

`POST /api/driver/v1/offers/1cc7a5b1-2376-4953-a5eb-b5c81798ff21/accept` → **200**

```json
{
  "command_id": "181fc96b-dffc-4ecf-8b33-34984d88bc79"
}
```

```json
{
  "id": "396c7752-381b-4a21-801c-66e4c3aa4e9d",
  "order_id": "63acda11-5881-4035-9055-c7bbe0bcfe5d",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "0112f1a7-8511-4e83-af8d-3ec3ad46950d",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "0112f1a7-8511-4e83-af8d-3ec3ad46950d",
  "order_id": "63acda11-5881-4035-9055-c7bbe0bcfe5d",
  "assignment_id": "396c7752-381b-4a21-801c-66e4c3aa4e9d",
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

`POST /api/driver/v1/work-sessions/ed922a6b-bea5-4640-bac7-5d3637090bd3/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:14:34Z",
    "sequence": 1793373274872
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ed922a6b-bea5-4640-bac7-5d3637090bd3",
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
  "last_heartbeat_at": "2026-10-30T15:14:34.894377Z",
  "last_location_at": "2026-10-30T15:14:34.894377Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/0112f1a7-8511-4e83-af8d-3ec3ad46950d/arrive` → **200**

```json
{
  "command_id": "e75d5697-c775-41b6-a19a-ef7f3522778c",
  "expected_version": 0
}
```

```json
{
  "id": "0112f1a7-8511-4e83-af8d-3ec3ad46950d",
  "order_id": "63acda11-5881-4035-9055-c7bbe0bcfe5d",
  "assignment_id": "396c7752-381b-4a21-801c-66e4c3aa4e9d",
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
  "arrived_at": "2026-10-30T15:14:35.193147Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/0112f1a7-8511-4e83-af8d-3ec3ad46950d/start` → **200**

```json
{
  "command_id": "1d019cb0-99ef-42b2-881c-be76ef20677e",
  "expected_version": 1
}
```

```json
{
  "id": "0112f1a7-8511-4e83-af8d-3ec3ad46950d",
  "order_id": "63acda11-5881-4035-9055-c7bbe0bcfe5d",
  "assignment_id": "396c7752-381b-4a21-801c-66e4c3aa4e9d",
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
  "arrived_at": "2026-10-30T15:14:35.193147Z",
  "started_at": "2026-10-30T15:14:35.498172Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/0112f1a7-8511-4e83-af8d-3ec3ad46950d/complete` → **200**

```json
{
  "command_id": "6b4c501b-4716-4204-a3f9-9b6c225fe46e",
  "expected_version": 2,
  "reported_at": "2026-10-30T15:14:35Z",
  "cash_received": true
}
```

```json
{
  "id": "0112f1a7-8511-4e83-af8d-3ec3ad46950d",
  "order_id": "63acda11-5881-4035-9055-c7bbe0bcfe5d",
  "assignment_id": "396c7752-381b-4a21-801c-66e4c3aa4e9d",
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
  "arrived_at": "2026-10-30T15:14:35.193147Z",
  "started_at": "2026-10-30T15:14:35.498172Z",
  "completed_at": "2026-10-30T15:14:35.833767Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "d31c942f-0fca-4ad2-a395-444568415638",
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
      "id": "00cd58b1-60b9-4876-a5bf-9178bf649b77",
      "at": "2026-10-30T15:14:36.781495Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "63acda11-5881-4035-9055-c7bbe0bcfe5d"
    },
    {
      "id": "ececc6fc-03a4-4e74-b78c-06e363fc5b44",
      "at": "2026-10-30T15:14:29.390307Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "04f20d10-faa2-4386-bfcf-0d466abe8fa8",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/6c501471-081c-430c-934c-47be2e91f665/archive` → **200**

```json
{
  "command_id": "734e96f3-9cc3-4207-b843-0484c23da970",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "6c501471-081c-430c-934c-47be2e91f665",
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
  "created_by": "04f20d10-faa2-4386-bfcf-0d466abe8fa8",
  "created_at": "2026-10-30T15:14:28.156378Z",
  "updated_at": "2026-10-30T15:14:39.456397Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ed922a6b-bea5-4640-bac7-5d3637090bd3",
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
  "last_heartbeat_at": "2026-10-30T15:14:34.894377Z",
  "last_location_at": "2026-10-30T15:14:34.894377Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ed922a6b-bea5-4640-bac7-5d3637090bd3/close` → **200**

```json
{
  "command_id": "53c35c2f-fbe8-4c7f-a40d-4397bdfa12eb",
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

Done: order 63acda11-5881-4035-9055-c7bbe0bcfe5d.

# Scenario: broadcast-abuse

## Anna goes online in Warsaw

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000002",
  "device_ref": "sandbox-13298"
}
```

```json
{
  "challenge_id": "1402f362-202e-44d4-8c12-18c60950b922",
  "expires_at": "2026-10-30T15:19:40.377242729Z",
  "resend_available_at": "2026-10-30T15:14:41.377242729Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000002` → **200**

```json
{
  "phone": "+48500000002",
  "audience": "DRIVER",
  "code": "931609",
  "sent_at": "2026-10-30T15:14:40.382466373Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1402f362-202e-44d4-8c12-18c60950b922",
  "code": "931609",
  "device_ref": "sandbox-13298"
}
```

```json
{
  "session_id": "8d224f65-1d3c-4edf-9c4c-ba3443d89fcb",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000405"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDUiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NDE4MCwiaWF0IjoxNzkzMzczMjgwLCJqdGkiOiJiMzZlNDU3YS04N2VmLTQ0MDMtYTA5MC04NGJlNjE5MTkyNzIiLCJzaWQiOiI4ZDIyNGY2NS0xZDNjLTRlZGYtOWM0Yy1iYTM0NDNkODlmY2IifQ.iVAVl3kjnQqRGkEOENCdiR0lbB5x9hw3wptuULmNk8A",
  "access_expires_at": "2026-10-30T15:29:40.706268917Z",
  "refresh_token": "ybZrNItvNxjKjc9i5V-7WM_1g7d9hjQZJCI8ookV8ww",
  "refresh_expires_at": "2026-11-29T15:14:40.70558361Z",
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
  "command_id": "8cc86325-ccdc-41db-97e4-d423152b754d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000505",
  "location": {
    "lat": 52.2297,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:14:41Z",
    "sequence": 1793373281597
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "b3eef04c-a7bc-4221-b3b8-ebbf32029c2e",
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
  "last_heartbeat_at": "2026-10-30T15:14:41.618834Z",
  "last_location_at": "2026-10-30T15:14:41.618834Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## 5 seconds later her phone reports Lviv: not taken as her position

`POST /api/driver/v1/work-sessions/b3eef04c-a7bc-4221-b3b8-ebbf32029c2e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 49.8397,
    "lon": 24.0297,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:14:46Z",
    "sequence": 1793373286916
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "b3eef04c-a7bc-4221-b3b8-ebbf32029c2e",
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
  "last_heartbeat_at": "2026-10-30T15:14:46.937371Z",
  "last_location_at": "2026-10-30T15:14:41.618834Z",
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
  "session_id": "81af69d0-838c-484b-beb4-157316f19c74",
  "subject": {
    "type": "STAFF",
    "id": "04f20d10-faa2-4386-bfcf-0d466abe8fa8"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNGYyMGQxMC1mYWEyLTQzODYtYmZjZi0wZDQ2NmFiZThmYTgiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzQxODcsImlhdCI6MTc5MzM3MzI4NywianRpIjoiNzJhOGRhNGMtZjA4My00ZGRjLTgwYmMtODI0ZDZhM2JkODcxIiwic2lkIjoiODFhZjY5ZDAtODM4Yy00ODRiLWJlYjQtMTU3MzE2ZjE5Yzc0In0.v1g9al8jwoBSv03-RqlSKBj68dc9SoVL3TIAbvcBrfc",
  "access_expires_at": "2026-10-30T15:29:47.552991197Z",
  "refresh_token": "b-DwGPVGWqglunnOIHKNXh0NX66E9QzE2uV_D6_7nUY",
  "refresh_expires_at": "2026-10-31T03:14:47.552249655Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "at": "2026-10-30T15:14:47.839461535Z",
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
      "last_location_at": "2026-10-30T15:14:41.618834Z",
      "order_id": null
    }
  ]
}
```

## A fix next to the last accepted one is taken again

`POST /api/driver/v1/work-sessions/b3eef04c-a7bc-4221-b3b8-ebbf32029c2e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2299,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:14:48Z",
    "sequence": 1793373288145
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "b3eef04c-a7bc-4221-b3b8-ebbf32029c2e",
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
  "last_heartbeat_at": "2026-10-30T15:14:48.166762Z",
  "last_location_at": "2026-10-30T15:14:48.166762Z",
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
  "session_id": "b3eef04c-a7bc-4221-b3b8-ebbf32029c2e",
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
  "last_heartbeat_at": "2026-10-30T15:14:48.166762Z",
  "last_location_at": "2026-10-30T15:14:48.166762Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b3eef04c-a7bc-4221-b3b8-ebbf32029c2e/close` → **200**

```json
{
  "command_id": "dde6cf3a-29f4-4ae4-b133-b60fda5dabe4",
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
  "device_ref": "sandbox-9717"
}
```

```json
{
  "challenge_id": "9b456cb8-7b89-4027-80ef-77b0dd18c8d3",
  "expires_at": "2026-10-30T15:19:49.066816832Z",
  "resend_available_at": "2026-10-30T15:14:50.066816832Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "418934",
  "sent_at": "2026-10-30T15:14:49.07076269Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9b456cb8-7b89-4027-80ef-77b0dd18c8d3",
  "code": "418934",
  "device_ref": "sandbox-9717"
}
```

```json
{
  "session_id": "1cbd11ac-fff1-4bea-b8cc-1b21170da643",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NDE4OSwiaWF0IjoxNzkzMzczMjg5LCJqdGkiOiJjOTM1M2FlNC00YzIxLTRmYmMtOTE1My05OTJlZDMyNjA4OWYiLCJzaWQiOiIxY2JkMTFhYy1mZmYxLTRiZWEtYjhjYy0xYjIxMTcwZGE2NDMifQ.WEX-XVdti4piBkqxIRgN3AI0E00tb4Hp3EXfNw38LJM",
  "access_expires_at": "2026-10-30T15:29:49.383795476Z",
  "refresh_token": "BSvprwjyOl5szfoR3li2NW24UiL0ZCVb81d_8SAvcTQ",
  "refresh_expires_at": "2026-11-29T15:14:49.383096793Z",
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
  "device_ref": "sandbox-5"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "4763131a-2a3d-429a-b5ff-848546b8a650",
  "retryable": true,
  "retry_after_seconds": 1
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000001",
  "device_ref": "sandbox-5"
}
```

```json
{
  "challenge_id": "4e96b971-2378-479d-a012-b9d1e3ae47e1",
  "expires_at": "2026-10-30T15:19:51.260096934Z",
  "resend_available_at": "2026-10-30T15:14:52.260096934Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "047281",
  "sent_at": "2026-10-30T15:14:51.263789803Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4e96b971-2378-479d-a012-b9d1e3ae47e1",
  "code": "047281",
  "device_ref": "sandbox-5"
}
```

```json
{
  "session_id": "7c30dca5-3f3f-4b5b-a7a4-559a1e29b5e0",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NDE5MSwiaWF0IjoxNzkzMzczMjkxLCJqdGkiOiJlMGIxN2MwNS1kMGIyLTRhOTItOWMwMi05MjVmZGUyOWFmZjQiLCJzaWQiOiI3YzMwZGNhNS0zZjNmLTRiNWItYTdhNC01NTlhMWUyOWI1ZTAifQ.KLWmiWfmV-jyqnqFF3EiQ_TM3vXnlaikgygDjwDJ6HQ",
  "access_expires_at": "2026-10-30T15:29:51.582464253Z",
  "refresh_token": "OQjB02T68m21YXoyAAZvjVayEIN-EId02R5aQEGz58A",
  "refresh_expires_at": "2026-11-29T15:14:51.581681765Z",
  "account_created": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000002",
  "device_ref": "sandbox-4171"
}
```

```json
{
  "challenge_id": "c20a4c7d-d7dd-4e38-93ec-a3f98b6c81e4",
  "expires_at": "2026-10-30T15:19:51.892755218Z",
  "resend_available_at": "2026-10-30T15:14:52.892755218Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000002` → **200**

```json
{
  "phone": "+48500000002",
  "audience": "DRIVER",
  "code": "514011",
  "sent_at": "2026-10-30T15:14:51.896336399Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c20a4c7d-d7dd-4e38-93ec-a3f98b6c81e4",
  "code": "514011",
  "device_ref": "sandbox-4171"
}
```

```json
{
  "session_id": "e29a0e02-b3d6-4411-afca-4d78afb47f77",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000405"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDUiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NDE5MiwiaWF0IjoxNzkzMzczMjkyLCJqdGkiOiI4YzI3NGZlNy1mZWRhLTQ4MDItOGMyMy00YjA2YmY5MGM4MTkiLCJzaWQiOiJlMjlhMGUwMi1iM2Q2LTQ0MTEtYWZjYS00ZDc4YWZiNDdmNzcifQ.C_AvJ8c-Eey6aYC_JNIRwnHxSXiMKR8GvJ8w_H4l2Fs",
  "access_expires_at": "2026-10-30T15:29:52.232888491Z",
  "refresh_token": "0KGsCpYQjtIqryaiCujZMaxOs-mdS8c0Bc0cIkfJtdk",
  "refresh_expires_at": "2026-11-29T15:14:52.232202945Z",
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
  "command_id": "551e57be-1720-43e0-8cdd-1d2816db5b07",
  "vehicle_id": "5a000000-0000-4000-8000-000000000505",
  "location": {
    "lat": 52.2297,
    "lon": 21.1700,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:17:55Z",
    "sequence": 1793373475125
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "4291921d-d008-4732-8e51-2864c2c8b7f0",
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
  "last_heartbeat_at": "2026-10-30T15:17:55.146329Z",
  "last_location_at": "2026-10-30T15:17:55.146329Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders: nobody is near, the order goes to the ALL tab

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600088393",
  "device_ref": "sandbox-32045"
}
```

```json
{
  "challenge_id": "66cadea7-714e-4623-94fa-4996768d7291",
  "expires_at": "2026-10-30T15:22:55.444180208Z",
  "resend_available_at": "2026-10-30T15:17:56.444180208Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600088393` → **200**

```json
{
  "phone": "+48600088393",
  "audience": "CLIENT",
  "code": "155620",
  "sent_at": "2026-10-30T15:17:55.447417922Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "66cadea7-714e-4623-94fa-4996768d7291",
  "code": "155620",
  "device_ref": "sandbox-32045"
}
```

```json
{
  "session_id": "2e3ef321-1618-49fa-a2b9-1ee37f07b552",
  "subject": {
    "type": "CLIENT",
    "id": "ed346ec9-634d-472a-a130-ced6c01a8722"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZDM0NmVjOS02MzRkLTQ3MmEtYTEzMC1jZWQ2YzAxYTg3MjIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc0Mzc1LCJpYXQiOjE3OTMzNzM0NzUsImp0aSI6IjlmN2NiNjAwLTQwZWYtNGFhMi04YmY0LTQwMTdkNTNlMDVmOSIsInNpZCI6IjJlM2VmMzIxLTE2MTgtNDlmYS1hMmI5LTFlZTM3ZjA3YjU1MiJ9.ywdcTgys6qgABM5wxRK_XRB8JQ2KvtbG0DT53bBwUdM",
  "access_expires_at": "2026-10-30T15:32:55.767764983Z",
  "refresh_token": "qu7Baln1dIz_85cs1WYxs3xxeUpRGhyxxeV1GP6f1Tw",
  "refresh_expires_at": "2026-11-29T15:17:55.767092592Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "3173a570-ef8c-43db-bead-6ca39bada17e",
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
  "id": "285dfcb2-4fe5-4238-838c-33afc1cd25e3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 4942,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:22:56.071559Z",
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
  "command_id": "87e667ab-a0a7-4088-9713-8f43cb2b4e8b",
  "quote_id": "285dfcb2-4fe5-4238-838c-33afc1cd25e3",
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
  "id": "40089920-9313-464b-8854-4a2085f549d2",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ed346ec9-634d-472a-a130-ced6c01a8722",
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
  "created_at": "2026-10-30T15:17:56.390268Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/40089920-9313-464b-8854-4a2085f549d2` → **200**

```json
{
  "id": "40089920-9313-464b-8854-4a2085f549d2",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ed346ec9-634d-472a-a130-ced6c01a8722",
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
  "created_at": "2026-10-30T15:17:56.390268Z",
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

`POST /api/driver/v1/orders/40089920-9313-464b-8854-4a2085f549d2/claim` → **422**

```json
{
  "command_id": "a88845fc-0bc9-48f6-8f1b-a7e319955baf"
}
```

```json
{
  "instance": "/api/driver/v1/orders/40089920-9313-464b-8854-4a2085f549d2/claim",
  "status": 422,
  "title": "Pickup too far",
  "type": "https://errors.blizz.taxi/pickup-too-far",
  "code": "PICKUP_TOO_FAR",
  "correlation_id": "98c5aee3-2667-44b9-b46d-91388bc3e792"
}
```

`GET /api/rider/v1/orders/40089920-9313-464b-8854-4a2085f549d2` → **200**

```json
{
  "id": "40089920-9313-464b-8854-4a2085f549d2",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ed346ec9-634d-472a-a130-ced6c01a8722",
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
  "created_at": "2026-10-30T15:17:56.390268Z",
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

`POST /api/driver/v1/orders/49f15a4c-31c0-4013-bfa3-a672c4a772e6/claim` → **404**

```json
{
  "command_id": "1bd8c30a-c6e8-4ac1-a50a-d1c2c06a37db"
}
```

```json
{
  "instance": "/api/driver/v1/orders/49f15a4c-31c0-4013-bfa3-a672c4a772e6/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "6a38f3ce-7f1d-44b4-b64c-bb6c7858e1fb"
}
```

`POST /api/driver/v1/orders/d6b8162a-a2fd-4176-b332-034fa8e4c03e/claim` → **404**

```json
{
  "command_id": "8bd5199b-e7d2-4c71-af48-396cc39a8e64"
}
```

```json
{
  "instance": "/api/driver/v1/orders/d6b8162a-a2fd-4176-b332-034fa8e4c03e/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "443f3c6d-8b7d-408c-856c-186810ac7e7a"
}
```

`POST /api/driver/v1/orders/68d46259-6666-4cc5-b68e-ce2f58c97ad8/claim` → **404**

```json
{
  "command_id": "ca91553b-cbf3-4e1b-8d52-bc93ba5b1fec"
}
```

```json
{
  "instance": "/api/driver/v1/orders/68d46259-6666-4cc5-b68e-ce2f58c97ad8/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "c82f5990-fc14-468c-8a3b-f8bd1699cecf"
}
```

`POST /api/driver/v1/orders/f0d6cbad-cc78-489d-81b7-96ada9c219ef/claim` → **404**

```json
{
  "command_id": "1cf46baa-104b-430a-bdf1-b99fe349d1e4"
}
```

```json
{
  "instance": "/api/driver/v1/orders/f0d6cbad-cc78-489d-81b7-96ada9c219ef/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "df7e6123-4ac1-47ea-ac8a-5e2043966444"
}
```

`POST /api/driver/v1/orders/580ab482-e13b-4dd5-8ca1-c5dbd67c4ce4/claim` → **404**

```json
{
  "command_id": "b0bbb61d-cc67-4758-b822-d2069923a112"
}
```

```json
{
  "instance": "/api/driver/v1/orders/580ab482-e13b-4dd5-8ca1-c5dbd67c4ce4/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "ec6ba7cf-6ef0-4be8-92d6-b8030fc29869"
}
```

`POST /api/driver/v1/orders/594a1c26-f965-45dc-bda8-61a41eab929c/claim` → **404**

```json
{
  "command_id": "e492115e-fe80-40bd-b43e-d3fef4e2ef7b"
}
```

```json
{
  "instance": "/api/driver/v1/orders/594a1c26-f965-45dc-bda8-61a41eab929c/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "4402242c-f6ea-405b-beb3-f8b1410de2ab"
}
```

`POST /api/driver/v1/orders/2e4460c9-f970-4de3-8b97-fe0222d7595d/claim` → **404**

```json
{
  "command_id": "9e424b6f-3018-471f-b30a-31ba708d08f3"
}
```

```json
{
  "instance": "/api/driver/v1/orders/2e4460c9-f970-4de3-8b97-fe0222d7595d/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "7c338498-2620-4f3b-abb8-dfb5323349ec"
}
```

`POST /api/driver/v1/orders/780c3e09-c153-4acd-9a7b-949517efa235/claim` → **404**

```json
{
  "command_id": "0dd6d491-e8fd-46ad-a7be-c14b70b4740a"
}
```

```json
{
  "instance": "/api/driver/v1/orders/780c3e09-c153-4acd-9a7b-949517efa235/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "5441f5f4-0349-43f6-b97e-f1f85ea70f51"
}
```

`POST /api/driver/v1/orders/e8a92956-d835-42b6-8d4a-099eea94a817/claim` → **404**

```json
{
  "command_id": "3282c434-4a00-4660-b067-a7cf6cfc88d4"
}
```

```json
{
  "instance": "/api/driver/v1/orders/e8a92956-d835-42b6-8d4a-099eea94a817/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "9ca0608b-b019-4d6d-8461-85065d31331e"
}
```

`POST /api/driver/v1/orders/e921be2d-f928-46f0-b16b-885f0fbb0185/claim` → **404**

```json
{
  "command_id": "6e55e7b0-024b-4f6d-a6bb-16b68439075b"
}
```

```json
{
  "instance": "/api/driver/v1/orders/e921be2d-f928-46f0-b16b-885f0fbb0185/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "5c3d06d1-4794-4b0e-bd40-31ce905ccf08"
}
```

`POST /api/driver/v1/orders/6d6e0e9f-e329-4e36-bc8c-9dd2a469b1c7/claim` → **404**

```json
{
  "command_id": "784c0aab-64ac-4834-a2ec-7e03e61feccf"
}
```

```json
{
  "instance": "/api/driver/v1/orders/6d6e0e9f-e329-4e36-bc8c-9dd2a469b1c7/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "1d194608-5f44-4daa-83ae-a3797b757a1e"
}
```

`POST /api/driver/v1/orders/757a8115-379d-4ce8-b9c4-1654ce2082dd/claim` → **404**

```json
{
  "command_id": "70d4b86c-0707-43ad-b1f1-a5840ae5ae8e"
}
```

```json
{
  "instance": "/api/driver/v1/orders/757a8115-379d-4ce8-b9c4-1654ce2082dd/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "eea472ff-fd68-4a86-b164-bcf5335d229d"
}
```

`POST /api/driver/v1/orders/bdf872cc-d26f-4727-aec3-b21c04230bf6/claim` → **404**

```json
{
  "command_id": "b5a11843-5a46-4d29-9ed8-075cca3d3dab"
}
```

```json
{
  "instance": "/api/driver/v1/orders/bdf872cc-d26f-4727-aec3-b21c04230bf6/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "7e0681a8-f483-4457-a848-4e921c889d60"
}
```

`POST /api/driver/v1/orders/b1e38500-a2b2-497f-8126-c917b504608d/claim` → **404**

```json
{
  "command_id": "af1d523b-3a53-4150-840e-eeaebc0764d2"
}
```

```json
{
  "instance": "/api/driver/v1/orders/b1e38500-a2b2-497f-8126-c917b504608d/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "2fb9c7de-9c1f-424c-a6e7-4d058abfc16c"
}
```

`POST /api/driver/v1/orders/e75a9204-be10-4340-84e6-c1a945040123/claim` → **404**

```json
{
  "command_id": "a97c044c-b197-4164-b4e6-533d3ec70611"
}
```

```json
{
  "instance": "/api/driver/v1/orders/e75a9204-be10-4340-84e6-c1a945040123/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "f72df728-ea7c-479e-a4ef-514ce4bdb2c9"
}
```

`POST /api/driver/v1/orders/719ddddd-273e-49ca-932d-56b747d0a9ed/claim` → **404**

```json
{
  "command_id": "03662828-e054-4791-b3bb-bd81d68e98b2"
}
```

```json
{
  "instance": "/api/driver/v1/orders/719ddddd-273e-49ca-932d-56b747d0a9ed/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "c6ec305f-2477-44d0-8946-80c2f081f09b"
}
```

`POST /api/driver/v1/orders/d40c46b0-e6a6-4837-a14c-08255cbae585/claim` → **404**

```json
{
  "command_id": "39e3919d-2fee-4c05-a460-9c95b4cb2832"
}
```

```json
{
  "instance": "/api/driver/v1/orders/d40c46b0-e6a6-4837-a14c-08255cbae585/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "54d80d1c-6ecb-4a8e-815f-876e0be8b15f"
}
```

`POST /api/driver/v1/orders/87197c04-2b7f-44ca-9fec-6ead9e46a914/claim` → **404**

```json
{
  "command_id": "2b5c3bf8-e971-4200-afc0-993381075c92"
}
```

```json
{
  "instance": "/api/driver/v1/orders/87197c04-2b7f-44ca-9fec-6ead9e46a914/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "2d2a4d74-24cc-4312-b5d1-b116c4533d37"
}
```

`POST /api/driver/v1/orders/c3ffc5fc-d2ae-4b19-b611-f15d4349f515/claim` → **404**

```json
{
  "command_id": "93ac7a4c-79e2-4c75-a134-ee23a803b68f"
}
```

```json
{
  "instance": "/api/driver/v1/orders/c3ffc5fc-d2ae-4b19-b611-f15d4349f515/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "c4fcb191-bb10-44ce-893f-bbcd81a69475"
}
```

`POST /api/driver/v1/orders/67435932-9887-47be-9990-b710b7c47718/claim` → **404**

```json
{
  "command_id": "552a1017-f15b-43b9-9763-85aee0b90c27"
}
```

```json
{
  "instance": "/api/driver/v1/orders/67435932-9887-47be-9990-b710b7c47718/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "099a43a1-3ec9-46f7-97fe-07bdad76fa47"
}
```

`POST /api/driver/v1/orders/6cfc0d35-3b2d-4588-a6bc-37a6e05a5b63/claim` → **404**

```json
{
  "command_id": "60557141-c6c2-40ed-b7aa-19d9e01a0178"
}
```

```json
{
  "instance": "/api/driver/v1/orders/6cfc0d35-3b2d-4588-a6bc-37a6e05a5b63/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "ec65393d-dd24-4a9d-812b-f3638253e5e2"
}
```

`POST /api/driver/v1/orders/758f6202-a7e9-4eec-aaa0-085a171a1e39/claim` → **404**

```json
{
  "command_id": "0beea938-645f-428e-a92a-1a230bca18fa"
}
```

```json
{
  "instance": "/api/driver/v1/orders/758f6202-a7e9-4eec-aaa0-085a171a1e39/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "bd37659a-ce07-46bd-9af3-7721a18e3215"
}
```

`POST /api/driver/v1/orders/e7aa646b-86c4-4574-8e3a-947c835d2dd3/claim` → **404**

```json
{
  "command_id": "4a510bab-a156-46db-9257-de985633a02f"
}
```

```json
{
  "instance": "/api/driver/v1/orders/e7aa646b-86c4-4574-8e3a-947c835d2dd3/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "add6cf90-5c9b-46a7-878a-e89d76fc9a91"
}
```

`POST /api/driver/v1/orders/7699eeb1-d6bb-4230-88bf-62348d4fbcd9/claim` → **404**

```json
{
  "command_id": "7f33c050-3a56-4211-830a-cea17aad9859"
}
```

```json
{
  "instance": "/api/driver/v1/orders/7699eeb1-d6bb-4230-88bf-62348d4fbcd9/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "754549f8-96f8-4093-a346-2b2d23302268"
}
```

`POST /api/driver/v1/orders/fb81ff8f-53a1-4fe9-9cb8-41862040fd0b/claim` → **404**

```json
{
  "command_id": "8650c42e-060c-4762-a78f-79744c6e289e"
}
```

```json
{
  "instance": "/api/driver/v1/orders/fb81ff8f-53a1-4fe9-9cb8-41862040fd0b/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "ae990036-c4cb-4dd1-9607-99cbb76e1562"
}
```

`POST /api/driver/v1/orders/874f70a4-3cfb-4d4f-9d13-208f811615e1/claim` → **404**

```json
{
  "command_id": "20b68059-0e7f-4477-953c-690f5d10d55d"
}
```

```json
{
  "instance": "/api/driver/v1/orders/874f70a4-3cfb-4d4f-9d13-208f811615e1/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "33fc13fc-d788-42d7-955a-6170ea601979"
}
```

`POST /api/driver/v1/orders/d772574b-6007-446f-abcc-464cf0ba9c48/claim` → **404**

```json
{
  "command_id": "49322e58-13cb-4bae-bfae-d56ad28767da"
}
```

```json
{
  "instance": "/api/driver/v1/orders/d772574b-6007-446f-abcc-464cf0ba9c48/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "9f0f5326-19e3-49d7-9e72-a75333e6cb1b"
}
```

`POST /api/driver/v1/orders/dbfc6e33-39b6-446b-ae4a-0aad566769b8/claim` → **404**

```json
{
  "command_id": "3d503ed8-1b04-4c71-ac47-c93f1069c9b9"
}
```

```json
{
  "instance": "/api/driver/v1/orders/dbfc6e33-39b6-446b-ae4a-0aad566769b8/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "138e40d1-59e3-40c1-9319-46914cfc59e0"
}
```

`POST /api/driver/v1/orders/6402ce88-3276-4b35-b05c-2b684d1ea623/claim` → **404**

```json
{
  "command_id": "3d24248b-5918-4ca8-b1d6-0fd01c2a35d0"
}
```

```json
{
  "instance": "/api/driver/v1/orders/6402ce88-3276-4b35-b05c-2b684d1ea623/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "35e8a3e4-0ffd-4670-b94d-052bcabe80fb"
}
```

`POST /api/driver/v1/orders/34a7c0fc-2d11-45c0-bd9b-9fef10abc293/claim` → **429**

```json
{
  "command_id": "4553006b-7ad6-4874-b8b7-d480eb502172"
}
```

```json
{
  "instance": "/api/driver/v1/orders/34a7c0fc-2d11-45c0-bd9b-9fef10abc293/claim",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "2456de89-ed45-4e87-a940-3e869564be9b",
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
  "command_id": "e88814e7-d95b-475c-880a-7aae9ef9ea5d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:18:07Z",
    "sequence": 1793373487318
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "52bfcf2f-fd41-4c01-aa4c-20600438c36c",
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
  "last_heartbeat_at": "2026-10-30T15:18:07.337953Z",
  "last_location_at": "2026-10-30T15:18:07.337953Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/broadcast-orders` → **200**

```json
[
  {
    "order_id": "40089920-9313-464b-8854-4a2085f549d2",
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

`POST /api/driver/v1/orders/40089920-9313-464b-8854-4a2085f549d2/claim` → **409**

```json
{
  "command_id": "5d1dfcf1-b73c-427b-9a05-279391237d17"
}
```

```json
{
  "instance": "/api/driver/v1/orders/40089920-9313-464b-8854-4a2085f549d2/claim",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "dc208ead-26da-438a-91e5-b0f966f37d3d"
}
```

`POST /api/driver/v1/orders/40089920-9313-464b-8854-4a2085f549d2/claim` → **200**

```json
{
  "command_id": "fcd00e9b-e4dd-4169-876f-8b05e2e37bdd"
}
```

```json
{
  "id": "b5e5662a-9b10-48b3-a4f8-d695511c29c9",
  "order_id": "40089920-9313-464b-8854-4a2085f549d2",
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "source": "BROADCAST",
  "state": "COMMITTED",
  "trip_id": "ff87d003-667e-4737-bc4d-70e5276ec688",
  "trip_phase": "TO_PICKUP"
}
```

## Piotr cancels at the rider's request (sandbox clean-up)

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "ff87d003-667e-4737-bc4d-70e5276ec688",
  "order_id": "40089920-9313-464b-8854-4a2085f549d2",
  "assignment_id": "b5e5662a-9b10-48b3-a4f8-d695511c29c9",
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

`POST /api/driver/v1/trips/ff87d003-667e-4737-bc4d-70e5276ec688/cancel` → **200**

```json
{
  "command_id": "75d8b33f-52c8-4e8c-863a-51e1b6d2f17f",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "ff87d003-667e-4737-bc4d-70e5276ec688",
  "order_id": "40089920-9313-464b-8854-4a2085f549d2",
  "assignment_id": "b5e5662a-9b10-48b3-a4f8-d695511c29c9",
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

`GET /api/rider/v1/orders/40089920-9313-464b-8854-4a2085f549d2` → **200**

```json
{
  "id": "40089920-9313-464b-8854-4a2085f549d2",
  "short_number": 3,
  "status": "CANCELLED",
  "status_reason": "PASSENGER_ASKED",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "ed346ec9-634d-472a-a130-ced6c01a8722",
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
    "id": "b5e5662a-9b10-48b3-a4f8-d695511c29c9",
    "order_id": "40089920-9313-464b-8854-4a2085f549d2",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "vehicle_id": "5a000000-0000-4000-8000-000000000504",
    "source": "BROADCAST",
    "state": "RELEASED",
    "trip_id": "ff87d003-667e-4737-bc4d-70e5276ec688",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T15:17:56.390268Z",
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
  "session_id": "4291921d-d008-4732-8e51-2864c2c8b7f0",
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
  "last_heartbeat_at": "2026-10-30T15:17:55.146329Z",
  "last_location_at": "2026-10-30T15:17:55.146329Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/4291921d-d008-4732-8e51-2864c2c8b7f0/close` → **200**

```json
{
  "command_id": "a1c8cd39-d227-4bbc-8657-2f258635c6a4",
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
  "session_id": "52bfcf2f-fd41-4c01-aa4c-20600438c36c",
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
  "last_heartbeat_at": "2026-10-30T15:18:07.337953Z",
  "last_location_at": "2026-10-30T15:18:07.337953Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/52bfcf2f-fd41-4c01-aa4c-20600438c36c/close` → **200**

```json
{
  "command_id": "e60a5052-9e9f-4e14-b8fd-7c00a3c2c5e9",
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
  "session_id": "8c9fda3d-5033-403c-926a-51d5b7cd3418",
  "subject": {
    "type": "STAFF",
    "id": "04f20d10-faa2-4386-bfcf-0d466abe8fa8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNGYyMGQxMC1mYWEyLTQzODYtYmZjZi0wZDQ2NmFiZThmYTgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzQzOTEsImlhdCI6MTc5MzM3MzQ5MSwianRpIjoiYWEyMWVkNTMtMmJjYi00Yjk5LWIyNDQtOTNkZWI1ZmFhZWQ2Iiwic2lkIjoiOGM5ZmRhM2QtNTAzMy00MDNjLTkyNmEtNTFkNWI3Y2QzNDE4In0.C7VMv2BpnzCnyxkcKyIZZh95xQdTQz1R-5FJISv0Cyo",
  "access_expires_at": "2026-10-30T15:33:11.013985722Z",
  "refresh_token": "8JaY4Bhm3M_wUShL1v75gr0nSEzsZRpvK5R-ywFXXc8",
  "refresh_expires_at": "2026-10-31T03:18:11.013324699Z",
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
  "command_id": "db375557-fb88-4eb7-b92d-e55e19913643",
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
  "session_id": "a1d7e101-b375-4297-9cc1-b5c175a87b47",
  "subject": {
    "type": "STAFF",
    "id": "04f20d10-faa2-4386-bfcf-0d466abe8fa8"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNGYyMGQxMC1mYWEyLTQzODYtYmZjZi0wZDQ2NmFiZThmYTgiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzQzOTIsImlhdCI6MTc5MzM3MzQ5MiwianRpIjoiYmEwNmE3ZTItZTk2ZC00YWFmLTk1ZDktNmIzODE5M2M3ZGVjIiwic2lkIjoiYTFkN2UxMDEtYjM3NS00Mjk3LTljYzEtYjVjMTc1YTg3YjQ3In0.ne1_9WRn8whzvegoEdJy1XMYAlhl8G3iMDu2B7oaIcs",
  "access_expires_at": "2026-10-30T15:33:12.205373074Z",
  "refresh_token": "4G3u9SHHBpoGqkmKra7miLXXAW3hVGQEbSafOS6ig6w",
  "refresh_expires_at": "2026-10-31T03:18:12.204730107Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.30116301",
    "linkedid": "1730052700.30116301",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380672524583"
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
    "id": "1730052700.30116301",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "410ff272-2341-4edc-bb69-6b7671e3e133",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380672524583",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T15:18:12.488854Z",
      "answered_at": null,
      "ended_at": "2026-10-30T15:18:12.513534Z",
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
    "id": "1730052600.3245811855",
    "linkedid": "1730052600.3245811855",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380672524583"
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
      "id": "0882eda4-1a54-4f2e-b643-0def5e433a54",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380672524583",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T15:18:12.842016Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/0882eda4-1a54-4f2e-b643-0def5e433a54/answer` → **200**

```json
{
  "command_id": "1af3e92c-dae8-4606-a5a2-7d77f34a7d6c"
}
```

```json
{
  "id": "0882eda4-1a54-4f2e-b643-0def5e433a54",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380672524583",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "04f20d10-faa2-4386-bfcf-0d466abe8fa8",
  "order_ids": [],
  "started_at": "2026-10-30T15:18:12.842016Z",
  "answered_at": "2026-10-30T15:18:13.173387Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.3245811855",
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
    "id": "1730052600.3245811855",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "0882eda4-1a54-4f2e-b643-0def5e433a54",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672524583",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "04f20d10-faa2-4386-bfcf-0d466abe8fa8",
      "order_ids": [],
      "started_at": "2026-10-30T15:18:12.842016Z",
      "answered_at": "2026-10-30T15:18:13.173387Z",
      "ended_at": "2026-10-30T15:18:13.492003Z",
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
      "id": "0882eda4-1a54-4f2e-b643-0def5e433a54",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672524583",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "04f20d10-faa2-4386-bfcf-0d466abe8fa8",
      "order_ids": [],
      "started_at": "2026-10-30T15:18:12.842016Z",
      "answered_at": "2026-10-30T15:18:13.173387Z",
      "ended_at": "2026-10-30T15:18:13.492003Z",
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
      "id": "0882eda4-1a54-4f2e-b643-0def5e433a54",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672524583",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "04f20d10-faa2-4386-bfcf-0d466abe8fa8",
      "order_ids": [],
      "started_at": "2026-10-30T15:18:12.842016Z",
      "answered_at": "2026-10-30T15:18:13.173387Z",
      "ended_at": "2026-10-30T15:18:13.492003Z",
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
      "id": "0882eda4-1a54-4f2e-b643-0def5e433a54",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672524583",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "04f20d10-faa2-4386-bfcf-0d466abe8fa8",
      "order_ids": [],
      "started_at": "2026-10-30T15:18:12.842016Z",
      "answered_at": "2026-10-30T15:18:13.173387Z",
      "ended_at": "2026-10-30T15:18:13.492003Z",
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
      "id": "0882eda4-1a54-4f2e-b643-0def5e433a54",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672524583",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "04f20d10-faa2-4386-bfcf-0d466abe8fa8",
      "order_ids": [],
      "started_at": "2026-10-30T15:18:12.842016Z",
      "answered_at": "2026-10-30T15:18:13.173387Z",
      "ended_at": "2026-10-30T15:18:13.492003Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T15:18:21.452647Z"
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
      "id": "0882eda4-1a54-4f2e-b643-0def5e433a54",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672524583",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "04f20d10-faa2-4386-bfcf-0d466abe8fa8",
      "order_ids": [],
      "started_at": "2026-10-30T15:18:12.842016Z",
      "answered_at": "2026-10-30T15:18:13.173387Z",
      "ended_at": "2026-10-30T15:18:13.492003Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T15:18:21.452647Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/0882eda4-1a54-4f2e-b643-0def5e433a54/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/0882eda4-1a54-4f2e-b643-0def5e433a54/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=0882eda4-1a54-4f2e-b643-0def5e433a54` → **200**

```json
{
  "changes": [
    {
      "id": "51915059-6ba6-4ec4-8b82-b49722208d4f",
      "occurred_at": "2026-10-30T15:18:23.338249Z",
      "actor_type": "STAFF",
      "actor_id": "04f20d10-faa2-4386-bfcf-0d466abe8fa8",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "0882eda4-1a54-4f2e-b643-0def5e433a54",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"f53c1314-b2e8-4afc-bca6-e33aa8212756\", \"order_ids\": []}",
      "correlation_id": "21c94e87-d792-4bf6-96a8-06de2112613c"
    },
    {
      "id": "f782df37-969c-4dd1-b623-60464d2aa5be",
      "occurred_at": "2026-10-30T15:18:23.306757Z",
      "actor_type": "STAFF",
      "actor_id": "04f20d10-faa2-4386-bfcf-0d466abe8fa8",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "0882eda4-1a54-4f2e-b643-0def5e433a54",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"f53c1314-b2e8-4afc-bca6-e33aa8212756\", \"order_ids\": []}",
      "correlation_id": "474c235a-a783-4c16-81b4-8f34e0a54189"
    }
  ]
}
```

Done: call 0882eda4-1a54-4f2e-b643-0def5e433a54 recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-26958"
}
```

```json
{
  "challenge_id": "1254810e-7fc8-4721-ae29-694a9bd8d733",
  "expires_at": "2026-10-30T15:23:23.674317346Z",
  "resend_available_at": "2026-10-30T15:18:24.674317346Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "239541",
  "sent_at": "2026-10-30T15:18:23.67737321Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1254810e-7fc8-4721-ae29-694a9bd8d733",
  "code": "239541",
  "device_ref": "sandbox-26958"
}
```

```json
{
  "session_id": "8efe0da9-4fc4-462f-865f-895b4c4c74e1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NDQwMywiaWF0IjoxNzkzMzczNTAzLCJqdGkiOiJjZjczM2VkMS03NDc2LTRiNTQtYjBiMy01MGRhYmZhOGJiMzYiLCJzaWQiOiI4ZWZlMGRhOS00ZmM0LTQ2MmYtODY1Zi04OTViNGM0Yzc0ZTEifQ.M4Nl2A7X6dLr6c179bVbh3Vb28BrLKuDi0tYkHjzEmg",
  "access_expires_at": "2026-10-30T15:33:23.999843669Z",
  "refresh_token": "VprFm04e7msnGOoAabWcLBBmVzeNPUC_n7acqi-GjmE",
  "refresh_expires_at": "2026-11-29T15:18:23.999230077Z",
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
  "command_id": "6715d3dc-cad9-4192-b8a2-e52158b8d357",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:18:24Z",
    "sequence": 1793373504585
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8a4874a6-30b1-42c1-b00b-cfa0a984b429",
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
  "last_heartbeat_at": "2026-10-30T15:18:24.605455Z",
  "last_location_at": "2026-10-30T15:18:24.605455Z",
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
  "session_id": "707fc0be-aafc-4f3d-bb14-f041adbca969",
  "subject": {
    "type": "STAFF",
    "id": "04f20d10-faa2-4386-bfcf-0d466abe8fa8"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNGYyMGQxMC1mYWEyLTQzODYtYmZjZi0wZDQ2NmFiZThmYTgiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzQ0MDUsImlhdCI6MTc5MzM3MzUwNSwianRpIjoiM2VhM2Y3YWUtYWQ5OC00M2E0LTgwNTEtNzM5NmRhODJkMDk1Iiwic2lkIjoiNzA3ZmMwYmUtYWFmYy00ZjNkLWJiMTQtZjA0MWFkYmNhOTY5In0.CGnQHpc-E1i_JudSfemfKCU29FpdnMALEMG-a0pdqts",
  "access_expires_at": "2026-10-30T15:33:25.197007879Z",
  "refresh_token": "mhfs5Ni5N1TwHo3hcKmYweOgaRfDkg9iouowLtTs1jo",
  "refresh_expires_at": "2026-10-31T03:18:25.196350105Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "03d4dbef-0ca6-40b1-94fb-6a05ce333a6f",
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
  "id": "8b5f31f6-10c7-4f57-955f-eeebf3b6c1ea",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:23:25.484123Z",
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
  "command_id": "17aa18ba-418a-499e-b9fe-d3f5e698e0b2",
  "quote_id": "8b5f31f6-10c7-4f57-955f-eeebf3b6c1ea",
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
    "phone": "+380670280706"
  }
}
```

```json
{
  "id": "e89853a2-2b33-49cd-8885-8495093418e1",
  "short_number": 4,
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
  "created_at": "2026-10-30T15:18:25.808675Z",
  "caller": {
    "name": "Олена",
    "phone": "+380670280706"
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
    "id": "7aa051a9-2430-4482-9fea-3534dc8557a9",
    "order_id": "e89853a2-2b33-49cd-8885-8495093418e1",
    "expires_at": "2026-10-30T15:18:40.813675Z",
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

`POST /api/driver/v1/offers/7aa051a9-2430-4482-9fea-3534dc8557a9/accept` → **200**

```json
{
  "command_id": "8e5cf03f-70a8-4a64-b857-5adfa70d45fb"
}
```

```json
{
  "id": "a72543af-a154-44c8-9d95-204dc93f3b55",
  "order_id": "e89853a2-2b33-49cd-8885-8495093418e1",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b23f0480-820e-429b-a0d4-c516344afe80",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380670280706` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380670280706` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380670280706` → **200**

```json
[
  {
    "phone": "+380670280706",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T15:18:28.0652175Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380670280706` → **200**

```json
[
  {
    "phone": "+380670280706",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T15:18:28.0652175Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380670280706` → **200**

```json
[
  {
    "phone": "+380670280706",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T15:18:28.0652175Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b23f0480-820e-429b-a0d4-c516344afe80",
  "order_id": "e89853a2-2b33-49cd-8885-8495093418e1",
  "assignment_id": "a72543af-a154-44c8-9d95-204dc93f3b55",
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
    "phone": "+380670280706"
  }
}
```

`POST /api/driver/v1/work-sessions/8a4874a6-30b1-42c1-b00b-cfa0a984b429/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:18:29Z",
    "sequence": 1793373509173
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8a4874a6-30b1-42c1-b00b-cfa0a984b429",
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
  "last_heartbeat_at": "2026-10-30T15:18:29.192639Z",
  "last_location_at": "2026-10-30T15:18:29.192639Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/b23f0480-820e-429b-a0d4-c516344afe80/arrive` → **200**

```json
{
  "command_id": "edae546c-5484-4160-be14-2a54a944a90b",
  "expected_version": 0
}
```

```json
{
  "id": "b23f0480-820e-429b-a0d4-c516344afe80",
  "order_id": "e89853a2-2b33-49cd-8885-8495093418e1",
  "assignment_id": "a72543af-a154-44c8-9d95-204dc93f3b55",
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
  "arrived_at": "2026-10-30T15:18:29.498161Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380670280706"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380670280706` → **200**

```json
[
  {
    "phone": "+380670280706",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T15:18:28.0652175Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380670280706` → **200**

```json
[
  {
    "phone": "+380670280706",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T15:18:28.0652175Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380670280706` → **200**

```json
[
  {
    "phone": "+380670280706",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T15:18:28.0652175Z"
  },
  {
    "phone": "+380670280706",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T15:18:31.074538763Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380670280706` → **200**

```json
[
  {
    "phone": "+380670280706",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T15:18:28.0652175Z"
  },
  {
    "phone": "+380670280706",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T15:18:31.074538763Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380670280706` → **200**

```json
[
  {
    "phone": "+380670280706",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T15:18:28.0652175Z"
  },
  {
    "phone": "+380670280706",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T15:18:31.074538763Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/b23f0480-820e-429b-a0d4-c516344afe80/start` → **200**

```json
{
  "command_id": "27bfcae0-0531-486c-a6b6-2eb2823cbe60",
  "expected_version": 1
}
```

```json
{
  "id": "b23f0480-820e-429b-a0d4-c516344afe80",
  "order_id": "e89853a2-2b33-49cd-8885-8495093418e1",
  "assignment_id": "a72543af-a154-44c8-9d95-204dc93f3b55",
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
  "arrived_at": "2026-10-30T15:18:29.498161Z",
  "started_at": "2026-10-30T15:18:31.935627Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380670280706"
  }
}
```

`POST /api/driver/v1/trips/b23f0480-820e-429b-a0d4-c516344afe80/complete` → **200**

```json
{
  "command_id": "00f4a7c1-6499-4ffa-a4b7-d6d9e84bf2e6",
  "expected_version": 2,
  "reported_at": "2026-10-30T15:18:32Z",
  "cash_received": true
}
```

```json
{
  "id": "b23f0480-820e-429b-a0d4-c516344afe80",
  "order_id": "e89853a2-2b33-49cd-8885-8495093418e1",
  "assignment_id": "a72543af-a154-44c8-9d95-204dc93f3b55",
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
  "arrived_at": "2026-10-30T15:18:29.498161Z",
  "started_at": "2026-10-30T15:18:31.935627Z",
  "completed_at": "2026-10-30T15:18:32.243355Z",
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
  "session_id": "8a4874a6-30b1-42c1-b00b-cfa0a984b429",
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
  "last_heartbeat_at": "2026-10-30T15:18:29.192639Z",
  "last_location_at": "2026-10-30T15:18:29.192639Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8a4874a6-30b1-42c1-b00b-cfa0a984b429/close` → **200**

```json
{
  "command_id": "17ecdbf8-843a-4261-87a0-da4b9effac5c",
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
  "phone": "+380636740292",
  "device_ref": "sandbox-3658"
}
```

```json
{
  "challenge_id": "9d52442b-eade-4d50-9e7f-2065948d613d",
  "expires_at": "2026-10-30T15:23:33.157835171Z",
  "resend_available_at": "2026-10-30T15:18:34.157835171Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636740292` → **200**

```json
{
  "phone": "+380636740292",
  "audience": "CLIENT",
  "code": "077923",
  "sent_at": "2026-10-30T15:18:33.160975374Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9d52442b-eade-4d50-9e7f-2065948d613d",
  "code": "077923",
  "device_ref": "sandbox-3658"
}
```

```json
{
  "session_id": "cdeacaa0-71dc-4884-9555-219d88d42755",
  "subject": {
    "type": "CLIENT",
    "id": "53378da0-9205-44ec-aff6-5cd180b6e39d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MzM3OGRhMC05MjA1LTQ0ZWMtYWZmNi01Y2QxODBiNmUzOWQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc0NDEzLCJpYXQiOjE3OTMzNzM1MTMsImp0aSI6ImMxYjYwNTQ0LTI1YzEtNDAxNS04ZWQ3LTRlYWNmNmNlMDQ2ZiIsInNpZCI6ImNkZWFjYWEwLTcxZGMtNDg4NC05NTU1LTIxOWQ4OGQ0Mjc1NSJ9._CW2FOeLiPIjDKREWGbt8l9yu2qr6htQQG6s1wJqNWo",
  "access_expires_at": "2026-10-30T15:33:33.483799876Z",
  "refresh_token": "RkS6NUxkbgDbmwennl4OBvsn1y1LikoHVMhJabbdMbk",
  "refresh_expires_at": "2026-11-29T15:18:33.483100784Z",
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
  "device_ref": "sandbox-6167"
}
```

```json
{
  "challenge_id": "70c3223f-655f-4e3d-b6ac-66711aab8c08",
  "expires_at": "2026-10-30T15:23:34.060400295Z",
  "resend_available_at": "2026-10-30T15:18:35.060400295Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "034257",
  "sent_at": "2026-10-30T15:18:34.063543924Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "70c3223f-655f-4e3d-b6ac-66711aab8c08",
  "code": "034257",
  "device_ref": "sandbox-6167"
}
```

```json
{
  "session_id": "b7c43777-655b-4424-af60-6350cc72b785",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NDQxNCwiaWF0IjoxNzkzMzczNTE0LCJqdGkiOiI4ZjcxNWVlNS1iMzJlLTQzZTMtYTQ0Zi1hMTAyMzdkNGZhM2UiLCJzaWQiOiJiN2M0Mzc3Ny02NTViLTQ0MjQtYWY2MC02MzUwY2M3MmI3ODUifQ.dQ9ODstGxS4G2-ZFj_xBKjPYXUVt7VWGt84EJVu7-iU",
  "access_expires_at": "2026-10-30T15:33:34.384158135Z",
  "refresh_token": "XSp0F2bjD3hvmW9ywpqsTUiksVGDQnTC6s6MzDAtTLs",
  "refresh_expires_at": "2026-11-29T15:18:34.383395033Z",
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
  "session_id": "e6f1bac6-b282-4ab2-9d7e-00a01a3a0880",
  "subject": {
    "type": "STAFF",
    "id": "04f20d10-faa2-4386-bfcf-0d466abe8fa8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNGYyMGQxMC1mYWEyLTQzODYtYmZjZi0wZDQ2NmFiZThmYTgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzQ0MTUsImlhdCI6MTc5MzM3MzUxNSwianRpIjoiMGQ0NzEwMjctNGYzYS00YjVkLWIwY2UtYmNmY2YxYzczNGJjIiwic2lkIjoiZTZmMWJhYzYtYjI4Mi00YWIyLTlkN2UtMDBhMDFhM2EwODgwIn0.QJwe_jP9dDPv4NJNLF3uqHRZQ2o07NoGVFF5zAj2Ipo",
  "access_expires_at": "2026-10-30T15:33:35.240702364Z",
  "refresh_token": "aOvVSJpD3Ay_dYYcBtn-70WfPYY5UFu0H7FTw_sb3ec",
  "refresh_expires_at": "2026-10-31T03:18:35.240073274Z",
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
  "session_id": "3489c01b-5363-4060-9ddc-ef2b88ac55fa",
  "subject": {
    "type": "STAFF",
    "id": "04f20d10-faa2-4386-bfcf-0d466abe8fa8"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNGYyMGQxMC1mYWEyLTQzODYtYmZjZi0wZDQ2NmFiZThmYTgiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzQ0MTUsImlhdCI6MTc5MzM3MzUxNSwianRpIjoiNjA2OTE2MjYtODRiOS00ODdiLTg3YmUtNWRjMTE0N2E0ODAyIiwic2lkIjoiMzQ4OWMwMWItNTM2My00MDYwLTlkZGMtZWYyYjg4YWM1NWZhIn0.83VMQ_re9vXN5JT3Uf_ZWuSoEey22Ph_XD-6WMYq5a8",
  "access_expires_at": "2026-10-30T15:33:35.821598601Z",
  "refresh_token": "pxzaOj79Xt4crXwLoFNXjEftUWCWUrPxvTAt9Zy-U90",
  "refresh_expires_at": "2026-10-31T03:18:35.821021298Z",
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
  "command_id": "9ce2ce5e-c0d1-4112-8500-0f014096058d",
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
  "id": "d67b7207-7527-4d5d-9e16-7c5a01d1419f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:23:36.398905Z",
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
  "command_id": "e25534eb-d466-40e6-91c1-a6b1826b63c1",
  "quote_id": "d67b7207-7527-4d5d-9e16-7c5a01d1419f",
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
  "id": "6157918d-ffda-4660-9658-f73b58fac1b8",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "53378da0-9205-44ec-aff6-5cd180b6e39d",
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
  "created_at": "2026-10-30T15:18:36.710536Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6157918d-ffda-4660-9658-f73b58fac1b8` → **200**

```json
{
  "id": "6157918d-ffda-4660-9658-f73b58fac1b8",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "53378da0-9205-44ec-aff6-5cd180b6e39d",
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
  "created_at": "2026-10-30T15:18:36.710536Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/6157918d-ffda-4660-9658-f73b58fac1b8/cancel` → **200**

```json
{
  "command_id": "05e8ffe2-de81-4199-8398-ed3408cb4df5",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "6157918d-ffda-4660-9658-f73b58fac1b8",
  "short_number": 5,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "53378da0-9205-44ec-aff6-5cd180b6e39d",
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
  "created_at": "2026-10-30T15:18:36.710536Z",
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
  "command_id": "8d24538a-e6fb-47b6-b087-ae0688ac5e56",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:18:37Z",
    "sequence": 1793373517993
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "6e5b5062-0f24-4850-9878-fd917ebbd2b1",
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
  "last_heartbeat_at": "2026-10-30T15:18:38.014011Z",
  "last_location_at": "2026-10-30T15:18:38.014011Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-6088"
}
```

```json
{
  "challenge_id": "0906c646-5268-40fd-81e3-2a8568c8d874",
  "expires_at": "2026-10-30T15:23:38.333256317Z",
  "resend_available_at": "2026-10-30T15:18:39.333256317Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "409052",
  "sent_at": "2026-10-30T15:18:38.336280803Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0906c646-5268-40fd-81e3-2a8568c8d874",
  "code": "409052",
  "device_ref": "sandbox-6088"
}
```

```json
{
  "session_id": "ffc08842-3eec-426a-8ce4-2434ce2b05fe",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NDQxOCwiaWF0IjoxNzkzMzczNTE4LCJqdGkiOiIwY2VkYzc2ZC1iMTk3LTRlODAtYTRkYy0wMDZjMTZiYjkzZjYiLCJzaWQiOiJmZmMwODg0Mi0zZWVjLTQyNmEtOGNlNC0yNDM0Y2UyYjA1ZmUifQ.m4dBStmeAbJ7CQyb_t3TiY0Jpn2RjGU1jjWtqlRIJrQ",
  "access_expires_at": "2026-10-30T15:33:38.660504557Z",
  "refresh_token": "9N4HzUAvDrXLi3Yyws3HxHK1T1Hhvm7sFDLhXsYjDtM",
  "refresh_expires_at": "2026-11-29T15:18:38.659931852Z",
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
  "command_id": "5a37a17b-969e-4b12-82fd-d02d279689ae",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:18:39Z",
    "sequence": 1793373519252
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "f93d68f2-2b06-4661-b4af-ffc30e31d1c3",
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
  "last_heartbeat_at": "2026-10-30T15:18:39.271669Z",
  "last_location_at": "2026-10-30T15:18:39.271669Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "69f8ab29-8b7f-4933-8a0d-121ffeb59df1",
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
  "id": "7dd7a74b-c32f-46f1-89da-b40551c1ca7f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:23:39.579410Z",
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
  "command_id": "2ddda229-31fe-4129-ace8-14879fefabaa",
  "quote_id": "7dd7a74b-c32f-46f1-89da-b40551c1ca7f",
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
  "id": "2c7f6303-a5aa-422b-a6a9-4dff4a78dd50",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "53378da0-9205-44ec-aff6-5cd180b6e39d",
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
  "created_at": "2026-10-30T15:18:39.88804Z",
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
    "id": "9c2adc8d-4092-4b06-8394-30bcf1aceabb",
    "order_id": "2c7f6303-a5aa-422b-a6a9-4dff4a78dd50",
    "expires_at": "2026-10-30T15:18:54.891428Z",
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

`POST /api/driver/v1/offers/9c2adc8d-4092-4b06-8394-30bcf1aceabb/accept` → **200**

```json
{
  "command_id": "d45542f6-1827-478d-82bf-2e44bf67f08a"
}
```

```json
{
  "id": "6269746e-b094-4be3-9557-ebbb9cc9ee1b",
  "order_id": "2c7f6303-a5aa-422b-a6a9-4dff4a78dd50",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d9f5db68-707a-4deb-9dc9-48cba96ef184",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d9f5db68-707a-4deb-9dc9-48cba96ef184",
  "order_id": "2c7f6303-a5aa-422b-a6a9-4dff4a78dd50",
  "assignment_id": "6269746e-b094-4be3-9557-ebbb9cc9ee1b",
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

`POST /api/driver/v1/trips/d9f5db68-707a-4deb-9dc9-48cba96ef184/cancel` → **200**

```json
{
  "command_id": "e6b5d30b-540a-4853-8cd7-7f236ca1661f",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "d9f5db68-707a-4deb-9dc9-48cba96ef184",
  "order_id": "2c7f6303-a5aa-422b-a6a9-4dff4a78dd50",
  "assignment_id": "6269746e-b094-4be3-9557-ebbb9cc9ee1b",
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

`GET /api/rider/v1/orders/2c7f6303-a5aa-422b-a6a9-4dff4a78dd50` → **200**

```json
{
  "id": "2c7f6303-a5aa-422b-a6a9-4dff4a78dd50",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "53378da0-9205-44ec-aff6-5cd180b6e39d",
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
    "id": "6269746e-b094-4be3-9557-ebbb9cc9ee1b",
    "order_id": "2c7f6303-a5aa-422b-a6a9-4dff4a78dd50",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "d9f5db68-707a-4deb-9dc9-48cba96ef184",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T15:18:39.88804Z",
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
    "id": "4653f8f1-f709-41da-b9a1-e175c2a1aae8",
    "order_id": "2c7f6303-a5aa-422b-a6a9-4dff4a78dd50",
    "expires_at": "2026-10-30T15:18:56.122236Z",
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

`POST /api/driver/v1/offers/4653f8f1-f709-41da-b9a1-e175c2a1aae8/accept` → **200**

```json
{
  "command_id": "6b57af67-31b8-4511-8a76-70dfeaae2737"
}
```

```json
{
  "id": "1b996f8c-4641-4aab-bdf8-e219052d10a6",
  "order_id": "2c7f6303-a5aa-422b-a6a9-4dff4a78dd50",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "4f48c3fc-5358-4462-b6a9-9dd66a506261",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "4f48c3fc-5358-4462-b6a9-9dd66a506261",
  "order_id": "2c7f6303-a5aa-422b-a6a9-4dff4a78dd50",
  "assignment_id": "1b996f8c-4641-4aab-bdf8-e219052d10a6",
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

`POST /api/driver/v1/trips/4f48c3fc-5358-4462-b6a9-9dd66a506261/cancel` → **200**

```json
{
  "command_id": "e8d525e7-d8a1-40ce-b734-6cc45b7d67d3",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "4f48c3fc-5358-4462-b6a9-9dd66a506261",
  "order_id": "2c7f6303-a5aa-422b-a6a9-4dff4a78dd50",
  "assignment_id": "1b996f8c-4641-4aab-bdf8-e219052d10a6",
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
[
  {
    "id": "2c7f6303-a5aa-422b-a6a9-4dff4a78dd50",
    "short_number": 6,
    "status": "CANCELLED",
    "created_at": "2026-10-30T15:18:39.88804Z",
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
    "id": "6157918d-ffda-4660-9658-f73b58fac1b8",
    "short_number": 5,
    "status": "CANCELLED",
    "created_at": "2026-10-30T15:18:36.710536Z",
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
]
```

`GET /api/operator/v1/orders/2c7f6303-a5aa-422b-a6a9-4dff4a78dd50/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T15:18:39.888632Z",
      "actor": {
        "type": "CLIENT",
        "id": "53378da0-9205-44ec-aff6-5cd180b6e39d",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "2c7f6303-a5aa-422b-a6a9-4dff4a78dd50",
        "quote_id": "7dd7a74b-c32f-46f1-89da-b40551c1ca7f",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "a47c8ae9-d26b-411d-8325-edda08880051"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T15:18:39.890635Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "2c7f6303-a5aa-422b-a6a9-4dff4a78dd50",
        "attempt_id": "dad0ba38-bc24-4e50-bba8-cd66b5077b2d",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "a47c8ae9-d26b-411d-8325-edda08880051"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T15:18:39.916167Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "9c2adc8d-4092-4b06-8394-30bcf1aceabb",
        "order_id": "2c7f6303-a5aa-422b-a6a9-4dff4a78dd50",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "a47c8ae9-d26b-411d-8325-edda08880051"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T15:18:40.528716Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "9c2adc8d-4092-4b06-8394-30bcf1aceabb",
        "order_id": "2c7f6303-a5aa-422b-a6a9-4dff4a78dd50",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "6269746e-b094-4be3-9557-ebbb9cc9ee1b"
      },
      "correlation_id": "47b88f05-b429-4468-a1a8-83f093d1faa8"
```

Done: orders 6157918d-ffda-4660-9658-f73b58fac1b8, 2c7f6303-a5aa-422b-a6a9-4dff4a78dd50.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380739902148",
  "device_ref": "sandbox-24758"
}
```

```json
{
  "challenge_id": "ed66373f-b9e4-425d-af16-6a1a34154655",
  "expires_at": "2026-10-30T15:23:43.51999484Z",
  "resend_available_at": "2026-10-30T15:18:44.51999484Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380739902148` → **200**

```json
{
  "phone": "+380739902148",
  "audience": "CLIENT",
  "code": "185290",
  "sent_at": "2026-10-30T15:18:43.522829128Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ed66373f-b9e4-425d-af16-6a1a34154655",
  "code": "185290",
  "device_ref": "sandbox-24758"
}
```

```json
{
  "session_id": "5f783408-fbce-4222-a692-0668d2588353",
  "subject": {
    "type": "CLIENT",
    "id": "253ae975-18e5-4a69-9679-29445d21ba54"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNTNhZTk3NS0xOGU1LTRhNjktOTY3OS0yOTQ0NWQyMWJhNTQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc0NDIzLCJpYXQiOjE3OTMzNzM1MjMsImp0aSI6IjA1YjExMjQ3LWVkZDYtNDRmNy05Mzg1LTBmOGZkYzM3ODNhNiIsInNpZCI6IjVmNzgzNDA4LWZiY2UtNDIyMi1hNjkyLTA2NjhkMjU4ODM1MyJ9.CY2-M44Gl3Wa46vSZrT7E1yDlHPXHwBMuGXNwGZaP8k",
  "access_expires_at": "2026-10-30T15:33:43.847070753Z",
  "refresh_token": "jFSkobMWYV66bI1LG7j1AhRfvvRypgM8b5t-aMnv30A",
  "refresh_expires_at": "2026-11-29T15:18:43.846387141Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "e57aeb8d-ba2c-4575-be09-2e01a6118477",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "d6b8e494-fd36-4bca-a8b7-e0e05a367a22",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-d6b8e494-fd36-4bca-a8b7-e0e05a367a22",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "f20aad1b2d9f7ce40c9112953b11b7e6",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=d6b8e494-fd36-4bca-a8b7-e0e05a367a22",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380739902148"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=d6b8e494-fd36-4bca-a8b7-e0e05a367a22",
  "expires_at": "2026-10-30T15:48:44.142442Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/d6b8e494-fd36-4bca-a8b7-e0e05a367a22` → **200**

```json
{
  "id": "d6b8e494-fd36-4bca-a8b7-e0e05a367a22",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T15:48:44.142442Z",
  "card": {
    "id": "e1572223-274f-4bb0-bf08-5d289bd00ae7",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****7805",
    "card_type": "Visa",
    "created_at": "2026-10-30T15:18:44.453351Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "e1572223-274f-4bb0-bf08-5d289bd00ae7",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****7805",
      "card_type": "Visa",
      "created_at": "2026-10-30T15:18:44.453351Z"
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
  "device_ref": "sandbox-17003"
}
```

```json
{
  "challenge_id": "9d9e3e2b-8a20-4f23-b1f9-16eabb4a085a",
  "expires_at": "2026-10-30T15:23:45.045019412Z",
  "resend_available_at": "2026-10-30T15:18:46.045019412Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "524526",
  "sent_at": "2026-10-30T15:18:45.047918353Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9d9e3e2b-8a20-4f23-b1f9-16eabb4a085a",
  "code": "524526",
  "device_ref": "sandbox-17003"
}
```

```json
{
  "session_id": "178fb4a7-a12a-42aa-9dd6-004a5789d6a4",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NDQyNSwiaWF0IjoxNzkzMzczNTI1LCJqdGkiOiI0ZWFkZWM0Ny00ZWY0LTQxYTctODIwNC0zOWViZjdkZWNhODQiLCJzaWQiOiIxNzhmYjRhNy1hMTJhLTQyYWEtOWRkNi0wMDRhNTc4OWQ2YTQifQ.wsUeDNYdez9Rqk4S4NzYN_VdLJXP8u8V7Mf3aFm7IeA",
  "access_expires_at": "2026-10-30T15:33:45.385117742Z",
  "refresh_token": "uOFUyL79IXBm14f-DAKm--kBAphBqQAdUD4J0KK1dVE",
  "refresh_expires_at": "2026-11-29T15:18:45.384433155Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "f93d68f2-2b06-4661-b4af-ffc30e31d1c3",
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
  "last_heartbeat_at": "2026-10-30T15:18:39.271669Z",
  "last_location_at": "2026-10-30T15:18:39.271669Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f93d68f2-2b06-4661-b4af-ffc30e31d1c3/handover` → **200**

```json
{
  "command_id": "deb40f63-8506-49a4-a72d-30c9ffd408ea",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "f93d68f2-2b06-4661-b4af-ffc30e31d1c3",
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
  "last_heartbeat_at": "2026-10-30T15:18:39.271669Z",
  "last_location_at": "2026-10-30T15:18:39.271669Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

(the car drives 42 s to the next point)

`POST /api/driver/v1/work-sessions/f93d68f2-2b06-4661-b4af-ffc30e31d1c3/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:19:28Z",
    "sequence": 1793373568285
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "f93d68f2-2b06-4661-b4af-ffc30e31d1c3",
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
  "last_heartbeat_at": "2026-10-30T15:19:28.30534Z",
  "last_location_at": "2026-10-30T15:19:28.30534Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "281d75fb-e4e7-40fa-be36-6609c296b057",
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
  "id": "d0c17ade-f7b9-436c-9aa3-9df35a5c87d8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:24:28.606136Z",
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

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "f0740daf-a5ac-489c-bc15-d99405b1cf5c",
  "quote_id": "d0c17ade-f7b9-436c-9aa3-9df35a5c87d8",
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
  "id": "bf6de3f3-63c5-4846-b48a-2da6500f7024",
  "short_number": 7,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "253ae975-18e5-4a69-9679-29445d21ba54",
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
  "created_at": "2026-10-30T15:19:28.914973Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/bf6de3f3-63c5-4846-b48a-2da6500f7024` → **200**

```json
{
  "id": "bf6de3f3-63c5-4846-b48a-2da6500f7024",
  "short_number": 7,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "253ae975-18e5-4a69-9679-29445d21ba54",
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
  "created_at": "2026-10-30T15:19:28.914973Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/bf6de3f3-63c5-4846-b48a-2da6500f7024` → **200**

```json
{
  "id": "bf6de3f3-63c5-4846-b48a-2da6500f7024",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "253ae975-18e5-4a69-9679-29445d21ba54",
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
  "created_at": "2026-10-30T15:19:28.914973Z",
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
    "id": "12b5f167-927b-4106-9595-8fa5d7a9ef91",
    "order_id": "bf6de3f3-63c5-4846-b48a-2da6500f7024",
    "expires_at": "2026-10-30T15:19:44.401112Z",
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

`POST /api/driver/v1/offers/12b5f167-927b-4106-9595-8fa5d7a9ef91/accept` → **200**

```json
{
  "command_id": "4f117156-0e51-4a2e-86f4-bebb96aa1743"
}
```

```json
{
  "id": "c2e37626-340a-452e-9587-506210915762",
  "order_id": "bf6de3f3-63c5-4846-b48a-2da6500f7024",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "6da5b8f8-184d-473c-aefe-b0fcbe18ca93",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "6da5b8f8-184d-473c-aefe-b0fcbe18ca93",
  "order_id": "bf6de3f3-63c5-4846-b48a-2da6500f7024",
  "assignment_id": "c2e37626-340a-452e-9587-506210915762",
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

`POST /api/driver/v1/work-sessions/f93d68f2-2b06-4661-b4af-ffc30e31d1c3/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:19:37Z",
    "sequence": 1793373577828
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "f93d68f2-2b06-4661-b4af-ffc30e31d1c3",
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
  "last_heartbeat_at": "2026-10-30T15:19:37.849186Z",
  "last_location_at": "2026-10-30T15:19:37.849186Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/6da5b8f8-184d-473c-aefe-b0fcbe18ca93/arrive` → **200**

```json
{
  "command_id": "1ff19821-8218-48c9-88fe-0c562edd8749",
  "expected_version": 0
}
```

```json
{
  "id": "6da5b8f8-184d-473c-aefe-b0fcbe18ca93",
  "order_id": "bf6de3f3-63c5-4846-b48a-2da6500f7024",
  "assignment_id": "c2e37626-340a-452e-9587-506210915762",
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
  "arrived_at": "2026-10-30T15:19:38.156583Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/6da5b8f8-184d-473c-aefe-b0fcbe18ca93/start` → **200**

```json
{
  "command_id": "5d7b1e30-37c1-42cb-bf2a-d7f70783d5ee",
  "expected_version": 1
}
```

```json
{
  "id": "6da5b8f8-184d-473c-aefe-b0fcbe18ca93",
  "order_id": "bf6de3f3-63c5-4846-b48a-2da6500f7024",
  "assignment_id": "c2e37626-340a-452e-9587-506210915762",
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
  "arrived_at": "2026-10-30T15:19:38.156583Z",
  "started_at": "2026-10-30T15:19:38.464572Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/6da5b8f8-184d-473c-aefe-b0fcbe18ca93/complete` → **200**

```json
{
  "command_id": "77bd8df4-b5a8-4fa0-a6c0-9f6a652101a2",
  "expected_version": 2,
  "reported_at": "2026-10-30T15:19:38Z",
  "cash_received": true
}
```

```json
{
  "id": "6da5b8f8-184d-473c-aefe-b0fcbe18ca93",
  "order_id": "bf6de3f3-63c5-4846-b48a-2da6500f7024",
  "assignment_id": "c2e37626-340a-452e-9587-506210915762",
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
  "arrived_at": "2026-10-30T15:19:38.156583Z",
  "started_at": "2026-10-30T15:19:38.464572Z",
  "completed_at": "2026-10-30T15:19:38.783568Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/bf6de3f3-63c5-4846-b48a-2da6500f7024` → **200**

```json
{
  "id": "bf6de3f3-63c5-4846-b48a-2da6500f7024",
  "short_number": 7,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "253ae975-18e5-4a69-9679-29445d21ba54",
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
    "id": "c2e37626-340a-452e-9587-506210915762",
    "order_id": "bf6de3f3-63c5-4846-b48a-2da6500f7024",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "6da5b8f8-184d-473c-aefe-b0fcbe18ca93",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T15:19:28.914973Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/bf6de3f3-63c5-4846-b48a-2da6500f7024` → **200**

```json
{
  "id": "bf6de3f3-63c5-4846-b48a-2da6500f7024",
  "short_number": 7,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "253ae975-18e5-4a69-9679-29445d21ba54",
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
    "id": "c2e37626-340a-452e-9587-506210915762",
    "order_id": "bf6de3f3-63c5-4846-b48a-2da6500f7024",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "6da5b8f8-184d-473c-aefe-b0fcbe18ca93",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T15:19:28.914973Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/bf6de3f3-63c5-4846-b48a-2da6500f7024` → **200**

```json
{
  "id": "bf6de3f3-63c5-4846-b48a-2da6500f7024",
  "short_number": 7,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "253ae975-18e5-4a69-9679-29445d21ba54",
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
    "id": "c2e37626-340a-452e-9587-506210915762",
    "order_id": "bf6de3f3-63c5-4846-b48a-2da6500f7024",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "6da5b8f8-184d-473c-aefe-b0fcbe18ca93",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T15:19:28.914973Z",
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

`GET /api/rider/v1/orders/bf6de3f3-63c5-4846-b48a-2da6500f7024/tip` → **200**

```json
{
  "order_id": "bf6de3f3-63c5-4846-b48a-2da6500f7024",
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
  "available_until": "2026-10-31T15:19:38.783568Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/bf6de3f3-63c5-4846-b48a-2da6500f7024/tip` → **201**

```json
{
  "command_id": "be33f660-646e-462c-b279-e77ba9e16656",
  "amount_minor": 2500
}
```

```json
{
  "id": "efc63f58-040e-4b81-9e05-3c0cf49c22cf",
  "order_id": "bf6de3f3-63c5-4846-b48a-2da6500f7024",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T15:19:42.617023Z"
}
```

`GET /api/rider/v1/orders/bf6de3f3-63c5-4846-b48a-2da6500f7024/tip` → **200**

```json
{
  "order_id": "bf6de3f3-63c5-4846-b48a-2da6500f7024",
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
  "available_until": "2026-10-31T15:19:38.783568Z",
  "open": false,
  "tip": {
    "id": "efc63f58-040e-4b81-9e05-3c0cf49c22cf",
    "order_id": "bf6de3f3-63c5-4846-b48a-2da6500f7024",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-30T15:19:42.617023Z"
  }
}
```

`GET /api/rider/v1/orders/bf6de3f3-63c5-4846-b48a-2da6500f7024/tip` → **200**

```json
{
  "order_id": "bf6de3f3-63c5-4846-b48a-2da6500f7024",
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
  "available_until": "2026-10-31T15:19:38.783568Z",
  "open": false,
  "tip": {
    "id": "efc63f58-040e-4b81-9e05-3c0cf49c22cf",
    "order_id": "bf6de3f3-63c5-4846-b48a-2da6500f7024",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T15:19:42.617023Z"
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
      "id": "43836e6f-463e-4e2d-8b41-2442045cf960",
      "at": "2026-10-30T15:19:39.516198Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "bf6de3f3-63c5-4846-b48a-2da6500f7024",
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
      "id": "df526f3d-5926-44d5-8126-86ed90b9b27a",
      "at": "2026-10-30T15:19:44.581634Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "bf6de3f3-63c5-4846-b48a-2da6500f7024",
      "counterpart_id": null
    },
    {
      "id": "43836e6f-463e-4e2d-8b41-2442045cf960",
      "at": "2026-10-30T15:19:39.516198Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "bf6de3f3-63c5-4846-b48a-2da6500f7024",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "69b33e9a-461a-4996-8f1b-97fecbf433a9",
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
  "id": "fce8f2b2-a76c-449b-8078-a08d8a0b3abe",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:24:46.105004Z",
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
  "session_id": "989f9195-ef7b-4279-8e59-a5fc4b3b306e",
  "subject": {
    "type": "STAFF",
    "id": "04f20d10-faa2-4386-bfcf-0d466abe8fa8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNGYyMGQxMC1mYWEyLTQzODYtYmZjZi0wZDQ2NmFiZThmYTgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzQ0ODYsImlhdCI6MTc5MzM3MzU4NiwianRpIjoiNjM2MTdlYzgtOTExZS00YmQ3LTkxNzktYTU4YmRhODk1ZWE1Iiwic2lkIjoiOTg5ZjkxOTUtZWY3Yi00Mjc5LThlNTktYTVmYzRiM2IzMDZlIn0.RkXIBuHYuv4YYEKo8hEl0A9x8gpmDXE4SI3q0uE4qTQ",
  "access_expires_at": "2026-10-30T15:34:46.718419492Z",
  "refresh_token": "ExXLG0gyTlFq6vrtE_a2jdYGS6QeaATgqxAAHqzkk8c",
  "refresh_expires_at": "2026-10-31T03:19:46.717808315Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380739902148` → **200**

```json
{
  "client_id": "253ae975-18e5-4a69-9679-29445d21ba54"
}
```

`POST /api/admin/v1/rider-wallets/253ae975-18e5-4a69-9679-29445d21ba54/top-ups` → **201**

```json
{
  "command_id": "8836a8b1-3c17-440f-895a-5f2180fa55d6",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "253ae975-18e5-4a69-9679-29445d21ba54",
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
      "id": "95cd3da6-0baf-4424-8286-42b18eaa6c56",
      "at": "2026-10-30T15:19:47.288933Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "04f20d10-faa2-4386-bfcf-0d466abe8fa8",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "6de55e67-db5b-4f79-a7c2-d3ed816195c2",
  "quote_id": "fce8f2b2-a76c-449b-8078-a08d8a0b3abe",
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
  "id": "e0892c96-811f-4f57-b4e1-e82d38fce8fe",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "253ae975-18e5-4a69-9679-29445d21ba54",
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
  "created_at": "2026-10-30T15:19:47.599162Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e0892c96-811f-4f57-b4e1-e82d38fce8fe` → **200**

```json
{
  "id": "e0892c96-811f-4f57-b4e1-e82d38fce8fe",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "253ae975-18e5-4a69-9679-29445d21ba54",
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
  "created_at": "2026-10-30T15:19:47.599162Z",
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
    "id": "d4dbc000-8a0c-4d53-af6d-3792b69ad2de",
    "order_id": "e0892c96-811f-4f57-b4e1-e82d38fce8fe",
    "expires_at": "2026-10-30T15:20:02.603679Z",
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

`POST /api/driver/v1/offers/d4dbc000-8a0c-4d53-af6d-3792b69ad2de/accept` → **200**

```json
{
  "command_id": "60fc4cb7-2fe4-469f-9b69-e94de6674e0e"
}
```

```json
{
  "id": "c72d9fbf-59d4-4bf1-978c-72f64e0a2c68",
  "order_id": "e0892c96-811f-4f57-b4e1-e82d38fce8fe",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "08f54374-f5f7-4238-a908-4b5103964b92",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "08f54374-f5f7-4238-a908-4b5103964b92",
  "order_id": "e0892c96-811f-4f57-b4e1-e82d38fce8fe",
  "assignment_id": "c72d9fbf-59d4-4bf1-978c-72f64e0a2c68",
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

`POST /api/driver/v1/work-sessions/f93d68f2-2b06-4661-b4af-ffc30e31d1c3/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:19:49Z",
    "sequence": 1793373589123
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "f93d68f2-2b06-4661-b4af-ffc30e31d1c3",
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
  "last_heartbeat_at": "2026-10-30T15:19:49.143026Z",
  "last_location_at": "2026-10-30T15:19:49.143026Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/08f54374-f5f7-4238-a908-4b5103964b92/arrive` → **200**

```json
{
  "command_id": "e3732c95-8298-496b-9ffa-b563c7716ade",
  "expected_version": 0
}
```

```json
{
  "id": "08f54374-f5f7-4238-a908-4b5103964b92",
  "order_id": "e0892c96-811f-4f57-b4e1-e82d38fce8fe",
  "assignment_id": "c72d9fbf-59d4-4bf1-978c-72f64e0a2c68",
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
  "arrived_at": "2026-10-30T15:19:49.443034Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/08f54374-f5f7-4238-a908-4b5103964b92/start` → **200**

```json
{
  "command_id": "81b6f7fb-b983-40cb-a57c-e5a8e6c79898",
  "expected_version": 1
}
```

```json
{
  "id": "08f54374-f5f7-4238-a908-4b5103964b92",
  "order_id": "e0892c96-811f-4f57-b4e1-e82d38fce8fe",
  "assignment_id": "c72d9fbf-59d4-4bf1-978c-72f64e0a2c68",
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
  "arrived_at": "2026-10-30T15:19:49.443034Z",
  "started_at": "2026-10-30T15:19:49.749202Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/08f54374-f5f7-4238-a908-4b5103964b92/complete` → **200**

```json
{
  "command_id": "f95cc858-b3a0-474a-ba58-83bf843b9fd5",
  "expected_version": 2,
  "reported_at": "2026-10-30T15:19:50Z",
  "cash_received": true
}
```

```json
{
  "id": "08f54374-f5f7-4238-a908-4b5103964b92",
  "order_id": "e0892c96-811f-4f57-b4e1-e82d38fce8fe",
  "assignment_id": "c72d9fbf-59d4-4bf1-978c-72f64e0a2c68",
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
  "arrived_at": "2026-10-30T15:19:49.443034Z",
  "started_at": "2026-10-30T15:19:49.749202Z",
  "completed_at": "2026-10-30T15:19:50.060792Z",
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
  "client_id": "253ae975-18e5-4a69-9679-29445d21ba54",
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
      "id": "95cd3da6-0baf-4424-8286-42b18eaa6c56",
      "at": "2026-10-30T15:19:47.288933Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "04f20d10-faa2-4386-bfcf-0d466abe8fa8",
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

`GET /api/rider/v1/orders/e0892c96-811f-4f57-b4e1-e82d38fce8fe/tip` → **200**

```json
{
  "order_id": "e0892c96-811f-4f57-b4e1-e82d38fce8fe",
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
  "available_until": "2026-10-31T15:19:50.060792Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/e0892c96-811f-4f57-b4e1-e82d38fce8fe/tip` → **201**

```json
{
  "command_id": "74831815-c6cb-4cb7-ae5a-1a851709131d",
  "amount_minor": 2500
}
```

```json
{
  "id": "a2b13110-cf49-4c24-a821-70d20fbfdc99",
  "order_id": "e0892c96-811f-4f57-b4e1-e82d38fce8fe",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T15:19:51.279655Z"
}
```

`GET /api/rider/v1/orders/e0892c96-811f-4f57-b4e1-e82d38fce8fe/tip` → **200**

```json
{
  "order_id": "e0892c96-811f-4f57-b4e1-e82d38fce8fe",
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
  "available_until": "2026-10-31T15:19:50.060792Z",
  "open": false,
  "tip": {
    "id": "a2b13110-cf49-4c24-a821-70d20fbfdc99",
    "order_id": "e0892c96-811f-4f57-b4e1-e82d38fce8fe",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-30T15:19:51.279655Z"
  }
}
```

`GET /api/rider/v1/orders/e0892c96-811f-4f57-b4e1-e82d38fce8fe/tip` → **200**

```json
{
  "order_id": "e0892c96-811f-4f57-b4e1-e82d38fce8fe",
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
  "available_until": "2026-10-31T15:19:50.060792Z",
  "open": false,
  "tip": {
    "id": "a2b13110-cf49-4c24-a821-70d20fbfdc99",
    "order_id": "e0892c96-811f-4f57-b4e1-e82d38fce8fe",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T15:19:51.279655Z"
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
      "id": "aa79710f-aea9-4534-af75-6bdc7f4be116",
      "at": "2026-10-30T15:19:52.676063Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "e0892c96-811f-4f57-b4e1-e82d38fce8fe",
      "counterpart_id": null
    },
    {
      "id": "892ed4e4-fa90-4628-ae35-b5f16c44d332",
      "at": "2026-10-30T15:19:50.646671Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "e0892c96-811f-4f57-b4e1-e82d38fce8fe",
      "counterpart_id": null
    },
    {
      "id": "df526f3d-5926-44d5-8126-86ed90b9b27a",
      "at": "2026-10-30T15:19:44.581634Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "bf6de3f3-63c5-4846-b48a-2da6500f7024",
      "counterpart_id": null
    },
    {
      "id": "43836e6f-463e-4e2d-8b41-2442045cf960",
      "at": "2026-10-30T15:19:39.516198Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "bf6de3f3-63c5-4846-b48a-2da6500f7024",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "f93d68f2-2b06-4661-b4af-ffc30e31d1c3",
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
  "last_heartbeat_at": "2026-10-30T15:19:49.143026Z",
  "last_location_at": "2026-10-30T15:19:49.143026Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f93d68f2-2b06-4661-b4af-ffc30e31d1c3/close` → **200**

```json
{
  "command_id": "1be08d26-7156-44e0-83f6-4d44357b2f6e",
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

Done: card order e0892c96-811f-4f57-b4e1-e82d38fce8fe.

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
  "phone": "+380735535574",
  "device_ref": "sandbox-22740"
}
```

```json
{
  "challenge_id": "e9577284-3b92-4ee2-b064-df5e4c76f0a5",
  "expires_at": "2026-10-30T15:24:54.328362004Z",
  "resend_available_at": "2026-10-30T15:19:55.328362004Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380735535574` → **200**

```json
{
  "phone": "+380735535574",
  "audience": "CLIENT",
  "code": "115643",
  "sent_at": "2026-10-30T15:19:54.331057136Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e9577284-3b92-4ee2-b064-df5e4c76f0a5",
  "code": "115643",
  "device_ref": "sandbox-22740"
}
```

```json
{
  "session_id": "ad69515f-21d5-4b1a-8cc5-c50379617fa4",
  "subject": {
    "type": "CLIENT",
    "id": "6106a192-df83-40ee-af7f-12596635c1ec"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MTA2YTE5Mi1kZjgzLTQwZWUtYWY3Zi0xMjU5NjYzNWMxZWMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc0NDk0LCJpYXQiOjE3OTMzNzM1OTQsImp0aSI6IjVjY2E1ZjcyLTVlN2YtNDM5My1hNWM1LWUxMjc1OWM5ZDY0MyIsInNpZCI6ImFkNjk1MTVmLTIxZDUtNGIxYS04Y2M1LWM1MDM3OTYxN2ZhNCJ9.PxAteUDKXGScHx7M7TgPP4FhAKliwJC7oQMKc0xN1_0",
  "access_expires_at": "2026-10-30T15:34:54.64598022Z",
  "refresh_token": "VNTlnOWrHh2ozKKLKGHwiinEeA5ogow1S-cgSZF2s3Y",
  "refresh_expires_at": "2026-11-29T15:19:54.645390332Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "79d1d503-3fd3-42b5-a544-5d1127a57211",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "9450ad37-3d5b-4fdd-839e-e549b3d95363",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-9450ad37-3d5b-4fdd-839e-e549b3d95363",
    "orderDate": "1793373594",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "2726881a7ccf83485ac307223a5fe335",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=9450ad37-3d5b-4fdd-839e-e549b3d95363",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380735535574"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=9450ad37-3d5b-4fdd-839e-e549b3d95363",
  "created_at": "2026-10-30T15:19:54.936997Z",
  "expires_at": "2026-10-30T15:49:54.936997Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/9450ad37-3d5b-4fdd-839e-e549b3d95363` → **200**

```json
{
  "id": "9450ad37-3d5b-4fdd-839e-e549b3d95363",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T15:19:54.936997Z",
  "expires_at": "2026-10-30T15:49:54.936997Z",
  "completed_at": "2026-10-30T15:19:55.241605Z",
  "masked_pan": "41****6941",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "6106a192-df83-40ee-af7f-12596635c1ec",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "6106a192-df83-40ee-af7f-12596635c1ec",
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
      "id": "63c46167-da6d-445e-a053-3de7cf2905d0",
      "at": "2026-10-30T15:19:55.69336Z",
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
  "client_id": "6106a192-df83-40ee-af7f-12596635c1ec",
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
      "id": "63c46167-da6d-445e-a053-3de7cf2905d0",
      "at": "2026-10-30T15:19:55.69336Z",
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
  "device_ref": "sandbox-6171"
}
```

```json
{
  "challenge_id": "80e27c9e-d339-4a36-89a5-c08c63dc09d9",
  "expires_at": "2026-10-30T15:24:57.437603108Z",
  "resend_available_at": "2026-10-30T15:19:58.437603108Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "628279",
  "sent_at": "2026-10-30T15:19:57.440616304Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "80e27c9e-d339-4a36-89a5-c08c63dc09d9",
  "code": "628279",
  "device_ref": "sandbox-6171"
}
```

```json
{
  "session_id": "7ede9cdb-78b1-47b7-aa2c-bb8876d31691",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NDQ5NywiaWF0IjoxNzkzMzczNTk3LCJqdGkiOiI0YjcwNTc3OS1mYmNmLTRmNzUtYmI5ZS02YjY5OTQxZmM2YzgiLCJzaWQiOiI3ZWRlOWNkYi03OGIxLTQ3YjctYWEyYy1iYjg4NzZkMzE2OTEifQ.6eZUHfTZUpntVT9hbpV7pdYUN82nqbLrqJOTHz7l0is",
  "access_expires_at": "2026-10-30T15:34:57.756450252Z",
  "refresh_token": "UJi0z33hWCPaUWNM1UlqHBfYpezAUKQhD77DX3LMW5Q",
  "refresh_expires_at": "2026-11-29T15:19:57.75584692Z",
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
  "command_id": "c41f32b6-8771-4edb-a0b6-7c82800c3ccb",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "957c3159-0f98-4bbc-beee-157c52ea5e26",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-957c3159-0f98-4bbc-beee-157c52ea5e26",
    "orderDate": "1793373598",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "18d7153dad67dd3a408120ee7e13741d",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=957c3159-0f98-4bbc-beee-157c52ea5e26",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=957c3159-0f98-4bbc-beee-157c52ea5e26",
  "created_at": "2026-10-30T15:19:58.332625Z",
  "expires_at": "2026-10-30T15:49:58.332625Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/957c3159-0f98-4bbc-beee-157c52ea5e26` → **200**

```json
{
  "id": "957c3159-0f98-4bbc-beee-157c52ea5e26",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T15:19:58.332625Z",
  "expires_at": "2026-10-30T15:49:58.332625Z",
  "completed_at": "2026-10-30T15:19:58.622161Z",
  "masked_pan": "41****7531",
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
      "id": "569d9c79-3da3-40f5-bc96-288c190f27bc",
      "at": "2026-10-30T15:19:58.703114Z",
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
  "command_id": "f916f0ee-610a-4a96-b814-76f9e8bf2c04",
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
  "correlation_id": "82ee66cf-90e3-46eb-ac64-949b87f83bbd"
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
  "device_ref": "sandbox-25236"
}
```

```json
{
  "challenge_id": "a667ade1-63c9-4bec-ab23-1cb15f962336",
  "expires_at": "2026-10-30T15:24:59.513988821Z",
  "resend_available_at": "2026-10-30T15:20:00.513988821Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "283780",
  "sent_at": "2026-10-30T15:19:59.516643992Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a667ade1-63c9-4bec-ab23-1cb15f962336",
  "code": "283780",
  "device_ref": "sandbox-25236"
}
```

```json
{
  "session_id": "ec19bdb2-d9d7-4c4a-8bc1-32e36d37aad4",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NDQ5OSwiaWF0IjoxNzkzMzczNTk5LCJqdGkiOiI1MjNjODQwYS1hNzUyLTQzZjctODI2Mi05MTAyZDJjMTA4ZjQiLCJzaWQiOiJlYzE5YmRiMi1kOWQ3LTRjNGEtOGJjMS0zMmUzNmQzN2FhZDQifQ.RoEpq8OzhfxDIZ17sdQ43B2mfWs-uWtKzB06KRM_YuU",
  "access_expires_at": "2026-10-30T15:34:59.829581814Z",
  "refresh_token": "2-zUR-a1aP-Hu6mWWYn17psgoAyRIczThQqDSRd3Uvs",
  "refresh_expires_at": "2026-11-29T15:19:59.828983882Z",
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
  "command_id": "b9111e6e-9b18-4318-94f3-e5faddb81ae3",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:20:00Z",
    "sequence": 1793373600417
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8331aba3-928b-4ce2-9fd2-5090208b9d86",
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
  "last_heartbeat_at": "2026-10-30T15:20:00.436896Z",
  "last_location_at": "2026-10-30T15:20:00.436896Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A rider orders for cash

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635775619",
  "device_ref": "sandbox-5332"
}
```

```json
{
  "challenge_id": "80046b5b-ea0d-4094-b424-01b423f4b599",
  "expires_at": "2026-10-30T15:25:00.732043761Z",
  "resend_available_at": "2026-10-30T15:20:01.732043761Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380635775619` → **200**

```json
{
  "phone": "+380635775619",
  "audience": "CLIENT",
  "code": "568896",
  "sent_at": "2026-10-30T15:20:00.735127088Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "80046b5b-ea0d-4094-b424-01b423f4b599",
  "code": "568896",
  "device_ref": "sandbox-5332"
}
```

```json
{
  "session_id": "ddac872b-3a16-4a9d-97c8-f41a74a9d5d4",
  "subject": {
    "type": "CLIENT",
    "id": "344cb2e0-e8f2-4afa-a90f-e93b2ef0ab65"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzNDRjYjJlMC1lOGYyLTRhZmEtYTkwZi1lOTNiMmVmMGFiNjUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc0NTAxLCJpYXQiOjE3OTMzNzM2MDEsImp0aSI6IjNhNTk1YTA3LWNhNWEtNDZiZC1iNGJlLTYxZTBiMjg0NmNlMiIsInNpZCI6ImRkYWM4NzJiLTNhMTYtNGE5ZC05N2M4LWY0MWE3NGE5ZDVkNCJ9.36xjr9Tm433qziLpMN3N81ED52_YAys-drZ31WhLJOo",
  "access_expires_at": "2026-10-30T15:35:01.046796566Z",
  "refresh_token": "DMn2qOzVUigyNv6xiOKJc4XqEK7llAdXLbMhPFUkQCc",
  "refresh_expires_at": "2026-11-29T15:20:01.046087265Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f1fb0838-48c3-4832-a306-c0b701faa499",
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
  "id": "f8df1ab3-f5a2-4451-bd9e-b3a394e24d63",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:25:01.355643Z",
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
  "command_id": "7a8152bb-7e55-42d7-8031-a1004413404f",
  "quote_id": "f8df1ab3-f5a2-4451-bd9e-b3a394e24d63",
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
  "id": "f40e6456-e9f6-4469-a275-1b89f67f340f",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "344cb2e0-e8f2-4afa-a90f-e93b2ef0ab65",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T15:20:01.676656Z",
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
    "id": "f959c161-eccc-4db5-8622-deaa8e6288cf",
    "order_id": "f40e6456-e9f6-4469-a275-1b89f67f340f",
    "expires_at": "2026-10-30T15:20:16.67953Z",
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

`POST /api/driver/v1/offers/f959c161-eccc-4db5-8622-deaa8e6288cf/accept` → **200**

```json
{
  "command_id": "4b5686c3-120c-4612-ab16-536e74dc370d"
}
```

```json
{
  "id": "4b76d79e-4cb1-4a14-965c-1bd79c3f7f0a",
  "order_id": "f40e6456-e9f6-4469-a275-1b89f67f340f",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "783a7337-abec-449f-8426-201fad072f91",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "783a7337-abec-449f-8426-201fad072f91",
  "order_id": "f40e6456-e9f6-4469-a275-1b89f67f340f",
  "assignment_id": "4b76d79e-4cb1-4a14-965c-1bd79c3f7f0a",
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

`POST /api/driver/v1/work-sessions/8331aba3-928b-4ce2-9fd2-5090208b9d86/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:20:02Z",
    "sequence": 1793373602868
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8331aba3-928b-4ce2-9fd2-5090208b9d86",
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
  "last_heartbeat_at": "2026-10-30T15:20:02.88838Z",
  "last_location_at": "2026-10-30T15:20:02.88838Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/783a7337-abec-449f-8426-201fad072f91/arrive` → **200**

```json
{
  "command_id": "3479e5b3-2e62-4033-8de2-f91f20f06212",
  "expected_version": 0
}
```

```json
{
  "id": "783a7337-abec-449f-8426-201fad072f91",
  "order_id": "f40e6456-e9f6-4469-a275-1b89f67f340f",
  "assignment_id": "4b76d79e-4cb1-4a14-965c-1bd79c3f7f0a",
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
  "arrived_at": "2026-10-30T15:20:03.188205Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/783a7337-abec-449f-8426-201fad072f91/start` → **200**

```json
{
  "command_id": "3679bda5-70c1-4631-b0ce-b9ec2f093166",
  "expected_version": 1
}
```

```json
{
  "id": "783a7337-abec-449f-8426-201fad072f91",
  "order_id": "f40e6456-e9f6-4469-a275-1b89f67f340f",
  "assignment_id": "4b76d79e-4cb1-4a14-965c-1bd79c3f7f0a",
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
  "arrived_at": "2026-10-30T15:20:03.188205Z",
  "started_at": "2026-10-30T15:20:03.493678Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/783a7337-abec-449f-8426-201fad072f91/complete` → **200**

```json
{
  "command_id": "f8d38f50-e720-4d4a-a14a-9ee68b1e2aa4",
  "expected_version": 2,
  "reported_at": "2026-10-30T15:20:03Z",
  "cash_received": false
}
```

```json
{
  "id": "783a7337-abec-449f-8426-201fad072f91",
  "order_id": "f40e6456-e9f6-4469-a275-1b89f67f340f",
  "assignment_id": "4b76d79e-4cb1-4a14-965c-1bd79c3f7f0a",
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
  "arrived_at": "2026-10-30T15:20:03.188205Z",
  "started_at": "2026-10-30T15:20:03.493678Z",
  "completed_at": "2026-10-30T15:20:03.80722Z",
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
  "session_id": "6722d63b-5e7d-450a-99ae-1ecdf2aeb69a",
  "subject": {
    "type": "STAFF",
    "id": "04f20d10-faa2-4386-bfcf-0d466abe8fa8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNGYyMGQxMC1mYWEyLTQzODYtYmZjZi0wZDQ2NmFiZThmYTgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzQ1MDQsImlhdCI6MTc5MzM3MzYwNCwianRpIjoiYmQ2ZjkwYWYtOTkxOC00MTcxLTg2NmEtYzY1NTRmODk5MzdjIiwic2lkIjoiNjcyMmQ2M2ItNWU3ZC00NTBhLTk5YWUtMWVjZGYyYWViNjlhIn0.1tSJlMLWsPcEjxz00dxNSvzxOd8hywcl3SVW6_Q57HU",
  "access_expires_at": "2026-10-30T15:35:04.414186111Z",
  "refresh_token": "Syv-XRa-2bFAtOxNKq-JdjNftejHFjgT8lSeXCabZEI",
  "refresh_expires_at": "2026-10-31T03:20:04.41352476Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/f40e6456-e9f6-4469-a275-1b89f67f340f/cash-dispute` → **404**

```json
{
  "instance": "/api/admin/v1/orders/f40e6456-e9f6-4469-a275-1b89f67f340f/cash-dispute",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "3f919dd4-efe1-4a53-b210-8150934bd3e3"
}
```

`GET /api/admin/v1/orders/f40e6456-e9f6-4469-a275-1b89f67f340f/cash-dispute` → **200**

```json
{
  "order_id": "f40e6456-e9f6-4469-a275-1b89f67f340f",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "344cb2e0-e8f2-4afa-a90f-e93b2ef0ab65",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T15:20:04.759265Z",
  "decide_by": "2026-11-13T15:20:04.759265Z",
  "decision": null,
  "decided_by": null,
  "reason": null,
  "decided_at": null,
  "version": 1
}
```

Dispute: {"held_minor":0,"rider_debt_minor":10517,"decide_by":"2026-11-13T15:20:04.759265Z","decision":null}

`GET /api/admin/v1/cash-disputes` → **200**

```json
{
  "disputes": [
    {
      "order_id": "f40e6456-e9f6-4469-a275-1b89f67f340f",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "payer_client_id": "344cb2e0-e8f2-4afa-a90f-e93b2ef0ab65",
      "currency": "UAH",
      "held_minor": 0,
      "rider_debt_minor": 10517,
      "opened_at": "2026-10-30T15:20:04.759265Z",
      "decide_by": "2026-11-13T15:20:04.759265Z",
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

`POST /api/admin/v1/orders/f40e6456-e9f6-4469-a275-1b89f67f340f/cash-dispute/decide` → **400**

```json
{
  "command_id": "4ac5722e-1337-4a36-af3b-8983078cc828",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/orders/f40e6456-e9f6-4469-a275-1b89f67f340f/cash-dispute/decide",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "d032f5e8-d1ab-4e20-bf5d-3f8fc29d7cfd",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/orders/f40e6456-e9f6-4469-a275-1b89f67f340f/cash-dispute/decide` → **200**

```json
{
  "command_id": "88d74e1b-f7e6-40ad-afd8-03c1ca00e0e9",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": "The rider does not answer calls"
}
```

```json
{
  "order_id": "f40e6456-e9f6-4469-a275-1b89f67f340f",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "344cb2e0-e8f2-4afa-a90f-e93b2ef0ab65",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T15:20:04.759265Z",
  "decide_by": "2026-11-13T15:20:04.759265Z",
  "decision": "PAY_DRIVER",
  "decided_by": "04f20d10-faa2-4386-bfcf-0d466abe8fa8",
  "reason": "The rider does not answer calls",
  "decided_at": "2026-10-30T15:20:06.933276Z",
  "version": 2
}
```

`POST /api/admin/v1/orders/f40e6456-e9f6-4469-a275-1b89f67f340f/cash-dispute/decide` → **409**

```json
{
  "command_id": "71338103-8656-4603-b21d-3738927c6dfd",
  "expected_version": 2,
  "decision": "RIDER_PAID",
  "reason": "Again"
}
```

```json
{
  "instance": "/api/admin/v1/orders/f40e6456-e9f6-4469-a275-1b89f67f340f/cash-dispute/decide",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "5972cc78-9ce1-4595-bb6e-80a35fbca0b9"
}
```

Done: an unpaid cash trip became a dispute and was decided once.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8331aba3-928b-4ce2-9fd2-5090208b9d86",
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
  "last_heartbeat_at": "2026-10-30T15:20:02.88838Z",
  "last_location_at": "2026-10-30T15:20:02.88838Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8331aba3-928b-4ce2-9fd2-5090208b9d86/close` → **200**

```json
{
  "command_id": "e137ec2c-cd11-45f1-9ce8-56abd9278410",
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
  "phone": "+380737326651",
  "device_ref": "sandbox-12572"
}
```

```json
{
  "challenge_id": "7631d334-8faf-423c-b90e-1a613673c819",
  "expires_at": "2026-10-30T15:25:08.147561841Z",
  "resend_available_at": "2026-10-30T15:20:09.147561841Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380737326651` → **200**

```json
{
  "phone": "+380737326651",
  "audience": "CLIENT",
  "code": "058579",
  "sent_at": "2026-10-30T15:20:08.150904273Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7631d334-8faf-423c-b90e-1a613673c819",
  "code": "058579",
  "device_ref": "sandbox-12572"
}
```

```json
{
  "session_id": "9d843956-3e9b-438a-a3a4-3135aca2275c",
  "subject": {
    "type": "CLIENT",
    "id": "f20dcf51-27da-43e5-9f14-e18d42ea242c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmMjBkY2Y1MS0yN2RhLTQzZTUtOWYxNC1lMThkNDJlYTI0MmMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc0NTA4LCJpYXQiOjE3OTMzNzM2MDgsImp0aSI6ImY4ZDllMGVjLWY5ODUtNDFhYS1iOTI2LTliNTg2ZTJhMDk0NyIsInNpZCI6IjlkODQzOTU2LTNlOWItNDM4YS1hM2E0LTMxMzVhY2EyMjc1YyJ9.rNLWgleakMco0NJbuUpZUEqg4lBErL_YIKIuxSicFWo",
  "access_expires_at": "2026-10-30T15:35:08.466112372Z",
  "refresh_token": "nnvJga9ELQ9Zz0pS_7nm3-yqU-6MOoXI7Dc5_I99FLU",
  "refresh_expires_at": "2026-11-29T15:20:08.46547332Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "2af4120b-4c54-4e66-86f9-fda9662a8cc0",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "4f6e4adf-d3e8-4e82-8ca1-0a5a9a48aab5",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-4f6e4adf-d3e8-4e82-8ca1-0a5a9a48aab5",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "351220a6b0e8a3c0fe18187a137bec0e",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=4f6e4adf-d3e8-4e82-8ca1-0a5a9a48aab5",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380737326651"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=4f6e4adf-d3e8-4e82-8ca1-0a5a9a48aab5",
  "expires_at": "2026-10-30T15:50:08.753522Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/4f6e4adf-d3e8-4e82-8ca1-0a5a9a48aab5` → **200**

```json
{
  "id": "4f6e4adf-d3e8-4e82-8ca1-0a5a9a48aab5",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T15:50:08.753522Z",
  "card": {
    "id": "3920d5f2-feb0-4ee2-9772-61574b051c5e",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****1031",
    "card_type": "Visa",
    "created_at": "2026-10-30T15:20:09.041381Z"
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
  "device_ref": "sandbox-32183"
}
```

```json
{
  "challenge_id": "c744f545-33a7-4ad5-82e8-8765565be896",
  "expires_at": "2026-10-30T15:25:09.353234199Z",
  "resend_available_at": "2026-10-30T15:20:10.353234199Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "290735",
  "sent_at": "2026-10-30T15:20:09.355959373Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c744f545-33a7-4ad5-82e8-8765565be896",
  "code": "290735",
  "device_ref": "sandbox-32183"
}
```

```json
{
  "session_id": "cb248057-c721-4a49-9e08-178c8d718d10",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NDUwOSwiaWF0IjoxNzkzMzczNjA5LCJqdGkiOiI5MzUyYzUwYy02NGQ1LTRkNTAtYWY0ZS00M2U0YTI0Y2JlZWIiLCJzaWQiOiJjYjI0ODA1Ny1jNzIxLTRhNDktOWUwOC0xNzhjOGQ3MThkMTAifQ._slwb4RXlQKr1w0qdyylUO3gfSknFqQR73anva_V7Xc",
  "access_expires_at": "2026-10-30T15:35:09.675616591Z",
  "refresh_token": "xhJmhp73bP-Z0VstRQQ0Mi3Z2EgmaILrYIkD7nwBc-E",
  "refresh_expires_at": "2026-11-29T15:20:09.675017805Z",
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
  "command_id": "07a1460b-bfa4-4df0-b6f6-cce6aeeb9220",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:20:10Z",
    "sequence": 1793373610344
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "55874f60-404b-43a4-8a4b-b6cbf469d10d",
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
  "last_heartbeat_at": "2026-10-30T15:20:10.3644Z",
  "last_location_at": "2026-10-30T15:20:10.3644Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A card ride; on the way both write numbers into the chat

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d20c237a-c8a5-44a8-b678-2648e5090f32",
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
  "id": "d87dc159-ff14-4398-bf48-552b2907ab07",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:25:10.689205Z",
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

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "ce447f3e-0a3b-4f42-ba41-b965681f111d",
  "quote_id": "d87dc159-ff14-4398-bf48-552b2907ab07",
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
  "id": "49857782-8437-4a05-8823-2f425483b651",
  "short_number": 10,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "f20dcf51-27da-43e5-9f14-e18d42ea242c",
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
  "created_at": "2026-10-30T15:20:11.068493Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/49857782-8437-4a05-8823-2f425483b651` → **200**

```json
{
  "id": "49857782-8437-4a05-8823-2f425483b651",
  "short_number": 10,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "f20dcf51-27da-43e5-9f14-e18d42ea242c",
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
  "created_at": "2026-10-30T15:20:11.068493Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/49857782-8437-4a05-8823-2f425483b651` → **200**

```json
{
  "id": "49857782-8437-4a05-8823-2f425483b651",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "f20dcf51-27da-43e5-9f14-e18d42ea242c",
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
  "created_at": "2026-10-30T15:20:11.068493Z",
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
    "id": "e771251c-91f2-462c-a45e-2f9fc93cd764",
    "order_id": "49857782-8437-4a05-8823-2f425483b651",
    "expires_at": "2026-10-30T15:20:26.807985Z",
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

`POST /api/driver/v1/offers/e771251c-91f2-462c-a45e-2f9fc93cd764/accept` → **200**

```json
{
  "command_id": "a1bbb636-69ce-4435-bcae-737a5d9a5ea2"
}
```

```json
{
  "id": "5cd2712c-2b9f-46c6-a117-5b49f7d9da73",
  "order_id": "49857782-8437-4a05-8823-2f425483b651",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "3c92fac3-646e-4d53-a2a2-5b67b84795dc",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "3c92fac3-646e-4d53-a2a2-5b67b84795dc",
  "order_id": "49857782-8437-4a05-8823-2f425483b651",
  "assignment_id": "5cd2712c-2b9f-46c6-a117-5b49f7d9da73",
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

`POST /api/rider/v1/orders/49857782-8437-4a05-8823-2f425483b651/messages` → **201**

```json
{
  "command_id": "3ba18141-16c6-4d31-a1dd-d6e3a2f5b0b6",
  "body": "Я біля входу, мій номер +380737326651, картка 4111 1111 1111 1111"
}
```

```json
{
  "id": "9e38f9b5-df76-49f8-83a3-86218cdf71c5",
  "order_id": "49857782-8437-4a05-8823-2f425483b651",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу, мій номер +380737326651, картка 4111 1111 1111 1111",
  "sent_at": "2026-10-30T15:20:13.873178818Z"
}
```

`POST /api/driver/v1/trips/3c92fac3-646e-4d53-a2a2-5b67b84795dc/messages` → **201**

```json
{
  "command_id": "6c6b60a2-683a-4d1c-9152-6865890a66c6",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03"
}
```

```json
{
  "id": "4f9e2030-1f02-40ff-8102-64a41d26d98e",
  "order_id": "49857782-8437-4a05-8823-2f425483b651",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03",
  "sent_at": "2026-10-30T15:20:14.164825855Z"
}
```

(the car drives 5 s to the next point)

`POST /api/driver/v1/work-sessions/55874f60-404b-43a4-8a4b-b6cbf469d10d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:20:19Z",
    "sequence": 1793373619478
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "55874f60-404b-43a4-8a4b-b6cbf469d10d",
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
  "last_heartbeat_at": "2026-10-30T15:20:19.498014Z",
  "last_location_at": "2026-10-30T15:20:19.498014Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/3c92fac3-646e-4d53-a2a2-5b67b84795dc/arrive` → **200**

```json
{
  "command_id": "f3849d08-562a-4e8c-8a82-e9e4cfa20253",
  "expected_version": 0
}
```

```json
{
  "id": "3c92fac3-646e-4d53-a2a2-5b67b84795dc",
  "order_id": "49857782-8437-4a05-8823-2f425483b651",
  "assignment_id": "5cd2712c-2b9f-46c6-a117-5b49f7d9da73",
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
  "arrived_at": "2026-10-30T15:20:19.800521Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/3c92fac3-646e-4d53-a2a2-5b67b84795dc/start` → **200**

```json
{
  "command_id": "a3e569f5-7353-4981-9def-6ac826fa0225",
  "expected_version": 1
}
```

```json
{
  "id": "3c92fac3-646e-4d53-a2a2-5b67b84795dc",
  "order_id": "49857782-8437-4a05-8823-2f425483b651",
  "assignment_id": "5cd2712c-2b9f-46c6-a117-5b49f7d9da73",
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
  "arrived_at": "2026-10-30T15:20:19.800521Z",
  "started_at": "2026-10-30T15:20:20.103663Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

(the car drives 90 s to the next point)

`POST /api/driver/v1/work-sessions/55874f60-404b-43a4-8a4b-b6cbf469d10d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4584,
    "lon": 30.4300,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:21:50Z",
    "sequence": 1793373710429
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "55874f60-404b-43a4-8a4b-b6cbf469d10d",
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
  "last_heartbeat_at": "2026-10-30T15:21:50.449718Z",
  "last_location_at": "2026-10-30T15:21:50.449718Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/3c92fac3-646e-4d53-a2a2-5b67b84795dc/complete` → **200**

```json
{
  "command_id": "1d2837dc-1028-47a9-a563-9cd24e59f7d4",
  "expected_version": 2,
  "reported_at": "2026-10-30T15:21:50Z",
  "cash_received": false
}
```

```json
{
  "id": "3c92fac3-646e-4d53-a2a2-5b67b84795dc",
  "order_id": "49857782-8437-4a05-8823-2f425483b651",
  "assignment_id": "5cd2712c-2b9f-46c6-a117-5b49f7d9da73",
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
  "arrived_at": "2026-10-30T15:20:19.800521Z",
  "started_at": "2026-10-30T15:20:20.103663Z",
  "completed_at": "2026-10-30T15:21:50.752923Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/rider/v1/orders/49857782-8437-4a05-8823-2f425483b651` → **200**

```json
{
  "id": "49857782-8437-4a05-8823-2f425483b651",
  "short_number": 10,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "f20dcf51-27da-43e5-9f14-e18d42ea242c",
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
    "id": "5cd2712c-2b9f-46c6-a117-5b49f7d9da73",
    "order_id": "49857782-8437-4a05-8823-2f425483b651",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "3c92fac3-646e-4d53-a2a2-5b67b84795dc",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T15:20:11.068493Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/49857782-8437-4a05-8823-2f425483b651` → **200**

```json
{
  "id": "49857782-8437-4a05-8823-2f425483b651",
  "short_number": 10,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "f20dcf51-27da-43e5-9f14-e18d42ea242c",
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
    "id": "5cd2712c-2b9f-46c6-a117-5b49f7d9da73",
    "order_id": "49857782-8437-4a05-8823-2f425483b651",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "3c92fac3-646e-4d53-a2a2-5b67b84795dc",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T15:20:11.068493Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/49857782-8437-4a05-8823-2f425483b651` → **200**

```json
{
  "id": "49857782-8437-4a05-8823-2f425483b651",
  "short_number": 10,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "f20dcf51-27da-43e5-9f14-e18d42ea242c",
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
    "id": "5cd2712c-2b9f-46c6-a117-5b49f7d9da73",
    "order_id": "49857782-8437-4a05-8823-2f425483b651",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "3c92fac3-646e-4d53-a2a2-5b67b84795dc",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T15:20:11.068493Z",
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
  "session_id": "55874f60-404b-43a4-8a4b-b6cbf469d10d",
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
  "last_heartbeat_at": "2026-10-30T15:21:50.449718Z",
  "last_location_at": "2026-10-30T15:21:50.449718Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/55874f60-404b-43a4-8a4b-b6cbf469d10d/close` → **200**

```json
{
  "command_id": "07d1fab9-171c-46b4-8558-7e5145b895dc",
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
  "session_id": "93c31f3f-eef7-4282-9a24-49a4958334e5",
  "subject": {
    "type": "STAFF",
    "id": "04f20d10-faa2-4386-bfcf-0d466abe8fa8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNGYyMGQxMC1mYWEyLTQzODYtYmZjZi0wZDQ2NmFiZThmYTgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzQ2MTQsImlhdCI6MTc5MzM3MzcxNCwianRpIjoiMGMyMjY1N2YtZDgyYi00MmU3LTljY2UtODFhN2ViMTI0MDZjIiwic2lkIjoiOTNjMzFmM2YtZWVmNy00MjgyLTlhMjQtNDlhNDk1ODMzNGU1In0.p0LdtezLCUs4OZqZtZDPglj1Jm7lVrBUHcrop3HdVPc",
  "access_expires_at": "2026-10-30T15:36:54.849355471Z",
  "refresh_token": "01tB-PXx3ZnK7OJKxmgzk68t3bVlNqAfx6MS2nR6mLI",
  "refresh_expires_at": "2026-10-31T03:21:54.848741769Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/49857782-8437-4a05-8823-2f425483b651/evidence` → **400**

```json
{
  "instance": "/api/admin/v1/orders/49857782-8437-4a05-8823-2f425483b651/evidence",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "9b0549d7-b34e-423b-85a8-01054d91f4d0"
}
```

`GET /api/admin/v1/orders/49857782-8437-4a05-8823-2f425483b651/evidence?reason=Bank%20request%20sandbox` → **200**

```json
{
  "generated_at": "2026-10-30T15:21:55.424148829Z",
  "order": {
    "id": "49857782-8437-4a05-8823-2f425483b651",
    "short_number": 10,
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
    "created_at": "2026-10-30T15:20:11.068493Z",
    "assigned_at": "2026-10-30T15:20:13.288298Z",
    "arrived_at": "2026-10-30T15:20:19.800521Z",
    "started_at": "2026-10-30T15:20:20.103663Z",
    "completed_at": "2026-10-30T15:21:50.752923Z"
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
    "id": "f20dcf51-27da-43e5-9f14-e18d42ea242c",
    "registered_at": "2026-10-30T15:20:08.463692Z",
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
      "created_at": "2026-10-30T15:20:11.071125Z"
    },
    {
      "type": "SETTLE",
      "state": "SUCCEEDED",
      "amount_minor": 16297,
      "currency": "UAH",
      "provider_status": "Approved",
      "created_at": "2026-10-30T15:21:51.01762Z"
    }
  ],
  "chat": [
    {
```

## Finance records the chargeback: the rider owes the fare again, a case opens

`POST /api/admin/v1/orders/49857782-8437-4a05-8823-2f425483b651/chargebacks` → **422**

```json
{
  "command_id": "fe56cd79-a27e-4641-ba80-adeb26336c43",
  "amount_minor": 16298,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "instance": "/api/admin/v1/orders/49857782-8437-4a05-8823-2f425483b651/chargebacks",
  "status": 422,
  "title": "Chargeback not allowed",
  "type": "https://errors.blizz.taxi/chargeback-not-allowed",
  "code": "CHARGEBACK_NOT_ALLOWED",
  "correlation_id": "8dd513dd-1d22-4de9-bd8f-ee82723722ee"
}
```

`POST /api/admin/v1/orders/49857782-8437-4a05-8823-2f425483b651/chargebacks` → **201**

```json
{
  "command_id": "d0b0fae3-0a13-407b-aa03-b427b54097d7",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "id": "64db1b8f-d3de-4d22-927e-14ce12f5358c",
  "order_id": "49857782-8437-4a05-8823-2f425483b651",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-30T15:21:56.09461Z",
  "resolved_at": null,
  "version": 0
}
```

`POST /api/admin/v1/orders/49857782-8437-4a05-8823-2f425483b651/chargebacks` → **201**

```json
{
  "command_id": "d0b0fae3-0a13-407b-aa03-b427b54097d7",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "id": "64db1b8f-d3de-4d22-927e-14ce12f5358c",
  "order_id": "49857782-8437-4a05-8823-2f425483b651",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-30T15:21:56.09461Z",
  "resolved_at": null,
  "version": 0
}
```

`GET /api/admin/v1/clients/f20dcf51-27da-43e5-9f14-e18d42ea242c` → **200**

```json
{
  "client": {
    "id": "f20dcf51-27da-43e5-9f14-e18d42ea242c",
    "phone": "+380737326651",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T15:20:08.463692Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "49857782-8437-4a05-8823-2f425483b651",
      "short_number": 10,
      "status": "FULFILLED",
      "created_at": "2026-10-30T15:20:11.068493Z",
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

`GET /api/admin/v1/clients/f20dcf51-27da-43e5-9f14-e18d42ea242c` → **200**

```json
{
  "client": {
    "id": "f20dcf51-27da-43e5-9f14-e18d42ea242c",
    "phone": "+380737326651",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T15:20:08.463692Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "49857782-8437-4a05-8823-2f425483b651",
      "short_number": 10,
      "status": "FULFILLED",
      "created_at": "2026-10-30T15:20:11.068493Z",
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

`POST /api/admin/v1/orders/49857782-8437-4a05-8823-2f425483b651/chargebacks/64db1b8f-d3de-4d22-927e-14ce12f5358c/resolve` → **200**

```json
{
  "command_id": "5e3c25c0-65d9-4627-924b-71ae1e9a6a60",
  "expected_version": 0,
  "outcome": "WON",
  "reason": "Evidence accepted"
}
```

```json
{
  "id": "64db1b8f-d3de-4d22-927e-14ce12f5358c",
  "order_id": "49857782-8437-4a05-8823-2f425483b651",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "WON",
  "resolution_reason": "Evidence accepted",
  "created_at": "2026-10-30T15:21:56.09461Z",
  "resolved_at": "2026-10-30T15:21:58.381635Z",
  "version": 1
}
```

`GET /api/admin/v1/clients/f20dcf51-27da-43e5-9f14-e18d42ea242c` → **200**

```json
{
  "client": {
    "id": "f20dcf51-27da-43e5-9f14-e18d42ea242c",
    "phone": "+380737326651",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T15:20:08.463692Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "49857782-8437-4a05-8823-2f425483b651",
      "short_number": 10,
      "status": "FULFILLED",
      "created_at": "2026-10-30T15:20:11.068493Z",
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

`GET /api/admin/v1/clients/f20dcf51-27da-43e5-9f14-e18d42ea242c` → **200**

```json
{
  "client": {
    "id": "f20dcf51-27da-43e5-9f14-e18d42ea242c",
    "phone": "+380737326651",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T15:20:08.463692Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "49857782-8437-4a05-8823-2f425483b651",
      "short_number": 10,
      "status": "FULFILLED",
      "created_at": "2026-10-30T15:20:11.068493Z",
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

`POST /api/admin/v1/orders/49857782-8437-4a05-8823-2f425483b651/chargebacks/64db1b8f-d3de-4d22-927e-14ce12f5358c/resolve` → **409**

```json
{
  "command_id": "1123ad28-c40c-4057-8a5a-20e6de1e2255",
  "expected_version": 1,
  "outcome": "LOST",
  "reason": "Twice"
}
```

```json
{
  "instance": "/api/admin/v1/orders/49857782-8437-4a05-8823-2f425483b651/chargebacks/64db1b8f-d3de-4d22-927e-14ce12f5358c/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "c8144b45-ff7a-40dc-b5ce-bae3cd32f3c7"
}
```

`GET /api/admin/v1/orders/49857782-8437-4a05-8823-2f425483b651/chargebacks` → **200**

```json
{
  "chargebacks": [
    {
      "id": "64db1b8f-d3de-4d22-927e-14ce12f5358c",
      "order_id": "49857782-8437-4a05-8823-2f425483b651",
      "amount_minor": 16297,
      "currency": "UAH",
      "bank_reason": "4837 No cardholder authorization",
      "received_on": "2026-10-29",
      "state": "WON",
      "resolution_reason": "Evidence accepted",
      "created_at": "2026-10-30T15:21:56.09461Z",
      "resolved_at": "2026-10-30T15:21:58.381635Z",
      "version": 1
    }
  ]
}
```

Done: the evidence of card order 49857782-8437-4a05-8823-2f425483b651 without phone or card digits; chargeback 64db1b8f-d3de-4d22-927e-14ce12f5358c recorded and won.

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
  "session_id": "0c62dde8-b244-4490-b248-0ca71ebb42bf",
  "subject": {
    "type": "STAFF",
    "id": "04f20d10-faa2-4386-bfcf-0d466abe8fa8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNGYyMGQxMC1mYWEyLTQzODYtYmZjZi0wZDQ2NmFiZThmYTgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzQ2MjEsImlhdCI6MTc5MzM3MzcyMSwianRpIjoiYWM0MzQ5YmMtODhmMS00NjllLWE2ODEtYjE0NDg0MmNhNWUyIiwic2lkIjoiMGM2MmRkZTgtYjI0NC00NDkwLWIyNDgtMGNhNzFlYmI0MmJmIn0.ttt4SiYz5qtLtJWjXaY8vM8Rd--JVvqE0RaaPHrBi1Y",
  "access_expires_at": "2026-10-30T15:37:01.511709406Z",
  "refresh_token": "r4ULRYTAEUjvWXNq7ApifFmYhtI7HiIBs2ainnyXGOw",
  "refresh_expires_at": "2026-10-31T03:22:01.511150947Z",
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
  "phone": "+48600166399",
  "device_ref": "sandbox-1817"
}
```

```json
{
  "challenge_id": "830d7f1e-c912-499a-8178-e48b141d86ec",
  "expires_at": "2026-10-30T15:27:02.392332423Z",
  "resend_available_at": "2026-10-30T15:22:03.392332423Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600166399` → **200**

```json
{
  "phone": "+48600166399",
  "audience": "CLIENT",
  "code": "120202",
  "sent_at": "2026-10-30T15:22:02.395233085Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "830d7f1e-c912-499a-8178-e48b141d86ec",
  "code": "120202",
  "device_ref": "sandbox-1817"
}
```

```json
{
  "session_id": "602e39fd-5f1c-4b2f-865e-dcb30913cac5",
  "subject": {
    "type": "CLIENT",
    "id": "5ed37614-af02-4f02-bd53-bbda8f4b5b3b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZWQzNzYxNC1hZjAyLTRmMDItYmQ1My1iYmRhOGY0YjViM2IiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc0NjIyLCJpYXQiOjE3OTMzNzM3MjIsImp0aSI6Ijk2OTJiZDZlLTA1N2UtNGU1ZS1hOTUxLWI1YjAxZDc4YjkwYSIsInNpZCI6IjYwMmUzOWZkLTVmMWMtNGIyZi04NjVlLWRjYjMwOTEzY2FjNSJ9.wpODXcfAYoBReLPI2FciFU7qciuXL4OfvjzR3_eDcUQ",
  "access_expires_at": "2026-10-30T15:37:02.709583012Z",
  "refresh_token": "RrjxqX7fJcDJdPnHYe3C0IY2hdZqGFb7RvrjWJYT5OA",
  "refresh_expires_at": "2026-11-29T15:22:02.709021869Z",
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
  "command_id": "c6e83822-bcd6-4c19-8d32-86d076064936",
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
  "correlation_id": "23840d0e-97b8-4d8b-b86c-b14d0bb50576",
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
  "command_id": "33e718cd-8280-4c2a-b713-0964db240700",
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
  "paused_at": "2026-10-30T15:22:03.892052925Z",
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
  "command_id": "99464abd-7928-4b20-a29a-fdc1b3c2ee70",
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
  "id": "43e07613-ff24-4c30-b420-39542026ae14",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:27:04.505497Z",
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
  "command_id": "53c41be5-a908-4d67-b9de-014056ee9166",
  "quote_id": "43e07613-ff24-4c30-b420-39542026ae14",
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
  "correlation_id": "33661684-c1e3-4f27-96cc-9efe72a6e568"
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
  "paused_at": "2026-10-30T15:22:03.892053Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "2c21f4cb-0577-4d8f-95ff-158386270653",
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
  "command_id": "34cae9b0-d649-4afb-ac65-4986b0399dd5",
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
  "command_id": "ae6ffeb9-f22a-4d04-8498-8082589a0ddc",
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
  "id": "dbfc2b0b-d6fe-4ec5-9249-07b6131a4c62",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:27:06.278627Z",
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
  "command_id": "67a2bae8-b0f0-4465-833c-4224767b641b",
  "quote_id": "dbfc2b0b-d6fe-4ec5-9249-07b6131a4c62",
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
  "correlation_id": "eed7f833-316e-40dc-b655-cfe9ab9cc9d6"
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
  "command_id": "64870631-13a4-41e3-a5ec-57b1b47fff42",
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
  "command_id": "ef7c3d21-c657-4d8d-a9b4-c7c81bbf02d0",
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
  "id": "46087b84-0a8c-40d7-9bf6-231d15c55868",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:27:07.464824Z",
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
  "command_id": "c4687d76-5ed5-48d0-a6c9-4a806409a324",
  "quote_id": "46087b84-0a8c-40d7-9bf6-231d15c55868",
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
  "correlation_id": "0b565abc-cb1d-480b-bd63-697ec099ff35"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "8e8eb88f-6e23-4b86-bc89-3e278548d464",
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
  "correlation_id": "1be2086d-a907-4cc7-a1ce-cc738af3121d",
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
  "command_id": "d9981c1c-69d1-42e6-b902-85595e6e0e85",
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
  "phone": "+380670589497",
  "device_ref": "sandbox-31333"
}
```

```json
{
  "challenge_id": "377cdfaf-f69f-44fd-bd09-acece46ecd19",
  "expires_at": "2026-10-30T15:27:08.995913615Z",
  "resend_available_at": "2026-10-30T15:22:09.995913615Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380670589497` → **200**

```json
{
  "phone": "+380670589497",
  "audience": "CLIENT",
  "code": "826495",
  "sent_at": "2026-10-30T15:22:08.99855889Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "377cdfaf-f69f-44fd-bd09-acece46ecd19",
  "code": "826495",
  "device_ref": "sandbox-31333"
}
```

```json
{
  "session_id": "cb8d67ac-b7b5-477a-abbe-c8871e505e26",
  "subject": {
    "type": "CLIENT",
    "id": "1230fb8a-333d-4b7a-889b-6fdb4bdf98ef"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMjMwZmI4YS0zMzNkLTRiN2EtODg5Yi02ZmRiNGJkZjk4ZWYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc0NjI5LCJpYXQiOjE3OTMzNzM3MjksImp0aSI6IjYwZWU1YmI3LTY2ZmUtNDllYS04OTM3LWE4N2IwNTk1MmU4ZSIsInNpZCI6ImNiOGQ2N2FjLWI3YjUtNDc3YS1hYmJlLWM4ODcxZTUwNWUyNiJ9.2VyaorVOrxyCKBmsWOCH0stsw3xXG8ATH_TcpDugzWo",
  "access_expires_at": "2026-10-30T15:37:09.314267302Z",
  "refresh_token": "BQLgs8GHW2xK-aaBbywGO6rZEDb9WAMVbNS9rw0EDso",
  "refresh_expires_at": "2026-11-29T15:22:09.313666605Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "1230fb8a-333d-4b7a-889b-6fdb4bdf98ef",
  "session_id": "cb8d67ac-b7b5-477a-abbe-c8871e505e26",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "71f1b215-0b37-4a9c-836c-581580200b98",
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
  "id": "e35bb0c8-1b0b-444f-8b9d-567ca5d5f5fc",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:27:09.904670Z",
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
  "challenge_id": "4f3b24c0-a54d-4005-9110-282f086fbcd9",
  "expires_at": "2026-10-30T15:27:12.237197452Z",
  "resend_available_at": "2026-10-30T15:22:13.237197452Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670589497` → **200**

```json
{
  "phone": "+380670589497",
  "audience": "CLIENT",
  "code": "215271",
  "sent_at": "2026-10-30T15:22:12.239753812Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "3f74c421-af5b-430b-a262-eb5cc2f5edf7",
  "challenge_id": "4f3b24c0-a54d-4005-9110-282f086fbcd9",
  "otp_code": "215271"
}
```

```json
{
  "client_id": "1230fb8a-333d-4b7a-889b-6fdb4bdf98ef",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-30T15:22:12.555935313Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "92e43d01-850f-49d3-8908-be16af09c31e",
  "quote_id": "e35bb0c8-1b0b-444f-8b9d-567ca5d5f5fc",
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
  "correlation_id": "10f7851b-63a2-4c30-a69e-9c6b763a2ef3"
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
  "session_id": "976a85a2-f790-4d05-bbc3-d007e4040809",
  "subject": {
    "type": "STAFF",
    "id": "04f20d10-faa2-4386-bfcf-0d466abe8fa8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNGYyMGQxMC1mYWEyLTQzODYtYmZjZi0wZDQ2NmFiZThmYTgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzQ2MzMsImlhdCI6MTc5MzM3MzczMywianRpIjoiNmYxZDcxZmMtNDk2My00Nzc5LWI3NGYtNTJmM2ZiMmZjZDI5Iiwic2lkIjoiOTc2YTg1YTItZjc5MC00ZDA1LWJiYzMtZDAwN2U0MDQwODA5In0.202NQIqwNlIRzFLsumHYztydE-15hI3Io6StYFH1rlc",
  "access_expires_at": "2026-10-30T15:37:13.465914814Z",
  "refresh_token": "kSu3cxi1NmhG82tn0rZ1RsSFNYpmlGZzxySOpWWJDzU",
  "refresh_expires_at": "2026-10-31T03:22:13.465276026Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "1230fb8a-333d-4b7a-889b-6fdb4bdf98ef",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-30T15:22:12.555935Z",
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

`POST /api/admin/v1/client-deletions/1230fb8a-333d-4b7a-889b-6fdb4bdf98ef/complete` → **200**

```json
{
  "command_id": "3ef1a590-b17b-4863-95db-08ea28b22f9f",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "1230fb8a-333d-4b7a-889b-6fdb4bdf98ef",
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
  "correlation_id": "8d38f524-7063-481b-91aa-5df0083c61a3"
}
```

Done: client 1230fb8a-333d-4b7a-889b-6fdb4bdf98ef anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380669777899",
  "device_ref": "sandbox-29941"
}
```

```json
{
  "challenge_id": "f66f4359-aa9f-460c-a81f-992f51ba1714",
  "expires_at": "2026-10-30T15:27:14.655411235Z",
  "resend_available_at": "2026-10-30T15:22:15.655411235Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380669777899` → **200**

```json
{
  "phone": "+380669777899",
  "audience": "CLIENT",
  "code": "647002",
  "sent_at": "2026-10-30T15:22:14.659032764Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f66f4359-aa9f-460c-a81f-992f51ba1714",
  "code": "647002",
  "device_ref": "sandbox-29941"
}
```

```json
{
  "session_id": "d5c66b0c-92ab-4fad-9bf7-97caf15691e8",
  "subject": {
    "type": "CLIENT",
    "id": "27a6dcfc-4db7-4ffb-a76a-b5ef8c16d2b2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyN2E2ZGNmYy00ZGI3LTRmZmItYTc2YS1iNWVmOGMxNmQyYjIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc0NjM0LCJpYXQiOjE3OTMzNzM3MzQsImp0aSI6ImRlNWNiNDA5LTdkNTctNDJkNS04ZjExLTM4YjQzNjNjYTM4ZSIsInNpZCI6ImQ1YzY2YjBjLTkyYWItNGZhZC05YmY3LTk3Y2FmMTU2OTFlOCJ9.54fJRux6_kUYPM1uBOm5RYALqD71YGd48Ls1q9nGFdw",
  "access_expires_at": "2026-10-30T15:37:14.97183851Z",
  "refresh_token": "PvisTm-YhZ8fiNvJbkB4ahxVZaA23CfxS3bRYPkaX7E",
  "refresh_expires_at": "2026-11-29T15:22:14.971223379Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "27a6dcfc-4db7-4ffb-a76a-b5ef8c16d2b2",
  "session_id": "d5c66b0c-92ab-4fad-9bf7-97caf15691e8",
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
  "session_id": "b72cb55a-9841-4861-85f5-a1112ed209a9",
  "subject": {
    "type": "STAFF",
    "id": "04f20d10-faa2-4386-bfcf-0d466abe8fa8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNGYyMGQxMC1mYWEyLTQzODYtYmZjZi0wZDQ2NmFiZThmYTgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzQ2MzUsImlhdCI6MTc5MzM3MzczNSwianRpIjoiNTQxMzIzMDUtMTU4MS00OTkwLWI3NGItYTg4YjQzNjZiMjZkIiwic2lkIjoiYjcyY2I1NWEtOTg0MS00ODYxLTg1ZjUtYTExMTJlZDIwOWE5In0.4-Nzg3BjGj9dvKMXQ6Z45OeaSFIVjc5x4Cf2_217XeM",
  "access_expires_at": "2026-10-30T15:37:15.836104355Z",
  "refresh_token": "5x6kRIRJ33LzujHoJLFeMBG_50J-ejMQ0AsY0lUrDsw",
  "refresh_expires_at": "2026-10-31T03:22:15.835492096Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=9777899&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "27a6dcfc-4db7-4ffb-a76a-b5ef8c16d2b2",
      "phone": "+380669777899",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-30T15:22:14.969638Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/27a6dcfc-4db7-4ffb-a76a-b5ef8c16d2b2` → **200**

```json
{
  "client": {
    "id": "27a6dcfc-4db7-4ffb-a76a-b5ef8c16d2b2",
    "phone": "+380669777899",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T15:22:14.969638Z",
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

`POST /api/admin/v1/clients/27a6dcfc-4db7-4ffb-a76a-b5ef8c16d2b2/block` → **400**

```json
{
  "command_id": "89d4cfb0-cc5c-440d-bfbb-0b8394f5289a",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/27a6dcfc-4db7-4ffb-a76a-b5ef8c16d2b2/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "858df461-78b8-437c-8b4f-44e4b181d07f",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/27a6dcfc-4db7-4ffb-a76a-b5ef8c16d2b2/block` → **200**

```json
{
  "command_id": "8389bbd6-e635-4396-8f76-1b1b7e3cca3d",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "27a6dcfc-4db7-4ffb-a76a-b5ef8c16d2b2",
  "phone": "+380669777899",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-30T15:22:14.969638Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-30T15:22:17.061952Z",
    "by": "04f20d10-faa2-4386-bfcf-0d466abe8fa8"
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
  "correlation_id": "072f5053-0379-4b21-a07c-8db9282b759e"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380669777899",
  "device_ref": "sandbox-5877"
}
```

```json
{
  "challenge_id": "821231e4-4fc8-4509-bead-85be8bd94619",
  "expires_at": "2026-10-30T15:27:19.645097094Z",
  "resend_available_at": "2026-10-30T15:22:20.645097094Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380669777899` → **200**

```json
{
  "phone": "+380669777899",
  "audience": "CLIENT",
  "code": "638531",
  "sent_at": "2026-10-30T15:22:19.647846968Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "821231e4-4fc8-4509-bead-85be8bd94619",
  "code": "638531",
  "device_ref": "sandbox-5877"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "67666de7-a419-44d7-b73f-9992fea7a0f0"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/27a6dcfc-4db7-4ffb-a76a-b5ef8c16d2b2` → **200**

```json
{
  "client": {
    "id": "27a6dcfc-4db7-4ffb-a76a-b5ef8c16d2b2",
    "phone": "+380669777899",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-30T15:22:14.969638Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-30T15:22:17.061952Z",
      "by": "04f20d10-faa2-4386-bfcf-0d466abe8fa8"
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

`POST /api/admin/v1/clients/27a6dcfc-4db7-4ffb-a76a-b5ef8c16d2b2/unblock` → **200**

```json
{
  "command_id": "fe4ac3ba-8829-4f43-8292-615a36bb6a40",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "27a6dcfc-4db7-4ffb-a76a-b5ef8c16d2b2",
  "phone": "+380669777899",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-30T15:22:14.969638Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380669777899",
  "device_ref": "sandbox-10749"
}
```

```json
{
  "challenge_id": "7e7b72a3-ce79-4e98-878c-cf95bb965fe6",
  "expires_at": "2026-10-30T15:27:22.894342729Z",
  "resend_available_at": "2026-10-30T15:22:23.894342729Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380669777899` → **200**

```json
{
  "phone": "+380669777899",
  "audience": "CLIENT",
  "code": "387168",
  "sent_at": "2026-10-30T15:22:22.897347522Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7e7b72a3-ce79-4e98-878c-cf95bb965fe6",
  "code": "387168",
  "device_ref": "sandbox-10749"
}
```

```json
{
  "session_id": "d769cd3e-fb9f-4fd6-a6e2-9332930ba137",
  "subject": {
    "type": "CLIENT",
    "id": "27a6dcfc-4db7-4ffb-a76a-b5ef8c16d2b2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyN2E2ZGNmYy00ZGI3LTRmZmItYTc2YS1iNWVmOGMxNmQyYjIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc0NjQzLCJpYXQiOjE3OTMzNzM3NDMsImp0aSI6IjM1OTU3M2I0LTQyYTYtNGYxNS1iZWJlLWYyMzQ2ZDcwOTUyYSIsInNpZCI6ImQ3NjljZDNlLWZiOWYtNGZkNi1hNmUyLTkzMzI5MzBiYTEzNyJ9.yyFzJAJ3TNVxO-iu1PiM0I67xd3RYZwgXkf-m6YqLDI",
  "access_expires_at": "2026-10-30T15:37:23.211722675Z",
  "refresh_token": "UhcnXihwj5P8vnX3iSwjSlb3Qlomearrg_CfjwFc02Q",
  "refresh_expires_at": "2026-11-29T15:22:23.210819131Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "27a6dcfc-4db7-4ffb-a76a-b5ef8c16d2b2",
  "session_id": "d769cd3e-fb9f-4fd6-a6e2-9332930ba137",
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
  "phone": "+380661584716",
  "device_ref": "sandbox-17715"
}
```

```json
{
  "challenge_id": "320110b5-13ac-4725-9450-3b592d9c9365",
  "expires_at": "2026-10-30T15:27:23.791144158Z",
  "resend_available_at": "2026-10-30T15:22:24.791144158Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380661584716` → **200**

```json
{
  "phone": "+380661584716",
  "audience": "CLIENT",
  "code": "179157",
  "sent_at": "2026-10-30T15:22:23.793822579Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "320110b5-13ac-4725-9450-3b592d9c9365",
  "code": "179157",
  "device_ref": "sandbox-17715"
}
```

```json
{
  "session_id": "f6eabc79-aeab-40e9-8f3c-08eb58680939",
  "subject": {
    "type": "CLIENT",
    "id": "d9cf9cf0-825e-4eef-9ea7-11f462d2ab83"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkOWNmOWNmMC04MjVlLTRlZWYtOWVhNy0xMWY0NjJkMmFiODMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc0NjQ0LCJpYXQiOjE3OTMzNzM3NDQsImp0aSI6IjM3OTA2MTFkLWI1MGEtNGNkNi1hM2U3LTc1YTU0MGUwNzBjYiIsInNpZCI6ImY2ZWFiYzc5LWFlYWItNDBlOS04ZjNjLTA4ZWI1ODY4MDkzOSJ9.aFg6pkdDtqPzAMt0X1RmXqdTPWfXxKUz-mDYb3hPK1Q",
  "access_expires_at": "2026-10-30T15:37:24.106400502Z",
  "refresh_token": "43KoLV3SdwNWLhCEy4wVnVyO_vczRr1-r7AY3Y3ohxg",
  "refresh_expires_at": "2026-11-29T15:22:24.10580176Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b1ab94ed-6e44-4cf4-9806-f5c6dc438892",
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
  "id": "ad700312-d804-4779-b92a-e041e06c8768",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:27:24.403543Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: 48905950-af90-413f-b7e4-6812041d49d0) → **201**

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
  "session_id": "b8a0cc40-910b-4a9e-b777-6b3982791e5b",
  "subject": {
    "type": "STAFF",
    "id": "04f20d10-faa2-4386-bfcf-0d466abe8fa8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNGYyMGQxMC1mYWEyLTQzODYtYmZjZi0wZDQ2NmFiZThmYTgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzQ2NDUsImlhdCI6MTc5MzM3Mzc0NSwianRpIjoiYmJjNWZjNjItMjVkMy00M2IzLThkMWQtMDVmODczZDE0YzFlIiwic2lkIjoiYjhhMGNjNDAtOTEwYi00YTllLWI3NzctNmIzOTgyNzkxZTViIn0.rPlaMZWLRqX5zEyIOfUCpn0fP7vfnMuKvy1IgNQfB5E",
  "access_expires_at": "2026-10-30T15:37:25.044793717Z",
  "refresh_token": "PMZo6_GLcpyzT4wPrAI08lNmJDdM8-2WSV0E4pKHEzo",
  "refresh_expires_at": "2026-10-31T03:22:25.044242934Z",
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
  "session_id": "47597f29-d596-47a0-b8c7-de46cd3f4738",
  "subject": {
    "type": "STAFF",
    "id": "04f20d10-faa2-4386-bfcf-0d466abe8fa8"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNGYyMGQxMC1mYWEyLTQzODYtYmZjZi0wZDQ2NmFiZThmYTgiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzQ2NDUsImlhdCI6MTc5MzM3Mzc0NSwianRpIjoiNjYzZGFkNmMtMjMxMC00YWE0LWE1NzgtZTU2ZDNmMjQyYzhjIiwic2lkIjoiNDc1OTdmMjktZDU5Ni00N2EwLWI4YzctZGU0NmNkM2Y0NzM4In0.shgJgiFib3EGkZaYwI4XayHUolbXwgVnCAC_2JzCuqk",
  "access_expires_at": "2026-10-30T15:37:25.626485057Z",
  "refresh_token": "1TQcWqlqvJgbiDrVwuPePPN7ZSjFLvdC5JV6voTub0U",
  "refresh_expires_at": "2026-10-31T03:22:25.625885512Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/dda6c862-a940-432a-9531-873f53c6424f/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T15:22:24.698774Z",
      "actor": {
        "type": "CLIENT",
        "id": "d9cf9cf0-825e-4eef-9ea7-11f462d2ab83",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "dda6c862-a940-432a-9531-873f53c6424f",
        "quote_id": "ad700312-d804-4779-b92a-e041e06c8768",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "48905950-af90-413f-b7e4-6812041d49d0"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T15:22:24.700756Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "dda6c862-a940-432a-9531-873f53c6424f",
        "attempt_id": "292be946-20d2-444c-978f-43f7a861ff5b",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "48905950-af90-413f-b7e4-6812041d49d0"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-30T15:22:24.726362Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "dda6c862-a940-432a-9531-873f53c6424f",
        "attempt_id": "292be946-20d2-444c-978f-43f7a861ff5b"
      },
      "correlation_id": "48905950-af90-413f-b7e4-6812041d49d0"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "292be946-20d2-444c-978f-43f7a861ff5b",
        "generation": 1,
        "started_at": "2026-10-30T15:22:24.699752Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-30T15:22:24.726362Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-30T15:22:24.701477Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/48905950-af90-413f-b7e4-6812041d49d0` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "dda6c862-a940-432a-9531-873f53c6424f:0",
      "order_id": "dda6c862-a940-432a-9531-873f53c6424f",
      "at": "2026-10-30T15:22:24.698774Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "dda6c862-a940-432a-9531-873f53c6424f:1",
      "order_id": "dda6c862-a940-432a-9531-873f53c6424f",
      "at": "2026-10-30T15:22:24.700756Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "dda6c862-a940-432a-9531-873f53c6424f:2",
      "order_id": "dda6c862-a940-432a-9531-873f53c6424f",
      "at": "2026-10-30T15:22:24.726362Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/d28a1510-20ec-4b46-88de-8fcd1ac80d49` → **200**

```json
{
  "found": []
}
```

Done: request 48905950-af90-413f-b7e4-6812041d49d0 — order dda6c862-a940-432a-9531-873f53c6424f found by its id.

`GET /api/rider/v1/orders/dda6c862-a940-432a-9531-873f53c6424f` → **200**

```json
{
  "id": "dda6c862-a940-432a-9531-873f53c6424f",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d9cf9cf0-825e-4eef-9ea7-11f462d2ab83",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:22:24.69833Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/dda6c862-a940-432a-9531-873f53c6424f/cancel` → **200**

```json
{
  "command_id": "a4dd6396-2d04-4990-b5b8-4277576a23b2",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "dda6c862-a940-432a-9531-873f53c6424f",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "d9cf9cf0-825e-4eef-9ea7-11f462d2ab83",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T15:22:24.69833Z",
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
  "phone": "+380638226629",
  "device_ref": "sandbox-9773"
}
```

```json
{
  "challenge_id": "54187e4a-29fd-4c38-bbe6-b8cea2787aff",
  "expires_at": "2026-10-30T15:27:27.432262548Z",
  "resend_available_at": "2026-10-30T15:22:28.432262548Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638226629` → **200**

```json
{
  "phone": "+380638226629",
  "audience": "CLIENT",
  "code": "593155",
  "sent_at": "2026-10-30T15:22:27.435028976Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "54187e4a-29fd-4c38-bbe6-b8cea2787aff",
  "code": "593155",
  "device_ref": "sandbox-9773"
}
```

```json
{
  "session_id": "6a9a6a46-9d20-46b6-b8d7-e828fb1cd8b5",
  "subject": {
    "type": "CLIENT",
    "id": "bc9724a0-7d0e-4004-981d-b35e1a32374a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYzk3MjRhMC03ZDBlLTQwMDQtOTgxZC1iMzVlMWEzMjM3NGEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc0NjQ3LCJpYXQiOjE3OTMzNzM3NDcsImp0aSI6Ijg5ZGI5OGI0LWY3MmEtNGE5Ni04NzYyLTg1ZGYyNzU0M2ZiOCIsInNpZCI6IjZhOWE2YTQ2LTlkMjAtNDZiNi1iOGQ3LWU4MjhmYjFjZDhiNSJ9.vgz2NEbgI1qiFTk276uGq-b_4yUAhsxU7lpmcM870b4",
  "access_expires_at": "2026-10-30T15:37:27.744339005Z",
  "refresh_token": "G8vl0ktELhkRpEFc7gKf-bqWRm61OeEwT8aGRkUyzOg",
  "refresh_expires_at": "2026-11-29T15:22:27.7437026Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "5890d461-645f-4cb9-b1c2-e85a9db3a08f",
  "expires_at": "2026-10-30T15:27:30.036629165Z",
  "resend_available_at": "2026-10-30T15:22:31.036629165Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638226629` → **200**

```json
{
  "phone": "+380638226629",
  "audience": "CLIENT",
  "code": "753090",
  "sent_at": "2026-10-30T15:22:30.039222404Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "1e2a1416-4a52-48dd-9bea-f6b830e5707e",
  "challenge_id": "5890d461-645f-4cb9-b1c2-e85a9db3a08f",
  "otp_code": "753090"
}
```

```json
{
  "id": "5c0b6ff2-3461-41fc-9a89-a8b8e2b7ca0c",
  "state": "PENDING",
  "created_at": "2026-10-30T15:22:30.354217Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/5c0b6ff2-3461-41fc-9a89-a8b8e2b7ca0c` → **200**

```json
{
  "id": "5c0b6ff2-3461-41fc-9a89-a8b8e2b7ca0c",
  "state": "PENDING",
  "created_at": "2026-10-30T15:22:30.354217Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/5c0b6ff2-3461-41fc-9a89-a8b8e2b7ca0c` → **200**

```json
{
  "id": "5c0b6ff2-3461-41fc-9a89-a8b8e2b7ca0c",
  "state": "READY",
  "created_at": "2026-10-30T15:22:30.354217Z",
  "ready_at": "2026-10-30T15:22:31.494754Z",
  "expires_at": "2026-11-06T15:22:31.494754Z",
  "size_bytes": 1030
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/5c0b6ff2-3461-41fc-9a89-a8b8e2b7ca0c/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639848482",
  "device_ref": "sandbox-24065"
}
```

```json
{
  "challenge_id": "d75fc818-41a4-4195-97cf-b443fc1d1e04",
  "expires_at": "2026-10-30T15:27:32.239938202Z",
  "resend_available_at": "2026-10-30T15:22:33.239938202Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639848482` → **200**

```json
{
  "phone": "+380639848482",
  "audience": "CLIENT",
  "code": "247327",
  "sent_at": "2026-10-30T15:22:32.242813048Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d75fc818-41a4-4195-97cf-b443fc1d1e04",
  "code": "247327",
  "device_ref": "sandbox-24065"
}
```

```json
{
  "session_id": "c271cece-3414-400e-b653-16efa3eb0184",
  "subject": {
    "type": "CLIENT",
    "id": "c456c9da-1920-43ef-abeb-9526a0f1c9f8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNDU2YzlkYS0xOTIwLTQzZWYtYWJlYi05NTI2YTBmMWM5ZjgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc0NjUyLCJpYXQiOjE3OTMzNzM3NTIsImp0aSI6IjUxZGU4ZTA0LWVmMmMtNDYyMi1hMWM3LTU2ODk1NjRlMjhmMCIsInNpZCI6ImMyNzFjZWNlLTM0MTQtNDAwZS1iNjUzLTE2ZWZhM2ViMDE4NCJ9.DFcRiC8HfxkkOsXYrhMgKMa2YEinTINXC0ZPDX_HZ5U",
  "access_expires_at": "2026-10-30T15:37:32.558701136Z",
  "refresh_token": "WX20OIaVbRZDpIR882_kp6uzYx1KJtOmIBZWx40nyKs",
  "refresh_expires_at": "2026-11-29T15:22:32.558131326Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/5c0b6ff2-3461-41fc-9a89-a8b8e2b7ca0c/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/5c0b6ff2-3461-41fc-9a89-a8b8e2b7ca0c/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "ebf2a7f4-c86d-4d2d-a78a-558c3d6bb0a1"
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
  "session_id": "82216abc-99f8-4cae-b0c6-7ee68259fd03",
  "subject": {
    "type": "STAFF",
    "id": "04f20d10-faa2-4386-bfcf-0d466abe8fa8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNGYyMGQxMC1mYWEyLTQzODYtYmZjZi0wZDQ2NmFiZThmYTgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzQ2NTMsImlhdCI6MTc5MzM3Mzc1MywianRpIjoiMGI5MWI0ZTAtODRmNS00NDk4LWIyZmItNDc5ZDExMDY2Nzc0Iiwic2lkIjoiODIyMTZhYmMtOTlmOC00Y2FlLWIwYzYtN2VlNjgyNTlmZDAzIn0.uDrY-OT5ktbx6h6gh6ZfBb7n5N9IguSmpmRAumwk7Fk",
  "access_expires_at": "2026-10-30T15:37:33.424050323Z",
  "refresh_token": "YqlJYm4WSSlBx1dRf-UZ1n39bA1HmMkTiuEoZZk9hnc",
  "refresh_expires_at": "2026-10-31T03:22:33.423452711Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "bc9724a0-7d0e-4004-981d-b35e1a32374a",
  "session_id": "6a9a6a46-9d20-46b6-b8d7-e828fb1cd8b5",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/bc9724a0-7d0e-4004-981d-b35e1a32374a/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "5c0b6ff2-3461-41fc-9a89-a8b8e2b7ca0c",
      "state": "READY",
      "created_at": "2026-10-30T15:22:30.354217Z",
      "ready_at": "2026-10-30T15:22:31.494754Z",
      "expires_at": "2026-11-06T15:22:31.494754Z",
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
  "device_ref": "sandbox-6719"
}
```

```json
{
  "challenge_id": "df1f8c04-8804-4912-aa5c-80be75929cae",
  "expires_at": "2026-10-30T15:27:34.293769064Z",
  "resend_available_at": "2026-10-30T15:22:35.293769064Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "003331",
  "sent_at": "2026-10-30T15:22:34.29673423Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "df1f8c04-8804-4912-aa5c-80be75929cae",
  "code": "003331",
  "device_ref": "sandbox-6719"
}
```

```json
{
  "session_id": "1a1fdacf-8edc-4ee6-b71f-c074816595da",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NDY1NCwiaWF0IjoxNzkzMzczNzU0LCJqdGkiOiIyYTk0MzhmYi0zNWVhLTQyMDAtYjhmMy0xYjE3NDQ4NDgwYTUiLCJzaWQiOiIxYTFmZGFjZi04ZWRjLTRlZTYtYjcxZi1jMDc0ODE2NTk1ZGEifQ.o7g5KzxTxfrjf2kBcwTOwuaJsbPzbCEtpoRTqRUOopQ",
  "access_expires_at": "2026-10-30T15:37:34.614559126Z",
  "refresh_token": "74H4Sl3CHKuCNAxWpJUuwruY8VDMQ8CCw70762F-uJw",
  "refresh_expires_at": "2026-11-29T15:22:34.613984889Z",
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
  "device_ref": "sandbox-12960"
}
```

```json
{
  "challenge_id": "f4152293-b1b4-474a-9403-73f174fd792e",
  "expires_at": "2026-10-30T15:27:35.185769695Z",
  "resend_available_at": "2026-10-30T15:22:36.185769695Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "939501",
  "sent_at": "2026-10-30T15:22:35.189081521Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f4152293-b1b4-474a-9403-73f174fd792e",
  "code": "939501",
  "device_ref": "sandbox-12960"
}
```

```json
{
  "session_id": "df5008c6-4c97-4117-ab82-e81fd7982eed",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NDY1NSwiaWF0IjoxNzkzMzczNzU1LCJqdGkiOiJjZjRhOTllNS1jZmMyLTQxY2ItOWE3ZC0xZTIyN2YyNDI3Y2UiLCJzaWQiOiJkZjUwMDhjNi00Yzk3LTQxMTctYWI4Mi1lODFmZDc5ODJlZWQifQ.Mcz7a89uSFfe9XSTa7zBFVPSG0ZoX8t82WMnPiuONtg",
  "access_expires_at": "2026-10-30T15:37:35.505535922Z",
  "refresh_token": "EcRQjFqK1IkPWtZ0E24fMzGJn7IMmsoj6eYkmITVaJk",
  "refresh_expires_at": "2026-11-29T15:22:35.504793989Z",
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
  "command_id": "9067a263-0841-4b0f-b6b6-7d3543518806",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:22:36Z",
    "sequence": 1793373756955
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "96aa6b13-3c65-40ef-a09d-58da668661e1",
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
  "last_heartbeat_at": "2026-10-30T15:22:36.114183Z",
  "last_location_at": "2026-10-30T15:22:36.114183Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-27258"
}
```

```json
{
  "challenge_id": "264e1cce-95fe-485b-83d5-b2792a1ea4d3",
  "expires_at": "2026-10-30T15:27:36.401658936Z",
  "resend_available_at": "2026-10-30T15:22:37.401658936Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "587944",
  "sent_at": "2026-10-30T15:22:36.404721333Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "264e1cce-95fe-485b-83d5-b2792a1ea4d3",
  "code": "587944",
  "device_ref": "sandbox-27258"
}
```

```json
{
  "session_id": "f5f6eb53-f6b3-48d5-ae39-db4218a1145a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NDY1NiwiaWF0IjoxNzkzMzczNzU2LCJqdGkiOiIyNjQ2YWFmYy0yNTdhLTRjYTQtODc3OC1mZDcwN2UxMDM4ZTkiLCJzaWQiOiJmNWY2ZWI1My1mNmIzLTQ4ZDUtYWUzOS1kYjQyMThhMTE0NWEifQ.6jTJMnkroazPa6JFj8KSJDWGB-arTygSlZFes53nxy8",
  "access_expires_at": "2026-10-30T15:37:36.741396652Z",
  "refresh_token": "WqjkuBIBToD-_3YLw6DL_TJ44qaIRkKwS60_ia7BT-A",
  "refresh_expires_at": "2026-11-29T15:22:36.740771709Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "6e5b5062-0f24-4850-9878-fd917ebbd2b1",
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
  "last_heartbeat_at": "2026-10-30T15:18:38.014011Z",
  "last_location_at": "2026-10-30T15:18:38.014011Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/6e5b5062-0f24-4850-9878-fd917ebbd2b1/handover` → **200**

```json
{
  "command_id": "9b64a6e9-d0ee-4049-abb6-06cb176923af",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "6e5b5062-0f24-4850-9878-fd917ebbd2b1",
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
  "last_heartbeat_at": "2026-10-30T15:18:38.014011Z",
  "last_location_at": "2026-10-30T15:18:38.014011Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/6e5b5062-0f24-4850-9878-fd917ebbd2b1/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:22:37Z",
    "sequence": 1793373757642
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "6e5b5062-0f24-4850-9878-fd917ebbd2b1",
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
  "last_heartbeat_at": "2026-10-30T15:22:37.660755Z",
  "last_location_at": "2026-10-30T15:22:37.660755Z",
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
  "session_id": "3ad4edab-6df2-46d1-b9b7-49774ef7f5ba",
  "subject": {
    "type": "STAFF",
    "id": "04f20d10-faa2-4386-bfcf-0d466abe8fa8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNGYyMGQxMC1mYWEyLTQzODYtYmZjZi0wZDQ2NmFiZThmYTgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzQ2NTgsImlhdCI6MTc5MzM3Mzc1OCwianRpIjoiZWJiMWIwYzEtZmNhOS00YzE4LWE5ZjMtZGU1NWQwZjQzYWJlIiwic2lkIjoiM2FkNGVkYWItNmRmMi00NmQxLWI5YjctNDk3NzRlZjdmNWJhIn0.1UE8VTEG63rJG7PRkdHcO4_KPYcT9IW90PLItcEQxEg",
  "access_expires_at": "2026-10-30T15:37:38.244348319Z",
  "refresh_token": "vxUTaI1cMrsuTpm82J1zjtIIFqAqybAzVr47vhU22CA",
  "refresh_expires_at": "2026-10-31T03:22:38.243724157Z",
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
  "session_id": "8089bdb4-43a3-43d8-aa4f-64f079aaac7c",
  "subject": {
    "type": "STAFF",
    "id": "04f20d10-faa2-4386-bfcf-0d466abe8fa8"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNGYyMGQxMC1mYWEyLTQzODYtYmZjZi0wZDQ2NmFiZThmYTgiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzQ2NTgsImlhdCI6MTc5MzM3Mzc1OCwianRpIjoiNTMzOTczOTktNzkwNC00ZTdhLWJiNDItZjZiOGJhOGM4NDI1Iiwic2lkIjoiODA4OWJkYjQtNDNhMy00M2Q4LWFhNGYtNjRmMDc5YWFhYzdjIn0.AdxZQIatSnZ8whI0jSFlK5z8dsHQdfrpZkRXSYwJGA4",
  "access_expires_at": "2026-10-30T15:37:38.835155996Z",
  "refresh_token": "7pWB04pHg3I07hG_KTXDHiwnHIG-eIYjye13O3Zis_4",
  "refresh_expires_at": "2026-10-31T03:22:38.834560969Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380684613928",
  "device_ref": "sandbox-12121"
}
```

```json
{
  "challenge_id": "fa535dc3-aebd-41b4-8cf4-bb42d6d4c208",
  "expires_at": "2026-10-30T15:27:39.120946296Z",
  "resend_available_at": "2026-10-30T15:22:40.120946296Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380684613928` → **200**

```json
{
  "phone": "+380684613928",
  "audience": "CLIENT",
  "code": "240261",
  "sent_at": "2026-10-30T15:22:39.123678644Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fa535dc3-aebd-41b4-8cf4-bb42d6d4c208",
  "code": "240261",
  "device_ref": "sandbox-12121"
}
```

```json
{
  "session_id": "222964d4-fb5c-42ff-b25b-eb057b1b550d",
  "subject": {
    "type": "CLIENT",
    "id": "7d98ed79-f11c-414f-9445-d0c74d2c8fc6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZDk4ZWQ3OS1mMTFjLTQxNGYtOTQ0NS1kMGM3NGQyYzhmYzYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc0NjU5LCJpYXQiOjE3OTMzNzM3NTksImp0aSI6IjViZTJiZDA4LWFmMjMtNGU5OC1iMmQ0LTExMDg2ODIwZjg5NiIsInNpZCI6IjIyMjk2NGQ0LWZiNWMtNDJmZi1iMjViLWViMDU3YjFiNTUwZCJ9.-SaXUpwwtB6a5QmWS13rhgfUGBU0qMp_0WW7gCXd8H8",
  "access_expires_at": "2026-10-30T15:37:39.435014858Z",
  "refresh_token": "4TEPgx2NyU4dB5JOeOq8J9P4KZvZBzPeywExz1DnUts",
  "refresh_expires_at": "2026-11-29T15:22:39.434353567Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "7cd04f48-a28c-4a30-b113-5c92144c7998",
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
  "id": "3ed15064-37f7-4bf5-8dee-099f970933ba",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:27:39.724661Z",
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
  "command_id": "19718306-5958-4874-8695-e9df2a307d80",
  "quote_id": "3ed15064-37f7-4bf5-8dee-099f970933ba",
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
  "id": "00ccbdee-cdf1-46db-9642-c900f6cebb69",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7d98ed79-f11c-414f-9445-d0c74d2c8fc6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T15:22:40.026333Z",
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
    "id": "a8ce0c01-e871-47ff-bba0-ffaa7c22a812",
    "order_id": "00ccbdee-cdf1-46db-9642-c900f6cebb69",
    "expires_at": "2026-10-30T15:22:55.029653Z",
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

`POST /api/driver/v1/offers/a8ce0c01-e871-47ff-bba0-ffaa7c22a812/reject` → **204**

```json
{
  "command_id": "77a40b5f-6867-4ae4-8c78-60c500399c29"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "c75004dc-844e-41fb-868a-48ded8857c72",
    "order_id": "00ccbdee-cdf1-46db-9642-c900f6cebb69",
    "expires_at": "2026-10-30T15:22:55.626083Z",
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

`POST /api/driver/v1/offers/c75004dc-844e-41fb-868a-48ded8857c72/accept` → **200**

```json
{
  "command_id": "9c30d57f-52b8-421a-bd09-af0455e2f374"
}
```

```json
{
  "id": "339450c9-0852-4139-8712-7f306b14edaa",
  "order_id": "00ccbdee-cdf1-46db-9642-c900f6cebb69",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a8b7bd66-ac68-408a-acba-0dd5a6dc2fde",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/00ccbdee-cdf1-46db-9642-c900f6cebb69/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T15:22:40.026786Z",
      "actor": {
        "type": "CLIENT",
        "id": "7d98ed79-f11c-414f-9445-d0c74d2c8fc6",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "00ccbdee-cdf1-46db-9642-c900f6cebb69",
        "quote_id": "3ed15064-37f7-4bf5-8dee-099f970933ba",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "c308d428-2761-49c7-b1e3-aa9ef6fe70fb"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T15:22:40.0288Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "00ccbdee-cdf1-46db-9642-c900f6cebb69",
        "attempt_id": "64bcd3ae-a84d-419d-b0d6-ccf6adb3da02",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "c308d428-2761-49c7-b1e3-aa9ef6fe70fb"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T15:22:40.032712Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "a8ce0c01-e871-47ff-bba0-ffaa7c22a812",
        "order_id": "00ccbdee-cdf1-46db-9642-c900f6cebb69",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "c308d428-2761-49c7-b1e3-aa9ef6fe70fb"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-30T15:22:40.625043Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "a8ce0c01-e871-47ff-bba0-ffaa7c22a812",
        "order_id": "00ccbdee-cdf1-46db-9642-c900f6cebb69"
      },
      "correlation_id": "1f35d501-b0c8-4280-96e9-1487df6f8d4a"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order 00ccbdee-cdf1-46db-9642-c900f6cebb69 — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/00ccbdee-cdf1-46db-9642-c900f6cebb69` → **200**

```json
{
  "id": "00ccbdee-cdf1-46db-9642-c900f6cebb69",
  "short_number": 12,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "7d98ed79-f11c-414f-9445-d0c74d2c8fc6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "339450c9-0852-4139-8712-7f306b14edaa",
    "order_id": "00ccbdee-cdf1-46db-9642-c900f6cebb69",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "a8b7bd66-ac68-408a-acba-0dd5a6dc2fde",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T15:22:40.026333Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/00ccbdee-cdf1-46db-9642-c900f6cebb69/cancel` → **200**

```json
{
  "command_id": "8718ef2b-735b-4baf-9bf7-3f1680e88dfd",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "00ccbdee-cdf1-46db-9642-c900f6cebb69",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "7d98ed79-f11c-414f-9445-d0c74d2c8fc6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "339450c9-0852-4139-8712-7f306b14edaa",
    "order_id": "00ccbdee-cdf1-46db-9642-c900f6cebb69",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "a8b7bd66-ac68-408a-acba-0dd5a6dc2fde",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T15:22:40.026333Z",
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
  "session_id": "96aa6b13-3c65-40ef-a09d-58da668661e1",
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
  "last_heartbeat_at": "2026-10-30T15:22:36.114183Z",
  "last_location_at": "2026-10-30T15:22:36.114183Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/96aa6b13-3c65-40ef-a09d-58da668661e1/close` → **200**

```json
{
  "command_id": "b1bc3dd8-d58d-462c-8067-ecb8d311caea",
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
  "session_id": "6e5b5062-0f24-4850-9878-fd917ebbd2b1",
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
  "last_heartbeat_at": "2026-10-30T15:22:37.660755Z",
  "last_location_at": "2026-10-30T15:22:37.660755Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6e5b5062-0f24-4850-9878-fd917ebbd2b1/close` → **200**

```json
{
  "command_id": "2e9ffbef-2f89-4429-821f-7aecf7242f84",
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
  "device_ref": "sandbox-18557"
}
```

```json
{
  "challenge_id": "8b2c59ae-d0c7-4296-9ba0-b1fe3659b14a",
  "expires_at": "2026-10-30T15:27:43.395018591Z",
  "resend_available_at": "2026-10-30T15:22:44.395018591Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "833467",
  "sent_at": "2026-10-30T15:22:43.398025794Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8b2c59ae-d0c7-4296-9ba0-b1fe3659b14a",
  "code": "833467",
  "device_ref": "sandbox-18557"
}
```

```json
{
  "session_id": "54233a2b-9c91-477a-b1cb-c1b42e8b126d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NDY2MywiaWF0IjoxNzkzMzczNzYzLCJqdGkiOiJmYzIzZjY2YS1lNTgwLTQ0ZmUtYTAzZS05MWE2NDhiNDZjNGEiLCJzaWQiOiI1NDIzM2EyYi05YzkxLTQ3N2EtYjFjYi1jMWI0MmU4YjEyNmQifQ.e07_lCnG1kgL1iqZ-A9PpQcJfdN-Sa0uh7h2GzgB0uk",
  "access_expires_at": "2026-10-30T15:37:43.731982997Z",
  "refresh_token": "e1Kjdg6PQGveiRUI1ISrpLOkDKGKTEtyHOlhUFMhvus",
  "refresh_expires_at": "2026-11-29T15:22:43.731286561Z",
  "account_created": false
}
```

`POST /api/driver/v1/documents/upload-sessions` → **201**

```json
{
  "command_id": "cd42202c-baa7-4df9-a571-d8ea7237cf64",
  "content_type": "application/pdf",
  "size_bytes": 86
}
```

```json
{
  "file_id": "f180da5c-5edf-4512-8e41-06a4835318ef",
  "upload_path": "/api/driver/v1/uploads/f180da5c-5edf-4512-8e41-06a4835318ef",
  "expires_at": "2026-10-30T15:37:44.028989746Z",
  "max_bytes": 86
}
```

`PUT /api/driver/v1/uploads/f180da5c-5edf-4512-8e41-06a4835318ef` → **200**

```json
{
  "file_id": "f180da5c-5edf-4512-8e41-06a4835318ef",
  "state": "SAFE",
  "content_type": "application/pdf",
  "size_bytes": 86,
  "reject_reason": null
}
```

## On the server's disk the file is not the PDF

Stored at `driver_document/2026-10/f180da5c-5edf-4512-8e41-06a4835318ef`, first bytes `425a4631683d52f5` (plain: `255044462d312e37` = %PDF-1.7).

## His download is exactly what he uploaded

`GET /api/driver/v1/files/f180da5c-5edf-4512-8e41-06a4835318ef` → **200**

SHA-256 uploaded `208fc3fbd0b47d8ea84eb9e0a0b18ce79511eb0daa71e53b106f6fd5ce425f26`, downloaded `208fc3fbd0b47d8ea84eb9e0a0b18ce79511eb0daa71e53b106f6fd5ce425f26`.

Done: document f180da5c-5edf-4512-8e41-06a4835318ef is encrypted on disk and downloads unchanged.

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
  "session_id": "a3f54865-b06b-43be-b7b3-ecf6f6e0f554",
  "subject": {
    "type": "STAFF",
    "id": "04f20d10-faa2-4386-bfcf-0d466abe8fa8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNGYyMGQxMC1mYWEyLTQzODYtYmZjZi0wZDQ2NmFiZThmYTgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzQ2NjQsImlhdCI6MTc5MzM3Mzc2NCwianRpIjoiMDcwNzRhYTAtYWUzYy00ZjI2LTkwYWEtODUzZTQyMzNkNTJmIiwic2lkIjoiYTNmNTQ4NjUtYjA2Yi00M2JlLWI3YjMtZWNmNmY2ZTBmNTU0In0.8Og5jJ1wr4U4z4DZNxz5Jw0C686Le0lqjenOZIezDIU",
  "access_expires_at": "2026-10-30T15:37:44.699378782Z",
  "refresh_token": "QEhT_K1CmGToKhk0f1msaHy2Up2v4Kq4uS0k40Rh2lw",
  "refresh_expires_at": "2026-10-31T03:22:44.698784627Z",
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
  "command_id": "5c3d5ff6-9337-4ea1-9651-6a568aa0e6d2",
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
  "changed_by": "04f20d10-faa2-4386-bfcf-0d466abe8fa8",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-30T15:22:45.293413Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "9cfccea4-22d6-4164-836a-8fecf06eb9c3",
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
  "correlation_id": "ba771998-4827-46ee-b81e-7ddc0362a864",
  "current_version": 1
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "d588bf40-255a-4059-9291-0f5fd900bd24",
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
  "correlation_id": "b105e712-a243-4e3c-af17-fc034cfae330"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631722291",
  "device_ref": "sandbox-2728"
}
```

```json
{
  "challenge_id": "35dce222-2b8b-48bf-a8b8-6ed570187633",
  "expires_at": "2026-10-30T15:27:46.16462144Z",
  "resend_available_at": "2026-10-30T15:22:47.16462144Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631722291` → **200**

```json
{
  "phone": "+380631722291",
  "audience": "CLIENT",
  "code": "859350",
  "sent_at": "2026-10-30T15:22:46.167458057Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "35dce222-2b8b-48bf-a8b8-6ed570187633",
  "code": "859350",
  "device_ref": "sandbox-2728"
}
```

```json
{
  "session_id": "249192c8-35de-4400-bf5c-def8fd66dfa4",
  "subject": {
    "type": "CLIENT",
    "id": "160a2cf4-6a21-440d-9d84-68562aa84440"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNjBhMmNmNC02YTIxLTQ0MGQtOWQ4NC02ODU2MmFhODQ0NDAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc0NjY2LCJpYXQiOjE3OTMzNzM3NjYsImp0aSI6IjYyYTljMzhhLTRlYzEtNDIzMi05MDdjLTFmMThhYzEwOTlkZSIsInNpZCI6IjI0OTE5MmM4LTM1ZGUtNDQwMC1iZjVjLWRlZjhmZDY2ZGZhNCJ9.JTcQKYlNZfrGrKk1ZlkWa6H3TVVI7hax8-YWGG0lOQM",
  "access_expires_at": "2026-10-30T15:37:46.479148498Z",
  "refresh_token": "9gbV29RBthMnhu4uRrbjLFHMtcgLnZPSJfH3sXwAk1c",
  "refresh_expires_at": "2026-11-29T15:22:46.478472269Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "3610a1c2-5b8e-43c0-a528-228e4f039064",
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
  "id": "29023888-76c3-48b9-b225-153827134171",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:27:46.769673Z",
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
  "command_id": "b7a4e247-be54-42d9-97cf-df59c5082048",
  "quote_id": "29023888-76c3-48b9-b225-153827134171",
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
  "correlation_id": "3e4a2e19-e1e4-4863-865f-dfbb611d0bb0"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "08d25cff-5b56-470a-96d6-4dbb8dda4666",
  "quote_id": "29023888-76c3-48b9-b225-153827134171",
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
  "id": "445fe9a8-7f85-4969-9096-eee296943265",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "160a2cf4-6a21-440d-9d84-68562aa84440",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:22:47.363443Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/445fe9a8-7f85-4969-9096-eee296943265/cancel` → **200**

```json
{
  "command_id": "8f68336b-762b-4cfe-acfc-4d148802ce0e",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "445fe9a8-7f85-4969-9096-eee296943265",
  "short_number": 13,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "160a2cf4-6a21-440d-9d84-68562aa84440",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T15:22:47.363443Z",
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
  "command_id": "e3b7bde8-9651-436f-8fa0-40baf6344e78",
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
  "changed_by": "04f20d10-faa2-4386-bfcf-0d466abe8fa8",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-30T15:22:48.017784Z"
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
      "changed_by": "04f20d10-faa2-4386-bfcf-0d466abe8fa8",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-30T15:22:48.017784Z"
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
  "device_ref": "sandbox-30708"
}
```

```json
{
  "challenge_id": "46f65578-4460-49ef-a8bd-20872a7344a1",
  "expires_at": "2026-10-30T15:27:48.926132131Z",
  "resend_available_at": "2026-10-30T15:22:49.926132131Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "483411",
  "sent_at": "2026-10-30T15:22:48.928823101Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "46f65578-4460-49ef-a8bd-20872a7344a1",
  "code": "483411",
  "device_ref": "sandbox-30708"
}
```

```json
{
  "session_id": "2fc0dfdc-9cbf-48af-af31-48a0756e89bb",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NDY2OSwiaWF0IjoxNzkzMzczNzY5LCJqdGkiOiI2NjE4ODJiZC01NWVkLTRkODUtYmU0Ny05Mjk3N2YxZWVhMjQiLCJzaWQiOiIyZmMwZGZkYy05Y2JmLTQ4YWYtYWYzMS00OGEwNzU2ZTg5YmIifQ.VSjAWACo3I1ou8nlixkm29clpEE7-9V9rgvt4bPnBss",
  "access_expires_at": "2026-10-30T15:37:49.236526429Z",
  "refresh_token": "9NWuue49vWzZA_1FbB0H9lVS_y9M8nnzqnjtiMJxqlY",
  "refresh_expires_at": "2026-11-29T15:22:49.235975454Z",
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
  "command_id": "b962c682-bc87-4752-9b04-bdb43a8b8dcf",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:22:49Z",
    "sequence": 1793373769817
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "250e997e-f530-4529-a61e-dd3cdec675ad",
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
  "last_heartbeat_at": "2026-10-30T15:22:49.836067Z",
  "last_location_at": "2026-10-30T15:22:49.836067Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674030944",
  "device_ref": "sandbox-12161"
}
```

```json
{
  "challenge_id": "aea5affc-35e7-4757-b356-e1481f33f29c",
  "expires_at": "2026-10-30T15:27:50.126805084Z",
  "resend_available_at": "2026-10-30T15:22:51.126805084Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380674030944` → **200**

```json
{
  "phone": "+380674030944",
  "audience": "CLIENT",
  "code": "923128",
  "sent_at": "2026-10-30T15:22:50.129667285Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "aea5affc-35e7-4757-b356-e1481f33f29c",
  "code": "923128",
  "device_ref": "sandbox-12161"
}
```

```json
{
  "session_id": "0c3cd5d4-e825-45f7-8b7e-5182180a2e07",
  "subject": {
    "type": "CLIENT",
    "id": "2eb7f0f9-fa1b-46e2-8235-8f82e74f52f6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZWI3ZjBmOS1mYTFiLTQ2ZTItODIzNS04ZjgyZTc0ZjUyZjYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc0NjcwLCJpYXQiOjE3OTMzNzM3NzAsImp0aSI6ImE2YTJmMmYzLWFkMjUtNDYyMC1iMmE3LTQ3NWZhOTI0YWJlNiIsInNpZCI6IjBjM2NkNWQ0LWU4MjUtNDVmNy04YjdlLTUxODIxODBhMmUwNyJ9.3LwcrdErzp4RnQXes1fjlxWz7QYt4103a6g28q3le50",
  "access_expires_at": "2026-10-30T15:37:50.444248423Z",
  "refresh_token": "mIven4GsL7OaAkxqbtykjIcH2nIExeUUnsbOno3KtHU",
  "refresh_expires_at": "2026-11-29T15:22:50.443636191Z",
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
  "command_id": "f3fcbec6-5c4f-4f58-9dea-57b6c18eda73",
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
  "id": "12df4855-7496-4813-90d1-e34f0042f30f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:27:51.022287Z",
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
  "command_id": "47921bc5-3371-4f26-9795-c872b1b1e2fb",
  "platform": "ANDROID",
  "token": "sandbox-driver-8eef6881-df90-4698-88d6-da9cd8cff3c0"
}
```

```json
{
  "id": "81849094-d950-4f88-8bb2-dd75d872eae7",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T15:22:51.328972Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "f865fe20-9c48-4078-b1bd-2616e60c8196",
  "platform": "ANDROID",
  "token": "sandbox-rider-385f878a-44a9-4706-99b1-865c3d8bff10"
}
```

```json
{
  "id": "f9532147-e092-48f7-8eba-f346c536ac95",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T15:22:51.630592Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "9b5c0554-e538-4270-be80-474af3475bd5",
  "quote_id": "12df4855-7496-4813-90d1-e34f0042f30f",
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
  "id": "4d4e62ed-1c1d-43a5-aabf-5018da3db802",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2eb7f0f9-fa1b-46e2-8235-8f82e74f52f6",
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
  "created_at": "2026-10-30T15:22:51.930176Z",
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
    "id": "ba9b399d-f576-4b72-8513-a1f05395dcd7",
    "order_id": "4d4e62ed-1c1d-43a5-aabf-5018da3db802",
    "expires_at": "2026-10-30T15:23:06.93372Z",
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

`POST /api/driver/v1/offers/ba9b399d-f576-4b72-8513-a1f05395dcd7/accept` → **200**

```json
{
  "command_id": "d731dd53-5cce-4045-929f-4f2a42ced960"
}
```

```json
{
  "id": "a9bbb69e-fd71-4363-b640-80095b8ff8de",
  "order_id": "4d4e62ed-1c1d-43a5-aabf-5018da3db802",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c7cd7ef1-89b7-4257-a825-a7fc7aaf53ac",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-30T15:22:51.905Z` → **200**

```json
[
  {
    "at": "2026-10-30T15:22:52.59269104Z",
    "token_suffix": "cff3c0",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "order_version": "2",
      "event_id": "6e5d5705-80bf-4541-ad2a-e40b789010cb",
      "event_type": "OfferMade",
      "type": "driver.offer",
      "order_id": "4d4e62ed-1c1d-43a5-aabf-5018da3db802"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380674030944&after=2026-10-30T15:22:51.905Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380674030944&after=2026-10-30T15:22:51.905Z` → **200**

```json
[
  {
    "at": "2026-10-30T15:22:53.598768375Z",
    "token_suffix": "8bff10",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "order_version": "3",
      "event_id": "071a0449-cae3-4862-9238-9ca923f3517e",
      "event_type": "AssignmentCommitted",
      "type": "rider.driver-assigned",
      "order_id": "4d4e62ed-1c1d-43a5-aabf-5018da3db802"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/4d4e62ed-1c1d-43a5-aabf-5018da3db802/messages` → **201**

```json
{
  "command_id": "0a45f5e5-b00c-40f1-9af4-867fece5e2f8",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "267a32ee-07a4-4a56-8345-29344deb9a11",
  "order_id": "4d4e62ed-1c1d-43a5-aabf-5018da3db802",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-30T15:22:53.914339645Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c7cd7ef1-89b7-4257-a825-a7fc7aaf53ac",
  "order_id": "4d4e62ed-1c1d-43a5-aabf-5018da3db802",
  "assignment_id": "a9bbb69e-fd71-4363-b640-80095b8ff8de",
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

`POST /api/driver/v1/trips/c7cd7ef1-89b7-4257-a825-a7fc7aaf53ac/messages` → **201**

```json
{
  "command_id": "0fa93901-5da7-49f7-bfc4-cd90bb81c368",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "1d9db0e6-b827-4857-bbd8-416f558393c9",
  "order_id": "4d4e62ed-1c1d-43a5-aabf-5018da3db802",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-30T15:22:54.486223482Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/4d4e62ed-1c1d-43a5-aabf-5018da3db802/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/c7cd7ef1-89b7-4257-a825-a7fc7aaf53ac/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380674030944"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/250e997e-f530-4529-a61e-dd3cdec675ad/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:22:55Z",
    "sequence": 1793373775352
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "250e997e-f530-4529-a61e-dd3cdec675ad",
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
  "last_heartbeat_at": "2026-10-30T15:22:55.371512Z",
  "last_location_at": "2026-10-30T15:22:55.371512Z",
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
  "id": "c7cd7ef1-89b7-4257-a825-a7fc7aaf53ac",
  "order_id": "4d4e62ed-1c1d-43a5-aabf-5018da3db802",
  "assignment_id": "a9bbb69e-fd71-4363-b640-80095b8ff8de",
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

`POST /api/driver/v1/trips/c7cd7ef1-89b7-4257-a825-a7fc7aaf53ac/arrive` → **200**

```json
{
  "command_id": "e407e43a-252e-45f1-9c4a-d53447c75caa",
  "expected_version": 0
}
```

```json
{
  "id": "c7cd7ef1-89b7-4257-a825-a7fc7aaf53ac",
  "order_id": "4d4e62ed-1c1d-43a5-aabf-5018da3db802",
  "assignment_id": "a9bbb69e-fd71-4363-b640-80095b8ff8de",
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
  "arrived_at": "2026-10-30T15:22:55.969549Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/c7cd7ef1-89b7-4257-a825-a7fc7aaf53ac/start` → **200**

```json
{
  "command_id": "26d0030f-4906-4e8d-b5a7-47f262954c72",
  "expected_version": 1
}
```

```json
{
  "id": "c7cd7ef1-89b7-4257-a825-a7fc7aaf53ac",
  "order_id": "4d4e62ed-1c1d-43a5-aabf-5018da3db802",
  "assignment_id": "a9bbb69e-fd71-4363-b640-80095b8ff8de",
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
  "arrived_at": "2026-10-30T15:22:55.969549Z",
  "started_at": "2026-10-30T15:22:56.272244Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

(the car drives 48 s to the next point)

`POST /api/driver/v1/work-sessions/250e997e-f530-4529-a61e-dd3cdec675ad/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:23:44Z",
    "sequence": 1793373824584
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "250e997e-f530-4529-a61e-dd3cdec675ad",
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
  "last_heartbeat_at": "2026-10-30T15:23:44.60456Z",
  "last_location_at": "2026-10-30T15:23:44.60456Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/c7cd7ef1-89b7-4257-a825-a7fc7aaf53ac/complete` → **200**

```json
{
  "command_id": "70ee9c45-530d-48eb-9bf9-b52ead58c41a",
  "expected_version": 2,
  "reported_at": "2026-10-30T15:23:44Z",
  "cash_received": true
}
```

```json
{
  "id": "c7cd7ef1-89b7-4257-a825-a7fc7aaf53ac",
  "order_id": "4d4e62ed-1c1d-43a5-aabf-5018da3db802",
  "assignment_id": "a9bbb69e-fd71-4363-b640-80095b8ff8de",
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
  "arrived_at": "2026-10-30T15:22:55.969549Z",
  "started_at": "2026-10-30T15:22:56.272244Z",
  "completed_at": "2026-10-30T15:23:44.905208Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/4d4e62ed-1c1d-43a5-aabf-5018da3db802` → **200**

```json
{
  "id": "4d4e62ed-1c1d-43a5-aabf-5018da3db802",
  "short_number": 14,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "2eb7f0f9-fa1b-46e2-8235-8f82e74f52f6",
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
    "id": "a9bbb69e-fd71-4363-b640-80095b8ff8de",
    "order_id": "4d4e62ed-1c1d-43a5-aabf-5018da3db802",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "c7cd7ef1-89b7-4257-a825-a7fc7aaf53ac",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T15:22:51.930176Z",
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
[
  {
    "id": "4d4e62ed-1c1d-43a5-aabf-5018da3db802",
    "short_number": 14,
    "status": "FULFILLED",
    "created_at": "2026-10-30T15:22:51.930176Z",
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
]
```

`GET /api/driver/v1/trips` → **200**

```json
[
  {
    "id": "c7cd7ef1-89b7-4257-a825-a7fc7aaf53ac",
    "order_id": "4d4e62ed-1c1d-43a5-aabf-5018da3db802",
    "order_short_number": 14,
    "created_at": "2026-10-30T15:22:52.539163Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "783a7337-abec-449f-8426-201fad072f91",
    "order_id": "f40e6456-e9f6-4469-a275-1b89f67f340f",
    "order_short_number": 9,
    "created_at": "2026-10-30T15:20:02.284605Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "b23f0480-820e-429b-a0d4-c516344afe80",
    "order_id": "e89853a2-2b33-49cd-8885-8495093418e1",
    "order_short_number": 4,
    "created_at": "2026-10-30T15:18:26.456151Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "0112f1a7-8511-4e83-af8d-3ec3ad46950d",
    "order_id": "63acda11-5881-4035-9055-c7bbe0bcfe5d",
    "order_short_number": 2,
    "created_at": "2026-10-30T15:14:32.272619Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "0a84d154-e096-413a-8299-33da5f8db923",
    "order_id": "3fa6a602-6d7a-4d3e-bec4-b338087590d3",
    "order_short_number": 1,
    "created_at": "2026-10-30T15:14:22.173625Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  }
]
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

`GET /api/rider/v1/orders/4d4e62ed-1c1d-43a5-aabf-5018da3db802/tip` → **200**

```json
{
  "order_id": "4d4e62ed-1c1d-43a5-aabf-5018da3db802",
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
  "available_until": "2026-10-31T15:23:44.905208Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/4d4e62ed-1c1d-43a5-aabf-5018da3db802/tip` → **201**

```json
{
  "command_id": "0caccf2e-a7be-43cc-b269-c8d47080bbd9",
  "amount_minor": 1100
}
```

```json
{
  "id": "41337a9d-7095-44c2-b6c8-40dce33cdd75",
  "order_id": "4d4e62ed-1c1d-43a5-aabf-5018da3db802",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-30T15:23:49.994848Z"
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
  "session_id": "5eee1248-2348-4657-b727-57feeac3cf22",
  "subject": {
    "type": "STAFF",
    "id": "04f20d10-faa2-4386-bfcf-0d466abe8fa8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNGYyMGQxMC1mYWEyLTQzODYtYmZjZi0wZDQ2NmFiZThmYTgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzQ3MzAsImlhdCI6MTc5MzM3MzgzMCwianRpIjoiYzRhOTA5MmItM2VjZS00NGM3LWJiMGItYTYzZGFkZGJhY2RjIiwic2lkIjoiNWVlZTEyNDgtMjM0OC00NjU3LWI3MjctNTdmZWVhYzNjZjIyIn0.y1JmmPIWPftszkPJZafGoy_BB59NZPLDLIus42j-QwA",
  "access_expires_at": "2026-10-30T15:38:50.575333217Z",
  "refresh_token": "5WlKfSk4n4NpVkAaVmNYBlOK3EzfnR_9HUAwUkcygLY",
  "refresh_expires_at": "2026-10-31T03:23:50.57440787Z",
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
        "created": 13,
        "fulfilled": 8,
        "cancelled": 5,
        "unfulfilled": 0,
        "open": 0,
        "by_channel": {
          "APP": 12,
          "PHONE": 1
        },
        "by_payment": {
          "CASH": 11,
          "CARD": 2
        },
        "cancelled_by": {
          "RIDER": 3,
          "DRIVER": 1,
          "STAFF": 1
        }
      }
    }
  ],
  "total": {
    "created": 13,
    "fulfilled": 8,
    "cancelled": 5,
    "unfulfilled": 0,
    "open": 0,
    "by_channel": {
      "APP": 12,
      "PHONE": 1
    },
    "by_payment": {
      "CASH": 11,
      "CARD": 2
    },
    "cancelled_by": {
      "RIDER": 3,
      "DRIVER": 1,
      "STAFF": 1
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
      "count": 1
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
  "generated_at": "2026-10-30T15:23:50.877270939Z"
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
  "generated_at": "2026-10-30T15:23:51.162654694Z"
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
  "session_id": "6745d2b4-6352-4acd-8905-aa3122f83bd9",
  "subject": {
    "type": "STAFF",
    "id": "04f20d10-faa2-4386-bfcf-0d466abe8fa8"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNGYyMGQxMC1mYWEyLTQzODYtYmZjZi0wZDQ2NmFiZThmYTgiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzQ3MzEsImlhdCI6MTc5MzM3MzgzMSwianRpIjoiOWU4NzQzYzgtMThjNS00NDAzLTg0NWQtMzRlYTkxNTg0Y2NmIiwic2lkIjoiNjc0NWQyYjQtNjM1Mi00YWNkLTg5MDUtYWEzMTIyZjgzYmQ5In0.I847o5bipUKjAbRja_ZCpxQ_OsrknGrCLUZPDqWuzpo",
  "access_expires_at": "2026-10-30T15:38:51.75101788Z",
  "refresh_token": "QxK1-2rTnl8QnqWCawJfDLNUw3zsXaXsmaU_MUnTUDY",
  "refresh_expires_at": "2026-10-31T03:23:51.750344556Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/4d4e62ed-1c1d-43a5-aabf-5018da3db802/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T15:22:51.9307Z",
      "actor": {
        "type": "CLIENT",
        "id": "2eb7f0f9-fa1b-46e2-8235-8f82e74f52f6",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "4d4e62ed-1c1d-43a5-aabf-5018da3db802",
        "quote_id": "12df4855-7496-4813-90d1-e34f0042f30f",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "722e2fe6-52fa-405a-990b-9d2fe9a0a95b"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T15:22:51.93292Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "4d4e62ed-1c1d-43a5-aabf-5018da3db802",
        "attempt_id": "7ceb567e-e72a-499c-bedc-b5572417ddad",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "722e2fe6-52fa-405a-990b-9d2fe9a0a95b"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T15:22:51.936843Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "ba9b399d-f576-4b72-8513-a1f05395dcd7",
        "order_id": "4d4e62ed-1c1d-43a5-aabf-5018da3db802",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "722e2fe6-52fa-405a-990b-9d2fe9a0a95b"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T15:22:52.540727Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "ba9b399d-f576-4b72-8513-a1f05395dcd7",
        "order_id": "4d4e62ed-1c1d-43a5-aabf-5018da3db802",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "a9bbb69e-fd71-4363-b640-80095b8ff8de"
      },
      "correlation_id": "6fe9a662-1fb6-4a9c-995a-3ba92b91f847"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-30T15:23:52.330693669Z",
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
      "last_location_at": "2026-10-30T15:23:44.60456Z",
      "order_id": null
    }
  ]
}
```

Done: order 4d4e62ed-1c1d-43a5-aabf-5018da3db802.

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
  "session_id": "bfe15433-84c9-4177-af4a-650a1b544c30",
  "subject": {
    "type": "STAFF",
    "id": "04f20d10-faa2-4386-bfcf-0d466abe8fa8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNGYyMGQxMC1mYWEyLTQzODYtYmZjZi0wZDQ2NmFiZThmYTgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzQ3MzIsImlhdCI6MTc5MzM3MzgzMiwianRpIjoiMzQwYjJmMDgtMmY4Ni00NjIwLTk5NjQtYWFmZmZiNDVmODY1Iiwic2lkIjoiYmZlMTU0MzMtODRjOS00MTc3LWFmNGEtNjUwYTFiNTQ0YzMwIn0.rSR1sSFvKqo0RSG6dV-OrkziZIYHX9cb-9eakBTPW7g",
  "access_expires_at": "2026-10-30T15:38:52.938936407Z",
  "refresh_token": "AZFSffjSQUDJK1l-QEakjcLj-78KpCImbjpCtnIoiCU",
  "refresh_expires_at": "2026-10-31T03:23:52.938317345Z",
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
  "command_id": "fdf8a0c9-cc19-4834-9b5c-4453c7d1e91a",
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
  "timestamp": "2026-10-30T15:23:53.000+0000",
  "channel": {
    "id": "1730052000.1835816556",
    "linkedid": "1730052000.1835816556",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380670873983"
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
  "timestamp": "2026-10-30T15:23:53.000+0000",
  "channel": {
    "id": "1730052000.1835816556",
    "linkedid": "1730052000.1835816556",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380670873983"
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
  "session_id": "08bf5598-56c3-47b8-b114-53c5b0a42e55",
  "subject": {
    "type": "STAFF",
    "id": "04f20d10-faa2-4386-bfcf-0d466abe8fa8"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNGYyMGQxMC1mYWEyLTQzODYtYmZjZi0wZDQ2NmFiZThmYTgiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzQ3MzQsImlhdCI6MTc5MzM3MzgzNCwianRpIjoiNDU1NDI0MTAtYjM5NS00YTBhLWFhY2UtMzZhNWU5ZDExMmRhIiwic2lkIjoiMDhiZjU1OTgtNTZjMy00N2I4LWIxMTQtNTNjNWIwYTQyZTU1In0.B9DKgKPMqPARtOo19TE7144DrCoWpEGEThPEQBhYb0M",
  "access_expires_at": "2026-10-30T15:38:54.15335467Z",
  "refresh_token": "9fXhF97CsD4vZb006HVP0PwcDG8p6ZveqKmRb3su3tk",
  "refresh_expires_at": "2026-10-31T03:23:54.152685684Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "ce5cab04-0f43-4817-a12f-6cb797d923b6",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380670873983",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T15:23:53Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/ce5cab04-0f43-4817-a12f-6cb797d923b6/answer` → **200**

```json
{
  "command_id": "17f4a197-9726-42b1-a05d-c3319cbc0899"
}
```

```json
{
  "id": "ce5cab04-0f43-4817-a12f-6cb797d923b6",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380670873983",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "04f20d10-faa2-4386-bfcf-0d466abe8fa8",
  "order_ids": [],
  "started_at": "2026-10-30T15:23:53Z",
  "answered_at": "2026-10-30T15:23:54.755155Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.1835816556",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "6b642b25-d5c4-4dde-8306-20615d085043",
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
  "id": "9ec9befe-cc78-4882-b19a-c8d236034c97",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:28:55.083265Z",
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
  "command_id": "5f03fd3a-22ab-4b47-8ec8-1cbe4e5d68d8",
  "quote_id": "9ec9befe-cc78-4882-b19a-c8d236034c97",
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
    "phone": "+380670873983"
  },
  "call_id": "ce5cab04-0f43-4817-a12f-6cb797d923b6"
}
```

```json
{
  "id": "9f672ae8-3ba6-4cf3-82ab-d2414478bb21",
  "short_number": 15,
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
  "created_at": "2026-10-30T15:23:55.380552Z",
  "caller": {
    "name": "Caller",
    "phone": "+380670873983"
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
    "id": "1730052000.1835816556",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "ce5cab04-0f43-4817-a12f-6cb797d923b6",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670873983",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "04f20d10-faa2-4386-bfcf-0d466abe8fa8",
      "order_ids": [
        "9f672ae8-3ba6-4cf3-82ab-d2414478bb21"
      ],
      "started_at": "2026-10-30T15:23:53Z",
      "answered_at": "2026-10-30T15:23:54.755155Z",
      "ended_at": "2026-10-30T15:23:55.721528Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "0882eda4-1a54-4f2e-b643-0def5e433a54",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672524583",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "04f20d10-faa2-4386-bfcf-0d466abe8fa8",
      "order_ids": [],
      "started_at": "2026-10-30T15:18:12.842016Z",
      "answered_at": "2026-10-30T15:18:13.173387Z",
      "ended_at": "2026-10-30T15:18:13.492003Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T15:18:21.452647Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/9f672ae8-3ba6-4cf3-82ab-d2414478bb21` → **200**

```json
{
  "id": "9f672ae8-3ba6-4cf3-82ab-d2414478bb21",
  "short_number": 15,
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
  "created_at": "2026-10-30T15:23:55.380552Z",
  "caller": {
    "name": "Caller",
    "phone": "+380670873983"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/9f672ae8-3ba6-4cf3-82ab-d2414478bb21` → **200**

```json
{
  "id": "9f672ae8-3ba6-4cf3-82ab-d2414478bb21",
  "short_number": 15,
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
  "created_at": "2026-10-30T15:23:55.380552Z",
  "caller": {
    "name": "Caller",
    "phone": "+380670873983"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/9f672ae8-3ba6-4cf3-82ab-d2414478bb21/cancel` → **200**

```json
{
  "command_id": "fc8d8773-c4ce-4a11-a200-73a3b7ce8637",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "9f672ae8-3ba6-4cf3-82ab-d2414478bb21",
  "short_number": 15,
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
  "created_at": "2026-10-30T15:23:55.380552Z",
  "caller": {
    "name": "Caller",
    "phone": "+380670873983"
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

Done: call ce5cab04-0f43-4817-a12f-6cb797d923b6 with order 9f672ae8-3ba6-4cf3-82ab-d2414478bb21.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-2615"
}
```

```json
{
  "challenge_id": "c15b34b3-227c-4640-b6f8-10110759f313",
  "expires_at": "2026-10-30T15:28:56.999002465Z",
  "resend_available_at": "2026-10-30T15:23:57.999002465Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "234418",
  "sent_at": "2026-10-30T15:23:57.003366392Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c15b34b3-227c-4640-b6f8-10110759f313",
  "code": "234418",
  "device_ref": "sandbox-2615"
}
```

```json
{
  "session_id": "311e3a57-dd36-4a4f-a445-a22cc6079352",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NDczNywiaWF0IjoxNzkzMzczODM3LCJqdGkiOiJiZjM1ZTAxNS04NDc0LTQyNmYtODljZS1kZGRlYTlkYWFkYTgiLCJzaWQiOiIzMTFlM2E1Ny1kZDM2LTRhNGYtYTQ0NS1hMjJjYzYwNzkzNTIifQ.Ctfg9zaraF1T9_N5fz2pNoOB_kfNkmmSRf-ld5aGWCc",
  "access_expires_at": "2026-10-30T15:38:57.318992512Z",
  "refresh_token": "H3hPHw1gpWBtJf_qIes2tLa3iJxOfKlVx_UejVVEucc",
  "refresh_expires_at": "2026-11-29T15:23:57.318339236Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "250e997e-f530-4529-a61e-dd3cdec675ad",
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
  "last_heartbeat_at": "2026-10-30T15:23:44.60456Z",
  "last_location_at": "2026-10-30T15:23:44.60456Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/250e997e-f530-4529-a61e-dd3cdec675ad/handover` → **200**

```json
{
  "command_id": "35fca9f0-d57f-4cd4-b594-bcdb631654ed",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "250e997e-f530-4529-a61e-dd3cdec675ad",
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
  "last_heartbeat_at": "2026-10-30T15:23:44.60456Z",
  "last_location_at": "2026-10-30T15:23:44.60456Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

(the car drives 85 s to the next point)

`POST /api/driver/v1/work-sessions/250e997e-f530-4529-a61e-dd3cdec675ad/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:25:23Z",
    "sequence": 1793373923233
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "250e997e-f530-4529-a61e-dd3cdec675ad",
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
  "last_heartbeat_at": "2026-10-30T15:25:23.252506Z",
  "last_location_at": "2026-10-30T15:25:23.252506Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380661287257",
  "device_ref": "sandbox-14693"
}
```

```json
{
  "challenge_id": "50868f9c-6e23-4a38-aa2f-9927031c0a0d",
  "expires_at": "2026-10-30T15:30:23.538405052Z",
  "resend_available_at": "2026-10-30T15:25:24.538405052Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380661287257` → **200**

```json
{
  "phone": "+380661287257",
  "audience": "CLIENT",
  "code": "902241",
  "sent_at": "2026-10-30T15:25:23.541562791Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "50868f9c-6e23-4a38-aa2f-9927031c0a0d",
  "code": "902241",
  "device_ref": "sandbox-14693"
}
```

```json
{
  "session_id": "2493bd42-7b51-4409-b27d-b9fb339df487",
  "subject": {
    "type": "CLIENT",
    "id": "dafca33a-d88f-4eca-976f-352ec126eb40"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYWZjYTMzYS1kODhmLTRlY2EtOTc2Zi0zNTJlYzEyNmViNDAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc0ODIzLCJpYXQiOjE3OTMzNzM5MjMsImp0aSI6IjQzNzI5YTE3LWI5ODctNGRmMy05OWNkLTAzNzYwNjJhYmY1ZiIsInNpZCI6IjI0OTNiZDQyLTdiNTEtNDQwOS1iMjdkLWI5ZmIzMzlkZjQ4NyJ9.4_wKWMseRmt3XO-Dq38yBW11PoCiA7ApLmTcRi7BxyQ",
  "access_expires_at": "2026-10-30T15:40:23.865292995Z",
  "refresh_token": "EK-_BF1_yrbK3G1VcfxicjLY27d-e68vi9DtbejlwnY",
  "refresh_expires_at": "2026-11-29T15:25:23.864367326Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "04e6e50a-5116-4131-a2bd-dae3ef4d86a7",
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
  "id": "292e15d4-2af3-45ae-80d1-1a04647545ca",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:30:24.166230Z",
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
  "command_id": "701f818e-f1be-41cb-a451-5f7396af319a",
  "quote_id": "292e15d4-2af3-45ae-80d1-1a04647545ca",
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
  "id": "27c9685c-ddb4-481b-b60b-6db0b584c9b0",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "dafca33a-d88f-4eca-976f-352ec126eb40",
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
  "created_at": "2026-10-30T15:25:24.473571Z",
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
    "id": "76e8422d-084c-4496-8911-64e507a69a8c",
    "order_id": "27c9685c-ddb4-481b-b60b-6db0b584c9b0",
    "expires_at": "2026-10-30T15:25:39.476939Z",
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

`POST /api/driver/v1/offers/76e8422d-084c-4496-8911-64e507a69a8c/accept` → **200**

```json
{
  "command_id": "b7bbb2ae-ffa3-4461-b03e-ddeb12b6f99b"
}
```

```json
{
  "id": "afe2c7ac-4793-4733-a8cf-177db9024ed2",
  "order_id": "27c9685c-ddb4-481b-b60b-6db0b584c9b0",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "36565742-73e9-4eb5-943e-f81ddda4aa3b",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "36565742-73e9-4eb5-943e-f81ddda4aa3b",
  "order_id": "27c9685c-ddb4-481b-b60b-6db0b584c9b0",
  "assignment_id": "afe2c7ac-4793-4733-a8cf-177db9024ed2",
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

`POST /api/driver/v1/work-sessions/250e997e-f530-4529-a61e-dd3cdec675ad/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:25:25Z",
    "sequence": 1793373925645
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "250e997e-f530-4529-a61e-dd3cdec675ad",
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
  "last_heartbeat_at": "2026-10-30T15:25:25.664052Z",
  "last_location_at": "2026-10-30T15:25:25.664052Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/36565742-73e9-4eb5-943e-f81ddda4aa3b/arrive` → **200**

```json
{
  "command_id": "bb8a8bac-0c20-43af-8a91-437004f7f6c3",
  "expected_version": 0
}
```

```json
{
  "id": "36565742-73e9-4eb5-943e-f81ddda4aa3b",
  "order_id": "27c9685c-ddb4-481b-b60b-6db0b584c9b0",
  "assignment_id": "afe2c7ac-4793-4733-a8cf-177db9024ed2",
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
  "arrived_at": "2026-10-30T15:25:25.973335Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/36565742-73e9-4eb5-943e-f81ddda4aa3b/start` → **200**

```json
{
  "command_id": "fd276db7-8a6e-42a9-aa27-43837b91e578",
  "expected_version": 1
}
```

```json
{
  "id": "36565742-73e9-4eb5-943e-f81ddda4aa3b",
  "order_id": "27c9685c-ddb4-481b-b60b-6db0b584c9b0",
  "assignment_id": "afe2c7ac-4793-4733-a8cf-177db9024ed2",
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
  "arrived_at": "2026-10-30T15:25:25.973335Z",
  "started_at": "2026-10-30T15:25:26.270165Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

(the car drives 59 s to the next point)

`POST /api/driver/v1/work-sessions/250e997e-f530-4529-a61e-dd3cdec675ad/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:26:25Z",
    "sequence": 1793373985598
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "250e997e-f530-4529-a61e-dd3cdec675ad",
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
  "last_heartbeat_at": "2026-10-30T15:26:25.617315Z",
  "last_location_at": "2026-10-30T15:26:25.617315Z",
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
  "device_ref": "sandbox-9460"
}
```

```json
{
  "challenge_id": "fb03118e-3edb-454c-b3d0-de895952b164",
  "expires_at": "2026-10-30T15:31:25.906654816Z",
  "resend_available_at": "2026-10-30T15:26:26.906654816Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "510968",
  "sent_at": "2026-10-30T15:26:25.909783609Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fb03118e-3edb-454c-b3d0-de895952b164",
  "code": "510968",
  "device_ref": "sandbox-9460"
}
```

```json
{
  "session_id": "7a6052a9-b399-4a64-9686-68ebe31a4df9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NDg4NiwiaWF0IjoxNzkzMzczOTg2LCJqdGkiOiI5NmYyMDlkMC1hOGI0LTQ4NmEtYWEzYS0yNjgwYTVlZWJmY2YiLCJzaWQiOiI3YTYwNTJhOS1iMzk5LTRhNjQtOTY4Ni02OGViZTMxYTRkZjkifQ.hRg2xi7zn4XzzwMMVnGymh7kegeUNui7dQoGDJWePyc",
  "access_expires_at": "2026-10-30T15:41:26.224177004Z",
  "refresh_token": "dJDMfy7w7Ax1ZHnYEtJMaSiSOTEuKTdP77tbT4P8v_8",
  "refresh_expires_at": "2026-11-29T15:26:26.223581467Z",
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
  "command_id": "8172a13b-d92d-4bef-b163-a754190ed202",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:26:26Z",
    "sequence": 1793373986828
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "202c01c6-ca88-4294-b8f6-188ffb674f70",
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
  "last_heartbeat_at": "2026-10-30T15:26:26.848055Z",
  "last_location_at": "2026-10-30T15:26:26.848055Z",
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
  "session_id": "086e3be9-c92a-4e6f-9d5e-88d3c8f4c3df",
  "subject": {
    "type": "STAFF",
    "id": "04f20d10-faa2-4386-bfcf-0d466abe8fa8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNGYyMGQxMC1mYWEyLTQzODYtYmZjZi0wZDQ2NmFiZThmYTgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzQ4ODcsImlhdCI6MTc5MzM3Mzk4NywianRpIjoiNzY4ODdmZTQtY2M1MC00NWRmLThjOWEtZDE2Njg2OTNhOTY4Iiwic2lkIjoiMDg2ZTNiZTktYzkyYS00ZTZmLTlkNWUtODhkM2M4ZjRjM2RmIn0.f6Ku3wrcmQNbqH-FjZECTn0AUL37MNUxDspqWT6VdKA",
  "access_expires_at": "2026-10-30T15:41:27.445633823Z",
  "refresh_token": "ZLECVcUtKWf1JfjyQ6v-VmWfo97iqXDH5QPSMeX4Dw8",
  "refresh_expires_at": "2026-10-31T03:26:27.445038516Z",
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
  "session_id": "d2012388-47aa-401f-9d57-062f05643570",
  "subject": {
    "type": "STAFF",
    "id": "04f20d10-faa2-4386-bfcf-0d466abe8fa8"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNGYyMGQxMC1mYWEyLTQzODYtYmZjZi0wZDQ2NmFiZThmYTgiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzQ4ODgsImlhdCI6MTc5MzM3Mzk4OCwianRpIjoiNmI0MWRjMGQtNGFmOS00NjllLTk4MzMtNTZlOTFmNzU5M2QzIiwic2lkIjoiZDIwMTIzODgtNDdhYS00MDFmLTlkNTctMDYyZjA1NjQzNTcwIn0.xfP55BQ1al6ER9JbfAyP97JRlUEILU8Wuq1piK65EP8",
  "access_expires_at": "2026-10-30T15:41:28.026075844Z",
  "refresh_token": "D4f4ZDwdKpNu3RQOCXw_lrWnGqypEt3sq1mR8hT_pJg",
  "refresh_expires_at": "2026-10-31T03:26:28.025473333Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/27c9685c-ddb4-481b-b60b-6db0b584c9b0` → **200**

```json
{
  "id": "27c9685c-ddb4-481b-b60b-6db0b584c9b0",
  "short_number": 16,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "dafca33a-d88f-4eca-976f-352ec126eb40",
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
    "id": "afe2c7ac-4793-4733-a8cf-177db9024ed2",
    "order_id": "27c9685c-ddb4-481b-b60b-6db0b584c9b0",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "36565742-73e9-4eb5-943e-f81ddda4aa3b",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-30T15:25:24.473571Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/27c9685c-ddb4-481b-b60b-6db0b584c9b0/interrupt` → **200**

```json
{
  "command_id": "f2912f18-b329-4417-ba22-d773d7f6f467",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "27c9685c-ddb4-481b-b60b-6db0b584c9b0",
    "short_number": 16,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "dafca33a-d88f-4eca-976f-352ec126eb40",
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
      "id": "afe2c7ac-4793-4733-a8cf-177db9024ed2",
      "order_id": "27c9685c-ddb4-481b-b60b-6db0b584c9b0",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "36565742-73e9-4eb5-943e-f81ddda4aa3b",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-30T15:25:24.473571Z",
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
    "id": "93709a28-1562-4a94-966d-7a3b65ba51b7",
    "short_number": 17,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "dafca33a-d88f-4eca-976f-352ec126eb40",
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
    "id": "96a0e039-3ab0-494f-a6b7-543ff95f0891",
    "order_id": "93709a28-1562-4a94-966d-7a3b65ba51b7",
    "expires_at": "2026-10-30T15:26:43.646234Z",
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

`POST /api/driver/v1/offers/96a0e039-3ab0-494f-a6b7-543ff95f0891/accept` → **200**

```json
{
  "command_id": "9b1977d5-543d-4f6b-b758-f1da538a4701"
}
```

```json
{
  "id": "2b4b10dc-269f-44de-b226-55de7a0e503b",
  "order_id": "93709a28-1562-4a94-966d-7a3b65ba51b7",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "49ee9129-4538-4680-966c-62833d91422f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "49ee9129-4538-4680-966c-62833d91422f",
  "order_id": "93709a28-1562-4a94-966d-7a3b65ba51b7",
  "assignment_id": "2b4b10dc-269f-44de-b226-55de7a0e503b",
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
  "session_id": "202c01c6-ca88-4294-b8f6-188ffb674f70",
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
  "last_heartbeat_at": "2026-10-30T15:26:26.848055Z",
  "last_location_at": "2026-10-30T15:26:26.848055Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/202c01c6-ca88-4294-b8f6-188ffb674f70/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:26:30Z",
    "sequence": 1793373990157
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "202c01c6-ca88-4294-b8f6-188ffb674f70",
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
  "last_heartbeat_at": "2026-10-30T15:26:30.175539Z",
  "last_location_at": "2026-10-30T15:26:30.175539Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/49ee9129-4538-4680-966c-62833d91422f/arrive` → **200**

```json
{
  "command_id": "5b3d10cf-39d4-4c99-b259-71a8d81b31e3",
  "expected_version": 0
}
```

```json
{
  "id": "49ee9129-4538-4680-966c-62833d91422f",
  "order_id": "93709a28-1562-4a94-966d-7a3b65ba51b7",
  "assignment_id": "2b4b10dc-269f-44de-b226-55de7a0e503b",
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
  "arrived_at": "2026-10-30T15:26:30.467118Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/49ee9129-4538-4680-966c-62833d91422f/start` → **200**

```json
{
  "command_id": "8865884d-5f87-4ae4-866d-5d506539d4e9",
  "expected_version": 1
}
```

```json
{
  "id": "49ee9129-4538-4680-966c-62833d91422f",
  "order_id": "93709a28-1562-4a94-966d-7a3b65ba51b7",
  "assignment_id": "2b4b10dc-269f-44de-b226-55de7a0e503b",
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
  "arrived_at": "2026-10-30T15:26:30.467118Z",
  "started_at": "2026-10-30T15:26:30.774979Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/49ee9129-4538-4680-966c-62833d91422f/complete` → **200**

```json
{
  "command_id": "ec97e4a5-6e8e-4a0b-acb4-889de24bb03b",
  "expected_version": 2,
  "reported_at": "2026-10-30T15:26:31Z"
}
```

```json
{
  "id": "49ee9129-4538-4680-966c-62833d91422f",
  "order_id": "93709a28-1562-4a94-966d-7a3b65ba51b7",
  "assignment_id": "2b4b10dc-269f-44de-b226-55de7a0e503b",
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
  "arrived_at": "2026-10-30T15:26:30.467118Z",
  "started_at": "2026-10-30T15:26:30.774979Z",
  "completed_at": "2026-10-30T15:26:31.096022Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/rider/v1/orders` → **200**

```json
[
  {
    "id": "93709a28-1562-4a94-966d-7a3b65ba51b7",
    "short_number": 17,
    "status": "FULFILLED",
    "created_at": "2026-10-30T15:26:28.636151Z",
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
    "id": "27c9685c-ddb4-481b-b60b-6db0b584c9b0",
    "short_number": 16,
    "status": "CANCELLED",
    "created_at": "2026-10-30T15:25:24.473571Z",
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
]
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

`GET /api/operator/v1/orders/27c9685c-ddb4-481b-b60b-6db0b584c9b0/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T15:25:24.474163Z",
      "actor": {
        "type": "CLIENT",
        "id": "dafca33a-d88f-4eca-976f-352ec126eb40",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "27c9685c-ddb4-481b-b60b-6db0b584c9b0",
        "quote_id": "292e15d4-2af3-45ae-80d1-1a04647545ca",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "f2bdd7b8-85bc-4266-a104-5bfdae1b1fb4"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T15:25:24.47621Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "27c9685c-ddb4-481b-b60b-6db0b584c9b0",
        "attempt_id": "574d49cb-9c1c-4556-a44e-7dae95d4a0c8",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "f2bdd7b8-85bc-4266-a104-5bfdae1b1fb4"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T15:25:24.479825Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "76e8422d-084c-4496-8911-64e507a69a8c",
        "order_id": "27c9685c-ddb4-481b-b60b-6db0b584c9b0",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "f2bdd7b8-85bc-4266-a104-5bfdae1b1fb4"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T15:25:25.067728Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "76e8422d-084c-4496-8911-64e507a69a8c",
        "order_id": "27c9685c-ddb4-481b-b60b-6db0b584c9b0",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "afe2c7ac-4793-4733-a8cf-177db9024ed2"
      },
      "correlation_id": "1d5e449e-d047-4dc0-9f2b-558c8071be17"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/93709a28-1562-4a94-966d-7a3b65ba51b7/tip` → **200**

```json
{
  "order_id": "93709a28-1562-4a94-966d-7a3b65ba51b7",
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
  "available_until": "2026-10-31T15:26:31.096022Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/93709a28-1562-4a94-966d-7a3b65ba51b7/tip` → **409**

```json
{
  "command_id": "c4e93320-7344-4423-a4c5-26e786128148",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/93709a28-1562-4a94-966d-7a3b65ba51b7/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "6b4cd307-b851-4048-af67-59265d255181"
}
```

Done: interrupted 27c9685c-ddb4-481b-b60b-6db0b584c9b0, follow-up 93709a28-1562-4a94-966d-7a3b65ba51b7.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "250e997e-f530-4529-a61e-dd3cdec675ad",
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
  "last_heartbeat_at": "2026-10-30T15:26:25.617315Z",
  "last_location_at": "2026-10-30T15:26:25.617315Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/250e997e-f530-4529-a61e-dd3cdec675ad/close` → **200**

```json
{
  "command_id": "31802416-8fff-4fb8-9864-9914877e27e1",
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
  "session_id": "202c01c6-ca88-4294-b8f6-188ffb674f70",
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
  "last_heartbeat_at": "2026-10-30T15:26:30.175539Z",
  "last_location_at": "2026-10-30T15:26:30.175539Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/202c01c6-ca88-4294-b8f6-188ffb674f70/close` → **200**

```json
{
  "command_id": "9c8d70e1-b709-40ed-9151-0bc9ff7b3f87",
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
  "session_id": "cbd2c6fa-f520-4ff4-8b76-d1970eac182c",
  "subject": {
    "type": "STAFF",
    "id": "04f20d10-faa2-4386-bfcf-0d466abe8fa8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNGYyMGQxMC1mYWEyLTQzODYtYmZjZi0wZDQ2NmFiZThmYTgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzQ4OTcsImlhdCI6MTc5MzM3Mzk5NywianRpIjoiZTg2ODJhYjYtYzVkMy00ZjU4LWEwNmMtNjE4Mjc5NDBmYTM1Iiwic2lkIjoiY2JkMmM2ZmEtZjUyMC00ZmY0LThiNzYtZDE5NzBlYWMxODJjIn0.KAH7IO2c7FF2QsoKCLpkLLRilH-IPdJrGJSCY8ZfHXE",
  "access_expires_at": "2026-10-30T15:41:37.395087844Z",
  "refresh_token": "6yX7YVUWjAdikOl-80R6hbHe-UmYPcjXwODe2PC3sbc",
  "refresh_expires_at": "2026-10-31T03:26:37.394457732Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "7e00d588-c11b-4316-a7f7-25bfb5400778",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T15:26:37Z"
}
```

```json
{
  "id": "4f8b734c-2ff8-4221-b200-c5e1ee3e1133",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T15:26:37Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/4f8b734c-2ff8-4221-b200-c5e1ee3e1133/publish` → **200**

```json
{
  "command_id": "52f21b9b-84b7-4ca5-a26b-5122274c6a5b",
  "expected_version": 0
}
```

```json
{
  "id": "4f8b734c-2ff8-4221-b200-c5e1ee3e1133",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T15:26:37.995919Z",
  "published_at": "2026-10-30T15:26:37.995919Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "4f8b734c-2ff8-4221-b200-c5e1ee3e1133",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-30T15:26:37.995919Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634424784",
  "device_ref": "sandbox-14863"
}
```

```json
{
  "challenge_id": "7c2863ad-8bc4-45de-ba3d-9cdf789d92e2",
  "expires_at": "2026-10-30T15:31:38.572069945Z",
  "resend_available_at": "2026-10-30T15:26:39.572069945Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380634424784` → **200**

```json
{
  "phone": "+380634424784",
  "audience": "CLIENT",
  "code": "864461",
  "sent_at": "2026-10-30T15:26:38.574931586Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7c2863ad-8bc4-45de-ba3d-9cdf789d92e2",
  "code": "864461",
  "device_ref": "sandbox-14863"
}
```

```json
{
  "session_id": "e2042840-fc19-4843-bd50-109dbc88e1c2",
  "subject": {
    "type": "CLIENT",
    "id": "73b66988-1666-4845-a32e-3d27433f79c3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3M2I2Njk4OC0xNjY2LTQ4NDUtYTMyZS0zZDI3NDMzZjc5YzMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc0ODk4LCJpYXQiOjE3OTMzNzM5OTgsImp0aSI6Ijc5ZjA2ZTE5LWE4NjAtNDkyNS05ZjgzLTc5Yjc1YmZlMmZmOSIsInNpZCI6ImUyMDQyODQwLWZjMTktNDg0My1iZDUwLTEwOWRiYzg4ZTFjMiJ9.cT0ZtkOumdIw2ezQVNZIHOpzP-HluwOWwwLv6yN7JBk",
  "access_expires_at": "2026-10-30T15:41:38.891602423Z",
  "refresh_token": "sNQQ_5iBOow641SCQf5soDjsuvk7PF950v5fA22qU7U",
  "refresh_expires_at": "2026-11-29T15:26:38.891044103Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "4f8b734c-2ff8-4221-b200-c5e1ee3e1133",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-30T15:26:37.995919Z",
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
  "command_id": "8ec9e2b9-e2a6-41b3-8431-27bf1764a18c",
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
  "id": "ca62ffec-00f2-40f5-bef6-980ddf688b1d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:31:39.466831Z",
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
  "command_id": "721bbda5-46d6-4573-a908-fed2714987fd",
  "quote_id": "ca62ffec-00f2-40f5-bef6-980ddf688b1d",
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
  "correlation_id": "d65f51c8-21fe-441a-a1f6-de390f964961"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "0dcf30d7-5ff5-4981-9c17-60450b0dd7c7",
  "version_id": "4f8b734c-2ff8-4221-b200-c5e1ee3e1133",
  "language": "uk"
}
```

```json
{
  "version_id": "4f8b734c-2ff8-4221-b200-c5e1ee3e1133",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-30T15:26:40.075504Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b79d9b38-d622-448f-9e5f-c19d8e9168a3",
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
  "id": "dd5a3f3b-db7b-44d6-a6d9-18881143df52",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:31:40.375665Z",
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
  "command_id": "f4864903-38b7-44cd-99b4-dc45d3d50ca0",
  "quote_id": "dd5a3f3b-db7b-44d6-a6d9-18881143df52",
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
  "id": "29c4457e-f23d-4456-be2d-8b00d18edf75",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "73b66988-1666-4845-a32e-3d27433f79c3",
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
  "created_at": "2026-10-30T15:26:40.683806Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/29c4457e-f23d-4456-be2d-8b00d18edf75` → **200**

```json
{
  "id": "29c4457e-f23d-4456-be2d-8b00d18edf75",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "73b66988-1666-4845-a32e-3d27433f79c3",
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
  "created_at": "2026-10-30T15:26:40.683806Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/29c4457e-f23d-4456-be2d-8b00d18edf75/cancel` → **200**

```json
{
  "command_id": "4ff865be-3022-412a-a539-917e90be7047",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "29c4457e-f23d-4456-be2d-8b00d18edf75",
  "short_number": 18,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "73b66988-1666-4845-a32e-3d27433f79c3",
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
  "created_at": "2026-10-30T15:26:40.683806Z",
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

`POST /api/admin/v1/legal-documents/4f8b734c-2ff8-4221-b200-c5e1ee3e1133` → **409**

```json
{
  "command_id": "768c9434-2fa9-4c02-b2aa-c65cb59a87c3",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T15:26:41Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/4f8b734c-2ff8-4221-b200-c5e1ee3e1133",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "f13d3ee7-9db0-4811-8215-707fb1299ecd"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "153f1348-149e-4778-b23a-ee7ba8bbd26c",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T15:26:41Z"
}
```

```json
{
  "id": "a39cf46c-7154-4a4e-af46-7bd32f46475a",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T15:26:41Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/a39cf46c-7154-4a4e-af46-7bd32f46475a/publish` → **200**

```json
{
  "command_id": "7683f08c-cef7-4d68-92e2-34a9b717c28c",
  "expected_version": 0
}
```

```json
{
  "id": "a39cf46c-7154-4a4e-af46-7bd32f46475a",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T15:26:42.257246Z",
  "published_at": "2026-10-30T15:26:42.257246Z",
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
  "device_ref": "sandbox-24800"
}
```

```json
{
  "challenge_id": "a13bd6d1-8488-4326-99bf-14a0ed058cf2",
  "expires_at": "2026-10-30T15:31:42.556001032Z",
  "resend_available_at": "2026-10-30T15:26:43.556001032Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "135791",
  "sent_at": "2026-10-30T15:26:42.558683408Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a13bd6d1-8488-4326-99bf-14a0ed058cf2",
  "code": "135791",
  "device_ref": "sandbox-24800"
}
```

```json
{
  "session_id": "d071dc10-c386-4f6c-bc6e-cbf19c1eb71b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NDkwMiwiaWF0IjoxNzkzMzc0MDAyLCJqdGkiOiJkZWQ3YzBkNC01MmVlLTQxNTYtYWRlMS05Y2Y2Nzg4YzhlNjYiLCJzaWQiOiJkMDcxZGMxMC1jMzg2LTRmNmMtYmM2ZS1jYmYxOWMxZWI3MWIifQ.-2V4NTNWO0QtnHQHhzUp5O5aFFiEA_HBvyWUuVYtuNI",
  "access_expires_at": "2026-10-30T15:41:42.874689381Z",
  "refresh_token": "1fcqwqt1LsjE901ZUp7GIyxeWLxFSybuqDGKEPA_VJU",
  "refresh_expires_at": "2026-11-29T15:26:42.873952698Z",
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
  "command_id": "122b4415-0e8c-4956-bdad-691911aa3185",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:27:54Z",
    "sequence": 1793374074477
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "6d9f207d-972a-48e7-9629-afeca6dd64a9",
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
  "last_heartbeat_at": "2026-10-30T15:27:54.495373Z",
  "last_location_at": "2026-10-30T15:27:54.495373Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672617132",
  "device_ref": "sandbox-28469"
}
```

```json
{
  "challenge_id": "4f2b8a62-f1fd-456a-9cdd-c8a8f0d25bc1",
  "expires_at": "2026-10-30T15:32:54.796252946Z",
  "resend_available_at": "2026-10-30T15:27:55.796252946Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380672617132` → **200**

```json
{
  "phone": "+380672617132",
  "audience": "CLIENT",
  "code": "532513",
  "sent_at": "2026-10-30T15:27:54.799129337Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4f2b8a62-f1fd-456a-9cdd-c8a8f0d25bc1",
  "code": "532513",
  "device_ref": "sandbox-28469"
}
```

```json
{
  "session_id": "8b686c6e-b4a0-470f-8e81-fd6521c12155",
  "subject": {
    "type": "CLIENT",
    "id": "40cb520b-34c8-4859-a9a0-b49c944b44a9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MGNiNTIwYi0zNGM4LTQ4NTktYTlhMC1iNDljOTQ0YjQ0YTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc0OTc1LCJpYXQiOjE3OTMzNzQwNzUsImp0aSI6ImE1NWRkMTdjLWUxZWUtNDBiNy1iYmZkLTg3ZWNhMzYzZWY5OCIsInNpZCI6IjhiNjg2YzZlLWI0YTAtNDcwZi04ZTgxLWZkNjUyMWMxMjE1NSJ9.FZmDtZ1djC8GGurBARa3JmIzXbLS0HiTMNro5eqhTMc",
  "access_expires_at": "2026-10-30T15:42:55.113040938Z",
  "refresh_token": "MQt-_l9dMrZtXeOaiR9TW9YxJ8SMtMslZoBIFqgMRzk",
  "refresh_expires_at": "2026-11-29T15:27:55.112469208Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "66db408b-9684-4269-bd9f-27fd209f230b",
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
  "id": "d644bf5f-6180-4fdf-98c1-56e6ea34bc24",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:32:55.418546Z",
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
  "command_id": "e4fd3812-1fd9-4ae3-bc54-bea6e93f7f0e",
  "quote_id": "d644bf5f-6180-4fdf-98c1-56e6ea34bc24",
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
    "phone": "+380679753267"
  }
}
```

```json
{
  "id": "6aa07412-04f0-41cd-a223-81bc99f3c15f",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "40cb520b-34c8-4859-a9a0-b49c944b44a9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T15:27:55.728007Z",
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
    "id": "d8605cf3-3d53-4ff5-9900-15fefbf16293",
    "order_id": "6aa07412-04f0-41cd-a223-81bc99f3c15f",
    "expires_at": "2026-10-30T15:28:10.731649Z",
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

`POST /api/driver/v1/offers/d8605cf3-3d53-4ff5-9900-15fefbf16293/accept` → **200**

```json
{
  "command_id": "469305ce-cb3a-4d13-b99f-34a3c8cf193d"
}
```

```json
{
  "id": "90eb1940-2904-47af-ae61-418677f6ff2b",
  "order_id": "6aa07412-04f0-41cd-a223-81bc99f3c15f",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "6b9fca26-1fe6-4a1a-85ea-30d3c4d6c966",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "6b9fca26-1fe6-4a1a-85ea-30d3c4d6c966",
  "order_id": "6aa07412-04f0-41cd-a223-81bc99f3c15f",
  "assignment_id": "90eb1940-2904-47af-ae61-418677f6ff2b",
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
    "phone": "+380679753267"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6a9e9120-140b-4df7-95d6-1a813e08969f",
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
  "id": "621628bd-6511-4d34-9e9e-8feef99e3492",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:32:56.949113Z",
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
  "command_id": "c08ba16b-7771-41db-a376-c6a557693311",
  "quote_id": "621628bd-6511-4d34-9e9e-8feef99e3492",
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
  "id": "7a9cbac6-7dee-4fd6-9e59-d4966308075f",
  "short_number": 20,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "40cb520b-34c8-4859-a9a0-b49c944b44a9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:27:57.263606Z",
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
  "command_id": "14b5d44d-9d26-4259-afcc-3dc8819a5aed",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-30T18:27:57Z"
}
```

```json
{
  "id": "3774c5e2-52f6-4781-a68b-0256e6c67f2a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:32:57.594005Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-30T18:27:57Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "f1149941-216a-463f-b9de-89fb3277e096",
  "quote_id": "3774c5e2-52f6-4781-a68b-0256e6c67f2a",
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
  "pickup_at": "2026-10-30T18:27:57Z"
}
```

```json
{
  "id": "1bd84166-d9aa-4147-aea4-51b7b9ebc0bc",
  "short_number": 21,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "40cb520b-34c8-4859-a9a0-b49c944b44a9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T15:27:57.937499Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T18:27:57Z",
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
  "command_id": "52a0e166-80f1-4559-b972-16b37287c460",
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
  "id": "e9191092-400d-4ae2-8f80-1e63c76d5d87",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:32:58.265218Z",
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
  "command_id": "5557b830-4e45-462e-8446-e294f4a0bb6b",
  "quote_id": "e9191092-400d-4ae2-8f80-1e63c76d5d87",
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
  "correlation_id": "6ea5a324-c041-4522-bd4a-54f099d6a5c2"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "1bd84166-d9aa-4147-aea4-51b7b9ebc0bc",
      "short_number": 21,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "40cb520b-34c8-4859-a9a0-b49c944b44a9",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-30T15:27:57.937499Z",
      "cancellation": null,
      "pickup_at": "2026-10-30T18:27:57Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "7a9cbac6-7dee-4fd6-9e59-d4966308075f",
      "short_number": 20,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "40cb520b-34c8-4859-a9a0-b49c944b44a9",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
        "lat": 50.4405,
        "lon": 30.489
      },
      "dropoff_label": "Вокзал",
      "payment_method": "CASH",
      "payment_state": "CASH_EXPECTED",
      "price_minor": 10517,
      "final_price_minor": null,
      "currency": "UAH",
      "search_phase": "BROADCAST",
      "assignment": null,
      "created_at": "2026-10-30T15:27:57.263606Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "6aa07412-04f0-41cd-a223-81bc99f3c15f",
      "short_number": 19,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "7a9cbac6-7dee-4fd6-9e59-d4966308075f",
  "short_number": 20,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "40cb520b-34c8-4859-a9a0-b49c944b44a9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:27:57.263606Z",
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

`GET /api/rider/v1/orders/6aa07412-04f0-41cd-a223-81bc99f3c15f` → **200**

```json
{
  "id": "6aa07412-04f0-41cd-a223-81bc99f3c15f",
  "short_number": 19,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "40cb520b-34c8-4859-a9a0-b49c944b44a9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "90eb1940-2904-47af-ae61-418677f6ff2b",
    "order_id": "6aa07412-04f0-41cd-a223-81bc99f3c15f",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "6b9fca26-1fe6-4a1a-85ea-30d3c4d6c966",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T15:27:55.728007Z",
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
    "location_at": "2026-10-30T15:27:54.495373Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/6aa07412-04f0-41cd-a223-81bc99f3c15f/cancel` → **200**

```json
{
  "command_id": "28253154-86b7-4176-89ee-f41a568e337e",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "6aa07412-04f0-41cd-a223-81bc99f3c15f",
  "short_number": 19,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "40cb520b-34c8-4859-a9a0-b49c944b44a9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "90eb1940-2904-47af-ae61-418677f6ff2b",
    "order_id": "6aa07412-04f0-41cd-a223-81bc99f3c15f",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "6b9fca26-1fe6-4a1a-85ea-30d3c4d6c966",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T15:27:55.728007Z",
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

`GET /api/rider/v1/orders/7a9cbac6-7dee-4fd6-9e59-d4966308075f` → **200**

```json
{
  "id": "7a9cbac6-7dee-4fd6-9e59-d4966308075f",
  "short_number": 20,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "40cb520b-34c8-4859-a9a0-b49c944b44a9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:27:57.263606Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/7a9cbac6-7dee-4fd6-9e59-d4966308075f/cancel` → **200**

```json
{
  "command_id": "0a18935f-e761-494f-9f47-07b917354761",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "7a9cbac6-7dee-4fd6-9e59-d4966308075f",
  "short_number": 20,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "40cb520b-34c8-4859-a9a0-b49c944b44a9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T15:27:57.263606Z",
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

`GET /api/rider/v1/orders/1bd84166-d9aa-4147-aea4-51b7b9ebc0bc` → **200**

```json
{
  "id": "1bd84166-d9aa-4147-aea4-51b7b9ebc0bc",
  "short_number": 21,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "40cb520b-34c8-4859-a9a0-b49c944b44a9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T15:27:57.937499Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T18:27:57Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/1bd84166-d9aa-4147-aea4-51b7b9ebc0bc/cancel` → **200**

```json
{
  "command_id": "f4160dd4-7f60-4653-8f86-ef6ec61ef9d5",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "1bd84166-d9aa-4147-aea4-51b7b9ebc0bc",
  "short_number": 21,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "40cb520b-34c8-4859-a9a0-b49c944b44a9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T15:27:57.937499Z",
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
  "pickup_at": "2026-10-30T18:27:57Z",
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
  "session_id": "6d9f207d-972a-48e7-9629-afeca6dd64a9",
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
  "last_heartbeat_at": "2026-10-30T15:27:54.495373Z",
  "last_location_at": "2026-10-30T15:27:54.495373Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6d9f207d-972a-48e7-9629-afeca6dd64a9/close` → **200**

```json
{
  "command_id": "9ec89cd9-c058-48a9-8756-e06d57bea61e",
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

Done: orders 6aa07412-04f0-41cd-a223-81bc99f3c15f, 7a9cbac6-7dee-4fd6-9e59-d4966308075f, 1bd84166-d9aa-4147-aea4-51b7b9ebc0bc.

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
  "session_id": "8b274651-b451-4161-ad0b-3dfc59e26448",
  "subject": {
    "type": "STAFF",
    "id": "04f20d10-faa2-4386-bfcf-0d466abe8fa8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNGYyMGQxMC1mYWEyLTQzODYtYmZjZi0wZDQ2NmFiZThmYTgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzQ5ODIsImlhdCI6MTc5MzM3NDA4MiwianRpIjoiMTdkNjIzOTQtOTU1MS00MzNlLWFkNTYtOWFmNjZkZmZlNTAwIiwic2lkIjoiOGIyNzQ2NTEtYjQ1MS00MTYxLWFkMGItM2RmYzU5ZTI2NDQ4In0.LFjHhtSDZi75ar-UTuTFY_G-yjbik6OivF2DWZJjlYA",
  "access_expires_at": "2026-10-30T15:43:02.244629853Z",
  "refresh_token": "ZOCwRz6LLfN7CnST5ZMsHorbqiDtT5XY3vq8rBaDwZY",
  "refresh_expires_at": "2026-10-31T03:28:02.244043522Z",
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
  "session_id": "481a86fd-5e7a-4c03-892f-2e0e9527c71c",
  "subject": {
    "type": "STAFF",
    "id": "04f20d10-faa2-4386-bfcf-0d466abe8fa8"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNGYyMGQxMC1mYWEyLTQzODYtYmZjZi0wZDQ2NmFiZThmYTgiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzQ5ODIsImlhdCI6MTc5MzM3NDA4MiwianRpIjoiNGVlM2NhYmUtYmYwOS00ZjljLWI0NzctZmNkZDcxNDY5ODBiIiwic2lkIjoiNDgxYTg2ZmQtNWU3YS00YzAzLTg5MmYtMmUwZTk1MjdjNzFjIn0.mM3kxn_gfZStTtXXjPs2gHzL1hlp6FZpDr2oORcVBE4",
  "access_expires_at": "2026-10-30T15:43:02.824205594Z",
  "refresh_token": "Yuq25KWAeY7k4JBZPR8__brJdWkpVheceEr7CBB8Wwo",
  "refresh_expires_at": "2026-10-31T03:28:02.823211379Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-21190"
}
```

```json
{
  "challenge_id": "6749619c-6cb8-435d-9c9b-4c6fc80d7909",
  "expires_at": "2026-10-30T15:33:03.106630054Z",
  "resend_available_at": "2026-10-30T15:28:04.106630054Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "485864",
  "sent_at": "2026-10-30T15:28:03.10958303Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6749619c-6cb8-435d-9c9b-4c6fc80d7909",
  "code": "485864",
  "device_ref": "sandbox-21190"
}
```

```json
{
  "session_id": "00fba48f-e674-4844-bf8b-8c5f1285edea",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NDk4MywiaWF0IjoxNzkzMzc0MDgzLCJqdGkiOiI2Njc4YWNmNy1lMDAyLTQwNzYtYTQ1Yy1lNmViY2I4YzI0MDMiLCJzaWQiOiIwMGZiYTQ4Zi1lNjc0LTQ4NDQtYmY4Yi04YzVmMTI4NWVkZWEifQ.2TV5fW1tNLRQUWHGWiZ049b1V48k5toxzS1ecvhsmTE",
  "access_expires_at": "2026-10-30T15:43:03.41464031Z",
  "refresh_token": "UFVhGE3p_vLhcARJj9AkOrqkpEVn-8HMqfVxhfq7Uwc",
  "refresh_expires_at": "2026-11-29T15:28:03.414051565Z",
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
  "command_id": "fafa91b9-ed38-4418-b082-e840fdbe5522",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:28:03Z",
    "sequence": 1793374084386
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4415464a-c3b6-4a38-af50-da3a987691bc",
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
  "last_heartbeat_at": "2026-10-30T15:28:04.018414Z",
  "last_location_at": "2026-10-30T15:28:04.018414Z",
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
  "command_id": "e4acf4d8-d0e4-4a51-8213-23abc39e00be",
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
  "effective_at": "2026-10-30T15:28:04.610041Z",
  "changed_by": "04f20d10-faa2-4386-bfcf-0d466abe8fa8",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "04f20d10-faa2-4386-bfcf-0d466abe8fa8",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-30T15:18:32.249428Z",
  "last_entries": [
    {
      "order_id": "e89853a2-2b33-49cd-8885-8495093418e1",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T15:18:32.249428Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "994fdc98-c1e7-4d89-acb7-e9b8ca50aa97",
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
  "id": "1a2200f5-9a8c-4d3f-be93-1a11bce9e911",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:33:05.191836Z",
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
  "command_id": "fe402805-50fe-4260-af4b-9aa482ca5ec9",
  "quote_id": "1a2200f5-9a8c-4d3f-be93-1a11bce9e911",
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
    "phone": "+3806711122355"
  }
}
```

```json
{
  "id": "528e03ac-3b4e-4da0-b91c-d1760c8c3b6a",
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
  "created_at": "2026-10-30T15:28:05.485014Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711122355"
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
    "id": "26f556f5-b126-49ef-bef7-ced8a0dcfb07",
    "order_id": "528e03ac-3b4e-4da0-b91c-d1760c8c3b6a",
    "expires_at": "2026-10-30T15:28:20.488962Z",
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

`POST /api/driver/v1/offers/26f556f5-b126-49ef-bef7-ced8a0dcfb07/accept` → **200**

```json
{
  "command_id": "2f13c4ae-4a23-4193-91e2-98af283cd648"
}
```

```json
{
  "id": "c3ee2299-a556-48fc-93a0-5a278287f177",
  "order_id": "528e03ac-3b4e-4da0-b91c-d1760c8c3b6a",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "225c5306-6d96-4c44-96fd-2b9d695e9ac5",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "225c5306-6d96-4c44-96fd-2b9d695e9ac5",
  "order_id": "528e03ac-3b4e-4da0-b91c-d1760c8c3b6a",
  "assignment_id": "c3ee2299-a556-48fc-93a0-5a278287f177",
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
    "phone": "+3806711122355"
  }
}
```

`POST /api/driver/v1/work-sessions/4415464a-c3b6-4a38-af50-da3a987691bc/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:28:06Z",
    "sequence": 1793374086664
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4415464a-c3b6-4a38-af50-da3a987691bc",
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
  "last_heartbeat_at": "2026-10-30T15:28:06.684816Z",
  "last_location_at": "2026-10-30T15:28:06.684816Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/225c5306-6d96-4c44-96fd-2b9d695e9ac5/arrive` → **200**

```json
{
  "command_id": "62004d99-f5f7-4cf9-9d99-97ab25ba876f",
  "expected_version": 0
}
```

```json
{
  "id": "225c5306-6d96-4c44-96fd-2b9d695e9ac5",
  "order_id": "528e03ac-3b4e-4da0-b91c-d1760c8c3b6a",
  "assignment_id": "c3ee2299-a556-48fc-93a0-5a278287f177",
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
  "arrived_at": "2026-10-30T15:28:06.984141Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711122355"
  }
}
```

`POST /api/driver/v1/trips/225c5306-6d96-4c44-96fd-2b9d695e9ac5/start` → **200**

```json
{
  "command_id": "50a230ec-e0d3-440f-80ce-3057b24bdbb0",
  "expected_version": 1
}
```

```json
{
  "id": "225c5306-6d96-4c44-96fd-2b9d695e9ac5",
  "order_id": "528e03ac-3b4e-4da0-b91c-d1760c8c3b6a",
  "assignment_id": "c3ee2299-a556-48fc-93a0-5a278287f177",
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
  "arrived_at": "2026-10-30T15:28:06.984141Z",
  "started_at": "2026-10-30T15:28:07.294817Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711122355"
  }
}
```

`POST /api/driver/v1/trips/225c5306-6d96-4c44-96fd-2b9d695e9ac5/complete` → **200**

```json
{
  "command_id": "f7b654ba-5539-4f71-89c1-dde49009680c",
  "expected_version": 2,
  "reported_at": "2026-10-30T15:28:07Z",
  "cash_received": true
}
```

```json
{
  "id": "225c5306-6d96-4c44-96fd-2b9d695e9ac5",
  "order_id": "528e03ac-3b4e-4da0-b91c-d1760c8c3b6a",
  "assignment_id": "c3ee2299-a556-48fc-93a0-5a278287f177",
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
  "arrived_at": "2026-10-30T15:28:06.984141Z",
  "started_at": "2026-10-30T15:28:07.294817Z",
  "completed_at": "2026-10-30T15:28:07.599095Z",
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
  "command_id": "1797ea2b-5190-43fe-ab34-50c8ffbe7f54",
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
  "id": "f8b4ce17-220a-45ef-b31d-7b9490682ff5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:33:07.931387Z",
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
  "command_id": "8db7f589-b9e1-455f-be45-5527ef39649e",
  "quote_id": "f8b4ce17-220a-45ef-b31d-7b9490682ff5",
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
    "phone": "+380671118525"
  }
}
```

```json
{
  "id": "77b7f220-e14e-4bb2-929d-eb68fc720d73",
  "short_number": 23,
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
  "created_at": "2026-10-30T15:28:08.25547Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671118525"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/77b7f220-e14e-4bb2-929d-eb68fc720d73` → **200**

```json
{
  "id": "77b7f220-e14e-4bb2-929d-eb68fc720d73",
  "short_number": 23,
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
  "created_at": "2026-10-30T15:28:08.25547Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671118525"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/77b7f220-e14e-4bb2-929d-eb68fc720d73/cancel` → **200**

```json
{
  "command_id": "afa8213f-d4ef-4bb3-a149-b3bd48ec9826",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "77b7f220-e14e-4bb2-929d-eb68fc720d73",
  "short_number": 23,
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
  "created_at": "2026-10-30T15:28:08.25547Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671118525"
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
  "staff_id": "04f20d10-faa2-4386-bfcf-0d466abe8fa8",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-30T15:18:32.249428Z",
  "last_entries": [
    {
      "order_id": "77b7f220-e14e-4bb2-929d-eb68fc720d73",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-30T15:28:08.891742Z"
    },
    {
      "order_id": "528e03ac-3b4e-4da0-b91c-d1760c8c3b6a",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-30T15:28:07.604143Z"
    },
    {
      "order_id": "e89853a2-2b33-49cd-8885-8495093418e1",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T15:18:32.249428Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4415464a-c3b6-4a38-af50-da3a987691bc",
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
  "last_heartbeat_at": "2026-10-30T15:28:06.684816Z",
  "last_location_at": "2026-10-30T15:28:06.684816Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/4415464a-c3b6-4a38-af50-da3a987691bc/close` → **200**

```json
{
  "command_id": "4f9576a4-8382-4272-82f1-bd7f6b87d0b3",
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

Done: operator bonus for fulfilled 528e03ac-3b4e-4da0-b91c-d1760c8c3b6a and operator-fault cancellation 77b7f220-e14e-4bb2-929d-eb68fc720d73.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676555302",
  "device_ref": "sandbox-14844"
}
```

```json
{
  "challenge_id": "3992603a-d833-4a48-92c9-c665d65cbb55",
  "expires_at": "2026-10-30T15:33:13.348209217Z",
  "resend_available_at": "2026-10-30T15:28:14.348209217Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380676555302` → **200**

```json
{
  "phone": "+380676555302",
  "audience": "CLIENT",
  "code": "727528",
  "sent_at": "2026-10-30T15:28:13.350919655Z",
  "channel": "SMS"
}
```

## "Call me instead" on the first try still gets an SMS; the resend is a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677452464",
  "device_ref": "sandbox-7517",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "8d541db7-6a07-421b-bb08-326180897376",
  "expires_at": "2026-10-30T15:33:14.870923804Z",
  "resend_available_at": "2026-10-30T15:28:15.870923804Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380677452464` → **200**

```json
{
  "phone": "+380677452464",
  "audience": "CLIENT",
  "code": "751776",
  "sent_at": "2026-10-30T15:28:14.873237413Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677452464",
  "device_ref": "sandbox-464",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "d03e66ff-e7e1-47ad-8437-1fb00cf9b74f",
  "expires_at": "2026-10-30T15:33:16.380033177Z",
  "resend_available_at": "2026-10-30T15:28:17.380033177Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380677452464` → **200**

```json
{
  "phone": "+380677452464",
  "audience": "CLIENT",
  "code": "326590",
  "sent_at": "2026-10-30T15:28:16.383006179Z",
  "channel": "VOICE"
}
```

## The SMS does not get through: one request, one attempt; the resend comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671810000",
  "device_ref": "sandbox-21"
}
```

```json
{
  "challenge_id": "ec936f5f-f914-4d5b-87a6-5deb0ecda3ae",
  "expires_at": "2026-10-30T15:33:17.896969771Z",
  "resend_available_at": "2026-10-30T15:28:18.896969771Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671810000",
  "device_ref": "sandbox-5484"
}
```

```json
{
  "challenge_id": "87765f59-d895-4b2a-b024-e44168d1985d",
  "expires_at": "2026-10-30T15:33:19.411885825Z",
  "resend_available_at": "2026-10-30T15:28:20.411885825Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380671810000` → **200**

```json
{
  "phone": "+380671810000",
  "audience": "CLIENT",
  "code": "993186",
  "sent_at": "2026-10-30T15:28:19.415102123Z",
  "channel": "VOICE"
}
```

## A second call in the hour is made, the third is refused

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671810000",
  "device_ref": "sandbox-18330",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "43bd40c3-d58c-40a1-aee0-804edd808bf4",
  "expires_at": "2026-10-30T15:33:20.947606847Z",
  "resend_available_at": "2026-10-30T15:28:21.947606847Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380671810000` → **200**

```json
{
  "phone": "+380671810000",
  "audience": "CLIENT",
  "code": "907945",
  "sent_at": "2026-10-30T15:28:20.950331178Z",
  "channel": "VOICE"
}
```

`POST /auth/v1/otp/challenges` → **429**

```json
{
  "audience": "CLIENT",
  "phone": "+380671810000",
  "device_ref": "sandbox-32558",
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
  "correlation_id": "962c1045-549a-49e3-ae86-852f08670ee0",
  "retryable": true,
  "retry_after_seconds": 3600
}
```

## Numbers outside Poland and Ukraine get nothing

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+442000012951"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "bc64fe7c-8ccf-48df-871d-e9b993cead23"
}
```

`GET /sandbox/v1/otp?phone=%2B442000012951` → **404**

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+37120025797"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "a2444830-cb3b-4271-bc20-8f97d17ce202"
}
```

`GET /sandbox/v1/otp?phone=%2B37120025797` → **404**

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
  "session_id": "ab565d3a-502b-4343-bc39-b99bbf04bba2",
  "subject": {
    "type": "STAFF",
    "id": "04f20d10-faa2-4386-bfcf-0d466abe8fa8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNGYyMGQxMC1mYWEyLTQzODYtYmZjZi0wZDQ2NmFiZThmYTgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzUwMDMsImlhdCI6MTc5MzM3NDEwMywianRpIjoiNmFjNDA1NDYtY2M4Zi00NTUzLThjY2ItMTg4MTExOGZiNjgwIiwic2lkIjoiYWI1NjVkM2EtNTAyYi00MzQzLWJjMzktYjk5YmJmMDRiYmEyIn0.KRKx_DkJIUlPkNQNfFvDKOcy6DOzvk4uUC3alm_iJVA",
  "access_expires_at": "2026-10-30T15:43:23.683728791Z",
  "refresh_token": "egHT9IpJdEOCL-kXK05A_74BmRC7nzL0npttz2PeN3E",
  "refresh_expires_at": "2026-10-31T03:28:23.683164001Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380671810000` → **200**

```json
{
  "deliveries": [
    {
      "id": "4cac7651-3fd2-454e-aba9-6b747a7e15bc",
      "challenge_id": "43bd40c3-d58c-40a1-aee0-804edd808bf4",
      "phone": "+380671810000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-f69d132a-814c-4f4b-8ead-db2e0feb4f42",
      "error": null,
      "attempted_at": "2026-10-30T15:28:20.950731Z"
    },
    {
      "id": "0d120f71-80d9-4b03-85a6-272c66e9ea43",
      "challenge_id": "87765f59-d895-4b2a-b024-e44168d1985d",
      "phone": "+380671810000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-92623e4e-5a9b-4093-b306-5358c4533193",
      "error": null,
      "attempted_at": "2026-10-30T15:28:19.415508Z"
    },
    {
      "id": "bc0b6f3f-38a4-4ec4-a607-3f674460cf21",
      "challenge_id": "ec936f5f-f914-4d5b-87a6-5deb0ecda3ae",
      "phone": "+380671810000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-30T15:28:17.899945Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380671810000` → **200**

```json
{
  "phone": "+380671810000",
  "audience": "CLIENT",
  "code": "907945",
  "sent_at": "2026-10-30T15:28:20.950331178Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380677452464` → **200**

```json
{
  "deliveries": [
    {
      "id": "e62c75fe-e169-4568-a3b5-21305efa4eab",
      "challenge_id": "d03e66ff-e7e1-47ad-8437-1fb00cf9b74f",
      "phone": "+380677452464",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-3c41b390-5ca4-425d-8212-c71588e0254e",
      "error": null,
      "attempted_at": "2026-10-30T15:28:16.383409Z"
    },
    {
      "id": "2a9bdc6e-5d72-4d5b-8891-87d072dcbe36",
      "challenge_id": "8d541db7-6a07-421b-bb08-326180897376",
      "phone": "+380677452464",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-d2362638-6e10-4863-ae0c-d2cf14eec3ec",
      "error": null,
      "attempted_at": "2026-10-30T15:28:14.873466Z"
    }
  ]
}
```

Done: SMS to +380676555302; SMS then a call to +380677452464; a failed SMS, two calls and a refused third to +380671810000; +44 and +371 refused.

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
  "session_id": "1911c309-1819-4b8d-8d12-03e64390a698",
  "subject": {
    "type": "STAFF",
    "id": "04f20d10-faa2-4386-bfcf-0d466abe8fa8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNGYyMGQxMC1mYWEyLTQzODYtYmZjZi0wZDQ2NmFiZThmYTgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzUwMDQsImlhdCI6MTc5MzM3NDEwNCwianRpIjoiODdjNTIyMzEtNWVhNC00NTQ0LTg3NDMtMGZiMmUxMjljMjFkIiwic2lkIjoiMTkxMWMzMDktMTgxOS00YjhkLThkMTItMDNlNjQzOTBhNjk4In0.RqVzMlwfiXy-ci5alvxjrzuGp4MCyUGe1u8Wl9rbAqc",
  "access_expires_at": "2026-10-30T15:43:24.897495989Z",
  "refresh_token": "_kgMCe9kgIogAhEP2iLFJYHjsdTChOZnqgdWNB7oV3g",
  "refresh_expires_at": "2026-10-31T03:28:24.896948912Z",
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
  "session_id": "c1805cdf-943a-4a2a-91e6-2d8c560de272",
  "subject": {
    "type": "STAFF",
    "id": "04f20d10-faa2-4386-bfcf-0d466abe8fa8"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNGYyMGQxMC1mYWEyLTQzODYtYmZjZi0wZDQ2NmFiZThmYTgiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzUwMDUsImlhdCI6MTc5MzM3NDEwNSwianRpIjoiODcwMDBjYTMtOGMyNC00NGY0LWJmNmItODRiMGJjODI5OWVhIiwic2lkIjoiYzE4MDVjZGYtOTQzYS00YTJhLTkxZTYtMmQ4YzU2MGRlMjcyIn0.0nJcWd1Ry3Q4kU-pdleeTHr3nmLhxf9T30AuDJw8zIY",
  "access_expires_at": "2026-10-30T15:43:25.473398067Z",
  "refresh_token": "TERSC_pxh9AtyN4vVFOao6F-Bck6MbGZYgr6bK5iT8I",
  "refresh_expires_at": "2026-10-31T03:28:25.472783243Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "04f20d10-faa2-4386-bfcf-0d466abe8fa8",
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

`POST /api/admin/v1/staff-extensions/04f20d10-faa2-4386-bfcf-0d466abe8fa8` → **200**

```json
{
  "command_id": "b6144a96-e330-466c-987f-920c3b6e9b9d",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "04f20d10-faa2-4386-bfcf-0d466abe8fa8",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "a847e036-8e54-4598-b009-aa52edf91f21",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T15:28:26.623704Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T15:28:26.623704Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "533414fa-63d1-4ff7-b284-292f4266cf76",
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
  "id": "0ae5c274-80a2-4211-a520-ebb5e4da62c3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:33:27.207767Z",
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
  "command_id": "e9901e3a-94fc-4b29-9371-43e98dc2e94e",
  "quote_id": "0ae5c274-80a2-4211-a520-ebb5e4da62c3",
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
    "phone": "+380677644361"
  }
}
```

```json
{
  "id": "d18e188a-41d5-4c58-9abd-6f661cdbd61a",
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
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:28:27.517951Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677644361"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/d18e188a-41d5-4c58-9abd-6f661cdbd61a/calls` → **201**

```json
{
  "command_id": "cf3c1914-e774-424a-b08c-bfb61b4d9a8c",
  "to": "CALLER"
}
```

```json
{
  "id": "38534425-118c-48b1-86d9-12dc53e6e415",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "04f20d10-faa2-4386-bfcf-0d466abe8fa8",
  "order_ids": [
    "d18e188a-41d5-4c58-9abd-6f661cdbd61a"
  ],
  "started_at": "2026-10-30T15:28:27.855548Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/d18e188a-41d5-4c58-9abd-6f661cdbd61a/calls` → **201**

```json
{
  "command_id": "cf3c1914-e774-424a-b08c-bfb61b4d9a8c",
  "to": "CALLER"
}
```

```json
{
  "id": "38534425-118c-48b1-86d9-12dc53e6e415",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "04f20d10-faa2-4386-bfcf-0d466abe8fa8",
  "order_ids": [
    "d18e188a-41d5-4c58-9abd-6f661cdbd61a"
  ],
  "started_at": "2026-10-30T15:28:27.855548Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "38534425-118c-48b1-86d9-12dc53e6e415",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380677644361",
    "at": "2026-10-30T15:28:27.858009177Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "38534425-118c-48b1-86d9-12dc53e6e415",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.16331",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "38534425-118c-48b1-86d9-12dc53e6e415"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "38534425-118c-48b1-86d9-12dc53e6e415",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=d18e188a-41d5-4c58-9abd-6f661cdbd61a` → **200**

```json
{
  "calls": [
    {
      "id": "38534425-118c-48b1-86d9-12dc53e6e415",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "04f20d10-faa2-4386-bfcf-0d466abe8fa8",
      "order_ids": [
        "d18e188a-41d5-4c58-9abd-6f661cdbd61a"
      ],
      "started_at": "2026-10-30T15:28:27.855548Z",
      "answered_at": "2026-10-30T15:28:28.54344Z",
      "ended_at": "2026-10-30T15:28:28.565244Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=d18e188a-41d5-4c58-9abd-6f661cdbd61a` → **200**

```json
{
  "calls": [
    {
      "id": "38534425-118c-48b1-86d9-12dc53e6e415",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "04f20d10-faa2-4386-bfcf-0d466abe8fa8",
      "order_ids": [
        "d18e188a-41d5-4c58-9abd-6f661cdbd61a"
      ],
      "started_at": "2026-10-30T15:28:27.855548Z",
      "answered_at": "2026-10-30T15:28:28.54344Z",
      "ended_at": "2026-10-30T15:28:28.565244Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=d18e188a-41d5-4c58-9abd-6f661cdbd61a` → **200**

```json
{
  "calls": [
    {
      "id": "38534425-118c-48b1-86d9-12dc53e6e415",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "04f20d10-faa2-4386-bfcf-0d466abe8fa8",
      "order_ids": [
        "d18e188a-41d5-4c58-9abd-6f661cdbd61a"
      ],
      "started_at": "2026-10-30T15:28:27.855548Z",
      "answered_at": "2026-10-30T15:28:28.54344Z",
      "ended_at": "2026-10-30T15:28:28.565244Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T15:28:31.540709Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/d18e188a-41d5-4c58-9abd-6f661cdbd61a` → **200**

```json
{
  "id": "d18e188a-41d5-4c58-9abd-6f661cdbd61a",
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
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:28:27.517951Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677644361"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/d18e188a-41d5-4c58-9abd-6f661cdbd61a/cancel` → **200**

```json
{
  "command_id": "5f20906d-da5f-4faa-9519-7d03f9a38aa8",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "d18e188a-41d5-4c58-9abd-6f661cdbd61a",
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
  "created_at": "2026-10-30T15:28:27.517951Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677644361"
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
  "command_id": "4f321632-5520-446f-a058-9ba590c9eb4d",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-30T15:28:34.144815Z",
  "extension": "101"
}
```

Done: outgoing call 38534425-118c-48b1-86d9-12dc53e6e415 from order d18e188a-41d5-4c58-9abd-6f661cdbd61a, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631534125",
  "device_ref": "sandbox-28013"
}
```

```json
{
  "challenge_id": "baa33143-3dfa-4ee9-90c9-b23033d7ac61",
  "expires_at": "2026-10-30T15:33:34.449942127Z",
  "resend_available_at": "2026-10-30T15:28:35.449942127Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631534125` → **200**

```json
{
  "phone": "+380631534125",
  "audience": "CLIENT",
  "code": "915956",
  "sent_at": "2026-10-30T15:28:34.452698653Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "baa33143-3dfa-4ee9-90c9-b23033d7ac61",
  "code": "915956",
  "device_ref": "sandbox-28013"
}
```

```json
{
  "session_id": "cb78a043-b2a5-465c-aab4-e5ff2ad18be8",
  "subject": {
    "type": "CLIENT",
    "id": "a6b37a4c-2b0a-4c52-9f37-85d9dce7c910"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNmIzN2E0Yy0yYjBhLTRjNTItOWYzNy04NWQ5ZGNlN2M5MTAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc1MDE0LCJpYXQiOjE3OTMzNzQxMTQsImp0aSI6IjY2NGM5Yzc1LWExMTEtNGI3OS1hNWI4LTI2MDllZjM3MGI4MCIsInNpZCI6ImNiNzhhMDQzLWIyYTUtNDY1Yy1hYWI0LWU1ZmYyYWQxOGJlOCJ9.RWEj5q-uL7ZEXIulbTWMUBr4_Ek7UUCDTAm7l_9Hweg",
  "access_expires_at": "2026-10-30T15:43:34.767553248Z",
  "refresh_token": "l846nCMYa545uSD6yA1vhXF_X-OUmwZ-a16IKJRJjGc",
  "refresh_expires_at": "2026-11-29T15:28:34.767023143Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "a6b37a4c-2b0a-4c52-9f37-85d9dce7c910",
  "session_id": "cb78a043-b2a5-465c-aab4-e5ff2ad18be8",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631534125",
  "device_ref": "sandbox-29400"
}
```

```json
{
  "challenge_id": "feec014d-ccdb-41e2-a869-8f8a9f6999c5",
  "expires_at": "2026-10-30T15:33:37.325077546Z",
  "resend_available_at": "2026-10-30T15:28:38.325077546Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631534125` → **200**

```json
{
  "phone": "+380631534125",
  "audience": "CLIENT",
  "code": "112953",
  "sent_at": "2026-10-30T15:28:37.327625889Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "feec014d-ccdb-41e2-a869-8f8a9f6999c5",
  "code": "112953",
  "device_ref": "sandbox-29400"
}
```

```json
{
  "session_id": "f06f42c0-0359-4d64-adfd-31ec0674f6c9",
  "subject": {
    "type": "CLIENT",
    "id": "a6b37a4c-2b0a-4c52-9f37-85d9dce7c910"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNmIzN2E0Yy0yYjBhLTRjNTItOWYzNy04NWQ5ZGNlN2M5MTAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc1MDE3LCJpYXQiOjE3OTMzNzQxMTcsImp0aSI6IjkzOGNiMzQ1LWZjYWMtNGExZC05NDg1LThmYjZkNTYzOTdkZiIsInNpZCI6ImYwNmY0MmMwLTAzNTktNGQ2NC1hZGZkLTMxZWMwNjc0ZjZjOSJ9.jstGtoUAdzSqJoQ86AJiySUcRN1n5OFGXaOsghlyRLs",
  "access_expires_at": "2026-10-30T15:43:37.635806062Z",
  "refresh_token": "GQov75PNSfWycOSASJ7gEUPSGo6ylZfux7GDDhJQBrA",
  "refresh_expires_at": "2026-11-29T15:28:37.63521818Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "084b95c1-75d2-458e-a56d-7f23c641b5b2",
  "expires_at": "2026-10-30T15:33:39.926336444Z",
  "resend_available_at": "2026-10-30T15:28:40.926336444Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631534125` → **200**

```json
{
  "phone": "+380631534125",
  "audience": "CLIENT",
  "code": "619858",
  "sent_at": "2026-10-30T15:28:39.928967725Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380638998708"
}
```

```json
{
  "challenge_id": "ff3b7f9c-3ccd-40d3-a250-d9389e79f42a",
  "expires_at": "2026-10-30T15:33:40.22692923Z",
  "resend_available_at": "2026-10-30T15:28:41.22692923Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638998708` → **200**

```json
{
  "phone": "+380638998708",
  "audience": "CLIENT",
  "code": "088810",
  "sent_at": "2026-10-30T15:28:40.229333496Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "e439fa4b-dfa3-4de6-b062-3790f50cae95",
  "current_challenge_id": "084b95c1-75d2-458e-a56d-7f23c641b5b2",
  "current_code": "000000",
  "new_challenge_id": "ff3b7f9c-3ccd-40d3-a250-d9389e79f42a",
  "new_code": "088810"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "9609f5e0-fd20-4b23-9aaf-904ce3d3a29d"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "e97851f5-294c-4186-9fcc-12fcf973633e",
  "current_challenge_id": "084b95c1-75d2-458e-a56d-7f23c641b5b2",
  "current_code": "619858",
  "new_challenge_id": "ff3b7f9c-3ccd-40d3-a250-d9389e79f42a",
  "new_code": "088810"
}
```

```json
{
  "subject_id": "a6b37a4c-2b0a-4c52-9f37-85d9dce7c910",
  "phone": "+380638998708",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "a6b37a4c-2b0a-4c52-9f37-85d9dce7c910",
  "session_id": "cb78a043-b2a5-465c-aab4-e5ff2ad18be8",
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
  "correlation_id": "33cb3cf3-769a-43ae-9de1-4897b1a85086"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638998708",
  "device_ref": "sandbox-5606"
}
```

```json
{
  "challenge_id": "9371356c-971a-4c36-a7aa-ad571570ca16",
  "expires_at": "2026-10-30T15:33:43.725513028Z",
  "resend_available_at": "2026-10-30T15:28:44.725513028Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638998708` → **200**

```json
{
  "phone": "+380638998708",
  "audience": "CLIENT",
  "code": "714443",
  "sent_at": "2026-10-30T15:28:43.728308338Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9371356c-971a-4c36-a7aa-ad571570ca16",
  "code": "714443",
  "device_ref": "sandbox-5606"
}
```

```json
{
  "session_id": "4b915f80-bffe-4d84-a412-dbf15a72a9e0",
  "subject": {
    "type": "CLIENT",
    "id": "a6b37a4c-2b0a-4c52-9f37-85d9dce7c910"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNmIzN2E0Yy0yYjBhLTRjNTItOWYzNy04NWQ5ZGNlN2M5MTAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc1MDI0LCJpYXQiOjE3OTMzNzQxMjQsImp0aSI6IjI0ZWI5NTM0LTQxZWYtNDRjMy1hODI1LTI0ZTkwYmM3Zjg5ZiIsInNpZCI6IjRiOTE1ZjgwLWJmZmUtNGQ4NC1hNDEyLWRiZjE1YTcyYTllMCJ9.XVYywLye1AZ3nyvcFrwVPQ2DhJjhXJLcOaC2RxBQnuQ",
  "access_expires_at": "2026-10-30T15:43:44.052435181Z",
  "refresh_token": "C5R4VYcgvaM4R0SmJiIhUvBg0nJC3h_vhMiLT3JWPeA",
  "refresh_expires_at": "2026-11-29T15:28:44.051825848Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "a6b37a4c-2b0a-4c52-9f37-85d9dce7c910",
  "session_id": "4b915f80-bffe-4d84-a412-dbf15a72a9e0",
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
  "session_id": "c86091db-ad91-4bde-bc66-773521ab06ac",
  "subject": {
    "type": "STAFF",
    "id": "04f20d10-faa2-4386-bfcf-0d466abe8fa8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNGYyMGQxMC1mYWEyLTQzODYtYmZjZi0wZDQ2NmFiZThmYTgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzUwMjQsImlhdCI6MTc5MzM3NDEyNCwianRpIjoiNTQ5ZWVmOGUtZDgwNS00YmMyLTkxNDUtOWY5MjIwNzgxYWJjIiwic2lkIjoiYzg2MDkxZGItYWQ5MS00YmRlLWJjNjYtNzczNTIxYWIwNmFjIn0.k7NluLa6PS1UJCAUNfOP5qwa7Ukq4J7_WApE6_rKnpA",
  "access_expires_at": "2026-10-30T15:43:44.90780761Z",
  "refresh_token": "pLkHfIcaGemyjQYunYBckCfLene1eJCNh289_5z_lPU",
  "refresh_expires_at": "2026-10-31T03:28:44.907258079Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/a6b37a4c-2b0a-4c52-9f37-85d9dce7c910` → **200**

```json
{
  "client": {
    "id": "a6b37a4c-2b0a-4c52-9f37-85d9dce7c910",
    "phone": "+380638998708",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T15:28:34.76547Z",
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

`POST /api/admin/v1/clients/a6b37a4c-2b0a-4c52-9f37-85d9dce7c910/phone/new-code` → **201**

```json
{
  "phone": "+380630931527"
}
```

```json
{
  "challenge_id": "fe447456-70ed-4d9f-99b5-a0bbcfc27249",
  "expires_at": "2026-10-30T15:33:45.519543487Z",
  "resend_available_at": "2026-10-30T15:28:46.519543487Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630931527` → **200**

```json
{
  "phone": "+380630931527",
  "audience": "CLIENT",
  "code": "606539",
  "sent_at": "2026-10-30T15:28:45.522163831Z",
  "channel": "SMS"
}
```

## Without the right code nothing changes; with it, support sets the phone

`POST /api/admin/v1/clients/a6b37a4c-2b0a-4c52-9f37-85d9dce7c910/phone` → **422**

```json
{
  "command_id": "095d6bd6-4a14-40bd-b9dc-26e503a6c302",
  "expected_version": 3,
  "new_challenge_id": "fe447456-70ed-4d9f-99b5-a0bbcfc27249",
  "new_code": "606540",
  "reason": "Passport checked at the office"
}
```

```json
{
  "instance": "/api/admin/v1/clients/a6b37a4c-2b0a-4c52-9f37-85d9dce7c910/phone",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "8defb52c-7e29-42b3-b9e8-c0200e9609db"
}
```

`POST /api/admin/v1/clients/a6b37a4c-2b0a-4c52-9f37-85d9dce7c910/phone` → **400**

```json
{
  "command_id": "7566356f-07b0-4643-8dc6-b020949a8e87",
  "expected_version": 3,
  "new_challenge_id": "fe447456-70ed-4d9f-99b5-a0bbcfc27249",
  "new_code": "606539",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/a6b37a4c-2b0a-4c52-9f37-85d9dce7c910/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "5b5ffaa4-5265-4969-a783-b61f420dd3e1",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/clients/a6b37a4c-2b0a-4c52-9f37-85d9dce7c910/phone` → **200**

```json
{
  "command_id": "20a28492-1555-4877-a879-8d48ea7127c4",
  "expected_version": 3,
  "new_challenge_id": "fe447456-70ed-4d9f-99b5-a0bbcfc27249",
  "new_code": "606539",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "a6b37a4c-2b0a-4c52-9f37-85d9dce7c910",
  "phone": "+380630931527",
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
  "correlation_id": "cbb641b3-9351-4733-ba77-37441013bd19"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630931527",
  "device_ref": "sandbox-23775"
}
```

```json
{
  "challenge_id": "73cddfe7-8c36-423d-841f-b2c4383065b1",
  "expires_at": "2026-10-30T15:33:47.040534885Z",
  "resend_available_at": "2026-10-30T15:28:48.040534885Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380630931527` → **200**

```json
{
  "phone": "+380630931527",
  "audience": "CLIENT",
  "code": "188802",
  "sent_at": "2026-10-30T15:28:47.043440545Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "73cddfe7-8c36-423d-841f-b2c4383065b1",
  "code": "188802",
  "device_ref": "sandbox-23775"
}
```

```json
{
  "session_id": "973b14ee-6b34-460b-b1e4-90a9493367bb",
  "subject": {
    "type": "CLIENT",
    "id": "a6b37a4c-2b0a-4c52-9f37-85d9dce7c910"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNmIzN2E0Yy0yYjBhLTRjNTItOWYzNy04NWQ5ZGNlN2M5MTAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc1MDI3LCJpYXQiOjE3OTMzNzQxMjcsImp0aSI6IjYwZDE5YzM2LTc0YTktNDBkNy1hNGUwLTI2ZTc0ZDEwMGQ0OCIsInNpZCI6Ijk3M2IxNGVlLTZiMzQtNDYwYi1iMWU0LTkwYTk0OTMzNjdiYiJ9.m_3zgVsNDEGssf_r1hO2plYvd91gcwFAaFlGDftWRto",
  "access_expires_at": "2026-10-30T15:43:47.35397685Z",
  "refresh_token": "rd1jRkE8hr7HIbsUsas0xgZUzzve7kgppW5AmhfasiQ",
  "refresh_expires_at": "2026-11-29T15:28:47.353348702Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "a6b37a4c-2b0a-4c52-9f37-85d9dce7c910",
  "session_id": "973b14ee-6b34-460b-b1e4-90a9493367bb",
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
  "phone": "+380631265517",
  "device_ref": "sandbox-29727"
}
```

```json
{
  "challenge_id": "6035f972-2719-467f-9e8c-29e28f5a3b36",
  "expires_at": "2026-10-30T15:33:47.920536115Z",
  "resend_available_at": "2026-10-30T15:28:48.920536115Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631265517` → **200**

```json
{
  "phone": "+380631265517",
  "audience": "CLIENT",
  "code": "193980",
  "sent_at": "2026-10-30T15:28:47.923660967Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6035f972-2719-467f-9e8c-29e28f5a3b36",
  "code": "193980",
  "device_ref": "sandbox-29727"
}
```

```json
{
  "session_id": "1fe3782f-6e5b-4dc7-aad0-d269a9d19ec4",
  "subject": {
    "type": "CLIENT",
    "id": "77b97f52-7f84-4718-96c7-1928109cb607"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3N2I5N2Y1Mi03Zjg0LTQ3MTgtOTZjNy0xOTI4MTA5Y2I2MDciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc1MDI4LCJpYXQiOjE3OTMzNzQxMjgsImp0aSI6Ijc3ZDEyZjFhLWQzYWEtNDEzOC1iNjM5LWI1OTI0OGVhYjgyZCIsInNpZCI6IjFmZTM3ODJmLTZlNWItNGRjNy1hYWQwLWQyNjlhOWQxOWVjNCJ9.h0w-PKxMgxT9FqZqmcsD9yl-Xc_PVLms9dEw-rZHKio",
  "access_expires_at": "2026-10-30T15:43:48.239761379Z",
  "refresh_token": "y5l_lERWRNhmBORQ9giU0QC_V5DiTjj3NmvtibEyIRs",
  "refresh_expires_at": "2026-11-29T15:28:48.239218862Z",
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
  "session_id": "fb90312e-68a1-4906-a3b0-f47800637e01",
  "subject": {
    "type": "STAFF",
    "id": "04f20d10-faa2-4386-bfcf-0d466abe8fa8"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNGYyMGQxMC1mYWEyLTQzODYtYmZjZi0wZDQ2NmFiZThmYTgiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzUwMjksImlhdCI6MTc5MzM3NDEyOSwianRpIjoiNTc0MGU5ZWEtYTM2My00NWI3LWJjZmYtZjM2ZWFjMzQ0N2VkIiwic2lkIjoiZmI5MDMxMmUtNjhhMS00OTA2LWEzYjAtZjQ3ODAwNjM3ZTAxIn0.JYGsAdHGkWfACKZICr9efca_BfMdZDfMKeZKAV70Fic",
  "access_expires_at": "2026-10-30T15:43:49.430722371Z",
  "refresh_token": "Op3YqulKfpnq5U5U4DuyCfxqNOZANJ0gPWfNkTyfvDk",
  "refresh_expires_at": "2026-10-31T03:28:49.430132705Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380631265517` → **200**

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
  "correlation_id": "ac3738a2-e1af-4a7a-bb1b-aed0d93e09f6"
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
  "session_id": "52074b76-d9f3-4bdd-822e-956b0a3ed1ce",
  "subject": {
    "type": "STAFF",
    "id": "04f20d10-faa2-4386-bfcf-0d466abe8fa8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNGYyMGQxMC1mYWEyLTQzODYtYmZjZi0wZDQ2NmFiZThmYTgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzUwMzAsImlhdCI6MTc5MzM3NDEzMCwianRpIjoiNjc3YzZjYjUtMWNmMS00NTIyLTg1NWEtNGNiNTZiODZjMmU3Iiwic2lkIjoiNTIwNzRiNzYtZDlmMy00YmRkLTgyMmUtOTU2YjBhM2VkMWNlIn0.HmiGnLM0Y43mt3qAC8kVhRGaei096PWeMfRPctJ4iIs",
  "access_expires_at": "2026-10-30T15:43:50.599829339Z",
  "refresh_token": "rJbVGMlr1AR95f-4MHOOOAVeSfAjpqbsu3h-RzruNvc",
  "refresh_expires_at": "2026-10-31T03:28:50.599252032Z",
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
  "changed_by": "04f20d10-faa2-4386-bfcf-0d466abe8fa8",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T15:14:26.61193Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "6af5b684-96e2-40eb-8dcf-dbdcabad74d0",
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
  "changed_by": "04f20d10-faa2-4386-bfcf-0d466abe8fa8",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-30T15:28:51.190873892Z"
}
```

## The rider books the airport for 2026-10-30T18:28:50Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600870990",
  "device_ref": "sandbox-7974"
}
```

```json
{
  "challenge_id": "50907d92-bb4b-4368-839e-6e073f1d16f9",
  "expires_at": "2026-10-30T15:33:51.500573082Z",
  "resend_available_at": "2026-10-30T15:28:52.500573082Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600870990` → **200**

```json
{
  "phone": "+48600870990",
  "audience": "CLIENT",
  "code": "132262",
  "sent_at": "2026-10-30T15:28:51.503475115Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "50907d92-bb4b-4368-839e-6e073f1d16f9",
  "code": "132262",
  "device_ref": "sandbox-7974"
}
```

```json
{
  "session_id": "01828872-8946-4b57-a2f9-9e48933fab28",
  "subject": {
    "type": "CLIENT",
    "id": "cf589083-d653-4083-a46e-b8a65f5b4bf6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZjU4OTA4My1kNjUzLTQwODMtYTQ2ZS1iOGE2NWY1YjRiZjYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc1MDMxLCJpYXQiOjE3OTMzNzQxMzEsImp0aSI6IjM4ZTUyN2RjLTQ2OTMtNGE4ZC1iNjQyLTM1ZDU0NDFkYjhlMiIsInNpZCI6IjAxODI4ODcyLTg5NDYtNGI1Ny1hMmY5LTllNDg5MzNmYWIyOCJ9.qoGUDL4lhcj3KRYiEvIox3p_q_pYD1tMP4AKwabl1wU",
  "access_expires_at": "2026-10-30T15:43:51.820943915Z",
  "refresh_token": "fOGkbOpGs4nf2M01FL4aKj2QNhCVr4HlfNclDT3SUnA",
  "refresh_expires_at": "2026-11-29T15:28:51.820338829Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "75c5061b-05e8-49d8-8f82-b6496f349379",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-30T18:28:50Z"
}
```

```json
{
  "id": "8a8150f6-ce20-4002-ac11-f9baa3e7a295",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:33:52.119439Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-30T18:28:50Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "a440e7f0-997b-4f3b-b0e0-abdf3b95d8ea",
  "quote_id": "8a8150f6-ce20-4002-ac11-f9baa3e7a295",
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
  "pickup_at": "2026-10-30T18:28:50Z"
}
```

```json
{
  "id": "ad16ac85-268d-46fa-9156-bab4bc36b31c",
  "short_number": 25,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "cf589083-d653-4083-a46e-b8a65f5b4bf6",
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
  "created_at": "2026-10-30T15:28:52.424063Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T18:28:50Z",
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
  "device_ref": "sandbox-20463"
}
```

```json
{
  "challenge_id": "e97ae74b-f0d4-422c-bda3-722a3782435d",
  "expires_at": "2026-10-30T15:33:52.731534823Z",
  "resend_available_at": "2026-10-30T15:28:53.731534823Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "643904",
  "sent_at": "2026-10-30T15:28:52.734480914Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e97ae74b-f0d4-422c-bda3-722a3782435d",
  "code": "643904",
  "device_ref": "sandbox-20463"
}
```

```json
{
  "session_id": "9f0a5db6-d583-48b9-902c-8c41d5429692",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NTAzMywiaWF0IjoxNzkzMzc0MTMzLCJqdGkiOiJkOWIyZjllYy1jN2U2LTRmZTUtOGI2Ny1mOGRhMjUyZWEwNDgiLCJzaWQiOiI5ZjBhNWRiNi1kNTgzLTQ4YjktOTAyYy04YzQxZDU0Mjk2OTIifQ.15wWKu4W9_WMnVJVwK4b7uk0UmF0Yr_7KzeZ_-wTTxE",
  "access_expires_at": "2026-10-30T15:43:53.045160477Z",
  "refresh_token": "kaT8V5Mjj9yblsENl-jR_EH-IGsqPmHsXEjwPCDXkCY",
  "refresh_expires_at": "2026-11-29T15:28:53.04453468Z",
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
  "command_id": "c4589a54-6ad9-49d1-a47f-b6bf94102761",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:28:53Z",
    "sequence": 1793374133651
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "13121d15-675a-4d33-8de7-ba58a6cbb951",
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
  "last_heartbeat_at": "2026-10-30T15:28:53.672093Z",
  "last_location_at": "2026-10-30T15:28:53.672093Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "ad16ac85-268d-46fa-9156-bab4bc36b31c",
      "short_number": 25,
      "pickup_at": "2026-10-30T18:28:50Z",
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

`POST /api/driver/v1/preorders/ad16ac85-268d-46fa-9156-bab4bc36b31c/reserve` → **200**

```json
{
  "command_id": "2bad8fa0-0643-47ae-9c9e-50dc4fb92070"
}
```

```json
{
  "id": "9d51fdce-1f4f-4a5c-b3a2-162b92ab96ad",
  "state": "RESERVED",
  "order": {
    "order_id": "ad16ac85-268d-46fa-9156-bab4bc36b31c",
    "short_number": 25,
    "pickup_at": "2026-10-30T18:28:50Z",
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
  "reserved_at": "2026-10-30T15:28:54.269997Z",
  "confirm_from": "2026-10-30T17:58:50Z",
  "confirm_until": "2026-10-30T18:08:50Z",
  "drop_until": "2026-10-30T17:28:50Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "9d51fdce-1f4f-4a5c-b3a2-162b92ab96ad",
      "state": "RESERVED",
      "order": {
        "order_id": "ad16ac85-268d-46fa-9156-bab4bc36b31c",
        "short_number": 25,
        "pickup_at": "2026-10-30T18:28:50Z",
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
      "reserved_at": "2026-10-30T15:28:54.269997Z",
      "confirm_from": "2026-10-30T17:58:50Z",
      "confirm_until": "2026-10-30T18:08:50Z",
      "drop_until": "2026-10-30T17:28:50Z"
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
      "id": "9d51fdce-1f4f-4a5c-b3a2-162b92ab96ad",
      "state": "RESERVED",
      "order": {
        "order_id": "ad16ac85-268d-46fa-9156-bab4bc36b31c",
        "short_number": 25,
        "pickup_at": "2026-10-30T18:28:50Z",
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
      "reserved_at": "2026-10-30T15:28:54.269997Z",
      "confirm_from": "2026-10-30T17:58:50Z",
      "confirm_until": "2026-10-30T18:08:50Z",
      "drop_until": "2026-10-30T17:28:50Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/9d51fdce-1f4f-4a5c-b3a2-162b92ab96ad/confirm` → **409**

```json
{
  "command_id": "52ec75bc-3cae-464c-8abf-019a77573aaa"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/9d51fdce-1f4f-4a5c-b3a2-162b92ab96ad/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "5c90b4bd-3490-4cbd-9301-7a8fb7764472"
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
  "session_id": "11070301-16fd-4eb2-9746-f87abe68505b",
  "subject": {
    "type": "STAFF",
    "id": "04f20d10-faa2-4386-bfcf-0d466abe8fa8"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNGYyMGQxMC1mYWEyLTQzODYtYmZjZi0wZDQ2NmFiZThmYTgiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzUwMzUsImlhdCI6MTc5MzM3NDEzNSwianRpIjoiOTM2N2IwNjQtODk0OS00NjkyLThmODktZDc4YWNhZDIyOGEwIiwic2lkIjoiMTEwNzAzMDEtMTZmZC00ZWIyLTk3NDYtZjg3YWJlNjg1MDViIn0.U0okFTCTVMgRDKInkpccbq6YLz3AFBiFmuGi2WdPURo",
  "access_expires_at": "2026-10-30T15:43:55.739256903Z",
  "refresh_token": "kjcm8U1B5FzabS8d4SBJsF2tOgXF-gOgH_hadb0FsVY",
  "refresh_expires_at": "2026-10-31T03:28:55.738618805Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/ad16ac85-268d-46fa-9156-bab4bc36b31c` → **200**

```json
{
  "id": "ad16ac85-268d-46fa-9156-bab4bc36b31c",
  "short_number": 25,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "cf589083-d653-4083-a46e-b8a65f5b4bf6",
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
  "created_at": "2026-10-30T15:28:52.424063Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-30T18:28:50Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "9d51fdce-1f4f-4a5c-b3a2-162b92ab96ad",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-30T15:28:54.269997Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/ad16ac85-268d-46fa-9156-bab4bc36b31c/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-30T15:28:52.426359Z",
      "actor": {
        "type": "CLIENT",
        "id": "cf589083-d653-4083-a46e-b8a65f5b4bf6",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "ad16ac85-268d-46fa-9156-bab4bc36b31c",
        "preorder": true,
        "quote_id": "8a8150f6-ce20-4002-ac11-f9baa3e7a295",
        "pickup_at": "2026-10-30T18:28:50Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "51367828-0a41-4b06-9104-7a24c0aec2cd"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-30T15:28:54.271198Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "ad16ac85-268d-46fa-9156-bab4bc36b31c",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "9d51fdce-1f4f-4a5c-b3a2-162b92ab96ad"
      },
      "correlation_id": "51a0a0cf-cf17-4076-b64a-0b80be6d6d12"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order ad16ac85-268d-46fa-9156-bab4bc36b31c, reservation 9d51fdce-1f4f-4a5c-b3a2-162b92ab96ad.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-25714"
}
```

```json
{
  "challenge_id": "f376da8b-5908-4f58-b08a-e46bcb3f9ea2",
  "expires_at": "2026-10-30T15:33:56.632579638Z",
  "resend_available_at": "2026-10-30T15:28:57.632579638Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "047198",
  "sent_at": "2026-10-30T15:28:56.635701789Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f376da8b-5908-4f58-b08a-e46bcb3f9ea2",
  "code": "047198",
  "device_ref": "sandbox-25714"
}
```

```json
{
  "session_id": "0e8926c2-20dd-416f-b10d-d1107c635df6",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NTAzNiwiaWF0IjoxNzkzMzc0MTM2LCJqdGkiOiIyNzU1MjJmNi03ZDdhLTQxZDYtYWVhMC1kMGZiMzhhYWYyYTUiLCJzaWQiOiIwZTg5MjZjMi0yMGRkLTQxNmYtYjEwZC1kMTEwN2M2MzVkZjYifQ.hQaaU5inJeG77H_ExAl-NN6vL9zZuEB4g0S2YS2byVk",
  "access_expires_at": "2026-10-30T15:43:56.947460499Z",
  "refresh_token": "xjSrXPCblidvUfnqosCD2DJqgvrhzvqmO3bn-tCptiA",
  "refresh_expires_at": "2026-11-29T15:28:56.946905918Z",
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
  "command_id": "9adc057b-90a7-4c3e-88c5-20f8239de65d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:28:57Z",
    "sequence": 1793374137539
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "56afb78c-ca49-4b4e-a6d5-c7f36e405f99",
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
  "last_heartbeat_at": "2026-10-30T15:28:57.55793Z",
  "last_location_at": "2026-10-30T15:28:57.55793Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672882692",
  "device_ref": "sandbox-4631"
}
```

```json
{
  "challenge_id": "99a7fd91-ea9b-41ca-abb1-451a0f167a0c",
  "expires_at": "2026-10-30T15:33:57.848072478Z",
  "resend_available_at": "2026-10-30T15:28:58.848072478Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380672882692` → **200**

```json
{
  "phone": "+380672882692",
  "audience": "CLIENT",
  "code": "277517",
  "sent_at": "2026-10-30T15:28:57.85099627Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "99a7fd91-ea9b-41ca-abb1-451a0f167a0c",
  "code": "277517",
  "device_ref": "sandbox-4631"
}
```

```json
{
  "session_id": "c449033d-51d7-4db4-8bb4-78a24314eff5",
  "subject": {
    "type": "CLIENT",
    "id": "294d9699-4bbf-4b74-bad6-9392e5da6b43"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyOTRkOTY5OS00YmJmLTRiNzQtYmFkNi05MzkyZTVkYTZiNDMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc1MDM4LCJpYXQiOjE3OTMzNzQxMzgsImp0aSI6IjUwM2FhM2EyLTgzYzAtNGNlZS04NDU4LTg3NGE4YjgzNzBlZiIsInNpZCI6ImM0NDkwMzNkLTUxZDctNGRiNC04YmI0LTc4YTI0MzE0ZWZmNSJ9.iSbXJtlJq21WIRSv9s-6GbqgdcfjOnMNCHil1YagWHY",
  "access_expires_at": "2026-10-30T15:43:58.170816723Z",
  "refresh_token": "AnYB_w6Je_-FeUhDNge6NbhqeO7eUx-HOG5a_dv3bEs",
  "refresh_expires_at": "2026-11-29T15:28:58.170267442Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e7df718f-06a2-4620-8bc2-40bb987d22ce",
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
  "id": "345f3079-e24f-47be-a30b-001909c7265a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:33:58.469052Z",
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
  "command_id": "ab8a9192-532d-41c1-be8c-cb104a384129",
  "quote_id": "345f3079-e24f-47be-a30b-001909c7265a",
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
  "id": "f54f6d25-1af2-4c30-a9b5-bb385f31cbc5",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "294d9699-4bbf-4b74-bad6-9392e5da6b43",
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
  "created_at": "2026-10-30T15:28:58.785522Z",
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
    "id": "acea2a69-29fe-4dfa-853d-5e2666cddb23",
    "order_id": "f54f6d25-1af2-4c30-a9b5-bb385f31cbc5",
    "expires_at": "2026-10-30T15:29:13.788599Z",
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

`POST /api/driver/v1/offers/acea2a69-29fe-4dfa-853d-5e2666cddb23/accept` → **200**

```json
{
  "command_id": "e88cdff5-c920-4587-9e16-381a18a7b8c9"
}
```

```json
{
  "id": "7bc9c9fd-5835-4fe7-872c-1827725a28fc",
  "order_id": "f54f6d25-1af2-4c30-a9b5-bb385f31cbc5",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "2813ed24-1743-4d8e-9d90-6b568db202f5",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "2813ed24-1743-4d8e-9d90-6b568db202f5",
  "order_id": "f54f6d25-1af2-4c30-a9b5-bb385f31cbc5",
  "assignment_id": "7bc9c9fd-5835-4fe7-872c-1827725a28fc",
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

`POST /api/driver/v1/work-sessions/56afb78c-ca49-4b4e-a6d5-c7f36e405f99/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:28:59Z",
    "sequence": 1793374139968
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "56afb78c-ca49-4b4e-a6d5-c7f36e405f99",
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
  "last_heartbeat_at": "2026-10-30T15:28:59.986307Z",
  "last_location_at": "2026-10-30T15:28:59.986307Z",
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
  "id": "2813ed24-1743-4d8e-9d90-6b568db202f5",
  "order_id": "f54f6d25-1af2-4c30-a9b5-bb385f31cbc5",
  "assignment_id": "7bc9c9fd-5835-4fe7-872c-1827725a28fc",
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

`POST /api/driver/v1/trips/2813ed24-1743-4d8e-9d90-6b568db202f5/arrive` → **200**

```json
{
  "command_id": "4b28819d-bbcf-471d-9e61-c4b6f1783e75",
  "expected_version": 0
}
```

```json
{
  "id": "2813ed24-1743-4d8e-9d90-6b568db202f5",
  "order_id": "f54f6d25-1af2-4c30-a9b5-bb385f31cbc5",
  "assignment_id": "7bc9c9fd-5835-4fe7-872c-1827725a28fc",
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
  "arrived_at": "2026-10-30T15:29:00.560434Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/2813ed24-1743-4d8e-9d90-6b568db202f5/start` → **200**

```json
{
  "command_id": "2f776718-b10a-41df-919b-f6352b9d246e",
  "expected_version": 1
}
```

```json
{
  "id": "2813ed24-1743-4d8e-9d90-6b568db202f5",
  "order_id": "f54f6d25-1af2-4c30-a9b5-bb385f31cbc5",
  "assignment_id": "7bc9c9fd-5835-4fe7-872c-1827725a28fc",
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
  "arrived_at": "2026-10-30T15:29:00.560434Z",
  "started_at": "2026-10-30T15:29:00.861486Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

(the car drives 47 s to the next point)

`POST /api/driver/v1/work-sessions/56afb78c-ca49-4b4e-a6d5-c7f36e405f99/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:29:48Z",
    "sequence": 1793374188172
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "56afb78c-ca49-4b4e-a6d5-c7f36e405f99",
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
  "last_heartbeat_at": "2026-10-30T15:29:48.191464Z",
  "last_location_at": "2026-10-30T15:29:48.191464Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/2813ed24-1743-4d8e-9d90-6b568db202f5/complete` → **200**

```json
{
  "command_id": "4fcf8b97-8a32-400d-8dbc-b1b063397084",
  "expected_version": 2,
  "reported_at": "2026-10-30T15:29:48Z",
  "cash_received": true
}
```

```json
{
  "id": "2813ed24-1743-4d8e-9d90-6b568db202f5",
  "order_id": "f54f6d25-1af2-4c30-a9b5-bb385f31cbc5",
  "assignment_id": "7bc9c9fd-5835-4fe7-872c-1827725a28fc",
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
  "arrived_at": "2026-10-30T15:29:00.560434Z",
  "started_at": "2026-10-30T15:29:00.861486Z",
  "completed_at": "2026-10-30T15:29:48.500995Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/f54f6d25-1af2-4c30-a9b5-bb385f31cbc5/rating` → **200**

```json
{
  "command_id": "2a99fb30-12b2-4fe2-84eb-ae7a4eb8efc8",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "f54f6d25-1af2-4c30-a9b5-bb385f31cbc5",
  "score": 5,
  "created_at": "2026-10-30T15:29:48.817366286Z"
}
```

`POST /api/driver/v1/orders/f54f6d25-1af2-4c30-a9b5-bb385f31cbc5/rating` → **200**

```json
{
  "command_id": "112286df-501d-4b68-aa95-3c8de75d8e0c",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "f54f6d25-1af2-4c30-a9b5-bb385f31cbc5",
  "score": 4,
  "created_at": "2026-10-30T15:29:49.116841291Z"
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
  "session_id": "d163462a-0faa-430a-8700-a5ea5aac32ff",
  "subject": {
    "type": "STAFF",
    "id": "04f20d10-faa2-4386-bfcf-0d466abe8fa8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNGYyMGQxMC1mYWEyLTQzODYtYmZjZi0wZDQ2NmFiZThmYTgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzUwODksImlhdCI6MTc5MzM3NDE4OSwianRpIjoiZWZjMzkyZjktNjA5Yi00YjlhLWE5MmItMGQ5NzE3NmZlNDhmIiwic2lkIjoiZDE2MzQ2MmEtMGZhYS00MzBhLTg3MDAtYTVlYTVhYWMzMmZmIn0.8UC87BYzRnMrPbVotYyUE0EHc8J-3LVvGF0tXIyGG3g",
  "access_expires_at": "2026-10-30T15:44:49.988379855Z",
  "refresh_token": "hcv8MKbU8DNH7UgJT8g3Swi_K48eghaWIUI_uN9Gnwo",
  "refresh_expires_at": "2026-10-31T03:29:49.987801128Z",
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
  "session_id": "6952698f-fd4b-4ab2-82ca-c21256fa1f9d",
  "subject": {
    "type": "STAFF",
    "id": "04f20d10-faa2-4386-bfcf-0d466abe8fa8"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNGYyMGQxMC1mYWEyLTQzODYtYmZjZi0wZDQ2NmFiZThmYTgiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzUwOTAsImlhdCI6MTc5MzM3NDE5MCwianRpIjoiZDQ5YTZlODAtOTFjYi00YjRjLWJjM2YtZTRiMjNhNGE0MGE0Iiwic2lkIjoiNjk1MjY5OGYtZmQ0Yi00YWIyLTgyY2EtYzIxMjU2ZmExZjlkIn0.Urf7ZoZF5D_aKV1-Q1YFteOCLMIXxB0vGGYoEPB-2_c",
  "access_expires_at": "2026-10-30T15:44:50.572160349Z",
  "refresh_token": "RbCHGEV44JgDQgLgh_12xaimHezIx2Qj3yYm7_Di410",
  "refresh_expires_at": "2026-10-31T03:29:50.571534814Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/f54f6d25-1af2-4c30-a9b5-bb385f31cbc5/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "f54f6d25-1af2-4c30-a9b5-bb385f31cbc5",
      "author_type": "RIDER",
      "author_id": "294d9699-4bbf-4b74-bad6-9392e5da6b43",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-30T15:29:48.817366Z"
    },
    {
      "order_id": "f54f6d25-1af2-4c30-a9b5-bb385f31cbc5",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "294d9699-4bbf-4b74-bad6-9392e5da6b43",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-30T15:29:49.116841Z"
    }
  ]
}
```

Done: ratings for order f54f6d25-1af2-4c30-a9b5-bb385f31cbc5.

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
  "session_id": "fe341ef6-f670-4988-af87-36d22f7b23b5",
  "subject": {
    "type": "STAFF",
    "id": "04f20d10-faa2-4386-bfcf-0d466abe8fa8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNGYyMGQxMC1mYWEyLTQzODYtYmZjZi0wZDQ2NmFiZThmYTgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzUwOTEsImlhdCI6MTc5MzM3NDE5MSwianRpIjoiNDFlZTFlZTctMTNhMS00Y2Y4LTljOGEtYWM4OGI2MWNkZGIzIiwic2lkIjoiZmUzNDFlZjYtZjY3MC00OTg4LWFmODctMzZkMjJmN2IyM2I1In0.OU7KfHlzxe5tt8yquxVecdOik-ivrbfrQMAe7SE8r78",
  "access_expires_at": "2026-10-30T15:44:51.453384908Z",
  "refresh_token": "-KPlvyhxPdkaXNKpOQ-ItXy1ahA5PlzzqR0MsNIOiew",
  "refresh_expires_at": "2026-10-31T03:29:51.452807052Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "1d9badcf-784c-4b87-88cc-527a564f7e15",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "2cac0be6-dc83-4e59-af7d-be5150a4fdab",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T15:29:51.747413Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/2cac0be6-dc83-4e59-af7d-be5150a4fdab` → **200**

```json
{
  "id": "2cac0be6-dc83-4e59-af7d-be5150a4fdab",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T15:29:51.747413Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/2cac0be6-dc83-4e59-af7d-be5150a4fdab` → **200**

```json
{
  "id": "2cac0be6-dc83-4e59-af7d-be5150a4fdab",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T15:29:51.747413Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/2cac0be6-dc83-4e59-af7d-be5150a4fdab` → **200**

```json
{
  "id": "2cac0be6-dc83-4e59-af7d-be5150a4fdab",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T15:29:51.747413Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/2cac0be6-dc83-4e59-af7d-be5150a4fdab` → **200**

```json
{
  "id": "2cac0be6-dc83-4e59-af7d-be5150a4fdab",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T15:29:51.747413Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/2cac0be6-dc83-4e59-af7d-be5150a4fdab` → **200**

```json
{
  "id": "2cac0be6-dc83-4e59-af7d-be5150a4fdab",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-30.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-30T15:29:51.747413Z",
  "ready_at": "2026-10-30T15:29:56.70773Z",
  "expires_at": "2026-10-31T15:29:56.70773Z"
}
```

`GET /api/admin/v1/reports/exports/2cac0be6-dc83-4e59-af7d-be5150a4fdab/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-30,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
total,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "1178e41b-cdcc-42ca-bcd2-056cc57f1594",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "c3905bc5-f001-449e-bd35-24dfae8a00bf",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T15:29:57.524942Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/c3905bc5-f001-449e-bd35-24dfae8a00bf` → **200**

```json
{
  "id": "c3905bc5-f001-449e-bd35-24dfae8a00bf",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T15:29:57.524942Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/c3905bc5-f001-449e-bd35-24dfae8a00bf` → **200**

```json
{
  "id": "c3905bc5-f001-449e-bd35-24dfae8a00bf",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T15:29:57.524942Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/c3905bc5-f001-449e-bd35-24dfae8a00bf` → **200**

```json
{
  "id": "c3905bc5-f001-449e-bd35-24dfae8a00bf",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T15:29:57.524942Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/c3905bc5-f001-449e-bd35-24dfae8a00bf` → **200**

```json
{
  "id": "c3905bc5-f001-449e-bd35-24dfae8a00bf",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T15:29:57.524942Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/c3905bc5-f001-449e-bd35-24dfae8a00bf` → **200**

```json
{
  "id": "c3905bc5-f001-449e-bd35-24dfae8a00bf",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-30.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-30T15:29:57.524942Z",
  "ready_at": "2026-10-30T15:30:01.717337Z",
  "expires_at": "2026-10-31T15:30:01.717337Z"
}
```

`GET /api/admin/v1/reports/exports/c3905bc5-f001-449e-bd35-24dfae8a00bf/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-30,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
total,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/a24611fe-9077-4415-945a-ea4a394f3228` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/a24611fe-9077-4415-945a-ea4a394f3228",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "98bedf4f-a12e-4a0e-9203-5bd4d9bc2a9d"
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
  "session_id": "fa97d789-e127-4a42-8407-d04d93811bbc",
  "subject": {
    "type": "STAFF",
    "id": "04f20d10-faa2-4386-bfcf-0d466abe8fa8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNGYyMGQxMC1mYWEyLTQzODYtYmZjZi0wZDQ2NmFiZThmYTgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzUxMDMsImlhdCI6MTc5MzM3NDIwMywianRpIjoiMDBiMjdlZGQtMjE2Zi00ZmVlLWIyOWUtNGE3MmJmYTU5YmEyIiwic2lkIjoiZmE5N2Q3ODktZTEyNy00YTQyLTg0MDctZDA0ZDkzODExYmJjIn0.7P_dhL2Sd0bf_zYQ9hORPRUfnMU9mQZ76NW_L8EdXJM",
  "access_expires_at": "2026-10-30T15:45:03.885585883Z",
  "refresh_token": "mmbKCtRp5wgwcIhKQCuS-v4Ua1B2KLbVi0JAy2ealfA",
  "refresh_expires_at": "2026-10-31T03:30:03.885010572Z",
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
  "command_id": "8101ba30-73fb-435b-84cd-28ba6dc7140e",
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
  "changed_by": "04f20d10-faa2-4386-bfcf-0d466abe8fa8",
  "reason": "Sandbox retention boundary",
  "changed_at": "2026-10-30T15:30:04.482548773Z"
}
```

`POST /sandbox/v1/retention/fixtures/05d9aaa4-9916-4750-8034-838a25af6fb6` → **200**

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

`GET /sandbox/v1/retention/fixtures/05d9aaa4-9916-4750-8034-838a25af6fb6` → **200**

```json
{
  "old_done": 0,
  "recent_done": 1,
  "failed": 1
}
```

Old DONE event removed; recent DONE and old FAILED events retained. Policy and synthetic fixtures restored on exit.

`DELETE /sandbox/v1/retention/fixtures/05d9aaa4-9916-4750-8034-838a25af6fb6` → **204**

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
  "changed_by": "04f20d10-faa2-4386-bfcf-0d466abe8fa8",
  "reason": "Sandbox retention boundary",
  "changed_at": "2026-10-30T15:30:04.482549Z"
}
```

`PUT /api/admin/v1/retention` → **200**

```json
{
  "command_id": "5cca9aa6-fe82-4001-9a08-0fb348c49152",
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
  "changed_by": "04f20d10-faa2-4386-bfcf-0d466abe8fa8",
  "reason": "Restore policy after retention sandbox",
  "changed_at": "2026-10-30T15:30:05.200026609Z"
}
```

# Scenario: risk-flag

## The driver starts a new shift in Kyiv

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-1625"
}
```

```json
{
  "challenge_id": "6aa2159a-b360-4ec3-94fc-bee9419399d5",
  "expires_at": "2026-10-30T15:35:05.49582922Z",
  "resend_available_at": "2026-10-30T15:30:06.49582922Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "526963",
  "sent_at": "2026-10-30T15:30:05.499298871Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6aa2159a-b360-4ec3-94fc-bee9419399d5",
  "code": "526963",
  "device_ref": "sandbox-1625"
}
```

```json
{
  "session_id": "902eb789-7241-47be-b003-49f0ab1e92d9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NTEwNSwiaWF0IjoxNzkzMzc0MjA1LCJqdGkiOiI1ZWMwMzNlMy0yNmI2LTQxMDctYTdiNS05OGRhZTg5ZGNiODciLCJzaWQiOiI5MDJlYjc4OS03MjQxLTQ3YmUtYjAwMy00OWYwYWIxZTkyZDkifQ.OVVBFbmOr_lj922Er2RPzj9Mgd1cwuaLaPGcEv4sNyc",
  "access_expires_at": "2026-10-30T15:45:05.815477713Z",
  "refresh_token": "NeDZXeUj3qi4bPB3LlBseZRPeiwsyG0GSBlgRZd53DQ",
  "refresh_expires_at": "2026-11-29T15:30:05.814896929Z",
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
  "command_id": "9a8b3d07-4f2e-4376-8c5b-ec508fb77213",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:30:06Z",
    "sequence": 1793374206690
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "392ca643-2480-4054-8e76-6fef03961103",
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
  "last_heartbeat_at": "2026-10-30T15:30:06.708414Z",
  "last_location_at": "2026-10-30T15:30:06.708414Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "394ca52e-20c3-49d8-8242-4850026ea450",
  "points": [
    {
      "sequence": 1793374209949,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-30T15:29:08Z"
    },
    {
      "sequence": 1793374209950,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-30T15:30:09Z"
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
  "session_id": "f36c967b-a07e-4f60-81ae-c479da0f3968",
  "subject": {
    "type": "STAFF",
    "id": "04f20d10-faa2-4386-bfcf-0d466abe8fa8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNGYyMGQxMC1mYWEyLTQzODYtYmZjZi0wZDQ2NmFiZThmYTgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzUxMDksImlhdCI6MTc5MzM3NDIwOSwianRpIjoiMGFjNzliZDItYzRjMS00MjdiLWEwMWYtY2IxZGE3NjBhNzRlIiwic2lkIjoiZjM2Yzk2N2ItYTA3ZS00ZjYwLTgxYWUtYzQ3OWRhMGYzOTY4In0.WrlWYQa981XbuLnYtqT3C1DlRMH5CFGHyEXkNCVMT3o",
  "access_expires_at": "2026-10-30T15:45:09.65017668Z",
  "refresh_token": "KvMyhJPOlBmy7L69zGTJpPdyHlvBIi677N3Xvx6TWNo",
  "refresh_expires_at": "2026-10-31T03:30:09.649471553Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "9b4111d7-50b6-4aec-95f6-12ac064264a1",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 61.0,
        "speed_kph": 2362,
        "distance_m": 40030,
        "recorded_at": "2026-10-30T15:30:09Z",
        "track_point_id": "f5602495-b79b-436b-b835-14393c1e29ff",
        "work_session_id": "392ca643-2480-4054-8e76-6fef03961103"
      },
      "raised_by": null,
      "raised_at": "2026-10-30T15:30:09Z",
      "reason": null,
      "reviewed_by": null,
      "reviewed_at": null,
      "review_reason": null,
      "version": 1
    }
  ]
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
    "version": 8,
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

`POST /api/admin/v1/driver-risk-flags/9b4111d7-50b6-4aec-95f6-12ac064264a1/confirm` → **200**

```json
{
  "command_id": "8c00168c-540d-4536-b6ce-962299a10d79",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "9b4111d7-50b6-4aec-95f6-12ac064264a1",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 61.0,
    "speed_kph": 2362,
    "distance_m": 40030,
    "recorded_at": "2026-10-30T15:30:09Z",
    "track_point_id": "f5602495-b79b-436b-b835-14393c1e29ff",
    "work_session_id": "392ca643-2480-4054-8e76-6fef03961103"
  },
  "raised_by": null,
  "raised_at": "2026-10-30T15:30:09Z",
  "reason": null,
  "reviewed_by": "04f20d10-faa2-4386-bfcf-0d466abe8fa8",
  "reviewed_at": "2026-10-30T15:30:10.618125Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/9b4111d7-50b6-4aec-95f6-12ac064264a1/dismiss` → **409**

```json
{
  "command_id": "c7626431-8235-4685-9bf2-f1081dda893c",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/9b4111d7-50b6-4aec-95f6-12ac064264a1/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "3e98ff79-d0c5-480a-9750-0cecb02e03b2"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "5f516ef6-e5a1-4fe9-b5fa-838e221824df",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "769a97f7-dda2-43c7-8e2b-e0743a82da3d",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "04f20d10-faa2-4386-bfcf-0d466abe8fa8",
  "raised_at": "2026-10-30T15:30:11.238751Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/769a97f7-dda2-43c7-8e2b-e0743a82da3d/dismiss` → **200**

```json
{
  "command_id": "4d674f02-a5fc-4e83-bdaf-abd44b1389da",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "769a97f7-dda2-43c7-8e2b-e0743a82da3d",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "04f20d10-faa2-4386-bfcf-0d466abe8fa8",
  "raised_at": "2026-10-30T15:30:11.238751Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "04f20d10-faa2-4386-bfcf-0d466abe8fa8",
  "reviewed_at": "2026-10-30T15:30:11.53809Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "99c95001-9699-4bfc-b977-496df54b0c60",
  "expected_version": 8,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "9b4111d7-50b6-4aec-95f6-12ac064264a1"
}
```

```json
{
  "id": "5a000000-0000-4000-8000-000000000403",
  "name": "Андрій Шевчук",
  "language": "ru",
  "review_status": "SUSPENDED",
  "version": 9,
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
    "version": 9,
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
      "actor_id": "04f20d10-faa2-4386-bfcf-0d466abe8fa8",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T15:30:11.849774Z"
    }
  ],
  "duplicates": []
}
```

Done: flag 9b4111d7-50b6-4aec-95f6-12ac064264a1 confirmed, suspension named it, driver reinstated.

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "4c3d4b58-6694-41ed-b0f9-0b19e2086837",
  "subject": {
    "type": "STAFF",
    "id": "04f20d10-faa2-4386-bfcf-0d466abe8fa8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNGYyMGQxMC1mYWEyLTQzODYtYmZjZi0wZDQ2NmFiZThmYTgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzUxMTIsImlhdCI6MTc5MzM3NDIxMiwianRpIjoiMDhjNGIwMjQtYmQxNy00YTVkLWEzNGUtMjI0ZDgyOWQyZTliIiwic2lkIjoiNGMzZDRiNTgtNjY5NC00MWVkLWIwZjktMGIxOWUyMDg2ODM3In0.iQN4vUEnaNAW5CN_hyocQiIupOcgssSnzl8OKhhuHkw",
  "access_expires_at": "2026-10-30T15:45:12.745185276Z",
  "refresh_token": "EOOiCaQVYIjA5Vh1Sxei-Ap-HbCMgM2xtSZwdK-rYI4",
  "refresh_expires_at": "2026-10-31T03:30:12.744612841Z",
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
    "version": 9,
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
      "actor_id": "04f20d10-faa2-4386-bfcf-0d466abe8fa8",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T15:30:11.849774Z"
    }
  ],
  "duplicates": []
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "ca97dcfd-31ca-4dc9-bd00-f8a73778a307",
  "expected_version": 9,
  "reason": "Sandbox clean-up"
}
```

```json
{
  "id": "5a000000-0000-4000-8000-000000000403",
  "name": "Андрій Шевчук",
  "language": "ru",
  "review_status": "APPROVED",
  "version": 10,
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
  "session_id": "392ca643-2480-4054-8e76-6fef03961103",
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
  "last_heartbeat_at": "2026-10-30T15:30:06.708414Z",
  "last_location_at": "2026-10-30T15:30:06.708414Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/392ca643-2480-4054-8e76-6fef03961103/close` → **200**

```json
{
  "command_id": "6ad06387-f8d3-4112-90a3-363735822227",
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
  "session_id": "a8438d5b-89c1-4f30-ba2d-3146e15b6026",
  "subject": {
    "type": "STAFF",
    "id": "04f20d10-faa2-4386-bfcf-0d466abe8fa8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNGYyMGQxMC1mYWEyLTQzODYtYmZjZi0wZDQ2NmFiZThmYTgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzUxMTQsImlhdCI6MTc5MzM3NDIxNCwianRpIjoiYmE0ZTMzYTUtYTExMy00Y2NiLTk3YTAtYWU2ODhjM2Y3YzMzIiwic2lkIjoiYTg0MzhkNWItODljMS00ZjMwLWJhMmQtMzE0NmUxNWI2MDI2In0.AcfbI41Bl_ACQ8p7md72IviqMecDStwfCCMZO1JiX_0",
  "access_expires_at": "2026-10-30T15:45:14.527903123Z",
  "refresh_token": "2l9cxspADstVJhF_zIqQWQIdKP5LZP2qEpHrFa0TeBs",
  "refresh_expires_at": "2026-10-31T03:30:14.527299851Z",
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
  "command_id": "49e01cbb-56a0-4013-b319-c929f0f09ff0",
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
  "changed_by": "04f20d10-faa2-4386-bfcf-0d466abe8fa8",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T15:30:15.138283Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "49e01cbb-56a0-4013-b319-c929f0f09ff0",
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
  "changed_by": "04f20d10-faa2-4386-bfcf-0d466abe8fa8",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T15:30:15.138283Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48549810029",
  "device_ref": "sandbox-8216"
}
```

```json
{
  "challenge_id": "cba6d78e-6367-4380-81dc-29a3faea4e01",
  "expires_at": "2026-10-30T15:35:15.753101675Z",
  "resend_available_at": "2026-10-30T15:30:16.753101675Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48549810029` → **200**

```json
{
  "phone": "+48549810029",
  "audience": "CLIENT",
  "code": "444586",
  "sent_at": "2026-10-30T15:30:15.75601989Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cba6d78e-6367-4380-81dc-29a3faea4e01",
  "code": "444586",
  "device_ref": "sandbox-8216"
}
```

```json
{
  "session_id": "68882495-5881-4bd9-9f1e-a289fb134552",
  "subject": {
    "type": "CLIENT",
    "id": "31291bc4-1b12-4eaa-ace8-4c4e4762ce52"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMTI5MWJjNC0xYjEyLTRlYWEtYWNlOC00YzRlNDc2MmNlNTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc1MTE2LCJpYXQiOjE3OTMzNzQyMTYsImp0aSI6IjBjY2NmNDk0LTk0MGYtNDA3Mi1hNzlkLTlkODkyODY3ODJkYyIsInNpZCI6IjY4ODgyNDk1LTU4ODEtNGJkOS05ZjFlLWEyODlmYjEzNDU1MiJ9.OvOEiTf_d70X3Y4HYvof8LApODzIQGFU9xmL1WmxUts",
  "access_expires_at": "2026-10-30T15:45:16.063727148Z",
  "refresh_token": "UjPXNsNpmCSnDXvXMjs2d9VCBEk36_dATQwc7a65wUQ",
  "refresh_expires_at": "2026-11-29T15:30:16.063146028Z",
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
  "correlation_id": "ff09cac7-c9b5-4212-892e-e17175be890b"
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
  "device_ref": "sandbox-17842"
}
```

```json
{
  "challenge_id": "d97542a2-5971-4845-861d-eef85b5a52bf",
  "expires_at": "2026-10-30T15:35:16.927980061Z",
  "resend_available_at": "2026-10-30T15:30:17.927980061Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "975299",
  "sent_at": "2026-10-30T15:30:16.930723368Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d97542a2-5971-4845-861d-eef85b5a52bf",
  "code": "975299",
  "device_ref": "sandbox-17842"
}
```

```json
{
  "session_id": "807edc6b-1625-4835-87c0-9e43602a8d25",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NTExNywiaWF0IjoxNzkzMzc0MjE3LCJqdGkiOiI0NjZjN2IxOC03NDM0LTQwZmUtOWZkYS01NjY1OWQ1YjNmM2MiLCJzaWQiOiI4MDdlZGM2Yi0xNjI1LTQ4MzUtODdjMC05ZTQzNjAyYThkMjUifQ.ssOhn_U0oIkrhtQQl_emTKSWm670ISSWKbhFxnQX0Rk",
  "access_expires_at": "2026-10-30T15:45:17.240200597Z",
  "refresh_token": "lVJhk5520zII3G3vvqvQkokCA0X2TRKKMbViLrlB20M",
  "refresh_expires_at": "2026-11-29T15:30:17.239603427Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "13121d15-675a-4d33-8de7-ba58a6cbb951",
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
  "last_heartbeat_at": "2026-10-30T15:28:53.672093Z",
  "last_location_at": "2026-10-30T15:28:53.672093Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/13121d15-675a-4d33-8de7-ba58a6cbb951/handover` → **200**

```json
{
  "command_id": "a1c25e14-4155-4d60-9e39-cbaa62cf34de",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "13121d15-675a-4d33-8de7-ba58a6cbb951",
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
  "last_heartbeat_at": "2026-10-30T15:28:53.672093Z",
  "last_location_at": "2026-10-30T15:28:53.672093Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/13121d15-675a-4d33-8de7-ba58a6cbb951/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:30:18Z",
    "sequence": 1793374218111
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "13121d15-675a-4d33-8de7-ba58a6cbb951",
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
  "last_heartbeat_at": "2026-10-30T15:30:18.130344Z",
  "last_location_at": "2026-10-30T15:30:18.130344Z",
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
  "session_id": "13121d15-675a-4d33-8de7-ba58a6cbb951",
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
  "last_heartbeat_at": "2026-10-30T15:30:18.130344Z",
  "last_location_at": "2026-10-30T15:30:18.130344Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/13121d15-675a-4d33-8de7-ba58a6cbb951/close` → **200**

```json
{
  "command_id": "73003b11-8836-48cc-94c4-2c922f284c5d",
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
  "correlation_id": "343b7d2b-dfad-4133-9ebb-92c9bef3358a"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675594522",
  "device_ref": "sandbox-29126"
}
```

```json
{
  "challenge_id": "0d617405-51e8-458b-a2ee-7fcee5e97fdc",
  "expires_at": "2026-10-30T15:35:19.59857433Z",
  "resend_available_at": "2026-10-30T15:30:20.59857433Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380675594522` → **200**

```json
{
  "phone": "+380675594522",
  "audience": "CLIENT",
  "code": "499512",
  "sent_at": "2026-10-30T15:30:19.601291107Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0d617405-51e8-458b-a2ee-7fcee5e97fdc",
  "code": "499512",
  "device_ref": "sandbox-29126"
}
```

```json
{
  "session_id": "70b64df7-40a1-4edc-8355-0cdacf7a4454",
  "subject": {
    "type": "CLIENT",
    "id": "142f7eac-ffd0-4620-b27d-e7627c60cf3b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNDJmN2VhYy1mZmQwLTQ2MjAtYjI3ZC1lNzYyN2M2MGNmM2IiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc1MTE5LCJpYXQiOjE3OTMzNzQyMTksImp0aSI6IjVkMGQ1NzBiLTg5NWEtNGFhNS04ZmYyLWRkY2UyYzkyOTM1MyIsInNpZCI6IjcwYjY0ZGY3LTQwYTEtNGVkYy04MzU1LTBjZGFjZjdhNDQ1NCJ9.oiRKabMT6D_x0yU_lu8g-azZzlXNGiAcJPrqlMD1m7c",
  "access_expires_at": "2026-10-30T15:45:19.92847353Z",
  "refresh_token": "oBJJJFdr-g9aYtXrWRyh_dHj9-21KSDm5c_4nzYjitE",
  "refresh_expires_at": "2026-11-29T15:30:19.92794098Z",
  "account_created": true
}
```

## The EICAR antivirus test file is refused by the antivirus

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "26f57042-39bf-4685-b200-3ce0899366e5",
  "content_type": "application/pdf",
  "size_bytes": 86
}
```

```json
{
  "file_id": "ebeae417-5dff-4866-ad49-421fed871310",
  "upload_path": "/api/rider/v1/uploads/ebeae417-5dff-4866-ad49-421fed871310",
  "expires_at": "2026-10-30T15:45:20.22216074Z",
  "max_bytes": 86
}
```

`PUT /api/rider/v1/uploads/ebeae417-5dff-4866-ad49-421fed871310` → **200**

```json
{
  "file_id": "ebeae417-5dff-4866-ad49-421fed871310",
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
  "command_id": "a3f6c0d8-1a79-4d5c-851d-ac84e9eef57b",
  "content_type": "application/pdf",
  "size_bytes": 92
}
```

```json
{
  "file_id": "e0849c23-e8db-4e37-a806-2e5805a28f1e",
  "upload_path": "/api/rider/v1/uploads/e0849c23-e8db-4e37-a806-2e5805a28f1e",
  "expires_at": "2026-10-30T15:45:20.540715231Z",
  "max_bytes": 92
}
```

`PUT /api/rider/v1/uploads/e0849c23-e8db-4e37-a806-2e5805a28f1e` → **200**

```json
{
  "file_id": "e0849c23-e8db-4e37-a806-2e5805a28f1e",
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
  "command_id": "90325c18-fe7d-47bf-a0f7-63b743ced2f9",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "e67908e4-3724-4a7b-94ff-8e4e5b3f712a",
  "upload_path": "/api/rider/v1/uploads/e67908e4-3724-4a7b-94ff-8e4e5b3f712a",
  "expires_at": "2026-10-30T15:45:20.853050238Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/e67908e4-3724-4a7b-94ff-8e4e5b3f712a` → **200**

```json
{
  "file_id": "e67908e4-3724-4a7b-94ff-8e4e5b3f712a",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "130cc450-3ac3-4bb9-8a1a-63d86b6f61d2",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "e67908e4-3724-4a7b-94ff-8e4e5b3f712a"
  ]
}
```

```json
{
  "id": "1e817e4e-71ae-4353-89b9-17d6300630a7",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "142f7eac-ffd0-4620-b27d-e7627c60cf3b",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T15:30:21.173795Z",
  "updated_at": "2026-10-30T15:30:21.173795Z",
  "respond_by": "2026-10-30T19:30:21.173795Z",
  "messages": [
    {
      "id": "1a58a7de-9b3b-47fa-85c9-66a91a0ae9a5",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "142f7eac-ffd0-4620-b27d-e7627c60cf3b",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T15:30:21.174974Z",
      "attachments": [
        {
          "file_id": "e67908e4-3724-4a7b-94ff-8e4e5b3f712a",
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
  "session_id": "f49e6c29-2aeb-400f-a910-3b44246a2a12",
  "subject": {
    "type": "STAFF",
    "id": "04f20d10-faa2-4386-bfcf-0d466abe8fa8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNGYyMGQxMC1mYWEyLTQzODYtYmZjZi0wZDQ2NmFiZThmYTgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzUxMjEsImlhdCI6MTc5MzM3NDIyMSwianRpIjoiYWU5OTY3NzQtOTA5Ni00NmFlLWFiYjQtMjA5OGVmMzI2MWE5Iiwic2lkIjoiZjQ5ZTZjMjktMmFlYi00MDBmLWE5MTAtM2I0NDI0NmEyYTEyIn0.lvTLUJ0kOnL86SrPs4opLhVnXOp15eB_WkPxTuxeviI",
  "access_expires_at": "2026-10-30T15:45:21.790254908Z",
  "refresh_token": "R7NrjW__e80-gAjaoVDvrLxBjUn5eXry502eE0cTVhE",
  "refresh_expires_at": "2026-10-31T03:30:21.789684256Z",
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
  "session_id": "12b065aa-9966-4d39-a5bd-cb170739d4f2",
  "subject": {
    "type": "STAFF",
    "id": "04f20d10-faa2-4386-bfcf-0d466abe8fa8"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNGYyMGQxMC1mYWEyLTQzODYtYmZjZi0wZDQ2NmFiZThmYTgiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzUxMjIsImlhdCI6MTc5MzM3NDIyMiwianRpIjoiMDQwMjQ0OGEtZWYzNi00NjM2LTk2OTgtMjcwZTI2ZmJhMmFjIiwic2lkIjoiMTJiMDY1YWEtOTk2Ni00ZDM5LWE1YmQtY2IxNzA3MzlkNGYyIn0.RxyfbnimOU7YbYSlibvQFZ-2kKrfwucx-MR27MOCH9o",
  "access_expires_at": "2026-10-30T15:45:22.368092677Z",
  "refresh_token": "9C-s0aAn9Zec7pt5sxsCvyyXn4vv-sN7dc4uEUuxcZ8",
  "refresh_expires_at": "2026-10-31T03:30:22.367491028Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/1e817e4e-71ae-4353-89b9-17d6300630a7/attachments/e67908e4-3724-4a7b-94ff-8e4e5b3f712a` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "36855861-1957-4880-ba46-ec3598f00614",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "94dfd05c-999a-4048-8b98-76709ce26dde",
  "upload_path": "/api/operator/v1/uploads/94dfd05c-999a-4048-8b98-76709ce26dde",
  "expires_at": "2026-10-30T15:45:22.66629848Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/94dfd05c-999a-4048-8b98-76709ce26dde` → **200**

```json
{
  "file_id": "94dfd05c-999a-4048-8b98-76709ce26dde",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/1e817e4e-71ae-4353-89b9-17d6300630a7` → **200**

```json
{
  "id": "1e817e4e-71ae-4353-89b9-17d6300630a7",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "142f7eac-ffd0-4620-b27d-e7627c60cf3b",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T15:30:21.173795Z",
  "updated_at": "2026-10-30T15:30:21.173795Z",
  "respond_by": "2026-10-30T19:30:21.173795Z",
  "messages": [
    {
      "id": "1a58a7de-9b3b-47fa-85c9-66a91a0ae9a5",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "142f7eac-ffd0-4620-b27d-e7627c60cf3b",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T15:30:21.174974Z",
      "attachments": [
        {
          "file_id": "e67908e4-3724-4a7b-94ff-8e4e5b3f712a",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/1e817e4e-71ae-4353-89b9-17d6300630a7/comments` → **200**

```json
{
  "command_id": "72173fe5-af3f-4996-ba5b-6a152fbe61cb",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "94dfd05c-999a-4048-8b98-76709ce26dde"
  ]
}
```

```json
{
  "id": "1e817e4e-71ae-4353-89b9-17d6300630a7",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "142f7eac-ffd0-4620-b27d-e7627c60cf3b",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T15:30:21.173795Z",
  "updated_at": "2026-10-30T15:30:23.285787Z",
  "respond_by": "2026-10-30T19:30:21.173795Z",
  "messages": [
    {
      "id": "1a58a7de-9b3b-47fa-85c9-66a91a0ae9a5",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "142f7eac-ffd0-4620-b27d-e7627c60cf3b",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T15:30:21.174974Z",
      "attachments": [
        {
          "file_id": "e67908e4-3724-4a7b-94ff-8e4e5b3f712a",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "470b08d6-9387-4827-871d-2cd872b6d862",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "04f20d10-faa2-4386-bfcf-0d466abe8fa8",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T15:30:23.285344Z",
      "attachments": [
        {
          "file_id": "94dfd05c-999a-4048-8b98-76709ce26dde",
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

`GET /api/rider/v1/support/cases/1e817e4e-71ae-4353-89b9-17d6300630a7` → **200**

```json
{
  "id": "1e817e4e-71ae-4353-89b9-17d6300630a7",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "142f7eac-ffd0-4620-b27d-e7627c60cf3b",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T15:30:21.173795Z",
  "updated_at": "2026-10-30T15:30:23.285787Z",
  "respond_by": "2026-10-30T19:30:21.173795Z",
  "messages": [
    {
      "id": "1a58a7de-9b3b-47fa-85c9-66a91a0ae9a5",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "142f7eac-ffd0-4620-b27d-e7627c60cf3b",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T15:30:21.174974Z",
      "attachments": [
        {
          "file_id": "e67908e4-3724-4a7b-94ff-8e4e5b3f712a",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "470b08d6-9387-4827-871d-2cd872b6d862",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T15:30:23.285344Z",
      "attachments": [
        {
          "file_id": "94dfd05c-999a-4048-8b98-76709ce26dde",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/1e817e4e-71ae-4353-89b9-17d6300630a7/attachments/94dfd05c-999a-4048-8b98-76709ce26dde` → **200**

Done: support case 1e817e4e-71ae-4353-89b9-17d6300630a7, rider attachment e67908e4-3724-4a7b-94ff-8e4e5b3f712a, operator attachment 94dfd05c-999a-4048-8b98-76709ce26dde.

# Scenario: switch-to-cash

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380734311172",
  "device_ref": "sandbox-3206"
}
```

```json
{
  "challenge_id": "d219d0eb-8778-46b7-988a-01014e0e599d",
  "expires_at": "2026-10-30T15:35:23.903286165Z",
  "resend_available_at": "2026-10-30T15:30:24.903286165Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380734311172` → **200**

```json
{
  "phone": "+380734311172",
  "audience": "CLIENT",
  "code": "568796",
  "sent_at": "2026-10-30T15:30:23.906009849Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d219d0eb-8778-46b7-988a-01014e0e599d",
  "code": "568796",
  "device_ref": "sandbox-3206"
}
```

```json
{
  "session_id": "282927d5-3c3a-4cae-a626-688c6ce00590",
  "subject": {
    "type": "CLIENT",
    "id": "c416a9a8-bf60-4545-b62a-00cbd7892335"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNDE2YTlhOC1iZjYwLTQ1NDUtYjYyYS0wMGNiZDc4OTIzMzUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc1MTI0LCJpYXQiOjE3OTMzNzQyMjQsImp0aSI6IjA0ODk0ZTBkLTZjODctNGRlNy1iYzVlLTJkNzQ4NDM2MDAyYyIsInNpZCI6IjI4MjkyN2Q1LTNjM2EtNGNhZS1hNjI2LTY4OGM2Y2UwMDU5MCJ9.7juMyVpaxvdJXyh4Vo6vjrCS2pTK5eVX5IPSYYdMewU",
  "access_expires_at": "2026-10-30T15:45:24.216186475Z",
  "refresh_token": "-xgwiIS64UuF814-uUaSJnlPBLPb50F6FUEVN2P9ZIA",
  "refresh_expires_at": "2026-11-29T15:30:24.215615754Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "f8262bb2-8f46-4351-9b6e-63edec79a327",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "4bb04c02-b37d-4b1c-9f64-aa0603ac6e03",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-4bb04c02-b37d-4b1c-9f64-aa0603ac6e03",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "c387cd2de26b0c8172c19774df01efa0",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=4bb04c02-b37d-4b1c-9f64-aa0603ac6e03",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380734311172"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=4bb04c02-b37d-4b1c-9f64-aa0603ac6e03",
  "expires_at": "2026-10-30T16:00:24.502509Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/4bb04c02-b37d-4b1c-9f64-aa0603ac6e03` → **200**

```json
{
  "id": "4bb04c02-b37d-4b1c-9f64-aa0603ac6e03",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T16:00:24.502509Z",
  "card": {
    "id": "33ac4ce4-604d-498c-bd4f-cdc4acc3a472",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****7454",
    "card_type": "Visa",
    "created_at": "2026-10-30T15:30:24.793202Z"
  },
  "failure_reason": null
}
```

## The rider orders by card: the hold is taken

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1b0ce965-b43f-413d-b23d-e30ad9785b06",
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
  "id": "720bfe67-a037-494a-818d-9e1b9c5a3c0d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:35:25.118660Z",
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

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "428962e1-5710-4025-b581-ca0b9dcdec07",
  "quote_id": "720bfe67-a037-494a-818d-9e1b9c5a3c0d",
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
  "id": "66fb906e-15e8-4552-93f7-e4d24a7d4cde",
  "short_number": 27,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "c416a9a8-bf60-4545-b62a-00cbd7892335",
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
  "created_at": "2026-10-30T15:30:25.419498Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/66fb906e-15e8-4552-93f7-e4d24a7d4cde` → **200**

```json
{
  "id": "66fb906e-15e8-4552-93f7-e4d24a7d4cde",
  "short_number": 27,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "c416a9a8-bf60-4545-b62a-00cbd7892335",
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
  "created_at": "2026-10-30T15:30:25.419498Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/66fb906e-15e8-4552-93f7-e4d24a7d4cde` → **200**

```json
{
  "id": "66fb906e-15e8-4552-93f7-e4d24a7d4cde",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "c416a9a8-bf60-4545-b62a-00cbd7892335",
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
  "created_at": "2026-10-30T15:30:25.419498Z",
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

`GET /api/rider/v1/orders/66fb906e-15e8-4552-93f7-e4d24a7d4cde` → **200**

```json
{
  "id": "66fb906e-15e8-4552-93f7-e4d24a7d4cde",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "c416a9a8-bf60-4545-b62a-00cbd7892335",
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
  "created_at": "2026-10-30T15:30:25.419498Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/66fb906e-15e8-4552-93f7-e4d24a7d4cde/switch-to-cash` → **200**

```json
{
  "command_id": "4785decb-afde-4dff-bd81-3fc568fbaae1",
  "expected_version": 3
}
```

```json
{
  "id": "66fb906e-15e8-4552-93f7-e4d24a7d4cde",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "c416a9a8-bf60-4545-b62a-00cbd7892335",
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
  "created_at": "2026-10-30T15:30:25.419498Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/66fb906e-15e8-4552-93f7-e4d24a7d4cde/switch-to-cash` → **409**

```json
{
  "command_id": "be1edcdd-198e-4a00-9b5b-fb550798f1e5",
  "expected_version": 4
}
```

```json
{
  "instance": "/api/rider/v1/orders/66fb906e-15e8-4552-93f7-e4d24a7d4cde/switch-to-cash",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "8646df62-3cb6-488d-b12a-4c644c7bafb7"
}
```

Done: the card order became cash; a second switch is refused.

`GET /api/rider/v1/orders/66fb906e-15e8-4552-93f7-e4d24a7d4cde` → **200**

```json
{
  "id": "66fb906e-15e8-4552-93f7-e4d24a7d4cde",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "c416a9a8-bf60-4545-b62a-00cbd7892335",
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
  "created_at": "2026-10-30T15:30:25.419498Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/66fb906e-15e8-4552-93f7-e4d24a7d4cde/cancel` → **200**

```json
{
  "command_id": "7c7b5a11-d37c-417a-8ad2-fb527f396796",
  "expected_version": 4,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "66fb906e-15e8-4552-93f7-e4d24a7d4cde",
  "short_number": 27,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "c416a9a8-bf60-4545-b62a-00cbd7892335",
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
  "created_at": "2026-10-30T15:30:25.419498Z",
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
  "session_id": "670d4c0a-454f-4195-8758-df5e1fe72feb",
  "subject": {
    "type": "STAFF",
    "id": "04f20d10-faa2-4386-bfcf-0d466abe8fa8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNGYyMGQxMC1mYWEyLTQzODYtYmZjZi0wZDQ2NmFiZThmYTgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzUxMjksImlhdCI6MTc5MzM3NDIyOSwianRpIjoiMjRhNjBhY2QtNzgxMy00NjFlLTg0OWMtNjY1NjhhYzgwM2U1Iiwic2lkIjoiNjcwZDRjMGEtNDU0Zi00MTk1LTg3NTgtZGY1ZTFmZTcyZmViIn0.NcHCIMwl9ejreclU1EDh4dXQxIaDpPuhtxn66tGY_NU",
  "access_expires_at": "2026-10-30T15:45:29.187063703Z",
  "refresh_token": "2f2xHjt6Es1e9xf0e8Jgp4pI3f1f6jEe8y6alKOGqmk",
  "refresh_expires_at": "2026-10-31T03:30:29.186475057Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-20046"
}
```

```json
{
  "challenge_id": "c02755f2-0390-4231-90a0-4dc106d7efd7",
  "expires_at": "2026-10-30T15:35:29.469769454Z",
  "resend_available_at": "2026-10-30T15:30:30.469769454Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "869786",
  "sent_at": "2026-10-30T15:30:29.47310496Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c02755f2-0390-4231-90a0-4dc106d7efd7",
  "code": "869786",
  "device_ref": "sandbox-20046"
}
```

```json
{
  "session_id": "81fd6915-b38a-455b-b56b-5da962d9e677",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NTEyOSwiaWF0IjoxNzkzMzc0MjI5LCJqdGkiOiJiMzQ4NWYwMi0xOWIyLTQ1MDctOGFhMi1hYzBiZDljYjIyNmMiLCJzaWQiOiI4MWZkNjkxNS1iMzhhLTQ1NWItYjU2Yi01ZGE5NjJkOWU2NzcifQ.hb_8QKKOJlDeErCPkmtuJ3Vh-Ljl0ww6isyGiCWnD3g",
  "access_expires_at": "2026-10-30T15:45:29.780381312Z",
  "refresh_token": "6HZ9H-0mR3K6UgOa6OAsIW_sTM0Ol5jtBsmNJ6BKLVU",
  "refresh_expires_at": "2026-11-29T15:30:29.779689583Z",
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
  "history": [
    {
      "from": "APPROVED",
      "to": "SUSPENDED",
      "actor_type": "STAFF",
      "actor_id": "04f20d10-faa2-4386-bfcf-0d466abe8fa8",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T15:30:11.849774Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "04f20d10-faa2-4386-bfcf-0d466abe8fa8",
      "reason": "Sandbox clean-up",
      "at": "2026-10-30T15:30:13.341666Z"
    }
  ],
  "duplicates": []
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "c190d2dd-1984-4157-9475-c181ddac5813",
  "expected_version": 11,
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
  "version": 12,
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
  "device_ref": "sandbox-27679"
}
```

```json
{
  "challenge_id": "cbc0bb95-10a6-43b6-b616-14f783ff4633",
  "expires_at": "2026-10-30T15:35:30.973066725Z",
  "resend_available_at": "2026-10-30T15:30:31.973066725Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "111300",
  "sent_at": "2026-10-30T15:30:30.976027427Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cbc0bb95-10a6-43b6-b616-14f783ff4633",
  "code": "111300",
  "device_ref": "sandbox-27679"
}
```

```json
{
  "session_id": "3b276e5c-ae37-41f6-b0c4-f15758956468",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NTEzMSwiaWF0IjoxNzkzMzc0MjMxLCJqdGkiOiIxNjU0MWRmZS0yZGVhLTRjNDAtYmU4Yy1lMDk5Y2NkNGY5N2IiLCJzaWQiOiIzYjI3NmU1Yy1hZTM3LTQxZjYtYjBjNC1mMTU3NTg5NTY0NjgifQ.jOt3vqIGP0_O9wi438BBvrhwQ6MFtn6JGGCwRcd7Xhw",
  "access_expires_at": "2026-10-30T15:45:31.282262747Z",
  "refresh_token": "9YPvXzIpuzbDd9zpHE2EZ-hYoLdvazO8hdyzs7TkcAY",
  "refresh_expires_at": "2026-11-29T15:30:31.281668041Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "56afb78c-ca49-4b4e-a6d5-c7f36e405f99",
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
  "last_heartbeat_at": "2026-10-30T15:29:48.191464Z",
  "last_location_at": "2026-10-30T15:29:48.191464Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/56afb78c-ca49-4b4e-a6d5-c7f36e405f99/handover` → **200**

```json
{
  "command_id": "ba26d726-352b-4ec6-ba79-1559a1592c3d",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "56afb78c-ca49-4b4e-a6d5-c7f36e405f99",
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
  "last_heartbeat_at": "2026-10-30T15:29:48.191464Z",
  "last_location_at": "2026-10-30T15:29:48.191464Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

(the car drives 5 s to the next point)

`POST /api/driver/v1/work-sessions/56afb78c-ca49-4b4e-a6d5-c7f36e405f99/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:30:37Z",
    "sequence": 1793374237202
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "56afb78c-ca49-4b4e-a6d5-c7f36e405f99",
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
  "last_heartbeat_at": "2026-10-30T15:30:37.220683Z",
  "last_location_at": "2026-10-30T15:30:37.220683Z",
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
  "command_id": "3090bf1b-c779-4142-b694-69a7cc418e4e",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:30:37Z",
    "sequence": 1793374237802
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "dd54869e-3368-4c62-845f-43e3790c929a",
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
  "last_heartbeat_at": "2026-10-30T15:30:37.820684Z",
  "last_location_at": "2026-10-30T15:30:37.820684Z",
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
  "session_id": "ea8f413c-b30d-443e-8b54-8210defe1256",
  "subject": {
    "type": "STAFF",
    "id": "04f20d10-faa2-4386-bfcf-0d466abe8fa8"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNGYyMGQxMC1mYWEyLTQzODYtYmZjZi0wZDQ2NmFiZThmYTgiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzUxMzgsImlhdCI6MTc5MzM3NDIzOCwianRpIjoiMjM0NTdmMTItNjIyMi00ODUyLTg2YmYtM2E0ODMyZDUwMDcxIiwic2lkIjoiZWE4ZjQxM2MtYjMwZC00NDNlLThiNTQtODIxMGRlZmUxMjU2In0.FqdaLxb1UbjWRoiOeYarwuKnaVm2VDN8UFfekyvL5DM",
  "access_expires_at": "2026-10-30T15:45:38.401810654Z",
  "refresh_token": "Km79B7mfg1l0j_ZWokDj0Cu6aUxGxtWLoO0b5_jWHdE",
  "refresh_expires_at": "2026-10-31T03:30:38.401269559Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "350b2594-b48e-4397-a23f-ce6bdfddfd51",
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
  "id": "b5545b43-508a-4243-9495-43782a0d2db2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:35:38.690516Z",
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
  "command_id": "6f60e158-4974-4687-9172-920b91699544",
  "quote_id": "b5545b43-508a-4243-9495-43782a0d2db2",
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
  "id": "257683ff-69d0-40eb-96c3-e9f8c6b9c228",
  "short_number": 28,
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
  "created_at": "2026-10-30T15:30:38.988582Z",
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
    "id": "0ad948af-955e-41a0-9333-3e7e72cd93b0",
    "order_id": "257683ff-69d0-40eb-96c3-e9f8c6b9c228",
    "expires_at": "2026-10-30T15:30:53.992696Z",
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

`POST /api/driver/v1/offers/0ad948af-955e-41a0-9333-3e7e72cd93b0/accept` → **200**

```json
{
  "command_id": "69df9f6c-e396-4671-b927-0ae67743c098"
}
```

```json
{
  "id": "5d31ccee-8ddc-41e2-99c9-417cf439f5d6",
  "order_id": "257683ff-69d0-40eb-96c3-e9f8c6b9c228",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "559b8b93-48d7-4fe5-9bca-2698e6251fc4",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "559b8b93-48d7-4fe5-9bca-2698e6251fc4",
  "order_id": "257683ff-69d0-40eb-96c3-e9f8c6b9c228",
  "assignment_id": "5d31ccee-8ddc-41e2-99c9-417cf439f5d6",
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

(the car drives 9 s to the next point)

`POST /api/driver/v1/work-sessions/dd54869e-3368-4c62-845f-43e3790c929a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:30:49Z",
    "sequence": 1793374249483
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "dd54869e-3368-4c62-845f-43e3790c929a",
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
  "last_heartbeat_at": "2026-10-30T15:30:49.501095Z",
  "last_location_at": "2026-10-30T15:30:49.501095Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/559b8b93-48d7-4fe5-9bca-2698e6251fc4/arrive` → **200**

```json
{
  "command_id": "4eb299ff-ac79-4748-94c5-0a06d01345d8",
  "expected_version": 0
}
```

```json
{
  "id": "559b8b93-48d7-4fe5-9bca-2698e6251fc4",
  "order_id": "257683ff-69d0-40eb-96c3-e9f8c6b9c228",
  "assignment_id": "5d31ccee-8ddc-41e2-99c9-417cf439f5d6",
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
  "arrived_at": "2026-10-30T15:30:49.802691Z",
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

`POST /api/driver/v1/trips/559b8b93-48d7-4fe5-9bca-2698e6251fc4/start` → **200**

```json
{
  "command_id": "1b9c070e-d38e-4761-bcd9-6669670d1351",
  "expected_version": 1
}
```

```json
{
  "id": "559b8b93-48d7-4fe5-9bca-2698e6251fc4",
  "order_id": "257683ff-69d0-40eb-96c3-e9f8c6b9c228",
  "assignment_id": "5d31ccee-8ddc-41e2-99c9-417cf439f5d6",
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
  "arrived_at": "2026-10-30T15:30:49.802691Z",
  "started_at": "2026-10-30T15:30:50.109699Z",
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

`POST /api/driver/v1/trips/559b8b93-48d7-4fe5-9bca-2698e6251fc4/complete` → **200**

```json
{
  "command_id": "3b6eaa57-4a0b-44ed-a3ef-73d931ca3fdd",
  "expected_version": 2,
  "reported_at": "2026-10-30T15:30:50Z",
  "cash_received": true
}
```

```json
{
  "id": "559b8b93-48d7-4fe5-9bca-2698e6251fc4",
  "order_id": "257683ff-69d0-40eb-96c3-e9f8c6b9c228",
  "assignment_id": "5d31ccee-8ddc-41e2-99c9-417cf439f5d6",
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
  "arrived_at": "2026-10-30T15:30:49.802691Z",
  "started_at": "2026-10-30T15:30:50.109699Z",
  "completed_at": "2026-10-30T15:30:50.447251Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/257683ff-69d0-40eb-96c3-e9f8c6b9c228` → **200**

```json
{
  "id": "257683ff-69d0-40eb-96c3-e9f8c6b9c228",
  "short_number": 28,
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
    "id": "5d31ccee-8ddc-41e2-99c9-417cf439f5d6",
    "order_id": "257683ff-69d0-40eb-96c3-e9f8c6b9c228",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "559b8b93-48d7-4fe5-9bca-2698e6251fc4",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T15:30:38.988582Z",
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
  "session_id": "56afb78c-ca49-4b4e-a6d5-c7f36e405f99",
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
  "last_heartbeat_at": "2026-10-30T15:30:37.220683Z",
  "last_location_at": "2026-10-30T15:30:37.220683Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/56afb78c-ca49-4b4e-a6d5-c7f36e405f99/close` → **200**

```json
{
  "command_id": "9c77baa6-7039-4387-b642-3c08c9b3234c",
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
  "session_id": "dd54869e-3368-4c62-845f-43e3790c929a",
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
  "last_heartbeat_at": "2026-10-30T15:30:49.501095Z",
  "last_location_at": "2026-10-30T15:30:49.501095Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/dd54869e-3368-4c62-845f-43e3790c929a/close` → **200**

```json
{
  "command_id": "1c9e9505-0fcc-428a-9a32-63ccbaabbf16",
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

Done: terminal order 257683ff-69d0-40eb-96c3-e9f8c6b9c228 by Andrii (5a000000-0000-4000-8000-000000000403).

# Scenario: zz-metrics

## A search without drivers ends as UNFULFILLED

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-29104"
}
```

```json
{
  "challenge_id": "9cb3c337-6322-4f41-9f31-44d8070dfd32",
  "expires_at": "2026-10-30T15:35:55.517821607Z",
  "resend_available_at": "2026-10-30T15:30:56.517821607Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "374625",
  "sent_at": "2026-10-30T15:30:55.520730784Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9cb3c337-6322-4f41-9f31-44d8070dfd32",
  "code": "374625",
  "device_ref": "sandbox-29104"
}
```

```json
{
  "session_id": "614fd730-9b02-46c1-97e1-7b4cdf7b812a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NTE1NSwiaWF0IjoxNzkzMzc0MjU1LCJqdGkiOiJkNGU4MzRlYy02ZTA2LTQwMDUtYThhZC1mMzA3ZjI5ZDIzMDIiLCJzaWQiOiI2MTRmZDczMC05YjAyLTQ2YzEtOTdlMS03YjRjZGY3YjgxMmEifQ.XYD0duGiNMKWoxOyeC8qfg6c4fzCy5nN-Fa2Rl5Nz10",
  "access_expires_at": "2026-10-30T15:45:55.83756008Z",
  "refresh_token": "waQ_ikVleUiR9_8juh9K3LRfzqt45F2QWVddn1WcnAk",
  "refresh_expires_at": "2026-11-29T15:30:55.83693166Z",
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
  "device_ref": "sandbox-259"
}
```

```json
{
  "challenge_id": "753dce21-9ed4-42e3-84b3-236dae911873",
  "expires_at": "2026-10-30T15:35:56.404144502Z",
  "resend_available_at": "2026-10-30T15:30:57.404144502Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "271174",
  "sent_at": "2026-10-30T15:30:56.407060201Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "753dce21-9ed4-42e3-84b3-236dae911873",
  "code": "271174",
  "device_ref": "sandbox-259"
}
```

```json
{
  "session_id": "a49b0836-16ac-4f04-bffa-2b85d1a9e111",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NTE1NiwiaWF0IjoxNzkzMzc0MjU2LCJqdGkiOiJiNTY3YmMwNy00OTQ0LTRjZjYtYjM4YS03MjgxZTg0NTY1MzQiLCJzaWQiOiJhNDliMDgzNi0xNmFjLTRmMDQtYmZmYS0yYjg1ZDFhOWUxMTEifQ.vUBAFSyUfL7ooFAMHoFrJOk6WuSWTxKrpJXgiq3K130",
  "access_expires_at": "2026-10-30T15:45:56.723477036Z",
  "refresh_token": "GALr2lK9LOvz5kDxv0x3NOAGKDNnKnoArpNBrChTaO8",
  "refresh_expires_at": "2026-11-29T15:30:56.722908246Z",
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
  "device_ref": "sandbox-30521"
}
```

```json
{
  "challenge_id": "63e62ad7-c9c5-44f7-867f-bd4b1a77faa9",
  "expires_at": "2026-10-30T15:35:57.289060894Z",
  "resend_available_at": "2026-10-30T15:30:58.289060894Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "856836",
  "sent_at": "2026-10-30T15:30:57.291724102Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "63e62ad7-c9c5-44f7-867f-bd4b1a77faa9",
  "code": "856836",
  "device_ref": "sandbox-30521"
}
```

```json
{
  "session_id": "75007a85-04f7-48f5-9d58-77b37eba714e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NTE1NywiaWF0IjoxNzkzMzc0MjU3LCJqdGkiOiI3NmE1MjUyYy1lYTdhLTQ5MmQtYmE0MC0xMDU3OWQ1YWIwZjUiLCJzaWQiOiI3NTAwN2E4NS0wNGY3LTQ4ZjUtOWQ1OC03N2IzN2ViYTcxNGUifQ.klpSyylEyUYBK7w5kZlseDRp5_ZNj0qrdgF_XWh2zF8",
  "access_expires_at": "2026-10-30T15:45:57.610187387Z",
  "refresh_token": "0hVIbhvFq8EeNXtCQH8vIfhj68eFto2s3zf29MKdvPU",
  "refresh_expires_at": "2026-11-29T15:30:57.609587953Z",
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
  "phone": "+380692128266",
  "device_ref": "sandbox-11423"
}
```

```json
{
  "challenge_id": "bc6bc042-8bfc-493e-98ab-7890bb463023",
  "expires_at": "2026-10-30T15:35:58.171539423Z",
  "resend_available_at": "2026-10-30T15:30:59.171539423Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380692128266` → **200**

```json
{
  "phone": "+380692128266",
  "audience": "CLIENT",
  "code": "794927",
  "sent_at": "2026-10-30T15:30:58.174291428Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bc6bc042-8bfc-493e-98ab-7890bb463023",
  "code": "794927",
  "device_ref": "sandbox-11423"
}
```

```json
{
  "session_id": "fa783c1b-b48e-4f22-8b63-11562fc3da6a",
  "subject": {
    "type": "CLIENT",
    "id": "06539a38-cdd2-4980-953c-4d48eab8e9dd"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNjUzOWEzOC1jZGQyLTQ5ODAtOTUzYy00ZDQ4ZWFiOGU5ZGQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc1MTU4LCJpYXQiOjE3OTMzNzQyNTgsImp0aSI6IjAwZTkyOTNmLTJhNDktNDcxYS05NGZkLWY0ZmM0ODUwNmYzMyIsInNpZCI6ImZhNzgzYzFiLWI0OGUtNGYyMi04YjYzLTExNTYyZmMzZGE2YSJ9.I3uQIegazlEDIOdt5uMxdZpgRQ-3DbbpC9yHqzUai2E",
  "access_expires_at": "2026-10-30T15:45:58.484999069Z",
  "refresh_token": "7xT4ljzIvrfvMNduDnjR-l9qtu0QNjEsTZlV6qWzGNg",
  "refresh_expires_at": "2026-11-29T15:30:58.484343448Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "7d363e6f-c0ad-49f4-aaa5-c213919d8f2a",
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
  "id": "152a9b9b-5a7f-4d7b-a7c1-86a1630209d7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:35:58.775079Z",
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
  "command_id": "7b497f0d-23b4-4334-9331-bb74d8efc387",
  "quote_id": "152a9b9b-5a7f-4d7b-a7c1-86a1630209d7",
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
  "id": "8074eeab-ad05-4177-9d3c-e64d101f026d",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "06539a38-cdd2-4980-953c-4d48eab8e9dd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:30:59.070683Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8074eeab-ad05-4177-9d3c-e64d101f026d` → **200**

```json
{
  "id": "8074eeab-ad05-4177-9d3c-e64d101f026d",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "06539a38-cdd2-4980-953c-4d48eab8e9dd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:30:59.070683Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8074eeab-ad05-4177-9d3c-e64d101f026d` → **200**

```json
{
  "id": "8074eeab-ad05-4177-9d3c-e64d101f026d",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "06539a38-cdd2-4980-953c-4d48eab8e9dd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:30:59.070683Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8074eeab-ad05-4177-9d3c-e64d101f026d` → **200**

```json
{
  "id": "8074eeab-ad05-4177-9d3c-e64d101f026d",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "06539a38-cdd2-4980-953c-4d48eab8e9dd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:30:59.070683Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8074eeab-ad05-4177-9d3c-e64d101f026d` → **200**

```json
{
  "id": "8074eeab-ad05-4177-9d3c-e64d101f026d",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "06539a38-cdd2-4980-953c-4d48eab8e9dd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:30:59.070683Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8074eeab-ad05-4177-9d3c-e64d101f026d` → **200**

```json
{
  "id": "8074eeab-ad05-4177-9d3c-e64d101f026d",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "06539a38-cdd2-4980-953c-4d48eab8e9dd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:30:59.070683Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8074eeab-ad05-4177-9d3c-e64d101f026d` → **200**

```json
{
  "id": "8074eeab-ad05-4177-9d3c-e64d101f026d",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "06539a38-cdd2-4980-953c-4d48eab8e9dd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:30:59.070683Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8074eeab-ad05-4177-9d3c-e64d101f026d` → **200**

```json
{
  "id": "8074eeab-ad05-4177-9d3c-e64d101f026d",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "06539a38-cdd2-4980-953c-4d48eab8e9dd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:30:59.070683Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8074eeab-ad05-4177-9d3c-e64d101f026d` → **200**

```json
{
  "id": "8074eeab-ad05-4177-9d3c-e64d101f026d",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "06539a38-cdd2-4980-953c-4d48eab8e9dd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:30:59.070683Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8074eeab-ad05-4177-9d3c-e64d101f026d` → **200**

```json
{
  "id": "8074eeab-ad05-4177-9d3c-e64d101f026d",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "06539a38-cdd2-4980-953c-4d48eab8e9dd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:30:59.070683Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8074eeab-ad05-4177-9d3c-e64d101f026d` → **200**

```json
{
  "id": "8074eeab-ad05-4177-9d3c-e64d101f026d",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "06539a38-cdd2-4980-953c-4d48eab8e9dd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:30:59.070683Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8074eeab-ad05-4177-9d3c-e64d101f026d` → **200**

```json
{
  "id": "8074eeab-ad05-4177-9d3c-e64d101f026d",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "06539a38-cdd2-4980-953c-4d48eab8e9dd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:30:59.070683Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8074eeab-ad05-4177-9d3c-e64d101f026d` → **200**

```json
{
  "id": "8074eeab-ad05-4177-9d3c-e64d101f026d",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "06539a38-cdd2-4980-953c-4d48eab8e9dd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:30:59.070683Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8074eeab-ad05-4177-9d3c-e64d101f026d` → **200**

```json
{
  "id": "8074eeab-ad05-4177-9d3c-e64d101f026d",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "06539a38-cdd2-4980-953c-4d48eab8e9dd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:30:59.070683Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8074eeab-ad05-4177-9d3c-e64d101f026d` → **200**

```json
{
  "id": "8074eeab-ad05-4177-9d3c-e64d101f026d",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "06539a38-cdd2-4980-953c-4d48eab8e9dd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:30:59.070683Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8074eeab-ad05-4177-9d3c-e64d101f026d` → **200**

```json
{
  "id": "8074eeab-ad05-4177-9d3c-e64d101f026d",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "06539a38-cdd2-4980-953c-4d48eab8e9dd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:30:59.070683Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8074eeab-ad05-4177-9d3c-e64d101f026d` → **200**

```json
{
  "id": "8074eeab-ad05-4177-9d3c-e64d101f026d",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "06539a38-cdd2-4980-953c-4d48eab8e9dd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:30:59.070683Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8074eeab-ad05-4177-9d3c-e64d101f026d` → **200**

```json
{
  "id": "8074eeab-ad05-4177-9d3c-e64d101f026d",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "06539a38-cdd2-4980-953c-4d48eab8e9dd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:30:59.070683Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8074eeab-ad05-4177-9d3c-e64d101f026d` → **200**

```json
{
  "id": "8074eeab-ad05-4177-9d3c-e64d101f026d",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "06539a38-cdd2-4980-953c-4d48eab8e9dd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:30:59.070683Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8074eeab-ad05-4177-9d3c-e64d101f026d` → **200**

```json
{
  "id": "8074eeab-ad05-4177-9d3c-e64d101f026d",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "06539a38-cdd2-4980-953c-4d48eab8e9dd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:30:59.070683Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8074eeab-ad05-4177-9d3c-e64d101f026d` → **200**

```json
{
  "id": "8074eeab-ad05-4177-9d3c-e64d101f026d",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "06539a38-cdd2-4980-953c-4d48eab8e9dd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:30:59.070683Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8074eeab-ad05-4177-9d3c-e64d101f026d` → **200**

```json
{
  "id": "8074eeab-ad05-4177-9d3c-e64d101f026d",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "06539a38-cdd2-4980-953c-4d48eab8e9dd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:30:59.070683Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8074eeab-ad05-4177-9d3c-e64d101f026d` → **200**

```json
{
  "id": "8074eeab-ad05-4177-9d3c-e64d101f026d",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "06539a38-cdd2-4980-953c-4d48eab8e9dd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:30:59.070683Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8074eeab-ad05-4177-9d3c-e64d101f026d` → **200**

```json
{
  "id": "8074eeab-ad05-4177-9d3c-e64d101f026d",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "06539a38-cdd2-4980-953c-4d48eab8e9dd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:30:59.070683Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8074eeab-ad05-4177-9d3c-e64d101f026d` → **200**

```json
{
  "id": "8074eeab-ad05-4177-9d3c-e64d101f026d",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "06539a38-cdd2-4980-953c-4d48eab8e9dd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:30:59.070683Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8074eeab-ad05-4177-9d3c-e64d101f026d` → **200**

```json
{
  "id": "8074eeab-ad05-4177-9d3c-e64d101f026d",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "06539a38-cdd2-4980-953c-4d48eab8e9dd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:30:59.070683Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8074eeab-ad05-4177-9d3c-e64d101f026d` → **200**

```json
{
  "id": "8074eeab-ad05-4177-9d3c-e64d101f026d",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "06539a38-cdd2-4980-953c-4d48eab8e9dd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:30:59.070683Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8074eeab-ad05-4177-9d3c-e64d101f026d` → **200**

```json
{
  "id": "8074eeab-ad05-4177-9d3c-e64d101f026d",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "06539a38-cdd2-4980-953c-4d48eab8e9dd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:30:59.070683Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8074eeab-ad05-4177-9d3c-e64d101f026d` → **200**

```json
{
  "id": "8074eeab-ad05-4177-9d3c-e64d101f026d",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "06539a38-cdd2-4980-953c-4d48eab8e9dd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:30:59.070683Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8074eeab-ad05-4177-9d3c-e64d101f026d` → **200**

```json
{
  "id": "8074eeab-ad05-4177-9d3c-e64d101f026d",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "06539a38-cdd2-4980-953c-4d48eab8e9dd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:30:59.070683Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8074eeab-ad05-4177-9d3c-e64d101f026d` → **200**

```json
{
  "id": "8074eeab-ad05-4177-9d3c-e64d101f026d",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "06539a38-cdd2-4980-953c-4d48eab8e9dd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:30:59.070683Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8074eeab-ad05-4177-9d3c-e64d101f026d` → **200**

```json
{
  "id": "8074eeab-ad05-4177-9d3c-e64d101f026d",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "06539a38-cdd2-4980-953c-4d48eab8e9dd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:30:59.070683Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8074eeab-ad05-4177-9d3c-e64d101f026d` → **200**

```json
{
  "id": "8074eeab-ad05-4177-9d3c-e64d101f026d",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "06539a38-cdd2-4980-953c-4d48eab8e9dd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:30:59.070683Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8074eeab-ad05-4177-9d3c-e64d101f026d` → **200**

```json
{
  "id": "8074eeab-ad05-4177-9d3c-e64d101f026d",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "06539a38-cdd2-4980-953c-4d48eab8e9dd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:30:59.070683Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8074eeab-ad05-4177-9d3c-e64d101f026d` → **200**

```json
{
  "id": "8074eeab-ad05-4177-9d3c-e64d101f026d",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "06539a38-cdd2-4980-953c-4d48eab8e9dd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:30:59.070683Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8074eeab-ad05-4177-9d3c-e64d101f026d` → **200**

```json
{
  "id": "8074eeab-ad05-4177-9d3c-e64d101f026d",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "06539a38-cdd2-4980-953c-4d48eab8e9dd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:30:59.070683Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8074eeab-ad05-4177-9d3c-e64d101f026d` → **200**

```json
{
  "id": "8074eeab-ad05-4177-9d3c-e64d101f026d",
  "short_number": 29,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "06539a38-cdd2-4980-953c-4d48eab8e9dd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T15:30:59.070683Z",
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
  "blizz_orders_total": 29,
  "blizz_orders_cancelled_total": 15,
  "blizz_orders_unfulfilled_total": 1,
  "blizz_dispatch_first_offer_seconds_count": 18,
  "blizz_dispatch_assigned_seconds_count": 18,
  "blizz_offers_total": 20,
  "blizz_dispatch_excluded_total": 12,
  "blizz_sms_sent_total": 81
}

```prometheus
blizz_dispatch_assigned_seconds_count{application="blizz-taxi-server",source="BROADCAST"} 1
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="BROADCAST"} 11.83625749
blizz_dispatch_assigned_seconds_count{application="blizz-taxi-server",source="OFFER"} 17
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="OFFER"} 15.477886569
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="BROADCAST"} 0.0
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="OFFER"} 0.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="ALREADY_OFFERED"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="BUSY"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PAYMENT"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PREVIOUS_DRIVER"} 2.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="STALE_LOCATION"} 6.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="TOO_FAR"} 1.0
blizz_dispatch_first_offer_seconds_count{application="blizz-taxi-server"} 18
blizz_dispatch_first_offer_seconds_sum{application="blizz-taxi-server"} 0.35120281
blizz_dispatch_first_offer_seconds_max{application="blizz-taxi-server"} 0.0
blizz_offers_total{application="blizz-taxi-server",outcome="ACCEPTED"} 17.0
blizz_offers_total{application="blizz-taxi-server",outcome="DECLINED"} 1.0
blizz_offers_total{application="blizz-taxi-server",outcome="REVOKED"} 2.0
blizz_orders_total{application="blizz-taxi-server",channel="APP",preorder="false"} 21.0
blizz_orders_total{application="blizz-taxi-server",channel="APP",preorder="true"} 2.0
blizz_orders_total{application="blizz-taxi-server",channel="PHONE",preorder="false"} 6.0
blizz_orders_cancelled_total{application="blizz-taxi-server",by="DRIVER",reason="PASSENGER_ASKED"} 2.0
blizz_orders_cancelled_total{application="blizz-taxi-server",by="RIDER",reason="CHANGED_MIND"} 7.0
blizz_orders_cancelled_total{application="blizz-taxi-server",by="RIDER",reason="WAIT_TOO_LONG"} 1.0
blizz_orders_cancelled_total{application="blizz-taxi-server",by="STAFF",reason="NO_CARS"} 3.0
blizz_orders_cancelled_total{application="blizz-taxi-server",by="STAFF",reason="OTHER"} 2.0
blizz_orders_unfulfilled_total{application="blizz-taxi-server"} 1.0
blizz_sms_sent_total{application="blizz-taxi-server",purpose="CALLER",state="SENT"} 6.0
blizz_sms_sent_total{application="blizz-taxi-server",purpose="OTP",state="FAILED"} 1.0
blizz_sms_sent_total{application="blizz-taxi-server",purpose="OTP",state="SENT"} 74.0
```

Done: real no-car deadline, non-zero counters/timers and bounded labels on the management port.

`GET /api/rider/v1/orders/8074eeab-ad05-4177-9d3c-e64d101f026d` → **200**

```json
{
  "id": "8074eeab-ad05-4177-9d3c-e64d101f026d",
  "short_number": 29,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "06539a38-cdd2-4980-953c-4d48eab8e9dd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T15:30:59.070683Z",
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
  "session_id": "f23ad964-13e2-4799-8597-f86d41de5c44",
  "subject": {
    "type": "STAFF",
    "id": "04f20d10-faa2-4386-bfcf-0d466abe8fa8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNGYyMGQxMC1mYWEyLTQzODYtYmZjZi0wZDQ2NmFiZThmYTgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzUzNDYsImlhdCI6MTc5MzM3NDQ0NiwianRpIjoiMGMyNWNlNTctNjdmMy00N2U0LWExZDQtMDc0MWQwZGRiNGI2Iiwic2lkIjoiZjIzYWQ5NjQtMTNlMi00Nzk5LTg1OTctZjg2ZDQxZGU1YzQ0In0.lhfp-hmIJRrkDwVJbL0bwTCGbEvZfHaN5fDVUwHQkKI",
  "access_expires_at": "2026-10-30T15:49:06.211761272Z",
  "refresh_token": "c7OZKnzXelr12xwDz9MRtNOK3TUNVOvbHlkfUjLc2K8",
  "refresh_expires_at": "2026-10-31T03:34:06.210913321Z",
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
  "id": "c6990a07-f040-4d9b-ba7f-cc91f51dc58e",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T15:34:06.514123Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T15:34:06.514156Z",
  "updated_at": "2026-10-30T15:34:06.531009Z",
  "finished_at": "2026-10-30T15:34:06.531009Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/c6990a07-f040-4d9b-ba7f-cc91f51dc58e` → **200**

```json
{
  "run": {
    "id": "c6990a07-f040-4d9b-ba7f-cc91f51dc58e",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T15:34:06.514123Z",
    "partial": true,
    "state": "CLEAN",
    "local_count": 10,
    "provider_count": 10,
    "item_count": 0,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T15:34:06.514156Z",
    "updated_at": "2026-10-30T15:34:06.531009Z",
    "finished_at": "2026-10-30T15:34:06.531009Z",
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
  "id": "c6990a07-f040-4d9b-ba7f-cc91f51dc58e",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T15:34:06.514123Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T15:34:06.514156Z",
  "updated_at": "2026-10-30T15:34:06.531009Z",
  "finished_at": "2026-10-30T15:34:06.531009Z",
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
  "id": "c6990a07-f040-4d9b-ba7f-cc91f51dc58e",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T15:34:06.514123Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T15:34:06.514156Z",
  "updated_at": "2026-10-30T15:34:06.531009Z",
  "finished_at": "2026-10-30T15:34:06.531009Z",
  "version": 1
}
```

## One independent bank transaction produces one missing-local item on another merchant's first snapshot

`POST /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/3f11304d-f5f6-4b21-ad3c-c00df7555346` → **204**

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
  "id": "97691c10-9182-46e6-a44a-1ac37d03747a",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T15:34:06.963997Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T15:34:06.964031Z",
  "updated_at": "2026-10-30T15:34:06.971899Z",
  "finished_at": "2026-10-30T15:34:06.971899Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/97691c10-9182-46e6-a44a-1ac37d03747a` → **200**

```json
{
  "run": {
    "id": "97691c10-9182-46e6-a44a-1ac37d03747a",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T15:34:06.963997Z",
    "partial": true,
    "state": "OPEN",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 1,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T15:34:06.964031Z",
    "updated_at": "2026-10-30T15:34:06.971899Z",
    "finished_at": "2026-10-30T15:34:06.971899Z",
    "version": 1
  },
  "items": [
    {
      "id": "68414929-f6f8-42bb-8dcb-4c46b82119cf",
      "run_id": "97691c10-9182-46e6-a44a-1ac37d03747a",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "ebc3848b55530a7ed4390bddf26f8e5aab49ca541a5b9fe85c2c416eb25211d2",
      "reference_display": "sandbox-reconciliation-3f#####d-f5f6-4b21-ad3c-c00df#####",
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
      "provider_at": "2026-10-30T15:34:06Z",
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
  "id": "97691c10-9182-46e6-a44a-1ac37d03747a",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T15:34:06.963997Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T15:34:06.964031Z",
  "updated_at": "2026-10-30T15:34:06.971899Z",
  "finished_at": "2026-10-30T15:34:06.971899Z",
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
  "id": "97691c10-9182-46e6-a44a-1ac37d03747a",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T15:34:06.963997Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T15:34:06.964031Z",
  "updated_at": "2026-10-30T15:34:06.971899Z",
  "finished_at": "2026-10-30T15:34:06.971899Z",
  "version": 1
}
```

## The admin explains the item once; a replay is the same result and a different decision conflicts

`POST /api/admin/v1/payment-reconciliations/items/68414929-f6f8-42bb-8dcb-4c46b82119cf/resolve` → **200**

```json
{
  "command_id": "f1ec96d7-2e54-49bd-bbe4-7bcad81eef0f",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "68414929-f6f8-42bb-8dcb-4c46b82119cf",
  "run_id": "97691c10-9182-46e6-a44a-1ac37d03747a",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "ebc3848b55530a7ed4390bddf26f8e5aab49ca541a5b9fe85c2c416eb25211d2",
  "reference_display": "sandbox-reconciliation-3f#####d-f5f6-4b21-ad3c-c00df#####",
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
  "provider_at": "2026-10-30T15:34:06Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "04f20d10-faa2-4386-bfcf-0d466abe8fa8",
  "resolved_at": "2026-10-30T15:34:07.395721Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/68414929-f6f8-42bb-8dcb-4c46b82119cf/resolve` → **200**

```json
{
  "command_id": "f1ec96d7-2e54-49bd-bbe4-7bcad81eef0f",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "68414929-f6f8-42bb-8dcb-4c46b82119cf",
  "run_id": "97691c10-9182-46e6-a44a-1ac37d03747a",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "ebc3848b55530a7ed4390bddf26f8e5aab49ca541a5b9fe85c2c416eb25211d2",
  "reference_display": "sandbox-reconciliation-3f#####d-f5f6-4b21-ad3c-c00df#####",
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
  "provider_at": "2026-10-30T15:34:06Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "04f20d10-faa2-4386-bfcf-0d466abe8fa8",
  "resolved_at": "2026-10-30T15:34:07.395721Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/68414929-f6f8-42bb-8dcb-4c46b82119cf/resolve` → **409**

```json
{
  "command_id": "8e18cbac-f6c8-4796-96b7-e7ac4ecd75c3",
  "expected_version": 1,
  "decision": "ESCALATED",
  "reason": "A conflicting second decision"
}
```

```json
{
  "instance": "/api/admin/v1/payment-reconciliations/items/68414929-f6f8-42bb-8dcb-4c46b82119cf/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "b8f9649b-7392-4e21-b651-3d69ed4cd2dd"
}
```

`GET /api/admin/v1/payment-reconciliations/97691c10-9182-46e6-a44a-1ac37d03747a` → **200**

```json
{
  "run": {
    "id": "97691c10-9182-46e6-a44a-1ac37d03747a",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T15:34:06.963997Z",
    "partial": true,
    "state": "RESOLVED",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T15:34:06.964031Z",
    "updated_at": "2026-10-30T15:34:07.395721Z",
    "finished_at": "2026-10-30T15:34:06.971899Z",
    "version": 2
  },
  "items": [
    {
      "id": "68414929-f6f8-42bb-8dcb-4c46b82119cf",
      "run_id": "97691c10-9182-46e6-a44a-1ac37d03747a",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "ebc3848b55530a7ed4390bddf26f8e5aab49ca541a5b9fe85c2c416eb25211d2",
      "reference_display": "sandbox-reconciliation-3f#####d-f5f6-4b21-ad3c-c00df#####",
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
      "provider_at": "2026-10-30T15:34:06Z",
      "state": "RESOLVED",
      "decision": "EXPLAINED",
      "reason": "Independent sandbox bank fixture; no real money moved",
      "resolved_by": "04f20d10-faa2-4386-bfcf-0d466abe8fa8",
      "resolved_at": "2026-10-30T15:34:07.395721Z",
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
      "id": "97691c10-9182-46e6-a44a-1ac37d03747a",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-30",
      "period_from": "2026-10-29T22:00:00Z",
      "period_to": "2026-10-31T02:00:00Z",
      "observed_until": "2026-10-30T15:34:06.963997Z",
      "partial": true,
      "state": "RESOLVED",
      "local_count": 0,
      "provider_count": 1,
      "item_count": 1,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-30T15:34:06.964031Z",
      "updated_at": "2026-10-30T15:34:07.395721Z",
      "finished_at": "2026-10-30T15:34:06.971899Z",
      "version": 2
    },
    {
      "id": "e9669f9e-d6da-499a-b835-2462d328695e",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-29",
      "period_from": "2026-10-28T22:00:00Z",
      "period_to": "2026-10-30T02:00:00Z",
      "observed_until": "2026-10-30T15:14:31.410133Z",
      "partial": false,
      "state": "CLEAN",
      "local_count": 0,
      "provider_count": 0,
      "item_count": 0,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-30T15:14:31.410252Z",
      "updated_at": "2026-10-30T15:14:31.417422Z",
      "finished_at": "2026-10-30T15:14:31.417422Z",
      "version": 1
    }
  ],
  "next_cursor": null
}
```

`DELETE /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/3f11304d-f5f6-4b21-ad3c-c00df7555346` → **204**

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30"
}
```

```json
{
  "id": "97691c10-9182-46e6-a44a-1ac37d03747a",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T15:34:06.963997Z",
  "partial": true,
  "state": "RESOLVED",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T15:34:06.964031Z",
  "updated_at": "2026-10-30T15:34:07.395721Z",
  "finished_at": "2026-10-30T15:34:06.971899Z",
  "version": 2
}
```

Done: clean card snapshot, one bank-only difference, three identical runs, audited decision/replay/conflict, bank fixture restored.

# Scenario: zzz-invariants

## Five invariant checks are clean after all scenario transactions settle

```prometheus
blizz_invariant_last_success{application="blizz-taxi-server",check="I1"} 1.793374571801E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I2"} 1.793374572242E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I3"} 1.793374572243E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I4"} 1.793374571801E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I5"} 1.793374572243E9
blizz_invariant_violations{application="blizz-taxi-server",check="I1"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I2"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I3"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I4"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I5"} 0.0
```

Done: five fresh zero invariant gauges after the settling margin.
